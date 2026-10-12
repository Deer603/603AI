package androidx.activity.compose;

import androidx.activity.result.ActivityResultLauncher;
import androidx.core.app.ActivityOptionsCompat;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: compiled from: ActivityResultRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001d\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u000bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Landroidx/activity/compose/ActivityResultLauncherHolder;", "I", "", "()V", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "getLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "setLauncher", "(Landroidx/activity/result/ActivityResultLauncher;)V", "launch", "", "input", "options", "Landroidx/core/app/ActivityOptionsCompat;", "(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V", "unregister", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ActivityResultLauncherHolder<I> {
    public static final int $stable = 0;
    private ActivityResultLauncher<I> launcher;

    static {
        $stable = 8;
    }

    public ActivityResultLauncherHolder() {
    }

    public final ActivityResultLauncher<I> getLauncher() {
        return this.launcher;
    }

    public final void setLauncher(ActivityResultLauncher<I> r1) {
        this.launcher = r1;
    }

    public final void launch(I r3, ActivityOptionsCompat options) {
        ActivityResultLauncher<I> r0 = this.launcher;
        if (r0 == null) goto L5;
        r0.launch(r3, options);
        Unit r1 = Unit.INSTANCE;
    L6:
        if (r1 == null) goto L9;
        return;
    L9:
        throw new IllegalStateException("Launcher has not been initialized".toString());
    L5:
        r1 = null;
        goto L6
    }

    public final void unregister() {
        ActivityResultLauncher<I> r0 = this.launcher;
        if (r0 == null) goto L5;
        r0.unregister();
        Unit r1 = Unit.INSTANCE;
    L6:
        if (r1 == null) goto L9;
        return;
    L9:
        throw new IllegalStateException("Launcher has not been initialized".toString());
    L5:
        r1 = null;
        goto L6
    }
}
