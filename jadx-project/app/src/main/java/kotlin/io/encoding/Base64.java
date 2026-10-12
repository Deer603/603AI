package kotlin.io.encoding;

import androidx.webkit.Profile;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.collections.AbstractList;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: Base64.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\t\b\u0017\u0018\u0000 B2\u00020\u0001:\u0002ABB)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\bH\u0007J\"\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006J4\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006J\"\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006J=\u0010\u001f\u001a\u0002H \"\f\b\u0000\u0010 *\u00060!j\u0002`\"2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u0002H 2\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006¢\u0006\u0002\u0010#J\"\u0010$\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006J4\u0010%\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006J\"\u0010$\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020&2\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006J4\u0010%\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020&2\u0006\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006J%\u0010'\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0000¢\u0006\u0002\b(J5\u0010)\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0000¢\u0006\u0002\b*J\u0015\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006H\u0000¢\u0006\u0002\b-J\b\u0010.\u001a\u00020\u0003H\u0002J0\u0010/\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J%\u00100\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0000¢\u0006\u0002\b1J%\u00102\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020&2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0000¢\u0006\u0002\b3J\u0015\u00104\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0002\b5J(\u00106\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00107\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u0006H\u0002J\u0010\u00109\u001a\u00020:2\u0006\u00107\u001a\u00020\u0006H\u0002J \u0010;\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J%\u0010<\u001a\u00020:2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0000¢\u0006\u0002\b=J \u0010>\u001a\u00020:2\u0006\u0010?\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u0006H\u0002R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lkotlin/io/encoding/Base64;", "", "isUrlSafe", "", "isMimeScheme", "mimeLineLength", "", "paddingOption", "Lkotlin/io/encoding/Base64$PaddingOption;", "<init>", "(ZZILkotlin/io/encoding/Base64$PaddingOption;)V", "isUrlSafe$kotlin_stdlib", "()Z", "isMimeScheme$kotlin_stdlib", "getMimeLineLength$kotlin_stdlib", "()I", "getPaddingOption$kotlin_stdlib", "()Lkotlin/io/encoding/Base64$PaddingOption;", "mimeGroupsPerLine", "withPadding", "option", "encodeToByteArray", "", "source", "startIndex", "endIndex", "encodeIntoByteArray", "destination", "destinationOffset", "encode", "", "encodeToAppendable", "A", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "([BLjava/lang/Appendable;II)Ljava/lang/Appendable;", "decode", "decodeIntoByteArray", "", "encodeToByteArrayImpl", "encodeToByteArrayImpl$kotlin_stdlib", "encodeIntoByteArrayImpl", "encodeIntoByteArrayImpl$kotlin_stdlib", "encodeSize", "sourceSize", "encodeSize$kotlin_stdlib", "shouldPadOnEncode", "decodeImpl", "decodeSize", "decodeSize$kotlin_stdlib", "charsToBytesImpl", "charsToBytesImpl$kotlin_stdlib", "bytesToStringImpl", "bytesToStringImpl$kotlin_stdlib", "handlePaddingSymbol", "padIndex", "byteStart", "checkPaddingIsAllowed", "", "skipIllegalSymbolsIfMime", "checkSourceBounds", "checkSourceBounds$kotlin_stdlib", "checkDestinationBounds", "destinationSize", "capacityNeeded", "PaddingOption", Profile.DEFAULT_PROFILE_NAME, "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class Base64 {
    public static final Default Default = null;
    private static final Base64 Mime = null;
    private static final Base64 Pem = null;
    private static final Base64 UrlSafe = null;
    private static final int bitsPerByte = 8;
    private static final int bitsPerSymbol = 6;
    public static final int bytesPerGroup = 3;
    private static final int lineLengthMime = 76;
    private static final int lineLengthPem = 64;
    private static final byte[] mimeLineSeparatorSymbols = null;
    public static final byte padSymbol = 61;
    public static final int symbolsPerGroup = 4;
    private final boolean isMimeScheme;
    private final boolean isUrlSafe;
    private final int mimeGroupsPerLine;
    private final int mimeLineLength;
    private final PaddingOption paddingOption;

    /* JADX INFO: compiled from: Base64.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u0018"}, d2 = {"Lkotlin/io/encoding/Base64$Default;", "Lkotlin/io/encoding/Base64;", "<init>", "()V", "bitsPerByte", "", "bitsPerSymbol", "bytesPerGroup", "symbolsPerGroup", "padSymbol", "", "lineLengthMime", "lineLengthPem", "mimeLineSeparatorSymbols", "", "getMimeLineSeparatorSymbols$kotlin_stdlib", "()[B", "UrlSafe", "getUrlSafe", "()Lkotlin/io/encoding/Base64;", "Mime", "getMime", "Pem", "getPem", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Default extends Base64 {
        public /* synthetic */ Default(DefaultConstructorMarker r1) {
            this();
        }

        private Default() {
            boolean r1 = false;
            boolean r2 = false;
            int r3 = -1;
            super(r1, r2, r3, PaddingOption.PRESENT, null);
        }

        public final byte[] getMimeLineSeparatorSymbols$kotlin_stdlib() {
            return Base64.access$getMimeLineSeparatorSymbols$cp();
        }

        public final Base64 getUrlSafe() {
            return Base64.access$getUrlSafe$cp();
        }

        public final Base64 getMime() {
            return Base64.access$getMime$cp();
        }

        public final Base64 getPem() {
            return Base64.access$getPem$cp();
        }
    }

    /* JADX INFO: compiled from: Base64.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lkotlin/io/encoding/Base64$PaddingOption;", "", "<init>", "(Ljava/lang/String;I)V", "PRESENT", "ABSENT", "PRESENT_OPTIONAL", "ABSENT_OPTIONAL", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final enum PaddingOption extends Enum<PaddingOption> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ PaddingOption[] $VALUES = null;
        public static final PaddingOption ABSENT = null;
        public static final PaddingOption ABSENT_OPTIONAL = null;
        public static final PaddingOption PRESENT = null;
        public static final PaddingOption PRESENT_OPTIONAL = null;

        private static final /* synthetic */ PaddingOption[] $values() {
            return new PaddingOption[]{PRESENT, ABSENT, PRESENT_OPTIONAL, ABSENT_OPTIONAL};
        }

        public static EnumEntries<PaddingOption> getEntries() {
            return $ENTRIES;
        }

        public static PaddingOption valueOf(String r1) {
            return (PaddingOption) Enum.valueOf(PaddingOption.class, r1);
        }

        public static PaddingOption[] values() {
            return (PaddingOption[]) $VALUES.clone();
        }

        private PaddingOption(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        static {
            PRESENT = new PaddingOption("PRESENT", 0);
            ABSENT = new PaddingOption("ABSENT", 1);
            PRESENT_OPTIONAL = new PaddingOption("PRESENT_OPTIONAL", 2);
            ABSENT_OPTIONAL = new PaddingOption("ABSENT_OPTIONAL", 3);
            $VALUES = $values();
            $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
        }
    }

    public /* synthetic */ Base64(boolean r1, boolean r2, int r3, PaddingOption r4, DefaultConstructorMarker r5) {
        this(r1, r2, r3, r4);
    }

    public static final /* synthetic */ Base64 access$getMime$cp() {
        return Mime;
    }

    public static final /* synthetic */ byte[] access$getMimeLineSeparatorSymbols$cp() {
        return mimeLineSeparatorSymbols;
    }

    public static final /* synthetic */ Base64 access$getPem$cp() {
        return Pem;
    }

    public static final /* synthetic */ Base64 access$getUrlSafe$cp() {
        return UrlSafe;
    }

    private Base64(boolean isUrlSafe, boolean isMimeScheme, int mimeLineLength, PaddingOption paddingOption) {
        this.isUrlSafe = isUrlSafe;
        this.isMimeScheme = isMimeScheme;
        this.mimeLineLength = mimeLineLength;
        this.paddingOption = paddingOption;
        if (this.isUrlSafe == true) goto L5;
    L8:
        boolean r0 = true;
    L9:
        if (r0 == false) goto L13;
        this.mimeGroupsPerLine = this.mimeLineLength / 4;
        return;
    L13:
        throw new IllegalArgumentException("Failed requirement.".toString());
    L5:
        if (this.isMimeScheme == false) goto L8;
        r0 = false;
        goto L9
    }

    public final boolean isUrlSafe$kotlin_stdlib() {
        return this.isUrlSafe;
    }

    public final boolean isMimeScheme$kotlin_stdlib() {
        return this.isMimeScheme;
    }

    public final int getMimeLineLength$kotlin_stdlib() {
        return this.mimeLineLength;
    }

    public final PaddingOption getPaddingOption$kotlin_stdlib() {
        return this.paddingOption;
    }

    public final Base64 withPadding(PaddingOption option) {
        Intrinsics.checkNotNullParameter(option, "option");
        if (this.paddingOption != option) goto L6;
        return this;
    L6:
        return new Base64(this.isUrlSafe, this.isMimeScheme, this.mimeLineLength, option);
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(Base64 r0, byte[] r1, int r2, int r3, int r4, Object r5) {
        if (r5 != null) goto L12;
        if ((r4 & 2) == 0) goto L7;
        r2 = 0;
    L7:
        if ((r4 & 4) == 0) goto L10;
        r3 = r1.length;
    L10:
        return r0.encodeToByteArray(r1, r2, r3);
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToByteArray");
    }

    public final byte[] encodeToByteArray(byte[] source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        return encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex);
    }

    public static /* synthetic */ int encodeIntoByteArray$default(Base64 r1, byte[] r2, byte[] r3, int r4, int r5, int r6, int r7, Object r8) {
        if (r8 != null) goto L15;
        if ((r7 & 4) == 0) goto L7;
        r4 = 0;
    L7:
        if ((r7 & 8) == 0) goto L10;
        r5 = 0;
    L10:
        if ((r7 & 16) == 0) goto L13;
        r6 = r2.length;
    L13:
        return r1.encodeIntoByteArray(r2, r3, r4, r5, r6);
    L15:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeIntoByteArray");
    }

    public final int encodeIntoByteArray(byte[] source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        return encodeIntoByteArrayImpl$kotlin_stdlib(source, destination, destinationOffset, startIndex, endIndex);
    }

    public static /* synthetic */ String encode$default(Base64 r0, byte[] r1, int r2, int r3, int r4, Object r5) {
        if (r5 != null) goto L12;
        if ((r4 & 2) == 0) goto L7;
        r2 = 0;
    L7:
        if ((r4 & 4) == 0) goto L10;
        r3 = r1.length;
    L10:
        return r0.encode(r1, r2, r3);
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
    }

    public final String encode(byte[] source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new String(encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex), Charsets.ISO_8859_1);
    }

    public static /* synthetic */ Appendable encodeToAppendable$default(Base64 r0, byte[] r1, Appendable r2, int r3, int r4, int r5, Object r6) {
        if (r6 != null) goto L12;
        if ((r5 & 4) == 0) goto L7;
        r3 = 0;
    L7:
        if ((r5 & 8) == 0) goto L10;
        r4 = r1.length;
    L10:
        return r0.encodeToAppendable(r1, r2, r3, r4);
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToAppendable");
    }

    public final <A extends Appendable> A encodeToAppendable(byte[] source, A r5, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(r5, "destination");
        String stringResult = new String(encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex), Charsets.ISO_8859_1);
        r5.append(stringResult);
        return r5;
    }

    public static /* synthetic */ byte[] decode$default(Base64 r0, byte[] r1, int r2, int r3, int r4, Object r5) {
        if (r5 != null) goto L12;
        if ((r4 & 2) == 0) goto L7;
        r2 = 0;
    L7:
        if ((r4 & 4) == 0) goto L10;
        r3 = r1.length;
    L10:
        return r0.decode(r1, r2, r3);
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
    }

    public final byte[] decode(byte[] source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
        int decodeSize = decodeSize$kotlin_stdlib(source, startIndex, endIndex);
        byte[] destination = new byte[decodeSize];
        int bytesWritten = decodeImpl(source, destination, 0, startIndex, endIndex);
        if (bytesWritten != destination.length) goto L5;
        boolean r9 = true;
    L6:
        if (r9 == false) goto L9;
        return destination;
    L9:
        throw new IllegalStateException("Check failed.");
    L5:
        r9 = false;
        goto L6
    }

    public static /* synthetic */ int decodeIntoByteArray$default(Base64 r1, byte[] r2, byte[] r3, int r4, int r5, int r6, int r7, Object r8) {
        if (r8 != null) goto L15;
        if ((r7 & 4) == 0) goto L7;
        r4 = 0;
    L7:
        if ((r7 & 8) == 0) goto L10;
        r5 = 0;
    L10:
        if ((r7 & 16) == 0) goto L13;
        r6 = r2.length;
    L13:
        return r1.decodeIntoByteArray(r2, r3, r4, r5, r6);
    L15:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
    }

    public final int decodeIntoByteArray(byte[] source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
        checkDestinationBounds(destination.length, destinationOffset, decodeSize$kotlin_stdlib(source, startIndex, endIndex));
        return decodeImpl(source, destination, destinationOffset, startIndex, endIndex);
    }

    public static /* synthetic */ byte[] decode$default(Base64 r0, CharSequence r1, int r2, int r3, int r4, Object r5) {
        if (r5 != null) goto L12;
        if ((r4 & 2) == 0) goto L7;
        r2 = 0;
    L7:
        if ((r4 & 4) == 0) goto L10;
        r3 = r1.length();
    L10:
        return r0.decode(r1, r2, r3);
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
    }

    public final byte[] decode(CharSequence source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        if ((source instanceof String) == false) goto L5;
        checkSourceBounds$kotlin_stdlib(((String) source).length(), startIndex, endIndex);
        String r0 = ((String) source).substring(startIndex, endIndex);
        Intrinsics.checkNotNullExpressionValue(r0, "substring(...)");
        Charset r1 = Charsets.ISO_8859_1;
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type java.lang.String");
        byte[] r2 = r0.getBytes(r1);
        Intrinsics.checkNotNullExpressionValue(r2, "getBytes(...)");
    L6:
        byte[] byteSource = r2;
        return decode$default(this, byteSource, 0, 0, 6, null);
    L5:
        r2 = charsToBytesImpl$kotlin_stdlib(source, startIndex, endIndex);
        goto L6
    }

    public static /* synthetic */ int decodeIntoByteArray$default(Base64 r1, CharSequence r2, byte[] r3, int r4, int r5, int r6, int r7, Object r8) {
        if (r8 != null) goto L15;
        if ((r7 & 4) == 0) goto L7;
        r4 = 0;
    L7:
        if ((r7 & 8) == 0) goto L10;
        r5 = 0;
    L10:
        if ((r7 & 16) == 0) goto L13;
        r6 = r2.length();
    L13:
        return r1.decodeIntoByteArray(r2, r3, r4, r5, r6);
    L15:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
    }

    public final int decodeIntoByteArray(CharSequence source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if ((source instanceof String) == false) goto L5;
        checkSourceBounds$kotlin_stdlib(((String) source).length(), startIndex, endIndex);
        String r0 = ((String) source).substring(startIndex, endIndex);
        Intrinsics.checkNotNullExpressionValue(r0, "substring(...)");
        Charset r1 = Charsets.ISO_8859_1;
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type java.lang.String");
        byte[] r2 = r0.getBytes(r1);
        Intrinsics.checkNotNullExpressionValue(r2, "getBytes(...)");
    L6:
        byte[] byteSource = r2;
        return decodeIntoByteArray$default(this, byteSource, destination, destinationOffset, 0, 0, 24, null);
    L5:
        r2 = charsToBytesImpl$kotlin_stdlib(source, startIndex, endIndex);
        goto L6
    }

    public final byte[] encodeToByteArrayImpl$kotlin_stdlib(byte[] source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
        int encodeSize = encodeSize$kotlin_stdlib(endIndex - startIndex);
        byte[] destination = new byte[encodeSize];
        encodeIntoByteArrayImpl$kotlin_stdlib(source, destination, 0, startIndex, endIndex);
        return destination;
    }

    public final int encodeIntoByteArrayImpl$kotlin_stdlib(byte[] source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
        checkDestinationBounds(destination.length, destinationOffset, encodeSize$kotlin_stdlib(endIndex - startIndex));
        if (this.isUrlSafe == false) goto L5;
        byte[] encodeMap = Base64Kt.access$getBase64UrlEncodeMap$p();
    L6:
        int sourceIndex = startIndex;
        int destinationIndex = destinationOffset;
        if (this.isMimeScheme == false) goto L9;
        int groupsPerLine = this.mimeGroupsPerLine;
    L10:
        boolean r11 = false;
        if ((sourceIndex + 2) >= endIndex) goto L19;
        int groups = Math.min((endIndex - sourceIndex) / 3, groupsPerLine);
        int i = 0;
    L13:
        if (i >= groups) goto L15;
        int sourceIndex2 = sourceIndex + 1;
        int byte1 = source[sourceIndex] & 255;
        int sourceIndex3 = sourceIndex2 + 1;
        int byte2 = source[sourceIndex2] & 255;
        int sourceIndex4 = sourceIndex3 + 1;
        int byte3 = source[sourceIndex3] & 255;
        int bits = ((byte1 << 16) | (byte2 << 8)) | byte3;
        int destinationIndex2 = destinationIndex + 1;
        destination[destinationIndex] = encodeMap[bits >>> 18];
        int destinationIndex3 = destinationIndex2 + 1;
        destination[destinationIndex2] = encodeMap[(bits >>> 12) & 63];
        int destinationIndex4 = destinationIndex3 + 1;
        destination[destinationIndex3] = encodeMap[(bits >>> 6) & 63];
        destinationIndex = destinationIndex4 + 1;
        destination[destinationIndex4] = encodeMap[bits & 63];
        i = i + 1;
        sourceIndex = sourceIndex4;
        goto L13
    L15:
        if (groups != groupsPerLine) goto L10;
        if (sourceIndex == endIndex) goto L10;
        int destinationIndex5 = destinationIndex + 1;
        destination[destinationIndex] = mimeLineSeparatorSymbols[0];
        destinationIndex = destinationIndex5 + 1;
        destination[destinationIndex5] = mimeLineSeparatorSymbols[1];
        goto L10
    L19:
        switch((endIndex - sourceIndex)) {
            case 1: goto L25;
            case 2: goto L21;
            default: goto L29;
        };
    L21:
        int sourceIndex5 = sourceIndex + 1;
        int byte4 = source[sourceIndex] & 255;
        int sourceIndex6 = sourceIndex5 + 1;
        int bits2 = (byte4 << 10) | ((source[sourceIndex5] & 255) << 2);
        int destinationIndex6 = destinationIndex + 1;
        destination[destinationIndex] = encodeMap[bits2 >>> 12];
        int destinationIndex7 = destinationIndex6 + 1;
        destination[destinationIndex6] = encodeMap[(bits2 >>> 6) & 63];
        int destinationIndex8 = destinationIndex7 + 1;
        destination[destinationIndex7] = encodeMap[bits2 & 63];
        if (shouldPadOnEncode() == false) goto L24;
        destinationIndex = destinationIndex8 + 1;
        destination[destinationIndex8] = padSymbol;
        sourceIndex = sourceIndex6;
        goto L29
    L24:
        sourceIndex = sourceIndex6;
        destinationIndex = destinationIndex8;
        goto L29
    L25:
        int byte5 = sourceIndex + 1;
        int byte6 = source[sourceIndex] & 255;
        int bits3 = byte6 << 4;
        int destinationIndex9 = destinationIndex + 1;
        destination[destinationIndex] = encodeMap[bits3 >>> 6];
        destinationIndex = destinationIndex9 + 1;
        destination[destinationIndex9] = encodeMap[bits3 & 63];
        if (shouldPadOnEncode() == false) goto L28;
        int destinationIndex10 = destinationIndex + 1;
        destination[destinationIndex] = padSymbol;
        destinationIndex = destinationIndex10 + 1;
        destination[destinationIndex10] = padSymbol;
        sourceIndex = byte5;
        goto L29
    L28:
        sourceIndex = byte5;
    L29:
        if (sourceIndex != endIndex) goto L31;
        r11 = true;
    L31:
        if (r11 == false) goto L35;
        return destinationIndex - destinationOffset;
    L35:
        throw new IllegalStateException("Check failed.");
    L9:
        groupsPerLine = Integer.MAX_VALUE;
        goto L10
    L5:
        encodeMap = Base64Kt.access$getBase64EncodeMap$p();
        goto L6
    }

    public final int encodeSize$kotlin_stdlib(int sourceSize) {
        int groups = sourceSize / 3;
        int trailingBytes = sourceSize % 3;
        int size = groups * 4;
        if (trailingBytes == 0) goto L10;
        if (shouldPadOnEncode() == false) goto L7;
        int r3 = 4;
    L8:
        size = size + r3;
        goto L10
    L7:
        r3 = trailingBytes + 1;
    L10:
        if (size < 0) goto L19;
        if (this.isMimeScheme == false) goto L14;
        size = size + (((size - 1) / this.mimeLineLength) * 2);
    L14:
        if (size < 0) goto L17;
        return size;
    L17:
        throw new IllegalArgumentException("Input is too big");
    L19:
        throw new IllegalArgumentException("Input is too big");
    }

    private final boolean shouldPadOnEncode() {
        if (this.paddingOption != PaddingOption.PRESENT) goto L5;
    L8:
        return true;
    L5:
        if (this.paddingOption == PaddingOption.PRESENT_OPTIONAL) goto L8;
        return false;
    }

    private final int decodeImpl(byte[] source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        if (this.isUrlSafe == false) goto L5;
        int[] decodeMap = Base64Kt.access$getBase64UrlDecodeMap$p();
    L6:
        int payload = 0;
        int byteStart = -8;
        int symbol1 = startIndex;
        int destinationIndex = destinationOffset;
        boolean hasPadding = false;
    L8:
        if (symbol1 >= endIndex) goto L31;
        if (byteStart != (-8)) goto L16;
        if ((symbol1 + 3) >= endIndex) goto L16;
        int sourceIndex = symbol1 + 1;
        int symbol2 = decodeMap[source[symbol1] & 255];
        int sourceIndex2 = sourceIndex + 1;
        int symbol3 = decodeMap[source[sourceIndex] & 255];
        int sourceIndex3 = sourceIndex2 + 1;
        int r18 = 8;
        int symbol4 = decodeMap[source[sourceIndex2] & UByte.MAX_VALUE];
        int sourceIndex4 = sourceIndex3 + 1;
        int symbol5 = decodeMap[source[sourceIndex3] & UByte.MAX_VALUE];
        int bits = (((symbol2 << 18) | (symbol3 << 12)) | (symbol4 << 6)) | symbol5;
        if (bits >= 0) goto L14;
        symbol1 = sourceIndex4 - 4;
    L17:
        int symbol = source[symbol1] & UByte.MAX_VALUE;
        int symbolBits = decodeMap[symbol];
        if (symbolBits < 0) goto L20;
        int[] decodeMap2 = decodeMap;
        symbol1 = symbol1 + 1;
        payload = (payload << 6) | symbolBits;
        byteStart = byteStart + 6;
        if (byteStart >= 0) goto L29;
        decodeMap = decodeMap2;
        goto L8
    L29:
        destination[destinationIndex] = (byte) (payload >>> byteStart);
        payload = payload & ((1 << byteStart) - 1);
        byteStart = byteStart - 8;
        destinationIndex = destinationIndex + 1;
        decodeMap = decodeMap2;
        goto L8
    L20:
        if (symbolBits == (-2)) goto L21;
        if (this.isMimeScheme == false) goto L25;
        symbol1 = symbol1 + 1;
        goto L8
    L25:
        StringBuilder r3 = new StringBuilder().append("Invalid symbol '").append((char) symbol).append("'(");
        String r11 = Integer.toString(symbol, CharsKt.checkRadix(r18));
        Intrinsics.checkNotNullExpressionValue(r11, "toString(...)");
        throw new IllegalArgumentException(r3.append(r11).append(") at index ").append(symbol1).toString());
    L21:
        hasPadding = true;
        symbol1 = handlePaddingSymbol(source, symbol1, endIndex, byteStart);
    L33:
        if (byteStart == (-2)) goto L52;
        if (byteStart == (-8)) goto L42;
        if (hasPadding == true) goto L42;
        if (this.paddingOption != PaddingOption.PRESENT) goto L42;
        throw new IllegalArgumentException("The padding option is set to PRESENT, but the input is not properly padded");
    L42:
        if (payload != 0) goto L50;
        int sourceIndex5 = skipIllegalSymbolsIfMime(source, symbol1, endIndex);
        if (sourceIndex5 >= endIndex) goto L46;
        int symbol6 = source[sourceIndex5] & UByte.MAX_VALUE;
        StringBuilder r12 = new StringBuilder().append("Symbol '").append((char) symbol6).append("'(");
        String r13 = Integer.toString(symbol6, CharsKt.checkRadix(r18));
        Intrinsics.checkNotNullExpressionValue(r13, "toString(...)");
        throw new IllegalArgumentException(r12.append(r13).append(") at index ").append(sourceIndex5 - 1).append(" is prohibited after the pad character").toString());
    L46:
        return destinationIndex - destinationOffset;
    L50:
        throw new IllegalArgumentException("The pad bits must be zeros");
    L52:
        throw new IllegalArgumentException("The last unit of input does not have enough bits");
    L14:
        int destinationIndex2 = destinationIndex + 1;
        destination[destinationIndex] = (byte) (bits >> 16);
        int destinationIndex3 = destinationIndex2 + 1;
        destination[destinationIndex2] = (byte) (bits >> 8);
        destination[destinationIndex3] = (byte) bits;
        destinationIndex = destinationIndex3 + 1;
        symbol1 = sourceIndex4;
    L16:
        r18 = 8;
        goto L17
    L31:
        r18 = 8;
        goto L33
    L5:
        decodeMap = Base64Kt.access$getBase64DecodeMap$p();
        goto L6
    }

    public final int decodeSize$kotlin_stdlib(byte[] source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        int symbols = endIndex - startIndex;
        if (symbols != 0) goto L7;
        return 0;
    L7:
        if (symbols == 1) goto L27;
        if (this.isMimeScheme == false) goto L19;
        int index = startIndex;
    L11:
        if (index >= endIndex) goto L25;
        int symbol = source[index] & 255;
        int symbolBits = Base64Kt.access$getBase64DecodeMap$p()[symbol];
        if (symbolBits >= 0) goto L18;
        if (symbolBits == (-2)) goto L16;
        symbols = symbols - 1;
        goto L18
    L16:
        symbols = symbols - (endIndex - index);
    L18:
        index = index + 1;
    L25:
        return (int) ((((long) symbols) * 6) / 8);
    L19:
        int index2 = endIndex - 1;
        if (source[index2] != 61) goto L25;
        symbols = symbols - 1;
        if (source[endIndex - 2] != 61) goto L25;
        symbols = symbols - 1;
        goto L25
    L27:
        throw new IllegalArgumentException("Input should have at least 2 symbols for Base64 decoding, startIndex: " + startIndex + ", endIndex: " + endIndex);
    }

    public final byte[] charsToBytesImpl$kotlin_stdlib(CharSequence source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        checkSourceBounds$kotlin_stdlib(source.length(), startIndex, endIndex);
        byte[] byteArray = new byte[endIndex - startIndex];
        int length = 0;
        int index = startIndex;
    L3:
        if (index >= endIndex) goto L9;
        int symbol = source.charAt(index);
        if (symbol > 255) goto L7;
        int length2 = length + 1;
        byteArray[length] = (byte) symbol;
    L8:
        length = length2;
        index = index + 1;
        goto L3
    L7:
        length2 = length + 1;
        byteArray[length] = 63;
        goto L8
    L9:
        return byteArray;
    }

    public final String bytesToStringImpl$kotlin_stdlib(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        StringBuilder stringBuilder = new StringBuilder(source.length);
        int r1 = source.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L6;
        stringBuilder.append((char) source[r2]);
        r2 = r2 + 1;
        goto L3
    L6:
        return stringBuilder.toString();
    }

    private final int handlePaddingSymbol(byte[] source, int padIndex, int endIndex, int byteStart) {
        switch(byteStart) {
            case -8: goto L16;
            case -7: goto L4;
            case -6: goto L13;
            case -5: goto L4;
            case -4: goto L6;
            case -3: goto L4;
            case -2: goto L17;
            default: goto L4;
        };
    L6:
        checkPaddingIsAllowed(padIndex);
        int secondPadIndex = skipIllegalSymbolsIfMime(source, padIndex + 1, endIndex);
        if (secondPadIndex == endIndex) goto L12;
        if (source[secondPadIndex] != 61) goto L12;
        return secondPadIndex + 1;
    L12:
        throw new IllegalArgumentException("Missing one pad character at index " + secondPadIndex);
    L13:
        checkPaddingIsAllowed(padIndex);
        return padIndex + 1;
    L4:
        throw new IllegalStateException("Unreachable".toString());
    L17:
        return padIndex + 1;
    L16:
        throw new IllegalArgumentException("Redundant pad character at index " + padIndex);
    }

    private final void checkPaddingIsAllowed(int padIndex) {
        if (this.paddingOption == PaddingOption.ABSENT) goto L6;
        return;
    L6:
        throw new IllegalArgumentException("The padding option is set to ABSENT, but the input has a pad character at index " + padIndex);
    }

    private final int skipIllegalSymbolsIfMime(byte[] source, int startIndex, int endIndex) {
        if (this.isMimeScheme == true) goto L5;
        return startIndex;
    L5:
        int sourceIndex = startIndex;
    L6:
        if (sourceIndex >= endIndex) goto L11;
        int symbol = source[sourceIndex] & 255;
        if (Base64Kt.access$getBase64DecodeMap$p()[symbol] != (-1)) goto L9;
        sourceIndex = sourceIndex + 1;
        goto L6
    L9:
        return sourceIndex;
    L11:
        return sourceIndex;
    }

    public final void checkSourceBounds$kotlin_stdlib(int sourceSize, int startIndex, int endIndex) {
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, sourceSize);
    }

    private final void checkDestinationBounds(int destinationSize, int destinationOffset, int capacityNeeded) {
        if (destinationOffset < 0) goto L12;
        if (destinationOffset > destinationSize) goto L12;
        int destinationEndIndex = destinationOffset + capacityNeeded;
        if (destinationEndIndex < 0) goto L10;
        if (destinationEndIndex > destinationSize) goto L10;
        return;
    L10:
        throw new IndexOutOfBoundsException("The destination array does not have enough capacity, destination offset: " + destinationOffset + ", destination size: " + destinationSize + ", capacity needed: " + capacityNeeded);
    L12:
        throw new IndexOutOfBoundsException("destination offset: " + destinationOffset + ", destination size: " + destinationSize);
    }

    static {
        Default = new Default(null);
        mimeLineSeparatorSymbols = new byte[]{13, 10};
        UrlSafe = new Base64(true, false, -1, PaddingOption.PRESENT);
        Mime = new Base64(false, true, lineLengthMime, PaddingOption.PRESENT);
        Pem = new Base64(false, true, 64, PaddingOption.PRESENT);
    }
}
