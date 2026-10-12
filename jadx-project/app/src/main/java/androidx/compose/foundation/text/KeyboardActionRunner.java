package androidx.compose.foundation.text;

import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.input.ImeAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KeyboardActionRunner.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/text/KeyboardActionRunner;", "Landroidx/compose/foundation/text/KeyboardActionScope;", "keyboardController", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "(Landroidx/compose/ui/platform/SoftwareKeyboardController;)V", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "getFocusManager", "()Landroidx/compose/ui/focus/FocusManager;", "setFocusManager", "(Landroidx/compose/ui/focus/FocusManager;)V", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "getKeyboardActions", "()Landroidx/compose/foundation/text/KeyboardActions;", "setKeyboardActions", "(Landroidx/compose/foundation/text/KeyboardActions;)V", "defaultKeyboardAction", "", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "defaultKeyboardAction-KlQnJC8", "(I)V", "runAction", "runAction-KlQnJC8", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class KeyboardActionRunner implements KeyboardActionScope {
    public static final int $stable = 0;
    public FocusManager focusManager;
    public KeyboardActions keyboardActions;
    private final SoftwareKeyboardController keyboardController;

    static {
        $stable = 8;
    }

    public KeyboardActionRunner(SoftwareKeyboardController keyboardController) {
        this.keyboardController = keyboardController;
    }

    public final KeyboardActions getKeyboardActions() {
        KeyboardActions r0 = this.keyboardActions;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.throwUninitializedPropertyAccessException("keyboardActions");
        return null;
    }

    public final void setKeyboardActions(KeyboardActions r1) {
        this.keyboardActions = r1;
    }

    public final FocusManager getFocusManager() {
        FocusManager r0 = this.focusManager;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.throwUninitializedPropertyAccessException("focusManager");
        return null;
    }

    public final void setFocusManager(FocusManager r1) {
        this.focusManager = r1;
    }

    /* JADX INFO: renamed from: runAction-KlQnJC8, reason: not valid java name */
    public final void m1053runActionKlQnJC8(int imeAction) {
        Unit r1 = null;
        if (ImeAction.m6583equalsimpl0(imeAction, ImeAction.Companion.m6597getDoneeUduSuo()) == false) goto L6;
        Function1<KeyboardActionScope, Unit> r0 = getKeyboardActions().getOnDone();
    L27:
        if (r0 == null) goto L29;
        r0.invoke(this);
        r1 = Unit.INSTANCE;
    L29:
        if (r1 != null) goto L34;
        mo1052defaultKeyboardActionKlQnJC8(imeAction);
        return;
    L34:
        return;
    L6:
        if (ImeAction.m6583equalsimpl0(imeAction, ImeAction.Companion.m6598getGoeUduSuo()) == false) goto L9;
        r0 = getKeyboardActions().getOnGo();
        goto L27
    L9:
        if (ImeAction.m6583equalsimpl0(imeAction, ImeAction.Companion.m6599getNexteUduSuo()) == false) goto L12;
        r0 = getKeyboardActions().getOnNext();
        goto L27
    L12:
        if (ImeAction.m6583equalsimpl0(imeAction, ImeAction.Companion.m6601getPreviouseUduSuo()) == false) goto L15;
        r0 = getKeyboardActions().getOnPrevious();
        goto L27
    L15:
        if (ImeAction.m6583equalsimpl0(imeAction, ImeAction.Companion.m6602getSearcheUduSuo()) == false) goto L18;
        r0 = getKeyboardActions().getOnSearch();
        goto L27
    L18:
        if (ImeAction.m6583equalsimpl0(imeAction, ImeAction.Companion.m6603getSendeUduSuo()) == false) goto L21;
        r0 = getKeyboardActions().getOnSend();
        goto L27
    L21:
        if (ImeAction.m6583equalsimpl0(imeAction, ImeAction.Companion.m6596getDefaulteUduSuo()) == false) goto L23;
        boolean r2 = true;
    L24:
        if (r2 == false) goto L33;
        r0 = null;
        goto L27
    L33:
        throw new IllegalStateException("invalid ImeAction".toString());
    L23:
        r2 = ImeAction.m6583equalsimpl0(imeAction, ImeAction.Companion.m6600getNoneeUduSuo());
        goto L24
    }

    @Override // androidx.compose.foundation.text.KeyboardActionScope
    /* JADX INFO: renamed from: defaultKeyboardAction-KlQnJC8, reason: not valid java name */
    public void mo1052defaultKeyboardActionKlQnJC8(int imeAction) {
        if (ImeAction.m6583equalsimpl0(imeAction, ImeAction.Companion.m6599getNexteUduSuo()) == false) goto L6;
        getFocusManager().mo4022moveFocus3ESFkO8(FocusDirection.Companion.m4017getNextdhqQ8s());
        return;
    L6:
        if (ImeAction.m6583equalsimpl0(imeAction, ImeAction.Companion.m6601getPreviouseUduSuo()) == false) goto L9;
        getFocusManager().mo4022moveFocus3ESFkO8(FocusDirection.Companion.m4018getPreviousdhqQ8s());
        return;
    L9:
        if (ImeAction.m6583equalsimpl0(imeAction, ImeAction.Companion.m6597getDoneeUduSuo()) == false) goto L13;
        SoftwareKeyboardController r0 = this.keyboardController;
        if (r0 == null) goto L29;
        r0.hide();
        return;
    L29:
        return;
    L13:
        boolean r1 = true;
        if (ImeAction.m6583equalsimpl0(imeAction, ImeAction.Companion.m6598getGoeUduSuo()) == false) goto L16;
        boolean r2 = true;
    L17:
        if (r2 == false) goto L19;
        boolean r3 = true;
    L20:
        if (r3 == true) goto L23;
        r1 = ImeAction.m6583equalsimpl0(imeAction, ImeAction.Companion.m6596getDefaulteUduSuo());
    L23:
        if (r1 == true) goto L32;
        ImeAction.m6583equalsimpl0(imeAction, ImeAction.Companion.m6600getNoneeUduSuo());
        return;
    L32:
        return;
    L19:
        r3 = ImeAction.m6583equalsimpl0(imeAction, ImeAction.Companion.m6603getSendeUduSuo());
        goto L20
    L16:
        r2 = ImeAction.m6583equalsimpl0(imeAction, ImeAction.Companion.m6602getSearcheUduSuo());
        goto L17
    }
}
