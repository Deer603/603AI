package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: NestedScrollInteropConnection.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0001H\u0000\u001a\u0017\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001a\"\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\f\u0010\u0014\u001a\u00020\u0001*\u00020\u0001H\u0002\u001a\f\u0010\u0015\u001a\u00020\u0001*\u00020\u0003H\u0002\u001a\u0016\u0010\u0016\u001a\u00020\u0003*\u00020\u0017H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\u0001*\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0002\u001a\u00020\u0003*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"ScrollingAxesThreshold", "", "scrollAxes", "", "Landroidx/compose/ui/geometry/Offset;", "getScrollAxes-k-4lQ0M", "(J)I", "composeToViewOffset", "offset", "rememberNestedScrollInteropConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "hostView", "Landroid/view/View;", "(Landroid/view/View;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "toOffset", "consumed", "", "available", "toOffset-Uv8p0NA", "([IJ)J", "ceilAwayFromZero", "reverseAxis", "toViewType", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "toViewType-GyEprt8", "(I)I", "toViewVelocity", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class NestedScrollInteropConnectionKt {
    private static final float ScrollingAxesThreshold = 0.5f;

    /* JADX INFO: renamed from: access$getScrollAxes-k-4lQ0M, reason: not valid java name */
    public static final /* synthetic */ int m6148access$getScrollAxesk4lQ0M(long $receiver) {
        return m6151getScrollAxesk4lQ0M($receiver);
    }

    /* JADX INFO: renamed from: access$toOffset-Uv8p0NA, reason: not valid java name */
    public static final /* synthetic */ long m6149access$toOffsetUv8p0NA(int[] consumed, long available) {
        return m6152toOffsetUv8p0NA(consumed, available);
    }

    /* JADX INFO: renamed from: access$toViewType-GyEprt8, reason: not valid java name */
    public static final /* synthetic */ int m6150access$toViewTypeGyEprt8(int $receiver) {
        return m6153toViewTypeGyEprt8($receiver);
    }

    public static final /* synthetic */ float access$toViewVelocity(float $receiver) {
        return toViewVelocity($receiver);
    }

    private static final float ceilAwayFromZero(float $this$ceilAwayFromZero) {
        if ($this$ceilAwayFromZero < 0.0f) goto L5;
        double r0 = Math.ceil($this$ceilAwayFromZero);
    L7:
        return (float) r0;
    L5:
        r0 = Math.floor($this$ceilAwayFromZero);
        goto L7
    }

    public static final int composeToViewOffset(float offset) {
        return ((int) ceilAwayFromZero(offset)) * (-1);
    }

    private static final float reverseAxis(int $this$reverseAxis) {
        return $this$reverseAxis * (-1.0f);
    }

    private static final float toViewVelocity(float $this$toViewVelocity) {
        return (-1.0f) * $this$toViewVelocity;
    }

    /* JADX INFO: renamed from: toOffset-Uv8p0NA, reason: not valid java name */
    private static final long m6152toOffsetUv8p0NA(int[] consumed, long available) {
        int bits$iv$iv$iv = (int) (available >> 32);
        if (Float.intBitsToFloat(bits$iv$iv$iv) < 0.0f) goto L5;
        int bits$iv$iv$iv2 = (int) (available >> 32);
        float offsetX = RangesKt.coerceAtMost(reverseAxis(consumed[0]), Float.intBitsToFloat(bits$iv$iv$iv2));
    L6:
        int bits$iv$iv$iv3 = (int) (available & 4294967295L);
        if (Float.intBitsToFloat(bits$iv$iv$iv3) < 0.0f) goto L9;
        int bits$iv$iv$iv4 = (int) (available & 4294967295L);
        float offsetY = RangesKt.coerceAtMost(reverseAxis(consumed[1]), Float.intBitsToFloat(bits$iv$iv$iv4));
    L10:
        long v1$iv$iv = Float.floatToRawIntBits(offsetX);
        long v2$iv$iv = Float.floatToRawIntBits(offsetY);
        return Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    L9:
        int bits$iv$iv$iv5 = (int) (available & 4294967295L);
        offsetY = RangesKt.coerceAtLeast(reverseAxis(consumed[1]), Float.intBitsToFloat(bits$iv$iv$iv5));
        goto L10
    L5:
        int bits$iv$iv$iv6 = (int) (available >> 32);
        offsetX = RangesKt.coerceAtLeast(reverseAxis(consumed[0]), Float.intBitsToFloat(bits$iv$iv$iv6));
        goto L6
    }

    /* JADX INFO: renamed from: toViewType-GyEprt8, reason: not valid java name */
    private static final int m6153toViewTypeGyEprt8(int $this$toViewType_u2dGyEprt8) {
        if (NestedScrollSource.m5470equalsimpl0($this$toViewType_u2dGyEprt8, NestedScrollSource.Companion.m5482getUserInputWNlRxjI()) == false) goto L5;
        return 0;
    L5:
        return 1;
    }

    /* JADX INFO: renamed from: getScrollAxes-k-4lQ0M, reason: not valid java name */
    private static final int m6151getScrollAxesk4lQ0M(long $this$scrollAxes) {
        int axes = 0;
        int bits$iv$iv$iv = (int) ($this$scrollAxes >> 32);
        if (Math.abs(Float.intBitsToFloat(bits$iv$iv$iv)) < 0.5f) goto L5;
        axes = 0 | 1;
    L5:
        int bits$iv$iv$iv2 = (int) (4294967295L & $this$scrollAxes);
        if (Math.abs(Float.intBitsToFloat(bits$iv$iv$iv2)) >= 0.5f) goto L8;
        return axes;
    L8:
        return axes | 2;
    }

    public static final NestedScrollConnection rememberNestedScrollInteropConnection(View hostView, Composer $composer, int $changed, int r9) {
        ComposerKt.sourceInformationMarkerStart($composer, 1075877987, "C(rememberNestedScrollInteropConnection)230@8278L7,231@8314L62:NestedScrollInteropConnection.android.kt#itgzvw");
        if ((r9 & 1) == 0) goto L6;
        ProvidableCompositionLocal<View> r10 = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r3 = $composer.consume(r10);
        ComposerKt.sourceInformationMarkerEnd($composer);
        hostView = (View) r3;
    L6:
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventStart(1075877987, $changed, -1, "androidx.compose.ui.platform.rememberNestedScrollInteropConnection (NestedScrollInteropConnection.android.kt:231)");
    L8:
        ComposerKt.sourceInformationMarkerStart($composer, -5561242, "CC(remember):NestedScrollInteropConnection.android.kt#9igjgp");
        boolean invalid$iv = $composer.changed(hostView);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L11;
    L14:
        Object value$iv = new NestedScrollInteropConnection(hostView);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L15:
        NestedScrollInteropConnection r2 = (NestedScrollInteropConnection) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventEnd();
    L18:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r2;
    L11:
        if (it$iv != Composer.Companion.getEmpty()) goto L15;
        goto L14
    }
}
