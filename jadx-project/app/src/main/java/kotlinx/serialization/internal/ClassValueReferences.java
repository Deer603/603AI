package kotlinx.serialization.internal;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0014J-\u0010\t\u001a\u00028\u00002\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\b2\u000e\b\u0004\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0012\u0010\u000e\u001a\u00020\u000f2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"Lkotlinx/serialization/internal/ClassValueReferences;", "T", "Ljava/lang/ClassValue;", "Lkotlinx/serialization/internal/MutableSoftReference;", "<init>", "()V", "computeValue", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Ljava/lang/Class;", "getOrSet", "key", "factory", "Lkotlin/Function0;", "(Ljava/lang/Class;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isStored", "", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ClassValueReferences<T> extends ClassValue<MutableSoftReference<T>> {
    @Override // java.lang.ClassValue
    public /* bridge */ /* synthetic */ Object computeValue(Class p0) {
        return computeValue(p0);
    }

    public ClassValueReferences() {
    }

    @Override // java.lang.ClassValue
    protected MutableSoftReference<T> computeValue(Class<?> r2) {
        Intrinsics.checkNotNullParameter(r2, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        return new MutableSoftReference();
    }

    public final T getOrSet(Class<?> r5, final Function0<? extends T> r6) {
        Intrinsics.checkNotNullParameter(r5, "key");
        Intrinsics.checkNotNullParameter(r6, "factory");
        T r1 = get(r5);
        Intrinsics.checkNotNullExpressionValue(r1, "get(...)");
        MutableSoftReference r2 = (MutableSoftReference) r1;
        T r3 = r2.reference.get();
        if (r3 == null) goto L7;
        return r3;
    L7:
        return (T) r2.getOrSetWithLock(new AnonymousClass2(r6));
    }

    public final boolean isStored(Class<?> r3) {
        Intrinsics.checkNotNullParameter(r3, "key");
        if (((MutableSoftReference) get(r3)).reference.get() == null) goto L5;
        return true;
    L5:
        return false;
    }
}
