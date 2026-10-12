package androidx.compose.ui.unit;

import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Constraints.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 22\u00020\u0001:\u00012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010#\u001a\u00020\u00002\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\u00020\u0000H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010\u0005J\u001a\u0010(\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b-\u0010\tJ\u000f\u0010.\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101R\u0015\u0010\u0006\u001a\u00020\u00078Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\rR\u001a\u0010\u0017\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\rR\u0011\u0010\u001a\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\tR\u0011\u0010\u001c\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\tR\u0011\u0010\u001e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\tR\u0011\u0010 \u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b!\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\"\u0010\u0012\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00063"}, d2 = {"Landroidx/compose/ui/unit/Constraints;", "", "value", "", "constructor-impl", "(J)J", "focusIndex", "", "getFocusIndex-impl", "(J)I", "hasBoundedHeight", "", "getHasBoundedHeight-impl", "(J)Z", "hasBoundedWidth", "getHasBoundedWidth-impl", "hasFixedHeight", "getHasFixedHeight$annotations", "()V", "getHasFixedHeight-impl", "hasFixedWidth", "getHasFixedWidth$annotations", "getHasFixedWidth-impl", "isZero", "isZero$annotations", "isZero-impl", "maxHeight", "getMaxHeight-impl", "maxWidth", "getMaxWidth-impl", "minHeight", "getMinHeight-impl", "minWidth", "getMinWidth-impl", "getValue$annotations", "copy", "copy-Zbe2FdA", "(JIIII)J", "copyMaxDimensions", "copyMaxDimensions-msEJaDk", "equals", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class Constraints {
    public static final Companion Companion = null;
    public static final int Infinity = Integer.MAX_VALUE;
    private final long value;

    /* JADX INFO: compiled from: Constraints.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J5\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\fJ%\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0016J?\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/unit/Constraints$Companion;", "", "()V", "Infinity", "", "fitPrioritizingHeight", "Landroidx/compose/ui/unit/Constraints;", "minWidth", "maxWidth", "minHeight", "maxHeight", "fitPrioritizingHeight-Zbe2FdA", "(IIII)J", "fitPrioritizingWidth", "fitPrioritizingWidth-Zbe2FdA", "fixed", "width", "height", "fixed-JhjzzOo", "(II)J", "fixedHeight", "fixedHeight-OenEA2s", "(I)J", "fixedWidth", "fixedWidth-OenEA2s", "restrictConstraints", "prioritizeWidth", "", "restrictConstraints-xF2OJ5Q", "(IIIIZ)J", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: fixed-JhjzzOo, reason: not valid java name */
        public final long m6936fixedJhjzzOo(int width, int height) {
            boolean r0 = true;
            if (width < 0) goto L5;
            boolean r2 = true;
        L6:
            if (height >= 0) goto L9;
            r0 = false;
        L9:
            boolean value$iv = r0 & r2;
            if (value$iv == true) goto L13;
            InlineClassHelperKt.throwIllegalArgumentException("width and height must be >= 0");
        L13:
            return ConstraintsKt.createConstraints(width, width, height, height);
        L5:
            r2 = false;
            goto L6
        }

        /* JADX INFO: renamed from: fixedWidth-OenEA2s, reason: not valid java name */
        public final long m6938fixedWidthOenEA2s(int width) {
            if (width < 0) goto L5;
            boolean value$iv = true;
        L7:
            if (value$iv == true) goto L10;
            InlineClassHelperKt.throwIllegalArgumentException("width must be >= 0");
        L10:
            return ConstraintsKt.createConstraints(width, width, 0, Integer.MAX_VALUE);
        L5:
            value$iv = false;
            goto L7
        }

        /* JADX INFO: renamed from: fixedHeight-OenEA2s, reason: not valid java name */
        public final long m6937fixedHeightOenEA2s(int height) {
            if (height < 0) goto L5;
            boolean value$iv = true;
        L7:
            if (value$iv == true) goto L10;
            InlineClassHelperKt.throwIllegalArgumentException("height must be >= 0");
        L10:
            return ConstraintsKt.createConstraints(0, Integer.MAX_VALUE, height, height);
        L5:
            value$iv = false;
            goto L7
        }

        /* JADX INFO: renamed from: restrictConstraints-xF2OJ5Q$default, reason: not valid java name */
        public static /* synthetic */ long m6933restrictConstraintsxF2OJ5Q$default(Companion r6, int r7, int r8, int r9, int r10, boolean r11, int r12, Object r13) {
            if ((r12 & 16) == 0) goto L5;
            boolean r5 = true;
        L7:
            return r6.m6939restrictConstraintsxF2OJ5Q(r7, r8, r9, r10, r5);
        L5:
            r5 = r11;
            goto L7
        }

        @Deprecated(message = "Replace with fitPrioritizingWidth", replaceWith = @ReplaceWith(expression = "Constraints.fitPrioritizingWidth(minWidth, maxWidth, minHeight, maxHeight)", imports = {}))
        /* JADX INFO: renamed from: restrictConstraints-xF2OJ5Q, reason: not valid java name */
        public final long m6939restrictConstraintsxF2OJ5Q(int minWidth, int maxWidth, int minHeight, int maxHeight, boolean prioritizeWidth) {
            if (prioritizeWidth == false) goto L5;
            return m6935fitPrioritizingWidthZbe2FdA(minWidth, maxWidth, minHeight, maxHeight);
        L5:
            return m6934fitPrioritizingHeightZbe2FdA(minWidth, maxWidth, minHeight, maxHeight);
        }

        /* JADX INFO: renamed from: fitPrioritizingWidth-Zbe2FdA, reason: not valid java name */
        public final long m6935fitPrioritizingWidthZbe2FdA(int minWidth, int maxWidth, int minHeight, int maxHeight) {
            int maxAllowed = 262142;
            int minW = Math.min(minWidth, 262142);
            int maxH = Integer.MAX_VALUE;
            if (maxWidth != Integer.MAX_VALUE) goto L5;
            int maxW = Integer.MAX_VALUE;
        L7:
            if (maxW != Integer.MAX_VALUE) goto L9;
            int consumed = minW;
        L11:
            if (consumed >= 8191) goto L14;
        L23:
            if (maxHeight == Integer.MAX_VALUE) goto L26;
            maxH = Math.min(maxAllowed, maxHeight);
        L26:
            int minH = Math.min(maxAllowed, minHeight);
            return ConstraintsKt.Constraints(minW, maxW, minH, maxH);
        L14:
            if (consumed >= 32767) goto L17;
            maxAllowed = 65534;
            goto L23
        L17:
            if (consumed >= 65535) goto L20;
            maxAllowed = 32766;
            goto L23
        L20:
            if (consumed >= 262143) goto L28;
            maxAllowed = 8190;
            goto L23
        L28:
            ConstraintsKt.throwInvalidConstraintsSizeException(consumed);
            throw new KotlinNothingValueException();
        L9:
            consumed = maxW;
            goto L11
        L5:
            maxW = Math.min(maxWidth, 262142);
            goto L7
        }

        /* JADX INFO: renamed from: fitPrioritizingHeight-Zbe2FdA, reason: not valid java name */
        public final long m6934fitPrioritizingHeightZbe2FdA(int minWidth, int maxWidth, int minHeight, int maxHeight) {
            int maxAllowed = 262142;
            int minH = Math.min(minHeight, 262142);
            int maxW = Integer.MAX_VALUE;
            if (maxHeight != Integer.MAX_VALUE) goto L5;
            int maxH = Integer.MAX_VALUE;
        L7:
            if (maxH != Integer.MAX_VALUE) goto L9;
            int consumed = minH;
        L11:
            if (consumed >= 8191) goto L14;
        L23:
            if (maxWidth == Integer.MAX_VALUE) goto L26;
            maxW = Math.min(maxAllowed, maxWidth);
        L26:
            int minW = Math.min(maxAllowed, minWidth);
            return ConstraintsKt.Constraints(minW, maxW, minH, maxH);
        L14:
            if (consumed >= 32767) goto L17;
            maxAllowed = 65534;
            goto L23
        L17:
            if (consumed >= 65535) goto L20;
            maxAllowed = 32766;
            goto L23
        L20:
            if (consumed >= 262143) goto L28;
            maxAllowed = 8190;
            goto L23
        L28:
            ConstraintsKt.throwInvalidConstraintsSizeException(consumed);
            throw new KotlinNothingValueException();
        L9:
            consumed = maxH;
            goto L11
        L5:
            maxH = Math.min(maxHeight, 262142);
            goto L7
        }
    }

    static {
        Companion = new Companion(null);
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Constraints m6913boximpl(long r1) {
        return new Constraints(r1);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m6914constructorimpl(long r0) {
        return r0;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m6918equalsimpl(long r4, Object r6) {
        if ((r6 instanceof Constraints) == true) goto L6;
        return false;
    L6:
        if (r4 == ((Constraints) r6).m6932unboximpl()) goto L8;
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6919equalsimpl0(long r1, long r3) {
        if (r1 != r3) goto L5;
        return true;
    L5:
        return false;
    }

    public static /* synthetic */ void getHasFixedHeight$annotations() {
    }

    public static /* synthetic */ void getHasFixedWidth$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m6929hashCodeimpl(long r1) {
        return Long.hashCode(r1);
    }

    public static /* synthetic */ void isZero$annotations() {
    }

    public boolean equals(Object r3) {
        return m6918equalsimpl(this.value, r3);
    }

    public int hashCode() {
        return m6929hashCodeimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m6932unboximpl() {
        return this.value;
    }

    private /* synthetic */ Constraints(long value) {
        this.value = value;
    }

    /* JADX INFO: renamed from: getFocusIndex-impl, reason: not valid java name */
    private static final int m6920getFocusIndeximpl(long arg0) {
        return (int) (3 & arg0);
    }

    /* JADX INFO: renamed from: getMinWidth-impl, reason: not valid java name */
    public static final int m6928getMinWidthimpl(long arg0) {
        int r0 = (int) (3 & arg0);
        int bitOffset$iv = ((r0 & 1) << 1) + (((r0 & 2) >> 1) * 3);
        int mask = (1 << (bitOffset$iv + 13)) - 1;
        return ((int) (arg0 >> 2)) & mask;
    }

    /* JADX INFO: renamed from: getMaxWidth-impl, reason: not valid java name */
    public static final int m6926getMaxWidthimpl(long arg0) {
        int r0 = (int) (3 & arg0);
        int bitOffset$iv = ((r0 & 1) << 1) + (((r0 & 2) >> 1) * 3);
        int mask = (1 << (bitOffset$iv + 13)) - 1;
        int width = ((int) (arg0 >> 33)) & mask;
        if (width != 0) goto L6;
        return Integer.MAX_VALUE;
    L6:
        return width - 1;
    }

    /* JADX INFO: renamed from: getMinHeight-impl, reason: not valid java name */
    public static final int m6927getMinHeightimpl(long arg0) {
        int r0 = (int) (3 & arg0);
        int bitOffset = ((r0 & 1) << 1) + (((r0 & 2) >> 1) * 3);
        int mask = (1 << (18 - bitOffset)) - 1;
        int $i$f$minHeightOffsets = bitOffset + 15;
        return ((int) (arg0 >> $i$f$minHeightOffsets)) & mask;
    }

    /* JADX INFO: renamed from: getMaxHeight-impl, reason: not valid java name */
    public static final int m6925getMaxHeightimpl(long arg0) {
        int r0 = (int) (3 & arg0);
        int bitOffset = ((r0 & 1) << 1) + (((r0 & 2) >> 1) * 3);
        int mask = (1 << (18 - bitOffset)) - 1;
        int $i$f$minHeightOffsets = bitOffset + 15;
        int offset = $i$f$minHeightOffsets + 31;
        int height = ((int) (arg0 >> offset)) & mask;
        if (height != 0) goto L6;
        return Integer.MAX_VALUE;
    L6:
        return height - 1;
    }

    /* JADX INFO: renamed from: getHasBoundedWidth-impl, reason: not valid java name */
    public static final boolean m6922getHasBoundedWidthimpl(long arg0) {
        int r0 = (int) (3 & arg0);
        int bitOffset$iv = ((r0 & 1) << 1) + (((r0 & 2) >> 1) * 3);
        int mask = (1 << (bitOffset$iv + 13)) - 1;
        if ((((int) (arg0 >> 33)) & mask) != 0) goto L7;
        return false;
    L7:
        return true;
    }

    /* JADX INFO: renamed from: getHasBoundedHeight-impl, reason: not valid java name */
    public static final boolean m6921getHasBoundedHeightimpl(long arg0) {
        int r0 = (int) (3 & arg0);
        int bitOffset = ((r0 & 1) << 1) + (((r0 & 2) >> 1) * 3);
        int mask = (1 << (18 - bitOffset)) - 1;
        int $i$f$minHeightOffsets = bitOffset + 15;
        int offset = $i$f$minHeightOffsets + 31;
        if ((((int) (arg0 >> offset)) & mask) != 0) goto L7;
        return false;
    L7:
        return true;
    }

    /* JADX INFO: renamed from: getHasFixedWidth-impl, reason: not valid java name */
    public static final boolean m6924getHasFixedWidthimpl(long arg0) {
        int r0 = (int) (3 & arg0);
        int bitOffset$iv = ((r0 & 1) << 1) + (((r0 & 2) >> 1) * 3);
        int mask = (1 << (bitOffset$iv + 13)) - 1;
        int minWidth = ((int) (arg0 >> 2)) & mask;
        int it = ((int) (arg0 >> 33)) & mask;
        if (it != 0) goto L5;
        int maxWidth = Integer.MAX_VALUE;
    L7:
        if (minWidth == maxWidth) goto L11;
        return false;
    L11:
        return true;
    L5:
        maxWidth = it - 1;
        goto L7
    }

    /* JADX INFO: renamed from: getHasFixedHeight-impl, reason: not valid java name */
    public static final boolean m6923getHasFixedHeightimpl(long arg0) {
        int r0 = (int) (3 & arg0);
        int bitOffset = ((r0 & 1) << 1) + (((r0 & 2) >> 1) * 3);
        int mask = (1 << (18 - bitOffset)) - 1;
        int $i$f$minHeightOffsets = bitOffset + 15;
        int minHeight = ((int) (arg0 >> $i$f$minHeightOffsets)) & mask;
        int it = ((int) (arg0 >> ($i$f$minHeightOffsets + 31))) & mask;
        if (it != 0) goto L5;
        int maxHeight = Integer.MAX_VALUE;
    L7:
        if (minHeight == maxHeight) goto L11;
        return false;
    L11:
        return true;
    L5:
        maxHeight = it - 1;
        goto L7
    }

    /* JADX INFO: renamed from: isZero-impl, reason: not valid java name */
    public static final boolean m6930isZeroimpl(long arg0) {
        int r0 = (int) (3 & arg0);
        boolean r3 = true;
        int bitOffset = ((r0 & 1) << 1) + (((r0 & 2) >> 1) * 3);
        int maxWidth = (((int) (arg0 >> 33)) & ((1 << (bitOffset + 13)) - 1)) - 1;
        int $i$f$minHeightOffsets = bitOffset + 15;
        int offset = $i$f$minHeightOffsets + 31;
        int maxHeight = (((int) (arg0 >> offset)) & ((1 << (18 - bitOffset)) - 1)) - 1;
        if (maxWidth != 0) goto L5;
        boolean r6 = true;
    L6:
        if (maxHeight == 0) goto L10;
        r3 = false;
    L10:
        return r3 | r6;
    L5:
        r6 = false;
        goto L6
    }

    /* JADX INFO: renamed from: copy-Zbe2FdA$default, reason: not valid java name */
    public static /* synthetic */ long m6916copyZbe2FdA$default(long r6, int r8, int r9, int r10, int r11, int r12, Object r13) {
        if ((r12 & 1) == 0) goto L5;
        int r2 = m6928getMinWidthimpl(r6);
    L7:
        if ((r12 & 2) == 0) goto L9;
        int r3 = m6926getMaxWidthimpl(r6);
    L11:
        if ((r12 & 4) == 0) goto L13;
        int r4 = m6927getMinHeightimpl(r6);
    L15:
        if ((r12 & 8) == 0) goto L17;
        int r5 = m6925getMaxHeightimpl(r6);
    L19:
        return m6915copyZbe2FdA(r6, r2, r3, r4, r5);
    L17:
        r5 = r11;
        goto L19
    L13:
        r4 = r10;
        goto L15
    L9:
        r3 = r9;
        goto L11
    L5:
        r2 = r8;
        goto L7
    }

    /* JADX INFO: renamed from: copy-Zbe2FdA, reason: not valid java name */
    public static final long m6915copyZbe2FdA(long arg0, int minWidth, int maxWidth, int minHeight, int maxHeight) {
        if (maxWidth < minWidth) goto L7;
        if (maxHeight < minHeight) goto L7;
        if (minWidth < 0) goto L7;
        if (minHeight < 0) goto L7;
        boolean value$iv = true;
    L9:
        if (value$iv == true) goto L12;
        InlineClassHelperKt.throwIllegalArgumentException("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
    L12:
        return ConstraintsKt.createConstraints(minWidth, maxWidth, minHeight, maxHeight);
    L7:
        value$iv = false;
        goto L9
    }

    /* JADX INFO: renamed from: copyMaxDimensions-msEJaDk, reason: not valid java name */
    public static final long m6917copyMaxDimensionsmsEJaDk(long arg0) {
        return m6914constructorimpl(ConstraintsKt.MaxDimensionsAndFocusMask & arg0);
    }

    public String toString() {
        return m6931toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m6931toStringimpl(long arg0) {
        int maxWidth = m6926getMaxWidthimpl(arg0);
        String maxHeightStr = "Infinity";
        if (maxWidth != Integer.MAX_VALUE) goto L5;
        String maxWidthStr = "Infinity";
    L6:
        int maxHeight = m6925getMaxHeightimpl(arg0);
        if (maxHeight == Integer.MAX_VALUE) goto L11;
        maxHeightStr = String.valueOf(maxHeight);
    L11:
        return "Constraints(minWidth = " + m6928getMinWidthimpl(arg0) + ", maxWidth = " + maxWidthStr + ", minHeight = " + m6927getMinHeightimpl(arg0) + ", maxHeight = " + maxHeightStr + ')';
    L5:
        maxWidthStr = String.valueOf(maxWidth);
        goto L6
    }
}
