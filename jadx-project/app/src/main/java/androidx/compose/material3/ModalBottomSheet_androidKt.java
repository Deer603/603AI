package androidx.compose.material3;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: ModalBottomSheet.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a¹\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u0018¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001aJ\u0010\u001d\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f2\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0012H\u0001¢\u0006\u0002\u0010\"\u001a\f\u0010#\u001a\u00020$*\u00020%H\u0000\u001a\u0014\u0010&\u001a\u00020$*\u00020'2\u0006\u0010(\u001a\u00020$H\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)²\u0006\u0015\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0012X\u008a\u0084\u0002"}, d2 = {"ModalBottomSheet", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "sheetState", "Landroidx/compose/material3/SheetState;", "sheetMaxWidth", "Landroidx/compose/ui/unit/Dp;", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "tonalElevation", "scrimColor", "dragHandle", "Landroidx/compose/runtime/Composable;", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "properties", "Landroidx/compose/material3/ModalBottomSheetProperties;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "ModalBottomSheet-dYc4hso", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFJLkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/ModalBottomSheetProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "ModalBottomSheetDialog", "predictiveBackProgress", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/ModalBottomSheetProperties;Landroidx/compose/animation/core/Animatable;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "isFlagSecureEnabled", "", "Landroid/view/View;", "shouldApplySecureFlag", "Landroidx/compose/ui/window/SecureFlagPolicy;", "isSecureFlagSetOnParent", "material3_release", "currentContent"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ModalBottomSheet_androidKt {

    /* JADX INFO: compiled from: ModalBottomSheet.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[SecureFlagPolicy.values().length];
            r0[SecureFlagPolicy.SecureOff.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L14:
            r0[SecureFlagPolicy.SecureOn.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L16:
            r0[SecureFlagPolicy.Inherit.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L12:
            $EnumSwitchMapping$0 = r0;
        }
    }

    public static final /* synthetic */ Function2 access$ModalBottomSheetDialog$lambda$0(State $currentContent$delegate) {
        return ModalBottomSheetDialog$lambda$0($currentContent$delegate);
    }

    public static final /* synthetic */ boolean access$shouldApplySecureFlag(SecureFlagPolicy $receiver, boolean isSecureFlagSetOnParent) {
        return shouldApplySecureFlag($receiver, isSecureFlagSetOnParent);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use constructor with contentWindowInsets parameter.", replaceWith = @ReplaceWith(expression = "ModalBottomSheet(onDismissRequest,modifier,sheetState,sheetMaxWidth,shape,containerColor,contentColor,tonalElevation,scrimColor,dragHandle,{ windowInsets },properties,content,)", imports = {}))
    /* JADX INFO: renamed from: ModalBottomSheet-dYc4hso, reason: not valid java name */
    public static final /* synthetic */ void m2375ModalBottomSheetdYc4hso(final Function0 onDismissRequest, Modifier modifier, SheetState sheetState, float sheetMaxWidth, Shape shape, long containerColor, long contentColor, float tonalElevation, long scrimColor, Function2 dragHandle, WindowInsets windowInsets, ModalBottomSheetProperties properties, final Function3 content, Composer $composer, final int $changed, final int $changed1, final int r47) {
        Composer $composer2 = $composer.startRestartGroup(944867294);
        ComposerKt.sourceInformation($composer2, "C(ModalBottomSheet)P(5,4,10,9:c#ui.unit.Dp,8,0:c#ui.graphics.Color,2:c#ui.graphics.Color,11:c#ui.unit.Dp,7:c#ui.graphics.Color,3,12,6)235@10240L31,237@10371L13,238@10434L14,239@10476L31,241@10584L10,243@10731L12,247@10884L485:ModalBottomSheet.android.kt#uh7d8r");
        int $dirty = $changed;
        if ((r47 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        int r10 = r47 & 2;
        if (r10 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        int r16 = 256;
        if (($changed & 384) == 0) goto L27;
        SheetState sheetState2 = sheetState;
    L35:
        int r17 = r47 & 8;
        if (r17 == 0) goto L39;
        $dirty = $dirty | 3072;
        float r8 = sheetMaxWidth;
    L47:
        if (($changed & 24576) == 0) goto L49;
        Shape r9 = shape;
    L58:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) goto L60;
        long r11 = containerColor;
    L69:
        if (($changed & 1572864) == 0) goto L71;
        int $dirty2 = $dirty;
        int $dirty1 = $changed1;
    L79:
        int r15 = r47 & 128;
        if (r15 == 0) goto L83;
        $dirty2 = $dirty2 | 12582912;
    L91:
        if (($changed & 100663296) != 0) goto L101;
        if ((r47 & 256) != 0) goto L98;
        if ($composer2.changed(scrimColor) == false) goto L98;
        int r0 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty2 = $dirty2 | r0;
    L98:
        r0 = 33554432;
    L101:
        int $dirty3 = r47 & 512;
        if ($dirty3 == 0) goto L105;
        $dirty2 = $dirty2 | 805306368;
    L112:
        int $dirty4 = $dirty2;
        if (($changed1 & 6) == 0) goto L115;
        int $dirty5 = $dirty1;
    L123:
        int $dirty6 = r47 & 2048;
        if ($dirty6 == 0) goto L127;
        $dirty5 = $dirty5 | 48;
    L134:
        int $dirty7 = $dirty5;
        if ((r47 & 4096) == 0) goto L138;
        $dirty7 = $dirty7 | 384;
        Function3 r5 = content;
    L146:
        if ((306783379 & $dirty4) == 306783378) goto L148;
    L153:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L156;
    L177:
        if (r10 == 0) goto L180;
        modifier2 = Modifier.Companion;
    L180:
        if ((r47 & 4) == 0) goto L183;
        $dirty4 = $dirty4 & (-897);
        sheetState2 = ModalBottomSheetKt.rememberModalBottomSheetState(false, null, $composer2, 0, 3);
    L183:
        if (r17 == 0) goto L185;
        float sheetMaxWidth2 = BottomSheetDefaults.INSTANCE.m1920getSheetMaxWidthD9Ej5fM();
    L187:
        if ((r47 & 16) == 0) goto L189;
        Shape shape2 = BottomSheetDefaults.INSTANCE.getExpandedShape($composer2, 6);
        $dirty4 = $dirty4 & (-57345);
    L191:
        if ((r47 & 32) == 0) goto L193;
        long containerColor2 = BottomSheetDefaults.INSTANCE.getContainerColor($composer2, 6);
        $dirty4 = $dirty4 & (-458753);
    L195:
        if ((r47 & 64) == 0) goto L197;
        long contentColor2 = ColorSchemeKt.m2057contentColorForek8zF_U(containerColor2, $composer2, ($dirty4 >> 15) & 14);
        $dirty4 = $dirty4 & (-3670017);
    L198:
        if (r15 == 0) goto L200;
        float tonalElevation2 = Dp.m6973constructorimpl(0);
    L202:
        if ((r47 & 256) == 0) goto L204;
        long scrimColor2 = BottomSheetDefaults.INSTANCE.getScrimColor($composer2, 6);
        $dirty4 = $dirty4 & (-234881025);
    L205:
        if ($dirty3 == 0) goto L207;
        Function2 dragHandle2 = ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m2099getLambda1$material3_release();
    L208:
        int $dirty8 = $dirty4;
        if ((r47 & 1024) == 0) goto L211;
        WindowInsets windowInsets2 = BottomSheetDefaults.INSTANCE.getWindowInsets($composer2, 6);
        $dirty7 = $dirty7 & (-15);
    L212:
        if ($dirty6 == 0) goto L214;
        float sheetMaxWidth3 = sheetMaxWidth2;
        ModalBottomSheetProperties properties2 = ModalBottomSheetDefaults.INSTANCE.getProperties();
        float tonalElevation3 = tonalElevation2;
        final WindowInsets windowInsets3 = windowInsets2;
        int $dirty9 = $dirty7;
        Shape shape3 = shape2;
        SheetState sheetState3 = sheetState2;
        long scrimColor3 = scrimColor2;
        Function2 dragHandle3 = dragHandle2;
        int $dirty10 = $dirty8;
    L215:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L219;
        ComposerKt.traceEventStart(944867294, $dirty10, $dirty9, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:247)");
    L219:
        Function3 r19 = r5;
        Modifier modifier3 = modifier2;
        float tonalElevation4 = tonalElevation3;
        ModalBottomSheetKt.m2369ModalBottomSheetdYc4hso(onDismissRequest, modifier3, sheetState3, sheetMaxWidth3, shape3, containerColor2, contentColor2, tonalElevation4, scrimColor3, dragHandle3, new ModalBottomSheet_androidKt$ModalBottomSheet$1(windowInsets3), properties2, r19, $composer2, ((((((((($dirty10 & 14) | ($dirty10 & 112)) | ($dirty10 & 896)) | ($dirty10 & 7168)) | (57344 & $dirty10)) | (458752 & $dirty10)) | (3670016 & $dirty10)) | (29360128 & $dirty10)) | (234881024 & $dirty10)) | (1879048192 & $dirty10), ($dirty9 & 112) | ($dirty9 & 896), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L222;
        ComposerKt.traceEventEnd();
    L222:
        final Modifier modifier4 = modifier3;
        final SheetState sheetState4 = sheetState3;
        final float sheetMaxWidth4 = sheetMaxWidth3;
        final Shape shape4 = shape3;
        final long containerColor3 = containerColor2;
        final long contentColor3 = contentColor2;
        final float tonalElevation5 = tonalElevation4;
        final long contentColor4 = scrimColor3;
        final Function2 dragHandle4 = dragHandle3;
        final ModalBottomSheetProperties properties3 = properties2;
        final WindowInsets windowInsets4 = windowInsets3;
    L223:
        ScopeUpdateScope r1 = $composer2.endRestartGroup();
        if (r1 == null) goto L227;
        r1.updateScope(new ModalBottomSheet_androidKt$ModalBottomSheet$2(onDismissRequest, modifier4, sheetState4, sheetMaxWidth4, shape4, containerColor3, contentColor3, tonalElevation5, contentColor4, dragHandle4, windowInsets4, properties3, content, $changed, $changed1, r47));
        return;
    L227:
        return;
    L214:
        sheetMaxWidth3 = sheetMaxWidth2;
        properties2 = properties;
        windowInsets3 = windowInsets2;
        $dirty9 = $dirty7;
        tonalElevation3 = tonalElevation2;
        $dirty10 = $dirty8;
        shape3 = shape2;
        sheetState3 = sheetState2;
        scrimColor3 = scrimColor2;
        dragHandle3 = dragHandle2;
        goto L215
    L211:
        windowInsets2 = windowInsets;
        goto L212
    L207:
        dragHandle2 = dragHandle;
        goto L208
    L204:
        scrimColor2 = scrimColor;
        goto L205
    L200:
        tonalElevation2 = tonalElevation;
        goto L202
    L197:
        contentColor2 = contentColor;
        goto L198
    L193:
        containerColor2 = r11;
        goto L195
    L189:
        shape2 = r9;
        goto L191
    L185:
        sheetMaxWidth2 = r8;
        goto L187
    L156:
        if ($composer2.getDefaultsInvalid() == true) goto L177;
        $composer2.skipToGroupEnd();
        if ((r47 & 4) == 0) goto L162;
        $dirty4 = $dirty4 & (-897);
    L162:
        if ((r47 & 16) == 0) goto L165;
        $dirty4 = $dirty4 & (-57345);
    L165:
        if ((r47 & 32) == 0) goto L168;
        $dirty4 = $dirty4 & (-458753);
    L168:
        if ((r47 & 64) == 0) goto L171;
        $dirty4 = $dirty4 & (-3670017);
    L171:
        if ((r47 & 256) == 0) goto L174;
        $dirty4 = $dirty4 & (-234881025);
    L174:
        if ((r47 & 1024) == 0) goto L176;
        int r2 = $dirty7 & (-15);
        tonalElevation3 = tonalElevation;
        dragHandle3 = dragHandle;
        properties2 = properties;
        $dirty10 = $dirty4;
        $dirty9 = r2;
        sheetMaxWidth3 = r8;
        shape3 = r9;
        containerColor2 = r11;
        sheetState3 = sheetState2;
        contentColor2 = contentColor;
        scrimColor3 = scrimColor;
        windowInsets3 = windowInsets;
        goto L215
    L176:
        int r29 = $dirty7;
        $dirty10 = $dirty4;
        $dirty9 = r29;
        tonalElevation3 = tonalElevation;
        dragHandle3 = dragHandle;
        windowInsets3 = windowInsets;
        properties2 = properties;
        sheetMaxWidth3 = r8;
        shape3 = r9;
        containerColor2 = r11;
        sheetState3 = sheetState2;
        contentColor2 = contentColor;
        scrimColor3 = scrimColor;
        goto L215
    L148:
        if (($dirty7 & 147) != 146) goto L153;
        if ($composer2.getSkipping() == false) goto L153;
        $composer2.skipToGroupEnd();
        tonalElevation5 = tonalElevation;
        properties3 = properties;
        $composer2 = $composer2;
        sheetMaxWidth4 = r8;
        shape4 = r9;
        containerColor3 = r11;
        modifier4 = modifier2;
        sheetState4 = sheetState2;
        contentColor3 = contentColor;
        contentColor4 = scrimColor;
        dragHandle4 = dragHandle;
        windowInsets4 = windowInsets;
        goto L223
    L138:
        if (($changed1 & 384) != 0) goto L144;
        r5 = content;
        if ($composer2.changedInstance(r5) == true) goto L143;
        r16 = 128;
    L143:
        $dirty7 = $dirty7 | r16;
        goto L146
    L144:
        r5 = content;
        goto L146
    L127:
        if (($changed1 & 48) != 0) goto L134;
        if ($composer2.changed(properties) == false) goto L131;
        int r110 = 32;
    L132:
        $dirty5 = $dirty5 | r110;
        goto L134
    L131:
        r110 = 16;
        goto L132
    L115:
        if ((r47 & 1024) != 0) goto L120;
        if ($composer2.changed(windowInsets) == false) goto L120;
        int r18 = 4;
    L121:
        $dirty5 = $dirty1 | r18;
    L120:
        r18 = 2;
        goto L121
    L105:
        if (($changed & 805306368) != 0) goto L112;
        if ($composer2.changedInstance(dragHandle) == false) goto L109;
        int r26 = 536870912;
    L110:
        $dirty2 = $dirty2 | r26;
        goto L112
    L109:
        r26 = 268435456;
        goto L110
    L83:
        if (($changed & 12582912) != 0) goto L91;
        if ($composer2.changed(tonalElevation) == false) goto L87;
        int r25 = 8388608;
    L88:
        $dirty2 = $dirty2 | r25;
        goto L91
    L87:
        r25 = 4194304;
        goto L88
    L71:
        if ((r47 & 64) != 0) goto L75;
        int $dirty11 = $dirty;
        $dirty1 = $changed1;
        if ($composer2.changed(contentColor) == false) goto L76;
        int r23 = 1048576;
    L77:
        $dirty2 = $dirty11 | r23;
    L76:
        r23 = 524288;
        goto L77
    L75:
        $dirty11 = $dirty;
        $dirty1 = $changed1;
        goto L76
    L60:
        if ((r47 & 32) != 0) goto L64;
        r11 = containerColor;
        if ($composer2.changed(r11) == false) goto L65;
        int r21 = 131072;
    L66:
        $dirty = $dirty | r21;
    L65:
        r21 = 65536;
        goto L66
    L64:
        r11 = containerColor;
        goto L65
    L49:
        if ((r47 & 16) != 0) goto L53;
        r9 = shape;
        if ($composer2.changed(r9) == false) goto L54;
        int r111 = 16384;
    L55:
        $dirty = $dirty | r111;
    L54:
        r111 = 8192;
        goto L55
    L53:
        r9 = shape;
        goto L54
    L39:
        if (($changed & 3072) != 0) goto L45;
        r8 = sheetMaxWidth;
        if ($composer2.changed(r8) == false) goto L43;
        int r112 = 2048;
    L44:
        $dirty = $dirty | r112;
        goto L47
    L43:
        r112 = 1024;
        goto L44
    L45:
        r8 = sheetMaxWidth;
        goto L47
    L27:
        if ((r47 & 4) != 0) goto L31;
        sheetState2 = sheetState;
        if ($composer2.changed(sheetState2) == false) goto L32;
        int r113 = 256;
    L33:
        $dirty = $dirty | r113;
    L32:
        r113 = 128;
        goto L33
    L31:
        sheetState2 = sheetState;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L23;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L21;
        int r14 = 32;
    L22:
        $dirty = $dirty | r14;
        goto L24
    L21:
        r14 = 16;
        goto L22
    L23:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changedInstance(onDismissRequest) == false) goto L10;
        int r12 = 4;
    L11:
        $dirty = $dirty | r12;
        goto L13
    L10:
        r12 = 2;
        goto L11
    }

    public static final void ModalBottomSheetDialog(Function0<Unit> r28, ModalBottomSheetProperties properties, final Animatable<Float, AnimationVector1D> r30, final Function2<? super Composer, ? super Integer, Unit> r31, Composer $composer, final int $changed) {
        final Function0<Unit> r1 = r28;
        final ModalBottomSheetProperties r2 = properties;
        Composer $composer2 = $composer.startRestartGroup(1254951810);
        ComposerKt.sourceInformation($composer2, "C(ModalBottomSheetDialog)P(1,3,2)273@11822L7,274@11861L7,275@11916L7,276@11946L28,277@12001L29,278@12050L38,279@12105L24,280@12157L21,282@12204L697,305@12932L129,305@12907L154,314@13078L182,314@13067L193:ModalBottomSheet.android.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(r1) == false) goto L7;
        int r6 = 4;
    L8:
        $dirty = $dirty | r6;
        goto L10
    L7:
        r6 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changed(r2) == false) goto L14;
        int r7 = 32;
    L15:
        $dirty = $dirty | r7;
        goto L17
    L14:
        r7 = 16;
    L17:
        if (($changed & 384) != 0) goto L27;
        if (($changed & 512) != 0) goto L21;
        boolean r8 = $composer2.changed(r30);
    L22:
        if (r8 == false) goto L24;
        int r9 = 256;
    L25:
        $dirty = $dirty | r9;
        goto L27
    L24:
        r9 = 128;
        goto L25
    L21:
        r8 = $composer2.changedInstance(r30);
    L27:
        if (($changed & 3072) != 0) goto L34;
        if ($composer2.changedInstance(r31) == false) goto L31;
        int r10 = 2048;
    L32:
        $dirty = $dirty | r10;
        goto L34
    L31:
        r10 = 1024;
    L34:
        if (($dirty & 1171) != 1170) goto L40;
        if ($composer2.getSkipping() == false) goto L40;
        $composer2.skipToGroupEnd();
        Composer $composer3 = $composer2;
    L79:
        ScopeUpdateScope r11 = $composer3.endRestartGroup();
        if (r11 == null) goto L83;
        r11.updateScope(new AnonymousClass3(r1, r2, r30, r31, $changed));
        return;
    L83:
        return;
    L40:
        if (ComposerKt.isTraceInProgress() == false) goto L42;
        ComposerKt.traceEventStart(1254951810, $dirty, -1, "androidx.compose.material3.ModalBottomSheetDialog (ModalBottomSheet.android.kt:272)");
    L42:
        ProvidableCompositionLocal<View> r0 = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r14 = $composer2.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        View view = (View) r14;
        ProvidableCompositionLocal<Density> r12 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r15 = $composer2.consume(r12);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Density density = (Density) r15;
        ProvidableCompositionLocal<LayoutDirection> r13 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r16 = $composer2.consume(r13);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final LayoutDirection layoutDirection = (LayoutDirection) r16;
        CompositionContext composition = ComposablesKt.rememberCompositionContext($composer2, 0);
        final State currentContent$delegate = SnapshotStateKt.rememberUpdatedState(r31, $composer2, ($dirty >> 9) & 14);
        $composer3 = $composer2;
        UUID dialogId = (UUID) RememberSaveableKt.m3923rememberSaveable(new Object[0], null, null, ModalBottomSheet_androidKt$ModalBottomSheetDialog$dialogId$1.INSTANCE, $composer2, 3072, 6);
        ComposerKt.sourceInformationMarkerStart($composer3, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart($composer3, -954363344, "CC(remember):Effects.kt#9igjgp");
        Object it$iv$iv = $composer3.rememberedValue();
        if (it$iv$iv != Composer.Companion.getEmpty()) goto L45;
        Object value$iv$iv = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer3));
        $composer3.updateRememberedValue(value$iv$iv);
    L46:
        CompositionScopedCoroutineScopeCanceller wrapper$iv = (CompositionScopedCoroutineScopeCanceller) value$iv$iv;
        ComposerKt.sourceInformationMarkerEnd($composer3);
        CoroutineScope scope = wrapper$iv.getCoroutineScope();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        boolean darkThemeEnabled = DarkThemeKt.isSystemInDarkTheme($composer3, 0);
        ComposerKt.sourceInformationMarkerStart($composer3, -1981517173, "CC(remember):ModalBottomSheet.android.kt#9igjgp");
        boolean invalid$iv = $composer3.changed(view) | $composer3.changed(density);
        Object it$iv = $composer3.rememberedValue();
        if (invalid$iv == false) goto L49;
    L52:
        Density density2 = density;
        r1 = r28;
        r2 = properties;
        ModalBottomSheetDialogWrapper $this$ModalBottomSheetDialog_u24lambda_u242_u24lambda_u241 = new ModalBottomSheetDialogWrapper(r1, r2, view, layoutDirection, density2, dialogId, r30, scope, darkThemeEnabled);
        $this$ModalBottomSheetDialog_u24lambda_u242_u24lambda_u241.setContent(composition, ComposableLambdaKt.composableLambdaInstance(-1560960657, true, new ModalBottomSheet_androidKt$ModalBottomSheetDialog$dialog$1$1$1(currentContent$delegate)));
        Object value$iv = $this$ModalBottomSheetDialog_u24lambda_u242_u24lambda_u241;
        $composer3.updateRememberedValue(value$iv);
    L53:
        final ModalBottomSheetDialogWrapper dialog = (ModalBottomSheetDialogWrapper) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerStart($composer3, -1981494445, "CC(remember):ModalBottomSheet.android.kt#9igjgp");
        boolean invalid$iv2 = $composer3.changedInstance(dialog);
        Object value$iv2 = $composer3.rememberedValue();
        if (invalid$iv2 == true) goto L60;
        if (value$iv2 == Composer.Companion.getEmpty()) goto L60;
    L61:
        ComposerKt.sourceInformationMarkerEnd($composer3);
        EffectsKt.DisposableEffect(dialog, (Function1) value$iv2, $composer3, 0);
        ComposerKt.sourceInformationMarkerStart($composer3, -1981489720, "CC(remember):ModalBottomSheet.android.kt#9igjgp");
        boolean r3 = $composer3.changedInstance(dialog);
        if (($dirty & 14) != 4) goto L64;
        boolean r5 = true;
    L65:
        boolean r4 = r3 | r5;
        if (($dirty & 112) != 32) goto L68;
        boolean r25 = true;
    L69:
        boolean invalid$iv3 = (r4 | r25) | $composer3.changed(layoutDirection);
        Object it$iv2 = $composer3.rememberedValue();
        if (invalid$iv3 == false) goto L72;
    L75:
        Object value$iv3 = (Function0) new ModalBottomSheet_androidKt$ModalBottomSheetDialog$2$1(dialog, r1, r2, layoutDirection);
        $composer3.updateRememberedValue(value$iv3);
    L76:
        ComposerKt.sourceInformationMarkerEnd($composer3);
        EffectsKt.SideEffect((Function0) value$iv3, $composer3, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L79;
        ComposerKt.traceEventEnd();
        goto L79
    L72:
        if (it$iv2 == Composer.Companion.getEmpty()) goto L75;
        value$iv3 = it$iv2;
        goto L76
    L68:
        r25 = false;
        goto L69
    L64:
        r5 = false;
    L60:
        value$iv2 = (Function1) new ModalBottomSheet_androidKt$ModalBottomSheetDialog$1$1(dialog);
        $composer3.updateRememberedValue(value$iv2);
        goto L61
    L49:
        if (it$iv == Composer.Companion.getEmpty()) goto L52;
        density2 = density;
        value$iv = it$iv;
        r1 = r28;
        r2 = properties;
        goto L53
    L45:
        value$iv$iv = it$iv$iv;
        goto L46
    }

    private static final Function2<Composer, Integer, Unit> ModalBottomSheetDialog$lambda$0(State<? extends Function2<? super Composer, ? super Integer, Unit>> r4) {
        Object thisObj$iv = r4.getValue();
        return (Function2) thisObj$iv;
    }

    public static final boolean isFlagSecureEnabled(View $this$isFlagSecureEnabled) {
        ViewGroup.LayoutParams r0 = $this$isFlagSecureEnabled.getRootView().getLayoutParams();
        if ((r0 instanceof WindowManager.LayoutParams) == false) goto L5;
        WindowManager.LayoutParams windowParams = (WindowManager.LayoutParams) r0;
    L7:
        if (windowParams != null) goto L9;
        return false;
    L9:
        if ((windowParams.flags & 8192) == 0) goto L13;
        return true;
    L13:
        return false;
    L5:
        windowParams = null;
        goto L7
    }

    private static final boolean shouldApplySecureFlag(SecureFlagPolicy $this$shouldApplySecureFlag, boolean isSecureFlagSetOnParent) {
        switch(WhenMappings.$EnumSwitchMapping$0[$this$shouldApplySecureFlag.ordinal()]) {
            case 1: goto L8;
            case 2: goto L7;
            case 3: goto L10;
            default: goto L5;
        };
    L7:
        return true;
    L8:
        return false;
    L5:
        throw new NoWhenBranchMatchedException();
    L10:
        return isSecureFlagSetOnParent;
    }
}
