package androidx.compose.material3;

import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bB)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u00020\nX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/material3/RippleNodeFactory;", "Landroidx/compose/foundation/IndicationNodeFactory;", "bounded", "", "radius", "Landroidx/compose/ui/unit/Dp;", "colorProducer", "Landroidx/compose/ui/graphics/ColorProducer;", "(ZFLandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "color", "Landroidx/compose/ui/graphics/Color;", "(ZFJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(ZFLandroidx/compose/ui/graphics/ColorProducer;J)V", "J", "F", "create", "Landroidx/compose/ui/node/DelegatableNode;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "equals", "other", "", "hashCode", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class RippleNodeFactory implements IndicationNodeFactory {
    private final boolean bounded;
    private final long color;
    private final ColorProducer colorProducer;
    private final float radius;

    public /* synthetic */ RippleNodeFactory(boolean r1, float r2, long r3, DefaultConstructorMarker r5) {
        this(r1, r2, r3);
    }

    public /* synthetic */ RippleNodeFactory(boolean r1, float r2, ColorProducer r3, DefaultConstructorMarker r4) {
        this(r1, r2, r3);
    }

    private RippleNodeFactory(boolean bounded, float radius, ColorProducer colorProducer, long color) {
        this.bounded = bounded;
        this.radius = radius;
        this.colorProducer = colorProducer;
        this.color = color;
    }

    public static final /* synthetic */ long access$getColor$p(RippleNodeFactory $this) {
        return $this.color;
    }

    private RippleNodeFactory(boolean bounded, float radius, ColorProducer colorProducer) {
        this(bounded, radius, colorProducer, Color.Companion.m4402getUnspecified0d7_KjU());
    }

    private RippleNodeFactory(boolean bounded, float radius, long color) {
        this(bounded, radius, null, color);
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public DelegatableNode create(InteractionSource interactionSource) {
        ColorProducer r0 = this.colorProducer;
        if (r0 != null) goto L5;
        r0 = new RippleNodeFactory$create$colorProducer$1(this);
    L5:
        ColorProducer colorProducer = r0;
        return new DelegatingThemeAwareRippleNode(interactionSource, this.bounded, this.radius, colorProducer, null);
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof RippleNodeFactory) == true) goto L9;
        return false;
    L9:
        if (this.bounded == ((RippleNodeFactory) other).bounded) goto L12;
        return false;
    L12:
        if (Dp.m6978equalsimpl0(this.radius, ((RippleNodeFactory) other).radius) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.areEqual(this.colorProducer, ((RippleNodeFactory) other).colorProducer) == true) goto L18;
        return false;
    L18:
        return Color.m4367equalsimpl0(this.color, ((RippleNodeFactory) other).color);
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public int hashCode() {
        int result = Boolean.hashCode(this.bounded);
        int result2 = (result * 31) + Dp.m6979hashCodeimpl(this.radius);
        int result3 = result2 * 31;
        ColorProducer r2 = this.colorProducer;
        if (r2 == null) goto L5;
        int r3 = r2.hashCode();
    L7:
        return ((result3 + r3) * 31) + Color.m4373hashCodeimpl(this.color);
    L5:
        r3 = 0;
        goto L7
    }
}
