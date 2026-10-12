package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: BottomSheetScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$BottomSheetScaffoldKt {
    public static final ComposableSingletons$BottomSheetScaffoldKt INSTANCE = null;

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f41lambda1;

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static Function3<SnackbarHostState, Composer, Integer, Unit> f42lambda2;

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f43lambda3;

    public ComposableSingletons$BottomSheetScaffoldKt() {
    }

    /* JADX INFO: renamed from: getLambda-1$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m2085getLambda1$material3_release() {
        return f41lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$material3_release, reason: not valid java name */
    public final Function3<SnackbarHostState, Composer, Integer, Unit> m2086getLambda2$material3_release() {
        return f42lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m2087getLambda3$material3_release() {
        return f43lambda3;
    }

    static {
        INSTANCE = new ComposableSingletons$BottomSheetScaffoldKt();
        f41lambda1 = ComposableLambdaKt.composableLambdaInstance(-927355320, false, ComposableSingletons$BottomSheetScaffoldKt$lambda1$1.INSTANCE);
        f42lambda2 = ComposableLambdaKt.composableLambdaInstance(923568898, false, ComposableSingletons$BottomSheetScaffoldKt$lambda2$1.INSTANCE);
        f43lambda3 = ComposableLambdaKt.composableLambdaInstance(1800698411, false, ComposableSingletons$BottomSheetScaffoldKt$lambda3$1.INSTANCE);
    }
}
