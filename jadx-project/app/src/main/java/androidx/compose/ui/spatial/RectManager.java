package androidx.compose.ui.spatial;

import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableObjectList;
import androidx.collection.ObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Actual_androidKt;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.MatrixKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.MeasurePassDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: compiled from: RectManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u000bJ8\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u001dH\u0002J*\u0010(\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*2\u0006\u0010#\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u0004H\u0002J\u0006\u0010.\u001a\u00020\u000bJ\u000e\u0010/\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u0004J\u001d\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u001d2\u0006\u00102\u001a\u00020\u001dH\u0000¢\u0006\u0002\b3J\u000e\u00104\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u0004J(\u00105\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*2\u0006\u0010#\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b6\u0010,J\u0016\u00107\u001a\u0004\u0018\u00010\u00012\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ:\u00109\u001a\u00020:2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020\u00172\u0006\u0010<\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001f2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000b0=J:\u0010>\u001a\u00020:2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020\u00172\u0006\u0010<\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001f2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000b0=J\u000e\u0010?\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u0004J\u000e\u0010@\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020\u000fJ\u0010\u0010B\u001a\u00020\u000b2\b\u0010C\u001a\u0004\u0018\u00010\u0001J(\u0010D\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020*2\u0006\u0010F\u001a\u00020*2\u0006\u0010G\u001a\u00020Hø\u0001\u0000¢\u0006\u0004\bI\u0010JJ\u0014\u0010K\u001a\u00020\u000b*\u00020L2\u0006\u0010M\u001a\u00020\u0007H\u0002J\u0019\u0010N\u001a\u00020**\u00020\u0004H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bO\u0010PJ\u0019\u0010Q\u001a\u00020**\u00020LH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bR\u0010SR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006T"}, d2 = {"Landroidx/compose/ui/spatial/RectManager;", "", "layoutNodes", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/collection/IntObjectMap;)V", "cachedRect", "Landroidx/compose/ui/geometry/MutableRect;", "callbacks", "Landroidx/collection/MutableObjectList;", "Lkotlin/Function0;", "", "dispatchLambda", "dispatchToken", "isDirty", "", "isFragmented", "isScreenOrWindowDirty", "rects", "Landroidx/compose/ui/spatial/RectList;", "getRects", "()Landroidx/compose/ui/spatial/RectList;", "scheduledDispatchDeadline", "", "throttledCallbacks", "Landroidx/compose/ui/spatial/ThrottledCallbacks;", "currentRectInfo", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "id", "", "node", "Landroidx/compose/ui/node/DelegatableNode;", "dispatchCallbacks", "insertOrUpdate", "layoutNode", "firstPlacement", "l", "t", "r", "b", "insertOrUpdateTransformedNode", "position", "Landroidx/compose/ui/unit/IntOffset;", "insertOrUpdateTransformedNode-70tqf50", "(Landroidx/compose/ui/node/LayoutNode;JZ)V", "insertOrUpdateTransformedNodeSubhierarchy", "invalidate", "invalidateCallbacksFor", "isTargetDrawnFirst", "targetId", "otherId", "isTargetDrawnFirst$ui_release", "onLayoutLayerPositionalPropertiesChanged", "onLayoutPositionChanged", "onLayoutPositionChanged-70tqf50", "registerOnChangedCallback", "callback", "registerOnGlobalLayoutCallback", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "throttleMillis", "debounceMillis", "Lkotlin/Function1;", "registerOnRectChangedCallback", "remove", "scheduleDebounceCallback", "ensureSomethingScheduled", "unregisterOnChangedCallback", "token", "updateOffsets", "screenOffset", "windowOffset", "viewToWindowMatrix", "Landroidx/compose/ui/graphics/Matrix;", "updateOffsets-ucfNpQE", "(JJ[F)V", "boundingRectInRoot", "Landroidx/compose/ui/node/NodeCoordinator;", "rect", "outerToInnerOffset", "outerToInnerOffset-Bjo55l4", "(Landroidx/compose/ui/node/LayoutNode;)J", "positionInRoot", "positionInRoot-Bjo55l4", "(Landroidx/compose/ui/node/NodeCoordinator;)J", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RectManager {
    public static final int $stable = 0;
    private final MutableRect cachedRect;
    private final MutableObjectList<Function0<Unit>> callbacks;
    private final Function0<Unit> dispatchLambda;
    private Object dispatchToken;
    private boolean isDirty;
    private boolean isFragmented;
    private boolean isScreenOrWindowDirty;
    private final IntObjectMap<LayoutNode> layoutNodes;
    private final RectList rects;
    private long scheduledDispatchDeadline;
    private final ThrottledCallbacks throttledCallbacks;

    static {
        $stable = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RectManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public RectManager(IntObjectMap<LayoutNode> r6) {
        this.layoutNodes = r6;
        this.rects = new RectList();
        this.throttledCallbacks = new ThrottledCallbacks();
        this.callbacks = new MutableObjectList(0, 1, null);
        this.scheduledDispatchDeadline = -1;
        this.dispatchLambda = new RectManager$dispatchLambda$1(this);
        this.cachedRect = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public /* synthetic */ RectManager(IntObjectMap r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = IntObjectMapKt.intObjectMapOf();
    L5:
        this(r1);
    }

    public static final /* synthetic */ ThrottledCallbacks access$getThrottledCallbacks$p(RectManager $this) {
        return $this.throttledCallbacks;
    }

    public static final /* synthetic */ void access$setDispatchToken$p(RectManager $this, Object r1) {
        $this.dispatchToken = r1;
    }

    public final RectList getRects() {
        return this.rects;
    }

    public final void invalidate() {
        this.isDirty = true;
    }

    /* JADX INFO: renamed from: updateOffsets-ucfNpQE, reason: not valid java name */
    public final void m6206updateOffsetsucfNpQE(long screenOffset, long windowOffset, float[] viewToWindowMatrix) {
        int analysis = RectManagerKt.m6207access$analyzeComponents58bKbWc(viewToWindowMatrix);
        ThrottledCallbacks r1 = this.throttledCallbacks;
        boolean r7 = true;
        if ((analysis & 2) != 0) goto L5;
        int $this$hasNonTranslationComponents$iv = 1;
    L6:
        if ($this$hasNonTranslationComponents$iv == 0) goto L8;
        float[] r6 = viewToWindowMatrix;
    L10:
        if (r1.m6222updateOffsetsbT0EZQs(screenOffset, windowOffset, r6) == false) goto L12;
    L16:
        this.isScreenOrWindowDirty = r7;
        return;
    L12:
        if (this.isScreenOrWindowDirty == true) goto L16;
        r7 = false;
        goto L16
    L8:
        r6 = null;
        goto L10
    L5:
        $this$hasNonTranslationComponents$iv = 0;
        goto L6
    }

    public final void dispatchCallbacks() {
        long currentTime = Actual_androidKt.currentTimeMillis();
        if (this.isDirty == false) goto L5;
    L8:
        boolean r1 = true;
    L9:
        boolean isDispatchGlobalCallbacks = r1;
        if (this.isDirty == false) goto L27;
        this.isDirty = false;
        ObjectList this_$iv = this.callbacks;
        Object[] content$iv = this_$iv.content;
        int i$iv = 0;
        int r5 = this_$iv._size;
    L12:
        if (i$iv >= r5) goto L14;
        Function0 it = (Function0) content$iv[i$iv];
        it.invoke();
        i$iv = i$iv + 1;
        goto L12
    L14:
        RectList this_$iv2 = this.rects;
        long[] items$iv = this_$iv2.items;
        int size$iv = this_$iv2.itemsSize;
        int i$iv2 = 0;
    L16:
        if (i$iv2 >= (items$iv.length - 2)) goto L25;
        if (i$iv2 >= size$iv) goto L25;
        long meta$iv = items$iv[i$iv2 + 2];
        int $i$f$unpackMetaUpdated = ((int) (meta$iv >> 61)) & 1;
        if ($i$f$unpackMetaUpdated == 0) goto L22;
        long topLeft$iv = items$iv[i$iv2 + 0];
        long bottomRight$iv = items$iv[i$iv2 + 1];
        int $i$f$unpackMetaValue = ((int) meta$iv) & RectListKt.Lower26Bits;
        this.throttledCallbacks.fireOnUpdatedRect($i$f$unpackMetaValue, topLeft$iv, bottomRight$iv, currentTime);
    L22:
        i$iv2 = i$iv2 + 3;
    L25:
        this.rects.clearUpdated();
    L27:
        if (this.isScreenOrWindowDirty == false) goto L29;
        this.isScreenOrWindowDirty = false;
        this.throttledCallbacks.fireOnRectChangedEntries(currentTime);
    L29:
        if (isDispatchGlobalCallbacks == false) goto L32;
        this.throttledCallbacks.fireGlobalChangeEntries(currentTime);
    L32:
        if (this.isFragmented == false) goto L34;
        this.isFragmented = false;
        this.rects.defragment();
    L34:
        this.throttledCallbacks.triggerDebounced(currentTime);
        return;
    L5:
        if (this.isScreenOrWindowDirty == true) goto L8;
        r1 = false;
        goto L9
    }

    public final void scheduleDebounceCallback(boolean ensureSomethingScheduled) {
        if (ensureSomethingScheduled == true) goto L4;
    L7:
        boolean canExitEarly = true;
    L8:
        long nextDeadline = this.throttledCallbacks.getMinDebounceDeadline();
        if (nextDeadline >= 0) goto L12;
        if (canExitEarly == false) goto L12;
        return;
    L12:
        long currentScheduledDeadline = this.scheduledDispatchDeadline;
        if (currentScheduledDeadline != nextDeadline) goto L17;
        if (canExitEarly == false) goto L17;
        return;
    L17:
        if (this.dispatchToken == null) goto L19;
        Actual_androidKt.removePost(this.dispatchToken);
    L19:
        long currentTime = Actual_androidKt.currentTimeMillis();
        long nextFrameIsh = 16 + currentTime;
        long deadline = Math.max(nextDeadline, nextFrameIsh);
        this.scheduledDispatchDeadline = deadline;
        long delay = deadline - currentTime;
        this.dispatchToken = Actual_androidKt.postDelayed(delay, this.dispatchLambda);
        return;
    L4:
        if (this.dispatchToken != null) goto L7;
        canExitEarly = false;
        goto L8
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final RelativeLayoutBounds currentRectInfo(int id, final DelegatableNode node) {
        final Ref.ObjectRef result = new Ref.ObjectRef();
        this.rects.withRect(id, new AnonymousClass1(result, node, this));
        return (RelativeLayoutBounds) result.element;
    }

    public final Object registerOnChangedCallback(Function0<Unit> r2) {
        this.callbacks.add(r2);
        return r2;
    }

    public final DelegatableNode.RegistrationHandle registerOnRectChangedCallback(int id, long throttleMillis, long debounceMillis, DelegatableNode node, Function1<? super RelativeLayoutBounds, Unit> r15) {
        return this.throttledCallbacks.registerOnRectChanged(id, throttleMillis, debounceMillis, node, r15);
    }

    public final DelegatableNode.RegistrationHandle registerOnGlobalLayoutCallback(int id, long throttleMillis, long debounceMillis, DelegatableNode node, Function1<? super RelativeLayoutBounds, Unit> r15) {
        return this.throttledCallbacks.registerOnGlobalChange(id, throttleMillis, debounceMillis, node, r15);
    }

    public final void unregisterOnChangedCallback(Object token) {
        if (TypeIntrinsics.isFunctionOfArity(token, 0) == false) goto L5;
        Function0 r0 = (Function0) token;
    L6:
        if (r0 != null) goto L8;
        return;
    L8:
        this.callbacks.remove(token);
        return;
    L5:
        r0 = null;
        goto L6
    }

    public final void invalidateCallbacksFor(LayoutNode layoutNode) {
        this.isDirty = true;
        this.rects.markUpdated(layoutNode.getSemanticsId());
        scheduleDebounceCallback(true);
    }

    public final void onLayoutLayerPositionalPropertiesChanged(LayoutNode layoutNode) {
        if (ComposeUiFlags.isRectTrackingEnabled == true) goto L5;
        return;
    L5:
        long outerToInnerOffset = m6203outerToInnerOffsetBjo55l4(layoutNode);
        if (RectManagerKt.m6208access$isSetgyyYBs(outerToInnerOffset) == false) goto L11;
        layoutNode.m5897setOuterToInnerOffsetgyyYBs$ui_release(outerToInnerOffset);
        layoutNode.setOuterToInnerOffsetDirty$ui_release(false);
        MutableVector<LayoutNode> r5 = layoutNode.get_children$ui_release();
        int i$iv$iv = 0;
        Object[] content$iv$iv = r5.content;
        int size$iv$iv = r5.getSize();
    L8:
        if (i$iv$iv >= size$iv$iv) goto L10;
        LayoutNode it = (LayoutNode) content$iv$iv[i$iv$iv];
        m6205onLayoutPositionChanged70tqf50(it, it.getOuterCoordinator$ui_release().mo5909getPositionnOccac(), false);
        i$iv$iv = i$iv$iv + 1;
        goto L8
    L10:
        invalidateCallbacksFor(layoutNode);
        return;
    L11:
        insertOrUpdateTransformedNodeSubhierarchy(layoutNode);
    }

    /* JADX INFO: renamed from: onLayoutPositionChanged-70tqf50, reason: not valid java name */
    public final void m6205onLayoutPositionChanged70tqf50(LayoutNode layoutNode, long position, boolean firstPlacement) {
        if (ComposeUiFlags.isRectTrackingEnabled == true) goto L5;
        return;
    L5:
        MeasurePassDelegate delegate = layoutNode.getMeasurePassDelegate$ui_release();
        int width = delegate.getMeasuredWidth();
        int height = delegate.getMeasuredHeight();
        LayoutNode parent = layoutNode.getParent$ui_release();
        long lastOffset = layoutNode.m5889getOffsetFromRootnOccac$ui_release();
        long lastSize = layoutNode.m5888getLastSizeYbymL2g$ui_release();
        long offset = lastSize >> 32;
        int lastWidth = (int) offset;
        int lastHeight = (int) (lastSize & 4294967295L);
        if (parent == null) goto L15;
        boolean parentOffsetDirty = parent.getOuterToInnerOffsetDirty$ui_release();
        long parentOffset = parent.m5889getOffsetFromRootnOccac$ui_release();
        long prevOuterToInnerOffset = parent.m5890getOuterToInnerOffsetnOccac$ui_release();
        if (RectManagerKt.m6208access$isSetgyyYBs(parentOffset) == false) goto L13;
        if (parentOffsetDirty == false) goto L11;
        long it = m6203outerToInnerOffsetBjo55l4(parent);
        parent.m5897setOuterToInnerOffsetgyyYBs$ui_release(it);
        parent.setOuterToInnerOffsetDirty$ui_release(false);
        long parentOuterInnerOffset = it;
    L12:
        boolean hasNonTranslationTransformations = !RectManagerKt.m6208access$isSetgyyYBs(parentOuterInnerOffset);
        long offset2 = IntOffset.m7105plusqkQi6aY(IntOffset.m7105plusqkQi6aY(parentOffset, parentOuterInnerOffset), position);
        boolean hasNonTranslationTransformations2 = hasNonTranslationTransformations;
    L16:
        if (hasNonTranslationTransformations2 == true) goto L30;
        if (RectManagerKt.m6208access$isSetgyyYBs(offset2) == false) goto L30;
        layoutNode.m5896setOffsetFromRootgyyYBs$ui_release(offset2);
        layoutNode.m5895setLastSizeozmzZPI$ui_release(IntSize.m7139constructorimpl((((long) width) << 32) | (((long) height) & 4294967295L)));
        int l = IntOffset.m7101getXimpl(offset2);
        int t = IntOffset.m7102getYimpl(offset2);
        int r = l + width;
        int b = t + height;
        if (firstPlacement == false) goto L23;
    L27:
        insertOrUpdate(layoutNode, firstPlacement, l, t, r, b);
        return;
    L23:
        if (IntOffset.m7100equalsimpl0(offset2, lastOffset) == false) goto L27;
        if (lastWidth != width) goto L27;
        if (lastHeight != height) goto L27;
        return;
    L30:
        m6202insertOrUpdateTransformedNode70tqf50(layoutNode, position, firstPlacement);
        return;
    L11:
        parentOuterInnerOffset = prevOuterToInnerOffset;
        goto L12
    L13:
        hasNonTranslationTransformations2 = false;
        offset2 = m6204positionInRootBjo55l4(layoutNode.getOuterCoordinator$ui_release());
        goto L16
    L15:
        hasNonTranslationTransformations2 = false;
        offset2 = position;
        goto L16
    }

    private final void insertOrUpdateTransformedNodeSubhierarchy(LayoutNode layoutNode) {
        MutableVector<LayoutNode> r2 = layoutNode.get_children$ui_release();
        int i$iv$iv = 0;
        Object[] content$iv$iv = r2.content;
        int size$iv$iv = r2.getSize();
    L3:
        if (i$iv$iv >= size$iv$iv) goto L6;
        LayoutNode it = (LayoutNode) content$iv$iv[i$iv$iv];
        m6202insertOrUpdateTransformedNode70tqf50(it, it.getOuterCoordinator$ui_release().mo5909getPositionnOccac(), false);
        insertOrUpdateTransformedNodeSubhierarchy(it);
        i$iv$iv = i$iv$iv + 1;
        goto L3
    }

    /* JADX INFO: renamed from: insertOrUpdateTransformedNode-70tqf50, reason: not valid java name */
    private final void m6202insertOrUpdateTransformedNode70tqf50(LayoutNode layoutNode, long position, boolean firstPlacement) {
        NodeCoordinator coord = layoutNode.getOuterCoordinator$ui_release();
        MeasurePassDelegate delegate = layoutNode.getMeasurePassDelegate$ui_release();
        int width = delegate.getMeasuredWidth();
        int height = delegate.getMeasuredHeight();
        MutableRect rect = this.cachedRect;
        rect.set(IntOffset.m7101getXimpl(position), IntOffset.m7102getYimpl(position), IntOffset.m7101getXimpl(position) + width, IntOffset.m7102getYimpl(position) + height);
        boundingRectInRoot(coord, rect);
        int l = (int) rect.getLeft();
        int t = (int) rect.getTop();
        int r = (int) rect.getRight();
        int b = (int) rect.getBottom();
        int id = layoutNode.getSemanticsId();
        if (firstPlacement == false) goto L5;
    L6:
        LayoutNode r6 = layoutNode.getParent$ui_release();
        if (r6 == null) goto L9;
        int r7 = r6.getSemanticsId();
    L10:
        int parentId = r7;
        RectList.insert$default(this.rects, id, l, t, r, b, parentId, false, false, 192, null);
    L11:
        invalidate();
        return;
    L9:
        r7 = -1;
        goto L10
    L5:
        if (this.rects.update(id, l, t, r, b) == true) goto L11;
        goto L6
    }

    private final void insertOrUpdate(LayoutNode layoutNode, boolean firstPlacement, int l, int t, int r, int b) {
        int id = layoutNode.getSemanticsId();
        if (firstPlacement == false) goto L5;
    L6:
        LayoutNode r0 = layoutNode.getParent$ui_release();
        if (r0 == null) goto L9;
        int r1 = r0.getSemanticsId();
    L10:
        int parentId = r1;
        RectList.insert$default(this.rects, id, l, t, r, b, parentId, false, false, 192, null);
    L11:
        invalidate();
        return;
    L9:
        r1 = -1;
        goto L10
    L5:
        if (this.rects.move(id, l, t, r, b) == true) goto L11;
        goto L6
    }

    /* JADX INFO: renamed from: positionInRoot-Bjo55l4, reason: not valid java name */
    private final long m6204positionInRootBjo55l4(NodeCoordinator $this$positionInRoot_u2dBjo55l4) {
        long position = Offset.Companion.m4141getZeroF1C5BW0();
        NodeCoordinator coordinator = $this$positionInRoot_u2dBjo55l4;
    L3:
        if (coordinator == null) goto L17;
        OwnedLayer layer = coordinator.getLayer();
        position = IntOffsetKt.m7116plusNvtHpc(position, coordinator.mo5909getPositionnOccac());
        coordinator = coordinator.getWrappedBy$ui_release();
        if (layer == null) goto L3;
        float[] matrix = layer.mo6027getUnderlyingMatrixsQKQjiQ();
        int analysis = RectManagerKt.m6207access$analyzeComponents58bKbWc(matrix);
        if (analysis == 3) goto L3;
        if ((analysis & 2) != 0) goto L11;
        boolean hasNonTranslationComponents = true;
    L12:
        if (hasNonTranslationComponents == true) goto L14;
        position = Matrix.m4602mapMKHz9U(matrix, position);
        goto L3
    L14:
        return IntOffset.Companion.m7111getMaxnOccac();
    L11:
        hasNonTranslationComponents = false;
        goto L12
    L17:
        return IntOffsetKt.m7118roundk4lQ0M(position);
    }

    private final void boundingRectInRoot(NodeCoordinator $this$boundingRectInRoot, MutableRect rect) {
        NodeCoordinator coordinator = $this$boundingRectInRoot;
    L3:
        if (coordinator == null) goto L9;
        OwnedLayer layer = coordinator.getLayer();
        long $this$toOffset_u2d_u2dgyyYBs$iv = coordinator.mo5909getPositionnOccac();
        float x$iv$iv = IntOffset.m7101getXimpl($this$toOffset_u2d_u2dgyyYBs$iv);
        float y$iv$iv = IntOffset.m7102getYimpl($this$toOffset_u2d_u2dgyyYBs$iv);
        long v1$iv$iv$iv = Float.floatToRawIntBits(x$iv$iv);
        long v2$iv$iv$iv = Float.floatToRawIntBits(y$iv$iv);
        rect.m4110translatek4lQ0M(Offset.m4117constructorimpl((v1$iv$iv$iv << 32) | (v2$iv$iv$iv & 4294967295L)));
        coordinator = coordinator.getWrappedBy$ui_release();
        if (layer == null) goto L3;
        float[] matrix = layer.mo6027getUnderlyingMatrixsQKQjiQ();
        if (MatrixKt.m4621isIdentity58bKbWc(matrix) == true) goto L3;
        Matrix.m4604mapimpl(matrix, rect);
        goto L3
    }

    /* JADX INFO: renamed from: outerToInnerOffset-Bjo55l4, reason: not valid java name */
    private final long m6203outerToInnerOffsetBjo55l4(LayoutNode $this$outerToInnerOffset_u2dBjo55l4) {
        NodeCoordinator terminator = $this$outerToInnerOffset_u2dBjo55l4.getOuterCoordinator$ui_release();
        long position = Offset.Companion.m4141getZeroF1C5BW0();
        NodeCoordinator coordinator = $this$outerToInnerOffset_u2dBjo55l4.getInnerCoordinator$ui_release();
    L3:
        if (coordinator == null) goto L21;
        if (coordinator == terminator) goto L21;
        OwnedLayer layer = coordinator.getLayer();
        position = IntOffsetKt.m7116plusNvtHpc(position, coordinator.mo5909getPositionnOccac());
        coordinator = coordinator.getWrappedBy$ui_release();
        if (layer == null) goto L3;
        float[] matrix = layer.mo6027getUnderlyingMatrixsQKQjiQ();
        int analysis = RectManagerKt.m6207access$analyzeComponents58bKbWc(matrix);
        boolean r10 = true;
        if (analysis != 3) goto L10;
        int $this$isIdentity$iv = 1;
    L11:
        if ($this$isIdentity$iv != 0) goto L3;
        if ((analysis & 2) == 0) goto L16;
        r10 = false;
    L16:
        if (r10 == true) goto L18;
        position = Matrix.m4602mapMKHz9U(matrix, position);
        goto L3
    L18:
        return IntOffset.Companion.m7111getMaxnOccac();
    L10:
        $this$isIdentity$iv = 0;
    L21:
        return IntOffsetKt.m7118roundk4lQ0M(position);
    }

    public final void remove(LayoutNode layoutNode) {
        this.rects.remove(layoutNode.getSemanticsId());
        invalidate();
        this.isFragmented = true;
    }

    public final boolean isTargetDrawnFirst$ui_release(int targetId, int otherId) {
        LayoutNode nodeA = this.layoutNodes.get(targetId);
        if (nodeA != null) goto L5;
        return false;
    L5:
        LayoutNode nodeB = this.layoutNodes.get(otherId);
        if (nodeB != null) goto L9;
        return false;
    L9:
        if (nodeA.getDepth$ui_release() != 0) goto L11;
    L51:
        return false;
    L11:
        if (nodeB.getDepth$ui_release() == 0) goto L51;
    L14:
        if (nodeA.getDepth$ui_release() <= nodeB.getDepth$ui_release()) goto L19;
        LayoutNode r3 = nodeA.getParent$ui_release();
        if (r3 == null) goto L17;
        nodeA = r3;
        goto L14
    L17:
        return false;
    L19:
        if (nodeA != nodeB) goto L22;
        return false;
    L22:
        if (nodeB.getDepth$ui_release() <= nodeA.getDepth$ui_release()) goto L27;
        LayoutNode r4 = nodeB.getParent$ui_release();
        if (r4 == null) goto L25;
        nodeB = r4;
        goto L22
    L25:
        return false;
    L27:
        if (nodeA != nodeB) goto L29;
        return false;
    L29:
        LayoutNode lastParentA = nodeA;
        LayoutNode lastParentB = nodeB;
    L30:
        if (nodeA == nodeB) goto L39;
        lastParentA = nodeA;
        lastParentB = nodeB;
        LayoutNode r5 = nodeA.getParent$ui_release();
        if (r5 == null) goto L33;
        nodeA = r5;
        LayoutNode r6 = nodeB.getParent$ui_release();
        if (r6 == null) goto L36;
        nodeB = r6;
        goto L30
    L36:
        return false;
    L33:
        return false;
    L39:
        if (lastParentA.getMeasurePassDelegate$ui_release().getZIndex$ui_release() != lastParentB.getMeasurePassDelegate$ui_release().getZIndex$ui_release()) goto L41;
        boolean r7 = true;
    L42:
        if (r7 == false) goto L48;
        if (lastParentA.getPlaceOrder$ui_release() < lastParentB.getPlaceOrder$ui_release()) goto L46;
        return false;
    L46:
        return true;
    L48:
        if (lastParentA.getMeasurePassDelegate$ui_release().getZIndex$ui_release() < lastParentB.getMeasurePassDelegate$ui_release().getZIndex$ui_release()) goto L50;
        return false;
    L50:
        return true;
    L41:
        r7 = false;
        goto L42
    }
}
