package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: TouchBoundsExpansion.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 %2\u00020\u0001:\u0001%B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u001a\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b \u0010\tJ\u0010\u0010!\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\tR\u0011\u0010\u0012\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\t\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006&"}, d2 = {"Landroidx/compose/ui/node/TouchBoundsExpansion;", "", "packedValue", "", "constructor-impl", "(J)J", "bottom", "", "getBottom-impl", "(J)I", "end", "getEnd-impl", "isLayoutDirectionAware", "", "isLayoutDirectionAware-impl", "(J)Z", "start", "getStart-impl", "top", "getTop-impl", "computeLeft", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "computeLeft-impl$ui_release", "(JLandroidx/compose/ui/unit/LayoutDirection;)I", "computeRight", "computeRight-impl$ui_release", "equals", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class TouchBoundsExpansion {
    public static final Companion Companion = null;
    private static final long IS_LAYOUT_DIRECTION_AWARE = Long.MIN_VALUE;
    private static final int MASK = 32767;
    public static final int MAX_VALUE = 32767;
    private static final long None = 0;
    private static final int SHIFT = 15;
    private final long packedValue;

    /* JADX INFO: compiled from: TouchBoundsExpansion.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J;\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019H\u0000¢\u0006\u0002\b\u001aJ\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0002J\u0018\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\r\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/ui/node/TouchBoundsExpansion$Companion;", "", "()V", "IS_LAYOUT_DIRECTION_AWARE", "", "MASK", "", "MAX_VALUE", "None", "Landroidx/compose/ui/node/TouchBoundsExpansion;", "getNone-RZrCHBk", "()J", "J", "SHIFT", "Absolute", "left", "top", "right", "bottom", "Absolute-vsh68fg", "(IIII)J", "pack", "start", "end", "isLayoutDirectionAware", "", "pack$ui_release", "trimAndShift", "int", "position", "unpack", "packedValue", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public static final /* synthetic */ int access$unpack(Companion $this, long packedValue, int position) {
            return $this.unpack(packedValue, position);
        }

        /* JADX INFO: renamed from: Absolute-vsh68fg$default, reason: not valid java name */
        public static /* synthetic */ long m6069Absolutevsh68fg$default(Companion r1, int r2, int r3, int r4, int r5, int r6, Object r7) {
            if ((r6 & 1) == 0) goto L6;
            r2 = 0;
        L6:
            if ((r6 & 2) == 0) goto L9;
            r3 = 0;
        L9:
            if ((r6 & 4) == 0) goto L12;
            r4 = 0;
        L12:
            if ((r6 & 8) == 0) goto L15;
            r5 = 0;
        L15:
            return r1.m6070Absolutevsh68fg(r2, r3, r4, r5);
        }

        /* JADX INFO: renamed from: Absolute-vsh68fg, reason: not valid java name */
        public final long m6070Absolutevsh68fg(int left, int top, int right, int bottom) {
            boolean value$iv = true;
            if (left < 0) goto L6;
            if (left >= 32768) goto L6;
            boolean value$iv2 = true;
        L8:
            if (value$iv2 == true) goto L11;
            InlineClassHelperKt.throwIllegalArgumentException("Start must be in the range of 0 .. 32767");
        L11:
            if (top < 0) goto L14;
            if (top >= 32768) goto L14;
            boolean value$iv3 = true;
        L16:
            if (value$iv3 == true) goto L19;
            InlineClassHelperKt.throwIllegalArgumentException("Top must be in the range of 0 .. 32767");
        L19:
            if (right < 0) goto L22;
            if (right >= 32768) goto L22;
            boolean value$iv4 = true;
        L24:
            if (value$iv4 == true) goto L27;
            InlineClassHelperKt.throwIllegalArgumentException("End must be in the range of 0 .. 32767");
        L27:
            if (bottom < 0) goto L30;
            if (bottom >= 32768) goto L30;
        L32:
            if (value$iv == true) goto L35;
            InlineClassHelperKt.throwIllegalArgumentException("Bottom must be in the range of 0 .. 32767");
        L35:
            return TouchBoundsExpansion.m6058constructorimpl(pack$ui_release(left, top, right, bottom, false));
        L30:
            value$iv = false;
        L22:
            value$iv4 = false;
        L14:
            value$iv3 = false;
        L6:
            value$iv2 = false;
            goto L8
        }

        /* JADX INFO: renamed from: getNone-RZrCHBk, reason: not valid java name */
        public final long m6071getNoneRZrCHBk() {
            return TouchBoundsExpansion.access$getNone$cp();
        }

        public final long pack$ui_release(int start, int top, int end, int bottom, boolean isLayoutDirectionAware) {
            long r0 = ((trimAndShift(start, 0) | trimAndShift(top, 1)) | trimAndShift(end, 2)) | trimAndShift(bottom, 3);
            if (isLayoutDirectionAware == false) goto L5;
            long r2 = Long.MIN_VALUE;
        L7:
            return r0 | r2;
        L5:
            r2 = 0;
            goto L7
        }

        private final int unpack(long packedValue, int position) {
            return ((int) (packedValue >> (position * 15))) & 32767;
        }

        private final long trimAndShift(int r4, int position) {
            return ((long) (r4 & 32767)) << (position * 15);
        }
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TouchBoundsExpansion m6055boximpl(long r1) {
        return new TouchBoundsExpansion(r1);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m6058constructorimpl(long r0) {
        return r0;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m6059equalsimpl(long r4, Object r6) {
        if ((r6 instanceof TouchBoundsExpansion) == true) goto L6;
        return false;
    L6:
        if (r4 == ((TouchBoundsExpansion) r6).m6068unboximpl()) goto L8;
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6060equalsimpl0(long r1, long r3) {
        if (r1 != r3) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m6065hashCodeimpl(long r1) {
        return Long.hashCode(r1);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m6067toStringimpl(long r2) {
        return "TouchBoundsExpansion(packedValue=" + r2 + ')';
    }

    public boolean equals(Object r3) {
        return m6059equalsimpl(this.packedValue, r3);
    }

    public int hashCode() {
        return m6065hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m6067toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m6068unboximpl() {
        return this.packedValue;
    }

    public static final /* synthetic */ long access$getNone$cp() {
        return None;
    }

    private /* synthetic */ TouchBoundsExpansion(long packedValue) {
        this.packedValue = packedValue;
    }

    static {
        Companion = new Companion(null);
        None = TouchBoundsExpansionKt.TouchBoundsExpansion$default(0, 0, 0, 0, 14, null);
    }

    /* JADX INFO: renamed from: getStart-impl, reason: not valid java name */
    public static final int m6063getStartimpl(long arg0) {
        return Companion.access$unpack(Companion, arg0, 0);
    }

    /* JADX INFO: renamed from: getTop-impl, reason: not valid java name */
    public static final int m6064getTopimpl(long arg0) {
        return Companion.access$unpack(Companion, arg0, 1);
    }

    /* JADX INFO: renamed from: getEnd-impl, reason: not valid java name */
    public static final int m6062getEndimpl(long arg0) {
        return Companion.access$unpack(Companion, arg0, 2);
    }

    /* JADX INFO: renamed from: getBottom-impl, reason: not valid java name */
    public static final int m6061getBottomimpl(long arg0) {
        return Companion.access$unpack(Companion, arg0, 3);
    }

    /* JADX INFO: renamed from: isLayoutDirectionAware-impl, reason: not valid java name */
    public static final boolean m6066isLayoutDirectionAwareimpl(long arg0) {
        if ((Long.MIN_VALUE & arg0) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: computeLeft-impl$ui_release, reason: not valid java name */
    public static final int m6056computeLeftimpl$ui_release(long arg0, LayoutDirection layoutDirection) {
        if (m6066isLayoutDirectionAwareimpl(arg0) == false) goto L9;
        if (layoutDirection == LayoutDirection.Ltr) goto L9;
        return m6062getEndimpl(arg0);
    L9:
        return m6063getStartimpl(arg0);
    }

    /* JADX INFO: renamed from: computeRight-impl$ui_release, reason: not valid java name */
    public static final int m6057computeRightimpl$ui_release(long arg0, LayoutDirection layoutDirection) {
        if (m6066isLayoutDirectionAwareimpl(arg0) == false) goto L9;
        if (layoutDirection == LayoutDirection.Ltr) goto L9;
        return m6063getStartimpl(arg0);
    L9:
        return m6062getEndimpl(arg0);
    }
}
