package androidx.compose.foundation.text.input.internal.undo;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: TextUndoOperation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/TextEditType;", "", "(Ljava/lang/String;I)V", "Insert", "Delete", "Replace", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum TextEditType extends Enum<TextEditType> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ TextEditType[] $VALUES = null;
    public static final TextEditType Delete = null;
    public static final TextEditType Insert = null;
    public static final TextEditType Replace = null;

    private static final /* synthetic */ TextEditType[] $values() {
        return new TextEditType[]{Insert, Delete, Replace};
    }

    public static EnumEntries<TextEditType> getEntries() {
        return $ENTRIES;
    }

    public static TextEditType valueOf(String r1) {
        return (TextEditType) Enum.valueOf(TextEditType.class, r1);
    }

    public static TextEditType[] values() {
        return (TextEditType[]) $VALUES.clone();
    }

    private TextEditType(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        Insert = new TextEditType("Insert", 0);
        Delete = new TextEditType("Delete", 1);
        Replace = new TextEditType("Replace", 2);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
