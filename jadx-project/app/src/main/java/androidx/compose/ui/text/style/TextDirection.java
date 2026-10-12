package androidx.compose.ui.text.style;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: TextDirection.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/TextDirection;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class TextDirection {
    public static final Companion Companion = null;
    private static final int Content = 0;
    private static final int ContentOrLtr = 0;
    private static final int ContentOrRtl = 0;
    private static final int Ltr = 0;
    private static final int Rtl = 0;
    private static final int Unspecified = 0;
    private final int value;

    /* JADX INFO: compiled from: TextDirection.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/TextDirection$Companion;", "", "()V", "Content", "Landroidx/compose/ui/text/style/TextDirection;", "getContent-s_7X-co", "()I", "I", "ContentOrLtr", "getContentOrLtr-s_7X-co", "ContentOrRtl", "getContentOrRtl-s_7X-co", "Ltr", "getLtr-s_7X-co", "Rtl", "getRtl-s_7X-co", "Unspecified", "getUnspecified-s_7X-co", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getLtr-s_7X-co, reason: not valid java name */
        public final int m6852getLtrs_7Xco() {
            return TextDirection.access$getLtr$cp();
        }

        /* JADX INFO: renamed from: getRtl-s_7X-co, reason: not valid java name */
        public final int m6853getRtls_7Xco() {
            return TextDirection.access$getRtl$cp();
        }

        /* JADX INFO: renamed from: getContent-s_7X-co, reason: not valid java name */
        public final int m6849getContents_7Xco() {
            return TextDirection.access$getContent$cp();
        }

        /* JADX INFO: renamed from: getContentOrLtr-s_7X-co, reason: not valid java name */
        public final int m6850getContentOrLtrs_7Xco() {
            return TextDirection.access$getContentOrLtr$cp();
        }

        /* JADX INFO: renamed from: getContentOrRtl-s_7X-co, reason: not valid java name */
        public final int m6851getContentOrRtls_7Xco() {
            return TextDirection.access$getContentOrRtl$cp();
        }

        /* JADX INFO: renamed from: getUnspecified-s_7X-co, reason: not valid java name */
        public final int m6854getUnspecifieds_7Xco() {
            return TextDirection.access$getUnspecified$cp();
        }
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextDirection m6842boximpl(int r1) {
        return new TextDirection(r1);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m6843constructorimpl(int r0) {
        return r0;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m6844equalsimpl(int r2, Object r3) {
        if ((r3 instanceof TextDirection) == true) goto L6;
        return false;
    L6:
        if (r2 == ((TextDirection) r3).m6848unboximpl()) goto L8;
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6845equalsimpl0(int r1, int r2) {
        if (r1 != r2) goto L4;
        return true;
    L4:
        return false;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m6846hashCodeimpl(int r1) {
        return Integer.hashCode(r1);
    }

    public boolean equals(Object r2) {
        return m6844equalsimpl(this.value, r2);
    }

    public int hashCode() {
        return m6846hashCodeimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6848unboximpl() {
        return this.value;
    }

    public static final /* synthetic */ int access$getContent$cp() {
        return Content;
    }

    public static final /* synthetic */ int access$getContentOrLtr$cp() {
        return ContentOrLtr;
    }

    public static final /* synthetic */ int access$getContentOrRtl$cp() {
        return ContentOrRtl;
    }

    public static final /* synthetic */ int access$getLtr$cp() {
        return Ltr;
    }

    public static final /* synthetic */ int access$getRtl$cp() {
        return Rtl;
    }

    public static final /* synthetic */ int access$getUnspecified$cp() {
        return Unspecified;
    }

    private /* synthetic */ TextDirection(int value) {
        this.value = value;
    }

    public String toString() {
        return m6847toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m6847toStringimpl(int arg0) {
        if (m6845equalsimpl0(arg0, Ltr) == false) goto L6;
        return "Ltr";
    L6:
        if (m6845equalsimpl0(arg0, Rtl) == false) goto L9;
        return "Rtl";
    L9:
        if (m6845equalsimpl0(arg0, Content) == false) goto L12;
        return "Content";
    L12:
        if (m6845equalsimpl0(arg0, ContentOrLtr) == false) goto L15;
        return "ContentOrLtr";
    L15:
        if (m6845equalsimpl0(arg0, ContentOrRtl) == false) goto L18;
        return "ContentOrRtl";
    L18:
        if (m6845equalsimpl0(arg0, Unspecified) == false) goto L20;
        return "Unspecified";
    L20:
        return "Invalid";
    }

    static {
        Companion = new Companion(null);
        Ltr = m6843constructorimpl(1);
        Rtl = m6843constructorimpl(2);
        Content = m6843constructorimpl(3);
        ContentOrLtr = m6843constructorimpl(4);
        ContentOrRtl = m6843constructorimpl(5);
        Unspecified = m6843constructorimpl(Integer.MIN_VALUE);
    }
}
