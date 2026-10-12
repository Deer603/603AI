package androidx.compose.material.ripple;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;

/* JADX INFO: compiled from: RippleTheme.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"DarkThemeRippleAlpha", "Landroidx/compose/material/ripple/RippleAlpha;", "LightThemeHighContrastRippleAlpha", "LightThemeLowContrastRippleAlpha", "LocalRippleTheme", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/ripple/RippleTheme;", "getLocalRippleTheme$annotations", "()V", "getLocalRippleTheme", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "RippleThemeDeprecationMessage", "", "material-ripple_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class RippleThemeKt {
    private static final RippleAlpha DarkThemeRippleAlpha = null;
    private static final RippleAlpha LightThemeHighContrastRippleAlpha = null;
    private static final RippleAlpha LightThemeLowContrastRippleAlpha = null;
    private static final ProvidableCompositionLocal<RippleTheme> LocalRippleTheme = null;
    private static final String RippleThemeDeprecationMessage = "RippleTheme and LocalRippleTheme have been deprecated - they are not compatible with the new ripple implementation using the new Indication APIs that provide notable performance improvements. For a migration guide and background information, please visit developer.android.com";

    public static final /* synthetic */ RippleAlpha access$getDarkThemeRippleAlpha$p() {
        return DarkThemeRippleAlpha;
    }

    public static final /* synthetic */ RippleAlpha access$getLightThemeHighContrastRippleAlpha$p() {
        return LightThemeHighContrastRippleAlpha;
    }

    public static final /* synthetic */ RippleAlpha access$getLightThemeLowContrastRippleAlpha$p() {
        return LightThemeLowContrastRippleAlpha;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = RippleThemeDeprecationMessage)
    public static /* synthetic */ void getLocalRippleTheme$annotations() {
    }

    static {
        LocalRippleTheme = CompositionLocalKt.staticCompositionLocalOf(RippleThemeKt$LocalRippleTheme$1.INSTANCE);
        LightThemeHighContrastRippleAlpha = new RippleAlpha(0.16f, 0.24f, 0.08f, 0.24f);
        LightThemeLowContrastRippleAlpha = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.12f);
        DarkThemeRippleAlpha = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.1f);
    }

    public static final ProvidableCompositionLocal<RippleTheme> getLocalRippleTheme() {
        return LocalRippleTheme;
    }
}
