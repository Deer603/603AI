package kotlin.text;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: StringsJVM.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0019\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0081\b\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0001H\u0081\b\u001a\u001d\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0081\b\u001a\u001d\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0001H\u0081\b\u001a \u0010\b\u001a\u00020\t*\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a$\u0010\f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a$\u0010\f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a$\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a$\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a\r\u0010\u0012\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010\u0013\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010\u0014\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010\u0015\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\f\u0010\u0016\u001a\u00020\u0002*\u00020\u0017H\u0007\u001a \u0010\u0016\u001a\u00020\u0002*\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u0001H\u0007\u001a \u0010\u001a\u001a\u00020\u0017*\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u0001H\u0007\u001a\f\u0010\u001b\u001a\u00020\u0002*\u00020\u001cH\u0007\u001a*\u0010\u001b\u001a\u00020\u0002*\u00020\u001c2\b\b\u0002\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\tH\u0007\u001a\f\u0010\u001e\u001a\u00020\u001c*\u00020\u0002H\u0007\u001a*\u0010\u001e\u001a\u00020\u001c*\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\tH\u0007\u001a\r\u0010\u001a\u001a\u00020\u0017*\u00020\u0002H\u0087\b\u001a3\u0010\u001a\u001a\u00020\u0017*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00172\b\b\u0002\u0010 \u001a\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u0001H\u0087\b\u001a*\u0010!\u001a\u00020\u0002*\u00020\u00022\u0016\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010$0#\"\u0004\u0018\u00010$H\u0087\b¢\u0006\u0002\u0010%\u001a2\u0010!\u001a\u00020\u0002*\u00020&2\u0006\u0010!\u001a\u00020\u00022\u0016\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010$0#\"\u0004\u0018\u00010$H\u0087\b¢\u0006\u0002\u0010'\u001a4\u0010!\u001a\u00020\u0002*\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010)2\u0016\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010$0#\"\u0004\u0018\u00010$H\u0087\b¢\u0006\u0002\u0010*\u001a<\u0010!\u001a\u00020\u0002*\u00020&2\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010!\u001a\u00020\u00022\u0016\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010$0#\"\u0004\u0018\u00010$H\u0087\b¢\u0006\u0002\u0010+\u001a\"\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020-*\u00020.2\u0006\u0010/\u001a\u0002002\b\b\u0002\u00101\u001a\u00020\u0001\u001a\u0015\u00102\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0001H\u0087\b\u001a\u001d\u00102\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\b\u001a\u001c\u00103\u001a\u00020\t*\u00020\u00022\u0006\u00104\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a$\u00103\u001a\u00020\t*\u00020\u00022\u0006\u00104\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a\u001c\u00105\u001a\u00020\t*\u00020\u00022\u0006\u00106\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a)\u00107\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u001c2\u0006\u00109\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u00012\u0006\u0010;\u001a\u00020<H\u0087\b\u001a\u0019\u00107\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020<H\u0087\b\u001a!\u00107\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u001c2\u0006\u00109\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00107\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u001cH\u0087\b\u001a\u0011\u00107\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u0017H\u0087\b\u001a!\u00107\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00172\u0006\u00109\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u0001H\u0087\b\u001a!\u00107\u001a\u00020\u00022\u0006\u0010>\u001a\u00020?2\u0006\u00109\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00107\u001a\u00020\u00022\u0006\u0010@\u001a\u00020AH\u0087\b\u001a\u0011\u00107\u001a\u00020\u00022\u0006\u0010B\u001a\u00020CH\u0087\b\u001a\u0015\u0010D\u001a\u00020\u0001*\u00020\u00022\u0006\u0010E\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010F\u001a\u00020\u0001*\u00020\u00022\u0006\u0010E\u001a\u00020\u0001H\u0087\b\u001a\u001d\u0010G\u001a\u00020\u0001*\u00020\u00022\u0006\u0010H\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\b\u001a\u001c\u0010I\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a\u0015\u0010J\u001a\u00020\t*\u00020\u00022\u0006\u0010K\u001a\u00020.H\u0087\b\u001a\u0015\u0010J\u001a\u00020\t*\u00020\u00022\u0006\u0010B\u001a\u00020AH\u0087\b\u001a\u0019\u0010J\u001a\u00020\t*\u0004\u0018\u00010.2\b\u0010\n\u001a\u0004\u0018\u00010.H\u0087\u0004\u001a \u0010J\u001a\u00020\t*\u0004\u0018\u00010.2\b\u0010\n\u001a\u0004\u0018\u00010.2\u0006\u0010\u000b\u001a\u00020\tH\u0007\u001a\r\u0010L\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u001d\u0010M\u001a\u00020\u0001*\u00020\u00022\u0006\u0010E\u001a\u00020\u00012\u0006\u0010N\u001a\u00020\u0001H\u0087\b\u001a4\u0010O\u001a\u00020\t*\u00020.2\u0006\u0010P\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020.2\u0006\u0010Q\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a4\u0010O\u001a\u00020\t*\u00020\u00022\u0006\u0010P\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010Q\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a\u0015\u0010\u0014\u001a\u00020\u0002*\u00020\u00022\u0006\u0010(\u001a\u00020)H\u0087\b\u001a\u0015\u0010\u0015\u001a\u00020\u0002*\u00020\u00022\u0006\u0010(\u001a\u00020)H\u0087\b\u001a\u0015\u0010\u0012\u001a\u00020\u0002*\u00020\u00022\u0006\u0010(\u001a\u00020)H\u0087\b\u001a\u0015\u0010\u0013\u001a\u00020\u0002*\u00020\u00022\u0006\u0010(\u001a\u00020)H\u0087\b\u001a\u0017\u0010R\u001a\u00020\u001c*\u00020\u00022\b\b\u0002\u0010;\u001a\u00020<H\u0087\b\u001a\u0017\u0010S\u001a\u000200*\u00020\u00022\b\b\u0002\u0010T\u001a\u00020\u0001H\u0087\b\u001a\f\u0010U\u001a\u00020\u0002*\u00020\u0002H\u0007\u001a\u0014\u0010U\u001a\u00020\u0002*\u00020\u00022\u0006\u0010(\u001a\u00020)H\u0007\u001a\f\u0010V\u001a\u00020\u0002*\u00020\u0002H\u0007\u001a\u0014\u0010V\u001a\u00020\u0002*\u00020\u00022\u0006\u0010(\u001a\u00020)H\u0007\u001a\u0012\u0010W\u001a\u00020\u0002*\u00020.2\u0006\u0010X\u001a\u00020\u0001\"%\u0010Y\u001a\u0012\u0012\u0004\u0012\u00020\u00020Zj\b\u0012\u0004\u0012\u00020\u0002`[*\u00020&8F¢\u0006\u0006\u001a\u0004\b\\\u0010]¨\u0006^"}, d2 = {"nativeIndexOf", "", "", "ch", "", "fromIndex", "str", "nativeLastIndexOf", "equals", "", "other", "ignoreCase", "replace", "oldChar", "newChar", "oldValue", "newValue", "replaceFirst", "toUpperCase", "uppercase", "toLowerCase", "lowercase", "concatToString", "", "startIndex", "endIndex", "toCharArray", "decodeToString", "", "throwOnInvalidSequence", "encodeToByteArray", "destination", "destinationOffset", "format", "args", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lkotlin/String$Companion;", "(Lkotlin/jvm/internal/StringCompanionObject;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "locale", "Ljava/util/Locale;", "(Ljava/lang/String;Ljava/util/Locale;[Ljava/lang/Object;)Ljava/lang/String;", "(Lkotlin/jvm/internal/StringCompanionObject;Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "split", "", "", "regex", "Ljava/util/regex/Pattern;", "limit", "substring", "startsWith", "prefix", "endsWith", "suffix", "String", "bytes", "offset", "length", "charset", "Ljava/nio/charset/Charset;", "chars", "codePoints", "", "stringBuffer", "Ljava/lang/StringBuffer;", "stringBuilder", "Ljava/lang/StringBuilder;", "codePointAt", "index", "codePointBefore", "codePointCount", "beginIndex", "compareTo", "contentEquals", "charSequence", "intern", "offsetByCodePoints", "codePointOffset", "regionMatches", "thisOffset", "otherOffset", "toByteArray", "toPattern", "flags", "capitalize", "decapitalize", "repeat", "n", "CASE_INSENSITIVE_ORDER", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "getCASE_INSENSITIVE_ORDER", "(Lkotlin/jvm/internal/StringCompanionObject;)Ljava/util/Comparator;", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/text/StringsKt")
class StringsKt__StringsJVMKt extends StringsKt__StringNumberConversionsKt {
    public StringsKt__StringsJVMKt() {
    }

    private static final int nativeIndexOf(String $this$nativeIndexOf, char ch, int fromIndex) {
        Intrinsics.checkNotNullParameter($this$nativeIndexOf, "<this>");
        return $this$nativeIndexOf.indexOf(ch, fromIndex);
    }

    private static final int nativeIndexOf(String $this$nativeIndexOf, String str, int fromIndex) {
        Intrinsics.checkNotNullParameter($this$nativeIndexOf, "<this>");
        Intrinsics.checkNotNullParameter(str, "str");
        return $this$nativeIndexOf.indexOf(str, fromIndex);
    }

    private static final int nativeLastIndexOf(String $this$nativeLastIndexOf, char ch, int fromIndex) {
        Intrinsics.checkNotNullParameter($this$nativeLastIndexOf, "<this>");
        return $this$nativeLastIndexOf.lastIndexOf(ch, fromIndex);
    }

    private static final int nativeLastIndexOf(String $this$nativeLastIndexOf, String str, int fromIndex) {
        Intrinsics.checkNotNullParameter($this$nativeLastIndexOf, "<this>");
        Intrinsics.checkNotNullParameter(str, "str");
        return $this$nativeLastIndexOf.lastIndexOf(str, fromIndex);
    }

    public static /* synthetic */ boolean equals$default(String r0, String r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = false;
    L6:
        return StringsKt.equals(r0, r1, r2);
    }

    public static final boolean equals(String $this$equals, String other, boolean ignoreCase) {
        if ($this$equals != null) goto L7;
        if (other != null) goto L5;
        return true;
    L5:
        return false;
    L7:
        if (ignoreCase == true) goto L10;
        return $this$equals.equals(other);
    L10:
        return $this$equals.equalsIgnoreCase(other);
    }

    public static /* synthetic */ String replace$default(String r0, char r1, char r2, boolean r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L6;
        r3 = false;
    L6:
        return StringsKt.replace(r0, r1, r2, r3);
    }

    public static final String replace(String $this$replace, char oldChar, char newChar, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$replace, "<this>");
        if (ignoreCase == true) goto L6;
        String r0 = $this$replace.replace(oldChar, newChar);
        Intrinsics.checkNotNullExpressionValue(r0, "replace(...)");
        return r0;
    L6:
        StringBuilder $this$replace_u24lambda_u241 = new StringBuilder($this$replace.length());
        String $this$forEach$iv = $this$replace;
        int r5 = 0;
    L8:
        if (r5 >= $this$forEach$iv.length()) goto L15;
        char element$iv = $this$forEach$iv.charAt(r5);
        if (CharsKt.equals(element$iv, oldChar, ignoreCase) == false) goto L12;
        char r9 = newChar;
    L13:
        $this$replace_u24lambda_u241.append(r9);
        r5 = r5 + 1;
        goto L8
    L12:
        r9 = element$iv;
        goto L13
    L15:
        return $this$replace_u24lambda_u241.toString();
    }

    public static /* synthetic */ String replace$default(String r0, String r1, String r2, boolean r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L6;
        r3 = false;
    L6:
        return StringsKt.replace(r0, r1, r2, r3);
    }

    public static final String replace(String $this$replace, String oldValue, String newValue, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$replace, "<this>");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int occurrenceIndex = StringsKt.indexOf($this$replace, oldValue, 0, ignoreCase);
        if (occurrenceIndex >= 0) goto L5;
        return $this$replace;
    L5:
        int oldValueLength = oldValue.length();
        int searchStep = RangesKt.coerceAtLeast(oldValueLength, 1);
        int newLengthHint = ($this$replace.length() - oldValueLength) + newValue.length();
        if (newLengthHint < 0) goto L15;
        StringBuilder stringBuilder = new StringBuilder(newLengthHint);
        int i = 0;
    L8:
        stringBuilder.append($this$replace, i, occurrenceIndex).append(newValue);
        i = occurrenceIndex + oldValueLength;
        if (occurrenceIndex >= $this$replace.length()) goto L12;
        occurrenceIndex = StringsKt.indexOf($this$replace, oldValue, occurrenceIndex + searchStep, ignoreCase);
        if (occurrenceIndex > 0) goto L8;
    L12:
        String r8 = stringBuilder.append($this$replace, i, $this$replace.length()).toString();
        Intrinsics.checkNotNullExpressionValue(r8, "toString(...)");
        return r8;
    L15:
        throw new OutOfMemoryError();
    }

    public static /* synthetic */ String replaceFirst$default(String r0, char r1, char r2, boolean r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L6;
        r3 = false;
    L6:
        return StringsKt.replaceFirst(r0, r1, r2, r3);
    }

    public static final String replaceFirst(String $this$replaceFirst, char oldChar, char newChar, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$replaceFirst, "<this>");
        int index = StringsKt.indexOf$default($this$replaceFirst, oldChar, 0, ignoreCase, 2, null);
        if (index < 0) goto L7;
        String r1 = $this$replaceFirst;
        return StringsKt.replaceRange(r1, index, index + 1, String.valueOf(newChar)).toString();
    L7:
        return $this$replaceFirst;
    }

    public static /* synthetic */ String replaceFirst$default(String r0, String r1, String r2, boolean r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L6;
        r3 = false;
    L6:
        return StringsKt.replaceFirst(r0, r1, r2, r3);
    }

    public static final String replaceFirst(String $this$replaceFirst, String oldValue, String newValue, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$replaceFirst, "<this>");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int index = StringsKt.indexOf$default($this$replaceFirst, oldValue, 0, ignoreCase, 2, null);
        if (index < 0) goto L7;
        String r0 = $this$replaceFirst;
        return StringsKt.replaceRange(r0, index, oldValue.length() + index, newValue).toString();
    L7:
        return $this$replaceFirst;
    }

    @Deprecated(message = "Use uppercase() instead.", replaceWith = @ReplaceWith(expression = "uppercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.5")
    private static final String toUpperCase(String $this$toUpperCase) {
        Intrinsics.checkNotNullParameter($this$toUpperCase, "<this>");
        String r0 = $this$toUpperCase.toUpperCase();
        Intrinsics.checkNotNullExpressionValue(r0, "toUpperCase(...)");
        return r0;
    }

    private static final String uppercase(String $this$uppercase) {
        Intrinsics.checkNotNullParameter($this$uppercase, "<this>");
        String r0 = $this$uppercase.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(r0, "toUpperCase(...)");
        return r0;
    }

    @Deprecated(message = "Use lowercase() instead.", replaceWith = @ReplaceWith(expression = "lowercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.5")
    private static final String toLowerCase(String $this$toLowerCase) {
        Intrinsics.checkNotNullParameter($this$toLowerCase, "<this>");
        String r0 = $this$toLowerCase.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(r0, "toLowerCase(...)");
        return r0;
    }

    private static final String lowercase(String $this$lowercase) {
        Intrinsics.checkNotNullParameter($this$lowercase, "<this>");
        String r0 = $this$lowercase.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(r0, "toLowerCase(...)");
        return r0;
    }

    public static final String concatToString(char[] $this$concatToString) {
        Intrinsics.checkNotNullParameter($this$concatToString, "<this>");
        return new String($this$concatToString);
    }

    public static /* synthetic */ String concatToString$default(char[] r0, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.length;
    L9:
        return StringsKt.concatToString(r0, r1, r2);
    }

    public static final String concatToString(char[] $this$concatToString, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter($this$concatToString, "<this>");
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, $this$concatToString.length);
        return new String($this$concatToString, startIndex, endIndex - startIndex);
    }

    public static /* synthetic */ char[] toCharArray$default(String r0, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.length();
    L9:
        return StringsKt.toCharArray(r0, r1, r2);
    }

    public static final char[] toCharArray(String $this$toCharArray, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter($this$toCharArray, "<this>");
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, $this$toCharArray.length());
        char[] r0 = new char[endIndex - startIndex];
        $this$toCharArray.getChars(startIndex, endIndex, r0, 0);
        return r0;
    }

    public static final String decodeToString(byte[] $this$decodeToString) {
        Intrinsics.checkNotNullParameter($this$decodeToString, "<this>");
        return new String($this$decodeToString, Charsets.UTF_8);
    }

    public static /* synthetic */ String decodeToString$default(byte[] r1, int r2, int r3, boolean r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = r1.length;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r4 = false;
    L12:
        return StringsKt.decodeToString(r1, r2, r3, r4);
    }

    public static final String decodeToString(byte[] $this$decodeToString, int startIndex, int endIndex, boolean throwOnInvalidSequence) {
        Intrinsics.checkNotNullParameter($this$decodeToString, "<this>");
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, $this$decodeToString.length);
        if (throwOnInvalidSequence == false) goto L5;
        CharsetDecoder decoder = Charsets.UTF_8.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT);
        String r1 = decoder.decode(ByteBuffer.wrap($this$decodeToString, startIndex, endIndex - startIndex)).toString();
        Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        return r1;
    L5:
        return new String($this$decodeToString, startIndex, endIndex - startIndex, Charsets.UTF_8);
    }

    public static final byte[] encodeToByteArray(String $this$encodeToByteArray) {
        Intrinsics.checkNotNullParameter($this$encodeToByteArray, "<this>");
        byte[] r0 = $this$encodeToByteArray.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(r0, "getBytes(...)");
        return r0;
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(String r1, int r2, int r3, boolean r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = r1.length();
    L9:
        if ((r5 & 4) == 0) goto L12;
        r4 = false;
    L12:
        return StringsKt.encodeToByteArray(r1, r2, r3, r4);
    }

    public static final byte[] encodeToByteArray(String $this$encodeToByteArray, int startIndex, int endIndex, boolean throwOnInvalidSequence) {
        Intrinsics.checkNotNullParameter($this$encodeToByteArray, "<this>");
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, $this$encodeToByteArray.length());
        if (throwOnInvalidSequence == true) goto L6;
        String r0 = $this$encodeToByteArray.substring(startIndex, endIndex);
        Intrinsics.checkNotNullExpressionValue(r0, "substring(...)");
        Charset r1 = Charsets.UTF_8;
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type java.lang.String");
        byte[] r2 = r0.getBytes(r1);
        Intrinsics.checkNotNullExpressionValue(r2, "getBytes(...)");
        return r2;
    L6:
        CharsetEncoder encoder = Charsets.UTF_8.newEncoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT);
        ByteBuffer byteBuffer = encoder.encode(CharBuffer.wrap($this$encodeToByteArray, startIndex, endIndex));
        if (byteBuffer.hasArray() == true) goto L9;
    L13:
        byte[] it = new byte[byteBuffer.remaining()];
        byteBuffer.get(it);
        return it;
    L9:
        if (byteBuffer.arrayOffset() != 0) goto L13;
        int r3 = byteBuffer.remaining();
        byte[] r4 = byteBuffer.array();
        Intrinsics.checkNotNull(r4);
        if (r3 != r4.length) goto L13;
        byte[] r5 = byteBuffer.array();
        Intrinsics.checkNotNull(r5);
        return r5;
    }

    private static final char[] toCharArray(String $this$toCharArray) {
        Intrinsics.checkNotNullParameter($this$toCharArray, "<this>");
        char[] r0 = $this$toCharArray.toCharArray();
        Intrinsics.checkNotNullExpressionValue(r0, "toCharArray(...)");
        return r0;
    }

    static /* synthetic */ char[] toCharArray$default(String $this$toCharArray_u24default, char[] destination, int destinationOffset, int startIndex, int endIndex, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        destinationOffset = 0;
    L6:
        if ((r5 & 4) == 0) goto L9;
        startIndex = 0;
    L9:
        if ((r5 & 8) == 0) goto L11;
        endIndex = $this$toCharArray_u24default.length();
    L11:
        Intrinsics.checkNotNullParameter($this$toCharArray_u24default, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        $this$toCharArray_u24default.getChars(startIndex, endIndex, destination, destinationOffset);
        return destination;
    }

    private static final char[] toCharArray(String $this$toCharArray, char[] destination, int destinationOffset, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter($this$toCharArray, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        $this$toCharArray.getChars(startIndex, endIndex, destination, destinationOffset);
        return destination;
    }

    private static final String format(String $this$format, Object... args) {
        Intrinsics.checkNotNullParameter($this$format, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        String r0 = String.format($this$format, Arrays.copyOf(args, args.length));
        Intrinsics.checkNotNullExpressionValue(r0, "format(...)");
        return r0;
    }

    private static final String format(StringCompanionObject $this$format, String format, Object... args) {
        Intrinsics.checkNotNullParameter($this$format, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        String r0 = String.format(format, Arrays.copyOf(args, args.length));
        Intrinsics.checkNotNullExpressionValue(r0, "format(...)");
        return r0;
    }

    private static final String format(String $this$format, Locale locale, Object... args) {
        Intrinsics.checkNotNullParameter($this$format, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        String r0 = String.format(locale, $this$format, Arrays.copyOf(args, args.length));
        Intrinsics.checkNotNullExpressionValue(r0, "format(...)");
        return r0;
    }

    private static final String format(StringCompanionObject $this$format, Locale locale, String format, Object... args) {
        Intrinsics.checkNotNullParameter($this$format, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        String r0 = String.format(locale, format, Arrays.copyOf(args, args.length));
        Intrinsics.checkNotNullExpressionValue(r0, "format(...)");
        return r0;
    }

    public static /* synthetic */ List split$default(CharSequence r0, Pattern r1, int r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = 0;
    L6:
        return StringsKt.split(r0, r1, r2);
    }

    public static final List<String> split(CharSequence $this$split, Pattern regex, int limit) {
        Intrinsics.checkNotNullParameter($this$split, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        StringsKt.requireNonNegativeLimit(limit);
        if (limit != 0) goto L5;
        int r0 = -1;
    L6:
        String[] r1 = regex.split($this$split, r0);
        Intrinsics.checkNotNullExpressionValue(r1, "split(...)");
        return ArraysKt.asList(r1);
    L5:
        r0 = limit;
        goto L6
    }

    private static final String substring(String $this$substring, int startIndex) {
        Intrinsics.checkNotNullParameter($this$substring, "<this>");
        String r0 = $this$substring.substring(startIndex);
        Intrinsics.checkNotNullExpressionValue(r0, "substring(...)");
        return r0;
    }

    private static final String substring(String $this$substring, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter($this$substring, "<this>");
        String r0 = $this$substring.substring(startIndex, endIndex);
        Intrinsics.checkNotNullExpressionValue(r0, "substring(...)");
        return r0;
    }

    public static /* synthetic */ boolean startsWith$default(String r0, String r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = false;
    L6:
        return StringsKt.startsWith(r0, r1, r2);
    }

    public static final boolean startsWith(String $this$startsWith, String prefix, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$startsWith, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (ignoreCase == true) goto L7;
        return $this$startsWith.startsWith(prefix);
    L7:
        return StringsKt.regionMatches($this$startsWith, 0, prefix, 0, prefix.length(), ignoreCase);
    }

    public static /* synthetic */ boolean startsWith$default(String r0, String r1, int r2, boolean r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L6;
        r3 = false;
    L6:
        return StringsKt.startsWith(r0, r1, r2, r3);
    }

    public static final boolean startsWith(String $this$startsWith, String prefix, int startIndex, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$startsWith, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (ignoreCase == true) goto L7;
        return $this$startsWith.startsWith(prefix, startIndex);
    L7:
        return StringsKt.regionMatches($this$startsWith, startIndex, prefix, 0, prefix.length(), ignoreCase);
    }

    public static /* synthetic */ boolean endsWith$default(String r0, String r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = false;
    L6:
        return StringsKt.endsWith(r0, r1, r2);
    }

    public static final boolean endsWith(String $this$endsWith, String suffix, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$endsWith, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (ignoreCase == true) goto L7;
        return $this$endsWith.endsWith(suffix);
    L7:
        return StringsKt.regionMatches($this$endsWith, $this$endsWith.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    private static final String String(byte[] bytes, int offset, int length, Charset charset) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(bytes, offset, length, charset);
    }

    private static final String String(byte[] bytes, Charset charset) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(bytes, charset);
    }

    private static final String String(byte[] bytes, int offset, int length) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return new String(bytes, offset, length, Charsets.UTF_8);
    }

    private static final String String(byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return new String(bytes, Charsets.UTF_8);
    }

    private static final String String(char[] chars) {
        Intrinsics.checkNotNullParameter(chars, "chars");
        return new String(chars);
    }

    private static final String String(char[] chars, int offset, int length) {
        Intrinsics.checkNotNullParameter(chars, "chars");
        return new String(chars, offset, length);
    }

    private static final String String(int[] codePoints, int offset, int length) {
        Intrinsics.checkNotNullParameter(codePoints, "codePoints");
        return new String(codePoints, offset, length);
    }

    private static final String String(StringBuffer stringBuffer) {
        Intrinsics.checkNotNullParameter(stringBuffer, "stringBuffer");
        return new String(stringBuffer);
    }

    private static final String String(StringBuilder stringBuilder) {
        Intrinsics.checkNotNullParameter(stringBuilder, "stringBuilder");
        return new String(stringBuilder);
    }

    private static final int codePointAt(String $this$codePointAt, int index) {
        Intrinsics.checkNotNullParameter($this$codePointAt, "<this>");
        return $this$codePointAt.codePointAt(index);
    }

    private static final int codePointBefore(String $this$codePointBefore, int index) {
        Intrinsics.checkNotNullParameter($this$codePointBefore, "<this>");
        return $this$codePointBefore.codePointBefore(index);
    }

    private static final int codePointCount(String $this$codePointCount, int beginIndex, int endIndex) {
        Intrinsics.checkNotNullParameter($this$codePointCount, "<this>");
        return $this$codePointCount.codePointCount(beginIndex, endIndex);
    }

    public static /* synthetic */ int compareTo$default(String r0, String r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = false;
    L6:
        return StringsKt.compareTo(r0, r1, r2);
    }

    public static final int compareTo(String $this$compareTo, String other, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$compareTo, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (ignoreCase == false) goto L7;
        return $this$compareTo.compareToIgnoreCase(other);
    L7:
        return $this$compareTo.compareTo(other);
    }

    private static final boolean contentEquals(String $this$contentEquals, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter($this$contentEquals, "<this>");
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        return $this$contentEquals.contentEquals(charSequence);
    }

    private static final boolean contentEquals(String $this$contentEquals, StringBuffer stringBuilder) {
        Intrinsics.checkNotNullParameter($this$contentEquals, "<this>");
        Intrinsics.checkNotNullParameter(stringBuilder, "stringBuilder");
        return $this$contentEquals.contentEquals(stringBuilder);
    }

    public static final boolean contentEquals(CharSequence $this$contentEquals, CharSequence other) {
        if (($this$contentEquals instanceof String) == false) goto L7;
        if (other == null) goto L7;
        return ((String) $this$contentEquals).contentEquals(other);
    L7:
        return StringsKt.contentEqualsImpl($this$contentEquals, other);
    }

    public static final boolean contentEquals(CharSequence $this$contentEquals, CharSequence other, boolean ignoreCase) {
        if (ignoreCase == false) goto L5;
        return StringsKt.contentEqualsIgnoreCaseImpl($this$contentEquals, other);
    L5:
        return StringsKt.contentEquals($this$contentEquals, other);
    }

    private static final String intern(String $this$intern) {
        Intrinsics.checkNotNullParameter($this$intern, "<this>");
        String r0 = $this$intern.intern();
        Intrinsics.checkNotNullExpressionValue(r0, "intern(...)");
        return r0;
    }

    private static final int offsetByCodePoints(String $this$offsetByCodePoints, int index, int codePointOffset) {
        Intrinsics.checkNotNullParameter($this$offsetByCodePoints, "<this>");
        return $this$offsetByCodePoints.offsetByCodePoints(index, codePointOffset);
    }

    public static /* synthetic */ boolean regionMatches$default(CharSequence r6, int r7, CharSequence r8, int r9, int r10, boolean r11, int r12, Object r13) {
        if ((r12 & 16) == 0) goto L5;
        boolean r5 = false;
    L7:
        return StringsKt.regionMatches(r6, r7, r8, r9, r10, r5);
    L5:
        r5 = r11;
        goto L7
    }

    public static final boolean regionMatches(CharSequence $this$regionMatches, int thisOffset, CharSequence other, int otherOffset, int length, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$regionMatches, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (($this$regionMatches instanceof String) == false) goto L9;
        if ((other instanceof String) == false) goto L9;
        return StringsKt.regionMatches((String) $this$regionMatches, thisOffset, (String) other, otherOffset, length, ignoreCase);
    L9:
        return StringsKt.regionMatchesImpl($this$regionMatches, thisOffset, other, otherOffset, length, ignoreCase);
    }

    public static /* synthetic */ boolean regionMatches$default(String r6, int r7, String r8, int r9, int r10, boolean r11, int r12, Object r13) {
        if ((r12 & 16) == 0) goto L5;
        boolean r5 = false;
    L7:
        return StringsKt.regionMatches(r6, r7, r8, r9, r10, r5);
    L5:
        r5 = r11;
        goto L7
    }

    public static final boolean regionMatches(String $this$regionMatches, int thisOffset, String other, int otherOffset, int length, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$regionMatches, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (ignoreCase == true) goto L6;
        return $this$regionMatches.regionMatches(thisOffset, other, otherOffset, length);
    L6:
        return $this$regionMatches.regionMatches(ignoreCase, thisOffset, other, otherOffset, length);
    }

    @Deprecated(message = "Use lowercase() instead.", replaceWith = @ReplaceWith(expression = "lowercase(locale)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.5")
    private static final String toLowerCase(String $this$toLowerCase, Locale locale) {
        Intrinsics.checkNotNullParameter($this$toLowerCase, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String r0 = $this$toLowerCase.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(r0, "toLowerCase(...)");
        return r0;
    }

    private static final String lowercase(String $this$lowercase, Locale locale) {
        Intrinsics.checkNotNullParameter($this$lowercase, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String r0 = $this$lowercase.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(r0, "toLowerCase(...)");
        return r0;
    }

    @Deprecated(message = "Use uppercase() instead.", replaceWith = @ReplaceWith(expression = "uppercase(locale)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.5")
    private static final String toUpperCase(String $this$toUpperCase, Locale locale) {
        Intrinsics.checkNotNullParameter($this$toUpperCase, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String r0 = $this$toUpperCase.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(r0, "toUpperCase(...)");
        return r0;
    }

    private static final String uppercase(String $this$uppercase, Locale locale) {
        Intrinsics.checkNotNullParameter($this$uppercase, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String r0 = $this$uppercase.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(r0, "toUpperCase(...)");
        return r0;
    }

    static /* synthetic */ byte[] toByteArray$default(String $this$toByteArray_u24default, Charset charset, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        charset = Charsets.UTF_8;
    L5:
        Intrinsics.checkNotNullParameter($this$toByteArray_u24default, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] r4 = $this$toByteArray_u24default.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(r4, "getBytes(...)");
        return r4;
    }

    private static final byte[] toByteArray(String $this$toByteArray, Charset charset) {
        Intrinsics.checkNotNullParameter($this$toByteArray, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] r0 = $this$toByteArray.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(r0, "getBytes(...)");
        return r0;
    }

    static /* synthetic */ Pattern toPattern$default(String $this$toPattern_u24default, int flags, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        flags = 0;
    L5:
        Intrinsics.checkNotNullParameter($this$toPattern_u24default, "<this>");
        Pattern r4 = Pattern.compile($this$toPattern_u24default, flags);
        Intrinsics.checkNotNullExpressionValue(r4, "compile(...)");
        return r4;
    }

    private static final Pattern toPattern(String $this$toPattern, int flags) {
        Intrinsics.checkNotNullParameter($this$toPattern, "<this>");
        Pattern r0 = Pattern.compile($this$toPattern, flags);
        Intrinsics.checkNotNullExpressionValue(r0, "compile(...)");
        return r0;
    }

    @Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @ReplaceWith(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }", imports = {"java.util.Locale"}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final String capitalize(String $this$capitalize) {
        Intrinsics.checkNotNullParameter($this$capitalize, "<this>");
        Locale r0 = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(r0, "getDefault(...)");
        return StringsKt.capitalize($this$capitalize, r0);
    }

    @Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @ReplaceWith(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final String capitalize(String $this$capitalize, Locale locale) {
        Intrinsics.checkNotNullParameter($this$capitalize, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        if ($this$capitalize.length() <= 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L15;
        char firstChar = $this$capitalize.charAt(0);
        if (Character.isLowerCase(firstChar) == false) goto L15;
        StringBuilder $this$capitalize_u24lambda_u244 = new StringBuilder();
        char titleChar = Character.toTitleCase(firstChar);
        if (titleChar == Character.toUpperCase(firstChar)) goto L12;
        $this$capitalize_u24lambda_u244.append(titleChar);
    L13:
        String r1 = $this$capitalize.substring(1);
        Intrinsics.checkNotNullExpressionValue(r1, "substring(...)");
        $this$capitalize_u24lambda_u244.append(r1);
        return $this$capitalize_u24lambda_u244.toString();
    L12:
        String r2 = $this$capitalize.substring(0, 1);
        Intrinsics.checkNotNullExpressionValue(r2, "substring(...)");
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type java.lang.String");
        String r3 = r2.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(r3, "toUpperCase(...)");
        $this$capitalize_u24lambda_u244.append(r3);
    L15:
        return $this$capitalize;
    L5:
        r0 = false;
        goto L6
    }

    @Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @ReplaceWith(expression = "replaceFirstChar { it.lowercase(Locale.getDefault()) }", imports = {"java.util.Locale"}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final String decapitalize(String $this$decapitalize) {
        Intrinsics.checkNotNullParameter($this$decapitalize, "<this>");
        if ($this$decapitalize.length() <= 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L11;
        if (Character.isLowerCase($this$decapitalize.charAt(0)) == true) goto L11;
        StringBuilder r1 = new StringBuilder();
        String r2 = $this$decapitalize.substring(0, 1);
        Intrinsics.checkNotNullExpressionValue(r2, "substring(...)");
        Locale r4 = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(r4, "getDefault(...)");
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type java.lang.String");
        String r3 = r2.toLowerCase(r4);
        Intrinsics.checkNotNullExpressionValue(r3, "toLowerCase(...)");
        StringBuilder r5 = r1.append(r3);
        String r6 = $this$decapitalize.substring(1);
        Intrinsics.checkNotNullExpressionValue(r6, "substring(...)");
        return r5.append(r6).toString();
    L11:
        return $this$decapitalize;
    L5:
        r0 = false;
        goto L6
    }

    @Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @ReplaceWith(expression = "replaceFirstChar { it.lowercase(locale) }", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final String decapitalize(String $this$decapitalize, Locale locale) {
        Intrinsics.checkNotNullParameter($this$decapitalize, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        if ($this$decapitalize.length() <= 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L11;
        if (Character.isLowerCase($this$decapitalize.charAt(0)) == true) goto L11;
        StringBuilder r1 = new StringBuilder();
        String r2 = $this$decapitalize.substring(0, 1);
        Intrinsics.checkNotNullExpressionValue(r2, "substring(...)");
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type java.lang.String");
        String r3 = r2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(r3, "toLowerCase(...)");
        StringBuilder r4 = r1.append(r3);
        String r5 = $this$decapitalize.substring(1);
        Intrinsics.checkNotNullExpressionValue(r5, "substring(...)");
        return r4.append(r5).toString();
    L11:
        return $this$decapitalize;
    L5:
        r0 = false;
        goto L6
    }

    public static final String repeat(CharSequence $this$repeat, int n) {
        Intrinsics.checkNotNullParameter($this$repeat, "<this>");
        int r0 = 0;
        if (n < 0) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == false) goto L27;
        switch(n) {
            case 0: goto L32;
            case 1: goto L30;
            default: goto L10;
        };
    L32:
        return "";
    L10:
        switch($this$repeat.length()) {
            case 0: goto L33;
            case 1: goto L16;
            default: goto L11;
        };
    L11:
        StringBuilder sb = new StringBuilder($this$repeat.length() * n);
        int i = 1;
        if (1 <= n) goto L21;
    L24:
        String r2 = sb.toString();
        Intrinsics.checkNotNull(r2);
        return r2;
    L21:
        sb.append($this$repeat);
        if (i == n) goto L24;
        i = i + 1;
        goto L21
    L16:
        char r3 = $this$repeat.charAt(0);
        char[] r4 = new char[n];
    L17:
        if (r0 >= n) goto L31;
        r4[r0] = r3;
        r0 = r0 + 1;
        goto L17
    L31:
        return new String(r4);
    L33:
        return "";
    L30:
        return $this$repeat.toString();
    L27:
        throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + n + '.').toString());
    L5:
        r1 = false;
        goto L6
    }

    public static final Comparator<String> getCASE_INSENSITIVE_ORDER(StringCompanionObject $this$CASE_INSENSITIVE_ORDER) {
        Intrinsics.checkNotNullParameter($this$CASE_INSENSITIVE_ORDER, "<this>");
        Comparator<String> r0 = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.checkNotNullExpressionValue(r0, "CASE_INSENSITIVE_ORDER");
        return r0;
    }
}
