package androidx.compose.foundation.text.input;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: TextFieldCharSequence.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/text/input/TextHighlightType;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class TextHighlightType {
    public static final Companion Companion = null;
    private static final int HandwritingDeletePreview = 0;
    private static final int HandwritingSelectPreview = 0;
    private final int value;

    /* JADX INFO: compiled from: TextFieldCharSequence.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/text/input/TextHighlightType$Companion;", "", "()V", "HandwritingDeletePreview", "Landroidx/compose/foundation/text/input/TextHighlightType;", "getHandwritingDeletePreview-s-xJuwY", "()I", "I", "HandwritingSelectPreview", "getHandwritingSelectPreview-s-xJuwY", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getHandwritingSelectPreview-s-xJuwY, reason: not valid java name */
        public final int m1202getHandwritingSelectPreviewsxJuwY() {
            return TextHighlightType.access$getHandwritingSelectPreview$cp();
        }

        /* JADX INFO: renamed from: getHandwritingDeletePreview-s-xJuwY, reason: not valid java name */
        public final int m1201getHandwritingDeletePreviewsxJuwY() {
            return TextHighlightType.access$getHandwritingDeletePreview$cp();
        }
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextHighlightType m1194boximpl(int r1) {
        return new TextHighlightType(r1);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m1195constructorimpl(int r0) {
        return r0;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1196equalsimpl(int r2, Object r3) {
        if ((r3 instanceof TextHighlightType) == true) goto L6;
        return false;
    L6:
        if (r2 == ((TextHighlightType) r3).m1200unboximpl()) goto L8;
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1197equalsimpl0(int r1, int r2) {
        if (r1 != r2) goto L4;
        return true;
    L4:
        return false;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1198hashCodeimpl(int r1) {
        return Integer.hashCode(r1);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1199toStringimpl(int r2) {
        return "TextHighlightType(value=" + r2 + ')';
    }

    public boolean equals(Object r2) {
        return m1196equalsimpl(this.value, r2);
    }

    public int hashCode() {
        return m1198hashCodeimpl(this.value);
    }

    public String toString() {
        return m1199toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1200unboximpl() {
        return this.value;
    }

    public static final /* synthetic */ int access$getHandwritingDeletePreview$cp() {
        return HandwritingDeletePreview;
    }

    public static final /* synthetic */ int access$getHandwritingSelectPreview$cp() {
        return HandwritingSelectPreview;
    }

    private /* synthetic */ TextHighlightType(int value) {
        this.value = value;
    }

    static {
        Companion = new Companion(null);
        HandwritingSelectPreview = m1195constructorimpl(0);
        HandwritingDeletePreview = m1195constructorimpl(1);
    }
}
