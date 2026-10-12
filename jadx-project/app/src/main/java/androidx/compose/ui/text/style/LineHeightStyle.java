package androidx.compose.ui.text.style;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.webkit.Profile;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: LineHeightStyle.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0004\u001b\u001c\u001d\u001eB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle;", "", "alignment", "Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;", "trim", "Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", "(FILkotlin/jvm/internal/DefaultConstructorMarker;)V", "mode", "Landroidx/compose/ui/text/style/LineHeightStyle$Mode;", "(FIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAlignment-PIaL0Z0", "()F", "F", "getMode-lzQqcRY", "()I", "I", "getTrim-EVpEnUU", "copy", "copy-38bxuX8", "(FII)Landroidx/compose/ui/text/style/LineHeightStyle;", "equals", "", "other", "hashCode", "", "toString", "", "Alignment", "Companion", "Mode", "Trim", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LineHeightStyle {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final LineHeightStyle Default = null;
    private final float alignment;
    private final int mode;
    private final int trim;

    /* JADX INFO: compiled from: LineHeightStyle.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;", "", "topRatio", "", "constructor-impl", "(F)F", "equals", "", "other", "equals-impl", "(FLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(F)I", "toString", "", "toString-impl", "(F)Ljava/lang/String;", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class Alignment {
        private static final float Bottom = 0.0f;
        private static final float Center = 0.0f;
        public static final Companion Companion = null;
        private static final float Proportional = 0.0f;
        private static final float Top = 0.0f;
        private final float topRatio;

        /* JADX INFO: compiled from: LineHeightStyle.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Alignment$Companion;", "", "()V", "Bottom", "Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;", "getBottom-PIaL0Z0", "()F", "F", "Center", "getCenter-PIaL0Z0", "Proportional", "getProportional-PIaL0Z0", "Top", "getTop-PIaL0Z0", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker r1) {
                this();
            }

            private Companion() {
            }

            /* JADX INFO: renamed from: getTop-PIaL0Z0, reason: not valid java name */
            public final float m6805getTopPIaL0Z0() {
                return Alignment.access$getTop$cp();
            }

            /* JADX INFO: renamed from: getCenter-PIaL0Z0, reason: not valid java name */
            public final float m6803getCenterPIaL0Z0() {
                return Alignment.access$getCenter$cp();
            }

            /* JADX INFO: renamed from: getProportional-PIaL0Z0, reason: not valid java name */
            public final float m6804getProportionalPIaL0Z0() {
                return Alignment.access$getProportional$cp();
            }

            /* JADX INFO: renamed from: getBottom-PIaL0Z0, reason: not valid java name */
            public final float m6802getBottomPIaL0Z0() {
                return Alignment.access$getBottom$cp();
            }
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Alignment m6795boximpl(float r1) {
            return new Alignment(r1);
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m6797equalsimpl(float r2, Object r3) {
            if ((r3 instanceof Alignment) == true) goto L6;
            return false;
        L6:
            if (Float.compare(r2, ((Alignment) r3).m6801unboximpl()) == 0) goto L8;
            return false;
        L8:
            return true;
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m6798equalsimpl0(float r1, float r2) {
            if (Float.compare(r1, r2) != 0) goto L5;
            return true;
        L5:
            return false;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m6799hashCodeimpl(float r1) {
            return Float.hashCode(r1);
        }

        public boolean equals(Object r2) {
            return m6797equalsimpl(this.topRatio, r2);
        }

        public int hashCode() {
            return m6799hashCodeimpl(this.topRatio);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ float m6801unboximpl() {
            return this.topRatio;
        }

        public static final /* synthetic */ float access$getBottom$cp() {
            return Bottom;
        }

        public static final /* synthetic */ float access$getCenter$cp() {
            return Center;
        }

        public static final /* synthetic */ float access$getProportional$cp() {
            return Proportional;
        }

        public static final /* synthetic */ float access$getTop$cp() {
            return Top;
        }

        private /* synthetic */ Alignment(float topRatio) {
            this.topRatio = topRatio;
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static float m6796constructorimpl(float topRatio) {
            boolean value$iv = true;
            if (0.0f <= topRatio) goto L5;
        L7:
            boolean r0 = false;
        L8:
            if (r0 == true) goto L17;
            if (topRatio != (-1.0f)) goto L12;
            boolean r1 = true;
        L13:
            if (r1 == true) goto L17;
            value$iv = false;
            goto L17
        L12:
            r1 = false;
        L17:
            if (value$iv == true) goto L20;
            InlineClassHelperKt.throwIllegalStateException("topRatio should be in [0..1] range or -1");
        L20:
            return topRatio;
        L5:
            if (topRatio > 1.0f) goto L7;
            r0 = true;
            goto L8
        }

        public String toString() {
            return m6800toStringimpl(this.topRatio);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m6800toStringimpl(float arg0) {
            boolean r1 = true;
            if (arg0 != Top) goto L5;
            boolean r0 = true;
        L6:
            if (r0 == false) goto L9;
            return "LineHeightStyle.Alignment.Top";
        L9:
            if (arg0 != Center) goto L11;
            boolean r2 = true;
        L12:
            if (r2 == false) goto L15;
            return "LineHeightStyle.Alignment.Center";
        L15:
            if (arg0 != Proportional) goto L17;
            boolean r3 = true;
        L18:
            if (r3 == false) goto L21;
            return "LineHeightStyle.Alignment.Proportional";
        L21:
            if (arg0 == Bottom) goto L24;
            r1 = false;
        L24:
            if (r1 == false) goto L27;
            return "LineHeightStyle.Alignment.Bottom";
        L27:
            return "LineHeightStyle.Alignment(topPercentage = " + arg0 + ')';
        L17:
            r3 = false;
            goto L18
        L11:
            r2 = false;
            goto L12
        L5:
            r0 = false;
            goto L6
        }

        static {
            Companion = new Companion(null);
            Top = m6796constructorimpl(0.0f);
            Center = m6796constructorimpl(0.5f);
            Proportional = m6796constructorimpl(-1.0f);
            Bottom = m6796constructorimpl(1.0f);
        }
    }

    /* JADX INFO: compiled from: LineHeightStyle.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Companion;", "", "()V", Profile.DEFAULT_PROFILE_NAME, "Landroidx/compose/ui/text/style/LineHeightStyle;", "getDefault", "()Landroidx/compose/ui/text/style/LineHeightStyle;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final LineHeightStyle getDefault() {
            return LineHeightStyle.access$getDefault$cp();
        }
    }

    /* JADX INFO: compiled from: LineHeightStyle.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Mode;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class Mode {
        public static final Companion Companion = null;
        private static final int Fixed = 0;
        private static final int Minimum = 0;
        private final int value;

        /* JADX INFO: compiled from: LineHeightStyle.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Mode$Companion;", "", "()V", "Fixed", "Landroidx/compose/ui/text/style/LineHeightStyle$Mode;", "getFixed-lzQqcRY", "()I", "I", "Minimum", "getMinimum-lzQqcRY", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker r1) {
                this();
            }

            private Companion() {
            }

            /* JADX INFO: renamed from: getFixed-lzQqcRY, reason: not valid java name */
            public final int m6813getFixedlzQqcRY() {
                return Mode.access$getFixed$cp();
            }

            /* JADX INFO: renamed from: getMinimum-lzQqcRY, reason: not valid java name */
            public final int m6814getMinimumlzQqcRY() {
                return Mode.access$getMinimum$cp();
            }
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Mode m6806boximpl(int r1) {
            return new Mode(r1);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        private static int m6807constructorimpl(int r0) {
            return r0;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m6808equalsimpl(int r2, Object r3) {
            if ((r3 instanceof Mode) == true) goto L6;
            return false;
        L6:
            if (r2 == ((Mode) r3).m6812unboximpl()) goto L8;
            return false;
        L8:
            return true;
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m6809equalsimpl0(int r1, int r2) {
            if (r1 != r2) goto L4;
            return true;
        L4:
            return false;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m6810hashCodeimpl(int r1) {
            return Integer.hashCode(r1);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m6811toStringimpl(int r2) {
            return "Mode(value=" + r2 + ')';
        }

        public boolean equals(Object r2) {
            return m6808equalsimpl(this.value, r2);
        }

        public int hashCode() {
            return m6810hashCodeimpl(this.value);
        }

        public String toString() {
            return m6811toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m6812unboximpl() {
            return this.value;
        }

        public static final /* synthetic */ int access$getFixed$cp() {
            return Fixed;
        }

        public static final /* synthetic */ int access$getMinimum$cp() {
            return Minimum;
        }

        private /* synthetic */ Mode(int value) {
            this.value = value;
        }

        static {
            Companion = new Companion(null);
            Fixed = m6807constructorimpl(0);
            Minimum = m6807constructorimpl(1);
        }
    }

    /* JADX INFO: compiled from: LineHeightStyle.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "isTrimFirstLineTop", "isTrimFirstLineTop-impl$ui_text_release", "(I)Z", "isTrimLastLineBottom", "isTrimLastLineBottom-impl$ui_text_release", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class Trim {
        private static final int Both = 0;
        public static final Companion Companion = null;
        private static final int FirstLineTop = 0;
        private static final int FlagTrimBottom = 16;
        private static final int FlagTrimTop = 1;
        private static final int LastLineBottom = 0;
        private static final int None = 0;
        private final int value;

        /* JADX INFO: compiled from: LineHeightStyle.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u0019\u0010\r\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000e\u0010\u0006R\u0019\u0010\u000f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0010\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Trim$Companion;", "", "()V", "Both", "Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", "getBoth-EVpEnUU", "()I", "I", "FirstLineTop", "getFirstLineTop-EVpEnUU", "FlagTrimBottom", "", "FlagTrimTop", "LastLineBottom", "getLastLineBottom-EVpEnUU", "None", "getNone-EVpEnUU", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker r1) {
                this();
            }

            private Companion() {
            }

            /* JADX INFO: renamed from: getFirstLineTop-EVpEnUU, reason: not valid java name */
            public final int m6825getFirstLineTopEVpEnUU() {
                return Trim.access$getFirstLineTop$cp();
            }

            /* JADX INFO: renamed from: getLastLineBottom-EVpEnUU, reason: not valid java name */
            public final int m6826getLastLineBottomEVpEnUU() {
                return Trim.access$getLastLineBottom$cp();
            }

            /* JADX INFO: renamed from: getBoth-EVpEnUU, reason: not valid java name */
            public final int m6824getBothEVpEnUU() {
                return Trim.access$getBoth$cp();
            }

            /* JADX INFO: renamed from: getNone-EVpEnUU, reason: not valid java name */
            public final int m6827getNoneEVpEnUU() {
                return Trim.access$getNone$cp();
            }
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Trim m6815boximpl(int r1) {
            return new Trim(r1);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        private static int m6816constructorimpl(int r0) {
            return r0;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m6817equalsimpl(int r2, Object r3) {
            if ((r3 instanceof Trim) == true) goto L6;
            return false;
        L6:
            if (r2 == ((Trim) r3).m6823unboximpl()) goto L8;
            return false;
        L8:
            return true;
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m6818equalsimpl0(int r1, int r2) {
            if (r1 != r2) goto L4;
            return true;
        L4:
            return false;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m6819hashCodeimpl(int r1) {
            return Integer.hashCode(r1);
        }

        public boolean equals(Object r2) {
            return m6817equalsimpl(this.value, r2);
        }

        public int hashCode() {
            return m6819hashCodeimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m6823unboximpl() {
            return this.value;
        }

        public static final /* synthetic */ int access$getBoth$cp() {
            return Both;
        }

        public static final /* synthetic */ int access$getFirstLineTop$cp() {
            return FirstLineTop;
        }

        public static final /* synthetic */ int access$getLastLineBottom$cp() {
            return LastLineBottom;
        }

        public static final /* synthetic */ int access$getNone$cp() {
            return None;
        }

        private /* synthetic */ Trim(int value) {
            this.value = value;
        }

        public String toString() {
            return m6822toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m6822toStringimpl(int arg0) {
            if (arg0 != FirstLineTop) goto L6;
            return "LineHeightStyle.Trim.FirstLineTop";
        L6:
            if (arg0 != LastLineBottom) goto L9;
            return "LineHeightStyle.Trim.LastLineBottom";
        L9:
            if (arg0 != Both) goto L12;
            return "LineHeightStyle.Trim.Both";
        L12:
            if (arg0 != None) goto L14;
            return "LineHeightStyle.Trim.None";
        L14:
            return "Invalid";
        }

        static {
            Companion = new Companion(null);
            FirstLineTop = m6816constructorimpl(1);
            LastLineBottom = m6816constructorimpl(16);
            Both = m6816constructorimpl(17);
            None = m6816constructorimpl(0);
        }

        /* JADX INFO: renamed from: isTrimFirstLineTop-impl$ui_text_release, reason: not valid java name */
        public static final boolean m6820isTrimFirstLineTopimpl$ui_text_release(int arg0) {
            if ((arg0 & 1) <= 0) goto L5;
            return true;
        L5:
            return false;
        }

        /* JADX INFO: renamed from: isTrimLastLineBottom-impl$ui_text_release, reason: not valid java name */
        public static final boolean m6821isTrimLastLineBottomimpl$ui_text_release(int arg0) {
            if ((arg0 & 16) <= 0) goto L5;
            return true;
        L5:
            return false;
        }
    }

    public /* synthetic */ LineHeightStyle(float r1, int r2, int r3, DefaultConstructorMarker r4) {
        this(r1, r2, r3);
    }

    public /* synthetic */ LineHeightStyle(float r1, int r2, DefaultConstructorMarker r3) {
        this(r1, r2);
    }

    private LineHeightStyle(float alignment, int trim, int mode) {
        this.alignment = alignment;
        this.trim = trim;
        this.mode = mode;
    }

    public static final /* synthetic */ LineHeightStyle access$getDefault$cp() {
        return Default;
    }

    /* JADX INFO: renamed from: getAlignment-PIaL0Z0, reason: not valid java name */
    public final float m6792getAlignmentPIaL0Z0() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: getMode-lzQqcRY, reason: not valid java name */
    public final int m6793getModelzQqcRY() {
        return this.mode;
    }

    /* JADX INFO: renamed from: getTrim-EVpEnUU, reason: not valid java name */
    public final int m6794getTrimEVpEnUU() {
        return this.trim;
    }

    private LineHeightStyle(float alignment, int trim) {
        this(alignment, trim, Mode.Companion.m6813getFixedlzQqcRY(), null);
    }

    static {
        DefaultConstructorMarker r1 = null;
        Companion = new Companion(r1);
        Default = new LineHeightStyle(Alignment.Companion.m6804getProportionalPIaL0Z0(), Trim.Companion.m6824getBothEVpEnUU(), Mode.Companion.m6813getFixedlzQqcRY(), r1);
    }

    /* JADX INFO: renamed from: copy-38bxuX8$default, reason: not valid java name */
    public static /* synthetic */ LineHeightStyle m6790copy38bxuX8$default(LineHeightStyle r0, float r1, int r2, int r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.alignment;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.trim;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.mode;
    L12:
        return r0.m6791copy38bxuX8(r1, r2, r3);
    }

    /* JADX INFO: renamed from: copy-38bxuX8, reason: not valid java name */
    public final LineHeightStyle m6791copy38bxuX8(float alignment, int trim, int mode) {
        return new LineHeightStyle(alignment, trim, mode, null);
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof LineHeightStyle) == true) goto L9;
        return false;
    L9:
        if (Alignment.m6798equalsimpl0(this.alignment, ((LineHeightStyle) other).alignment) == true) goto L12;
        return false;
    L12:
        if (Trim.m6818equalsimpl0(this.trim, ((LineHeightStyle) other).trim) == true) goto L15;
        return false;
    L15:
        if (Mode.m6809equalsimpl0(this.mode, ((LineHeightStyle) other).mode) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int result = Alignment.m6799hashCodeimpl(this.alignment);
        int result2 = (result * 31) + Trim.m6819hashCodeimpl(this.trim);
        return (result2 * 31) + Mode.m6810hashCodeimpl(this.mode);
    }

    public String toString() {
        return "LineHeightStyle(alignment=" + Alignment.m6800toStringimpl(this.alignment) + ", trim=" + Trim.m6822toStringimpl(this.trim) + ",mode=" + Mode.m6811toStringimpl(this.mode) + ')';
    }
}
