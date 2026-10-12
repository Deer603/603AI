package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.LineHeightStyle;
import kotlin.Metadata;

/* JADX INFO: compiled from: Typography.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\r\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"DefaultLineHeightStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "getDefaultLineHeightStyle", "()Landroidx/compose/ui/text/style/LineHeightStyle;", "DefaultTextStyle", "Landroidx/compose/ui/text/TextStyle;", "getDefaultTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "LocalTypography", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/Typography;", "getLocalTypography", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "withDefaultFontFamily", "default", "Landroidx/compose/ui/text/font/FontFamily;", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TypographyKt {
    private static final LineHeightStyle DefaultLineHeightStyle = null;
    private static final TextStyle DefaultTextStyle = null;
    private static final ProvidableCompositionLocal<Typography> LocalTypography = null;

    public static final /* synthetic */ TextStyle access$withDefaultFontFamily(TextStyle $receiver, FontFamily r2) {
        return withDefaultFontFamily($receiver, r2);
    }

    private static final TextStyle withDefaultFontFamily(TextStyle $this$withDefaultFontFamily, FontFamily r34) {
        if ($this$withDefaultFontFamily.getFontFamily() == null) goto L6;
        return $this$withDefaultFontFamily;
    L6:
        return TextStyle.m6430copyp1EtxEg$default($this$withDefaultFontFamily, 0, 0, null, null, null, r34, null, 0, null, null, null, 0, null, null, null, 0, 0, 0, null, null, null, 0, 0, null, 16777183, null);
    }

    public static final LineHeightStyle getDefaultLineHeightStyle() {
        return DefaultLineHeightStyle;
    }

    static {
        DefaultLineHeightStyle = new LineHeightStyle(LineHeightStyle.Alignment.Companion.m6803getCenterPIaL0Z0(), LineHeightStyle.Trim.Companion.m6827getNoneEVpEnUU(), null);
        DefaultTextStyle = TextStyle.m6430copyp1EtxEg$default(TextStyle.Companion.getDefault(), 0, 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, 0, 0, 0, null, DefaultPlatformTextStyle_androidKt.defaultPlatformTextStyle(), DefaultLineHeightStyle, 0, 0, null, 15204351, null);
        LocalTypography = CompositionLocalKt.staticCompositionLocalOf(TypographyKt$LocalTypography$1.INSTANCE);
    }

    public static final TextStyle getDefaultTextStyle() {
        return DefaultTextStyle;
    }

    public static final ProvidableCompositionLocal<Typography> getLocalTypography() {
        return LocalTypography;
    }
}
