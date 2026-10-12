package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class NotificationManagerCompat {
    public static final String ACTION_BIND_SIDE_CHANNEL = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
    private static final String CHECK_OP_NO_THROW = "checkOpNoThrow";
    public static final String EXTRA_USE_SIDE_CHANNEL = "android.support.useSideChannel";
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MAX = 5;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;
    public static final int INTERRUPTION_FILTER_ALARMS = 4;
    public static final int INTERRUPTION_FILTER_ALL = 1;
    public static final int INTERRUPTION_FILTER_NONE = 3;
    public static final int INTERRUPTION_FILTER_PRIORITY = 2;
    public static final int INTERRUPTION_FILTER_UNKNOWN = 0;
    static final int MAX_SIDE_CHANNEL_SDK_VERSION = 19;
    private static final String OP_POST_NOTIFICATION = "OP_POST_NOTIFICATION";
    private static final String SETTING_ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
    private static final int SIDE_CHANNEL_RETRY_BASE_INTERVAL_MS = 1000;
    private static final int SIDE_CHANNEL_RETRY_MAX_COUNT = 6;
    private static final String TAG = "NotifManCompat";
    private static Set<String> sEnabledNotificationListenerPackages;
    private static String sEnabledNotificationListeners;
    private static final Object sEnabledNotificationListenersLock = null;
    private static final Object sLock = null;
    private static SideChannelManager sSideChannelManager;
    private final Context mContext;
    private final NotificationManager mNotificationManager;

    static class Api23Impl {
        private Api23Impl() {
        }

        static List<StatusBarNotification> getActiveNotifications(NotificationManager notificationManager) {
            StatusBarNotification[] notifs = notificationManager.getActiveNotifications();
            if (notifs != null) goto L7;
            return new ArrayList();
        L7:
            return Arrays.asList(notifs);
        }

        static int getCurrentInterruptionFilter(NotificationManager notificationManager) {
            return notificationManager.getCurrentInterruptionFilter();
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static boolean areNotificationsEnabled(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        static int getImportance(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static void createNotificationChannel(NotificationManager notificationManager, NotificationChannel channel) {
            notificationManager.createNotificationChannel(channel);
        }

        static NotificationChannel getNotificationChannel(NotificationManager notificationManager, String channelId) {
            return notificationManager.getNotificationChannel(channelId);
        }

        static void createNotificationChannels(NotificationManager notificationManager, List<NotificationChannel> channels) {
            notificationManager.createNotificationChannels(channels);
        }

        static List<NotificationChannel> getNotificationChannels(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannels();
        }

        static void createNotificationChannelGroup(NotificationManager notificationManager, NotificationChannelGroup group) {
            notificationManager.createNotificationChannelGroup(group);
        }

        static void createNotificationChannelGroups(NotificationManager notificationManager, List<NotificationChannelGroup> groups) {
            notificationManager.createNotificationChannelGroups(groups);
        }

        static List<NotificationChannelGroup> getNotificationChannelGroups(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannelGroups();
        }

        static void deleteNotificationChannel(NotificationManager notificationManager, String channelId) {
            notificationManager.deleteNotificationChannel(channelId);
        }

        static void deleteNotificationChannelGroup(NotificationManager notificationManager, String groupId) {
            notificationManager.deleteNotificationChannelGroup(groupId);
        }

        static String getId(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        static String getId(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static NotificationChannelGroup getNotificationChannelGroup(NotificationManager notificationManager, String channelGroupId) {
            return notificationManager.getNotificationChannelGroup(channelGroupId);
        }
    }

    static class Api30Impl {
        private Api30Impl() {
        }

        static String getParentChannelId(NotificationChannel notificationChannel) {
            return notificationChannel.getParentChannelId();
        }

        static NotificationChannel getNotificationChannel(NotificationManager notificationManager, String channelId, String conversationId) {
            return notificationManager.getNotificationChannel(channelId, conversationId);
        }
    }

    static class Api34Impl {
        private Api34Impl() {
        }

        static boolean canUseFullScreenIntent(NotificationManager notificationManager) {
            return notificationManager.canUseFullScreenIntent();
        }
    }

    private static class CancelTask implements Task {
        final boolean all;
        final int id;
        final String packageName;
        final String tag;

        CancelTask(String packageName) {
            this.packageName = packageName;
            this.id = 0;
            this.tag = null;
            this.all = true;
        }

        CancelTask(String packageName, int id, String tag) {
            this.packageName = packageName;
            this.id = id;
            this.tag = tag;
            this.all = false;
        }

        @Override // androidx.core.app.NotificationManagerCompat.Task
        public void send(INotificationSideChannel service) throws RemoteException {
            boolean r0 = this.all;
            String r1 = this.packageName;
            if (r0 == false) goto L5;
            service.cancelAll(r1);
            return;
        L5:
            service.cancel(r1, this.id, this.tag);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("CancelTask[");
            sb.append("packageName:").append(this.packageName);
            sb.append(", id:").append(this.id);
            sb.append(", tag:").append(this.tag);
            sb.append(", all:").append(this.all);
            sb.append("]");
            return sb.toString();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface InterruptionFilter {
    }

    public static class NotificationWithIdAndTag {
        final int mId;
        Notification mNotification;
        final String mTag;

        public NotificationWithIdAndTag(String tag, int id, Notification notification) {
            this.mTag = tag;
            this.mId = id;
            this.mNotification = notification;
        }

        public NotificationWithIdAndTag(int id, Notification notification) {
            this(null, id, notification);
        }
    }

    private static class NotifyTask implements Task {
        final int id;
        final Notification notif;
        final String packageName;
        final String tag;

        NotifyTask(String packageName, int id, String tag, Notification notif) {
            this.packageName = packageName;
            this.id = id;
            this.tag = tag;
            this.notif = notif;
        }

        @Override // androidx.core.app.NotificationManagerCompat.Task
        public void send(INotificationSideChannel service) throws RemoteException {
            service.notify(this.packageName, this.id, this.tag, this.notif);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("NotifyTask[");
            sb.append("packageName:").append(this.packageName);
            sb.append(", id:").append(this.id);
            sb.append(", tag:").append(this.tag);
            sb.append("]");
            return sb.toString();
        }
    }

    private static class ServiceConnectedEvent {
        final ComponentName componentName;
        final IBinder iBinder;

        ServiceConnectedEvent(ComponentName componentName, IBinder iBinder) {
            this.componentName = componentName;
            this.iBinder = iBinder;
        }
    }

    private static class SideChannelManager implements Handler.Callback, ServiceConnection {
        private static final int MSG_QUEUE_TASK = 0;
        private static final int MSG_RETRY_LISTENER_QUEUE = 3;
        private static final int MSG_SERVICE_CONNECTED = 1;
        private static final int MSG_SERVICE_DISCONNECTED = 2;
        private Set<String> mCachedEnabledPackages;
        private final Context mContext;
        private final Handler mHandler;
        private final HandlerThread mHandlerThread;
        private final Map<ComponentName, ListenerRecord> mRecordMap;

        private static class ListenerRecord {
            boolean bound;
            final ComponentName componentName;
            int retryCount;
            INotificationSideChannel service;
            ArrayDeque<Task> taskQueue;

            ListenerRecord(ComponentName componentName) {
                this.bound = false;
                this.taskQueue = new ArrayDeque();
                this.retryCount = 0;
                this.componentName = componentName;
            }
        }

        SideChannelManager(Context context) {
            this.mRecordMap = new HashMap();
            this.mCachedEnabledPackages = new HashSet();
            this.mContext = context;
            this.mHandlerThread = new HandlerThread("NotificationManagerCompat");
            this.mHandlerThread.start();
            this.mHandler = new Handler(this.mHandlerThread.getLooper(), this);
        }

        public void queueTask(Task task) {
            this.mHandler.obtainMessage(0, task).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message msg) {
            switch(msg.what) {
                case 0: goto L12;
                case 1: goto L10;
                case 2: goto L8;
                case 3: goto L6;
                default: goto L4;
            };
        L4:
            return false;
        L6:
            handleRetryListenerQueue((ComponentName) msg.obj);
            return true;
        L8:
            handleServiceDisconnected((ComponentName) msg.obj);
            return true;
        L10:
            ServiceConnectedEvent event = (ServiceConnectedEvent) msg.obj;
            handleServiceConnected(event.componentName, event.iBinder);
            return true;
        L12:
            handleQueueTask((Task) msg.obj);
            return true;
        }

        private void handleQueueTask(Task task) {
            updateListenerMap();
            Iterator<ListenerRecord> r0 = this.mRecordMap.values().iterator();
        L4:
            if (r0.hasNext() == false) goto L6;
            ListenerRecord record = r0.next();
            record.taskQueue.add(task);
            processListenerQueue(record);
            goto L4
        }

        private void handleServiceConnected(ComponentName componentName, IBinder iBinder) {
            ListenerRecord record = this.mRecordMap.get(componentName);
            if (record == null) goto L6;
            record.service = INotificationSideChannel.Stub.asInterface(iBinder);
            record.retryCount = 0;
            processListenerQueue(record);
            return;
        }

        private void handleServiceDisconnected(ComponentName componentName) {
            ListenerRecord record = this.mRecordMap.get(componentName);
            if (record == null) goto L6;
            ensureServiceUnbound(record);
            return;
        }

        private void handleRetryListenerQueue(ComponentName componentName) {
            ListenerRecord record = this.mRecordMap.get(componentName);
            if (record == null) goto L6;
            processListenerQueue(record);
            return;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3) == false) goto L5;
            Log.d(NotificationManagerCompat.TAG, "Connected to service " + componentName);
        L5:
            this.mHandler.obtainMessage(1, new ServiceConnectedEvent(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3) == false) goto L5;
            Log.d(NotificationManagerCompat.TAG, "Disconnected from service " + componentName);
        L5:
            this.mHandler.obtainMessage(2, componentName).sendToTarget();
        }

        private void updateListenerMap() {
            Set<String> enabledPackages = NotificationManagerCompat.getEnabledListenerPackages(this.mContext);
            if (enabledPackages.equals(this.mCachedEnabledPackages) == false) goto L5;
            return;
        L5:
            this.mCachedEnabledPackages = enabledPackages;
            List<ResolveInfo> resolveInfos = this.mContext.getPackageManager().queryIntentServices(new Intent().setAction(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL), 0);
            Set<ComponentName> enabledComponents = new HashSet();
            Iterator<ResolveInfo> r3 = resolveInfos.iterator();
        L7:
            if (r3.hasNext() == false) goto L15;
            ResolveInfo resolveInfo = r3.next();
            if (enabledPackages.contains(resolveInfo.serviceInfo.packageName) == false) goto L7;
            ComponentName componentName = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
            if (resolveInfo.serviceInfo.permission != null) goto L13;
            enabledComponents.add(componentName);
            goto L7
        L13:
            Log.w(NotificationManagerCompat.TAG, "Permission present on component " + componentName + ", not adding listener record.");
            goto L7
        L15:
            Iterator<ComponentName> r4 = enabledComponents.iterator();
        L17:
            if (r4.hasNext() == false) goto L25;
            ComponentName componentName2 = r4.next();
            if (this.mRecordMap.containsKey(componentName2) == true) goto L17;
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3) == false) goto L23;
            Log.d(NotificationManagerCompat.TAG, "Adding listener record for " + componentName2);
        L23:
            this.mRecordMap.put(componentName2, new ListenerRecord(componentName2));
            goto L17
        L25:
            Iterator<Map.Entry<ComponentName, ListenerRecord>> it = this.mRecordMap.entrySet().iterator();
        L27:
            if (it.hasNext() == false) goto L35;
            Map.Entry<ComponentName, ListenerRecord> entry = it.next();
            if (enabledComponents.contains(entry.getKey()) == true) goto L27;
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3) == false) goto L33;
            Log.d(NotificationManagerCompat.TAG, "Removing listener record for " + entry.getKey());
        L33:
            ensureServiceUnbound(entry.getValue());
            it.remove();
            goto L27
        }

        private boolean ensureServiceBound(ListenerRecord record) {
            if (record.bound == false) goto L6;
            return true;
        L6:
            Intent intent = new Intent(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL).setComponent(record.componentName);
            record.bound = this.mContext.bindService(intent, this, 33);
            if (record.bound == false) goto L9;
            record.retryCount = 0;
        L11:
            return record.bound;
        L9:
            Log.w(NotificationManagerCompat.TAG, "Unable to bind to listener " + record.componentName);
            this.mContext.unbindService(this);
            goto L11
        }

        private void ensureServiceUnbound(ListenerRecord record) {
            if (record.bound == false) goto L5;
            this.mContext.unbindService(this);
            record.bound = false;
        L5:
            record.service = null;
        }

        private void scheduleListenerRetry(ListenerRecord record) {
            if (this.mHandler.hasMessages(3, record.componentName) == false) goto L5;
            return;
        L5:
            record.retryCount++;
            if (record.retryCount <= 6) goto L9;
            Log.w(NotificationManagerCompat.TAG, "Giving up on delivering " + record.taskQueue.size() + " tasks to " + record.componentName + " after " + record.retryCount + " retries");
            record.taskQueue.clear();
            return;
        L9:
            int delayMs = (1 << (record.retryCount - 1)) * 1000;
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3) == false) goto L12;
            Log.d(NotificationManagerCompat.TAG, "Scheduling retry for " + delayMs + " ms");
        L12:
            Message msg = this.mHandler.obtainMessage(3, record.componentName);
            this.mHandler.sendMessageDelayed(msg, delayMs);
        }

        private void processListenerQueue(ListenerRecord record) {
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3) == false) goto L6;
            Log.d(NotificationManagerCompat.TAG, "Processing component " + record.componentName + ", " + record.taskQueue.size() + " queued tasks");
        L6:
            if (record.taskQueue.isEmpty() == false) goto L9;
            return;
        L9:
            if (ensureServiceBound(record) == true) goto L11;
        L32:
            scheduleListenerRetry(record);
            return;
        L11:
            if (record.service == null) goto L32;
        L13:
            Task task = record.taskQueue.peek();
            if (task == null) goto L29;
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3) == false) goto L19;
            Log.d(NotificationManagerCompat.TAG, "Sending task " + task);     // Catch: RemoteException -> L21 DeadObjectException -> L23
        L19:
            task.send(record.service);     // Catch: RemoteException -> L21 DeadObjectException -> L23
            record.taskQueue.remove();     // Catch: RemoteException -> L21 DeadObjectException -> L23
            goto L13
        L21:
            e = move-exception;
            Log.w(NotificationManagerCompat.TAG, "RemoteException communicating with " + record.componentName, e);
        L25:
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3) == false) goto L29;
            Log.d(NotificationManagerCompat.TAG, "Remote service has died: " + record.componentName);
        L29:
            if (record.taskQueue.isEmpty() == true) goto L39;
            scheduleListenerRetry(record);
            return;
        }
    }

    private interface Task {
        void send(INotificationSideChannel r1) throws RemoteException;
    }

    static {
        sEnabledNotificationListenersLock = new Object();
        sEnabledNotificationListenerPackages = new HashSet();
        sLock = new Object();
    }

    public static NotificationManagerCompat from(Context context) {
        return new NotificationManagerCompat(context);
    }

    private NotificationManagerCompat(Context context) {
        this.mContext = context;
        this.mNotificationManager = (NotificationManager) this.mContext.getSystemService("notification");
    }

    NotificationManagerCompat(NotificationManager notificationManager, Context context) {
        this.mContext = context;
        this.mNotificationManager = notificationManager;
    }

    public void cancel(int id) {
        cancel(null, id);
    }

    public void cancel(String tag, int id) {
        this.mNotificationManager.cancel(tag, id);
    }

    public void cancelAll() {
        this.mNotificationManager.cancelAll();
    }

    public void notify(int id, Notification notification) {
        notify(null, id, notification);
    }

    public void notify(String tag, int id, Notification notification) {
        if (useSideChannelForNotification(notification) == false) goto L5;
        pushSideChannelQueue(new NotifyTask(this.mContext.getPackageName(), id, tag, notification));
        this.mNotificationManager.cancel(tag, id);
        return;
    L5:
        this.mNotificationManager.notify(tag, id, notification);
    }

    public void notify(List<NotificationWithIdAndTag> notificationWithIdAndTags) {
        int notificationsSize = notificationWithIdAndTags.size();
        int i = 0;
    L3:
        if (i >= notificationsSize) goto L5;
        NotificationWithIdAndTag notificationWithIdAndTag = notificationWithIdAndTags.get(i);
        notify(notificationWithIdAndTag.mTag, notificationWithIdAndTag.mId, notificationWithIdAndTag.mNotification);
        i = i + 1;
        goto L3
    }

    public List<StatusBarNotification> getActiveNotifications() {
        return Api23Impl.getActiveNotifications(this.mNotificationManager);
    }

    public boolean areNotificationsEnabled() {
        return Api24Impl.areNotificationsEnabled(this.mNotificationManager);
    }

    public int getImportance() {
        return Api24Impl.getImportance(this.mNotificationManager);
    }

    public void createNotificationChannel(NotificationChannel channel) {
        Api26Impl.createNotificationChannel(this.mNotificationManager, channel);
    }

    public void createNotificationChannel(NotificationChannelCompat channel) {
        createNotificationChannel(channel.getNotificationChannel());
    }

    public void createNotificationChannelGroup(NotificationChannelGroup group) {
        Api26Impl.createNotificationChannelGroup(this.mNotificationManager, group);
    }

    public void createNotificationChannelGroup(NotificationChannelGroupCompat group) {
        createNotificationChannelGroup(group.getNotificationChannelGroup());
    }

    public void createNotificationChannels(List<NotificationChannel> channels) {
        Api26Impl.createNotificationChannels(this.mNotificationManager, channels);
    }

    public void createNotificationChannelsCompat(List<NotificationChannelCompat> channels) {
        if (channels.isEmpty() == true) goto L11;
        List<NotificationChannel> platformChannels = new ArrayList(channels.size());
        Iterator<NotificationChannelCompat> r1 = channels.iterator();
    L6:
        if (r1.hasNext() == false) goto L8;
        NotificationChannelCompat channel = r1.next();
        platformChannels.add(channel.getNotificationChannel());
        goto L6
    L8:
        Api26Impl.createNotificationChannels(this.mNotificationManager, platformChannels);
        return;
    }

    public void createNotificationChannelGroups(List<NotificationChannelGroup> groups) {
        Api26Impl.createNotificationChannelGroups(this.mNotificationManager, groups);
    }

    public void createNotificationChannelGroupsCompat(List<NotificationChannelGroupCompat> groups) {
        if (groups.isEmpty() == true) goto L11;
        List<NotificationChannelGroup> platformGroups = new ArrayList(groups.size());
        Iterator<NotificationChannelGroupCompat> r1 = groups.iterator();
    L6:
        if (r1.hasNext() == false) goto L8;
        NotificationChannelGroupCompat group = r1.next();
        platformGroups.add(group.getNotificationChannelGroup());
        goto L6
    L8:
        Api26Impl.createNotificationChannelGroups(this.mNotificationManager, platformGroups);
        return;
    }

    public void deleteNotificationChannel(String channelId) {
        Api26Impl.deleteNotificationChannel(this.mNotificationManager, channelId);
    }

    public void deleteNotificationChannelGroup(String groupId) {
        Api26Impl.deleteNotificationChannelGroup(this.mNotificationManager, groupId);
    }

    public void deleteUnlistedNotificationChannels(Collection<String> channelIds) {
        Iterator<NotificationChannel> r0 = Api26Impl.getNotificationChannels(this.mNotificationManager).iterator();
    L4:
        if (r0.hasNext() == false) goto L14;
        NotificationChannel channel = r0.next();
        if (channelIds.contains(Api26Impl.getId(channel)) == true) goto L4;
        if (Build.VERSION.SDK_INT < 30) goto L13;
        if (channelIds.contains(Api30Impl.getParentChannelId(channel)) == true) goto L4;
    L13:
        Api26Impl.deleteNotificationChannel(this.mNotificationManager, Api26Impl.getId(channel));
        goto L4
    }

    public NotificationChannel getNotificationChannel(String channelId) {
        return Api26Impl.getNotificationChannel(this.mNotificationManager, channelId);
    }

    public NotificationChannelCompat getNotificationChannelCompat(String channelId) {
        NotificationChannel channel = getNotificationChannel(channelId);
        if (channel != null) goto L5;
        return null;
    L5:
        return new NotificationChannelCompat(channel);
    }

    public NotificationChannel getNotificationChannel(String channelId, String conversationId) {
        if (Build.VERSION.SDK_INT < 30) goto L7;
        return Api30Impl.getNotificationChannel(this.mNotificationManager, channelId, conversationId);
    L7:
        return getNotificationChannel(channelId);
    }

    public NotificationChannelCompat getNotificationChannelCompat(String channelId, String conversationId) {
        NotificationChannel channel = getNotificationChannel(channelId, conversationId);
        if (channel != null) goto L5;
        return null;
    L5:
        return new NotificationChannelCompat(channel);
    }

    public NotificationChannelGroup getNotificationChannelGroup(String channelGroupId) {
        if (Build.VERSION.SDK_INT >= 28) goto L5;
        Iterator<NotificationChannelGroup> r0 = getNotificationChannelGroups().iterator();
    L8:
        if (r0.hasNext() == false) goto L13;
        NotificationChannelGroup group = r0.next();
        if (Api26Impl.getId(group).equals(channelGroupId) == false) goto L8;
        return group;
    L13:
        return null;
    L5:
        return Api28Impl.getNotificationChannelGroup(this.mNotificationManager, channelGroupId);
    }

    public NotificationChannelGroupCompat getNotificationChannelGroupCompat(String channelGroupId) {
        if (Build.VERSION.SDK_INT < 28) goto L9;
        NotificationChannelGroup group = getNotificationChannelGroup(channelGroupId);
        if (group != null) goto L7;
        return null;
    L7:
        return new NotificationChannelGroupCompat(group);
    L9:
        NotificationChannelGroup group2 = getNotificationChannelGroup(channelGroupId);
        if (group2 != null) goto L12;
        return null;
    L12:
        return new NotificationChannelGroupCompat(group2, getNotificationChannels());
    }

    public List<NotificationChannel> getNotificationChannels() {
        return Api26Impl.getNotificationChannels(this.mNotificationManager);
    }

    public List<NotificationChannelCompat> getNotificationChannelsCompat() {
        List<NotificationChannel> channels = getNotificationChannels();
        if (channels.isEmpty() == true) goto L10;
        List<NotificationChannelCompat> channelsCompat = new ArrayList(channels.size());
        Iterator<NotificationChannel> r2 = channels.iterator();
    L6:
        if (r2.hasNext() == false) goto L8;
        NotificationChannel channel = r2.next();
        channelsCompat.add(new NotificationChannelCompat(channel));
        goto L6
    L8:
        return channelsCompat;
    L10:
        return Collections.emptyList();
    }

    public List<NotificationChannelGroup> getNotificationChannelGroups() {
        return Api26Impl.getNotificationChannelGroups(this.mNotificationManager);
    }

    public List<NotificationChannelGroupCompat> getNotificationChannelGroupsCompat() {
        List<NotificationChannelGroup> groups = getNotificationChannelGroups();
        if (groups.isEmpty() == true) goto L18;
        if (Build.VERSION.SDK_INT < 28) goto L7;
        List<NotificationChannel> allChannels = Collections.emptyList();
    L8:
        List<NotificationChannelGroupCompat> groupsCompat = new ArrayList(groups.size());
        Iterator<NotificationChannelGroup> r4 = groups.iterator();
    L10:
        if (r4.hasNext() == false) goto L16;
        NotificationChannelGroup group = r4.next();
        if (Build.VERSION.SDK_INT >= 28) goto L13;
        groupsCompat.add(new NotificationChannelGroupCompat(group, allChannels));
        goto L10
    L13:
        groupsCompat.add(new NotificationChannelGroupCompat(group));
        goto L10
    L16:
        return groupsCompat;
    L7:
        allChannels = getNotificationChannels();
        goto L8
    L18:
        return Collections.emptyList();
    }

    public static Set<String> getEnabledListenerPackages(Context context) {
        String enabledNotificationListeners = Settings.Secure.getString(context.getContentResolver(), SETTING_ENABLED_NOTIFICATION_LISTENERS);
        Object r1 = sEnabledNotificationListenersLock;
        monitor-enter(r1);
        if (enabledNotificationListeners != null) goto L20;
    L14:
        Set<String> r2 = sEnabledNotificationListenerPackages;     // Catch: Throwable -> L17
        monitor-exit(r1);     // Catch: Throwable -> L17
        return r2;
    L17:
        th = move-exception;
        throw th;
    L20:
        if (enabledNotificationListeners.equals(sEnabledNotificationListeners) == true) goto L14;
        String[] components = enabledNotificationListeners.split(":", -1);     // Catch: Throwable -> L17
        Set<String> packageNames = new HashSet(components.length);     // Catch: Throwable -> L17
        int r4 = components.length;     // Catch: Throwable -> L17
        int r5 = 0;
    L8:
        if (r5 >= r4) goto L13;
        String component = components[r5];     // Catch: Throwable -> L17
        ComponentName componentName = ComponentName.unflattenFromString(component);     // Catch: Throwable -> L17
        if (componentName == null) goto L12;
        packageNames.add(componentName.getPackageName());     // Catch: Throwable -> L17
    L12:
        r5 = r5 + 1;     // Catch: Throwable -> L17
        goto L8
    L13:
        sEnabledNotificationListenerPackages = packageNames;     // Catch: Throwable -> L17
        sEnabledNotificationListeners = enabledNotificationListeners;     // Catch: Throwable -> L17
        goto L14
    }

    public boolean canUseFullScreenIntent() {
        if (Build.VERSION.SDK_INT >= 29) goto L6;
        return true;
    L6:
        if (Build.VERSION.SDK_INT >= 34) goto L13;
        int permissionState = this.mContext.checkSelfPermission("android.permission.USE_FULL_SCREEN_INTENT");
        if (permissionState == 0) goto L14;
        return false;
    L14:
        return true;
    L13:
        return Api34Impl.canUseFullScreenIntent(this.mNotificationManager);
    }

    private static boolean useSideChannelForNotification(Notification notification) {
        Bundle extras = NotificationCompat.getExtras(notification);
        if (extras != null) goto L5;
    L7:
        return false;
    L5:
        if (extras.getBoolean(EXTRA_USE_SIDE_CHANNEL) == false) goto L7;
        return true;
    }

    public int getCurrentInterruptionFilter() {
        return Api23Impl.getCurrentInterruptionFilter(this.mNotificationManager);
    }

    private void pushSideChannelQueue(Task task) {
        Object r0 = sLock;
        monitor-enter(r0);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (sSideChannelManager != null) goto L7;
        sSideChannelManager = new SideChannelManager(this.mContext.getApplicationContext());     // Catch: Throwable -> L10
    L7:
        sSideChannelManager.queueTask(task);     // Catch: Throwable -> L10
        monitor-exit(r0);     // Catch: Throwable -> L10
    }
}
