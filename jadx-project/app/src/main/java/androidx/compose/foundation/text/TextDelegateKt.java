package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TextDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001av\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\f\u0010\u0018\u001a\u00020\u0010*\u00020\u0019H\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"updateTextDelegate", "Landroidx/compose/foundation/text/TextDelegate;", "current", "text", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "softWrap", "", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "maxLines", "", "minLines", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "updateTextDelegate-rm0N8CA", "(Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;ZIIILjava/util/List;)Landroidx/compose/foundation/text/TextDelegate;", "ceilToIntPx", "", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextDelegateKt {
    public static final int ceilToIntPx(float $this$ceilToIntPx) {
        float $this$fastRoundToInt$iv = (float) Math.ceil($this$ceilToIntPx);
        return Math.round($this$fastRoundToInt$iv);
    }

    /* JADX INFO: renamed from: updateTextDelegate-rm0N8CA$default, reason: not valid java name */
    public static /* synthetic */ TextDelegate m1130updateTextDelegaterm0N8CA$default(TextDelegate r1, AnnotatedString r2, TextStyle r3, Density r4, FontFamily.Resolver r5, boolean r6, int r7, int r8, int r9, List r10, int r11, Object r12) {
        if ((r11 & 32) == 0) goto L6;
        r6 = true;
    L6:
        if ((r11 & 64) == 0) goto L9;
        r7 = TextOverflow.Companion.m6886getClipgIe3tQ8();
    L9:
        if ((r11 & 128) == 0) goto L12;
        r8 = Integer.MAX_VALUE;
    L12:
        if ((r11 & 256) == 0) goto L15;
        r9 = 1;
    L15:
        return m1129updateTextDelegaterm0N8CA(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
    }

    /* JADX INFO: renamed from: updateTextDelegate-rm0N8CA, reason: not valid java name */
    public static final TextDelegate m1129updateTextDelegaterm0N8CA(TextDelegate current, AnnotatedString text, TextStyle style, Density density, FontFamily.Resolver fontFamilyResolver, boolean softWrap, int overflow, int maxLines, int minLines, List<AnnotatedString.Range<Placeholder>> r21) {
        if (Intrinsics.areEqual(current.getText(), text) == true) goto L5;
        FontFamily.Resolver r9 = fontFamilyResolver;
        boolean r6 = softWrap;
        int r7 = overflow;
        int r4 = maxLines;
        int r5 = minLines;
        List<AnnotatedString.Range<Placeholder>> r10 = r21;
    L31:
        return new TextDelegate(text, style, r4, r5, r6, r7, density, r9, r10, null);
    L5:
        if (Intrinsics.areEqual(current.getStyle(), style) == false) goto L28;
        r6 = softWrap;
        if (current.getSoftWrap() != r6) goto L27;
        r7 = overflow;
        if (TextOverflow.m6877equalsimpl0(current.m1127getOverflowgIe3tQ8(), r7) == false) goto L26;
        r4 = maxLines;
        if (current.getMaxLines() != r4) goto L25;
        r5 = minLines;
        if (current.getMinLines() == r5) goto L15;
        r9 = fontFamilyResolver;
        r10 = r21;
        goto L31
    L15:
        if (Intrinsics.areEqual(current.getDensity(), density) == false) goto L23;
        r10 = r21;
        if (Intrinsics.areEqual(current.getPlaceholders(), r10) == false) goto L22;
        r9 = fontFamilyResolver;
        if (current.getFontFamilyResolver() != r9) goto L31;
        return current;
    L22:
        r9 = fontFamilyResolver;
        goto L31
    L23:
        r9 = fontFamilyResolver;
        r10 = r21;
        goto L31
    L25:
        r9 = fontFamilyResolver;
        r5 = minLines;
        r10 = r21;
        goto L31
    L26:
        r9 = fontFamilyResolver;
        r4 = maxLines;
        r5 = minLines;
        r10 = r21;
        goto L31
    L27:
        r9 = fontFamilyResolver;
        r7 = overflow;
        r4 = maxLines;
        r5 = minLines;
        r10 = r21;
        goto L31
    L28:
        r9 = fontFamilyResolver;
        r6 = softWrap;
        r7 = overflow;
        r4 = maxLines;
        r5 = minLines;
        r10 = r21;
        goto L31
    }
}
