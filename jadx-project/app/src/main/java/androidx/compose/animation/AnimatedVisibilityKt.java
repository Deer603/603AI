package androidx.compose.animation;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnimatedVisibility.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0091\u0001\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0001¢\u0006\u0002\u0010\u001a\u001aa\u0010\u001b\u001a\u00020\u00072\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u001d2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0002\u0010 \u001a[\u0010\u001b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0002\u0010!\u001ak\u0010\"\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0001¢\u0006\u0002\u0010#\u001am\u0010\u001b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0002\u0010$\u001ae\u0010\u001b\u001a\u00020\u0007*\u00020%2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u001d2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0002\u0010&\u001a_\u0010\u001b\u001a\u00020\u0007*\u00020%2\u0006\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0002\u0010'\u001ae\u0010\u001b\u001a\u00020\u0007*\u00020(2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u001d2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0002\u0010)\u001a_\u0010\u001b\u001a\u00020\u0007*\u00020(2\u0006\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0002\u0010*\u001a9\u0010+\u001a\u00020\u0003\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010,\u001a\u0002H\bH\u0003¢\u0006\u0002\u0010-\"\u001e\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006.²\u0006\"\u0010/\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0013\"\u0004\b\u0000\u0010\bX\u008a\u0084\u0002²\u0006\u0010\u00100\u001a\u00020\u0001\"\u0004\b\u0000\u0010\bX\u008a\u0084\u0002"}, d2 = {"exitFinished", "", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "getExitFinished", "(Landroidx/compose/animation/core/Transition;)Z", "AnimatedEnterExitImpl", "", "T", "transition", "visible", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enter", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "shouldDisposeBlock", "Lkotlin/Function2;", "onLookaheadMeasured", "Landroidx/compose/animation/OnLookaheadMeasured;", "content", "Landroidx/compose/animation/AnimatedVisibilityScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function2;Landroidx/compose/animation/OnLookaheadMeasured;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "AnimatedVisibility", "visibleState", "Landroidx/compose/animation/core/MutableTransitionState;", "label", "", "(Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "AnimatedVisibilityImpl", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/ColumnScope;", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/foundation/layout/ColumnScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/RowScope;", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/foundation/layout/RowScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "targetEnterExit", "targetState", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/EnterExitState;", "animation_release", "shouldDisposeBlockUpdated", "shouldDisposeAfterExit"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AnimatedVisibilityKt {
    public static final /* synthetic */ Function2 access$AnimatedEnterExitImpl$lambda$2(State $shouldDisposeBlockUpdated$delegate) {
        return AnimatedEnterExitImpl$lambda$2($shouldDisposeBlockUpdated$delegate);
    }

    public static final /* synthetic */ boolean access$getExitFinished(Transition $receiver) {
        return getExitFinished($receiver);
    }

    public static final void AnimatedVisibility(boolean visible, Modifier modifier, EnterTransition enter, ExitTransition exit, String label, final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> r28, Composer $composer, final int $changed, final int r31) {
        Composer $composer2 = $composer.startRestartGroup(2088733774);
        ComposerKt.sourceInformation($composer2, "C(AnimatedVisibility)P(5,4,1,2,3)131@7031L32,132@7068L84:AnimatedVisibility.kt#xbi5r1");
        int $dirty = $changed;
        if ((r31 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        boolean r2 = visible;
    L13:
        int r3 = r31 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier r4 = modifier;
    L24:
        int r5 = r31 & 4;
        if (r5 == 0) goto L28;
        $dirty = $dirty | 384;
        EnterTransition r6 = enter;
    L35:
        int r8 = r31 & 8;
        if (r8 == 0) goto L39;
        $dirty = $dirty | 3072;
        ExitTransition r9 = exit;
    L46:
        int r10 = r31 & 16;
        if (r10 == 0) goto L50;
        $dirty = $dirty | 24576;
    L58:
        if ((r31 & 32) == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> r13 = r28;
    L69:
        if ((74899 & $dirty) == 74898) goto L71;
        boolean r12 = true;
    L73:
        if ($composer2.shouldExecute(r12, $dirty & 1) == false) goto L94;
        if (r3 == 0) goto L76;
        Modifier modifier2 = Modifier.Companion;
        int r7 = r10;
    L78:
        if (r5 == 0) goto L80;
        EnterTransition enter2 = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
    L81:
        if (r8 == 0) goto L83;
        ExitTransition exit2 = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
    L84:
        if (r7 == 0) goto L86;
        String label2 = "AnimatedVisibility";
    L88:
        if (ComposerKt.isTraceInProgress() == false) goto L90;
        ComposerKt.traceEventStart(2088733774, $dirty, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:130)");
    L90:
        Transition transition = androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(r2), label2, $composer2, ($dirty & 14) | (($dirty >> 9) & 112), 0);
        AnimatedVisibilityImpl(transition, AnonymousClass1.INSTANCE, modifier2, enter2, exit2, r13, $composer2, ((((($dirty << 3) & 896) | 48) | (($dirty << 3) & 7168)) | (($dirty << 3) & 57344)) | (458752 & $dirty));
        if (ComposerKt.isTraceInProgress() == false) goto L93;
        ComposerKt.traceEventEnd();
    L93:
        final String label3 = label2;
        final EnterTransition enter3 = enter2;
        final ExitTransition exit3 = exit2;
    L95:
        ScopeUpdateScope r11 = $composer2.endRestartGroup();
        if (r11 == null) goto L99;
        final Modifier modifier3 = modifier2;
        final boolean r1 = r2;
        r11.updateScope(new AnonymousClass2(r1, modifier3, enter3, exit3, label3, r28, $changed, r31));
        return;
    L99:
        return;
    L86:
        label2 = label;
        goto L88
    L83:
        exit2 = r9;
        goto L84
    L80:
        enter2 = r6;
        goto L81
    L76:
        r7 = r10;
        modifier2 = r4;
        goto L78
    L94:
        $composer2.skipToGroupEnd();
        label3 = label;
        modifier2 = r4;
        enter3 = r6;
        exit3 = r9;
        goto L95
    L71:
        r12 = false;
        goto L73
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        r13 = r28;
        if ($composer2.changedInstance(r13) == false) goto L65;
        int r14 = 131072;
    L66:
        $dirty = $dirty | r14;
        goto L69
    L65:
        r14 = 65536;
        goto L66
    L67:
        r13 = r28;
        goto L69
    L50:
        if (($changed & 24576) != 0) goto L58;
        if ($composer2.changed(label) == false) goto L54;
        int r15 = 16384;
    L55:
        $dirty = $dirty | r15;
        goto L58
    L54:
        r15 = 8192;
        goto L55
    L39:
        if (($changed & 3072) != 0) goto L45;
        r9 = exit;
        if ($composer2.changed(r9) == false) goto L43;
        int r16 = 2048;
    L44:
        $dirty = $dirty | r16;
        goto L46
    L43:
        r16 = 1024;
        goto L44
    L45:
        r9 = exit;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r6 = enter;
        if ($composer2.changed(r6) == false) goto L32;
        int r17 = 256;
    L33:
        $dirty = $dirty | r17;
        goto L35
    L32:
        r17 = 128;
        goto L33
    L34:
        r6 = enter;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L21;
        int r18 = 32;
    L22:
        $dirty = $dirty | r18;
        goto L24
    L21:
        r18 = 16;
        goto L22
    L23:
        r4 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r2 = visible;
        if ($composer2.changed(r2) == false) goto L10;
        int r19 = 4;
    L11:
        $dirty = $dirty | r19;
        goto L13
    L10:
        r19 = 2;
        goto L11
    L12:
        r2 = visible;
        goto L13
    }

    public static final void AnimatedVisibility(final RowScope $this$AnimatedVisibility, boolean visible, Modifier modifier, EnterTransition enter, ExitTransition exit, String label, final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> r29, Composer $composer, final int $changed, final int r32) {
        Composer $composer2 = $composer.startRestartGroup(-1741346906);
        ComposerKt.sourceInformation($composer2, "C(AnimatedVisibility)P(5,4,1,2,3)205@11416L32,206@11453L84:AnimatedVisibility.kt#xbi5r1");
        int $dirty = $changed;
        if ((r32 & 1) == 0) goto L6;
        $dirty = $dirty | 48;
        final boolean r2 = visible;
    L13:
        int r3 = r32 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 384;
        Modifier r4 = modifier;
    L24:
        int r5 = r32 & 4;
        if (r5 == 0) goto L28;
        $dirty = $dirty | 3072;
        EnterTransition enter2 = enter;
    L35:
        int r7 = r32 & 8;
        if (r7 == 0) goto L39;
        $dirty = $dirty | 24576;
        ExitTransition r9 = exit;
    L46:
        int r10 = r32 & 16;
        if (r10 == 0) goto L50;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L58:
        if ((r32 & 32) == 0) goto L61;
        $dirty = $dirty | 1572864;
        Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> r14 = r29;
    L69:
        if ((599185 & $dirty) == 599184) goto L71;
        boolean r12 = true;
    L73:
        if ($composer2.shouldExecute(r12, $dirty & 1) == false) goto L93;
        if (r3 == 0) goto L76;
        Modifier modifier2 = Modifier.Companion;
    L78:
        if (r5 == 0) goto L80;
        enter2 = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null));
    L80:
        if (r7 == 0) goto L82;
        ExitTransition exit2 = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null));
    L83:
        if (r10 == 0) goto L85;
        String label2 = "AnimatedVisibility";
    L87:
        if (ComposerKt.isTraceInProgress() == false) goto L89;
        ComposerKt.traceEventStart(-1741346906, $dirty, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:204)");
    L89:
        Transition transition = androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(r2), label2, $composer2, (($dirty >> 3) & 14) | (($dirty >> 12) & 112), 0);
        EnterTransition enter3 = enter2;
        AnimatedVisibilityImpl(transition, AnonymousClass3.INSTANCE, modifier2, enter3, exit2, r14, $composer2, (((($dirty & 896) | 48) | ($dirty & 7168)) | (57344 & $dirty)) | (($dirty >> 3) & 458752));
        if (ComposerKt.isTraceInProgress() == false) goto L92;
        ComposerKt.traceEventEnd();
    L92:
        final String label3 = label2;
        final Modifier modifier3 = modifier2;
        final EnterTransition enter4 = enter3;
        final ExitTransition exit3 = exit2;
    L94:
        ScopeUpdateScope r11 = $composer2.endRestartGroup();
        if (r11 == null) goto L98;
        r11.updateScope(new C01614($this$AnimatedVisibility, r2, modifier3, enter4, exit3, label3, r29, $changed, r32));
        return;
    L98:
        return;
    L85:
        label2 = label;
        goto L87
    L82:
        exit2 = r9;
        goto L83
    L76:
        modifier2 = r4;
        goto L78
    L93:
        $composer2.skipToGroupEnd();
        modifier3 = r4;
        enter4 = enter2;
        exit3 = r9;
        label3 = label;
        goto L94
    L71:
        r12 = false;
        goto L73
    L61:
        if (($changed & 1572864) != 0) goto L67;
        r14 = r29;
        if ($composer2.changedInstance(r14) == false) goto L65;
        int r13 = 1048576;
    L66:
        $dirty = $dirty | r13;
        goto L69
    L65:
        r13 = 524288;
        goto L66
    L67:
        r14 = r29;
        goto L69
    L50:
        if ((196608 & $changed) != 0) goto L58;
        if ($composer2.changed(label) == false) goto L54;
        int r15 = 131072;
    L55:
        $dirty = $dirty | r15;
        goto L58
    L54:
        r15 = 65536;
        goto L55
    L39:
        if (($changed & 24576) != 0) goto L45;
        r9 = exit;
        if ($composer2.changed(r9) == false) goto L43;
        int r16 = 16384;
    L44:
        $dirty = $dirty | r16;
        goto L46
    L43:
        r16 = 8192;
        goto L44
    L45:
        r9 = exit;
        goto L46
    L28:
        if (($changed & 3072) != 0) goto L34;
        enter2 = enter;
        if ($composer2.changed(enter2) == false) goto L32;
        int r8 = 2048;
    L33:
        $dirty = $dirty | r8;
        goto L35
    L32:
        r8 = 1024;
        goto L33
    L34:
        enter2 = enter;
        goto L35
    L17:
        if (($changed & 384) != 0) goto L23;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L21;
        int r6 = 256;
    L22:
        $dirty = $dirty | r6;
        goto L24
    L21:
        r6 = 128;
        goto L22
    L23:
        r4 = modifier;
        goto L24
    L6:
        if (($changed & 48) != 0) goto L12;
        r2 = visible;
        if ($composer2.changed(r2) == false) goto L10;
        int r17 = 32;
    L11:
        $dirty = $dirty | r17;
        goto L13
    L10:
        r17 = 16;
        goto L11
    L12:
        r2 = visible;
        goto L13
    }

    public static final void AnimatedVisibility(final ColumnScope $this$AnimatedVisibility, boolean visible, Modifier modifier, EnterTransition enter, ExitTransition exit, String label, final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> r29, Composer $composer, final int $changed, final int r32) {
        Composer $composer2 = $composer.startRestartGroup(1766503102);
        ComposerKt.sourceInformation($composer2, "C(AnimatedVisibility)P(5,4,1,2,3)278@15782L32,279@15819L84:AnimatedVisibility.kt#xbi5r1");
        int $dirty = $changed;
        if ((r32 & 1) == 0) goto L6;
        $dirty = $dirty | 48;
        final boolean r2 = visible;
    L13:
        int r3 = r32 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 384;
        Modifier r4 = modifier;
    L24:
        int r5 = r32 & 4;
        if (r5 == 0) goto L28;
        $dirty = $dirty | 3072;
        EnterTransition enter2 = enter;
    L35:
        int r7 = r32 & 8;
        if (r7 == 0) goto L39;
        $dirty = $dirty | 24576;
        ExitTransition r9 = exit;
    L46:
        int r10 = r32 & 16;
        if (r10 == 0) goto L50;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L58:
        if ((r32 & 32) == 0) goto L61;
        $dirty = $dirty | 1572864;
        Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> r14 = r29;
    L69:
        if ((599185 & $dirty) == 599184) goto L71;
        boolean r12 = true;
    L73:
        if ($composer2.shouldExecute(r12, $dirty & 1) == false) goto L93;
        if (r3 == 0) goto L76;
        Modifier modifier2 = Modifier.Companion;
    L78:
        if (r5 == 0) goto L80;
        enter2 = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));
    L80:
        if (r7 == 0) goto L82;
        ExitTransition exit2 = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null));
    L83:
        if (r10 == 0) goto L85;
        String label2 = "AnimatedVisibility";
    L87:
        if (ComposerKt.isTraceInProgress() == false) goto L89;
        ComposerKt.traceEventStart(1766503102, $dirty, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:277)");
    L89:
        Transition transition = androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(r2), label2, $composer2, (($dirty >> 3) & 14) | (($dirty >> 12) & 112), 0);
        EnterTransition enter3 = enter2;
        AnimatedVisibilityImpl(transition, AnonymousClass5.INSTANCE, modifier2, enter3, exit2, r14, $composer2, (((($dirty & 896) | 48) | ($dirty & 7168)) | (57344 & $dirty)) | (($dirty >> 3) & 458752));
        if (ComposerKt.isTraceInProgress() == false) goto L92;
        ComposerKt.traceEventEnd();
    L92:
        final String label3 = label2;
        final Modifier modifier3 = modifier2;
        final EnterTransition enter4 = enter3;
        final ExitTransition exit3 = exit2;
    L94:
        ScopeUpdateScope r11 = $composer2.endRestartGroup();
        if (r11 == null) goto L98;
        r11.updateScope(new AnonymousClass6($this$AnimatedVisibility, r2, modifier3, enter4, exit3, label3, r29, $changed, r32));
        return;
    L98:
        return;
    L85:
        label2 = label;
        goto L87
    L82:
        exit2 = r9;
        goto L83
    L76:
        modifier2 = r4;
        goto L78
    L93:
        $composer2.skipToGroupEnd();
        modifier3 = r4;
        enter4 = enter2;
        exit3 = r9;
        label3 = label;
        goto L94
    L71:
        r12 = false;
        goto L73
    L61:
        if (($changed & 1572864) != 0) goto L67;
        r14 = r29;
        if ($composer2.changedInstance(r14) == false) goto L65;
        int r13 = 1048576;
    L66:
        $dirty = $dirty | r13;
        goto L69
    L65:
        r13 = 524288;
        goto L66
    L67:
        r14 = r29;
        goto L69
    L50:
        if ((196608 & $changed) != 0) goto L58;
        if ($composer2.changed(label) == false) goto L54;
        int r15 = 131072;
    L55:
        $dirty = $dirty | r15;
        goto L58
    L54:
        r15 = 65536;
        goto L55
    L39:
        if (($changed & 24576) != 0) goto L45;
        r9 = exit;
        if ($composer2.changed(r9) == false) goto L43;
        int r16 = 16384;
    L44:
        $dirty = $dirty | r16;
        goto L46
    L43:
        r16 = 8192;
        goto L44
    L45:
        r9 = exit;
        goto L46
    L28:
        if (($changed & 3072) != 0) goto L34;
        enter2 = enter;
        if ($composer2.changed(enter2) == false) goto L32;
        int r8 = 2048;
    L33:
        $dirty = $dirty | r8;
        goto L35
    L32:
        r8 = 1024;
        goto L33
    L34:
        enter2 = enter;
        goto L35
    L17:
        if (($changed & 384) != 0) goto L23;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L21;
        int r6 = 256;
    L22:
        $dirty = $dirty | r6;
        goto L24
    L21:
        r6 = 128;
        goto L22
    L23:
        r4 = modifier;
        goto L24
    L6:
        if (($changed & 48) != 0) goto L12;
        r2 = visible;
        if ($composer2.changed(r2) == false) goto L10;
        int r17 = 32;
    L11:
        $dirty = $dirty | r17;
        goto L13
    L10:
        r17 = 16;
        goto L11
    L12:
        r2 = visible;
        goto L13
    }

    public static final void AnimatedVisibility(final MutableTransitionState<Boolean> r23, Modifier modifier, EnterTransition enter, ExitTransition exit, String label, final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> r28, Composer $composer, final int $changed, final int r31) {
        Composer $composer2 = $composer.startRestartGroup(-222898426);
        ComposerKt.sourceInformation($composer2, "C(AnimatedVisibility)P(5,4,1,2,3)377@21242L39,378@21286L84:AnimatedVisibility.kt#xbi5r1");
        int $dirty = $changed;
        if ((r31 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L15:
        int r3 = r31 & 2;
        if (r3 == 0) goto L19;
        $dirty = $dirty | 48;
        Modifier r4 = modifier;
    L26:
        int r5 = r31 & 4;
        if (r5 == 0) goto L30;
        $dirty = $dirty | 384;
        EnterTransition r6 = enter;
    L37:
        int r8 = r31 & 8;
        if (r8 == 0) goto L41;
        $dirty = $dirty | 3072;
        ExitTransition r9 = exit;
    L48:
        int r10 = r31 & 16;
        if (r10 == 0) goto L52;
        $dirty = $dirty | 24576;
    L60:
        if ((r31 & 32) == 0) goto L63;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> r13 = r28;
    L71:
        if ((74899 & $dirty) == 74898) goto L73;
        boolean r12 = true;
    L75:
        if ($composer2.shouldExecute(r12, $dirty & 1) == false) goto L96;
        if (r3 == 0) goto L78;
        Modifier modifier2 = Modifier.Companion;
        int r7 = r10;
    L80:
        if (r5 == 0) goto L82;
        EnterTransition enter2 = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
    L83:
        if (r8 == 0) goto L85;
        ExitTransition exit2 = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
    L86:
        if (r7 == 0) goto L88;
        String label2 = "AnimatedVisibility";
    L90:
        if (ComposerKt.isTraceInProgress() == false) goto L92;
        ComposerKt.traceEventStart(-222898426, $dirty, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:376)");
    L92:
        Transition transition = androidx.compose.animation.core.TransitionKt.rememberTransition(r23, label2, $composer2, (MutableTransitionState.$stable | ($dirty & 14)) | (($dirty >> 9) & 112), 0);
        AnimatedVisibilityImpl(transition, AnonymousClass7.INSTANCE, modifier2, enter2, exit2, r13, $composer2, ((((($dirty << 3) & 896) | 48) | (($dirty << 3) & 7168)) | (($dirty << 3) & 57344)) | (458752 & $dirty));
        if (ComposerKt.isTraceInProgress() == false) goto L95;
        ComposerKt.traceEventEnd();
    L95:
        final String label3 = label2;
        final EnterTransition enter3 = enter2;
        final ExitTransition exit3 = exit2;
    L97:
        ScopeUpdateScope r11 = $composer2.endRestartGroup();
        if (r11 == null) goto L101;
        final Modifier modifier3 = modifier2;
        r11.updateScope(new AnonymousClass8(r23, modifier3, enter3, exit3, label3, r28, $changed, r31));
        return;
    L101:
        return;
    L88:
        label2 = label;
        goto L90
    L85:
        exit2 = r9;
        goto L86
    L82:
        enter2 = r6;
        goto L83
    L78:
        r7 = r10;
        modifier2 = r4;
        goto L80
    L96:
        $composer2.skipToGroupEnd();
        label3 = label;
        modifier2 = r4;
        enter3 = r6;
        exit3 = r9;
        goto L97
    L73:
        r12 = false;
        goto L75
    L63:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L69;
        r13 = r28;
        if ($composer2.changedInstance(r13) == false) goto L67;
        int r14 = 131072;
    L68:
        $dirty = $dirty | r14;
        goto L71
    L67:
        r14 = 65536;
        goto L68
    L69:
        r13 = r28;
        goto L71
    L52:
        if (($changed & 24576) != 0) goto L60;
        if ($composer2.changed(label) == false) goto L56;
        int r15 = 16384;
    L57:
        $dirty = $dirty | r15;
        goto L60
    L56:
        r15 = 8192;
        goto L57
    L41:
        if (($changed & 3072) != 0) goto L47;
        r9 = exit;
        if ($composer2.changed(r9) == false) goto L45;
        int r16 = 2048;
    L46:
        $dirty = $dirty | r16;
        goto L48
    L45:
        r16 = 1024;
        goto L46
    L47:
        r9 = exit;
        goto L48
    L30:
        if (($changed & 384) != 0) goto L36;
        r6 = enter;
        if ($composer2.changed(r6) == false) goto L34;
        int r17 = 256;
    L35:
        $dirty = $dirty | r17;
        goto L37
    L34:
        r17 = 128;
        goto L35
    L36:
        r6 = enter;
        goto L37
    L19:
        if (($changed & 48) != 0) goto L25;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L23;
        int r18 = 32;
    L24:
        $dirty = $dirty | r18;
        goto L26
    L23:
        r18 = 16;
        goto L24
    L25:
        r4 = modifier;
        goto L26
    L6:
        if (($changed & 6) != 0) goto L15;
        if (($changed & 8) != 0) goto L10;
        boolean r19 = $composer2.changed(r23);
    L11:
        if (r19 == false) goto L13;
        int r20 = 4;
    L14:
        $dirty = $dirty | r20;
        goto L15
    L13:
        r20 = 2;
        goto L14
    L10:
        r19 = $composer2.changedInstance(r23);
        goto L11
    }

    public static final void AnimatedVisibility(final RowScope $this$AnimatedVisibility, final MutableTransitionState<Boolean> r24, Modifier modifier, EnterTransition enter, ExitTransition exit, String label, final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> r29, Composer $composer, final int $changed, final int r32) {
        Composer $composer2 = $composer.startRestartGroup(836509870);
        ComposerKt.sourceInformation($composer2, "C(AnimatedVisibility)P(5,4,1,2,3)449@25679L39,450@25723L84:AnimatedVisibility.kt#xbi5r1");
        int $dirty = $changed;
        if ((r32 & 1) == 0) goto L6;
        $dirty = $dirty | 48;
    L15:
        int r3 = r32 & 2;
        if (r3 == 0) goto L19;
        $dirty = $dirty | 384;
        Modifier r4 = modifier;
    L26:
        int r5 = r32 & 4;
        if (r5 == 0) goto L30;
        $dirty = $dirty | 3072;
        EnterTransition enter2 = enter;
    L37:
        int r7 = r32 & 8;
        if (r7 == 0) goto L41;
        $dirty = $dirty | 24576;
        ExitTransition r9 = exit;
    L48:
        int r10 = r32 & 16;
        if (r10 == 0) goto L52;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L60:
        if ((r32 & 32) == 0) goto L63;
        $dirty = $dirty | 1572864;
        Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> r14 = r29;
    L71:
        if ((599185 & $dirty) == 599184) goto L73;
        boolean r12 = true;
    L75:
        if ($composer2.shouldExecute(r12, $dirty & 1) == false) goto L95;
        if (r3 == 0) goto L78;
        Modifier modifier2 = Modifier.Companion;
    L80:
        if (r5 == 0) goto L82;
        enter2 = EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
    L82:
        if (r7 == 0) goto L84;
        ExitTransition exit2 = EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
    L85:
        if (r10 == 0) goto L87;
        String label2 = "AnimatedVisibility";
    L89:
        if (ComposerKt.isTraceInProgress() == false) goto L91;
        ComposerKt.traceEventStart(836509870, $dirty, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
    L91:
        Transition transition = androidx.compose.animation.core.TransitionKt.rememberTransition(r24, label2, $composer2, (MutableTransitionState.$stable | (($dirty >> 3) & 14)) | (($dirty >> 12) & 112), 0);
        EnterTransition enter3 = enter2;
        AnimatedVisibilityImpl(transition, AnonymousClass9.INSTANCE, modifier2, enter3, exit2, r14, $composer2, (((($dirty & 896) | 48) | ($dirty & 7168)) | (57344 & $dirty)) | (($dirty >> 3) & 458752));
        if (ComposerKt.isTraceInProgress() == false) goto L94;
        ComposerKt.traceEventEnd();
    L94:
        final String label3 = label2;
        final Modifier modifier3 = modifier2;
        final EnterTransition enter4 = enter3;
        final ExitTransition exit3 = exit2;
    L96:
        ScopeUpdateScope r11 = $composer2.endRestartGroup();
        if (r11 == null) goto L100;
        r11.updateScope(new AnonymousClass10($this$AnimatedVisibility, r24, modifier3, enter4, exit3, label3, r29, $changed, r32));
        return;
    L100:
        return;
    L87:
        label2 = label;
        goto L89
    L84:
        exit2 = r9;
        goto L85
    L78:
        modifier2 = r4;
        goto L80
    L95:
        $composer2.skipToGroupEnd();
        modifier3 = r4;
        enter4 = enter2;
        exit3 = r9;
        label3 = label;
        goto L96
    L73:
        r12 = false;
        goto L75
    L63:
        if (($changed & 1572864) != 0) goto L69;
        r14 = r29;
        if ($composer2.changedInstance(r14) == false) goto L67;
        int r13 = 1048576;
    L68:
        $dirty = $dirty | r13;
        goto L71
    L67:
        r13 = 524288;
        goto L68
    L69:
        r14 = r29;
        goto L71
    L52:
        if ((196608 & $changed) != 0) goto L60;
        if ($composer2.changed(label) == false) goto L56;
        int r15 = 131072;
    L57:
        $dirty = $dirty | r15;
        goto L60
    L56:
        r15 = 65536;
        goto L57
    L41:
        if (($changed & 24576) != 0) goto L47;
        r9 = exit;
        if ($composer2.changed(r9) == false) goto L45;
        int r16 = 16384;
    L46:
        $dirty = $dirty | r16;
        goto L48
    L45:
        r16 = 8192;
        goto L46
    L47:
        r9 = exit;
        goto L48
    L30:
        if (($changed & 3072) != 0) goto L36;
        enter2 = enter;
        if ($composer2.changed(enter2) == false) goto L34;
        int r8 = 2048;
    L35:
        $dirty = $dirty | r8;
        goto L37
    L34:
        r8 = 1024;
        goto L35
    L36:
        enter2 = enter;
        goto L37
    L19:
        if (($changed & 384) != 0) goto L25;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L23;
        int r6 = 256;
    L24:
        $dirty = $dirty | r6;
        goto L26
    L23:
        r6 = 128;
        goto L24
    L25:
        r4 = modifier;
        goto L26
    L6:
        if (($changed & 48) != 0) goto L15;
        if (($changed & 64) != 0) goto L10;
        boolean r17 = $composer2.changed(r24);
    L11:
        if (r17 == false) goto L13;
        int r18 = 32;
    L14:
        $dirty = $dirty | r18;
        goto L15
    L13:
        r18 = 16;
        goto L14
    L10:
        r17 = $composer2.changedInstance(r24);
        goto L11
    }

    public static final void AnimatedVisibility(final ColumnScope $this$AnimatedVisibility, final MutableTransitionState<Boolean> r24, Modifier modifier, EnterTransition enter, ExitTransition exit, String label, final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> r29, Composer $composer, final int $changed, final int r32) {
        Composer $composer2 = $composer.startRestartGroup(-850656618);
        ComposerKt.sourceInformation($composer2, "C(AnimatedVisibility)P(5,4,1,2,3)523@30211L39,524@30255L84:AnimatedVisibility.kt#xbi5r1");
        int $dirty = $changed;
        if ((r32 & 1) == 0) goto L6;
        $dirty = $dirty | 48;
    L15:
        int r3 = r32 & 2;
        if (r3 == 0) goto L19;
        $dirty = $dirty | 384;
        Modifier r4 = modifier;
    L26:
        int r5 = r32 & 4;
        if (r5 == 0) goto L30;
        $dirty = $dirty | 3072;
        EnterTransition enter2 = enter;
    L37:
        int r7 = r32 & 8;
        if (r7 == 0) goto L41;
        $dirty = $dirty | 24576;
        ExitTransition r9 = exit;
    L48:
        int r10 = r32 & 16;
        if (r10 == 0) goto L52;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L60:
        if ((r32 & 32) == 0) goto L63;
        $dirty = $dirty | 1572864;
        Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> r14 = r29;
    L71:
        if ((599185 & $dirty) == 599184) goto L73;
        boolean r12 = true;
    L75:
        if ($composer2.shouldExecute(r12, $dirty & 1) == false) goto L95;
        if (r3 == 0) goto L78;
        Modifier modifier2 = Modifier.Companion;
    L80:
        if (r5 == 0) goto L82;
        enter2 = EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
    L82:
        if (r7 == 0) goto L84;
        ExitTransition exit2 = EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
    L85:
        if (r10 == 0) goto L87;
        String label2 = "AnimatedVisibility";
    L89:
        if (ComposerKt.isTraceInProgress() == false) goto L91;
        ComposerKt.traceEventStart(-850656618, $dirty, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:522)");
    L91:
        Transition transition = androidx.compose.animation.core.TransitionKt.rememberTransition(r24, label2, $composer2, (MutableTransitionState.$stable | (($dirty >> 3) & 14)) | (($dirty >> 12) & 112), 0);
        EnterTransition enter3 = enter2;
        AnimatedVisibilityImpl(transition, AnonymousClass11.INSTANCE, modifier2, enter3, exit2, r14, $composer2, (((($dirty & 896) | 48) | ($dirty & 7168)) | (57344 & $dirty)) | (($dirty >> 3) & 458752));
        if (ComposerKt.isTraceInProgress() == false) goto L94;
        ComposerKt.traceEventEnd();
    L94:
        final String label3 = label2;
        final Modifier modifier3 = modifier2;
        final EnterTransition enter4 = enter3;
        final ExitTransition exit3 = exit2;
    L96:
        ScopeUpdateScope r11 = $composer2.endRestartGroup();
        if (r11 == null) goto L100;
        r11.updateScope(new AnonymousClass12($this$AnimatedVisibility, r24, modifier3, enter4, exit3, label3, r29, $changed, r32));
        return;
    L100:
        return;
    L87:
        label2 = label;
        goto L89
    L84:
        exit2 = r9;
        goto L85
    L78:
        modifier2 = r4;
        goto L80
    L95:
        $composer2.skipToGroupEnd();
        modifier3 = r4;
        enter4 = enter2;
        exit3 = r9;
        label3 = label;
        goto L96
    L73:
        r12 = false;
        goto L75
    L63:
        if (($changed & 1572864) != 0) goto L69;
        r14 = r29;
        if ($composer2.changedInstance(r14) == false) goto L67;
        int r13 = 1048576;
    L68:
        $dirty = $dirty | r13;
        goto L71
    L67:
        r13 = 524288;
        goto L68
    L69:
        r14 = r29;
        goto L71
    L52:
        if ((196608 & $changed) != 0) goto L60;
        if ($composer2.changed(label) == false) goto L56;
        int r15 = 131072;
    L57:
        $dirty = $dirty | r15;
        goto L60
    L56:
        r15 = 65536;
        goto L57
    L41:
        if (($changed & 24576) != 0) goto L47;
        r9 = exit;
        if ($composer2.changed(r9) == false) goto L45;
        int r16 = 16384;
    L46:
        $dirty = $dirty | r16;
        goto L48
    L45:
        r16 = 8192;
        goto L46
    L47:
        r9 = exit;
        goto L48
    L30:
        if (($changed & 3072) != 0) goto L36;
        enter2 = enter;
        if ($composer2.changed(enter2) == false) goto L34;
        int r8 = 2048;
    L35:
        $dirty = $dirty | r8;
        goto L37
    L34:
        r8 = 1024;
        goto L35
    L36:
        enter2 = enter;
        goto L37
    L19:
        if (($changed & 384) != 0) goto L25;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L23;
        int r6 = 256;
    L24:
        $dirty = $dirty | r6;
        goto L26
    L23:
        r6 = 128;
        goto L24
    L25:
        r4 = modifier;
        goto L26
    L6:
        if (($changed & 48) != 0) goto L15;
        if (($changed & 64) != 0) goto L10;
        boolean r17 = $composer2.changed(r24);
    L11:
        if (r17 == false) goto L13;
        int r18 = 32;
    L14:
        $dirty = $dirty | r18;
        goto L15
    L13:
        r18 = 16;
        goto L14
    L10:
        r17 = $composer2.changedInstance(r24);
        goto L11
    }

    public static final <T> void AnimatedVisibility(final Transition<T> r21, final Function1<? super T, Boolean> r22, Modifier modifier, EnterTransition enter, ExitTransition exit, final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> r26, Composer $composer, final int $changed, final int r29) {
        Composer $composer2 = $composer.startRestartGroup(1031950689);
        ComposerKt.sourceInformation($composer2, "C(AnimatedVisibility)P(4,3,1,2)593@34528L79:AnimatedVisibility.kt#xbi5r1");
        int $dirty = $changed;
        if ((r29 & Integer.MIN_VALUE) == 0) goto L6;
        $dirty = $dirty | 6;
        Transition<T> r8 = r21;
    L14:
        if ((r29 & 1) == 0) goto L17;
        $dirty = $dirty | 48;
        Function1<? super T, Boolean> r9 = r22;
    L24:
        int r2 = r29 & 2;
        if (r2 == 0) goto L28;
        $dirty = $dirty | 384;
        final Modifier modifier2 = modifier;
    L35:
        int r4 = r29 & 4;
        if (r4 == 0) goto L39;
        $dirty = $dirty | 3072;
        EnterTransition r5 = enter;
    L46:
        int r6 = r29 & 8;
        if (r6 == 0) goto L50;
        $dirty = $dirty | 24576;
    L58:
        if ((r29 & 16) == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> r13 = r26;
    L69:
        if ((74899 & $dirty) == 74898) goto L71;
        boolean r11 = true;
    L73:
        if ($composer2.shouldExecute(r11, $dirty & 1) == false) goto L91;
        if (r2 == 0) goto L76;
        Modifier modifier3 = Modifier.Companion;
    L78:
        if (r4 == 0) goto L80;
        EnterTransition enter2 = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
    L81:
        if (r6 == 0) goto L83;
        ExitTransition exit2 = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
    L85:
        if (ComposerKt.isTraceInProgress() == false) goto L87;
        ComposerKt.traceEventStart(1031950689, $dirty, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:593)");
    L87:
        EnterTransition enter3 = enter2;
        AnimatedVisibilityImpl(r8, r9, modifier3, enter3, exit2, r13, $composer2, ((((($dirty & 14) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (57344 & $dirty)) | (458752 & $dirty));
        if (ComposerKt.isTraceInProgress() == false) goto L90;
        ComposerKt.traceEventEnd();
    L90:
        modifier2 = modifier3;
        final EnterTransition enter4 = enter3;
        final ExitTransition exit3 = exit2;
    L92:
        ScopeUpdateScope r10 = $composer2.endRestartGroup();
        if (r10 == null) goto L96;
        r10.updateScope(new AnonymousClass13(r21, r22, modifier2, enter4, exit3, r26, $changed, r29));
        return;
    L96:
        return;
    L83:
        exit2 = exit;
        goto L85
    L80:
        enter2 = r5;
        goto L81
    L76:
        modifier3 = modifier2;
        goto L78
    L91:
        $composer2.skipToGroupEnd();
        enter4 = r5;
        exit3 = exit;
        goto L92
    L71:
        r11 = false;
        goto L73
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        r13 = r26;
        if ($composer2.changedInstance(r13) == false) goto L65;
        int r12 = 131072;
    L66:
        $dirty = $dirty | r12;
        goto L69
    L65:
        r12 = 65536;
        goto L66
    L67:
        r13 = r26;
        goto L69
    L50:
        if (($changed & 24576) != 0) goto L58;
        if ($composer2.changed(exit) == false) goto L54;
        int r14 = 16384;
    L55:
        $dirty = $dirty | r14;
        goto L58
    L54:
        r14 = 8192;
        goto L55
    L39:
        if (($changed & 3072) != 0) goto L45;
        r5 = enter;
        if ($composer2.changed(r5) == false) goto L43;
        int r7 = 2048;
    L44:
        $dirty = $dirty | r7;
        goto L46
    L43:
        r7 = 1024;
        goto L44
    L45:
        r5 = enter;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L32;
        int r15 = 256;
    L33:
        $dirty = $dirty | r15;
        goto L35
    L32:
        r15 = 128;
        goto L33
    L34:
        modifier2 = modifier;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r9 = r22;
        if ($composer2.changedInstance(r9) == false) goto L21;
        int r3 = 32;
    L22:
        $dirty = $dirty | r3;
        goto L24
    L21:
        r3 = 16;
        goto L22
    L23:
        r9 = r22;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r8 = r21;
        if ($composer2.changed(r8) == false) goto L10;
        int r16 = 4;
    L11:
        $dirty = $dirty | r16;
        goto L14
    L10:
        r16 = 2;
        goto L11
    L12:
        r8 = r21;
        goto L14
    }

    public static final <T> void AnimatedVisibilityImpl(final Transition<T> r17, final Function1<? super T, Boolean> r18, final Modifier modifier, final EnterTransition enter, final ExitTransition exit, final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> r22, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(429978603);
        ComposerKt.sourceInformation($composer2, "C(AnimatedVisibilityImpl)P(4,5,3,1,2)682@38811L423,678@38681L723:AnimatedVisibility.kt#xbi5r1");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(r17) == false) goto L7;
        int r4 = 4;
    L8:
        $dirty = $dirty | r4;
        goto L10
    L7:
        r4 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(r18) == false) goto L14;
        int r5 = 32;
    L15:
        $dirty = $dirty | r5;
        goto L17
    L14:
        r5 = 16;
    L17:
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changed(modifier) == false) goto L21;
        int r6 = 256;
    L22:
        $dirty = $dirty | r6;
        goto L24
    L21:
        r6 = 128;
    L24:
        if (($changed & 3072) != 0) goto L30;
        EnterTransition r7 = enter;
        if ($composer2.changed(r7) == false) goto L28;
        int r8 = 2048;
    L29:
        $dirty = $dirty | r8;
    L32:
        if (($changed & 24576) != 0) goto L38;
        ExitTransition r9 = exit;
        if ($composer2.changed(r9) == false) goto L36;
        int r10 = 16384;
    L37:
        $dirty = $dirty | r10;
    L40:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L47;
        if ($composer2.changedInstance(r22) == false) goto L44;
        int r13 = 131072;
    L45:
        $dirty = $dirty | r13;
        goto L47
    L44:
        r13 = 65536;
    L47:
        int $dirty2 = $dirty;
        boolean r15 = false;
        if ((74899 & $dirty2) == 74898) goto L50;
        boolean r3 = true;
    L52:
        if ($composer2.shouldExecute(r3, $dirty2 & 1) == true) goto L54;
        $composer2.skipToGroupEnd();
    L74:
        ScopeUpdateScope r11 = $composer2.endRestartGroup();
        if (r11 == null) goto L78;
        r11.updateScope(new C01633(r17, r18, modifier, enter, exit, r22, $changed));
        return;
    L78:
        return;
    L54:
        if (ComposerKt.isTraceInProgress() == false) goto L56;
        ComposerKt.traceEventStart(429978603, $dirty2, -1, "androidx.compose.animation.AnimatedVisibilityImpl (AnimatedVisibility.kt:677)");
    L56:
        ComposerKt.sourceInformationMarkerStart($composer2, 689229031, "CC(remember):AnimatedVisibility.kt#9igjgp");
        if (($dirty2 & 112) != 32) goto L59;
        boolean r2 = true;
    L61:
        if (($dirty2 & 14) != 4) goto L63;
        r15 = true;
    L63:
        boolean invalid$iv = r2 | r15;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L66;
    L69:
        Object value$iv = (Function3) new AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1(r18, r17);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L70:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        AnimatedEnterExitImpl(r17, r18, LayoutModifierKt.layout(modifier, (Function3) it$iv), r7, r9, C01622.INSTANCE, null, r22, $composer2, ((((($dirty2 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ($dirty2 & 112)) | ($dirty2 & 7168)) | (57344 & $dirty2)) | (29360128 & ($dirty2 << 6)), 64);
        if (ComposerKt.isTraceInProgress() == false) goto L74;
        ComposerKt.traceEventEnd();
        goto L74
    L66:
        if (it$iv != Composer.Companion.getEmpty()) goto L70;
    L59:
        r2 = false;
        goto L61
    L50:
        r3 = false;
        goto L52
    L36:
        r10 = 8192;
        goto L37
    L38:
        r9 = exit;
        goto L40
    L28:
        r8 = 1024;
        goto L29
    L30:
        r7 = enter;
        goto L32
    }

    public static final <T> void AnimatedEnterExitImpl(final Transition<T> r26, final Function1<? super T, Boolean> r27, final Modifier modifier, final EnterTransition enter, final ExitTransition exit, final Function2<? super EnterExitState, ? super EnterExitState, Boolean> r31, OnLookaheadMeasured onLookaheadMeasured, final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> r33, Composer $composer, final int $changed, final int r36) {
        final OnLookaheadMeasured onLookaheadMeasured2 = onLookaheadMeasured;
        Composer $composer2 = $composer.startRestartGroup(-891967166);
        ComposerKt.sourceInformation($composer2, "C(AnimatedEnterExitImpl)P(6,7,3,1,2,5,4):AnimatedVisibility.kt#xbi5r1");
        int $dirty = $changed;
        if ((r36 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r36 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L23:
        if ((r36 & 4) == 0) goto L26;
        $dirty = $dirty | 384;
    L33:
        if ((r36 & 8) == 0) goto L36;
        $dirty = $dirty | 3072;
    L44:
        if ((r36 & 16) == 0) goto L47;
        $dirty = $dirty | 24576;
    L55:
        if ((r36 & 32) == 0) goto L58;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L64:
        int r13 = r36 & 64;
        int r14 = 1572864;
        if (r13 == 0) goto L68;
    L66:
        $dirty = $dirty | r14;
    L77:
        if ((r36 & 128) == 0) goto L81;
        int r15 = 12582912;
    L79:
        $dirty = $dirty | r15;
    L86:
        boolean invalid$iv = true;
        if ((4793491 & $dirty) == 4793490) goto L89;
        boolean r11 = true;
    L91:
        if ($composer2.shouldExecute(r11, $dirty & 1) == false) goto L211;
        if (r13 == 0) goto L95;
        onLookaheadMeasured2 = null;
    L95:
        if (ComposerKt.isTraceInProgress() == false) goto L98;
        ComposerKt.traceEventStart(-891967166, $dirty, -1, "androidx.compose.animation.AnimatedEnterExitImpl (AnimatedVisibility.kt:718)");
    L98:
        if (r27.invoke(r26.getTargetState()).booleanValue() == false) goto L100;
    L107:
        $composer2.startReplaceGroup(1788522886);
        ComposerKt.sourceInformation($composer2, "726@40224L124,730@40391L40,736@40640L528,733@40483L685");
        int $changed$iv = ($dirty & 14) | 48;
        ComposerKt.sourceInformationMarkerStart($composer2, 1215497572, "CC(createChildTransition)1761@74780L36,1762@74840L74,1763@74937L39,1764@74988L63:Transition.kt#pdpnli");
        ComposerKt.sourceInformationMarkerStart($composer2, 272047797, "CC(remember):Transition.kt#9igjgp");
        if ((($changed$iv & 14) ^ 6) <= 4) goto L114;
        if ($composer2.changed(r26) == false) goto L114;
    L115:
        boolean invalid$iv$iv = true;
    L117:
        Object it$iv$iv = $composer2.rememberedValue();
        if (invalid$iv$iv == true) goto L124;
        if (it$iv$iv == Composer.Companion.getEmpty()) goto L124;
    L125:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Object initialParentState$iv = it$iv$iv;
        if (r26.isSeeking() == false) goto L128;
        Object it = r26.getCurrentState();
    L129:
        int $changed2 = ($changed$iv >> 3) & 112;
        $composer2.startReplaceGroup(-466616829);
        ComposerKt.sourceInformation($composer2, "C727@40306L28:AnimatedVisibility.kt#xbi5r1");
        if (ComposerKt.isTraceInProgress() == false) goto L132;
        ComposerKt.traceEventStart(-466616829, $changed2, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:727)");
    L132:
        Object initialState$iv = targetEnterExit(r26, r27, it, $composer2, (($dirty & 14) | ($dirty & 112)) | (($changed2 << 6) & 896));
        if (ComposerKt.isTraceInProgress() == false) goto L135;
        ComposerKt.traceEventEnd();
    L135:
        $composer2.endReplaceGroup();
        Object it2 = r26.getTargetState();
        int $changed3 = ($changed$iv >> 3) & 112;
        $composer2.startReplaceGroup(-466616829);
        ComposerKt.sourceInformation($composer2, "C727@40306L28:AnimatedVisibility.kt#xbi5r1");
        if (ComposerKt.isTraceInProgress() == false) goto L139;
        ComposerKt.traceEventStart(-466616829, $changed3, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:727)");
    L139:
        Object targetState$iv = targetEnterExit(r26, r27, it2, $composer2, (($dirty & 14) | ($dirty & 112)) | (($changed3 << 6) & 896));
        if (ComposerKt.isTraceInProgress() == false) goto L142;
        ComposerKt.traceEventEnd();
    L142:
        $composer2.endReplaceGroup();
        Transition childTransition = androidx.compose.animation.core.TransitionKt.createChildTransitionInternal(r26, initialState$iv, targetState$iv, "EnterExitTransition", $composer2, ($changed$iv & 14) | (($changed$iv << 6) & 7168));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        State shouldDisposeBlockUpdated$delegate = SnapshotStateKt.rememberUpdatedState(r31, $composer2, ($dirty >> 15) & 14);
        Boolean r9 = r31.invoke(childTransition.getCurrentState(), childTransition.getTargetState());
        ComposerKt.sourceInformationMarkerStart($composer2, 1581728280, "CC(remember):AnimatedVisibility.kt#9igjgp");
        boolean invalid$iv2 = $composer2.changed(childTransition) | $composer2.changed(shouldDisposeBlockUpdated$delegate);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv2 == false) goto L145;
    L148:
        Object value$iv = (Function2) new AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(childTransition, shouldDisposeBlockUpdated$delegate, null);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L149:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        State shouldDisposeAfterExit$delegate = SnapshotStateKt.produceState(r9, (Function2) it$iv, $composer2, 0);
        if (getExitFinished(childTransition) == true) goto L152;
    L155:
        $composer2.startReplaceGroup(1789551931);
        ComposerKt.sourceInformation($composer2, "752@41266L69,758@41534L47,772@42349L50,753@41348L1065");
        ComposerKt.sourceInformationMarkerStart($composer2, 1581747853, "CC(remember):AnimatedVisibility.kt#9igjgp");
        if (($dirty & 14) != 4) goto L158;
        boolean invalid$iv3 = true;
    L159:
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv3 == false) goto L162;
    L165:
        Object value$iv2 = new AnimatedVisibilityScopeImpl(childTransition);
        $composer2.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L166:
        AnimatedVisibilityScopeImpl scope = (AnimatedVisibilityScopeImpl) it$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r7 = EnterExitTransitionKt.createModifier(childTransition, enter, exit, null, "Built-in", $composer2, ((($dirty >> 6) & 112) | 24576) | (($dirty >> 6) & 896), 4);
        $composer2 = $composer2;
        if (onLookaheadMeasured2 == null) goto L185;
        $composer2.startReplaceGroup(1789971299);
        ComposerKt.sourceInformation($composer2, "761@41736L479");
        Modifier.Companion r10 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart($composer2, 1581763303, "CC(remember):AnimatedVisibility.kt#9igjgp");
        if (($dirty & 3670016) != 1048576) goto L171;
    L176:
        Object it$iv3 = $composer2.rememberedValue();
        if (invalid$iv == true) goto L183;
        if (it$iv3 == Composer.Companion.getEmpty()) goto L183;
    L184:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier.Companion r2 = LayoutModifierKt.layout(r10, (Function3) it$iv3);
        $composer2.endReplaceGroup();
    L186:
        Modifier modifier$iv = modifier.then(r7.then(r2));
        ComposerKt.sourceInformationMarkerStart($composer2, 1581782490, "CC(remember):AnimatedVisibility.kt#9igjgp");
        Object it$iv4 = $composer2.rememberedValue();
        if (it$iv4 != Composer.Companion.getEmpty()) goto L190;
        Object value$iv3 = new AnimatedEnterExitMeasurePolicy(scope);
        $composer2.updateRememberedValue(value$iv3);
        it$iv4 = value$iv3;
    L190:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        MeasurePolicy measurePolicy$iv = (AnimatedEnterExitMeasurePolicy) it$iv4;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r16 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv = ((384 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L193;
        ComposablesKt.invalidApplier();
    L193:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L196;
        $composer2.createNode(r16);
    L197:
        Composer $this$Layout_u24lambda_u240$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv.getInserting() == true) goto L204;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv)) == false) goto L204;
    L205:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
        int r0 = ($changed$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, 255152045, "C754@41390L9:AnimatedVisibility.kt#xbi5r1");
        r33.invoke(scope, $composer2, Integer.valueOf(($dirty >> 18) & 112));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endReplaceGroup();
    L206:
        $composer2.endReplaceGroup();
    L208:
        if (ComposerKt.isTraceInProgress() == false) goto L210;
        ComposerKt.traceEventEnd();
    L210:
        final OnLookaheadMeasured onLookaheadMeasured3 = onLookaheadMeasured2;
    L212:
        ScopeUpdateScope r12 = $composer2.endRestartGroup();
        if (r12 == null) goto L216;
        r12.updateScope(new AnonymousClass4(r26, r27, modifier, enter, exit, r31, onLookaheadMeasured3, r33, $changed, r36));
        return;
    L216:
        return;
    L204:
        $this$Layout_u24lambda_u240$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
        $this$Layout_u24lambda_u240$iv.apply(Integer.valueOf(compositeKeyHash$iv), r3);
        goto L205
    L196:
        $composer2.useNode();
    L183:
        Object value$iv4 = (Function3) new AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1(onLookaheadMeasured2);
        $composer2.updateRememberedValue(value$iv4);
        it$iv3 = value$iv4;
        goto L184
    L171:
        if (($dirty & 2097152) != 0) goto L173;
    L175:
        invalid$iv = false;
        goto L176
    L173:
        if ($composer2.changedInstance(onLookaheadMeasured2) == false) goto L175;
    L185:
        $composer2.startReplaceGroup(1581779440);
        $composer2.endReplaceGroup();
        r2 = Modifier.Companion;
        goto L186
    L162:
        if (it$iv2 != Composer.Companion.getEmpty()) goto L166;
    L158:
        invalid$iv3 = false;
        goto L159
    L152:
        if (AnimatedEnterExitImpl$lambda$4(shouldDisposeAfterExit$delegate) == false) goto L155;
        $composer2.startReplaceGroup(1790688794);
        $composer2.endReplaceGroup();
        $composer2 = $composer2;
        goto L206
    L145:
        if (it$iv != Composer.Companion.getEmpty()) goto L149;
    L128:
        it = initialParentState$iv;
    L124:
        Object value$iv$iv = r26.getCurrentState();
        $composer2.updateRememberedValue(value$iv$iv);
        it$iv$iv = value$iv$iv;
    L114:
        if (($changed$iv & 6) == 4) goto L115;
        invalid$iv$iv = false;
        goto L117
    L100:
        if (r27.invoke(r26.getCurrentState()).booleanValue() == true) goto L107;
        if (r26.isSeeking() == true) goto L107;
        if (r26.getHasInitialValueAnimations() == true) goto L107;
        $composer2.startReplaceGroup(1790694746);
        $composer2.endReplaceGroup();
        onLookaheadMeasured2 = onLookaheadMeasured2;
        goto L208
    L211:
        $composer2.skipToGroupEnd();
        onLookaheadMeasured3 = onLookaheadMeasured2;
        goto L212
    L89:
        r11 = false;
        goto L91
    L81:
        if ((12582912 & $changed) != 0) goto L86;
        if ($composer2.changedInstance(r33) == false) goto L85;
        r15 = 8388608;
        goto L79
    L85:
        r15 = 4194304;
        goto L79
    L68:
        if ((1572864 & $changed) != 0) goto L77;
        if (($changed & 2097152) != 0) goto L72;
        boolean r17 = $composer2.changed(onLookaheadMeasured2);
    L73:
        if (r17 == false) goto L75;
        r14 = 1048576;
        goto L66
    L75:
        r14 = 524288;
        goto L66
    L72:
        r17 = $composer2.changedInstance(onLookaheadMeasured2);
        goto L73
    L58:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L64;
        if ($composer2.changedInstance(r31) == false) goto L62;
        int r18 = 131072;
    L63:
        $dirty = $dirty | r18;
        goto L64
    L62:
        r18 = 65536;
        goto L63
    L47:
        if (($changed & 24576) != 0) goto L55;
        if ($composer2.changed(exit) == false) goto L51;
        int r19 = 16384;
    L52:
        $dirty = $dirty | r19;
        goto L55
    L51:
        r19 = 8192;
        goto L52
    L36:
        if (($changed & 3072) != 0) goto L44;
        if ($composer2.changed(enter) == false) goto L40;
        int r110 = 2048;
    L41:
        $dirty = $dirty | r110;
        goto L44
    L40:
        r110 = 1024;
        goto L41
    L26:
        if (($changed & 384) != 0) goto L33;
        if ($composer2.changed(modifier) == false) goto L30;
        int r8 = 256;
    L31:
        $dirty = $dirty | r8;
        goto L33
    L30:
        r8 = 128;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L23;
        if ($composer2.changedInstance(r27) == false) goto L20;
        int r20 = 32;
    L21:
        $dirty = $dirty | r20;
        goto L23
    L20:
        r20 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(r26) == false) goto L10;
        int r21 = 4;
    L11:
        $dirty = $dirty | r21;
        goto L13
    L10:
        r21 = 2;
        goto L11
    }

    private static final Function2<EnterExitState, EnterExitState, Boolean> AnimatedEnterExitImpl$lambda$2(State<? extends Function2<? super EnterExitState, ? super EnterExitState, Boolean>> r4) {
        Object thisObj$iv = r4.getValue();
        return (Function2) thisObj$iv;
    }

    private static final boolean AnimatedEnterExitImpl$lambda$4(State<Boolean> r4) {
        return r4.getValue().booleanValue();
    }

    private static final boolean getExitFinished(Transition<EnterExitState> r2) {
        if (r2.getCurrentState() == EnterExitState.PostExit) goto L5;
    L7:
        return false;
    L5:
        if (r2.getTargetState() != EnterExitState.PostExit) goto L7;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> EnterExitState targetEnterExit(Transition<T> r9, Function1<? super T, Boolean> r10, T r11, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 361571134, "C(targetEnterExit)P(1):AnimatedVisibility.kt#xbi5r1");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(361571134, $changed, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:836)");
    L5:
        $composer.startMovableGroup(-902032957, r9);
        ComposerKt.sourceInformation($composer, "");
        if (r9.isSeeking() == false) goto L14;
        $composer.startReplaceGroup(2101770115);
        $composer.endReplaceGroup();
        if (r10.invoke(r11).booleanValue() == false) goto L11;
        EnterExitState r0 = EnterExitState.Visible;
    L29:
        $composer.endMovableGroup();
        if (ComposerKt.isTraceInProgress() == false) goto L32;
        ComposerKt.traceEventEnd();
    L32:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    L11:
        if (r10.invoke(r9.getCurrentState()).booleanValue() == false) goto L13;
        r0 = EnterExitState.PostExit;
        goto L29
    L13:
        r0 = EnterExitState.PreEnter;
        goto L29
    L14:
        $composer.startReplaceGroup(2102044248);
        ComposerKt.sourceInformation($composer, "848@44885L34");
        ComposerKt.sourceInformationMarkerStart($composer, -902022852, "CC(remember):AnimatedVisibility.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L18;
        Object value$iv = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L18:
        MutableState hasBeenVisible = (MutableState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (r10.invoke(r9.getCurrentState()).booleanValue() == false) goto L22;
        hasBeenVisible.setValue(true);
    L22:
        if (r10.invoke(r11).booleanValue() == false) goto L25;
        r0 = EnterExitState.Visible;
    L28:
        $composer.endReplaceGroup();
        goto L29
    L25:
        if (((Boolean) hasBeenVisible.getValue()).booleanValue() == false) goto L27;
        r0 = EnterExitState.PostExit;
        goto L28
    L27:
        r0 = EnterExitState.PreEnter;
        goto L28
    }
}
