package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import kotlin.Metadata;

/* JADX INFO: compiled from: PainterModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aF\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¨\u0006\u000e"}, d2 = {"paint", "Landroidx/compose/ui/Modifier;", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "sizeToIntrinsics", "", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PainterModifierKt {
    public static /* synthetic */ Modifier paint$default(Modifier r7, Painter r8, boolean r9, Alignment r10, ContentScale r11, float r12, ColorFilter r13, int r14, Object r15) {
        if ((r14 & 2) == 0) goto L5;
        boolean r2 = true;
    L7:
        if ((r14 & 4) == 0) goto L9;
        Alignment r3 = Alignment.Companion.getCenter();
    L11:
        if ((r14 & 8) == 0) goto L13;
        ContentScale r4 = ContentScale.Companion.getInside();
    L15:
        if ((r14 & 16) == 0) goto L17;
        float r5 = 1.0f;
    L19:
        if ((r14 & 32) == 0) goto L21;
        ColorFilter r6 = null;
    L23:
        return paint(r7, r8, r2, r3, r4, r5, r6);
    L21:
        r6 = r13;
        goto L23
    L17:
        r5 = r12;
        goto L19
    L13:
        r4 = r11;
        goto L15
    L9:
        r3 = r10;
        goto L11
    L5:
        r2 = r9;
        goto L7
    }

    public static final Modifier paint(Modifier $this$paint, Painter painter, boolean sizeToIntrinsics, Alignment alignment, ContentScale contentScale, float alpha, ColorFilter colorFilter) {
        return $this$paint.then(new PainterElement(painter, sizeToIntrinsics, alignment, contentScale, alpha, colorFilter));
    }
}
