package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TextMeasurer.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/CacheTextLayoutInput;", "", "textLayoutInput", "Landroidx/compose/ui/text/TextLayoutInput;", "(Landroidx/compose/ui/text/TextLayoutInput;)V", "getTextLayoutInput", "()Landroidx/compose/ui/text/TextLayoutInput;", "equals", "", "other", "hashCode", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CacheTextLayoutInput {
    public static final int $stable = 0;
    private final TextLayoutInput textLayoutInput;

    static {
    }

    public CacheTextLayoutInput(TextLayoutInput textLayoutInput) {
        this.textLayoutInput = textLayoutInput;
    }

    public final TextLayoutInput getTextLayoutInput() {
        return this.textLayoutInput;
    }

    public int hashCode() {
        TextLayoutInput $this$hashCode_u24lambda_u240 = this.textLayoutInput;
        int result = $this$hashCode_u24lambda_u240.getText().hashCode();
        int result2 = (result * 31) + $this$hashCode_u24lambda_u240.getStyle().hashCodeLayoutAffectingAttributes$ui_text_release();
        return (((((((((((((((result2 * 31) + $this$hashCode_u24lambda_u240.getPlaceholders().hashCode()) * 31) + $this$hashCode_u24lambda_u240.getMaxLines()) * 31) + Boolean.hashCode($this$hashCode_u24lambda_u240.getSoftWrap())) * 31) + TextOverflow.m6878hashCodeimpl($this$hashCode_u24lambda_u240.m6384getOverflowgIe3tQ8())) * 31) + $this$hashCode_u24lambda_u240.getDensity().hashCode()) * 31) + $this$hashCode_u24lambda_u240.getLayoutDirection().hashCode()) * 31) + $this$hashCode_u24lambda_u240.getFontFamilyResolver().hashCode()) * 31) + Constraints.m6929hashCodeimpl($this$hashCode_u24lambda_u240.m6383getConstraintsmsEJaDk());
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof CacheTextLayoutInput) == true) goto L8;
        return false;
    L8:
        TextLayoutInput $this$equals_u24lambda_u241 = this.textLayoutInput;
        if (Intrinsics.areEqual($this$equals_u24lambda_u241.getText(), ((CacheTextLayoutInput) other).textLayoutInput.getText()) == true) goto L12;
        return false;
    L12:
        if ($this$equals_u24lambda_u241.getStyle().hasSameLayoutAffectingAttributes(((CacheTextLayoutInput) other).textLayoutInput.getStyle()) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.areEqual($this$equals_u24lambda_u241.getPlaceholders(), ((CacheTextLayoutInput) other).textLayoutInput.getPlaceholders()) == true) goto L18;
        return false;
    L18:
        if ($this$equals_u24lambda_u241.getMaxLines() == ((CacheTextLayoutInput) other).textLayoutInput.getMaxLines()) goto L21;
        return false;
    L21:
        if ($this$equals_u24lambda_u241.getSoftWrap() == ((CacheTextLayoutInput) other).textLayoutInput.getSoftWrap()) goto L24;
        return false;
    L24:
        if (TextOverflow.m6877equalsimpl0($this$equals_u24lambda_u241.m6384getOverflowgIe3tQ8(), ((CacheTextLayoutInput) other).textLayoutInput.m6384getOverflowgIe3tQ8()) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.areEqual($this$equals_u24lambda_u241.getDensity(), ((CacheTextLayoutInput) other).textLayoutInput.getDensity()) == true) goto L30;
        return false;
    L30:
        if ($this$equals_u24lambda_u241.getLayoutDirection() == ((CacheTextLayoutInput) other).textLayoutInput.getLayoutDirection()) goto L33;
        return false;
    L33:
        if ($this$equals_u24lambda_u241.getFontFamilyResolver() == ((CacheTextLayoutInput) other).textLayoutInput.getFontFamilyResolver()) goto L36;
        return false;
    L36:
        if (Constraints.m6919equalsimpl0($this$equals_u24lambda_u241.m6383getConstraintsmsEJaDk(), ((CacheTextLayoutInput) other).textLayoutInput.m6383getConstraintsmsEJaDk()) == true) goto L39;
        return false;
    L39:
        return true;
    }
}
