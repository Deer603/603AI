package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: SelectionHandles.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionHandleAnchor;", "", "(Ljava/lang/String;I)V", "Left", "Middle", "Right", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum SelectionHandleAnchor extends Enum<SelectionHandleAnchor> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ SelectionHandleAnchor[] $VALUES = null;
    public static final SelectionHandleAnchor Left = null;
    public static final SelectionHandleAnchor Middle = null;
    public static final SelectionHandleAnchor Right = null;

    private static final /* synthetic */ SelectionHandleAnchor[] $values() {
        return new SelectionHandleAnchor[]{Left, Middle, Right};
    }

    public static EnumEntries<SelectionHandleAnchor> getEntries() {
        return $ENTRIES;
    }

    public static SelectionHandleAnchor valueOf(String r1) {
        return (SelectionHandleAnchor) Enum.valueOf(SelectionHandleAnchor.class, r1);
    }

    public static SelectionHandleAnchor[] values() {
        return (SelectionHandleAnchor[]) $VALUES.clone();
    }

    private SelectionHandleAnchor(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        Left = new SelectionHandleAnchor("Left", 0);
        Middle = new SelectionHandleAnchor("Middle", 1);
        Right = new SelectionHandleAnchor("Right", 2);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
