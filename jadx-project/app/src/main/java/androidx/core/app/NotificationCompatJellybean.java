package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
class NotificationCompatJellybean {
    static final String EXTRA_ALLOW_GENERATED_REPLIES = "android.support.allowGeneratedReplies";
    static final String EXTRA_DATA_ONLY_REMOTE_INPUTS = "android.support.dataRemoteInputs";
    private static final String KEY_ACTION_INTENT = "actionIntent";
    private static final String KEY_ALLOWED_DATA_TYPES = "allowedDataTypes";
    private static final String KEY_ALLOW_FREE_FORM_INPUT = "allowFreeFormInput";
    private static final String KEY_CHOICES = "choices";
    private static final String KEY_DATA_ONLY_REMOTE_INPUTS = "dataOnlyRemoteInputs";
    private static final String KEY_EXTRAS = "extras";
    private static final String KEY_ICON = "icon";
    private static final String KEY_LABEL = "label";
    private static final String KEY_REMOTE_INPUTS = "remoteInputs";
    private static final String KEY_RESULT_KEY = "resultKey";
    private static final String KEY_SEMANTIC_ACTION = "semanticAction";
    private static final String KEY_SHOWS_USER_INTERFACE = "showsUserInterface";
    private static final String KEY_TITLE = "title";
    public static final String TAG = "NotificationCompat";
    private static Field sActionIconField;
    private static Field sActionIntentField;
    private static Field sActionTitleField;
    private static boolean sActionsAccessFailed;
    private static Field sActionsField;
    private static final Object sActionsLock = null;
    private static Field sExtrasField;
    private static boolean sExtrasFieldAccessFailed;
    private static final Object sExtrasLock = null;

    static {
        sExtrasLock = new Object();
        sActionsLock = new Object();
    }

    public static SparseArray<Bundle> buildActionExtrasMap(List<Bundle> actionExtrasList) {
        SparseArray<Bundle> actionExtrasMap = null;
        int i = 0;
        int count = actionExtrasList.size();
    L3:
        if (i >= count) goto L10;
        Bundle actionExtras = actionExtrasList.get(i);
        if (actionExtras == null) goto L9;
        if (actionExtrasMap != null) goto L8;
        actionExtrasMap = new SparseArray();
    L8:
        actionExtrasMap.put(i, actionExtras);
    L9:
        i = i + 1;
        goto L3
    L10:
        return actionExtrasMap;
    }

    public static Bundle getExtras(Notification notif) {
        Object r0 = sExtrasLock;
        monitor-enter(r0);
    L29:
        th = move-exception;
        throw th;
    L5:
        if (sExtrasFieldAccessFailed == false) goto L33;
        monitor-exit(r0);     // Catch: Throwable -> L29
        return null;
    L33:
    L24:
        e = move-exception;
        Log.e(TAG, "Unable to access notification extras", e);     // Catch: Throwable -> L29
    L26:
        sExtrasFieldAccessFailed = true;     // Catch: Throwable -> L29
        monitor-exit(r0);     // Catch: Throwable -> L29
        return null;
    L22:
        e = move-exception;
        Log.e(TAG, "Unable to access notification extras", e);     // Catch: Throwable -> L29
        goto L26
    L10:
        if (sExtrasField != null) goto L17;
        Field extrasField = Notification.class.getDeclaredField(KEY_EXTRAS);     // Catch: NoSuchFieldException -> L22 IllegalAccessException -> L24 Throwable -> L29
        if (Bundle.class.isAssignableFrom(extrasField.getType()) == true) goto L16;
        Log.e(TAG, "Notification.extras field is not of type Bundle");     // Catch: NoSuchFieldException -> L22 IllegalAccessException -> L24 Throwable -> L29
        sExtrasFieldAccessFailed = true;     // Catch: NoSuchFieldException -> L22 IllegalAccessException -> L24 Throwable -> L29
        monitor-exit(r0);     // Catch: Throwable -> L29
        return null;
    L16:
        extrasField.setAccessible(true);     // Catch: NoSuchFieldException -> L22 IllegalAccessException -> L24 Throwable -> L29
        sExtrasField = extrasField;     // Catch: NoSuchFieldException -> L22 IllegalAccessException -> L24 Throwable -> L29
    L17:
        Bundle extras = (Bundle) sExtrasField.get(notif);     // Catch: NoSuchFieldException -> L22 IllegalAccessException -> L24 Throwable -> L29
        if (extras != null) goto L20;
        extras = new Bundle();     // Catch: NoSuchFieldException -> L22 IllegalAccessException -> L24 Throwable -> L29
        sExtrasField.set(notif, extras);     // Catch: NoSuchFieldException -> L22 IllegalAccessException -> L24 Throwable -> L29
    L20:
        monitor-exit(r0);     // Catch: Throwable -> L29
        return extras;
    }

    public static NotificationCompat.Action readAction(int icon, CharSequence title, PendingIntent actionIntent, Bundle extras) {
        if (extras == null) goto L5;
        RemoteInput[] remoteInputs = fromBundleArray(getBundleArrayFromBundle(extras, NotificationCompatExtras.EXTRA_REMOTE_INPUTS));
        RemoteInput[] dataOnlyRemoteInputs = fromBundleArray(getBundleArrayFromBundle(extras, EXTRA_DATA_ONLY_REMOTE_INPUTS));
        boolean allowGeneratedReplies = extras.getBoolean(EXTRA_ALLOW_GENERATED_REPLIES);
        RemoteInput[] remoteInputs2 = remoteInputs;
        RemoteInput[] dataOnlyRemoteInputs2 = dataOnlyRemoteInputs;
        boolean allowGeneratedReplies2 = allowGeneratedReplies;
    L7:
        return new NotificationCompat.Action(icon, title, actionIntent, extras, remoteInputs2, dataOnlyRemoteInputs2, allowGeneratedReplies2, 0, true, false, false);
    L5:
        remoteInputs2 = null;
        dataOnlyRemoteInputs2 = null;
        allowGeneratedReplies2 = false;
        goto L7
    }

    public static Bundle writeActionAndGetExtras(Notification.Builder builder, NotificationCompat.Action action) {
        IconCompat iconCompat = action.getIconCompat();
        if (iconCompat == null) goto L5;
        int r1 = iconCompat.getResId();
    L6:
        builder.addAction(r1, action.getTitle(), action.getActionIntent());
        Bundle actionExtras = new Bundle(action.getExtras());
        if (action.getRemoteInputs() == null) goto L10;
        actionExtras.putParcelableArray(NotificationCompatExtras.EXTRA_REMOTE_INPUTS, toBundleArray(action.getRemoteInputs()));
    L10:
        if (action.getDataOnlyRemoteInputs() == null) goto L12;
        actionExtras.putParcelableArray(EXTRA_DATA_ONLY_REMOTE_INPUTS, toBundleArray(action.getDataOnlyRemoteInputs()));
    L12:
        actionExtras.putBoolean(EXTRA_ALLOW_GENERATED_REPLIES, action.getAllowGeneratedReplies());
        return actionExtras;
    L5:
        r1 = 0;
        goto L6
    }

    public static int getActionCount(Notification notif) {
        Object r0 = sActionsLock;
        monitor-enter(r0);
        Object[] actionObjects = getActionObjectsLocked(notif);     // Catch: Throwable -> L10
        if (actionObjects == null) goto L7;
        int r2 = actionObjects.length;     // Catch: Throwable -> L10
    L8:
        monitor-exit(r0);     // Catch: Throwable -> L10
        return r2;
    L7:
        r2 = 0;
    L10:
        th = move-exception;
        throw th;
    }

    public static NotificationCompat.Action getAction(Notification notif, int actionIndex) {
        Object r0 = sActionsLock;
        monitor-enter(r0);
        Object[] actionObjects = getActionObjectsLocked(notif);     // Catch: Throwable -> L15 IllegalAccessException -> L17
        if (actionObjects == null) goto L19;
        Object actionObject = actionObjects[actionIndex];     // Catch: Throwable -> L15 IllegalAccessException -> L17
        Bundle actionExtras = null;
        Bundle extras = getExtras(notif);     // Catch: Throwable -> L15 IllegalAccessException -> L17
        if (extras == null) goto L11;
        SparseArray<Bundle> actionExtrasMap = extras.getSparseParcelableArray(NotificationCompatExtras.EXTRA_ACTION_EXTRAS);     // Catch: Throwable -> L15 IllegalAccessException -> L17
        if (actionExtrasMap == null) goto L11;
        actionExtras = actionExtrasMap.get(actionIndex);     // Catch: Throwable -> L15 IllegalAccessException -> L17
    L11:
        NotificationCompat.Action r5 = readAction(sActionIconField.getInt(actionObject), (CharSequence) sActionTitleField.get(actionObject), (PendingIntent) sActionIntentField.get(actionObject), actionExtras);     // Catch: Throwable -> L15 IllegalAccessException -> L17
        monitor-exit(r0);     // Catch: Throwable -> L15
        return r5;
    L19:
        monitor-exit(r0);     // Catch: Throwable -> L15
        return null;
    L17:
        e = move-exception;
        Log.e(TAG, "Unable to access notification actions", e);     // Catch: Throwable -> L15
        sActionsAccessFailed = true;     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        throw th;
    }

    private static Object[] getActionObjectsLocked(Notification notif) {
        Object r0 = sActionsLock;
        monitor-enter(r0);
    L15:
        e = move-exception;
        throw e;
    L5:
        if (ensureActionReflectionReadyLocked() == true) goto L18;
        monitor-exit(r0);     // Catch: Throwable -> L15
        return null;
    L18:
        Object[] r1 = (Object[]) sActionsField.get(notif);     // Catch: IllegalAccessException -> L11 Throwable -> L15
        monitor-exit(r0);     // Catch: Throwable -> L15
        return r1;
    L11:
        e = move-exception;
        Log.e(TAG, "Unable to access notification actions", e);     // Catch: Throwable -> L15
        sActionsAccessFailed = true;     // Catch: Throwable -> L15
        return null;
    }

    private static boolean ensureActionReflectionReadyLocked() {
        /*  JADX ERROR: Simple mode code generation failed
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
            	at java.base/java.util.Objects.checkIndex(Objects.java:385)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.codegen.MethodGen.generateSimpleCode(MethodGen.java:354)
            	at jadx.core.codegen.MethodGen.addSimpleMethodCode(MethodGen.java:316)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:279)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*
            java.lang.String r0 = "Unable to access notification actions"
            java.lang.String r1 = "NotificationCompat"
            boolean r2 = androidx.core.app.NotificationCompatJellybean.sActionsAccessFailed
            if (r2 == 0) goto La
            r0 = 0
            return r0
        La:
            r2 = 1
            java.lang.reflect.Field r3 = androidx.core.app.NotificationCompatJellybean.sActionsField     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.ClassNotFoundException -> L44
            if (r3 != 0) goto L4a
            java.lang.String r3 = "android.app.Notification$Action"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.ClassNotFoundException -> L44
            java.lang.String r4 = "icon"
            java.lang.reflect.Field r4 = r3.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.ClassNotFoundException -> L44
            androidx.core.app.NotificationCompatJellybean.sActionIconField = r4     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.ClassNotFoundException -> L44
            java.lang.String r4 = "title"
            java.lang.reflect.Field r4 = r3.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.ClassNotFoundException -> L44
            androidx.core.app.NotificationCompatJellybean.sActionTitleField = r4     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.ClassNotFoundException -> L44
            java.lang.String r4 = "actionIntent"
            java.lang.reflect.Field r4 = r3.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.ClassNotFoundException -> L44
            androidx.core.app.NotificationCompatJellybean.sActionIntentField = r4     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.ClassNotFoundException -> L44
            java.lang.Class<android.app.Notification> r4 = android.app.Notification.class
            java.lang.String r5 = "actions"
            java.lang.reflect.Field r4 = r4.getDeclaredField(r5)     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.ClassNotFoundException -> L44
            androidx.core.app.NotificationCompatJellybean.sActionsField = r4     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.ClassNotFoundException -> L44
            java.lang.reflect.Field r4 = androidx.core.app.NotificationCompatJellybean.sActionsField     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.ClassNotFoundException -> L44
            r4.setAccessible(r2)     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.ClassNotFoundException -> L44
            goto L4a
        L3d:
            r3 = move-exception
            android.util.Log.e(r1, r0, r3)
            androidx.core.app.NotificationCompatJellybean.sActionsAccessFailed = r2
            goto L4b
        L44:
            r3 = move-exception
            android.util.Log.e(r1, r0, r3)
            androidx.core.app.NotificationCompatJellybean.sActionsAccessFailed = r2
        L4a:
        L4b:
            boolean r0 = androidx.core.app.NotificationCompatJellybean.sActionsAccessFailed
            r0 = r0 ^ r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompatJellybean.ensureActionReflectionReadyLocked():boolean");
    }

    static NotificationCompat.Action getActionFromBundle(Bundle bundle) {
        Bundle extras = bundle.getBundle(KEY_EXTRAS);
        if (extras == null) goto L5;
        boolean allowGeneratedReplies = extras.getBoolean(EXTRA_ALLOW_GENERATED_REPLIES, false);
        boolean allowGeneratedReplies2 = allowGeneratedReplies;
    L7:
        return new NotificationCompat.Action(bundle.getInt(KEY_ICON), bundle.getCharSequence(KEY_TITLE), (PendingIntent) bundle.getParcelable(KEY_ACTION_INTENT), bundle.getBundle(KEY_EXTRAS), fromBundleArray(getBundleArrayFromBundle(bundle, KEY_REMOTE_INPUTS)), fromBundleArray(getBundleArrayFromBundle(bundle, KEY_DATA_ONLY_REMOTE_INPUTS)), allowGeneratedReplies2, bundle.getInt(KEY_SEMANTIC_ACTION), bundle.getBoolean(KEY_SHOWS_USER_INTERFACE), false, false);
    L5:
        allowGeneratedReplies2 = false;
        goto L7
    }

    static Bundle getBundleForAction(NotificationCompat.Action action) {
        Bundle bundle = new Bundle();
        IconCompat icon = action.getIconCompat();
        if (icon == null) goto L5;
        int r2 = icon.getResId();
    L6:
        bundle.putInt(KEY_ICON, r2);
        bundle.putCharSequence(KEY_TITLE, action.getTitle());
        bundle.putParcelable(KEY_ACTION_INTENT, action.getActionIntent());
        if (action.getExtras() == null) goto L9;
        Bundle actionExtras = new Bundle(action.getExtras());
    L10:
        actionExtras.putBoolean(EXTRA_ALLOW_GENERATED_REPLIES, action.getAllowGeneratedReplies());
        bundle.putBundle(KEY_EXTRAS, actionExtras);
        bundle.putParcelableArray(KEY_REMOTE_INPUTS, toBundleArray(action.getRemoteInputs()));
        bundle.putBoolean(KEY_SHOWS_USER_INTERFACE, action.getShowsUserInterface());
        bundle.putInt(KEY_SEMANTIC_ACTION, action.getSemanticAction());
        return bundle;
    L9:
        actionExtras = new Bundle();
        goto L10
    L5:
        r2 = 0;
        goto L6
    }

    private static RemoteInput fromBundle(Bundle data) {
        ArrayList<String> allowedDataTypesAsList = data.getStringArrayList(KEY_ALLOWED_DATA_TYPES);
        Set<String> allowedDataTypes = new HashSet();
        if (allowedDataTypesAsList == null) goto L9;
        Iterator<String> r1 = allowedDataTypesAsList.iterator();
    L6:
        if (r1.hasNext() == false) goto L9;
        String type = r1.next();
        allowedDataTypes.add(type);
    L9:
        return new RemoteInput(data.getString(KEY_RESULT_KEY), data.getCharSequence(KEY_LABEL), data.getCharSequenceArray(KEY_CHOICES), data.getBoolean(KEY_ALLOW_FREE_FORM_INPUT), 0, data.getBundle(KEY_EXTRAS), allowedDataTypes);
    }

    private static Bundle toBundle(RemoteInput remoteInput) {
        Bundle data = new Bundle();
        data.putString(KEY_RESULT_KEY, remoteInput.getResultKey());
        data.putCharSequence(KEY_LABEL, remoteInput.getLabel());
        data.putCharSequenceArray(KEY_CHOICES, remoteInput.getChoices());
        data.putBoolean(KEY_ALLOW_FREE_FORM_INPUT, remoteInput.getAllowFreeFormInput());
        data.putBundle(KEY_EXTRAS, remoteInput.getExtras());
        Set<String> allowedDataTypes = remoteInput.getAllowedDataTypes();
        if (allowedDataTypes != null) goto L5;
    L11:
        return data;
    L5:
        if (allowedDataTypes.isEmpty() == true) goto L11;
        ArrayList<String> allowedDataTypesAsList = new ArrayList(allowedDataTypes.size());
        Iterator<String> r3 = allowedDataTypes.iterator();
    L8:
        if (r3.hasNext() == false) goto L10;
        String type = r3.next();
        allowedDataTypesAsList.add(type);
        goto L8
    L10:
        data.putStringArrayList(KEY_ALLOWED_DATA_TYPES, allowedDataTypesAsList);
        goto L11
    }

    private static RemoteInput[] fromBundleArray(Bundle[] bundles) {
        if (bundles != null) goto L5;
        return null;
    L5:
        RemoteInput[] remoteInputs = new RemoteInput[bundles.length];
        int i = 0;
    L7:
        if (i >= bundles.length) goto L9;
        remoteInputs[i] = fromBundle(bundles[i]);
        i = i + 1;
        goto L7
    L9:
        return remoteInputs;
    }

    private static Bundle[] toBundleArray(RemoteInput[] remoteInputs) {
        if (remoteInputs != null) goto L5;
        return null;
    L5:
        Bundle[] bundles = new Bundle[remoteInputs.length];
        int i = 0;
    L7:
        if (i >= remoteInputs.length) goto L9;
        bundles[i] = toBundle(remoteInputs[i]);
        i = i + 1;
        goto L7
    L9:
        return bundles;
    }

    private static Bundle[] getBundleArrayFromBundle(Bundle bundle, String key) {
        Parcelable[] array = bundle.getParcelableArray(key);
        if ((array instanceof Bundle[]) == true) goto L9;
        if (array == null) goto L9;
        Bundle[] typedArray = (Bundle[]) Arrays.copyOf(array, array.length, Bundle[].class);
        bundle.putParcelableArray(key, typedArray);
        return typedArray;
    L9:
        return (Bundle[]) array;
    }

    private NotificationCompatJellybean() {
    }
}
