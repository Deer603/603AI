package androidx.compose.ui.platform.accessibility;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.CollectionItemInfo;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: CollectionInfo.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0004\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a\f\u0010\u000e\u001a\u00020\u0001*\u00020\u0007H\u0000\u001a\u0014\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010*\u00020\u0002H\u0002\u001a\u001c\u0010\u0012\u001a\n \u0011*\u0004\u0018\u00010\u00130\u0013*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007H\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\u0016"}, d2 = {"isLazyCollection", "", "Landroidx/compose/ui/semantics/CollectionInfo;", "(Landroidx/compose/ui/semantics/CollectionInfo;)Z", "calculateIfHorizontallyStacked", "items", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "setCollectionInfo", "", "node", "info", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "setCollectionItemInfo", "hasCollectionInfo", "toAccessibilityCollectionInfo", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat$CollectionInfoCompat;", "kotlin.jvm.PlatformType", "toAccessibilityCollectionItemInfo", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat$CollectionItemInfoCompat;", "Landroidx/compose/ui/semantics/CollectionItemInfo;", "itemNode", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CollectionInfo_androidKt {
    public static final void setCollectionInfo(SemanticsNode node, AccessibilityNodeInfoCompat info) {
        CollectionInfo collectionInfo = (CollectionInfo) SemanticsConfigurationKt.getOrNull(node.getConfig(), SemanticsProperties.INSTANCE.getCollectionInfo());
        if (collectionInfo == null) goto L6;
        info.setCollectionInfo(toAccessibilityCollectionInfo(collectionInfo));
        return;
    L6:
        List groupedChildren = new ArrayList();
        if (SemanticsConfigurationKt.getOrNull(node.getConfig(), SemanticsProperties.INSTANCE.getSelectableGroup()) == null) goto L16;
        List<SemanticsNode> r2 = node.getReplacedChildren$ui_release();
        int index$iv = 0;
        int r5 = r2.size();
    L9:
        if (index$iv >= r5) goto L16;
        Object item$iv = r2.get(index$iv);
        SemanticsNode childNode = (SemanticsNode) item$iv;
        if (childNode.getConfig().contains(SemanticsProperties.INSTANCE.getSelected()) == false) goto L13;
        groupedChildren.add(childNode);
    L13:
        index$iv = index$iv + 1;
    L16:
        if (groupedChildren.isEmpty() == true) goto L28;
        boolean isHorizontal = calculateIfHorizontallyStacked(groupedChildren);
        int r3 = 1;
        if (isHorizontal == false) goto L20;
        int r4 = 1;
    L21:
        if (isHorizontal == false) goto L23;
        r3 = groupedChildren.size();
    L23:
        info.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(r4, r3, false, 0));
        return;
    L20:
        r4 = groupedChildren.size();
        goto L21
    }

    public static final void setCollectionItemInfo(SemanticsNode node, AccessibilityNodeInfoCompat info) {
        CollectionItemInfo collectionItemInfo = (CollectionItemInfo) SemanticsConfigurationKt.getOrNull(node.getConfig(), SemanticsProperties.INSTANCE.getCollectionItemInfo());
        if (collectionItemInfo == null) goto L5;
        info.setCollectionItemInfo(toAccessibilityCollectionItemInfo(collectionItemInfo, node));
    L5:
        SemanticsNode parentNode = node.getParent();
        if (parentNode != null) goto L9;
        return;
    L9:
        if (SemanticsConfigurationKt.getOrNull(parentNode.getConfig(), SemanticsProperties.INSTANCE.getSelectableGroup()) == null) goto L44;
        CollectionInfo collectionInfo = (CollectionInfo) SemanticsConfigurationKt.getOrNull(parentNode.getConfig(), SemanticsProperties.INSTANCE.getCollectionInfo());
        if (collectionInfo == null) goto L16;
        if (isLazyCollection(collectionInfo) == false) goto L16;
        return;
    L16:
        if (node.getConfig().contains(SemanticsProperties.INSTANCE.getSelected()) == true) goto L18;
        return;
    L18:
        List groupedChildren = new ArrayList();
        int index = 0;
        List<SemanticsNode> r5 = parentNode.getReplacedChildren$ui_release();
        int index$iv = 0;
        int r8 = r5.size();
    L19:
        if (index$iv >= r8) goto L27;
        Object item$iv = r5.get(index$iv);
        SemanticsNode childNode = (SemanticsNode) item$iv;
        if (childNode.getConfig().contains(SemanticsProperties.INSTANCE.getSelected()) == false) goto L25;
        groupedChildren.add(childNode);
        if (childNode.getLayoutNode$ui_release().getPlaceOrder$ui_release() >= node.getLayoutNode$ui_release().getPlaceOrder$ui_release()) goto L25;
        index = index + 1;
    L25:
        index$iv = index$iv + 1;
        goto L19
    L27:
        if (groupedChildren.isEmpty() == true) goto L45;
        boolean isHorizontal = calculateIfHorizontallyStacked(groupedChildren);
        if (isHorizontal == false) goto L31;
        int r7 = 0;
    L33:
        if (isHorizontal == false) goto L35;
        int r9 = index;
    L36:
        AccessibilityNodeInfoCompat.CollectionItemInfoCompat itemInfo = AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(r7, 1, r9, 1, false, ((Boolean) node.getConfig().getOrElse(SemanticsProperties.INSTANCE.getSelected(), CollectionInfo_androidKt$setCollectionItemInfo$itemInfo$1.INSTANCE)).booleanValue());
        if (itemInfo == null) goto L46;
        info.setCollectionItemInfo(itemInfo);
        return;
    L46:
        return;
    L35:
        r9 = 0;
        goto L36
    L31:
        r7 = index;
        goto L33
    L45:
        return;
    }

    public static final boolean hasCollectionInfo(SemanticsNode $this$hasCollectionInfo) {
        if (SemanticsConfigurationKt.getOrNull($this$hasCollectionInfo.getConfig(), SemanticsProperties.INSTANCE.getCollectionInfo()) == null) goto L5;
    L8:
        return true;
    L5:
        if (SemanticsConfigurationKt.getOrNull($this$hasCollectionInfo.getConfig(), SemanticsProperties.INSTANCE.getSelectableGroup()) != null) goto L8;
        return false;
    }

    private static final boolean calculateIfHorizontallyStacked(List<SemanticsNode> r28) {
        if (r28.size() >= 2) goto L5;
        return true;
    L5:
        List<SemanticsNode> r0 = r28;
        int $i$f$fastZipWithNext = 0;
        char r7 = ' ';
        if (r0.size() > 1) goto L8;
        ArrayList deltas = CollectionsKt.emptyList();
        char r19 = ' ';
        long r21 = 4294967295L;
    L13:
        if (deltas.size() != 1) goto L15;
        long value$iv$iv$iv = ((Offset) CollectionsKt.first(deltas)).m4135unboximpl();
    L24:
        int bits$iv$iv$iv$iv = (int) (value$iv$iv$iv >> r19);
        float deltaX = Float.intBitsToFloat(bits$iv$iv$iv$iv);
        int bits$iv$iv$iv$iv2 = (int) (value$iv$iv$iv & r21);
        float deltaY = Float.intBitsToFloat(bits$iv$iv$iv$iv2);
        if (deltaY < deltaX) goto L31;
        return false;
    L31:
        return true;
    L15:
        List $this$fastReduce$iv = deltas;
        if ($this$fastReduce$iv.isEmpty() == false) goto L18;
        ListUtilsKt.throwUnsupportedOperationException("Empty collection can't be reduced.");
    L18:
        Object accumulator$iv = CollectionsKt.first($this$fastReduce$iv);
        int i$iv = 1;
        int r6 = CollectionsKt.getLastIndex($this$fastReduce$iv);
        if (1 > r6) goto L23;
    L20:
        long element = ((Offset) $this$fastReduce$iv.get(i$iv)).m4135unboximpl();
        long result = ((Offset) accumulator$iv).m4135unboximpl();
        accumulator$iv = Offset.m4114boximpl(Offset.m4130plusMKHz9U(result, element));
        if (i$iv == r6) goto L23;
        i$iv = i$iv + 1;
    L23:
        value$iv$iv$iv = ((Offset) accumulator$iv).m4135unboximpl();
        goto L24
    L8:
        deltas = new ArrayList();
        Object current$iv = r0.get(0);
        int i$iv2 = 0;
        int r10 = CollectionsKt.getLastIndex(r0);
    L9:
        if (i$iv2 >= r10) goto L11;
        Object next$iv = r0.get(i$iv2 + 1);
        SemanticsNode el2 = (SemanticsNode) next$iv;
        SemanticsNode el1 = (SemanticsNode) current$iv;
        long arg0$iv = el1.getBoundsInRoot().m4155getCenterF1C5BW0();
        int bits$iv$iv$iv = (int) (arg0$iv >> r7);
        float r4 = Float.intBitsToFloat(bits$iv$iv$iv);
        long arg0$iv2 = el2.getBoundsInRoot().m4155getCenterF1C5BW0();
        char r110 = r7;
        int bits$iv$iv$iv2 = (int) (arg0$iv2 >> r110);
        float x$iv = Math.abs(r4 - Float.intBitsToFloat(bits$iv$iv$iv2));
        long arg0$iv3 = el1.getBoundsInRoot().m4155getCenterF1C5BW0();
        List result$iv = deltas;
        int bits$iv$iv$iv3 = (int) (arg0$iv3 & 4294967295L);
        float r2 = Float.intBitsToFloat(bits$iv$iv$iv3);
        long arg0$iv4 = el2.getBoundsInRoot().m4155getCenterF1C5BW0();
        List<SemanticsNode> r16 = r0;
        int bits$iv$iv$iv4 = (int) (arg0$iv4 & 4294967295L);
        float y$iv = Math.abs(r2 - Float.intBitsToFloat(bits$iv$iv$iv4));
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        result$iv.add(Offset.m4114boximpl(Offset.m4117constructorimpl((v1$iv$iv << r110) | (v2$iv$iv & 4294967295L))));
        current$iv = next$iv;
        i$iv2 = i$iv2 + 1;
        deltas = result$iv;
        r0 = r16;
        r7 = r110;
        $i$f$fastZipWithNext = $i$f$fastZipWithNext;
        goto L9
    L11:
        r19 = r7;
        r21 = 4294967295L;
        goto L13
    }

    private static final boolean isLazyCollection(CollectionInfo $this$isLazyCollection) {
        if ($this$isLazyCollection.getRowCount() >= 0) goto L5;
    L8:
        return true;
    L5:
        if ($this$isLazyCollection.getColumnCount() < 0) goto L8;
        return false;
    }

    private static final AccessibilityNodeInfoCompat.CollectionInfoCompat toAccessibilityCollectionInfo(CollectionInfo $this$toAccessibilityCollectionInfo) {
        return AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain($this$toAccessibilityCollectionInfo.getRowCount(), $this$toAccessibilityCollectionInfo.getColumnCount(), false, 0);
    }

    private static final AccessibilityNodeInfoCompat.CollectionItemInfoCompat toAccessibilityCollectionItemInfo(CollectionItemInfo $this$toAccessibilityCollectionItemInfo, SemanticsNode itemNode) {
        return AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain($this$toAccessibilityCollectionItemInfo.getRowIndex(), $this$toAccessibilityCollectionItemInfo.getRowSpan(), $this$toAccessibilityCollectionItemInfo.getColumnIndex(), $this$toAccessibilityCollectionItemInfo.getColumnSpan(), false, ((Boolean) itemNode.getConfig().getOrElse(SemanticsProperties.INSTANCE.getSelected(), AnonymousClass1.INSTANCE)).booleanValue());
    }
}
