package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContextMenuArea.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aF\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u000bH\u0001¢\u0006\u0002\u0010\f\u001as\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0012H\u0001¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"ContextMenu", "", "state", "Landroidx/compose/foundation/contextmenu/ContextMenuState;", "onDismiss", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "contextMenuBuilderBlock", "Lkotlin/Function1;", "Landroidx/compose/foundation/contextmenu/ContextMenuScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/contextmenu/ContextMenuState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ContextMenuArea", "enabled", "", "onOpenGesture", "content", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/contextmenu/ContextMenuState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ContextMenuArea_androidKt {
    public static final void ContextMenuArea(final ContextMenuState state, final Function0<Unit> r36, final Function1<? super ContextMenuScope, Unit> r37, Modifier modifier, boolean enabled, Function0<Unit> r40, final Function2<? super Composer, ? super Integer, Unit> r41, Composer $composer, final int $changed, final int r44) {
        Composer $composer2 = $composer.startRestartGroup(1969259374);
        ComposerKt.sourceInformation($composer2, "C(ContextMenuArea)P(6,4,1,3,2,5)56@2150L231:ContextMenuArea.android.kt#3xeu6s");
        int $dirty = $changed;
        if ((r44 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r44 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L24:
        if ((r44 & 4) == 0) goto L27;
        $dirty = $dirty | 384;
    L34:
        int r6 = r44 & 8;
        if (r6 == 0) goto L38;
        $dirty = $dirty | 3072;
        Modifier modifier2 = modifier;
    L45:
        int r11 = r44 & 16;
        if (r11 == 0) goto L49;
        $dirty = $dirty | 24576;
        boolean enabled2 = enabled;
    L56:
        int r13 = r44 & 32;
        if (r13 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        final Function0<Unit> r15 = r40;
    L68:
        if ((r44 & 64) == 0) goto L71;
        $dirty = $dirty | 1572864;
    L77:
        boolean r18 = true;
        if (($dirty & 599187) == 599186) goto L80;
        boolean r4 = true;
    L82:
        if ($composer2.shouldExecute(r4, $dirty & 1) == false) goto L129;
        if (r6 == 0) goto L85;
        modifier2 = Modifier.Companion;
    L85:
        if (r11 == 0) goto L87;
        enabled2 = true;
    L87:
        if (r13 == 0) goto L90;
        r15 = C02211.INSTANCE;
    L90:
        if (ComposerKt.isTraceInProgress() == false) goto L92;
        ComposerKt.traceEventStart(1969259374, $dirty, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:46)");
    L92:
        if (enabled2 == false) goto L109;
        $composer2.startReplaceGroup(1021907653);
        ComposerKt.sourceInformation($composer2, "49@1994L103");
        ComposerKt.sourceInformationMarkerStart($composer2, -2045243896, "CC(remember):ContextMenuArea.android.kt#9igjgp");
        if ((458752 & $dirty) != 131072) goto L96;
        boolean r5 = true;
    L98:
        if (($dirty & 14) == 4) goto L101;
        r18 = false;
    L101:
        boolean invalid$iv = r5 | r18;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L104;
    L107:
        Object value$iv = (Function1) new ContextMenuArea_androidKt$ContextMenuArea$finalModifier$1$1(r15, state);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L108:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r1 = ContextMenuGestures_androidKt.contextMenuGestures(modifier2, (Function1) it$iv);
        $composer2.endReplaceGroup();
    L110:
        Modifier finalModifier = r1;
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, true);
        int $changed$iv$iv = (384 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        int $dirty2 = $dirty;
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, finalModifier);
        Function0<ComposeUiNode> r20 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L113;
        ComposablesKt.invalidApplier();
    L113:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L116;
        $composer2.createNode(r20);
    L117:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L123;
        CompositionLocalMap localMap$iv$iv2 = localMap$iv$iv;
        MeasurePolicy measurePolicy$iv2 = measurePolicy$iv;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == true) goto L125;
    L124:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r2);
    L125:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r22 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance r3 = BoxScopeInstance.INSTANCE;
        int r26 = ((384 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -1754047841, "C57@2211L9,58@2229L146:ContextMenuArea.android.kt#3xeu6s");
        r41.invoke($composer2, Integer.valueOf(($dirty2 >> 18) & 14));
        ContextMenu(state, r36, null, r37, $composer2, (($dirty2 & 14) | ($dirty2 & 112)) | (($dirty2 << 3) & 7168), 4);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L128;
        ComposerKt.traceEventEnd();
    L128:
        final Modifier modifier3 = modifier2;
        final boolean enabled3 = enabled2;
        final Function0<Unit> r7 = r15;
    L130:
        ScopeUpdateScope r12 = $composer2.endRestartGroup();
        if (r12 == null) goto L134;
        r12.updateScope(new AnonymousClass3(state, r36, r37, modifier3, enabled3, r7, r41, $changed, r44));
        return;
    L134:
        return;
    L123:
        localMap$iv$iv2 = localMap$iv$iv;
        measurePolicy$iv2 = measurePolicy$iv;
        goto L124
    L116:
        $composer2.useNode();
        goto L117
    L104:
        if (it$iv != Composer.Companion.getEmpty()) goto L108;
    L96:
        r5 = false;
        goto L98
    L109:
        $composer2.startReplaceGroup(1022064513);
        $composer2.endReplaceGroup();
        r1 = modifier2;
        goto L110
    L129:
        $composer2.skipToGroupEnd();
        modifier3 = modifier2;
        enabled3 = enabled2;
        r7 = r15;
        goto L130
    L80:
        r4 = false;
        goto L82
    L71:
        if (($changed & 1572864) != 0) goto L77;
        if ($composer2.changedInstance(r41) == false) goto L75;
        int r16 = 1048576;
    L76:
        $dirty = $dirty | r16;
        goto L77
    L75:
        r16 = 524288;
        goto L76
    L60:
        if ((196608 & $changed) != 0) goto L66;
        r15 = r40;
        if ($composer2.changedInstance(r15) == false) goto L64;
        int r17 = 131072;
    L65:
        $dirty = $dirty | r17;
        goto L68
    L64:
        r17 = 65536;
        goto L65
    L66:
        r15 = r40;
        goto L68
    L49:
        if (($changed & 24576) != 0) goto L55;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L53;
        int r14 = 16384;
    L54:
        $dirty = $dirty | r14;
        goto L56
    L53:
        r14 = 8192;
        goto L54
    L55:
        enabled2 = enabled;
        goto L56
    L38:
        if (($changed & 3072) != 0) goto L44;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L42;
        int r19 = 2048;
    L43:
        $dirty = $dirty | r19;
        goto L45
    L42:
        r19 = 1024;
        goto L43
    L44:
        modifier2 = modifier;
        goto L45
    L27:
        if (($changed & 384) != 0) goto L34;
        if ($composer2.changedInstance(r37) == false) goto L31;
        int r8 = 256;
    L32:
        $dirty = $dirty | r8;
        goto L34
    L31:
        r8 = 128;
        goto L32
    L16:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changedInstance(r36) == false) goto L20;
        int r9 = 32;
    L21:
        $dirty = $dirty | r9;
        goto L24
    L20:
        r9 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(state) == false) goto L10;
        int r10 = 4;
    L11:
        $dirty = $dirty | r10;
        goto L13
    L10:
        r10 = 2;
        goto L11
    }

    public static final void ContextMenu(final ContextMenuState state, final Function0<Unit> r15, Modifier modifier, final Function1<? super ContextMenuScope, Unit> r17, Composer $composer, final int $changed, final int r20) {
        Composer $composer2 = $composer.startRestartGroup(645832757);
        ComposerKt.sourceInformation($composer2, "C(ContextMenu)P(3,2,1)78@2705L76,80@2787L197:ContextMenuArea.android.kt#3xeu6s");
        int $dirty = $changed;
        if ((r20 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r20 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L22:
        int r2 = r20 & 4;
        if (r2 == 0) goto L26;
        $dirty = $dirty | 384;
        final Modifier modifier2 = modifier;
    L34:
        if ((r20 & 8) == 0) goto L37;
        $dirty = $dirty | 3072;
        final Function1<? super ContextMenuScope, Unit> r4 = r17;
    L44:
        int $dirty2 = $dirty;
        if (($dirty2 & 1171) == 1170) goto L47;
        boolean r1 = true;
    L49:
        if ($composer2.shouldExecute(r1, $dirty2 & 1) == false) goto L74;
        if (r2 == 0) goto L53;
        modifier2 = Modifier.Companion;
    L53:
        if (ComposerKt.isTraceInProgress() == false) goto L55;
        ComposerKt.traceEventStart(645832757, $dirty2, -1, "androidx.compose.foundation.contextmenu.ContextMenu (ContextMenuArea.android.kt:73)");
    L55:
        ContextMenuState.Status status = state.getStatus();
        if ((status instanceof ContextMenuState.Status.Open) == false) goto L58;
        ComposerKt.sourceInformationMarkerStart($composer2, -1573309600, "CC(remember):ContextMenuArea.android.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(status);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L67;
    L70:
        Object value$iv = new ContextMenuPopupPositionProvider(IntOffsetKt.m7118roundk4lQ0M(((ContextMenuState.Status.Open) status).m359getOffsetF1C5BW0()), null);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L71:
        ContextMenuPopupPositionProvider popupPositionProvider = (ContextMenuPopupPositionProvider) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ContextMenuUi_androidKt.ContextMenuPopup(popupPositionProvider, r15, modifier2, r17, $composer2, (($dirty2 & 112) | ($dirty2 & 896)) | ($dirty2 & 7168), 0);
        $composer2 = $composer2;
        if (ComposerKt.isTraceInProgress() == false) goto L75;
        ComposerKt.traceEventEnd();
    L75:
        ScopeUpdateScope r9 = $composer2.endRestartGroup();
        if (r9 == null) goto L80;
        r9.updateScope(new AnonymousClass2(state, r15, modifier2, r17, $changed, r20));
        return;
    L80:
        return;
    L67:
        if (it$iv != Composer.Companion.getEmpty()) goto L71;
    L58:
        if (ComposerKt.isTraceInProgress() == false) goto L60;
        ComposerKt.traceEventEnd();
    L60:
        ScopeUpdateScope r10 = $composer2.endRestartGroup();
        if (r10 == null) goto L79;
        r10.updateScope(new AnonymousClass1(state, r15, modifier2, r4, $changed, r20));
        return;
    L79:
        return;
    L74:
        $composer2.skipToGroupEnd();
        goto L75
    L47:
        r1 = false;
        goto L49
    L37:
        if (($changed & 3072) != 0) goto L43;
        r4 = r17;
        if ($composer2.changedInstance(r4) == false) goto L41;
        int r6 = 2048;
    L42:
        $dirty = $dirty | r6;
        goto L44
    L41:
        r6 = 1024;
        goto L42
    L43:
        r4 = r17;
        goto L44
    L26:
        if (($changed & 384) != 0) goto L32;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L30;
        int r5 = 256;
    L31:
        $dirty = $dirty | r5;
        goto L34
    L30:
        r5 = 128;
        goto L31
    L32:
        modifier2 = modifier;
        goto L34
    L16:
        if (($changed & 48) != 0) goto L22;
        if ($composer2.changedInstance(r15) == false) goto L20;
        int r3 = 32;
    L21:
        $dirty = $dirty | r3;
        goto L22
    L20:
        r3 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(state) == false) goto L10;
        int r7 = 4;
    L11:
        $dirty = $dirty | r7;
        goto L13
    L10:
        r7 = 2;
        goto L11
    }
}
