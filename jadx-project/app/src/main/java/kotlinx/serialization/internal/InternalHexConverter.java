package kotlinx.serialization.internal;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Platform.common.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lkotlinx/serialization/internal/InternalHexConverter;", "", "<init>", "()V", "hexCode", "", "parseHexBinary", "", "s", "hexToInt", "", "ch", "", "printHexBinary", "data", "lowerCase", "", "toHexString", "n", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InternalHexConverter {
    public static final InternalHexConverter INSTANCE = null;
    private static final String hexCode = "0123456789ABCDEF";

    static {
        INSTANCE = new InternalHexConverter();
    }

    private InternalHexConverter() {
    }

    public final byte[] parseHexBinary(String s) {
        Intrinsics.checkNotNullParameter(s, "s");
        int len = s.length();
        if ((len % 2) != 0) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == false) goto L20;
        byte[] bytes = new byte[len / 2];
        int i = 0;
    L8:
        if (i >= len) goto L18;
        int h = hexToInt(s.charAt(i));
        int l = hexToInt(s.charAt(i + 1));
        if (h == (-1)) goto L13;
        if (l == (-1)) goto L13;
        boolean r7 = true;
    L14:
        if (r7 == false) goto L17;
        bytes[i / 2] = (byte) ((h << 4) + l);
        i = i + 2;
        goto L8
    L17:
        throw new IllegalArgumentException(("Invalid hex chars: " + s.charAt(i) + s.charAt(i + 1)).toString());
    L13:
        r7 = false;
        goto L14
    L18:
        return bytes;
    L20:
        throw new IllegalArgumentException("HexBinary string must be even length".toString());
    L5:
        r1 = false;
        goto L6
    }

    private final int hexToInt(char ch) {
        boolean r1 = true;
        if ('0' <= ch) goto L5;
    L7:
        boolean r0 = false;
    L8:
        if (r0 == false) goto L11;
        return ch - '0';
    L11:
        if ('A' <= ch) goto L13;
    L15:
        boolean r2 = false;
    L16:
        if (r2 == false) goto L19;
        return (ch - 'A') + 10;
    L19:
        if ('a' <= ch) goto L21;
    L23:
        r1 = false;
    L24:
        if (r1 == true) goto L30;
        return -1;
    L30:
        return (ch - 'a') + 10;
    L21:
        if (ch >= 'g') goto L23;
    L13:
        if (ch >= 'G') goto L15;
        r2 = true;
        goto L16
    L5:
        if (ch >= ':') goto L7;
        r0 = true;
        goto L8
    }

    public static /* synthetic */ String printHexBinary$default(InternalHexConverter r0, byte[] r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = false;
    L6:
        return r0.printHexBinary(r1, r2);
    }

    public final String printHexBinary(byte[] data, boolean lowerCase) {
        Intrinsics.checkNotNullParameter(data, "data");
        StringBuilder r = new StringBuilder(data.length * 2);
        int r1 = data.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        byte b = data[r2];
        r.append(hexCode.charAt((b >> 4) & 15));
        r.append(hexCode.charAt(b & 15));
        r2 = r2 + 1;
        goto L3
    L5:
        String r3 = r.toString();
        Intrinsics.checkNotNullExpressionValue(r3, "toString(...)");
        if (lowerCase == false) goto L9;
        String r4 = r3.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(r4, "toLowerCase(...)");
        return r4;
    L9:
        return r3;
    }

    public final String toHexString(int n) {
        byte[] arr = new byte[4];
        int i = 0;
    L3:
        if (i >= 4) goto L5;
        arr[i] = (byte) (n >> (24 - (i * 8)));
        i = i + 1;
        goto L3
    L5:
        boolean r0 = true;
        String it = StringsKt.trimStart(printHexBinary(arr, true), new char[]{'0'});
        if (it.length() > 0) goto L9;
        r0 = false;
    L9:
        if (r0 == true) goto L12;
        it = null;
    L12:
        if (it != null) goto L16;
        return "0";
    L16:
        return it;
    }
}
