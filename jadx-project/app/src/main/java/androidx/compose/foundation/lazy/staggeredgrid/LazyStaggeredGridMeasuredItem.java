package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: LazyStaggeredGridMeasure.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\u0016\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u000bJ\u001d\u0010D\u001a\u0002032\u0006\u0010\u0003\u001a\u00020\u0004H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bE\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u001e\u0010H\u001a\u00020A2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u000bJ\u001e\u0010N\u001a\u00020A2\u0006\u0010<\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0004J(\u0010N\u001a\u00020A2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020\u0004H\u0016J\b\u0010S\u001a\u00020TH\u0016J\u000e\u0010U\u001a\u00020A2\u0006\u0010&\u001a\u00020\u0004J+\u0010V\u001a\u000203*\u0002032\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040XH\u0082\bø\u0001\u0000¢\u0006\u0004\bY\u0010ZR\u000e\u0010\u0010\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u00020\u0015X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010 R\u001a\u0010!\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010 \"\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0014\u0010\r\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u000e\u0010&\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010'\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b(\u0010\u001eR\u0011\u0010)\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0014\u0010+\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u000e\u0010-\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010/\u001a\u00020\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010 \"\u0004\b1\u0010#R&\u00104\u001a\u0002032\u0006\u00102\u001a\u000203@RX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b5\u0010\u0018R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u001eR\u001c\u00108\u001a\u000209X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b:\u0010\u0018R\u0014\u0010\u000e\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\u001eR\u0018\u0010<\u001a\u00020\u0004*\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0019\u0010)\u001a\u00020\u0004*\u00020\t8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010?\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006["}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "index", "", "key", "", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "isVertical", "", "spacing", "lane", "span", "beforeContentPadding", "afterContentPadding", "contentType", "animator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "(ILjava/lang/Object;Ljava/util/List;ZIIIIILjava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getConstraints-msEJaDk", "()J", "J", "getContentType", "()Ljava/lang/Object;", "crossAxisSize", "getCrossAxisSize", "()I", "getIndex", "()Z", "isVisible", "setVisible", "(Z)V", "getKey", "getLane", "mainAxisLayoutSize", "mainAxisOffset", "getMainAxisOffset", "mainAxisSize", "getMainAxisSize", "mainAxisSizeWithSpacings", "getMainAxisSizeWithSpacings", "maxMainAxisOffset", "minMainAxisOffset", "nonScrollableItem", "getNonScrollableItem", "setNonScrollableItem", "<set-?>", "Landroidx/compose/ui/unit/IntOffset;", "offset", "getOffset-nOcc-ac", "placeablesCount", "getPlaceablesCount", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "getSpan", "mainAxis", "getMainAxis--gyyYBs", "(J)I", "(Landroidx/compose/ui/layout/Placeable;)I", "applyScrollDelta", "", "delta", "updateAnimations", "getOffset", "getOffset-Bjo55l4", "(I)J", "getParentData", "place", "scope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "context", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "isLookingAhead", "position", "crossAxis", "crossAxisOffset", "layoutWidth", "layoutHeight", "toString", "", "updateMainAxisLayoutSize", "copy", "mainAxisMap", "Lkotlin/Function1;", "copy-4Tuh3kE", "(JLkotlin/jvm/functions/Function1;)J", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LazyStaggeredGridMeasuredItem implements LazyStaggeredGridItemInfo, LazyLayoutMeasuredItem {
    public static final int $stable = 0;
    private final int afterContentPadding;
    private final LazyLayoutItemAnimator<LazyStaggeredGridMeasuredItem> animator;
    private final int beforeContentPadding;
    private final long constraints;
    private final Object contentType;
    private final int crossAxisSize;
    private final int index;
    private final boolean isVertical;
    private boolean isVisible;
    private final Object key;
    private final int lane;
    private int mainAxisLayoutSize;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private boolean nonScrollableItem;
    private long offset;
    private final List<Placeable> placeables;
    private final long size;
    private final int span;

    static {
        $stable = 8;
    }

    public /* synthetic */ LazyStaggeredGridMeasuredItem(int r1, Object r2, List r3, boolean r4, int r5, int r6, int r7, int r8, int r9, Object r10, LazyLayoutItemAnimator r11, long r12, DefaultConstructorMarker r14) {
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LazyStaggeredGridMeasuredItem(int index, Object key, List<? extends Placeable> r24, boolean isVertical, int spacing, int lane, int span, int beforeContentPadding, int afterContentPadding, Object contentType, LazyLayoutItemAnimator<LazyStaggeredGridMeasuredItem> r32, long constraints) {
        this.index = index;
        this.key = key;
        this.placeables = r24;
        this.isVertical = isVertical;
        this.lane = lane;
        this.span = span;
        this.beforeContentPadding = beforeContentPadding;
        this.afterContentPadding = afterContentPadding;
        this.contentType = contentType;
        this.animator = r32;
        this.constraints = constraints;
        this.isVisible = true;
        List<Placeable> r13 = this.placeables;
        int defaultValue$iv = 0;
        if (r13.isEmpty() == true) goto L23;
        Placeable placeable = r13.get(0);
        if (isVertical() == false) goto L8;
        int maxValue$iv = placeable.getHeight();
    L9:
        int i$iv = 1;
        int r2 = CollectionsKt.getLastIndex(r13);
        if (1 > r2) goto L22;
        int maxValue$iv2 = maxValue$iv;
    L12:
        Placeable placeable2 = r13.get(i$iv);
        if (isVertical() == false) goto L15;
        int r19 = placeable2.getHeight();
    L16:
        int v$iv = r19;
        if (v$iv <= maxValue$iv2) goto L19;
        maxValue$iv2 = v$iv;
    L19:
        if (i$iv == r2) goto L21;
        i$iv = i$iv + 1;
        goto L12
    L21:
        maxValue$iv = maxValue$iv2;
        goto L22
    L15:
        r19 = placeable2.getWidth();
    L22:
        defaultValue$iv = maxValue$iv;
        goto L23
    L8:
        maxValue$iv = placeable.getWidth();
    L23:
        this.mainAxisSize = defaultValue$iv;
        this.mainAxisSizeWithSpacings = RangesKt.coerceAtLeast(this.mainAxisSize + spacing, 0);
        List<Placeable> r1 = this.placeables;
        int defaultValue$iv2 = 0;
        if (r1.isEmpty() == true) goto L42;
        Placeable it = r1.get(0);
        if (isVertical() == false) goto L29;
        int maxValue$iv3 = it.getWidth();
    L30:
        int i$iv2 = 1;
        int r14 = CollectionsKt.getLastIndex(r1);
        if (1 > r14) goto L41;
    L32:
        Placeable it2 = r1.get(i$iv2);
        if (isVertical() == false) goto L35;
        int r17 = it2.getWidth();
    L36:
        int v$iv2 = r17;
        if (v$iv2 <= maxValue$iv3) goto L39;
        maxValue$iv3 = v$iv2;
    L39:
        if (i$iv2 == r14) goto L41;
        i$iv2 = i$iv2 + 1;
        goto L32
    L35:
        r17 = it2.getHeight();
    L41:
        defaultValue$iv2 = maxValue$iv3;
        goto L42
    L29:
        maxValue$iv3 = it.getHeight();
    L42:
        this.crossAxisSize = defaultValue$iv2;
        this.mainAxisLayoutSize = -1;
        if (isVertical() == false) goto L45;
        int width$iv = this.crossAxisSize;
        int height$iv = this.mainAxisSize;
        long r3 = IntSize.m7139constructorimpl((((long) width$iv) << 32) | (((long) height$iv) & 4294967295L));
    L46:
        this.size = r3;
        this.offset = IntOffset.Companion.m7112getZeronOccac();
        return;
    L45:
        int width$iv2 = this.mainAxisSize;
        int height$iv2 = this.crossAxisSize;
        long r4 = ((long) height$iv2) & 4294967295L;
        r3 = IntSize.m7139constructorimpl(r4 | (((long) width$iv2) << 32));
        goto L46
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public boolean isVertical() {
        return this.isVertical;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getLane() {
        return this.lane;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getSpan() {
        return this.span;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    public Object getContentType() {
        return this.contentType;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: getConstraints-msEJaDk */
    public long mo838getConstraintsmsEJaDk() {
        return this.constraints;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void setVisible(boolean r1) {
        this.isVisible = r1;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getPlaceablesCount() {
        return this.placeables.size();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public Object getParentData(int index) {
        return this.placeables.get(index).getParentData();
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public boolean getNonScrollableItem() {
        return this.nonScrollableItem;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void setNonScrollableItem(boolean r1) {
        this.nonScrollableItem = r1;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* JADX INFO: renamed from: getSize-YbymL2g */
    public long mo932getSizeYbymL2g() {
        return this.size;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* JADX INFO: renamed from: getOffset-nOcc-ac */
    public long mo931getOffsetnOccac() {
        return this.offset;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: getOffset-Bjo55l4 */
    public long mo839getOffsetBjo55l4(int index) {
        return mo931getOffsetnOccac();
    }

    public final void position(int mainAxis, int crossAxis, int mainAxisLayoutSize) {
        this.mainAxisLayoutSize = mainAxisLayoutSize;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.afterContentPadding + mainAxisLayoutSize;
        if (isVertical() == false) goto L5;
        long r1 = 4294967295L & ((long) mainAxis);
        long r0 = IntOffset.m7095constructorimpl(r1 | (((long) crossAxis) << 32));
    L6:
        this.offset = r0;
        return;
    L5:
        long r2 = 4294967295L & ((long) crossAxis);
        r0 = IntOffset.m7095constructorimpl(r2 | (((long) mainAxis) << 32));
        goto L6
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void position(int mainAxisOffset, int crossAxisOffset, int layoutWidth, int layoutHeight) {
        if (isVertical() == false) goto L5;
        int r0 = layoutHeight;
    L6:
        position(mainAxisOffset, crossAxisOffset, r0);
        return;
    L5:
        r0 = layoutWidth;
        goto L6
    }

    public final int getMainAxisOffset() {
        if (isVertical() == true) goto L6;
        return IntOffset.m7101getXimpl(mo931getOffsetnOccac());
    L6:
        return IntOffset.m7102getYimpl(mo931getOffsetnOccac());
    }

    public final void place(Placeable.PlacementScope scope, LazyStaggeredGridMeasureContext context, boolean isLookingAhead) {
        LazyStaggeredGridMeasuredItem r0 = this;
        LazyStaggeredGridMeasureContext $this$place_u24lambda_u246 = context;
        int r2 = 0;
        if (r0.mainAxisLayoutSize == (-1)) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        InlineClassHelperKt.throwIllegalArgumentException("position() should be called first");
    L9:
        int r3 = 0;
        List<Placeable> r4 = r0.placeables;
        int $i$f$fastForEachIndexed = 0;
        int r14 = r4.size();
        int index$iv = 0;
    L10:
        if (index$iv >= r14) goto L65;
        Object item$iv = r4.get(index$iv);
        Placeable placeable = (Placeable) item$iv;
        int index = index$iv;
        int r9 = r0.minMainAxisOffset;
        if (isVertical() == false) goto L14;
        int r13 = placeable.getHeight();
    L15:
        int minOffset = r9 - r13;
        int maxOffset = r0.maxMainAxisOffset;
        long offset = r0.mo931getOffsetnOccac();
        LazyStaggeredGridMeasureContext $this$place_u24lambda_u247 = $this$place_u24lambda_u246;
        LazyLayoutItemAnimation animation = r0.animator.getAnimation(r0.getKey(), index);
        if (animation == null) goto L34;
        if (isLookingAhead == false) goto L20;
        animation.m890setLookaheadOffsetgyyYBs(offset);
    L33:
        GraphicsLayer layer = animation.getLayer();
    L36:
        if ($this$place_u24lambda_u247.getReverseLayout() == false) goto L54;
        long $this$copy_u2d4Tuh3kE$iv = offset;
        if (isVertical() == false) goto L40;
        int mainAxisOffset = IntOffset.m7101getXimpl($this$copy_u2d4Tuh3kE$iv);
    L46:
        if (isVertical() == false) goto L52;
        int mainAxisOffset2 = IntOffset.m7102getYimpl($this$copy_u2d4Tuh3kE$iv);
        int mainAxisOffset3 = r0.mainAxisLayoutSize;
        int r5 = mainAxisOffset3 - mainAxisOffset2;
        if (isVertical() == false) goto L50;
        int r30 = placeable.getHeight();
    L51:
        int y$iv$iv = r5 - r30;
    L53:
        int x$iv$iv = mainAxisOffset;
        offset = IntOffset.m7095constructorimpl((((long) x$iv$iv) << 32) | (((long) y$iv$iv) & 4294967295L));
    L55:
        long offset2 = IntOffset.m7105plusqkQi6aY(offset, $this$place_u24lambda_u247.m936getContentOffsetnOccac());
        if (isLookingAhead == true) goto L60;
        if (animation == null) goto L60;
        animation.m889setFinalOffsetgyyYBs(offset2);
    L60:
        if (layer == null) goto L62;
        Placeable.PlacementScope.m5781placeRelativeWithLayeraW9wM$default(scope, placeable, offset2, layer, 0.0f, 4, null);
    L63:
        index$iv = index$iv + 1;
        r0 = this;
        $this$place_u24lambda_u246 = $this$place_u24lambda_u247;
        r2 = r2;
        r3 = r3;
        r4 = r4;
        $i$f$fastForEachIndexed = $i$f$fastForEachIndexed;
        goto L10
    L62:
        Placeable.PlacementScope.m5780placeRelativeWithLayeraW9wM$default(scope, placeable, offset2, 0.0f, null, 6, null);
        goto L63
    L50:
        r30 = placeable.getWidth();
        goto L51
    L52:
        y$iv$iv = IntOffset.m7102getYimpl($this$copy_u2d4Tuh3kE$iv);
        goto L53
    L40:
        int mainAxisOffset4 = IntOffset.m7101getXimpl($this$copy_u2d4Tuh3kE$iv);
        int r6 = r0.mainAxisLayoutSize - mainAxisOffset4;
        if (isVertical() == false) goto L43;
        int r29 = placeable.getHeight();
    L44:
        mainAxisOffset = r6 - r29;
        goto L46
    L43:
        r29 = placeable.getWidth();
        goto L44
    L54:
        layer = layer;
        goto L55
    L20:
        if (IntOffset.m7100equalsimpl0(animation.m886getLookaheadOffsetnOccac(), LazyLayoutItemAnimation.Companion.m892getNotInitializednOccac()) == true) goto L22;
        long targetOffset = animation.m886getLookaheadOffsetnOccac();
    L23:
        long animatedOffset = IntOffset.m7105plusqkQi6aY(targetOffset, animation.m887getPlacementDeltanOccac());
        if (r0.m949getMainAxisgyyYBs(offset) > minOffset) goto L28;
        if (r0.m949getMainAxisgyyYBs(animatedOffset) > minOffset) goto L28;
    L31:
        animation.cancelPlacementAnimation();
    L32:
        offset = animatedOffset;
    L28:
        if (r0.m949getMainAxisgyyYBs(offset) < maxOffset) goto L32;
        if (r0.m949getMainAxisgyyYBs(animatedOffset) < maxOffset) goto L32;
    L22:
        targetOffset = offset;
        goto L23
    L34:
        r2 = r2;
        r3 = r3;
        r4 = r4;
        $i$f$fastForEachIndexed = $i$f$fastForEachIndexed;
        layer = null;
        goto L36
    L14:
        r13 = placeable.getWidth();
        goto L15
    L65:
        return;
    L5:
        value$iv = false;
        goto L7
    }

    public final void updateMainAxisLayoutSize(int mainAxisLayoutSize) {
        this.mainAxisLayoutSize = mainAxisLayoutSize;
        this.maxMainAxisOffset = this.afterContentPadding + mainAxisLayoutSize;
    }

    public final void applyScrollDelta(int delta, boolean updateAnimations) {
        LazyStaggeredGridMeasuredItem r0 = this;
        if (r0.getNonScrollableItem() == false) goto L5;
        return;
    L5:
        long $this$copy_u2d4Tuh3kE$iv = r0.mo931getOffsetnOccac();
        if (isVertical() == false) goto L8;
        int it = IntOffset.m7101getXimpl($this$copy_u2d4Tuh3kE$iv);
    L10:
        if (isVertical() == false) goto L12;
        int it2 = IntOffset.m7102getYimpl($this$copy_u2d4Tuh3kE$iv);
        int it3 = it2 + delta;
    L13:
        long r14 = 4294967295L;
        r0.offset = IntOffset.m7095constructorimpl((((long) it) << 32) | (((long) it3) & 4294967295L));
        if (updateAnimations == false) goto L30;
        int r1 = r0.getPlaceablesCount();
        int r2 = 0;
    L16:
        if (r2 >= r1) goto L34;
        int index = r2;
        LazyLayoutItemAnimation animation = r0.animator.getAnimation(r0.getKey(), index);
        if (animation == null) goto L28;
        long $this$copy_u2d4Tuh3kE$iv2 = animation.m888getRawOffsetnOccac();
        if (isVertical() == false) goto L22;
        int x$iv$iv = IntOffset.m7101getXimpl($this$copy_u2d4Tuh3kE$iv2);
    L24:
        if (isVertical() == false) goto L26;
        int mainAxis = IntOffset.m7102getYimpl($this$copy_u2d4Tuh3kE$iv2);
        int y$iv$iv = Integer.valueOf(mainAxis + delta).intValue();
    L27:
        long r17 = r14;
        long r3 = ((long) y$iv$iv) & r17;
        animation.m891setRawOffsetgyyYBs(IntOffset.m7095constructorimpl(r3 | (((long) x$iv$iv) << 32)));
    L29:
        r2 = r2 + 1;
        r0 = this;
        r14 = r17;
        r1 = r1;
        goto L16
    L26:
        y$iv$iv = IntOffset.m7102getYimpl($this$copy_u2d4Tuh3kE$iv2);
        goto L27
    L22:
        int mainAxis2 = IntOffset.m7101getXimpl($this$copy_u2d4Tuh3kE$iv2);
        x$iv$iv = Integer.valueOf(mainAxis2 + delta).intValue();
        goto L24
    L28:
        r17 = r14;
        goto L29
    L34:
        return;
    L30:
        return;
    L12:
        it3 = IntOffset.m7102getYimpl($this$copy_u2d4Tuh3kE$iv);
        goto L13
    L8:
        int it4 = IntOffset.m7101getXimpl($this$copy_u2d4Tuh3kE$iv);
        it = it4 + delta;
        goto L10
    }

    /* JADX INFO: renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m949getMainAxisgyyYBs(long $this$mainAxis) {
        if (isVertical() == false) goto L6;
        return IntOffset.m7102getYimpl($this$mainAxis);
    L6:
        return IntOffset.m7101getXimpl($this$mainAxis);
    }

    private final int getMainAxisSize(Placeable $this$mainAxisSize) {
        if (isVertical() == false) goto L6;
        return $this$mainAxisSize.getHeight();
    L6:
        return $this$mainAxisSize.getWidth();
    }

    /* JADX INFO: renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m948copy4Tuh3kE(long $this$copy_u2d4Tuh3kE, Function1<? super Integer, Integer> r14) {
        if (isVertical() == false) goto L5;
        int x$iv = IntOffset.m7101getXimpl($this$copy_u2d4Tuh3kE);
    L7:
        if (isVertical() == false) goto L9;
        int y$iv = r14.invoke(Integer.valueOf(IntOffset.m7102getYimpl($this$copy_u2d4Tuh3kE))).intValue();
    L11:
        return IntOffset.m7095constructorimpl((((long) x$iv) << 32) | (((long) y$iv) & 4294967295L));
    L9:
        y$iv = IntOffset.m7102getYimpl($this$copy_u2d4Tuh3kE);
        goto L11
    L5:
        x$iv = r14.invoke(Integer.valueOf(IntOffset.m7101getXimpl($this$copy_u2d4Tuh3kE))).intValue();
        goto L7
    }

    public String toString() {
        return super.toString();
    }
}
