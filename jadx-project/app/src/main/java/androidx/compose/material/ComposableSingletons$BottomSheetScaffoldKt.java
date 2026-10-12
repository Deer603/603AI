package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: BottomSheetScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class ComposableSingletons$BottomSheetScaffoldKt {
    public static final ComposableSingletons$BottomSheetScaffoldKt INSTANCE = null;

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    private static Function3<SnackbarHostState, Composer, Integer, Unit> f8lambda1;

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9lambda2;

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f10lambda3;

    public ComposableSingletons$BottomSheetScaffoldKt() {
    }

    /* JADX INFO: renamed from: getLambda-1$material_release, reason: not valid java name */
    public final Function3<SnackbarHostState, Composer, Integer, Unit> m1624getLambda1$material_release() {
        return f8lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$material_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1625getLambda2$material_release() {
        return f9lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$material_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1626getLambda3$material_release() {
        return f10lambda3;
    }

    static {
        INSTANCE = new ComposableSingletons$BottomSheetScaffoldKt();
        f8lambda1 = ComposableLambdaKt.composableLambdaInstance(239945703, false, ComposableSingletons$BottomSheetScaffoldKt$lambda1$1.INSTANCE);
        f9lambda2 = ComposableLambdaKt.composableLambdaInstance(690018774, false, ComposableSingletons$BottomSheetScaffoldKt$lambda2$1.INSTANCE);
        f10lambda3 = ComposableLambdaKt.composableLambdaInstance(1054313561, false, ComposableSingletons$BottomSheetScaffoldKt$lambda3$1.INSTANCE);
    }
}
