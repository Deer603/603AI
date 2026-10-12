package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$TimePickerKt {
    public static final ComposableSingletons$TimePickerKt INSTANCE = null;

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f73lambda1;

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f74lambda2;

    public ComposableSingletons$TimePickerKt() {
    }

    /* JADX INFO: renamed from: getLambda-1$material3_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m2117getLambda1$material3_release() {
        return f73lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$material3_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m2118getLambda2$material3_release() {
        return f74lambda2;
    }

    static {
        INSTANCE = new ComposableSingletons$TimePickerKt();
        f73lambda1 = ComposableLambdaKt.composableLambdaInstance(1425358052, false, ComposableSingletons$TimePickerKt$lambda1$1.INSTANCE);
        f74lambda2 = ComposableLambdaKt.composableLambdaInstance(-1179219109, false, ComposableSingletons$TimePickerKt$lambda2$1.INSTANCE);
    }
}
