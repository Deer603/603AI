package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SwipeToDismissBox.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ay\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\n¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\u0013\u001aR\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f0\b2#\b\u0002\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00190\bH\u0007¢\u0006\u0002\u0010\u001d\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u001e"}, d2 = {"DismissVelocityThreshold", "Landroidx/compose/ui/unit/Dp;", "F", "SwipeToDismissBox", "", "state", "Landroidx/compose/material3/SwipeToDismissBoxState;", "backgroundContent", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "enableDismissFromStartToEnd", "", "enableDismissFromEndToStart", "gesturesEnabled", "content", "(Landroidx/compose/material3/SwipeToDismissBoxState;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;ZZZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "rememberSwipeToDismissBoxState", "initialValue", "Landroidx/compose/material3/SwipeToDismissBoxValue;", "confirmValueChange", "positionalThreshold", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "totalDistance", "(Landroidx/compose/material3/SwipeToDismissBoxValue;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SwipeToDismissBoxState;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SwipeToDismissBoxKt {
    private static final float DismissVelocityThreshold = 0.0f;

    public static final /* synthetic */ float access$getDismissVelocityThreshold$p() {
        return DismissVelocityThreshold;
    }

    public static final SwipeToDismissBoxState rememberSwipeToDismissBoxState(final SwipeToDismissBoxValue initialValue, final Function1 r11, final Function1<? super Float, Float> r12, Composer $composer, int $changed, int r15) {
        ComposerKt.sourceInformationMarkerStart($composer, -246335487, "C(rememberSwipeToDismissBoxState)P(1)185@7607L19,187@7687L7,195@7929L102,188@7706L325:SwipeToDismissBox.kt#uh7d8r");
        if ((r15 & 1) == 0) goto L6;
        initialValue = SwipeToDismissBoxValue.Settled;
    L6:
        if ((r15 & 2) == 0) goto L9;
        Function1 confirmValueChange = AnonymousClass1.INSTANCE;
        r11 = confirmValueChange;
    L9:
        if ((r15 & 4) == 0) goto L12;
        r12 = SwipeToDismissBoxDefaults.INSTANCE.getPositionalThreshold($composer, 6);
    L12:
        if (ComposerKt.isTraceInProgress() == false) goto L14;
        ComposerKt.traceEventStart(-246335487, $changed, -1, "androidx.compose.material3.rememberSwipeToDismissBoxState (SwipeToDismissBox.kt:186)");
    L14:
        ProvidableCompositionLocal<Density> r16 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r4 = $composer.consume(r16);
        ComposerKt.sourceInformationMarkerEnd($composer);
        final Density density = (Density) r4;
        boolean r0 = false;
        Object[] r3 = new Object[0];
        Saver<SwipeToDismissBoxState, SwipeToDismissBoxValue> r5 = SwipeToDismissBoxState.Companion.Saver(r11, r12, density);
        ComposerKt.sourceInformationMarkerStart($composer, -1333458863, "CC(remember):SwipeToDismissBox.kt#9igjgp");
        if ((6 ^ ($changed & 14)) <= 4) goto L19;
        if ($composer.changed(initialValue) == false) goto L19;
    L20:
        boolean r1 = true;
    L22:
        boolean r2 = r1 | $composer.changed(density);
        if ((($changed & 112) ^ 48) <= 32) goto L27;
        if ($composer.changed(r11) == false) goto L27;
    L28:
        boolean r6 = true;
    L30:
        boolean r7 = r2 | r6;
        if ((($changed & 896) ^ 384) <= 256) goto L35;
        if ($composer.changed(r12) == false) goto L35;
    L36:
        r0 = true;
    L37:
        boolean invalid$iv = r0 | r7;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L40;
    L43:
        Object value$iv = (Function0) new SwipeToDismissBoxKt$rememberSwipeToDismissBoxState$2$1(initialValue, density, r11, r12);
        $composer.updateRememberedValue(value$iv);
    L44:
        ComposerKt.sourceInformationMarkerEnd($composer);
        SwipeToDismissBoxState r13 = (SwipeToDismissBoxState) RememberSaveableKt.m3923rememberSaveable(r3, r5, null, (Function0) value$iv, $composer, 0, 4);
        if (ComposerKt.isTraceInProgress() == false) goto L47;
        ComposerKt.traceEventEnd();
    L47:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r13;
    L40:
        if (it$iv == Composer.Companion.getEmpty()) goto L43;
        value$iv = it$iv;
    L35:
        if (($changed & 384) != 256) goto L37;
    L27:
        if (($changed & 48) == 32) goto L28;
        r6 = false;
    L19:
        if (($changed & 6) == 4) goto L20;
        r1 = false;
        goto L22
    }

    public static final void SwipeToDismissBox(final SwipeToDismissBoxState state, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r56, Modifier modifier, boolean enableDismissFromStartToEnd, boolean enableDismissFromEndToStart, boolean gesturesEnabled, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r61, Composer $composer, final int $changed, final int r64) {
        Composer $composer2 = $composer.startRestartGroup(-402577235);
        ComposerKt.sourceInformation($composer2, "C(SwipeToDismissBox)P(6!1,5,3,2,4)225@9211L7,227@9247L1205:SwipeToDismissBox.kt#uh7d8r");
        int $dirty = $changed;
        if ((r64 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r64 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L22:
        int r4 = r64 & 4;
        if (r4 == 0) goto L26;
        $dirty = $dirty | 384;
        Modifier r6 = modifier;
    L33:
        int r9 = r64 & 8;
        if (r9 == 0) goto L37;
        $dirty = $dirty | 3072;
        final boolean enableDismissFromStartToEnd2 = enableDismissFromStartToEnd;
    L44:
        int r13 = r64 & 16;
        if (r13 == 0) goto L48;
        $dirty = $dirty | 24576;
        final boolean enableDismissFromEndToStart2 = enableDismissFromEndToStart;
    L55:
        int r15 = r64 & 32;
        if (r15 == 0) goto L59;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        boolean r5 = gesturesEnabled;
    L67:
        if ((r64 & 64) == 0) goto L71;
        int r16 = 1572864;
    L69:
        $dirty = $dirty | r16;
    L77:
        if (($dirty & 599187) == 599186) goto L79;
    L82:
        if (r4 == 0) goto L84;
        Modifier modifier2 = Modifier.Companion;
    L85:
        if (r9 == 0) goto L87;
        enableDismissFromStartToEnd2 = true;
    L87:
        if (r13 == 0) goto L89;
        enableDismissFromEndToStart2 = true;
    L89:
        if (r15 == 0) goto L91;
        boolean gesturesEnabled2 = true;
    L93:
        if (ComposerKt.isTraceInProgress() == false) goto L95;
        ComposerKt.traceEventStart(-402577235, $dirty, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:224)");
    L95:
        ProvidableCompositionLocal<LayoutDirection> r7 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r10 = $composer2.consume(r7);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (r10 != LayoutDirection.Rtl) goto L98;
        final boolean isRtl = true;
    L99:
        AnchoredDraggableState<SwipeToDismissBoxValue> r19 = state.getAnchoredDraggableState$material3_release();
        Orientation r20 = Orientation.Horizontal;
        if (gesturesEnabled2 == true) goto L102;
    L104:
        boolean r21 = false;
    L105:
        Modifier modifier$iv = AnchoredDraggableKt.anchoredDraggable$default(modifier2, r19, r20, r21, false, null, 24, null);
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, true);
        int $changed$iv$iv = (384 << 3) & 112;
        boolean gesturesEnabled3 = gesturesEnabled2;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r22 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L108;
        ComposablesKt.invalidApplier();
    L108:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L111;
        Function0<ComposeUiNode> r11 = r22;
        $composer2.createNode(r11);
    L112:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r14 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L119;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L119;
    L120:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r0 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        int r17 = ((384 >> 6) & 112) | 6;
        BoxScope $this$SwipeToDismissBox_u24lambda_u242 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, -586717200, "C235@9549L71,239@9784L652,236@9629L817:SwipeToDismissBox.kt#uh7d8r");
        Modifier r8 = $this$SwipeToDismissBox_u24lambda_u242.matchParentSize(Modifier.Companion);
        int $changed$iv = ($dirty << 6) & 7168;
        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
        Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
        Alignment.Vertical verticalAlignment$iv = Alignment.Companion.getTop();
        MeasurePolicy measurePolicy$iv2 = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer2, (($changed$iv >> 3) & 14) | (($changed$iv >> 3) & 112));
        int $changed$iv$iv2 = ($changed$iv << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv2 = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer2, r8);
        Function0<ComposeUiNode> r44 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L123;
        ComposablesKt.invalidApplier();
    L123:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L126;
        Function0<ComposeUiNode> r12 = r44;
        $composer2.createNode(r12);
    L127:
        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r18 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv2.getInserting() == true) goto L134;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv2.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv2)) == false) goto L134;
    L135:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
        int r1 = ($changed$iv$iv$iv2 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -407918630, "C100@5047L9:Row.kt#2w3rfo");
        r56.invoke(RowScopeInstance.INSTANCE, $composer2, Integer.valueOf((($changed$iv >> 6) & 112) | 6));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier.Companion r2 = Modifier.Companion;
        AnchoredDraggableState<SwipeToDismissBoxValue> r23 = state.getAnchoredDraggableState$material3_release();
        Orientation r24 = Orientation.Horizontal;
        ComposerKt.sourceInformationMarkerStart($composer2, 396722910, "CC(remember):SwipeToDismissBox.kt#9igjgp");
        if (($dirty & 7168) != 2048) goto L138;
        boolean r110 = true;
    L139:
        boolean r111 = r110 | $composer2.changed(isRtl);
        if ((57344 & $dirty) != 16384) goto L142;
        boolean r3 = true;
    L143:
        boolean r25 = r3 | r111;
        if (($dirty & 14) != 4) goto L146;
        boolean r112 = true;
    L147:
        boolean invalid$iv = r25 | r112;
        Object value$iv = $composer2.rememberedValue();
        if (invalid$iv == true) goto L153;
        int $dirty2 = $dirty;
        if (value$iv != Composer.Companion.getEmpty()) goto L155;
    L154:
        value$iv = (Function2) new SwipeToDismissBoxKt$SwipeToDismissBox$1$1$1(state, enableDismissFromStartToEnd2, isRtl, enableDismissFromEndToStart2);
        $composer2.updateRememberedValue(value$iv);
    L155:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r26 = AnchoredDraggableKt.draggableAnchors(r2, r23, r24, (Function2) value$iv);
        int $changed$iv2 = ($dirty2 >> 9) & 7168;
        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
        Arrangement.Horizontal horizontalArrangement$iv2 = Arrangement.INSTANCE.getStart();
        Alignment.Vertical verticalAlignment$iv2 = Alignment.Companion.getTop();
        MeasurePolicy measurePolicy$iv3 = RowKt.rowMeasurePolicy(horizontalArrangement$iv2, verticalAlignment$iv2, $composer2, (($changed$iv2 >> 3) & 14) | (($changed$iv2 >> 3) & 112));
        int $changed$iv$iv3 = ($changed$iv2 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv3 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv3 = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer2, r26);
        Function0<ComposeUiNode> r27 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv3 = (($changed$iv$iv3 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L158;
        ComposablesKt.invalidApplier();
    L158:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L161;
        Function0<ComposeUiNode> r28 = r27;
        $composer2.createNode(r28);
    L162:
        Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r29 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv3.getInserting() == true) goto L168;
        int $changed$iv3 = $changed$iv2;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv3.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv3)) == true) goto L170;
    L169:
        $this$Layout_u24lambda_u240$iv$iv3.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv3));
        $this$Layout_u24lambda_u240$iv$iv3.apply(Integer.valueOf(compositeKeyHash$iv$iv3), r29);
    L170:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.Companion.getSetModifier());
        int r30 = ($changed$iv$iv$iv3 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -407918630, "C100@5047L9:Row.kt#2w3rfo");
        r61.invoke(RowScopeInstance.INSTANCE, $composer2, Integer.valueOf((($changed$iv3 >> 6) & 112) | 6));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L173;
        ComposerKt.traceEventEnd();
    L173:
        final boolean gesturesEnabled4 = gesturesEnabled3;
        final Modifier modifier3 = modifier2;
        final boolean enableDismissFromStartToEnd3 = enableDismissFromStartToEnd2;
        final boolean enableDismissFromEndToStart3 = enableDismissFromEndToStart2;
    L174:
        ScopeUpdateScope r113 = $composer2.endRestartGroup();
        if (r113 == null) goto L178;
        r113.updateScope(new AnonymousClass2(state, r56, modifier3, enableDismissFromStartToEnd3, enableDismissFromEndToStart3, gesturesEnabled4, r61, $changed, r64));
        return;
    L178:
        return;
    L168:
        $changed$iv3 = $changed$iv2;
        goto L169
    L161:
        r28 = r27;
        $composer2.useNode();
        goto L162
    L153:
        $dirty2 = $dirty;
        goto L154
    L146:
        r112 = false;
        goto L147
    L142:
        r3 = false;
        goto L143
    L138:
        r110 = false;
    L134:
        $this$Layout_u24lambda_u240$iv$iv2.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv2));
        $this$Layout_u24lambda_u240$iv$iv2.apply(Integer.valueOf(compositeKeyHash$iv$iv2), r18);
        goto L135
    L126:
        r12 = r44;
        $composer2.useNode();
    L119:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r14);
        goto L120
    L111:
        r11 = r22;
        $composer2.useNode();
        goto L112
    L102:
        if (state.getCurrentValue() != SwipeToDismissBoxValue.Settled) goto L104;
        r21 = true;
        goto L105
    L98:
        isRtl = false;
        goto L99
    L91:
        gesturesEnabled2 = r5;
        goto L93
    L84:
        modifier2 = r6;
        goto L85
    L79:
        if ($composer2.getSkipping() == false) goto L82;
        $composer2.skipToGroupEnd();
        $dirty2 = $dirty;
        modifier3 = r6;
        gesturesEnabled4 = r5;
        enableDismissFromStartToEnd3 = enableDismissFromStartToEnd2;
        enableDismissFromEndToStart3 = enableDismissFromEndToStart2;
        goto L174
    L71:
        if (($changed & 1572864) != 0) goto L77;
        if ($composer2.changedInstance(r61) == false) goto L75;
        r16 = 1048576;
        goto L69
    L75:
        r16 = 524288;
        goto L69
    L59:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L65;
        r5 = gesturesEnabled;
        if ($composer2.changed(r5) == false) goto L63;
        int r114 = 131072;
    L64:
        $dirty = $dirty | r114;
        goto L67
    L63:
        r114 = 65536;
        goto L64
    L65:
        r5 = gesturesEnabled;
        goto L67
    L48:
        if (($changed & 24576) != 0) goto L54;
        enableDismissFromEndToStart2 = enableDismissFromEndToStart;
        if ($composer2.changed(enableDismissFromEndToStart2) == false) goto L52;
        int r115 = 16384;
    L53:
        $dirty = $dirty | r115;
        goto L55
    L52:
        r115 = 8192;
        goto L53
    L54:
        enableDismissFromEndToStart2 = enableDismissFromEndToStart;
        goto L55
    L37:
        if (($changed & 3072) != 0) goto L43;
        enableDismissFromStartToEnd2 = enableDismissFromStartToEnd;
        if ($composer2.changed(enableDismissFromStartToEnd2) == false) goto L41;
        int r116 = 2048;
    L42:
        $dirty = $dirty | r116;
        goto L44
    L41:
        r116 = 1024;
        goto L42
    L43:
        enableDismissFromStartToEnd2 = enableDismissFromStartToEnd;
        goto L44
    L26:
        if (($changed & 384) != 0) goto L32;
        r6 = modifier;
        if ($composer2.changed(r6) == false) goto L30;
        int r31 = 256;
    L31:
        $dirty = $dirty | r31;
        goto L33
    L30:
        r31 = 128;
        goto L31
    L32:
        r6 = modifier;
        goto L33
    L16:
        if (($changed & 48) != 0) goto L22;
        if ($composer2.changedInstance(r56) == false) goto L20;
        int r32 = 32;
    L21:
        $dirty = $dirty | r32;
        goto L22
    L20:
        r32 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(state) == false) goto L10;
        int r33 = 4;
    L11:
        $dirty = $dirty | r33;
        goto L13
    L10:
        r33 = 2;
        goto L11
    }

    static {
        DismissVelocityThreshold = Dp.m6973constructorimpl(125);
    }
}
