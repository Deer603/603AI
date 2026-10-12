package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: ModalBottomSheet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÄ\u0001\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00132\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\u00182\u0013\b\u0002\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u001a0\n¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\b0\u001e¢\u0006\u0002\b\u0018¢\u0006\u0002\b H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a0\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u00132\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010%\u001a\u00020&H\u0003ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a-\u0010)\u001a\u00020\u000e2\b\b\u0002\u0010*\u001a\u00020&2\u0014\b\u0002\u0010+\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020&0\u001eH\u0007¢\u0006\u0002\u0010-\u001aó\u0001\u0010.\u001a\u00020\b*\u00020/2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000203012\u0006\u00104\u001a\u0002052\f\u00106\u001a\b\u0012\u0004\u0012\u00020\b0\n2!\u00107\u001a\u001d\u0012\u0013\u0012\u001102¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020\b0\u001e2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00042\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\u00182\u0013\b\u0002\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u001a0\n¢\u0006\u0002\b\u00182\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\b0\u001e¢\u0006\u0002\b\u0018¢\u0006\u0002\b H\u0001ø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a\u0014\u0010=\u001a\u000202*\u00020>2\u0006\u0010?\u001a\u000202H\u0002\u001a\u0014\u0010@\u001a\u000202*\u00020>2\u0006\u0010?\u001a\u000202H\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006A²\u0006\n\u0010B\u001a\u000202X\u008a\u0084\u0002"}, d2 = {"PredictiveBackChildTransformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "J", "PredictiveBackMaxScaleXDistance", "Landroidx/compose/ui/unit/Dp;", "F", "PredictiveBackMaxScaleYDistance", "ModalBottomSheet", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "sheetState", "Landroidx/compose/material3/SheetState;", "sheetMaxWidth", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "tonalElevation", "scrimColor", "dragHandle", "Landroidx/compose/runtime/Composable;", "contentWindowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "properties", "Landroidx/compose/material3/ModalBottomSheetProperties;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "ModalBottomSheet-dYc4hso", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFJLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/ModalBottomSheetProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Scrim", "color", "visible", "", "Scrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "rememberModalBottomSheetState", "skipPartiallyExpanded", "confirmValueChange", "Landroidx/compose/material3/SheetValue;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", "ModalBottomSheetContent", "Landroidx/compose/foundation/layout/BoxScope;", "predictiveBackProgress", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "animateToDismiss", "settleToDismiss", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "velocity", "ModalBottomSheetContent-IQkwcL4", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/animation/core/Animatable;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "calculatePredictiveBackScaleX", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", NotificationCompat.CATEGORY_PROGRESS, "calculatePredictiveBackScaleY", "material3_release", "alpha"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ModalBottomSheetKt {
    private static final long PredictiveBackChildTransformOrigin = 0;
    private static final float PredictiveBackMaxScaleXDistance = 0.0f;
    private static final float PredictiveBackMaxScaleYDistance = 0.0f;

    /* JADX INFO: renamed from: access$Scrim-3J-VO9M, reason: not valid java name */
    public static final /* synthetic */ void m2372access$Scrim3JVO9M(long color, Function0 onDismissRequest, boolean visible, Composer $composer, int $changed) {
        m2371Scrim3JVO9M(color, onDismissRequest, visible, $composer, $changed);
    }

    public static final /* synthetic */ float access$Scrim_3J_VO9M$lambda$10(State $alpha$delegate) {
        return Scrim_3J_VO9M$lambda$10($alpha$delegate);
    }

    public static final /* synthetic */ float access$calculatePredictiveBackScaleX(GraphicsLayerScope $receiver, float progress) {
        return calculatePredictiveBackScaleX($receiver, progress);
    }

    public static final /* synthetic */ float access$calculatePredictiveBackScaleY(GraphicsLayerScope $receiver, float progress) {
        return calculatePredictiveBackScaleY($receiver, progress);
    }

    public static final /* synthetic */ long access$getPredictiveBackChildTransformOrigin$p() {
        return PredictiveBackChildTransformOrigin;
    }

    /* JADX INFO: renamed from: ModalBottomSheet-dYc4hso, reason: not valid java name */
    public static final void m2369ModalBottomSheetdYc4hso(final Function0<Unit> r47, Modifier modifier, SheetState sheetState, float sheetMaxWidth, Shape shape, long containerColor, long contentColor, float tonalElevation, long scrimColor, Function2<? super Composer, ? super Integer, Unit> r59, Function2<? super Composer, ? super Integer, ? extends WindowInsets> r60, ModalBottomSheetProperties properties, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r62, Composer $composer, final int $changed, final int $changed1, final int r66) {
        Composer $composer2 = $composer.startRestartGroup(2132719801);
        ComposerKt.sourceInformation($composer2, "C(ModalBottomSheet)P(6,5,11,10:c#ui.unit.Dp,9,0:c#ui.graphics.Color,2:c#ui.graphics.Color,12:c#ui.unit.Dp,8:c#ui.graphics.Color,4,3,7)121@6012L31,123@6143L13,124@6206L14,125@6248L31,127@6356L10,133@6697L24,134@6761L327,145@7142L149,151@7326L42,155@7458L708,167@8231L771,153@7374L1628,193@9077L21,193@9050L48:ModalBottomSheet.kt#uh7d8r");
        int $dirty = $changed;
        if ((r66 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r8 = r66 & 2;
        if (r8 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        if (($changed & 384) == 0) goto L26;
        final SheetState sheetState2 = sheetState;
    L34:
        int r16 = r66 & 8;
        if (r16 == 0) goto L38;
        $dirty = $dirty | 3072;
    L46:
        if (($changed & 24576) == 0) goto L48;
        Shape shape2 = shape;
    L57:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) goto L59;
        long containerColor2 = containerColor;
    L68:
        if (($changed & 1572864) == 0) goto L70;
        long r11 = contentColor;
    L78:
        int $dirty1 = r66 & 128;
        if ($dirty1 == 0) goto L82;
        $dirty = $dirty | 12582912;
    L90:
        if (($changed & 100663296) == 0) goto L92;
        int $dirty2 = $dirty;
        int $dirty3 = $changed1;
    L100:
        int $dirty4 = $dirty3;
        int $dirty5 = r66 & 512;
        if ($dirty5 == 0) goto L104;
        $dirty2 = $dirty2 | 805306368;
    L111:
        int $dirty6 = $dirty2;
        if (($changed1 & 6) != 0) goto L122;
        if ((r66 & 1024) != 0) goto L119;
        if ($composer2.changedInstance(r60) == false) goto L119;
        int r26 = 4;
    L120:
        $dirty4 = $dirty4 | r26;
    L119:
        r26 = 2;
    L122:
        int $dirty7 = r66 & 2048;
        if ($dirty7 == 0) goto L126;
        $dirty4 = $dirty4 | 48;
    L133:
        int $dirty8 = $dirty4;
        if ((r66 & 4096) == 0) goto L137;
        $dirty8 = $dirty8 | 384;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r6 = r62;
    L145:
        if ((306783379 & $dirty6) == 306783378) goto L147;
    L152:
        $composer2.startDefaults();
        boolean r7 = false;
        if (($changed & 1) != 0) goto L155;
    L176:
        if (r8 == 0) goto L179;
        modifier2 = Modifier.Companion;
    L179:
        if ((r66 & 4) == 0) goto L181;
        $dirty6 = $dirty6 & (-897);
        sheetState2 = rememberModalBottomSheetState(false, null, $composer2, 0, 3);
    L181:
        if (r16 == 0) goto L183;
        float sheetMaxWidth2 = BottomSheetDefaults.INSTANCE.m1920getSheetMaxWidthD9Ej5fM();
    L185:
        if ((r66 & 16) == 0) goto L189;
        $dirty6 = $dirty6 & (-57345);
        shape2 = BottomSheetDefaults.INSTANCE.getExpandedShape($composer2, 6);
    L189:
        if ((r66 & 32) == 0) goto L192;
        containerColor2 = BottomSheetDefaults.INSTANCE.getContainerColor($composer2, 6);
        $dirty6 = $dirty6 & (-458753);
    L192:
        if ((r66 & 64) == 0) goto L194;
        long contentColor2 = ColorSchemeKt.m2057contentColorForek8zF_U(containerColor2, $composer2, ($dirty6 >> 15) & 14);
        $dirty6 = $dirty6 & (-3670017);
    L195:
        if ($dirty1 == 0) goto L197;
        float tonalElevation2 = Dp.m6973constructorimpl(0);
    L199:
        if ((r66 & 256) == 0) goto L201;
        long scrimColor2 = BottomSheetDefaults.INSTANCE.getScrimColor($composer2, 6);
        int $dirty9 = $dirty6 & (-234881025);
    L202:
        if ($dirty5 == 0) goto L204;
        Function2<? super Composer, ? super Integer, Unit> r12 = ComposableSingletons$ModalBottomSheetKt.INSTANCE.m2097getLambda1$material3_release();
    L205:
        float tonalElevation3 = tonalElevation2;
        if ((r66 & 1024) == 0) goto L208;
        ModalBottomSheetKt$ModalBottomSheet$1 r0 = ModalBottomSheetKt$ModalBottomSheet$1.INSTANCE;
        $dirty8 = $dirty8 & (-15);
    L209:
        if ($dirty7 == 0) goto L211;
        ModalBottomSheetProperties properties2 = ModalBottomSheetDefaults.INSTANCE.getProperties();
        final float tonalElevation4 = tonalElevation3;
        final Function2<? super Composer, ? super Integer, ? extends WindowInsets> r44 = r0;
        final float sheetMaxWidth3 = sheetMaxWidth2;
        final long contentColor3 = contentColor2;
        final long containerColor3 = containerColor2;
        $dirty6 = $dirty9;
        final Function2<? super Composer, ? super Integer, Unit> r43 = r12;
        final Modifier modifier3 = modifier2;
        final Shape shape3 = shape2;
        final long scrimColor3 = scrimColor2;
    L212:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L215;
        ComposerKt.traceEventStart(2132719801, $dirty6, $dirty8, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:132)");
    L215:
        ComposerKt.sourceInformationMarkerStart($composer2, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart($composer2, -954363344, "CC(remember):Effects.kt#9igjgp");
        Object it$iv$iv = $composer2.rememberedValue();
        if (it$iv$iv != Composer.Companion.getEmpty()) goto L218;
        Object value$iv$iv = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer2));
        $composer2.updateRememberedValue(value$iv$iv);
    L219:
        CompositionScopedCoroutineScopeCanceller wrapper$iv = (CompositionScopedCoroutineScopeCanceller) value$iv$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final CoroutineScope scope = wrapper$iv.getCoroutineScope();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -2011393839, "CC(remember):ModalBottomSheet.kt#9igjgp");
        if ((($dirty6 & 896) ^ 384) <= 256) goto L224;
        if ($composer2.changed(sheetState2) == false) goto L224;
    L225:
        boolean r3 = true;
    L227:
        boolean r4 = r3 | $composer2.changedInstance(scope);
        if (($dirty6 & 14) != 4) goto L230;
        boolean r9 = true;
    L231:
        boolean invalid$iv = r4 | r9;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L234;
    L237:
        Object value$iv = (Function0) new ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1(sheetState2, scope, r47);
        $composer2.updateRememberedValue(value$iv);
    L238:
        final Function0 animateToDismiss = (Function0) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -2011381825, "CC(remember):ModalBottomSheet.kt#9igjgp");
        boolean r5 = $composer2.changedInstance(scope);
        if ((($dirty6 & 896) ^ 384) <= 256) goto L243;
        if ($composer2.changed(sheetState2) == false) goto L243;
    L244:
        boolean r10 = true;
    L246:
        boolean r13 = r5 | r10;
        if (($dirty6 & 14) != 4) goto L249;
        boolean r14 = true;
    L250:
        boolean invalid$iv2 = r13 | r14;
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv2 == false) goto L253;
    L256:
        Object value$iv2 = (Function1) new ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1(scope, sheetState2, r47);
        $composer2.updateRememberedValue(value$iv2);
    L257:
        final Function1 settleToDismiss = (Function1) value$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -2011376044, "CC(remember):ModalBottomSheet.kt#9igjgp");
        Object it$iv3 = $composer2.rememberedValue();
        if (it$iv3 != Composer.Companion.getEmpty()) goto L260;
        Object value$iv3 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        $composer2.updateRememberedValue(value$iv3);
    L261:
        final Animatable predictiveBackProgress = (Animatable) value$iv3;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -2011371154, "CC(remember):ModalBottomSheet.kt#9igjgp");
        if ((($dirty6 & 896) ^ 384) <= 256) goto L266;
        if ($composer2.changed(sheetState2) == false) goto L266;
    L267:
        boolean r15 = true;
    L269:
        boolean r17 = (r15 | $composer2.changedInstance(scope)) | $composer2.changedInstance(predictiveBackProgress);
        if (($dirty6 & 14) != 4) goto L272;
        boolean r18 = true;
    L273:
        boolean invalid$iv3 = r17 | r18;
        Object it$iv4 = $composer2.rememberedValue();
        if (invalid$iv3 == false) goto L276;
    L279:
        Object value$iv4 = (Function0) new ModalBottomSheetKt$ModalBottomSheet$2$1(sheetState2, scope, predictiveBackProgress, r47);
        $composer2.updateRememberedValue(value$iv4);
    L280:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r45 = r6;
        final SheetState sheetState3 = sheetState2;
        ModalBottomSheet_androidKt.ModalBottomSheetDialog((Function0) value$iv4, properties2, predictiveBackProgress, ComposableLambdaKt.rememberComposableLambda(-314673510, true, new ModalBottomSheetKt$ModalBottomSheet$3(scrimColor3, animateToDismiss, sheetState3, predictiveBackProgress, scope, settleToDismiss, modifier3, sheetMaxWidth3, shape3, containerColor3, contentColor3, tonalElevation4, r43, r44, r45), $composer2, 54), $composer2, (($dirty8 & 112) | 3072) | (Animatable.$stable << 6));
        Composer $composer3 = $composer2;
        if (sheetState2.getHasExpandedState() == false) goto L299;
        ComposerKt.sourceInformationMarkerStart($composer3, -2011320033, "CC(remember):ModalBottomSheet.kt#9igjgp");
        if ((($dirty6 & 896) ^ 384) <= 256) goto L287;
        if ($composer3.changed(sheetState2) == false) goto L287;
    L288:
        boolean invalid$iv4 = true;
    L290:
        Object it$iv5 = $composer3.rememberedValue();
        if (invalid$iv4 == false) goto L293;
    L296:
        ModalBottomSheetKt$ModalBottomSheet$4$1 value$iv5 = new ModalBottomSheetKt$ModalBottomSheet$4$1(sheetState2, null);
        $composer3.updateRememberedValue(value$iv5);
    L297:
        ComposerKt.sourceInformationMarkerEnd($composer3);
        EffectsKt.LaunchedEffect(sheetState2, (Function2) value$iv5, $composer3, ($dirty6 >> 6) & 14);
        goto L299
    L293:
        if (it$iv5 == Composer.Companion.getEmpty()) goto L296;
        value$iv5 = it$iv5;
    L287:
        if (($dirty6 & 384) == 256) goto L288;
        invalid$iv4 = r7;
    L299:
        if (ComposerKt.isTraceInProgress() == false) goto L301;
        ComposerKt.traceEventEnd();
    L301:
        final SheetState sheetState4 = sheetState2;
        final ModalBottomSheetProperties properties3 = properties2;
        final long scrimColor4 = scrimColor3;
        modifier2 = modifier3;
        final float sheetMaxWidth4 = sheetMaxWidth3;
        final Shape shape4 = shape3;
        final long containerColor4 = containerColor3;
        final long contentColor4 = contentColor3;
        final float tonalElevation5 = tonalElevation4;
        final Function2<? super Composer, ? super Integer, ? extends WindowInsets> r19 = r44;
    L302:
        ScopeUpdateScope r1 = $composer3.endRestartGroup();
        if (r1 == null) goto L306;
        final Modifier modifier4 = modifier2;
        final Function2<? super Composer, ? super Integer, Unit> r110 = r43;
        r1.updateScope(new ModalBottomSheetKt$ModalBottomSheet$5(r47, modifier4, sheetState4, sheetMaxWidth4, shape4, containerColor4, contentColor4, tonalElevation5, scrimColor4, r110, r19, properties3, r62, $changed, $changed1, r66));
        return;
    L306:
        return;
    L276:
        if (it$iv4 == Composer.Companion.getEmpty()) goto L279;
        value$iv4 = it$iv4;
        goto L280
    L272:
        r18 = r7;
    L266:
        if (($dirty6 & 384) == 256) goto L267;
        r15 = r7;
        goto L269
    L260:
        value$iv3 = it$iv3;
        goto L261
    L253:
        if (it$iv2 == Composer.Companion.getEmpty()) goto L256;
        value$iv2 = it$iv2;
        goto L257
    L249:
        r14 = r7;
    L243:
        if (($dirty6 & 384) == 256) goto L244;
        r10 = r7;
        goto L246
    L234:
        if (it$iv == Composer.Companion.getEmpty()) goto L237;
        value$iv = it$iv;
        goto L238
    L230:
        r9 = r7;
    L224:
        if (($dirty6 & 384) == 256) goto L225;
        r3 = r7;
        goto L227
    L218:
        value$iv$iv = it$iv$iv;
        goto L219
    L211:
        tonalElevation4 = tonalElevation3;
        properties2 = properties;
        r44 = r0;
        sheetMaxWidth3 = sheetMaxWidth2;
        contentColor3 = contentColor2;
        containerColor3 = containerColor2;
        $dirty6 = $dirty9;
        r43 = r12;
        modifier3 = modifier2;
        shape3 = shape2;
        scrimColor3 = scrimColor2;
        goto L212
    L208:
        r0 = r60;
        goto L209
    L204:
        r12 = r59;
        goto L205
    L201:
        $dirty9 = $dirty6;
        scrimColor2 = scrimColor;
        goto L202
    L197:
        tonalElevation2 = tonalElevation;
        goto L199
    L194:
        contentColor2 = r11;
        goto L195
    L183:
        sheetMaxWidth2 = sheetMaxWidth;
        goto L185
    L155:
        if ($composer2.getDefaultsInvalid() == true) goto L176;
        $composer2.skipToGroupEnd();
        if ((r66 & 4) == 0) goto L161;
        $dirty6 = $dirty6 & (-897);
    L161:
        if ((r66 & 16) == 0) goto L164;
        $dirty6 = $dirty6 & (-57345);
    L164:
        if ((r66 & 32) == 0) goto L167;
        $dirty6 = $dirty6 & (-458753);
    L167:
        if ((r66 & 64) == 0) goto L170;
        $dirty6 = $dirty6 & (-3670017);
    L170:
        if ((r66 & 256) == 0) goto L173;
        $dirty6 = $dirty6 & (-234881025);
    L173:
        if ((r66 & 1024) == 0) goto L175;
        $dirty8 = $dirty8 & (-15);
    L175:
        sheetMaxWidth3 = sheetMaxWidth;
        tonalElevation4 = tonalElevation;
        scrimColor3 = scrimColor;
        r43 = r59;
        r44 = r60;
        properties2 = properties;
        r7 = false;
        containerColor3 = containerColor2;
        contentColor3 = r11;
        modifier3 = modifier2;
        shape3 = shape2;
        goto L212
    L147:
        if (($dirty8 & 147) != 146) goto L152;
        if ($composer2.getSkipping() == false) goto L152;
        $composer2.skipToGroupEnd();
        r43 = r59;
        $composer3 = $composer2;
        containerColor4 = containerColor2;
        contentColor4 = r11;
        sheetState4 = sheetState2;
        shape4 = shape2;
        sheetMaxWidth4 = sheetMaxWidth;
        tonalElevation5 = tonalElevation;
        scrimColor4 = scrimColor;
        r19 = r60;
        properties3 = properties;
        goto L302
    L137:
        if (($changed1 & 384) != 0) goto L143;
        r6 = r62;
        if ($composer2.changedInstance(r6) == false) goto L141;
        int r111 = 256;
    L142:
        $dirty8 = $dirty8 | r111;
        goto L145
    L141:
        r111 = 128;
        goto L142
    L143:
        r6 = r62;
        goto L145
    L126:
        if (($changed1 & 48) != 0) goto L133;
        if ($composer2.changed(properties) == false) goto L130;
        int r112 = 32;
    L131:
        $dirty4 = $dirty4 | r112;
        goto L133
    L130:
        r112 = 16;
        goto L131
    L104:
        if (($changed & 805306368) != 0) goto L111;
        if ($composer2.changedInstance(r59) == false) goto L108;
        int r27 = 536870912;
    L109:
        $dirty2 = $dirty2 | r27;
        goto L111
    L108:
        r27 = 268435456;
        goto L109
    L92:
        if ((r66 & 256) != 0) goto L96;
        int $dirty10 = $dirty;
        $dirty3 = $changed1;
        if ($composer2.changed(scrimColor) == false) goto L97;
        int r24 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L98:
        $dirty2 = $dirty10 | r24;
    L97:
        r24 = 33554432;
        goto L98
    L96:
        $dirty10 = $dirty;
        $dirty3 = $changed1;
        goto L97
    L82:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changed(tonalElevation) == false) goto L86;
        int r23 = 8388608;
    L87:
        $dirty = $dirty | r23;
        goto L90
    L86:
        r23 = 4194304;
        goto L87
    L70:
        if ((r66 & 64) != 0) goto L74;
        r11 = contentColor;
        if ($composer2.changed(r11) == false) goto L75;
        int r22 = 1048576;
    L76:
        $dirty = $dirty | r22;
    L75:
        r22 = 524288;
        goto L76
    L74:
        r11 = contentColor;
        goto L75
    L59:
        if ((r66 & 32) != 0) goto L63;
        containerColor2 = containerColor;
        if ($composer2.changed(containerColor2) == false) goto L64;
        int r21 = 131072;
    L65:
        $dirty = $dirty | r21;
    L64:
        r21 = 65536;
        goto L65
    L63:
        containerColor2 = containerColor;
        goto L64
    L48:
        if ((r66 & 16) != 0) goto L52;
        shape2 = shape;
        if ($composer2.changed(shape2) == false) goto L53;
        int r113 = 16384;
    L54:
        $dirty = $dirty | r113;
    L53:
        r113 = 8192;
        goto L54
    L52:
        shape2 = shape;
        goto L53
    L38:
        if (($changed & 3072) != 0) goto L46;
        if ($composer2.changed(sheetMaxWidth) == false) goto L42;
        int r114 = 2048;
    L43:
        $dirty = $dirty | r114;
        goto L46
    L42:
        r114 = 1024;
        goto L43
    L26:
        if ((r66 & 4) != 0) goto L30;
        sheetState2 = sheetState;
        if ($composer2.changed(sheetState2) == false) goto L31;
        int r115 = 256;
    L32:
        $dirty = $dirty | r115;
    L31:
        r115 = 128;
        goto L32
    L30:
        sheetState2 = sheetState;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L22;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L20;
        int r116 = 32;
    L21:
        $dirty = $dirty | r116;
        goto L24
    L20:
        r116 = 16;
        goto L21
    L22:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changedInstance(r47) == false) goto L10;
        int r20 = 4;
    L11:
        $dirty = $dirty | r20;
        goto L12
    L10:
        r20 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: ModalBottomSheetContent-IQkwcL4, reason: not valid java name */
    public static final void m2370ModalBottomSheetContentIQkwcL4(final BoxScope $this$ModalBottomSheetContent_u2dIQkwcL4, final Animatable<Float, AnimationVector1D> r41, final CoroutineScope scope, final Function0<Unit> r43, final Function1<? super Float, Unit> r44, Modifier modifier, SheetState sheetState, float sheetMaxWidth, Shape shape, long containerColor, long contentColor, float tonalElevation, Function2<? super Composer, ? super Integer, Unit> r54, Function2<? super Composer, ? super Integer, ? extends WindowInsets> r55, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r56, Composer $composer, final int $changed, final int $changed1, final int r60) {
        Composer $composer2 = $composer.startRestartGroup(-1676960531);
        ComposerKt.sourceInformation($composer2, "C(ModalBottomSheetContent)P(7,8!1,9,6,12,11:c#ui.unit.Dp,10,1:c#ui.graphics.Color,3:c#ui.graphics.Color,13:c#ui.unit.Dp,5,4)205@9432L31,207@9563L13,208@9626L14,209@9668L31,215@10018L48,224@10294L324,232@10728L1476,267@12552L23,269@12621L112,273@12765L612,288@13518L2623,217@10072L6069:ModalBottomSheet.kt#uh7d8r");
        int $dirty = $changed;
        if ((Integer.MIN_VALUE & r60) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r60 & 1) == 0) goto L16;
        $dirty = $dirty | 48;
    L26:
        if ((r60 & 2) == 0) goto L29;
        $dirty = $dirty | 384;
    L36:
        int r17 = 2048;
        if ((r60 & 4) == 0) goto L40;
        $dirty = $dirty | 3072;
    L47:
        int r20 = 8192;
        if ((r60 & 8) == 0) goto L51;
        $dirty = $dirty | 24576;
    L57:
        int r14 = r60 & 16;
        if (r14 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Modifier modifier2 = modifier;
    L69:
        if (($changed & 1572864) == 0) goto L71;
        final SheetState sheetState2 = sheetState;
    L79:
        int r24 = r60 & 64;
        if (r24 == 0) goto L83;
        $dirty = $dirty | 12582912;
        float sheetMaxWidth2 = sheetMaxWidth;
    L91:
        if (($changed & 100663296) == 0) goto L93;
        Shape shape2 = shape;
    L102:
        if (($changed & 805306368) == 0) goto L104;
        int $dirty2 = $dirty;
        int $dirty1 = $changed1;
    L113:
        if (($changed1 & 6) != 0) goto L122;
        int $dirty3 = $dirty1;
        int $dirty4 = r60 & 512;
        if ($dirty4 != 0) goto L120;
        if ($composer2.changed(contentColor) == false) goto L120;
        int r0 = 4;
    L121:
        int $dirty5 = $dirty3 | r0;
    L123:
        int $dirty6 = r60 & 1024;
        if ($dirty6 == 0) goto L127;
        $dirty5 = $dirty5 | 48;
    L134:
        int $dirty7 = $dirty5;
        int r7 = r60 & 2048;
        if (r7 == 0) goto L138;
        $dirty7 = $dirty7 | 384;
        Function2<? super Composer, ? super Integer, Unit> r8 = r54;
    L145:
        int $dirty8 = $dirty7;
        int $dirty9 = $changed1 & 3072;
        if ($dirty9 == 0) goto L148;
        int $dirty10 = $dirty8;
    L157:
        if ((r60 & 8192) == 0) goto L160;
        $dirty10 = $dirty10 | 24576;
    L167:
        if (($dirty2 & 306783379) == 306783378) goto L169;
    L174:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L177;
    L195:
        if (r14 == 0) goto L198;
        modifier2 = Modifier.Companion;
    L198:
        if ((r60 & 32) == 0) goto L200;
        $dirty2 = $dirty2 & (-3670017);
        sheetState2 = rememberModalBottomSheetState(false, null, $composer2, 0, 3);
    L200:
        if (r24 == 0) goto L203;
        sheetMaxWidth2 = BottomSheetDefaults.INSTANCE.m1920getSheetMaxWidthD9Ej5fM();
    L203:
        if ((r60 & 128) == 0) goto L206;
        $dirty2 = $dirty2 & (-234881025);
        shape2 = BottomSheetDefaults.INSTANCE.getExpandedShape($composer2, 6);
    L206:
        if ((r60 & 256) == 0) goto L208;
        $dirty2 = $dirty2 & (-1879048193);
        long containerColor2 = BottomSheetDefaults.INSTANCE.getContainerColor($composer2, 6);
    L210:
        if ((r60 & 512) == 0) goto L212;
        long contentColor2 = ColorSchemeKt.m2057contentColorForek8zF_U(containerColor2, $composer2, ($dirty2 >> 27) & 14);
        $dirty10 = $dirty10 & (-15);
    L213:
        if ($dirty6 == 0) goto L215;
        float tonalElevation2 = BottomSheetDefaults.INSTANCE.m1919getElevationD9Ej5fM();
    L216:
        if (r7 == 0) goto L218;
        Function2<? super Composer, ? super Integer, Unit> r16 = ComposableSingletons$ModalBottomSheetKt.INSTANCE.m2098getLambda2$material3_release();
    L220:
        if ((r60 & 4096) == 0) goto L222;
        long containerColor3 = containerColor2;
        float sheetMaxWidth3 = sheetMaxWidth2;
        Shape shape3 = shape2;
        float tonalElevation3 = tonalElevation2;
        int $dirty11 = $dirty10 & (-7169);
        Function2<? super Composer, ? super Integer, ? extends WindowInsets> r11 = ModalBottomSheetKt$ModalBottomSheetContent$1.INSTANCE;
        Modifier modifier3 = modifier2;
        int $dirty12 = $dirty2;
    L223:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L226;
        ComposerKt.traceEventStart(-1676960531, $dirty12, $dirty11, "androidx.compose.material3.ModalBottomSheetContent (ModalBottomSheet.kt:214)");
    L226:
        Strings.Companion r3 = Strings.Companion;
        final String bottomSheetPaneTitle = Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(R.string.m3c_bottom_sheet_pane_title), $composer2, 0);
        Modifier modifier4 = modifier3;
        Shape shape4 = shape3;
        Modifier r1 = SizeKt.fillMaxWidth$default(SizeKt.m779widthInVpY3zN4$default($this$ModalBottomSheetContent_u2dIQkwcL4.align(modifier3, Alignment.Companion.getTopCenter()), 0.0f, sheetMaxWidth3, 1, null), 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart($composer2, 1237857395, "CC(remember):ModalBottomSheet.kt#9igjgp");
        if (((3670016 & $dirty12) ^ 1572864) <= 1048576) goto L231;
        if ($composer2.changed(sheetState2) == false) goto L231;
    L232:
        boolean invalid$iv = true;
    L234:
        boolean invalid$iv2 = invalid$iv;
        Object value$iv = $composer2.rememberedValue();
        if (invalid$iv2 == true) goto L240;
        float sheetMaxWidth4 = sheetMaxWidth3;
        if (value$iv != Composer.Companion.getEmpty()) goto L242;
    L241:
        value$iv = SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(sheetState2, Orientation.Vertical, r44);
        $composer2.updateRememberedValue(value$iv);
    L242:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r2 = NestedScrollModifierKt.nestedScroll$default(r1, (NestedScrollConnection) value$iv, null, 2, null);
        AnchoredDraggableState<SheetValue> r4 = sheetState2.getAnchoredDraggableState$material3_release();
        Orientation r5 = Orientation.Vertical;
        ComposerKt.sourceInformationMarkerStart($composer2, 1237872435, "CC(remember):ModalBottomSheet.kt#9igjgp");
        long containerColor4 = containerColor3;
        if (((3670016 & $dirty12) ^ 1572864) <= 1048576) goto L247;
        if ($composer2.changed(sheetState2) == false) goto L247;
    L248:
        boolean invalid$iv3 = true;
    L250:
        boolean invalid$iv4 = invalid$iv3;
        Object value$iv2 = $composer2.rememberedValue();
        if (invalid$iv4 == true) goto L257;
        if (value$iv2 == Composer.Companion.getEmpty()) goto L257;
    L258:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r28 = AnchoredDraggableKt.draggableAnchors(r2, r4, r5, (Function2) value$iv2);
        DraggableState r29 = sheetState2.getAnchoredDraggableState$material3_release().getDraggableState$material3_release();
        Orientation r30 = Orientation.Vertical;
        boolean r31 = sheetState2.isVisible();
        boolean r33 = sheetState2.getAnchoredDraggableState$material3_release().isAnimationRunning();
        ComposerKt.sourceInformationMarkerStart($composer2, 1237929350, "CC(remember):ModalBottomSheet.kt#9igjgp");
        if ((57344 & $dirty12) != 16384) goto L261;
        boolean invalid$iv5 = true;
    L262:
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv5 == false) goto L265;
    L268:
        ModalBottomSheetKt$ModalBottomSheetContent$4$1 value$iv3 = new ModalBottomSheetKt$ModalBottomSheetContent$4$1(r44, null);
        $composer2.updateRememberedValue(value$iv3);
    L269:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r6 = DraggableKt.draggable$default(r28, r29, r30, r31, null, r33, null, (Function3) value$iv3, false, 168, null);
        ComposerKt.sourceInformationMarkerStart($composer2, 1237931647, "CC(remember):ModalBottomSheet.kt#9igjgp");
        boolean invalid$iv6 = $composer2.changed(bottomSheetPaneTitle);
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv6 == true) goto L276;
        if (it$iv2 == Composer.Companion.getEmpty()) goto L276;
        Object value$iv4 = it$iv2;
    L277:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r9 = SemanticsModifierKt.semantics$default(r6, false, (Function1) value$iv4, 1, null);
        ComposerKt.sourceInformationMarkerStart($composer2, 1237936755, "CC(remember):ModalBottomSheet.kt#9igjgp");
        if (((3670016 & $dirty12) ^ 1572864) <= 1048576) goto L282;
        if ($composer2.changed(sheetState2) == false) goto L282;
    L283:
        boolean r10 = true;
    L286:
        if (($dirty12 & 112) != 32) goto L288;
    L293:
        boolean r12 = true;
    L294:
        boolean invalid$iv7 = r10 | r12;
        Object it$iv3 = $composer2.rememberedValue();
        if (invalid$iv7 == false) goto L297;
    L300:
        Object value$iv5 = (Function1) new ModalBottomSheetKt$ModalBottomSheetContent$6$1(sheetState2, r41);
        $composer2.updateRememberedValue(value$iv5);
    L301:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final Function2<? super Composer, ? super Integer, ? extends WindowInsets> r46 = r11;
        final SheetState sheetState3 = sheetState2;
        final Function2<? super Composer, ? super Integer, Unit> r48 = r16;
        long contentColor3 = contentColor2;
        float sheetMaxWidth5 = sheetMaxWidth4;
        SurfaceKt.m2670SurfaceT9BRK9s(GraphicsLayerModifierKt.graphicsLayer(r9, (Function1) value$iv5), shape4, containerColor4, contentColor3, tonalElevation3, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-692668920, true, new ModalBottomSheetKt$ModalBottomSheetContent$7(r46, r41, r48, sheetState3, r43, scope, r56), $composer2, 54), $composer2, ((((($dirty12 >> 21) & 112) | 12582912) | (($dirty12 >> 21) & 896)) | (($dirty11 << 9) & 7168)) | (($dirty11 << 9) & 57344), 96);
        Composer $composer3 = $composer2;
        if (ComposerKt.isTraceInProgress() == false) goto L304;
        ComposerKt.traceEventEnd();
    L304:
        final SheetState sheetState4 = sheetState3;
        final Function2<? super Composer, ? super Integer, Unit> r15 = r48;
        final Function2<? super Composer, ? super Integer, ? extends WindowInsets> r18 = r46;
        final float tonalElevation4 = tonalElevation3;
        final long contentColor4 = contentColor3;
        final long containerColor5 = containerColor4;
        final Shape shape5 = shape4;
        final float sheetMaxWidth6 = sheetMaxWidth5;
        final Modifier modifier5 = modifier4;
    L305:
        ScopeUpdateScope r13 = $composer3.endRestartGroup();
        if (r13 == null) goto L309;
        r13.updateScope(new ModalBottomSheetKt$ModalBottomSheetContent$8($this$ModalBottomSheetContent_u2dIQkwcL4, r41, scope, r43, r44, modifier5, sheetState4, sheetMaxWidth6, shape5, containerColor5, contentColor4, tonalElevation4, r15, r18, r56, $changed, $changed1, r60));
        return;
    L309:
        return;
    L297:
        if (it$iv3 == Composer.Companion.getEmpty()) goto L300;
        value$iv5 = it$iv3;
        goto L301
    L288:
        if (($dirty12 & 64) != 0) goto L290;
    L292:
        r12 = false;
        goto L294
    L290:
        if ($composer2.changedInstance(r41) == false) goto L292;
    L282:
        if (($dirty12 & 1572864) == 1048576) goto L283;
        r10 = false;
    L276:
        value$iv4 = (Function1) new ModalBottomSheetKt$ModalBottomSheetContent$5$1(bottomSheetPaneTitle);
        $composer2.updateRememberedValue(value$iv4);
        goto L277
    L265:
        if (it$iv == Composer.Companion.getEmpty()) goto L268;
        value$iv3 = it$iv;
        goto L269
    L261:
        invalid$iv5 = false;
    L257:
        value$iv2 = (Function2) new ModalBottomSheetKt$ModalBottomSheetContent$3$1(sheetState2);
        $composer2.updateRememberedValue(value$iv2);
    L247:
        if (($dirty12 & 1572864) == 1048576) goto L248;
        invalid$iv3 = false;
        goto L250
    L240:
        sheetMaxWidth4 = sheetMaxWidth3;
    L231:
        if (($dirty12 & 1572864) == 1048576) goto L232;
        invalid$iv = false;
        goto L234
    L222:
        containerColor3 = containerColor2;
        sheetMaxWidth3 = sheetMaxWidth2;
        shape3 = shape2;
        tonalElevation3 = tonalElevation2;
        r11 = r55;
        $dirty11 = $dirty10;
        modifier3 = modifier2;
        $dirty12 = $dirty2;
        goto L223
    L218:
        r16 = r54;
        goto L220
    L215:
        tonalElevation2 = tonalElevation;
        goto L216
    L212:
        contentColor2 = contentColor;
        goto L213
    L208:
        containerColor2 = containerColor;
        goto L210
    L177:
        if ($composer2.getDefaultsInvalid() == true) goto L195;
        $composer2.skipToGroupEnd();
        if ((r60 & 32) == 0) goto L183;
        $dirty2 = $dirty2 & (-3670017);
    L183:
        if ((r60 & 128) == 0) goto L186;
        $dirty2 = $dirty2 & (-234881025);
    L186:
        if ((r60 & 256) == 0) goto L189;
        $dirty2 = $dirty2 & (-1879048193);
    L189:
        if ((r60 & 512) == 0) goto L192;
        $dirty10 = $dirty10 & (-15);
    L192:
        if ((r60 & 4096) == 0) goto L194;
        $dirty10 = $dirty10 & (-7169);
    L194:
        containerColor3 = containerColor;
        contentColor2 = contentColor;
        $dirty11 = $dirty10;
        r16 = r8;
        sheetMaxWidth3 = sheetMaxWidth2;
        shape3 = shape2;
        modifier3 = modifier2;
        $dirty12 = $dirty2;
        tonalElevation3 = tonalElevation;
        r11 = r55;
        goto L223
    L169:
        if (($dirty10 & 9363) != 9362) goto L174;
        if ($composer2.getSkipping() == false) goto L174;
        $composer2.skipToGroupEnd();
        tonalElevation4 = tonalElevation;
        r18 = r55;
        $composer3 = $composer2;
        sheetState4 = sheetState2;
        shape5 = shape2;
        modifier5 = modifier2;
        contentColor4 = contentColor;
        r15 = r8;
        sheetMaxWidth6 = sheetMaxWidth2;
        containerColor5 = containerColor;
        goto L305
    L160:
        if (($changed1 & 24576) != 0) goto L167;
        if ($composer2.changedInstance(r56) == false) goto L164;
        r20 = 16384;
    L164:
        $dirty10 = $dirty10 | r20;
        goto L167
    L148:
        if ((r60 & 4096) != 0) goto L153;
        if ($composer2.changedInstance(r55) == false) goto L153;
    L154:
        $dirty10 = $dirty8 | r17;
    L153:
        r17 = 1024;
        goto L154
    L138:
        if (($changed1 & 384) != 0) goto L144;
        r8 = r54;
        if ($composer2.changedInstance(r8) == false) goto L142;
        int r19 = 256;
    L143:
        $dirty7 = $dirty7 | r19;
        goto L145
    L142:
        r19 = 128;
        goto L143
    L144:
        r8 = r54;
        goto L145
    L127:
        if (($changed1 & 48) != 0) goto L134;
        if ($composer2.changed(tonalElevation) == false) goto L131;
        int r110 = 32;
    L132:
        $dirty5 = $dirty5 | r110;
        goto L134
    L131:
        r110 = 16;
    L120:
        r0 = 2;
        goto L121
    L122:
        $dirty5 = $dirty1;
        goto L123
    L104:
        if ((r60 & 256) != 0) goto L108;
        int $dirty13 = $dirty;
        $dirty1 = $changed1;
        if ($composer2.changed(containerColor) == false) goto L109;
        int r210 = 536870912;
    L110:
        $dirty2 = $dirty13 | r210;
    L109:
        r210 = 268435456;
        goto L110
    L108:
        $dirty13 = $dirty;
        $dirty1 = $changed1;
        goto L109
    L93:
        if ((r60 & 128) != 0) goto L97;
        shape2 = shape;
        if ($composer2.changed(shape2) == false) goto L98;
        int r27 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r27;
    L98:
        r27 = 33554432;
        goto L99
    L97:
        shape2 = shape;
        goto L98
    L83:
        if (($changed & 12582912) != 0) goto L89;
        sheetMaxWidth2 = sheetMaxWidth;
        if ($composer2.changed(sheetMaxWidth2) == false) goto L87;
        int r26 = 8388608;
    L88:
        $dirty = $dirty | r26;
        goto L91
    L87:
        r26 = 4194304;
        goto L88
    L89:
        sheetMaxWidth2 = sheetMaxWidth;
        goto L91
    L71:
        if ((r60 & 32) != 0) goto L75;
        sheetState2 = sheetState;
        if ($composer2.changed(sheetState2) == false) goto L76;
        int r25 = 1048576;
    L77:
        $dirty = $dirty | r25;
    L76:
        r25 = 524288;
        goto L77
    L75:
        sheetState2 = sheetState;
        goto L76
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L65;
        int r22 = 131072;
    L66:
        $dirty = $dirty | r22;
        goto L69
    L65:
        r22 = 65536;
        goto L66
    L67:
        modifier2 = modifier;
        goto L69
    L51:
        if (($changed & 24576) != 0) goto L57;
        if ($composer2.changedInstance(r44) == false) goto L55;
        int r111 = 16384;
    L56:
        $dirty = $dirty | r111;
        goto L57
    L55:
        r111 = 8192;
        goto L56
    L40:
        if (($changed & 3072) != 0) goto L47;
        if ($composer2.changedInstance(r43) == false) goto L44;
        int r112 = 2048;
    L45:
        $dirty = $dirty | r112;
        goto L47
    L44:
        r112 = 1024;
        goto L45
    L29:
        if (($changed & 384) != 0) goto L36;
        if ($composer2.changedInstance(scope) == false) goto L33;
        int r113 = 256;
    L34:
        $dirty = $dirty | r113;
        goto L36
    L33:
        r113 = 128;
        goto L34
    L16:
        if (($changed & 48) != 0) goto L26;
        if (($changed & 64) != 0) goto L20;
        boolean r21 = $composer2.changed(r41);
    L21:
        if (r21 == false) goto L23;
        int r23 = 32;
    L24:
        $dirty = $dirty | r23;
        goto L26
    L23:
        r23 = 16;
        goto L24
    L20:
        r21 = $composer2.changedInstance(r41);
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed($this$ModalBottomSheetContent_u2dIQkwcL4) == false) goto L10;
        int r32 = 4;
    L11:
        $dirty = $dirty | r32;
        goto L13
    L10:
        r32 = 2;
        goto L11
    }

    private static final float calculatePredictiveBackScaleX(GraphicsLayerScope $this$calculatePredictiveBackScaleX, float progress) {
        float width = Size.m4194getWidthimpl($this$calculatePredictiveBackScaleX.mo4552getSizeNHjbRc());
        if (Float.isNaN(width) == false) goto L5;
        return 1.0f;
    L5:
        if (width != 0.0f) goto L7;
        boolean r3 = true;
    L8:
        if (r3 == false) goto L12;
        return 1.0f;
    L12:
        return 1.0f - (MathHelpersKt.lerp(0.0f, Math.min($this$calculatePredictiveBackScaleX.mo376toPx0680j_4(PredictiveBackMaxScaleXDistance), width), progress) / width);
    L7:
        r3 = false;
        goto L8
    }

    private static final float calculatePredictiveBackScaleY(GraphicsLayerScope $this$calculatePredictiveBackScaleY, float progress) {
        float height = Size.m4191getHeightimpl($this$calculatePredictiveBackScaleY.mo4552getSizeNHjbRc());
        if (Float.isNaN(height) == false) goto L5;
        return 1.0f;
    L5:
        if (height != 0.0f) goto L7;
        boolean r3 = true;
    L8:
        if (r3 == false) goto L12;
        return 1.0f;
    L12:
        return 1.0f - (MathHelpersKt.lerp(0.0f, Math.min($this$calculatePredictiveBackScaleY.mo376toPx0680j_4(PredictiveBackMaxScaleYDistance), height), progress) / height);
    L7:
        r3 = false;
        goto L8
    }

    public static final SheetState rememberModalBottomSheetState(boolean skipPartiallyExpanded, Function1<? super SheetValue, Boolean> r9, Composer $composer, int $changed, int r12) {
        ComposerKt.sourceInformationMarkerStart($composer, -778250030, "C(rememberModalBottomSheetState)P(1)400@18058L160:ModalBottomSheet.kt#uh7d8r");
        if ((r12 & 1) == 0) goto L5;
        boolean skipPartiallyExpanded2 = false;
    L7:
        if ((r12 & 2) == 0) goto L9;
        Function1 confirmValueChange = AnonymousClass1.INSTANCE;
        Function1<? super SheetValue, Boolean> r2 = confirmValueChange;
    L11:
        if (ComposerKt.isTraceInProgress() == false) goto L13;
        ComposerKt.traceEventStart(-778250030, $changed, -1, "androidx.compose.material3.rememberModalBottomSheetState (ModalBottomSheet.kt:400)");
    L13:
        SheetState r8 = SheetDefaultsKt.rememberSheetState(skipPartiallyExpanded2, r2, SheetValue.Hidden, false, $composer, (($changed & 14) | 384) | ($changed & 112), 8);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
    L16:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r8;
    L9:
        r2 = r9;
        goto L11
    L5:
        skipPartiallyExpanded2 = skipPartiallyExpanded;
        goto L7
    }

    /* JADX INFO: renamed from: Scrim-3J-VO9M, reason: not valid java name */
    private static final void m2371Scrim3JVO9M(final long color, final Function0<Unit> r24, final boolean visible, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(951870469);
        ComposerKt.sourceInformation($composer2, "C(Scrim)P(0:c#ui.graphics.Color)410@18376L87,411@18489L29,426@19112L79,426@19062L129:ModalBottomSheet.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(color) == false) goto L7;
        int r7 = 4;
    L8:
        $dirty = $dirty | r7;
        goto L10
    L7:
        r7 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(r24) == false) goto L14;
        int r8 = 32;
    L15:
        $dirty = $dirty | r8;
        goto L17
    L14:
        r8 = 16;
    L17:
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changed(visible) == false) goto L21;
        int r9 = 256;
    L22:
        $dirty = $dirty | r9;
        goto L24
    L21:
        r9 = 128;
    L24:
        if (($dirty & 147) != 146) goto L30;
        if ($composer2.getSkipping() == false) goto L30;
        $composer2.skipToGroupEnd();
    L82:
        ScopeUpdateScope r6 = $composer2.endRestartGroup();
        if (r6 == null) goto L86;
        r6.updateScope(new ModalBottomSheetKt$Scrim$2(color, r24, visible, $changed));
        return;
    L86:
        return;
    L30:
        if (ComposerKt.isTraceInProgress() == false) goto L33;
        ComposerKt.traceEventStart(951870469, $dirty, -1, "androidx.compose.material3.Scrim (ModalBottomSheet.kt:407)");
    L33:
        if (color == 16) goto L35;
        int r0 = 1;
    L36:
        if (r0 == 0) goto L80;
        if (visible == false) goto L39;
        int $dirty2 = 1065353216;
    L40:
        int $dirty3 = $dirty;
        final State<Float> r10 = AnimateAsStateKt.animateFloatAsState($dirty2, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, $composer2, 48, 28);
        Strings.Companion r11 = Strings.Companion;
        final String closeSheet = Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(androidx.compose.ui.R.string.close_sheet), $composer2, 0);
        $composer2.startReplaceGroup(-1785653838);
        ComposerKt.sourceInformation($composer2, "414@18629L44,415@18730L263");
        if (visible == false) goto L65;
        Modifier.Companion r12 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart($composer2, -1785652017, "CC(remember):ModalBottomSheet.kt#9igjgp");
        if (($dirty3 & 112) != 32) goto L45;
        boolean invalid$iv = true;
    L46:
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L49;
    L52:
        ModalBottomSheetKt$Scrim$dismissSheet$1$1 value$iv = new ModalBottomSheetKt$Scrim$dismissSheet$1$1(r24, null);
        $composer2.updateRememberedValue(value$iv);
    L53:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r1 = SuspendingPointerInputFilterKt.pointerInput(r12, r24, (Function2) value$iv);
        ComposerKt.sourceInformationMarkerStart($composer2, -1785648566, "CC(remember):ModalBottomSheet.kt#9igjgp");
        boolean r13 = $composer2.changed(closeSheet);
        if (($dirty3 & 112) != 32) goto L56;
        boolean r14 = true;
    L57:
        boolean invalid$iv2 = r13 | r14;
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv2 == false) goto L60;
    L63:
        Object value$iv2 = (Function1) new ModalBottomSheetKt$Scrim$dismissSheet$2$1(closeSheet, r24);
        $composer2.updateRememberedValue(value$iv2);
    L64:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier.Companion dismissSheet = SemanticsModifierKt.semantics(r1, true, (Function1) value$iv2);
    L66:
        $composer2.endReplaceGroup();
        Modifier r4 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null).then(dismissSheet);
        ComposerKt.sourceInformationMarkerStart($composer2, -1785636526, "CC(remember):ModalBottomSheet.kt#9igjgp");
        if (($dirty3 & 14) != 4) goto L69;
        boolean r15 = true;
    L70:
        boolean invalid$iv3 = $composer2.changed(r10) | r15;
        Object it$iv3 = $composer2.rememberedValue();
        if (invalid$iv3 == false) goto L73;
    L76:
        Object value$iv3 = (Function1) new ModalBottomSheetKt$Scrim$1$1(color, r10);
        $composer2.updateRememberedValue(value$iv3);
    L77:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        CanvasKt.Canvas(r4, (Function1) value$iv3, $composer2, 0);
        goto L80
    L73:
        if (it$iv3 == Composer.Companion.getEmpty()) goto L76;
        value$iv3 = it$iv3;
        goto L77
    L69:
        r15 = false;
        goto L70
    L60:
        if (it$iv2 == Composer.Companion.getEmpty()) goto L63;
        value$iv2 = it$iv2;
        goto L64
    L56:
        r14 = false;
        goto L57
    L49:
        if (it$iv == Composer.Companion.getEmpty()) goto L52;
        value$iv = it$iv;
        goto L53
    L45:
        invalid$iv = false;
        goto L46
    L65:
        dismissSheet = Modifier.Companion;
        goto L66
    L39:
        $dirty2 = 0;
    L80:
        if (ComposerKt.isTraceInProgress() == false) goto L82;
        ComposerKt.traceEventEnd();
        goto L82
    L35:
        r0 = 0;
        goto L36
    }

    private static final float Scrim_3J_VO9M$lambda$10(State<Float> r4) {
        return r4.getValue().floatValue();
    }

    static {
        PredictiveBackMaxScaleXDistance = Dp.m6973constructorimpl(48);
        PredictiveBackMaxScaleYDistance = Dp.m6973constructorimpl(24);
        PredictiveBackChildTransformOrigin = TransformOriginKt.TransformOrigin(0.5f, 0.0f);
    }
}
