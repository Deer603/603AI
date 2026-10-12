package androidx.compose.ui.platform;

import android.view.View;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewSensitiveContent35;", "", "()V", "setContentSensitivity", "", "view", "Landroid/view/View;", "isSensitiveContent", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class AndroidComposeViewSensitiveContent35 {
    public static final AndroidComposeViewSensitiveContent35 INSTANCE = null;

    static {
        INSTANCE = new AndroidComposeViewSensitiveContent35();
    }

    private AndroidComposeViewSensitiveContent35() {
    }

    public final void setContentSensitivity(View view, boolean isSensitiveContent) {
        if (isSensitiveContent == false) goto L4;
        view.setContentSensitivity(1);
        return;
    L4:
        view.setContentSensitivity(0);
    }
}
