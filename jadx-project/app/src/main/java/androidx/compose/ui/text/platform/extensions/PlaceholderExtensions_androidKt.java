package androidx.compose.ui.text.platform.extensions;

import android.text.Spannable;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.emoji2.text.EmojiSpan;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: PlaceholderExtensions.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a,\u0010\r\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0015H\u0002\u001a(\u0010\u0016\u001a\u00020\u000e*\u00020\u000f2\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00190\u00182\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001e\u0010\u0007\u001a\u00020\u0001*\u00020\b8BX\u0082\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"spanUnit", "", "Landroidx/compose/ui/unit/TextUnit;", "getSpanUnit--R2X_6o$annotations", "(J)V", "getSpanUnit--R2X_6o", "(J)I", "spanVerticalAlign", "Landroidx/compose/ui/text/PlaceholderVerticalAlign;", "getSpanVerticalAlign-do9X-Gg$annotations", "(I)V", "getSpanVerticalAlign-do9X-Gg", "(I)I", "setPlaceholder", "", "Landroid/text/Spannable;", "placeholder", "Landroidx/compose/ui/text/Placeholder;", "start", "end", "density", "Landroidx/compose/ui/unit/Density;", "setPlaceholders", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PlaceholderExtensions_androidKt {
    /* JADX INFO: renamed from: getSpanUnit--R2X_6o$annotations, reason: not valid java name */
    private static /* synthetic */ void m6688getSpanUnitR2X_6o$annotations(long r0) {
    }

    /* JADX INFO: renamed from: getSpanVerticalAlign-do9X-Gg$annotations, reason: not valid java name */
    private static /* synthetic */ void m6690getSpanVerticalAligndo9XGg$annotations(int r0) {
    }

    public static final void setPlaceholders(Spannable $this$setPlaceholders, List<AnnotatedString.Range<Placeholder>> r11, Density density) {
        int index$iv = 0;
        int r3 = r11.size();
    L3:
        if (index$iv >= r3) goto L6;
        Object item$iv = r11.get(index$iv);
        AnnotatedString.Range<Placeholder> r5 = (AnnotatedString.Range) item$iv;
        Placeholder placeholder = r5.component1();
        int start = r5.component2();
        int end = r5.component3();
        setPlaceholder($this$setPlaceholders, placeholder, start, end, density);
        index$iv = index$iv + 1;
        goto L3
    }

    private static final void setPlaceholder(Spannable $this$setPlaceholder, Placeholder placeholder, int start, int end, Density density) {
        Object[] $this$forEach$iv = $this$setPlaceholder.getSpans(start, end, EmojiSpan.class);
        int r2 = $this$forEach$iv.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L5;
        Object element$iv = $this$forEach$iv[r3];
        EmojiSpan it = (EmojiSpan) element$iv;
        $this$setPlaceholder.removeSpan(it);
        r3 = r3 + 1;
        goto L3
    L5:
        SpannableExtensions_androidKt.setSpan($this$setPlaceholder, new PlaceholderSpan(TextUnit.m7167getValueimpl(placeholder.m6320getWidthXSAIIZE()), m6687getSpanUnitR2X_6o(placeholder.m6320getWidthXSAIIZE()), TextUnit.m7167getValueimpl(placeholder.m6318getHeightXSAIIZE()), m6687getSpanUnitR2X_6o(placeholder.m6318getHeightXSAIIZE()), density.getFontScale() * density.getDensity(), m6689getSpanVerticalAligndo9XGg(placeholder.m6319getPlaceholderVerticalAlignJ6kI3mc())), start, end);
    }

    /* JADX INFO: renamed from: getSpanUnit--R2X_6o, reason: not valid java name */
    private static final int m6687getSpanUnitR2X_6o(long $this$spanUnit) {
        long r0 = TextUnit.m7166getTypeUIouoOA($this$spanUnit);
        if (TextUnitType.m7195equalsimpl0(r0, TextUnitType.Companion.m7200getSpUIouoOA()) == false) goto L6;
        return 0;
    L6:
        if (TextUnitType.m7195equalsimpl0(r0, TextUnitType.Companion.m7199getEmUIouoOA()) == false) goto L8;
        return 1;
    L8:
        return 2;
    }

    /* JADX INFO: renamed from: getSpanVerticalAlign-do9X-Gg, reason: not valid java name */
    private static final int m6689getSpanVerticalAligndo9XGg(int $this$spanVerticalAlign) {
        if (PlaceholderVerticalAlign.m6324equalsimpl0($this$spanVerticalAlign, PlaceholderVerticalAlign.Companion.m6328getAboveBaselineJ6kI3mc()) == false) goto L6;
        return 0;
    L6:
        if (PlaceholderVerticalAlign.m6324equalsimpl0($this$spanVerticalAlign, PlaceholderVerticalAlign.Companion.m6334getTopJ6kI3mc()) == false) goto L9;
        return 1;
    L9:
        if (PlaceholderVerticalAlign.m6324equalsimpl0($this$spanVerticalAlign, PlaceholderVerticalAlign.Companion.m6329getBottomJ6kI3mc()) == false) goto L12;
        return 2;
    L12:
        if (PlaceholderVerticalAlign.m6324equalsimpl0($this$spanVerticalAlign, PlaceholderVerticalAlign.Companion.m6330getCenterJ6kI3mc()) == false) goto L15;
        return 3;
    L15:
        if (PlaceholderVerticalAlign.m6324equalsimpl0($this$spanVerticalAlign, PlaceholderVerticalAlign.Companion.m6333getTextTopJ6kI3mc()) == false) goto L18;
        return 4;
    L18:
        if (PlaceholderVerticalAlign.m6324equalsimpl0($this$spanVerticalAlign, PlaceholderVerticalAlign.Companion.m6331getTextBottomJ6kI3mc()) == false) goto L21;
        return 5;
    L21:
        if (PlaceholderVerticalAlign.m6324equalsimpl0($this$spanVerticalAlign, PlaceholderVerticalAlign.Companion.m6332getTextCenterJ6kI3mc()) == false) goto L25;
        return 6;
    L25:
        throw new IllegalStateException("Invalid PlaceholderVerticalAlign".toString());
    }
}
