package androidx.compose.material3;

import android.content.res.Configuration;
import android.view.View;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: compiled from: ExposedDropdownMenu.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aQ\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a+\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016H\u0003¢\u0006\u0002\u0010\u0017\u001a\"\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u0019H\u0002\u001aV\u0010\u001e\u001a\u00020\n*\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a\u000e\u0010)\u001a\u00020\u001b*\u0004\u0018\u00010*H\u0002\u001a\f\u0010+\u001a\u00020\u001b*\u00020\u0012H\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006,²\u0006\f\u0010-\u001a\u0004\u0018\u00010*X\u008a\u008e\u0002²\u0006\n\u0010.\u001a\u00020\u0019X\u008a\u008e\u0002²\u0006\n\u0010/\u001a\u00020\u0019X\u008a\u008e\u0002"}, d2 = {"ExposedDropdownMenuItemHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ExposedDropdownMenuBox", "", "expanded", "", "onExpandedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Landroidx/compose/material3/ExposedDropdownMenuBoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "SoftKeyboardListener", "view", "Landroid/view/View;", "density", "Landroidx/compose/ui/unit/Density;", "onKeyboardVisibilityChange", "Lkotlin/Function0;", "(Landroid/view/View;Landroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "calculateMaxHeight", "", "windowBounds", "Landroidx/compose/ui/geometry/Rect;", "anchorBounds", "verticalMargin", "expandable", "anchorType", "Landroidx/compose/material3/MenuAnchorType;", "expandedDescription", "", "collapsedDescription", "toggleDescription", "keyboardController", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "expandable-Gq7TBQ4", "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/platform/SoftwareKeyboardController;)Landroidx/compose/ui/Modifier;", "getAnchorBounds", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getWindowBounds", "material3_release", "anchorCoordinates", "anchorWidth", "menuMaxHeight"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ExposedDropdownMenu_androidKt {
    private static final float ExposedDropdownMenuItemHorizontalPadding = 0.0f;

    public static final /* synthetic */ LayoutCoordinates access$ExposedDropdownMenuBox$lambda$2(MutableState $anchorCoordinates$delegate) {
        return ExposedDropdownMenuBox$lambda$2($anchorCoordinates$delegate);
    }

    public static final /* synthetic */ void access$ExposedDropdownMenuBox$lambda$3(MutableState $anchorCoordinates$delegate, LayoutCoordinates value) {
        ExposedDropdownMenuBox$lambda$3($anchorCoordinates$delegate, value);
    }

    public static final /* synthetic */ int access$ExposedDropdownMenuBox$lambda$5(MutableIntState $anchorWidth$delegate) {
        return ExposedDropdownMenuBox$lambda$5($anchorWidth$delegate);
    }

    public static final /* synthetic */ void access$ExposedDropdownMenuBox$lambda$6(MutableIntState $anchorWidth$delegate, int value) {
        ExposedDropdownMenuBox$lambda$6($anchorWidth$delegate, value);
    }

    public static final /* synthetic */ int access$ExposedDropdownMenuBox$lambda$8(MutableIntState $menuMaxHeight$delegate) {
        return ExposedDropdownMenuBox$lambda$8($menuMaxHeight$delegate);
    }

    public static final /* synthetic */ void access$ExposedDropdownMenuBox$lambda$9(MutableIntState $menuMaxHeight$delegate, int value) {
        ExposedDropdownMenuBox$lambda$9($menuMaxHeight$delegate, value);
    }

    public static final /* synthetic */ void access$SoftKeyboardListener(View view, Density density, Function0 onKeyboardVisibilityChange, Composer $composer, int $changed) {
        SoftKeyboardListener(view, density, onKeyboardVisibilityChange, $composer, $changed);
    }

    public static final /* synthetic */ int access$calculateMaxHeight(Rect windowBounds, Rect anchorBounds, int verticalMargin) {
        return calculateMaxHeight(windowBounds, anchorBounds, verticalMargin);
    }

    /* JADX INFO: renamed from: access$expandable-Gq7TBQ4, reason: not valid java name */
    public static final /* synthetic */ Modifier m2218access$expandableGq7TBQ4(Modifier $receiver, boolean expanded, Function0 onExpandedChange, String anchorType, String expandedDescription, String collapsedDescription, String toggleDescription, SoftwareKeyboardController keyboardController) {
        return m2219expandableGq7TBQ4($receiver, expanded, onExpandedChange, anchorType, expandedDescription, collapsedDescription, toggleDescription, keyboardController);
    }

    public static final /* synthetic */ Rect access$getAnchorBounds(LayoutCoordinates $receiver) {
        return getAnchorBounds($receiver);
    }

    public static final /* synthetic */ float access$getExposedDropdownMenuItemHorizontalPadding$p() {
        return ExposedDropdownMenuItemHorizontalPadding;
    }

    public static final /* synthetic */ Rect access$getWindowBounds(View $receiver) {
        return getWindowBounds($receiver);
    }

    public static final void ExposedDropdownMenuBox(final boolean expanded, final Function1<? super Boolean, Unit> r48, Modifier modifier, Function3<? super ExposedDropdownMenuBoxScope, ? super Composer, ? super Integer, Unit> r50, Composer $composer, final int $changed, final int r53) {
        final boolean r1 = expanded;
        final Function1<? super Boolean, Unit> r2 = r48;
        Composer $composer2 = $composer.startRestartGroup(2067579792);
        ComposerKt.sourceInformation($composer2, "C(ExposedDropdownMenuBox)P(1,3,2)140@6498L7,141@6531L7,142@6570L7,146@6683L53,147@6760L33,148@6819L33,150@6879L29,151@6970L7,152@7008L31,153@7071L32,154@7132L37,155@7196L62,158@7284L2210,200@9543L361,199@9500L442,225@10317L47,225@10306L58,229@10529L27,229@10497L59:ExposedDropdownMenu.android.kt#uh7d8r");
        int $dirty = $changed;
        if ((r53 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r53 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L22:
        int r4 = r53 & 4;
        if (r4 == 0) goto L26;
        $dirty = $dirty | 384;
        Modifier r6 = modifier;
    L34:
        if ((r53 & 8) == 0) goto L37;
        $dirty = $dirty | 3072;
    L44:
        if (($dirty & 1171) == 1170) goto L46;
    L49:
        if (r4 == 0) goto L51;
        Modifier.Companion modifier2 = Modifier.Companion;
    L53:
        if (ComposerKt.isTraceInProgress() == false) goto L55;
        ComposerKt.traceEventStart(2067579792, $dirty, -1, "androidx.compose.material3.ExposedDropdownMenuBox (ExposedDropdownMenu.android.kt:139)");
    L55:
        ProvidableCompositionLocal<Configuration> r0 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r10 = $composer2.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Configuration config = (Configuration) r10;
        ProvidableCompositionLocal<View> r7 = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r16 = $composer2.consume(r7);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final View view = (View) r16;
        ProvidableCompositionLocal<Density> r8 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r17 = $composer2.consume(r8);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Density density = (Density) r17;
        final int verticalMargin = density.mo370roundToPx0680j_4(MenuKt.getMenuVerticalMargin());
        ComposerKt.sourceInformationMarkerStart($composer2, 426259219, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L58;
        Object value$iv = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        $composer2.updateRememberedValue(value$iv);
    L59:
        final MutableState anchorCoordinates$delegate = (MutableState) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 426261663, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
        Object it$iv2 = $composer2.rememberedValue();
        if (it$iv2 != Composer.Companion.getEmpty()) goto L62;
        Object value$iv2 = SnapshotIntStateKt.mutableIntStateOf(0);
        $composer2.updateRememberedValue(value$iv2);
    L63:
        MutableIntState anchorWidth$delegate = (MutableIntState) value$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 426263551, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
        Object it$iv3 = $composer2.rememberedValue();
        if (it$iv3 != Composer.Companion.getEmpty()) goto L66;
        Object value$iv3 = SnapshotIntStateKt.mutableIntStateOf(0);
        $composer2.updateRememberedValue(value$iv3);
    L67:
        final MutableIntState menuMaxHeight$delegate = (MutableIntState) value$iv3;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 426265467, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
        Object it$iv4 = $composer2.rememberedValue();
        if (it$iv4 != Composer.Companion.getEmpty()) goto L70;
        Object value$iv4 = new FocusRequester();
        $composer2.updateRememberedValue(value$iv4);
    L71:
        final FocusRequester focusRequester = (FocusRequester) value$iv4;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ProvidableCompositionLocal<SoftwareKeyboardController> r3 = CompositionLocalsKt.getLocalSoftwareKeyboardController();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r9 = $composer2.consume(r3);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        SoftwareKeyboardController keyboardController = (SoftwareKeyboardController) r9;
        Strings.Companion r5 = Strings.Companion;
        String expandedDescription = Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(R.string.m3c_dropdown_menu_expanded), $composer2, 0);
        Strings.Companion r11 = Strings.Companion;
        String collapsedDescription = Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(R.string.m3c_dropdown_menu_collapsed), $composer2, 0);
        Strings.Companion r12 = Strings.Companion;
        String toggleDescription = Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(R.string.m3c_dropdown_menu_toggle), $composer2, 0);
        ComposerKt.sourceInformationMarkerStart($composer2, 426275644, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
        Object value$iv5 = $composer2.rememberedValue();
        if (value$iv5 != Composer.Companion.getEmpty()) goto L75;
        value$iv5 = SnapshotStateKt.mutableStateOf$default(MenuAnchorType.m2344boximpl(MenuAnchorType.Companion.m2352getPrimaryNotEditableMg6Rgbw()), null, 2, null);
        $composer2.updateRememberedValue(value$iv5);
    L75:
        MutableState anchorTypeState = (MutableState) value$iv5;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 426280608, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
        boolean invalid$iv = true;
        if (($dirty & 14) != 4) goto L78;
        boolean r13 = true;
    L80:
        if (($dirty & 112) != 32) goto L82;
        boolean r14 = true;
    L83:
        boolean invalid$iv2 = (((r13 | r14) | $composer2.changed(config)) | $composer2.changed(view)) | $composer2.changed(density);
        Object it$iv5 = $composer2.rememberedValue();
        if (invalid$iv2 == false) goto L86;
    L89:
        final String collapsedDescription2 = collapsedDescription;
        final MutableIntState anchorWidth$delegate2 = anchorWidth$delegate;
        final MutableState anchorTypeState2 = anchorTypeState;
        final String expandedDescription2 = expandedDescription;
        final String expandedDescription3 = toggleDescription;
        final SoftwareKeyboardController keyboardController2 = keyboardController;
        Object value$iv6 = new ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1(focusRequester, expanded, expandedDescription2, collapsedDescription2, expandedDescription3, keyboardController2, anchorTypeState2, r48, anchorWidth$delegate2, menuMaxHeight$delegate);
        final FocusRequester focusRequester2 = focusRequester;
        r1 = expanded;
        r2 = r48;
        $composer2.updateRememberedValue(value$iv6);
    L90:
        ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1 scope = (ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1) value$iv6;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 426351047, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
        boolean invalid$iv3 = $composer2.changedInstance(view) | $composer2.changed(verticalMargin);
        Object it$iv6 = $composer2.rememberedValue();
        if (invalid$iv3 == true) goto L97;
        if (it$iv6 == Composer.Companion.getEmpty()) goto L97;
        Object value$iv7 = it$iv6;
        final int verticalMargin2 = verticalMargin;
        final MutableIntState menuMaxHeight$delegate2 = menuMaxHeight$delegate;
    L98:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier modifier$iv = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier2, (Function1) value$iv7);
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r33 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L101;
        ComposablesKt.invalidApplier();
    L101:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L104;
        Function0<ComposeUiNode> r15 = r33;
        $composer2.createNode(r15);
    L105:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r18 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L112;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L112;
    L113:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r19 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r20 = BoxScopeInstance.INSTANCE;
        int r21 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -615130921, "C211@9927L9:ExposedDropdownMenu.android.kt#uh7d8r");
        final Function3<? super ExposedDropdownMenuBoxScope, ? super Composer, ? super Integer, Unit> r22 = r50;
        r22.invoke(scope, $composer2, Integer.valueOf(($dirty >> 6) & 112));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.startReplaceGroup(426363998);
        ComposerKt.sourceInformation($composer2, "215@10008L286,215@9972L322");
        if (r1 == false) goto L125;
        ComposerKt.sourceInformationMarkerStart($composer2, 426365852, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
        boolean invalid$iv4 = $composer2.changedInstance(view) | $composer2.changed(verticalMargin2);
        Object it$iv7 = $composer2.rememberedValue();
        if (invalid$iv4 == true) goto L122;
        if (it$iv7 == Composer.Companion.getEmpty()) goto L122;
        Object value$iv8 = it$iv7;
    L123:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        SoftKeyboardListener(view, density, (Function0) value$iv8, $composer2, 0);
    L122:
        value$iv8 = (Function0) new ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$3$1(view, verticalMargin2, anchorCoordinates$delegate, menuMaxHeight$delegate2);
        $composer2.updateRememberedValue(value$iv8);
    L125:
        $composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerStart($composer2, 426375501, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
        if (($dirty & 14) != 4) goto L128;
        boolean invalid$iv5 = true;
    L129:
        Object it$iv8 = $composer2.rememberedValue();
        if (invalid$iv5 == true) goto L136;
        if (it$iv8 == Composer.Companion.getEmpty()) goto L136;
        Object value$iv9 = it$iv8;
    L137:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.SideEffect((Function0) value$iv9, $composer2, 0);
        ComposerKt.sourceInformationMarkerStart($composer2, 426382265, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
        if (($dirty & 112) == 32) goto L141;
        invalid$iv = false;
    L141:
        Object it$iv9 = $composer2.rememberedValue();
        if (invalid$iv == false) goto L144;
    L147:
        Object value$iv10 = (Function0) new ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$5$1(r2);
        $composer2.updateRememberedValue(value$iv10);
    L148:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        BackHandlerKt.BackHandler(r1, (Function0) value$iv10, $composer2, $dirty & 14, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L151;
        ComposerKt.traceEventEnd();
    L151:
        final Modifier modifier3 = modifier2;
    L152:
        ScopeUpdateScope r23 = $composer2.endRestartGroup();
        if (r23 == null) goto L156;
        r23.updateScope(new AnonymousClass6(r1, r2, modifier3, r22, $changed, r53));
        return;
    L156:
        return;
    L144:
        if (it$iv9 == Composer.Companion.getEmpty()) goto L147;
        value$iv10 = it$iv9;
    L136:
        value$iv9 = (Function0) new ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$4$1(r1, focusRequester2);
        $composer2.updateRememberedValue(value$iv9);
        goto L137
    L128:
        invalid$iv5 = false;
    L112:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r18);
        goto L113
    L104:
        r15 = r33;
        $composer2.useNode();
    L97:
        final MutableIntState anchorWidth$delegate3 = anchorWidth$delegate2;
        Function1<LayoutCoordinates, Unit> r110 = new ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$1$1(view, verticalMargin, anchorCoordinates$delegate, anchorWidth$delegate3, menuMaxHeight$delegate);
        verticalMargin2 = verticalMargin;
        menuMaxHeight$delegate2 = menuMaxHeight$delegate;
        value$iv7 = r110;
        $composer2.updateRememberedValue(value$iv7);
        goto L98
    L86:
        if (it$iv5 == Composer.Companion.getEmpty()) goto L89;
        value$iv6 = it$iv5;
        collapsedDescription2 = collapsedDescription;
        anchorWidth$delegate2 = anchorWidth$delegate;
        r2 = r48;
        anchorTypeState2 = anchorTypeState;
        expandedDescription2 = expandedDescription;
        expandedDescription3 = toggleDescription;
        r1 = expanded;
        keyboardController2 = keyboardController;
        focusRequester2 = focusRequester;
        goto L90
    L82:
        r14 = false;
        goto L83
    L78:
        r13 = false;
        goto L80
    L70:
        value$iv4 = it$iv4;
        goto L71
    L66:
        value$iv3 = it$iv3;
        goto L67
    L62:
        value$iv2 = it$iv2;
        goto L63
    L58:
        value$iv = it$iv;
        goto L59
    L51:
        modifier2 = r6;
        goto L53
    L46:
        if ($composer2.getSkipping() == false) goto L49;
        $composer2.skipToGroupEnd();
        modifier3 = r6;
        r22 = r50;
        goto L152
    L37:
        if (($changed & 3072) != 0) goto L44;
        if ($composer2.changedInstance(r50) == false) goto L41;
        int r24 = 2048;
    L42:
        $dirty = $dirty | r24;
        goto L44
    L41:
        r24 = 1024;
        goto L42
    L26:
        if (($changed & 384) != 0) goto L32;
        r6 = modifier;
        if ($composer2.changed(r6) == false) goto L30;
        int r25 = 256;
    L31:
        $dirty = $dirty | r25;
        goto L34
    L30:
        r25 = 128;
        goto L31
    L32:
        r6 = modifier;
        goto L34
    L16:
        if (($changed & 48) != 0) goto L22;
        if ($composer2.changedInstance(r2) == false) goto L20;
        int r26 = 32;
    L21:
        $dirty = $dirty | r26;
        goto L22
    L20:
        r26 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(r1) == false) goto L10;
        int r27 = 4;
    L11:
        $dirty = $dirty | r27;
        goto L13
    L10:
        r27 = 2;
        goto L11
    }

    private static final LayoutCoordinates ExposedDropdownMenuBox$lambda$2(MutableState<LayoutCoordinates> r4) {
        MutableState<LayoutCoordinates> $this$getValue$iv = r4;
        return $this$getValue$iv.getValue();
    }

    private static final void ExposedDropdownMenuBox$lambda$3(MutableState<LayoutCoordinates> r4, LayoutCoordinates value) {
        r4.setValue(value);
    }

    private static final int ExposedDropdownMenuBox$lambda$5(MutableIntState $anchorWidth$delegate) {
        MutableIntState $this$getValue$iv = $anchorWidth$delegate;
        return $this$getValue$iv.getIntValue();
    }

    private static final void ExposedDropdownMenuBox$lambda$6(MutableIntState $anchorWidth$delegate, int value) {
        $anchorWidth$delegate.setIntValue(value);
    }

    private static final int ExposedDropdownMenuBox$lambda$8(MutableIntState $menuMaxHeight$delegate) {
        MutableIntState $this$getValue$iv = $menuMaxHeight$delegate;
        return $this$getValue$iv.getIntValue();
    }

    private static final void ExposedDropdownMenuBox$lambda$9(MutableIntState $menuMaxHeight$delegate, int value) {
        $menuMaxHeight$delegate.setIntValue(value);
    }

    private static final void SoftKeyboardListener(final View view, final Density density, final Function0<Unit> r10, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1319522472);
        ComposerKt.sourceInformation($composer2, "C(SoftKeyboardListener)P(2)240@10912L1420,240@10880L1452:ExposedDropdownMenu.android.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(view) == false) goto L7;
        int r2 = 4;
    L8:
        $dirty = $dirty | r2;
        goto L10
    L7:
        r2 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changed(density) == false) goto L14;
        int r3 = 32;
    L15:
        $dirty = $dirty | r3;
        goto L17
    L14:
        r3 = 16;
    L17:
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changedInstance(r10) == false) goto L21;
        int r4 = 256;
    L22:
        $dirty = $dirty | r4;
        goto L24
    L21:
        r4 = 128;
    L24:
        if (($dirty & 147) != 146) goto L30;
        if ($composer2.getSkipping() == false) goto L30;
        $composer2.skipToGroupEnd();
    L46:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L50;
        r0.updateScope(new AnonymousClass2(view, density, r10, $changed));
        return;
    L50:
        return;
    L30:
        if (ComposerKt.isTraceInProgress() == false) goto L32;
        ComposerKt.traceEventStart(-1319522472, $dirty, -1, "androidx.compose.material3.SoftKeyboardListener (ExposedDropdownMenu.android.kt:237)");
    L32:
        ComposerKt.sourceInformationMarkerStart($composer2, 1935200244, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
        boolean r1 = $composer2.changedInstance(view);
        if (($dirty & 896) != 256) goto L35;
        boolean r5 = true;
    L36:
        boolean invalid$iv = r1 | r5;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L39;
    L42:
        Object value$iv = (Function1) new ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1(view, r10);
        $composer2.updateRememberedValue(value$iv);
    L43:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.DisposableEffect(view, density, (Function1) value$iv, $composer2, ($dirty & 14) | ($dirty & 112));
        if (ComposerKt.isTraceInProgress() == false) goto L46;
        ComposerKt.traceEventEnd();
        goto L46
    L39:
        if (it$iv == Composer.Companion.getEmpty()) goto L42;
        value$iv = it$iv;
        goto L43
    L35:
        r5 = false;
        goto L36
    }

    /* JADX INFO: renamed from: expandable-Gq7TBQ4, reason: not valid java name */
    private static final Modifier m2219expandableGq7TBQ4(Modifier $this$expandable_u2dGq7TBQ4, final boolean expanded, final Function0<Unit> r12, final String anchorType, final String expandedDescription, final String collapsedDescription, final String toggleDescription, final SoftwareKeyboardController keyboardController) {
        return SemanticsModifierKt.semantics$default(SuspendingPointerInputFilterKt.pointerInput($this$expandable_u2dGq7TBQ4, r12, new ExposedDropdownMenu_androidKt$expandable$1(anchorType, r12, null)), false, new ExposedDropdownMenu_androidKt$expandable$2(anchorType, expanded, expandedDescription, collapsedDescription, toggleDescription, r12, keyboardController), 1, null);
    }

    private static final int calculateMaxHeight(Rect windowBounds, Rect anchorBounds, int verticalMargin) {
        if (anchorBounds != null) goto L5;
        return 0;
    L5:
        float marginedWindowTop = windowBounds.getTop() + verticalMargin;
        float marginedWindowBottom = windowBounds.getBottom() - verticalMargin;
        if (anchorBounds.getTop() <= windowBounds.getBottom()) goto L8;
    L11:
        float heightAbove = marginedWindowBottom - marginedWindowTop;
        int availableHeight = MathKt.roundToInt(heightAbove);
    L13:
        return Math.max(availableHeight, 0);
    L8:
        if (anchorBounds.getBottom() < windowBounds.getTop()) goto L11;
        float heightAbove2 = anchorBounds.getTop() - marginedWindowTop;
        float heightBelow = marginedWindowBottom - anchorBounds.getBottom();
        availableHeight = MathKt.roundToInt(Math.max(heightAbove2, heightBelow));
        goto L13
    }

    private static final Rect getWindowBounds(View $this$getWindowBounds) {
        android.graphics.Rect it = new android.graphics.Rect();
        $this$getWindowBounds.getWindowVisibleDisplayFrame(it);
        return RectHelper_androidKt.toComposeRect(it);
    }

    private static final Rect getAnchorBounds(LayoutCoordinates $this$getAnchorBounds) {
        if ($this$getAnchorBounds != null) goto L5;
        return Rect.Companion.getZero();
    L5:
        return RectKt.m4165Recttz77jQw(LayoutCoordinatesKt.positionInWindow($this$getAnchorBounds), IntSizeKt.m7156toSizeozmzZPI($this$getAnchorBounds.mo5722getSizeYbymL2g()));
    }

    static {
        ExposedDropdownMenuItemHorizontalPadding = Dp.m6973constructorimpl(16);
    }
}
