package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.AbsoluteAlignment;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AndroidSelectionHandles.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\bH\u0001¢\u0006\u0002\u0010\t\u001aL\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a+\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0006\u0010\u001b\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u001c\u001a\u0014\u0010\u001d\u001a\u00020\u001e*\u00020\u001f2\u0006\u0010 \u001a\u00020\u0014H\u0000\u001a\"\u0010!\u001a\u00020\u0016*\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0006\u0010\u001b\u001a\u00020\rH\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"HandlePopup", "", "positionProvider", "Landroidx/compose/foundation/text/selection/OffsetProvider;", "handleReferencePoint", "Landroidx/compose/ui/Alignment;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/text/selection/OffsetProvider;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SelectionHandle", "offsetProvider", "isStartHandle", "", "direction", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "handlesCrossed", "minTouchTargetSize", "Landroidx/compose/ui/unit/DpSize;", "lineHeight", "", "modifier", "Landroidx/compose/ui/Modifier;", "SelectionHandle-wLIcFTc", "(Landroidx/compose/foundation/text/selection/OffsetProvider;ZLandroidx/compose/ui/text/style/ResolvedTextDirection;ZJFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SelectionHandleIcon", "iconVisible", "isLeft", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "createHandleImage", "Landroidx/compose/ui/graphics/ImageBitmap;", "Landroidx/compose/ui/draw/CacheDrawScope;", "radius", "drawSelectionHandle", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidSelectionHandles_androidKt {
    /* JADX INFO: renamed from: SelectionHandle-wLIcFTc, reason: not valid java name */
    public static final void m1428SelectionHandlewLIcFTc(final OffsetProvider offsetProvider, final boolean isStartHandle, ResolvedTextDirection direction, boolean handlesCrossed, long minTouchTargetSize, final float lineHeight, final Modifier modifier, Composer $composer, final int $changed, final int r30) {
        Composer $composer2 = $composer.startRestartGroup(-466280168);
        ComposerKt.sourceInformation($composer2, "C(SelectionHandle)P(6,2!2,4:c#ui.unit.DpSize)71@3073L394,83@3574L7,84@3678L1344,84@3586L1436:AndroidSelectionHandles.android.kt#eksfi3");
        int $dirty = $changed;
        if ((r30 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L16:
        if ((r30 & 2) == 0) goto L19;
        $dirty = $dirty | 48;
    L26:
        if ((r30 & 4) == 0) goto L29;
        $dirty = $dirty | 384;
        ResolvedTextDirection r10 = direction;
    L37:
        if ((r30 & 8) == 0) goto L40;
        $dirty = $dirty | 3072;
        boolean r12 = handlesCrossed;
    L48:
        if (($changed & 24576) == 0) goto L50;
        long minTouchTargetSize2 = minTouchTargetSize;
    L59:
        if ((r30 & 64) == 0) goto L62;
        $dirty = $dirty | 1572864;
    L69:
        if ((533651 & $dirty) == 533650) goto L71;
        boolean r2 = true;
    L73:
        if ($composer2.shouldExecute(r2, $dirty & 1) == false) goto L117;
        $composer2.startDefaults();
        if (($changed & 1) == 0) goto L83;
        if ($composer2.getDefaultsInvalid() == true) goto L83;
        $composer2.skipToGroupEnd();
        if ((r30 & 16) == 0) goto L85;
        $dirty = $dirty & (-57345);
    L85:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L88;
        ComposerKt.traceEventStart(-466280168, $dirty, -1, "androidx.compose.foundation.text.selection.SelectionHandle (AndroidSelectionHandles.android.kt:65)");
    L88:
        final boolean isLeft = SelectionHandlesKt.isLeftSelectionHandle(isStartHandle, direction, handlesCrossed);
        AbsoluteAlignment r3 = AbsoluteAlignment.INSTANCE;
        if (isLeft == false) goto L91;
        Alignment handleReferencePoint = r3.getTopRight();
    L92:
        ComposerKt.sourceInformationMarkerStart($composer2, -785125323, "CC(remember):AndroidSelectionHandles.android.kt#9igjgp");
        if (($dirty & 14) != 4) goto L95;
    L100:
        boolean r4 = true;
    L102:
        if (($dirty & 112) != 32) goto L104;
        boolean r5 = true;
    L105:
        boolean invalid$iv = (r4 | r5) | $composer2.changed(isLeft);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == true) goto L111;
        int $dirty2 = $dirty;
        if (it$iv != Composer.Companion.getEmpty()) goto L113;
    L112:
        Object value$iv = (Function1) new AndroidSelectionHandles_androidKt$SelectionHandle$semanticsModifier$1$1(offsetProvider, isStartHandle, isLeft);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L113:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final Modifier semanticsModifier = SemanticsModifierKt.semantics$default(modifier, false, (Function1) it$iv, 1, null);
        ProvidableCompositionLocal<ViewConfiguration> r1 = CompositionLocalsKt.getLocalViewConfiguration();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r0 = $composer2.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final ViewConfiguration viewConfiguration = (ViewConfiguration) r0;
        final long minTouchTargetSize3 = minTouchTargetSize2;
        HandlePopup(offsetProvider, handleReferencePoint, ComposableLambdaKt.rememberComposableLambda(1365123137, true, new AndroidSelectionHandles_androidKt$SelectionHandle$1(viewConfiguration, minTouchTargetSize3, isLeft, semanticsModifier, offsetProvider), $composer2, 54), $composer2, ($dirty2 & 14) | 384);
        if (ComposerKt.isTraceInProgress() == false) goto L116;
        ComposerKt.traceEventEnd();
    L116:
        minTouchTargetSize2 = minTouchTargetSize3;
    L118:
        ScopeUpdateScope r6 = $composer2.endRestartGroup();
        if (r6 == null) goto L122;
        final ResolvedTextDirection r7 = r10;
        final boolean r8 = r12;
        final long minTouchTargetSize4 = minTouchTargetSize2;
        r6.updateScope(new AndroidSelectionHandles_androidKt$SelectionHandle$2(offsetProvider, isStartHandle, r7, r8, minTouchTargetSize4, lineHeight, modifier, $changed, r30));
        return;
    L122:
        return;
    L111:
        $dirty2 = $dirty;
        goto L112
    L104:
        r5 = false;
        goto L105
    L95:
        if (($dirty & 8) != 0) goto L97;
    L99:
        r4 = false;
        goto L102
    L97:
        if ($composer2.changedInstance(offsetProvider) == false) goto L99;
    L91:
        handleReferencePoint = r3.getTopLeft();
    L83:
        if ((r30 & 16) == 0) goto L85;
        minTouchTargetSize2 = DpSize.Companion.m7080getUnspecifiedMYxV2XQ();
        $dirty = $dirty & (-57345);
        goto L85
    L117:
        $composer2.skipToGroupEnd();
        goto L118
    L71:
        r2 = false;
        goto L73
    L62:
        if (($changed & 1572864) != 0) goto L69;
        if ($composer2.changed(modifier) == false) goto L66;
        int r9 = 1048576;
    L67:
        $dirty = $dirty | r9;
        goto L69
    L66:
        r9 = 524288;
        goto L67
    L50:
        if ((r30 & 16) != 0) goto L54;
        minTouchTargetSize2 = minTouchTargetSize;
        if ($composer2.changed(minTouchTargetSize2) == false) goto L55;
        int r11 = 16384;
    L56:
        $dirty = $dirty | r11;
    L55:
        r11 = 8192;
        goto L56
    L54:
        minTouchTargetSize2 = minTouchTargetSize;
        goto L55
    L40:
        if (($changed & 3072) != 0) goto L46;
        r12 = handlesCrossed;
        if ($composer2.changed(r12) == false) goto L44;
        int r13 = 2048;
    L45:
        $dirty = $dirty | r13;
        goto L48
    L44:
        r13 = 1024;
        goto L45
    L46:
        r12 = handlesCrossed;
        goto L48
    L29:
        if (($changed & 384) != 0) goto L35;
        r10 = direction;
        if ($composer2.changed(r10) == false) goto L33;
        int r14 = 256;
    L34:
        $dirty = $dirty | r14;
        goto L37
    L33:
        r14 = 128;
        goto L34
    L35:
        r10 = direction;
        goto L37
    L19:
        if (($changed & 48) != 0) goto L26;
        if ($composer2.changed(isStartHandle) == false) goto L23;
        int r15 = 32;
    L24:
        $dirty = $dirty | r15;
        goto L26
    L23:
        r15 = 16;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L16;
        if (($changed & 8) != 0) goto L10;
        boolean r16 = $composer2.changed(offsetProvider);
    L11:
        if (r16 == false) goto L13;
        int r17 = 4;
    L14:
        $dirty = $dirty | r17;
        goto L16
    L13:
        r17 = 2;
        goto L14
    L10:
        r16 = $composer2.changedInstance(offsetProvider);
        goto L11
    }

    public static final void SelectionHandleIcon(final Modifier modifier, final Function0<Boolean> r6, final boolean isLeft, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(2111672474);
        ComposerKt.sourceInformation($composer2, "C(SelectionHandleIcon)P(2)128@5180L89:AndroidSelectionHandles.android.kt#eksfi3");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(modifier) == false) goto L7;
        int r2 = 4;
    L8:
        $dirty = $dirty | r2;
        goto L10
    L7:
        r2 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(r6) == false) goto L14;
        int r3 = 32;
    L15:
        $dirty = $dirty | r3;
        goto L17
    L14:
        r3 = 16;
    L17:
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changed(isLeft) == false) goto L21;
        int r4 = 256;
    L22:
        $dirty = $dirty | r4;
        goto L24
    L21:
        r4 = 128;
    L24:
        if (($dirty & 147) == 146) goto L26;
        boolean r5 = true;
    L28:
        if ($composer2.shouldExecute(r5, $dirty & 1) == true) goto L30;
        $composer2.skipToGroupEnd();
    L36:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L40;
        r0.updateScope(new C03971(modifier, r6, isLeft, $changed));
        return;
    L40:
        return;
    L30:
        if (ComposerKt.isTraceInProgress() == false) goto L32;
        ComposerKt.traceEventStart(2111672474, $dirty, -1, "androidx.compose.foundation.text.selection.SelectionHandleIcon (AndroidSelectionHandles.android.kt:127)");
    L32:
        SpacerKt.Spacer(drawSelectionHandle(SizeKt.m774sizeVpY3zN4(modifier, SelectionHandlesKt.getHandleWidth(), SelectionHandlesKt.getHandleHeight()), r6, isLeft), $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L36;
        ComposerKt.traceEventEnd();
        goto L36
    L26:
        r5 = false;
        goto L28
    }

    public static final Modifier drawSelectionHandle(Modifier $this$drawSelectionHandle, final Function0<Boolean> r4, final boolean isLeft) {
        return ComposedModifierKt.composed$default($this$drawSelectionHandle, null, new C03981(r4, isLeft), 1, null);
    }

    public static final ImageBitmap createHandleImage(CacheDrawScope $this$createHandleImage, float radius) {
        int edge = ((int) Math.ceil(radius)) * 2;
        ImageBitmap imageBitmap = HandleImageCache.INSTANCE.getImageBitmap();
        Canvas canvas = HandleImageCache.INSTANCE.getCanvas();
        CanvasDrawScope drawScope = HandleImageCache.INSTANCE.getCanvasDrawScope();
        if (imageBitmap == null) goto L11;
        if (canvas == null) goto L11;
        if (edge > imageBitmap.getWidth()) goto L11;
        if (edge > imageBitmap.getHeight()) goto L11;
        ImageBitmap imageBitmap2 = imageBitmap;
        Canvas canvas2 = canvas;
    L12:
        if (drawScope != null) goto L14;
        CanvasDrawScope drawScope2 = new CanvasDrawScope();
        HandleImageCache.INSTANCE.setCanvasDrawScope(drawScope2);
        CanvasDrawScope drawScope3 = drawScope2;
    L15:
        LayoutDirection layoutDirection$iv = $this$createHandleImage.getLayoutDirection();
        float width$iv = imageBitmap2.getWidth();
        float height$iv = imageBitmap2.getHeight();
        long v1$iv$iv = Float.floatToRawIntBits(width$iv);
        long v2$iv$iv = Float.floatToRawIntBits(height$iv);
        long size$iv = Size.m4185constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L));
        CanvasDrawScope this_$iv = drawScope3;
        CanvasDrawScope.DrawParams r4 = this_$iv.getDrawParams();
        Density prevDensity$iv = r4.component1();
        LayoutDirection prevLayoutDirection$iv = r4.component2();
        Canvas prevCanvas$iv = r4.component3();
        long prevSize$iv = r4.m4834component4NHjbRc();
        CanvasDrawScope.DrawParams $this$draw_yzxVdVo_u24lambda_u240$iv = this_$iv.getDrawParams();
        $this$draw_yzxVdVo_u24lambda_u240$iv.setDensity($this$createHandleImage);
        $this$draw_yzxVdVo_u24lambda_u240$iv.setLayoutDirection(layoutDirection$iv);
        $this$draw_yzxVdVo_u24lambda_u240$iv.setCanvas(canvas2);
        $this$draw_yzxVdVo_u24lambda_u240$iv.m4837setSizeuvyYCjk(size$iv);
        canvas2.save();
        CanvasDrawScope $this$createHandleImage_u24lambda_u241 = this_$iv;
        DrawScope.m4911drawRectnJ9OG0$default($this$createHandleImage_u24lambda_u241, Color.Companion.m4392getBlack0d7_KjU(), 0, $this$createHandleImage_u24lambda_u241.mo4917getSizeNHjbRc(), 0.0f, null, null, BlendMode.Companion.m4281getClear0nO6VwU(), 58, null);
        long r22 = ColorKt.Color(4278190080L);
        long r24 = Offset.Companion.m4141getZeroF1C5BW0();
        long v1$iv$iv2 = Float.floatToRawIntBits(radius);
        long v2$iv$iv2 = Float.floatToRawIntBits(radius);
        DrawScope.m4911drawRectnJ9OG0$default($this$createHandleImage_u24lambda_u241, r22, r24, Size.m4185constructorimpl((v1$iv$iv2 << 32) | (v2$iv$iv2 & 4294967295L)), 0.0f, null, null, 0, 120, null);
        long r1 = ColorKt.Color(4278190080L);
        long v1$iv$iv3 = Float.floatToRawIntBits(radius);
        int $i$f$Offset = Float.floatToRawIntBits(radius);
        long v2$iv$iv3 = $i$f$Offset;
        ImageBitmap imageBitmap3 = imageBitmap2;
        DrawScope.m4898drawCircleVaOC9Bg$default($this$createHandleImage_u24lambda_u241, r1, radius, Offset.m4117constructorimpl((v1$iv$iv3 << 32) | (v2$iv$iv3 & 4294967295L)), 0.0f, null, null, 0, 120, null);
        canvas2.restore();
        CanvasDrawScope.DrawParams $this$draw_yzxVdVo_u24lambda_u241$iv = this_$iv.getDrawParams();
        $this$draw_yzxVdVo_u24lambda_u241$iv.setDensity(prevDensity$iv);
        $this$draw_yzxVdVo_u24lambda_u241$iv.setLayoutDirection(prevLayoutDirection$iv);
        $this$draw_yzxVdVo_u24lambda_u241$iv.setCanvas(prevCanvas$iv);
        $this$draw_yzxVdVo_u24lambda_u241$iv.m4837setSizeuvyYCjk(prevSize$iv);
        return imageBitmap3;
    L14:
        drawScope3 = drawScope;
    L11:
        ImageBitmap imageBitmap4 = ImageBitmapKt.m4591ImageBitmapx__hDU$default(edge, edge, ImageBitmapConfig.Companion.m4585getAlpha8_sVssgQ(), false, null, 24, null);
        HandleImageCache.INSTANCE.setImageBitmap(imageBitmap4);
        Canvas canvas3 = CanvasKt.Canvas(imageBitmap4);
        HandleImageCache.INSTANCE.setCanvas(canvas3);
        imageBitmap2 = imageBitmap4;
        canvas2 = canvas3;
        goto L12
    }

    public static final void HandlePopup(final OffsetProvider positionProvider, final Alignment handleReferencePoint, final Function2<? super Composer, ? super Integer, Unit> r23, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(476043083);
        ComposerKt.sourceInformation($composer2, "C(HandlePopup)P(2,1)225@8875L135,228@9015L190:AndroidSelectionHandles.android.kt#eksfi3");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L13;
        if (($changed & 8) != 0) goto L7;
        boolean r4 = $composer2.changed(positionProvider);
    L8:
        if (r4 == false) goto L10;
        int r5 = 4;
    L11:
        $dirty = $dirty | r5;
        goto L13
    L10:
        r5 = 2;
        goto L11
    L7:
        r4 = $composer2.changedInstance(positionProvider);
    L13:
        if (($changed & 48) != 0) goto L20;
        if ($composer2.changed(handleReferencePoint) == false) goto L17;
        int r6 = 32;
    L18:
        $dirty = $dirty | r6;
        goto L20
    L17:
        r6 = 16;
    L20:
        if (($changed & 384) == 0) goto L22;
    L26:
        int $dirty2 = $dirty;
        boolean r11 = false;
        if (($dirty2 & 147) == 146) goto L29;
        boolean r3 = true;
    L31:
        if ($composer2.shouldExecute(r3, $dirty2 & 1) == true) goto L33;
        $composer2.skipToGroupEnd();
    L57:
        ScopeUpdateScope r2 = $composer2.endRestartGroup();
        if (r2 == null) goto L61;
        r2.updateScope(new AnonymousClass1(positionProvider, handleReferencePoint, r23, $changed));
        return;
    L61:
        return;
    L33:
        if (ComposerKt.isTraceInProgress() == false) goto L35;
        ComposerKt.traceEventStart(476043083, $dirty2, -1, "androidx.compose.foundation.text.selection.HandlePopup (AndroidSelectionHandles.android.kt:223)");
    L35:
        ComposerKt.sourceInformationMarkerStart($composer2, 1288572034, "CC(remember):AndroidSelectionHandles.android.kt#9igjgp");
        if (($dirty2 & 112) != 32) goto L38;
        boolean r7 = true;
    L40:
        if (($dirty2 & 14) != 4) goto L42;
    L45:
        r11 = true;
    L46:
        boolean invalid$iv = r7 | r11;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L49;
    L52:
        Object value$iv = new HandlePositionProvider(handleReferencePoint, positionProvider);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L53:
        HandlePositionProvider popupPositionProvider = (HandlePositionProvider) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        AndroidPopup_androidKt.Popup(popupPositionProvider, null, new PopupProperties(false, false, false, null, true, false, 15, null), r23, $composer2, (($dirty2 << 3) & 7168) | 384, 2);
        if (ComposerKt.isTraceInProgress() == false) goto L57;
        ComposerKt.traceEventEnd();
        goto L57
    L49:
        if (it$iv != Composer.Companion.getEmpty()) goto L53;
    L42:
        if (($dirty2 & 8) == 0) goto L46;
        if ($composer2.changed(positionProvider) == false) goto L46;
    L38:
        r7 = false;
        goto L40
    L29:
        r3 = false;
        goto L31
    L22:
        if ($composer2.changedInstance(r23) == false) goto L24;
        int r8 = 256;
    L25:
        $dirty = $dirty | r8;
        goto L26
    L24:
        r8 = 128;
        goto L25
    }
}
