package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSetKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: LazyLayoutItemAnimator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0003JKLB\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010(\u001a\u0004\u0018\u00010\u00072\u0006\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u000bJ1\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u000b2\u0012\b\u0002\u0010.\u001a\f0\u0010R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0002\u0010/J\u0082\u0001\u00100\u001a\u00020,2\u0006\u00101\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u000b2\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\f\u001a\u00020\r2\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u0000062\u0006\u00107\u001a\u00020#2\u0006\u00108\u001a\u00020#2\u0006\u00109\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020#2\u0006\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@J\b\u0010A\u001a\u00020,H\u0002J\u0010\u0010B\u001a\u00020,2\u0006\u0010)\u001a\u00020\u0003H\u0002J\u0006\u0010C\u001a\u00020,J\u001f\u0010D\u001a\u00020,2\u0006\u0010-\u001a\u00028\u00002\b\b\u0002\u0010E\u001a\u00020#H\u0002¢\u0006\u0002\u0010FJ\u0019\u0010G\u001a\u00020\u000b*\u00020H2\u0006\u0010-\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010IR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u000e\u0012\f0\u0010R\b\u0012\u0004\u0012\u00028\u00000\u00000\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\u00020\u00128Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001f\u001a\u00020\u000b*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0018\u0010\"\u001a\u00020#*\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0018\u0010&\u001a\u00020\u000b*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006M"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "T", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "", "()V", "disappearingItems", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "displayingNode", "Landroidx/compose/ui/node/DrawModifierNode;", "firstVisibleIndex", "", "keyIndexMap", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "keyToItemInfoMap", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;", "minSizeToFitDisappearingItems", "Landroidx/compose/ui/unit/IntSize;", "getMinSizeToFitDisappearingItems-YbymL2g", "()J", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "movingAwayKeys", "Landroidx/collection/MutableScatterSet;", "movingAwayToEndBound", "movingAwayToStartBound", "movingInFromEndBound", "movingInFromStartBound", "crossAxisOffset", "getCrossAxisOffset", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I", "hasAnimations", "", "getHasAnimations", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)Z", "mainAxisOffset", "getMainAxisOffset", "getAnimation", "key", "placeableIndex", "initializeAnimation", "", "item", "itemInfo", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;ILandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;)V", "onMeasured", "consumedScroll", "layoutWidth", "layoutHeight", "positionedItems", "itemProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;", "isVertical", "isLookingAhead", "laneCount", "hasLookaheadOccurred", "layoutMinOffset", "layoutMaxOffset", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "releaseAnimations", "removeInfoForKey", "reset", "startPlacementAnimationsIfNeeded", "isMovingAway", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;Z)V", "updateAndReturnOffsetFor", "", "([ILandroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I", "DisplayingDisappearingItemsElement", "DisplayingDisappearingItemsNode", "ItemInfo", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LazyLayoutItemAnimator<T extends LazyLayoutMeasuredItem> {
    public static final int $stable = 0;
    private final List<LazyLayoutItemAnimation> disappearingItems;
    private DrawModifierNode displayingNode;
    private int firstVisibleIndex;
    private LazyLayoutKeyIndexMap keyIndexMap;
    private final MutableScatterMap<Object, LazyLayoutItemAnimator<T>.ItemInfo> keyToItemInfoMap;
    private final Modifier modifier;
    private final MutableScatterSet<Object> movingAwayKeys;
    private final List<T> movingAwayToEndBound;
    private final List<T> movingAwayToStartBound;
    private final List<T> movingInFromEndBound;
    private final List<T> movingInFromStartBound;

    /* JADX INFO: compiled from: LazyLayoutItemAnimator.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0004HÂ\u0003J\u0017\u0010\u0007\u001a\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004HÆ\u0001J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\f\u0010\u0014\u001a\u00020\u0012*\u00020\u0015H\u0016R\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode;", "animator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "component1", "copy", "create", "equals", "", "other", "", "hashCode", "", "toString", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class DisplayingDisappearingItemsElement extends ModifierNodeElement<DisplayingDisappearingItemsNode> {
        private final LazyLayoutItemAnimator<?> animator;

        private final LazyLayoutItemAnimator<?> component1() {
            return this.animator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DisplayingDisappearingItemsElement copy$default(DisplayingDisappearingItemsElement r0, LazyLayoutItemAnimator r1, int r2, Object r3) {
            if ((r2 & 1) == 0) goto L6;
            r1 = r0.animator;
        L6:
            return r0.copy(r1);
        }

        public final DisplayingDisappearingItemsElement copy(LazyLayoutItemAnimator<?> r2) {
            return new DisplayingDisappearingItemsElement(r2);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof DisplayingDisappearingItemsElement) == true) goto L9;
            return false;
        L9:
            if (Intrinsics.areEqual(this.animator, ((DisplayingDisappearingItemsElement) r5).animator) == true) goto L11;
            return false;
        L11:
            return true;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            return this.animator.hashCode();
        }

        public String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.animator + ')';
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public /* bridge */ /* synthetic */ Modifier.Node create() {
            return create();
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public /* bridge */ /* synthetic */ void update(Modifier.Node node) {
            update((DisplayingDisappearingItemsNode) node);
        }

        public DisplayingDisappearingItemsElement(LazyLayoutItemAnimator<?> r1) {
            this.animator = r1;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public DisplayingDisappearingItemsNode create() {
            return new DisplayingDisappearingItemsNode(this.animator);
        }

        public void update(DisplayingDisappearingItemsNode node) {
            node.setAnimator(this.animator);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(InspectorInfo $this$inspectableProperties) {
            $this$inspectableProperties.setName("DisplayingDisappearingItemsElement");
        }
    }

    /* JADX INFO: compiled from: LazyLayoutItemAnimator.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0004HÂ\u0003J\u0017\u0010\u0007\u001a\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004HÆ\u0001J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0012\u0010\u0011\u001a\u00020\u000f2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\f\u0010\u0014\u001a\u00020\u000f*\u00020\u0015H\u0016R\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "animator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "component1", "copy", "equals", "", "other", "", "hashCode", "", "onAttach", "", "onDetach", "setAnimator", "toString", "", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class DisplayingDisappearingItemsNode extends Modifier.Node implements DrawModifierNode {
        private LazyLayoutItemAnimator<?> animator;

        private final LazyLayoutItemAnimator<?> component1() {
            return this.animator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DisplayingDisappearingItemsNode copy$default(DisplayingDisappearingItemsNode r0, LazyLayoutItemAnimator r1, int r2, Object r3) {
            if ((r2 & 1) == 0) goto L6;
            r1 = r0.animator;
        L6:
            return r0.copy(r1);
        }

        public final DisplayingDisappearingItemsNode copy(LazyLayoutItemAnimator<?> r2) {
            return new DisplayingDisappearingItemsNode(r2);
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof DisplayingDisappearingItemsNode) == true) goto L9;
            return false;
        L9:
            if (Intrinsics.areEqual(this.animator, ((DisplayingDisappearingItemsNode) r5).animator) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.animator.hashCode();
        }

        public String toString() {
            return "DisplayingDisappearingItemsNode(animator=" + this.animator + ')';
        }

        public DisplayingDisappearingItemsNode(LazyLayoutItemAnimator<?> r1) {
            this.animator = r1;
        }

        @Override // androidx.compose.ui.node.DrawModifierNode
        public void draw(ContentDrawScope $this$draw) {
            List $this$fastForEach$iv = LazyLayoutItemAnimator.access$getDisappearingItems$p(this.animator);
            int r4 = $this$fastForEach$iv.size();
            int index$iv = 0;
        L3:
            if (index$iv >= r4) goto L14;
            Object item$iv = $this$fastForEach$iv.get(index$iv);
            LazyLayoutItemAnimation it = (LazyLayoutItemAnimation) item$iv;
            GraphicsLayer layer = it.getLayer();
            if (layer == null) goto L10;
            float x = IntOffset.m7101getXimpl(it.m885getFinalOffsetnOccac());
            float y = IntOffset.m7102getYimpl(it.m885getFinalOffsetnOccac());
            ContentDrawScope $this$translate$iv = $this$draw;
            float left$iv = x - IntOffset.m7101getXimpl(layer.m5010getTopLeftnOccac());
            float top$iv = y - IntOffset.m7102getYimpl(layer.m5010getTopLeftnOccac());
            $this$translate$iv.getDrawContext().getTransform().translate(left$iv, top$iv);
            GraphicsLayerKt.drawLayer($this$translate$iv, layer);     // Catch: Throwable -> L11
            $this$translate$iv.getDrawContext().getTransform().translate(-left$iv, -top$iv);
        L11:
            th = move-exception;
            $this$translate$iv.getDrawContext().getTransform().translate(-left$iv, -top$iv);
            throw th;
        L10:
            index$iv = index$iv + 1;
            $this$fastForEach$iv = $this$fastForEach$iv;
            goto L3
        L14:
            $this$draw.drawContent();
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void onAttach() {
            LazyLayoutItemAnimator.access$setDisplayingNode$p(this.animator, this);
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void onDetach() {
            this.animator.reset();
        }

        public final void setAnimator(LazyLayoutItemAnimator<?> r2) {
            if (Intrinsics.areEqual(this.animator, r2) == false) goto L5;
            return;
        L5:
            if (getNode().isAttached() == false) goto L9;
            this.animator.reset();
            LazyLayoutItemAnimator.access$setDisplayingNode$p(r2, this);
            this.animator = r2;
            return;
        }
    }

    /* JADX INFO: compiled from: LazyLayoutItemAnimator.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J=\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00028\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010*R0\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001e\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u001e\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u001a\u0010 \u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0013\"\u0004\b\"\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;", "", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "<set-?>", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "animations", "getAnimations", "()[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "getConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "setConstraints-_Sx5XlM", "(Landroidx/compose/ui/unit/Constraints;)V", "crossAxisOffset", "", "getCrossAxisOffset", "()I", "setCrossAxisOffset", "(I)V", "isRunningPlacement", "", "()Z", "lane", "getLane", "setLane", "layoutMaxOffset", "getLayoutMaxOffset", "layoutMinOffset", "getLayoutMinOffset", "span", "getSpan", "setSpan", "updateAnimation", "", "positionedItem", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;III)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class ItemInfo {
        private LazyLayoutItemAnimation[] animations;
        private Constraints constraints;
        private int crossAxisOffset;
        private int lane;
        private int layoutMaxOffset;
        private int layoutMinOffset;
        private int span;
        final /* synthetic */ LazyLayoutItemAnimator<T> this$0;

        public ItemInfo(LazyLayoutItemAnimator this$0) {
            this.this$0 = this$0;
            this.animations = LazyLayoutItemAnimatorKt.access$getEmptyArray$p();
            this.span = 1;
        }

        public final LazyLayoutItemAnimation[] getAnimations() {
            return this.animations;
        }

        /* JADX INFO: renamed from: getConstraints-DWUhwKw, reason: not valid java name */
        public final Constraints m894getConstraintsDWUhwKw() {
            return this.constraints;
        }

        /* JADX INFO: renamed from: setConstraints-_Sx5XlM, reason: not valid java name */
        public final void m895setConstraints_Sx5XlM(Constraints r1) {
            this.constraints = r1;
        }

        public final int getCrossAxisOffset() {
            return this.crossAxisOffset;
        }

        public final void setCrossAxisOffset(int r1) {
            this.crossAxisOffset = r1;
        }

        public final int getLane() {
            return this.lane;
        }

        public final void setLane(int r1) {
            this.lane = r1;
        }

        public final int getSpan() {
            return this.span;
        }

        public final void setSpan(int r1) {
            this.span = r1;
        }

        private final boolean isRunningPlacement() {
            LazyLayoutItemAnimation[] r0 = this.animations;
            int r2 = r0.length;
            int r4 = 0;
        L3:
            if (r4 >= r2) goto L17;
            LazyLayoutItemAnimation r5 = r0[r4];
            if (r5 != null) goto L7;
        L9:
            boolean r6 = false;
        L10:
            if (r6 == true) goto L14;
            r4 = r4 + 1;
            goto L3
        L14:
            return true;
        L7:
            if (r5.isRunningMovingAwayAnimation() != true) goto L9;
            r6 = true;
            goto L10
        L17:
            return false;
        }

        public final int getLayoutMinOffset() {
            return this.layoutMinOffset;
        }

        public final int getLayoutMaxOffset() {
            return this.layoutMaxOffset;
        }

        public static /* synthetic */ void updateAnimation$default(ItemInfo r7, LazyLayoutMeasuredItem r8, CoroutineScope r9, GraphicsContext r10, int r11, int r12, int r13, int r14, Object r15) {
            if ((r14 & 32) == 0) goto L5;
            int r6 = LazyLayoutItemAnimator.access$getCrossAxisOffset(r7.this$0, r8);
        L6:
            r7.updateAnimation(r8, r9, r10, r11, r12, r6);
            return;
        L5:
            r6 = r13;
            goto L6
        }

        public final void updateAnimation(T r17, CoroutineScope coroutineScope, GraphicsContext graphicsContext, int layoutMinOffset, int layoutMaxOffset, int crossAxisOffset) {
            if (isRunningPlacement() == true) goto L6;
            this.layoutMinOffset = layoutMinOffset;
            this.layoutMaxOffset = layoutMaxOffset;
        L6:
            int i = r17.getPlaceablesCount();
            int r4 = this.animations.length;
        L7:
            LazyLayoutItemAnimation[] r5 = this.animations;
            if (i >= r4) goto L13;
            LazyLayoutItemAnimation r6 = r5[i];
            if (r6 == null) goto L12;
            r6.release();
        L12:
            i = i + 1;
            goto L7
        L13:
            int i2 = r5.length;
            if (i2 == r17.getPlaceablesCount()) goto L16;
            Object[] r3 = Arrays.copyOf(this.animations, r17.getPlaceablesCount());
            Intrinsics.checkNotNullExpressionValue(r3, "copyOf(...)");
            this.animations = (LazyLayoutItemAnimation[]) r3;
        L16:
            this.constraints = Constraints.m6913boximpl(r17.mo838getConstraintsmsEJaDk());
            this.crossAxisOffset = crossAxisOffset;
            this.lane = r17.getLane();
            this.span = r17.getSpan();
            int r7 = r17.getPlaceablesCount();
            final LazyLayoutItemAnimator<T> r8 = this.this$0;
            int r9 = 0;
        L17:
            if (r9 >= r7) goto L31;
            int index = r9;
            LazyLayoutAnimationSpecsNode specs = LazyLayoutItemAnimatorKt.access$getSpecs(r17.getParentData(index));
            LazyLayoutItemAnimation[] r11 = this.animations;
            if (specs != null) goto L24;
            LazyLayoutItemAnimation r12 = r11[index];
            if (r12 == null) goto L23;
            r12.release();
        L23:
            this.animations[index] = null;
        L29:
            r9 = r9 + 1;
            goto L17
        L24:
            LazyLayoutItemAnimation it = r11[index];
            if (it != null) goto L28;
            it = new LazyLayoutItemAnimation(coroutineScope, graphicsContext, new LazyLayoutItemAnimator$ItemInfo$updateAnimation$1$animation$1(r8));
            this.animations[index] = it;
        L28:
            it.setFadeInSpec(specs.getFadeInSpec());
            it.setPlacementSpec(specs.getPlacementSpec());
            it.setFadeOutSpec(specs.getFadeOutSpec());
            goto L29
        }
    }

    static {
        $stable = 8;
    }

    public LazyLayoutItemAnimator() {
        this.keyToItemInfoMap = ScatterMapKt.mutableScatterMapOf();
        this.movingAwayKeys = ScatterSetKt.mutableScatterSetOf();
        this.movingInFromStartBound = new ArrayList();
        this.movingInFromEndBound = new ArrayList();
        this.movingAwayToStartBound = new ArrayList();
        this.movingAwayToEndBound = new ArrayList();
        this.disappearingItems = new ArrayList();
        this.modifier = new DisplayingDisappearingItemsElement(this);
    }

    public static final /* synthetic */ int access$getCrossAxisOffset(LazyLayoutItemAnimator $this, LazyLayoutMeasuredItem $receiver) {
        return $this.getCrossAxisOffset($receiver);
    }

    public static final /* synthetic */ List access$getDisappearingItems$p(LazyLayoutItemAnimator $this) {
        return $this.disappearingItems;
    }

    public static final /* synthetic */ DrawModifierNode access$getDisplayingNode$p(LazyLayoutItemAnimator $this) {
        return $this.displayingNode;
    }

    public static final /* synthetic */ void access$setDisplayingNode$p(LazyLayoutItemAnimator $this, DrawModifierNode r1) {
        $this.displayingNode = r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasured(int r53, int r54, int r55, List<T> r56, final LazyLayoutKeyIndexMap r57, LazyLayoutMeasuredItemProvider<T> r58, boolean r59, boolean r60, int r61, boolean r62, int r63, int r64, CoroutineScope r65, GraphicsContext r66) {
        int r11 = r61;
        final LazyLayoutKeyIndexMap r12 = this.keyIndexMap;
        this.keyIndexMap = r57;
        int r5 = 0;
        int r13 = r56.size();
    L3:
        if (r5 >= r13) goto L8;
        if (getHasAnimations(r56.get(r5)) == true) goto L6;
        r5 = r5 + 1;
        goto L3
    L6:
        boolean r1 = true;
    L9:
        boolean r14 = r1;
        if (r14 == false) goto L12;
    L15:
        int r15 = this.firstVisibleIndex;
        LazyLayoutMeasuredItem r2 = (LazyLayoutMeasuredItem) CollectionsKt.firstOrNull(r56);
        if (r2 == null) goto L18;
        int r3 = r2.getIndex();
    L19:
        this.firstVisibleIndex = r3;
        if (r59 == false) goto L22;
        long r4 = IntOffset.m7095constructorimpl((((long) 0) << 32) | (((long) r53) & 4294967295L));
    L23:
        long r16 = r4;
        if (r60 == true) goto L28;
        if (r62 == false) goto L28;
        boolean r6 = false;
    L29:
        boolean r17 = r6;
        MutableScatterMap<Object, LazyLayoutItemAnimator<T>.ItemInfo> r7 = this.keyToItemInfoMap;
        Object[] r8 = r7.keys;
        int r9 = 0;
        long[] r10 = r7.metadata;
        int r18 = r10.length - 2;
        int r19 = 0;
        if (0 > r18) goto L51;
    L31:
        long r31 = r10[r19];
        int r36 = r9;
        if (((((~r31) << 7) & r31) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L46;
        int r20 = 8 - ((~(r19 - r18)) >>> 31);
        int r21 = 0;
    L34:
        if (r21 >= r20) goto L43;
        if ((r31 & 255) >= 128) goto L38;
        boolean r22 = true;
    L39:
        if (r22 == false) goto L42;
        this.movingAwayKeys.add(r8[(r19 << 3) + r21]);
    L42:
        r31 = r31 >> 8;
        r21 = r21 + 1;
        r10 = r10;
        goto L34
    L38:
        r22 = false;
        goto L39
    L43:
        long[] r34 = r10;
        if (r20 != 8) goto L51;
    L47:
        if (r19 == r18) goto L51;
        r19 = r19 + 1;
        r10 = r34;
        r9 = r36;
        goto L31
    L46:
        r34 = r10;
    L51:
        List<T> r23 = r56;
        int r24 = 0;
        int r25 = 0;
        int r26 = r23.size();
    L52:
        if (r25 >= r26) goto L119;
        T r27 = r23.get(r25);
        this.movingAwayKeys.remove(r27.getKey());
        if (getHasAnimations(r27) == false) goto L117;
        LazyLayoutItemAnimator<T>.ItemInfo r28 = this.keyToItemInfoMap.get(r27.getKey());
        if (r12 == null) goto L58;
        int r29 = r12.getIndex(r27.getKey());
    L60:
        if (r29 != (-1)) goto L63;
        if (r12 == null) goto L63;
        boolean r30 = true;
    L64:
        if (r28 != null) goto L87;
        boolean r40 = r30;
        LazyLayoutItemAnimator<T>.ItemInfo r32 = new ItemInfo(this);
        ItemInfo.updateAnimation$default(r32, r27, r65, r66, r63, r64, 0, 32, null);
        List<T> r41 = r23;
        int r42 = r24;
        int r43 = r25;
        this.keyToItemInfoMap.set(r27.getKey(), r32);
        if (r27.getIndex() != r29) goto L68;
    L73:
        int r33 = r15;
        long r35 = r27.mo839getOffsetBjo55l4(0);
        if (r27.isVertical() == false) goto L76;
        int r210 = IntOffset.m7102getYimpl(r35);
    L77:
        initializeAnimation(r27, r210, r32);
        if (r40 == false) goto L86;
        LazyLayoutItemAnimation[] r37 = r32.getAnimations();
        int r38 = r37.length;
        int r39 = 0;
    L80:
        if (r39 >= r38) goto L85;
        LazyLayoutItemAnimation r310 = r37[r39];
        if (r310 == null) goto L84;
        r310.animateAppearance();
        Unit r311 = Unit.INSTANCE;
    L84:
        r39 = r39 + 1;
        goto L80
    L85:
        int r312 = r33;
        int r313 = r26;
    L118:
        r25 = r43 + 1;
        r15 = r312;
        r26 = r313;
        r23 = r41;
        r24 = r42;
        goto L52
    L86:
        r312 = r33;
        r313 = r26;
        goto L118
    L76:
        r210 = IntOffset.m7101getXimpl(r35);
        goto L77
    L68:
        if (r29 == (-1)) goto L73;
        int r44 = r15;
        if (r29 >= r44) goto L72;
        this.movingInFromStartBound.add(r27);
        r312 = r44;
        r313 = r26;
        goto L118
    L72:
        this.movingInFromEndBound.add(r27);
        r312 = r44;
        r313 = r26;
        goto L118
    L87:
        boolean r45 = r30;
        r41 = r23;
        r42 = r24;
        r43 = r25;
        int r46 = r15;
        if (r17 == false) goto L116;
        ItemInfo.updateAnimation$default(r28, r27, r65, r66, r63, r64, 0, 32, null);
        LazyLayoutItemAnimation[] r47 = r28.getAnimations();
        int r48 = 0;
        int r49 = r47.length;
        int r50 = 0;
    L90:
        if (r50 >= r49) goto L99;
        LazyLayoutItemAnimation r314 = r47[r50];
        if (r314 == null) goto L97;
        int r315 = r50;
        int r316 = r46;
        int r317 = r48;
        int r318 = r26;
        if (IntOffset.m7100equalsimpl0(r314.m888getRawOffsetnOccac(), LazyLayoutItemAnimation.Companion.m892getNotInitializednOccac()) == true) goto L98;
        r314.m891setRawOffsetgyyYBs(IntOffset.m7105plusqkQi6aY(r314.m888getRawOffsetnOccac(), r16));
    L98:
        r50 = r315 + 1;
        r46 = r316;
        r26 = r318;
        r48 = r317;
        goto L90
    L97:
        r315 = r50;
        r316 = r46;
        r317 = r48;
        r318 = r26;
        goto L98
    L99:
        r312 = r46;
        r313 = r26;
        if (r45 == false) goto L115;
        LazyLayoutItemAnimation[] r51 = r28.getAnimations();
        int r52 = 0;
        int r67 = r51.length;
        int r68 = 0;
    L102:
        if (r68 >= r67) goto L115;
        LazyLayoutItemAnimation r69 = r51[r68];
        if (r69 != null) goto L106;
        LazyLayoutItemAnimation[] r319 = r51;
        int r320 = r52;
    L113:
        r68 = r68 + 1;
        r51 = r319;
        r52 = r320;
        goto L102
    L106:
        if (r69.isDisappearanceAnimationInProgress() == false) goto L110;
        r319 = r51;
        r320 = r52;
        LazyLayoutItemAnimation r70 = r69;
        this.disappearingItems.remove(r70);
        DrawModifierNode r71 = this.displayingNode;
        if (r71 == null) goto L111;
        DrawModifierNodeKt.invalidateDraw(r71);
        Unit r72 = Unit.INSTANCE;
    L111:
        r70.animateAppearance();
        goto L113
    L110:
        r319 = r51;
        r320 = r52;
        r70 = r69;
    L115:
        startPlacementAnimationsIfNeeded$default(this, r27, false, 2, null);
        goto L118
    L116:
        r312 = r46;
        r313 = r26;
    L63:
        r30 = false;
        goto L64
    L58:
        r29 = -1;
        goto L60
    L117:
        r41 = r23;
        r42 = r24;
        r43 = r25;
        r313 = r26;
        r312 = r15;
        removeInfoForKey(r27.getKey());
        goto L118
    L119:
        int r73 = 2;
        int[] r74 = new int[r11];
        if (r17 == false) goto L141;
        if (r12 == null) goto L141;
        if (this.movingInFromStartBound.isEmpty() == true) goto L131;
        List<T> r75 = this.movingInFromStartBound;
        if (r75.size() <= 1) goto L127;
        CollectionsKt.sortWith(r75, new LazyLayoutItemAnimator$onMeasured$$inlined$sortByDescending$1(r12));
    L127:
        List<T> r76 = this.movingInFromStartBound;
        int r77 = 0;
        int r78 = r76.size();
    L128:
        if (r77 >= r78) goto L130;
        int r79 = r77;
        T r80 = r76.get(r77);
        int r321 = r73;
        initializeAnimation$default(this, r80, r63 - updateAndReturnOffsetFor(r74, r80), null, 4, null);
        startPlacementAnimationsIfNeeded$default(this, r80, false, r321, null);
        r77 = r79 + 1;
        r73 = r321;
        r78 = r78;
        r74 = r74;
        goto L128
    L130:
        int[] r410 = r74;
        int r81 = r73;
        ArraysKt.fill$default(r410, 0, 0, 0, 6, null);
        int[] r82 = r410;
    L133:
        if (this.movingInFromEndBound.isEmpty() == true) goto L142;
        List<T> r83 = this.movingInFromEndBound;
        if (r83.size() <= 1) goto L137;
        CollectionsKt.sortWith(r83, new LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$1(r12));
    L137:
        List<T> r84 = this.movingInFromEndBound;
        int r85 = 0;
        int r86 = r84.size();
    L138:
        if (r85 >= r86) goto L140;
        List<T> r87 = r84;
        T r88 = r84.get(r85);
        initializeAnimation$default(this, r88, (r64 + updateAndReturnOffsetFor(r82, r88)) - r88.getMainAxisSizeWithSpacings(), null, 4, null);
        startPlacementAnimationsIfNeeded$default(this, r88, false, r81, null);
        r85 = r85 + 1;
        r84 = r87;
        r86 = r86;
        goto L138
    L140:
        ArraysKt.fill$default(r82, 0, 0, 0, 6, null);
    L142:
        MutableScatterSet<Object> r89 = this.movingAwayKeys;
        Object[] r90 = r89.elements;
        MutableScatterSet<Object> r91 = r89;
        int r92 = 0;
        long[] r93 = r91.metadata;
        int r94 = r93.length - 2;
        int r95 = 0;
        if (0 > r94) goto L226;
    L144:
        long r211 = r93[r95];
        Object[] r322 = r90;
        MutableScatterSet<Object> r323 = r91;
        int r324 = r92;
        long[] r325 = r93;
        if (((((~r211) << 7) & r211) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L220;
        int r96 = 8;
        int r97 = 8 - ((~(r95 - r94)) >>> 31);
        int r98 = 0;
    L147:
        if (r98 >= r97) goto L217;
        if ((r211 & 255) >= 128) goto L151;
        int r99 = 1;
    L152:
        if (r99 == 0) goto L215;
        int r326 = r96;
        Object r100 = r322[(r95 << 3) + r98];
        int r327 = r98;
        LazyLayoutItemAnimator<T>.ItemInfo r411 = this.keyToItemInfoMap.get(r100);
        if (r411 != 0) goto L156;
        boolean r412 = r14;
    L216:
        r211 = r211 >> r326;
        r98 = r327 + 1;
        r11 = r61;
        r96 = r326;
        r14 = r412;
        goto L147
    L156:
        int r101 = r57.getIndex(r100);
        r412 = r14;
        r411.setSpan(Math.min(r11, r411.getSpan()));
        r411.setLane(Math.min(r11 - r411.getSpan(), r411.getLane()));
        if (r101 != (-1)) goto L187;
        LazyLayoutItemAnimation[] r110 = r411.getAnimations();
        int r102 = r110.length;
        int r413 = 0;
        int r414 = 0;
        int r111 = 0;
    L159:
        if (r111 >= r102) goto L184;
        LazyLayoutItemAnimation r415 = r110[r111];
        int r416 = r413 + 1;
        if (r415 != null) goto L163;
        int r510 = r102;
        int r511 = r101;
    L182:
        r111 = r111 + 1;
        r413 = r416;
        r102 = r510;
        r101 = r511;
        goto L159
    L163:
        if (r415.isDisappearanceAnimationInProgress() == false) goto L166;
        r414 = 1;
        r510 = r102;
        r511 = r101;
        goto L182
    L166:
        if (r415.isDisappearanceAnimationFinished() == false) goto L171;
        r415.release();
        r411.getAnimations()[r413] = null;
        r510 = r102;
        r511 = r101;
        this.disappearingItems.remove(r415);
        DrawModifierNode r103 = this.displayingNode;
        if (r103 == null) goto L182;
        DrawModifierNodeKt.invalidateDraw(r103);
        Unit r104 = Unit.INSTANCE;
        goto L182
    L171:
        r510 = r102;
        r511 = r101;
        if (r415.getLayer() == null) goto L175;
        r415.animateDisappearance();
    L175:
        if (r415.isDisappearanceAnimationInProgress() == false) goto L180;
        this.disappearingItems.add(r415);
        DrawModifierNode r105 = this.displayingNode;
        if (r105 == null) goto L179;
        DrawModifierNodeKt.invalidateDraw(r105);
        Unit r106 = Unit.INSTANCE;
    L179:
        r414 = 1;
        goto L182
    L180:
        r415.release();
        r411.getAnimations()[r413] = null;
        goto L182
    L184:
        if (r414 != 0) goto L216;
        removeInfoForKey(r100);
        goto L216
    L187:
        Constraints r107 = r411.m894getConstraintsDWUhwKw();
        Intrinsics.checkNotNull(r107);
        LazyLayoutMeasuredItem r417 = r58.mo841getAndMeasurehBUhpc(r101, r411.getLane(), r411.getSpan(), r107.m6932unboximpl());
        r417.setNonScrollableItem(true);
        LazyLayoutItemAnimation[] r112 = r411.getAnimations();
        int r108 = r112.length;
        int r113 = 0;
    L188:
        if (r113 >= r108) goto L199;
        LazyLayoutItemAnimation r418 = r112[r113];
        if (r418 == null) goto L194;
        int r419 = r108;
        int r420 = r113;
        if (r418.isPlacementAnimationInProgress() != true) goto L195;
        boolean r109 = true;
    L196:
        if (r109 == true) goto L197;
        r113 = r420 + 1;
        r108 = r419;
        goto L188
    L197:
        boolean r114 = true;
    L201:
        if (r114 == true) goto L209;
        if (r12 != null) goto L204;
    L206:
        boolean r115 = false;
    L207:
        if (r115 == false) goto L209;
        removeInfoForKey(r100);
        goto L216
    L204:
        if (r101 != r12.getIndex(r100)) goto L206;
        r115 = true;
    L209:
        r411.updateAnimation(r417, r65, r66, r63, r64, r411.getCrossAxisOffset());
        if (r101 >= this.firstVisibleIndex) goto L212;
        this.movingAwayToStartBound.add((T) r417);
        goto L216
    L212:
        this.movingAwayToEndBound.add((T) r417);
    L195:
        r109 = false;
        goto L196
    L194:
        r419 = r108;
        r420 = r113;
        goto L195
    L199:
        r114 = false;
        goto L201
    L215:
        r326 = r96;
        r327 = r98;
        r412 = r14;
        goto L216
    L151:
        r99 = 0;
        goto L152
    L217:
        boolean r421 = r14;
        if (r97 != r96) goto L226;
    L221:
        if (r95 == r94) goto L226;
        r95 = r95 + 1;
        r11 = r61;
        r92 = r324;
        r93 = r325;
        r90 = r322;
        r91 = r323;
        r14 = r421;
        goto L144
    L220:
        r421 = r14;
    L226:
        if (this.movingAwayToStartBound.isEmpty() == true) goto L243;
        List<T> r116 = this.movingAwayToStartBound;
        if (r116.size() <= 1) goto L230;
        CollectionsKt.sortWith(r116, new LazyLayoutItemAnimator$onMeasured$$inlined$sortByDescending$2(r57));
    L230:
        List<T> r117 = this.movingAwayToStartBound;
        int r118 = 0;
        int r119 = 0;
        int r120 = r117.size();
    L231:
        if (r119 >= r120) goto L240;
        T r121 = r117.get(r119);
        List<T> r122 = r117;
        LazyLayoutItemAnimator<T>.ItemInfo r123 = this.keyToItemInfoMap.get(r121.getKey());
        Intrinsics.checkNotNull(r123);
        LazyLayoutItemAnimator<T>.ItemInfo r124 = r123;
        int r125 = updateAndReturnOffsetFor(r82, r121);
        if (r60 == false) goto L235;
        LazyLayoutItemAnimator<T>.ItemInfo r212 = r124;
        int r126 = getMainAxisOffset((LazyLayoutMeasuredItem) CollectionsKt.first(r56));
    L236:
        int r127 = r118;
        int r213 = r119;
        r121.position(r126 - r125, r212.getCrossAxisOffset(), r54, r55);
        if (r17 == false) goto L239;
        startPlacementAnimationsIfNeeded(r121, true);
    L239:
        r119 = r213 + 1;
        r117 = r122;
        r118 = r127;
        goto L231
    L235:
        r212 = r124;
        r126 = r212.getLayoutMinOffset();
        goto L236
    L240:
        ArraysKt.fill$default(r82, 0, 0, 0, 6, null);
    L243:
        if (this.movingAwayToEndBound.isEmpty() == true) goto L259;
        List<T> r128 = this.movingAwayToEndBound;
        if (r128.size() <= 1) goto L247;
        CollectionsKt.sortWith(r128, new LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$2(r57));
    L247:
        List<T> r129 = this.movingAwayToEndBound;
        int r130 = 0;
        int r131 = 0;
        int r132 = r129.size();
    L248:
        if (r131 >= r132) goto L259;
        T r133 = r129.get(r131);
        List<T> r134 = r129;
        int r135 = r130;
        LazyLayoutItemAnimator<T>.ItemInfo r136 = this.keyToItemInfoMap.get(r133.getKey());
        Intrinsics.checkNotNull(r136);
        LazyLayoutItemAnimator<T>.ItemInfo r137 = r136;
        int r138 = updateAndReturnOffsetFor(r82, r133);
        if (r60 == false) goto L252;
        LazyLayoutItemAnimator<T>.ItemInfo r214 = r137;
        LazyLayoutMeasuredItem r139 = (LazyLayoutMeasuredItem) CollectionsKt.last(r56);
        int r215 = getMainAxisOffset(r139) + r139.getMainAxisSizeWithSpacings();
    L253:
        r133.position((r215 - r133.getMainAxisSizeWithSpacings()) + r138, r214.getCrossAxisOffset(), r54, r55);
        if (r17 == false) goto L257;
        startPlacementAnimationsIfNeeded(r133, true);
    L257:
        r131 = r131 + 1;
        r129 = r134;
        r130 = r135;
        goto L248
    L252:
        r214 = r137;
        r215 = r214.getLayoutMaxOffset();
    L259:
        List<T> r140 = this.movingAwayToStartBound;
        CollectionsKt.reverse(r140);
        Unit r141 = Unit.INSTANCE;
        r56.addAll(0, r140);
        r56.addAll(this.movingAwayToEndBound);
        this.movingInFromStartBound.clear();
        this.movingInFromEndBound.clear();
        this.movingAwayToStartBound.clear();
        this.movingAwayToEndBound.clear();
        this.movingAwayKeys.clear();
        return;
    L131:
        r82 = r74;
        r81 = 2;
    L141:
        r82 = r74;
        r81 = 2;
    L28:
        r6 = true;
        goto L29
    L22:
        r4 = IntOffset.m7095constructorimpl((((long) 0) & 4294967295L) | (((long) r53) << 32));
        goto L23
    L18:
        r3 = 0;
        goto L19
    L12:
        if (this.keyToItemInfoMap.isEmpty() == false) goto L15;
        releaseAnimations();
        return;
    L8:
        r1 = false;
        goto L9
    }

    private final void removeInfoForKey(Object key) {
        LazyLayoutItemAnimator<T>.ItemInfo r0 = this.keyToItemInfoMap.remove(key);
        if (r0 == null) goto L13;
        LazyLayoutItemAnimation[] r1 = r0.getAnimations();
        if (r1 == null) goto L17;
        int r2 = r1.length;
        int r3 = 0;
    L7:
        if (r3 >= r2) goto L18;
        LazyLayoutItemAnimation r4 = r1[r3];
        if (r4 == null) goto L11;
        r4.release();
    L11:
        r3 = r3 + 1;
        goto L7
    L18:
        return;
    L17:
        return;
    }

    public final void reset() {
        releaseAnimations();
        this.keyIndexMap = null;
        this.firstVisibleIndex = -1;
    }

    private final void releaseAnimations() {
        if (this.keyToItemInfoMap.isNotEmpty() == false) goto L41;
        ScatterMap this_$iv = this.keyToItemInfoMap;
        int $i$f$forEachValue = 0;
        Object[] v$iv = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L32;
    L6:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L27;
        int r12 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L9:
        if (j$iv$iv >= bitCount$iv$iv) goto L24;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L13;
        boolean r17 = true;
    L14:
        if (r17 == false) goto L23;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        ItemInfo it = (ItemInfo) v$iv[index$iv$iv];
        LazyLayoutItemAnimation[] r13 = it.getAnimations();
        int r1 = r13.length;
        int $i$f$forEachValue2 = 0;
    L16:
        if ($i$f$forEachValue2 >= r1) goto L23;
        LazyLayoutItemAnimation r18 = r13[$i$f$forEachValue2];
        if (r18 == null) goto L20;
        r18.release();
    L20:
        $i$f$forEachValue2 = $i$f$forEachValue2 + 1;
    L23:
        slot$iv$iv = slot$iv$iv >> r12;
        j$iv$iv = j$iv$iv + 1;
        r12 = r12;
        this_$iv = this_$iv;
        $i$f$forEachValue = $i$f$forEachValue;
        goto L9
    L13:
        r17 = false;
        goto L14
    L24:
        ScatterMap this_$iv2 = this_$iv;
        int $i$f$forEachValue3 = $i$f$forEachValue;
        if (bitCount$iv$iv != r12) goto L32;
    L28:
        if (i$iv$iv == lastIndex$iv$iv) goto L32;
        i$iv$iv = i$iv$iv + 1;
        this_$iv = this_$iv2;
        $i$f$forEachValue = $i$f$forEachValue3;
        goto L6
    L27:
        this_$iv2 = this_$iv;
        $i$f$forEachValue3 = $i$f$forEachValue;
    L32:
        this.keyToItemInfoMap.clear();
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void initializeAnimation$default(LazyLayoutItemAnimator r0, LazyLayoutMeasuredItem r1, int r2, LazyLayoutItemAnimator<T>.ItemInfo r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L5;
        LazyLayoutItemAnimator<T>.ItemInfo r6 = r0.keyToItemInfoMap.get(r1.getKey());
        Intrinsics.checkNotNull(r6);
        r3 = r6;
    L5:
        r0.initializeAnimation(r1, r2, r3);
    }

    private final void initializeAnimation(T r18, int mainAxisOffset, LazyLayoutItemAnimator<T>.ItemInfo r20) {
        T r0 = r18;
        int r1 = 0;
        long firstPlaceableOffset = r0.mo839getOffsetBjo55l4(0);
        if (r0.isVertical() == false) goto L5;
        long targetFirstPlaceableOffset = IntOffset.m7097copyiSbpLlY$default(firstPlaceableOffset, 0, mainAxisOffset, 1, null);
    L6:
        LazyLayoutItemAnimation[] r4 = r20.getAnimations();
        int index$iv = 0;
        int r9 = r4.length;
    L7:
        if (r1 >= r9) goto L14;
        LazyLayoutItemAnimation r10 = r4[r1];
        int index$iv2 = index$iv + 1;
        if (r10 == null) goto L12;
        long diffToFirstPlaceableOffset = IntOffset.m7104minusqkQi6aY(r0.mo839getOffsetBjo55l4(index$iv), firstPlaceableOffset);
        r10.m891setRawOffsetgyyYBs(IntOffset.m7105plusqkQi6aY(targetFirstPlaceableOffset, diffToFirstPlaceableOffset));
    L12:
        r1 = r1 + 1;
        r0 = r18;
        index$iv = index$iv2;
        goto L7
    L14:
        return;
    L5:
        targetFirstPlaceableOffset = IntOffset.m7097copyiSbpLlY$default(firstPlaceableOffset, mainAxisOffset, 0, 2, null);
        goto L6
    }

    static /* synthetic */ void startPlacementAnimationsIfNeeded$default(LazyLayoutItemAnimator r0, LazyLayoutMeasuredItem r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = false;
    L5:
        r0.startPlacementAnimationsIfNeeded(r1, r2);
    }

    private final void startPlacementAnimationsIfNeeded(T r19, boolean isMovingAway) {
        LazyLayoutItemAnimator<T>.ItemInfo r1 = this.keyToItemInfoMap.get(r19.getKey());
        Intrinsics.checkNotNull(r1);
        LazyLayoutItemAnimator<T>.ItemInfo r2 = r1;
        LazyLayoutItemAnimation[] r3 = r2.getAnimations();
        int index$iv = 0;
        int r5 = r3.length;
        int r6 = 0;
    L3:
        if (r6 >= r5) goto L17;
        LazyLayoutItemAnimation r7 = r3[r6];
        int index$iv2 = index$iv + 1;
        if (r7 == null) goto L14;
        long newTarget = r19.mo839getOffsetBjo55l4(index$iv);
        long currentTarget = r7.m888getRawOffsetnOccac();
        if (IntOffset.m7100equalsimpl0(currentTarget, LazyLayoutItemAnimation.Companion.m892getNotInitializednOccac()) == true) goto L13;
        if (IntOffset.m7100equalsimpl0(currentTarget, newTarget) == true) goto L13;
        r7.m884animatePlacementDeltaar5cAso(IntOffset.m7104minusqkQi6aY(newTarget, currentTarget), isMovingAway);
    L13:
        r7.m891setRawOffsetgyyYBs(newTarget);
    L15:
        r6 = r6 + 1;
        index$iv = index$iv2;
        r3 = r3;
        r2 = r2;
        goto L3
    L14:
        r3 = r3;
        goto L15
    }

    public final LazyLayoutItemAnimation getAnimation(Object key, int placeableIndex) {
        LazyLayoutItemAnimator<T>.ItemInfo r0 = this.keyToItemInfoMap.get(key);
        if (r0 == null) goto L7;
        LazyLayoutItemAnimation[] r1 = r0.getAnimations();
        if (r1 == null) goto L7;
        return r1[placeableIndex];
    L7:
        return null;
    }

    private final int updateAndReturnOffsetFor(int[] $this$updateAndReturnOffsetFor, T r9) {
        int lane = r9.getLane();
        int span = r9.getSpan();
        int maxOffset = 0;
        int i = lane;
        int r4 = lane + span;
    L3:
        if (i >= r4) goto L5;
        $this$updateAndReturnOffsetFor[i] = $this$updateAndReturnOffsetFor[i] + r9.getMainAxisSizeWithSpacings();
        maxOffset = Math.max(maxOffset, $this$updateAndReturnOffsetFor[i]);
        i = i + 1;
        goto L3
    L5:
        return maxOffset;
    }

    /* JADX INFO: renamed from: getMinSizeToFitDisappearingItems-YbymL2g, reason: not valid java name */
    public final long m893getMinSizeToFitDisappearingItemsYbymL2g() {
        long size = IntSize.Companion.m7149getZeroYbymL2g();
        List<LazyLayoutItemAnimation> r3 = this.disappearingItems;
        int index$iv = 0;
        int r6 = r3.size();
    L3:
        if (index$iv >= r6) goto L10;
        Object item$iv = r3.get(index$iv);
        LazyLayoutItemAnimation it = (LazyLayoutItemAnimation) item$iv;
        GraphicsLayer layer = it.getLayer();
        if (layer == null) goto L8;
        long arg0$iv = size;
        long size2 = size;
        long size3 = arg0$iv >> 32;
        long arg0$iv2 = it.m888getRawOffsetnOccac();
        int r1 = IntOffset.m7101getXimpl(arg0$iv2);
        long arg0$iv3 = layer.m5008getSizeYbymL2g();
        int width$iv = Math.max((int) size3, r1 + ((int) (arg0$iv3 >> 32)));
        int r2 = IntOffset.m7102getYimpl(it.m888getRawOffsetnOccac());
        long arg0$iv4 = layer.m5008getSizeYbymL2g();
        int height$iv = Math.max((int) (size2 & 4294967295L), r2 + ((int) (arg0$iv4 & 4294967295L)));
        long r4 = ((long) height$iv) & 4294967295L;
        size = IntSize.m7139constructorimpl(r4 | (((long) width$iv) << 32));
    L8:
        index$iv = index$iv + 1;
        goto L3
    L10:
        return size;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    private final boolean getHasAnimations(T r7) {
        int r0 = r7.getPlaceablesCount();
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L9;
        int index = r2;
        if (LazyLayoutItemAnimatorKt.access$getSpecs(r7.getParentData(index)) != null) goto L7;
        r2 = r2 + 1;
        goto L3
    L7:
        return true;
    L9:
        return false;
    }

    private final int getMainAxisOffset(LazyLayoutMeasuredItem $this$mainAxisOffset) {
        long it = $this$mainAxisOffset.mo839getOffsetBjo55l4(0);
        if ($this$mainAxisOffset.isVertical() == false) goto L6;
        return IntOffset.m7102getYimpl(it);
    L6:
        return IntOffset.m7101getXimpl(it);
    }

    private final int getCrossAxisOffset(LazyLayoutMeasuredItem $this$crossAxisOffset) {
        long it = $this$crossAxisOffset.mo839getOffsetBjo55l4(0);
        if ($this$crossAxisOffset.isVertical() == true) goto L6;
        return IntOffset.m7102getYimpl(it);
    L6:
        return IntOffset.m7101getXimpl(it);
    }
}
