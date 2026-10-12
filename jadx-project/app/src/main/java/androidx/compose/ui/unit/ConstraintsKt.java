package androidx.compose.ui.unit;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

/* JADX INFO: compiled from: Constraints.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\u001a5\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0019\u001a\u0019\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003H\u0082\b\u001a\u0011\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0082\b\u001a\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0000\u001a-\u0010!\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003H\u0000¢\u0006\u0002\u0010\u0019\u001a\u0011\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0003H\u0082\b\u001a\u0011\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003H\u0082\b\u001a\u0011\u0010&\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0082\b\u001a\u0011\u0010'\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0003H\u0082\b\u001a\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0003H\u0000\u001a\u0010\u0010,\u001a\u00020-2\u0006\u0010 \u001a\u00020\u0003H\u0000\u001a\u0011\u0010.\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0003H\u0082\b\u001a\u001c\u0010/\u001a\u00020\u0014*\u00020\u00142\u0006\u00100\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a\u001e\u0010/\u001a\u000203*\u00020\u00142\u0006\u0010 \u001a\u000203H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u00102\u001a\u001e\u00105\u001a\u00020\u0003*\u00020\u00142\u0006\u00106\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b7\u00108\u001a\u001e\u00109\u001a\u00020\u0003*\u00020\u00142\u0006\u0010:\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b;\u00108\u001a\u001e\u0010<\u001a\u00020=*\u00020\u00142\u0006\u0010 \u001a\u000203H\u0007ø\u0001\u0000¢\u0006\u0004\b>\u0010?\u001a*\u0010@\u001a\u00020\u0014*\u00020\u00142\b\b\u0002\u0010A\u001a\u00020\u00032\b\b\u0002\u0010B\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\bC\u0010D\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\b\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\n\"\u000e\u0010\u000b\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006E"}, d2 = {"FocusMask", "", "Infinity", "", "MaxAllowedForMaxFocusBits", "MaxAllowedForMaxNonFocusBits", "MaxAllowedForMinFocusBits", "MaxAllowedForMinNonFocusBits", "MaxDimensionsAndFocusMask", "getMaxDimensionsAndFocusMask$annotations", "()V", "MaxFocusBits", "MaxFocusMask", "MaxNonFocusBits", "MaxNonFocusMask", "MinFocusBits", "MinFocusMask", "MinNonFocusBits", "MinNonFocusMask", "Constraints", "Landroidx/compose/ui/unit/Constraints;", "minWidth", "maxWidth", "minHeight", "maxHeight", "(IIII)J", "addMaxWithMinimum", "max", "value", "bitOffsetToIndex", "bits", "bitsNeedForSizeUnchecked", "size", "createConstraints", "heightMask", "bitOffset", "indexToBitOffset", "index", "maxAllowedForSize", "minHeightOffsets", "throwInvalidConstraintException", "", "widthVal", "heightVal", "throwInvalidConstraintsSizeException", "", "widthMask", "constrain", "otherConstraints", "constrain-N9IONVI", "(JJ)J", "Landroidx/compose/ui/unit/IntSize;", "constrain-4WqzIAM", "constrainHeight", "height", "constrainHeight-K40F9xA", "(JI)I", "constrainWidth", "width", "constrainWidth-K40F9xA", "isSatisfiedBy", "", "isSatisfiedBy-4WqzIAM", "(JJ)Z", "offset", "horizontal", "vertical", "offset-NN6Ew-U", "(JII)J", "ui-unit_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ConstraintsKt {
    private static final long FocusMask = 3;
    private static final int Infinity = Integer.MAX_VALUE;
    private static final int MaxAllowedForMaxFocusBits = 8190;
    private static final int MaxAllowedForMaxNonFocusBits = 262142;
    private static final int MaxAllowedForMinFocusBits = 32766;
    private static final int MaxAllowedForMinNonFocusBits = 65534;
    public static final long MaxDimensionsAndFocusMask = -8589934589L;
    private static final int MaxFocusBits = 18;
    private static final int MaxFocusMask = 262143;
    private static final int MaxNonFocusBits = 13;
    private static final int MaxNonFocusMask = 8191;
    private static final int MinFocusBits = 16;
    private static final int MinFocusMask = 65535;
    private static final int MinNonFocusBits = 15;
    private static final int MinNonFocusMask = 32767;

    public static /* synthetic */ void getMaxDimensionsAndFocusMask$annotations() {
    }

    public static final void throwInvalidConstraintException(int widthVal, int heightVal) {
        throw new IllegalArgumentException("Can't represent a width of " + widthVal + " and height of " + heightVal + " in Constraints");
    }

    public static final Void throwInvalidConstraintsSizeException(int size) {
        throw new IllegalArgumentException("Can't represent a size of " + size + " in Constraints");
    }

    public static final long createConstraints(int minWidth, int maxWidth, int minHeight, int maxHeight) {
        if (maxHeight != Integer.MAX_VALUE) goto L5;
        int heightVal = minHeight;
    L6:
        int heightBits = bitsNeedForSizeUnchecked(heightVal);
        if (maxWidth != Integer.MAX_VALUE) goto L9;
        int widthVal = minWidth;
    L10:
        int widthBits = bitsNeedForSizeUnchecked(widthVal);
        if ((widthBits + heightBits) <= 31) goto L13;
        throwInvalidConstraintException(widthVal, heightVal);
    L13:
        int maxWidthValue = maxWidth + 1;
        int maxWidthValue2 = maxWidthValue & (~(maxWidthValue >> 31));
        int maxHeightValue = maxHeight + 1;
        int bitOffset = widthBits - 13;
        int focus = (bitOffset >> 1) + (bitOffset & 1);
        int $i$f$minHeightOffsets = bitOffset + 15;
        int maxHeightOffset = $i$f$minHeightOffsets + 31;
        long r0 = (((long) minHeight) << $i$f$minHeightOffsets) | (((((long) minWidth) << 2) | ((long) focus)) | (((long) maxWidthValue2) << 33));
        long value = (((long) (maxHeightValue & (~(maxHeightValue >> 31)))) << maxHeightOffset) | r0;
        return Constraints.m6914constructorimpl(value);
    L9:
        widthVal = maxWidth;
        goto L10
    L5:
        heightVal = maxHeight;
        goto L6
    }

    public static final int bitsNeedForSizeUnchecked(int size) {
        if (size >= MaxNonFocusMask) goto L6;
        return 13;
    L6:
        if (size >= 32767) goto L9;
        return 15;
    L9:
        if (size >= 65535) goto L12;
        return 16;
    L12:
        if (size >= MaxFocusMask) goto L14;
        return 18;
    L14:
        return 255;
    }

    private static final int maxAllowedForSize(int size) {
        if (size >= MaxNonFocusMask) goto L6;
        return MaxAllowedForMaxNonFocusBits;
    L6:
        if (size >= 32767) goto L9;
        return MaxAllowedForMinNonFocusBits;
    L9:
        if (size >= 65535) goto L12;
        return MaxAllowedForMinFocusBits;
    L12:
        if (size >= MaxFocusMask) goto L15;
        return MaxAllowedForMaxFocusBits;
    L15:
        throwInvalidConstraintsSizeException(size);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ long Constraints$default(int r2, int r3, int r4, int r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = Integer.MAX_VALUE;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r5 = Integer.MAX_VALUE;
    L15:
        return Constraints(r2, r3, r4, r5);
    }

    public static final long Constraints(int minWidth, int maxWidth, int minHeight, int maxHeight) {
        boolean r0 = true;
        if (maxWidth < minWidth) goto L5;
        boolean r2 = true;
    L6:
        if (maxHeight < minHeight) goto L8;
        boolean r3 = true;
    L9:
        boolean r4 = r2 & r3;
        if (minWidth < 0) goto L12;
        boolean r5 = true;
    L13:
        boolean r6 = r4 & r5;
        if (minHeight >= 0) goto L17;
        r0 = false;
    L17:
        boolean value$iv = r0 & r6;
        if (value$iv == true) goto L21;
        InlineClassHelperKt.throwIllegalArgumentException("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
    L21:
        return createConstraints(minWidth, maxWidth, minHeight, maxHeight);
    L12:
        r5 = false;
        goto L13
    L8:
        r3 = false;
        goto L9
    L5:
        r2 = false;
        goto L6
    }

    /* JADX INFO: renamed from: constrain-N9IONVI, reason: not valid java name */
    public static final long m6941constrainN9IONVI(long $this$constrain_u2dN9IONVI, long otherConstraints) {
        int minWidth = Constraints.m6928getMinWidthimpl($this$constrain_u2dN9IONVI);
        int maxWidth = Constraints.m6926getMaxWidthimpl($this$constrain_u2dN9IONVI);
        int minHeight = Constraints.m6927getMinHeightimpl($this$constrain_u2dN9IONVI);
        int maxHeight = Constraints.m6925getMaxHeightimpl($this$constrain_u2dN9IONVI);
        int $this$fastCoerceIn$iv = Constraints.m6928getMinWidthimpl(otherConstraints);
        int $this$fastCoerceAtLeast$iv$iv = $this$fastCoerceIn$iv;
        if ($this$fastCoerceAtLeast$iv$iv >= minWidth) goto L6;
        $this$fastCoerceAtLeast$iv$iv = minWidth;
    L6:
        if ($this$fastCoerceAtLeast$iv$iv <= maxWidth) goto L8;
        $this$fastCoerceAtLeast$iv$iv = maxWidth;
    L8:
        int $this$fastCoerceIn$iv2 = Constraints.m6926getMaxWidthimpl(otherConstraints);
        int $this$fastCoerceAtLeast$iv$iv2 = $this$fastCoerceIn$iv2;
        if ($this$fastCoerceAtLeast$iv$iv2 >= minWidth) goto L12;
        $this$fastCoerceAtLeast$iv$iv2 = minWidth;
    L12:
        if ($this$fastCoerceAtLeast$iv$iv2 <= maxWidth) goto L14;
        $this$fastCoerceAtLeast$iv$iv2 = maxWidth;
    L14:
        int $this$fastCoerceIn$iv3 = Constraints.m6927getMinHeightimpl(otherConstraints);
        int $this$fastCoerceAtLeast$iv$iv3 = $this$fastCoerceIn$iv3;
        if ($this$fastCoerceAtLeast$iv$iv3 >= minHeight) goto L18;
        $this$fastCoerceAtLeast$iv$iv3 = minHeight;
    L18:
        if ($this$fastCoerceAtLeast$iv$iv3 <= maxHeight) goto L20;
        $this$fastCoerceAtLeast$iv$iv3 = maxHeight;
    L20:
        int $this$fastCoerceIn$iv4 = Constraints.m6925getMaxHeightimpl(otherConstraints);
        int $this$fastCoerceAtLeast$iv$iv4 = $this$fastCoerceIn$iv4;
        if ($this$fastCoerceAtLeast$iv$iv4 >= minHeight) goto L24;
        $this$fastCoerceAtLeast$iv$iv4 = minHeight;
    L24:
        if ($this$fastCoerceAtLeast$iv$iv4 <= maxHeight) goto L27;
        $this$fastCoerceAtLeast$iv$iv4 = maxHeight;
    L27:
        return Constraints($this$fastCoerceAtLeast$iv$iv, $this$fastCoerceAtLeast$iv$iv2, $this$fastCoerceAtLeast$iv$iv3, $this$fastCoerceAtLeast$iv$iv4);
    }

    /* JADX INFO: renamed from: constrain-4WqzIAM, reason: not valid java name */
    public static final long m6940constrain4WqzIAM(long $this$constrain_u2d4WqzIAM, long size) {
        int $this$fastCoerceIn$iv = (int) (size >> 32);
        int minimumValue$iv = Constraints.m6928getMinWidthimpl($this$constrain_u2d4WqzIAM);
        int maximumValue$iv = Constraints.m6926getMaxWidthimpl($this$constrain_u2d4WqzIAM);
        int $this$fastCoerceAtLeast$iv$iv = $this$fastCoerceIn$iv;
        if ($this$fastCoerceAtLeast$iv$iv >= minimumValue$iv) goto L6;
        $this$fastCoerceAtLeast$iv$iv = minimumValue$iv;
    L6:
        if ($this$fastCoerceAtLeast$iv$iv <= maximumValue$iv) goto L8;
        $this$fastCoerceAtLeast$iv$iv = maximumValue$iv;
    L8:
        int $this$fastCoerceIn$iv2 = (int) (size & 4294967295L);
        int minimumValue$iv2 = Constraints.m6927getMinHeightimpl($this$constrain_u2d4WqzIAM);
        int maximumValue$iv2 = Constraints.m6925getMaxHeightimpl($this$constrain_u2d4WqzIAM);
        int $this$fastCoerceAtLeast$iv$iv2 = $this$fastCoerceIn$iv2;
        if ($this$fastCoerceAtLeast$iv$iv2 >= minimumValue$iv2) goto L12;
        $this$fastCoerceAtLeast$iv$iv2 = minimumValue$iv2;
    L12:
        if ($this$fastCoerceAtLeast$iv$iv2 <= maximumValue$iv2) goto L15;
        $this$fastCoerceAtLeast$iv$iv2 = maximumValue$iv2;
    L15:
        return IntSize.m7139constructorimpl((((long) $this$fastCoerceAtLeast$iv$iv) << 32) | (4294967295L & ((long) $this$fastCoerceAtLeast$iv$iv2)));
    }

    /* JADX INFO: renamed from: constrainWidth-K40F9xA, reason: not valid java name */
    public static final int m6943constrainWidthK40F9xA(long $this$constrainWidth_u2dK40F9xA, int width) {
        int minimumValue$iv = Constraints.m6928getMinWidthimpl($this$constrainWidth_u2dK40F9xA);
        int maximumValue$iv = Constraints.m6926getMaxWidthimpl($this$constrainWidth_u2dK40F9xA);
        int $this$fastCoerceAtLeast$iv$iv = width;
        if ($this$fastCoerceAtLeast$iv$iv >= minimumValue$iv) goto L6;
        $this$fastCoerceAtLeast$iv$iv = minimumValue$iv;
    L6:
        if ($this$fastCoerceAtLeast$iv$iv > maximumValue$iv) goto L9;
        return $this$fastCoerceAtLeast$iv$iv;
    L9:
        return maximumValue$iv;
    }

    /* JADX INFO: renamed from: constrainHeight-K40F9xA, reason: not valid java name */
    public static final int m6942constrainHeightK40F9xA(long $this$constrainHeight_u2dK40F9xA, int height) {
        int minimumValue$iv = Constraints.m6927getMinHeightimpl($this$constrainHeight_u2dK40F9xA);
        int maximumValue$iv = Constraints.m6925getMaxHeightimpl($this$constrainHeight_u2dK40F9xA);
        int $this$fastCoerceAtLeast$iv$iv = height;
        if ($this$fastCoerceAtLeast$iv$iv >= minimumValue$iv) goto L6;
        $this$fastCoerceAtLeast$iv$iv = minimumValue$iv;
    L6:
        if ($this$fastCoerceAtLeast$iv$iv > maximumValue$iv) goto L9;
        return $this$fastCoerceAtLeast$iv$iv;
    L9:
        return maximumValue$iv;
    }

    /* JADX INFO: renamed from: isSatisfiedBy-4WqzIAM, reason: not valid java name */
    public static final boolean m6944isSatisfiedBy4WqzIAM(long $this$isSatisfiedBy_u2d4WqzIAM, long size) {
        int r0 = Constraints.m6928getMinWidthimpl($this$isSatisfiedBy_u2d4WqzIAM);
        int r1 = Constraints.m6926getMaxWidthimpl($this$isSatisfiedBy_u2d4WqzIAM);
        int r3 = (int) (size >> 32);
        if (r0 > r3) goto L6;
        if (r3 > r1) goto L6;
        boolean r2 = true;
    L7:
        if (r2 == false) goto L16;
        int r4 = Constraints.m6927getMinHeightimpl($this$isSatisfiedBy_u2d4WqzIAM);
        int r5 = Constraints.m6925getMaxHeightimpl($this$isSatisfiedBy_u2d4WqzIAM);
        int r6 = (int) (4294967295L & size);
        if (r4 > r6) goto L12;
        if (r6 > r5) goto L12;
        boolean r7 = true;
    L13:
        if (r7 == false) goto L16;
        return true;
    L12:
        r7 = false;
    L16:
        return false;
    L6:
        r2 = false;
        goto L7
    }

    /* JADX INFO: renamed from: offset-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ long m6946offsetNN6EwU$default(long r1, int r3, int r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r4 = 0;
    L9:
        return m6945offsetNN6EwU(r1, r3, r4);
    }

    /* JADX INFO: renamed from: offset-NN6Ew-U, reason: not valid java name */
    public static final long m6945offsetNN6EwU(long $this$offset_u2dNN6Ew_u2dU, int horizontal, int vertical) {
        int $this$fastCoerceAtLeast$iv = Constraints.m6928getMinWidthimpl($this$offset_u2dNN6Ew_u2dU) + horizontal;
        if ($this$fastCoerceAtLeast$iv >= 0) goto L5;
        $this$fastCoerceAtLeast$iv = 0;
    L5:
        int max$iv = Constraints.m6926getMaxWidthimpl($this$offset_u2dNN6Ew_u2dU);
        if (max$iv != Integer.MAX_VALUE) goto L8;
        int $this$fastCoerceAtLeast$iv$iv = max$iv;
    L11:
        int $this$fastCoerceAtLeast$iv2 = Constraints.m6927getMinHeightimpl($this$offset_u2dNN6Ew_u2dU) + vertical;
        if ($this$fastCoerceAtLeast$iv2 >= 0) goto L14;
        $this$fastCoerceAtLeast$iv2 = 0;
    L14:
        int max$iv2 = Constraints.m6925getMaxHeightimpl($this$offset_u2dNN6Ew_u2dU);
        if (max$iv2 != Integer.MAX_VALUE) goto L17;
        int $this$fastCoerceAtLeast$iv$iv2 = max$iv2;
    L21:
        return Constraints($this$fastCoerceAtLeast$iv, $this$fastCoerceAtLeast$iv$iv, $this$fastCoerceAtLeast$iv2, $this$fastCoerceAtLeast$iv$iv2);
    L17:
        $this$fastCoerceAtLeast$iv$iv2 = max$iv2 + vertical;
        if ($this$fastCoerceAtLeast$iv$iv2 >= 0) goto L21;
        $this$fastCoerceAtLeast$iv$iv2 = 0;
        goto L21
    L8:
        $this$fastCoerceAtLeast$iv$iv = max$iv + horizontal;
        if ($this$fastCoerceAtLeast$iv$iv >= 0) goto L11;
        $this$fastCoerceAtLeast$iv$iv = 0;
        goto L11
    }

    private static final int addMaxWithMinimum(int max, int value) {
        if (max == Integer.MAX_VALUE) goto L9;
        int $this$fastCoerceAtLeast$iv = max + value;
        if ($this$fastCoerceAtLeast$iv < 0) goto L8;
        return $this$fastCoerceAtLeast$iv;
    L8:
        return 0;
    L9:
        return max;
    }

    private static final int indexToBitOffset(int index) {
        return ((index & 1) << 1) + (((index & 2) >> 1) * 3);
    }

    private static final int bitOffsetToIndex(int bits) {
        return (bits >> 1) + (bits & 1);
    }

    private static final int minHeightOffsets(int bitOffset) {
        return bitOffset + 15;
    }

    private static final int widthMask(int bitOffset) {
        return (1 << (bitOffset + 13)) - 1;
    }

    private static final int heightMask(int bitOffset) {
        return (1 << (18 - bitOffset)) - 1;
    }
}
