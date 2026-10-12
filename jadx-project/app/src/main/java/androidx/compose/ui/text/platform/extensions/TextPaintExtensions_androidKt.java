package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TextPaintExtensions.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a6\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aP\u0010\u000f\u001a\u0004\u0018\u00010\u0004*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042&\u0010\u0012\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0000\u001a\f\u0010\u001b\u001a\u00020\b*\u00020\u0004H\u0000\u001a\u0016\u0010\u001c\u001a\u00020\u001d*\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"correctBlurRadius", "", "blurRadius", "generateFallbackSpanStyle", "Landroidx/compose/ui/text/SpanStyle;", "letterSpacing", "Landroidx/compose/ui/unit/TextUnit;", "requiresLetterSpacing", "", "background", "Landroidx/compose/ui/graphics/Color;", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "generateFallbackSpanStyle-62GTOB8", "(JZJLandroidx/compose/ui/text/style/BaselineShift;)Landroidx/compose/ui/text/SpanStyle;", "applySpanStyle", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "style", "resolveTypeface", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "Landroid/graphics/Typeface;", "density", "Landroidx/compose/ui/unit/Density;", "hasFontAttributes", "setTextMotion", "", "textMotion", "Landroidx/compose/ui/text/style/TextMotion;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextPaintExtensions_androidKt {
    public static /* synthetic */ SpanStyle applySpanStyle$default(AndroidTextPaint r0, SpanStyle r1, Function4 r2, Density r3, boolean r4, int r5, Object r6) {
        if ((r5 & 8) == 0) goto L6;
        r4 = false;
    L6:
        return applySpanStyle(r0, r1, r2, r3, r4);
    }

    public static final SpanStyle applySpanStyle(AndroidTextPaint $this$applySpanStyle, SpanStyle style, Function4<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> r10, Density density, boolean requiresLetterSpacing) {
        long r0 = TextUnit.m7166getTypeUIouoOA(style.m6359getFontSizeXSAIIZE());
        if (TextUnitType.m7195equalsimpl0(r0, TextUnitType.Companion.m7200getSpUIouoOA()) == false) goto L6;
        $this$applySpanStyle.setTextSize(density.mo375toPxR2X_6o(style.m6359getFontSizeXSAIIZE()));
    L9:
        if (hasFontAttributes(style) == false) goto L23;
        FontFamily r1 = style.getFontFamily();
        FontWeight r2 = style.getFontWeight();
        if (r2 != null) goto L13;
        r2 = FontWeight.Companion.getNormal();
    L13:
        FontStyle r3 = style.m6360getFontStyle4Lr2A7w();
        if (r3 == null) goto L16;
        int r4 = r3.m6531unboximpl();
    L17:
        FontStyle r5 = FontStyle.m6525boximpl(r4);
        FontSynthesis r6 = style.m6361getFontSynthesisZQGJjVo();
        if (r6 == null) goto L20;
        int r7 = r6.m6544unboximpl();
    L21:
        $this$applySpanStyle.setTypeface(r10.invoke(r1, r2, r5, FontSynthesis.m6536boximpl(r7)));
        goto L23
    L20:
        r7 = FontSynthesis.Companion.m6545getAllGVVA2EU();
        goto L21
    L16:
        r4 = FontStyle.Companion.m6535getNormal_LCdwA();
    L23:
        if (style.getLocaleList() == null) goto L28;
        if (Intrinsics.areEqual(style.getLocaleList(), LocaleList.Companion.getCurrent()) == true) goto L28;
        LocaleListHelperMethods.INSTANCE.setTextLocales($this$applySpanStyle, style.getLocaleList());
    L28:
        if (style.getFontFeatureSettings() == null) goto L33;
        if (Intrinsics.areEqual(style.getFontFeatureSettings(), "") == true) goto L33;
        $this$applySpanStyle.setFontFeatureSettings(style.getFontFeatureSettings());
    L33:
        if (style.getTextGeometricTransform() != null) goto L35;
    L37:
        $this$applySpanStyle.m6685setColor8_81llA(style.m6358getColor0d7_KjU());
        $this$applySpanStyle.m6683setBrush12SF9DM(style.getBrush(), Size.Companion.m4202getUnspecifiedNHjbRc(), style.getAlpha());
        $this$applySpanStyle.setShadow(style.getShadow());
        $this$applySpanStyle.setTextDecoration(style.getTextDecoration());
        $this$applySpanStyle.setDrawStyle(style.getDrawStyle());
        if (TextUnitType.m7195equalsimpl0(TextUnit.m7166getTypeUIouoOA(style.m6362getLetterSpacingXSAIIZE()), TextUnitType.Companion.m7200getSpUIouoOA()) == false) goto L51;
        boolean r8 = true;
        if (TextUnit.m7167getValueimpl(style.m6362getLetterSpacingXSAIIZE()) != 0.0f) goto L42;
        boolean r9 = true;
    L43:
        if (r9 == true) goto L51;
        float emWidth = $this$applySpanStyle.getTextSize() * $this$applySpanStyle.getTextScaleX();
        float letterSpacingPx = density.mo375toPxR2X_6o(style.m6362getLetterSpacingXSAIIZE());
        if (emWidth == 0.0f) goto L48;
        r8 = false;
    L48:
        if (r8 == true) goto L54;
        $this$applySpanStyle.setLetterSpacing(letterSpacingPx / emWidth);
    L54:
        return m6700generateFallbackSpanStyle62GTOB8(style.m6362getLetterSpacingXSAIIZE(), requiresLetterSpacing, style.m6356getBackground0d7_KjU(), style.m6357getBaselineShift5SSeXJ0());
    L42:
        r9 = false;
    L51:
        if (TextUnitType.m7195equalsimpl0(TextUnit.m7166getTypeUIouoOA(style.m6362getLetterSpacingXSAIIZE()), TextUnitType.Companion.m7199getEmUIouoOA()) == false) goto L54;
        $this$applySpanStyle.setLetterSpacing(TextUnit.m7167getValueimpl(style.m6362getLetterSpacingXSAIIZE()));
        goto L54
    L35:
        if (Intrinsics.areEqual(style.getTextGeometricTransform(), TextGeometricTransform.Companion.getNone$ui_text_release()) == true) goto L37;
        $this$applySpanStyle.setTextScaleX($this$applySpanStyle.getTextScaleX() * style.getTextGeometricTransform().getScaleX());
        $this$applySpanStyle.setTextSkewX($this$applySpanStyle.getTextSkewX() + style.getTextGeometricTransform().getSkewX());
        goto L37
    L6:
        if (TextUnitType.m7195equalsimpl0(r0, TextUnitType.Companion.m7199getEmUIouoOA()) == false) goto L9;
        $this$applySpanStyle.setTextSize($this$applySpanStyle.getTextSize() * TextUnit.m7167getValueimpl(style.m6359getFontSizeXSAIIZE()));
        goto L9
    }

    /* JADX INFO: renamed from: generateFallbackSpanStyle-62GTOB8, reason: not valid java name */
    private static final SpanStyle m6700generateFallbackSpanStyle62GTOB8(long letterSpacing, boolean requiresLetterSpacing, long background, BaselineShift baselineShift) {
        boolean hasBaselineShift = true;
        if (requiresLetterSpacing == true) goto L5;
    L12:
        boolean hasLetterSpacing = false;
    L14:
        if (Color.m4367equalsimpl0(background, Color.Companion.m4402getUnspecified0d7_KjU()) == false) goto L16;
    L18:
        boolean hasBackgroundColor = false;
    L19:
        if (baselineShift != null) goto L21;
    L23:
        hasBaselineShift = false;
    L25:
        if (hasLetterSpacing == true) goto L29;
        if (hasBackgroundColor == true) goto L29;
        if (hasBaselineShift == true) goto L29;
        return null;
    L29:
        if (hasLetterSpacing == false) goto L31;
        long r18 = letterSpacing;
    L33:
        if (hasBackgroundColor == false) goto L35;
        long r23 = background;
    L37:
        if (hasBaselineShift == false) goto L39;
        BaselineShift r20 = baselineShift;
    L41:
        return new SpanStyle(0, 0, null, null, null, null, null, r18, r20, null, null, r23, null, null, null, null, 63103, null);
    L39:
        r20 = null;
        goto L41
    L35:
        r23 = Color.Companion.m4402getUnspecified0d7_KjU();
        goto L37
    L31:
        r18 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
        goto L33
    L21:
        if (BaselineShift.m6710equalsimpl0(baselineShift.m6713unboximpl(), BaselineShift.Companion.m6717getNoney9eOQZs()) == true) goto L23;
    L16:
        if (Color.m4367equalsimpl0(background, Color.Companion.m4401getTransparent0d7_KjU()) == true) goto L18;
        hasBackgroundColor = true;
        goto L19
    L5:
        if (TextUnitType.m7195equalsimpl0(TextUnit.m7166getTypeUIouoOA(letterSpacing), TextUnitType.Companion.m7200getSpUIouoOA()) == false) goto L12;
        if (TextUnit.m7167getValueimpl(letterSpacing) != 0.0f) goto L9;
        boolean r4 = true;
    L10:
        if (r4 == true) goto L12;
        hasLetterSpacing = true;
        goto L14
    L9:
        r4 = false;
        goto L10
    }

    public static final void setTextMotion(AndroidTextPaint $this$setTextMotion, TextMotion textMotion) {
        if (textMotion != null) goto L4;
        TextMotion finalTextMotion = TextMotion.Companion.getStatic();
    L6:
        if (finalTextMotion.getSubpixelTextPositioning$ui_text_release() == false) goto L8;
        int r1 = $this$setTextMotion.getFlags() | 128;
    L9:
        $this$setTextMotion.setFlags(r1);
        int r2 = finalTextMotion.m6863getLinearity4e0Vf04$ui_text_release();
        if (TextMotion.Linearity.m6867equalsimpl0(r2, TextMotion.Linearity.Companion.m6872getLinear4e0Vf04()) == false) goto L13;
        $this$setTextMotion.setFlags($this$setTextMotion.getFlags() | 64);
        $this$setTextMotion.setHinting(0);
        return;
    L13:
        if (TextMotion.Linearity.m6867equalsimpl0(r2, TextMotion.Linearity.Companion.m6871getFontHinting4e0Vf04()) == false) goto L16;
        $this$setTextMotion.getFlags();
        $this$setTextMotion.setHinting(1);
        return;
    L16:
        if (TextMotion.Linearity.m6867equalsimpl0(r2, TextMotion.Linearity.Companion.m6873getNone4e0Vf04()) == false) goto L18;
        $this$setTextMotion.getFlags();
        $this$setTextMotion.setHinting(0);
        return;
    L18:
        $this$setTextMotion.getFlags();
        return;
    L8:
        r1 = $this$setTextMotion.getFlags() & (-129);
        goto L9
    L4:
        finalTextMotion = textMotion;
        goto L6
    }

    public static final boolean hasFontAttributes(SpanStyle $this$hasFontAttributes) {
        if ($this$hasFontAttributes.getFontFamily() == null) goto L5;
    L10:
        return true;
    L5:
        if ($this$hasFontAttributes.m6360getFontStyle4Lr2A7w() != null) goto L10;
        if ($this$hasFontAttributes.getFontWeight() != null) goto L10;
        return false;
    }

    public static final float correctBlurRadius(float blurRadius) {
        if (blurRadius != 0.0f) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L9;
        return Float.MIN_VALUE;
    L9:
        return blurRadius;
    L5:
        r0 = false;
        goto L6
    }
}
