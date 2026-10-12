package androidx.compose.ui.window;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AndroidPopup.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class ComposableSingletons$AndroidPopup_androidKt {
    public static final ComposableSingletons$AndroidPopup_androidKt INSTANCE = null;

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f86lambda1;

    public ComposableSingletons$AndroidPopup_androidKt() {
    }

    /* JADX INFO: renamed from: getLambda-1$ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7228getLambda1$ui_release() {
        return f86lambda1;
    }

    static {
        INSTANCE = new ComposableSingletons$AndroidPopup_androidKt();
        f86lambda1 = ComposableLambdaKt.composableLambdaInstance(-1131826196, false, ComposableSingletons$AndroidPopup_androidKt$lambda1$1.INSTANCE);
    }
}
