package androidx.compose.foundation.text;

import androidx.compose.ui.input.key.Key_androidKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: KeyMapping.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b4\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006R\u0019\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0013\u0010\u0006R\u0019\u0010\u0014\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0015\u0010\u0006R\u0019\u0010\u0016\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0017\u0010\u0006R\u0019\u0010\u0018\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0019\u0010\u0006R\u0019\u0010\u001a\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001b\u0010\u0006R\u0019\u0010\u001c\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001d\u0010\u0006R\u0019\u0010\u001e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001f\u0010\u0006R\u0019\u0010 \u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b!\u0010\u0006R\u0019\u0010\"\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b#\u0010\u0006R\u0019\u0010$\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b%\u0010\u0006R\u0019\u0010&\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b'\u0010\u0006R\u0019\u0010(\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b)\u0010\u0006R\u0019\u0010*\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b+\u0010\u0006R\u0019\u0010,\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b-\u0010\u0006R\u0019\u0010.\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b/\u0010\u0006R\u0019\u00100\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b1\u0010\u0006R\u0019\u00102\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b3\u0010\u0006R\u0019\u00104\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b5\u0010\u0006R\u0019\u00106\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b7\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, d2 = {"Landroidx/compose/foundation/text/MappedKeys;", "", "()V", "A", "Landroidx/compose/ui/input/key/Key;", "getA-EK5gGoQ", "()J", "J", "Backslash", "getBackslash-EK5gGoQ", "Backspace", "getBackspace-EK5gGoQ", "C", "getC-EK5gGoQ", "Copy", "getCopy-EK5gGoQ", "Cut", "getCut-EK5gGoQ", "Delete", "getDelete-EK5gGoQ", "DirectionDown", "getDirectionDown-EK5gGoQ", "DirectionLeft", "getDirectionLeft-EK5gGoQ", "DirectionRight", "getDirectionRight-EK5gGoQ", "DirectionUp", "getDirectionUp-EK5gGoQ", "Enter", "getEnter-EK5gGoQ", "H", "getH-EK5gGoQ", "Insert", "getInsert-EK5gGoQ", "MoveEnd", "getMoveEnd-EK5gGoQ", "MoveHome", "getMoveHome-EK5gGoQ", "NumPadEnter", "getNumPadEnter-EK5gGoQ", "PageDown", "getPageDown-EK5gGoQ", "PageUp", "getPageUp-EK5gGoQ", "Paste", "getPaste-EK5gGoQ", "Tab", "getTab-EK5gGoQ", "V", "getV-EK5gGoQ", "X", "getX-EK5gGoQ", "Y", "getY-EK5gGoQ", "Z", "getZ-EK5gGoQ", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MappedKeys {
    public static final int $stable = 0;
    private static final long A = 0;
    private static final long Backslash = 0;
    private static final long Backspace = 0;
    private static final long C = 0;
    private static final long Copy = 0;
    private static final long Cut = 0;
    private static final long Delete = 0;
    private static final long DirectionDown = 0;
    private static final long DirectionLeft = 0;
    private static final long DirectionRight = 0;
    private static final long DirectionUp = 0;
    private static final long Enter = 0;
    private static final long H = 0;
    public static final MappedKeys INSTANCE = null;
    private static final long Insert = 0;
    private static final long MoveEnd = 0;
    private static final long MoveHome = 0;
    private static final long NumPadEnter = 0;
    private static final long PageDown = 0;
    private static final long PageUp = 0;
    private static final long Paste = 0;
    private static final long Tab = 0;
    private static final long V = 0;
    private static final long X = 0;
    private static final long Y = 0;
    private static final long Z = 0;

    private MappedKeys() {
    }

    static {
        INSTANCE = new MappedKeys();
        A = Key_androidKt.Key(29);
        C = Key_androidKt.Key(31);
        H = Key_androidKt.Key(36);
        V = Key_androidKt.Key(50);
        Y = Key_androidKt.Key(53);
        X = Key_androidKt.Key(52);
        Z = Key_androidKt.Key(54);
        Backslash = Key_androidKt.Key(73);
        DirectionLeft = Key_androidKt.Key(21);
        DirectionRight = Key_androidKt.Key(22);
        DirectionUp = Key_androidKt.Key(19);
        DirectionDown = Key_androidKt.Key(20);
        PageUp = Key_androidKt.Key(92);
        PageDown = Key_androidKt.Key(93);
        MoveHome = Key_androidKt.Key(122);
        MoveEnd = Key_androidKt.Key(123);
        Insert = Key_androidKt.Key(124);
        Enter = Key_androidKt.Key(66);
        NumPadEnter = Key_androidKt.Key(160);
        Backspace = Key_androidKt.Key(67);
        Delete = Key_androidKt.Key(112);
        Paste = Key_androidKt.Key(279);
        Cut = Key_androidKt.Key(277);
        Copy = Key_androidKt.Key(278);
        Tab = Key_androidKt.Key(61);
    }

    /* JADX INFO: renamed from: getA-EK5gGoQ, reason: not valid java name */
    public final long m1082getAEK5gGoQ() {
        return A;
    }

    /* JADX INFO: renamed from: getC-EK5gGoQ, reason: not valid java name */
    public final long m1085getCEK5gGoQ() {
        return C;
    }

    /* JADX INFO: renamed from: getH-EK5gGoQ, reason: not valid java name */
    public final long m1094getHEK5gGoQ() {
        return H;
    }

    /* JADX INFO: renamed from: getV-EK5gGoQ, reason: not valid java name */
    public final long m1103getVEK5gGoQ() {
        return V;
    }

    /* JADX INFO: renamed from: getY-EK5gGoQ, reason: not valid java name */
    public final long m1105getYEK5gGoQ() {
        return Y;
    }

    /* JADX INFO: renamed from: getX-EK5gGoQ, reason: not valid java name */
    public final long m1104getXEK5gGoQ() {
        return X;
    }

    /* JADX INFO: renamed from: getZ-EK5gGoQ, reason: not valid java name */
    public final long m1106getZEK5gGoQ() {
        return Z;
    }

    /* JADX INFO: renamed from: getBackslash-EK5gGoQ, reason: not valid java name */
    public final long m1083getBackslashEK5gGoQ() {
        return Backslash;
    }

    /* JADX INFO: renamed from: getDirectionLeft-EK5gGoQ, reason: not valid java name */
    public final long m1090getDirectionLeftEK5gGoQ() {
        return DirectionLeft;
    }

    /* JADX INFO: renamed from: getDirectionRight-EK5gGoQ, reason: not valid java name */
    public final long m1091getDirectionRightEK5gGoQ() {
        return DirectionRight;
    }

    /* JADX INFO: renamed from: getDirectionUp-EK5gGoQ, reason: not valid java name */
    public final long m1092getDirectionUpEK5gGoQ() {
        return DirectionUp;
    }

    /* JADX INFO: renamed from: getDirectionDown-EK5gGoQ, reason: not valid java name */
    public final long m1089getDirectionDownEK5gGoQ() {
        return DirectionDown;
    }

    /* JADX INFO: renamed from: getPageUp-EK5gGoQ, reason: not valid java name */
    public final long m1100getPageUpEK5gGoQ() {
        return PageUp;
    }

    /* JADX INFO: renamed from: getPageDown-EK5gGoQ, reason: not valid java name */
    public final long m1099getPageDownEK5gGoQ() {
        return PageDown;
    }

    /* JADX INFO: renamed from: getMoveHome-EK5gGoQ, reason: not valid java name */
    public final long m1097getMoveHomeEK5gGoQ() {
        return MoveHome;
    }

    /* JADX INFO: renamed from: getMoveEnd-EK5gGoQ, reason: not valid java name */
    public final long m1096getMoveEndEK5gGoQ() {
        return MoveEnd;
    }

    /* JADX INFO: renamed from: getInsert-EK5gGoQ, reason: not valid java name */
    public final long m1095getInsertEK5gGoQ() {
        return Insert;
    }

    /* JADX INFO: renamed from: getEnter-EK5gGoQ, reason: not valid java name */
    public final long m1093getEnterEK5gGoQ() {
        return Enter;
    }

    /* JADX INFO: renamed from: getNumPadEnter-EK5gGoQ, reason: not valid java name */
    public final long m1098getNumPadEnterEK5gGoQ() {
        return NumPadEnter;
    }

    /* JADX INFO: renamed from: getBackspace-EK5gGoQ, reason: not valid java name */
    public final long m1084getBackspaceEK5gGoQ() {
        return Backspace;
    }

    /* JADX INFO: renamed from: getDelete-EK5gGoQ, reason: not valid java name */
    public final long m1088getDeleteEK5gGoQ() {
        return Delete;
    }

    /* JADX INFO: renamed from: getPaste-EK5gGoQ, reason: not valid java name */
    public final long m1101getPasteEK5gGoQ() {
        return Paste;
    }

    /* JADX INFO: renamed from: getCut-EK5gGoQ, reason: not valid java name */
    public final long m1087getCutEK5gGoQ() {
        return Cut;
    }

    /* JADX INFO: renamed from: getCopy-EK5gGoQ, reason: not valid java name */
    public final long m1086getCopyEK5gGoQ() {
        return Copy;
    }

    /* JADX INFO: renamed from: getTab-EK5gGoQ, reason: not valid java name */
    public final long m1102getTabEK5gGoQ() {
        return Tab;
    }
}
