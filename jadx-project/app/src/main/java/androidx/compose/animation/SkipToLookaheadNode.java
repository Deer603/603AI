package androidx.compose.animation;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SkipToLookaheadNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u001c\u0010\u0019\u001a\u00020\u001a*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001aH\u0016J\u001c\u0010\u001f\u001a\u00020\u001a*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001aH\u0016J&\u0010!\u001a\u00020\"*\u00020#2\u0006\u0010\u001c\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u001c\u0010(\u001a\u00020\u001a*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001aH\u0016J\u001c\u0010)\u001a\u00020\u001a*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001aH\u0016R7\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0005\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\u00020\u0012X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0013R/\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/animation/SkipToLookaheadNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "scaleToBounds", "Landroidx/compose/animation/ScaleToBoundsImpl;", "isEnabled", "Lkotlin/Function0;", "", "(Landroidx/compose/animation/ScaleToBoundsImpl;Lkotlin/jvm/functions/Function0;)V", "<set-?>", "()Lkotlin/jvm/functions/Function0;", "setEnabled", "(Lkotlin/jvm/functions/Function0;)V", "isEnabled$delegate", "Landroidx/compose/runtime/MutableState;", "lookaheadConstraints", "Landroidx/compose/ui/unit/Constraints;", "lookaheadSize", "Landroidx/compose/ui/unit/IntSize;", "J", "getScaleToBounds", "()Landroidx/compose/animation/ScaleToBoundsImpl;", "setScaleToBounds", "(Landroidx/compose/animation/ScaleToBoundsImpl;)V", "scaleToBounds$delegate", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SkipToLookaheadNode extends Modifier.Node implements LayoutModifierNode {
    public static final int $stable = 0;
    private final MutableState isEnabled$delegate;
    private Constraints lookaheadConstraints;
    private long lookaheadSize;
    private final MutableState scaleToBounds$delegate;

    static {
        $stable = 8;
    }

    public static final /* synthetic */ long access$getLookaheadSize$p(SkipToLookaheadNode $this) {
        return $this.lookaheadSize;
    }

    public SkipToLookaheadNode(ScaleToBoundsImpl scaleToBounds, Function0<Boolean> r5) {
        this.scaleToBounds$delegate = SnapshotStateKt.mutableStateOf$default(scaleToBounds, null, 2, null);
        this.isEnabled$delegate = SnapshotStateKt.mutableStateOf$default(r5, null, 2, null);
        this.lookaheadSize = AnimationModifierKt.getInvalidSize();
    }

    public final ScaleToBoundsImpl getScaleToBounds() {
        State $this$getValue$iv = this.scaleToBounds$delegate;
        return (ScaleToBoundsImpl) $this$getValue$iv.getValue();
    }

    public final void setScaleToBounds(ScaleToBoundsImpl r4) {
        MutableState $this$setValue$iv = this.scaleToBounds$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final Function0<Boolean> isEnabled() {
        State $this$getValue$iv = this.isEnabled$delegate;
        return (Function0) $this$getValue$iv.getValue();
    }

    public final void setEnabled(Function0<Boolean> r4) {
        MutableState $this$setValue$iv = this.isEnabled$delegate;
        $this$setValue$iv.setValue(r4);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo60measure3p2s80s(final MeasureScope $this$measure_u2d3p2s80s, Measurable measurable, long constraints) {
        if ($this$measure_u2d3p2s80s.isLookingAhead() == false) goto L5;
        this.lookaheadConstraints = Constraints.m6913boximpl(constraints);
    L5:
        Constraints r0 = this.lookaheadConstraints;
        Intrinsics.checkNotNull(r0);
        final Placeable p = measurable.mo5714measureBRTryo0(r0.m6932unboximpl());
        int width$iv = p.getWidth();
        int height$iv = p.getHeight();
        this.lookaheadSize = IntSize.m7139constructorimpl((((long) width$iv) << 32) | (((long) height$iv) & 4294967295L));
        final long constrainedSize = ConstraintsKt.m6940constrain4WqzIAM(constraints, this.lookaheadSize);
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, (int) (constrainedSize >> 32), (int) (4294967295L & constrainedSize), null, new SkipToLookaheadNode$measure$1(this, p, constrainedSize, $this$measure_u2d3p2s80s), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope $this$maxIntrinsicWidth, IntrinsicMeasurable measurable, int height) {
        if ($this$maxIntrinsicWidth.isLookingAhead() == true) goto L8;
        if (AnimationModifierKt.m64isValidozmzZPI(this.lookaheadSize) == false) goto L8;
        long arg0$iv = this.lookaheadSize;
        return (int) (arg0$iv >> 32);
    L8:
        return measurable.maxIntrinsicWidth(height);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope $this$minIntrinsicWidth, IntrinsicMeasurable measurable, int height) {
        if ($this$minIntrinsicWidth.isLookingAhead() == true) goto L8;
        if (AnimationModifierKt.m64isValidozmzZPI(this.lookaheadSize) == false) goto L8;
        long arg0$iv = this.lookaheadSize;
        return (int) (arg0$iv >> 32);
    L8:
        return measurable.minIntrinsicWidth(height);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope $this$maxIntrinsicHeight, IntrinsicMeasurable measurable, int width) {
        if ($this$maxIntrinsicHeight.isLookingAhead() == true) goto L8;
        if (AnimationModifierKt.m64isValidozmzZPI(this.lookaheadSize) == false) goto L8;
        long arg0$iv = this.lookaheadSize;
        return (int) (4294967295L & arg0$iv);
    L8:
        return measurable.maxIntrinsicHeight(width);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope $this$minIntrinsicHeight, IntrinsicMeasurable measurable, int width) {
        if ($this$minIntrinsicHeight.isLookingAhead() == true) goto L8;
        if (AnimationModifierKt.m64isValidozmzZPI(this.lookaheadSize) == false) goto L8;
        long arg0$iv = this.lookaheadSize;
        return (int) (4294967295L & arg0$iv);
    L8:
        return measurable.minIntrinsicHeight(width);
    }
}
