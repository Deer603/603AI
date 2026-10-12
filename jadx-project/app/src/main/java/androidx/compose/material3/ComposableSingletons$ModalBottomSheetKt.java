package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ModalBottomSheet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$ModalBottomSheetKt {
    public static final ComposableSingletons$ModalBottomSheetKt INSTANCE = null;

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f53lambda1;

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f54lambda2;

    public ComposableSingletons$ModalBottomSheetKt() {
    }

    /* JADX INFO: renamed from: getLambda-1$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m2097getLambda1$material3_release() {
        return f53lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m2098getLambda2$material3_release() {
        return f54lambda2;
    }

    static {
        INSTANCE = new ComposableSingletons$ModalBottomSheetKt();
        f53lambda1 = ComposableLambdaKt.composableLambdaInstance(-1524796689, false, ComposableSingletons$ModalBottomSheetKt$lambda1$1.INSTANCE);
        f54lambda2 = ComposableLambdaKt.composableLambdaInstance(2066864887, false, ComposableSingletons$ModalBottomSheetKt$lambda2$1.INSTANCE);
    }
}
