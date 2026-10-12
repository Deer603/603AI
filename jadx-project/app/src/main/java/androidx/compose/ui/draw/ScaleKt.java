package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: Scale.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0000\u001a\u00020\u0002H\u0007\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007¨\u0006\u0005"}, d2 = {"scale", "Landroidx/compose/ui/Modifier;", "", "scaleX", "scaleY", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ScaleKt {
    public static final Modifier scale(Modifier $this$scale, float scaleX, float scaleY) {
        boolean r2 = true;
        if (scaleX != 1.0f) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == false) goto L15;
        if (scaleY == 1.0f) goto L11;
        r2 = false;
    L11:
        if (r2 == false) goto L15;
        return $this$scale;
    L15:
        return GraphicsLayerModifierKt.m4526graphicsLayerAp8cVGQ$default($this$scale, scaleX, scaleY, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, null, false, null, 0, 0, 0, 131068, null);
    L5:
        r1 = false;
        goto L6
    }

    public static final Modifier scale(Modifier $this$scale, float scale) {
        return scale($this$scale, scale, scale);
    }
}
