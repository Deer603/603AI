package androidx.lifecycle.compose;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.lifecycle.LifecycleOwner;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LocalLifecycleOwner.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001d\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u000e\n\u0000\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LocalLifecycleOwner", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/lifecycle/LifecycleOwner;", "getLocalLifecycleOwner$annotations", "()V", "getLocalLifecycleOwner", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "lifecycle-runtime-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LocalLifecycleOwnerKt {
    private static final ProvidableCompositionLocal<LifecycleOwner> LocalLifecycleOwner = null;

    public static /* synthetic */ void getLocalLifecycleOwner$annotations() {
    }

    public static final ProvidableCompositionLocal<LifecycleOwner> getLocalLifecycleOwner() {
        return LocalLifecycleOwner;
    }

    static {
        Object r1 = null;
        Result.Companion r2 = Result.Companion;     // Catch: Throwable -> L18
        ClassLoader classLoader = LifecycleOwner.class.getClassLoader();     // Catch: Throwable -> L18
        Intrinsics.checkNotNull(classLoader);     // Catch: Throwable -> L18
        Method methodRef = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", new Class[0]);     // Catch: Throwable -> L18
        Object[] $this$any$iv = methodRef.getAnnotations();     // Catch: Throwable -> L18
        int r10 = $this$any$iv.length;     // Catch: Throwable -> L18
        int r11 = 0;
    L4:
        if (r11 >= r10) goto L9;
        Object element$iv = $this$any$iv[r11];     // Catch: Throwable -> L18
        if ((element$iv instanceof Deprecated) == true) goto L7;
        r11 = r11 + 1;     // Catch: Throwable -> L18
        goto L4
    L7:
        boolean r12 = true;
    L10:
        if (r12 == false) goto L12;
        ProvidableCompositionLocal r7 = null;
    L16:
        Object compositionLocalFromComposeUi = Result.m7425constructorimpl(r7);     // Catch: Throwable -> L18
    L21:
        if (Result.m7431isFailureimpl(compositionLocalFromComposeUi) == true) goto L24;
        r1 = compositionLocalFromComposeUi;
    L24:
        ProvidableCompositionLocal<LifecycleOwner> r3 = (ProvidableCompositionLocal) r1;
        if (r3 != null) goto L27;
        r3 = CompositionLocalKt.staticCompositionLocalOf(new LocalLifecycleOwnerKt$$ExternalSyntheticLambda0());
    L27:
        LocalLifecycleOwner = r3;
        return;
    L12:
        Object r8 = methodRef.invoke(null, new Object[0]);     // Catch: Throwable -> L18
        if ((r8 instanceof ProvidableCompositionLocal) == false) goto L15;
        r7 = (ProvidableCompositionLocal) r8;     // Catch: Throwable -> L18
        goto L16
    L15:
        r7 = null;
        goto L16
    L9:
        r12 = false;
    L18:
        th = move-exception;
        Result.Companion r4 = Result.Companion;
        compositionLocalFromComposeUi = Result.m7425constructorimpl(ResultKt.createFailure(th));
        goto L21
    }

    static final LifecycleOwner LocalLifecycleOwner$lambda$3$lambda$2() {
        throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present".toString());
    }
}
