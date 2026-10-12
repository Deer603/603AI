package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SearchBar.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$SearchBar_androidKt {
    public static final ComposableSingletons$SearchBar_androidKt INSTANCE = null;

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f61lambda1;

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f62lambda2;

    public ComposableSingletons$SearchBar_androidKt() {
    }

    /* JADX INFO: renamed from: getLambda-1$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m2105getLambda1$material3_release() {
        return f61lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m2106getLambda2$material3_release() {
        return f62lambda2;
    }

    static {
        INSTANCE = new ComposableSingletons$SearchBar_androidKt();
        f61lambda1 = ComposableLambdaKt.composableLambdaInstance(159817819, false, ComposableSingletons$SearchBar_androidKt$lambda1$1.INSTANCE);
        f62lambda2 = ComposableLambdaKt.composableLambdaInstance(-480309201, false, ComposableSingletons$SearchBar_androidKt$lambda2$1.INSTANCE);
    }
}
