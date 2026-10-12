package androidx.compose.material3;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.internal.BasicTooltipKt;
import androidx.compose.material3.internal.BasicTooltip_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Label.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\b\u001a^\u0010\t\u001a\u00020\u00012\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\r¢\u0006\u0002\b\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00032\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"HandleInteractions", "", "enabled", "", "state", "Landroidx/compose/material3/TooltipState;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(ZLandroidx/compose/material3/TooltipState;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;I)V", "Label", "label", "Lkotlin/Function1;", "Landroidx/compose/material3/TooltipScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "isPersistent", "content", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LabelKt {
    public static final /* synthetic */ void access$HandleInteractions(boolean enabled, TooltipState state, MutableInteractionSource interactionSource, Composer $composer, int $changed) {
        HandleInteractions(enabled, state, interactionSource, $composer, $changed);
    }

    /* JADX WARN: Type inference failed for: r2v19, types: [T, androidx.compose.runtime.MutableState] */
    public static final void Label(final Function3<? super TooltipScope, ? super Composer, ? super Integer, Unit> r21, Modifier modifier, MutableInteractionSource interactionSource, boolean isPersistent, final Function2<? super Composer, ? super Integer, Unit> r25, Composer $composer, final int $changed, final int r28) {
        Composer $composer2 = $composer.startRestartGroup(-544399326);
        ComposerKt.sourceInformation($composer2, "C(Label)P(3,4,1,2)74@3254L38,79@3493L33,80@3543L52,82@3646L103,88@3835L17,86@3755L249,95@4009L127:Label.kt#uh7d8r");
        int $dirty = $changed;
        if ((r28 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r3 = r28 & 2;
        if (r3 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier r7 = modifier;
    L23:
        int r8 = r28 & 4;
        if (r8 == 0) goto L27;
        $dirty = $dirty | 384;
        MutableInteractionSource r9 = interactionSource;
    L34:
        int r11 = r28 & 8;
        if (r11 == 0) goto L38;
        $dirty = $dirty | 3072;
        boolean r12 = isPersistent;
    L46:
        if ((r28 & 16) == 0) goto L49;
        $dirty = $dirty | 24576;
    L56:
        if (($dirty & 9363) == 9362) goto L58;
    L61:
        if (r3 == 0) goto L63;
        Modifier.Companion modifier2 = Modifier.Companion;
    L64:
        if (r8 == 0) goto L66;
        MutableInteractionSource interactionSource2 = null;
    L67:
        if (r11 == 0) goto L69;
        boolean isPersistent2 = false;
    L71:
        if (ComposerKt.isTraceInProgress() == false) goto L73;
        ComposerKt.traceEventStart(-544399326, $dirty, -1, "androidx.compose.material3.Label (Label.kt:70)");
    L73:
        $composer2.startReplaceGroup(519104973);
        ComposerKt.sourceInformation($composer2, "72@3116L39");
        if (interactionSource2 != null) goto L80;
        ComposerKt.sourceInformationMarkerStart($composer2, 519105624, "CC(remember):Label.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L78;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $composer2.updateRememberedValue(value$iv);
    L79:
        MutableInteractionSource interactionSource3 = (MutableInteractionSource) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
    L81:
        $composer2.endReplaceGroup();
        PopupPositionProvider positionProvider = TooltipDefaults.INSTANCE.m2968rememberPlainTooltipPositionProviderkHDZbjc(0.0f, $composer2, 48, 1);
        if (isPersistent2 == false) goto L88;
        $composer2.startReplaceGroup(-1087377900);
        ComposerKt.sourceInformation($composer2, "76@3335L29");
        ComposerKt.sourceInformationMarkerStart($composer2, 519112622, "CC(remember):Label.kt#9igjgp");
        Object it$iv2 = $composer2.rememberedValue();
        if (it$iv2 != Composer.Companion.getEmpty()) goto L86;
        Object value$iv2 = new LabelStateImpl(false, false, 3, null);
        $composer2.updateRememberedValue(value$iv2);
    L87:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endReplaceGroup();
        TooltipState state = (LabelStateImpl) value$iv2;
    L89:
        final Ref.ObjectRef anchorBounds = new Ref.ObjectRef();
        ComposerKt.sourceInformationMarkerStart($composer2, 519117682, "CC(remember):Label.kt#9igjgp");
        Object it$iv3 = $composer2.rememberedValue();
        if (it$iv3 != Composer.Companion.getEmpty()) goto L92;
        Object value$iv3 = SnapshotStateKt.mutableStateOf$default(0, r8, 2, r8);
        $composer2.updateRememberedValue(value$iv3);
    L93:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        anchorBounds.element = (MutableState) value$iv3;
        ComposerKt.sourceInformationMarkerStart($composer2, 519119301, "CC(remember):Label.kt#9igjgp");
        Object it$iv4 = $composer2.rememberedValue();
        if (it$iv4 != Composer.Companion.getEmpty()) goto L96;
        Object value$iv4 = new TooltipScopeImpl(new LabelKt$Label$scope$1$1(anchorBounds));
        $composer2.updateRememberedValue(value$iv4);
    L97:
        final TooltipScopeImpl scope = (TooltipScopeImpl) value$iv4;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Function2 wrappedContent = ComposableLambdaKt.rememberComposableLambda(1950723216, true, new LabelKt$Label$wrappedContent$1(anchorBounds, r25), $composer2, 54);
        BasicTooltip_androidKt.BasicTooltipBox(positionProvider, ComposableLambdaKt.rememberComposableLambda(784196780, true, new AnonymousClass1(r21, scope), $composer2, 54), state, modifier2, false, false, wrappedContent, $composer2, (($dirty << 6) & 7168) | 1794096, 0);
        $composer2 = $composer2;
        HandleInteractions(!isPersistent2, state, interactionSource3, $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L100;
        ComposerKt.traceEventEnd();
    L100:
        final MutableInteractionSource interactionSource4 = interactionSource2;
        final boolean isPersistent3 = isPersistent2;
        final Modifier modifier3 = modifier2;
    L101:
        ScopeUpdateScope r10 = $composer2.endRestartGroup();
        if (r10 == null) goto L105;
        r10.updateScope(new C05332(r21, modifier3, interactionSource4, isPersistent3, r25, $changed, r28));
        return;
    L105:
        return;
    L96:
        value$iv4 = it$iv4;
        goto L97
    L92:
        value$iv3 = it$iv3;
        goto L93
    L86:
        value$iv2 = it$iv2;
        goto L87
    L88:
        $dirty = $dirty;
        modifier2 = modifier2;
        $composer2.startReplaceGroup(519114025);
        ComposerKt.sourceInformation($composer2, "77@3378L56");
        TooltipState r4 = BasicTooltipKt.rememberBasicTooltipState(false, false, new MutatorMutex(), $composer2, 0, 3);
        $composer2.endReplaceGroup();
        state = r4;
        goto L89
    L78:
        value$iv = it$iv;
        goto L79
    L80:
        interactionSource3 = interactionSource2;
        goto L81
    L69:
        isPersistent2 = r12;
        goto L71
    L66:
        interactionSource2 = r9;
        goto L67
    L63:
        modifier2 = r7;
        goto L64
    L58:
        if ($composer2.getSkipping() == false) goto L61;
        $composer2.skipToGroupEnd();
        modifier3 = r7;
        interactionSource4 = r9;
        isPersistent3 = r12;
        goto L101
    L49:
        if (($changed & 24576) != 0) goto L56;
        if ($composer2.changedInstance(r25) == false) goto L53;
        int r13 = 16384;
    L54:
        $dirty = $dirty | r13;
        goto L56
    L53:
        r13 = 8192;
        goto L54
    L38:
        if (($changed & 3072) != 0) goto L44;
        r12 = isPersistent;
        if ($composer2.changed(r12) == false) goto L42;
        int r14 = 2048;
    L43:
        $dirty = $dirty | r14;
        goto L46
    L42:
        r14 = 1024;
        goto L43
    L44:
        r12 = isPersistent;
        goto L46
    L27:
        if (($changed & 384) != 0) goto L33;
        r9 = interactionSource;
        if ($composer2.changed(r9) == false) goto L31;
        int r15 = 256;
    L32:
        $dirty = $dirty | r15;
        goto L34
    L31:
        r15 = 128;
        goto L32
    L33:
        r9 = interactionSource;
        goto L34
    L16:
        if (($changed & 48) != 0) goto L22;
        r7 = modifier;
        if ($composer2.changed(r7) == false) goto L20;
        int r16 = 32;
    L21:
        $dirty = $dirty | r16;
        goto L23
    L20:
        r16 = 16;
        goto L21
    L22:
        r7 = modifier;
        goto L23
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changedInstance(r21) == false) goto L10;
        int r5 = 4;
    L11:
        $dirty = $dirty | r5;
        goto L12
    L10:
        r5 = 2;
        goto L11
    }

    private static final void HandleInteractions(final boolean enabled, final TooltipState state, final MutableInteractionSource interactionSource, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-627258109);
        ComposerKt.sourceInformation($composer2, "C(HandleInteractions)P(!1,2)110@4384L587,110@4350L621:Label.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(enabled) == false) goto L7;
        int r2 = 4;
    L8:
        $dirty = $dirty | r2;
        goto L10
    L7:
        r2 = 2;
    L10:
        if (($changed & 48) != 0) goto L20;
        if (($changed & 64) != 0) goto L14;
        boolean r3 = $composer2.changed(state);
    L15:
        if (r3 == false) goto L17;
        int r4 = 32;
    L18:
        $dirty = $dirty | r4;
        goto L20
    L17:
        r4 = 16;
        goto L18
    L14:
        r3 = $composer2.changedInstance(state);
    L20:
        if (($changed & 384) != 0) goto L27;
        if ($composer2.changed(interactionSource) == false) goto L24;
        int r5 = 256;
    L25:
        $dirty = $dirty | r5;
        goto L27
    L24:
        r5 = 128;
    L27:
        if (($dirty & 147) != 146) goto L33;
        if ($composer2.getSkipping() == false) goto L33;
        $composer2.skipToGroupEnd();
    L59:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L63;
        r0.updateScope(new AnonymousClass2(enabled, state, interactionSource, $changed));
        return;
    L63:
        return;
    L33:
        if (ComposerKt.isTraceInProgress() == false) goto L35;
        ComposerKt.traceEventStart(-627258109, $dirty, -1, "androidx.compose.material3.HandleInteractions (Label.kt:108)");
    L35:
        if (enabled == false) goto L57;
        ComposerKt.sourceInformationMarkerStart($composer2, 354570583, "CC(remember):Label.kt#9igjgp");
        boolean r6 = true;
        if (($dirty & 896) != 256) goto L39;
        boolean r1 = true;
    L41:
        if (($dirty & 112) != 32) goto L43;
    L48:
        boolean invalid$iv = r1 | r6;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L51;
    L54:
        LabelKt$HandleInteractions$1$1 value$iv = new LabelKt$HandleInteractions$1$1(interactionSource, state, null);
        $composer2.updateRememberedValue(value$iv);
    L55:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.LaunchedEffect(interactionSource, (Function2) value$iv, $composer2, ($dirty >> 6) & 14);
        goto L57
    L51:
        if (it$iv == Composer.Companion.getEmpty()) goto L54;
        value$iv = it$iv;
        goto L55
    L43:
        if (($dirty & 64) != 0) goto L45;
    L47:
        r6 = false;
        goto L48
    L45:
        if ($composer2.changedInstance(state) == false) goto L47;
    L39:
        r1 = false;
    L57:
        if (ComposerKt.isTraceInProgress() == false) goto L59;
        ComposerKt.traceEventEnd();
        goto L59
    }
}
