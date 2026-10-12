package androidx.compose.foundation.internal;

import android.content.ClipData;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* JADX INFO: compiled from: ClipboardUtils.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0007¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/internal/ClipboardUtils;", "", "()V", "hasText", "", "clipEntry", "Landroidx/compose/ui/platform/ClipEntry;", "readAnnotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "readText", "", "toClipEntry", "annotatedString", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ClipboardUtils {
    public static final int $stable = 0;
    public static final ClipboardUtils INSTANCE = null;

    static {
        INSTANCE = new ClipboardUtils();
    }

    private ClipboardUtils() {
    }

    @JvmStatic
    public static final String readText(ClipEntry clipEntry) {
        ClipData.Item r0 = clipEntry.getClipData().getItemAt(0);
        if (r0 == null) goto L7;
        CharSequence r1 = r0.getText();
        if (r1 == null) goto L7;
        return r1.toString();
    L7:
        return null;
    }

    @JvmStatic
    public static final AnnotatedString readAnnotatedString(ClipEntry clipEntry) {
        ClipData.Item r0 = clipEntry.getClipData().getItemAt(0);
        if (r0 == null) goto L7;
        CharSequence r1 = r0.getText();
        if (r1 == null) goto L7;
        return ClipboardUtils_androidKt.convertToAnnotatedString(r1);
    L7:
        return null;
    }

    @JvmStatic
    public static final ClipEntry toClipEntry(AnnotatedString annotatedString) {
        if (annotatedString != null) goto L6;
        return null;
    L6:
        return new ClipEntry(ClipData.newPlainText("plain text", ClipboardUtils_androidKt.convertToCharSequence(annotatedString)));
    }

    @JvmStatic
    public static final boolean hasText(ClipEntry clipEntry) {
        if (clipEntry != null) goto L6;
        return false;
    L6:
        return clipEntry.getClipData().getDescription().hasMimeType("text/*");
    }
}
