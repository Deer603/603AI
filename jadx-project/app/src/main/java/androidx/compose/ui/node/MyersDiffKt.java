package androidx.compose.ui.node;

import kotlin.Metadata;

/* JADX INFO: compiled from: MyersDiff.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0016\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001aZ\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a \u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0005H\u0002\u001a \u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a8\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0012H\u0000\u001aZ\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010\u0014\u001aR\u0010!\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\u001c\u0010$\u001a\u00020\u0001*\u00020\u00122\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\tH\u0002\u001a\r\u0010'\u001a\u00020\t*\u00020\u0007H\u0082\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"applyDiff", "", "diagonals", "Landroidx/compose/ui/node/IntStack;", "callback", "Landroidx/compose/ui/node/DiffCallback;", "backward", "", "oldStart", "", "oldEnd", "newStart", "newEnd", "cb", "forward", "Landroidx/compose/ui/node/CenteredArray;", "d", "snake", "", "backward-4l5_RBY", "(IIIILandroidx/compose/ui/node/DiffCallback;[I[II[I)Z", "calculateDiff", "oldSize", "newSize", "executeDiff", "fillSnake", "startX", "startY", "endX", "endY", "reverse", "data", "forward-4l5_RBY", "midPoint", "midPoint-q5eDKzI", "(IIIILandroidx/compose/ui/node/DiffCallback;[I[I[I)Z", "swap", "i", "j", "toInt", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class MyersDiffKt {
    public static final /* synthetic */ void access$swap(int[] $receiver, int i, int j) {
        swap($receiver, i, j);
    }

    private static final IntStack calculateDiff(int oldSize, int newSize, DiffCallback cb) {
        char r3 = 1;
        char r4 = 2;
        int max = ((oldSize + newSize) + 1) / 2;
        IntStack diagonals = new IntStack(max * 3);
        IntStack stack = new IntStack(max * 4);
        stack.pushRange(0, oldSize, 0, newSize);
        int[] forward = CenteredArray.m5823constructorimpl(new int[(max * 2) + 1]);
        int[] backward = CenteredArray.m5823constructorimpl(new int[(max * 2) + 1]);
        int[] snake = Snake.m6041constructorimpl(new int[5]);
    L4:
        if (stack.isNotEmpty() == false) goto L12;
        int newEnd = stack.pop();
        int newStart = stack.pop();
        int oldEnd = stack.pop();
        int oldStart = stack.pop();
        boolean found = m5935midPointq5eDKzI(oldStart, oldEnd, newStart, newEnd, cb, forward, backward, snake);
        snake = snake;
        if (found == false) goto L4;
        char r19 = r3;
        char r21 = r4;
        if (Math.min(snake[r4] - snake[0], snake[3] - snake[r19]) <= 0) goto L10;
        Snake.m6039addDiagonalToStackimpl(snake, diagonals);
    L10:
        stack.pushRange(oldStart, snake[0], newStart, snake[r19]);
        stack.pushRange(snake[r21], oldEnd, snake[3], newEnd);
        r3 = r19;
        r4 = r21;
        goto L4
    L12:
        diagonals.sortDiagonals();
        diagonals.pushDiagonal(oldSize, newSize, 0);
        return diagonals;
    }

    private static final void applyDiff(IntStack diagonals, DiffCallback callback) {
        int posX = 0;
        int posY = 0;
        int i = 0;
    L4:
        if (i >= diagonals.getSize()) goto L13;
        int startX = diagonals.get(i) - diagonals.get(i + 2);
        int startY = diagonals.get(i + 1) - diagonals.get(i + 2);
        int len = diagonals.get(i + 2);
        i = i + 3;
    L6:
        if (posX >= startX) goto L8;
        callback.remove(posY, posX);
        posX = posX + 1;
    L8:
        if (posY >= startY) goto L10;
        callback.insert(posY);
        posY = posY + 1;
    L10:
        int len2 = len - 1;
        if (len <= 0) goto L4;
        callback.same(posX, posY);
        posX = posX + 1;
        posY = posY + 1;
        len = len2;
        goto L10
    }

    public static final void executeDiff(int oldSize, int newSize, DiffCallback callback) {
        IntStack diagonals = calculateDiff(oldSize, newSize, callback);
        applyDiff(diagonals, callback);
    }

    /* JADX INFO: renamed from: midPoint-q5eDKzI, reason: not valid java name */
    private static final boolean m5935midPointq5eDKzI(int oldStart, int oldEnd, int newStart, int newEnd, DiffCallback cb, int[] forward, int[] backward, int[] snake) {
        int r0 = oldStart;
        int r1 = oldEnd;
        int oldSize = r1 - r0;
        int newSize = newEnd - newStart;
        if (oldSize < 1) goto L16;
        if (newSize < 1) goto L16;
        int max = ((oldSize + newSize) + 1) / 2;
        int[] r5 = forward;
        CenteredArray.m5829setimpl(r5, 1, r0);
        int[] r6 = backward;
        CenteredArray.m5829setimpl(r6, 1, r1);
        int d = 0;
    L7:
        if (d >= max) goto L15;
        boolean found = m5934forward4l5_RBY(r0, r1, newStart, newEnd, cb, r5, r6, d, snake);
        if (found == true) goto L10;
        boolean found2 = m5933backward4l5_RBY(oldStart, oldEnd, newStart, newEnd, cb, forward, backward, d, snake);
        if (found2 == true) goto L13;
        d = d + 1;
        r0 = oldStart;
        r1 = oldEnd;
        r5 = forward;
        r6 = backward;
        goto L7
    L13:
        return true;
    L10:
        return true;
    L15:
        return false;
    L16:
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: forward-4l5_RBY, reason: not valid java name */
    private static final boolean m5934forward4l5_RBY(int oldStart, int oldEnd, int newStart, int newEnd, DiffCallback cb, int[] forward, int[] backward, int d, int[] snake) {
        int r0 = oldEnd;
        int oldSize = r0 - oldStart;
        int newSize = newEnd - newStart;
        boolean r7 = true;
        if ((Math.abs(oldSize - newSize) & 1) != 1) goto L5;
        boolean checkForSnake = true;
    L6:
        int delta = oldSize - newSize;
        int k = -d;
    L7:
        if (k > d) goto L45;
        if (k == (-d)) goto L15;
        if (k != d) goto L12;
    L14:
        int startX = CenteredArray.m5826getimpl(forward, k - 1);
        int x = startX + 1;
        int startX2 = startX;
    L16:
        int y = (newStart + (x - oldStart)) - k;
        if (d == 0) goto L19;
        boolean r15 = r7;
    L20:
        if (x != startX2) goto L22;
        boolean r16 = r7;
    L23:
        int startY = y - (r15 & r16);
    L24:
        if (x >= r0) goto L30;
        if (y >= newEnd) goto L30;
        if (cb.areItemsTheSame(x, y) == false) goto L30;
        x = x + 1;
        y = y + 1;
    L30:
        CenteredArray.m5829setimpl(forward, k, x);
        if (checkForSnake == false) goto L42;
        boolean r20 = r7;
        int backwardsK = delta - k;
        if (backwardsK < ((-d) + 1)) goto L43;
        if (backwardsK > (d - 1)) goto L43;
        if (CenteredArray.m5826getimpl(backward, backwardsK) > x) goto L43;
        fillSnake(startX2, startY, x, y, false, snake);
        return r20;
    L43:
        k = k + 2;
        r0 = oldEnd;
        r7 = r20;
        goto L7
    L42:
        r20 = r7;
        goto L43
    L22:
        r16 = 0;
        goto L23
    L19:
        r15 = 0;
        goto L20
    L12:
        if (CenteredArray.m5826getimpl(forward, k + 1) <= CenteredArray.m5826getimpl(forward, k - 1)) goto L14;
    L15:
        int startX3 = CenteredArray.m5826getimpl(forward, k + 1);
        x = startX3;
        startX2 = startX3;
        goto L16
    L45:
        return false;
    L5:
        checkForSnake = false;
        goto L6
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: backward-4l5_RBY, reason: not valid java name */
    private static final boolean m5933backward4l5_RBY(int oldStart, int oldEnd, int newStart, int newEnd, DiffCallback cb, int[] forward, int[] backward, int d, int[] snake) {
        int oldSize = oldEnd - oldStart;
        int newSize = newEnd - newStart;
        boolean r7 = true;
        if (((oldSize - newSize) & 1) != 0) goto L5;
        boolean checkForSnake = true;
    L6:
        int delta = oldSize - newSize;
        int k = -d;
    L7:
        if (k > d) goto L43;
        if (k == (-d)) goto L15;
        if (k != d) goto L12;
    L14:
        int startX = CenteredArray.m5826getimpl(backward, k - 1);
        int x = startX - 1;
        int startX2 = startX;
    L16:
        int y = newEnd - ((oldEnd - x) - k);
        if (d == 0) goto L19;
        boolean r13 = r7;
    L20:
        if (x != startX2) goto L22;
        boolean r14 = r7;
    L23:
        int startY = y + (r13 & r14);
        int y2 = y;
        int x2 = x;
    L24:
        if (x2 <= oldStart) goto L29;
        if (y2 <= newStart) goto L29;
        boolean r19 = r7;
        if (cb.areItemsTheSame(x2 - 1, y2 - 1) == false) goto L30;
        x2 = x2 - 1;
        y2 = y2 - 1;
        r7 = r19;
    L30:
        CenteredArray.m5829setimpl(backward, k, x2);
        if (checkForSnake == false) goto L41;
        int forwardsK = delta - k;
        if (forwardsK < (-d)) goto L41;
        if (forwardsK > d) goto L41;
        if (CenteredArray.m5826getimpl(forward, forwardsK) < x2) goto L41;
        fillSnake(x2, y2, startX2, startY, true, snake);
        return r19;
    L41:
        k = k + 2;
        r7 = r19;
    L29:
        r19 = r7;
        goto L30
    L22:
        r14 = 0;
        goto L23
    L19:
        r13 = 0;
        goto L20
    L12:
        if (CenteredArray.m5826getimpl(backward, k + 1) >= CenteredArray.m5826getimpl(backward, k - 1)) goto L14;
    L15:
        int startX3 = CenteredArray.m5826getimpl(backward, k + 1);
        x = startX3;
        startX2 = startX3;
        goto L16
    L43:
        return false;
    L5:
        checkForSnake = false;
        goto L6
    }

    private static final int toInt(boolean r1) {
        return r1 ? 1 : 0;
    }

    public static final void fillSnake(int r2, int r3, int r4, int r5, boolean r6, int[] r7) {
        if (r7.length >= 5) goto L5;
        return;
    L5:
        r7[0] = r2;
        r7[1] = r3;
        r7[2] = r4;
        r7[3] = r5;
        r7[4] = r6 ? 1 : 0;
    }

    private static final void swap(int[] $this$swap, int i, int j) {
        int tmp = $this$swap[i];
        $this$swap[i] = $this$swap[j];
        $this$swap[j] = tmp;
    }
}
