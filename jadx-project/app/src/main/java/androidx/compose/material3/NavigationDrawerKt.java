package androidx.compose.material3;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.NavigationDrawerTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: NavigationDrawer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001at\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001al\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001aQ\u0010\u001f\u001a\u00020\t2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\t0!¢\u0006\u0002\b\u00192\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020#2\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\t0!¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0002\u0010$\u001at\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00052\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u001aH\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001at\u0010*\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010\u001c\u001al\u0010*\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010\u001e\u001a`\u0010-\u001a\u00020\t2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\t0!¢\u0006\u0002\b\u00192\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010.\u001a\u00020\u00112\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\t0!¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a\u008e\u0001\u00101\u001a\u00020\t2\u0011\u00102\u001a\r\u0012\u0004\u0012\u00020\t0!¢\u0006\u0002\b\u00192\u0006\u00103\u001a\u00020#2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\t0!2\b\b\u0002\u0010\f\u001a\u00020\r2\u0015\b\u0002\u00105\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010!¢\u0006\u0002\b\u00192\u0015\b\u0002\u00106\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010!¢\u0006\u0002\b\u00192\b\b\u0002\u00107\u001a\u00020\u000f2\b\b\u0002\u00108\u001a\u0002092\n\b\u0002\u0010:\u001a\u0004\u0018\u00010;H\u0007¢\u0006\u0002\u0010<\u001al\u0010=\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b>\u0010\u001e\u001a=\u0010?\u001a\u00020\t2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\t0!¢\u0006\u0002\b\u00192\b\b\u0002\u0010\f\u001a\u00020\r2\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\t0!¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0002\u0010@\u001a>\u0010A\u001a\u00020\t2\u0006\u0010B\u001a\u00020#2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\t0!2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00020!2\u0006\u0010E\u001a\u00020\u0011H\u0003ø\u0001\u0000¢\u0006\u0004\bF\u0010G\u001a \u0010H\u001a\u00020\u00022\u0006\u0010I\u001a\u00020\u00022\u0006\u0010J\u001a\u00020\u00022\u0006\u0010K\u001a\u00020\u0002H\u0002\u001a+\u0010L\u001a\u00020\u000b2\u0006\u0010M\u001a\u00020N2\u0014\b\u0002\u0010O\u001a\u000e\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020#0\u0017H\u0007¢\u0006\u0002\u0010P\u001a\u0014\u0010Q\u001a\u00020\u0002*\u00020R2\u0006\u0010&\u001a\u00020'H\u0002\u001a\u0014\u0010S\u001a\u00020\u0002*\u00020R2\u0006\u0010&\u001a\u00020'H\u0002\u001a\u001c\u0010T\u001a\u00020\r*\u00020\r2\u0006\u0010&\u001a\u00020'2\u0006\u0010U\u001a\u00020#H\u0002\u001a\u001c\u0010V\u001a\u00020\r*\u00020\r2\u0006\u0010&\u001a\u00020'2\u0006\u0010U\u001a\u00020#H\u0002\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0002X\u0082D¢\u0006\u0002\n\u0000\"\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u0010\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006W²\u0006\n\u0010X\u001a\u00020#X\u008a\u008e\u0002²\u0006\n\u0010Y\u001a\u00020\u0002X\u008a\u008e\u0002²\u0006\n\u0010X\u001a\u00020#X\u008a\u008e\u0002"}, d2 = {"AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "DrawerPositionalThreshold", "DrawerVelocityThreshold", "Landroidx/compose/ui/unit/Dp;", "F", "MinimumDrawerWidth", "DismissibleDrawerSheet", "", "drawerState", "Landroidx/compose/material3/DrawerState;", "modifier", "Landroidx/compose/ui/Modifier;", "drawerShape", "Landroidx/compose/ui/graphics/Shape;", "drawerContainerColor", "Landroidx/compose/ui/graphics/Color;", "drawerContentColor", "drawerTonalElevation", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "DismissibleDrawerSheet-Snr_uVM", "(Landroidx/compose/material3/DrawerState;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DismissibleDrawerSheet-afqeVBk", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DismissibleNavigationDrawer", "drawerContent", "Lkotlin/Function0;", "gesturesEnabled", "", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DrawerState;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "DrawerSheet", "drawerPredictiveBackState", "Landroidx/compose/material3/DrawerPredictiveBackState;", "DrawerSheet-7zSek6w", "(Landroidx/compose/material3/DrawerPredictiveBackState;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ModalDrawerSheet", "ModalDrawerSheet-Snr_uVM", "ModalDrawerSheet-afqeVBk", "ModalNavigationDrawer", "scrimColor", "ModalNavigationDrawer-FHprtrg", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DrawerState;ZJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "NavigationDrawerItem", "label", "selected", "onClick", "icon", "badge", "shape", "colors", "Landroidx/compose/material3/NavigationDrawerItemColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/NavigationDrawerItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "PermanentDrawerSheet", "PermanentDrawerSheet-afqeVBk", "PermanentNavigationDrawer", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Scrim", "open", "onClose", "fraction", "color", "Scrim-Bx497Mc", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;I)V", "calculateFraction", "a", "b", "pos", "rememberDrawerState", "initialValue", "Landroidx/compose/material3/DrawerValue;", "confirmStateChange", "(Landroidx/compose/material3/DrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DrawerState;", "calculatePredictiveBackScaleX", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "calculatePredictiveBackScaleY", "predictiveBackDrawerChild", "isRtl", "predictiveBackDrawerContainer", "material3_release", "anchorsInitialized", "minValue"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class NavigationDrawerKt {
    private static final TweenSpec<Float> AnimationSpec = null;
    private static final float DrawerPositionalThreshold = 0.0f;
    private static final float DrawerVelocityThreshold = 0.0f;
    private static final float MinimumDrawerWidth = 0.0f;

    public static final /* synthetic */ boolean access$DismissibleNavigationDrawer$lambda$16(MutableState $anchorsInitialized$delegate) {
        return DismissibleNavigationDrawer$lambda$16($anchorsInitialized$delegate);
    }

    public static final /* synthetic */ void access$DismissibleNavigationDrawer$lambda$17(MutableState $anchorsInitialized$delegate, boolean value) {
        DismissibleNavigationDrawer$lambda$17($anchorsInitialized$delegate, value);
    }

    public static final /* synthetic */ boolean access$ModalNavigationDrawer_FHprtrg$lambda$2(MutableState $anchorsInitialized$delegate) {
        return ModalNavigationDrawer_FHprtrg$lambda$2($anchorsInitialized$delegate);
    }

    public static final /* synthetic */ void access$ModalNavigationDrawer_FHprtrg$lambda$3(MutableState $anchorsInitialized$delegate, boolean value) {
        ModalNavigationDrawer_FHprtrg$lambda$3($anchorsInitialized$delegate, value);
    }

    public static final /* synthetic */ float access$ModalNavigationDrawer_FHprtrg$lambda$5(MutableFloatState $minValue$delegate) {
        return ModalNavigationDrawer_FHprtrg$lambda$5($minValue$delegate);
    }

    public static final /* synthetic */ void access$ModalNavigationDrawer_FHprtrg$lambda$6(MutableFloatState $minValue$delegate, float value) {
        ModalNavigationDrawer_FHprtrg$lambda$6($minValue$delegate, value);
    }

    /* JADX INFO: renamed from: access$Scrim-Bx497Mc, reason: not valid java name */
    public static final /* synthetic */ void m2415access$ScrimBx497Mc(boolean open, Function0 onClose, Function0 fraction, long color, Composer $composer, int $changed) {
        m2414ScrimBx497Mc(open, onClose, fraction, color, $composer, $changed);
    }

    public static final /* synthetic */ float access$calculateFraction(float a, float b, float pos) {
        return calculateFraction(a, b, pos);
    }

    public static final /* synthetic */ float access$calculatePredictiveBackScaleX(GraphicsLayerScope $receiver, DrawerPredictiveBackState drawerPredictiveBackState) {
        return calculatePredictiveBackScaleX($receiver, drawerPredictiveBackState);
    }

    public static final /* synthetic */ float access$calculatePredictiveBackScaleY(GraphicsLayerScope $receiver, DrawerPredictiveBackState drawerPredictiveBackState) {
        return calculatePredictiveBackScaleY($receiver, drawerPredictiveBackState);
    }

    public static final /* synthetic */ TweenSpec access$getAnimationSpec$p() {
        return AnimationSpec;
    }

    public static final /* synthetic */ float access$getDrawerPositionalThreshold$p() {
        return DrawerPositionalThreshold;
    }

    public static final /* synthetic */ float access$getDrawerVelocityThreshold$p() {
        return DrawerVelocityThreshold;
    }

    public static final /* synthetic */ float access$getMinimumDrawerWidth$p() {
        return MinimumDrawerWidth;
    }

    public static final /* synthetic */ Modifier access$predictiveBackDrawerChild(Modifier $receiver, DrawerPredictiveBackState drawerPredictiveBackState, boolean isRtl) {
        return predictiveBackDrawerChild($receiver, drawerPredictiveBackState, isRtl);
    }

    public static final DrawerState rememberDrawerState(final DrawerValue initialValue, final Function1 r9, Composer $composer, int $changed, int r12) {
        ComposerKt.sourceInformationMarkerStart($composer, 2098699222, "C(rememberDrawerState)P(1)286@11488L61,286@11424L125:NavigationDrawer.kt#uh7d8r");
        if ((r12 & 2) == 0) goto L6;
        Function1 confirmStateChange = C05451.INSTANCE;
        r9 = confirmStateChange;
    L6:
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventStart(2098699222, $changed, -1, "androidx.compose.material3.rememberDrawerState (NavigationDrawer.kt:285)");
    L8:
        boolean r13 = false;
        Object[] r0 = new Object[0];
        Saver<DrawerState, DrawerValue> r1 = DrawerState.Companion.Saver(r9);
        ComposerKt.sourceInformationMarkerStart($composer, -666801427, "CC(remember):NavigationDrawer.kt#9igjgp");
        if ((($changed & 14) ^ 6) <= 4) goto L13;
        if ($composer.changed(initialValue) == false) goto L13;
    L14:
        boolean r2 = true;
    L17:
        if ((($changed & 112) ^ 48) <= 32) goto L21;
        if ($composer.changed(r9) == false) goto L21;
    L22:
        r13 = true;
    L23:
        boolean invalid$iv = r13 | r2;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L26;
    L29:
        Object value$iv = (Function0) new NavigationDrawerKt$rememberDrawerState$2$1(initialValue, r9);
        $composer.updateRememberedValue(value$iv);
    L30:
        ComposerKt.sourceInformationMarkerEnd($composer);
        DrawerState r10 = (DrawerState) RememberSaveableKt.m3923rememberSaveable(r0, r1, null, (Function0) value$iv, $composer, 0, 4);
        if (ComposerKt.isTraceInProgress() == false) goto L33;
        ComposerKt.traceEventEnd();
    L33:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r10;
    L26:
        if (it$iv == Composer.Companion.getEmpty()) goto L29;
        value$iv = it$iv;
    L21:
        if (($changed & 48) != 32) goto L23;
    L13:
        if (($changed & 6) == 4) goto L14;
        r2 = false;
        goto L17
    }

    /* JADX INFO: renamed from: ModalNavigationDrawer-FHprtrg, reason: not valid java name */
    public static final void m2412ModalNavigationDrawerFHprtrg(Function2<? super Composer, ? super Integer, Unit> r62, Modifier modifier, DrawerState drawerState, boolean gesturesEnabled, long scrimColor, final Function2<? super Composer, ? super Integer, Unit> r68, Composer $composer, final int $changed, final int r71) {
        final Function2<? super Composer, ? super Integer, Unit> r1 = r62;
        Composer $composer2 = $composer.startRestartGroup(-1169303680);
        ComposerKt.sourceInformation($composer2, "C(ModalNavigationDrawer)P(1,4,2,3,5:c#ui.graphics.Color)316@12708L39,318@12825L10,321@12893L24,322@12943L33,323@13008L7,324@13046L34,325@13101L45,328@13185L33,328@13174L44,330@13257L7,331@13292L3409:NavigationDrawer.kt#uh7d8r");
        int $dirty = $changed;
        if ((r71 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r3 = r71 & 2;
        if (r3 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier r5 = modifier;
    L24:
        if (($changed & 384) == 0) goto L26;
        final DrawerState drawerState2 = drawerState;
    L34:
        int r11 = r71 & 8;
        if (r11 == 0) goto L38;
        $dirty = $dirty | 3072;
        boolean gesturesEnabled2 = gesturesEnabled;
    L46:
        if (($changed & 24576) == 0) goto L48;
        long scrimColor2 = scrimColor;
    L57:
        if ((r71 & 32) == 0) goto L61;
        int r15 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L59:
        $dirty = $dirty | r15;
    L67:
        if ((74899 & $dirty) == 74898) goto L69;
    L72:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L75;
    L84:
        if (r3 == 0) goto L86;
        Modifier.Companion modifier2 = Modifier.Companion;
    L88:
        if ((r71 & 4) == 0) goto L90;
        $dirty = $dirty & (-897);
        drawerState2 = rememberDrawerState(DrawerValue.Closed, null, $composer2, 6, 2);
    L90:
        if (r11 == 0) goto L93;
        gesturesEnabled2 = true;
    L93:
        if ((r71 & 16) == 0) goto L95;
        scrimColor2 = DrawerDefaults.INSTANCE.getScrimColor($composer2, 6);
        $dirty = $dirty & (-57345);
        boolean gesturesEnabled3 = gesturesEnabled2;
    L96:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L99;
        ComposerKt.traceEventStart(-1169303680, $dirty, -1, "androidx.compose.material3.ModalNavigationDrawer (NavigationDrawer.kt:320)");
    L99:
        ComposerKt.sourceInformationMarkerStart($composer2, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart($composer2, -954363344, "CC(remember):Effects.kt#9igjgp");
        Object it$iv$iv = $composer2.rememberedValue();
        if (it$iv$iv != Composer.Companion.getEmpty()) goto L102;
        Object value$iv$iv = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer2));
        $composer2.updateRememberedValue(value$iv$iv);
    L103:
        CompositionScopedCoroutineScopeCanceller wrapper$iv = (CompositionScopedCoroutineScopeCanceller) value$iv$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final CoroutineScope scope = wrapper$iv.getCoroutineScope();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Strings.Companion r0 = Strings.Companion;
        final String navigationMenu = Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(androidx.compose.ui.R.string.navigation_menu), $composer2, 0);
        ProvidableCompositionLocal<Density> r6 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r12 = $composer2.consume(r6);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final Density density = (Density) r12;
        ComposerKt.sourceInformationMarkerStart($composer2, -2145781231, "CC(remember):NavigationDrawer.kt#9igjgp");
        Object value$iv = $composer2.rememberedValue();
        if (value$iv != Composer.Companion.getEmpty()) goto L107;
        value$iv = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        $composer2.updateRememberedValue(value$iv);
    L107:
        MutableState anchorsInitialized$delegate = (MutableState) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -2145779460, "CC(remember):NavigationDrawer.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(density);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == true) goto L114;
        if (it$iv == Composer.Companion.getEmpty()) goto L114;
        Object value$iv2 = it$iv;
    L115:
        final MutableFloatState minValue$delegate = (MutableFloatState) value$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final float maxValue = 0.0f;
        ComposerKt.sourceInformationMarkerStart($composer2, -2145776784, "CC(remember):NavigationDrawer.kt#9igjgp");
        if ((($dirty & 896) ^ 384) <= 256) goto L120;
        if ($composer2.changed(drawerState2) == false) goto L120;
    L121:
        boolean r13 = true;
    L123:
        boolean invalid$iv2 = r13 | $composer2.changed(density);
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv2 == true) goto L130;
        if (it$iv2 == Composer.Companion.getEmpty()) goto L130;
        Object value$iv3 = it$iv2;
    L131:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.SideEffect((Function0) value$iv3, $composer2, 0);
        ProvidableCompositionLocal<LayoutDirection> r14 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r7 = $composer2.consume(r14);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (r7 != LayoutDirection.Rtl) goto L134;
        boolean isRtl = true;
    L135:
        Modifier modifier$iv = AnchoredDraggableKt.anchoredDraggable$default(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), drawerState2.getAnchoredDraggableState$material3_release(), Orientation.Horizontal, gesturesEnabled3, isRtl, null, 16, null);
        final boolean gesturesEnabled4 = gesturesEnabled3;
        Modifier modifier3 = modifier2;
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r21 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L138;
        ComposablesKt.invalidApplier();
    L138:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L141;
        Function0<ComposeUiNode> r8 = r21;
        $composer2.createNode(r8);
    L142:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L149;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L149;
    L150:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r4 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r9 = BoxScopeInstance.INSTANCE;
        int r16 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -1884906081, "C341@13601L17,344@13695L268,352@13988L70,342@13627L473,358@14209L601,370@14842L623,385@15477L1218,355@14109L2586:NavigationDrawer.kt#uh7d8r");
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Modifier modifier$iv2 = Modifier.Companion;
        Alignment contentAlignment$iv2 = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv2, false);
        int $changed$iv$iv2 = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv2 = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer2, modifier$iv2);
        Function0<ComposeUiNode> r49 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L153;
        ComposablesKt.invalidApplier();
    L153:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L156;
        Function0<ComposeUiNode> r10 = r49;
        $composer2.createNode(r10);
    L157:
        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r17 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv2.getInserting() == true) goto L164;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv2.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv2)) == false) goto L164;
    L165:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
        int r18 = ($changed$iv$iv$iv2 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r19 = BoxScopeInstance.INSTANCE;
        int r110 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, 2020094509, "C341@13607L9:NavigationDrawer.kt#uh7d8r");
        r68.invoke($composer2, Integer.valueOf(($dirty >> 15) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        boolean r22 = drawerState2.isOpen();
        ComposerKt.sourceInformationMarkerStart($composer2, -2139013222, "CC(remember):NavigationDrawer.kt#9igjgp");
        if (($dirty & 7168) != 2048) goto L168;
        boolean r20 = true;
    L170:
        if ((($dirty & 896) ^ 384) <= 256) goto L174;
        if ($composer2.changed(drawerState2) == false) goto L174;
    L175:
        boolean r23 = true;
    L177:
        boolean invalid$iv3 = (r20 | r23) | $composer2.changedInstance(scope);
        Object it$iv3 = $composer2.rememberedValue();
        if (invalid$iv3 == true) goto L184;
        if (it$iv3 == Composer.Companion.getEmpty()) goto L184;
        Object value$iv4 = it$iv3;
    L185:
        Function0 r24 = (Function0) value$iv4;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -2139004044, "CC(remember):NavigationDrawer.kt#9igjgp");
        boolean r25 = $composer2.changed(minValue$delegate);
        if ((($dirty & 896) ^ 384) <= 256) goto L190;
        if ($composer2.changed(drawerState2) == false) goto L190;
    L191:
        boolean r26 = true;
    L193:
        boolean invalid$iv4 = r25 | r26;
        Object it$iv4 = $composer2.rememberedValue();
        if (invalid$iv4 == true) goto L200;
        if (it$iv4 == Composer.Companion.getEmpty()) goto L200;
        Object value$iv5 = it$iv4;
    L201:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        long scrimColor3 = scrimColor2;
        m2414ScrimBx497Mc(r22, r24, (Function0) value$iv5, scrimColor3, $composer2, ($dirty >> 3) & 7168);
        Modifier.Companion r27 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart($composer2, -2138996441, "CC(remember):NavigationDrawer.kt#9igjgp");
        if ((($dirty & 896) ^ 384) <= 256) goto L206;
        if ($composer2.changed(drawerState2) == false) goto L206;
    L207:
        boolean invalid$iv5 = true;
    L209:
        Object it$iv5 = $composer2.rememberedValue();
        if (invalid$iv5 == true) goto L216;
        if (it$iv5 == Composer.Companion.getEmpty()) goto L216;
        Object value$iv6 = it$iv5;
    L217:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r28 = OffsetKt.offset(r27, (Function1) value$iv6);
        ComposerKt.sourceInformationMarkerStart($composer2, -2138976163, "CC(remember):NavigationDrawer.kt#9igjgp");
        boolean r29 = $composer2.changed(navigationMenu);
        if ((($dirty & 896) ^ 384) <= 256) goto L222;
        if ($composer2.changed(drawerState2) == false) goto L222;
    L223:
        boolean r30 = true;
    L225:
        boolean invalid$iv6 = (r29 | r30) | $composer2.changedInstance(scope);
        Object value$iv7 = $composer2.rememberedValue();
        if (invalid$iv6 == false) goto L228;
    L231:
        value$iv7 = (Function1) new NavigationDrawerKt$ModalNavigationDrawer$2$5$1(navigationMenu, drawerState2, scope);
        $composer2.updateRememberedValue(value$iv7);
    L232:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r31 = SemanticsModifierKt.semantics$default(r28, false, (Function1) value$iv7, 1, null);
        ComposerKt.sourceInformationMarkerStart($composer2, -2138955248, "CC(remember):NavigationDrawer.kt#9igjgp");
        if ((($dirty & 896) ^ 384) <= 256) goto L237;
        if ($composer2.changed(drawerState2) == false) goto L237;
    L238:
        boolean r32 = true;
    L240:
        boolean invalid$iv7 = r32 | $composer2.changed(minValue$delegate);
        Object it$iv6 = $composer2.rememberedValue();
        if (invalid$iv7 == true) goto L246;
        Modifier r64 = r31;
        if (it$iv6 == Composer.Companion.getEmpty()) goto L247;
        MeasurePolicy value$iv8 = it$iv6;
        final MutableState anchorsInitialized$delegate2 = anchorsInitialized$delegate;
    L248:
        MeasurePolicy measurePolicy$iv3 = (MeasurePolicy) value$iv8;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        int $changed$iv = $dirty & 14;
        Modifier modifier$iv3 = r64;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv3);
        Function0<ComposeUiNode> r210 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv3 = (($changed$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L251;
        ComposablesKt.invalidApplier();
    L251:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L254;
        Function0<ComposeUiNode> r33 = r210;
        $composer2.createNode(r33);
    L255:
        Composer $this$Layout_u24lambda_u240$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, measurePolicy$iv3, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r34 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv.getInserting() == true) goto L262;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv)) == false) goto L262;
    L263:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
        Integer r35 = Integer.valueOf(($changed$iv$iv3 >> 6) & 14);
        r1 = r62;
        r1.invoke($composer2, r35);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L266;
        ComposerKt.traceEventEnd();
    L266:
        final DrawerState drawerState3 = drawerState2;
        final boolean gesturesEnabled5 = gesturesEnabled4;
        final Modifier modifier4 = modifier3;
        final long scrimColor4 = scrimColor3;
    L267:
        ScopeUpdateScope r111 = $composer2.endRestartGroup();
        if (r111 == null) goto L271;
        r111.updateScope(new NavigationDrawerKt$ModalNavigationDrawer$3(r1, modifier4, drawerState3, gesturesEnabled5, scrimColor4, r68, $changed, r71));
        return;
    L271:
        return;
    L262:
        $this$Layout_u24lambda_u240$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
        $this$Layout_u24lambda_u240$iv.apply(Integer.valueOf(compositeKeyHash$iv), r34);
        goto L263
    L254:
        r33 = r210;
        $composer2.useNode();
    L247:
        anchorsInitialized$delegate2 = anchorsInitialized$delegate;
        value$iv8 = new NavigationDrawerKt$ModalNavigationDrawer$2$6$1(drawerState2, anchorsInitialized$delegate2, minValue$delegate, maxValue);
        $composer2.updateRememberedValue(value$iv8);
        goto L248
    L246:
        r64 = r31;
    L237:
        if (($dirty & 384) == 256) goto L238;
        r32 = false;
        goto L240
    L228:
        if (value$iv7 != Composer.Companion.getEmpty()) goto L232;
    L222:
        if (($dirty & 384) == 256) goto L223;
        r30 = false;
    L216:
        value$iv6 = (Function1) new NavigationDrawerKt$ModalNavigationDrawer$2$4$1(drawerState2);
        $composer2.updateRememberedValue(value$iv6);
    L206:
        if (($dirty & 384) == 256) goto L207;
        invalid$iv5 = false;
    L200:
        value$iv5 = (Function0) new NavigationDrawerKt$ModalNavigationDrawer$2$3$1(maxValue, drawerState2, minValue$delegate);
        $composer2.updateRememberedValue(value$iv5);
    L190:
        if (($dirty & 384) == 256) goto L191;
        r26 = false;
    L184:
        value$iv4 = (Function0) new NavigationDrawerKt$ModalNavigationDrawer$2$2$1(gesturesEnabled4, drawerState2, scope);
        $composer2.updateRememberedValue(value$iv4);
    L174:
        if (($dirty & 384) == 256) goto L175;
        r23 = false;
        goto L177
    L168:
        r20 = false;
    L164:
        $this$Layout_u24lambda_u240$iv$iv2.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv2));
        $this$Layout_u24lambda_u240$iv$iv2.apply(Integer.valueOf(compositeKeyHash$iv$iv2), r17);
        goto L165
    L156:
        r10 = r49;
        $composer2.useNode();
    L149:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r2);
        goto L150
    L141:
        r8 = r21;
        $composer2.useNode();
        goto L142
    L134:
        isRtl = false;
    L130:
        value$iv3 = (Function0) new NavigationDrawerKt$ModalNavigationDrawer$1$1(drawerState2, density);
        $composer2.updateRememberedValue(value$iv3);
    L120:
        if (($dirty & 384) == 256) goto L121;
        r13 = false;
    L114:
        value$iv2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        $composer2.updateRememberedValue(value$iv2);
        goto L115
    L102:
        value$iv$iv = it$iv$iv;
        goto L103
    L95:
        gesturesEnabled3 = gesturesEnabled2;
        goto L96
    L86:
        modifier2 = r5;
        goto L88
    L75:
        if ($composer2.getDefaultsInvalid() == true) goto L84;
        $composer2.skipToGroupEnd();
        if ((r71 & 4) == 0) goto L81;
        $dirty = $dirty & (-897);
    L81:
        if ((r71 & 16) == 0) goto L83;
        $dirty = $dirty & (-57345);
        modifier2 = r5;
        gesturesEnabled3 = gesturesEnabled2;
        goto L96
    L83:
        modifier2 = r5;
        gesturesEnabled3 = gesturesEnabled2;
        goto L96
    L69:
        if ($composer2.getSkipping() == false) goto L72;
        $composer2.skipToGroupEnd();
        modifier4 = r5;
        drawerState3 = drawerState2;
        gesturesEnabled5 = gesturesEnabled2;
        scrimColor4 = scrimColor2;
        goto L267
    L61:
        if ((196608 & $changed) != 0) goto L67;
        if ($composer2.changedInstance(r68) == false) goto L65;
        r15 = 131072;
        goto L59
    L65:
        r15 = 65536;
        goto L59
    L48:
        if ((r71 & 16) != 0) goto L52;
        scrimColor2 = scrimColor;
        if ($composer2.changed(scrimColor2) == false) goto L53;
        int r112 = 16384;
    L54:
        $dirty = $dirty | r112;
    L53:
        r112 = 8192;
        goto L54
    L52:
        scrimColor2 = scrimColor;
        goto L53
    L38:
        if (($changed & 3072) != 0) goto L44;
        gesturesEnabled2 = gesturesEnabled;
        if ($composer2.changed(gesturesEnabled2) == false) goto L42;
        int r113 = 2048;
    L43:
        $dirty = $dirty | r113;
        goto L46
    L42:
        r113 = 1024;
        goto L43
    L44:
        gesturesEnabled2 = gesturesEnabled;
        goto L46
    L26:
        if ((r71 & 4) != 0) goto L30;
        drawerState2 = drawerState;
        if ($composer2.changed(drawerState2) == false) goto L31;
        int r114 = 256;
    L32:
        $dirty = $dirty | r114;
    L31:
        r114 = 128;
        goto L32
    L30:
        drawerState2 = drawerState;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L22;
        r5 = modifier;
        if ($composer2.changed(r5) == false) goto L20;
        int r36 = 32;
    L21:
        $dirty = $dirty | r36;
        goto L24
    L20:
        r36 = 16;
        goto L21
    L22:
        r5 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changedInstance(r1) == false) goto L10;
        int r37 = 4;
    L11:
        $dirty = $dirty | r37;
        goto L12
    L10:
        r37 = 2;
        goto L11
    }

    private static final boolean ModalNavigationDrawer_FHprtrg$lambda$2(MutableState<Boolean> r4) {
        MutableState<Boolean> $this$getValue$iv = r4;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void ModalNavigationDrawer_FHprtrg$lambda$3(MutableState<Boolean> r5, boolean value) {
        r5.setValue(Boolean.valueOf(value));
    }

    private static final float ModalNavigationDrawer_FHprtrg$lambda$5(MutableFloatState $minValue$delegate) {
        MutableFloatState $this$getValue$iv = $minValue$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    private static final void ModalNavigationDrawer_FHprtrg$lambda$6(MutableFloatState $minValue$delegate, float value) {
        $minValue$delegate.setFloatValue(value);
    }

    public static final void DismissibleNavigationDrawer(final Function2<? super Composer, ? super Integer, Unit> r75, Modifier r76, DrawerState r77, boolean r78, Function2<? super Composer, ? super Integer, Unit> r79, Composer r80, final int r81, final int r82) {
        Composer r8 = r80.startRestartGroup(398812198);
        ComposerKt.sourceInformation(r8, "C(DismissibleNavigationDrawer)P(1,4,2,3)440@17931L39,444@18079L34,445@18145L7,446@18168L33,446@18157L44,448@18219L24,449@18269L33,451@18341L7,452@18376L2358:NavigationDrawer.kt#uh7d8r");
        int r2 = r81;
        if ((r82 & 1) == 0) goto L6;
        r2 = r2 | 6;
    L12:
        int r3 = r82 & 2;
        if (r3 == 0) goto L16;
        r2 = r2 | 48;
        Modifier r7 = r76;
    L24:
        if ((r81 & 384) == 0) goto L26;
        final DrawerState r9 = r77;
    L34:
        int r11 = r82 & 8;
        if (r11 == 0) goto L38;
        r2 = r2 | 3072;
        boolean r12 = r78;
    L46:
        if ((r82 & 16) == 0) goto L49;
        r2 = r2 | 24576;
    L56:
        if ((r2 & 9363) == 9362) goto L58;
    L61:
        r8.startDefaults();
        if ((r81 & 1) != 0) goto L64;
    L70:
        if (r3 == 0) goto L72;
        Modifier.Companion r4 = Modifier.Companion;
    L74:
        if ((r82 & 4) == 0) goto L76;
        r2 = r2 & (-897);
        r9 = rememberDrawerState(DrawerValue.Closed, null, r8, 6, 2);
    L76:
        if (r11 == 0) goto L78;
        Modifier r16 = r4;
        boolean r19 = true;
    L79:
        r8.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L82;
        ComposerKt.traceEventStart(398812198, r2, -1, "androidx.compose.material3.DismissibleNavigationDrawer (NavigationDrawer.kt:443)");
    L82:
        ComposerKt.sourceInformationMarkerStart(r8, 1034582752, "CC(remember):NavigationDrawer.kt#9igjgp");
        Object r13 = r8.rememberedValue();
        if (r13 != Composer.Companion.getEmpty()) goto L85;
        boolean r710 = false;
        Object r5 = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        r8.updateRememberedValue(r5);
    L86:
        final MutableState r0 = (MutableState) r5;
        ComposerKt.sourceInformationMarkerEnd(r8);
        ProvidableCompositionLocal<Density> r6 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(r8, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r14 = r8.consume(r6);
        ComposerKt.sourceInformationMarkerEnd(r8);
        final Density r10 = (Density) r14;
        ComposerKt.sourceInformationMarkerStart(r8, 1034585599, "CC(remember):NavigationDrawer.kt#9igjgp");
        if (((r2 & 896) ^ 384) <= 256) goto L91;
        if (r8.changed(r9) == false) goto L91;
    L92:
        boolean r15 = true;
    L94:
        boolean r17 = r15 | r8.changed(r10);
        Object r18 = r8.rememberedValue();
        if (r17 == false) goto L97;
    L100:
        Object r110 = (Function0) new NavigationDrawerKt$DismissibleNavigationDrawer$1$1(r9, r10);
        r8.updateRememberedValue(r110);
    L101:
        ComposerKt.sourceInformationMarkerEnd(r8);
        EffectsKt.SideEffect((Function0) r110, r8, r710 ? 1 : 0);
        ComposerKt.sourceInformationMarkerStart(r8, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart(r8, -954363344, "CC(remember):Effects.kt#9igjgp");
        Object r111 = r8.rememberedValue();
        if (r111 != Composer.Companion.getEmpty()) goto L104;
        Object r20 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, r8));
        r8.updateRememberedValue(r20);
    L105:
        ComposerKt.sourceInformationMarkerEnd(r8);
        final CoroutineScope r21 = ((CompositionScopedCoroutineScopeCanceller) r20).getCoroutineScope();
        ComposerKt.sourceInformationMarkerEnd(r8);
        Strings.Companion r22 = Strings.Companion;
        final String r23 = Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(androidx.compose.ui.R.string.navigation_menu), r8, 0);
        ProvidableCompositionLocal<LayoutDirection> r24 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(r8, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r112 = r8.consume(r24);
        ComposerKt.sourceInformationMarkerEnd(r8);
        if (r112 != LayoutDirection.Rtl) goto L108;
        boolean r25 = true;
    L109:
        Modifier r26 = AnchoredDraggableKt.anchoredDraggable$default(r16, r9.getAnchoredDraggableState$material3_release(), Orientation.Horizontal, r19, r25, null, 16, null);
        ComposerKt.sourceInformationMarkerStart(r8, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy r113 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(r8, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int r27 = ComposablesKt.getCurrentCompositeKeyHash(r8, 0);
        CompositionLocalMap r114 = r8.getCurrentCompositionLocalMap();
        Modifier r115 = ComposedModifierKt.materializeModifier(r8, r26);
        Function0<ComposeUiNode> r29 = ComposeUiNode.Companion.getConstructor();
        int r28 = ((((0 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart(r8, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if ((r8.getApplier() instanceof Applier) == true) goto L112;
        ComposablesKt.invalidApplier();
    L112:
        r8.startReusableNode();
        if (r8.getInserting() == false) goto L115;
        Function0<ComposeUiNode> r30 = r29;
        r8.createNode(r30);
    L116:
        Composer r31 = Updater.m3808constructorimpl(r8);
        Updater.m3815setimpl(r31, r113, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r31, r114, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r32 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r31.getInserting() == true) goto L123;
        if (Intrinsics.areEqual(r31.rememberedValue(), Integer.valueOf(r27)) == false) goto L123;
    L124:
        Updater.m3815setimpl(r31, r115, ComposeUiNode.Companion.getSetModifier());
        int r33 = (r28 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart(r8, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r36 = BoxScopeInstance.INSTANCE;
        int r37 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart(r8, -1217734065, "C483@19473L1255,460@18625L2103:NavigationDrawer.kt#uh7d8r");
        ComposerKt.sourceInformationMarkerStart(r8, 99291876, "CC(remember):NavigationDrawer.kt#9igjgp");
        if (((r2 & 896) ^ 384) <= 256) goto L129;
        if (r8.changed(r9) == false) goto L129;
    L130:
        boolean r34 = true;
    L132:
        boolean r45 = r34;
        Object r35 = r8.rememberedValue();
        if (r45 == true) goto L139;
        if (r35 == Composer.Companion.getEmpty()) goto L139;
    L140:
        MeasurePolicy r38 = (MeasurePolicy) r35;
        ComposerKt.sourceInformationMarkerEnd(r8);
        ComposerKt.sourceInformationMarkerStart(r8, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        Modifier.Companion r116 = Modifier.Companion;
        int r46 = ComposablesKt.getCurrentCompositeKeyHash(r8, 0);
        CompositionLocalMap r1 = r8.getCurrentCompositionLocalMap();
        Modifier r117 = ComposedModifierKt.materializeModifier(r8, r116);
        Function0<ComposeUiNode> r49 = ComposeUiNode.Companion.getConstructor();
        int r118 = ((0 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart(r8, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if ((r8.getApplier() instanceof Applier) == true) goto L143;
        ComposablesKt.invalidApplier();
    L143:
        r8.startReusableNode();
        if (r8.getInserting() == false) goto L146;
        Function0<ComposeUiNode> r119 = r49;
        r8.createNode(r119);
    L147:
        Composer r120 = Updater.m3808constructorimpl(r8);
        Updater.m3815setimpl(r120, r38, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r120, r1, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r121 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r120.getInserting() == true) goto L154;
        if (Intrinsics.areEqual(r120.rememberedValue(), Integer.valueOf(r46)) == false) goto L154;
    L155:
        Updater.m3815setimpl(r120, r117, ComposeUiNode.Companion.getSetModifier());
        int r39 = (r118 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart(r8, 285828320, "C463@18717L623,462@18673L741,481@19431L17:NavigationDrawer.kt#uh7d8r");
        Modifier.Companion r40 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart(r8, -1376251797, "CC(remember):NavigationDrawer.kt#9igjgp");
        boolean r41 = r8.changed(r23);
        if (((r2 & 896) ^ 384) <= 256) goto L160;
        if (r8.changed(r9) == false) goto L160;
    L161:
        boolean r42 = true;
    L163:
        boolean r43 = (r41 | r42) | r8.changedInstance(r21);
        int r54 = r2;
        Object r44 = r8.rememberedValue();
        if (r43 == true) goto L170;
        if (r44 == Composer.Companion.getEmpty()) goto L170;
    L171:
        ComposerKt.sourceInformationMarkerEnd(r8);
        Modifier r47 = SemanticsModifierKt.semantics$default(r40, false, (Function1) r44, 1, null);
        ComposerKt.sourceInformationMarkerStart(r8, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy r48 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(r8, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int r60 = ComposablesKt.getCurrentCompositeKeyHash(r8, 0);
        CompositionLocalMap r50 = r8.getCurrentCompositionLocalMap();
        Modifier r51 = ComposedModifierKt.materializeModifier(r8, r47);
        Function0<ComposeUiNode> r62 = ComposeUiNode.Companion.getConstructor();
        int r52 = ((((0 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart(r8, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if ((r8.getApplier() instanceof Applier) == true) goto L174;
        ComposablesKt.invalidApplier();
    L174:
        r8.startReusableNode();
        if (r8.getInserting() == false) goto L177;
        Function0<ComposeUiNode> r53 = r62;
        r8.createNode(r53);
    L178:
        Composer r55 = Updater.m3808constructorimpl(r8);
        Updater.m3815setimpl(r55, r48, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r55, r50, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r56 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r55.getInserting() == true) goto L185;
        if (Intrinsics.areEqual(r55.rememberedValue(), Integer.valueOf(r60)) == false) goto L185;
    L186:
        Updater.m3815setimpl(r55, r51, ComposeUiNode.Companion.getSetModifier());
        int r57 = (r52 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart(r8, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r58 = BoxScopeInstance.INSTANCE;
        int r66 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart(r8, 590751801, "C479@19381L15:NavigationDrawer.kt#uh7d8r");
        r75.invoke(r8, Integer.valueOf(r54 & 14));
        ComposerKt.sourceInformationMarkerEnd(r8);
        ComposerKt.sourceInformationMarkerEnd(r8);
        r8.endNode();
        ComposerKt.sourceInformationMarkerEnd(r8);
        ComposerKt.sourceInformationMarkerEnd(r8);
        ComposerKt.sourceInformationMarkerEnd(r8);
        ComposerKt.sourceInformationMarkerStart(r8, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Modifier.Companion r59 = Modifier.Companion;
        MeasurePolicy r122 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(r8, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int r61 = ComposablesKt.getCurrentCompositeKeyHash(r8, 0);
        CompositionLocalMap r123 = r8.getCurrentCompositionLocalMap();
        Modifier r63 = ComposedModifierKt.materializeModifier(r8, r59);
        Function0<ComposeUiNode> r210 = ComposeUiNode.Companion.getConstructor();
        int r64 = ((((0 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart(r8, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if ((r8.getApplier() instanceof Applier) == true) goto L189;
        ComposablesKt.invalidApplier();
    L189:
        r8.startReusableNode();
        if (r8.getInserting() == false) goto L192;
        Function0<ComposeUiNode> r65 = r210;
        r8.createNode(r65);
    L193:
        Composer r124 = Updater.m3808constructorimpl(r8);
        Updater.m3815setimpl(r124, r122, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r124, r123, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r67 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r124.getInserting() == true) goto L200;
        if (Intrinsics.areEqual(r124.rememberedValue(), Integer.valueOf(r61)) == false) goto L200;
    L201:
        Updater.m3815setimpl(r124, r63, ComposeUiNode.Companion.getSetModifier());
        int r68 = (r64 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart(r8, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r69 = BoxScopeInstance.INSTANCE;
        int r125 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart(r8, 590807167, "C481@19437L9:NavigationDrawer.kt#uh7d8r");
        Function2<? super Composer, ? super Integer, Unit> r70 = r79;
        r70.invoke(r8, Integer.valueOf((r54 >> 12) & 14));
        ComposerKt.sourceInformationMarkerEnd(r8);
        ComposerKt.sourceInformationMarkerEnd(r8);
        r8.endNode();
        ComposerKt.sourceInformationMarkerEnd(r8);
        ComposerKt.sourceInformationMarkerEnd(r8);
        ComposerKt.sourceInformationMarkerEnd(r8);
        ComposerKt.sourceInformationMarkerEnd(r8);
        r8.endNode();
        ComposerKt.sourceInformationMarkerEnd(r8);
        ComposerKt.sourceInformationMarkerEnd(r8);
        ComposerKt.sourceInformationMarkerEnd(r8);
        ComposerKt.sourceInformationMarkerEnd(r8);
        r8.endNode();
        ComposerKt.sourceInformationMarkerEnd(r8);
        ComposerKt.sourceInformationMarkerEnd(r8);
        ComposerKt.sourceInformationMarkerEnd(r8);
        if (ComposerKt.isTraceInProgress() == false) goto L204;
        ComposerKt.traceEventEnd();
    L204:
        final Modifier r71 = r16;
        final boolean r72 = r19;
        final DrawerState r73 = r9;
    L205:
        ScopeUpdateScope r74 = r8.endRestartGroup();
        if (r74 == null) goto L209;
        final Function2<? super Composer, ? super Integer, Unit> r83 = r70;
        r74.updateScope(new AnonymousClass3(r75, r71, r73, r72, r83, r81, r82));
        return;
    L209:
        return;
    L200:
        r124.updateRememberedValue(Integer.valueOf(r61));
        r124.apply(Integer.valueOf(r61), r67);
        goto L201
    L192:
        r65 = r210;
        r8.useNode();
    L185:
        r55.updateRememberedValue(Integer.valueOf(r60));
        r55.apply(Integer.valueOf(r60), r56);
        goto L186
    L177:
        r53 = r62;
        r8.useNode();
    L170:
        r44 = (Function1) new NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1(r23, r9, r21);
        r8.updateRememberedValue(r44);
    L160:
        if ((r2 & 384) == 256) goto L161;
        r42 = false;
    L154:
        r120.updateRememberedValue(Integer.valueOf(r46));
        r120.apply(Integer.valueOf(r46), r121);
        goto L155
    L146:
        r119 = r49;
        r8.useNode();
    L139:
        r35 = (MeasurePolicy) new NavigationDrawerKt$DismissibleNavigationDrawer$2$2$1(r9, r0);
        r8.updateRememberedValue(r35);
    L129:
        if ((r2 & 384) == 256) goto L130;
        r34 = false;
    L123:
        r31.updateRememberedValue(Integer.valueOf(r27));
        r31.apply(Integer.valueOf(r27), r32);
        goto L124
    L115:
        r30 = r29;
        r8.useNode();
        goto L116
    L108:
        r25 = false;
        goto L109
    L104:
        r20 = r111;
        goto L105
    L97:
        if (r18 == Composer.Companion.getEmpty()) goto L100;
        r110 = r18;
    L91:
        if ((r2 & 384) == 256) goto L92;
        r15 = r710;
        goto L94
    L85:
        r710 = false;
        r5 = r13;
        goto L86
    L78:
        r16 = r4;
        r19 = r12;
        goto L79
    L72:
        r4 = r7;
        goto L74
    L64:
        if (r8.getDefaultsInvalid() == true) goto L70;
        r8.skipToGroupEnd();
        if ((r82 & 4) == 0) goto L69;
        r2 = r2 & (-897);
    L69:
        r16 = r7;
        r19 = r12;
        goto L79
    L58:
        if (r8.getSkipping() == false) goto L61;
        r8.skipToGroupEnd();
        r70 = r79;
        r71 = r7;
        r72 = r12;
        r73 = r9;
        goto L205
    L49:
        if ((r81 & 24576) != 0) goto L56;
        if (r8.changedInstance(r79) == false) goto L53;
        int r126 = 16384;
    L54:
        r2 = r2 | r126;
        goto L56
    L53:
        r126 = 8192;
        goto L54
    L38:
        if ((r81 & 3072) != 0) goto L44;
        r12 = r78;
        if (r8.changed(r12) == false) goto L42;
        int r127 = 2048;
    L43:
        r2 = r2 | r127;
        goto L46
    L42:
        r127 = 1024;
        goto L43
    L44:
        r12 = r78;
        goto L46
    L26:
        if ((r82 & 4) != 0) goto L30;
        r9 = r77;
        if (r8.changed(r9) == false) goto L31;
        int r128 = 256;
    L32:
        r2 = r2 | r128;
    L31:
        r128 = 128;
        goto L32
    L30:
        r9 = r77;
        goto L31
    L16:
        if ((r81 & 48) != 0) goto L22;
        r7 = r76;
        if (r8.changed(r7) == false) goto L20;
        int r84 = 32;
    L21:
        r2 = r2 | r84;
        goto L24
    L20:
        r84 = 16;
        goto L21
    L22:
        r7 = r76;
        goto L24
    L6:
        if ((r81 & 6) != 0) goto L12;
        if (r8.changedInstance(r75) == false) goto L10;
        int r85 = 4;
    L11:
        r2 = r2 | r85;
        goto L12
    L10:
        r85 = 2;
        goto L11
    }

    private static final boolean DismissibleNavigationDrawer$lambda$16(MutableState<Boolean> r4) {
        MutableState<Boolean> $this$getValue$iv = r4;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void DismissibleNavigationDrawer$lambda$17(MutableState<Boolean> r5, boolean value) {
        r5.setValue(Boolean.valueOf(value));
    }

    public static final void PermanentNavigationDrawer(final Function2<? super Composer, ? super Integer, Unit> r47, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> r49, Composer $composer, final int $changed, final int r52) {
        Composer $composer2 = $composer.startRestartGroup(-276843608);
        ComposerKt.sourceInformation($composer2, "C(PermanentNavigationDrawer)P(1,2)538@21771L85:NavigationDrawer.kt#uh7d8r");
        int $dirty = $changed;
        if ((r52 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r5 = r52 & 2;
        if (r5 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier r7 = modifier;
    L24:
        if ((r52 & 4) == 0) goto L27;
        $dirty = $dirty | 384;
    L33:
        int $dirty2 = $dirty;
        if (($dirty2 & 147) == 146) goto L36;
    L39:
        if (r5 == 0) goto L41;
        Modifier.Companion modifier2 = Modifier.Companion;
    L43:
        if (ComposerKt.isTraceInProgress() == false) goto L45;
        ComposerKt.traceEventStart(-276843608, $dirty2, -1, "androidx.compose.material3.PermanentNavigationDrawer (NavigationDrawer.kt:537)");
    L45:
        Modifier modifier$iv = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
        Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
        Alignment.Vertical verticalAlignment$iv = Alignment.Companion.getTop();
        MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
        int $changed$iv$iv = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier modifier3 = modifier2;
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r18 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L48;
        ComposablesKt.invalidApplier();
    L48:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L51;
        Function0<ComposeUiNode> r0 = r18;
        $composer2.createNode(r0);
    L52:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r6 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L58;
        Composer $composer3 = $composer2;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == true) goto L60;
    L59:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r6);
    L60:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r1 = ($changed$iv$iv$iv >> 6) & 14;
        Composer $composer$iv = $composer3;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -407918630, "C100@5047L9:Row.kt#2w3rfo");
        RowScopeInstance r2 = RowScopeInstance.INSTANCE;
        int r8 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -882563509, "C539@21809L15,540@21833L17:NavigationDrawer.kt#uh7d8r");
        r47.invoke($composer$iv, Integer.valueOf($dirty2 & 14));
        ComposerKt.sourceInformationMarkerStart($composer$iv, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Modifier modifier$iv2 = Modifier.Companion;
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv2 = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash($composer$iv, 0);
        CompositionLocalMap localMap$iv$iv2 = $composer$iv.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer$iv, modifier$iv2);
        Function0<ComposeUiNode> r37 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer$iv.getApplier() instanceof Applier) == true) goto L63;
        ComposablesKt.invalidApplier();
    L63:
        $composer$iv.startReusableNode();
        if ($composer$iv.getInserting() == false) goto L66;
        Function0<ComposeUiNode> r3 = r37;
        $composer$iv.createNode(r3);
    L67:
        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m3808constructorimpl($composer$iv);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv2.getInserting() == true) goto L73;
        Composer $composer4 = $composer$iv;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv2.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv2)) == true) goto L75;
    L74:
        $this$Layout_u24lambda_u240$iv$iv2.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv2));
        $this$Layout_u24lambda_u240$iv$iv2.apply(Integer.valueOf(compositeKeyHash$iv$iv2), r4);
    L75:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
        int r9 = ($changed$iv$iv$iv2 >> 6) & 14;
        Composer $composer$iv2 = $composer4;
        ComposerKt.sourceInformationMarkerStart($composer$iv2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r10 = BoxScopeInstance.INSTANCE;
        int r11 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer$iv2, -1559366900, "C540@21839L9:NavigationDrawer.kt#uh7d8r");
        r49.invoke($composer$iv2, Integer.valueOf(($dirty2 >> 6) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer$iv2);
        ComposerKt.sourceInformationMarkerEnd($composer$iv2);
        $composer4.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L78;
        ComposerKt.traceEventEnd();
    L78:
        final Modifier modifier4 = modifier3;
    L79:
        ScopeUpdateScope r12 = $composer3.endRestartGroup();
        if (r12 == null) goto L83;
        r12.updateScope(new C05422(r47, modifier4, r49, $changed, r52));
        return;
    L83:
        return;
    L73:
        $composer4 = $composer$iv;
        goto L74
    L66:
        r3 = r37;
        $composer$iv.useNode();
        goto L67
    L58:
        $composer3 = $composer2;
        goto L59
    L51:
        r0 = r18;
        $composer2.useNode();
        goto L52
    L41:
        modifier2 = r7;
        goto L43
    L36:
        if ($composer2.getSkipping() == false) goto L39;
        $composer2.skipToGroupEnd();
        $composer3 = $composer2;
        modifier4 = r7;
        goto L79
    L27:
        if (($changed & 384) != 0) goto L33;
        if ($composer2.changedInstance(r49) == false) goto L31;
        int r13 = 256;
    L32:
        $dirty = $dirty | r13;
        goto L33
    L31:
        r13 = 128;
        goto L32
    L16:
        if (($changed & 48) != 0) goto L22;
        r7 = modifier;
        if ($composer2.changed(r7) == false) goto L20;
        int r14 = 32;
    L21:
        $dirty = $dirty | r14;
        goto L24
    L20:
        r14 = 16;
        goto L21
    L22:
        r7 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changedInstance(r47) == false) goto L10;
        int r15 = 4;
    L11:
        $dirty = $dirty | r15;
        goto L12
    L10:
        r15 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: ModalDrawerSheet-afqeVBk, reason: not valid java name */
    public static final void m2411ModalDrawerSheetafqeVBk(Modifier modifier, Shape drawerShape, long drawerContainerColor, long drawerContentColor, float drawerTonalElevation, WindowInsets windowInsets, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r32, Composer $composer, final int $changed, final int r35) {
        Composer $composer2 = $composer.startRestartGroup(1001163336);
        ComposerKt.sourceInformation($composer2, "C(ModalDrawerSheet)P(5,3,1:c#ui.graphics.Color,2:c#ui.graphics.Color,4:c#ui.unit.Dp,6)567@23196L5,568@23252L19,569@23305L37,571@23460L12,574@23530L225:NavigationDrawer.kt#uh7d8r");
        int $dirty = $changed;
        int r3 = r35 & 1;
        if (r3 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier modifier2 = modifier;
    L14:
        if (($changed & 48) == 0) goto L16;
        Shape drawerShape2 = drawerShape;
    L25:
        if (($changed & 384) == 0) goto L27;
        long drawerContainerColor2 = drawerContainerColor;
    L36:
        if (($changed & 3072) == 0) goto L38;
        long drawerContentColor2 = drawerContentColor;
    L46:
        int r11 = r35 & 16;
        if (r11 == 0) goto L50;
        $dirty = $dirty | 24576;
        float drawerTonalElevation2 = drawerTonalElevation;
    L58:
        if ((196608 & $changed) == 0) goto L60;
        WindowInsets r13 = windowInsets;
    L69:
        if ((r35 & 64) == 0) goto L72;
        $dirty = $dirty | 1572864;
    L80:
        if ((599187 & $dirty) == 599186) goto L82;
    L85:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L88;
    L103:
        if (r3 == 0) goto L106;
        modifier2 = Modifier.Companion;
    L106:
        if ((r35 & 2) == 0) goto L109;
        $dirty = $dirty & (-113);
        drawerShape2 = DrawerDefaults.INSTANCE.getShape($composer2, 6);
    L109:
        if ((r35 & 4) == 0) goto L112;
        drawerContainerColor2 = DrawerDefaults.INSTANCE.getModalContainerColor($composer2, 6);
        $dirty = $dirty & (-897);
    L112:
        if ((r35 & 8) == 0) goto L114;
        drawerContentColor2 = ColorSchemeKt.m2057contentColorForek8zF_U(drawerContainerColor2, $composer2, ($dirty >> 6) & 14);
        $dirty = $dirty & (-7169);
    L114:
        if (r11 == 0) goto L117;
        drawerTonalElevation2 = DrawerDefaults.INSTANCE.m2203getModalDrawerElevationD9Ej5fM();
    L117:
        if ((r35 & 32) == 0) goto L119;
        $dirty = $dirty & (-458753);
        Modifier modifier3 = modifier2;
        Shape drawerShape3 = drawerShape2;
        long drawerContentColor3 = drawerContentColor2;
        float drawerTonalElevation3 = drawerTonalElevation2;
        int r4 = 1001163336;
        WindowInsets windowInsets2 = DrawerDefaults.INSTANCE.getWindowInsets($composer2, 6);
        long drawerContainerColor3 = drawerContainerColor2;
    L120:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L123;
        ComposerKt.traceEventStart(r4, $dirty, -1, "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:573)");
    L123:
        Composer $composer3 = $composer2;
        m2409DrawerSheet7zSek6w(null, windowInsets2, modifier3, drawerShape3, drawerContainerColor3, drawerContentColor3, drawerTonalElevation3, r32, $composer3, ((((((6 | (($dirty >> 12) & 112)) | (($dirty << 6) & 896)) | (($dirty << 6) & 7168)) | (($dirty << 6) & 57344)) | (($dirty << 6) & 458752)) | (($dirty << 6) & 3670016)) | (($dirty << 3) & 29360128), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L126;
        ComposerKt.traceEventEnd();
    L126:
        final WindowInsets windowInsets3 = windowInsets2;
        final Modifier modifier4 = modifier3;
        final long drawerContainerColor4 = drawerContainerColor3;
        final long drawerContentColor4 = drawerContentColor3;
        final float drawerTonalElevation4 = drawerTonalElevation3;
        final Shape drawerShape4 = drawerShape3;
    L127:
        ScopeUpdateScope r14 = $composer3.endRestartGroup();
        if (r14 == null) goto L131;
        r14.updateScope(new NavigationDrawerKt$ModalDrawerSheet$1(modifier4, drawerShape4, drawerContainerColor4, drawerContentColor4, drawerTonalElevation4, windowInsets3, r32, $changed, r35));
        return;
    L131:
        return;
    L119:
        drawerShape3 = drawerShape2;
        drawerContentColor3 = drawerContentColor2;
        drawerTonalElevation3 = drawerTonalElevation2;
        windowInsets2 = r13;
        r4 = 1001163336;
        modifier3 = modifier2;
        drawerContainerColor3 = drawerContainerColor2;
        goto L120
    L88:
        if ($composer2.getDefaultsInvalid() == true) goto L103;
        $composer2.skipToGroupEnd();
        if ((r35 & 2) == 0) goto L94;
        $dirty = $dirty & (-113);
    L94:
        if ((r35 & 4) == 0) goto L97;
        $dirty = $dirty & (-897);
    L97:
        if ((r35 & 8) == 0) goto L100;
        $dirty = $dirty & (-7169);
    L100:
        if ((r35 & 32) == 0) goto L102;
        $dirty = $dirty & (-458753);
        drawerShape3 = drawerShape2;
        drawerContentColor3 = drawerContentColor2;
        drawerTonalElevation3 = drawerTonalElevation2;
        windowInsets2 = r13;
        r4 = 1001163336;
        modifier3 = modifier2;
        drawerContainerColor3 = drawerContainerColor2;
        goto L120
    L102:
        drawerShape3 = drawerShape2;
        drawerContentColor3 = drawerContentColor2;
        drawerTonalElevation3 = drawerTonalElevation2;
        windowInsets2 = r13;
        r4 = 1001163336;
        modifier3 = modifier2;
        drawerContainerColor3 = drawerContainerColor2;
        goto L120
    L82:
        if ($composer2.getSkipping() == false) goto L85;
        $composer2.skipToGroupEnd();
        $composer3 = $composer2;
        modifier4 = modifier2;
        drawerContainerColor4 = drawerContainerColor2;
        drawerTonalElevation4 = drawerTonalElevation2;
        drawerShape4 = drawerShape2;
        drawerContentColor4 = drawerContentColor2;
        windowInsets3 = r13;
        goto L127
    L72:
        if (($changed & 1572864) != 0) goto L80;
        if ($composer2.changedInstance(r32) == false) goto L76;
        int r15 = 1048576;
    L77:
        $dirty = $dirty | r15;
        goto L80
    L76:
        r15 = 524288;
        goto L77
    L60:
        if ((r35 & 32) != 0) goto L64;
        r13 = windowInsets;
        if ($composer2.changed(r13) == false) goto L65;
        int r16 = 131072;
    L66:
        $dirty = $dirty | r16;
    L65:
        r16 = 65536;
        goto L66
    L64:
        r13 = windowInsets;
        goto L65
    L50:
        if (($changed & 24576) != 0) goto L56;
        drawerTonalElevation2 = drawerTonalElevation;
        if ($composer2.changed(drawerTonalElevation2) == false) goto L54;
        int r17 = 16384;
    L55:
        $dirty = $dirty | r17;
        goto L58
    L54:
        r17 = 8192;
        goto L55
    L56:
        drawerTonalElevation2 = drawerTonalElevation;
        goto L58
    L38:
        if ((r35 & 8) != 0) goto L42;
        drawerContentColor2 = drawerContentColor;
        if ($composer2.changed(drawerContentColor2) == false) goto L43;
        int r12 = 2048;
    L44:
        $dirty = $dirty | r12;
    L43:
        r12 = 1024;
        goto L44
    L42:
        drawerContentColor2 = drawerContentColor;
        goto L43
    L27:
        if ((r35 & 4) != 0) goto L31;
        drawerContainerColor2 = drawerContainerColor;
        if ($composer2.changed(drawerContainerColor2) == false) goto L32;
        int r8 = 256;
    L33:
        $dirty = $dirty | r8;
    L32:
        r8 = 128;
        goto L33
    L31:
        drawerContainerColor2 = drawerContainerColor;
        goto L32
    L16:
        if ((r35 & 2) != 0) goto L20;
        drawerShape2 = drawerShape;
        if ($composer2.changed(drawerShape2) == false) goto L21;
        int r6 = 32;
    L22:
        $dirty = $dirty | r6;
    L21:
        r6 = 16;
        goto L22
    L20:
        drawerShape2 = drawerShape;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L10;
        int r5 = 4;
    L11:
        $dirty = $dirty | r5;
        goto L14
    L10:
        r5 = 2;
        goto L11
    L12:
        modifier2 = modifier;
        goto L14
    }

    /* JADX INFO: renamed from: ModalDrawerSheet-Snr_uVM, reason: not valid java name */
    public static final void m2410ModalDrawerSheetSnr_uVM(final DrawerState drawerState, Modifier modifier, Shape drawerShape, long drawerContainerColor, long drawerContentColor, float drawerTonalElevation, WindowInsets windowInsets, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r37, Composer $composer, final int $changed, final int r40) {
        Composer $composer2 = $composer.startRestartGroup(1513027356);
        ComposerKt.sourceInformation($composer2, "C(ModalDrawerSheet)P(4,6,3,1:c#ui.graphics.Color,2:c#ui.graphics.Color,5:c#ui.unit.Dp,7)611@25149L5,612@25205L19,613@25258L37,615@25413L12,618@25524L299,618@25483L340:NavigationDrawer.kt#uh7d8r");
        int $dirty = $changed;
        if ((r40 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r3 = r40 & 2;
        if (r3 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        if (($changed & 384) == 0) goto L26;
        Shape drawerShape2 = drawerShape;
    L35:
        if (($changed & 3072) == 0) goto L37;
        long drawerContainerColor2 = drawerContainerColor;
    L46:
        if (($changed & 24576) == 0) goto L48;
        long drawerContentColor2 = drawerContentColor;
    L56:
        int r10 = r40 & 32;
        if (r10 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        float drawerTonalElevation2 = drawerTonalElevation;
    L68:
        if ((1572864 & $changed) == 0) goto L70;
        WindowInsets r15 = windowInsets;
    L79:
        if ((r40 & 128) == 0) goto L82;
        $dirty = $dirty | 12582912;
    L90:
        if (($dirty & 4793491) == 4793490) goto L92;
    L95:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L98;
    L113:
        if (r3 == 0) goto L116;
        modifier2 = Modifier.Companion;
    L116:
        if ((r40 & 4) == 0) goto L119;
        $dirty = $dirty & (-897);
        drawerShape2 = DrawerDefaults.INSTANCE.getShape($composer2, 6);
    L119:
        if ((r40 & 8) == 0) goto L122;
        drawerContainerColor2 = DrawerDefaults.INSTANCE.getModalContainerColor($composer2, 6);
        $dirty = $dirty & (-7169);
    L122:
        if ((r40 & 16) == 0) goto L124;
        drawerContentColor2 = ColorSchemeKt.m2057contentColorForek8zF_U(drawerContainerColor2, $composer2, ($dirty >> 9) & 14);
        $dirty = $dirty & (-57345);
    L124:
        if (r10 == 0) goto L127;
        drawerTonalElevation2 = DrawerDefaults.INSTANCE.m2203getModalDrawerElevationD9Ej5fM();
    L127:
        if ((r40 & 64) == 0) goto L129;
        $dirty = $dirty & (-3670017);
        final WindowInsets windowInsets2 = DrawerDefaults.INSTANCE.getWindowInsets($composer2, 6);
        final Modifier modifier3 = modifier2;
        final Shape drawerShape3 = drawerShape2;
        final long drawerContainerColor3 = drawerContainerColor2;
        final long drawerContentColor3 = drawerContentColor2;
        final float drawerTonalElevation3 = drawerTonalElevation2;
    L130:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L133;
        ComposerKt.traceEventStart(1513027356, $dirty, -1, "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:617)");
    L133:
        NavigationDrawer_androidKt.DrawerPredictiveBackHandler(drawerState, ComposableLambdaKt.rememberComposableLambda(1552342929, true, new NavigationDrawerKt$ModalDrawerSheet$2(windowInsets2, modifier3, drawerShape3, drawerContainerColor3, drawerContentColor3, drawerTonalElevation3, r37), $composer2, 54), $composer2, ($dirty & 14) | 48);
        if (ComposerKt.isTraceInProgress() == false) goto L136;
        ComposerKt.traceEventEnd();
    L136:
        final WindowInsets windowInsets3 = windowInsets2;
        final Modifier modifier4 = modifier3;
        final Shape drawerShape4 = drawerShape3;
        final long drawerContainerColor4 = drawerContainerColor3;
        final long drawerContentColor4 = drawerContentColor3;
        final float drawerTonalElevation4 = drawerTonalElevation3;
    L137:
        ScopeUpdateScope r16 = $composer2.endRestartGroup();
        if (r16 == null) goto L141;
        r16.updateScope(new NavigationDrawerKt$ModalDrawerSheet$3(drawerState, modifier4, drawerShape4, drawerContainerColor4, drawerContentColor4, drawerTonalElevation4, windowInsets3, r37, $changed, r40));
        return;
    L141:
        return;
    L129:
        modifier3 = modifier2;
        drawerShape3 = drawerShape2;
        drawerContainerColor3 = drawerContainerColor2;
        drawerContentColor3 = drawerContentColor2;
        drawerTonalElevation3 = drawerTonalElevation2;
        windowInsets2 = r15;
        goto L130
    L98:
        if ($composer2.getDefaultsInvalid() == true) goto L113;
        $composer2.skipToGroupEnd();
        if ((r40 & 4) == 0) goto L104;
        $dirty = $dirty & (-897);
    L104:
        if ((r40 & 8) == 0) goto L107;
        $dirty = $dirty & (-7169);
    L107:
        if ((r40 & 16) == 0) goto L110;
        $dirty = $dirty & (-57345);
    L110:
        if ((r40 & 64) == 0) goto L112;
        $dirty = $dirty & (-3670017);
        modifier3 = modifier2;
        drawerShape3 = drawerShape2;
        drawerContainerColor3 = drawerContainerColor2;
        drawerContentColor3 = drawerContentColor2;
        drawerTonalElevation3 = drawerTonalElevation2;
        windowInsets2 = r15;
        goto L130
    L112:
        modifier3 = modifier2;
        drawerShape3 = drawerShape2;
        drawerContainerColor3 = drawerContainerColor2;
        drawerContentColor3 = drawerContentColor2;
        drawerTonalElevation3 = drawerTonalElevation2;
        windowInsets2 = r15;
        goto L130
    L92:
        if ($composer2.getSkipping() == false) goto L95;
        $composer2.skipToGroupEnd();
        drawerShape4 = drawerShape2;
        modifier4 = modifier2;
        drawerContainerColor4 = drawerContainerColor2;
        drawerContentColor4 = drawerContentColor2;
        drawerTonalElevation4 = drawerTonalElevation2;
        windowInsets3 = r15;
        goto L137
    L82:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changedInstance(r37) == false) goto L86;
        int r17 = 8388608;
    L87:
        $dirty = $dirty | r17;
        goto L90
    L86:
        r17 = 4194304;
        goto L87
    L70:
        if ((r40 & 64) != 0) goto L74;
        r15 = windowInsets;
        if ($composer2.changed(r15) == false) goto L75;
        int r18 = 1048576;
    L76:
        $dirty = $dirty | r18;
    L75:
        r18 = 524288;
        goto L76
    L74:
        r15 = windowInsets;
        goto L75
    L60:
        if ((196608 & $changed) != 0) goto L66;
        drawerTonalElevation2 = drawerTonalElevation;
        if ($composer2.changed(drawerTonalElevation2) == false) goto L64;
        int r19 = 131072;
    L65:
        $dirty = $dirty | r19;
        goto L68
    L64:
        r19 = 65536;
        goto L65
    L66:
        drawerTonalElevation2 = drawerTonalElevation;
        goto L68
    L48:
        if ((r40 & 16) != 0) goto L52;
        drawerContentColor2 = drawerContentColor;
        if ($composer2.changed(drawerContentColor2) == false) goto L53;
        int r11 = 16384;
    L54:
        $dirty = $dirty | r11;
    L53:
        r11 = 8192;
        goto L54
    L52:
        drawerContentColor2 = drawerContentColor;
        goto L53
    L37:
        if ((r40 & 8) != 0) goto L41;
        drawerContainerColor2 = drawerContainerColor;
        if ($composer2.changed(drawerContainerColor2) == false) goto L42;
        int r8 = 2048;
    L43:
        $dirty = $dirty | r8;
    L42:
        r8 = 1024;
        goto L43
    L41:
        drawerContainerColor2 = drawerContainerColor;
        goto L42
    L26:
        if ((r40 & 4) != 0) goto L30;
        drawerShape2 = drawerShape;
        if ($composer2.changed(drawerShape2) == false) goto L31;
        int r6 = 256;
    L32:
        $dirty = $dirty | r6;
    L31:
        r6 = 128;
        goto L32
    L30:
        drawerShape2 = drawerShape;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L22;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L20;
        int r5 = 32;
    L21:
        $dirty = $dirty | r5;
        goto L24
    L20:
        r5 = 16;
        goto L21
    L22:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(drawerState) == false) goto L10;
        int r4 = 4;
    L11:
        $dirty = $dirty | r4;
        goto L12
    L10:
        r4 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: DismissibleDrawerSheet-afqeVBk, reason: not valid java name */
    public static final void m2408DismissibleDrawerSheetafqeVBk(Modifier modifier, Shape drawerShape, long drawerContainerColor, long drawerContentColor, float drawerTonalElevation, WindowInsets windowInsets, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r34, Composer $composer, final int $changed, final int r37) {
        Composer $composer2 = $composer.startRestartGroup(-588600583);
        ComposerKt.sourceInformation($composer2, "C(DismissibleDrawerSheet)P(5,3,1:c#ui.graphics.Color,2:c#ui.graphics.Color,4:c#ui.unit.Dp,6)656@27243L22,657@27299L37,659@27460L12,662@27530L225:NavigationDrawer.kt#uh7d8r");
        int $dirty = $changed;
        int r3 = r37 & 1;
        if (r3 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier modifier2 = modifier;
    L13:
        int r5 = r37 & 2;
        if (r5 == 0) goto L17;
        $dirty = $dirty | 48;
        Shape drawerShape2 = drawerShape;
    L25:
        if (($changed & 384) == 0) goto L27;
        long drawerContainerColor2 = drawerContainerColor;
    L36:
        if (($changed & 3072) == 0) goto L38;
        long drawerContentColor2 = drawerContentColor;
    L46:
        int r9 = r37 & 16;
        if (r9 == 0) goto L50;
        $dirty = $dirty | 24576;
        float drawerTonalElevation2 = drawerTonalElevation;
    L58:
        if ((196608 & $changed) == 0) goto L60;
        WindowInsets r14 = windowInsets;
    L69:
        if ((r37 & 64) == 0) goto L72;
        $dirty = $dirty | 1572864;
    L80:
        if (($dirty & 599187) == 599186) goto L82;
    L85:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L88;
    L100:
        if (r3 == 0) goto L102;
        modifier2 = Modifier.Companion;
    L102:
        if (r5 == 0) goto L105;
        drawerShape2 = RectangleShapeKt.getRectangleShape();
    L105:
        if ((r37 & 4) == 0) goto L108;
        drawerContainerColor2 = DrawerDefaults.INSTANCE.getStandardContainerColor($composer2, 6);
        $dirty = $dirty & (-897);
    L108:
        if ((r37 & 8) == 0) goto L110;
        drawerContentColor2 = ColorSchemeKt.m2057contentColorForek8zF_U(drawerContainerColor2, $composer2, ($dirty >> 6) & 14);
        $dirty = $dirty & (-7169);
    L110:
        if (r9 == 0) goto L113;
        drawerTonalElevation2 = DrawerDefaults.INSTANCE.m2201getDismissibleDrawerElevationD9Ej5fM();
    L113:
        if ((r37 & 32) == 0) goto L115;
        $dirty = $dirty & (-458753);
        Shape drawerShape3 = drawerShape2;
        long drawerContainerColor3 = drawerContainerColor2;
        long drawerContentColor3 = drawerContentColor2;
        float drawerTonalElevation3 = drawerTonalElevation2;
        WindowInsets windowInsets2 = DrawerDefaults.INSTANCE.getWindowInsets($composer2, 6);
        Modifier modifier3 = modifier2;
        int r0 = -588600583;
    L116:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L119;
        ComposerKt.traceEventStart(r0, $dirty, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:661)");
    L119:
        Composer $composer3 = $composer2;
        m2409DrawerSheet7zSek6w(null, windowInsets2, modifier3, drawerShape3, drawerContainerColor3, drawerContentColor3, drawerTonalElevation3, r34, $composer3, (((((((($dirty >> 12) & 112) | 6) | (($dirty << 6) & 896)) | (($dirty << 6) & 7168)) | (($dirty << 6) & 57344)) | (($dirty << 6) & 458752)) | (($dirty << 6) & 3670016)) | (($dirty << 3) & 29360128), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L122;
        ComposerKt.traceEventEnd();
    L122:
        final WindowInsets windowInsets3 = windowInsets2;
        final Modifier modifier4 = modifier3;
        final long drawerContainerColor4 = drawerContainerColor3;
        final long drawerContentColor4 = drawerContentColor3;
        final float drawerTonalElevation4 = drawerTonalElevation3;
        final Shape drawerShape4 = drawerShape3;
    L123:
        ScopeUpdateScope r13 = $composer3.endRestartGroup();
        if (r13 == null) goto L127;
        r13.updateScope(new NavigationDrawerKt$DismissibleDrawerSheet$1(modifier4, drawerShape4, drawerContainerColor4, drawerContentColor4, drawerTonalElevation4, windowInsets3, r34, $changed, r37));
        return;
    L127:
        return;
    L115:
        drawerContainerColor3 = drawerContainerColor2;
        drawerContentColor3 = drawerContentColor2;
        drawerTonalElevation3 = drawerTonalElevation2;
        windowInsets2 = r14;
        r0 = -588600583;
        modifier3 = modifier2;
        drawerShape3 = drawerShape2;
        goto L116
    L88:
        if ($composer2.getDefaultsInvalid() == true) goto L100;
        $composer2.skipToGroupEnd();
        if ((r37 & 4) == 0) goto L94;
        $dirty = $dirty & (-897);
    L94:
        if ((r37 & 8) == 0) goto L97;
        $dirty = $dirty & (-7169);
    L97:
        if ((r37 & 32) == 0) goto L99;
        $dirty = $dirty & (-458753);
        drawerContainerColor3 = drawerContainerColor2;
        drawerContentColor3 = drawerContentColor2;
        drawerTonalElevation3 = drawerTonalElevation2;
        windowInsets2 = r14;
        r0 = -588600583;
        modifier3 = modifier2;
        drawerShape3 = drawerShape2;
        goto L116
    L99:
        drawerContainerColor3 = drawerContainerColor2;
        drawerContentColor3 = drawerContentColor2;
        drawerTonalElevation3 = drawerTonalElevation2;
        windowInsets2 = r14;
        r0 = -588600583;
        modifier3 = modifier2;
        drawerShape3 = drawerShape2;
        goto L116
    L82:
        if ($composer2.getSkipping() == false) goto L85;
        $composer2.skipToGroupEnd();
        drawerShape4 = drawerShape2;
        drawerContentColor4 = drawerContentColor2;
        $composer3 = $composer2;
        modifier4 = modifier2;
        drawerContainerColor4 = drawerContainerColor2;
        drawerTonalElevation4 = drawerTonalElevation2;
        windowInsets3 = r14;
        goto L123
    L72:
        if (($changed & 1572864) != 0) goto L80;
        if ($composer2.changedInstance(r34) == false) goto L76;
        int r16 = 1048576;
    L77:
        $dirty = $dirty | r16;
        goto L80
    L76:
        r16 = 524288;
        goto L77
    L60:
        if ((r37 & 32) != 0) goto L64;
        r14 = windowInsets;
        if ($composer2.changed(r14) == false) goto L65;
        int r15 = 131072;
    L66:
        $dirty = $dirty | r15;
    L65:
        r15 = 65536;
        goto L66
    L64:
        r14 = windowInsets;
        goto L65
    L50:
        if (($changed & 24576) != 0) goto L56;
        drawerTonalElevation2 = drawerTonalElevation;
        if ($composer2.changed(drawerTonalElevation2) == false) goto L54;
        int r17 = 16384;
    L55:
        $dirty = $dirty | r17;
        goto L58
    L54:
        r17 = 8192;
        goto L55
    L56:
        drawerTonalElevation2 = drawerTonalElevation;
        goto L58
    L38:
        if ((r37 & 8) != 0) goto L42;
        drawerContentColor2 = drawerContentColor;
        if ($composer2.changed(drawerContentColor2) == false) goto L43;
        int r10 = 2048;
    L44:
        $dirty = $dirty | r10;
    L43:
        r10 = 1024;
        goto L44
    L42:
        drawerContentColor2 = drawerContentColor;
        goto L43
    L27:
        if ((r37 & 4) != 0) goto L31;
        drawerContainerColor2 = drawerContainerColor;
        if ($composer2.changed(drawerContainerColor2) == false) goto L32;
        int r11 = 256;
    L33:
        $dirty = $dirty | r11;
    L32:
        r11 = 128;
        goto L33
    L31:
        drawerContainerColor2 = drawerContainerColor;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L23;
        drawerShape2 = drawerShape;
        if ($composer2.changed(drawerShape2) == false) goto L21;
        int r7 = 32;
    L22:
        $dirty = $dirty | r7;
        goto L25
    L21:
        r7 = 16;
        goto L22
    L23:
        drawerShape2 = drawerShape;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L12;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L10;
        int r6 = 4;
    L11:
        $dirty = $dirty | r6;
        goto L13
    L10:
        r6 = 2;
        goto L11
    L12:
        modifier2 = modifier;
        goto L13
    }

    /* JADX INFO: renamed from: DismissibleDrawerSheet-Snr_uVM, reason: not valid java name */
    public static final void m2407DismissibleDrawerSheetSnr_uVM(final DrawerState drawerState, Modifier modifier, Shape drawerShape, long drawerContainerColor, long drawerContentColor, float drawerTonalElevation, WindowInsets windowInsets, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r36, Composer $composer, final int $changed, final int r39) {
        Composer $composer2 = $composer.startRestartGroup(1473549901);
        ComposerKt.sourceInformation($composer2, "C(DismissibleDrawerSheet)P(4,6,3,1:c#ui.graphics.Color,2:c#ui.graphics.Color,5:c#ui.unit.Dp,7)700@29223L22,701@29279L37,703@29440L12,706@29551L299,706@29510L340:NavigationDrawer.kt#uh7d8r");
        int $dirty = $changed;
        if ((r39 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r3 = r39 & 2;
        if (r3 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L23:
        int r5 = r39 & 4;
        if (r5 == 0) goto L27;
        $dirty = $dirty | 384;
        Shape drawerShape2 = drawerShape;
    L35:
        if (($changed & 3072) == 0) goto L37;
        long drawerContainerColor2 = drawerContainerColor;
    L46:
        if (($changed & 24576) == 0) goto L48;
        long drawerContentColor2 = drawerContentColor;
    L56:
        int r14 = r39 & 32;
        if (r14 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        float drawerTonalElevation2 = drawerTonalElevation;
    L68:
        if (($changed & 1572864) != 0) goto L79;
        if ((r39 & 64) != 0) goto L75;
        if ($composer2.changed(windowInsets) == false) goto L75;
        int r17 = 1048576;
    L76:
        $dirty = $dirty | r17;
    L75:
        r17 = 524288;
    L79:
        if ((r39 & 128) == 0) goto L82;
        $dirty = $dirty | 12582912;
    L90:
        if (($dirty & 4793491) == 4793490) goto L92;
    L95:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L98;
    L110:
        if (r3 == 0) goto L112;
        modifier2 = Modifier.Companion;
    L112:
        if (r5 == 0) goto L115;
        drawerShape2 = RectangleShapeKt.getRectangleShape();
    L115:
        if ((r39 & 8) == 0) goto L118;
        drawerContainerColor2 = DrawerDefaults.INSTANCE.getStandardContainerColor($composer2, 6);
        $dirty = $dirty & (-7169);
    L118:
        if ((r39 & 16) == 0) goto L120;
        drawerContentColor2 = ColorSchemeKt.m2057contentColorForek8zF_U(drawerContainerColor2, $composer2, ($dirty >> 9) & 14);
        $dirty = $dirty & (-57345);
    L120:
        if (r14 == 0) goto L123;
        drawerTonalElevation2 = DrawerDefaults.INSTANCE.m2201getDismissibleDrawerElevationD9Ej5fM();
    L123:
        if ((r39 & 64) == 0) goto L125;
        $dirty = $dirty & (-3670017);
        final WindowInsets windowInsets2 = DrawerDefaults.INSTANCE.getWindowInsets($composer2, 6);
        final Modifier modifier3 = modifier2;
        final Shape drawerShape3 = drawerShape2;
        final long drawerContainerColor3 = drawerContainerColor2;
        final long drawerContentColor3 = drawerContentColor2;
        final float drawerTonalElevation3 = drawerTonalElevation2;
    L126:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L129;
        ComposerKt.traceEventStart(1473549901, $dirty, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:705)");
    L129:
        NavigationDrawer_androidKt.DrawerPredictiveBackHandler(drawerState, ComposableLambdaKt.rememberComposableLambda(-807955710, true, new NavigationDrawerKt$DismissibleDrawerSheet$2(windowInsets2, modifier3, drawerShape3, drawerContainerColor3, drawerContentColor3, drawerTonalElevation3, r36), $composer2, 54), $composer2, ($dirty & 14) | 48);
        if (ComposerKt.isTraceInProgress() == false) goto L132;
        ComposerKt.traceEventEnd();
    L132:
        final WindowInsets windowInsets3 = windowInsets2;
        final Modifier modifier4 = modifier3;
        final Shape drawerShape4 = drawerShape3;
        final long drawerContainerColor4 = drawerContainerColor3;
        final long drawerContentColor4 = drawerContentColor3;
        final float drawerTonalElevation4 = drawerTonalElevation3;
    L133:
        ScopeUpdateScope r15 = $composer2.endRestartGroup();
        if (r15 == null) goto L137;
        r15.updateScope(new NavigationDrawerKt$DismissibleDrawerSheet$3(drawerState, modifier4, drawerShape4, drawerContainerColor4, drawerContentColor4, drawerTonalElevation4, windowInsets3, r36, $changed, r39));
        return;
    L137:
        return;
    L125:
        windowInsets2 = windowInsets;
        modifier3 = modifier2;
        drawerShape3 = drawerShape2;
        drawerContainerColor3 = drawerContainerColor2;
        drawerContentColor3 = drawerContentColor2;
        drawerTonalElevation3 = drawerTonalElevation2;
        goto L126
    L98:
        if ($composer2.getDefaultsInvalid() == true) goto L110;
        $composer2.skipToGroupEnd();
        if ((r39 & 8) == 0) goto L104;
        $dirty = $dirty & (-7169);
    L104:
        if ((r39 & 16) == 0) goto L107;
        $dirty = $dirty & (-57345);
    L107:
        if ((r39 & 64) == 0) goto L109;
        windowInsets2 = windowInsets;
        $dirty = $dirty & (-3670017);
        modifier3 = modifier2;
        drawerShape3 = drawerShape2;
        drawerContainerColor3 = drawerContainerColor2;
        drawerContentColor3 = drawerContentColor2;
        drawerTonalElevation3 = drawerTonalElevation2;
        goto L126
    L109:
        windowInsets2 = windowInsets;
        modifier3 = modifier2;
        drawerShape3 = drawerShape2;
        drawerContainerColor3 = drawerContainerColor2;
        drawerContentColor3 = drawerContentColor2;
        drawerTonalElevation3 = drawerTonalElevation2;
        goto L126
    L92:
        if ($composer2.getSkipping() == false) goto L95;
        $composer2.skipToGroupEnd();
        modifier4 = modifier2;
        drawerShape4 = drawerShape2;
        drawerContainerColor4 = drawerContainerColor2;
        drawerContentColor4 = drawerContentColor2;
        drawerTonalElevation4 = drawerTonalElevation2;
        windowInsets3 = windowInsets;
        goto L133
    L82:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changedInstance(r36) == false) goto L86;
        int r18 = 8388608;
    L87:
        $dirty = $dirty | r18;
        goto L90
    L86:
        r18 = 4194304;
        goto L87
    L60:
        if ((196608 & $changed) != 0) goto L66;
        drawerTonalElevation2 = drawerTonalElevation;
        if ($composer2.changed(drawerTonalElevation2) == false) goto L64;
        int r16 = 131072;
    L65:
        $dirty = $dirty | r16;
        goto L68
    L64:
        r16 = 65536;
        goto L65
    L66:
        drawerTonalElevation2 = drawerTonalElevation;
        goto L68
    L48:
        if ((r39 & 16) != 0) goto L52;
        drawerContentColor2 = drawerContentColor;
        if ($composer2.changed(drawerContentColor2) == false) goto L53;
        int r19 = 16384;
    L54:
        $dirty = $dirty | r19;
    L53:
        r19 = 8192;
        goto L54
    L52:
        drawerContentColor2 = drawerContentColor;
        goto L53
    L37:
        if ((r39 & 8) != 0) goto L41;
        drawerContainerColor2 = drawerContainerColor;
        if ($composer2.changed(drawerContainerColor2) == false) goto L42;
        int r9 = 2048;
    L43:
        $dirty = $dirty | r9;
    L42:
        r9 = 1024;
        goto L43
    L41:
        drawerContainerColor2 = drawerContainerColor;
        goto L42
    L27:
        if (($changed & 384) != 0) goto L33;
        drawerShape2 = drawerShape;
        if ($composer2.changed(drawerShape2) == false) goto L31;
        int r7 = 256;
    L32:
        $dirty = $dirty | r7;
        goto L35
    L31:
        r7 = 128;
        goto L32
    L33:
        drawerShape2 = drawerShape;
        goto L35
    L16:
        if (($changed & 48) != 0) goto L22;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L20;
        int r6 = 32;
    L21:
        $dirty = $dirty | r6;
        goto L23
    L20:
        r6 = 16;
        goto L21
    L22:
        modifier2 = modifier;
        goto L23
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(drawerState) == false) goto L10;
        int r4 = 4;
    L11:
        $dirty = $dirty | r4;
        goto L12
    L10:
        r4 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: PermanentDrawerSheet-afqeVBk, reason: not valid java name */
    public static final void m2413PermanentDrawerSheetafqeVBk(Modifier modifier, Shape drawerShape, long drawerContainerColor, long drawerContentColor, float drawerTonalElevation, WindowInsets windowInsets, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r34, Composer $composer, final int $changed, final int r37) {
        Composer $composer2 = $composer.startRestartGroup(-1733353241);
        ComposerKt.sourceInformation($composer2, "C(PermanentDrawerSheet)P(5,3,1:c#ui.graphics.Color,2:c#ui.graphics.Color,4:c#ui.unit.Dp,6)740@31022L22,741@31078L37,743@31237L12,746@31328L33,750@31470L30,747@31366L266:NavigationDrawer.kt#uh7d8r");
        int $dirty = $changed;
        int r3 = r37 & 1;
        if (r3 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier modifier2 = modifier;
    L13:
        int r5 = r37 & 2;
        if (r5 == 0) goto L17;
        $dirty = $dirty | 48;
        Shape drawerShape2 = drawerShape;
    L25:
        if (($changed & 384) == 0) goto L27;
        long drawerContainerColor2 = drawerContainerColor;
    L36:
        if (($changed & 3072) == 0) goto L38;
        long drawerContentColor2 = drawerContentColor;
    L46:
        int r9 = r37 & 16;
        if (r9 == 0) goto L50;
        $dirty = $dirty | 24576;
        float drawerTonalElevation2 = drawerTonalElevation;
    L58:
        if ((196608 & $changed) == 0) goto L60;
        WindowInsets r14 = windowInsets;
    L69:
        if ((r37 & 64) == 0) goto L72;
        $dirty = $dirty | 1572864;
    L80:
        if (($dirty & 599187) == 599186) goto L82;
    L85:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L88;
    L100:
        if (r3 == 0) goto L102;
        modifier2 = Modifier.Companion;
    L102:
        if (r5 == 0) goto L105;
        drawerShape2 = RectangleShapeKt.getRectangleShape();
    L105:
        if ((r37 & 4) == 0) goto L108;
        drawerContainerColor2 = DrawerDefaults.INSTANCE.getStandardContainerColor($composer2, 6);
        $dirty = $dirty & (-897);
    L108:
        if ((r37 & 8) == 0) goto L110;
        drawerContentColor2 = ColorSchemeKt.m2057contentColorForek8zF_U(drawerContainerColor2, $composer2, ($dirty >> 6) & 14);
        $dirty = $dirty & (-7169);
    L110:
        if (r9 == 0) goto L113;
        drawerTonalElevation2 = DrawerDefaults.INSTANCE.m2204getPermanentDrawerElevationD9Ej5fM();
    L113:
        if ((r37 & 32) == 0) goto L115;
        $dirty = $dirty & (-458753);
        Shape drawerShape3 = drawerShape2;
        long drawerContainerColor3 = drawerContainerColor2;
        long drawerContentColor3 = drawerContentColor2;
        float drawerTonalElevation3 = drawerTonalElevation2;
        WindowInsets windowInsets2 = DrawerDefaults.INSTANCE.getWindowInsets($composer2, 6);
        int r0 = -1733353241;
    L116:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L119;
        ComposerKt.traceEventStart(r0, $dirty, -1, "androidx.compose.material3.PermanentDrawerSheet (NavigationDrawer.kt:745)");
    L119:
        Strings.Companion r1 = Strings.Companion;
        final String navigationMenu = Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(androidx.compose.ui.R.string.navigation_menu), $composer2, 0);
        ComposerKt.sourceInformationMarkerStart($composer2, 391093473, "CC(remember):NavigationDrawer.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(navigationMenu);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L122;
    L125:
        Object value$iv = (Function1) new NavigationDrawerKt$PermanentDrawerSheet$1$1(navigationMenu);
        $composer2.updateRememberedValue(value$iv);
    L126:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Composer $composer3 = $composer2;
        m2409DrawerSheet7zSek6w(null, windowInsets2, SemanticsModifierKt.semantics$default(modifier2, false, (Function1) value$iv, 1, null), drawerShape3, drawerContainerColor3, drawerContentColor3, drawerTonalElevation3, r34, $composer3, ((((((($dirty >> 12) & 112) | 6) | (($dirty << 6) & 7168)) | (($dirty << 6) & 57344)) | (($dirty << 6) & 458752)) | (($dirty << 6) & 3670016)) | (($dirty << 3) & 29360128), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L129;
        ComposerKt.traceEventEnd();
    L129:
        final Modifier modifier3 = modifier2;
        final WindowInsets windowInsets3 = windowInsets2;
        final long drawerContainerColor4 = drawerContainerColor3;
        final long drawerContentColor4 = drawerContentColor3;
        final float drawerTonalElevation4 = drawerTonalElevation3;
        final Shape drawerShape4 = drawerShape3;
    L130:
        ScopeUpdateScope r13 = $composer3.endRestartGroup();
        if (r13 == null) goto L134;
        r13.updateScope(new NavigationDrawerKt$PermanentDrawerSheet$2(modifier3, drawerShape4, drawerContainerColor4, drawerContentColor4, drawerTonalElevation4, windowInsets3, r34, $changed, r37));
        return;
    L134:
        return;
    L122:
        if (it$iv == Composer.Companion.getEmpty()) goto L125;
        value$iv = it$iv;
        goto L126
    L115:
        drawerContainerColor3 = drawerContainerColor2;
        drawerContentColor3 = drawerContentColor2;
        drawerTonalElevation3 = drawerTonalElevation2;
        windowInsets2 = r14;
        r0 = -1733353241;
        drawerShape3 = drawerShape2;
        goto L116
    L88:
        if ($composer2.getDefaultsInvalid() == true) goto L100;
        $composer2.skipToGroupEnd();
        if ((r37 & 4) == 0) goto L94;
        $dirty = $dirty & (-897);
    L94:
        if ((r37 & 8) == 0) goto L97;
        $dirty = $dirty & (-7169);
    L97:
        if ((r37 & 32) == 0) goto L99;
        $dirty = $dirty & (-458753);
        drawerContainerColor3 = drawerContainerColor2;
        drawerContentColor3 = drawerContentColor2;
        drawerTonalElevation3 = drawerTonalElevation2;
        windowInsets2 = r14;
        r0 = -1733353241;
        drawerShape3 = drawerShape2;
        goto L116
    L99:
        drawerContainerColor3 = drawerContainerColor2;
        drawerContentColor3 = drawerContentColor2;
        drawerTonalElevation3 = drawerTonalElevation2;
        windowInsets2 = r14;
        r0 = -1733353241;
        drawerShape3 = drawerShape2;
        goto L116
    L82:
        if ($composer2.getSkipping() == false) goto L85;
        $composer2.skipToGroupEnd();
        drawerShape4 = drawerShape2;
        drawerContentColor4 = drawerContentColor2;
        $composer3 = $composer2;
        modifier3 = modifier2;
        drawerContainerColor4 = drawerContainerColor2;
        drawerTonalElevation4 = drawerTonalElevation2;
        windowInsets3 = r14;
        goto L130
    L72:
        if (($changed & 1572864) != 0) goto L80;
        if ($composer2.changedInstance(r34) == false) goto L76;
        int r16 = 1048576;
    L77:
        $dirty = $dirty | r16;
        goto L80
    L76:
        r16 = 524288;
        goto L77
    L60:
        if ((r37 & 32) != 0) goto L64;
        r14 = windowInsets;
        if ($composer2.changed(r14) == false) goto L65;
        int r15 = 131072;
    L66:
        $dirty = $dirty | r15;
    L65:
        r15 = 65536;
        goto L66
    L64:
        r14 = windowInsets;
        goto L65
    L50:
        if (($changed & 24576) != 0) goto L56;
        drawerTonalElevation2 = drawerTonalElevation;
        if ($composer2.changed(drawerTonalElevation2) == false) goto L54;
        int r17 = 16384;
    L55:
        $dirty = $dirty | r17;
        goto L58
    L54:
        r17 = 8192;
        goto L55
    L56:
        drawerTonalElevation2 = drawerTonalElevation;
        goto L58
    L38:
        if ((r37 & 8) != 0) goto L42;
        drawerContentColor2 = drawerContentColor;
        if ($composer2.changed(drawerContentColor2) == false) goto L43;
        int r10 = 2048;
    L44:
        $dirty = $dirty | r10;
    L43:
        r10 = 1024;
        goto L44
    L42:
        drawerContentColor2 = drawerContentColor;
        goto L43
    L27:
        if ((r37 & 4) != 0) goto L31;
        drawerContainerColor2 = drawerContainerColor;
        if ($composer2.changed(drawerContainerColor2) == false) goto L32;
        int r11 = 256;
    L33:
        $dirty = $dirty | r11;
    L32:
        r11 = 128;
        goto L33
    L31:
        drawerContainerColor2 = drawerContainerColor;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L23;
        drawerShape2 = drawerShape;
        if ($composer2.changed(drawerShape2) == false) goto L21;
        int r7 = 32;
    L22:
        $dirty = $dirty | r7;
        goto L25
    L21:
        r7 = 16;
        goto L22
    L23:
        drawerShape2 = drawerShape;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L12;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L10;
        int r6 = 4;
    L11:
        $dirty = $dirty | r6;
        goto L13
    L10:
        r6 = 2;
        goto L11
    L12:
        modifier2 = modifier;
        goto L13
    }

    /* JADX INFO: renamed from: DrawerSheet-7zSek6w, reason: not valid java name */
    public static final void m2409DrawerSheet7zSek6w(final DrawerPredictiveBackState drawerPredictiveBackState, final WindowInsets windowInsets, Modifier modifier, Shape drawerShape, long drawerContainerColor, long drawerContentColor, float drawerTonalElevation, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r35, Composer $composer, final int $changed, final int r38) {
        Composer $composer2 = $composer.startRestartGroup(-151557245);
        ComposerKt.sourceInformation($composer2, "C(DrawerSheet)P(3,7,6,4,1:c#ui.graphics.Color,2:c#ui.graphics.Color,5:c#ui.unit.Dp)765@31890L22,766@31946L37,770@32146L7,785@32790L545,775@32383L952:NavigationDrawer.kt#uh7d8r");
        int $dirty = $changed;
        if ((r38 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r38 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L22:
        int r5 = r38 & 4;
        if (r5 == 0) goto L26;
        $dirty = $dirty | 384;
        Modifier modifier2 = modifier;
    L33:
        int r7 = r38 & 8;
        if (r7 == 0) goto L37;
        $dirty = $dirty | 3072;
        Shape drawerShape2 = drawerShape;
    L45:
        if (($changed & 24576) == 0) goto L47;
        long drawerContainerColor2 = drawerContainerColor;
    L56:
        if ((196608 & $changed) != 0) goto L66;
        if ((r38 & 32) != 0) goto L63;
        if ($composer2.changed(drawerContentColor) == false) goto L63;
        int r15 = 131072;
    L64:
        $dirty = $dirty | r15;
    L63:
        r15 = 65536;
    L66:
        int r16 = r38 & 64;
        if (r16 == 0) goto L70;
        $dirty = $dirty | 1572864;
        final float drawerTonalElevation2 = drawerTonalElevation;
    L78:
        if ((r38 & 128) == 0) goto L81;
        $dirty = $dirty | 12582912;
    L88:
        if ((4793491 & $dirty) == 4793490) goto L90;
    L93:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L96;
    L105:
        if (r5 == 0) goto L107;
        modifier2 = Modifier.Companion;
    L107:
        if (r7 == 0) goto L110;
        drawerShape2 = RectangleShapeKt.getRectangleShape();
    L110:
        if ((r38 & 16) == 0) goto L113;
        drawerContainerColor2 = DrawerDefaults.INSTANCE.getStandardContainerColor($composer2, 6);
        $dirty = $dirty & (-57345);
    L113:
        if ((r38 & 32) == 0) goto L115;
        long drawerContentColor2 = ColorSchemeKt.m2057contentColorForek8zF_U(drawerContainerColor2, $composer2, ($dirty >> 12) & 14);
        $dirty = $dirty & (-458753);
    L116:
        if (r16 == 0) goto L118;
        float drawerTonalElevation3 = DrawerDefaults.INSTANCE.m2204getPermanentDrawerElevationD9Ej5fM();
        long drawerContainerColor3 = drawerContainerColor2;
        Shape drawerShape3 = drawerShape2;
    L119:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L122;
        ComposerKt.traceEventStart(-151557245, $dirty, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:769)");
    L122:
        ProvidableCompositionLocal<LayoutDirection> r1 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r8 = $composer2.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (r8 != LayoutDirection.Rtl) goto L125;
        final boolean isRtl = true;
    L126:
        if (drawerPredictiveBackState == null) goto L128;
        final DrawerPredictiveBackState r9 = drawerPredictiveBackState;
        Modifier.Companion predictiveBackDrawerContainerModifier = predictiveBackDrawerContainer(Modifier.Companion, r9, isRtl);
    L129:
        Modifier modifier3 = modifier2;
        Composer $composer3 = $composer2;
        SurfaceKt.m2670SurfaceT9BRK9s(SizeKt.fillMaxHeight$default(SizeKt.m776sizeInqDBjuR0$default(modifier3, MinimumDrawerWidth, 0.0f, DrawerDefaults.INSTANCE.m2202getMaximumDrawerWidthD9Ej5fM(), 0.0f, 10, null).then(predictiveBackDrawerContainerModifier), 0.0f, 1, null), drawerShape3, drawerContainerColor3, drawerContentColor2, drawerTonalElevation3, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(669057502, true, new NavigationDrawerKt$DrawerSheet$1(r9, isRtl, windowInsets, r35), $composer2, 54), $composer3, ((((($dirty >> 6) & 112) | 12582912) | (($dirty >> 6) & 896)) | (($dirty >> 6) & 7168)) | (($dirty >> 6) & 57344), 96);
        if (ComposerKt.isTraceInProgress() == false) goto L132;
        ComposerKt.traceEventEnd();
    L132:
        final Modifier modifier4 = modifier3;
        final Shape drawerShape4 = drawerShape3;
        final long drawerContainerColor4 = drawerContainerColor3;
        final long drawerContentColor3 = drawerContentColor2;
        drawerTonalElevation2 = drawerTonalElevation3;
    L133:
        ScopeUpdateScope r14 = $composer3.endRestartGroup();
        if (r14 == null) goto L137;
        r14.updateScope(new NavigationDrawerKt$DrawerSheet$2(drawerPredictiveBackState, windowInsets, modifier4, drawerShape4, drawerContainerColor4, drawerContentColor3, drawerTonalElevation2, r35, $changed, r38));
        return;
    L137:
        return;
    L128:
        r9 = drawerPredictiveBackState;
        predictiveBackDrawerContainerModifier = Modifier.Companion;
        goto L129
    L125:
        isRtl = false;
        goto L126
    L118:
        drawerTonalElevation3 = drawerTonalElevation2;
        drawerContainerColor3 = drawerContainerColor2;
        drawerShape3 = drawerShape2;
        goto L119
    L115:
        drawerContentColor2 = drawerContentColor;
        goto L116
    L96:
        if ($composer2.getDefaultsInvalid() == true) goto L105;
        $composer2.skipToGroupEnd();
        if ((r38 & 16) == 0) goto L102;
        $dirty = $dirty & (-57345);
    L102:
        if ((r38 & 32) == 0) goto L104;
        drawerContentColor2 = drawerContentColor;
        $dirty = $dirty & (-458753);
        drawerTonalElevation3 = drawerTonalElevation2;
        drawerContainerColor3 = drawerContainerColor2;
        drawerShape3 = drawerShape2;
        goto L119
    L104:
        drawerContentColor2 = drawerContentColor;
        drawerTonalElevation3 = drawerTonalElevation2;
        drawerContainerColor3 = drawerContainerColor2;
        drawerShape3 = drawerShape2;
        goto L119
    L90:
        if ($composer2.getSkipping() == false) goto L93;
        $composer2.skipToGroupEnd();
        $composer3 = $composer2;
        modifier4 = modifier2;
        drawerContainerColor4 = drawerContainerColor2;
        drawerShape4 = drawerShape2;
        drawerContentColor3 = drawerContentColor;
        goto L133
    L81:
        if (($changed & 12582912) != 0) goto L88;
        if ($composer2.changedInstance(r35) == false) goto L85;
        int r0 = 8388608;
    L86:
        $dirty = $dirty | r0;
        goto L88
    L85:
        r0 = 4194304;
        goto L86
    L70:
        if (($changed & 1572864) != 0) goto L76;
        drawerTonalElevation2 = drawerTonalElevation;
        if ($composer2.changed(drawerTonalElevation2) == false) goto L74;
        int r17 = 1048576;
    L75:
        $dirty = $dirty | r17;
        goto L78
    L74:
        r17 = 524288;
        goto L75
    L76:
        drawerTonalElevation2 = drawerTonalElevation;
        goto L78
    L47:
        if ((r38 & 16) != 0) goto L51;
        drawerContainerColor2 = drawerContainerColor;
        if ($composer2.changed(drawerContainerColor2) == false) goto L52;
        int r10 = 16384;
    L53:
        $dirty = $dirty | r10;
    L52:
        r10 = 8192;
        goto L53
    L51:
        drawerContainerColor2 = drawerContainerColor;
        goto L52
    L37:
        if (($changed & 3072) != 0) goto L43;
        drawerShape2 = drawerShape;
        if ($composer2.changed(drawerShape2) == false) goto L41;
        int r11 = 2048;
    L42:
        $dirty = $dirty | r11;
        goto L45
    L41:
        r11 = 1024;
        goto L42
    L43:
        drawerShape2 = drawerShape;
        goto L45
    L26:
        if (($changed & 384) != 0) goto L32;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L30;
        int r12 = 256;
    L31:
        $dirty = $dirty | r12;
        goto L33
    L30:
        r12 = 128;
        goto L31
    L32:
        modifier2 = modifier;
        goto L33
    L16:
        if (($changed & 48) != 0) goto L22;
        if ($composer2.changed(windowInsets) == false) goto L20;
        int r6 = 32;
    L21:
        $dirty = $dirty | r6;
        goto L22
    L20:
        r6 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(drawerPredictiveBackState) == false) goto L10;
        int r13 = 4;
    L11:
        $dirty = $dirty | r13;
        goto L13
    L10:
        r13 = 2;
        goto L11
    }

    private static final Modifier predictiveBackDrawerContainer(Modifier $this$predictiveBackDrawerContainer, final DrawerPredictiveBackState drawerPredictiveBackState, final boolean isRtl) {
        return GraphicsLayerModifierKt.graphicsLayer($this$predictiveBackDrawerContainer, new C05441(drawerPredictiveBackState, isRtl));
    }

    private static final Modifier predictiveBackDrawerChild(Modifier $this$predictiveBackDrawerChild, final DrawerPredictiveBackState drawerPredictiveBackState, final boolean isRtl) {
        return GraphicsLayerModifierKt.graphicsLayer($this$predictiveBackDrawerChild, new C05431(drawerPredictiveBackState, isRtl));
    }

    private static final float calculatePredictiveBackScaleX(GraphicsLayerScope $this$calculatePredictiveBackScaleX, DrawerPredictiveBackState drawerPredictiveBackState) {
        float width = Size.m4194getWidthimpl($this$calculatePredictiveBackScaleX.mo4552getSizeNHjbRc());
        if (Float.isNaN(width) == true) goto L17;
        int scaleXDirection = 1;
        if (width != 0.0f) goto L7;
        boolean r1 = true;
    L8:
        if (r1 == false) goto L11;
        return 1.0f;
    L11:
        if (drawerPredictiveBackState.getSwipeEdgeMatchesDrawer() == true) goto L16;
        scaleXDirection = -1;
    L16:
        return 1.0f + ((drawerPredictiveBackState.getScaleXDistance() * scaleXDirection) / width);
    L7:
        r1 = false;
        goto L8
    L17:
        return 1.0f;
    }

    private static final float calculatePredictiveBackScaleY(GraphicsLayerScope $this$calculatePredictiveBackScaleY, DrawerPredictiveBackState drawerPredictiveBackState) {
        float height = Size.m4191getHeightimpl($this$calculatePredictiveBackScaleY.mo4552getSizeNHjbRc());
        if (Float.isNaN(height) == false) goto L5;
        return 1.0f;
    L5:
        if (height != 0.0f) goto L7;
        boolean r1 = true;
    L8:
        if (r1 == false) goto L12;
        return 1.0f;
    L12:
        return 1.0f - (drawerPredictiveBackState.getScaleYDistance() / height);
    L7:
        r1 = false;
        goto L8
    }

    public static final void NavigationDrawerItem(final Function2<? super Composer, ? super Integer, Unit> r29, final boolean selected, final Function0<Unit> r31, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> r33, Function2<? super Composer, ? super Integer, Unit> r34, Shape shape, NavigationDrawerItemColors colors, MutableInteractionSource interactionSource, Composer $composer, final int $changed, final int r40) {
        Composer $composer2 = $composer.startRestartGroup(-1304626543);
        ComposerKt.sourceInformation($composer2, "C(NavigationDrawerItem)P(4,7,6,5,2!1,8)931@38697L5,932@38774L8,944@39157L24,946@39242L884,935@38848L1278:NavigationDrawer.kt#uh7d8r");
        int $dirty = $changed;
        if ((r40 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L14:
        if ((r40 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L24:
        if ((r40 & 4) == 0) goto L27;
        $dirty = $dirty | 384;
    L34:
        int r8 = r40 & 8;
        if (r8 == 0) goto L38;
        $dirty = $dirty | 3072;
        Modifier r9 = modifier;
    L45:
        int r10 = r40 & 16;
        if (r10 == 0) goto L49;
        $dirty = $dirty | 24576;
        Function2<? super Composer, ? super Integer, Unit> r11 = r33;
    L56:
        int r12 = r40 & 32;
        if (r12 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function2<? super Composer, ? super Integer, Unit> r13 = r34;
    L68:
        if ((1572864 & $changed) == 0) goto L70;
        Shape r15 = shape;
    L79:
        if (($changed & 12582912) == 0) goto L81;
        NavigationDrawerItemColors colors2 = colors;
    L89:
        int r3 = r40 & 256;
        if (r3 == 0) goto L93;
        $dirty = $dirty | 100663296;
        MutableInteractionSource r5 = interactionSource;
    L101:
        if (($dirty & 38347923) == 38347922) goto L103;
    L106:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L109;
    L118:
        if (r8 == 0) goto L120;
        Modifier.Companion modifier2 = Modifier.Companion;
    L121:
        if (r10 == 0) goto L123;
        Function2<? super Composer, ? super Integer, Unit> r25 = null;
    L124:
        if (r12 == 0) goto L126;
        Function2<? super Composer, ? super Integer, Unit> r26 = null;
    L128:
        if ((r40 & 64) == 0) goto L130;
        Shape shape2 = ShapesKt.getValue(NavigationDrawerTokens.INSTANCE.getActiveIndicatorShape(), $composer2, 6);
        int $dirty2 = $dirty & (-3670017);
    L132:
        if ((r40 & 128) == 0) goto L134;
        int r4 = 2;
        NavigationDrawerItemColors colors3 = NavigationDrawerItemDefaults.INSTANCE.m2406colorsoq7We08(0, 0, 0, 0, 0, 0, 0, 0, $composer2, 100663296, 255);
        $composer2 = $composer2;
        $dirty2 = $dirty2 & (-29360129);
    L135:
        if (r3 == 0) goto L137;
        colors2 = colors3;
        MutableInteractionSource interactionSource2 = null;
        Shape shape3 = shape2;
        int $dirty3 = $dirty2;
    L138:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L141;
        ComposerKt.traceEventStart(-1304626543, $dirty3, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:934)");
    L141:
        final NavigationDrawerItemColors colors4 = colors2;
        final Function2<? super Composer, ? super Integer, Unit> r35 = r25;
        final Function2<? super Composer, ? super Integer, Unit> r36 = r26;
        Modifier modifier3 = modifier2;
        SurfaceKt.m2671Surfaced85dljk(selected, r31, SizeKt.fillMaxWidth$default(SizeKt.m760heightInVpY3zN4$default(SemanticsModifierKt.semantics$default(modifier2, false, AnonymousClass1.INSTANCE, 1, null), NavigationDrawerTokens.INSTANCE.m3449getActiveIndicatorHeightD9Ej5fM(), 0.0f, r4, null), 0.0f, 1, null), false, shape3, colors2.containerColor(selected, $composer2, (($dirty3 >> 3) & 14) | (($dirty3 >> 18) & 112)).getValue().m4376unboximpl(), 0, 0.0f, 0.0f, null, interactionSource2, ComposableLambdaKt.rememberComposableLambda(191488423, true, new AnonymousClass2(r35, colors4, selected, r36, r29), $composer2, 54), $composer2, ((($dirty3 >> 3) & 14) | (($dirty3 >> 3) & 112)) | (($dirty3 >> 6) & 57344), (($dirty3 >> 24) & 14) | 48, 968);
        Composer $composer3 = $composer2;
        if (ComposerKt.isTraceInProgress() == false) goto L144;
        ComposerKt.traceEventEnd();
    L144:
        final Shape shape4 = shape3;
        final MutableInteractionSource interactionSource3 = interactionSource2;
        final NavigationDrawerItemColors colors5 = colors4;
        final Modifier modifier4 = modifier3;
        final Function2<? super Composer, ? super Integer, Unit> r6 = r25;
        final Function2<? super Composer, ? super Integer, Unit> r7 = r26;
    L145:
        ScopeUpdateScope r14 = $composer3.endRestartGroup();
        if (r14 == null) goto L149;
        r14.updateScope(new C05413(r29, selected, r31, modifier4, r6, r7, shape4, colors5, interactionSource3, $changed, r40));
        return;
    L149:
        return;
    L137:
        interactionSource2 = interactionSource;
        colors2 = colors3;
        shape3 = shape2;
        $dirty3 = $dirty2;
        goto L138
    L134:
        r4 = 2;
        colors3 = colors;
        goto L135
    L130:
        shape2 = r15;
        $dirty2 = $dirty;
        goto L132
    L126:
        r26 = r13;
        goto L128
    L123:
        r25 = r11;
        goto L124
    L120:
        modifier2 = r9;
        goto L121
    L109:
        if ($composer2.getDefaultsInvalid() == true) goto L118;
        $composer2.skipToGroupEnd();
        if ((r40 & 64) == 0) goto L115;
        $dirty = $dirty & (-3670017);
    L115:
        if ((r40 & 128) == 0) goto L117;
        int r1 = $dirty & (-29360129);
        interactionSource2 = r5;
        r25 = r11;
        r26 = r13;
        shape3 = r15;
        r4 = 2;
        $dirty3 = r1;
        modifier2 = r9;
        goto L138
    L117:
        interactionSource2 = r5;
        modifier2 = r9;
        r25 = r11;
        r26 = r13;
        r4 = 2;
        $dirty3 = $dirty;
        shape3 = r15;
        goto L138
    L103:
        if ($composer2.getSkipping() == false) goto L106;
        $composer2.skipToGroupEnd();
        colors5 = colors2;
        modifier4 = r9;
        r7 = r13;
        $composer3 = $composer2;
        shape4 = r15;
        interactionSource3 = r5;
        r6 = r11;
        goto L145
    L93:
        if (($changed & 100663296) != 0) goto L99;
        r5 = interactionSource;
        if ($composer2.changed(r5) == false) goto L97;
        int r16 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L98:
        $dirty = $dirty | r16;
        goto L101
    L97:
        r16 = 33554432;
        goto L98
    L99:
        r5 = interactionSource;
        goto L101
    L81:
        if ((r40 & 128) != 0) goto L85;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L86;
        int r17 = 8388608;
    L87:
        $dirty = $dirty | r17;
    L86:
        r17 = 4194304;
        goto L87
    L85:
        colors2 = colors;
        goto L86
    L70:
        if ((r40 & 64) != 0) goto L74;
        r15 = shape;
        if ($composer2.changed(r15) == false) goto L75;
        int r18 = 1048576;
    L76:
        $dirty = $dirty | r18;
    L75:
        r18 = 524288;
        goto L76
    L74:
        r15 = shape;
        goto L75
    L60:
        if ((196608 & $changed) != 0) goto L66;
        r13 = r34;
        if ($composer2.changedInstance(r13) == false) goto L64;
        int r19 = 131072;
    L65:
        $dirty = $dirty | r19;
        goto L68
    L64:
        r19 = 65536;
        goto L65
    L66:
        r13 = r34;
        goto L68
    L49:
        if (($changed & 24576) != 0) goto L55;
        r11 = r33;
        if ($composer2.changedInstance(r11) == false) goto L53;
        int r110 = 16384;
    L54:
        $dirty = $dirty | r110;
        goto L56
    L53:
        r110 = 8192;
        goto L54
    L55:
        r11 = r33;
        goto L56
    L38:
        if (($changed & 3072) != 0) goto L44;
        r9 = modifier;
        if ($composer2.changed(r9) == false) goto L42;
        int r111 = 2048;
    L43:
        $dirty = $dirty | r111;
        goto L45
    L42:
        r111 = 1024;
        goto L43
    L44:
        r9 = modifier;
        goto L45
    L27:
        if (($changed & 384) != 0) goto L34;
        if ($composer2.changedInstance(r31) == false) goto L31;
        int r20 = 256;
    L32:
        $dirty = $dirty | r20;
        goto L34
    L31:
        r20 = 128;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changed(selected) == false) goto L21;
        int r21 = 32;
    L22:
        $dirty = $dirty | r21;
        goto L24
    L21:
        r21 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L14;
        if ($composer2.changedInstance(r29) == false) goto L10;
        int r22 = 4;
    L11:
        $dirty = $dirty | r22;
        goto L14
    L10:
        r22 = 2;
        goto L11
    }

    private static final float calculateFraction(float a, float b, float pos) {
        return RangesKt.coerceIn((pos - a) / (b - a), 0.0f, 1.0f);
    }

    /* JADX INFO: renamed from: Scrim-Bx497Mc, reason: not valid java name */
    private static final void m2414ScrimBx497Mc(final boolean open, final Function0<Unit> r22, final Function0<Float> r23, final long color, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(2106487387);
        ComposerKt.sourceInformation($composer2, "C(Scrim)P(3,2,1,0:c#ui.graphics.Color)1142@46950L30,1157@47448L39,1157@47397L90:NavigationDrawer.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(open) == false) goto L7;
        int r9 = 4;
    L8:
        $dirty = $dirty | r9;
        goto L10
    L7:
        r9 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(r22) == false) goto L14;
        int r10 = 32;
    L15:
        $dirty = $dirty | r10;
        goto L17
    L14:
        r10 = 16;
    L17:
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changedInstance(r23) == false) goto L21;
        int r11 = 256;
    L22:
        $dirty = $dirty | r11;
        goto L24
    L21:
        r11 = 128;
    L24:
        if (($changed & 3072) != 0) goto L31;
        if ($composer2.changed(color) == false) goto L28;
        int r12 = 2048;
    L29:
        $dirty = $dirty | r12;
        goto L31
    L28:
        r12 = 1024;
    L31:
        if (($dirty & 1171) != 1170) goto L37;
        if ($composer2.getSkipping() == false) goto L37;
        $composer2.skipToGroupEnd();
    L83:
        ScopeUpdateScope r13 = $composer2.endRestartGroup();
        if (r13 == null) goto L87;
        r13.updateScope(new NavigationDrawerKt$Scrim$2(open, r22, r23, color, $changed));
        return;
    L87:
        return;
    L37:
        if (ComposerKt.isTraceInProgress() == false) goto L39;
        ComposerKt.traceEventStart(2106487387, $dirty, -1, "androidx.compose.material3.Scrim (NavigationDrawer.kt:1141)");
    L39:
        Strings.Companion r0 = Strings.Companion;
        final String closeDrawer = Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(androidx.compose.ui.R.string.close_drawer), $composer2, 0);
        $composer2.startReplaceGroup(-1784743395);
        ComposerKt.sourceInformation($composer2, "1145@47068L35,1146@47156L187");
        if (open == false) goto L64;
        Modifier.Companion r14 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart($composer2, -1784741978, "CC(remember):NavigationDrawer.kt#9igjgp");
        if (($dirty & 112) != 32) goto L44;
        boolean invalid$iv = true;
    L45:
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L48;
    L51:
        NavigationDrawerKt$Scrim$dismissDrawer$1$1 value$iv = new NavigationDrawerKt$Scrim$dismissDrawer$1$1(r22, null);
        $composer2.updateRememberedValue(value$iv);
    L52:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r15 = SuspendingPointerInputFilterKt.pointerInput(r14, r22, (Function2) value$iv);
        ComposerKt.sourceInformationMarkerStart($composer2, -1784739010, "CC(remember):NavigationDrawer.kt#9igjgp");
        boolean r16 = $composer2.changed(closeDrawer);
        if (($dirty & 112) != 32) goto L55;
        boolean r17 = true;
    L56:
        boolean invalid$iv2 = r16 | r17;
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv2 == false) goto L59;
    L62:
        Object value$iv2 = (Function1) new NavigationDrawerKt$Scrim$dismissDrawer$2$1(closeDrawer, r22);
        $composer2.updateRememberedValue(value$iv2);
    L63:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier.Companion dismissDrawer = SemanticsModifierKt.semantics(r15, true, (Function1) value$iv2);
    L65:
        $composer2.endReplaceGroup();
        Modifier r18 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null).then(dismissDrawer);
        ComposerKt.sourceInformationMarkerStart($composer2, -1784729814, "CC(remember):NavigationDrawer.kt#9igjgp");
        if (($dirty & 7168) != 2048) goto L68;
        boolean r19 = true;
    L70:
        if (($dirty & 896) != 256) goto L72;
        boolean r110 = true;
    L73:
        boolean invalid$iv3 = r19 | r110;
        Object it$iv3 = $composer2.rememberedValue();
        if (invalid$iv3 == false) goto L76;
    L79:
        Object value$iv3 = (Function1) new NavigationDrawerKt$Scrim$1$1(color, r23);
        $composer2.updateRememberedValue(value$iv3);
    L80:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        CanvasKt.Canvas(r18, (Function1) value$iv3, $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L83;
        ComposerKt.traceEventEnd();
        goto L83
    L76:
        if (it$iv3 == Composer.Companion.getEmpty()) goto L79;
        value$iv3 = it$iv3;
        goto L80
    L72:
        r110 = false;
        goto L73
    L68:
        r19 = false;
        goto L70
    L59:
        if (it$iv2 == Composer.Companion.getEmpty()) goto L62;
        value$iv2 = it$iv2;
        goto L63
    L55:
        r17 = false;
        goto L56
    L48:
        if (it$iv == Composer.Companion.getEmpty()) goto L51;
        value$iv = it$iv;
        goto L52
    L44:
        invalid$iv = false;
        goto L45
    L64:
        dismissDrawer = Modifier.Companion;
        goto L65
    }

    static {
        DrawerPositionalThreshold = 0.5f;
        DrawerVelocityThreshold = Dp.m6973constructorimpl(400);
        MinimumDrawerWidth = Dp.m6973constructorimpl(240);
        AnimationSpec = new TweenSpec(256, 0, null, 6, null);
    }
}
