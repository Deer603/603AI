package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Badge.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aR\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152 \b\u0002\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0018¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001aS\u0010\u001e\u001a\u00020\u00112\u001c\u0010\u001f\u001a\u0018\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00110\u0018¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00110\u0018¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0007¢\u0006\u0002\u0010!\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0016\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\"\u0016\u0010\b\u001a\u00020\u0004X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\"\u0016\u0010\n\u001a\u00020\u0004X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\"\u0016\u0010\f\u001a\u00020\u0004X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006\"\u0016\u0010\u000e\u001a\u00020\u0004X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"BadgeContentFontSize", "Landroidx/compose/ui/unit/TextUnit;", "J", "BadgeHorizontalOffset", "Landroidx/compose/ui/unit/Dp;", "getBadgeHorizontalOffset", "()F", "F", "BadgeRadius", "getBadgeRadius", "BadgeWithContentHorizontalOffset", "getBadgeWithContentHorizontalOffset", "BadgeWithContentHorizontalPadding", "getBadgeWithContentHorizontalPadding", "BadgeWithContentRadius", "getBadgeWithContentRadius", "Badge", "", "modifier", "Landroidx/compose/ui/Modifier;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "Badge-eopBjH0", "(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BadgedBox", "badge", "Landroidx/compose/foundation/layout/BoxScope;", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class BadgeKt {
    private static final long BadgeContentFontSize = 0;
    private static final float BadgeHorizontalOffset = 0.0f;
    private static final float BadgeRadius = 0.0f;
    private static final float BadgeWithContentHorizontalOffset = 0.0f;
    private static final float BadgeWithContentHorizontalPadding = 0.0f;
    private static final float BadgeWithContentRadius = 0.0f;

    public static final /* synthetic */ long access$getBadgeContentFontSize$p() {
        return BadgeContentFontSize;
    }

    public static final void BadgedBox(final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> r45, Modifier modifier, final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> r47, Composer $composer, final int $changed, final int r50) {
        Composer $composer2 = $composer.startRestartGroup(859805272);
        ComposerKt.sourceInformation($composer2, "C(BadgedBox)P(!1,2)62@2549L1987:Badge.kt#jmzs0o");
        int $dirty = $changed;
        if ((r50 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r5 = r50 & 2;
        if (r5 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier r7 = modifier;
    L24:
        if ((r50 & 4) == 0) goto L27;
        $dirty = $dirty | 384;
    L33:
        int $dirty2 = $dirty;
        if (($dirty2 & 147) == 146) goto L36;
        boolean r2 = true;
    L38:
        if ($composer2.shouldExecute(r2, $dirty2 & 1) == false) goto L94;
        if (r5 == 0) goto L41;
        Modifier.Companion modifier2 = Modifier.Companion;
    L43:
        if (ComposerKt.isTraceInProgress() == false) goto L45;
        ComposerKt.traceEventStart(859805272, $dirty2, -1, "androidx.compose.material.BadgedBox (Badge.kt:61)");
    L45:
        MeasurePolicy measurePolicy$iv = AnonymousClass2.INSTANCE;
        Modifier modifier$iv = modifier2;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r16 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv = (((($dirty2 & 112) | 384) << 6) & 896) | 6;
        Modifier modifier3 = modifier2;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L48;
        ComposablesKt.invalidApplier();
    L48:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L51;
        $composer2.createNode(r16);
    L52:
        Composer $this$Layout_u24lambda_u240$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r6 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv.getInserting() == true) goto L58;
        Composer $composer3 = $composer2;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv)) == true) goto L60;
    L59:
        $this$Layout_u24lambda_u240$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
        $this$Layout_u24lambda_u240$iv.apply(Integer.valueOf(compositeKeyHash$iv), r6);
    L60:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
        int r0 = ($changed$iv$iv >> 6) & 14;
        Composer $composer4 = $composer3;
        ComposerKt.sourceInformationMarkerStart($composer4, 643415927, "C64@2579L161,69@2753L59:Badge.kt#jmzs0o");
        Modifier modifier$iv2 = LayoutIdKt.layoutId(Modifier.Companion, "anchor");
        Alignment contentAlignment$iv = Alignment.Companion.getCenter();
        int $changed$iv = (($dirty2 << 3) & 7168) | 54;
        ComposerKt.sourceInformationMarkerStart($composer4, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv2 = ($changed$iv << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer4, 0);
        CompositionLocalMap localMap$iv$iv = $composer4.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer4, modifier$iv2);
        Function0<ComposeUiNode> r34 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv2 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer4.getApplier() instanceof Applier) == true) goto L63;
        ComposablesKt.invalidApplier();
    L63:
        $composer4.startReusableNode();
        if ($composer4.getInserting() == false) goto L66;
        Function0<ComposeUiNode> r8 = r34;
        $composer4.createNode(r8);
    L67:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer4);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r9 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L74;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L74;
    L75:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r1 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        r47.invoke(BoxScopeInstance.INSTANCE, $composer4, Integer.valueOf((($changed$iv >> 6) & 112) | 6));
        ComposerKt.sourceInformationMarkerEnd($composer4);
        $composer4.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer4);
        Modifier modifier$iv3 = LayoutIdKt.layoutId(Modifier.Companion, "badge");
        int $changed$iv2 = (($dirty2 << 9) & 7168) | 6;
        ComposerKt.sourceInformationMarkerStart($composer4, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv2 = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv3 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv2, false);
        int $changed$iv$iv3 = ($changed$iv2 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash($composer4, 0);
        CompositionLocalMap localMap$iv$iv2 = $composer4.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer4, modifier$iv3);
        Function0<ComposeUiNode> r17 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv2 = (($changed$iv$iv3 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer4.getApplier() instanceof Applier) == true) goto L78;
        ComposablesKt.invalidApplier();
    L78:
        $composer4.startReusableNode();
        if ($composer4.getInserting() == false) goto L81;
        Function0<ComposeUiNode> r3 = r17;
        $composer4.createNode(r3);
    L82:
        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m3808constructorimpl($composer4);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv3, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv2.getInserting() == true) goto L88;
        Composer $composer5 = $composer4;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv2.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv2)) == true) goto L90;
    L89:
        $this$Layout_u24lambda_u240$iv$iv2.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv2));
        $this$Layout_u24lambda_u240$iv$iv2.apply(Integer.valueOf(compositeKeyHash$iv$iv2), r4);
    L90:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
        int r10 = ($changed$iv$iv$iv2 >> 6) & 14;
        Composer $composer$iv = $composer5;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        r45.invoke(BoxScopeInstance.INSTANCE, $composer$iv, Integer.valueOf((($changed$iv2 >> 6) & 112) | 6));
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        $composer5.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer5);
        ComposerKt.sourceInformationMarkerEnd($composer5);
        ComposerKt.sourceInformationMarkerEnd($composer5);
        ComposerKt.sourceInformationMarkerEnd($composer5);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L93;
        ComposerKt.traceEventEnd();
    L93:
        final Modifier modifier4 = modifier3;
    L95:
        ScopeUpdateScope r11 = $composer3.endRestartGroup();
        if (r11 == null) goto L99;
        r11.updateScope(new AnonymousClass3(r45, modifier4, r47, $changed, r50));
        return;
    L99:
        return;
    L88:
        $composer5 = $composer4;
        goto L89
    L81:
        r3 = r17;
        $composer4.useNode();
    L74:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r9);
        goto L75
    L66:
        r8 = r34;
        $composer4.useNode();
        goto L67
    L58:
        $composer3 = $composer2;
        goto L59
    L51:
        $composer2.useNode();
        goto L52
    L41:
        modifier2 = r7;
        goto L43
    L94:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        modifier4 = r7;
        goto L95
    L36:
        r2 = false;
        goto L38
    L27:
        if (($changed & 384) != 0) goto L33;
        if ($composer2.changedInstance(r47) == false) goto L31;
        int r12 = 256;
    L32:
        $dirty = $dirty | r12;
        goto L33
    L31:
        r12 = 128;
        goto L32
    L16:
        if (($changed & 48) != 0) goto L22;
        r7 = modifier;
        if ($composer2.changed(r7) == false) goto L20;
        int r13 = 32;
    L21:
        $dirty = $dirty | r13;
        goto L24
    L20:
        r13 = 16;
        goto L21
    L22:
        r7 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changedInstance(r45) == false) goto L10;
        int r14 = 4;
    L11:
        $dirty = $dirty | r14;
        goto L12
    L10:
        r14 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: Badge-eopBjH0, reason: not valid java name */
    public static final void m1545BadgeeopBjH0(Modifier modifier, long backgroundColor, long contentColor, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r34, Composer $composer, final int $changed, final int r37) {
        Composer $composer2 = $composer.startRestartGroup(1133484502);
        ComposerKt.sourceInformation($composer2, "C(Badge)P(3,0:c#ui.graphics.Color,2:c#ui.graphics.Color)134@5507L721:Badge.kt#jmzs0o");
        int $dirty = $changed;
        int r2 = r37 & 1;
        if (r2 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r4 = modifier;
    L14:
        if (($changed & 48) == 0) goto L16;
        long r5 = backgroundColor;
    L25:
        if (($changed & 384) == 0) goto L27;
        long contentColor2 = contentColor;
    L35:
        int r8 = r37 & 8;
        if (r8 == 0) goto L39;
        $dirty = $dirty | 3072;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r12 = r34;
    L47:
        if (($dirty & 1171) == 1170) goto L49;
        boolean r13 = true;
    L51:
        if ($composer2.shouldExecute(r13, $dirty & 1) == false) goto L105;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "126@5218L6,127@5258L32");
        if (($changed & 1) != 0) goto L55;
    L64:
        if (r2 == 0) goto L66;
        Modifier.Companion modifier2 = Modifier.Companion;
    L68:
        if ((r37 & 2) == 0) goto L70;
        long backgroundColor2 = MaterialTheme.INSTANCE.getColors($composer2, 6).m1592getError0d7_KjU();
        $dirty = $dirty & (-113);
    L72:
        if ((r37 & 4) == 0) goto L74;
        contentColor2 = ColorsKt.m1616contentColorForek8zF_U(backgroundColor2, $composer2, ($dirty >> 3) & 14);
        $dirty = $dirty & (-897);
    L74:
        if (r8 == 0) goto L76;
        r12 = null;
    L76:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L79;
        ComposerKt.traceEventStart(1133484502, $dirty, -1, "androidx.compose.material.Badge (Badge.kt:129)");
    L79:
        if (r12 == null) goto L81;
        float radius = BadgeWithContentRadius;
    L82:
        RoundedCornerShape shape = RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(radius);
        Modifier r3 = PaddingKt.m727paddingVpY3zN4$default(ClipKt.clip(BackgroundKt.m233backgroundbw27NRU(SizeKt.m756defaultMinSizeVpY3zN4(modifier2, Dp.m6973constructorimpl(2 * radius), Dp.m6973constructorimpl(2 * radius)), backgroundColor2, shape), shape), BadgeWithContentHorizontalPadding, 0.0f, 2, null);
        Alignment.Vertical r9 = Alignment.Companion.getCenterVertically();
        Arrangement.HorizontalOrVertical r14 = Arrangement.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(r14, r9, $composer2, ((432 >> 3) & 14) | ((432 >> 3) & 112));
        int $changed$iv$iv = (432 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, r3);
        Function0<ComposeUiNode> r17 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        Modifier modifier3 = modifier2;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L85;
        ComposablesKt.invalidApplier();
    L85:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L88;
        Function0<ComposeUiNode> r1 = r17;
        $composer2.createNode(r1);
    L89:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r6 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L95;
        long backgroundColor3 = backgroundColor2;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == true) goto L97;
    L96:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r6);
    L97:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r0 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
        int r7 = ((432 >> 6) & 112) | 6;
        final RowScope $this$Badge_eopBjH0_u24lambda_u241 = RowScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, 1448007710, "C:Badge.kt#jmzs0o");
        if (r12 == null) goto L100;
        $composer2.startReplaceGroup(1448027890);
        ComposerKt.sourceInformation($composer2, "145@6026L186,145@5960L252");
        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4356boximpl(contentColor2)), ComposableLambdaKt.rememberComposableLambda(1784526485, true, new BadgeKt$Badge$1$1(r12, $this$Badge_eopBjH0_u24lambda_u241), $composer2, 54), $composer2, ProvidedValue.$stable | 48);
        $composer2.endReplaceGroup();
    L101:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L104;
        ComposerKt.traceEventEnd();
    L104:
        final Modifier modifier4 = modifier3;
        final long contentColor3 = contentColor2;
        final long backgroundColor4 = backgroundColor3;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r10 = r12;
    L106:
        ScopeUpdateScope r11 = $composer2.endRestartGroup();
        if (r11 == null) goto L110;
        r11.updateScope(new BadgeKt$Badge$2(modifier4, backgroundColor4, contentColor3, r10, $changed, r37));
        return;
    L110:
        return;
    L100:
        $composer2.startReplaceGroup(1448293126);
        $composer2.endReplaceGroup();
        goto L101
    L95:
        backgroundColor3 = backgroundColor2;
        goto L96
    L88:
        r1 = r17;
        $composer2.useNode();
        goto L89
    L81:
        radius = BadgeRadius;
        goto L82
    L70:
        backgroundColor2 = r5;
        goto L72
    L66:
        modifier2 = r4;
        goto L68
    L55:
        if ($composer2.getDefaultsInvalid() == true) goto L64;
        $composer2.skipToGroupEnd();
        if ((r37 & 2) == 0) goto L61;
        $dirty = $dirty & (-113);
    L61:
        if ((r37 & 4) == 0) goto L63;
        $dirty = $dirty & (-897);
    L63:
        modifier2 = r4;
        backgroundColor2 = r5;
        goto L76
    L105:
        $composer2.skipToGroupEnd();
        backgroundColor4 = r5;
        modifier4 = r4;
        contentColor3 = contentColor2;
        r10 = r12;
        goto L106
    L49:
        r13 = false;
        goto L51
    L39:
        if (($changed & 3072) != 0) goto L45;
        r12 = r34;
        if ($composer2.changedInstance(r12) == false) goto L43;
        int r15 = 2048;
    L44:
        $dirty = $dirty | r15;
        goto L47
    L43:
        r15 = 1024;
        goto L44
    L45:
        r12 = r34;
        goto L47
    L27:
        if ((r37 & 4) != 0) goto L31;
        contentColor2 = contentColor;
        if ($composer2.changed(contentColor2) == false) goto L32;
        int r16 = 256;
    L33:
        $dirty = $dirty | r16;
    L32:
        r16 = 128;
        goto L33
    L31:
        contentColor2 = contentColor;
        goto L32
    L16:
        if ((r37 & 2) != 0) goto L20;
        r5 = backgroundColor;
        if ($composer2.changed(r5) == false) goto L21;
        int r18 = 32;
    L22:
        $dirty = $dirty | r18;
    L21:
        r18 = 16;
        goto L22
    L20:
        r5 = backgroundColor;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L10;
        int r19 = 4;
    L11:
        $dirty = $dirty | r19;
        goto L14
    L10:
        r19 = 2;
        goto L11
    L12:
        r4 = modifier;
        goto L14
    }

    static {
        BadgeRadius = Dp.m6973constructorimpl(4);
        BadgeWithContentRadius = Dp.m6973constructorimpl(8);
        BadgeContentFontSize = TextUnitKt.getSp(10);
        BadgeWithContentHorizontalPadding = Dp.m6973constructorimpl(4);
        float arg0$iv = Dp.m6973constructorimpl(6);
        BadgeWithContentHorizontalOffset = Dp.m6973constructorimpl(-arg0$iv);
        float arg0$iv2 = Dp.m6973constructorimpl(4);
        BadgeHorizontalOffset = Dp.m6973constructorimpl(-arg0$iv2);
    }

    public static final float getBadgeRadius() {
        return BadgeRadius;
    }

    public static final float getBadgeWithContentRadius() {
        return BadgeWithContentRadius;
    }

    public static final float getBadgeWithContentHorizontalPadding() {
        return BadgeWithContentHorizontalPadding;
    }

    public static final float getBadgeWithContentHorizontalOffset() {
        return BadgeWithContentHorizontalOffset;
    }

    public static final float getBadgeHorizontalOffset() {
        return BadgeHorizontalOffset;
    }
}
