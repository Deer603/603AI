package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class ComposableSingletons$SnackbarHostKt {
    public static final ComposableSingletons$SnackbarHostKt INSTANCE = null;

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    private static Function3<SnackbarData, Composer, Integer, Unit> f19lambda1;

    public ComposableSingletons$SnackbarHostKt() {
    }

    /* JADX INFO: renamed from: getLambda-1$material_release, reason: not valid java name */
    public final Function3<SnackbarData, Composer, Integer, Unit> m1635getLambda1$material_release() {
        return f19lambda1;
    }

    static {
        INSTANCE = new ComposableSingletons$SnackbarHostKt();
        f19lambda1 = ComposableLambdaKt.composableLambdaInstance(996639038, false, ComposableSingletons$SnackbarHostKt$lambda1$1.INSTANCE);
    }
}
