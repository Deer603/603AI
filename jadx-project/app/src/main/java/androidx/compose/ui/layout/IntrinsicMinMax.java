package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: Layout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/layout/IntrinsicMinMax;", "", "(Ljava/lang/String;I)V", "Min", "Max", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum IntrinsicMinMax extends Enum<IntrinsicMinMax> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ IntrinsicMinMax[] $VALUES = null;
    public static final IntrinsicMinMax Max = null;
    public static final IntrinsicMinMax Min = null;

    private static final /* synthetic */ IntrinsicMinMax[] $values() {
        return new IntrinsicMinMax[]{Min, Max};
    }

    public static EnumEntries<IntrinsicMinMax> getEntries() {
        return $ENTRIES;
    }

    public static IntrinsicMinMax valueOf(String r1) {
        return (IntrinsicMinMax) Enum.valueOf(IntrinsicMinMax.class, r1);
    }

    public static IntrinsicMinMax[] values() {
        return (IntrinsicMinMax[]) $VALUES.clone();
    }

    private IntrinsicMinMax(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        Min = new IntrinsicMinMax("Min", 0);
        Max = new IntrinsicMinMax("Max", 1);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
