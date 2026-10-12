package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.MathKt;

/* JADX INFO: compiled from: AndroidOverscroll.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010)\u001a\u00020%H\u0002J?\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020,2\"\u0010-\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020,\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0/\u0012\u0006\u0012\u0004\u0018\u0001000.H\u0096@ø\u0001\u0000¢\u0006\u0004\b1\u00102J6\u00103\u001a\u00020\"2\u0006\u00104\u001a\u00020\"2\u0006\u00105\u001a\u0002062\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"08H\u0016ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u0015\u0010;\u001a\u00020\"H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020%H\u0000¢\u0006\u0002\b?J\u001a\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\"H\u0002ø\u0001\u0000¢\u0006\u0004\bC\u0010DJ\u001a\u0010E\u001a\u00020A2\u0006\u0010B\u001a\u00020\"H\u0002ø\u0001\u0000¢\u0006\u0004\bF\u0010DJ\u001a\u0010G\u001a\u00020A2\u0006\u0010B\u001a\u00020\"H\u0002ø\u0001\u0000¢\u0006\u0004\bH\u0010DJ\u001a\u0010I\u001a\u00020A2\u0006\u0010B\u001a\u00020\"H\u0002ø\u0001\u0000¢\u0006\u0004\bJ\u0010DJ\u001a\u0010K\u001a\u00020\u00112\u0006\u00104\u001a\u00020\"H\u0002ø\u0001\u0000¢\u0006\u0004\bL\u0010MJ\u001a\u0010N\u001a\u00020%2\u0006\u0010O\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\bP\u0010QR\u0016\u0010\u000b\u001a\u00020\fX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0010\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u001eX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010!\u001a\u00020\"X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u000e\u0010(\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006R"}, d2 = {"Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "Landroidx/compose/foundation/OverscrollEffect;", "context", "Landroid/content/Context;", "density", "Landroidx/compose/ui/unit/Density;", "glowColor", "Landroidx/compose/ui/graphics/Color;", "glowDrawPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroid/content/Context;Landroidx/compose/ui/unit/Density;JLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "containerSize", "Landroidx/compose/ui/geometry/Size;", "J", "edgeEffectWrapper", "Landroidx/compose/foundation/EdgeEffectWrapper;", "invalidationEnabled", "", "getInvalidationEnabled$foundation_release$annotations", "()V", "getInvalidationEnabled$foundation_release", "()Z", "setInvalidationEnabled$foundation_release", "(Z)V", "isInProgress", "node", "Landroidx/compose/ui/node/DelegatableNode;", "getNode", "()Landroidx/compose/ui/node/DelegatableNode;", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerInputNode", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "redrawSignal", "Landroidx/compose/runtime/MutableState;", "", "getRedrawSignal$foundation_release", "()Landroidx/compose/runtime/MutableState;", "scrollCycleInProgress", "animateToReleaseIfNeeded", "applyToFling", "velocity", "Landroidx/compose/ui/unit/Velocity;", "performFling", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "applyToFling-BMRW4eQ", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyToScroll", "delta", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "performScroll", "Lkotlin/Function1;", "applyToScroll-Rhakbz0", "(JILkotlin/jvm/functions/Function1;)J", "displacement", "displacement-F1C5BW0$foundation_release", "()J", "invalidateOverscroll", "invalidateOverscroll$foundation_release", "pullBottom", "", "scroll", "pullBottom-k-4lQ0M", "(J)F", "pullLeft", "pullLeft-k-4lQ0M", "pullRight", "pullRight-k-4lQ0M", "pullTop", "pullTop-k-4lQ0M", "releaseOppositeOverscroll", "releaseOppositeOverscroll-k-4lQ0M", "(J)Z", "updateSize", "size", "updateSize-uvyYCjk$foundation_release", "(J)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidEdgeEffectOverscrollEffect implements OverscrollEffect {
    public static final int $stable = 0;
    private long containerSize;
    private final Density density;
    private final EdgeEffectWrapper edgeEffectWrapper;
    private boolean invalidationEnabled;
    private final DelegatableNode node;
    private long pointerId;
    private final SuspendingPointerInputModifierNode pointerInputNode;
    private long pointerPosition;
    private final MutableState<Unit> redrawSignal;
    private boolean scrollCycleInProgress;

    static {
    }

    public /* synthetic */ AndroidEdgeEffectOverscrollEffect(Context r1, Density r2, long r3, PaddingValues r5, DefaultConstructorMarker r6) {
        this(r1, r2, r3, r5);
    }

    public static /* synthetic */ void getInvalidationEnabled$foundation_release$annotations() {
    }

    private AndroidEdgeEffectOverscrollEffect(Context context, Density density, long glowColor, PaddingValues glowDrawPadding) {
        this.density = density;
        this.pointerPosition = Offset.Companion.m4140getUnspecifiedF1C5BW0();
        this.edgeEffectWrapper = new EdgeEffectWrapper(context, ColorKt.m4420toArgb8_81llA(glowColor));
        this.redrawSignal = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
        this.invalidationEnabled = true;
        this.containerSize = Size.Companion.m4203getZeroNHjbRc();
        this.pointerId = PointerId.m5569constructorimpl(-1);
        this.pointerInputNode = SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new AndroidEdgeEffectOverscrollEffect$pointerInputNode$1(this));
        if (Build.VERSION.SDK_INT < 31) goto L5;
        GlowOverscrollNode r0 = new StretchOverscrollNode(this.pointerInputNode, this, this.edgeEffectWrapper);
    L6:
        this.node = r0;
        return;
    L5:
        r0 = new GlowOverscrollNode(this.pointerInputNode, this, this.edgeEffectWrapper, glowDrawPadding);
        goto L6
    }

    public static final /* synthetic */ long access$getPointerId$p(AndroidEdgeEffectOverscrollEffect $this) {
        return $this.pointerId;
    }

    public static final /* synthetic */ void access$setPointerId$p(AndroidEdgeEffectOverscrollEffect $this, long r1) {
        $this.pointerId = r1;
    }

    public static final /* synthetic */ void access$setPointerPosition$p(AndroidEdgeEffectOverscrollEffect $this, long r1) {
        $this.pointerPosition = r1;
    }

    public final MutableState<Unit> getRedrawSignal$foundation_release() {
        return this.redrawSignal;
    }

    public final boolean getInvalidationEnabled$foundation_release() {
        return this.invalidationEnabled;
    }

    public final void setInvalidationEnabled$foundation_release(boolean r1) {
        this.invalidationEnabled = r1;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* JADX INFO: renamed from: applyToScroll-Rhakbz0, reason: not valid java name */
    public long mo213applyToScrollRhakbz0(long delta, int source, Function1<? super Offset, Offset> r35) {
        if (Size.m4196isEmptyimpl(this.containerSize) == false) goto L7;
        return r35.invoke(Offset.m4114boximpl(delta)).m4135unboximpl();
    L7:
        if (this.scrollCycleInProgress == false) goto L9;
    L21:
        float destretchMultiplier = AndroidOverscroll_androidKt.m230access$destretchMultiplierGyEprt8(source);
        long destretchDelta = Offset.m4132timestuRUvjQ(delta, destretchMultiplier);
        int bits$iv$iv$iv = (int) (delta & 4294967295L);
        if (Float.intBitsToFloat(bits$iv$iv$iv) != 0.0f) goto L24;
        boolean r9 = true;
    L25:
        if (r9 == false) goto L28;
        float r16 = 0.0f;
        long r18 = 4294967295L;
        float consumedPixelsY = 0.0f;
    L57:
        char r13 = ' ';
        int bits$iv$iv$iv2 = (int) (delta >> 32);
        if (Float.intBitsToFloat(bits$iv$iv$iv2) != r16) goto L60;
        boolean r8 = true;
    L61:
        if (r8 == false) goto L64;
        long destretchDelta2 = destretchDelta;
        float consumedPixelsX = r16;
    L92:
        long v1$iv$iv = Float.floatToRawIntBits(consumedPixelsX);
        char r15 = r13;
        long v2$iv$iv = Float.floatToRawIntBits(consumedPixelsY);
        long consumedOffset = Offset.m4117constructorimpl((v1$iv$iv << r15) | (v2$iv$iv & r18));
        if (Offset.m4122equalsimpl0(consumedOffset, Offset.Companion.m4141getZeroF1C5BW0()) == true) goto L95;
        invalidateOverscroll$foundation_release();
    L95:
        long leftForDelta = Offset.m4129minusMKHz9U(delta, consumedOffset);
        long consumedByDelta = r35.invoke(Offset.m4114boximpl(leftForDelta)).m4135unboximpl();
        long leftForOverscroll = Offset.m4129minusMKHz9U(leftForDelta, consumedByDelta);
        int bits$iv$iv$iv3 = (int) (leftForDelta >> r15);
        if (Float.intBitsToFloat(bits$iv$iv$iv3) != r16) goto L98;
        boolean r3 = true;
    L99:
        if (r3 == false) goto L105;
        int bits$iv$iv$iv4 = (int) (leftForDelta & r18);
        if (Float.intBitsToFloat(bits$iv$iv$iv4) != r16) goto L103;
        boolean r4 = true;
    L104:
        if (r4 == false) goto L105;
    L125:
        boolean appliedVerticalOverscroll = false;
        if (NestedScrollSource.m5470equalsimpl0(source, NestedScrollSource.Companion.m5482getUserInputWNlRxjI()) == false) goto L150;
        int bits$iv$iv$iv5 = (int) (leftForOverscroll >> r15);
        if (Float.intBitsToFloat(bits$iv$iv$iv5) <= 0.5f) goto L130;
        m208pullLeftk4lQ0M(leftForOverscroll);
        boolean appliedHorizontalOverscroll = true;
        float r6 = 0.5f;
    L134:
        float r10 = r6;
        int bits$iv$iv$iv6 = (int) (leftForOverscroll & r18);
        if (Float.intBitsToFloat(bits$iv$iv$iv6) <= r10) goto L137;
        m210pullTopk4lQ0M(leftForOverscroll);
        boolean appliedHorizontalOverscroll2 = appliedHorizontalOverscroll;
        boolean appliedHorizontalOverscroll3 = true;
    L142:
        if (appliedHorizontalOverscroll2 == true) goto L146;
        if (appliedHorizontalOverscroll3 == true) goto L146;
        boolean r5 = false;
    L147:
        appliedVerticalOverscroll = r5;
    L146:
        r5 = true;
        goto L147
    L137:
        appliedHorizontalOverscroll2 = appliedHorizontalOverscroll;
        int bits$iv$iv$iv7 = (int) (leftForOverscroll & r18);
        if (Float.intBitsToFloat(bits$iv$iv$iv7) >= (-0.5f)) goto L140;
        m207pullBottomk4lQ0M(leftForOverscroll);
        appliedHorizontalOverscroll3 = true;
        goto L142
    L140:
        appliedHorizontalOverscroll3 = false;
        goto L142
    L130:
        r6 = 0.5f;
        int bits$iv$iv$iv8 = (int) (leftForOverscroll >> r15);
        if (Float.intBitsToFloat(bits$iv$iv$iv8) >= (-0.5f)) goto L133;
        m209pullRightk4lQ0M(leftForOverscroll);
        appliedHorizontalOverscroll = true;
        goto L134
    L133:
        appliedHorizontalOverscroll = false;
    L150:
        if (Offset.m4122equalsimpl0(leftForDelta, Offset.Companion.m4141getZeroF1C5BW0()) == false) goto L152;
    L158:
        if (appliedVerticalOverscroll == false) goto L161;
        invalidateOverscroll$foundation_release();
    L161:
        return Offset.m4130plusMKHz9U(consumedOffset, consumedByDelta);
    L152:
        if (m211releaseOppositeOverscrollk4lQ0M(delta) == true) goto L156;
        if (appliedVerticalOverscroll == true) goto L156;
        boolean r7 = false;
    L157:
        appliedVerticalOverscroll = r7;
    L156:
        r7 = true;
        goto L157
    L103:
        r4 = false;
    L105:
        int bits$iv$iv$iv9 = (int) (consumedByDelta >> r15);
        if (Float.intBitsToFloat(bits$iv$iv$iv9) != r16) goto L108;
        boolean r11 = true;
    L109:
        if (r11 == false) goto L115;
        int bits$iv$iv$iv10 = (int) (consumedByDelta & r18);
        if (Float.intBitsToFloat(bits$iv$iv$iv10) != r16) goto L113;
        boolean r12 = true;
    L114:
        if (r12 == true) goto L125;
    L113:
        r12 = false;
    L115:
        EdgeEffectWrapper $this$applyToScroll_Rhakbz0_u24lambda_u244 = this.edgeEffectWrapper;
        if ($this$applyToScroll_Rhakbz0_u24lambda_u244.isLeftStretched() == false) goto L118;
    L123:
        animateToReleaseIfNeeded();
        goto L125
    L118:
        if ($this$applyToScroll_Rhakbz0_u24lambda_u244.isTopStretched() == true) goto L123;
        if ($this$applyToScroll_Rhakbz0_u24lambda_u244.isRightStretched() == true) goto L123;
        if ($this$applyToScroll_Rhakbz0_u24lambda_u244.isBottomStretched() == false) goto L125;
    L108:
        r11 = false;
        goto L109
    L98:
        r3 = false;
        goto L99
    L64:
        if (this.edgeEffectWrapper.isLeftStretched() == false) goto L78;
        int bits$iv$iv$iv11 = (int) (delta >> 32);
        if (Float.intBitsToFloat(bits$iv$iv$iv11) >= r16) goto L78;
        float consumed = m208pullLeftk4lQ0M(destretchDelta);
        if (this.edgeEffectWrapper.isLeftStretched() == true) goto L70;
        this.edgeEffectWrapper.getOrCreateLeftEffect().finish();
    L70:
        int bits$iv$iv$iv12 = (int) (destretchDelta >> 32);
        if (consumed != Float.intBitsToFloat(bits$iv$iv$iv12)) goto L73;
        boolean r14 = true;
    L74:
        if (r14 == false) goto L76;
        int bits$iv$iv$iv13 = (int) (delta >> 32);
        consumedPixelsX = Float.intBitsToFloat(bits$iv$iv$iv13);
        r13 = ' ';
        destretchDelta2 = destretchDelta;
        goto L92
    L76:
        consumedPixelsX = consumed / destretchMultiplier;
        r13 = ' ';
        destretchDelta2 = destretchDelta;
        goto L92
    L73:
        r14 = false;
    L78:
        if (this.edgeEffectWrapper.isRightStretched() == false) goto L91;
        int bits$iv$iv$iv14 = (int) (delta >> 32);
        if (Float.intBitsToFloat(bits$iv$iv$iv14) <= r16) goto L91;
        destretchDelta2 = destretchDelta;
        float consumed2 = m209pullRightk4lQ0M(destretchDelta2);
        if (this.edgeEffectWrapper.isRightStretched() == true) goto L84;
        this.edgeEffectWrapper.getOrCreateRightEffect().finish();
    L84:
        r13 = ' ';
        int bits$iv$iv$iv15 = (int) (destretchDelta2 >> 32);
        if (consumed2 != Float.intBitsToFloat(bits$iv$iv$iv15)) goto L87;
        boolean r17 = true;
    L88:
        if (r17 == false) goto L90;
        int bits$iv$iv$iv16 = (int) (delta >> 32);
        consumedPixelsX = Float.intBitsToFloat(bits$iv$iv$iv16);
        goto L92
    L90:
        consumedPixelsX = consumed2 / destretchMultiplier;
        goto L92
    L87:
        r17 = false;
    L91:
        r13 = ' ';
        destretchDelta2 = destretchDelta;
        consumedPixelsX = r16;
        goto L92
    L60:
        r8 = false;
        goto L61
    L28:
        if (this.edgeEffectWrapper.isTopStretched() == false) goto L41;
        r16 = 0.0f;
        int bits$iv$iv$iv17 = (int) (delta & 4294967295L);
        if (Float.intBitsToFloat(bits$iv$iv$iv17) >= 0.0f) goto L42;
        float consumed3 = m210pullTopk4lQ0M(destretchDelta);
        if (this.edgeEffectWrapper.isTopStretched() == true) goto L34;
        this.edgeEffectWrapper.getOrCreateTopEffect().finish();
    L34:
        int bits$iv$iv$iv18 = (int) (destretchDelta & 4294967295L);
        if (consumed3 != Float.intBitsToFloat(bits$iv$iv$iv18)) goto L37;
        boolean r19 = true;
    L38:
        if (r19 == false) goto L40;
        r18 = 4294967295L;
        int bits$iv$iv$iv19 = (int) (delta & 4294967295L);
        consumedPixelsY = Float.intBitsToFloat(bits$iv$iv$iv19);
        goto L57
    L40:
        r18 = 4294967295L;
        consumedPixelsY = consumed3 / destretchMultiplier;
        goto L57
    L37:
        r19 = false;
    L42:
        r18 = 4294967295L;
        if (this.edgeEffectWrapper.isBottomStretched() == false) goto L56;
        int bits$iv$iv$iv20 = (int) (delta & 4294967295L);
        if (Float.intBitsToFloat(bits$iv$iv$iv20) <= r16) goto L56;
        float consumed4 = m207pullBottomk4lQ0M(destretchDelta);
        if (this.edgeEffectWrapper.isBottomStretched() == true) goto L49;
        this.edgeEffectWrapper.getOrCreateBottomEffect().finish();
    L49:
        int bits$iv$iv$iv21 = (int) (destretchDelta & 4294967295L);
        if (consumed4 != Float.intBitsToFloat(bits$iv$iv$iv21)) goto L52;
        boolean r20 = true;
    L53:
        if (r20 == false) goto L55;
        int bits$iv$iv$iv22 = (int) (delta & 4294967295L);
        consumedPixelsY = Float.intBitsToFloat(bits$iv$iv$iv22);
        goto L57
    L55:
        consumedPixelsY = consumed4 / destretchMultiplier;
        goto L57
    L52:
        r20 = false;
    L56:
        consumedPixelsY = r16;
        goto L57
    L41:
        r16 = 0.0f;
        goto L42
    L24:
        r9 = false;
        goto L25
    L9:
        if (this.edgeEffectWrapper.isLeftStretched() == false) goto L12;
        m208pullLeftk4lQ0M(Offset.Companion.m4141getZeroF1C5BW0());
    L12:
        if (this.edgeEffectWrapper.isRightStretched() == false) goto L15;
        m209pullRightk4lQ0M(Offset.Companion.m4141getZeroF1C5BW0());
    L15:
        if (this.edgeEffectWrapper.isTopStretched() == false) goto L18;
        m210pullTopk4lQ0M(Offset.Companion.m4141getZeroF1C5BW0());
    L18:
        if (this.edgeEffectWrapper.isBottomStretched() == false) goto L20;
        m207pullBottomk4lQ0M(Offset.Companion.m4141getZeroF1C5BW0());
    L20:
        this.scrollCycleInProgress = true;
        goto L21
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* JADX INFO: renamed from: applyToFling-BMRW4eQ, reason: not valid java name */
    public Object mo212applyToFlingBMRW4eQ(long velocity, Function2<? super Velocity, ? super Continuation<? super Velocity>, ? extends Object> r27, Continuation<? super Unit> r28) {
        if ((r28 instanceof AndroidEdgeEffectOverscrollEffect$applyToFling$1) == false) goto L7;
        AndroidEdgeEffectOverscrollEffect$applyToFling$1 r1 = (AndroidEdgeEffectOverscrollEffect$applyToFling$1) r28;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r1.result;
        Object r4 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r1.label) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        long remainingVelocity = r1.J$0;
        AndroidEdgeEffectOverscrollEffect r7 = (AndroidEdgeEffectOverscrollEffect) r1.L$0;
        ResultKt.throwOnFailure($result);
        float r20 = 0.0f;
    L50:
        long consumedByVelocity = Velocity.m7214minusAH228Gc(remainingVelocity, ((Velocity) $result).m7220unboximpl());
        r7.scrollCycleInProgress = false;
        if (Velocity.m7211getXimpl(consumedByVelocity) <= r20) goto L54;
        EdgeEffectCompat.INSTANCE.onAbsorbCompat(r7.edgeEffectWrapper.getOrCreateLeftEffect(), MathKt.roundToInt(Velocity.m7211getXimpl(consumedByVelocity)));
    L57:
        if (Velocity.m7212getYimpl(consumedByVelocity) <= r20) goto L60;
        EdgeEffectCompat.INSTANCE.onAbsorbCompat(r7.edgeEffectWrapper.getOrCreateTopEffect(), MathKt.roundToInt(Velocity.m7212getYimpl(consumedByVelocity)));
    L62:
        r7.animateToReleaseIfNeeded();
        return Unit.INSTANCE;
    L60:
        if (Velocity.m7212getYimpl(consumedByVelocity) >= r20) goto L62;
        EdgeEffectCompat.INSTANCE.onAbsorbCompat(r7.edgeEffectWrapper.getOrCreateBottomEffect(), -MathKt.roundToInt(Velocity.m7212getYimpl(consumedByVelocity)));
        goto L62
    L54:
        if (Velocity.m7211getXimpl(consumedByVelocity) >= r20) goto L57;
        EdgeEffectCompat.INSTANCE.onAbsorbCompat(r7.edgeEffectWrapper.getOrCreateRightEffect(), -MathKt.roundToInt(Velocity.m7211getXimpl(consumedByVelocity)));
        goto L57
    L13:
        ResultKt.throwOnFailure($result);
    L20:
        return Unit.INSTANCE;
    L14:
        ResultKt.throwOnFailure($result);
        r7 = this;
        if (Size.m4196isEmptyimpl(r7.containerSize) == false) goto L22;
        Velocity r6 = Velocity.m7202boximpl(velocity);
        r1.label = 1;
        if (r27.invoke(r6, r1) != r4) goto L20;
        return r4;
    L22:
        if (r7.edgeEffectWrapper.isLeftStretched() == true) goto L24;
    L26:
        r20 = 0.0f;
        if (r7.edgeEffectWrapper.isRightStretched() == true) goto L29;
    L31:
        float consumedX = 0.0f;
    L33:
        if (r7.edgeEffectWrapper.isTopStretched() == false) goto L38;
        if (Velocity.m7212getYimpl(velocity) >= r20) goto L38;
        EdgeEffectCompat r2 = EdgeEffectCompat.INSTANCE;
        EdgeEffect r3 = r7.edgeEffectWrapper.getOrCreateTopEffect();
        float r12 = Velocity.m7212getYimpl(velocity);
        long arg0$iv = r7.containerSize;
        int bits$iv$iv$iv = (int) (arg0$iv & 4294967295L);
        float consumedY = r2.absorbToRelaxIfNeeded(r3, r12, Float.intBitsToFloat(bits$iv$iv$iv), r7.density);
    L43:
        long consumed = VelocityKt.Velocity(consumedX, consumedY);
        if (Velocity.m7210equalsimpl0(consumed, Velocity.Companion.m7222getZero9UxMQ8M()) == true) goto L46;
        r7.invalidateOverscroll$foundation_release();
    L46:
        long consumed2 = Velocity.m7214minusAH228Gc(velocity, consumed);
        Velocity r8 = Velocity.m7202boximpl(consumed2);
        r1.L$0 = r7;
        r1.J$0 = consumed2;
        r1.label = 2;
        Object r5 = r27.invoke(r8, r1);
        if (r5 != r4) goto L49;
        return r4;
    L49:
        $result = r5;
        remainingVelocity = consumed2;
    L38:
        if (r7.edgeEffectWrapper.isBottomStretched() == true) goto L40;
    L42:
        consumedY = r20;
        goto L43
    L40:
        if (Velocity.m7212getYimpl(velocity) <= r20) goto L42;
        EdgeEffectCompat r9 = EdgeEffectCompat.INSTANCE;
        EdgeEffect r10 = r7.edgeEffectWrapper.getOrCreateBottomEffect();
        float r13 = -Velocity.m7212getYimpl(velocity);
        long arg0$iv2 = r7.containerSize;
        int bits$iv$iv$iv2 = (int) (arg0$iv2 & 4294967295L);
        consumedY = -r9.absorbToRelaxIfNeeded(r10, r13, Float.intBitsToFloat(bits$iv$iv$iv2), r7.density);
        goto L43
    L29:
        if (Velocity.m7211getXimpl(velocity) <= 0.0f) goto L31;
        EdgeEffectCompat r11 = EdgeEffectCompat.INSTANCE;
        EdgeEffect r14 = r7.edgeEffectWrapper.getOrCreateRightEffect();
        float r15 = -Velocity.m7211getXimpl(velocity);
        long arg0$iv3 = r7.containerSize;
        int bits$iv$iv$iv3 = (int) (arg0$iv3 >> 32);
        consumedX = -r11.absorbToRelaxIfNeeded(r14, r15, Float.intBitsToFloat(bits$iv$iv$iv3), r7.density);
        goto L33
    L24:
        if (Velocity.m7211getXimpl(velocity) >= 0.0f) goto L26;
        EdgeEffectCompat r16 = EdgeEffectCompat.INSTANCE;
        EdgeEffect r17 = r7.edgeEffectWrapper.getOrCreateLeftEffect();
        float r18 = Velocity.m7211getXimpl(velocity);
        long arg0$iv4 = r7.containerSize;
        r20 = 0.0f;
        int bits$iv$iv$iv4 = (int) (arg0$iv4 >> 32);
        r7 = r7;
        consumedX = r16.absorbToRelaxIfNeeded(r17, r18, Float.intBitsToFloat(bits$iv$iv$iv4), r7.density);
        goto L33
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new AndroidEdgeEffectOverscrollEffect$applyToFling$1(this, r28);
        goto L8
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public boolean isInProgress() {
        EdgeEffectWrapper this_$iv = this.edgeEffectWrapper;
        EdgeEffect it = EdgeEffectWrapper.access$getTopEffect$p(this_$iv);
        if (it != null) goto L5;
    L11:
        EdgeEffect it2 = EdgeEffectWrapper.access$getBottomEffect$p(this_$iv);
        if (it2 != null) goto L14;
    L20:
        EdgeEffect it3 = EdgeEffectWrapper.access$getLeftEffect$p(this_$iv);
        if (it3 != null) goto L23;
    L29:
        EdgeEffect it4 = EdgeEffectWrapper.access$getRightEffect$p(this_$iv);
        if (it4 != null) goto L32;
    L39:
        return false;
    L32:
        if (EdgeEffectCompat.INSTANCE.getDistanceCompat(it4) != 0.0f) goto L34;
        boolean r3 = true;
    L35:
        if (r3 == true) goto L39;
        return true;
    L34:
        r3 = false;
        goto L35
    L23:
        if (EdgeEffectCompat.INSTANCE.getDistanceCompat(it3) != 0.0f) goto L25;
        boolean r7 = true;
    L26:
        if (r7 == true) goto L29;
        return true;
    L25:
        r7 = false;
        goto L26
    L14:
        if (EdgeEffectCompat.INSTANCE.getDistanceCompat(it2) != 0.0f) goto L16;
        boolean r8 = true;
    L17:
        if (r8 == true) goto L20;
        return true;
    L16:
        r8 = false;
        goto L17
    L5:
        if (EdgeEffectCompat.INSTANCE.getDistanceCompat(it) != 0.0f) goto L7;
        boolean r9 = true;
    L8:
        if (r9 == true) goto L11;
        return true;
    L7:
        r9 = false;
        goto L8
    }

    /* JADX INFO: renamed from: updateSize-uvyYCjk$foundation_release, reason: not valid java name */
    public final void m215updateSizeuvyYCjk$foundation_release(long size) {
        boolean initialSetSize = Size.m4190equalsimpl0(this.containerSize, Size.Companion.m4203getZeroNHjbRc());
        boolean differentSize = !Size.m4190equalsimpl0(size, this.containerSize);
        this.containerSize = size;
        if (differentSize == false) goto L5;
        EdgeEffectWrapper r2 = this.edgeEffectWrapper;
        int bits$iv$iv$iv = (int) (size >> 32);
        int width$iv = MathKt.roundToInt(Float.intBitsToFloat(bits$iv$iv$iv));
        int bits$iv$iv$iv2 = (int) (size & 4294967295L);
        int height$iv = MathKt.roundToInt(Float.intBitsToFloat(bits$iv$iv$iv2));
        r2.m288updateSizeozmzZPI(IntSize.m7139constructorimpl((((long) width$iv) << 32) | (4294967295L & ((long) height$iv))));
    L5:
        if (initialSetSize == true) goto L9;
        if (differentSize == false) goto L10;
        animateToReleaseIfNeeded();
        return;
    L10:
        return;
    }

    /* JADX INFO: renamed from: displacement-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m214displacementF1C5BW0$foundation_release() {
        long $this$isSpecified$iv = this.pointerPosition;
        if ((9223372034707292159L & $this$isSpecified$iv) == InlineClassHelperKt.UnspecifiedPackedFloats) goto L5;
        boolean r3 = true;
    L6:
        if (r3 == false) goto L8;
        long pointer = this.pointerPosition;
    L9:
        long value$iv$iv = pointer;
        int bits$iv$iv$iv = (int) (value$iv$iv >> 32);
        float r7 = Float.intBitsToFloat(bits$iv$iv$iv);
        long arg0$iv = this.containerSize;
        int bits$iv$iv$iv2 = (int) (arg0$iv >> 32);
        float x = r7 / Float.intBitsToFloat(bits$iv$iv$iv2);
        long value$iv$iv2 = pointer;
        int bits$iv$iv$iv3 = (int) (value$iv$iv2 & 4294967295L);
        float r10 = Float.intBitsToFloat(bits$iv$iv$iv3);
        long arg0$iv2 = this.containerSize;
        int bits$iv$iv$iv4 = (int) (arg0$iv2 & 4294967295L);
        float y = r10 / Float.intBitsToFloat(bits$iv$iv$iv4);
        long v1$iv$iv = Float.floatToRawIntBits(x);
        long v2$iv$iv = Float.floatToRawIntBits(y);
        return Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    L8:
        pointer = SizeKt.m4204getCenteruvyYCjk(this.containerSize);
        goto L9
    L5:
        r3 = false;
        goto L6
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public DelegatableNode getNode() {
        return this.node;
    }

    public final void invalidateOverscroll$foundation_release() {
        if (this.invalidationEnabled == false) goto L6;
        this.redrawSignal.setValue(Unit.INSTANCE);
        return;
    }

    private final void animateToReleaseIfNeeded() {
        boolean needsInvalidation = false;
        EdgeEffectWrapper this_$iv = this.edgeEffectWrapper;
        EdgeEffect it = EdgeEffectWrapper.access$getTopEffect$p(this_$iv);
        boolean r4 = true;
        if (it == null) goto L5;
        it.onRelease();
        needsInvalidation = !it.isFinished();
    L5:
        EdgeEffect it2 = EdgeEffectWrapper.access$getBottomEffect$p(this_$iv);
        if (it2 == null) goto L14;
        it2.onRelease();
        if (it2.isFinished() == false) goto L12;
        if (needsInvalidation == true) goto L12;
        boolean r7 = false;
    L13:
        needsInvalidation = r7;
    L12:
        r7 = true;
    L14:
        EdgeEffect it3 = EdgeEffectWrapper.access$getLeftEffect$p(this_$iv);
        if (it3 == null) goto L23;
        it3.onRelease();
        if (it3.isFinished() == false) goto L21;
        if (needsInvalidation == true) goto L21;
        boolean r8 = false;
    L22:
        needsInvalidation = r8;
    L21:
        r8 = true;
    L23:
        EdgeEffect it4 = EdgeEffectWrapper.access$getRightEffect$p(this_$iv);
        if (it4 == null) goto L32;
        it4.onRelease();
        if (it4.isFinished() == false) goto L30;
        if (needsInvalidation == true) goto L30;
        r4 = false;
    L30:
        needsInvalidation = r4;
    L32:
        if (needsInvalidation == false) goto L35;
        invalidateOverscroll$foundation_release();
        return;
    }

    /* JADX INFO: renamed from: releaseOppositeOverscroll-k-4lQ0M, reason: not valid java name */
    private final boolean m211releaseOppositeOverscrollk4lQ0M(long delta) {
        boolean needsInvalidation = false;
        if (this.edgeEffectWrapper.isLeftAnimating() == false) goto L7;
        int bits$iv$iv$iv = (int) (delta >> 32);
        if (Float.intBitsToFloat(bits$iv$iv$iv) >= 0.0f) goto L7;
        int bits$iv$iv$iv2 = (int) (delta >> 32);
        EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.edgeEffectWrapper.getOrCreateLeftEffect(), Float.intBitsToFloat(bits$iv$iv$iv2));
        needsInvalidation = this.edgeEffectWrapper.isLeftAnimating();
    L7:
        boolean needsInvalidation2 = false;
        if (this.edgeEffectWrapper.isRightAnimating() == false) goto L20;
        int bits$iv$iv$iv3 = (int) (delta >> 32);
        if (Float.intBitsToFloat(bits$iv$iv$iv3) <= 0.0f) goto L20;
        int bits$iv$iv$iv4 = (int) (delta >> 32);
        EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.edgeEffectWrapper.getOrCreateRightEffect(), Float.intBitsToFloat(bits$iv$iv$iv4));
        if (needsInvalidation == false) goto L14;
    L17:
        boolean r1 = true;
    L18:
        needsInvalidation = r1;
        goto L20
    L14:
        if (this.edgeEffectWrapper.isRightAnimating() == true) goto L17;
        r1 = false;
    L20:
        if (this.edgeEffectWrapper.isTopAnimating() == false) goto L32;
        int bits$iv$iv$iv5 = (int) (delta & 4294967295L);
        if (Float.intBitsToFloat(bits$iv$iv$iv5) >= 0.0f) goto L32;
        int bits$iv$iv$iv6 = (int) (delta & 4294967295L);
        EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.edgeEffectWrapper.getOrCreateTopEffect(), Float.intBitsToFloat(bits$iv$iv$iv6));
        if (needsInvalidation == false) goto L26;
    L29:
        boolean r2 = true;
    L30:
        needsInvalidation = r2;
        goto L32
    L26:
        if (this.edgeEffectWrapper.isTopAnimating() == true) goto L29;
        r2 = false;
    L32:
        if (this.edgeEffectWrapper.isBottomAnimating() == false) goto L42;
        int bits$iv$iv$iv7 = (int) (delta & 4294967295L);
        if (Float.intBitsToFloat(bits$iv$iv$iv7) <= 0.0f) goto L43;
        int bits$iv$iv$iv8 = (int) (4294967295L & delta);
        EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.edgeEffectWrapper.getOrCreateBottomEffect(), Float.intBitsToFloat(bits$iv$iv$iv8));
        if (needsInvalidation == false) goto L38;
    L39:
        needsInvalidation2 = true;
    L41:
        return needsInvalidation2;
    L38:
        if (this.edgeEffectWrapper.isBottomAnimating() == false) goto L41;
    L43:
        return needsInvalidation;
    L42:
        return needsInvalidation;
    }

    /* JADX INFO: renamed from: pullTop-k-4lQ0M, reason: not valid java name */
    private final float m210pullTopk4lQ0M(long scroll) {
        long arg0$iv = m214displacementF1C5BW0$foundation_release();
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);
        float displacementX = Float.intBitsToFloat(bits$iv$iv$iv);
        int bits$iv$iv$iv2 = (int) (scroll & 4294967295L);
        float r7 = Float.intBitsToFloat(bits$iv$iv$iv2);
        long arg0$iv2 = this.containerSize;
        int bits$iv$iv$iv3 = (int) (arg0$iv2 & 4294967295L);
        float pullY = r7 / Float.intBitsToFloat(bits$iv$iv$iv3);
        EdgeEffect topEffect = this.edgeEffectWrapper.getOrCreateTopEffect();
        float r1 = EdgeEffectCompat.INSTANCE.onPullDistanceCompat(topEffect, pullY, displacementX);
        long arg0$iv3 = this.containerSize;
        int bits$iv$iv$iv4 = (int) (arg0$iv3 & 4294967295L);
        float consumed = r1 * Float.intBitsToFloat(bits$iv$iv$iv4);
        if (EdgeEffectCompat.INSTANCE.getDistanceCompat(topEffect) != 0.0f) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == true) goto L9;
        int bits$iv$iv$iv5 = (int) (4294967295L & scroll);
        return Float.intBitsToFloat(bits$iv$iv$iv5);
    L9:
        return consumed;
    L5:
        r2 = false;
        goto L6
    }

    /* JADX INFO: renamed from: pullBottom-k-4lQ0M, reason: not valid java name */
    private final float m207pullBottomk4lQ0M(long scroll) {
        long arg0$iv = m214displacementF1C5BW0$foundation_release();
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);
        float displacementX = Float.intBitsToFloat(bits$iv$iv$iv);
        int bits$iv$iv$iv2 = (int) (scroll & 4294967295L);
        float r7 = Float.intBitsToFloat(bits$iv$iv$iv2);
        long arg0$iv2 = this.containerSize;
        int bits$iv$iv$iv3 = (int) (arg0$iv2 & 4294967295L);
        float pullY = r7 / Float.intBitsToFloat(bits$iv$iv$iv3);
        EdgeEffect bottomEffect = this.edgeEffectWrapper.getOrCreateBottomEffect();
        float r1 = -EdgeEffectCompat.INSTANCE.onPullDistanceCompat(bottomEffect, -pullY, 1.0f - displacementX);
        long arg0$iv3 = this.containerSize;
        int bits$iv$iv$iv4 = (int) (arg0$iv3 & 4294967295L);
        float consumed = r1 * Float.intBitsToFloat(bits$iv$iv$iv4);
        if (EdgeEffectCompat.INSTANCE.getDistanceCompat(bottomEffect) != 0.0f) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == true) goto L9;
        int bits$iv$iv$iv5 = (int) (4294967295L & scroll);
        return Float.intBitsToFloat(bits$iv$iv$iv5);
    L9:
        return consumed;
    L5:
        r2 = false;
        goto L6
    }

    /* JADX INFO: renamed from: pullLeft-k-4lQ0M, reason: not valid java name */
    private final float m208pullLeftk4lQ0M(long scroll) {
        long arg0$iv = m214displacementF1C5BW0$foundation_release();
        int bits$iv$iv$iv = (int) (4294967295L & arg0$iv);
        float displacementY = Float.intBitsToFloat(bits$iv$iv$iv);
        int bits$iv$iv$iv2 = (int) (scroll >> 32);
        float r5 = Float.intBitsToFloat(bits$iv$iv$iv2);
        long arg0$iv2 = this.containerSize;
        int bits$iv$iv$iv3 = (int) (arg0$iv2 >> 32);
        float pullX = r5 / Float.intBitsToFloat(bits$iv$iv$iv3);
        EdgeEffect leftEffect = this.edgeEffectWrapper.getOrCreateLeftEffect();
        float r1 = EdgeEffectCompat.INSTANCE.onPullDistanceCompat(leftEffect, pullX, 1.0f - displacementY);
        long arg0$iv3 = this.containerSize;
        int bits$iv$iv$iv4 = (int) (arg0$iv3 >> 32);
        float consumed = r1 * Float.intBitsToFloat(bits$iv$iv$iv4);
        if (EdgeEffectCompat.INSTANCE.getDistanceCompat(leftEffect) != 0.0f) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == true) goto L9;
        int bits$iv$iv$iv5 = (int) (scroll >> 32);
        return Float.intBitsToFloat(bits$iv$iv$iv5);
    L9:
        return consumed;
    L5:
        r2 = false;
        goto L6
    }

    /* JADX INFO: renamed from: pullRight-k-4lQ0M, reason: not valid java name */
    private final float m209pullRightk4lQ0M(long scroll) {
        long arg0$iv = m214displacementF1C5BW0$foundation_release();
        int bits$iv$iv$iv = (int) (4294967295L & arg0$iv);
        float displacementY = Float.intBitsToFloat(bits$iv$iv$iv);
        int bits$iv$iv$iv2 = (int) (scroll >> 32);
        float r5 = Float.intBitsToFloat(bits$iv$iv$iv2);
        long arg0$iv2 = this.containerSize;
        int bits$iv$iv$iv3 = (int) (arg0$iv2 >> 32);
        float pullX = r5 / Float.intBitsToFloat(bits$iv$iv$iv3);
        EdgeEffect rightEffect = this.edgeEffectWrapper.getOrCreateRightEffect();
        float r1 = -EdgeEffectCompat.INSTANCE.onPullDistanceCompat(rightEffect, -pullX, displacementY);
        long arg0$iv3 = this.containerSize;
        int bits$iv$iv$iv4 = (int) (arg0$iv3 >> 32);
        float consumed = r1 * Float.intBitsToFloat(bits$iv$iv$iv4);
        if (EdgeEffectCompat.INSTANCE.getDistanceCompat(rightEffect) != 0.0f) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == true) goto L9;
        int bits$iv$iv$iv5 = (int) (scroll >> 32);
        return Float.intBitsToFloat(bits$iv$iv$iv5);
    L9:
        return consumed;
    L5:
        r2 = false;
        goto L6
    }
}
