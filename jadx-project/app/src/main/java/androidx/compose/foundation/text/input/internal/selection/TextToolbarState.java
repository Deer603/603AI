package androidx.compose.foundation.text.input.internal.selection;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: TextFieldSelectionState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;", "", "(Ljava/lang/String;I)V", "None", "Cursor", "Selection", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum TextToolbarState extends Enum<TextToolbarState> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ TextToolbarState[] $VALUES = null;
    public static final TextToolbarState Cursor = null;
    public static final TextToolbarState None = null;
    public static final TextToolbarState Selection = null;

    private static final /* synthetic */ TextToolbarState[] $values() {
        return new TextToolbarState[]{None, Cursor, Selection};
    }

    public static EnumEntries<TextToolbarState> getEntries() {
        return $ENTRIES;
    }

    public static TextToolbarState valueOf(String r1) {
        return (TextToolbarState) Enum.valueOf(TextToolbarState.class, r1);
    }

    public static TextToolbarState[] values() {
        return (TextToolbarState[]) $VALUES.clone();
    }

    private TextToolbarState(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        None = new TextToolbarState("None", 0);
        Cursor = new TextToolbarState("Cursor", 1);
        Selection = new TextToolbarState("Selection", 2);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
