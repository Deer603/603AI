package kotlin.text;

import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UHexExtensions.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a2\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u001c\u0010\f\u001a\u00020\u0002*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0002\u0010\r\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001c\u0010\u0011\u001a\u00020\u000e*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0002\u0010\u0012\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u0016\u001a\u00020\u0013*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0002\u0010\u0017\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00182\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001c\u0010\u001b\u001a\u00020\u0018*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0002\u0010\u001c\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u001d2\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001c\u0010 \u001a\u00020\u001d*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0002\u0010!¨\u0006\""}, d2 = {"toHexString", "", "Lkotlin/UByteArray;", "format", "Lkotlin/text/HexFormat;", "toHexString-zHuV2wU", "([BLkotlin/text/HexFormat;)Ljava/lang/String;", "startIndex", "", "endIndex", "toHexString-lZCiFrA", "([BIILkotlin/text/HexFormat;)Ljava/lang/String;", "hexToUByteArray", "(Ljava/lang/String;Lkotlin/text/HexFormat;)[B", "Lkotlin/UByte;", "toHexString-ZQbaR00", "(BLkotlin/text/HexFormat;)Ljava/lang/String;", "hexToUByte", "(Ljava/lang/String;Lkotlin/text/HexFormat;)B", "Lkotlin/UShort;", "toHexString-r3ox_E0", "(SLkotlin/text/HexFormat;)Ljava/lang/String;", "hexToUShort", "(Ljava/lang/String;Lkotlin/text/HexFormat;)S", "Lkotlin/UInt;", "toHexString-8M7LxHw", "(ILkotlin/text/HexFormat;)Ljava/lang/String;", "hexToUInt", "(Ljava/lang/String;Lkotlin/text/HexFormat;)I", "Lkotlin/ULong;", "toHexString-8UJCm-I", "(JLkotlin/text/HexFormat;)Ljava/lang/String;", "hexToULong", "(Ljava/lang/String;Lkotlin/text/HexFormat;)J", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class UHexExtensionsKt {
    /* JADX INFO: renamed from: toHexString-zHuV2wU$default, reason: not valid java name */
    static /* synthetic */ String m8749toHexStringzHuV2wU$default(byte[] $this$toHexString_u2dzHuV2wU_u24default, HexFormat format, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        format = HexFormat.Companion.getDefault();
    L5:
        Intrinsics.checkNotNullParameter($this$toHexString_u2dzHuV2wU_u24default, "$this$toHexString");
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString($this$toHexString_u2dzHuV2wU_u24default, format);
    }

    /* JADX INFO: renamed from: toHexString-zHuV2wU, reason: not valid java name */
    private static final String m8748toHexStringzHuV2wU(byte[] $this$toHexString_u2dzHuV2wU, HexFormat format) {
        Intrinsics.checkNotNullParameter($this$toHexString_u2dzHuV2wU, "$this$toHexString");
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString($this$toHexString_u2dzHuV2wU, format);
    }

    /* JADX INFO: renamed from: toHexString-lZCiFrA$default, reason: not valid java name */
    static /* synthetic */ String m8745toHexStringlZCiFrA$default(byte[] $this$toHexString_u2dlZCiFrA_u24default, int startIndex, int endIndex, HexFormat format, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        startIndex = 0;
    L6:
        if ((r4 & 2) == 0) goto L9;
        endIndex = UByteArray.m7502getSizeimpl($this$toHexString_u2dlZCiFrA_u24default);
    L9:
        if ((r4 & 4) == 0) goto L11;
        format = HexFormat.Companion.getDefault();
    L11:
        Intrinsics.checkNotNullParameter($this$toHexString_u2dlZCiFrA_u24default, "$this$toHexString");
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString($this$toHexString_u2dlZCiFrA_u24default, startIndex, endIndex, format);
    }

    /* JADX INFO: renamed from: toHexString-lZCiFrA, reason: not valid java name */
    private static final String m8744toHexStringlZCiFrA(byte[] $this$toHexString_u2dlZCiFrA, int startIndex, int endIndex, HexFormat format) {
        Intrinsics.checkNotNullParameter($this$toHexString_u2dlZCiFrA, "$this$toHexString");
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString($this$toHexString_u2dlZCiFrA, startIndex, endIndex, format);
    }

    static /* synthetic */ byte[] hexToUByteArray$default(String $this$hexToUByteArray_u24default, HexFormat format, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        format = HexFormat.Companion.getDefault();
    L5:
        Intrinsics.checkNotNullParameter($this$hexToUByteArray_u24default, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UByteArray.m7496constructorimpl(HexExtensionsKt.hexToByteArray($this$hexToUByteArray_u24default, format));
    }

    private static final byte[] hexToUByteArray(String $this$hexToUByteArray, HexFormat format) {
        Intrinsics.checkNotNullParameter($this$hexToUByteArray, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UByteArray.m7496constructorimpl(HexExtensionsKt.hexToByteArray($this$hexToUByteArray, format));
    }

    /* JADX INFO: renamed from: toHexString-ZQbaR00$default, reason: not valid java name */
    static /* synthetic */ String m8743toHexStringZQbaR00$default(byte $this$toHexString_u2dZQbaR00_u24default, HexFormat format, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        format = HexFormat.Companion.getDefault();
    L5:
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString($this$toHexString_u2dZQbaR00_u24default, format);
    }

    /* JADX INFO: renamed from: toHexString-ZQbaR00, reason: not valid java name */
    private static final String m8742toHexStringZQbaR00(byte $this$toHexString_u2dZQbaR00, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString($this$toHexString_u2dZQbaR00, format);
    }

    static /* synthetic */ byte hexToUByte$default(String $this$hexToUByte_u24default, HexFormat format, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        format = HexFormat.Companion.getDefault();
    L5:
        Intrinsics.checkNotNullParameter($this$hexToUByte_u24default, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UByte.m7443constructorimpl(HexExtensionsKt.hexToByte($this$hexToUByte_u24default, format));
    }

    private static final byte hexToUByte(String $this$hexToUByte, HexFormat format) {
        Intrinsics.checkNotNullParameter($this$hexToUByte, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UByte.m7443constructorimpl(HexExtensionsKt.hexToByte($this$hexToUByte, format));
    }

    /* JADX INFO: renamed from: toHexString-r3ox_E0$default, reason: not valid java name */
    static /* synthetic */ String m8747toHexStringr3ox_E0$default(short $this$toHexString_u2dr3ox_E0_u24default, HexFormat format, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        format = HexFormat.Companion.getDefault();
    L5:
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString($this$toHexString_u2dr3ox_E0_u24default, format);
    }

    /* JADX INFO: renamed from: toHexString-r3ox_E0, reason: not valid java name */
    private static final String m8746toHexStringr3ox_E0(short $this$toHexString_u2dr3ox_E0, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString($this$toHexString_u2dr3ox_E0, format);
    }

    static /* synthetic */ short hexToUShort$default(String $this$hexToUShort_u24default, HexFormat format, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        format = HexFormat.Companion.getDefault();
    L5:
        Intrinsics.checkNotNullParameter($this$hexToUShort_u24default, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UShort.m7706constructorimpl(HexExtensionsKt.hexToShort($this$hexToUShort_u24default, format));
    }

    private static final short hexToUShort(String $this$hexToUShort, HexFormat format) {
        Intrinsics.checkNotNullParameter($this$hexToUShort, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UShort.m7706constructorimpl(HexExtensionsKt.hexToShort($this$hexToUShort, format));
    }

    /* JADX INFO: renamed from: toHexString-8M7LxHw$default, reason: not valid java name */
    static /* synthetic */ String m8739toHexString8M7LxHw$default(int $this$toHexString_u2d8M7LxHw_u24default, HexFormat format, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        format = HexFormat.Companion.getDefault();
    L5:
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString($this$toHexString_u2d8M7LxHw_u24default, format);
    }

    /* JADX INFO: renamed from: toHexString-8M7LxHw, reason: not valid java name */
    private static final String m8738toHexString8M7LxHw(int $this$toHexString_u2d8M7LxHw, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString($this$toHexString_u2d8M7LxHw, format);
    }

    static /* synthetic */ int hexToUInt$default(String $this$hexToUInt_u24default, HexFormat format, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        format = HexFormat.Companion.getDefault();
    L5:
        Intrinsics.checkNotNullParameter($this$hexToUInt_u24default, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UInt.m7520constructorimpl(HexExtensionsKt.hexToInt($this$hexToUInt_u24default, format));
    }

    private static final int hexToUInt(String $this$hexToUInt, HexFormat format) {
        Intrinsics.checkNotNullParameter($this$hexToUInt, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UInt.m7520constructorimpl(HexExtensionsKt.hexToInt($this$hexToUInt, format));
    }

    /* JADX INFO: renamed from: toHexString-8UJCm-I$default, reason: not valid java name */
    static /* synthetic */ String m8741toHexString8UJCmI$default(long $this$toHexString_u2d8UJCm_u2dI_u24default, HexFormat format, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L5;
        format = HexFormat.Companion.getDefault();
    L5:
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString($this$toHexString_u2d8UJCm_u2dI_u24default, format);
    }

    /* JADX INFO: renamed from: toHexString-8UJCm-I, reason: not valid java name */
    private static final String m8740toHexString8UJCmI(long $this$toHexString_u2d8UJCm_u2dI, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString($this$toHexString_u2d8UJCm_u2dI, format);
    }

    static /* synthetic */ long hexToULong$default(String $this$hexToULong_u24default, HexFormat format, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        format = HexFormat.Companion.getDefault();
    L5:
        Intrinsics.checkNotNullParameter($this$hexToULong_u24default, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return ULong.m7599constructorimpl(HexExtensionsKt.hexToLong($this$hexToULong_u24default, format));
    }

    private static final long hexToULong(String $this$hexToULong, HexFormat format) {
        Intrinsics.checkNotNullParameter($this$hexToULong, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return ULong.m7599constructorimpl(HexExtensionsKt.hexToLong($this$hexToULong, format));
    }
}
