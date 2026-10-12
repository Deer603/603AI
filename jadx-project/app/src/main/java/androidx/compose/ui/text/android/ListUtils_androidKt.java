package androidx.compose.ui.text.android;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ListUtils.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a8\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0005H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a]\u0010\u0006\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\b\"\u0010\b\u0002\u0010\u0007*\n\u0012\u0006\b\u0000\u0012\u0002H\b0\t*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\n\u001a\u0002H\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\b0\u0005H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010\f\u001aJ\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\b0\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\b0\u000eH\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¨\u0006\u000f"}, d2 = {"fastForEach", "", "T", "", "action", "Lkotlin/Function1;", "fastMapTo", "C", "R", "", "destination", "transform", "(Ljava/util/List;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;", "fastZipWithNext", "Lkotlin/Function2;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ListUtils_androidKt {
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

    public static final <T, R, C extends Collection<? super R>> C fastMapTo(List<? extends T> r9, C r10, Function1<? super T, ? extends R> r11) {
        int index$iv = 0;
        int r4 = r9.size();
    L3:
        if (index$iv >= r4) goto L6;
        Object item$iv = r9.get(index$iv);
        r10.add(r11.invoke(item$iv));
        index$iv = index$iv + 1;
        goto L3
    L6:
        return r10;
    }

    public static final <T, R> List<R> fastZipWithNext(List<? extends T> r7, Function2<? super T, ? super T, ? extends R> r8) {
        if (r7.size() <= 1) goto L5;
        List result = new ArrayList();
        Object current = r7.get(0);
        int i = 0;
        int r4 = CollectionsKt.getLastIndex(r7);
    L7:
        if (i >= r4) goto L9;
        Object next = r7.get(i + 1);
        result.add(r8.invoke(current, next));
        current = next;
        i = i + 1;
        goto L7
    L9:
        return result;
    L5:
        return CollectionsKt.emptyList();
    }
}
