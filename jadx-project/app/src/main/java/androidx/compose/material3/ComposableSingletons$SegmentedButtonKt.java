package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SegmentedButton.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$SegmentedButtonKt {
    public static final ComposableSingletons$SegmentedButtonKt INSTANCE = null;

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f63lambda1;

    public ComposableSingletons$SegmentedButtonKt() {
    }

    /* JADX INFO: renamed from: getLambda-1$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m2107getLambda1$material3_release() {
        return f63lambda1;
    }

    static {
        INSTANCE = new ComposableSingletons$SegmentedButtonKt();
        f63lambda1 = ComposableLambdaKt.composableLambdaInstance(-860995255, false, ComposableSingletons$SegmentedButtonKt$lambda1$1.INSTANCE);
    }
}
