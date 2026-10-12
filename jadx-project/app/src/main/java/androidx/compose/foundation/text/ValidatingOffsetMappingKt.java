package androidx.compose.foundation.text;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Metadata;

/* JADX INFO: compiled from: ValidatingOffsetMapping.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002\u001a \u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002\u001a\u0014\u0010\r\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000\u001a\u001e\u0010\u0012\u001a\u00020\u0005*\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u0007H\u0001\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0014"}, d2 = {"ValidatingEmptyOffsetMappingIdentity", "Landroidx/compose/ui/text/input/OffsetMapping;", "getValidatingEmptyOffsetMappingIdentity", "()Landroidx/compose/ui/text/input/OffsetMapping;", "validateOriginalToTransformed", "", "transformedOffset", "", "transformedLength", "offset", "validateTransformedToOriginal", "originalOffset", "originalLength", "filterWithValidation", "Landroidx/compose/ui/text/input/TransformedText;", "Landroidx/compose/ui/text/input/VisualTransformation;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "throwIfNotValidTransform", "limit", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ValidatingOffsetMappingKt {
    private static final OffsetMapping ValidatingEmptyOffsetMappingIdentity = null;

    public static final /* synthetic */ void access$validateOriginalToTransformed(int transformedOffset, int transformedLength, int offset) {
        validateOriginalToTransformed(transformedOffset, transformedLength, offset);
    }

    public static final /* synthetic */ void access$validateTransformedToOriginal(int originalOffset, int originalLength, int offset) {
        validateTransformedToOriginal(originalOffset, originalLength, offset);
    }

    public static final OffsetMapping getValidatingEmptyOffsetMappingIdentity() {
        return ValidatingEmptyOffsetMappingIdentity;
    }

    static {
        ValidatingEmptyOffsetMappingIdentity = new ValidatingOffsetMapping(OffsetMapping.Companion.getIdentity(), 0, 0);
    }

    public static final TransformedText filterWithValidation(VisualTransformation $this$filterWithValidation, AnnotatedString text) {
        TransformedText delegate = $this$filterWithValidation.filter(text);
        throwIfNotValidTransform$default(delegate, text.length(), 0, 2, null);
        return new TransformedText(delegate.getText(), new ValidatingOffsetMapping(delegate.getOffsetMapping(), text.length(), delegate.getText().length()));
    }

    public static /* synthetic */ void throwIfNotValidTransform$default(TransformedText r0, int r1, int r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = 100;
    L5:
        throwIfNotValidTransform(r0, r1, r2);
    }

    public static final void throwIfNotValidTransform(TransformedText $this$throwIfNotValidTransform, int originalLength, int limit) {
        int transformedLength = $this$throwIfNotValidTransform.getText().length();
        int offset = 0;
        int r2 = Math.min(originalLength, limit);
    L3:
        if (offset >= r2) goto L5;
        int transformedOffset = $this$throwIfNotValidTransform.getOffsetMapping().originalToTransformed(offset);
        validateOriginalToTransformed(transformedOffset, transformedLength, offset);
        offset = offset + 1;
        goto L3
    L5:
        int transformedOffset2 = $this$throwIfNotValidTransform.getOffsetMapping().originalToTransformed(originalLength);
        validateOriginalToTransformed(transformedOffset2, transformedLength, originalLength);
        int offset2 = 0;
        int r3 = Math.min(transformedLength, limit);
    L6:
        if (offset2 >= r3) goto L8;
        int originalOffset = $this$throwIfNotValidTransform.getOffsetMapping().transformedToOriginal(offset2);
        validateTransformedToOriginal(originalOffset, originalLength, offset2);
        offset2 = offset2 + 1;
        goto L6
    L8:
        int originalOffset2 = $this$throwIfNotValidTransform.getOffsetMapping().transformedToOriginal(transformedLength);
        validateTransformedToOriginal(originalOffset2, originalLength, transformedLength);
    }

    private static final void validateTransformedToOriginal(int originalOffset, int originalLength, int offset) {
        boolean value$iv = false;
        if (originalOffset < 0) goto L7;
        if (originalOffset > originalLength) goto L7;
        value$iv = true;
    L7:
        if (value$iv == true) goto L11;
        InlineClassHelperKt.throwIllegalStateException("OffsetMapping.transformedToOriginal returned invalid mapping: " + offset + " -> " + originalOffset + " is not in range of original text [0, " + originalLength + ']');
        return;
    }

    private static final void validateOriginalToTransformed(int transformedOffset, int transformedLength, int offset) {
        boolean value$iv = false;
        if (transformedOffset < 0) goto L7;
        if (transformedOffset > transformedLength) goto L7;
        value$iv = true;
    L7:
        if (value$iv == true) goto L11;
        InlineClassHelperKt.throwIllegalStateException("OffsetMapping.originalToTransformed returned invalid mapping: " + offset + " -> " + transformedOffset + " is not in range of transformed text [0, " + transformedLength + ']');
        return;
    }
}
