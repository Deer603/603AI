package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: MeasuredPage.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\u000e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0003J\u001d\u0010!\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u000e\u0010.\u001a\u00020*2\u0006\u0010/\u001a\u000200J\u001e\u00101\u001a\u00020*2\u0006\u0010 \u001a\u00020\u00032\u0006\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u0003J+\u00104\u001a\u00020\t*\u00020\t2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000306H\u0082\bø\u0001\u0000¢\u0006\u0004\b7\u00108R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u000e\u0010\u001b\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u00020\tX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010%R\u0018\u0010&\u001a\u00020\u0003*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"Landroidx/compose/foundation/pager/MeasuredPage;", "Landroidx/compose/foundation/pager/PageInfo;", "index", "", "size", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "visualOffset", "Landroidx/compose/ui/unit/IntOffset;", "key", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "reverseLayout", "", "(IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "crossAxisSize", "getCrossAxisSize", "()I", "getIndex", "isVertical", "getKey", "()Ljava/lang/Object;", "mainAxisLayoutSize", "<set-?>", "offset", "getOffset", "placeableOffsets", "", "getSize", "J", "mainAxisSize", "getMainAxisSize", "(Landroidx/compose/ui/layout/Placeable;)I", "applyScrollDelta", "", "delta", "getOffset-Bjo55l4", "(I)J", "place", "scope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "position", "layoutWidth", "layoutHeight", "copy", "mainAxisMap", "Lkotlin/Function1;", "copy-4Tuh3kE", "(JLkotlin/jvm/functions/Function1;)J", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MeasuredPage implements PageInfo {
    public static final int $stable = 0;
    private final int crossAxisSize;
    private final Alignment.Horizontal horizontalAlignment;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private int offset;
    private final int[] placeableOffsets;
    private final List<Placeable> placeables;
    private final boolean reverseLayout;
    private final int size;
    private final Alignment.Vertical verticalAlignment;
    private final long visualOffset;

    static {
        $stable = 8;
    }

    public /* synthetic */ MeasuredPage(int r1, int r2, List r3, long r4, Object r6, Orientation r7, Alignment.Horizontal r8, Alignment.Vertical r9, LayoutDirection r10, boolean r11, DefaultConstructorMarker r12) {
        this(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private MeasuredPage(int index, int size, List<? extends Placeable> r23, long visualOffset, Object key, Orientation orientation, Alignment.Horizontal horizontalAlignment, Alignment.Vertical verticalAlignment, LayoutDirection layoutDirection, boolean reverseLayout) {
        this.index = index;
        this.size = size;
        this.placeables = r23;
        this.visualOffset = visualOffset;
        this.key = key;
        this.horizontalAlignment = horizontalAlignment;
        this.verticalAlignment = verticalAlignment;
        this.layoutDirection = layoutDirection;
        this.reverseLayout = reverseLayout;
        if (orientation != Orientation.Vertical) goto L5;
        boolean r11 = true;
    L6:
        this.isVertical = r11;
        int maxCrossAxis = 0;
        List<Placeable> r13 = this.placeables;
        int index$iv = 0;
        int r1 = r13.size();
    L7:
        if (index$iv >= r1) goto L13;
        Object item$iv = r13.get(index$iv);
        Placeable it = (Placeable) item$iv;
        int r19 = r1;
        if (this.isVertical == true) goto L11;
        int r2 = it.getHeight();
    L12:
        maxCrossAxis = Math.max(maxCrossAxis, r2);
        index$iv = index$iv + 1;
        r1 = r19;
        goto L7
    L11:
        r2 = it.getWidth();
        goto L12
    L13:
        this.crossAxisSize = maxCrossAxis;
        this.placeableOffsets = new int[this.placeables.size() * 2];
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        return;
    L5:
        r11 = false;
        goto L6
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public int getIndex() {
        return this.index;
    }

    public final int getSize() {
        return this.size;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public Object getKey() {
        return this.key;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public int getOffset() {
        return this.offset;
    }

    public final void position(int offset, int layoutWidth, int layoutHeight) {
        MeasuredPage r0 = this;
        r0.offset = offset;
        if (r0.isVertical == false) goto L5;
        int r2 = layoutHeight;
    L6:
        r0.mainAxisLayoutSize = r2;
        int mainAxisOffset = offset;
        List<Placeable> r3 = r0.placeables;
        int index$iv = 0;
        int r6 = r3.size();
    L7:
        if (index$iv >= r6) goto L22;
        Object item$iv = r3.get(index$iv);
        Placeable placeable = (Placeable) item$iv;
        int index = index$iv;
        int indexInArray = index * 2;
        boolean r12 = r0.isVertical;
        int[] r13 = r0.placeableOffsets;
        if (r12 == false) goto L15;
        Alignment.Horizontal r14 = r0.horizontalAlignment;
        if (r14 == null) goto L13;
        int $i$f$requirePreconditionNotNull = placeable.getWidth();
        r13[indexInArray] = r14.align($i$f$requirePreconditionNotNull, layoutWidth, r0.layoutDirection);
        r0.placeableOffsets[indexInArray + 1] = mainAxisOffset;
        mainAxisOffset = mainAxisOffset + placeable.getHeight();
    L18:
        index$iv = index$iv + 1;
        r0 = this;
        goto L7
    L13:
        InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null horizontalAlignment");
        throw new KotlinNothingValueException();
    L15:
        r13[indexInArray] = mainAxisOffset;
        int[] r15 = r0.placeableOffsets;
        int r16 = indexInArray + 1;
        Alignment.Vertical r17 = r0.verticalAlignment;
        if (r17 == null) goto L19;
        int $i$f$requirePreconditionNotNull2 = placeable.getHeight();
        r15[r16] = r17.align($i$f$requirePreconditionNotNull2, layoutHeight);
        mainAxisOffset = mainAxisOffset + placeable.getWidth();
        goto L18
    L19:
        InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null verticalAlignment");
        throw new KotlinNothingValueException();
    L22:
        return;
    L5:
        r2 = layoutWidth;
        goto L6
    }

    public final void place(Placeable.PlacementScope scope) {
        Placeable.PlacementScope $this$place_u24lambda_u247 = scope;
        if (this.mainAxisLayoutSize == Integer.MIN_VALUE) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        InlineClassHelperKt.throwIllegalArgumentException("position() should be called first");
    L9:
        int r10 = this.placeables.size();
        int r11 = 0;
    L10:
        if (r11 >= r10) goto L29;
        int index = r11;
        Placeable placeable = this.placeables.get(index);
        long offset = m967getOffsetBjo55l4(index);
        if (this.reverseLayout == true) goto L14;
        $this$place_u24lambda_u247 = $this$place_u24lambda_u247;
    L23:
        long offset2 = IntOffset.m7105plusqkQi6aY(offset, this.visualOffset);
        if (this.isVertical == false) goto L26;
        $this$place_u24lambda_u247 = $this$place_u24lambda_u247;
        Placeable.PlacementScope.m5782placeWithLayeraW9wM$default($this$place_u24lambda_u247, placeable, offset2, 0.0f, null, 6, null);
    L27:
        r11 = r11 + 1;
        goto L10
    L26:
        $this$place_u24lambda_u247 = $this$place_u24lambda_u247;
        Placeable.PlacementScope.m5780placeRelativeWithLayeraW9wM$default($this$place_u24lambda_u247, placeable, offset2, 0.0f, null, 6, null);
        goto L27
    L14:
        if (this.isVertical == false) goto L16;
        int mainAxisOffset = IntOffset.m7101getXimpl(offset);
    L18:
        if (this.isVertical == false) goto L20;
        int mainAxisOffset2 = IntOffset.m7102getYimpl(offset);
        int mainAxisOffset3 = this.mainAxisLayoutSize;
        int y$iv$iv = (mainAxisOffset3 - mainAxisOffset2) - getMainAxisSize(placeable);
    L21:
        offset = IntOffset.m7095constructorimpl((((long) mainAxisOffset) << 32) | (((long) y$iv$iv) & 4294967295L));
        goto L23
    L20:
        y$iv$iv = IntOffset.m7102getYimpl(offset);
        goto L21
    L16:
        int mainAxisOffset4 = IntOffset.m7101getXimpl(offset);
        mainAxisOffset = (this.mainAxisLayoutSize - mainAxisOffset4) - getMainAxisSize(placeable);
        goto L18
    L29:
        return;
    L5:
        value$iv = false;
        goto L7
    }

    public final void applyScrollDelta(int delta) {
        this.offset = getOffset() + delta;
        int r0 = this.placeableOffsets.length;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L14;
        int index = r1;
        if (this.isVertical == false) goto L9;
        if ((index % 2) != 1) goto L9;
    L12:
        int[] r4 = this.placeableOffsets;
        r4[index] = r4[index] + delta;
    L13:
        r1 = r1 + 1;
    L9:
        if (this.isVertical == true) goto L13;
        if ((index % 2) != 0) goto L13;
    }

    /* JADX INFO: renamed from: getOffset-Bjo55l4, reason: not valid java name */
    private final long m967getOffsetBjo55l4(int index) {
        int x$iv = this.placeableOffsets[index * 2];
        int y$iv = this.placeableOffsets[(index * 2) + 1];
        return IntOffset.m7095constructorimpl((((long) x$iv) << 32) | (((long) y$iv) & 4294967295L));
    }

    private final int getMainAxisSize(Placeable $this$mainAxisSize) {
        if (this.isVertical == false) goto L6;
        return $this$mainAxisSize.getHeight();
    L6:
        return $this$mainAxisSize.getWidth();
    }

    /* JADX INFO: renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m966copy4Tuh3kE(long $this$copy_u2d4Tuh3kE, Function1<? super Integer, Integer> r14) {
        if (this.isVertical == false) goto L5;
        int x$iv = IntOffset.m7101getXimpl($this$copy_u2d4Tuh3kE);
    L7:
        if (this.isVertical == false) goto L9;
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
