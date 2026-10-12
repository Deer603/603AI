package androidx.compose.foundation.text.input.internal.undo;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: TextUndoOperation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/TextDeleteType;", "", "(Ljava/lang/String;I)V", "Start", "End", "Inner", "NotByUser", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum TextDeleteType extends Enum<TextDeleteType> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ TextDeleteType[] $VALUES = null;
    public static final TextDeleteType End = null;
    public static final TextDeleteType Inner = null;
    public static final TextDeleteType NotByUser = null;
    public static final TextDeleteType Start = null;

    private static final /* synthetic */ TextDeleteType[] $values() {
        return new TextDeleteType[]{Start, End, Inner, NotByUser};
    }

    public static EnumEntries<TextDeleteType> getEntries() {
        return $ENTRIES;
    }

    public static TextDeleteType valueOf(String r1) {
        return (TextDeleteType) Enum.valueOf(TextDeleteType.class, r1);
    }

    public static TextDeleteType[] values() {
        return (TextDeleteType[]) $VALUES.clone();
    }

    private TextDeleteType(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        Start = new TextDeleteType("Start", 0);
        End = new TextDeleteType("End", 1);
        Inner = new TextDeleteType("Inner", 2);
        NotByUser = new TextDeleteType("NotByUser", 3);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
