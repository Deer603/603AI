package androidx.compose.ui.text.platform.style;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.ui.graphics.AndroidPathEffect_androidKt;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DrawStyleSpan.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/platform/style/DrawStyleSpan;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "(Landroidx/compose/ui/graphics/drawscope/DrawStyle;)V", "getDrawStyle", "()Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "updateDrawState", "", "textPaint", "Landroid/text/TextPaint;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DrawStyleSpan extends CharacterStyle implements UpdateAppearance {
    public static final int $stable = 0;
    private final DrawStyle drawStyle;

    static {
        $stable = 8;
    }

    public DrawStyleSpan(DrawStyle drawStyle) {
        this.drawStyle = drawStyle;
    }

    public final DrawStyle getDrawStyle() {
        return this.drawStyle;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        if (textPaint == null) goto L14;
        DrawStyle r2 = this.drawStyle;
        if (Intrinsics.areEqual(r2, Fill.INSTANCE) == false) goto L7;
        textPaint.setStyle(Paint.Style.FILL);
        return;
    L7:
        if ((r2 instanceof Stroke) == false) goto L17;
        textPaint.setStyle(Paint.Style.STROKE);
        textPaint.setStrokeWidth(((Stroke) this.drawStyle).getWidth());
        textPaint.setStrokeMiter(((Stroke) this.drawStyle).getMiter());
        textPaint.setStrokeJoin(DrawStyleSpan_androidKt.m6704toAndroidJoinWw9F2mQ(((Stroke) this.drawStyle).m4987getJoinLxFBmk8()));
        textPaint.setStrokeCap(DrawStyleSpan_androidKt.m6703toAndroidCapBeK7IIE(((Stroke) this.drawStyle).m4986getCapKaPHkGw()));
        PathEffect r3 = ((Stroke) this.drawStyle).getPathEffect();
        if (r3 == null) goto L11;
        android.graphics.PathEffect r4 = AndroidPathEffect_androidKt.asAndroidPathEffect(r3);
    L12:
        textPaint.setPathEffect(r4);
        return;
    L11:
        r4 = null;
        goto L12
    L17:
        return;
    }
}
