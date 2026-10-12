package androidx.compose.material3;

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
@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a:\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0002\b\fH\u0003¢\u0006\u0002\u0010\r\u001a:\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\b\u001a\u00020\t2\u0019\b\u0002\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0002\b\fH\u0007¢\u0006\u0002\u0010\u0012\u001a9\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u001bH\u0003¢\u0006\u0002\u0010\u001c\u001a)\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0003¢\u0006\u0002\u0010\u001e\u001a\u001e\u0010\u001f\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010$H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000*b\b\u0002\u0010%\"-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00050\u001b¢\u0006\u0002\b\f¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0002\b\f2-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00050\u001b¢\u0006\u0002\b\f¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0002\b\f¨\u0006("}, d2 = {"SnackbarFadeInMillis", "", "SnackbarFadeOutMillis", "SnackbarInBetweenDelayMillis", "FadeInFadeOutWithScale", "", "current", "Landroidx/compose/material3/SnackbarData;", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/material3/SnackbarData;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "SnackbarHost", "hostState", "Landroidx/compose/material3/SnackbarHostState;", "snackbar", "(Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "animatedOpacity", "Landroidx/compose/runtime/State;", "", "animation", "Landroidx/compose/animation/core/AnimationSpec;", "visible", "", "onAnimationFinish", "Lkotlin/Function0;", "(Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animatedScale", "(Landroidx/compose/animation/core/AnimationSpec;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "toMillis", "", "Landroidx/compose/material3/SnackbarDuration;", "hasAction", "accessibilityManager", "Landroidx/compose/ui/platform/AccessibilityManager;", "FadeInFadeOutTransition", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SnackbarHostKt {
    private static final int SnackbarFadeInMillis = 150;
    private static final int SnackbarFadeOutMillis = 75;
    private static final int SnackbarInBetweenDelayMillis = 0;

    /* JADX INFO: compiled from: SnackbarHost.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
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

    public static final void SnackbarHost(SnackbarHostState hostState, Modifier modifier, Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> r18, Composer $composer, final int $changed, final int r21) {
        Composer $composer2 = $composer.startRestartGroup(464178177);
        ComposerKt.sourceInformation($composer2, "C(SnackbarHost)223@9468L7,224@9516L348,224@9480L384,235@9869L134:SnackbarHost.kt#uh7d8r");
        int $dirty = $changed;
        if ((r21 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        SnackbarHostState r2 = hostState;
    L13:
        int r3 = r21 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        int r6 = r21 & 4;
        if (r6 == 0) goto L28;
        $dirty = $dirty | 384;
        Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> r7 = r18;
    L35:
        int $dirty2 = $dirty;
        if (($dirty2 & 147) == 146) goto L38;
    L41:
        if (r3 == 0) goto L43;
        Modifier.Companion modifier3 = Modifier.Companion;
    L44:
        if (r6 == 0) goto L47;
        r7 = ComposableSingletons$SnackbarHostKt.INSTANCE.m2108getLambda1$material3_release();
    L47:
        if (ComposerKt.isTraceInProgress() == false) goto L49;
        ComposerKt.traceEventStart(464178177, $dirty2, -1, "androidx.compose.material3.SnackbarHost (SnackbarHost.kt:221)");
    L49:
        SnackbarData currentSnackbarData = r2.getCurrentSnackbarData();
        ProvidableCompositionLocal<AccessibilityManager> r4 = CompositionLocalsKt.getLocalAccessibilityManager();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r9 = $composer2.consume(r4);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        AccessibilityManager accessibilityManager = (AccessibilityManager) r9;
        ComposerKt.sourceInformationMarkerStart($composer2, -487334772, "CC(remember):SnackbarHost.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(currentSnackbarData) | $composer2.changedInstance(accessibilityManager);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L52;
    L55:
        SnackbarHostKt$SnackbarHost$1$1 value$iv = new SnackbarHostKt$SnackbarHost$1$1(currentSnackbarData, accessibilityManager, null);
        $composer2.updateRememberedValue(value$iv);
    L56:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.LaunchedEffect(currentSnackbarData, (Function2) value$iv, $composer2, 0);
        int r10 = $dirty2 & 896;
        int r11 = r10 | ($dirty2 & 112);
        Modifier modifier4 = modifier3;
        FadeInFadeOutWithScale(r2.getCurrentSnackbarData(), modifier4, r7, $composer2, r11, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L59;
        ComposerKt.traceEventEnd();
    L59:
        modifier2 = modifier4;
        final Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> r5 = r7;
    L60:
        ScopeUpdateScope r8 = $composer2.endRestartGroup();
        if (r8 == null) goto L64;
        final SnackbarHostState r1 = r2;
        final Modifier modifier5 = modifier2;
        r8.updateScope(new AnonymousClass2(r1, modifier5, r5, $changed, r21));
        return;
    L64:
        return;
    L52:
        if (it$iv == Composer.Companion.getEmpty()) goto L55;
        value$iv = it$iv;
        goto L56
    L43:
        modifier3 = modifier2;
        goto L44
    L38:
        if ($composer2.getSkipping() == false) goto L41;
        $composer2.skipToGroupEnd();
        r5 = r7;
        goto L60
    L28:
        if (($changed & 384) != 0) goto L34;
        r7 = r18;
        if ($composer2.changedInstance(r7) == false) goto L32;
        int r12 = 256;
    L33:
        $dirty = $dirty | r12;
        goto L35
    L32:
        r12 = 128;
        goto L33
    L34:
        r7 = r18;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L21;
        int r13 = 32;
    L22:
        $dirty = $dirty | r13;
        goto L24
    L21:
        r13 = 16;
        goto L22
    L23:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r2 = hostState;
        if ($composer2.changed(r2) == false) goto L10;
        int r14 = 4;
    L11:
        $dirty = $dirty | r14;
        goto L13
    L10:
        r14 = 2;
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

    private static final void FadeInFadeOutWithScale(final SnackbarData current, Modifier modifier, final Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> r38, Composer $composer, final int $changed, final int r41) {
        final SnackbarData r1 = current;
        final Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> r3 = r38;
        Composer $composer2 = $composer.startRestartGroup(-1316639904);
        ComposerKt.sourceInformation($composer2, "C(FadeInFadeOutWithScale)P(1,2)328@12730L48,393@15387L162:SnackbarHost.kt#uh7d8r");
        int $dirty = $changed;
        if ((r41 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r5 = r41 & 2;
        if (r5 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier r7 = modifier;
    L24:
        if ((r41 & 4) == 0) goto L27;
        $dirty = $dirty | 384;
    L33:
        int $dirty2 = $dirty;
        if (($dirty2 & 147) == 146) goto L36;
    L39:
        if (r5 == 0) goto L41;
        Modifier.Companion modifier2 = Modifier.Companion;
    L43:
        if (ComposerKt.isTraceInProgress() == false) goto L45;
        ComposerKt.traceEventStart(-1316639904, $dirty2, -1, "androidx.compose.material3.FadeInFadeOutWithScale (SnackbarHost.kt:327)");
    L45:
        ComposerKt.sourceInformationMarkerStart($composer2, -1256815738, "CC(remember):SnackbarHost.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L48;
        Object value$iv = new FadeInFadeOutState();
        $composer2.updateRememberedValue(value$iv);
    L49:
        final FadeInFadeOutState state = (FadeInFadeOutState) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.startReplaceGroup(-1256811491);
        ComposerKt.sourceInformation($composer2, "*337@13129L2237");
        if (Intrinsics.areEqual(r1, state.getCurrent()) == true) goto L61;
        state.setCurrent(r1);
        List $this$fastMap$iv = state.getItems();
        List target$iv = new ArrayList($this$fastMap$iv.size());
        int index$iv$iv = 0;
        int r15 = $this$fastMap$iv.size();
    L52:
        if (index$iv$iv >= r15) goto L54;
        Object item$iv$iv = $this$fastMap$iv.get(index$iv$iv);
        FadeInFadeOutAnimationItem it = (FadeInFadeOutAnimationItem) item$iv$iv;
        target$iv.add((SnackbarData) it.getKey());
        index$iv$iv = index$iv$iv + 1;
        goto L52
    L54:
        final List keys = CollectionsKt.toMutableList(target$iv);
        if (keys.contains(r1) == true) goto L57;
        keys.add(r1);
    L57:
        state.getItems().clear();
        List $this$fastMapTo$iv = ListUtilsKt.fastFilterNotNull(keys);
        Collection destination$iv = state.getItems();
        int $i$f$fastMapTo = 0;
        int index$iv$iv2 = 0;
        int r14 = $this$fastMapTo$iv.size();
    L58:
        if (index$iv$iv2 >= r14) goto L60;
        Object item$iv$iv2 = $this$fastMapTo$iv.get(index$iv$iv2);
        final SnackbarData key = (SnackbarData) item$iv$iv2;
        destination$iv.add(new FadeInFadeOutAnimationItem(key, ComposableLambdaKt.rememberComposableLambda(-1654683077, true, new SnackbarHostKt$FadeInFadeOutWithScale$1$1(key, r1, keys, state), $composer2, 54)));
        index$iv$iv2 = index$iv$iv2 + 1;
        r1 = current;
        $this$fastMapTo$iv = $this$fastMapTo$iv;
        $dirty2 = $dirty2;
        keys = keys;
        $i$f$fastMapTo = $i$f$fastMapTo;
        goto L58
    L60:
        int $dirty3 = $dirty2;
        List r2 = (List) destination$iv;
    L62:
        $composer2.endReplaceGroup();
        int $changed$iv = ($dirty3 >> 3) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv = ($changed$iv << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier2);
        Function0<ComposeUiNode> r16 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        Modifier modifier3 = modifier2;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L65;
        ComposablesKt.invalidApplier();
    L65:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L68;
        $composer2.createNode(r16);
    L69:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L76;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L76;
    L77:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r6 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r8 = BoxScopeInstance.INSTANCE;
        int $changed2 = (($changed$iv >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -1643979990, "C394@15425L21:SnackbarHost.kt#uh7d8r");
        state.setScope(ComposablesKt.getCurrentRecomposeScope($composer2, 0));
        $composer2.startReplaceGroup(1748085441);
        ComposerKt.sourceInformation($composer2, "");
        List $this$fastForEach$iv = state.getItems();
        int r0 = $this$fastForEach$iv.size();
        int $i$f$fastForEach = 0;
    L78:
        if ($i$f$fastForEach >= r0) goto L80;
        Object item$iv = $this$fastForEach$iv.get($i$f$fastForEach);
        FadeInFadeOutAnimationItem r31 = (FadeInFadeOutAnimationItem) item$iv;
        int r34 = r0;
        final SnackbarData item = (SnackbarData) r31.component1();
        List $this$fastForEach$iv2 = $this$fastForEach$iv;
        Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> r9 = r31.component2();
        int index$iv = $i$f$fastForEach;
        $composer2.startMovableGroup(1201076541, item);
        ComposerKt.sourceInformation($composer2, "395@15520L19,395@15512L27");
        r9.invoke(ComposableLambdaKt.rememberComposableLambda(-1135367807, true, new SnackbarHostKt$FadeInFadeOutWithScale$2$1$1(r3, item), $composer2, 54), $composer2, 6);
        $composer2.endMovableGroup();
        $i$f$fastForEach = index$iv + 1;
        $changed2 = $changed2;
        r3 = r38;
        $this$fastForEach$iv = $this$fastForEach$iv2;
        r0 = r34;
        goto L78
    L80:
        $composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L83;
        ComposerKt.traceEventEnd();
    L83:
        final Modifier modifier4 = modifier3;
    L84:
        ScopeUpdateScope r10 = $composer2.endRestartGroup();
        if (r10 == null) goto L91;
        r10.updateScope(new AnonymousClass3(current, modifier4, r38, $changed, r41));
        return;
    L91:
        return;
    L76:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r4);
        goto L77
    L68:
        $composer2.useNode();
        goto L69
    L61:
        $dirty3 = $dirty2;
        goto L62
    L48:
        value$iv = it$iv;
        goto L49
    L41:
        modifier2 = r7;
        goto L43
    L36:
        if ($composer2.getSkipping() == false) goto L39;
        $composer2.skipToGroupEnd();
        modifier4 = r7;
        goto L84
    L27:
        if (($changed & 384) != 0) goto L33;
        if ($composer2.changedInstance(r3) == false) goto L31;
        int r11 = 256;
    L32:
        $dirty = $dirty | r11;
        goto L33
    L31:
        r11 = 128;
        goto L32
    L16:
        if (($changed & 48) != 0) goto L22;
        r7 = modifier;
        if ($composer2.changed(r7) == false) goto L20;
        int r12 = 32;
    L21:
        $dirty = $dirty | r12;
        goto L24
    L20:
        r12 = 16;
        goto L21
    L22:
        r7 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(r1) == false) goto L10;
        int r13 = 4;
    L11:
        $dirty = $dirty | r13;
        goto L12
    L10:
        r13 = 2;
        goto L11
    }

    private static final State<Float> animatedOpacity(AnimationSpec<Float> r15, boolean visible, Function0<Unit> r17, Composer $composer, int $changed, int r20) {
        ComposerKt.sourceInformationMarkerStart($composer, 1431889134, "C(animatedOpacity)P(!1,2)419@16197L49,420@16275L111,420@16251L135:SnackbarHost.kt#uh7d8r");
        if ((r20 & 4) == 0) goto L5;
        Function0<Unit> r4 = AnonymousClass1.INSTANCE;
    L7:
        if (ComposerKt.isTraceInProgress() == false) goto L9;
        ComposerKt.traceEventStart(1431889134, $changed, -1, "androidx.compose.material3.animatedOpacity (SnackbarHost.kt:418)");
    L9:
        ComposerKt.sourceInformationMarkerStart($composer, 2104079446, "CC(remember):SnackbarHost.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv == Composer.Companion.getEmpty()) goto L12;
        Object value$iv = it$iv;
    L17:
        Animatable alpha = (Animatable) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        Boolean r8 = Boolean.valueOf(visible);
        ComposerKt.sourceInformationMarkerStart($composer, 2104082004, "CC(remember):SnackbarHost.kt#9igjgp");
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
        SnackbarHostKt$animatedOpacity$2$1 value$iv2 = new SnackbarHostKt$animatedOpacity$2$1(alpha2, visible, r15, r4, null);
        $composer.updateRememberedValue(value$iv2);
    L39:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.LaunchedEffect(r8, (Function2) value$iv2, $composer, ($changed >> 3) & 14);
        State<Float> r0 = alpha2.asState();
        if (ComposerKt.isTraceInProgress() == false) goto L42;
        ComposerKt.traceEventEnd();
    L42:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    L35:
        if (it$iv2 == Composer.Companion.getEmpty()) goto L38;
        alpha2 = alpha;
        value$iv2 = it$iv2;
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
        value$iv = AnimatableKt.Animatable$default(r12, 0.0f, 2, null);
        $composer.updateRememberedValue(value$iv);
        goto L17
    L14:
        r12 = 0.0f;
        goto L15
    L5:
        r4 = r17;
        goto L7
    }

    private static final State<Float> animatedScale(AnimationSpec<Float> r11, boolean visible, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1966809761, "C(animatedScale)429@16538L51,430@16618L85,430@16594L109:SnackbarHost.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1966809761, $changed, -1, "androidx.compose.material3.animatedScale (SnackbarHost.kt:428)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, 1433330423, "CC(remember):SnackbarHost.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv == Composer.Companion.getEmpty()) goto L8;
        Object value$iv = it$iv;
    L13:
        Animatable scale = (Animatable) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        Boolean r2 = Boolean.valueOf(visible);
        ComposerKt.sourceInformationMarkerStart($composer, 1433333017, "CC(remember):SnackbarHost.kt#9igjgp");
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
        SnackbarHostKt$animatedScale$1$1 value$iv2 = new SnackbarHostKt$animatedScale$1$1(scale, visible, r11, null);
        $composer.updateRememberedValue(value$iv2);
    L28:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.LaunchedEffect(r2, (Function2) value$iv2, $composer, ($changed >> 3) & 14);
        State<Float> r4 = scale.asState();
        if (ComposerKt.isTraceInProgress() == false) goto L31;
        ComposerKt.traceEventEnd();
    L31:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r4;
    L24:
        if (it$iv2 == Composer.Companion.getEmpty()) goto L27;
        value$iv2 = it$iv2;
    L18:
        if (($changed & 48) == 32) goto L19;
        r3 = false;
        goto L21
    L8:
        if (visible == true) goto L10;
        float r8 = 1.0f;
    L11:
        value$iv = AnimatableKt.Animatable$default(r8, 0.0f, 2, null);
        $composer.updateRememberedValue(value$iv);
        goto L13
    L10:
        r8 = 0.8f;
        goto L11
    }
}
