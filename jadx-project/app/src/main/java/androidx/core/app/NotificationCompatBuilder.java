package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.collection.ArraySet;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
class NotificationCompatBuilder implements NotificationBuilderWithBuilderAccessor {
    private final List<Bundle> mActionExtrasList;
    private RemoteViews mBigContentView;
    private final Notification.Builder mBuilder;
    private final NotificationCompat.Builder mBuilderCompat;
    private RemoteViews mContentView;
    private final Context mContext;
    private final Bundle mExtras;
    private int mGroupAlertBehavior;
    private RemoteViews mHeadsUpContentView;

    static class Api20Impl {
        private Api20Impl() {
        }

        static Notification.Action.Builder createBuilder(int icon, CharSequence title, PendingIntent intent) {
            return new Notification.Action.Builder(icon, title, intent);
        }

        static Notification.Action.Builder addRemoteInput(Notification.Action.Builder builder, android.app.RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action.Builder addExtras(Notification.Action.Builder builder, Bundle extras) {
            return builder.addExtras(extras);
        }

        static Notification.Builder addAction(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action build(Notification.Action.Builder builder) {
            return builder.build();
        }

        static String getGroup(Notification notification) {
            return notification.getGroup();
        }

        static Notification.Builder setGroup(Notification.Builder builder, String groupKey) {
            return builder.setGroup(groupKey);
        }

        static Notification.Builder setGroupSummary(Notification.Builder builder, boolean isGroupSummary) {
            return builder.setGroupSummary(isGroupSummary);
        }

        static Notification.Builder setLocalOnly(Notification.Builder builder, boolean localOnly) {
            return builder.setLocalOnly(localOnly);
        }

        static Notification.Builder setSortKey(Notification.Builder builder, String sortKey) {
            return builder.setSortKey(sortKey);
        }
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static Notification.Builder addPerson(Notification.Builder builder, String uri) {
            return builder.addPerson(uri);
        }

        static Notification.Builder setCategory(Notification.Builder builder, String category) {
            return builder.setCategory(category);
        }

        static Notification.Builder setColor(Notification.Builder builder, int argb) {
            return builder.setColor(argb);
        }

        static Notification.Builder setVisibility(Notification.Builder builder, int visibility) {
            return builder.setVisibility(visibility);
        }

        static Notification.Builder setPublicVersion(Notification.Builder builder, Notification n) {
            return builder.setPublicVersion(n);
        }

        static Notification.Builder setSound(Notification.Builder builder, Uri sound, Object audioAttributes) {
            return builder.setSound(sound, (AudioAttributes) audioAttributes);
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static Notification.Action.Builder createBuilder(Icon icon, CharSequence title, PendingIntent intent) {
            return new Notification.Action.Builder(icon, title, intent);
        }

        static Notification.Builder setSmallIcon(Notification.Builder builder, Object icon) {
            return builder.setSmallIcon((Icon) icon);
        }

        static Notification.Builder setLargeIcon(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static Notification.Action.Builder setAllowGeneratedReplies(Notification.Action.Builder builder, boolean allowGeneratedReplies) {
            return builder.setAllowGeneratedReplies(allowGeneratedReplies);
        }

        static Notification.Builder setRemoteInputHistory(Notification.Builder builder, CharSequence[] text) {
            return builder.setRemoteInputHistory(text);
        }

        static Notification.Builder setCustomContentView(Notification.Builder builder, RemoteViews contentView) {
            return builder.setCustomContentView(contentView);
        }

        static Notification.Builder setCustomBigContentView(Notification.Builder builder, RemoteViews contentView) {
            return builder.setCustomBigContentView(contentView);
        }

        static Notification.Builder setCustomHeadsUpContentView(Notification.Builder builder, RemoteViews contentView) {
            return builder.setCustomHeadsUpContentView(contentView);
        }
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static Notification.Builder createBuilder(Context context, String channelId) {
            return new Notification.Builder(context, channelId);
        }

        static Notification.Builder setGroupAlertBehavior(Notification.Builder builder, int groupAlertBehavior) {
            return builder.setGroupAlertBehavior(groupAlertBehavior);
        }

        static Notification.Builder setColorized(Notification.Builder builder, boolean colorize) {
            return builder.setColorized(colorize);
        }

        static Notification.Builder setBadgeIconType(Notification.Builder builder, int icon) {
            return builder.setBadgeIconType(icon);
        }

        static Notification.Builder setSettingsText(Notification.Builder builder, CharSequence text) {
            return builder.setSettingsText(text);
        }

        static Notification.Builder setShortcutId(Notification.Builder builder, String shortcutId) {
            return builder.setShortcutId(shortcutId);
        }

        static Notification.Builder setTimeoutAfter(Notification.Builder builder, long durationMs) {
            return builder.setTimeoutAfter(durationMs);
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static Notification.Action.Builder setSemanticAction(Notification.Action.Builder builder, int semanticAction) {
            return builder.setSemanticAction(semanticAction);
        }

        static Notification.Builder addPerson(Notification.Builder builder, android.app.Person person) {
            return builder.addPerson(person);
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static Notification.Action.Builder setContextual(Notification.Action.Builder builder, boolean isContextual) {
            return builder.setContextual(isContextual);
        }

        static Notification.Builder setLocusId(Notification.Builder builder, Object locusId) {
            return builder.setLocusId((LocusId) locusId);
        }

        static Notification.Builder setBubbleMetadata(Notification.Builder builder, Notification.BubbleMetadata data) {
            return builder.setBubbleMetadata(data);
        }

        static Notification.Builder setAllowSystemGeneratedContextualActions(Notification.Builder builder, boolean allowed) {
            return builder.setAllowSystemGeneratedContextualActions(allowed);
        }
    }

    static class Api31Impl {
        private Api31Impl() {
        }

        static Notification.Action.Builder setAuthenticationRequired(Notification.Action.Builder builder, boolean authenticationRequired) {
            return builder.setAuthenticationRequired(authenticationRequired);
        }

        static Notification.Builder setForegroundServiceBehavior(Notification.Builder builder, int behavior) {
            return builder.setForegroundServiceBehavior(behavior);
        }
    }

    NotificationCompatBuilder(NotificationCompat.Builder b) {
        this.mActionExtrasList = new ArrayList();
        this.mExtras = new Bundle();
        this.mBuilderCompat = b;
        this.mContext = b.mContext;
        this.mBuilder = Api26Impl.createBuilder(b.mContext, b.mChannelId);
        Notification n = b.mNotification;
        Notification.Builder r3 = this.mBuilder.setWhen(n.when).setSmallIcon(n.icon, n.iconLevel).setContent(n.contentView).setTicker(n.tickerText, b.mTickerView).setVibrate(n.vibrate).setLights(n.ledARGB, n.ledOnMS, n.ledOffMS);
        if ((n.flags & 2) == 0) goto L5;
        boolean r4 = true;
    L6:
        Notification.Builder r5 = r3.setOngoing(r4);
        if ((n.flags & 8) == 0) goto L9;
        boolean r6 = true;
    L10:
        Notification.Builder r7 = r5.setOnlyAlertOnce(r6);
        if ((n.flags & 16) == 0) goto L13;
        boolean r8 = true;
    L14:
        Notification.Builder r9 = r7.setAutoCancel(r8).setDefaults(n.defaults).setContentTitle(b.mContentTitle).setContentText(b.mContentText).setContentInfo(b.mContentInfo).setContentIntent(b.mContentIntent).setDeleteIntent(n.deleteIntent);
        PendingIntent r10 = b.mFullScreenIntent;
        if ((n.flags & 128) == 0) goto L17;
        boolean r11 = true;
    L18:
        r9.setFullScreenIntent(r10, r11).setNumber(b.mNumber).setProgress(b.mProgressMax, b.mProgress, b.mProgressIndeterminate);
        Notification.Builder r12 = this.mBuilder;
        if (b.mLargeIcon != null) goto L21;
        Icon r13 = null;
    L22:
        Api23Impl.setLargeIcon(r12, r13);
        Notification.Builder builder = this.mBuilder.setSubText(b.mSubText);
        Notification.Builder builder1 = builder.setUsesChronometer(b.mUseChronometer);
        builder1.setPriority(b.mPriority);
        if ((b.mStyle instanceof NotificationCompat.CallStyle) == false) goto L29;
        List<NotificationCompat.Action> actionsList = ((NotificationCompat.CallStyle) b.mStyle).getActionsListWithSystemActions();
        Iterator<NotificationCompat.Action> r14 = actionsList.iterator();
    L26:
        if (r14.hasNext() == false) goto L34;
        NotificationCompat.Action action = r14.next();
        addAction(action);
    L34:
        if (b.mExtras == null) goto L36;
        this.mExtras.putAll(b.mExtras);
    L36:
        this.mContentView = b.mContentView;
        this.mBigContentView = b.mBigContentView;
        this.mBuilder.setShowWhen(b.mShowWhen);
        Api20Impl.setLocalOnly(this.mBuilder, b.mLocalOnly);
        Api20Impl.setGroup(this.mBuilder, b.mGroupKey);
        Api20Impl.setSortKey(this.mBuilder, b.mSortKey);
        Api20Impl.setGroupSummary(this.mBuilder, b.mGroupSummary);
        this.mGroupAlertBehavior = b.mGroupAlertBehavior;
        Api21Impl.setCategory(this.mBuilder, b.mCategory);
        Api21Impl.setColor(this.mBuilder, b.mColor);
        Api21Impl.setVisibility(this.mBuilder, b.mVisibility);
        Api21Impl.setPublicVersion(this.mBuilder, b.mPublicVersion);
        Api21Impl.setSound(this.mBuilder, n.sound, n.audioAttributes);
        if (Build.VERSION.SDK_INT >= 28) goto L39;
        List<String> people = combineLists(getPeople(b.mPersonList), b.mPeople);
    L40:
        if (people != null) goto L42;
    L47:
        this.mHeadsUpContentView = b.mHeadsUpContentView;
        if (b.mInvisibleActions.size() <= 0) goto L58;
        Bundle carExtenderBundle = b.getExtras().getBundle("android.car.EXTENSIONS");
        if (carExtenderBundle != null) goto L52;
        carExtenderBundle = new Bundle();
    L52:
        Bundle extenderBundleCopy = new Bundle(carExtenderBundle);
        Bundle listBundle = new Bundle();
        int i = 0;
    L54:
        if (i >= b.mInvisibleActions.size()) goto L56;
        listBundle.putBundle(Integer.toString(i), NotificationCompatJellybean.getBundleForAction(b.mInvisibleActions.get(i)));
        i = i + 1;
        goto L54
    L56:
        carExtenderBundle.putBundle("invisible_actions", listBundle);
        extenderBundleCopy.putBundle("invisible_actions", listBundle);
        b.getExtras().putBundle("android.car.EXTENSIONS", carExtenderBundle);
        this.mExtras.putBundle("android.car.EXTENSIONS", extenderBundleCopy);
    L58:
        if (b.mSmallIcon == null) goto L60;
        Api23Impl.setSmallIcon(this.mBuilder, b.mSmallIcon);
    L60:
        this.mBuilder.setExtras(b.mExtras);
        Api24Impl.setRemoteInputHistory(this.mBuilder, b.mRemoteInputHistory);
        if (b.mContentView == null) goto L64;
        Api24Impl.setCustomContentView(this.mBuilder, b.mContentView);
    L64:
        if (b.mBigContentView == null) goto L67;
        Api24Impl.setCustomBigContentView(this.mBuilder, b.mBigContentView);
    L67:
        if (b.mHeadsUpContentView == null) goto L69;
        Api24Impl.setCustomHeadsUpContentView(this.mBuilder, b.mHeadsUpContentView);
    L69:
        Api26Impl.setBadgeIconType(this.mBuilder, b.mBadgeIcon);
        Api26Impl.setSettingsText(this.mBuilder, b.mSettingsText);
        Api26Impl.setShortcutId(this.mBuilder, b.mShortcutId);
        Api26Impl.setTimeoutAfter(this.mBuilder, b.mTimeout);
        Api26Impl.setGroupAlertBehavior(this.mBuilder, b.mGroupAlertBehavior);
        if (b.mColorizedSet == false) goto L73;
        Api26Impl.setColorized(this.mBuilder, b.mColorized);
    L73:
        if (TextUtils.isEmpty(b.mChannelId) == true) goto L76;
        this.mBuilder.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
    L76:
        if (Build.VERSION.SDK_INT < 28) goto L82;
        Iterator<Person> r15 = b.mPersonList.iterator();
    L79:
        if (r15.hasNext() == false) goto L82;
        Person p = r15.next();
        Api28Impl.addPerson(this.mBuilder, p.toAndroidPerson());
    L82:
        if (Build.VERSION.SDK_INT < 29) goto L87;
        Api29Impl.setAllowSystemGeneratedContextualActions(this.mBuilder, b.mAllowSystemGeneratedContextualActions);
        Api29Impl.setBubbleMetadata(this.mBuilder, NotificationCompat.BubbleMetadata.toPlatform(b.mBubbleMetadata));
        if (b.mLocusId == null) goto L87;
        Api29Impl.setLocusId(this.mBuilder, b.mLocusId.toLocusId());
    L87:
        if (Build.VERSION.SDK_INT < 31) goto L92;
        if (b.mFgsDeferBehavior == 0) goto L92;
        Api31Impl.setForegroundServiceBehavior(this.mBuilder, b.mFgsDeferBehavior);
    L92:
        if (b.mSilent == true) goto L94;
        return;
    L94:
        if (this.mBuilderCompat.mGroupSummary == false) goto L96;
        this.mGroupAlertBehavior = 2;
    L97:
        this.mBuilder.setVibrate(null);
        this.mBuilder.setSound(null);
        n.defaults &= -2;
        n.defaults &= -3;
        this.mBuilder.setDefaults(n.defaults);
        if (TextUtils.isEmpty(this.mBuilderCompat.mGroupKey) == false) goto L100;
        Api20Impl.setGroup(this.mBuilder, NotificationCompat.GROUP_KEY_SILENT);
    L100:
        Api26Impl.setGroupAlertBehavior(this.mBuilder, this.mGroupAlertBehavior);
        return;
    L96:
        this.mGroupAlertBehavior = 1;
        goto L97
    L42:
        if (people.isEmpty() == true) goto L47;
        Iterator<String> r16 = people.iterator();
    L45:
        if (r16.hasNext() == false) goto L47;
        String person = r16.next();
        Api21Impl.addPerson(this.mBuilder, person);
        goto L45
    L39:
        people = b.mPeople;
        goto L40
    L29:
        Iterator<NotificationCompat.Action> r17 = b.mActions.iterator();
    L31:
        if (r17.hasNext() == false) goto L34;
        NotificationCompat.Action action2 = r17.next();
        addAction(action2);
        goto L31
    L21:
        r13 = b.mLargeIcon.toIcon(this.mContext);
        goto L22
    L17:
        r11 = false;
        goto L18
    L13:
        r8 = false;
        goto L14
    L9:
        r6 = false;
        goto L10
    L5:
        r4 = false;
        goto L6
    }

    private static List<String> combineLists(List<String> first, List<String> second) {
        if (first != null) goto L4;
        return second;
    L4:
        if (second != null) goto L6;
        return first;
    L6:
        ArraySet<String> people = new ArraySet(first.size() + second.size());
        people.addAll(first);
        people.addAll(second);
        return new ArrayList(people);
    }

    private static List<String> getPeople(List<Person> people) {
        if (people != null) goto L5;
        return null;
    L5:
        ArrayList<String> result = new ArrayList(people.size());
        Iterator<Person> r1 = people.iterator();
    L7:
        if (r1.hasNext() == false) goto L9;
        Person person = r1.next();
        result.add(person.resolveToLegacyUri());
        goto L7
    L9:
        return result;
    }

    @Override // androidx.core.app.NotificationBuilderWithBuilderAccessor
    public Notification.Builder getBuilder() {
        return this.mBuilder;
    }

    Context getContext() {
        return this.mContext;
    }

    public Notification build() {
        NotificationCompat.Style style = this.mBuilderCompat.mStyle;
        if (style == null) goto L5;
        style.apply(this);
    L5:
        if (style == null) goto L7;
        RemoteViews styleContentView = style.makeContentView(this);
    L8:
        Notification n = buildInternal();
        if (styleContentView == null) goto L12;
        n.contentView = styleContentView;
    L14:
        if (style == null) goto L18;
        RemoteViews styleBigContentView = style.makeBigContentView(this);
        if (styleBigContentView == null) goto L18;
        n.bigContentView = styleBigContentView;
    L18:
        if (style == null) goto L22;
        RemoteViews styleHeadsUpContentView = this.mBuilderCompat.mStyle.makeHeadsUpContentView(this);
        if (styleHeadsUpContentView == null) goto L22;
        n.headsUpContentView = styleHeadsUpContentView;
    L22:
        if (style == null) goto L26;
        Bundle extras = NotificationCompat.getExtras(n);
        if (extras == null) goto L26;
        style.addCompatExtras(extras);
    L26:
        return n;
    L12:
        if (this.mBuilderCompat.mContentView == null) goto L14;
        n.contentView = this.mBuilderCompat.mContentView;
        goto L14
    L7:
        styleContentView = null;
        goto L8
    }

    private void addAction(NotificationCompat.Action action) {
        IconCompat iconCompat = action.getIconCompat();
        if (iconCompat == null) goto L5;
        Icon r1 = iconCompat.toIcon();
    L6:
        Notification.Action.Builder actionBuilder = Api23Impl.createBuilder(r1, action.getTitle(), action.getActionIntent());
        if (action.getRemoteInputs() == null) goto L12;
        android.app.RemoteInput[] r2 = RemoteInput.fromCompat(action.getRemoteInputs());
        int r3 = r2.length;
        int r4 = 0;
    L9:
        if (r4 >= r3) goto L12;
        android.app.RemoteInput remoteInput = r2[r4];
        Api20Impl.addRemoteInput(actionBuilder, remoteInput);
        r4 = r4 + 1;
    L12:
        if (action.getExtras() == null) goto L14;
        Bundle actionExtras = new Bundle(action.getExtras());
    L15:
        actionExtras.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
        Api24Impl.setAllowGeneratedReplies(actionBuilder, action.getAllowGeneratedReplies());
        actionExtras.putInt("android.support.action.semanticAction", action.getSemanticAction());
        if (Build.VERSION.SDK_INT < 28) goto L19;
        Api28Impl.setSemanticAction(actionBuilder, action.getSemanticAction());
    L19:
        if (Build.VERSION.SDK_INT < 29) goto L22;
        Api29Impl.setContextual(actionBuilder, action.isContextual());
    L22:
        if (Build.VERSION.SDK_INT < 31) goto L24;
        Api31Impl.setAuthenticationRequired(actionBuilder, action.isAuthenticationRequired());
    L24:
        actionExtras.putBoolean("android.support.action.showsUserInterface", action.getShowsUserInterface());
        Api20Impl.addExtras(actionBuilder, actionExtras);
        Api20Impl.addAction(this.mBuilder, Api20Impl.build(actionBuilder));
        return;
    L14:
        actionExtras = new Bundle();
        goto L15
    L5:
        r1 = null;
        goto L6
    }

    protected Notification buildInternal() {
        return this.mBuilder.build();
    }

    private void removeSoundAndVibration(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }
}
