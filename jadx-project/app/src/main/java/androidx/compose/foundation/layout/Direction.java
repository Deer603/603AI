package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/layout/Direction;", "", "(Ljava/lang/String;I)V", "Vertical", "Horizontal", "Both", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum Direction extends Enum<Direction> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ Direction[] $VALUES = null;
    public static final Direction Both = null;
    public static final Direction Horizontal = null;
    public static final Direction Vertical = null;

    private static final /* synthetic */ Direction[] $values() {
        return new Direction[]{Vertical, Horizontal, Both};
    }

    public static EnumEntries<Direction> getEntries() {
        return $ENTRIES;
    }

    public static Direction valueOf(String r1) {
        return (Direction) Enum.valueOf(Direction.class, r1);
    }

    public static Direction[] values() {
        return (Direction[]) $VALUES.clone();
    }

    private Direction(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        Vertical = new Direction("Vertical", 0);
        Horizontal = new Direction("Horizontal", 1);
        Both = new Direction("Both", 2);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
