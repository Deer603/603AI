package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: BackdropScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class ComposableSingletons$BackdropScaffoldKt {
    public static final ComposableSingletons$BackdropScaffoldKt INSTANCE = null;

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    private static Function3<SnackbarHostState, Composer, Integer, Unit> f7lambda1;

    public ComposableSingletons$BackdropScaffoldKt() {
    }

    /* JADX INFO: renamed from: getLambda-1$material_release, reason: not valid java name */
    public final Function3<SnackbarHostState, Composer, Integer, Unit> m1623getLambda1$material_release() {
        return f7lambda1;
    }

    static {
        INSTANCE = new ComposableSingletons$BackdropScaffoldKt();
        f7lambda1 = ComposableLambdaKt.composableLambdaInstance(-1054097158, false, ComposableSingletons$BackdropScaffoldKt$lambda1$1.INSTANCE);
    }
}
