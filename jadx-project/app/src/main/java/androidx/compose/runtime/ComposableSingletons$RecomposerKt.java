package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class ComposableSingletons$RecomposerKt {
    public static final ComposableSingletons$RecomposerKt INSTANCE = null;

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f77lambda1;

    public ComposableSingletons$RecomposerKt() {
    }

    /* JADX INFO: renamed from: getLambda-1$runtime_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m3746getLambda1$runtime_release() {
        return f77lambda1;
    }

    static {
        INSTANCE = new ComposableSingletons$RecomposerKt();
        f77lambda1 = ComposableLambdaKt.composableLambdaInstance(-1091980426, false, ComposableSingletons$RecomposerKt$lambda1$1.INSTANCE);
    }
}
