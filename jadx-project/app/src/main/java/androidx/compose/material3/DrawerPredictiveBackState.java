package androidx.compose.material3;

import androidx.compose.runtime.FloatState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;

/* JADX INFO: compiled from: NavigationDrawer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0018\u001a\u00020\u0019J6\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\tR+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Landroidx/compose/material3/DrawerPredictiveBackState;", "", "()V", "<set-?>", "", "scaleXDistance", "getScaleXDistance", "()F", "setScaleXDistance", "(F)V", "scaleXDistance$delegate", "Landroidx/compose/runtime/MutableFloatState;", "scaleYDistance", "getScaleYDistance", "setScaleYDistance", "scaleYDistance$delegate", "", "swipeEdgeMatchesDrawer", "getSwipeEdgeMatchesDrawer", "()Z", "setSwipeEdgeMatchesDrawer", "(Z)V", "swipeEdgeMatchesDrawer$delegate", "Landroidx/compose/runtime/MutableState;", "clear", "", "update", NotificationCompat.CATEGORY_PROGRESS, "swipeEdgeLeft", "isRtl", "maxScaleXDistanceGrow", "maxScaleXDistanceShrink", "maxScaleYDistance", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DrawerPredictiveBackState {
    public static final int $stable = 0;
    private final MutableFloatState scaleXDistance$delegate;
    private final MutableFloatState scaleYDistance$delegate;
    private final MutableState swipeEdgeMatchesDrawer$delegate;

    static {
    }

    public DrawerPredictiveBackState() {
        this.swipeEdgeMatchesDrawer$delegate = SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
        this.scaleXDistance$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.scaleYDistance$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    }

    public final boolean getSwipeEdgeMatchesDrawer() {
        State $this$getValue$iv = this.swipeEdgeMatchesDrawer$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    public final void setSwipeEdgeMatchesDrawer(boolean r5) {
        MutableState $this$setValue$iv = this.swipeEdgeMatchesDrawer$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    public final float getScaleXDistance() {
        FloatState $this$getValue$iv = this.scaleXDistance$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    public final void setScaleXDistance(float r4) {
        MutableFloatState $this$setValue$iv = this.scaleXDistance$delegate;
        $this$setValue$iv.setFloatValue(r4);
    }

    public final float getScaleYDistance() {
        FloatState $this$getValue$iv = this.scaleYDistance$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    public final void setScaleYDistance(float r4) {
        MutableFloatState $this$setValue$iv = this.scaleYDistance$delegate;
        $this$setValue$iv.setFloatValue(r4);
    }

    public final void update(float progress, boolean swipeEdgeLeft, boolean isRtl, float maxScaleXDistanceGrow, float maxScaleXDistanceShrink, float maxScaleYDistance) {
        if (swipeEdgeLeft == isRtl) goto L4;
        boolean r0 = true;
    L5:
        setSwipeEdgeMatchesDrawer(r0);
        if (getSwipeEdgeMatchesDrawer() == false) goto L8;
        float maxScaleXDistance = maxScaleXDistanceGrow;
    L9:
        setScaleXDistance(MathHelpersKt.lerp(0.0f, maxScaleXDistance, progress));
        setScaleYDistance(MathHelpersKt.lerp(0.0f, maxScaleYDistance, progress));
        return;
    L8:
        maxScaleXDistance = maxScaleXDistanceShrink;
        goto L9
    L4:
        r0 = false;
        goto L5
    }

    public final void clear() {
        setSwipeEdgeMatchesDrawer(true);
        setScaleXDistance(0.0f);
        setScaleYDistance(0.0f);
    }
}
