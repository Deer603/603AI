package androidx.compose.ui.text;

import androidx.autofill.HintConstants;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: AnnotatedString.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0016\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\"\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a\"\u0010\t\u001a\u00020\u00012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0086\b\u001a@\u0010\u000f\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u0011\u0018\u00010\u00102\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00110\u00102\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00110\u0010H\u0002\u001a(\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0018H\u0000\u001a\b\u0010\u001c\u001a\u00020\u0001H\u0000\u001aD\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001e0\u0011\u0018\u00010\u0010\"\u0004\b\u0000\u0010\u001e2\u0016\u0010\u001f\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u001e0\u0011\u0018\u00010\u00102\u0006\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0018H\u0002\u001a(\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u0018H\u0000\u001a\u0014\u0010'\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010(\u001a\u00020)\u001a\u0014\u0010*\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010(\u001a\u00020)\u001aD\u0010+\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u0011\u0018\u00010\u0010*\u00020\u00012\u0006\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00182\u0016\b\u0002\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000bH\u0002\u001a*\u0010-\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0011\u0018\u00010\u0010*\u00020\u00012\u0006\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0018H\u0002\u001aa\u0010.\u001a\b\u0012\u0004\u0012\u0002H\u001e0\u0010\"\u0004\b\u0000\u0010\u001e*\u00020\u00012\u0006\u0010/\u001a\u00020\u00062>\b\u0004\u00100\u001a8\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00060\u0011¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u0002H\u001e01H\u0080\b\u001a \u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00110\u0010*\u00020\u00012\u0006\u0010/\u001a\u00020\u0006H\u0000\u001a\u001c\u00106\u001a\u00020\u0001*\u00020\u00012\u0006\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0018H\u0002\u001a\u0014\u00107\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010(\u001a\u00020)\u001a\u0014\u00108\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010(\u001a\u00020)\u001a?\u00109\u001a\u0002H:\"\b\b\u0000\u0010:*\u00020;*\u00020\f2\u0006\u0010<\u001a\u00020=2\u0019\b\u0004\u00100\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H:0\u000b¢\u0006\u0002\b\u000eH\u0086\b¢\u0006\u0002\u0010>\u001a?\u00109\u001a\u0002H:\"\b\b\u0000\u0010:*\u00020;*\u00020\f2\u0006\u0010?\u001a\u00020@2\u0019\b\u0004\u00100\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H:0\u000b¢\u0006\u0002\b\u000eH\u0087\b¢\u0006\u0002\u0010A\u001aG\u00109\u001a\u0002H:\"\b\b\u0000\u0010:*\u00020;*\u00020\f2\u0006\u0010B\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u00042\u0019\b\u0004\u00100\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H:0\u000b¢\u0006\u0002\b\u000eH\u0086\b¢\u0006\u0002\u0010D\u001a@\u0010E\u001a\u0002H:\"\b\b\u0000\u0010:*\u00020;*\u00020F2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010H2\u0017\u00100\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H:0\u000b¢\u0006\u0002\b\u000eH\u0000¢\u0006\u0002\u0010I\u001a=\u0010J\u001a\u0002H:\"\b\b\u0000\u0010:*\u00020;*\u00020\f2\u0006\u0010K\u001a\u00020L2\u0017\u00100\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H:0\u000b¢\u0006\u0002\b\u000eH\u0086\b¢\u0006\u0002\u0010M\u001a?\u0010N\u001a\u0002H:\"\b\b\u0000\u0010:*\u00020;*\u00020\f2\u0006\u0010O\u001a\u00020\u00062\u0019\b\u0004\u00100\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H:0\u000b¢\u0006\u0002\b\u000eH\u0086\b¢\u0006\u0002\u0010P\u001a=\u0010N\u001a\u0002H:\"\b\b\u0000\u0010:*\u00020;*\u00020\f2\u0006\u0010O\u001a\u00020\b2\u0017\u00100\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H:0\u000b¢\u0006\u0002\b\u000eH\u0086\b¢\u0006\u0002\u0010Q\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006R"}, d2 = {"EmptyAnnotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "AnnotatedString", "text", "", "paragraphStyle", "Landroidx/compose/ui/text/ParagraphStyle;", "spanStyle", "Landroidx/compose/ui/text/SpanStyle;", "buildAnnotatedString", "builder", "Lkotlin/Function1;", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "", "Lkotlin/ExtensionFunctionType;", "constructAnnotationsFromSpansAndParagraphs", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "spanStyles", "paragraphStyles", "contains", "", "baseStart", "", "baseEnd", "targetStart", "targetEnd", "emptyAnnotatedString", "filterRanges", "T", "ranges", "start", "end", "intersect", "lStart", "lEnd", "rStart", "rEnd", "capitalize", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "decapitalize", "getLocalAnnotations", "predicate", "getLocalParagraphStyles", "mapEachParagraphStyle", "defaultParagraphStyle", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "annotatedString", "normalizedParagraphStyles", "substringWithoutParagraphStyles", "toLowerCase", "toUpperCase", "withAnnotation", "R", "", "ttsAnnotation", "Landroidx/compose/ui/text/TtsAnnotation;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/TtsAnnotation;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "urlAnnotation", "Landroidx/compose/ui/text/UrlAnnotation;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/UrlAnnotation;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "tag", "annotation", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "withBulletListItem", "Landroidx/compose/ui/text/AnnotatedString$Builder$BulletScope;", "bullet", "Landroidx/compose/ui/text/Bullet;", "(Landroidx/compose/ui/text/AnnotatedString$Builder$BulletScope;Landroidx/compose/ui/text/Bullet;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "withLink", "link", "Landroidx/compose/ui/text/LinkAnnotation;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/LinkAnnotation;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "withStyle", "style", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/ParagraphStyle;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/SpanStyle;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AnnotatedStringKt {
    private static final AnnotatedString EmptyAnnotatedString = null;

    public static final /* synthetic */ List access$constructAnnotationsFromSpansAndParagraphs(List spanStyles, List paragraphStyles) {
        return constructAnnotationsFromSpansAndParagraphs(spanStyles, paragraphStyles);
    }

    public static final /* synthetic */ List access$filterRanges(List ranges, int start, int end) {
        return filterRanges(ranges, start, end);
    }

    public static final /* synthetic */ AnnotatedString access$substringWithoutParagraphStyles(AnnotatedString $receiver, int start, int end) {
        return substringWithoutParagraphStyles($receiver, start, end);
    }

    private static final List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> constructAnnotationsFromSpansAndParagraphs(List<AnnotatedString.Range<SpanStyle>> r10, List<AnnotatedString.Range<ParagraphStyle>> r11) {
        if (r10.isEmpty() == false) goto L8;
        if (r11.isEmpty() == false) goto L8;
        return null;
    L8:
        if (r11.isEmpty() == false) goto L11;
        return r10;
    L11:
        if (r10.isEmpty() == true) goto L25;
        ArrayList array = new ArrayList(r10.size() + r11.size());
        int index$iv = 0;
        int r6 = r10.size();
    L14:
        if (index$iv >= r6) goto L16;
        Object item$iv = r10.get(index$iv);
        array.add((AnnotatedString.Range) item$iv);
        index$iv = index$iv + 1;
        goto L14
    L16:
        int index$iv2 = 0;
        int r7 = r11.size();
    L17:
        if (index$iv2 >= r7) goto L20;
        Object item$iv2 = r11.get(index$iv2);
        array.add((AnnotatedString.Range) item$iv2);
        index$iv2 = index$iv2 + 1;
        goto L17
    L20:
        return array;
    L25:
        return r11;
    }

    public static final List<AnnotatedString.Range<ParagraphStyle>> normalizedParagraphStyles(AnnotatedString $this$normalizedParagraphStyles, ParagraphStyle defaultParagraphStyle) {
        Iterable r1 = $this$normalizedParagraphStyles.getParagraphStylesOrNull$ui_text_release();
        if (r1 == null) goto L6;
        Iterable $this$sortedBy$iv = r1;
        List sortedParagraphs = CollectionsKt.sortedWith($this$sortedBy$iv, new AnnotatedStringKt$normalizedParagraphStyles$$inlined$sortedBy$1());
        if (sortedParagraphs == null) goto L6;
    L7:
        List result = new ArrayList();
        int lastAdded = 0;
        ArrayDeque stack = new ArrayDeque();
        List $this$fastForEach$iv = sortedParagraphs;
        int index$iv = 0;
        int r8 = $this$fastForEach$iv.size();
    L8:
        if (index$iv >= r8) goto L45;
        Object item$iv = $this$fastForEach$iv.get(index$iv);
        AnnotatedString.Range it = (AnnotatedString.Range) item$iv;
        AnnotatedString.Range current = AnnotatedString.Range.copy$default(it, defaultParagraphStyle.merge((ParagraphStyle) it.getItem()), 0, 0, null, 14, null);
    L11:
        if (lastAdded >= current.getStart()) goto L24;
        if (stack.isEmpty() == true) goto L24;
        AnnotatedString.Range lastInStack = (AnnotatedString.Range) stack.last();
        if (current.getStart() < lastInStack.getEnd()) goto L16;
        result.add(new AnnotatedString.Range(lastInStack.getItem(), lastAdded, lastInStack.getEnd()));
        lastAdded = lastInStack.getEnd();
    L19:
        if (stack.isEmpty() == true) goto L11;
        if (lastAdded != ((AnnotatedString.Range) stack.last()).getEnd()) goto L11;
        stack.removeLast();
        goto L19
    L16:
        result.add(new AnnotatedString.Range(lastInStack.getItem(), lastAdded, current.getStart()));
        lastAdded = current.getStart();
    L24:
        if (lastAdded >= current.getStart()) goto L26;
        result.add(new AnnotatedString.Range(defaultParagraphStyle, lastAdded, current.getStart()));
        lastAdded = current.getStart();
    L26:
        AnnotatedString.Range lastInStack2 = (AnnotatedString.Range) stack.lastOrNull();
        if (lastInStack2 != null) goto L29;
        List sortedParagraphs2 = sortedParagraphs;
        stack.add(new AnnotatedString.Range(current.getItem(), current.getStart(), current.getEnd()));
    L42:
        index$iv = index$iv + 1;
        sortedParagraphs = sortedParagraphs2;
        goto L8
    L29:
        if (lastInStack2.getStart() == current.getStart()) goto L31;
    L33:
        sortedParagraphs2 = sortedParagraphs;
        if (lastInStack2.getStart() != lastInStack2.getEnd()) goto L37;
        result.add(new AnnotatedString.Range(lastInStack2.getItem(), lastInStack2.getStart(), lastInStack2.getEnd()));
        stack.removeLast();
        stack.add(new AnnotatedString.Range(current.getItem(), current.getStart(), current.getEnd()));
        goto L42
    L37:
        if (lastInStack2.getEnd() < current.getEnd()) goto L40;
        stack.add(new AnnotatedString.Range(((ParagraphStyle) lastInStack2.getItem()).merge((ParagraphStyle) current.getItem()), current.getStart(), current.getEnd()));
        goto L42
    L40:
        throw new IllegalArgumentException();
    L31:
        if (lastInStack2.getEnd() != current.getEnd()) goto L33;
        stack.removeLast();
        sortedParagraphs2 = sortedParagraphs;
        stack.add(new AnnotatedString.Range(((ParagraphStyle) lastInStack2.getItem()).merge((ParagraphStyle) current.getItem()), current.getStart(), current.getEnd()));
    L45:
        if (lastAdded > $this$normalizedParagraphStyles.getText().length()) goto L55;
        if (stack.isEmpty() == true) goto L55;
        AnnotatedString.Range lastInStack3 = (AnnotatedString.Range) stack.last();
        result.add(new AnnotatedString.Range(lastInStack3.getItem(), lastAdded, lastInStack3.getEnd()));
        lastAdded = lastInStack3.getEnd();
    L50:
        if (stack.isEmpty() == true) goto L45;
        if (lastAdded != ((AnnotatedString.Range) stack.last()).getEnd()) goto L45;
        stack.removeLast();
    L55:
        if (lastAdded >= $this$normalizedParagraphStyles.getText().length()) goto L58;
        result.add(new AnnotatedString.Range(defaultParagraphStyle, lastAdded, $this$normalizedParagraphStyles.getText().length()));
    L58:
        if (result.isEmpty() == false) goto L60;
        result.add(new AnnotatedString.Range(defaultParagraphStyle, 0, 0));
    L60:
        return result;
    L6:
        sortedParagraphs = CollectionsKt.emptyList();
        goto L7
    }

    private static final List<AnnotatedString.Range<ParagraphStyle>> getLocalParagraphStyles(AnnotatedString $this$getLocalParagraphStyles, int start, int end) {
        if (start != end) goto L5;
        return null;
    L5:
        List<AnnotatedString.Range<ParagraphStyle>> r3 = $this$getLocalParagraphStyles.getParagraphStylesOrNull$ui_text_release();
        if (r3 != null) goto L8;
        return null;
    L8:
        if (start == 0) goto L10;
    L12:
        List<AnnotatedString.Range<ParagraphStyle>> r2 = r3;
        int $i$f$fastFilteredMap = 0;
        ArrayList target$iv = new ArrayList(r2.size());
        int index$iv$iv = 0;
        int r9 = r2.size();
    L13:
        if (index$iv$iv >= r9) goto L34;
        Object item$iv$iv = r2.get(index$iv$iv);
        AnnotatedString.Range<ParagraphStyle> r13 = (AnnotatedString.Range) item$iv$iv;
        List<AnnotatedString.Range<ParagraphStyle>> r16 = r2;
        if (intersect(start, end, r13.getStart(), r13.getEnd()) == false) goto L32;
        ArrayList r4 = target$iv;
        AnnotatedString.Range<ParagraphStyle> r14 = (AnnotatedString.Range) item$iv$iv;
        ParagraphStyle r5 = r14.getItem();
        int $this$fastCoerceIn$iv = r14.getStart();
        if ($this$fastCoerceIn$iv >= start) goto L19;
        int r20 = start;
    L20:
        int $this$fastCoerceAtMost$iv$iv = r20;
        if ($this$fastCoerceAtMost$iv$iv <= end) goto L23;
        $this$fastCoerceAtMost$iv$iv = end;
    L23:
        int r6 = $this$fastCoerceAtMost$iv$iv - start;
        int $this$fastCoerceIn$iv2 = r14.getEnd();
        if ($this$fastCoerceIn$iv2 >= start) goto L26;
        int r21 = start;
    L27:
        int $this$fastCoerceAtMost$iv$iv2 = r21;
        if ($this$fastCoerceAtMost$iv$iv2 <= end) goto L30;
        $this$fastCoerceAtMost$iv$iv2 = end;
    L30:
        r4.add(new AnnotatedString.Range(r5, r6, $this$fastCoerceAtMost$iv$iv2 - start));
        goto L32
    L26:
        r21 = $this$fastCoerceIn$iv2;
        goto L27
    L19:
        r20 = $this$fastCoerceIn$iv;
    L32:
        index$iv$iv = index$iv$iv + 1;
        r2 = r16;
        r3 = r3;
        $i$f$fastFilteredMap = $i$f$fastFilteredMap;
        target$iv = target$iv;
        goto L13
    L34:
        return target$iv;
    L10:
        if (end < $this$getLocalParagraphStyles.getText().length()) goto L12;
        return r3;
    }

    static /* synthetic */ List getLocalAnnotations$default(AnnotatedString r0, int r1, int r2, Function1 r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L6;
        r3 = null;
    L6:
        return getLocalAnnotations(r0, r1, r2, r3);
    }

    private static final List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> getLocalAnnotations(AnnotatedString $this$getLocalAnnotations, int start, int end, Function1<? super AnnotatedString.Annotation, Boolean> r23) {
        int r0 = start;
        Function1<? super AnnotatedString.Annotation, Boolean> r2 = r23;
        if (r0 != end) goto L5;
        return null;
    L5:
        List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> r4 = $this$getLocalAnnotations.getAnnotations$ui_text_release();
        if (r4 != null) goto L8;
        return null;
    L8:
        if (r0 == 0) goto L10;
    L21:
        List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> r3 = r4;
        int $i$f$fastFilteredMap = 0;
        ArrayList target$iv = new ArrayList(r3.size());
        int index$iv$iv = 0;
        int r10 = r3.size();
    L22:
        if (index$iv$iv >= r10) goto L37;
        Object item$iv$iv = r3.get(index$iv$iv);
        AnnotatedString.Range<? extends AnnotatedString.Annotation> r14 = (AnnotatedString.Range) item$iv$iv;
        boolean r16 = true;
        if (r2 == null) goto L26;
        boolean r5 = r2.invoke(r14.getItem()).booleanValue();
    L27:
        if (r5 == true) goto L29;
    L31:
        r16 = false;
    L32:
        if (r16 == false) goto L35;
        AnnotatedString.Range<? extends AnnotatedString.Annotation> r6 = (AnnotatedString.Range) item$iv$iv;
        String r15 = r6.getTag();
        AnnotatedString.Annotation r7 = r6.getItem();
        int r8 = RangesKt.coerceIn(r6.getStart(), r0, end) - r0;
        int $i$f$fastFilteredMap2 = r6.getEnd();
        target$iv.add(new AnnotatedString.Range(r7, r8, RangesKt.coerceIn($i$f$fastFilteredMap2, r0, end) - r0, r15));
    L35:
        index$iv$iv = index$iv$iv + 1;
        r0 = start;
        r2 = r23;
        r4 = r4;
        r3 = r3;
        $i$f$fastFilteredMap = $i$f$fastFilteredMap;
        goto L22
    L29:
        if (intersect(r0, end, r14.getStart(), r14.getEnd()) == false) goto L31;
    L26:
        r5 = true;
        goto L27
    L37:
        return target$iv;
    L10:
        if (end < $this$getLocalAnnotations.getText().length()) goto L21;
        if (r2 == null) goto L44;
        List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> r9 = r4;
        ArrayList target$iv2 = new ArrayList(r9.size());
        int index$iv$iv2 = 0;
        int r11 = r9.size();
    L14:
        if (index$iv$iv2 >= r11) goto L20;
        AnnotatedString.Range<? extends AnnotatedString.Annotation> r12 = r9.get(index$iv$iv2);
        List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> r17 = r9;
        if (r2.invoke(r12.getItem()).booleanValue() == false) goto L18;
        target$iv2.add(r12);
    L18:
        index$iv$iv2 = index$iv$iv2 + 1;
        r9 = r17;
        goto L14
    L20:
        return target$iv2;
    L44:
        return r4;
    }

    private static final AnnotatedString substringWithoutParagraphStyles(AnnotatedString $this$substringWithoutParagraphStyles, int start, int end) {
        if (start == end) goto L5;
        String r1 = $this$substringWithoutParagraphStyles.getText().substring(start, end);
        Intrinsics.checkNotNullExpressionValue(r1, "substring(...)");
    L6:
        List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> r2 = getLocalAnnotations($this$substringWithoutParagraphStyles, start, end, C06581.INSTANCE);
        if (r2 != null) goto L10;
        r2 = CollectionsKt.emptyList();
    L10:
        return new AnnotatedString(r1, r2);
    L5:
        r1 = "";
        goto L6
    }

    public static final <T> List<T> mapEachParagraphStyle(AnnotatedString $this$mapEachParagraphStyle, ParagraphStyle defaultParagraphStyle, Function2<? super AnnotatedString, ? super AnnotatedString.Range<ParagraphStyle>, ? extends T> r19) {
        int $i$f$mapEachParagraphStyle = 0;
        List<AnnotatedString.Range<ParagraphStyle>> r1 = normalizedParagraphStyles($this$mapEachParagraphStyle, defaultParagraphStyle);
        List target$iv = new ArrayList(r1.size());
        int index$iv$iv = 0;
        int r7 = r1.size();
    L3:
        if (index$iv$iv >= r7) goto L5;
        Object item$iv$iv = r1.get(index$iv$iv);
        AnnotatedString.Range<ParagraphStyle> r12 = (AnnotatedString.Range) item$iv$iv;
        AnnotatedString annotatedString = access$substringWithoutParagraphStyles($this$mapEachParagraphStyle, r12.getStart(), r12.getEnd());
        target$iv.add(r19.invoke(annotatedString, r12));
        index$iv$iv = index$iv$iv + 1;
        $i$f$mapEachParagraphStyle = $i$f$mapEachParagraphStyle;
        goto L3
    L5:
        List $this$fastMap$iv = target$iv;
        return $this$fastMap$iv;
    }

    public static /* synthetic */ AnnotatedString toUpperCase$default(AnnotatedString r0, LocaleList r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = LocaleList.Companion.getCurrent();
    L6:
        return toUpperCase(r0, r1);
    }

    public static final AnnotatedString toUpperCase(AnnotatedString $this$toUpperCase, final LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform($this$toUpperCase, new C06601(localeList));
    }

    public static /* synthetic */ AnnotatedString toLowerCase$default(AnnotatedString r0, LocaleList r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = LocaleList.Companion.getCurrent();
    L6:
        return toLowerCase(r0, r1);
    }

    public static final AnnotatedString toLowerCase(AnnotatedString $this$toLowerCase, final LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform($this$toLowerCase, new C06591(localeList));
    }

    public static /* synthetic */ AnnotatedString capitalize$default(AnnotatedString r0, LocaleList r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = LocaleList.Companion.getCurrent();
    L6:
        return capitalize(r0, r1);
    }

    public static final AnnotatedString capitalize(AnnotatedString $this$capitalize, final LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform($this$capitalize, new AnonymousClass1(localeList));
    }

    public static /* synthetic */ AnnotatedString decapitalize$default(AnnotatedString r0, LocaleList r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = LocaleList.Companion.getCurrent();
    L6:
        return decapitalize(r0, r1);
    }

    public static final AnnotatedString decapitalize(AnnotatedString $this$decapitalize, final LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform($this$decapitalize, new C06571(localeList));
    }

    public static final <R> R withStyle(AnnotatedString.Builder $this$withStyle, SpanStyle style, Function1<? super AnnotatedString.Builder, ? extends R> r5) {
        int index = $this$withStyle.pushStyle(style);
        R r2 = r5.invoke($this$withStyle);     // Catch: Throwable -> L6
        $this$withStyle.pop(index);
        return r2;
    L6:
        th = move-exception;
        $this$withStyle.pop(index);
        throw th;
    }

    public static final <R> R withStyle(AnnotatedString.Builder $this$withStyle, ParagraphStyle style, Function1<? super AnnotatedString.Builder, ? extends R> r5) {
        int index = $this$withStyle.pushStyle(style);
        R r2 = r5.invoke($this$withStyle);     // Catch: Throwable -> L6
        $this$withStyle.pop(index);
        return r2;
    L6:
        th = move-exception;
        $this$withStyle.pop(index);
        throw th;
    }

    public static final <R> R withAnnotation(AnnotatedString.Builder $this$withAnnotation, String tag, String annotation, Function1<? super AnnotatedString.Builder, ? extends R> r6) {
        int index = $this$withAnnotation.pushStringAnnotation(tag, annotation);
        R r2 = r6.invoke($this$withAnnotation);     // Catch: Throwable -> L6
        $this$withAnnotation.pop(index);
        return r2;
    L6:
        th = move-exception;
        $this$withAnnotation.pop(index);
        throw th;
    }

    public static final <R> R withAnnotation(AnnotatedString.Builder $this$withAnnotation, TtsAnnotation ttsAnnotation, Function1<? super AnnotatedString.Builder, ? extends R> r5) {
        int index = $this$withAnnotation.pushTtsAnnotation(ttsAnnotation);
        R r2 = r5.invoke($this$withAnnotation);     // Catch: Throwable -> L6
        $this$withAnnotation.pop(index);
        return r2;
    L6:
        th = move-exception;
        $this$withAnnotation.pop(index);
        throw th;
    }

    @Deprecated(message = "Use LinkAnnotation API for links instead", replaceWith = @ReplaceWith(expression = "withLink(, block)", imports = {}))
    public static final <R> R withAnnotation(AnnotatedString.Builder $this$withAnnotation, UrlAnnotation urlAnnotation, Function1<? super AnnotatedString.Builder, ? extends R> r5) {
        int index = $this$withAnnotation.pushUrlAnnotation(urlAnnotation);
        R r2 = r5.invoke($this$withAnnotation);     // Catch: Throwable -> L6
        $this$withAnnotation.pop(index);
        return r2;
    L6:
        th = move-exception;
        $this$withAnnotation.pop(index);
        throw th;
    }

    public static final <R> R withLink(AnnotatedString.Builder $this$withLink, LinkAnnotation link, Function1<? super AnnotatedString.Builder, ? extends R> r5) {
        int index = $this$withLink.pushLink(link);
        R r2 = r5.invoke($this$withLink);     // Catch: Throwable -> L6
        $this$withLink.pop(index);
        return r2;
    L6:
        th = move-exception;
        $this$withLink.pop(index);
        throw th;
    }

    public static /* synthetic */ Object withBulletListItem$default(AnnotatedString.Builder.BulletScope r0, Bullet r1, Function1 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = null;
    L6:
        return withBulletListItem(r0, r1, r2);
    }

    public static final <R> R withBulletListItem(AnnotatedString.Builder.BulletScope $this$withBulletListItem, Bullet bullet, Function1<? super AnnotatedString.Builder, ? extends R> r22) {
        Pair lastItemInStack = (Pair) CollectionsKt.lastOrNull($this$withBulletListItem.getBulletListSettingStack$ui_text_release());
        if (lastItemInStack == null) goto L5;
        long r2 = ((TextUnit) lastItemInStack.getFirst()).m7176unboximpl();
    L6:
        long itemIndentation = r2;
        if (bullet != null) goto L12;
        if (lastItemInStack == null) goto L11;
        Bullet r0 = (Bullet) lastItemInStack.getSecond();
        if (r0 == null) goto L11;
    L13:
        Bullet itemBullet = r0;
        int r8 = 0;
        int r9 = 0;
        long r10 = 0;
        PlatformParagraphStyle r13 = null;
        LineHeightStyle r14 = null;
        int r15 = 0;
        int r16 = 0;
        TextMotion r17 = null;
        int parIndex = $this$withBulletListItem.getBuilder$ui_text_release().pushStyle(new ParagraphStyle(r8, r9, r10, new TextIndent(itemIndentation, itemIndentation, null), r13, r14, r15, r16, r17, 503, null));
        int bulletIndex = $this$withBulletListItem.getBuilder$ui_text_release().pushBullet$ui_text_release(itemBullet);
        R r1 = r22.invoke($this$withBulletListItem.getBuilder$ui_text_release());     // Catch: Throwable -> L19
        $this$withBulletListItem.getBuilder$ui_text_release().pop(bulletIndex);
        $this$withBulletListItem.getBuilder$ui_text_release().pop(parIndex);
        return r1;
    L19:
        th = th;
    L23:
        $this$withBulletListItem.getBuilder$ui_text_release().pop(bulletIndex);
        $this$withBulletListItem.getBuilder$ui_text_release().pop(parIndex);
        throw th;
    L21:
        th = th;
    L11:
        r0 = BulletKt.getDefaultBullet();
        goto L13
    L12:
        r0 = bullet;
        goto L13
    L5:
        r2 = BulletKt.getDefaultBulletIndentation();
        goto L6
    }

    private static final <T> List<AnnotatedString.Range<T>> filterRanges(List<? extends AnnotatedString.Range<? extends T>> r19, int start, int end) {
        int r0 = start;
        int r1 = end;
        if (r0 > r1) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L10;
        InlineClassHelperKt.throwIllegalArgumentException("start (" + r0 + ") should be less than or equal to end (" + r1 + ')');
    L10:
        if (r19 != null) goto L12;
        return null;
    L12:
        List<? extends AnnotatedString.Range<? extends T>> r3 = r19;
        List<? extends AnnotatedString.Range<? extends T>> r4 = r3;
        ArrayList target$iv = new ArrayList(r4.size());
        int index$iv$iv = 0;
        int r10 = r4.size();
    L13:
        if (index$iv$iv >= r10) goto L19;
        Object item$iv$iv = r4.get(index$iv$iv);
        AnnotatedString.Range<? extends T> r14 = (AnnotatedString.Range) item$iv$iv;
        List<? extends AnnotatedString.Range<? extends T>> r16 = r3;
        if (intersect(r0, r1, r14.getStart(), r14.getEnd()) == false) goto L18;
        AnnotatedString.Range<? extends T> r5 = (AnnotatedString.Range) item$iv$iv;
        target$iv.add(new AnnotatedString.Range(r5.getItem(), Math.max(r0, r5.getStart()) - r0, Math.min(r1, r5.getEnd()) - start, r5.getTag()));
    L18:
        index$iv$iv = index$iv$iv + 1;
        r0 = start;
        r1 = end;
        r3 = r16;
        r4 = r4;
        goto L13
    L19:
        ArrayList r2 = target$iv;
        if (r2.isEmpty() == false) goto L22;
        ArrayList r6 = null;
    L24:
        return r6;
    L22:
        r6 = r2;
        goto L24
    L5:
        value$iv = false;
        goto L7
    }

    public static /* synthetic */ AnnotatedString AnnotatedString$default(String r0, SpanStyle r1, ParagraphStyle r2, int r3, Object r4) {
        if ((r3 & 4) == 0) goto L6;
        r2 = null;
    L6:
        return AnnotatedString(r0, r1, r2);
    }

    public static final AnnotatedString AnnotatedString(String text, SpanStyle spanStyle, ParagraphStyle paragraphStyle) {
        List r1 = CollectionsKt.listOf(new AnnotatedString.Range(spanStyle, 0, text.length()));
        if (paragraphStyle != null) goto L5;
        List r2 = CollectionsKt.emptyList();
    L7:
        return new AnnotatedString(text, r1, r2);
    L5:
        r2 = CollectionsKt.listOf(new AnnotatedString.Range(paragraphStyle, 0, text.length()));
        goto L7
    }

    public static final AnnotatedString AnnotatedString(String text, ParagraphStyle paragraphStyle) {
        return new AnnotatedString(text, CollectionsKt.emptyList(), CollectionsKt.listOf(new AnnotatedString.Range(paragraphStyle, 0, text.length())));
    }

    public static final AnnotatedString buildAnnotatedString(Function1<? super AnnotatedString.Builder, Unit> r5) {
        int r4 = 0;
        AnnotatedString.Builder r1 = new AnnotatedString.Builder(r4, 1, null);
        r5.invoke(r1);
        return r1.toAnnotatedString();
    }

    public static final boolean contains(int baseStart, int baseEnd, int targetStart, int targetEnd) {
        if (baseStart > targetStart) goto L17;
        if (targetEnd <= baseEnd) goto L6;
        return false;
    L6:
        if (baseEnd != targetEnd) goto L16;
        if (targetStart != targetEnd) goto L9;
        boolean r2 = true;
    L10:
        if (baseStart != baseEnd) goto L12;
        boolean r3 = true;
    L13:
        if (r2 == r3) goto L16;
        return false;
    L12:
        r3 = false;
        goto L13
    L9:
        r2 = false;
    L16:
        return true;
    L17:
        return false;
    }

    public static final boolean intersect(int lStart, int lEnd, int rStart, int rEnd) {
        boolean r0 = true;
        if (lStart != lEnd) goto L5;
        boolean r2 = true;
    L6:
        if (rStart != rEnd) goto L8;
        boolean r3 = true;
    L9:
        boolean r4 = r2 | r3;
        if (lStart != rStart) goto L12;
        boolean r5 = true;
    L13:
        boolean r6 = r4 & r5;
        if (lStart >= rEnd) goto L16;
        boolean r7 = true;
    L17:
        if (rStart < lEnd) goto L21;
        r0 = false;
    L21:
        return (r0 & r7) | r6;
    L16:
        r7 = false;
        goto L17
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

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String r3 = "";
        EmptyAnnotatedString = new AnnotatedString(r3, null, 2, 0 == true ? 1 : 0);
    }

    public static final AnnotatedString emptyAnnotatedString() {
        return EmptyAnnotatedString;
    }
}
