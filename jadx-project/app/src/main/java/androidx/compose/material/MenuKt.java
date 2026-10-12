package androidx.compose.material;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntRect;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Menu.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\u001aY\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\u001c\u0010\u001b\u001a\u0018\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00100\u001c¢\u0006\u0002\b\u001e¢\u0006\u0002\b\u001fH\u0001¢\u0006\u0002\u0010 \u001ac\u0010!\u001a\u00020\u00102\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100#2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010$\u001a\u00020\u00132\b\b\u0002\u0010%\u001a\u00020&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\u001c\u0010\u001b\u001a\u0018\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00100\u001c¢\u0006\u0002\b\u001e¢\u0006\u0002\b\u001fH\u0001¢\u0006\u0002\u0010*\u001a\u001d\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-H\u0000¢\u0006\u0002\u0010/\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0016\u0010\u0006\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0002\u001a\u0004\b\u0007\u0010\b\"\u000e\u0010\t\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000\"\u0010\u0010\u000b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0016\u0010\f\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0002\u001a\u0004\b\r\u0010\b\"\u000e\u0010\u000e\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000¨\u00060²\u0006\n\u00101\u001a\u000202X\u008a\u0084\u0002²\u0006\n\u00103\u001a\u000202X\u008a\u0084\u0002"}, d2 = {"DropdownMenuItemDefaultMaxWidth", "Landroidx/compose/ui/unit/Dp;", "F", "DropdownMenuItemDefaultMinHeight", "DropdownMenuItemDefaultMinWidth", "DropdownMenuItemHorizontalPadding", "DropdownMenuVerticalPadding", "getDropdownMenuVerticalPadding", "()F", "InTransitionDuration", "", "MenuElevation", "MenuVerticalMargin", "getMenuVerticalMargin", "OutTransitionDuration", "DropdownMenuContent", "", "expandedStates", "Landroidx/compose/animation/core/MutableTransitionState;", "", "transformOriginState", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/graphics/TransformOrigin;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/ScrollState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DropdownMenuItemContent", "onClick", "Lkotlin/Function0;", "enabled", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Landroidx/compose/foundation/layout/RowScope;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "calculateTransformOrigin", "parentBounds", "Landroidx/compose/ui/unit/IntRect;", "menuBounds", "(Landroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/unit/IntRect;)J", "material_release", "scale", "", "alpha"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class MenuKt {
    private static final float DropdownMenuItemDefaultMaxWidth = 0.0f;
    private static final float DropdownMenuItemDefaultMinHeight = 0.0f;
    private static final float DropdownMenuItemDefaultMinWidth = 0.0f;
    private static final float DropdownMenuItemHorizontalPadding = 0.0f;
    private static final float DropdownMenuVerticalPadding = 0.0f;
    public static final int InTransitionDuration = 120;
    private static final float MenuElevation = 0.0f;
    private static final float MenuVerticalMargin = 0.0f;
    public static final int OutTransitionDuration = 75;

    public static final /* synthetic */ float access$DropdownMenuContent$lambda$1(State $scale$delegate) {
        return DropdownMenuContent$lambda$1($scale$delegate);
    }

    public static final /* synthetic */ float access$DropdownMenuContent$lambda$3(State $alpha$delegate) {
        return DropdownMenuContent$lambda$3($alpha$delegate);
    }

    public static final /* synthetic */ float access$getDropdownMenuItemHorizontalPadding$p() {
        return DropdownMenuItemHorizontalPadding;
    }

    public static final void DropdownMenuContent(final MutableTransitionState<Boolean> r29, final MutableState<TransformOrigin> r30, final ScrollState scrollState, Modifier modifier, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r33, Composer $composer, final int $changed, final int r36) {
        Composer $composer2 = $composer.startRestartGroup(435109845);
        ComposerKt.sourceInformation($composer2, "C(DropdownMenuContent)P(1,4,3,2)158@7480L50,161@7568L622,182@8228L549,203@8842L173,210@9057L276,201@8782L551:Menu.kt#jmzs0o");
        int $dirty = $changed;
        if ((r36 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L16:
        if ((r36 & 2) == 0) goto L19;
        $dirty = $dirty | 48;
    L26:
        if ((r36 & 4) == 0) goto L29;
        $dirty = $dirty | 384;
    L35:
        int r7 = r36 & 8;
        if (r7 == 0) goto L39;
        $dirty = $dirty | 3072;
        Modifier modifier2 = modifier;
    L47:
        if ((r36 & 16) == 0) goto L50;
        $dirty = $dirty | 24576;
    L57:
        if (($dirty & 9363) == 9362) goto L59;
        boolean r9 = true;
    L61:
        if ($composer2.shouldExecute(r9, $dirty & 1) == false) goto L121;
        if (r7 == 0) goto L65;
        modifier2 = Modifier.Companion;
    L65:
        if (ComposerKt.isTraceInProgress() == false) goto L67;
        ComposerKt.traceEventStart(435109845, $dirty, -1, "androidx.compose.material.DropdownMenuContent (Menu.kt:156)");
    L67:
        Transition transition = TransitionKt.rememberTransition(r29, "DropDownMenu", $composer2, (MutableTransitionState.$stable | 48) | ($dirty & 14), 0);
        Function3 transitionSpec$iv = MenuKt$DropdownMenuContent$scale$2.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, -1338768149, "CC(animateFloat)P(2)1968@80576L78:Transition.kt#pdpnli");
        TwoWayConverter<Float, AnimationVector1D> r14 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        int $changed$iv$iv = (((0 & 14) | ((0 << 3) & 896)) | ((0 << 3) & 7168)) | ((0 << 3) & 57344);
        ComposerKt.sourceInformationMarkerStart($composer2, -142660079, "CC(animateValue)P(3,2)1885@77139L32,1886@77194L31,1887@77250L23,1889@77286L89:Transition.kt#pdpnli");
        int $changed2 = ($changed$iv$iv >> 9) & 112;
        boolean it = ((Boolean) transition.getCurrentState()).booleanValue();
        $composer2.startReplaceGroup(1652594929);
        ComposerKt.sourceInformation($composer2, "C:Menu.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L71;
        ComposerKt.traceEventStart(1652594929, $changed2, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:172)");
    L71:
        if (it == false) goto L73;
        float r1 = 1.0f;
    L75:
        if (ComposerKt.isTraceInProgress() == false) goto L77;
        ComposerKt.traceEventEnd();
    L77:
        $composer2.endReplaceGroup();
        Object initialValue$iv$iv = Float.valueOf(r1);
        int $changed3 = ($changed$iv$iv >> 9) & 112;
        boolean it2 = ((Boolean) transition.getTargetState()).booleanValue();
        $composer2.startReplaceGroup(1652594929);
        ComposerKt.sourceInformation($composer2, "C:Menu.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L80;
        byte r4 = -1;
        ComposerKt.traceEventStart(1652594929, $changed3, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:172)");
    L81:
        if (it2 == false) goto L83;
        float r0 = 1.0f;
    L85:
        if (ComposerKt.isTraceInProgress() == false) goto L87;
        ComposerKt.traceEventEnd();
    L87:
        $composer2.endReplaceGroup();
        Object targetValue$iv$iv = Float.valueOf(r0);
        final Modifier modifier3 = modifier2;
        final State scale$delegate = TransitionKt.createTransitionAnimation(transition, initialValue$iv$iv, targetValue$iv$iv, transitionSpec$iv.invoke(transition.getSegment(), $composer2, Integer.valueOf(($changed$iv$iv >> 3) & 112)), r14, "FloatAnimation", $composer2, (($changed$iv$iv & 14) | (($changed$iv$iv << 9) & 57344)) | (($changed$iv$iv << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Function3 transitionSpec$iv2 = MenuKt$DropdownMenuContent$alpha$2.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, -1338768149, "CC(animateFloat)P(2)1968@80576L78:Transition.kt#pdpnli");
        TwoWayConverter<Float, AnimationVector1D> r11 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        int $changed$iv$iv2 = (((0 & 14) | ((0 << 3) & 896)) | ((0 << 3) & 7168)) | ((0 << 3) & 57344);
        ComposerKt.sourceInformationMarkerStart($composer2, -142660079, "CC(animateValue)P(3,2)1885@77139L32,1886@77194L31,1887@77250L23,1889@77286L89:Transition.kt#pdpnli");
        int $changed4 = ($changed$iv$iv2 >> 9) & 112;
        boolean it3 = ((Boolean) transition.getCurrentState()).booleanValue();
        $composer2.startReplaceGroup(388050693);
        ComposerKt.sourceInformation($composer2, "C:Menu.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L91;
        ComposerKt.traceEventStart(388050693, $changed4, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:193)");
    L91:
        if (it3 == false) goto L93;
        float r6 = 1.0f;
    L95:
        if (ComposerKt.isTraceInProgress() == false) goto L97;
        ComposerKt.traceEventEnd();
    L97:
        $composer2.endReplaceGroup();
        Object initialValue$iv$iv2 = Float.valueOf(r6);
        int $changed5 = ($changed$iv$iv2 >> 9) & 112;
        boolean it4 = ((Boolean) transition.getTargetState()).booleanValue();
        $composer2.startReplaceGroup(388050693);
        ComposerKt.sourceInformation($composer2, "C:Menu.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L101;
        ComposerKt.traceEventStart(388050693, $changed5, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:193)");
    L101:
        if (it4 == false) goto L103;
        float r2 = 1.0f;
    L105:
        if (ComposerKt.isTraceInProgress() == false) goto L107;
        ComposerKt.traceEventEnd();
    L107:
        $composer2.endReplaceGroup();
        Object targetValue$iv$iv2 = Float.valueOf(r2);
        final State alpha$delegate = TransitionKt.createTransitionAnimation(transition, initialValue$iv$iv2, targetValue$iv$iv2, transitionSpec$iv2.invoke(transition.getSegment(), $composer2, Integer.valueOf(($changed$iv$iv2 >> 3) & 112)), r11, "FloatAnimation", $composer2, (458752 & ($changed$iv$iv2 << 6)) | (($changed$iv$iv2 & 14) | (($changed$iv$iv2 << 9) & 57344)));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier.Companion r3 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart($composer2, 668377296, "CC(remember):Menu.kt#9igjgp");
        boolean r8 = $composer2.changed(scale$delegate) | $composer2.changed(alpha$delegate);
        if (($dirty & 112) != 32) goto L110;
        boolean r12 = true;
    L111:
        boolean invalid$iv = r8 | r12;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L114;
    L117:
        Object value$iv = (Function1) new MenuKt$DropdownMenuContent$1$1(r30, scale$delegate, alpha$delegate);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L118:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        CardKt.m1574CardFjzlyU(GraphicsLayerModifierKt.graphicsLayer(r3, (Function1) it$iv), null, 0, 0, null, MenuElevation, ComposableLambdaKt.rememberComposableLambda(895555282, true, new AnonymousClass2(modifier3, scrollState, r33), $composer2, 54), $composer2, 1769472, 30);
        $composer2 = $composer2;
        if (ComposerKt.isTraceInProgress() == false) goto L122;
        ComposerKt.traceEventEnd();
    L122:
        ScopeUpdateScope r10 = $composer2.endRestartGroup();
        if (r10 == null) goto L126;
        r10.updateScope(new AnonymousClass3(r29, r30, scrollState, modifier3, r33, $changed, r36));
        return;
    L126:
        return;
    L114:
        if (it$iv != Composer.Companion.getEmpty()) goto L118;
    L110:
        r12 = false;
        goto L111
    L103:
        r2 = 0.0f;
        goto L105
    L93:
        r6 = 0.0f;
        goto L95
    L83:
        r0 = 0.8f;
        goto L85
    L80:
        r4 = -1;
        goto L81
    L73:
        r1 = 0.8f;
        goto L75
    L121:
        $composer2.skipToGroupEnd();
        modifier3 = modifier2;
        goto L122
    L59:
        r9 = false;
        goto L61
    L50:
        if (($changed & 24576) != 0) goto L57;
        if ($composer2.changedInstance(r33) == false) goto L54;
        int r13 = 16384;
    L55:
        $dirty = $dirty | r13;
        goto L57
    L54:
        r13 = 8192;
        goto L55
    L39:
        if (($changed & 3072) != 0) goto L45;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L43;
        int r15 = 2048;
    L44:
        $dirty = $dirty | r15;
        goto L47
    L43:
        r15 = 1024;
        goto L44
    L45:
        modifier2 = modifier;
        goto L47
    L29:
        if (($changed & 384) != 0) goto L35;
        if ($composer2.changed(scrollState) == false) goto L33;
        int r16 = 256;
    L34:
        $dirty = $dirty | r16;
        goto L35
    L33:
        r16 = 128;
        goto L34
    L19:
        if (($changed & 48) != 0) goto L26;
        if ($composer2.changed(r30) == false) goto L23;
        int r17 = 32;
    L24:
        $dirty = $dirty | r17;
        goto L26
    L23:
        r17 = 16;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L16;
        if (($changed & 8) != 0) goto L10;
        boolean r18 = $composer2.changed(r29);
    L11:
        if (r18 == false) goto L13;
        int r19 = 4;
    L14:
        $dirty = $dirty | r19;
        goto L16
    L13:
        r19 = 2;
        goto L14
    L10:
        r18 = $composer2.changedInstance(r29);
        goto L11
    }

    private static final float DropdownMenuContent$lambda$1(State<Float> r4) {
        return r4.getValue().floatValue();
    }

    private static final float DropdownMenuContent$lambda$3(State<Float> r4) {
        return r4.getValue().floatValue();
    }

    public static final void DropdownMenuItemContent(final Function0<Unit> r32, Modifier modifier, boolean enabled, PaddingValues contentPadding, MutableInteractionSource interactionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r37, Composer $composer, final int $changed, final int r40) {
        Composer $composer2 = $composer.startRestartGroup(87134531);
        ComposerKt.sourceInformation($composer2, "C(DropdownMenuItemContent)P(5,4,2,1,3)232@9745L1028:Menu.kt#jmzs0o");
        int $dirty = $changed;
        if ((r40 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function0<Unit> r2 = r32;
    L13:
        int r3 = r40 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier r4 = modifier;
    L24:
        int r5 = r40 & 4;
        if (r5 == 0) goto L28;
        $dirty = $dirty | 384;
        boolean r8 = enabled;
    L35:
        int r10 = r40 & 8;
        if (r10 == 0) goto L39;
        $dirty = $dirty | 3072;
        PaddingValues r11 = contentPadding;
    L46:
        int r12 = r40 & 16;
        if (r12 == 0) goto L50;
        $dirty = $dirty | 24576;
    L58:
        if ((r40 & 32) == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L68:
        if ((74899 & $dirty) == 74898) goto L70;
        boolean r14 = true;
    L72:
        if ($composer2.shouldExecute(r14, $dirty & 1) == false) goto L107;
        if (r3 == 0) goto L75;
        Modifier modifier2 = Modifier.Companion;
        int r6 = r10;
    L76:
        if (r5 == 0) goto L78;
        final boolean enabled2 = true;
    L79:
        if (r6 == 0) goto L81;
        PaddingValues contentPadding2 = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
    L82:
        if (r12 == 0) goto L84;
        MutableInteractionSource interactionSource2 = null;
    L86:
        if (ComposerKt.isTraceInProgress() == false) goto L88;
        ComposerKt.traceEventStart(87134531, $dirty, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:230)");
    L88:
        Modifier modifier$iv = PaddingKt.padding(SizeKt.m776sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m266clickableO2vRcR0$default(modifier2, interactionSource2, RippleKt.m1746rippleH2RKhps$default(true, 0.0f, 0, 6, null), enabled2, null, null, r2, 24, null), 0.0f, 1, null), DropdownMenuItemDefaultMinWidth, DropdownMenuItemDefaultMinHeight, DropdownMenuItemDefaultMaxWidth, 0.0f, 8, null), contentPadding2);
        Alignment.Vertical verticalAlignment$iv = Alignment.Companion.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
        MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
        int $changed$iv$iv = (384 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r19 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        PaddingValues contentPadding3 = contentPadding2;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L91;
        ComposablesKt.invalidApplier();
    L91:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L94;
        Function0<ComposeUiNode> r7 = r19;
        $composer2.createNode(r7);
    L95:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r9 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L102;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L102;
    L103:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r1 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
        int r13 = ((384 >> 6) & 112) | 6;
        final RowScope $this$DropdownMenuItemContent_u24lambda_u245 = RowScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, 1779474203, "C251@10517L10,252@10575L192,252@10536L231:Menu.kt#jmzs0o");
        Typography typography = MaterialTheme.INSTANCE.getTypography($composer2, 6);
        TextKt.ProvideTextStyle(typography.getSubtitle1(), ComposableLambdaKt.rememberComposableLambda(1190489496, true, new MenuKt$DropdownMenuItemContent$1$1(enabled2, r37, $this$DropdownMenuItemContent_u24lambda_u245), $composer2, 54), $composer2, 48);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L106;
        ComposerKt.traceEventEnd();
    L106:
        final PaddingValues contentPadding4 = contentPadding3;
        final Modifier modifier3 = modifier2;
        final MutableInteractionSource interactionSource3 = interactionSource2;
        final boolean enabled3 = enabled2;
    L108:
        ScopeUpdateScope r15 = $composer2.endRestartGroup();
        if (r15 == null) goto L112;
        r15.updateScope(new C04332(r32, modifier3, enabled3, contentPadding4, interactionSource3, r37, $changed, r40));
        return;
    L112:
        return;
    L102:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r9);
        goto L103
    L94:
        r7 = r19;
        $composer2.useNode();
        goto L95
    L84:
        interactionSource2 = interactionSource;
        goto L86
    L81:
        contentPadding2 = r11;
        goto L82
    L78:
        enabled2 = r8;
        goto L79
    L75:
        r6 = r10;
        modifier2 = r4;
        goto L76
    L107:
        $composer2.skipToGroupEnd();
        interactionSource3 = interactionSource;
        modifier3 = r4;
        enabled3 = r8;
        contentPadding4 = r11;
        goto L108
    L70:
        r14 = false;
        goto L72
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L68;
        if ($composer2.changedInstance(r37) == false) goto L65;
        int r16 = 131072;
    L66:
        $dirty = $dirty | r16;
        goto L68
    L65:
        r16 = 65536;
        goto L66
    L50:
        if (($changed & 24576) != 0) goto L58;
        if ($composer2.changed(interactionSource) == false) goto L54;
        int r17 = 16384;
    L55:
        $dirty = $dirty | r17;
        goto L58
    L54:
        r17 = 8192;
        goto L55
    L39:
        if (($changed & 3072) != 0) goto L45;
        r11 = contentPadding;
        if ($composer2.changed(r11) == false) goto L43;
        int r18 = 2048;
    L44:
        $dirty = $dirty | r18;
        goto L46
    L43:
        r18 = 1024;
        goto L44
    L45:
        r11 = contentPadding;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r8 = enabled;
        if ($composer2.changed(r8) == false) goto L32;
        int r110 = 256;
    L33:
        $dirty = $dirty | r110;
        goto L35
    L32:
        r110 = 128;
        goto L33
    L34:
        r8 = enabled;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L21;
        int r20 = 32;
    L22:
        $dirty = $dirty | r20;
        goto L24
    L21:
        r20 = 16;
        goto L22
    L23:
        r4 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r2 = r32;
        if ($composer2.changedInstance(r2) == false) goto L10;
        int r21 = 4;
    L11:
        $dirty = $dirty | r21;
        goto L13
    L10:
        r21 = 2;
        goto L11
    L12:
        r2 = r32;
        goto L13
    }

    static {
        MenuElevation = Dp.m6973constructorimpl(8);
        MenuVerticalMargin = Dp.m6973constructorimpl(48);
        DropdownMenuItemHorizontalPadding = Dp.m6973constructorimpl(16);
        DropdownMenuVerticalPadding = Dp.m6973constructorimpl(8);
        DropdownMenuItemDefaultMinWidth = Dp.m6973constructorimpl(112);
        DropdownMenuItemDefaultMaxWidth = Dp.m6973constructorimpl(280);
        DropdownMenuItemDefaultMinHeight = Dp.m6973constructorimpl(48);
    }

    public static final float getMenuVerticalMargin() {
        return MenuVerticalMargin;
    }

    public static final float getDropdownMenuVerticalPadding() {
        return DropdownMenuVerticalPadding;
    }

    public static final long calculateTransformOrigin(IntRect parentBounds, IntRect menuBounds) {
        float pivotY = 1.0f;
        if (menuBounds.getLeft() < parentBounds.getRight()) goto L6;
        float pivotX = 0.0f;
    L13:
        if (menuBounds.getTop() < parentBounds.getBottom()) goto L16;
        pivotY = 0.0f;
    L23:
        return TransformOriginKt.TransformOrigin(pivotX, pivotY);
    L16:
        if (menuBounds.getBottom() <= parentBounds.getTop()) goto L23;
        if (menuBounds.getHeight() != 0) goto L21;
        pivotY = 0.0f;
        goto L23
    L21:
        int intersectionCenter = (Math.max(parentBounds.getTop(), menuBounds.getTop()) + Math.min(parentBounds.getBottom(), menuBounds.getBottom())) / 2;
        pivotY = (intersectionCenter - menuBounds.getTop()) / menuBounds.getHeight();
        goto L23
    L6:
        if (menuBounds.getRight() > parentBounds.getLeft()) goto L9;
        pivotX = 1.0f;
        goto L13
    L9:
        if (menuBounds.getWidth() != 0) goto L11;
        pivotX = 0.0f;
        goto L13
    L11:
        int intersectionCenter2 = (Math.max(parentBounds.getLeft(), menuBounds.getLeft()) + Math.min(parentBounds.getRight(), menuBounds.getRight())) / 2;
        pivotX = (intersectionCenter2 - menuBounds.getLeft()) / menuBounds.getWidth();
        goto L13
    }
}
