package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ModalBottomSheet.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$ModalBottomSheet_androidKt {
    public static final ComposableSingletons$ModalBottomSheet_androidKt INSTANCE = null;

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f55lambda1;

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f56lambda2;

    public ComposableSingletons$ModalBottomSheet_androidKt() {
    }

    /* JADX INFO: renamed from: getLambda-1$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m2099getLambda1$material3_release() {
        return f55lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m2100getLambda2$material3_release() {
        return f56lambda2;
    }

    static {
        INSTANCE = new ComposableSingletons$ModalBottomSheet_androidKt();
        f55lambda1 = ComposableLambdaKt.composableLambdaInstance(-1187811352, false, ComposableSingletons$ModalBottomSheet_androidKt$lambda1$1.INSTANCE);
        f56lambda2 = ComposableLambdaKt.composableLambdaInstance(-91331245, false, ComposableSingletons$ModalBottomSheet_androidKt$lambda2$1.INSTANCE);
    }
}
