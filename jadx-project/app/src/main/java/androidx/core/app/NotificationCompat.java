package androidx.core.app;

import android.app.Notification;
import android.app.Notification$CallStyle;
import android.app.PendingIntent;
import android.content.Context;
import android.content.LocusId;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RemoteViews;
import android.widget.TextView;
import androidx.annotation.ReplaceWith;
import androidx.core.R;
import androidx.core.content.ContextCompat;
import androidx.core.content.LocusIdCompat;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.text.BidiFormatter;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class NotificationCompat {
    public static final int BADGE_ICON_LARGE = 2;
    public static final int BADGE_ICON_NONE = 0;
    public static final int BADGE_ICON_SMALL = 1;
    public static final String CATEGORY_ALARM = "alarm";
    public static final String CATEGORY_CALL = "call";
    public static final String CATEGORY_EMAIL = "email";
    public static final String CATEGORY_ERROR = "err";
    public static final String CATEGORY_EVENT = "event";
    public static final String CATEGORY_LOCATION_SHARING = "location_sharing";
    public static final String CATEGORY_MESSAGE = "msg";
    public static final String CATEGORY_MISSED_CALL = "missed_call";
    public static final String CATEGORY_NAVIGATION = "navigation";
    public static final String CATEGORY_PROGRESS = "progress";
    public static final String CATEGORY_PROMO = "promo";
    public static final String CATEGORY_RECOMMENDATION = "recommendation";
    public static final String CATEGORY_REMINDER = "reminder";
    public static final String CATEGORY_SERVICE = "service";
    public static final String CATEGORY_SOCIAL = "social";
    public static final String CATEGORY_STATUS = "status";
    public static final String CATEGORY_STOPWATCH = "stopwatch";
    public static final String CATEGORY_SYSTEM = "sys";
    public static final String CATEGORY_TRANSPORT = "transport";
    public static final String CATEGORY_VOICEMAIL = "voicemail";
    public static final String CATEGORY_WORKOUT = "workout";
    public static final int COLOR_DEFAULT = 0;
    public static final int DEFAULT_ALL = -1;
    public static final int DEFAULT_LIGHTS = 4;
    public static final int DEFAULT_SOUND = 1;
    public static final int DEFAULT_VIBRATE = 2;
    public static final String EXTRA_ANSWER_COLOR = "android.answerColor";
    public static final String EXTRA_ANSWER_INTENT = "android.answerIntent";
    public static final String EXTRA_AUDIO_CONTENTS_URI = "android.audioContents";
    public static final String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";
    public static final String EXTRA_BIG_TEXT = "android.bigText";
    public static final String EXTRA_CALL_IS_VIDEO = "android.callIsVideo";
    public static final String EXTRA_CALL_PERSON = "android.callPerson";
    public static final String EXTRA_CALL_PERSON_COMPAT = "android.callPersonCompat";
    public static final String EXTRA_CALL_TYPE = "android.callType";
    public static final String EXTRA_CHANNEL_GROUP_ID = "android.intent.extra.CHANNEL_GROUP_ID";
    public static final String EXTRA_CHANNEL_ID = "android.intent.extra.CHANNEL_ID";
    public static final String EXTRA_CHRONOMETER_COUNT_DOWN = "android.chronometerCountDown";
    public static final String EXTRA_COLORIZED = "android.colorized";
    public static final String EXTRA_COMPACT_ACTIONS = "android.compactActions";
    public static final String EXTRA_COMPAT_TEMPLATE = "androidx.core.app.extra.COMPAT_TEMPLATE";
    public static final String EXTRA_CONVERSATION_TITLE = "android.conversationTitle";
    public static final String EXTRA_DECLINE_COLOR = "android.declineColor";
    public static final String EXTRA_DECLINE_INTENT = "android.declineIntent";
    public static final String EXTRA_HANG_UP_INTENT = "android.hangUpIntent";
    public static final String EXTRA_HIDDEN_CONVERSATION_TITLE = "android.hiddenConversationTitle";
    public static final String EXTRA_HISTORIC_MESSAGES = "android.messages.historic";
    public static final String EXTRA_INFO_TEXT = "android.infoText";
    public static final String EXTRA_IS_GROUP_CONVERSATION = "android.isGroupConversation";
    public static final String EXTRA_LARGE_ICON = "android.largeIcon";
    public static final String EXTRA_LARGE_ICON_BIG = "android.largeIcon.big";
    public static final String EXTRA_MEDIA_SESSION = "android.mediaSession";
    public static final String EXTRA_MESSAGES = "android.messages";
    public static final String EXTRA_MESSAGING_STYLE_USER = "android.messagingStyleUser";
    public static final String EXTRA_NOTIFICATION_ID = "android.intent.extra.NOTIFICATION_ID";
    public static final String EXTRA_NOTIFICATION_TAG = "android.intent.extra.NOTIFICATION_TAG";

    @Deprecated
    public static final String EXTRA_PEOPLE = "android.people";
    public static final String EXTRA_PEOPLE_LIST = "android.people.list";
    public static final String EXTRA_PICTURE = "android.picture";
    public static final String EXTRA_PICTURE_CONTENT_DESCRIPTION = "android.pictureContentDescription";
    public static final String EXTRA_PICTURE_ICON = "android.pictureIcon";
    public static final String EXTRA_PROGRESS = "android.progress";
    public static final String EXTRA_PROGRESS_INDETERMINATE = "android.progressIndeterminate";
    public static final String EXTRA_PROGRESS_MAX = "android.progressMax";
    public static final String EXTRA_REMOTE_INPUT_HISTORY = "android.remoteInputHistory";
    public static final String EXTRA_SELF_DISPLAY_NAME = "android.selfDisplayName";
    public static final String EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED = "android.showBigPictureWhenCollapsed";
    public static final String EXTRA_SHOW_CHRONOMETER = "android.showChronometer";
    public static final String EXTRA_SHOW_WHEN = "android.showWhen";
    public static final String EXTRA_SMALL_ICON = "android.icon";
    public static final String EXTRA_SUB_TEXT = "android.subText";
    public static final String EXTRA_SUMMARY_TEXT = "android.summaryText";
    public static final String EXTRA_TEMPLATE = "android.template";
    public static final String EXTRA_TEXT = "android.text";
    public static final String EXTRA_TEXT_LINES = "android.textLines";
    public static final String EXTRA_TITLE = "android.title";
    public static final String EXTRA_TITLE_BIG = "android.title.big";
    public static final String EXTRA_VERIFICATION_ICON = "android.verificationIcon";
    public static final String EXTRA_VERIFICATION_ICON_COMPAT = "android.verificationIconCompat";
    public static final String EXTRA_VERIFICATION_TEXT = "android.verificationText";
    public static final int FLAG_AUTO_CANCEL = 16;
    public static final int FLAG_BUBBLE = 4096;
    public static final int FLAG_FOREGROUND_SERVICE = 64;
    public static final int FLAG_GROUP_SUMMARY = 512;

    @Deprecated
    public static final int FLAG_HIGH_PRIORITY = 128;
    public static final int FLAG_INSISTENT = 4;
    public static final int FLAG_LOCAL_ONLY = 256;
    public static final int FLAG_NO_CLEAR = 32;
    public static final int FLAG_ONGOING_EVENT = 2;
    public static final int FLAG_ONLY_ALERT_ONCE = 8;
    public static final int FLAG_SHOW_LIGHTS = 1;
    public static final int FOREGROUND_SERVICE_DEFAULT = 0;
    public static final int FOREGROUND_SERVICE_DEFERRED = 2;
    public static final int FOREGROUND_SERVICE_IMMEDIATE = 1;
    public static final int GROUP_ALERT_ALL = 0;
    public static final int GROUP_ALERT_CHILDREN = 2;
    public static final int GROUP_ALERT_SUMMARY = 1;
    public static final String GROUP_KEY_SILENT = "silent";
    public static final String INTENT_CATEGORY_NOTIFICATION_PREFERENCES = "android.intent.category.NOTIFICATION_PREFERENCES";
    public static final int MAX_ACTION_BUTTONS = 3;
    public static final int PRIORITY_DEFAULT = 0;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_LOW = -1;
    public static final int PRIORITY_MAX = 2;
    public static final int PRIORITY_MIN = -2;
    public static final int STREAM_DEFAULT = -1;
    private static final String TAG = "NotifCompat";
    public static final int VISIBILITY_PRIVATE = 0;
    public static final int VISIBILITY_PUBLIC = 1;
    public static final int VISIBILITY_SECRET = -1;

    /* JADX INFO: renamed from: androidx.core.app.NotificationCompat$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static class Action {
        static final String EXTRA_SEMANTIC_ACTION = "android.support.action.semanticAction";
        static final String EXTRA_SHOWS_USER_INTERFACE = "android.support.action.showsUserInterface";
        public static final int SEMANTIC_ACTION_ARCHIVE = 5;
        public static final int SEMANTIC_ACTION_CALL = 10;
        public static final int SEMANTIC_ACTION_DELETE = 4;
        public static final int SEMANTIC_ACTION_MARK_AS_READ = 2;
        public static final int SEMANTIC_ACTION_MARK_AS_UNREAD = 3;
        public static final int SEMANTIC_ACTION_MUTE = 6;
        public static final int SEMANTIC_ACTION_NONE = 0;
        public static final int SEMANTIC_ACTION_REPLY = 1;
        public static final int SEMANTIC_ACTION_THUMBS_DOWN = 9;
        public static final int SEMANTIC_ACTION_THUMBS_UP = 8;
        public static final int SEMANTIC_ACTION_UNMUTE = 7;
        public PendingIntent actionIntent;

        @Deprecated
        public int icon;
        private boolean mAllowGeneratedReplies;
        private boolean mAuthenticationRequired;
        private final RemoteInput[] mDataOnlyRemoteInputs;
        final Bundle mExtras;
        private IconCompat mIcon;
        private final boolean mIsContextual;
        private final RemoteInput[] mRemoteInputs;
        private final int mSemanticAction;
        boolean mShowsUserInterface;
        public CharSequence title;

        public static final class Builder {
            private boolean mAllowGeneratedReplies;
            private boolean mAuthenticationRequired;
            private final Bundle mExtras;
            private final IconCompat mIcon;
            private final PendingIntent mIntent;
            private boolean mIsContextual;
            private ArrayList<RemoteInput> mRemoteInputs;
            private int mSemanticAction;
            private boolean mShowsUserInterface;
            private final CharSequence mTitle;

            static class Api20Impl {
                private Api20Impl() {
                }

                static android.app.RemoteInput[] getRemoteInputs(Notification.Action action) {
                    return action.getRemoteInputs();
                }

                static Bundle getExtras(Notification.Action action) {
                    return action.getExtras();
                }
            }

            static class Api23Impl {
                private Api23Impl() {
                }

                static Icon getIcon(Notification.Action action) {
                    return action.getIcon();
                }
            }

            static class Api24Impl {
                private Api24Impl() {
                }

                static boolean getAllowGeneratedReplies(Notification.Action action) {
                    return action.getAllowGeneratedReplies();
                }
            }

            static class Api28Impl {
                private Api28Impl() {
                }

                static int getSemanticAction(Notification.Action action) {
                    return action.getSemanticAction();
                }
            }

            static class Api29Impl {
                private Api29Impl() {
                }

                static boolean isContextual(Notification.Action action) {
                    return action.isContextual();
                }
            }

            static class Api31Impl {
                private Api31Impl() {
                }

                static boolean isAuthenticationRequired(Notification.Action action) {
                    return action.isAuthenticationRequired();
                }
            }

            public static Builder fromAndroidAction(Notification.Action action) {
                if (Api23Impl.getIcon(action) == null) goto L5;
                IconCompat iconCompat = IconCompat.createFromIconOrNullIfZeroResId(Api23Impl.getIcon(action));
                Builder builder = new Builder(iconCompat, action.title, action.actionIntent);
            L6:
                android.app.RemoteInput[] remoteInputs = Api20Impl.getRemoteInputs(action);
                if (remoteInputs != null) goto L9;
            L13:
                builder.mAllowGeneratedReplies = Api24Impl.getAllowGeneratedReplies(action);
                if (Build.VERSION.SDK_INT < 28) goto L17;
                builder.setSemanticAction(Api28Impl.getSemanticAction(action));
            L17:
                if (Build.VERSION.SDK_INT < 29) goto L20;
                builder.setContextual(Api29Impl.isContextual(action));
            L20:
                if (Build.VERSION.SDK_INT < 31) goto L22;
                builder.setAuthenticationRequired(Api31Impl.isAuthenticationRequired(action));
            L22:
                builder.addExtras(Api20Impl.getExtras(action));
                return builder;
            L9:
                if (remoteInputs.length == 0) goto L13;
                int r2 = remoteInputs.length;
                int r3 = 0;
            L11:
                if (r3 >= r2) goto L13;
                android.app.RemoteInput remoteInput = remoteInputs[r3];
                builder.addRemoteInput(RemoteInput.fromPlatform(remoteInput));
                r3 = r3 + 1;
                goto L11
            L5:
                builder = new Builder(action.icon, action.title, action.actionIntent);
                goto L6
            }

            public Builder(IconCompat icon, CharSequence title, PendingIntent intent) {
                this(icon, title, intent, new Bundle(), null, true, 0, true, false, false);
            }

            public Builder(int icon, CharSequence title, PendingIntent intent) {
                IconCompat r0 = null;
                if (icon == 0) goto L6;
                r0 = IconCompat.createWithResource(null, "", icon);
            L6:
                this(r0, title, intent, new Bundle(), null, true, 0, true, false, false);
            }

            public Builder(Action action) {
                this(action.getIconCompat(), action.title, action.actionIntent, new Bundle(action.mExtras), action.getRemoteInputs(), action.getAllowGeneratedReplies(), action.getSemanticAction(), action.mShowsUserInterface, action.isContextual(), action.isAuthenticationRequired());
            }

            private Builder(IconCompat icon, CharSequence title, PendingIntent intent, Bundle extras, RemoteInput[] remoteInputs, boolean allowGeneratedReplies, int semanticAction, boolean showsUserInterface, boolean isContextual, boolean authRequired) {
                this.mAllowGeneratedReplies = true;
                this.mShowsUserInterface = true;
                this.mIcon = icon;
                this.mTitle = Builder.limitCharSequenceLength(title);
                this.mIntent = intent;
                this.mExtras = extras;
                if (remoteInputs != null) goto L5;
                ArrayList<RemoteInput> r0 = null;
            L6:
                this.mRemoteInputs = r0;
                this.mAllowGeneratedReplies = allowGeneratedReplies;
                this.mSemanticAction = semanticAction;
                this.mShowsUserInterface = showsUserInterface;
                this.mIsContextual = isContextual;
                this.mAuthenticationRequired = authRequired;
                return;
            L5:
                r0 = new ArrayList(Arrays.asList(remoteInputs));
                goto L6
            }

            public Builder addExtras(Bundle extras) {
                if (extras == null) goto L4;
                this.mExtras.putAll(extras);
            L4:
                return this;
            }

            public Bundle getExtras() {
                return this.mExtras;
            }

            public Builder addRemoteInput(RemoteInput remoteInput) {
                if (this.mRemoteInputs != null) goto L5;
                this.mRemoteInputs = new ArrayList();
            L5:
                if (remoteInput == null) goto L7;
                this.mRemoteInputs.add(remoteInput);
            L7:
                return this;
            }

            public Builder setAllowGeneratedReplies(boolean allowGeneratedReplies) {
                this.mAllowGeneratedReplies = allowGeneratedReplies;
                return this;
            }

            public Builder setSemanticAction(int semanticAction) {
                this.mSemanticAction = semanticAction;
                return this;
            }

            public Builder setContextual(boolean isContextual) {
                this.mIsContextual = isContextual;
                return this;
            }

            public Builder setAuthenticationRequired(boolean authenticationRequired) {
                this.mAuthenticationRequired = authenticationRequired;
                return this;
            }

            public Builder setShowsUserInterface(boolean showsUserInterface) {
                this.mShowsUserInterface = showsUserInterface;
                return this;
            }

            public Builder extend(Extender extender) {
                extender.extend(this);
                return this;
            }

            private void checkContextualActionNullFields() {
                if (this.mIsContextual == true) goto L6;
                return;
            L6:
                if (this.mIntent == null) goto L9;
                return;
            L9:
                throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
            }

            public Action build() {
                checkContextualActionNullFields();
                List<RemoteInput> dataOnlyInputs = new ArrayList();
                List<RemoteInput> textInputs = new ArrayList();
                if (this.mRemoteInputs == null) goto L12;
                Iterator<RemoteInput> r3 = this.mRemoteInputs.iterator();
            L6:
                if (r3.hasNext() == false) goto L12;
                RemoteInput input = r3.next();
                if (input.isDataOnly() == true) goto L9;
                textInputs.add(input);
                goto L6
            L9:
                dataOnlyInputs.add(input);
            L12:
                RemoteInput[] r4 = null;
                if (dataOnlyInputs.isEmpty() == false) goto L15;
                RemoteInput[] r5 = null;
            L16:
                RemoteInput[] dataOnlyInputsArr = r5;
                if (textInputs.isEmpty() == true) goto L20;
                r4 = (RemoteInput[]) textInputs.toArray(new RemoteInput[textInputs.size()]);
            L20:
                RemoteInput[] textInputsArr = r4;
                return new Action(this.mIcon, this.mTitle, this.mIntent, this.mExtras, textInputsArr, dataOnlyInputsArr, this.mAllowGeneratedReplies, this.mSemanticAction, this.mShowsUserInterface, this.mIsContextual, this.mAuthenticationRequired);
            L15:
                r5 = (RemoteInput[]) dataOnlyInputs.toArray(new RemoteInput[dataOnlyInputs.size()]);
                goto L16
            }
        }

        public interface Extender {
            Builder extend(Builder r1);
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface SemanticAction {
        }

        public static final class WearableExtender implements Extender {
            private static final int DEFAULT_FLAGS = 1;
            private static final String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
            private static final int FLAG_AVAILABLE_OFFLINE = 1;
            private static final int FLAG_HINT_DISPLAY_INLINE = 4;
            private static final int FLAG_HINT_LAUNCHES_ACTIVITY = 2;
            private static final String KEY_CANCEL_LABEL = "cancelLabel";
            private static final String KEY_CONFIRM_LABEL = "confirmLabel";
            private static final String KEY_FLAGS = "flags";
            private static final String KEY_IN_PROGRESS_LABEL = "inProgressLabel";
            private CharSequence mCancelLabel;
            private CharSequence mConfirmLabel;
            private int mFlags;
            private CharSequence mInProgressLabel;

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ Object m7231clone() throws CloneNotSupportedException {
                return clone();
            }

            public WearableExtender() {
                this.mFlags = 1;
            }

            public WearableExtender(Action action) {
                this.mFlags = 1;
                Bundle wearableBundle = action.getExtras().getBundle(EXTRA_WEARABLE_EXTENSIONS);
                if (wearableBundle == null) goto L6;
                this.mFlags = wearableBundle.getInt(KEY_FLAGS, 1);
                this.mInProgressLabel = wearableBundle.getCharSequence(KEY_IN_PROGRESS_LABEL);
                this.mConfirmLabel = wearableBundle.getCharSequence(KEY_CONFIRM_LABEL);
                this.mCancelLabel = wearableBundle.getCharSequence(KEY_CANCEL_LABEL);
                return;
            }

            @Override // androidx.core.app.NotificationCompat.Action.Extender
            public Builder extend(Builder builder) {
                Bundle wearableBundle = new Bundle();
                if (this.mFlags == 1) goto L6;
                wearableBundle.putInt(KEY_FLAGS, this.mFlags);
            L6:
                if (this.mInProgressLabel == null) goto L9;
                wearableBundle.putCharSequence(KEY_IN_PROGRESS_LABEL, this.mInProgressLabel);
            L9:
                if (this.mConfirmLabel == null) goto L12;
                wearableBundle.putCharSequence(KEY_CONFIRM_LABEL, this.mConfirmLabel);
            L12:
                if (this.mCancelLabel == null) goto L14;
                wearableBundle.putCharSequence(KEY_CANCEL_LABEL, this.mCancelLabel);
            L14:
                builder.getExtras().putBundle(EXTRA_WEARABLE_EXTENSIONS, wearableBundle);
                return builder;
            }

            public WearableExtender clone() {
                WearableExtender that = new WearableExtender();
                that.mFlags = this.mFlags;
                that.mInProgressLabel = this.mInProgressLabel;
                that.mConfirmLabel = this.mConfirmLabel;
                that.mCancelLabel = this.mCancelLabel;
                return that;
            }

            public WearableExtender setAvailableOffline(boolean availableOffline) {
                setFlag(1, availableOffline);
                return this;
            }

            public boolean isAvailableOffline() {
                if ((this.mFlags & 1) != 0) goto L7;
                return false;
            L7:
                return true;
            }

            private void setFlag(int mask, boolean value) {
                int r0 = this.mFlags;
                if (value == false) goto L5;
                this.mFlags = r0 | mask;
                return;
            L5:
                this.mFlags = r0 & (~mask);
            }

            @Deprecated
            public WearableExtender setInProgressLabel(CharSequence label) {
                this.mInProgressLabel = label;
                return this;
            }

            @Deprecated
            public CharSequence getInProgressLabel() {
                return this.mInProgressLabel;
            }

            @Deprecated
            public WearableExtender setConfirmLabel(CharSequence label) {
                this.mConfirmLabel = label;
                return this;
            }

            @Deprecated
            public CharSequence getConfirmLabel() {
                return this.mConfirmLabel;
            }

            @Deprecated
            public WearableExtender setCancelLabel(CharSequence label) {
                this.mCancelLabel = label;
                return this;
            }

            @Deprecated
            public CharSequence getCancelLabel() {
                return this.mCancelLabel;
            }

            public WearableExtender setHintLaunchesActivity(boolean hintLaunchesActivity) {
                setFlag(2, hintLaunchesActivity);
                return this;
            }

            public boolean getHintLaunchesActivity() {
                if ((this.mFlags & 2) == 0) goto L5;
                return true;
            L5:
                return false;
            }

            public WearableExtender setHintDisplayActionInline(boolean hintDisplayInline) {
                setFlag(4, hintDisplayInline);
                return this;
            }

            public boolean getHintDisplayActionInline() {
                if ((this.mFlags & 4) == 0) goto L5;
                return true;
            L5:
                return false;
            }
        }

        public Action(int icon, CharSequence title, PendingIntent intent) {
            IconCompat r0 = null;
            if (icon == 0) goto L6;
            r0 = IconCompat.createWithResource(null, "", icon);
        L6:
            this(r0, title, intent);
        }

        public Action(IconCompat icon, CharSequence title, PendingIntent intent) {
            this(icon, title, intent, new Bundle(), null, null, true, 0, true, false, false);
        }

        Action(int icon, CharSequence title, PendingIntent intent, Bundle extras, RemoteInput[] remoteInputs, RemoteInput[] dataOnlyRemoteInputs, boolean allowGeneratedReplies, int semanticAction, boolean showsUserInterface, boolean isContextual, boolean requireAuth) {
            IconCompat r0 = null;
            if (icon == 0) goto L6;
            r0 = IconCompat.createWithResource(null, "", icon);
        L6:
            this(r0, title, intent, extras, remoteInputs, dataOnlyRemoteInputs, allowGeneratedReplies, semanticAction, showsUserInterface, isContextual, requireAuth);
        }

        Action(IconCompat icon, CharSequence title, PendingIntent intent, Bundle extras, RemoteInput[] remoteInputs, RemoteInput[] dataOnlyRemoteInputs, boolean allowGeneratedReplies, int semanticAction, boolean showsUserInterface, boolean isContextual, boolean requireAuth) {
            this.mShowsUserInterface = true;
            this.mIcon = icon;
            if (icon != null) goto L5;
        L7:
            this.title = Builder.limitCharSequenceLength(title);
            this.actionIntent = intent;
            if (extras == null) goto L10;
            Bundle r0 = extras;
        L11:
            this.mExtras = r0;
            this.mRemoteInputs = remoteInputs;
            this.mDataOnlyRemoteInputs = dataOnlyRemoteInputs;
            this.mAllowGeneratedReplies = allowGeneratedReplies;
            this.mSemanticAction = semanticAction;
            this.mShowsUserInterface = showsUserInterface;
            this.mIsContextual = isContextual;
            this.mAuthenticationRequired = requireAuth;
            return;
        L10:
            r0 = new Bundle();
            goto L11
        L5:
            if (icon.getType() != 2) goto L7;
            this.icon = icon.getResId();
            goto L7
        }

        @Deprecated
        public int getIcon() {
            return this.icon;
        }

        public IconCompat getIconCompat() {
            if (this.mIcon != null) goto L8;
            if (this.icon == 0) goto L8;
            this.mIcon = IconCompat.createWithResource(null, "", this.icon);
        L8:
            return this.mIcon;
        }

        public CharSequence getTitle() {
            return this.title;
        }

        public PendingIntent getActionIntent() {
            return this.actionIntent;
        }

        public Bundle getExtras() {
            return this.mExtras;
        }

        public boolean getAllowGeneratedReplies() {
            return this.mAllowGeneratedReplies;
        }

        public boolean isAuthenticationRequired() {
            return this.mAuthenticationRequired;
        }

        public RemoteInput[] getRemoteInputs() {
            return this.mRemoteInputs;
        }

        public int getSemanticAction() {
            return this.mSemanticAction;
        }

        public boolean isContextual() {
            return this.mIsContextual;
        }

        public RemoteInput[] getDataOnlyRemoteInputs() {
            return this.mDataOnlyRemoteInputs;
        }

        public boolean getShowsUserInterface() {
            return this.mShowsUserInterface;
        }
    }

    static class Api20Impl {
        private Api20Impl() {
        }

        static boolean getAllowFreeFormInput(android.app.RemoteInput remoteInput) {
            return remoteInput.getAllowFreeFormInput();
        }

        static CharSequence[] getChoices(android.app.RemoteInput remoteInput) {
            return remoteInput.getChoices();
        }

        static CharSequence getLabel(android.app.RemoteInput remoteInput) {
            return remoteInput.getLabel();
        }

        static String getResultKey(android.app.RemoteInput remoteInput) {
            return remoteInput.getResultKey();
        }

        static android.app.RemoteInput[] getRemoteInputs(Notification.Action action) {
            return action.getRemoteInputs();
        }

        static String getSortKey(Notification notification) {
            return notification.getSortKey();
        }

        static String getGroup(Notification notification) {
            return notification.getGroup();
        }

        static Bundle getExtras(Notification.Action action) {
            return action.getExtras();
        }

        static Bundle getExtras(android.app.RemoteInput remoteInput) {
            return remoteInput.getExtras();
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static Icon getIcon(Notification.Action action) {
            return action.getIcon();
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static boolean getAllowGeneratedReplies(Notification.Action action) {
            return action.getAllowGeneratedReplies();
        }
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static int getGroupAlertBehavior(Notification notification) {
            return notification.getGroupAlertBehavior();
        }

        static CharSequence getSettingsText(Notification notification) {
            return notification.getSettingsText();
        }

        static String getShortcutId(Notification notification) {
            return notification.getShortcutId();
        }

        static int getBadgeIconType(Notification notification) {
            return notification.getBadgeIconType();
        }

        static long getTimeoutAfter(Notification notification) {
            return notification.getTimeoutAfter();
        }

        static String getChannelId(Notification notification) {
            return notification.getChannelId();
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static int getSemanticAction(Notification.Action action) {
            return action.getSemanticAction();
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static boolean getAllowSystemGeneratedContextualActions(Notification notification) {
            return notification.getAllowSystemGeneratedContextualActions();
        }

        static LocusId getLocusId(Notification notification) {
            return notification.getLocusId();
        }

        static boolean isContextual(Notification.Action action) {
            return action.isContextual();
        }

        static int getEditChoicesBeforeSending(android.app.RemoteInput remoteInput) {
            return remoteInput.getEditChoicesBeforeSending();
        }

        static Notification.BubbleMetadata getBubbleMetadata(Notification notification) {
            return notification.getBubbleMetadata();
        }
    }

    static class Api31Impl {
        private Api31Impl() {
        }

        static boolean isAuthenticationRequired(Notification.Action action) {
            return action.isAuthenticationRequired();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface BadgeIconType {
    }

    public static class BigPictureStyle extends Style {
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$BigPictureStyle";
        private IconCompat mBigLargeIcon;
        private boolean mBigLargeIconSet;
        private CharSequence mPictureContentDescription;
        private IconCompat mPictureIcon;
        private boolean mShowBigPictureWhenCollapsed;

        private static class Api23Impl {
            private Api23Impl() {
            }

            static void setBigLargeIcon(Notification.BigPictureStyle style, Icon icon) {
                style.bigLargeIcon(icon);
            }
        }

        private static class Api31Impl {
            private Api31Impl() {
            }

            static void showBigPictureWhenCollapsed(Notification.BigPictureStyle style, boolean show) {
                style.showBigPictureWhenCollapsed(show);
            }

            static void setContentDescription(Notification.BigPictureStyle style, CharSequence contentDescription) {
                style.setContentDescription(contentDescription);
            }

            static void setBigPicture(Notification.BigPictureStyle style, Icon icon) {
                style.bigPicture(icon);
            }
        }

        public BigPictureStyle() {
        }

        public BigPictureStyle(Builder builder) {
            setBuilder(builder);
        }

        public BigPictureStyle setBigContentTitle(CharSequence title) {
            this.mBigContentTitle = Builder.limitCharSequenceLength(title);
            return this;
        }

        public BigPictureStyle setSummaryText(CharSequence cs) {
            this.mSummaryText = Builder.limitCharSequenceLength(cs);
            this.mSummaryTextSet = true;
            return this;
        }

        public BigPictureStyle setContentDescription(CharSequence contentDescription) {
            this.mPictureContentDescription = contentDescription;
            return this;
        }

        public BigPictureStyle bigPicture(Bitmap b) {
            if (b != null) goto L4;
            IconCompat r0 = null;
        L5:
            this.mPictureIcon = r0;
            return this;
        L4:
            r0 = IconCompat.createWithBitmap(b);
            goto L5
        }

        public BigPictureStyle bigPicture(Icon i) {
            this.mPictureIcon = IconCompat.createFromIcon(i);
            return this;
        }

        public BigPictureStyle showBigPictureWhenCollapsed(boolean show) {
            this.mShowBigPictureWhenCollapsed = show;
            return this;
        }

        public BigPictureStyle bigLargeIcon(Bitmap b) {
            if (b != null) goto L4;
            IconCompat r0 = null;
        L5:
            this.mBigLargeIcon = r0;
            this.mBigLargeIconSet = true;
            return this;
        L4:
            r0 = IconCompat.createWithBitmap(b);
            goto L5
        }

        public BigPictureStyle bigLargeIcon(Icon i) {
            if (i != null) goto L4;
            IconCompat r0 = null;
        L5:
            this.mBigLargeIcon = r0;
            this.mBigLargeIconSet = true;
            return this;
        L4:
            r0 = IconCompat.createFromIcon(i);
            goto L5
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(NotificationBuilderWithBuilderAccessor builder) {
            Notification.Builder builder1 = builder.getBuilder();
            Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle(builder1);
            Notification.BigPictureStyle style = bigPictureStyle.setBigContentTitle(this.mBigContentTitle);
            if (this.mPictureIcon == null) goto L15;
            if (Build.VERSION.SDK_INT < 31) goto L11;
            Context context = null;
            if ((builder instanceof NotificationCompatBuilder) == false) goto L9;
            context = ((NotificationCompatBuilder) builder).getContext();
        L9:
            Api31Impl.setBigPicture(style, this.mPictureIcon.toIcon(context));
            goto L15
        L11:
            if (this.mPictureIcon.getType() != 1) goto L15;
            Bitmap b = this.mPictureIcon.getBitmap();
            style = style.bigPicture(b);
        L15:
            if (this.mBigLargeIconSet == false) goto L24;
            if (this.mBigLargeIcon != null) goto L19;
            Bitmap r5 = (Bitmap) null;
            style.bigLargeIcon(null);
            goto L24
        L19:
            Context context2 = null;
            if ((builder instanceof NotificationCompatBuilder) == false) goto L22;
            context2 = ((NotificationCompatBuilder) builder).getContext();
        L22:
            Api23Impl.setBigLargeIcon(style, this.mBigLargeIcon.toIcon(context2));
        L24:
            if (this.mSummaryTextSet == false) goto L27;
            style.setSummaryText(this.mSummaryText);
        L27:
            if (Build.VERSION.SDK_INT < 31) goto L30;
            Api31Impl.showBigPictureWhenCollapsed(style, this.mShowBigPictureWhenCollapsed);
            Api31Impl.setContentDescription(style, this.mPictureContentDescription);
            return;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void restoreFromCompatExtras(Bundle extras) {
            super.restoreFromCompatExtras(extras);
            if (extras.containsKey(NotificationCompat.EXTRA_LARGE_ICON_BIG) == false) goto L5;
            this.mBigLargeIcon = asIconCompat(extras.getParcelable(NotificationCompat.EXTRA_LARGE_ICON_BIG));
            this.mBigLargeIconSet = true;
        L5:
            this.mPictureIcon = getPictureIcon(extras);
            this.mShowBigPictureWhenCollapsed = extras.getBoolean(NotificationCompat.EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED);
        }

        public static IconCompat getPictureIcon(Bundle extras) {
            if (extras != null) goto L5;
            return null;
        L5:
            Parcelable bitmapPicture = extras.getParcelable(NotificationCompat.EXTRA_PICTURE);
            if (bitmapPicture == null) goto L10;
            return asIconCompat(bitmapPicture);
        L10:
            return asIconCompat(extras.getParcelable(NotificationCompat.EXTRA_PICTURE_ICON));
        }

        private static IconCompat asIconCompat(Parcelable bitmapOrIcon) {
            if (bitmapOrIcon != null) goto L4;
            return null;
        L4:
            if ((bitmapOrIcon instanceof Icon) == false) goto L8;
            return IconCompat.createFromIcon((Icon) bitmapOrIcon);
        L8:
            if ((bitmapOrIcon instanceof Bitmap) == true) goto L10;
            return null;
        L10:
            return IconCompat.createWithBitmap((Bitmap) bitmapOrIcon);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void clearCompatExtraKeys(Bundle extras) {
            super.clearCompatExtraKeys(extras);
            extras.remove(NotificationCompat.EXTRA_LARGE_ICON_BIG);
            extras.remove(NotificationCompat.EXTRA_PICTURE);
            extras.remove(NotificationCompat.EXTRA_PICTURE_ICON);
            extras.remove(NotificationCompat.EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED);
        }
    }

    public static class BigTextStyle extends Style {
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$BigTextStyle";
        private CharSequence mBigText;

        public BigTextStyle() {
        }

        public BigTextStyle(Builder builder) {
            setBuilder(builder);
        }

        public BigTextStyle setBigContentTitle(CharSequence title) {
            this.mBigContentTitle = Builder.limitCharSequenceLength(title);
            return this;
        }

        public BigTextStyle setSummaryText(CharSequence cs) {
            this.mSummaryText = Builder.limitCharSequenceLength(cs);
            this.mSummaryTextSet = true;
            return this;
        }

        public BigTextStyle bigText(CharSequence cs) {
            this.mBigText = Builder.limitCharSequenceLength(cs);
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(NotificationBuilderWithBuilderAccessor builder) {
            Notification.Builder builder1 = builder.getBuilder();
            Notification.BigTextStyle style = new Notification.BigTextStyle(builder1);
            Notification.BigTextStyle style2 = style.setBigContentTitle(this.mBigContentTitle).bigText(this.mBigText);
            if (this.mSummaryTextSet == false) goto L6;
            style2.setSummaryText(this.mSummaryText);
            return;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void restoreFromCompatExtras(Bundle extras) {
            super.restoreFromCompatExtras(extras);
            this.mBigText = extras.getCharSequence(NotificationCompat.EXTRA_BIG_TEXT);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void addCompatExtras(Bundle extras) {
            super.addCompatExtras(extras);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void clearCompatExtraKeys(Bundle extras) {
            super.clearCompatExtraKeys(extras);
            extras.remove(NotificationCompat.EXTRA_BIG_TEXT);
        }
    }

    public static final class BubbleMetadata {
        private static final int FLAG_AUTO_EXPAND_BUBBLE = 1;
        private static final int FLAG_SUPPRESS_NOTIFICATION = 2;
        private PendingIntent mDeleteIntent;
        private int mDesiredHeight;
        private int mDesiredHeightResId;
        private int mFlags;
        private IconCompat mIcon;
        private PendingIntent mPendingIntent;
        private String mShortcutId;

        private static class Api29Impl {
            private Api29Impl() {
            }

            static Notification.BubbleMetadata toPlatform(BubbleMetadata compatMetadata) {
                if (compatMetadata != null) goto L6;
                return null;
            L6:
                if (compatMetadata.getIntent() != null) goto L8;
                return null;
            L8:
                Notification.BubbleMetadata.Builder platformMetadataBuilder = new Notification.BubbleMetadata.Builder().setIcon(compatMetadata.getIcon().toIcon()).setIntent(compatMetadata.getIntent()).setDeleteIntent(compatMetadata.getDeleteIntent()).setAutoExpandBubble(compatMetadata.getAutoExpandBubble()).setSuppressNotification(compatMetadata.isNotificationSuppressed());
                if (compatMetadata.getDesiredHeight() == 0) goto L12;
                platformMetadataBuilder.setDesiredHeight(compatMetadata.getDesiredHeight());
            L12:
                if (compatMetadata.getDesiredHeightResId() == 0) goto L15;
                platformMetadataBuilder.setDesiredHeightResId(compatMetadata.getDesiredHeightResId());
            L15:
                return platformMetadataBuilder.build();
            }

            static BubbleMetadata fromPlatform(Notification.BubbleMetadata platformMetadata) {
                if (platformMetadata != null) goto L6;
                return null;
            L6:
                if (platformMetadata.getIntent() != null) goto L8;
                return null;
            L8:
                Builder compatBuilder = new Builder(platformMetadata.getIntent(), IconCompat.createFromIcon(platformMetadata.getIcon())).setAutoExpandBubble(platformMetadata.getAutoExpandBubble()).setDeleteIntent(platformMetadata.getDeleteIntent()).setSuppressNotification(platformMetadata.isNotificationSuppressed());
                if (platformMetadata.getDesiredHeight() == 0) goto L12;
                compatBuilder.setDesiredHeight(platformMetadata.getDesiredHeight());
            L12:
                if (platformMetadata.getDesiredHeightResId() == 0) goto L15;
                compatBuilder.setDesiredHeightResId(platformMetadata.getDesiredHeightResId());
            L15:
                return compatBuilder.build();
            }
        }

        private static class Api30Impl {
            private Api30Impl() {
            }

            static Notification.BubbleMetadata toPlatform(BubbleMetadata compatMetadata) {
                if (compatMetadata != null) goto L6;
                return null;
            L6:
                if (compatMetadata.getShortcutId() == null) goto L8;
                Notification.BubbleMetadata.Builder platformMetadataBuilder = new Notification.BubbleMetadata.Builder(compatMetadata.getShortcutId());
            L9:
                platformMetadataBuilder.setDeleteIntent(compatMetadata.getDeleteIntent()).setAutoExpandBubble(compatMetadata.getAutoExpandBubble()).setSuppressNotification(compatMetadata.isNotificationSuppressed());
                if (compatMetadata.getDesiredHeight() == 0) goto L13;
                platformMetadataBuilder.setDesiredHeight(compatMetadata.getDesiredHeight());
            L13:
                if (compatMetadata.getDesiredHeightResId() == 0) goto L16;
                platformMetadataBuilder.setDesiredHeightResId(compatMetadata.getDesiredHeightResId());
            L16:
                return platformMetadataBuilder.build();
            L8:
                platformMetadataBuilder = new Notification.BubbleMetadata.Builder(compatMetadata.getIntent(), compatMetadata.getIcon().toIcon());
                goto L9
            }

            static BubbleMetadata fromPlatform(Notification.BubbleMetadata platformMetadata) {
                if (platformMetadata != null) goto L6;
                return null;
            L6:
                if (platformMetadata.getShortcutId() == null) goto L8;
                Builder compatBuilder = new Builder(platformMetadata.getShortcutId());
            L9:
                compatBuilder.setAutoExpandBubble(platformMetadata.getAutoExpandBubble()).setDeleteIntent(platformMetadata.getDeleteIntent()).setSuppressNotification(platformMetadata.isNotificationSuppressed());
                if (platformMetadata.getDesiredHeight() == 0) goto L13;
                compatBuilder.setDesiredHeight(platformMetadata.getDesiredHeight());
            L13:
                if (platformMetadata.getDesiredHeightResId() == 0) goto L16;
                compatBuilder.setDesiredHeightResId(platformMetadata.getDesiredHeightResId());
            L16:
                return compatBuilder.build();
            L8:
                compatBuilder = new Builder(platformMetadata.getIntent(), IconCompat.createFromIcon(platformMetadata.getIcon()));
                goto L9
            }
        }

        public static final class Builder {
            private PendingIntent mDeleteIntent;
            private int mDesiredHeight;
            private int mDesiredHeightResId;
            private int mFlags;
            private IconCompat mIcon;
            private PendingIntent mPendingIntent;
            private String mShortcutId;

            @Deprecated
            public Builder() {
            }

            public Builder(String shortcutId) {
                if (TextUtils.isEmpty(shortcutId) == true) goto L7;
                this.mShortcutId = shortcutId;
                return;
            L7:
                throw new NullPointerException("Bubble requires a non-null shortcut id");
            }

            public Builder(PendingIntent intent, IconCompat icon) {
                if (intent == null) goto L10;
                if (icon == null) goto L8;
                this.mPendingIntent = intent;
                this.mIcon = icon;
                return;
            L8:
                throw new NullPointerException("Bubbles require non-null icon");
            L10:
                throw new NullPointerException("Bubble requires non-null pending intent");
            }

            public Builder setIntent(PendingIntent intent) {
                if (this.mShortcutId != null) goto L10;
                if (intent == null) goto L8;
                this.mPendingIntent = intent;
                return this;
            L8:
                throw new NullPointerException("Bubble requires non-null pending intent");
            L10:
                throw new IllegalStateException("Created as a shortcut bubble, cannot set a PendingIntent. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
            }

            public Builder setIcon(IconCompat icon) {
                if (this.mShortcutId != null) goto L10;
                if (icon == null) goto L8;
                this.mIcon = icon;
                return this;
            L8:
                throw new NullPointerException("Bubbles require non-null icon");
            L10:
                throw new IllegalStateException("Created as a shortcut bubble, cannot set an Icon. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
            }

            public Builder setDesiredHeight(int height) {
                this.mDesiredHeight = Math.max(height, 0);
                this.mDesiredHeightResId = 0;
                return this;
            }

            public Builder setDesiredHeightResId(int heightResId) {
                this.mDesiredHeightResId = heightResId;
                this.mDesiredHeight = 0;
                return this;
            }

            public Builder setAutoExpandBubble(boolean shouldExpand) {
                setFlag(1, shouldExpand);
                return this;
            }

            public Builder setSuppressNotification(boolean shouldSuppressNotif) {
                setFlag(2, shouldSuppressNotif);
                return this;
            }

            public Builder setDeleteIntent(PendingIntent deleteIntent) {
                this.mDeleteIntent = deleteIntent;
                return this;
            }

            public BubbleMetadata build() {
                if (this.mShortcutId != null) goto L10;
                if (this.mPendingIntent != null) goto L10;
                throw new NullPointerException("Must supply pending intent or shortcut to bubble");
            L10:
                if (this.mShortcutId == null) goto L12;
            L16:
                BubbleMetadata data = new BubbleMetadata(this.mPendingIntent, this.mDeleteIntent, this.mIcon, this.mDesiredHeight, this.mDesiredHeightResId, this.mFlags, this.mShortcutId, null);
                data.setFlags(this.mFlags);
                return data;
            L12:
                if (this.mIcon != null) goto L16;
                throw new NullPointerException("Must supply an icon or shortcut for the bubble");
            }

            private Builder setFlag(int mask, boolean value) {
                int r0 = this.mFlags;
                if (value == false) goto L5;
                this.mFlags = r0 | mask;
            L6:
                return this;
            L5:
                this.mFlags = r0 & (~mask);
                goto L6
            }
        }

        /* synthetic */ BubbleMetadata(PendingIntent x0, PendingIntent x1, IconCompat x2, int x3, int x4, int x5, String x6, AnonymousClass1 x7) {
            this(x0, x1, x2, x3, x4, x5, x6);
        }

        private BubbleMetadata(PendingIntent expandIntent, PendingIntent deleteIntent, IconCompat icon, int height, int heightResId, int flags, String shortcutId) {
            this.mPendingIntent = expandIntent;
            this.mIcon = icon;
            this.mDesiredHeight = height;
            this.mDesiredHeightResId = heightResId;
            this.mDeleteIntent = deleteIntent;
            this.mFlags = flags;
            this.mShortcutId = shortcutId;
        }

        public PendingIntent getIntent() {
            return this.mPendingIntent;
        }

        public String getShortcutId() {
            return this.mShortcutId;
        }

        public PendingIntent getDeleteIntent() {
            return this.mDeleteIntent;
        }

        public IconCompat getIcon() {
            return this.mIcon;
        }

        public int getDesiredHeight() {
            return this.mDesiredHeight;
        }

        public int getDesiredHeightResId() {
            return this.mDesiredHeightResId;
        }

        public boolean getAutoExpandBubble() {
            if ((this.mFlags & 1) != 0) goto L7;
            return false;
        L7:
            return true;
        }

        public boolean isNotificationSuppressed() {
            if ((this.mFlags & 2) == 0) goto L5;
            return true;
        L5:
            return false;
        }

        public void setFlags(int flags) {
            this.mFlags = flags;
        }

        public static Notification.BubbleMetadata toPlatform(BubbleMetadata compatMetadata) {
            if (compatMetadata != null) goto L6;
            return null;
        L6:
            if (Build.VERSION.SDK_INT < 30) goto L10;
            return Api30Impl.toPlatform(compatMetadata);
        L10:
            if (Build.VERSION.SDK_INT == 29) goto L12;
            return null;
        L12:
            return Api29Impl.toPlatform(compatMetadata);
        }

        public static BubbleMetadata fromPlatform(Notification.BubbleMetadata platformMetadata) {
            if (platformMetadata != null) goto L6;
            return null;
        L6:
            if (Build.VERSION.SDK_INT < 30) goto L10;
            return Api30Impl.fromPlatform(platformMetadata);
        L10:
            if (Build.VERSION.SDK_INT == 29) goto L12;
            return null;
        L12:
            return Api29Impl.fromPlatform(platformMetadata);
        }
    }

    public static class Builder {
        private static final int MAX_CHARSEQUENCE_LENGTH = 5120;
        public ArrayList<Action> mActions;
        boolean mAllowSystemGeneratedContextualActions;
        int mBadgeIcon;
        RemoteViews mBigContentView;
        BubbleMetadata mBubbleMetadata;
        String mCategory;
        String mChannelId;
        boolean mChronometerCountDown;
        int mColor;
        boolean mColorized;
        boolean mColorizedSet;
        CharSequence mContentInfo;
        PendingIntent mContentIntent;
        CharSequence mContentText;
        CharSequence mContentTitle;
        RemoteViews mContentView;
        public Context mContext;
        Bundle mExtras;
        int mFgsDeferBehavior;
        PendingIntent mFullScreenIntent;
        int mGroupAlertBehavior;
        String mGroupKey;
        boolean mGroupSummary;
        RemoteViews mHeadsUpContentView;
        ArrayList<Action> mInvisibleActions;
        IconCompat mLargeIcon;
        boolean mLocalOnly;
        LocusIdCompat mLocusId;
        Notification mNotification;
        int mNumber;

        @Deprecated
        public ArrayList<String> mPeople;
        public ArrayList<Person> mPersonList;
        int mPriority;
        int mProgress;
        boolean mProgressIndeterminate;
        int mProgressMax;
        Notification mPublicVersion;
        CharSequence[] mRemoteInputHistory;
        CharSequence mSettingsText;
        String mShortcutId;
        boolean mShowWhen;
        boolean mSilent;
        Object mSmallIcon;
        String mSortKey;
        Style mStyle;
        CharSequence mSubText;
        RemoteViews mTickerView;
        long mTimeout;
        boolean mUseChronometer;
        int mVisibility;

        static class Api21Impl {
            private Api21Impl() {
            }

            static AudioAttributes.Builder createBuilder() {
                return new AudioAttributes.Builder();
            }

            static AudioAttributes.Builder setContentType(AudioAttributes.Builder builder, int contentType) {
                return builder.setContentType(contentType);
            }

            static AudioAttributes.Builder setUsage(AudioAttributes.Builder builder, int usage) {
                return builder.setUsage(usage);
            }

            static AudioAttributes.Builder setLegacyStreamType(AudioAttributes.Builder builder, int streamType) {
                return builder.setLegacyStreamType(streamType);
            }

            static AudioAttributes build(AudioAttributes.Builder builder) {
                return builder.build();
            }
        }

        static class Api23Impl {
            private Api23Impl() {
            }

            static Icon getSmallIcon(Notification notification) {
                return notification.getSmallIcon();
            }

            static Icon getLargeIcon(Notification notification) {
                return notification.getLargeIcon();
            }
        }

        static class Api24Impl {
            private Api24Impl() {
            }

            static Notification.Builder recoverBuilder(Context context, Notification n) {
                return Notification.Builder.recoverBuilder(context, n);
            }

            static RemoteViews createContentView(Notification.Builder builder) {
                return builder.createContentView();
            }

            static RemoteViews createHeadsUpContentView(Notification.Builder builder) {
                return builder.createHeadsUpContentView();
            }

            static RemoteViews createBigContentView(Notification.Builder builder) {
                return builder.createHeadsUpContentView();
            }
        }

        public Builder(Context context, Notification notification) {
            this(context, NotificationCompat.getChannelId(notification));
            Bundle extras = notification.extras;
            Style style = Style.extractStyleFromNotification(notification);
            setContentTitle(NotificationCompat.getContentTitle(notification)).setContentText(NotificationCompat.getContentText(notification)).setContentInfo(NotificationCompat.getContentInfo(notification)).setSubText(NotificationCompat.getSubText(notification)).setSettingsText(NotificationCompat.getSettingsText(notification)).setStyle(style).setGroup(NotificationCompat.getGroup(notification)).setGroupSummary(NotificationCompat.isGroupSummary(notification)).setLocusId(NotificationCompat.getLocusId(notification)).setWhen(notification.when).setShowWhen(NotificationCompat.getShowWhen(notification)).setUsesChronometer(NotificationCompat.getUsesChronometer(notification)).setAutoCancel(NotificationCompat.getAutoCancel(notification)).setOnlyAlertOnce(NotificationCompat.getOnlyAlertOnce(notification)).setOngoing(NotificationCompat.getOngoing(notification)).setLocalOnly(NotificationCompat.getLocalOnly(notification)).setLargeIcon(notification.largeIcon).setBadgeIconType(NotificationCompat.getBadgeIconType(notification)).setCategory(NotificationCompat.getCategory(notification)).setBubbleMetadata(NotificationCompat.getBubbleMetadata(notification)).setNumber(notification.number).setTicker(notification.tickerText).setContentIntent(notification.contentIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(notification.fullScreenIntent, NotificationCompat.getHighPriority(notification)).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setDefaults(notification.defaults).setPriority(notification.priority).setColor(NotificationCompat.getColor(notification)).setVisibility(NotificationCompat.getVisibility(notification)).setPublicVersion(NotificationCompat.getPublicVersion(notification)).setSortKey(NotificationCompat.getSortKey(notification)).setTimeoutAfter(NotificationCompat.getTimeoutAfter(notification)).setShortcutId(NotificationCompat.getShortcutId(notification)).setProgress(extras.getInt(NotificationCompat.EXTRA_PROGRESS_MAX), extras.getInt(NotificationCompat.EXTRA_PROGRESS), extras.getBoolean(NotificationCompat.EXTRA_PROGRESS_INDETERMINATE)).setAllowSystemGeneratedContextualActions(NotificationCompat.getAllowSystemGeneratedContextualActions(notification)).setSmallIcon(notification.icon, notification.iconLevel).addExtras(getExtrasWithoutDuplicateData(notification, style));
            this.mSmallIcon = Api23Impl.getSmallIcon(notification);
            Icon largeIcon = Api23Impl.getLargeIcon(notification);
            if (largeIcon == null) goto L5;
            this.mLargeIcon = IconCompat.createFromIcon(largeIcon);
        L5:
            int r3 = 0;
            if (notification.actions != null) goto L8;
        L12:
            List<Action> invisibleActions = NotificationCompat.getInvisibleActions(notification);
            if (invisibleActions.isEmpty() == true) goto L18;
            Iterator<Action> r4 = invisibleActions.iterator();
        L16:
            if (r4.hasNext() == false) goto L18;
            Action invisibleAction = r4.next();
            addInvisibleAction(invisibleAction);
        L18:
            String[] people = notification.extras.getStringArray(NotificationCompat.EXTRA_PEOPLE);
            if (people == null) goto L26;
            if (people.length == 0) goto L26;
            int r5 = people.length;
        L23:
            if (r3 >= r5) goto L26;
            String person = people[r3];
            addPerson(person);
            r3 = r3 + 1;
        L26:
            if (Build.VERSION.SDK_INT < 28) goto L36;
            ArrayList<android.app.Person> peopleList = notification.extras.getParcelableArrayList(NotificationCompat.EXTRA_PEOPLE_LIST);
            if (peopleList == null) goto L36;
            if (peopleList.isEmpty() == true) goto L36;
            Iterator<android.app.Person> r6 = peopleList.iterator();
        L33:
            if (r6.hasNext() == false) goto L36;
            android.app.Person person2 = r6.next();
            addPerson(Person.fromAndroidPerson(person2));
        L36:
            if (extras.containsKey(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN) == false) goto L39;
            setChronometerCountDown(extras.getBoolean(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN));
        L39:
            if (extras.containsKey(NotificationCompat.EXTRA_COLORIZED) == false) goto L46;
            setColorized(extras.getBoolean(NotificationCompat.EXTRA_COLORIZED));
            return;
        L46:
            return;
        L8:
            if (notification.actions.length == 0) goto L12;
            Notification.Action[] r2 = notification.actions;
            int r7 = r2.length;
            int r8 = 0;
        L10:
            if (r8 >= r7) goto L12;
            Notification.Action action = r2[r8];
            addAction(Action.Builder.fromAndroidAction(action).build());
            r8 = r8 + 1;
            goto L10
        }

        private static Bundle getExtrasWithoutDuplicateData(Notification notification, Style style) {
            if (notification.extras != null) goto L6;
            return null;
        L6:
            Bundle newExtras = new Bundle(notification.extras);
            newExtras.remove(NotificationCompat.EXTRA_TITLE);
            newExtras.remove(NotificationCompat.EXTRA_TEXT);
            newExtras.remove(NotificationCompat.EXTRA_INFO_TEXT);
            newExtras.remove(NotificationCompat.EXTRA_SUB_TEXT);
            newExtras.remove(NotificationCompat.EXTRA_CHANNEL_ID);
            newExtras.remove(NotificationCompat.EXTRA_CHANNEL_GROUP_ID);
            newExtras.remove(NotificationCompat.EXTRA_SHOW_WHEN);
            newExtras.remove(NotificationCompat.EXTRA_PROGRESS);
            newExtras.remove(NotificationCompat.EXTRA_PROGRESS_MAX);
            newExtras.remove(NotificationCompat.EXTRA_PROGRESS_INDETERMINATE);
            newExtras.remove(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN);
            newExtras.remove(NotificationCompat.EXTRA_COLORIZED);
            newExtras.remove(NotificationCompat.EXTRA_PEOPLE_LIST);
            newExtras.remove(NotificationCompat.EXTRA_PEOPLE);
            newExtras.remove(NotificationCompatExtras.EXTRA_SORT_KEY);
            newExtras.remove(NotificationCompatExtras.EXTRA_GROUP_KEY);
            newExtras.remove(NotificationCompatExtras.EXTRA_GROUP_SUMMARY);
            newExtras.remove(NotificationCompatExtras.EXTRA_LOCAL_ONLY);
            newExtras.remove(NotificationCompatExtras.EXTRA_ACTION_EXTRAS);
            Bundle carExtenderExtras = newExtras.getBundle("android.car.EXTENSIONS");
            if (carExtenderExtras == null) goto L9;
            Bundle carExtenderExtras2 = new Bundle(carExtenderExtras);
            carExtenderExtras2.remove("invisible_actions");
            newExtras.putBundle("android.car.EXTENSIONS", carExtenderExtras2);
        L9:
            if (style == null) goto L11;
            style.clearCompatExtraKeys(newExtras);
        L11:
            return newExtras;
        }

        public Builder(Context context, String channelId) {
            this.mActions = new ArrayList();
            this.mPersonList = new ArrayList();
            this.mInvisibleActions = new ArrayList();
            this.mShowWhen = true;
            this.mLocalOnly = false;
            this.mColor = 0;
            this.mVisibility = 0;
            this.mBadgeIcon = 0;
            this.mGroupAlertBehavior = 0;
            this.mFgsDeferBehavior = 0;
            this.mNotification = new Notification();
            this.mContext = context;
            this.mChannelId = channelId;
            Notification r2 = this.mNotification;
            r2.when = System.currentTimeMillis();
            this.mNotification.audioStreamType = -1;
            this.mPriority = 0;
            this.mPeople = new ArrayList();
            this.mAllowSystemGeneratedContextualActions = true;
        }

        @Deprecated
        public Builder(Context context) {
            String r1 = (String) null;
            this(context, null);
        }

        public Builder setWhen(long when) {
            this.mNotification.when = when;
            return this;
        }

        public Builder setShowWhen(boolean show) {
            this.mShowWhen = show;
            return this;
        }

        public Builder setSmallIcon(IconCompat icon) {
            this.mSmallIcon = icon.toIcon(this.mContext);
            return this;
        }

        public Builder setUsesChronometer(boolean b) {
            this.mUseChronometer = b;
            return this;
        }

        public Builder setChronometerCountDown(boolean countsDown) {
            this.mChronometerCountDown = countsDown;
            getExtras().putBoolean(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN, countsDown);
            return this;
        }

        public Builder setSmallIcon(int icon) {
            this.mNotification.icon = icon;
            return this;
        }

        public Builder setSmallIcon(int icon, int level) {
            this.mNotification.icon = icon;
            this.mNotification.iconLevel = level;
            return this;
        }

        @Deprecated
        public Builder setNotificationSilent() {
            this.mSilent = true;
            return this;
        }

        public Builder setSilent(boolean silent) {
            this.mSilent = silent;
            return this;
        }

        public Builder setContentTitle(CharSequence title) {
            this.mContentTitle = limitCharSequenceLength(title);
            return this;
        }

        public Builder setContentText(CharSequence text) {
            this.mContentText = limitCharSequenceLength(text);
            return this;
        }

        public Builder setSubText(CharSequence text) {
            this.mSubText = limitCharSequenceLength(text);
            return this;
        }

        public Builder setSettingsText(CharSequence text) {
            this.mSettingsText = limitCharSequenceLength(text);
            return this;
        }

        public Builder setRemoteInputHistory(CharSequence[] text) {
            this.mRemoteInputHistory = text;
            return this;
        }

        public Builder setNumber(int number) {
            this.mNumber = number;
            return this;
        }

        public Builder setContentInfo(CharSequence info) {
            this.mContentInfo = limitCharSequenceLength(info);
            return this;
        }

        public Builder setProgress(int max, int progress, boolean indeterminate) {
            this.mProgressMax = max;
            this.mProgress = progress;
            this.mProgressIndeterminate = indeterminate;
            return this;
        }

        public Builder setContent(RemoteViews views) {
            this.mNotification.contentView = views;
            return this;
        }

        public Builder setContentIntent(PendingIntent intent) {
            this.mContentIntent = intent;
            return this;
        }

        public Builder setDeleteIntent(PendingIntent intent) {
            this.mNotification.deleteIntent = intent;
            return this;
        }

        public Builder setFullScreenIntent(PendingIntent intent, boolean highPriority) {
            this.mFullScreenIntent = intent;
            setFlag(128, highPriority);
            return this;
        }

        public Builder setTicker(CharSequence tickerText) {
            Notification r0 = this.mNotification;
            r0.tickerText = limitCharSequenceLength(tickerText);
            return this;
        }

        @Deprecated
        public Builder setTicker(CharSequence tickerText, RemoteViews views) {
            Notification r0 = this.mNotification;
            r0.tickerText = limitCharSequenceLength(tickerText);
            this.mTickerView = views;
            return this;
        }

        public Builder setLargeIcon(Bitmap icon) {
            if (icon != null) goto L4;
            IconCompat r0 = null;
        L5:
            this.mLargeIcon = r0;
            return this;
        L4:
            r0 = IconCompat.createWithBitmap(NotificationCompat.reduceLargeIconSize(this.mContext, icon));
            goto L5
        }

        public Builder setLargeIcon(Icon icon) {
            if (icon != null) goto L4;
            IconCompat r0 = null;
        L5:
            this.mLargeIcon = r0;
            return this;
        L4:
            r0 = IconCompat.createFromIcon(icon);
            goto L5
        }

        public Builder setSound(Uri sound) {
            this.mNotification.sound = sound;
            this.mNotification.audioStreamType = -1;
            AudioAttributes.Builder builder = Api21Impl.createBuilder();
            AudioAttributes.Builder builder2 = Api21Impl.setUsage(Api21Impl.setContentType(builder, 4), 5);
            Notification r1 = this.mNotification;
            r1.audioAttributes = Api21Impl.build(builder2);
            return this;
        }

        public Builder setSound(Uri sound, int streamType) {
            this.mNotification.sound = sound;
            this.mNotification.audioStreamType = streamType;
            AudioAttributes.Builder builder = Api21Impl.createBuilder();
            AudioAttributes.Builder builder2 = Api21Impl.setLegacyStreamType(Api21Impl.setContentType(builder, 4), streamType);
            Notification r1 = this.mNotification;
            r1.audioAttributes = Api21Impl.build(builder2);
            return this;
        }

        public Builder setVibrate(long[] pattern) {
            this.mNotification.vibrate = pattern;
            return this;
        }

        public Builder setLights(int argb, int onMs, int offMs) {
            this.mNotification.ledARGB = argb;
            this.mNotification.ledOnMS = onMs;
            this.mNotification.ledOffMS = offMs;
            int r1 = 1;
            if (this.mNotification.ledOnMS != 0) goto L5;
        L7:
            boolean showLights = false;
        L8:
            Notification r3 = this.mNotification;
            int r4 = this.mNotification.flags & (-2);
            if (showLights == true) goto L12;
            r1 = 0;
        L12:
            r3.flags = r1 | r4;
            return this;
        L5:
            if (this.mNotification.ledOffMS == 0) goto L7;
            showLights = true;
            goto L8
        }

        public Builder setOngoing(boolean ongoing) {
            setFlag(2, ongoing);
            return this;
        }

        public Builder setColorized(boolean colorize) {
            this.mColorized = colorize;
            this.mColorizedSet = true;
            return this;
        }

        public Builder setOnlyAlertOnce(boolean onlyAlertOnce) {
            setFlag(8, onlyAlertOnce);
            return this;
        }

        public Builder setAutoCancel(boolean autoCancel) {
            setFlag(16, autoCancel);
            return this;
        }

        public Builder setLocalOnly(boolean b) {
            this.mLocalOnly = b;
            return this;
        }

        public Builder setCategory(String category) {
            this.mCategory = category;
            return this;
        }

        public Builder setDefaults(int defaults) {
            this.mNotification.defaults = defaults;
            if ((defaults & 4) == 0) goto L5;
            this.mNotification.flags |= 1;
        L5:
            return this;
        }

        private void setFlag(int mask, boolean value) {
            Notification r0 = this.mNotification;
            if (value == false) goto L5;
            r0.flags |= mask;
            return;
        L5:
            r0.flags &= ~mask;
        }

        public Builder setPriority(int pri) {
            this.mPriority = pri;
            return this;
        }

        @Deprecated
        public Builder addPerson(String uri) {
            if (uri != null) goto L4;
        L6:
            return this;
        L4:
            if (uri.isEmpty() == true) goto L6;
            this.mPeople.add(uri);
            goto L6
        }

        public Builder addPerson(Person person) {
            if (person == null) goto L4;
            this.mPersonList.add(person);
        L4:
            return this;
        }

        public Builder clearPeople() {
            this.mPersonList.clear();
            this.mPeople.clear();
            return this;
        }

        public Builder setGroup(String groupKey) {
            this.mGroupKey = groupKey;
            return this;
        }

        public Builder setGroupSummary(boolean isGroupSummary) {
            this.mGroupSummary = isGroupSummary;
            return this;
        }

        public Builder setSortKey(String sortKey) {
            this.mSortKey = sortKey;
            return this;
        }

        public Builder addExtras(Bundle extras) {
            if (extras != null) goto L4;
        L7:
            return this;
        L4:
            if (this.mExtras != null) goto L6;
            this.mExtras = new Bundle(extras);
            goto L7
        L6:
            this.mExtras.putAll(extras);
            goto L7
        }

        public Builder setExtras(Bundle extras) {
            this.mExtras = extras;
            return this;
        }

        public Bundle getExtras() {
            if (this.mExtras != null) goto L6;
            this.mExtras = new Bundle();
        L6:
            return this.mExtras;
        }

        public Builder addAction(int icon, CharSequence title, PendingIntent intent) {
            this.mActions.add(new Action(icon, title, intent));
            return this;
        }

        public Builder addAction(Action action) {
            if (action == null) goto L4;
            this.mActions.add(action);
        L4:
            return this;
        }

        public Builder clearActions() {
            this.mActions.clear();
            return this;
        }

        public Builder addInvisibleAction(int icon, CharSequence title, PendingIntent intent) {
            this.mInvisibleActions.add(new Action(icon, title, intent));
            return this;
        }

        public Builder addInvisibleAction(Action action) {
            if (action == null) goto L4;
            this.mInvisibleActions.add(action);
        L4:
            return this;
        }

        public Builder clearInvisibleActions() {
            this.mInvisibleActions.clear();
            Bundle carExtenderBundle = this.mExtras.getBundle("android.car.EXTENSIONS");
            if (carExtenderBundle == null) goto L5;
            Bundle carExtenderBundle2 = new Bundle(carExtenderBundle);
            carExtenderBundle2.remove("invisible_actions");
            this.mExtras.putBundle("android.car.EXTENSIONS", carExtenderBundle2);
        L5:
            return this;
        }

        public Builder setStyle(Style style) {
            if (this.mStyle == style) goto L7;
            this.mStyle = style;
            if (this.mStyle == null) goto L7;
            this.mStyle.setBuilder(this);
        L7:
            return this;
        }

        public Builder setColor(int argb) {
            this.mColor = argb;
            return this;
        }

        public Builder setVisibility(int visibility) {
            this.mVisibility = visibility;
            return this;
        }

        public Builder setPublicVersion(Notification n) {
            this.mPublicVersion = n;
            return this;
        }

        private boolean useExistingRemoteView() {
            if (this.mStyle != null) goto L5;
        L8:
            return true;
        L5:
            if (this.mStyle.displayCustomViewInline() == false) goto L8;
            return false;
        }

        public RemoteViews createContentView() {
            if (this.mContentView != null) goto L5;
        L8:
            NotificationCompatBuilder compatBuilder = new NotificationCompatBuilder(this);
            if (this.mStyle == null) goto L13;
            RemoteViews styleView = this.mStyle.makeContentView(compatBuilder);
            if (styleView == null) goto L13;
            return styleView;
        L13:
            Notification notification = compatBuilder.build();
            return Api24Impl.createContentView(Api24Impl.recoverBuilder(this.mContext, notification));
        L5:
            if (useExistingRemoteView() == false) goto L8;
            return this.mContentView;
        }

        public RemoteViews createBigContentView() {
            if (this.mBigContentView != null) goto L5;
        L8:
            NotificationCompatBuilder compatBuilder = new NotificationCompatBuilder(this);
            if (this.mStyle == null) goto L13;
            RemoteViews styleView = this.mStyle.makeBigContentView(compatBuilder);
            if (styleView == null) goto L13;
            return styleView;
        L13:
            Notification notification = compatBuilder.build();
            return Api24Impl.createBigContentView(Api24Impl.recoverBuilder(this.mContext, notification));
        L5:
            if (useExistingRemoteView() == false) goto L8;
            return this.mBigContentView;
        }

        public RemoteViews createHeadsUpContentView() {
            if (this.mHeadsUpContentView != null) goto L5;
        L8:
            NotificationCompatBuilder compatBuilder = new NotificationCompatBuilder(this);
            if (this.mStyle == null) goto L13;
            RemoteViews styleView = this.mStyle.makeHeadsUpContentView(compatBuilder);
            if (styleView == null) goto L13;
            return styleView;
        L13:
            Notification notification = compatBuilder.build();
            return Api24Impl.createHeadsUpContentView(Api24Impl.recoverBuilder(this.mContext, notification));
        L5:
            if (useExistingRemoteView() == false) goto L8;
            return this.mHeadsUpContentView;
        }

        public Builder setCustomContentView(RemoteViews contentView) {
            this.mContentView = contentView;
            return this;
        }

        public Builder setCustomBigContentView(RemoteViews contentView) {
            this.mBigContentView = contentView;
            return this;
        }

        public Builder setCustomHeadsUpContentView(RemoteViews contentView) {
            this.mHeadsUpContentView = contentView;
            return this;
        }

        public Builder setChannelId(String channelId) {
            this.mChannelId = channelId;
            return this;
        }

        public Builder setTimeoutAfter(long durationMs) {
            this.mTimeout = durationMs;
            return this;
        }

        public Builder setShortcutId(String shortcutId) {
            this.mShortcutId = shortcutId;
            return this;
        }

        public Builder setShortcutInfo(ShortcutInfoCompat shortcutInfo) {
            if (shortcutInfo != null) goto L4;
            return this;
        L4:
            this.mShortcutId = shortcutInfo.getId();
            if (this.mLocusId != null) goto L13;
            if (shortcutInfo.getLocusId() == null) goto L10;
            this.mLocusId = shortcutInfo.getLocusId();
            goto L13
        L10:
            if (shortcutInfo.getId() == null) goto L13;
            this.mLocusId = new LocusIdCompat(shortcutInfo.getId());
        L13:
            if (this.mContentTitle != null) goto L15;
            setContentTitle(shortcutInfo.getShortLabel());
        L15:
            return this;
        }

        public Builder setLocusId(LocusIdCompat locusId) {
            this.mLocusId = locusId;
            return this;
        }

        public Builder setBadgeIconType(int icon) {
            this.mBadgeIcon = icon;
            return this;
        }

        public Builder setGroupAlertBehavior(int groupAlertBehavior) {
            this.mGroupAlertBehavior = groupAlertBehavior;
            return this;
        }

        public Builder setForegroundServiceBehavior(int behavior) {
            this.mFgsDeferBehavior = behavior;
            return this;
        }

        public Builder setBubbleMetadata(BubbleMetadata data) {
            this.mBubbleMetadata = data;
            return this;
        }

        public Builder extend(Extender extender) {
            extender.extend(this);
            return this;
        }

        public Builder setAllowSystemGeneratedContextualActions(boolean allowed) {
            this.mAllowSystemGeneratedContextualActions = allowed;
            return this;
        }

        @Deprecated
        public Notification getNotification() {
            return build();
        }

        public Notification build() {
            return new NotificationCompatBuilder(this).build();
        }

        protected static CharSequence limitCharSequenceLength(CharSequence cs) {
            if (cs != null) goto L5;
            return cs;
        L5:
            if (cs.length() > MAX_CHARSEQUENCE_LENGTH) goto L7;
            return cs;
        L7:
            return cs.subSequence(0, MAX_CHARSEQUENCE_LENGTH);
        }

        public RemoteViews getContentView() {
            return this.mContentView;
        }

        public RemoteViews getBigContentView() {
            return this.mBigContentView;
        }

        public RemoteViews getHeadsUpContentView() {
            return this.mHeadsUpContentView;
        }

        public long getWhenIfShowing() {
            if (this.mShowWhen == true) goto L7;
            return 0;
        L7:
            return this.mNotification.when;
        }

        public int getPriority() {
            return this.mPriority;
        }

        public int getForegroundServiceBehavior() {
            return this.mFgsDeferBehavior;
        }

        public int getColor() {
            return this.mColor;
        }

        public BubbleMetadata getBubbleMetadata() {
            return this.mBubbleMetadata;
        }
    }

    public static class CallStyle extends Style {
        public static final int CALL_TYPE_INCOMING = 1;
        public static final int CALL_TYPE_ONGOING = 2;
        public static final int CALL_TYPE_SCREENING = 3;
        public static final int CALL_TYPE_UNKNOWN = 0;
        private static final String KEY_ACTION_PRIORITY = "key_action_priority";
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$CallStyle";
        private Integer mAnswerButtonColor;
        private PendingIntent mAnswerIntent;
        private int mCallType;
        private Integer mDeclineButtonColor;
        private PendingIntent mDeclineIntent;
        private PendingIntent mHangUpIntent;
        private boolean mIsVideo;
        private Person mPerson;
        private IconCompat mVerificationIcon;
        private CharSequence mVerificationText;

        static class Api20Impl {
            private Api20Impl() {
            }

            static Notification.Action build(Notification.Action.Builder builder) {
                return builder.build();
            }

            static Notification.Action.Builder createActionBuilder(int icon, CharSequence title, PendingIntent intent) {
                return new Notification.Action.Builder(icon, title, intent);
            }

            static Notification.Action.Builder addExtras(Notification.Action.Builder builder, Bundle extras) {
                return builder.addExtras(extras);
            }

            static Notification.Action.Builder addRemoteInput(Notification.Action.Builder builder, android.app.RemoteInput remoteInput) {
                return builder.addRemoteInput(remoteInput);
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
        }

        static class Api23Impl {
            private Api23Impl() {
            }

            static void setLargeIcon(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }

            static Notification.Action.Builder createActionBuilder(Icon icon, CharSequence title, PendingIntent intent) {
                return new Notification.Action.Builder(icon, title, intent);
            }

            static Parcelable castToParcelable(Icon icon) {
                return icon;
            }
        }

        static class Api24Impl {
            private Api24Impl() {
            }

            static Notification.Action.Builder setAllowGeneratedReplies(Notification.Action.Builder builder, boolean allowGeneratedReplies) {
                return builder.setAllowGeneratedReplies(allowGeneratedReplies);
            }
        }

        static class Api28Impl {
            private Api28Impl() {
            }

            static Notification.Builder addPerson(Notification.Builder builder, android.app.Person person) {
                return builder.addPerson(person);
            }

            static Parcelable castToParcelable(android.app.Person person) {
                return person;
            }
        }

        static class Api31Impl {
            private Api31Impl() {
            }

            static Notification$CallStyle forIncomingCall(android.app.Person person, PendingIntent declineIntent, PendingIntent answerIntent) {
                return Notification$CallStyle.forIncomingCall(person, declineIntent, answerIntent);
            }

            static Notification$CallStyle forOngoingCall(android.app.Person person, PendingIntent hangUpIntent) {
                return Notification$CallStyle.forOngoingCall(person, hangUpIntent);
            }

            static Notification$CallStyle forScreeningCall(android.app.Person person, PendingIntent hangUpIntent, PendingIntent answerIntent) {
                return Notification$CallStyle.forScreeningCall(person, hangUpIntent, answerIntent);
            }

            static Notification$CallStyle setIsVideo(Notification$CallStyle callStyle, boolean isVideo) {
                return callStyle.setIsVideo(isVideo);
            }

            static Notification$CallStyle setVerificationIcon(Notification$CallStyle callStyle, Icon verificationIcon) {
                return callStyle.setVerificationIcon(verificationIcon);
            }

            static Notification$CallStyle setVerificationText(Notification$CallStyle callStyle, CharSequence verificationText) {
                return callStyle.setVerificationText(verificationText);
            }

            static Notification$CallStyle setAnswerButtonColorHint(Notification$CallStyle callStyle, int color) {
                return callStyle.setAnswerButtonColorHint(color);
            }

            static Notification$CallStyle setDeclineButtonColorHint(Notification$CallStyle callStyle, int color) {
                return callStyle.setDeclineButtonColorHint(color);
            }

            static Notification.Action.Builder setAuthenticationRequired(Notification.Action.Builder actionBuilder, boolean authenticationRequired) {
                return actionBuilder.setAuthenticationRequired(authenticationRequired);
            }
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface CallType {
        }

        public CallStyle() {
        }

        public CallStyle(Builder builder) {
            setBuilder(builder);
        }

        public static CallStyle forIncomingCall(Person person, PendingIntent declineIntent, PendingIntent answerIntent) {
            return new CallStyle(1, person, null, (PendingIntent) Objects.requireNonNull(declineIntent, "declineIntent is required"), (PendingIntent) Objects.requireNonNull(answerIntent, "answerIntent is required"));
        }

        public static CallStyle forOngoingCall(Person person, PendingIntent hangUpIntent) {
            return new CallStyle(2, person, (PendingIntent) Objects.requireNonNull(hangUpIntent, "hangUpIntent is required"), null, null);
        }

        public static CallStyle forScreeningCall(Person person, PendingIntent hangUpIntent, PendingIntent answerIntent) {
            return new CallStyle(3, person, (PendingIntent) Objects.requireNonNull(hangUpIntent, "hangUpIntent is required"), null, (PendingIntent) Objects.requireNonNull(answerIntent, "answerIntent is required"));
        }

        private CallStyle(int callType, Person person, PendingIntent hangUpIntent, PendingIntent declineIntent, PendingIntent answerIntent) {
            if (person == null) goto L9;
            if (TextUtils.isEmpty(person.getName()) == true) goto L9;
            this.mCallType = callType;
            this.mPerson = person;
            this.mAnswerIntent = answerIntent;
            this.mDeclineIntent = declineIntent;
            this.mHangUpIntent = hangUpIntent;
            return;
        L9:
            throw new IllegalArgumentException("person must have a non-empty a name");
        }

        public CallStyle setIsVideo(boolean isVideo) {
            this.mIsVideo = isVideo;
            return this;
        }

        public CallStyle setVerificationIcon(Icon verificationIcon) {
            if (verificationIcon != null) goto L4;
            IconCompat r0 = null;
        L5:
            this.mVerificationIcon = r0;
            return this;
        L4:
            r0 = IconCompat.createFromIcon(verificationIcon);
            goto L5
        }

        public CallStyle setVerificationIcon(Bitmap verificationIcon) {
            this.mVerificationIcon = IconCompat.createWithBitmap(verificationIcon);
            return this;
        }

        public CallStyle setVerificationText(CharSequence verificationText) {
            this.mVerificationText = verificationText;
            return this;
        }

        public CallStyle setAnswerButtonColorHint(int color) {
            this.mAnswerButtonColor = Integer.valueOf(color);
            return this;
        }

        public CallStyle setDeclineButtonColorHint(int color) {
            this.mDeclineButtonColor = Integer.valueOf(color);
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public boolean displayCustomViewInline() {
            return true;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void restoreFromCompatExtras(Bundle extras) {
            super.restoreFromCompatExtras(extras);
            this.mCallType = extras.getInt(NotificationCompat.EXTRA_CALL_TYPE);
            this.mIsVideo = extras.getBoolean(NotificationCompat.EXTRA_CALL_IS_VIDEO);
            if (Build.VERSION.SDK_INT < 28) goto L8;
            if (extras.containsKey(NotificationCompat.EXTRA_CALL_PERSON) == false) goto L8;
            this.mPerson = Person.fromAndroidPerson((android.app.Person) extras.getParcelable(NotificationCompat.EXTRA_CALL_PERSON));
        L11:
            if (extras.containsKey(NotificationCompat.EXTRA_VERIFICATION_ICON) == false) goto L14;
            this.mVerificationIcon = IconCompat.createFromIcon((Icon) extras.getParcelable(NotificationCompat.EXTRA_VERIFICATION_ICON));
        L16:
            this.mVerificationText = extras.getCharSequence(NotificationCompat.EXTRA_VERIFICATION_TEXT);
            this.mAnswerIntent = (PendingIntent) extras.getParcelable(NotificationCompat.EXTRA_ANSWER_INTENT);
            this.mDeclineIntent = (PendingIntent) extras.getParcelable(NotificationCompat.EXTRA_DECLINE_INTENT);
            this.mHangUpIntent = (PendingIntent) extras.getParcelable(NotificationCompat.EXTRA_HANG_UP_INTENT);
            Integer r2 = null;
            if (extras.containsKey(NotificationCompat.EXTRA_ANSWER_COLOR) == false) goto L19;
            Integer r0 = Integer.valueOf(extras.getInt(NotificationCompat.EXTRA_ANSWER_COLOR));
        L20:
            this.mAnswerButtonColor = r0;
            if (extras.containsKey(NotificationCompat.EXTRA_DECLINE_COLOR) == false) goto L24;
            r2 = Integer.valueOf(extras.getInt(NotificationCompat.EXTRA_DECLINE_COLOR));
        L24:
            this.mDeclineButtonColor = r2;
            return;
        L19:
            r0 = null;
            goto L20
        L14:
            if (extras.containsKey(NotificationCompat.EXTRA_VERIFICATION_ICON_COMPAT) == false) goto L16;
            this.mVerificationIcon = IconCompat.createFromBundle(extras.getBundle(NotificationCompat.EXTRA_VERIFICATION_ICON_COMPAT));
        L8:
            if (extras.containsKey(NotificationCompat.EXTRA_CALL_PERSON_COMPAT) == false) goto L11;
            this.mPerson = Person.fromBundle(extras.getBundle(NotificationCompat.EXTRA_CALL_PERSON_COMPAT));
            goto L11
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void addCompatExtras(Bundle extras) {
            super.addCompatExtras(extras);
            extras.putInt(NotificationCompat.EXTRA_CALL_TYPE, this.mCallType);
            extras.putBoolean(NotificationCompat.EXTRA_CALL_IS_VIDEO, this.mIsVideo);
            if (this.mPerson == null) goto L9;
            int r0 = Build.VERSION.SDK_INT;
            Person r1 = this.mPerson;
            if (r0 < 28) goto L7;
            extras.putParcelable(NotificationCompat.EXTRA_CALL_PERSON, Api28Impl.castToParcelable(r1.toAndroidPerson()));
            goto L9
        L7:
            extras.putParcelable(NotificationCompat.EXTRA_CALL_PERSON_COMPAT, r1.toBundle());
        L9:
            if (this.mVerificationIcon == null) goto L11;
            extras.putParcelable(NotificationCompat.EXTRA_VERIFICATION_ICON, Api23Impl.castToParcelable(this.mVerificationIcon.toIcon(this.mBuilder.mContext)));
        L11:
            extras.putCharSequence(NotificationCompat.EXTRA_VERIFICATION_TEXT, this.mVerificationText);
            extras.putParcelable(NotificationCompat.EXTRA_ANSWER_INTENT, this.mAnswerIntent);
            extras.putParcelable(NotificationCompat.EXTRA_DECLINE_INTENT, this.mDeclineIntent);
            extras.putParcelable(NotificationCompat.EXTRA_HANG_UP_INTENT, this.mHangUpIntent);
            if (this.mAnswerButtonColor == null) goto L15;
            extras.putInt(NotificationCompat.EXTRA_ANSWER_COLOR, this.mAnswerButtonColor.intValue());
        L15:
            if (this.mDeclineButtonColor == null) goto L18;
            extras.putInt(NotificationCompat.EXTRA_DECLINE_COLOR, this.mDeclineButtonColor.intValue());
            return;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(NotificationBuilderWithBuilderAccessor builderAccessor) {
            if (Build.VERSION.SDK_INT < 31) goto L24;
            Notification$CallStyle style = null;
            switch(this.mCallType) {
                case 1: goto L11;
                case 2: goto L10;
                case 3: goto L9;
                default: goto L7;
            };
        L9:
            style = Api31Impl.forScreeningCall(this.mPerson.toAndroidPerson(), this.mHangUpIntent, this.mAnswerIntent);
        L12:
            if (style == null) goto L48;
            style.setBuilder(builderAccessor.getBuilder());
            if (this.mAnswerButtonColor == null) goto L17;
            Api31Impl.setAnswerButtonColorHint(style, this.mAnswerButtonColor.intValue());
        L17:
            if (this.mDeclineButtonColor == null) goto L19;
            Api31Impl.setDeclineButtonColorHint(style, this.mDeclineButtonColor.intValue());
        L19:
            Api31Impl.setVerificationText(style, this.mVerificationText);
            if (this.mVerificationIcon == null) goto L22;
            Api31Impl.setVerificationIcon(style, this.mVerificationIcon.toIcon(this.mBuilder.mContext));
        L22:
            Api31Impl.setIsVideo(style, this.mIsVideo);
            return;
        L48:
            return;
        L10:
            style = Api31Impl.forOngoingCall(this.mPerson.toAndroidPerson(), this.mHangUpIntent);
            goto L12
        L11:
            style = Api31Impl.forIncomingCall(this.mPerson.toAndroidPerson(), this.mDeclineIntent, this.mAnswerIntent);
            goto L12
        L7:
            if (Log.isLoggable(NotificationCompat.TAG, 3) == false) goto L12;
            Log.d(NotificationCompat.TAG, "Unrecognized call type in CallStyle: " + String.valueOf(this.mCallType));
            goto L12
        L24:
            Notification.Builder builder = builderAccessor.getBuilder();
            CharSequence text = null;
            if (this.mPerson == null) goto L27;
            CharSequence title = this.mPerson.getName();
        L28:
            builder.setContentTitle(title);
            if (this.mBuilder.mExtras != null) goto L31;
        L34:
            if (text != null) goto L36;
            text = getDefaultText();
        L36:
            builder.setContentText(text);
            if (this.mPerson != null) goto L39;
        L45:
            Api21Impl.setCategory(builder, NotificationCompat.CATEGORY_CALL);
            return;
        L39:
            if (this.mPerson.getIcon() == null) goto L42;
            Api23Impl.setLargeIcon(builder, this.mPerson.getIcon().toIcon(this.mBuilder.mContext));
        L42:
            if (Build.VERSION.SDK_INT < 28) goto L44;
            Api28Impl.addPerson(builder, this.mPerson.toAndroidPerson());
            goto L45
        L44:
            Api21Impl.addPerson(builder, this.mPerson.getUri());
            goto L45
        L31:
            if (this.mBuilder.mExtras.containsKey(NotificationCompat.EXTRA_TEXT) == false) goto L34;
            text = this.mBuilder.mExtras.getCharSequence(NotificationCompat.EXTRA_TEXT);
            goto L34
        L27:
            title = null;
            goto L28
        }

        private String getDefaultText() {
            switch(this.mCallType) {
                case 1: goto L11;
                case 2: goto L9;
                case 3: goto L7;
                default: goto L4;
            };
        L4:
            return null;
        L7:
            return this.mBuilder.mContext.getResources().getString(R.string.call_notification_screening_text);
        L9:
            return this.mBuilder.mContext.getResources().getString(R.string.call_notification_ongoing_text);
        L11:
            return this.mBuilder.mContext.getResources().getString(R.string.call_notification_incoming_text);
        }

        private Action makeNegativeAction() {
            int r0 = R.drawable.ic_call_decline_low;
            int icon = R.drawable.ic_call_decline;
            if (this.mDeclineIntent != null) goto L7;
            return makeAction(icon, R.string.call_notification_hang_up_action, this.mDeclineButtonColor, R.color.call_notification_decline_color, this.mHangUpIntent);
        L7:
            return makeAction(icon, R.string.call_notification_decline_action, this.mDeclineButtonColor, R.color.call_notification_decline_color, this.mDeclineIntent);
        }

        private Action makeAnswerAction() {
            int r0 = R.drawable.ic_call_answer_video_low;
            int r1 = R.drawable.ic_call_answer_low;
            int videoIcon = R.drawable.ic_call_answer_video;
            int icon = R.drawable.ic_call_answer;
            if (this.mAnswerIntent != null) goto L6;
            return null;
        L6:
            if (this.mIsVideo == false) goto L8;
            int r4 = videoIcon;
        L10:
            if (this.mIsVideo == false) goto L12;
            int r5 = R.string.call_notification_answer_video_action;
        L14:
            return makeAction(r4, r5, this.mAnswerButtonColor, R.color.call_notification_answer_color, this.mAnswerIntent);
        L12:
            r5 = R.string.call_notification_answer_action;
            goto L14
        L8:
            r4 = icon;
            goto L10
        }

        private Action makeAction(int icon, int title, Integer colorInt, int defaultColorRes, PendingIntent intent) {
            if (colorInt != null) goto L4;
            colorInt = Integer.valueOf(ContextCompat.getColor(this.mBuilder.mContext, defaultColorRes));
        L4:
            SpannableStringBuilder stringBuilder = new SpannableStringBuilder();
            stringBuilder.append(this.mBuilder.mContext.getResources().getString(title));
            stringBuilder.setSpan(new ForegroundColorSpan(colorInt.intValue()), 0, stringBuilder.length(), 18);
            Action action = new Action.Builder(IconCompat.createWithResource(this.mBuilder.mContext, icon), stringBuilder, intent).build();
            action.getExtras().putBoolean(KEY_ACTION_PRIORITY, true);
            return action;
        }

        private boolean isActionAddedByCallStyle(Action action) {
            if (action != null) goto L4;
        L6:
            return false;
        L4:
            if (action.getExtras().getBoolean(KEY_ACTION_PRIORITY) == false) goto L6;
            return true;
        }

        public ArrayList<Action> getActionsListWithSystemActions() {
            Action firstAction = makeNegativeAction();
            Action lastAction = makeAnswerAction();
            int nonContextualActionSlotsRemaining = 3;
            ArrayList<Action> resultActions = new ArrayList(3);
            if (3 <= 0) goto L5;
            resultActions.add(firstAction);
            nonContextualActionSlotsRemaining = 3 - 1;
        L5:
            List<Action> existingActions = this.mBuilder.mActions;
            if (existingActions == null) goto L22;
            Iterator<Action> r6 = existingActions.iterator();
        L9:
            if (r6.hasNext() == false) goto L22;
            Action action = r6.next();
            if (action.isContextual() == false) goto L14;
            resultActions.add(action);
        L18:
            if (lastAction == null) goto L9;
            if (nonContextualActionSlotsRemaining != 1) goto L9;
            resultActions.add(lastAction);
            nonContextualActionSlotsRemaining = nonContextualActionSlotsRemaining - 1;
            goto L9
        L14:
            if (isActionAddedByCallStyle(action) == true) goto L18;
            if (nonContextualActionSlotsRemaining <= 1) goto L18;
            resultActions.add(action);
            nonContextualActionSlotsRemaining = nonContextualActionSlotsRemaining - 1;
        L22:
            if (lastAction == null) goto L25;
            if (nonContextualActionSlotsRemaining < 1) goto L25;
            resultActions.add(lastAction);
        L25:
            return resultActions;
        }
    }

    public static final class CarExtender implements Extender {
        static final String EXTRA_CAR_EXTENDER = "android.car.EXTENSIONS";
        private static final String EXTRA_COLOR = "app_color";
        private static final String EXTRA_CONVERSATION = "car_conversation";
        static final String EXTRA_INVISIBLE_ACTIONS = "invisible_actions";
        private static final String EXTRA_LARGE_ICON = "large_icon";
        private static final String KEY_AUTHOR = "author";
        private static final String KEY_MESSAGES = "messages";
        private static final String KEY_ON_READ = "on_read";
        private static final String KEY_ON_REPLY = "on_reply";
        private static final String KEY_PARTICIPANTS = "participants";
        private static final String KEY_REMOTE_INPUT = "remote_input";
        private static final String KEY_TEXT = "text";
        private static final String KEY_TIMESTAMP = "timestamp";
        private int mColor;
        private Bitmap mLargeIcon;
        private UnreadConversation mUnreadConversation;

        static class Api20Impl {
            private Api20Impl() {
            }

            static android.app.RemoteInput.Builder createBuilder(String resultKey) {
                return new android.app.RemoteInput.Builder(resultKey);
            }

            static android.app.RemoteInput build(android.app.RemoteInput.Builder builder) {
                return builder.build();
            }

            static String getResultKey(android.app.RemoteInput remoteInput) {
                return remoteInput.getResultKey();
            }

            static CharSequence[] getChoices(android.app.RemoteInput remoteInput) {
                return remoteInput.getChoices();
            }

            static android.app.RemoteInput.Builder setChoices(android.app.RemoteInput.Builder builder, CharSequence[] choices) {
                return builder.setChoices(choices);
            }

            static CharSequence getLabel(android.app.RemoteInput remoteInput) {
                return remoteInput.getLabel();
            }

            static android.app.RemoteInput.Builder setLabel(android.app.RemoteInput.Builder builder, CharSequence label) {
                return builder.setLabel(label);
            }

            static boolean getAllowFreeFormInput(android.app.RemoteInput remoteInput) {
                return remoteInput.getAllowFreeFormInput();
            }

            static android.app.RemoteInput.Builder setAllowFreeFormInput(android.app.RemoteInput.Builder builder, boolean allowFreeFormInput) {
                return builder.setAllowFreeFormInput(allowFreeFormInput);
            }

            static Bundle getExtras(android.app.RemoteInput remoteInput) {
                return remoteInput.getExtras();
            }

            static android.app.RemoteInput.Builder addExtras(android.app.RemoteInput.Builder builder, Bundle extras) {
                return builder.addExtras(extras);
            }

            static Parcelable castToParcelable(android.app.RemoteInput remoteInput) {
                return remoteInput;
            }
        }

        static class Api29Impl {
            private Api29Impl() {
            }

            static int getEditChoicesBeforeSending(android.app.RemoteInput remoteInput) {
                return remoteInput.getEditChoicesBeforeSending();
            }
        }

        @Deprecated
        public static class UnreadConversation {
            private final long mLatestTimestamp;
            private final String[] mMessages;
            private final String[] mParticipants;
            private final PendingIntent mReadPendingIntent;
            private final RemoteInput mRemoteInput;
            private final PendingIntent mReplyPendingIntent;

            public static class Builder {
                private long mLatestTimestamp;
                private final List<String> mMessages;
                private final String mParticipant;
                private PendingIntent mReadPendingIntent;
                private RemoteInput mRemoteInput;
                private PendingIntent mReplyPendingIntent;

                public Builder(String name) {
                    this.mMessages = new ArrayList();
                    this.mParticipant = name;
                }

                public Builder addMessage(String message) {
                    if (message == null) goto L4;
                    this.mMessages.add(message);
                L4:
                    return this;
                }

                public Builder setReplyAction(PendingIntent pendingIntent, RemoteInput remoteInput) {
                    this.mRemoteInput = remoteInput;
                    this.mReplyPendingIntent = pendingIntent;
                    return this;
                }

                public Builder setReadPendingIntent(PendingIntent pendingIntent) {
                    this.mReadPendingIntent = pendingIntent;
                    return this;
                }

                public Builder setLatestTimestamp(long timestamp) {
                    this.mLatestTimestamp = timestamp;
                    return this;
                }

                public UnreadConversation build() {
                    String[] messages = (String[]) this.mMessages.toArray(new String[this.mMessages.size()]);
                    String[] participants = {this.mParticipant};
                    return new UnreadConversation(messages, this.mRemoteInput, this.mReplyPendingIntent, this.mReadPendingIntent, participants, this.mLatestTimestamp);
                }
            }

            UnreadConversation(String[] messages, RemoteInput remoteInput, PendingIntent replyPendingIntent, PendingIntent readPendingIntent, String[] participants, long latestTimestamp) {
                this.mMessages = messages;
                this.mRemoteInput = remoteInput;
                this.mReadPendingIntent = readPendingIntent;
                this.mReplyPendingIntent = replyPendingIntent;
                this.mParticipants = participants;
                this.mLatestTimestamp = latestTimestamp;
            }

            public String[] getMessages() {
                return this.mMessages;
            }

            public RemoteInput getRemoteInput() {
                return this.mRemoteInput;
            }

            public PendingIntent getReplyPendingIntent() {
                return this.mReplyPendingIntent;
            }

            public PendingIntent getReadPendingIntent() {
                return this.mReadPendingIntent;
            }

            public String[] getParticipants() {
                return this.mParticipants;
            }

            public String getParticipant() {
                if (this.mParticipants.length > 0) goto L7;
                return null;
            L7:
                return this.mParticipants[0];
            }

            public long getLatestTimestamp() {
                return this.mLatestTimestamp;
            }
        }

        public CarExtender() {
            this.mColor = 0;
        }

        public CarExtender(Notification notification) {
            this.mColor = 0;
            if (NotificationCompat.getExtras(notification) != null) goto L5;
            Bundle carBundle = null;
        L6:
            if (carBundle == null) goto L9;
            this.mLargeIcon = (Bitmap) carBundle.getParcelable(EXTRA_LARGE_ICON);
            this.mColor = carBundle.getInt(EXTRA_COLOR, 0);
            Bundle b = carBundle.getBundle(EXTRA_CONVERSATION);
            this.mUnreadConversation = getUnreadConversationFromBundle(b);
            return;
        L9:
            return;
        L5:
            carBundle = NotificationCompat.getExtras(notification).getBundle(EXTRA_CAR_EXTENDER);
            goto L6
        }

        private static UnreadConversation getUnreadConversationFromBundle(Bundle b) {
            if (b != null) goto L5;
            return null;
        L5:
            Parcelable[] parcelableMessages = b.getParcelableArray(KEY_MESSAGES);
            if (parcelableMessages == null) goto L20;
            String[] tmp = new String[parcelableMessages.length];
            boolean success = true;
            int i = 0;
        L9:
            if (i >= tmp.length) goto L17;
            if ((parcelableMessages[i] instanceof Bundle) == false) goto L12;
            tmp[i] = ((Bundle) parcelableMessages[i]).getString(KEY_TEXT);
            if (tmp[i] == null) goto L15;
            i = i + 1;
            goto L9
        L15:
            success = false;
            goto L17
        L12:
            success = false;
        L17:
            if (success == false) goto L19;
            String[] messages = tmp;
        L21:
            PendingIntent onRead = (PendingIntent) b.getParcelable(KEY_ON_READ);
            PendingIntent onReply = (PendingIntent) b.getParcelable(KEY_ON_REPLY);
            android.app.RemoteInput remoteInput = (android.app.RemoteInput) b.getParcelable(KEY_REMOTE_INPUT);
            String[] participants = b.getStringArray(KEY_PARTICIPANTS);
            if (participants != null) goto L24;
        L35:
            return null;
        L24:
            if (participants.length != 1) goto L35;
            if (remoteInput == null) goto L32;
            String r13 = Api20Impl.getResultKey(remoteInput);
            CharSequence r14 = Api20Impl.getLabel(remoteInput);
            CharSequence[] r15 = Api20Impl.getChoices(remoteInput);
            boolean r16 = Api20Impl.getAllowFreeFormInput(remoteInput);
            if (Build.VERSION.SDK_INT < 29) goto L30;
            int r17 = Api29Impl.getEditChoicesBeforeSending(remoteInput);
        L31:
            RemoteInput remoteInputCompat = new RemoteInput(r13, r14, r15, r16, r17, Api20Impl.getExtras(remoteInput), null);
        L34:
            return new UnreadConversation(messages, remoteInputCompat, onReply, onRead, participants, b.getLong(KEY_TIMESTAMP));
        L30:
            r17 = 0;
            goto L31
        L32:
            remoteInputCompat = null;
            goto L34
        L19:
            return null;
        L20:
            messages = null;
            goto L21
        }

        private static Bundle getBundleForUnreadConversation(UnreadConversation uc) {
            Bundle b = new Bundle();
            String author = null;
            if (uc.getParticipants() != null) goto L5;
        L7:
            Parcelable[] messages = new Parcelable[uc.getMessages().length];
            int i = 0;
        L9:
            if (i >= messages.length) goto L11;
            Bundle m = new Bundle();
            m.putString(KEY_TEXT, uc.getMessages()[i]);
            m.putString(KEY_AUTHOR, author);
            messages[i] = m;
            i = i + 1;
            goto L9
        L11:
            b.putParcelableArray(KEY_MESSAGES, messages);
            RemoteInput remoteInputCompat = uc.getRemoteInput();
            if (remoteInputCompat == null) goto L14;
            android.app.RemoteInput.Builder builder = Api20Impl.createBuilder(remoteInputCompat.getResultKey());
            Api20Impl.setLabel(builder, remoteInputCompat.getLabel());
            Api20Impl.setChoices(builder, remoteInputCompat.getChoices());
            Api20Impl.setAllowFreeFormInput(builder, remoteInputCompat.getAllowFreeFormInput());
            Api20Impl.addExtras(builder, remoteInputCompat.getExtras());
            android.app.RemoteInput remoteInput = Api20Impl.build(builder);
            b.putParcelable(KEY_REMOTE_INPUT, Api20Impl.castToParcelable(remoteInput));
        L14:
            b.putParcelable(KEY_ON_REPLY, uc.getReplyPendingIntent());
            b.putParcelable(KEY_ON_READ, uc.getReadPendingIntent());
            b.putStringArray(KEY_PARTICIPANTS, uc.getParticipants());
            b.putLong(KEY_TIMESTAMP, uc.getLatestTimestamp());
            return b;
        L5:
            if (uc.getParticipants().length <= 1) goto L7;
            author = uc.getParticipants()[0];
            goto L7
        }

        @Override // androidx.core.app.NotificationCompat.Extender
        public Builder extend(Builder builder) {
            Bundle carExtensions = new Bundle();
            if (this.mLargeIcon == null) goto L6;
            carExtensions.putParcelable(EXTRA_LARGE_ICON, this.mLargeIcon);
        L6:
            if (this.mColor == 0) goto L9;
            carExtensions.putInt(EXTRA_COLOR, this.mColor);
        L9:
            if (this.mUnreadConversation == null) goto L11;
            Bundle b = getBundleForUnreadConversation(this.mUnreadConversation);
            carExtensions.putBundle(EXTRA_CONVERSATION, b);
        L11:
            Bundle b2 = builder.getExtras();
            b2.putBundle(EXTRA_CAR_EXTENDER, carExtensions);
            return builder;
        }

        public CarExtender setColor(int color) {
            this.mColor = color;
            return this;
        }

        public int getColor() {
            return this.mColor;
        }

        public CarExtender setLargeIcon(Bitmap largeIcon) {
            this.mLargeIcon = largeIcon;
            return this;
        }

        public Bitmap getLargeIcon() {
            return this.mLargeIcon;
        }

        @Deprecated
        public CarExtender setUnreadConversation(UnreadConversation unreadConversation) {
            this.mUnreadConversation = unreadConversation;
            return this;
        }

        @Deprecated
        public UnreadConversation getUnreadConversation() {
            return this.mUnreadConversation;
        }
    }

    public static class DecoratedCustomViewStyle extends Style {
        private static final int MAX_ACTION_BUTTONS = 3;
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";

        static class Api24Impl {
            private Api24Impl() {
            }

            static Notification.Style createDecoratedCustomViewStyle() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }

        public DecoratedCustomViewStyle() {
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public boolean displayCustomViewInline() {
            return true;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(NotificationBuilderWithBuilderAccessor builder) {
            Notification.Builder builder1 = builder.getBuilder();
            builder1.setStyle(Api24Impl.createDecoratedCustomViewStyle());
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor builder) {
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor builder) {
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor builder) {
            return null;
        }

        public static List<CharSequence> getTextsFromContentView(Context context, Notification notification) {
            String styleClassName = notification.extras.getString(NotificationCompat.EXTRA_TEMPLATE);
            if (Notification.DecoratedCustomViewStyle.class.getName().equals(styleClassName) == true) goto L7;
            return Collections.emptyList();
        L7:
            if (notification.contentView != null) goto L15;
            if (notification.bigContentView != null) goto L15;
            if (notification.headsUpContentView != null) goto L15;
            return Collections.emptyList();
        L15:
            if (notification.bigContentView == null) goto L18;
            RemoteViews contentView = notification.bigContentView;
        L21:
            String packageName = contentView.getPackage();
            Context packageContext = context.createPackageContext(packageName, 0);     // Catch: PackageManager.NameNotFoundException -> L25
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(packageName, 0);     // Catch: PackageManager.NameNotFoundException -> L25
            packageContext.setTheme(applicationInfo.theme);
            View contentLayout = contentView.apply(packageContext, null);
            ArrayList<CharSequence> texts = new ArrayList();
            getTextsFromViewTraversal(contentLayout, texts);
            return texts;
        L25:
            e = move-exception;
            throw new RuntimeException(e);
        L18:
            if (notification.contentView == null) goto L20;
            contentView = notification.contentView;
            goto L21
        L20:
            contentView = notification.headsUpContentView;
            goto L21
        }

        private static void getTextsFromViewTraversal(View v, ArrayList<CharSequence> outTexts) {
            if ((v instanceof ViewGroup) == true) goto L5;
            return;
        L5:
            int i = 0;
        L7:
            if (i >= ((ViewGroup) v).getChildCount()) goto L19;
            View child = ((ViewGroup) v).getChildAt(i);
            if ((child instanceof TextView) == false) goto L16;
            CharSequence text = ((TextView) child).getText();
            if (text == null) goto L16;
            if (text.length() <= 0) goto L16;
            outTexts.add(text);
        L16:
            if ((child instanceof ViewGroup) == false) goto L18;
            getTextsFromViewTraversal(child, outTexts);
        L18:
            i = i + 1;
            goto L7
        }

        private RemoteViews createRemoteViews(RemoteViews innerView, boolean showActions) {
            int actionVisibility = 0;
            RemoteViews remoteViews = applyStandardTemplate(true, R.layout.notification_template_custom_big, false);
            remoteViews.removeAllViews(R.id.actions);
            boolean actionsVisible = false;
            List<Action> nonContextualActions = getNonContextualActions(this.mBuilder.mActions);
            if (showActions == false) goto L10;
            if (nonContextualActions == null) goto L10;
            int numActions = Math.min(nonContextualActions.size(), 3);
            if (numActions <= 0) goto L10;
            actionsVisible = true;
            int i = 0;
        L8:
            if (i >= numActions) goto L10;
            RemoteViews button = generateActionButton(nonContextualActions.get(i));
            remoteViews.addView(R.id.actions, button);
            i = i + 1;
        L10:
            if (actionsVisible == true) goto L13;
            actionVisibility = 8;
        L13:
            remoteViews.setViewVisibility(R.id.actions, actionVisibility);
            remoteViews.setViewVisibility(R.id.action_divider, actionVisibility);
            buildIntoRemoteViews(remoteViews, innerView);
            return remoteViews;
        }

        private static List<Action> getNonContextualActions(List<Action> actions) {
            if (actions != null) goto L5;
            return null;
        L5:
            List<Action> nonContextualActions = new ArrayList();
            Iterator<Action> r1 = actions.iterator();
        L7:
            if (r1.hasNext() == false) goto L12;
            Action action = r1.next();
            if (action.isContextual() == true) goto L7;
            nonContextualActions.add(action);
            goto L7
        L12:
            return nonContextualActions;
        }

        private RemoteViews generateActionButton(Action action) {
            if (action.actionIntent != null) goto L5;
            boolean tombstone = true;
        L6:
            String r2 = this.mBuilder.mContext.getPackageName();
            if (tombstone == false) goto L9;
            int r3 = R.layout.notification_action_tombstone;
        L10:
            RemoteViews button = new RemoteViews(r2, r3);
            IconCompat icon = action.getIconCompat();
            if (icon == null) goto L13;
            button.setImageViewBitmap(R.id.action_image, createColoredBitmap(icon, R.color.notification_action_color_filter));
        L13:
            button.setTextViewText(R.id.action_text, action.title);
            if (tombstone == true) goto L16;
            button.setOnClickPendingIntent(R.id.action_container, action.actionIntent);
        L16:
            button.setContentDescription(R.id.action_container, action.title);
            return button;
        L9:
            r3 = R.layout.notification_action;
            goto L10
        L5:
            tombstone = false;
            goto L6
        }
    }

    public interface Extender {
        Builder extend(Builder r1);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface GroupAlertBehavior {
    }

    public static class InboxStyle extends Style {
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$InboxStyle";
        private ArrayList<CharSequence> mTexts;

        public InboxStyle() {
            this.mTexts = new ArrayList();
        }

        public InboxStyle(Builder builder) {
            this.mTexts = new ArrayList();
            setBuilder(builder);
        }

        public InboxStyle setBigContentTitle(CharSequence title) {
            this.mBigContentTitle = Builder.limitCharSequenceLength(title);
            return this;
        }

        public InboxStyle setSummaryText(CharSequence cs) {
            this.mSummaryText = Builder.limitCharSequenceLength(cs);
            this.mSummaryTextSet = true;
            return this;
        }

        public InboxStyle addLine(CharSequence cs) {
            if (cs == null) goto L4;
            this.mTexts.add(Builder.limitCharSequenceLength(cs));
        L4:
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(NotificationBuilderWithBuilderAccessor builder) {
            Notification.Builder builder1 = builder.getBuilder();
            Notification.InboxStyle style = new Notification.InboxStyle(builder1).setBigContentTitle(this.mBigContentTitle);
            if (this.mSummaryTextSet == false) goto L5;
            style.setSummaryText(this.mSummaryText);
        L5:
            Iterator<CharSequence> r2 = this.mTexts.iterator();
        L7:
            if (r2.hasNext() == false) goto L9;
            CharSequence text = r2.next();
            style.addLine(text);
            goto L7
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void restoreFromCompatExtras(Bundle extras) {
            super.restoreFromCompatExtras(extras);
            this.mTexts.clear();
            if (extras.containsKey(NotificationCompat.EXTRA_TEXT_LINES) == false) goto L6;
            Collections.addAll(this.mTexts, extras.getCharSequenceArray(NotificationCompat.EXTRA_TEXT_LINES));
            return;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void clearCompatExtraKeys(Bundle extras) {
            super.clearCompatExtraKeys(extras);
            extras.remove(NotificationCompat.EXTRA_TEXT_LINES);
        }
    }

    public static class MessagingStyle extends Style {
        public static final int MAXIMUM_RETAINED_MESSAGES = 25;
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$MessagingStyle";
        private CharSequence mConversationTitle;
        private final List<Message> mHistoricMessages;
        private Boolean mIsGroupConversation;
        private final List<Message> mMessages;
        private Person mUser;

        static class Api24Impl {
            private Api24Impl() {
            }

            static Notification.MessagingStyle createMessagingStyle(CharSequence userDisplayName) {
                return new Notification.MessagingStyle(userDisplayName);
            }

            static Notification.MessagingStyle addMessage(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            static Notification.MessagingStyle setConversationTitle(Notification.MessagingStyle messagingStyle, CharSequence conversationTitle) {
                return messagingStyle.setConversationTitle(conversationTitle);
            }
        }

        static class Api26Impl {
            private Api26Impl() {
            }

            static Notification.MessagingStyle addHistoricMessage(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        static class Api28Impl {
            private Api28Impl() {
            }

            static Notification.MessagingStyle createMessagingStyle(android.app.Person user) {
                return new Notification.MessagingStyle(user);
            }

            static Notification.MessagingStyle setGroupConversation(Notification.MessagingStyle messagingStyle, boolean isGroupConversation) {
                return messagingStyle.setGroupConversation(isGroupConversation);
            }
        }

        public static final class Message {
            static final String KEY_DATA_MIME_TYPE = "type";
            static final String KEY_DATA_URI = "uri";
            static final String KEY_EXTRAS_BUNDLE = "extras";
            static final String KEY_NOTIFICATION_PERSON = "sender_person";
            static final String KEY_PERSON = "person";
            static final String KEY_SENDER = "sender";
            static final String KEY_TEXT = "text";
            static final String KEY_TIMESTAMP = "time";
            private String mDataMimeType;
            private Uri mDataUri;
            private Bundle mExtras;
            private final Person mPerson;
            private final CharSequence mText;
            private final long mTimestamp;

            static class Api24Impl {
                private Api24Impl() {
                }

                static Notification.MessagingStyle.Message createMessage(CharSequence text, long timestamp, CharSequence sender) {
                    return new Notification.MessagingStyle.Message(text, timestamp, sender);
                }

                static Notification.MessagingStyle.Message setData(Notification.MessagingStyle.Message message, String dataMimeType, Uri dataUri) {
                    return message.setData(dataMimeType, dataUri);
                }
            }

            static class Api28Impl {
                private Api28Impl() {
                }

                static Notification.MessagingStyle.Message createMessage(CharSequence text, long timestamp, android.app.Person sender) {
                    return new Notification.MessagingStyle.Message(text, timestamp, sender);
                }

                static Parcelable castToParcelable(android.app.Person person) {
                    return person;
                }
            }

            public Message(CharSequence text, long timestamp, Person person) {
                this.mExtras = new Bundle();
                this.mText = text;
                this.mTimestamp = timestamp;
                this.mPerson = person;
            }

            @Deprecated
            public Message(CharSequence text, long timestamp, CharSequence sender) {
                this(text, timestamp, new Person.Builder().setName(sender).build());
            }

            public Message setData(String dataMimeType, Uri dataUri) {
                this.mDataMimeType = dataMimeType;
                this.mDataUri = dataUri;
                return this;
            }

            public CharSequence getText() {
                return this.mText;
            }

            public long getTimestamp() {
                return this.mTimestamp;
            }

            public Bundle getExtras() {
                return this.mExtras;
            }

            @Deprecated
            public CharSequence getSender() {
                if (this.mPerson != null) goto L6;
                return null;
            L6:
                return this.mPerson.getName();
            }

            public Person getPerson() {
                return this.mPerson;
            }

            public String getDataMimeType() {
                return this.mDataMimeType;
            }

            public Uri getDataUri() {
                return this.mDataUri;
            }

            private Bundle toBundle() {
                Bundle bundle = new Bundle();
                if (this.mText == null) goto L5;
                bundle.putCharSequence(KEY_TEXT, this.mText);
            L5:
                bundle.putLong(KEY_TIMESTAMP, this.mTimestamp);
                if (this.mPerson == null) goto L12;
                bundle.putCharSequence(KEY_SENDER, this.mPerson.getName());
                int r1 = Build.VERSION.SDK_INT;
                Person r2 = this.mPerson;
                if (r1 < 28) goto L10;
                bundle.putParcelable(KEY_NOTIFICATION_PERSON, Api28Impl.castToParcelable(r2.toAndroidPerson()));
                goto L12
            L10:
                bundle.putBundle(KEY_PERSON, r2.toBundle());
            L12:
                if (this.mDataMimeType == null) goto L15;
                bundle.putString("type", this.mDataMimeType);
            L15:
                if (this.mDataUri == null) goto L18;
                bundle.putParcelable(KEY_DATA_URI, this.mDataUri);
            L18:
                if (this.mExtras == null) goto L20;
                bundle.putBundle(KEY_EXTRAS_BUNDLE, this.mExtras);
            L20:
                return bundle;
            }

            static Bundle[] getBundleArrayForMessages(List<Message> messages) {
                Bundle[] bundles = new Bundle[messages.size()];
                int N = messages.size();
                int i = 0;
            L3:
                if (i >= N) goto L5;
                bundles[i] = messages.get(i).toBundle();
                i = i + 1;
                goto L3
            L5:
                return bundles;
            }

            static List<Message> getMessagesFromBundleArray(Parcelable[] bundles) {
                List<Message> messages = new ArrayList(bundles.length);
                int i = 0;
            L4:
                if (i >= bundles.length) goto L11;
                if ((bundles[i] instanceof Bundle) == false) goto L10;
                Message message = getMessageFromBundle((Bundle) bundles[i]);
                if (message == null) goto L10;
                messages.add(message);
            L10:
                i = i + 1;
                goto L4
            L11:
                return messages;
            }

            static Message getMessageFromBundle(Bundle bundle) {
                if (bundle.containsKey(KEY_TEXT) == true) goto L6;
            L28:
                return null;
            L6:
                if (bundle.containsKey(KEY_TIMESTAMP) == false) goto L28;
                Person person = null;
                if (bundle.containsKey(KEY_PERSON) == false) goto L12;
                person = Person.fromBundle(bundle.getBundle(KEY_PERSON));     // Catch: ClassCastException -> L29
            L19:
                Message message = new Message(bundle.getCharSequence(KEY_TEXT), bundle.getLong(KEY_TIMESTAMP), person);     // Catch: ClassCastException -> L29
                if (bundle.containsKey("type") == false) goto L25;
                if (bundle.containsKey(KEY_DATA_URI) == false) goto L25;
                message.setData(bundle.getString("type"), (Uri) bundle.getParcelable(KEY_DATA_URI));     // Catch: ClassCastException -> L29
            L25:
                if (bundle.containsKey(KEY_EXTRAS_BUNDLE) == false) goto L27;
                message.getExtras().putAll(bundle.getBundle(KEY_EXTRAS_BUNDLE));     // Catch: ClassCastException -> L29
            L27:
                return message;
            L12:
                if (bundle.containsKey(KEY_NOTIFICATION_PERSON) == false) goto L17;
                if (Build.VERSION.SDK_INT < 28) goto L17;
                person = Person.fromAndroidPerson((android.app.Person) bundle.getParcelable(KEY_NOTIFICATION_PERSON));     // Catch: ClassCastException -> L29
            L17:
                if (bundle.containsKey(KEY_SENDER) == false) goto L19;
                person = new Person.Builder().setName(bundle.getCharSequence(KEY_SENDER)).build();     // Catch: ClassCastException -> L29
            L30:
                return null;
            }

            Notification.MessagingStyle.Message toAndroidMessage() {
                Person r0 = getPerson();
                CharSequence r3 = null;
                android.app.Person r4 = null;
                if (Build.VERSION.SDK_INT < 28) goto L9;
                CharSequence r1 = getText();
                long r5 = getTimestamp();
                if (r0 == null) goto L8;
                r4 = r0.toAndroidPerson();
            L8:
                Notification.MessagingStyle.Message r2 = Api28Impl.createMessage(r1, r5, r4);
            L15:
                if (getDataMimeType() == null) goto L17;
                Api24Impl.setData(r2, getDataMimeType(), getDataUri());
            L17:
                return r2;
            L9:
                CharSequence r6 = getText();
                long r7 = getTimestamp();
                if (r0 == null) goto L13;
                r3 = r0.getName();
            L13:
                r2 = Api24Impl.createMessage(r6, r7, r3);
                goto L15
            }
        }

        MessagingStyle() {
            this.mMessages = new ArrayList();
            this.mHistoricMessages = new ArrayList();
        }

        @Deprecated
        public MessagingStyle(CharSequence userDisplayName) {
            this.mMessages = new ArrayList();
            this.mHistoricMessages = new ArrayList();
            this.mUser = new Person.Builder().setName(userDisplayName).build();
        }

        public MessagingStyle(Person user) {
            this.mMessages = new ArrayList();
            this.mHistoricMessages = new ArrayList();
            if (TextUtils.isEmpty(user.getName()) == true) goto L7;
            this.mUser = user;
            return;
        L7:
            throw new IllegalArgumentException("User's name must not be empty.");
        }

        @Deprecated
        public CharSequence getUserDisplayName() {
            return this.mUser.getName();
        }

        public Person getUser() {
            return this.mUser;
        }

        public MessagingStyle setConversationTitle(CharSequence conversationTitle) {
            this.mConversationTitle = conversationTitle;
            return this;
        }

        public CharSequence getConversationTitle() {
            return this.mConversationTitle;
        }

        @Deprecated
        public MessagingStyle addMessage(CharSequence text, long timestamp, CharSequence sender) {
            this.mMessages.add(new Message(text, timestamp, new Person.Builder().setName(sender).build()));
            if (this.mMessages.size() <= 25) goto L5;
            this.mMessages.remove(0);
        L5:
            return this;
        }

        public MessagingStyle addMessage(CharSequence text, long timestamp, Person person) {
            addMessage(new Message(text, timestamp, person));
            return this;
        }

        public MessagingStyle addMessage(Message message) {
            if (message == null) goto L6;
            this.mMessages.add(message);
            if (this.mMessages.size() <= 25) goto L6;
            this.mMessages.remove(0);
        L6:
            return this;
        }

        public MessagingStyle addHistoricMessage(Message message) {
            if (message == null) goto L6;
            this.mHistoricMessages.add(message);
            if (this.mHistoricMessages.size() <= 25) goto L6;
            this.mHistoricMessages.remove(0);
        L6:
            return this;
        }

        public List<Message> getMessages() {
            return this.mMessages;
        }

        public List<Message> getHistoricMessages() {
            return this.mHistoricMessages;
        }

        public MessagingStyle setGroupConversation(boolean isGroupConversation) {
            this.mIsGroupConversation = Boolean.valueOf(isGroupConversation);
            return this;
        }

        public boolean isGroupConversation() {
            if (this.mBuilder == null) goto L13;
            if (this.mBuilder.mContext.getApplicationInfo().targetSdkVersion >= 28) goto L13;
            if (this.mIsGroupConversation != null) goto L13;
            if (this.mConversationTitle == null) goto L16;
            return true;
        L16:
            return false;
        L13:
            if (this.mIsGroupConversation != null) goto L15;
            return false;
        L15:
            return this.mIsGroupConversation.booleanValue();
        }

        public static MessagingStyle extractMessagingStyleFromNotification(Notification notification) {
            Style style = Style.extractStyleFromNotification(notification);
            if ((style instanceof MessagingStyle) == true) goto L5;
            return null;
        L5:
            return (MessagingStyle) style;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(NotificationBuilderWithBuilderAccessor builder) {
            setGroupConversation(isGroupConversation());
            int r0 = Build.VERSION.SDK_INT;
            Person r1 = this.mUser;
            if (r0 < 28) goto L5;
            Object frameworkStyle = Api28Impl.createMessagingStyle(r1.toAndroidPerson());
        L6:
            Iterator<Message> r2 = this.mMessages.iterator();
        L8:
            if (r2.hasNext() == false) goto L10;
            Message message = r2.next();
            Api24Impl.addMessage((Notification.MessagingStyle) frameworkStyle, message.toAndroidMessage());
            goto L8
        L10:
            Iterator<Message> r3 = this.mHistoricMessages.iterator();
        L12:
            if (r3.hasNext() == false) goto L15;
            Message historicMessage = r3.next();
            Api26Impl.addHistoricMessage((Notification.MessagingStyle) frameworkStyle, historicMessage.toAndroidMessage());
            goto L12
        L15:
            if (this.mIsGroupConversation.booleanValue() == false) goto L17;
        L18:
            Api24Impl.setConversationTitle((Notification.MessagingStyle) frameworkStyle, this.mConversationTitle);
        L20:
            if (Build.VERSION.SDK_INT < 28) goto L22;
            Api28Impl.setGroupConversation((Notification.MessagingStyle) frameworkStyle, this.mIsGroupConversation.booleanValue());
        L22:
            Notification.Builder builder1 = builder.getBuilder();
            ((Notification.Style) frameworkStyle).setBuilder(builder1);
            return;
        L17:
            if (Build.VERSION.SDK_INT < 28) goto L20;
        L5:
            frameworkStyle = Api24Impl.createMessagingStyle(r1.getName());
            goto L6
        }

        private Message findLatestIncomingMessage() {
            int i = this.mMessages.size();
        L3:
            i = i - 1;
            List<Message> r1 = this.mMessages;
            if (i < 0) goto L12;
            Message message = r1.get(i);
            if (message.getPerson() == null) goto L3;
            if (TextUtils.isEmpty(message.getPerson().getName()) == true) goto L3;
            return message;
        L12:
            if (r1.isEmpty() == false) goto L14;
            return null;
        L14:
            return this.mMessages.get(this.mMessages.size() - 1);
        }

        private boolean hasMessagesWithoutSender() {
            int i = this.mMessages.size() - 1;
        L3:
            if (i < 0) goto L10;
            Message message = this.mMessages.get(i);
            if (message.getPerson() == null) goto L9;
            if (message.getPerson().getName() != null) goto L9;
            return true;
        L9:
            i = i - 1;
            goto L3
        L10:
            return false;
        }

        private CharSequence makeMessageLine(Message message) {
            BidiFormatter bidi = BidiFormatter.getInstance();
            SpannableStringBuilder sb = new SpannableStringBuilder();
            if (1 == 0) goto L5;
            int color = ViewCompat.MEASURED_STATE_MASK;
        L6:
            CharSequence text = "";
            if (message.getPerson() != null) goto L9;
            CharSequence replyName = "";
        L11:
            if (TextUtils.isEmpty(replyName) == false) goto L19;
            replyName = this.mUser.getName();
            if (1 != 0) goto L15;
        L17:
            int r6 = color;
        L18:
            color = r6;
            goto L19
        L15:
            if (this.mBuilder.getColor() == 0) goto L17;
            r6 = this.mBuilder.getColor();
        L19:
            CharSequence senderText = bidi.unicodeWrap(replyName);
            sb.append(senderText);
            sb.setSpan(makeFontColorSpan(color), sb.length() - senderText.length(), sb.length(), 33);
            if (message.getText() == null) goto L23;
            text = message.getText();
        L23:
            sb.append("  ").append(bidi.unicodeWrap(text));
            return sb;
        L9:
            replyName = message.getPerson().getName();
            goto L11
        L5:
            color = -1;
            goto L6
        }

        private TextAppearanceSpan makeFontColorSpan(int color) {
            return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(color), null);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void addCompatExtras(Bundle extras) {
            super.addCompatExtras(extras);
            extras.putCharSequence(NotificationCompat.EXTRA_SELF_DISPLAY_NAME, this.mUser.getName());
            extras.putBundle(NotificationCompat.EXTRA_MESSAGING_STYLE_USER, this.mUser.toBundle());
            extras.putCharSequence(NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE, this.mConversationTitle);
            if (this.mConversationTitle == null) goto L8;
            if (this.mIsGroupConversation.booleanValue() == false) goto L8;
            extras.putCharSequence(NotificationCompat.EXTRA_CONVERSATION_TITLE, this.mConversationTitle);
        L8:
            if (this.mMessages.isEmpty() == true) goto L11;
            extras.putParcelableArray(NotificationCompat.EXTRA_MESSAGES, Message.getBundleArrayForMessages(this.mMessages));
        L11:
            if (this.mHistoricMessages.isEmpty() == true) goto L14;
            extras.putParcelableArray(NotificationCompat.EXTRA_HISTORIC_MESSAGES, Message.getBundleArrayForMessages(this.mHistoricMessages));
        L14:
            if (this.mIsGroupConversation == null) goto L17;
            extras.putBoolean(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION, this.mIsGroupConversation.booleanValue());
            return;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void restoreFromCompatExtras(Bundle extras) {
            super.restoreFromCompatExtras(extras);
            this.mMessages.clear();
            if (extras.containsKey(NotificationCompat.EXTRA_MESSAGING_STYLE_USER) == false) goto L5;
            this.mUser = Person.fromBundle(extras.getBundle(NotificationCompat.EXTRA_MESSAGING_STYLE_USER));
        L6:
            this.mConversationTitle = extras.getCharSequence(NotificationCompat.EXTRA_CONVERSATION_TITLE);
            if (this.mConversationTitle != null) goto L9;
            this.mConversationTitle = extras.getCharSequence(NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE);
        L9:
            Parcelable[] messages = extras.getParcelableArray(NotificationCompat.EXTRA_MESSAGES);
            if (messages == null) goto L12;
            this.mMessages.addAll(Message.getMessagesFromBundleArray(messages));
        L12:
            Parcelable[] historicMessages = extras.getParcelableArray(NotificationCompat.EXTRA_HISTORIC_MESSAGES);
            if (historicMessages == null) goto L16;
            this.mHistoricMessages.addAll(Message.getMessagesFromBundleArray(historicMessages));
        L16:
            if (extras.containsKey(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION) == false) goto L19;
            this.mIsGroupConversation = Boolean.valueOf(extras.getBoolean(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION));
            return;
        L19:
            return;
        L5:
            this.mUser = new Person.Builder().setName(extras.getString(NotificationCompat.EXTRA_SELF_DISPLAY_NAME)).build();
            goto L6
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void clearCompatExtraKeys(Bundle extras) {
            super.clearCompatExtraKeys(extras);
            extras.remove(NotificationCompat.EXTRA_MESSAGING_STYLE_USER);
            extras.remove(NotificationCompat.EXTRA_SELF_DISPLAY_NAME);
            extras.remove(NotificationCompat.EXTRA_CONVERSATION_TITLE);
            extras.remove(NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE);
            extras.remove(NotificationCompat.EXTRA_MESSAGES);
            extras.remove(NotificationCompat.EXTRA_HISTORIC_MESSAGES);
            extras.remove(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface NotificationVisibility {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ServiceNotificationBehavior {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface StreamType {
    }

    public static abstract class Style {
        CharSequence mBigContentTitle;
        protected Builder mBuilder;
        CharSequence mSummaryText;
        boolean mSummaryTextSet;

        static class Api24Impl {
            private Api24Impl() {
            }

            static void setChronometerCountDown(RemoteViews remoteViews, int viewId, boolean isCountDown) {
                remoteViews.setChronometerCountDown(viewId, isCountDown);
            }
        }

        public Style() {
            this.mSummaryTextSet = false;
        }

        public void setBuilder(Builder builder) {
            if (this.mBuilder == builder) goto L8;
            this.mBuilder = builder;
            if (this.mBuilder == null) goto L9;
            this.mBuilder.setStyle(this);
            return;
        L9:
            return;
        }

        public Notification build() {
            if (this.mBuilder == null) goto L6;
            Notification notification = this.mBuilder.build();
            return notification;
        L6:
            return null;
        }

        protected String getClassName() {
            return null;
        }

        public void apply(NotificationBuilderWithBuilderAccessor builder) {
        }

        public boolean displayCustomViewInline() {
            return false;
        }

        public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor builder) {
            return null;
        }

        public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor builder) {
            return null;
        }

        public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor builder) {
            return null;
        }

        public void addCompatExtras(Bundle extras) {
            if (this.mSummaryTextSet == false) goto L6;
            extras.putCharSequence(NotificationCompat.EXTRA_SUMMARY_TEXT, this.mSummaryText);
        L6:
            if (this.mBigContentTitle == null) goto L8;
            extras.putCharSequence(NotificationCompat.EXTRA_TITLE_BIG, this.mBigContentTitle);
        L8:
            String className = getClassName();
            if (className == null) goto L12;
            extras.putString(NotificationCompat.EXTRA_COMPAT_TEMPLATE, className);
            return;
        }

        protected void restoreFromCompatExtras(Bundle extras) {
            if (extras.containsKey(NotificationCompat.EXTRA_SUMMARY_TEXT) == false) goto L5;
            this.mSummaryText = extras.getCharSequence(NotificationCompat.EXTRA_SUMMARY_TEXT);
            this.mSummaryTextSet = true;
        L5:
            this.mBigContentTitle = extras.getCharSequence(NotificationCompat.EXTRA_TITLE_BIG);
        }

        protected void clearCompatExtraKeys(Bundle extras) {
            extras.remove(NotificationCompat.EXTRA_SUMMARY_TEXT);
            extras.remove(NotificationCompat.EXTRA_TITLE_BIG);
            extras.remove(NotificationCompat.EXTRA_COMPAT_TEMPLATE);
        }

        public static Style extractStyleFromNotification(Notification notification) {
            Bundle extras = NotificationCompat.getExtras(notification);
            if (extras != null) goto L7;
            return null;
        L7:
            return constructStyleForExtras(extras);
        }

        private static Style constructCompatStyleByPlatformName(String platformTemplateClass) {
            if (platformTemplateClass != null) goto L6;
            return null;
        L6:
            if (platformTemplateClass.equals(Notification.BigPictureStyle.class.getName()) == false) goto L10;
            return new BigPictureStyle();
        L10:
            if (platformTemplateClass.equals(Notification.BigTextStyle.class.getName()) == false) goto L14;
            return new BigTextStyle();
        L14:
            if (platformTemplateClass.equals(Notification.InboxStyle.class.getName()) == false) goto L18;
            return new InboxStyle();
        L18:
            if (platformTemplateClass.equals(Notification.MessagingStyle.class.getName()) == false) goto L22;
            return new MessagingStyle();
        L22:
            if (platformTemplateClass.equals(Notification.DecoratedCustomViewStyle.class.getName()) == true) goto L24;
            return null;
        L24:
            return new DecoratedCustomViewStyle();
        }

        static Style constructCompatStyleByName(String templateClass) {
            if (templateClass != null) goto L4;
            return null;
        L4:
            switch(templateClass.hashCode()) {
                case -716705180: goto L22;
                case -171946061: goto L19;
                case 714386739: goto L16;
                case 912942987: goto L13;
                case 919595044: goto L10;
                case 2090799565: goto L7;
                default: goto L24;
            };
        L24:
            byte r0 = -1;
        L25:
            switch(r0) {
                case 0: goto L38;
                case 1: goto L36;
                case 2: goto L34;
                case 3: goto L32;
                case 4: goto L30;
                case 5: goto L28;
                default: goto L41;
            };
        L41:
            return null;
        L28:
            return new CallStyle();
        L30:
            return new MessagingStyle();
        L32:
            return new DecoratedCustomViewStyle();
        L34:
            return new InboxStyle();
        L36:
            return new BigPictureStyle();
        L38:
            return new BigTextStyle();
        L7:
            if (templateClass.equals("androidx.core.app.NotificationCompat$MessagingStyle") == false) goto L24;
            r0 = 4;
            goto L25
        L10:
            if (templateClass.equals("androidx.core.app.NotificationCompat$BigTextStyle") == false) goto L24;
            r0 = 0;
            goto L25
        L13:
            if (templateClass.equals("androidx.core.app.NotificationCompat$InboxStyle") == false) goto L24;
            r0 = 2;
            goto L25
        L16:
            if (templateClass.equals("androidx.core.app.NotificationCompat$CallStyle") == false) goto L24;
            r0 = 5;
            goto L25
        L19:
            if (templateClass.equals("androidx.core.app.NotificationCompat$BigPictureStyle") == false) goto L24;
            r0 = 1;
            goto L25
        L22:
            if (templateClass.equals("androidx.core.app.NotificationCompat$DecoratedCustomViewStyle") == false) goto L24;
            r0 = 3;
            goto L25
        }

        static Style constructCompatStyleForBundle(Bundle extras) {
            Style style = constructCompatStyleByName(extras.getString(NotificationCompat.EXTRA_COMPAT_TEMPLATE));
            if (style == null) goto L6;
            return style;
        L6:
            if (extras.containsKey(NotificationCompat.EXTRA_SELF_DISPLAY_NAME) == true) goto L32;
            if (extras.containsKey(NotificationCompat.EXTRA_MESSAGING_STYLE_USER) == true) goto L32;
            if (extras.containsKey(NotificationCompat.EXTRA_PICTURE) == true) goto L30;
            if (extras.containsKey(NotificationCompat.EXTRA_PICTURE_ICON) == true) goto L30;
            if (extras.containsKey(NotificationCompat.EXTRA_BIG_TEXT) == false) goto L20;
            return new BigTextStyle();
        L20:
            if (extras.containsKey(NotificationCompat.EXTRA_TEXT_LINES) == false) goto L24;
            return new InboxStyle();
        L24:
            if (extras.containsKey(NotificationCompat.EXTRA_CALL_TYPE) == false) goto L28;
            return new CallStyle();
        L28:
            return constructCompatStyleByPlatformName(extras.getString(NotificationCompat.EXTRA_TEMPLATE));
        L30:
            return new BigPictureStyle();
        L32:
            return new MessagingStyle();
        }

        static Style constructStyleForExtras(Bundle extras) {
            Style style = constructCompatStyleForBundle(extras);
            if (style != null) goto L9;
            return null;
        L9:
            style.restoreFromCompatExtras(extras);     // Catch: ClassCastException -> L7
            return style;
        L8:
            return null;
        }

        public RemoteViews applyStandardTemplate(boolean showSmallIcon, int resId, boolean fitIn1U) {
            Resources res = this.mBuilder.mContext.getResources();
            RemoteViews contentView = new RemoteViews(this.mBuilder.mContext.getPackageName(), resId);
            boolean showLine3 = false;
            boolean showLine2 = false;
            int r12 = 0;
            if (this.mBuilder.getPriority() >= (-1)) goto L5;
            boolean r6 = true;
        L7:
            if (this.mBuilder.mLargeIcon == null) goto L13;
            contentView.setViewVisibility(R.id.icon, 0);
            contentView.setImageViewBitmap(R.id.icon, createColoredBitmap(this.mBuilder.mLargeIcon, 0));
            if (showSmallIcon == false) goto L18;
            if (this.mBuilder.mNotification.icon == 0) goto L18;
            int backgroundSize = res.getDimensionPixelSize(R.dimen.notification_right_icon_size);
            int iconSize = backgroundSize - (res.getDimensionPixelSize(R.dimen.notification_small_icon_background_padding) * 2);
            Bitmap smallBit = createIconWithBackground(this.mBuilder.mNotification.icon, backgroundSize, iconSize, this.mBuilder.getColor());
            contentView.setImageViewBitmap(R.id.right_icon, smallBit);
            contentView.setViewVisibility(R.id.right_icon, 0);
        L18:
            if (this.mBuilder.mContentTitle == null) goto L21;
            contentView.setTextViewText(R.id.title, this.mBuilder.mContentTitle);
        L21:
            if (this.mBuilder.mContentText == null) goto L24;
            contentView.setTextViewText(R.id.text, this.mBuilder.mContentText);
            showLine3 = true;
        L24:
            if (this.mBuilder.mContentInfo == null) goto L27;
            contentView.setTextViewText(R.id.info, this.mBuilder.mContentInfo);
            contentView.setViewVisibility(R.id.info, 0);
            showLine3 = true;
            boolean hasRightSide = true;
        L35:
            if (this.mBuilder.mSubText == null) goto L40;
            contentView.setTextViewText(R.id.text, this.mBuilder.mSubText);
            if (this.mBuilder.mContentText == null) goto L39;
            contentView.setTextViewText(R.id.text2, this.mBuilder.mContentText);
            contentView.setViewVisibility(R.id.text2, 0);
            showLine2 = true;
            int r15 = 8;
        L41:
            if (showLine2 == false) goto L46;
            if (fitIn1U == false) goto L44;
            float subTextSize = res.getDimensionPixelSize(R.dimen.notification_subtext_size);
            contentView.setTextViewTextSize(R.id.text, 0, subTextSize);
        L44:
            contentView.setViewPadding(R.id.line1, 0, 0, 0, 0);
        L46:
            if (this.mBuilder.getWhenIfShowing() != 0) goto L48;
        L54:
            int r7 = R.id.right_side;
            if (hasRightSide == false) goto L57;
            int r8 = 0;
        L58:
            contentView.setViewVisibility(r7, r8);
            int r9 = R.id.line3;
            if (showLine3 == true) goto L62;
            r12 = r15;
        L62:
            contentView.setViewVisibility(r9, r12);
            return contentView;
        L57:
            r8 = r15;
            goto L58
        L48:
            if (this.mBuilder.mUseChronometer == false) goto L52;
            contentView.setViewVisibility(R.id.chronometer, 0);
            contentView.setLong(R.id.chronometer, "setBase", this.mBuilder.getWhenIfShowing() + (SystemClock.elapsedRealtime() - System.currentTimeMillis()));
            contentView.setBoolean(R.id.chronometer, "setStarted", true);
            if (this.mBuilder.mChronometerCountDown == false) goto L53;
            Api24Impl.setChronometerCountDown(contentView, R.id.chronometer, this.mBuilder.mChronometerCountDown);
        L53:
            hasRightSide = true;
            goto L54
        L52:
            contentView.setViewVisibility(R.id.time, 0);
            contentView.setLong(R.id.time, "setTime", this.mBuilder.getWhenIfShowing());
            goto L53
        L39:
            r15 = 8;
            contentView.setViewVisibility(R.id.text2, 8);
            goto L41
        L40:
            r15 = 8;
            goto L41
        L27:
            if (this.mBuilder.mNumber <= 0) goto L33;
            int tooBig = res.getInteger(R.integer.status_bar_notification_info_maxnum);
            if (this.mBuilder.mNumber <= tooBig) goto L31;
            contentView.setTextViewText(R.id.info, res.getString(R.string.status_bar_notification_info_overflow));
        L32:
            contentView.setViewVisibility(R.id.info, 0);
            showLine3 = true;
            hasRightSide = true;
            goto L35
        L31:
            NumberFormat f = NumberFormat.getIntegerInstance();
            contentView.setTextViewText(R.id.info, f.format(this.mBuilder.mNumber));
            goto L32
        L33:
            contentView.setViewVisibility(R.id.info, 8);
            hasRightSide = false;
            goto L35
        L13:
            if (showSmallIcon == false) goto L18;
            if (this.mBuilder.mNotification.icon == 0) goto L18;
            contentView.setViewVisibility(R.id.icon, 0);
            int backgroundSize2 = res.getDimensionPixelSize(R.dimen.notification_large_icon_width) - res.getDimensionPixelSize(R.dimen.notification_big_circle_margin);
            int iconSize2 = res.getDimensionPixelSize(R.dimen.notification_small_icon_size_as_large);
            Bitmap smallBit2 = createIconWithBackground(this.mBuilder.mNotification.icon, backgroundSize2, iconSize2, this.mBuilder.getColor());
            contentView.setImageViewBitmap(R.id.icon, smallBit2);
            goto L18
        L5:
            r6 = false;
            goto L7
        }

        public Bitmap createColoredBitmap(int iconId, int color) {
            return createColoredBitmap(iconId, color, 0);
        }

        Bitmap createColoredBitmap(IconCompat icon, int color) {
            return createColoredBitmap(icon, color, 0);
        }

        private Bitmap createColoredBitmap(int iconId, int color, int size) {
            return createColoredBitmap(IconCompat.createWithResource(this.mBuilder.mContext, iconId), color, size);
        }

        private Bitmap createColoredBitmap(IconCompat icon, int color, int size) {
            Drawable drawable = icon.loadDrawable(this.mBuilder.mContext);
            if (size != 0) goto L5;
            int width = drawable.getIntrinsicWidth();
        L6:
            if (size != 0) goto L8;
            int height = drawable.getIntrinsicHeight();
        L9:
            Bitmap resultBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            drawable.setBounds(0, 0, width, height);
            if (color == 0) goto L12;
            drawable.mutate().setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        L12:
            Canvas canvas = new Canvas(resultBitmap);
            drawable.draw(canvas);
            return resultBitmap;
        L8:
            height = size;
            goto L9
        L5:
            width = size;
            goto L6
        }

        private Bitmap createIconWithBackground(int iconId, int size, int iconSize, int color) {
            int r0 = R.drawable.notification_icon_background;
            if (color != 0) goto L5;
            int r1 = 0;
        L6:
            Bitmap coloredBitmap = createColoredBitmap(r0, r1, size);
            Canvas canvas = new Canvas(coloredBitmap);
            Drawable icon = this.mBuilder.mContext.getResources().getDrawable(iconId).mutate();
            icon.setFilterBitmap(true);
            int inset = (size - iconSize) / 2;
            icon.setBounds(inset, inset, iconSize + inset, iconSize + inset);
            icon.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            icon.draw(canvas);
            return coloredBitmap;
        L5:
            r1 = color;
            goto L6
        }

        public void buildIntoRemoteViews(RemoteViews outerView, RemoteViews innerView) {
            hideNormalContent(outerView);
            outerView.removeAllViews(R.id.notification_main_column);
            outerView.addView(R.id.notification_main_column, innerView.clone());
            outerView.setViewVisibility(R.id.notification_main_column, 0);
            int top = calculateTopPadding();
            outerView.setViewPadding(R.id.notification_main_column_container, 0, top, 0, 0);
        }

        private void hideNormalContent(RemoteViews outerView) {
            outerView.setViewVisibility(R.id.title, 8);
            outerView.setViewVisibility(R.id.text2, 8);
            outerView.setViewVisibility(R.id.text, 8);
        }

        private int calculateTopPadding() {
            Resources resources = this.mBuilder.mContext.getResources();
            int padding = resources.getDimensionPixelSize(R.dimen.notification_top_pad);
            int largePadding = resources.getDimensionPixelSize(R.dimen.notification_top_pad_large_text);
            float fontScale = resources.getConfiguration().fontScale;
            float largeFactor = (constrain(fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - largeFactor) * padding) + (largePadding * largeFactor));
        }

        private static float constrain(float amount, float low, float high) {
            if (amount >= low) goto L6;
            return low;
        L6:
            if (amount <= high) goto L9;
            return high;
        L9:
            return amount;
        }
    }

    public static final class TvExtender implements Extender {
        static final String EXTRA_CHANNEL_ID = "channel_id";
        static final String EXTRA_CONTENT_INTENT = "content_intent";
        static final String EXTRA_DELETE_INTENT = "delete_intent";
        private static final String EXTRA_FLAGS = "flags";
        static final String EXTRA_SUPPRESS_SHOW_OVER_APPS = "suppressShowOverApps";
        static final String EXTRA_TV_EXTENDER = "android.tv.EXTENSIONS";
        private static final int FLAG_AVAILABLE_ON_TV = 1;
        private static final String TAG = "TvExtender";
        private String mChannelId;
        private PendingIntent mContentIntent;
        private PendingIntent mDeleteIntent;
        private int mFlags;
        private boolean mSuppressShowOverApps;

        public TvExtender() {
            this.mFlags = 1;
        }

        public TvExtender(Notification notif) {
            if (notif.extras != null) goto L5;
            Bundle tvBundle = null;
        L6:
            if (tvBundle == null) goto L9;
            this.mFlags = tvBundle.getInt(EXTRA_FLAGS);
            this.mChannelId = tvBundle.getString(EXTRA_CHANNEL_ID);
            this.mSuppressShowOverApps = tvBundle.getBoolean(EXTRA_SUPPRESS_SHOW_OVER_APPS);
            this.mContentIntent = (PendingIntent) tvBundle.getParcelable(EXTRA_CONTENT_INTENT);
            this.mDeleteIntent = (PendingIntent) tvBundle.getParcelable(EXTRA_DELETE_INTENT);
            return;
        L9:
            return;
        L5:
            tvBundle = notif.extras.getBundle(EXTRA_TV_EXTENDER);
            goto L6
        }

        @Override // androidx.core.app.NotificationCompat.Extender
        public Builder extend(Builder builder) {
            Bundle tvExtensions = new Bundle();
            tvExtensions.putInt(EXTRA_FLAGS, this.mFlags);
            tvExtensions.putString(EXTRA_CHANNEL_ID, this.mChannelId);
            tvExtensions.putBoolean(EXTRA_SUPPRESS_SHOW_OVER_APPS, this.mSuppressShowOverApps);
            if (this.mContentIntent == null) goto L6;
            tvExtensions.putParcelable(EXTRA_CONTENT_INTENT, this.mContentIntent);
        L6:
            if (this.mDeleteIntent == null) goto L8;
            tvExtensions.putParcelable(EXTRA_DELETE_INTENT, this.mDeleteIntent);
        L8:
            builder.getExtras().putBundle(EXTRA_TV_EXTENDER, tvExtensions);
            return builder;
        }

        public boolean isAvailableOnTv() {
            if ((this.mFlags & 1) != 0) goto L7;
            return false;
        L7:
            return true;
        }

        public TvExtender setChannelId(String channelId) {
            this.mChannelId = channelId;
            return this;
        }

        public String getChannelId() {
            return this.mChannelId;
        }

        public TvExtender setContentIntent(PendingIntent intent) {
            this.mContentIntent = intent;
            return this;
        }

        public PendingIntent getContentIntent() {
            return this.mContentIntent;
        }

        public TvExtender setDeleteIntent(PendingIntent intent) {
            this.mDeleteIntent = intent;
            return this;
        }

        public PendingIntent getDeleteIntent() {
            return this.mDeleteIntent;
        }

        public TvExtender setSuppressShowOverApps(boolean suppress) {
            this.mSuppressShowOverApps = suppress;
            return this;
        }

        public boolean isSuppressShowOverApps() {
            return this.mSuppressShowOverApps;
        }
    }

    public static final class WearableExtender implements Extender {
        private static final int DEFAULT_CONTENT_ICON_GRAVITY = 8388613;
        private static final int DEFAULT_FLAGS = 1;
        private static final int DEFAULT_GRAVITY = 80;
        private static final String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
        private static final int FLAG_BIG_PICTURE_AMBIENT = 32;
        private static final int FLAG_CONTENT_INTENT_AVAILABLE_OFFLINE = 1;
        private static final int FLAG_HINT_AVOID_BACKGROUND_CLIPPING = 16;
        private static final int FLAG_HINT_CONTENT_INTENT_LAUNCHES_ACTIVITY = 64;
        private static final int FLAG_HINT_HIDE_ICON = 2;
        private static final int FLAG_HINT_SHOW_BACKGROUND_ONLY = 4;
        private static final int FLAG_START_SCROLL_BOTTOM = 8;
        private static final String KEY_ACTIONS = "actions";
        private static final String KEY_BACKGROUND = "background";
        private static final String KEY_BRIDGE_TAG = "bridgeTag";
        private static final String KEY_CONTENT_ACTION_INDEX = "contentActionIndex";
        private static final String KEY_CONTENT_ICON = "contentIcon";
        private static final String KEY_CONTENT_ICON_GRAVITY = "contentIconGravity";
        private static final String KEY_CUSTOM_CONTENT_HEIGHT = "customContentHeight";
        private static final String KEY_CUSTOM_SIZE_PRESET = "customSizePreset";
        private static final String KEY_DISMISSAL_ID = "dismissalId";
        private static final String KEY_DISPLAY_INTENT = "displayIntent";
        private static final String KEY_FLAGS = "flags";
        private static final String KEY_GRAVITY = "gravity";
        private static final String KEY_HINT_SCREEN_TIMEOUT = "hintScreenTimeout";
        private static final String KEY_PAGES = "pages";

        @Deprecated
        public static final int SCREEN_TIMEOUT_LONG = -1;

        @Deprecated
        public static final int SCREEN_TIMEOUT_SHORT = 0;

        @Deprecated
        public static final int SIZE_DEFAULT = 0;

        @Deprecated
        public static final int SIZE_FULL_SCREEN = 5;

        @Deprecated
        public static final int SIZE_LARGE = 4;

        @Deprecated
        public static final int SIZE_MEDIUM = 3;

        @Deprecated
        public static final int SIZE_SMALL = 2;

        @Deprecated
        public static final int SIZE_XSMALL = 1;
        public static final int UNSET_ACTION_INDEX = -1;
        private ArrayList<Action> mActions;
        private Bitmap mBackground;
        private String mBridgeTag;
        private int mContentActionIndex;
        private int mContentIcon;
        private int mContentIconGravity;
        private int mCustomContentHeight;
        private int mCustomSizePreset;
        private String mDismissalId;
        private PendingIntent mDisplayIntent;
        private int mFlags;
        private int mGravity;
        private int mHintScreenTimeout;
        private ArrayList<Notification> mPages;

        static class Api20Impl {
            private Api20Impl() {
            }

            static Notification.Action.Builder createBuilder(int icon, CharSequence title, PendingIntent intent) {
                return new Notification.Action.Builder(icon, title, intent);
            }

            static Notification.Action.Builder addExtras(Notification.Action.Builder builder, Bundle extras) {
                return builder.addExtras(extras);
            }

            static Notification.Action.Builder addRemoteInput(Notification.Action.Builder builder, android.app.RemoteInput remoteInput) {
                return builder.addRemoteInput(remoteInput);
            }

            static Notification.Action build(Notification.Action.Builder builder) {
                return builder.build();
            }

            public static Action getActionCompatFromAction(ArrayList<Parcelable> parcelables, int i) {
                return NotificationCompat.getActionCompatFromAction((Notification.Action) parcelables.get(i));
            }
        }

        static class Api23Impl {
            private Api23Impl() {
            }

            static Notification.Action.Builder createBuilder(Icon icon, CharSequence title, PendingIntent intent) {
                return new Notification.Action.Builder(icon, title, intent);
            }
        }

        static class Api24Impl {
            private Api24Impl() {
            }

            static Notification.Action.Builder setAllowGeneratedReplies(Notification.Action.Builder builder, boolean allowGeneratedReplies) {
                return builder.setAllowGeneratedReplies(allowGeneratedReplies);
            }
        }

        static class Api31Impl {
            private Api31Impl() {
            }

            static Notification.Action.Builder setAuthenticationRequired(Notification.Action.Builder builder, boolean authenticationRequired) {
                return builder.setAuthenticationRequired(authenticationRequired);
            }
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ Object m7232clone() throws CloneNotSupportedException {
            return clone();
        }

        public WearableExtender() {
            this.mActions = new ArrayList();
            this.mFlags = 1;
            this.mPages = new ArrayList();
            this.mContentIconGravity = 8388613;
            this.mContentActionIndex = -1;
            this.mCustomSizePreset = 0;
            this.mGravity = DEFAULT_GRAVITY;
        }

        public WearableExtender(Notification notification) {
            this.mActions = new ArrayList();
            this.mFlags = 1;
            this.mPages = new ArrayList();
            this.mContentIconGravity = 8388613;
            this.mContentActionIndex = -1;
            this.mCustomSizePreset = 0;
            this.mGravity = DEFAULT_GRAVITY;
            Bundle extras = NotificationCompat.getExtras(notification);
            if (extras == null) goto L5;
            Bundle wearableBundle = extras.getBundle(EXTRA_WEARABLE_EXTENSIONS);
        L7:
            if (wearableBundle == null) goto L21;
            ArrayList<Parcelable> parcelables = wearableBundle.getParcelableArrayList(KEY_ACTIONS);
            if (parcelables == null) goto L15;
            Action[] actions = new Action[parcelables.size()];
            int i = 0;
        L12:
            if (i >= actions.length) goto L14;
            actions[i] = Api20Impl.getActionCompatFromAction(parcelables, i);
            i = i + 1;
            goto L12
        L14:
            Collections.addAll(this.mActions, actions);
        L15:
            this.mFlags = wearableBundle.getInt(KEY_FLAGS, 1);
            this.mDisplayIntent = (PendingIntent) wearableBundle.getParcelable(KEY_DISPLAY_INTENT);
            Notification[] pages = NotificationCompat.getNotificationArrayFromBundle(wearableBundle, KEY_PAGES);
            if (pages == null) goto L18;
            Collections.addAll(this.mPages, pages);
        L18:
            this.mBackground = (Bitmap) wearableBundle.getParcelable(KEY_BACKGROUND);
            this.mContentIcon = wearableBundle.getInt(KEY_CONTENT_ICON);
            this.mContentIconGravity = wearableBundle.getInt(KEY_CONTENT_ICON_GRAVITY, 8388613);
            this.mContentActionIndex = wearableBundle.getInt(KEY_CONTENT_ACTION_INDEX, -1);
            this.mCustomSizePreset = wearableBundle.getInt(KEY_CUSTOM_SIZE_PRESET, 0);
            this.mCustomContentHeight = wearableBundle.getInt(KEY_CUSTOM_CONTENT_HEIGHT);
            this.mGravity = wearableBundle.getInt(KEY_GRAVITY, DEFAULT_GRAVITY);
            this.mHintScreenTimeout = wearableBundle.getInt(KEY_HINT_SCREEN_TIMEOUT);
            this.mDismissalId = wearableBundle.getString(KEY_DISMISSAL_ID);
            this.mBridgeTag = wearableBundle.getString(KEY_BRIDGE_TAG);
            return;
        L21:
            return;
        L5:
            wearableBundle = null;
            goto L7
        }

        @Override // androidx.core.app.NotificationCompat.Extender
        public Builder extend(Builder builder) {
            Bundle wearableBundle = new Bundle();
            if (this.mActions.isEmpty() == true) goto L10;
            ArrayList<Parcelable> parcelables = new ArrayList(this.mActions.size());
            Iterator<Action> r2 = this.mActions.iterator();
        L6:
            if (r2.hasNext() == false) goto L8;
            Action action = r2.next();
            parcelables.add(getActionFromActionCompat(action));
            goto L6
        L8:
            wearableBundle.putParcelableArrayList(KEY_ACTIONS, parcelables);
        L10:
            if (this.mFlags == 1) goto L13;
            wearableBundle.putInt(KEY_FLAGS, this.mFlags);
        L13:
            if (this.mDisplayIntent == null) goto L16;
            wearableBundle.putParcelable(KEY_DISPLAY_INTENT, this.mDisplayIntent);
        L16:
            if (this.mPages.isEmpty() == true) goto L19;
            wearableBundle.putParcelableArray(KEY_PAGES, (Parcelable[]) this.mPages.toArray(new Notification[this.mPages.size()]));
        L19:
            if (this.mBackground == null) goto L22;
            wearableBundle.putParcelable(KEY_BACKGROUND, this.mBackground);
        L22:
            if (this.mContentIcon == 0) goto L25;
            wearableBundle.putInt(KEY_CONTENT_ICON, this.mContentIcon);
        L25:
            if (this.mContentIconGravity == 8388613) goto L28;
            wearableBundle.putInt(KEY_CONTENT_ICON_GRAVITY, this.mContentIconGravity);
        L28:
            if (this.mContentActionIndex == (-1)) goto L31;
            wearableBundle.putInt(KEY_CONTENT_ACTION_INDEX, this.mContentActionIndex);
        L31:
            if (this.mCustomSizePreset == 0) goto L34;
            wearableBundle.putInt(KEY_CUSTOM_SIZE_PRESET, this.mCustomSizePreset);
        L34:
            if (this.mCustomContentHeight == 0) goto L37;
            wearableBundle.putInt(KEY_CUSTOM_CONTENT_HEIGHT, this.mCustomContentHeight);
        L37:
            if (this.mGravity == DEFAULT_GRAVITY) goto L40;
            wearableBundle.putInt(KEY_GRAVITY, this.mGravity);
        L40:
            if (this.mHintScreenTimeout == 0) goto L43;
            wearableBundle.putInt(KEY_HINT_SCREEN_TIMEOUT, this.mHintScreenTimeout);
        L43:
            if (this.mDismissalId == null) goto L46;
            wearableBundle.putString(KEY_DISMISSAL_ID, this.mDismissalId);
        L46:
            if (this.mBridgeTag == null) goto L48;
            wearableBundle.putString(KEY_BRIDGE_TAG, this.mBridgeTag);
        L48:
            builder.getExtras().putBundle(EXTRA_WEARABLE_EXTENSIONS, wearableBundle);
            return builder;
        }

        private static Notification.Action getActionFromActionCompat(Action actionCompat) {
            IconCompat iconCompat = actionCompat.getIconCompat();
            if (iconCompat != null) goto L5;
            Icon r1 = null;
        L6:
            Notification.Action.Builder actionBuilder = Api23Impl.createBuilder(r1, actionCompat.getTitle(), actionCompat.getActionIntent());
            if (actionCompat.getExtras() == null) goto L9;
            Bundle actionExtras = new Bundle(actionCompat.getExtras());
        L10:
            actionExtras.putBoolean("android.support.allowGeneratedReplies", actionCompat.getAllowGeneratedReplies());
            Api24Impl.setAllowGeneratedReplies(actionBuilder, actionCompat.getAllowGeneratedReplies());
            if (Build.VERSION.SDK_INT < 31) goto L13;
            Api31Impl.setAuthenticationRequired(actionBuilder, actionCompat.isAuthenticationRequired());
        L13:
            Api20Impl.addExtras(actionBuilder, actionExtras);
            RemoteInput[] remoteInputCompats = actionCompat.getRemoteInputs();
            if (remoteInputCompats == null) goto L19;
            android.app.RemoteInput[] remoteInputs = RemoteInput.fromCompat(remoteInputCompats);
            int r4 = remoteInputs.length;
            int r5 = 0;
        L16:
            if (r5 >= r4) goto L19;
            android.app.RemoteInput remoteInput = remoteInputs[r5];
            Api20Impl.addRemoteInput(actionBuilder, remoteInput);
            r5 = r5 + 1;
        L19:
            return Api20Impl.build(actionBuilder);
        L9:
            actionExtras = new Bundle();
            goto L10
        L5:
            r1 = iconCompat.toIcon();
            goto L6
        }

        public WearableExtender clone() {
            WearableExtender that = new WearableExtender();
            that.mActions = new ArrayList(this.mActions);
            that.mFlags = this.mFlags;
            that.mDisplayIntent = this.mDisplayIntent;
            that.mPages = new ArrayList(this.mPages);
            that.mBackground = this.mBackground;
            that.mContentIcon = this.mContentIcon;
            that.mContentIconGravity = this.mContentIconGravity;
            that.mContentActionIndex = this.mContentActionIndex;
            that.mCustomSizePreset = this.mCustomSizePreset;
            that.mCustomContentHeight = this.mCustomContentHeight;
            that.mGravity = this.mGravity;
            that.mHintScreenTimeout = this.mHintScreenTimeout;
            that.mDismissalId = this.mDismissalId;
            that.mBridgeTag = this.mBridgeTag;
            return that;
        }

        public WearableExtender addAction(Action action) {
            this.mActions.add(action);
            return this;
        }

        public WearableExtender addActions(List<Action> actions) {
            this.mActions.addAll(actions);
            return this;
        }

        public WearableExtender clearActions() {
            this.mActions.clear();
            return this;
        }

        public List<Action> getActions() {
            return this.mActions;
        }

        @Deprecated
        public WearableExtender setDisplayIntent(PendingIntent intent) {
            this.mDisplayIntent = intent;
            return this;
        }

        @Deprecated
        public PendingIntent getDisplayIntent() {
            return this.mDisplayIntent;
        }

        @Deprecated
        public WearableExtender addPage(Notification page) {
            this.mPages.add(page);
            return this;
        }

        @Deprecated
        public WearableExtender addPages(List<Notification> pages) {
            this.mPages.addAll(pages);
            return this;
        }

        @Deprecated
        public WearableExtender clearPages() {
            this.mPages.clear();
            return this;
        }

        @Deprecated
        public List<Notification> getPages() {
            return this.mPages;
        }

        @Deprecated
        public WearableExtender setBackground(Bitmap background) {
            this.mBackground = background;
            return this;
        }

        @Deprecated
        public Bitmap getBackground() {
            return this.mBackground;
        }

        @Deprecated
        public WearableExtender setContentIcon(int icon) {
            this.mContentIcon = icon;
            return this;
        }

        @Deprecated
        public int getContentIcon() {
            return this.mContentIcon;
        }

        @Deprecated
        public WearableExtender setContentIconGravity(int contentIconGravity) {
            this.mContentIconGravity = contentIconGravity;
            return this;
        }

        @Deprecated
        public int getContentIconGravity() {
            return this.mContentIconGravity;
        }

        public WearableExtender setContentAction(int actionIndex) {
            this.mContentActionIndex = actionIndex;
            return this;
        }

        public int getContentAction() {
            return this.mContentActionIndex;
        }

        @Deprecated
        public WearableExtender setGravity(int gravity) {
            this.mGravity = gravity;
            return this;
        }

        @Deprecated
        public int getGravity() {
            return this.mGravity;
        }

        @Deprecated
        public WearableExtender setCustomSizePreset(int sizePreset) {
            this.mCustomSizePreset = sizePreset;
            return this;
        }

        @Deprecated
        public int getCustomSizePreset() {
            return this.mCustomSizePreset;
        }

        @Deprecated
        public WearableExtender setCustomContentHeight(int height) {
            this.mCustomContentHeight = height;
            return this;
        }

        @Deprecated
        public int getCustomContentHeight() {
            return this.mCustomContentHeight;
        }

        public WearableExtender setStartScrollBottom(boolean startScrollBottom) {
            setFlag(8, startScrollBottom);
            return this;
        }

        public boolean getStartScrollBottom() {
            if ((this.mFlags & 8) == 0) goto L5;
            return true;
        L5:
            return false;
        }

        public WearableExtender setContentIntentAvailableOffline(boolean contentIntentAvailableOffline) {
            setFlag(1, contentIntentAvailableOffline);
            return this;
        }

        public boolean getContentIntentAvailableOffline() {
            if ((this.mFlags & 1) != 0) goto L7;
            return false;
        L7:
            return true;
        }

        @Deprecated
        public WearableExtender setHintHideIcon(boolean hintHideIcon) {
            setFlag(2, hintHideIcon);
            return this;
        }

        @Deprecated
        public boolean getHintHideIcon() {
            if ((this.mFlags & 2) == 0) goto L5;
            return true;
        L5:
            return false;
        }

        @Deprecated
        public WearableExtender setHintShowBackgroundOnly(boolean hintShowBackgroundOnly) {
            setFlag(4, hintShowBackgroundOnly);
            return this;
        }

        @Deprecated
        public boolean getHintShowBackgroundOnly() {
            if ((this.mFlags & 4) == 0) goto L5;
            return true;
        L5:
            return false;
        }

        @Deprecated
        public WearableExtender setHintAvoidBackgroundClipping(boolean hintAvoidBackgroundClipping) {
            setFlag(16, hintAvoidBackgroundClipping);
            return this;
        }

        @Deprecated
        public boolean getHintAvoidBackgroundClipping() {
            if ((this.mFlags & 16) == 0) goto L5;
            return true;
        L5:
            return false;
        }

        @Deprecated
        public WearableExtender setHintScreenTimeout(int timeout) {
            this.mHintScreenTimeout = timeout;
            return this;
        }

        @Deprecated
        public int getHintScreenTimeout() {
            return this.mHintScreenTimeout;
        }

        @Deprecated
        public WearableExtender setHintAmbientBigPicture(boolean hintAmbientBigPicture) {
            setFlag(32, hintAmbientBigPicture);
            return this;
        }

        @Deprecated
        public boolean getHintAmbientBigPicture() {
            if ((this.mFlags & 32) == 0) goto L5;
            return true;
        L5:
            return false;
        }

        public WearableExtender setHintContentIntentLaunchesActivity(boolean hintContentIntentLaunchesActivity) {
            setFlag(64, hintContentIntentLaunchesActivity);
            return this;
        }

        public boolean getHintContentIntentLaunchesActivity() {
            if ((this.mFlags & 64) == 0) goto L5;
            return true;
        L5:
            return false;
        }

        public WearableExtender setDismissalId(String dismissalId) {
            this.mDismissalId = dismissalId;
            return this;
        }

        public String getDismissalId() {
            return this.mDismissalId;
        }

        public WearableExtender setBridgeTag(String bridgeTag) {
            this.mBridgeTag = bridgeTag;
            return this;
        }

        public String getBridgeTag() {
            return this.mBridgeTag;
        }

        private void setFlag(int mask, boolean value) {
            int r0 = this.mFlags;
            if (value == false) goto L5;
            this.mFlags = r0 | mask;
            return;
        L5:
            this.mFlags = r0 & (~mask);
        }
    }

    static Notification[] getNotificationArrayFromBundle(Bundle bundle, String key) {
        Parcelable[] array = bundle.getParcelableArray(key);
        if ((array instanceof Notification[]) == true) goto L13;
        if (array == null) goto L13;
        Notification[] typedArray = new Notification[array.length];
        int i = 0;
    L8:
        if (i >= array.length) goto L10;
        typedArray[i] = (Notification) array[i];
        i = i + 1;
        goto L8
    L10:
        bundle.putParcelableArray(key, typedArray);
        return typedArray;
    L13:
        return (Notification[]) array;
    }

    @ReplaceWith(expression = "notification.extras")
    @Deprecated
    public static Bundle getExtras(Notification notification) {
        return notification.extras;
    }

    public static int getActionCount(Notification notification) {
        if (notification.actions != null) goto L7;
        return 0;
    L7:
        return notification.actions.length;
    }

    public static Action getAction(Notification notification, int actionIndex) {
        return getActionCompatFromAction(notification.actions[actionIndex]);
    }

    public static BubbleMetadata getBubbleMetadata(Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) goto L5;
        return null;
    L5:
        return BubbleMetadata.fromPlatform(Api29Impl.getBubbleMetadata(notification));
    }

    static Action getActionCompatFromAction(Notification.Action action) {
        android.app.RemoteInput[] srcArray = Api20Impl.getRemoteInputs(action);
        boolean r3 = false;
        if (srcArray != null) goto L5;
        RemoteInput[] remoteInputs = null;
    L15:
        if (Api20Impl.getExtras(action).getBoolean("android.support.allowGeneratedReplies") == false) goto L17;
    L20:
        boolean allowGeneratedReplies = true;
    L21:
        boolean showsUserInterface = Api20Impl.getExtras(action).getBoolean("android.support.action.showsUserInterface", true);
        if (Build.VERSION.SDK_INT < 28) goto L24;
        int semanticAction = Api28Impl.getSemanticAction(action);
    L26:
        if (Build.VERSION.SDK_INT < 29) goto L28;
        boolean isContextual = Api29Impl.isContextual(action);
    L30:
        if (Build.VERSION.SDK_INT < 31) goto L32;
        r3 = Api31Impl.isAuthenticationRequired(action);
    L32:
        boolean authRequired = r3;
        if (Api23Impl.getIcon(action) != null) goto L39;
        if (action.icon == 0) goto L39;
        return new Action(action.icon, action.title, action.actionIntent, Api20Impl.getExtras(action), remoteInputs, null, allowGeneratedReplies, semanticAction, showsUserInterface, isContextual, authRequired);
    L39:
        if (Api23Impl.getIcon(action) != null) goto L41;
        IconCompat r2 = null;
    L42:
        IconCompat icon = r2;
        return new Action(icon, action.title, action.actionIntent, Api20Impl.getExtras(action), remoteInputs, null, allowGeneratedReplies, semanticAction, showsUserInterface, isContextual, authRequired);
    L41:
        r2 = IconCompat.createFromIconOrNullIfZeroResId(Api23Impl.getIcon(action));
        goto L42
    L28:
        isContextual = false;
        goto L30
    L24:
        semanticAction = Api20Impl.getExtras(action).getInt("android.support.action.semanticAction", 0);
        goto L26
    L17:
        if (Api24Impl.getAllowGeneratedReplies(action) == true) goto L20;
        allowGeneratedReplies = false;
        goto L21
    L5:
        RemoteInput[] remoteInputs2 = new RemoteInput[srcArray.length];
        int i = 0;
    L7:
        if (i >= srcArray.length) goto L13;
        android.app.RemoteInput src = srcArray[i];
        String r8 = Api20Impl.getResultKey(src);
        CharSequence r9 = Api20Impl.getLabel(src);
        CharSequence[] r10 = Api20Impl.getChoices(src);
        boolean r11 = Api20Impl.getAllowFreeFormInput(src);
        if (Build.VERSION.SDK_INT < 29) goto L11;
        int r12 = Api29Impl.getEditChoicesBeforeSending(src);
    L12:
        remoteInputs2[i] = new RemoteInput(r8, r9, r10, r11, r12, Api20Impl.getExtras(src), null);
        i = i + 1;
        goto L7
    L11:
        r12 = 0;
        goto L12
    L13:
        remoteInputs = remoteInputs2;
        goto L15
    }

    public static List<Action> getInvisibleActions(Notification notification) {
        ArrayList<Action> result = new ArrayList();
        Bundle carExtenderBundle = notification.extras.getBundle("android.car.EXTENSIONS");
        if (carExtenderBundle != null) goto L5;
        return result;
    L5:
        Bundle listBundle = carExtenderBundle.getBundle("invisible_actions");
        if (listBundle == null) goto L11;
        int i = 0;
    L9:
        if (i >= listBundle.size()) goto L11;
        result.add(NotificationCompatJellybean.getActionFromBundle(listBundle.getBundle(Integer.toString(i))));
        i = i + 1;
    L11:
        return result;
    }

    public static List<Person> getPeople(Notification notification) {
        ArrayList<Person> result = new ArrayList();
        if (Build.VERSION.SDK_INT < 28) goto L13;
        ArrayList<android.app.Person> peopleList = notification.extras.getParcelableArrayList(EXTRA_PEOPLE_LIST);
        if (peopleList != null) goto L7;
    L20:
        return result;
    L7:
        if (peopleList.isEmpty() == true) goto L20;
        Iterator<android.app.Person> r2 = peopleList.iterator();
    L10:
        if (r2.hasNext() == false) goto L20;
        android.app.Person person = r2.next();
        result.add(Person.fromAndroidPerson(person));
        goto L10
    L13:
        String[] peopleArray = notification.extras.getStringArray(EXTRA_PEOPLE);
        if (peopleArray == null) goto L20;
        if (peopleArray.length == 0) goto L20;
        int r3 = peopleArray.length;
        int r4 = 0;
    L18:
        if (r4 >= r3) goto L20;
        String personUri = peopleArray[r4];
        result.add(new Person.Builder().setUri(personUri).build());
        r4 = r4 + 1;
        goto L18
    }

    public static CharSequence getContentTitle(Notification notification) {
        return notification.extras.getCharSequence(EXTRA_TITLE);
    }

    public static CharSequence getContentText(Notification notification) {
        return notification.extras.getCharSequence(EXTRA_TEXT);
    }

    public static CharSequence getContentInfo(Notification notification) {
        return notification.extras.getCharSequence(EXTRA_INFO_TEXT);
    }

    public static CharSequence getSubText(Notification notification) {
        return notification.extras.getCharSequence(EXTRA_SUB_TEXT);
    }

    public static String getCategory(Notification notification) {
        return notification.category;
    }

    public static boolean getLocalOnly(Notification notification) {
        if ((notification.flags & 256) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static String getGroup(Notification notification) {
        return Api20Impl.getGroup(notification);
    }

    public static boolean getShowWhen(Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_WHEN);
    }

    public static boolean getUsesChronometer(Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_CHRONOMETER);
    }

    public static boolean getOnlyAlertOnce(Notification notification) {
        if ((notification.flags & 8) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static boolean getAutoCancel(Notification notification) {
        if ((notification.flags & 16) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static boolean getOngoing(Notification notification) {
        if ((notification.flags & 2) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static int getColor(Notification notification) {
        return notification.color;
    }

    public static int getVisibility(Notification notification) {
        return notification.visibility;
    }

    public static Notification getPublicVersion(Notification notification) {
        return notification.publicVersion;
    }

    static boolean getHighPriority(Notification notification) {
        if ((notification.flags & 128) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static boolean isGroupSummary(Notification notification) {
        if ((notification.flags & 512) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static String getSortKey(Notification notification) {
        return Api20Impl.getSortKey(notification);
    }

    public static String getChannelId(Notification notification) {
        return Api26Impl.getChannelId(notification);
    }

    public static long getTimeoutAfter(Notification notification) {
        return Api26Impl.getTimeoutAfter(notification);
    }

    public static int getBadgeIconType(Notification notification) {
        return Api26Impl.getBadgeIconType(notification);
    }

    public static String getShortcutId(Notification notification) {
        return Api26Impl.getShortcutId(notification);
    }

    public static CharSequence getSettingsText(Notification notification) {
        return Api26Impl.getSettingsText(notification);
    }

    public static LocusIdCompat getLocusId(Notification notification) {
        if (Build.VERSION.SDK_INT < 29) goto L9;
        LocusId locusId = Api29Impl.getLocusId(notification);
        if (locusId != null) goto L8;
        return null;
    L8:
        return LocusIdCompat.toLocusIdCompat(locusId);
    L9:
        return null;
    }

    public static int getGroupAlertBehavior(Notification notification) {
        return Api26Impl.getGroupAlertBehavior(notification);
    }

    public static boolean getAllowSystemGeneratedContextualActions(Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) goto L5;
        return false;
    L5:
        return Api29Impl.getAllowSystemGeneratedContextualActions(notification);
    }

    public static Bitmap reduceLargeIconSize(Context context, Bitmap icon) {
        if (icon != null) goto L4;
    L13:
        return icon;
    L4:
        if (Build.VERSION.SDK_INT >= 27) goto L13;
        Resources res = context.getResources();
        int maxWidth = res.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
        int maxHeight = res.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
        if (icon.getWidth() <= maxWidth) goto L9;
    L11:
        double scale = Math.min(((double) maxWidth) / ((double) Math.max(1, icon.getWidth())), ((double) maxHeight) / ((double) Math.max(1, icon.getHeight())));
        return Bitmap.createScaledBitmap(icon, (int) Math.ceil(((double) icon.getWidth()) * scale), (int) Math.ceil(((double) icon.getHeight()) * scale), true);
    L9:
        if (icon.getHeight() > maxHeight) goto L11;
        return icon;
    }

    @Deprecated
    public NotificationCompat() {
    }
}
