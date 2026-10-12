package androidx.compose.foundation.text.input;

import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextFieldCharSequence.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0000*\u0018\b\u0000\u0010\u0007\"\b\u0012\u0004\u0012\u00020\t0\b2\b\u0012\u0004\u0012\u00020\t0\b¨\u0006\n"}, d2 = {"getSelectedText", "", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "getTextAfterSelection", "maxChars", "", "getTextBeforeSelection", "PlacedAnnotation", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextFieldCharSequenceKt {
    public static final CharSequence getTextBeforeSelection(TextFieldCharSequence $this$getTextBeforeSelection, int maxChars) {
        return $this$getTextBeforeSelection.subSequence(Math.max(0, TextRange.m6415getMinimpl($this$getTextBeforeSelection.m1188getSelectiond9O1mEE()) - maxChars), TextRange.m6415getMinimpl($this$getTextBeforeSelection.m1188getSelectiond9O1mEE()));
    }

    public static final CharSequence getTextAfterSelection(TextFieldCharSequence $this$getTextAfterSelection, int maxChars) {
        return $this$getTextAfterSelection.subSequence(TextRange.m6414getMaximpl($this$getTextAfterSelection.m1188getSelectiond9O1mEE()), Math.min(TextRange.m6414getMaximpl($this$getTextAfterSelection.m1188getSelectiond9O1mEE()) + maxChars, $this$getTextAfterSelection.length()));
    }

    public static final CharSequence getSelectedText(TextFieldCharSequence $this$getSelectedText) {
        return $this$getSelectedText.subSequence(TextRange.m6415getMinimpl($this$getSelectedText.m1188getSelectiond9O1mEE()), TextRange.m6414getMaximpl($this$getSelectedText.m1188getSelectiond9O1mEE()));
    }
}
