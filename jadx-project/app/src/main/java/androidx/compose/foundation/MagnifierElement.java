package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Magnifier.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0097\u0001\u0012\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007\u0012\u001b\b\u0002\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b\u0007\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\b\u0010\u001a\u001a\u00020\u0002H\u0016J\u0013\u0010\u001b\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0002H\u0016J\f\u0010\"\u001a\u00020\u000b*\u00020#H\u0016R\u000e\u0010\u0014\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\u00020\u0012X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0018R\u0016\u0010\u0013\u001a\u00020\u0012X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0018R!\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\u00020\nX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0019R\u001f\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/foundation/MagnifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/MagnifierNode;", "sourceCenter", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ExtensionFunctionType;", "magnifierCenter", "onSizeChanged", "Landroidx/compose/ui/unit/DpSize;", "", "zoom", "", "useTextDefault", "", "size", "cornerRadius", "Landroidx/compose/ui/unit/Dp;", "elevation", "clippingEnabled", "platformMagnifierFactory", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FZJFFZLandroidx/compose/foundation/PlatformMagnifierFactory;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "J", "create", "equals", "other", "", "hashCode", "", "update", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MagnifierElement extends ModifierNodeElement<MagnifierNode> {
    public static final int $stable = 0;
    private final boolean clippingEnabled;
    private final float cornerRadius;
    private final float elevation;
    private final Function1<Density, Offset> magnifierCenter;
    private final Function1<DpSize, Unit> onSizeChanged;
    private final PlatformMagnifierFactory platformMagnifierFactory;
    private final long size;
    private final Function1<Density, Offset> sourceCenter;
    private final boolean useTextDefault;
    private final float zoom;

    static {
    }

    public /* synthetic */ MagnifierElement(Function1 r1, Function1 r2, Function1 r3, float r4, boolean r5, long r6, float r8, float r9, boolean r10, PlatformMagnifierFactory r11, DefaultConstructorMarker r12) {
        this(r1, r2, r3, r4, r5, r6, r8, r9, r10, r11);
    }

    public /* synthetic */ MagnifierElement(Function1 r17, Function1 r18, Function1 r19, float r20, boolean r21, long r22, float r24, float r25, boolean r26, PlatformMagnifierFactory r27, int r28, DefaultConstructorMarker r29) {
        if ((r28 & 2) == 0) goto L5;
        Function1 r5 = null;
    L7:
        if ((r28 & 4) == 0) goto L9;
        Function1 r6 = null;
    L11:
        if ((r28 & 8) == 0) goto L13;
        float r7 = Float.NaN;
    L15:
        if ((r28 & 16) == 0) goto L17;
        boolean r8 = false;
    L19:
        if ((r28 & 32) == 0) goto L21;
        long r9 = DpSize.Companion.m7080getUnspecifiedMYxV2XQ();
    L23:
        if ((r28 & 64) == 0) goto L25;
        float r11 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L27:
        if ((r28 & 128) == 0) goto L29;
        float r12 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L31:
        if ((r28 & 256) == 0) goto L33;
        boolean r13 = true;
    L34:
        this(r17, r5, r6, r7, r8, r9, r11, r12, r13, r27, null);
        return;
    L33:
        r13 = r26;
        goto L34
    L29:
        r12 = r25;
        goto L31
    L25:
        r11 = r24;
        goto L27
    L21:
        r9 = r22;
        goto L23
    L17:
        r8 = r21;
        goto L19
    L13:
        r7 = r20;
        goto L15
    L9:
        r6 = r19;
        goto L11
    L5:
        r5 = r18;
        goto L7
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public /* bridge */ /* synthetic */ Modifier.Node create() {
        return create();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public /* bridge */ /* synthetic */ void update(Modifier.Node node) {
        update((MagnifierNode) node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private MagnifierElement(Function1<? super Density, Offset> r1, Function1<? super Density, Offset> r2, Function1<? super DpSize, Unit> r3, float zoom, boolean useTextDefault, long size, float cornerRadius, float elevation, boolean clippingEnabled, PlatformMagnifierFactory platformMagnifierFactory) {
        this.sourceCenter = r1;
        this.magnifierCenter = r2;
        this.onSizeChanged = r3;
        this.zoom = zoom;
        this.useTextDefault = useTextDefault;
        this.size = size;
        this.cornerRadius = cornerRadius;
        this.elevation = elevation;
        this.clippingEnabled = clippingEnabled;
        this.platformMagnifierFactory = platformMagnifierFactory;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public MagnifierNode create() {
        Function1<Density, Offset> r1 = this.sourceCenter;
        Function1<Density, Offset> r2 = this.magnifierCenter;
        float r4 = this.zoom;
        boolean r5 = this.useTextDefault;
        long r6 = this.size;
        float r8 = this.cornerRadius;
        float r9 = this.elevation;
        boolean r10 = this.clippingEnabled;
        return new MagnifierNode(r1, r2, this.onSizeChanged, r4, r5, r6, r8, r9, r10, this.platformMagnifierFactory, null);
    }

    public void update(MagnifierNode node) {
        node.m299update5F03MCQ(this.sourceCenter, this.magnifierCenter, this.zoom, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, this.onSizeChanged, this.platformMagnifierFactory);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof MagnifierElement) == true) goto L9;
        return false;
    L9:
        if (this.sourceCenter == ((MagnifierElement) other).sourceCenter) goto L12;
        return false;
    L12:
        if (this.magnifierCenter == ((MagnifierElement) other).magnifierCenter) goto L15;
        return false;
    L15:
        if (this.zoom != ((MagnifierElement) other).zoom) goto L17;
        boolean r1 = true;
    L18:
        if (r1 == true) goto L21;
        return false;
    L21:
        if (this.useTextDefault == ((MagnifierElement) other).useTextDefault) goto L24;
        return false;
    L24:
        if (DpSize.m7068equalsimpl0(this.size, ((MagnifierElement) other).size) == true) goto L27;
        return false;
    L27:
        if (Dp.m6978equalsimpl0(this.cornerRadius, ((MagnifierElement) other).cornerRadius) == true) goto L30;
        return false;
    L30:
        if (Dp.m6978equalsimpl0(this.elevation, ((MagnifierElement) other).elevation) == true) goto L33;
        return false;
    L33:
        if (this.clippingEnabled == ((MagnifierElement) other).clippingEnabled) goto L36;
        return false;
    L36:
        if (this.onSizeChanged == ((MagnifierElement) other).onSizeChanged) goto L39;
        return false;
    L39:
        if (Intrinsics.areEqual(this.platformMagnifierFactory, ((MagnifierElement) other).platformMagnifierFactory) == true) goto L41;
        return false;
    L41:
        return true;
    L17:
        r1 = false;
        goto L18
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int result = this.sourceCenter.hashCode();
        int r1 = result * 31;
        Function1<Density, Offset> r2 = this.magnifierCenter;
        int r3 = 0;
        if (r2 == null) goto L5;
        int r4 = r2.hashCode();
    L6:
        int result2 = r1 + r4;
        int result3 = ((((((((((((result2 * 31) + Float.hashCode(this.zoom)) * 31) + Boolean.hashCode(this.useTextDefault)) * 31) + DpSize.m7073hashCodeimpl(this.size)) * 31) + Dp.m6979hashCodeimpl(this.cornerRadius)) * 31) + Dp.m6979hashCodeimpl(this.elevation)) * 31) + Boolean.hashCode(this.clippingEnabled)) * 31;
        Function1<DpSize, Unit> r5 = this.onSizeChanged;
        if (r5 == null) goto L10;
        r3 = r5.hashCode();
    L10:
        return ((result3 + r3) * 31) + this.platformMagnifierFactory.hashCode();
    L5:
        r4 = 0;
        goto L6
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo $this$inspectableProperties) {
        $this$inspectableProperties.setName("magnifier");
        $this$inspectableProperties.getProperties().set("sourceCenter", this.sourceCenter);
        $this$inspectableProperties.getProperties().set("magnifierCenter", this.magnifierCenter);
        $this$inspectableProperties.getProperties().set("zoom", Float.valueOf(this.zoom));
        $this$inspectableProperties.getProperties().set("size", DpSize.m7059boximpl(this.size));
        $this$inspectableProperties.getProperties().set("cornerRadius", Dp.m6971boximpl(this.cornerRadius));
        $this$inspectableProperties.getProperties().set("elevation", Dp.m6971boximpl(this.elevation));
        $this$inspectableProperties.getProperties().set("clippingEnabled", Boolean.valueOf(this.clippingEnabled));
    }
}
