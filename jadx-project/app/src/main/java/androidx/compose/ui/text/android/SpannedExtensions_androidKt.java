package androidx.compose.ui.text.android;

import android.text.Spanned;
import kotlin.Metadata;

/* JADX INFO: compiled from: SpannedExtensions.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¨\u0006\b"}, d2 = {"hasSpan", "", "Landroid/text/Spanned;", "clazz", "Ljava/lang/Class;", "startInclusive", "", "endExclusive", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SpannedExtensions_androidKt {
    public static final boolean hasSpan(Spanned $this$hasSpan, Class<?> r3) {
        if ($this$hasSpan.nextSpanTransition(-1, $this$hasSpan.length(), r3) == $this$hasSpan.length()) goto L5;
        return true;
    L5:
        return false;
    }

    public static final boolean hasSpan(Spanned $this$hasSpan, Class<?> r2, int startInclusive, int endExclusive) {
        if ($this$hasSpan.nextSpanTransition(startInclusive - 1, endExclusive, r2) == endExclusive) goto L5;
        return true;
    L5:
        return false;
    }
}
