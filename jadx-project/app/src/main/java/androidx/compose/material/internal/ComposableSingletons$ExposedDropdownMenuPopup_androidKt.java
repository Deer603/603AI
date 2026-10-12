package androidx.compose.material.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ExposedDropdownMenuPopup.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class ComposableSingletons$ExposedDropdownMenuPopup_androidKt {
    public static final ComposableSingletons$ExposedDropdownMenuPopup_androidKt INSTANCE = null;

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f22lambda1;

    public ComposableSingletons$ExposedDropdownMenuPopup_androidKt() {
    }

    /* JADX INFO: renamed from: getLambda-1$material_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1848getLambda1$material_release() {
        return f22lambda1;
    }

    static {
        INSTANCE = new ComposableSingletons$ExposedDropdownMenuPopup_androidKt();
        f22lambda1 = ComposableLambdaKt.composableLambdaInstance(-1578637197, false, ComposableSingletons$ExposedDropdownMenuPopup_androidKt$lambda1$1.INSTANCE);
    }
}
