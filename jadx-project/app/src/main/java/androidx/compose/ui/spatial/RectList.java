package androidx.compose.ui.spatial;

import androidx.autofill.HintConstants;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: RectList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\t\u0010\u000b\u001a\u00020\u0006H\u0082\bJ\u0006\u0010\f\u001a\u00020\rJ\u0011\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0086\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\rJÇ\u0001\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u008b\u0001\u0010\u001b\u001a\u0086\u0001\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\r0\u001cH\u0086\bJ1\u0010!\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0086\bJ=\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u00062*\u0010\u001b\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0$H\u0086\bJ-\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0(H\u0086\bJ=\u0010%\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0(H\u0086\bJ5\u0010)\u001a\u00020\r2*\u0010\u001b\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0$H\u0086\bJ)\u0010*\u001a\u00020\r2\u001e\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\r0+H\u0086\bJ\u000e\u0010-\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006JL\u0010.\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010/\u001a\u00020\u00062\b\b\u0002\u00100\u001a\u00020\u000f2\b\b\u0002\u00101\u001a\u00020\u000fJ\u000e\u00102\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0006J\u000e\u00103\u001a\u00020,2\u0006\u0010\u0010\u001a\u00020\u0006J.\u00104\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006J5\u00105\u001a\u0002062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0000¢\u0006\u0002\b7J\u000e\u00108\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006J \u00109\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u0004H\u0002J.\u0010=\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006J\u001e\u0010>\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u0006J \u0010>\u001a\u00020\r2\u0006\u0010A\u001a\u00020,2\u0006\u0010?\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u0006H\u0002J4\u0010B\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062$\u0010\u001b\u001a \u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0CR\u0012\u0010\u0003\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"Landroidx/compose/ui/spatial/RectList;", "", "()V", "items", "", "itemsSize", "", "size", "getSize", "()I", "stack", "allocateItemsIndex", "clearUpdated", "", "contains", "", "value", "debugString", "", "defragment", "findKNearestNeighbors", "searchAxis", "k", "l", "t", "r", "b", "block", "Lkotlin/Function6;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "score", "id", "findNearestNeighbor", "forEachIntersectingRectWithValueAt", "index", "Lkotlin/Function5;", "forEachIntersection", "x", "y", "Lkotlin/Function1;", "forEachRect", "forEachUpdatedRect", "Lkotlin/Function3;", "", "indexOf", "insert", "parentId", "focusable", "gesturable", "markUpdated", "metaFor", "move", "neighborsScoredByDistance", "", "neighborsScoredByDistance$ui_release", "remove", "resizeStorage", "actualSize", "currentSize", "currentItems", "update", "updateSubhierarchy", "deltaX", "deltaY", "stackMeta", "withRect", "Lkotlin/Function4;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RectList {
    public static final int $stable = 0;
    public long[] items;
    public int itemsSize;
    public long[] stack;

    static {
        $stable = 8;
    }

    public RectList() {
        this.items = new long[192];
        this.stack = new long[192];
    }

    public final int getSize() {
        return this.itemsSize / 3;
    }

    private final int allocateItemsIndex() {
        long[] currentItems = this.items;
        int currentSize = this.itemsSize;
        this.itemsSize = currentSize + 3;
        int actualSize = currentItems.length;
        if (actualSize > (currentSize + 3)) goto L5;
        resizeStorage(actualSize, currentSize, currentItems);
    L5:
        return currentSize;
    }

    private final void resizeStorage(int actualSize, int currentSize, long[] currentItems) {
        int newSize = Math.max(actualSize * 2, currentSize + 3);
        long[] r1 = Arrays.copyOf(currentItems, newSize);
        Intrinsics.checkNotNullExpressionValue(r1, "copyOf(...)");
        this.items = r1;
        long[] r2 = Arrays.copyOf(this.stack, newSize);
        Intrinsics.checkNotNullExpressionValue(r2, "copyOf(...)");
        this.stack = r2;
    }

    public static /* synthetic */ void insert$default(RectList r11, int r12, int r13, int r14, int r15, int r16, int r17, boolean r18, boolean r19, int r20, Object r21) {
        if ((r20 & 32) == 0) goto L5;
        int r8 = -1;
    L7:
        if ((r20 & 64) == 0) goto L9;
        boolean r9 = false;
    L11:
        if ((r20 & 128) == 0) goto L13;
        boolean r10 = false;
    L14:
        r11.insert(r12, r13, r14, r15, r16, r8, r9, r10);
        return;
    L13:
        r10 = r19;
        goto L14
    L9:
        r9 = r18;
        goto L11
    L5:
        r8 = r17;
        goto L7
    }

    public final void insert(int value, int l, int t, int r, int b, int parentId, boolean focusable, boolean gesturable) {
        int value2 = value & RectListKt.Lower26Bits;
        long[] currentItems$iv = this.items;
        int currentSize$iv = this.itemsSize;
        this.itemsSize = currentSize$iv + 3;
        int actualSize$iv = currentItems$iv.length;
        if (actualSize$iv > (currentSize$iv + 3)) goto L5;
        resizeStorage(actualSize$iv, currentSize$iv, currentItems$iv);
    L5:
        long[] items = this.items;
        items[currentSize$iv + 0] = (((long) l) << 32) | (((long) t) & 4294967295L);
        items[currentSize$iv + 1] = (((long) b) & 4294967295L) | (((long) r) << 32);
        int r0 = currentSize$iv + 2;
        int r1 = 0;
        int r6 = 1;
        if (gesturable == false) goto L8;
        r1 = 1;
    L8:
        long r14 = ((long) r1) << 63;
        if (focusable == true) goto L12;
        r6 = 0;
    L12:
        items[r0] = (((((long) (0 & 511)) << 52) | ((r14 | (((long) r6) << 62)) | LockFreeTaskQueueCore.CLOSED_MASK)) | (((long) (parentId & RectListKt.Lower26Bits)) << 26)) | (((long) (value2 & RectListKt.Lower26Bits)) << 0);
        if (parentId >= 0) goto L15;
        return;
    L15:
        int parentId2 = parentId & RectListKt.Lower26Bits;
        int i = currentSize$iv - 3;
    L16:
        if (i < 0) goto L22;
        long meta = items[i + 2];
        int $i$f$unpackMetaValue = ((int) meta) & RectListKt.Lower26Bits;
        if ($i$f$unpackMetaValue == parentId2) goto L19;
        i = i - 3;
        goto L16
    L19:
        int lastChildOffset = currentSize$iv - i;
        items[i + 2] = (meta & RectListKt.EverythingButLastChildOffset) | (((long) (lastChildOffset & 511)) << 52);
        return;
    }

    public final boolean remove(int value) {
        int value2 = value & RectListKt.Lower26Bits;
        long[] items = this.items;
        int size = this.itemsSize;
        int i = 0;
    L4:
        if (i >= (items.length - 2)) goto L11;
        if (i >= size) goto L16;
        long meta = items[i + 2];
        int $i$f$unpackMetaValue = ((int) meta) & RectListKt.Lower26Bits;
        if ($i$f$unpackMetaValue == value2) goto L8;
        i = i + 3;
        goto L4
    L8:
        items[i + 0] = -1;
        items[i + 1] = -1;
        items[i + 2] = 2305843009213693951L;
        return true;
    L16:
        return false;
    L11:
        return false;
    }

    public final boolean update(int value, int l, int t, int r, int b) {
        int value2 = value & RectListKt.Lower26Bits;
        long[] items = this.items;
        int size = this.itemsSize;
        int i = 0;
    L4:
        if (i >= (items.length - 2)) goto L13;
        if (i >= size) goto L18;
        long meta = items[i + 2];
        int $i$f$unpackMetaValue = ((int) meta) & RectListKt.Lower26Bits;
        if ($i$f$unpackMetaValue == value2) goto L8;
        i = i + 3;
        goto L4
    L8:
        items[i + 0] = (((long) l) << 32) | (((long) t) & 4294967295L);
        items[i + 1] = (((long) b) & 4294967295L) | (((long) r) << 32);
        items[i + 2] = LockFreeTaskQueueCore.CLOSED_MASK | meta;
        return true;
    L18:
        return false;
    L13:
        return false;
    }

    public final boolean move(int value, int l, int t, int r, int b) {
        int value2 = value & RectListKt.Lower26Bits;
        long[] items = this.items;
        int size = this.itemsSize;
        int i = 0;
    L4:
        if (i >= (items.length - 2)) goto L22;
        if (i >= size) goto L26;
        long meta = items[i + 2];
        int $i$f$unpackMetaValue = ((int) meta) & RectListKt.Lower26Bits;
        if ($i$f$unpackMetaValue == value2) goto L8;
        i = i + 3;
        goto L4
    L8:
        long prevLT = items[i + 0];
        items[i + 0] = (((long) l) << 32) | (((long) t) & 4294967295L);
        items[i + 1] = (((long) b) & 4294967295L) | (((long) r) << 32);
        items[i + 2] = meta | LockFreeTaskQueueCore.CLOSED_MASK;
        int $i$f$unpackX = (int) (prevLT >> 32);
        int deltaX = l - $i$f$unpackX;
        int $i$f$unpackY = (int) prevLT;
        int deltaY = t - $i$f$unpackY;
        if (deltaX == 0) goto L11;
        boolean r4 = true;
    L12:
        if (deltaY == 0) goto L14;
        boolean r9 = true;
    L16:
        if ((r4 | r9) == false) goto L18;
        int parentId$iv = i + 3;
        updateSubhierarchy((meta & RectListKt.EverythingButParentId) | (((long) (parentId$iv & RectListKt.Lower26Bits)) << 26), deltaX, deltaY);
    L18:
        return true;
    L14:
        r9 = false;
        goto L16
    L11:
        r4 = false;
        goto L12
    L26:
        return false;
    L22:
        return false;
    }

    public final void updateSubhierarchy(int id, int deltaX, int deltaY) {
        int lastChildOffset$iv = this.itemsSize;
        updateSubhierarchy((((((long) (lastChildOffset$iv & 511)) << 52) | 0) | (((long) (0 & RectListKt.Lower26Bits)) << 26)) | (((long) (67108863 & id)) << 0), deltaX, deltaY);
    }

    private final void updateSubhierarchy(long stackMeta, int deltaX, int deltaY) {
        long[] items = this.items;
        long[] stack = this.stack;
        int size = getSize();
        stack[0] = stackMeta;
        int stackSize = 1;
    L3:
        if (stackSize <= 0) goto L24;
        stackSize = stackSize - 1;
        long idAndStartAndOffset = stack[stackSize];
        int r9 = RectListKt.Lower26Bits;
        int $i$f$unpackMetaValue = ((int) idAndStartAndOffset) & RectListKt.Lower26Bits;
        char r10 = 26;
        int i = ((int) (idAndStartAndOffset >> 26)) & RectListKt.Lower26Bits;
        char r12 = '4';
        int $i$f$unpackMetaLastChildOffset = ((int) (idAndStartAndOffset >> 52)) & 511;
        if ($i$f$unpackMetaLastChildOffset != 511) goto L7;
        int endIndex = size;
    L8:
        if (i < 0) goto L32;
    L10:
        if (i >= (items.length - 2)) goto L21;
        if (i >= endIndex) goto L21;
        long meta = items[i + 2];
        int r18 = r9;
        char r19 = r10;
        if ((((int) (meta >> r19)) & r18) != $i$f$unpackMetaValue) goto L17;
        long topLeft = items[i + 0];
        char r20 = r12;
        int endIndex2 = endIndex;
        long bottomRight = items[i + 1];
        int x$iv = ((int) (topLeft >> 32)) + deltaX;
        int $i$f$unpackY = (int) topLeft;
        int y$iv = $i$f$unpackY + deltaY;
        long[] items2 = items;
        items2[i + 0] = (((long) x$iv) << 32) | (((long) y$iv) & 4294967295L);
        int $i$f$unpackX = (int) (bottomRight >> 32);
        int x$iv2 = $i$f$unpackX + deltaX;
        int $i$f$unpackY2 = (int) bottomRight;
        int y$iv2 = $i$f$unpackY2 + deltaY;
        long[] stack2 = stack;
        int size2 = size;
        items2[i + 1] = (((long) y$iv2) & 4294967295L) | (((long) x$iv2) << 32);
        items2[i + 2] = meta | LockFreeTaskQueueCore.CLOSED_MASK;
        if ((((int) (meta >> r20)) & 511) <= 0) goto L18;
        int parentId$iv = i + 3;
        stack2[stackSize] = (((long) (parentId$iv & r18)) << r19) | (meta & RectListKt.EverythingButParentId);
        stackSize = stackSize + 1;
    L18:
        i = i + 3;
        stack = stack2;
        size = size2;
        r9 = r18;
        r10 = r19;
        r12 = r20;
        endIndex = endIndex2;
        items = items2;
        goto L10
    L17:
        items2 = items;
        size2 = size;
        r20 = r12;
        endIndex2 = endIndex;
        stack2 = stack;
    L21:
        stack = stack;
        size = size;
        items = items;
        goto L3
    L32:
        return;
    L7:
        endIndex = $i$f$unpackMetaLastChildOffset + i;
        goto L8
    }

    public final void markUpdated(int value) {
        int value2 = value & RectListKt.Lower26Bits;
        long[] items = this.items;
        int size = this.itemsSize;
        int i = 0;
    L4:
        if (i >= (items.length - 2)) goto L11;
        if (i >= size) goto L15;
        long meta = items[i + 2];
        int $i$f$unpackMetaValue = ((int) meta) & RectListKt.Lower26Bits;
        if ($i$f$unpackMetaValue == value2) goto L8;
        i = i + 3;
        goto L4
    L8:
        items[i + 2] = meta | LockFreeTaskQueueCore.CLOSED_MASK;
        return;
    L15:
        return;
    }

    public final boolean withRect(int value, Function4<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> r19) {
        int value2 = value & RectListKt.Lower26Bits;
        long[] items = this.items;
        int size = this.itemsSize;
        int i = 0;
    L4:
        if (i >= (items.length - 2)) goto L13;
        if (i >= size) goto L18;
        long meta = items[i + 2];
        int $i$f$unpackMetaValue = ((int) meta) & RectListKt.Lower26Bits;
        if ($i$f$unpackMetaValue == value2) goto L8;
        i = i + 3;
        goto L4
    L8:
        long topLeft = items[i + 0];
        long bottomRight = items[i + 1];
        int $i$f$unpackX = (int) (topLeft >> 32);
        int $i$f$unpackY = (int) topLeft;
        int $i$f$unpackY2 = (int) bottomRight;
        r19.invoke(Integer.valueOf($i$f$unpackX), Integer.valueOf($i$f$unpackY), Integer.valueOf((int) (bottomRight >> 32)), Integer.valueOf($i$f$unpackY2));
        return true;
    L18:
        return false;
    L13:
        return false;
    }

    public final boolean contains(int value) {
        int value2 = value & RectListKt.Lower26Bits;
        long[] items = this.items;
        int size = this.itemsSize;
        int i = 0;
    L4:
        if (i >= (items.length - 2)) goto L11;
        if (i >= size) goto L16;
        long meta = items[i + 2];
        int $i$f$unpackMetaValue = ((int) meta) & RectListKt.Lower26Bits;
        if ($i$f$unpackMetaValue == value2) goto L8;
        i = i + 3;
        goto L4
    L8:
        return true;
    L16:
        return false;
    L11:
        return false;
    }

    public final int indexOf(int value) {
        int value2 = value & RectListKt.Lower26Bits;
        long[] items = this.items;
        int size = this.itemsSize;
        int i = 0;
    L4:
        if (i >= (items.length - 2)) goto L10;
        if (i >= size) goto L15;
        long meta = items[i + 2];
        int $i$f$unpackMetaValue = ((int) meta) & RectListKt.Lower26Bits;
        if ($i$f$unpackMetaValue == value2) goto L8;
        i = i + 3;
        goto L4
    L8:
        return i;
    L15:
        return -1;
    L10:
        return -1;
    }

    public final long metaFor(int value) {
        int value2 = value & RectListKt.Lower26Bits;
        long[] items = this.items;
        int size = this.itemsSize;
        int i = 0;
    L4:
        if (i >= (items.length - 2)) goto L10;
        if (i >= size) goto L15;
        long meta = items[i + 2];
        int $i$f$unpackMetaValue = ((int) meta) & RectListKt.Lower26Bits;
        if ($i$f$unpackMetaValue == value2) goto L8;
        i = i + 3;
        goto L4
    L8:
        return meta;
    L15:
        return RectListKt.TombStone;
    L10:
        return RectListKt.TombStone;
    }

    public final void forEachIntersection(int l, int t, int r, int b, Function1<? super Integer, Unit> r29) {
        int $i$f$forEachIntersection = 0;
        long destTopLeft = (((long) l) << 32) | (((long) t) & 4294967295L);
        long destTopRight = (((long) b) & 4294967295L) | (((long) r) << 32);
        long[] items = this.items;
        int size = this.itemsSize;
        int i = 0;
    L4:
        if (i >= (items.length - 2)) goto L16;
        if (i >= size) goto L21;
        long topLeft = items[i + 0];
        long bottomRight = items[i + 1];
        long a$iv = ((destTopRight - topLeft) - InlineClassHelperKt.Uint64Low32) | ((bottomRight - destTopLeft) - InlineClassHelperKt.Uint64Low32);
        if ((a$iv & (-9223372034707292160L)) != 0) goto L9;
        boolean r20 = true;
    L10:
        if (r20 == false) goto L13;
        long meta$iv = items[i + 2];
        r29.invoke(Integer.valueOf(((int) meta$iv) & RectListKt.Lower26Bits));
    L13:
        i = i + 3;
        $i$f$forEachIntersection = $i$f$forEachIntersection;
        items = items;
        goto L4
    L9:
        r20 = false;
        goto L10
    L21:
        return;
    }

    public final void forEachRect(Function5<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> r20) {
        int $i$f$forEachRect = 0;
        long[] items = this.items;
        int size = this.itemsSize;
        int i = 0;
    L4:
        if (i >= (items.length - 2)) goto L9;
        if (i >= size) goto L12;
        long topLeft = items[i + 0];
        long bottomRight = items[i + 1];
        long meta = items[i + 2];
        int $i$f$unpackMetaValue = ((int) meta) & RectListKt.Lower26Bits;
        Integer r13 = Integer.valueOf($i$f$unpackMetaValue);
        int $i$f$unpackX = (int) (topLeft >> 32);
        Integer r14 = Integer.valueOf($i$f$unpackX);
        int $i$f$unpackY = (int) topLeft;
        int $i$f$unpackY2 = (int) bottomRight;
        r20.invoke(r13, r14, Integer.valueOf($i$f$unpackY), Integer.valueOf((int) (bottomRight >> 32)), Integer.valueOf($i$f$unpackY2));
        i = i + 3;
        $i$f$forEachRect = $i$f$forEachRect;
        goto L4
    L12:
        return;
    }

    public final void forEachIntersection(int x, int y, Function1<? super Integer, Unit> r23) {
        long destXY = (((long) x) << 32) | (((long) y) & 4294967295L);
        long[] items = this.items;
        int size = this.itemsSize;
        int i = 0;
    L4:
        if (i >= (items.length - 2)) goto L16;
        if (i >= size) goto L21;
        long topLeft = items[i + 0];
        long bottomRight = items[i + 1];
        long a$iv = ((destXY - topLeft) - InlineClassHelperKt.Uint64Low32) | ((bottomRight - destXY) - InlineClassHelperKt.Uint64Low32);
        if ((a$iv & (-9223372034707292160L)) != 0) goto L9;
        boolean r16 = true;
    L10:
        if (r16 == false) goto L13;
        long meta = items[i + 2];
        r23.invoke(Integer.valueOf(((int) meta) & RectListKt.Lower26Bits));
    L13:
        i = i + 3;
        goto L4
    L9:
        r16 = false;
        goto L10
    L21:
        return;
    }

    public final void forEachIntersectingRectWithValueAt(int index, Function5<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> r24) {
        int r1 = index;
        long[] items = this.items;
        int size = this.itemsSize;
        long destTopLeft = items[r1];
        long destBottomRight = items[r1 + 1];
        int i = 0;
    L4:
        if (i >= (items.length - 2)) goto L15;
        if (i >= size) goto L23;
        if (i == r1) goto L7;
        long topLeft = items[i + 0];
        long bottomRight = items[i + 1];
        long a$iv = ((destBottomRight - topLeft) - InlineClassHelperKt.Uint64Low32) | ((bottomRight - destTopLeft) - InlineClassHelperKt.Uint64Low32);
        if ((a$iv & (-9223372034707292160L)) != 0) goto L11;
        boolean r17 = true;
    L12:
        if (r17 == false) goto L14;
        Integer r18 = Integer.valueOf((int) (topLeft >> 32));
        int $i$f$unpackY = (int) topLeft;
        Integer r19 = Integer.valueOf($i$f$unpackY);
        int $i$f$unpackX = (int) (bottomRight >> 32);
        Integer r110 = Integer.valueOf($i$f$unpackX);
        int $i$f$unpackY2 = (int) bottomRight;
        Integer r20 = Integer.valueOf($i$f$unpackY2);
        long meta$iv = items[i + 2];
        r24.invoke(r18, r19, r110, r20, Integer.valueOf(((int) meta$iv) & RectListKt.Lower26Bits));
    L14:
        i = i + 3;
        r1 = index;
        goto L4
    L11:
        r17 = false;
        goto L12
    L7:
        i = i + 3;
        goto L4
    L23:
        return;
    }

    public final int[] neighborsScoredByDistance$ui_release(int searchAxis, int l, int t, int r, int b) {
        long[] items = this.items;
        int size = this.itemsSize / 3;
        int i = 0;
        int[] results = new int[size];
    L4:
        if (i >= results.length) goto L11;
        int itemsIndex = i * 3;
        if (itemsIndex < 0) goto L11;
        if (itemsIndex >= (items.length - 1)) goto L11;
        long topLeft = items[itemsIndex + 0];
        long bottomRight = items[itemsIndex + 1];
        int $i$f$unpackX = (int) (topLeft >> 32);
        int $i$f$unpackY = (int) topLeft;
        int $i$f$unpackY2 = (int) bottomRight;
        int score = RectListKt.distanceScore(searchAxis, l, t, r, b, $i$f$unpackX, $i$f$unpackY, (int) (bottomRight >> 32), $i$f$unpackY2);
        results[i] = score;
        i = i + 1;
    L11:
        return results;
    }

    public final void findKNearestNeighbors(int searchAxis, int k, int l, int t, int r, int b, Function6<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> r35) {
        int $i$f$findKNearestNeighbors = 0;
        int[] list = neighborsScoredByDistance$ui_release(searchAxis, l, t, r, b);
        long[] items = this.items;
        int sent = 0;
        int min = 1;
        int nextMin = Integer.MAX_VALUE;
        int loops = 0;
        int i = 0;
    L3:
        if (loops > k) goto L16;
    L5:
        if (i >= list.length) goto L15;
        int score = list[i];
        if (score <= min) goto L9;
        nextMin = Math.min(nextMin, score);
    L9:
        if (score != min) goto L14;
        int itemIndex = i * 3;
        long topLeft = items[itemIndex + 0];
        long bottomRight = items[itemIndex + 1];
        long meta = items[itemIndex + 2];
        Integer r19 = Integer.valueOf(score);
        Integer r20 = Integer.valueOf(((int) meta) & RectListKt.Lower26Bits);
        long meta2 = topLeft >> 32;
        Integer r21 = Integer.valueOf((int) meta2);
        int $i$f$unpackY = (int) topLeft;
        Integer r22 = Integer.valueOf($i$f$unpackY);
        int $i$f$unpackX = (int) (bottomRight >> 32);
        Integer r23 = Integer.valueOf($i$f$unpackX);
        int $i$f$unpackY2 = (int) bottomRight;
        r35.invoke(r19, r20, r21, r22, r23, Integer.valueOf($i$f$unpackY2));
        sent = sent + 1;
        if (sent != k) goto L14;
        return;
    L14:
        i = i + 1;
        $i$f$findKNearestNeighbors = $i$f$findKNearestNeighbors;
        items = items;
        goto L5
    L15:
        min = nextMin;
        nextMin = Integer.MAX_VALUE;
        loops = loops + 1;
        i = 0;
        goto L3
    }

    public final int findNearestNeighbor(int searchAxis, int l, int t, int r, int b) {
        int $i$f$findNearestNeighbor = 0;
        long[] items = this.items;
        int size = this.itemsSize;
        int minScore = Integer.MAX_VALUE;
        int minIndex = -1;
        int i = 0;
    L4:
        if (i >= (items.length - 2)) goto L23;
        if (i >= size) goto L23;
        long topLeft = items[i + 0];
        long bottomRight = items[i + 1];
        int $i$f$unpackX = (int) (topLeft >> 32);
        int $i$f$unpackY = (int) topLeft;
        int $i$f$findNearestNeighbor2 = $i$f$findNearestNeighbor;
        int $i$f$unpackY2 = (int) bottomRight;
        int score = RectListKt.distanceScore(searchAxis, l, t, r, b, $i$f$unpackX, $i$f$unpackY, (int) (bottomRight >> 32), $i$f$unpackY2);
        boolean r1 = false;
        if (score <= 0) goto L9;
        boolean r12 = true;
    L10:
        if (score >= minScore) goto L12;
        r1 = true;
    L12:
        boolean isNewMin = r1 & r12;
        if (isNewMin == false) goto L15;
        int r11 = score;
    L16:
        minScore = r11;
        if (isNewMin == false) goto L19;
        int r13 = i + 1;
    L20:
        minIndex = r13;
        i = i + 3;
        $i$f$findNearestNeighbor = $i$f$findNearestNeighbor2;
        goto L4
    L19:
        r13 = minIndex;
        goto L20
    L15:
        r11 = minScore;
        goto L16
    L9:
        r12 = false;
    L23:
        if (minIndex >= 0) goto L25;
    L28:
        return -1;
    L25:
        if (minIndex >= items.length) goto L28;
        long meta$iv = items[minIndex];
        return ((int) meta$iv) & RectListKt.Lower26Bits;
    }

    public final void defragment() {
        long[] from = this.items;
        int size = this.itemsSize;
        long[] to = this.stack;
        int i = 0;
        int j = 0;
    L4:
        if (i >= (from.length - 2)) goto L12;
        if (j >= (to.length - 2)) goto L12;
        if (i >= size) goto L12;
        if (from[i + 2] == RectListKt.TombStone) goto L11;
        to[j + 0] = from[i + 0];
        to[j + 1] = from[i + 1];
        to[j + 2] = from[i + 2];
        j = j + 3;
    L11:
        i = i + 3;
    L12:
        this.itemsSize = j;
        this.items = to;
        this.stack = from;
    }

    public final void clearUpdated() {
        long[] items = this.items;
        int size = this.itemsSize;
        int i = 0;
    L4:
        if (i >= (items.length - 2)) goto L7;
        if (i >= size) goto L10;
        long meta$iv = items[i + 2];
        items[i + 2] = meta$iv & (-2305843009213693953L);
        i = i + 3;
        goto L4
    L10:
        return;
    }

    public final void forEachUpdatedRect(Function3<? super Integer, ? super Long, ? super Long, Unit> r14) {
        long[] items = this.items;
        int size = this.itemsSize;
        int i = 0;
    L4:
        if (i >= (items.length - 2)) goto L10;
        if (i >= size) goto L15;
        long meta = items[i + 2];
        int $i$f$unpackMetaUpdated = ((int) (meta >> 61)) & 1;
        if ($i$f$unpackMetaUpdated == 0) goto L9;
        long topLeft = items[i + 0];
        long bottomRight = items[i + 1];
        int $i$f$unpackMetaValue = ((int) meta) & RectListKt.Lower26Bits;
        r14.invoke(Integer.valueOf($i$f$unpackMetaValue), Long.valueOf(topLeft), Long.valueOf(bottomRight));
    L9:
        i = i + 3;
        goto L4
    L15:
        return;
    }

    public final String debugString() {
        StringBuilder $this$debugString_u24lambda_u240 = new StringBuilder();
        int r3 = 0;
        long[] items = this.items;
        int size = this.itemsSize;
        int i = 0;
    L4:
        if (i >= (items.length - 2)) goto L9;
        if (i >= size) goto L9;
        long topLeft = items[i + 0];
        long bottomRight = items[i + 1];
        long meta = items[i + 2];
        int $i$f$unpackMetaValue = ((int) meta) & RectListKt.Lower26Bits;
        StringBuilder r17 = $this$debugString_u24lambda_u240;
        int parentId = ((int) (meta >> 26)) & RectListKt.Lower26Bits;
        int $i$f$unpackX = (int) (topLeft >> 32);
        int $i$f$unpackY = (int) topLeft;
        int r18 = r3;
        long[] items2 = items;
        int r = (int) (bottomRight >> 32);
        int $i$f$unpackY2 = (int) bottomRight;
        int size2 = size;
        StringBuilder r5 = $this$debugString_u24lambda_u240.append("id=" + $i$f$unpackMetaValue + ", rect=[" + $i$f$unpackX + ',' + $i$f$unpackY + ',' + r + ',' + $i$f$unpackY2 + "], parent=" + parentId);
        Intrinsics.checkNotNullExpressionValue(r5, "append(...)");
        Intrinsics.checkNotNullExpressionValue(r5.append('\n'), "append(...)");
        i = i + 3;
        size = size2;
        $this$debugString_u24lambda_u240 = r17;
        r3 = r18;
        items = items2;
    L9:
        String r0 = $this$debugString_u24lambda_u240.toString();
        Intrinsics.checkNotNullExpressionValue(r0, "toString(...)");
        return r0;
    }
}
