package androidx.compose.ui.graphics.vector;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: VectorCompose.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0085\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001a¦\u0001\u0010\u0014\u001a\u00020\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\u00052\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Group", "", HintConstants.AUTOFILL_HINT_NAME, "", "rotation", "", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "clipPathData", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/graphics/vector/VectorComposable;", "(Ljava/lang/String;FFFFFFFLjava/util/List;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Path", "pathData", "pathFillType", "Landroidx/compose/ui/graphics/PathFillType;", "fill", "Landroidx/compose/ui/graphics/Brush;", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "Path-9cdaXJ4", "(Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFLandroidx/compose/runtime/Composer;III)V", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class VectorComposeKt {
    public static final void Group(String name, float rotation, float pivotX, float pivotY, float scaleX, float scaleY, float translationX, float translationY, List<? extends PathNode> r29, final Function2<? super Composer, ? super Integer, Unit> r30, Composer $composer, final int $changed, final int r33) {
        Composer $composer2 = $composer.startRestartGroup(-213417674);
        ComposerKt.sourceInformation($composer2, "C(Group)P(2,5,3,4,6,7,8,9)58@2500L585:VectorCompose.kt#huu6hf");
        int $dirty = $changed;
        int r2 = r33 & 1;
        if (r2 == 0) goto L6;
        $dirty = $dirty | 6;
        String name2 = name;
    L13:
        int r4 = r33 & 2;
        if (r4 == 0) goto L17;
        $dirty = $dirty | 48;
        float rotation2 = rotation;
    L24:
        int r6 = r33 & 4;
        if (r6 == 0) goto L28;
        $dirty = $dirty | 384;
        float pivotX2 = pivotX;
    L35:
        int r8 = r33 & 8;
        if (r8 == 0) goto L39;
        $dirty = $dirty | 3072;
        float pivotY2 = pivotY;
    L46:
        int r14 = r33 & 16;
        if (r14 == 0) goto L50;
        $dirty = $dirty | 24576;
        float scaleX2 = scaleX;
    L57:
        int r16 = r33 & 32;
        if (r16 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L68:
        int r18 = r33 & 64;
        if (r18 == 0) goto L72;
        $dirty = $dirty | 1572864;
    L79:
        int r0 = r33 & 128;
        if (r0 == 0) goto L83;
        $dirty = $dirty | 12582912;
    L91:
        if (($changed & 100663296) != 0) goto L102;
        if ((r33 & 256) != 0) goto L98;
        if ($composer2.changedInstance(r29) == false) goto L98;
        int r20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r20;
    L98:
        r20 = 33554432;
    L102:
        if ((r33 & 512) == 0) goto L105;
        $dirty = $dirty | 805306368;
    L111:
        int $dirty2 = $dirty;
        if ((306783379 & $dirty) == 306783378) goto L114;
        boolean r1 = true;
    L116:
        if ($composer2.shouldExecute(r1, $dirty2 & 1) == false) goto L164;
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L120;
    L126:
        if (r2 == 0) goto L128;
        name2 = "";
    L128:
        if (r4 == 0) goto L130;
        rotation2 = 0.0f;
    L130:
        if (r6 == 0) goto L132;
        pivotX2 = 0.0f;
    L132:
        if (r8 == 0) goto L134;
        pivotY2 = 0.0f;
    L134:
        if (r14 == 0) goto L136;
        scaleX2 = 1.0f;
    L136:
        if (r16 == 0) goto L138;
        float scaleY2 = 1.0f;
    L139:
        if (r18 == 0) goto L141;
        float translationX2 = 0.0f;
    L142:
        if (r0 == 0) goto L144;
        float translationY2 = 0.0f;
    L146:
        if ((r33 & 256) == 0) goto L148;
        List<? extends PathNode> r7 = VectorKt.getEmptyPath();
        int $dirty3 = $dirty2 & (-234881025);
    L149:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L153;
        ComposerKt.traceEventStart(-213417674, $dirty3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:57)");
    L153:
        AnonymousClass1 r3 = AnonymousClass1.INSTANCE;
        int $dirty4 = $dirty3;
        float translationX3 = translationX2;
        ComposerKt.sourceInformationMarkerStart($composer2, -548224868, "CC(ComposeNode)P(1,2)317@12553L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof VectorApplier) == true) goto L156;
        ComposablesKt.invalidApplier();
    L156:
        $composer2.startNode();
        if ($composer2.getInserting() == false) goto L159;
        $composer2.createNode(r3);
    L160:
        Composer $this$Group_u24lambda_u240 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Group_u24lambda_u240, name2, VectorComposeKt$Group$2$1.INSTANCE);
        Updater.m3815setimpl($this$Group_u24lambda_u240, Float.valueOf(rotation2), VectorComposeKt$Group$2$2.INSTANCE);
        Updater.m3815setimpl($this$Group_u24lambda_u240, Float.valueOf(pivotX2), VectorComposeKt$Group$2$3.INSTANCE);
        Updater.m3815setimpl($this$Group_u24lambda_u240, Float.valueOf(pivotY2), VectorComposeKt$Group$2$4.INSTANCE);
        Updater.m3815setimpl($this$Group_u24lambda_u240, Float.valueOf(scaleX2), VectorComposeKt$Group$2$5.INSTANCE);
        Updater.m3815setimpl($this$Group_u24lambda_u240, Float.valueOf(scaleY2), VectorComposeKt$Group$2$6.INSTANCE);
        Updater.m3815setimpl($this$Group_u24lambda_u240, Float.valueOf(translationX3), VectorComposeKt$Group$2$7.INSTANCE);
        Updater.m3815setimpl($this$Group_u24lambda_u240, Float.valueOf(translationY2), VectorComposeKt$Group$2$8.INSTANCE);
        Updater.m3815setimpl($this$Group_u24lambda_u240, r7, VectorComposeKt$Group$2$9.INSTANCE);
        int r5 = (6 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, 541925533, "C72@3070L9:VectorCompose.kt#huu6hf");
        r30.invoke($composer2, Integer.valueOf(($dirty4 >> 27) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L163;
        ComposerKt.traceEventEnd();
    L163:
        final String name3 = name2;
        final float translationY3 = translationY2;
        final float pivotX3 = pivotX2;
        final float translationY4 = pivotY2;
        final float pivotX4 = translationX3;
        final List<? extends PathNode> r9 = r7;
        final float scaleY3 = scaleY2;
        final float rotation3 = rotation2;
        final float rotation4 = scaleX2;
    L165:
        ScopeUpdateScope r15 = $composer2.endRestartGroup();
        if (r15 == null) goto L169;
        r15.updateScope(new AnonymousClass4(name3, rotation3, pivotX3, translationY4, rotation4, scaleY3, pivotX4, translationY3, r9, r30, $changed, r33));
        return;
    L169:
        return;
    L159:
        $composer2.useNode();
        goto L160
    L148:
        r7 = r29;
        $dirty3 = $dirty2;
        goto L149
    L144:
        translationY2 = translationY;
        goto L146
    L141:
        translationX2 = translationX;
        goto L142
    L138:
        scaleY2 = scaleY;
        goto L139
    L120:
        if ($composer2.getDefaultsInvalid() == true) goto L126;
        $composer2.skipToGroupEnd();
        if ((r33 & 256) == 0) goto L125;
        translationX2 = translationX;
        translationY2 = translationY;
        r7 = r29;
        $dirty3 = $dirty2 & (-234881025);
        scaleY2 = scaleY;
        goto L149
    L125:
        scaleY2 = scaleY;
        translationX2 = translationX;
        translationY2 = translationY;
        r7 = r29;
        $dirty3 = $dirty2;
        goto L149
    L164:
        $composer2.skipToGroupEnd();
        scaleY3 = scaleY;
        translationY3 = translationY;
        name3 = name2;
        pivotX3 = pivotX2;
        translationY4 = pivotY2;
        pivotX4 = translationX;
        r9 = r29;
        rotation3 = rotation2;
        rotation4 = scaleX2;
        goto L165
    L114:
        r1 = false;
        goto L116
    L105:
        if (($changed & 805306368) != 0) goto L111;
        if ($composer2.changedInstance(r30) == false) goto L109;
        int r10 = 536870912;
    L110:
        $dirty = $dirty | r10;
        goto L111
    L109:
        r10 = 268435456;
        goto L110
    L83:
        if (($changed & 12582912) != 0) goto L91;
        if ($composer2.changed(translationY) == false) goto L87;
        int r21 = 8388608;
    L88:
        $dirty = $dirty | r21;
        goto L91
    L87:
        r21 = 4194304;
        goto L88
    L72:
        if (($changed & 1572864) != 0) goto L79;
        if ($composer2.changed(translationX) == false) goto L76;
        int r19 = 1048576;
    L77:
        $dirty = $dirty | r19;
        goto L79
    L76:
        r19 = 524288;
        goto L77
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L68;
        if ($composer2.changed(scaleY) == false) goto L65;
        int r110 = 131072;
    L66:
        $dirty = $dirty | r110;
        goto L68
    L65:
        r110 = 65536;
        goto L66
    L50:
        if (($changed & 24576) != 0) goto L56;
        scaleX2 = scaleX;
        if ($composer2.changed(scaleX2) == false) goto L54;
        int r17 = 16384;
    L55:
        $dirty = $dirty | r17;
        goto L57
    L54:
        r17 = 8192;
        goto L55
    L56:
        scaleX2 = scaleX;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L45;
        pivotY2 = pivotY;
        if ($composer2.changed(pivotY2) == false) goto L43;
        int r111 = 2048;
    L44:
        $dirty = $dirty | r111;
        goto L46
    L43:
        r111 = 1024;
        goto L44
    L45:
        pivotY2 = pivotY;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        pivotX2 = pivotX;
        if ($composer2.changed(pivotX2) == false) goto L32;
        int r11 = 256;
    L33:
        $dirty = $dirty | r11;
        goto L35
    L32:
        r11 = 128;
        goto L33
    L34:
        pivotX2 = pivotX;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        rotation2 = rotation;
        if ($composer2.changed(rotation2) == false) goto L21;
        int r12 = 32;
    L22:
        $dirty = $dirty | r12;
        goto L24
    L21:
        r12 = 16;
        goto L22
    L23:
        rotation2 = rotation;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        name2 = name;
        if ($composer2.changed(name2) == false) goto L10;
        int r13 = 4;
    L11:
        $dirty = $dirty | r13;
        goto L13
    L10:
        r13 = 2;
        goto L11
    L12:
        name2 = name;
        goto L13
    }

    /* JADX INFO: renamed from: Path-9cdaXJ4, reason: not valid java name */
    public static final void m5064Path9cdaXJ4(final List<? extends PathNode> r34, int pathFillType, String name, Brush fill, float fillAlpha, Brush stroke, float strokeAlpha, float strokeLineWidth, int strokeLineCap, int strokeLineJoin, float strokeLineMiter, float trimPathStart, float trimPathEnd, float trimPathOffset, Composer $composer, final int $changed, final int $changed1, final int r51) {
        Composer $composer2 = $composer.startRestartGroup(-1478270750);
        ComposerKt.sourceInformation($composer2, "C(Path)P(3,4:c#ui.graphics.PathFillType,2!4,10,7:c#ui.graphics.StrokeCap,8:c#ui.graphics.StrokeJoin!1,13)115@5072L876:VectorCompose.kt#huu6hf");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r51 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r7 = r51 & 2;
        if (r7 == 0) goto L16;
        $dirty = $dirty | 48;
        int r12 = pathFillType;
    L23:
        int r13 = r51 & 4;
        int r16 = 128;
        if (r13 == 0) goto L27;
        $dirty = $dirty | 384;
        String r8 = name;
    L34:
        int r17 = r51 & 8;
        int r18 = 2048;
        if (r17 == 0) goto L38;
        $dirty = $dirty | 3072;
        Brush r9 = fill;
    L45:
        int r21 = r51 & 16;
        if (r21 == 0) goto L49;
        $dirty = $dirty | 24576;
        float r10 = fillAlpha;
    L56:
        int r23 = r51 & 32;
        if (r23 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Brush r11 = stroke;
    L67:
        int r25 = r51 & 64;
        if (r25 == 0) goto L71;
        $dirty = $dirty | 1572864;
        float strokeAlpha2 = strokeAlpha;
    L78:
        int r3 = r51 & 128;
        if (r3 == 0) goto L82;
        $dirty = $dirty | 12582912;
    L89:
        int r4 = r51 & 256;
        if (r4 == 0) goto L93;
        $dirty = $dirty | 100663296;
    L100:
        int r5 = r51 & 512;
        if (r5 == 0) goto L104;
        $dirty = $dirty | 805306368;
    L111:
        int r6 = r51 & 1024;
        if (r6 == 0) goto L115;
        $dirty1 = $dirty1 | 6;
    L122:
        int r14 = r51 & 2048;
        if (r14 == 0) goto L126;
        $dirty1 = $dirty1 | 48;
    L133:
        int r15 = r51 & 4096;
        if (r15 == 0) goto L136;
        $dirty1 = $dirty1 | 384;
        int r22 = r15;
    L143:
        int r19 = r51 & 8192;
        if (r19 == 0) goto L147;
        $dirty1 = $dirty1 | 3072;
    L155:
        if (($dirty & 306783379) == 306783378) goto L157;
    L160:
        boolean r0 = true;
    L162:
        if ($composer2.shouldExecute(r0, $dirty & 1) == false) goto L216;
        if (r7 == 0) goto L165;
        int pathFillType2 = VectorKt.getDefaultFillType();
    L166:
        if (r13 == 0) goto L168;
        String name2 = "";
    L169:
        if (r17 == 0) goto L171;
        Brush fill2 = null;
    L172:
        if (r21 == 0) goto L174;
        float fillAlpha2 = 1.0f;
    L175:
        if (r23 == 0) goto L177;
        Brush stroke2 = null;
    L178:
        if (r25 == 0) goto L180;
        strokeAlpha2 = 1.0f;
    L180:
        if (r3 == 0) goto L182;
        float strokeLineWidth2 = 0.0f;
    L183:
        if (r4 == 0) goto L185;
        int strokeLineCap2 = VectorKt.getDefaultStrokeLineCap();
    L186:
        if (r5 == 0) goto L188;
        int strokeLineJoin2 = VectorKt.getDefaultStrokeLineJoin();
    L189:
        if (r6 == 0) goto L191;
        float strokeLineMiter2 = 4.0f;
    L192:
        if (r14 == 0) goto L194;
        float trimPathStart2 = 0.0f;
    L195:
        if (r22 == 0) goto L197;
        float trimPathEnd2 = 1.0f;
    L198:
        if (r19 == 0) goto L200;
        float trimPathOffset2 = 0.0f;
    L202:
        if (ComposerKt.isTraceInProgress() == false) goto L205;
        ComposerKt.traceEventStart(-1478270750, $dirty, $dirty1, "androidx.compose.ui.graphics.vector.Path (VectorCompose.kt:114)");
    L205:
        VectorComposeKt$Path$1 r1 = VectorComposeKt$Path$1.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, 1886828752, "CC(ComposeNode):Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof VectorApplier) == true) goto L208;
        ComposablesKt.invalidApplier();
    L208:
        $composer2.startNode();
        if ($composer2.getInserting() == false) goto L211;
        $composer2.createNode(r1);
    L212:
        Composer $this$Path_9cdaXJ4_u24lambda_u242 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Path_9cdaXJ4_u24lambda_u242, name2, VectorComposeKt$Path$2$1.INSTANCE);
        Updater.m3815setimpl($this$Path_9cdaXJ4_u24lambda_u242, r34, VectorComposeKt$Path$2$2.INSTANCE);
        Updater.m3815setimpl($this$Path_9cdaXJ4_u24lambda_u242, PathFillType.m4641boximpl(pathFillType2), VectorComposeKt$Path$2$3.INSTANCE);
        Updater.m3815setimpl($this$Path_9cdaXJ4_u24lambda_u242, fill2, VectorComposeKt$Path$2$4.INSTANCE);
        Updater.m3815setimpl($this$Path_9cdaXJ4_u24lambda_u242, Float.valueOf(fillAlpha2), VectorComposeKt$Path$2$5.INSTANCE);
        Updater.m3815setimpl($this$Path_9cdaXJ4_u24lambda_u242, stroke2, VectorComposeKt$Path$2$6.INSTANCE);
        Updater.m3815setimpl($this$Path_9cdaXJ4_u24lambda_u242, Float.valueOf(strokeAlpha2), VectorComposeKt$Path$2$7.INSTANCE);
        Updater.m3815setimpl($this$Path_9cdaXJ4_u24lambda_u242, Float.valueOf(strokeLineWidth2), VectorComposeKt$Path$2$8.INSTANCE);
        Updater.m3815setimpl($this$Path_9cdaXJ4_u24lambda_u242, StrokeJoin.m4722boximpl(strokeLineJoin2), VectorComposeKt$Path$2$9.INSTANCE);
        Updater.m3815setimpl($this$Path_9cdaXJ4_u24lambda_u242, StrokeCap.m4712boximpl(strokeLineCap2), VectorComposeKt$Path$2$10.INSTANCE);
        Updater.m3815setimpl($this$Path_9cdaXJ4_u24lambda_u242, Float.valueOf(strokeLineMiter2), VectorComposeKt$Path$2$11.INSTANCE);
        Updater.m3815setimpl($this$Path_9cdaXJ4_u24lambda_u242, Float.valueOf(trimPathStart2), VectorComposeKt$Path$2$12.INSTANCE);
        Updater.m3815setimpl($this$Path_9cdaXJ4_u24lambda_u242, Float.valueOf(trimPathEnd2), VectorComposeKt$Path$2$13.INSTANCE);
        Updater.m3815setimpl($this$Path_9cdaXJ4_u24lambda_u242, Float.valueOf(trimPathOffset2), VectorComposeKt$Path$2$14.INSTANCE);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L215;
        ComposerKt.traceEventEnd();
    L215:
        final String name3 = name2;
        final Brush fill3 = fill2;
        final float fillAlpha3 = fillAlpha2;
        final Brush stroke3 = stroke2;
        final float fillAlpha4 = strokeLineWidth2;
        final int strokeLineCap3 = strokeLineCap2;
        final int strokeLineJoin3 = strokeLineJoin2;
        final float strokeLineMiter3 = strokeLineMiter2;
        final float strokeAlpha3 = strokeAlpha2;
        final float trimPathStart3 = trimPathStart2;
        final float strokeLineMiter4 = trimPathEnd2;
        final int pathFillType3 = pathFillType2;
        final float strokeAlpha4 = trimPathOffset2;
    L217:
        ScopeUpdateScope r2 = $composer2.endRestartGroup();
        if (r2 == null) goto L221;
        r2.updateScope(new VectorComposeKt$Path$3(r34, pathFillType3, name3, fill3, fillAlpha3, stroke3, strokeAlpha3, fillAlpha4, strokeLineCap3, strokeLineJoin3, strokeLineMiter3, trimPathStart3, strokeLineMiter4, strokeAlpha4, $changed, $changed1, r51));
        return;
    L221:
        return;
    L211:
        $composer2.useNode();
        goto L212
    L200:
        trimPathOffset2 = trimPathOffset;
        goto L202
    L197:
        trimPathEnd2 = trimPathEnd;
        goto L198
    L194:
        trimPathStart2 = trimPathStart;
        goto L195
    L191:
        strokeLineMiter2 = strokeLineMiter;
        goto L192
    L188:
        strokeLineJoin2 = strokeLineJoin;
        goto L189
    L185:
        strokeLineCap2 = strokeLineCap;
        goto L186
    L182:
        strokeLineWidth2 = strokeLineWidth;
        goto L183
    L177:
        stroke2 = r11;
        goto L178
    L174:
        fillAlpha2 = r10;
        goto L175
    L171:
        fill2 = r9;
        goto L172
    L168:
        name2 = r8;
        goto L169
    L165:
        pathFillType2 = r12;
        goto L166
    L216:
        $composer2.skipToGroupEnd();
        strokeLineMiter4 = trimPathEnd;
        name3 = r8;
        fill3 = r9;
        fillAlpha3 = r10;
        stroke3 = r11;
        pathFillType3 = r12;
        strokeAlpha3 = strokeAlpha2;
        fillAlpha4 = strokeLineWidth;
        strokeLineCap3 = strokeLineCap;
        strokeLineJoin3 = strokeLineJoin;
        strokeLineMiter3 = strokeLineMiter;
        trimPathStart3 = trimPathStart;
        strokeAlpha4 = trimPathOffset;
        goto L217
    L157:
        if (($dirty1 & 1171) != 1170) goto L160;
        r0 = false;
        goto L162
    L147:
        if (($changed1 & 3072) != 0) goto L155;
        if ($composer2.changed(trimPathOffset) == true) goto L152;
        r18 = 1024;
    L152:
        $dirty1 = $dirty1 | r18;
        goto L155
    L136:
        r22 = r15;
        if (($changed1 & 384) != 0) goto L143;
        if ($composer2.changed(trimPathEnd) == false) goto L141;
        r16 = 256;
    L141:
        $dirty1 = $dirty1 | r16;
        goto L143
    L126:
        if (($changed1 & 48) != 0) goto L133;
        if ($composer2.changed(trimPathStart) == false) goto L130;
        int r24 = 32;
    L131:
        $dirty1 = $dirty1 | r24;
        goto L133
    L130:
        r24 = 16;
        goto L131
    L115:
        if (($changed1 & 6) != 0) goto L122;
        if ($composer2.changed(strokeLineMiter) == false) goto L119;
        int r20 = 4;
    L120:
        $dirty1 = $dirty1 | r20;
        goto L122
    L119:
        r20 = 2;
        goto L120
    L104:
        if (($changed & 805306368) != 0) goto L111;
        if ($composer2.changed(strokeLineJoin) == false) goto L108;
        int r31 = 536870912;
    L109:
        $dirty = $dirty | r31;
        goto L111
    L108:
        r31 = 268435456;
        goto L109
    L93:
        if (($changed & 100663296) != 0) goto L100;
        if ($composer2.changed(strokeLineCap) == false) goto L97;
        int r30 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L98:
        $dirty = $dirty | r30;
        goto L100
    L97:
        r30 = 33554432;
        goto L98
    L82:
        if (($changed & 12582912) != 0) goto L89;
        if ($composer2.changed(strokeLineWidth) == false) goto L86;
        int r29 = 8388608;
    L87:
        $dirty = $dirty | r29;
        goto L89
    L86:
        r29 = 4194304;
        goto L87
    L71:
        if (($changed & 1572864) != 0) goto L77;
        strokeAlpha2 = strokeAlpha;
        if ($composer2.changed(strokeAlpha2) == false) goto L75;
        int r27 = 1048576;
    L76:
        $dirty = $dirty | r27;
        goto L78
    L75:
        r27 = 524288;
        goto L76
    L77:
        strokeAlpha2 = strokeAlpha;
        goto L78
    L60:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L66;
        r11 = stroke;
        if ($composer2.changed(r11) == false) goto L64;
        int r26 = 131072;
    L65:
        $dirty = $dirty | r26;
        goto L67
    L64:
        r26 = 65536;
        goto L65
    L66:
        r11 = stroke;
        goto L67
    L49:
        if (($changed & 24576) != 0) goto L55;
        r10 = fillAlpha;
        if ($composer2.changed(r10) == false) goto L53;
        int r28 = 16384;
    L54:
        $dirty = $dirty | r28;
        goto L56
    L53:
        r28 = 8192;
        goto L54
    L55:
        r10 = fillAlpha;
        goto L56
    L38:
        if (($changed & 3072) != 0) goto L44;
        r9 = fill;
        if ($composer2.changed(r9) == false) goto L42;
        int r210 = 2048;
    L43:
        $dirty = $dirty | r210;
        goto L45
    L42:
        r210 = 1024;
        goto L43
    L44:
        r9 = fill;
        goto L45
    L27:
        if (($changed & 384) != 0) goto L33;
        r8 = name;
        if ($composer2.changed(r8) == false) goto L31;
        int r110 = 256;
    L32:
        $dirty = $dirty | r110;
        goto L34
    L31:
        r110 = 128;
        goto L32
    L33:
        r8 = name;
        goto L34
    L16:
        if (($changed & 48) != 0) goto L22;
        r12 = pathFillType;
        if ($composer2.changed(r12) == false) goto L20;
        int r111 = 32;
    L21:
        $dirty = $dirty | r111;
        goto L23
    L20:
        r111 = 16;
        goto L21
    L22:
        r12 = pathFillType;
        goto L23
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changedInstance(r34) == false) goto L10;
        int r32 = 4;
    L11:
        $dirty = $dirty | r32;
        goto L12
    L10:
        r32 = 2;
        goto L11
    }
}
