package androidx.core.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class TaskStackBuilder implements Iterable<Intent> {
    private static final String TAG = "TaskStackBuilder";
    private final ArrayList<Intent> mIntents;
    private final Context mSourceContext;

    public interface SupportParentable {
        Intent getSupportParentActivityIntent();
    }

    private TaskStackBuilder(Context a) {
        this.mIntents = new ArrayList();
        this.mSourceContext = a;
    }

    public static TaskStackBuilder create(Context context) {
        return new TaskStackBuilder(context);
    }

    @Deprecated
    public static TaskStackBuilder from(Context context) {
        return create(context);
    }

    public TaskStackBuilder addNextIntent(Intent nextIntent) {
        this.mIntents.add(nextIntent);
        return this;
    }

    public TaskStackBuilder addNextIntentWithParentStack(Intent nextIntent) {
        ComponentName target = nextIntent.getComponent();
        if (target != null) goto L5;
        target = nextIntent.resolveActivity(this.mSourceContext.getPackageManager());
    L5:
        if (target == null) goto L7;
        addParentStack(target);
    L7:
        addNextIntent(nextIntent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TaskStackBuilder addParentStack(Activity r4) {
        Intent parent = null;
        if ((r4 instanceof SupportParentable) == false) goto L5;
        parent = ((SupportParentable) r4).getSupportParentActivityIntent();
    L5:
        if (parent != null) goto L7;
        parent = NavUtils.getParentActivityIntent(r4);
    L7:
        if (parent == null) goto L12;
        ComponentName target = parent.getComponent();
        if (target != null) goto L11;
        target = parent.resolveActivity(this.mSourceContext.getPackageManager());
    L11:
        addParentStack(target);
        addNextIntent(parent);
    L12:
        return this;
    }

    public TaskStackBuilder addParentStack(Class<?> sourceActivityClass) {
        return addParentStack(new ComponentName(this.mSourceContext, sourceActivityClass));
    }

    public TaskStackBuilder addParentStack(ComponentName sourceActivityName) {
        int insertAt = this.mIntents.size();
        Intent parent = NavUtils.getParentActivityIntent(this.mSourceContext, sourceActivityName);     // Catch: PackageManager.NameNotFoundException -> L9
    L4:
        if (parent == null) goto L8;
        this.mIntents.add(insertAt, parent);     // Catch: PackageManager.NameNotFoundException -> L9
        parent = NavUtils.getParentActivityIntent(this.mSourceContext, parent.getComponent());     // Catch: PackageManager.NameNotFoundException -> L9
        goto L4
    L8:
        return this;
    L9:
        e = move-exception;
        Log.e(TAG, "Bad ComponentName while traversing activity parent metadata");
        throw new IllegalArgumentException(e);
    }

    public int getIntentCount() {
        return this.mIntents.size();
    }

    @Deprecated
    public Intent getIntent(int index) {
        return editIntentAt(index);
    }

    public Intent editIntentAt(int index) {
        return this.mIntents.get(index);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.mIntents.iterator();
    }

    public void startActivities() {
        startActivities(null);
    }

    public void startActivities(Bundle options) {
        if (this.mIntents.isEmpty() == true) goto L9;
        Intent[] intents = (Intent[]) this.mIntents.toArray(new Intent[0]);
        intents[0] = new Intent(intents[0]).addFlags(268484608);
        if (ContextCompat.startActivities(this.mSourceContext, intents, options) == true) goto L10;
        Intent topIntent = new Intent(intents[intents.length - 1]);
        topIntent.addFlags(268435456);
        this.mSourceContext.startActivity(topIntent);
        return;
    L10:
        return;
    L9:
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    public PendingIntent getPendingIntent(int requestCode, int flags) {
        return getPendingIntent(requestCode, flags, null);
    }

    public PendingIntent getPendingIntent(int requestCode, int flags, boolean isMutable) {
        return getPendingIntent(requestCode, PendingIntentCompat.addMutabilityFlags(isMutable, flags));
    }

    public PendingIntent getPendingIntent(int requestCode, int flags, Bundle options) {
        if (this.mIntents.isEmpty() == true) goto L7;
        Intent[] intents = (Intent[]) this.mIntents.toArray(new Intent[0]);
        intents[0] = new Intent(intents[0]).addFlags(268484608);
        return PendingIntent.getActivities(this.mSourceContext, requestCode, intents, flags, options);
    L7:
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
    }

    public PendingIntent getPendingIntent(int requestCode, int flags, Bundle options, boolean isMutable) {
        return getPendingIntent(requestCode, PendingIntentCompat.addMutabilityFlags(isMutable, flags), options);
    }

    public Intent[] getIntents() {
        Intent[] intents = new Intent[this.mIntents.size()];
        if (intents.length != 0) goto L5;
        return intents;
    L5:
        intents[0] = new Intent(this.mIntents.get(0)).addFlags(268484608);
        int i = 1;
    L7:
        if (i >= intents.length) goto L9;
        intents[i] = new Intent(this.mIntents.get(i));
        i = i + 1;
        goto L7
    L9:
        return intents;
    }
}
