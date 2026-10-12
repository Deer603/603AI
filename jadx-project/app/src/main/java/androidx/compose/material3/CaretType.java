package androidx.compose.material3;

import kotlin.Metadata;

/* JADX INFO: compiled from: Tooltip.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0083\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/material3/CaretType;", "", "(Ljava/lang/String;I)V", "Plain", "Rich", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final enum CaretType extends Enum<CaretType> {
    private static final /* synthetic */ CaretType[] $VALUES = null;
    public static final CaretType Plain = null;
    public static final CaretType Rich = null;

    private static final /* synthetic */ CaretType[] $values() {
        return new CaretType[]{Plain, Rich};
    }

    public static CaretType valueOf(String r1) {
        return (CaretType) Enum.valueOf(CaretType.class, r1);
    }

    public static CaretType[] values() {
        return (CaretType[]) $VALUES.clone();
    }

    private CaretType(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        Plain = new CaretType("Plain", 0);
        Rich = new CaretType("Rich", 1);
        $VALUES = $values();
    }
}
