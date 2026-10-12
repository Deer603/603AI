package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.Bullet;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.FontFeatureSpan;
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.ui.text.android.style.LetterSpacingSpanPx;
import androidx.compose.ui.text.android.style.LineHeightSpan;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.ui.text.android.style.ShadowSpan;
import androidx.compose.ui.text.android.style.SkewXSpan;
import androidx.compose.ui.text.android.style.TextDecorationSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.style.CustomBulletSpan;
import androidx.compose.ui.text.platform.style.DrawStyleSpan;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: SpannableExtensions.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aF\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00120\u00112\u001e\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\u0014H\u0000\u001a\u0010\u0010\u0016\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0002\u001a*\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a*\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001c\u001a\f\u0010 \u001a\u00020\u0001*\u00020!H\u0002\u001a\u0016\u0010\"\u001a\u00020\u0002*\u0004\u0018\u00010\u00022\u0006\u0010#\u001a\u00020\u0002H\u0002\u001a.\u0010$\u001a\u00020\u000e*\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0015H\u0000ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a.\u0010,\u001a\u00020\u000e*\u00020%2\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0002\b/\u001a.\u00100\u001a\u00020\u000e*\u00020%2\b\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0015H\u0002\u001a<\u00104\u001a\u00020\u000e*\u00020%2\u0014\u00105\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002060\u00120\u00112\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u000108H\u0000\u001a.\u00109\u001a\u00020\u000e*\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0015H\u0000ø\u0001\u0000¢\u0006\u0004\b:\u0010+\u001a&\u0010;\u001a\u00020\u000e*\u00020%2\b\u0010<\u001a\u0004\u0018\u00010=2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0015H\u0002\u001aR\u0010>\u001a\u00020\u000e*\u00020%2\u0006\u0010?\u001a\u00020!2\u0014\u00105\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002060\u00120\u00112&\u0010@\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010B\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020F0AH\u0002\u001a&\u0010G\u001a\u00020\u000e*\u00020%2\b\u0010H\u001a\u0004\u0018\u00010I2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0015H\u0002\u001a6\u0010J\u001a\u00020\u000e*\u00020%2\u0006\u0010K\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0015H\u0000ø\u0001\u0000¢\u0006\u0004\bL\u0010M\u001a&\u0010N\u001a\u00020\u000e*\u00020%2\b\u0010O\u001a\u0004\u0018\u00010P2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0015H\u0002\u001a.\u0010Q\u001a\u00020\u000e*\u00020%2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\nH\u0000ø\u0001\u0000¢\u0006\u0004\bR\u0010S\u001a6\u0010Q\u001a\u00020\u000e*\u00020%2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\n2\u0006\u0010T\u001a\u00020UH\u0000ø\u0001\u0000¢\u0006\u0004\bV\u0010W\u001a&\u0010X\u001a\u00020\u000e*\u00020%2\b\u0010Y\u001a\u0004\u0018\u00010Z2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0015H\u0000\u001a&\u0010[\u001a\u00020\u000e*\u00020%2\b\u0010\\\u001a\u0004\u0018\u00010]2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0015H\u0002\u001a$\u0010^\u001a\u00020\u000e*\u00020%2\u0006\u0010_\u001a\u00020`2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0015H\u0000\u001a,\u0010a\u001a\u00020\u000e*\u00020%2\u0006\u0010b\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\nH\u0002\u001aZ\u0010c\u001a\u00020\u000e*\u00020%2\u0006\u0010?\u001a\u00020!2\u0014\u00105\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002060\u00120\u00112\u0006\u0010\t\u001a\u00020\n2&\u0010@\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010B\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020F0AH\u0000\u001a&\u0010d\u001a\u00020\u000e*\u00020%2\b\u0010e\u001a\u0004\u0018\u00010f2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0015H\u0000\u001a&\u0010g\u001a\u00020\u000e*\u00020%2\b\u00107\u001a\u0004\u0018\u0001082\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\nH\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006h"}, d2 = {"needsLetterSpacingSpan", "", "Landroidx/compose/ui/text/SpanStyle;", "getNeedsLetterSpacingSpan", "(Landroidx/compose/ui/text/SpanStyle;)Z", "createLetterSpacingSpan", "Landroid/text/style/MetricAffectingSpan;", "letterSpacing", "Landroidx/compose/ui/unit/TextUnit;", "density", "Landroidx/compose/ui/unit/Density;", "createLetterSpacingSpan-eAf_CNQ", "(JLandroidx/compose/ui/unit/Density;)Landroid/text/style/MetricAffectingSpan;", "flattenFontStylesAndApply", "", "contextFontSpanStyle", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "block", "Lkotlin/Function3;", "", "isNonLinearFontScalingActive", "resolveBulletTextUnitToPx", "", "size", "contextFontSize", "resolveBulletTextUnitToPx-o2QH7mI", "(JFLandroidx/compose/ui/unit/Density;)F", "resolveLineHeightInPx", "lineHeight", "resolveLineHeightInPx-o2QH7mI", "hasFontAttributes", "Landroidx/compose/ui/text/TextStyle;", "merge", "spanStyle", "setBackground", "Landroid/text/Spannable;", "color", "Landroidx/compose/ui/graphics/Color;", "start", "end", "setBackground-RPmYEkk", "(Landroid/text/Spannable;JII)V", "setBaselineShift", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "setBaselineShift-0ocSgnM", "setBrush", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "setBulletSpans", "annotations", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "textIndent", "Landroidx/compose/ui/text/style/TextIndent;", "setColor", "setColor-RPmYEkk", "setDrawStyle", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "setFontAttributes", "contextTextStyle", "resolveTypeface", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "Landroid/graphics/Typeface;", "setFontFeatureSettings", "fontFeatureSettings", "", "setFontSize", "fontSize", "setFontSize-KmRG4DE", "(Landroid/text/Spannable;JLandroidx/compose/ui/unit/Density;II)V", "setGeometricTransform", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "setLineHeight", "setLineHeight-r9BaKPg", "(Landroid/text/Spannable;JFLandroidx/compose/ui/unit/Density;)V", "lineHeightStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "setLineHeight-KmRG4DE", "(Landroid/text/Spannable;JFLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/style/LineHeightStyle;)V", "setLocaleList", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "setShadow", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "setSpan", "span", "", "setSpanStyle", "style", "setSpanStyles", "setTextDecoration", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "setTextIndent", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SpannableExtensions_androidKt {
    public static final void setSpan(Spannable $this$setSpan, Object span, int start, int end) {
        $this$setSpan.setSpan(span, start, end, 33);
    }

    public static final void setTextIndent(Spannable $this$setTextIndent, TextIndent textIndent, float contextFontSize, Density density) {
        if (textIndent != null) goto L4;
        return;
    L4:
        if (TextUnit.m7164equalsimpl0(textIndent.m6859getFirstLineXSAIIZE(), TextUnitKt.getSp(0)) == true) goto L6;
    L7:
        long $this$isUnspecified$iv = textIndent.m6859getFirstLineXSAIIZE();
        boolean r7 = true;
        if (TextUnit.m7165getRawTypeimpl($this$isUnspecified$iv) != 0) goto L10;
        boolean r2 = true;
    L11:
        if (r2 == true) goto L37;
        long $this$isUnspecified$iv2 = textIndent.m6860getRestLineXSAIIZE();
        if (TextUnit.m7165getRawTypeimpl($this$isUnspecified$iv2) == 0) goto L16;
        r7 = false;
    L16:
        if (r7 == true) goto L38;
        long r5 = TextUnit.m7166getTypeUIouoOA(textIndent.m6859getFirstLineXSAIIZE());
        float restLine = 0.0f;
        if (TextUnitType.m7195equalsimpl0(r5, TextUnitType.Companion.m7200getSpUIouoOA()) == false) goto L22;
        float firstLine = density.mo375toPxR2X_6o(textIndent.m6859getFirstLineXSAIIZE());
    L25:
        long r6 = TextUnit.m7166getTypeUIouoOA(textIndent.m6860getRestLineXSAIIZE());
        if (TextUnitType.m7195equalsimpl0(r6, TextUnitType.Companion.m7200getSpUIouoOA()) == false) goto L29;
        restLine = density.mo375toPxR2X_6o(textIndent.m6860getRestLineXSAIIZE());
    L32:
        setSpan($this$setTextIndent, new LeadingMarginSpan.Standard((int) Math.ceil(firstLine), (int) Math.ceil(restLine)), 0, $this$setTextIndent.length());
        return;
    L29:
        if (TextUnitType.m7195equalsimpl0(r6, TextUnitType.Companion.m7199getEmUIouoOA()) == false) goto L32;
        restLine = TextUnit.m7167getValueimpl(textIndent.m6860getRestLineXSAIIZE()) * contextFontSize;
        goto L32
    L22:
        if (TextUnitType.m7195equalsimpl0(r5, TextUnitType.Companion.m7199getEmUIouoOA()) == false) goto L24;
        firstLine = TextUnit.m7167getValueimpl(textIndent.m6859getFirstLineXSAIIZE()) * contextFontSize;
        goto L25
    L24:
        firstLine = 0.0f;
        goto L25
    L38:
        return;
    L37:
        return;
    L10:
        r2 = false;
        goto L11
    L6:
        if (TextUnit.m7164equalsimpl0(textIndent.m6860getRestLineXSAIIZE(), TextUnitKt.getSp(0)) == false) goto L7;
    }

    public static final void setBulletSpans(Spannable $this$setBulletSpans, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> r21, float contextFontSize, Density density, TextIndent textIndent) {
        float r1 = 0.0f;
        if (textIndent == null) goto L12;
        long r6 = TextUnit.m7166getTypeUIouoOA(textIndent.m6859getFirstLineXSAIIZE());
        if (TextUnitType.m7195equalsimpl0(r6, TextUnitType.Companion.m7200getSpUIouoOA()) == false) goto L8;
        r1 = density.mo375toPxR2X_6o(textIndent.m6859getFirstLineXSAIIZE());
    L11:
        float textIndentPx = r1;
    L13:
        int r13 = r21.size();
        int index$iv = 0;
    L14:
        if (index$iv >= r13) goto L30;
        Object item$iv = r21.get(index$iv);
        AnnotatedString.Range<? extends AnnotatedString.Annotation> r16 = (AnnotatedString.Range) item$iv;
        AnnotatedString.Annotation r2 = r16.getItem();
        if ((r2 instanceof Bullet) == false) goto L18;
        Bullet r3 = (Bullet) r2;
    L19:
        if (r3 == null) goto L28;
        Bullet bullet = r3;
        float bulletSize = m6692resolveBulletTextUnitToPxo2QH7mI(bullet.m6253getSizeXSAIIZE(), contextFontSize, density);
        float gapWidthPx = m6692resolveBulletTextUnitToPxo2QH7mI(bullet.m6252getPaddingXSAIIZE(), contextFontSize, density);
        if (Float.isNaN(bulletSize) == true) goto L28;
        if (Float.isNaN(gapWidthPx) == true) goto L28;
        setSpan($this$setBulletSpans, new CustomBulletSpan(bullet.getShape(), bulletSize, bulletSize, gapWidthPx, bullet.getBrush(), bullet.getAlpha(), bullet.getDrawStyle(), density, textIndentPx), r16.getStart(), r16.getEnd());
    L28:
        index$iv = index$iv + 1;
        goto L14
    L18:
        r3 = null;
        goto L19
    L30:
        return;
    L8:
        if (TextUnitType.m7195equalsimpl0(r6, TextUnitType.Companion.m7199getEmUIouoOA()) == false) goto L11;
        r1 = TextUnit.m7167getValueimpl(textIndent.m6859getFirstLineXSAIIZE()) * contextFontSize;
        goto L11
    L12:
        textIndentPx = 0.0f;
        goto L13
    }

    /* JADX INFO: renamed from: resolveBulletTextUnitToPx-o2QH7mI, reason: not valid java name */
    private static final float m6692resolveBulletTextUnitToPxo2QH7mI(long size, float contextFontSize, Density density) {
        if (TextUnit.m7164equalsimpl0(size, TextUnit.Companion.m7178getUnspecifiedXSAIIZE()) == false) goto L5;
        return contextFontSize;
    L5:
        long r0 = TextUnit.m7166getTypeUIouoOA(size);
        if (TextUnitType.m7195equalsimpl0(r0, TextUnitType.Companion.m7200getSpUIouoOA()) == false) goto L9;
        return density.mo375toPxR2X_6o(size);
    L9:
        if (TextUnitType.m7195equalsimpl0(r0, TextUnitType.Companion.m7199getEmUIouoOA()) == true) goto L14;
        return Float.NaN;
    L14:
        return TextUnit.m7167getValueimpl(size) * contextFontSize;
    }

    /* JADX INFO: renamed from: setLineHeight-KmRG4DE, reason: not valid java name */
    public static final void m6698setLineHeightKmRG4DE(Spannable $this$setLineHeight_u2dKmRG4DE, long lineHeight, float contextFontSize, Density density, LineHeightStyle lineHeightStyle) {
        float resolvedLineHeight = m6693resolveLineHeightInPxo2QH7mI(lineHeight, contextFontSize, density);
        if (Float.isNaN(resolvedLineHeight) == false) goto L5;
        return;
    L5:
        if ($this$setLineHeight_u2dKmRG4DE.length() != 0) goto L7;
        boolean r0 = true;
    L8:
        if (r0 == false) goto L10;
    L13:
        int r1 = $this$setLineHeight_u2dKmRG4DE.length() + 1;
    L14:
        int endIndex = r1;
        setSpan($this$setLineHeight_u2dKmRG4DE, new LineHeightStyleSpan(resolvedLineHeight, 0, endIndex, LineHeightStyle.Trim.m6820isTrimFirstLineTopimpl$ui_text_release(lineHeightStyle.m6794getTrimEVpEnUU()), LineHeightStyle.Trim.m6821isTrimLastLineBottomimpl$ui_text_release(lineHeightStyle.m6794getTrimEVpEnUU()), lineHeightStyle.m6792getAlignmentPIaL0Z0(), LineHeightStyle.Mode.m6809equalsimpl0(lineHeightStyle.m6793getModelzQqcRY(), LineHeightStyle.Mode.Companion.m6814getMinimumlzQqcRY())), 0, $this$setLineHeight_u2dKmRG4DE.length());
        return;
    L10:
        if (StringsKt.last($this$setLineHeight_u2dKmRG4DE) == '\n') goto L13;
        r1 = $this$setLineHeight_u2dKmRG4DE.length();
        goto L14
    L7:
        r0 = false;
        goto L8
    }

    /* JADX INFO: renamed from: setLineHeight-r9BaKPg, reason: not valid java name */
    public static final void m6699setLineHeightr9BaKPg(Spannable $this$setLineHeight_u2dr9BaKPg, long lineHeight, float contextFontSize, Density density) {
        float resolvedLineHeight = m6693resolveLineHeightInPxo2QH7mI(lineHeight, contextFontSize, density);
        if (Float.isNaN(resolvedLineHeight) == true) goto L6;
        setSpan($this$setLineHeight_u2dr9BaKPg, new LineHeightSpan(resolvedLineHeight), 0, $this$setLineHeight_u2dr9BaKPg.length());
        return;
    }

    /* JADX INFO: renamed from: resolveLineHeightInPx-o2QH7mI, reason: not valid java name */
    private static final float m6693resolveLineHeightInPxo2QH7mI(long lineHeight, float contextFontSize, Density density) {
        long r0 = TextUnit.m7166getTypeUIouoOA(lineHeight);
        if (TextUnitType.m7195equalsimpl0(r0, TextUnitType.Companion.m7200getSpUIouoOA()) == false) goto L9;
        if (isNonLinearFontScalingActive(density) == false) goto L13;
        long fontSizeSp = density.mo379toSpkPz2Gy4(contextFontSize);
        float lineHeightMultiplier = TextUnit.m7167getValueimpl(lineHeight) / TextUnit.m7167getValueimpl(fontSizeSp);
        return lineHeightMultiplier * contextFontSize;
    L13:
        return density.mo375toPxR2X_6o(lineHeight);
    L9:
        if (TextUnitType.m7195equalsimpl0(r0, TextUnitType.Companion.m7199getEmUIouoOA()) == true) goto L15;
        return Float.NaN;
    L15:
        return TextUnit.m7167getValueimpl(lineHeight) * contextFontSize;
    }

    private static final boolean isNonLinearFontScalingActive(Density density) {
        if (density.getFontScale() <= 1.05d) goto L5;
        return true;
    L5:
        return false;
    }

    public static final void setSpanStyles(Spannable $this$setSpanStyles, TextStyle contextTextStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> r11, Density density, Function4<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> r13) {
        setFontAttributes($this$setSpanStyles, contextTextStyle, r11, r13);
        boolean hasLetterSpacing = false;
        int i = 0;
        int r2 = r11.size();
    L3:
        if (i >= r2) goto L18;
        AnnotatedString.Range<? extends AnnotatedString.Annotation> r3 = r11.get(i);
        if ((r3.getItem() instanceof SpanStyle) == false) goto L17;
        int start = r3.getStart();
        int end = r3.getEnd();
        if (start < 0) goto L17;
        if (start >= $this$setSpanStyles.length()) goto L17;
        if (end <= start) goto L17;
        if (end > $this$setSpanStyles.length()) goto L17;
        setSpanStyle($this$setSpanStyles, (SpanStyle) r3.getItem(), start, end, density);
        if (getNeedsLetterSpacingSpan((SpanStyle) r3.getItem()) == false) goto L17;
        hasLetterSpacing = true;
    L17:
        i = i + 1;
        goto L3
    L18:
        if (hasLetterSpacing == false) goto L35;
        int i2 = 0;
        int r4 = r11.size();
    L20:
        if (i2 >= r4) goto L52;
        AnnotatedString.Range<? extends AnnotatedString.Annotation> r5 = r11.get(i2);
        AnnotatedString.Annotation style = r5.getItem();
        if ((style instanceof SpanStyle) == false) goto L34;
        int start2 = r5.getStart();
        int end2 = r5.getEnd();
        if (start2 < 0) goto L34;
        if (start2 >= $this$setSpanStyles.length()) goto L34;
        if (end2 <= start2) goto L34;
        if (end2 > $this$setSpanStyles.length()) goto L34;
        MetricAffectingSpan it = m6691createLetterSpacingSpaneAf_CNQ(((SpanStyle) style).m6362getLetterSpacingXSAIIZE(), density);
        if (it == null) goto L34;
        setSpan($this$setSpanStyles, it, start2, end2);
    L34:
        i2 = i2 + 1;
        goto L20
    L52:
        return;
    }

    private static final void setSpanStyle(Spannable $this$setSpanStyle, SpanStyle style, int start, int end, Density density) {
        m6695setBaselineShift0ocSgnM($this$setSpanStyle, style.m6357getBaselineShift5SSeXJ0(), start, end);
        m6696setColorRPmYEkk($this$setSpanStyle, style.m6358getColor0d7_KjU(), start, end);
        setBrush($this$setSpanStyle, style.getBrush(), style.getAlpha(), start, end);
        setTextDecoration($this$setSpanStyle, style.getTextDecoration(), start, end);
        m6697setFontSizeKmRG4DE($this$setSpanStyle, style.m6359getFontSizeXSAIIZE(), density, start, end);
        setFontFeatureSettings($this$setSpanStyle, style.getFontFeatureSettings(), start, end);
        setGeometricTransform($this$setSpanStyle, style.getTextGeometricTransform(), start, end);
        setLocaleList($this$setSpanStyle, style.getLocaleList(), start, end);
        m6694setBackgroundRPmYEkk($this$setSpanStyle, style.m6356getBackground0d7_KjU(), start, end);
        setShadow($this$setSpanStyle, style.getShadow(), start, end);
        setDrawStyle($this$setSpanStyle, style.getDrawStyle(), start, end);
    }

    private static final void setFontAttributes(final Spannable $this$setFontAttributes, TextStyle contextTextStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> r27, final Function4<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> r28) {
        List target$iv = new ArrayList(r27.size());
        int index$iv$iv = 0;
        int r6 = r27.size();
    L3:
        if (index$iv$iv >= r6) goto L15;
        Object item$iv$iv = r27.get(index$iv$iv);
        AnnotatedString.Range<? extends AnnotatedString.Annotation> r10 = (AnnotatedString.Range) item$iv$iv;
        if ((r10.getItem() instanceof SpanStyle) == true) goto L7;
    L11:
        boolean r12 = false;
    L12:
        if (r12 == false) goto L14;
        AnnotatedString.Range<? extends AnnotatedString.Annotation> r11 = (AnnotatedString.Range) item$iv$iv;
        Intrinsics.checkNotNull(r11, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>");
        target$iv.add(r11);
    L14:
        index$iv$iv = index$iv$iv + 1;
        goto L3
    L7:
        if (TextPaintExtensions_androidKt.hasFontAttributes((SpanStyle) r10.getItem()) == false) goto L9;
    L10:
        r12 = true;
        goto L12
    L9:
        if (((SpanStyle) r10.getItem()).m6361getFontSynthesisZQGJjVo() == null) goto L11;
    L15:
        List fontRelatedSpanStyles = target$iv;
        if (hasFontAttributes(contextTextStyle) == false) goto L18;
        FontFamily r13 = contextTextStyle.getFontFamily();
        SpanStyle contextFontSpanStyle = new SpanStyle(0, 0, contextTextStyle.getFontWeight(), contextTextStyle.m6449getFontStyle4Lr2A7w(), contextTextStyle.m6450getFontSynthesisZQGJjVo(), r13, null, 0, null, null, null, 0, null, null, null, null, 65475, null);
    L19:
        flattenFontStylesAndApply(contextFontSpanStyle, fontRelatedSpanStyles, new AnonymousClass1($this$setFontAttributes, r28));
        return;
    L18:
        contextFontSpanStyle = null;
        goto L19
    }

    public static final void flattenFontStylesAndApply(SpanStyle contextFontSpanStyle, List<AnnotatedString.Range<SpanStyle>> r19, Function3<? super SpanStyle, ? super Integer, ? super Integer, Unit> r20) {
        int r4 = 0;
        if (r19.size() <= 1) goto L5;
        int spanCount = r19.size();
        int[] transitionOffsets = new int[spanCount * 2];
        int index$iv = 0;
        int r9 = r19.size();
    L10:
        if (index$iv >= r9) goto L12;
        Object item$iv = r19.get(index$iv);
        AnnotatedString.Range<SpanStyle> r11 = (AnnotatedString.Range) item$iv;
        int idx = index$iv;
        transitionOffsets[idx] = r11.getStart();
        transitionOffsets[idx + spanCount] = r11.getEnd();
        index$iv = index$iv + 1;
        goto L10
    L12:
        ArraysKt.sort(transitionOffsets);
        int lastTransitionOffsets = ArraysKt.first(transitionOffsets);
        int r7 = transitionOffsets.length;
    L13:
        if (r4 >= r7) goto L30;
        int transitionOffset = transitionOffsets[r4];
        if (transitionOffset != lastTransitionOffsets) goto L17;
        int spanCount2 = spanCount;
    L29:
        r4 = r4 + 1;
        spanCount = spanCount2;
        goto L13
    L17:
        SpanStyle r10 = contextFontSpanStyle;
        int index$iv2 = 0;
        int r13 = r19.size();
    L18:
        if (index$iv2 >= r13) goto L25;
        Object item$iv2 = r19.get(index$iv2);
        AnnotatedString.Range<SpanStyle> r15 = (AnnotatedString.Range) item$iv2;
        int spanCount3 = spanCount;
        if (r15.getStart() == r15.getEnd()) goto L24;
        if (AnnotatedStringKt.intersect(lastTransitionOffsets, transitionOffset, r15.getStart(), r15.getEnd()) == false) goto L24;
        r10 = merge(r10, r15.getItem());
    L24:
        index$iv2 = index$iv2 + 1;
        spanCount = spanCount3;
        goto L18
    L25:
        spanCount2 = spanCount;
        if (r10 == null) goto L28;
        SpanStyle it = r10;
        r20.invoke(it, Integer.valueOf(lastTransitionOffsets), Integer.valueOf(transitionOffset));
    L28:
        lastTransitionOffsets = transitionOffset;
        goto L29
    L30:
        return;
    L5:
        if (r19.isEmpty() == true) goto L8;
        r20.invoke(merge(contextFontSpanStyle, r19.get(0).getItem()), Integer.valueOf(r19.get(0).getStart()), Integer.valueOf(r19.get(0).getEnd()));
        return;
    }

    /* JADX INFO: renamed from: createLetterSpacingSpan-eAf_CNQ, reason: not valid java name */
    private static final MetricAffectingSpan m6691createLetterSpacingSpaneAf_CNQ(long letterSpacing, Density density) {
        long r0 = TextUnit.m7166getTypeUIouoOA(letterSpacing);
        if (TextUnitType.m7195equalsimpl0(r0, TextUnitType.Companion.m7200getSpUIouoOA()) == false) goto L6;
        return new LetterSpacingSpanPx(density.mo375toPxR2X_6o(letterSpacing));
    L6:
        if (TextUnitType.m7195equalsimpl0(r0, TextUnitType.Companion.m7199getEmUIouoOA()) == true) goto L11;
        return null;
    L11:
        return new LetterSpacingSpanEm(TextUnit.m7167getValueimpl(letterSpacing));
    }

    private static final boolean getNeedsLetterSpacingSpan(SpanStyle $this$needsLetterSpacingSpan) {
        if (TextUnitType.m7195equalsimpl0(TextUnit.m7166getTypeUIouoOA($this$needsLetterSpacingSpan.m6362getLetterSpacingXSAIIZE()), TextUnitType.Companion.m7200getSpUIouoOA()) == false) goto L5;
    L8:
        return true;
    L5:
        if (TextUnitType.m7195equalsimpl0(TextUnit.m7166getTypeUIouoOA($this$needsLetterSpacingSpan.m6362getLetterSpacingXSAIIZE()), TextUnitType.Companion.m7199getEmUIouoOA()) == true) goto L8;
        return false;
    }

    private static final void setShadow(Spannable $this$setShadow, Shadow shadow, int start, int end) {
        if (shadow == null) goto L6;
        int r3 = ColorKt.m4420toArgb8_81llA(shadow.m4691getColor0d7_KjU());
        long arg0$iv = shadow.m4692getOffsetF1C5BW0();
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);
        float r10 = Float.intBitsToFloat(bits$iv$iv$iv);
        long arg0$iv2 = shadow.m4692getOffsetF1C5BW0();
        int bits$iv$iv$iv2 = (int) (4294967295L & arg0$iv2);
        setSpan($this$setShadow, new ShadowSpan(r3, r10, Float.intBitsToFloat(bits$iv$iv$iv2), TextPaintExtensions_androidKt.correctBlurRadius(shadow.getBlurRadius())), start, end);
        return;
    }

    private static final void setDrawStyle(Spannable $this$setDrawStyle, DrawStyle drawStyle, int start, int end) {
        if (drawStyle == null) goto L5;
        setSpan($this$setDrawStyle, new DrawStyleSpan(drawStyle), start, end);
        return;
    }

    /* JADX INFO: renamed from: setBackground-RPmYEkk, reason: not valid java name */
    public static final void m6694setBackgroundRPmYEkk(Spannable $this$setBackground_u2dRPmYEkk, long color, int start, int end) {
        if (color == 16) goto L5;
        boolean r3 = true;
    L6:
        if (r3 == false) goto L9;
        setSpan($this$setBackground_u2dRPmYEkk, new BackgroundColorSpan(ColorKt.m4420toArgb8_81llA(color)), start, end);
        return;
    L9:
        return;
    L5:
        r3 = false;
        goto L6
    }

    public static final void setLocaleList(Spannable $this$setLocaleList, LocaleList localeList, int start, int end) {
        if (localeList == null) goto L5;
        setSpan($this$setLocaleList, LocaleListHelperMethods.INSTANCE.localeSpan(localeList), start, end);
        return;
    }

    private static final void setGeometricTransform(Spannable $this$setGeometricTransform, TextGeometricTransform textGeometricTransform, int start, int end) {
        if (textGeometricTransform == null) goto L5;
        setSpan($this$setGeometricTransform, new ScaleXSpan(textGeometricTransform.getScaleX()), start, end);
        setSpan($this$setGeometricTransform, new SkewXSpan(textGeometricTransform.getSkewX()), start, end);
        return;
    }

    private static final void setFontFeatureSettings(Spannable $this$setFontFeatureSettings, String fontFeatureSettings, int start, int end) {
        if (fontFeatureSettings == null) goto L5;
        setSpan($this$setFontFeatureSettings, new FontFeatureSpan(fontFeatureSettings), start, end);
        return;
    }

    /* JADX INFO: renamed from: setFontSize-KmRG4DE, reason: not valid java name */
    public static final void m6697setFontSizeKmRG4DE(Spannable $this$setFontSize_u2dKmRG4DE, long fontSize, Density density, int start, int end) {
        long r0 = TextUnit.m7166getTypeUIouoOA(fontSize);
        if (TextUnitType.m7195equalsimpl0(r0, TextUnitType.Companion.m7200getSpUIouoOA()) == false) goto L6;
        setSpan($this$setFontSize_u2dKmRG4DE, new AbsoluteSizeSpan(MathKt.roundToInt(density.mo375toPxR2X_6o(fontSize)), false), start, end);
        return;
    L6:
        if (TextUnitType.m7195equalsimpl0(r0, TextUnitType.Companion.m7199getEmUIouoOA()) == false) goto L10;
        setSpan($this$setFontSize_u2dKmRG4DE, new RelativeSizeSpan(TextUnit.m7167getValueimpl(fontSize)), start, end);
        return;
    }

    public static final void setTextDecoration(Spannable $this$setTextDecoration, TextDecoration textDecoration, int start, int end) {
        if (textDecoration == null) goto L5;
        TextDecorationSpan textDecorationSpan = new TextDecorationSpan(textDecoration.contains(TextDecoration.Companion.getUnderline()), textDecoration.contains(TextDecoration.Companion.getLineThrough()));
        setSpan($this$setTextDecoration, textDecorationSpan, start, end);
        return;
    }

    /* JADX INFO: renamed from: setColor-RPmYEkk, reason: not valid java name */
    public static final void m6696setColorRPmYEkk(Spannable $this$setColor_u2dRPmYEkk, long color, int start, int end) {
        if (color == 16) goto L5;
        boolean r3 = true;
    L6:
        if (r3 == false) goto L9;
        setSpan($this$setColor_u2dRPmYEkk, new ForegroundColorSpan(ColorKt.m4420toArgb8_81llA(color)), start, end);
        return;
    L9:
        return;
    L5:
        r3 = false;
        goto L6
    }

    /* JADX INFO: renamed from: setBaselineShift-0ocSgnM, reason: not valid java name */
    private static final void m6695setBaselineShift0ocSgnM(Spannable $this$setBaselineShift_u2d0ocSgnM, BaselineShift baselineShift, int start, int end) {
        if (baselineShift == null) goto L5;
        float it = baselineShift.m6713unboximpl();
        setSpan($this$setBaselineShift_u2d0ocSgnM, new BaselineShiftSpan(it), start, end);
        return;
    }

    private static final void setBrush(Spannable $this$setBrush, Brush brush, float alpha, int start, int end) {
        if (brush != null) goto L4;
        return;
    L4:
        if ((brush instanceof SolidColor) == false) goto L7;
        m6696setColorRPmYEkk($this$setBrush, ((SolidColor) brush).m4701getValue0d7_KjU(), start, end);
        return;
    L7:
        if ((brush instanceof ShaderBrush) == false) goto L13;
        setSpan($this$setBrush, new ShaderBrushSpan((ShaderBrush) brush, alpha), start, end);
        return;
    }

    private static final boolean hasFontAttributes(TextStyle $this$hasFontAttributes) {
        if (TextPaintExtensions_androidKt.hasFontAttributes($this$hasFontAttributes.toSpanStyle()) == false) goto L5;
    L8:
        return true;
    L5:
        if ($this$hasFontAttributes.m6450getFontSynthesisZQGJjVo() != null) goto L8;
        return false;
    }

    private static final SpanStyle merge(SpanStyle $this$merge, SpanStyle spanStyle) {
        if ($this$merge != null) goto L5;
        return spanStyle;
    L5:
        return $this$merge.merge(spanStyle);
    }
}
