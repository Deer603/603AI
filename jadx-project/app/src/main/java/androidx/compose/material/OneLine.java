package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ListItem.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JT\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0013\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012¢\u0006\u0002\b\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u000e0\u0012¢\u0006\u0002\b\u00132\u0013\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u0016R\u0016\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\b\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\t\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\n\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u000b\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\f\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/material/OneLine;", "", "()V", "ContentLeftPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ContentRightPadding", "IconLeftPadding", "IconMinPaddedWidth", "IconVerticalPadding", "MinHeight", "MinHeightWithIcon", "TrailingRightPadding", "ListItem", "", "modifier", "Landroidx/compose/ui/Modifier;", "icon", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "text", "trailing", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class OneLine {
    private static final float ContentLeftPadding = 0.0f;
    private static final float ContentRightPadding = 0.0f;
    public static final OneLine INSTANCE = null;
    private static final float IconLeftPadding = 0.0f;
    private static final float IconMinPaddedWidth = 0.0f;
    private static final float IconVerticalPadding = 0.0f;
    private static final float MinHeight = 0.0f;
    private static final float MinHeightWithIcon = 0.0f;
    private static final float TrailingRightPadding = 0.0f;

    private OneLine() {
    }

    static {
        INSTANCE = new OneLine();
        MinHeight = Dp.m6973constructorimpl(48);
        MinHeightWithIcon = Dp.m6973constructorimpl(56);
        IconMinPaddedWidth = Dp.m6973constructorimpl(40);
        IconLeftPadding = Dp.m6973constructorimpl(16);
        IconVerticalPadding = Dp.m6973constructorimpl(8);
        ContentLeftPadding = Dp.m6973constructorimpl(16);
        ContentRightPadding = Dp.m6973constructorimpl(16);
        TrailingRightPadding = Dp.m6973constructorimpl(16);
    }

    public final void ListItem(Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> r62, final Function2<? super Composer, ? super Integer, Unit> r63, final Function2<? super Composer, ? super Integer, Unit> r64, Composer $composer, final int $changed, final int r67) {
        Composer $composer2 = $composer.startRestartGroup(-1884451315);
        ComposerKt.sourceInformation($composer2, "C(ListItem)P(1)150@5562L1152:ListItem.kt#jmzs0o");
        int $dirty = $changed;
        int r2 = r67 & 1;
        if (r2 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier modifier2 = modifier;
    L14:
        if ((r67 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L24:
        if ((r67 & 4) == 0) goto L27;
        $dirty = $dirty | 384;
    L34:
        if ((r67 & 8) == 0) goto L37;
        $dirty = $dirty | 3072;
    L44:
        if ((r67 & 16) == 0) goto L47;
        $dirty = $dirty | 24576;
    L54:
        int $dirty2 = $dirty;
        if (($dirty2 & 9363) == 9362) goto L57;
        boolean r1 = true;
    L59:
        if ($composer2.shouldExecute(r1, $dirty2 & 1) == false) goto L140;
        if (r2 == 0) goto L63;
        modifier2 = Modifier.Companion;
    L63:
        if (ComposerKt.isTraceInProgress() == false) goto L65;
        ComposerKt.traceEventStart(-1884451315, $dirty2, -1, "androidx.compose.material.OneLine.ListItem (ListItem.kt:148)");
    L65:
        if (r62 != null) goto L67;
        float minHeight = MinHeight;
    L68:
        Modifier modifier$iv = SizeKt.m760heightInVpY3zN4$default(modifier2, minHeight, 0.0f, 2, null);
        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
        Alignment.Vertical verticalAlignment$iv = Alignment.Companion.getTop();
        MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
        int $changed$iv$iv = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r22 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L71;
        ComposablesKt.invalidApplier();
    L71:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L74;
        Function0<ComposeUiNode> r3 = r22;
        $composer2.createNode(r3);
    L75:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Composer $composer3 = $composer2;
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r8 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L81;
        Modifier modifier3 = modifier2;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == true) goto L83;
    L82:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r8);
    L83:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r4 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
        int r9 = ((0 >> 6) & 112) | 6;
        RowScope $this$ListItem_u24lambda_u243 = RowScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer3, -1966455943, "C165@6175L290:ListItem.kt#jmzs0o");
        if (r62 == null) goto L101;
        $composer3.startReplaceGroup(-1966455448);
        ComposerKt.sourceInformation($composer3, "152@5652L496");
        Modifier r10 = $this$ListItem_u24lambda_u243.align(Modifier.Companion, Alignment.Companion.getCenterVertically());
        float arg0$iv = IconLeftPadding;
        float other$iv = IconMinPaddedWidth;
        int $dirty3 = $dirty2;
        Modifier modifier$iv2 = PaddingKt.m729paddingqDBjuR0$default(SizeKt.m779widthInVpY3zN4$default(r10, Dp.m6973constructorimpl(arg0$iv + other$iv), 0.0f, 2, null), IconLeftPadding, IconVerticalPadding, 0.0f, IconVerticalPadding, 4, null);
        Alignment contentAlignment$iv = Alignment.Companion.getCenterStart();
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv2 = (48 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv2 = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer3, modifier$iv2);
        Function0<ComposeUiNode> r47 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L88;
        ComposablesKt.invalidApplier();
    L88:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L91;
        Function0<ComposeUiNode> r5 = r47;
        $composer3.createNode(r5);
    L92:
        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r12 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv2.getInserting() == true) goto L99;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv2.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv2)) == false) goto L99;
    L100:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
        int r6 = ($changed$iv$iv$iv2 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r13 = BoxScopeInstance.INSTANCE;
        int r51 = ((48 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, 553881044, "C162@6124L6:ListItem.kt#jmzs0o");
        r62.invoke($composer3, Integer.valueOf(($dirty3 >> 3) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endReplaceGroup();
    L102:
        Modifier modifier$iv3 = PaddingKt.m729paddingqDBjuR0$default($this$ListItem_u24lambda_u243.align(RowScope.weight$default($this$ListItem_u24lambda_u243, Modifier.Companion, 1.0f, false, 2, null), Alignment.Companion.getCenterVertically()), ContentLeftPadding, 0.0f, ContentRightPadding, 0.0f, 10, null);
        Alignment contentAlignment$iv2 = Alignment.Companion.getCenterStart();
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv3 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv2, false);
        int $changed$iv$iv3 = (48 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv3 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv3 = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer3, modifier$iv3);
        Function0<ComposeUiNode> r38 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv3 = (($changed$iv$iv3 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L105;
        ComposablesKt.invalidApplier();
    L105:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L108;
        Function0<ComposeUiNode> r7 = r38;
        $composer3.createNode(r7);
    L109:
        Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r14 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv3.getInserting() == true) goto L116;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv3.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv3)) == false) goto L116;
    L117:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.Companion.getSetModifier());
        int r11 = ($changed$iv$iv$iv3 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r15 = BoxScopeInstance.INSTANCE;
        int r49 = ((48 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, 554199476, "C171@6445L6:ListItem.kt#jmzs0o");
        r63.invoke($composer3, Integer.valueOf(($dirty3 >> 6) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (r64 == null) goto L135;
        $composer3.startReplaceGroup(-1965606420);
        ComposerKt.sourceInformation($composer3, "174@6518L172");
        Modifier modifier$iv4 = PaddingKt.m729paddingqDBjuR0$default($this$ListItem_u24lambda_u243.align(Modifier.Companion, Alignment.Companion.getCenterVertically()), 0.0f, 0.0f, TrailingRightPadding, 0.0f, 11, null);
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv3 = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv4 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv3, false);
        int $changed$iv$iv4 = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv4 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv4 = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv4 = ComposedModifierKt.materializeModifier($composer3, modifier$iv4);
        Function0<ComposeUiNode> r19 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv4 = (($changed$iv$iv4 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L122;
        ComposablesKt.invalidApplier();
    L122:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L125;
        Function0<ComposeUiNode> r16 = r19;
        $composer3.createNode(r16);
    L126:
        Composer $this$Layout_u24lambda_u240$iv$iv4 = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv4, measurePolicy$iv4, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv4, localMap$iv$iv4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r17 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv4.getInserting() == true) goto L133;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv4.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv4)) == false) goto L133;
    L134:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv4, materialized$iv$iv4, ComposeUiNode.Companion.getSetModifier());
        int r18 = ($changed$iv$iv$iv4 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r20 = BoxScopeInstance.INSTANCE;
        int r21 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, 554414864, "C177@6662L10:ListItem.kt#jmzs0o");
        r64.invoke($composer3, Integer.valueOf(($dirty3 >> 9) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endReplaceGroup();
    L136:
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L139;
        ComposerKt.traceEventEnd();
    L139:
        final Modifier modifier4 = modifier3;
    L141:
        ScopeUpdateScope r23 = $composer3.endRestartGroup();
        if (r23 == null) goto L145;
        r23.updateScope(new AnonymousClass2(this, modifier4, r62, r63, r64, $changed, r67));
        return;
    L145:
        return;
    L133:
        $this$Layout_u24lambda_u240$iv$iv4.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv4));
        $this$Layout_u24lambda_u240$iv$iv4.apply(Integer.valueOf(compositeKeyHash$iv$iv4), r17);
        goto L134
    L125:
        r16 = r19;
        $composer3.useNode();
        goto L126
    L135:
        $composer3.startReplaceGroup(-1965410376);
        $composer3.endReplaceGroup();
    L116:
        $this$Layout_u24lambda_u240$iv$iv3.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv3));
        $this$Layout_u24lambda_u240$iv$iv3.apply(Integer.valueOf(compositeKeyHash$iv$iv3), r14);
        goto L117
    L108:
        r7 = r38;
        $composer3.useNode();
    L99:
        $this$Layout_u24lambda_u240$iv$iv2.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv2));
        $this$Layout_u24lambda_u240$iv$iv2.apply(Integer.valueOf(compositeKeyHash$iv$iv2), r12);
        goto L100
    L91:
        r5 = r47;
        $composer3.useNode();
        goto L92
    L101:
        $dirty3 = $dirty2;
        $composer3.startReplaceGroup(-1965948040);
        $composer3.endReplaceGroup();
        goto L102
    L81:
        modifier3 = modifier2;
        goto L82
    L74:
        r3 = r22;
        $composer2.useNode();
        goto L75
    L67:
        minHeight = MinHeightWithIcon;
        goto L68
    L140:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        modifier4 = modifier2;
        goto L141
    L57:
        r1 = false;
        goto L59
    L47:
        if (($changed & 24576) != 0) goto L54;
        if ($composer2.changed(this) == false) goto L51;
        int r110 = 16384;
    L52:
        $dirty = $dirty | r110;
        goto L54
    L51:
        r110 = 8192;
        goto L52
    L37:
        if (($changed & 3072) != 0) goto L44;
        if ($composer2.changedInstance(r64) == false) goto L41;
        int r111 = 2048;
    L42:
        $dirty = $dirty | r111;
        goto L44
    L41:
        r111 = 1024;
        goto L42
    L27:
        if (($changed & 384) != 0) goto L34;
        if ($composer2.changedInstance(r63) == false) goto L31;
        int r112 = 256;
    L32:
        $dirty = $dirty | r112;
        goto L34
    L31:
        r112 = 128;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changedInstance(r62) == false) goto L21;
        int r113 = 32;
    L22:
        $dirty = $dirty | r113;
        goto L24
    L21:
        r113 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L12;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L10;
        int r114 = 4;
    L11:
        $dirty = $dirty | r114;
        goto L14
    L10:
        r114 = 2;
        goto L11
    L12:
        modifier2 = modifier;
        goto L14
    }
}
