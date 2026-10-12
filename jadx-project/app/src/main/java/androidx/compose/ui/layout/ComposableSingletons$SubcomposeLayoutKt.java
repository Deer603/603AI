package androidx.compose.ui.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SubcomposeLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class ComposableSingletons$SubcomposeLayoutKt {
    public static final ComposableSingletons$SubcomposeLayoutKt INSTANCE = null;

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f78lambda1;

    public ComposableSingletons$SubcomposeLayoutKt() {
    }

    /* JADX INFO: renamed from: getLambda-1$ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m5706getLambda1$ui_release() {
        return f78lambda1;
    }

    static {
        INSTANCE = new ComposableSingletons$SubcomposeLayoutKt();
        f78lambda1 = ComposableLambdaKt.composableLambdaInstance(-1741544742, false, ComposableSingletons$SubcomposeLayoutKt$lambda1$1.INSTANCE);
    }
}
