package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidRenderEffect.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\n\u001a\u00020\u000bH\u0015J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0016\u0010\u0006\u001a\u00020\u0007X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/BlurEffect;", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "radiusX", "", "radiusY", "edgeTreatment", "Landroidx/compose/ui/graphics/TileMode;", "(Landroidx/compose/ui/graphics/RenderEffect;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V", "I", "createRenderEffect", "Landroid/graphics/RenderEffect;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BlurEffect extends RenderEffect {
    private final int edgeTreatment;
    private final float radiusX;
    private final float radiusY;
    private final RenderEffect renderEffect;

    public /* synthetic */ BlurEffect(RenderEffect r1, float r2, float r3, int r4, DefaultConstructorMarker r5) {
        this(r1, r2, r3, r4);
    }

    public /* synthetic */ BlurEffect(RenderEffect r7, float r8, float r9, int r10, int r11, DefaultConstructorMarker r12) {
        if ((r11 & 4) == 0) goto L5;
        float r3 = r8;
    L7:
        if ((r11 & 8) == 0) goto L9;
        int r4 = TileMode.Companion.m4739getClamp3opZhB0();
    L10:
        this(r7, r8, r3, r4, null);
        return;
    L9:
        r4 = r10;
        goto L10
    L5:
        r3 = r9;
        goto L7
    }

    private BlurEffect(RenderEffect renderEffect, float radiusX, float radiusY, int edgeTreatment) {
        super(null);
        this.renderEffect = renderEffect;
        this.radiusX = radiusX;
        this.radiusY = radiusY;
        this.edgeTreatment = edgeTreatment;
    }

    @Override // androidx.compose.ui.graphics.RenderEffect
    protected android.graphics.RenderEffect createRenderEffect() {
        return RenderEffectVerificationHelper.INSTANCE.m4676createBlurEffect8A3gB4(this.renderEffect, this.radiusX, this.radiusY, this.edgeTreatment);
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof BlurEffect) == true) goto L9;
        return false;
    L9:
        if (this.radiusX != ((BlurEffect) other).radiusX) goto L11;
        boolean r1 = true;
    L12:
        if (r1 == true) goto L15;
        return false;
    L15:
        if (this.radiusY != ((BlurEffect) other).radiusY) goto L17;
        boolean r2 = true;
    L18:
        if (r2 == true) goto L21;
        return false;
    L21:
        if (TileMode.m4735equalsimpl0(this.edgeTreatment, ((BlurEffect) other).edgeTreatment) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.areEqual(this.renderEffect, ((BlurEffect) other).renderEffect) == true) goto L26;
        return false;
    L26:
        return true;
    L17:
        r2 = false;
        goto L18
    L11:
        r1 = false;
        goto L12
    }

    public int hashCode() {
        RenderEffect r0 = this.renderEffect;
        if (r0 == null) goto L5;
        int result = r0.hashCode();
    L6:
        int result2 = (result * 31) + Float.hashCode(this.radiusX);
        return (((result2 * 31) + Float.hashCode(this.radiusY)) * 31) + TileMode.m4736hashCodeimpl(this.edgeTreatment);
    L5:
        result = 0;
        goto L6
    }

    public String toString() {
        return "BlurEffect(renderEffect=" + this.renderEffect + ", radiusX=" + this.radiusX + ", radiusY=" + this.radiusY + ", edgeTreatment=" + TileMode.m4737toStringimpl(this.edgeTreatment) + ')';
    }
}
