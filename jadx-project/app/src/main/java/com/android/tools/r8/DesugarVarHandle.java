package com.android.tools.r8;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DesugarVarHandle {
    public static final /* synthetic */ Unsafe U = null;
    public final /* synthetic */ long arrayIndexScale;
    public final /* synthetic */ long offset;
    public final /* synthetic */ Class recv;
    public final /* synthetic */ Class type;

    /* JADX INFO: renamed from: com.android.tools.r8.DesugarVarHandle$0, reason: invalid class name */
    /* JADX INFO: compiled from: D8$$SyntheticClass */
    public final /* synthetic */ class AnonymousClass0 {
        public static /* synthetic */ boolean m(Unsafe r1, Object r2, long r3, Object r5, Object r6) {
        L3:
            if (r1.compareAndSwapObject(r2, r3, r5, r6) == true) goto L4;
            if (r1.getObject(r2, r3) == r5) goto L3;
            return false;
        L4:
            return true;
        }
    }

    static {
        U = getUnsafe();
    }

    public /* synthetic */ DesugarVarHandle(Class r4) {
        if (r4.isArray() == false) goto L20;
        Class<?> r0 = r4.getComponentType();
        if (r0.isArray() == true) goto L18;
        if (r0.isPrimitive() == true) goto L9;
    L15:
        this.recv = r4;
        this.type = r4.getComponentType();
        Unsafe r1 = U;
        this.offset = r1.arrayBaseOffset(r4);
        this.arrayIndexScale = r1.arrayIndexScale(r4);
        return;
    L9:
        if (r0 == Integer.TYPE) goto L15;
        if (r0 == Long.TYPE) goto L15;
        throw new UnsupportedOperationException("Using a VarHandle for an array of type '" + r0.getName() + "' " + arrayRequiringNativeSupport());
    L18:
        throw new UnsupportedOperationException("Using a VarHandle for a multidimensional array " + arrayRequiringNativeSupport());
    L20:
        throw new IllegalArgumentException("not an array " + r4.getSimpleName());
    }

    public /* synthetic */ DesugarVarHandle(Class r2, String r3, Class r4) {
        this.recv = r2;
        this.type = r2.getDeclaredField(r3).getType();
        if (r4.isPrimitive() == true) goto L5;
    L11:
        this.offset = U.objectFieldOffset(r2.getDeclaredField(r3));
        this.arrayIndexScale = 0;
        return;
    L5:
        if (r4 == Integer.TYPE) goto L11;
        if (r4 == Long.TYPE) goto L11;
        throw new UnsupportedOperationException("Using a VarHandle for a field of type '" + r4.getName() + "' requires native VarHandle support available from Android 13. VarHandle desugaring only supports primitive types int and long and reference types.");
    }

    public static /* synthetic */ Unsafe getUnsafe() {
        Field r0 = Unsafe.class.getDeclaredField("theUnsafe");     // Catch: NoSuchFieldException -> L5
    L16:
        r0.setAccessible(true);
        return (Unsafe) r0.get(null);
    L19:
        e = move-exception;
        throw new RuntimeException(e);
    L5:
        e = move-exception;
        Field[] r3 = Unsafe.class.getDeclaredFields();
        int r4 = r3.length;
        int r5 = 0;
    L7:
        if (r5 >= r4) goto L14;
        Field r6 = r3[r5];
        if (Modifier.isStatic(r6.getModifiers()) == false) goto L13;
        if (Unsafe.class.isAssignableFrom(r6.getType()) == false) goto L13;
        r0 = r6;
    L15:
        if (r0 == null) goto L16;
        throw new UnsupportedOperationException("Couldn't find the Unsafe", e);
    L13:
        r5 = r5 + 1;
        goto L7
    L14:
        r0 = null;
        goto L15
    }

    public static /* synthetic */ void releaseFence() {
        U.storeFence();
    }

    public /* synthetic */ String arrayRequiringNativeSupport() {
        return "requires native VarHandle support available from Android 13. VarHandle desugaring only supports single dimensional arrays of primitive typesint and long and reference types.";
    }

    public /* synthetic */ Object boxIntIfPossible(int r2, Class r3) {
        if (r3 != Long.class) goto L7;
        return Long.valueOf(r2);
    L7:
        if (r3 != Float.class) goto L11;
        return Float.valueOf(r2);
    L11:
        if (r3 != Double.class) goto L15;
        return Double.valueOf(r2);
    L15:
        throw desugarWrongMethodTypeException();
    }

    public /* synthetic */ Object boxLongIfPossible(long r2, Class r4) {
        if (r4 != Float.class) goto L7;
        return Float.valueOf(r2);
    L7:
        if (r4 != Double.class) goto L11;
        return Double.valueOf(r2);
    L11:
        throw desugarWrongMethodTypeException();
    }

    public /* synthetic */ boolean compareAndSet(Object r9, int r10, int r11) {
        if (this.type != Integer.TYPE) goto L7;
        return U.compareAndSwapInt(r9, this.offset, r10, r11);
    L7:
        if (this.type != Long.TYPE) goto L11;
        return U.compareAndSwapLong(r9, this.offset, r10, r11);
    L11:
        return compareAndSet(r9, Integer.valueOf(r10), Integer.valueOf(r11));
    }

    public /* synthetic */ boolean compareAndSet(Object r17, int r18, Object r19, Object r20) {
        if (this.recv.isArray() == false) goto L17;
        if (this.recv != r17.getClass()) goto L17;
        long r10 = this.offset + (((long) r18) * this.arrayIndexScale);
        Class r1 = this.recv;
        if (r1 != int[].class) goto L11;
        return U.compareAndSwapInt(r17, r10, toIntIfPossible(r19, false), toIntIfPossible(r20, false));
    L11:
        if (r1 != long[].class) goto L15;
        return U.compareAndSwapLong(r17, r10, toLongIfPossible(r19, false), toLongIfPossible(r20, false));
    L15:
        return AnonymousClass0.m(U, r17, r10, r19, r20);
    L17:
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ boolean compareAndSet(Object r11, long r12, long r14) {
        if (this.type != Long.TYPE) goto L7;
        return U.compareAndSwapLong(r11, this.offset, r12, r14);
    L7:
        return compareAndSet(r11, Long.valueOf(r12), Long.valueOf(r14));
    }

    public /* synthetic */ boolean compareAndSet(Object r10, Object r11, Object r12) {
        if (this.type == Integer.TYPE) goto L5;
        Class r13 = this.type;
        Class r0 = Long.TYPE;
        long r2 = this.offset;
        if (r13 != r0) goto L11;
        return U.compareAndSwapLong(r10, r2, toLongIfPossible(r11, false), toLongIfPossible(r12, false));
    L11:
        return AnonymousClass0.m(U, r10, r2, r11, r12);
    L5:
        return U.compareAndSwapInt(r10, this.offset, toIntIfPossible(r11, false), toIntIfPossible(r12, false));
    }

    public /* synthetic */ boolean compareAndSet(int[] r11, int r12, int r13, int r14) {
        if (this.recv != int[].class) goto L7;
        long r6 = this.offset + (((long) r12) * this.arrayIndexScale);
        return U.compareAndSwapInt(r11, r6, r13, r14);
    L7:
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ boolean compareAndSet(long[] r13, int r14, long r15, long r17) {
        if (this.recv != long[].class) goto L7;
        long r6 = this.offset + (((long) r14) * this.arrayIndexScale);
        return U.compareAndSwapLong(r13, r6, r15, r17);
    L7:
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ RuntimeException desugarWrongMethodTypeException() {
        return new RuntimeException("java.lang.invoke.WrongMethodTypeException");
    }

    public /* synthetic */ int get(Object r4) {
        if (this.type != Integer.TYPE) goto L7;
        return U.getInt(r4, this.offset);
    L7:
        if (this.type == Long.TYPE) goto L11;
        return toIntIfPossible(U.getObject(r4, this.offset), true);
    L11:
        throw desugarWrongMethodTypeException();
    }

    public /* synthetic */ int get(int[] r7, int r8) {
        if (this.recv != int[].class) goto L7;
        long r0 = this.offset + (((long) r8) * this.arrayIndexScale);
        return U.getInt(r7, r0);
    L7:
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public /* synthetic */ long m7397get(Object r5) {
        if (this.type == Long.TYPE) goto L5;
        Class r0 = this.type;
        Class r1 = Integer.TYPE;
        long r2 = this.offset;
        if (r0 != r1) goto L11;
        return U.getInt(r5, r2);
    L11:
        return toLongIfPossible(U.getObject(r5, r2), true);
    L5:
        return U.getLong(r5, this.offset);
    }

    public /* synthetic */ long get(long[] r7, int r8) {
        if (this.recv != long[].class) goto L7;
        long r0 = this.offset + (((long) r8) * this.arrayIndexScale);
        return U.getLong(r7, r0);
    L7:
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public /* synthetic */ Object m7398get(Object r5) {
        if (this.type == Integer.TYPE) goto L5;
        Class r0 = this.type;
        Class r1 = Long.TYPE;
        long r2 = this.offset;
        Unsafe r4 = U;
        if (r0 != r1) goto L11;
        return Long.valueOf(r4.getLong(r5, r2));
    L11:
        return r4.getObject(r5, r2);
    L5:
        return Integer.valueOf(U.getInt(r5, this.offset));
    }

    public /* synthetic */ Object get(Object r7, int r8) {
        if (this.recv.isArray() == false) goto L17;
        if (this.recv != r7.getClass()) goto L17;
        long r0 = this.offset + (((long) r8) * this.arrayIndexScale);
        if (this.type != Integer.TYPE) goto L11;
        return Integer.valueOf(U.getInt(r7, r0));
    L11:
        if (this.type != Long.TYPE) goto L15;
        return Integer.valueOf((int) U.getLong(r7, r0));
    L15:
        return U.getObject(r7, r0);
    L17:
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ Object get(Object r7, int r8, Class r9) {
        if (this.recv.isArray() == false) goto L28;
        if (this.recv != r7.getClass()) goto L28;
        long r0 = this.offset + (((long) r8) * this.arrayIndexScale);
        if (this.type != Integer.TYPE) goto L11;
        return boxIntIfPossible(U.getInt(r7, r0), r9);
    L11:
        if (this.type == Long.TYPE) goto L13;
        Object r10 = U.getObject(r7, r0);
        if ((r10 instanceof Integer) == false) goto L21;
        if (r9 == Integer.class) goto L21;
        return boxIntIfPossible(((Integer) r10).intValue(), r9);
    L21:
        if ((r10 instanceof Long) == true) goto L23;
    L26:
        return r10;
    L23:
        if (r9 == Long.class) goto L26;
        return boxLongIfPossible(((Long) r10).longValue(), r9);
    L13:
        return boxLongIfPossible(U.getLong(r7, r0), r9);
    L28:
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ Object get(Object r5, Class r6) {
        if (this.type == Integer.TYPE) goto L5;
        Class r0 = this.type;
        Class r1 = Long.TYPE;
        long r2 = this.offset;
        if (r0 != r1) goto L11;
        return boxLongIfPossible(U.getLong(r5, r2), r6);
    L11:
        return U.getObject(r5, r2);
    L5:
        return boxIntIfPossible(U.getInt(r5, this.offset), r6);
    }

    public /* synthetic */ int getVolatile(Object r4) {
        if (this.type != Integer.TYPE) goto L7;
        return U.getIntVolatile(r4, this.offset);
    L7:
        if (this.type == Long.TYPE) goto L11;
        return toIntIfPossible(U.getObjectVolatile(r4, this.offset), true);
    L11:
        throw desugarWrongMethodTypeException();
    }

    public /* synthetic */ int getVolatile(int[] r7, int r8) {
        if (this.recv != int[].class) goto L7;
        long r0 = this.offset + (((long) r8) * this.arrayIndexScale);
        return U.getIntVolatile(r7, r0);
    L7:
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: getVolatile, reason: collision with other method in class */
    public /* synthetic */ long m7399getVolatile(Object r5) {
        if (this.type == Long.TYPE) goto L5;
        Class r0 = this.type;
        Class r1 = Integer.TYPE;
        long r2 = this.offset;
        if (r0 != r1) goto L11;
        return U.getIntVolatile(r5, r2);
    L11:
        return toLongIfPossible(U.getObjectVolatile(r5, r2), true);
    L5:
        return U.getLongVolatile(r5, this.offset);
    }

    public /* synthetic */ long getVolatile(long[] r7, int r8) {
        if (this.recv != long[].class) goto L7;
        long r0 = this.offset + (((long) r8) * this.arrayIndexScale);
        return U.getLongVolatile(r7, r0);
    L7:
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: getVolatile, reason: collision with other method in class */
    public /* synthetic */ Object m7400getVolatile(Object r5) {
        if (this.type == Integer.TYPE) goto L5;
        Class r0 = this.type;
        Class r1 = Long.TYPE;
        long r2 = this.offset;
        Unsafe r4 = U;
        if (r0 != r1) goto L11;
        return Long.valueOf(r4.getLongVolatile(r5, r2));
    L11:
        return r4.getObjectVolatile(r5, r2);
    L5:
        return Integer.valueOf(U.getIntVolatile(r5, this.offset));
    }

    public /* synthetic */ Object getVolatile(Object r7, int r8) {
        if (this.recv.isArray() == false) goto L17;
        if (this.recv != r7.getClass()) goto L17;
        long r0 = this.offset + (((long) r8) * this.arrayIndexScale);
        if (this.type != Integer.TYPE) goto L11;
        return Integer.valueOf(U.getIntVolatile(r7, r0));
    L11:
        if (this.type != Long.TYPE) goto L15;
        return Integer.valueOf((int) U.getLongVolatile(r7, r0));
    L15:
        return U.getObjectVolatile(r7, r0);
    L17:
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ Object getVolatile(Object r7, int r8, Class r9) {
        if (this.recv.isArray() == false) goto L28;
        if (this.recv != r7.getClass()) goto L28;
        long r0 = this.offset + (((long) r8) * this.arrayIndexScale);
        if (this.type != Integer.TYPE) goto L11;
        return boxIntIfPossible(U.getIntVolatile(r7, r0), r9);
    L11:
        if (this.type == Long.TYPE) goto L13;
        Object r10 = U.getObjectVolatile(r7, r0);
        if ((r10 instanceof Integer) == false) goto L21;
        if (r9 == Integer.class) goto L21;
        return boxIntIfPossible(((Integer) r10).intValue(), r9);
    L21:
        if ((r10 instanceof Long) == true) goto L23;
    L26:
        return r10;
    L23:
        if (r9 == Long.class) goto L26;
        return boxLongIfPossible(((Long) r10).longValue(), r9);
    L13:
        return boxLongIfPossible(U.getLongVolatile(r7, r0), r9);
    L28:
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ Object getVolatile(Object r5, Class r6) {
        if (this.type == Integer.TYPE) goto L5;
        Class r0 = this.type;
        Class r1 = Long.TYPE;
        long r2 = this.offset;
        if (r0 != r1) goto L11;
        return boxLongIfPossible(U.getLongVolatile(r5, r2), r6);
    L11:
        return U.getObjectVolatile(r5, r2);
    L5:
        return boxIntIfPossible(U.getIntVolatile(r5, this.offset), r6);
    }

    public /* synthetic */ void set(Object r9, int r10) {
        if (this.type != Integer.TYPE) goto L7;
        U.putInt(r9, this.offset, r10);
        return;
    L7:
        if (this.type != Long.TYPE) goto L10;
        U.putLong(r9, this.offset, r10);
        return;
    L10:
        set(r9, Integer.valueOf(r10));
    }

    public /* synthetic */ void set(Object r11, int r12, Object r13) {
        if (this.recv.isArray() == false) goto L17;
        if (this.recv != r11.getClass()) goto L17;
        long r6 = this.offset + (((long) r12) * this.arrayIndexScale);
        Class r14 = this.recv;
        if (r14 != int[].class) goto L11;
        U.putInt(r11, r6, toIntIfPossible(r13, false));
        return;
    L11:
        if (r14 != long[].class) goto L14;
        U.putLong(r11, r6, toLongIfPossible(r13, false));
        return;
    L14:
        U.putObject(r11, r6, r13);
        return;
    L17:
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ void set(Object r9, long r10) {
        if (this.type != Long.TYPE) goto L7;
        U.putLong(r9, this.offset, r10);
        return;
    L7:
        if (this.type == Integer.TYPE) goto L11;
        U.putObject(r9, this.offset, Long.valueOf(r10));
        return;
    L11:
        throw desugarWrongMethodTypeException();
    }

    public /* synthetic */ void set(Object r4, Object r5) {
        if (this.type != Integer.TYPE) goto L7;
        set(r4, toIntIfPossible(r5, false));
        return;
    L7:
        if (this.type != Long.TYPE) goto L10;
        set(r4, toLongIfPossible(r5, false));
        return;
    L10:
        U.putObject(r4, this.offset, r5);
    }

    public /* synthetic */ void set(int[] r7, int r8, int r9) {
        if (this.recv != int[].class) goto L7;
        long r0 = this.offset + (((long) r8) * this.arrayIndexScale);
        U.putInt(r7, r0, r9);
        return;
    L7:
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ void set(long[] r11, int r12, long r13) {
        if (this.recv != long[].class) goto L7;
        long r6 = this.offset + (((long) r12) * this.arrayIndexScale);
        U.putLong(r11, r6, r13);
        return;
    L7:
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ void setRelease(Object r9, int r10) {
        if (this.type != Integer.TYPE) goto L7;
        U.putOrderedInt(r9, this.offset, r10);
        return;
    L7:
        if (this.type != Long.TYPE) goto L10;
        U.putOrderedLong(r9, this.offset, r10);
        return;
    L10:
        setRelease(r9, Integer.valueOf(r10));
    }

    public /* synthetic */ void setRelease(Object r11, int r12, Object r13) {
        if (this.recv.isArray() == false) goto L17;
        if (this.recv != r11.getClass()) goto L17;
        long r6 = this.offset + (((long) r12) * this.arrayIndexScale);
        Class r14 = this.recv;
        if (r14 != int[].class) goto L11;
        U.putOrderedInt(r11, r6, toIntIfPossible(r13, false));
        return;
    L11:
        if (r14 != long[].class) goto L14;
        U.putOrderedLong(r11, r6, toLongIfPossible(r13, false));
        return;
    L14:
        U.putOrderedObject(r11, r6, r13);
        return;
    L17:
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ void setRelease(Object r9, long r10) {
        if (this.type != Long.TYPE) goto L7;
        U.putOrderedLong(r9, this.offset, r10);
        return;
    L7:
        if (this.type == Integer.TYPE) goto L11;
        U.putOrderedObject(r9, this.offset, Long.valueOf(r10));
        return;
    L11:
        throw desugarWrongMethodTypeException();
    }

    public /* synthetic */ void setRelease(Object r4, Object r5) {
        if (this.type != Integer.TYPE) goto L7;
        setRelease(r4, toIntIfPossible(r5, false));
        return;
    L7:
        if (this.type != Long.TYPE) goto L10;
        setRelease(r4, toLongIfPossible(r5, false));
        return;
    L10:
        U.putOrderedObject(r4, this.offset, r5);
    }

    public /* synthetic */ void setRelease(int[] r7, int r8, int r9) {
        if (this.recv != int[].class) goto L7;
        long r0 = this.offset + (((long) r8) * this.arrayIndexScale);
        U.putOrderedInt(r7, r0, r9);
        return;
    L7:
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ void setRelease(long[] r11, int r12, long r13) {
        if (this.recv != long[].class) goto L7;
        long r6 = this.offset + (((long) r12) * this.arrayIndexScale);
        U.putOrderedLong(r11, r6, r13);
        return;
    L7:
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ void setVolatile(Object r9, int r10) {
        if (this.type != Integer.TYPE) goto L7;
        U.putIntVolatile(r9, this.offset, r10);
        return;
    L7:
        if (this.type != Long.TYPE) goto L10;
        U.putLongVolatile(r9, this.offset, r10);
        return;
    L10:
        setVolatile(r9, Integer.valueOf(r10));
    }

    public /* synthetic */ void setVolatile(Object r11, int r12, Object r13) {
        if (this.recv.isArray() == false) goto L17;
        if (this.recv != r11.getClass()) goto L17;
        long r6 = this.offset + (((long) r12) * this.arrayIndexScale);
        Class r14 = this.recv;
        if (r14 != int[].class) goto L11;
        U.putIntVolatile(r11, r6, toIntIfPossible(r13, false));
        return;
    L11:
        if (r14 != long[].class) goto L14;
        U.putLongVolatile(r11, r6, toLongIfPossible(r13, false));
        return;
    L14:
        U.putObjectVolatile(r11, r6, r13);
        return;
    L17:
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ void setVolatile(Object r9, long r10) {
        if (this.type != Long.TYPE) goto L7;
        U.putLongVolatile(r9, this.offset, r10);
        return;
    L7:
        if (this.type == Integer.TYPE) goto L11;
        U.putObjectVolatile(r9, this.offset, Long.valueOf(r10));
        return;
    L11:
        throw desugarWrongMethodTypeException();
    }

    public /* synthetic */ void setVolatile(Object r4, Object r5) {
        if (this.type != Integer.TYPE) goto L7;
        setVolatile(r4, toIntIfPossible(r5, false));
        return;
    L7:
        if (this.type != Long.TYPE) goto L10;
        setVolatile(r4, toLongIfPossible(r5, false));
        return;
    L10:
        U.putObjectVolatile(r4, this.offset, r5);
    }

    public /* synthetic */ void setVolatile(int[] r7, int r8, int r9) {
        if (this.recv != int[].class) goto L7;
        long r0 = this.offset + (((long) r8) * this.arrayIndexScale);
        U.putIntVolatile(r7, r0, r9);
        return;
    L7:
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ void setVolatile(long[] r11, int r12, long r13) {
        if (this.recv != long[].class) goto L7;
        long r6 = this.offset + (((long) r12) * this.arrayIndexScale);
        U.putLongVolatile(r11, r6, r13);
        return;
    L7:
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ int toIntIfPossible(Object r2, boolean r3) {
        if ((r2 instanceof Integer) == false) goto L7;
        return ((Integer) r2).intValue();
    L7:
        if ((r2 instanceof Byte) == false) goto L11;
        return ((Byte) r2).byteValue();
    L11:
        if ((r2 instanceof Character) == false) goto L15;
        return ((Character) r2).charValue();
    L15:
        if ((r2 instanceof Short) == true) goto L17;
        if (r3 == false) goto L22;
        throw new ClassCastException();
    L22:
        throw desugarWrongMethodTypeException();
    L17:
        return ((Short) r2).shortValue();
    }

    public /* synthetic */ long toLongIfPossible(Object r2, boolean r3) {
        if ((r2 instanceof Long) == false) goto L7;
        return ((Long) r2).longValue();
    L7:
        return toIntIfPossible(r2, r3);
    }

    public /* synthetic */ boolean weakCompareAndSet(Object r9, int r10, int r11) {
        if (this.type != Integer.TYPE) goto L7;
        return U.compareAndSwapInt(r9, this.offset, r10, r11);
    L7:
        if (this.type != Long.TYPE) goto L11;
        return U.compareAndSwapLong(r9, this.offset, r10, r11);
    L11:
        return compareAndSet(r9, Integer.valueOf(r10), Integer.valueOf(r11));
    }

    public /* synthetic */ boolean weakCompareAndSet(Object r17, int r18, Object r19, Object r20) {
        if (this.recv.isArray() == false) goto L17;
        if (this.recv != r17.getClass()) goto L17;
        long r10 = this.offset + (((long) r18) * this.arrayIndexScale);
        Class r1 = this.recv;
        if (r1 != int[].class) goto L11;
        return U.compareAndSwapInt(r17, r10, toIntIfPossible(r19, false), toIntIfPossible(r20, false));
    L11:
        if (r1 != long[].class) goto L15;
        return U.compareAndSwapLong(r17, r10, toLongIfPossible(r19, false), toLongIfPossible(r20, false));
    L15:
        return AnonymousClass0.m(U, r17, r10, r19, r20);
    L17:
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ boolean weakCompareAndSet(Object r11, long r12, long r14) {
        if (this.type != Long.TYPE) goto L7;
        return U.compareAndSwapLong(r11, this.offset, r12, r14);
    L7:
        return compareAndSet(r11, Long.valueOf(r12), Long.valueOf(r14));
    }

    public /* synthetic */ boolean weakCompareAndSet(Object r10, Object r11, Object r12) {
        if (this.type == Integer.TYPE) goto L5;
        Class r13 = this.type;
        Class r0 = Long.TYPE;
        long r2 = this.offset;
        if (r13 != r0) goto L11;
        return U.compareAndSwapLong(r10, r2, toLongIfPossible(r11, false), toLongIfPossible(r12, false));
    L11:
        return AnonymousClass0.m(U, r10, r2, r11, r12);
    L5:
        return U.compareAndSwapInt(r10, this.offset, toIntIfPossible(r11, false), toIntIfPossible(r12, false));
    }

    public /* synthetic */ boolean weakCompareAndSet(int[] r11, int r12, int r13, int r14) {
        if (this.recv != int[].class) goto L7;
        long r6 = this.offset + (((long) r12) * this.arrayIndexScale);
        return U.compareAndSwapInt(r11, r6, r13, r14);
    L7:
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ boolean weakCompareAndSet(long[] r13, int r14, long r15, long r17) {
        if (this.recv != long[].class) goto L7;
        long r6 = this.offset + (((long) r14) * this.arrayIndexScale);
        return U.compareAndSwapLong(r13, r6, r15, r17);
    L7:
        throw new UnsupportedOperationException();
    }
}
