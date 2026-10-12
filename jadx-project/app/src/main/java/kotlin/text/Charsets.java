package kotlin.text;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Charsets.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\rR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lkotlin/text/Charsets;", "", "<init>", "()V", "UTF_8", "Ljava/nio/charset/Charset;", "UTF_16", "UTF_16BE", "UTF_16LE", "US_ASCII", "ISO_8859_1", "UTF_32", "UTF32", "()Ljava/nio/charset/Charset;", "utf_32", "UTF_32LE", "UTF32_LE", "utf_32le", "UTF_32BE", "UTF32_BE", "utf_32be", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Charsets {
    public static final Charsets INSTANCE = null;
    public static final Charset ISO_8859_1 = null;
    public static final Charset US_ASCII = null;
    public static final Charset UTF_16 = null;
    public static final Charset UTF_16BE = null;
    public static final Charset UTF_16LE = null;
    public static final Charset UTF_8 = null;
    private static volatile Charset utf_32;
    private static volatile Charset utf_32be;
    private static volatile Charset utf_32le;

    private Charsets() {
    }

    static {
        INSTANCE = new Charsets();
        Charset r0 = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(r0, "forName(...)");
        UTF_8 = r0;
        Charset r1 = Charset.forName("UTF-16");
        Intrinsics.checkNotNullExpressionValue(r1, "forName(...)");
        UTF_16 = r1;
        Charset r2 = Charset.forName("UTF-16BE");
        Intrinsics.checkNotNullExpressionValue(r2, "forName(...)");
        UTF_16BE = r2;
        Charset r3 = Charset.forName("UTF-16LE");
        Intrinsics.checkNotNullExpressionValue(r3, "forName(...)");
        UTF_16LE = r3;
        Charset r4 = Charset.forName("US-ASCII");
        Intrinsics.checkNotNullExpressionValue(r4, "forName(...)");
        US_ASCII = r4;
        Charset r5 = Charset.forName("ISO-8859-1");
        Intrinsics.checkNotNullExpressionValue(r5, "forName(...)");
        ISO_8859_1 = r5;
    }

    public final Charset UTF32() {
        Charset r0 = utf_32;
        if (r0 != null) goto L6;
        Charset charset = Charset.forName("UTF-32");
        Intrinsics.checkNotNullExpressionValue(charset, "forName(...)");
        utf_32 = charset;
        return charset;
    L6:
        return r0;
    }

    public final Charset UTF32_LE() {
        Charset r0 = utf_32le;
        if (r0 != null) goto L6;
        Charset charset = Charset.forName("UTF-32LE");
        Intrinsics.checkNotNullExpressionValue(charset, "forName(...)");
        utf_32le = charset;
        return charset;
    L6:
        return r0;
    }

    public final Charset UTF32_BE() {
        Charset r0 = utf_32be;
        if (r0 != null) goto L6;
        Charset charset = Charset.forName("UTF-32BE");
        Intrinsics.checkNotNullExpressionValue(charset, "forName(...)");
        utf_32be = charset;
        return charset;
    L6:
        return r0;
    }
}
