package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: LazyGridMeasuredItem.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0093\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0002\u0010\u001cJ\u0016\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\bJ\u001d\u0010H\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0004H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bI\u0010JJ\u0012\u0010K\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u0016\u0010L\u001a\u00020E2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\bJ(\u0010P\u001a\u00020E2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020\u00042\u0006\u0010S\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\u0004H\u0016J6\u0010P\u001a\u00020E2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020\u00042\u0006\u0010S\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004J\u000e\u0010U\u001a\u00020E2\u0006\u0010+\u001a\u00020\u0004J+\u0010V\u001a\u00020\u0014*\u00020\u00142\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040XH\u0082\bø\u0001\u0000¢\u0006\u0004\bY\u0010ZR\u000e\u0010\u000f\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0018\u001a\u00020\u0019X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010(R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0014\u0010\u001a\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010,\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0014\u0010.\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u000e\u00100\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00102\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010(\"\u0004\b4\u00105R&\u00106\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0014@RX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010#\u001a\u0004\b7\u0010\"R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00108\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010 R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010:\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b;\u0010 R\u001c\u0010<\u001a\u00020=X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010#\u001a\u0004\b>\u0010\"R\u0014\u0010\u001b\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010 R\u0016\u0010\u0013\u001a\u00020\u0014X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010#R\u0018\u0010@\u001a\u00020\u0004*\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0018\u0010,\u001a\u00020\u0004*\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010C\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006["}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "index", "", "key", "", "isVertical", "", "crossAxisSize", "mainAxisSpacing", "reverseLayout", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "beforeContentPadding", "afterContentPadding", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "visualOffset", "Landroidx/compose/ui/unit/IntOffset;", "contentType", "animator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "lane", "span", "(ILjava/lang/Object;ZIIZLandroidx/compose/ui/unit/LayoutDirection;IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "<set-?>", "column", "getColumn", "()I", "getConstraints-msEJaDk", "()J", "J", "getContentType", "()Ljava/lang/Object;", "getCrossAxisSize", "getIndex", "()Z", "getKey", "getLane", "mainAxisLayoutSize", "mainAxisSize", "getMainAxisSize", "mainAxisSizeWithSpacings", "getMainAxisSizeWithSpacings", "maxMainAxisOffset", "minMainAxisOffset", "nonScrollableItem", "getNonScrollableItem", "setNonScrollableItem", "(Z)V", "offset", "getOffset-nOcc-ac", "placeablesCount", "getPlaceablesCount", "row", "getRow", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "getSpan", "mainAxis", "getMainAxis--gyyYBs", "(J)I", "(Landroidx/compose/ui/layout/Placeable;)I", "applyScrollDelta", "", "delta", "updateAnimations", "getOffset", "getOffset-Bjo55l4", "(I)J", "getParentData", "place", "scope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "isLookingAhead", "position", "mainAxisOffset", "crossAxisOffset", "layoutWidth", "layoutHeight", "updateMainAxisLayoutSize", "copy", "mainAxisMap", "Lkotlin/Function1;", "copy-4Tuh3kE", "(JLkotlin/jvm/functions/Function1;)J", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LazyGridMeasuredItem implements LazyGridItemInfo, LazyLayoutMeasuredItem {
    public static final int $stable = 0;
    private final int afterContentPadding;
    private final LazyLayoutItemAnimator<LazyGridMeasuredItem> animator;
    private final int beforeContentPadding;
    private int column;
    private final long constraints;
    private final Object contentType;
    private final int crossAxisSize;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final int lane;
    private final LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private boolean nonScrollableItem;
    private long offset;
    private final List<Placeable> placeables;
    private final boolean reverseLayout;
    private int row;
    private final long size;
    private final int span;
    private final long visualOffset;

    static {
        $stable = 8;
    }

    public /* synthetic */ LazyGridMeasuredItem(int r1, Object r2, boolean r3, int r4, int r5, boolean r6, LayoutDirection r7, int r8, int r9, List r10, long r11, Object r13, LazyLayoutItemAnimator r14, long r15, int r17, int r18, DefaultConstructorMarker r19) {
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r17, r18);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LazyGridMeasuredItem(int index, Object key, boolean isVertical, int crossAxisSize, int mainAxisSpacing, boolean reverseLayout, LayoutDirection layoutDirection, int beforeContentPadding, int afterContentPadding, List<? extends Placeable> r33, long visualOffset, Object contentType, LazyLayoutItemAnimator<LazyGridMeasuredItem> r37, long constraints, int lane, int span) {
        this.index = index;
        this.key = key;
        this.isVertical = isVertical;
        this.crossAxisSize = crossAxisSize;
        this.reverseLayout = reverseLayout;
        this.layoutDirection = layoutDirection;
        this.beforeContentPadding = beforeContentPadding;
        this.afterContentPadding = afterContentPadding;
        this.placeables = r33;
        this.visualOffset = visualOffset;
        this.contentType = contentType;
        this.animator = r37;
        this.constraints = constraints;
        this.lane = lane;
        this.span = span;
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        List<Placeable> r1 = this.placeables;
        int r2 = r1.size();
        int maxMainAxis = 0;
        int index$iv = 0;
    L3:
        if (index$iv >= r2) goto L9;
        Object item$iv = r1.get(index$iv);
        Placeable it = (Placeable) item$iv;
        if (isVertical() == false) goto L7;
        int r20 = it.getHeight();
    L8:
        maxMainAxis = Math.max(maxMainAxis, r20);
        index$iv = index$iv + 1;
        r1 = r1;
        goto L3
    L7:
        r20 = it.getWidth();
        goto L8
    L9:
        this.mainAxisSize = maxMainAxis;
        this.mainAxisSizeWithSpacings = RangesKt.coerceAtLeast(maxMainAxis + mainAxisSpacing, 0);
        if (isVertical() == false) goto L12;
        int width$iv = this.crossAxisSize;
        int height$iv = this.mainAxisSize;
        long r3 = IntSize.m7139constructorimpl((((long) width$iv) << 32) | (((long) height$iv) & 4294967295L));
    L13:
        this.size = r3;
        this.offset = IntOffset.Companion.m7112getZeronOccac();
        this.row = -1;
        this.column = -1;
        return;
    L12:
        int width$iv2 = this.mainAxisSize;
        int height$iv2 = this.crossAxisSize;
        r3 = IntSize.m7139constructorimpl((((long) width$iv2) << 32) | (((long) height$iv2) & 4294967295L));
        goto L13
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public boolean isVertical() {
        return this.isVertical;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public Object getContentType() {
        return this.contentType;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: getConstraints-msEJaDk */
    public long mo838getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getLane() {
        return this.lane;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getSpan() {
        return this.span;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getPlaceablesCount() {
        return this.placeables.size();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public Object getParentData(int index) {
        return this.placeables.get(index).getParentData();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* JADX INFO: renamed from: getSize-YbymL2g */
    public long mo865getSizeYbymL2g() {
        return this.size;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* JADX INFO: renamed from: getOffset-nOcc-ac */
    public long mo864getOffsetnOccac() {
        return this.offset;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getRow() {
        return this.row;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getColumn() {
        return this.column;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: getOffset-Bjo55l4 */
    public long mo839getOffsetBjo55l4(int index) {
        return mo864getOffsetnOccac();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public boolean getNonScrollableItem() {
        return this.nonScrollableItem;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void setNonScrollableItem(boolean r1) {
        this.nonScrollableItem = r1;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void position(int mainAxisOffset, int crossAxisOffset, int layoutWidth, int layoutHeight) {
        position(mainAxisOffset, crossAxisOffset, layoutWidth, layoutHeight, -1, -1);
    }

    public final void position(int mainAxisOffset, int crossAxisOffset, int layoutWidth, int layoutHeight, int row, int column) {
        if (isVertical() == false) goto L5;
        int r0 = layoutHeight;
    L6:
        this.mainAxisLayoutSize = r0;
        if (isVertical() == false) goto L9;
        int crossAxisLayoutSize = layoutWidth;
    L11:
        if (isVertical() == true) goto L13;
    L15:
        int crossAxisOffset2 = crossAxisOffset;
    L17:
        if (isVertical() == false) goto L19;
        long r3 = 4294967295L & ((long) mainAxisOffset);
        long r2 = IntOffset.m7095constructorimpl(r3 | (((long) crossAxisOffset2) << 32));
    L20:
        this.offset = r2;
        this.row = row;
        this.column = column;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
        return;
    L19:
        long r4 = 4294967295L & ((long) crossAxisOffset2);
        r2 = IntOffset.m7095constructorimpl(r4 | (((long) mainAxisOffset) << 32));
        goto L20
    L13:
        if (this.layoutDirection != LayoutDirection.Rtl) goto L15;
        crossAxisOffset2 = (crossAxisLayoutSize - crossAxisOffset) - this.crossAxisSize;
        goto L17
    L9:
        crossAxisLayoutSize = layoutHeight;
        goto L11
    L5:
        r0 = layoutWidth;
        goto L6
    }

    public final void updateMainAxisLayoutSize(int mainAxisLayoutSize) {
        this.mainAxisLayoutSize = mainAxisLayoutSize;
        this.maxMainAxisOffset = this.afterContentPadding + mainAxisLayoutSize;
    }

    public final void applyScrollDelta(int delta, boolean updateAnimations) {
        LazyGridMeasuredItem r0 = this;
        if (r0.getNonScrollableItem() == false) goto L5;
        return;
    L5:
        long $this$copy_u2d4Tuh3kE$iv = r0.mo864getOffsetnOccac();
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

    public final void place(Placeable.PlacementScope scope, boolean isLookingAhead) {
        Placeable.PlacementScope $this$place_u24lambda_u247 = scope;
        int r9 = 0;
        if (this.mainAxisLayoutSize == Integer.MIN_VALUE) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        InlineClassHelperKt.throwIllegalArgumentException("position() should be called first");
    L9:
        int r10 = getPlaceablesCount();
        int r11 = 0;
    L10:
        if (r11 >= r10) goto L59;
        int index = r11;
        Placeable placeable = this.placeables.get(index);
        int minOffset = this.minMainAxisOffset - getMainAxisSize(placeable);
        int maxOffset = this.maxMainAxisOffset;
        long offset = mo864getOffsetnOccac();
        LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), index);
        if (animation == null) goto L30;
        if (isLookingAhead == false) goto L16;
        animation.m890setLookaheadOffsetgyyYBs(offset);
    L29:
        GraphicsLayer layer = animation.getLayer();
    L32:
        if (this.reverseLayout == false) goto L42;
        long $this$copy_u2d4Tuh3kE$iv = offset;
        if (isVertical() == false) goto L36;
        int mainAxisOffset = IntOffset.m7101getXimpl($this$copy_u2d4Tuh3kE$iv);
    L38:
        if (isVertical() == false) goto L40;
        int mainAxisOffset2 = IntOffset.m7102getYimpl($this$copy_u2d4Tuh3kE$iv);
        int mainAxisOffset3 = this.mainAxisLayoutSize;
        int y$iv$iv = (mainAxisOffset3 - mainAxisOffset2) - getMainAxisSize(placeable);
    L41:
        offset = IntOffset.m7095constructorimpl((((long) mainAxisOffset) << 32) | (((long) y$iv$iv) & 4294967295L));
    L43:
        long offset2 = IntOffset.m7105plusqkQi6aY(offset, this.visualOffset);
        if (isLookingAhead == true) goto L49;
        if (animation == null) goto L49;
        animation.m889setFinalOffsetgyyYBs(offset2);
    L49:
        if (isVertical() == false) goto L53;
        if (layer == null) goto L52;
        $this$place_u24lambda_u247 = $this$place_u24lambda_u247;
        Placeable.PlacementScope.m5783placeWithLayeraW9wM$default($this$place_u24lambda_u247, placeable, offset2, layer, 0.0f, 4, null);
    L57:
        r11 = r11 + 1;
        r9 = r9;
        r10 = r10;
        goto L10
    L52:
        $this$place_u24lambda_u247 = $this$place_u24lambda_u247;
        Placeable.PlacementScope.m5782placeWithLayeraW9wM$default($this$place_u24lambda_u247, placeable, offset2, 0.0f, null, 6, null);
        goto L57
    L53:
        $this$place_u24lambda_u247 = $this$place_u24lambda_u247;
        if (layer == null) goto L56;
        Placeable.PlacementScope.m5781placeRelativeWithLayeraW9wM$default($this$place_u24lambda_u247, placeable, offset2, layer, 0.0f, 4, null);
        goto L57
    L56:
        Placeable.PlacementScope.m5780placeRelativeWithLayeraW9wM$default($this$place_u24lambda_u247, placeable, offset2, 0.0f, null, 6, null);
        goto L57
    L40:
        y$iv$iv = IntOffset.m7102getYimpl($this$copy_u2d4Tuh3kE$iv);
        goto L41
    L36:
        int mainAxisOffset4 = IntOffset.m7101getXimpl($this$copy_u2d4Tuh3kE$iv);
        mainAxisOffset = (this.mainAxisLayoutSize - mainAxisOffset4) - getMainAxisSize(placeable);
        goto L38
    L42:
        layer = layer;
        goto L43
    L16:
        if (IntOffset.m7100equalsimpl0(animation.m886getLookaheadOffsetnOccac(), LazyLayoutItemAnimation.Companion.m892getNotInitializednOccac()) == true) goto L18;
        long targetOffset = animation.m886getLookaheadOffsetnOccac();
    L19:
        long animatedOffset = IntOffset.m7105plusqkQi6aY(targetOffset, animation.m887getPlacementDeltanOccac());
        if (m871getMainAxisgyyYBs(offset) > minOffset) goto L24;
        if (m871getMainAxisgyyYBs(animatedOffset) > minOffset) goto L24;
    L27:
        animation.cancelPlacementAnimation();
    L28:
        offset = animatedOffset;
    L24:
        if (m871getMainAxisgyyYBs(offset) < maxOffset) goto L28;
        if (m871getMainAxisgyyYBs(animatedOffset) < maxOffset) goto L28;
    L18:
        targetOffset = offset;
        goto L19
    L30:
        $this$place_u24lambda_u247 = $this$place_u24lambda_u247;
        r9 = r9;
        r10 = r10;
        layer = null;
        goto L32
    L59:
        return;
    L5:
        value$iv = false;
        goto L7
    }

    /* JADX INFO: renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m871getMainAxisgyyYBs(long $this$mainAxis) {
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
    private final long m870copy4Tuh3kE(long $this$copy_u2d4Tuh3kE, Function1<? super Integer, Integer> r14) {
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
}
