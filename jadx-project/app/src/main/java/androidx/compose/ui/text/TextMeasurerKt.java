package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextOverflow;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextMeasurer.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0002\u001a\u00020\u0003*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"DefaultCacheSize", "", "isEllipsis", "", "Landroidx/compose/ui/text/style/TextOverflow;", "isEllipsis-MW5-ApA", "(I)Z", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextMeasurerKt {
    private static final int DefaultCacheSize = 8;

    /* JADX INFO: renamed from: access$isEllipsis-MW5-ApA, reason: not valid java name */
    public static final /* synthetic */ boolean m6394access$isEllipsisMW5ApA(int $receiver) {
        return m6395isEllipsisMW5ApA($receiver);
    }

    /* JADX INFO: renamed from: isEllipsis-MW5-ApA, reason: not valid java name */
    private static final boolean m6395isEllipsisMW5ApA(int $this$isEllipsis) {
        if (TextOverflow.m6877equalsimpl0($this$isEllipsis, TextOverflow.Companion.m6887getEllipsisgIe3tQ8()) == false) goto L5;
    L10:
        return true;
    L5:
        if (TextOverflow.m6877equalsimpl0($this$isEllipsis, TextOverflow.Companion.m6889getStartEllipsisgIe3tQ8()) == true) goto L10;
        if (TextOverflow.m6877equalsimpl0($this$isEllipsis, TextOverflow.Companion.m6888getMiddleEllipsisgIe3tQ8()) == true) goto L10;
        return false;
    }
}
