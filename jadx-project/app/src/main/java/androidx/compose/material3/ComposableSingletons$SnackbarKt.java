package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Snackbar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$SnackbarKt {
    public static final ComposableSingletons$SnackbarKt INSTANCE = null;

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f65lambda1;

    public ComposableSingletons$SnackbarKt() {
    }

    /* JADX INFO: renamed from: getLambda-1$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m2109getLambda1$material3_release() {
        return f65lambda1;
    }

    static {
        INSTANCE = new ComposableSingletons$SnackbarKt();
        f65lambda1 = ComposableLambdaKt.composableLambdaInstance(-505750804, false, ComposableSingletons$SnackbarKt$lambda1$1.INSTANCE);
    }
}
