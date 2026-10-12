package androidx.compose.ui.platform;

import android.os.Handler;
import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: compiled from: AndroidUiDispatcher.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b*\u0001\n\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bH\u0016J\n\u0010!\u001a\u0004\u0018\u00010\u001bH\u0002J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\u001dH\u0002J\u0015\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u0017H\u0000¢\u0006\u0002\b(J\u0015\u0010)\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u0017H\u0000¢\u0006\u0002\b*R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Landroidx/compose/ui/platform/AndroidUiDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "choreographer", "Landroid/view/Choreographer;", "handler", "Landroid/os/Handler;", "(Landroid/view/Choreographer;Landroid/os/Handler;)V", "getChoreographer", "()Landroid/view/Choreographer;", "dispatchCallback", "androidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1", "Landroidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1;", "frameClock", "Landroidx/compose/runtime/MonotonicFrameClock;", "getFrameClock", "()Landroidx/compose/runtime/MonotonicFrameClock;", "lock", "", "scheduledFrameDispatch", "", "scheduledTrampolineDispatch", "spareToRunOnFrame", "", "Landroid/view/Choreographer$FrameCallback;", "toRunOnFrame", "toRunTrampolined", "Lkotlin/collections/ArrayDeque;", "Ljava/lang/Runnable;", "dispatch", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "nextTask", "performFrameDispatch", "frameTimeNanos", "", "performTrampolineDispatch", "postFrameCallback", "callback", "postFrameCallback$ui_release", "removeFrameCallback", "removeFrameCallback$ui_release", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidUiDispatcher extends CoroutineDispatcher {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final Lazy<CoroutineContext> Main$delegate = null;
    private static final ThreadLocal<CoroutineContext> currentThread = null;
    private final Choreographer choreographer;
    private final AndroidUiDispatcher$dispatchCallback$1 dispatchCallback;
    private final MonotonicFrameClock frameClock;
    private final Handler handler;
    private final Object lock;
    private boolean scheduledFrameDispatch;
    private boolean scheduledTrampolineDispatch;
    private List<Choreographer.FrameCallback> spareToRunOnFrame;
    private List<Choreographer.FrameCallback> toRunOnFrame;
    private final ArrayDeque<Runnable> toRunTrampolined;

    /* JADX INFO: compiled from: AndroidUiDispatcher.android.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/AndroidUiDispatcher$Companion;", "", "()V", "CurrentThread", "Lkotlin/coroutines/CoroutineContext;", "getCurrentThread", "()Lkotlin/coroutines/CoroutineContext;", "Main", "getMain", "Main$delegate", "Lkotlin/Lazy;", "currentThread", "Ljava/lang/ThreadLocal;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final CoroutineContext getMain() {
            return (CoroutineContext) AndroidUiDispatcher.access$getMain$delegate$cp().getValue();
        }

        public final CoroutineContext getCurrentThread() {
            if (AndroidUiDispatcher_androidKt.access$isMainThread() == true) goto L7;
            CoroutineContext r0 = (CoroutineContext) AndroidUiDispatcher.access$getCurrentThread$cp().get();
            if (r0 == null) goto L9;
            return r0;
        L9:
            throw new IllegalStateException("no AndroidUiDispatcher for this thread".toString());
        L7:
            return getMain();
        }
    }

    public /* synthetic */ AndroidUiDispatcher(Choreographer r1, Handler r2, DefaultConstructorMarker r3) {
        this(r1, r2);
    }

    public static final /* synthetic */ ThreadLocal access$getCurrentThread$cp() {
        return currentThread;
    }

    public static final /* synthetic */ Handler access$getHandler$p(AndroidUiDispatcher $this) {
        return $this.handler;
    }

    public static final /* synthetic */ Object access$getLock$p(AndroidUiDispatcher $this) {
        return $this.lock;
    }

    public static final /* synthetic */ Lazy access$getMain$delegate$cp() {
        return Main$delegate;
    }

    public static final /* synthetic */ List access$getToRunOnFrame$p(AndroidUiDispatcher $this) {
        return $this.toRunOnFrame;
    }

    public static final /* synthetic */ void access$performFrameDispatch(AndroidUiDispatcher $this, long frameTimeNanos) {
        $this.performFrameDispatch(frameTimeNanos);
    }

    public static final /* synthetic */ void access$performTrampolineDispatch(AndroidUiDispatcher $this) {
        $this.performTrampolineDispatch();
    }

    public static final /* synthetic */ void access$setScheduledFrameDispatch$p(AndroidUiDispatcher $this, boolean r1) {
        $this.scheduledFrameDispatch = r1;
    }

    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    private AndroidUiDispatcher(Choreographer choreographer, Handler handler) {
        this.choreographer = choreographer;
        this.handler = handler;
        this.lock = new Object();
        this.toRunTrampolined = new ArrayDeque();
        this.toRunOnFrame = new ArrayList();
        this.spareToRunOnFrame = new ArrayList();
        this.dispatchCallback = new AndroidUiDispatcher$dispatchCallback$1(this);
        this.frameClock = new AndroidUiFrameClock(this.choreographer, this);
    }

    private final Runnable nextTask() {
        Object lock$iv = this.lock;
        monitor-enter(lock$iv);
        Runnable r3 = this.toRunTrampolined.removeFirstOrNull();     // Catch: Throwable -> L8
        monitor-exit(lock$iv);
        return r3;
    L8:
        th = move-exception;
        throw th;
    }

    private final void performTrampolineDispatch() {
    L2:
        Runnable task = nextTask();
    L3:
        if (task == null) goto L5;
        task.run();
        task = nextTask();
        goto L3
    L5:
        Object lock$iv = this.lock;
        monitor-enter(lock$iv);
    L16:
        th = move-exception;
        throw th;
    L9:
        if (this.toRunTrampolined.isEmpty() == false) goto L12;
        boolean r3 = false;
        this.scheduledTrampolineDispatch = false;     // Catch: Throwable -> L16
    L13:
        monitor-exit(lock$iv);
        if (r3 == true) goto L2;
        return;
    L12:
        r3 = true;
        goto L13
    }

    private final void performFrameDispatch(long frameTimeNanos) {
        Object lock$iv = this.lock;
        monitor-enter(lock$iv);
    L17:
        th = move-exception;
        throw th;
    L6:
        if (this.scheduledFrameDispatch == true) goto L10;
        monitor-exit(lock$iv);
        return;
    L10:
        this.scheduledFrameDispatch = false;     // Catch: Throwable -> L17
        List<Choreographer.FrameCallback> r3 = this.toRunOnFrame;     // Catch: Throwable -> L17
        this.toRunOnFrame = this.spareToRunOnFrame;     // Catch: Throwable -> L17
        this.spareToRunOnFrame = r3;     // Catch: Throwable -> L17
        monitor-exit(lock$iv);
        int i = 0;
        int r1 = r3.size();
    L13:
        if (i >= r1) goto L15;
        r3.get(i).doFrame(frameTimeNanos);
        i = i + 1;
        goto L13
    L15:
        r3.clear();
    }

    public final void postFrameCallback$ui_release(Choreographer.FrameCallback callback) {
        Object lock$iv = this.lock;
        monitor-enter(lock$iv);
        this.toRunOnFrame.add(callback);     // Catch: Throwable -> L11
        if (this.scheduledFrameDispatch == true) goto L8;
        this.scheduledFrameDispatch = true;     // Catch: Throwable -> L11
        this.choreographer.postFrameCallback(this.dispatchCallback);     // Catch: Throwable -> L11
    L8:
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L11
        monitor-exit(lock$iv);
        return;
    L11:
        th = move-exception;
        throw th;
    }

    public final void removeFrameCallback$ui_release(Choreographer.FrameCallback callback) {
        Object lock$iv = this.lock;
        monitor-enter(lock$iv);
        this.toRunOnFrame.remove(callback);     // Catch: Throwable -> L8
        monitor-exit(lock$iv);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public final MonotonicFrameClock getFrameClock() {
        return this.frameClock;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo8970dispatch(CoroutineContext context, Runnable block) {
        Object lock$iv = this.lock;
        monitor-enter(lock$iv);
        this.toRunTrampolined.addLast(block);     // Catch: Throwable -> L13
        if (this.scheduledTrampolineDispatch == true) goto L10;
        this.scheduledTrampolineDispatch = true;     // Catch: Throwable -> L13
        this.handler.post(this.dispatchCallback);     // Catch: Throwable -> L13
        if (this.scheduledFrameDispatch == true) goto L10;
        this.scheduledFrameDispatch = true;     // Catch: Throwable -> L13
        this.choreographer.postFrameCallback(this.dispatchCallback);     // Catch: Throwable -> L13
    L10:
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L13
        monitor-exit(lock$iv);
        return;
    L13:
        th = move-exception;
        throw th;
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
        Main$delegate = LazyKt.lazy(AndroidUiDispatcher$Companion$Main$2.INSTANCE);
        currentThread = new AndroidUiDispatcher$Companion$currentThread$1();
    }
}
