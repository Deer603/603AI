package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;

/* JADX INFO: compiled from: CodepointHelpers.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0000¨\u0006\u0007"}, d2 = {"charCount", "", "codePoint", "codePointAt", "", "index", "codePointBefore", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CodepointHelpers_jvmKt {
    public static final int codePointAt(CharSequence $this$codePointAt, int index) {
        return Character.codePointAt($this$codePointAt, index);
    }

    public static final int charCount(int codePoint) {
        return Character.charCount(codePoint);
    }

    public static final int codePointBefore(CharSequence $this$codePointBefore, int index) {
        return Character.codePointBefore($this$codePointBefore, index);
    }
}
