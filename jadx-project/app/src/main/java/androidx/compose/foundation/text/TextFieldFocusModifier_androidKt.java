package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.key.Key_androidKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextFieldFocusModifier.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001e\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"interceptDPadAndMoveFocus", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "isKeyCode", "", "Landroidx/compose/ui/input/key/KeyEvent;", "keyCode", "", "isKeyCode-YhN2O0w", "(Landroid/view/KeyEvent;I)Z", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextFieldFocusModifier_androidKt {
    /* JADX INFO: renamed from: access$isKeyCode-YhN2O0w, reason: not valid java name */
    public static final /* synthetic */ boolean m1144access$isKeyCodeYhN2O0w(KeyEvent $receiver, int keyCode) {
        return m1145isKeyCodeYhN2O0w($receiver, keyCode);
    }

    public static final Modifier interceptDPadAndMoveFocus(Modifier $this$interceptDPadAndMoveFocus, final LegacyTextFieldState state, final FocusManager focusManager) {
        return KeyInputModifierKt.onPreviewKeyEvent($this$interceptDPadAndMoveFocus, new AnonymousClass1(focusManager, state));
    }

    /* JADX INFO: renamed from: isKeyCode-YhN2O0w, reason: not valid java name */
    private static final boolean m1145isKeyCodeYhN2O0w(KeyEvent $this$isKeyCode_u2dYhN2O0w, int keyCode) {
        if (Key_androidKt.m5452getNativeKeyCodeYVgTNJs(KeyEvent_androidKt.m5445getKeyZmokQxo($this$isKeyCode_u2dYhN2O0w)) != keyCode) goto L5;
        return true;
    L5:
        return false;
    }
}
