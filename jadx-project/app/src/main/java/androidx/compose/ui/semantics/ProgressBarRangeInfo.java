package androidx.compose.ui.semantics;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "", "current", "", "range", "Lkotlin/ranges/ClosedFloatingPointRange;", "steps", "", "(FLkotlin/ranges/ClosedFloatingPointRange;I)V", "getCurrent", "()F", "getRange", "()Lkotlin/ranges/ClosedFloatingPointRange;", "getSteps", "()I", "equals", "", "other", "hashCode", "toString", "", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ProgressBarRangeInfo {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final ProgressBarRangeInfo Indeterminate = null;
    private final float current;
    private final ClosedFloatingPointRange<Float> range;
    private final int steps;

    /* JADX INFO: compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/semantics/ProgressBarRangeInfo$Companion;", "", "()V", "Indeterminate", "Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "getIndeterminate", "()Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final ProgressBarRangeInfo getIndeterminate() {
            return ProgressBarRangeInfo.access$getIndeterminate$cp();
        }
    }

    public ProgressBarRangeInfo(float current, ClosedFloatingPointRange<Float> r4, int steps) {
        this.current = current;
        this.range = r4;
        this.steps = steps;
        if (Float.isNaN(this.current) == true) goto L6;
        return;
    L6:
        throw new IllegalArgumentException("current must not be NaN".toString());
    }

    public /* synthetic */ ProgressBarRangeInfo(float r1, ClosedFloatingPointRange r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = 0;
    L5:
        this(r1, r2, r3);
    }

    public static final /* synthetic */ ProgressBarRangeInfo access$getIndeterminate$cp() {
        return Indeterminate;
    }

    public final float getCurrent() {
        return this.current;
    }

    public final ClosedFloatingPointRange<Float> getRange() {
        return this.range;
    }

    public final int getSteps() {
        return this.steps;
    }

    static {
        Companion = new Companion(null);
        float r3 = 0.0f;
        int r5 = 0;
        Indeterminate = new ProgressBarRangeInfo(r3, RangesKt.rangeTo(0.0f, 0.0f), r5, 4, null);
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof ProgressBarRangeInfo) == true) goto L9;
        return false;
    L9:
        if (this.current != ((ProgressBarRangeInfo) other).current) goto L11;
        boolean r1 = true;
    L12:
        if (r1 == true) goto L15;
        return false;
    L15:
        if (Intrinsics.areEqual(this.range, ((ProgressBarRangeInfo) other).range) == true) goto L18;
        return false;
    L18:
        if (this.steps == ((ProgressBarRangeInfo) other).steps) goto L20;
        return false;
    L20:
        return true;
    L11:
        r1 = false;
        goto L12
    }

    public int hashCode() {
        int result = Float.hashCode(this.current);
        int result2 = (result * 31) + this.range.hashCode();
        return (result2 * 31) + this.steps;
    }

    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.current + ", range=" + this.range + ", steps=" + this.steps + ')';
    }
}
