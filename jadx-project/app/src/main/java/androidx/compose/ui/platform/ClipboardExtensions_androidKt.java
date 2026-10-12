package androidx.compose.ui.platform;

import android.net.Uri;
import kotlin.Metadata;

/* JADX INFO: compiled from: ClipboardExtensions.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¨\u0006\u0003"}, d2 = {"firstUriOrNull", "Landroid/net/Uri;", "Landroidx/compose/ui/platform/ClipEntry;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ClipboardExtensions_androidKt {
    public static final Uri firstUriOrNull(ClipEntry $this$firstUriOrNull) {
        int i = 0;
        int r1 = $this$firstUriOrNull.getClipData().getItemCount();
    L3:
        if (i >= r1) goto L8;
        Uri uri = $this$firstUriOrNull.getClipData().getItemAt(i).getUri();
        if (uri != null) goto L6;
        i = i + 1;
        goto L3
    L6:
        return uri;
    L8:
        return null;
    }
}
