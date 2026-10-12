package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ&\u0010\u001f\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016ø\u0001\u0000¢\u0006\u0004\b&\u0010'R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/material3/TabIndicatorOffsetNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "tabPositionsState", "Landroidx/compose/runtime/State;", "", "Landroidx/compose/material3/TabPosition;", "selectedTabIndex", "", "followContentSize", "", "(Landroidx/compose/runtime/State;IZ)V", "getFollowContentSize", "()Z", "setFollowContentSize", "(Z)V", "initialOffset", "Landroidx/compose/ui/unit/Dp;", "initialWidth", "offsetAnimatable", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "getSelectedTabIndex", "()I", "setSelectedTabIndex", "(I)V", "getTabPositionsState", "()Landroidx/compose/runtime/State;", "setTabPositionsState", "(Landroidx/compose/runtime/State;)V", "widthAnimatable", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TabIndicatorOffsetNode extends Modifier.Node implements LayoutModifierNode {
    public static final int $stable = 0;
    private boolean followContentSize;
    private Dp initialOffset;
    private Dp initialWidth;
    private Animatable<Dp, AnimationVector1D> offsetAnimatable;
    private int selectedTabIndex;
    private State<? extends List<TabPosition>> tabPositionsState;
    private Animatable<Dp, AnimationVector1D> widthAnimatable;

    static {
        $stable = 8;
    }

    public final State<List<TabPosition>> getTabPositionsState() {
        return this.tabPositionsState;
    }

    public final void setTabPositionsState(State<? extends List<TabPosition>> r1) {
        this.tabPositionsState = r1;
    }

    public final int getSelectedTabIndex() {
        return this.selectedTabIndex;
    }

    public final void setSelectedTabIndex(int r1) {
        this.selectedTabIndex = r1;
    }

    public final boolean getFollowContentSize() {
        return this.followContentSize;
    }

    public final void setFollowContentSize(boolean r1) {
        this.followContentSize = r1;
    }

    public TabIndicatorOffsetNode(State<? extends List<TabPosition>> r1, int selectedTabIndex, boolean followContentSize) {
        this.tabPositionsState = r1;
        this.selectedTabIndex = selectedTabIndex;
        this.followContentSize = followContentSize;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo60measure3p2s80s(final MeasureScope $this$measure_u2d3p2s80s, Measurable measurable, long constraints) {
        if (this.tabPositionsState.getValue().isEmpty() == true) goto L5;
        boolean r2 = this.followContentSize;
        State<? extends List<TabPosition>> r3 = this.tabPositionsState;
        if (r2 == false) goto L9;
        float r4 = r3.getValue().get(this.selectedTabIndex).m2709getContentWidthD9Ej5fM();
    L10:
        float currentTabWidth = r4;
        if (this.initialWidth == null) goto L18;
        Animatable<Dp, AnimationVector1D> r5 = this.widthAnimatable;
        if (r5 != null) goto L16;
        Dp r10 = this.initialWidth;
        Intrinsics.checkNotNull(r10);
        Object r12 = null;
        String r13 = null;
        r5 = new Animatable(r10, VectorConvertersKt.getVectorConverter(Dp.Companion), r12, r13, 12, null);
        this.widthAnimatable = r5;
    L16:
        if (Dp.m6978equalsimpl0(currentTabWidth, r5.getTargetValue().m6987unboximpl()) == true) goto L19;
        BuildersKt.launch$default(getCoroutineScope(), null, null, new TabIndicatorOffsetNode$measure$2(r5, currentTabWidth, null), 3, null);
    L19:
        float indicatorOffset = this.tabPositionsState.getValue().get(this.selectedTabIndex).m2710getLeftD9Ej5fM();
        if (this.initialOffset == null) goto L27;
        Animatable<Dp, AnimationVector1D> r6 = this.offsetAnimatable;
        if (r6 != null) goto L25;
        Dp r11 = this.initialOffset;
        Intrinsics.checkNotNull(r11);
        Object r14 = null;
        String r15 = null;
        r6 = new Animatable(r11, VectorConvertersKt.getVectorConverter(Dp.Companion), r14, r15, 12, null);
        this.offsetAnimatable = r6;
    L25:
        if (Dp.m6978equalsimpl0(indicatorOffset, r6.getTargetValue().m6987unboximpl()) == true) goto L28;
        BuildersKt.launch$default(getCoroutineScope(), null, null, new TabIndicatorOffsetNode$measure$3(r6, indicatorOffset, null), 3, null);
    L28:
        LayoutDirection r7 = $this$measure_u2d3p2s80s.getLayoutDirection();
        LayoutDirection r8 = LayoutDirection.Ltr;
        Animatable<Dp, AnimationVector1D> r9 = this.offsetAnimatable;
        if (r7 != r8) goto L33;
        if (r9 == null) goto L32;
        float arg0$iv = r9.getValue().m6987unboximpl();
    L37:
        final float offset = arg0$iv;
        Animatable<Dp, AnimationVector1D> r16 = this.widthAnimatable;
        if (r16 == null) goto L40;
        float r17 = r16.getValue().m6987unboximpl();
    L41:
        float width = r17;
        final Placeable placeable = measurable.mo5714measureBRTryo0(Constraints.m6916copyZbe2FdA$default(constraints, $this$measure_u2d3p2s80s.mo370roundToPx0680j_4(width), $this$measure_u2d3p2s80s.mo370roundToPx0680j_4(width), 0, 0, 12, null));
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, placeable.getWidth(), placeable.getHeight(), null, new TabIndicatorOffsetNode$measure$4(placeable, $this$measure_u2d3p2s80s, offset), 4, null);
    L40:
        r17 = currentTabWidth;
        goto L41
    L32:
        arg0$iv = indicatorOffset;
        goto L37
    L33:
        if (r9 == null) goto L35;
        float arg0$iv2 = r9.getValue().m6987unboximpl();
    L36:
        arg0$iv = Dp.m6973constructorimpl(-arg0$iv2);
        goto L37
    L35:
        arg0$iv2 = indicatorOffset;
        goto L36
    L27:
        this.initialOffset = Dp.m6971boximpl(indicatorOffset);
        goto L28
    L18:
        this.initialWidth = Dp.m6971boximpl(currentTabWidth);
        goto L19
    L9:
        r4 = r3.getValue().get(this.selectedTabIndex).m2712getWidthD9Ej5fM();
        goto L10
    L5:
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, 0, 0, null, TabIndicatorOffsetNode$measure$1.INSTANCE, 4, null);
    }
}
