package androidx.compose.material;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IconButton.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aN\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a\\\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\n2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u00132\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0002\u0010\u0014\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u0015"}, d2 = {"RippleRadius", "Landroidx/compose/ui/unit/Dp;", "F", "IconButton", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "IconToggleButton", "checked", "onCheckedChange", "Lkotlin/Function1;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class IconButtonKt {
    private static final float RippleRadius = 0.0f;

    public static final void IconButton(final Function0<Unit> r29, Modifier modifier, boolean enabled, MutableInteractionSource interactionSource, final Function2<? super Composer, ? super Integer, Unit> r33, Composer $composer, final int $changed, final int r36) {
        Composer $composer2 = $composer.startRestartGroup(-111063634);
        ComposerKt.sourceInformation($composer2, "C(IconButton)P(4,3,1,2)61@2712L643:IconButton.kt#jmzs0o");
        int $dirty = $changed;
        if ((r36 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function0<Unit> r15 = r29;
    L13:
        int r2 = r36 & 2;
        if (r2 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier r3 = modifier;
    L24:
        int r4 = r36 & 4;
        if (r4 == 0) goto L28;
        $dirty = $dirty | 384;
        boolean r7 = enabled;
    L35:
        int r9 = r36 & 8;
        if (r9 == 0) goto L39;
        $dirty = $dirty | 3072;
        MutableInteractionSource interactionSource2 = interactionSource;
    L47:
        if ((r36 & 16) == 0) goto L50;
        $dirty = $dirty | 24576;
    L57:
        if (($dirty & 9363) == 9362) goto L59;
        boolean r11 = true;
    L61:
        if ($composer2.shouldExecute(r11, $dirty & 1) == false) goto L96;
        if (r2 == 0) goto L64;
        Modifier.Companion modifier2 = Modifier.Companion;
    L65:
        if (r4 == 0) goto L67;
        boolean enabled2 = true;
    L68:
        if (r9 == 0) goto L71;
        interactionSource2 = null;
    L71:
        if (ComposerKt.isTraceInProgress() == false) goto L73;
        ComposerKt.traceEventStart(-111063634, $dirty, -1, "androidx.compose.material.IconButton (IconButton.kt:60)");
    L73:
        Modifier modifier$iv = ClickableKt.m266clickableO2vRcR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), interactionSource2, RippleKt.m1746rippleH2RKhps$default(false, RippleRadius, 0, 4, null), enabled2, null, Role.m6174boximpl(Role.Companion.m6181getButtono7Vup1c()), r15, 8, null);
        Alignment contentAlignment$iv = Alignment.Companion.getCenter();
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv = (48 << 3) & 112;
        int $dirty2 = $dirty;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r16 = ComposeUiNode.Companion.getConstructor();
        Modifier modifier3 = modifier2;
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L76;
        ComposablesKt.invalidApplier();
    L76:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L79;
        Function0<ComposeUiNode> r5 = r16;
        $composer2.createNode(r5);
    L80:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r6 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L87;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L87;
    L88:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r1 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r0 = BoxScopeInstance.INSTANCE;
        int r8 = ((48 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -1682403006, "C75@3265L84:IconButton.kt#jmzs0o");
        if (enabled2 == false) goto L91;
        $composer2.startReplaceGroup(1885393015);
        ComposerKt.sourceInformation($composer2, "74@3222L7");
        ProvidableCompositionLocal<Float> r10 = ContentAlphaKt.getLocalContentAlpha();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r12 = $composer2.consume(r10);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        float contentAlpha = ((Number) r12).floatValue();
    L92:
        $composer2.endReplaceGroup();
        CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(contentAlpha)), r33, $composer2, ProvidedValue.$stable | (($dirty2 >> 9) & 112));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L95;
        ComposerKt.traceEventEnd();
    L95:
        final Modifier modifier4 = modifier3;
        final boolean enabled3 = enabled2;
        final MutableInteractionSource interactionSource3 = interactionSource2;
    L97:
        ScopeUpdateScope r13 = $composer2.endRestartGroup();
        if (r13 == null) goto L101;
        r13.updateScope(new AnonymousClass2(r29, modifier4, enabled3, interactionSource3, r33, $changed, r36));
        return;
    L101:
        return;
    L91:
        $composer2.startReplaceGroup(1885393848);
        ComposerKt.sourceInformation($composer2, "74@3248L8");
        contentAlpha = ContentAlpha.INSTANCE.getDisabled($composer2, 6);
    L87:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r6);
        goto L88
    L79:
        r5 = r16;
        $composer2.useNode();
        goto L80
    L67:
        enabled2 = r7;
        goto L68
    L64:
        modifier2 = r3;
        goto L65
    L96:
        $composer2.skipToGroupEnd();
        modifier4 = r3;
        enabled3 = r7;
        interactionSource3 = interactionSource2;
        goto L97
    L59:
        r11 = false;
        goto L61
    L50:
        if (($changed & 24576) != 0) goto L57;
        if ($composer2.changedInstance(r33) == false) goto L54;
        int r14 = 16384;
    L55:
        $dirty = $dirty | r14;
        goto L57
    L54:
        r14 = 8192;
        goto L55
    L39:
        if (($changed & 3072) != 0) goto L45;
        interactionSource2 = interactionSource;
        if ($composer2.changed(interactionSource2) == false) goto L43;
        int r17 = 2048;
    L44:
        $dirty = $dirty | r17;
        goto L47
    L43:
        r17 = 1024;
        goto L44
    L45:
        interactionSource2 = interactionSource;
        goto L47
    L28:
        if (($changed & 384) != 0) goto L34;
        r7 = enabled;
        if ($composer2.changed(r7) == false) goto L32;
        int r18 = 256;
    L33:
        $dirty = $dirty | r18;
        goto L35
    L32:
        r18 = 128;
        goto L33
    L34:
        r7 = enabled;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r3 = modifier;
        if ($composer2.changed(r3) == false) goto L21;
        int r19 = 32;
    L22:
        $dirty = $dirty | r19;
        goto L24
    L21:
        r19 = 16;
        goto L22
    L23:
        r3 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r15 = r29;
        if ($composer2.changedInstance(r15) == false) goto L10;
        int r20 = 4;
    L11:
        $dirty = $dirty | r20;
        goto L13
    L10:
        r20 = 2;
        goto L11
    L12:
        r15 = r29;
        goto L13
    }

    public static final void IconToggleButton(final boolean checked, final Function1<? super Boolean, Unit> r30, Modifier modifier, boolean enabled, MutableInteractionSource interactionSource, final Function2<? super Composer, ? super Integer, Unit> r34, Composer $composer, final int $changed, final int r37) {
        Composer $composer2 = $composer.startRestartGroup(-54657793);
        ComposerKt.sourceInformation($composer2, "C(IconToggleButton)P(!1,5,4,2,3)105@4641L697:IconButton.kt#jmzs0o");
        int $dirty = $changed;
        if ((r37 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        boolean r11 = checked;
    L14:
        if ((r37 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Function1<? super Boolean, Unit> r2 = r30;
    L24:
        int r3 = r37 & 4;
        if (r3 == 0) goto L28;
        $dirty = $dirty | 384;
        Modifier r4 = modifier;
    L35:
        int r5 = r37 & 8;
        if (r5 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean r8 = enabled;
    L46:
        int r10 = r37 & 16;
        if (r10 == 0) goto L50;
        $dirty = $dirty | 24576;
        MutableInteractionSource interactionSource2 = interactionSource;
    L58:
        if ((r37 & 32) == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L68:
        if ((74899 & $dirty) == 74898) goto L70;
        boolean r13 = true;
    L72:
        if ($composer2.shouldExecute(r13, $dirty & 1) == false) goto L107;
        if (r3 == 0) goto L75;
        Modifier.Companion modifier2 = Modifier.Companion;
    L76:
        if (r5 == 0) goto L78;
        boolean enabled2 = true;
    L79:
        if (r10 == 0) goto L82;
        interactionSource2 = null;
    L82:
        if (ComposerKt.isTraceInProgress() == false) goto L84;
        ComposerKt.traceEventStart(-54657793, $dirty, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:104)");
    L84:
        Modifier modifier$iv = ToggleableKt.m991toggleableO2vRcR0(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), r11, interactionSource2, RippleKt.m1746rippleH2RKhps$default(false, RippleRadius, 0, 4, null), enabled2, Role.m6174boximpl(Role.Companion.m6183getCheckboxo7Vup1c()), r2);
        Alignment contentAlignment$iv = Alignment.Companion.getCenter();
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv = (48 << 3) & 112;
        int $dirty2 = $dirty;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r16 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        Modifier modifier3 = modifier2;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L87;
        ComposablesKt.invalidApplier();
    L87:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L90;
        Function0<ComposeUiNode> r6 = r16;
        $composer2.createNode(r6);
    L91:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r7 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L98;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L98;
    L99:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r1 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r0 = BoxScopeInstance.INSTANCE;
        int r9 = ((48 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, 1341856174, "C120@5248L84:IconButton.kt#jmzs0o");
        if (enabled2 == false) goto L102;
        $composer2.startReplaceGroup(-2034922869);
        ComposerKt.sourceInformation($composer2, "119@5205L7");
        ProvidableCompositionLocal<Float> r12 = ContentAlphaKt.getLocalContentAlpha();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r14 = $composer2.consume(r12);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        float contentAlpha = ((Number) r14).floatValue();
    L103:
        $composer2.endReplaceGroup();
        CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(contentAlpha)), r34, $composer2, ProvidedValue.$stable | (($dirty2 >> 12) & 112));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L106;
        ComposerKt.traceEventEnd();
    L106:
        final boolean enabled3 = enabled2;
        final Modifier modifier4 = modifier3;
        final MutableInteractionSource interactionSource3 = interactionSource2;
    L108:
        ScopeUpdateScope r15 = $composer2.endRestartGroup();
        if (r15 == null) goto L112;
        r15.updateScope(new C04302(checked, r30, modifier4, enabled3, interactionSource3, r34, $changed, r37));
        return;
    L112:
        return;
    L102:
        $composer2.startReplaceGroup(-2034922036);
        ComposerKt.sourceInformation($composer2, "119@5231L8");
        contentAlpha = ContentAlpha.INSTANCE.getDisabled($composer2, 6);
    L98:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r7);
        goto L99
    L90:
        r6 = r16;
        $composer2.useNode();
        goto L91
    L78:
        enabled2 = r8;
        goto L79
    L75:
        modifier2 = r4;
        goto L76
    L107:
        $dirty2 = $dirty;
        $composer2.skipToGroupEnd();
        modifier4 = r4;
        enabled3 = r8;
        interactionSource3 = interactionSource2;
        goto L108
    L70:
        r13 = false;
        goto L72
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L68;
        if ($composer2.changedInstance(r34) == false) goto L65;
        int r17 = 131072;
    L66:
        $dirty = $dirty | r17;
        goto L68
    L65:
        r17 = 65536;
        goto L66
    L50:
        if (($changed & 24576) != 0) goto L56;
        interactionSource2 = interactionSource;
        if ($composer2.changed(interactionSource2) == false) goto L54;
        int r18 = 16384;
    L55:
        $dirty = $dirty | r18;
        goto L58
    L54:
        r18 = 8192;
        goto L55
    L56:
        interactionSource2 = interactionSource;
        goto L58
    L39:
        if (($changed & 3072) != 0) goto L45;
        r8 = enabled;
        if ($composer2.changed(r8) == false) goto L43;
        int r19 = 2048;
    L44:
        $dirty = $dirty | r19;
        goto L46
    L43:
        r19 = 1024;
        goto L44
    L45:
        r8 = enabled;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L32;
        int r20 = 256;
    L33:
        $dirty = $dirty | r20;
        goto L35
    L32:
        r20 = 128;
        goto L33
    L34:
        r4 = modifier;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r2 = r30;
        if ($composer2.changedInstance(r2) == false) goto L21;
        int r21 = 32;
    L22:
        $dirty = $dirty | r21;
        goto L24
    L21:
        r21 = 16;
        goto L22
    L23:
        r2 = r30;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r11 = checked;
        if ($composer2.changed(r11) == false) goto L10;
        int r22 = 4;
    L11:
        $dirty = $dirty | r22;
        goto L14
    L10:
        r22 = 2;
        goto L11
    L12:
        r11 = checked;
        goto L14
    }

    static {
        RippleRadius = Dp.m6973constructorimpl(24);
    }
}
