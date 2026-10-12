package androidx.compose.material3;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.core.math.MathUtils;
import kotlin.Metadata;
import kotlin.math.MathKt;

/* JADX INFO: compiled from: DynamicTonalPalette.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u001a\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0001\u001a\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u001a\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u001a\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0001\u001a\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u001a\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u001a\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0002\u001a \u0010\u0012\u001a\u00020\u0013*\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"delinearized", "", "rgbComponent", "", "dynamicDarkColorScheme", "Landroidx/compose/material3/ColorScheme;", "context", "Landroid/content/Context;", "dynamicDarkColorScheme31", "tonalPalette", "Landroidx/compose/material3/TonalPalette;", "dynamicDarkColorScheme34", "dynamicLightColorScheme", "dynamicLightColorScheme31", "dynamicLightColorScheme34", "dynamicTonalPalette", "labInvf", "ft", "setLuminance", "Landroidx/compose/ui/graphics/Color;", "newLuminance", "setLuminance-DxMtmZc", "(JF)J", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DynamicTonalPaletteKt {
    public static final TonalPalette dynamicTonalPalette(Context context) {
        return new TonalPalette(ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral1_0), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral1_10), m2205setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral1_600), 98.0f), m2205setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral1_600), 96.0f), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral1_50), m2205setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral1_600), 94.0f), m2205setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral1_600), 92.0f), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral1_100), m2205setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral1_600), 87.0f), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral1_200), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral1_300), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral1_400), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral1_500), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral1_600), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral1_700), m2205setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral1_600), 24.0f), m2205setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral1_600), 22.0f), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral1_800), m2205setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral1_600), 17.0f), m2205setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral1_600), 12.0f), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral1_900), m2205setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral1_600), 6.0f), m2205setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral1_600), 4.0f), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral1_1000), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral2_0), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral2_10), m2205setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral2_600), 98.0f), m2205setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral2_600), 96.0f), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral2_50), m2205setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral2_600), 94.0f), m2205setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral2_600), 92.0f), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral2_100), m2205setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral2_600), 87.0f), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral2_200), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral2_300), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral2_400), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral2_500), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral2_600), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral2_700), m2205setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral2_600), 24.0f), m2205setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral2_600), 22.0f), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral2_800), m2205setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral2_600), 17.0f), m2205setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral2_600), 12.0f), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral2_900), m2205setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral2_600), 6.0f), m2205setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral2_600), 4.0f), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_neutral2_1000), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent1_0), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent1_10), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent1_50), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent1_100), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent1_200), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent1_300), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent1_400), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent1_500), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent1_600), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent1_700), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent1_800), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent1_900), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent1_1000), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent2_0), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent2_10), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent2_50), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent2_100), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent2_200), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent2_300), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent2_400), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent2_500), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent2_600), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent2_700), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent2_800), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent2_900), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent2_1000), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent3_0), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent3_10), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent3_50), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent3_100), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent3_200), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent3_300), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent3_400), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent3_500), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent3_600), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent3_700), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent3_800), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent3_900), ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_accent3_1000), null);
    }

    public static final ColorScheme dynamicLightColorScheme(Context context) {
        if (Build.VERSION.SDK_INT >= 34) goto L7;
        TonalPalette tonalPalette = dynamicTonalPalette(context);
        return dynamicLightColorScheme31(tonalPalette);
    L7:
        return dynamicLightColorScheme34(context);
    }

    public static final ColorScheme dynamicDarkColorScheme(Context context) {
        if (Build.VERSION.SDK_INT >= 34) goto L7;
        TonalPalette tonalPalette = dynamicTonalPalette(context);
        return dynamicDarkColorScheme31(tonalPalette);
    L7:
        return dynamicDarkColorScheme34(context);
    }

    /* JADX INFO: renamed from: setLuminance-DxMtmZc, reason: not valid java name */
    public static final long m2205setLuminanceDxMtmZc(long $this$setLuminance_u2dDxMtmZc, float newLuminance) {
        boolean r1 = true;
        if (newLuminance >= 1.0E-4d) goto L5;
        boolean r0 = true;
    L7:
        if (newLuminance > 99.9999d) goto L11;
        r1 = false;
    L11:
        if ((r0 | r1) == false) goto L14;
        float y = 100.0f * labInvf((16.0f + newLuminance) / 116.0f);
        int component = delinearized(y);
        return ColorKt.Color$default(component, component, component, 0, 8, null);
    L14:
        long sLAB = Color.m4363convertvNxB06k($this$setLuminance_u2dDxMtmZc, ColorSpaces.INSTANCE.getCieLab());
        return Color.m4363convertvNxB06k(ColorKt.Color$default(newLuminance, Color.m4371getGreenimpl(sLAB), Color.m4369getBlueimpl(sLAB), 0.0f, ColorSpaces.INSTANCE.getCieLab(), 8, null), ColorSpaces.INSTANCE.getSrgb());
    L5:
        r0 = false;
        goto L7
    }

    private static final float labInvf(float ft) {
        float ft3 = (ft * ft) * ft;
        if (ft3 <= 0.008856452f) goto L6;
        return ft3;
    L6:
        return ((116.0f * ft) - 16.0f) / 903.2963f;
    }

    private static final int delinearized(float rgbComponent) {
        float normalized = rgbComponent / 100.0f;
        if (normalized > 0.0031308d) goto L5;
        double delinearized = ((double) normalized) * 12.92d;
    L7:
        return MathUtils.clamp(MathKt.roundToInt(255.0d * delinearized), 0, 255);
    L5:
        delinearized = (Math.pow(normalized, 0.4166666666666667d) * 1.055d) - 0.055d;
        goto L7
    }

    public static final ColorScheme dynamicLightColorScheme31(TonalPalette tonalPalette) {
        long r1 = tonalPalette.m2933getPrimary400d7_KjU();
        long r3 = tonalPalette.m2930getPrimary1000d7_KjU();
        long r5 = tonalPalette.m2938getPrimary900d7_KjU();
        long r7 = tonalPalette.m2929getPrimary100d7_KjU();
        long r9 = tonalPalette.m2937getPrimary800d7_KjU();
        long r11 = tonalPalette.m2946getSecondary400d7_KjU();
        long r13 = tonalPalette.m2943getSecondary1000d7_KjU();
        long r15 = tonalPalette.m2951getSecondary900d7_KjU();
        long r17 = tonalPalette.m2942getSecondary100d7_KjU();
        long r19 = tonalPalette.m2959getTertiary400d7_KjU();
        long r21 = tonalPalette.m2956getTertiary1000d7_KjU();
        long r23 = tonalPalette.m2964getTertiary900d7_KjU();
        long r25 = tonalPalette.m2955getTertiary100d7_KjU();
        long r27 = tonalPalette.m2926getNeutralVariant980d7_KjU();
        long r29 = tonalPalette.m2905getNeutralVariant100d7_KjU();
        long r31 = tonalPalette.m2926getNeutralVariant980d7_KjU();
        long r33 = tonalPalette.m2905getNeutralVariant100d7_KjU();
        long r35 = tonalPalette.m2921getNeutralVariant900d7_KjU();
        long r37 = tonalPalette.m2912getNeutralVariant300d7_KjU();
        long r41 = tonalPalette.m2909getNeutralVariant200d7_KjU();
        long r43 = tonalPalette.m2924getNeutralVariant950d7_KjU();
        long r53 = tonalPalette.m2915getNeutralVariant500d7_KjU();
        long r55 = tonalPalette.m2919getNeutralVariant800d7_KjU();
        long r57 = tonalPalette.m2904getNeutralVariant00d7_KjU();
        long r59 = tonalPalette.m2926getNeutralVariant980d7_KjU();
        long r71 = tonalPalette.m2920getNeutralVariant870d7_KjU();
        long r61 = tonalPalette.m2923getNeutralVariant940d7_KjU();
        long r63 = tonalPalette.m2922getNeutralVariant920d7_KjU();
        long r65 = tonalPalette.m2921getNeutralVariant900d7_KjU();
        long r67 = tonalPalette.m2925getNeutralVariant960d7_KjU();
        long r69 = tonalPalette.m2906getNeutralVariant1000d7_KjU();
        return ColorSchemeKt.m2063lightColorSchemeCXl9yA$default(r1, r3, r5, r7, r9, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, tonalPalette.m2933getPrimary400d7_KjU(), r41, r43, 0, 0, 0, 0, r53, r55, r57, r59, r61, r63, r65, r67, r69, r71, 62914560, 0, null);
    }

    public static final ColorScheme dynamicLightColorScheme34(Context context) {
        long r3 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_primary_light);
        long r5 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_on_primary_light);
        long r7 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_primary_container_light);
        long r9 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_on_primary_container_light);
        long r11 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_primary_dark);
        long r13 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_secondary_light);
        long r15 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_on_secondary_light);
        long r1 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_secondary_container_light);
        long r2 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_on_secondary_container_light);
        long r4 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_tertiary_light);
        long r6 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_on_tertiary_light);
        long r8 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_tertiary_container_light);
        long r10 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_on_tertiary_container_light);
        long r12 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_background_light);
        long r14 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_on_background_light);
        long r16 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_surface_light);
        long r17 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_on_surface_light);
        long r18 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_surface_variant_light);
        long r19 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_on_surface_variant_light);
        long r43 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_surface_dark);
        long r45 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_on_surface_dark);
        long r55 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_outline_light);
        long r57 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_outline_variant_light);
        long r61 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_surface_bright_light);
        long r73 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_surface_dim_light);
        long r63 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_surface_container_light);
        long r65 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_surface_container_high_light);
        long r67 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_surface_container_highest_light);
        long r69 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_surface_container_low_light);
        long r71 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_surface_container_lowest_light);
        return ColorSchemeKt.m2063lightColorSchemeCXl9yA$default(r3, r5, r7, r9, r11, r13, r15, r1, r2, r4, r6, r8, r10, r12, r14, r16, r17, r18, r19, ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_primary_light), r43, r45, 0, 0, 0, 0, r55, r57, 0, r61, r63, r65, r67, r69, r71, r73, 331350016, 0, null);
    }

    public static final ColorScheme dynamicDarkColorScheme31(TonalPalette tonalPalette) {
        long r1 = tonalPalette.m2937getPrimary800d7_KjU();
        long r3 = tonalPalette.m2931getPrimary200d7_KjU();
        long r5 = tonalPalette.m2932getPrimary300d7_KjU();
        long r7 = tonalPalette.m2938getPrimary900d7_KjU();
        long r9 = tonalPalette.m2933getPrimary400d7_KjU();
        long r11 = tonalPalette.m2950getSecondary800d7_KjU();
        long r13 = tonalPalette.m2944getSecondary200d7_KjU();
        long r15 = tonalPalette.m2945getSecondary300d7_KjU();
        long r17 = tonalPalette.m2951getSecondary900d7_KjU();
        long r19 = tonalPalette.m2963getTertiary800d7_KjU();
        long r21 = tonalPalette.m2957getTertiary200d7_KjU();
        long r23 = tonalPalette.m2958getTertiary300d7_KjU();
        long r25 = tonalPalette.m2964getTertiary900d7_KjU();
        long r27 = tonalPalette.m2916getNeutralVariant60d7_KjU();
        long r29 = tonalPalette.m2921getNeutralVariant900d7_KjU();
        long r31 = tonalPalette.m2916getNeutralVariant60d7_KjU();
        long r33 = tonalPalette.m2921getNeutralVariant900d7_KjU();
        long r35 = tonalPalette.m2912getNeutralVariant300d7_KjU();
        long r37 = tonalPalette.m2919getNeutralVariant800d7_KjU();
        long r41 = tonalPalette.m2921getNeutralVariant900d7_KjU();
        long r43 = tonalPalette.m2909getNeutralVariant200d7_KjU();
        long r53 = tonalPalette.m2917getNeutralVariant600d7_KjU();
        long r55 = tonalPalette.m2912getNeutralVariant300d7_KjU();
        long r57 = tonalPalette.m2904getNeutralVariant00d7_KjU();
        long r59 = tonalPalette.m2911getNeutralVariant240d7_KjU();
        long r71 = tonalPalette.m2916getNeutralVariant60d7_KjU();
        long r61 = tonalPalette.m2907getNeutralVariant120d7_KjU();
        long r63 = tonalPalette.m2908getNeutralVariant170d7_KjU();
        long r65 = tonalPalette.m2910getNeutralVariant220d7_KjU();
        long r67 = tonalPalette.m2905getNeutralVariant100d7_KjU();
        long r69 = tonalPalette.m2913getNeutralVariant40d7_KjU();
        return ColorSchemeKt.m2059darkColorSchemeCXl9yA$default(r1, r3, r5, r7, r9, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, tonalPalette.m2937getPrimary800d7_KjU(), r41, r43, 0, 0, 0, 0, r53, r55, r57, r59, r61, r63, r65, r67, r69, r71, 62914560, 0, null);
    }

    public static final ColorScheme dynamicDarkColorScheme34(Context context) {
        long r3 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_primary_dark);
        long r5 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_on_primary_dark);
        long r7 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_primary_container_dark);
        long r9 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_on_primary_container_dark);
        long r11 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_primary_light);
        long r13 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_secondary_dark);
        long r15 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_on_secondary_dark);
        long r1 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_secondary_container_dark);
        long r2 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_on_secondary_container_dark);
        long r4 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_tertiary_dark);
        long r6 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_on_tertiary_dark);
        long r8 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_tertiary_container_dark);
        long r10 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_on_tertiary_container_dark);
        long r12 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_background_dark);
        long r14 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_on_background_dark);
        long r16 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_surface_dark);
        long r17 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_on_surface_dark);
        long r18 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_surface_variant_dark);
        long r19 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_on_surface_variant_dark);
        long r43 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_surface_light);
        long r45 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_on_surface_light);
        long r55 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_outline_dark);
        long r57 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_outline_variant_dark);
        long r61 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_surface_bright_dark);
        long r73 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_surface_dim_dark);
        long r63 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_surface_container_dark);
        long r65 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_surface_container_high_dark);
        long r67 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_surface_container_highest_dark);
        long r69 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_surface_container_low_dark);
        long r71 = ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_surface_container_lowest_dark);
        return ColorSchemeKt.m2059darkColorSchemeCXl9yA$default(r3, r5, r7, r9, r11, r13, r15, r1, r2, r4, r6, r8, r10, r12, r14, r16, r17, r18, r19, ColorResourceHelper.INSTANCE.m2014getColorWaAFU9c(context, android.R.color.system_primary_dark), r43, r45, 0, 0, 0, 0, r55, r57, 0, r61, r63, r65, r67, r69, r71, r73, 331350016, 0, null);
    }
}
