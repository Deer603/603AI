package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Switch.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001aU\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00182\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H\u0007¢\u0006\u0002\u0010\"\u001a?\u0010#\u001a\u00020\u0016*\u00020$2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020&2\u0006\u0010\u001e\u001a\u00020'H\u0003¢\u0006\u0002\u0010(\u001a.\u0010)\u001a\u00020\u0016*\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b/\u00100\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u000e\u0010\u0007\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\t\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\n\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0016\u0010\u000b\u001a\u00020\u0004X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\f\u0010\r\"\u0010\u0010\u000e\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\u000f\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\u0010\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0016\u0010\u0011\u001a\u00020\u0004X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0012\u0010\r\"\u0016\u0010\u0013\u001a\u00020\u0004X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0014\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00061²\u0006\n\u00102\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\u0018\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u001aX\u008a\u0084\u0002²\u0006\n\u00104\u001a\u00020\u0018X\u008a\u0084\u0002²\u0006\n\u0010+\u001a\u00020,X\u008a\u0084\u0002²\u0006\n\u00105\u001a\u00020,X\u008a\u0084\u0002²\u0006\n\u00106\u001a\u00020,X\u008a\u0084\u0002"}, d2 = {"AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "DefaultSwitchPadding", "Landroidx/compose/ui/unit/Dp;", "F", "SwitchHeight", "SwitchPositionalThreshold", "SwitchVelocityThreshold", "SwitchWidth", "ThumbDefaultElevation", "ThumbDiameter", "getThumbDiameter", "()F", "ThumbPathLength", "ThumbPressedElevation", "ThumbRippleRadius", "TrackStrokeWidth", "getTrackStrokeWidth", "TrackWidth", "getTrackWidth", "Switch", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "colors", "Landroidx/compose/material/SwitchColors;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SwitchColors;Landroidx/compose/runtime/Composer;II)V", "SwitchImpl", "Landroidx/compose/foundation/layout/BoxScope;", "thumbValue", "Lkotlin/Function0;", "Landroidx/compose/foundation/interaction/InteractionSource;", "(Landroidx/compose/foundation/layout/BoxScope;ZZLandroidx/compose/material/SwitchColors;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)V", "drawTrack", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "trackColor", "Landroidx/compose/ui/graphics/Color;", "trackWidth", "strokeWidth", "drawTrack-RPmYEkk", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFF)V", "material_release", "forceAnimationCheck", "currentOnCheckedChange", "currentChecked", "thumbColor", "resolvedThumbColor"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SwitchKt {
    private static final TweenSpec<Float> AnimationSpec = null;
    private static final float DefaultSwitchPadding = 0.0f;
    private static final float SwitchHeight = 0.0f;
    private static final float SwitchPositionalThreshold = 0.7f;
    private static final float SwitchVelocityThreshold = 0.0f;
    private static final float SwitchWidth = 0.0f;
    private static final float ThumbDefaultElevation = 0.0f;
    private static final float ThumbDiameter = 0.0f;
    private static final float ThumbPathLength = 0.0f;
    private static final float ThumbPressedElevation = 0.0f;
    private static final float ThumbRippleRadius = 0.0f;
    private static final float TrackStrokeWidth = 0.0f;
    private static final float TrackWidth = 0.0f;

    public static final /* synthetic */ boolean access$Switch$lambda$3(MutableState $forceAnimationCheck$delegate) {
        return Switch$lambda$3($forceAnimationCheck$delegate);
    }

    public static final /* synthetic */ void access$Switch$lambda$4(MutableState $forceAnimationCheck$delegate, boolean value) {
        Switch$lambda$4($forceAnimationCheck$delegate, value);
    }

    public static final /* synthetic */ Function1 access$Switch$lambda$7(State $currentOnCheckedChange$delegate) {
        return Switch$lambda$7($currentOnCheckedChange$delegate);
    }

    public static final /* synthetic */ boolean access$Switch$lambda$8(State $currentChecked$delegate) {
        return Switch$lambda$8($currentChecked$delegate);
    }

    public static final /* synthetic */ void access$SwitchImpl(BoxScope $receiver, boolean checked, boolean enabled, SwitchColors colors, Function0 thumbValue, InteractionSource interactionSource, Composer $composer, int $changed) {
        SwitchImpl($receiver, checked, enabled, colors, thumbValue, interactionSource, $composer, $changed);
    }

    public static final /* synthetic */ long access$SwitchImpl$lambda$15(State $trackColor$delegate) {
        return SwitchImpl$lambda$15($trackColor$delegate);
    }

    /* JADX INFO: renamed from: access$drawTrack-RPmYEkk, reason: not valid java name */
    public static final /* synthetic */ void m1795access$drawTrackRPmYEkk(DrawScope $receiver, long trackColor, float trackWidth, float strokeWidth) {
        m1796drawTrackRPmYEkk($receiver, trackColor, trackWidth, strokeWidth);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void Switch(final boolean r45, final Function1<? super Boolean, Unit> r46, Modifier r47, boolean r48, MutableInteractionSource r49, SwitchColors r50, Composer r51, final int r52, final int r53) {
        Composer r3 = r51.startRestartGroup(25866825);
        ComposerKt.sourceInformation(r3, "C(Switch)P(!1,5,4,2,3)*104@4767L7,109@5149L34,110@5238L7,112@5323L523,125@5881L37,126@5945L29,127@6018L315,127@5979L354,136@6383L133,136@6338L178,141@6554L7,156@6995L1050:Switch.kt#jmzs0o");
        int r4 = r52;
        if ((r53 & 1) == 0) goto L6;
        r4 = r4 | 6;
    L13:
        if ((r53 & 2) == 0) goto L16;
        r4 = r4 | 48;
    L22:
        int r5 = r53 & 4;
        if (r5 == 0) goto L26;
        r4 = r4 | 384;
        Modifier r9 = r47;
    L33:
        int r10 = r53 & 8;
        if (r10 == 0) goto L37;
        r4 = r4 | 3072;
        boolean r11 = r48;
    L44:
        int r12 = r53 & 16;
        if (r12 == 0) goto L48;
        r4 = r4 | 24576;
        MutableInteractionSource r13 = r49;
    L56:
        if ((196608 & r52) == 0) goto L58;
        SwitchColors r14 = r50;
    L67:
        if ((74899 & r4) == 74898) goto L69;
        boolean r8 = true;
    L71:
        if (r3.shouldExecute(r8, r4 & 1) == false) goto L180;
        r3.startDefaults();
        ComposerKt.sourceInformation(r3, "99@4574L8");
        if ((r52 & 1) != 0) goto L75;
    L81:
        if (r5 == 0) goto L83;
        Modifier.Companion r6 = Modifier.Companion;
    L84:
        if (r10 == 0) goto L86;
        boolean r34 = true;
    L87:
        if (r12 == 0) goto L89;
        MutableInteractionSource r35 = null;
    L91:
        if ((r53 & 32) == 0) goto L93;
        Composer r15 = r3;
        r9 = r6;
        r14 = SwitchDefaults.INSTANCE.m1794colorsSQMK_m0(0, 0, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, r3, 0, 6, 1023);
        boolean r16 = r34;
        int r17 = r4 & (-458753);
    L94:
        r15.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L98;
        ComposerKt.traceEventStart(25866825, r17, -1, "androidx.compose.material.Switch (Switch.kt:100)");
    L98:
        if (r35 != null) goto L104;
        r15.startReplaceGroup(-1604939679);
        ComposerKt.sourceInformation(r15, "102@4668L39");
        ComposerKt.sourceInformationMarkerStart(r15, 779511745, "CC(remember):Switch.kt#9igjgp");
        Composer r7 = r15;
        Object r18 = r7.rememberedValue();
        boolean r54 = false;
        if (r18 != Composer.Companion.getEmpty()) goto L103;
        MutableInteractionSource r19 = InteractionSourceKt.MutableInteractionSource();
        r7.updateRememberedValue(r19);
        r18 = r19;
    L103:
        MutableInteractionSource r110 = (MutableInteractionSource) r18;
        ComposerKt.sourceInformationMarkerEnd(r15);
        r15.endReplaceGroup();
    L105:
        MutableInteractionSource r20 = r110;
        final float r111 = 0.0f;
        ProvidableCompositionLocal<Density> r0 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(r15, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r112 = r15.consume(r0);
        ComposerKt.sourceInformationMarkerEnd(r15);
        final float r1 = ((Density) r112).mo376toPx0680j_4(ThumbPathLength);
        ComposerKt.sourceInformationMarkerStart(r15, 779527132, "CC(remember):Switch.kt#9igjgp");
        Composer r21 = r15;
        Object r22 = r21.rememberedValue();
        if (r22 != Composer.Companion.getEmpty()) goto L109;
        MutableState r23 = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(r54), null, 2, null);
        r21.updateRememberedValue(r23);
        r22 = r23;
    L109:
        MutableState r25 = (MutableState) r22;
        ComposerKt.sourceInformationMarkerEnd(r15);
        ProvidableCompositionLocal<Density> r24 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(r15, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r26 = r15.consume(r24);
        ComposerKt.sourceInformationMarkerEnd(r15);
        final float r27 = ((Density) r26).mo376toPx0680j_4(SwitchVelocityThreshold);
        ComposerKt.sourceInformationMarkerStart(r15, 779533189, "CC(remember):Switch.kt#9igjgp");
        boolean r28 = r15.changed(r1) | r15.changed(r27);
        Composer r29 = r15;
        Object r30 = r29.rememberedValue();
        if (r28 == true) goto L116;
        if (r30 == Composer.Companion.getEmpty()) goto L116;
    L117:
        final AnchoredDraggableState r113 = (AnchoredDraggableState) r30;
        ComposerKt.sourceInformationMarkerEnd(r15);
        State r31 = SnapshotStateKt.rememberUpdatedState(r46, r15, (r17 >> 3) & 14);
        State r32 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(r45), r15, r17 & 14);
        ComposerKt.sourceInformationMarkerStart(r15, 779555221, "CC(remember):Switch.kt#9igjgp");
        boolean r33 = (r15.changed(r113) | r15.changed(r32)) | r15.changed(r31);
        Composer r410 = r15;
        Object r2 = r410.rememberedValue();
        if (r33 == false) goto L120;
    L123:
        SwitchKt$Switch$1$1 r210 = new SwitchKt$Switch$1$1(r113, r32, r31, r25, null);
        r410.updateRememberedValue(r210);
        r2 = r210;
    L124:
        ComposerKt.sourceInformationMarkerEnd(r15);
        boolean r36 = r54;
        EffectsKt.LaunchedEffect(r113, (Function2) r2, r15, r36 ? 1 : 0);
        Boolean r37 = Boolean.valueOf(r45);
        Boolean r38 = Boolean.valueOf(Switch$lambda$3(r25));
        ComposerKt.sourceInformationMarkerStart(r15, 779566719, "CC(remember):Switch.kt#9igjgp");
        if ((r17 & 14) != 4) goto L127;
        char r39 = 1;
    L128:
        boolean r40 = r39 | (r15.changed(r113) ? 1 : 0);
        Composer r41 = r15;
        SwitchKt$Switch$2$1 r42 = r41.rememberedValue();
        if (r40 != 0) goto L134;
        float r411 = r27;
        if (r42 != Composer.Companion.getEmpty()) goto L136;
    L135:
        r42 = new SwitchKt$Switch$2$1(r45, r113, null);
        r41.updateRememberedValue(r42);
    L136:
        ComposerKt.sourceInformationMarkerEnd(r15);
        EffectsKt.LaunchedEffect(r37, r38, (Function2) r42, r15, r17 & 14);
        ProvidableCompositionLocal<LayoutDirection> r43 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(r15, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r44 = r15.consume(r43);
        ComposerKt.sourceInformationMarkerEnd(r15);
        if (r44 != LayoutDirection.Rtl) goto L139;
        boolean r55 = true;
    L140:
        boolean r56 = r55;
        if (r46 == null) goto L143;
        boolean r57 = r16;
        MutableInteractionSource r58 = r20;
        boolean r114 = false;
        int r115 = 2;
        Modifier.Companion r59 = ToggleableKt.m991toggleableO2vRcR0(Modifier.Companion, r45, r58, null, r57, Role.m6174boximpl(Role.Companion.m6187getSwitcho7Vup1c()), r46);
    L145:
        if (r46 == null) goto L147;
        Modifier.Companion r60 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.Companion);
    L148:
        Modifier r116 = r9.then(r60).then(r59);
        Orientation r117 = Orientation.Horizontal;
        if (r57 == false) goto L152;
        if (r46 == null) goto L152;
        boolean r118 = true;
    L153:
        Modifier r61 = SizeKt.m766requiredSizeVpY3zN4(PaddingKt.m725padding3ABfNKs(SizeKt.wrapContentSize$default(AnchoredDraggableKt.anchoredDraggable(r116, r4, r117, r118, r56, r58, false), Alignment.Companion.getCenter(), r114, r115, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
        boolean r62 = r114;
        ComposerKt.sourceInformationMarkerStart(r15, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy r119 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        int r120 = ((r62 ? 1 : 0) << 3) & 112;
        MutableInteractionSource r412 = r58;
        ComposerKt.sourceInformationMarkerStart(r15, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int r63 = ComposablesKt.getCurrentCompositeKeyHash(r15, 0);
        CompositionLocalMap r64 = r15.getCurrentCompositionLocalMap();
        Modifier r65 = ComposedModifierKt.materializeModifier(r15, r61);
        Function0<ComposeUiNode> r121 = ComposeUiNode.Companion.getConstructor();
        int r66 = ((r120 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart(r15, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if ((r15.getApplier() instanceof Applier) == true) goto L156;
        ComposablesKt.invalidApplier();
    L156:
        r15.startReusableNode();
        if (r15.getInserting() == false) goto L159;
        Function0<ComposeUiNode> r67 = r121;
        r15.createNode(r67);
    L160:
        Composer r68 = Updater.m3808constructorimpl(r15);
        Updater.m3815setimpl(r68, r119, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r68, r64, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r69 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r68.getInserting() == true) goto L166;
        boolean r310 = r57;
        if (Intrinsics.areEqual(r68.rememberedValue(), Integer.valueOf(r63)) == true) goto L168;
    L167:
        r68.updateRememberedValue(Integer.valueOf(r63));
        r68.apply(Integer.valueOf(r63), r69);
    L168:
        Updater.m3815setimpl(r68, r65, ComposeUiNode.Companion.getSetModifier());
        int r70 = (r66 >> 6) & 14;
        Composer r71 = r15;
        ComposerKt.sourceInformationMarkerStart(r71, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r72 = BoxScopeInstance.INSTANCE;
        int r73 = (((r62 ? 1 : 0) >> 6) & 112) | 6;
        BoxScopeInstance r74 = r72;
        ComposerKt.sourceInformationMarkerStart(r71, -277135704, "C182@7936L42,178@7781L258:Switch.kt#jmzs0o");
        boolean r75 = ((Boolean) r113.getTargetValue()).booleanValue();
        ComposerKt.sourceInformationMarkerStart(r71, 545254211, "CC(remember):Switch.kt#9igjgp");
        boolean r76 = r71.changed(r113);
        Object r77 = r71.rememberedValue();
        if (r76 == true) goto L175;
        if (r77 == Composer.Companion.getEmpty()) goto L175;
    L176:
        ComposerKt.sourceInformationMarkerEnd(r71);
        boolean r122 = r310;
        SwitchImpl(r74, r75, r122, r14, (Function0) r77, r412, r71, (((r17 >> 3) & 896) | (r73 & 14)) | ((r17 >> 6) & 7168));
        ComposerKt.sourceInformationMarkerEnd(r71);
        ComposerKt.sourceInformationMarkerEnd(r71);
        r15.endNode();
        ComposerKt.sourceInformationMarkerEnd(r15);
        ComposerKt.sourceInformationMarkerEnd(r15);
        ComposerKt.sourceInformationMarkerEnd(r15);
        if (ComposerKt.isTraceInProgress() == false) goto L179;
        ComposerKt.traceEventEnd();
    L179:
        final Modifier r78 = r9;
        final boolean r79 = r122;
        final SwitchColors r80 = r14;
        final MutableInteractionSource r81 = r35;
    L181:
        ScopeUpdateScope r123 = r15.endRestartGroup();
        if (r123 == null) goto L185;
        r123.updateScope(new AnonymousClass4(r45, r46, r78, r79, r81, r80, r52, r53));
        return;
    L185:
        return;
    L175:
        r77 = (Function0) new SwitchKt$Switch$3$1$1(r113);
        r71.updateRememberedValue(r77);
        goto L176
    L166:
        r310 = r57;
        goto L167
    L159:
        r67 = r121;
        r15.useNode();
    L152:
        r118 = r114;
        goto L153
    L147:
        r60 = Modifier.Companion;
        goto L148
    L143:
        r57 = r16;
        r58 = r20;
        r114 = false;
        r115 = 2;
        r59 = Modifier.Companion;
        goto L145
    L139:
        r55 = false;
        goto L140
    L134:
        r411 = r27;
        goto L135
    L127:
        r39 = r36 ? 1 : 0;
        goto L128
    L120:
        if (r2 != Composer.Companion.getEmpty()) goto L124;
    L116:
        TweenSpec<Float> r124 = AnimationSpec;
        AnchoredDraggableState r311 = new AnchoredDraggableState(Boolean.valueOf(r45), AnchoredDraggableKt.DraggableAnchors(new SwitchKt$Switch$anchoredDraggableState$1$1(r111, r1)), SwitchKt$Switch$anchoredDraggableState$1$2.INSTANCE, new SwitchKt$Switch$anchoredDraggableState$1$3(r27), r124, null, 32, null);
        r29.updateRememberedValue(r311);
        r30 = r311;
        goto L117
    L104:
        r54 = false;
        r15.startReplaceGroup(779511094);
        r15.endReplaceGroup();
        r110 = r35;
        goto L105
    L93:
        r15 = r3;
        r14 = r50;
        r17 = r4;
        r9 = r6;
        r16 = r34;
        goto L94
    L89:
        r35 = r13;
        goto L91
    L86:
        r34 = r11;
        goto L87
    L83:
        r6 = r9;
        goto L84
    L75:
        if (r3.getDefaultsInvalid() == true) goto L81;
        r3.skipToGroupEnd();
        if ((r53 & 32) == 0) goto L80;
        r4 = r4 & (-458753);
    L80:
        r15 = r3;
        r17 = r4;
        r35 = r13;
        r16 = r11;
        goto L94
    L180:
        r15 = r3;
        r15.skipToGroupEnd();
        r80 = r50;
        r78 = r9;
        r81 = r13;
        r79 = r11;
        goto L181
    L69:
        r8 = false;
        goto L71
    L58:
        if ((r53 & 32) != 0) goto L62;
        r14 = r50;
        if (r3.changed(r14) == false) goto L63;
        int r125 = 131072;
    L64:
        r4 = r4 | r125;
    L63:
        r125 = 65536;
        goto L64
    L62:
        r14 = r50;
        goto L63
    L48:
        if ((r52 & 24576) != 0) goto L54;
        r13 = r49;
        if (r3.changed(r13) == false) goto L52;
        int r126 = 16384;
    L53:
        r4 = r4 | r126;
        goto L56
    L52:
        r126 = 8192;
        goto L53
    L54:
        r13 = r49;
        goto L56
    L37:
        if ((r52 & 3072) != 0) goto L43;
        r11 = r48;
        if (r3.changed(r11) == false) goto L41;
        int r127 = 2048;
    L42:
        r4 = r4 | r127;
        goto L44
    L41:
        r127 = 1024;
        goto L42
    L43:
        r11 = r48;
        goto L44
    L26:
        if ((r52 & 384) != 0) goto L32;
        r9 = r47;
        if (r3.changed(r9) == false) goto L30;
        int r128 = 256;
    L31:
        r4 = r4 | r128;
        goto L33
    L30:
        r128 = 128;
        goto L31
    L32:
        r9 = r47;
        goto L33
    L16:
        if ((r52 & 48) != 0) goto L22;
        if (r3.changedInstance(r46) == false) goto L20;
        int r82 = 32;
    L21:
        r4 = r4 | r82;
        goto L22
    L20:
        r82 = 16;
        goto L21
    L6:
        if ((r52 & 6) != 0) goto L13;
        if (r3.changed(r45) == false) goto L10;
        int r83 = 4;
    L11:
        r4 = r4 | r83;
        goto L13
    L10:
        r83 = 2;
        goto L11
    }

    private static final boolean Switch$lambda$3(MutableState<Boolean> r4) {
        MutableState<Boolean> $this$getValue$iv = r4;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void Switch$lambda$4(MutableState<Boolean> r5, boolean value) {
        r5.setValue(Boolean.valueOf(value));
    }

    private static final Function1<Boolean, Unit> Switch$lambda$7(State<? extends Function1<? super Boolean, Unit>> r4) {
        Object thisObj$iv = r4.getValue();
        return (Function1) thisObj$iv;
    }

    private static final boolean Switch$lambda$8(State<Boolean> r4) {
        Object thisObj$iv = r4.getValue();
        return ((Boolean) thisObj$iv).booleanValue();
    }

    private static final void SwitchImpl(final BoxScope $this$SwitchImpl, final boolean checked, final boolean enabled, final SwitchColors colors, final Function0<Float> r36, final InteractionSource interactionSource, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(70908914);
        ComposerKt.sourceInformation($composer2, "C(SwitchImpl)P(!1,2!1,4)221@9116L46,223@9202L614,223@9168L648,243@10043L28,244@10131L81,244@10076L136,247@10242L28,248@10320L7,*249@10379L7,252@10502L6,251@10437L252,260@10768L43,258@10694L454:Switch.kt#jmzs0o");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed($this$SwitchImpl) == false) goto L7;
        int r9 = 4;
    L8:
        $dirty = $dirty | r9;
        goto L10
    L7:
        r9 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changed(checked) == false) goto L14;
        int r10 = 32;
    L15:
        $dirty = $dirty | r10;
        goto L17
    L14:
        r10 = 16;
    L17:
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changed(enabled) == false) goto L21;
        int r11 = 256;
    L22:
        $dirty = $dirty | r11;
        goto L24
    L21:
        r11 = 128;
    L24:
        if (($changed & 3072) != 0) goto L31;
        if ($composer2.changed(colors) == false) goto L28;
        int r12 = 2048;
    L29:
        $dirty = $dirty | r12;
        goto L31
    L28:
        r12 = 1024;
    L31:
        if (($changed & 24576) != 0) goto L38;
        if ($composer2.changedInstance(r36) == false) goto L35;
        int r13 = 16384;
    L36:
        $dirty = $dirty | r13;
        goto L38
    L35:
        r13 = 8192;
    L38:
        if ((196608 & $changed) == 0) goto L40;
    L44:
        int $dirty2 = $dirty;
        if ((74899 & $dirty2) == 74898) goto L47;
        boolean r8 = true;
    L49:
        if ($composer2.shouldExecute(r8, $dirty2 & 1) == true) goto L51;
        $composer2.skipToGroupEnd();
    L100:
        ScopeUpdateScope r14 = $composer2.endRestartGroup();
        if (r14 == null) goto L104;
        r14.updateScope(new C04564($this$SwitchImpl, checked, enabled, colors, r36, interactionSource, $changed));
        return;
    L104:
        return;
    L51:
        if (ComposerKt.isTraceInProgress() == false) goto L53;
        ComposerKt.traceEventStart(70908914, $dirty2, -1, "androidx.compose.material.SwitchImpl (Switch.kt:220)");
    L53:
        ComposerKt.sourceInformationMarkerStart($composer2, 463289608, "CC(remember):Switch.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L57;
        Object value$iv = SnapshotStateKt.mutableStateListOf();
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L57:
        SnapshotStateList interactions = (SnapshotStateList) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 463292928, "CC(remember):Switch.kt#9igjgp");
        if ((458752 & $dirty2) != 131072) goto L60;
        boolean invalid$iv = true;
    L61:
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv == false) goto L64;
    L67:
        Object value$iv2 = (Function2) new SwitchKt$SwitchImpl$1$1(interactionSource, interactions, null);
        $composer2.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L68:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.LaunchedEffect(interactionSource, (Function2) it$iv2, $composer2, ($dirty2 >> 15) & 14);
        boolean hasInteraction = !interactions.isEmpty();
        if (hasInteraction == false) goto L71;
        float r15 = ThumbPressedElevation;
    L72:
        float elevation = r15;
        final State<Color> r16 = colors.trackColor(enabled, checked, $composer2, ((($dirty2 >> 6) & 14) | ($dirty2 & 112)) | (($dirty2 >> 3) & 896));
        Modifier r17 = SizeKt.fillMaxSize$default($this$SwitchImpl.align(Modifier.Companion, Alignment.Companion.getCenter()), 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart($composer2, 463322123, "CC(remember):Switch.kt#9igjgp");
        boolean invalid$iv2 = $composer2.changed(r16);
        Object it$iv3 = $composer2.rememberedValue();
        if (invalid$iv2 == true) goto L79;
        if (it$iv3 == Composer.Companion.getEmpty()) goto L79;
    L80:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        CanvasKt.Canvas(r17, (Function1) it$iv3, $composer2, 0);
        State<Color> r18 = colors.thumbColor(enabled, checked, $composer2, ((($dirty2 >> 6) & 14) | ($dirty2 & 112)) | (($dirty2 >> 3) & 896));
        ProvidableCompositionLocal<ElevationOverlay> r19 = ElevationOverlayKt.getLocalElevationOverlay();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r110 = $composer2.consume(r19);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ElevationOverlay elevationOverlay = (ElevationOverlay) r110;
        ProvidableCompositionLocal<Dp> r111 = ElevationOverlayKt.getLocalAbsoluteElevation();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r0 = $composer2.consume(r111);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        float arg0$iv = ((Dp) r0).m6987unboximpl();
        float absoluteElevation = Dp.m6973constructorimpl(arg0$iv + elevation);
        if (Color.m4367equalsimpl0(SwitchImpl$lambda$17(r18), MaterialTheme.INSTANCE.getColors($composer2, 6).m1602getSurface0d7_KjU()) == false) goto L84;
        if (elevationOverlay == null) goto L84;
        $composer2.startReplaceGroup(1478495731);
        ComposerKt.sourceInformation($composer2, "253@10581L36");
        String r2 = "CC(remember):Switch.kt#9igjgp";
        boolean r112 = true;
        long r20 = elevationOverlay.mo1639apply7g2Lkgo(SwitchImpl$lambda$17(r18), absoluteElevation, $composer2, 0);
        $composer2.endReplaceGroup();
        long r21 = r20;
    L85:
        State<Color> r22 = SingleValueAnimationKt.m112animateColorAsStateeuL9pac(r21, null, null, null, $composer2, 0, 14);
        $composer2 = $composer2;
        Modifier r23 = $this$SwitchImpl.align(Modifier.Companion, Alignment.Companion.getCenterStart());
        ComposerKt.sourceInformationMarkerStart($composer2, 463342469, r2);
        if (($dirty2 & 57344) != 16384) goto L88;
        boolean invalid$iv3 = r112;
    L89:
        Object it$iv4 = $composer2.rememberedValue();
        if (invalid$iv3 == false) goto L92;
    L95:
        Object value$iv3 = (Function1) new SwitchKt$SwitchImpl$3$1(r36);
        $composer2.updateRememberedValue(value$iv3);
        it$iv4 = value$iv3;
    L96:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        SpacerKt.Spacer(BackgroundKt.m233backgroundbw27NRU(ShadowKt.m4001shadows4CzXII$default(SizeKt.m764requiredSize3ABfNKs(IndicationKt.indication(OffsetKt.offset(r23, (Function1) it$iv4), interactionSource, RippleKt.m1746rippleH2RKhps$default(false, ThumbRippleRadius, 0, 4, null)), ThumbDiameter), elevation, RoundedCornerShapeKt.getCircleShape(), false, 0, 0, 24, null), SwitchImpl$lambda$18(r22), RoundedCornerShapeKt.getCircleShape()), $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L100;
        ComposerKt.traceEventEnd();
        goto L100
    L92:
        if (it$iv4 != Composer.Companion.getEmpty()) goto L96;
    L88:
        invalid$iv3 = false;
    L84:
        r2 = "CC(remember):Switch.kt#9igjgp";
        r112 = true;
        $composer2.startReplaceGroup(1478584670);
        $composer2.endReplaceGroup();
        r21 = SwitchImpl$lambda$17(r18);
    L79:
        Object value$iv4 = (Function1) new SwitchKt$SwitchImpl$2$1(r16);
        $composer2.updateRememberedValue(value$iv4);
        it$iv3 = value$iv4;
        goto L80
    L71:
        r15 = ThumbDefaultElevation;
        goto L72
    L64:
        if (it$iv2 != Composer.Companion.getEmpty()) goto L68;
    L60:
        invalid$iv = false;
        goto L61
    L47:
        r8 = false;
        goto L49
    L40:
        if ($composer2.changed(interactionSource) == false) goto L42;
        int r24 = 131072;
    L43:
        $dirty = $dirty | r24;
        goto L44
    L42:
        r24 = 65536;
        goto L43
    }

    private static final long SwitchImpl$lambda$15(State<Color> r4) {
        Object thisObj$iv = r4.getValue();
        return ((Color) thisObj$iv).m4376unboximpl();
    }

    private static final long SwitchImpl$lambda$17(State<Color> r4) {
        Object thisObj$iv = r4.getValue();
        return ((Color) thisObj$iv).m4376unboximpl();
    }

    private static final long SwitchImpl$lambda$18(State<Color> r4) {
        return r4.getValue().m4376unboximpl();
    }

    /* JADX INFO: renamed from: drawTrack-RPmYEkk, reason: not valid java name */
    private static final void m1796drawTrackRPmYEkk(DrawScope $this$drawTrack_u2dRPmYEkk, long trackColor, float trackWidth, float strokeWidth) {
        float strokeRadius = strokeWidth / 2.0f;
        DrawScope.m4903drawLineNGM6Ib0$default($this$drawTrack_u2dRPmYEkk, trackColor, androidx.compose.ui.geometry.OffsetKt.Offset(strokeRadius, Offset.m4126getYimpl($this$drawTrack_u2dRPmYEkk.mo4916getCenterF1C5BW0())), androidx.compose.ui.geometry.OffsetKt.Offset(trackWidth - strokeRadius, Offset.m4126getYimpl($this$drawTrack_u2dRPmYEkk.mo4916getCenterF1C5BW0())), strokeWidth, StrokeCap.Companion.m4720getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
    }

    static {
        TrackWidth = Dp.m6973constructorimpl(34);
        TrackStrokeWidth = Dp.m6973constructorimpl(14);
        ThumbDiameter = Dp.m6973constructorimpl(20);
        ThumbRippleRadius = Dp.m6973constructorimpl(24);
        DefaultSwitchPadding = Dp.m6973constructorimpl(2);
        SwitchWidth = TrackWidth;
        SwitchHeight = ThumbDiameter;
        float arg0$iv = TrackWidth;
        float other$iv = ThumbDiameter;
        ThumbPathLength = Dp.m6973constructorimpl(arg0$iv - other$iv);
        AnimationSpec = new TweenSpec(100, 0, null, 6, null);
        ThumbDefaultElevation = Dp.m6973constructorimpl(1);
        ThumbPressedElevation = Dp.m6973constructorimpl(6);
        SwitchVelocityThreshold = Dp.m6973constructorimpl(125);
    }

    public static final float getTrackWidth() {
        return TrackWidth;
    }

    public static final float getTrackStrokeWidth() {
        return TrackStrokeWidth;
    }

    public static final float getThumbDiameter() {
        return ThumbDiameter;
    }
}
