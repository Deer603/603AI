package androidx.compose.material;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
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
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001an\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00012\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u0012¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001ad\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00012\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u0012¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001ac\u0010\u001a\u001a\u00020\u00052\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00050\u0012¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0002\u0010\"\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"DefaultMenuProperties", "Landroidx/compose/ui/window/PopupProperties;", "getDefaultMenuProperties", "()Landroidx/compose/ui/window/PopupProperties;", "DropdownMenu", "", "expanded", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "offset", "Landroidx/compose/ui/unit/DpOffset;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "properties", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "DropdownMenu-4kj-_NE", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/ScrollState;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DropdownMenu-ILWXrKs", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DropdownMenuItem", "onClick", "enabled", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Landroidx/compose/foundation/layout/RowScope;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidMenu_androidKt {
    private static final PopupProperties DefaultMenuProperties = null;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replaced by a DropdownMenu function with a ScrollState parameter", replaceWith = @ReplaceWith(expression = "DropdownMenu(expanded,onDismissRequest, modifier, offset, rememberScrollState(), properties, content)", imports = {"androidx.compose.foundation.rememberScrollState"}))
    /* JADX INFO: renamed from: DropdownMenu-ILWXrKs, reason: not valid java name */
    public static final /* synthetic */ void m1521DropdownMenuILWXrKs(final boolean expanded, final Function0 onDismissRequest, Modifier modifier, long offset, PopupProperties properties, final Function3 content, Composer $composer, final int $changed, final int r34) {
        Composer $composer2 = $composer.startRestartGroup(-840283139);
        ComposerKt.sourceInformation($composer2, "C(DropdownMenu)P(1,4,2,3:c#ui.unit.DpOffset,5)61@2356L21,56@2192L251:AndroidMenu.android.kt#jmzs0o");
        int $dirty = $changed;
        if ((r34 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        boolean r9 = expanded;
    L14:
        if ((r34 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Function0 r10 = onDismissRequest;
    L24:
        int r3 = r34 & 4;
        if (r3 == 0) goto L28;
        $dirty = $dirty | 384;
        Modifier r4 = modifier;
    L35:
        int r5 = r34 & 8;
        if (r5 == 0) goto L39;
        $dirty = $dirty | 3072;
        long r6 = offset;
    L46:
        int r11 = r34 & 16;
        if (r11 == 0) goto L50;
        $dirty = $dirty | 24576;
    L58:
        if ((r34 & 32) == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L69:
        if ((74899 & $dirty) == 74898) goto L71;
        boolean r14 = true;
    L73:
        if ($composer2.shouldExecute(r14, $dirty & 1) == false) goto L90;
        if (r3 == 0) goto L76;
        Modifier modifier2 = Modifier.Companion;
        int r7 = r11;
    L77:
        if (r5 == 0) goto L79;
        long offset2 = DpKt.m6994DpOffsetYgX7TsA(Dp.m6973constructorimpl(0), Dp.m6973constructorimpl(0));
    L80:
        if (r7 == 0) goto L82;
        PopupProperties properties2 = new PopupProperties(true, false, false, false, 14, null);
    L84:
        if (ComposerKt.isTraceInProgress() == false) goto L86;
        ComposerKt.traceEventStart(-840283139, $dirty, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:56)");
    L86:
        Composer $composer3 = $composer2;
        m1520DropdownMenu4kj_NE(r9, r10, modifier2, offset2, ScrollKt.rememberScrollState(0, $composer2, 0, 1), properties2, content, $composer3, ((((($dirty & 14) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (($dirty << 3) & 458752)) | (3670016 & ($dirty << 3)), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L89;
        ComposerKt.traceEventEnd();
    L89:
        final Modifier modifier3 = modifier2;
        final long offset3 = offset2;
        final PopupProperties properties3 = properties2;
    L91:
        ScopeUpdateScope r12 = $composer3.endRestartGroup();
        if (r12 == null) goto L95;
        r12.updateScope(new AndroidMenu_androidKt$DropdownMenu$1(expanded, onDismissRequest, modifier3, offset3, properties3, content, $changed, r34));
        return;
    L95:
        return;
    L82:
        properties2 = properties;
        goto L84
    L79:
        offset2 = r6;
        goto L80
    L76:
        r7 = r11;
        modifier2 = r4;
        goto L77
    L90:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        modifier3 = r4;
        offset3 = r6;
        properties3 = properties;
        goto L91
    L71:
        r14 = false;
        goto L73
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L69;
        if ($composer2.changedInstance(content) == false) goto L65;
        int r15 = 131072;
    L66:
        $dirty = $dirty | r15;
        goto L69
    L65:
        r15 = 65536;
        goto L66
    L50:
        if (($changed & 24576) != 0) goto L58;
        if ($composer2.changed(properties) == false) goto L54;
        int r13 = 16384;
    L55:
        $dirty = $dirty | r13;
        goto L58
    L54:
        r13 = 8192;
        goto L55
    L39:
        if (($changed & 3072) != 0) goto L45;
        r6 = offset;
        if ($composer2.changed(r6) == false) goto L43;
        int r16 = 2048;
    L44:
        $dirty = $dirty | r16;
        goto L46
    L43:
        r16 = 1024;
        goto L44
    L45:
        r6 = offset;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L32;
        int r8 = 256;
    L33:
        $dirty = $dirty | r8;
        goto L35
    L32:
        r8 = 128;
        goto L33
    L34:
        r4 = modifier;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r10 = onDismissRequest;
        if ($composer2.changedInstance(r10) == false) goto L21;
        int r17 = 32;
    L22:
        $dirty = $dirty | r17;
        goto L24
    L21:
        r17 = 16;
        goto L22
    L23:
        r10 = onDismissRequest;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r9 = expanded;
        if ($composer2.changed(r9) == false) goto L10;
        int r18 = 4;
    L11:
        $dirty = $dirty | r18;
        goto L14
    L10:
        r18 = 2;
        goto L11
    L12:
        r9 = expanded;
        goto L14
    }

    /* JADX INFO: renamed from: DropdownMenu-4kj-_NE, reason: not valid java name */
    public static final void m1520DropdownMenu4kj_NE(boolean expanded, final Function0<Unit> r28, Modifier modifier, long offset, ScrollState scrollState, PopupProperties properties, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r34, Composer $composer, final int $changed, final int r37) {
        Composer $composer2 = $composer.startRestartGroup(-2135362555);
        ComposerKt.sourceInformation($composer2, "C(DropdownMenu)P(1,4,2,3:c#ui.unit.DpOffset,6,5)76@2725L42:AndroidMenu.android.kt#jmzs0o");
        int $dirty = $changed;
        if ((r37 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        boolean r8 = expanded;
    L14:
        if ((r37 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Function0<Unit> r2 = r28;
    L24:
        int r4 = r37 & 4;
        if (r4 == 0) goto L28;
        $dirty = $dirty | 384;
        Modifier modifier2 = modifier;
    L35:
        int r7 = r37 & 8;
        if (r7 == 0) goto L39;
        $dirty = $dirty | 3072;
        long offset2 = offset;
    L47:
        if (($changed & 24576) == 0) goto L49;
        ScrollState scrollState2 = scrollState;
    L57:
        int r13 = r37 & 32;
        if (r13 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        PopupProperties r14 = properties;
    L69:
        if ((r37 & 64) == 0) goto L72;
        $dirty = $dirty | 1572864;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r15 = r34;
    L79:
        int $dirty2 = $dirty;
        if (($dirty & 599187) == 599186) goto L82;
        boolean r0 = true;
    L84:
        if ($composer2.shouldExecute(r0, $dirty2 & 1) == false) goto L132;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "122@5751L21");
        if (($changed & 1) != 0) goto L88;
    L94:
        if (r4 == 0) goto L96;
        modifier2 = Modifier.Companion;
    L96:
        if (r7 == 0) goto L100;
        offset2 = DpKt.m6994DpOffsetYgX7TsA(Dp.m6973constructorimpl(0), Dp.m6973constructorimpl(0));
    L100:
        if ((r37 & 16) == 0) goto L102;
        int $dirty3 = $dirty2 & (-57345);
        scrollState2 = ScrollKt.rememberScrollState(0, $composer2, 0, 1);
    L103:
        if (r13 == 0) goto L105;
        PopupProperties properties2 = DefaultMenuProperties;
        final Modifier modifier3 = modifier2;
        long offset3 = offset2;
        final ScrollState scrollState3 = scrollState2;
    L106:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L109;
        ComposerKt.traceEventStart(-2135362555, $dirty3, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:75)");
    L109:
        ComposerKt.sourceInformationMarkerStart($composer2, 875728704, "CC(remember):AndroidMenu.android.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L113;
        Object value$iv = new MutableTransitionState(false);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L113:
        final MutableTransitionState expandedStates = (MutableTransitionState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        expandedStates.setTargetState(Boolean.valueOf(r8));
        if (((Boolean) expandedStates.getCurrentState()).booleanValue() == false) goto L116;
    L119:
        $composer2.startReplaceGroup(1377962068);
        ComposerKt.sourceInformation($composer2, "80@2915L51,81@3002L7,83@3104L139,91@3414L282,87@3253L443");
        ComposerKt.sourceInformationMarkerStart($composer2, 875734793, "CC(remember):AndroidMenu.android.kt#9igjgp");
        Object it$iv2 = $composer2.rememberedValue();
        if (it$iv2 != Composer.Companion.getEmpty()) goto L123;
        Object value$iv2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m4744boximpl(TransformOrigin.Companion.m4757getCenterSzJe1aQ()), null, 2, null);
        $composer2.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L123:
        final MutableState transformOriginState = (MutableState) it$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ProvidableCompositionLocal<Density> r1 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r10 = $composer2.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Density density = (Density) r10;
        ComposerKt.sourceInformationMarkerStart($composer2, 875740929, "CC(remember):AndroidMenu.android.kt#9igjgp");
        Object it$iv3 = $composer2.rememberedValue();
        if (it$iv3 != Composer.Companion.getEmpty()) goto L127;
        Object value$iv3 = (Function2) new AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1(transformOriginState);
        $composer2.updateRememberedValue(value$iv3);
        it$iv3 = value$iv3;
    L127:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        DropdownMenuPositionProvider popupPositionProvider = new DropdownMenuPositionProvider(offset3, density, (Function2) it$iv3, null);
        DropdownMenuPositionProvider r3 = popupPositionProvider;
        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r21 = r15;
        AndroidPopup_androidKt.Popup(r3, r2, properties2, ComposableLambdaKt.rememberComposableLambda(-47803778, true, new AndroidMenu_androidKt$DropdownMenu$2(expandedStates, transformOriginState, scrollState3, modifier3, r21), $composer2, 54), $composer2, (($dirty3 >> 9) & 896) | (($dirty3 & 112) | 3072), 0);
        Composer $composer3 = $composer2;
        $composer3.endReplaceGroup();
    L129:
        if (ComposerKt.isTraceInProgress() == false) goto L131;
        ComposerKt.traceEventEnd();
    L131:
        final PopupProperties properties3 = properties2;
        final ScrollState scrollState4 = scrollState3;
        final Modifier modifier4 = modifier3;
        final long offset4 = offset3;
    L133:
        ScopeUpdateScope r11 = $composer3.endRestartGroup();
        if (r11 == null) goto L137;
        final boolean r5 = r8;
        r11.updateScope(new AndroidMenu_androidKt$DropdownMenu$3(r5, r28, modifier4, offset4, scrollState4, properties3, r34, $changed, r37));
        return;
    L137:
        return;
    L116:
        if (((Boolean) expandedStates.getTargetState()).booleanValue() == true) goto L119;
        $composer2.startReplaceGroup(1378753932);
        $composer2.endReplaceGroup();
        $dirty3 = $dirty3;
        $composer3 = $composer2;
        goto L129
    L105:
        modifier3 = modifier2;
        offset3 = offset2;
        scrollState3 = scrollState2;
        properties2 = r14;
        goto L106
    L102:
        $dirty3 = $dirty2;
        goto L103
    L88:
        if ($composer2.getDefaultsInvalid() == true) goto L94;
        $composer2.skipToGroupEnd();
        if ((r37 & 16) == 0) goto L93;
        $dirty3 = $dirty2 & (-57345);
        modifier3 = modifier2;
        offset3 = offset2;
        scrollState3 = scrollState2;
        properties2 = r14;
        goto L106
    L93:
        modifier3 = modifier2;
        offset3 = offset2;
        scrollState3 = scrollState2;
        properties2 = r14;
        $dirty3 = $dirty2;
        goto L106
    L132:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        modifier4 = modifier2;
        offset4 = offset2;
        scrollState4 = scrollState2;
        properties3 = r14;
        goto L133
    L82:
        r0 = false;
        goto L84
    L72:
        if (($changed & 1572864) != 0) goto L78;
        r15 = r34;
        if ($composer2.changedInstance(r15) == false) goto L76;
        int r16 = 1048576;
    L77:
        $dirty = $dirty | r16;
        goto L79
    L76:
        r16 = 524288;
        goto L77
    L78:
        r15 = r34;
        goto L79
    L61:
        if ((196608 & $changed) != 0) goto L67;
        r14 = properties;
        if ($composer2.changed(r14) == false) goto L65;
        int r17 = 131072;
    L66:
        $dirty = $dirty | r17;
        goto L69
    L65:
        r17 = 65536;
        goto L66
    L67:
        r14 = properties;
        goto L69
    L49:
        if ((r37 & 16) != 0) goto L53;
        scrollState2 = scrollState;
        if ($composer2.changed(scrollState2) == false) goto L54;
        int r18 = 16384;
    L55:
        $dirty = $dirty | r18;
    L54:
        r18 = 8192;
        goto L55
    L53:
        scrollState2 = scrollState;
        goto L54
    L39:
        if (($changed & 3072) != 0) goto L45;
        offset2 = offset;
        if ($composer2.changed(offset2) == false) goto L43;
        int r12 = 2048;
    L44:
        $dirty = $dirty | r12;
        goto L47
    L43:
        r12 = 1024;
        goto L44
    L45:
        offset2 = offset;
        goto L47
    L28:
        if (($changed & 384) != 0) goto L34;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L32;
        int r9 = 256;
    L33:
        $dirty = $dirty | r9;
        goto L35
    L32:
        r9 = 128;
        goto L33
    L34:
        modifier2 = modifier;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r2 = r28;
        if ($composer2.changedInstance(r2) == false) goto L21;
        int r6 = 32;
    L22:
        $dirty = $dirty | r6;
        goto L24
    L21:
        r6 = 16;
        goto L22
    L23:
        r2 = r28;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r8 = expanded;
        if ($composer2.changed(r8) == false) goto L10;
        int r19 = 4;
    L11:
        $dirty = $dirty | r19;
        goto L14
    L10:
        r19 = 2;
        goto L11
    L12:
        r8 = expanded;
        goto L14
    }

    public static final void DropdownMenuItem(final Function0<Unit> r18, Modifier modifier, boolean enabled, PaddingValues contentPadding, MutableInteractionSource interactionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r23, Composer $composer, final int $changed, final int r26) {
        Composer $composer2 = $composer.startRestartGroup(-1988562892);
        ComposerKt.sourceInformation($composer2, "C(DropdownMenuItem)P(5,4,2,1,3)112@3962L159:AndroidMenu.android.kt#jmzs0o");
        int $dirty = $changed;
        if ((r26 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function0<Unit> r8 = r18;
    L13:
        int r2 = r26 & 2;
        if (r2 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier r3 = modifier;
    L24:
        int r4 = r26 & 4;
        if (r4 == 0) goto L28;
        $dirty = $dirty | 384;
        boolean r5 = enabled;
    L35:
        int r6 = r26 & 8;
        if (r6 == 0) goto L39;
        $dirty = $dirty | 3072;
    L46:
        int r10 = r26 & 16;
        if (r10 == 0) goto L50;
        $dirty = $dirty | 24576;
    L58:
        if ((r26 & 32) == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r13 = r23;
    L69:
        if ((74899 & $dirty) == 74898) goto L71;
        boolean r12 = true;
    L73:
        if ($composer2.shouldExecute(r12, $dirty & 1) == false) goto L93;
        if (r2 == 0) goto L76;
        Modifier modifier2 = Modifier.Companion;
    L77:
        if (r4 == 0) goto L79;
        boolean enabled2 = true;
        int r7 = r10;
    L80:
        if (r6 == 0) goto L82;
        PaddingValues contentPadding2 = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
    L83:
        if (r7 == 0) goto L85;
        MutableInteractionSource interactionSource2 = null;
    L87:
        if (ComposerKt.isTraceInProgress() == false) goto L89;
        ComposerKt.traceEventStart(-1988562892, $dirty, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:112)");
    L89:
        MenuKt.DropdownMenuItemContent(r8, modifier2, enabled2, contentPadding2, interactionSource2, r13, $composer2, ((((($dirty & 14) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (57344 & $dirty)) | (458752 & $dirty), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L92;
        ComposerKt.traceEventEnd();
    L92:
        final Modifier modifier3 = modifier2;
        final boolean enabled3 = enabled2;
        final PaddingValues contentPadding3 = contentPadding2;
        final MutableInteractionSource interactionSource3 = interactionSource2;
    L94:
        ScopeUpdateScope r9 = $composer2.endRestartGroup();
        if (r9 == null) goto L98;
        r9.updateScope(new AnonymousClass1(r18, modifier3, enabled3, contentPadding3, interactionSource3, r23, $changed, r26));
        return;
    L98:
        return;
    L85:
        interactionSource2 = interactionSource;
        goto L87
    L82:
        contentPadding2 = contentPadding;
        goto L83
    L79:
        r7 = r10;
        enabled2 = r5;
        goto L80
    L76:
        modifier2 = r3;
        goto L77
    L93:
        $composer2.skipToGroupEnd();
        contentPadding3 = contentPadding;
        modifier3 = r3;
        enabled3 = r5;
        interactionSource3 = interactionSource;
        goto L94
    L71:
        r12 = false;
        goto L73
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        r13 = r23;
        if ($composer2.changedInstance(r13) == false) goto L65;
        int r14 = 131072;
    L66:
        $dirty = $dirty | r14;
        goto L69
    L65:
        r14 = 65536;
        goto L66
    L67:
        r13 = r23;
        goto L69
    L50:
        if (($changed & 24576) != 0) goto L58;
        if ($composer2.changed(interactionSource) == false) goto L54;
        int r15 = 16384;
    L55:
        $dirty = $dirty | r15;
        goto L58
    L54:
        r15 = 8192;
        goto L55
    L39:
        if (($changed & 3072) != 0) goto L46;
        if ($composer2.changed(contentPadding) == false) goto L43;
        int r11 = 2048;
    L44:
        $dirty = $dirty | r11;
        goto L46
    L43:
        r11 = 1024;
        goto L44
    L28:
        if (($changed & 384) != 0) goto L34;
        r5 = enabled;
        if ($composer2.changed(r5) == false) goto L32;
        int r16 = 256;
    L33:
        $dirty = $dirty | r16;
        goto L35
    L32:
        r16 = 128;
        goto L33
    L34:
        r5 = enabled;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r3 = modifier;
        if ($composer2.changed(r3) == false) goto L21;
        int r17 = 32;
    L22:
        $dirty = $dirty | r17;
        goto L24
    L21:
        r17 = 16;
        goto L22
    L23:
        r3 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r8 = r18;
        if ($composer2.changedInstance(r8) == false) goto L10;
        int r19 = 4;
    L11:
        $dirty = $dirty | r19;
        goto L13
    L10:
        r19 = 2;
        goto L11
    L12:
        r8 = r18;
        goto L13
    }

    static {
        DefaultMenuProperties = new PopupProperties(true, false, false, false, 14, null);
    }

    public static final PopupProperties getDefaultMenuProperties() {
        return DefaultMenuProperties;
    }
}
