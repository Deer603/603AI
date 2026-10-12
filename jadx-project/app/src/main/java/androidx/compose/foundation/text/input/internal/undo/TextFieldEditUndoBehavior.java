package androidx.compose.foundation.text.input.internal.undo;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: TextUndoOperation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;", "", "(Ljava/lang/String;I)V", "MergeIfPossible", "ClearHistory", "NeverMerge", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum TextFieldEditUndoBehavior extends Enum<TextFieldEditUndoBehavior> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ TextFieldEditUndoBehavior[] $VALUES = null;
    public static final TextFieldEditUndoBehavior ClearHistory = null;
    public static final TextFieldEditUndoBehavior MergeIfPossible = null;
    public static final TextFieldEditUndoBehavior NeverMerge = null;

    private static final /* synthetic */ TextFieldEditUndoBehavior[] $values() {
        return new TextFieldEditUndoBehavior[]{MergeIfPossible, ClearHistory, NeverMerge};
    }

    public static EnumEntries<TextFieldEditUndoBehavior> getEntries() {
        return $ENTRIES;
    }

    public static TextFieldEditUndoBehavior valueOf(String r1) {
        return (TextFieldEditUndoBehavior) Enum.valueOf(TextFieldEditUndoBehavior.class, r1);
    }

    public static TextFieldEditUndoBehavior[] values() {
        return (TextFieldEditUndoBehavior[]) $VALUES.clone();
    }

    private TextFieldEditUndoBehavior(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        MergeIfPossible = new TextFieldEditUndoBehavior("MergeIfPossible", 0);
        ClearHistory = new TextFieldEditUndoBehavior("ClearHistory", 1);
        NeverMerge = new TextFieldEditUndoBehavior("NeverMerge", 2);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
