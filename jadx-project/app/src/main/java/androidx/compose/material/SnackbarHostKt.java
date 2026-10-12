package androidx.compose.material;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.util.ListUtilsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a:\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0002\b\fH\u0003¢\u0006\u0002\u0010\r\u001a:\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\b\u001a\u00020\t2\u0019\b\u0002\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0002\b\fH\u0007¢\u0006\u0002\u0010\u0012\u001a9\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u001bH\u0003¢\u0006\u0002\u0010\u001c\u001a)\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0003¢\u0006\u0002\u0010\u001e\u001a\u001e\u0010\u001f\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010$H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000*b\b\u0002\u0010%\"-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00050\u001b¢\u0006\u0002\b\f¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0002\b\f2-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00050\u001b¢\u0006\u0002\b\f¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0002\b\f¨\u0006("}, d2 = {"SnackbarFadeInMillis", "", "SnackbarFadeOutMillis", "SnackbarInBetweenDelayMillis", "FadeInFadeOutWithScale", "", "current", "Landroidx/compose/material/SnackbarData;", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/material/SnackbarData;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "SnackbarHost", "hostState", "Landroidx/compose/material/SnackbarHostState;", "snackbar", "(Landroidx/compose/material/SnackbarHostState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "animatedOpacity", "Landroidx/compose/runtime/State;", "", "animation", "Landroidx/compose/animation/core/AnimationSpec;", "visible", "", "onAnimationFinish", "Lkotlin/Function0;", "(Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animatedScale", "(Landroidx/compose/animation/core/AnimationSpec;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "toMillis", "", "Landroidx/compose/material/SnackbarDuration;", "hasAction", "accessibilityManager", "Landroidx/compose/ui/platform/AccessibilityManager;", "FadeInFadeOutTransition", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SnackbarHostKt {
    private static final int SnackbarFadeInMillis = 150;
    private static final int SnackbarFadeOutMillis = 75;
    private static final int SnackbarInBetweenDelayMillis = 0;

    /* JADX INFO: compiled from: SnackbarHost.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[SnackbarDuration.values().length];
            r0[SnackbarDuration.Indefinite.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L14:
            r0[SnackbarDuration.Long.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L16:
            r0[SnackbarDuration.Short.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L12:
            $EnumSwitchMapping$0 = r0;
        }
    }

    public static final /* synthetic */ void access$FadeInFadeOutWithScale(SnackbarData current, Modifier modifier, Function3 content, Composer $composer, int $changed, int $default) {
        FadeInFadeOutWithScale(current, modifier, content, $composer, $changed, $default);
    }

    public static final /* synthetic */ State access$animatedOpacity(AnimationSpec animation, boolean visible, Function0 onAnimationFinish, Composer $composer, int $changed, int $default) {
        return animatedOpacity(animation, visible, onAnimationFinish, $composer, $changed, $default);
    }

    public static final /* synthetic */ State access$animatedScale(AnimationSpec animation, boolean visible, Composer $composer, int $changed) {
        return animatedScale(animation, visible, $composer, $changed);
    }

    public static final void SnackbarHost(SnackbarHostState hostState, Modifier modifier, Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> r19, Composer $composer, final int $changed, final int r22) {
        Composer $composer2 = $composer.startRestartGroup(431012348);
        ComposerKt.sourceInformation($composer2, "C(SnackbarHost)157@6681L7,158@6729L332,158@6693L368,169@7066L134:SnackbarHost.kt#jmzs0o");
        int $dirty = $changed;
        if ((r22 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        SnackbarHostState r2 = hostState;
    L13:
        int r3 = r22 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        int r6 = r22 & 4;
        if (r6 == 0) goto L28;
        $dirty = $dirty | 384;
        Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> r7 = r19;
    L35:
        int $dirty2 = $dirty;
        if (($dirty2 & 147) == 146) goto L38;
        boolean r1 = true;
    L40:
        if ($composer2.shouldExecute(r1, $dirty2 & 1) == false) goto L60;
        if (r3 == 0) goto L43;
        Modifier modifier3 = Modifier.Companion;
        int r4 = r6;
    L44:
        if (r4 == 0) goto L47;
        r7 = ComposableSingletons$SnackbarHostKt.INSTANCE.m1635getLambda1$material_release();
    L47:
        if (ComposerKt.isTraceInProgress() == false) goto L49;
        ComposerKt.traceEventStart(431012348, $dirty2, -1, "androidx.compose.material.SnackbarHost (SnackbarHost.kt:155)");
    L49:
        SnackbarData currentSnackbarData = r2.getCurrentSnackbarData();
        ProvidableCompositionLocal<AccessibilityManager> r5 = CompositionLocalsKt.getLocalAccessibilityManager();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r9 = $composer2.consume(r5);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        AccessibilityManager accessibilityManager = (AccessibilityManager) r9;
        ComposerKt.sourceInformationMarkerStart($composer2, -1079929633, "CC(remember):SnackbarHost.kt#9igjgp");
        boolean invalid$iv = $composer2.changedInstance(currentSnackbarData) | $composer2.changedInstance(accessibilityManager);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L52;
    L55:
        Object value$iv = (Function2) new SnackbarHostKt$SnackbarHost$1$1(currentSnackbarData, accessibilityManager, null);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L56:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.LaunchedEffect(currentSnackbarData, (Function2) it$iv, $composer2, 0);
        int r10 = $dirty2 & 896;
        FadeInFadeOutWithScale(r2.getCurrentSnackbarData(), modifier3, r7, $composer2, r10 | ($dirty2 & 112), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L59;
        ComposerKt.traceEventEnd();
    L59:
        modifier2 = modifier3;
        final Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> r8 = r7;
    L61:
        ScopeUpdateScope r11 = $composer2.endRestartGroup();
        if (r11 == null) goto L65;
        final SnackbarHostState r12 = r2;
        final Modifier modifier4 = modifier2;
        r11.updateScope(new AnonymousClass2(r12, modifier4, r8, $changed, r22));
        return;
    L65:
        return;
    L52:
        if (it$iv != Composer.Companion.getEmpty()) goto L56;
    L43:
        r4 = r6;
        modifier3 = modifier2;
        goto L44
    L60:
        $composer2.skipToGroupEnd();
        r8 = r7;
        goto L61
    L38:
        r1 = false;
        goto L40
    L28:
        if (($changed & 384) != 0) goto L34;
        r7 = r19;
        if ($composer2.changedInstance(r7) == false) goto L32;
        int r13 = 256;
    L33:
        $dirty = $dirty | r13;
        goto L35
    L32:
        r13 = 128;
        goto L33
    L34:
        r7 = r19;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L21;
        int r14 = 32;
    L22:
        $dirty = $dirty | r14;
        goto L24
    L21:
        r14 = 16;
        goto L22
    L23:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r2 = hostState;
        if ($composer2.changed(r2) == false) goto L10;
        int r15 = 4;
    L11:
        $dirty = $dirty | r15;
        goto L13
    L10:
        r15 = 2;
        goto L11
    L12:
        r2 = hostState;
        goto L13
    }

    public static final long toMillis(SnackbarDuration $this$toMillis, boolean hasAction, AccessibilityManager accessibilityManager) {
        switch(WhenMappings.$EnumSwitchMapping$0[$this$toMillis.ordinal()]) {
            case 1: goto L8;
            case 2: goto L7;
            case 3: goto L6;
            default: goto L5;
        };
    L6:
        long r0 = 4000;
    L9:
        long original = r0;
        if (accessibilityManager != null) goto L13;
        return original;
    L13:
        return accessibilityManager.calculateRecommendedTimeoutMillis(original, true, true, hasAction);
    L7:
        r0 = 10000;
        goto L9
    L8:
        r0 = Long.MAX_VALUE;
        goto L9
    L5:
        throw new NoWhenBranchMatchedException();
    }

    private static final void FadeInFadeOutWithScale(final SnackbarData current, Modifier modifier, final Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> r40, Composer $composer, final int $changed, final int r43) {
        Composer $composer2 = $composer.startRestartGroup(2036134589);
        ComposerKt.sourceInformation($composer2, "C(FadeInFadeOutWithScale)P(1,2)246@9390L48,247@9463L36,315@12241L162:SnackbarHost.kt#jmzs0o");
        int $dirty = $changed;
        if ((r43 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L15:
        int r3 = r43 & 2;
        if (r3 == 0) goto L19;
        $dirty = $dirty | 48;
        Modifier r4 = modifier;
    L27:
        if ((r43 & 4) == 0) goto L30;
        $dirty = $dirty | 384;
    L36:
        int $dirty2 = $dirty;
        if (($dirty2 & 147) == 146) goto L39;
        boolean r2 = true;
    L41:
        if ($composer2.shouldExecute(r2, $dirty2 & 1) == false) goto L87;
        if (r3 == 0) goto L44;
        Modifier modifier2 = Modifier.Companion;
    L46:
        if (ComposerKt.isTraceInProgress() == false) goto L48;
        ComposerKt.traceEventStart(2036134589, $dirty2, -1, "androidx.compose.material.FadeInFadeOutWithScale (SnackbarHost.kt:245)");
    L48:
        ComposerKt.sourceInformationMarkerStart($composer2, 187637513, "CC(remember):SnackbarHost.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L52;
        Object value$iv = new FadeInFadeOutState();
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L52:
        final FadeInFadeOutState state = (FadeInFadeOutState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final String a11yPaneTitle = Strings_androidKt.m1781getString4foXLRw(Strings.Companion.m1780getSnackbarPaneTitleUdPEhr4(), $composer2, 6);
        if (Intrinsics.areEqual(current, state.getCurrent()) == true) goto L64;
        $composer2.startReplaceGroup(1522020731);
        ComposerKt.sourceInformation($composer2, "*256@9850L2370");
        state.setCurrent(current);
        List $this$fastMap$iv = state.getItems();
        List target$iv = new ArrayList($this$fastMap$iv.size());
        int r13 = $this$fastMap$iv.size();
        int index$iv$iv = 0;
    L55:
        if (index$iv$iv >= r13) goto L57;
        Object item$iv$iv = $this$fastMap$iv.get(index$iv$iv);
        FadeInFadeOutAnimationItem it = (FadeInFadeOutAnimationItem) item$iv$iv;
        target$iv.add((SnackbarData) it.getKey());
        index$iv$iv = index$iv$iv + 1;
        goto L55
    L57:
        final List keys = CollectionsKt.toMutableList(target$iv);
        if (keys.contains(current) == true) goto L60;
        keys.add(current);
    L60:
        state.getItems().clear();
        List $this$fastMapTo$iv = ListUtilsKt.fastFilterNotNull(keys);
        Collection destination$iv = state.getItems();
        int index$iv$iv2 = 0;
        int r5 = $this$fastMapTo$iv.size();
    L61:
        if (index$iv$iv2 >= r5) goto L63;
        Object item$iv$iv2 = $this$fastMapTo$iv.get(index$iv$iv2);
        final SnackbarData key = (SnackbarData) item$iv$iv2;
        int index$iv$iv3 = r5;
        destination$iv.add(new FadeInFadeOutAnimationItem(key, ComposableLambdaKt.rememberComposableLambda(1471040642, true, new SnackbarHostKt$FadeInFadeOutWithScale$1$1(key, current, keys, state, a11yPaneTitle), $composer2, 54)));
        index$iv$iv2 = index$iv$iv2 + 1;
        r5 = index$iv$iv3;
        keys = keys;
        a11yPaneTitle = a11yPaneTitle;
        goto L61
    L63:
        List r0 = (List) destination$iv;
        $composer2.endReplaceGroup();
    L65:
        int $changed$iv = ($dirty2 >> 3) & 14;
        Modifier modifier$iv = modifier2;
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        boolean propagateMinConstraints$iv = false;
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv = ($changed$iv << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r16 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L68;
        ComposablesKt.invalidApplier();
    L68:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L71;
        Function0<ComposeUiNode> r1 = r16;
        $composer2.createNode(r1);
    L72:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r6 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L79;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L79;
    L80:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r7 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r8 = BoxScopeInstance.INSTANCE;
        int r9 = (($changed$iv >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, 10320967, "C316@12279L21:SnackbarHost.kt#jmzs0o");
        state.setScope(ComposablesKt.getCurrentRecomposeScope($composer2, 0));
        $composer2.startReplaceGroup(1801449988);
        ComposerKt.sourceInformation($composer2, "");
        List $this$fastForEach$iv = state.getItems();
        int $i$f$fastForEach = $this$fastForEach$iv.size();
        int $changed2 = 0;
    L81:
        if ($changed2 >= $i$f$fastForEach) goto L83;
        Object item$iv = $this$fastForEach$iv.get($changed2);
        FadeInFadeOutAnimationItem r32 = (FadeInFadeOutAnimationItem) item$iv;
        List $this$fastForEach$iv2 = $this$fastForEach$iv;
        final SnackbarData item = (SnackbarData) r32.component1();
        int r34 = $i$f$fastForEach;
        Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> r10 = r32.component2();
        int index$iv = $changed2;
        $composer2.startMovableGroup(2123994112, item);
        ComposerKt.sourceInformation($composer2, "317@12374L19,317@12366L27");
        r10.invoke(ComposableLambdaKt.rememberComposableLambda(2041982076, true, new SnackbarHostKt$FadeInFadeOutWithScale$2$1$1(r40, item), $composer2, 54), $composer2, 6);
        $composer2.endMovableGroup();
        $changed2 = index$iv + 1;
        propagateMinConstraints$iv = propagateMinConstraints$iv;
        $i$f$fastForEach = r34;
        $this$fastForEach$iv = $this$fastForEach$iv2;
        state = state;
        goto L81
    L83:
        $composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L86;
        ComposerKt.traceEventEnd();
    L86:
        final Modifier modifier3 = modifier2;
    L88:
        ScopeUpdateScope r11 = $composer2.endRestartGroup();
        if (r11 == null) goto L95;
        r11.updateScope(new AnonymousClass3(current, modifier3, r40, $changed, r43));
        return;
    L95:
        return;
    L79:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r6);
        goto L80
    L71:
        r1 = r16;
        $composer2.useNode();
        goto L72
    L64:
        $composer2.startReplaceGroup(1524617353);
        $composer2.endReplaceGroup();
        goto L65
    L44:
        modifier2 = r4;
        goto L46
    L87:
        $composer2.skipToGroupEnd();
        modifier3 = r4;
        goto L88
    L39:
        r2 = false;
        goto L41
    L30:
        if (($changed & 384) != 0) goto L36;
        if ($composer2.changedInstance(r40) == false) goto L34;
        int r12 = 256;
    L35:
        $dirty = $dirty | r12;
        goto L36
    L34:
        r12 = 128;
        goto L35
    L19:
        if (($changed & 48) != 0) goto L25;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L23;
        int r14 = 32;
    L24:
        $dirty = $dirty | r14;
        goto L27
    L23:
        r14 = 16;
        goto L24
    L25:
        r4 = modifier;
        goto L27
    L6:
        if (($changed & 6) != 0) goto L15;
        if (($changed & 8) != 0) goto L10;
        boolean r15 = $composer2.changed(current);
    L11:
        if (r15 == false) goto L13;
        int r17 = 4;
    L14:
        $dirty = $dirty | r17;
        goto L15
    L13:
        r17 = 2;
        goto L14
    L10:
        r15 = $composer2.changedInstance(current);
        goto L11
    }

    private static final State<Float> animatedOpacity(AnimationSpec<Float> r15, boolean visible, Function0<Unit> r17, Composer $composer, int $changed, int r20) {
        ComposerKt.sourceInformationMarkerStart($composer, 1016418159, "C(animatedOpacity)P(!1,2)341@13051L49,342@13129L111,342@13105L135:SnackbarHost.kt#jmzs0o");
        if ((r20 & 4) == 0) goto L5;
        Function0<Unit> r4 = AnonymousClass1.INSTANCE;
    L7:
        if (ComposerKt.isTraceInProgress() == false) goto L9;
        ComposerKt.traceEventStart(1016418159, $changed, -1, "androidx.compose.material.animatedOpacity (SnackbarHost.kt:340)");
    L9:
        ComposerKt.sourceInformationMarkerStart($composer, -1211548813, "CC(remember):SnackbarHost.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv == Composer.Companion.getEmpty()) goto L12;
    L17:
        Animatable alpha = (Animatable) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        Boolean r8 = Boolean.valueOf(visible);
        ComposerKt.sourceInformationMarkerStart($composer, -1211546255, "CC(remember):SnackbarHost.kt#9igjgp");
        boolean r1 = $composer.changedInstance(alpha);
        boolean r5 = false;
        if ((($changed & 112) ^ 48) <= 32) goto L22;
        if ($composer.changed(visible) == false) goto L22;
    L23:
        boolean r3 = true;
    L25:
        boolean r2 = (r1 | r3) | $composer.changedInstance(r15);
        if ((($changed & 896) ^ 384) <= 256) goto L30;
        if ($composer.changed(r4) == false) goto L30;
    L31:
        r5 = true;
    L32:
        boolean invalid$iv = r2 | r5;
        Object it$iv2 = $composer.rememberedValue();
        if (invalid$iv == false) goto L35;
    L38:
        Animatable alpha2 = alpha;
        Object value$iv = (Function2) new SnackbarHostKt$animatedOpacity$2$1(alpha2, visible, r15, r4, null);
        $composer.updateRememberedValue(value$iv);
        it$iv2 = value$iv;
    L39:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.LaunchedEffect(r8, (Function2) it$iv2, $composer, ($changed >> 3) & 14);
        State<Float> r0 = alpha2.asState();
        if (ComposerKt.isTraceInProgress() == false) goto L42;
        ComposerKt.traceEventEnd();
    L42:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    L35:
        if (it$iv2 == Composer.Companion.getEmpty()) goto L38;
        alpha2 = alpha;
    L30:
        if (($changed & 384) != 256) goto L32;
    L22:
        if (($changed & 48) == 32) goto L23;
        r3 = false;
        goto L25
    L12:
        if (visible == true) goto L14;
        float r12 = 1.0f;
    L15:
        Object value$iv2 = AnimatableKt.Animatable$default(r12, 0.0f, 2, null);
        $composer.updateRememberedValue(value$iv2);
        it$iv = value$iv2;
        goto L17
    L14:
        r12 = 0.0f;
        goto L15
    L5:
        r4 = r17;
        goto L7
    }

    private static final State<Float> animatedScale(AnimationSpec<Float> r11, boolean visible, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 2003504988, "C(animatedScale)351@13392L51,352@13472L85,352@13448L109:SnackbarHost.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(2003504988, $changed, -1, "androidx.compose.material.animatedScale (SnackbarHost.kt:350)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, 245423444, "CC(remember):SnackbarHost.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv == Composer.Companion.getEmpty()) goto L8;
    L13:
        Animatable scale = (Animatable) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        Boolean r2 = Boolean.valueOf(visible);
        ComposerKt.sourceInformationMarkerStart($composer, 245426038, "CC(remember):SnackbarHost.kt#9igjgp");
        boolean r1 = $composer.changedInstance(scale);
        if ((($changed & 112) ^ 48) <= 32) goto L18;
        if ($composer.changed(visible) == false) goto L18;
    L19:
        boolean r3 = true;
    L21:
        boolean invalid$iv = (r1 | r3) | $composer.changedInstance(r11);
        Object it$iv2 = $composer.rememberedValue();
        if (invalid$iv == false) goto L24;
    L27:
        Object value$iv = (Function2) new SnackbarHostKt$animatedScale$1$1(scale, visible, r11, null);
        $composer.updateRememberedValue(value$iv);
        it$iv2 = value$iv;
    L28:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.LaunchedEffect(r2, (Function2) it$iv2, $composer, ($changed >> 3) & 14);
        State<Float> r4 = scale.asState();
        if (ComposerKt.isTraceInProgress() == false) goto L31;
        ComposerKt.traceEventEnd();
    L31:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r4;
    L24:
        if (it$iv2 != Composer.Companion.getEmpty()) goto L28;
    L18:
        if (($changed & 48) == 32) goto L19;
        r3 = false;
        goto L21
    L8:
        if (visible == true) goto L10;
        float r8 = 1.0f;
    L11:
        Object value$iv2 = AnimatableKt.Animatable$default(r8, 0.0f, 2, null);
        $composer.updateRememberedValue(value$iv2);
        it$iv = value$iv2;
        goto L13
    L10:
        r8 = 0.8f;
        goto L11
    }
}
