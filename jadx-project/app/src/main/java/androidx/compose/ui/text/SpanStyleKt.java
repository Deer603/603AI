package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.ShadowKt;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.FontWeightKt;
import androidx.compose.ui.text.font.SystemFontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.BaselineShiftKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextGeometricTransformKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SpanStyle.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e\u001a+\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0011\u001a\u0002H\u00102\u0006\u0010\u0012\u001a\u0002H\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\u0010\u0013\u001a&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u000b\u001a\u0004\u0018\u00010\u00152\b\u0010\f\u001a\u0004\u0018\u00010\u00152\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001a*\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u000eH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\nH\u0000\u001aÀ\u0001\u0010\u001c\u001a\u00020\n*\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u00020\u00012\b\u00104\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u0001072\b\u00108\u001a\u0004\u0018\u00010\u00152\b\u00109\u001a\u0004\u0018\u00010:H\u0000ø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a\u0018\u0010=\u001a\u0004\u0018\u00010\u0015*\u00020\n2\b\u0010>\u001a\u0004\u0018\u00010\u0015H\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006?"}, d2 = {"DefaultBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "J", "DefaultColor", "DefaultColorForegroundStyle", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "DefaultFontSize", "Landroidx/compose/ui/unit/TextUnit;", "DefaultLetterSpacing", "lerp", "Landroidx/compose/ui/text/SpanStyle;", "start", "stop", "fraction", "", "lerpDiscrete", "T", "a", "b", "(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;", "lerpPlatformStyle", "Landroidx/compose/ui/text/PlatformSpanStyle;", "lerpTextUnitInheritable", "t", "lerpTextUnitInheritable-C3pnCVY", "(JJF)J", "resolveSpanStyleDefaults", "style", "fastMerge", "color", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "fontSize", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontFeatureSettings", "", "letterSpacing", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "background", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "platformStyle", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "fastMerge-dSHsh3o", "(Landroidx/compose/ui/text/SpanStyle;JLandroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;)Landroidx/compose/ui/text/SpanStyle;", "mergePlatformStyle", "other", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SpanStyleKt {
    private static final long DefaultBackgroundColor = 0;
    private static final long DefaultColor = 0;
    private static final TextForegroundStyle DefaultColorForegroundStyle = null;
    private static final long DefaultFontSize = 0;
    private static final long DefaultLetterSpacing = 0;

    public static final /* synthetic */ TextForegroundStyle access$getDefaultColorForegroundStyle$p() {
        return DefaultColorForegroundStyle;
    }

    static {
        DefaultFontSize = TextUnitKt.getSp(14);
        DefaultLetterSpacing = TextUnitKt.getSp(0);
        DefaultBackgroundColor = Color.Companion.m4401getTransparent0d7_KjU();
        DefaultColor = Color.Companion.m4392getBlack0d7_KjU();
        DefaultColorForegroundStyle = TextForegroundStyle.Companion.m6856from8_81llA(DefaultColor);
    }

    /* JADX INFO: renamed from: lerpTextUnitInheritable-C3pnCVY, reason: not valid java name */
    public static final long m6364lerpTextUnitInheritableC3pnCVY(long a, long b, float t) {
        boolean r4 = true;
        if (TextUnit.m7165getRawTypeimpl(a) != 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L16;
        if (TextUnit.m7165getRawTypeimpl(b) == 0) goto L11;
        r4 = false;
    L11:
        if (r4 == true) goto L16;
        return TextUnitKt.m7187lerpC3pnCVY(a, b, t);
    L16:
        return ((TextUnit) lerpDiscrete(TextUnit.m7157boximpl(a), TextUnit.m7157boximpl(b), t)).m7176unboximpl();
    L5:
        r0 = false;
        goto L6
    }

    public static final <T> T lerpDiscrete(T r4, T r5, float fraction) {
        if (fraction >= 0.5d) goto L6;
        return r4;
    L6:
        return r5;
    }

    public static final SpanStyle lerp(SpanStyle start, SpanStyle stop, float fraction) {
        TextForegroundStyle r4 = TextDrawStyleKt.lerp(start.getTextForegroundStyle$ui_text_release(), stop.getTextForegroundStyle$ui_text_release(), fraction);
        FontFamily r10 = (FontFamily) lerpDiscrete(start.getFontFamily(), stop.getFontFamily(), fraction);
        long r5 = m6364lerpTextUnitInheritableC3pnCVY(start.m6359getFontSizeXSAIIZE(), stop.m6359getFontSizeXSAIIZE(), fraction);
        FontWeight r1 = start.getFontWeight();
        if (r1 != null) goto L5;
        r1 = FontWeight.Companion.getNormal();
    L5:
        FontWeight r2 = stop.getFontWeight();
        if (r2 != null) goto L8;
        r2 = FontWeight.Companion.getNormal();
    L8:
        FontWeight r7 = FontWeightKt.lerp(r1, r2, fraction);
        FontStyle r8 = (FontStyle) lerpDiscrete(start.m6360getFontStyle4Lr2A7w(), stop.m6360getFontStyle4Lr2A7w(), fraction);
        FontSynthesis r9 = (FontSynthesis) lerpDiscrete(start.m6361getFontSynthesisZQGJjVo(), stop.m6361getFontSynthesisZQGJjVo(), fraction);
        String r11 = (String) lerpDiscrete(start.getFontFeatureSettings(), stop.getFontFeatureSettings(), fraction);
        long r12 = m6364lerpTextUnitInheritableC3pnCVY(start.m6362getLetterSpacingXSAIIZE(), stop.m6362getLetterSpacingXSAIIZE(), fraction);
        BaselineShift r3 = start.m6357getBaselineShift5SSeXJ0();
        if (r3 == null) goto L11;
        float r6 = r3.m6713unboximpl();
    L12:
        BaselineShift r13 = stop.m6357getBaselineShift5SSeXJ0();
        if (r13 == null) goto L15;
        float r14 = r13.m6713unboximpl();
    L16:
        float r15 = BaselineShiftKt.m6720lerpjWV1Mfo(r6, r14, fraction);
        TextGeometricTransform r16 = start.getTextGeometricTransform();
        if (r16 != null) goto L19;
        r16 = TextGeometricTransform.Companion.getNone$ui_text_release();
    L19:
        TextGeometricTransform r17 = stop.getTextGeometricTransform();
        if (r17 != null) goto L22;
        r17 = TextGeometricTransform.Companion.getNone$ui_text_release();
    L22:
        TextGeometricTransform r18 = TextGeometricTransformKt.lerp(r16, r17, fraction);
        LocaleList r19 = (LocaleList) lerpDiscrete(start.getLocaleList(), stop.getLocaleList(), fraction);
        long r20 = ColorKt.m4417lerpjxsXWHM(start.m6356getBackground0d7_KjU(), stop.m6356getBackground0d7_KjU(), fraction);
        TextDecoration r110 = (TextDecoration) lerpDiscrete(start.getTextDecoration(), stop.getTextDecoration(), fraction);
        Shadow r21 = start.getShadow();
        if (r21 != null) goto L25;
        r21 = new Shadow(0, 0, 0.0f, 7, null);
    L25:
        Shadow r22 = stop.getShadow();
        if (r22 != null) goto L28;
        r22 = new Shadow(0, 0, 0.0f, 7, null);
    L28:
        Shadow r23 = ShadowKt.lerp(r21, r22, fraction);
        PlatformSpanStyle r24 = lerpPlatformStyle(start.getPlatformStyle(), stop.getPlatformStyle(), fraction);
        DrawStyle r25 = (DrawStyle) lerpDiscrete(start.getDrawStyle(), stop.getDrawStyle(), fraction);
        return new SpanStyle(r4, r5, r7, r8, r9, r10, r11, r12, BaselineShift.m6707boximpl(r15), r18, r19, r20, r110, r23, r24, r25, null);
    L15:
        r14 = BaselineShift.m6708constructorimpl(0.0f);
        goto L16
    L11:
        r6 = BaselineShift.m6708constructorimpl(0.0f);
        goto L12
    }

    private static final PlatformSpanStyle lerpPlatformStyle(PlatformSpanStyle start, PlatformSpanStyle stop, float fraction) {
        if (start != null) goto L6;
        if (stop != null) goto L6;
        return null;
    L6:
        if (start != null) goto L8;
        PlatformSpanStyle startNonNull = PlatformSpanStyle.Companion.getDefault();
    L9:
        if (stop != null) goto L11;
        PlatformSpanStyle stopNonNull = PlatformSpanStyle.Companion.getDefault();
    L13:
        return AndroidTextStyle_androidKt.lerp(startNonNull, stopNonNull, fraction);
    L11:
        stopNonNull = stop;
        goto L13
    L8:
        startNonNull = start;
        goto L9
    }

    public static final SpanStyle resolveSpanStyleDefaults(SpanStyle style) {
        TextForegroundStyle r3 = style.getTextForegroundStyle$ui_text_release().takeOrElse(AnonymousClass1.INSTANCE);
        long $this$isUnspecified$iv = style.m6359getFontSizeXSAIIZE();
        boolean r5 = true;
        if (TextUnit.m7165getRawTypeimpl($this$isUnspecified$iv) != 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L8;
        long r1 = DefaultFontSize;
    L9:
        FontWeight r2 = style.getFontWeight();
        if (r2 != null) goto L12;
        r2 = FontWeight.Companion.getNormal();
    L12:
        FontStyle r4 = style.m6360getFontStyle4Lr2A7w();
        if (r4 == null) goto L15;
        int r6 = r4.m6531unboximpl();
    L16:
        FontStyle r7 = FontStyle.m6525boximpl(r6);
        FontSynthesis r9 = style.m6361getFontSynthesisZQGJjVo();
        if (r9 == null) goto L19;
        int r10 = r9.m6544unboximpl();
    L20:
        FontSynthesis r11 = FontSynthesis.m6536boximpl(r10);
        SystemFontFamily r12 = style.getFontFamily();
        if (r12 != null) goto L23;
        r12 = FontFamily.Companion.getDefault();
    L23:
        String r13 = style.getFontFeatureSettings();
        if (r13 != null) goto L26;
        r13 = "";
    L26:
        long $this$isUnspecified$iv2 = style.m6362getLetterSpacingXSAIIZE();
        if (TextUnit.m7165getRawTypeimpl($this$isUnspecified$iv2) != 0) goto L29;
        boolean r8 = true;
    L30:
        if (r8 == false) goto L32;
        long r14 = DefaultLetterSpacing;
    L33:
        BaselineShift r15 = style.m6357getBaselineShift5SSeXJ0();
        if (r15 == null) goto L36;
        float r16 = r15.m6713unboximpl();
    L37:
        BaselineShift r17 = BaselineShift.m6707boximpl(r16);
        TextGeometricTransform r18 = style.getTextGeometricTransform();
        if (r18 != null) goto L40;
        r18 = TextGeometricTransform.Companion.getNone$ui_text_release();
    L40:
        TextGeometricTransform r19 = r18;
        LocaleList r110 = style.getLocaleList();
        if (r110 != null) goto L43;
        r110 = LocaleList.Companion.getCurrent();
    L43:
        LocaleList r111 = r110;
        long $this$takeOrElse_u2dDxMtmZc$iv = style.m6356getBackground0d7_KjU();
        if ($this$takeOrElse_u2dDxMtmZc$iv != 16) goto L47;
        r5 = false;
    L47:
        if (r5 == true) goto L50;
        $this$takeOrElse_u2dDxMtmZc$iv = DefaultBackgroundColor;
    L50:
        TextDecoration r20 = style.getTextDecoration();
        if (r20 != null) goto L53;
        r20 = TextDecoration.Companion.getNone();
    L53:
        TextDecoration r112 = r20;
        Shadow r21 = style.getShadow();
        if (r21 != null) goto L56;
        r21 = Shadow.Companion.getNone();
    L56:
        Shadow r113 = r21;
        PlatformSpanStyle r22 = style.getPlatformStyle();
        Fill r23 = style.getDrawStyle();
        if (r23 != null) goto L59;
        r23 = Fill.INSTANCE;
    L59:
        FontFamily r24 = r12;
        String r114 = r13;
        long r115 = r14;
        return new SpanStyle(r3, r1, r2, r7, r11, r24, r114, r115, r17, r19, r111, $this$takeOrElse_u2dDxMtmZc$iv, r112, r113, r22, r23, null);
    L36:
        r16 = BaselineShift.Companion.m6717getNoney9eOQZs();
        goto L37
    L32:
        r14 = style.m6362getLetterSpacingXSAIIZE();
        goto L33
    L29:
        r8 = false;
        goto L30
    L19:
        r10 = FontSynthesis.Companion.m6545getAllGVVA2EU();
        goto L20
    L15:
        r6 = FontStyle.Companion.m6535getNormal_LCdwA();
        goto L16
    L8:
        r1 = style.m6359getFontSizeXSAIIZE();
        goto L9
    L5:
        r0 = false;
        goto L6
    }

    /* JADX INFO: renamed from: fastMerge-dSHsh3o, reason: not valid java name */
    public static final SpanStyle m6363fastMergedSHsh3o(SpanStyle $this$fastMerge_u2ddSHsh3o, long color, Brush brush, float alpha, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformStyle, DrawStyle drawStyle) {
        boolean r23 = true;
        if (TextUnit.m7165getRawTypeimpl(fontSize) != 0) goto L5;
        boolean r19 = true;
    L7:
        if (r19 == true) goto L12;
        long r11 = fontSize;
        if (TextUnit.m7164equalsimpl0(r11, $this$fastMerge_u2ddSHsh3o.m6359getFontSizeXSAIIZE()) == true) goto L13;
        TextGeometricTransform r15 = textGeometricTransform;
        Shadow r14 = shadow;
        PlatformSpanStyle r6 = platformStyle;
    L118:
        boolean requiresAlloc = true;
    L120:
        if (requiresAlloc == true) goto L122;
        return $this$fastMerge_u2ddSHsh3o;
    L122:
        if (brush == null) goto L124;
        TextForegroundStyle otherTextForegroundStyle = TextForegroundStyle.Companion.from(brush, alpha);
    L125:
        TextForegroundStyle r28 = $this$fastMerge_u2ddSHsh3o.getTextForegroundStyle$ui_text_release().merge(otherTextForegroundStyle);
        if (fontFamily != null) goto L128;
        FontFamily r34 = $this$fastMerge_u2ddSHsh3o.getFontFamily();
    L130:
        if (TextUnit.m7165getRawTypeimpl(fontSize) != 0) goto L132;
        boolean r1 = true;
    L133:
        if (r1 == true) goto L135;
        long r29 = r11;
    L136:
        if (fontWeight != null) goto L138;
        FontWeight r31 = $this$fastMerge_u2ddSHsh3o.getFontWeight();
    L139:
        if (fontStyle != null) goto L141;
        FontStyle r32 = $this$fastMerge_u2ddSHsh3o.m6360getFontStyle4Lr2A7w();
    L142:
        if (fontSynthesis != null) goto L144;
        FontSynthesis r33 = $this$fastMerge_u2ddSHsh3o.m6361getFontSynthesisZQGJjVo();
    L145:
        if (fontFeatureSettings != null) goto L147;
        String r35 = $this$fastMerge_u2ddSHsh3o.getFontFeatureSettings();
    L149:
        if (TextUnit.m7165getRawTypeimpl(letterSpacing) != 0) goto L151;
        boolean r2 = true;
    L152:
        if (r2 == true) goto L154;
        long r36 = letterSpacing;
    L156:
        if (baselineShift != null) goto L158;
        BaselineShift r38 = $this$fastMerge_u2ddSHsh3o.m6357getBaselineShift5SSeXJ0();
    L159:
        if (r15 != null) goto L161;
        TextGeometricTransform r39 = $this$fastMerge_u2ddSHsh3o.getTextGeometricTransform();
    L162:
        if (localeList != null) goto L164;
        LocaleList r40 = $this$fastMerge_u2ddSHsh3o.getLocaleList();
    L166:
        if (background != 16) goto L169;
        r23 = false;
    L169:
        if (r23 == false) goto L171;
        long r41 = background;
    L173:
        if (textDecoration != null) goto L175;
        TextDecoration r43 = $this$fastMerge_u2ddSHsh3o.getTextDecoration();
    L176:
        if (r14 != null) goto L178;
        Shadow r44 = $this$fastMerge_u2ddSHsh3o.getShadow();
    L179:
        PlatformSpanStyle r45 = mergePlatformStyle($this$fastMerge_u2ddSHsh3o, r6);
        if (drawStyle != null) goto L182;
        DrawStyle r46 = $this$fastMerge_u2ddSHsh3o.getDrawStyle();
    L184:
        return new SpanStyle(r28, r29, r31, r32, r33, r34, r35, r36, r38, r39, r40, r41, r43, r44, r45, r46, null);
    L182:
        r46 = drawStyle;
        goto L184
    L178:
        r44 = r14;
        goto L179
    L175:
        r43 = textDecoration;
        goto L176
    L171:
        r41 = $this$fastMerge_u2ddSHsh3o.m6356getBackground0d7_KjU();
        goto L173
    L164:
        r40 = localeList;
        goto L166
    L161:
        r39 = r15;
        goto L162
    L158:
        r38 = baselineShift;
        goto L159
    L154:
        r36 = $this$fastMerge_u2ddSHsh3o.m6362getLetterSpacingXSAIIZE();
        goto L156
    L151:
        r2 = false;
        goto L152
    L147:
        r35 = fontFeatureSettings;
        goto L149
    L144:
        r33 = fontSynthesis;
        goto L145
    L141:
        r32 = fontStyle;
        goto L142
    L138:
        r31 = fontWeight;
        goto L139
    L135:
        r29 = $this$fastMerge_u2ddSHsh3o.m6359getFontSizeXSAIIZE();
        goto L136
    L132:
        r1 = false;
        goto L133
    L128:
        r34 = fontFamily;
        goto L130
    L124:
        otherTextForegroundStyle = TextForegroundStyle.Companion.m6856from8_81llA(color);
    L13:
        if (brush == null) goto L15;
    L23:
        if (fontStyle != null) goto L25;
    L28:
        if (fontWeight != null) goto L30;
    L33:
        if (fontFamily == null) goto L39;
        if (fontFamily == $this$fastMerge_u2ddSHsh3o.getFontFamily()) goto L39;
        r15 = textGeometricTransform;
        r14 = shadow;
        r6 = platformStyle;
    L39:
        if (TextUnit.m7165getRawTypeimpl(letterSpacing) != 0) goto L41;
        boolean r110 = true;
    L43:
        if (r110 == true) goto L49;
        if (TextUnit.m7164equalsimpl0(letterSpacing, $this$fastMerge_u2ddSHsh3o.m6362getLetterSpacingXSAIIZE()) == true) goto L49;
        r15 = textGeometricTransform;
        r14 = shadow;
        r6 = platformStyle;
    L49:
        if (textDecoration == null) goto L55;
        if (Intrinsics.areEqual(textDecoration, $this$fastMerge_u2ddSHsh3o.getTextDecoration()) == true) goto L55;
        r15 = textGeometricTransform;
        r14 = shadow;
        r6 = platformStyle;
    L55:
        if (Intrinsics.areEqual(brush, $this$fastMerge_u2ddSHsh3o.getTextForegroundStyle$ui_text_release().getBrush()) == false) goto L117;
        if (brush != null) goto L58;
    L64:
        if (fontSynthesis != null) goto L66;
    L69:
        if (fontFeatureSettings != null) goto L71;
    L74:
        if (baselineShift != null) goto L76;
    L79:
        if (textGeometricTransform == null) goto L84;
        r15 = textGeometricTransform;
        if (Intrinsics.areEqual(r15, $this$fastMerge_u2ddSHsh3o.getTextGeometricTransform()) == true) goto L85;
        r14 = shadow;
        r6 = platformStyle;
    L85:
        if (localeList == null) goto L92;
        if (Intrinsics.areEqual(localeList, $this$fastMerge_u2ddSHsh3o.getLocaleList()) == true) goto L92;
        r14 = shadow;
        r6 = platformStyle;
    L92:
        if (background == 16) goto L94;
        int r7 = 1;
    L95:
        if (r7 == 0) goto L101;
        if (Color.m4367equalsimpl0(background, $this$fastMerge_u2ddSHsh3o.m6356getBackground0d7_KjU()) == true) goto L101;
        r14 = shadow;
        r6 = platformStyle;
    L101:
        if (shadow == null) goto L106;
        r14 = shadow;
        if (Intrinsics.areEqual(r14, $this$fastMerge_u2ddSHsh3o.getShadow()) == true) goto L107;
        r6 = platformStyle;
    L107:
        if (platformStyle == null) goto L111;
        r6 = platformStyle;
        if (Intrinsics.areEqual(r6, $this$fastMerge_u2ddSHsh3o.getPlatformStyle()) == false) goto L118;
    L112:
        if (drawStyle != null) goto L114;
    L116:
        requiresAlloc = false;
        goto L120
    L114:
        if (Intrinsics.areEqual(drawStyle, $this$fastMerge_u2ddSHsh3o.getDrawStyle()) == true) goto L116;
    L111:
        r6 = platformStyle;
        goto L112
    L106:
        r14 = shadow;
        goto L107
    L94:
        r7 = 0;
        goto L95
    L84:
        r15 = textGeometricTransform;
        goto L85
    L76:
        if (Intrinsics.areEqual(baselineShift, $this$fastMerge_u2ddSHsh3o.m6357getBaselineShift5SSeXJ0()) == true) goto L79;
        r15 = textGeometricTransform;
        r14 = shadow;
        r6 = platformStyle;
        goto L118
    L71:
        if (Intrinsics.areEqual(fontFeatureSettings, $this$fastMerge_u2ddSHsh3o.getFontFeatureSettings()) == true) goto L74;
        r15 = textGeometricTransform;
        r14 = shadow;
        r6 = platformStyle;
        goto L118
    L66:
        if (Intrinsics.areEqual(fontSynthesis, $this$fastMerge_u2ddSHsh3o.m6361getFontSynthesisZQGJjVo()) == true) goto L69;
        r15 = textGeometricTransform;
        r14 = shadow;
        r6 = platformStyle;
        goto L118
    L58:
        if (alpha != $this$fastMerge_u2ddSHsh3o.getTextForegroundStyle$ui_text_release().getAlpha()) goto L60;
        boolean r16 = true;
    L61:
        if (r16 == true) goto L64;
        r15 = textGeometricTransform;
        r14 = shadow;
        r6 = platformStyle;
        goto L118
    L60:
        r16 = false;
        goto L61
    L117:
        r15 = textGeometricTransform;
        r14 = shadow;
        r6 = platformStyle;
        goto L118
    L41:
        r110 = false;
        goto L43
    L30:
        if (Intrinsics.areEqual(fontWeight, $this$fastMerge_u2ddSHsh3o.getFontWeight()) == true) goto L33;
        r15 = textGeometricTransform;
        r14 = shadow;
        r6 = platformStyle;
        goto L118
    L25:
        if (Intrinsics.areEqual(fontStyle, $this$fastMerge_u2ddSHsh3o.m6360getFontStyle4Lr2A7w()) == true) goto L28;
        r15 = textGeometricTransform;
        r14 = shadow;
        r6 = platformStyle;
        goto L118
    L15:
        if (color == 16) goto L17;
        boolean r17 = true;
    L18:
        if (r17 == false) goto L23;
        if (Color.m4367equalsimpl0(color, $this$fastMerge_u2ddSHsh3o.getTextForegroundStyle$ui_text_release().mo6721getColor0d7_KjU()) == true) goto L23;
        r15 = textGeometricTransform;
        r14 = shadow;
        r6 = platformStyle;
        goto L118
    L17:
        r17 = false;
        goto L18
    L12:
        r11 = fontSize;
        goto L13
    L5:
        r19 = false;
        goto L7
    }

    private static final PlatformSpanStyle mergePlatformStyle(SpanStyle $this$mergePlatformStyle, PlatformSpanStyle other) {
        if ($this$mergePlatformStyle.getPlatformStyle() != null) goto L5;
        return other;
    L5:
        if (other != null) goto L9;
        return $this$mergePlatformStyle.getPlatformStyle();
    L9:
        return $this$mergePlatformStyle.getPlatformStyle().merge(other);
    }
}
