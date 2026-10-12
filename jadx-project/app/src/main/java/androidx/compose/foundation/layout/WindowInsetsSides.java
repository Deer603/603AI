package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WindowInsets.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0005J\u001b\u0010\u0011\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsSides;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hasAny", "sides", "hasAny-bkgdKaI$foundation_layout_release", "(II)Z", "hashCode", "hashCode-impl", "plus", "plus-gK_yJZ4", "(II)I", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "valueToString", "valueToString-impl", "Companion", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class WindowInsetsSides {
    private static final int AllowLeftInLtr = 0;
    private static final int AllowLeftInRtl = 0;
    private static final int AllowRightInLtr = 0;
    private static final int AllowRightInRtl = 0;
    private static final int Bottom = 0;
    public static final Companion Companion = null;
    private static final int End = 0;
    private static final int Horizontal = 0;
    private static final int Left = 0;
    private static final int Right = 0;
    private static final int Start = 0;
    private static final int Top = 0;
    private static final int Vertical = 0;
    private final int value;

    /* JADX INFO: compiled from: WindowInsets.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006R\u0019\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0013\u0010\u0006R\u0019\u0010\u0014\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0015\u0010\u0006R\u0019\u0010\u0016\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0017\u0010\u0006R\u0019\u0010\u0018\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0019\u0010\u0006R\u0019\u0010\u001a\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001b\u0010\u0006R\u0019\u0010\u001c\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001d\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsSides$Companion;", "", "()V", "AllowLeftInLtr", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "getAllowLeftInLtr-JoeWqyM$foundation_layout_release", "()I", "I", "AllowLeftInRtl", "getAllowLeftInRtl-JoeWqyM$foundation_layout_release", "AllowRightInLtr", "getAllowRightInLtr-JoeWqyM$foundation_layout_release", "AllowRightInRtl", "getAllowRightInRtl-JoeWqyM$foundation_layout_release", "Bottom", "getBottom-JoeWqyM", "End", "getEnd-JoeWqyM", "Horizontal", "getHorizontal-JoeWqyM", "Left", "getLeft-JoeWqyM", "Right", "getRight-JoeWqyM", "Start", "getStart-JoeWqyM", "Top", "getTop-JoeWqyM", "Vertical", "getVertical-JoeWqyM", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getAllowLeftInLtr-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m814getAllowLeftInLtrJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.access$getAllowLeftInLtr$cp();
        }

        /* JADX INFO: renamed from: getAllowRightInLtr-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m816getAllowRightInLtrJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.access$getAllowRightInLtr$cp();
        }

        /* JADX INFO: renamed from: getAllowLeftInRtl-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m815getAllowLeftInRtlJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.access$getAllowLeftInRtl$cp();
        }

        /* JADX INFO: renamed from: getAllowRightInRtl-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m817getAllowRightInRtlJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.access$getAllowRightInRtl$cp();
        }

        /* JADX INFO: renamed from: getStart-JoeWqyM, reason: not valid java name */
        public final int m823getStartJoeWqyM() {
            return WindowInsetsSides.access$getStart$cp();
        }

        /* JADX INFO: renamed from: getEnd-JoeWqyM, reason: not valid java name */
        public final int m819getEndJoeWqyM() {
            return WindowInsetsSides.access$getEnd$cp();
        }

        /* JADX INFO: renamed from: getTop-JoeWqyM, reason: not valid java name */
        public final int m824getTopJoeWqyM() {
            return WindowInsetsSides.access$getTop$cp();
        }

        /* JADX INFO: renamed from: getBottom-JoeWqyM, reason: not valid java name */
        public final int m818getBottomJoeWqyM() {
            return WindowInsetsSides.access$getBottom$cp();
        }

        /* JADX INFO: renamed from: getLeft-JoeWqyM, reason: not valid java name */
        public final int m821getLeftJoeWqyM() {
            return WindowInsetsSides.access$getLeft$cp();
        }

        /* JADX INFO: renamed from: getRight-JoeWqyM, reason: not valid java name */
        public final int m822getRightJoeWqyM() {
            return WindowInsetsSides.access$getRight$cp();
        }

        /* JADX INFO: renamed from: getHorizontal-JoeWqyM, reason: not valid java name */
        public final int m820getHorizontalJoeWqyM() {
            return WindowInsetsSides.access$getHorizontal$cp();
        }

        /* JADX INFO: renamed from: getVertical-JoeWqyM, reason: not valid java name */
        public final int m825getVerticalJoeWqyM() {
            return WindowInsetsSides.access$getVertical$cp();
        }
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ WindowInsetsSides m804boximpl(int r1) {
        return new WindowInsetsSides(r1);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m805constructorimpl(int r0) {
        return r0;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m806equalsimpl(int r2, Object r3) {
        if ((r3 instanceof WindowInsetsSides) == true) goto L6;
        return false;
    L6:
        if (r2 == ((WindowInsetsSides) r3).m813unboximpl()) goto L8;
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m807equalsimpl0(int r1, int r2) {
        if (r1 != r2) goto L4;
        return true;
    L4:
        return false;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m809hashCodeimpl(int r1) {
        return Integer.hashCode(r1);
    }

    public boolean equals(Object r2) {
        return m806equalsimpl(this.value, r2);
    }

    public int hashCode() {
        return m809hashCodeimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m813unboximpl() {
        return this.value;
    }

    public static final /* synthetic */ int access$getAllowLeftInLtr$cp() {
        return AllowLeftInLtr;
    }

    public static final /* synthetic */ int access$getAllowLeftInRtl$cp() {
        return AllowLeftInRtl;
    }

    public static final /* synthetic */ int access$getAllowRightInLtr$cp() {
        return AllowRightInLtr;
    }

    public static final /* synthetic */ int access$getAllowRightInRtl$cp() {
        return AllowRightInRtl;
    }

    public static final /* synthetic */ int access$getBottom$cp() {
        return Bottom;
    }

    public static final /* synthetic */ int access$getEnd$cp() {
        return End;
    }

    public static final /* synthetic */ int access$getHorizontal$cp() {
        return Horizontal;
    }

    public static final /* synthetic */ int access$getLeft$cp() {
        return Left;
    }

    public static final /* synthetic */ int access$getRight$cp() {
        return Right;
    }

    public static final /* synthetic */ int access$getStart$cp() {
        return Start;
    }

    public static final /* synthetic */ int access$getTop$cp() {
        return Top;
    }

    public static final /* synthetic */ int access$getVertical$cp() {
        return Vertical;
    }

    private /* synthetic */ WindowInsetsSides(int value) {
        this.value = value;
    }

    /* JADX INFO: renamed from: plus-gK_yJZ4, reason: not valid java name */
    public static final int m810plusgK_yJZ4(int arg0, int sides) {
        return m805constructorimpl(arg0 | sides);
    }

    /* JADX INFO: renamed from: hasAny-bkgdKaI$foundation_layout_release, reason: not valid java name */
    public static final boolean m808hasAnybkgdKaI$foundation_layout_release(int arg0, int sides) {
        if ((arg0 & sides) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m811toStringimpl(int arg0) {
        return "WindowInsetsSides(" + m812valueToStringimpl(arg0) + ')';
    }

    public String toString() {
        return m811toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: valueToString-impl, reason: not valid java name */
    private static final String m812valueToStringimpl(int arg0) {
        StringBuilder $this$valueToString_impl_u24lambda_u240 = new StringBuilder();
        if ((Start & arg0) != Start) goto L6;
        valueToString_impl$lambda$0$appendPlus($this$valueToString_impl_u24lambda_u240, "Start");
    L6:
        if ((Left & arg0) != Left) goto L9;
        valueToString_impl$lambda$0$appendPlus($this$valueToString_impl_u24lambda_u240, "Left");
    L9:
        if ((Top & arg0) != Top) goto L12;
        valueToString_impl$lambda$0$appendPlus($this$valueToString_impl_u24lambda_u240, "Top");
    L12:
        if ((End & arg0) != End) goto L15;
        valueToString_impl$lambda$0$appendPlus($this$valueToString_impl_u24lambda_u240, "End");
    L15:
        if ((Right & arg0) != Right) goto L18;
        valueToString_impl$lambda$0$appendPlus($this$valueToString_impl_u24lambda_u240, "Right");
    L18:
        if ((Bottom & arg0) != Bottom) goto L20;
        valueToString_impl$lambda$0$appendPlus($this$valueToString_impl_u24lambda_u240, "Bottom");
    L20:
        String r0 = $this$valueToString_impl_u24lambda_u240.toString();
        Intrinsics.checkNotNullExpressionValue(r0, "toString(...)");
        return r0;
    }

    private static final void valueToString_impl$lambda$0$appendPlus(StringBuilder $this_buildString, String text) {
        if ($this_buildString.length() <= 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L8;
        $this_buildString.append('+');
    L8:
        $this_buildString.append(text);
        return;
    L5:
        r0 = false;
        goto L6
    }

    static {
        Companion = new Companion(null);
        AllowLeftInLtr = m805constructorimpl(8);
        AllowRightInLtr = m805constructorimpl(4);
        AllowLeftInRtl = m805constructorimpl(2);
        AllowRightInRtl = m805constructorimpl(1);
        Start = m810plusgK_yJZ4(AllowLeftInLtr, AllowRightInRtl);
        End = m810plusgK_yJZ4(AllowRightInLtr, AllowLeftInRtl);
        Top = m805constructorimpl(16);
        Bottom = m805constructorimpl(32);
        Left = m810plusgK_yJZ4(AllowLeftInLtr, AllowLeftInRtl);
        Right = m810plusgK_yJZ4(AllowRightInLtr, AllowRightInRtl);
        Horizontal = m810plusgK_yJZ4(Left, Right);
        Vertical = m810plusgK_yJZ4(Top, Bottom);
    }
}
