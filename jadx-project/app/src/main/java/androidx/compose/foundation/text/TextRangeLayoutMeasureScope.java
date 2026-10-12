package androidx.compose.foundation.text;

import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: TextLinkScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/text/TextRangeLayoutMeasureScope;", "", "()V", "layout", "Landroidx/compose/foundation/text/TextRangeLayoutMeasureResult;", "width", "", "height", "place", "Lkotlin/Function0;", "Landroidx/compose/ui/unit/IntOffset;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextRangeLayoutMeasureScope {
    public static final int $stable = 0;

    static {
    }

    public TextRangeLayoutMeasureScope() {
    }

    public final TextRangeLayoutMeasureResult layout(int width, int height, Function0<IntOffset> r4) {
        return new TextRangeLayoutMeasureResult(width, height, r4);
    }
}
