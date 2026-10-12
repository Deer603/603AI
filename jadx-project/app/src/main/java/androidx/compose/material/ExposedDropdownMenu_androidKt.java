package androidx.compose.material;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntRect;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ExposedDropdownMenu.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aQ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\n¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\f\u001a6\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0005H\u0002\u001a\"\u0010\u0015\u001a\u00020\u0007*\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002¨\u0006\u0019²\u0006\n\u0010\u001a\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010\u001b\u001a\u00020\u0013X\u008a\u008e\u0002"}, d2 = {"ExposedDropdownMenuBox", "", "expanded", "", "onExpandedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Landroidx/compose/material/ExposedDropdownMenuBoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "updateHeight", "windowBounds", "Landroidx/compose/ui/unit/IntRect;", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "verticalMarginInPx", "", "onHeightUpdate", "expandable", "Lkotlin/Function0;", "menuLabel", "", "material_release", "width", "menuHeight"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ExposedDropdownMenu_androidKt {

    /* JADX INFO: renamed from: androidx.compose.material.ExposedDropdownMenu_androidKt$expandable$1, reason: invalid class name */
    /* JADX INFO: compiled from: ExposedDropdownMenu.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.ExposedDropdownMenu_androidKt$expandable$1", f = "ExposedDropdownMenu.kt", i = {}, l = {446}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $onExpandedChange;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.material.ExposedDropdownMenu_androidKt$expandable$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: ExposedDropdownMenu.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material.ExposedDropdownMenu_androidKt$expandable$1$1", f = "ExposedDropdownMenu.kt", i = {0}, l = {450, 451}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
        static final class C00741 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function0<Unit> $onExpandedChange;
            private /* synthetic */ Object L$0;
            int label;

            C00741(Function0<Unit> r2, Continuation<? super C00741> r3) {
                this.$onExpandedChange = r2;
                super(2, r3);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
                C00741 r0 = new C00741(this.$onExpandedChange, r4);
                r0.L$0 = r3;
                return r0;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(AwaitPointerEventScope r3, Continuation<? super Unit> r4) {
                return ((C00741) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(AwaitPointerEventScope r2, Continuation<? super Unit> r3) {
                return invoke2(r2, r3);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch(this.label) {
                    case 0: goto L8;
                    case 1: goto L7;
                    case 2: goto L6;
                    default: goto L5;
                };
            L6:
                ResultKt.throwOnFailure($result);
            L16:
                PointerInputChange upEvent = (PointerInputChange) $result;
                if (upEvent == null) goto L20;
                this.$onExpandedChange.invoke();
            L20:
                return Unit.INSTANCE;
            L7:
                AwaitPointerEventScope $this$awaitEachGesture = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure($result);
            L12:
                this.L$0 = null;
                this.label = 2;
                Object r1 = TapGestureDetectorKt.waitForUpOrCancellation($this$awaitEachGesture, PointerEventPass.Initial, this);
                if (r1 != r0) goto L15;
                return r0;
            L15:
                $result = r1;
                goto L16
            L8:
                ResultKt.throwOnFailure($result);
                AwaitPointerEventScope $this$awaitEachGesture2 = (AwaitPointerEventScope) this.L$0;
                this.L$0 = $this$awaitEachGesture2;
                this.label = 1;
                if (TapGestureDetectorKt.awaitFirstDown$default($this$awaitEachGesture2, false, PointerEventPass.Initial, this, 1, null) != r0) goto L11;
                return r0;
            L11:
                $this$awaitEachGesture = $this$awaitEachGesture2;
                goto L12
            L5:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        AnonymousClass1(Function0<Unit> r2, Continuation<? super AnonymousClass1> r3) {
            this.$onExpandedChange = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            AnonymousClass1 r0 = new AnonymousClass1(this.$onExpandedChange, r4);
            r0.L$0 = r3;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(PointerInputScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(PointerInputScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure($result);
        L11:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            PointerInputScope $this$pointerInput = (PointerInputScope) this.L$0;
            this.label = 1;
            if (ForEachGestureKt.awaitEachGesture($this$pointerInput, new C00741(this.$onExpandedChange, null), this) != r0) goto L11;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final /* synthetic */ int access$ExposedDropdownMenuBox$lambda$1(MutableIntState $width$delegate) {
        return ExposedDropdownMenuBox$lambda$1($width$delegate);
    }

    public static final /* synthetic */ void access$ExposedDropdownMenuBox$lambda$2(MutableIntState $width$delegate, int value) {
        ExposedDropdownMenuBox$lambda$2($width$delegate, value);
    }

    public static final /* synthetic */ int access$ExposedDropdownMenuBox$lambda$4(MutableIntState $menuHeight$delegate) {
        return ExposedDropdownMenuBox$lambda$4($menuHeight$delegate);
    }

    public static final /* synthetic */ void access$ExposedDropdownMenuBox$lambda$5(MutableIntState $menuHeight$delegate, int value) {
        ExposedDropdownMenuBox$lambda$5($menuHeight$delegate, value);
    }

    public static final /* synthetic */ void access$updateHeight(IntRect windowBounds, LayoutCoordinates coordinates, int verticalMarginInPx, Function1 onHeightUpdate) {
        updateHeight(windowBounds, coordinates, verticalMarginInPx, onHeightUpdate);
    }

    public static final void ExposedDropdownMenuBox(final boolean expanded, final Function1<? super Boolean, Unit> r39, Modifier modifier, final Function3<? super ExposedDropdownMenuBoxScope, ? super Composer, ? super Integer, Unit> r41, Composer $composer, final int $changed, final int r44) {
        Composer $composer2 = $composer.startRestartGroup(1456052980);
        ComposerKt.sourceInformation($composer2, "C(ExposedDropdownMenuBox)P(1,3,2)95@4063L7,96@4104L32,97@4154L33,98@4210L33,100@4344L37,103@4407L536,116@4969L29,120@5060L413,132@5534L31,133@5595L38,118@5004L725,140@5746L47,140@5735L58,142@5828L272,142@5799L301:ExposedDropdownMenu.kt#jmzs0o");
        int $dirty = $changed;
        if ((r44 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r44 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L22:
        int r6 = r44 & 4;
        if (r6 == 0) goto L26;
        $dirty = $dirty | 384;
        Modifier modifier2 = modifier;
    L34:
        if ((r44 & 8) == 0) goto L37;
        $dirty = $dirty | 3072;
    L43:
        int $dirty2 = $dirty;
        if (($dirty2 & 1171) == 1170) goto L46;
        boolean r3 = true;
    L48:
        if ($composer2.shouldExecute(r3, $dirty2 & 1) == false) goto L139;
        if (r6 == 0) goto L52;
        modifier2 = Modifier.Companion;
    L52:
        if (ComposerKt.isTraceInProgress() == false) goto L54;
        ComposerKt.traceEventStart(1456052980, $dirty2, -1, "androidx.compose.material.ExposedDropdownMenuBox (ExposedDropdownMenu.kt:94)");
    L54:
        ProvidableCompositionLocal<Density> r0 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r12 = $composer2.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final Density density = (Density) r12;
        WindowBoundsCalculator windowBoundsCalculator = ExposedDropdownMenu_android.platformWindowBoundsCalculator($composer2, 0);
        ComposerKt.sourceInformationMarkerStart($composer2, 1870738402, "CC(remember):ExposedDropdownMenu.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L58;
        Object value$iv = SnapshotIntStateKt.mutableIntStateOf(0);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L58:
        final MutableIntState width$delegate = (MutableIntState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 1870740194, "CC(remember):ExposedDropdownMenu.kt#9igjgp");
        Object it$iv2 = $composer2.rememberedValue();
        if (it$iv2 != Composer.Companion.getEmpty()) goto L62;
        Object value$iv2 = SnapshotIntStateKt.mutableIntStateOf(0);
        $composer2.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L62:
        final MutableIntState menuHeight$delegate = (MutableIntState) it$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final int verticalMarginInPx = density.mo370roundToPx0680j_4(MenuKt.getMenuVerticalMargin());
        ComposerKt.sourceInformationMarkerStart($composer2, 1870744486, "CC(remember):ExposedDropdownMenu.kt#9igjgp");
        Object it$iv3 = $composer2.rememberedValue();
        if (it$iv3 != Composer.Companion.getEmpty()) goto L66;
        Object value$iv3 = new Ref();
        $composer2.updateRememberedValue(value$iv3);
        it$iv3 = value$iv3;
    L66:
        final Ref coordinates = (Ref) it$iv3;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        int r11 = ExposedDropdownMenuBox$lambda$4(menuHeight$delegate);
        int r13 = ExposedDropdownMenuBox$lambda$1(width$delegate);
        ComposerKt.sourceInformationMarkerStart($composer2, 1870747001, "CC(remember):ExposedDropdownMenu.kt#9igjgp");
        boolean invalid$iv = ($composer2.changed(r11) | $composer2.changed(density)) | $composer2.changed(r13);
        Object it$iv4 = $composer2.rememberedValue();
        if (invalid$iv == true) goto L73;
        if (it$iv4 == Composer.Companion.getEmpty()) goto L73;
    L74:
        ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1 scope = (ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1) it$iv4;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 1870764478, "CC(remember):ExposedDropdownMenu.kt#9igjgp");
        Object it$iv5 = $composer2.rememberedValue();
        if (it$iv5 != Composer.Companion.getEmpty()) goto L78;
        Object value$iv4 = new FocusRequester();
        $composer2.updateRememberedValue(value$iv4);
        it$iv5 = value$iv4;
    L78:
        final FocusRequester focusRequester = (FocusRequester) it$iv5;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 1870767774, "CC(remember):ExposedDropdownMenu.kt#9igjgp");
        boolean invalid$iv2 = ($composer2.changedInstance(coordinates) | $composer2.changedInstance(windowBoundsCalculator)) | $composer2.changed(verticalMarginInPx);
        Object it$iv6 = $composer2.rememberedValue();
        if (invalid$iv2 == true) goto L84;
        final WindowBoundsCalculator windowBoundsCalculator2 = windowBoundsCalculator;
        if (it$iv6 == Composer.Companion.getEmpty()) goto L85;
        final Ref coordinates2 = coordinates;
        Object value$iv5 = it$iv6;
        final int verticalMarginInPx2 = verticalMarginInPx;
        final MutableIntState menuHeight$delegate2 = menuHeight$delegate;
        final WindowBoundsCalculator windowBoundsCalculator3 = windowBoundsCalculator2;
    L86:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r5 = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier2, (Function1) value$iv5);
        ComposerKt.sourceInformationMarkerStart($composer2, 1870782560, "CC(remember):ExposedDropdownMenu.kt#9igjgp");
        if (($dirty2 & 112) != 32) goto L89;
        boolean r7 = true;
    L91:
        if (($dirty2 & 14) != 4) goto L93;
        boolean r14 = true;
    L94:
        boolean invalid$iv3 = r7 | r14;
        Object value$iv6 = $composer2.rememberedValue();
        if (invalid$iv3 == true) goto L100;
        Modifier modifier3 = modifier2;
        if (value$iv6 != Composer.Companion.getEmpty()) goto L102;
    L101:
        value$iv6 = (Function0) new ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$2$1(r39, expanded);
        $composer2.updateRememberedValue(value$iv6);
    L102:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier modifier$iv = FocusRequesterModifierKt.focusRequester(expandable(r5, (Function0) value$iv6, Strings_androidKt.m1781getString4foXLRw(Strings.Companion.m1776getExposedDropdownMenuUdPEhr4(), $composer2, 6)), focusRequester);
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r26 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L105;
        ComposablesKt.invalidApplier();
    L105:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L108;
        Function0<ComposeUiNode> r8 = r26;
        $composer2.createNode(r8);
    L109:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r9 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L116;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L116;
    L117:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r2 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r4 = BoxScopeInstance.INSTANCE;
        int r15 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, 1038111572, "C137@5714L9:ExposedDropdownMenu.kt#jmzs0o");
        r41.invoke(scope, $composer2, Integer.valueOf(($dirty2 >> 6) & 112));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 1870789360, "CC(remember):ExposedDropdownMenu.kt#9igjgp");
        if (($dirty2 & 14) != 4) goto L120;
        boolean invalid$iv4 = true;
    L121:
        Object it$iv7 = $composer2.rememberedValue();
        if (invalid$iv4 == false) goto L124;
    L127:
        Object value$iv7 = (Function0) new ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$4$1(expanded, focusRequester);
        $composer2.updateRememberedValue(value$iv7);
        it$iv7 = value$iv7;
    L128:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.SideEffect((Function0) it$iv7, $composer2, 0);
        ComposerKt.sourceInformationMarkerStart($composer2, 1870792209, "CC(remember):ExposedDropdownMenu.kt#9igjgp");
        boolean invalid$iv5 = ($composer2.changedInstance(windowBoundsCalculator3) | $composer2.changedInstance(coordinates2)) | $composer2.changed(verticalMarginInPx2);
        Object it$iv8 = $composer2.rememberedValue();
        if (invalid$iv5 == false) goto L131;
    L134:
        Object value$iv8 = (Function0) new ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$5$1(windowBoundsCalculator3, coordinates2, verticalMarginInPx2, menuHeight$delegate2);
        $composer2.updateRememberedValue(value$iv8);
        it$iv8 = value$iv8;
    L135:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ExposedDropdownMenu_android.OnPlatformWindowBoundsChange((Function0) it$iv8, $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L138;
        ComposerKt.traceEventEnd();
    L138:
        final Modifier modifier4 = modifier3;
    L140:
        ScopeUpdateScope r10 = $composer2.endRestartGroup();
        if (r10 == null) goto L144;
        r10.updateScope(new AnonymousClass6(expanded, r39, modifier4, r41, $changed, r44));
        return;
    L144:
        return;
    L131:
        if (it$iv8 != Composer.Companion.getEmpty()) goto L135;
    L124:
        if (it$iv7 != Composer.Companion.getEmpty()) goto L128;
    L120:
        invalid$iv4 = false;
    L116:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r9);
        goto L117
    L108:
        r8 = r26;
        $composer2.useNode();
        goto L109
    L100:
        modifier3 = modifier2;
        goto L101
    L93:
        r14 = false;
        goto L94
    L89:
        r7 = false;
    L85:
        Function1<LayoutCoordinates, Unit> r16 = new ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$1$1(coordinates, windowBoundsCalculator2, verticalMarginInPx, width$delegate, menuHeight$delegate);
        coordinates2 = coordinates;
        windowBoundsCalculator3 = windowBoundsCalculator2;
        menuHeight$delegate2 = menuHeight$delegate;
        verticalMarginInPx2 = verticalMarginInPx;
        value$iv5 = r16;
        $composer2.updateRememberedValue(value$iv5);
        goto L86
    L84:
        windowBoundsCalculator2 = windowBoundsCalculator;
    L73:
        Object value$iv9 = new ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1(density, menuHeight$delegate, width$delegate);
        $composer2.updateRememberedValue(value$iv9);
        it$iv4 = value$iv9;
        goto L74
    L139:
        $composer2.skipToGroupEnd();
        modifier4 = modifier2;
        goto L140
    L46:
        r3 = false;
        goto L48
    L37:
        if (($changed & 3072) != 0) goto L43;
        if ($composer2.changedInstance(r41) == false) goto L41;
        int r17 = 2048;
    L42:
        $dirty = $dirty | r17;
        goto L43
    L41:
        r17 = 1024;
        goto L42
    L26:
        if (($changed & 384) != 0) goto L32;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L30;
        int r18 = 256;
    L31:
        $dirty = $dirty | r18;
        goto L34
    L30:
        r18 = 128;
        goto L31
    L32:
        modifier2 = modifier;
        goto L34
    L16:
        if (($changed & 48) != 0) goto L22;
        if ($composer2.changedInstance(r39) == false) goto L20;
        int r19 = 32;
    L21:
        $dirty = $dirty | r19;
        goto L22
    L20:
        r19 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(expanded) == false) goto L10;
        int r20 = 4;
    L11:
        $dirty = $dirty | r20;
        goto L13
    L10:
        r20 = 2;
        goto L11
    }

    private static final int ExposedDropdownMenuBox$lambda$1(MutableIntState $width$delegate) {
        MutableIntState $this$getValue$iv = $width$delegate;
        return $this$getValue$iv.getIntValue();
    }

    private static final void ExposedDropdownMenuBox$lambda$2(MutableIntState $width$delegate, int value) {
        $width$delegate.setIntValue(value);
    }

    private static final int ExposedDropdownMenuBox$lambda$4(MutableIntState $menuHeight$delegate) {
        MutableIntState $this$getValue$iv = $menuHeight$delegate;
        return $this$getValue$iv.getIntValue();
    }

    private static final void ExposedDropdownMenuBox$lambda$5(MutableIntState $menuHeight$delegate, int value) {
        $menuHeight$delegate.setIntValue(value);
    }

    private static final Modifier expandable(Modifier $this$expandable, final Function0<Unit> r6, final String menuLabel) {
        return SemanticsModifierKt.semantics$default(SuspendingPointerInputFilterKt.pointerInput($this$expandable, r6, new AnonymousClass1(r6, null)), false, new AnonymousClass2(menuLabel, r6), 1, null);
    }

    private static final void updateHeight(IntRect windowBounds, LayoutCoordinates coordinates, int verticalMarginInPx, Function1<? super Integer, Unit> r6) {
        if (coordinates != null) goto L4;
        return;
    L4:
        float heightAbove = LayoutCoordinatesKt.boundsInWindow(coordinates).getTop() - windowBounds.getTop();
        float heightBelow = (windowBounds.getBottom() - windowBounds.getTop()) - LayoutCoordinatesKt.boundsInWindow(coordinates).getBottom();
        r6.invoke(Integer.valueOf(((int) Math.max(heightAbove, heightBelow)) - verticalMarginInPx));
    }
}
