package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ContextMenu.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081@\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB1\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0002\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\fJ\u001a\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\fJ\u0010\u0010\u001b\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0007\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u0088\u0001\n¨\u0006 "}, d2 = {"Landroidx/compose/foundation/text/MenuItemsAvailability;", "", "canCopy", "", "canPaste", "canCut", "canSelectAll", "canAutofill", "constructor-impl", "(ZZZZZ)I", "value", "", "(I)I", "getCanAutofill-impl", "(I)Z", "getCanCopy-impl", "getCanCut-impl", "getCanPaste-impl", "getCanSelectAll-impl", "getValue", "()I", "equals", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class MenuItemsAvailability {
    private static final int AUTO_FILL = 16;
    private static final int COPY = 1;
    private static final int CUT = 4;
    public static final Companion Companion = null;
    private static final int NONE = 0;
    private static final int None = 0;
    private static final int PASTE = 2;
    private static final int SELECT_ALL = 8;
    private final int value;

    /* JADX INFO: compiled from: ContextMenu.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/text/MenuItemsAvailability$Companion;", "", "()V", "AUTO_FILL", "", "COPY", "CUT", "NONE", "None", "Landroidx/compose/foundation/text/MenuItemsAvailability;", "getNone-JKCFgKw", "()I", "I", "PASTE", "SELECT_ALL", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getNone-JKCFgKw, reason: not valid java name */
        public final int m1120getNoneJKCFgKw() {
            return MenuItemsAvailability.access$getNone$cp();
        }
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ MenuItemsAvailability m1107boximpl(int r1) {
        return new MenuItemsAvailability(r1);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m1108constructorimpl(int r0) {
        return r0;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1110equalsimpl(int r2, Object r3) {
        if ((r3 instanceof MenuItemsAvailability) == true) goto L6;
        return false;
    L6:
        if (r2 == ((MenuItemsAvailability) r3).m1119unboximpl()) goto L8;
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1111equalsimpl0(int r1, int r2) {
        if (r1 != r2) goto L4;
        return true;
    L4:
        return false;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1117hashCodeimpl(int r1) {
        return Integer.hashCode(r1);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1118toStringimpl(int r2) {
        return "MenuItemsAvailability(value=" + r2 + ')';
    }

    public boolean equals(Object r2) {
        return m1110equalsimpl(this.value, r2);
    }

    public int hashCode() {
        return m1117hashCodeimpl(this.value);
    }

    public String toString() {
        return m1118toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1119unboximpl() {
        return this.value;
    }

    public static final /* synthetic */ int access$getNone$cp() {
        return None;
    }

    private /* synthetic */ MenuItemsAvailability(int value) {
        this.value = value;
    }

    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m1109constructorimpl(boolean r3, boolean r4, boolean r5, boolean r6, boolean r7) {
        int r0 = 0;
        if (r4 == false) goto L5;
        int r1 = 2;
    L6:
        int r2 = r1 | (r3 ? 1 : 0);
        if (r5 == false) goto L9;
        int r8 = 4;
    L10:
        int r9 = r2 | r8;
        if (r6 == false) goto L13;
        int r10 = 8;
    L14:
        int r11 = r9 | r10;
        if (r7 == false) goto L18;
        r0 = 16;
    L18:
        return m1108constructorimpl(r0 | r11);
    L13:
        r10 = 0;
        goto L14
    L9:
        r8 = 0;
        goto L10
    L5:
        r1 = 0;
        goto L6
    }

    static {
        Companion = new Companion(null);
        None = m1108constructorimpl(0);
    }

    /* JADX INFO: renamed from: getCanCopy-impl, reason: not valid java name */
    public static final boolean m1113getCanCopyimpl(int arg0) {
        if ((arg0 & 1) == 1) goto L7;
        return false;
    L7:
        return true;
    }

    /* JADX INFO: renamed from: getCanPaste-impl, reason: not valid java name */
    public static final boolean m1115getCanPasteimpl(int arg0) {
        if ((arg0 & 2) != 2) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: getCanCut-impl, reason: not valid java name */
    public static final boolean m1114getCanCutimpl(int arg0) {
        if ((arg0 & 4) != 4) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: getCanSelectAll-impl, reason: not valid java name */
    public static final boolean m1116getCanSelectAllimpl(int arg0) {
        if ((arg0 & 8) != 8) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: getCanAutofill-impl, reason: not valid java name */
    public static final boolean m1112getCanAutofillimpl(int arg0) {
        if ((arg0 & 16) != 16) goto L5;
        return true;
    L5:
        return false;
    }
}
