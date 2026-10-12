package androidx.compose.ui.tooling;

import androidx.compose.ui.layout.LayoutInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: ShadowViewInfo.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"stitchTrees", "", "Landroidx/compose/ui/tooling/ViewInfo;", "allViewInfoRoots", "ui-tooling_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ShadowViewInfo_androidKt {
    public static final List<ViewInfo> stitchTrees(List<ViewInfo> r15) {
        if (r15.size() >= 2) goto L5;
        return r15;
    L5:
        List<ViewInfo> $this$map$iv = r15;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        Iterator r6 = $this$map$iv.iterator();
    L7:
        if (r6.hasNext() == false) goto L9;
        Object item$iv$iv = r6.next();
        ViewInfo it = (ViewInfo) item$iv$iv;
        destination$iv$iv.add(new ShadowViewInfo(it));
        goto L7
    L9:
        Iterable shadowTreeRoots = (List) destination$iv$iv;
        Iterable $this$flatMap$iv = shadowTreeRoots;
        Collection destination$iv$iv2 = new ArrayList();
        Iterator r7 = $this$flatMap$iv.iterator();
    L11:
        if (r7.hasNext() == false) goto L13;
        ShadowViewInfo it2 = (ShadowViewInfo) r7.next();
        CollectionsKt.addAll(destination$iv$iv2, it2.getAllNodes());
        goto L11
    L13:
        Iterable $this$map$iv2 = (List) destination$iv$iv2;
        Collection destination$iv$iv3 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv2, 10));
        Iterator r8 = $this$map$iv2.iterator();
    L15:
        if (r8.hasNext() == false) goto L17;
        Object item$iv$iv2 = r8.next();
        ShadowViewInfo it3 = (ShadowViewInfo) item$iv$iv2;
        destination$iv$iv3.add(TuplesKt.to(it3.getLayoutInfo(), it3));
        goto L15
    L17:
        Iterable $this$filter$iv = (List) destination$iv$iv3;
        Collection destination$iv$iv4 = new ArrayList();
        Iterator r9 = $this$filter$iv.iterator();
    L19:
        if (r9.hasNext() == false) goto L26;
        Object element$iv$iv = r9.next();
        Pair it4 = (Pair) element$iv$iv;
        if (it4.getFirst() == null) goto L23;
        boolean r11 = true;
    L24:
        if (r11 == false) goto L19;
        destination$iv$iv4.add(element$iv$iv);
        goto L19
    L23:
        r11 = false;
        goto L24
    L26:
        Iterable $this$groupBy$iv = (List) destination$iv$iv4;
        final Map destination$iv$iv5 = new LinkedHashMap();
        Iterator r10 = $this$groupBy$iv.iterator();
    L28:
        if (r10.hasNext() == false) goto L34;
        Object element$iv$iv2 = r10.next();
        Pair it5 = (Pair) element$iv$iv2;
        LayoutInfo r12 = (LayoutInfo) it5.getFirst();
        Object value$iv$iv$iv = destination$iv$iv5.get(r12);
        if (value$iv$iv$iv != null) goto L32;
        ArrayList answer$iv$iv$iv = new ArrayList();
        destination$iv$iv5.put(r12, answer$iv$iv$iv);
    L33:
        List list$iv$iv = (List) answer$iv$iv$iv;
        list$iv$iv.add(element$iv$iv2);
        goto L28
    L32:
        answer$iv$iv$iv = value$iv$iv$iv;
        goto L33
    L34:
        LinkedHashSet currentRoots = new LinkedHashSet((Collection) shadowTreeRoots);
        Iterable $this$forEach$iv = shadowTreeRoots;
        Iterator r13 = $this$forEach$iv.iterator();
    L36:
        if (r13.hasNext() == false) goto L41;
        Object element$iv = r13.next();
        final ShadowViewInfo rootToAttach = (ShadowViewInfo) element$iv;
        ShadowViewInfo nodeToAttachTo = (ShadowViewInfo) SequencesKt.firstOrNull(SequencesKt.map(SequencesKt.filter(SequencesKt.flatMapIterable(rootToAttach.getAllNodes(), new ShadowViewInfo_androidKt$stitchTrees$1$1(destination$iv$iv5)), new ShadowViewInfo_androidKt$stitchTrees$1$2(rootToAttach)), ShadowViewInfo_androidKt$stitchTrees$1$3.INSTANCE));
        if (nodeToAttachTo == null) goto L36;
        rootToAttach.setNewParent(nodeToAttachTo);
        currentRoots.remove(rootToAttach);
        goto L36
    L41:
        LinkedHashSet $this$map$iv3 = currentRoots;
        Collection destination$iv$iv6 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv3, 10));
        Iterator r14 = $this$map$iv3.iterator();
    L43:
        if (r14.hasNext() == false) goto L45;
        Object item$iv$iv3 = r14.next();
        ShadowViewInfo it6 = (ShadowViewInfo) item$iv$iv3;
        destination$iv$iv6.add(it6.toViewInfo());
        goto L43
    L45:
        List newTree = (List) destination$iv$iv6;
        return newTree;
    }
}
