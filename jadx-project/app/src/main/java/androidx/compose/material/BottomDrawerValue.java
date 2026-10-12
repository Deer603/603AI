package androidx.compose.material;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: Drawer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/material/BottomDrawerValue;", "", "(Ljava/lang/String;I)V", "Closed", "Open", "Expanded", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum BottomDrawerValue extends Enum<BottomDrawerValue> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ BottomDrawerValue[] $VALUES = null;
    public static final BottomDrawerValue Closed = null;
    public static final BottomDrawerValue Expanded = null;
    public static final BottomDrawerValue Open = null;

    private static final /* synthetic */ BottomDrawerValue[] $values() {
        return new BottomDrawerValue[]{Closed, Open, Expanded};
    }

    public static EnumEntries<BottomDrawerValue> getEntries() {
        return $ENTRIES;
    }

    public static BottomDrawerValue valueOf(String r1) {
        return (BottomDrawerValue) Enum.valueOf(BottomDrawerValue.class, r1);
    }

    public static BottomDrawerValue[] values() {
        return (BottomDrawerValue[]) $VALUES.clone();
    }

    private BottomDrawerValue(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        Closed = new BottomDrawerValue("Closed", 0);
        Open = new BottomDrawerValue("Open", 1);
        Expanded = new BottomDrawerValue("Expanded", 2);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
