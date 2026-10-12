package androidx.compose.ui.window;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AndroidDialog.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class ComposableSingletons$AndroidDialog_androidKt {
    public static final ComposableSingletons$AndroidDialog_androidKt INSTANCE = null;

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f85lambda1;

    public ComposableSingletons$AndroidDialog_androidKt() {
    }

    /* JADX INFO: renamed from: getLambda-1$ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7227getLambda1$ui_release() {
        return f85lambda1;
    }

    static {
        INSTANCE = new ComposableSingletons$AndroidDialog_androidKt();
        f85lambda1 = ComposableLambdaKt.composableLambdaInstance(210148896, false, ComposableSingletons$AndroidDialog_androidKt$lambda1$1.INSTANCE);
    }
}
