package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Crossfade.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "T", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
final class CrossfadeKt$Crossfade$5$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;
    final /* synthetic */ Function3<T, Composer, Integer, Unit> $content;
    final /* synthetic */ T $stateForContent;
    final /* synthetic */ Transition<T> $this_Crossfade;

    /* JADX WARN: Multi-variable type inference failed */
    CrossfadeKt$Crossfade$5$1(Transition<T> r2, FiniteAnimationSpec<Float> r3, T r4, Function3<? super T, ? super Composer, ? super Integer, Unit> r5) {
        this.$this_Crossfade = r2;
        this.$animationSpec = r3;
        this.$stateForContent = r4;
        this.$content = r5;
        super(2);
    }

    public static final /* synthetic */ float access$invoke$lambda$1(State $alpha$delegate) {
        return invoke$lambda$1($alpha$delegate);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer r3, Integer r4) {
        invoke(r3, r4.intValue());
        return Unit.INSTANCE;
    }

    private static final float invoke$lambda$1(State<Float> r4) {
        return r4.getValue().floatValue();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void invoke(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C126@5768L134,129@5946L22,129@5919L79:Crossfade.kt#xbi5r1");
        if (($changed & 3) == 2) goto L5;
        boolean r1 = true;
    L7:
        if ($composer.shouldExecute(r1, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
        return;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(-1426421288, $changed, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous> (Crossfade.kt:125)");
    L11:
        Transition $this$animateFloat$iv = this.$this_Crossfade;
        final FiniteAnimationSpec<Float> r3 = this.$animationSpec;
        Function3 transitionSpec$iv = new CrossfadeKt$Crossfade$5$1$alpha$2(r3);
        T r2 = this.$stateForContent;
        ComposerKt.sourceInformationMarkerStart($composer, -1338768149, "CC(animateFloat)P(2)1924@81822L78:Transition.kt#pdpnli");
        TwoWayConverter<Float, AnimationVector1D> r5 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        int $changed$iv$iv = (((0 & 14) | ((0 << 3) & 896)) | ((0 << 3) & 7168)) | ((0 << 3) & 57344);
        ComposerKt.sourceInformationMarkerStart($composer, -142660079, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli");
        Object it = $this$animateFloat$iv.getCurrentState();
        int $changed2 = ($changed$iv$iv >> 9) & 112;
        $composer.startReplaceGroup(-438678252);
        ComposerKt.sourceInformation($composer, "C:Crossfade.kt#xbi5r1");
        if (ComposerKt.isTraceInProgress() == false) goto L15;
        ComposerKt.traceEventStart(-438678252, $changed2, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:127)");
    L15:
        float r27 = 0.0f;
        if (Intrinsics.areEqual(it, r2) == false) goto L18;
        float r6 = 1.0f;
    L20:
        if (ComposerKt.isTraceInProgress() == false) goto L22;
        ComposerKt.traceEventEnd();
    L22:
        $composer.endReplaceGroup();
        Object initialValue$iv$iv = Float.valueOf(r6);
        Object it2 = r8.getTargetState();
        int $changed3 = ($changed$iv$iv >> 9) & 112;
        $composer.startReplaceGroup(-438678252);
        ComposerKt.sourceInformation($composer, "C:Crossfade.kt#xbi5r1");
        if (ComposerKt.isTraceInProgress() == false) goto L26;
        ComposerKt.traceEventStart(-438678252, $changed3, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:127)");
    L26:
        if (Intrinsics.areEqual(it2, r2) == false) goto L29;
        r27 = 1.0f;
    L29:
        if (ComposerKt.isTraceInProgress() == false) goto L31;
        ComposerKt.traceEventEnd();
    L31:
        $composer.endReplaceGroup();
        Object targetValue$iv$iv = Float.valueOf(r27);
        FiniteAnimationSpec animationSpec$iv$iv = (FiniteAnimationSpec) transitionSpec$iv.invoke(r8.getSegment(), $composer, Integer.valueOf(($changed$iv$iv >> 3) & 112));
        final State alpha$delegate = androidx.compose.animation.core.TransitionKt.createTransitionAnimation($this$animateFloat$iv, initialValue$iv$iv, targetValue$iv$iv, animationSpec$iv$iv, r5, "FloatAnimation", $composer, (($changed$iv$iv & 14) | (($changed$iv$iv << 9) & 57344)) | (($changed$iv$iv << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        Modifier.Companion r4 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart($composer, -1081870491, "CC(remember):Crossfade.kt#9igjgp");
        boolean invalid$iv = $composer.changed(alpha$delegate);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L34;
    L37:
        Object value$iv = (Function1) new CrossfadeKt$Crossfade$5$1$1$1(alpha$delegate);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L38:
        ComposerKt.sourceInformationMarkerEnd($composer);
        Modifier modifier$iv = GraphicsLayerModifierKt.graphicsLayer(r4, (Function1) it$iv);
        Function3<T, Composer, Integer, Unit> r7 = this.$content;
        T r8 = this.$stateForContent;
        ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
        CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv);
        Function0<ComposeUiNode> r17 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv = ((0 << 3) & 112) << 6;
        int $changed$iv$iv$iv = ($changed$iv & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer.getApplier() instanceof Applier) == true) goto L41;
        ComposablesKt.invalidApplier();
    L41:
        $composer.startReusableNode();
        if ($composer.getInserting() == false) goto L44;
        Function0<ComposeUiNode> r9 = r17;
        $composer.createNode(r9);
    L45:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r10 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L52;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L52;
    L53:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r0 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance r11 = BoxScopeInstance.INSTANCE;
        int r12 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -1437522275, "C129@5972L24:Crossfade.kt#xbi5r1");
        r7.invoke(r8, $composer, 0);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        $composer.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L58;
        ComposerKt.traceEventEnd();
        return;
    L58:
        return;
    L52:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r10);
        goto L53
    L44:
        r9 = r17;
        $composer.useNode();
        goto L45
    L34:
        if (it$iv != Composer.Companion.getEmpty()) goto L38;
    L18:
        r6 = 0.0f;
        goto L20
    L5:
        r1 = false;
        goto L7
    }
}
