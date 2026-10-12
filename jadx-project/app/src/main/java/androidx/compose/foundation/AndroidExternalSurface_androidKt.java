package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: AndroidExternalSurface.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aU\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a]\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00052\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0017H\u0003¢\u0006\u0002\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\u001aH\u0003¢\u0006\u0002\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"AndroidEmbeddedExternalSurface", "", "modifier", "Landroidx/compose/ui/Modifier;", "isOpaque", "", "surfaceSize", "Landroidx/compose/ui/unit/IntSize;", "transform", "Landroidx/compose/ui/graphics/Matrix;", "onInit", "Lkotlin/Function1;", "Landroidx/compose/foundation/AndroidExternalSurfaceScope;", "Lkotlin/ExtensionFunctionType;", "AndroidEmbeddedExternalSurface-sv6N_fY", "(Landroidx/compose/ui/Modifier;ZJ[FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "AndroidExternalSurface", "zOrder", "Landroidx/compose/foundation/AndroidExternalSurfaceZOrder;", "isSecure", "AndroidExternalSurface-58FFMhA", "(Landroidx/compose/ui/Modifier;ZJIZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "rememberAndroidEmbeddedExternalSurfaceState", "Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;", "rememberAndroidExternalSurfaceState", "Landroidx/compose/foundation/AndroidExternalSurfaceState;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/AndroidExternalSurfaceState;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidExternalSurface_androidKt {
    private static final AndroidExternalSurfaceState rememberAndroidExternalSurfaceState(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -873615933, "C(rememberAndroidExternalSurfaceState)189@7199L24,190@7235L47:AndroidExternalSurface.android.kt#71ulvw");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-873615933, $changed, -1, "androidx.compose.foundation.rememberAndroidExternalSurfaceState (AndroidExternalSurface.android.kt:188)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart($composer, -954203484, "CC(remember):Effects.kt#9igjgp");
        Object it$iv$iv = $composer.rememberedValue();
        if (it$iv$iv != Composer.Companion.getEmpty()) goto L9;
        Object value$iv$iv = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer);
        $composer.updateRememberedValue(value$iv$iv);
        it$iv$iv = value$iv$iv;
    L9:
        CoroutineScope scope = (CoroutineScope) it$iv$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, 1983764518, "CC(remember):AndroidExternalSurface.android.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L13;
        Object value$iv = new AndroidExternalSurfaceState(scope);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L13:
        AndroidExternalSurfaceState r3 = (AndroidExternalSurfaceState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
    L16:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r3;
    }

    /* JADX INFO: renamed from: AndroidExternalSurface-58FFMhA, reason: not valid java name */
    public static final void m229AndroidExternalSurface58FFMhA(Modifier modifier, boolean isOpaque, long surfaceSize, int zOrder, boolean isSecure, final Function1<? super AndroidExternalSurfaceScope, Unit> r29, Composer $composer, final int $changed, final int r32) {
        Composer $composer2 = $composer.startRestartGroup(640888974);
        ComposerKt.sourceInformation($composer2, "C(AndroidExternalSurface)P(2!1,4:c#ui.unit.IntSize,5:c#foundation.AndroidExternalSurfaceZOrder)276@12048L37,279@12122L150,287@12342L774,278@12091L1031:AndroidExternalSurface.android.kt#71ulvw");
        int $dirty = $changed;
        int r2 = r32 & 1;
        if (r2 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r3 = modifier;
    L13:
        int r4 = r32 & 2;
        if (r4 == 0) goto L17;
        $dirty = $dirty | 48;
        boolean isOpaque2 = isOpaque;
    L25:
        if (($changed & 384) == 0) goto L27;
        long surfaceSize2 = surfaceSize;
    L35:
        int r9 = r32 & 8;
        if (r9 == 0) goto L39;
        $dirty = $dirty | 3072;
        int zOrder2 = zOrder;
    L46:
        int r16 = r32 & 16;
        if (r16 == 0) goto L50;
        $dirty = $dirty | 24576;
        boolean isSecure2 = isSecure;
    L58:
        if ((r32 & 32) == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L67:
        boolean r22 = true;
        if (($dirty & 74899) == 74898) goto L70;
        boolean r5 = true;
    L72:
        if ($composer2.shouldExecute(r5, $dirty & 1) == false) goto L142;
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L76;
    L82:
        if (r2 == 0) goto L84;
        Modifier.Companion modifier2 = Modifier.Companion;
    L85:
        if (r4 == 0) goto L88;
        isOpaque2 = true;
    L88:
        if ((r32 & 4) == 0) goto L90;
        $dirty = $dirty & (-897);
        surfaceSize2 = IntSize.Companion.m7149getZeroYbymL2g();
    L90:
        if (r9 == 0) goto L92;
        zOrder2 = AndroidExternalSurfaceZOrder.Companion.m225getBehindB_4ceCc();
    L92:
        if (r16 == 0) goto L94;
        Modifier modifier3 = modifier2;
        isSecure2 = false;
    L95:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L98;
        ComposerKt.traceEventStart(640888974, $dirty, -1, "androidx.compose.foundation.AndroidExternalSurface (AndroidExternalSurface.android.kt:275)");
    L98:
        final AndroidExternalSurfaceState state = rememberAndroidExternalSurfaceState($composer2, 0);
        ComposerKt.sourceInformationMarkerStart($composer2, -1356113117, "CC(remember):AndroidExternalSurface.android.kt#9igjgp");
        if ((458752 & $dirty) != 131072) goto L101;
        boolean r6 = true;
    L102:
        boolean invalid$iv = r6 | $composer2.changedInstance(state);
        Object value$iv = $composer2.rememberedValue();
        if (invalid$iv == true) goto L109;
        if (value$iv == Composer.Companion.getEmpty()) goto L109;
    L110:
        Function1 r10 = (Function1) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        AndroidExternalSurface_androidKt$AndroidExternalSurface$2 r0 = AndroidExternalSurface_androidKt$AndroidExternalSurface$2.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, -1356105453, "CC(remember):AndroidExternalSurface.android.kt#9igjgp");
        if ((($dirty & 896) ^ 384) <= 256) goto L115;
        if ($composer2.changed(surfaceSize2) == false) goto L115;
    L116:
        boolean r7 = true;
    L119:
        if (($dirty & 112) != 32) goto L121;
        boolean r8 = true;
    L122:
        boolean r11 = r7 | r8;
        if (($dirty & 7168) != 2048) goto L125;
        boolean r12 = true;
    L126:
        boolean r13 = r11 | r12;
        if ((57344 & $dirty) == 16384) goto L130;
        r22 = false;
    L130:
        boolean invalid$iv2 = r13 | r22;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv2 == true) goto L136;
        int $dirty2 = $dirty;
        if (it$iv == Composer.Companion.getEmpty()) goto L137;
        boolean isOpaque3 = isOpaque2;
        long surfaceSize3 = surfaceSize2;
        boolean isSecure3 = isSecure2;
        int zOrder3 = zOrder2;
    L138:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        AndroidView_androidKt.AndroidView(r10, modifier3, r0, null, (Function1) it$iv, $composer2, (($dirty2 << 3) & 112) | 384, 8);
        if (ComposerKt.isTraceInProgress() == false) goto L141;
        ComposerKt.traceEventEnd();
    L141:
        final Modifier modifier4 = modifier3;
        final boolean isOpaque4 = isOpaque3;
        final long surfaceSize4 = surfaceSize3;
        final int zOrder4 = zOrder3;
        final boolean isSecure4 = isSecure3;
    L143:
        ScopeUpdateScope r14 = $composer2.endRestartGroup();
        if (r14 == null) goto L147;
        r14.updateScope(new AndroidExternalSurface_androidKt$AndroidExternalSurface$4(modifier4, isOpaque4, surfaceSize4, zOrder4, isSecure4, r29, $changed, r32));
        return;
    L147:
        return;
    L137:
        final boolean isOpaque5 = isOpaque2;
        final long surfaceSize5 = surfaceSize2;
        final boolean isSecure5 = isSecure2;
        final int zOrder5 = zOrder2;
        surfaceSize3 = surfaceSize5;
        isOpaque3 = isOpaque5;
        zOrder3 = zOrder5;
        isSecure3 = isSecure5;
        Object value$iv2 = (Function1) new AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1(surfaceSize5, isOpaque5, zOrder5, isSecure5);
        $composer2.updateRememberedValue(value$iv2);
        it$iv = value$iv2;
        goto L138
    L136:
        $dirty2 = $dirty;
        goto L137
    L125:
        r12 = false;
        goto L126
    L121:
        r8 = false;
    L115:
        if (($dirty & 384) == 256) goto L116;
        r7 = false;
    L109:
        value$iv = (Function1) new AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1(r29, state);
        $composer2.updateRememberedValue(value$iv);
        goto L110
    L101:
        r6 = false;
        goto L102
    L94:
        modifier3 = modifier2;
        goto L95
    L84:
        modifier2 = r3;
        goto L85
    L76:
        if ($composer2.getDefaultsInvalid() == true) goto L82;
        $composer2.skipToGroupEnd();
        if ((r32 & 4) == 0) goto L81;
        $dirty = $dirty & (-897);
    L81:
        modifier3 = r3;
        goto L95
    L142:
        $composer2.skipToGroupEnd();
        modifier4 = r3;
        isOpaque4 = isOpaque2;
        surfaceSize4 = surfaceSize2;
        isSecure4 = isSecure2;
        zOrder4 = zOrder2;
        goto L143
    L70:
        r5 = false;
        goto L72
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        if ($composer2.changedInstance(r29) == false) goto L65;
        int r18 = 131072;
    L66:
        $dirty = $dirty | r18;
        goto L67
    L65:
        r18 = 65536;
        goto L66
    L50:
        if (($changed & 24576) != 0) goto L56;
        isSecure2 = isSecure;
        if ($composer2.changed(isSecure2) == false) goto L54;
        int r19 = 16384;
    L55:
        $dirty = $dirty | r19;
        goto L58
    L54:
        r19 = 8192;
        goto L55
    L56:
        isSecure2 = isSecure;
        goto L58
    L39:
        if (($changed & 3072) != 0) goto L45;
        zOrder2 = zOrder;
        if ($composer2.changed(zOrder2) == false) goto L43;
        int r17 = 2048;
    L44:
        $dirty = $dirty | r17;
        goto L46
    L43:
        r17 = 1024;
        goto L44
    L45:
        zOrder2 = zOrder;
        goto L46
    L27:
        if ((r32 & 4) != 0) goto L31;
        surfaceSize2 = surfaceSize;
        if ($composer2.changed(surfaceSize2) == false) goto L32;
        int r15 = 256;
    L33:
        $dirty = $dirty | r15;
    L32:
        r15 = 128;
        goto L33
    L31:
        surfaceSize2 = surfaceSize;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L23;
        isOpaque2 = isOpaque;
        if ($composer2.changed(isOpaque2) == false) goto L21;
        int r20 = 32;
    L22:
        $dirty = $dirty | r20;
        goto L25
    L21:
        r20 = 16;
        goto L22
    L23:
        isOpaque2 = isOpaque;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L12;
        r3 = modifier;
        if ($composer2.changed(r3) == false) goto L10;
        int r21 = 4;
    L11:
        $dirty = $dirty | r21;
        goto L13
    L10:
        r21 = 2;
        goto L11
    L12:
        r3 = modifier;
        goto L13
    }

    private static final AndroidEmbeddedExternalSurfaceState rememberAndroidEmbeddedExternalSurfaceState(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1057437053, "C(rememberAndroidEmbeddedExternalSurfaceState)372@14916L24,373@14952L55:AndroidExternalSurface.android.kt#71ulvw");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1057437053, $changed, -1, "androidx.compose.foundation.rememberAndroidEmbeddedExternalSurfaceState (AndroidExternalSurface.android.kt:371)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart($composer, -954203484, "CC(remember):Effects.kt#9igjgp");
        Object it$iv$iv = $composer.rememberedValue();
        if (it$iv$iv != Composer.Companion.getEmpty()) goto L9;
        Object value$iv$iv = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer);
        $composer.updateRememberedValue(value$iv$iv);
        it$iv$iv = value$iv$iv;
    L9:
        CoroutineScope scope = (CoroutineScope) it$iv$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, 1142290424, "CC(remember):AndroidExternalSurface.android.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L13;
        Object value$iv = new AndroidEmbeddedExternalSurfaceState(scope);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L13:
        AndroidEmbeddedExternalSurfaceState r3 = (AndroidEmbeddedExternalSurfaceState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
    L16:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r3;
    }

    /* JADX INFO: renamed from: AndroidEmbeddedExternalSurface-sv6N_fY, reason: not valid java name */
    public static final void m228AndroidEmbeddedExternalSurfacesv6N_fY(Modifier modifier, boolean isOpaque, long surfaceSize, float[] transform, final Function1<? super AndroidExternalSurfaceScope, Unit> r28, Composer $composer, final int $changed, final int r31) {
        Composer $composer2 = $composer.startRestartGroup(217541314);
        ComposerKt.sourceInformation($composer2, "C(AndroidEmbeddedExternalSurface)P(1!1,3:c#ui.unit.IntSize,4:c#ui.graphics.Matrix)434@18616L45,440@18787L639,436@18667L765:AndroidExternalSurface.android.kt#71ulvw");
        int $dirty = $changed;
        int r2 = r31 & 1;
        if (r2 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r3 = modifier;
    L13:
        int r4 = r31 & 2;
        if (r4 == 0) goto L17;
        $dirty = $dirty | 48;
        boolean r6 = isOpaque;
    L25:
        if (($changed & 384) == 0) goto L27;
        long surfaceSize2 = surfaceSize;
    L35:
        int r8 = r31 & 8;
        if (r8 == 0) goto L39;
        $dirty = $dirty | 3072;
    L49:
        if ((r31 & 16) == 0) goto L52;
        $dirty = $dirty | 24576;
        Function1<? super AndroidExternalSurfaceScope, Unit> r14 = r28;
    L59:
        boolean r15 = false;
        if (($dirty & 9363) == 9362) goto L62;
        boolean r5 = true;
    L64:
        if ($composer2.shouldExecute(r5, $dirty & 1) == false) goto L119;
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L68;
    L74:
        if (r2 == 0) goto L76;
        Modifier.Companion modifier2 = Modifier.Companion;
    L77:
        if (r4 == 0) goto L79;
        boolean isOpaque2 = true;
    L81:
        if ((r31 & 4) == 0) goto L83;
        $dirty = $dirty & (-897);
        surfaceSize2 = IntSize.Companion.m7149getZeroYbymL2g();
    L83:
        if (r8 == 0) goto L85;
        final boolean isOpaque3 = isOpaque2;
        final float[] transform2 = null;
    L86:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L89;
        ComposerKt.traceEventStart(217541314, $dirty, -1, "androidx.compose.foundation.AndroidEmbeddedExternalSurface (AndroidExternalSurface.android.kt:433)");
    L89:
        final AndroidEmbeddedExternalSurfaceState state = rememberAndroidEmbeddedExternalSurfaceState($composer2, 0);
        AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1 r9 = AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1.INSTANCE;
        AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$2 r7 = AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$2.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, 184044994, "CC(remember):AndroidExternalSurface.android.kt#9igjgp");
        if ((($dirty & 896) ^ 384) <= 256) goto L94;
        if ($composer2.changed(surfaceSize2) == false) goto L94;
    L95:
        boolean r10 = true;
    L97:
        boolean r11 = r10 | $composer2.changedInstance(state);
        if ((57344 & $dirty) != 16384) goto L100;
        boolean r12 = true;
    L101:
        boolean r13 = r11 | r12;
        if (($dirty & 112) != 32) goto L104;
        r15 = true;
    L104:
        boolean r16 = r13 | r15;
        if (transform2 == null) goto L107;
        Object r17 = Matrix.m4594boximpl(transform2);
    L108:
        boolean invalid$iv = r16 | $composer2.changedInstance(r17);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L111;
    L114:
        final long surfaceSize3 = surfaceSize2;
        final Function1<? super AndroidExternalSurfaceScope, Unit> r20 = r14;
        Object value$iv = (Function1) new AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3$1(surfaceSize3, state, r20, isOpaque3, transform2);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L115:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier modifier3 = modifier2;
        AndroidView_androidKt.AndroidView(r9, modifier3, r7, null, (Function1) it$iv, $composer2, (($dirty << 3) & 112) | 390, 8);
        if (ComposerKt.isTraceInProgress() == false) goto L118;
        ComposerKt.traceEventEnd();
    L118:
        final Modifier modifier4 = modifier3;
        final long surfaceSize4 = surfaceSize3;
        final boolean isOpaque4 = isOpaque3;
        final float[] transform3 = transform2;
    L120:
        ScopeUpdateScope r18 = $composer2.endRestartGroup();
        if (r18 == null) goto L124;
        r18.updateScope(new AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$4(modifier4, isOpaque4, surfaceSize4, transform3, r28, $changed, r31));
        return;
    L124:
        return;
    L111:
        if (it$iv == Composer.Companion.getEmpty()) goto L114;
        surfaceSize3 = surfaceSize2;
        goto L115
    L107:
        r17 = null;
        goto L108
    L100:
        r12 = false;
    L94:
        if (($dirty & 384) == 256) goto L95;
        r10 = false;
        goto L97
    L85:
        transform2 = transform;
        isOpaque3 = isOpaque2;
        goto L86
    L79:
        isOpaque2 = r6;
        goto L81
    L76:
        modifier2 = r3;
        goto L77
    L68:
        if ($composer2.getDefaultsInvalid() == true) goto L74;
        $composer2.skipToGroupEnd();
        if ((r31 & 4) == 0) goto L73;
        $dirty = $dirty & (-897);
    L73:
        transform2 = transform;
        modifier2 = r3;
        isOpaque3 = r6;
        goto L86
    L119:
        $composer2.skipToGroupEnd();
        transform3 = transform;
        modifier4 = r3;
        isOpaque4 = r6;
        surfaceSize4 = surfaceSize2;
        goto L120
    L62:
        r5 = false;
        goto L64
    L52:
        if (($changed & 24576) != 0) goto L58;
        r14 = r28;
        if ($composer2.changedInstance(r14) == false) goto L56;
        int r19 = 16384;
    L57:
        $dirty = $dirty | r19;
        goto L59
    L56:
        r19 = 8192;
        goto L57
    L58:
        r14 = r28;
        goto L59
    L39:
        if (($changed & 3072) != 0) goto L49;
        if (transform == null) goto L42;
        Object r110 = Matrix.m4594boximpl(transform);
    L44:
        if ($composer2.changedInstance(r110) == false) goto L46;
        int r111 = 2048;
    L47:
        $dirty = $dirty | r111;
        goto L49
    L46:
        r111 = 1024;
        goto L47
    L42:
        r110 = null;
        goto L44
    L27:
        if ((r31 & 4) != 0) goto L31;
        surfaceSize2 = surfaceSize;
        if ($composer2.changed(surfaceSize2) == false) goto L32;
        int r21 = 256;
    L33:
        $dirty = $dirty | r21;
    L32:
        r21 = 128;
        goto L33
    L31:
        surfaceSize2 = surfaceSize;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L23;
        r6 = isOpaque;
        if ($composer2.changed(r6) == false) goto L21;
        int r22 = 32;
    L22:
        $dirty = $dirty | r22;
        goto L25
    L21:
        r22 = 16;
        goto L22
    L23:
        r6 = isOpaque;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L12;
        r3 = modifier;
        if ($composer2.changed(r3) == false) goto L10;
        int r23 = 4;
    L11:
        $dirty = $dirty | r23;
        goto L13
    L10:
        r23 = 2;
        goto L11
    L12:
        r3 = modifier;
        goto L13
    }
}
