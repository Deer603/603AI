package androidx.compose.material;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: ModalBottomSheet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/material/ModalBottomSheetValue;", "", "(Ljava/lang/String;I)V", "Hidden", "Expanded", "HalfExpanded", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum ModalBottomSheetValue extends Enum<ModalBottomSheetValue> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ ModalBottomSheetValue[] $VALUES = null;
    public static final ModalBottomSheetValue Expanded = null;
    public static final ModalBottomSheetValue HalfExpanded = null;
    public static final ModalBottomSheetValue Hidden = null;

    private static final /* synthetic */ ModalBottomSheetValue[] $values() {
        return new ModalBottomSheetValue[]{Hidden, Expanded, HalfExpanded};
    }

    public static EnumEntries<ModalBottomSheetValue> getEntries() {
        return $ENTRIES;
    }

    public static ModalBottomSheetValue valueOf(String r1) {
        return (ModalBottomSheetValue) Enum.valueOf(ModalBottomSheetValue.class, r1);
    }

    public static ModalBottomSheetValue[] values() {
        return (ModalBottomSheetValue[]) $VALUES.clone();
    }

    private ModalBottomSheetValue(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        Hidden = new ModalBottomSheetValue("Hidden", 0);
        Expanded = new ModalBottomSheetValue("Expanded", 1);
        HalfExpanded = new ModalBottomSheetValue("HalfExpanded", 2);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
