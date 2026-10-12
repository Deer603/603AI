package androidx.compose.material;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: Drawer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/DrawerValue;", "", "(Ljava/lang/String;I)V", "Closed", "Open", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum DrawerValue extends Enum<DrawerValue> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ DrawerValue[] $VALUES = null;
    public static final DrawerValue Closed = null;
    public static final DrawerValue Open = null;

    private static final /* synthetic */ DrawerValue[] $values() {
        return new DrawerValue[]{Closed, Open};
    }

    public static EnumEntries<DrawerValue> getEntries() {
        return $ENTRIES;
    }

    public static DrawerValue valueOf(String r1) {
        return (DrawerValue) Enum.valueOf(DrawerValue.class, r1);
    }

    public static DrawerValue[] values() {
        return (DrawerValue[]) $VALUES.clone();
    }

    private DrawerValue(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        Closed = new DrawerValue("Closed", 0);
        Open = new DrawerValue("Open", 1);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
