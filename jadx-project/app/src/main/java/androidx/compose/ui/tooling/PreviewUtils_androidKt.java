package androidx.compose.ui.tooling;

import androidx.compose.ui.tooling.data.Group;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: PreviewUtils.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a4\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002\u001a3\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0014\u0010\u000b\u001a\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\r\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\u0010\u0010\u001a\u0014\u0010\u0011\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0002\u001a\u001a\u0010\u0013\u001a\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\r\u0018\u00010\f*\u00020\u0014H\u0000\u001a&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005H\u0000\u001a\"\u0010\u0016\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005H\u0000\u001a)\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t*\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00182\u0006\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, d2 = {"findGroupsThatMatchPredicate", "", "Landroidx/compose/ui/tooling/data/Group;", "root", "predicate", "Lkotlin/Function1;", "", "findOnlyFirst", "getPreviewProviderParameters", "", "", "parameterProviderClass", "Ljava/lang/Class;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "parameterProviderIndex", "", "(Ljava/lang/Class;I)[Ljava/lang/Object;", "unwrapIfInline", "classToCheck", "asPreviewProviderClass", "", "findAll", "firstOrNull", "toArray", "Lkotlin/sequences/Sequence;", "size", "(Lkotlin/sequences/Sequence;I)[Ljava/lang/Object;", "ui-tooling_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PreviewUtils_androidKt {
    public static final Class<? extends PreviewParameterProvider<?>> asPreviewProviderClass(String $this$asPreviewProviderClass) {
        Class r1 = Class.forName($this$asPreviewProviderClass);     // Catch: ClassNotFoundException -> L7
        if ((r1 instanceof Class) == true) goto L6;
        return null;
    L6:
        return r1;
    L7:
        e = move-exception;
        PreviewLogger.Companion.logError$ui_tooling_release("Unable to find PreviewProvider '" + $this$asPreviewProviderClass + '\'', e);
        return null;
    }

    public static final Object[] getPreviewProviderParameters(Class<? extends PreviewParameterProvider<?>> r13, int parameterProviderIndex) {
        if (r13 == null) goto L37;
        Constructor<?>[] r1 = r13.getConstructors();     // Catch: KotlinReflectionNotSupportedError -> L33
        Constructor<?> r3 = null;
        boolean found$iv = false;
        int r5 = r1.length;     // Catch: KotlinReflectionNotSupportedError -> L33
        int r6 = 0;
    L6:
        if (r6 >= r5) goto L16;
        Constructor<?> r9 = r1[r6];     // Catch: KotlinReflectionNotSupportedError -> L33
        if (r9.getParameterTypes().length != 0) goto L10;
        boolean r12 = true;
    L11:
        if (r12 == false) goto L15;
        if (found$iv == true) goto L13;
        r3 = r9;
        found$iv = true;
        goto L15
    L13:
        r3 = null;
    L20:
        if (r3 == null) goto L32;
        r3.setAccessible(true);     // Catch: KotlinReflectionNotSupportedError -> L33
        Object r2 = r3.newInstance(new Object[0]);     // Catch: KotlinReflectionNotSupportedError -> L33
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type androidx.compose.ui.tooling.preview.PreviewParameterProvider<*>");     // Catch: KotlinReflectionNotSupportedError -> L33
        PreviewParameterProvider params = (PreviewParameterProvider) r2;     // Catch: KotlinReflectionNotSupportedError -> L33
        if (parameterProviderIndex < 0) goto L24;
        Iterable $this$map$iv = CollectionsKt.listOf(SequencesKt.elementAt(params.getValues(), parameterProviderIndex));     // Catch: KotlinReflectionNotSupportedError -> L33
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));     // Catch: KotlinReflectionNotSupportedError -> L33
        Iterator r8 = $this$map$iv.iterator();     // Catch: KotlinReflectionNotSupportedError -> L33
    L27:
        if (r8.hasNext() == false) goto L29;
        Object item$iv$iv = r8.next();     // Catch: KotlinReflectionNotSupportedError -> L33
        destination$iv$iv.add(unwrapIfInline(item$iv$iv));     // Catch: KotlinReflectionNotSupportedError -> L33
        goto L27
    L29:
        Collection $this$toTypedArray$iv = (List) destination$iv$iv;     // Catch: KotlinReflectionNotSupportedError -> L33
        return $this$toTypedArray$iv.toArray(new Object[0]);
    L24:
        return toArray(params.getValues(), params.getCount());
    L32:
        throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");     // Catch: KotlinReflectionNotSupportedError -> L33
    L15:
        r6 = r6 + 1;     // Catch: KotlinReflectionNotSupportedError -> L33
        goto L6
    L10:
        r12 = false;
        goto L11
    L16:
        if (found$iv == true) goto L20;
        r3 = null;
        goto L20
    L35:
        throw new IllegalStateException("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
    L37:
        return new Object[0];
    }

    private static final Object unwrapIfInline(Object classToCheck) {
        if (classToCheck == null) goto L21;
        Object[] $this$any$iv = classToCheck.getClass().getAnnotations();
        int r2 = $this$any$iv.length;
        int r3 = 0;
        int r4 = 0;
    L5:
        if (r4 >= r2) goto L10;
        Object element$iv = $this$any$iv[r4];
        if ((element$iv instanceof JvmInline) == true) goto L8;
        r4 = r4 + 1;
        goto L5
    L8:
        boolean r0 = true;
    L11:
        if (r0 == false) goto L21;
        Field[] r1 = classToCheck.getClass().getDeclaredFields();
        int r5 = r1.length;
    L13:
        if (r3 >= r5) goto L20;
        Field r6 = r1[r3];
        if (r6.getType().isPrimitive() == true) goto L16;
        r3 = r3 + 1;
        goto L13
    L16:
        String fieldName = r6.getName();
        Field it = classToCheck.getClass().getDeclaredField(fieldName);
        it.setAccessible(true);
        return it.get(classToCheck);
    L20:
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    L10:
        r0 = false;
    L21:
        return classToCheck;
    }

    public static final Group firstOrNull(Group $this$firstOrNull, Function1<? super Group, Boolean> r2) {
        return (Group) CollectionsKt.firstOrNull(findGroupsThatMatchPredicate($this$firstOrNull, r2, true));
    }

    public static final List<Group> findAll(Group $this$findAll, Function1<? super Group, Boolean> r4) {
        return findGroupsThatMatchPredicate$default($this$findAll, r4, false, 4, null);
    }

    static /* synthetic */ List findGroupsThatMatchPredicate$default(Group r0, Function1 r1, boolean r2, int r3, Object r4) {
        if ((r3 & 4) == 0) goto L6;
        r2 = false;
    L6:
        return findGroupsThatMatchPredicate(r0, r1, r2);
    }

    private static final List<Group> findGroupsThatMatchPredicate(Group root, Function1<? super Group, Boolean> r5, boolean findOnlyFirst) {
        List result = new ArrayList();
        List stack = CollectionsKt.mutableListOf(new Group[]{root});
    L4:
        if (stack.isEmpty() == true) goto L12;
        Group current = (Group) CollectionsKt.removeLast(stack);
        if (r5.invoke(current).booleanValue() == false) goto L11;
        if (findOnlyFirst == true) goto L9;
        result.add(current);
        goto L11
    L9:
        return CollectionsKt.listOf(current);
    L11:
        stack.addAll(current.getChildren());
        goto L4
    L12:
        return result;
    }

    private static final Object[] toArray(Sequence<? extends Object> r4, int size) {
        Iterator<? extends Object> r0 = r4.iterator();
        Object[] r1 = new Object[size];
        int r2 = 0;
    L3:
        if (r2 >= size) goto L5;
        r1[r2] = r0.next();
        r2 = r2 + 1;
        goto L3
    L5:
        return r1;
    }
}
