package androidx.compose.runtime.reflect;

import androidx.compose.runtime.Composer;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: ComposableMethod.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\u001a\u0018\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0002\u001a\f\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\b\u001a(\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0006\b\u0000\u0010\u000b\u0018\u0001*\u0002H\u000b2\u0006\u0010\f\u001a\u00020\u0001H\u0082\b¢\u0006\u0002\u0010\r\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\bH\u0002\u001a7\u0010\u0010\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u001a\u0010\u0014\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00110\n\"\u0006\u0012\u0002\b\u00030\u0011¢\u0006\u0002\u0010\u0015\u001a\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\u0006\u0012\u0002\b\u00030\u0011H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"BITS_PER_INT", "", "changedParamCount", "realValueParams", "thisParams", "defaultParamCount", "asComposableMethod", "Landroidx/compose/runtime/reflect/ComposableMethod;", "Ljava/lang/reflect/Method;", "dup", "", "T", "count", "(Ljava/lang/Object;I)[Ljava/lang/Object;", "getComposableInfo", "Landroidx/compose/runtime/reflect/ComposableInfo;", "getDeclaredComposableMethod", "Ljava/lang/Class;", "methodName", "", "args", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Landroidx/compose/runtime/reflect/ComposableMethod;", "getDefaultValue", "", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ComposableMethodKt {
    private static final int BITS_PER_INT = 31;

    public static final /* synthetic */ Object access$getDefaultValue(Class $receiver) {
        return getDefaultValue($receiver);
    }

    private static final int changedParamCount(int realValueParams, int thisParams) {
        if (realValueParams != 0) goto L5;
        return 1;
    L5:
        int totalParams = realValueParams + thisParams;
        return (int) Math.ceil(((double) totalParams) / 10.0d);
    }

    private static final int defaultParamCount(int realValueParams) {
        return (int) Math.ceil(((double) realValueParams) / 31.0d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final ComposableInfo getComposableInfo(Method r11) {
        Class<?>[] r0 = r11.getParameterTypes();
        int r2 = r0.length - 1;
        if (r2 < 0) goto L8;
    L4:
        int r4 = r2;
        r2 = r2 - 1;
        if (Intrinsics.areEqual(r0[r4], Composer.class) == true) goto L9;
        if (r2 >= 0) goto L4;
    L9:
        boolean r1 = false;
        if (r4 == (-1)) goto L12;
        int r3 = changedParamCount(r4, !Modifier.isStatic(r11.getModifiers()) ? 1 : 0);
        int r5 = (r4 + 1) + r3;
        int r6 = r11.getParameterTypes().length;
        if (r6 == r5) goto L16;
        Object[] r7 = true;
    L17:
        if (r7 == false) goto L19;
        int r8 = defaultParamCount(r4);
    L21:
        if ((r5 + r8) != r6) goto L24;
        r1 = true;
    L24:
        return new ComposableInfo(r1, r4, r3, r8);
    L19:
        r8 = 0;
        goto L21
    L16:
        r7 = false;
        goto L17
    L12:
        return new ComposableInfo(false, r11.getParameterTypes().length, 0, 0);
    L8:
        r4 = -1;
        goto L9
    }

    private static final Object getDefaultValue(Class<?> r3) {
        String r0 = r3.getName();
        if (r0 != null) goto L5;
    L39:
        return null;
    L5:
        switch(r0.hashCode()) {
            case -1325958191: goto L36;
            case 104431: goto L32;
            case 3039496: goto L28;
            case 3052374: goto L24;
            case 3327612: goto L20;
            case 64711720: goto L16;
            case 97526364: goto L12;
            case 109413500: goto L8;
            default: goto L39;
        };
    L8:
        if (r0.equals("short") == false) goto L39;
        return (short) 0;
    L12:
        if (r0.equals("float") == false) goto L39;
        return Float.valueOf(0.0f);
    L16:
        if (r0.equals("boolean") == false) goto L39;
        return false;
    L20:
        if (r0.equals("long") == false) goto L39;
        return 0L;
    L24:
        if (r0.equals("char") == false) goto L39;
        return (char) 0;
    L28:
        if (r0.equals("byte") == false) goto L39;
        return (byte) 0;
    L32:
        if (r0.equals("int") == false) goto L39;
        return 0;
    L36:
        if (r0.equals("double") == false) goto L39;
        return Double.valueOf(0.0d);
    }

    public static final ComposableMethod asComposableMethod(Method $this$asComposableMethod) {
        ComposableInfo composableInfo = getComposableInfo($this$asComposableMethod);
        if (composableInfo.isComposable() == true) goto L5;
        return null;
    L5:
        return new ComposableMethod($this$asComposableMethod, composableInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final /* synthetic */ <T> T[] dup(T r11, int r12) {
        IntRange r2 = RangesKt.until(0, r12);
        ArrayList r4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(r2, 10));
        Iterator<Integer> r7 = r2.iterator();
    L4:
        if (r7.hasNext() == false) goto L6;
        int r8 = ((IntIterator) r7).nextInt();
        r4.add(r11);
        goto L4
    L6:
        Intrinsics.reifiedOperationMarker(0, "T?");
        return (T[]) r4.toArray(new Object[0]);
    }

    public static final ComposableMethod getDeclaredComposableMethod(Class<?> r20, String methodName, Class<?>... r22) throws NoSuchMethodException {
        int changedParams = changedParamCount(r22.length, 0);
        SpreadBuilder r0 = new SpreadBuilder(3);     // Catch: ReflectiveOperationException -> L9
        r0.addSpread(r22);     // Catch: ReflectiveOperationException -> L9
        r0.add(Composer.class);     // Catch: ReflectiveOperationException -> L9
        Class r7 = Integer.TYPE;     // Catch: ReflectiveOperationException -> L9
        Iterable $this$map$iv$iv = RangesKt.until(0, changedParams);     // Catch: ReflectiveOperationException -> L9
        Collection destination$iv$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv$iv, 10));     // Catch: ReflectiveOperationException -> L9
        Iterator<Integer> r14 = $this$map$iv$iv.iterator();     // Catch: ReflectiveOperationException -> L9
    L5:
        if (r14.hasNext() == false) goto L7;
        int r15 = ((IntIterator) r14).nextInt();     // Catch: ReflectiveOperationException -> L9
        destination$iv$iv$iv.add(r7);     // Catch: ReflectiveOperationException -> L9
        goto L5
    L7:
        Collection $this$toTypedArray$iv$iv = (List) destination$iv$iv$iv;     // Catch: ReflectiveOperationException -> L9
        r0.addSpread($this$toTypedArray$iv$iv.toArray(new Class[0]));     // Catch: ReflectiveOperationException -> L9
        Method method = r20.getDeclaredMethod(methodName, (Class[]) r0.toArray(new Class[r0.size()]));     // Catch: ReflectiveOperationException -> L9
    L24:
        if (method == null) goto L28;
        ComposableMethod r4 = asComposableMethod(method);
        Intrinsics.checkNotNull(r4);
        return r4;
    L28:
        throw new NoSuchMethodException(r20.getName() + '.' + methodName);
    L10:
        int defaultParams = defaultParamCount(r22.length);
        SpreadBuilder r1 = new SpreadBuilder(4);     // Catch: ReflectiveOperationException -> L21
        r1.addSpread(r22);     // Catch: ReflectiveOperationException -> L21
        r1.add(Composer.class);     // Catch: ReflectiveOperationException -> L21
        Class r9 = Integer.TYPE;     // Catch: ReflectiveOperationException -> L21
        Iterable $this$map$iv$iv2 = RangesKt.until(0, changedParams);     // Catch: ReflectiveOperationException -> L21
        Collection destination$iv$iv$iv2 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv$iv2, 10));     // Catch: ReflectiveOperationException -> L21
        Iterator<Integer> r16 = $this$map$iv$iv2.iterator();     // Catch: ReflectiveOperationException -> L21
    L13:
        if (r16.hasNext() == false) goto L15;
        int r17 = ((IntIterator) r16).nextInt();     // Catch: ReflectiveOperationException -> L21
        destination$iv$iv$iv2.add(r9);     // Catch: ReflectiveOperationException -> L21
        goto L13
    L15:
        Collection $this$toTypedArray$iv$iv2 = (List) destination$iv$iv$iv2;     // Catch: ReflectiveOperationException -> L21
        r1.addSpread($this$toTypedArray$iv$iv2.toArray(new Class[0]));     // Catch: ReflectiveOperationException -> L21
        Class r10 = Integer.TYPE;     // Catch: ReflectiveOperationException -> L21
        Iterable $this$map$iv$iv3 = RangesKt.until(0, defaultParams);     // Catch: ReflectiveOperationException -> L21
        Collection destination$iv$iv$iv3 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv$iv3, 10));     // Catch: ReflectiveOperationException -> L21
        Iterator<Integer> r18 = $this$map$iv$iv3.iterator();     // Catch: ReflectiveOperationException -> L21
    L17:
        if (r18.hasNext() == false) goto L19;
        int r19 = ((IntIterator) r18).nextInt();     // Catch: ReflectiveOperationException -> L21
        destination$iv$iv$iv3.add(r10);     // Catch: ReflectiveOperationException -> L21
        goto L17
    L19:
        Collection $this$toTypedArray$iv$iv3 = (List) destination$iv$iv$iv3;     // Catch: ReflectiveOperationException -> L21
        r1.addSpread($this$toTypedArray$iv$iv3.toArray(new Class[0]));     // Catch: ReflectiveOperationException -> L21
        method = r20.getDeclaredMethod(methodName, (Class[]) r1.toArray(new Class[r1.size()]));     // Catch: ReflectiveOperationException -> L21
    L22:
        method = null;
        goto L24
    }
}
