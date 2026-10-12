package androidx.compose.foundation.text.input.internal;

import android.view.View;
import kotlin.Metadata;

/* JADX INFO: compiled from: ComposeInputMethodManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0013\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManagerImplApi34;", "Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManagerImplApi24;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "acceptStylusHandwritingDelegation", "", "prepareStylusHandwritingDelegation", "startStylusHandwriting", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
class ComposeInputMethodManagerImplApi34 extends ComposeInputMethodManagerImplApi24 {
    public ComposeInputMethodManagerImplApi34(View view) {
        super(view);
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManagerImpl, androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void startStylusHandwriting() {
        requireImm().startStylusHandwriting(getView());
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManagerImpl, androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void prepareStylusHandwritingDelegation() {
        requireImm().prepareStylusHandwritingDelegation(getView());
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManagerImpl, androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void acceptStylusHandwritingDelegation() {
        requireImm().acceptStylusHandwritingDelegation(getView());
    }
}
