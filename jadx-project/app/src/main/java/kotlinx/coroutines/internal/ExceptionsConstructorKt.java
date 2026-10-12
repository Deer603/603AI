package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CopyableThrowable;

/* JADX INFO: compiled from: ExceptionsConstructor.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a2\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\u0002`\u0007\"\b\b\u0000\u0010\b*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\nH\u0002\u001a.\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\u0002`\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0002\u001a!\u0010\r\u001a\u0004\u0018\u0001H\b\"\b\b\u0000\u0010\b*\u00020\u00062\u0006\u0010\u000e\u001a\u0002H\bH\u0000¢\u0006\u0002\u0010\u000f\u001a\u001b\u0010\u0010\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\n2\b\b\u0002\u0010\u0011\u001a\u00020\u0003H\u0082\u0010\u001a\u0018\u0010\u0012\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0013\u001a\u00020\u0003H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000*(\b\u0002\u0010\u0014\"\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¨\u0006\u0015"}, d2 = {"ctorCache", "Lkotlinx/coroutines/internal/CtorCache;", "throwableFields", "", "createConstructor", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/Ctor;", "E", "clz", "Ljava/lang/Class;", "safeCtor", "block", "tryCopyException", "exception", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "fieldsCount", "accumulator", "fieldsCountOrDefault", "defaultValue", "Ctor", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ExceptionsConstructorKt {
    private static final CtorCache ctorCache = null;
    private static final int throwableFields = 0;

    public static final /* synthetic */ Function1 access$createConstructor(Class clz) {
        return createConstructor(clz);
    }

    static {
        throwableFields = fieldsCountOrDefault(Throwable.class, -1);
        if (FastServiceLoaderKt.getANDROID_DETECTED() == false) goto L6;
        ClassValueCtorCache r0 = WeakMapCtorCache.INSTANCE;     // Catch: Throwable -> L8
    L12:
    L10:
        ctorCache = r0;
        return;
    L6:
        r0 = ClassValueCtorCache.INSTANCE;     // Catch: Throwable -> L8
    L9:
        r0 = WeakMapCtorCache.INSTANCE;
        goto L10
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E extends Throwable> E tryCopyException(E r2) {
        if ((r2 instanceof CopyableThrowable) == false) goto L14;
        Result.Companion r0 = Result.Companion;     // Catch: Throwable -> L6
        Object r1 = Result.m7425constructorimpl(((CopyableThrowable) r2).createCopy());     // Catch: Throwable -> L6
    L9:
        if (Result.m7431isFailureimpl(r1) == false) goto L12;
        r1 = null;
    L12:
        return (E) r1;
    L6:
        th = move-exception;
        Result.Companion r3 = Result.Companion;
        r1 = Result.m7425constructorimpl(ResultKt.createFailure(th));
        goto L9
    L14:
        return (E) ctorCache.get(r2.getClass()).invoke(r2);
    }

    private static final <E extends Throwable> Function1<Throwable, Throwable> createConstructor(Class<E> r19) {
        Function1 nullResult = ExceptionsConstructorKt$createConstructor$nullResult$1.INSTANCE;
        int r2 = 0;
        if (throwableFields == fieldsCountOrDefault(r19, 0)) goto L5;
        return nullResult;
    L5:
        Constructor<?>[] r1 = r19.getConstructors();
        Collection destination$iv$iv = new ArrayList(r1.length);
        int r8 = r1.length;
        int r9 = 0;
    L6:
        Object maxElem$iv = null;
        if (r9 >= r8) goto L26;
        final Constructor<?> r11 = r1[r9];
        Class<?>[] r14 = r11.getParameterTypes();
        switch(r14.length) {
            case 0: goto L24;
            case 1: goto L17;
            case 2: goto L11;
            default: goto L10;
        };
    L10:
        int r18 = r2;
        Pair r3 = TuplesKt.to(null, -1);
    L25:
        destination$iv$iv.add(r3);
        r9 = r9 + 1;
        r2 = r18;
        goto L6
    L11:
        r18 = r2;
        if (Intrinsics.areEqual(r14[r2], String.class) == true) goto L14;
    L16:
        r3 = TuplesKt.to(null, -1);
        goto L25
    L14:
        if (Intrinsics.areEqual(r14[1], Throwable.class) == false) goto L16;
        r3 = TuplesKt.to(safeCtor(new ExceptionsConstructorKt$createConstructor$1$1(r11)), 3);
        goto L25
    L17:
        r18 = r2;
        Class<?> r4 = r14[r18];
        if (Intrinsics.areEqual(r4, String.class) == false) goto L21;
        r3 = TuplesKt.to(safeCtor(new ExceptionsConstructorKt$createConstructor$1$2(r11)), 2);
        goto L25
    L21:
        if (Intrinsics.areEqual(r4, Throwable.class) == false) goto L23;
        r3 = TuplesKt.to(safeCtor(new ExceptionsConstructorKt$createConstructor$1$3(r11)), 1);
        goto L25
    L23:
        r3 = TuplesKt.to(null, -1);
        goto L25
    L24:
        r18 = r2;
        r3 = TuplesKt.to(safeCtor(new ExceptionsConstructorKt$createConstructor$1$4(r11)), Integer.valueOf(r18));
        goto L25
    L26:
        Iterable $this$maxByOrNull$iv = (List) destination$iv$iv;
        Iterator iterator$iv = $this$maxByOrNull$iv.iterator();
        if (iterator$iv.hasNext() == false) goto L38;
        maxElem$iv = iterator$iv.next();
        if (iterator$iv.hasNext() == false) goto L38;
        Pair p0 = (Pair) maxElem$iv;
        int maxValue$iv = ((Number) p0.getSecond()).intValue();
    L33:
        Object e$iv = iterator$iv.next();
        Pair p1 = (Pair) e$iv;
        int v$iv = ((Number) p1.getSecond()).intValue();
        if (maxValue$iv >= v$iv) goto L37;
        maxValue$iv = v$iv;
        maxElem$iv = e$iv;
    L37:
        if (iterator$iv.hasNext() == true) goto L33;
    L38:
        Pair r10 = (Pair) maxElem$iv;
        if (r10 == null) goto L43;
        Function1<Throwable, Throwable> r5 = (Function1) r10.getFirst();
        if (r5 == null) goto L43;
        return r5;
    L43:
        return nullResult;
    }

    private static final Function1<Throwable, Throwable> safeCtor(final Function1<? super Throwable, ? extends Throwable> r1) {
        return new AnonymousClass1(r1);
    }

    private static final int fieldsCountOrDefault(Class<?> r5, int defaultValue) {
        JvmClassMappingKt.getKotlinClass(r5);
        Result.Companion r1 = Result.Companion;     // Catch: Throwable -> L5
        Object r0 = Result.m7425constructorimpl(Integer.valueOf(fieldsCount$default(r5, 0, 1, null)));     // Catch: Throwable -> L5
    L7:
        Integer r2 = Integer.valueOf(defaultValue);
        if (Result.m7431isFailureimpl(r0) == false) goto L11;
        r0 = r2;
    L11:
        return ((Number) r0).intValue();
    L5:
        th = move-exception;
        Result.Companion r3 = Result.Companion;
        r0 = Result.m7425constructorimpl(ResultKt.createFailure(th));
        goto L7
    }

    static /* synthetic */ int fieldsCount$default(Class r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        return fieldsCount(r0, r1);
    }

    private static final int fieldsCount(Class<?> r9, int accumulator) {
    L2:
        Field[] r0 = r9.getDeclaredFields();
        int count$iv = 0;
        int r3 = r0.length;
        int r4 = 0;
    L3:
        if (r4 >= r3) goto L8;
        if (Modifier.isStatic(r0[r4].getModifiers()) == true) goto L7;
        count$iv = count$iv + 1;
    L7:
        r4 = r4 + 1;
        goto L3
    L8:
        int totalFields = accumulator + count$iv;
        Class<? super Object> r1 = r9.getSuperclass();
        if (r1 == null) goto L10;
        r9 = r1;
        accumulator = totalFields;
        goto L2
    L10:
        return totalFields;
    }
}
