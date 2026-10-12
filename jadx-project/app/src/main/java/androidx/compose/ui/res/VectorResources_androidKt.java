package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.compat.AndroidVectorParser;
import androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: VectorResources.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0000\u001a\u00020\u00012\u000e\b\u0002\u0010\u0002\u001a\b\u0018\u00010\u0003R\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000\u001a*\u0010\n\u001a\u00020\u000b*\u00020\f2\u000e\b\u0002\u0010\u0002\u001a\b\u0018\u00010\u0003R\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\t\u001a\u001b\u0010\n\u001a\u00020\u000b*\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"loadVectorResourceInner", "Landroidx/compose/ui/res/ImageVectorCache$ImageVectorEntry;", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "res", "parser", "Landroid/content/res/XmlResourceParser;", "changingConfigurations", "", "vectorResource", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Landroidx/compose/ui/graphics/vector/ImageVector$Companion;", "resId", "id", "(Landroidx/compose/ui/graphics/vector/ImageVector$Companion;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/vector/ImageVector;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class VectorResources_androidKt {
    public static final ImageVector vectorResource(ImageVector.Companion $this$vectorResource, int id, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 44534090, "C(vectorResource)48@1966L7,49@1988L11,52@2042L78:VectorResources.android.kt#ccshc7");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(44534090, $changed, -1, "androidx.compose.ui.res.vectorResource (VectorResources.android.kt:47)");
    L5:
        ProvidableCompositionLocal<Context> r0 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r3 = $composer.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer);
        Context context = (Context) r3;
        boolean r1 = false;
        Resources res = Resources_androidKt.resources($composer, 0);
        Resources.Theme theme = context.getTheme();
        Object r4 = res.getConfiguration();
        ComposerKt.sourceInformationMarkerStart($composer, -1769560570, "CC(remember):VectorResources.android.kt#9igjgp");
        if ((($changed & 112) ^ 48) <= 32) goto L10;
        if ($composer.changed(id) == false) goto L10;
    L11:
        r1 = true;
    L12:
        boolean invalid$iv = ((r1 | $composer.changed(res)) | $composer.changed(theme)) | $composer.changed(r4);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L15;
    L18:
        Object value$iv = vectorResource($this$vectorResource, theme, res, id);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L19:
        ImageVector r6 = (ImageVector) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L22;
        ComposerKt.traceEventEnd();
    L22:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r6;
    L15:
        if (it$iv != Composer.Companion.getEmpty()) goto L19;
    L10:
        if (($changed & 48) != 32) goto L12;
        goto L11
    }

    public static /* synthetic */ ImageVector vectorResource$default(ImageVector.Companion r0, Resources.Theme r1, Resources r2, int r3, int r4, Object r5) throws XmlPullParserException {
        if ((r4 & 1) == 0) goto L6;
        r1 = null;
    L6:
        return vectorResource(r0, r1, r2, r3);
    }

    public static final ImageVector vectorResource(ImageVector.Companion $this$vectorResource, Resources.Theme theme, Resources res, int resId) throws XmlPullParserException {
        TypedValue value = new TypedValue();
        res.getValue(resId, value, true);
        XmlResourceParser $this$vectorResource_u24lambda_u241 = res.getXml(resId);
        XmlVectorParser_androidKt.seekToStartTag($this$vectorResource_u24lambda_u241);
        Unit r2 = Unit.INSTANCE;
        return loadVectorResourceInner(theme, res, $this$vectorResource_u24lambda_u241, value.changingConfigurations).getImageVector();
    }

    public static /* synthetic */ ImageVectorCache.ImageVectorEntry loadVectorResourceInner$default(Resources.Theme r0, Resources r1, XmlResourceParser r2, int r3, int r4, Object r5) throws XmlPullParserException {
        if ((r4 & 1) == 0) goto L6;
        r0 = null;
    L6:
        return loadVectorResourceInner(r0, r1, r2, r3);
    }

    public static final ImageVectorCache.ImageVectorEntry loadVectorResourceInner(Resources.Theme theme, Resources res, XmlResourceParser parser, int changingConfigurations) throws XmlPullParserException {
        AttributeSet attrs = Xml.asAttributeSet(parser);
        AndroidVectorParser resourceParser = new AndroidVectorParser(parser, 0, 2, null);
        ImageVector.Builder builder = XmlVectorParser_androidKt.createVectorImageBuilder(resourceParser, res, theme, attrs);
        int nestedGroups = 0;
    L4:
        if (XmlVectorParser_androidKt.isAtEnd(parser) == true) goto L7;
        Resources.Theme theme2 = theme;
        nestedGroups = XmlVectorParser_androidKt.parseCurrentVectorNode(resourceParser, res, attrs, theme2, builder, nestedGroups);
        parser.next();
        theme = theme2;
        goto L4
    L7:
        return new ImageVectorCache.ImageVectorEntry(builder.build(), changingConfigurations);
    }
}
