package androidx.compose.ui.platform;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: AndroidClipboardManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B¥\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0002\u0010\u001cJ\u0006\u0010P\u001a\u00020QR\"\u0010\u0017\u001a\u00020\u0003X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\u0002\u001a\u00020\u0003X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b&\u0010\u001e\"\u0004\b'\u0010 R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u0010\u0004\u001a\u00020\u0005X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b0\u0010\u001e\"\u0004\b1\u0010 R\"\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010\u0010\u001a\u00020\u0005X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b>\u0010\u001e\"\u0004\b?\u0010 R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010O\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006R"}, d2 = {"Landroidx/compose/ui/platform/MutableSpanStyle;", "", "color", "Landroidx/compose/ui/graphics/Color;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontFeatureSettings", "", "letterSpacing", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "background", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackground-0d7_KjU", "()J", "setBackground-8_81llA", "(J)V", "J", "getBaselineShift-5SSeXJ0", "()Landroidx/compose/ui/text/style/BaselineShift;", "setBaselineShift-_isdbwI", "(Landroidx/compose/ui/text/style/BaselineShift;)V", "getColor-0d7_KjU", "setColor-8_81llA", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "setFontFamily", "(Landroidx/compose/ui/text/font/FontFamily;)V", "getFontFeatureSettings", "()Ljava/lang/String;", "setFontFeatureSettings", "(Ljava/lang/String;)V", "getFontSize-XSAIIZE", "setFontSize--R2X_6o", "getFontStyle-4Lr2A7w", "()Landroidx/compose/ui/text/font/FontStyle;", "setFontStyle-mLjRB2g", "(Landroidx/compose/ui/text/font/FontStyle;)V", "getFontSynthesis-ZQGJjVo", "()Landroidx/compose/ui/text/font/FontSynthesis;", "setFontSynthesis-tDdu0R4", "(Landroidx/compose/ui/text/font/FontSynthesis;)V", "getFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "setFontWeight", "(Landroidx/compose/ui/text/font/FontWeight;)V", "getLetterSpacing-XSAIIZE", "setLetterSpacing--R2X_6o", "getLocaleList", "()Landroidx/compose/ui/text/intl/LocaleList;", "setLocaleList", "(Landroidx/compose/ui/text/intl/LocaleList;)V", "getShadow", "()Landroidx/compose/ui/graphics/Shadow;", "setShadow", "(Landroidx/compose/ui/graphics/Shadow;)V", "getTextDecoration", "()Landroidx/compose/ui/text/style/TextDecoration;", "setTextDecoration", "(Landroidx/compose/ui/text/style/TextDecoration;)V", "getTextGeometricTransform", "()Landroidx/compose/ui/text/style/TextGeometricTransform;", "setTextGeometricTransform", "(Landroidx/compose/ui/text/style/TextGeometricTransform;)V", "toSpanStyle", "Landroidx/compose/ui/text/SpanStyle;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class MutableSpanStyle {
    private long background;
    private BaselineShift baselineShift;
    private long color;
    private FontFamily fontFamily;
    private String fontFeatureSettings;
    private long fontSize;
    private FontStyle fontStyle;
    private FontSynthesis fontSynthesis;
    private FontWeight fontWeight;
    private long letterSpacing;
    private LocaleList localeList;
    private Shadow shadow;
    private TextDecoration textDecoration;
    private TextGeometricTransform textGeometricTransform;

    public /* synthetic */ MutableSpanStyle(long r1, long r3, FontWeight r5, FontStyle r6, FontSynthesis r7, FontFamily r8, String r9, long r10, BaselineShift r12, TextGeometricTransform r13, LocaleList r14, long r15, TextDecoration r17, Shadow r18, DefaultConstructorMarker r19) {
        this(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18);
    }

    private MutableSpanStyle(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow) {
        this.color = color;
        this.fontSize = fontSize;
        this.fontWeight = fontWeight;
        this.fontStyle = fontStyle;
        this.fontSynthesis = fontSynthesis;
        this.fontFamily = fontFamily;
        this.fontFeatureSettings = fontFeatureSettings;
        this.letterSpacing = letterSpacing;
        this.baselineShift = baselineShift;
        this.textGeometricTransform = textGeometricTransform;
        this.localeList = localeList;
        this.background = background;
        this.textDecoration = textDecoration;
        this.shadow = shadow;
    }

    public /* synthetic */ MutableSpanStyle(long r20, long r22, FontWeight r24, FontStyle r25, FontSynthesis r26, FontFamily r27, String r28, long r29, BaselineShift r31, TextGeometricTransform r32, LocaleList r33, long r34, TextDecoration r36, Shadow r37, int r38, DefaultConstructorMarker r39) {
        if ((r38 & 1) == 0) goto L5;
        long r1 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r38 & 2) == 0) goto L9;
        long r3 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L11:
        if ((r38 & 4) == 0) goto L13;
        FontWeight r5 = null;
    L15:
        if ((r38 & 8) == 0) goto L17;
        FontStyle r7 = null;
    L19:
        if ((r38 & 16) == 0) goto L21;
        FontSynthesis r8 = null;
    L23:
        if ((r38 & 32) == 0) goto L25;
        FontFamily r9 = null;
    L27:
        if ((r38 & 64) == 0) goto L29;
        String r10 = null;
    L31:
        if ((r38 & 128) == 0) goto L33;
        long r11 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L35:
        if ((r38 & 256) == 0) goto L37;
        BaselineShift r13 = null;
    L39:
        if ((r38 & 512) == 0) goto L41;
        TextGeometricTransform r14 = null;
    L43:
        if ((r38 & 1024) == 0) goto L45;
        LocaleList r15 = null;
    L47:
        if ((r38 & 2048) == 0) goto L49;
        long r16 = Color.Companion.m4402getUnspecified0d7_KjU();
    L51:
        if ((r38 & 4096) == 0) goto L53;
        TextDecoration r6 = null;
    L55:
        if ((r38 & 8192) == 0) goto L57;
        Shadow r0 = null;
    L58:
        Shadow r310 = r0;
        long r21 = r1;
        long r23 = r3;
        FontWeight r210 = r5;
        TextDecoration r311 = r6;
        FontStyle r211 = r7;
        FontSynthesis r212 = r8;
        FontFamily r213 = r9;
        String r214 = r10;
        long r30 = r11;
        BaselineShift r35 = r13;
        TextGeometricTransform r312 = r14;
        LocaleList r313 = r15;
        long r314 = r16;
        this(r21, r23, r210, r211, r212, r213, r214, r30, r35, r312, r313, r314, r311, r310, null);
        return;
    L57:
        r0 = r37;
        goto L58
    L53:
        r6 = r36;
        goto L55
    L49:
        r16 = r34;
        goto L51
    L45:
        r15 = r33;
        goto L47
    L41:
        r14 = r32;
        goto L43
    L37:
        r13 = r31;
        goto L39
    L33:
        r11 = r29;
        goto L35
    L29:
        r10 = r28;
        goto L31
    L25:
        r9 = r27;
        goto L27
    L21:
        r8 = r26;
        goto L23
    L17:
        r7 = r25;
        goto L19
    L13:
        r5 = r24;
        goto L15
    L9:
        r3 = r22;
        goto L11
    L5:
        r1 = r20;
        goto L7
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m6136getColor0d7_KjU() {
        return this.color;
    }

    /* JADX INFO: renamed from: setColor-8_81llA, reason: not valid java name */
    public final void m6143setColor8_81llA(long r1) {
        this.color = r1;
    }

    /* JADX INFO: renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m6137getFontSizeXSAIIZE() {
        return this.fontSize;
    }

    /* JADX INFO: renamed from: setFontSize--R2X_6o, reason: not valid java name */
    public final void m6144setFontSizeR2X_6o(long r1) {
        this.fontSize = r1;
    }

    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    public final void setFontWeight(FontWeight r1) {
        this.fontWeight = r1;
    }

    /* JADX INFO: renamed from: getFontStyle-4Lr2A7w, reason: not valid java name */
    public final FontStyle m6138getFontStyle4Lr2A7w() {
        return this.fontStyle;
    }

    /* JADX INFO: renamed from: setFontStyle-mLjRB2g, reason: not valid java name */
    public final void m6145setFontStylemLjRB2g(FontStyle r1) {
        this.fontStyle = r1;
    }

    /* JADX INFO: renamed from: getFontSynthesis-ZQGJjVo, reason: not valid java name */
    public final FontSynthesis m6139getFontSynthesisZQGJjVo() {
        return this.fontSynthesis;
    }

    /* JADX INFO: renamed from: setFontSynthesis-tDdu0R4, reason: not valid java name */
    public final void m6146setFontSynthesistDdu0R4(FontSynthesis r1) {
        this.fontSynthesis = r1;
    }

    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    public final void setFontFamily(FontFamily r1) {
        this.fontFamily = r1;
    }

    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    public final void setFontFeatureSettings(String r1) {
        this.fontFeatureSettings = r1;
    }

    /* JADX INFO: renamed from: getLetterSpacing-XSAIIZE, reason: not valid java name */
    public final long m6140getLetterSpacingXSAIIZE() {
        return this.letterSpacing;
    }

    /* JADX INFO: renamed from: setLetterSpacing--R2X_6o, reason: not valid java name */
    public final void m6147setLetterSpacingR2X_6o(long r1) {
        this.letterSpacing = r1;
    }

    /* JADX INFO: renamed from: getBaselineShift-5SSeXJ0, reason: not valid java name */
    public final BaselineShift m6135getBaselineShift5SSeXJ0() {
        return this.baselineShift;
    }

    /* JADX INFO: renamed from: setBaselineShift-_isdbwI, reason: not valid java name */
    public final void m6142setBaselineShift_isdbwI(BaselineShift r1) {
        this.baselineShift = r1;
    }

    public final TextGeometricTransform getTextGeometricTransform() {
        return this.textGeometricTransform;
    }

    public final void setTextGeometricTransform(TextGeometricTransform r1) {
        this.textGeometricTransform = r1;
    }

    public final LocaleList getLocaleList() {
        return this.localeList;
    }

    public final void setLocaleList(LocaleList r1) {
        this.localeList = r1;
    }

    /* JADX INFO: renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m6134getBackground0d7_KjU() {
        return this.background;
    }

    /* JADX INFO: renamed from: setBackground-8_81llA, reason: not valid java name */
    public final void m6141setBackground8_81llA(long r1) {
        this.background = r1;
    }

    public final TextDecoration getTextDecoration() {
        return this.textDecoration;
    }

    public final void setTextDecoration(TextDecoration r1) {
        this.textDecoration = r1;
    }

    public final Shadow getShadow() {
        return this.shadow;
    }

    public final void setShadow(Shadow r1) {
        this.shadow = r1;
    }

    public final SpanStyle toSpanStyle() {
        return new SpanStyle(this.color, this.fontSize, this.fontWeight, this.fontStyle, this.fontSynthesis, this.fontFamily, this.fontFeatureSettings, this.letterSpacing, this.baselineShift, this.textGeometricTransform, this.localeList, this.background, this.textDecoration, this.shadow, null, null, 49152, null);
    }
}
