package androidx.compose.ui.text.input;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.text.TextRange;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.emoji2.text.EmojiCompat;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextInputServiceAndroid.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0000\u001a\u001c\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a\f\u0010\u0011\u001a\u00020\u000b*\u00020\fH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"DEBUG_CLASS", "", "hasFlag", "", "bits", "", "flag", "asExecutor", "Ljava/util/concurrent/Executor;", "Landroid/view/Choreographer;", "update", "", "Landroid/view/inputmethod/EditorInfo;", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "updateWithEmojiCompat", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextInputServiceAndroid_androidKt {
    private static final String DEBUG_CLASS = "TextInputServiceAndroid";

    public static final /* synthetic */ void access$updateWithEmojiCompat(EditorInfo $receiver) {
        updateWithEmojiCompat($receiver);
    }

    private static final void updateWithEmojiCompat(EditorInfo $this$updateWithEmojiCompat) {
        if (EmojiCompat.isConfigured() == true) goto L5;
        return;
    L5:
        EmojiCompat.get().updateEditorInfo($this$updateWithEmojiCompat);
    }

    public static final void update(EditorInfo $this$update, ImeOptions imeOptions, TextFieldValue textFieldValue) {
        int r0 = imeOptions.m6612getImeActioneUduSuo();
        int r4 = 6;
        if (ImeAction.m6583equalsimpl0(r0, ImeAction.Companion.m6596getDefaulteUduSuo()) == false) goto L9;
        if (imeOptions.getSingleLine() == true) goto L28;
        r4 = 0;
    L28:
        $this$update.imeOptions = r4;
        PlatformImeOptions r1 = imeOptions.getPlatformImeOptions();
        if (r1 == null) goto L33;
        String it = r1.getPrivateImeOptions();
        if (it == null) goto L33;
        $this$update.privateImeOptions = it;
    L33:
        int r2 = imeOptions.m6613getKeyboardTypePjHm6EE();
        if (KeyboardType.m6636equalsimpl0(r2, KeyboardType.Companion.m6657getTextPjHm6EE()) == false) goto L37;
        $this$update.inputType = 1;
    L61:
        if (imeOptions.getSingleLine() == true) goto L68;
        if (hasFlag($this$update.inputType, 1) == false) goto L68;
        $this$update.inputType |= 131072;
        if (ImeAction.m6583equalsimpl0(imeOptions.m6612getImeActioneUduSuo(), ImeAction.Companion.m6596getDefaulteUduSuo()) == false) goto L68;
        $this$update.imeOptions |= 1073741824;
    L68:
        if (hasFlag($this$update.inputType, 1) == false) goto L81;
        int r3 = imeOptions.m6611getCapitalizationIUNYP9k();
        if (KeyboardCapitalization.m6619equalsimpl0(r3, KeyboardCapitalization.Companion.m6628getCharactersIUNYP9k()) == false) goto L73;
        $this$update.inputType |= 4096;
    L79:
        if (imeOptions.getAutoCorrect() == false) goto L81;
        $this$update.inputType |= 32768;
        goto L81
    L73:
        if (KeyboardCapitalization.m6619equalsimpl0(r3, KeyboardCapitalization.Companion.m6632getWordsIUNYP9k()) == false) goto L76;
        $this$update.inputType |= 8192;
        goto L79
    L76:
        if (KeyboardCapitalization.m6619equalsimpl0(r3, KeyboardCapitalization.Companion.m6630getSentencesIUNYP9k()) == false) goto L79;
        $this$update.inputType |= 16384;
    L81:
        $this$update.initialSelStart = TextRange.m6417getStartimpl(textFieldValue.m6665getSelectiond9O1mEE());
        $this$update.initialSelEnd = TextRange.m6412getEndimpl(textFieldValue.m6665getSelectiond9O1mEE());
        EditorInfoCompat.setInitialSurroundingText($this$update, textFieldValue.getText());
        $this$update.imeOptions |= 33554432;
        return;
    L37:
        if (KeyboardType.m6636equalsimpl0(r2, KeyboardType.Companion.m6650getAsciiPjHm6EE()) == false) goto L40;
        $this$update.inputType = 1;
        $this$update.imeOptions |= Integer.MIN_VALUE;
        goto L61
    L40:
        if (KeyboardType.m6636equalsimpl0(r2, KeyboardType.Companion.m6653getNumberPjHm6EE()) == false) goto L43;
        $this$update.inputType = 2;
        goto L61
    L43:
        if (KeyboardType.m6636equalsimpl0(r2, KeyboardType.Companion.m6656getPhonePjHm6EE()) == false) goto L46;
        $this$update.inputType = 3;
        goto L61
    L46:
        if (KeyboardType.m6636equalsimpl0(r2, KeyboardType.Companion.m6659getUriPjHm6EE()) == false) goto L49;
        $this$update.inputType = 17;
        goto L61
    L49:
        if (KeyboardType.m6636equalsimpl0(r2, KeyboardType.Companion.m6652getEmailPjHm6EE()) == false) goto L52;
        $this$update.inputType = 33;
        goto L61
    L52:
        if (KeyboardType.m6636equalsimpl0(r2, KeyboardType.Companion.m6655getPasswordPjHm6EE()) == false) goto L55;
        $this$update.inputType = 129;
        goto L61
    L55:
        if (KeyboardType.m6636equalsimpl0(r2, KeyboardType.Companion.m6654getNumberPasswordPjHm6EE()) == false) goto L58;
        $this$update.inputType = 18;
        goto L61
    L58:
        if (KeyboardType.m6636equalsimpl0(r2, KeyboardType.Companion.m6651getDecimalPjHm6EE()) == false) goto L84;
        $this$update.inputType = InputDeviceCompat.SOURCE_MOUSE;
        goto L61
    L84:
        throw new IllegalStateException("Invalid Keyboard Type".toString());
    L9:
        if (ImeAction.m6583equalsimpl0(r0, ImeAction.Companion.m6600getNoneeUduSuo()) == false) goto L12;
        r4 = 1;
        goto L28
    L12:
        if (ImeAction.m6583equalsimpl0(r0, ImeAction.Companion.m6598getGoeUduSuo()) == false) goto L15;
        r4 = 2;
        goto L28
    L15:
        if (ImeAction.m6583equalsimpl0(r0, ImeAction.Companion.m6599getNexteUduSuo()) == false) goto L18;
        r4 = 5;
        goto L28
    L18:
        if (ImeAction.m6583equalsimpl0(r0, ImeAction.Companion.m6601getPreviouseUduSuo()) == false) goto L21;
        r4 = 7;
        goto L28
    L21:
        if (ImeAction.m6583equalsimpl0(r0, ImeAction.Companion.m6602getSearcheUduSuo()) == false) goto L24;
        r4 = 3;
        goto L28
    L24:
        if (ImeAction.m6583equalsimpl0(r0, ImeAction.Companion.m6603getSendeUduSuo()) == false) goto L27;
        r4 = 4;
        goto L28
    L27:
        if (ImeAction.m6583equalsimpl0(r0, ImeAction.Companion.m6597getDoneeUduSuo()) == true) goto L28;
        throw new IllegalStateException("invalid ImeAction".toString());
    }

    public static final Executor asExecutor(final Choreographer $this$asExecutor) {
        return new TextInputServiceAndroid_androidKt$$ExternalSyntheticLambda1($this$asExecutor);
    }

    static final void asExecutor$lambda$2(Choreographer $this_asExecutor, final Runnable runnable) {
        $this_asExecutor.postFrameCallback(new TextInputServiceAndroid_androidKt$$ExternalSyntheticLambda0(runnable));
    }

    static final void asExecutor$lambda$2$lambda$1(Runnable $runnable, long it) {
        $runnable.run();
    }

    private static final boolean hasFlag(int bits, int flag) {
        if ((bits & flag) != flag) goto L5;
        return true;
    L5:
        return false;
    }
}
