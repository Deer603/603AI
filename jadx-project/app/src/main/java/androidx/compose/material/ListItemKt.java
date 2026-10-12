package androidx.compose.material;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ListItem.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a8\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0003¢\u0006\u0002\u0010\n\u001a\u0090\u0001\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\t2\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\t2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\t2\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0007¢\u0006\u0002\u0010\u0013\u001a7\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0003ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a?\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\t2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0013\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\tH\u0002¢\u0006\u0002\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"BaselinesOffsetColumn", "", "offsets", "", "Landroidx/compose/ui/unit/Dp;", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ListItem", "icon", "secondaryText", "singleLineSecondaryText", "", "overlineText", "trailing", "text", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "OffsetToBaselineOrCenter", "offset", "OffsetToBaselineOrCenter-Kz89ssw", "(FLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "applyTextStyle", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "contentAlpha", "", "(Landroidx/compose/ui/text/TextStyle;FLkotlin/jvm/functions/Function2;)Lkotlin/jvm/functions/Function2;", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ListItemKt {
    public static final /* synthetic */ void access$BaselinesOffsetColumn(List offsets, Modifier modifier, Function2 content, Composer $composer, int $changed, int $default) {
        BaselinesOffsetColumn(offsets, modifier, content, $composer, $changed, $default);
    }

    /* JADX INFO: renamed from: access$OffsetToBaselineOrCenter-Kz89ssw, reason: not valid java name */
    public static final /* synthetic */ void m1693access$OffsetToBaselineOrCenterKz89ssw(float offset, Modifier modifier, Function2 content, Composer $composer, int $changed, int $default) {
        m1692OffsetToBaselineOrCenterKz89ssw(offset, modifier, content, $composer, $changed, $default);
    }

    public static final void ListItem(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> r22, Function2<? super Composer, ? super Integer, Unit> r23, boolean singleLineSecondaryText, Function2<? super Composer, ? super Integer, Unit> r25, Function2<? super Composer, ? super Integer, Unit> r26, final Function2<? super Composer, ? super Integer, Unit> r27, Composer $composer, final int $changed, final int $dirty) {
        Composer $composer2 = $composer.startRestartGroup(-450923337);
        ComposerKt.sourceInformation($composer2, "C(ListItem)P(1!1,3,4!1,6)89@3547L10,91@3630L4,92@3720L6,93@3821L4,94@3914L4:ListItem.kt#jmzs0o");
        int $dirty2 = $changed;
        int r2 = $dirty & 1;
        if (r2 == 0) goto L6;
        $dirty2 = $dirty2 | 6;
    L13:
        int r4 = $dirty & 2;
        if (r4 == 0) goto L17;
        $dirty2 = $dirty2 | 48;
        Function2<? super Composer, ? super Integer, Unit> r5 = r22;
    L24:
        int r6 = $dirty & 4;
        if (r6 == 0) goto L28;
        $dirty2 = $dirty2 | 384;
        Function2<? super Composer, ? super Integer, Unit> r9 = r23;
    L35:
        int r10 = $dirty & 8;
        if (r10 == 0) goto L39;
        $dirty2 = $dirty2 | 3072;
    L46:
        int r12 = $dirty & 16;
        if (r12 == 0) goto L50;
        $dirty2 = $dirty2 | 24576;
        Function2<? super Composer, ? super Integer, Unit> r13 = r25;
    L57:
        int r15 = $dirty & 32;
        if (r15 == 0) goto L61;
        $dirty2 = $dirty2 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L69:
        if (($dirty & 64) == 0) goto L72;
        $dirty2 = $dirty2 | 1572864;
    L79:
        if (($dirty2 & 599187) == 599186) goto L81;
        boolean r0 = true;
    L83:
        if ($composer2.shouldExecute(r0, $dirty2 & 1) == false) goto L118;
        if (r2 == 0) goto L86;
        Modifier.Companion modifier2 = Modifier.Companion;
    L87:
        if (r4 == 0) goto L89;
        Function2<? super Composer, ? super Integer, Unit> r11 = null;
    L90:
        if (r6 == 0) goto L92;
        Function2<? super Composer, ? super Integer, Unit> r3 = null;
    L93:
        if (r10 == 0) goto L95;
        final boolean singleLineSecondaryText2 = true;
    L96:
        if (r12 == 0) goto L98;
        final Function2<? super Composer, ? super Integer, Unit> r7 = null;
    L99:
        if (r15 == 0) goto L101;
        final Function2<? super Composer, ? super Integer, Unit> r8 = null;
    L103:
        if (ComposerKt.isTraceInProgress() == false) goto L105;
        ComposerKt.traceEventStart(-450923337, $dirty2, -1, "androidx.compose.material.ListItem (ListItem.kt:88)");
    L105:
        Typography typography = MaterialTheme.INSTANCE.getTypography($composer2, 6);
        Function2<Composer, Integer, Unit> r14 = applyTextStyle(typography.getSubtitle1(), ContentAlpha.INSTANCE.getHigh($composer2, 6), r27);
        Intrinsics.checkNotNull(r14);
        Function2<Composer, Integer, Unit> r17 = applyTextStyle(typography.getBody2(), ContentAlpha.INSTANCE.getMedium($composer2, 6), r3);
        Function2<Composer, Integer, Unit> r20 = applyTextStyle(typography.getOverline(), ContentAlpha.INSTANCE.getHigh($composer2, 6), r7);
        Function2<Composer, Integer, Unit> r16 = applyTextStyle(typography.getCaption(), ContentAlpha.INSTANCE.getHigh($composer2, 6), r8);
        Modifier semanticsModifier = SemanticsModifierKt.semantics(modifier2, true, ListItemKt$ListItem$semanticsModifier$1.INSTANCE);
        if (r17 != null) goto L109;
        if (r20 != null) goto L109;
        $composer2.startReplaceGroup(-215900426);
        ComposerKt.sourceInformation($composer2, "99@4092L61");
        OneLine.INSTANCE.ListItem(semanticsModifier, r11, r14, r16, $composer2, ($dirty2 & 112) | 24576, 0);
        $composer2.endReplaceGroup();
    L115:
        if (ComposerKt.isTraceInProgress() == false) goto L117;
        ComposerKt.traceEventEnd();
    L117:
        final Function2<? super Composer, ? super Integer, Unit> r18 = r3;
        final Function2<? super Composer, ? super Integer, Unit> r19 = r11;
    L119:
        ScopeUpdateScope r110 = $composer2.endRestartGroup();
        if (r110 == null) goto L123;
        final Modifier modifier3 = modifier2;
        r110.updateScope(new AnonymousClass1(modifier3, r19, r18, singleLineSecondaryText2, r7, r8, r27, $changed, $dirty));
        return;
    L123:
        return;
    L109:
        if (r20 != null) goto L111;
        if (singleLineSecondaryText2 == false) goto L111;
    L112:
        $composer2.startReplaceGroup(-215701189);
        ComposerKt.sourceInformation($composer2, "103@4289L184");
        TwoLine.INSTANCE.ListItem(semanticsModifier, r11, r14, r17, r20, r16, $composer2, ($dirty2 & 112) | 1572864, 0);
        $composer2 = $composer2;
        $composer2.endReplaceGroup();
    L111:
        if (r17 == null) goto L112;
        $composer2.startReplaceGroup(-215488839);
        ComposerKt.sourceInformation($composer2, "112@4505L184");
        ThreeLine.INSTANCE.ListItem(semanticsModifier, r11, r14, r17, r20, r16, $composer2, ($dirty2 & 112) | 1572864, 0);
        $composer2 = $composer2;
        $composer2.endReplaceGroup();
        goto L115
    L101:
        r8 = r26;
        goto L103
    L98:
        r7 = r13;
        goto L99
    L95:
        singleLineSecondaryText2 = singleLineSecondaryText;
        goto L96
    L92:
        r3 = r9;
        goto L93
    L89:
        r11 = r5;
        goto L90
    L86:
        modifier2 = modifier;
        goto L87
    L118:
        $composer2.skipToGroupEnd();
        modifier2 = modifier;
        singleLineSecondaryText2 = singleLineSecondaryText;
        r8 = r26;
        r19 = r5;
        r18 = r9;
        r7 = r13;
        goto L119
    L81:
        r0 = false;
        goto L83
    L72:
        if (($changed & 1572864) != 0) goto L79;
        if ($composer2.changedInstance(r27) == false) goto L76;
        int r111 = 1048576;
    L77:
        $dirty2 = $dirty2 | r111;
        goto L79
    L76:
        r111 = 524288;
        goto L77
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L69;
        if ($composer2.changedInstance(r26) == false) goto L65;
        int r112 = 131072;
    L66:
        $dirty2 = $dirty2 | r112;
        goto L69
    L65:
        r112 = 65536;
        goto L66
    L50:
        if (($changed & 24576) != 0) goto L56;
        r13 = r25;
        if ($composer2.changedInstance(r13) == false) goto L54;
        int r113 = 16384;
    L55:
        $dirty2 = $dirty2 | r113;
        goto L57
    L54:
        r113 = 8192;
        goto L55
    L56:
        r13 = r25;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L46;
        if ($composer2.changed(singleLineSecondaryText) == false) goto L43;
        int r114 = 2048;
    L44:
        $dirty2 = $dirty2 | r114;
        goto L46
    L43:
        r114 = 1024;
        goto L44
    L28:
        if (($changed & 384) != 0) goto L34;
        r9 = r23;
        if ($composer2.changedInstance(r9) == false) goto L32;
        int r115 = 256;
    L33:
        $dirty2 = $dirty2 | r115;
        goto L35
    L32:
        r115 = 128;
        goto L33
    L34:
        r9 = r23;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r5 = r22;
        if ($composer2.changedInstance(r5) == false) goto L21;
        int r21 = 32;
    L22:
        $dirty2 = $dirty2 | r21;
        goto L24
    L21:
        r21 = 16;
        goto L22
    L23:
        r5 = r22;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(modifier) == false) goto L10;
        int r24 = 4;
    L11:
        $dirty2 = $dirty2 | r24;
        goto L13
    L10:
        r24 = 2;
        goto L11
    }

    private static final void BaselinesOffsetColumn(final List<Dp> r20, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> r22, Composer $composer, final int $changed, final int r25) {
        Composer $composer2 = $composer.startRestartGroup(1631148337);
        ComposerKt.sourceInformation($composer2, "C(BaselinesOffsetColumn)P(2,1)366@13348L1092,366@13322L1118:ListItem.kt#jmzs0o");
        int $dirty = $changed;
        if ((r25 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r5 = r25 & 2;
        if (r5 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier r7 = modifier;
    L24:
        if ((r25 & 4) == 0) goto L27;
        $dirty = $dirty | 384;
    L33:
        int $dirty2 = $dirty;
        if (($dirty2 & 147) == 146) goto L36;
        boolean r2 = true;
    L38:
        if ($composer2.shouldExecute(r2, $dirty2 & 1) == false) goto L71;
        if (r5 == 0) goto L41;
        Modifier.Companion modifier2 = Modifier.Companion;
    L43:
        if (ComposerKt.isTraceInProgress() == false) goto L45;
        ComposerKt.traceEventStart(1631148337, $dirty2, -1, "androidx.compose.material.BaselinesOffsetColumn (ListItem.kt:365)");
    L45:
        ComposerKt.sourceInformationMarkerStart($composer2, 1356162069, "CC(remember):ListItem.kt#9igjgp");
        boolean invalid$iv = $composer2.changedInstance(r20);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L48;
    L51:
        Object value$iv = (MeasurePolicy) new ListItemKt$BaselinesOffsetColumn$1$1(r20);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L52:
        MeasurePolicy measurePolicy$iv = (MeasurePolicy) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        int $changed$iv = (($dirty2 >> 6) & 14) | ($dirty2 & 112);
        Modifier modifier$iv = modifier2;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r13 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv = (($changed$iv << 6) & 896) | 6;
        Modifier modifier3 = modifier2;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L55;
        ComposablesKt.invalidApplier();
    L55:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L58;
        $composer2.createNode(r13);
    L59:
        Composer $this$Layout_u24lambda_u240$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv.getInserting() == true) goto L66;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv)) == false) goto L66;
    L67:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
        r22.invoke($composer2, Integer.valueOf(($changed$iv$iv >> 6) & 14));
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L70;
        ComposerKt.traceEventEnd();
    L70:
        final Modifier modifier4 = modifier3;
    L72:
        ScopeUpdateScope r8 = $composer2.endRestartGroup();
        if (r8 == null) goto L76;
        r8.updateScope(new AnonymousClass2(r20, modifier4, r22, $changed, r25));
        return;
    L76:
        return;
    L66:
        $this$Layout_u24lambda_u240$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
        $this$Layout_u24lambda_u240$iv.apply(Integer.valueOf(compositeKeyHash$iv), r3);
        goto L67
    L58:
        $composer2.useNode();
        goto L59
    L48:
        if (it$iv != Composer.Companion.getEmpty()) goto L52;
    L41:
        modifier2 = r7;
        goto L43
    L71:
        $composer2.skipToGroupEnd();
        modifier4 = r7;
        goto L72
    L36:
        r2 = false;
        goto L38
    L27:
        if (($changed & 384) != 0) goto L33;
        if ($composer2.changedInstance(r22) == false) goto L31;
        int r9 = 256;
    L32:
        $dirty = $dirty | r9;
        goto L33
    L31:
        r9 = 128;
        goto L32
    L16:
        if (($changed & 48) != 0) goto L22;
        r7 = modifier;
        if ($composer2.changed(r7) == false) goto L20;
        int r10 = 32;
    L21:
        $dirty = $dirty | r10;
        goto L24
    L20:
        r10 = 16;
        goto L21
    L22:
        r7 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changedInstance(r20) == false) goto L10;
        int r6 = 4;
    L11:
        $dirty = $dirty | r6;
        goto L12
    L10:
        r6 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: OffsetToBaselineOrCenter-Kz89ssw, reason: not valid java name */
    private static final void m1692OffsetToBaselineOrCenterKz89ssw(final float offset, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> r22, Composer $composer, final int $changed, final int r25) {
        Composer $composer2 = $composer.startRestartGroup(-1062692685);
        ComposerKt.sourceInformation($composer2, "C(OffsetToBaselineOrCenter)P(2:c#ui.unit.Dp,1)405@14991L829,405@14965L855:ListItem.kt#jmzs0o");
        int $dirty = $changed;
        if ((r25 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r5 = r25 & 2;
        if (r5 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier r8 = modifier;
    L24:
        if ((r25 & 4) == 0) goto L27;
        $dirty = $dirty | 384;
    L33:
        int $dirty2 = $dirty;
        boolean invalid$iv = true;
        if (($dirty2 & 147) == 146) goto L36;
        boolean r2 = true;
    L38:
        if ($composer2.shouldExecute(r2, $dirty2 & 1) == false) goto L75;
        if (r5 == 0) goto L41;
        Modifier.Companion modifier2 = Modifier.Companion;
    L43:
        if (ComposerKt.isTraceInProgress() == false) goto L45;
        ComposerKt.traceEventStart(-1062692685, $dirty2, -1, "androidx.compose.material.OffsetToBaselineOrCenter (ListItem.kt:404)");
    L45:
        ComposerKt.sourceInformationMarkerStart($composer2, 1484815054, "CC(remember):ListItem.kt#9igjgp");
        if (($dirty2 & 14) == 4) goto L49;
        invalid$iv = false;
    L49:
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L52;
    L55:
        Object value$iv = (MeasurePolicy) new ListItemKt$OffsetToBaselineOrCenter$1$1(offset);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L56:
        MeasurePolicy measurePolicy$iv = (MeasurePolicy) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        int $changed$iv = (($dirty2 >> 6) & 14) | ($dirty2 & 112);
        Modifier modifier$iv = modifier2;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r13 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv = (($changed$iv << 6) & 896) | 6;
        Modifier modifier3 = modifier2;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L59;
        ComposablesKt.invalidApplier();
    L59:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L62;
        $composer2.createNode(r13);
    L63:
        Composer $this$Layout_u24lambda_u240$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv.getInserting() == true) goto L70;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv)) == false) goto L70;
    L71:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
        r22.invoke($composer2, Integer.valueOf(($changed$iv$iv >> 6) & 14));
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L74;
        ComposerKt.traceEventEnd();
    L74:
        final Modifier modifier4 = modifier3;
    L76:
        ScopeUpdateScope r7 = $composer2.endRestartGroup();
        if (r7 == null) goto L80;
        r7.updateScope(new ListItemKt$OffsetToBaselineOrCenter$2(offset, modifier4, r22, $changed, r25));
        return;
    L80:
        return;
    L70:
        $this$Layout_u24lambda_u240$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
        $this$Layout_u24lambda_u240$iv.apply(Integer.valueOf(compositeKeyHash$iv), r3);
        goto L71
    L62:
        $composer2.useNode();
        goto L63
    L52:
        if (it$iv != Composer.Companion.getEmpty()) goto L56;
    L41:
        modifier2 = r8;
        goto L43
    L75:
        $composer2.skipToGroupEnd();
        modifier4 = r8;
        goto L76
    L36:
        r2 = false;
        goto L38
    L27:
        if (($changed & 384) != 0) goto L33;
        if ($composer2.changedInstance(r22) == false) goto L31;
        int r9 = 256;
    L32:
        $dirty = $dirty | r9;
        goto L33
    L31:
        r9 = 128;
        goto L32
    L16:
        if (($changed & 48) != 0) goto L22;
        r8 = modifier;
        if ($composer2.changed(r8) == false) goto L20;
        int r10 = 32;
    L21:
        $dirty = $dirty | r10;
        goto L24
    L20:
        r10 = 16;
        goto L21
    L22:
        r8 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(offset) == false) goto L10;
        int r6 = 4;
    L11:
        $dirty = $dirty | r6;
        goto L12
    L10:
        r6 = 2;
        goto L11
    }

    private static final Function2<Composer, Integer, Unit> applyTextStyle(final TextStyle textStyle, final float contentAlpha, final Function2<? super Composer, ? super Integer, Unit> r6) {
        if (r6 != null) goto L5;
        return null;
    L5:
        final LineHeightStyle lineHeightStyle = new LineHeightStyle(LineHeightStyle.Alignment.Companion.m6804getProportionalPIaL0Z0(), LineHeightStyle.Trim.Companion.m6824getBothEVpEnUU(), null);
        return ComposableLambdaKt.composableLambdaInstance(-830176860, true, new C04321(contentAlpha, textStyle, lineHeightStyle, r6));
    }
}
