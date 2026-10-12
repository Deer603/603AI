package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.BasicTooltipDefaults;
import androidx.compose.material3.internal.BasicTooltip_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: Tooltip.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\u001al\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u001c\u0010$\u001a\u0018\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020!0%¢\u0006\u0002\b'¢\u0006\u0002\b(2\u0006\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u00020.2\u0011\u00100\u001a\r\u0012\u0004\u0012\u00020!01¢\u0006\u0002\b'H\u0007¢\u0006\u0002\u00102\u001a&\u00103\u001a\u00020*2\b\b\u0002\u00104\u001a\u00020.2\b\b\u0002\u00105\u001a\u00020.2\b\b\u0002\u00106\u001a\u000207H\u0007\u001a+\u00108\u001a\u00020*2\b\b\u0002\u00104\u001a\u00020.2\b\b\u0002\u00105\u001a\u00020.2\b\b\u0002\u00106\u001a\u000207H\u0007¢\u0006\u0002\u00109\u001a\u001a\u0010:\u001a\u00020,*\u00020,2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020.0<H\u0000\u001a\u001c\u0010=\u001a\u00020,*\u00020,2\u0006\u0010>\u001a\u00020.2\u0006\u0010?\u001a\u00020.H\u0001\"\u0016\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0005\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0006\u0010\u0003\"\u0010\u0010\u0007\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0016\u0010\b\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\t\u0010\u0003\"\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\"\u0010\u0010\u000e\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0016\u0010\u000f\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0010\u0010\u0003\"\u0010\u0010\u0011\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0016\u0010\u0012\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0013\u0010\u0003\"\u0016\u0010\u0014\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0015\u0010\u0003\"\u0016\u0010\u0016\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0017\u0010\u0003\"\u0010\u0010\u0018\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u000e\u0010\u0019\u001a\u00020\u001aX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u001aX\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u001c\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u001d\u0010\u0003\"\u0016\u0010\u001e\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u001f\u0010\u0003¨\u0006@²\u0006\n\u0010A\u001a\u00020BX\u008a\u0084\u0002²\u0006\n\u0010C\u001a\u00020BX\u008a\u0084\u0002"}, d2 = {"ActionLabelBottomPadding", "Landroidx/compose/ui/unit/Dp;", "getActionLabelBottomPadding", "()F", "F", "ActionLabelMinHeight", "getActionLabelMinHeight", "HeightFromSubheadToTextFirstLine", "HeightToSubheadFirstLine", "getHeightToSubheadFirstLine", "PlainTooltipContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getPlainTooltipContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "PlainTooltipHorizontalPadding", "PlainTooltipMaxWidth", "getPlainTooltipMaxWidth", "PlainTooltipVerticalPadding", "RichTooltipHorizontalPadding", "getRichTooltipHorizontalPadding", "RichTooltipMaxWidth", "getRichTooltipMaxWidth", "SpacingBetweenTooltipAndAnchor", "getSpacingBetweenTooltipAndAnchor", "TextBottomPadding", "TooltipFadeInDuration", "", "TooltipFadeOutDuration", "TooltipMinHeight", "getTooltipMinHeight", "TooltipMinWidth", "getTooltipMinWidth", "TooltipBox", "", "positionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "tooltip", "Lkotlin/Function1;", "Landroidx/compose/material3/TooltipScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "state", "Landroidx/compose/material3/TooltipState;", "modifier", "Landroidx/compose/ui/Modifier;", "focusable", "", "enableUserInput", "content", "Lkotlin/Function0;", "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function3;Landroidx/compose/material3/TooltipState;Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TooltipState", "initialIsVisible", "isPersistent", "mutatorMutex", "Landroidx/compose/foundation/MutatorMutex;", "rememberTooltipState", "(ZZLandroidx/compose/foundation/MutatorMutex;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TooltipState;", "animateTooltip", "transition", "Landroidx/compose/animation/core/Transition;", "textVerticalPadding", "subheadExists", "actionExists", "material3_release", "scale", "", "alpha"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TooltipKt {
    private static final float ActionLabelBottomPadding = 0.0f;
    private static final float ActionLabelMinHeight = 0.0f;
    private static final float HeightFromSubheadToTextFirstLine = 0.0f;
    private static final float HeightToSubheadFirstLine = 0.0f;
    private static final PaddingValues PlainTooltipContentPadding = null;
    private static final float PlainTooltipHorizontalPadding = 0.0f;
    private static final float PlainTooltipMaxWidth = 0.0f;
    private static final float PlainTooltipVerticalPadding = 0.0f;
    private static final float RichTooltipHorizontalPadding = 0.0f;
    private static final float RichTooltipMaxWidth = 0.0f;
    private static final float SpacingBetweenTooltipAndAnchor = 0.0f;
    private static final float TextBottomPadding = 0.0f;
    public static final int TooltipFadeInDuration = 150;
    public static final int TooltipFadeOutDuration = 75;
    private static final float TooltipMinHeight = 0.0f;
    private static final float TooltipMinWidth = 0.0f;

    public static final void TooltipBox(final PopupPositionProvider positionProvider, final Function3<? super TooltipScope, ? super Composer, ? super Integer, Unit> r19, final TooltipState state, Modifier modifier, boolean focusable, boolean enableUserInput, final Function2<? super Composer, ? super Integer, Unit> r24, Composer $composer, final int $changed, final int r27) {
        Composer $composer2 = $composer.startRestartGroup(1836749106);
        ComposerKt.sourceInformation($composer2, "C(TooltipBox)P(4,6,5,3,2,1)133@5704L64,134@5826L33,135@5876L52,137@5979L103,143@6168L64,141@6088L310:Tooltip.kt#uh7d8r");
        int $dirty = $changed;
        if ((r27 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        PopupPositionProvider r6 = positionProvider;
    L14:
        if ((r27 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L24:
        if ((r27 & 4) == 0) goto L27;
        $dirty = $dirty | 384;
    L36:
        int r8 = r27 & 8;
        if (r8 == 0) goto L40;
        $dirty = $dirty | 3072;
        Modifier modifier2 = modifier;
    L47:
        int r11 = r27 & 16;
        if (r11 == 0) goto L51;
        $dirty = $dirty | 24576;
        boolean r12 = focusable;
    L58:
        int r13 = r27 & 32;
        if (r13 == 0) goto L62;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        boolean r14 = enableUserInput;
    L70:
        if ((r27 & 64) == 0) goto L73;
        $dirty = $dirty | 1572864;
    L79:
        int $dirty2 = $dirty;
        if ((599187 & $dirty2) == 599186) goto L82;
    L85:
        if (r8 == 0) goto L87;
        modifier2 = Modifier.Companion;
    L87:
        if (r11 == 0) goto L89;
        boolean focusable2 = true;
    L90:
        if (r13 == 0) goto L92;
        boolean enableUserInput2 = true;
    L94:
        if (ComposerKt.isTraceInProgress() == false) goto L96;
        ComposerKt.traceEventStart(1836749106, $dirty2, -1, "androidx.compose.material3.TooltipBox (Tooltip.kt:131)");
    L96:
        final Transition transition = TransitionKt.updateTransition(state.getTransition(), "tooltip transition", $composer2, MutableTransitionState.$stable | 48, 0);
        ComposerKt.sourceInformationMarkerStart($composer2, -1495108980, "CC(remember):Tooltip.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L99;
        Object value$iv = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        $composer2.updateRememberedValue(value$iv);
    L100:
        final MutableState anchorBounds = (MutableState) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -1495107361, "CC(remember):Tooltip.kt#9igjgp");
        Object it$iv2 = $composer2.rememberedValue();
        if (it$iv2 != Composer.Companion.getEmpty()) goto L103;
        Object value$iv2 = new TooltipScopeImpl(new TooltipKt$TooltipBox$scope$1$1(anchorBounds));
        $composer2.updateRememberedValue(value$iv2);
    L104:
        final TooltipScopeImpl scope = (TooltipScopeImpl) value$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Function2 wrappedContent = ComposableLambdaKt.rememberComposableLambda(-1130808188, true, new TooltipKt$TooltipBox$wrappedContent$1(anchorBounds, r24), $composer2, 54);
        int r15 = (458752 & $dirty2) | ((((($dirty2 & 14) | 1572912) | ($dirty2 & 896)) | ($dirty2 & 7168)) | (57344 & $dirty2));
        Modifier modifier3 = modifier2;
        BasicTooltip_androidKt.BasicTooltipBox(r6, ComposableLambdaKt.rememberComposableLambda(-149611544, true, new AnonymousClass1(transition, r19, scope), $composer2, 54), state, modifier3, focusable2, enableUserInput2, wrappedContent, $composer2, r15, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L107;
        ComposerKt.traceEventEnd();
    L107:
        final Modifier modifier4 = modifier3;
        final boolean focusable3 = focusable2;
        final boolean enableUserInput3 = enableUserInput2;
    L108:
        ScopeUpdateScope r16 = $composer2.endRestartGroup();
        if (r16 == null) goto L112;
        r16.updateScope(new AnonymousClass2(positionProvider, r19, state, modifier4, focusable3, enableUserInput3, r24, $changed, r27));
        return;
    L112:
        return;
    L103:
        value$iv2 = it$iv2;
        goto L104
    L99:
        value$iv = it$iv;
        goto L100
    L92:
        enableUserInput2 = r14;
        goto L94
    L89:
        focusable2 = r12;
        goto L90
    L82:
        if ($composer2.getSkipping() == false) goto L85;
        $composer2.skipToGroupEnd();
        modifier4 = modifier2;
        focusable3 = r12;
        enableUserInput3 = r14;
        goto L108
    L73:
        if (($changed & 1572864) != 0) goto L79;
        if ($composer2.changedInstance(r24) == false) goto L77;
        int r17 = 1048576;
    L78:
        $dirty = $dirty | r17;
        goto L79
    L77:
        r17 = 524288;
        goto L78
    L62:
        if ((196608 & $changed) != 0) goto L68;
        r14 = enableUserInput;
        if ($composer2.changed(r14) == false) goto L66;
        int r18 = 131072;
    L67:
        $dirty = $dirty | r18;
        goto L70
    L66:
        r18 = 65536;
        goto L67
    L68:
        r14 = enableUserInput;
        goto L70
    L51:
        if (($changed & 24576) != 0) goto L57;
        r12 = focusable;
        if ($composer2.changed(r12) == false) goto L55;
        int r110 = 16384;
    L56:
        $dirty = $dirty | r110;
        goto L58
    L55:
        r110 = 8192;
        goto L56
    L57:
        r12 = focusable;
        goto L58
    L40:
        if (($changed & 3072) != 0) goto L46;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L44;
        int r111 = 2048;
    L45:
        $dirty = $dirty | r111;
        goto L47
    L44:
        r111 = 1024;
        goto L45
    L46:
        modifier2 = modifier;
        goto L47
    L27:
        if (($changed & 384) != 0) goto L36;
        if (($changed & 512) != 0) goto L31;
        boolean r9 = $composer2.changed(state);
    L32:
        if (r9 == false) goto L34;
        int r10 = 256;
    L35:
        $dirty = $dirty | r10;
        goto L36
    L34:
        r10 = 128;
        goto L35
    L31:
        r9 = $composer2.changedInstance(state);
        goto L32
    L17:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changedInstance(r19) == false) goto L21;
        int r20 = 32;
    L22:
        $dirty = $dirty | r20;
        goto L24
    L21:
        r20 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L12;
        r6 = positionProvider;
        if ($composer2.changed(r6) == false) goto L10;
        int r21 = 4;
    L11:
        $dirty = $dirty | r21;
        goto L14
    L10:
        r21 = 2;
        goto L11
    L12:
        r6 = positionProvider;
        goto L14
    }

    public static final TooltipState rememberTooltipState(boolean initialIsVisible, boolean isPersistent, MutatorMutex mutatorMutex, Composer $composer, int $changed, int r11) {
        ComposerKt.sourceInformationMarkerStart($composer, -1413230530, "C(rememberTooltipState)436@18949L210:Tooltip.kt#uh7d8r");
        if ((r11 & 1) == 0) goto L6;
        initialIsVisible = false;
    L6:
        if ((r11 & 2) == 0) goto L9;
        isPersistent = false;
    L9:
        if ((r11 & 4) == 0) goto L12;
        mutatorMutex = BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
    L12:
        if (ComposerKt.isTraceInProgress() == false) goto L14;
        ComposerKt.traceEventStart(-1413230530, $changed, -1, "androidx.compose.material3.rememberTooltipState (Tooltip.kt:436)");
    L14:
        ComposerKt.sourceInformationMarkerStart($composer, -1281295952, "CC(remember):Tooltip.kt#9igjgp");
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
        Object value$iv = new TooltipStateImpl(initialIsVisible, isPersistent, mutatorMutex);
        $composer.updateRememberedValue(value$iv);
    L36:
        TooltipStateImpl r5 = (TooltipStateImpl) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L39;
        ComposerKt.traceEventEnd();
    L39:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r5;
    L32:
        if (it$iv == Composer.Companion.getEmpty()) goto L35;
        value$iv = it$iv;
    L27:
        if (($changed & 384) != 256) goto L29;
    L19:
        if (($changed & 48) == 32) goto L20;
        r12 = false;
        goto L23
    }

    public static /* synthetic */ TooltipState TooltipState$default(boolean r0, boolean r1, MutatorMutex r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r0 = false;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r1 = true;
    L9:
        if ((r3 & 4) == 0) goto L12;
        r2 = BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
    L12:
        return TooltipState(r0, r1, r2);
    }

    public static final TooltipState TooltipState(boolean initialIsVisible, boolean isPersistent, MutatorMutex mutatorMutex) {
        return new TooltipStateImpl(initialIsVisible, isPersistent, mutatorMutex);
    }

    public static final Modifier textVerticalPadding(Modifier $this$textVerticalPadding, boolean subheadExists, boolean actionExists) {
        if (subheadExists == true) goto L7;
        if (actionExists == true) goto L7;
        return PaddingKt.m727paddingVpY3zN4$default($this$textVerticalPadding, 0.0f, PlainTooltipVerticalPadding, 1, null);
    L7:
        return PaddingKt.m729paddingqDBjuR0$default(AlignmentLineKt.m581paddingFromBaselineVpY3zN4$default($this$textVerticalPadding, HeightFromSubheadToTextFirstLine, 0.0f, 2, null), 0.0f, 0.0f, 0.0f, TextBottomPadding, 7, null);
    }

    public static final Modifier animateTooltip(Modifier $this$animateTooltip, final Transition<Boolean> r3) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r1 = new TooltipKt$animateTooltip$$inlined$debugInspectorInfo$1(r3);
    L7:
        return ComposedModifierKt.composed($this$animateTooltip, r1, new C05892(r3));
    L5:
        r1 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    static {
        SpacingBetweenTooltipAndAnchor = Dp.m6973constructorimpl(4);
        TooltipMinHeight = Dp.m6973constructorimpl(24);
        TooltipMinWidth = Dp.m6973constructorimpl(40);
        PlainTooltipMaxWidth = Dp.m6973constructorimpl(ComposerKt.invocationKey);
        PlainTooltipVerticalPadding = Dp.m6973constructorimpl(4);
        PlainTooltipHorizontalPadding = Dp.m6973constructorimpl(8);
        PlainTooltipContentPadding = PaddingKt.m719PaddingValuesYgX7TsA(PlainTooltipHorizontalPadding, PlainTooltipVerticalPadding);
        RichTooltipMaxWidth = Dp.m6973constructorimpl(320);
        RichTooltipHorizontalPadding = Dp.m6973constructorimpl(16);
        HeightToSubheadFirstLine = Dp.m6973constructorimpl(28);
        HeightFromSubheadToTextFirstLine = Dp.m6973constructorimpl(24);
        TextBottomPadding = Dp.m6973constructorimpl(16);
        ActionLabelMinHeight = Dp.m6973constructorimpl(36);
        ActionLabelBottomPadding = Dp.m6973constructorimpl(8);
    }

    public static final float getSpacingBetweenTooltipAndAnchor() {
        return SpacingBetweenTooltipAndAnchor;
    }

    public static final float getTooltipMinHeight() {
        return TooltipMinHeight;
    }

    public static final float getTooltipMinWidth() {
        return TooltipMinWidth;
    }

    public static final float getPlainTooltipMaxWidth() {
        return PlainTooltipMaxWidth;
    }

    public static final PaddingValues getPlainTooltipContentPadding() {
        return PlainTooltipContentPadding;
    }

    public static final float getRichTooltipMaxWidth() {
        return RichTooltipMaxWidth;
    }

    public static final float getRichTooltipHorizontalPadding() {
        return RichTooltipHorizontalPadding;
    }

    public static final float getHeightToSubheadFirstLine() {
        return HeightToSubheadFirstLine;
    }

    public static final float getActionLabelMinHeight() {
        return ActionLabelMinHeight;
    }

    public static final float getActionLabelBottomPadding() {
        return ActionLabelBottomPadding;
    }
}
