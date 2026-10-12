package kotlin.io.path;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: CopyActionResult.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/io/path/CopyActionResult;", "", "<init>", "(Ljava/lang/String;I)V", "CONTINUE", "SKIP_SUBTREE", "TERMINATE", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final enum CopyActionResult extends Enum<CopyActionResult> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ CopyActionResult[] $VALUES = null;
    public static final CopyActionResult CONTINUE = null;
    public static final CopyActionResult SKIP_SUBTREE = null;
    public static final CopyActionResult TERMINATE = null;

    private static final /* synthetic */ CopyActionResult[] $values() {
        return new CopyActionResult[]{CONTINUE, SKIP_SUBTREE, TERMINATE};
    }

    public static EnumEntries<CopyActionResult> getEntries() {
        return $ENTRIES;
    }

    public static CopyActionResult valueOf(String r1) {
        return (CopyActionResult) Enum.valueOf(CopyActionResult.class, r1);
    }

    public static CopyActionResult[] values() {
        return (CopyActionResult[]) $VALUES.clone();
    }

    private CopyActionResult(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        CONTINUE = new CopyActionResult("CONTINUE", 0);
        SKIP_SUBTREE = new CopyActionResult("SKIP_SUBTREE", 1);
        TERMINATE = new CopyActionResult("TERMINATE", 2);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
