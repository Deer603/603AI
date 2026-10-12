package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: LayoutDirection.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/unit/LayoutDirection;", "", "(Ljava/lang/String;I)V", "Ltr", "Rtl", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum LayoutDirection extends Enum<LayoutDirection> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ LayoutDirection[] $VALUES = null;
    public static final LayoutDirection Ltr = null;
    public static final LayoutDirection Rtl = null;

    private static final /* synthetic */ LayoutDirection[] $values() {
        return new LayoutDirection[]{Ltr, Rtl};
    }

    public static EnumEntries<LayoutDirection> getEntries() {
        return $ENTRIES;
    }

    public static LayoutDirection valueOf(String r1) {
        return (LayoutDirection) Enum.valueOf(LayoutDirection.class, r1);
    }

    public static LayoutDirection[] values() {
        return (LayoutDirection[]) $VALUES.clone();
    }

    private LayoutDirection(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        Ltr = new LayoutDirection("Ltr", 0);
        Rtl = new LayoutDirection("Rtl", 1);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
