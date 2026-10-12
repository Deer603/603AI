package androidx.compose.ui.text.android;

import android.os.Build;
import android.text.StaticLayout;
import kotlin.Metadata;

/* JADX INFO: compiled from: StaticLayoutFactory.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactory23;", "Landroidx/compose/ui/text/android/StaticLayoutFactoryImpl;", "()V", "create", "Landroid/text/StaticLayout;", "params", "Landroidx/compose/ui/text/android/StaticLayoutParams;", "isFallbackLineSpacingEnabled", "", "layout", "useFallbackLineSpacing", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class StaticLayoutFactory23 implements StaticLayoutFactoryImpl {
    public StaticLayoutFactory23() {
    }

    @Override // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    public StaticLayout create(StaticLayoutParams params) {
        StaticLayout.Builder $this$create_u24lambda_u240 = StaticLayout.Builder.obtain(params.getText(), params.getStart(), params.getEnd(), params.getPaint(), params.getWidth());
        $this$create_u24lambda_u240.setTextDirection(params.getTextDir());
        $this$create_u24lambda_u240.setAlignment(params.getAlignment());
        $this$create_u24lambda_u240.setMaxLines(params.getMaxLines());
        $this$create_u24lambda_u240.setEllipsize(params.getEllipsize());
        $this$create_u24lambda_u240.setEllipsizedWidth(params.getEllipsizedWidth());
        $this$create_u24lambda_u240.setLineSpacing(params.getLineSpacingExtra(), params.getLineSpacingMultiplier());
        $this$create_u24lambda_u240.setIncludePad(params.getIncludePadding());
        $this$create_u24lambda_u240.setBreakStrategy(params.getBreakStrategy());
        $this$create_u24lambda_u240.setHyphenationFrequency(params.getHyphenationFrequency());
        $this$create_u24lambda_u240.setIndents(params.getLeftIndents(), params.getRightIndents());
        StaticLayoutFactory26.setJustificationMode($this$create_u24lambda_u240, params.getJustificationMode());
        if (Build.VERSION.SDK_INT < 28) goto L6;
        StaticLayoutFactory28.setUseLineSpacingFromFallbacks($this$create_u24lambda_u240, params.getUseFallbackLineSpacing());
    L6:
        if (Build.VERSION.SDK_INT < 33) goto L9;
        StaticLayoutFactory33.setLineBreakConfig($this$create_u24lambda_u240, params.getLineBreakStyle(), params.getLineBreakWordStyle());
    L9:
        if (Build.VERSION.SDK_INT < 35) goto L12;
        StaticLayoutFactory35.disableUseBoundsForWidth($this$create_u24lambda_u240);
    L12:
        return $this$create_u24lambda_u240.build();
    }

    @Override // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    public boolean isFallbackLineSpacingEnabled(StaticLayout layout, boolean useFallbackLineSpacing) {
        if (Build.VERSION.SDK_INT < 33) goto L6;
        return StaticLayoutFactory33.isFallbackLineSpacingEnabled(layout);
    L6:
        if (Build.VERSION.SDK_INT >= 28) goto L11;
        return false;
    L11:
        return useFallbackLineSpacing;
    }
}
