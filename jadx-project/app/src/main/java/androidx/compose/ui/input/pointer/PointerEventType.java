package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEventType;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class PointerEventType {
    public static final Companion Companion = null;
    private static final int Enter = 0;
    private static final int Exit = 0;
    private static final int Move = 0;
    private static final int Press = 0;
    private static final int Release = 0;
    private static final int Scroll = 0;
    private static final int Unknown = 0;
    private final int value;

    /* JADX INFO: compiled from: PointerEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006R\u0019\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0013\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEventType$Companion;", "", "()V", "Enter", "Landroidx/compose/ui/input/pointer/PointerEventType;", "getEnter-7fucELk", "()I", "I", "Exit", "getExit-7fucELk", "Move", "getMove-7fucELk", "Press", "getPress-7fucELk", "Release", "getRelease-7fucELk", "Scroll", "getScroll-7fucELk", "Unknown", "getUnknown-7fucELk", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getUnknown-7fucELk, reason: not valid java name */
        public final int m5548getUnknown7fucELk() {
            return PointerEventType.access$getUnknown$cp();
        }

        /* JADX INFO: renamed from: getPress-7fucELk, reason: not valid java name */
        public final int m5545getPress7fucELk() {
            return PointerEventType.access$getPress$cp();
        }

        /* JADX INFO: renamed from: getRelease-7fucELk, reason: not valid java name */
        public final int m5546getRelease7fucELk() {
            return PointerEventType.access$getRelease$cp();
        }

        /* JADX INFO: renamed from: getMove-7fucELk, reason: not valid java name */
        public final int m5544getMove7fucELk() {
            return PointerEventType.access$getMove$cp();
        }

        /* JADX INFO: renamed from: getEnter-7fucELk, reason: not valid java name */
        public final int m5542getEnter7fucELk() {
            return PointerEventType.access$getEnter$cp();
        }

        /* JADX INFO: renamed from: getExit-7fucELk, reason: not valid java name */
        public final int m5543getExit7fucELk() {
            return PointerEventType.access$getExit$cp();
        }

        /* JADX INFO: renamed from: getScroll-7fucELk, reason: not valid java name */
        public final int m5547getScroll7fucELk() {
            return PointerEventType.access$getScroll$cp();
        }
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerEventType m5535boximpl(int r1) {
        return new PointerEventType(r1);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m5536constructorimpl(int r0) {
        return r0;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m5537equalsimpl(int r2, Object r3) {
        if ((r3 instanceof PointerEventType) == true) goto L6;
        return false;
    L6:
        if (r2 == ((PointerEventType) r3).m5541unboximpl()) goto L8;
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5538equalsimpl0(int r1, int r2) {
        if (r1 != r2) goto L4;
        return true;
    L4:
        return false;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m5539hashCodeimpl(int r1) {
        return Integer.hashCode(r1);
    }

    public boolean equals(Object r2) {
        return m5537equalsimpl(this.value, r2);
    }

    public int hashCode() {
        return m5539hashCodeimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5541unboximpl() {
        return this.value;
    }

    public static final /* synthetic */ int access$getEnter$cp() {
        return Enter;
    }

    public static final /* synthetic */ int access$getExit$cp() {
        return Exit;
    }

    public static final /* synthetic */ int access$getMove$cp() {
        return Move;
    }

    public static final /* synthetic */ int access$getPress$cp() {
        return Press;
    }

    public static final /* synthetic */ int access$getRelease$cp() {
        return Release;
    }

    public static final /* synthetic */ int access$getScroll$cp() {
        return Scroll;
    }

    public static final /* synthetic */ int access$getUnknown$cp() {
        return Unknown;
    }

    private /* synthetic */ PointerEventType(int value) {
        this.value = value;
    }

    static {
        Companion = new Companion(null);
        Unknown = m5536constructorimpl(0);
        Press = m5536constructorimpl(1);
        Release = m5536constructorimpl(2);
        Move = m5536constructorimpl(3);
        Enter = m5536constructorimpl(4);
        Exit = m5536constructorimpl(5);
        Scroll = m5536constructorimpl(6);
    }

    public String toString() {
        return m5540toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m5540toStringimpl(int arg0) {
        if (m5538equalsimpl0(arg0, Press) == false) goto L6;
        return "Press";
    L6:
        if (m5538equalsimpl0(arg0, Release) == false) goto L9;
        return "Release";
    L9:
        if (m5538equalsimpl0(arg0, Move) == false) goto L12;
        return "Move";
    L12:
        if (m5538equalsimpl0(arg0, Enter) == false) goto L15;
        return "Enter";
    L15:
        if (m5538equalsimpl0(arg0, Exit) == false) goto L18;
        return "Exit";
    L18:
        if (m5538equalsimpl0(arg0, Scroll) == false) goto L20;
        return "Scroll";
    L20:
        return "Unknown";
    }
}
