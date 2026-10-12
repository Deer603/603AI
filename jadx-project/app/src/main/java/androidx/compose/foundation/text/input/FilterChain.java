package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: InputTransformation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0002\u0010\u0004J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0013H\u0016J\f\u0010\u0014\u001a\u00020\u0012*\u00020\u0015H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/text/input/FilterChain;", "Landroidx/compose/foundation/text/input/InputTransformation;", "first", "second", "(Landroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/foundation/text/input/InputTransformation;)V", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "getKeyboardOptions", "()Landroidx/compose/foundation/text/KeyboardOptions;", "equals", "", "other", "", "hashCode", "", "toString", "", "applySemantics", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "transformInput", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class FilterChain implements InputTransformation {
    private final InputTransformation first;
    private final InputTransformation second;

    public FilterChain(InputTransformation first, InputTransformation second) {
        this.first = first;
        this.second = second;
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public KeyboardOptions getKeyboardOptions() {
        KeyboardOptions r0 = this.second.getKeyboardOptions();
        if (r0 == null) goto L7;
        KeyboardOptions r1 = r0.fillUnspecifiedValuesWith$foundation_release(this.first.getKeyboardOptions());
        if (r1 == null) goto L7;
        return r1;
    L7:
        return this.first.getKeyboardOptions();
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public void applySemantics(SemanticsPropertyReceiver $this$applySemantics) {
        InputTransformation $this$applySemantics_u24lambda_u240 = this.first;
        $this$applySemantics_u24lambda_u240.applySemantics($this$applySemantics);
        InputTransformation $this$applySemantics_u24lambda_u241 = this.second;
        $this$applySemantics_u24lambda_u241.applySemantics($this$applySemantics);
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public void transformInput(TextFieldBuffer $this$transformInput) {
        InputTransformation $this$transformInput_u24lambda_u242 = this.first;
        $this$transformInput_u24lambda_u242.transformInput($this$transformInput);
        InputTransformation $this$transformInput_u24lambda_u243 = this.second;
        $this$transformInput_u24lambda_u243.transformInput($this$transformInput);
    }

    public String toString() {
        return this.first + ".then(" + this.second + ')';
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if (other != null) goto L9;
        return false;
    L9:
        if (getClass() == other.getClass()) goto L11;
        return false;
    L11:
        FilterChain r2 = (FilterChain) other;
        if (Intrinsics.areEqual(this.first, ((FilterChain) other).first) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.areEqual(this.second, ((FilterChain) other).second) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.areEqual(getKeyboardOptions(), ((FilterChain) other).getKeyboardOptions()) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int result = this.first.hashCode();
        int result2 = (result * 31) + this.second.hashCode();
        int result3 = result2 * 32;
        KeyboardOptions r2 = getKeyboardOptions();
        if (r2 == null) goto L5;
        int r3 = r2.hashCode();
    L7:
        return result3 + r3;
    L5:
        r3 = 0;
        goto L7
    }
}
