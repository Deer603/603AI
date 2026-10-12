package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: LayoutModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u001c\u0010\b\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0003H\u0016J&\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0012\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u001c\u0010\u0013\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0003H\u0016ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/Modifier$Element;", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface LayoutModifier extends Modifier.Element {

    /* JADX INFO: compiled from: LayoutModifier.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(LayoutModifier $this, Function1<? super Modifier.Element, Boolean> r2) {
            return LayoutModifier.access$all$jd($this, r2);
        }

        @Deprecated
        public static boolean any(LayoutModifier $this, Function1<? super Modifier.Element, Boolean> r2) {
            return LayoutModifier.access$any$jd($this, r2);
        }

        @Deprecated
        public static <R> R foldIn(LayoutModifier r1, R r2, Function2<? super R, ? super Modifier.Element, ? extends R> r3) {
            return (R) LayoutModifier.access$foldIn$jd(r1, r2, r3);
        }

        @Deprecated
        public static <R> R foldOut(LayoutModifier r1, R r2, Function2<? super Modifier.Element, ? super R, ? extends R> r3) {
            return (R) LayoutModifier.access$foldOut$jd(r1, r2, r3);
        }

        @Deprecated
        public static Modifier then(LayoutModifier $this, Modifier other) {
            return LayoutModifier.access$then$jd($this, other);
        }

        @Deprecated
        public static int minIntrinsicWidth(LayoutModifier $this, IntrinsicMeasureScope $receiver, IntrinsicMeasurable measurable, int height) {
            return LayoutModifier.access$minIntrinsicWidth$jd($this, $receiver, measurable, height);
        }

        @Deprecated
        public static int minIntrinsicHeight(LayoutModifier $this, IntrinsicMeasureScope $receiver, IntrinsicMeasurable measurable, int width) {
            return LayoutModifier.access$minIntrinsicHeight$jd($this, $receiver, measurable, width);
        }

        @Deprecated
        public static int maxIntrinsicWidth(LayoutModifier $this, IntrinsicMeasureScope $receiver, IntrinsicMeasurable measurable, int height) {
            return LayoutModifier.access$maxIntrinsicWidth$jd($this, $receiver, measurable, height);
        }

        @Deprecated
        public static int maxIntrinsicHeight(LayoutModifier $this, IntrinsicMeasureScope $receiver, IntrinsicMeasurable measurable, int width) {
            return LayoutModifier.access$maxIntrinsicHeight$jd($this, $receiver, measurable, width);
        }
    }

    /* JADX INFO: renamed from: measure-3p2s80s */
    MeasureResult mo645measure3p2s80s(MeasureScope r1, Measurable r2, long r3);

    static /* synthetic */ boolean access$all$jd(LayoutModifier $this, Function1 predicate) {
        return super.all(predicate);
    }

    static /* synthetic */ boolean access$any$jd(LayoutModifier $this, Function1 predicate) {
        return super.any(predicate);
    }

    static /* synthetic */ Object access$foldIn$jd(LayoutModifier $this, Object initial, Function2 operation) {
        return super.foldIn(initial, operation);
    }

    static /* synthetic */ Object access$foldOut$jd(LayoutModifier $this, Object initial, Function2 operation) {
        return super.foldOut(initial, operation);
    }

    static /* synthetic */ int access$maxIntrinsicHeight$jd(LayoutModifier $this, IntrinsicMeasureScope $receiver, IntrinsicMeasurable measurable, int width) {
        return super.maxIntrinsicHeight($receiver, measurable, width);
    }

    static /* synthetic */ int access$maxIntrinsicWidth$jd(LayoutModifier $this, IntrinsicMeasureScope $receiver, IntrinsicMeasurable measurable, int height) {
        return super.maxIntrinsicWidth($receiver, measurable, height);
    }

    static /* synthetic */ int access$minIntrinsicHeight$jd(LayoutModifier $this, IntrinsicMeasureScope $receiver, IntrinsicMeasurable measurable, int width) {
        return super.minIntrinsicHeight($receiver, measurable, width);
    }

    static /* synthetic */ int access$minIntrinsicWidth$jd(LayoutModifier $this, IntrinsicMeasureScope $receiver, IntrinsicMeasurable measurable, int height) {
        return super.minIntrinsicWidth($receiver, measurable, height);
    }

    static /* synthetic */ Modifier access$then$jd(LayoutModifier $this, Modifier other) {
        return super.then(other);
    }

    default int minIntrinsicWidth(IntrinsicMeasureScope $this$minIntrinsicWidth, IntrinsicMeasurable measurable, int height) {
        return MeasuringIntrinsics.INSTANCE.minWidth(this, $this$minIntrinsicWidth, measurable, height);
    }

    default int minIntrinsicHeight(IntrinsicMeasureScope $this$minIntrinsicHeight, IntrinsicMeasurable measurable, int width) {
        return MeasuringIntrinsics.INSTANCE.minHeight(this, $this$minIntrinsicHeight, measurable, width);
    }

    default int maxIntrinsicWidth(IntrinsicMeasureScope $this$maxIntrinsicWidth, IntrinsicMeasurable measurable, int height) {
        return MeasuringIntrinsics.INSTANCE.maxWidth(this, $this$maxIntrinsicWidth, measurable, height);
    }

    default int maxIntrinsicHeight(IntrinsicMeasureScope $this$maxIntrinsicHeight, IntrinsicMeasurable measurable, int width) {
        return MeasuringIntrinsics.INSTANCE.maxHeight(this, $this$maxIntrinsicHeight, measurable, width);
    }
}
