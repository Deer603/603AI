package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/selects/TrySelectDetailedResult;", "", "(Ljava/lang/String;I)V", "SUCCESSFUL", "REREGISTER", "CANCELLED", "ALREADY_SELECTED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum TrySelectDetailedResult extends Enum<TrySelectDetailedResult> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ TrySelectDetailedResult[] $VALUES = null;
    public static final TrySelectDetailedResult ALREADY_SELECTED = null;
    public static final TrySelectDetailedResult CANCELLED = null;
    public static final TrySelectDetailedResult REREGISTER = null;
    public static final TrySelectDetailedResult SUCCESSFUL = null;

    private static final /* synthetic */ TrySelectDetailedResult[] $values() {
        return new TrySelectDetailedResult[]{SUCCESSFUL, REREGISTER, CANCELLED, ALREADY_SELECTED};
    }

    public static EnumEntries<TrySelectDetailedResult> getEntries() {
        return $ENTRIES;
    }

    public static TrySelectDetailedResult valueOf(String r1) {
        return (TrySelectDetailedResult) Enum.valueOf(TrySelectDetailedResult.class, r1);
    }

    public static TrySelectDetailedResult[] values() {
        return (TrySelectDetailedResult[]) $VALUES.clone();
    }

    private TrySelectDetailedResult(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        SUCCESSFUL = new TrySelectDetailedResult("SUCCESSFUL", 0);
        REREGISTER = new TrySelectDetailedResult("REREGISTER", 1);
        CANCELLED = new TrySelectDetailedResult("CANCELLED", 2);
        ALREADY_SELECTED = new TrySelectDetailedResult("ALREADY_SELECTED", 3);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
