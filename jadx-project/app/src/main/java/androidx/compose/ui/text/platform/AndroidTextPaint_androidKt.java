package androidx.compose.ui.text.platform;

import android.text.TextPaint;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidTextPaint.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"setAlpha", "", "Landroid/text/TextPaint;", "alpha", "", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidTextPaint_androidKt {
    public static final void setAlpha(TextPaint $this$setAlpha, float alpha) {
        if (Float.isNaN(alpha) == true) goto L12;
        float $this$fastCoerceAtLeast$iv$iv = alpha;
        if ($this$fastCoerceAtLeast$iv$iv >= 0.0f) goto L8;
        $this$fastCoerceAtLeast$iv$iv = 0.0f;
    L8:
        if ($this$fastCoerceAtLeast$iv$iv <= 1.0f) goto L10;
        $this$fastCoerceAtLeast$iv$iv = 1.0f;
    L10:
        float $this$fastRoundToInt$iv = $this$fastCoerceAtLeast$iv$iv * 255.0f;
        int $i$f$fastRoundToInt = Math.round($this$fastRoundToInt$iv);
        $this$setAlpha.setAlpha($i$f$fastRoundToInt);
        return;
    }
}
