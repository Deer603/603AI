package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: Intrinsic.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicSize;", "", "(Ljava/lang/String;I)V", "Min", "Max", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum IntrinsicSize extends Enum<IntrinsicSize> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ IntrinsicSize[] $VALUES = null;
    public static final IntrinsicSize Max = null;
    public static final IntrinsicSize Min = null;

    private static final /* synthetic */ IntrinsicSize[] $values() {
        return new IntrinsicSize[]{Min, Max};
    }

    public static EnumEntries<IntrinsicSize> getEntries() {
        return $ENTRIES;
    }

    public static IntrinsicSize valueOf(String r1) {
        return (IntrinsicSize) Enum.valueOf(IntrinsicSize.class, r1);
    }

    public static IntrinsicSize[] values() {
        return (IntrinsicSize[]) $VALUES.clone();
    }

    private IntrinsicSize(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        Min = new IntrinsicSize("Min", 0);
        Max = new IntrinsicSize("Max", 1);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
