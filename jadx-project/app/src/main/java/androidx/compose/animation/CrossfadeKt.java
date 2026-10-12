package androidx.compose.animation;

import androidx.autofill.HintConstants;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Crossfade.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001aN\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\f\u001aX\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\u000f\u001a\u0086\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072%\b\u0002\u0010\u0011\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00140\n2&\u0010\t\u001a\"\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\u0015¨\u0006\u0016²\u0006\u0010\u0010\u0017\u001a\u00020\b\"\u0004\b\u0000\u0010\u0002X\u008a\u0084\u0002"}, d2 = {"Crossfade", "", "T", "targetState", "modifier", "Landroidx/compose/ui/Modifier;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "content", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "label", "", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/animation/core/Transition;", "contentKey", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "animation_release", "alpha"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CrossfadeKt {
    public static final <T> void Crossfade(final T r17, Modifier modifier, FiniteAnimationSpec<Float> r19, String label, final Function3<? super T, ? super Composer, ? super Integer, Unit> r21, Composer $composer, final int $changed, final int r24) {
        Composer $composer2 = $composer.startRestartGroup(-310686752);
        ComposerKt.sourceInformation($composer2, "C(Crossfade)P(4,3!1,2)56@2426L36,57@2478L53:Crossfade.kt#xbi5r1");
        int $dirty = $changed;
        if ((r24 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L15:
        int r3 = r24 & 2;
        if (r3 == 0) goto L19;
        $dirty = $dirty | 48;
        Modifier r4 = modifier;
    L26:
        int r5 = r24 & 4;
        if (r5 == 0) goto L30;
        $dirty = $dirty | 384;
        FiniteAnimationSpec<Float> r7 = r19;
    L37:
        int r8 = r24 & 8;
        if (r8 == 0) goto L41;
        $dirty = $dirty | 3072;
    L49:
        if ((r24 & 16) == 0) goto L52;
        $dirty = $dirty | 24576;
        Function3<? super T, ? super Composer, ? super Integer, Unit> r11 = r21;
    L59:
        int $dirty2 = $dirty;
        if (($dirty2 & 9363) == 9362) goto L62;
        boolean r2 = true;
    L64:
        if ($composer2.shouldExecute(r2, $dirty2 & 1) == false) goto L81;
        if (r3 == 0) goto L67;
        Modifier modifier2 = Modifier.Companion;
        int r6 = r8;
    L68:
        if (r5 == 0) goto L70;
        FiniteAnimationSpec<Float> r9 = AnimationSpecKt.tween$default(0, 0, null, 7, null);
    L71:
        if (r6 == 0) goto L73;
        String label2 = "Crossfade";
    L75:
        if (ComposerKt.isTraceInProgress() == false) goto L77;
        ComposerKt.traceEventStart(-310686752, $dirty2, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
    L77:
        Transition transition = androidx.compose.animation.core.TransitionKt.updateTransition(r17, label2, $composer2, (($dirty2 & 8) | ($dirty2 & 14)) | (($dirty2 >> 6) & 112), 0);
        Crossfade(transition, modifier2, r9, null, r11, $composer2, (($dirty2 & 112) | ($dirty2 & 896)) | (57344 & $dirty2), 4);
        if (ComposerKt.isTraceInProgress() == false) goto L80;
        ComposerKt.traceEventEnd();
    L80:
        final String label3 = label2;
        final Modifier modifier3 = modifier2;
        final FiniteAnimationSpec<Float> r10 = r9;
    L82:
        ScopeUpdateScope r12 = $composer2.endRestartGroup();
        if (r12 == null) goto L86;
        r12.updateScope(new AnonymousClass1(r17, modifier3, r10, label3, r21, $changed, r24));
        return;
    L86:
        return;
    L73:
        label2 = label;
        goto L75
    L70:
        r9 = r7;
        goto L71
    L67:
        r6 = r8;
        modifier2 = r4;
        goto L68
    L81:
        $composer2.skipToGroupEnd();
        modifier3 = r4;
        r10 = r7;
        label3 = label;
        goto L82
    L62:
        r2 = false;
        goto L64
    L52:
        if (($changed & 24576) != 0) goto L58;
        r11 = r21;
        if ($composer2.changedInstance(r11) == false) goto L56;
        int r13 = 16384;
    L57:
        $dirty = $dirty | r13;
        goto L59
    L56:
        r13 = 8192;
        goto L57
    L58:
        r11 = r21;
        goto L59
    L41:
        if (($changed & 3072) != 0) goto L49;
        if ($composer2.changed(label) == false) goto L45;
        int r14 = 2048;
    L46:
        $dirty = $dirty | r14;
        goto L49
    L45:
        r14 = 1024;
        goto L46
    L30:
        if (($changed & 384) != 0) goto L36;
        r7 = r19;
        if ($composer2.changedInstance(r7) == false) goto L34;
        int r15 = 256;
    L35:
        $dirty = $dirty | r15;
        goto L37
    L34:
        r15 = 128;
        goto L35
    L36:
        r7 = r19;
        goto L37
    L19:
        if (($changed & 48) != 0) goto L25;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L23;
        int r16 = 32;
    L24:
        $dirty = $dirty | r16;
        goto L26
    L23:
        r16 = 16;
        goto L24
    L25:
        r4 = modifier;
        goto L26
    L6:
        if (($changed & 6) != 0) goto L15;
        if (($changed & 8) != 0) goto L10;
        boolean r18 = $composer2.changed(r17);
    L11:
        if (r18 == false) goto L13;
        int r20 = 4;
    L14:
        $dirty = $dirty | r20;
        goto L15
    L13:
        r20 = 2;
        goto L14
    L10:
        r18 = $composer2.changedInstance(r17);
        goto L11
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Crossfade API now has a new label parameter added.")
    public static final /* synthetic */ void Crossfade(final Object targetState, Modifier modifier, FiniteAnimationSpec animationSpec, final Function3 content, Composer $composer, final int $changed, final int r22) {
        Composer $composer2 = $composer.startRestartGroup(523603005);
        ComposerKt.sourceInformation($composer2, "C(Crossfade)P(3,2)69@2886L29,70@2931L53:Crossfade.kt#xbi5r1");
        int $dirty = $changed;
        if ((r22 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L15:
        int r3 = r22 & 2;
        if (r3 == 0) goto L19;
        $dirty = $dirty | 48;
        Modifier r6 = modifier;
    L26:
        int r7 = r22 & 4;
        if (r7 == 0) goto L30;
        $dirty = $dirty | 384;
        FiniteAnimationSpec animationSpec2 = animationSpec;
    L38:
        if ((r22 & 8) == 0) goto L41;
        $dirty = $dirty | 3072;
        Function3 r10 = content;
    L48:
        int $dirty2 = $dirty;
        if (($dirty2 & 1171) == 1170) goto L51;
        boolean r2 = true;
    L53:
        if ($composer2.shouldExecute(r2, $dirty2 & 1) == false) goto L67;
        if (r3 == 0) goto L56;
        Modifier modifier2 = Modifier.Companion;
        int r4 = r7;
    L58:
        if (r4 == 0) goto L61;
        animationSpec2 = AnimationSpecKt.tween$default(0, 0, null, 7, null);
    L61:
        if (ComposerKt.isTraceInProgress() == false) goto L63;
        ComposerKt.traceEventStart(523603005, $dirty2, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:68)");
    L63:
        Transition transition = androidx.compose.animation.core.TransitionKt.updateTransition(targetState, null, $composer2, ($dirty2 & 8) | ($dirty2 & 14), 2);
        Crossfade(transition, modifier2, animationSpec2, null, r10, $composer2, (($dirty2 & 112) | ($dirty2 & 896)) | (($dirty2 << 3) & 57344), 4);
        if (ComposerKt.isTraceInProgress() == false) goto L66;
        ComposerKt.traceEventEnd();
    L66:
        final Modifier modifier3 = modifier2;
        final FiniteAnimationSpec animationSpec3 = animationSpec2;
    L68:
        ScopeUpdateScope r8 = $composer2.endRestartGroup();
        if (r8 == null) goto L72;
        r8.updateScope(new AnonymousClass2(targetState, modifier3, animationSpec3, content, $changed, r22));
        return;
    L72:
        return;
    L56:
        r4 = r7;
        modifier2 = r6;
        goto L58
    L67:
        $composer2.skipToGroupEnd();
        modifier3 = r6;
        animationSpec3 = animationSpec2;
        goto L68
    L51:
        r2 = false;
        goto L53
    L41:
        if (($changed & 3072) != 0) goto L47;
        r10 = content;
        if ($composer2.changedInstance(r10) == false) goto L45;
        int r9 = 2048;
    L46:
        $dirty = $dirty | r9;
        goto L48
    L45:
        r9 = 1024;
        goto L46
    L47:
        r10 = content;
        goto L48
    L30:
        if (($changed & 384) != 0) goto L36;
        animationSpec2 = animationSpec;
        if ($composer2.changedInstance(animationSpec2) == false) goto L34;
        int r11 = 256;
    L35:
        $dirty = $dirty | r11;
        goto L38
    L34:
        r11 = 128;
        goto L35
    L36:
        animationSpec2 = animationSpec;
        goto L38
    L19:
        if (($changed & 48) != 0) goto L25;
        r6 = modifier;
        if ($composer2.changed(r6) == false) goto L23;
        int r12 = 32;
    L24:
        $dirty = $dirty | r12;
        goto L26
    L23:
        r12 = 16;
        goto L24
    L25:
        r6 = modifier;
        goto L26
    L6:
        if (($changed & 6) != 0) goto L15;
        if (($changed & 8) != 0) goto L10;
        boolean r5 = $composer2.changed(targetState);
    L11:
        if (r5 == false) goto L13;
        int r13 = 4;
    L14:
        $dirty = $dirty | r13;
        goto L15
    L13:
        r13 = 2;
        goto L14
    L10:
        r5 = $composer2.changedInstance(targetState);
        goto L11
    }

    public static final <T> void Crossfade(final Transition<T> r37, Modifier modifier, FiniteAnimationSpec<Float> r39, Function1<? super T, ? extends Object> r40, final Function3<? super T, ? super Composer, ? super Integer, Unit> r41, Composer $composer, final int $changed, final int r44) {
        final Transition<T> r1 = r37;
        Function3<? super T, ? super Composer, ? super Integer, Unit> r5 = r41;
        Composer $composer2 = $composer.startRestartGroup(679005231);
        ComposerKt.sourceInformation($composer2, "C(Crossfade)P(3!1,2)103@4689L64,104@4775L61,134@6034L111:Crossfade.kt#xbi5r1");
        int $dirty = $changed;
        if ((r44 & Integer.MIN_VALUE) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r3 = r44 & 1;
        if (r3 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier r7 = modifier;
    L23:
        int r9 = r44 & 2;
        if (r9 == 0) goto L27;
        $dirty = $dirty | 384;
        FiniteAnimationSpec<Float> r10 = r39;
    L34:
        int r11 = r44 & 4;
        if (r11 == 0) goto L38;
        $dirty = $dirty | 3072;
        Function1<? super T, ? extends Object> r12 = r40;
    L46:
        if ((r44 & 8) == 0) goto L49;
        $dirty = $dirty | 24576;
    L55:
        int $dirty2 = $dirty;
        if (($dirty2 & 9363) == 9362) goto L58;
        boolean r2 = true;
    L60:
        if ($composer2.shouldExecute(r2, $dirty2 & 1) == false) goto L147;
        if (r3 == 0) goto L63;
        Modifier.Companion modifier2 = Modifier.Companion;
    L64:
        if (r9 == 0) goto L66;
        r10 = AnimationSpecKt.tween$default(0, 0, null, 7, null);
    L66:
        if (r11 == 0) goto L69;
        r12 = AnonymousClass3.INSTANCE;
    L69:
        if (ComposerKt.isTraceInProgress() == false) goto L71;
        ComposerKt.traceEventStart(679005231, $dirty2, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:102)");
    L71:
        ComposerKt.sourceInformationMarkerStart($composer2, 1274691569, "CC(remember):Crossfade.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L75;
        SnapshotStateList $this$Crossfade_u24lambda_u241_u24lambda_u240 = SnapshotStateKt.mutableStateListOf();
        $this$Crossfade_u24lambda_u241_u24lambda_u240.add(r1.getCurrentState());
        $composer2.updateRememberedValue($this$Crossfade_u24lambda_u241_u24lambda_u240);
        it$iv = $this$Crossfade_u24lambda_u241_u24lambda_u240;
    L75:
        SnapshotStateList currentlyVisible = (SnapshotStateList) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 1274694318, "CC(remember):Crossfade.kt#9igjgp");
        Object it$iv2 = $composer2.rememberedValue();
        if (it$iv2 != Composer.Companion.getEmpty()) goto L79;
        Object value$iv = ScatterMapKt.mutableScatterMapOf();
        $composer2.updateRememberedValue(value$iv);
        it$iv2 = value$iv;
    L79:
        MutableScatterMap contentMap = (MutableScatterMap) it$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (Intrinsics.areEqual(r1.getCurrentState(), r1.getTargetState()) == false) goto L101;
        $composer2.startReplaceGroup(860925177);
        ComposerKt.sourceInformation($composer2, "");
        if (currentlyVisible.size() == 1) goto L84;
    L87:
        $composer2.startReplaceGroup(861059531);
        ComposerKt.sourceInformation($composer2, "109@5150L21");
        SnapshotStateList r8 = currentlyVisible;
        ComposerKt.sourceInformationMarkerStart($composer2, 1274706278, "CC(remember):Crossfade.kt#9igjgp");
        if (($dirty2 & 14) != 4) goto L90;
        boolean invalid$iv = true;
    L91:
        Object it$iv3 = $composer2.rememberedValue();
        if (invalid$iv == true) goto L97;
        Modifier modifier3 = modifier2;
        if (it$iv3 != Composer.Companion.getEmpty()) goto L99;
    L98:
        Object value$iv2 = (Function1) new CrossfadeKt$Crossfade$4$1(r1);
        $composer2.updateRememberedValue(value$iv2);
        it$iv3 = value$iv2;
    L99:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        CollectionsKt.removeAll(r8, (Function1) it$iv3);
        contentMap.clear();
        $composer2.endReplaceGroup();
    L100:
        $composer2.endReplaceGroup();
    L103:
        if (contentMap.contains(r1.getTargetState()) == true) goto L120;
        $composer2.startReplaceGroup(861316428);
        ComposerKt.sourceInformation($composer2, "*124@5717L295");
        SnapshotStateList $this$indexOfFirst$iv = currentlyVisible;
        int $i$f$indexOfFirst = 0;
        int index$iv = 0;
        Iterator<T> r13 = $this$indexOfFirst$iv.iterator();
    L106:
        if (r13.hasNext() == false) goto L111;
        List $this$indexOfFirst$iv2 = $this$indexOfFirst$iv;
        int $i$f$indexOfFirst2 = $i$f$indexOfFirst;
        if (Intrinsics.areEqual(r12.invoke(r13.next()), r12.invoke(r1.getTargetState())) == true) goto L113;
        index$iv = index$iv + 1;
        $this$indexOfFirst$iv = $this$indexOfFirst$iv2;
        $i$f$indexOfFirst = $i$f$indexOfFirst2;
    L113:
        if (index$iv != (-1)) goto L115;
        currentlyVisible.add(r1.getTargetState());
    L116:
        contentMap.clear();
        SnapshotStateList $this$fastForEach$iv = currentlyVisible;
        int $i$f$fastForEach = 0;
        int index$iv2 = 0;
        int r14 = $this$fastForEach$iv.size();
    L117:
        if (index$iv2 >= r14) goto L119;
        T r15 = $this$fastForEach$iv.get(index$iv2);
        contentMap.set(r15, ComposableLambdaKt.rememberComposableLambda(-1426421288, true, new CrossfadeKt$Crossfade$5$1(r1, r10, r15, r5), $composer2, 54));
        index$iv2 = index$iv2 + 1;
        r1 = r37;
        $i$f$fastForEach = $i$f$fastForEach;
        currentlyVisible = currentlyVisible;
        $this$fastForEach$iv = $this$fastForEach$iv;
        r5 = r41;
        goto L117
    L119:
        SnapshotStateList currentlyVisible2 = currentlyVisible;
        $composer2.endReplaceGroup();
    L121:
        int $changed$iv = ($dirty2 >> 3) & 14;
        Modifier modifier$iv = modifier3;
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv = ($changed$iv << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r17 = ComposeUiNode.Companion.getConstructor();
        int $i$f$Box = $changed$iv$iv << 6;
        int $changed$iv$iv$iv = ($i$f$Box & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L124;
        ComposablesKt.invalidApplier();
    L124:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L127;
        Function0<ComposeUiNode> r4 = r17;
        $composer2.createNode(r4);
    L128:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r6 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L135;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L135;
    L136:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r0 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance r16 = BoxScopeInstance.INSTANCE;
        int r18 = (($changed$iv >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -1516758910, "C:Crossfade.kt#xbi5r1");
        $composer2.startReplaceGroup(-187474512);
        ComposerKt.sourceInformation($composer2, "");
        SnapshotStateList $this$fastForEach$iv2 = currentlyVisible2;
        int $i$f$fastForEach2 = $this$fastForEach$iv2.size();
        int index$iv3 = 0;
    L137:
        if (index$iv3 >= $i$f$fastForEach2) goto L143;
        Object item$iv = $this$fastForEach$iv2.get(index$iv3);
        List $this$fastForEach$iv3 = $this$fastForEach$iv2;
        int r33 = $i$f$fastForEach2;
        int index$iv4 = index$iv3;
        $composer2.startMovableGroup(-1081865889, r12.invoke(item$iv));
        ComposerKt.sourceInformation($composer2, "");
        Function2 r19 = (Function2) contentMap.get(item$iv);
        if (r19 != null) goto L141;
        $composer2.startReplaceGroup(821932266);
        $composer2.endReplaceGroup();
    L142:
        $composer2.endMovableGroup();
        index$iv3 = index$iv4 + 1;
        $i$f$fastForEach2 = r33;
        $this$fastForEach$iv2 = $this$fastForEach$iv3;
        goto L137
    L141:
        $composer2.startReplaceGroup(-1081864713);
        ComposerKt.sourceInformation($composer2, "135@6127L8");
        r19.invoke($composer2, 0);
        $composer2.endReplaceGroup();
        goto L142
    L143:
        $composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L146;
        ComposerKt.traceEventEnd();
    L146:
        final Modifier modifier4 = modifier3;
        final FiniteAnimationSpec<Float> r20 = r10;
        final Function1<? super T, ? extends Object> r21 = r12;
    L148:
        ScopeUpdateScope r22 = $composer2.endRestartGroup();
        if (r22 == null) goto L158;
        r22.updateScope(new AnonymousClass7(r37, modifier4, r20, r21, r41, $changed, r44));
        return;
    L158:
        return;
    L135:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r6);
        goto L136
    L127:
        r4 = r17;
        $composer2.useNode();
        goto L128
    L115:
        currentlyVisible.set(index$iv, r1.getTargetState());
        goto L116
    L111:
        index$iv = -1;
        goto L113
    L120:
        currentlyVisible2 = currentlyVisible;
        $composer2.startReplaceGroup(862059281);
        $composer2.endReplaceGroup();
        goto L121
    L97:
        modifier3 = modifier2;
        goto L98
    L90:
        invalid$iv = false;
        goto L91
    L84:
        if (Intrinsics.areEqual(currentlyVisible.get(0), r1.getTargetState()) == false) goto L87;
        $composer2.startReplaceGroup(861249809);
        $composer2.endReplaceGroup();
        modifier3 = modifier2;
        goto L100
    L101:
        modifier3 = modifier2;
        $composer2.startReplaceGroup(861255761);
        $composer2.endReplaceGroup();
        goto L103
    L63:
        modifier2 = r7;
        goto L64
    L147:
        $composer2.skipToGroupEnd();
        modifier4 = r7;
        r20 = r10;
        r21 = r12;
        goto L148
    L58:
        r2 = false;
        goto L60
    L49:
        if (($changed & 24576) != 0) goto L55;
        if ($composer2.changedInstance(r5) == false) goto L53;
        int r110 = 16384;
    L54:
        $dirty = $dirty | r110;
        goto L55
    L53:
        r110 = 8192;
        goto L54
    L38:
        if (($changed & 3072) != 0) goto L44;
        r12 = r40;
        if ($composer2.changedInstance(r12) == false) goto L42;
        int r111 = 2048;
    L43:
        $dirty = $dirty | r111;
        goto L46
    L42:
        r111 = 1024;
        goto L43
    L44:
        r12 = r40;
        goto L46
    L27:
        if (($changed & 384) != 0) goto L33;
        r10 = r39;
        if ($composer2.changedInstance(r10) == false) goto L31;
        int r112 = 256;
    L32:
        $dirty = $dirty | r112;
        goto L34
    L31:
        r112 = 128;
        goto L32
    L33:
        r10 = r39;
        goto L34
    L16:
        if (($changed & 48) != 0) goto L22;
        r7 = modifier;
        if ($composer2.changed(r7) == false) goto L20;
        int r23 = 32;
    L21:
        $dirty = $dirty | r23;
        goto L23
    L20:
        r23 = 16;
        goto L21
    L22:
        r7 = modifier;
        goto L23
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(r1) == false) goto L10;
        int r24 = 4;
    L11:
        $dirty = $dirty | r24;
        goto L12
    L10:
        r24 = 2;
        goto L11
    }
}
