package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class AppBarKt$TwoRowsTopAppBar$6 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function2<Composer, Integer, Unit> $actionsRow;
    final /* synthetic */ float $bottomTitleAlpha;
    final /* synthetic */ float $collapsedHeight;
    final /* synthetic */ TopAppBarColors $colors;
    final /* synthetic */ float $expandedHeight;
    final /* synthetic */ boolean $hideBottomRowSemantics;
    final /* synthetic */ boolean $hideTopRowSemantics;
    final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
    final /* synthetic */ Function2<Composer, Integer, Unit> $smallTitle;
    final /* synthetic */ TextStyle $smallTitleTextStyle;
    final /* synthetic */ Function2<Composer, Integer, Unit> $title;
    final /* synthetic */ Ref.IntRef $titleBottomPaddingPx;
    final /* synthetic */ TextStyle $titleTextStyle;
    final /* synthetic */ float $topTitleAlpha;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX WARN: Multi-variable type inference failed */
    AppBarKt$TwoRowsTopAppBar$6(WindowInsets r17, float r18, TopAppBarColors r19, Function2<? super Composer, ? super Integer, Unit> r20, TextStyle r21, float r22, boolean r23, Function2<? super Composer, ? super Integer, Unit> r24, Function2<? super Composer, ? super Integer, Unit> r25, float r26, TopAppBarScrollBehavior r27, Function2<? super Composer, ? super Integer, Unit> r28, TextStyle r29, float r30, Ref.IntRef r31, boolean r32) {
        this.$windowInsets = r17;
        this.$collapsedHeight = r18;
        this.$colors = r19;
        this.$smallTitle = r20;
        this.$smallTitleTextStyle = r21;
        this.$topTitleAlpha = r22;
        this.$hideTopRowSemantics = r23;
        this.$navigationIcon = r24;
        this.$actionsRow = r25;
        this.$expandedHeight = r26;
        this.$scrollBehavior = r27;
        this.$title = r28;
        this.$titleTextStyle = r29;
        this.$bottomTitleAlpha = r30;
        this.$titleBottomPaddingPx = r31;
        this.$hideBottomRowSemantics = r32;
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer r3, Integer r4) {
        invoke(r3, r4.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C2043@93243L2293:AppBar.kt#uh7d8r");
        if (($changed & 3) != 2) goto L9;
        if ($composer.getSkipping() == false) goto L9;
        $composer.skipToGroupEnd();
        return;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(-1350062619, $changed, -1, "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:2043)");
    L11:
        WindowInsets r3 = this.$windowInsets;
        float r4 = this.$collapsedHeight;
        TopAppBarColors r5 = this.$colors;
        Function2<Composer, Integer, Unit> r14 = this.$smallTitle;
        TextStyle r15 = this.$smallTitleTextStyle;
        float r6 = this.$topTitleAlpha;
        boolean r7 = this.$hideTopRowSemantics;
        Function2<Composer, Integer, Unit> r8 = this.$navigationIcon;
        Function2<Composer, Integer, Unit> r9 = this.$actionsRow;
        float r10 = this.$expandedHeight;
        final TopAppBarScrollBehavior r11 = this.$scrollBehavior;
        Function2<Composer, Integer, Unit> r12 = this.$title;
        TextStyle r13 = this.$titleTextStyle;
        float r2 = this.$bottomTitleAlpha;
        Ref.IntRef r16 = this.$titleBottomPaddingPx;
        boolean r17 = this.$hideBottomRowSemantics;
        ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
        Modifier modifier$iv = Modifier.Companion;
        Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
        Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getStart();
        MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
        int $changed$iv$iv = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
        CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv);
        Function0<ComposeUiNode> r18 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer.getApplier() instanceof Applier) == true) goto L14;
        ComposablesKt.invalidApplier();
    L14:
        $composer.startReusableNode();
        if ($composer.getInserting() == false) goto L17;
        Function0<ComposeUiNode> r0 = r18;
        $composer.createNode(r0);
    L18:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r1 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L25;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L25;
    L26:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r19 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer, -384862393, "C87@4365L9:Column.kt#2w3rfo");
        ColumnScopeInstance r20 = ColumnScopeInstance.INSTANCE;
        int r49 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, 251887626, "C2044@93264L1012,2073@94812L45,2064@94289L1237:AppBar.kt#uh7d8r");
        AppBarKt.m1905access$TopAppBarLayoutkXwM9vE(SizeKt.m760heightInVpY3zN4$default(ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(Modifier.Companion, r3)), 0.0f, r4, 1, null), new AppBarKt$TwoRowsTopAppBar$6$$ExternalSyntheticLambda0(), r5.m2980getNavigationIconContentColor0d7_KjU(), r5.m2982getTitleContentColor0d7_KjU(), r5.m2978getActionIconContentColor0d7_KjU(), r14, r15, r6, Arrangement.INSTANCE.getCenter(), Arrangement.INSTANCE.getStart(), 0, r7, r8, r9, $composer, 905969712, 3078);
        Modifier r110 = SizeKt.m760heightInVpY3zN4$default(ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(Modifier.Companion, WindowInsetsKt.m798onlybOOhFvg(r3, WindowInsetsSides.Companion.m820getHorizontalJoeWqyM()))), 0.0f, Dp.m6973constructorimpl(r10 - r4), 1, null);
        ComposerKt.sourceInformationMarkerStart($composer, 1947835376, "CC(remember):AppBar.kt#9igjgp");
        boolean invalid$iv = $composer.changed(r11);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L29;
    L32:
        Object value$iv = new AppBarKt$TwoRowsTopAppBar$6$$ExternalSyntheticLambda1(r11);
        $composer.updateRememberedValue(value$iv);
    L33:
        ComposerKt.sourceInformationMarkerEnd($composer);
        AppBarKt.m1905access$TopAppBarLayoutkXwM9vE(r110, (ScrolledOffset) value$iv, r5.m2980getNavigationIconContentColor0d7_KjU(), r5.m2982getTitleContentColor0d7_KjU(), r5.m2978getActionIconContentColor0d7_KjU(), r12, r13, r2, Arrangement.INSTANCE.getBottom(), Arrangement.INSTANCE.getStart(), r16.element, r17, ComposableSingletons$AppBarKt.INSTANCE.m2075getLambda17$material3_release(), ComposableSingletons$AppBarKt.INSTANCE.m2076getLambda18$material3_release(), $composer, 905969664, 3456);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        $composer.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L38;
        ComposerKt.traceEventEnd();
        return;
    L38:
        return;
    L29:
        if (it$iv == Composer.Companion.getEmpty()) goto L32;
        value$iv = it$iv;
    L25:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r1);
        goto L26
    L17:
        r0 = r18;
        $composer.useNode();
        goto L18
    }

    static final float invoke$lambda$3$lambda$0() {
        return 0.0f;
    }

    static final float invoke$lambda$3$lambda$2$lambda$1(TopAppBarScrollBehavior $scrollBehavior) {
        if ($scrollBehavior == null) goto L6;
        TopAppBarState r0 = $scrollBehavior.getState();
        if (r0 == null) goto L6;
        return r0.getHeightOffset();
    L6:
        return 0.0f;
    }
}
