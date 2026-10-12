package androidx.compose.runtime;

import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u001a\u0011\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0001H\u0082\b\u001a\b\u0010\u001f\u001a\u00020 H\u0000\u001a\"\u0010!\u001a\u00020 *\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0001H\u0002\u001a\u0014\u0010%\u001a\u00020 *\u00020&2\u0006\u0010'\u001a\u00020\u0001H\u0002\u001a\u0014\u0010(\u001a\u00020\u0001*\u00020&2\u0006\u0010'\u001a\u00020\u0001H\u0002\u001a\u0014\u0010)\u001a\u00020**\u00020+2\u0006\u0010,\u001a\u00020\u0001H\u0000\u001a\u0015\u0010-\u001a\u00020.*\u00020&2\u0006\u0010'\u001a\u00020\u0001H\u0082\b\u001a\u0015\u0010/\u001a\u00020.*\u00020&2\u0006\u0010'\u001a\u00020\u0001H\u0082\b\u001a\u0015\u00100\u001a\u00020\u0001*\u00020&2\u0006\u0010'\u001a\u00020\u0001H\u0082\b\u001a\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020\u000102*\u00020&2\b\b\u0002\u00103\u001a\u00020\u0001H\u0002\u001a7\u00104\u001a\u00020\u0001\"\u0004\b\u0000\u00105*\u0012\u0012\u0004\u0012\u0002H506j\b\u0012\u0004\u0012\u0002H5`72\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u0002H5\u0012\u0004\u0012\u00020.09H\u0082\b\u001a>\u0010:\u001a\u0004\u0018\u0001H5\"\u0004\b\u0000\u00105*\u0012\u0012\u0004\u0012\u0002H506j\b\u0012\u0004\u0012\u0002H5`72\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u0002H5\u0012\u0004\u0012\u00020.09H\u0082\b¢\u0006\u0002\u0010;\u001a.\u0010<\u001a\u0004\u0018\u00010=*\u0012\u0012\u0004\u0012\u00020=06j\b\u0012\u0004\u0012\u00020=`72\u0006\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\u0001H\u0002\u001a;\u0010@\u001a\u00020=*\u0012\u0012\u0004\u0012\u00020=06j\b\u0012\u0004\u0012\u00020=`72\u0006\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\u00012\f\u0010A\u001a\b\u0012\u0004\u0012\u00020=0BH\u0082\b\u001a\u0015\u0010C\u001a\u00020\u0001*\u00020&2\u0006\u0010'\u001a\u00020\u0001H\u0082\b\u001a\u0014\u0010D\u001a\u00020\u0001*\u00020&2\u0006\u0010'\u001a\u00020\u0001H\u0002\u001a\u001c\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000102*\u00020&2\b\b\u0002\u00103\u001a\u00020\u0001H\u0002\u001a\u0015\u0010F\u001a\u00020.*\u00020&2\u0006\u0010'\u001a\u00020\u0001H\u0082\b\u001a\u0015\u0010G\u001a\u00020.*\u00020&2\u0006\u0010'\u001a\u00020\u0001H\u0082\b\u001a\u0015\u0010H\u001a\u00020.*\u00020&2\u0006\u0010'\u001a\u00020\u0001H\u0082\b\u001aD\u0010I\u001a\u00020 *\u00020&2\u0006\u0010'\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00012\u0006\u0010J\u001a\u00020.2\u0006\u0010K\u001a\u00020.2\u0006\u0010L\u001a\u00020.2\u0006\u0010M\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u0001H\u0002\u001a\u0015\u0010J\u001a\u00020.*\u00020&2\u0006\u0010'\u001a\u00020\u0001H\u0082\b\u001a\u0015\u0010$\u001a\u00020\u0001*\u00020&2\u0006\u0010'\u001a\u00020\u0001H\u0082\b\u001a\u001c\u0010N\u001a\b\u0012\u0004\u0012\u00020\u000102*\u00020&2\b\b\u0002\u00103\u001a\u00020\u0001H\u0002\u001a,\u0010O\u001a\u00020\u0001*\u0012\u0012\u0004\u0012\u00020=06j\b\u0012\u0004\u0012\u00020=`72\u0006\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\u0001H\u0002\u001a\u0015\u0010P\u001a\u00020\u0001*\u00020&2\u0006\u0010'\u001a\u00020\u0001H\u0082\b\u001a\u001c\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u000102*\u00020&2\b\b\u0002\u00103\u001a\u00020\u0001H\u0002\u001a\u0015\u0010R\u001a\u00020\u0001*\u00020&2\u0006\u0010'\u001a\u00020\u0001H\u0082\b\u001a\u0014\u0010S\u001a\u00020\u0001*\u00020&2\u0006\u0010'\u001a\u00020\u0001H\u0002\u001a\u0015\u0010M\u001a\u00020\u0001*\u00020&2\u0006\u0010'\u001a\u00020\u0001H\u0082\b\u001a\u001c\u0010T\u001a\b\u0012\u0004\u0012\u00020\u000102*\u00020&2\b\b\u0002\u00103\u001a\u00020\u0001H\u0002\u001a,\u0010U\u001a\u00020\u0001*\u0012\u0012\u0004\u0012\u00020=06j\b\u0012\u0004\u0012\u00020=`72\u0006\u0010V\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\u0001H\u0002\u001a \u0010W\u001a\b\u0012\u0004\u0012\u00020\u000102*\u00020&2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00010YH\u0002\u001a\u0014\u0010Z\u001a\u00020\u0001*\u00020&2\u0006\u0010'\u001a\u00020\u0001H\u0002\u001a\u0014\u0010[\u001a\u00020\\*\u00020\\2\u0006\u0010]\u001a\u00020\u0001H\u0002\u001a\r\u0010^\u001a\u00020\u0001*\u00020.H\u0082\b\u001a\u001c\u0010_\u001a\u00020 *\u00020&2\u0006\u0010'\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020.H\u0002\u001a\u001d\u0010`\u001a\u00020 *\u00020&2\u0006\u0010'\u001a\u00020\u00012\u0006\u0010a\u001a\u00020\u0001H\u0082\b\u001a\u001c\u0010b\u001a\u00020 *\u00020&2\u0006\u0010'\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u0001H\u0002\u001a\u001c\u0010c\u001a\u00020 *\u00020&2\u0006\u0010'\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0001H\u0002\u001a\u001c\u0010d\u001a\u00020 *\u00020&2\u0006\u0010'\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020.H\u0002\u001a\u001c\u0010e\u001a\u00020 *\u00020&2\u0006\u0010'\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0001H\u0002\u001a\u001d\u0010f\u001a\u00020 *\u00020&2\u0006\u0010'\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0001H\u0082\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0019\u0010\u0019\u001a\u00020\u0001*\u00020\u001a8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006g"}, d2 = {"Aux_Mask", "", "Aux_Shift", "ContainsMark_Mask", "ContainsMark_Shift", "DataAnchor_Offset", "EmptyLongArray", "", "GroupInfo_Offset", "Group_Fields_Size", "Key_Offset", "LIVE_EDIT_INVALID_KEY", "Mark_Mask", "Mark_Shift", "MinGroupGrowthSize", "MinSlotsGrowthSize", "NodeBit_Mask", "NodeBit_Shift", "NodeCount_Mask", "ObjectKey_Mask", "ObjectKey_Shift", "ParentAnchor_Offset", "Size_Offset", "Slots_Shift", "parentAnchorPivot", "firstBitSet", "", "getFirstBitSet", "(J)I", "countOneBits", "value", "throwConcurrentModificationException", "", "add", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/collection/MutableIntSet;", "key", "addAux", "", "address", "auxIndex", "compositionGroupOf", "Landroidx/compose/runtime/tooling/CompositionGroup;", "Landroidx/compose/runtime/SlotTable;", "group", "containsAnyMark", "", "containsMark", "dataAnchor", "dataAnchors", "", "len", "fastIndexOf", "T", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "predicate", "Lkotlin/Function1;", "fastLastOrNull", "(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "find", "Landroidx/compose/runtime/Anchor;", "index", "effectiveSize", "getOrAdd", "block", "Lkotlin/Function0;", "groupInfo", "groupSize", "groupSizes", "hasAux", "hasMark", "hasObjectKey", "initGroup", "isNode", "hasDataKey", "hasData", "parentAnchor", "keys", "locationOf", "nodeCount", "nodeCounts", "nodeIndex", "objectKeyIndex", "parentAnchors", "search", "location", "slice", "indices", "", "slotAnchor", "summarize", "", "size", "toBit", "updateContainsMark", "updateDataAnchor", "anchor", "updateGroupKey", "updateGroupSize", "updateMark", "updateNodeCount", "updateParentAnchor", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SlotTableKt {
    private static final int Aux_Mask = 268435456;
    private static final int Aux_Shift = 28;
    private static final int ContainsMark_Mask = 67108864;
    private static final int ContainsMark_Shift = 26;
    private static final int DataAnchor_Offset = 4;
    private static final long[] EmptyLongArray = null;
    private static final int GroupInfo_Offset = 1;
    private static final int Group_Fields_Size = 5;
    private static final int Key_Offset = 0;
    private static final int LIVE_EDIT_INVALID_KEY = -3;
    private static final int Mark_Mask = 134217728;
    private static final int Mark_Shift = 27;
    private static final int MinGroupGrowthSize = 32;
    private static final int MinSlotsGrowthSize = 32;
    private static final int NodeBit_Mask = 1073741824;
    private static final int NodeBit_Shift = 30;
    private static final int NodeCount_Mask = 67108863;
    private static final int ObjectKey_Mask = 536870912;
    private static final int ObjectKey_Shift = 29;
    private static final int ParentAnchor_Offset = 2;
    private static final int Size_Offset = 3;
    private static final int Slots_Shift = 28;
    private static final int parentAnchorPivot = -2;

    public static final /* synthetic */ void access$add(MutableIntObjectMap $receiver, int key, int value) {
        add($receiver, key, value);
    }

    public static final /* synthetic */ void access$addAux(int[] $receiver, int address) {
        addAux($receiver, address);
    }

    public static final /* synthetic */ int access$auxIndex(int[] $receiver, int address) {
        return auxIndex($receiver, address);
    }

    public static final /* synthetic */ List access$dataAnchors(int[] $receiver, int len) {
        return dataAnchors($receiver, len);
    }

    public static final /* synthetic */ Anchor access$find(ArrayList $receiver, int index, int effectiveSize) {
        return find($receiver, index, effectiveSize);
    }

    public static final /* synthetic */ long[] access$getEmptyLongArray$p() {
        return EmptyLongArray;
    }

    public static final /* synthetic */ int access$groupSize(int[] $receiver, int address) {
        return groupSize($receiver, address);
    }

    public static final /* synthetic */ List access$groupSizes(int[] $receiver, int len) {
        return groupSizes($receiver, len);
    }

    public static final /* synthetic */ void access$initGroup(int[] $receiver, int address, int key, boolean isNode, boolean hasDataKey, boolean hasData, int parentAnchor, int dataAnchor) {
        initGroup($receiver, address, key, isNode, hasDataKey, hasData, parentAnchor, dataAnchor);
    }

    public static final /* synthetic */ List access$keys(int[] $receiver, int len) {
        return keys($receiver, len);
    }

    public static final /* synthetic */ int access$locationOf(ArrayList $receiver, int index, int effectiveSize) {
        return locationOf($receiver, index, effectiveSize);
    }

    public static final /* synthetic */ List access$nodeCounts(int[] $receiver, int len) {
        return nodeCounts($receiver, len);
    }

    public static final /* synthetic */ int access$objectKeyIndex(int[] $receiver, int address) {
        return objectKeyIndex($receiver, address);
    }

    public static final /* synthetic */ List access$parentAnchors(int[] $receiver, int len) {
        return parentAnchors($receiver, len);
    }

    public static final /* synthetic */ int access$search(ArrayList $receiver, int location, int effectiveSize) {
        return search($receiver, location, effectiveSize);
    }

    public static final /* synthetic */ int access$slotAnchor(int[] $receiver, int address) {
        return slotAnchor($receiver, address);
    }

    public static final /* synthetic */ String access$summarize(String $receiver, int size) {
        return summarize($receiver, size);
    }

    public static final /* synthetic */ void access$updateContainsMark(int[] $receiver, int address, boolean value) {
        updateContainsMark($receiver, address, value);
    }

    public static final /* synthetic */ void access$updateGroupKey(int[] $receiver, int address, int key) {
        updateGroupKey($receiver, address, key);
    }

    public static final /* synthetic */ void access$updateGroupSize(int[] $receiver, int address, int value) {
        updateGroupSize($receiver, address, value);
    }

    public static final /* synthetic */ void access$updateMark(int[] $receiver, int address, boolean value) {
        updateMark($receiver, address, value);
    }

    public static final /* synthetic */ void access$updateNodeCount(int[] $receiver, int address, int value) {
        updateNodeCount($receiver, address, value);
    }

    private static final <T> T fastLastOrNull(ArrayList<T> r4, Function1<? super T, Boolean> r5) {
        int index = r4.size() - 1;
    L3:
        if (index < 0) goto L8;
        T r2 = r4.get(index);
        if (r5.invoke(r2).booleanValue() == true) goto L6;
        index = index - 1;
        goto L3
    L6:
        return r2;
    L8:
        return null;
    }

    private static final <T> int fastIndexOf(ArrayList<T> r5, Function1<? super T, Boolean> r6) {
        int index = 0;
        int size = r5.size();
    L3:
        if (index >= size) goto L8;
        Object value = r5.get(index);
        if (r6.invoke(value).booleanValue() == true) goto L6;
        index = index + 1;
        goto L3
    L6:
        return index;
    L8:
        return -1;
    }

    private static final String summarize(String $this$summarize, int size) {
        String it = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default($this$summarize, "androidx.", "a.", false, 4, null), "compose.", "c.", false, 4, null), "runtime.", "r.", false, 4, null), "internal.", "ι.", false, 4, null), "ui.", "u.", false, 4, null), "Modifier", "μ", false, 4, null), "material.", "m.", false, 4, null), "Function", "λ", false, 4, null), "OpaqueKey", "κ", false, 4, null), "MutableState", "σ", false, 4, null);
        String r2 = it.substring(0, Math.min(size, it.length()));
        Intrinsics.checkNotNullExpressionValue(r2, "substring(...)");
        return r2;
    }

    public static final CompositionGroup compositionGroupOf(SlotTable $this$compositionGroupOf, int group) {
        return new SlotTableGroup($this$compositionGroupOf, group, $this$compositionGroupOf.getVersion$runtime_release());
    }

    static {
        EmptyLongArray = new long[0];
    }

    private static final int getFirstBitSet(long $this$firstBitSet) {
        return Long.numberOfTrailingZeros($this$firstBitSet);
    }

    private static final int groupInfo(int[] $this$groupInfo, int address) {
        return $this$groupInfo[(address * 5) + 1];
    }

    private static final boolean isNode(int[] $this$isNode, int address) {
        if (($this$isNode[(address * 5) + 1] & NodeBit_Mask) != 0) goto L7;
        return false;
    L7:
        return true;
    }

    private static final int nodeIndex(int[] $this$nodeIndex, int address) {
        return $this$nodeIndex[(address * 5) + 4];
    }

    private static final boolean hasObjectKey(int[] $this$hasObjectKey, int address) {
        if (($this$hasObjectKey[(address * 5) + 1] & ObjectKey_Mask) != 0) goto L7;
        return false;
    L7:
        return true;
    }

    private static final int objectKeyIndex(int[] $this$objectKeyIndex, int address) {
        int slot = address * 5;
        int r2 = $this$objectKeyIndex[slot + 4];
        int value$iv = $this$objectKeyIndex[slot + 1] >> 30;
        return r2 + Integer.bitCount(value$iv);
    }

    private static final boolean hasAux(int[] $this$hasAux, int address) {
        if (($this$hasAux[(address * 5) + 1] & Aux_Mask) != 0) goto L7;
        return false;
    L7:
        return true;
    }

    private static final void addAux(int[] $this$addAux, int address) {
        int arrayIndex = (address * 5) + 1;
        $this$addAux[arrayIndex] = $this$addAux[arrayIndex] | Aux_Mask;
    }

    private static final boolean hasMark(int[] $this$hasMark, int address) {
        if (($this$hasMark[(address * 5) + 1] & Mark_Mask) != 0) goto L7;
        return false;
    L7:
        return true;
    }

    private static final void updateMark(int[] $this$updateMark, int address, boolean value) {
        int r1 = 1;
        int arrayIndex = (address * 5) + 1;
        int element = $this$updateMark[arrayIndex];
        int r3 = (-134217729) & element;
        if (value == true) goto L6;
        r1 = 0;
    L6:
        $this$updateMark[arrayIndex] = (r1 << 27) | r3;
    }

    private static final boolean containsMark(int[] $this$containsMark, int address) {
        if (($this$containsMark[(address * 5) + 1] & 67108864) != 0) goto L7;
        return false;
    L7:
        return true;
    }

    private static final void updateContainsMark(int[] $this$updateContainsMark, int address, boolean value) {
        int r1 = 1;
        int arrayIndex = (address * 5) + 1;
        int element = $this$updateContainsMark[arrayIndex];
        int r3 = (-67108865) & element;
        if (value == true) goto L6;
        r1 = 0;
    L6:
        $this$updateContainsMark[arrayIndex] = (r1 << 26) | r3;
    }

    private static final boolean containsAnyMark(int[] $this$containsAnyMark, int address) {
        if (($this$containsAnyMark[(address * 5) + 1] & 201326592) != 0) goto L7;
        return false;
    L7:
        return true;
    }

    private static final int auxIndex(int[] $this$auxIndex, int address) {
        int slot = address * 5;
        if (slot >= $this$auxIndex.length) goto L8;
        int r2 = $this$auxIndex[slot + 4];
        int value$iv = $this$auxIndex[slot + 1] >> ObjectKey_Shift;
        return r2 + Integer.bitCount(value$iv);
    L8:
        return $this$auxIndex.length;
    }

    private static final int slotAnchor(int[] $this$slotAnchor, int address) {
        int slot = address * 5;
        int r2 = $this$slotAnchor[slot + 4];
        int value$iv = $this$slotAnchor[slot + 1] >> 28;
        return r2 + Integer.bitCount(value$iv);
    }

    private static final int countOneBits(int value) {
        return Integer.bitCount(value);
    }

    private static final int key(int[] $this$key, int address) {
        return $this$key[address * 5];
    }

    private static final List<Integer> keys(int[] $this$keys, int len) {
        return slice($this$keys, RangesKt.step(RangesKt.until(0, len), 5));
    }

    static /* synthetic */ List keys$default(int[] r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.length;
    L6:
        return keys(r0, r1);
    }

    private static final int nodeCount(int[] $this$nodeCount, int address) {
        return $this$nodeCount[(address * 5) + 1] & 67108863;
    }

    private static final void updateNodeCount(int[] $this$updateNodeCount, int address, int value) {
        if (value < 0) goto L8;
        if (value < 67108863) goto L8;
    L8:
        $this$updateNodeCount[(address * 5) + 1] = ($this$updateNodeCount[(address * 5) + 1] & (-67108864)) | value;
    }

    static /* synthetic */ List nodeCounts$default(int[] r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.length;
    L6:
        return nodeCounts(r0, r1);
    }

    private static final List<Integer> nodeCounts(int[] $this$nodeCounts, int len) {
        List<Integer> r0 = slice($this$nodeCounts, RangesKt.step(RangesKt.until(1, len), 5));
        List target$iv = new ArrayList(r0.size());
        int index$iv$iv = 0;
        int r6 = r0.size();
    L3:
        if (index$iv$iv >= r6) goto L5;
        Object item$iv$iv = r0.get(index$iv$iv);
        int it = ((Number) item$iv$iv).intValue();
        target$iv.add(Integer.valueOf(it & 67108863));
        index$iv$iv = index$iv$iv + 1;
        goto L3
    L5:
        List $this$fastMap$iv = target$iv;
        return $this$fastMap$iv;
    }

    private static final int parentAnchor(int[] $this$parentAnchor, int address) {
        return $this$parentAnchor[(address * 5) + 2];
    }

    private static final void updateParentAnchor(int[] $this$updateParentAnchor, int address, int value) {
        $this$updateParentAnchor[(address * 5) + 2] = value;
    }

    static /* synthetic */ List parentAnchors$default(int[] r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.length;
    L6:
        return parentAnchors(r0, r1);
    }

    private static final List<Integer> parentAnchors(int[] $this$parentAnchors, int len) {
        return slice($this$parentAnchors, RangesKt.step(RangesKt.until(2, len), 5));
    }

    private static final int groupSize(int[] $this$groupSize, int address) {
        return $this$groupSize[(address * 5) + 3];
    }

    private static final void updateGroupSize(int[] $this$updateGroupSize, int address, int value) {
        if (value >= 0) goto L5;
    L5:
        $this$updateGroupSize[(address * 5) + 3] = value;
    }

    private static final List<Integer> slice(int[] $this$slice, Iterable<Integer> r5) {
        List list = new ArrayList();
        Iterator<Integer> r1 = r5.iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        int index = r1.next().intValue();
        list.add(Integer.valueOf($this$slice[index]));
        goto L4
    L6:
        return list;
    }

    static /* synthetic */ List groupSizes$default(int[] r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.length;
    L6:
        return groupSizes(r0, r1);
    }

    private static final List<Integer> groupSizes(int[] $this$groupSizes, int len) {
        return slice($this$groupSizes, RangesKt.step(RangesKt.until(3, len), 5));
    }

    private static final int dataAnchor(int[] $this$dataAnchor, int address) {
        return $this$dataAnchor[(address * 5) + 4];
    }

    private static final void updateDataAnchor(int[] $this$updateDataAnchor, int address, int anchor) {
        $this$updateDataAnchor[(address * 5) + 4] = anchor;
    }

    static /* synthetic */ List dataAnchors$default(int[] r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.length;
    L6:
        return dataAnchors(r0, r1);
    }

    private static final List<Integer> dataAnchors(int[] $this$dataAnchors, int len) {
        return slice($this$dataAnchors, RangesKt.step(RangesKt.until(4, len), 5));
    }

    private static final void initGroup(int[] $this$initGroup, int address, int key, boolean isNode, boolean hasDataKey, boolean hasData, int parentAnchor, int dataAnchor) {
        int arrayIndex = address * 5;
        $this$initGroup[arrayIndex + 0] = key;
        int r1 = arrayIndex + 1;
        int r5 = 1;
        if (isNode == false) goto L5;
        int r2 = 1;
    L6:
        int r3 = r2 << 30;
        if (hasDataKey == false) goto L9;
        int r4 = 1;
    L10:
        int r6 = r3 | (r4 << ObjectKey_Shift);
        if (hasData == true) goto L14;
        r5 = 0;
    L14:
        $this$initGroup[r1] = r6 | (r5 << 28);
        $this$initGroup[arrayIndex + 2] = parentAnchor;
        $this$initGroup[arrayIndex + 3] = 0;
        $this$initGroup[arrayIndex + 4] = dataAnchor;
        return;
    L9:
        r4 = 0;
        goto L10
    L5:
        r2 = 0;
        goto L6
    }

    private static final int toBit(boolean r1) {
        return r1 ? 1 : 0;
    }

    private static final void updateGroupKey(int[] $this$updateGroupKey, int address, int key) {
        int arrayIndex = address * 5;
        $this$updateGroupKey[arrayIndex + 0] = key;
    }

    private static final Anchor getOrAdd(ArrayList<Anchor> r4, int index, int effectiveSize, Function0<Anchor> r7) {
        int location = access$search(r4, index, effectiveSize);
        if (location >= 0) goto L6;
        Anchor anchor = r7.invoke();
        r4.add(-(location + 1), anchor);
        return anchor;
    L6:
        return r4.get(location);
    }

    private static final Anchor find(ArrayList<Anchor> r2, int index, int effectiveSize) {
        int location = search(r2, index, effectiveSize);
        if (location >= 0) goto L7;
        return null;
    L7:
        return r2.get(location);
    }

    private static final int search(ArrayList<Anchor> r6, int location, int effectiveSize) {
        int low = 0;
        int high = r6.size() - 1;
    L3:
        if (low > high) goto L14;
        int mid = (low + high) >>> 1;
        int it = r6.get(mid).getLocation$runtime_release();
        if (it >= 0) goto L7;
        it = effectiveSize + it;
    L7:
        int cmp = Intrinsics.compare(it, location);
        if (cmp < 0) goto L9;
        if (cmp <= 0) goto L12;
        high = mid - 1;
        goto L3
    L12:
        return mid;
    L9:
        low = mid + 1;
        goto L3
    L14:
        return -(low + 1);
    }

    private static final int locationOf(ArrayList<Anchor> r3, int index, int effectiveSize) {
        int it = search(r3, index, effectiveSize);
        if (it < 0) goto L6;
        return it;
    L6:
        return -(it + 1);
    }

    private static final void add(MutableIntObjectMap<MutableIntSet> r4, int key, int value) {
        MutableIntSet it = r4.get(key);
        if (it != null) goto L5;
        int r3 = 0;
        it = new MutableIntSet(r3, 1, null);
        r4.set(key, it);
    L5:
        it.add(value);
    }

    public static final void throwConcurrentModificationException() {
        throw new ConcurrentModificationException();
    }
}
