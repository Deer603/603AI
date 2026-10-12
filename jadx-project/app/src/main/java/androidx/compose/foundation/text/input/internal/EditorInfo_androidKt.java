package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;

/* JADX INFO: compiled from: EditorInfo.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a@\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"hasFlag", "", "bits", "", "flag", "update", "", "Landroid/view/inputmethod/EditorInfo;", "text", "", "selection", "Landroidx/compose/ui/text/TextRange;", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "contentMimeTypes", "", "", "update-pLxbY9I", "(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;JLandroidx/compose/ui/text/input/ImeOptions;[Ljava/lang/String;)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class EditorInfo_androidKt {
    /* JADX INFO: renamed from: update-pLxbY9I$default, reason: not valid java name */
    public static /* synthetic */ void m1229updatepLxbY9I$default(EditorInfo r6, CharSequence r7, long r8, ImeOptions r10, String[] r11, int r12, Object r13) {
        if ((r12 & 8) == 0) goto L5;
        String[] r5 = null;
    L6:
        m1228updatepLxbY9I(r6, r7, r8, r10, r5);
        return;
    L5:
        r5 = r11;
        goto L6
    }

    /* JADX INFO: renamed from: update-pLxbY9I, reason: not valid java name */
    public static final void m1228updatepLxbY9I(EditorInfo $this$update_u2dpLxbY9I, CharSequence text, long selection, ImeOptions imeOptions, String[] contentMimeTypes) {
        int r0 = imeOptions.m6612getImeActioneUduSuo();
        int r2 = 3;
        int r4 = 6;
        if (ImeAction.m6583equalsimpl0(r0, ImeAction.Companion.m6596getDefaulteUduSuo()) == false) goto L9;
        if (imeOptions.getSingleLine() == true) goto L28;
        r4 = 0;
    L28:
        $this$update_u2dpLxbY9I.imeOptions = r4;
        PlatformImeOptions r1 = imeOptions.getPlatformImeOptions();
        if (r1 == null) goto L33;
        String it = r1.getPrivateImeOptions();
        if (it == null) goto L33;
        $this$update_u2dpLxbY9I.privateImeOptions = it;
    L33:
        LocaleListHelper.INSTANCE.setHintLocales($this$update_u2dpLxbY9I, imeOptions.getHintLocales());
        int r3 = imeOptions.m6613getKeyboardTypePjHm6EE();
        if (KeyboardType.m6636equalsimpl0(r3, KeyboardType.Companion.m6657getTextPjHm6EE()) == false) goto L37;
        r2 = 1;
    L60:
        $this$update_u2dpLxbY9I.inputType = r2;
        if (imeOptions.getSingleLine() == true) goto L68;
        if (hasFlag($this$update_u2dpLxbY9I.inputType, 1) == false) goto L68;
        $this$update_u2dpLxbY9I.inputType |= 131072;
        if (ImeAction.m6583equalsimpl0(imeOptions.m6612getImeActioneUduSuo(), ImeAction.Companion.m6596getDefaulteUduSuo()) == false) goto L68;
        $this$update_u2dpLxbY9I.imeOptions |= 1073741824;
    L68:
        if (hasFlag($this$update_u2dpLxbY9I.inputType, 1) == false) goto L81;
        int r5 = imeOptions.m6611getCapitalizationIUNYP9k();
        if (KeyboardCapitalization.m6619equalsimpl0(r5, KeyboardCapitalization.Companion.m6628getCharactersIUNYP9k()) == false) goto L73;
        $this$update_u2dpLxbY9I.inputType |= 4096;
    L79:
        if (imeOptions.getAutoCorrect() == false) goto L81;
        $this$update_u2dpLxbY9I.inputType |= 32768;
        goto L81
    L73:
        if (KeyboardCapitalization.m6619equalsimpl0(r5, KeyboardCapitalization.Companion.m6632getWordsIUNYP9k()) == false) goto L76;
        $this$update_u2dpLxbY9I.inputType |= 8192;
        goto L79
    L76:
        if (KeyboardCapitalization.m6619equalsimpl0(r5, KeyboardCapitalization.Companion.m6630getSentencesIUNYP9k()) == false) goto L79;
        $this$update_u2dpLxbY9I.inputType |= 16384;
    L81:
        $this$update_u2dpLxbY9I.initialSelStart = TextRange.m6417getStartimpl(selection);
        $this$update_u2dpLxbY9I.initialSelEnd = TextRange.m6412getEndimpl(selection);
        EditorInfoCompat.setInitialSurroundingText($this$update_u2dpLxbY9I, text);
        if (contentMimeTypes == null) goto L84;
        EditorInfoCompat.setContentMimeTypes($this$update_u2dpLxbY9I, contentMimeTypes);
    L84:
        $this$update_u2dpLxbY9I.imeOptions |= 33554432;
        if (StylusHandwriting_androidKt.isStylusHandwritingSupported() == true) goto L87;
    L91:
        EditorInfoCompat.setStylusHandwritingEnabled($this$update_u2dpLxbY9I, false);
        return;
    L87:
        if (KeyboardType.m6636equalsimpl0(imeOptions.m6613getKeyboardTypePjHm6EE(), KeyboardType.Companion.m6655getPasswordPjHm6EE()) == true) goto L91;
        if (KeyboardType.m6636equalsimpl0(imeOptions.m6613getKeyboardTypePjHm6EE(), KeyboardType.Companion.m6654getNumberPasswordPjHm6EE()) == true) goto L91;
        EditorInfoCompat.setStylusHandwritingEnabled($this$update_u2dpLxbY9I, true);
        EditorInfoApi34.INSTANCE.setHandwritingGestures($this$update_u2dpLxbY9I);
        return;
    L37:
        if (KeyboardType.m6636equalsimpl0(r3, KeyboardType.Companion.m6650getAsciiPjHm6EE()) == false) goto L40;
        $this$update_u2dpLxbY9I.imeOptions |= Integer.MIN_VALUE;
        r2 = 1;
        goto L60
    L40:
        if (KeyboardType.m6636equalsimpl0(r3, KeyboardType.Companion.m6653getNumberPjHm6EE()) == false) goto L43;
        r2 = 2;
        goto L60
    L43:
        if (KeyboardType.m6636equalsimpl0(r3, KeyboardType.Companion.m6656getPhonePjHm6EE()) == true) goto L60;
        if (KeyboardType.m6636equalsimpl0(r3, KeyboardType.Companion.m6659getUriPjHm6EE()) == false) goto L49;
        r2 = 17;
        goto L60
    L49:
        if (KeyboardType.m6636equalsimpl0(r3, KeyboardType.Companion.m6652getEmailPjHm6EE()) == false) goto L52;
        r2 = 33;
        goto L60
    L52:
        if (KeyboardType.m6636equalsimpl0(r3, KeyboardType.Companion.m6655getPasswordPjHm6EE()) == false) goto L55;
        r2 = 129;
        goto L60
    L55:
        if (KeyboardType.m6636equalsimpl0(r3, KeyboardType.Companion.m6654getNumberPasswordPjHm6EE()) == false) goto L58;
        r2 = 18;
        goto L60
    L58:
        if (KeyboardType.m6636equalsimpl0(r3, KeyboardType.Companion.m6651getDecimalPjHm6EE()) == false) goto L94;
        r2 = InputDeviceCompat.SOURCE_MOUSE;
        goto L60
    L94:
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

    private static final boolean hasFlag(int bits, int flag) {
        if ((bits & flag) != flag) goto L5;
        return true;
    L5:
        return false;
    }
}
