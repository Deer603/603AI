package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Padding.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BN\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010!\u001a\u00020\u0002H\u0016J\u0013\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u0002H\u0016J\f\u0010)\u001a\u00020\r*\u00020\fH\u0016R\"\u0010\u0007\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0006\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\"\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u001d\u0010\u0011\"\u0004\b\u001e\u0010\u0013R\"\u0010\u0005\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u001f\u0010\u0011\"\u0004\b \u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/foundation/layout/PaddingElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/PaddingNode;", "start", "Landroidx/compose/ui/unit/Dp;", "top", "end", "bottom", "rtlAware", "", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(FFFFZLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBottom-D9Ej5fM", "()F", "setBottom-0680j_4", "(F)V", "F", "getEnd-D9Ej5fM", "setEnd-0680j_4", "getInspectorInfo", "()Lkotlin/jvm/functions/Function1;", "getRtlAware", "()Z", "setRtlAware", "(Z)V", "getStart-D9Ej5fM", "setStart-0680j_4", "getTop-D9Ej5fM", "setTop-0680j_4", "create", "equals", "other", "", "hashCode", "", "update", "node", "inspectableProperties", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class PaddingElement extends ModifierNodeElement<PaddingNode> {
    private float bottom;
    private float end;
    private final Function1<InspectorInfo, Unit> inspectorInfo;
    private boolean rtlAware;
    private float start;
    private float top;

    public /* synthetic */ PaddingElement(float r1, float r2, float r3, float r4, boolean r5, Function1 r6, DefaultConstructorMarker r7) {
        this(r1, r2, r3, r4, r5, r6);
    }

    public /* synthetic */ PaddingElement(float r9, float r10, float r11, float r12, boolean r13, Function1 r14, int r15, DefaultConstructorMarker r16) {
        if ((r15 & 1) == 0) goto L5;
        float r1 = Dp.m6973constructorimpl(0);
    L7:
        if ((r15 & 2) == 0) goto L9;
        float r2 = Dp.m6973constructorimpl(0);
    L11:
        if ((r15 & 4) == 0) goto L13;
        float r3 = Dp.m6973constructorimpl(0);
    L15:
        if ((r15 & 8) == 0) goto L17;
        float r4 = Dp.m6973constructorimpl(0);
    L18:
        this(r1, r2, r3, r4, r13, r14, null);
        return;
    L17:
        r4 = r12;
        goto L18
    L13:
        r3 = r11;
        goto L15
    L9:
        r2 = r10;
        goto L11
    L5:
        r1 = r9;
        goto L7
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public /* bridge */ /* synthetic */ Modifier.Node create() {
        return create();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public /* bridge */ /* synthetic */ void update(Modifier.Node node) {
        update((PaddingNode) node);
    }

    /* JADX INFO: renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m712getStartD9Ej5fM() {
        return this.start;
    }

    /* JADX INFO: renamed from: setStart-0680j_4, reason: not valid java name */
    public final void m716setStart0680j_4(float r1) {
        this.start = r1;
    }

    /* JADX INFO: renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m713getTopD9Ej5fM() {
        return this.top;
    }

    /* JADX INFO: renamed from: setTop-0680j_4, reason: not valid java name */
    public final void m717setTop0680j_4(float r1) {
        this.top = r1;
    }

    /* JADX INFO: renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m711getEndD9Ej5fM() {
        return this.end;
    }

    /* JADX INFO: renamed from: setEnd-0680j_4, reason: not valid java name */
    public final void m715setEnd0680j_4(float r1) {
        this.end = r1;
    }

    /* JADX INFO: renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m710getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: setBottom-0680j_4, reason: not valid java name */
    public final void m714setBottom0680j_4(float r1) {
        this.bottom = r1;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    public final void setRtlAware(boolean r1) {
        this.rtlAware = r1;
    }

    public final Function1<InspectorInfo, Unit> getInspectorInfo() {
        return this.inspectorInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private PaddingElement(float start, float top, float end, float bottom, boolean rtlAware, Function1<? super InspectorInfo, Unit> r13) {
        this.start = start;
        this.top = top;
        this.end = end;
        this.bottom = bottom;
        this.rtlAware = rtlAware;
        this.inspectorInfo = r13;
        boolean r2 = false;
        if (this.start >= 0.0f) goto L8;
        float $this$isUnspecified$iv = this.start;
        if (Float.isNaN($this$isUnspecified$iv) == true) goto L8;
        boolean r0 = false;
    L10:
        if (this.top >= 0.0f) goto L15;
        float $this$isUnspecified$iv2 = this.top;
        if (Float.isNaN($this$isUnspecified$iv2) == true) goto L15;
        boolean r4 = false;
    L16:
        boolean r1 = r0 & r4;
        if (this.end >= 0.0f) goto L22;
        float $this$isUnspecified$iv3 = this.end;
        if (Float.isNaN($this$isUnspecified$iv3) == true) goto L22;
        boolean r5 = false;
    L23:
        boolean r3 = r1 & r5;
        if (this.bottom >= 0.0f) goto L27;
        float $this$isUnspecified$iv4 = this.bottom;
        if (Float.isNaN($this$isUnspecified$iv4) == true) goto L27;
    L28:
        boolean value$iv = r3 & r2;
        if (value$iv == true) goto L33;
        InlineClassHelperKt.throwIllegalArgumentException("Padding must be non-negative");
        return;
    L33:
        return;
    L27:
        r2 = true;
    L22:
        r5 = true;
    L15:
        r4 = true;
    L8:
        r0 = true;
        goto L10
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public PaddingNode create() {
        return new PaddingNode(this.start, this.top, this.end, this.bottom, this.rtlAware, null);
    }

    public void update(PaddingNode node) {
        node.m736setStart0680j_4(this.start);
        node.m737setTop0680j_4(this.top);
        node.m735setEnd0680j_4(this.end);
        node.m734setBottom0680j_4(this.bottom);
        node.setRtlAware(this.rtlAware);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int result = Dp.m6979hashCodeimpl(this.start);
        int result2 = (result * 31) + Dp.m6979hashCodeimpl(this.top);
        return (((((result2 * 31) + Dp.m6979hashCodeimpl(this.end)) * 31) + Dp.m6979hashCodeimpl(this.bottom)) * 31) + Boolean.hashCode(this.rtlAware);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object other) {
        if ((other instanceof PaddingElement) == false) goto L5;
        PaddingElement otherModifierElement = (PaddingElement) other;
    L7:
        if (otherModifierElement != null) goto L10;
        return false;
    L10:
        if (Dp.m6978equalsimpl0(this.start, otherModifierElement.start) == true) goto L12;
        return false;
    L12:
        if (Dp.m6978equalsimpl0(this.top, otherModifierElement.top) == true) goto L14;
        return false;
    L14:
        if (Dp.m6978equalsimpl0(this.end, otherModifierElement.end) == true) goto L16;
        return false;
    L16:
        if (Dp.m6978equalsimpl0(this.bottom, otherModifierElement.bottom) == true) goto L18;
        return false;
    L18:
        if (this.rtlAware != otherModifierElement.rtlAware) goto L26;
        return true;
    L26:
        return false;
    L5:
        otherModifierElement = null;
        goto L7
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo $this$inspectableProperties) {
        this.inspectorInfo.invoke($this$inspectableProperties);
    }
}
