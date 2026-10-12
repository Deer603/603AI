package androidx.compose.ui.graphics.vector;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.profileinstaller.ProfileVerifier;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* JADX INFO: compiled from: VectorPainter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0002\u0010\t\u001a$\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0000\u001a*\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\u0015\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010$\u001a\u0096\u0001\u0010\"\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010(\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2@\u0010)\u001a<\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b+\u0012\b\b(\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b+\u0012\b\b(\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00030*¢\u0006\u0002\b,¢\u0006\u0002\b-H\u0007ø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001a \u0001\u0010\"\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010(\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u00100\u001a\u0002012@\u0010)\u001a<\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b+\u0012\b\b(\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b+\u0012\b\b(\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00030*¢\u0006\u0002\b,¢\u0006\u0002\b-H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001aD\u00104\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\u001b2\b\b\u0002\u0010(\u001a\u00020\u00012\b\u00106\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u00100\u001a\u000201H\u0000ø\u0001\u0000¢\u0006\u0004\b7\u00108\u001a\u0014\u00109\u001a\u00020\u0019*\u00020\u00192\u0006\u0010:\u001a\u00020\u0005H\u0000\u001a&\u0010;\u001a\u00020\u0003*\u00020<2\u0017\u0010=\u001a\u0013\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u00030>¢\u0006\u0002\b?H\u0082\b\u001a&\u0010@\u001a\u00020\u001b*\u00020\u00152\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&H\u0002ø\u0001\u0000¢\u0006\u0004\bA\u0010B\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006C"}, d2 = {"RootGroupName", "", "RenderVectorGroup", "", "group", "Landroidx/compose/ui/graphics/vector/VectorGroup;", "configs", "", "Landroidx/compose/ui/graphics/vector/VectorConfig;", "(Landroidx/compose/ui/graphics/vector/VectorGroup;Ljava/util/Map;Landroidx/compose/runtime/Composer;II)V", "createColorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "tintColor", "Landroidx/compose/ui/graphics/Color;", "tintBlendMode", "Landroidx/compose/ui/graphics/BlendMode;", "createColorFilter-xETnrds", "(JI)Landroidx/compose/ui/graphics/ColorFilter;", "createVectorPainterFromImageVector", "Landroidx/compose/ui/graphics/vector/VectorPainter;", "density", "Landroidx/compose/ui/unit/Density;", "imageVector", "Landroidx/compose/ui/graphics/vector/ImageVector;", "root", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "obtainViewportSize", "Landroidx/compose/ui/geometry/Size;", "defaultSize", "viewportWidth", "", "viewportHeight", "obtainViewportSize-Pq9zytI", "(JFF)J", "rememberVectorPainter", "image", "(Landroidx/compose/ui/graphics/vector/ImageVector;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/vector/VectorPainter;", "defaultWidth", "Landroidx/compose/ui/unit/Dp;", "defaultHeight", HintConstants.AUTOFILL_HINT_NAME, "content", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/graphics/vector/VectorComposable;", "rememberVectorPainter-mlNsNFs", "(FFFFLjava/lang/String;JILkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/graphics/vector/VectorPainter;", "autoMirror", "", "rememberVectorPainter-vIP8VLU", "(FFFFLjava/lang/String;JIZLkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/graphics/vector/VectorPainter;", "configureVectorPainter", "viewportSize", "intrinsicColorFilter", "configureVectorPainter-T4PVSW8", "(Landroidx/compose/ui/graphics/vector/VectorPainter;JJLjava/lang/String;Landroidx/compose/ui/graphics/ColorFilter;Z)Landroidx/compose/ui/graphics/vector/VectorPainter;", "createGroupComponent", "currentGroup", "mirror", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "obtainSizePx", "obtainSizePx-VpY3zN4", "(Landroidx/compose/ui/unit/Density;FF)J", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class VectorPainterKt {
    public static final String RootGroupName = "VectorRootGroup";

    @Deprecated(message = "Replace rememberVectorPainter graphicsLayer that consumes the auto mirror flag", replaceWith = @ReplaceWith(expression = "rememberVectorPainter(defaultWidth, defaultHeight, viewportWidth, viewportHeight, name, tintColor, tintBlendMode, false, content)", imports = {"androidx.compose.ui.graphics.vector"}))
    /* JADX INFO: renamed from: rememberVectorPainter-mlNsNFs, reason: not valid java name */
    public static final VectorPainter m5079rememberVectorPaintermlNsNFs(float defaultWidth, float defaultHeight, float viewportWidth, float viewportHeight, String name, long tintColor, int tintBlendMode, Function4<? super Float, ? super Float, ? super Composer, ? super Integer, Unit> r24, Composer $composer, int $changed, int r27) {
        ComposerKt.sourceInformationMarkerStart($composer, -964365210, "C(rememberVectorPainter)P(2:c#ui.unit.Dp,1:c#ui.unit.Dp,7,6,3,5:c#ui.graphics.Color,4:c#ui.graphics.BlendMode)85@3804L207:VectorPainter.kt#huu6hf");
        if ((r27 & 4) == 0) goto L5;
        float viewportWidth2 = Float.NaN;
    L7:
        if ((r27 & 8) == 0) goto L9;
        float viewportHeight2 = Float.NaN;
    L11:
        if ((r27 & 16) == 0) goto L13;
        String name2 = RootGroupName;
    L15:
        if ((r27 & 32) == 0) goto L17;
        long tintColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L19:
        if ((r27 & 64) == 0) goto L21;
        int tintBlendMode2 = BlendMode.Companion.m4306getSrcIn0nO6VwU();
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventStart(-964365210, $changed, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:85)");
    L25:
        VectorPainter r1 = m5080rememberVectorPaintervIP8VLU(defaultWidth, defaultHeight, viewportWidth2, viewportHeight2, name2, tintColor2, tintBlendMode2, false, r24, $composer, (((((((($changed & 14) | 12582912) | ($changed & 112)) | ($changed & 896)) | ($changed & 7168)) | (57344 & $changed)) | (458752 & $changed)) | (3670016 & $changed)) | (($changed << 3) & 234881024), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L28;
        ComposerKt.traceEventEnd();
    L28:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L21:
        tintBlendMode2 = tintBlendMode;
        goto L23
    L17:
        tintColor2 = tintColor;
        goto L19
    L13:
        name2 = name;
        goto L15
    L9:
        viewportHeight2 = viewportHeight;
        goto L11
    L5:
        viewportWidth2 = viewportWidth;
        goto L7
    }

    /* JADX INFO: renamed from: rememberVectorPainter-vIP8VLU, reason: not valid java name */
    public static final VectorPainter m5080rememberVectorPaintervIP8VLU(float r24, float r25, float r26, float r27, String r28, long r29, int r31, boolean r32, Function4<? super Float, ? super Float, ? super Composer, ? super Integer, Unit> r33, Composer r34, int r35, int r36) {
        ComposerKt.sourceInformationMarkerStart(r34, 1068590786, "C(rememberVectorPainter)P(3:c#ui.unit.Dp,2:c#ui.unit.Dp,8,7,4,6:c#ui.graphics.Color,5:c#ui.graphics.BlendMode)130@5710L7,134@5911L82:VectorPainter.kt#huu6hf");
        if ((r36 & 4) == 0) goto L5;
        float r5 = Float.NaN;
    L7:
        if ((r36 & 8) == 0) goto L9;
        float r6 = Float.NaN;
    L11:
        if ((r36 & 16) == 0) goto L13;
        String r13 = RootGroupName;
    L15:
        if ((r36 & 32) == 0) goto L17;
        long r7 = Color.Companion.m4402getUnspecified0d7_KjU();
    L19:
        if ((r36 & 64) == 0) goto L21;
        int r9 = BlendMode.Companion.m4306getSrcIn0nO6VwU();
    L23:
        if ((r36 & 128) == 0) goto L25;
        boolean r15 = false;
    L27:
        if (ComposerKt.isTraceInProgress() == false) goto L29;
        ComposerKt.traceEventStart(1068590786, r35, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:129)");
    L29:
        ProvidableCompositionLocal<Density> r3 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(r34, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r11 = r34.consume(r3);
        ComposerKt.sourceInformationMarkerEnd(r34);
        long r12 = m5077obtainSizePxVpY3zN4((Density) r11, r24, r25);
        final long r14 = m5078obtainViewportSizePq9zytI(r12, r5, r6);
        ComposerKt.sourceInformationMarkerStart(r34, -1837512596, "CC(remember):VectorPainter.kt#9igjgp");
        if (((458752 & r35) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) goto L34;
        if (r34.changed(r7) == false) goto L34;
    L35:
        boolean r4 = true;
    L38:
        if (((3670016 & r35) ^ 1572864) <= 1048576) goto L42;
        if (r34.changed(r9) == false) goto L42;
    L43:
        boolean r0 = true;
    L45:
        boolean r1 = r0 | r4;
        Object r2 = r34.rememberedValue();
        if (r1 == false) goto L48;
    L51:
        Object r10 = m5076createColorFilterxETnrds(r7, r9);
        r34.updateRememberedValue(r10);
        r2 = r10;
    L52:
        ColorFilter r16 = (ColorFilter) r2;
        ComposerKt.sourceInformationMarkerEnd(r34);
        r34.startReplaceGroup(-1837507429);
        ComposerKt.sourceInformation(r34, "*135@6005L28,144@6352L28,146@6427L513,158@7019L39,158@6996L62");
        ComposerKt.sourceInformationMarkerStart(r34, -1837509642, "CC(remember):VectorPainter.kt#9igjgp");
        Object r8 = r34.rememberedValue();
        if (r8 != Composer.Companion.getEmpty()) goto L56;
        Object r17 = new VectorPainter(null, 1, null);
        r34.updateRememberedValue(r17);
        r8 = r17;
    L56:
        VectorPainter r18 = (VectorPainter) r8;
        ComposerKt.sourceInformationMarkerEnd(r34);
        m5074configureVectorPainterT4PVSW8(r18, r12, r14, r13, r16, r15);
        CompositionContext r19 = ComposablesKt.rememberCompositionContext(r34, 0);
        ComposerKt.sourceInformationMarkerStart(r34, 904086938, "CC(remember):VectorPainter.kt#9igjgp");
        if (((r35 & 896) ^ 384) <= 256) goto L61;
        if (r34.changed(r5) == false) goto L61;
    L62:
        boolean r20 = true;
    L65:
        if (((r35 & 7168) ^ 3072) <= 2048) goto L69;
        if (r34.changed(r6) == false) goto L69;
    L70:
        boolean r21 = true;
    L72:
        boolean r22 = r21 | r20;
        if (((234881024 & r35) ^ 100663296) <= 67108864) goto L78;
        final Function4<? super Float, ? super Float, ? super Composer, ? super Integer, Unit> r23 = r33;
        if (r34.changed(r23) == false) goto L79;
        boolean r37 = r22;
    L81:
        boolean r30 = true;
    L83:
        boolean r38 = r37 | r30;
        Object r39 = r34.rememberedValue();
        if (r38 == false) goto L86;
    L89:
        Composition r210 = r18.getComposition$ui_release();
        if (r210 != null) goto L92;
    L95:
        Composition r40 = CompositionKt.Composition(new VectorApplier(r18.getVector$ui_release().getRoot()), r19);
    L96:
        r40.setContent(ComposableLambdaKt.composableLambdaInstance(2008312779, true, new VectorPainterKt$rememberVectorPainter$2$composition$1$1(r23, r14)));
        r34.updateRememberedValue(r40);
        Object r41 = r40;
    L97:
        final Composition r42 = (Composition) r41;
        ComposerKt.sourceInformationMarkerEnd(r34);
        r18.setComposition$ui_release(r42);
        ComposerKt.sourceInformationMarkerStart(r34, 904105408, "CC(remember):VectorPainter.kt#9igjgp");
        boolean r43 = r34.changedInstance(r42);
        Object r44 = r34.rememberedValue();
        if (r43 == true) goto L104;
        if (r44 == Composer.Companion.getEmpty()) goto L104;
    L105:
        ComposerKt.sourceInformationMarkerEnd(r34);
        EffectsKt.DisposableEffect(r18, (Function1) r44, r34, 0);
        r34.endReplaceGroup();
        if (ComposerKt.isTraceInProgress() == false) goto L108;
        ComposerKt.traceEventEnd();
    L108:
        ComposerKt.sourceInformationMarkerEnd(r34);
        return r18;
    L104:
        Object r45 = (Function1) new VectorPainterKt$rememberVectorPainter$2$1$1(r42);
        r34.updateRememberedValue(r45);
        r44 = r45;
        goto L105
    L92:
        if (r210.isDisposed() == true) goto L95;
        r40 = r210;
        goto L96
    L86:
        if (r39 == Composer.Companion.getEmpty()) goto L89;
        r41 = r39;
    L79:
        r37 = r22;
        if ((r35 & 100663296) == 67108864) goto L81;
        r30 = false;
        goto L83
    L78:
        r23 = r33;
    L69:
        if ((r35 & 3072) == 2048) goto L70;
        r21 = false;
    L61:
        if ((r35 & 384) == 256) goto L62;
        r20 = false;
        goto L65
    L48:
        if (r2 != Composer.Companion.getEmpty()) goto L52;
    L42:
        if ((r35 & 1572864) == 1048576) goto L43;
        r0 = false;
    L34:
        if ((r35 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) goto L35;
        r4 = false;
        goto L38
    L25:
        r15 = r32;
        goto L27
    L21:
        r9 = r31;
        goto L23
    L17:
        r7 = r29;
        goto L19
    L13:
        r13 = r28;
        goto L15
    L9:
        r6 = r27;
        goto L11
    L5:
        r5 = r26;
        goto L7
    }

    public static final VectorPainter rememberVectorPainter(ImageVector image, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1413834416, "C(rememberVectorPainter)170@7429L7,172@7513L187:VectorPainter.kt#huu6hf");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1413834416, $changed, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:169)");
    L5:
        ProvidableCompositionLocal<Density> r0 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r3 = $composer.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer);
        Density density = (Density) r3;
        float val1$iv = image.getGenId$ui_release();
        float val2$iv = density.getDensity();
        long v1$iv = Float.floatToRawIntBits(val1$iv);
        long v2$iv = Float.floatToRawIntBits(val2$iv);
        long key = (v1$iv << 32) | (4294967295L & v2$iv);
        ComposerKt.sourceInformationMarkerStart($composer, -1837461227, "CC(remember):VectorPainter.kt#9igjgp");
        boolean invalid$iv = $composer.changed(key);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L8;
    L11:
        GroupComponent $this$rememberVectorPainter_u24lambda_u246_u24lambda_u245 = new GroupComponent();
        createGroupComponent($this$rememberVectorPainter_u24lambda_u246_u24lambda_u245, image.getRoot());
        Unit r10 = Unit.INSTANCE;
        Object value$iv = createVectorPainterFromImageVector(density, image, $this$rememberVectorPainter_u24lambda_u246_u24lambda_u245);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L12:
        VectorPainter r6 = (VectorPainter) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L15;
        ComposerKt.traceEventEnd();
    L15:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r6;
    L8:
        if (it$iv != Composer.Companion.getEmpty()) goto L12;
        goto L11
    }

    private static final void mirror(DrawScope $this$mirror, Function1<? super DrawScope, Unit> r17) {
        long pivot$iv = $this$mirror.mo4916getCenterF1C5BW0();
        DrawContext $this$withTransform_u24lambda_u246$iv$iv = $this$mirror.getDrawContext();
        long previousSize$iv$iv = $this$withTransform_u24lambda_u246$iv$iv.mo4838getSizeNHjbRc();
        $this$withTransform_u24lambda_u246$iv$iv.getCanvas().save();
        DrawTransform $this$scale_Fgt4K4Q_u24lambda_u242$iv = $this$withTransform_u24lambda_u246$iv$iv.getTransform();     // Catch: Throwable -> L10
        $this$scale_Fgt4K4Q_u24lambda_u242$iv.mo4845scale0AR0LA0(-1.0f, 1.0f, pivot$iv);     // Catch: Throwable -> L10
        r17.invoke($this$mirror);     // Catch: Throwable -> L8
        $this$withTransform_u24lambda_u246$iv$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv$iv.mo4839setSizeuvyYCjk(previousSize$iv$iv);
        return;
    L8:
        th = th;
    L12:
        $this$withTransform_u24lambda_u246$iv$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv$iv.mo4839setSizeuvyYCjk(previousSize$iv$iv);
        throw th;
    L10:
        th = th;
        goto L12
    }

    /* JADX INFO: renamed from: obtainSizePx-VpY3zN4, reason: not valid java name */
    private static final long m5077obtainSizePxVpY3zN4(Density $this$obtainSizePx_u2dVpY3zN4, float defaultWidth, float defaultHeight) {
        float width$iv = $this$obtainSizePx_u2dVpY3zN4.mo376toPx0680j_4(defaultWidth);
        float height$iv = $this$obtainSizePx_u2dVpY3zN4.mo376toPx0680j_4(defaultHeight);
        long v1$iv$iv = Float.floatToRawIntBits(width$iv);
        long v2$iv$iv = Float.floatToRawIntBits(height$iv);
        return Size.m4185constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    }

    /* JADX INFO: renamed from: obtainViewportSize-Pq9zytI, reason: not valid java name */
    private static final long m5078obtainViewportSizePq9zytI(long defaultSize, float viewportWidth, float viewportHeight) {
        if (Float.isNaN(viewportWidth) == false) goto L5;
        int bits$iv$iv$iv = (int) (defaultSize >> 32);
        float width$iv = Float.intBitsToFloat(bits$iv$iv$iv);
    L7:
        if (Float.isNaN(viewportHeight) == false) goto L9;
        int bits$iv$iv$iv2 = (int) (defaultSize & 4294967295L);
        float height$iv = Float.intBitsToFloat(bits$iv$iv$iv2);
    L10:
        long v1$iv$iv = Float.floatToRawIntBits(width$iv);
        long v2$iv$iv = Float.floatToRawIntBits(height$iv);
        return Size.m4185constructorimpl((v2$iv$iv & 4294967295L) | (v1$iv$iv << 32));
    L9:
        height$iv = viewportHeight;
        goto L10
    L5:
        width$iv = viewportWidth;
        goto L7
    }

    /* JADX INFO: renamed from: createColorFilter-xETnrds, reason: not valid java name */
    private static final ColorFilter m5076createColorFilterxETnrds(long tintColor, int tintBlendMode) {
        if (tintColor == 16) goto L5;
        boolean r3 = true;
    L6:
        if (r3 == true) goto L10;
        return null;
    L10:
        return ColorFilter.Companion.m4410tintxETnrds(tintColor, tintBlendMode);
    L5:
        r3 = false;
        goto L6
    }

    /* JADX INFO: renamed from: configureVectorPainter-T4PVSW8$default, reason: not valid java name */
    public static /* synthetic */ VectorPainter m5075configureVectorPainterT4PVSW8$default(VectorPainter r8, long r9, long r11, String r13, ColorFilter r14, boolean r15, int r16, Object r17) {
        if ((r16 & 4) == 0) goto L5;
        String r5 = RootGroupName;
    L7:
        if ((r16 & 16) == 0) goto L9;
        boolean r7 = false;
    L11:
        return m5074configureVectorPainterT4PVSW8(r8, r9, r11, r5, r14, r7);
    L9:
        r7 = r15;
        goto L11
    L5:
        r5 = r13;
        goto L7
    }

    /* JADX INFO: renamed from: configureVectorPainter-T4PVSW8, reason: not valid java name */
    public static final VectorPainter m5074configureVectorPainterT4PVSW8(VectorPainter $this$configureVectorPainter_u2dT4PVSW8, long defaultSize, long viewportSize, String name, ColorFilter intrinsicColorFilter, boolean autoMirror) {
        $this$configureVectorPainter_u2dT4PVSW8.m5072setSizeuvyYCjk$ui_release(defaultSize);
        $this$configureVectorPainter_u2dT4PVSW8.setAutoMirror$ui_release(autoMirror);
        $this$configureVectorPainter_u2dT4PVSW8.setIntrinsicColorFilter$ui_release(intrinsicColorFilter);
        $this$configureVectorPainter_u2dT4PVSW8.m5073setViewportSizeuvyYCjk$ui_release(viewportSize);
        $this$configureVectorPainter_u2dT4PVSW8.setName$ui_release(name);
        return $this$configureVectorPainter_u2dT4PVSW8;
    }

    public static final VectorPainter createVectorPainterFromImageVector(Density density, ImageVector imageVector, GroupComponent root) {
        long defaultSize = m5077obtainSizePxVpY3zN4(density, imageVector.m5048getDefaultWidthD9Ej5fM(), imageVector.m5047getDefaultHeightD9Ej5fM());
        long viewport = m5078obtainViewportSizePq9zytI(defaultSize, imageVector.getViewportWidth(), imageVector.getViewportHeight());
        return m5074configureVectorPainterT4PVSW8(new VectorPainter(root), defaultSize, viewport, imageVector.getName(), m5076createColorFilterxETnrds(imageVector.m5050getTintColor0d7_KjU(), imageVector.m5049getTintBlendMode0nO6VwU()), imageVector.getAutoMirror());
    }

    public static final GroupComponent createGroupComponent(GroupComponent $this$createGroupComponent, VectorGroup currentGroup) {
        int index = 0;
        int r1 = currentGroup.getSize();
    L3:
        if (index >= r1) goto L11;
        VectorNode vectorNode = currentGroup.get(index);
        if ((vectorNode instanceof VectorPath) == false) goto L8;
        PathComponent $this$createGroupComponent_u24lambda_u248 = new PathComponent();
        $this$createGroupComponent_u24lambda_u248.setPathData(((VectorPath) vectorNode).getPathData());
        $this$createGroupComponent_u24lambda_u248.m5058setPathFillTypeoQ8Xj4U(((VectorPath) vectorNode).m5081getPathFillTypeRgk1Os());
        $this$createGroupComponent_u24lambda_u248.setName(((VectorPath) vectorNode).getName());
        $this$createGroupComponent_u24lambda_u248.setFill(((VectorPath) vectorNode).getFill());
        $this$createGroupComponent_u24lambda_u248.setFillAlpha(((VectorPath) vectorNode).getFillAlpha());
        $this$createGroupComponent_u24lambda_u248.setStroke(((VectorPath) vectorNode).getStroke());
        $this$createGroupComponent_u24lambda_u248.setStrokeAlpha(((VectorPath) vectorNode).getStrokeAlpha());
        $this$createGroupComponent_u24lambda_u248.setStrokeLineWidth(((VectorPath) vectorNode).getStrokeLineWidth());
        $this$createGroupComponent_u24lambda_u248.m5059setStrokeLineCapBeK7IIE(((VectorPath) vectorNode).m5082getStrokeLineCapKaPHkGw());
        $this$createGroupComponent_u24lambda_u248.m5060setStrokeLineJoinWw9F2mQ(((VectorPath) vectorNode).m5083getStrokeLineJoinLxFBmk8());
        $this$createGroupComponent_u24lambda_u248.setStrokeLineMiter(((VectorPath) vectorNode).getStrokeLineMiter());
        $this$createGroupComponent_u24lambda_u248.setTrimPathStart(((VectorPath) vectorNode).getTrimPathStart());
        $this$createGroupComponent_u24lambda_u248.setTrimPathEnd(((VectorPath) vectorNode).getTrimPathEnd());
        $this$createGroupComponent_u24lambda_u248.setTrimPathOffset(((VectorPath) vectorNode).getTrimPathOffset());
        $this$createGroupComponent.insertAt(index, $this$createGroupComponent_u24lambda_u248);
    L10:
        index = index + 1;
        goto L3
    L8:
        if ((vectorNode instanceof VectorGroup) == false) goto L10;
        GroupComponent $this$createGroupComponent_u24lambda_u249 = new GroupComponent();
        $this$createGroupComponent_u24lambda_u249.setName(((VectorGroup) vectorNode).getName());
        $this$createGroupComponent_u24lambda_u249.setRotation(((VectorGroup) vectorNode).getRotation());
        $this$createGroupComponent_u24lambda_u249.setScaleX(((VectorGroup) vectorNode).getScaleX());
        $this$createGroupComponent_u24lambda_u249.setScaleY(((VectorGroup) vectorNode).getScaleY());
        $this$createGroupComponent_u24lambda_u249.setTranslationX(((VectorGroup) vectorNode).getTranslationX());
        $this$createGroupComponent_u24lambda_u249.setTranslationY(((VectorGroup) vectorNode).getTranslationY());
        $this$createGroupComponent_u24lambda_u249.setPivotX(((VectorGroup) vectorNode).getPivotX());
        $this$createGroupComponent_u24lambda_u249.setPivotY(((VectorGroup) vectorNode).getPivotY());
        $this$createGroupComponent_u24lambda_u249.setClipPathData(((VectorGroup) vectorNode).getClipPathData());
        createGroupComponent($this$createGroupComponent_u24lambda_u249, (VectorGroup) vectorNode);
        $this$createGroupComponent.insertAt(index, $this$createGroupComponent_u24lambda_u249);
        goto L10
    L11:
        return $this$createGroupComponent;
    }

    public static final void RenderVectorGroup(final VectorGroup group, Map<String, ? extends VectorConfig> r27, Composer $composer, final int $changed, final int r30) {
        Composer $composer2 = $composer.startRestartGroup(-446179233);
        ComposerKt.sourceInformation($composer2, "C(RenderVectorGroup)P(1):VectorPainter.kt#huu6hf");
        int $dirty = $changed;
        if ((r30 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r5 = r30 & 2;
        if (r5 == 0) goto L16;
        $dirty = $dirty | 48;
        final Map<String, ? extends VectorConfig> r6 = r27;
    L24:
        if (($dirty & 19) == 18) goto L26;
        boolean r7 = true;
    L28:
        if ($composer2.shouldExecute(r7, $dirty & 1) == false) goto L55;
        if (r5 == 0) goto L31;
        Map<String, ? extends VectorConfig> r8 = MapsKt.emptyMap();
    L33:
        if (ComposerKt.isTraceInProgress() == false) goto L35;
        ComposerKt.traceEventStart(-446179233, $dirty, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup (VectorPainter.kt:428)");
    L35:
        Iterator<VectorNode> r3 = group.iterator();
    L37:
        if (r3.hasNext() == false) goto L51;
        final VectorNode vectorNode = r3.next();
        if ((vectorNode instanceof VectorPath) == true) goto L40;
        Iterator<VectorNode> r28 = r3;
        int $dirty2 = $dirty;
        final Map<String, ? extends VectorConfig> r0 = r8;
        if ((vectorNode instanceof VectorGroup) == true) goto L46;
        $composer2.startReplaceGroup(-20884003);
        $composer2.endReplaceGroup();
        r3 = r28;
        r8 = r0;
        $dirty = $dirty2;
        goto L37
    L46:
        $composer2.startReplaceGroup(-21889209);
        ComposerKt.sourceInformation($composer2, "467@18739L88,455@17883L944");
        VectorConfig config = r0.get(((VectorGroup) vectorNode).getName());
        if (config != null) goto L49;
        config = new VectorPainterKt$RenderVectorGroup$config$2();
    L49:
        String r9 = ((VectorGroup) vectorNode).getName();
        float r10 = ((Number) config.getOrDefault(VectorProperty.Rotation.INSTANCE, Float.valueOf(((VectorGroup) vectorNode).getRotation()))).floatValue();
        float r11 = ((Number) config.getOrDefault(VectorProperty.ScaleX.INSTANCE, Float.valueOf(((VectorGroup) vectorNode).getScaleX()))).floatValue();
        float r12 = ((Number) config.getOrDefault(VectorProperty.ScaleY.INSTANCE, Float.valueOf(((VectorGroup) vectorNode).getScaleY()))).floatValue();
        float r13 = ((Number) config.getOrDefault(VectorProperty.TranslateX.INSTANCE, Float.valueOf(((VectorGroup) vectorNode).getTranslationX()))).floatValue();
        float r14 = ((Number) config.getOrDefault(VectorProperty.TranslateY.INSTANCE, Float.valueOf(((VectorGroup) vectorNode).getTranslationY()))).floatValue();
        VectorComposeKt.Group(r9, r10, ((Number) config.getOrDefault(VectorProperty.PivotX.INSTANCE, Float.valueOf(((VectorGroup) vectorNode).getPivotX()))).floatValue(), ((Number) config.getOrDefault(VectorProperty.PivotY.INSTANCE, Float.valueOf(((VectorGroup) vectorNode).getPivotY()))).floatValue(), r11, r12, r13, r14, (List) config.getOrDefault(VectorProperty.PathData.INSTANCE, ((VectorGroup) vectorNode).getClipPathData()), ComposableLambdaKt.rememberComposableLambda(1450046638, true, new AnonymousClass1(vectorNode, r0), $composer2, 54), $composer2, 805306368, 0);
        $composer2.endReplaceGroup();
        r3 = r28;
        r8 = r0;
        $dirty = $dirty2;
        goto L37
    L40:
        $composer2.startReplaceGroup(-23302778);
        ComposerKt.sourceInformation($composer2, "432@16447L1297");
        VectorConfig config2 = r8.get(((VectorPath) vectorNode).getName());
        if (config2 != null) goto L43;
        config2 = new VectorPainterKt$RenderVectorGroup$config$1();
    L43:
        Iterator<VectorNode> r29 = r3;
        int $dirty3 = $dirty;
        Composer $composer3 = $composer2;
        VectorComposeKt.m5064Path9cdaXJ4((List) config2.getOrDefault(VectorProperty.PathData.INSTANCE, ((VectorPath) vectorNode).getPathData()), ((VectorPath) vectorNode).m5081getPathFillTypeRgk1Os(), ((VectorPath) vectorNode).getName(), (Brush) config2.getOrDefault(VectorProperty.Fill.INSTANCE, ((VectorPath) vectorNode).getFill()), ((Number) config2.getOrDefault(VectorProperty.FillAlpha.INSTANCE, Float.valueOf(((VectorPath) vectorNode).getFillAlpha()))).floatValue(), (Brush) config2.getOrDefault(VectorProperty.Stroke.INSTANCE, ((VectorPath) vectorNode).getStroke()), ((Number) config2.getOrDefault(VectorProperty.StrokeAlpha.INSTANCE, Float.valueOf(((VectorPath) vectorNode).getStrokeAlpha()))).floatValue(), ((Number) config2.getOrDefault(VectorProperty.StrokeLineWidth.INSTANCE, Float.valueOf(((VectorPath) vectorNode).getStrokeLineWidth()))).floatValue(), ((VectorPath) vectorNode).m5082getStrokeLineCapKaPHkGw(), ((VectorPath) vectorNode).m5083getStrokeLineJoinLxFBmk8(), ((VectorPath) vectorNode).getStrokeLineMiter(), ((Number) config2.getOrDefault(VectorProperty.TrimPathStart.INSTANCE, Float.valueOf(((VectorPath) vectorNode).getTrimPathStart()))).floatValue(), ((Number) config2.getOrDefault(VectorProperty.TrimPathEnd.INSTANCE, Float.valueOf(((VectorPath) vectorNode).getTrimPathEnd()))).floatValue(), ((Number) config2.getOrDefault(VectorProperty.TrimPathOffset.INSTANCE, Float.valueOf(((VectorPath) vectorNode).getTrimPathOffset()))).floatValue(), $composer3, 0, 0, 0);
        $composer2 = $composer3;
        $composer2.endReplaceGroup();
        r3 = r29;
        r8 = r8;
        $dirty = $dirty3;
        goto L37
    L51:
        Map<String, ? extends VectorConfig> r17 = r8;
        if (ComposerKt.isTraceInProgress() == false) goto L54;
        ComposerKt.traceEventEnd();
    L54:
        r6 = r17;
    L56:
        ScopeUpdateScope r1 = $composer2.endRestartGroup();
        if (r1 == null) goto L60;
        r1.updateScope(new AnonymousClass2(group, r6, $changed, r30));
        return;
    L60:
        return;
    L31:
        r8 = r6;
        goto L33
    L55:
        $composer2.skipToGroupEnd();
        goto L56
    L26:
        r7 = false;
        goto L28
    L16:
        if (($changed & 48) != 0) goto L22;
        r6 = r27;
        if ($composer2.changedInstance(r6) == false) goto L20;
        int r15 = 32;
    L21:
        $dirty = $dirty | r15;
        goto L24
    L20:
        r15 = 16;
        goto L21
    L22:
        r6 = r27;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(group) == false) goto L10;
        int r16 = 4;
    L11:
        $dirty = $dirty | r16;
        goto L12
    L10:
        r16 = 2;
        goto L11
    }
}
