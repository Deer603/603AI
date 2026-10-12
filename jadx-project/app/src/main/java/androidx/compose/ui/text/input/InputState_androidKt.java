package androidx.compose.ui.text.input;

import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: InputState.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toExtractedText", "Landroid/view/inputmethod/ExtractedText;", "Landroidx/compose/ui/text/input/TextFieldValue;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class InputState_androidKt {
    public static final ExtractedText toExtractedText(TextFieldValue r6) {
        ExtractedText r0 = new ExtractedText();
        r0.text = r6.getText();
        r0.startOffset = 0;
        r0.partialEndOffset = r6.getText().length();
        r0.partialStartOffset = -1;
        r0.selectionStart = TextRange.m6415getMinimpl(r6.m6665getSelectiond9O1mEE());
        r0.selectionEnd = TextRange.m6414getMaximpl(r6.m6665getSelectiond9O1mEE());
        r0.flags = !StringsKt.contains$default(r6.getText(), '\n', false, 2, null) ? 1 : 0;
        return r0;
    }
}
