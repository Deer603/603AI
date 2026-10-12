package androidx.compose.ui.platform;

import android.content.res.Resources;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.ui.R;
import androidx.compose.ui.contentcapture.ContentCaptureManager;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002\u001aR\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000b2\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u001dj\b\u0012\u0004\u0012\u00020\u000b`\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0!0 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002\u001a\u0010\u0010%\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u000bH\u0002\u001a\u001a\u0010&\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002\u001a\u0012\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010\u0016\u001a\u00020\u000bH\u0002\u001a\u0018\u0010)\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002\u001aL\u0010*\u001a\u00020\u00012:\u0010+\u001a6\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020-\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0!0,0\u001dj\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020-\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0!0,`\u001e2\u0006\u0010\u0016\u001a\u00020\u000bH\u0002\u001a.\u0010.\u001a\u00020\u001a2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002002\u0006\u0010\u0017\u001a\u00020\u0018H\u0002\u001aL\u00102\u001a\b\u0012\u0004\u0012\u00020\u000b0!2\u0006\u00103\u001a\u00020\u00012\u0016\u00104\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u001dj\b\u0012\u0004\u0012\u00020\u000b`\u001e2\u0006\u0010\u0017\u001a\u00020\u00182\u0014\b\u0002\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0!0 H\u0002\u001a:\u00106\u001a\b\u0012\u0004\u0012\u00020\u000b0!2\u0006\u00103\u001a\u00020\u00012\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000b082\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002\u001a\u001a\u00109\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0002\u001a\f\u0010=\u001a\u00020\u0001*\u00020\u000bH\u0002\u001a\f\u0010>\u001a\u00020\u0001*\u00020\u000bH\u0002\u001a\"\u0010?\u001a\u0004\u0018\u00010@*\u00020@2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u00010BH\u0002\u001a\u0014\u0010C\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010D\u001a\u00020EH\u0002\"*\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0000\u001a\u00020\u00018G@GX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\" \u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000\"&\u0010\r\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b0\u000fj\b\u0012\u0004\u0012\u00020\u000b`\u00100\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011\"\u0018\u0010\u0012\u001a\u00020\u0001*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006F"}, d2 = {"value", "", "DisableContentCapture", "getDisableContentCapture$annotations", "()V", "getDisableContentCapture", "()Z", "setDisableContentCapture", "(Z)V", "UnmergedConfigComparator", "Lkotlin/Function2;", "Landroidx/compose/ui/semantics/SemanticsNode;", "", "semanticComparators", "", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "[Ljava/util/Comparator;", "isRtl", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "createStateDescriptionForTextField", "", "node", "resources", "Landroid/content/res/Resources;", "geometryDepthFirstSearch", "", "currNode", "geometryList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "containerMapToChildren", "Landroidx/collection/MutableIntObjectMap;", "", "currentSemanticsNodes", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "getInfoIsCheckable", "getInfoStateDescriptionOrNull", "getInfoText", "Landroidx/compose/ui/text/AnnotatedString;", "isScreenReaderFocusable", "placedEntryRowOverlaps", "rowGroupings", "Lkotlin/Pair;", "Landroidx/compose/ui/geometry/Rect;", "setTraversalValues", "outputBeforeMap", "Landroidx/collection/MutableIntIntMap;", "outputAfterMap", "sortByGeometryGroupings", "layoutIsRtl", "parentListToSort", "containerChildrenMapping", "subtreeSortedByGeometryGrouping", "listToSort", "", "accessibilityEquals", "Landroidx/compose/ui/semantics/AccessibilityAction;", "other", "", "enabled", "excludeLineAndPageGranularities", "findClosestParentNode", "Landroidx/compose/ui/node/LayoutNode;", "selector", "Lkotlin/Function1;", "propertiesDeleted", "oldConfig", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt {
    private static final Function2<SemanticsNode, SemanticsNode, Integer> UnmergedConfigComparator = null;
    private static final Comparator<SemanticsNode>[] semanticComparators = null;

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[ToggleableState.values().length];
            r0[ToggleableState.On.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L14:
            r0[ToggleableState.Off.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L16:
            r0[ToggleableState.Indeterminate.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L12:
            $EnumSwitchMapping$0 = r0;
        }
    }

    public static final /* synthetic */ boolean access$accessibilityEquals(AccessibilityAction $receiver, Object other) {
        return accessibilityEquals($receiver, other);
    }

    public static final /* synthetic */ boolean access$enabled(SemanticsNode $receiver) {
        return enabled($receiver);
    }

    public static final /* synthetic */ boolean access$excludeLineAndPageGranularities(SemanticsNode $receiver) {
        return excludeLineAndPageGranularities($receiver);
    }

    public static final /* synthetic */ LayoutNode access$findClosestParentNode(LayoutNode $receiver, Function1 selector) {
        return findClosestParentNode($receiver, selector);
    }

    public static final /* synthetic */ boolean access$getInfoIsCheckable(SemanticsNode node) {
        return getInfoIsCheckable(node);
    }

    public static final /* synthetic */ String access$getInfoStateDescriptionOrNull(SemanticsNode node, Resources resources) {
        return getInfoStateDescriptionOrNull(node, resources);
    }

    public static final /* synthetic */ AnnotatedString access$getInfoText(SemanticsNode node) {
        return getInfoText(node);
    }

    public static final /* synthetic */ boolean access$isRtl(SemanticsNode $receiver) {
        return isRtl($receiver);
    }

    public static final /* synthetic */ boolean access$isScreenReaderFocusable(SemanticsNode node, Resources resources) {
        return isScreenReaderFocusable(node, resources);
    }

    public static final /* synthetic */ boolean access$propertiesDeleted(SemanticsNode $receiver, SemanticsConfiguration oldConfig) {
        return propertiesDeleted($receiver, oldConfig);
    }

    public static final /* synthetic */ void access$setTraversalValues(IntObjectMap currentSemanticsNodes, MutableIntIntMap outputBeforeMap, MutableIntIntMap outputAfterMap, Resources resources) {
        setTraversalValues(currentSemanticsNodes, outputBeforeMap, outputAfterMap, resources);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use ContentCapture.isEnabled instead", replaceWith = @ReplaceWith(expression = "!ContentCaptureManager.isEnabled", imports = {"androidx.compose.ui.contentcapture.ContentCaptureManager.Companion.isEnabled"}))
    public static /* synthetic */ void getDisableContentCapture$annotations() {
    }

    private static final LayoutNode findClosestParentNode(LayoutNode $this$findClosestParentNode, Function1<? super LayoutNode, Boolean> r3) {
        LayoutNode currentParent = $this$findClosestParentNode.getParent$ui_release();
    L3:
        if (currentParent == null) goto L8;
        if (r3.invoke(currentParent).booleanValue() == true) goto L6;
        currentParent = currentParent.getParent$ui_release();
        goto L3
    L6:
        return currentParent;
    L8:
        return null;
    }

    static {
        Comparator<SemanticsNode>[] r1 = new Comparator[2];
        int r2 = 0;
    L3:
        if (r2 >= 2) goto L8;
        if (r2 != 0) goto L6;
        Comparator r3 = RtlBoundsComparator.INSTANCE;
    L7:
        final Comparator comparator = r3;
        final Comparator<LayoutNode> r4 = LayoutNode.Companion.getZComparator$ui_release();
        final Comparator r5 = new AndroidComposeViewAccessibilityDelegateCompat_androidKt$special$$inlined$thenBy$1(comparator, r4);
        r1[r2] = new AndroidComposeViewAccessibilityDelegateCompat_androidKt$special$$inlined$thenBy$2(r5);
        r2 = r2 + 1;
        goto L3
    L6:
        r3 = LtrBoundsComparator.INSTANCE;
        goto L7
    L8:
        semanticComparators = r1;
        UnmergedConfigComparator = AndroidComposeViewAccessibilityDelegateCompat_androidKt$UnmergedConfigComparator$1.INSTANCE;
    }

    private static final void setTraversalValues(IntObjectMap<SemanticsNodeWithAdjustedBounds> r7, MutableIntIntMap outputBeforeMap, MutableIntIntMap outputAfterMap, Resources resources) {
        outputBeforeMap.clear();
        outputAfterMap.clear();
        SemanticsNodeWithAdjustedBounds r0 = r7.get(-1);
        if (r0 == null) goto L5;
        SemanticsNode hostSemanticsNode = r0.getSemanticsNode();
    L6:
        Intrinsics.checkNotNull(hostSemanticsNode);
        boolean hostLayoutIsRtl = isRtl(hostSemanticsNode);
        List<SemanticsNode> r2 = subtreeSortedByGeometryGrouping(hostLayoutIsRtl, CollectionsKt.listOf(hostSemanticsNode), r7, resources);
        int i = 1;
        int r4 = CollectionsKt.getLastIndex(r2);
        if (1 > r4) goto L11;
    L8:
        int prevId = r2.get(i - 1).getId();
        int currId = r2.get(i).getId();
        outputBeforeMap.set(prevId, currId);
        outputAfterMap.set(currId, prevId);
        if (i == r4) goto L13;
        i = i + 1;
        goto L8
    L13:
        return;
    L11:
        return;
    L5:
        hostSemanticsNode = null;
        goto L6
    }

    private static final List<SemanticsNode> subtreeSortedByGeometryGrouping(boolean layoutIsRtl, List<SemanticsNode> r10, IntObjectMap<SemanticsNodeWithAdjustedBounds> r11, Resources resources) {
        MutableIntObjectMap containerMapToChildren = IntObjectMapKt.mutableIntObjectMapOf();
        ArrayList geometryList = new ArrayList();
        int index$iv = 0;
        int r5 = r10.size();
    L3:
        if (index$iv >= r5) goto L6;
        Object item$iv = r10.get(index$iv);
        SemanticsNode node = (SemanticsNode) item$iv;
        geometryDepthFirstSearch(node, geometryList, containerMapToChildren, r11, resources);
        index$iv = index$iv + 1;
        goto L3
    L6:
        return sortByGeometryGroupings(layoutIsRtl, geometryList, resources, containerMapToChildren);
    }

    private static final void geometryDepthFirstSearch(SemanticsNode currNode, ArrayList<SemanticsNode> r10, MutableIntObjectMap<List<SemanticsNode>> r11, IntObjectMap<SemanticsNodeWithAdjustedBounds> r12, Resources resources) {
        boolean currRTL = isRtl(currNode);
        boolean isTraversalGroup = ((Boolean) currNode.getUnmergedConfig$ui_release().getOrElse(SemanticsProperties.INSTANCE.getIsTraversalGroup(), AndroidComposeViewAccessibilityDelegateCompat_androidKt$geometryDepthFirstSearch$isTraversalGroup$1.INSTANCE)).booleanValue();
        if (isTraversalGroup == true) goto L7;
        if (isScreenReaderFocusable(currNode, resources) == true) goto L7;
    L9:
        if (isTraversalGroup == false) goto L11;
        r11.set(currNode.getId(), subtreeSortedByGeometryGrouping(currRTL, currNode.getChildren(), r12, resources));
        return;
    L11:
        List<SemanticsNode> r2 = currNode.getChildren();
        int index$iv = 0;
        int r5 = r2.size();
    L12:
        if (index$iv >= r5) goto L17;
        Object item$iv = r2.get(index$iv);
        SemanticsNode child = (SemanticsNode) item$iv;
        geometryDepthFirstSearch(child, r10, r11, r12, resources);
        index$iv = index$iv + 1;
        goto L12
    L17:
        return;
    L7:
        if (r12.containsKey(currNode.getId()) == false) goto L9;
        r10.add(currNode);
        goto L9
    }

    static /* synthetic */ List sortByGeometryGroupings$default(boolean r0, ArrayList r1, Resources r2, MutableIntObjectMap r3, int r4, Object r5) {
        if ((r4 & 8) == 0) goto L6;
        r3 = IntObjectMapKt.mutableIntObjectMapOf();
    L6:
        return sortByGeometryGroupings(r0, r1, r2, r3);
    }

    private static final List<SemanticsNode> sortByGeometryGroupings(boolean r11, ArrayList<SemanticsNode> r12, Resources r13, MutableIntObjectMap<List<SemanticsNode>> r14) {
        ArrayList r0 = new ArrayList(r12.size() / 2);
        int r1 = 0;
        int r2 = CollectionsKt.getLastIndex(r12);
        if (0 > r2) goto L11;
    L4:
        SemanticsNode r3 = r12.get(r1);
        if (r1 != 0) goto L7;
    L8:
        r0.add(new Pair(r3.getBoundsInWindow(), CollectionsKt.mutableListOf(new SemanticsNode[]{r3})));
    L9:
        if (r1 == r2) goto L11;
        r1 = r1 + 1;
        goto L4
    L7:
        if (placedEntryRowOverlaps(r0, r3) == true) goto L9;
    L11:
        CollectionsKt.sortWith(r0, TopBottomBoundsComparator.INSTANCE);
        ArrayList r4 = new ArrayList();
        Comparator<SemanticsNode> r5 = semanticComparators[!r11 ? 1 : 0];
        ArrayList r6 = r0;
        int r7 = 0;
        int r8 = r6.size();
    L12:
        if (r7 >= r8) goto L14;
        Pair r9 = (Pair) r6.get(r7);
        CollectionsKt.sortWith((List) r9.getSecond(), r5);
        r4.addAll((Collection) r9.getSecond());
        r7 = r7 + 1;
        goto L12
    L14:
        final Function2<SemanticsNode, SemanticsNode, Integer> r10 = UnmergedConfigComparator;
        CollectionsKt.sortWith(r4, new AndroidComposeViewAccessibilityDelegateCompat_androidKt$$ExternalSyntheticLambda0(r10));
        int r15 = 0;
    L16:
        if (r15 > CollectionsKt.getLastIndex(r4)) goto L26;
        List<SemanticsNode> r16 = r14.get(((SemanticsNode) r4.get(r15)).getId());
        if (r16 != null) goto L20;
        r15 = r15 + 1;
        goto L16
    L20:
        if (isScreenReaderFocusable((SemanticsNode) r4.get(r15), r13) == true) goto L22;
        r4.remove(r15);
    L23:
        r4.addAll(r15, r16);
        r15 = r15 + r16.size();
        goto L16
    L22:
        r15 = r15 + 1;
        goto L23
    L26:
        return r4;
    }

    static final int sortByGeometryGroupings$lambda$5(Function2 $tmp0, Object p0, Object p1) {
        return ((Number) $tmp0.invoke(p0, p1)).intValue();
    }

    private static final boolean isScreenReaderFocusable(SemanticsNode node, Resources resources) {
        List r0 = (List) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getContentDescription());
        if (r0 == null) goto L5;
        String nodeContentDescriptionOrNull = (String) CollectionsKt.firstOrNull(r0);
    L7:
        if (nodeContentDescriptionOrNull == null) goto L9;
    L16:
        boolean isSpeakingNode = true;
    L18:
        if (SemanticsUtils_androidKt.isHidden(node) == false) goto L20;
        return false;
    L20:
        if (node.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants() == true) goto L26;
        if (node.isUnmergedLeafNode$ui_release() == false) goto L28;
        if (isSpeakingNode == true) goto L26;
        return false;
    L28:
        return false;
    L26:
        return true;
    L9:
        if (getInfoText(node) != null) goto L16;
        if (getInfoStateDescriptionOrNull(node, resources) != null) goto L16;
        if (getInfoIsCheckable(node) == true) goto L16;
        isSpeakingNode = false;
        goto L18
    L5:
        nodeContentDescriptionOrNull = null;
        goto L7
    }

    private static final AnnotatedString getInfoText(SemanticsNode node) {
        AnnotatedString editableTextToAssign = (AnnotatedString) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getEditableText());
        List r1 = (List) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getText());
        if (r1 == null) goto L5;
        AnnotatedString textToAssign = (AnnotatedString) CollectionsKt.firstOrNull(r1);
    L6:
        if (editableTextToAssign != null) goto L9;
        return textToAssign;
    L9:
        return editableTextToAssign;
    L5:
        textToAssign = null;
        goto L6
    }

    private static final String getInfoStateDescriptionOrNull(SemanticsNode node, Resources resources) {
        Object stateDescription = SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getStateDescription());
        ToggleableState toggleState = (ToggleableState) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getToggleableState());
        Role role = (Role) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getRole());
        int percent = 0;
        if (toggleState != null) goto L5;
    L24:
        Boolean r5 = (Boolean) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getSelected());
        if (r5 == null) goto L37;
        boolean it = r5.booleanValue();
        int r7 = Role.Companion.m6188getTabo7Vup1c();
        if (role != null) goto L29;
        boolean r8 = false;
    L30:
        if (r8 == true) goto L37;
        if (stateDescription != null) goto L37;
        if (it == false) goto L34;
        Object r9 = resources.getString(R.string.selected);
    L35:
        stateDescription = r9;
        goto L37
    L34:
        r9 = resources.getString(R.string.not_selected);
        goto L35
    L29:
        r8 = Role.m6177equalsimpl0(role.m6180unboximpl(), r7);
    L37:
        ProgressBarRangeInfo rangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getProgressBarRangeInfo());
        if (rangeInfo == null) goto L72;
        if (rangeInfo == ProgressBarRangeInfo.Companion.getIndeterminate()) goto L68;
        if (stateDescription != null) goto L72;
        ClosedFloatingPointRange<Float> r10 = rangeInfo.getRange();
        if ((r10.getEndInclusive().floatValue() - r10.getStart().floatValue()) != 0.0f) goto L45;
        boolean r11 = true;
    L46:
        if (r11 == false) goto L48;
        float $this$fastCoerceIn$iv = 0.0f;
    L49:
        float $this$fastCoerceAtLeast$iv$iv = $this$fastCoerceIn$iv;
        if ($this$fastCoerceAtLeast$iv$iv >= 0.0f) goto L53;
        $this$fastCoerceAtLeast$iv$iv = 0.0f;
    L53:
        if ($this$fastCoerceAtLeast$iv$iv <= 1.0f) goto L56;
        $this$fastCoerceAtLeast$iv$iv = 1.0f;
    L56:
        if ($this$fastCoerceAtLeast$iv$iv != 0.0f) goto L58;
        boolean r12 = true;
    L59:
        if (r12 == false) goto L62;
    L67:
        stateDescription = resources.getString(R.string.template_percent, new Object[]{Integer.valueOf(percent)});
        goto L72
    L62:
        if ($this$fastCoerceAtLeast$iv$iv != 1.0f) goto L64;
        percent = 1;
    L64:
        if (percent == 0) goto L66;
        percent = 100;
        goto L67
    L66:
        float $this$fastRoundToInt$iv = 100.0f * $this$fastCoerceAtLeast$iv$iv;
        percent = RangesKt.coerceIn(Math.round($this$fastRoundToInt$iv), 1, 99);
        goto L67
    L58:
        r12 = false;
        goto L59
    L48:
        $this$fastCoerceIn$iv = (rangeInfo.getCurrent() - r10.getStart().floatValue()) / (r10.getEndInclusive().floatValue() - r10.getStart().floatValue());
        goto L49
    L45:
        r11 = false;
        goto L46
    L68:
        if (stateDescription != null) goto L72;
        stateDescription = resources.getString(R.string.in_progress);
    L72:
        if (node.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getEditableText()) == false) goto L75;
        stateDescription = createStateDescriptionForTextField(node, resources);
    L75:
        return (String) stateDescription;
    L5:
        switch(WhenMappings.$EnumSwitchMapping$0[toggleState.ordinal()]) {
            case 1: goto L16;
            case 2: goto L9;
            case 3: goto L7;
            default: goto L24;
        };
    L7:
        if (stateDescription != null) goto L24;
        stateDescription = resources.getString(R.string.indeterminate);
        goto L24
    L9:
        int r13 = Role.Companion.m6187getSwitcho7Vup1c();
        if (role != null) goto L12;
        boolean r14 = false;
    L13:
        if (r14 == false) goto L24;
        if (stateDescription != null) goto L24;
        stateDescription = resources.getString(R.string.state_off);
        goto L24
    L12:
        r14 = Role.m6177equalsimpl0(role.m6180unboximpl(), r13);
        goto L13
    L16:
        int r15 = Role.Companion.m6187getSwitcho7Vup1c();
        if (role != null) goto L19;
        boolean r16 = false;
    L20:
        if (r16 == false) goto L24;
        if (stateDescription != null) goto L24;
        stateDescription = resources.getString(R.string.state_on);
        goto L24
    L19:
        r16 = Role.m6177equalsimpl0(role.m6180unboximpl(), r15);
        goto L20
    }

    private static final String createStateDescriptionForTextField(SemanticsNode node, Resources resources) {
        SemanticsConfiguration mergedConfig = node.copyWithMergingEnabled$ui_release().getConfig();
        Collection r1 = (Collection) SemanticsConfigurationKt.getOrNull(mergedConfig, SemanticsProperties.INSTANCE.getContentDescription());
        boolean mergedNodeIsUnspeakable = false;
        if (r1 != null) goto L5;
    L8:
        boolean r2 = true;
    L9:
        if (r2 == false) goto L29;
        Collection r3 = (Collection) SemanticsConfigurationKt.getOrNull(mergedConfig, SemanticsProperties.INSTANCE.getText());
        if (r3 != null) goto L13;
    L16:
        boolean r4 = true;
    L17:
        if (r4 == false) goto L29;
        CharSequence r5 = (CharSequence) SemanticsConfigurationKt.getOrNull(mergedConfig, SemanticsProperties.INSTANCE.getEditableText());
        if (r5 != null) goto L21;
    L24:
        boolean r6 = true;
    L25:
        if (r6 == false) goto L29;
        mergedNodeIsUnspeakable = true;
        goto L29
    L21:
        if (r5.length() == 0) goto L24;
        r6 = false;
        goto L25
    L13:
        if (r3.isEmpty() == true) goto L16;
        r4 = false;
    L29:
        if (mergedNodeIsUnspeakable == true) goto L33;
        return null;
    L33:
        return resources.getString(R.string.state_empty);
    L5:
        if (r1.isEmpty() == true) goto L8;
        r2 = false;
        goto L9
    }

    private static final boolean getInfoIsCheckable(SemanticsNode node) {
        boolean isCheckable = false;
        ToggleableState toggleState = (ToggleableState) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getToggleableState());
        Role role = (Role) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getRole());
        if (toggleState == null) goto L5;
        isCheckable = true;
    L5:
        Boolean r3 = (Boolean) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getSelected());
        if (r3 == null) goto L14;
        r3.booleanValue();
        int r5 = Role.Companion.m6188getTabo7Vup1c();
        if (role != null) goto L10;
        boolean r6 = false;
    L11:
        if (r6 == true) goto L16;
        return true;
    L16:
        return isCheckable;
    L10:
        r6 = Role.m6177equalsimpl0(role.m6180unboximpl(), r5);
        goto L11
    L14:
        return isCheckable;
    }

    private static final boolean placedEntryRowOverlaps(ArrayList<Pair<Rect, List<SemanticsNode>>> r11, SemanticsNode node) {
        float entryTopCoord = node.getBoundsInWindow().getTop();
        float entryBottomCoord = node.getBoundsInWindow().getBottom();
        if (entryTopCoord < entryBottomCoord) goto L5;
        boolean entryIsEmpty = true;
    L6:
        int currIndex = 0;
        int r6 = CollectionsKt.getLastIndex(r11);
        if (0 > r6) goto L24;
    L8:
        Rect currRect = r11.get(currIndex).getFirst();
        if (currRect.getTop() < currRect.getBottom()) goto L11;
        boolean groupIsEmpty = true;
    L12:
        if (entryIsEmpty == true) goto L17;
        if (groupIsEmpty == true) goto L17;
        if (Math.max(entryTopCoord, currRect.getTop()) >= Math.min(entryBottomCoord, currRect.getBottom())) goto L17;
        boolean groupOverlapsEntry = true;
    L19:
        if (groupOverlapsEntry == true) goto L20;
        if (currIndex == r6) goto L24;
        currIndex = currIndex + 1;
        goto L8
    L20:
        Rect newRect = currRect.intersect(0.0f, entryTopCoord, Float.POSITIVE_INFINITY, entryBottomCoord);
        r11.set(currIndex, new Pair(newRect, r11.get(currIndex).getSecond()));
        r11.get(currIndex).getSecond().add(node);
        return true;
    L17:
        groupOverlapsEntry = false;
        goto L19
    L11:
        groupIsEmpty = false;
    L24:
        return false;
    L5:
        entryIsEmpty = false;
        goto L6
    }

    private static final boolean enabled(SemanticsNode $this$enabled) {
        return !$this$enabled.getConfig().contains(SemanticsProperties.INSTANCE.getDisabled());
    }

    private static final boolean propertiesDeleted(SemanticsNode $this$propertiesDeleted, SemanticsConfiguration oldConfig) {
        Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> r0 = oldConfig.iterator();
    L4:
        if (r0.hasNext() == false) goto L9;
        Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object> r1 = r0.next();
        if ($this$propertiesDeleted.getConfig().contains(r1.getKey()) == true) goto L4;
        return true;
    L9:
        return false;
    }

    private static final boolean isRtl(SemanticsNode $this$isRtl) {
        if ($this$isRtl.getLayoutInfo().getLayoutDirection() != LayoutDirection.Rtl) goto L5;
        return true;
    L5:
        return false;
    }

    private static final boolean excludeLineAndPageGranularities(SemanticsNode $this$excludeLineAndPageGranularities) {
        if ($this$excludeLineAndPageGranularities.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getEditableText()) == true) goto L5;
    L7:
        LayoutNode ancestor = findClosestParentNode($this$excludeLineAndPageGranularities.getLayoutNode$ui_release(), AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1.INSTANCE);
        if (ancestor == null) goto L16;
        SemanticsConfiguration r4 = ancestor.getSemanticsConfiguration();
        if (r4 == null) goto L12;
        boolean r2 = Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(r4, SemanticsProperties.INSTANCE.getFocused()), true);
    L13:
        if (r2 == true) goto L16;
        return true;
    L12:
        r2 = false;
    L16:
        return false;
    L5:
        if (Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull($this$excludeLineAndPageGranularities.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getFocused()), true) == true) goto L7;
        return true;
    }

    private static final boolean accessibilityEquals(AccessibilityAction<?> r4, Object other) {
        if (r4 != other) goto L6;
        return true;
    L6:
        if ((other instanceof AccessibilityAction) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.areEqual(r4.getLabel(), ((AccessibilityAction) other).getLabel()) == true) goto L12;
        return false;
    L12:
        if (r4.getAction() != null) goto L17;
        if (((AccessibilityAction) other).getAction() == null) goto L17;
        return false;
    L17:
        if (r4.getAction() != null) goto L19;
    L21:
        return true;
    L19:
        if (((AccessibilityAction) other).getAction() != null) goto L21;
        return false;
    }

    public static final boolean getDisableContentCapture() {
        return ContentCaptureManager.Companion.isEnabled();
    }

    public static final void setDisableContentCapture(boolean value) {
        ContentCaptureManager.Companion.setEnabled(value);
    }
}
