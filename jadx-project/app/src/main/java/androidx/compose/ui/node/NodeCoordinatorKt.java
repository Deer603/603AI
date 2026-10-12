package androidx.compose.ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMap;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: NodeCoordinator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006H\u0002\u001a0\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"compareEquals", "", "a", "Landroidx/collection/MutableObjectIntMap;", "Landroidx/compose/ui/layout/AlignmentLine;", "b", "", "", "nextUntil", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DelegatableNode;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/ui/node/NodeKind;", "stopType", "nextUntil-hw7D004", "(Landroidx/compose/ui/node/DelegatableNode;II)Landroidx/compose/ui/Modifier$Node;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class NodeCoordinatorKt {
    public static final /* synthetic */ boolean access$compareEquals(MutableObjectIntMap a, Map b) {
        return compareEquals(a, b);
    }

    /* JADX INFO: renamed from: access$nextUntil-hw7D004, reason: not valid java name */
    public static final /* synthetic */ Modifier.Node m5973access$nextUntilhw7D004(DelegatableNode $receiver, int type, int stopType) {
        return m5974nextUntilhw7D004($receiver, type, stopType);
    }

    private static final boolean compareEquals(MutableObjectIntMap<AlignmentLine> r25, Map<AlignmentLine, Integer> r26) {
        boolean r0 = false;
        if (r25 != null) goto L6;
        return false;
    L6:
        if (r25.getSize() == r26.size()) goto L8;
        return false;
    L8:
        MutableObjectIntMap<AlignmentLine> this_$iv = r25;
        int $i$f$forEach = 0;
        Object[] k$iv = this_$iv.keys;
        int[] v$iv = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L37;
    L10:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        boolean r16 = r0;
        ObjectIntMap this_$iv2 = this_$iv;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L31;
        int r1 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L13:
        if (j$iv$iv >= bitCount$iv$iv) goto L28;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L17;
        boolean r14 = true;
    L18:
        if (r14 == false) goto L27;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        Object r19 = k$iv[index$iv$iv];
        int v = v$iv[index$iv$iv];
        AlignmentLine k = (AlignmentLine) r19;
        Integer r23 = r26.get(k);
        if (r23 == null) goto L24;
        if (r23.intValue() == v) goto L27;
    L24:
        return r16;
    L27:
        slot$iv$iv = slot$iv$iv >> r1;
        j$iv$iv = j$iv$iv + 1;
        r1 = r1;
        $i$f$forEach = $i$f$forEach;
        goto L13
    L17:
        r14 = r16;
        goto L18
    L28:
        int $i$f$forEach2 = $i$f$forEach;
        boolean r20 = true;
        if (bitCount$iv$iv != r1) goto L46;
    L32:
        if (i$iv$iv == lastIndex$iv$iv) goto L45;
        i$iv$iv = i$iv$iv + 1;
        r0 = r16;
        this_$iv = this_$iv2;
        $i$f$forEach = $i$f$forEach2;
        goto L10
    L45:
        return r20;
    L46:
        return true;
    L31:
        $i$f$forEach2 = $i$f$forEach;
        r20 = true;
        goto L32
    L37:
        return true;
    }

    /* JADX INFO: renamed from: nextUntil-hw7D004, reason: not valid java name */
    private static final Modifier.Node m5974nextUntilhw7D004(DelegatableNode $this$nextUntil_u2dhw7D004, int type, int stopType) {
        Modifier.Node child = $this$nextUntil_u2dhw7D004.getNode().getChild$ui_release();
        if (child != null) goto L6;
        return null;
    L6:
        if ((child.getAggregateChildKindSet$ui_release() & type) != 0) goto L8;
        return null;
    L8:
        Modifier.Node next = child;
    L9:
        if (next == null) goto L17;
        int kindSet = next.getKindSet$ui_release();
        if ((kindSet & stopType) != 0) goto L12;
        if ((kindSet & type) != 0) goto L15;
        next = next.getChild$ui_release();
        goto L9
    L15:
        return next;
    L12:
        return null;
    L17:
        return null;
    }
}
