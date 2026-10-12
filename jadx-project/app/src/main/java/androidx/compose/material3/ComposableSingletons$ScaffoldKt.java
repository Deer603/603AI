package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Scaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$ScaffoldKt {
    public static final ComposableSingletons$ScaffoldKt INSTANCE = null;

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f57lambda1;

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f58lambda2;

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f59lambda3;

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f60lambda4;

    public ComposableSingletons$ScaffoldKt() {
    }

    /* JADX INFO: renamed from: getLambda-1$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m2101getLambda1$material3_release() {
        return f57lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m2102getLambda2$material3_release() {
        return f58lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m2103getLambda3$material3_release() {
        return f59lambda3;
    }

    /* JADX INFO: renamed from: getLambda-4$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m2104getLambda4$material3_release() {
        return f60lambda4;
    }

    static {
        INSTANCE = new ComposableSingletons$ScaffoldKt();
        f57lambda1 = ComposableLambdaKt.composableLambdaInstance(1519764251, false, ComposableSingletons$ScaffoldKt$lambda1$1.INSTANCE);
        f58lambda2 = ComposableLambdaKt.composableLambdaInstance(836907051, false, ComposableSingletons$ScaffoldKt$lambda2$1.INSTANCE);
        f59lambda3 = ComposableLambdaKt.composableLambdaInstance(-297736342, false, ComposableSingletons$ScaffoldKt$lambda3$1.INSTANCE);
        f60lambda4 = ComposableLambdaKt.composableLambdaInstance(1545895435, false, ComposableSingletons$ScaffoldKt$lambda4$1.INSTANCE);
    }
}
