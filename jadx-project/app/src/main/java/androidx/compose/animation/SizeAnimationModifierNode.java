package androidx.compose.animation;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: AnimationModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001:\u0001>BY\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012:\b\u0002\u0010\u0007\u001a4\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\b¢\u0006\u0002\u0010\u000eJ\u0018\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b/\u00100J\b\u00101\u001a\u00020\rH\u0016J\b\u00102\u001a\u00020\rH\u0016J\u001a\u00103\u001a\u00020%2\u0006\u00104\u001a\u00020%H\u0002ø\u0001\u0000¢\u0006\u0004\b5\u00100J&\u00106\u001a\u000207*\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020%H\u0016ø\u0001\u0000¢\u0006\u0004\b<\u0010=R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R/\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fRL\u0010\u0007\u001a4\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R&\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020%@BX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010)\"\u0004\b'\u0010(R\u000e\u0010*\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010,\u001a\u00020\u0004X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010)\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006?"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifierNode;", "Landroidx/compose/animation/LayoutModifierNodeWithPassThroughIntrinsics;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/ui/unit/IntSize;", "alignment", "Landroidx/compose/ui/Alignment;", "listener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "startSize", "endSize", "", "(Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function2;)V", "getAlignment", "()Landroidx/compose/ui/Alignment;", "setAlignment", "(Landroidx/compose/ui/Alignment;)V", "<set-?>", "Landroidx/compose/animation/SizeAnimationModifierNode$AnimData;", "animData", "getAnimData", "()Landroidx/compose/animation/SizeAnimationModifierNode$AnimData;", "setAnimData", "(Landroidx/compose/animation/SizeAnimationModifierNode$AnimData;)V", "animData$delegate", "Landroidx/compose/runtime/MutableState;", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "setAnimationSpec", "(Landroidx/compose/animation/core/AnimationSpec;)V", "getListener", "()Lkotlin/jvm/functions/Function2;", "setListener", "(Lkotlin/jvm/functions/Function2;)V", "value", "Landroidx/compose/ui/unit/Constraints;", "lookaheadConstraints", "setLookaheadConstraints-BRTryo0", "(J)V", "J", "lookaheadConstraintsAvailable", "", "lookaheadSize", "animateTo", "targetSize", "animateTo-mzRDjE0", "(J)J", "onAttach", "onReset", "targetConstraints", "default", "targetConstraints-ZezNO4M", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "AnimData", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class SizeAnimationModifierNode extends LayoutModifierNodeWithPassThroughIntrinsics {
    private Alignment alignment;
    private final MutableState animData$delegate;
    private AnimationSpec<IntSize> animationSpec;
    private Function2<? super IntSize, ? super IntSize, Unit> listener;
    private long lookaheadConstraints;
    private boolean lookaheadConstraintsAvailable;
    private long lookaheadSize;

    /* JADX INFO: compiled from: AnimationModifier.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007J\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0016\u0010\u0010\u001a\u00020\u0004HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000bJ3\u0010\u0012\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\"\u0010\u0006\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifierNode$AnimData;", "", "anim", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "startSize", "(Landroidx/compose/animation/core/Animatable;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAnim", "()Landroidx/compose/animation/core/Animatable;", "getStartSize-YbymL2g", "()J", "setStartSize-ozmzZPI", "(J)V", "J", "component1", "component2", "component2-YbymL2g", "copy", "copy-O0kMr_c", "(Landroidx/compose/animation/core/Animatable;J)Landroidx/compose/animation/SizeAnimationModifierNode$AnimData;", "equals", "", "other", "hashCode", "", "toString", "", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnimData {
        public static final int $stable = 0;
        private final Animatable<IntSize, AnimationVector2D> anim;
        private long startSize;

        static {
            $stable = 8;
        }

        public /* synthetic */ AnimData(Animatable r1, long r2, DefaultConstructorMarker r4) {
            this(r1, r2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: copy-O0kMr_c$default, reason: not valid java name */
        public static /* synthetic */ AnimData m116copyO0kMr_c$default(AnimData r0, Animatable r1, long r2, int r4, Object r5) {
            if ((r4 & 1) == 0) goto L6;
            r1 = r0.anim;
        L6:
            if ((r4 & 2) == 0) goto L9;
            r2 = r0.startSize;
        L9:
            return r0.m118copyO0kMr_c(r1, r2);
        }

        public final Animatable<IntSize, AnimationVector2D> component1() {
            return this.anim;
        }

        /* JADX INFO: renamed from: component2-YbymL2g, reason: not valid java name */
        public final long m117component2YbymL2g() {
            return this.startSize;
        }

        /* JADX INFO: renamed from: copy-O0kMr_c, reason: not valid java name */
        public final AnimData m118copyO0kMr_c(Animatable<IntSize, AnimationVector2D> r3, long r4) {
            return new AnimData(r3, r4, null);
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof AnimData) == true) goto L8;
            return false;
        L8:
            AnimData r1 = (AnimData) r8;
            if (Intrinsics.areEqual(this.anim, r1.anim) == true) goto L12;
            return false;
        L12:
            if (IntSize.m7142equalsimpl0(this.startSize, r1.startSize) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.anim.hashCode() * 31) + IntSize.m7145hashCodeimpl(this.startSize);
        }

        public String toString() {
            return "AnimData(anim=" + this.anim + ", startSize=" + IntSize.m7147toStringimpl(this.startSize) + ')';
        }

        private AnimData(Animatable<IntSize, AnimationVector2D> r1, long startSize) {
            this.anim = r1;
            this.startSize = startSize;
        }

        public final Animatable<IntSize, AnimationVector2D> getAnim() {
            return this.anim;
        }

        /* JADX INFO: renamed from: getStartSize-YbymL2g, reason: not valid java name */
        public final long m119getStartSizeYbymL2g() {
            return this.startSize;
        }

        /* JADX INFO: renamed from: setStartSize-ozmzZPI, reason: not valid java name */
        public final void m120setStartSizeozmzZPI(long r1) {
            this.startSize = r1;
        }
    }

    public /* synthetic */ SizeAnimationModifierNode(AnimationSpec r1, Alignment r2, Function2 r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = Alignment.Companion.getTopStart();
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = null;
    L8:
        this(r1, r2, r3);
    }

    public final AnimationSpec<IntSize> getAnimationSpec() {
        return this.animationSpec;
    }

    public final void setAnimationSpec(AnimationSpec<IntSize> r1) {
        this.animationSpec = r1;
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final void setAlignment(Alignment r1) {
        this.alignment = r1;
    }

    public final Function2<IntSize, IntSize, Unit> getListener() {
        return this.listener;
    }

    public final void setListener(Function2<? super IntSize, ? super IntSize, Unit> r1) {
        this.listener = r1;
    }

    public SizeAnimationModifierNode(AnimationSpec<IntSize> r9, Alignment alignment, Function2<? super IntSize, ? super IntSize, Unit> r11) {
        this.animationSpec = r9;
        this.alignment = alignment;
        this.listener = r11;
        this.lookaheadSize = AnimationModifierKt.getInvalidSize();
        this.lookaheadConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.animData$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX INFO: renamed from: setLookaheadConstraints-BRTryo0, reason: not valid java name */
    private final void m113setLookaheadConstraintsBRTryo0(long value) {
        this.lookaheadConstraints = value;
        this.lookaheadConstraintsAvailable = true;
    }

    /* JADX INFO: renamed from: targetConstraints-ZezNO4M, reason: not valid java name */
    private final long m114targetConstraintsZezNO4M(long r3) {
        if (this.lookaheadConstraintsAvailable == false) goto L6;
        return this.lookaheadConstraints;
    L6:
        return r3;
    }

    public final AnimData getAnimData() {
        State $this$getValue$iv = this.animData$delegate;
        return (AnimData) $this$getValue$iv.getValue();
    }

    public final void setAnimData(AnimData r4) {
        MutableState $this$setValue$iv = this.animData$delegate;
        $this$setValue$iv.setValue(r4);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        super.onReset();
        setAnimData(null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        this.lookaheadSize = AnimationModifierKt.getInvalidSize();
        this.lookaheadConstraintsAvailable = false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo60measure3p2s80s(final MeasureScope $this$measure_u2d3p2s80s, Measurable measurable, long constraints) {
        if ($this$measure_u2d3p2s80s.isLookingAhead() == false) goto L5;
        m113setLookaheadConstraintsBRTryo0(constraints);
        final Placeable placeable = measurable.mo5714measureBRTryo0(constraints);
    L6:
        int width$iv = placeable.getWidth();
        int height$iv = placeable.getHeight();
        final long measuredSize = IntSize.m7139constructorimpl((((long) width$iv) << 32) | (((long) height$iv) & 4294967295L));
        if ($this$measure_u2d3p2s80s.isLookingAhead() == false) goto L10;
        this.lookaheadSize = measuredSize;
        long value$iv$iv$iv = measuredSize;
    L14:
        final int width = (int) (value$iv$iv$iv >> 32);
        final int height = (int) (value$iv$iv$iv & 4294967295L);
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, width, height, null, new SizeAnimationModifierNode$measure$2(this, measuredSize, width, height, $this$measure_u2d3p2s80s, placeable), 4, null);
    L10:
        if (AnimationModifierKt.m64isValidozmzZPI(this.lookaheadSize) == false) goto L12;
        long r4 = this.lookaheadSize;
    L13:
        long it = m115animateTomzRDjE0(r4);
        value$iv$iv$iv = ConstraintsKt.m6940constrain4WqzIAM(constraints, it);
        goto L14
    L12:
        r4 = measuredSize;
        goto L13
    L5:
        placeable = measurable.mo5714measureBRTryo0(m114targetConstraintsZezNO4M(constraints));
        goto L6
    }

    /* JADX INFO: renamed from: animateTo-mzRDjE0, reason: not valid java name */
    public final long m115animateTomzRDjE0(long targetSize) {
        AnimData data = getAnimData();
        if (data != null) goto L5;
        data = new AnimData(new Animatable(IntSize.m7136boximpl(targetSize), VectorConvertersKt.getVectorConverter(IntSize.Companion), IntSize.m7136boximpl(IntSize.m7139constructorimpl((((long) 1) << 32) | (((long) 1) & 4294967295L))), null, 8, null), targetSize, null);
    L16:
        setAnimData(data);
        return data.getAnim().getValue().m7148unboximpl();
    L5:
        if (IntSize.m7142equalsimpl0(targetSize, data.getAnim().getValue().m7148unboximpl()) == false) goto L7;
    L9:
        boolean r0 = false;
    L10:
        boolean wasInterrupted = r0;
        if (IntSize.m7142equalsimpl0(targetSize, data.getAnim().getTargetValue().m7148unboximpl()) == false) goto L13;
        if (wasInterrupted == false) goto L16;
    L13:
        data.m120setStartSizeozmzZPI(data.getAnim().getValue().m7148unboximpl());
        BuildersKt.launch$default(getCoroutineScope(), null, null, new SizeAnimationModifierNode$animateTo$data$1$1(data, targetSize, this, null), 3, null);
        goto L16
    L7:
        if (data.getAnim().isRunning() == true) goto L9;
        r0 = true;
        goto L10
    }
}
