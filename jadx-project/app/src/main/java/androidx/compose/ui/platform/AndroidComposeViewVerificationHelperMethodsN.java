package androidx.compose.ui.platform;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import androidx.compose.ui.input.pointer.AndroidPointerIcon;
import androidx.compose.ui.input.pointer.AndroidPointerIconType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewVerificationHelperMethodsN;", "", "()V", "setPointerIcon", "", "view", "Landroid/view/View;", "icon", "Landroidx/compose/ui/input/pointer/PointerIcon;", "toAndroidPointerIcon", "Landroid/view/PointerIcon;", "context", "Landroid/content/Context;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class AndroidComposeViewVerificationHelperMethodsN {
    public static final AndroidComposeViewVerificationHelperMethodsN INSTANCE = null;

    static {
        INSTANCE = new AndroidComposeViewVerificationHelperMethodsN();
    }

    private AndroidComposeViewVerificationHelperMethodsN() {
    }

    public final PointerIcon toAndroidPointerIcon(Context context, androidx.compose.ui.input.pointer.PointerIcon icon) {
        if ((icon instanceof AndroidPointerIcon) == false) goto L6;
        return ((AndroidPointerIcon) icon).getPointerIcon();
    L6:
        if ((icon instanceof AndroidPointerIconType) == false) goto L9;
        return PointerIcon.getSystemIcon(context, ((AndroidPointerIconType) icon).getType());
    L9:
        return PointerIcon.getSystemIcon(context, 1000);
    }

    public final void setPointerIcon(View view, androidx.compose.ui.input.pointer.PointerIcon icon) {
        PointerIcon iconToSet = toAndroidPointerIcon(view.getContext(), icon);
        if (Intrinsics.areEqual(view.getPointerIcon(), iconToSet) == true) goto L6;
        view.setPointerIcon(iconToSet);
        return;
    }
}
