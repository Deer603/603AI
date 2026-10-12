package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: compiled from: VisibilityThresholds.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\".\u0010\u0005\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\u00010\u0006X\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0015\u0010\f\u001a\u00020\r*\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0015\u0010\f\u001a\u00020\u0004*\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0012\"\u0015\u0010\f\u001a\u00020\u0013*\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0015\"\u0015\u0010\f\u001a\u00020\u0016*\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0018\"\u0015\u0010\f\u001a\u00020\u0019*\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u001b\"\u0015\u0010\f\u001a\u00020\u001c*\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u001e\"\u0015\u0010\f\u001a\u00020\u001f*\u00020 8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010!\"\u0015\u0010\f\u001a\u00020\"*\u00020#8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010$¨\u0006%"}, d2 = {"DpVisibilityThreshold", "", "PxVisibilityThreshold", "RectVisibilityThreshold", "Landroidx/compose/ui/geometry/Rect;", "VisibilityThresholdMap", "", "Landroidx/compose/animation/core/TwoWayConverter;", "getVisibilityThresholdMap$annotations", "()V", "getVisibilityThresholdMap", "()Ljava/util/Map;", "VisibilityThreshold", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/geometry/Offset$Companion;", "getVisibilityThreshold", "(Landroidx/compose/ui/geometry/Offset$Companion;)J", "Landroidx/compose/ui/geometry/Rect$Companion;", "(Landroidx/compose/ui/geometry/Rect$Companion;)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/geometry/Size$Companion;", "(Landroidx/compose/ui/geometry/Size$Companion;)J", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/ui/unit/Dp$Companion;", "(Landroidx/compose/ui/unit/Dp$Companion;)F", "Landroidx/compose/ui/unit/DpOffset;", "Landroidx/compose/ui/unit/DpOffset$Companion;", "(Landroidx/compose/ui/unit/DpOffset$Companion;)J", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/ui/unit/IntOffset$Companion;", "(Landroidx/compose/ui/unit/IntOffset$Companion;)J", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/unit/IntSize$Companion;", "(Landroidx/compose/ui/unit/IntSize$Companion;)J", "", "Lkotlin/Int$Companion;", "(Lkotlin/jvm/internal/IntCompanionObject;)I", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class VisibilityThresholdsKt {
    private static final float DpVisibilityThreshold = 0.1f;
    private static final float PxVisibilityThreshold = 0.5f;
    private static final Rect RectVisibilityThreshold = null;
    private static final Map<TwoWayConverter<?, ?>, Float> VisibilityThresholdMap = null;

    public static /* synthetic */ void getVisibilityThresholdMap$annotations() {
    }

    static {
        Float r2 = Float.valueOf(0.5f);
        RectVisibilityThreshold = new Rect(0.5f, 0.5f, 0.5f, 0.5f);
        TwoWayConverter<Integer, AnimationVector1D> r1 = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
        Float r3 = Float.valueOf(1.0f);
        TwoWayConverter<Dp, AnimationVector1D> r4 = VectorConvertersKt.getVectorConverter(Dp.Companion);
        Float r5 = Float.valueOf(0.1f);
        VisibilityThresholdMap = MapsKt.mapOf(new Pair[]{TuplesKt.to(r1, r3), TuplesKt.to(VectorConvertersKt.getVectorConverter(IntSize.Companion), r3), TuplesKt.to(VectorConvertersKt.getVectorConverter(IntOffset.Companion), r3), TuplesKt.to(VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), Float.valueOf(0.01f)), TuplesKt.to(VectorConvertersKt.getVectorConverter(Rect.Companion), r2), TuplesKt.to(VectorConvertersKt.getVectorConverter(Size.Companion), r2), TuplesKt.to(VectorConvertersKt.getVectorConverter(Offset.Companion), r2), TuplesKt.to(r4, r5), TuplesKt.to(VectorConvertersKt.getVectorConverter(DpOffset.Companion), r5)});
    }

    public static final long getVisibilityThreshold(IntOffset.Companion $this$VisibilityThreshold) {
        return IntOffset.m7095constructorimpl((((long) 1) << 32) | (((long) 1) & 4294967295L));
    }

    public static final long getVisibilityThreshold(Offset.Companion $this$VisibilityThreshold) {
        long v1$iv$iv = Float.floatToRawIntBits(0.5f);
        long v2$iv$iv = Float.floatToRawIntBits(0.5f);
        return Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    }

    public static final int getVisibilityThreshold(IntCompanionObject $this$VisibilityThreshold) {
        return 1;
    }

    public static final float getVisibilityThreshold(Dp.Companion $this$VisibilityThreshold) {
        float $this$dp$iv = Dp.m6973constructorimpl(0.1f);
        return $this$dp$iv;
    }

    public static final long getVisibilityThreshold(DpOffset.Companion $this$VisibilityThreshold) {
        float x$iv = getVisibilityThreshold(Dp.Companion);
        float y$iv = getVisibilityThreshold(Dp.Companion);
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        return DpOffset.m7029constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    }

    public static final long getVisibilityThreshold(Size.Companion $this$VisibilityThreshold) {
        long v1$iv$iv = Float.floatToRawIntBits(0.5f);
        long v2$iv$iv = Float.floatToRawIntBits(0.5f);
        return Size.m4185constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    }

    public static final long getVisibilityThreshold(IntSize.Companion $this$VisibilityThreshold) {
        return IntSize.m7139constructorimpl((((long) 1) << 32) | (((long) 1) & 4294967295L));
    }

    public static final Rect getVisibilityThreshold(Rect.Companion $this$VisibilityThreshold) {
        return RectVisibilityThreshold;
    }

    public static final Map<TwoWayConverter<?, ?>, Float> getVisibilityThresholdMap() {
        return VisibilityThresholdMap;
    }
}
