package androidx.compose.material;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class ComposableSingletons$AppBarKt {
    public static final ComposableSingletons$AppBarKt INSTANCE = null;

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f5lambda1;

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f6lambda2;

    public ComposableSingletons$AppBarKt() {
    }

    /* JADX INFO: renamed from: getLambda-1$material_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m1621getLambda1$material_release() {
        return f5lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$material_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m1622getLambda2$material_release() {
        return f6lambda2;
    }

    static {
        INSTANCE = new ComposableSingletons$AppBarKt();
        f5lambda1 = ComposableLambdaKt.composableLambdaInstance(-636475396, false, ComposableSingletons$AppBarKt$lambda1$1.INSTANCE);
        f6lambda2 = ComposableLambdaKt.composableLambdaInstance(-771938130, false, ComposableSingletons$AppBarKt$lambda2$1.INSTANCE);
    }
}
