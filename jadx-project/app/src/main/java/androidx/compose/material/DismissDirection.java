package androidx.compose.material;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: SwipeToDismiss.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/DismissDirection;", "", "(Ljava/lang/String;I)V", "StartToEnd", "EndToStart", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum DismissDirection extends Enum<DismissDirection> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ DismissDirection[] $VALUES = null;
    public static final DismissDirection EndToStart = null;
    public static final DismissDirection StartToEnd = null;

    private static final /* synthetic */ DismissDirection[] $values() {
        return new DismissDirection[]{StartToEnd, EndToStart};
    }

    public static EnumEntries<DismissDirection> getEntries() {
        return $ENTRIES;
    }

    public static DismissDirection valueOf(String r1) {
        return (DismissDirection) Enum.valueOf(DismissDirection.class, r1);
    }

    public static DismissDirection[] values() {
        return (DismissDirection[]) $VALUES.clone();
    }

    private DismissDirection(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        StartToEnd = new DismissDirection("StartToEnd", 0);
        EndToStart = new DismissDirection("EndToStart", 1);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
