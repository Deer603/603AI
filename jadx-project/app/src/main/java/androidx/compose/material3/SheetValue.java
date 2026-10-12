package androidx.compose.material3;

import kotlin.Metadata;

/* JADX INFO: compiled from: SheetDefaults.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/material3/SheetValue;", "", "(Ljava/lang/String;I)V", "Hidden", "Expanded", "PartiallyExpanded", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final enum SheetValue extends Enum<SheetValue> {
    private static final /* synthetic */ SheetValue[] $VALUES = null;
    public static final SheetValue Expanded = null;
    public static final SheetValue Hidden = null;
    public static final SheetValue PartiallyExpanded = null;

    private static final /* synthetic */ SheetValue[] $values() {
        return new SheetValue[]{Hidden, Expanded, PartiallyExpanded};
    }

    public static SheetValue valueOf(String r1) {
        return (SheetValue) Enum.valueOf(SheetValue.class, r1);
    }

    public static SheetValue[] values() {
        return (SheetValue[]) $VALUES.clone();
    }

    private SheetValue(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        Hidden = new SheetValue("Hidden", 0);
        Expanded = new SheetValue("Expanded", 1);
        PartiallyExpanded = new SheetValue("PartiallyExpanded", 2);
        $VALUES = $values();
    }
}
