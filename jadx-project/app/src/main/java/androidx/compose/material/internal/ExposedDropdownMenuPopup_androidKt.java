package androidx.compose.material.internal;

import android.view.View;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ExposedDropdownMenuPopup.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a:\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\fH\u0001¢\u0006\u0002\u0010\r\u001a+\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0013\b\b\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\fH\u0083\b¢\u0006\u0002\u0010\u0011\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0012²\u0006\u0015\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\fX\u008a\u0084\u0002"}, d2 = {"LocalPopupTestTag", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "getLocalPopupTestTag", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "ExposedDropdownMenuPopup", "", "onDismissRequest", "Lkotlin/Function0;", "popupPositionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "content", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "SimpleStack", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "material_release", "currentContent"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ExposedDropdownMenuPopup_androidKt {
    private static final ProvidableCompositionLocal<String> LocalPopupTestTag = null;

    /* JADX INFO: renamed from: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$SimpleStack$1, reason: invalid class name */
    /* JADX INFO: compiled from: ExposedDropdownMenuPopup.android.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 implements MeasurePolicy {
        public static final AnonymousClass1 INSTANCE = null;

        static {
            INSTANCE = new AnonymousClass1();
        }

        public AnonymousClass1() {
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final MeasureResult mo32measure3p2s80s(MeasureScope $this$Layout, List<? extends Measurable> r18, long constraints) {
            switch(r18.size()) {
                case 0: goto L19;
                case 1: goto L5;
                default: goto L4;
            };
        L4:
            List target$iv = new ArrayList(r18.size());
            int index$iv$iv = 0;
            int r9 = r18.size();
        L7:
            if (index$iv$iv >= r9) goto L9;
            Object item$iv$iv = r18.get(index$iv$iv);
            Measurable it = (Measurable) item$iv$iv;
            target$iv.add(it.mo5714measureBRTryo0(constraints));
            index$iv$iv = index$iv$iv + 1;
            goto L7
        L9:
            final List placeables = target$iv;
            int width = 0;
            int height = 0;
            int i = 0;
            int r7 = CollectionsKt.getLastIndex(placeables);
            if (0 > r7) goto L14;
        L11:
            Placeable p = (Placeable) placeables.get(i);
            width = Math.max(width, p.getWidth());
            height = Math.max(height, p.getHeight());
            if (i == r7) goto L14;
            i = i + 1;
        L14:
            int i2 = height;
            return MeasureScope.layout$default($this$Layout, width, i2, null, new AnonymousClass3(placeables), 4, null);
        L5:
            final Placeable p2 = r18.get(0).mo5714measureBRTryo0(constraints);
            return MeasureScope.layout$default($this$Layout, p2.getWidth(), p2.getHeight(), null, new AnonymousClass2(p2), 4, null);
        L19:
            return MeasureScope.layout$default($this$Layout, 0, 0, null, C00871.INSTANCE, 4, null);
        }
    }

    public static final /* synthetic */ Function2 access$ExposedDropdownMenuPopup$lambda$0(State $currentContent$delegate) {
        return ExposedDropdownMenuPopup$lambda$0($currentContent$delegate);
    }

    public static final void ExposedDropdownMenuPopup(Function0<Unit> r28, final PopupPositionProvider popupPositionProvider, final Function2<? super Composer, ? super Integer, Unit> r30, Composer $composer, final int $changed, final int r33) {
        final PopupPositionProvider r2 = popupPositionProvider;
        Composer $composer2 = $composer.startRestartGroup(-707851182);
        ComposerKt.sourceInformation($composer2, "C(ExposedDropdownMenuPopup)P(1,2)81@3322L7,82@3361L7,83@3405L7,84@3460L7,85@3496L28,86@3551L29,87@3599L38,88@3660L958,114@4654L350,114@4624L380,128@5021L181,128@5010L192,136@5248L126,136@5208L166,148@5643L494,159@6144L99,145@5552L691:ExposedDropdownMenuPopup.android.kt#mnwmf7");
        int $dirty = $changed;
        int r3 = r33 & 1;
        if (r3 == 0) goto L6;
        $dirty = $dirty | 6;
        Function0<Unit> r5 = r28;
    L14:
        if ((r33 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L24:
        if ((r33 & 4) == 0) goto L27;
        $dirty = $dirty | 384;
    L34:
        if (($dirty & 147) == 146) goto L36;
        boolean r6 = true;
    L38:
        if ($composer2.shouldExecute(r6, $dirty & 1) == false) goto L117;
        if (r3 == 0) goto L41;
        Function0<Unit> r4 = null;
    L43:
        if (ComposerKt.isTraceInProgress() == false) goto L45;
        ComposerKt.traceEventStart(-707851182, $dirty, -1, "androidx.compose.material.internal.ExposedDropdownMenuPopup (ExposedDropdownMenuPopup.android.kt:80)");
    L45:
        ProvidableCompositionLocal<View> r0 = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r15 = $composer2.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        View view = (View) r15;
        ProvidableCompositionLocal<Density> r7 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r16 = $composer2.consume(r7);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Density density = (Density) r16;
        ProvidableCompositionLocal<String> r8 = LocalPopupTestTag;
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r17 = $composer2.consume(r8);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        String testTag = (String) r17;
        ProvidableCompositionLocal<LayoutDirection> r18 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r10 = $composer2.consume(r18);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final LayoutDirection layoutDirection = (LayoutDirection) r10;
        CompositionContext parentComposition = ComposablesKt.rememberCompositionContext($composer2, 0);
        final State currentContent$delegate = SnapshotStateKt.rememberUpdatedState(r30, $composer2, ($dirty >> 6) & 14);
        UUID popupId = (UUID) RememberSaveableKt.m3923rememberSaveable(new Object[0], null, null, ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupId$1.INSTANCE, $composer2, 3072, 6);
        ComposerKt.sourceInformationMarkerStart($composer2, 1502140133, "CC(remember):ExposedDropdownMenuPopup.android.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L48;
        int $dirty2 = $dirty;
        Function0<Unit> r1 = r4;
        int $dirty3 = $dirty2;
        final PopupLayout r9 = new PopupLayout(r1, testTag, view, density, r2, popupId);
        final String testTag2 = testTag;
        r2 = r2;
        final Function0<Unit> r11 = r1;
        boolean r12 = true;
        r9.setContent(parentComposition, ComposableLambdaKt.composableLambdaInstance(580081703, true, new ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupLayout$1$1$1(r9, currentContent$delegate)));
        $composer2.updateRememberedValue(r9);
        it$iv = r9;
    L49:
        final PopupLayout popupLayout = (PopupLayout) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 1502171333, "CC(remember):ExposedDropdownMenuPopup.android.kt#9igjgp");
        boolean r13 = $composer2.changedInstance(popupLayout);
        if (($dirty3 & 14) != 4) goto L52;
        boolean r14 = r12;
    L53:
        boolean invalid$iv = ((r13 | r14) | $composer2.changed(testTag2)) | $composer2.changed(layoutDirection);
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv == false) goto L56;
    L59:
        Object value$iv = (Function1) new ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$1$1(popupLayout, r11, testTag2, layoutDirection);
        $composer2.updateRememberedValue(value$iv);
        it$iv2 = value$iv;
    L60:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.DisposableEffect(popupLayout, (Function1) it$iv2, $composer2, 0);
        ComposerKt.sourceInformationMarkerStart($composer2, 1502182908, "CC(remember):ExposedDropdownMenuPopup.android.kt#9igjgp");
        boolean r19 = $composer2.changedInstance(popupLayout);
        if (($dirty3 & 14) != 4) goto L63;
        boolean r20 = true;
    L64:
        boolean invalid$iv2 = ((r19 | r20) | $composer2.changed(testTag2)) | $composer2.changed(layoutDirection);
        Object it$iv3 = $composer2.rememberedValue();
        if (invalid$iv2 == true) goto L71;
        if (it$iv3 == Composer.Companion.getEmpty()) goto L71;
    L72:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.SideEffect((Function0) it$iv3, $composer2, 0);
        ComposerKt.sourceInformationMarkerStart($composer2, 1502190117, "CC(remember):ExposedDropdownMenuPopup.android.kt#9igjgp");
        boolean r21 = $composer2.changedInstance(popupLayout);
        if (($dirty3 & 112) != 32) goto L75;
        boolean r22 = true;
    L76:
        boolean invalid$iv3 = r21 | r22;
        Object it$iv4 = $composer2.rememberedValue();
        if (invalid$iv3 == true) goto L83;
        if (it$iv4 == Composer.Companion.getEmpty()) goto L83;
    L84:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.DisposableEffect(r2, (Function1) it$iv4, $composer2, ($dirty3 >> 3) & 14);
        Modifier.Companion r23 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart($composer2, 1502203125, "CC(remember):ExposedDropdownMenuPopup.android.kt#9igjgp");
        boolean invalid$iv4 = $composer2.changedInstance(popupLayout);
        Object it$iv5 = $composer2.rememberedValue();
        if (invalid$iv4 == false) goto L87;
    L90:
        Object value$iv2 = (Function1) new ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$5$1(popupLayout);
        $composer2.updateRememberedValue(value$iv2);
        it$iv5 = value$iv2;
    L91:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier modifier$iv = OnGloballyPositionedModifierKt.onGloballyPositioned(r23, (Function1) it$iv5);
        ComposerKt.sourceInformationMarkerStart($composer2, 1502218762, "CC(remember):ExposedDropdownMenuPopup.android.kt#9igjgp");
        boolean invalid$iv5 = $composer2.changedInstance(popupLayout) | $composer2.changed(layoutDirection);
        Object it$iv6 = $composer2.rememberedValue();
        if (invalid$iv5 == false) goto L94;
    L97:
        Object value$iv3 = (MeasurePolicy) new ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$6$1(popupLayout, layoutDirection);
        $composer2.updateRememberedValue(value$iv3);
        it$iv6 = value$iv3;
    L98:
        MeasurePolicy measurePolicy$iv = (MeasurePolicy) it$iv6;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r110 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv = ((0 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L101;
        ComposablesKt.invalidApplier();
    L101:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L104;
        $composer2.createNode(r110);
    L105:
        Composer $this$Layout_u24lambda_u240$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r24 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv.getInserting() == true) goto L111;
        int compositeKeyHash$iv2 = compositeKeyHash$iv;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv2)) == true) goto L113;
    L112:
        $this$Layout_u24lambda_u240$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv2));
        $this$Layout_u24lambda_u240$iv.apply(Integer.valueOf(compositeKeyHash$iv2), r24);
    L113:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
        int r25 = ($changed$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, 355569213, "C:ExposedDropdownMenuPopup.android.kt#mnwmf7");
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L116;
        ComposerKt.traceEventEnd();
    L116:
        final Function0<Unit> r26 = r11;
    L118:
        ScopeUpdateScope r27 = $composer2.endRestartGroup();
        if (r27 == null) goto L122;
        r27.updateScope(new AnonymousClass7(r26, popupPositionProvider, r30, $changed, r33));
        return;
    L122:
        return;
    L111:
        compositeKeyHash$iv2 = compositeKeyHash$iv;
        goto L112
    L104:
        $composer2.useNode();
        goto L105
    L94:
        if (it$iv6 != Composer.Companion.getEmpty()) goto L98;
    L87:
        if (it$iv5 != Composer.Companion.getEmpty()) goto L91;
    L83:
        Object value$iv4 = (Function1) new ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$3$1(popupLayout, r2);
        $composer2.updateRememberedValue(value$iv4);
        it$iv4 = value$iv4;
        goto L84
    L75:
        r22 = false;
    L71:
        Object value$iv5 = (Function0) new ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$2$1(popupLayout, r11, testTag2, layoutDirection);
        $composer2.updateRememberedValue(value$iv5);
        it$iv3 = value$iv5;
        goto L72
    L63:
        r20 = false;
        goto L64
    L56:
        if (it$iv2 != Composer.Companion.getEmpty()) goto L60;
    L52:
        r14 = false;
        goto L53
    L48:
        testTag2 = testTag;
        r12 = true;
        $dirty3 = $dirty;
        r11 = r4;
        goto L49
    L41:
        r4 = r5;
        goto L43
    L117:
        $composer2.skipToGroupEnd();
        r26 = r5;
        goto L118
    L36:
        r6 = false;
        goto L38
    L27:
        if (($changed & 384) != 0) goto L34;
        if ($composer2.changedInstance(r30) == false) goto L31;
        int r29 = 256;
    L32:
        $dirty = $dirty | r29;
        goto L34
    L31:
        r29 = 128;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changed(r2) == false) goto L21;
        int r31 = 32;
    L22:
        $dirty = $dirty | r31;
        goto L24
    L21:
        r31 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L12;
        r5 = r28;
        if ($composer2.changedInstance(r5) == false) goto L10;
        int r32 = 4;
    L11:
        $dirty = $dirty | r32;
        goto L14
    L10:
        r32 = 2;
        goto L11
    L12:
        r5 = r28;
        goto L14
    }

    private static final Function2<Composer, Integer, Unit> ExposedDropdownMenuPopup$lambda$0(State<? extends Function2<? super Composer, ? super Integer, Unit>> r4) {
        Object thisObj$iv = r4.getValue();
        return (Function2) thisObj$iv;
    }

    static {
        LocalPopupTestTag = CompositionLocalKt.compositionLocalOf$default(null, ExposedDropdownMenuPopup_androidKt$LocalPopupTestTag$1.INSTANCE, 1, null);
    }

    public static final ProvidableCompositionLocal<String> getLocalPopupTestTag() {
        return LocalPopupTestTag;
    }

    private static final void SimpleStack(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> r21, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1085885553, "CC(SimpleStack)P(1)175@6787L943:ExposedDropdownMenuPopup.android.kt#mnwmf7");
        MeasurePolicy measurePolicy$iv = AnonymousClass1.INSTANCE;
        int $changed$iv = ((($changed >> 3) & 14) | 384) | (($changed << 3) & 112);
        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
        CompositionLocalMap localMap$iv = $composer.getCurrentCompositionLocalMap();
        Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer, modifier);
        Function0<ComposeUiNode> r9 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv = (($changed$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer.getApplier() instanceof Applier) == true) goto L5;
        ComposablesKt.invalidApplier();
    L5:
        $composer.startReusableNode();
        if ($composer.getInserting() == false) goto L8;
        $composer.createNode(r9);
    L9:
        Composer $this$Layout_u24lambda_u240$iv = Updater.m3808constructorimpl($composer);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r14 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv.getInserting() == true) goto L16;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv)) == false) goto L16;
    L17:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
        r21.invoke($composer, Integer.valueOf(($changed$iv$iv >> 6) & 14));
        $composer.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        return;
    L16:
        $this$Layout_u24lambda_u240$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
        $this$Layout_u24lambda_u240$iv.apply(Integer.valueOf(compositeKeyHash$iv), r14);
        goto L17
    L8:
        $composer.useNode();
        goto L9
    }
}
