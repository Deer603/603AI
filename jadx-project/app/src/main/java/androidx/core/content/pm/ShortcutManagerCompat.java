package androidx.core.content.pm;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.util.Preconditions;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class ShortcutManagerCompat {
    static final String ACTION_INSTALL_SHORTCUT = "com.android.launcher.action.INSTALL_SHORTCUT";
    private static final int DEFAULT_MAX_ICON_DIMENSION_DP = 96;
    private static final int DEFAULT_MAX_ICON_DIMENSION_LOWRAM_DP = 48;
    public static final String EXTRA_SHORTCUT_ID = "android.intent.extra.shortcut.ID";
    public static final int FLAG_MATCH_CACHED = 8;
    public static final int FLAG_MATCH_DYNAMIC = 2;
    public static final int FLAG_MATCH_MANIFEST = 1;
    public static final int FLAG_MATCH_PINNED = 4;
    static final String INSTALL_SHORTCUT_PERMISSION = "com.android.launcher.permission.INSTALL_SHORTCUT";
    private static final String SHORTCUT_LISTENER_INTENT_FILTER_ACTION = "androidx.core.content.pm.SHORTCUT_LISTENER";
    private static final String SHORTCUT_LISTENER_META_DATA_KEY = "androidx.core.content.pm.shortcut_listener_impl";
    private static volatile List<ShortcutInfoChangeListener> sShortcutInfoChangeListeners;
    private static volatile ShortcutInfoCompatSaver<?> sShortcutInfoCompatSaver;

    /* JADX INFO: renamed from: androidx.core.content.pm.ShortcutManagerCompat$1, reason: invalid class name */
    class AnonymousClass1 extends BroadcastReceiver {
        final /* synthetic */ IntentSender val$callback;

        AnonymousClass1(IntentSender r1) {
            this.val$callback = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            this.val$callback.sendIntent(context, 0, null, null, null);     // Catch: IntentSender.SendIntentException -> L6
            return;
        L16:
            return;
        }
    }

    private static class Api25Impl {
        private Api25Impl() {
        }

        static String getShortcutInfoWithLowestRank(List<ShortcutInfo> shortcuts) {
            int rank = -1;
            String target = null;
            Iterator<ShortcutInfo> r2 = shortcuts.iterator();
        L4:
            if (r2.hasNext() == false) goto L9;
            ShortcutInfo s = r2.next();
            if (s.getRank() <= rank) goto L4;
            target = s.getId();
            rank = s.getRank();
            goto L4
        L9:
            return target;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ShortcutMatchFlags {
    }

    static {
        sShortcutInfoCompatSaver = null;
        sShortcutInfoChangeListeners = null;
    }

    private ShortcutManagerCompat() {
    }

    public static boolean isRequestPinShortcutSupported(Context context) {
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).isRequestPinShortcutSupported();
    }

    public static boolean requestPinShortcut(Context context, ShortcutInfoCompat shortcut, IntentSender callback) {
        if (Build.VERSION.SDK_INT > 32) goto L9;
        if (shortcut.isExcludedFromSurfaces(1) == false) goto L9;
        return false;
    L9:
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).requestPinShortcut(shortcut.toShortcutInfo(), callback);
    }

    public static Intent createShortcutResultIntent(Context context, ShortcutInfoCompat shortcut) {
        Intent result = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).createShortcutResultIntent(shortcut.toShortcutInfo());
        if (result != null) goto L6;
        result = new Intent();
    L6:
        return shortcut.addToIntent(result);
    }

    public static List<ShortcutInfoCompat> getShortcuts(Context context, int matchFlags) {
        if (Build.VERSION.SDK_INT >= 30) goto L5;
        ShortcutManager manager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        List<ShortcutInfo> shortcuts = new ArrayList();
        if ((matchFlags & 1) == 0) goto L10;
        shortcuts.addAll(manager.getManifestShortcuts());
    L10:
        if ((matchFlags & 2) == 0) goto L13;
        shortcuts.addAll(manager.getDynamicShortcuts());
    L13:
        if ((matchFlags & 4) == 0) goto L16;
        shortcuts.addAll(manager.getPinnedShortcuts());
    L16:
        return ShortcutInfoCompat.fromShortcuts(context, shortcuts);
    L5:
        return ShortcutInfoCompat.fromShortcuts(context, ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getShortcuts(matchFlags));
    }

    public static boolean addDynamicShortcuts(Context context, List<ShortcutInfoCompat> shortcutInfoList) {
        List<ShortcutInfoCompat> clone = removeShortcutsExcludedFromSurface(shortcutInfoList, 1);
        if (Build.VERSION.SDK_INT > 29) goto L5;
        convertUriIconsToBitmapIcons(context, clone);
    L5:
        ArrayList<ShortcutInfo> shortcuts = new ArrayList();
        Iterator<ShortcutInfoCompat> r3 = clone.iterator();
    L7:
        if (r3.hasNext() == false) goto L10;
        ShortcutInfoCompat item = r3.next();
        shortcuts.add(item.toShortcutInfo());
        goto L7
    L10:
        if (((ShortcutManager) context.getSystemService(ShortcutManager.class)).addDynamicShortcuts(shortcuts) == true) goto L13;
        return false;
    L13:
        getShortcutInfoSaverInstance(context).addShortcuts(clone);
        Iterator<ShortcutInfoChangeListener> r2 = getShortcutInfoListeners(context).iterator();
    L15:
        if (r2.hasNext() == false) goto L17;
        ShortcutInfoChangeListener listener = r2.next();
        listener.onShortcutAdded(shortcutInfoList);
        goto L15
    L17:
        return true;
    }

    public static int getMaxShortcutCountPerActivity(Context context) {
        Preconditions.checkNotNull(context);
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
    }

    public static boolean isRateLimitingActive(Context context) {
        Preconditions.checkNotNull(context);
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).isRateLimitingActive();
    }

    public static int getIconMaxWidth(Context context) {
        Preconditions.checkNotNull(context);
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getIconMaxWidth();
    }

    public static int getIconMaxHeight(Context context) {
        Preconditions.checkNotNull(context);
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getIconMaxHeight();
    }

    public static void reportShortcutUsed(Context context, String shortcutId) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(shortcutId);
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).reportShortcutUsed(shortcutId);
        Iterator<ShortcutInfoChangeListener> r0 = getShortcutInfoListeners(context).iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        ShortcutInfoChangeListener listener = r0.next();
        listener.onShortcutUsageReported(Collections.singletonList(shortcutId));
        goto L4
    }

    public static boolean setDynamicShortcuts(Context context, List<ShortcutInfoCompat> shortcutInfoList) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(shortcutInfoList);
        List<ShortcutInfoCompat> clone = removeShortcutsExcludedFromSurface(shortcutInfoList, 1);
        List<ShortcutInfo> shortcuts = new ArrayList(clone.size());
        Iterator<ShortcutInfoCompat> r3 = clone.iterator();
    L4:
        if (r3.hasNext() == false) goto L7;
        ShortcutInfoCompat compat = r3.next();
        shortcuts.add(compat.toShortcutInfo());
        goto L4
    L7:
        if (((ShortcutManager) context.getSystemService(ShortcutManager.class)).setDynamicShortcuts(shortcuts) == true) goto L10;
        return false;
    L10:
        getShortcutInfoSaverInstance(context).removeAllShortcuts();
        getShortcutInfoSaverInstance(context).addShortcuts(clone);
        Iterator<ShortcutInfoChangeListener> r2 = getShortcutInfoListeners(context).iterator();
    L12:
        if (r2.hasNext() == false) goto L14;
        ShortcutInfoChangeListener listener = r2.next();
        listener.onAllShortcutsRemoved();
        listener.onShortcutAdded(shortcutInfoList);
        goto L12
    L14:
        return true;
    }

    public static List<ShortcutInfoCompat> getDynamicShortcuts(Context context) {
        List<ShortcutInfo> shortcuts = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getDynamicShortcuts();
        List<ShortcutInfoCompat> compats = new ArrayList(shortcuts.size());
        Iterator<ShortcutInfo> r2 = shortcuts.iterator();
    L4:
        if (r2.hasNext() == false) goto L6;
        ShortcutInfo item = r2.next();
        compats.add(new ShortcutInfoCompat.Builder(context, item).build());
        goto L4
    L6:
        return compats;
    }

    public static boolean updateShortcuts(Context context, List<ShortcutInfoCompat> shortcutInfoList) {
        List<ShortcutInfoCompat> clone = removeShortcutsExcludedFromSurface(shortcutInfoList, 1);
        if (Build.VERSION.SDK_INT > 29) goto L5;
        convertUriIconsToBitmapIcons(context, clone);
    L5:
        ArrayList<ShortcutInfo> shortcuts = new ArrayList();
        Iterator<ShortcutInfoCompat> r3 = clone.iterator();
    L7:
        if (r3.hasNext() == false) goto L10;
        ShortcutInfoCompat item = r3.next();
        shortcuts.add(item.toShortcutInfo());
        goto L7
    L10:
        if (((ShortcutManager) context.getSystemService(ShortcutManager.class)).updateShortcuts(shortcuts) == true) goto L13;
        return false;
    L13:
        getShortcutInfoSaverInstance(context).addShortcuts(clone);
        Iterator<ShortcutInfoChangeListener> r2 = getShortcutInfoListeners(context).iterator();
    L15:
        if (r2.hasNext() == false) goto L17;
        ShortcutInfoChangeListener listener = r2.next();
        listener.onShortcutUpdated(shortcutInfoList);
        goto L15
    L17:
        return true;
    }

    static boolean convertUriIconToBitmapIcon(Context context, ShortcutInfoCompat info) {
        if (info.mIcon != null) goto L5;
        return false;
    L5:
        int type = info.mIcon.mType;
        if (type != 6) goto L8;
    L10:
        InputStream is = info.mIcon.getUriInputStream(context);
        if (is != null) goto L13;
        return false;
    L13:
        Bitmap bitmap = BitmapFactory.decodeStream(is);
        if (bitmap != null) goto L16;
        return false;
    L16:
        if (type != 6) goto L18;
        IconCompat r1 = IconCompat.createWithAdaptiveBitmap(bitmap);
    L19:
        info.mIcon = r1;
        return true;
    L18:
        r1 = IconCompat.createWithBitmap(bitmap);
        goto L19
    L8:
        if (type == 4) goto L10;
        return true;
    }

    static void convertUriIconsToBitmapIcons(Context context, List<ShortcutInfoCompat> shortcutInfoList) {
        List<ShortcutInfoCompat> shortcuts = new ArrayList(shortcutInfoList);
        Iterator<ShortcutInfoCompat> r1 = shortcuts.iterator();
    L4:
        if (r1.hasNext() == false) goto L9;
        ShortcutInfoCompat info = r1.next();
        if (convertUriIconToBitmapIcon(context, info) == true) goto L4;
        shortcutInfoList.remove(info);
        goto L4
    }

    public static void disableShortcuts(Context context, List<String> shortcutIds, CharSequence disabledMessage) {
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).disableShortcuts(shortcutIds, disabledMessage);
        getShortcutInfoSaverInstance(context).removeShortcuts(shortcutIds);
        Iterator<ShortcutInfoChangeListener> r0 = getShortcutInfoListeners(context).iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        ShortcutInfoChangeListener listener = r0.next();
        listener.onShortcutRemoved(shortcutIds);
        goto L4
    }

    public static void enableShortcuts(Context context, List<ShortcutInfoCompat> shortcutInfoList) {
        List<ShortcutInfoCompat> clone = removeShortcutsExcludedFromSurface(shortcutInfoList, 1);
        ArrayList<String> shortcutIds = new ArrayList(shortcutInfoList.size());
        Iterator<ShortcutInfoCompat> r2 = clone.iterator();
    L4:
        if (r2.hasNext() == false) goto L6;
        ShortcutInfoCompat shortcut = r2.next();
        shortcutIds.add(shortcut.mId);
        goto L4
    L6:
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).enableShortcuts(shortcutIds);
        getShortcutInfoSaverInstance(context).addShortcuts(clone);
        Iterator<ShortcutInfoChangeListener> r1 = getShortcutInfoListeners(context).iterator();
    L8:
        if (r1.hasNext() == false) goto L10;
        ShortcutInfoChangeListener listener = r1.next();
        listener.onShortcutAdded(shortcutInfoList);
        goto L8
    }

    public static void removeDynamicShortcuts(Context context, List<String> shortcutIds) {
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(shortcutIds);
        getShortcutInfoSaverInstance(context).removeShortcuts(shortcutIds);
        Iterator<ShortcutInfoChangeListener> r0 = getShortcutInfoListeners(context).iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        ShortcutInfoChangeListener listener = r0.next();
        listener.onShortcutRemoved(shortcutIds);
        goto L4
    }

    public static void removeAllDynamicShortcuts(Context context) {
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
        getShortcutInfoSaverInstance(context).removeAllShortcuts();
        Iterator<ShortcutInfoChangeListener> r0 = getShortcutInfoListeners(context).iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        ShortcutInfoChangeListener listener = r0.next();
        listener.onAllShortcutsRemoved();
        goto L4
    }

    public static void removeLongLivedShortcuts(Context context, List<String> shortcutIds) {
        if (Build.VERSION.SDK_INT >= 30) goto L6;
        removeDynamicShortcuts(context, shortcutIds);
        return;
    L6:
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeLongLivedShortcuts(shortcutIds);
        getShortcutInfoSaverInstance(context).removeShortcuts(shortcutIds);
        Iterator<ShortcutInfoChangeListener> r0 = getShortcutInfoListeners(context).iterator();
    L8:
        if (r0.hasNext() == false) goto L10;
        ShortcutInfoChangeListener listener = r0.next();
        listener.onShortcutRemoved(shortcutIds);
        goto L8
    }

    public static boolean pushDynamicShortcut(Context context, ShortcutInfoCompat shortcut) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(shortcut);
        if (Build.VERSION.SDK_INT <= 32) goto L5;
    L11:
        int maxShortcutCount = getMaxShortcutCountPerActivity(context);
        if (maxShortcutCount != 0) goto L15;
        return false;
    L15:
        if (Build.VERSION.SDK_INT > 29) goto L18;
        convertUriIconToBitmapIcon(context, shortcut);
    L18:
        if (Build.VERSION.SDK_INT < 30) goto L20;
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).pushDynamicShortcut(shortcut.toShortcutInfo());
    L27:
        ShortcutInfoCompatSaver<?> saver = getShortcutInfoSaverInstance(context);
        List<ShortcutInfoCompat> oldShortcuts = saver.getShortcuts();     // Catch: Throwable -> L38 Exception -> L45
        if (oldShortcuts.size() < maxShortcutCount) goto L31;
        saver.removeShortcuts(Arrays.asList(new String[]{getShortcutInfoCompatWithLowestRank(oldShortcuts)}));     // Catch: Throwable -> L38 Exception -> L45
    L31:
        saver.addShortcuts(Arrays.asList(new ShortcutInfoCompat[]{shortcut}));     // Catch: Throwable -> L38 Exception -> L45
        Iterator<ShortcutInfoChangeListener> r1 = getShortcutInfoListeners(context).iterator();
    L34:
        if (r1.hasNext() == false) goto L36;
        ShortcutInfoChangeListener listener = r1.next();
        listener.onShortcutAdded(Collections.singletonList(shortcut));
        goto L34
    L36:
        reportShortcutUsed(context, shortcut.getId());
        return true;
    L38:
        th = move-exception;
        Iterator<ShortcutInfoChangeListener> r2 = getShortcutInfoListeners(context).iterator();
    L41:
        if (r2.hasNext() == false) goto L43;
        ShortcutInfoChangeListener listener2 = r2.next();
        listener2.onShortcutAdded(Collections.singletonList(shortcut));
        goto L41
    L43:
        reportShortcutUsed(context, shortcut.getId());
        throw th;
    L46:
        Iterator<ShortcutInfoChangeListener> r3 = getShortcutInfoListeners(context).iterator();
    L48:
        if (r3.hasNext() == false) goto L50;
        ShortcutInfoChangeListener listener3 = r3.next();
        listener3.onShortcutAdded(Collections.singletonList(shortcut));
        goto L48
    L50:
        reportShortcutUsed(context, shortcut.getId());
        return false;
    L20:
        ShortcutManager sm = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        if (sm.isRateLimitingActive() == false) goto L23;
        return false;
    L23:
        List<ShortcutInfo> shortcuts = sm.getDynamicShortcuts();
        if (shortcuts.size() < maxShortcutCount) goto L26;
        sm.removeDynamicShortcuts(Arrays.asList(new String[]{Api25Impl.getShortcutInfoWithLowestRank(shortcuts)}));
    L26:
        sm.addDynamicShortcuts(Arrays.asList(new ShortcutInfo[]{shortcut.toShortcutInfo()}));
        goto L27
    L5:
        if (shortcut.isExcludedFromSurfaces(1) == false) goto L11;
        Iterator<ShortcutInfoChangeListener> r0 = getShortcutInfoListeners(context).iterator();
    L8:
        if (r0.hasNext() == false) goto L10;
        ShortcutInfoChangeListener listener4 = r0.next();
        listener4.onShortcutAdded(Collections.singletonList(shortcut));
        goto L8
    L10:
        return true;
    }

    private static String getShortcutInfoCompatWithLowestRank(List<ShortcutInfoCompat> shortcuts) {
        int rank = -1;
        String target = null;
        Iterator<ShortcutInfoCompat> r2 = shortcuts.iterator();
    L4:
        if (r2.hasNext() == false) goto L9;
        ShortcutInfoCompat s = r2.next();
        if (s.getRank() <= rank) goto L4;
        target = s.getId();
        rank = s.getRank();
        goto L4
    L9:
        return target;
    }

    static void setShortcutInfoCompatSaver(ShortcutInfoCompatSaver<Void> saver) {
        sShortcutInfoCompatSaver = saver;
    }

    static void setShortcutInfoChangeListeners(List<ShortcutInfoChangeListener> listeners) {
        sShortcutInfoChangeListeners = listeners;
    }

    static List<ShortcutInfoChangeListener> getShortcutInfoChangeListeners() {
        return sShortcutInfoChangeListeners;
    }

    private static int getIconDimensionInternal(Context context, boolean isHorizontal) {
        ActivityManager am = (ActivityManager) context.getSystemService("activity");
        if (am != null) goto L5;
    L8:
        boolean isLowRamDevice = true;
    L9:
        if (isLowRamDevice == false) goto L11;
        int r3 = DEFAULT_MAX_ICON_DIMENSION_LOWRAM_DP;
    L12:
        int iconDimensionDp = Math.max(1, r3);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (isHorizontal == false) goto L15;
        float r4 = displayMetrics.xdpi;
    L16:
        float density = r4 / 160.0f;
        return (int) (iconDimensionDp * density);
    L15:
        r4 = displayMetrics.ydpi;
        goto L16
    L11:
        r3 = DEFAULT_MAX_ICON_DIMENSION_DP;
        goto L12
    L5:
        if (am.isLowRamDevice() == true) goto L8;
        isLowRamDevice = false;
        goto L9
    }

    private static ShortcutInfoCompatSaver<?> getShortcutInfoSaverInstance(Context context) {
        if (sShortcutInfoCompatSaver != null) goto L11;
        ClassLoader loader = ShortcutManagerCompat.class.getClassLoader();     // Catch: Exception -> L6
        Class<?> saver = Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, loader);     // Catch: Exception -> L6
        Method getInstanceMethod = saver.getMethod("getInstance", new Class[]{Context.class});     // Catch: Exception -> L6
        sShortcutInfoCompatSaver = (ShortcutInfoCompatSaver) getInstanceMethod.invoke(null, new Object[]{context});     // Catch: Exception -> L6
    L8:
        if (sShortcutInfoCompatSaver != null) goto L11;
        sShortcutInfoCompatSaver = new ShortcutInfoCompatSaver.NoopImpl();
    L11:
        return sShortcutInfoCompatSaver;
    }

    private static List<ShortcutInfoChangeListener> getShortcutInfoListeners(Context context) {
        if (sShortcutInfoChangeListeners != null) goto L24;
        List<ShortcutInfoChangeListener> result = new ArrayList();
        PackageManager packageManager = context.getPackageManager();
        Intent activityIntent = new Intent(SHORTCUT_LISTENER_INTENT_FILTER_ACTION);
        activityIntent.setPackage(context.getPackageName());
        List<ResolveInfo> resolveInfos = packageManager.queryIntentActivities(activityIntent, 128);
        Iterator<ResolveInfo> r4 = resolveInfos.iterator();
    L6:
        if (r4.hasNext() == false) goto L21;
        ResolveInfo resolveInfo = r4.next();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        if (activityInfo == null) goto L6;
        Bundle metaData = activityInfo.metaData;
        if (metaData == null) goto L6;
        String shortcutListenerImplName = metaData.getString(SHORTCUT_LISTENER_META_DATA_KEY);
        if (shortcutListenerImplName == null) goto L6;
        ClassLoader loader = ShortcutManagerCompat.class.getClassLoader();     // Catch: Exception -> L18
        Class<?> listener = Class.forName(shortcutListenerImplName, false, loader);     // Catch: Exception -> L18
        Method getInstanceMethod = listener.getMethod("getInstance", new Class[]{Context.class});     // Catch: Exception -> L18
        result.add((ShortcutInfoChangeListener) getInstanceMethod.invoke(null, new Object[]{context}));     // Catch: Exception -> L18
        goto L6
    L21:
        if (sShortcutInfoChangeListeners != null) goto L24;
        sShortcutInfoChangeListeners = result;
    L24:
        return sShortcutInfoChangeListeners;
    }

    private static List<ShortcutInfoCompat> removeShortcutsExcludedFromSurface(List<ShortcutInfoCompat> shortcuts, int surfaces) {
        Objects.requireNonNull(shortcuts);
        if (Build.VERSION.SDK_INT <= 32) goto L5;
        return shortcuts;
    L5:
        List<ShortcutInfoCompat> clone = new ArrayList(shortcuts);
        Iterator<ShortcutInfoCompat> r1 = shortcuts.iterator();
    L7:
        if (r1.hasNext() == false) goto L12;
        ShortcutInfoCompat si = r1.next();
        if (si.isExcludedFromSurfaces(surfaces) == false) goto L7;
        clone.remove(si);
        goto L7
    L12:
        return clone;
    }
}
