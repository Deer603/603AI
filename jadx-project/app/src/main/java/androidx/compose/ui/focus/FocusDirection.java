package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: FocusDirection.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/focus/FocusDirection;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class FocusDirection {
    public static final Companion Companion = null;
    private static final int Down = 0;
    private static final int Enter = 0;
    private static final int Exit = 0;
    private static final int Left = 0;
    private static final int Next = 0;
    private static final int Previous = 0;
    private static final int Right = 0;
    private static final int Up = 0;
    private final int value;

    /* JADX INFO: compiled from: FocusDirection.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006R\u0019\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0013\u0010\u0006R\u0019\u0010\u0014\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0015\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/focus/FocusDirection$Companion;", "", "()V", "Down", "Landroidx/compose/ui/focus/FocusDirection;", "getDown-dhqQ-8s", "()I", "I", "Enter", "getEnter-dhqQ-8s", "Exit", "getExit-dhqQ-8s", "Left", "getLeft-dhqQ-8s", "Next", "getNext-dhqQ-8s", "Previous", "getPrevious-dhqQ-8s", "Right", "getRight-dhqQ-8s", "Up", "getUp-dhqQ-8s", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getNext-dhqQ-8s, reason: not valid java name */
        public final int m4017getNextdhqQ8s() {
            return FocusDirection.access$getNext$cp();
        }

        /* JADX INFO: renamed from: getPrevious-dhqQ-8s, reason: not valid java name */
        public final int m4018getPreviousdhqQ8s() {
            return FocusDirection.access$getPrevious$cp();
        }

        /* JADX INFO: renamed from: getLeft-dhqQ-8s, reason: not valid java name */
        public final int m4016getLeftdhqQ8s() {
            return FocusDirection.access$getLeft$cp();
        }

        /* JADX INFO: renamed from: getRight-dhqQ-8s, reason: not valid java name */
        public final int m4019getRightdhqQ8s() {
            return FocusDirection.access$getRight$cp();
        }

        /* JADX INFO: renamed from: getUp-dhqQ-8s, reason: not valid java name */
        public final int m4020getUpdhqQ8s() {
            return FocusDirection.access$getUp$cp();
        }

        /* JADX INFO: renamed from: getDown-dhqQ-8s, reason: not valid java name */
        public final int m4013getDowndhqQ8s() {
            return FocusDirection.access$getDown$cp();
        }

        /* JADX INFO: renamed from: getEnter-dhqQ-8s, reason: not valid java name */
        public final int m4014getEnterdhqQ8s() {
            return FocusDirection.access$getEnter$cp();
        }

        /* JADX INFO: renamed from: getExit-dhqQ-8s, reason: not valid java name */
        public final int m4015getExitdhqQ8s() {
            return FocusDirection.access$getExit$cp();
        }
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FocusDirection m4006boximpl(int r1) {
        return new FocusDirection(r1);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m4007constructorimpl(int r0) {
        return r0;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4008equalsimpl(int r2, Object r3) {
        if ((r3 instanceof FocusDirection) == true) goto L6;
        return false;
    L6:
        if (r2 == ((FocusDirection) r3).m4012unboximpl()) goto L8;
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4009equalsimpl0(int r1, int r2) {
        if (r1 != r2) goto L4;
        return true;
    L4:
        return false;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4010hashCodeimpl(int r1) {
        return Integer.hashCode(r1);
    }

    public boolean equals(Object r2) {
        return m4008equalsimpl(this.value, r2);
    }

    public int hashCode() {
        return m4010hashCodeimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4012unboximpl() {
        return this.value;
    }

    public static final /* synthetic */ int access$getDown$cp() {
        return Down;
    }

    public static final /* synthetic */ int access$getEnter$cp() {
        return Enter;
    }

    public static final /* synthetic */ int access$getExit$cp() {
        return Exit;
    }

    public static final /* synthetic */ int access$getLeft$cp() {
        return Left;
    }

    public static final /* synthetic */ int access$getNext$cp() {
        return Next;
    }

    public static final /* synthetic */ int access$getPrevious$cp() {
        return Previous;
    }

    public static final /* synthetic */ int access$getRight$cp() {
        return Right;
    }

    public static final /* synthetic */ int access$getUp$cp() {
        return Up;
    }

    private /* synthetic */ FocusDirection(int value) {
        this.value = value;
    }

    public String toString() {
        return m4011toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4011toStringimpl(int arg0) {
        if (m4009equalsimpl0(arg0, Next) == false) goto L6;
        return "Next";
    L6:
        if (m4009equalsimpl0(arg0, Previous) == false) goto L9;
        return "Previous";
    L9:
        if (m4009equalsimpl0(arg0, Left) == false) goto L12;
        return "Left";
    L12:
        if (m4009equalsimpl0(arg0, Right) == false) goto L15;
        return "Right";
    L15:
        if (m4009equalsimpl0(arg0, Up) == false) goto L18;
        return "Up";
    L18:
        if (m4009equalsimpl0(arg0, Down) == false) goto L21;
        return "Down";
    L21:
        if (m4009equalsimpl0(arg0, Enter) == false) goto L24;
        return "Enter";
    L24:
        if (m4009equalsimpl0(arg0, Exit) == false) goto L26;
        return "Exit";
    L26:
        return "Invalid FocusDirection";
    }

    static {
        Companion = new Companion(null);
        Next = m4007constructorimpl(1);
        Previous = m4007constructorimpl(2);
        Left = m4007constructorimpl(3);
        Right = m4007constructorimpl(4);
        Up = m4007constructorimpl(5);
        Down = m4007constructorimpl(6);
        Enter = m4007constructorimpl(7);
        Exit = m4007constructorimpl(8);
    }
}
