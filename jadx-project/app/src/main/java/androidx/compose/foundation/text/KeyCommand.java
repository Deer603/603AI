package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: KeyCommand.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b4\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6¨\u00067"}, d2 = {"Landroidx/compose/foundation/text/KeyCommand;", "", "editsText", "", "(Ljava/lang/String;IZ)V", "getEditsText", "()Z", "LEFT_CHAR", "RIGHT_CHAR", "RIGHT_WORD", "LEFT_WORD", "NEXT_PARAGRAPH", "PREV_PARAGRAPH", "LINE_START", "LINE_END", "LINE_LEFT", "LINE_RIGHT", "UP", "DOWN", "PAGE_UP", "PAGE_DOWN", "HOME", "END", "COPY", "PASTE", "CUT", "DELETE_PREV_CHAR", "DELETE_NEXT_CHAR", "DELETE_PREV_WORD", "DELETE_NEXT_WORD", "DELETE_FROM_LINE_START", "DELETE_TO_LINE_END", "SELECT_ALL", "SELECT_LEFT_CHAR", "SELECT_RIGHT_CHAR", "SELECT_UP", "SELECT_DOWN", "SELECT_PAGE_UP", "SELECT_PAGE_DOWN", "SELECT_HOME", "SELECT_END", "SELECT_LEFT_WORD", "SELECT_RIGHT_WORD", "SELECT_NEXT_PARAGRAPH", "SELECT_PREV_PARAGRAPH", "SELECT_LINE_START", "SELECT_LINE_END", "SELECT_LINE_LEFT", "SELECT_LINE_RIGHT", "DESELECT", "NEW_LINE", "TAB", "UNDO", "REDO", "CHARACTER_PALETTE", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum KeyCommand extends Enum<KeyCommand> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ KeyCommand[] $VALUES = null;
    public static final KeyCommand CHARACTER_PALETTE = null;
    public static final KeyCommand COPY = null;
    public static final KeyCommand CUT = null;
    public static final KeyCommand DELETE_FROM_LINE_START = null;
    public static final KeyCommand DELETE_NEXT_CHAR = null;
    public static final KeyCommand DELETE_NEXT_WORD = null;
    public static final KeyCommand DELETE_PREV_CHAR = null;
    public static final KeyCommand DELETE_PREV_WORD = null;
    public static final KeyCommand DELETE_TO_LINE_END = null;
    public static final KeyCommand DESELECT = null;
    public static final KeyCommand DOWN = null;
    public static final KeyCommand END = null;
    public static final KeyCommand HOME = null;
    public static final KeyCommand LEFT_CHAR = null;
    public static final KeyCommand LEFT_WORD = null;
    public static final KeyCommand LINE_END = null;
    public static final KeyCommand LINE_LEFT = null;
    public static final KeyCommand LINE_RIGHT = null;
    public static final KeyCommand LINE_START = null;
    public static final KeyCommand NEW_LINE = null;
    public static final KeyCommand NEXT_PARAGRAPH = null;
    public static final KeyCommand PAGE_DOWN = null;
    public static final KeyCommand PAGE_UP = null;
    public static final KeyCommand PASTE = null;
    public static final KeyCommand PREV_PARAGRAPH = null;
    public static final KeyCommand REDO = null;
    public static final KeyCommand RIGHT_CHAR = null;
    public static final KeyCommand RIGHT_WORD = null;
    public static final KeyCommand SELECT_ALL = null;
    public static final KeyCommand SELECT_DOWN = null;
    public static final KeyCommand SELECT_END = null;
    public static final KeyCommand SELECT_HOME = null;
    public static final KeyCommand SELECT_LEFT_CHAR = null;
    public static final KeyCommand SELECT_LEFT_WORD = null;
    public static final KeyCommand SELECT_LINE_END = null;
    public static final KeyCommand SELECT_LINE_LEFT = null;
    public static final KeyCommand SELECT_LINE_RIGHT = null;
    public static final KeyCommand SELECT_LINE_START = null;
    public static final KeyCommand SELECT_NEXT_PARAGRAPH = null;
    public static final KeyCommand SELECT_PAGE_DOWN = null;
    public static final KeyCommand SELECT_PAGE_UP = null;
    public static final KeyCommand SELECT_PREV_PARAGRAPH = null;
    public static final KeyCommand SELECT_RIGHT_CHAR = null;
    public static final KeyCommand SELECT_RIGHT_WORD = null;
    public static final KeyCommand SELECT_UP = null;
    public static final KeyCommand TAB = null;
    public static final KeyCommand UNDO = null;
    public static final KeyCommand UP = null;
    private final boolean editsText;

    private static final /* synthetic */ KeyCommand[] $values() {
        return new KeyCommand[]{LEFT_CHAR, RIGHT_CHAR, RIGHT_WORD, LEFT_WORD, NEXT_PARAGRAPH, PREV_PARAGRAPH, LINE_START, LINE_END, LINE_LEFT, LINE_RIGHT, UP, DOWN, PAGE_UP, PAGE_DOWN, HOME, END, COPY, PASTE, CUT, DELETE_PREV_CHAR, DELETE_NEXT_CHAR, DELETE_PREV_WORD, DELETE_NEXT_WORD, DELETE_FROM_LINE_START, DELETE_TO_LINE_END, SELECT_ALL, SELECT_LEFT_CHAR, SELECT_RIGHT_CHAR, SELECT_UP, SELECT_DOWN, SELECT_PAGE_UP, SELECT_PAGE_DOWN, SELECT_HOME, SELECT_END, SELECT_LEFT_WORD, SELECT_RIGHT_WORD, SELECT_NEXT_PARAGRAPH, SELECT_PREV_PARAGRAPH, SELECT_LINE_START, SELECT_LINE_END, SELECT_LINE_LEFT, SELECT_LINE_RIGHT, DESELECT, NEW_LINE, TAB, UNDO, REDO, CHARACTER_PALETTE};
    }

    public static EnumEntries<KeyCommand> getEntries() {
        return $ENTRIES;
    }

    public static KeyCommand valueOf(String r1) {
        return (KeyCommand) Enum.valueOf(KeyCommand.class, r1);
    }

    public static KeyCommand[] values() {
        return (KeyCommand[]) $VALUES.clone();
    }

    private KeyCommand(String $enum$name, int $enum$ordinal, boolean editsText) {
        super($enum$name, $enum$ordinal);
        this.editsText = editsText;
    }

    public final boolean getEditsText() {
        return this.editsText;
    }

    static {
        LEFT_CHAR = new KeyCommand("LEFT_CHAR", 0, false);
        RIGHT_CHAR = new KeyCommand("RIGHT_CHAR", 1, false);
        RIGHT_WORD = new KeyCommand("RIGHT_WORD", 2, false);
        LEFT_WORD = new KeyCommand("LEFT_WORD", 3, false);
        NEXT_PARAGRAPH = new KeyCommand("NEXT_PARAGRAPH", 4, false);
        PREV_PARAGRAPH = new KeyCommand("PREV_PARAGRAPH", 5, false);
        LINE_START = new KeyCommand("LINE_START", 6, false);
        LINE_END = new KeyCommand("LINE_END", 7, false);
        LINE_LEFT = new KeyCommand("LINE_LEFT", 8, false);
        LINE_RIGHT = new KeyCommand("LINE_RIGHT", 9, false);
        UP = new KeyCommand("UP", 10, false);
        DOWN = new KeyCommand("DOWN", 11, false);
        PAGE_UP = new KeyCommand("PAGE_UP", 12, false);
        PAGE_DOWN = new KeyCommand("PAGE_DOWN", 13, false);
        HOME = new KeyCommand("HOME", 14, false);
        END = new KeyCommand("END", 15, false);
        COPY = new KeyCommand("COPY", 16, false);
        PASTE = new KeyCommand("PASTE", 17, true);
        CUT = new KeyCommand("CUT", 18, true);
        DELETE_PREV_CHAR = new KeyCommand("DELETE_PREV_CHAR", 19, true);
        DELETE_NEXT_CHAR = new KeyCommand("DELETE_NEXT_CHAR", 20, true);
        DELETE_PREV_WORD = new KeyCommand("DELETE_PREV_WORD", 21, true);
        DELETE_NEXT_WORD = new KeyCommand("DELETE_NEXT_WORD", 22, true);
        DELETE_FROM_LINE_START = new KeyCommand("DELETE_FROM_LINE_START", 23, true);
        DELETE_TO_LINE_END = new KeyCommand("DELETE_TO_LINE_END", 24, true);
        SELECT_ALL = new KeyCommand("SELECT_ALL", 25, false);
        SELECT_LEFT_CHAR = new KeyCommand("SELECT_LEFT_CHAR", 26, false);
        SELECT_RIGHT_CHAR = new KeyCommand("SELECT_RIGHT_CHAR", 27, false);
        SELECT_UP = new KeyCommand("SELECT_UP", 28, false);
        SELECT_DOWN = new KeyCommand("SELECT_DOWN", 29, false);
        SELECT_PAGE_UP = new KeyCommand("SELECT_PAGE_UP", 30, false);
        SELECT_PAGE_DOWN = new KeyCommand("SELECT_PAGE_DOWN", 31, false);
        SELECT_HOME = new KeyCommand("SELECT_HOME", 32, false);
        SELECT_END = new KeyCommand("SELECT_END", 33, false);
        SELECT_LEFT_WORD = new KeyCommand("SELECT_LEFT_WORD", 34, false);
        SELECT_RIGHT_WORD = new KeyCommand("SELECT_RIGHT_WORD", 35, false);
        SELECT_NEXT_PARAGRAPH = new KeyCommand("SELECT_NEXT_PARAGRAPH", 36, false);
        SELECT_PREV_PARAGRAPH = new KeyCommand("SELECT_PREV_PARAGRAPH", 37, false);
        SELECT_LINE_START = new KeyCommand("SELECT_LINE_START", 38, false);
        SELECT_LINE_END = new KeyCommand("SELECT_LINE_END", 39, false);
        SELECT_LINE_LEFT = new KeyCommand("SELECT_LINE_LEFT", 40, false);
        SELECT_LINE_RIGHT = new KeyCommand("SELECT_LINE_RIGHT", 41, false);
        DESELECT = new KeyCommand("DESELECT", 42, false);
        NEW_LINE = new KeyCommand("NEW_LINE", 43, true);
        TAB = new KeyCommand("TAB", 44, true);
        UNDO = new KeyCommand("UNDO", 45, true);
        REDO = new KeyCommand("REDO", 46, true);
        CHARACTER_PALETTE = new KeyCommand("CHARACTER_PALETTE", 47, true);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
