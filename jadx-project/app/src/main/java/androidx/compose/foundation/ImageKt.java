package androidx.compose.foundation;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.PainterModifierKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.BitmapPainterKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Image.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aS\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001ab\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001aS\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0017\u001aS\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Image", "", "bitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "contentDescription", "", "modifier", "Landroidx/compose/ui/Modifier;", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "(Landroidx/compose/ui/graphics/ImageBitmap;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "Image-5h-nEew", "(Landroidx/compose/ui/graphics/ImageBitmap;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILandroidx/compose/runtime/Composer;II)V", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V", "imageVector", "Landroidx/compose/ui/graphics/vector/ImageVector;", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ImageKt {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Consider usage of the Image composable that consumes an optional FilterQuality parameter", replaceWith = @ReplaceWith(expression = "Image(bitmap, contentDescription, modifier, alignment, contentScale, alpha, colorFilter, DefaultFilterQuality)", imports = {"androidx.compose.foundation", "androidx.compose.ui.graphics.DefaultAlpha", "androidx.compose.ui.Alignment", "androidx.compose.ui.graphics.drawscope.DrawScope.Companion.DefaultFilterQuality", "androidx.compose.ui.layout.ContentScale.Fit"}))
    public static final /* synthetic */ void Image(ImageBitmap bitmap, String contentDescription, Modifier modifier, Alignment alignment, ContentScale contentScale, float alpha, ColorFilter colorFilter, Composer $composer, int $changed, int r23) {
        ComposerKt.sourceInformationMarkerStart($composer, -2123228673, "C(Image)P(2,4,6!1,5)99@4662L177:Image.kt#71ulvw");
        if ((r23 & 4) == 0) goto L5;
        Modifier modifier2 = Modifier.Companion;
    L7:
        if ((r23 & 8) == 0) goto L9;
        Alignment alignment2 = Alignment.Companion.getCenter();
    L11:
        if ((r23 & 16) == 0) goto L13;
        ContentScale contentScale2 = ContentScale.Companion.getFit();
    L15:
        if ((r23 & 32) == 0) goto L17;
        float alpha2 = 1.0f;
    L19:
        if ((r23 & 64) == 0) goto L21;
        ColorFilter colorFilter2 = null;
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventStart(-2123228673, $changed, -1, "androidx.compose.foundation.Image (Image.kt:98)");
    L25:
        m291Image5hnEew(bitmap, contentDescription, modifier2, alignment2, contentScale2, alpha2, colorFilter2, FilterQuality.Companion.m4465getLowfv9h1I(), $composer, (((((($changed & 14) | ($changed & 112)) | ($changed & 896)) | ($changed & 7168)) | (57344 & $changed)) | (458752 & $changed)) | (3670016 & $changed), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L28;
        ComposerKt.traceEventEnd();
    L28:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return;
    L21:
        colorFilter2 = colorFilter;
        goto L23
    L17:
        alpha2 = alpha;
        goto L19
    L13:
        contentScale2 = contentScale;
        goto L15
    L9:
        alignment2 = alignment;
        goto L11
    L5:
        modifier2 = modifier;
        goto L7
    }

    /* JADX INFO: renamed from: Image-5h-nEew, reason: not valid java name */
    public static final void m291Image5hnEew(ImageBitmap bitmap, String contentDescription, Modifier modifier, Alignment alignment, ContentScale contentScale, float alpha, ColorFilter colorFilter, int filterQuality, Composer $composer, int $changed, int r31) {
        ComposerKt.sourceInformationMarkerStart($composer, -1396260732, "C(Image)P(2,4,7!1,5!,6:c#ui.graphics.FilterQuality)157@7322L73,158@7400L248:Image.kt#71ulvw");
        if ((r31 & 4) == 0) goto L5;
        Modifier.Companion modifier2 = Modifier.Companion;
    L7:
        if ((r31 & 8) == 0) goto L9;
        Alignment alignment2 = Alignment.Companion.getCenter();
    L11:
        if ((r31 & 16) == 0) goto L13;
        ContentScale contentScale2 = ContentScale.Companion.getFit();
    L15:
        if ((r31 & 32) == 0) goto L17;
        float alpha2 = 1.0f;
    L19:
        if ((r31 & 64) == 0) goto L21;
        ColorFilter colorFilter2 = null;
    L23:
        if ((r31 & 128) == 0) goto L25;
        int filterQuality2 = DrawScope.Companion.m4920getDefaultFilterQualityfv9h1I();
    L27:
        if (ComposerKt.isTraceInProgress() == false) goto L29;
        ComposerKt.traceEventStart(-1396260732, $changed, -1, "androidx.compose.foundation.Image (Image.kt:156)");
    L29:
        ComposerKt.sourceInformationMarkerStart($composer, 449060554, "CC(remember):Image.kt#9igjgp");
        boolean invalid$iv = $composer.changed(bitmap);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L32;
    L35:
        Object value$iv = BitmapPainterKt.m5040BitmapPainterQZhYCtY$default(bitmap, 0, 0, filterQuality2, 6, null);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L36:
        BitmapPainter bitmapPainter = (BitmapPainter) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        int r1 = (((($changed & 112) | ($changed & 896)) | ($changed & 7168)) | (57344 & $changed)) | (458752 & $changed);
        Image(bitmapPainter, contentDescription, modifier2, alignment2, contentScale2, alpha2, colorFilter2, $composer, (3670016 & $changed) | r1, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L39;
        ComposerKt.traceEventEnd();
    L39:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return;
    L32:
        if (it$iv != Composer.Companion.getEmpty()) goto L36;
    L25:
        filterQuality2 = filterQuality;
        goto L27
    L21:
        colorFilter2 = colorFilter;
        goto L23
    L17:
        alpha2 = alpha;
        goto L19
    L13:
        contentScale2 = contentScale;
        goto L15
    L9:
        alignment2 = alignment;
        goto L11
    L5:
        modifier2 = modifier;
        goto L7
    }

    public static final void Image(ImageVector imageVector, String contentDescription, Modifier modifier, Alignment alignment, ContentScale contentScale, float alpha, ColorFilter colorFilter, Composer $composer, int $changed, int r20) {
        ComposerKt.sourceInformationMarkerStart($composer, 1595907091, "C(Image)P(5,3,6!1,4)203@9450L34,202@9425L269:Image.kt#71ulvw");
        if ((r20 & 4) == 0) goto L5;
        Modifier modifier2 = Modifier.Companion;
        Modifier modifier3 = modifier2;
    L7:
        if ((r20 & 8) == 0) goto L9;
        Alignment alignment2 = Alignment.Companion.getCenter();
        Alignment alignment3 = alignment2;
    L11:
        if ((r20 & 16) == 0) goto L13;
        ContentScale contentScale2 = ContentScale.Companion.getFit();
        ContentScale contentScale3 = contentScale2;
    L15:
        if ((r20 & 32) == 0) goto L17;
        float alpha2 = 1.0f;
    L19:
        if ((r20 & 64) == 0) goto L21;
        ColorFilter colorFilter2 = null;
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventStart(1595907091, $changed, -1, "androidx.compose.foundation.Image (Image.kt:202)");
    L25:
        Image(VectorPainterKt.rememberVectorPainter(imageVector, $composer, $changed & 14), contentDescription, modifier3, alignment3, contentScale3, alpha2, colorFilter2, $composer, (((((VectorPainter.$stable | ($changed & 112)) | ($changed & 896)) | ($changed & 7168)) | (57344 & $changed)) | (458752 & $changed)) | (3670016 & $changed), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L28;
        ComposerKt.traceEventEnd();
    L28:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return;
    L21:
        colorFilter2 = colorFilter;
        goto L23
    L17:
        alpha2 = alpha;
        goto L19
    L13:
        contentScale3 = contentScale;
        goto L15
    L9:
        alignment3 = alignment;
        goto L11
    L5:
        modifier3 = modifier;
        goto L7
    }

    public static final void Image(final Painter painter, final String contentDescription, Modifier modifier, Alignment alignment, ContentScale contentScale, float alpha, ColorFilter colorFilter, Composer $composer, final int $changed, final int r33) {
        Composer $composer2 = $composer.startRestartGroup(1142754848);
        ComposerKt.sourceInformation($composer2, "C(Image)P(6,3,5!1,4)260@12126L392:Image.kt#71ulvw");
        int $dirty = $changed;
        if ((r33 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Painter r12 = painter;
    L14:
        if ((r33 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L23:
        int r3 = r33 & 4;
        if (r3 == 0) goto L27;
        $dirty = $dirty | 384;
        Modifier r5 = modifier;
    L34:
        int r6 = r33 & 8;
        if (r6 == 0) goto L38;
        $dirty = $dirty | 3072;
        Alignment r7 = alignment;
    L45:
        int r9 = r33 & 16;
        if (r9 == 0) goto L49;
        $dirty = $dirty | 24576;
        ContentScale r11 = contentScale;
    L56:
        int r13 = r33 & 32;
        if (r13 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L67:
        int r15 = r33 & 64;
        if (r15 == 0) goto L71;
        $dirty = $dirty | 1572864;
        ColorFilter r4 = colorFilter;
    L79:
        if (($dirty & 599187) == 599186) goto L81;
        boolean r0 = true;
    L83:
        if ($composer2.shouldExecute(r0, $dirty & 1) == false) goto L135;
        if (r3 == 0) goto L86;
        Modifier.Companion modifier2 = Modifier.Companion;
    L87:
        if (r6 == 0) goto L89;
        Alignment alignment2 = Alignment.Companion.getCenter();
    L90:
        if (r9 == 0) goto L92;
        ContentScale contentScale2 = ContentScale.Companion.getFit();
        int r8 = r15;
    L93:
        if (r13 == 0) goto L95;
        float alpha2 = 1.0f;
    L96:
        if (r8 == 0) goto L98;
        ColorFilter colorFilter2 = null;
        int r10 = 1142754848;
    L100:
        if (ComposerKt.isTraceInProgress() == false) goto L102;
        ComposerKt.traceEventStart(r10, $dirty, -1, "androidx.compose.foundation.Image (Image.kt:247)");
    L102:
        if (contentDescription == null) goto L115;
        $composer2.startReplaceGroup(1040425059);
        ComposerKt.sourceInformation($composer2, "250@11838L115");
        Modifier.Companion r14 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart($composer2, 449205108, "CC(remember):Image.kt#9igjgp");
        if (($dirty & 112) != 32) goto L106;
        boolean invalid$iv = true;
    L107:
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L110;
    L113:
        Object value$iv = (Function1) new ImageKt$Image$semantics$1$1(contentDescription);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L114:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        int r16 = 0;
        Modifier.Companion semantics = SemanticsModifierKt.semantics$default(r14, false, (Function1) it$iv, 1, null);
        $composer2.endReplaceGroup();
    L116:
        Modifier modifier$iv = PainterModifierKt.paint$default(ClipKt.clipToBounds(modifier2.then(semantics)), r12, false, alignment2, contentScale2, alpha2, colorFilter2, 2, null);
        MeasurePolicy measurePolicy$iv = AnonymousClass1.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, 544976794, "CC(Layout)P(1)121@4798L23,124@4949L333:Layout.kt#80mrfh");
        int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, r16);
        Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        CompositionLocalMap localMap$iv = $composer2.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> r17 = ComposeUiNode.Companion.getConstructor();
        Modifier modifier3 = modifier2;
        ComposerKt.sourceInformationMarkerStart($composer2, 1405779621, "CC(ReusableComposeNode):Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L119;
        ComposablesKt.invalidApplier();
    L119:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L122;
        $composer2.createNode(r17);
    L123:
        Composer $this$Layout_u24lambda_u241$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u241$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u241$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Updater.m3815setimpl($this$Layout_u24lambda_u241$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
        Function2<ComposeUiNode, Integer, Unit> r1 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u241$iv.getInserting() == true) goto L130;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u241$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv)) == false) goto L130;
    L131:
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L134;
        ComposerKt.traceEventEnd();
    L134:
        final Modifier modifier4 = modifier3;
        final Alignment alignment3 = alignment2;
        final ContentScale contentScale3 = contentScale2;
        final float alpha3 = alpha2;
        final ColorFilter colorFilter3 = colorFilter2;
    L136:
        ScopeUpdateScope r18 = $composer2.endRestartGroup();
        if (r18 == null) goto L140;
        r18.updateScope(new AnonymousClass2(painter, contentDescription, modifier4, alignment3, contentScale3, alpha3, colorFilter3, $changed, r33));
        return;
    L140:
        return;
    L130:
        $this$Layout_u24lambda_u241$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
        $this$Layout_u24lambda_u241$iv.apply(Integer.valueOf(compositeKeyHash$iv), r1);
        goto L131
    L122:
        $composer2.useNode();
        goto L123
    L110:
        if (it$iv != Composer.Companion.getEmpty()) goto L114;
    L106:
        invalid$iv = false;
        goto L107
    L115:
        r16 = 0;
        $composer2.startReplaceGroup(1040583841);
        $composer2.endReplaceGroup();
        semantics = Modifier.Companion;
        goto L116
    L98:
        colorFilter2 = r4;
        r10 = 1142754848;
        goto L100
    L95:
        alpha2 = alpha;
        goto L96
    L92:
        r8 = r15;
        contentScale2 = r11;
        goto L93
    L89:
        alignment2 = r7;
        goto L90
    L86:
        modifier2 = r5;
        goto L87
    L135:
        $composer2.skipToGroupEnd();
        Alignment r19 = r7;
        colorFilter3 = r4;
        alignment3 = r19;
        alpha3 = alpha;
        modifier4 = r5;
        contentScale3 = r11;
        goto L136
    L81:
        r0 = false;
        goto L83
    L71:
        if (($changed & 1572864) != 0) goto L77;
        r4 = colorFilter;
        if ($composer2.changed(r4) == false) goto L75;
        int r110 = 1048576;
    L76:
        $dirty = $dirty | r110;
        goto L79
    L75:
        r110 = 524288;
        goto L76
    L77:
        r4 = colorFilter;
        goto L79
    L60:
        if ((196608 & $changed) != 0) goto L67;
        if ($composer2.changed(alpha) == false) goto L64;
        int r111 = 131072;
    L65:
        $dirty = $dirty | r111;
        goto L67
    L64:
        r111 = 65536;
        goto L65
    L49:
        if (($changed & 24576) != 0) goto L55;
        r11 = contentScale;
        if ($composer2.changed(r11) == false) goto L53;
        int r112 = 16384;
    L54:
        $dirty = $dirty | r112;
        goto L56
    L53:
        r112 = 8192;
        goto L54
    L55:
        r11 = contentScale;
        goto L56
    L38:
        if (($changed & 3072) != 0) goto L44;
        r7 = alignment;
        if ($composer2.changed(r7) == false) goto L42;
        int r20 = 2048;
    L43:
        $dirty = $dirty | r20;
        goto L45
    L42:
        r20 = 1024;
        goto L43
    L44:
        r7 = alignment;
        goto L45
    L27:
        if (($changed & 384) != 0) goto L33;
        r5 = modifier;
        if ($composer2.changed(r5) == false) goto L31;
        int r21 = 256;
    L32:
        $dirty = $dirty | r21;
        goto L34
    L31:
        r21 = 128;
        goto L32
    L33:
        r5 = modifier;
        goto L34
    L17:
        if (($changed & 48) != 0) goto L23;
        if ($composer2.changed(contentDescription) == false) goto L21;
        int r22 = 32;
    L22:
        $dirty = $dirty | r22;
        goto L23
    L21:
        r22 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L12;
        r12 = painter;
        if ($composer2.changedInstance(r12) == false) goto L10;
        int r23 = 4;
    L11:
        $dirty = $dirty | r23;
        goto L14
    L10:
        r23 = 2;
        goto L11
    L12:
        r12 = painter;
        goto L14
    }
}
