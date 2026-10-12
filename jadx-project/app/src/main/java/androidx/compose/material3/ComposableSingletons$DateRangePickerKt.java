package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: DateRangePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$DateRangePickerKt {
    public static final ComposableSingletons$DateRangePickerKt INSTANCE = null;

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f48lambda1;

    public ComposableSingletons$DateRangePickerKt() {
    }

    /* JADX INFO: renamed from: getLambda-1$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m2092getLambda1$material3_release() {
        return f48lambda1;
    }

    static {
        INSTANCE = new ComposableSingletons$DateRangePickerKt();
        f48lambda1 = ComposableLambdaKt.composableLambdaInstance(766806659, false, ComposableSingletons$DateRangePickerKt$lambda1$1.INSTANCE);
    }
}
