package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.SpanStyleKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: TextForegroundStyle.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001e\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001a\u0010\u000b\u001a\u00020\u0005*\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"lerp", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "start", "stop", "fraction", "", "modulate", "Landroidx/compose/ui/graphics/Color;", "alpha", "modulate-DxMtmZc", "(JF)J", "takeOrElse", "block", "Lkotlin/Function0;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextDrawStyleKt {
    public static final /* synthetic */ float access$takeOrElse(float $receiver, Function0 block) {
        return takeOrElse($receiver, block);
    }

    public static final TextForegroundStyle lerp(TextForegroundStyle start, TextForegroundStyle stop, float fraction) {
        if ((start instanceof BrushStyle) == true) goto L8;
        if ((stop instanceof BrushStyle) == true) goto L8;
        return TextForegroundStyle.Companion.m6856from8_81llA(ColorKt.m4417lerpjxsXWHM(start.mo6721getColor0d7_KjU(), stop.mo6721getColor0d7_KjU(), fraction));
    L8:
        if ((start instanceof BrushStyle) == false) goto L13;
        if ((stop instanceof BrushStyle) == false) goto L13;
        return TextForegroundStyle.Companion.from((Brush) SpanStyleKt.lerpDiscrete(((BrushStyle) start).getBrush(), ((BrushStyle) stop).getBrush(), fraction), MathHelpersKt.lerp(start.getAlpha(), stop.getAlpha(), fraction));
    L13:
        return (TextForegroundStyle) SpanStyleKt.lerpDiscrete(start, stop, fraction);
    }

    /* JADX INFO: renamed from: modulate-DxMtmZc, reason: not valid java name */
    public static final long m6855modulateDxMtmZc(long $this$modulate_u2dDxMtmZc, float alpha) {
        if (Float.isNaN(alpha) == true) goto L10;
        if (alpha >= 1.0f) goto L10;
        return Color.m4365copywmQWz5c$default($this$modulate_u2dDxMtmZc, Color.m4368getAlphaimpl($this$modulate_u2dDxMtmZc) * alpha, 0.0f, 0.0f, 0.0f, 14, null);
    L10:
        return $this$modulate_u2dDxMtmZc;
    }

    private static final float takeOrElse(float $this$takeOrElse, Function0<Float> r2) {
        if (Float.isNaN($this$takeOrElse) == false) goto L6;
        return r2.invoke().floatValue();
    L6:
        return $this$takeOrElse;
    }
}
