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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J|\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0013\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00110\u0015¢\u0006\u0002\b\u00162\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00110\u0015¢\u0006\u0002\b\u00162\u0013\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0013\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u001bR\u0016\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\b\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\t\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\n\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u000b\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\f\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\r\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u000e\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u000f\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/material/ThreeLine;", "", "()V", "ContentLeftPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ContentRightPadding", "IconLeftPadding", "IconMinPaddedWidth", "IconThreeLineVerticalPadding", "MinHeight", "ThreeLineBaselineFirstOffset", "ThreeLineBaselineSecondOffset", "ThreeLineBaselineThirdOffset", "ThreeLineTrailingTopPadding", "TrailingRightPadding", "ListItem", "", "modifier", "Landroidx/compose/ui/Modifier;", "icon", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "text", "secondaryText", "overlineText", "trailing", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ThreeLine {
    private static final float ContentLeftPadding = 0.0f;
    private static final float ContentRightPadding = 0.0f;
    public static final ThreeLine INSTANCE = null;
    private static final float IconLeftPadding = 0.0f;
    private static final float IconMinPaddedWidth = 0.0f;
    private static final float IconThreeLineVerticalPadding = 0.0f;
    private static final float MinHeight = 0.0f;
    private static final float ThreeLineBaselineFirstOffset = 0.0f;
    private static final float ThreeLineBaselineSecondOffset = 0.0f;
    private static final float ThreeLineBaselineThirdOffset = 0.0f;
    private static final float ThreeLineTrailingTopPadding = 0.0f;
    private static final float TrailingRightPadding = 0.0f;

    private ThreeLine() {
    }

    static {
        INSTANCE = new ThreeLine();
        MinHeight = Dp.m6973constructorimpl(88);
        IconMinPaddedWidth = Dp.m6973constructorimpl(40);
        IconLeftPadding = Dp.m6973constructorimpl(16);
        IconThreeLineVerticalPadding = Dp.m6973constructorimpl(16);
        ContentLeftPadding = Dp.m6973constructorimpl(16);
        ContentRightPadding = Dp.m6973constructorimpl(16);
        ThreeLineBaselineFirstOffset = Dp.m6973constructorimpl(28);
        ThreeLineBaselineSecondOffset = Dp.m6973constructorimpl(20);
        ThreeLineBaselineThirdOffset = Dp.m6973constructorimpl(20);
        ThreeLineTrailingTopPadding = Dp.m6973constructorimpl(16);
        TrailingRightPadding = Dp.m6973constructorimpl(16);
    }

    public final void ListItem(Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> r58, final Function2<? super Composer, ? super Integer, Unit> r59, final Function2<? super Composer, ? super Integer, Unit> r60, final Function2<? super Composer, ? super Integer, Unit> r61, final Function2<? super Composer, ? super Integer, Unit> r62, Composer $composer, final int $changed, final int r65) {
        Composer $composer2 = $composer.startRestartGroup(1749738797);
        ComposerKt.sourceInformation($composer2, "C(ListItem)P(1!1,4,3)316@11437L1421:ListItem.kt#jmzs0o");
        int $dirty = $changed;
        int r8 = r65 & 1;
        if (r8 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r10 = modifier;
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
        ThreeLine r14 = this;
    L74:
        int $dirty2 = $dirty;
        if ((599187 & $dirty2) == 599186) goto L77;
        boolean r2 = true;
    L79:
        if ($composer2.shouldExecute(r2, $dirty2 & 1) == false) goto L128;
        if (r8 == 0) goto L82;
        Modifier.Companion modifier2 = Modifier.Companion;
    L84:
        if (ComposerKt.isTraceInProgress() == false) goto L86;
        ComposerKt.traceEventStart(1749738797, $dirty2, -1, "androidx.compose.material.ThreeLine.ListItem (ListItem.kt:315)");
    L86:
        Modifier modifier$iv = SizeKt.m760heightInVpY3zN4$default(modifier2, MinHeight, 0.0f, 2, null);
        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
        Alignment.Vertical verticalAlignment$iv = Alignment.Companion.getTop();
        MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
        int $changed$iv$iv = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r23 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        Modifier modifier3 = modifier2;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L89;
        ComposablesKt.invalidApplier();
    L89:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L92;
        Function0<ComposeUiNode> r3 = r23;
        $composer2.createNode(r3);
    L93:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L100;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L100;
    L101:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r1 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
        int r29 = ((0 >> 6) & 112) | 6;
        RowScope $this$ListItem_u24lambda_u241 = RowScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, 1135498852, "C338@12401L127,331@12072L456:ListItem.kt#jmzs0o");
        if (r58 == null) goto L119;
        $composer2.startReplaceGroup(1135491690);
        ComposerKt.sourceInformation($composer2, "319@11594L451");
        float arg0$iv = IconLeftPadding;
        float other$iv = IconMinPaddedWidth;
        float arg0$iv2 = Dp.m6973constructorimpl(arg0$iv + other$iv);
        Modifier modifier$iv2 = PaddingKt.m729paddingqDBjuR0$default(SizeKt.m776sizeInqDBjuR0$default(Modifier.Companion, arg0$iv2, arg0$iv2, 0.0f, 0.0f, 12, null), IconLeftPadding, IconThreeLineVerticalPadding, 0.0f, IconThreeLineVerticalPadding, 4, null);
        Alignment contentAlignment$iv = Alignment.Companion.getCenterStart();
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv2 = (54 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv2 = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer2, modifier$iv2);
        Function0<ComposeUiNode> r45 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L106;
        ComposablesKt.invalidApplier();
    L106:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L109;
        Function0<ComposeUiNode> r7 = r45;
        $composer2.createNode(r7);
    L110:
        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r9 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv2.getInserting() == true) goto L117;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv2.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv2)) == false) goto L117;
    L118:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
        int r0 = ($changed$iv$iv$iv2 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r5 = BoxScopeInstance.INSTANCE;
        int r11 = ((54 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -609320596, "C328@12021L6:ListItem.kt#jmzs0o");
        r58.invoke($composer2, Integer.valueOf(($dirty2 >> 3) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endReplaceGroup();
    L120:
        ListItemKt.access$BaselinesOffsetColumn(CollectionsKt.listOf(new Dp[]{Dp.m6971boximpl(ThreeLineBaselineFirstOffset), Dp.m6971boximpl(ThreeLineBaselineSecondOffset), Dp.m6971boximpl(ThreeLineBaselineThirdOffset)}), PaddingKt.m729paddingqDBjuR0$default(RowScope.weight$default($this$ListItem_u24lambda_u241, Modifier.Companion, 1.0f, false, 2, null), ContentLeftPadding, 0.0f, ContentRightPadding, 0.0f, 10, null), ComposableLambdaKt.rememberComposableLambda(-318094245, true, new ThreeLine$ListItem$1$2(r61, r59, r60), $composer2, 54), $composer2, 390, 0);
        if (r62 == null) goto L123;
        $composer2.startReplaceGroup(1136529043);
        ComposerKt.sourceInformation($composer2, "344@12581L253");
        float arg0$iv3 = ThreeLineBaselineFirstOffset;
        float other$iv2 = ThreeLineTrailingTopPadding;
        Composer $composer3 = $composer2;
        ListItemKt.m1693access$OffsetToBaselineOrCenterKz89ssw(Dp.m6973constructorimpl(arg0$iv3 - other$iv2), PaddingKt.m729paddingqDBjuR0$default(Modifier.Companion, 0.0f, ThreeLineTrailingTopPadding, TrailingRightPadding, 0.0f, 9, null), r62, $composer3, (($dirty2 >> 9) & 896) | 54, 0);
        $composer3.endReplaceGroup();
    L124:
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L127;
        ComposerKt.traceEventEnd();
    L127:
        final Modifier modifier4 = modifier3;
    L129:
        ScopeUpdateScope r12 = $composer2.endRestartGroup();
        if (r12 == null) goto L133;
        final ThreeLine r6 = r14;
        r12.updateScope(new AnonymousClass2(r6, modifier4, r58, r59, r60, r61, r62, $changed, r65));
        return;
    L133:
        return;
    L123:
        $composer3 = $composer2;
        $composer3.startReplaceGroup(1136802928);
        $composer3.endReplaceGroup();
    L117:
        $this$Layout_u24lambda_u240$iv$iv2.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv2));
        $this$Layout_u24lambda_u240$iv$iv2.apply(Integer.valueOf(compositeKeyHash$iv$iv2), r9);
        goto L118
    L109:
        r7 = r45;
        $composer2.useNode();
        goto L110
    L119:
        $composer2.startReplaceGroup(1136020240);
        $composer2.endReplaceGroup();
    L100:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r4);
        goto L101
    L92:
        r3 = r23;
        $composer2.useNode();
        goto L93
    L82:
        modifier2 = r10;
        goto L84
    L128:
        $composer2.skipToGroupEnd();
        modifier4 = r10;
        goto L129
    L77:
        r2 = false;
        goto L79
    L67:
        if (($changed & 1572864) != 0) goto L73;
        r14 = this;
        if ($composer2.changed(r14) == false) goto L71;
        int r13 = 1048576;
    L72:
        $dirty = $dirty | r13;
        goto L74
    L71:
        r13 = 524288;
        goto L72
    L73:
        r14 = this;
        goto L74
    L57:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L64;
        if ($composer2.changedInstance(r62) == false) goto L61;
        int r15 = 131072;
    L62:
        $dirty = $dirty | r15;
        goto L64
    L61:
        r15 = 65536;
        goto L62
    L47:
        if (($changed & 24576) != 0) goto L54;
        if ($composer2.changedInstance(r61) == false) goto L51;
        int r16 = 16384;
    L52:
        $dirty = $dirty | r16;
        goto L54
    L51:
        r16 = 8192;
        goto L52
    L37:
        if (($changed & 3072) != 0) goto L44;
        if ($composer2.changedInstance(r60) == false) goto L41;
        int r17 = 2048;
    L42:
        $dirty = $dirty | r17;
        goto L44
    L41:
        r17 = 1024;
        goto L42
    L27:
        if (($changed & 384) != 0) goto L34;
        if ($composer2.changedInstance(r59) == false) goto L31;
        int r18 = 256;
    L32:
        $dirty = $dirty | r18;
        goto L34
    L31:
        r18 = 128;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changedInstance(r58) == false) goto L21;
        int r19 = 32;
    L22:
        $dirty = $dirty | r19;
        goto L24
    L21:
        r19 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L12;
        r10 = modifier;
        if ($composer2.changed(r10) == false) goto L10;
        int r110 = 4;
    L11:
        $dirty = $dirty | r110;
        goto L14
    L10:
        r110 = 2;
        goto L11
    L12:
        r10 = modifier;
        goto L14
    }
}
