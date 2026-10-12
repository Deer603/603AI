package androidx.compose.foundation;

import android.os.Build;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: PreferKeepClear.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0000\u001a\u00020\u00012\u0016\b\b\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0083\b\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0001\u001a\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\b"}, d2 = {"preferKeepClearT", "Landroidx/compose/ui/Modifier;", "rect", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Rect;", "preferKeepClear", "rectProvider", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PreferKeepClear_androidKt {
    public static final Modifier preferKeepClear(Modifier $this$preferKeepClear) {
        if (Build.VERSION.SDK_INT >= 33) goto L6;
        return $this$preferKeepClear;
    L6:
        return $this$preferKeepClear.then(new PreferKeepClearElement(null));
    }

    public static final Modifier preferKeepClear(Modifier $this$preferKeepClear, Function1<? super LayoutCoordinates, Rect> r3) {
        if (Build.VERSION.SDK_INT >= 33) goto L6;
        return $this$preferKeepClear;
    L6:
        return $this$preferKeepClear.then(new PreferKeepClearElement(r3));
    }

    private static final Modifier preferKeepClearT(Function1<? super LayoutCoordinates, Rect> r2) {
        return new PreferKeepClearElement(r2);
    }
}
