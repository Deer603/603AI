package androidx.compose.ui.tooling;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: PreviewActivity.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class ComposableSingletons$PreviewActivity_androidKt {
    public static final ComposableSingletons$PreviewActivity_androidKt INSTANCE = null;

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f83lambda1;

    public ComposableSingletons$PreviewActivity_androidKt() {
    }

    /* JADX INFO: renamed from: getLambda-1$ui_tooling_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6894getLambda1$ui_tooling_release() {
        return f83lambda1;
    }

    static {
        INSTANCE = new ComposableSingletons$PreviewActivity_androidKt();
        f83lambda1 = ComposableLambdaKt.composableLambdaInstance(-426398407, false, ComposableSingletons$PreviewActivity_androidKt$lambda1$1.INSTANCE);
    }
}
