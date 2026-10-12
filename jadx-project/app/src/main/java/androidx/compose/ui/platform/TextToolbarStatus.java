package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: TextToolbarStatus.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/platform/TextToolbarStatus;", "", "(Ljava/lang/String;I)V", "Shown", "Hidden", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum TextToolbarStatus extends Enum<TextToolbarStatus> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ TextToolbarStatus[] $VALUES = null;
    public static final TextToolbarStatus Hidden = null;
    public static final TextToolbarStatus Shown = null;

    private static final /* synthetic */ TextToolbarStatus[] $values() {
        return new TextToolbarStatus[]{Shown, Hidden};
    }

    public static EnumEntries<TextToolbarStatus> getEntries() {
        return $ENTRIES;
    }

    public static TextToolbarStatus valueOf(String r1) {
        return (TextToolbarStatus) Enum.valueOf(TextToolbarStatus.class, r1);
    }

    public static TextToolbarStatus[] values() {
        return (TextToolbarStatus[]) $VALUES.clone();
    }

    private TextToolbarStatus(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        Shown = new TextToolbarStatus("Shown", 0);
        Hidden = new TextToolbarStatus("Hidden", 1);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
