package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ListItem.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$ListItemKt {
    public static final ComposableSingletons$ListItemKt INSTANCE = null;

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f49lambda1;

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f50lambda2;

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f51lambda3;

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f52lambda4;

    public ComposableSingletons$ListItemKt() {
    }

    /* JADX INFO: renamed from: getLambda-1$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m2093getLambda1$material3_release() {
        return f49lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m2094getLambda2$material3_release() {
        return f50lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m2095getLambda3$material3_release() {
        return f51lambda3;
    }

    /* JADX INFO: renamed from: getLambda-4$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m2096getLambda4$material3_release() {
        return f52lambda4;
    }

    static {
        INSTANCE = new ComposableSingletons$ListItemKt();
        f49lambda1 = ComposableLambdaKt.composableLambdaInstance(-1792460413, false, ComposableSingletons$ListItemKt$lambda1$1.INSTANCE);
        f50lambda2 = ComposableLambdaKt.composableLambdaInstance(-1538071006, false, ComposableSingletons$ListItemKt$lambda2$1.INSTANCE);
        f51lambda3 = ComposableLambdaKt.composableLambdaInstance(-1283681599, false, ComposableSingletons$ListItemKt$lambda3$1.INSTANCE);
        f52lambda4 = ComposableLambdaKt.composableLambdaInstance(-1029292192, false, ComposableSingletons$ListItemKt$lambda4$1.INSTANCE);
    }
}
