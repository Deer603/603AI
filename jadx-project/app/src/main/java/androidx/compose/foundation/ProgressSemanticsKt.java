package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.Metadata;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: ProgressSemantics.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0007\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"progressSemantics", "Landroidx/compose/ui/Modifier;", "value", "", "valueRange", "Lkotlin/ranges/ClosedFloatingPointRange;", "steps", "", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ProgressSemanticsKt {
    public static /* synthetic */ Modifier progressSemantics$default(Modifier r0, float r1, ClosedFloatingPointRange r2, int r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = RangesKt.rangeTo(0.0f, 1.0f);
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = 0;
    L9:
        return progressSemantics(r0, r1, r2, r3);
    }

    public static final Modifier progressSemantics(Modifier $this$progressSemantics, final float value, final ClosedFloatingPointRange<Float> r4, final int steps) {
        return SemanticsModifierKt.semantics($this$progressSemantics, true, new AnonymousClass1(value, r4, steps));
    }

    public static final Modifier progressSemantics(Modifier $this$progressSemantics) {
        return SemanticsModifierKt.semantics($this$progressSemantics, true, AnonymousClass2.INSTANCE);
    }
}
