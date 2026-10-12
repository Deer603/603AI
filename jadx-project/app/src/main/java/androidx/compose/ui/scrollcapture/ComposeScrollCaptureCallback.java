package androidx.compose.ui.scrollcapture;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.View;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.unit.IntRect;
import androidx.core.internal.view.SupportMenu;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;
import kotlin.random.Random;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.NonCancellable;

/* JADX INFO: compiled from: ComposeScrollCaptureCallback.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001$B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J.\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001dH\u0016J\u001e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0005H\u0082@¢\u0006\u0002\u0010\u001eJ\u001e\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001dH\u0016J \u0010 \u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\f\u0010!\u001a\u00020\u0012*\u00020\"H\u0002J\f\u0010#\u001a\u00020\u0012*\u00020\"H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback;", "Landroid/view/ScrollCaptureCallback;", "node", "Landroidx/compose/ui/semantics/SemanticsNode;", "viewportBoundsInWindow", "Landroidx/compose/ui/unit/IntRect;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "listener", "Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$ScrollCaptureSessionListener;", "composeView", "Landroid/view/View;", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/unit/IntRect;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$ScrollCaptureSessionListener;Landroid/view/View;)V", "requestCount", "", "scrollTracker", "Landroidx/compose/ui/scrollcapture/RelativeScroller;", "onScrollCaptureEnd", "", "onReady", "Ljava/lang/Runnable;", "onScrollCaptureImageRequest", "session", "Landroid/view/ScrollCaptureSession;", "signal", "Landroid/os/CancellationSignal;", "captureArea", "Landroid/graphics/Rect;", "onComplete", "Ljava/util/function/Consumer;", "(Landroid/view/ScrollCaptureSession;Landroidx/compose/ui/unit/IntRect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onScrollCaptureSearch", "onScrollCaptureStart", "drawDebugBackground", "Landroid/graphics/Canvas;", "drawDebugOverlay", "ScrollCaptureSessionListener", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ComposeScrollCaptureCallback implements ScrollCaptureCallback {
    public static final int $stable = 0;
    private final View composeView;
    private final CoroutineScope coroutineScope;
    private final ScrollCaptureSessionListener listener;
    private final SemanticsNode node;
    private int requestCount;
    private final RelativeScroller scrollTracker;
    private final IntRect viewportBoundsInWindow;

    /* JADX INFO: compiled from: ComposeScrollCaptureCallback.android.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$ScrollCaptureSessionListener;", "", "onSessionEnded", "", "onSessionStarted", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ScrollCaptureSessionListener {
        void onSessionEnded();

        void onSessionStarted();
    }

    /* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1, reason: invalid class name */
    /* JADX INFO: compiled from: ComposeScrollCaptureCallback.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1", f = "ComposeScrollCaptureCallback.android.kt", i = {}, l = {186}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Runnable $onReady;
        int label;
        final /* synthetic */ ComposeScrollCaptureCallback this$0;

        AnonymousClass1(ComposeScrollCaptureCallback r2, Runnable r3, Continuation<? super AnonymousClass1> r4) {
            this.this$0 = r2;
            this.$onReady = r3;
            super(2, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            return new AnonymousClass1(this.this$0, this.$onReady, r5);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure($result);
        L10:
            ComposeScrollCaptureCallback.access$getListener$p(this.this$0).onSessionEnded();
            this.$onReady.run();
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            this.label = 1;
            if (ComposeScrollCaptureCallback.access$getScrollTracker$p(this.this$0).scrollTo(0.0f, this) != r0) goto L10;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ComposeScrollCaptureCallback.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1", f = "ComposeScrollCaptureCallback.android.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
    static final class C06551 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Rect $captureArea;
        final /* synthetic */ Consumer<Rect> $onComplete;
        final /* synthetic */ ScrollCaptureSession $session;
        int label;
        final /* synthetic */ ComposeScrollCaptureCallback this$0;

        C06551(ComposeScrollCaptureCallback r2, ScrollCaptureSession r3, Rect r4, Consumer<Rect> r5, Continuation<? super C06551> r6) {
            this.this$0 = r2;
            this.$session = r3;
            this.$captureArea = r4;
            this.$onComplete = r5;
            super(2, r6);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r7, Continuation<?> r8) {
            return new C06551(this.this$0, this.$session, this.$captureArea, this.$onComplete, r8);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((C06551) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure($result);
        L11:
            IntRect result = (IntRect) $result;
            this.$onComplete.accept(RectHelper_androidKt.toAndroidRect(result));
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            this.label = 1;
            Object r1 = ComposeScrollCaptureCallback.access$onScrollCaptureImageRequest(this.this$0, this.$session, RectHelper_androidKt.toComposeIntRect(this.$captureArea), this);
            if (r1 != r0) goto L10;
            return r0;
        L10:
            $result = r1;
            goto L11
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2, reason: invalid class name */
    /* JADX INFO: compiled from: ComposeScrollCaptureCallback.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback", f = "ComposeScrollCaptureCallback.android.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {132, 135}, m = "onScrollCaptureImageRequest", n = {"this", "session", "captureArea", "targetMin", "targetMax", "this", "session", "captureArea", "targetMin", "targetMax"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
    static final class AnonymousClass2 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ ComposeScrollCaptureCallback this$0;

        AnonymousClass2(ComposeScrollCaptureCallback r1, Continuation<? super AnonymousClass2> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            this.result = r4;
            this.label |= Integer.MIN_VALUE;
            return ComposeScrollCaptureCallback.access$onScrollCaptureImageRequest(this.this$0, null, null, this);
        }
    }

    static {
        $stable = 8;
    }

    public ComposeScrollCaptureCallback(SemanticsNode node, IntRect viewportBoundsInWindow, CoroutineScope coroutineScope, ScrollCaptureSessionListener listener, View composeView) {
        this.node = node;
        this.viewportBoundsInWindow = viewportBoundsInWindow;
        this.listener = listener;
        this.composeView = composeView;
        this.coroutineScope = CoroutineScopeKt.plus(coroutineScope, DisableAnimationMotionDurationScale.INSTANCE);
        this.scrollTracker = new RelativeScroller(this.viewportBoundsInWindow.getHeight(), new ComposeScrollCaptureCallback$scrollTracker$1(this, null));
    }

    public static final /* synthetic */ ScrollCaptureSessionListener access$getListener$p(ComposeScrollCaptureCallback $this) {
        return $this.listener;
    }

    public static final /* synthetic */ SemanticsNode access$getNode$p(ComposeScrollCaptureCallback $this) {
        return $this.node;
    }

    public static final /* synthetic */ RelativeScroller access$getScrollTracker$p(ComposeScrollCaptureCallback $this) {
        return $this.scrollTracker;
    }

    public static final /* synthetic */ Object access$onScrollCaptureImageRequest(ComposeScrollCaptureCallback $this, ScrollCaptureSession session, IntRect captureArea, Continuation $completion) {
        return $this.onScrollCaptureImageRequest(session, captureArea, $completion);
    }

    public void onScrollCaptureSearch(CancellationSignal signal, Consumer<Rect> r4) {
        IntRect bounds = this.viewportBoundsInWindow;
        r4.accept(RectHelper_androidKt.toAndroidRect(bounds));
    }

    public void onScrollCaptureStart(ScrollCaptureSession session, CancellationSignal signal, Runnable onReady) {
        this.scrollTracker.reset();
        this.requestCount = 0;
        this.listener.onSessionStarted();
        onReady.run();
    }

    public void onScrollCaptureImageRequest(ScrollCaptureSession session, CancellationSignal signal, Rect captureArea, Consumer<Rect> r11) {
        ComposeScrollCaptureCallback_androidKt.access$launchWithCancellationSignal(this.coroutineScope, signal, new C06551(this, session, captureArea, r11, null));
    }

    private final Object onScrollCaptureImageRequest(ScrollCaptureSession session, IntRect captureArea, Continuation<? super IntRect> r15) {
        if ((r15 instanceof AnonymousClass2) == false) goto L7;
        AnonymousClass2 r0 = (AnonymousClass2) r15;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        AnonymousClass2 r1 = r0;
        Object $result = r1.result;
        Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r1.label) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        int targetMax = r1.I$1;
        int targetMin = r1.I$0;
        IntRect captureArea2 = (IntRect) r1.L$2;
        ScrollCaptureSession session2 = (ScrollCaptureSession) r1.L$1;
        ComposeScrollCaptureCallback r4 = (ComposeScrollCaptureCallback) r1.L$0;
        ResultKt.throwOnFailure($result);
        ScrollCaptureSession session3 = session2;
        IntRect captureArea3 = captureArea2;
        ComposeScrollCaptureCallback r3 = r4;
    L22:
        int viewportClippedMin = r3.scrollTracker.mapOffsetToViewport(targetMin);
        int viewportClippedMax = r3.scrollTracker.mapOffsetToViewport(targetMax);
        IntRect viewportClippedRect = IntRect.copy$default(captureArea3, 0, viewportClippedMin, 0, viewportClippedMax, 5, null);
        if (viewportClippedMin == viewportClippedMax) goto L25;
        Canvas canvas = session3.getSurface().lockHardwareCanvas();
        canvas.save();     // Catch: Throwable -> L30
        canvas.translate(-viewportClippedRect.getLeft(), -viewportClippedRect.getTop());     // Catch: Throwable -> L30
        canvas.translate(-r3.viewportBoundsInWindow.getLeft(), -r3.viewportBoundsInWindow.getTop());     // Catch: Throwable -> L30
        r3.composeView.getRootView().draw(canvas);     // Catch: Throwable -> L30
        session3.getSurface().unlockCanvasAndPost(canvas);
        IntRect resultRect = viewportClippedRect.translate(0, MathKt.roundToInt(r3.scrollTracker.getScrollAmount()));
        return resultRect;
    L30:
        th = move-exception;
        session3.getSurface().unlockCanvasAndPost(canvas);
        throw th;
    L25:
        return IntRect.Companion.getZero();
    L13:
        targetMax = r1.I$1;
        targetMin = r1.I$0;
        captureArea3 = (IntRect) r1.L$2;
        ScrollCaptureSession session4 = (ScrollCaptureSession) r1.L$1;
        ComposeScrollCaptureCallback r5 = (ComposeScrollCaptureCallback) r1.L$0;
        ResultKt.throwOnFailure($result);
    L18:
        AnonymousClass3 r6 = AnonymousClass3.INSTANCE;
        r1.L$0 = r5;
        r1.L$1 = session4;
        r1.L$2 = captureArea3;
        r1.I$0 = targetMin;
        r1.I$1 = targetMax;
        r1.label = 2;
        if (MonotonicFrameClockKt.withFrameNanos(r6, r1) != r2) goto L21;
        return r2;
    L21:
        session3 = session4;
        r3 = r5;
        goto L22
    L14:
        ResultKt.throwOnFailure($result);
        int targetMin2 = captureArea.getTop();
        int targetMax2 = captureArea.getBottom();
        RelativeScroller r7 = this.scrollTracker;
        r1.L$0 = this;
        r1.L$1 = session;
        r1.L$2 = captureArea;
        r1.I$0 = targetMin2;
        r1.I$1 = targetMax2;
        r1.label = 1;
        if (r7.scrollRangeIntoView(targetMin2, targetMax2, r1) != r2) goto L17;
        return r2;
    L17:
        session4 = session;
        targetMax = targetMax2;
        r5 = this;
        captureArea3 = captureArea;
        targetMin = targetMin2;
        goto L18
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AnonymousClass2(this, r15);
        goto L8
    }

    public void onScrollCaptureEnd(Runnable onReady) {
        BuildersKt.launch$default(this.coroutineScope, NonCancellable.INSTANCE, null, new AnonymousClass1(this, onReady, null), 2, null);
    }

    private final void drawDebugBackground(Canvas $this$drawDebugBackground) {
        $this$drawDebugBackground.drawColor(ColorKt.m4420toArgb8_81llA(Color.Companion.m4390hslJlNiLsg$default(Color.Companion, Random.Default.nextFloat() * 360.0f, 0.75f, 0.5f, 1.0f, null, 16, null)));
    }

    private final void drawDebugOverlay(Canvas $this$drawDebugOverlay) {
        Paint circlePaint = new Paint();
        circlePaint.setColor(SupportMenu.CATEGORY_MASK);
        circlePaint.setTextSize(48.0f);
        $this$drawDebugOverlay.drawCircle(0.0f, 0.0f, 20.0f, circlePaint);
        $this$drawDebugOverlay.drawCircle($this$drawDebugOverlay.getWidth(), 0.0f, 20.0f, circlePaint);
        $this$drawDebugOverlay.drawCircle($this$drawDebugOverlay.getWidth(), $this$drawDebugOverlay.getHeight(), 20.0f, circlePaint);
        $this$drawDebugOverlay.drawCircle(0.0f, $this$drawDebugOverlay.getHeight(), 20.0f, circlePaint);
        $this$drawDebugOverlay.drawText(String.valueOf(this.requestCount), $this$drawDebugOverlay.getWidth() / 2.0f, $this$drawDebugOverlay.getHeight() / 2.0f, circlePaint);
        this.requestCount++;
    }
}
