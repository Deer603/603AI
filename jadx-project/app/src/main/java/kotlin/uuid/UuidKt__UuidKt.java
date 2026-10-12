package kotlin.uuid;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.HexExtensionsKt;

/* JADX INFO: compiled from: Uuid.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a,\u0010\b\u001a\u00020\t*\u00020\u00052\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0001\u001a\u0014\u0010\u000e\u001a\u00020\t*\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u001c\u0010\u0010\u001a\u00020\t*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0005H\u0000\u001a\u0010\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u000fH\u0001\u001a\u0010\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u000fH\u0001\u001a\u0019\u0010\u0016\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0002\b\u0018\u001a\u0019\u0010\u0016\u001a\u00020\u000f*\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0002\b\u0018¨\u0006\u001a"}, d2 = {"uuidFromRandomBytes", "Lkotlin/uuid/Uuid;", "randomBytes", "", "getLongAtCommonImpl", "", "index", "", "formatBytesIntoCommonImpl", "", "dst", "dstOffset", "startIndex", "endIndex", "checkHyphenAt", "", "setLongAtCommonImpl", "value", "uuidParseHexDashCommonImpl", "hexDashString", "uuidParseHexCommonImpl", "hexString", "truncateForErrorMessage", "maxLength", "truncateForErrorMessage$UuidKt__UuidKt", "maxSize", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/uuid/UuidKt")
class UuidKt__UuidKt extends UuidKt__UuidJVMKt {
    public UuidKt__UuidKt() {
    }

    public static final /* synthetic */ String access$truncateForErrorMessage(String $receiver, int maxLength) {
        return truncateForErrorMessage$UuidKt__UuidKt($receiver, maxLength);
    }

    public static final /* synthetic */ String access$truncateForErrorMessage(byte[] $receiver, int maxSize) {
        return truncateForErrorMessage$UuidKt__UuidKt($receiver, maxSize);
    }

    public static final Uuid uuidFromRandomBytes(byte[] randomBytes) {
        Intrinsics.checkNotNullParameter(randomBytes, "randomBytes");
        randomBytes[6] = (byte) (randomBytes[6] & 15);
        randomBytes[6] = (byte) (randomBytes[6] | 64);
        randomBytes[8] = (byte) (randomBytes[8] & 63);
        randomBytes[8] = (byte) (randomBytes[8] | ByteCompanionObject.MIN_VALUE);
        return Uuid.Companion.fromByteArray(randomBytes);
    }

    public static final long getLongAtCommonImpl(byte[] $this$getLongAtCommonImpl, int index) {
        Intrinsics.checkNotNullParameter($this$getLongAtCommonImpl, "<this>");
        return ((((((((((long) $this$getLongAtCommonImpl[index + 0]) & 255) << 56) | ((((long) $this$getLongAtCommonImpl[index + 1]) & 255) << 48)) | ((((long) $this$getLongAtCommonImpl[index + 2]) & 255) << 40)) | ((((long) $this$getLongAtCommonImpl[index + 3]) & 255) << 32)) | ((((long) $this$getLongAtCommonImpl[index + 4]) & 255) << 24)) | ((((long) $this$getLongAtCommonImpl[index + 5]) & 255) << 16)) | ((((long) $this$getLongAtCommonImpl[index + 6]) & 255) << 8)) | (255 & ((long) $this$getLongAtCommonImpl[index + 7]));
    }

    public static final void formatBytesIntoCommonImpl(long $this$formatBytesIntoCommonImpl, byte[] dst, int dstOffset, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(dst, "dst");
        int dstIndex = dstOffset;
        int reversedIndex = 7 - startIndex;
        int r2 = 8 - endIndex;
        if (r2 > reversedIndex) goto L7;
    L4:
        int shift = reversedIndex << 3;
        int byteDigits = HexExtensionsKt.getBYTE_TO_LOWER_CASE_HEX_DIGITS()[(int) (($this$formatBytesIntoCommonImpl >> shift) & 255)];
        int dstIndex2 = dstIndex + 1;
        dst[dstIndex] = (byte) (byteDigits >> 8);
        dstIndex = dstIndex2 + 1;
        dst[dstIndex2] = (byte) byteDigits;
        if (reversedIndex == r2) goto L9;
        reversedIndex = reversedIndex - 1;
        goto L4
    L9:
        return;
    }

    public static final void checkHyphenAt(String $this$checkHyphenAt, int index) {
        Intrinsics.checkNotNullParameter($this$checkHyphenAt, "<this>");
        if ($this$checkHyphenAt.charAt(index) != '-') goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L9;
        return;
    L9:
        throw new IllegalArgumentException(("Expected '-' (hyphen) at index " + index + ", but was '" + $this$checkHyphenAt.charAt(index) + '\'').toString());
    L5:
        r0 = false;
        goto L6
    }

    public static final void setLongAtCommonImpl(byte[] $this$setLongAtCommonImpl, int index, long value) {
        Intrinsics.checkNotNullParameter($this$setLongAtCommonImpl, "<this>");
        int i = index;
        int reversedIndex = 7;
    L4:
        if ((-1) >= reversedIndex) goto L6;
        int shift = reversedIndex << 3;
        $this$setLongAtCommonImpl[i] = (byte) (value >> shift);
        reversedIndex = reversedIndex - 1;
        i = i + 1;
        goto L4
    }

    public static final Uuid uuidParseHexDashCommonImpl(String hexDashString) {
        Intrinsics.checkNotNullParameter(hexDashString, "hexDashString");
        long part1 = HexExtensionsKt.hexToLong$default(hexDashString, 0, 8, null, 4, null);
        UuidKt.checkHyphenAt(hexDashString, 8);
        long part2 = HexExtensionsKt.hexToLong$default(hexDashString, 9, 13, null, 4, null);
        UuidKt.checkHyphenAt(hexDashString, 13);
        long part3 = HexExtensionsKt.hexToLong$default(hexDashString, 14, 18, null, 4, null);
        UuidKt.checkHyphenAt(hexDashString, 18);
        long part4 = HexExtensionsKt.hexToLong$default(hexDashString, 19, 23, null, 4, null);
        UuidKt.checkHyphenAt(hexDashString, 23);
        long part5 = HexExtensionsKt.hexToLong$default(hexDashString, 24, 36, null, 4, null);
        long msb = ((part1 << 32) | (part2 << 16)) | part3;
        long lsb = (part4 << 48) | part5;
        return Uuid.Companion.fromLongs(msb, lsb);
    }

    public static final Uuid uuidParseHexCommonImpl(String hexString) {
        Intrinsics.checkNotNullParameter(hexString, "hexString");
        long msb = HexExtensionsKt.hexToLong$default(hexString, 0, 16, null, 4, null);
        long lsb = HexExtensionsKt.hexToLong$default(hexString, 16, 32, null, 4, null);
        return Uuid.Companion.fromLongs(msb, lsb);
    }

    private static final String truncateForErrorMessage$UuidKt__UuidKt(String $this$truncateForErrorMessage, int maxLength) {
        if ($this$truncateForErrorMessage.length() <= maxLength) goto L7;
        StringBuilder r0 = new StringBuilder();
        Intrinsics.checkNotNull($this$truncateForErrorMessage, "null cannot be cast to non-null type java.lang.String");
        String r1 = $this$truncateForErrorMessage.substring(0, maxLength);
        Intrinsics.checkNotNullExpressionValue(r1, "substring(...)");
        return r0.append(r1).append("...").toString();
    L7:
        return $this$truncateForErrorMessage;
    }

    private static final String truncateForErrorMessage$UuidKt__UuidKt(byte[] $this$truncateForErrorMessage, int maxSize) {
        return ArraysKt.joinToString$default($this$truncateForErrorMessage, null, "[", "]", maxSize, null, null, 49, null);
    }
}
