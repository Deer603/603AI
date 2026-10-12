package androidx.compose.foundation.text.input.internal;

import androidx.autofill.HintConstants;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: TransformedTextFieldState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a^\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042<\u0010\u0005\u001a8\u0012\u0004\u0012\u00020\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00010\u0006H\u0080\b¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"getIndexTransformationType", "R", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "transformedQueryIndex", "", "onResult", "Lkotlin/Function3;", "Landroidx/compose/foundation/text/input/internal/IndexTransformationType;", "Landroidx/compose/ui/text/TextRange;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "untransformed", "retransformed", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;ILkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TransformedTextFieldStateKt {
    public static final <R> R getIndexTransformationType(TransformedTextFieldState $this$getIndexTransformationType, int transformedQueryIndex, Function3<? super IndexTransformationType, ? super TextRange, ? super TextRange, ? extends R> r10) {
        long untransformed = $this$getIndexTransformationType.m1311mapFromTransformedjx7JFs(transformedQueryIndex);
        long retransformed = $this$getIndexTransformationType.m1314mapToTransformedGEjPoXI(untransformed);
        if (TextRange.m6411getCollapsedimpl(untransformed) == false) goto L8;
        if (TextRange.m6411getCollapsedimpl(retransformed) == false) goto L8;
        IndexTransformationType type = IndexTransformationType.Untransformed;
    L19:
        return r10.invoke(type, TextRange.m6405boximpl(untransformed), TextRange.m6405boximpl(retransformed));
    L8:
        if (TextRange.m6411getCollapsedimpl(untransformed) == true) goto L13;
        if (TextRange.m6411getCollapsedimpl(retransformed) == true) goto L13;
        type = IndexTransformationType.Replacement;
    L13:
        if (TextRange.m6411getCollapsedimpl(untransformed) == true) goto L15;
    L17:
        type = IndexTransformationType.Deletion;
        goto L19
    L15:
        if (TextRange.m6411getCollapsedimpl(retransformed) == true) goto L17;
        type = IndexTransformationType.Insertion;
        goto L19
    }
}
