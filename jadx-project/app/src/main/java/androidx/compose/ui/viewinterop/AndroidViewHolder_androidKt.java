package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidViewHolder.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000/\n\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0001\u001a\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\b\u001a\u0014\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0004H\u0002\u001a\f\u0010\u0010\u001a\u00020\u000f*\u00020\u000fH\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"NoOpScrollConnection", "androidx/compose/ui/viewinterop/AndroidViewHolder_androidKt$NoOpScrollConnection$1", "Landroidx/compose/ui/viewinterop/AndroidViewHolder_androidKt$NoOpScrollConnection$1;", "Unmeasured", "", "toNestedScrollSource", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "(I)I", "layoutAccordingTo", "", "Landroid/view/View;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "toComposeOffset", "", "toComposeVelocity", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidViewHolder_androidKt {
    private static final AndroidViewHolder_androidKt$NoOpScrollConnection$1 NoOpScrollConnection = null;
    private static final int Unmeasured = Integer.MIN_VALUE;

    public static final /* synthetic */ AndroidViewHolder_androidKt$NoOpScrollConnection$1 access$getNoOpScrollConnection$p() {
        return NoOpScrollConnection;
    }

    public static final /* synthetic */ void access$layoutAccordingTo(View $receiver, LayoutNode layoutNode) {
        layoutAccordingTo($receiver, layoutNode);
    }

    public static final /* synthetic */ float access$toComposeOffset(int $receiver) {
        return toComposeOffset($receiver);
    }

    public static final /* synthetic */ float access$toComposeVelocity(float $receiver) {
        return toComposeVelocity($receiver);
    }

    public static final /* synthetic */ int access$toNestedScrollSource(int type) {
        return toNestedScrollSource(type);
    }

    private static final void layoutAccordingTo(View $this$layoutAccordingTo, LayoutNode layoutNode) {
        long position = LayoutCoordinatesKt.positionInRoot(layoutNode.getCoordinates());
        int bits$iv$iv$iv = (int) (position >> 32);
        float $this$fastRoundToInt$iv = Float.intBitsToFloat(bits$iv$iv$iv);
        int $i$f$fastRoundToInt = Math.round($this$fastRoundToInt$iv);
        int bits$iv$iv$iv2 = (int) (4294967295L & position);
        float $this$fastRoundToInt$iv2 = Float.intBitsToFloat(bits$iv$iv$iv2);
        int $i$f$fastRoundToInt2 = Math.round($this$fastRoundToInt$iv2);
        $this$layoutAccordingTo.layout($i$f$fastRoundToInt, $i$f$fastRoundToInt2, $this$layoutAccordingTo.getMeasuredWidth() + $i$f$fastRoundToInt, $this$layoutAccordingTo.getMeasuredHeight() + $i$f$fastRoundToInt2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt$NoOpScrollConnection$1] */
    static {
        NoOpScrollConnection = new AndroidViewHolder_androidKt$NoOpScrollConnection$1();
    }

    private static final float toComposeOffset(int $this$toComposeOffset) {
        return $this$toComposeOffset * (-1.0f);
    }

    private static final float toComposeVelocity(float $this$toComposeVelocity) {
        return (-1.0f) * $this$toComposeVelocity;
    }

    private static final int toNestedScrollSource(int type) {
        if (type != 0) goto L5;
        return NestedScrollSource.Companion.m5482getUserInputWNlRxjI();
    L5:
        return NestedScrollSource.Companion.m5481getSideEffectWNlRxjI();
    }
}
