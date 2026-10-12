package androidx.compose.foundation;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.compose.ui.window.PopupProperties;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: BasicTooltip.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aa\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0002\u0010\u000f\u001a&\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007\u001a@\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\f2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0003¢\u0006\u0002\u0010\u0018\u001a:\u0010\u0019\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0003¢\u0006\u0002\u0010\u001a\u001a+\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u001c\u001a,\u0010\u001d\u001a\u00020\n*\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002\u001a\u001c\u0010!\u001a\u00020\n*\u00020\n2\u0006\u0010 \u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\""}, d2 = {"BasicTooltipBox", "", "positionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "tooltip", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "state", "Landroidx/compose/foundation/BasicTooltipState;", "modifier", "Landroidx/compose/ui/Modifier;", "focusable", "", "enableUserInput", "content", "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/BasicTooltipState;Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "BasicTooltipState", "initialIsVisible", "isPersistent", "mutatorMutex", "Landroidx/compose/foundation/MutatorMutex;", "TooltipPopup", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Landroidx/compose/ui/window/PopupPositionProvider;Landroidx/compose/foundation/BasicTooltipState;Lkotlinx/coroutines/CoroutineScope;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "WrappedAnchor", "(ZLandroidx/compose/foundation/BasicTooltipState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "rememberBasicTooltipState", "(ZZLandroidx/compose/foundation/MutatorMutex;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BasicTooltipState;", "anchorSemantics", "label", "", "enabled", "handleGestures", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class BasicTooltipKt {
    public static final /* synthetic */ void access$TooltipPopup(PopupPositionProvider positionProvider, BasicTooltipState state, CoroutineScope scope, boolean focusable, Function2 content, Composer $composer, int $changed) {
        TooltipPopup(positionProvider, state, scope, focusable, content, $composer, $changed);
    }

    public static final /* synthetic */ void access$WrappedAnchor(boolean enableUserInput, BasicTooltipState state, Modifier modifier, Function2 content, Composer $composer, int $changed, int $default) {
        WrappedAnchor(enableUserInput, state, modifier, content, $composer, $changed, $default);
    }

    public static final void BasicTooltipBox(final PopupPositionProvider positionProvider, final Function2<? super Composer, ? super Integer, Unit> r39, BasicTooltipState state, Modifier modifier, boolean focusable, boolean enableUserInput, final Function2<? super Composer, ? super Integer, Unit> r44, Composer $composer, final int $changed, final int r47) {
        final BasicTooltipState r1 = state;
        Composer $composer2 = $composer.startRestartGroup(1841478228);
        ComposerKt.sourceInformation($composer2, "C(BasicTooltipBox)P(4,6,5,3,2,1)82@3722L24,83@3751L451,102@4232L35,102@4208L59:BasicTooltip.kt#71ulvw");
        int $dirty = $changed;
        if ((r47 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L14:
        if ((r47 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Function2<? super Composer, ? super Integer, Unit> r4 = r39;
    L25:
        if ((r47 & 4) == 0) goto L28;
        $dirty = $dirty | 384;
    L34:
        int r5 = r47 & 8;
        if (r5 == 0) goto L38;
        $dirty = $dirty | 3072;
        Modifier r6 = modifier;
    L45:
        int r9 = r47 & 16;
        if (r9 == 0) goto L49;
        $dirty = $dirty | 24576;
        boolean r11 = focusable;
    L56:
        int r12 = r47 & 32;
        if (r12 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        boolean enableUserInput2 = enableUserInput;
    L68:
        if ((r47 & 64) == 0) goto L71;
        $dirty = $dirty | 1572864;
        Function2<? super Composer, ? super Integer, Unit> r14 = r44;
    L78:
        int $dirty2 = $dirty;
        if ((599187 & $dirty2) == 599186) goto L81;
        boolean r2 = true;
    L83:
        if ($composer2.shouldExecute(r2, $dirty2 & 1) == false) goto L132;
        if (r5 == 0) goto L86;
        Modifier modifier2 = Modifier.Companion;
    L87:
        if (r9 == 0) goto L89;
        boolean focusable2 = true;
    L90:
        if (r12 == 0) goto L93;
        enableUserInput2 = true;
    L93:
        if (ComposerKt.isTraceInProgress() == false) goto L95;
        ComposerKt.traceEventStart(1841478228, $dirty2, -1, "androidx.compose.foundation.BasicTooltipBox (BasicTooltip.kt:81)");
    L95:
        ComposerKt.sourceInformationMarkerStart($composer2, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart($composer2, -954203484, "CC(remember):Effects.kt#9igjgp");
        Object value$iv$iv = $composer2.rememberedValue();
        if (value$iv$iv != Composer.Companion.getEmpty()) goto L99;
        value$iv$iv = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer2);
        $composer2.updateRememberedValue(value$iv$iv);
    L99:
        CoroutineScope scope = (CoroutineScope) value$iv$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        Modifier modifier$iv = Modifier.Companion;
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier modifier3 = modifier2;
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r21 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        boolean focusable3 = focusable2;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L102;
        ComposablesKt.invalidApplier();
    L102:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L105;
        $composer2.createNode(r21);
    L106:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r0 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L112;
        CompositionLocalMap localMap$iv$iv2 = localMap$iv$iv;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == true) goto L114;
    L113:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r0);
    L114:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r25 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance r3 = BoxScopeInstance.INSTANCE;
        int r28 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, 137103289, "C94@4035L161:BasicTooltip.kt#71ulvw");
        if (state.isVisible() == false) goto L117;
        $composer2.startReplaceGroup(137118168);
        ComposerKt.sourceInformation($composer2, "85@3800L215");
        boolean invalid$iv = false;
        TooltipPopup(positionProvider, state, scope, focusable3, r4, $composer2, ((($dirty2 & 14) | (($dirty2 >> 3) & 112)) | (($dirty2 >> 3) & 7168)) | (($dirty2 << 9) & 57344));
        boolean focusable4 = focusable3;
        Composer $composer3 = $composer2;
        $composer3.endReplaceGroup();
    L118:
        r1 = state;
        boolean enableUserInput3 = enableUserInput2;
        WrappedAnchor(enableUserInput3, r1, modifier3, r14, $composer3, (((($dirty2 >> 15) & 14) | (($dirty2 >> 3) & 112)) | (($dirty2 >> 3) & 896)) | (($dirty2 >> 9) & 7168), 0);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 740301407, "CC(remember):BasicTooltip.kt#9igjgp");
        if (($dirty2 & 896) != 256) goto L121;
        invalid$iv = true;
    L121:
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L124;
    L127:
        Object value$iv = (Function1) new BasicTooltipKt$BasicTooltipBox$2$1(r1);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L128:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.DisposableEffect(r1, (Function1) it$iv, $composer2, ($dirty2 >> 6) & 14);
        if (ComposerKt.isTraceInProgress() == false) goto L131;
        ComposerKt.traceEventEnd();
    L131:
        final boolean enableUserInput4 = enableUserInput3;
        final Modifier modifier4 = modifier3;
        final boolean focusable5 = focusable4;
    L133:
        ScopeUpdateScope r13 = $composer2.endRestartGroup();
        if (r13 == null) goto L137;
        final BasicTooltipState r7 = r1;
        r13.updateScope(new AnonymousClass3(positionProvider, r39, r7, modifier4, focusable5, enableUserInput4, r44, $changed, r47));
        return;
    L137:
        return;
    L124:
        if (it$iv != Composer.Companion.getEmpty()) goto L128;
    L117:
        $composer3 = $composer2;
        focusable4 = focusable3;
        invalid$iv = false;
        $composer3.startReplaceGroup(137347847);
        $composer3.endReplaceGroup();
        goto L118
    L112:
        localMap$iv$iv2 = localMap$iv$iv;
        goto L113
    L105:
        $composer2.useNode();
        goto L106
    L89:
        focusable2 = r11;
        goto L90
    L86:
        modifier2 = r6;
        goto L87
    L132:
        $composer2.skipToGroupEnd();
        modifier4 = r6;
        focusable5 = r11;
        enableUserInput4 = enableUserInput2;
        goto L133
    L81:
        r2 = false;
        goto L83
    L71:
        if (($changed & 1572864) != 0) goto L77;
        r14 = r44;
        if ($composer2.changedInstance(r14) == false) goto L75;
        int r15 = 1048576;
    L76:
        $dirty = $dirty | r15;
        goto L78
    L75:
        r15 = 524288;
        goto L76
    L77:
        r14 = r44;
        goto L78
    L60:
        if ((196608 & $changed) != 0) goto L66;
        enableUserInput2 = enableUserInput;
        if ($composer2.changed(enableUserInput2) == false) goto L64;
        int r16 = 131072;
    L65:
        $dirty = $dirty | r16;
        goto L68
    L64:
        r16 = 65536;
        goto L65
    L66:
        enableUserInput2 = enableUserInput;
        goto L68
    L49:
        if (($changed & 24576) != 0) goto L55;
        r11 = focusable;
        if ($composer2.changed(r11) == false) goto L53;
        int r17 = 16384;
    L54:
        $dirty = $dirty | r17;
        goto L56
    L53:
        r17 = 8192;
        goto L54
    L55:
        r11 = focusable;
        goto L56
    L38:
        if (($changed & 3072) != 0) goto L44;
        r6 = modifier;
        if ($composer2.changed(r6) == false) goto L42;
        int r10 = 2048;
    L43:
        $dirty = $dirty | r10;
        goto L45
    L42:
        r10 = 1024;
        goto L43
    L44:
        r6 = modifier;
        goto L45
    L28:
        if (($changed & 384) != 0) goto L34;
        if ($composer2.changed(r1) == false) goto L32;
        int r8 = 256;
    L33:
        $dirty = $dirty | r8;
        goto L34
    L32:
        r8 = 128;
        goto L33
    L17:
        if (($changed & 48) != 0) goto L23;
        r4 = r39;
        if ($composer2.changedInstance(r4) == false) goto L21;
        int r18 = 32;
    L22:
        $dirty = $dirty | r18;
        goto L25
    L21:
        r18 = 16;
        goto L22
    L23:
        r4 = r39;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L14;
        if ($composer2.changed(positionProvider) == false) goto L10;
        int r19 = 4;
    L11:
        $dirty = $dirty | r19;
        goto L14
    L10:
        r19 = 2;
        goto L11
    }

    private static final void WrappedAnchor(final boolean enableUserInput, final BasicTooltipState state, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> r32, Composer $composer, final int $changed, final int r35) {
        Composer $composer2 = $composer.startRestartGroup(-111661630);
        ComposerKt.sourceInformation($composer2, "C(WrappedAnchor)P(1,3,2)113@4502L24,114@4572L7,115@4584L212:BasicTooltip.kt#71ulvw");
        int $dirty = $changed;
        if ((r35 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r35 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L22:
        int r6 = r35 & 4;
        if (r6 == 0) goto L26;
        $dirty = $dirty | 384;
        Modifier r8 = modifier;
    L34:
        if ((r35 & 8) == 0) goto L37;
        $dirty = $dirty | 3072;
    L43:
        int $dirty2 = $dirty;
        if (($dirty2 & 1171) == 1170) goto L46;
        boolean r3 = true;
    L48:
        if ($composer2.shouldExecute(r3, $dirty2 & 1) == false) goto L78;
        if (r6 == 0) goto L51;
        Modifier.Companion modifier2 = Modifier.Companion;
    L53:
        if (ComposerKt.isTraceInProgress() == false) goto L55;
        ComposerKt.traceEventStart(-111661630, $dirty2, -1, "androidx.compose.foundation.WrappedAnchor (BasicTooltip.kt:112)");
    L55:
        ComposerKt.sourceInformationMarkerStart($composer2, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart($composer2, -954203484, "CC(remember):Effects.kt#9igjgp");
        Object it$iv$iv = $composer2.rememberedValue();
        if (it$iv$iv != Composer.Companion.getEmpty()) goto L59;
        Object value$iv$iv = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer2);
        $composer2.updateRememberedValue(value$iv$iv);
        it$iv$iv = value$iv$iv;
    L59:
        CoroutineScope scope = (CoroutineScope) it$iv$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        String longPressLabel = BasicTooltipStrings.INSTANCE.label($composer2, 6);
        Modifier modifier$iv = anchorSemantics(handleGestures(modifier2, enableUserInput, state), longPressLabel, enableUserInput, state, scope);
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r20 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L62;
        ComposablesKt.invalidApplier();
    L62:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L65;
        Function0<ComposeUiNode> r0 = r20;
        $composer2.createNode(r0);
    L66:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r1 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L72;
        Modifier modifier3 = modifier2;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == true) goto L74;
    L73:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r1);
    L74:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r2 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance r4 = BoxScopeInstance.INSTANCE;
        int r5 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, 1506423195, "C121@4781L9:BasicTooltip.kt#71ulvw");
        r32.invoke($composer2, Integer.valueOf(($dirty2 >> 9) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L77;
        ComposerKt.traceEventEnd();
    L77:
        final Modifier modifier4 = modifier3;
    L79:
        ScopeUpdateScope r9 = $composer2.endRestartGroup();
        if (r9 == null) goto L83;
        r9.updateScope(new C02102(enableUserInput, state, modifier4, r32, $changed, r35));
        return;
    L83:
        return;
    L72:
        modifier3 = modifier2;
        goto L73
    L65:
        r0 = r20;
        $composer2.useNode();
        goto L66
    L51:
        modifier2 = r8;
        goto L53
    L78:
        $composer2.skipToGroupEnd();
        modifier4 = r8;
        goto L79
    L46:
        r3 = false;
        goto L48
    L37:
        if (($changed & 3072) != 0) goto L43;
        if ($composer2.changedInstance(r32) == false) goto L41;
        int r10 = 2048;
    L42:
        $dirty = $dirty | r10;
        goto L43
    L41:
        r10 = 1024;
        goto L42
    L26:
        if (($changed & 384) != 0) goto L32;
        r8 = modifier;
        if ($composer2.changed(r8) == false) goto L30;
        int r11 = 256;
    L31:
        $dirty = $dirty | r11;
        goto L34
    L30:
        r11 = 128;
        goto L31
    L32:
        r8 = modifier;
        goto L34
    L16:
        if (($changed & 48) != 0) goto L22;
        if ($composer2.changed(state) == false) goto L20;
        int r7 = 32;
    L21:
        $dirty = $dirty | r7;
        goto L22
    L20:
        r7 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(enableUserInput) == false) goto L10;
        int r12 = 4;
    L11:
        $dirty = $dirty | r12;
        goto L13
    L10:
        r12 = 2;
        goto L11
    }

    private static final void TooltipPopup(final PopupPositionProvider positionProvider, final BasicTooltipState state, final CoroutineScope scope, final boolean focusable, final Function2<? super Composer, ? super Integer, Unit> r23, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-487341126);
        ComposerKt.sourceInformation($composer2, "C(TooltipPopup)P(2,4,3,1)134@5094L13,137@5196L109,143@5373L251,135@5112L512:BasicTooltip.kt#71ulvw");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L9;
        PopupPositionProvider r7 = positionProvider;
        if ($composer2.changed(r7) == false) goto L7;
        int r4 = 4;
    L8:
        $dirty = $dirty | r4;
    L11:
        if (($changed & 48) != 0) goto L18;
        if ($composer2.changed(state) == false) goto L15;
        int r5 = 32;
    L16:
        $dirty = $dirty | r5;
        goto L18
    L15:
        r5 = 16;
    L18:
        if (($changed & 384) != 0) goto L25;
        if ($composer2.changedInstance(scope) == false) goto L22;
        int r6 = 256;
    L23:
        $dirty = $dirty | r6;
        goto L25
    L22:
        r6 = 128;
    L25:
        if (($changed & 3072) != 0) goto L31;
        boolean r13 = focusable;
        if ($composer2.changed(r13) == false) goto L29;
        int r8 = 2048;
    L30:
        $dirty = $dirty | r8;
    L33:
        if (($changed & 24576) == 0) goto L35;
    L39:
        boolean r10 = false;
        if (($dirty & 9363) == 9362) goto L42;
        boolean r9 = true;
    L44:
        if ($composer2.shouldExecute(r9, $dirty & 1) == true) goto L46;
        $composer2.skipToGroupEnd();
    L62:
        ScopeUpdateScope r11 = $composer2.endRestartGroup();
        if (r11 == null) goto L66;
        r11.updateScope(new C02093(positionProvider, state, scope, focusable, r23, $changed));
        return;
    L66:
        return;
    L46:
        if (ComposerKt.isTraceInProgress() == false) goto L48;
        ComposerKt.traceEventStart(-487341126, $dirty, -1, "androidx.compose.foundation.TooltipPopup (BasicTooltip.kt:133)");
    L48:
        final String tooltipDescription = BasicTooltipStrings.INSTANCE.description($composer2, 6);
        ComposerKt.sourceInformationMarkerStart($composer2, -1255630160, "CC(remember):BasicTooltip.kt#9igjgp");
        if (($dirty & 112) != 32) goto L51;
        r10 = true;
    L51:
        boolean invalid$iv = $composer2.changedInstance(scope) | r10;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L54;
    L57:
        Object value$iv = (Function0) new BasicTooltipKt$TooltipPopup$1$1(state, scope);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L58:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        AndroidPopup_androidKt.Popup(r7, (Function0) it$iv, new PopupProperties(r13, false, false, false, 14, null), ComposableLambdaKt.rememberComposableLambda(-2085908648, true, new AnonymousClass2(tooltipDescription, r23), $composer2, 54), $composer2, ($dirty & 14) | 3072, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L62;
        ComposerKt.traceEventEnd();
        goto L62
    L54:
        if (it$iv != Composer.Companion.getEmpty()) goto L58;
    L42:
        r9 = false;
        goto L44
    L35:
        if ($composer2.changedInstance(r23) == false) goto L37;
        int r12 = 16384;
    L38:
        $dirty = $dirty | r12;
        goto L39
    L37:
        r12 = 8192;
        goto L38
    L29:
        r8 = 1024;
        goto L30
    L31:
        r13 = focusable;
        goto L33
    L7:
        r4 = 2;
        goto L8
    L9:
        r7 = positionProvider;
        goto L11
    }

    private static final Modifier handleGestures(Modifier $this$handleGestures, boolean enabled, final BasicTooltipState state) {
        if (enabled == false) goto L5;
        return SuspendingPointerInputFilterKt.pointerInput(SuspendingPointerInputFilterKt.pointerInput($this$handleGestures, state, new C02111(state)), state, new C02122(state));
    L5:
        return $this$handleGestures;
    }

    private static final Modifier anchorSemantics(Modifier $this$anchorSemantics, final String label, boolean enabled, final BasicTooltipState state, final CoroutineScope scope) {
        if (enabled == false) goto L5;
        return SemanticsModifierKt.semantics($this$anchorSemantics, true, new AnonymousClass1(label, scope, state));
    L5:
        return $this$anchorSemantics;
    }

    public static final BasicTooltipState rememberBasicTooltipState(boolean initialIsVisible, boolean isPersistent, MutatorMutex mutatorMutex, Composer $composer, int $changed, int r11) {
        ComposerKt.sourceInformationMarkerStart($composer, 1123859613, "C(rememberBasicTooltipState)245@9387L215:BasicTooltip.kt#71ulvw");
        if ((r11 & 1) == 0) goto L6;
        initialIsVisible = false;
    L6:
        if ((r11 & 2) == 0) goto L9;
        isPersistent = true;
    L9:
        if ((r11 & 4) == 0) goto L12;
        mutatorMutex = BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
    L12:
        if (ComposerKt.isTraceInProgress() == false) goto L14;
        ComposerKt.traceEventStart(1123859613, $changed, -1, "androidx.compose.foundation.rememberBasicTooltipState (BasicTooltip.kt:245)");
    L14:
        ComposerKt.sourceInformationMarkerStart($composer, 1506527948, "CC(remember):BasicTooltip.kt#9igjgp");
        boolean r0 = false;
        if ((($changed & 112) ^ 48) <= 32) goto L19;
        if ($composer.changed(isPersistent) == false) goto L19;
    L20:
        boolean r12 = true;
    L23:
        if ((($changed & 896) ^ 384) <= 256) goto L27;
        if ($composer.changed(mutatorMutex) == false) goto L27;
    L28:
        r0 = true;
    L29:
        boolean invalid$iv = r12 | r0;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L32;
    L35:
        Object value$iv = new BasicTooltipStateImpl(initialIsVisible, isPersistent, mutatorMutex);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L36:
        BasicTooltipStateImpl r2 = (BasicTooltipStateImpl) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L39;
        ComposerKt.traceEventEnd();
    L39:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r2;
    L32:
        if (it$iv != Composer.Companion.getEmpty()) goto L36;
    L27:
        if (($changed & 384) != 256) goto L29;
    L19:
        if (($changed & 48) == 32) goto L20;
        r12 = false;
        goto L23
    }

    public static /* synthetic */ BasicTooltipState BasicTooltipState$default(boolean r0, boolean r1, MutatorMutex r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r0 = false;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r1 = true;
    L9:
        if ((r3 & 4) == 0) goto L12;
        r2 = BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
    L12:
        return BasicTooltipState(r0, r1, r2);
    }

    public static final BasicTooltipState BasicTooltipState(boolean initialIsVisible, boolean isPersistent, MutatorMutex mutatorMutex) {
        return new BasicTooltipStateImpl(initialIsVisible, isPersistent, mutatorMutex);
    }
}
