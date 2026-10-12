package androidx.compose.ui.text.style;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: ResolvedTextDirection.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/style/ResolvedTextDirection;", "", "(Ljava/lang/String;I)V", "Ltr", "Rtl", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum ResolvedTextDirection extends Enum<ResolvedTextDirection> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ ResolvedTextDirection[] $VALUES = null;
    public static final ResolvedTextDirection Ltr = null;
    public static final ResolvedTextDirection Rtl = null;

    private static final /* synthetic */ ResolvedTextDirection[] $values() {
        return new ResolvedTextDirection[]{Ltr, Rtl};
    }

    public static EnumEntries<ResolvedTextDirection> getEntries() {
        return $ENTRIES;
    }

    public static ResolvedTextDirection valueOf(String r1) {
        return (ResolvedTextDirection) Enum.valueOf(ResolvedTextDirection.class, r1);
    }

    public static ResolvedTextDirection[] values() {
        return (ResolvedTextDirection[]) $VALUES.clone();
    }

    private ResolvedTextDirection(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        Ltr = new ResolvedTextDirection("Ltr", 0);
        Rtl = new ResolvedTextDirection("Rtl", 1);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
