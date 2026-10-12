package androidx.compose.foundation.layout;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: FlowLayoutOverflow.kt */
/* JADX INFO: loaded from: classes.dex */
@Deprecated(message = "ContextualFlowLayouts are no longer maintained")
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0087\u0001\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u00120\b\u0002\u0010\u0007\u001a*\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f\u0018\u00010\b\u00120\b\u0002\u0010\u0010\u001a*\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f\u0018\u00010\b¢\u0006\u0002\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/layout/ContextualFlowRowOverflow;", "Landroidx/compose/foundation/layout/FlowLayoutOverflow;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "minLinesToShowCollapse", "", "minCrossAxisSizeToShowCollapse", "seeMoreGetter", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "state", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "collapseGetter", "(Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;IILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Companion", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ContextualFlowRowOverflow extends FlowLayoutOverflow {
    public static final int $stable = 0;
    private static final ContextualFlowRowOverflow Clip = null;
    public static final Companion Companion = null;
    private static final ContextualFlowRowOverflow Visible = null;

    /* JADX INFO: compiled from: FlowLayoutOverflow.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J+\u0010\u000b\u001a\u00020\u00042\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\u0012Jb\u0010\u0013\u001a\u00020\u00042\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0003\u001a\u00020\u00048GX\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048GX\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/layout/ContextualFlowRowOverflow$Companion;", "", "()V", "Clip", "Landroidx/compose/foundation/layout/ContextualFlowRowOverflow;", "getClip$annotations", "getClip", "()Landroidx/compose/foundation/layout/ContextualFlowRowOverflow;", "Visible", "getVisible$annotations", "getVisible", "expandIndicator", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ContextualFlowRowOverflowScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/layout/ContextualFlowRowOverflow;", "expandOrCollapseIndicator", "collapseIndicator", "minRowsToShowCollapse", "", "minHeightToShowCollapse", "Landroidx/compose/ui/unit/Dp;", "expandOrCollapseIndicator--jt2gSs", "(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;IFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/layout/ContextualFlowRowOverflow;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Deprecated(message = "FlowLayout overflow is no longer maintained")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        public static /* synthetic */ void getClip$annotations() {
        }

        public static /* synthetic */ void getVisible$annotations() {
        }

        private Companion() {
        }

        public final ContextualFlowRowOverflow getVisible() {
            return ContextualFlowRowOverflow.access$getVisible$cp();
        }

        public final ContextualFlowRowOverflow getClip() {
            return ContextualFlowRowOverflow.access$getClip$cp();
        }

        public final ContextualFlowRowOverflow expandIndicator(final Function3<? super ContextualFlowRowOverflowScope, ? super Composer, ? super Integer, Unit> r10) {
            Function1<FlowLayoutOverflowState, Function2<? super Composer, ? super Integer, ? extends Unit>> r5 = new ContextualFlowRowOverflow$Companion$expandIndicator$seeMoreGetter$1(r10);
            int r3 = 0;
            int r4 = 0;
            Function1 r6 = null;
            return new ContextualFlowRowOverflow(FlowLayoutOverflow.OverflowType.ExpandIndicator, r3, r4, r5, r6, 22, null);
        }

        /* JADX INFO: renamed from: expandOrCollapseIndicator--jt2gSs, reason: not valid java name */
        public final ContextualFlowRowOverflow m642expandOrCollapseIndicatorjt2gSs(final Function3<? super ContextualFlowRowOverflowScope, ? super Composer, ? super Integer, Unit> r19, final Function3<? super ContextualFlowRowOverflowScope, ? super Composer, ? super Integer, Unit> r20, int minRowsToShowCollapse, float minHeightToShowCollapse, Composer $composer, int $changed, int r25) {
            ComposerKt.sourceInformationMarkerStart($composer, 1435293820, "C(expandOrCollapseIndicator)P(1!1,3,2:c#ui.unit.Dp)*422@20138L7,423@20206L1109:FlowLayoutOverflow.kt#2w3rfo");
            if ((r25 & 4) == 0) goto L5;
            int minRowsToShowCollapse2 = 1;
        L7:
            if ((r25 & 8) == 0) goto L9;
            float minHeightToShowCollapse2 = Dp.m6973constructorimpl(0);
        L11:
            if (ComposerKt.isTraceInProgress() == false) goto L13;
            ComposerKt.traceEventStart(1435293820, $changed, -1, "androidx.compose.foundation.layout.ContextualFlowRowOverflow.Companion.expandOrCollapseIndicator (FlowLayoutOverflow.kt:420)");
        L13:
            ProvidableCompositionLocal<Density> r4 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object r9 = $composer.consume(r4);
            ComposerKt.sourceInformationMarkerEnd($composer);
            Density $this$expandOrCollapseIndicator__jt2gSs_u24lambda_u240 = (Density) r9;
            int minHeightToShowCollapsePx = $this$expandOrCollapseIndicator__jt2gSs_u24lambda_u240.mo370roundToPx0680j_4(minHeightToShowCollapse2);
            ComposerKt.sourceInformationMarkerStart($composer, 172957149, "CC(remember):FlowLayoutOverflow.kt#9igjgp");
            boolean r7 = false;
            if ((($changed & 896) ^ 384) <= 256) goto L18;
            if ($composer.changed(minRowsToShowCollapse2) == false) goto L18;
        L19:
            boolean r5 = true;
        L21:
            boolean r6 = r5 | $composer.changed(minHeightToShowCollapsePx);
            if ((($changed & 14) ^ 6) <= 4) goto L26;
            if ($composer.changed(r19) == false) goto L26;
        L27:
            boolean r8 = true;
        L29:
            boolean r10 = r6 | r8;
            if ((($changed & 112) ^ 48) <= 32) goto L34;
            if ($composer.changed(r20) == false) goto L34;
        L35:
            r7 = true;
        L36:
            boolean invalid$iv = r10 | r7;
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv == false) goto L39;
        L42:
            Object value$iv = new ContextualFlowRowOverflow(FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator, minRowsToShowCollapse2, minHeightToShowCollapsePx, new ContextualFlowRowOverflow$Companion$expandOrCollapseIndicator$1$seeMoreGetter$1(r19), new ContextualFlowRowOverflow$Companion$expandOrCollapseIndicator$1$collapseGetter$1(r20), null);
            $composer.updateRememberedValue(value$iv);
            it$iv = value$iv;
        L43:
            ContextualFlowRowOverflow r15 = (ContextualFlowRowOverflow) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress() == false) goto L46;
            ComposerKt.traceEventEnd();
        L46:
            ComposerKt.sourceInformationMarkerEnd($composer);
            return r15;
        L39:
            if (it$iv != Composer.Companion.getEmpty()) goto L43;
        L34:
            if (($changed & 48) != 32) goto L36;
        L26:
            if (($changed & 6) == 4) goto L27;
            r8 = false;
        L18:
            if (($changed & 384) == 256) goto L19;
            r5 = false;
            goto L21
        L9:
            minHeightToShowCollapse2 = minHeightToShowCollapse;
            goto L11
        L5:
            minRowsToShowCollapse2 = minRowsToShowCollapse;
            goto L7
        }
    }

    public /* synthetic */ ContextualFlowRowOverflow(FlowLayoutOverflow.OverflowType r1, int r2, int r3, Function1 r4, Function1 r5, DefaultConstructorMarker r6) {
        this(r1, r2, r3, r4, r5);
    }

    public static final /* synthetic */ ContextualFlowRowOverflow access$getClip$cp() {
        return Clip;
    }

    public static final /* synthetic */ ContextualFlowRowOverflow access$getVisible$cp() {
        return Visible;
    }

    /* synthetic */ ContextualFlowRowOverflow(FlowLayoutOverflow.OverflowType r2, int r3, int r4, Function1 r5, Function1 r6, int r7, DefaultConstructorMarker r8) {
        if ((r7 & 2) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r7 & 4) == 0) goto L9;
        r4 = 0;
    L9:
        if ((r7 & 8) == 0) goto L12;
        r5 = null;
    L12:
        if ((r7 & 16) == 0) goto L14;
        Function1 r9 = null;
    L15:
        Function1 r10 = r5;
        this(r2, r3, r4, r10, r9);
        return;
    L14:
        r9 = r6;
        goto L15
    }

    private ContextualFlowRowOverflow(FlowLayoutOverflow.OverflowType type, int minLinesToShowCollapse, int minCrossAxisSizeToShowCollapse, Function1<? super FlowLayoutOverflowState, ? extends Function2<? super Composer, ? super Integer, Unit>> r11, Function1<? super FlowLayoutOverflowState, ? extends Function2<? super Composer, ? super Integer, Unit>> r12) {
        super(type, minLinesToShowCollapse, minCrossAxisSizeToShowCollapse, r11, r12, null);
    }

    static {
        Companion = new Companion(null);
        int r4 = 0;
        int r5 = 0;
        Function1 r6 = null;
        Function1 r7 = null;
        Visible = new ContextualFlowRowOverflow(FlowLayoutOverflow.OverflowType.Visible, r4, r5, r6, r7, 30, null);
        int r8 = 0;
        Function1 r9 = null;
        Clip = new ContextualFlowRowOverflow(FlowLayoutOverflow.OverflowType.Clip, r5, r8, r7, r9, 30, null);
    }
}
