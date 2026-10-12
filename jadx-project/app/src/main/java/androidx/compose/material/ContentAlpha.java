package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: ContentAlpha.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006¨\u0006\u000f"}, d2 = {"Landroidx/compose/material/ContentAlpha;", "", "()V", "disabled", "", "getDisabled", "(Landroidx/compose/runtime/Composer;I)F", "high", "getHigh", "medium", "getMedium", "contentAlpha", "highContrastAlpha", "lowContrastAlpha", "(FFLandroidx/compose/runtime/Composer;I)F", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ContentAlpha {
    public static final int $stable = 0;
    public static final ContentAlpha INSTANCE = null;

    static {
        INSTANCE = new ContentAlpha();
    }

    private ContentAlpha() {
    }

    public final float getHigh(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 629162431, "C(<get-high>)36@1157L158:ContentAlpha.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(629162431, $changed, -1, "androidx.compose.material.ContentAlpha.<get-high> (ContentAlpha.kt:36)");
    L5:
        float r0 = contentAlpha(1.0f, 0.87f, $composer, (($changed << 6) & 896) | 54);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final float getMedium(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1999054879, "C(<get-medium>)48@1532L162:ContentAlpha.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1999054879, $changed, -1, "androidx.compose.material.ContentAlpha.<get-medium> (ContentAlpha.kt:48)");
    L5:
        float r0 = contentAlpha(0.74f, 0.6f, $composer, (($changed << 6) & 896) | 54);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final float getDisabled(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 621183615, "C(<get-disabled>)60@1903L166:ContentAlpha.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(621183615, $changed, -1, "androidx.compose.material.ContentAlpha.<get-disabled> (ContentAlpha.kt:60)");
    L5:
        float r0 = contentAlpha(0.38f, 0.38f, $composer, (($changed << 6) & 896) | 54);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    private final float contentAlpha(float highContrastAlpha, float lowContrastAlpha, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1528360391, "C(contentAlpha)78@2709L7,79@2756L6:ContentAlpha.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1528360391, $changed, -1, "androidx.compose.material.ContentAlpha.contentAlpha (ContentAlpha.kt:77)");
    L5:
        ProvidableCompositionLocal<Color> r0 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r3 = $composer.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer);
        long contentColor = ((Color) r3).m4376unboximpl();
        boolean lightTheme = MaterialTheme.INSTANCE.getColors($composer, 6).isLight();
        if (lightTheme == false) goto L11;
        if (ColorKt.m4418luminance8_81llA(contentColor) > 0.5d) goto L12;
    L13:
        float r4 = lowContrastAlpha;
    L15:
        if (ComposerKt.isTraceInProgress() == false) goto L17;
        ComposerKt.traceEventEnd();
    L17:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r4;
    L12:
        r4 = highContrastAlpha;
        goto L15
    L11:
        if (ColorKt.m4418luminance8_81llA(contentColor) >= 0.5d) goto L13;
        goto L12
    }
}
