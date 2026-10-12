package androidx.compose.ui.tooling;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ComposeViewAdapter.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class ComposableSingletons$ComposeViewAdapter_androidKt {
    public static final ComposableSingletons$ComposeViewAdapter_androidKt INSTANCE = null;

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f80lambda1;

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f81lambda2;

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f82lambda3;

    public ComposableSingletons$ComposeViewAdapter_androidKt() {
    }

    /* JADX INFO: renamed from: getLambda-1$ui_tooling_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6891getLambda1$ui_tooling_release() {
        return f80lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$ui_tooling_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6892getLambda2$ui_tooling_release() {
        return f81lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$ui_tooling_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6893getLambda3$ui_tooling_release() {
        return f82lambda3;
    }

    static {
        INSTANCE = new ComposableSingletons$ComposeViewAdapter_androidKt();
        f80lambda1 = ComposableLambdaKt.composableLambdaInstance(-1163195098, false, ComposableSingletons$ComposeViewAdapter_androidKt$lambda1$1.INSTANCE);
        f81lambda2 = ComposableLambdaKt.composableLambdaInstance(2086912010, false, ComposableSingletons$ComposeViewAdapter_androidKt$lambda2$1.INSTANCE);
        f82lambda3 = ComposableLambdaKt.composableLambdaInstance(290922684, false, ComposableSingletons$ComposeViewAdapter_androidKt$lambda3$1.INSTANCE);
    }
}
