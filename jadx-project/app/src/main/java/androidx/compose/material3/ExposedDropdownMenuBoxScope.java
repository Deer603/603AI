package androidx.compose.material3;

import android.view.View;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
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
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ExposedDropdownMenu.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002JU\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0002\u0010\u0016J\u0098\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J¢\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010#\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\u00020\u000e*\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\nH&J\f\u0010'\u001a\u00020\u000e*\u00020\u000eH\u0007J(\u0010'\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010(\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\nH&ø\u0001\u0000¢\u0006\u0004\b*\u0010+R\u0018\u0010\u0003\u001a\u00020\u0004X \u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001,\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, d2 = {"Landroidx/compose/material3/ExposedDropdownMenuBoxScope;", "", "()V", "anchorType", "Landroidx/compose/material3/MenuAnchorType;", "getAnchorType-Mg6Rgbw$material3_release", "()Ljava/lang/String;", "ExposedDropdownMenu", "", "expanded", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "matchTextFieldWidth", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "tonalElevation", "Landroidx/compose/ui/unit/Dp;", "shadowElevation", androidx.compose.material.OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "ExposedDropdownMenu-vNxi1II", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/ui/graphics/Shape;JFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "focusable", "ExposedDropdownMenu-kbRbctU", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZZLandroidx/compose/ui/graphics/Shape;JFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "exposedDropdownSize", "menuAnchor", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "enabled", "menuAnchor-fsE2BvY", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Z)Landroidx/compose/ui/Modifier;", "Landroidx/compose/material3/ExposedDropdownMenuBoxScopeImpl;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ExposedDropdownMenuBoxScope {
    public static final int $stable = 0;

    static {
    }

    public /* synthetic */ ExposedDropdownMenuBoxScope(DefaultConstructorMarker r1) {
        this();
    }

    public abstract Modifier exposedDropdownSize(Modifier r1, boolean r2);

    /* JADX INFO: renamed from: getAnchorType-Mg6Rgbw$material3_release, reason: not valid java name */
    public abstract String mo2209getAnchorTypeMg6Rgbw$material3_release();

    /* JADX INFO: renamed from: menuAnchor-fsE2BvY, reason: not valid java name */
    public abstract Modifier mo2210menuAnchorfsE2BvY(Modifier r1, String r2, boolean r3);

    private ExposedDropdownMenuBoxScope() {
    }

    /* JADX INFO: renamed from: menuAnchor-fsE2BvY$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2206menuAnchorfsE2BvY$default(ExposedDropdownMenuBoxScope r0, Modifier r1, String r2, boolean r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 2) == 0) goto L7;
        r3 = true;
    L7:
        return r0.mo2210menuAnchorfsE2BvY(r1, r2, r3);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: menuAnchor-fsE2BvY");
    }

    public static /* synthetic */ Modifier exposedDropdownSize$default(ExposedDropdownMenuBoxScope r0, Modifier r1, boolean r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 1) == 0) goto L7;
        r2 = true;
    L7:
        return r0.exposedDropdownSize(r1, r2);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposedDropdownSize");
    }

    /* JADX INFO: renamed from: ExposedDropdownMenu-vNxi1II, reason: not valid java name */
    public final void m2208ExposedDropdownMenuvNxi1II(final boolean expanded, final Function0<Unit> r40, Modifier modifier, ScrollState scrollState, boolean matchTextFieldWidth, Shape shape, long containerColor, float tonalElevation, float shadowElevation, BorderStroke border, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r50, Composer $composer, final int $changed, final int $changed1, final int r54) {
        Composer $composer2 = $composer.startRestartGroup(720925481);
        ComposerKt.sourceInformation($composer2, "C(ExposedDropdownMenu)P(3,6,5,7,4,9,1:c#ui.graphics.Color,10:c#ui.unit.Dp,8:c#ui.unit.Dp)336@15550L21,338@15654L5,339@15706L14,347@16155L53,348@16238L7,349@16281L7,350@16332L10,357@16596L42,361@16795L51,363@16903L486,377@17583L27,378@17626L587,374@17403L810:ExposedDropdownMenu.android.kt#uh7d8r");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r54 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r54 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
        Function0<Unit> r6 = r40;
    L23:
        int r11 = r54 & 4;
        if (r11 == 0) goto L27;
        $dirty = $dirty | 384;
        Modifier r12 = modifier;
    L35:
        if (($changed & 3072) == 0) goto L37;
        ScrollState scrollState2 = scrollState;
    L45:
        int r15 = r54 & 16;
        if (r15 == 0) goto L49;
        $dirty = $dirty | 24576;
        boolean matchTextFieldWidth2 = matchTextFieldWidth;
    L57:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) goto L59;
        Shape shape2 = shape;
    L68:
        if (($changed & 1572864) == 0) goto L70;
        int r18 = r11;
        long containerColor2 = containerColor;
    L78:
        int r8 = r54 & 128;
        if (r8 == 0) goto L82;
        $dirty = $dirty | 12582912;
    L89:
        int r1 = r54 & 256;
        if (r1 == 0) goto L93;
        $dirty = $dirty | 100663296;
    L100:
        int r2 = r54 & 512;
        if (r2 == 0) goto L104;
        $dirty = $dirty | 805306368;
    L112:
        if ((r54 & 1024) == 0) goto L115;
        $dirty1 = $dirty1 | 6;
    L123:
        if ((r54 & 2048) == 0) goto L126;
        $dirty1 = $dirty1 | 48;
    L134:
        if (($dirty & 306783379) == 306783378) goto L136;
    L141:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L144;
    L156:
        if (r18 == 0) goto L158;
        Modifier.Companion modifier2 = Modifier.Companion;
    L160:
        if ((r54 & 8) == 0) goto L162;
        scrollState2 = ScrollKt.rememberScrollState(0, $composer2, 0, 1);
        $dirty = $dirty & (-7169);
    L162:
        if (r15 == 0) goto L165;
        matchTextFieldWidth2 = true;
    L165:
        if ((r54 & 32) == 0) goto L168;
        shape2 = MenuDefaults.INSTANCE.getShape($composer2, 6);
        $dirty = $dirty & (-458753);
    L168:
        if ((r54 & 64) == 0) goto L170;
        containerColor2 = MenuDefaults.INSTANCE.getContainerColor($composer2, 6);
        $dirty = $dirty & (-3670017);
    L170:
        if (r8 == 0) goto L172;
        float tonalElevation2 = MenuDefaults.INSTANCE.m2355getTonalElevationD9Ej5fM();
    L173:
        if (r1 == 0) goto L175;
        float shadowElevation2 = MenuDefaults.INSTANCE.m2354getShadowElevationD9Ej5fM();
    L176:
        if (r2 == 0) goto L178;
        final Modifier modifier3 = modifier2;
        final boolean matchTextFieldWidth3 = matchTextFieldWidth2;
        final float tonalElevation3 = tonalElevation2;
        final Shape shape3 = shape2;
        final long containerColor3 = containerColor2;
        final float shadowElevation3 = shadowElevation2;
        final ScrollState scrollState3 = scrollState2;
        final BorderStroke border2 = null;
    L179:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L182;
        ComposerKt.traceEventStart(720925481, $dirty, $dirty1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.android.kt:344)");
    L182:
        ComposerKt.sourceInformationMarkerStart($composer2, 321492941, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L185;
        Object value$iv = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
        $composer2.updateRememberedValue(value$iv);
    L186:
        final MutableState keyboardSignalState = (MutableState) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ProvidableCompositionLocal<View> r9 = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r13 = $composer2.consume(r9);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        View view = (View) r13;
        ProvidableCompositionLocal<Density> r10 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r14 = $composer2.consume(r10);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Density density = (Density) r14;
        int topWindowInsets = WindowInsets_androidKt.getStatusBars(WindowInsets.Companion, $composer2, 6).getTop(density);
        $composer2.startReplaceGroup(321499814);
        ComposerKt.sourceInformation($composer2, "353@16432L36,353@16396L72");
        if (expanded == false) goto L193;
        ComposerKt.sourceInformationMarkerStart($composer2, 321501788, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
        Object it$iv2 = $composer2.rememberedValue();
        if (it$iv2 != Composer.Companion.getEmpty()) goto L191;
        Object value$iv2 = (Function0) new ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1$1(keyboardSignalState);
        $composer2.updateRememberedValue(value$iv2);
    L192:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ExposedDropdownMenu_androidKt.access$SoftKeyboardListener(view, density, (Function0) value$iv2, $composer2, 384);
        goto L193
    L191:
        value$iv2 = it$iv2;
    L193:
        $composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerStart($composer2, 321507042, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
        Object it$iv3 = $composer2.rememberedValue();
        if (it$iv3 != Composer.Companion.getEmpty()) goto L196;
        Object value$iv3 = new MutableTransitionState(false);
        $composer2.updateRememberedValue(value$iv3);
    L197:
        final MutableTransitionState expandedState = (MutableTransitionState) value$iv3;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        expandedState.setTargetState(Boolean.valueOf(expanded));
        if (((Boolean) expandedState.getCurrentState()).booleanValue() == false) goto L200;
    L203:
        ComposerKt.sourceInformationMarkerStart($composer2, 321513419, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
        Object it$iv4 = $composer2.rememberedValue();
        if (it$iv4 != Composer.Companion.getEmpty()) goto L206;
        Object value$iv4 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m4744boximpl(TransformOrigin.Companion.m4757getCenterSzJe1aQ()), null, 2, null);
        $composer2.updateRememberedValue(value$iv4);
    L207:
        final MutableState transformOriginState = (MutableState) value$iv4;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 321517310, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(density) | $composer2.changed(topWindowInsets);
        Object it$iv5 = $composer2.rememberedValue();
        if (invalid$iv == false) goto L210;
    L213:
        Object value$iv5 = new ExposedDropdownMenuPositionProvider(density, topWindowInsets, keyboardSignalState, 0, new ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1(transformOriginState), 8, null);
        $composer2.updateRememberedValue(value$iv5);
    L214:
        ExposedDropdownMenuPositionProvider popupPositionProvider = (ExposedDropdownMenuPositionProvider) value$iv5;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Function0<Unit> r42 = r6;
        AndroidPopup_androidKt.Popup(popupPositionProvider, r42, ExposedDropdownMenuDefaults.INSTANCE.m2214popupPropertiespR6Bxps$material3_release(mo2209getAnchorTypeMg6Rgbw$material3_release(), $composer2, 48), ComposableLambdaKt.rememberComposableLambda(-1082380263, true, new AnonymousClass2(this, modifier3, matchTextFieldWidth3, expandedState, transformOriginState, scrollState3, shape3, containerColor3, tonalElevation3, shadowElevation3, border2, r50), $composer2, 54), $composer2, ($dirty & 112) | 3072, 0);
        Composer $composer3 = $composer2;
    L216:
        if (ComposerKt.isTraceInProgress() == false) goto L218;
        ComposerKt.traceEventEnd();
    L218:
        final Modifier modifier4 = modifier3;
        final boolean matchTextFieldWidth4 = matchTextFieldWidth3;
        final ScrollState scrollState4 = scrollState3;
        final Shape shape4 = shape3;
        final long containerColor4 = containerColor3;
        final float tonalElevation4 = tonalElevation3;
        final float shadowElevation4 = shadowElevation3;
        final BorderStroke border3 = border2;
    L219:
        ScopeUpdateScope r3 = $composer3.endRestartGroup();
        if (r3 == null) goto L223;
        r3.updateScope(new AnonymousClass3(this, expanded, r40, modifier4, scrollState4, matchTextFieldWidth4, shape4, containerColor4, tonalElevation4, shadowElevation4, border3, r50, $changed, $changed1, r54));
        return;
    L223:
        return;
    L210:
        if (it$iv5 == Composer.Companion.getEmpty()) goto L213;
        value$iv5 = it$iv5;
        goto L214
    L206:
        value$iv4 = it$iv4;
        goto L207
    L200:
        if (((Boolean) expandedState.getTargetState()).booleanValue() == true) goto L203;
        $composer3 = $composer2;
        $dirty = $dirty;
        goto L216
    L196:
        value$iv3 = it$iv3;
        goto L197
    L185:
        value$iv = it$iv;
        goto L186
    L178:
        border2 = border;
        modifier3 = modifier2;
        matchTextFieldWidth3 = matchTextFieldWidth2;
        tonalElevation3 = tonalElevation2;
        shape3 = shape2;
        containerColor3 = containerColor2;
        shadowElevation3 = shadowElevation2;
        scrollState3 = scrollState2;
        goto L179
    L175:
        shadowElevation2 = shadowElevation;
        goto L176
    L172:
        tonalElevation2 = tonalElevation;
        goto L173
    L158:
        modifier2 = r12;
        goto L160
    L144:
        if ($composer2.getDefaultsInvalid() == true) goto L156;
        $composer2.skipToGroupEnd();
        if ((r54 & 8) == 0) goto L150;
        $dirty = $dirty & (-7169);
    L150:
        if ((r54 & 32) == 0) goto L153;
        $dirty = $dirty & (-458753);
    L153:
        if ((r54 & 64) == 0) goto L155;
        tonalElevation3 = tonalElevation;
        shadowElevation3 = shadowElevation;
        border2 = border;
        $dirty = (-3670017) & $dirty;
        matchTextFieldWidth3 = matchTextFieldWidth2;
        shape3 = shape2;
        containerColor3 = containerColor2;
        modifier3 = r12;
        scrollState3 = scrollState2;
        goto L179
    L155:
        tonalElevation3 = tonalElevation;
        shadowElevation3 = shadowElevation;
        border2 = border;
        matchTextFieldWidth3 = matchTextFieldWidth2;
        shape3 = shape2;
        containerColor3 = containerColor2;
        modifier3 = r12;
        scrollState3 = scrollState2;
        goto L179
    L136:
        if (($dirty1 & 19) != 18) goto L141;
        if ($composer2.getSkipping() == false) goto L141;
        $composer2.skipToGroupEnd();
        $composer3 = $composer2;
        matchTextFieldWidth4 = matchTextFieldWidth2;
        shape4 = shape2;
        containerColor4 = containerColor2;
        modifier4 = r12;
        scrollState4 = scrollState2;
        tonalElevation4 = tonalElevation;
        shadowElevation4 = shadowElevation;
        border3 = border;
        goto L219
    L126:
        if (($changed1 & 48) != 0) goto L134;
        if ($composer2.changed(this) == false) goto L130;
        int r16 = 32;
    L131:
        $dirty1 = $dirty1 | r16;
        goto L134
    L130:
        r16 = 16;
        goto L131
    L115:
        if (($changed1 & 6) != 0) goto L123;
        if ($composer2.changedInstance(r50) == false) goto L119;
        int r23 = 4;
    L120:
        $dirty1 = $dirty1 | r23;
        goto L123
    L119:
        r23 = 2;
        goto L120
    L104:
        if (($changed & 805306368) != 0) goto L112;
        if ($composer2.changed(border) == false) goto L108;
        int r24 = 536870912;
    L109:
        $dirty = $dirty | r24;
        goto L112
    L108:
        r24 = 268435456;
        goto L109
    L93:
        if (($changed & 100663296) != 0) goto L100;
        if ($composer2.changed(shadowElevation) == false) goto L97;
        int r22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L98:
        $dirty = $dirty | r22;
        goto L100
    L97:
        r22 = 33554432;
        goto L98
    L82:
        if (($changed & 12582912) != 0) goto L89;
        if ($composer2.changed(tonalElevation) == false) goto L86;
        int r21 = 8388608;
    L87:
        $dirty = $dirty | r21;
        goto L89
    L86:
        r21 = 4194304;
        goto L87
    L70:
        if ((r54 & 64) != 0) goto L74;
        r18 = r11;
        containerColor2 = containerColor;
        if ($composer2.changed(containerColor2) == false) goto L75;
        int r19 = 1048576;
    L76:
        $dirty = $dirty | r19;
    L75:
        r19 = 524288;
        goto L76
    L74:
        r18 = r11;
        containerColor2 = containerColor;
        goto L75
    L59:
        if ((r54 & 32) != 0) goto L63;
        shape2 = shape;
        if ($composer2.changed(shape2) == false) goto L64;
        int r17 = 131072;
    L65:
        $dirty = $dirty | r17;
    L64:
        r17 = 65536;
        goto L65
    L63:
        shape2 = shape;
        goto L64
    L49:
        if (($changed & 24576) != 0) goto L55;
        matchTextFieldWidth2 = matchTextFieldWidth;
        if ($composer2.changed(matchTextFieldWidth2) == false) goto L53;
        int r110 = 16384;
    L54:
        $dirty = $dirty | r110;
        goto L57
    L53:
        r110 = 8192;
        goto L54
    L55:
        matchTextFieldWidth2 = matchTextFieldWidth;
        goto L57
    L37:
        if ((r54 & 8) != 0) goto L41;
        scrollState2 = scrollState;
        if ($composer2.changed(scrollState2) == false) goto L42;
        int r111 = 2048;
    L43:
        $dirty = $dirty | r111;
    L42:
        r111 = 1024;
        goto L43
    L41:
        scrollState2 = scrollState;
        goto L42
    L27:
        if (($changed & 384) != 0) goto L33;
        r12 = modifier;
        if ($composer2.changed(r12) == false) goto L31;
        int r112 = 256;
    L32:
        $dirty = $dirty | r112;
        goto L35
    L31:
        r112 = 128;
        goto L32
    L33:
        r12 = modifier;
        goto L35
    L16:
        if (($changed & 48) != 0) goto L22;
        r6 = r40;
        if ($composer2.changedInstance(r6) == false) goto L20;
        int r113 = 32;
    L21:
        $dirty = $dirty | r113;
        goto L23
    L20:
        r113 = 16;
        goto L21
    L22:
        r6 = r40;
        goto L23
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(expanded) == false) goto L10;
        int r7 = 4;
    L11:
        $dirty = $dirty | r7;
        goto L13
    L10:
        r7 = 2;
        goto L11
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use overload that takes MenuAnchorType and enabled parameters", replaceWith = @ReplaceWith(expression = "menuAnchor(type, enabled)", imports = {}))
    public final Modifier menuAnchor(Modifier $this$menuAnchor) {
        return m2206menuAnchorfsE2BvY$default(this, $this$menuAnchor, MenuAnchorType.Companion.m2352getPrimaryNotEditableMg6Rgbw(), false, 2, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "The `focusable` parameter is unused. Pass the proper MenuAnchorType to Modifier.menuAnchor instead, which will handle focusability automatically.")
    /* JADX INFO: renamed from: ExposedDropdownMenu-kbRbctU, reason: not valid java name */
    public final void m2207ExposedDropdownMenukbRbctU(final boolean expanded, final Function0<Unit> r36, Modifier modifier, ScrollState scrollState, boolean focusable, boolean matchTextFieldWidth, Shape shape, long containerColor, float tonalElevation, float shadowElevation, BorderStroke border, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r47, Composer $composer, final int $changed, final int $changed1, final int r51) {
        Composer $composer2 = $composer.startRestartGroup(366140493);
        ComposerKt.sourceInformation($composer2, "C(ExposedDropdownMenu)P(3,7,6,8,4,5,10,1:c#ui.graphics.Color,11:c#ui.unit.Dp,9:c#ui.unit.Dp)414@19050L21,417@19189L5,418@19241L14,424@19482L463:ExposedDropdownMenu.android.kt#uh7d8r");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r51 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        boolean r6 = expanded;
    L14:
        if ((r51 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Function0<Unit> r9 = r36;
    L24:
        int r12 = r51 & 4;
        if (r12 == 0) goto L28;
        $dirty = $dirty | 384;
        Modifier r7 = modifier;
    L36:
        if (($changed & 3072) == 0) goto L38;
        ScrollState r8 = scrollState;
    L46:
        int r17 = r51 & 32;
        if (r17 == 0) goto L50;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        boolean matchTextFieldWidth2 = matchTextFieldWidth;
    L58:
        if (($changed & 1572864) == 0) goto L60;
        Shape shape2 = shape;
    L69:
        if (($changed & 12582912) == 0) goto L71;
        long containerColor2 = containerColor;
    L79:
        int r13 = r51 & 256;
        if (r13 == 0) goto L83;
        $dirty = $dirty | 100663296;
    L90:
        int r2 = r51 & 512;
        if (r2 == 0) goto L94;
        $dirty = $dirty | 805306368;
    L101:
        int r3 = r51 & 1024;
        if (r3 == 0) goto L105;
        $dirty1 = $dirty1 | 6;
    L113:
        if ((r51 & 2048) == 0) goto L116;
        $dirty1 = $dirty1 | 48;
    L124:
        if ((r51 & 4096) == 0) goto L127;
        $dirty1 = $dirty1 | 384;
    L135:
        if (($dirty & 306775187) == 306775186) goto L137;
    L142:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L145;
    L157:
        if (r12 == 0) goto L159;
        Modifier.Companion modifier2 = Modifier.Companion;
    L161:
        if ((r51 & 8) == 0) goto L163;
        ScrollState scrollState2 = ScrollKt.rememberScrollState(0, $composer2, 0, 1);
        $dirty = $dirty & (-7169);
    L165:
        if ((r51 & 16) == 0) goto L167;
        boolean focusable2 = true;
    L168:
        if (r17 == 0) goto L171;
        matchTextFieldWidth2 = true;
    L171:
        if ((r51 & 64) == 0) goto L174;
        shape2 = MenuDefaults.INSTANCE.getShape($composer2, 6);
        $dirty = $dirty & (-3670017);
    L174:
        if ((r51 & 128) == 0) goto L176;
        containerColor2 = MenuDefaults.INSTANCE.getContainerColor($composer2, 6);
        $dirty = $dirty & (-29360129);
    L176:
        if (r13 == 0) goto L178;
        float tonalElevation2 = MenuDefaults.INSTANCE.m2355getTonalElevationD9Ej5fM();
    L179:
        if (r2 == 0) goto L181;
        float shadowElevation2 = MenuDefaults.INSTANCE.m2354getShadowElevationD9Ej5fM();
    L182:
        if (r3 == 0) goto L184;
        Modifier modifier3 = modifier2;
        float tonalElevation3 = tonalElevation2;
        ScrollState scrollState3 = scrollState2;
        boolean matchTextFieldWidth3 = matchTextFieldWidth2;
        Shape shape3 = shape2;
        float shadowElevation3 = shadowElevation2;
        BorderStroke border2 = null;
        long containerColor3 = containerColor2;
        int r0 = 366140493;
    L185:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L188;
        ComposerKt.traceEventStart(r0, $dirty, $dirty1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.android.kt:424)");
    L188:
        Composer $composer3 = $composer2;
        m2208ExposedDropdownMenuvNxi1II(r6, r9, modifier3, scrollState3, matchTextFieldWidth3, shape3, containerColor3, tonalElevation3, shadowElevation3, border2, r47, $composer3, ((((((((($dirty & 14) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (($dirty >> 3) & 57344)) | (($dirty >> 3) & 458752)) | (($dirty >> 3) & 3670016)) | (($dirty >> 3) & 29360128)) | (($dirty >> 3) & 234881024)) | (($dirty1 << 27) & 1879048192), (($dirty1 >> 3) & 14) | (($dirty1 >> 3) & 112), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L191;
        ComposerKt.traceEventEnd();
    L191:
        final boolean focusable3 = focusable2;
        final Modifier modifier4 = modifier3;
        final ScrollState scrollState4 = scrollState3;
        final boolean matchTextFieldWidth4 = matchTextFieldWidth3;
        final Shape shape4 = shape3;
        final long containerColor4 = containerColor3;
        final float tonalElevation4 = tonalElevation3;
        final float shadowElevation4 = shadowElevation3;
        final BorderStroke border3 = border2;
    L192:
        ScopeUpdateScope r4 = $composer3.endRestartGroup();
        if (r4 == null) goto L196;
        r4.updateScope(new AnonymousClass4(this, expanded, r36, modifier4, scrollState4, focusable3, matchTextFieldWidth4, shape4, containerColor4, tonalElevation4, shadowElevation4, border3, r47, $changed, $changed1, r51));
        return;
    L196:
        return;
    L184:
        border2 = border;
        modifier3 = modifier2;
        tonalElevation3 = tonalElevation2;
        scrollState3 = scrollState2;
        matchTextFieldWidth3 = matchTextFieldWidth2;
        shape3 = shape2;
        shadowElevation3 = shadowElevation2;
        containerColor3 = containerColor2;
        r0 = 366140493;
        goto L185
    L181:
        shadowElevation2 = shadowElevation;
        goto L182
    L178:
        tonalElevation2 = tonalElevation;
        goto L179
    L167:
        focusable2 = focusable;
        goto L168
    L163:
        scrollState2 = r8;
        goto L165
    L159:
        modifier2 = r7;
        goto L161
    L145:
        if ($composer2.getDefaultsInvalid() == true) goto L157;
        $composer2.skipToGroupEnd();
        if ((r51 & 8) == 0) goto L151;
        $dirty = $dirty & (-7169);
    L151:
        if ((r51 & 64) == 0) goto L154;
        $dirty = $dirty & (-3670017);
    L154:
        if ((r51 & 128) == 0) goto L156;
        tonalElevation3 = tonalElevation;
        shadowElevation3 = shadowElevation;
        border2 = border;
        $dirty = (-29360129) & $dirty;
        modifier3 = r7;
        scrollState3 = r8;
        matchTextFieldWidth3 = matchTextFieldWidth2;
        shape3 = shape2;
        containerColor3 = containerColor2;
        r0 = 366140493;
        focusable2 = focusable;
        goto L185
    L156:
        tonalElevation3 = tonalElevation;
        shadowElevation3 = shadowElevation;
        border2 = border;
        modifier3 = r7;
        scrollState3 = r8;
        matchTextFieldWidth3 = matchTextFieldWidth2;
        shape3 = shape2;
        containerColor3 = containerColor2;
        r0 = 366140493;
        focusable2 = focusable;
        goto L185
    L137:
        if (($dirty1 & 147) != 146) goto L142;
        if ($composer2.getSkipping() == false) goto L142;
        $composer2.skipToGroupEnd();
        focusable3 = focusable;
        shadowElevation4 = shadowElevation;
        border3 = border;
        $composer3 = $composer2;
        modifier4 = r7;
        scrollState4 = r8;
        matchTextFieldWidth4 = matchTextFieldWidth2;
        shape4 = shape2;
        containerColor4 = containerColor2;
        tonalElevation4 = tonalElevation;
        goto L192
    L127:
        if (($changed1 & 384) != 0) goto L135;
        if ($composer2.changed(this) == false) goto L131;
        int r20 = 256;
    L132:
        $dirty1 = $dirty1 | r20;
        goto L135
    L131:
        r20 = 128;
        goto L132
    L116:
        if (($changed1 & 48) != 0) goto L124;
        if ($composer2.changedInstance(r47) == false) goto L120;
        int r18 = 32;
    L121:
        $dirty1 = $dirty1 | r18;
        goto L124
    L120:
        r18 = 16;
        goto L121
    L105:
        if (($changed1 & 6) != 0) goto L113;
        if ($composer2.changed(border) == false) goto L109;
        int r16 = 4;
    L110:
        $dirty1 = $dirty1 | r16;
        goto L113
    L109:
        r16 = 2;
        goto L110
    L94:
        if (($changed & 805306368) != 0) goto L101;
        if ($composer2.changed(shadowElevation) == false) goto L98;
        int r24 = 536870912;
    L99:
        $dirty = $dirty | r24;
        goto L101
    L98:
        r24 = 268435456;
        goto L99
    L83:
        if (($changed & 100663296) != 0) goto L90;
        if ($composer2.changed(tonalElevation) == false) goto L87;
        int r23 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L88:
        $dirty = $dirty | r23;
        goto L90
    L87:
        r23 = 33554432;
        goto L88
    L71:
        if ((r51 & 128) != 0) goto L75;
        containerColor2 = containerColor;
        if ($composer2.changed(containerColor2) == false) goto L76;
        int r21 = 8388608;
    L77:
        $dirty = $dirty | r21;
    L76:
        r21 = 4194304;
        goto L77
    L75:
        containerColor2 = containerColor;
        goto L76
    L60:
        if ((r51 & 64) != 0) goto L64;
        shape2 = shape;
        if ($composer2.changed(shape2) == false) goto L65;
        int r22 = 1048576;
    L66:
        $dirty = $dirty | r22;
    L65:
        r22 = 524288;
        goto L66
    L64:
        shape2 = shape;
        goto L65
    L50:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L56;
        matchTextFieldWidth2 = matchTextFieldWidth;
        if ($composer2.changed(matchTextFieldWidth2) == false) goto L54;
        int r19 = 131072;
    L55:
        $dirty = $dirty | r19;
        goto L58
    L54:
        r19 = 65536;
        goto L55
    L56:
        matchTextFieldWidth2 = matchTextFieldWidth;
        goto L58
    L38:
        if ((r51 & 8) != 0) goto L42;
        r8 = scrollState;
        if ($composer2.changed(r8) == false) goto L43;
        int r110 = 2048;
    L44:
        $dirty = $dirty | r110;
    L43:
        r110 = 1024;
        goto L44
    L42:
        r8 = scrollState;
        goto L43
    L28:
        if (($changed & 384) != 0) goto L34;
        r7 = modifier;
        if ($composer2.changed(r7) == false) goto L32;
        int r111 = 256;
    L33:
        $dirty = $dirty | r111;
        goto L36
    L32:
        r111 = 128;
        goto L33
    L34:
        r7 = modifier;
        goto L36
    L17:
        if (($changed & 48) != 0) goto L23;
        r9 = r36;
        if ($composer2.changedInstance(r9) == false) goto L21;
        int r14 = 32;
    L22:
        $dirty = $dirty | r14;
        goto L24
    L21:
        r14 = 16;
        goto L22
    L23:
        r9 = r36;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r6 = expanded;
        if ($composer2.changed(r6) == false) goto L10;
        int r10 = 4;
    L11:
        $dirty = $dirty | r10;
        goto L14
    L10:
        r10 = 2;
        goto L11
    L12:
        r6 = expanded;
        goto L14
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8, types: [androidx.compose.material3.ExposedDropdownMenuBoxScope] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with customization options parameters.")
    public final /* synthetic */ void ExposedDropdownMenu(final boolean r26, final Function0 r27, Modifier r28, ScrollState r29, final Function3 r30, Composer r31, final int r32, final int r33) {
        Composer r1 = r31.startRestartGroup(1729549851);
        ComposerKt.sourceInformation(r1, "C(ExposedDropdownMenu)P(1,3,2,4)449@20337L21,458@20677L5,459@20726L14,452@20429L498:ExposedDropdownMenu.android.kt#uh7d8r");
        int r2 = r32;
        if ((r33 & 1) == 0) goto L6;
        r2 = r2 | 6;
        boolean r9 = r26;
    L14:
        if ((r33 & 2) == 0) goto L17;
        r2 = r2 | 48;
        Function0 r10 = r27;
    L24:
        int r3 = r33 & 4;
        if (r3 == 0) goto L28;
        r2 = r2 | 384;
        final Modifier r4 = r28;
    L36:
        if ((r32 & 3072) == 0) goto L38;
        final ScrollState r5 = r29;
    L47:
        if ((r33 & 16) == 0) goto L50;
        r2 = r2 | 24576;
        Function3 r6 = r30;
    L58:
        if ((r33 & 32) == 0) goto L61;
        r2 = r2 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        ?? r8 = this;
    L69:
        if ((74899 & r2) == 74898) goto L71;
    L74:
        r1.startDefaults();
        if ((r32 & 1) != 0) goto L77;
    L83:
        if (r3 == 0) goto L85;
        Modifier.Companion r7 = Modifier.Companion;
    L87:
        if ((r33 & 8) == 0) goto L89;
        r2 = r2 & (-7169);
        Modifier r11 = r7;
        ScrollState r12 = ScrollKt.rememberScrollState(0, r1, 0, 1);
    L90:
        r1.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L93;
        ComposerKt.traceEventStart(1729549851, r2, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.android.kt:452)");
    L93:
        Composer r21 = r1;
        Function3 r20 = r6;
        r8.m2208ExposedDropdownMenuvNxi1II(r9, r10, r11, r12, true, MenuDefaults.INSTANCE.getShape(r1, 6), MenuDefaults.INSTANCE.getContainerColor(r1, 6), MenuDefaults.INSTANCE.m2355getTonalElevationD9Ej5fM(), MenuDefaults.INSTANCE.m2354getShadowElevationD9Ej5fM(), null, r20, r21, ((((r2 & 14) | 918577152) | (r2 & 112)) | (r2 & 896)) | (r2 & 7168), ((r2 >> 12) & 14) | ((r2 >> 12) & 112), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L96;
        ComposerKt.traceEventEnd();
    L96:
        r4 = r11;
        r5 = r12;
        Composer r22 = r21;
    L97:
        ScopeUpdateScope r13 = r22.endRestartGroup();
        if (r13 == null) goto L101;
        r13.updateScope(new AnonymousClass5(this, r26, r27, r4, r5, r30, r32, r33));
        return;
    L101:
        return;
    L89:
        r11 = r7;
        r12 = r5;
        goto L90
    L85:
        r7 = r4;
        goto L87
    L77:
        if (r1.getDefaultsInvalid() == true) goto L83;
        r1.skipToGroupEnd();
        if ((r33 & 8) == 0) goto L82;
        r2 = r2 & (-7169);
    L82:
        r11 = r4;
        r12 = r5;
        goto L90
    L71:
        if (r1.getSkipping() == false) goto L74;
        r1.skipToGroupEnd();
        r22 = r1;
        goto L97
    L61:
        if ((r32 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        Object r14 = this;
        if (r1.changed(r14) == false) goto L65;
        int r15 = 131072;
    L66:
        r2 = r2 | r15;
        r8 = r14;
        goto L69
    L65:
        r15 = 65536;
        goto L66
    L67:
        r8 = this;
        goto L69
    L50:
        if ((r32 & 24576) != 0) goto L56;
        r6 = r30;
        if (r1.changedInstance(r6) == false) goto L54;
        int r16 = 16384;
    L55:
        r2 = r2 | r16;
        goto L58
    L54:
        r16 = 8192;
        goto L55
    L56:
        r6 = r30;
        goto L58
    L38:
        if ((r33 & 8) != 0) goto L42;
        r5 = r29;
        if (r1.changed(r5) == false) goto L43;
        int r17 = 2048;
    L44:
        r2 = r2 | r17;
    L43:
        r17 = 1024;
        goto L44
    L42:
        r5 = r29;
        goto L43
    L28:
        if ((r32 & 384) != 0) goto L34;
        r4 = r28;
        if (r1.changed(r4) == false) goto L32;
        int r18 = 256;
    L33:
        r2 = r2 | r18;
        goto L36
    L32:
        r18 = 128;
        goto L33
    L34:
        r4 = r28;
        goto L36
    L17:
        if ((r32 & 48) != 0) goto L23;
        r10 = r27;
        if (r1.changedInstance(r10) == false) goto L21;
        int r19 = 32;
    L22:
        r2 = r2 | r19;
        goto L24
    L21:
        r19 = 16;
        goto L22
    L23:
        r10 = r27;
        goto L24
    L6:
        if ((r32 & 6) != 0) goto L12;
        r9 = r26;
        if (r1.changed(r9) == false) goto L10;
        int r23 = 4;
    L11:
        r2 = r2 | r23;
        goto L14
    L10:
        r23 = 2;
        goto L11
    L12:
        r9 = r26;
        goto L14
    }
}
