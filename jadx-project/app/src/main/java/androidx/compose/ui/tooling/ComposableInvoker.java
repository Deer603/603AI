package androidx.compose.ui.tooling;

import androidx.compose.runtime.Composer;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: ComposableInvoker.jvm.kt */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated(message = "Use androidx.compose.runtime.reflect.ComposableMethodInvoker instead")
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J1\u0010\u0006\u001a\u00020\u00072\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\t2\u0010\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u0002¢\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J=\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0016\u0010\u0018\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\t\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010\u0019J(\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u001b0\t\"\u0006\b\u0000\u0010\u001b\u0018\u0001*\u0002H\u001b2\u0006\u0010\u001c\u001a\u00020\u0004H\u0082\b¢\u0006\u0002\u0010\u001dJ;\u0010\u001e\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u001f0\t2\u0006\u0010\u0015\u001a\u00020\u00142\u001a\u0010\u0018\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n0\t\"\u0006\u0012\u0002\b\u00030\nH\u0002¢\u0006\u0002\u0010 J7\u0010!\u001a\u0004\u0018\u00010\u001f*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0016\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\t\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0002\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\nH\u0002J=\u0010%\u001a\u0004\u0018\u00010\u0001*\u00020\u001f2\b\u0010&\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0016\u001a\u00020\u00172\u0016\u0010\u0018\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\t\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0002\u0010'R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Landroidx/compose/ui/tooling/ComposableInvoker;", "", "()V", "BITS_PER_INT", "", "SLOTS_PER_INT", "areParameterTypesCompatible", "", "composableMethodTypes", "", "Ljava/lang/Class;", "previewParameterTypes", "([Ljava/lang/Class;[Ljava/lang/Class;)Z", "changedParamCount", "realValueParams", "thisParams", "defaultParamCount", "invokeComposable", "", "className", "", "methodName", "composer", "Landroidx/compose/runtime/Composer;", "args", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;[Ljava/lang/Object;)V", "dup", "T", "count", "(Ljava/lang/Object;I)[Ljava/lang/Object;", "findCompatibleComposeMethod", "Ljava/lang/reflect/Method;", "([Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "findComposableMethod", "previewParamArgs", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;", "getDefaultValue", "invokeComposableMethod", "instance", "(Ljava/lang/reflect/Method;Ljava/lang/Object;Landroidx/compose/runtime/Composer;[Ljava/lang/Object;)Ljava/lang/Object;", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ComposableInvoker {
    public static final int $stable = 0;
    private static final int BITS_PER_INT = 31;
    public static final ComposableInvoker INSTANCE = null;
    private static final int SLOTS_PER_INT = 10;

    static {
        INSTANCE = new ComposableInvoker();
    }

    private ComposableInvoker() {
    }

    private final boolean areParameterTypesCompatible(Class<?>[] r17, Class<?>[] r18) {
        Class<?>[] r0 = r18;
        if (r17.length != r0.length) goto L28;
        Collection destination$iv$iv = new ArrayList(r17.length);
        int index$iv$iv = 0;
        int r9 = r17.length;
        int r10 = 0;
    L5:
        if (r10 >= r9) goto L14;
        Class<?> r12 = r17[r10];
        int index$iv$iv2 = index$iv$iv + 1;
        Class<?> r4 = r0[index$iv$iv];
        if (Intrinsics.areEqual(JvmClassMappingKt.getKotlinClass(r12), JvmClassMappingKt.getKotlinClass(r4)) == false) goto L9;
    L12:
        boolean r11 = true;
    L13:
        destination$iv$iv.add(Boolean.valueOf(r11));
        r10 = r10 + 1;
        r0 = r18;
        index$iv$iv = index$iv$iv2;
        goto L5
    L9:
        if (r12.isAssignableFrom(r4) == true) goto L12;
        r11 = false;
        goto L13
    L14:
        Iterable $this$all$iv = (List) destination$iv$iv;
        if (($this$all$iv instanceof Collection) == true) goto L17;
    L19:
        Iterator r3 = $this$all$iv.iterator();
    L21:
        if (r3.hasNext() == false) goto L25;
        Object element$iv = r3.next();
        boolean it = ((Boolean) element$iv).booleanValue();
        if (it == true) goto L21;
        boolean r1 = false;
    L26:
        if (r1 == false) goto L28;
        return true;
    L25:
        r1 = true;
        goto L26
    L17:
        if (((Collection) $this$all$iv).isEmpty() == false) goto L19;
        r1 = true;
    L28:
        return false;
    }

    private final Method findCompatibleComposeMethod(Method[] $this$findCompatibleComposeMethod, String methodName, Class<?>... r15) {
        int r2 = $this$findCompatibleComposeMethod.length;
        int r4 = 0;
    L3:
        Method r5 = null;
        if (r4 >= r2) goto L17;
        Method r6 = $this$findCompatibleComposeMethod[r4];
        if (Intrinsics.areEqual(methodName, r6.getName()) == true) goto L10;
        if (StringsKt.startsWith$default(r6.getName(), methodName + '-', false, 2, null) == true) goto L10;
    L12:
        boolean r7 = false;
    L13:
        if (r7 == true) goto L14;
        r4 = r4 + 1;
        goto L3
    L14:
        r5 = r6;
    L10:
        if (INSTANCE.areParameterTypesCompatible(r6.getParameterTypes(), (Class[]) Arrays.copyOf(r15, r15.length)) == false) goto L12;
        r7 = true;
    L17:
        if (r5 == null) goto L20;
        return r5;
    L20:
        throw new NoSuchMethodException(methodName + " not found");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final /* synthetic */ <T> T[] dup(T r12, int r13) {
        IntRange r2 = RangesKt.until(0, r13);
        ArrayList r4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(r2, 10));
        Iterator<Integer> r7 = r2.iterator();
    L4:
        if (r7.hasNext() == false) goto L6;
        int r8 = ((IntIterator) r7).nextInt();
        r4.add(r12);
        goto L4
    L6:
        Intrinsics.reifiedOperationMarker(0, "T?");
        return (T[]) r4.toArray(new Object[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Method findComposableMethod(Class<?> r19, String methodName, Object... previewParamArgs) {
        Collection destination$iv$iv = new ArrayList();
        int r9 = previewParamArgs.length;
        int r11 = 0;
    L3:
        Object it$iv$iv = null;
        if (r11 >= r9) goto L11;
        Object element$iv$iv$iv = previewParamArgs[r11];
        if (element$iv$iv$iv == null) goto L8;
        it$iv$iv = element$iv$iv$iv.getClass();
    L8:
        if (it$iv$iv == null) goto L10;
        destination$iv$iv.add(it$iv$iv);
    L10:
        r11 = r11 + 1;
        goto L3
    L11:
        Collection $this$toTypedArray$iv = (List) destination$iv$iv;
        Class[] argsArray = (Class[]) $this$toTypedArray$iv.toArray(new Class[0]);
        int changedParamsCount = changedParamCount(argsArray.length, 0);     // Catch: ReflectiveOperationException -> L18
        Class r4 = Integer.TYPE;     // Catch: ReflectiveOperationException -> L18
        Iterable $this$map$iv$iv = RangesKt.until(0, changedParamsCount);     // Catch: ReflectiveOperationException -> L18
        Collection destination$iv$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv$iv, 10));     // Catch: ReflectiveOperationException -> L18
        Iterator<Integer> r14 = $this$map$iv$iv.iterator();     // Catch: ReflectiveOperationException -> L18
    L14:
        if (r14.hasNext() == false) goto L16;
        int r15 = ((IntIterator) r14).nextInt();     // Catch: ReflectiveOperationException -> L18
        destination$iv$iv$iv.add(r4);     // Catch: ReflectiveOperationException -> L18
        goto L14
    L16:
        Collection $this$toTypedArray$iv$iv = (List) destination$iv$iv$iv;     // Catch: ReflectiveOperationException -> L18
        Class[] changedParams = (Class[]) $this$toTypedArray$iv$iv.toArray(new Class[0]);     // Catch: ReflectiveOperationException -> L18
        Method[] r5 = r19.getDeclaredMethods();     // Catch: ReflectiveOperationException -> L18
        SpreadBuilder r6 = new SpreadBuilder(3);     // Catch: ReflectiveOperationException -> L18
        r6.addSpread(argsArray);     // Catch: ReflectiveOperationException -> L18
        r6.add(Composer.class);     // Catch: ReflectiveOperationException -> L18
        r6.addSpread(changedParams);     // Catch: ReflectiveOperationException -> L18
        return findCompatibleComposeMethod(r5, methodName, (Class[]) r6.toArray(new Class[r6.size()]));
    L35:
        Method[] r0 = r19.getDeclaredMethods();     // Catch: ReflectiveOperationException -> L32
        int r7 = r0.length;     // Catch: ReflectiveOperationException -> L32
        int r8 = 0;
    L21:
        if (r8 >= r7) goto L34;
        Method it = r0[r8];     // Catch: ReflectiveOperationException -> L32
        if (Intrinsics.areEqual(it.getName(), methodName) == true) goto L28;
        if (StringsKt.startsWith$default(it.getName(), methodName + '-', false, 2, null) == true) goto L28;
        boolean r12 = false;
    L29:
        if (r12 == true) goto L30;
        r8 = r8 + 1;
        goto L21
    L30:
        it$iv$iv = it;
    L28:
        r12 = true;
    L34:
        return it$iv$iv;
    }

    private final Object getDefaultValue(Class<?> r4) {
        String r0 = r4.getName();
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

    private final Object invokeComposableMethod(Method $this$invokeComposableMethod, Object instance, Composer composer, Object... args) {
        Class[] $this$indexOfLast$iv = $this$invokeComposableMethod.getParameterTypes();
        int composerIndex = -1;
        int r4 = $this$indexOfLast$iv.length - 1;
        if (r4 < 0) goto L10;
    L4:
        int index$iv = r4;
        r4 = r4 - 1;
        Class it = $this$indexOfLast$iv[index$iv];
        if (Intrinsics.areEqual(it, Composer.class) == true) goto L6;
        if (r4 >= 0) goto L4;
    L6:
        composerIndex = index$iv;
    L10:
        int realParams = composerIndex;
        if (instance == null) goto L13;
        int thisParams = 1;
    L14:
        int changedParams = changedParamCount(realParams, thisParams);
        int totalParamsWithoutDefaults = (realParams + 1) + changedParams;
        int totalParams = $this$invokeComposableMethod.getParameterTypes().length;
        if (totalParams == totalParamsWithoutDefaults) goto L17;
        boolean isDefault = true;
    L18:
        if (isDefault == false) goto L20;
        int defaultParams = defaultParamCount(realParams);
    L22:
        if ((((realParams + 1) + changedParams) + defaultParams) != totalParams) goto L24;
        boolean r12 = true;
    L25:
        if (r12 == false) goto L59;
        int changedStartIndex = composerIndex + 1;
        int defaultStartIndex = changedStartIndex + changedParams;
        Object[] arguments = new Object[totalParams];
        int r15 = 0;
    L27:
        if (r15 >= totalParams) goto L57;
        if (r15 < 0) goto L31;
        if (r15 >= realParams) goto L31;
        boolean r16 = true;
    L32:
        if (r16 == false) goto L39;
        if (r15 >= 0) goto L35;
    L37:
        Object r3 = INSTANCE.getDefaultValue($this$invokeComposableMethod.getParameterTypes()[r15]);
    L53:
        arguments[r15] = r3;
        r15 = r15 + 1;
        goto L27
    L35:
        if (r15 > ArraysKt.getLastIndex(args)) goto L37;
        r3 = args[r15];
        goto L53
    L39:
        if (r15 != composerIndex) goto L41;
        r3 = composer;
        goto L53
    L41:
        if (changedStartIndex > r15) goto L44;
        if (r15 >= defaultStartIndex) goto L44;
        boolean r0 = true;
    L45:
        if (r0 == false) goto L47;
        r3 = 0;
        goto L53
    L47:
        if (defaultStartIndex > r15) goto L50;
        if (r15 >= totalParams) goto L50;
        boolean r1 = true;
    L51:
        if (r1 == false) goto L55;
        r3 = 2097151;
        goto L53
    L55:
        throw new IllegalStateException("Unexpected index".toString());
    L50:
        r1 = false;
    L44:
        r0 = false;
    L31:
        r16 = false;
        goto L32
    L57:
        return $this$invokeComposableMethod.invoke(instance, Arrays.copyOf(arguments, arguments.length));
    L59:
        throw new IllegalStateException("params don't add up to total params".toString());
    L24:
        r12 = false;
        goto L25
    L20:
        defaultParams = 0;
        goto L22
    L17:
        isDefault = false;
        goto L18
    L13:
        thisParams = 0;
        goto L14
    }

    private final int changedParamCount(int realValueParams, int thisParams) {
        if (realValueParams != 0) goto L5;
        return 1;
    L5:
        int totalParams = realValueParams + thisParams;
        return (int) Math.ceil(((double) totalParams) / 10.0d);
    }

    private final int defaultParamCount(int realValueParams) {
        return (int) Math.ceil(((double) realValueParams) / 31.0d);
    }

    public final void invokeComposable(String className, String methodName, Composer composer, Object... args) {
        Class<?> r2 = Class.forName(className);     // Catch: Exception -> L12
        Method method = findComposableMethod(r2, methodName, Arrays.copyOf(args, args.length));     // Catch: Exception -> L12
        if (method == null) goto L11;
        method.setAccessible(true);     // Catch: Exception -> L12
        if (Modifier.isStatic(method.getModifiers()) == false) goto L8;
        invokeComposableMethod(method, null, composer, Arrays.copyOf(args, args.length));     // Catch: Exception -> L12
        return;
    L8:
        Object instance = r2.getConstructor(new Class[0]).newInstance(new Object[0]);     // Catch: Exception -> L12
        invokeComposableMethod(method, instance, composer, Arrays.copyOf(args, args.length));     // Catch: Exception -> L12
        return;
    L11:
        throw new NoSuchMethodException("Composable " + className + '.' + methodName + " not found");     // Catch: Exception -> L12
    L12:
        e = move-exception;
        PreviewLogger.Companion.logWarning$ui_tooling_release$default(PreviewLogger.Companion, "Failed to invoke Composable Method '" + className + '.' + methodName + '\'', null, 2, null);
        throw e;
    }
}
