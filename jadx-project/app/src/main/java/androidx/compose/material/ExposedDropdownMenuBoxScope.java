package androidx.compose.material;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt;
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
import androidx.compose.ui.unit.DpOffset;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: ExposedDropdownMenu.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JU\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\u000e¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\n*\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\u0006H&¨\u0006\u0015"}, d2 = {"Landroidx/compose/material/ExposedDropdownMenuBoxScope;", "", "()V", "ExposedDropdownMenu", "", "expanded", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "exposedDropdownSize", "matchTextFieldWidth", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class ExposedDropdownMenuBoxScope {
    public static final int $stable = 0;

    static {
    }

    public abstract Modifier exposedDropdownSize(Modifier r1, boolean r2);

    public ExposedDropdownMenuBoxScope() {
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

    public final void ExposedDropdownMenu(boolean expanded, final Function0<Unit> r25, Modifier modifier, ScrollState scrollState, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r28, Composer $composer, final int $changed, final int r31) {
        Composer $composer2 = $composer.startRestartGroup(1081438217);
        ComposerKt.sourceInformation($composer2, "C(ExposedDropdownMenu)P(1,3,2,4)196@8236L42:ExposedDropdownMenu.kt#jmzs0o");
        int $dirty = $changed;
        if ((r31 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        boolean r8 = expanded;
    L14:
        if ((r31 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L24:
        int r5 = r31 & 4;
        if (r5 == 0) goto L28;
        $dirty = $dirty | 384;
        Modifier r6 = modifier;
    L36:
        if (($changed & 3072) == 0) goto L38;
        ScrollState r9 = scrollState;
    L47:
        if ((r31 & 16) == 0) goto L50;
        $dirty = $dirty | 24576;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r10 = r28;
    L58:
        if ((r31 & 32) == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        final ExposedDropdownMenuBoxScope r15 = this;
    L69:
        if ((74899 & $dirty) == 74898) goto L71;
        boolean r11 = true;
    L73:
        if ($composer2.shouldExecute(r11, $dirty & 1) == false) goto L116;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "184@7736L21");
        if (($changed & 1) != 0) goto L77;
    L83:
        if (r5 == 0) goto L85;
        Modifier.Companion modifier2 = Modifier.Companion;
    L87:
        if ((r31 & 8) == 0) goto L89;
        int $dirty2 = $dirty & (-7169);
        final Modifier modifier3 = modifier2;
        final ScrollState scrollState2 = ScrollKt.rememberScrollState(0, $composer2, 0, 1);
    L90:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L93;
        ComposerKt.traceEventStart(1081438217, $dirty2, -1, "androidx.compose.material.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:186)");
    L93:
        ComposerKt.sourceInformationMarkerStart($composer2, -1129966017, "CC(remember):ExposedDropdownMenu.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L97;
        Object value$iv = new MutableTransitionState(false);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L97:
        final MutableTransitionState expandedStates = (MutableTransitionState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        expandedStates.setTargetState(Boolean.valueOf(r8));
        if (((Boolean) expandedStates.getCurrentState()).booleanValue() == false) goto L100;
    L103:
        $composer2.startReplaceGroup(-669021506);
        ComposerKt.sourceInformation($composer2, "200@8438L51,201@8529L7,203@8646L147,210@8962L336,207@8807L491");
        ComposerKt.sourceInformationMarkerStart($composer2, -1129959544, "CC(remember):ExposedDropdownMenu.kt#9igjgp");
        Object it$iv2 = $composer2.rememberedValue();
        if (it$iv2 != Composer.Companion.getEmpty()) goto L107;
        Object value$iv2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m4744boximpl(TransformOrigin.Companion.m4757getCenterSzJe1aQ()), null, 2, null);
        $composer2.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L107:
        final MutableState transformOriginState = (MutableState) it$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ProvidableCompositionLocal<Density> r0 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r3 = $composer2.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Density density = (Density) r3;
        long r18 = DpOffset.Companion.m7044getZeroRKDOV3M();
        ComposerKt.sourceInformationMarkerStart($composer2, -1129952792, "CC(remember):ExposedDropdownMenu.kt#9igjgp");
        Object it$iv3 = $composer2.rememberedValue();
        if (it$iv3 != Composer.Companion.getEmpty()) goto L111;
        Object value$iv3 = (Function2) new ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1(transformOriginState);
        $composer2.updateRememberedValue(value$iv3);
        it$iv3 = value$iv3;
    L111:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        DropdownMenuPositionProvider popupPositionProvider = new DropdownMenuPositionProvider(r18, density, (Function2) it$iv3, null);
        DropdownMenuPositionProvider r2 = popupPositionProvider;
        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r17 = r10;
        ExposedDropdownMenuPopup_androidKt.ExposedDropdownMenuPopup(r25, r2, ComposableLambdaKt.rememberComposableLambda(-1167205969, true, new AnonymousClass1(expandedStates, transformOriginState, scrollState2, r15, modifier3, r17), $composer2, 54), $composer2, (($dirty2 >> 3) & 14) | 384, 0);
        Composer $composer3 = $composer2;
        $composer3.endReplaceGroup();
    L113:
        if (ComposerKt.isTraceInProgress() == false) goto L115;
        ComposerKt.traceEventEnd();
    L115:
        final ScrollState scrollState3 = scrollState2;
        final Modifier modifier4 = modifier3;
    L117:
        ScopeUpdateScope r12 = $composer3.endRestartGroup();
        if (r12 == null) goto L121;
        final boolean r4 = r8;
        r12.updateScope(new AnonymousClass2(this, r4, r25, modifier4, scrollState3, r28, $changed, r31));
        return;
    L121:
        return;
    L100:
        if (((Boolean) expandedStates.getTargetState()).booleanValue() == true) goto L103;
        $composer2.startReplaceGroup(-668146035);
        $composer2.endReplaceGroup();
        $composer3 = $composer2;
        goto L113
    L89:
        ScrollState r16 = r9;
        $dirty2 = $dirty;
        scrollState2 = r16;
        modifier3 = modifier2;
        goto L90
    L85:
        modifier2 = r6;
        goto L87
    L77:
        if ($composer2.getDefaultsInvalid() == true) goto L83;
        $composer2.skipToGroupEnd();
        if ((r31 & 8) == 0) goto L82;
        $dirty = $dirty & (-7169);
    L82:
        ScrollState r19 = r9;
        $dirty2 = $dirty;
        scrollState2 = r19;
        modifier3 = r6;
        goto L90
    L116:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        modifier4 = r6;
        scrollState3 = r9;
        goto L117
    L71:
        r11 = false;
        goto L73
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        r15 = this;
        if ($composer2.changed(r15) == false) goto L65;
        int r13 = 131072;
    L66:
        $dirty = $dirty | r13;
        goto L69
    L65:
        r13 = 65536;
        goto L66
    L67:
        r15 = this;
        goto L69
    L50:
        if (($changed & 24576) != 0) goto L56;
        r10 = r28;
        if ($composer2.changedInstance(r10) == false) goto L54;
        int r14 = 16384;
    L55:
        $dirty = $dirty | r14;
        goto L58
    L54:
        r14 = 8192;
        goto L55
    L56:
        r10 = r28;
        goto L58
    L38:
        if ((r31 & 8) != 0) goto L42;
        r9 = scrollState;
        if ($composer2.changed(r9) == false) goto L43;
        int r110 = 2048;
    L44:
        $dirty = $dirty | r110;
    L43:
        r110 = 1024;
        goto L44
    L42:
        r9 = scrollState;
        goto L43
    L28:
        if (($changed & 384) != 0) goto L34;
        r6 = modifier;
        if ($composer2.changed(r6) == false) goto L32;
        int r20 = 256;
    L33:
        $dirty = $dirty | r20;
        goto L36
    L32:
        r20 = 128;
        goto L33
    L34:
        r6 = modifier;
        goto L36
    L17:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changedInstance(r25) == false) goto L21;
        int r7 = 32;
    L22:
        $dirty = $dirty | r7;
        goto L24
    L21:
        r7 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L12;
        r8 = expanded;
        if ($composer2.changed(r8) == false) goto L10;
        int r21 = 4;
    L11:
        $dirty = $dirty | r21;
        goto L14
    L10:
        r21 = 2;
        goto L11
    L12:
        r8 = expanded;
        goto L14
    }
}
