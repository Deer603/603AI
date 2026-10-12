package androidx.compose.ui.autofill;

import android.view.View;
import android.view.autofill.AutofillId;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.platform.coreshims.AutofillIdCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidAutofill.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/autofill/AndroidAutofill;", "Landroidx/compose/ui/autofill/Autofill;", "view", "Landroid/view/View;", "autofillTree", "Landroidx/compose/ui/autofill/AutofillTree;", "(Landroid/view/View;Landroidx/compose/ui/autofill/AutofillTree;)V", "autofillManager", "Landroid/view/autofill/AutofillManager;", "getAutofillManager", "()Landroid/view/autofill/AutofillManager;", "getAutofillTree", "()Landroidx/compose/ui/autofill/AutofillTree;", "rootAutofillId", "Landroid/view/autofill/AutofillId;", "getRootAutofillId", "()Landroid/view/autofill/AutofillId;", "setRootAutofillId", "(Landroid/view/autofill/AutofillId;)V", "getView", "()Landroid/view/View;", "cancelAutofillForNode", "", "autofillNode", "Landroidx/compose/ui/autofill/AutofillNode;", "requestAutofillForNode", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidAutofill implements Autofill {
    public static final int $stable = 0;
    private final android.view.autofill.AutofillManager autofillManager;
    private final AutofillTree autofillTree;
    private AutofillId rootAutofillId;
    private final View view;

    static {
        $stable = 8;
    }

    public AndroidAutofill(View view, AutofillTree autofillTree) {
        this.view = view;
        this.autofillTree = autofillTree;
        android.view.autofill.AutofillManager r0 = (android.view.autofill.AutofillManager) this.view.getContext().getSystemService(android.view.autofill.AutofillManager.class);
        if (r0 == null) goto L15;
        this.autofillManager = r0;
        this.view.setImportantForAutofill(1);
        AutofillIdCompat r1 = ViewCompatShims.getAutofillId(this.view);
        if (r1 == null) goto L7;
        AutofillId r2 = r1.toAutofillId();
    L9:
        if (r2 == null) goto L12;
        this.rootAutofillId = r2;
        return;
    L12:
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Required value was null.");
        throw new KotlinNothingValueException();
    L7:
        r2 = null;
        goto L9
    L15:
        throw new IllegalStateException("Autofill service could not be located.".toString());
    }

    public final View getView() {
        return this.view;
    }

    public final AutofillTree getAutofillTree() {
        return this.autofillTree;
    }

    public final android.view.autofill.AutofillManager getAutofillManager() {
        return this.autofillManager;
    }

    public final AutofillId getRootAutofillId() {
        return this.rootAutofillId;
    }

    public final void setRootAutofillId(AutofillId r1) {
        this.rootAutofillId = r1;
    }

    @Override // androidx.compose.ui.autofill.Autofill
    public void requestAutofillForNode(AutofillNode autofillNode) {
        Rect boundingBox = autofillNode.getBoundingBox();
        if (boundingBox == null) goto L7;
        android.view.autofill.AutofillManager r1 = this.autofillManager;
        View r2 = this.view;
        int r3 = autofillNode.getId();
        float $this$fastRoundToInt$iv = boundingBox.getLeft();
        int r5 = Math.round($this$fastRoundToInt$iv);
        float $this$fastRoundToInt$iv2 = boundingBox.getTop();
        int r6 = Math.round($this$fastRoundToInt$iv2);
        float $this$fastRoundToInt$iv3 = boundingBox.getRight();
        int r7 = Math.round($this$fastRoundToInt$iv3);
        float $this$fastRoundToInt$iv4 = boundingBox.getBottom();
        r1.notifyViewEntered(r2, r3, new android.graphics.Rect(r5, r6, r7, Math.round($this$fastRoundToInt$iv4)));
        return;
    L7:
        throw new IllegalStateException("requestAutofill called before onChildPositioned()".toString());
    }

    @Override // androidx.compose.ui.autofill.Autofill
    public void cancelAutofillForNode(AutofillNode autofillNode) {
        this.autofillManager.notifyViewExited(this.view, autofillNode.getId());
    }
}
