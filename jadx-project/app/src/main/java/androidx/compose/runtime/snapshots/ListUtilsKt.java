package androidx.compose.runtime.snapshots;

import androidx.autofill.HintConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ListUtils.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0000\u001a9\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00060\u0003j\u0002`\u00042\u0006\u0010\u0005\u001a\u0002H\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010\t\u001a8\u0010\n\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u000b0\u0007H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a8\u0010\u000e\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u000b0\u0007H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aS\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f2'\u0010\r\u001a#\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u000b0\u0010H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a8\u0010\u0015\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0007H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a>\u0010\u0017\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0010H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aP\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u0002H\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\f0\u0019\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u001a*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u001a0\u0007H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a}\u0010\u001c\u001a\u0002H\u001d\"\u0004\b\u0000\u0010\u0002\"\f\b\u0001\u0010\u001d*\u00060\u0003j\u0002`\u0004*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0006\u0010\u001e\u001a\u0002H\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010#\u001a\u00020\b2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010$\u001ab\u0010%\u001a\u00020&\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f2\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010#\u001a\u00020\b2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0000\u001aD\u0010'\u001a\b\u0012\u0004\u0012\u0002H(0\f\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010(*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H(0\u0007H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aF\u0010)\u001a\b\u0012\u0004\u0012\u0002H(0\f\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010(*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H(0\u0007H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a\u001e\u0010*\u001a\b\u0012\u0004\u0012\u0002H\u00020+\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\fH\u0000¨\u0006,"}, d2 = {"appendElement", "", "T", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "element", "transform", "Lkotlin/Function1;", "", "(Ljava/lang/Appendable;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "fastAll", "", "", "predicate", "fastAny", "fastFilterIndexed", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "index", "fastForEach", "action", "fastForEachIndexed", "fastGroupBy", "", "K", "keySelector", "fastJoinTo", "A", "buffer", "separator", "prefix", "postfix", "limit", "truncated", "(Ljava/util/List;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "fastJoinToString", "", "fastMap", "R", "fastMapNotNull", "fastToSet", "", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ListUtilsKt {
    public static final <T> void fastForEach(List<? extends T> r4, Function1<? super T, Unit> r5) {
        int index = 0;
        int r2 = r4.size();
    L3:
        if (index >= r2) goto L5;
        Object item = r4.get(index);
        r5.invoke(item);
        index = index + 1;
        goto L3
    }

    public static final <T> Set<T> fastToSet(List<? extends T> r10) {
        HashSet set = new HashSet(r10.size());
        int index$iv = 0;
        int r6 = r10.size();
    L3:
        if (index$iv >= r6) goto L6;
        set.add(r10.get(index$iv));
        index$iv = index$iv + 1;
        goto L3
    L6:
        return set;
    }

    public static final <T> void fastForEachIndexed(List<? extends T> r5, Function2<? super Integer, ? super T, Unit> r6) {
        int index = 0;
        int r2 = r5.size();
    L3:
        if (index >= r2) goto L5;
        Object item = r5.get(index);
        r6.invoke(Integer.valueOf(index), item);
        index = index + 1;
        goto L3
    }

    public static final <T, R> List<R> fastMap(List<? extends T> r11, Function1<? super T, ? extends R> r12) {
        ArrayList target = new ArrayList(r11.size());
        int index$iv = 0;
        int r5 = r11.size();
    L3:
        if (index$iv >= r5) goto L6;
        Object item$iv = r11.get(index$iv);
        target.add(r12.invoke(item$iv));
        index$iv = index$iv + 1;
        goto L3
    L6:
        return target;
    }

    public static final <T> boolean fastAny(List<? extends T> r9, Function1<? super T, Boolean> r10) {
        int index$iv = 0;
        int r4 = r9.size();
    L3:
        if (index$iv >= r4) goto L9;
        Object item$iv = r9.get(index$iv);
        if (r10.invoke(item$iv).booleanValue() == true) goto L6;
        index$iv = index$iv + 1;
        goto L3
    L6:
        return true;
    L9:
        return false;
    }

    public static final <T> boolean fastAll(List<? extends T> r9, Function1<? super T, Boolean> r10) {
        int index$iv = 0;
        int r4 = r9.size();
    L3:
        if (index$iv >= r4) goto L9;
        Object item$iv = r9.get(index$iv);
        if (r10.invoke(item$iv).booleanValue() == false) goto L6;
        index$iv = index$iv + 1;
        goto L3
    L6:
        return false;
    L9:
        return true;
    }

    public static final <T, K> Map<K, List<T>> fastGroupBy(List<? extends T> r16, Function1<? super T, ? extends K> r17) {
        Map destination = new HashMap(r16.size());
        int index$iv = 0;
        int r5 = r16.size();
    L3:
        if (index$iv >= r5) goto L10;
        Object item$iv = r16.get(index$iv);
        K r10 = r17.invoke(item$iv);
        Map $this$getOrPut$iv = destination;
        Object value$iv = $this$getOrPut$iv.get(r10);
        if (value$iv != null) goto L7;
        Object answer$iv = new ArrayList();
        $this$getOrPut$iv.put(r10, answer$iv);
    L8:
        ArrayList list = (ArrayList) answer$iv;
        list.add(item$iv);
        index$iv = index$iv + 1;
        goto L3
    L7:
        answer$iv = value$iv;
        goto L8
    L10:
        return destination;
    }

    public static /* synthetic */ String fastJoinToString$default(List r1, CharSequence r2, CharSequence r3, CharSequence r4, int r5, CharSequence r6, Function1 r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
    L6:
        if ((r8 & 2) == 0) goto L9;
    L9:
        if ((r8 & 4) == 0) goto L12;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = -1;
    L15:
        if ((r8 & 16) == 0) goto L18;
    L18:
        if ((r8 & 32) == 0) goto L20;
        Function1 r10 = null;
    L21:
        CharSequence r11 = r6;
        CharSequence r12 = r4;
        return fastJoinToString(r1, r2, r3, r12, r5, r11, r10);
    L20:
        r10 = r7;
        goto L21
    }

    public static final <T> String fastJoinToString(List<? extends T> r9, CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function1<? super T, ? extends CharSequence> r15) {
        return ((StringBuilder) fastJoinTo(r9, new StringBuilder(), separator, prefix, postfix, limit, truncated, r15)).toString();
    }

    static /* synthetic */ Appendable fastJoinTo$default(List r6, Appendable r7, CharSequence r8, CharSequence r9, CharSequence r10, int r11, CharSequence r12, Function1 r13, int r14, Object r15) {
        if ((r14 & 2) == 0) goto L5;
    L7:
        if ((r14 & 4) == 0) goto L9;
    L11:
        if ((r14 & 8) == 0) goto L13;
    L15:
        if ((r14 & 16) == 0) goto L17;
        int r3 = -1;
    L19:
        if ((r14 & 32) == 0) goto L21;
    L23:
        if ((r14 & 64) == 0) goto L25;
        Function1 r5 = null;
    L27:
        return fastJoinTo(r6, r7, r0, r1, r2, r3, r4, r5);
    L25:
        r5 = r13;
        goto L27
    L21:
        CharSequence r4 = r12;
        goto L23
    L17:
        r3 = r11;
        goto L19
    L13:
        CharSequence r2 = r10;
        goto L15
    L9:
        CharSequence r1 = r9;
        goto L11
    L5:
        CharSequence r0 = r8;
        goto L7
    }

    private static final <T, A extends Appendable> A fastJoinTo(List<? extends T> r5, A r6, CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function1<? super T, ? extends CharSequence> r12) {
        r6.append(prefix);
        int count = 0;
        int index = 0;
        int r2 = r5.size();
    L3:
        if (index >= r2) goto L12;
        Object element = r5.get(index);
        count = count + 1;
        if (count <= 1) goto L7;
        r6.append(separator);
    L7:
        if (limit < 0) goto L11;
        if (count > limit) goto L12;
    L11:
        appendElement(r6, element, r12);
        index = index + 1;
    L12:
        if (limit < 0) goto L15;
        if (count <= limit) goto L15;
        r6.append(truncated);
    L15:
        r6.append(postfix);
        return r6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void appendElement(Appendable $this$appendElement, T r2, Function1<? super T, ? extends CharSequence> r3) {
        if (r3 == null) goto L4;
        $this$appendElement.append(r3.invoke(r2));
        return;
    L4:
        if (r2 != 0) goto L6;
        boolean r0 = true;
    L7:
        if (r0 == false) goto L10;
        $this$appendElement.append((CharSequence) r2);
        return;
    L10:
        if ((r2 instanceof Character) == false) goto L12;
        $this$appendElement.append(((Character) r2).charValue());
        return;
    L12:
        $this$appendElement.append(String.valueOf(r2));
        return;
    L6:
        r0 = r2 instanceof CharSequence;
        goto L7
    }

    public static final <T, R> List<R> fastMapNotNull(List<? extends T> r12, Function1<? super T, ? extends R> r13) {
        ArrayList target = new ArrayList(r12.size());
        int index$iv = 0;
        int r5 = r12.size();
    L3:
        if (index$iv >= r5) goto L9;
        Object item$iv = r12.get(index$iv);
        R r9 = r13.invoke(item$iv);
        if (r9 == null) goto L7;
        target.add(r9);
    L7:
        index$iv = index$iv + 1;
        goto L3
    L9:
        return target;
    }

    public static final <T> List<T> fastFilterIndexed(List<? extends T> r11, Function2<? super Integer, ? super T, Boolean> r12) {
        ArrayList target = new ArrayList(r11.size());
        int index$iv = 0;
        int r5 = r11.size();
    L3:
        if (index$iv >= r5) goto L9;
        Object item$iv = r11.get(index$iv);
        int index = index$iv;
        if (r12.invoke(Integer.valueOf(index), item$iv).booleanValue() == false) goto L7;
        target.add(item$iv);
    L7:
        index$iv = index$iv + 1;
        goto L3
    L9:
        return target;
    }
}
