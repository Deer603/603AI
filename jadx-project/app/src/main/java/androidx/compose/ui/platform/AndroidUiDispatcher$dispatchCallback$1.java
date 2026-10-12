package androidx.compose.ui.platform;

import android.view.Choreographer;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: compiled from: AndroidUiDispatcher.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1", "Landroid/view/Choreographer$FrameCallback;", "Ljava/lang/Runnable;", "doFrame", "", "frameTimeNanos", "", "run", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidUiDispatcher$dispatchCallback$1 implements Choreographer.FrameCallback, Runnable {
    final /* synthetic */ AndroidUiDispatcher this$0;

    AndroidUiDispatcher$dispatchCallback$1(AndroidUiDispatcher $receiver) {
        this.this$0 = $receiver;
    }

    @Override // java.lang.Runnable
    public void run() {
        AndroidUiDispatcher.access$performTrampolineDispatch(this.this$0);
        Object lock$iv = AndroidUiDispatcher.access$getLock$p(this.this$0);
        AndroidUiDispatcher r1 = this.this$0;
        monitor-enter(lock$iv);
    L11:
        th = move-exception;
        throw th;
    L6:
        if (AndroidUiDispatcher.access$getToRunOnFrame$p(r1).isEmpty() == false) goto L8;
        r1.getChoreographer().removeFrameCallback(this);     // Catch: Throwable -> L11
        AndroidUiDispatcher.access$setScheduledFrameDispatch$p(r1, false);     // Catch: Throwable -> L11
    L8:
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L11
        monitor-exit(lock$iv);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long frameTimeNanos) {
        AndroidUiDispatcher.access$getHandler$p(this.this$0).removeCallbacks(this);
        AndroidUiDispatcher.access$performTrampolineDispatch(this.this$0);
        AndroidUiDispatcher.access$performFrameDispatch(this.this$0, frameTimeNanos);
    }
}
