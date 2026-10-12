package androidx.compose.material;

import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: SwipeToDismiss.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0081\u0001\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u0014\u001a\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u001a-\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00172\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001c0\rH\u0007¢\u0006\u0002\u0010\u001d\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u001e"}, d2 = {"DISMISS_THRESHOLD", "Landroidx/compose/ui/unit/Dp;", "F", "SwipeToDismiss", "", "state", "Landroidx/compose/material/DismissState;", "modifier", "Landroidx/compose/ui/Modifier;", "directions", "", "Landroidx/compose/material/DismissDirection;", "dismissThresholds", "Lkotlin/Function1;", "Landroidx/compose/material/ThresholdConfig;", "background", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "dismissContent", "(Landroidx/compose/material/DismissState;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "getDismissDirection", "from", "Landroidx/compose/material/DismissValue;", "to", "rememberDismissState", "initialValue", "confirmStateChange", "", "(Landroidx/compose/material/DismissValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/DismissState;", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SwipeToDismissKt {
    private static final float DISMISS_THRESHOLD = 0.0f;

    public static final /* synthetic */ float access$getDISMISS_THRESHOLD$p() {
        return DISMISS_THRESHOLD;
    }

    public static final /* synthetic */ DismissDirection access$getDismissDirection(DismissValue from, DismissValue to) {
        return getDismissDirection(from, to);
    }

    public static final DismissState rememberDismissState(final DismissValue initialValue, final Function1 r9, Composer $composer, int $changed, int r12) {
        ComposerKt.sourceInformationMarkerStart($composer, -1753522702, "C(rememberDismissState)P(1)136@5386L62,136@5321L127:SwipeToDismiss.kt#jmzs0o");
        if ((r12 & 1) == 0) goto L6;
        initialValue = DismissValue.Default;
    L6:
        if ((r12 & 2) == 0) goto L9;
        Function1 confirmStateChange = C04511.INSTANCE;
        r9 = confirmStateChange;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(-1753522702, $changed, -1, "androidx.compose.material.rememberDismissState (SwipeToDismiss.kt:135)");
    L11:
        boolean r13 = false;
        Object[] r0 = new Object[0];
        Saver<DismissState, DismissValue> r1 = DismissState.Companion.Saver(r9);
        ComposerKt.sourceInformationMarkerStart($composer, 1006273304, "CC(remember):SwipeToDismiss.kt#9igjgp");
        if ((($changed & 14) ^ 6) <= 4) goto L16;
        if ($composer.changed(initialValue) == false) goto L16;
    L17:
        boolean r2 = true;
    L20:
        if ((($changed & 112) ^ 48) <= 32) goto L24;
        if ($composer.changed(r9) == false) goto L24;
    L25:
        r13 = true;
    L26:
        boolean invalid$iv = r13 | r2;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L29;
    L32:
        Object value$iv = (Function0) new SwipeToDismissKt$rememberDismissState$2$1(initialValue, r9);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L33:
        ComposerKt.sourceInformationMarkerEnd($composer);
        DismissState r10 = (DismissState) RememberSaveableKt.m3923rememberSaveable(r0, r1, null, (Function0) it$iv, $composer, 0, 4);
        if (ComposerKt.isTraceInProgress() == false) goto L36;
        ComposerKt.traceEventEnd();
    L36:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r10;
    L29:
        if (it$iv != Composer.Companion.getEmpty()) goto L33;
    L24:
        if (($changed & 48) != 32) goto L26;
    L16:
        if (($changed & 6) == 4) goto L17;
        r2 = false;
        goto L20
    }

    public static final void SwipeToDismiss(final DismissState state, Modifier modifier, Set<? extends DismissDirection> r21, Function1<? super DismissDirection, ? extends ThresholdConfig> r22, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r23, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r24, Composer $composer, final int $changed, final int r27) {
        Composer $composer2 = $composer.startRestartGroup(634380143);
        ComposerKt.sourceInformation($composer2, "C(SwipeToDismiss)P(5,4,1,3)166@6607L1516,166@6578L1545:SwipeToDismiss.kt#jmzs0o");
        int $dirty = $changed;
        if ((r27 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        DismissState r2 = state;
    L13:
        int r4 = r27 & 2;
        if (r4 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier r5 = modifier;
    L24:
        int r6 = r27 & 4;
        if (r6 == 0) goto L28;
        $dirty = $dirty | 384;
    L35:
        int r9 = r27 & 8;
        if (r9 == 0) goto L39;
        $dirty = $dirty | 3072;
        Function1<? super DismissDirection, ? extends ThresholdConfig> r10 = r22;
    L47:
        if ((r27 & 16) == 0) goto L50;
        $dirty = $dirty | 24576;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r11 = r23;
    L58:
        if ((r27 & 32) == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L69:
        if ((74899 & $dirty) == 74898) goto L71;
        boolean r14 = true;
    L73:
        if ($composer2.shouldExecute(r14, $dirty & 1) == false) goto L90;
        if (r4 == 0) goto L76;
        Modifier modifier2 = Modifier.Companion;
    L77:
        if (r6 == 0) goto L79;
        final Set<? extends DismissDirection> r15 = SetsKt.setOf(new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
    L80:
        if (r9 == 0) goto L82;
        final Function1<? super DismissDirection, ? extends ThresholdConfig> r16 = AnonymousClass1.INSTANCE;
    L84:
        if (ComposerKt.isTraceInProgress() == false) goto L86;
        ComposerKt.traceEventStart(634380143, $dirty, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
    L86:
        final DismissState r17 = r2;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r18 = r11;
        final Set<? extends DismissDirection> r3 = r15;
        BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.rememberComposableLambda(338007641, true, new AnonymousClass2(r15, r16, r17, r18, r24), $composer2, 54), $composer2, (($dirty >> 3) & 14) | 3072, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L89;
        ComposerKt.traceEventEnd();
    L89:
        final Modifier modifier3 = modifier2;
        final Function1<? super DismissDirection, ? extends ThresholdConfig> r7 = r16;
    L91:
        ScopeUpdateScope r12 = $composer2.endRestartGroup();
        if (r12 == null) goto L95;
        r12.updateScope(new AnonymousClass3(state, modifier3, r3, r7, r23, r24, $changed, r27));
        return;
    L95:
        return;
    L82:
        r16 = r10;
        goto L84
    L79:
        r15 = r21;
        goto L80
    L76:
        modifier2 = r5;
        goto L77
    L90:
        $composer2.skipToGroupEnd();
        r3 = r21;
        modifier3 = r5;
        r7 = r10;
        goto L91
    L71:
        r14 = false;
        goto L73
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L69;
        if ($composer2.changedInstance(r24) == false) goto L65;
        int r19 = 131072;
    L66:
        $dirty = $dirty | r19;
        goto L69
    L65:
        r19 = 65536;
        goto L66
    L50:
        if (($changed & 24576) != 0) goto L56;
        r11 = r23;
        if ($composer2.changedInstance(r11) == false) goto L54;
        int r13 = 16384;
    L55:
        $dirty = $dirty | r13;
        goto L58
    L54:
        r13 = 8192;
        goto L55
    L56:
        r11 = r23;
        goto L58
    L39:
        if (($changed & 3072) != 0) goto L45;
        r10 = r22;
        if ($composer2.changedInstance(r10) == false) goto L43;
        int r110 = 2048;
    L44:
        $dirty = $dirty | r110;
        goto L47
    L43:
        r110 = 1024;
        goto L44
    L45:
        r10 = r22;
        goto L47
    L28:
        if (($changed & 384) != 0) goto L35;
        if ($composer2.changedInstance(r21) == false) goto L32;
        int r20 = 256;
    L33:
        $dirty = $dirty | r20;
        goto L35
    L32:
        r20 = 128;
        goto L33
    L17:
        if (($changed & 48) != 0) goto L23;
        r5 = modifier;
        if ($composer2.changed(r5) == false) goto L21;
        int r8 = 32;
    L22:
        $dirty = $dirty | r8;
        goto L24
    L21:
        r8 = 16;
        goto L22
    L23:
        r5 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r2 = state;
        if ($composer2.changed(r2) == false) goto L10;
        int r25 = 4;
    L11:
        $dirty = $dirty | r25;
        goto L13
    L10:
        r25 = 2;
        goto L11
    L12:
        r2 = state;
        goto L13
    }

    private static final DismissDirection getDismissDirection(DismissValue from, DismissValue to) {
        if (from == to) goto L5;
    L7:
        if (from == to) goto L9;
    L11:
        if (from != to) goto L16;
        if (from != DismissValue.DismissedToStart) goto L16;
        return DismissDirection.EndToStart;
    L16:
        if (from != DismissValue.Default) goto L21;
        if (to != DismissValue.DismissedToEnd) goto L21;
        return DismissDirection.StartToEnd;
    L21:
        if (from != DismissValue.Default) goto L26;
        if (to != DismissValue.DismissedToStart) goto L26;
        return DismissDirection.EndToStart;
    L26:
        if (from != DismissValue.DismissedToEnd) goto L31;
        if (to != DismissValue.Default) goto L31;
        return DismissDirection.StartToEnd;
    L31:
        if (from == DismissValue.DismissedToStart) goto L33;
        return null;
    L33:
        if (to == DismissValue.Default) goto L41;
        return null;
    L41:
        return DismissDirection.EndToStart;
    L9:
        if (from != DismissValue.DismissedToEnd) goto L11;
        return DismissDirection.StartToEnd;
    L5:
        if (from != DismissValue.Default) goto L7;
        return null;
    }

    static {
        DISMISS_THRESHOLD = Dp.m6973constructorimpl(56);
    }
}
