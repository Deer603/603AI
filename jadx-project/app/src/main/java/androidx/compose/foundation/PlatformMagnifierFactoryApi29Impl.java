package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.math.MathKt;

/* JADX INFO: compiled from: PlatformMagnifier.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JR\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl;", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "()V", "canUpdateZoom", "", "getCanUpdateZoom", "()Z", "create", "Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;", "view", "Landroid/view/View;", "useTextDefault", "size", "Landroidx/compose/ui/unit/DpSize;", "cornerRadius", "Landroidx/compose/ui/unit/Dp;", "elevation", "clippingEnabled", "density", "Landroidx/compose/ui/unit/Density;", "initialZoom", "", "create-nHHXs2Y", "(Landroid/view/View;ZJFFZLandroidx/compose/ui/unit/Density;F)Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;", "PlatformMagnifierImpl", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PlatformMagnifierFactoryApi29Impl implements PlatformMagnifierFactory {
    public static final int $stable = 0;
    public static final PlatformMagnifierFactoryApi29Impl INSTANCE = null;
    private static final boolean canUpdateZoom = false;

    /* JADX INFO: compiled from: PlatformMagnifier.android.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J*\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;", "Landroidx/compose/foundation/PlatformMagnifierFactoryApi28Impl$PlatformMagnifierImpl;", "magnifier", "Landroid/widget/Magnifier;", "(Landroid/widget/Magnifier;)V", "update", "", "sourceCenter", "Landroidx/compose/ui/geometry/Offset;", "magnifierCenter", "zoom", "", "update-Wko1d7g", "(JJF)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PlatformMagnifierImpl extends PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl {
        public static final int $stable = 0;

        static {
        }

        public PlatformMagnifierImpl(Magnifier magnifier) {
            super(magnifier);
        }

        @Override // androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl, androidx.compose.foundation.PlatformMagnifier
        /* JADX INFO: renamed from: update-Wko1d7g */
        public void mo325updateWko1d7g(long sourceCenter, long magnifierCenter, float zoom) {
            if (Float.isNaN(zoom) == true) goto L7;
            getMagnifier().setZoom(zoom);
        L7:
            if ((9223372034707292159L & magnifierCenter) == InlineClassHelperKt.UnspecifiedPackedFloats) goto L9;
            boolean r4 = true;
        L11:
            if (r4 == false) goto L13;
            int bits$iv$iv$iv = (int) (sourceCenter >> 32);
            int bits$iv$iv$iv2 = (int) (sourceCenter & 4294967295L);
            int bits$iv$iv$iv3 = (int) (magnifierCenter >> 32);
            int bits$iv$iv$iv4 = (int) (4294967295L & magnifierCenter);
            getMagnifier().show(Float.intBitsToFloat(bits$iv$iv$iv), Float.intBitsToFloat(bits$iv$iv$iv2), Float.intBitsToFloat(bits$iv$iv$iv3), Float.intBitsToFloat(bits$iv$iv$iv4));
            return;
        L13:
            int bits$iv$iv$iv5 = (int) (sourceCenter >> 32);
            int bits$iv$iv$iv6 = (int) (4294967295L & sourceCenter);
            getMagnifier().show(Float.intBitsToFloat(bits$iv$iv$iv5), Float.intBitsToFloat(bits$iv$iv$iv6));
            return;
        L9:
            r4 = false;
            goto L11
        }
    }

    private PlatformMagnifierFactoryApi29Impl() {
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    /* JADX INFO: renamed from: create-nHHXs2Y */
    public /* bridge */ /* synthetic */ PlatformMagnifier mo326createnHHXs2Y(View view, boolean useTextDefault, long size, float cornerRadius, float elevation, boolean clippingEnabled, Density density, float initialZoom) {
        return mo326createnHHXs2Y(view, useTextDefault, size, cornerRadius, elevation, clippingEnabled, density, initialZoom);
    }

    static {
        INSTANCE = new PlatformMagnifierFactoryApi29Impl();
        canUpdateZoom = true;
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    public boolean getCanUpdateZoom() {
        return canUpdateZoom;
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    /* JADX INFO: renamed from: create-nHHXs2Y */
    public PlatformMagnifierImpl mo326createnHHXs2Y(View view, boolean useTextDefault, long size, float cornerRadius, float elevation, boolean clippingEnabled, Density density, float initialZoom) {
        if (useTextDefault == true) goto L5;
        long pixelSize = density.mo377toSizeXkaWNTQ(size);
        float pixelCornerRadius = density.mo376toPx0680j_4(cornerRadius);
        float pixelElevation = density.mo376toPx0680j_4(elevation);
        Magnifier.Builder $this$create_nHHXs2Y_u24lambda_u241_u24lambda_u240 = new Magnifier.Builder(view);
        if (pixelSize == InlineClassHelperKt.UnspecifiedPackedFloats) goto L9;
        boolean r16 = true;
    L10:
        if (r16 == false) goto L14;
        int bits$iv$iv$iv = (int) (pixelSize >> 32);
        int bits$iv$iv$iv2 = (int) (pixelSize & 4294967295L);
        $this$create_nHHXs2Y_u24lambda_u241_u24lambda_u240.setSize(MathKt.roundToInt(Float.intBitsToFloat(bits$iv$iv$iv)), MathKt.roundToInt(Float.intBitsToFloat(bits$iv$iv$iv2)));
    L14:
        if (Float.isNaN(pixelCornerRadius) == true) goto L17;
        $this$create_nHHXs2Y_u24lambda_u241_u24lambda_u240.setCornerRadius(pixelCornerRadius);
    L17:
        if (Float.isNaN(pixelElevation) == true) goto L20;
        $this$create_nHHXs2Y_u24lambda_u241_u24lambda_u240.setElevation(pixelElevation);
    L20:
        if (Float.isNaN(initialZoom) == true) goto L23;
        $this$create_nHHXs2Y_u24lambda_u241_u24lambda_u240.setInitialZoom(initialZoom);
    L23:
        $this$create_nHHXs2Y_u24lambda_u241_u24lambda_u240.setClippingEnabled(clippingEnabled);
        Magnifier magnifier = $this$create_nHHXs2Y_u24lambda_u241_u24lambda_u240.build();
        return new PlatformMagnifierImpl(magnifier);
    L9:
        r16 = false;
        goto L10
    L5:
        return new PlatformMagnifierImpl(new Magnifier(view));
    }
}
