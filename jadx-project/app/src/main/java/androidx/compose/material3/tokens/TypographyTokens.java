package androidx.compose.material3.tokens;

import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import kotlin.Metadata;

/* JADX INFO: compiled from: TypographyTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0011\u0010\u0017\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0011\u0010\u0019\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0011\u0010\u001b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0011\u0010\u001d\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0011\u0010\u001f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006R\u0011\u0010!\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0006¨\u0006#"}, d2 = {"Landroidx/compose/material3/tokens/TypographyTokens;", "", "()V", "BodyLarge", "Landroidx/compose/ui/text/TextStyle;", "getBodyLarge", "()Landroidx/compose/ui/text/TextStyle;", "BodyMedium", "getBodyMedium", "BodySmall", "getBodySmall", "DisplayLarge", "getDisplayLarge", "DisplayMedium", "getDisplayMedium", "DisplaySmall", "getDisplaySmall", "HeadlineLarge", "getHeadlineLarge", "HeadlineMedium", "getHeadlineMedium", "HeadlineSmall", "getHeadlineSmall", "LabelLarge", "getLabelLarge", "LabelMedium", "getLabelMedium", "LabelSmall", "getLabelSmall", "TitleLarge", "getTitleLarge", "TitleMedium", "getTitleMedium", "TitleSmall", "getTitleSmall", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TypographyTokens {
    public static final int $stable = 0;
    private static final TextStyle BodyLarge = null;
    private static final TextStyle BodyMedium = null;
    private static final TextStyle BodySmall = null;
    private static final TextStyle DisplayLarge = null;
    private static final TextStyle DisplayMedium = null;
    private static final TextStyle DisplaySmall = null;
    private static final TextStyle HeadlineLarge = null;
    private static final TextStyle HeadlineMedium = null;
    private static final TextStyle HeadlineSmall = null;
    public static final TypographyTokens INSTANCE = null;
    private static final TextStyle LabelLarge = null;
    private static final TextStyle LabelMedium = null;
    private static final TextStyle LabelSmall = null;
    private static final TextStyle TitleLarge = null;
    private static final TextStyle TitleMedium = null;
    private static final TextStyle TitleSmall = null;

    private TypographyTokens() {
    }

    public final TextStyle getBodyLarge() {
        return BodyLarge;
    }

    static {
        INSTANCE = new TypographyTokens();
        TextStyle r1 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily r0 = TypeScaleTokens.INSTANCE.getBodyLargeFont();
        FontWeight r6 = TypeScaleTokens.INSTANCE.getBodyLargeWeight();
        long r4 = TypeScaleTokens.INSTANCE.m3698getBodyLargeSizeXSAIIZE();
        long r23 = TypeScaleTokens.INSTANCE.m3697getBodyLargeLineHeightXSAIIZE();
        GenericFontFamily r9 = r0;
        BodyLarge = TextStyle.m6430copyp1EtxEg$default(r1, 0, r4, r6, null, null, r9, null, TypeScaleTokens.INSTANCE.m3699getBodyLargeTrackingXSAIIZE(), null, null, null, 0, null, null, null, 0, 0, r23, null, null, null, 0, 0, null, 16645977, null);
        TextStyle r2 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily r3 = TypeScaleTokens.INSTANCE.getBodyMediumFont();
        FontWeight r7 = TypeScaleTokens.INSTANCE.getBodyMediumWeight();
        long r5 = TypeScaleTokens.INSTANCE.m3701getBodyMediumSizeXSAIIZE();
        long r24 = TypeScaleTokens.INSTANCE.m3700getBodyMediumLineHeightXSAIIZE();
        GenericFontFamily r10 = r3;
        BodyMedium = TextStyle.m6430copyp1EtxEg$default(r2, 0, r5, r7, null, null, r10, null, TypeScaleTokens.INSTANCE.m3702getBodyMediumTrackingXSAIIZE(), null, null, null, 0, null, null, null, 0, 0, r24, null, null, null, 0, 0, null, 16645977, null);
        TextStyle r8 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily r11 = TypeScaleTokens.INSTANCE.getBodySmallFont();
        FontWeight r12 = TypeScaleTokens.INSTANCE.getBodySmallWeight();
        long r13 = TypeScaleTokens.INSTANCE.m3704getBodySmallSizeXSAIIZE();
        long r25 = TypeScaleTokens.INSTANCE.m3703getBodySmallLineHeightXSAIIZE();
        GenericFontFamily r14 = r11;
        BodySmall = TextStyle.m6430copyp1EtxEg$default(r8, 0, r13, r12, null, null, r14, null, TypeScaleTokens.INSTANCE.m3705getBodySmallTrackingXSAIIZE(), null, null, null, 0, null, null, null, 0, 0, r25, null, null, null, 0, 0, null, 16645977, null);
        TextStyle r15 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily r16 = TypeScaleTokens.INSTANCE.getDisplayLargeFont();
        FontWeight r17 = TypeScaleTokens.INSTANCE.getDisplayLargeWeight();
        long r18 = TypeScaleTokens.INSTANCE.m3707getDisplayLargeSizeXSAIIZE();
        long r26 = TypeScaleTokens.INSTANCE.m3706getDisplayLargeLineHeightXSAIIZE();
        GenericFontFamily r19 = r16;
        DisplayLarge = TextStyle.m6430copyp1EtxEg$default(r15, 0, r18, r17, null, null, r19, null, TypeScaleTokens.INSTANCE.m3708getDisplayLargeTrackingXSAIIZE(), null, null, null, 0, null, null, null, 0, 0, r26, null, null, null, 0, 0, null, 16645977, null);
        TextStyle r20 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily r21 = TypeScaleTokens.INSTANCE.getDisplayMediumFont();
        FontWeight r22 = TypeScaleTokens.INSTANCE.getDisplayMediumWeight();
        long r27 = TypeScaleTokens.INSTANCE.m3710getDisplayMediumSizeXSAIIZE();
        long r28 = TypeScaleTokens.INSTANCE.m3709getDisplayMediumLineHeightXSAIIZE();
        GenericFontFamily r29 = r21;
        DisplayMedium = TextStyle.m6430copyp1EtxEg$default(r20, 0, r27, r22, null, null, r29, null, TypeScaleTokens.INSTANCE.m3711getDisplayMediumTrackingXSAIIZE(), null, null, null, 0, null, null, null, 0, 0, r28, null, null, null, 0, 0, null, 16645977, null);
        TextStyle r30 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily r31 = TypeScaleTokens.INSTANCE.getDisplaySmallFont();
        FontWeight r32 = TypeScaleTokens.INSTANCE.getDisplaySmallWeight();
        long r33 = TypeScaleTokens.INSTANCE.m3713getDisplaySmallSizeXSAIIZE();
        long r210 = TypeScaleTokens.INSTANCE.m3712getDisplaySmallLineHeightXSAIIZE();
        GenericFontFamily r34 = r31;
        DisplaySmall = TextStyle.m6430copyp1EtxEg$default(r30, 0, r33, r32, null, null, r34, null, TypeScaleTokens.INSTANCE.m3714getDisplaySmallTrackingXSAIIZE(), null, null, null, 0, null, null, null, 0, 0, r210, null, null, null, 0, 0, null, 16645977, null);
        TextStyle r35 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily r36 = TypeScaleTokens.INSTANCE.getHeadlineLargeFont();
        FontWeight r37 = TypeScaleTokens.INSTANCE.getHeadlineLargeWeight();
        long r38 = TypeScaleTokens.INSTANCE.m3716getHeadlineLargeSizeXSAIIZE();
        long r211 = TypeScaleTokens.INSTANCE.m3715getHeadlineLargeLineHeightXSAIIZE();
        GenericFontFamily r39 = r36;
        HeadlineLarge = TextStyle.m6430copyp1EtxEg$default(r35, 0, r38, r37, null, null, r39, null, TypeScaleTokens.INSTANCE.m3717getHeadlineLargeTrackingXSAIIZE(), null, null, null, 0, null, null, null, 0, 0, r211, null, null, null, 0, 0, null, 16645977, null);
        TextStyle r40 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily r41 = TypeScaleTokens.INSTANCE.getHeadlineMediumFont();
        FontWeight r42 = TypeScaleTokens.INSTANCE.getHeadlineMediumWeight();
        long r43 = TypeScaleTokens.INSTANCE.m3719getHeadlineMediumSizeXSAIIZE();
        long r212 = TypeScaleTokens.INSTANCE.m3718getHeadlineMediumLineHeightXSAIIZE();
        GenericFontFamily r44 = r41;
        HeadlineMedium = TextStyle.m6430copyp1EtxEg$default(r40, 0, r43, r42, null, null, r44, null, TypeScaleTokens.INSTANCE.m3720getHeadlineMediumTrackingXSAIIZE(), null, null, null, 0, null, null, null, 0, 0, r212, null, null, null, 0, 0, null, 16645977, null);
        TextStyle r45 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily r46 = TypeScaleTokens.INSTANCE.getHeadlineSmallFont();
        FontWeight r47 = TypeScaleTokens.INSTANCE.getHeadlineSmallWeight();
        long r48 = TypeScaleTokens.INSTANCE.m3722getHeadlineSmallSizeXSAIIZE();
        long r213 = TypeScaleTokens.INSTANCE.m3721getHeadlineSmallLineHeightXSAIIZE();
        GenericFontFamily r49 = r46;
        HeadlineSmall = TextStyle.m6430copyp1EtxEg$default(r45, 0, r48, r47, null, null, r49, null, TypeScaleTokens.INSTANCE.m3723getHeadlineSmallTrackingXSAIIZE(), null, null, null, 0, null, null, null, 0, 0, r213, null, null, null, 0, 0, null, 16645977, null);
        TextStyle r50 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily r51 = TypeScaleTokens.INSTANCE.getLabelLargeFont();
        FontWeight r52 = TypeScaleTokens.INSTANCE.getLabelLargeWeight();
        long r53 = TypeScaleTokens.INSTANCE.m3725getLabelLargeSizeXSAIIZE();
        long r214 = TypeScaleTokens.INSTANCE.m3724getLabelLargeLineHeightXSAIIZE();
        GenericFontFamily r54 = r51;
        LabelLarge = TextStyle.m6430copyp1EtxEg$default(r50, 0, r53, r52, null, null, r54, null, TypeScaleTokens.INSTANCE.m3726getLabelLargeTrackingXSAIIZE(), null, null, null, 0, null, null, null, 0, 0, r214, null, null, null, 0, 0, null, 16645977, null);
        TextStyle r55 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily r56 = TypeScaleTokens.INSTANCE.getLabelMediumFont();
        FontWeight r57 = TypeScaleTokens.INSTANCE.getLabelMediumWeight();
        long r58 = TypeScaleTokens.INSTANCE.m3728getLabelMediumSizeXSAIIZE();
        long r215 = TypeScaleTokens.INSTANCE.m3727getLabelMediumLineHeightXSAIIZE();
        GenericFontFamily r59 = r56;
        LabelMedium = TextStyle.m6430copyp1EtxEg$default(r55, 0, r58, r57, null, null, r59, null, TypeScaleTokens.INSTANCE.m3729getLabelMediumTrackingXSAIIZE(), null, null, null, 0, null, null, null, 0, 0, r215, null, null, null, 0, 0, null, 16645977, null);
        TextStyle r60 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily r61 = TypeScaleTokens.INSTANCE.getLabelSmallFont();
        FontWeight r62 = TypeScaleTokens.INSTANCE.getLabelSmallWeight();
        long r63 = TypeScaleTokens.INSTANCE.m3731getLabelSmallSizeXSAIIZE();
        long r216 = TypeScaleTokens.INSTANCE.m3730getLabelSmallLineHeightXSAIIZE();
        GenericFontFamily r64 = r61;
        LabelSmall = TextStyle.m6430copyp1EtxEg$default(r60, 0, r63, r62, null, null, r64, null, TypeScaleTokens.INSTANCE.m3732getLabelSmallTrackingXSAIIZE(), null, null, null, 0, null, null, null, 0, 0, r216, null, null, null, 0, 0, null, 16645977, null);
        TextStyle r65 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily r66 = TypeScaleTokens.INSTANCE.getTitleLargeFont();
        FontWeight r67 = TypeScaleTokens.INSTANCE.getTitleLargeWeight();
        long r68 = TypeScaleTokens.INSTANCE.m3734getTitleLargeSizeXSAIIZE();
        long r217 = TypeScaleTokens.INSTANCE.m3733getTitleLargeLineHeightXSAIIZE();
        GenericFontFamily r69 = r66;
        TitleLarge = TextStyle.m6430copyp1EtxEg$default(r65, 0, r68, r67, null, null, r69, null, TypeScaleTokens.INSTANCE.m3735getTitleLargeTrackingXSAIIZE(), null, null, null, 0, null, null, null, 0, 0, r217, null, null, null, 0, 0, null, 16645977, null);
        TextStyle r70 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily r71 = TypeScaleTokens.INSTANCE.getTitleMediumFont();
        FontWeight r72 = TypeScaleTokens.INSTANCE.getTitleMediumWeight();
        long r73 = TypeScaleTokens.INSTANCE.m3737getTitleMediumSizeXSAIIZE();
        long r218 = TypeScaleTokens.INSTANCE.m3736getTitleMediumLineHeightXSAIIZE();
        GenericFontFamily r74 = r71;
        TitleMedium = TextStyle.m6430copyp1EtxEg$default(r70, 0, r73, r72, null, null, r74, null, TypeScaleTokens.INSTANCE.m3738getTitleMediumTrackingXSAIIZE(), null, null, null, 0, null, null, null, 0, 0, r218, null, null, null, 0, 0, null, 16645977, null);
        TextStyle r75 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily r76 = TypeScaleTokens.INSTANCE.getTitleSmallFont();
        FontWeight r77 = TypeScaleTokens.INSTANCE.getTitleSmallWeight();
        long r78 = TypeScaleTokens.INSTANCE.m3740getTitleSmallSizeXSAIIZE();
        long r219 = TypeScaleTokens.INSTANCE.m3739getTitleSmallLineHeightXSAIIZE();
        GenericFontFamily r79 = r76;
        TitleSmall = TextStyle.m6430copyp1EtxEg$default(r75, 0, r78, r77, null, null, r79, null, TypeScaleTokens.INSTANCE.m3741getTitleSmallTrackingXSAIIZE(), null, null, null, 0, null, null, null, 0, 0, r219, null, null, null, 0, 0, null, 16645977, null);
    }

    public final TextStyle getBodyMedium() {
        return BodyMedium;
    }

    public final TextStyle getBodySmall() {
        return BodySmall;
    }

    public final TextStyle getDisplayLarge() {
        return DisplayLarge;
    }

    public final TextStyle getDisplayMedium() {
        return DisplayMedium;
    }

    public final TextStyle getDisplaySmall() {
        return DisplaySmall;
    }

    public final TextStyle getHeadlineLarge() {
        return HeadlineLarge;
    }

    public final TextStyle getHeadlineMedium() {
        return HeadlineMedium;
    }

    public final TextStyle getHeadlineSmall() {
        return HeadlineSmall;
    }

    public final TextStyle getLabelLarge() {
        return LabelLarge;
    }

    public final TextStyle getLabelMedium() {
        return LabelMedium;
    }

    public final TextStyle getLabelSmall() {
        return LabelSmall;
    }

    public final TextStyle getTitleLarge() {
        return TitleLarge;
    }

    public final TextStyle getTitleMedium() {
        return TitleMedium;
    }

    public final TextStyle getTitleSmall() {
        return TitleSmall;
    }
}
