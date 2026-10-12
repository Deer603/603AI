package androidx.compose.ui.tooling;

import androidx.compose.ui.unit.IntRect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: ViewInfoUtil.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u001a.\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0002\u001a2\u0010\u0006\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¨\u0006\n"}, d2 = {"filterTree", "", "Landroidx/compose/ui/tooling/ViewInfo;", "filter", "Lkotlin/Function1;", "", "toDebugString", "", "indentation", "", "ui-tooling_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ViewInfoUtil_androidKt {
    static /* synthetic */ List filterTree$default(List r0, AnonymousClass1 r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = AnonymousClass1.INSTANCE;
    L6:
        return filterTree(r0, r1);
    }

    private static final List<ViewInfo> filterTree(List<ViewInfo> r25, Function1<? super ViewInfo, Boolean> r26) {
        List<ViewInfo> list$iv$iv = r25;
        Collection destination$iv$iv = new ArrayList();
        Iterator r6 = list$iv$iv.iterator();
    L4:
        if (r6.hasNext() == false) goto L19;
        Object element$iv$iv = r6.next();
        ViewInfo it = (ViewInfo) element$iv$iv;
        Iterable $this$flatMap$iv = filterTree(it.getChildren(), r26);
        Collection destination$iv$iv2 = new ArrayList();
        Iterator r15 = $this$flatMap$iv.iterator();
    L7:
        if (r15.hasNext() == false) goto L13;
        Object element$iv$iv2 = r15.next();
        ViewInfo child = (ViewInfo) element$iv$iv2;
        if (child.getLocation() != null) goto L11;
        Iterable r19 = child.getChildren();
    L12:
        Iterable $this$flatMap$iv2 = list$iv$iv;
        Iterable $this$flatMap$iv3 = r19;
        CollectionsKt.addAll(destination$iv$iv2, $this$flatMap$iv3);
        list$iv$iv = $this$flatMap$iv2;
        goto L7
    L11:
        r19 = CollectionsKt.listOf(child);
        goto L12
    L13:
        Iterable $this$flatMap$iv4 = list$iv$iv;
        List acceptedNodes = (List) destination$iv$iv2;
        if (r26.invoke(it).booleanValue() == false) goto L16;
        Iterable list$iv$iv2 = CollectionsKt.listOf(new ViewInfo(it.getFileName(), it.getLineNumber(), it.getBounds(), it.getLocation(), acceptedNodes, it.getLayoutInfo()));
    L17:
        CollectionsKt.addAll(destination$iv$iv, list$iv$iv2);
        list$iv$iv = $this$flatMap$iv4;
        goto L4
    L16:
        list$iv$iv2 = CollectionsKt.listOf(new ViewInfo("<root>", -1, IntRect.Companion.getZero(), null, acceptedNodes, null));
        goto L17
    L19:
        return (List) destination$iv$iv;
    }

    public static /* synthetic */ String toDebugString$default(List r0, int r1, C06681 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = C06681.INSTANCE;
    L9:
        return toDebugString(r0, r1, r2);
    }

    public static final String toDebugString(List<ViewInfo> r16, int indentation, Function1<? super ViewInfo, Boolean> r18) {
        String indentString = StringsKt.repeat(".", indentation);
        StringBuilder builder = new StringBuilder();
        Iterable $this$forEach$iv = CollectionsKt.sortedWith(filterTree(r16, r18), ComparisonsKt.compareBy(new Function1[]{AnonymousClass2.INSTANCE, AnonymousClass3.INSTANCE, AnonymousClass4.INSTANCE}));
        Iterator r7 = $this$forEach$iv.iterator();
    L4:
        if (r7.hasNext() == false) goto L17;
        Object element$iv = r7.next();
        ViewInfo it = (ViewInfo) element$iv;
        if (it.getLocation() == null) goto L8;
        StringBuilder r8 = builder.append(indentString + '|' + it.getFileName() + ':' + it.getLineNumber());
        Intrinsics.checkNotNullExpressionValue(r8, "append(...)");
        Intrinsics.checkNotNullExpressionValue(r8.append('\n'), "append(...)");
    L9:
        String childrenString = StringsKt.trim(toDebugString(it.getChildren(), indentation + 1, r18)).toString();
        if (childrenString.length() <= 0) goto L12;
        boolean r13 = true;
    L13:
        if (r13 == false) goto L4;
        StringBuilder r14 = builder.append(childrenString);
        Intrinsics.checkNotNullExpressionValue(r14, "append(...)");
        Intrinsics.checkNotNullExpressionValue(r14.append('\n'), "append(...)");
        goto L4
    L12:
        r13 = false;
        goto L13
    L8:
        StringBuilder r9 = builder.append(indentString + "|<root>");
        Intrinsics.checkNotNullExpressionValue(r9, "append(...)");
        Intrinsics.checkNotNullExpressionValue(r9.append('\n'), "append(...)");
        goto L9
    L17:
        return builder.toString();
    }
}
