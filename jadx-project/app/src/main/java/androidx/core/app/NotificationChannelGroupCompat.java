package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class NotificationChannelGroupCompat {
    private boolean mBlocked;
    private List<NotificationChannelCompat> mChannels;
    String mDescription;
    final String mId;
    CharSequence mName;

    static class Api26Impl {
        private Api26Impl() {
        }

        static NotificationChannelGroup createNotificationChannelGroup(String id, CharSequence name) {
            return new NotificationChannelGroup(id, name);
        }

        static String getId(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        static CharSequence getName(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getName();
        }

        static List<NotificationChannel> getChannels(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getChannels();
        }

        static String getGroup(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static boolean isBlocked(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.isBlocked();
        }

        static String getDescription(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getDescription();
        }

        static void setDescription(NotificationChannelGroup notificationChannelGroup, String description) {
            notificationChannelGroup.setDescription(description);
        }
    }

    public static class Builder {
        final NotificationChannelGroupCompat mGroup;

        public Builder(String id) {
            this.mGroup = new NotificationChannelGroupCompat(id);
        }

        public Builder setName(CharSequence name) {
            this.mGroup.mName = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.mGroup.mDescription = description;
            return this;
        }

        public NotificationChannelGroupCompat build() {
            return this.mGroup;
        }
    }

    NotificationChannelGroupCompat(String id) {
        this.mChannels = Collections.emptyList();
        this.mId = (String) Preconditions.checkNotNull(id);
    }

    NotificationChannelGroupCompat(NotificationChannelGroup group) {
        this(group, Collections.emptyList());
    }

    NotificationChannelGroupCompat(NotificationChannelGroup group, List<NotificationChannel> allChannels) {
        this(Api26Impl.getId(group));
        this.mName = Api26Impl.getName(group);
        if (Build.VERSION.SDK_INT < 28) goto L6;
        this.mDescription = Api28Impl.getDescription(group);
    L6:
        if (Build.VERSION.SDK_INT < 28) goto L8;
        this.mBlocked = Api28Impl.isBlocked(group);
        this.mChannels = getChannelsCompat(Api26Impl.getChannels(group));
        return;
    L8:
        this.mChannels = getChannelsCompat(allChannels);
    }

    private List<NotificationChannelCompat> getChannelsCompat(List<NotificationChannel> channels) {
        List<NotificationChannelCompat> channelsCompat = new ArrayList();
        Iterator<NotificationChannel> r1 = channels.iterator();
    L4:
        if (r1.hasNext() == false) goto L9;
        NotificationChannel channel = r1.next();
        if (this.mId.equals(Api26Impl.getGroup(channel)) == false) goto L4;
        channelsCompat.add(new NotificationChannelCompat(channel));
        goto L4
    L9:
        return channelsCompat;
    }

    NotificationChannelGroup getNotificationChannelGroup() {
        NotificationChannelGroup group = Api26Impl.createNotificationChannelGroup(this.mId, this.mName);
        if (Build.VERSION.SDK_INT < 28) goto L5;
        Api28Impl.setDescription(group, this.mDescription);
    L5:
        return group;
    }

    public Builder toBuilder() {
        return new Builder(this.mId).setName(this.mName).setDescription(this.mDescription);
    }

    public String getId() {
        return this.mId;
    }

    public CharSequence getName() {
        return this.mName;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public boolean isBlocked() {
        return this.mBlocked;
    }

    public List<NotificationChannelCompat> getChannels() {
        return this.mChannels;
    }
}
