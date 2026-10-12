package androidx.compose.foundation.text.selection;

import androidx.collection.LongIntMap;
import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SelectionLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0+2\u0006\u0010,\u001a\u00020\rH\u0016J\u001c\u0010-\u001a\u00020.2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020.00H\u0016J\u0010\u00101\u001a\u00020\b2\u0006\u00102\u001a\u000203H\u0002J\u0010\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u0000H\u0002J\u0012\u00106\u001a\u00020\u000b2\b\u00105\u001a\u0004\u0018\u00010\u0001H\u0016J\u0018\u00107\u001a\u00020\b2\u0006\u00108\u001a\u00020\b2\u0006\u00109\u001a\u00020\u000bH\u0002J\u0018\u0010:\u001a\u00020\b2\u0006\u00108\u001a\u00020\b2\u0006\u0010;\u001a\u00020\u000bH\u0002J\b\u0010<\u001a\u00020=H\u0016J2\u0010>\u001a\u00020.*\b\u0012\u0004\u0012\u00020\r0?2\u0006\u0010,\u001a\u00020\r2\u0006\u0010@\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\b2\u0006\u0010B\u001a\u00020\bH\u0002R\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\t\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0015R\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0019R\u0014\u0010'\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019¨\u0006C"}, d2 = {"Landroidx/compose/foundation/text/selection/MultiSelectionLayout;", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "selectableIdToInfoListIndex", "Landroidx/collection/LongIntMap;", "infoList", "", "Landroidx/compose/foundation/text/selection/SelectableInfo;", "startSlot", "", "endSlot", "isStartHandle", "", "previousSelection", "Landroidx/compose/foundation/text/selection/Selection;", "(Landroidx/collection/LongIntMap;Ljava/util/List;IIZLandroidx/compose/foundation/text/selection/Selection;)V", "crossStatus", "Landroidx/compose/foundation/text/selection/CrossStatus;", "getCrossStatus", "()Landroidx/compose/foundation/text/selection/CrossStatus;", "currentInfo", "getCurrentInfo", "()Landroidx/compose/foundation/text/selection/SelectableInfo;", "endInfo", "getEndInfo", "getEndSlot", "()I", "firstInfo", "getFirstInfo", "getInfoList", "()Ljava/util/List;", "()Z", "lastInfo", "getLastInfo", "getPreviousSelection", "()Landroidx/compose/foundation/text/selection/Selection;", "getSelectableIdToInfoListIndex", "()Landroidx/collection/LongIntMap;", "size", "getSize", "startInfo", "getStartInfo", "getStartSlot", "createSubSelections", "Landroidx/collection/LongObjectMap;", "selection", "forEachMiddleInfo", "", "block", "Lkotlin/Function1;", "getInfoListIndexBySelectableId", "id", "", "shouldAnyInfoRecomputeSelection", "other", "shouldRecomputeSelection", "slotToIndex", "slot", "isMinimumSlot", "startOrEndSlotToIndex", "isStartSlot", "toString", "", "createAndPutSubSelection", "Landroidx/collection/MutableLongObjectMap;", "info", "minOffset", "maxOffset", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class MultiSelectionLayout implements SelectionLayout {
    private final int endSlot;
    private final List<SelectableInfo> infoList;
    private final boolean isStartHandle;
    private final Selection previousSelection;
    private final LongIntMap selectableIdToInfoListIndex;
    private final int startSlot;

    /* JADX INFO: compiled from: SelectionLayout.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[CrossStatus.values().length];
            r0[CrossStatus.COLLAPSED.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L14:
            r0[CrossStatus.NOT_CROSSED.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L16:
            r0[CrossStatus.CROSSED.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L12:
            $EnumSwitchMapping$0 = r0;
        }
    }

    public MultiSelectionLayout(LongIntMap selectableIdToInfoListIndex, List<SelectableInfo> r7, int startSlot, int endSlot, boolean isStartHandle, Selection previousSelection) {
        this.selectableIdToInfoListIndex = selectableIdToInfoListIndex;
        this.infoList = r7;
        this.startSlot = startSlot;
        this.endSlot = endSlot;
        this.isStartHandle = isStartHandle;
        this.previousSelection = previousSelection;
        boolean value$iv = true;
        if (this.infoList.size() > 1) goto L7;
        value$iv = false;
    L7:
        if (value$iv == true) goto L11;
        InlineClassHelperKt.throwIllegalStateException("MultiSelectionLayout requires an infoList size greater than 1, was " + this.infoList.size() + '.');
        return;
    }

    public static final /* synthetic */ void access$createAndPutSubSelection(MultiSelectionLayout $this, MutableLongObjectMap $receiver, Selection selection, SelectableInfo info, int minOffset, int maxOffset) {
        $this.createAndPutSubSelection($receiver, selection, info, minOffset, maxOffset);
    }

    public final LongIntMap getSelectableIdToInfoListIndex() {
        return this.selectableIdToInfoListIndex;
    }

    public final List<SelectableInfo> getInfoList() {
        return this.infoList;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public int getStartSlot() {
        return this.startSlot;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public int getEndSlot() {
        return this.endSlot;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public boolean isStartHandle() {
        return this.isStartHandle;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public Selection getPreviousSelection() {
        return this.previousSelection;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public int getSize() {
        return this.infoList.size();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public CrossStatus getCrossStatus() {
        if (getStartSlot() >= getEndSlot()) goto L6;
        return CrossStatus.NOT_CROSSED;
    L6:
        if (getStartSlot() <= getEndSlot()) goto L9;
        return CrossStatus.CROSSED;
    L9:
        return this.infoList.get(getStartSlot() / 2).getRawCrossStatus();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo getStartInfo() {
        return this.infoList.get(startOrEndSlotToIndex(getStartSlot(), true));
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo getEndInfo() {
        return this.infoList.get(startOrEndSlotToIndex(getEndSlot(), false));
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo getCurrentInfo() {
        if (isStartHandle() == false) goto L6;
        return getStartInfo();
    L6:
        return getEndInfo();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo getFirstInfo() {
        if (getCrossStatus() != CrossStatus.CROSSED) goto L6;
        return getEndInfo();
    L6:
        return getStartInfo();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo getLastInfo() {
        if (getCrossStatus() != CrossStatus.CROSSED) goto L6;
        return getStartInfo();
    L6:
        return getEndInfo();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public void forEachMiddleInfo(Function1<? super SelectableInfo, Unit> r5) {
        int minIndex = getInfoListIndexBySelectableId(getFirstInfo().getSelectableId());
        int maxIndex = getInfoListIndexBySelectableId(getLastInfo().getSelectableId());
        if ((minIndex + 1) < maxIndex) goto L5;
        return;
    L5:
        int i = minIndex + 1;
    L6:
        if (i >= maxIndex) goto L8;
        r5.invoke(this.infoList.get(i));
        i = i + 1;
        goto L6
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public boolean shouldRecomputeSelection(SelectionLayout other) {
        if (getPreviousSelection() == null) goto L17;
        if (other == null) goto L17;
        if ((other instanceof MultiSelectionLayout) == false) goto L17;
        if (isStartHandle() != other.isStartHandle()) goto L17;
        if (getStartSlot() != other.getStartSlot()) goto L17;
        if (getEndSlot() != other.getEndSlot()) goto L17;
        if (shouldAnyInfoRecomputeSelection((MultiSelectionLayout) other) == true) goto L17;
        return false;
    L17:
        return true;
    }

    private final boolean shouldAnyInfoRecomputeSelection(MultiSelectionLayout other) {
        if (getSize() == other.getSize()) goto L5;
        return true;
    L5:
        int i = 0;
        int r1 = this.infoList.size();
    L6:
        if (i >= r1) goto L11;
        SelectableInfo thisInfo = this.infoList.get(i);
        SelectableInfo otherInfo = other.infoList.get(i);
        if (thisInfo.shouldRecomputeSelection(otherInfo) == true) goto L9;
        i = i + 1;
        goto L6
    L9:
        return true;
    L11:
        return false;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public LongObjectMap<Selection> createSubSelections(final Selection selection) {
        if (selection.getStart().getSelectableId() == selection.getEnd().getSelectableId()) goto L5;
        final MutableLongObjectMap<Selection> r0 = LongObjectMapKt.mutableLongObjectMapOf();
        if (selection.getHandlesCrossed() == false) goto L21;
        Selection.AnchorInfo r4 = selection.getEnd();
    L22:
        Selection.AnchorInfo minAnchor = r4;
        createAndPutSubSelection(r0, selection, getFirstInfo(), minAnchor.getOffset(), getFirstInfo().getTextLength());
        forEachMiddleInfo(new MultiSelectionLayout$createSubSelections$2$1(this, r0, selection));
        if (selection.getHandlesCrossed() == false) goto L25;
        Selection.AnchorInfo r5 = selection.getStart();
    L26:
        Selection.AnchorInfo maxAnchor = r5;
        createAndPutSubSelection(r0, selection, getLastInfo(), 0, maxAnchor.getOffset());
        return r0;
    L25:
        r5 = selection.getEnd();
        goto L26
    L21:
        r4 = selection.getStart();
        goto L22
    L5:
        if (selection.getHandlesCrossed() == false) goto L9;
        if (selection.getStart().getOffset() < selection.getEnd().getOffset()) goto L9;
    L12:
        boolean value$iv = true;
    L15:
        if (value$iv == true) goto L28;
        InlineClassHelperKt.throwIllegalStateException("unexpectedly miss-crossed selection: " + selection);
    L28:
        return LongObjectMapKt.longObjectMapOf(selection.getStart().getSelectableId(), selection);
    L9:
        if (selection.getHandlesCrossed() == false) goto L11;
    L13:
        value$iv = false;
        goto L15
    L11:
        if (selection.getStart().getOffset() > selection.getEnd().getOffset()) goto L13;
        goto L12
    }

    private final void createAndPutSubSelection(MutableLongObjectMap<Selection> r7, Selection selection, SelectableInfo info, int minOffset, int maxOffset) {
        if (selection.getHandlesCrossed() == false) goto L5;
        Selection subSelection = info.makeSingleLayoutSelection(maxOffset, minOffset);
    L7:
        if (minOffset > maxOffset) goto L9;
        boolean value$iv = true;
    L11:
        if (value$iv == true) goto L13;
        InlineClassHelperKt.throwIllegalStateException("minOffset should be less than or equal to maxOffset: " + subSelection);
    L13:
        r7.put(info.getSelectableId(), subSelection);
        return;
    L9:
        value$iv = false;
        goto L11
    L5:
        subSelection = info.makeSingleLayoutSelection(minOffset, maxOffset);
        goto L7
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder().append("MultiSelectionLayout(isStartHandle=").append(isStartHandle()).append(", startPosition=").append((getStartSlot() + 1) / 2.0f).append(", endPosition=").append((getEndSlot() + 1) / 2.0f).append(", crossed=").append(getCrossStatus()).append(", infos=");
        StringBuilder $this$toString_u24lambda_u247 = new StringBuilder();
        $this$toString_u24lambda_u247.append("[\n\t");
        boolean first = true;
        List<SelectableInfo> r5 = this.infoList;
        int index$iv = 0;
        int r8 = r5.size();
    L3:
        if (index$iv >= r8) goto L9;
        Object item$iv = r5.get(index$iv);
        SelectableInfo info = (SelectableInfo) item$iv;
        int index = index$iv;
        if (first == false) goto L7;
        first = false;
    L8:
        $this$toString_u24lambda_u247.append((index + 1) + " -> " + info);
        index$iv = index$iv + 1;
        goto L3
    L7:
        $this$toString_u24lambda_u247.append(",\n\t");
        goto L8
    L9:
        $this$toString_u24lambda_u247.append("\n]");
        String r1 = $this$toString_u24lambda_u247.toString();
        Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        return r0.append(r1).append(')').toString();
    }

    private final int startOrEndSlotToIndex(int slot, boolean isStartSlot) {
        CrossStatus r0 = getCrossStatus();
        boolean r1 = true;
        switch(WhenMappings.$EnumSwitchMapping$0[r0.ordinal()]) {
            case 1: goto L12;
            case 2: goto L9;
            case 3: goto L6;
            default: goto L5;
        };
    L6:
        if (isStartSlot == false) goto L12;
        r1 = false;
        goto L12
    L9:
        r1 = isStartSlot;
        goto L12
    L5:
        throw new NoWhenBranchMatchedException();
    L12:
        return slotToIndex(slot, r1);
    }

    private final int slotToIndex(int r3, boolean r4) {
        return (r3 - (!r4 ? 1 : 0)) / 2;
    }

    private final int getInfoListIndexBySelectableId(long id) {
        return this.selectableIdToInfoListIndex.get(id);
    L4:
        e = move-exception;
        throw new IllegalStateException("Invalid selectableId: " + id, e);
    }
}
