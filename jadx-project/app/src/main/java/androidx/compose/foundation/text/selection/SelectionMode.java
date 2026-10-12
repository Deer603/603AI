package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: SelectionMode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0011\u001a\u00020\f*\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014j\u0002\b\u0015j\u0002\b\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionMode;", "", "(Ljava/lang/String;I)V", "compare", "", "position", "Landroidx/compose/ui/geometry/Offset;", "bounds", "Landroidx/compose/ui/geometry/Rect;", "compare-3MmeM6k$foundation_release", "(JLandroidx/compose/ui/geometry/Rect;)I", "isSelected", "", "start", "end", "isSelected-2x9bVx0$foundation_release", "(Landroidx/compose/ui/geometry/Rect;JJ)Z", "containsInclusive", "offset", "containsInclusive-Uv8p0NA", "(Landroidx/compose/ui/geometry/Rect;J)Z", "Vertical", "Horizontal", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract enum SelectionMode extends Enum<SelectionMode> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ SelectionMode[] $VALUES = null;
    public static final SelectionMode Horizontal = null;
    public static final SelectionMode Vertical = null;

    private static final /* synthetic */ SelectionMode[] $values() {
        return new SelectionMode[]{Vertical, Horizontal};
    }

    public /* synthetic */ SelectionMode(String r1, int r2, DefaultConstructorMarker r3) {
        this(r1, r2);
    }

    public static EnumEntries<SelectionMode> getEntries() {
        return $ENTRIES;
    }

    public static SelectionMode valueOf(String r1) {
        return (SelectionMode) Enum.valueOf(SelectionMode.class, r1);
    }

    public static SelectionMode[] values() {
        return (SelectionMode[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: compare-3MmeM6k$foundation_release, reason: not valid java name */
    public abstract int mo1490compare3MmeM6k$foundation_release(long r1, Rect r3);

    private SelectionMode(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        final String r1 = "Vertical";
        final int r2 = 0;
        Vertical = new Vertical(r1, r2);
        final String r3 = "Horizontal";
        final int r4 = 1;
        Horizontal = new Horizontal(r3, r4);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }

    /* JADX INFO: renamed from: isSelected-2x9bVx0$foundation_release, reason: not valid java name */
    public final boolean m1491isSelected2x9bVx0$foundation_release(Rect bounds, long start, long end) {
        boolean r1 = true;
        if (m1489containsInclusiveUv8p0NA(bounds, start) == false) goto L5;
    L16:
        return true;
    L5:
        if (m1489containsInclusiveUv8p0NA(bounds, end) == true) goto L16;
        int compareStart = mo1490compare3MmeM6k$foundation_release(start, bounds);
        int compareEnd = mo1490compare3MmeM6k$foundation_release(end, bounds);
        if (compareStart <= 0) goto L10;
        boolean r4 = true;
    L11:
        if (compareEnd > 0) goto L15;
        r1 = false;
    L15:
        return r1 ^ r4;
    L10:
        r4 = false;
        goto L11
    }

    /* JADX INFO: renamed from: containsInclusive-Uv8p0NA, reason: not valid java name */
    private final boolean m1489containsInclusiveUv8p0NA(Rect $this$containsInclusive_u2dUv8p0NA, long offset) {
        float r0 = $this$containsInclusive_u2dUv8p0NA.getLeft();
        float r1 = $this$containsInclusive_u2dUv8p0NA.getRight();
        int bits$iv$iv$iv = (int) (offset >> 32);
        float r6 = Float.intBitsToFloat(bits$iv$iv$iv);
        if (r0 <= r6) goto L5;
    L7:
        boolean r2 = false;
    L8:
        if (r2 == false) goto L18;
        float r3 = $this$containsInclusive_u2dUv8p0NA.getTop();
        float r4 = $this$containsInclusive_u2dUv8p0NA.getBottom();
        int bits$iv$iv$iv2 = (int) (4294967295L & offset);
        float r8 = Float.intBitsToFloat(bits$iv$iv$iv2);
        if (r3 <= r8) goto L12;
    L14:
        boolean r5 = false;
    L15:
        if (r5 == false) goto L18;
        return true;
    L12:
        if (r8 > r4) goto L14;
        r5 = true;
    L18:
        return false;
    L5:
        if (r6 > r1) goto L7;
        r2 = true;
        goto L8
    }
}
