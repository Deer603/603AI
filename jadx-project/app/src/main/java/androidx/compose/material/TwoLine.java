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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ListItem.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J~\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00140\u0018¢\u0006\u0002\b\u00192\u0013\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0013\u0010\u001c\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0013\u0010\u001d\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0002\u0010\u001eR\u0016\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\b\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\t\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\n\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u000b\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\f\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\r\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u000e\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u000f\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0010\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0011\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0012\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/material/TwoLine;", "", "()V", "ContentLeftPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ContentRightPadding", "IconLeftPadding", "IconMinPaddedWidth", "IconVerticalPadding", "MinHeight", "MinHeightWithIcon", "OverlineBaselineOffset", "OverlineToPrimaryBaselineOffset", "PrimaryBaselineOffsetNoIcon", "PrimaryBaselineOffsetWithIcon", "PrimaryToSecondaryBaselineOffsetNoIcon", "PrimaryToSecondaryBaselineOffsetWithIcon", "TrailingRightPadding", "ListItem", "", "modifier", "Landroidx/compose/ui/Modifier;", "icon", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "text", "secondaryText", "overlineText", "trailing", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class TwoLine {
    private static final float ContentLeftPadding = 0.0f;
    private static final float ContentRightPadding = 0.0f;
    public static final TwoLine INSTANCE = null;
    private static final float IconLeftPadding = 0.0f;
    private static final float IconMinPaddedWidth = 0.0f;
    private static final float IconVerticalPadding = 0.0f;
    private static final float MinHeight = 0.0f;
    private static final float MinHeightWithIcon = 0.0f;
    private static final float OverlineBaselineOffset = 0.0f;
    private static final float OverlineToPrimaryBaselineOffset = 0.0f;
    private static final float PrimaryBaselineOffsetNoIcon = 0.0f;
    private static final float PrimaryBaselineOffsetWithIcon = 0.0f;
    private static final float PrimaryToSecondaryBaselineOffsetNoIcon = 0.0f;
    private static final float PrimaryToSecondaryBaselineOffsetWithIcon = 0.0f;
    private static final float TrailingRightPadding = 0.0f;

    private TwoLine() {
    }

    public static final /* synthetic */ float access$getTrailingRightPadding$p() {
        return TrailingRightPadding;
    }

    static {
        INSTANCE = new TwoLine();
        MinHeight = Dp.m6973constructorimpl(64);
        MinHeightWithIcon = Dp.m6973constructorimpl(72);
        IconMinPaddedWidth = Dp.m6973constructorimpl(40);
        IconLeftPadding = Dp.m6973constructorimpl(16);
        IconVerticalPadding = Dp.m6973constructorimpl(16);
        ContentLeftPadding = Dp.m6973constructorimpl(16);
        ContentRightPadding = Dp.m6973constructorimpl(16);
        OverlineBaselineOffset = Dp.m6973constructorimpl(24);
        OverlineToPrimaryBaselineOffset = Dp.m6973constructorimpl(20);
        PrimaryBaselineOffsetNoIcon = Dp.m6973constructorimpl(28);
        PrimaryBaselineOffsetWithIcon = Dp.m6973constructorimpl(32);
        PrimaryToSecondaryBaselineOffsetNoIcon = Dp.m6973constructorimpl(20);
        PrimaryToSecondaryBaselineOffsetWithIcon = Dp.m6973constructorimpl(20);
        TrailingRightPadding = Dp.m6973constructorimpl(16);
    }

    public final void ListItem(Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> r58, final Function2<? super Composer, ? super Integer, Unit> r59, final Function2<? super Composer, ? super Integer, Unit> r60, final Function2<? super Composer, ? super Integer, Unit> r61, final Function2<? super Composer, ? super Integer, Unit> r62, Composer $composer, final int $changed, final int r65) {
        Composer $composer2 = $composer.startRestartGroup(-1340612993);
        ComposerKt.sourceInformation($composer2, "C(ListItem)P(1!1,4,3)217@7945L2493:ListItem.kt#jmzs0o");
        int $dirty = $changed;
        int r2 = r65 & 1;
        if (r2 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier modifier2 = modifier;
    L14:
        if ((r65 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L24:
        if ((r65 & 4) == 0) goto L27;
        $dirty = $dirty | 384;
    L34:
        if ((r65 & 8) == 0) goto L37;
        $dirty = $dirty | 3072;
    L44:
        if ((r65 & 16) == 0) goto L47;
        $dirty = $dirty | 24576;
    L54:
        if ((r65 & 32) == 0) goto L57;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L64:
        if ((r65 & 64) == 0) goto L67;
        $dirty = $dirty | 1572864;
        TwoLine r12 = this;
    L74:
        int $dirty2 = $dirty;
        if ((599187 & $dirty2) == 599186) goto L77;
        boolean r1 = true;
    L79:
        if ($composer2.shouldExecute(r1, $dirty2 & 1) == false) goto L145;
        if (r2 == 0) goto L83;
        modifier2 = Modifier.Companion;
    L83:
        if (ComposerKt.isTraceInProgress() == false) goto L85;
        ComposerKt.traceEventStart(-1340612993, $dirty2, -1, "androidx.compose.material.TwoLine.ListItem (ListItem.kt:215)");
    L85:
        if (r58 != null) goto L87;
        float minHeight = MinHeight;
    L88:
        Modifier modifier$iv = SizeKt.m760heightInVpY3zN4$default(modifier2, minHeight, 0.0f, 2, null);
        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
        Alignment.Vertical verticalAlignment$iv = Alignment.Companion.getTop();
        final float minHeight2 = minHeight;
        MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
        int $changed$iv$iv = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r16 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        Modifier modifier3 = modifier2;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L91;
        ComposablesKt.invalidApplier();
    L91:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L94;
        Function0<ComposeUiNode> r11 = r16;
        $composer2.createNode(r11);
    L95:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Composer $composer3 = $composer2;
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r10 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L102;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L102;
    L103:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r0 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
        int r13 = ((0 >> 6) & 112) | 6;
        RowScope $this$ListItem_u24lambda_u241 = RowScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer3, -1767123230, "C:ListItem.kt#jmzs0o");
        Modifier columnModifier = PaddingKt.m729paddingqDBjuR0$default(RowScope.weight$default($this$ListItem_u24lambda_u241, Modifier.Companion, 1.0f, false, 2, null), ContentLeftPadding, 0.0f, ContentRightPadding, 0.0f, 10, null);
        if (r58 == null) goto L121;
        $composer3.startReplaceGroup(-1767030913);
        ComposerKt.sourceInformation($composer3, "222@8168L543");
        Modifier.Companion r17 = Modifier.Companion;
        float arg0$iv = IconLeftPadding;
        float other$iv = IconMinPaddedWidth;
        Modifier modifier$iv2 = PaddingKt.m729paddingqDBjuR0$default(SizeKt.m776sizeInqDBjuR0$default(r17, Dp.m6973constructorimpl(arg0$iv + other$iv), minHeight2, 0.0f, 0.0f, 12, null), IconLeftPadding, IconVerticalPadding, 0.0f, IconVerticalPadding, 4, null);
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv2 = (48 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv2 = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer3, modifier$iv2);
        Function0<ComposeUiNode> r41 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L108;
        ComposablesKt.invalidApplier();
    L108:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L111;
        Function0<ComposeUiNode> r3 = r41;
        $composer3.createNode(r3);
    L112:
        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv2.getInserting() == true) goto L119;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv2.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv2)) == false) goto L119;
    L120:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
        int r5 = ($changed$iv$iv$iv2 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r6 = BoxScopeInstance.INSTANCE;
        int r14 = ((48 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, 1547833178, "C234@8687L6:ListItem.kt#jmzs0o");
        r58.invoke($composer3, Integer.valueOf(($dirty2 >> 3) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endReplaceGroup();
    L123:
        if (r61 == null) goto L125;
        $composer3.startReplaceGroup(-1766430164);
        ComposerKt.sourceInformation($composer3, "242@8944L81,239@8783L242");
        ListItemKt.access$BaselinesOffsetColumn(CollectionsKt.listOf(new Dp[]{Dp.m6971boximpl(OverlineBaselineOffset), Dp.m6971boximpl(OverlineToPrimaryBaselineOffset)}), columnModifier, ComposableLambdaKt.rememberComposableLambda(-1675021441, true, new TwoLine$ListItem$1$2(r61, r59), $composer3, 54), $composer3, 390, 0);
        $composer3.endReplaceGroup();
    L134:
        if (r62 == null) goto L140;
        $composer3.startReplaceGroup(-1765411690);
        ComposerKt.sourceInformation($composer3, "273@10039L375,267@9798L616");
        if (r58 == null) goto L138;
        float r39 = PrimaryBaselineOffsetWithIcon;
    L139:
        ListItemKt.m1693access$OffsetToBaselineOrCenterKz89ssw(r39, null, ComposableLambdaKt.rememberComposableLambda(-1696992176, true, new TwoLine$ListItem$1$4(minHeight2, r62), $composer3, 54), $composer3, 384, 2);
        $composer3.endReplaceGroup();
    L141:
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L144;
        ComposerKt.traceEventEnd();
    L144:
        final Modifier modifier4 = modifier3;
    L146:
        ScopeUpdateScope r15 = $composer3.endRestartGroup();
        if (r15 == null) goto L150;
        final TwoLine r7 = r12;
        r15.updateScope(new AnonymousClass2(r7, modifier4, r58, r59, r60, r61, r62, $changed, r65));
        return;
    L150:
        return;
    L138:
        r39 = PrimaryBaselineOffsetNoIcon;
        goto L139
    L140:
        $composer3.startReplaceGroup(-1764788962);
        $composer3.endReplaceGroup();
        goto L141
    L125:
        $composer3.startReplaceGroup(-1766139198);
        ComposerKt.sourceInformation($composer3, "261@9647L84,247@9063L668");
        Dp[] r8 = new Dp[2];
        if (r58 == null) goto L128;
        float r9 = PrimaryBaselineOffsetWithIcon;
    L129:
        r8[0] = Dp.m6971boximpl(r9);
        if (r58 == null) goto L132;
        float r18 = PrimaryToSecondaryBaselineOffsetWithIcon;
    L133:
        r8[1] = Dp.m6971boximpl(r18);
        ListItemKt.access$BaselinesOffsetColumn(CollectionsKt.listOf(r8), columnModifier, ComposableLambdaKt.rememberComposableLambda(993836488, true, new TwoLine$ListItem$1$3(r59, r60), $composer3, 54), $composer3, 384, 0);
        $composer3.endReplaceGroup();
        goto L134
    L132:
        r18 = PrimaryToSecondaryBaselineOffsetNoIcon;
        goto L133
    L128:
        r9 = PrimaryBaselineOffsetNoIcon;
    L119:
        $this$Layout_u24lambda_u240$iv$iv2.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv2));
        $this$Layout_u24lambda_u240$iv$iv2.apply(Integer.valueOf(compositeKeyHash$iv$iv2), r4);
        goto L120
    L111:
        r3 = r41;
        $composer3.useNode();
        goto L112
    L121:
        $composer3.startReplaceGroup(-1766478338);
        $composer3.endReplaceGroup();
    L102:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r10);
        goto L103
    L94:
        r11 = r16;
        $composer2.useNode();
        goto L95
    L87:
        minHeight = MinHeightWithIcon;
        goto L88
    L145:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        modifier4 = modifier2;
        goto L146
    L77:
        r1 = false;
        goto L79
    L67:
        if (($changed & 1572864) != 0) goto L73;
        r12 = this;
        if ($composer2.changed(r12) == false) goto L71;
        int r19 = 1048576;
    L72:
        $dirty = $dirty | r19;
        goto L74
    L71:
        r19 = 524288;
        goto L72
    L73:
        r12 = this;
        goto L74
    L57:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L64;
        if ($composer2.changedInstance(r62) == false) goto L61;
        int r110 = 131072;
    L62:
        $dirty = $dirty | r110;
        goto L64
    L61:
        r110 = 65536;
        goto L62
    L47:
        if (($changed & 24576) != 0) goto L54;
        if ($composer2.changedInstance(r61) == false) goto L51;
        int r111 = 16384;
    L52:
        $dirty = $dirty | r111;
        goto L54
    L51:
        r111 = 8192;
        goto L52
    L37:
        if (($changed & 3072) != 0) goto L44;
        if ($composer2.changedInstance(r60) == false) goto L41;
        int r112 = 2048;
    L42:
        $dirty = $dirty | r112;
        goto L44
    L41:
        r112 = 1024;
        goto L42
    L27:
        if (($changed & 384) != 0) goto L34;
        if ($composer2.changedInstance(r59) == false) goto L31;
        int r113 = 256;
    L32:
        $dirty = $dirty | r113;
        goto L34
    L31:
        r113 = 128;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changedInstance(r58) == false) goto L21;
        int r114 = 32;
    L22:
        $dirty = $dirty | r114;
        goto L24
    L21:
        r114 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L12;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L10;
        int r115 = 4;
    L11:
        $dirty = $dirty | r115;
        goto L14
    L10:
        r115 = 2;
        goto L11
    L12:
        modifier2 = modifier;
        goto L14
    }
}
