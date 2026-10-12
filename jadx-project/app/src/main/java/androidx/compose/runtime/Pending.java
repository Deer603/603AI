package androidx.compose.runtime;

import androidx.collection.IntObjectMap;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.collection.MultiValueMap;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001e\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001J\u000e\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0004J\u000e\u0010\"\u001a\u00020#2\u0006\u0010!\u001a\u00020\u0004J\u0016\u0010$\u001a\u00020%2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0006J\u001e\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0006J\u0016\u0010+\u001a\u00020%2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006J\u000e\u0010,\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0004J\u0016\u0010-\u001a\u00020#2\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006J\u000e\u00100\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0004R\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R-\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00138FX\u0086\u0084\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, d2 = {"Landroidx/compose/runtime/Pending;", "", "keyInfos", "", "Landroidx/compose/runtime/KeyInfo;", "startIndex", "", "(Ljava/util/List;I)V", "groupIndex", "getGroupIndex", "()I", "setGroupIndex", "(I)V", "groupInfos", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/compose/runtime/GroupInfo;", "getKeyInfos", "()Ljava/util/List;", "keyMap", "Landroidx/compose/runtime/collection/MultiValueMap;", "getKeyMap-fVlnmYg", "()Landroidx/collection/MutableScatterMap;", "keyMap$delegate", "Lkotlin/Lazy;", "getStartIndex", "used", "", "getUsed", "usedKeys", "getNext", "key", "dataKey", "nodePositionOf", "keyInfo", "recordUsed", "", "registerInsert", "", "insertIndex", "registerMoveNode", "from", "to", "count", "registerMoveSlot", "slotPositionOf", "updateNodeCount", "group", "newCount", "updatedNodeCountOf", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class Pending {
    private int groupIndex;
    private final MutableIntObjectMap<GroupInfo> groupInfos;
    private final List<KeyInfo> keyInfos;
    private final Lazy keyMap$delegate;
    private final int startIndex;
    private final List<KeyInfo> usedKeys;

    public Pending(List<KeyInfo> r11, int startIndex) {
        this.keyInfos = r11;
        this.startIndex = startIndex;
        if (this.startIndex < 0) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        PreconditionsKt.throwIllegalArgumentException("Invalid start index");
    L9:
        this.usedKeys = new ArrayList();
        Pending $this$groupInfos_u24lambda_u241 = this;
        int runningNodeIndex = 0;
        MutableIntObjectMap<GroupInfo> r5 = new MutableIntObjectMap(0, 1, null);
        int index = 0;
        int r2 = $this$groupInfos_u24lambda_u241.keyInfos.size();
    L10:
        if (index >= r2) goto L12;
        KeyInfo keyInfo = $this$groupInfos_u24lambda_u241.keyInfos.get(index);
        r5.set(keyInfo.getLocation(), new GroupInfo(index, runningNodeIndex, keyInfo.getNodes()));
        runningNodeIndex = runningNodeIndex + keyInfo.getNodes();
        index = index + 1;
        goto L10
    L12:
        this.groupInfos = r5;
        this.keyMap$delegate = LazyKt.lazy(new Pending$keyMap$2(this));
        return;
    L5:
        value$iv = false;
        goto L7
    }

    public final List<KeyInfo> getKeyInfos() {
        return this.keyInfos;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public final int getGroupIndex() {
        return this.groupIndex;
    }

    public final void setGroupIndex(int r1) {
        this.groupIndex = r1;
    }

    /* JADX INFO: renamed from: getKeyMap-fVlnmYg, reason: not valid java name */
    public final MutableScatterMap<Object, Object> m3765getKeyMapfVlnmYg() {
        return ((MultiValueMap) this.keyMap$delegate.getValue()).m3901unboximpl();
    }

    public final KeyInfo getNext(int key, Object dataKey) {
        if (dataKey == null) goto L4;
        Object joinedKey = new JoinedKey(Integer.valueOf(key), dataKey);
    L6:
        return (KeyInfo) MultiValueMap.m3896removeFirstimpl(m3765getKeyMapfVlnmYg(), joinedKey);
    L4:
        joinedKey = Integer.valueOf(key);
        goto L6
    }

    public final boolean recordUsed(KeyInfo keyInfo) {
        return this.usedKeys.add(keyInfo);
    }

    public final List<KeyInfo> getUsed() {
        return this.usedKeys;
    }

    public final void registerMoveSlot(int from, int to) {
        int r1 = from;
        int r11 = 8;
        if (r1 <= to) goto L36;
        IntObjectMap this_$iv = this.groupInfos;
        Object[] v$iv = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L85;
    L6:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        IntObjectMap this_$iv2 = this_$iv;
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L30;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L9:
        if (j$iv$iv >= bitCount$iv$iv) goto L29;
        long value$iv$iv$iv = slot$iv$iv & 255;
        if (value$iv$iv$iv >= 128) goto L13;
        boolean r12 = true;
    L14:
        if (r12 == false) goto L27;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        GroupInfo group = (GroupInfo) v$iv[index$iv$iv];
        int position = group.getSlotIndex();
        if (position != r1) goto L18;
        group.setSlotIndex(to);
        goto L27
    L18:
        if (to > position) goto L21;
        if (position >= r1) goto L21;
        boolean r29 = true;
    L22:
        if (r29 == false) goto L27;
        group.setSlotIndex(position + 1);
    L21:
        r29 = false;
    L27:
        slot$iv$iv = slot$iv$iv >> r11;
        j$iv$iv = j$iv$iv + 1;
        r11 = r11;
        goto L9
    L13:
        r12 = false;
        goto L14
    L29:
        if (bitCount$iv$iv == r11) goto L30;
        return;
    L30:
        if (i$iv$iv == lastIndex$iv$iv) goto L88;
        i$iv$iv = i$iv$iv + 1;
        this_$iv = this_$iv2;
        r11 = 8;
        goto L6
    L88:
        return;
    L85:
        return;
    L36:
        if (to <= r1) goto L70;
        IntObjectMap this_$iv3 = this.groupInfos;
        int $i$f$forEachValue = 0;
        Object[] v$iv2 = this_$iv3.values;
        long[] m$iv$iv2 = this_$iv3.metadata;
        int lastIndex$iv$iv2 = m$iv$iv2.length - 2;
        int i$iv$iv2 = 0;
        if (0 > lastIndex$iv$iv2) goto L86;
    L39:
        long slot$iv$iv2 = m$iv$iv2[i$iv$iv2];
        IntObjectMap this_$iv4 = this_$iv3;
        int $i$f$forEachValue2 = $i$f$forEachValue;
        if (((((~slot$iv$iv2) << 7) & slot$iv$iv2) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L65;
        int bitCount$iv$iv2 = 8 - ((~(i$iv$iv2 - lastIndex$iv$iv2)) >>> 31);
        int j$iv$iv2 = 0;
    L42:
        if (j$iv$iv2 >= bitCount$iv$iv2) goto L62;
        long value$iv$iv$iv2 = slot$iv$iv2 & 255;
        if (value$iv$iv$iv2 >= 128) goto L46;
        boolean r13 = true;
    L47:
        if (r13 == false) goto L59;
        int index$iv$iv2 = (i$iv$iv2 << 3) + j$iv$iv2;
        GroupInfo group2 = (GroupInfo) v$iv2[index$iv$iv2];
        int j$iv$iv3 = j$iv$iv2;
        int position2 = group2.getSlotIndex();
        if (position2 != r1) goto L52;
        group2.setSlotIndex(to);
    L60:
        slot$iv$iv2 = slot$iv$iv2 >> 8;
        j$iv$iv2 = j$iv$iv3 + 1;
        r1 = from;
        goto L42
    L52:
        if ((from + 1) > position2) goto L55;
        if (position2 >= to) goto L55;
        boolean r2 = true;
    L56:
        if (r2 == false) goto L60;
        group2.setSlotIndex(position2 - 1);
    L55:
        r2 = false;
        goto L56
    L59:
        j$iv$iv3 = j$iv$iv2;
        goto L60
    L46:
        r13 = false;
        goto L47
    L62:
        if (bitCount$iv$iv2 == 8) goto L65;
        return;
    L65:
        if (i$iv$iv2 == lastIndex$iv$iv2) goto L89;
        i$iv$iv2 = i$iv$iv2 + 1;
        r1 = from;
        this_$iv3 = this_$iv4;
        $i$f$forEachValue = $i$f$forEachValue2;
        goto L39
    L89:
        return;
    L86:
        return;
    }

    public final void registerMoveNode(int from, int to, int count) {
        int r1 = from;
        int r10 = 8;
        if (r1 <= to) goto L43;
        IntObjectMap this_$iv = this.groupInfos;
        Object[] v$iv = this_$iv.values;
        IntObjectMap this_$iv$iv = this_$iv;
        long[] m$iv$iv = this_$iv$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L97;
    L6:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L36;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L9:
        if (j$iv$iv >= bitCount$iv$iv) goto L33;
        long value$iv$iv$iv = slot$iv$iv & 255;
        if (value$iv$iv$iv >= 128) goto L13;
        boolean r11 = true;
    L14:
        if (r11 == false) goto L31;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        GroupInfo group = (GroupInfo) v$iv[index$iv$iv];
        int r29 = r10;
        int position = group.getNodeIndex();
        if (r1 > position) goto L20;
        IntObjectMap this_$iv$iv2 = this_$iv$iv;
        if (position >= (r1 + count)) goto L21;
        boolean r3 = true;
    L22:
        if (r3 == false) goto L24;
        group.setNodeIndex((position - r1) + to);
    L32:
        slot$iv$iv = slot$iv$iv >> r29;
        j$iv$iv = j$iv$iv + 1;
        r10 = r29;
        this_$iv$iv = this_$iv$iv2;
        goto L9
    L24:
        if (to > position) goto L27;
        if (position >= r1) goto L27;
        boolean r4 = true;
    L28:
        if (r4 == false) goto L32;
        group.setNodeIndex(position + count);
    L27:
        r4 = false;
    L21:
        r3 = false;
        goto L22
    L20:
        this_$iv$iv2 = this_$iv$iv;
        goto L21
    L31:
        this_$iv$iv2 = this_$iv$iv;
        r29 = r10;
        goto L32
    L13:
        r11 = false;
        goto L14
    L33:
        IntObjectMap this_$iv$iv3 = this_$iv$iv;
        if (bitCount$iv$iv != r10) goto L99;
    L37:
        if (i$iv$iv == lastIndex$iv$iv) goto L100;
        i$iv$iv = i$iv$iv + 1;
        this_$iv$iv = this_$iv$iv3;
        r10 = 8;
        goto L6
    L100:
        return;
    L99:
        return;
    L36:
        this_$iv$iv3 = this_$iv$iv;
        goto L37
    L97:
        return;
    L43:
        if (to <= r1) goto L82;
        IntObjectMap this_$iv2 = this.groupInfos;
        int $i$f$forEachValue = 0;
        Object[] v$iv2 = this_$iv2.values;
        long[] m$iv$iv2 = this_$iv2.metadata;
        int lastIndex$iv$iv2 = m$iv$iv2.length - 2;
        int i$iv$iv2 = 0;
        if (0 > lastIndex$iv$iv2) goto L98;
    L46:
        long slot$iv$iv2 = m$iv$iv2[i$iv$iv2];
        IntObjectMap this_$iv3 = this_$iv2;
        int $i$f$forEachValue2 = $i$f$forEachValue;
        if (((((~slot$iv$iv2) << 7) & slot$iv$iv2) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L77;
        int bitCount$iv$iv2 = 8 - ((~(i$iv$iv2 - lastIndex$iv$iv2)) >>> 31);
        int j$iv$iv2 = 0;
    L49:
        if (j$iv$iv2 >= bitCount$iv$iv2) goto L74;
        long value$iv$iv$iv2 = slot$iv$iv2 & 255;
        if (value$iv$iv$iv2 >= 128) goto L53;
        boolean r13 = true;
    L54:
        if (r13 == false) goto L71;
        int index$iv$iv2 = (i$iv$iv2 << 3) + j$iv$iv2;
        GroupInfo group2 = (GroupInfo) v$iv2[index$iv$iv2];
        int j$iv$iv3 = j$iv$iv2;
        int position2 = group2.getNodeIndex();
        if (r1 <= position2) goto L58;
    L60:
        boolean r2 = false;
    L61:
        if (r2 == false) goto L64;
        group2.setNodeIndex((position2 - from) + to);
    L72:
        slot$iv$iv2 = slot$iv$iv2 >> 8;
        j$iv$iv2 = j$iv$iv3 + 1;
        r1 = from;
        goto L49
    L64:
        if ((from + 1) > position2) goto L67;
        if (position2 >= to) goto L67;
        boolean r5 = true;
    L68:
        if (r5 == false) goto L72;
        group2.setNodeIndex(position2 - count);
    L67:
        r5 = false;
        goto L68
    L58:
        if (position2 >= (from + count)) goto L60;
        r2 = true;
        goto L61
    L71:
        j$iv$iv3 = j$iv$iv2;
        goto L72
    L53:
        r13 = false;
        goto L54
    L74:
        if (bitCount$iv$iv2 == 8) goto L77;
        return;
    L77:
        if (i$iv$iv2 == lastIndex$iv$iv2) goto L102;
        i$iv$iv2 = i$iv$iv2 + 1;
        r1 = from;
        this_$iv2 = this_$iv3;
        $i$f$forEachValue = $i$f$forEachValue2;
        goto L46
    L102:
        return;
    L98:
        return;
    }

    public final void registerInsert(KeyInfo keyInfo, int insertIndex) {
        this.groupInfos.set(keyInfo.getLocation(), new GroupInfo(-1, insertIndex, 0));
    }

    public final boolean updateNodeCount(int group, int newCount) {
        GroupInfo groupInfo = this.groupInfos.get(group);
        if (groupInfo == null) goto L38;
        int index = groupInfo.getNodeIndex();
        int difference = newCount - groupInfo.getNodeCount();
        groupInfo.setNodeCount(newCount);
        if (difference == 0) goto L37;
        IntObjectMap this_$iv = this.groupInfos;
        Object[] v$iv = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L48;
    L8:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        IntObjectMap this_$iv2 = this_$iv;
        int index2 = index;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L30;
        int r5 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L11:
        if (j$iv$iv >= bitCount$iv$iv) goto L27;
        long value$iv$iv$iv = slot$iv$iv & 255;
        if (value$iv$iv$iv >= 128) goto L15;
        int $i$f$isFull = 1;
    L16:
        if ($i$f$isFull == 0) goto L25;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        int r25 = r5;
        GroupInfo childGroupInfo = (GroupInfo) v$iv[index$iv$iv];
        int index3 = index2;
        if (childGroupInfo.getNodeIndex() < index3) goto L26;
        if (Intrinsics.areEqual(childGroupInfo, groupInfo) == true) goto L26;
        int newIndex = childGroupInfo.getNodeIndex() + difference;
        if (newIndex < 0) goto L26;
        childGroupInfo.setNodeIndex(newIndex);
    L26:
        slot$iv$iv = slot$iv$iv >> r25;
        j$iv$iv = j$iv$iv + 1;
        index2 = index3;
        r5 = r25;
        goto L11
    L25:
        r25 = r5;
        index3 = index2;
        goto L26
    L15:
        $i$f$isFull = 0;
        goto L16
    L27:
        int index4 = index2;
        if (bitCount$iv$iv != r5) goto L49;
    L31:
        if (i$iv$iv == lastIndex$iv$iv) goto L50;
        i$iv$iv = i$iv$iv + 1;
        index = index4;
        this_$iv = this_$iv2;
        goto L8
    L50:
        return true;
    L49:
        return true;
    L30:
        index4 = index2;
        goto L31
    L48:
        return true;
    L37:
        return true;
    L38:
        return false;
    }

    public final int slotPositionOf(KeyInfo keyInfo) {
        GroupInfo r0 = this.groupInfos.get(keyInfo.getLocation());
        if (r0 != null) goto L7;
        return -1;
    L7:
        return r0.getSlotIndex();
    }

    public final int nodePositionOf(KeyInfo keyInfo) {
        GroupInfo r0 = this.groupInfos.get(keyInfo.getLocation());
        if (r0 != null) goto L7;
        return -1;
    L7:
        return r0.getNodeIndex();
    }

    public final int updatedNodeCountOf(KeyInfo keyInfo) {
        GroupInfo r0 = this.groupInfos.get(keyInfo.getLocation());
        if (r0 == null) goto L6;
        return r0.getNodeCount();
    L6:
        return keyInfo.getNodes();
    }
}
