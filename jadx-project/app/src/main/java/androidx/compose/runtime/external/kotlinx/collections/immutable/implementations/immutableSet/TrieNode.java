package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TrieNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u0000 _*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001_B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006¢\u0006\u0002\u0010\u0007B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0002\u0010\u001cJ#\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020\u0004H\u0002J\u001b\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\"J\u0015\u0010#\u001a\u00020$2\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010%J\u001b\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\"J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010(\u001a\u00020\u0004H\u0002J#\u0010)\u001a\u00020$2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0002\u0010*J\u001c\u0010+\u001a\u00020$2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001b\u001a\u00020\u0004J\u0015\u0010-\u001a\u00028\u00002\u0006\u0010.\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010/J\u0016\u00100\u001a\u00020$2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002J\u0010\u00101\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020\u0004H\u0002J\u0015\u00102\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0000¢\u0006\u0002\b3JE\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00105\u001a\u00020\u00042\u0006\u00106\u001a\u00028\u00002\u0006\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u00042\b\u00109\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0002\u0010:J=\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010<\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u00042\b\u00109\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0002\u0010?J3\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010<\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010AJ5\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u00042\n\u0010C\u001a\u0006\u0012\u0002\b\u00030D¢\u0006\u0002\u0010EJ6\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010G\u001a\u00020H2\n\u0010C\u001a\u0006\u0012\u0002\b\u00030DJ+\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u00109\u001a\u00020\tH\u0002¢\u0006\u0002\u0010JJ'\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001a\u001a\u00028\u00002\n\u0010C\u001a\u0006\u0012\u0002\b\u00030DH\u0002¢\u0006\u0002\u0010LJ,\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010G\u001a\u00020H2\u0006\u00109\u001a\u00020\tH\u0002J'\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001a\u001a\u00028\u00002\n\u0010C\u001a\u0006\u0012\u0002\b\u00030DH\u0002¢\u0006\u0002\u0010LJ(\u0010O\u001a\u0004\u0018\u00010\u00022\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010G\u001a\u00020H2\u0006\u00109\u001a\u00020\tH\u0002J\u001e\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010(\u001a\u00020\u00042\u0006\u00109\u001a\u00020\tH\u0002J(\u0010Q\u001a\u0004\u0018\u00010\u00022\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010G\u001a\u00020H2\u0006\u00109\u001a\u00020\tH\u0002J;\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010<\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u00109\u001a\u00020\tH\u0002¢\u0006\u0002\u0010?J5\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u00042\n\u0010C\u001a\u0006\u0012\u0002\b\u00030D¢\u0006\u0002\u0010EJ2\u0010T\u001a\u0004\u0018\u00010\u00022\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010G\u001a\u00020H2\n\u0010C\u001a\u0006\u0012\u0002\b\u00030DJ&\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010V\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u00109\u001a\u00020\tH\u0002J2\u0010W\u001a\u0004\u0018\u00010\u00022\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010G\u001a\u00020H2\n\u0010C\u001a\u0006\u0012\u0002\b\u00030DJ,\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010Y\u001a\u00020\u00042\f\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00109\u001a\u00020\tH\u0002J\u0016\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010.\u001a\u00020\u0004H\u0002J)\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0002\u0010\u001cJ\u001e\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010V\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0002J$\u0010^\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010Y\u001a\u00020\u00042\f\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006`"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "E", "", "bitmap", "", "buffer", "", "(I[Ljava/lang/Object;)V", "ownedBy", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "(I[Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "getBitmap", "()I", "setBitmap", "(I)V", "getBuffer", "()[Ljava/lang/Object;", "setBuffer", "([Ljava/lang/Object;)V", "[Ljava/lang/Object;", "getOwnedBy", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "setOwnedBy", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "add", "elementHash", "element", "shift", "(ILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "addElementAt", "positionMask", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "calculateSize", "collisionAdd", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "collisionContainsElement", "", "(Ljava/lang/Object;)Z", "collisionRemove", "collisionRemoveElementAtIndex", "i", "contains", "(ILjava/lang/Object;I)Z", "containsAll", "otherNode", "elementAtIndex", "index", "(I)Ljava/lang/Object;", "elementsIdentityEquals", "hasNoCellAt", "indexOfCellAt", "indexOfCellAt$runtime_release", "makeNode", "elementHash1", "element1", "elementHash2", "element2", "owner", "(ILjava/lang/Object;ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "makeNodeAtIndex", "elementIndex", "newElementHash", "newElement", "(IILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "moveElementToNode", "(IILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableAdd", "mutator", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;", "(ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableAddAll", "intersectionSizeRef", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;", "mutableAddElementAt", "(ILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableCollisionAdd", "(Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableCollisionAddAll", "mutableCollisionRemove", "mutableCollisionRemoveAll", "mutableCollisionRemoveElementAtIndex", "mutableCollisionRetainAll", "mutableMoveElementToNode", "mutableRemove", "mutableRemoveAll", "mutableRemoveCellAtIndex", "cellIndex", "mutableRetainAll", "mutableUpdateNodeAtIndex", "nodeIndex", "newNode", "nodeAtIndex", "remove", "removeCellAtIndex", "updateNodeAtIndex", "Companion", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TrieNode<E> {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final TrieNode EMPTY = null;
    private int bitmap;
    private Object[] buffer;
    private MutabilityOwnership ownedBy;

    /* JADX INFO: compiled from: TrieNode.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "", "getEMPTY$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final TrieNode getEMPTY$runtime_release() {
            return TrieNode.access$getEMPTY$cp();
        }
    }

    public TrieNode(int bitmap, Object[] buffer, MutabilityOwnership ownedBy) {
        this.bitmap = bitmap;
        this.buffer = buffer;
        this.ownedBy = ownedBy;
    }

    public static final /* synthetic */ TrieNode access$getEMPTY$cp() {
        return EMPTY;
    }

    public final int getBitmap() {
        return this.bitmap;
    }

    public final void setBitmap(int r1) {
        this.bitmap = r1;
    }

    public final Object[] getBuffer() {
        return this.buffer;
    }

    public final void setBuffer(Object[] r1) {
        this.buffer = r1;
    }

    public final MutabilityOwnership getOwnedBy() {
        return this.ownedBy;
    }

    public final void setOwnedBy(MutabilityOwnership r1) {
        this.ownedBy = r1;
    }

    public TrieNode(int bitmap, Object[] buffer) {
        this(bitmap, buffer, null);
    }

    private final boolean hasNoCellAt(int positionMask) {
        if ((this.bitmap & positionMask) != 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final int indexOfCellAt$runtime_release(int positionMask) {
        return Integer.bitCount(this.bitmap & (positionMask - 1));
    }

    private final E elementAtIndex(int r2) {
        return (E) this.buffer[r2];
    }

    private final TrieNode<E> nodeAtIndex(int index) {
        Object r0 = this.buffer[index];
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        return (TrieNode) r0;
    }

    private final TrieNode<E> addElementAt(int positionMask, E r6) {
        int index = indexOfCellAt$runtime_release(positionMask);
        Object[] newBuffer = TrieNodeKt.access$addElementAtIndex(this.buffer, index, r6);
        return new TrieNode(this.bitmap | positionMask, newBuffer);
    }

    private final TrieNode<E> mutableAddElementAt(int positionMask, E r6, MutabilityOwnership owner) {
        int index = indexOfCellAt$runtime_release(positionMask);
        MutabilityOwnership r1 = this.ownedBy;
        Object[] r2 = this.buffer;
        if (r1 != owner) goto L6;
        this.buffer = TrieNodeKt.access$addElementAtIndex(r2, index, r6);
        this.bitmap |= positionMask;
        return this;
    L6:
        Object[] newBuffer = TrieNodeKt.access$addElementAtIndex(r2, index, r6);
        return new TrieNode(this.bitmap | positionMask, newBuffer, owner);
    }

    private final TrieNode<E> updateNodeAtIndex(int nodeIndex, TrieNode<E> r7) {
        Object[] newNodeBuffer = r7.buffer;
        if (newNodeBuffer.length == 1) goto L5;
    L11:
        Object cell = r7;
    L12:
        Object[] r2 = this.buffer;
        Object[] newBuffer = Arrays.copyOf(r2, r2.length);
        Intrinsics.checkNotNullExpressionValue(newBuffer, "copyOf(...)");
        newBuffer[nodeIndex] = cell;
        return new TrieNode(this.bitmap, newBuffer);
    L5:
        if ((newNodeBuffer[0] instanceof TrieNode) == true) goto L11;
        if (this.buffer.length != 1) goto L10;
        r7.bitmap = this.bitmap;
        return r7;
    L10:
        cell = newNodeBuffer[0];
        goto L12
    }

    private final TrieNode<E> mutableUpdateNodeAtIndex(int nodeIndex, TrieNode<E> r7, MutabilityOwnership owner) {
        Object[] newNodeBuffer = r7.buffer;
        if (newNodeBuffer.length == 1) goto L5;
    L11:
        Object cell = r7;
    L12:
        MutabilityOwnership r2 = this.ownedBy;
        Object[] r3 = this.buffer;
        if (r2 != owner) goto L16;
        r3[nodeIndex] = cell;
        return this;
    L16:
        Object[] newBuffer = Arrays.copyOf(r3, r3.length);
        Intrinsics.checkNotNullExpressionValue(newBuffer, "copyOf(...)");
        newBuffer[nodeIndex] = cell;
        return new TrieNode(this.bitmap, newBuffer, owner);
    L5:
        if ((newNodeBuffer[0] instanceof TrieNode) == true) goto L11;
        if (this.buffer.length != 1) goto L10;
        r7.bitmap = this.bitmap;
        return r7;
    L10:
        cell = newNodeBuffer[0];
        goto L12
    }

    private final TrieNode<E> makeNodeAtIndex(int elementIndex, int newElementHash, E r10, int shift, MutabilityOwnership owner) {
        E r2 = elementAtIndex(elementIndex);
        if (r2 == null) goto L5;
        int r0 = r2.hashCode();
    L7:
        return makeNode(r0, r2, newElementHash, r10, shift + 5, owner);
    L5:
        r0 = 0;
        goto L7
    }

    private final TrieNode<E> moveElementToNode(int elementIndex, int newElementHash, E r10, int shift) {
        Object[] r0 = this.buffer;
        Object[] newBuffer = Arrays.copyOf(r0, r0.length);
        Intrinsics.checkNotNullExpressionValue(newBuffer, "copyOf(...)");
        newBuffer[elementIndex] = makeNodeAtIndex(elementIndex, newElementHash, r10, shift, null);
        return new TrieNode(this.bitmap, newBuffer);
    }

    private final TrieNode<E> mutableMoveElementToNode(int elementIndex, int newElementHash, E r6, int shift, MutabilityOwnership owner) {
        MutabilityOwnership r0 = this.ownedBy;
        Object[] r1 = this.buffer;
        if (r0 != owner) goto L6;
        r1[elementIndex] = makeNodeAtIndex(elementIndex, newElementHash, r6, shift, owner);
        return this;
    L6:
        Object[] newBuffer = Arrays.copyOf(r1, r1.length);
        Intrinsics.checkNotNullExpressionValue(newBuffer, "copyOf(...)");
        newBuffer[elementIndex] = makeNodeAtIndex(elementIndex, newElementHash, r6, shift, owner);
        return new TrieNode(this.bitmap, newBuffer, owner);
    }

    private final TrieNode<E> makeNode(int elementHash1, E r13, int elementHash2, E r15, int shift, MutabilityOwnership owner) {
        if (shift > 30) goto L5;
        int setBit1 = TrieNodeKt.indexSegment(elementHash1, shift);
        int setBit2 = TrieNodeKt.indexSegment(elementHash2, shift);
        if (setBit1 == setBit2) goto L15;
        if (setBit1 >= setBit2) goto L11;
        Object[] nodeBuffer = {r13, r15};
    L13:
        return new TrieNode((1 << setBit1) | (1 << setBit2), nodeBuffer, owner);
    L11:
        nodeBuffer = new Object[]{r15, r13};
        goto L13
    L15:
        return new TrieNode(1 << setBit1, new Object[]{makeNode(elementHash1, r13, elementHash2, r15, shift + 5, owner)}, owner);
    L5:
        return new TrieNode(0, new Object[]{r13, r15}, owner);
    }

    private final TrieNode<E> removeCellAtIndex(int cellIndex, int positionMask) {
        Object[] newBuffer = TrieNodeKt.access$removeCellAtIndex(this.buffer, cellIndex);
        return new TrieNode(this.bitmap ^ positionMask, newBuffer);
    }

    private final TrieNode<E> mutableRemoveCellAtIndex(int cellIndex, int positionMask, MutabilityOwnership owner) {
        MutabilityOwnership r0 = this.ownedBy;
        Object[] r1 = this.buffer;
        if (r0 != owner) goto L6;
        this.buffer = TrieNodeKt.access$removeCellAtIndex(r1, cellIndex);
        this.bitmap ^= positionMask;
        return this;
    L6:
        Object[] newBuffer = TrieNodeKt.access$removeCellAtIndex(r1, cellIndex);
        return new TrieNode(this.bitmap ^ positionMask, newBuffer, owner);
    }

    private final TrieNode<E> collisionRemoveElementAtIndex(int i) {
        Object[] newBuffer = TrieNodeKt.access$removeCellAtIndex(this.buffer, i);
        return new TrieNode(0, newBuffer);
    }

    private final TrieNode<E> mutableCollisionRemoveElementAtIndex(int i, MutabilityOwnership owner) {
        MutabilityOwnership r0 = this.ownedBy;
        Object[] r1 = this.buffer;
        if (r0 != owner) goto L6;
        this.buffer = TrieNodeKt.access$removeCellAtIndex(r1, i);
        return this;
    L6:
        Object[] newBuffer = TrieNodeKt.access$removeCellAtIndex(r1, i);
        return new TrieNode(0, newBuffer, owner);
    }

    private final boolean collisionContainsElement(E r2) {
        return ArraysKt.contains(this.buffer, r2);
    }

    private final TrieNode<E> collisionAdd(E r4) {
        if (collisionContainsElement(r4) == false) goto L5;
        return this;
    L5:
        Object[] newBuffer = TrieNodeKt.access$addElementAtIndex(this.buffer, 0, r4);
        return new TrieNode(0, newBuffer);
    }

    private final TrieNode<E> mutableCollisionAdd(E r5, PersistentHashSetBuilder<?> r6) {
        if (collisionContainsElement(r5) == false) goto L5;
        return this;
    L5:
        r6.setSize(r6.size() + 1);
        MutabilityOwnership r0 = this.ownedBy;
        MutabilityOwnership r1 = r6.getOwnership$runtime_release();
        Object[] r2 = this.buffer;
        if (r0 != r1) goto L9;
        this.buffer = TrieNodeKt.access$addElementAtIndex(r2, 0, r5);
        return this;
    L9:
        Object[] newBuffer = TrieNodeKt.access$addElementAtIndex(r2, 0, r5);
        return new TrieNode(0, newBuffer, r6.getOwnership$runtime_release());
    }

    private final TrieNode<E> collisionRemove(E r3) {
        int index = ArraysKt.indexOf(this.buffer, r3);
        if (index != (-1)) goto L5;
        return this;
    L5:
        return collisionRemoveElementAtIndex(index);
    }

    private final TrieNode<E> mutableCollisionRemove(E r4, PersistentHashSetBuilder<?> r5) {
        int index = ArraysKt.indexOf(this.buffer, r4);
        if (index == (-1)) goto L6;
        r5.setSize(r5.size() - 1);
        return mutableCollisionRemoveElementAtIndex(index, r5.getOwnership$runtime_release());
    L6:
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final TrieNode<E> mutableCollisionAddAll(TrieNode<E> r18, DeltaCounter intersectionSizeRef, MutabilityOwnership owner) {
        Object[] r4 = this.buffer;
        if (this != r18) goto L6;
        intersectionSizeRef.plusAssign(r4.length);
        return this;
    L6:
        Object[] tempBuffer = Arrays.copyOf(r4, this.buffer.length + r18.buffer.length);
        Intrinsics.checkNotNullExpressionValue(tempBuffer, "copyOf(...)");
        Object[] $this$filterTo$iv = r18.buffer;
        int newArrayOffset$iv = this.buffer.length;
        int i$iv = 0;
        int j$iv = 0;
    L7:
        boolean r12 = false;
        if (i$iv >= $this$filterTo$iv.length) goto L20;
        if (j$iv > i$iv) goto L12;
        boolean r13 = true;
    L13:
        CommonFunctionsKt.m3921assert(r13);
        Object e$iv = $this$filterTo$iv[i$iv];
        if (collisionContainsElement(e$iv) == true) goto L19;
        tempBuffer[newArrayOffset$iv + j$iv] = $this$filterTo$iv[i$iv];
        j$iv = j$iv + 1;
        if ((newArrayOffset$iv + j$iv) > tempBuffer.length) goto L18;
        r12 = true;
    L18:
        CommonFunctionsKt.m3921assert(r12);
    L19:
        i$iv = i$iv + 1;
        goto L7
    L12:
        r13 = false;
        goto L13
    L20:
        int totalSize = this.buffer.length + j$iv;
        intersectionSizeRef.plusAssign(tempBuffer.length - totalSize);
        if (totalSize != this.buffer.length) goto L24;
        return this;
    L24:
        if (totalSize != r18.buffer.length) goto L27;
        return r18;
    L27:
        if (totalSize != tempBuffer.length) goto L29;
        Object[] newBuffer = tempBuffer;
    L31:
        if (Intrinsics.areEqual(this.ownedBy, owner) == false) goto L34;
        this.buffer = newBuffer;
        return this;
    L34:
        return new TrieNode(0, newBuffer, owner);
    L29:
        newBuffer = Arrays.copyOf(tempBuffer, totalSize);
        Intrinsics.checkNotNullExpressionValue(newBuffer, "copyOf(...)");
        goto L31
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object mutableCollisionRetainAll(TrieNode<E> r12, DeltaCounter intersectionSizeRef, MutabilityOwnership owner) {
        if (this != r12) goto L5;
        intersectionSizeRef.plusAssign(this.buffer.length);
        return this;
    L5:
        boolean r0 = Intrinsics.areEqual(owner, this.ownedBy);
        Object[] tempBuffer = this.buffer;
        if (r0 == true) goto L9;
        tempBuffer = new Object[Math.min(tempBuffer.length, r12.buffer.length)];
    L9:
        Object[] $this$filterTo_u24default$iv = this.buffer;
        int i$iv = 0;
        int j$iv = 0;
    L10:
        boolean r7 = false;
        if (i$iv >= $this$filterTo_u24default$iv.length) goto L22;
        if (j$iv > i$iv) goto L14;
        boolean r6 = true;
    L15:
        CommonFunctionsKt.m3921assert(r6);
        Object e$iv = $this$filterTo_u24default$iv[i$iv];
        if (r12.collisionContainsElement(e$iv) == false) goto L21;
        tempBuffer[0 + j$iv] = $this$filterTo_u24default$iv[i$iv];
        j$iv = j$iv + 1;
        if ((0 + j$iv) > tempBuffer.length) goto L20;
        r7 = true;
    L20:
        CommonFunctionsKt.m3921assert(r7);
    L21:
        i$iv = i$iv + 1;
        goto L10
    L14:
        r6 = false;
        goto L15
    L22:
        intersectionSizeRef.plusAssign(j$iv);
        if (j$iv == 0) goto L41;
        if (j$iv != 1) goto L28;
        return tempBuffer[0];
    L28:
        if (j$iv != this.buffer.length) goto L31;
        return this;
    L31:
        if (j$iv != r12.buffer.length) goto L34;
        return r12;
    L34:
        if (j$iv == tempBuffer.length) goto L45;
        Object[] r2 = Arrays.copyOf(tempBuffer, j$iv);
        Intrinsics.checkNotNullExpressionValue(r2, "copyOf(...)");
        return new TrieNode(0, r2, owner);
    L45:
        return new TrieNode(0, tempBuffer, owner);
    L41:
        return EMPTY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object mutableCollisionRemoveAll(TrieNode<E> r13, DeltaCounter intersectionSizeRef, MutabilityOwnership owner) {
        if (this != r13) goto L5;
        intersectionSizeRef.plusAssign(this.buffer.length);
        return EMPTY;
    L5:
        boolean r0 = Intrinsics.areEqual(owner, this.ownedBy);
        Object[] tempBuffer = this.buffer;
        if (r0 == true) goto L9;
        tempBuffer = new Object[tempBuffer.length];
    L9:
        Object[] $this$filterTo_u24default$iv = this.buffer;
        int i$iv = 0;
        int j$iv = 0;
    L10:
        boolean r7 = false;
        if (i$iv >= $this$filterTo_u24default$iv.length) goto L22;
        if (j$iv > i$iv) goto L14;
        boolean r6 = true;
    L15:
        CommonFunctionsKt.m3921assert(r6);
        Object e$iv = $this$filterTo_u24default$iv[i$iv];
        if (r13.collisionContainsElement(e$iv) == true) goto L21;
        tempBuffer[0 + j$iv] = $this$filterTo_u24default$iv[i$iv];
        j$iv = j$iv + 1;
        if ((0 + j$iv) > tempBuffer.length) goto L20;
        r7 = true;
    L20:
        CommonFunctionsKt.m3921assert(r7);
    L21:
        i$iv = i$iv + 1;
        goto L10
    L14:
        r6 = false;
        goto L15
    L22:
        intersectionSizeRef.plusAssign(this.buffer.length - j$iv);
        if (j$iv == 0) goto L38;
        if (j$iv != 1) goto L28;
        return tempBuffer[0];
    L28:
        if (j$iv != this.buffer.length) goto L31;
        return this;
    L31:
        if (j$iv == tempBuffer.length) goto L41;
        Object[] r2 = Arrays.copyOf(tempBuffer, j$iv);
        Intrinsics.checkNotNullExpressionValue(r2, "copyOf(...)");
        return new TrieNode(0, r2, owner);
    L41:
        return new TrieNode(0, tempBuffer, owner);
    L38:
        return EMPTY;
    }

    private final int calculateSize() {
        int r0 = this.bitmap;
        Object[] r1 = this.buffer;
        if (r0 == 0) goto L5;
        int result = 0;
        int r2 = r1.length;
        int r3 = 0;
    L7:
        if (r3 >= r2) goto L13;
        Object e = r1[r3];
        if ((e instanceof TrieNode) == false) goto L11;
        int r5 = ((TrieNode) e).calculateSize();
    L12:
        result = result + r5;
        r3 = r3 + 1;
        goto L7
    L11:
        r5 = 1;
        goto L12
    L13:
        return result;
    L5:
        return r1.length;
    }

    private final boolean elementsIdentityEquals(TrieNode<E> r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if (this.bitmap == r7.bitmap) goto L8;
        return false;
    L8:
        int i = 0;
        int r2 = this.buffer.length;
    L9:
        if (i >= r2) goto L14;
        if (this.buffer[i] != r7.buffer[i]) goto L12;
        i = i + 1;
        goto L9
    L12:
        return false;
    L14:
        return true;
    }

    public final boolean contains(int elementHash, E r6, int shift) {
        int cellPositionMask = 1 << TrieNodeKt.indexSegment(elementHash, shift);
        if (hasNoCellAt(cellPositionMask) == false) goto L6;
        return false;
    L6:
        int cellIndex = indexOfCellAt$runtime_release(cellPositionMask);
        if ((this.buffer[cellIndex] instanceof TrieNode) == false) goto L15;
        TrieNode<E> r2 = nodeAtIndex(cellIndex);
        if (shift != 30) goto L13;
        return r2.collisionContainsElement(r6);
    L13:
        return r2.contains(elementHash, r6, shift + 5);
    L15:
        return Intrinsics.areEqual(r6, this.buffer[cellIndex]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25 */
    public final TrieNode<E> mutableAddAll(TrieNode<E> r27, int r28, DeltaCounter r29, PersistentHashSetBuilder<?> r30) {
        TrieNode<E> r0 = this;
        if (r0 != r27) goto L7;
        r29.setCount(r29.getCount() + r0.calculateSize());
        return r0;
    L7:
        if (r28 > 30) goto L9;
        int r11 = r0.bitmap | r27.bitmap;
        if (r11 == r0.bitmap) goto L13;
    L15:
        TrieNode<E> r1 = new TrieNode(r11, new Object[Integer.bitCount(r11)], r30.getOwnership$runtime_release());
    L16:
        TrieNode<E> r12 = r1;
        int r15 = r11;
        int r16 = 0;
        TrieNode r2 = r0;
    L17:
        if (r15 == 0) goto L59;
        int r17 = Integer.lowestOneBit(r15);
        int r18 = r16;
        int r20 = r2.indexOfCellAt$runtime_release(r17);
        int r21 = r27.indexOfCellAt$runtime_release(r17);
        Object[] r3 = r12.buffer;
        if (r2.hasNoCellAt(r17) == false) goto L21;
        Object r4 = r27.buffer[r21];
        Object[] r23 = r3;
    L57:
        r23[r18] = r4;
        r16 = r16 + 1;
        r15 = r15 ^ r17;
        r2 = r2;
        goto L17
    L21:
        boolean r5 = r27.hasNoCellAt(r17);
        Object[] r6 = r2.buffer;
        if (r5 == false) goto L24;
        r4 = r6[r20];
        r23 = r3;
        goto L57
    L24:
        r4 = r6[r20];
        Object r7 = r27.buffer[r21];
        boolean r8 = r4 instanceof TrieNode;
        boolean r9 = r7 instanceof TrieNode;
        if (r8 == false) goto L28;
        if (r9 == false) goto L28;
        Intrinsics.checkNotNull(r4, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        TrieNode r22 = (TrieNode) r4;
        Intrinsics.checkNotNull(r7, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        TrieNode r10 = (TrieNode) r7;
        r23 = r3;
        r4 = ((TrieNode) r4).mutableAddAll((TrieNode) r7, r28 + 5, r29, r30);
        r2 = this;
    L28:
        r23 = r3;
        int r13 = 0;
        if (r8 == false) goto L38;
        Intrinsics.checkNotNull(r4, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        TrieNode r14 = (TrieNode) r4;
        int r19 = r30.size();
        TrieNode r24 = (TrieNode) r4;
        if (r7 == null) goto L33;
        r13 = r7.hashCode();
    L33:
        TrieNode r25 = r24.mutableAdd(r13, r7, r28 + 5, r30);
        if (r30.size() != r19) goto L36;
        r29.setCount(r29.getCount() + 1);
    L36:
        Unit r26 = Unit.INSTANCE;
        r2 = this;
        r4 = r25;
        goto L57
    L38:
        if (r9 == false) goto L47;
        Intrinsics.checkNotNull(r7, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        TrieNode r31 = (TrieNode) r7;
        int r32 = r30.size();
        TrieNode r33 = (TrieNode) r7;
        if (r4 == null) goto L42;
        r13 = r4.hashCode();
    L42:
        TrieNode r34 = r33.mutableAdd(r13, r4, r28 + 5, r30);
        if (r30.size() != r32) goto L45;
        r29.setCount(r29.getCount() + 1);
    L45:
        Unit r35 = Unit.INSTANCE;
        r2 = this;
        r4 = r34;
        goto L57
    L47:
        if (Intrinsics.areEqual(r4, r7) == false) goto L50;
        r29.setCount(r29.getCount() + 1);
        Unit r36 = Unit.INSTANCE;
        r2 = this;
        goto L57
    L50:
        if (r4 == null) goto L52;
        int r37 = r4.hashCode();
    L54:
        if (r7 == null) goto L56;
        r13 = r7.hashCode();
    L56:
        int r38 = r13;
        int r39 = r37;
        r2 = this;
        r4 = r2.makeNode(r39, r4, r38, r7, r28 + 5, r30.getOwnership$runtime_release());
        goto L57
    L52:
        r37 = 0;
        goto L54
    L59:
        if (r2.elementsIdentityEquals(r12) == false) goto L62;
        return (TrieNode<E>) r2;
    L62:
        if (r27.elementsIdentityEquals(r12) == false) goto L65;
        return r27;
    L65:
        return r12;
    L13:
        if (Intrinsics.areEqual(r0.ownedBy, r30.getOwnership$runtime_release()) == false) goto L15;
        r1 = r0;
        goto L16
    L9:
        return r0.mutableCollisionAddAll(r27, r29, r30.getOwnership$runtime_release());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object mutableRetainAll(TrieNode<E> r28, int shift, DeltaCounter intersectionSizeRef, PersistentHashSetBuilder<?> r31) {
        if (this != r28) goto L7;
        intersectionSizeRef.plusAssign(calculateSize());
        return this;
    L7:
        if (shift > 30) goto L9;
        int newBitMap = this.bitmap & r28.bitmap;
        if (newBitMap != 0) goto L15;
        return EMPTY;
    L15:
        if (Intrinsics.areEqual(this.ownedBy, r31.getOwnership$runtime_release()) == true) goto L17;
    L19:
        TrieNode<E> r5 = new TrieNode(newBitMap, new Object[Integer.bitCount(newBitMap)], r31.getOwnership$runtime_release());
    L20:
        int realBitMap = 0;
        int $this$forEachOneBit$iv = newBitMap;
        int $i$f$forEachOneBit = 0;
        int mask$iv = $this$forEachOneBit$iv;
        int index$iv = 0;
    L21:
        if (mask$iv == 0) goto L54;
        int bit$iv = Integer.lowestOneBit(mask$iv);
        int newNodeIndex = index$iv;
        int thisIndex = indexOfCellAt$runtime_release(bit$iv);
        int otherNodeIndex = r28.indexOfCellAt$runtime_release(bit$iv);
        Object thisCell = this.buffer[thisIndex];
        Object otherNodeCell = r28.buffer[otherNodeIndex];
        int $this$forEachOneBit$iv2 = $this$forEachOneBit$iv;
        boolean thisIsNode = thisCell instanceof TrieNode;
        boolean thisIsNode2 = otherNodeCell instanceof TrieNode;
        if (thisIsNode == false) goto L26;
        if (thisIsNode2 == false) goto L26;
        Intrinsics.checkNotNull(thisCell, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        TrieNode r19 = (TrieNode) thisCell;
        Intrinsics.checkNotNull(otherNodeCell, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        TrieNode r7 = (TrieNode) otherNodeCell;
        int $i$f$forEachOneBit2 = $i$f$forEachOneBit;
        int mask$iv2 = mask$iv;
        int mask$iv3 = shift + 5;
        int index$iv2 = index$iv;
        Object newValue = ((TrieNode) thisCell).mutableRetainAll((TrieNode) otherNodeCell, mask$iv3, intersectionSizeRef, r31);
    L51:
        if (newValue == EMPTY) goto L53;
        realBitMap = realBitMap | bit$iv;
    L53:
        r5.buffer[newNodeIndex] = newValue;
        mask$iv = mask$iv2 ^ bit$iv;
        index$iv = index$iv2 + 1;
        $this$forEachOneBit$iv = $this$forEachOneBit$iv2;
        $i$f$forEachOneBit = $i$f$forEachOneBit2;
    L26:
        $i$f$forEachOneBit2 = $i$f$forEachOneBit;
        mask$iv2 = mask$iv;
        index$iv2 = index$iv;
        if (thisIsNode == false) goto L36;
        Intrinsics.checkNotNull(thisCell, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        TrieNode r8 = (TrieNode) thisCell;
        TrieNode r9 = (TrieNode) thisCell;
        if (otherNodeCell == null) goto L31;
        int r10 = otherNodeCell.hashCode();
    L33:
        if (r9.contains(r10, otherNodeCell, shift + 5) == false) goto L35;
        intersectionSizeRef.plusAssign(1);
        newValue = otherNodeCell;
        goto L51
    L35:
        newValue = EMPTY;
        goto L51
    L31:
        r10 = 0;
        goto L33
    L36:
        if (thisIsNode2 == false) goto L46;
        Intrinsics.checkNotNull(otherNodeCell, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        TrieNode r11 = (TrieNode) otherNodeCell;
        TrieNode r12 = (TrieNode) otherNodeCell;
        if (thisCell == null) goto L40;
        int r13 = thisCell.hashCode();
    L42:
        if (r12.contains(r13, thisCell, shift + 5) == false) goto L44;
        intersectionSizeRef.plusAssign(1);
    L48:
        newValue = thisCell;
        goto L51
    L44:
        newValue = EMPTY;
        goto L51
    L40:
        r13 = 0;
        goto L42
    L46:
        if (Intrinsics.areEqual(thisCell, otherNodeCell) == false) goto L49;
        intersectionSizeRef.plusAssign(1);
        goto L48
    L49:
        newValue = EMPTY;
        goto L51
    L54:
        int realSize = Integer.bitCount(realBitMap);
        if (realBitMap == 0) goto L97;
        if (realBitMap == newBitMap) goto L59;
        boolean r14 = true;
        if (realSize != 1) goto L72;
        if (shift == 0) goto L72;
        Object single = r5.buffer[r5.indexOfCellAt$runtime_release(realBitMap)];
        if ((single instanceof TrieNode) == true) goto L101;
        return single;
    L101:
        return new TrieNode(realBitMap, new Object[]{single}, r31.getOwnership$runtime_release());
    L72:
        Object[] realBuffer = new Object[realSize];
        Object[] $this$filterTo_u24default$iv = r5.buffer;
        int i$iv = 0;
        int j$iv = 0;
    L74:
        if (i$iv >= $this$filterTo_u24default$iv.length) goto L90;
        if (j$iv > i$iv) goto L77;
        boolean r15 = r14;
    L78:
        CommonFunctionsKt.m3921assert(r15);
        Object e$iv = $this$filterTo_u24default$iv[i$iv];
        if (e$iv == Companion.getEMPTY$runtime_release()) goto L81;
        boolean r16 = true;
    L82:
        if (r16 == false) goto L88;
        realBuffer[0 + j$iv] = $this$filterTo_u24default$iv[i$iv];
        j$iv = j$iv + 1;
        if ((0 + j$iv) > realBuffer.length) goto L86;
        boolean r17 = true;
    L87:
        CommonFunctionsKt.m3921assert(r17);
        goto L88
    L86:
        r17 = false;
    L88:
        i$iv = i$iv + 1;
        r14 = true;
        goto L74
    L81:
        r16 = false;
        goto L82
    L77:
        r15 = false;
        goto L78
    L90:
        return new TrieNode(realBitMap, realBuffer, r31.getOwnership$runtime_release());
    L59:
        if (r5.elementsIdentityEquals(this) == false) goto L62;
        return this;
    L62:
        if (r5.elementsIdentityEquals(r28) == false) goto L100;
        return r28;
    L100:
        return r5;
    L97:
        return EMPTY;
    L17:
        if (newBitMap != this.bitmap) goto L19;
        r5 = this;
        goto L20
    L9:
        return mutableCollisionRetainAll(r28, intersectionSizeRef, r31.getOwnership$runtime_release());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object mutableRemoveAll(TrieNode<E> r27, int shift, DeltaCounter intersectionSizeRef, PersistentHashSetBuilder<?> r30) {
        TrieNode<E> r1 = r27;
        if (this != r1) goto L7;
        intersectionSizeRef.plusAssign(calculateSize());
        return EMPTY;
    L7:
        if (shift > 30) goto L9;
        int removalBitmap = this.bitmap & r1.bitmap;
        if (removalBitmap != 0) goto L14;
        return this;
    L14:
        if (Intrinsics.areEqual(this.ownedBy, r30.getOwnership$runtime_release()) == false) goto L16;
        TrieNode<E> r6 = this;
    L17:
        int realBitMap = this.bitmap;
        int $this$forEachOneBit$iv = removalBitmap;
        int $i$f$forEachOneBit = 0;
        int mask$iv = $this$forEachOneBit$iv;
        int index$iv = 0;
    L18:
        if (mask$iv == 0) goto L57;
        int bit$iv = Integer.lowestOneBit(mask$iv);
        int thisIndex = indexOfCellAt$runtime_release(bit$iv);
        int otherNodeIndex = r1.indexOfCellAt$runtime_release(bit$iv);
        Object thisCell = this.buffer[thisIndex];
        Object otherNodeCell = r1.buffer[otherNodeIndex];
        boolean thisIsNode = thisCell instanceof TrieNode;
        boolean thisIsNode2 = otherNodeCell instanceof TrieNode;
        if (thisIsNode == false) goto L23;
        if (thisIsNode2 == false) goto L23;
        Intrinsics.checkNotNull(thisCell, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        TrieNode r19 = (TrieNode) thisCell;
        Intrinsics.checkNotNull(otherNodeCell, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        TrieNode r2 = (TrieNode) otherNodeCell;
        int removalBitmap2 = removalBitmap;
        int $this$forEachOneBit$iv2 = $this$forEachOneBit$iv;
        Object newValue = ((TrieNode) thisCell).mutableRemoveAll((TrieNode) otherNodeCell, shift + 5, intersectionSizeRef, r30);
        int $i$f$forEachOneBit2 = $i$f$forEachOneBit;
    L54:
        if (newValue != EMPTY) goto L56;
        realBitMap = realBitMap ^ bit$iv;
    L56:
        r6.buffer[thisIndex] = newValue;
        index$iv = index$iv + 1;
        mask$iv = mask$iv ^ bit$iv;
        r1 = r27;
        removalBitmap = removalBitmap2;
        $this$forEachOneBit$iv = $this$forEachOneBit$iv2;
        $i$f$forEachOneBit = $i$f$forEachOneBit2;
    L23:
        removalBitmap2 = removalBitmap;
        $this$forEachOneBit$iv2 = $this$forEachOneBit$iv;
        if (thisIsNode == false) goto L38;
        Intrinsics.checkNotNull(thisCell, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        TrieNode r3 = (TrieNode) thisCell;
        int oldSize = r30.size();
        TrieNode r5 = (TrieNode) thisCell;
        if (otherNodeCell == null) goto L28;
        int r8 = otherNodeCell.hashCode();
    L29:
        $i$f$forEachOneBit2 = $i$f$forEachOneBit;
        int $i$f$forEachOneBit3 = shift + 5;
        TrieNode removed = r5.mutableRemove(r8, otherNodeCell, $i$f$forEachOneBit3, r30);
        if (oldSize == r30.size()) goto L52;
        intersectionSizeRef.plusAssign(1);
        if (removed.buffer.length == 1) goto L34;
    L36:
        newValue = removed;
        goto L54
    L34:
        if ((removed.buffer[0] instanceof TrieNode) == true) goto L36;
        newValue = removed.buffer[0];
    L52:
        newValue = thisCell;
        goto L54
    L28:
        r8 = 0;
        goto L29
    L38:
        $i$f$forEachOneBit2 = $i$f$forEachOneBit;
        if (thisIsNode2 == false) goto L49;
        Intrinsics.checkNotNull(otherNodeCell, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        TrieNode r4 = (TrieNode) otherNodeCell;
        TrieNode r7 = (TrieNode) otherNodeCell;
        if (thisCell == null) goto L43;
        int r9 = thisCell.hashCode();
    L45:
        if (r7.contains(r9, thisCell, shift + 5) == false) goto L52;
        intersectionSizeRef.plusAssign(1);
        newValue = EMPTY;
        goto L54
    L43:
        r9 = 0;
        goto L45
    L49:
        if (Intrinsics.areEqual(thisCell, otherNodeCell) == false) goto L52;
        intersectionSizeRef.plusAssign(1);
        newValue = EMPTY;
        goto L54
    L57:
        int realSize = Integer.bitCount(realBitMap);
        if (realBitMap != 0) goto L61;
        return EMPTY;
    L61:
        if (realBitMap == this.bitmap) goto L63;
        boolean r10 = true;
        if (realSize != 1) goto L73;
        if (shift == 0) goto L73;
        Object single = r6.buffer[r6.indexOfCellAt$runtime_release(realBitMap)];
        if ((single instanceof TrieNode) == true) goto L101;
        return single;
    L101:
        return new TrieNode(realBitMap, new Object[]{single}, r30.getOwnership$runtime_release());
    L73:
        Object[] realBuffer = new Object[realSize];
        Object[] $this$filterTo_u24default$iv = r6.buffer;
        int i$iv = 0;
        int j$iv = 0;
    L75:
        if (i$iv >= $this$filterTo_u24default$iv.length) goto L91;
        if (j$iv > i$iv) goto L78;
        boolean r13 = r10;
    L79:
        CommonFunctionsKt.m3921assert(r13);
        Object e$iv = $this$filterTo_u24default$iv[i$iv];
        if (e$iv == Companion.getEMPTY$runtime_release()) goto L82;
        boolean r11 = true;
    L83:
        if (r11 == false) goto L89;
        realBuffer[0 + j$iv] = $this$filterTo_u24default$iv[i$iv];
        j$iv = j$iv + 1;
        if ((0 + j$iv) > realBuffer.length) goto L87;
        boolean r12 = true;
    L88:
        CommonFunctionsKt.m3921assert(r12);
        goto L89
    L87:
        r12 = false;
    L89:
        i$iv = i$iv + 1;
        r10 = true;
        goto L75
    L82:
        r11 = false;
        goto L83
    L78:
        r13 = false;
        goto L79
    L91:
        return new TrieNode(realBitMap, realBuffer, r30.getOwnership$runtime_release());
    L63:
        if (r6.elementsIdentityEquals(this) == false) goto L100;
        return this;
    L100:
        return r6;
    L16:
        int r14 = this.bitmap;
        Object[] r15 = this.buffer;
        Object[] r16 = Arrays.copyOf(r15, r15.length);
        Intrinsics.checkNotNullExpressionValue(r16, "copyOf(...)");
        r6 = new TrieNode(r14, r16, r30.getOwnership$runtime_release());
        goto L17
    L9:
        return mutableCollisionRemoveAll(r1, intersectionSizeRef, r30.getOwnership$runtime_release());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public final boolean containsAll(TrieNode<E> r21, int r22) {
        TrieNode<E> r0 = this;
        TrieNode<E> r1 = r21;
        boolean r3 = true;
        if (r0 != r1) goto L5;
        return true;
    L5:
        boolean r5 = false;
        if (r22 <= 30) goto L15;
        Object[] r4 = r1.buffer;
        int r7 = r4.length;
        int r8 = 0;
    L8:
        if (r8 >= r7) goto L52;
        if (ArraysKt.contains(r0.buffer, r4[r8]) == false) goto L14;
        r8 = r8 + 1;
        goto L8
    L14:
        return false;
    L52:
        return true;
    L15:
        int r6 = r0.bitmap & r1.bitmap;
        if (r6 == r1.bitmap) goto L18;
        return false;
    L18:
        int r9 = r6;
        int r10 = 0;
    L19:
        if (r9 == 0) goto L41;
        int r11 = Integer.lowestOneBit(r9);
        int r13 = r0.indexOfCellAt$runtime_release(r11);
        int r14 = r1.indexOfCellAt$runtime_release(r11);
        Object r15 = r0.buffer[r13];
        boolean r16 = r3;
        Object r12 = r1.buffer[r14];
        boolean r17 = r5;
        boolean r18 = r15 instanceof TrieNode;
        boolean r2 = r12 instanceof TrieNode;
        if (r18 == false) goto L26;
        if (r2 == false) goto L26;
        Intrinsics.checkNotNull(r15, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        TrieNode r19 = (TrieNode) r15;
        Intrinsics.checkNotNull(r12, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        TrieNode r20 = (TrieNode) r12;
        if (((TrieNode) r15).containsAll((TrieNode) r12, r22 + 5) == true) goto L39;
        return r17;
    L39:
        r10 = r10 + 1;
        r9 = r9 ^ r11;
        r0 = this;
        r1 = r21;
        r3 = r16;
        r5 = r17;
    L26:
        if (r18 == false) goto L34;
        Intrinsics.checkNotNull(r15, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        TrieNode r23 = (TrieNode) r15;
        ?? r24 = (TrieNode) r15;
        if (r12 == null) goto L30;
        ?? r25 = r12.hashCode();
    L32:
        if (r24.contains(r25, r12, r22 + 5) == true) goto L39;
        return r17;
    L30:
        r25 = r17;
        goto L32
    L34:
        if (r2 == true) goto L35;
        if (Intrinsics.areEqual(r15, r12) == true) goto L39;
        return r17;
    L35:
        return r17;
    L41:
        return r3;
    }

    public final TrieNode<E> add(int elementHash, E r7, int shift) {
        int cellPositionMask = 1 << TrieNodeKt.indexSegment(elementHash, shift);
        if (hasNoCellAt(cellPositionMask) == true) goto L5;
        int cellIndex = indexOfCellAt$runtime_release(cellPositionMask);
        if ((this.buffer[cellIndex] instanceof TrieNode) == false) goto L18;
        TrieNode<E> r2 = nodeAtIndex(cellIndex);
        if (shift != 30) goto L11;
        TrieNode<E> r3 = r2.collisionAdd(r7);
    L13:
        if (r2 != r3) goto L16;
        return this;
    L16:
        return updateNodeAtIndex(cellIndex, r3);
    L11:
        r3 = r2.add(elementHash, r7, shift + 5);
        goto L13
    L18:
        if (Intrinsics.areEqual(r7, this.buffer[cellIndex]) == false) goto L21;
        return this;
    L21:
        return moveElementToNode(cellIndex, elementHash, r7, shift);
    L5:
        return addElementAt(cellPositionMask, r7);
    }

    public final TrieNode<E> mutableAdd(int elementHash, E r10, int shift, PersistentHashSetBuilder<?> r12) {
        int cellPosition = 1 << TrieNodeKt.indexSegment(elementHash, shift);
        if (hasNoCellAt(cellPosition) == false) goto L6;
        r12.setSize(r12.size() + 1);
        return mutableAddElementAt(cellPosition, r10, r12.getOwnership$runtime_release());
    L6:
        int cellIndex = indexOfCellAt$runtime_release(cellPosition);
        if ((this.buffer[cellIndex] instanceof TrieNode) == false) goto L18;
        TrieNode<E> r1 = nodeAtIndex(cellIndex);
        if (shift != 30) goto L11;
        TrieNode<E> r2 = r1.mutableCollisionAdd(r10, r12);
    L13:
        if (r1 != r2) goto L16;
        return this;
    L16:
        return mutableUpdateNodeAtIndex(cellIndex, r2, r12.getOwnership$runtime_release());
    L11:
        r2 = r1.mutableAdd(elementHash, r10, shift + 5, r12);
        goto L13
    L18:
        if (Intrinsics.areEqual(r10, this.buffer[cellIndex]) == false) goto L20;
        return this;
    L20:
        r12.setSize(r12.size() + 1);
        return mutableMoveElementToNode(cellIndex, elementHash, r10, shift, r12.getOwnership$runtime_release());
    }

    public final TrieNode<E> remove(int elementHash, E r7, int shift) {
        int cellPositionMask = 1 << TrieNodeKt.indexSegment(elementHash, shift);
        if (hasNoCellAt(cellPositionMask) == false) goto L5;
        return this;
    L5:
        int cellIndex = indexOfCellAt$runtime_release(cellPositionMask);
        if ((this.buffer[cellIndex] instanceof TrieNode) == false) goto L17;
        TrieNode<E> r2 = nodeAtIndex(cellIndex);
        if (shift != 30) goto L10;
        TrieNode<E> r3 = r2.collisionRemove(r7);
    L12:
        if (r2 != r3) goto L15;
        return this;
    L15:
        return updateNodeAtIndex(cellIndex, r3);
    L10:
        r3 = r2.remove(elementHash, r7, shift + 5);
        goto L12
    L17:
        if (Intrinsics.areEqual(r7, this.buffer[cellIndex]) == true) goto L19;
        return this;
    L19:
        return removeCellAtIndex(cellIndex, cellPositionMask);
    }

    public final TrieNode<E> mutableRemove(int elementHash, E r8, int shift, PersistentHashSetBuilder<?> r10) {
        int cellPositionMask = 1 << TrieNodeKt.indexSegment(elementHash, shift);
        if (hasNoCellAt(cellPositionMask) == false) goto L5;
        return this;
    L5:
        int cellIndex = indexOfCellAt$runtime_release(cellPositionMask);
        if ((this.buffer[cellIndex] instanceof TrieNode) == false) goto L19;
        TrieNode<E> r2 = nodeAtIndex(cellIndex);
        if (shift != 30) goto L10;
        TrieNode<E> r3 = r2.mutableCollisionRemove(r8, r10);
    L12:
        if (this.ownedBy == r10.getOwnership$runtime_release()) goto L17;
        if (r2 != r3) goto L17;
        return this;
    L17:
        return mutableUpdateNodeAtIndex(cellIndex, r3, r10.getOwnership$runtime_release());
    L10:
        r3 = r2.mutableRemove(elementHash, r8, shift + 5, r10);
        goto L12
    L19:
        if (Intrinsics.areEqual(r8, this.buffer[cellIndex]) == false) goto L22;
        r10.setSize(r10.size() - 1);
        return mutableRemoveCellAtIndex(cellIndex, cellPositionMask, r10.getOwnership$runtime_release());
    L22:
        return this;
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
        EMPTY = new TrieNode(0, new Object[0]);
    }
}
