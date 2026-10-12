package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorDarkTokens;
import androidx.compose.material3.tokens.ColorLightTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.PaletteTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;

/* JADX INFO: compiled from: ColorScheme.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001a\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a´\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020\u000b2\b\b\u0002\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010/\u001a\u00020\u000b2\b\b\u0002\u00100\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001aø\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020\u000b2\b\b\u0002\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010/\u001a\u00020\u000b2\b\b\u0002\u00100\u001a\u00020\u000b2\b\b\u0002\u00103\u001a\u00020\u000b2\b\b\u0002\u00104\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u000b2\b\b\u0002\u00106\u001a\u00020\u000b2\b\b\u0002\u00107\u001a\u00020\u000b2\b\b\u0002\u00108\u001a\u00020\u000b2\b\b\u0002\u00109\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b:\u0010;\u001a\b\u0010<\u001a\u00020\u0004H\u0000\u001a´\u0002\u0010=\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020\u000b2\b\b\u0002\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010/\u001a\u00020\u000b2\b\b\u0002\u00100\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b>\u00102\u001aø\u0002\u0010=\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020\u000b2\b\b\u0002\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010/\u001a\u00020\u000b2\b\b\u0002\u00100\u001a\u00020\u000b2\b\b\u0002\u00103\u001a\u00020\u000b2\b\b\u0002\u00104\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u000b2\b\b\u0002\u00106\u001a\u00020\u000b2\b\b\u0002\u00107\u001a\u00020\u000b2\b\b\u0002\u00108\u001a\u00020\u000b2\b\b\u0002\u00109\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b?\u0010;\u001a&\u0010@\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020BH\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010D\u001a\u001e\u0010\u000f\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001a\u0019\u0010G\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\n\u001a\u00020\fH\u0001¢\u0006\u0002\u0010H\u001a\u001e\u0010I\u001a\u00020\u000b*\u00020\u00042\u0006\u0010A\u001a\u00020BH\u0007ø\u0001\u0000¢\u0006\u0004\bJ\u0010K\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0006\"\u0018\u0010\n\u001a\u00020\u000b*\u00020\f8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006L"}, d2 = {"DisabledAlpha", "", "LocalColorScheme", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material3/ColorScheme;", "getLocalColorScheme", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalTonalElevationEnabled", "", "getLocalTonalElevationEnabled", "value", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getValue", "(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J", "contentColorFor", "backgroundColor", "contentColorFor-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)J", "darkColorScheme", "primary", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", "background", "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", "error", "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "darkColorScheme-G1PFc-w", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "surfaceBright", "surfaceContainer", "surfaceContainerHigh", "surfaceContainerHighest", "surfaceContainerLow", "surfaceContainerLowest", "surfaceDim", "darkColorScheme-C-Xl9yA", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "expressiveLightColorScheme", "lightColorScheme", "lightColorScheme-G1PFc-w", "lightColorScheme-C-Xl9yA", "applyTonalElevation", "elevation", "Landroidx/compose/ui/unit/Dp;", "applyTonalElevation-RFCenO8", "(Landroidx/compose/material3/ColorScheme;JFLandroidx/compose/runtime/Composer;I)J", "contentColorFor-4WTKRHQ", "(Landroidx/compose/material3/ColorScheme;J)J", "fromToken", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;)J", "surfaceColorAtElevation", "surfaceColorAtElevation-3ABfNKs", "(Landroidx/compose/material3/ColorScheme;F)J", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ColorSchemeKt {
    public static final float DisabledAlpha = 0.38f;
    private static final ProvidableCompositionLocal<ColorScheme> LocalColorScheme = null;
    private static final ProvidableCompositionLocal<Boolean> LocalTonalElevationEnabled = null;

    /* JADX INFO: compiled from: ColorScheme.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[ColorSchemeKeyTokens.values().length];
            r0[ColorSchemeKeyTokens.Background.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L133:
            r0[ColorSchemeKeyTokens.Error.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L147:
            r0[ColorSchemeKeyTokens.ErrorContainer.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L165:
            r0[ColorSchemeKeyTokens.InverseOnSurface.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
        L171:
            r0[ColorSchemeKeyTokens.InversePrimary.ordinal()] = 5;     // Catch: NoSuchFieldError -> L17
        L117:
            r0[ColorSchemeKeyTokens.InverseSurface.ordinal()] = 6;     // Catch: NoSuchFieldError -> L20
        L131:
            r0[ColorSchemeKeyTokens.OnBackground.ordinal()] = 7;     // Catch: NoSuchFieldError -> L23
        L137:
            r0[ColorSchemeKeyTokens.OnError.ordinal()] = 8;     // Catch: NoSuchFieldError -> L26
        L159:
            r0[ColorSchemeKeyTokens.OnErrorContainer.ordinal()] = 9;     // Catch: NoSuchFieldError -> L29
        L163:
            r0[ColorSchemeKeyTokens.OnPrimary.ordinal()] = 10;     // Catch: NoSuchFieldError -> L32
        L183:
            r0[ColorSchemeKeyTokens.OnPrimaryContainer.ordinal()] = 11;     // Catch: NoSuchFieldError -> L35
        L115:
            r0[ColorSchemeKeyTokens.OnSecondary.ordinal()] = 12;     // Catch: NoSuchFieldError -> L38
        L141:
            r0[ColorSchemeKeyTokens.OnSecondaryContainer.ordinal()] = 13;     // Catch: NoSuchFieldError -> L41
        L145:
            r0[ColorSchemeKeyTokens.OnSurface.ordinal()] = 14;     // Catch: NoSuchFieldError -> L44
        L169:
            r0[ColorSchemeKeyTokens.OnSurfaceVariant.ordinal()] = 15;     // Catch: NoSuchFieldError -> L47
        L175:
            r0[ColorSchemeKeyTokens.SurfaceTint.ordinal()] = 16;     // Catch: NoSuchFieldError -> L50
        L121:
            r0[ColorSchemeKeyTokens.OnTertiary.ordinal()] = 17;     // Catch: NoSuchFieldError -> L53
        L125:
            r0[ColorSchemeKeyTokens.OnTertiaryContainer.ordinal()] = 18;     // Catch: NoSuchFieldError -> L56
        L151:
            r0[ColorSchemeKeyTokens.Outline.ordinal()] = 19;     // Catch: NoSuchFieldError -> L59
        L155:
            r0[ColorSchemeKeyTokens.OutlineVariant.ordinal()] = 20;     // Catch: NoSuchFieldError -> L62
        L177:
            r0[ColorSchemeKeyTokens.Primary.ordinal()] = 21;     // Catch: NoSuchFieldError -> L65
        L179:
            r0[ColorSchemeKeyTokens.PrimaryContainer.ordinal()] = 22;     // Catch: NoSuchFieldError -> L68
        L129:
            r0[ColorSchemeKeyTokens.Scrim.ordinal()] = 23;     // Catch: NoSuchFieldError -> L71
        L135:
            r0[ColorSchemeKeyTokens.Secondary.ordinal()] = 24;     // Catch: NoSuchFieldError -> L74
        L157:
            r0[ColorSchemeKeyTokens.SecondaryContainer.ordinal()] = 25;     // Catch: NoSuchFieldError -> L77
        L161:
            r0[ColorSchemeKeyTokens.Surface.ordinal()] = 26;     // Catch: NoSuchFieldError -> L80
        L181:
            r0[ColorSchemeKeyTokens.SurfaceVariant.ordinal()] = 27;     // Catch: NoSuchFieldError -> L83
        L113:
            r0[ColorSchemeKeyTokens.SurfaceBright.ordinal()] = 28;     // Catch: NoSuchFieldError -> L86
        L139:
            r0[ColorSchemeKeyTokens.SurfaceContainer.ordinal()] = 29;     // Catch: NoSuchFieldError -> L89
        L143:
            r0[ColorSchemeKeyTokens.SurfaceContainerHigh.ordinal()] = 30;     // Catch: NoSuchFieldError -> L92
        L167:
            r0[ColorSchemeKeyTokens.SurfaceContainerHighest.ordinal()] = 31;     // Catch: NoSuchFieldError -> L95
        L173:
            r0[ColorSchemeKeyTokens.SurfaceContainerLow.ordinal()] = 32;     // Catch: NoSuchFieldError -> L98
        L119:
            r0[ColorSchemeKeyTokens.SurfaceContainerLowest.ordinal()] = 33;     // Catch: NoSuchFieldError -> L101
        L123:
            r0[ColorSchemeKeyTokens.SurfaceDim.ordinal()] = 34;     // Catch: NoSuchFieldError -> L104
        L149:
            r0[ColorSchemeKeyTokens.Tertiary.ordinal()] = 35;     // Catch: NoSuchFieldError -> L107
        L153:
            r0[ColorSchemeKeyTokens.TertiaryContainer.ordinal()] = 36;     // Catch: NoSuchFieldError -> L110
        L111:
            $EnumSwitchMapping$0 = r0;
        }
    }

    /* JADX INFO: renamed from: lightColorScheme-C-Xl9yA$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m2063lightColorSchemeCXl9yA$default(long r59, long r61, long r63, long r65, long r67, long r69, long r71, long r73, long r75, long r77, long r79, long r81, long r83, long r85, long r87, long r89, long r91, long r93, long r95, long r97, long r99, long r101, long r103, long r105, long r107, long r109, long r111, long r113, long r115, long r117, long r119, long r121, long r123, long r125, long r127, long r129, int r131, int r132, Object r133) {
        if ((r131 & 1) == 0) goto L5;
        long r1 = ColorLightTokens.INSTANCE.m3237getPrimary0d7_KjU();
    L7:
        if ((r131 & 2) == 0) goto L9;
        long r3 = ColorLightTokens.INSTANCE.m3221getOnPrimary0d7_KjU();
    L11:
        if ((r131 & 4) == 0) goto L13;
        long r5 = ColorLightTokens.INSTANCE.m3238getPrimaryContainer0d7_KjU();
    L15:
        if ((r131 & 8) == 0) goto L17;
        long r7 = ColorLightTokens.INSTANCE.m3222getOnPrimaryContainer0d7_KjU();
    L19:
        if ((r131 & 16) == 0) goto L21;
        long r9 = ColorLightTokens.INSTANCE.m3216getInversePrimary0d7_KjU();
    L23:
        if ((r131 & 32) == 0) goto L25;
        long r11 = ColorLightTokens.INSTANCE.m3242getSecondary0d7_KjU();
    L27:
        if ((r131 & 64) == 0) goto L29;
        long r13 = ColorLightTokens.INSTANCE.m3225getOnSecondary0d7_KjU();
    L31:
        if ((r131 & 128) == 0) goto L33;
        long r15 = ColorLightTokens.INSTANCE.m3243getSecondaryContainer0d7_KjU();
    L34:
        long r510 = r1;
        if ((r131 & 256) == 0) goto L37;
        long r2 = ColorLightTokens.INSTANCE.m3226getOnSecondaryContainer0d7_KjU();
    L38:
        long r76 = r2;
        if ((r131 & 512) == 0) goto L41;
        long r4 = ColorLightTokens.INSTANCE.m3256getTertiary0d7_KjU();
    L42:
        long r78 = r4;
        if ((r131 & 1024) == 0) goto L45;
        long r6 = ColorLightTokens.INSTANCE.m3231getOnTertiary0d7_KjU();
    L46:
        long r710 = r6;
        if ((r131 & 2048) == 0) goto L49;
        long r8 = ColorLightTokens.INSTANCE.m3257getTertiaryContainer0d7_KjU();
    L50:
        long r82 = r8;
        if ((r131 & 4096) == 0) goto L53;
        long r10 = ColorLightTokens.INSTANCE.m3232getOnTertiaryContainer0d7_KjU();
    L54:
        long r84 = r10;
        if ((r131 & 8192) == 0) goto L57;
        long r12 = ColorLightTokens.INSTANCE.m3212getBackground0d7_KjU();
    L58:
        long r86 = r12;
        if ((r131 & 16384) == 0) goto L61;
        long r14 = ColorLightTokens.INSTANCE.m3218getOnBackground0d7_KjU();
    L63:
        if ((r131 & 32768) == 0) goto L65;
        long r17 = ColorLightTokens.INSTANCE.m3246getSurface0d7_KjU();
    L67:
        if ((r131 & 65536) == 0) goto L69;
        long r19 = ColorLightTokens.INSTANCE.m3229getOnSurface0d7_KjU();
    L71:
        if ((r131 & 131072) == 0) goto L73;
        long r21 = ColorLightTokens.INSTANCE.m3255getSurfaceVariant0d7_KjU();
    L75:
        if ((r131 & 262144) == 0) goto L77;
        long r23 = ColorLightTokens.INSTANCE.m3230getOnSurfaceVariant0d7_KjU();
    L79:
        if ((r131 & 524288) == 0) goto L81;
        long r25 = r510;
    L83:
        if ((r131 & 1048576) == 0) goto L85;
        long r27 = ColorLightTokens.INSTANCE.m3217getInverseSurface0d7_KjU();
    L87:
        if ((r131 & 2097152) == 0) goto L89;
        long r29 = ColorLightTokens.INSTANCE.m3215getInverseOnSurface0d7_KjU();
    L91:
        if ((r131 & 4194304) == 0) goto L93;
        long r31 = ColorLightTokens.INSTANCE.m3213getError0d7_KjU();
    L95:
        if ((r131 & 8388608) == 0) goto L97;
        long r33 = ColorLightTokens.INSTANCE.m3219getOnError0d7_KjU();
    L99:
        if ((r131 & 16777216) == 0) goto L101;
        long r35 = ColorLightTokens.INSTANCE.m3214getErrorContainer0d7_KjU();
    L103:
        if ((r131 & 33554432) == 0) goto L105;
        long r37 = ColorLightTokens.INSTANCE.m3220getOnErrorContainer0d7_KjU();
    L107:
        if ((r131 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) == 0) goto L109;
        long r39 = ColorLightTokens.INSTANCE.m3235getOutline0d7_KjU();
    L111:
        if ((r131 & 134217728) == 0) goto L113;
        long r41 = ColorLightTokens.INSTANCE.m3236getOutlineVariant0d7_KjU();
    L115:
        if ((r131 & 268435456) == 0) goto L117;
        long r43 = ColorLightTokens.INSTANCE.m3241getScrim0d7_KjU();
    L119:
        if ((r131 & 536870912) == 0) goto L121;
        long r45 = ColorLightTokens.INSTANCE.m3247getSurfaceBright0d7_KjU();
    L123:
        if ((r131 & 1073741824) == 0) goto L125;
        long r47 = ColorLightTokens.INSTANCE.m3248getSurfaceContainer0d7_KjU();
    L127:
        if ((r131 & Integer.MIN_VALUE) == 0) goto L129;
        long r49 = ColorLightTokens.INSTANCE.m3249getSurfaceContainerHigh0d7_KjU();
    L131:
        if ((r132 & 1) == 0) goto L133;
        long r51 = ColorLightTokens.INSTANCE.m3250getSurfaceContainerHighest0d7_KjU();
    L135:
        if ((r132 & 2) == 0) goto L137;
        long r53 = ColorLightTokens.INSTANCE.m3251getSurfaceContainerLow0d7_KjU();
    L139:
        if ((r132 & 4) == 0) goto L141;
        long r55 = ColorLightTokens.INSTANCE.m3252getSurfaceContainerLowest0d7_KjU();
    L143:
        if ((r132 & 8) == 0) goto L145;
        long r57 = ColorLightTokens.INSTANCE.m3253getSurfaceDim0d7_KjU();
    L146:
        long r62 = r3;
        long r64 = r5;
        long r66 = r7;
        long r68 = r9;
        long r610 = r11;
        long r72 = r13;
        long r74 = r15;
        return m2062lightColorSchemeCXl9yA(r510, r62, r64, r66, r68, r610, r72, r74, r76, r78, r710, r82, r84, r86, r14, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57);
    L145:
        r57 = r129;
        goto L146
    L141:
        r55 = r127;
        goto L143
    L137:
        r53 = r125;
        goto L139
    L133:
        r51 = r123;
        goto L135
    L129:
        r49 = r121;
        goto L131
    L125:
        r47 = r119;
        goto L127
    L121:
        r45 = r117;
        goto L123
    L117:
        r43 = r115;
        goto L119
    L113:
        r41 = r113;
        goto L115
    L109:
        r39 = r111;
        goto L111
    L105:
        r37 = r109;
        goto L107
    L101:
        r35 = r107;
        goto L103
    L97:
        r33 = r105;
        goto L99
    L93:
        r31 = r103;
        goto L95
    L89:
        r29 = r101;
        goto L91
    L85:
        r27 = r99;
        goto L87
    L81:
        r25 = r97;
        goto L83
    L77:
        r23 = r95;
        goto L79
    L73:
        r21 = r93;
        goto L75
    L69:
        r19 = r91;
        goto L71
    L65:
        r17 = r89;
        goto L67
    L61:
        r14 = r87;
        goto L63
    L57:
        r12 = r85;
        goto L58
    L53:
        r10 = r83;
        goto L54
    L49:
        r8 = r81;
        goto L50
    L45:
        r6 = r79;
        goto L46
    L41:
        r4 = r77;
        goto L42
    L37:
        r2 = r75;
        goto L38
    L33:
        r15 = r73;
        goto L34
    L29:
        r13 = r71;
        goto L31
    L25:
        r11 = r69;
        goto L27
    L21:
        r9 = r67;
        goto L23
    L17:
        r7 = r65;
        goto L19
    L13:
        r5 = r63;
        goto L15
    L9:
        r3 = r61;
        goto L11
    L5:
        r1 = r59;
        goto L7
    }

    /* JADX INFO: renamed from: lightColorScheme-C-Xl9yA, reason: not valid java name */
    public static final ColorScheme m2062lightColorSchemeCXl9yA(long primary, long onPrimary, long primaryContainer, long onPrimaryContainer, long inversePrimary, long secondary, long onSecondary, long secondaryContainer, long onSecondaryContainer, long tertiary, long onTertiary, long tertiaryContainer, long onTertiaryContainer, long background, long onBackground, long surface, long onSurface, long surfaceVariant, long onSurfaceVariant, long surfaceTint, long inverseSurface, long inverseOnSurface, long error, long onError, long errorContainer, long onErrorContainer, long outline, long outlineVariant, long scrim, long surfaceBright, long surfaceContainer, long surfaceContainerHigh, long surfaceContainerHighest, long surfaceContainerLow, long surfaceContainerLowest, long surfaceDim) {
        return new ColorScheme(primary, onPrimary, primaryContainer, onPrimaryContainer, inversePrimary, secondary, onSecondary, secondaryContainer, onSecondaryContainer, tertiary, onTertiary, tertiaryContainer, onTertiaryContainer, background, onBackground, surface, onSurface, surfaceVariant, onSurfaceVariant, surfaceTint, inverseSurface, inverseOnSurface, error, onError, errorContainer, onErrorContainer, outline, outlineVariant, scrim, surfaceBright, surfaceDim, surfaceContainer, surfaceContainerHigh, surfaceContainerHighest, surfaceContainerLow, surfaceContainerLowest, null);
    }

    /* JADX INFO: renamed from: lightColorScheme-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m2065lightColorSchemeG1PFcw$default(long r45, long r47, long r49, long r51, long r53, long r55, long r57, long r59, long r61, long r63, long r65, long r67, long r69, long r71, long r73, long r75, long r77, long r79, long r81, long r83, long r85, long r87, long r89, long r91, long r93, long r95, long r97, long r99, long r101, int r103, Object r104) {
        if ((r103 & 1) == 0) goto L5;
        long r1 = ColorLightTokens.INSTANCE.m3237getPrimary0d7_KjU();
    L7:
        if ((r103 & 2) == 0) goto L9;
        long r3 = ColorLightTokens.INSTANCE.m3221getOnPrimary0d7_KjU();
    L11:
        if ((r103 & 4) == 0) goto L13;
        long r5 = ColorLightTokens.INSTANCE.m3238getPrimaryContainer0d7_KjU();
    L15:
        if ((r103 & 8) == 0) goto L17;
        long r7 = ColorLightTokens.INSTANCE.m3222getOnPrimaryContainer0d7_KjU();
    L19:
        if ((r103 & 16) == 0) goto L21;
        long r9 = ColorLightTokens.INSTANCE.m3216getInversePrimary0d7_KjU();
    L23:
        if ((r103 & 32) == 0) goto L25;
        long r11 = ColorLightTokens.INSTANCE.m3242getSecondary0d7_KjU();
    L27:
        if ((r103 & 64) == 0) goto L29;
        long r13 = ColorLightTokens.INSTANCE.m3225getOnSecondary0d7_KjU();
    L31:
        if ((r103 & 128) == 0) goto L33;
        long r15 = ColorLightTokens.INSTANCE.m3243getSecondaryContainer0d7_KjU();
    L34:
        long r46 = r1;
        if ((r103 & 256) == 0) goto L37;
        long r2 = ColorLightTokens.INSTANCE.m3226getOnSecondaryContainer0d7_KjU();
    L38:
        long r62 = r2;
        if ((r103 & 512) == 0) goto L41;
        long r4 = ColorLightTokens.INSTANCE.m3256getTertiary0d7_KjU();
    L42:
        long r64 = r4;
        if ((r103 & 1024) == 0) goto L45;
        long r6 = ColorLightTokens.INSTANCE.m3231getOnTertiary0d7_KjU();
    L46:
        long r66 = r6;
        if ((r103 & 2048) == 0) goto L49;
        long r8 = ColorLightTokens.INSTANCE.m3257getTertiaryContainer0d7_KjU();
    L50:
        long r68 = r8;
        if ((r103 & 4096) == 0) goto L53;
        long r10 = ColorLightTokens.INSTANCE.m3232getOnTertiaryContainer0d7_KjU();
    L54:
        long r610 = r10;
        if ((r103 & 8192) == 0) goto L57;
        long r12 = ColorLightTokens.INSTANCE.m3212getBackground0d7_KjU();
    L58:
        long r72 = r12;
        if ((r103 & 16384) == 0) goto L61;
        long r14 = ColorLightTokens.INSTANCE.m3218getOnBackground0d7_KjU();
    L63:
        if ((r103 & 32768) == 0) goto L65;
        long r17 = ColorLightTokens.INSTANCE.m3246getSurface0d7_KjU();
    L67:
        if ((r103 & 65536) == 0) goto L69;
        long r19 = ColorLightTokens.INSTANCE.m3229getOnSurface0d7_KjU();
    L71:
        if ((r103 & 131072) == 0) goto L73;
        long r21 = ColorLightTokens.INSTANCE.m3255getSurfaceVariant0d7_KjU();
    L75:
        if ((r103 & 262144) == 0) goto L77;
        long r23 = ColorLightTokens.INSTANCE.m3230getOnSurfaceVariant0d7_KjU();
    L79:
        if ((r103 & 524288) == 0) goto L81;
        long r25 = r46;
    L83:
        if ((r103 & 1048576) == 0) goto L85;
        long r27 = ColorLightTokens.INSTANCE.m3217getInverseSurface0d7_KjU();
    L87:
        if ((r103 & 2097152) == 0) goto L89;
        long r29 = ColorLightTokens.INSTANCE.m3215getInverseOnSurface0d7_KjU();
    L91:
        if ((r103 & 4194304) == 0) goto L93;
        long r31 = ColorLightTokens.INSTANCE.m3213getError0d7_KjU();
    L95:
        if ((r103 & 8388608) == 0) goto L97;
        long r33 = ColorLightTokens.INSTANCE.m3219getOnError0d7_KjU();
    L99:
        if ((r103 & 16777216) == 0) goto L101;
        long r35 = ColorLightTokens.INSTANCE.m3214getErrorContainer0d7_KjU();
    L103:
        if ((r103 & 33554432) == 0) goto L105;
        long r37 = ColorLightTokens.INSTANCE.m3220getOnErrorContainer0d7_KjU();
    L107:
        if ((r103 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) == 0) goto L109;
        long r39 = ColorLightTokens.INSTANCE.m3235getOutline0d7_KjU();
    L111:
        if ((r103 & 134217728) == 0) goto L113;
        long r41 = ColorLightTokens.INSTANCE.m3236getOutlineVariant0d7_KjU();
    L115:
        if ((r103 & 268435456) == 0) goto L117;
        long r43 = ColorLightTokens.INSTANCE.m3241getScrim0d7_KjU();
    L118:
        long r48 = r3;
        long r410 = r5;
        long r52 = r7;
        long r54 = r9;
        long r56 = r11;
        long r58 = r13;
        long r510 = r15;
        return m2064lightColorSchemeG1PFcw(r46, r48, r410, r52, r54, r56, r58, r510, r62, r64, r66, r68, r610, r72, r14, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43);
    L117:
        r43 = r101;
        goto L118
    L113:
        r41 = r99;
        goto L115
    L109:
        r39 = r97;
        goto L111
    L105:
        r37 = r95;
        goto L107
    L101:
        r35 = r93;
        goto L103
    L97:
        r33 = r91;
        goto L99
    L93:
        r31 = r89;
        goto L95
    L89:
        r29 = r87;
        goto L91
    L85:
        r27 = r85;
        goto L87
    L81:
        r25 = r83;
        goto L83
    L77:
        r23 = r81;
        goto L79
    L73:
        r21 = r79;
        goto L75
    L69:
        r19 = r77;
        goto L71
    L65:
        r17 = r75;
        goto L67
    L61:
        r14 = r73;
        goto L63
    L57:
        r12 = r71;
        goto L58
    L53:
        r10 = r69;
        goto L54
    L49:
        r8 = r67;
        goto L50
    L45:
        r6 = r65;
        goto L46
    L41:
        r4 = r63;
        goto L42
    L37:
        r2 = r61;
        goto L38
    L33:
        r15 = r59;
        goto L34
    L29:
        r13 = r57;
        goto L31
    L25:
        r11 = r55;
        goto L27
    L21:
        r9 = r53;
        goto L23
    L17:
        r7 = r51;
        goto L19
    L13:
        r5 = r49;
        goto L15
    L9:
        r3 = r47;
        goto L11
    L5:
        r1 = r45;
        goto L7
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with additional surface roles instead")
    /* JADX INFO: renamed from: lightColorScheme-G1PFc-w, reason: not valid java name */
    public static final /* synthetic */ ColorScheme m2064lightColorSchemeG1PFcw(long primary, long onPrimary, long primaryContainer, long onPrimaryContainer, long inversePrimary, long secondary, long onSecondary, long secondaryContainer, long onSecondaryContainer, long tertiary, long onTertiary, long tertiaryContainer, long onTertiaryContainer, long background, long onBackground, long surface, long onSurface, long surfaceVariant, long onSurfaceVariant, long surfaceTint, long inverseSurface, long inverseOnSurface, long error, long onError, long errorContainer, long onErrorContainer, long outline, long outlineVariant, long scrim) {
        return m2063lightColorSchemeCXl9yA$default(primary, onPrimary, primaryContainer, onPrimaryContainer, inversePrimary, secondary, onSecondary, secondaryContainer, onSecondaryContainer, tertiary, onTertiary, tertiaryContainer, onTertiaryContainer, background, onBackground, surface, onSurface, surfaceVariant, onSurfaceVariant, surfaceTint, inverseSurface, inverseOnSurface, error, onError, errorContainer, onErrorContainer, outline, outlineVariant, scrim, 0, 0, 0, 0, 0, 0, 0, -536870912, 15, null);
    }

    /* JADX INFO: renamed from: darkColorScheme-C-Xl9yA$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m2059darkColorSchemeCXl9yA$default(long r59, long r61, long r63, long r65, long r67, long r69, long r71, long r73, long r75, long r77, long r79, long r81, long r83, long r85, long r87, long r89, long r91, long r93, long r95, long r97, long r99, long r101, long r103, long r105, long r107, long r109, long r111, long r113, long r115, long r117, long r119, long r121, long r123, long r125, long r127, long r129, int r131, int r132, Object r133) {
        if ((r131 & 1) == 0) goto L5;
        long r1 = ColorDarkTokens.INSTANCE.m3189getPrimary0d7_KjU();
    L7:
        if ((r131 & 2) == 0) goto L9;
        long r3 = ColorDarkTokens.INSTANCE.m3173getOnPrimary0d7_KjU();
    L11:
        if ((r131 & 4) == 0) goto L13;
        long r5 = ColorDarkTokens.INSTANCE.m3190getPrimaryContainer0d7_KjU();
    L15:
        if ((r131 & 8) == 0) goto L17;
        long r7 = ColorDarkTokens.INSTANCE.m3174getOnPrimaryContainer0d7_KjU();
    L19:
        if ((r131 & 16) == 0) goto L21;
        long r9 = ColorDarkTokens.INSTANCE.m3168getInversePrimary0d7_KjU();
    L23:
        if ((r131 & 32) == 0) goto L25;
        long r11 = ColorDarkTokens.INSTANCE.m3194getSecondary0d7_KjU();
    L27:
        if ((r131 & 64) == 0) goto L29;
        long r13 = ColorDarkTokens.INSTANCE.m3177getOnSecondary0d7_KjU();
    L31:
        if ((r131 & 128) == 0) goto L33;
        long r15 = ColorDarkTokens.INSTANCE.m3195getSecondaryContainer0d7_KjU();
    L34:
        long r510 = r1;
        if ((r131 & 256) == 0) goto L37;
        long r2 = ColorDarkTokens.INSTANCE.m3178getOnSecondaryContainer0d7_KjU();
    L38:
        long r76 = r2;
        if ((r131 & 512) == 0) goto L41;
        long r4 = ColorDarkTokens.INSTANCE.m3208getTertiary0d7_KjU();
    L42:
        long r78 = r4;
        if ((r131 & 1024) == 0) goto L45;
        long r6 = ColorDarkTokens.INSTANCE.m3183getOnTertiary0d7_KjU();
    L46:
        long r710 = r6;
        if ((r131 & 2048) == 0) goto L49;
        long r8 = ColorDarkTokens.INSTANCE.m3209getTertiaryContainer0d7_KjU();
    L50:
        long r82 = r8;
        if ((r131 & 4096) == 0) goto L53;
        long r10 = ColorDarkTokens.INSTANCE.m3184getOnTertiaryContainer0d7_KjU();
    L54:
        long r84 = r10;
        if ((r131 & 8192) == 0) goto L57;
        long r12 = ColorDarkTokens.INSTANCE.m3164getBackground0d7_KjU();
    L58:
        long r86 = r12;
        if ((r131 & 16384) == 0) goto L61;
        long r14 = ColorDarkTokens.INSTANCE.m3170getOnBackground0d7_KjU();
    L63:
        if ((r131 & 32768) == 0) goto L65;
        long r17 = ColorDarkTokens.INSTANCE.m3198getSurface0d7_KjU();
    L67:
        if ((r131 & 65536) == 0) goto L69;
        long r19 = ColorDarkTokens.INSTANCE.m3181getOnSurface0d7_KjU();
    L71:
        if ((r131 & 131072) == 0) goto L73;
        long r21 = ColorDarkTokens.INSTANCE.m3207getSurfaceVariant0d7_KjU();
    L75:
        if ((r131 & 262144) == 0) goto L77;
        long r23 = ColorDarkTokens.INSTANCE.m3182getOnSurfaceVariant0d7_KjU();
    L79:
        if ((r131 & 524288) == 0) goto L81;
        long r25 = r510;
    L83:
        if ((r131 & 1048576) == 0) goto L85;
        long r27 = ColorDarkTokens.INSTANCE.m3169getInverseSurface0d7_KjU();
    L87:
        if ((r131 & 2097152) == 0) goto L89;
        long r29 = ColorDarkTokens.INSTANCE.m3167getInverseOnSurface0d7_KjU();
    L91:
        if ((r131 & 4194304) == 0) goto L93;
        long r31 = ColorDarkTokens.INSTANCE.m3165getError0d7_KjU();
    L95:
        if ((r131 & 8388608) == 0) goto L97;
        long r33 = ColorDarkTokens.INSTANCE.m3171getOnError0d7_KjU();
    L99:
        if ((r131 & 16777216) == 0) goto L101;
        long r35 = ColorDarkTokens.INSTANCE.m3166getErrorContainer0d7_KjU();
    L103:
        if ((r131 & 33554432) == 0) goto L105;
        long r37 = ColorDarkTokens.INSTANCE.m3172getOnErrorContainer0d7_KjU();
    L107:
        if ((r131 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) == 0) goto L109;
        long r39 = ColorDarkTokens.INSTANCE.m3187getOutline0d7_KjU();
    L111:
        if ((r131 & 134217728) == 0) goto L113;
        long r41 = ColorDarkTokens.INSTANCE.m3188getOutlineVariant0d7_KjU();
    L115:
        if ((r131 & 268435456) == 0) goto L117;
        long r43 = ColorDarkTokens.INSTANCE.m3193getScrim0d7_KjU();
    L119:
        if ((r131 & 536870912) == 0) goto L121;
        long r45 = ColorDarkTokens.INSTANCE.m3199getSurfaceBright0d7_KjU();
    L123:
        if ((r131 & 1073741824) == 0) goto L125;
        long r47 = ColorDarkTokens.INSTANCE.m3200getSurfaceContainer0d7_KjU();
    L127:
        if ((r131 & Integer.MIN_VALUE) == 0) goto L129;
        long r49 = ColorDarkTokens.INSTANCE.m3201getSurfaceContainerHigh0d7_KjU();
    L131:
        if ((r132 & 1) == 0) goto L133;
        long r51 = ColorDarkTokens.INSTANCE.m3202getSurfaceContainerHighest0d7_KjU();
    L135:
        if ((r132 & 2) == 0) goto L137;
        long r53 = ColorDarkTokens.INSTANCE.m3203getSurfaceContainerLow0d7_KjU();
    L139:
        if ((r132 & 4) == 0) goto L141;
        long r55 = ColorDarkTokens.INSTANCE.m3204getSurfaceContainerLowest0d7_KjU();
    L143:
        if ((r132 & 8) == 0) goto L145;
        long r57 = ColorDarkTokens.INSTANCE.m3205getSurfaceDim0d7_KjU();
    L146:
        long r62 = r3;
        long r64 = r5;
        long r66 = r7;
        long r68 = r9;
        long r610 = r11;
        long r72 = r13;
        long r74 = r15;
        return m2058darkColorSchemeCXl9yA(r510, r62, r64, r66, r68, r610, r72, r74, r76, r78, r710, r82, r84, r86, r14, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57);
    L145:
        r57 = r129;
        goto L146
    L141:
        r55 = r127;
        goto L143
    L137:
        r53 = r125;
        goto L139
    L133:
        r51 = r123;
        goto L135
    L129:
        r49 = r121;
        goto L131
    L125:
        r47 = r119;
        goto L127
    L121:
        r45 = r117;
        goto L123
    L117:
        r43 = r115;
        goto L119
    L113:
        r41 = r113;
        goto L115
    L109:
        r39 = r111;
        goto L111
    L105:
        r37 = r109;
        goto L107
    L101:
        r35 = r107;
        goto L103
    L97:
        r33 = r105;
        goto L99
    L93:
        r31 = r103;
        goto L95
    L89:
        r29 = r101;
        goto L91
    L85:
        r27 = r99;
        goto L87
    L81:
        r25 = r97;
        goto L83
    L77:
        r23 = r95;
        goto L79
    L73:
        r21 = r93;
        goto L75
    L69:
        r19 = r91;
        goto L71
    L65:
        r17 = r89;
        goto L67
    L61:
        r14 = r87;
        goto L63
    L57:
        r12 = r85;
        goto L58
    L53:
        r10 = r83;
        goto L54
    L49:
        r8 = r81;
        goto L50
    L45:
        r6 = r79;
        goto L46
    L41:
        r4 = r77;
        goto L42
    L37:
        r2 = r75;
        goto L38
    L33:
        r15 = r73;
        goto L34
    L29:
        r13 = r71;
        goto L31
    L25:
        r11 = r69;
        goto L27
    L21:
        r9 = r67;
        goto L23
    L17:
        r7 = r65;
        goto L19
    L13:
        r5 = r63;
        goto L15
    L9:
        r3 = r61;
        goto L11
    L5:
        r1 = r59;
        goto L7
    }

    /* JADX INFO: renamed from: darkColorScheme-C-Xl9yA, reason: not valid java name */
    public static final ColorScheme m2058darkColorSchemeCXl9yA(long primary, long onPrimary, long primaryContainer, long onPrimaryContainer, long inversePrimary, long secondary, long onSecondary, long secondaryContainer, long onSecondaryContainer, long tertiary, long onTertiary, long tertiaryContainer, long onTertiaryContainer, long background, long onBackground, long surface, long onSurface, long surfaceVariant, long onSurfaceVariant, long surfaceTint, long inverseSurface, long inverseOnSurface, long error, long onError, long errorContainer, long onErrorContainer, long outline, long outlineVariant, long scrim, long surfaceBright, long surfaceContainer, long surfaceContainerHigh, long surfaceContainerHighest, long surfaceContainerLow, long surfaceContainerLowest, long surfaceDim) {
        return new ColorScheme(primary, onPrimary, primaryContainer, onPrimaryContainer, inversePrimary, secondary, onSecondary, secondaryContainer, onSecondaryContainer, tertiary, onTertiary, tertiaryContainer, onTertiaryContainer, background, onBackground, surface, onSurface, surfaceVariant, onSurfaceVariant, surfaceTint, inverseSurface, inverseOnSurface, error, onError, errorContainer, onErrorContainer, outline, outlineVariant, scrim, surfaceBright, surfaceDim, surfaceContainer, surfaceContainerHigh, surfaceContainerHighest, surfaceContainerLow, surfaceContainerLowest, null);
    }

    /* JADX INFO: renamed from: darkColorScheme-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m2061darkColorSchemeG1PFcw$default(long r45, long r47, long r49, long r51, long r53, long r55, long r57, long r59, long r61, long r63, long r65, long r67, long r69, long r71, long r73, long r75, long r77, long r79, long r81, long r83, long r85, long r87, long r89, long r91, long r93, long r95, long r97, long r99, long r101, int r103, Object r104) {
        if ((r103 & 1) == 0) goto L5;
        long r1 = ColorDarkTokens.INSTANCE.m3189getPrimary0d7_KjU();
    L7:
        if ((r103 & 2) == 0) goto L9;
        long r3 = ColorDarkTokens.INSTANCE.m3173getOnPrimary0d7_KjU();
    L11:
        if ((r103 & 4) == 0) goto L13;
        long r5 = ColorDarkTokens.INSTANCE.m3190getPrimaryContainer0d7_KjU();
    L15:
        if ((r103 & 8) == 0) goto L17;
        long r7 = ColorDarkTokens.INSTANCE.m3174getOnPrimaryContainer0d7_KjU();
    L19:
        if ((r103 & 16) == 0) goto L21;
        long r9 = ColorDarkTokens.INSTANCE.m3168getInversePrimary0d7_KjU();
    L23:
        if ((r103 & 32) == 0) goto L25;
        long r11 = ColorDarkTokens.INSTANCE.m3194getSecondary0d7_KjU();
    L27:
        if ((r103 & 64) == 0) goto L29;
        long r13 = ColorDarkTokens.INSTANCE.m3177getOnSecondary0d7_KjU();
    L31:
        if ((r103 & 128) == 0) goto L33;
        long r15 = ColorDarkTokens.INSTANCE.m3195getSecondaryContainer0d7_KjU();
    L34:
        long r46 = r1;
        if ((r103 & 256) == 0) goto L37;
        long r2 = ColorDarkTokens.INSTANCE.m3178getOnSecondaryContainer0d7_KjU();
    L38:
        long r62 = r2;
        if ((r103 & 512) == 0) goto L41;
        long r4 = ColorDarkTokens.INSTANCE.m3208getTertiary0d7_KjU();
    L42:
        long r64 = r4;
        if ((r103 & 1024) == 0) goto L45;
        long r6 = ColorDarkTokens.INSTANCE.m3183getOnTertiary0d7_KjU();
    L46:
        long r66 = r6;
        if ((r103 & 2048) == 0) goto L49;
        long r8 = ColorDarkTokens.INSTANCE.m3209getTertiaryContainer0d7_KjU();
    L50:
        long r68 = r8;
        if ((r103 & 4096) == 0) goto L53;
        long r10 = ColorDarkTokens.INSTANCE.m3184getOnTertiaryContainer0d7_KjU();
    L54:
        long r610 = r10;
        if ((r103 & 8192) == 0) goto L57;
        long r12 = ColorDarkTokens.INSTANCE.m3164getBackground0d7_KjU();
    L58:
        long r72 = r12;
        if ((r103 & 16384) == 0) goto L61;
        long r14 = ColorDarkTokens.INSTANCE.m3170getOnBackground0d7_KjU();
    L63:
        if ((r103 & 32768) == 0) goto L65;
        long r17 = ColorDarkTokens.INSTANCE.m3198getSurface0d7_KjU();
    L67:
        if ((r103 & 65536) == 0) goto L69;
        long r19 = ColorDarkTokens.INSTANCE.m3181getOnSurface0d7_KjU();
    L71:
        if ((r103 & 131072) == 0) goto L73;
        long r21 = ColorDarkTokens.INSTANCE.m3207getSurfaceVariant0d7_KjU();
    L75:
        if ((r103 & 262144) == 0) goto L77;
        long r23 = ColorDarkTokens.INSTANCE.m3182getOnSurfaceVariant0d7_KjU();
    L79:
        if ((r103 & 524288) == 0) goto L81;
        long r25 = r46;
    L83:
        if ((r103 & 1048576) == 0) goto L85;
        long r27 = ColorDarkTokens.INSTANCE.m3169getInverseSurface0d7_KjU();
    L87:
        if ((r103 & 2097152) == 0) goto L89;
        long r29 = ColorDarkTokens.INSTANCE.m3167getInverseOnSurface0d7_KjU();
    L91:
        if ((r103 & 4194304) == 0) goto L93;
        long r31 = ColorDarkTokens.INSTANCE.m3165getError0d7_KjU();
    L95:
        if ((r103 & 8388608) == 0) goto L97;
        long r33 = ColorDarkTokens.INSTANCE.m3171getOnError0d7_KjU();
    L99:
        if ((r103 & 16777216) == 0) goto L101;
        long r35 = ColorDarkTokens.INSTANCE.m3166getErrorContainer0d7_KjU();
    L103:
        if ((r103 & 33554432) == 0) goto L105;
        long r37 = ColorDarkTokens.INSTANCE.m3172getOnErrorContainer0d7_KjU();
    L107:
        if ((r103 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) == 0) goto L109;
        long r39 = ColorDarkTokens.INSTANCE.m3187getOutline0d7_KjU();
    L111:
        if ((r103 & 134217728) == 0) goto L113;
        long r41 = ColorDarkTokens.INSTANCE.m3188getOutlineVariant0d7_KjU();
    L115:
        if ((r103 & 268435456) == 0) goto L117;
        long r43 = ColorDarkTokens.INSTANCE.m3193getScrim0d7_KjU();
    L118:
        long r48 = r3;
        long r410 = r5;
        long r52 = r7;
        long r54 = r9;
        long r56 = r11;
        long r58 = r13;
        long r510 = r15;
        return m2060darkColorSchemeG1PFcw(r46, r48, r410, r52, r54, r56, r58, r510, r62, r64, r66, r68, r610, r72, r14, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43);
    L117:
        r43 = r101;
        goto L118
    L113:
        r41 = r99;
        goto L115
    L109:
        r39 = r97;
        goto L111
    L105:
        r37 = r95;
        goto L107
    L101:
        r35 = r93;
        goto L103
    L97:
        r33 = r91;
        goto L99
    L93:
        r31 = r89;
        goto L95
    L89:
        r29 = r87;
        goto L91
    L85:
        r27 = r85;
        goto L87
    L81:
        r25 = r83;
        goto L83
    L77:
        r23 = r81;
        goto L79
    L73:
        r21 = r79;
        goto L75
    L69:
        r19 = r77;
        goto L71
    L65:
        r17 = r75;
        goto L67
    L61:
        r14 = r73;
        goto L63
    L57:
        r12 = r71;
        goto L58
    L53:
        r10 = r69;
        goto L54
    L49:
        r8 = r67;
        goto L50
    L45:
        r6 = r65;
        goto L46
    L41:
        r4 = r63;
        goto L42
    L37:
        r2 = r61;
        goto L38
    L33:
        r15 = r59;
        goto L34
    L29:
        r13 = r57;
        goto L31
    L25:
        r11 = r55;
        goto L27
    L21:
        r9 = r53;
        goto L23
    L17:
        r7 = r51;
        goto L19
    L13:
        r5 = r49;
        goto L15
    L9:
        r3 = r47;
        goto L11
    L5:
        r1 = r45;
        goto L7
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with additional surface roles instead")
    /* JADX INFO: renamed from: darkColorScheme-G1PFc-w, reason: not valid java name */
    public static final /* synthetic */ ColorScheme m2060darkColorSchemeG1PFcw(long primary, long onPrimary, long primaryContainer, long onPrimaryContainer, long inversePrimary, long secondary, long onSecondary, long secondaryContainer, long onSecondaryContainer, long tertiary, long onTertiary, long tertiaryContainer, long onTertiaryContainer, long background, long onBackground, long surface, long onSurface, long surfaceVariant, long onSurfaceVariant, long surfaceTint, long inverseSurface, long inverseOnSurface, long error, long onError, long errorContainer, long onErrorContainer, long outline, long outlineVariant, long scrim) {
        return m2059darkColorSchemeCXl9yA$default(primary, onPrimary, primaryContainer, onPrimaryContainer, inversePrimary, secondary, onSecondary, secondaryContainer, onSecondaryContainer, tertiary, onTertiary, tertiaryContainer, onTertiaryContainer, background, onBackground, surface, onSurface, surfaceVariant, onSurfaceVariant, surfaceTint, inverseSurface, inverseOnSurface, error, onError, errorContainer, onErrorContainer, outline, outlineVariant, scrim, 0, 0, 0, 0, 0, 0, 0, -536870912, 15, null);
    }

    /* JADX INFO: renamed from: contentColorFor-4WTKRHQ, reason: not valid java name */
    public static final long m2056contentColorFor4WTKRHQ(ColorScheme $this$contentColorFor_u2d4WTKRHQ, long backgroundColor) {
        if (Color.m4367equalsimpl0(backgroundColor, $this$contentColorFor_u2d4WTKRHQ.m2038getPrimary0d7_KjU()) == false) goto L6;
        return $this$contentColorFor_u2d4WTKRHQ.m2028getOnPrimary0d7_KjU();
    L6:
        if (Color.m4367equalsimpl0(backgroundColor, $this$contentColorFor_u2d4WTKRHQ.m2041getSecondary0d7_KjU()) == false) goto L9;
        return $this$contentColorFor_u2d4WTKRHQ.m2030getOnSecondary0d7_KjU();
    L9:
        if (Color.m4367equalsimpl0(backgroundColor, $this$contentColorFor_u2d4WTKRHQ.m2053getTertiary0d7_KjU()) == false) goto L12;
        return $this$contentColorFor_u2d4WTKRHQ.m2034getOnTertiary0d7_KjU();
    L12:
        if (Color.m4367equalsimpl0(backgroundColor, $this$contentColorFor_u2d4WTKRHQ.m2019getBackground0d7_KjU()) == false) goto L15;
        return $this$contentColorFor_u2d4WTKRHQ.m2025getOnBackground0d7_KjU();
    L15:
        if (Color.m4367equalsimpl0(backgroundColor, $this$contentColorFor_u2d4WTKRHQ.m2020getError0d7_KjU()) == false) goto L18;
        return $this$contentColorFor_u2d4WTKRHQ.m2026getOnError0d7_KjU();
    L18:
        if (Color.m4367equalsimpl0(backgroundColor, $this$contentColorFor_u2d4WTKRHQ.m2039getPrimaryContainer0d7_KjU()) == false) goto L21;
        return $this$contentColorFor_u2d4WTKRHQ.m2029getOnPrimaryContainer0d7_KjU();
    L21:
        if (Color.m4367equalsimpl0(backgroundColor, $this$contentColorFor_u2d4WTKRHQ.m2042getSecondaryContainer0d7_KjU()) == false) goto L24;
        return $this$contentColorFor_u2d4WTKRHQ.m2031getOnSecondaryContainer0d7_KjU();
    L24:
        if (Color.m4367equalsimpl0(backgroundColor, $this$contentColorFor_u2d4WTKRHQ.m2054getTertiaryContainer0d7_KjU()) == false) goto L27;
        return $this$contentColorFor_u2d4WTKRHQ.m2035getOnTertiaryContainer0d7_KjU();
    L27:
        if (Color.m4367equalsimpl0(backgroundColor, $this$contentColorFor_u2d4WTKRHQ.m2021getErrorContainer0d7_KjU()) == false) goto L30;
        return $this$contentColorFor_u2d4WTKRHQ.m2027getOnErrorContainer0d7_KjU();
    L30:
        if (Color.m4367equalsimpl0(backgroundColor, $this$contentColorFor_u2d4WTKRHQ.m2024getInverseSurface0d7_KjU()) == false) goto L33;
        return $this$contentColorFor_u2d4WTKRHQ.m2022getInverseOnSurface0d7_KjU();
    L33:
        if (Color.m4367equalsimpl0(backgroundColor, $this$contentColorFor_u2d4WTKRHQ.m2043getSurface0d7_KjU()) == false) goto L36;
        return $this$contentColorFor_u2d4WTKRHQ.m2032getOnSurface0d7_KjU();
    L36:
        if (Color.m4367equalsimpl0(backgroundColor, $this$contentColorFor_u2d4WTKRHQ.m2052getSurfaceVariant0d7_KjU()) == false) goto L39;
        return $this$contentColorFor_u2d4WTKRHQ.m2033getOnSurfaceVariant0d7_KjU();
    L39:
        if (Color.m4367equalsimpl0(backgroundColor, $this$contentColorFor_u2d4WTKRHQ.m2044getSurfaceBright0d7_KjU()) == false) goto L42;
        return $this$contentColorFor_u2d4WTKRHQ.m2032getOnSurface0d7_KjU();
    L42:
        if (Color.m4367equalsimpl0(backgroundColor, $this$contentColorFor_u2d4WTKRHQ.m2045getSurfaceContainer0d7_KjU()) == false) goto L45;
        return $this$contentColorFor_u2d4WTKRHQ.m2032getOnSurface0d7_KjU();
    L45:
        if (Color.m4367equalsimpl0(backgroundColor, $this$contentColorFor_u2d4WTKRHQ.m2046getSurfaceContainerHigh0d7_KjU()) == false) goto L48;
        return $this$contentColorFor_u2d4WTKRHQ.m2032getOnSurface0d7_KjU();
    L48:
        if (Color.m4367equalsimpl0(backgroundColor, $this$contentColorFor_u2d4WTKRHQ.m2047getSurfaceContainerHighest0d7_KjU()) == false) goto L51;
        return $this$contentColorFor_u2d4WTKRHQ.m2032getOnSurface0d7_KjU();
    L51:
        if (Color.m4367equalsimpl0(backgroundColor, $this$contentColorFor_u2d4WTKRHQ.m2048getSurfaceContainerLow0d7_KjU()) == false) goto L54;
        return $this$contentColorFor_u2d4WTKRHQ.m2032getOnSurface0d7_KjU();
    L54:
        if (Color.m4367equalsimpl0(backgroundColor, $this$contentColorFor_u2d4WTKRHQ.m2049getSurfaceContainerLowest0d7_KjU()) == false) goto L57;
        return $this$contentColorFor_u2d4WTKRHQ.m2032getOnSurface0d7_KjU();
    L57:
        return Color.Companion.m4402getUnspecified0d7_KjU();
    }

    /* JADX INFO: renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m2057contentColorForek8zF_U(long backgroundColor, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 509589638, "C(contentColorFor)P(0:c#ui.graphics.Color):ColorScheme.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(509589638, $changed, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:878)");
    L5:
        $composer.startReplaceGroup(-1680936624);
        ComposerKt.sourceInformation($composer, "*878@39525L11,879@39609L7");
        long $this$takeOrElse_u2dDxMtmZc$iv = m2056contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme($composer, 6), backgroundColor);
        if ($this$takeOrElse_u2dDxMtmZc$iv == 16) goto L8;
        boolean r6 = true;
    L9:
        if (r6 == true) goto L12;
        ProvidableCompositionLocal<Color> r4 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r7 = $composer.consume(r4);
        ComposerKt.sourceInformationMarkerEnd($composer);
        $this$takeOrElse_u2dDxMtmZc$iv = ((Color) r7).m4376unboximpl();
    L12:
        $composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress() == false) goto L15;
        ComposerKt.traceEventEnd();
    L15:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return $this$takeOrElse_u2dDxMtmZc$iv;
    L8:
        r6 = false;
        goto L9
    }

    /* JADX INFO: renamed from: applyTonalElevation-RFCenO8, reason: not valid java name */
    public static final long m2055applyTonalElevationRFCenO8(ColorScheme $this$applyTonalElevation_u2dRFCenO8, long backgroundColor, float elevation, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1610977682, "C(applyTonalElevation)P(0:c#ui.graphics.Color,1:c#ui.unit.Dp)896@40465L7:ColorScheme.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1610977682, $changed, -1, "androidx.compose.material3.applyTonalElevation (ColorScheme.kt:895)");
    L5:
        ProvidableCompositionLocal<Boolean> r0 = LocalTonalElevationEnabled;
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r3 = $composer.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer);
        boolean tonalElevationEnabled = ((Boolean) r3).booleanValue();
        if (Color.m4367equalsimpl0(backgroundColor, $this$applyTonalElevation_u2dRFCenO8.m2043getSurface0d7_KjU()) == false) goto L9;
        if (tonalElevationEnabled == false) goto L9;
        long r1 = m2066surfaceColorAtElevation3ABfNKs($this$applyTonalElevation_u2dRFCenO8, elevation);
    L11:
        if (ComposerKt.isTraceInProgress() == false) goto L13;
        ComposerKt.traceEventEnd();
    L13:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L9:
        r1 = backgroundColor;
        goto L11
    }

    /* JADX INFO: renamed from: surfaceColorAtElevation-3ABfNKs, reason: not valid java name */
    public static final long m2066surfaceColorAtElevation3ABfNKs(ColorScheme $this$surfaceColorAtElevation_u2d3ABfNKs, float elevation) {
        if (Dp.m6978equalsimpl0(elevation, Dp.m6973constructorimpl(0)) == true) goto L5;
        float alpha = ((((float) Math.log(1.0f + elevation)) * 4.5f) + 2.0f) / 100.0f;
        return ColorKt.m4411compositeOverOWjLjI(Color.m4365copywmQWz5c$default($this$surfaceColorAtElevation_u2d3ABfNKs.m2051getSurfaceTint0d7_KjU(), alpha, 0.0f, 0.0f, 0.0f, 14, null), $this$surfaceColorAtElevation_u2d3ABfNKs.m2043getSurface0d7_KjU());
    L5:
        return $this$surfaceColorAtElevation_u2d3ABfNKs.m2043getSurface0d7_KjU();
    }

    public static final ColorScheme expressiveLightColorScheme() {
        return m2063lightColorSchemeCXl9yA$default(0, 0, 0, PaletteTokens.INSTANCE.m3548getPrimary300d7_KjU(), 0, 0, 0, 0, PaletteTokens.INSTANCE.m3561getSecondary300d7_KjU(), 0, 0, 0, PaletteTokens.INSTANCE.m3561getSecondary300d7_KjU(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4361, 15, null);
    }

    public static final long fromToken(ColorScheme $this$fromToken, ColorSchemeKeyTokens value) {
        switch(WhenMappings.$EnumSwitchMapping$0[value.ordinal()]) {
            case 1: goto L41;
            case 2: goto L77;
            case 3: goto L76;
            case 4: goto L75;
            case 5: goto L74;
            case 6: goto L73;
            case 7: goto L72;
            case 8: goto L71;
            case 9: goto L70;
            case 10: goto L69;
            case 11: goto L68;
            case 12: goto L67;
            case 13: goto L66;
            case 14: goto L65;
            case 15: goto L64;
            case 16: goto L63;
            case 17: goto L62;
            case 18: goto L61;
            case 19: goto L60;
            case 20: goto L59;
            case 21: goto L58;
            case 22: goto L57;
            case 23: goto L56;
            case 24: goto L55;
            case 25: goto L54;
            case 26: goto L53;
            case 27: goto L52;
            case 28: goto L51;
            case 29: goto L50;
            case 30: goto L49;
            case 31: goto L48;
            case 32: goto L47;
            case 33: goto L46;
            case 34: goto L45;
            case 35: goto L44;
            case 36: goto L43;
            default: goto L42;
        };
    L42:
        return Color.Companion.m4402getUnspecified0d7_KjU();
    L43:
        return $this$fromToken.m2054getTertiaryContainer0d7_KjU();
    L44:
        return $this$fromToken.m2053getTertiary0d7_KjU();
    L45:
        return $this$fromToken.m2050getSurfaceDim0d7_KjU();
    L46:
        return $this$fromToken.m2049getSurfaceContainerLowest0d7_KjU();
    L47:
        return $this$fromToken.m2048getSurfaceContainerLow0d7_KjU();
    L48:
        return $this$fromToken.m2047getSurfaceContainerHighest0d7_KjU();
    L49:
        return $this$fromToken.m2046getSurfaceContainerHigh0d7_KjU();
    L50:
        return $this$fromToken.m2045getSurfaceContainer0d7_KjU();
    L51:
        return $this$fromToken.m2044getSurfaceBright0d7_KjU();
    L52:
        return $this$fromToken.m2052getSurfaceVariant0d7_KjU();
    L53:
        return $this$fromToken.m2043getSurface0d7_KjU();
    L54:
        return $this$fromToken.m2042getSecondaryContainer0d7_KjU();
    L55:
        return $this$fromToken.m2041getSecondary0d7_KjU();
    L56:
        return $this$fromToken.m2040getScrim0d7_KjU();
    L57:
        return $this$fromToken.m2039getPrimaryContainer0d7_KjU();
    L58:
        return $this$fromToken.m2038getPrimary0d7_KjU();
    L59:
        return $this$fromToken.m2037getOutlineVariant0d7_KjU();
    L60:
        return $this$fromToken.m2036getOutline0d7_KjU();
    L61:
        return $this$fromToken.m2035getOnTertiaryContainer0d7_KjU();
    L62:
        return $this$fromToken.m2034getOnTertiary0d7_KjU();
    L63:
        return $this$fromToken.m2051getSurfaceTint0d7_KjU();
    L64:
        return $this$fromToken.m2033getOnSurfaceVariant0d7_KjU();
    L65:
        return $this$fromToken.m2032getOnSurface0d7_KjU();
    L66:
        return $this$fromToken.m2031getOnSecondaryContainer0d7_KjU();
    L67:
        return $this$fromToken.m2030getOnSecondary0d7_KjU();
    L68:
        return $this$fromToken.m2029getOnPrimaryContainer0d7_KjU();
    L69:
        return $this$fromToken.m2028getOnPrimary0d7_KjU();
    L70:
        return $this$fromToken.m2027getOnErrorContainer0d7_KjU();
    L71:
        return $this$fromToken.m2026getOnError0d7_KjU();
    L72:
        return $this$fromToken.m2025getOnBackground0d7_KjU();
    L73:
        return $this$fromToken.m2024getInverseSurface0d7_KjU();
    L74:
        return $this$fromToken.m2023getInversePrimary0d7_KjU();
    L75:
        return $this$fromToken.m2022getInverseOnSurface0d7_KjU();
    L76:
        return $this$fromToken.m2021getErrorContainer0d7_KjU();
    L77:
        return $this$fromToken.m2020getError0d7_KjU();
    L41:
        return $this$fromToken.m2019getBackground0d7_KjU();
    }

    static {
        LocalColorScheme = CompositionLocalKt.staticCompositionLocalOf(ColorSchemeKt$LocalColorScheme$1.INSTANCE);
        LocalTonalElevationEnabled = CompositionLocalKt.staticCompositionLocalOf(ColorSchemeKt$LocalTonalElevationEnabled$1.INSTANCE);
    }

    public static final ProvidableCompositionLocal<ColorScheme> getLocalColorScheme() {
        return LocalColorScheme;
    }

    public static final ProvidableCompositionLocal<Boolean> getLocalTonalElevationEnabled() {
        return LocalTonalElevationEnabled;
    }

    public static final long getValue(ColorSchemeKeyTokens $this$value, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -810780884, "C1009@45379L11:ColorScheme.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-810780884, $changed, -1, "androidx.compose.material3.<get-value> (ColorScheme.kt:1009)");
    L5:
        long r0 = fromToken(MaterialTheme.INSTANCE.getColorScheme($composer, 6), $this$value);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }
}
