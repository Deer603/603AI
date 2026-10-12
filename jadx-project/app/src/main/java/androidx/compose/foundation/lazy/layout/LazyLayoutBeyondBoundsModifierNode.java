package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 42\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u00014B%\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\"\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010\u0019\u001a\u0004\u0018\u0001H\u001a\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u0015\u001a\u00020\u00162\u0019\u0010\u001b\u001a\u0015\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u0001H\u001a0\u001c¢\u0006\u0002\b\u001eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J&\u0010!\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u001e\u0010#\u001a\u00020\n*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\u00020\n*\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0016\u0010)\u001a\u00020\n*\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b*\u0010(J&\u0010+\u001a\u00020,*\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016ø\u0001\u0000¢\u0006\u0004\b2\u00103R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/layout/BeyondBoundsLayout;", "Landroidx/compose/ui/node/LayoutModifierNode;", "state", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "reverseLayout", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;ZLandroidx/compose/foundation/gestures/Orientation;)V", "providedValues", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "getProvidedValues", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "addNextInterval", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;", "currentInterval", "direction", "Landroidx/compose/ui/layout/BeyondBoundsLayout$LayoutDirection;", "addNextInterval-FR3nfPY", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;", "layout", "T", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "Lkotlin/ExtensionFunctionType;", "layout-o7g1Pn8", "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "update", "", "hasMoreContent", "hasMoreContent-FR3nfPY", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;I)Z", "isForward", "isForward-4vf7U8o", "(I)Z", "isOppositeToOrientation", "isOppositeToOrientation-4vf7U8o", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LazyLayoutBeyondBoundsModifierNode extends Modifier.Node implements ModifierLocalModifierNode, BeyondBoundsLayout, LayoutModifierNode {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final LazyLayoutBeyondBoundsModifierNode$Companion$emptyBeyondBoundsScope$1 emptyBeyondBoundsScope = null;
    private LazyLayoutBeyondBoundsInfo beyondBoundsInfo;
    private Orientation orientation;
    private boolean reverseLayout;
    private LazyLayoutBeyondBoundsState state;

    /* JADX INFO: compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierNode$Companion;", "", "()V", "emptyBeyondBoundsScope", "androidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierNode$Companion$emptyBeyondBoundsScope$1", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierNode$Companion$emptyBeyondBoundsScope$1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[LayoutDirection.values().length];
            r0[LayoutDirection.Ltr.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L11:
            r0[LayoutDirection.Rtl.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L9:
            $EnumSwitchMapping$0 = r0;
        }
    }

    /* JADX INFO: renamed from: access$hasMoreContent-FR3nfPY, reason: not valid java name */
    public static final /* synthetic */ boolean m876access$hasMoreContentFR3nfPY(LazyLayoutBeyondBoundsModifierNode $this, LazyLayoutBeyondBoundsInfo.Interval $receiver, int direction) {
        return $this.m878hasMoreContentFR3nfPY($receiver, direction);
    }

    public LazyLayoutBeyondBoundsModifierNode(LazyLayoutBeyondBoundsState state, LazyLayoutBeyondBoundsInfo beyondBoundsInfo, boolean reverseLayout, Orientation orientation) {
        this.state = state;
        this.beyondBoundsInfo = beyondBoundsInfo;
        this.reverseLayout = reverseLayout;
        this.orientation = orientation;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo60measure3p2s80s(MeasureScope $this$measure_u2d3p2s80s, Measurable measurable, long constraints) {
        final Placeable placeable = measurable.mo5714measureBRTryo0(constraints);
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, placeable.getWidth(), placeable.getHeight(), null, new LazyLayoutBeyondBoundsModifierNode$measure$1(placeable), 4, null);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public ModifierLocalMap getProvidedValues() {
        return ModifierLocalModifierNodeKt.modifierLocalMapOf(TuplesKt.to(BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout(), this));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierNode$Companion$emptyBeyondBoundsScope$1] */
    static {
        Companion = new Companion(null);
        $stable = 8;
        emptyBeyondBoundsScope = new LazyLayoutBeyondBoundsModifierNode$Companion$emptyBeyondBoundsScope$1();
    }

    @Override // androidx.compose.ui.layout.BeyondBoundsLayout
    /* JADX INFO: renamed from: layout-o7g1Pn8, reason: not valid java name */
    public <T> T mo881layouto7g1Pn8(final int r11, Function1<? super BeyondBoundsLayout.BeyondBoundsScope, ? extends T> r12) {
        if (this.state.getItemCount() <= 0) goto L22;
        if (this.state.getHasVisibleItems() == false) goto L22;
        if (isAttached() == false) goto L22;
        boolean r0 = m879isForward4vf7U8o(r11);
        LazyLayoutBeyondBoundsState r1 = this.state;
        if (r0 == false) goto L12;
        int r2 = r1.getLastPlacedIndex();
    L13:
        final Ref.ObjectRef r3 = new Ref.ObjectRef();
        r3.element = (T) this.beyondBoundsInfo.addInterval(r2, r2);
        T r4 = null;
        int r5 = RangesKt.coerceAtMost(this.state.itemsPerViewport() * 2, this.state.getItemCount());
        int r6 = 0;
    L14:
        if (r4 != null) goto L19;
        if (m878hasMoreContentFR3nfPY((LazyLayoutBeyondBoundsInfo.Interval) r3.element, r11) == false) goto L19;
        if (r6 >= r5) goto L19;
        T r7 = (T) m877addNextIntervalFR3nfPY((LazyLayoutBeyondBoundsInfo.Interval) r3.element, r11);
        this.beyondBoundsInfo.removeInterval((LazyLayoutBeyondBoundsInfo.Interval) r3.element);
        r3.element = r7;
        r6 = r6 + 1;
        LayoutModifierNodeKt.remeasureSync(this);
        r4 = r12.invoke(new LazyLayoutBeyondBoundsModifierNode$layout$2(this, r3, r11));
    L19:
        this.beyondBoundsInfo.removeInterval((LazyLayoutBeyondBoundsInfo.Interval) r3.element);
        LayoutModifierNodeKt.remeasureSync(this);
        return r4;
    L12:
        r2 = r1.getFirstPlacedIndex();
    L22:
        return r12.invoke(emptyBeyondBoundsScope);
    }

    /* JADX INFO: renamed from: isForward-4vf7U8o, reason: not valid java name */
    private final boolean m879isForward4vf7U8o(int $this$isForward_u2d4vf7U8o) {
        if (BeyondBoundsLayout.LayoutDirection.m5696equalsimpl0($this$isForward_u2d4vf7U8o, BeyondBoundsLayout.LayoutDirection.Companion.m5702getBeforehoxUOeE()) == false) goto L6;
        return false;
    L6:
        if (BeyondBoundsLayout.LayoutDirection.m5696equalsimpl0($this$isForward_u2d4vf7U8o, BeyondBoundsLayout.LayoutDirection.Companion.m5701getAfterhoxUOeE()) == false) goto L9;
        return true;
    L9:
        if (BeyondBoundsLayout.LayoutDirection.m5696equalsimpl0($this$isForward_u2d4vf7U8o, BeyondBoundsLayout.LayoutDirection.Companion.m5700getAbovehoxUOeE()) == false) goto L12;
        return this.reverseLayout;
    L12:
        if (BeyondBoundsLayout.LayoutDirection.m5696equalsimpl0($this$isForward_u2d4vf7U8o, BeyondBoundsLayout.LayoutDirection.Companion.m5703getBelowhoxUOeE()) == false) goto L17;
        if (this.reverseLayout == false) goto L42;
        return false;
    L42:
        return true;
    L17:
        if (BeyondBoundsLayout.LayoutDirection.m5696equalsimpl0($this$isForward_u2d4vf7U8o, BeyondBoundsLayout.LayoutDirection.Companion.m5704getLefthoxUOeE()) == false) goto L27;
        LayoutDirection r0 = DelegatableNodeKt.requireLayoutDirection(this);
        switch(WhenMappings.$EnumSwitchMapping$0[r0.ordinal()]) {
            case 1: goto L45;
            case 2: goto L23;
            default: goto L21;
        };
    L21:
        throw new NoWhenBranchMatchedException();
    L23:
        if (this.reverseLayout == false) goto L44;
        return false;
    L44:
        return true;
    L45:
        return this.reverseLayout;
    L27:
        if (BeyondBoundsLayout.LayoutDirection.m5696equalsimpl0($this$isForward_u2d4vf7U8o, BeyondBoundsLayout.LayoutDirection.Companion.m5705getRighthoxUOeE()) == false) goto L37;
        LayoutDirection r1 = DelegatableNodeKt.requireLayoutDirection(this);
        switch(WhenMappings.$EnumSwitchMapping$0[r1.ordinal()]) {
            case 1: goto L34;
            case 2: goto L46;
            default: goto L31;
        };
    L31:
        throw new NoWhenBranchMatchedException();
    L46:
        return this.reverseLayout;
    L34:
        if (this.reverseLayout == false) goto L36;
        return false;
    L36:
        return true;
    L37:
        LazyLayoutBeyondBoundsModifierLocalKt.access$unsupportedDirection();
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: addNextInterval-FR3nfPY, reason: not valid java name */
    private final LazyLayoutBeyondBoundsInfo.Interval m877addNextIntervalFR3nfPY(LazyLayoutBeyondBoundsInfo.Interval currentInterval, int direction) {
        int start = currentInterval.getStart();
        int end = currentInterval.getEnd();
        if (m879isForward4vf7U8o(direction) == false) goto L5;
        end = end + 1;
    L7:
        return this.beyondBoundsInfo.addInterval(start, end);
    L5:
        start = start - 1;
        goto L7
    }

    /* JADX INFO: renamed from: hasMoreContent-FR3nfPY, reason: not valid java name */
    private final boolean m878hasMoreContentFR3nfPY(LazyLayoutBeyondBoundsInfo.Interval $this$hasMoreContent_u2dFR3nfPY, int direction) {
        if (m880isOppositeToOrientation4vf7U8o(direction) == false) goto L6;
        return false;
    L6:
        if (m879isForward4vf7U8o(direction) == false) goto L11;
        if ($this$hasMoreContent_u2dFR3nfPY.getEnd() < (this.state.getItemCount() - 1)) goto L13;
        return false;
    L13:
        return true;
    L11:
        if ($this$hasMoreContent_u2dFR3nfPY.getStart() > 0) goto L13;
        return false;
    }

    /* JADX INFO: renamed from: isOppositeToOrientation-4vf7U8o, reason: not valid java name */
    private final boolean m880isOppositeToOrientation4vf7U8o(int $this$isOppositeToOrientation_u2d4vf7U8o) {
        boolean r1 = true;
        if (BeyondBoundsLayout.LayoutDirection.m5696equalsimpl0($this$isOppositeToOrientation_u2d4vf7U8o, BeyondBoundsLayout.LayoutDirection.Companion.m5700getAbovehoxUOeE()) == false) goto L5;
        boolean r0 = true;
    L7:
        if (r0 == false) goto L13;
        if (this.orientation != Orientation.Horizontal) goto L30;
        return true;
    L30:
        return false;
    L13:
        if (BeyondBoundsLayout.LayoutDirection.m5696equalsimpl0($this$isOppositeToOrientation_u2d4vf7U8o, BeyondBoundsLayout.LayoutDirection.Companion.m5704getLefthoxUOeE()) == false) goto L15;
        boolean r2 = true;
    L16:
        if (r2 == false) goto L22;
        if (this.orientation != Orientation.Vertical) goto L31;
        return true;
    L31:
        return false;
    L22:
        if (BeyondBoundsLayout.LayoutDirection.m5696equalsimpl0($this$isOppositeToOrientation_u2d4vf7U8o, BeyondBoundsLayout.LayoutDirection.Companion.m5702getBeforehoxUOeE()) == true) goto L25;
        r1 = BeyondBoundsLayout.LayoutDirection.m5696equalsimpl0($this$isOppositeToOrientation_u2d4vf7U8o, BeyondBoundsLayout.LayoutDirection.Companion.m5701getAfterhoxUOeE());
    L25:
        if (r1 == true) goto L27;
        LazyLayoutBeyondBoundsModifierLocalKt.access$unsupportedDirection();
        throw new KotlinNothingValueException();
    L27:
        return false;
    L15:
        r2 = BeyondBoundsLayout.LayoutDirection.m5696equalsimpl0($this$isOppositeToOrientation_u2d4vf7U8o, BeyondBoundsLayout.LayoutDirection.Companion.m5705getRighthoxUOeE());
        goto L16
    L5:
        r0 = BeyondBoundsLayout.LayoutDirection.m5696equalsimpl0($this$isOppositeToOrientation_u2d4vf7U8o, BeyondBoundsLayout.LayoutDirection.Companion.m5703getBelowhoxUOeE());
        goto L7
    }

    public final void update(LazyLayoutBeyondBoundsState state, LazyLayoutBeyondBoundsInfo beyondBoundsInfo, boolean reverseLayout, Orientation orientation) {
        this.state = state;
        this.beyondBoundsInfo = beyondBoundsInfo;
        this.reverseLayout = reverseLayout;
        this.orientation = orientation;
    }
}
