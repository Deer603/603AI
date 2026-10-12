package androidx.core.content.res;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes4.dex */
final class GrowingArrayUtils {
    public static <T> T[] append(T[] r2, int r3, T r4) {
        if ((r3 + 1) <= r2.length) goto L5;
        Object[] r0 = (Object[]) Array.newInstance(r2.getClass().getComponentType(), growSize(r3));
        System.arraycopy(r2, 0, r0, 0, r3);
        r2 = (T[]) r0;
    L5:
        r2[r3] = r4;
        return r2;
    }

    public static int[] append(int[] array, int currentSize, int element) {
        if ((currentSize + 1) <= array.length) goto L5;
        int[] newArray = new int[growSize(currentSize)];
        System.arraycopy(array, 0, newArray, 0, currentSize);
        array = newArray;
    L5:
        array[currentSize] = element;
        return array;
    }

    public static long[] append(long[] array, int currentSize, long element) {
        if ((currentSize + 1) <= array.length) goto L5;
        long[] newArray = new long[growSize(currentSize)];
        System.arraycopy(array, 0, newArray, 0, currentSize);
        array = newArray;
    L5:
        array[currentSize] = element;
        return array;
    }

    public static boolean[] append(boolean[] array, int currentSize, boolean element) {
        if ((currentSize + 1) <= array.length) goto L5;
        boolean[] newArray = new boolean[growSize(currentSize)];
        System.arraycopy(array, 0, newArray, 0, currentSize);
        array = newArray;
    L5:
        array[currentSize] = element;
        return array;
    }

    public static <T> T[] insert(T[] r3, int r4, int r5, T r6) {
        if ((r4 + 1) > r3.length) goto L6;
        System.arraycopy(r3, r5, r3, r5 + 1, r4 - r5);
        r3[r5] = r6;
        return r3;
    L6:
        T[] r0 = (T[]) ((Object[]) Array.newInstance(r3.getClass().getComponentType(), growSize(r4)));
        System.arraycopy(r3, 0, r0, 0, r5);
        r0[r5] = r6;
        System.arraycopy(r3, r5, r0, r5 + 1, r3.length - r5);
        return r0;
    }

    public static int[] insert(int[] array, int currentSize, int index, int element) {
        if ((currentSize + 1) > array.length) goto L6;
        System.arraycopy(array, index, array, index + 1, currentSize - index);
        array[index] = element;
        return array;
    L6:
        int[] newArray = new int[growSize(currentSize)];
        System.arraycopy(array, 0, newArray, 0, index);
        newArray[index] = element;
        System.arraycopy(array, index, newArray, index + 1, array.length - index);
        return newArray;
    }

    public static long[] insert(long[] array, int currentSize, int index, long element) {
        if ((currentSize + 1) > array.length) goto L6;
        System.arraycopy(array, index, array, index + 1, currentSize - index);
        array[index] = element;
        return array;
    L6:
        long[] newArray = new long[growSize(currentSize)];
        System.arraycopy(array, 0, newArray, 0, index);
        newArray[index] = element;
        System.arraycopy(array, index, newArray, index + 1, array.length - index);
        return newArray;
    }

    public static boolean[] insert(boolean[] array, int currentSize, int index, boolean element) {
        if ((currentSize + 1) > array.length) goto L6;
        System.arraycopy(array, index, array, index + 1, currentSize - index);
        array[index] = element;
        return array;
    L6:
        boolean[] newArray = new boolean[growSize(currentSize)];
        System.arraycopy(array, 0, newArray, 0, index);
        newArray[index] = element;
        System.arraycopy(array, index, newArray, index + 1, array.length - index);
        return newArray;
    }

    public static int growSize(int currentSize) {
        if (currentSize > 4) goto L6;
        return 8;
    L6:
        return currentSize * 2;
    }

    private GrowingArrayUtils() {
    }
}
