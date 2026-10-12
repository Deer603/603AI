package androidx.compose.foundation.lazy;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: LazyListMeasuredItem.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0015\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u008f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c¢\u0006\u0002\u0010\u001dJ\u0016\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u00042\u0006\u0010H\u001a\u00020\tJ\u001d\u00106\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0004H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bI\u0010JJ\u0012\u0010K\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u0016\u0010L\u001a\u00020F2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\tJ\u001e\u0010P\u001a\u00020F2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020\u00042\u0006\u0010S\u001a\u00020\u0004J(\u0010P\u001a\u00020F2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\u00042\u0006\u0010R\u001a\u00020\u00042\u0006\u0010S\u001a\u00020\u0004H\u0016J\u000e\u0010U\u001a\u00020F2\u0006\u0010+\u001a\u00020\u0004J+\u0010V\u001a\u00020\u0015*\u00020\u00152\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040XH\u0082\bø\u0001\u0000¢\u0006\u0004\bY\u0010ZR\u000e\u0010\u0012\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u00020\u001cX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010'R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0014\u0010)\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010%R\u000e\u0010.\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00100\u001a\u00020\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010'\"\u0004\b2\u00103R\u001e\u00105\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u0004@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b6\u0010%R\u000e\u00107\u001a\u000208X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00109\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010%R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010;\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010%R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010=\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b>\u0010%R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\u00020\u0015X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010 R\u0018\u0010?\u001a\u00020\u0004*\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0018\u0010B\u001a\u00020\u0004*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006["}, d2 = {"Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "index", "", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "isVertical", "", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "reverseLayout", "beforeContentPadding", "afterContentPadding", "spacing", "visualOffset", "Landroidx/compose/ui/unit/IntOffset;", "key", "", "contentType", "animator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "(ILjava/util/List;ZLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZIIIJLjava/lang/Object;Ljava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getConstraints-msEJaDk", "()J", "J", "getContentType", "()Ljava/lang/Object;", "crossAxisSize", "getCrossAxisSize", "()I", "getIndex", "()Z", "getKey", "lane", "getLane", "mainAxisLayoutSize", "mainAxisSizeWithSpacings", "getMainAxisSizeWithSpacings", "maxMainAxisOffset", "minMainAxisOffset", "nonScrollableItem", "getNonScrollableItem", "setNonScrollableItem", "(Z)V", "<set-?>", "offset", "getOffset", "placeableOffsets", "", "placeablesCount", "getPlaceablesCount", "size", "getSize", "span", "getSpan", "mainAxis", "getMainAxis--gyyYBs", "(J)I", "mainAxisSize", "getMainAxisSize", "(Landroidx/compose/ui/layout/Placeable;)I", "applyScrollDelta", "", "delta", "updateAnimations", "getOffset-Bjo55l4", "(I)J", "getParentData", "place", "scope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "isLookingAhead", "position", "mainAxisOffset", "layoutWidth", "layoutHeight", "crossAxisOffset", "updateMainAxisLayoutSize", "copy", "mainAxisMap", "Lkotlin/Function1;", "copy-4Tuh3kE", "(JLkotlin/jvm/functions/Function1;)J", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LazyListMeasuredItem implements LazyListItemInfo, LazyLayoutMeasuredItem {
    public static final int $stable = 0;
    private final int afterContentPadding;
    private final LazyLayoutItemAnimator<LazyListMeasuredItem> animator;
    private final int beforeContentPadding;
    private final long constraints;
    private final Object contentType;
    private final int crossAxisSize;
    private final Alignment.Horizontal horizontalAlignment;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final int lane;
    private final LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private final int mainAxisSizeWithSpacings;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private boolean nonScrollableItem;
    private int offset;
    private final int[] placeableOffsets;
    private final List<Placeable> placeables;
    private final boolean reverseLayout;
    private final int size;
    private final int spacing;
    private final int span;
    private final Alignment.Vertical verticalAlignment;
    private final long visualOffset;

    static {
        $stable = 8;
    }

    public /* synthetic */ LazyListMeasuredItem(int r1, List r2, boolean r3, Alignment.Horizontal r4, Alignment.Vertical r5, LayoutDirection r6, boolean r7, int r8, int r9, int r10, long r11, Object r13, Object r14, LazyLayoutItemAnimator r15, long r16, DefaultConstructorMarker r18) {
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LazyListMeasuredItem(int index, List<? extends Placeable> r24, boolean isVertical, Alignment.Horizontal horizontalAlignment, Alignment.Vertical verticalAlignment, LayoutDirection layoutDirection, boolean reverseLayout, int beforeContentPadding, int afterContentPadding, int spacing, long visualOffset, Object key, Object contentType, LazyLayoutItemAnimator<LazyListMeasuredItem> r37, long constraints) {
        this.index = index;
        this.placeables = r24;
        this.isVertical = isVertical;
        this.horizontalAlignment = horizontalAlignment;
        this.verticalAlignment = verticalAlignment;
        this.layoutDirection = layoutDirection;
        this.reverseLayout = reverseLayout;
        this.beforeContentPadding = beforeContentPadding;
        this.afterContentPadding = afterContentPadding;
        this.spacing = spacing;
        this.visualOffset = visualOffset;
        this.key = key;
        this.contentType = contentType;
        this.animator = r37;
        this.constraints = constraints;
        this.span = 1;
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        List<Placeable> r1 = this.placeables;
        int maxCrossAxis = r1.size();
        int mainAxisSize = 0;
        int index$iv = 0;
        int maxCrossAxis2 = 0;
    L3:
        if (index$iv >= maxCrossAxis) goto L13;
        Object item$iv = r1.get(index$iv);
        Placeable it = (Placeable) item$iv;
        if (isVertical() == false) goto L7;
        int r20 = it.getHeight();
    L8:
        mainAxisSize = mainAxisSize + r20;
        if (isVertical() == true) goto L11;
        int r21 = it.getHeight();
    L12:
        maxCrossAxis2 = Math.max(maxCrossAxis2, r21);
        index$iv = index$iv + 1;
        r1 = r1;
        goto L3
    L11:
        r21 = it.getWidth();
        goto L12
    L7:
        r20 = it.getWidth();
        goto L8
    L13:
        this.size = mainAxisSize;
        this.mainAxisSizeWithSpacings = RangesKt.coerceAtLeast(getSize() + this.spacing, 0);
        this.crossAxisSize = maxCrossAxis2;
        this.placeableOffsets = new int[this.placeables.size() * 2];
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public boolean isVertical() {
        return this.isVertical;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public Object getContentType() {
        return this.contentType;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: getConstraints-msEJaDk, reason: not valid java name */
    public long mo838getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getOffset() {
        return this.offset;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getSize() {
        return this.size;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getLane() {
        return this.lane;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getSpan() {
        return this.span;
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

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getPlaceablesCount() {
        return this.placeables.size();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public Object getParentData(int index) {
        return this.placeables.get(index).getParentData();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void position(int mainAxisOffset, int crossAxisOffset, int layoutWidth, int layoutHeight) {
        position(mainAxisOffset, layoutWidth, layoutHeight);
    }

    public final void position(int mainAxisOffset, int layoutWidth, int layoutHeight) {
        this.offset = mainAxisOffset;
        if (isVertical() == false) goto L5;
        int r2 = layoutHeight;
    L6:
        this.mainAxisLayoutSize = r2;
        List<Placeable> r3 = this.placeables;
        int index$iv = 0;
        int r5 = r3.size();
        int mainAxisOffset2 = mainAxisOffset;
    L7:
        if (index$iv >= r5) goto L21;
        Object item$iv = r3.get(index$iv);
        Placeable placeable = (Placeable) item$iv;
        int index = index$iv;
        int indexInArray = index * 2;
        boolean r12 = isVertical();
        int[] r13 = this.placeableOffsets;
        if (r12 == false) goto L15;
        Alignment.Horizontal r14 = this.horizontalAlignment;
        if (r14 == null) goto L13;
        int $i$f$requirePreconditionNotNull = placeable.getWidth();
        r13[indexInArray] = r14.align($i$f$requirePreconditionNotNull, layoutWidth, this.layoutDirection);
        this.placeableOffsets[indexInArray + 1] = mainAxisOffset2;
        mainAxisOffset2 = mainAxisOffset2 + placeable.getHeight();
    L18:
        index$iv = index$iv + 1;
        goto L7
    L13:
        InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null horizontalAlignment when isVertical == true");
        throw new KotlinNothingValueException();
    L15:
        r13[indexInArray] = mainAxisOffset2;
        int[] r15 = this.placeableOffsets;
        int r16 = indexInArray + 1;
        Alignment.Vertical r17 = this.verticalAlignment;
        if (r17 == null) goto L19;
        int $i$f$requirePreconditionNotNull2 = placeable.getHeight();
        r15[r16] = r17.align($i$f$requirePreconditionNotNull2, layoutHeight);
        mainAxisOffset2 = mainAxisOffset2 + placeable.getWidth();
        goto L18
    L19:
        InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null verticalAlignment when isVertical == false");
        throw new KotlinNothingValueException();
    L21:
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
        return;
    L5:
        r2 = layoutWidth;
        goto L6
    }

    public final void updateMainAxisLayoutSize(int mainAxisLayoutSize) {
        this.mainAxisLayoutSize = mainAxisLayoutSize;
        this.maxMainAxisOffset = this.afterContentPadding + mainAxisLayoutSize;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: getOffset-Bjo55l4, reason: not valid java name */
    public long mo839getOffsetBjo55l4(int index) {
        int x$iv = this.placeableOffsets[index * 2];
        int y$iv = this.placeableOffsets[(index * 2) + 1];
        return IntOffset.m7095constructorimpl((((long) x$iv) << 32) | (((long) y$iv) & 4294967295L));
    }

    public final void applyScrollDelta(int delta, boolean updateAnimations) {
        LazyListMeasuredItem r0 = this;
        if (r0.getNonScrollableItem() == false) goto L5;
        return;
    L5:
        r0.offset = r0.getOffset() + delta;
        int r1 = r0.placeableOffsets.length;
        int index = 0;
        int r3 = 0;
    L6:
        if (r3 >= r1) goto L15;
        int index2 = r3;
        int oddEven = index2 & 1;
        if (r0.isVertical() == false) goto L11;
        if (oddEven == 0) goto L11;
    L13:
        int[] r7 = r0.placeableOffsets;
        r7[index2] = r7[index2] + delta;
    L14:
        r3 = r3 + 1;
    L11:
        if (r0.isVertical() == true) goto L14;
        if (oddEven != 0) goto L14;
    L15:
        if (updateAnimations == false) goto L27;
        int r2 = r0.getPlaceablesCount();
    L17:
        if (index >= r2) goto L35;
        LazyLayoutItemAnimation animation = r0.animator.getAnimation(r0.getKey(), index);
        if (animation == null) goto L25;
        long $this$copy_u2d4Tuh3kE$iv = animation.m888getRawOffsetnOccac();
        if (isVertical() == false) goto L23;
        int x$iv$iv = IntOffset.m7101getXimpl($this$copy_u2d4Tuh3kE$iv);
        int mainAxis = IntOffset.m7102getYimpl($this$copy_u2d4Tuh3kE$iv);
        int y$iv$iv = Integer.valueOf(mainAxis + delta).intValue();
        long r4 = IntOffset.m7095constructorimpl((((long) y$iv$iv) & 4294967295L) | (((long) x$iv$iv) << 32));
    L24:
        animation.m891setRawOffsetgyyYBs(r4);
    L26:
        index = index + 1;
        r0 = this;
        r2 = r2;
        goto L17
    L23:
        int mainAxis2 = IntOffset.m7101getXimpl($this$copy_u2d4Tuh3kE$iv);
        int x$iv$iv2 = Integer.valueOf(mainAxis2 + delta).intValue();
        int y$iv$iv2 = IntOffset.m7102getYimpl($this$copy_u2d4Tuh3kE$iv);
        r4 = IntOffset.m7095constructorimpl((((long) x$iv$iv2) << 32) | (((long) y$iv$iv2) & 4294967295L));
        goto L24
    L25:
        r2 = r2;
        goto L26
    L35:
        return;
    }

    public final void place(Placeable.PlacementScope scope, boolean isLookingAhead) {
        Placeable.PlacementScope $this$place_u24lambda_u2410 = scope;
        if (this.mainAxisLayoutSize == Integer.MIN_VALUE) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        InlineClassHelperKt.throwIllegalArgumentException("position() should be called first");
    L9:
        int r10 = getPlaceablesCount();
        int r11 = 0;
    L10:
        if (r11 >= r10) goto L55;
        int index = r11;
        Placeable placeable = this.placeables.get(index);
        int minOffset = this.minMainAxisOffset - getMainAxisSize(placeable);
        int maxOffset = this.maxMainAxisOffset;
        long targetOffset = mo839getOffsetBjo55l4(index);
        LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), index);
        if (animation == null) goto L30;
        if (isLookingAhead == false) goto L16;
        animation.m890setLookaheadOffsetgyyYBs(targetOffset);
    L29:
        GraphicsLayer layer = animation.getLayer();
    L32:
        if (this.reverseLayout == false) goto L39;
        long $this$copy_u2d4Tuh3kE$iv = targetOffset;
        if (isVertical() == false) goto L36;
        int x$iv$iv = IntOffset.m7101getXimpl($this$copy_u2d4Tuh3kE$iv);
        int mainAxisOffset = IntOffset.m7102getYimpl($this$copy_u2d4Tuh3kE$iv);
        int y$iv$iv = (this.mainAxisLayoutSize - mainAxisOffset) - getMainAxisSize(placeable);
        targetOffset = IntOffset.m7095constructorimpl((((long) y$iv$iv) & 4294967295L) | (((long) x$iv$iv) << 32));
        goto L39
    L36:
        int mainAxisOffset2 = IntOffset.m7101getXimpl($this$copy_u2d4Tuh3kE$iv);
        int x$iv$iv2 = (this.mainAxisLayoutSize - mainAxisOffset2) - getMainAxisSize(placeable);
        int y$iv$iv2 = IntOffset.m7102getYimpl($this$copy_u2d4Tuh3kE$iv);
        targetOffset = IntOffset.m7095constructorimpl((((long) x$iv$iv2) << 32) | (((long) y$iv$iv2) & 4294967295L));
    L39:
        long offset = IntOffset.m7105plusqkQi6aY(targetOffset, this.visualOffset);
        if (isLookingAhead == true) goto L45;
        if (animation == null) goto L45;
        animation.m889setFinalOffsetgyyYBs(offset);
    L45:
        if (isVertical() == false) goto L49;
        if (layer == 0) goto L48;
        $this$place_u24lambda_u2410 = $this$place_u24lambda_u2410;
        Placeable.PlacementScope.m5783placeWithLayeraW9wM$default($this$place_u24lambda_u2410, placeable, offset, layer, 0.0f, 4, null);
    L53:
        r11 = r11 + 1;
        goto L10
    L48:
        $this$place_u24lambda_u2410 = $this$place_u24lambda_u2410;
        Placeable.PlacementScope.m5782placeWithLayeraW9wM$default($this$place_u24lambda_u2410, placeable, offset, 0.0f, null, 6, null);
        goto L53
    L49:
        $this$place_u24lambda_u2410 = $this$place_u24lambda_u2410;
        if (layer == 0) goto L52;
        Placeable.PlacementScope.m5781placeRelativeWithLayeraW9wM$default($this$place_u24lambda_u2410, placeable, offset, layer, 0.0f, 4, null);
        goto L53
    L52:
        Placeable.PlacementScope.m5780placeRelativeWithLayeraW9wM$default($this$place_u24lambda_u2410, placeable, offset, 0.0f, null, 6, null);
        goto L53
    L16:
        if (IntOffset.m7100equalsimpl0(animation.m886getLookaheadOffsetnOccac(), LazyLayoutItemAnimation.Companion.m892getNotInitializednOccac()) == true) goto L18;
        long targetOffset2 = animation.m886getLookaheadOffsetnOccac();
    L19:
        long animatedOffset = IntOffset.m7105plusqkQi6aY(targetOffset2, animation.m887getPlacementDeltanOccac());
        if (m837getMainAxisgyyYBs(targetOffset2) > minOffset) goto L24;
        if (m837getMainAxisgyyYBs(animatedOffset) > minOffset) goto L24;
    L27:
        animation.cancelPlacementAnimation();
    L28:
        targetOffset = animatedOffset;
    L24:
        if (m837getMainAxisgyyYBs(targetOffset2) < maxOffset) goto L28;
        if (m837getMainAxisgyyYBs(animatedOffset) < maxOffset) goto L28;
    L18:
        targetOffset2 = targetOffset;
        goto L19
    L30:
        $this$place_u24lambda_u2410 = $this$place_u24lambda_u2410;
        layer = null;
        goto L32
    L55:
        return;
    L5:
        value$iv = false;
        goto L7
    }

    /* JADX INFO: renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m837getMainAxisgyyYBs(long $this$mainAxis) {
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
    private final long m836copy4Tuh3kE(long $this$copy_u2d4Tuh3kE, Function1<? super Integer, Integer> r15) {
        if (isVertical() == false) goto L5;
        int x$iv = IntOffset.m7101getXimpl($this$copy_u2d4Tuh3kE);
        int y$iv = r15.invoke(Integer.valueOf(IntOffset.m7102getYimpl($this$copy_u2d4Tuh3kE))).intValue();
        long r2 = 4294967295L & ((long) y$iv);
        return IntOffset.m7095constructorimpl(r2 | (((long) x$iv) << 32));
    L5:
        int x$iv2 = r15.invoke(Integer.valueOf(IntOffset.m7101getXimpl($this$copy_u2d4Tuh3kE))).intValue();
        int y$iv2 = IntOffset.m7102getYimpl($this$copy_u2d4Tuh3kE);
        long r3 = 4294967295L & ((long) y$iv2);
        return IntOffset.m7095constructorimpl(r3 | (((long) x$iv2) << 32));
    }
}
