package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: SelectionLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text/selection/CrossStatus;", "", "(Ljava/lang/String;I)V", "CROSSED", "NOT_CROSSED", "COLLAPSED", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum CrossStatus extends Enum<CrossStatus> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ CrossStatus[] $VALUES = null;
    public static final CrossStatus COLLAPSED = null;
    public static final CrossStatus CROSSED = null;
    public static final CrossStatus NOT_CROSSED = null;

    private static final /* synthetic */ CrossStatus[] $values() {
        return new CrossStatus[]{CROSSED, NOT_CROSSED, COLLAPSED};
    }

    public static EnumEntries<CrossStatus> getEntries() {
        return $ENTRIES;
    }

    public static CrossStatus valueOf(String r1) {
        return (CrossStatus) Enum.valueOf(CrossStatus.class, r1);
    }

    public static CrossStatus[] values() {
        return (CrossStatus[]) $VALUES.clone();
    }

    private CrossStatus(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        CROSSED = new CrossStatus("CROSSED", 0);
        NOT_CROSSED = new CrossStatus("NOT_CROSSED", 1);
        COLLAPSED = new CrossStatus("COLLAPSED", 2);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
