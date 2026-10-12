package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class ComposableSingletons$TabRowKt {
    public static final ComposableSingletons$TabRowKt INSTANCE = null;

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f20lambda1;

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f21lambda2;

    public ComposableSingletons$TabRowKt() {
    }

    /* JADX INFO: renamed from: getLambda-1$material_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1636getLambda1$material_release() {
        return f20lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$material_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1637getLambda2$material_release() {
        return f21lambda2;
    }

    static {
        INSTANCE = new ComposableSingletons$TabRowKt();
        f20lambda1 = ComposableLambdaKt.composableLambdaInstance(182187156, false, ComposableSingletons$TabRowKt$lambda1$1.INSTANCE);
        f21lambda2 = ComposableLambdaKt.composableLambdaInstance(-1480449365, false, ComposableSingletons$TabRowKt$lambda2$1.INSTANCE);
    }
}
