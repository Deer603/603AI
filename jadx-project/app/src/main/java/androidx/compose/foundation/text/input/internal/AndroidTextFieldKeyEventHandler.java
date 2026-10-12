package androidx.compose.foundation.text.input.internal;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.core.app.NotificationCompat;
import androidx.core.view.InputDeviceCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: TextFieldKeyEventHandler.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JX\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J:\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/text/input/internal/AndroidTextFieldKeyEventHandler;", "Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;", "()V", "onKeyEvent", "", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/key/KeyEvent;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textFieldSelectionState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "clipboardKeyCommandsHandler", "Landroidx/compose/foundation/text/input/internal/ClipboardKeyCommandsHandler;", "editable", "singleLine", "onSubmit", "Lkotlin/Function0;", "", "onKeyEvent-CJ9ybgU", "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Lkotlin/jvm/functions/Function1;ZZLkotlin/jvm/functions/Function0;)Z", "onPreKeyEvent", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "keyboardController", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "onPreKeyEvent-MyFupTE", "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/platform/SoftwareKeyboardController;)Z", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidTextFieldKeyEventHandler extends TextFieldKeyEventHandler {
    public static final int $stable = 0;

    static {
    }

    public AndroidTextFieldKeyEventHandler() {
    }

    @Override // androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler
    /* JADX INFO: renamed from: onPreKeyEvent-MyFupTE, reason: not valid java name */
    public boolean mo1215onPreKeyEventMyFupTE(KeyEvent event, TransformedTextFieldState textFieldState, TextFieldSelectionState textFieldSelectionState, FocusManager focusManager, SoftwareKeyboardController keyboardController) {
        if (super.mo1215onPreKeyEventMyFupTE(event, textFieldState, textFieldSelectionState, focusManager, keyboardController) == false) goto L5;
        return true;
    L5:
        InputDevice device = event.getDevice();
        if (device != null) goto L9;
        return false;
    L9:
        if (device.supportsSource(InputDeviceCompat.SOURCE_DPAD) == true) goto L12;
        return false;
    L12:
        if (device.isVirtual() == false) goto L15;
        return false;
    L15:
        if (KeyEventType.m5438equalsimpl0(KeyEvent_androidKt.m5446getTypeZmokQxo(event), KeyEventType.Companion.m5442getKeyDownCS__XNY()) == true) goto L18;
        return false;
    L18:
        if (event.getSource() != 257) goto L21;
        return false;
    L21:
        if (TextFieldKeyEventHandler_androidKt.m1287access$isKeyCodeYhN2O0w(event, 19) == false) goto L24;
        return focusManager.mo4022moveFocus3ESFkO8(FocusDirection.Companion.m4020getUpdhqQ8s());
    L24:
        if (TextFieldKeyEventHandler_androidKt.m1287access$isKeyCodeYhN2O0w(event, 20) == false) goto L27;
        return focusManager.mo4022moveFocus3ESFkO8(FocusDirection.Companion.m4013getDowndhqQ8s());
    L27:
        if (TextFieldKeyEventHandler_androidKt.m1287access$isKeyCodeYhN2O0w(event, 21) == false) goto L30;
        return focusManager.mo4022moveFocus3ESFkO8(FocusDirection.Companion.m4016getLeftdhqQ8s());
    L30:
        if (TextFieldKeyEventHandler_androidKt.m1287access$isKeyCodeYhN2O0w(event, 22) == false) goto L33;
        return focusManager.mo4022moveFocus3ESFkO8(FocusDirection.Companion.m4019getRightdhqQ8s());
    L33:
        if (TextFieldKeyEventHandler_androidKt.m1287access$isKeyCodeYhN2O0w(event, 23) == false) goto L36;
        keyboardController.show();
        return true;
    L36:
        return false;
    }

    @Override // androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler
    /* JADX INFO: renamed from: onKeyEvent-CJ9ybgU, reason: not valid java name */
    public boolean mo1214onKeyEventCJ9ybgU(KeyEvent event, TransformedTextFieldState textFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, Function1<? super KeyCommand, ? extends Unit> r7, boolean editable, boolean singleLine, Function0<Unit> r10) {
        if (KeyEventType.m5438equalsimpl0(KeyEvent_androidKt.m5446getTypeZmokQxo(event), KeyEventType.Companion.m5442getKeyDownCS__XNY()) == false) goto L10;
        if (event.isFromSource(InputDeviceCompat.SOURCE_KEYBOARD) == false) goto L10;
        if (TextFieldKeyEventHandler_androidKt.m1288isFromSoftKeyboardZmokQxo(event) == true) goto L10;
        textFieldSelectionState.setInTouchMode(false);
    L10:
        return super.mo1214onKeyEventCJ9ybgU(event, textFieldState, textLayoutState, textFieldSelectionState, r7, editable, singleLine, r10);
    }
}
