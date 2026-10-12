package androidx.compose.runtime.reflect;

import androidx.compose.runtime.Composer;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: ComposableMethod.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0014\u001a\u00020\u0003J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\bH\u0016J:\u0010\u0019\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u001d\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u0001H\u0086\u0002¢\u0006\u0002\u0010\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Landroidx/compose/runtime/reflect/ComposableMethod;", "", "method", "Ljava/lang/reflect/Method;", "composableInfo", "Landroidx/compose/runtime/reflect/ComposableInfo;", "(Ljava/lang/reflect/Method;Landroidx/compose/runtime/reflect/ComposableInfo;)V", "parameterCount", "", "getParameterCount", "()I", "parameterTypes", "", "Ljava/lang/Class;", "getParameterTypes", "()[Ljava/lang/Class;", "parameters", "Ljava/lang/reflect/Parameter;", "getParameters", "()[Ljava/lang/reflect/Parameter;", "asMethod", "equals", "", "other", "hashCode", "invoke", "composer", "Landroidx/compose/runtime/Composer;", "instance", "args", "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ComposableMethod {
    public static final int $stable = 0;
    private final ComposableInfo composableInfo;
    private final Method method;

    static {
        $stable = 8;
    }

    public ComposableMethod(Method method, ComposableInfo composableInfo) {
        this.method = method;
        this.composableInfo = composableInfo;
    }

    public final Method asMethod() {
        return this.method;
    }

    public final int getParameterCount() {
        return this.composableInfo.getRealParamsCount();
    }

    public final Parameter[] getParameters() {
        return (Parameter[]) ArraysKt.copyOfRange(this.method.getParameters(), 0, this.composableInfo.getRealParamsCount());
    }

    public final Class<?>[] getParameterTypes() {
        return (Class[]) ArraysKt.copyOfRange(this.method.getParameterTypes(), 0, this.composableInfo.getRealParamsCount());
    }

    public final Object invoke(Composer composer, Object instance, Object... args) {
        ComposableInfo r2 = this.composableInfo;
        int realParamsCount = r2.component2();
        int changedParams = r2.component3();
        int defaultParams = r2.component4();
        int totalParams = this.method.getParameterTypes().length;
        int changedStartIndex = realParamsCount + 1;
        int defaultStartIndex = changedStartIndex + changedParams;
        Object[] r8 = new Integer[defaultParams];
        int r11 = 0;
    L3:
        if (r11 >= defaultParams) goto L23;
        int start = r11 * 31;
        int end = Math.min(start + 31, realParamsCount);
        Iterable $this$map$iv = RangesKt.until(start, end);
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        Iterator<Integer> r19 = $this$map$iv.iterator();
    L6:
        if (r19.hasNext() == false) goto L15;
        int item$iv$iv = ((IntIterator) r19).nextInt();
        int defaultParams2 = defaultParams;
        if (item$iv$iv < args.length) goto L10;
    L13:
        int it = 1;
    L14:
        destination$iv$iv.add(Integer.valueOf(it));
        args = args;
        defaultParams = defaultParams2;
        goto L6
    L10:
        if (args[item$iv$iv] == null) goto L13;
        it = 0;
        goto L14
    L15:
        int defaultParams3 = defaultParams;
        Iterable useDefault = (List) destination$iv$iv;
        Iterable $this$foldIndexed$iv = useDefault;
        int index$iv = 0;
        int accumulator$iv = 0;
        Iterator r17 = $this$foldIndexed$iv.iterator();
    L17:
        if (r17.hasNext() == false) goto L22;
        Object element$iv = r17.next();
        int index$iv2 = index$iv + 1;
        if (index$iv >= 0) goto L21;
        CollectionsKt.throwIndexOverflow();
    L21:
        int mask = accumulator$iv;
        int i = mask | (((Number) element$iv).intValue() << index$iv);
        accumulator$iv = i;
        index$iv = index$iv2;
        goto L17
    L22:
        r8[r11] = Integer.valueOf(accumulator$iv);
        r11 = r11 + 1;
        defaultParams = defaultParams3;
        goto L3
    L23:
        Object[] arguments = new Object[totalParams];
        int r3 = 0;
    L24:
        if (r3 >= totalParams) goto L56;
        if (r3 < 0) goto L28;
        if (r3 >= realParamsCount) goto L28;
        boolean r9 = true;
    L29:
        if (r9 == false) goto L35;
        if (r3 >= 0) goto L32;
    L34:
        Object r10 = ComposableMethodKt.access$getDefaultValue(this.method.getParameterTypes()[r3]);
    L52:
        arguments[r3] = r10;
        r3 = r3 + 1;
        goto L24
    L32:
        if (r3 > ArraysKt.getLastIndex(args)) goto L34;
        r10 = args[r3];
        goto L52
    L35:
        if (r3 != realParamsCount) goto L37;
        r10 = composer;
        goto L52
    L37:
        if (r3 != changedStartIndex) goto L40;
        r10 = 0;
        goto L52
    L40:
        if ((changedStartIndex + 1) > r3) goto L43;
        if (r3 >= defaultStartIndex) goto L43;
        boolean r12 = true;
    L44:
        if (r12 == false) goto L46;
        r10 = 0;
        goto L52
    L46:
        if (defaultStartIndex > r3) goto L49;
        if (r3 >= totalParams) goto L49;
        boolean r13 = true;
    L50:
        if (r13 == false) goto L54;
        r10 = r8[r3 - defaultStartIndex];
        goto L52
    L54:
        throw new IllegalStateException("Unexpected index".toString());
    L49:
        r13 = false;
    L43:
        r12 = false;
    L28:
        r9 = false;
        goto L29
    L56:
        return this.method.invoke(instance, Arrays.copyOf(arguments, arguments.length));
    }

    public boolean equals(Object other) {
        if ((other instanceof ComposableMethod) == true) goto L7;
        return false;
    L7:
        return Intrinsics.areEqual(this.method, ((ComposableMethod) other).method);
    }

    public int hashCode() {
        return this.method.hashCode();
    }
}
