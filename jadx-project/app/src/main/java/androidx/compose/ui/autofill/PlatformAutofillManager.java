package androidx.compose.ui.autofill;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillValue;
import kotlin.Metadata;

/* JADX INFO: compiled from: PlatformAutofillManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J \u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J \u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH&J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J \u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H&J \u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/autofill/PlatformAutofillManager;", "", "cancel", "", "commit", "notifyValueChanged", "view", "Landroid/view/View;", "semanticsId", "", "autofillValue", "Landroid/view/autofill/AutofillValue;", "notifyViewEntered", "bounds", "Landroid/graphics/Rect;", "notifyViewExited", "notifyViewVisibilityChanged", "isVisible", "", "requestAutofill", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface PlatformAutofillManager {
    void cancel();

    void commit();

    void notifyValueChanged(View r1, int r2, AutofillValue r3);

    void notifyViewEntered(View r1, int r2, Rect r3);

    void notifyViewExited(View r1, int r2);

    void notifyViewVisibilityChanged(View r1, int r2, boolean r3);

    void requestAutofill(View r1, int r2, Rect r3);
}
