package androidx.compose.ui;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: SensitiveContent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\n\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/SensitiveContentNode;", "Landroidx/compose/ui/Modifier$Node;", "_isContentSensitive", "", "(Z)V", "value", "isContentSensitive", "()Z", "setContentSensitive", "isCountedSensitive", "component1", "copy", "equals", "other", "", "hashCode", "", "onAttach", "", "onDetach", "toString", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class SensitiveContentNode extends Modifier.Node {
    private boolean _isContentSensitive;
    private boolean isContentSensitive;
    private boolean isCountedSensitive;

    private final boolean component1() {
        return this._isContentSensitive;
    }

    public static /* synthetic */ SensitiveContentNode copy$default(SensitiveContentNode r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0._isContentSensitive;
    L6:
        return r0.copy(r1);
    }

    public final SensitiveContentNode copy(boolean r2) {
        return new SensitiveContentNode(r2);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof SensitiveContentNode) == true) goto L9;
        return false;
    L9:
        if (this._isContentSensitive == ((SensitiveContentNode) r5)._isContentSensitive) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Boolean.hashCode(this._isContentSensitive);
    }

    public String toString() {
        return "SensitiveContentNode(_isContentSensitive=" + this._isContentSensitive + ')';
    }

    public SensitiveContentNode(boolean _isContentSensitive) {
        this._isContentSensitive = _isContentSensitive;
        this.isContentSensitive = this._isContentSensitive;
    }

    public final boolean isContentSensitive() {
        return this.isContentSensitive;
    }

    public final void setContentSensitive(boolean value) {
        this.isContentSensitive = value;
        if (this.isContentSensitive == false) goto L8;
        if (this.isCountedSensitive == true) goto L8;
        DelegatableNodeKt.requireOwner(this).incrementSensitiveComponentCount();
        this.isCountedSensitive = true;
        return;
    L8:
        if (this.isContentSensitive == false) goto L10;
        return;
    L10:
        if (this.isCountedSensitive == false) goto L15;
        DelegatableNodeKt.requireOwner(this).decrementSensitiveComponentCount();
        this.isCountedSensitive = false;
        return;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        if (this.isContentSensitive == false) goto L9;
        boolean value$iv = !this.isCountedSensitive;
        if (value$iv == true) goto L7;
        InlineClassHelperKt.throwIllegalStateException("invalid sensitive content state");
    L7:
        DelegatableNodeKt.requireOwner(this).incrementSensitiveComponentCount();
        this.isCountedSensitive = true;
        return;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        if (this.isCountedSensitive == false) goto L5;
        DelegatableNodeKt.requireOwner(this).decrementSensitiveComponentCount();
        this.isCountedSensitive = false;
    L5:
        super.onDetach();
    }
}
