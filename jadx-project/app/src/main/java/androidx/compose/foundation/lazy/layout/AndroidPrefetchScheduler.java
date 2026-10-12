package androidx.compose.foundation.lazy.layout;

import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: PrefetchScheduler.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0001\u0018\u0000 \u001c2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u001c\u001dB\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fH\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0011H\u0016R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/lazy/layout/AndroidPrefetchScheduler;", "Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;", "Landroidx/compose/runtime/RememberObserver;", "Ljava/lang/Runnable;", "Landroid/view/Choreographer$FrameCallback;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "choreographer", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "frameStartTimeNanos", "", "isActive", "", "prefetchRequests", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/lazy/layout/PrefetchRequest;", "prefetchScheduled", "doFrame", "", "frameTimeNanos", "onAbandoned", "onForgotten", "onRemembered", "run", "schedulePrefetch", "prefetchRequest", "Companion", "PrefetchRequestScopeImpl", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidPrefetchScheduler implements PrefetchScheduler, RememberObserver, Runnable, Choreographer.FrameCallback {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static long frameIntervalNs;
    private final Choreographer choreographer;
    private long frameStartTimeNanos;
    private boolean isActive;
    private final MutableVector<PrefetchRequest> prefetchRequests;
    private boolean prefetchScheduled;
    private final View view;

    /* JADX INFO: compiled from: PrefetchScheduler.android.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/lazy/layout/AndroidPrefetchScheduler$Companion;", "", "()V", "frameIntervalNs", "", "calculateFrameIntervalIfNeeded", "", "view", "Landroid/view/View;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public static final /* synthetic */ void access$calculateFrameIntervalIfNeeded(Companion $this, View view) {
            $this.calculateFrameIntervalIfNeeded(view);
        }

        private final void calculateFrameIntervalIfNeeded(View view) {
            if (AndroidPrefetchScheduler.access$getFrameIntervalNs$cp() != 0) goto L12;
            Display display = view.getDisplay();
            float refreshRate = 60.0f;
            if (view.isInEditMode() == true) goto L10;
            if (display == null) goto L10;
            float displayRefreshRate = display.getRefreshRate();
            if (displayRefreshRate < 30.0f) goto L10;
            refreshRate = displayRefreshRate;
        L10:
            AndroidPrefetchScheduler.access$setFrameIntervalNs$cp((long) (1.0E9f / refreshRate));
            return;
        }
    }

    /* JADX INFO: compiled from: PrefetchScheduler.android.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/lazy/layout/AndroidPrefetchScheduler$PrefetchRequestScopeImpl;", "Landroidx/compose/foundation/lazy/layout/PrefetchRequestScope;", "nextFrameTimeNs", "", "(J)V", "availableTimeNanos", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PrefetchRequestScopeImpl implements PrefetchRequestScope {
        public static final int $stable = 0;
        private final long nextFrameTimeNs;

        static {
        }

        public PrefetchRequestScopeImpl(long nextFrameTimeNs) {
            this.nextFrameTimeNs = nextFrameTimeNs;
        }

        @Override // androidx.compose.foundation.lazy.layout.PrefetchRequestScope
        public long availableTimeNanos() {
            return Math.max(0, this.nextFrameTimeNs - System.nanoTime());
        }
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
    }

    public AndroidPrefetchScheduler(View view) {
        this.view = view;
        this.prefetchRequests = new MutableVector(new PrefetchRequest[16], 0);
        this.choreographer = Choreographer.getInstance();
        Companion.access$calculateFrameIntervalIfNeeded(Companion, this.view);
    }

    public static final /* synthetic */ long access$getFrameIntervalNs$cp() {
        return frameIntervalNs;
    }

    public static final /* synthetic */ void access$setFrameIntervalNs$cp(long r0) {
        frameIntervalNs = r0;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.prefetchRequests.getSize() != 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L8;
    L32:
        this.prefetchScheduled = false;
        return;
    L8:
        if (this.prefetchScheduled == false) goto L32;
        if (this.isActive == false) goto L32;
        if (this.view.getWindowVisibility() != 0) goto L32;
        long nextFrameNs = this.frameStartTimeNanos + frameIntervalNs;
        PrefetchRequestScopeImpl scope = new PrefetchRequestScopeImpl(nextFrameNs);
        boolean scheduleForNextFrame = false;
    L16:
        if (this.prefetchRequests.getSize() == 0) goto L18;
        boolean r6 = true;
    L19:
        if (r6 == false) goto L28;
        if (scheduleForNextFrame == true) goto L28;
        if (scope.availableTimeNanos() > 0) goto L23;
        scheduleForNextFrame = true;
        goto L16
    L23:
        PrefetchRequest request = this.prefetchRequests.content[0];
        boolean hasMoreWorkToDo = request.execute(scope);
        if (hasMoreWorkToDo == true) goto L25;
        this.prefetchRequests.removeAt(0);
        goto L16
    L25:
        scheduleForNextFrame = true;
    L28:
        if (scheduleForNextFrame == false) goto L30;
        this.choreographer.postFrameCallback(this);
        return;
    L30:
        this.prefetchScheduled = false;
        return;
    L18:
        r6 = false;
        goto L19
    L5:
        r0 = false;
        goto L6
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long frameTimeNanos) {
        if (this.isActive == false) goto L6;
        this.frameStartTimeNanos = frameTimeNanos;
        this.view.post(this);
        return;
    }

    @Override // androidx.compose.foundation.lazy.layout.PrefetchScheduler
    public void schedulePrefetch(PrefetchRequest prefetchRequest) {
        this.prefetchRequests.add(prefetchRequest);
        if (this.prefetchScheduled == true) goto L6;
        this.prefetchScheduled = true;
        this.view.post(this);
        return;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.isActive = true;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        this.isActive = false;
        this.view.removeCallbacks(this);
        this.choreographer.removeFrameCallback(this);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }
}
