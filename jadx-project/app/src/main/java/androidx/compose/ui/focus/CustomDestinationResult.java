package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: FocusTransactions.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/focus/CustomDestinationResult;", "", "(Ljava/lang/String;I)V", "None", "Cancelled", "Redirected", "RedirectCancelled", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum CustomDestinationResult extends Enum<CustomDestinationResult> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ CustomDestinationResult[] $VALUES = null;
    public static final CustomDestinationResult Cancelled = null;
    public static final CustomDestinationResult None = null;
    public static final CustomDestinationResult RedirectCancelled = null;
    public static final CustomDestinationResult Redirected = null;

    private static final /* synthetic */ CustomDestinationResult[] $values() {
        return new CustomDestinationResult[]{None, Cancelled, Redirected, RedirectCancelled};
    }

    public static EnumEntries<CustomDestinationResult> getEntries() {
        return $ENTRIES;
    }

    public static CustomDestinationResult valueOf(String r1) {
        return (CustomDestinationResult) Enum.valueOf(CustomDestinationResult.class, r1);
    }

    public static CustomDestinationResult[] values() {
        return (CustomDestinationResult[]) $VALUES.clone();
    }

    private CustomDestinationResult(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        None = new CustomDestinationResult("None", 0);
        Cancelled = new CustomDestinationResult("Cancelled", 1);
        Redirected = new CustomDestinationResult("Redirected", 2);
        RedirectCancelled = new CustomDestinationResult("RedirectCancelled", 3);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
