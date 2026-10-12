package androidx.compose.material3;

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
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.BadgeTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Badge.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u001aR\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102 \b\u0002\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001aS\u0010\u0019\u001a\u00020\f2\u001c\u0010\u001a\u001a\u0018\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f0\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010\r\u001a\u00020\u000e2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f0\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u001c\"\u0016\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0005\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0006\u0010\u0003\"\u0016\u0010\u0007\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\b\u0010\u0003\"\u0016\u0010\t\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\n\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d²\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u008e\u0002²\u0006\n\u0010 \u001a\u00020\u001fX\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\u001fX\u008a\u008e\u0002²\u0006\n\u0010\"\u001a\u00020\u001fX\u008a\u008e\u0002"}, d2 = {"BadgeOffset", "Landroidx/compose/ui/unit/Dp;", "getBadgeOffset", "()F", "F", "BadgeWithContentHorizontalOffset", "getBadgeWithContentHorizontalOffset", "BadgeWithContentHorizontalPadding", "getBadgeWithContentHorizontalPadding", "BadgeWithContentVerticalOffset", "getBadgeWithContentVerticalOffset", "Badge", "", "modifier", "Landroidx/compose/ui/Modifier;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "Badge-eopBjH0", "(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BadgedBox", "badge", "Landroidx/compose/foundation/layout/BoxScope;", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "material3_release", "layoutAbsoluteLeft", "", "layoutAbsoluteTop", "greatGrandParentAbsoluteRight", "greatGrandParentAbsoluteTop"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BadgeKt {
    private static final float BadgeOffset = 0.0f;
    private static final float BadgeWithContentHorizontalOffset = 0.0f;
    private static final float BadgeWithContentHorizontalPadding = 0.0f;
    private static final float BadgeWithContentVerticalOffset = 0.0f;

    public static final /* synthetic */ float access$BadgedBox$lambda$1(MutableFloatState $layoutAbsoluteLeft$delegate) {
        return BadgedBox$lambda$1($layoutAbsoluteLeft$delegate);
    }

    public static final /* synthetic */ float access$BadgedBox$lambda$10(MutableFloatState $greatGrandParentAbsoluteTop$delegate) {
        return BadgedBox$lambda$10($greatGrandParentAbsoluteTop$delegate);
    }

    public static final /* synthetic */ void access$BadgedBox$lambda$11(MutableFloatState $greatGrandParentAbsoluteTop$delegate, float value) {
        BadgedBox$lambda$11($greatGrandParentAbsoluteTop$delegate, value);
    }

    public static final /* synthetic */ void access$BadgedBox$lambda$2(MutableFloatState $layoutAbsoluteLeft$delegate, float value) {
        BadgedBox$lambda$2($layoutAbsoluteLeft$delegate, value);
    }

    public static final /* synthetic */ float access$BadgedBox$lambda$4(MutableFloatState $layoutAbsoluteTop$delegate) {
        return BadgedBox$lambda$4($layoutAbsoluteTop$delegate);
    }

    public static final /* synthetic */ void access$BadgedBox$lambda$5(MutableFloatState $layoutAbsoluteTop$delegate, float value) {
        BadgedBox$lambda$5($layoutAbsoluteTop$delegate, value);
    }

    public static final /* synthetic */ float access$BadgedBox$lambda$7(MutableFloatState $greatGrandParentAbsoluteRight$delegate) {
        return BadgedBox$lambda$7($greatGrandParentAbsoluteRight$delegate);
    }

    public static final /* synthetic */ void access$BadgedBox$lambda$8(MutableFloatState $greatGrandParentAbsoluteRight$delegate, float value) {
        BadgedBox$lambda$8($greatGrandParentAbsoluteRight$delegate, value);
    }

    public static final void BadgedBox(final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> r49, Modifier modifier, final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> r51, Composer $composer, final int $changed, final int r54) {
        Composer $composer2 = $composer.startRestartGroup(1404022535);
        ComposerKt.sourceInformation($composer2, "C(BadgedBox)P(!1,2)73@2898L36,74@2964L36,77@3183L57,78@3280L57,90@3679L680,102@4366L2713,80@3343L3736:Badge.kt#uh7d8r");
        int $dirty = $changed;
        if ((r54 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r5 = r54 & 2;
        if (r5 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier r7 = modifier;
    L24:
        if ((r54 & 4) == 0) goto L27;
        $dirty = $dirty | 384;
    L33:
        int $dirty2 = $dirty;
        if (($dirty2 & 147) == 146) goto L36;
    L39:
        if (r5 == 0) goto L41;
        Modifier.Companion modifier2 = Modifier.Companion;
    L43:
        if (ComposerKt.isTraceInProgress() == false) goto L45;
        ComposerKt.traceEventStart(1404022535, $dirty2, -1, "androidx.compose.material3.BadgedBox (Badge.kt:72)");
    L45:
        ComposerKt.sourceInformationMarkerStart($composer2, 437752587, "CC(remember):Badge.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L48;
        Object value$iv = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        $composer2.updateRememberedValue(value$iv);
    L49:
        final MutableFloatState layoutAbsoluteLeft$delegate = (MutableFloatState) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 437754699, "CC(remember):Badge.kt#9igjgp");
        Object it$iv2 = $composer2.rememberedValue();
        if (it$iv2 != Composer.Companion.getEmpty()) goto L52;
        Object value$iv2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        $composer2.updateRememberedValue(value$iv2);
    L53:
        final MutableFloatState layoutAbsoluteTop$delegate = (MutableFloatState) value$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 437761728, "CC(remember):Badge.kt#9igjgp");
        Object it$iv3 = $composer2.rememberedValue();
        if (it$iv3 != Composer.Companion.getEmpty()) goto L56;
        Object value$iv3 = PrimitiveSnapshotStateKt.mutableFloatStateOf(Float.POSITIVE_INFINITY);
        $composer2.updateRememberedValue(value$iv3);
    L57:
        final MutableFloatState greatGrandParentAbsoluteRight$delegate = (MutableFloatState) value$iv3;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 437764832, "CC(remember):Badge.kt#9igjgp");
        Object it$iv4 = $composer2.rememberedValue();
        if (it$iv4 != Composer.Companion.getEmpty()) goto L60;
        Object value$iv4 = PrimitiveSnapshotStateKt.mutableFloatStateOf(Float.NEGATIVE_INFINITY);
        $composer2.updateRememberedValue(value$iv4);
    L61:
        final MutableFloatState greatGrandParentAbsoluteTop$delegate = (MutableFloatState) value$iv4;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 437778223, "CC(remember):Badge.kt#9igjgp");
        Object it$iv5 = $composer2.rememberedValue();
        if (it$iv5 != Composer.Companion.getEmpty()) goto L64;
        Object value$iv5 = (Function1) new BadgeKt$BadgedBox$2$1(layoutAbsoluteLeft$delegate, layoutAbsoluteTop$delegate, greatGrandParentAbsoluteRight$delegate, greatGrandParentAbsoluteTop$delegate);
        $composer2.updateRememberedValue(value$iv5);
    L65:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier modifier$iv = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier2, (Function1) value$iv5);
        ComposerKt.sourceInformationMarkerStart($composer2, 437802240, "CC(remember):Badge.kt#9igjgp");
        Object it$iv6 = $composer2.rememberedValue();
        if (it$iv6 != Composer.Companion.getEmpty()) goto L68;
        MeasurePolicy value$iv6 = new BadgeKt$BadgedBox$3$1(layoutAbsoluteTop$delegate, layoutAbsoluteLeft$delegate, greatGrandParentAbsoluteRight$delegate, greatGrandParentAbsoluteTop$delegate);
        $composer2.updateRememberedValue(value$iv6);
    L69:
        MeasurePolicy measurePolicy$iv = (MeasurePolicy) value$iv6;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r17 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv = ((384 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L72;
        ComposablesKt.invalidApplier();
    L72:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L75;
        Function0<ComposeUiNode> r0 = r17;
        $composer2.createNode(r0);
    L76:
        Composer $this$Layout_u24lambda_u240$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r6 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv.getInserting() == true) goto L82;
        Composer $composer3 = $composer2;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv)) == true) goto L84;
    L83:
        $this$Layout_u24lambda_u240$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
        $this$Layout_u24lambda_u240$iv.apply(Integer.valueOf(compositeKeyHash$iv), r6);
    L84:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
        int r1 = ($changed$iv$iv >> 6) & 14;
        Composer $composer4 = $composer3;
        ComposerKt.sourceInformationMarkerStart($composer4, -800356556, "C82@3373L161,87@3547L59:Badge.kt#uh7d8r");
        Modifier modifier$iv2 = LayoutIdKt.layoutId(Modifier.Companion, "anchor");
        Alignment contentAlignment$iv = Alignment.Companion.getCenter();
        int $changed$iv = (($dirty2 << 3) & 7168) | 54;
        ComposerKt.sourceInformationMarkerStart($composer4, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv2 = ($changed$iv << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer4, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer4, 0);
        CompositionLocalMap localMap$iv$iv = $composer4.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer4, modifier$iv2);
        Function0<ComposeUiNode> r38 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv2 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer4.getApplier() instanceof Applier) == true) goto L87;
        ComposablesKt.invalidApplier();
    L87:
        $composer4.startReusableNode();
        if ($composer4.getInserting() == false) goto L90;
        Function0<ComposeUiNode> r8 = r38;
        $composer4.createNode(r8);
    L91:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer4);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r9 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L98;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L98;
    L99:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r2 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        r51.invoke(BoxScopeInstance.INSTANCE, $composer4, Integer.valueOf((($changed$iv >> 6) & 112) | 6));
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
        ComposerKt.sourceInformationMarkerStart($composer4, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash($composer4, 0);
        CompositionLocalMap localMap$iv$iv2 = $composer4.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer4, modifier$iv3);
        Function0<ComposeUiNode> r33 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv2 = (($changed$iv$iv3 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer4.getApplier() instanceof Applier) == true) goto L102;
        ComposablesKt.invalidApplier();
    L102:
        $composer4.startReusableNode();
        if ($composer4.getInserting() == false) goto L105;
        Function0<ComposeUiNode> r4 = r33;
        $composer4.createNode(r4);
    L106:
        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m3808constructorimpl($composer4);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv3, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv2.getInserting() == true) goto L113;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv2.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv2)) == false) goto L113;
    L114:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
        int r10 = ($changed$iv$iv$iv2 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        r49.invoke(BoxScopeInstance.INSTANCE, $composer4, Integer.valueOf((($changed$iv2 >> 6) & 112) | 6));
        ComposerKt.sourceInformationMarkerEnd($composer4);
        $composer4.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer4);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L117;
        ComposerKt.traceEventEnd();
    L117:
        final Modifier modifier3 = modifier2;
    L118:
        ScopeUpdateScope r11 = $composer3.endRestartGroup();
        if (r11 == null) goto L122;
        r11.updateScope(new AnonymousClass4(r49, modifier3, r51, $changed, r54));
        return;
    L122:
        return;
    L113:
        $this$Layout_u24lambda_u240$iv$iv2.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv2));
        $this$Layout_u24lambda_u240$iv$iv2.apply(Integer.valueOf(compositeKeyHash$iv$iv2), r3);
        goto L114
    L105:
        r4 = r33;
        $composer4.useNode();
    L98:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r9);
        goto L99
    L90:
        r8 = r38;
        $composer4.useNode();
        goto L91
    L82:
        $composer3 = $composer2;
        goto L83
    L75:
        r0 = r17;
        $composer2.useNode();
        goto L76
    L68:
        value$iv6 = it$iv6;
        goto L69
    L64:
        value$iv5 = it$iv5;
        goto L65
    L60:
        value$iv4 = it$iv4;
        goto L61
    L56:
        value$iv3 = it$iv3;
        goto L57
    L52:
        value$iv2 = it$iv2;
        goto L53
    L48:
        value$iv = it$iv;
        goto L49
    L41:
        modifier2 = r7;
        goto L43
    L36:
        if ($composer2.getSkipping() == false) goto L39;
        $composer2.skipToGroupEnd();
        $composer3 = $composer2;
        modifier3 = r7;
        goto L118
    L27:
        if (($changed & 384) != 0) goto L33;
        if ($composer2.changedInstance(r51) == false) goto L31;
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
        if ($composer2.changedInstance(r49) == false) goto L10;
        int r14 = 4;
    L11:
        $dirty = $dirty | r14;
        goto L12
    L10:
        r14 = 2;
        goto L11
    }

    private static final float BadgedBox$lambda$1(MutableFloatState $layoutAbsoluteLeft$delegate) {
        MutableFloatState $this$getValue$iv = $layoutAbsoluteLeft$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    private static final void BadgedBox$lambda$2(MutableFloatState $layoutAbsoluteLeft$delegate, float value) {
        $layoutAbsoluteLeft$delegate.setFloatValue(value);
    }

    private static final float BadgedBox$lambda$4(MutableFloatState $layoutAbsoluteTop$delegate) {
        MutableFloatState $this$getValue$iv = $layoutAbsoluteTop$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    private static final void BadgedBox$lambda$5(MutableFloatState $layoutAbsoluteTop$delegate, float value) {
        $layoutAbsoluteTop$delegate.setFloatValue(value);
    }

    private static final float BadgedBox$lambda$7(MutableFloatState $greatGrandParentAbsoluteRight$delegate) {
        MutableFloatState $this$getValue$iv = $greatGrandParentAbsoluteRight$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    private static final void BadgedBox$lambda$8(MutableFloatState $greatGrandParentAbsoluteRight$delegate, float value) {
        $greatGrandParentAbsoluteRight$delegate.setFloatValue(value);
    }

    private static final float BadgedBox$lambda$10(MutableFloatState $greatGrandParentAbsoluteTop$delegate) {
        MutableFloatState $this$getValue$iv = $greatGrandParentAbsoluteTop$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    private static final void BadgedBox$lambda$11(MutableFloatState $greatGrandParentAbsoluteTop$delegate, float value) {
        $greatGrandParentAbsoluteTop$delegate.setFloatValue(value);
    }

    /* JADX INFO: renamed from: Badge-eopBjH0, reason: not valid java name */
    public static final void m1916BadgeeopBjH0(Modifier modifier, long containerColor, long contentColor, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r37, Composer $composer, final int $changed, final int r40) {
        Composer $composer2 = $composer.startRestartGroup(1298144073);
        ComposerKt.sourceInformation($composer2, "C(Badge)P(3,0:c#ui.graphics.Color,2:c#ui.graphics.Color)180@8028L14,181@8070L31,193@8428L874:Badge.kt#uh7d8r");
        int $dirty = $changed;
        int r2 = r40 & 1;
        if (r2 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r4 = modifier;
    L14:
        if (($changed & 48) == 0) goto L16;
        long r5 = containerColor;
    L25:
        if (($changed & 384) == 0) goto L27;
        long contentColor2 = contentColor;
    L35:
        int r8 = r40 & 8;
        if (r8 == 0) goto L39;
        $dirty = $dirty | 3072;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r12 = r37;
    L47:
        if (($dirty & 1171) == 1170) goto L49;
    L52:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L55;
    L64:
        if (r2 == 0) goto L66;
        Modifier.Companion modifier2 = Modifier.Companion;
    L68:
        if ((r40 & 2) == 0) goto L70;
        long containerColor2 = BadgeDefaults.INSTANCE.getContainerColor($composer2, 6);
        $dirty = $dirty & (-113);
    L72:
        if ((r40 & 4) == 0) goto L74;
        contentColor2 = ColorSchemeKt.m2057contentColorForek8zF_U(containerColor2, $composer2, ($dirty >> 3) & 14);
        $dirty = $dirty & (-897);
    L74:
        if (r8 == 0) goto L76;
        r12 = null;
    L76:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L79;
        ComposerKt.traceEventStart(1298144073, $dirty, -1, "androidx.compose.material3.Badge (Badge.kt:183)");
    L79:
        BadgeTokens r0 = BadgeTokens.INSTANCE;
        if (r12 == null) goto L82;
        float size = r0.m3140getLargeSizeD9Ej5fM();
    L83:
        if (r12 == null) goto L85;
        $composer2.startReplaceGroup(-1271801170);
        ComposerKt.sourceInformation($composer2, "187@8325L5");
        Shape shape = ShapesKt.getValue(BadgeTokens.INSTANCE.getLargeShape(), $composer2, 6);
        $composer2.endReplaceGroup();
    L86:
        Modifier r9 = BackgroundKt.m233backgroundbw27NRU(SizeKt.m756defaultMinSizeVpY3zN4(modifier2, size, size), containerColor2, shape);
        if (r12 == null) goto L89;
        Modifier.Companion r1 = PaddingKt.m727paddingVpY3zN4$default(Modifier.Companion, BadgeWithContentHorizontalPadding, 0.0f, 2, null);
    L90:
        Modifier r3 = r9.then(r1);
        Alignment.Vertical r6 = Alignment.Companion.getCenterVertically();
        Arrangement.HorizontalOrVertical r10 = Arrangement.INSTANCE.getCenter();
        int $dirty2 = $dirty;
        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(r10, r6, $composer2, ((432 >> 3) & 14) | ((432 >> 3) & 112));
        int $changed$iv$iv = (432 << 3) & 112;
        Modifier modifier3 = modifier2;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, r3);
        Function0<ComposeUiNode> r19 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L93;
        ComposablesKt.invalidApplier();
    L93:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L96;
        Function0<ComposeUiNode> r7 = r19;
        $composer2.createNode(r7);
    L97:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r11 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L103;
        long containerColor3 = containerColor2;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == true) goto L105;
    L104:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r11);
    L105:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r13 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -407918630, "C100@5047L9:Row.kt#2w3rfo");
        int r14 = ((432 >> 6) & 112) | 6;
        final RowScope $this$Badge_eopBjH0_u24lambda_u2415 = RowScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, -1324532516, "C:Badge.kt#uh7d8r");
        $composer2.startReplaceGroup(-1705294841);
        ComposerKt.sourceInformation($composer2, "208@9105L5,212@9259L13,209@9123L163");
        if (r12 == null) goto L109;
        TextStyle style = TypographyKt.getValue(BadgeTokens.INSTANCE.getLargeLabelTextFont(), $composer2, 6);
        ProvideContentColorTextStyleKt.m3029ProvideContentColorTextStyle3JVO9M(contentColor2, style, ComposableLambdaKt.rememberComposableLambda(719214594, true, new BadgeKt$Badge$1$1(r12, $this$Badge_eopBjH0_u24lambda_u2415), $composer2, 54), $composer2, (($dirty2 >> 6) & 14) | 384);
    L109:
        $composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L112;
        ComposerKt.traceEventEnd();
    L112:
        final Modifier modifier4 = modifier3;
        final long containerColor4 = containerColor3;
        final long contentColor3 = contentColor2;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r15 = r12;
    L113:
        ScopeUpdateScope r16 = $composer2.endRestartGroup();
        if (r16 == null) goto L117;
        r16.updateScope(new BadgeKt$Badge$2(modifier4, containerColor4, contentColor3, r15, $changed, r40));
        return;
    L117:
        return;
    L103:
        containerColor3 = containerColor2;
        goto L104
    L96:
        r7 = r19;
        $composer2.useNode();
        goto L97
    L89:
        r1 = Modifier.Companion;
        goto L90
    L85:
        $composer2.startReplaceGroup(-1271743789);
        ComposerKt.sourceInformation($composer2, "189@8378L5");
        shape = ShapesKt.getValue(BadgeTokens.INSTANCE.getShape(), $composer2, 6);
        $composer2.endReplaceGroup();
        goto L86
    L82:
        size = r0.m3141getSizeD9Ej5fM();
        goto L83
    L70:
        containerColor2 = r5;
        goto L72
    L66:
        modifier2 = r4;
        goto L68
    L55:
        if ($composer2.getDefaultsInvalid() == true) goto L64;
        $composer2.skipToGroupEnd();
        if ((r40 & 2) == 0) goto L61;
        $dirty = $dirty & (-113);
    L61:
        if ((r40 & 4) == 0) goto L63;
        $dirty = $dirty & (-897);
    L63:
        modifier2 = r4;
        containerColor2 = r5;
        goto L76
    L49:
        if ($composer2.getSkipping() == false) goto L52;
        $composer2.skipToGroupEnd();
        modifier4 = r4;
        containerColor4 = r5;
        contentColor3 = contentColor2;
        r15 = r12;
        goto L113
    L39:
        if (($changed & 3072) != 0) goto L45;
        r12 = r37;
        if ($composer2.changedInstance(r12) == false) goto L43;
        int r17 = 2048;
    L44:
        $dirty = $dirty | r17;
        goto L47
    L43:
        r17 = 1024;
        goto L44
    L45:
        r12 = r37;
        goto L47
    L27:
        if ((r40 & 4) != 0) goto L31;
        contentColor2 = contentColor;
        if ($composer2.changed(contentColor2) == false) goto L32;
        int r18 = 256;
    L33:
        $dirty = $dirty | r18;
    L32:
        r18 = 128;
        goto L33
    L31:
        contentColor2 = contentColor;
        goto L32
    L16:
        if ((r40 & 2) != 0) goto L20;
        r5 = containerColor;
        if ($composer2.changed(r5) == false) goto L21;
        int r20 = 32;
    L22:
        $dirty = $dirty | r20;
    L21:
        r20 = 16;
        goto L22
    L20:
        r5 = containerColor;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L10;
        int r21 = 4;
    L11:
        $dirty = $dirty | r21;
        goto L14
    L10:
        r21 = 2;
        goto L11
    L12:
        r4 = modifier;
        goto L14
    }

    static {
        BadgeWithContentHorizontalPadding = Dp.m6973constructorimpl(4);
        BadgeWithContentHorizontalOffset = Dp.m6973constructorimpl(12);
        BadgeWithContentVerticalOffset = Dp.m6973constructorimpl(14);
        BadgeOffset = Dp.m6973constructorimpl(6);
    }

    public static final float getBadgeWithContentHorizontalPadding() {
        return BadgeWithContentHorizontalPadding;
    }

    public static final float getBadgeWithContentHorizontalOffset() {
        return BadgeWithContentHorizontalOffset;
    }

    public static final float getBadgeWithContentVerticalOffset() {
        return BadgeWithContentVerticalOffset;
    }

    public static final float getBadgeOffset() {
        return BadgeOffset;
    }
}
