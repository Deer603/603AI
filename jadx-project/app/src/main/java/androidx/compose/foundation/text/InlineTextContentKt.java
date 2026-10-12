package androidx.compose.foundation.text;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;

/* JADX INFO: compiled from: InlineTextContent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"INLINE_CONTENT_TAG", "", "REPLACEMENT_CHAR", "appendInlineContent", "", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "id", "alternateText", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class InlineTextContentKt {
    public static final String INLINE_CONTENT_TAG = "androidx.compose.foundation.text.inlineContent";
    private static final String REPLACEMENT_CHAR = "�";

    public static /* synthetic */ void appendInlineContent$default(AnnotatedString.Builder r0, String r1, String r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = REPLACEMENT_CHAR;
    L5:
        appendInlineContent(r0, r1, r2);
    }

    public static final void appendInlineContent(AnnotatedString.Builder $this$appendInlineContent, String id, String alternateText) {
        if (alternateText.length() <= 0) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        InlineClassHelperKt.throwIllegalArgumentException("alternateText can't be an empty string.");
    L9:
        $this$appendInlineContent.pushStringAnnotation(INLINE_CONTENT_TAG, id);
        $this$appendInlineContent.append(alternateText);
        $this$appendInlineContent.pop();
        return;
    L5:
        value$iv = false;
        goto L7
    }
}
