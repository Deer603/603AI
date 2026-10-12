package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$SnackbarHostKt {
    public static final ComposableSingletons$SnackbarHostKt INSTANCE = null;

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Function3<SnackbarData, Composer, Integer, Unit> f64lambda1;

    public ComposableSingletons$SnackbarHostKt() {
    }

    /* JADX INFO: renamed from: getLambda-1$material3_release, reason: not valid java name */
    public final Function3<SnackbarData, Composer, Integer, Unit> m2108getLambda1$material3_release() {
        return f64lambda1;
    }

    static {
        INSTANCE = new ComposableSingletons$SnackbarHostKt();
        f64lambda1 = ComposableLambdaKt.composableLambdaInstance(818736383, false, ComposableSingletons$SnackbarHostKt$lambda1$1.INSTANCE);
    }
}
