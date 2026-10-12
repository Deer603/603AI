package androidx.compose.material;

import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.SystemFontFamily;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Typography.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0093\u0001\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005¢\u0006\u0002\u0010\u0012Bo\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0002\u0010\u0013J\u0088\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020)H\u0016R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015¨\u0006*"}, d2 = {"Landroidx/compose/material/Typography;", "", "defaultFontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "h1", "Landroidx/compose/ui/text/TextStyle;", "h2", "h3", "h4", "h5", "h6", "subtitle1", "subtitle2", "body1", "body2", "button", "caption", "overline", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "getBody1", "()Landroidx/compose/ui/text/TextStyle;", "getBody2", "getButton", "getCaption", "getH1", "getH2", "getH3", "getH4", "getH5", "getH6", "getOverline", "getSubtitle1", "getSubtitle2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Typography {
    public static final int $stable = 0;
    private final TextStyle body1;
    private final TextStyle body2;
    private final TextStyle button;
    private final TextStyle caption;
    private final TextStyle h1;
    private final TextStyle h2;
    private final TextStyle h3;
    private final TextStyle h4;
    private final TextStyle h5;
    private final TextStyle h6;
    private final TextStyle overline;
    private final TextStyle subtitle1;
    private final TextStyle subtitle2;

    static {
    }

    public Typography(TextStyle h1, TextStyle h2, TextStyle h3, TextStyle h4, TextStyle h5, TextStyle h6, TextStyle subtitle1, TextStyle subtitle2, TextStyle body1, TextStyle body2, TextStyle button, TextStyle caption, TextStyle overline) {
        this.h1 = h1;
        this.h2 = h2;
        this.h3 = h3;
        this.h4 = h4;
        this.h5 = h5;
        this.h6 = h6;
        this.subtitle1 = subtitle1;
        this.subtitle2 = subtitle2;
        this.body1 = body1;
        this.body2 = body2;
        this.button = button;
        this.caption = caption;
        this.overline = overline;
    }

    public final TextStyle getH1() {
        return this.h1;
    }

    public final TextStyle getH2() {
        return this.h2;
    }

    public final TextStyle getH3() {
        return this.h3;
    }

    public final TextStyle getH4() {
        return this.h4;
    }

    public final TextStyle getH5() {
        return this.h5;
    }

    public final TextStyle getH6() {
        return this.h6;
    }

    public final TextStyle getSubtitle1() {
        return this.subtitle1;
    }

    public final TextStyle getSubtitle2() {
        return this.subtitle2;
    }

    public final TextStyle getBody1() {
        return this.body1;
    }

    public final TextStyle getBody2() {
        return this.body2;
    }

    public final TextStyle getButton() {
        return this.button;
    }

    public final TextStyle getCaption() {
        return this.caption;
    }

    public final TextStyle getOverline() {
        return this.overline;
    }

    public /* synthetic */ Typography(FontFamily r49, TextStyle r50, TextStyle r51, TextStyle r52, TextStyle r53, TextStyle r54, TextStyle r55, TextStyle r56, TextStyle r57, TextStyle r58, TextStyle r59, TextStyle r60, TextStyle r61, TextStyle r62, int r63, DefaultConstructorMarker r64) {
        if ((r63 & 1) == 0) goto L5;
        SystemFontFamily r1 = FontFamily.Companion.getDefault();
    L7:
        if ((r63 & 2) == 0) goto L9;
        TextStyle r3 = TypographyKt.getDefaultTextStyle();
        FontWeight r8 = FontWeight.Companion.getLight();
        long r6 = TextUnitKt.getSp(96);
        long r25 = TextUnitKt.getSp(112);
        TextStyle r2 = TextStyle.m6430copyp1EtxEg$default(r3, 0, r6, r8, null, null, null, null, TextUnitKt.getSp(-1.5d), null, null, null, 0, null, null, null, 0, 0, r25, null, null, null, 0, 0, null, 16646009, null);
    L11:
        if ((r63 & 4) == 0) goto L13;
        TextStyle r4 = TypographyKt.getDefaultTextStyle();
        FontWeight r9 = FontWeight.Companion.getLight();
        long r7 = TextUnitKt.getSp(60);
        long r26 = TextUnitKt.getSp(72);
        TextStyle r5 = TextStyle.m6430copyp1EtxEg$default(r4, 0, r7, r9, null, null, null, null, TextUnitKt.getSp(-0.5d), null, null, null, 0, null, null, null, 0, 0, r26, null, null, null, 0, 0, null, 16646009, null);
    L15:
        if ((r63 & 8) == 0) goto L17;
        TextStyle r10 = TypographyKt.getDefaultTextStyle();
        FontWeight r11 = FontWeight.Companion.getNormal();
        long r12 = TextUnitKt.getSp(48);
        long r28 = TextUnitKt.getSp(56);
        TextStyle r13 = TextStyle.m6430copyp1EtxEg$default(r10, 0, r12, r11, null, null, null, null, TextUnitKt.getSp(0), null, null, null, 0, null, null, null, 0, 0, r28, null, null, null, 0, 0, null, 16646009, null);
    L19:
        if ((r63 & 16) == 0) goto L21;
        TextStyle r14 = TypographyKt.getDefaultTextStyle();
        FontWeight r15 = FontWeight.Companion.getNormal();
        long r16 = TextUnitKt.getSp(34);
        long r31 = TextUnitKt.getSp(36);
        TextStyle r17 = TextStyle.m6430copyp1EtxEg$default(r14, 0, r16, r15, null, null, null, null, TextUnitKt.getSp(0.25d), null, null, null, 0, null, null, null, 0, 0, r31, null, null, null, 0, 0, null, 16646009, null);
    L23:
        if ((r63 & 32) == 0) goto L25;
        TextStyle r18 = TypographyKt.getDefaultTextStyle();
        FontWeight r19 = FontWeight.Companion.getNormal();
        long r110 = TextUnitKt.getSp(24);
        long r33 = TextUnitKt.getSp(24);
        TextStyle r20 = TextStyle.m6430copyp1EtxEg$default(r18, 0, r110, r19, null, null, null, null, TextUnitKt.getSp(0), null, null, null, 0, null, null, null, 0, 0, r33, null, null, null, 0, 0, null, 16646009, null);
    L27:
        if ((r63 & 64) == 0) goto L29;
        TextStyle r111 = TypographyKt.getDefaultTextStyle();
        FontWeight r112 = FontWeight.Companion.getMedium();
        long r113 = TextUnitKt.getSp(20);
        long r36 = TextUnitKt.getSp(24);
        TextStyle r21 = TextStyle.m6430copyp1EtxEg$default(r111, 0, r113, r112, null, null, null, null, TextUnitKt.getSp(0.15d), null, null, null, 0, null, null, null, 0, 0, r36, null, null, null, 0, 0, null, 16646009, null);
    L31:
        if ((r63 & 128) == 0) goto L33;
        TextStyle r114 = TypographyKt.getDefaultTextStyle();
        FontWeight r22 = FontWeight.Companion.getNormal();
        long r115 = TextUnitKt.getSp(16);
        long r38 = TextUnitKt.getSp(24);
        TextStyle r116 = TextStyle.m6430copyp1EtxEg$default(r114, 0, r115, r22, null, null, null, null, TextUnitKt.getSp(0.15d), null, null, null, 0, null, null, null, 0, 0, r38, null, null, null, 0, 0, null, 16646009, null);
    L35:
        if ((r63 & 256) == 0) goto L37;
        TextStyle r117 = TypographyKt.getDefaultTextStyle();
        FontWeight r23 = FontWeight.Companion.getMedium();
        long r118 = TextUnitKt.getSp(14);
        long r39 = TextUnitKt.getSp(24);
        TextStyle r119 = TextStyle.m6430copyp1EtxEg$default(r117, 0, r118, r23, null, null, null, null, TextUnitKt.getSp(0.1d), null, null, null, 0, null, null, null, 0, 0, r39, null, null, null, 0, 0, null, 16646009, null);
    L39:
        if ((r63 & 512) == 0) goto L41;
        TextStyle r120 = TypographyKt.getDefaultTextStyle();
        FontWeight r24 = FontWeight.Companion.getNormal();
        long r121 = TextUnitKt.getSp(16);
        long r310 = TextUnitKt.getSp(24);
        TextStyle r27 = TextStyle.m6430copyp1EtxEg$default(r120, 0, r121, r24, null, null, null, null, TextUnitKt.getSp(0.5d), null, null, null, 0, null, null, null, 0, 0, r310, null, null, null, 0, 0, null, 16646009, null);
    L43:
        if ((r63 & 1024) == 0) goto L45;
        TextStyle r122 = TypographyKt.getDefaultTextStyle();
        FontWeight r29 = FontWeight.Companion.getNormal();
        long r123 = TextUnitKt.getSp(14);
        long r311 = TextUnitKt.getSp(20);
        TextStyle r30 = TextStyle.m6430copyp1EtxEg$default(r122, 0, r123, r29, null, null, null, null, TextUnitKt.getSp(0.25d), null, null, null, 0, null, null, null, 0, 0, r311, null, null, null, 0, 0, null, 16646009, null);
    L47:
        if ((r63 & 2048) == 0) goto L49;
        TextStyle r124 = TypographyKt.getDefaultTextStyle();
        FontWeight r210 = FontWeight.Companion.getMedium();
        long r125 = TextUnitKt.getSp(14);
        long r312 = TextUnitKt.getSp(16);
        TextStyle r126 = TextStyle.m6430copyp1EtxEg$default(r124, 0, r125, r210, null, null, null, null, TextUnitKt.getSp(1.25d), null, null, null, 0, null, null, null, 0, 0, r312, null, null, null, 0, 0, null, 16646009, null);
    L51:
        if ((r63 & 4096) == 0) goto L53;
        TextStyle r127 = TypographyKt.getDefaultTextStyle();
        FontWeight r211 = FontWeight.Companion.getNormal();
        long r128 = TextUnitKt.getSp(12);
        long r313 = TextUnitKt.getSp(16);
        TextStyle r129 = TextStyle.m6430copyp1EtxEg$default(r127, 0, r128, r211, null, null, null, null, TextUnitKt.getSp(0.4d), null, null, null, 0, null, null, null, 0, 0, r313, null, null, null, 0, 0, null, 16646009, null);
    L55:
        if ((r63 & 8192) == 0) goto L57;
        TextStyle r130 = TypographyKt.getDefaultTextStyle();
        FontWeight r212 = FontWeight.Companion.getNormal();
        long r131 = TextUnitKt.getSp(10);
        long r314 = TextUnitKt.getSp(16);
        TextStyle r0 = TextStyle.m6430copyp1EtxEg$default(r130, 0, r131, r212, null, null, null, null, TextUnitKt.getSp(1.5d), null, null, null, 0, null, null, null, 0, 0, r314, null, null, null, 0, 0, null, 16646009, null);
    L58:
        FontFamily r510 = r1;
        TextStyle r511 = r2;
        TextStyle r512 = r5;
        TextStyle r513 = r13;
        TextStyle r514 = r20;
        TextStyle r515 = r17;
        TextStyle r516 = r27;
        TextStyle r65 = r30;
        TextStyle r517 = r21;
        TextStyle r66 = r126;
        TextStyle r518 = r116;
        TextStyle r519 = r119;
        TextStyle r67 = r129;
        this(r510, r511, r512, r513, r515, r514, r517, r518, r519, r516, r65, r66, r67, r0);
        return;
    L57:
        r0 = r62;
        goto L58
    L53:
        r129 = r61;
        goto L55
    L49:
        r126 = r60;
        goto L51
    L45:
        r30 = r59;
        goto L47
    L41:
        r27 = r58;
        goto L43
    L37:
        r119 = r57;
        goto L39
    L33:
        r116 = r56;
        goto L35
    L29:
        r21 = r55;
        goto L31
    L25:
        r20 = r54;
        goto L27
    L21:
        r17 = r53;
        goto L23
    L17:
        r13 = r52;
        goto L19
    L13:
        r5 = r51;
        goto L15
    L9:
        r2 = r50;
        goto L11
    L5:
        r1 = r49;
        goto L7
    }

    public Typography(FontFamily defaultFontFamily, TextStyle h1, TextStyle h2, TextStyle h3, TextStyle h4, TextStyle h5, TextStyle h6, TextStyle subtitle1, TextStyle subtitle2, TextStyle body1, TextStyle body2, TextStyle button, TextStyle caption, TextStyle overline) {
        this(TypographyKt.access$withDefaultFontFamily(h1, defaultFontFamily), TypographyKt.access$withDefaultFontFamily(h2, defaultFontFamily), TypographyKt.access$withDefaultFontFamily(h3, defaultFontFamily), TypographyKt.access$withDefaultFontFamily(h4, defaultFontFamily), TypographyKt.access$withDefaultFontFamily(h5, defaultFontFamily), TypographyKt.access$withDefaultFontFamily(h6, defaultFontFamily), TypographyKt.access$withDefaultFontFamily(subtitle1, defaultFontFamily), TypographyKt.access$withDefaultFontFamily(subtitle2, defaultFontFamily), TypographyKt.access$withDefaultFontFamily(body1, defaultFontFamily), TypographyKt.access$withDefaultFontFamily(body2, defaultFontFamily), TypographyKt.access$withDefaultFontFamily(button, defaultFontFamily), TypographyKt.access$withDefaultFontFamily(caption, defaultFontFamily), TypographyKt.access$withDefaultFontFamily(overline, defaultFontFamily));
    }

    public static /* synthetic */ Typography copy$default(Typography r12, TextStyle r13, TextStyle r14, TextStyle r15, TextStyle r16, TextStyle r17, TextStyle r18, TextStyle r19, TextStyle r20, TextStyle r21, TextStyle r22, TextStyle r23, TextStyle r24, TextStyle r25, int r26, Object r27) {
        if ((r26 & 1) == 0) goto L6;
        r13 = r12.h1;
    L6:
        if ((r26 & 2) == 0) goto L8;
        TextStyle r1 = r12.h2;
    L10:
        if ((r26 & 4) == 0) goto L12;
        TextStyle r2 = r12.h3;
    L14:
        if ((r26 & 8) == 0) goto L16;
        TextStyle r3 = r12.h4;
    L18:
        if ((r26 & 16) == 0) goto L20;
        TextStyle r4 = r12.h5;
    L22:
        if ((r26 & 32) == 0) goto L24;
        TextStyle r5 = r12.h6;
    L26:
        if ((r26 & 64) == 0) goto L28;
        TextStyle r6 = r12.subtitle1;
    L30:
        if ((r26 & 128) == 0) goto L32;
        TextStyle r7 = r12.subtitle2;
    L34:
        if ((r26 & 256) == 0) goto L36;
        TextStyle r8 = r12.body1;
    L38:
        if ((r26 & 512) == 0) goto L40;
        TextStyle r9 = r12.body2;
    L42:
        if ((r26 & 1024) == 0) goto L44;
        TextStyle r10 = r12.button;
    L46:
        if ((r26 & 2048) == 0) goto L48;
        TextStyle r11 = r12.caption;
    L50:
        if ((r26 & 4096) == 0) goto L52;
        TextStyle r0 = r12.overline;
    L53:
        TextStyle r110 = r1;
        TextStyle r111 = r2;
        TextStyle r112 = r3;
        TextStyle r113 = r4;
        TextStyle r28 = r5;
        TextStyle r29 = r6;
        TextStyle r210 = r7;
        TextStyle r211 = r8;
        TextStyle r212 = r9;
        TextStyle r213 = r10;
        TextStyle r214 = r11;
        return r12.copy(r13, r110, r111, r112, r113, r28, r29, r210, r211, r212, r213, r214, r0);
    L52:
        r0 = r25;
        goto L53
    L48:
        r11 = r24;
        goto L50
    L44:
        r10 = r23;
        goto L46
    L40:
        r9 = r22;
        goto L42
    L36:
        r8 = r21;
        goto L38
    L32:
        r7 = r20;
        goto L34
    L28:
        r6 = r19;
        goto L30
    L24:
        r5 = r18;
        goto L26
    L20:
        r4 = r17;
        goto L22
    L16:
        r3 = r16;
        goto L18
    L12:
        r2 = r15;
        goto L14
    L8:
        r1 = r14;
        goto L10
    }

    public final Typography copy(TextStyle h1, TextStyle h2, TextStyle h3, TextStyle h4, TextStyle h5, TextStyle h6, TextStyle subtitle1, TextStyle subtitle2, TextStyle body1, TextStyle body2, TextStyle button, TextStyle caption, TextStyle overline) {
        return new Typography(h1, h2, h3, h4, h5, h6, subtitle1, subtitle2, body1, body2, button, caption, overline);
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof Typography) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.areEqual(this.h1, ((Typography) other).h1) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.h2, ((Typography) other).h2) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.areEqual(this.h3, ((Typography) other).h3) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.areEqual(this.h4, ((Typography) other).h4) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.areEqual(this.h5, ((Typography) other).h5) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.areEqual(this.h6, ((Typography) other).h6) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.areEqual(this.subtitle1, ((Typography) other).subtitle1) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.areEqual(this.subtitle2, ((Typography) other).subtitle2) == true) goto L33;
        return false;
    L33:
        if (Intrinsics.areEqual(this.body1, ((Typography) other).body1) == true) goto L36;
        return false;
    L36:
        if (Intrinsics.areEqual(this.body2, ((Typography) other).body2) == true) goto L39;
        return false;
    L39:
        if (Intrinsics.areEqual(this.button, ((Typography) other).button) == true) goto L42;
        return false;
    L42:
        if (Intrinsics.areEqual(this.caption, ((Typography) other).caption) == true) goto L45;
        return false;
    L45:
        if (Intrinsics.areEqual(this.overline, ((Typography) other).overline) == true) goto L47;
        return false;
    L47:
        return true;
    }

    public int hashCode() {
        int result = this.h1.hashCode();
        int result2 = (result * 31) + this.h2.hashCode();
        return (((((((((((((((((((((result2 * 31) + this.h3.hashCode()) * 31) + this.h4.hashCode()) * 31) + this.h5.hashCode()) * 31) + this.h6.hashCode()) * 31) + this.subtitle1.hashCode()) * 31) + this.subtitle2.hashCode()) * 31) + this.body1.hashCode()) * 31) + this.body2.hashCode()) * 31) + this.button.hashCode()) * 31) + this.caption.hashCode()) * 31) + this.overline.hashCode();
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("Typography(h1=").append(this.h1).append(", h2=").append(this.h2).append(", h3=").append(this.h3).append(", h4=").append(this.h4).append(", h5=").append(this.h5).append(", h6=").append(this.h6).append(", subtitle1=").append(this.subtitle1).append(", subtitle2=").append(this.subtitle2).append(", body1=").append(this.body1).append(", body2=").append(this.body2).append(", button=").append(this.button).append(", caption=");
        r0.append(this.caption).append(", overline=").append(this.overline).append(')');
        return r0.toString();
    }
}
