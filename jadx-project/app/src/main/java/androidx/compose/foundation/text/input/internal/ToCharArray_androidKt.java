package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldCharSequence;
import kotlin.Metadata;

/* JADX INFO: compiled from: ToCharArray.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000¨\u0006\t"}, d2 = {"toCharArray", "", "", "destination", "", "destinationOffset", "", "startIndex", "endIndex", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ToCharArray_androidKt {
    public static final void toCharArray(CharSequence $this$toCharArray, char[] destination, int destinationOffset, int startIndex, int endIndex) {
        if (($this$toCharArray instanceof TextFieldCharSequence) == false) goto L5;
        ((TextFieldCharSequence) $this$toCharArray).toCharArray(destination, destinationOffset, startIndex, endIndex);
        return;
    L5:
        int dstIndex = destinationOffset;
        int srcIndex = startIndex;
    L6:
        if (srcIndex >= endIndex) goto L10;
        destination[dstIndex] = $this$toCharArray.charAt(srcIndex);
        srcIndex = srcIndex + 1;
        dstIndex = dstIndex + 1;
        goto L6
    }
}
