package androidx.compose.ui.text.style;

import androidx.compose.ui.text.SpanStyleKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextIndent.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"lerp", "Landroidx/compose/ui/text/style/TextIndent;", "start", "stop", "fraction", "", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextIndentKt {
    public static final TextIndent lerp(TextIndent start, TextIndent stop, float fraction) {
        return new TextIndent(SpanStyleKt.m6364lerpTextUnitInheritableC3pnCVY(start.m6859getFirstLineXSAIIZE(), stop.m6859getFirstLineXSAIIZE(), fraction), SpanStyleKt.m6364lerpTextUnitInheritableC3pnCVY(start.m6860getRestLineXSAIIZE(), stop.m6860getRestLineXSAIIZE(), fraction), null);
    }
}
