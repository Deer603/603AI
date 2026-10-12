package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0019H\u0002J\b\u0010#\u001a\u00020!H\u0002J\u0006\u0010$\u001a\u00020!J+\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u0017H\u0082@ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u0004\u0018\u00010\rH\u0082@¢\u0006\u0002\u0010-J\u0012\u0010.\u001a\u00020!2\b\u0010/\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u00100\u001a\u00020!2\u0006\u0010/\u001a\u00020\rH\u0016J#\u00101\u001a\u00020&2\u0006\u00102\u001a\u00020&2\u0006\u0010'\u001a\u00020&H\u0096@ø\u0001\u0000¢\u0006\u0004\b3\u00104J*\u00105\u001a\u0002062\u0006\u00102\u001a\u0002062\u0006\u0010'\u001a\u0002062\u0006\u00107\u001a\u000208H\u0016ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u001b\u0010;\u001a\u00020&2\u0006\u0010'\u001a\u00020&H\u0096@ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\"\u0010>\u001a\u0002062\u0006\u0010'\u001a\u0002062\u0006\u00107\u001a\u000208H\u0016ø\u0001\u0000¢\u0006\u0004\b?\u0010@J\u0018\u0010A\u001a\u00020!2\u0006\u0010/\u001a\u00020\r2\u0006\u0010B\u001a\u00020CH\u0016J\b\u0010D\u001a\u00020!H\u0002J\"\u0010E\u001a\u0002062\u0006\u0010'\u001a\u0002062\u0006\u0010F\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\bG\u0010HR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006I"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroid/view/WindowInsetsAnimationControlListener;", "windowInsets", "Landroidx/compose/foundation/layout/AndroidWindowInsets;", "view", "Landroid/view/View;", "sideCalculator", "Landroidx/compose/foundation/layout/SideCalculator;", "density", "Landroidx/compose/ui/unit/Density;", "(Landroidx/compose/foundation/layout/AndroidWindowInsets;Landroid/view/View;Landroidx/compose/foundation/layout/SideCalculator;Landroidx/compose/ui/unit/Density;)V", "animationController", "Landroid/view/WindowInsetsAnimationController;", "animationJob", "Lkotlinx/coroutines/Job;", "cancellationSignal", "Landroid/os/CancellationSignal;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "isControllerRequested", "", "partialConsumption", "", "getSideCalculator", "()Landroidx/compose/foundation/layout/SideCalculator;", "getView", "()Landroid/view/View;", "getWindowInsets", "()Landroidx/compose/foundation/layout/AndroidWindowInsets;", "adjustInsets", "", "inset", "animationEnded", "dispose", "fling", "Landroidx/compose/ui/unit/Velocity;", "available", "flingAmount", "towardShown", "fling-huYlsQE", "(JFZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAnimationController", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCancelled", "controller", "onFinished", "onPostFling", "consumed", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "onReady", "types", "", "requestAnimationController", "scroll", "scrollAmount", "scroll-8S9VItk", "(JF)J", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class WindowInsetsNestedScrollConnection implements NestedScrollConnection, WindowInsetsAnimationControlListener {
    private WindowInsetsAnimationController animationController;
    private Job animationJob;
    private final CancellationSignal cancellationSignal;
    private CancellableContinuation<? super WindowInsetsAnimationController> continuation;
    private final Density density;
    private boolean isControllerRequested;
    private float partialConsumption;
    private final SideCalculator sideCalculator;
    private final View view;
    private final AndroidWindowInsets windowInsets;

    public WindowInsetsNestedScrollConnection(AndroidWindowInsets windowInsets, View view, SideCalculator sideCalculator, Density density) {
        this.windowInsets = windowInsets;
        this.view = view;
        this.sideCalculator = sideCalculator;
        this.density = density;
        this.cancellationSignal = new CancellationSignal();
    }

    public static final /* synthetic */ void access$adjustInsets(WindowInsetsNestedScrollConnection $this, float inset) {
        $this.adjustInsets(inset);
    }

    /* JADX INFO: renamed from: access$fling-huYlsQE, reason: not valid java name */
    public static final /* synthetic */ Object m799access$flinghuYlsQE(WindowInsetsNestedScrollConnection $this, long available, float flingAmount, boolean towardShown, Continuation $completion) {
        return $this.m800flinghuYlsQE(available, flingAmount, towardShown, $completion);
    }

    public static final /* synthetic */ Object access$getAnimationController(WindowInsetsNestedScrollConnection $this, Continuation $completion) {
        return $this.getAnimationController($completion);
    }

    public static final /* synthetic */ Job access$getAnimationJob$p(WindowInsetsNestedScrollConnection $this) {
        return $this.animationJob;
    }

    public static final /* synthetic */ void access$requestAnimationController(WindowInsetsNestedScrollConnection $this) {
        $this.requestAnimationController();
    }

    public static final /* synthetic */ void access$setAnimationController$p(WindowInsetsNestedScrollConnection $this, WindowInsetsAnimationController r1) {
        $this.animationController = r1;
    }

    public static final /* synthetic */ void access$setAnimationJob$p(WindowInsetsNestedScrollConnection $this, Job r1) {
        $this.animationJob = r1;
    }

    public static final /* synthetic */ void access$setContinuation$p(WindowInsetsNestedScrollConnection $this, CancellableContinuation r1) {
        $this.continuation = r1;
    }

    public final AndroidWindowInsets getWindowInsets() {
        return this.windowInsets;
    }

    public final View getView() {
        return this.view;
    }

    public final SideCalculator getSideCalculator() {
        return this.sideCalculator;
    }

    public final Density getDensity() {
        return this.density;
    }

    private final void requestAnimationController() {
        if (this.isControllerRequested == true) goto L8;
        this.isControllerRequested = true;
        WindowInsetsController r1 = this.view.getWindowInsetsController();
        if (r1 == null) goto L9;
        r1.controlWindowInsetsAnimation(this.windowInsets.getType$foundation_layout_release(), -1, null, this.cancellationSignal, this);
        return;
    L9:
        return;
    }

    private final Object getAnimationController(Continuation<? super WindowInsetsAnimationController> r7) {
        WindowInsetsAnimationController r0 = this.animationController;
        if (r0 != null) goto L9;
        CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt.intercepted(r7), 1);
        cancellable$iv.initCancellability();
        CancellableContinuationImpl continuation = cancellable$iv;
        access$setContinuation$p(this, continuation);
        access$requestAnimationController(this);
        Object r1 = cancellable$iv.getResult();
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L8;
        DebugProbesKt.probeCoroutineSuspended(r7);
    L8:
        return r1;
    L9:
        return r0;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
    public long mo803onPreScrollOzD1aCk(long available, int source) {
        int bits$iv$iv$iv = (int) (available >> 32);
        int bits$iv$iv$iv2 = (int) (4294967295L & available);
        return m801scroll8S9VItk(available, this.sideCalculator.hideMotion(Float.intBitsToFloat(bits$iv$iv$iv), Float.intBitsToFloat(bits$iv$iv$iv2)));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public long mo497onPostScrollDzOQY0M(long consumed, long available, int source) {
        int bits$iv$iv$iv = (int) (available >> 32);
        int bits$iv$iv$iv2 = (int) (4294967295L & available);
        return m801scroll8S9VItk(available, this.sideCalculator.showMotion(Float.intBitsToFloat(bits$iv$iv$iv), Float.intBitsToFloat(bits$iv$iv$iv2)));
    }

    /* JADX INFO: renamed from: scroll-8S9VItk, reason: not valid java name */
    private final long m801scroll8S9VItk(long available, float scrollAmount) {
        Job it = this.animationJob;
        if (it == null) goto L5;
        it.cancel(new WindowInsetsAnimationCancelledException());
        this.animationJob = null;
    L5:
        WindowInsetsAnimationController animationController = this.animationController;
        boolean r3 = true;
        if (scrollAmount != 0.0f) goto L8;
        boolean r2 = true;
    L9:
        if (r2 == true) goto L33;
        boolean r4 = this.windowInsets.isVisible();
        if (scrollAmount > 0.0f) goto L14;
        r3 = false;
    L14:
        if (r4 != r3) goto L17;
        if (animationController == null) goto L33;
    L17:
        if (animationController != null) goto L20;
        this.partialConsumption = 0.0f;
        requestAnimationController();
        return this.sideCalculator.mo753consumedOffsetsMKHz9U(available);
    L20:
        int hidden = this.sideCalculator.valueOf(animationController.getHiddenStateInsets());
        int shown = this.sideCalculator.valueOf(animationController.getShownStateInsets());
        Insets currentInsets = animationController.getCurrentInsets();
        int current = this.sideCalculator.valueOf(currentInsets);
        if (scrollAmount <= 0.0f) goto L23;
        int target = shown;
    L24:
        if (current != target) goto L27;
        this.partialConsumption = 0.0f;
        return Offset.Companion.m4141getZeroF1C5BW0();
    L27:
        float total = (current + scrollAmount) + this.partialConsumption;
        int next = RangesKt.coerceIn(Math.round(total), hidden, shown);
        float $this$fastRoundToInt$iv = Math.round(total);
        this.partialConsumption = total - $this$fastRoundToInt$iv;
        if (next == current) goto L31;
        animationController.setInsetsAndAlpha(this.sideCalculator.adjustInsets(currentInsets, next), 1.0f, 0.0f);
    L31:
        return this.sideCalculator.mo753consumedOffsetsMKHz9U(available);
    L23:
        target = hidden;
    L33:
        return Offset.Companion.m4141getZeroF1C5BW0();
    L8:
        r2 = false;
        goto L9
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreFling-QWom1Mo, reason: not valid java name */
    public Object mo802onPreFlingQWom1Mo(long available, Continuation<? super Velocity> r12) {
        return m800flinghuYlsQE(available, this.sideCalculator.hideMotion(Velocity.m7211getXimpl(available), Velocity.m7212getYimpl(available)), false, r12);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public Object mo496onPostFlingRZ2iAVY(long consumed, long available, Continuation<? super Velocity> r14) {
        return m800flinghuYlsQE(available, this.sideCalculator.showMotion(Velocity.m7211getXimpl(available), Velocity.m7212getYimpl(available)), true, r14);
    }

    /* JADX INFO: renamed from: fling-huYlsQE, reason: not valid java name */
    private final Object m800flinghuYlsQE(long r24, float flingAmount, boolean towardShown, Continuation<? super Velocity> r28) {
        if ((r28 instanceof WindowInsetsNestedScrollConnection$fling$1) == false) goto L7;
        WindowInsetsNestedScrollConnection$fling$1 r1 = (WindowInsetsNestedScrollConnection$fling$1) r28;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r1.result;
        Object r4 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r1.label) {
            case 0: goto L15;
            case 1: goto L14;
            case 2: goto L13;
            case 3: goto L12;
            default: goto L11;
        };
    L12:
        long available = r1.J$0;
        WindowInsetsNestedScrollConnection r6 = (WindowInsetsNestedScrollConnection) r1.L$0;
        ResultKt.throwOnFailure($result);
    L70:
        return Velocity.m7202boximpl(r6.sideCalculator.mo754consumedVelocityQWom1Mo(available, 0.0f));
    L13:
        long available2 = r1.J$0;
        Ref.FloatRef endVelocity = (Ref.FloatRef) r1.L$1;
        WindowInsetsNestedScrollConnection r7 = (WindowInsetsNestedScrollConnection) r1.L$0;
        ResultKt.throwOnFailure($result);
    L81:
        return Velocity.m7202boximpl(r7.sideCalculator.mo754consumedVelocityQWom1Mo(available2, endVelocity.element));
    L14:
        float flingAmount2 = r1.F$0;
        long available3 = r1.J$0;
        WindowInsetsNestedScrollConnection r12 = (WindowInsetsNestedScrollConnection) r1.L$0;
        ResultKt.throwOnFailure($result);
        float flingAmount3 = flingAmount2;
        Object r5 = $result;
        WindowInsetsNestedScrollConnection r13 = r12;
    L34:
        WindowInsetsAnimationController animationController = (WindowInsetsAnimationController) r5;
        if (animationController == null) goto L37;
        int hidden = r13.sideCalculator.valueOf(animationController.getHiddenStateInsets());
        int shown = r13.sideCalculator.valueOf(animationController.getShownStateInsets());
        Insets currentInsets = animationController.getCurrentInsets();
        int current = r13.sideCalculator.valueOf(currentInsets);
        if (flingAmount3 > 0.0f) goto L42;
        if (current != hidden) goto L42;
    L44:
        if (current != shown) goto L46;
        boolean r8 = true;
    L47:
        animationController.finish(r8);
        r13.animationController = null;
        return Velocity.m7202boximpl(Velocity.Companion.m7222getZero9UxMQ8M());
    L46:
        r8 = false;
    L42:
        if (flingAmount3 < 0.0f) goto L49;
        if (current == shown) goto L44;
    L49:
        SplineBasedFloatDecayAnimationSpec spec = new SplineBasedFloatDecayAnimationSpec(r13.density);
        float distance = current + spec.flingDistance(flingAmount3);
        float endPercent = (distance - hidden) / (shown - hidden);
        if (endPercent <= 0.5f) goto L52;
        boolean targetShown = true;
    L53:
        if (targetShown == false) goto L55;
        int target = shown;
    L56:
        boolean targetShown2 = targetShown;
        if (distance > shown) goto L72;
        if (distance < hidden) goto L72;
        if (targetShown2 == false) goto L64;
        boolean r18 = true;
    L65:
        WindowInsetsNestedScrollConnection$fling$3 r14 = new WindowInsetsNestedScrollConnection$fling$3(r13, current, target, flingAmount3, animationController, r18, null);
        r1.L$0 = r13;
        r1.J$0 = available3;
        r1.label = 3;
        if (CoroutineScopeKt.coroutineScope(r14, r1) != r4) goto L68;
        return r4;
    L68:
        available = available3;
        r6 = r13;
        goto L70
    L64:
        r18 = false;
    L72:
        Ref.FloatRef endVelocity2 = new Ref.FloatRef();
        if (targetShown2 == false) goto L75;
        boolean r21 = true;
    L76:
        WindowInsetsNestedScrollConnection$fling$2 r15 = new WindowInsetsNestedScrollConnection$fling$2(r13, current, flingAmount3, spec, hidden, shown, endVelocity2, animationController, r21, null);
        endVelocity = endVelocity2;
        r1.L$0 = r13;
        r1.L$1 = endVelocity;
        r1.J$0 = available3;
        r1.label = 2;
        if (CoroutineScopeKt.coroutineScope(r15, r1) != r4) goto L79;
        return r4;
    L79:
        available2 = available3;
        r7 = r13;
        goto L81
    L75:
        r21 = false;
        goto L76
    L55:
        target = hidden;
        goto L56
    L52:
        targetShown = false;
        goto L53
    L37:
        return Velocity.m7202boximpl(Velocity.Companion.m7222getZero9UxMQ8M());
    L15:
        ResultKt.throwOnFailure($result);
        available3 = r24;
        Job r16 = this.animationJob;
        if (r16 == null) goto L18;
        r16.cancel(new WindowInsetsAnimationCancelledException());
    L18:
        this.animationJob = null;
        this.partialConsumption = 0.0f;
        if (flingAmount != 0.0f) goto L21;
        boolean r17 = true;
    L22:
        if (r17 == false) goto L25;
        if (towardShown == true) goto L25;
    L29:
        return Velocity.m7202boximpl(Velocity.Companion.m7222getZero9UxMQ8M());
    L25:
        if (this.animationController == null) goto L27;
    L30:
        r1.L$0 = this;
        r1.J$0 = available3;
        r1.F$0 = flingAmount;
        r1.label = 1;
        r5 = getAnimationController(r1);
        if (r5 != r4) goto L33;
        return r4;
    L33:
        flingAmount3 = flingAmount;
        r13 = this;
        goto L34
    L27:
        if (this.windowInsets.isVisible() != towardShown) goto L30;
    L21:
        r17 = false;
        goto L22
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new WindowInsetsNestedScrollConnection$fling$1(this, r28);
        goto L8
    }

    private final void adjustInsets(float inset) {
        WindowInsetsAnimationController it = this.animationController;
        if (it == null) goto L6;
        Insets currentInsets = it.getCurrentInsets();
        Insets nextInsets = this.sideCalculator.adjustInsets(currentInsets, Math.round(inset));
        it.setInsetsAndAlpha(nextInsets, 1.0f, 0.0f);
        return;
    }

    public void onReady(WindowInsetsAnimationController controller, int types) {
        this.animationController = controller;
        this.isControllerRequested = false;
        CancellableContinuation<? super WindowInsetsAnimationController> r0 = this.continuation;
        if (r0 == null) goto L5;
        r0.resume(controller, C02881.INSTANCE);
    L5:
        this.continuation = null;
    }

    public final void dispose() {
        CancellableContinuation<? super WindowInsetsAnimationController> r0 = this.continuation;
        if (r0 == null) goto L5;
        r0.resume(null, C02871.INSTANCE);
    L5:
        Job r1 = this.animationJob;
        if (r1 == null) goto L8;
        Job.DefaultImpls.cancel$default(r1, null, 1, null);
    L8:
        WindowInsetsAnimationController animationController = this.animationController;
        if (animationController == null) goto L12;
        boolean visible = !Intrinsics.areEqual(animationController.getCurrentInsets(), animationController.getHiddenStateInsets());
        animationController.finish(visible);
        return;
    }

    public void onFinished(WindowInsetsAnimationController controller) {
        animationEnded();
    }

    public void onCancelled(WindowInsetsAnimationController controller) {
        animationEnded();
    }

    private final void animationEnded() {
        WindowInsetsAnimationController r0 = this.animationController;
        if (r0 == null) goto L7;
        boolean r2 = true;
        if (r0.isReady() != true) goto L7;
    L8:
        if (r2 == false) goto L12;
        WindowInsetsAnimationController r1 = this.animationController;
        if (r1 == null) goto L12;
        r1.finish(this.windowInsets.isVisible());
    L12:
        this.animationController = null;
        CancellableContinuation<? super WindowInsetsAnimationController> r3 = this.continuation;
        if (r3 == null) goto L15;
        r3.resume(null, AnonymousClass1.INSTANCE);
    L15:
        this.continuation = null;
        Job r4 = this.animationJob;
        if (r4 == null) goto L18;
        r4.cancel(new WindowInsetsAnimationCancelledException());
    L18:
        this.animationJob = null;
        this.partialConsumption = 0.0f;
        this.isControllerRequested = false;
        return;
    L7:
        r2 = false;
        goto L8
    }
}
