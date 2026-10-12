package kotlin.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: Indent.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u001e\u0010\u0003\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0001H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0001\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u0001\u001a\u0011\u0010\t\u001a\u00020\n*\u00020\u0001H\u0002¢\u0006\u0002\b\u000b\u001a!\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\r2\u0006\u0010\b\u001a\u00020\u0001H\u0002¢\u0006\u0002\b\u000e\u001aJ\u0010\u000f\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\r2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rH\u0082\b¢\u0006\u0002\b\u0014¨\u0006\u0015"}, d2 = {"trimMargin", "", "marginPrefix", "replaceIndentByMargin", "newIndent", "trimIndent", "replaceIndent", "prependIndent", "indent", "indentWidth", "", "indentWidth$StringsKt__IndentKt", "getIndentFunction", "Lkotlin/Function1;", "getIndentFunction$StringsKt__IndentKt", "reindent", "", "resultSizeEstimate", "indentAddFunction", "indentCutFunction", "reindent$StringsKt__IndentKt", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/text/StringsKt")
class StringsKt__IndentKt extends StringsKt__AppendableKt {
    public static /* synthetic */ String $r8$lambda$7gQTIx5gKXNh0yIHp2Ioy3cIUtg(String r0) {
        return getIndentFunction$lambda$8$StringsKt__IndentKt(r0);
    }

    public static /* synthetic */ String $r8$lambda$7kLj5wKXQcPzDDXZYqg7FNckCwg(String r0, String r1) {
        return prependIndent$lambda$5$StringsKt__IndentKt(r0, r1);
    }

    /* JADX INFO: renamed from: $r8$lambda$nNic-LEWSJV9XuSiP33DOd1sLF4, reason: not valid java name */
    public static /* synthetic */ String m8727$r8$lambda$nNicLEWSJV9XuSiP33DOd1sLF4(String r0, String r1) {
        return getIndentFunction$lambda$9$StringsKt__IndentKt(r0, r1);
    }

    public StringsKt__IndentKt() {
    }

    public static /* synthetic */ String trimMargin$default(String r0, String r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = "|";
    L6:
        return StringsKt.trimMargin(r0, r1);
    }

    public static final String trimMargin(String $this$trimMargin, String marginPrefix) {
        Intrinsics.checkNotNullParameter($this$trimMargin, "<this>");
        Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
        return StringsKt.replaceIndentByMargin($this$trimMargin, "", marginPrefix);
    }

    public static /* synthetic */ String replaceIndentByMargin$default(String r0, String r1, String r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = "";
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = "|";
    L9:
        return StringsKt.replaceIndentByMargin(r0, r1, r2);
    }

    public static final String replaceIndentByMargin(String $this$replaceIndentByMargin, String newIndent, String marginPrefix) {
        Intrinsics.checkNotNullParameter($this$replaceIndentByMargin, "<this>");
        Intrinsics.checkNotNullParameter(newIndent, "newIndent");
        Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
        if (StringsKt.isBlank(marginPrefix) == true) goto L43;
        List<String> r8 = StringsKt.lines($this$replaceIndentByMargin);
        int resultSizeEstimate$iv = $this$replaceIndentByMargin.length() + (newIndent.length() * r8.size());
        Function1<String, String> r10 = getIndentFunction$StringsKt__IndentKt(newIndent);
        int lastIndex$iv = CollectionsKt.getLastIndex(r8);
        List<String> $this$mapIndexedNotNull$iv$iv = r8;
        Collection destination$iv$iv$iv = new ArrayList();
        int index$iv$iv$iv$iv = 0;
        Iterator r20 = $this$mapIndexedNotNull$iv$iv.iterator();
    L6:
        if (r20.hasNext() == false) goto L41;
        Object item$iv$iv$iv$iv = r20.next();
        int index$iv$iv$iv$iv2 = index$iv$iv$iv$iv + 1;
        if (index$iv$iv$iv$iv >= 0) goto L10;
        CollectionsKt.throwIndexOverflow();
    L10:
        String value$iv = (String) item$iv$iv$iv$iv;
        if (index$iv$iv$iv$iv == 0) goto L14;
        if (index$iv$iv$iv$iv == lastIndex$iv) goto L14;
    L16:
        Collection destination$iv$iv$iv2 = destination$iv$iv$iv;
        String $this$indexOfFirst$iv = value$iv;
        int r0 = $this$indexOfFirst$iv.length();
        int firstNonWhitespaceIndex = 0;
    L18:
        if (firstNonWhitespaceIndex >= r0) goto L23;
        char it = $this$indexOfFirst$iv.charAt(firstNonWhitespaceIndex);
        if (CharsKt.isWhitespace(it) == false) goto L25;
        firstNonWhitespaceIndex = firstNonWhitespaceIndex + 1;
    L25:
        if (firstNonWhitespaceIndex != (-1)) goto L27;
        Collection destination$iv$iv$iv3 = destination$iv$iv$iv2;
        String r2 = null;
    L32:
        if (r2 == null) goto L37;
        String r1 = r10.invoke(r2);
        if (r1 == null) goto L37;
        value$iv = r1;
    L37:
        if (value$iv == null) goto L39;
        destination$iv$iv$iv3.add(value$iv);
    L39:
        destination$iv$iv$iv = destination$iv$iv$iv3;
        index$iv$iv$iv$iv = index$iv$iv$iv$iv2;
        goto L6
    L27:
        destination$iv$iv$iv3 = destination$iv$iv$iv2;
        int index$iv = firstNonWhitespaceIndex;
        if (StringsKt.startsWith$default(value$iv, marginPrefix, index$iv, false, 4, null) == false) goto L30;
        int r3 = marginPrefix.length() + index$iv;
        Intrinsics.checkNotNull(value$iv, "null cannot be cast to non-null type java.lang.String");
        r2 = value$iv.substring(r3);
        Intrinsics.checkNotNullExpressionValue(r2, "substring(...)");
        goto L32
    L30:
        r2 = null;
        goto L32
    L23:
        firstNonWhitespaceIndex = -1;
    L14:
        if (StringsKt.isBlank(value$iv) == false) goto L16;
        destination$iv$iv$iv3 = destination$iv$iv$iv;
        value$iv = null;
        goto L37
    L41:
        return ((StringBuilder) CollectionsKt.joinTo$default((List) destination$iv$iv$iv, new StringBuilder(resultSizeEstimate$iv), "\n", null, null, 0, null, null, 124, null)).toString();
    L43:
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }

    public static final String trimIndent(String $this$trimIndent) {
        Intrinsics.checkNotNullParameter($this$trimIndent, "<this>");
        return StringsKt.replaceIndent($this$trimIndent, "");
    }

    public static /* synthetic */ String replaceIndent$default(String r0, String r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = "";
    L6:
        return StringsKt.replaceIndent(r0, r1);
    }

    public static final String replaceIndent(String $this$replaceIndent, String newIndent) {
        Intrinsics.checkNotNullParameter($this$replaceIndent, "<this>");
        Intrinsics.checkNotNullParameter(newIndent, "newIndent");
        List<String> r1 = StringsKt.lines($this$replaceIndent);
        List<String> $this$filter$iv = r1;
        Collection destination$iv$iv = new ArrayList();
        Iterator r8 = $this$filter$iv.iterator();
    L4:
        if (r8.hasNext() == false) goto L8;
        Object element$iv$iv = r8.next();
        String p0 = (String) element$iv$iv;
        if (StringsKt.isBlank(p0) == true) goto L4;
        destination$iv$iv.add(element$iv$iv);
        goto L4
    L8:
        Iterable $this$map$iv = (List) destination$iv$iv;
        Collection destination$iv$iv2 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        Iterator r9 = $this$map$iv.iterator();
    L10:
        if (r9.hasNext() == false) goto L12;
        Object item$iv$iv = r9.next();
        String p1 = (String) item$iv$iv;
        destination$iv$iv2.add(Integer.valueOf(indentWidth$StringsKt__IndentKt(p1)));
        goto L10
    L12:
        Integer r3 = (Integer) CollectionsKt.minOrNull((List) destination$iv$iv2);
        if (r3 == null) goto L15;
        int minCommonIndent = r3.intValue();
    L16:
        int resultSizeEstimate$iv = $this$replaceIndent.length() + (newIndent.length() * r1.size());
        Function1<String, String> r5 = getIndentFunction$StringsKt__IndentKt(newIndent);
        int lastIndex$iv = CollectionsKt.getLastIndex(r1);
        List<String> $this$mapIndexedNotNull$iv$iv = r1;
        Collection destination$iv$iv$iv = new ArrayList();
        int index$iv$iv$iv$iv = 0;
        Iterator r17 = $this$mapIndexedNotNull$iv$iv.iterator();
    L18:
        if (r17.hasNext() == false) goto L41;
        Object item$iv$iv$iv$iv = r17.next();
        int index$iv$iv$iv$iv2 = index$iv$iv$iv$iv + 1;
        if (index$iv$iv$iv$iv >= 0) goto L22;
        CollectionsKt.throwIndexOverflow();
    L22:
        String value$iv = (String) item$iv$iv$iv$iv;
        int index$iv = index$iv$iv$iv$iv;
        if (index$iv == 0) goto L27;
        int index$iv2 = index$iv;
        if (index$iv2 == lastIndex$iv) goto L29;
    L31:
        String line = StringsKt.drop(value$iv, minCommonIndent);
        if (line == null) goto L37;
        String r0 = r5.invoke(line);
        if (r0 == null) goto L37;
        value$iv = r0;
    L37:
        if (value$iv == null) goto L39;
        destination$iv$iv$iv.add(value$iv);
    L39:
        index$iv$iv$iv$iv = index$iv$iv$iv$iv2;
    L29:
        if (StringsKt.isBlank(value$iv) == false) goto L31;
        value$iv = null;
        goto L37
    L27:
        index$iv2 = index$iv;
        goto L29
    L41:
        return ((StringBuilder) CollectionsKt.joinTo$default((List) destination$iv$iv$iv, new StringBuilder(resultSizeEstimate$iv), "\n", null, null, 0, null, null, 124, null)).toString();
    L15:
        minCommonIndent = 0;
        goto L16
    }

    public static /* synthetic */ String prependIndent$default(String r0, String r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = "    ";
    L6:
        return StringsKt.prependIndent(r0, r1);
    }

    public static final String prependIndent(String $this$prependIndent, final String indent) {
        Intrinsics.checkNotNullParameter($this$prependIndent, "<this>");
        Intrinsics.checkNotNullParameter(indent, "indent");
        return SequencesKt.joinToString$default(SequencesKt.map(StringsKt.lineSequence($this$prependIndent), new StringsKt__IndentKt$$ExternalSyntheticLambda0(indent)), "\n", null, null, 0, null, null, 62, null);
    }

    private static final String prependIndent$lambda$5$StringsKt__IndentKt(String $indent, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (StringsKt.isBlank(it) == false) goto L9;
        if (it.length() >= $indent.length()) goto L11;
        return $indent;
    L11:
        return it;
    L9:
        return $indent + it;
    }

    private static final int indentWidth$StringsKt__IndentKt(String $this$indentWidth) {
        String $this$indexOfFirst$iv = $this$indentWidth;
        int index$iv = 0;
        int r3 = $this$indexOfFirst$iv.length();
    L4:
        if (index$iv >= r3) goto L9;
        char it = $this$indexOfFirst$iv.charAt(index$iv);
        if (CharsKt.isWhitespace(it) == false) goto L11;
        index$iv = index$iv + 1;
    L11:
        if (index$iv != (-1)) goto L16;
        int it2 = $this$indentWidth.length();
        return it2;
    L16:
        return index$iv;
    L9:
        index$iv = -1;
        goto L11
    }

    private static final Function1<String, String> getIndentFunction$StringsKt__IndentKt(final String indent) {
        if (indent.length() != 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L9;
        return new StringsKt__IndentKt$$ExternalSyntheticLambda1();
    L9:
        return new StringsKt__IndentKt$$ExternalSyntheticLambda2(indent);
    L5:
        r0 = false;
        goto L6
    }

    private static final String getIndentFunction$lambda$8$StringsKt__IndentKt(String line) {
        Intrinsics.checkNotNullParameter(line, "line");
        return line;
    }

    private static final String getIndentFunction$lambda$9$StringsKt__IndentKt(String $indent, String line) {
        Intrinsics.checkNotNullParameter(line, "line");
        return $indent + line;
    }

    private static final String reindent$StringsKt__IndentKt(List<String> r20, int resultSizeEstimate, Function1<? super String, String> r22, Function1<? super String, String> r23) {
        int $i$f$reindent = 0;
        int lastIndex = CollectionsKt.getLastIndex(r20);
        List<String> $this$mapIndexedNotNull$iv = r20;
        Collection destination$iv$iv = new ArrayList();
        int index$iv$iv = 0;
        Iterator r10 = $this$mapIndexedNotNull$iv.iterator();
    L4:
        if (r10.hasNext() == false) goto L28;
        Object item$iv$iv$iv = r10.next();
        int index$iv$iv$iv = index$iv$iv + 1;
        if (index$iv$iv >= 0) goto L8;
        CollectionsKt.throwIndexOverflow();
    L8:
        String value = (String) item$iv$iv$iv;
        int index = index$iv$iv;
        if (index == 0) goto L13;
        int $i$f$reindent2 = $i$f$reindent;
        int $i$f$reindent3 = index;
        if ($i$f$reindent3 == lastIndex) goto L15;
    L17:
        String r0 = r23.invoke(value);
        if (r0 == null) goto L23;
        int lastIndex2 = lastIndex;
        String r1 = r22.invoke(r0);
        if (r1 == null) goto L24;
        value = r1;
    L24:
        if (value == null) goto L26;
        destination$iv$iv.add(value);
    L26:
        index$iv$iv = index$iv$iv$iv;
        $i$f$reindent = $i$f$reindent2;
        lastIndex = lastIndex2;
        goto L4
    L23:
        lastIndex2 = lastIndex;
    L15:
        if (StringsKt.isBlank(value) == false) goto L17;
        lastIndex2 = lastIndex;
        value = null;
        goto L24
    L13:
        $i$f$reindent2 = $i$f$reindent;
        $i$f$reindent3 = index;
        goto L15
    L28:
        return ((StringBuilder) CollectionsKt.joinTo$default((List) destination$iv$iv, new StringBuilder(resultSizeEstimate), "\n", null, null, 0, null, null, 124, null)).toString();
    }
}
