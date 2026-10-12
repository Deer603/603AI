package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: PainterResources.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u001a1\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u00060\rR\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"errorMessage", "", "loadImageBitmapResource", "Landroidx/compose/ui/graphics/ImageBitmap;", "path", "", "res", "Landroid/content/res/Resources;", "id", "", "loadVectorResource", "Landroidx/compose/ui/graphics/vector/ImageVector;", "theme", "Landroid/content/res/Resources$Theme;", "changingConfigurations", "(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;IILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/vector/ImageVector;", "painterResource", "Landroidx/compose/ui/graphics/painter/Painter;", "(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PainterResources_androidKt {
    private static final String errorMessage = "Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP";

    public static final Painter painterResource(int id, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 473971343, "C(painterResource)57@2484L7,60@2606L7,62@2693L7:PainterResources.android.kt#ccshc7");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(473971343, $changed, -1, "androidx.compose.ui.res.painterResource (PainterResources.android.kt:56)");
    L5:
        ProvidableCompositionLocal<Context> r0 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r8 = $composer.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer);
        Context context = (Context) r8;
        ProvidableCompositionLocal<Configuration> r1 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        $composer.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer);
        Resources res = context.getResources();
        ProvidableCompositionLocal<ResourceIdCache> r2 = AndroidCompositionLocals_androidKt.getLocalResourceIdCache();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r5 = $composer.consume(r2);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ResourceIdCache resourceIdCache = (ResourceIdCache) r5;
        TypedValue value = resourceIdCache.resolveResourcePath(res, id);
        CharSequence path = value.string;
        boolean r3 = true;
        if (path != null) goto L8;
    L10:
        boolean r4 = false;
    L11:
        if (r4 == false) goto L13;
        $composer.startReplaceGroup(-803043333);
        ComposerKt.sourceInformation($composer, "68@2934L72,69@3015L34");
        ImageVector imageVector = loadVectorResource(context.getTheme(), res, id, value.changingConfigurations, $composer, ($changed << 6) & 896);
        VectorPainter r6 = VectorPainterKt.rememberVectorPainter(imageVector, $composer, 0);
        $composer.endReplaceGroup();
        BitmapPainter r7 = r6;
    L30:
        if (ComposerKt.isTraceInProgress() == false) goto L32;
        ComposerKt.traceEventEnd();
    L32:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r7;
    L13:
        $composer.startReplaceGroup(-802887899);
        ComposerKt.sourceInformation($composer, "73@3147L76");
        Object r9 = context.getTheme();
        ComposerKt.sourceInformationMarkerStart($composer, -1411370306, "CC(remember):PainterResources.android.kt#9igjgp");
        boolean r10 = $composer.changed(path);
        if ((($changed & 14) ^ 6) <= 4) goto L18;
        if ($composer.changed(id) == false) goto L18;
    L21:
        boolean invalid$iv = (r3 | r10) | $composer.changed(r9);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L24;
    L27:
        Object value$iv = loadImageBitmapResource(path, res, id);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L28:
        ImageBitmap imageBitmap = (ImageBitmap) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        BitmapPainter r12 = new BitmapPainter(imageBitmap, 0, 0, 6, null);
        $composer.endReplaceGroup();
        r7 = r12;
        goto L30
    L24:
        if (it$iv != Composer.Companion.getEmpty()) goto L28;
    L18:
        if (($changed & 6) == 4) goto L21;
        r3 = false;
        goto L21
    L8:
        if (StringsKt.endsWith$default(path, ".xml", false, 2, null) != true) goto L10;
        r4 = true;
        goto L11
    }

    private static final ImageVector loadVectorResource(Resources.Theme theme, Resources res, int id, int changingConfigurations, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 21855625, "C(loadVectorResource)P(3,2,1)90@3709L7:PainterResources.android.kt#ccshc7");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(21855625, $changed, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:89)");
    L5:
        ProvidableCompositionLocal<ImageVectorCache> r0 = AndroidCompositionLocals_androidKt.getLocalImageVectorCache();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r3 = $composer.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ImageVectorCache imageVectorCache = (ImageVectorCache) r3;
        ImageVectorCache.Key key = new ImageVectorCache.Key(theme, id);
        ImageVectorCache.ImageVectorEntry imageVectorEntry = imageVectorCache.get(key);
        if (imageVectorEntry != null) goto L12;
        XmlResourceParser parser = res.getXml(id);
        if (Intrinsics.areEqual(XmlVectorParser_androidKt.seekToStartTag(parser).getName(), "vector") == false) goto L11;
        imageVectorEntry = VectorResources_androidKt.loadVectorResourceInner(theme, res, parser, changingConfigurations);
        imageVectorCache.set(key, imageVectorEntry);
        goto L12
    L11:
        throw new IllegalArgumentException(errorMessage);
    L12:
        ImageVector r4 = imageVectorEntry.getImageVector();
        if (ComposerKt.isTraceInProgress() == false) goto L15;
        ComposerKt.traceEventEnd();
    L15:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r4;
    }

    private static final ImageBitmap loadImageBitmapResource(CharSequence path, Resources res, int id) {
        return ImageResources_androidKt.imageResource(ImageBitmap.Companion, res, id);
    L4:
        exception = move-exception;
        throw new ResourceResolutionException("Error attempting to load resource: " + path, exception);
    }
}
