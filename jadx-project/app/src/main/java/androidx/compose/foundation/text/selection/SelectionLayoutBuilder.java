package androidx.compose.foundation.text.selection;

import androidx.collection.LongIntMapKt;
import androidx.collection.MutableLongIntMap;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: SelectionLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e¢\u0006\u0002\u0010\u000fJN\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020(2\u0006\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020/J\b\u00100\u001a\u0004\u0018\u000101J \u00102\u001a\u00020\u00162\u0006\u00103\u001a\u00020\u00162\u0006\u00104\u001a\u00020(2\u0006\u00105\u001a\u00020(H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001bR\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001c\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR!\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;", "", "currentPosition", "Landroidx/compose/ui/geometry/Offset;", "previousHandlePosition", "containerCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "isStartHandle", "", "previousSelection", "Landroidx/compose/foundation/text/selection/Selection;", "selectableIdOrderingComparator", "Ljava/util/Comparator;", "", "Lkotlin/Comparator;", "(JJLandroidx/compose/ui/layout/LayoutCoordinates;ZLandroidx/compose/foundation/text/selection/Selection;Ljava/util/Comparator;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getContainerCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "getCurrentPosition-F1C5BW0", "()J", "J", "currentSlot", "", "endSlot", "infoList", "", "Landroidx/compose/foundation/text/selection/SelectableInfo;", "()Z", "getPreviousHandlePosition-F1C5BW0", "getPreviousSelection", "()Landroidx/compose/foundation/text/selection/Selection;", "getSelectableIdOrderingComparator", "()Ljava/util/Comparator;", "selectableIdToInfoListIndex", "Landroidx/collection/MutableLongIntMap;", "startSlot", "appendInfo", "selectableId", "rawStartHandleOffset", "startXHandleDirection", "Landroidx/compose/foundation/text/selection/Direction;", "startYHandleDirection", "rawEndHandleOffset", "endXHandleDirection", "endYHandleDirection", "rawPreviousHandleOffset", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "build", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "updateSlot", "slot", "xPositionDirection", "yPositionDirection", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SelectionLayoutBuilder {
    public static final int $stable = 0;
    private final LayoutCoordinates containerCoordinates;
    private final long currentPosition;
    private int currentSlot;
    private int endSlot;
    private final List<SelectableInfo> infoList;
    private final boolean isStartHandle;
    private final long previousHandlePosition;
    private final Selection previousSelection;
    private final Comparator<Long> selectableIdOrderingComparator;
    private final MutableLongIntMap selectableIdToInfoListIndex;
    private int startSlot;

    /* JADX INFO: compiled from: SelectionLayout.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[Direction.values().length];
            r0[Direction.BEFORE.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L14:
            r0[Direction.ON.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L16:
            r0[Direction.AFTER.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L12:
            $EnumSwitchMapping$0 = r0;
        }
    }

    static {
        $stable = 8;
    }

    public /* synthetic */ SelectionLayoutBuilder(long r1, long r3, LayoutCoordinates r5, boolean r6, Selection r7, Comparator r8, DefaultConstructorMarker r9) {
        this(r1, r3, r5, r6, r7, r8);
    }

    private SelectionLayoutBuilder(long currentPosition, long previousHandlePosition, LayoutCoordinates containerCoordinates, boolean isStartHandle, Selection previousSelection, Comparator<Long> r9) {
        this.currentPosition = currentPosition;
        this.previousHandlePosition = previousHandlePosition;
        this.containerCoordinates = containerCoordinates;
        this.isStartHandle = isStartHandle;
        this.previousSelection = previousSelection;
        this.selectableIdOrderingComparator = r9;
        this.selectableIdToInfoListIndex = LongIntMapKt.mutableLongIntMapOf();
        this.infoList = new ArrayList();
        this.startSlot = -1;
        this.endSlot = -1;
        this.currentSlot = -1;
    }

    /* JADX INFO: renamed from: getCurrentPosition-F1C5BW0, reason: not valid java name */
    public final long m1448getCurrentPositionF1C5BW0() {
        return this.currentPosition;
    }

    /* JADX INFO: renamed from: getPreviousHandlePosition-F1C5BW0, reason: not valid java name */
    public final long m1449getPreviousHandlePositionF1C5BW0() {
        return this.previousHandlePosition;
    }

    public final LayoutCoordinates getContainerCoordinates() {
        return this.containerCoordinates;
    }

    public final boolean isStartHandle() {
        return this.isStartHandle;
    }

    public final Selection getPreviousSelection() {
        return this.previousSelection;
    }

    public final Comparator<Long> getSelectableIdOrderingComparator() {
        return this.selectableIdOrderingComparator;
    }

    public final SelectionLayout build() {
        int lastSlot = this.currentSlot + 1;
        switch(this.infoList.size()) {
            case 0: goto L16;
            case 1: goto L7;
            default: goto L4;
        };
    L4:
        MutableLongIntMap r3 = this.selectableIdToInfoListIndex;
        List<SelectableInfo> r4 = this.infoList;
        if (this.startSlot != (-1)) goto L18;
        int r5 = lastSlot;
    L20:
        if (this.endSlot != (-1)) goto L22;
        int r6 = lastSlot;
    L24:
        return new MultiSelectionLayout(r3, r4, r5, r6, this.isStartHandle, this.previousSelection);
    L22:
        r6 = this.endSlot;
        goto L24
    L18:
        r5 = this.startSlot;
        goto L20
    L7:
        SelectableInfo r8 = (SelectableInfo) CollectionsKt.single(this.infoList);
        if (this.startSlot != (-1)) goto L10;
        int r7 = lastSlot;
    L12:
        if (this.endSlot != (-1)) goto L14;
        int r9 = lastSlot;
    L15:
        Selection r10 = this.previousSelection;
        return new SingleSelectionLayout(this.isStartHandle, r7, r9, r10, r8);
    L14:
        r9 = this.endSlot;
        goto L15
    L10:
        r7 = this.startSlot;
        goto L12
    L16:
        return null;
    }

    public final SelectableInfo appendInfo(long selectableId, int rawStartHandleOffset, Direction startXHandleDirection, Direction startYHandleDirection, int rawEndHandleOffset, Direction endXHandleDirection, Direction endYHandleDirection, int rawPreviousHandleOffset, TextLayoutResult textLayoutResult) {
        this.currentSlot += 2;
        SelectableInfo selectableInfo = new SelectableInfo(selectableId, this.currentSlot, rawStartHandleOffset, rawEndHandleOffset, rawPreviousHandleOffset, textLayoutResult);
        this.startSlot = updateSlot(this.startSlot, startXHandleDirection, startYHandleDirection);
        this.endSlot = updateSlot(this.endSlot, endXHandleDirection, endYHandleDirection);
        this.selectableIdToInfoListIndex.set(selectableId, this.infoList.size());
        this.infoList.add(selectableInfo);
        return selectableInfo;
    }

    private final int updateSlot(int slot, Direction xPositionDirection, Direction yPositionDirection) {
        if (slot == (-1)) goto L6;
        return slot;
    L6:
        switch(WhenMappings.$EnumSwitchMapping$0[SelectionLayoutKt.resolve2dDirection(xPositionDirection, yPositionDirection).ordinal()]) {
            case 1: goto L12;
            case 2: goto L14;
            case 3: goto L13;
            default: goto L8;
        };
    L8:
        throw new NoWhenBranchMatchedException();
    L13:
        return slot;
    L14:
        return this.currentSlot;
    L12:
        return this.currentSlot - 1;
    }
}
