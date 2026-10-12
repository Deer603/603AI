package androidx.compose.material;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: BottomSheetScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/BottomSheetValue;", "", "(Ljava/lang/String;I)V", "Collapsed", "Expanded", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum BottomSheetValue extends Enum<BottomSheetValue> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ BottomSheetValue[] $VALUES = null;
    public static final BottomSheetValue Collapsed = null;
    public static final BottomSheetValue Expanded = null;

    private static final /* synthetic */ BottomSheetValue[] $values() {
        return new BottomSheetValue[]{Collapsed, Expanded};
    }

    public static EnumEntries<BottomSheetValue> getEntries() {
        return $ENTRIES;
    }

    public static BottomSheetValue valueOf(String r1) {
        return (BottomSheetValue) Enum.valueOf(BottomSheetValue.class, r1);
    }

    public static BottomSheetValue[] values() {
        return (BottomSheetValue[]) $VALUES.clone();
    }

    private BottomSheetValue(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        Collapsed = new BottomSheetValue("Collapsed", 0);
        Expanded = new BottomSheetValue("Expanded", 1);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
