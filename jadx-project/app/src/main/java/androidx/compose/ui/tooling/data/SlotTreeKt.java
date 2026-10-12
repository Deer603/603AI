package androidx.compose.ui.tooling.data;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.unit.IntRect;
import androidx.webkit.ProxyConfig;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.CharsKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: SlotTree.jvm.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0010\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020#H\u0002\u001a(\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%2\u000e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0%2\b\u0010)\u001a\u0004\u0018\u00010*H\u0003\u001a\u0014\u0010+\u001a\u0004\u0018\u00010\u00062\b\u0010,\u001a\u0004\u0018\u00010(H\u0003\u001a\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020.0%2\u0006\u0010/\u001a\u00020\u0006H\u0002\u001a\u001e\u00100\u001a\u0004\u0018\u00010*2\u0006\u00101\u001a\u00020\u00062\n\b\u0002\u00102\u001a\u0004\u0018\u00010*H\u0003\u001a\u001a\u00103\u001a\u0004\u0018\u000104*\u0006\u0012\u0002\b\u0003052\u0006\u00106\u001a\u00020\u0006H\u0002\u001a\f\u00107\u001a\u00020\u0019*\u000208H\u0007\u001a\f\u00109\u001a\u00020\u0006*\u00020\u0015H\u0002\u001a\u001e\u0010:\u001a\b\u0012\u0004\u0012\u00020&0%*\u00020;2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=H\u0007\u001a\u0016\u0010>\u001a\u00020\u0019*\u00020;2\b\u0010?\u001a\u0004\u0018\u00010*H\u0003\u001a\f\u0010@\u001a\u00020\u0014*\u00020\u0015H\u0002\u001a\u0014\u0010A\u001a\u00020\u0014*\u00020\u00152\u0006\u0010B\u001a\u00020\u0006H\u0002\u001a\f\u0010C\u001a\u00020\u0014*\u00020\u0015H\u0002\u001a\f\u0010D\u001a\u00020\u0014*\u00020\u0015H\u0002\u001a\f\u0010E\u001a\u00020\u0014*\u00020\u0015H\u0002\u001aK\u0010F\u001a\u0004\u0018\u0001HG\"\u0004\b\u0000\u0010G*\u0002082&\u0010H\u001a\"\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020J\u0012\n\u0012\b\u0012\u0004\u0012\u0002HG0%\u0012\u0006\u0012\u0004\u0018\u0001HG0I2\b\b\u0002\u0010<\u001a\u00020=H\u0007¢\u0006\u0002\u0010K\u001a\f\u0010L\u001a\u00020\u0001*\u00020\u0015H\u0002\u001a\f\u0010M\u001a\u00020\u0001*\u00020\u0006H\u0002\u001a\u0014\u0010M\u001a\u00020\u0001*\u00020\u00062\u0006\u0010N\u001a\u00020\u0001H\u0002\u001a\u001c\u0010O\u001a\u00020\u0006*\u00020\u00062\u0006\u0010P\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u0006H\u0002\u001a\u0014\u0010R\u001a\u00020\t*\u00020\t2\u0006\u0010S\u001a\u00020\tH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u000e\u0010\f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0018\u0010\u0013\u001a\u00020\u0014*\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0016\"\u0018\u0010\u0017\u001a\u00020\u0014*\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016\" \u0010\u0018\u001a\u0004\u0018\u00010\u0006*\u00020\u00198GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0018\u0010\u001e\u001a\u00020\u0006*\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006T"}, d2 = {"BITS_PER_SLOT", "", "SLOT_MASK", "STABLE_BITS", "STATIC_BITS", "changedFieldName", "", "defaultFieldName", "emptyBox", "Landroidx/compose/ui/unit/IntRect;", "getEmptyBox", "()Landroidx/compose/ui/unit/IntRect;", "internalFieldPrefix", "jacocoDataField", "parameterPrefix", "parametersInformationTokenizer", "Lkotlin/text/Regex;", "recomposeScopeNameSuffix", "tokenizer", "isANumber", "", "Lkotlin/text/MatchResult;", "(Lkotlin/text/MatchResult;)Z", "isClassName", "position", "Landroidx/compose/ui/tooling/data/Group;", "getPosition$annotations", "(Landroidx/compose/ui/tooling/data/Group;)V", "getPosition", "(Landroidx/compose/ui/tooling/data/Group;)Ljava/lang/String;", "text", "getText", "(Lkotlin/text/MatchResult;)Ljava/lang/String;", "boundsOfLayoutNode", "node", "Landroidx/compose/ui/layout/LayoutInfo;", "extractParameterInfo", "", "Landroidx/compose/ui/tooling/data/ParameterInformation;", "data", "", "context", "Landroidx/compose/ui/tooling/data/SourceInformationContext;", "keyPosition", "key", "parseParameters", "Landroidx/compose/ui/tooling/data/Parameter;", "parameters", "sourceInformationContextOf", "information", "parent", "accessibleField", "Ljava/lang/reflect/Field;", "Ljava/lang/Class;", HintConstants.AUTOFILL_HINT_NAME, "asTree", "Landroidx/compose/runtime/tooling/CompositionData;", "callName", "findParameters", "Landroidx/compose/runtime/tooling/CompositionGroup;", "cache", "Landroidx/compose/ui/tooling/data/ContextCache;", "getGroup", "parentContext", "isCallWithName", "isChar", "c", "isFileName", "isNumber", "isParameterInformation", "mapTree", "T", "factory", "Lkotlin/Function3;", "Landroidx/compose/ui/tooling/data/SourceContext;", "(Landroidx/compose/runtime/tooling/CompositionData;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/tooling/data/ContextCache;)Ljava/lang/Object;", "number", "parseToInt", "radix", "replacePrefix", "prefix", "replacement", "union", "other", "ui-tooling-data_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SlotTreeKt {
    private static final int BITS_PER_SLOT = 3;
    private static final int SLOT_MASK = 7;
    private static final int STABLE_BITS = 4;
    private static final int STATIC_BITS = 3;
    private static final String changedFieldName = "$$changed";
    private static final String defaultFieldName = "$$default";
    private static final IntRect emptyBox = null;
    private static final String internalFieldPrefix = "$$";
    private static final String jacocoDataField = "$jacoco";
    private static final String parameterPrefix = "$";
    private static final Regex parametersInformationTokenizer = null;
    private static final String recomposeScopeNameSuffix = ".RecomposeScopeImpl";
    private static final Regex tokenizer = null;

    public static final /* synthetic */ IntRect access$boundsOfLayoutNode(LayoutInfo node) {
        return boundsOfLayoutNode(node);
    }

    public static final /* synthetic */ List access$extractParameterInfo(List data, SourceInformationContext context) {
        return extractParameterInfo(data, context);
    }

    public static /* synthetic */ void getPosition$annotations(Group r0) {
    }

    static {
        emptyBox = new IntRect(0, 0, 0, 0);
        tokenizer = new Regex("(\\d+)|([,])|([*])|([:])|L|(P\\([^)]*\\))|(C(\\(([^)]*)\\))?)|@");
        parametersInformationTokenizer = new Regex("(\\d+)|,|[!P()]|:([^,!)]+)");
    }

    public static final IntRect getEmptyBox() {
        return emptyBox;
    }

    private static final boolean isNumber(MatchResult $this$isNumber) {
        if ($this$isNumber.getGroups().get(1) != null) goto L7;
        return false;
    L7:
        return true;
    }

    private static final int number(MatchResult $this$number) {
        return parseToInt($this$number.getGroupValues().get(1));
    }

    private static final String getText(MatchResult $this$text) {
        return $this$text.getGroupValues().get(0);
    }

    private static final boolean isChar(MatchResult $this$isChar, String c) {
        return Intrinsics.areEqual(getText($this$isChar), c);
    }

    private static final boolean isFileName(MatchResult $this$isFileName) {
        if ($this$isFileName.getGroups().get(4) == null) goto L5;
        return true;
    L5:
        return false;
    }

    private static final boolean isParameterInformation(MatchResult $this$isParameterInformation) {
        if ($this$isParameterInformation.getGroups().get(5) == null) goto L5;
        return true;
    L5:
        return false;
    }

    private static final boolean isCallWithName(MatchResult $this$isCallWithName) {
        if ($this$isCallWithName.getGroups().get(6) == null) goto L5;
        return true;
    L5:
        return false;
    }

    private static final String callName(MatchResult $this$callName) {
        return $this$callName.getGroupValues().get(8);
    }

    private static final boolean isANumber(MatchResult $this$isANumber) {
        if ($this$isANumber.getGroups().get(1) != null) goto L7;
        return false;
    L7:
        return true;
    }

    private static final boolean isClassName(MatchResult $this$isClassName) {
        if ($this$isClassName.getGroups().get(2) == null) goto L5;
        return true;
    L5:
        return false;
    }

    private static final int parseToInt(String $this$parseToInt) {
        return Integer.parseInt($this$parseToInt);
    L6:
        throw new ParseError();
    }

    private static final int parseToInt(String $this$parseToInt, int radix) {
        return Integer.parseInt($this$parseToInt, CharsKt.checkRadix(radix));
    L6:
        throw new ParseError();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlin.text.MatchResult] */
    private static final List<Parameter> parseParameters(String parameters) {
        Ref.ObjectRef currentResult = new Ref.ObjectRef();
        currentResult.element = Regex.find$default(parametersInformationTokenizer, parameters, 0, 2, null);
        List expectedSortedIndex = CollectionsKt.mutableListOf(new Integer[]{0, 1, 2, 3});
        Ref.IntRef lastAdded = new Ref.IntRef();
        lastAdded.element = expectedSortedIndex.size() - 1;
        List result = new ArrayList();
        parseParameters$expect(currentResult, "P");     // Catch: NumberFormatException -> L25 ParseError -> L28
        parseParameters$expect(currentResult, "(");     // Catch: NumberFormatException -> L25 ParseError -> L28
    L5:
        if (parseParameters$isChar(currentResult, ")") == true) goto L19;
        if (parseParameters$isChar(currentResult, "!") == true) goto L8;
        if (parseParameters$isChar(currentResult, ",") == true) goto L13;
        int index = parseParameters$expectNumber(currentResult);     // Catch: NumberFormatException -> L25 ParseError -> L28
        if (parseParameters$isClassName(currentResult) == false) goto L17;
        String inlineClass = parseParameters$expectClassName(currentResult);     // Catch: NumberFormatException -> L25 ParseError -> L28
    L18:
        result.add(new Parameter(index, inlineClass));     // Catch: NumberFormatException -> L25 ParseError -> L28
        parseParameters$ensureIndexes(lastAdded, expectedSortedIndex, index);     // Catch: NumberFormatException -> L25 ParseError -> L28
        expectedSortedIndex.remove(Integer.valueOf(index));     // Catch: NumberFormatException -> L25 ParseError -> L28
        goto L5
    L17:
        inlineClass = null;
        goto L18
    L13:
        parseParameters$next(currentResult);     // Catch: NumberFormatException -> L25 ParseError -> L28
        goto L5
    L8:
        parseParameters$next(currentResult);     // Catch: NumberFormatException -> L25 ParseError -> L28
        int count = parseParameters$expectNumber(currentResult);     // Catch: NumberFormatException -> L25 ParseError -> L28
        parseParameters$ensureIndexes(lastAdded, expectedSortedIndex, result.size() + count);     // Catch: NumberFormatException -> L25 ParseError -> L28
        int r9 = 0;
    L9:
        if (r9 >= count) goto L5;
        result.add(new Parameter(((Number) CollectionsKt.first(expectedSortedIndex)).intValue(), null, 2, null));     // Catch: NumberFormatException -> L25 ParseError -> L28
        expectedSortedIndex.remove(0);     // Catch: NumberFormatException -> L25 ParseError -> L28
        r9 = r9 + 1;     // Catch: NumberFormatException -> L25 ParseError -> L28
        goto L9
    L19:
        parseParameters$expect(currentResult, ")");     // Catch: NumberFormatException -> L25 ParseError -> L28
    L20:
        if (expectedSortedIndex.size() <= 0) goto L24;
        result.add(new Parameter(((Number) CollectionsKt.first(expectedSortedIndex)).intValue(), null, 2, null));     // Catch: NumberFormatException -> L25 ParseError -> L28
        expectedSortedIndex.remove(0);     // Catch: NumberFormatException -> L25 ParseError -> L28
        goto L20
    L24:
        return result;
    L30:
        return CollectionsKt.emptyList();
    L27:
        return CollectionsKt.emptyList();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, kotlin.text.MatchResult] */
    private static final MatchResult parseParameters$next(Ref.ObjectRef<MatchResult> r3) {
        MatchResult it = r3.element;
        if (it == null) goto L6;
        r3.element = it.next();
    L6:
        return r3.element;
    }

    private static final int parseParameters$expectNumber(Ref.ObjectRef<MatchResult> r2) {
        MatchResult mr = r2.element;
        if (mr == null) goto L9;
        if (isANumber(mr) == false) goto L9;
        parseParameters$next(r2);
        return parseToInt(getText(mr));
    L9:
        throw new ParseError();
    }

    private static final String parseParameters$expectClassName(Ref.ObjectRef<MatchResult> r4) {
        MatchResult mr = r4.element;
        if (mr == null) goto L9;
        if (isClassName(mr) == false) goto L9;
        parseParameters$next(r4);
        String r1 = getText(mr).substring(1);
        Intrinsics.checkNotNullExpressionValue(r1, "substring(...)");
        return replacePrefix(r1, "c#", "androidx.compose.");
    L9:
        throw new ParseError();
    }

    private static final void parseParameters$expect(Ref.ObjectRef<MatchResult> r2, String value) {
        MatchResult mr = r2.element;
        if (mr == null) goto L9;
        if (Intrinsics.areEqual(getText(mr), value) == false) goto L9;
        parseParameters$next(r2);
        return;
    L9:
        throw new ParseError();
    }

    private static final boolean parseParameters$isChar(Ref.ObjectRef<MatchResult> r2, String value) {
        MatchResult mr = r2.element;
        if (mr != null) goto L5;
    L8:
        return true;
    L5:
        if (Intrinsics.areEqual(getText(mr), value) == true) goto L8;
        return false;
    }

    private static final boolean parseParameters$isClassName(Ref.ObjectRef<MatchResult> r2) {
        MatchResult mr = r2.element;
        if (mr != null) goto L5;
    L7:
        return false;
    L5:
        if (isClassName(mr) == false) goto L7;
        return true;
    }

    private static final void parseParameters$ensureIndexes(Ref.IntRef lastAdded, List<Integer> r8, int index) {
        int missing = index - lastAdded.element;
        if (missing > 0) goto L5;
        return;
    L5:
        if (missing >= 4) goto L7;
        int amountToAdd = 4;
    L8:
        int r3 = 0;
    L9:
        if (r3 >= amountToAdd) goto L11;
        int it = r3;
        r8.add(Integer.valueOf((lastAdded.element + it) + 1));
        r3 = r3 + 1;
        goto L9
    L11:
        lastAdded.element += amountToAdd;
        return;
    L7:
        amountToAdd = missing;
        goto L8
    }

    static /* synthetic */ SourceInformationContext sourceInformationContextOf$default(String r0, SourceInformationContext r1, int r2, Object r3) {
        if ((r2 & 2) == 0) goto L6;
        r1 = null;
    L6:
        return sourceInformationContextOf(r0, r1);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, kotlin.text.MatchResult] */
    private static final SourceInformationContext sourceInformationContextOf(String information, SourceInformationContext parent) {
        Ref.ObjectRef currentResult = new Ref.ObjectRef();
        String r6 = null;
        currentResult.element = Regex.find$default(tokenizer, information, 0, 2, null);
        List sourceLocations = new ArrayList();
        int packageHash = -1;
        int repeatOffset = -1;
        boolean isCall = false;
        boolean isInline = false;
        List<Parameter> r13 = null;
        String name = null;
    L4:
        if (currentResult.element == 0) goto L51;
        T r0 = currentResult.element;
        Intrinsics.checkNotNull(r0);
        MatchResult mr = (MatchResult) r0;
        if (isNumber(mr) == false) goto L8;
    L45:
        SourceLocationInfo it = sourceInformationContextOf$parseLocation(currentResult);
        if (it == null) goto L49;
        sourceLocations.add(it);
    L49:
        if (Intrinsics.areEqual(mr, currentResult.element) == false) goto L4;
        return null;
    L8:
        if (isChar(mr, "@") == true) goto L45;
        if (isChar(mr, "C") == false) goto L15;
        if (isCall == false) goto L14;
        isInline = true;
    L14:
        sourceInformationContextOf$next$4(currentResult);
        isCall = true;
        goto L49
    L15:
        boolean isCall2 = isCallWithName(mr);
        if (isCall2 == false) goto L20;
        if (isCall == false) goto L19;
        isInline = true;
    L19:
        String name2 = callName(mr);
        sourceInformationContextOf$next$4(currentResult);
        isCall = true;
        name = name2;
        goto L49
    L20:
        boolean isCall3 = isParameterInformation(mr);
        if (isCall3 == false) goto L24;
        List<Parameter> r1 = parseParameters(getText(mr));
        sourceInformationContextOf$next$4(currentResult);
        r13 = r1;
        goto L49
    L24:
        if (isChar(mr, ProxyConfig.MATCH_ALL_SCHEMES) == false) goto L27;
        int repeatOffset2 = sourceLocations.size();
        sourceInformationContextOf$next$4(currentResult);
        repeatOffset = repeatOffset2;
        goto L49
    L27:
        if (isChar(mr, ",") == false) goto L30;
        sourceInformationContextOf$next$4(currentResult);
        goto L49
    L30:
        if (isFileName(mr) == false) goto L51;
        String sourceFile = information.substring(mr.getRange().getLast() + 1);
        Intrinsics.checkNotNullExpressionValue(sourceFile, "substring(...)");
        String hashText = StringsKt.substringAfterLast(sourceFile, "#", "");
        if (hashText.length() <= 0) goto L34;
        boolean r9 = true;
    L35:
        if (r9 == false) goto L42;
        String sourceFile2 = StringsKt.substring(sourceFile, RangesKt.until(0, (sourceFile.length() - hashText.length()) - 1));
        int r2 = parseToInt(hashText, 36);     // Catch: NumberFormatException -> L39
    L41:
        packageHash = r2;
        String sourceFile3 = sourceFile2;
    L43:
        String sourceFile4 = sourceFile3;
        int packageHash2 = packageHash;
    L53:
        if (sourceFile4 != null) goto L57;
        if (parent == null) goto L56;
        r6 = parent.getSourceFile();
    L56:
        String r10 = r6;
    L58:
        if (sourceFile4 != null) goto L62;
        if (parent == null) goto L62;
        int r11 = parent.getPackageHash();
    L64:
        return new SourceInformationContext(name, r10, r11, sourceLocations, repeatOffset, r13, isCall, isInline);
    L62:
        r11 = packageHash2;
        goto L64
    L57:
        r10 = sourceFile4;
    L40:
        r2 = -1;
        goto L41
    L42:
        sourceFile3 = sourceFile;
        goto L43
    L34:
        r9 = false;
    L51:
        sourceFile4 = null;
        packageHash2 = -1;
        goto L53
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, kotlin.text.MatchResult] */
    private static final MatchResult sourceInformationContextOf$next$4(Ref.ObjectRef<MatchResult> r3) {
        MatchResult it = r3.element;
        if (it == null) goto L6;
        r3.element = it.next();
    L6:
        return r3.element;
    }

    private static final SourceLocationInfo sourceInformationContextOf$parseLocation(Ref.ObjectRef<MatchResult> r6) {
        Integer lineNumber = null;
        Integer offset = null;
        Integer length = null;
        MatchResult mr = r6.element;     // Catch: ParseError -> L34
        if (mr != null) goto L6;
    L8:
        if (mr != null) goto L10;
    L28:
        if (lineNumber == null) goto L33;
        if (offset == null) goto L33;
        if (length == null) goto L33;
        return new SourceLocationInfo(lineNumber, offset, length);
    L33:
        return null;
    L10:
        if (isChar(mr, "@") == false) goto L28;
        MatchResult mr2 = sourceInformationContextOf$next$4(r6);     // Catch: ParseError -> L34
        if (mr2 != null) goto L14;
    L27:
        return null;
    L14:
        if (isNumber(mr2) == false) goto L27;
        offset = Integer.valueOf(number(mr2));     // Catch: ParseError -> L34
        MatchResult mr3 = sourceInformationContextOf$next$4(r6);     // Catch: ParseError -> L34
        if (mr3 == null) goto L28;
        if (isChar(mr3, "L") == false) goto L28;
        MatchResult mr4 = sourceInformationContextOf$next$4(r6);     // Catch: ParseError -> L34
        if (mr4 != null) goto L23;
    L26:
        return null;
    L23:
        if (isNumber(mr4) == false) goto L26;
        length = Integer.valueOf(number(mr4));     // Catch: ParseError -> L34
        goto L28
    L6:
        if (isNumber(mr) == false) goto L8;
        lineNumber = Integer.valueOf(number(mr) + 1);     // Catch: ParseError -> L34
        mr = sourceInformationContextOf$next$4(r6);     // Catch: ParseError -> L34
    L35:
        return null;
    }

    private static final Group getGroup(CompositionGroup $this$getGroup, SourceInformationContext parentContext) {
        Object key = $this$getGroup.getKey();
        String it = $this$getGroup.getSourceInfo();
        if (it == null) goto L5;
        SourceInformationContext r1 = sourceInformationContextOf(it, parentContext);
    L6:
        SourceInformationContext context = r1;
        Object node = $this$getGroup.getNode();
        List data = new ArrayList();
        List children = new ArrayList();
        CollectionsKt.addAll(data, $this$getGroup.getData());
        Iterator<CompositionGroup> r4 = $this$getGroup.getCompositionGroups().iterator();
    L8:
        if (r4.hasNext() == false) goto L11;
        CompositionGroup child = r4.next();
        children.add(getGroup(child, context));
        goto L8
    L11:
        if ((node instanceof LayoutInfo) == false) goto L13;
        List<ModifierInfo> r6 = ((LayoutInfo) node).getModifierInfo();
    L15:
        if ((node instanceof LayoutInfo) == false) goto L18;
        IntRect box = boundsOfLayoutNode((LayoutInfo) node);
    L31:
        boolean r5 = true;
        if (context != null) goto L34;
    L36:
        boolean r8 = false;
    L37:
        if (r8 == false) goto L41;
        if (parentContext == null) goto L40;
        SourceLocation location = parentContext.nextSourceLocation();
    L43:
        if (node != null) goto L80;
        Object node2 = null;
        if (context == null) goto L48;
        String r7 = context.getName();
    L50:
        if (context == null) goto L52;
        String r9 = context.getName();
    L53:
        String r10 = r9;
        if (r10 != null) goto L56;
    L59:
        boolean r11 = true;
    L60:
        if (r11 == false) goto L62;
    L67:
        List<ParameterInformation> r12 = extractParameterInfo(data, context);
        SourceLocation location2 = location;
        List r13 = data;
        List r14 = children;
        if (context != null) goto L70;
    L72:
        r5 = false;
    L74:
        return new CallGroup(key, r7, box, location2, node2, r12, r13, r14, r5);
    L70:
        if (context.isInline() != true) goto L72;
    L62:
        if ((box.getBottom() - box.getTop()) <= 0) goto L64;
    L65:
        node2 = $this$getGroup.getIdentity();
        goto L67
    L64:
        if ((box.getRight() - box.getLeft()) <= 0) goto L67;
    L56:
        if (r10.length() == 0) goto L59;
        r11 = false;
        goto L60
    L52:
        r9 = null;
        goto L53
    L48:
        r7 = null;
        goto L50
    L80:
        return new NodeGroup(key, node, box, data, r6, children);
    L40:
        location = null;
        goto L43
    L41:
        location = null;
        goto L43
    L34:
        if (context.isCall() != true) goto L36;
        r8 = true;
        goto L37
    L18:
        if (children.isEmpty() == false) goto L20;
        box = emptyBox;
        goto L31
    L20:
        List $this$map$iv = children;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        Iterator r15 = $this$map$iv.iterator();
    L22:
        if (r15.hasNext() == false) goto L24;
        Object item$iv$iv = r15.next();
        Group g = (Group) item$iv$iv;
        destination$iv$iv.add(g.getBox());
        goto L22
    L24:
        Iterable $this$reduce$iv = (List) destination$iv$iv;
        Iterator iterator$iv = $this$reduce$iv.iterator();
        if (iterator$iv.hasNext() == false) goto L76;
        Object accumulator$iv = iterator$iv.next();
    L28:
        if (iterator$iv.hasNext() == false) goto L30;
        IntRect box2 = (IntRect) iterator$iv.next();
        IntRect acc = (IntRect) accumulator$iv;
        accumulator$iv = union(box2, acc);
        goto L28
    L30:
        box = (IntRect) accumulator$iv;
        goto L31
    L76:
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    L13:
        r6 = CollectionsKt.emptyList();
        goto L15
    L5:
        r1 = null;
        goto L6
    }

    private static final IntRect boundsOfLayoutNode(LayoutInfo node) {
        LayoutCoordinates coordinates = node.getCoordinates();
        if (node.isAttached() == false) goto L10;
        if (coordinates.isAttached() == false) goto L10;
        long position = LayoutCoordinatesKt.positionInWindow(coordinates);
        long size = coordinates.mo5722getSizeYbymL2g();
        int bits$iv$iv$iv = (int) (position >> 32);
        int left = MathKt.roundToInt(Float.intBitsToFloat(bits$iv$iv$iv));
        int bits$iv$iv$iv2 = (int) (position & 4294967295L);
        int top = MathKt.roundToInt(Float.intBitsToFloat(bits$iv$iv$iv2));
        int $i$f$unpackInt1 = (int) (size >> 32);
        int right = $i$f$unpackInt1 + left;
        int bottom = ((int) (4294967295L & size)) + top;
        return new IntRect(left, top, right, bottom);
    L10:
        return new IntRect(0, 0, node.getWidth(), node.getHeight());
    }

    public static /* synthetic */ Object mapTree$default(CompositionData r0, Function3 r1, ContextCache r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = new ContextCache();
    L6:
        return mapTree(r0, r1, r2);
    }

    public static final <T> T mapTree(CompositionData r4, Function3<? super CompositionGroup, ? super SourceContext, ? super List<? extends T>, ? extends T> r5, ContextCache r6) {
        CompositionGroup r0 = (CompositionGroup) CollectionsKt.firstOrNull(r4.getCompositionGroups());
        if (r0 != null) goto L6;
        return null;
    L6:
        CompositionCallStack r1 = new CompositionCallStack(r5, r6.getContexts$ui_tooling_data_release());
        ArrayList r2 = new ArrayList();
        r1.convert(r0, 0, r2);
        return (T) CollectionsKt.firstOrNull(r2);
    }

    public static /* synthetic */ List findParameters$default(CompositionGroup r0, ContextCache r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = null;
    L6:
        return findParameters(r0, r1);
    }

    public static final List<ParameterInformation> findParameters(CompositionGroup $this$findParameters, ContextCache cache) {
        String information = $this$findParameters.getSourceInfo();
        if (information == null) goto L5;
        SourceInformationContext context = null;
        if (cache != null) goto L9;
        context = sourceInformationContextOf$default(information, null, 2, null);
    L16:
        List data = new ArrayList();
        CollectionsKt.addAll(data, $this$findParameters.getData());
        return extractParameterInfo(data, context);
    L9:
        Map<String, Object> r3 = cache.getContexts$ui_tooling_data_release();
        Object value$iv = r3.get(information);
        if (value$iv != null) goto L12;
        Object answer$iv = sourceInformationContextOf$default(information, null, 2, null);
        r3.put(information, answer$iv);
    L14:
        if ((answer$iv instanceof SourceInformationContext) == false) goto L16;
        context = (SourceInformationContext) answer$iv;
        goto L16
    L12:
        answer$iv = value$iv;
        goto L14
    L5:
        return CollectionsKt.emptyList();
    }

    public static final Group asTree(CompositionData $this$asTree) {
        CompositionGroup r0 = (CompositionGroup) CollectionsKt.firstOrNull($this$asTree.getCompositionGroups());
        if (r0 == null) goto L7;
        Group r1 = getGroup(r0, null);
        if (r1 == null) goto L7;
        return r1;
    L7:
        return EmptyGroup.INSTANCE;
    }

    public static final IntRect union(IntRect $this$union, IntRect other) {
        if (Intrinsics.areEqual($this$union, emptyBox) == false) goto L6;
        return other;
    L6:
        if (Intrinsics.areEqual(other, emptyBox) == false) goto L8;
        return $this$union;
    L8:
        int r0 = Math.min($this$union.getLeft(), other.getLeft());
        int r1 = Math.min($this$union.getTop(), other.getTop());
        int r2 = Math.max($this$union.getBottom(), other.getBottom());
        return new IntRect(r0, r1, Math.max($this$union.getRight(), other.getRight()), r2);
    }

    private static final String keyPosition(Object key) {
        if ((key instanceof String) == false) goto L6;
        return (String) key;
    L6:
        if ((key instanceof JoinedKey) == false) goto L10;
        String r0 = keyPosition(((JoinedKey) key).getLeft());
        if (r0 == null) goto L14;
        return r0;
    L14:
        return keyPosition(((JoinedKey) key).getRight());
    L10:
        return null;
    }

    private static final List<ParameterInformation> extractParameterInfo(List<? extends Object> r32, SourceInformationContext context) {
        if (r32.isEmpty() == true) goto L98;
        List<? extends Object> $this$firstOrNull$iv = r32;
        Iterator r2 = $this$firstOrNull$iv.iterator();
    L5:
        int r7 = 0;
        if (r2.hasNext() == false) goto L15;
        Object element$iv = r2.next();
        if (element$iv != null) goto L10;
    L12:
        boolean r8 = false;
    L13:
        if (r8 == false) goto L5;
    L17:
        if (element$iv == null) goto L98;
        Field blockField = accessibleField(element$iv.getClass(), "block");     // Catch: Throwable -> L94
        if (blockField == null) goto L98;
        Object block = blockField.get(element$iv);     // Catch: Throwable -> L94
        if (block == null) goto L98;
        Class<?> r3 = block.getClass();     // Catch: Throwable -> L94
        Field defaultsField = accessibleField(r3, defaultFieldName);     // Catch: Throwable -> L94
        Field changedField = accessibleField(r3, changedFieldName);     // Catch: Throwable -> L94
        if (defaultsField != null) goto L99;
        int r11 = 0;
    L30:
        if (changedField == null) goto L33;
        Object r12 = changedField.get(block);     // Catch: Throwable -> L26
        Intrinsics.checkNotNull(r12, "null cannot be cast to non-null type kotlin.Int");     // Catch: Throwable -> L26
        int changed = ((Integer) r12).intValue();     // Catch: Throwable -> L26
    L35:
        Field[] r13 = r3.getDeclaredFields();     // Catch: Throwable -> L94
        Collection destination$iv$iv = new ArrayList();     // Catch: Throwable -> L94
        int r6 = r13.length;     // Catch: Throwable -> L94
        int r4 = 0;
    L36:
        if (r4 >= r6) goto L51;
        Field it = r13[r4];     // Catch: Throwable -> L94
        Field blockField2 = blockField;
        Class<?> r21 = r3;
        Object recomposeScope = element$iv;
        if (StringsKt.startsWith$default(it.getName(), parameterPrefix, false, 2, null) == true) goto L42;
    L46:
        boolean r0 = false;
    L47:
        if (r0 == false) goto L50;
        destination$iv$iv.add(it);     // Catch: Throwable -> L90
    L50:
        r4 = r4 + 1;     // Catch: Throwable -> L90
        r7 = 0;
        r3 = r21;
        blockField = blockField2;
        element$iv = recomposeScope;
        goto L36
    L42:
        if (StringsKt.startsWith$default(it.getName(), internalFieldPrefix, false, 2, null) == true) goto L46;
        if (StringsKt.startsWith$default(it.getName(), jacocoDataField, false, 2, null) == true) goto L46;
        r0 = true;
        goto L47
    L51:
        int r5 = r7;
        Iterable $this$sortedBy$iv = (List) destination$iv$iv;     // Catch: Throwable -> L90
        List fields = CollectionsKt.sortedWith($this$sortedBy$iv, new SlotTreeKt$extractParameterInfo$$inlined$sortedBy$1());     // Catch: Throwable -> L90
        List parameters = new ArrayList();     // Catch: Throwable -> L90
        if (context == null) goto L55;
        List<Parameter> r9 = context.getParameters();     // Catch: Throwable -> L90
        if (r9 == null) goto L55;
    L56:
        int r10 = fields.size();     // Catch: Throwable -> L90
        int r14 = r5;
    L57:
        if (r14 >= r10) goto L89;
        int index = r14;
        if (index >= r9.size()) goto L61;
        Parameter metadata = r9.get(index);     // Catch: Throwable -> L90
    L63:
        if (metadata.getSortedIndex() >= fields.size()) goto L88;
        Field field = (Field) fields.get(metadata.getSortedIndex());     // Catch: Throwable -> L90
        field.setAccessible(true);     // Catch: Throwable -> L90
        Object value = field.get(block);     // Catch: Throwable -> L90
        if (((1 << index) & r11) == 0) goto L67;
        boolean fromDefault = true;
    L68:
        int changedOffset = (index * 3) + 1;     // Catch: Throwable -> L90
        int parameterChanged = ((7 << changedOffset) & changed) >> changedOffset;     // Catch: Throwable -> L90
        if ((parameterChanged & 3) != 3) goto L71;
        boolean r28 = true;
    L73:
        if ((parameterChanged & 3) != 0) goto L75;
        boolean compared = true;
    L77:
        if ((parameterChanged & 4) != 0) goto L79;
        boolean stable = true;
    L80:
        boolean compared2 = compared;
        String r15 = field.getName().substring(1);     // Catch: Throwable -> L90
        Intrinsics.checkNotNullExpressionValue(r15, "substring(...)");     // Catch: Throwable -> L90
        if (compared2 == false) goto L84;
        if (fromDefault == true) goto L84;
        boolean r29 = true;
    L85:
        parameters.add(new ParameterInformation(r15, value, fromDefault, r28, r29, metadata.getInlineClass(), stable));     // Catch: Throwable -> L90
    L84:
        r29 = false;
        goto L85
    L79:
        stable = false;
        goto L80
    L75:
        compared = false;
        goto L77
    L71:
        r28 = false;
        goto L73
    L67:
        fromDefault = false;
    L88:
        r14 = r14 + 1;
        block = block;
        goto L57
    L61:
        metadata = new Parameter(index, null, 2, null);     // Catch: Throwable -> L90
        goto L63
    L89:
        return parameters;
    L55:
        r9 = CollectionsKt.emptyList();     // Catch: Throwable -> L90
        goto L56
    L33:
        changed = 0;
        goto L35
    L99:
        Object r16 = defaultsField.get(block);     // Catch: Throwable -> L26
        Intrinsics.checkNotNull(r16, "null cannot be cast to non-null type kotlin.Int");     // Catch: Throwable -> L26
        r11 = ((Integer) r16).intValue();     // Catch: Throwable -> L26
        goto L30
    L10:
        if (StringsKt.endsWith$default(element$iv.getClass().getName(), recomposeScopeNameSuffix, false, 2, null) == false) goto L12;
        r8 = true;
        goto L13
    L15:
        element$iv = null;
    L98:
        return CollectionsKt.emptyList();
    }

    public static final String getPosition(Group $this$position) {
        return keyPosition($this$position.getKey());
    }

    private static final Field accessibleField(Class<?> r9, String name) {
        Field[] r0 = r9.getDeclaredFields();
        int r2 = r0.length;
        int r3 = 0;
    L4:
        if (r3 >= r2) goto L9;
        Field r5 = r0[r3];
        if (Intrinsics.areEqual(r5.getName(), name) == true) goto L10;
        r3 = r3 + 1;
    L10:
        if (r5 == null) goto L15;
        Field $this$accessibleField_u24lambda_u2415 = r5;
        $this$accessibleField_u24lambda_u2415.setAccessible(true);
        return r5;
    L15:
        return null;
    L9:
        r5 = null;
        goto L10
    }

    private static final String replacePrefix(String $this$replacePrefix, String prefix, String replacement) {
        if (StringsKt.startsWith$default($this$replacePrefix, prefix, false, 2, null) == false) goto L6;
        StringBuilder r0 = new StringBuilder().append(replacement);
        String r1 = $this$replacePrefix.substring(prefix.length());
        Intrinsics.checkNotNullExpressionValue(r1, "substring(...)");
        return r0.append(r1).toString();
    L6:
        return $this$replacePrefix;
    }
}
