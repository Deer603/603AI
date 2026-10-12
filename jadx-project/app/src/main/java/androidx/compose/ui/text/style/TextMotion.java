package androidx.compose.ui.text.style;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TextMotion.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u001c\u0010\u0002\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/style/TextMotion;", "", "linearity", "Landroidx/compose/ui/text/style/TextMotion$Linearity;", "subpixelTextPositioning", "", "(IZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getLinearity-4e0Vf04$ui_text_release", "()I", "I", "getSubpixelTextPositioning$ui_text_release", "()Z", "copy", "copy-JdDtMQo$ui_text_release", "(IZ)Landroidx/compose/ui/text/style/TextMotion;", "equals", "other", "hashCode", "", "toString", "", "Companion", "Linearity", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextMotion {
    public static final int $stable = 0;
    private static final TextMotion Animated = null;
    public static final Companion Companion = null;
    private static final TextMotion Static = null;
    private final int linearity;
    private final boolean subpixelTextPositioning;

    /* JADX INFO: compiled from: TextMotion.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/style/TextMotion$Companion;", "", "()V", "Animated", "Landroidx/compose/ui/text/style/TextMotion;", "getAnimated", "()Landroidx/compose/ui/text/style/TextMotion;", "Static", "getStatic", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final TextMotion getStatic() {
            return TextMotion.access$getStatic$cp();
        }

        public final TextMotion getAnimated() {
            return TextMotion.access$getAnimated$cp();
        }
    }

    /* JADX INFO: compiled from: TextMotion.android.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/TextMotion$Linearity;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class Linearity {
        public static final Companion Companion = null;
        private static final int FontHinting = 0;
        private static final int Linear = 0;
        private static final int None = 0;
        private final int value;

        /* JADX INFO: compiled from: TextMotion.android.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/style/TextMotion$Linearity$Companion;", "", "()V", "FontHinting", "Landroidx/compose/ui/text/style/TextMotion$Linearity;", "getFontHinting-4e0Vf04", "()I", "I", "Linear", "getLinear-4e0Vf04", "None", "getNone-4e0Vf04", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker r1) {
                this();
            }

            private Companion() {
            }

            /* JADX INFO: renamed from: getLinear-4e0Vf04, reason: not valid java name */
            public final int m6872getLinear4e0Vf04() {
                return Linearity.access$getLinear$cp();
            }

            /* JADX INFO: renamed from: getFontHinting-4e0Vf04, reason: not valid java name */
            public final int m6871getFontHinting4e0Vf04() {
                return Linearity.access$getFontHinting$cp();
            }

            /* JADX INFO: renamed from: getNone-4e0Vf04, reason: not valid java name */
            public final int m6873getNone4e0Vf04() {
                return Linearity.access$getNone$cp();
            }
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Linearity m6864boximpl(int r1) {
            return new Linearity(r1);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        private static int m6865constructorimpl(int r0) {
            return r0;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m6866equalsimpl(int r2, Object r3) {
            if ((r3 instanceof Linearity) == true) goto L6;
            return false;
        L6:
            if (r2 == ((Linearity) r3).m6870unboximpl()) goto L8;
            return false;
        L8:
            return true;
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m6867equalsimpl0(int r1, int r2) {
            if (r1 != r2) goto L4;
            return true;
        L4:
            return false;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m6868hashCodeimpl(int r1) {
            return Integer.hashCode(r1);
        }

        public boolean equals(Object r2) {
            return m6866equalsimpl(this.value, r2);
        }

        public int hashCode() {
            return m6868hashCodeimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m6870unboximpl() {
            return this.value;
        }

        public static final /* synthetic */ int access$getFontHinting$cp() {
            return FontHinting;
        }

        public static final /* synthetic */ int access$getLinear$cp() {
            return Linear;
        }

        public static final /* synthetic */ int access$getNone$cp() {
            return None;
        }

        private /* synthetic */ Linearity(int value) {
            this.value = value;
        }

        static {
            Companion = new Companion(null);
            Linear = m6865constructorimpl(1);
            FontHinting = m6865constructorimpl(2);
            None = m6865constructorimpl(3);
        }

        public String toString() {
            return m6869toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m6869toStringimpl(int arg0) {
            if (m6867equalsimpl0(arg0, Linear) == false) goto L6;
            return "Linearity.Linear";
        L6:
            if (m6867equalsimpl0(arg0, FontHinting) == false) goto L9;
            return "Linearity.FontHinting";
        L9:
            if (m6867equalsimpl0(arg0, None) == false) goto L11;
            return "Linearity.None";
        L11:
            return "Invalid";
        }
    }

    public /* synthetic */ TextMotion(int r1, boolean r2, DefaultConstructorMarker r3) {
        this(r1, r2);
    }

    private TextMotion(int linearity, boolean subpixelTextPositioning) {
        this.linearity = linearity;
        this.subpixelTextPositioning = subpixelTextPositioning;
    }

    public static final /* synthetic */ TextMotion access$getAnimated$cp() {
        return Animated;
    }

    public static final /* synthetic */ TextMotion access$getStatic$cp() {
        return Static;
    }

    /* JADX INFO: renamed from: getLinearity-4e0Vf04$ui_text_release, reason: not valid java name */
    public final int m6863getLinearity4e0Vf04$ui_text_release() {
        return this.linearity;
    }

    public final boolean getSubpixelTextPositioning$ui_text_release() {
        return this.subpixelTextPositioning;
    }

    static {
        DefaultConstructorMarker r1 = null;
        Companion = new Companion(r1);
        Static = new TextMotion(Linearity.Companion.m6871getFontHinting4e0Vf04(), false, r1);
        Animated = new TextMotion(Linearity.Companion.m6872getLinear4e0Vf04(), true, r1);
    }

    /* JADX INFO: renamed from: copy-JdDtMQo$ui_text_release$default, reason: not valid java name */
    public static /* synthetic */ TextMotion m6861copyJdDtMQo$ui_text_release$default(TextMotion r0, int r1, boolean r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.linearity;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.subpixelTextPositioning;
    L9:
        return r0.m6862copyJdDtMQo$ui_text_release(r1, r2);
    }

    /* JADX INFO: renamed from: copy-JdDtMQo$ui_text_release, reason: not valid java name */
    public final TextMotion m6862copyJdDtMQo$ui_text_release(int linearity, boolean subpixelTextPositioning) {
        return new TextMotion(linearity, subpixelTextPositioning, null);
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof TextMotion) == true) goto L9;
        return false;
    L9:
        if (Linearity.m6867equalsimpl0(this.linearity, ((TextMotion) other).linearity) == true) goto L12;
        return false;
    L12:
        if (this.subpixelTextPositioning == ((TextMotion) other).subpixelTextPositioning) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int result = Linearity.m6868hashCodeimpl(this.linearity);
        return (result * 31) + Boolean.hashCode(this.subpixelTextPositioning);
    }

    public String toString() {
        if (Intrinsics.areEqual(this, Static) == false) goto L6;
        return "TextMotion.Static";
    L6:
        if (Intrinsics.areEqual(this, Animated) == false) goto L8;
        return "TextMotion.Animated";
    L8:
        return "Invalid";
    }
}
