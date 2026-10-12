package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: PersistentVector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010*\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B5\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0011J#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u001d\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016J\u0016\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\tH\u0096\u0002¢\u0006\u0002\u0010\u0019JG\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u001dH\u0002¢\u0006\u0002\u0010\u001eJ5\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010 \u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0002\u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010\u0012\u001a\u00020\tH\u0016J?\u0010$\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u001dH\u0002¢\u0006\u0002\u0010&J3\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010(\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tH\u0002¢\u0006\u0002\u0010)JC\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u000e\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0002¢\u0006\u0002\u0010-J?\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00052\u0006\u0010\u001b\u001a\u00020\t2\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0002¢\u0006\u0002\u0010/J\"\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020302H\u0016J\u0016\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0012\u001a\u00020\tH\u0016J=\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u001dH\u0002¢\u0006\u0002\u0010&J;\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010(\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0002\u00107J\b\u0010(\u001a\u00020\tH\u0002J#\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J?\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\b\u0010:\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0002\u0010;R\u0018\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006<"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList;", "root", "", "", "tail", "size", "", "rootShift", "([Ljava/lang/Object;[Ljava/lang/Object;II)V", "[Ljava/lang/Object;", "getSize", "()I", "add", "element", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "index", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "bufferFor", "(I)[Ljava/lang/Object;", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "get", "(I)Ljava/lang/Object;", "insertIntoRoot", "shift", "elementCarry", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;", "([Ljava/lang/Object;IILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "insertIntoTail", "tailIndex", "([Ljava/lang/Object;ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector;", "listIterator", "", "pullLastBuffer", "tailCarry", "([Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "pullLastBufferFromRoot", "rootSize", "([Ljava/lang/Object;II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "pushFilledTail", "filledTail", "newTail", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector;", "pushTail", "([Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "removeAll", "predicate", "Lkotlin/Function1;", "", "removeAt", "removeFromRootAt", "removeFromTailAt", "([Ljava/lang/Object;III)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "set", "setInRoot", "e", "([Ljava/lang/Object;IILjava/lang/Object;)[Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PersistentVector<E> extends AbstractPersistentList<E> implements PersistentList<E> {
    public static final int $stable = 0;
    private final Object[] root;
    private final int rootShift;
    private final int size;
    private final Object[] tail;

    static {
        $stable = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ PersistentCollection add(Object r2) {
        return add(r2);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ PersistentCollection.Builder builder() {
        return builder();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ PersistentList.Builder builder() {
        return builder();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ PersistentCollection removeAll(Function1 predicate) {
        return removeAll(predicate);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.size;
    }

    public PersistentVector(Object[] root, Object[] tail, int size, int rootShift) {
        this.root = root;
        this.tail = tail;
        this.size = size;
        this.rootShift = rootShift;
        boolean r1 = true;
        if (size() <= 32) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L10;
        PreconditionsKt.throwIllegalArgumentException("Trie-based persistent vector should have at least 33 elements, got " + size());
    L10:
        if ((size() - UtilsKt.rootSize(size())) <= RangesKt.coerceAtMost(this.tail.length, 32)) goto L13;
        r1 = false;
    L13:
        CommonFunctionsKt.m3921assert(r1);
        return;
    L5:
        value$iv = false;
        goto L7
    }

    private final int rootSize() {
        return UtilsKt.rootSize(size());
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> add(E r7) {
        int tailSize = size() - rootSize();
        if (tailSize >= 32) goto L6;
        Object[] newTail = Arrays.copyOf(this.tail, 32);
        Intrinsics.checkNotNullExpressionValue(newTail, "copyOf(...)");
        newTail[tailSize] = r7;
        return new PersistentVector(this.root, newTail, size() + 1, this.rootShift);
    L6:
        Object[] newTail2 = UtilsKt.presizedBufferWith(r7);
        return pushFilledTail(this.root, this.tail, newTail2);
    }

    private final PersistentVector<E> pushFilledTail(Object[] root, Object[] filledTail, Object[] newTail) {
        if ((size() >> 5) <= (1 << this.rootShift)) goto L6;
        Object[] newRoot = UtilsKt.presizedBufferWith(root);
        int newRootShift = this.rootShift + 5;
        return new PersistentVector(pushTail(newRoot, newRootShift, filledTail), newTail, size() + 1, newRootShift);
    L6:
        Object[] newRoot2 = pushTail(root, this.rootShift, filledTail);
        return new PersistentVector(newRoot2, newTail, size() + 1, this.rootShift);
    }

    private final Object[] pushTail(Object[] root, int shift, Object[] tail) {
        int bufferIndex = UtilsKt.indexSegment(size() - 1, shift);
        if (root == null) goto L6;
        Object[] newRootNode = Arrays.copyOf(root, 32);
        Intrinsics.checkNotNullExpressionValue(newRootNode, "copyOf(...)");
        if (newRootNode == null) goto L6;
    L8:
        if (shift != 5) goto L10;
        newRootNode[bufferIndex] = tail;
    L11:
        return newRootNode;
    L10:
        newRootNode[bufferIndex] = pushTail((Object[]) newRootNode[bufferIndex], shift - 5, tail);
    L6:
        newRootNode = new Object[32];
        goto L8
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> add(int index, E r11) {
        ListImplementation.checkPositionIndex$runtime_release(index, size());
        if (index == size()) goto L5;
        int rootSize = rootSize();
        if (index >= rootSize) goto L9;
        ObjectRef elementCarry = new ObjectRef(null);
        Object[] newRoot = insertIntoRoot(this.root, this.rootShift, index, r11, elementCarry);
        return insertIntoTail(newRoot, 0, elementCarry.getValue());
    L9:
        return insertIntoTail(this.root, index - rootSize, r11);
    L5:
        return add(r11);
    }

    private final PersistentVector<E> insertIntoTail(Object[] root, int tailIndex, Object element) {
        int tailSize = size() - rootSize();
        Object[] newTail = Arrays.copyOf(this.tail, 32);
        Intrinsics.checkNotNullExpressionValue(newTail, "copyOf(...)");
        Object[] r3 = this.tail;
        if (tailSize >= 32) goto L6;
        ArraysKt.copyInto(r3, newTail, tailIndex + 1, tailIndex, tailSize);
        newTail[tailIndex] = element;
        return new PersistentVector(root, newTail, size() + 1, this.rootShift);
    L6:
        Object lastElement = r3[31];
        ArraysKt.copyInto(this.tail, newTail, tailIndex + 1, tailIndex, tailSize - 1);
        newTail[tailIndex] = element;
        return pushFilledTail(root, newTail, UtilsKt.presizedBufferWith(lastElement));
    }

    private final Object[] insertIntoRoot(Object[] root, int shift, int index, Object element, ObjectRef elementCarry) {
        int bufferIndex = UtilsKt.indexSegment(index, shift);
        if (shift != 0) goto L9;
        if (bufferIndex != 0) goto L6;
        Object[] newRoot = new Object[32];
    L7:
        ArraysKt.copyInto(root, newRoot, bufferIndex + 1, bufferIndex, 31);
        elementCarry.setValue(root[31]);
        newRoot[bufferIndex] = element;
        return newRoot;
    L6:
        Object[] r3 = Arrays.copyOf(root, 32);
        Intrinsics.checkNotNullExpressionValue(r3, "copyOf(...)");
        newRoot = r3;
        goto L7
    L9:
        Object[] newRoot2 = Arrays.copyOf(root, 32);
        Intrinsics.checkNotNullExpressionValue(newRoot2, "copyOf(...)");
        int lowerLevelShift = shift - 5;
        Object r2 = root[bufferIndex];
        String r10 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        newRoot2[bufferIndex] = insertIntoRoot((Object[]) r2, lowerLevelShift, index, element, elementCarry);
        int i = bufferIndex + 1;
    L10:
        if (i >= 32) goto L14;
        if (newRoot2[i] == null) goto L14;
        Object r4 = root[i];
        Intrinsics.checkNotNull(r4, r10);
        newRoot2[i] = insertIntoRoot((Object[]) r4, lowerLevelShift, 0, elementCarry.getValue(), elementCarry);
        i = i + 1;
        r10 = r10;
    L14:
        return newRoot2;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> removeAt(int index) {
        ListImplementation.checkElementIndex$runtime_release(index, size());
        int rootSize = rootSize();
        Object[] r1 = this.root;
        if (index >= rootSize) goto L5;
        Object[] newRoot = removeFromRootAt(r1, this.rootShift, index, new ObjectRef(this.tail[0]));
        return removeFromTailAt(newRoot, rootSize, this.rootShift, 0);
    L5:
        return removeFromTailAt(r1, rootSize, this.rootShift, index - rootSize);
    }

    private final PersistentList<E> removeFromTailAt(Object[] root, int rootSize, int shift, int index) {
        int tailSize = size() - rootSize;
        if (index >= tailSize) goto L5;
        boolean r2 = true;
    L6:
        CommonFunctionsKt.m3921assert(r2);
        if (tailSize == 1) goto L9;
        Object[] newTail = Arrays.copyOf(this.tail, 32);
        Intrinsics.checkNotNullExpressionValue(newTail, "copyOf(...)");
        if (index >= (tailSize - 1)) goto L13;
        ArraysKt.copyInto(this.tail, newTail, index, index + 1, tailSize);
    L13:
        newTail[tailSize - 1] = null;
        return new PersistentVector(root, newTail, (rootSize + tailSize) - 1, shift);
    L9:
        return pullLastBufferFromRoot(root, rootSize, shift);
    L5:
        r2 = false;
        goto L6
    }

    private final PersistentList<E> pullLastBufferFromRoot(Object[] root, int rootSize, int shift) {
        if (shift == 0) goto L4;
        ObjectRef tailCarry = new ObjectRef(null);
        Object[] newRoot = pullLastBuffer(root, shift, rootSize - 1, tailCarry);
        Intrinsics.checkNotNull(newRoot);
        Object r2 = tailCarry.getValue();
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] newTail = (Object[]) r2;
        if (newRoot[1] != null) goto L14;
        Object r4 = newRoot[0];
        Intrinsics.checkNotNull(r4, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] lowerLevelRoot = (Object[]) r4;
        return new PersistentVector(lowerLevelRoot, newTail, rootSize, shift - 5);
    L14:
        return new PersistentVector(newRoot, newTail, rootSize, shift);
    L4:
        if (root.length != 33) goto L6;
        Object[] buffer = Arrays.copyOf(root, 32);
        Intrinsics.checkNotNullExpressionValue(buffer, "copyOf(...)");
    L8:
        return new SmallPersistentVector(buffer);
    L6:
        buffer = root;
        goto L8
    }

    private final Object[] pullLastBuffer(Object[] root, int shift, int index, ObjectRef tailCarry) {
        int bufferIndex = UtilsKt.indexSegment(index, shift);
        if (shift != 5) goto L5;
        tailCarry.setValue(root[bufferIndex]);
        Object[] newBufferAtIndex = null;
    L7:
        if (newBufferAtIndex != null) goto L10;
        if (bufferIndex != 0) goto L10;
        return null;
    L10:
        Object[] newRoot = Arrays.copyOf(root, 32);
        Intrinsics.checkNotNullExpressionValue(newRoot, "copyOf(...)");
        newRoot[bufferIndex] = newBufferAtIndex;
        return newRoot;
    L5:
        Object r1 = root[bufferIndex];
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        newBufferAtIndex = pullLastBuffer((Object[]) r1, shift - 5, index, tailCarry);
        goto L7
    }

    private final Object[] removeFromRootAt(Object[] root, int shift, int index, ObjectRef tailCarry) {
        int bufferIndex = UtilsKt.indexSegment(index, shift);
        if (shift != 0) goto L9;
        if (bufferIndex != 0) goto L6;
        Object[] newRoot = new Object[32];
    L7:
        ArraysKt.copyInto(root, newRoot, bufferIndex, bufferIndex + 1, 32);
        newRoot[31] = tailCarry.getValue();
        tailCarry.setValue(root[bufferIndex]);
        return newRoot;
    L6:
        Object[] r3 = Arrays.copyOf(root, 32);
        Intrinsics.checkNotNullExpressionValue(r3, "copyOf(...)");
        newRoot = r3;
        goto L7
    L9:
        int bufferLastIndex = 31;
        if (root[31] != null) goto L12;
        bufferLastIndex = UtilsKt.indexSegment(rootSize() - 1, shift);
    L12:
        Object[] newRoot2 = Arrays.copyOf(root, 32);
        Intrinsics.checkNotNullExpressionValue(newRoot2, "copyOf(...)");
        int lowerLevelShift = shift - 5;
        int i = bufferLastIndex;
        int r5 = bufferIndex + 1;
        if (r5 > i) goto L17;
    L14:
        Object r7 = newRoot2[i];
        Intrinsics.checkNotNull(r7, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        newRoot2[i] = removeFromRootAt((Object[]) r7, lowerLevelShift, 0, tailCarry);
        if (i == r5) goto L17;
        i = i - 1;
    L17:
        Object r4 = newRoot2[bufferIndex];
        Intrinsics.checkNotNull(r4, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        newRoot2[bufferIndex] = removeFromRootAt((Object[]) r4, lowerLevelShift, index, tailCarry);
        return newRoot2;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> removeAll(Function1<? super E, Boolean> r4) {
        PersistentVectorBuilder<E> r0 = builder();
        r0.removeAllWithPredicate(r4);
        return r0.build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentVectorBuilder<E> builder() {
        return new PersistentVectorBuilder(this, this.root, this.tail, this.rootShift);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public ListIterator<E> listIterator(int index) {
        ListImplementation.checkPositionIndex$runtime_release(index, size());
        return new PersistentVectorIterator(this.root, this.tail, index, size(), (this.rootShift / 5) + 1);
    }

    private final Object[] bufferFor(int index) {
        if (rootSize() <= index) goto L5;
        Object[] buffer = this.root;
        int shift = this.rootShift;
    L7:
        if (shift <= 0) goto L9;
        Object r2 = buffer[UtilsKt.indexSegment(index, shift)];
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        buffer = (Object[]) r2;
        shift = shift - 5;
        goto L7
    L9:
        return buffer;
    L5:
        return this.tail;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public E get(int r3) {
        ListImplementation.checkElementIndex$runtime_release(r3, size());
        return (E) bufferFor(r3)[r3 & 31];
    }

    @Override // kotlin.collections.AbstractList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> set(int index, E r7) {
        ListImplementation.checkElementIndex$runtime_release(index, size());
        if (rootSize() > index) goto L6;
        Object[] newTail = Arrays.copyOf(this.tail, 32);
        Intrinsics.checkNotNullExpressionValue(newTail, "copyOf(...)");
        newTail[index & 31] = r7;
        return new PersistentVector(this.root, newTail, size(), this.rootShift);
    L6:
        Object[] newRoot = setInRoot(this.root, this.rootShift, index, r7);
        return new PersistentVector(newRoot, this.tail, size(), this.rootShift);
    }

    private final Object[] setInRoot(Object[] root, int shift, int index, Object e) {
        int bufferIndex = UtilsKt.indexSegment(index, shift);
        Object[] newRoot = Arrays.copyOf(root, 32);
        Intrinsics.checkNotNullExpressionValue(newRoot, "copyOf(...)");
        if (shift != 0) goto L5;
        newRoot[bufferIndex] = e;
    L6:
        return newRoot;
    L5:
        Object r2 = newRoot[bufferIndex];
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        newRoot[bufferIndex] = setInRoot((Object[]) r2, shift - 5, index, e);
        goto L6
    }
}
