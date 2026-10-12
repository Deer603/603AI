package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* JADX INFO: compiled from: IntervalTree.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\"\u001c\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000*\f\b\u0002\u0010\b\"\u00020\u00062\u00020\u0006¨\u0006\t"}, d2 = {"EmptyInterval", "Landroidx/compose/ui/graphics/Interval;", "", "getEmptyInterval", "()Landroidx/compose/ui/graphics/Interval;", "TreeColorBlack", "", "TreeColorRed", "TreeColor", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class IntervalTreeKt {
    private static final Interval<Object> EmptyInterval = null;
    private static final int TreeColorBlack = 1;
    private static final int TreeColorRed = 0;

    static {
        EmptyInterval = new Interval(Float.MAX_VALUE, Float.MIN_VALUE, null);
    }

    public static final Interval<Object> getEmptyInterval() {
        return EmptyInterval;
    }
}
