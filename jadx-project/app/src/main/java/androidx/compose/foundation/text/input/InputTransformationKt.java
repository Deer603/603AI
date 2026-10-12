package androidx.compose.foundation.text.input;

import androidx.autofill.HintConstants;
import androidx.compose.ui.text.intl.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: InputTransformation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001aD\u0010\u0004\u001a\u00020\u0001*\u00020\u000126\u0010\u0005\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007\u001a\u0014\u0010\f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0007\u001a\u0014\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0007¨\u0006\u0010"}, d2 = {"allCaps", "Landroidx/compose/foundation/text/input/InputTransformation;", "locale", "Landroidx/compose/ui/text/intl/Locale;", "byValue", "transformation", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "current", "proposed", "maxLength", "", "then", "next", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class InputTransformationKt {
    public static final InputTransformation then(InputTransformation $this$then, InputTransformation next) {
        return new FilterChain($this$then, next);
    }

    public static final InputTransformation byValue(InputTransformation $this$byValue, Function2<? super CharSequence, ? super CharSequence, ? extends CharSequence> r2) {
        return then($this$byValue, new InputTransformationByValue(r2));
    }

    public static final InputTransformation allCaps(InputTransformation $this$allCaps, Locale locale) {
        return then($this$allCaps, new AllCapsTransformation(locale));
    }

    public static final InputTransformation maxLength(InputTransformation $this$maxLength, int maxLength) {
        return then($this$maxLength, new MaxLengthFilter(maxLength));
    }
}
