package androidx.compose.ui.text;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: JvmAnnotatedString.jvm.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a*\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002\u001a,\u0010\b\u001a\u00020\t*\u00020\t2\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\nH\u0000¨\u0006\f"}, d2 = {"collectRangeTransitions", "", "ranges", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "target", "Ljava/util/SortedSet;", "", "transform", "Landroidx/compose/ui/text/AnnotatedString;", "Lkotlin/Function3;", "", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class JvmAnnotatedString_jvmKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final AnnotatedString transform(final AnnotatedString $this$transform, final Function3<? super String, ? super Integer, ? super Integer, String> r24) {
        TreeSet transitions = SetsKt.sortedSetOf(new Integer[]{0, Integer.valueOf($this$transform.getText().length())});
        collectRangeTransitions($this$transform.getAnnotations$ui_text_release(), transitions);
        final Ref.ObjectRef resultStr = new Ref.ObjectRef();
        resultStr.element = "";
        final Map offsetMap = MapsKt.mutableMapOf(new Pair[]{TuplesKt.to(0, 0)});
        CollectionsKt.windowed$default(transitions, 2, 0, false, new AnonymousClass1(resultStr, r24, $this$transform, offsetMap), 6, null);
        List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> r2 = $this$transform.getAnnotations$ui_text_release();
        if (r2 == null) goto L8;
        int $i$f$fastMap = 0;
        ArrayList target$iv = new ArrayList(r2.size());
        int index$iv$iv = 0;
        int r9 = r2.size();
    L5:
        if (index$iv$iv >= r9) goto L7;
        Object item$iv$iv = r2.get(index$iv$iv);
        ArrayList r15 = target$iv;
        AnnotatedString.Range<? extends AnnotatedString.Annotation> r16 = (AnnotatedString.Range) item$iv$iv;
        List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> r19 = r2;
        AnnotatedString.Annotation r3 = r16.getItem();
        int $i$f$fastMap2 = $i$f$fastMap;
        Object r4 = offsetMap.get(Integer.valueOf(r16.getStart()));
        Intrinsics.checkNotNull(r4);
        int r5 = ((Number) r4).intValue();
        ArrayList target$iv2 = target$iv;
        Object r6 = offsetMap.get(Integer.valueOf(r16.getEnd()));
        Intrinsics.checkNotNull(r6);
        r15.add(new AnnotatedString.Range(r3, r5, ((Number) r6).intValue()));
        index$iv$iv = index$iv$iv + 1;
        transitions = transitions;
        r2 = r19;
        $i$f$fastMap = $i$f$fastMap2;
        target$iv = target$iv2;
        goto L5
    L7:
        ArrayList newAnnotations = target$iv;
    L10:
        return new AnnotatedString(newAnnotations, (String) resultStr.element);
    L8:
        newAnnotations = null;
        goto L10
    }

    private static final void collectRangeTransitions(List<? extends AnnotatedString.Range<?>> r16, SortedSet<Integer> r17) {
        if (r16 == null) goto L7;
        int index$iv$iv = 0;
        int r6 = r16.size();
    L4:
        if (index$iv$iv >= r6) goto L9;
        Object item$iv$iv = r16.get(index$iv$iv);
        AnnotatedString.Range<?> r10 = (AnnotatedString.Range) item$iv$iv;
        r17.add(Integer.valueOf(r10.getStart()));
        r17.add(Integer.valueOf(r10.getEnd()));
        index$iv$iv = index$iv$iv + 1;
        goto L4
    L9:
        return;
    }
}
