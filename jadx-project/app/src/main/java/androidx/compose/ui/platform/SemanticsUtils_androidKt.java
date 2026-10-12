package androidx.compose.ui.platform;

import android.graphics.Region;
import android.view.View;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: SemanticsUtils.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e\u001a\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\b\u0012\u0004\u0012\u00020\u00120\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\u001a\u0012\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017*\u00020\u0019H\u0000\u001a\f\u0010\u001a\u001a\u00020\u0005*\u00020\u0006H\u0000\u001a\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001c*\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\u001a\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001f*\u00020 H\u0000ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u001e\u0010\u0004\u001a\u00020\u0005*\u00020\u00068@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0004\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"DefaultFakeNodeBounds", "Landroidx/compose/ui/geometry/Rect;", "getDefaultFakeNodeBounds", "()Landroidx/compose/ui/geometry/Rect;", "isHidden", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "isHidden$annotations", "(Landroidx/compose/ui/semantics/SemanticsNode;)V", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "getScrollViewportLength", "", "configuration", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Ljava/lang/Float;", "getTextLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "findById", "Landroidx/compose/ui/platform/ScrollObservationScope;", "", "id", "", "getAllUncoveredSemanticsNodesToIntObjectMap", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "Landroidx/compose/ui/semantics/SemanticsOwner;", "isImportantForAccessibility", "semanticsIdToView", "Landroid/view/View;", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "toLegacyClassName", "", "Landroidx/compose/ui/semantics/Role;", "toLegacyClassName-V4PA4sw", "(I)Ljava/lang/String;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SemanticsUtils_androidKt {
    private static final Rect DefaultFakeNodeBounds = null;

    public static /* synthetic */ void isHidden$annotations(SemanticsNode r0) {
    }

    public static final TextLayoutResult getTextLayoutResult(SemanticsConfiguration configuration) {
        ArrayList r0 = new ArrayList();
        AccessibilityAction r1 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(configuration, SemanticsActions.INSTANCE.getGetTextLayoutResult());
        if (r1 == null) goto L11;
        Function1 r2 = (Function1) r1.getAction();
        if (r2 == null) goto L11;
        boolean getLayoutResult = ((Boolean) r2.invoke(r0)).booleanValue();
        if (getLayoutResult == true) goto L10;
        return null;
    L10:
        return (TextLayoutResult) r0.get(0);
    L11:
        return null;
    }

    public static final Float getScrollViewportLength(SemanticsConfiguration configuration) {
        ArrayList r0 = new ArrayList();
        AccessibilityAction r1 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(configuration, SemanticsActions.INSTANCE.getGetScrollViewportLength());
        if (r1 == null) goto L11;
        Function1 r2 = (Function1) r1.getAction();
        if (r2 == null) goto L11;
        boolean actionResult = ((Boolean) r2.invoke(r0)).booleanValue();
        if (actionResult == true) goto L10;
        return null;
    L10:
        return (Float) r0.get(0);
    L11:
        return null;
    }

    public static final ScrollObservationScope findById(List<ScrollObservationScope> r3, int id) {
        int index = 0;
        int r1 = r3.size();
    L3:
        if (index >= r1) goto L9;
        if (r3.get(index).getSemanticsNodeId() == id) goto L7;
        index = index + 1;
        goto L3
    L7:
        return r3.get(index);
    L9:
        return null;
    }

    /* JADX INFO: renamed from: toLegacyClassName-V4PA4sw, reason: not valid java name */
    public static final String m6157toLegacyClassNameV4PA4sw(int $this$toLegacyClassName_u2dV4PA4sw) {
        if (Role.m6177equalsimpl0($this$toLegacyClassName_u2dV4PA4sw, Role.Companion.m6181getButtono7Vup1c()) == false) goto L6;
        return "android.widget.Button";
    L6:
        if (Role.m6177equalsimpl0($this$toLegacyClassName_u2dV4PA4sw, Role.Companion.m6183getCheckboxo7Vup1c()) == false) goto L9;
        return "android.widget.CheckBox";
    L9:
        if (Role.m6177equalsimpl0($this$toLegacyClassName_u2dV4PA4sw, Role.Companion.m6186getRadioButtono7Vup1c()) == false) goto L12;
        return "android.widget.RadioButton";
    L12:
        if (Role.m6177equalsimpl0($this$toLegacyClassName_u2dV4PA4sw, Role.Companion.m6185getImageo7Vup1c()) == false) goto L15;
        return "android.widget.ImageView";
    L15:
        if (Role.m6177equalsimpl0($this$toLegacyClassName_u2dV4PA4sw, Role.Companion.m6184getDropdownListo7Vup1c()) == false) goto L18;
        return "android.widget.Spinner";
    L18:
        if (Role.m6177equalsimpl0($this$toLegacyClassName_u2dV4PA4sw, Role.Companion.m6189getValuePickero7Vup1c()) == false) goto L20;
        return "android.widget.NumberPicker";
    L20:
        return null;
    }

    public static final boolean isImportantForAccessibility(SemanticsNode $this$isImportantForAccessibility) {
        if (isHidden($this$isImportantForAccessibility) == false) goto L5;
    L9:
        return false;
    L5:
        if ($this$isImportantForAccessibility.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants() == false) goto L7;
    L8:
        return true;
    L7:
        if ($this$isImportantForAccessibility.getUnmergedConfig$ui_release().containsImportantForAccessibility$ui_release() == false) goto L9;
        goto L8
    }

    public static final boolean isHidden(SemanticsNode $this$isHidden) {
        if ($this$isHidden.isTransparent$ui_release() == false) goto L5;
    L10:
        return true;
    L5:
        if ($this$isHidden.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getHideFromAccessibility()) == true) goto L10;
        if ($this$isHidden.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getInvisibleToUser()) == true) goto L10;
        return false;
    }

    static {
        DefaultFakeNodeBounds = new Rect(0.0f, 0.0f, 10.0f, 10.0f);
    }

    public static final Rect getDefaultFakeNodeBounds() {
        return DefaultFakeNodeBounds;
    }

    public static final View semanticsIdToView(AndroidViewsHandler $this$semanticsIdToView, int id) {
        Iterable $this$firstOrNull$iv = $this$semanticsIdToView.getLayoutNodeToHolder().entrySet();
        Iterator r2 = $this$firstOrNull$iv.iterator();
    L3:
        AndroidViewHolder r4 = null;
        if (r2.hasNext() == false) goto L11;
        Object element$iv = r2.next();
        Map.Entry it = (Map.Entry) element$iv;
        if (((LayoutNode) it.getKey()).getSemanticsId() != id) goto L8;
        boolean r7 = true;
    L9:
        if (r7 == false) goto L3;
    L12:
        Map.Entry r3 = (Map.Entry) element$iv;
        if (r3 == null) goto L16;
        r4 = (AndroidViewHolder) r3.getValue();
    L16:
        return r4;
    L8:
        r7 = false;
        goto L9
    L11:
        element$iv = null;
        goto L12
    }

    public static final IntObjectMap<SemanticsNodeWithAdjustedBounds> getAllUncoveredSemanticsNodesToIntObjectMap(SemanticsOwner $this$getAllUncoveredSemanticsNodesToIntObjectMap) {
        SemanticsNode root = $this$getAllUncoveredSemanticsNodesToIntObjectMap.getUnmergedRootSemanticsNode();
        if (root.getLayoutNode$ui_release().isPlaced() == false) goto L10;
        if (root.getLayoutNode$ui_release().isAttached() == false) goto L10;
        MutableIntObjectMap nodes = new MutableIntObjectMap(48);
        Rect $this$getAllUncoveredSemanticsNodesToIntObjectMap_u24lambda_u241 = root.getBoundsInRoot();
        float $this$fastRoundToInt$iv = $this$getAllUncoveredSemanticsNodesToIntObjectMap_u24lambda_u241.getLeft();
        int r5 = Math.round($this$fastRoundToInt$iv);
        float $this$fastRoundToInt$iv2 = $this$getAllUncoveredSemanticsNodesToIntObjectMap_u24lambda_u241.getTop();
        int r6 = Math.round($this$fastRoundToInt$iv2);
        float $this$fastRoundToInt$iv3 = $this$getAllUncoveredSemanticsNodesToIntObjectMap_u24lambda_u241.getRight();
        int r7 = Math.round($this$fastRoundToInt$iv3);
        float $this$fastRoundToInt$iv4 = $this$getAllUncoveredSemanticsNodesToIntObjectMap_u24lambda_u241.getBottom();
        Region unaccountedSpace = new Region(r5, r6, r7, Math.round($this$fastRoundToInt$iv4));
        getAllUncoveredSemanticsNodesToIntObjectMap$findAllSemanticNodesRecursive(unaccountedSpace, root, nodes, root, new Region());
        return nodes;
    L10:
        return IntObjectMapKt.emptyIntObjectMap();
    }

    private static final void getAllUncoveredSemanticsNodesToIntObjectMap$findAllSemanticNodesRecursive(Region unaccountedSpace, SemanticsNode root, MutableIntObjectMap<SemanticsNodeWithAdjustedBounds> r23, SemanticsNode currentNode, Region region) {
        boolean r2 = false;
        if (currentNode.getLayoutNode$ui_release().isPlaced() == true) goto L5;
    L8:
        boolean r1 = true;
    L9:
        boolean notAttachedOrPlaced = r1;
        if (unaccountedSpace.isEmpty() == true) goto L12;
    L13:
        if (notAttachedOrPlaced == true) goto L15;
    L17:
        Rect touchBoundsInRoot = currentNode.getTouchBoundsInRoot();
        float $this$fastRoundToInt$iv = touchBoundsInRoot.getLeft();
        int left = Math.round($this$fastRoundToInt$iv);
        float $this$fastRoundToInt$iv2 = touchBoundsInRoot.getTop();
        int top = Math.round($this$fastRoundToInt$iv2);
        float $this$fastRoundToInt$iv3 = touchBoundsInRoot.getRight();
        int right = Math.round($this$fastRoundToInt$iv3);
        float $this$fastRoundToInt$iv4 = touchBoundsInRoot.getBottom();
        int bottom = Math.round($this$fastRoundToInt$iv4);
        region.set(left, top, right, bottom);
        if (currentNode.getId() != root.getId()) goto L20;
        int virtualViewId = -1;
    L22:
        if (region.op(unaccountedSpace, Region.Op.INTERSECT) == false) goto L35;
        r23.set(virtualViewId, new SemanticsNodeWithAdjustedBounds(currentNode, region.getBounds()));
        List<SemanticsNode> r13 = currentNode.getReplacedChildren$ui_release();
        int i = r13.size() - 1;
    L24:
        if ((-1) >= i) goto L31;
        if (r13.get(i).getConfig().contains(SemanticsProperties.INSTANCE.getLinkTestMarker()) == true) goto L29;
        getAllUncoveredSemanticsNodesToIntObjectMap$findAllSemanticNodesRecursive(unaccountedSpace, root, r23, r13.get(i), region);
    L29:
        i = i - 1;
        goto L24
    L31:
        if (isImportantForAccessibility(currentNode) == false) goto L56;
        unaccountedSpace.op(left, top, right, bottom, Region.Op.DIFFERENCE);
        return;
    L56:
        return;
    L35:
        if (currentNode.isFake$ui_release() == false) goto L48;
        SemanticsNode parentNode = currentNode.getParent();
        if (parentNode == null) goto L43;
        LayoutInfo r14 = parentNode.getLayoutInfo();
        if (r14 == null) goto L43;
        if (r14.isPlaced() != true) goto L43;
        r2 = true;
    L43:
        if (r2 == false) goto L45;
        Rect boundsForFakeNode = parentNode.getBoundsInRoot();
    L46:
        float $this$fastRoundToInt$iv5 = boundsForFakeNode.getLeft();
        int r15 = Math.round($this$fastRoundToInt$iv5);
        float $this$fastRoundToInt$iv6 = boundsForFakeNode.getTop();
        int r0 = Math.round($this$fastRoundToInt$iv6);
        float $this$fastRoundToInt$iv7 = boundsForFakeNode.getRight();
        int left2 = Math.round($this$fastRoundToInt$iv7);
        float $this$fastRoundToInt$iv8 = boundsForFakeNode.getBottom();
        r23.set(virtualViewId, new SemanticsNodeWithAdjustedBounds(currentNode, new android.graphics.Rect(r15, r0, left2, Math.round($this$fastRoundToInt$iv8))));
        return;
    L45:
        boundsForFakeNode = DefaultFakeNodeBounds;
        goto L46
    L48:
        if (virtualViewId != (-1)) goto L58;
        r23.set(virtualViewId, new SemanticsNodeWithAdjustedBounds(currentNode, region.getBounds()));
        return;
    L58:
        return;
    L20:
        virtualViewId = currentNode.getId();
        goto L22
    L15:
        if (currentNode.isFake$ui_release() == true) goto L17;
        return;
    L12:
        if (currentNode.getId() == root.getId()) goto L13;
        return;
    L5:
        if (currentNode.getLayoutNode$ui_release().isAttached() == false) goto L8;
        r1 = false;
        goto L9
    }
}
