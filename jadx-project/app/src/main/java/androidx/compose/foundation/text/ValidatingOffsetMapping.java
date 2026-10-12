package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.OffsetMapping;
import kotlin.Metadata;

/* JADX INFO: compiled from: ValidatingOffsetMapping.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/text/ValidatingOffsetMapping;", "Landroidx/compose/ui/text/input/OffsetMapping;", "delegate", "originalLength", "", "transformedLength", "(Landroidx/compose/ui/text/input/OffsetMapping;II)V", "originalToTransformed", "offset", "transformedToOriginal", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ValidatingOffsetMapping implements OffsetMapping {
    private final OffsetMapping delegate;
    private final int originalLength;
    private final int transformedLength;

    public ValidatingOffsetMapping(OffsetMapping delegate, int originalLength, int transformedLength) {
        this.delegate = delegate;
        this.originalLength = originalLength;
        this.transformedLength = transformedLength;
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public int originalToTransformed(int offset) {
        int transformedOffset = this.delegate.originalToTransformed(offset);
        boolean r3 = false;
        if (offset >= 0) goto L5;
    L7:
        if (r3 == false) goto L10;
        ValidatingOffsetMappingKt.access$validateOriginalToTransformed(transformedOffset, this.transformedLength, offset);
    L10:
        return transformedOffset;
    L5:
        if (offset > this.originalLength) goto L7;
        r3 = true;
        goto L7
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public int transformedToOriginal(int offset) {
        int originalOffset = this.delegate.transformedToOriginal(offset);
        boolean r3 = false;
        if (offset >= 0) goto L5;
    L7:
        if (r3 == false) goto L10;
        ValidatingOffsetMappingKt.access$validateTransformedToOriginal(originalOffset, this.originalLength, offset);
    L10:
        return originalOffset;
    L5:
        if (offset > this.transformedLength) goto L7;
        r3 = true;
        goto L7
    }
}
