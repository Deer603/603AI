package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.DropdownMenuPositionProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: AndroidMenu.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001an\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00012\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u0012¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a¢\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u0012¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001ad\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00012\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u0012¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u0090\u0001\u0010%\u001a\u00020\u00052\u0011\u0010&\u001a\r\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0002\b\u00142\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0015\b\u0002\u0010(\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t¢\u0006\u0002\b\u00142\b\b\u0002\u0010*\u001a\u00020\u00072\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020.2\n\b\u0002\u0010/\u001a\u0004\u0018\u000100H\u0007¢\u0006\u0002\u00101\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"DefaultMenuProperties", "Landroidx/compose/ui/window/PopupProperties;", "getDefaultMenuProperties", "()Landroidx/compose/ui/window/PopupProperties;", "DropdownMenu", "", "expanded", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "offset", "Landroidx/compose/ui/unit/DpOffset;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "properties", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "DropdownMenu-4kj-_NE", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/ScrollState;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "tonalElevation", "Landroidx/compose/ui/unit/Dp;", "shadowElevation", androidx.compose.material.OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "DropdownMenu-IlH_yew", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/ScrollState;Landroidx/compose/ui/window/PopupProperties;Landroidx/compose/ui/graphics/Shape;JFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "DropdownMenu-ILWXrKs", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DropdownMenuItem", "text", "onClick", "leadingIcon", "trailingIcon", "enabled", "colors", "Landroidx/compose/material3/MenuItemColors;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/MenuItemColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AndroidMenu_androidKt {
    private static final PopupProperties DefaultMenuProperties = null;

    /* JADX INFO: renamed from: DropdownMenu-IlH_yew, reason: not valid java name */
    public static final void m1892DropdownMenuIlH_yew(final boolean expanded, final Function0<Unit> r41, Modifier modifier, long offset, ScrollState scrollState, PopupProperties properties, Shape shape, long containerColor, float tonalElevation, float shadowElevation, BorderStroke border, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r53, Composer $composer, final int $changed, final int $changed1, final int r57) {
        Composer $composer2 = $composer.startRestartGroup(1431928300);
        ComposerKt.sourceInformation($composer2, "C(DropdownMenu)P(3,6,4,5:c#ui.unit.DpOffset,8,7,10,1:c#ui.graphics.Color,11:c#ui.unit.Dp,9:c#ui.unit.Dp)182@6555L21,185@6667L5,187@6715L14,55@2073L42,59@2260L51,60@2347L7,62@2403L251,72@2825L494,68@2664L655:AndroidMenu.android.kt#uh7d8r");
        int $dirty = $changed;
        if ((r57 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        boolean r5 = expanded;
    L14:
        if ((r57 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Function0<Unit> r8 = r41;
    L24:
        int r11 = r57 & 4;
        if (r11 == 0) goto L28;
        $dirty = $dirty | 384;
        Modifier r12 = modifier;
    L35:
        int r13 = r57 & 8;
        if (r13 == 0) goto L39;
        $dirty = $dirty | 3072;
        long offset2 = offset;
    L47:
        if (($changed & 24576) == 0) goto L49;
        final ScrollState scrollState2 = scrollState;
    L57:
        int r18 = r57 & 32;
        if (r18 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        PopupProperties properties2 = properties;
    L69:
        if (($changed & 1572864) == 0) goto L71;
        Shape r7 = shape;
    L80:
        if (($changed & 12582912) == 0) goto L82;
        int $dirty2 = $dirty;
        int $dirty1 = $changed1;
    L90:
        int $dirty3 = $dirty1;
        int $dirty4 = r57 & 256;
        if ($dirty4 == 0) goto L94;
        $dirty2 = $dirty2 | 100663296;
    L101:
        int $dirty5 = r57 & 512;
        if ($dirty5 == 0) goto L105;
        $dirty2 = $dirty2 | 805306368;
    L112:
        int $dirty6 = r57 & 1024;
        if ($dirty6 == 0) goto L116;
        $dirty3 = $dirty3 | 6;
    L124:
        if ((r57 & 2048) == 0) goto L127;
        $dirty3 = $dirty3 | 48;
    L134:
        int $dirty7 = $dirty3;
        if (($dirty2 & 306783379) == 306783378) goto L137;
    L142:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L145;
    L157:
        if (r11 == 0) goto L159;
        Modifier.Companion modifier2 = Modifier.Companion;
    L160:
        if (r13 == 0) goto L163;
        offset2 = DpKt.m6994DpOffsetYgX7TsA(Dp.m6973constructorimpl(0), Dp.m6973constructorimpl(0));
    L163:
        if ((r57 & 16) == 0) goto L165;
        scrollState2 = ScrollKt.rememberScrollState(0, $composer2, 0, 1);
        $dirty2 = $dirty2 & (-57345);
    L165:
        if (r18 == 0) goto L168;
        properties2 = DefaultMenuProperties;
    L168:
        if ((r57 & 64) == 0) goto L170;
        Shape shape2 = MenuDefaults.INSTANCE.getShape($composer2, 6);
        $dirty2 = $dirty2 & (-3670017);
    L172:
        if ((r57 & 128) == 0) goto L174;
        long containerColor2 = MenuDefaults.INSTANCE.getContainerColor($composer2, 6);
        $dirty2 = $dirty2 & (-29360129);
    L175:
        if ($dirty4 == 0) goto L177;
        float tonalElevation2 = MenuDefaults.INSTANCE.m2355getTonalElevationD9Ej5fM();
    L178:
        if ($dirty5 == 0) goto L180;
        float shadowElevation2 = MenuDefaults.INSTANCE.m2354getShadowElevationD9Ej5fM();
    L181:
        if ($dirty6 == 0) goto L183;
        final Modifier modifier3 = modifier2;
        final Shape shape3 = shape2;
        final ScrollState scrollState3 = scrollState2;
        final float tonalElevation3 = tonalElevation2;
        final long containerColor3 = containerColor2;
        final float shadowElevation3 = shadowElevation2;
        final BorderStroke border2 = null;
        int $dirty8 = $dirty2;
    L184:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L187;
        ComposerKt.traceEventStart(1431928300, $dirty8, $dirty7, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:54)");
    L187:
        ComposerKt.sourceInformationMarkerStart($composer2, 1468213501, "CC(remember):AndroidMenu.android.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L190;
        boolean r17 = false;
        Object value$iv = new MutableTransitionState(false);
        $composer2.updateRememberedValue(value$iv);
    L191:
        final MutableTransitionState expandedState = (MutableTransitionState) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        expandedState.setTargetState(Boolean.valueOf(r5));
        if (((Boolean) expandedState.getCurrentState()).booleanValue() == false) goto L194;
    L197:
        ComposerKt.sourceInformationMarkerStart($composer2, 1468219494, "CC(remember):AndroidMenu.android.kt#9igjgp");
        Object it$iv2 = $composer2.rememberedValue();
        if (it$iv2 != Composer.Companion.getEmpty()) goto L200;
        Object value$iv2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m4744boximpl(TransformOrigin.Companion.m4757getCenterSzJe1aQ()), null, 2, null);
        $composer2.updateRememberedValue(value$iv2);
    L201:
        final MutableState transformOriginState = (MutableState) value$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ProvidableCompositionLocal<Density> r1 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r9 = $composer2.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Density density = (Density) r9;
        ComposerKt.sourceInformationMarkerStart($composer2, 1468224270, "CC(remember):AndroidMenu.android.kt#9igjgp");
        if (($dirty8 & 7168) != 2048) goto L204;
        boolean r4 = true;
    L205:
        boolean invalid$iv = r4 | $composer2.changed(density);
        Object it$iv3 = $composer2.rememberedValue();
        if (invalid$iv == false) goto L208;
    L211:
        long offset3 = offset2;
        Object value$iv3 = new DropdownMenuPositionProvider(offset3, density, 0, new AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1(transformOriginState), 4, null);
        long offset4 = offset3;
        $composer2.updateRememberedValue(value$iv3);
    L212:
        DropdownMenuPositionProvider popupPositionProvider = (DropdownMenuPositionProvider) value$iv3;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        AndroidPopup_androidKt.Popup(popupPositionProvider, r8, properties2, ComposableLambdaKt.rememberComposableLambda(2126968933, true, new AndroidMenu_androidKt$DropdownMenu$1(modifier3, expandedState, transformOriginState, scrollState3, shape3, containerColor3, tonalElevation3, shadowElevation3, border2, r53), $composer2, 54), $composer2, (($dirty8 & 112) | 3072) | (($dirty8 >> 9) & 896), 0);
        Composer $composer3 = $composer2;
    L214:
        if (ComposerKt.isTraceInProgress() == false) goto L216;
        ComposerKt.traceEventEnd();
    L216:
        final long offset5 = offset4;
        final Modifier modifier4 = modifier3;
        scrollState2 = scrollState3;
        final Shape shape4 = shape3;
        final long containerColor4 = containerColor3;
        final float tonalElevation4 = tonalElevation3;
        final float shadowElevation4 = shadowElevation3;
        final BorderStroke border3 = border2;
        final PopupProperties properties3 = properties2;
    L217:
        ScopeUpdateScope r0 = $composer3.endRestartGroup();
        if (r0 == null) goto L221;
        r0.updateScope(new AndroidMenu_androidKt$DropdownMenu$2(expanded, r41, modifier4, offset5, scrollState2, properties3, shape4, containerColor4, tonalElevation4, shadowElevation4, border3, r53, $changed, $changed1, r57));
        return;
    L221:
        return;
    L208:
        if (it$iv3 == Composer.Companion.getEmpty()) goto L211;
        offset4 = offset2;
        value$iv3 = it$iv3;
        goto L212
    L204:
        r4 = r17;
        goto L205
    L200:
        value$iv2 = it$iv2;
        goto L201
    L194:
        if (((Boolean) expandedState.getTargetState()).booleanValue() == true) goto L197;
        $composer3 = $composer2;
        offset4 = offset2;
        goto L214
    L190:
        r17 = false;
        value$iv = it$iv;
        goto L191
    L183:
        border2 = border;
        modifier3 = modifier2;
        shape3 = shape2;
        scrollState3 = scrollState2;
        tonalElevation3 = tonalElevation2;
        containerColor3 = containerColor2;
        shadowElevation3 = shadowElevation2;
        $dirty8 = $dirty2;
        goto L184
    L180:
        shadowElevation2 = shadowElevation;
        goto L181
    L177:
        tonalElevation2 = tonalElevation;
        goto L178
    L174:
        containerColor2 = containerColor;
        goto L175
    L170:
        shape2 = r7;
        goto L172
    L159:
        modifier2 = r12;
        goto L160
    L145:
        if ($composer2.getDefaultsInvalid() == true) goto L157;
        $composer2.skipToGroupEnd();
        if ((r57 & 16) == 0) goto L151;
        $dirty2 = $dirty2 & (-57345);
    L151:
        if ((r57 & 64) == 0) goto L154;
        $dirty2 = $dirty2 & (-3670017);
    L154:
        if ((r57 & 128) == 0) goto L156;
        $dirty8 = $dirty2 & (-29360129);
        containerColor3 = containerColor;
        tonalElevation3 = tonalElevation;
        shadowElevation3 = shadowElevation;
        border2 = border;
        scrollState3 = scrollState2;
        shape3 = r7;
        modifier3 = r12;
        goto L184
    L156:
        containerColor3 = containerColor;
        tonalElevation3 = tonalElevation;
        shadowElevation3 = shadowElevation;
        border2 = border;
        scrollState3 = scrollState2;
        shape3 = r7;
        modifier3 = r12;
        $dirty8 = $dirty2;
        goto L184
    L137:
        if (($dirty7 & 19) != 18) goto L142;
        if ($composer2.getSkipping() == false) goto L142;
        $composer2.skipToGroupEnd();
        tonalElevation4 = tonalElevation;
        border3 = border;
        $dirty7 = $dirty7;
        $composer3 = $composer2;
        shape4 = r7;
        offset5 = offset2;
        modifier4 = r12;
        containerColor4 = containerColor;
        shadowElevation4 = shadowElevation;
        properties3 = properties2;
        goto L217
    L127:
        if (($changed1 & 48) != 0) goto L134;
        if ($composer2.changedInstance(r53) == false) goto L131;
        int r16 = 32;
    L132:
        $dirty3 = $dirty3 | r16;
        goto L134
    L131:
        r16 = 16;
        goto L132
    L116:
        if (($changed1 & 6) != 0) goto L124;
        if ($composer2.changed(border) == false) goto L120;
        int r27 = 4;
    L121:
        $dirty3 = $dirty3 | r27;
        goto L124
    L120:
        r27 = 2;
        goto L121
    L105:
        if (($changed & 805306368) != 0) goto L112;
        if ($composer2.changed(shadowElevation) == false) goto L109;
        int r26 = 536870912;
    L110:
        $dirty2 = $dirty2 | r26;
        goto L112
    L109:
        r26 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changed(tonalElevation) == false) goto L98;
        int r25 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty2 = $dirty2 | r25;
        goto L101
    L98:
        r25 = 33554432;
        goto L99
    L82:
        if ((r57 & 128) != 0) goto L86;
        int $dirty9 = $dirty;
        $dirty1 = $changed1;
        if ($composer2.changed(containerColor) == false) goto L87;
        int r23 = 8388608;
    L88:
        $dirty2 = $dirty9 | r23;
    L87:
        r23 = 4194304;
        goto L88
    L86:
        $dirty9 = $dirty;
        $dirty1 = $changed1;
        goto L87
    L71:
        if ((r57 & 64) != 0) goto L75;
        r7 = shape;
        if ($composer2.changed(r7) == false) goto L76;
        int r21 = 1048576;
    L77:
        $dirty = $dirty | r21;
    L76:
        r21 = 524288;
        goto L77
    L75:
        r7 = shape;
        goto L76
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        properties2 = properties;
        if ($composer2.changed(properties2) == false) goto L65;
        int r20 = 131072;
    L66:
        $dirty = $dirty | r20;
        goto L69
    L65:
        r20 = 65536;
        goto L66
    L67:
        properties2 = properties;
        goto L69
    L49:
        if ((r57 & 16) != 0) goto L53;
        scrollState2 = scrollState;
        if ($composer2.changed(scrollState2) == false) goto L54;
        int r19 = 16384;
    L55:
        $dirty = $dirty | r19;
    L54:
        r19 = 8192;
        goto L55
    L53:
        scrollState2 = scrollState;
        goto L54
    L39:
        if (($changed & 3072) != 0) goto L45;
        offset2 = offset;
        if ($composer2.changed(offset2) == false) goto L43;
        int r110 = 2048;
    L44:
        $dirty = $dirty | r110;
        goto L47
    L43:
        r110 = 1024;
        goto L44
    L45:
        offset2 = offset;
        goto L47
    L28:
        if (($changed & 384) != 0) goto L34;
        r12 = modifier;
        if ($composer2.changed(r12) == false) goto L32;
        int r14 = 256;
    L33:
        $dirty = $dirty | r14;
        goto L35
    L32:
        r14 = 128;
        goto L33
    L34:
        r12 = modifier;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r8 = r41;
        if ($composer2.changedInstance(r8) == false) goto L21;
        int r15 = 32;
    L22:
        $dirty = $dirty | r15;
        goto L24
    L21:
        r15 = 16;
        goto L22
    L23:
        r8 = r41;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r5 = expanded;
        if ($composer2.changed(r5) == false) goto L10;
        int r10 = 4;
    L11:
        $dirty = $dirty | r10;
        goto L14
    L10:
        r10 = 2;
        goto L11
    L12:
        r5 = expanded;
        goto L14
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with parameters for shape, color, elevation, and border.", replaceWith = @ReplaceWith(expression = "DropdownMenu(\n    expanded = expanded,\n    onDismissRequest = onDismissRequest,\n    modifier = modifier,\n    offset = offset,\n    scrollState = scrollState,\n    properties = properties,\n    shape = MenuDefaults.shape,\n    containerColor = MenuDefaults.containerColor,\n    tonalElevation = MenuDefaults.TonalElevation,\n    shadowElevation = MenuDefaults.ShadowElevation,\n    border = null,\n    content = content,\n)", imports = {}))
    /* JADX INFO: renamed from: DropdownMenu-4kj-_NE, reason: not valid java name */
    public static final /* synthetic */ void m1890DropdownMenu4kj_NE(final boolean expanded, final Function0 onDismissRequest, Modifier modifier, long offset, ScrollState scrollState, PopupProperties properties, final Function3 content, Composer $composer, final int $changed, final int r38) {
        Composer $composer2 = $composer.startRestartGroup(-1137929566);
        ComposerKt.sourceInformation($composer2, "C(DropdownMenu)P(1,4,2,3:c#ui.unit.DpOffset,6,5)119@4573L21,130@4960L5,131@5005L14,123@4721L465:AndroidMenu.android.kt#uh7d8r");
        int $dirty = $changed;
        if ((r38 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        boolean r10 = expanded;
    L14:
        if ((r38 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Function0 r11 = onDismissRequest;
    L24:
        int r3 = r38 & 4;
        if (r3 == 0) goto L28;
        $dirty = $dirty | 384;
        Modifier r4 = modifier;
    L35:
        int r5 = r38 & 8;
        if (r5 == 0) goto L39;
        $dirty = $dirty | 3072;
        long offset2 = offset;
    L47:
        if (($changed & 24576) == 0) goto L49;
        ScrollState scrollState2 = scrollState;
    L57:
        int r12 = r38 & 32;
        if (r12 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        PopupProperties r13 = properties;
    L69:
        if ((r38 & 64) == 0) goto L72;
        $dirty = $dirty | 1572864;
    L80:
        if ((599187 & $dirty) == 599186) goto L82;
    L85:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L88;
    L94:
        if (r3 == 0) goto L96;
        Modifier.Companion modifier2 = Modifier.Companion;
    L97:
        if (r5 == 0) goto L101;
        offset2 = DpKt.m6994DpOffsetYgX7TsA(Dp.m6973constructorimpl(0), Dp.m6973constructorimpl(0));
    L101:
        if ((r38 & 16) == 0) goto L103;
        $dirty = $dirty & (-57345);
        scrollState2 = ScrollKt.rememberScrollState(0, $composer2, 0, 1);
    L103:
        if (r12 == 0) goto L105;
        Modifier modifier3 = modifier2;
        long offset3 = offset2;
        ScrollState scrollState3 = scrollState2;
        PopupProperties properties2 = new PopupProperties(true, false, false, false, 14, null);
        int r0 = -1137929566;
    L106:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L109;
        ComposerKt.traceEventStart(r0, $dirty, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:123)");
    L109:
        Composer $composer3 = $composer2;
        m1892DropdownMenuIlH_yew(r10, r11, modifier3, offset3, scrollState3, properties2, MenuDefaults.INSTANCE.getShape($composer2, 6), MenuDefaults.INSTANCE.getContainerColor($composer2, 6), MenuDefaults.INSTANCE.m2355getTonalElevationD9Ej5fM(), MenuDefaults.INSTANCE.m2354getShadowElevationD9Ej5fM(), null, content, $composer3, (((((($dirty & 14) | 905969664) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (57344 & $dirty)) | (458752 & $dirty), (($dirty >> 15) & 112) | 6, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L112;
        ComposerKt.traceEventEnd();
    L112:
        final Modifier modifier4 = modifier3;
        final long offset4 = offset3;
        final ScrollState scrollState4 = scrollState3;
        final PopupProperties properties3 = properties2;
    L113:
        ScopeUpdateScope r14 = $composer3.endRestartGroup();
        if (r14 == null) goto L117;
        r14.updateScope(new AndroidMenu_androidKt$DropdownMenu$3(expanded, onDismissRequest, modifier4, offset4, scrollState4, properties3, content, $changed, r38));
        return;
    L117:
        return;
    L105:
        modifier3 = modifier2;
        scrollState3 = scrollState2;
        properties2 = r13;
        r0 = -1137929566;
        offset3 = offset2;
        goto L106
    L96:
        modifier2 = r4;
        goto L97
    L88:
        if ($composer2.getDefaultsInvalid() == true) goto L94;
        $composer2.skipToGroupEnd();
        if ((r38 & 16) == 0) goto L93;
        $dirty = $dirty & (-57345);
    L93:
        modifier3 = r4;
        scrollState3 = scrollState2;
        properties2 = r13;
        r0 = -1137929566;
        offset3 = offset2;
        goto L106
    L82:
        if ($composer2.getSkipping() == false) goto L85;
        $composer2.skipToGroupEnd();
        $composer3 = $composer2;
        modifier4 = r4;
        offset4 = offset2;
        scrollState4 = scrollState2;
        properties3 = r13;
        goto L113
    L72:
        if (($changed & 1572864) != 0) goto L80;
        if ($composer2.changedInstance(content) == false) goto L76;
        int r15 = 1048576;
    L77:
        $dirty = $dirty | r15;
        goto L80
    L76:
        r15 = 524288;
        goto L77
    L61:
        if ((196608 & $changed) != 0) goto L67;
        r13 = properties;
        if ($composer2.changed(r13) == false) goto L65;
        int r16 = 131072;
    L66:
        $dirty = $dirty | r16;
        goto L69
    L65:
        r16 = 65536;
        goto L66
    L67:
        r13 = properties;
        goto L69
    L49:
        if ((r38 & 16) != 0) goto L53;
        scrollState2 = scrollState;
        if ($composer2.changed(scrollState2) == false) goto L54;
        int r17 = 16384;
    L55:
        $dirty = $dirty | r17;
    L54:
        r17 = 8192;
        goto L55
    L53:
        scrollState2 = scrollState;
        goto L54
    L39:
        if (($changed & 3072) != 0) goto L45;
        offset2 = offset;
        if ($composer2.changed(offset2) == false) goto L43;
        int r8 = 2048;
    L44:
        $dirty = $dirty | r8;
        goto L47
    L43:
        r8 = 1024;
        goto L44
    L45:
        offset2 = offset;
        goto L47
    L28:
        if (($changed & 384) != 0) goto L34;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L32;
        int r6 = 256;
    L33:
        $dirty = $dirty | r6;
        goto L35
    L32:
        r6 = 128;
        goto L33
    L34:
        r4 = modifier;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r11 = onDismissRequest;
        if ($composer2.changedInstance(r11) == false) goto L21;
        int r7 = 32;
    L22:
        $dirty = $dirty | r7;
        goto L24
    L21:
        r7 = 16;
        goto L22
    L23:
        r11 = onDismissRequest;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r10 = expanded;
        if ($composer2.changed(r10) == false) goto L10;
        int r9 = 4;
    L11:
        $dirty = $dirty | r9;
        goto L14
    L10:
        r9 = 2;
        goto L11
    L12:
        r10 = expanded;
        goto L14
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replaced by a DropdownMenu function with a ScrollState parameter", replaceWith = @ReplaceWith(expression = "DropdownMenu(expanded,onDismissRequest, modifier, offset, rememberScrollState(), properties, content)", imports = {"androidx.compose.foundation.rememberScrollState"}))
    /* JADX INFO: renamed from: DropdownMenu-ILWXrKs, reason: not valid java name */
    public static final /* synthetic */ void m1891DropdownMenuILWXrKs(final boolean expanded, final Function0 onDismissRequest, Modifier modifier, long offset, PopupProperties properties, final Function3 content, Composer $composer, final int $changed, final int r36) {
        Composer $composer2 = $composer.startRestartGroup(354826666);
        ComposerKt.sourceInformation($composer2, "C(DropdownMenu)P(1,4,2,3:c#ui.unit.DpOffset,5)163@6060L21,158@5896L251:AndroidMenu.android.kt#uh7d8r");
        int $dirty = $changed;
        if ((r36 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        boolean r9 = expanded;
    L14:
        if ((r36 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Function0 r10 = onDismissRequest;
    L24:
        int r3 = r36 & 4;
        if (r3 == 0) goto L28;
        $dirty = $dirty | 384;
        Modifier r4 = modifier;
    L35:
        int r5 = r36 & 8;
        if (r5 == 0) goto L39;
        $dirty = $dirty | 3072;
        long offset2 = offset;
    L46:
        int r11 = r36 & 16;
        if (r11 == 0) goto L50;
        $dirty = $dirty | 24576;
        PopupProperties r12 = properties;
    L58:
        if ((r36 & 32) == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function3 r13 = content;
    L69:
        if ((74899 & $dirty) == 74898) goto L71;
    L74:
        if (r3 == 0) goto L76;
        Modifier.Companion modifier2 = Modifier.Companion;
    L77:
        if (r5 == 0) goto L79;
        offset2 = DpKt.m6994DpOffsetYgX7TsA(Dp.m6973constructorimpl(0), Dp.m6973constructorimpl(0));
    L79:
        if (r11 == 0) goto L81;
        PopupProperties properties2 = new PopupProperties(true, false, false, false, 14, null);
    L83:
        if (ComposerKt.isTraceInProgress() == false) goto L85;
        ComposerKt.traceEventStart(354826666, $dirty, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:158)");
    L85:
        Composer $composer3 = $composer2;
        Modifier modifier3 = modifier2;
        long offset3 = offset2;
        m1892DropdownMenuIlH_yew(r9, r10, modifier3, offset3, ScrollKt.rememberScrollState(0, $composer2, 0, 1), properties2, null, 0, 0.0f, 0.0f, null, r13, $composer3, (((($dirty & 14) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (($dirty << 3) & 458752), ($dirty >> 12) & 112, 1984);
        if (ComposerKt.isTraceInProgress() == false) goto L88;
        ComposerKt.traceEventEnd();
    L88:
        final Modifier modifier4 = modifier3;
        final long offset4 = offset3;
        final PopupProperties properties3 = properties2;
    L89:
        ScopeUpdateScope r14 = $composer3.endRestartGroup();
        if (r14 == null) goto L93;
        r14.updateScope(new AndroidMenu_androidKt$DropdownMenu$4(expanded, onDismissRequest, modifier4, offset4, properties3, content, $changed, r36));
        return;
    L93:
        return;
    L81:
        properties2 = r12;
        goto L83
    L76:
        modifier2 = r4;
        goto L77
    L71:
        if ($composer2.getSkipping() == false) goto L74;
        $composer2.skipToGroupEnd();
        $composer3 = $composer2;
        modifier4 = r4;
        offset4 = offset2;
        properties3 = r12;
        goto L89
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        r13 = content;
        if ($composer2.changedInstance(r13) == false) goto L65;
        int r15 = 131072;
    L66:
        $dirty = $dirty | r15;
        goto L69
    L65:
        r15 = 65536;
        goto L66
    L67:
        r13 = content;
        goto L69
    L50:
        if (($changed & 24576) != 0) goto L56;
        r12 = properties;
        if ($composer2.changed(r12) == false) goto L54;
        int r16 = 16384;
    L55:
        $dirty = $dirty | r16;
        goto L58
    L54:
        r16 = 8192;
        goto L55
    L56:
        r12 = properties;
        goto L58
    L39:
        if (($changed & 3072) != 0) goto L45;
        offset2 = offset;
        if ($composer2.changed(offset2) == false) goto L43;
        int r17 = 2048;
    L44:
        $dirty = $dirty | r17;
        goto L46
    L43:
        r17 = 1024;
        goto L44
    L45:
        offset2 = offset;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L32;
        int r6 = 256;
    L33:
        $dirty = $dirty | r6;
        goto L35
    L32:
        r6 = 128;
        goto L33
    L34:
        r4 = modifier;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r10 = onDismissRequest;
        if ($composer2.changedInstance(r10) == false) goto L21;
        int r7 = 32;
    L22:
        $dirty = $dirty | r7;
        goto L24
    L21:
        r7 = 16;
        goto L22
    L23:
        r10 = onDismissRequest;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r9 = expanded;
        if ($composer2.changed(r9) == false) goto L10;
        int r8 = 4;
    L11:
        $dirty = $dirty | r8;
        goto L14
    L10:
        r8 = 2;
        goto L11
    L12:
        r9 = expanded;
        goto L14
    }

    public static final void DropdownMenuItem(final Function2<? super Composer, ? super Integer, Unit> r23, final Function0<Unit> r24, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> r26, Function2<? super Composer, ? super Integer, Unit> r27, boolean enabled, MenuItemColors colors, PaddingValues contentPadding, MutableInteractionSource interactionSource, Composer $composer, final int $changed, final int r34) {
        Composer $composer2 = $composer.startRestartGroup(1826340448);
        ComposerKt.sourceInformation($composer2, "C(DropdownMenuItem)P(7,6,5,4,8,2)194@8925L12,180@6505L319:AndroidMenu.android.kt#uh7d8r");
        int $dirty = $changed;
        if ((r34 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function2<? super Composer, ? super Integer, Unit> r12 = r23;
    L14:
        if ((r34 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Function0<Unit> r13 = r24;
    L24:
        int r3 = r34 & 4;
        if (r3 == 0) goto L28;
        $dirty = $dirty | 384;
        Modifier modifier2 = modifier;
    L35:
        int r5 = r34 & 8;
        if (r5 == 0) goto L39;
        $dirty = $dirty | 3072;
        Function2<? super Composer, ? super Integer, Unit> r6 = r26;
    L46:
        int r7 = r34 & 16;
        if (r7 == 0) goto L50;
        $dirty = $dirty | 24576;
        Function2<? super Composer, ? super Integer, Unit> r8 = r27;
    L57:
        int r9 = r34 & 32;
        if (r9 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        boolean enabled2 = enabled;
    L69:
        if ((1572864 & $changed) == 0) goto L71;
        MenuItemColors colors2 = colors;
    L79:
        int r0 = r34 & 128;
        if (r0 == 0) goto L83;
        $dirty = $dirty | 12582912;
    L90:
        int r1 = r34 & 256;
        if (r1 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L101:
        int $dirty2 = $dirty;
        if (($dirty & 38347923) == 38347922) goto L104;
    L107:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L110;
    L116:
        if (r3 == 0) goto L118;
        modifier2 = Modifier.Companion;
    L118:
        if (r5 == 0) goto L120;
        r6 = null;
    L120:
        if (r7 == 0) goto L122;
        r8 = null;
    L122:
        if (r9 == 0) goto L125;
        enabled2 = true;
    L125:
        if ((r34 & 64) == 0) goto L127;
        int $dirty3 = $dirty2 & (-3670017);
        colors2 = MenuDefaults.INSTANCE.itemColors($composer2, 6);
    L128:
        if (r0 == 0) goto L130;
        PaddingValues contentPadding2 = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
    L131:
        if (r1 == 0) goto L133;
        PaddingValues contentPadding3 = contentPadding2;
        MutableInteractionSource interactionSource2 = null;
        Function2<? super Composer, ? super Integer, Unit> r16 = r8;
        boolean enabled3 = enabled2;
        MenuItemColors colors3 = colors2;
        int r2 = 1826340448;
        Modifier modifier3 = modifier2;
        Function2<? super Composer, ? super Integer, Unit> r15 = r6;
    L134:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L137;
        ComposerKt.traceEventStart(r2, $dirty3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
    L137:
        Composer $composer3 = $composer2;
        MenuKt.DropdownMenuItemContent(r12, r13, modifier3, r15, r16, enabled3, colors3, contentPadding3, interactionSource2, $composer3, (((((((($dirty3 & 14) | ($dirty3 & 112)) | ($dirty3 & 896)) | ($dirty3 & 7168)) | (57344 & $dirty3)) | (458752 & $dirty3)) | (3670016 & $dirty3)) | (29360128 & $dirty3)) | (234881024 & $dirty3));
        if (ComposerKt.isTraceInProgress() == false) goto L140;
        ComposerKt.traceEventEnd();
    L140:
        final Modifier modifier4 = modifier3;
        final Function2<? super Composer, ? super Integer, Unit> r4 = r15;
        final Function2<? super Composer, ? super Integer, Unit> r10 = r16;
        final boolean enabled4 = enabled3;
        final MenuItemColors colors4 = colors3;
        final PaddingValues contentPadding4 = contentPadding3;
        final MutableInteractionSource interactionSource3 = interactionSource2;
    L141:
        ScopeUpdateScope r14 = $composer3.endRestartGroup();
        if (r14 == null) goto L145;
        r14.updateScope(new AnonymousClass1(r23, r24, modifier4, r4, r10, enabled4, colors4, contentPadding4, interactionSource3, $changed, r34));
        return;
    L145:
        return;
    L133:
        interactionSource2 = interactionSource;
        contentPadding3 = contentPadding2;
        r16 = r8;
        enabled3 = enabled2;
        colors3 = colors2;
        r2 = 1826340448;
        modifier3 = modifier2;
        r15 = r6;
        goto L134
    L130:
        contentPadding2 = contentPadding;
        goto L131
    L127:
        $dirty3 = $dirty2;
        goto L128
    L110:
        if ($composer2.getDefaultsInvalid() == true) goto L116;
        $composer2.skipToGroupEnd();
        if ((r34 & 64) == 0) goto L115;
        contentPadding3 = contentPadding;
        interactionSource2 = interactionSource;
        $dirty3 = $dirty2 & (-3670017);
        r16 = r8;
        enabled3 = enabled2;
        colors3 = colors2;
        r2 = 1826340448;
        modifier3 = modifier2;
        r15 = r6;
        goto L134
    L115:
        contentPadding3 = contentPadding;
        interactionSource2 = interactionSource;
        $dirty3 = $dirty2;
        r16 = r8;
        enabled3 = enabled2;
        colors3 = colors2;
        r2 = 1826340448;
        modifier3 = modifier2;
        r15 = r6;
        goto L134
    L104:
        if ($composer2.getSkipping() == false) goto L107;
        $composer2.skipToGroupEnd();
        interactionSource3 = interactionSource;
        $composer3 = $composer2;
        modifier4 = modifier2;
        r4 = r6;
        r10 = r8;
        enabled4 = enabled2;
        colors4 = colors2;
        contentPadding4 = contentPadding;
        goto L141
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changed(interactionSource) == false) goto L98;
        int r19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r19;
        goto L101
    L98:
        r19 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changed(contentPadding) == false) goto L87;
        int r18 = 8388608;
    L88:
        $dirty = $dirty | r18;
        goto L90
    L87:
        r18 = 4194304;
        goto L88
    L71:
        if ((r34 & 64) != 0) goto L75;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L76;
        int r17 = 1048576;
    L77:
        $dirty = $dirty | r17;
    L76:
        r17 = 524288;
        goto L77
    L75:
        colors2 = colors;
        goto L76
    L61:
        if ((196608 & $changed) != 0) goto L67;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L65;
        int r110 = 131072;
    L66:
        $dirty = $dirty | r110;
        goto L69
    L65:
        r110 = 65536;
        goto L66
    L67:
        enabled2 = enabled;
        goto L69
    L50:
        if (($changed & 24576) != 0) goto L56;
        r8 = r27;
        if ($composer2.changedInstance(r8) == false) goto L54;
        int r11 = 16384;
    L55:
        $dirty = $dirty | r11;
        goto L57
    L54:
        r11 = 8192;
        goto L55
    L56:
        r8 = r27;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L45;
        r6 = r26;
        if ($composer2.changedInstance(r6) == false) goto L43;
        int r20 = 2048;
    L44:
        $dirty = $dirty | r20;
        goto L46
    L43:
        r20 = 1024;
        goto L44
    L45:
        r6 = r26;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L32;
        int r21 = 256;
    L33:
        $dirty = $dirty | r21;
        goto L35
    L32:
        r21 = 128;
        goto L33
    L34:
        modifier2 = modifier;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r13 = r24;
        if ($composer2.changedInstance(r13) == false) goto L21;
        int r22 = 32;
    L22:
        $dirty = $dirty | r22;
        goto L24
    L21:
        r22 = 16;
        goto L22
    L23:
        r13 = r24;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r12 = r23;
        if ($composer2.changedInstance(r12) == false) goto L10;
        int r25 = 4;
    L11:
        $dirty = $dirty | r25;
        goto L14
    L10:
        r25 = 2;
        goto L11
    L12:
        r12 = r23;
        goto L14
    }

    static {
        DefaultMenuProperties = new PopupProperties(true, false, false, false, 14, null);
    }

    public static final PopupProperties getDefaultMenuProperties() {
        return DefaultMenuProperties;
    }
}
