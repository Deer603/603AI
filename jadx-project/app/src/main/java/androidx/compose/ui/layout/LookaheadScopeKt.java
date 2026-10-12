package androidx.compose.ui.layout;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: LookaheadScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a0\u0010\t\u001a\u00020\n2!\u0010\u000b\u001a\u001d\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000f¢\u0006\u0002\b\bH\u0007¢\u0006\u0002\u0010\u0010\u001a \u0001\u0010\u0011\u001a\u00020\u0012*\u00020\u00122!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00070\f2.\b\u0002\u0010\u0016\u001a(\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0001¢\u0006\u0002\b\b2A\u0010\u0017\u001a=\u0012\u0004\u0012\u00020\u0019\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001e0\u0018¢\u0006\u0002\b\b\u001a6\u0010\u001f\u001a\u00020 *\u00020\r2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b%\u0010&\"4\u0010\u0000\u001a(\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0001¢\u0006\u0002\b\bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"defaultPlacementApproachInProgress", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "lookaheadCoordinates", "", "Lkotlin/ExtensionFunctionType;", "LookaheadScope", "", "content", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LookaheadScope;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "approachLayout", "Landroidx/compose/ui/Modifier;", "isMeasurementApproachInProgress", "Landroidx/compose/ui/unit/IntSize;", "lookaheadSize", "isPlacementApproachInProgress", "approachMeasure", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/ApproachMeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "localLookaheadPositionOf", "Landroidx/compose/ui/geometry/Offset;", "coordinates", "sourceCoordinates", "relativeToSource", "includeMotionFrameOfReference", "localLookaheadPositionOf-Fgt4K4Q", "(Landroidx/compose/ui/layout/LookaheadScope;Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LookaheadScopeKt {
    private static final Function2<Placeable.PlacementScope, LayoutCoordinates, Boolean> defaultPlacementApproachInProgress = null;

    public static final /* synthetic */ Function2 access$getDefaultPlacementApproachInProgress$p() {
        return defaultPlacementApproachInProgress;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LookaheadScope(final Function3<? super LookaheadScope, ? super Composer, ? super Integer, Unit> r10, Composer r11, final int r12) {
        Composer r13 = r11.startRestartGroup(-1078066484);
        ComposerKt.sourceInformation(r13, "C(LookaheadScope)49@2063L33,50@2101L428:LookaheadScope.kt#80mrfh");
        int r1 = r12;
        if ((r12 & 6) == 0) goto L5;
    L9:
        int r4 = 1;
        if ((r1 & 3) == 2) goto L12;
        boolean r2 = true;
    L14:
        if (r13.shouldExecute(r2, r1 & 1) == true) goto L16;
        r13.skipToGroupEnd();
    L33:
        ScopeUpdateScope r0 = r13.endRestartGroup();
        if (r0 == null) goto L37;
        r0.updateScope(new AnonymousClass4(r10, r12));
        return;
    L37:
        return;
    L16:
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventStart(-1078066484, r1, -1, "androidx.compose.ui.layout.LookaheadScope (LookaheadScope.kt:48)");
    L18:
        ComposerKt.sourceInformationMarkerStart(r13, 2062858622, "CC(remember):LookaheadScope.kt#9igjgp");
        Object r5 = r13.rememberedValue();
        if (r5 != Composer.Companion.getEmpty()) goto L22;
        LookaheadScopeImpl r8 = new LookaheadScopeImpl(null, r4, 0 == true ? 1 : 0);
        r13.updateRememberedValue(r8);
        r5 = r8;
    L22:
        LookaheadScopeImpl r3 = (LookaheadScopeImpl) r5;
        ComposerKt.sourceInformationMarkerEnd(r13);
        AnonymousClass1 r6 = AnonymousClass1.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(r13, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if ((r13.getApplier() instanceof Applier) == true) goto L25;
        ComposablesKt.invalidApplier();
    L25:
        r13.startReusableNode();
        if (r13.getInserting() == false) goto L28;
        r13.createNode(r6);
    L29:
        Composer r7 = Updater.m3808constructorimpl(r13);
        Updater.m3812initimpl(r7, LookaheadScopeKt$LookaheadScope$2$1.INSTANCE);
        Updater.m3815setimpl(r7, r3, LookaheadScopeKt$LookaheadScope$2$2.INSTANCE);
        int r9 = (6 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart(r13, 1404963352, "C59@2512L9:LookaheadScope.kt#80mrfh");
        r10.invoke(r3, r13, Integer.valueOf((r1 << 3) & 112));
        ComposerKt.sourceInformationMarkerEnd(r13);
        r13.endNode();
        ComposerKt.sourceInformationMarkerEnd(r13);
        if (ComposerKt.isTraceInProgress() == false) goto L33;
        ComposerKt.traceEventEnd();
        goto L33
    L28:
        r13.useNode();
        goto L29
    L12:
        r2 = false;
        goto L14
    L5:
        if (r13.changedInstance(r10) == false) goto L7;
        int r14 = 4;
    L8:
        r1 = r1 | r14;
        goto L9
    L7:
        r14 = 2;
        goto L8
    }

    public static /* synthetic */ Modifier approachLayout$default(Modifier r0, Function1 r1, Function2 r2, Function3 r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = defaultPlacementApproachInProgress;
    L6:
        return approachLayout(r0, r1, r2, r3);
    }

    public static final Modifier approachLayout(Modifier $this$approachLayout, Function1<? super IntSize, Boolean> r2, Function2<? super Placeable.PlacementScope, ? super LayoutCoordinates, Boolean> r3, Function3<? super ApproachMeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> r4) {
        return $this$approachLayout.then(new ApproachLayoutElement(r4, r2, r3));
    }

    static {
        defaultPlacementApproachInProgress = LookaheadScopeKt$defaultPlacementApproachInProgress$1.INSTANCE;
    }

    /* JADX INFO: renamed from: localLookaheadPositionOf-Fgt4K4Q, reason: not valid java name */
    public static final long m5743localLookaheadPositionOfFgt4K4Q(LookaheadScope $this$localLookaheadPositionOf_u2dFgt4K4Q, LayoutCoordinates coordinates, LayoutCoordinates sourceCoordinates, long relativeToSource, boolean includeMotionFrameOfReference) {
        LayoutCoordinates lookaheadCoords = $this$localLookaheadPositionOf_u2dFgt4K4Q.toLookaheadCoordinates(coordinates);
        LayoutCoordinates source = $this$localLookaheadPositionOf_u2dFgt4K4Q.toLookaheadCoordinates(sourceCoordinates);
        if ((lookaheadCoords instanceof LookaheadLayoutCoordinates) == false) goto L6;
        return lookaheadCoords.mo5724localPositionOfS_NoaFU(source, relativeToSource, includeMotionFrameOfReference);
    L6:
        if ((source instanceof LookaheadLayoutCoordinates) == false) goto L9;
        long arg0$iv = source.mo5724localPositionOfS_NoaFU(lookaheadCoords, relativeToSource, includeMotionFrameOfReference);
        return Offset.m4117constructorimpl((-9223372034707292160L) ^ arg0$iv);
    L9:
        return lookaheadCoords.mo5724localPositionOfS_NoaFU(lookaheadCoords, relativeToSource, includeMotionFrameOfReference);
    }
}
