package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: CoreTextField.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class ComposableSingletons$CoreTextFieldKt {
    public static final ComposableSingletons$CoreTextFieldKt INSTANCE = null;

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    private static Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> f4lambda1;

    public ComposableSingletons$CoreTextFieldKt() {
    }

    /* JADX INFO: renamed from: getLambda-1$foundation_release, reason: not valid java name */
    public final Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> m1045getLambda1$foundation_release() {
        return f4lambda1;
    }

    static {
        INSTANCE = new ComposableSingletons$CoreTextFieldKt();
        f4lambda1 = ComposableLambdaKt.composableLambdaInstance(-813639903, false, ComposableSingletons$CoreTextFieldKt$lambda1$1.INSTANCE);
    }
}
