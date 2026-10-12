package androidx.compose.material;

import android.view.View;
import androidx.compose.ui.unit.IntRect;
import kotlin.Metadata;

/* JADX INFO: compiled from: ExposedDropdownMenu.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/compose/material/WindowBoundsCalculator;", "", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "getVisibleWindowBounds", "Landroidx/compose/ui/unit/IntRect;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class WindowBoundsCalculator {
    public static final int $stable = 0;
    private final View view;

    static {
        $stable = 8;
    }

    public WindowBoundsCalculator(View view) {
        this.view = view;
    }

    public final IntRect getVisibleWindowBounds() {
        return ExposedDropdownMenu_android.access$getWindowBounds(this.view);
    }
}
