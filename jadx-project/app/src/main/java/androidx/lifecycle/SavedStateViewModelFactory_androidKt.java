package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SavedStateViewModelFactory.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u001aI\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00062\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\tH\u0000¢\u0006\u0002\u0010\n\u001a6\u0010\u000e\u001a\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00042\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\fH\u0000\"\u0018\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\fX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0018\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"newInstance", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "constructor", "Ljava/lang/reflect/Constructor;", "params", "", "", "(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/ViewModel;", "ANDROID_VIEWMODEL_SIGNATURE", "", "VIEWMODEL_SIGNATURE", "findMatchingConstructor", "signature", "lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SavedStateViewModelFactory_androidKt {
    private static final List<Class<?>> ANDROID_VIEWMODEL_SIGNATURE = null;
    private static final List<Class<?>> VIEWMODEL_SIGNATURE = null;

    public static final /* synthetic */ List access$getANDROID_VIEWMODEL_SIGNATURE$p() {
        return ANDROID_VIEWMODEL_SIGNATURE;
    }

    public static final /* synthetic */ List access$getVIEWMODEL_SIGNATURE$p() {
        return VIEWMODEL_SIGNATURE;
    }

    public static final <T extends ViewModel> T newInstance(Class<T> r4, Constructor<T> r5, Object... params) {
        Intrinsics.checkNotNullParameter(r4, "modelClass");
        Intrinsics.checkNotNullParameter(r5, "constructor");
        Intrinsics.checkNotNullParameter(params, "params");
        return r5.newInstance(Arrays.copyOf(params, params.length));
    L11:
        e = move-exception;
        throw new RuntimeException("Failed to access " + r4, e);
    L8:
        e = move-exception;
        throw new RuntimeException("A " + r4 + " cannot be instantiated.", e);
    L5:
        e = move-exception;
        throw new RuntimeException("An exception happened in constructor of " + r4, e.getCause());
    }

    static {
        ANDROID_VIEWMODEL_SIGNATURE = CollectionsKt.listOf(new Class[]{Application.class, SavedStateHandle.class});
        VIEWMODEL_SIGNATURE = CollectionsKt.listOf(SavedStateHandle.class);
    }

    public static final <T> Constructor<T> findMatchingConstructor(Class<T> r5, List<? extends Class<?>> r6) {
        Intrinsics.checkNotNullParameter(r5, "modelClass");
        Intrinsics.checkNotNullParameter(r6, "signature");
        Iterator r0 = ArrayIteratorKt.iterator(r5.getConstructors());
    L4:
        if (r0.hasNext() == false) goto L16;
        Constructor<T> r1 = (Constructor) r0.next();
        Class<?>[] r2 = r1.getParameterTypes();
        Intrinsics.checkNotNullExpressionValue(r2, "getParameterTypes(...)");
        List parameterTypes = ArraysKt.toList(r2);
        if (Intrinsics.areEqual(r6, parameterTypes) == true) goto L7;
        if (r6.size() != parameterTypes.size()) goto L4;
        if (parameterTypes.containsAll(r6) == false) goto L4;
        throw new UnsupportedOperationException("Class " + r5.getSimpleName() + " must have parameters in the proper order: " + r6);
    L7:
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactory_androidKt.findMatchingConstructor>");
        return r1;
    L16:
        return null;
    }
}
