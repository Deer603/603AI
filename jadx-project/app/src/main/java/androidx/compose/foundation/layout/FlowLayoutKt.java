package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: FlowLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ä\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001ag\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00070\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0002\u0010\u0018\u001aq\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00070\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0002\u0010\u001b\u001ag\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00070\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0002\u0010!\u001aq\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\"2\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00070\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0002\u0010#\u001a%\u0010$\u001a\u00020%2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u0011H\u0001¢\u0006\u0002\u0010'\u001a=\u0010(\u001a\u00020)2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010*\u001a\u00020+H\u0001¢\u0006\u0002\u0010,\u001a\u0096\u0001\u0010-\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u000201002#\u00102\u001a\u001f\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001103¢\u0006\u0002\b\u00172#\u00104\u001a\u001f\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001103¢\u0006\u0002\b\u00172\u0006\u00105\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020+H\u0082\b¢\u0006\u0002\u00108\u001a[\u0010-\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:2\u0006\u00105\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020+H\u0002¢\u0006\u0002\u0010<\u001aT\u0010=\u001a\u00020\u00112\f\u0010/\u001a\b\u0012\u0004\u0012\u000201002#\u00102\u001a\u001f\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001103¢\u0006\u0002\b\u00172\u0006\u0010>\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u0011H\u0082\b\u001a\u0091\u0001\u0010?\u001a\u00020\u00112\f\u0010/\u001a\b\u0012\u0004\u0012\u000201002#\u00102\u001a\u001f\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001103¢\u0006\u0002\b\u00172#\u00104\u001a\u001f\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001103¢\u0006\u0002\b\u00172\u0006\u0010>\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020+H\u0082\b\u001a%\u0010@\u001a\u00020%2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u0011H\u0001¢\u0006\u0002\u0010A\u001a=\u0010B\u001a\u00020)2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010*\u001a\u00020+H\u0001¢\u0006\u0002\u0010C\u001a\\\u0010D\u001a\u00020E*\u00020F2\u0006\u0010G\u001a\u00020H2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020K0J2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020P2\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020+H\u0000ø\u0001\u0000¢\u0006\u0004\bQ\u0010R\u001a\u001c\u0010S\u001a\u00020\u0011*\u0002012\u0006\u0010T\u001a\u00020U2\u0006\u00102\u001a\u00020\u0011H\u0000\u001a\u001c\u0010V\u001a\u00020\u0011*\u0002012\u0006\u0010T\u001a\u00020U2\u0006\u00104\u001a\u00020\u0011H\u0000\u001a<\u0010W\u001a\u00020.*\u00020K2\u0006\u0010G\u001a\u00020H2\u0006\u0010O\u001a\u00020X2\u0014\u0010Y\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010Z\u0012\u0004\u0012\u00020\u00070\u0014H\u0000ø\u0001\u0000¢\u0006\u0004\b[\u0010\\\u001aT\u0010]\u001a\u00020E*\u00020F2\u0006\u0010O\u001a\u00020P2\u0006\u0010^\u001a\u00020\u00112\u0006\u0010_\u001a\u00020\u00112\u0006\u0010;\u001a\u00020:2\f\u0010`\u001a\b\u0012\u0004\u0012\u00020E0a2\u0006\u0010b\u001a\u00020H2\u0006\u0010c\u001a\u00020:H\u0000ø\u0001\u0000¢\u0006\u0004\bd\u0010e\u001a\u001e\u0010f\u001a\u0004\u0018\u00010K*\b\u0012\u0004\u0012\u00020K0J2\b\u0010g\u001a\u0004\u0018\u00010hH\u0002\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006i"}, d2 = {"CROSS_AXIS_ALIGNMENT_START", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCROSS_AXIS_ALIGNMENT_START", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "CROSS_AXIS_ALIGNMENT_TOP", "getCROSS_AXIS_ALIGNMENT_TOP", "FlowColumn", "", "modifier", "Landroidx/compose/ui/Modifier;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "itemHorizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "maxItemsInEachColumn", "", "maxLines", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/FlowColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "overflow", "Landroidx/compose/foundation/layout/FlowColumnOverflow;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/FlowColumnOverflow;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "FlowRow", "itemVerticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "maxItemsInEachRow", "Landroidx/compose/foundation/layout/FlowRowScope;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/FlowRowOverflow;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/FlowRowOverflow;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "columnMeasurementHelper", "Landroidx/compose/ui/layout/MeasurePolicy;", "maxItemsInMainAxis", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "columnMeasurementMultiContentHelper", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "overflowState", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "intrinsicCrossAxisSize", "Landroidx/collection/IntIntPair;", "children", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "mainAxisSize", "Lkotlin/Function3;", "crossAxisSize", "mainAxisAvailable", "mainAxisSpacing", "crossAxisSpacing", "(Ljava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;IIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)J", "mainAxisSizes", "", "crossAxisSizes", "(Ljava/util/List;[I[IIIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)J", "maxIntrinsicMainAxisSize", "crossAxisAvailable", "minIntrinsicMainAxisSize", "rowMeasurementHelper", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "rowMeasurementMultiContentHelper", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "breakDownItems", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurePolicy", "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "measurablesIterator", "", "Landroidx/compose/ui/layout/Measurable;", "mainAxisSpacingDp", "Landroidx/compose/ui/unit/Dp;", "crossAxisSpacingDp", "constraints", "Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "breakDownItems-di9J0FM", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;Ljava/util/Iterator;FFJIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)Landroidx/compose/ui/layout/MeasureResult;", "crossAxisMin", "isHorizontal", "", "mainAxisMin", "measureAndCache", "Landroidx/compose/ui/unit/Constraints;", "storePlaceable", "Landroidx/compose/ui/layout/Placeable;", "measureAndCache-rqJ1uqs", "(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;JLkotlin/jvm/functions/Function1;)J", "placeHelper", "mainAxisTotalSize", "crossAxisTotalSize", "items", "Landroidx/compose/runtime/collection/MutableVector;", "measureHelper", "outPosition", "placeHelper-BmaY500", "(Landroidx/compose/ui/layout/MeasureScope;JII[ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;[I)Landroidx/compose/ui/layout/MeasureResult;", "safeNext", "info", "Landroidx/compose/foundation/layout/FlowLineInfo;", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FlowLayoutKt {
    private static final CrossAxisAlignment CROSS_AXIS_ALIGNMENT_START = null;
    private static final CrossAxisAlignment CROSS_AXIS_ALIGNMENT_TOP = null;

    public static final /* synthetic */ long access$intrinsicCrossAxisSize(List children, int[] mainAxisSizes, int[] crossAxisSizes, int mainAxisAvailable, int mainAxisSpacing, int crossAxisSpacing, int maxItemsInMainAxis, int maxLines, FlowLayoutOverflowState overflow) {
        return intrinsicCrossAxisSize(children, mainAxisSizes, crossAxisSizes, mainAxisAvailable, mainAxisSpacing, crossAxisSpacing, maxItemsInMainAxis, maxLines, overflow);
    }

    @Deprecated(message = "The overflow parameter has been deprecated")
    public static final void FlowRow(Modifier r29, Arrangement.Horizontal r30, Arrangement.Vertical r31, Alignment.Vertical r32, int r33, int r34, FlowRowOverflow r35, final Function3<? super FlowRowScope, ? super Composer, ? super Integer, Unit> r36, Composer r37, final int r38, final int r39) {
        Composer r1 = r37.startRestartGroup(-218661582);
        ComposerKt.sourceInformation(r1, "C(FlowRow)P(5,1,7,2,3,4,6)99@4467L53,101@4553L225,110@4832L291,117@5129L75:FlowLayout.kt#2w3rfo");
        int r2 = r38;
        int r3 = r39 & 1;
        if (r3 == 0) goto L6;
        r2 = r2 | 6;
    L13:
        int r5 = r39 & 2;
        if (r5 == 0) goto L17;
        r2 = r2 | 48;
        Arrangement.Horizontal r6 = r30;
    L24:
        int r7 = r39 & 4;
        if (r7 == 0) goto L28;
        r2 = r2 | 384;
        Arrangement.Vertical r12 = r31;
    L35:
        int r13 = r39 & 8;
        if (r13 == 0) goto L39;
        r2 = r2 | 3072;
        Alignment.Vertical r14 = r32;
    L46:
        int r15 = r39 & 16;
        if (r15 == 0) goto L50;
        r2 = r2 | 24576;
    L57:
        int r16 = r39 & 32;
        if (r16 == 0) goto L61;
        r2 = r2 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L68:
        int r18 = r39 & 64;
        if (r18 == 0) goto L72;
        r2 = r2 | 1572864;
    L80:
        if ((r39 & 128) == 0) goto L83;
        r2 = r2 | 12582912;
    L89:
        int r0 = r2;
        if ((4793491 & r0) == 4793490) goto L92;
        boolean r4 = true;
    L94:
        if (r1.shouldExecute(r4, r0 & 1) == false) goto L185;
        if (r3 == 0) goto L97;
        Modifier.Companion r8 = Modifier.Companion;
    L98:
        if (r5 == 0) goto L100;
        Arrangement.Horizontal r11 = Arrangement.INSTANCE.getStart();
    L101:
        if (r7 == 0) goto L103;
        r12 = Arrangement.INSTANCE.getTop();
    L103:
        if (r13 == 0) goto L105;
        Alignment.Vertical r17 = Alignment.Companion.getTop();
    L106:
        if (r15 == 0) goto L108;
        int r19 = Integer.MAX_VALUE;
    L109:
        if (r16 == 0) goto L111;
        int r110 = Integer.MAX_VALUE;
    L112:
        if (r18 == 0) goto L114;
        FlowRowOverflow r9 = FlowRowOverflow.Companion.getClip();
    L116:
        if (ComposerKt.isTraceInProgress() == false) goto L118;
        ComposerKt.traceEventStart(-218661582, r0, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:98)");
    L118:
        ComposerKt.sourceInformationMarkerStart(r1, 454967671, "CC(remember):FlowLayout.kt#9igjgp");
        if ((3670016 & r0) != 1048576) goto L121;
        boolean r10 = true;
    L122:
        Object r20 = r1.rememberedValue();
        if (r10 == true) goto L128;
        int r23 = r0;
        if (r20 != Composer.Companion.getEmpty()) goto L130;
    L129:
        FlowLayoutOverflowState r21 = r9.createOverflowState$foundation_layout_release();
        r1.updateRememberedValue(r21);
        r20 = r21;
    L130:
        FlowLayoutOverflowState r111 = (FlowLayoutOverflowState) r20;
        ComposerKt.sourceInformationMarkerEnd(r1);
        MultiContentMeasurePolicy r22 = rowMeasurementMultiContentHelper(r11, r12, r17, r19, r110, r111, r1, (((((r23 >> 3) & 14) | ((r23 >> 3) & 112)) | ((r23 >> 3) & 896)) | ((r23 >> 3) & 7168)) | ((r23 >> 3) & 57344));
        Arrangement.Horizontal r24 = r11;
        Composer r112 = r1;
        ComposerKt.sourceInformationMarkerStart(r112, 454979589, "CC(remember):FlowLayout.kt#9igjgp");
        if ((r23 & 3670016) != 1048576) goto L133;
        boolean r25 = true;
    L135:
        if ((r23 & 29360128) != 8388608) goto L137;
        boolean r26 = true;
    L138:
        boolean r27 = r26 | r25;
        if ((r23 & 458752) != 131072) goto L141;
        boolean r28 = true;
    L142:
        boolean r40 = r27 | r28;
        Object r41 = r112.rememberedValue();
        if (r40 == true) goto L148;
        Modifier r113 = r8;
        if (r41 == Composer.Companion.getEmpty()) goto L149;
        Object r42 = r41;
    L150:
        ComposerKt.sourceInformationMarkerEnd(r112);
        int r43 = (r23 << 3) & 112;
        Modifier r44 = r113;
        ComposerKt.sourceInformationMarkerStart(r112, 1399185516, "CC(Layout)P(!1,2)168@6883L62,165@6769L182:Layout.kt#80mrfh");
        Function2<Composer, Integer, Unit> r45 = LayoutKt.combineAsVirtualLayouts((List) r42);
        ComposerKt.sourceInformationMarkerStart(r112, -290764973, "CC(remember):Layout.kt#9igjgp");
        if (((r43 & 896) ^ 384) <= 256) goto L155;
        if (r112.changed(r22) == false) goto L155;
    L156:
        boolean r210 = true;
    L158:
        Object r46 = r112.rememberedValue();
        if (r210 == true) goto L164;
        int r310 = r43;
        if (r46 != Composer.Companion.getEmpty()) goto L166;
    L165:
        MeasurePolicy r47 = MultiContentMeasurePolicyKt.createMeasurePolicy(r22);
        r112.updateRememberedValue(r47);
        r46 = r47;
    L166:
        MeasurePolicy r48 = (MeasurePolicy) r46;
        ComposerKt.sourceInformationMarkerEnd(r112);
        FlowRowOverflow r311 = r9;
        ComposerKt.sourceInformationMarkerStart(r112, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r49 = ComposablesKt.getCurrentCompositeKeyHash(r112, 0);
        CompositionLocalMap r50 = r112.getCurrentCompositionLocalMap();
        Modifier r51 = ComposedModifierKt.materializeModifier(r112, r44);
        Function0<ComposeUiNode> r114 = ComposeUiNode.Companion.getConstructor();
        int r52 = (((r310 & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart(r112, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if ((r112.getApplier() instanceof Applier) == true) goto L169;
        ComposablesKt.invalidApplier();
    L169:
        r112.startReusableNode();
        if (r112.getInserting() == false) goto L172;
        Function0<ComposeUiNode> r53 = r114;
        r112.createNode(r53);
    L173:
        Composer r54 = Updater.m3808constructorimpl(r112);
        Updater.m3815setimpl(r54, r48, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r54, r50, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r55 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r54.getInserting() == true) goto L180;
        if (Intrinsics.areEqual(r54.rememberedValue(), Integer.valueOf(r49)) == false) goto L180;
    L181:
        Updater.m3815setimpl(r54, r51, ComposeUiNode.Companion.getSetModifier());
        r45.invoke(r112, Integer.valueOf((r52 >> 6) & 14));
        r112.endNode();
        ComposerKt.sourceInformationMarkerEnd(r112);
        ComposerKt.sourceInformationMarkerEnd(r112);
        ComposerKt.sourceInformationMarkerEnd(r112);
        if (ComposerKt.isTraceInProgress() == false) goto L184;
        ComposerKt.traceEventEnd();
    L184:
        final Arrangement.Horizontal r56 = r24;
        final FlowRowOverflow r57 = r311;
        final Alignment.Vertical r58 = r17;
        final int r59 = r19;
        final int r60 = r110;
        final Modifier r61 = r113;
        final Arrangement.Vertical r62 = r12;
        Composer r115 = r112;
    L186:
        ScopeUpdateScope r116 = r115.endRestartGroup();
        if (r116 == null) goto L190;
        r116.updateScope(new C02831(r61, r56, r62, r58, r59, r60, r57, r36, r38, r39));
        return;
    L190:
        return;
    L180:
        r54.updateRememberedValue(Integer.valueOf(r49));
        r54.apply(Integer.valueOf(r49), r55);
        goto L181
    L172:
        r53 = r114;
        r112.useNode();
        goto L173
    L164:
        r310 = r43;
    L155:
        if ((r43 & 384) == 256) goto L156;
        r210 = false;
    L149:
        ArrayList r63 = new ArrayList();
        r63.add(ComposableLambdaKt.composableLambdaInstance(702094978, true, new FlowLayoutKt$FlowRow$list$1$1(r36)));
        r9.addOverflowComposables$foundation_layout_release(r111, r63);
        r112.updateRememberedValue(r63);
        r42 = r63;
        goto L150
    L148:
        r113 = r8;
        goto L149
    L141:
        r28 = false;
        goto L142
    L137:
        r26 = false;
        goto L138
    L133:
        r25 = false;
        goto L135
    L128:
        r23 = r0;
        goto L129
    L121:
        r10 = false;
        goto L122
    L114:
        r9 = r35;
        goto L116
    L111:
        r110 = r34;
        goto L112
    L108:
        r19 = r33;
        goto L109
    L105:
        r17 = r14;
        goto L106
    L100:
        r11 = r6;
        goto L101
    L97:
        r8 = r29;
        goto L98
    L185:
        Composer r117 = r1;
        r117.skipToGroupEnd();
        r61 = r29;
        r59 = r33;
        r57 = r35;
        r56 = r6;
        r58 = r14;
        r60 = r34;
        r62 = r12;
        r115 = r117;
        goto L186
    L92:
        r4 = false;
        goto L94
    L83:
        if ((r38 & 12582912) != 0) goto L89;
        if (r1.changedInstance(r36) == false) goto L87;
        int r64 = 8388608;
    L88:
        r2 = r2 | r64;
        goto L89
    L87:
        r64 = 4194304;
        goto L88
    L72:
        if ((r38 & 1572864) != 0) goto L80;
        if (r1.changed(r35) == false) goto L76;
        int r211 = 1048576;
    L77:
        r2 = r2 | r211;
        goto L80
    L76:
        r211 = 524288;
        goto L77
    L61:
        if ((r38 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L68;
        if (r1.changed(r34) == false) goto L65;
        int r118 = 131072;
    L66:
        r2 = r2 | r118;
        goto L68
    L65:
        r118 = 65536;
        goto L66
    L50:
        if ((r38 & 24576) != 0) goto L57;
        if (r1.changed(r33) == false) goto L54;
        int r119 = 16384;
    L55:
        r2 = r2 | r119;
        goto L57
    L54:
        r119 = 8192;
        goto L55
    L39:
        if ((r38 & 3072) != 0) goto L45;
        r14 = r32;
        if (r1.changed(r14) == false) goto L43;
        int r120 = 2048;
    L44:
        r2 = r2 | r120;
        goto L46
    L43:
        r120 = 1024;
        goto L44
    L45:
        r14 = r32;
        goto L46
    L28:
        if ((r38 & 384) != 0) goto L34;
        r12 = r31;
        if (r1.changed(r12) == false) goto L32;
        int r121 = 256;
    L33:
        r2 = r2 | r121;
        goto L35
    L32:
        r121 = 128;
        goto L33
    L34:
        r12 = r31;
        goto L35
    L17:
        if ((r38 & 48) != 0) goto L23;
        r6 = r30;
        if (r1.changed(r6) == false) goto L21;
        int r65 = 32;
    L22:
        r2 = r2 | r65;
        goto L24
    L21:
        r65 = 16;
        goto L22
    L23:
        r6 = r30;
        goto L24
    L6:
        if ((r38 & 6) != 0) goto L13;
        if (r1.changed(r29) == false) goto L10;
        int r66 = 4;
    L11:
        r2 = r2 | r66;
        goto L13
    L10:
        r66 = 2;
        goto L11
    }

    public static final void FlowRow(Modifier modifier, Arrangement.Horizontal horizontalArrangement, Arrangement.Vertical verticalArrangement, Alignment.Vertical itemVerticalAlignment, int maxItemsInEachRow, int maxLines, final Function3<? super FlowRowScope, ? super Composer, ? super Integer, Unit> r27, Composer $composer, final int $changed, final int r30) {
        Composer $composer2 = $composer.startRestartGroup(-2070229740);
        ComposerKt.sourceInformation($composer2, "C(FlowRow)P(5,1,6,2,3,4)161@7269L215:FlowLayout.kt#2w3rfo");
        int $dirty = $changed;
        int r3 = r30 & 1;
        if (r3 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r4 = modifier;
    L13:
        int r5 = r30 & 2;
        if (r5 == 0) goto L17;
        $dirty = $dirty | 48;
        Arrangement.Horizontal r6 = horizontalArrangement;
    L24:
        int r7 = r30 & 4;
        if (r7 == 0) goto L28;
        $dirty = $dirty | 384;
    L35:
        int r10 = r30 & 8;
        if (r10 == 0) goto L39;
        $dirty = $dirty | 3072;
    L46:
        int r12 = r30 & 16;
        if (r12 == 0) goto L50;
        $dirty = $dirty | 24576;
        int maxItemsInEachRow2 = maxItemsInEachRow;
    L57:
        int r14 = r30 & 32;
        if (r14 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        int r15 = maxLines;
    L69:
        if ((r30 & 64) == 0) goto L72;
        $dirty = $dirty | 1572864;
    L80:
        if (($dirty & 599187) == 599186) goto L82;
        boolean r0 = true;
    L84:
        if ($composer2.shouldExecute(r0, $dirty & 1) == false) goto L109;
        if (r3 == 0) goto L87;
        Modifier modifier2 = Modifier.Companion;
    L88:
        if (r5 == 0) goto L90;
        Arrangement.Horizontal horizontalArrangement2 = Arrangement.INSTANCE.getStart();
        int r1 = r10;
    L91:
        if (r7 == 0) goto L93;
        Arrangement.Vertical verticalArrangement2 = Arrangement.INSTANCE.getTop();
    L94:
        if (r1 == 0) goto L96;
        Alignment.Vertical itemVerticalAlignment2 = Alignment.Companion.getTop();
        int r2 = r12;
    L97:
        if (r2 == 0) goto L99;
        maxItemsInEachRow2 = Integer.MAX_VALUE;
    L99:
        if (r14 == 0) goto L101;
        int maxLines2 = Integer.MAX_VALUE;
    L103:
        if (ComposerKt.isTraceInProgress() == false) goto L105;
        ComposerKt.traceEventStart(-2070229740, $dirty, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:161)");
    L105:
        Composer $composer3 = $composer2;
        FlowRow(modifier2, horizontalArrangement2, verticalArrangement2, itemVerticalAlignment2, maxItemsInEachRow2, maxLines2, FlowRowOverflow.Companion.getClip(), r27, $composer3, ((((((($dirty & 14) | 1572864) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (57344 & $dirty)) | (458752 & $dirty)) | (($dirty << 3) & 29360128), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L108;
        ComposerKt.traceEventEnd();
    L108:
        final Modifier modifier3 = modifier2;
        final Arrangement.Horizontal horizontalArrangement3 = horizontalArrangement2;
        final Arrangement.Vertical verticalArrangement3 = verticalArrangement2;
        final Alignment.Vertical itemVerticalAlignment3 = itemVerticalAlignment2;
        final int maxLines3 = maxLines2;
        final int maxItemsInEachRow3 = maxItemsInEachRow2;
    L110:
        ScopeUpdateScope r11 = $composer3.endRestartGroup();
        if (r11 == null) goto L114;
        r11.updateScope(new C02842(modifier3, horizontalArrangement3, verticalArrangement3, itemVerticalAlignment3, maxItemsInEachRow3, maxLines3, r27, $changed, r30));
        return;
    L114:
        return;
    L101:
        maxLines2 = r15;
        goto L103
    L96:
        r2 = r12;
        itemVerticalAlignment2 = itemVerticalAlignment;
        goto L97
    L93:
        verticalArrangement2 = verticalArrangement;
        goto L94
    L90:
        r1 = r10;
        horizontalArrangement2 = r6;
        goto L91
    L87:
        modifier2 = r4;
        goto L88
    L109:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        verticalArrangement3 = verticalArrangement;
        modifier3 = r4;
        horizontalArrangement3 = r6;
        maxLines3 = r15;
        itemVerticalAlignment3 = itemVerticalAlignment;
        maxItemsInEachRow3 = maxItemsInEachRow2;
        goto L110
    L82:
        r0 = false;
        goto L84
    L72:
        if (($changed & 1572864) != 0) goto L80;
        if ($composer2.changedInstance(r27) == false) goto L76;
        int r18 = 1048576;
    L77:
        $dirty = $dirty | r18;
        goto L80
    L76:
        r18 = 524288;
        goto L77
    L61:
        if ((196608 & $changed) != 0) goto L67;
        r15 = maxLines;
        if ($composer2.changed(r15) == false) goto L65;
        int r16 = 131072;
    L66:
        $dirty = $dirty | r16;
        goto L69
    L65:
        r16 = 65536;
        goto L66
    L67:
        r15 = maxLines;
        goto L69
    L50:
        if (($changed & 24576) != 0) goto L56;
        maxItemsInEachRow2 = maxItemsInEachRow;
        if ($composer2.changed(maxItemsInEachRow2) == false) goto L54;
        int r17 = 16384;
    L55:
        $dirty = $dirty | r17;
        goto L57
    L54:
        r17 = 8192;
        goto L55
    L56:
        maxItemsInEachRow2 = maxItemsInEachRow;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L46;
        if ($composer2.changed(itemVerticalAlignment) == false) goto L43;
        int r13 = 2048;
    L44:
        $dirty = $dirty | r13;
        goto L46
    L43:
        r13 = 1024;
        goto L44
    L28:
        if (($changed & 384) != 0) goto L35;
        if ($composer2.changed(verticalArrangement) == false) goto L32;
        int r19 = 256;
    L33:
        $dirty = $dirty | r19;
        goto L35
    L32:
        r19 = 128;
        goto L33
    L17:
        if (($changed & 48) != 0) goto L23;
        r6 = horizontalArrangement;
        if ($composer2.changed(r6) == false) goto L21;
        int r8 = 32;
    L22:
        $dirty = $dirty | r8;
        goto L24
    L21:
        r8 = 16;
        goto L22
    L23:
        r6 = horizontalArrangement;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L10;
        int r9 = 4;
    L11:
        $dirty = $dirty | r9;
        goto L13
    L10:
        r9 = 2;
        goto L11
    L12:
        r4 = modifier;
        goto L13
    }

    @Deprecated(message = "The overflow parameter has been deprecated")
    public static final void FlowColumn(Modifier r29, Arrangement.Vertical r30, Arrangement.Horizontal r31, Alignment.Horizontal r32, int r33, int r34, FlowColumnOverflow r35, final Function3<? super FlowColumnScope, ? super Composer, ? super Integer, Unit> r36, Composer r37, final int r38, final int r39) {
        Composer r1 = r37.startRestartGroup(-1385862766);
        ComposerKt.sourceInformation(r1, "C(FlowColumn)P(5,7,1,2,3,4,6)213@9419L53,215@9505L233,224@9792L294,230@10091L75:FlowLayout.kt#2w3rfo");
        int r2 = r38;
        int r3 = r39 & 1;
        if (r3 == 0) goto L6;
        r2 = r2 | 6;
    L13:
        int r5 = r39 & 2;
        if (r5 == 0) goto L17;
        r2 = r2 | 48;
        Arrangement.Vertical r6 = r30;
    L24:
        int r7 = r39 & 4;
        if (r7 == 0) goto L28;
        r2 = r2 | 384;
        Arrangement.Horizontal r12 = r31;
    L35:
        int r13 = r39 & 8;
        if (r13 == 0) goto L39;
        r2 = r2 | 3072;
        Alignment.Horizontal r14 = r32;
    L46:
        int r15 = r39 & 16;
        if (r15 == 0) goto L50;
        r2 = r2 | 24576;
    L57:
        int r16 = r39 & 32;
        if (r16 == 0) goto L61;
        r2 = r2 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L68:
        int r18 = r39 & 64;
        if (r18 == 0) goto L72;
        r2 = r2 | 1572864;
    L80:
        if ((r39 & 128) == 0) goto L83;
        r2 = r2 | 12582912;
    L89:
        int r0 = r2;
        if ((4793491 & r0) == 4793490) goto L92;
        boolean r4 = true;
    L94:
        if (r1.shouldExecute(r4, r0 & 1) == false) goto L185;
        if (r3 == 0) goto L97;
        Modifier.Companion r8 = Modifier.Companion;
    L98:
        if (r5 == 0) goto L100;
        Arrangement.Vertical r11 = Arrangement.INSTANCE.getTop();
    L101:
        if (r7 == 0) goto L103;
        r12 = Arrangement.INSTANCE.getStart();
    L103:
        if (r13 == 0) goto L105;
        Alignment.Horizontal r17 = Alignment.Companion.getStart();
    L106:
        if (r15 == 0) goto L108;
        int r19 = Integer.MAX_VALUE;
    L109:
        if (r16 == 0) goto L111;
        int r110 = Integer.MAX_VALUE;
    L112:
        if (r18 == 0) goto L114;
        FlowColumnOverflow r9 = FlowColumnOverflow.Companion.getClip();
    L116:
        if (ComposerKt.isTraceInProgress() == false) goto L118;
        ComposerKt.traceEventStart(-1385862766, r0, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:212)");
    L118:
        ComposerKt.sourceInformationMarkerStart(r1, -1515521309, "CC(remember):FlowLayout.kt#9igjgp");
        if ((3670016 & r0) != 1048576) goto L121;
        boolean r10 = true;
    L122:
        Object r20 = r1.rememberedValue();
        if (r10 == true) goto L128;
        int r23 = r0;
        if (r20 != Composer.Companion.getEmpty()) goto L130;
    L129:
        FlowLayoutOverflowState r21 = r9.createOverflowState$foundation_layout_release();
        r1.updateRememberedValue(r21);
        r20 = r21;
    L130:
        FlowLayoutOverflowState r111 = (FlowLayoutOverflowState) r20;
        ComposerKt.sourceInformationMarkerEnd(r1);
        MultiContentMeasurePolicy r22 = columnMeasurementMultiContentHelper(r11, r12, r17, r19, r110, r111, r1, (((((r23 >> 3) & 14) | ((r23 >> 3) & 112)) | ((r23 >> 3) & 896)) | ((r23 >> 3) & 7168)) | ((r23 >> 3) & 57344));
        Arrangement.Vertical r24 = r11;
        Composer r112 = r1;
        ComposerKt.sourceInformationMarkerStart(r112, -1515509132, "CC(remember):FlowLayout.kt#9igjgp");
        if ((r23 & 3670016) != 1048576) goto L133;
        boolean r25 = true;
    L135:
        if ((r23 & 29360128) != 8388608) goto L137;
        boolean r26 = true;
    L138:
        boolean r27 = r26 | r25;
        if ((r23 & 458752) != 131072) goto L141;
        boolean r28 = true;
    L142:
        boolean r40 = r27 | r28;
        Object r41 = r112.rememberedValue();
        if (r40 == true) goto L148;
        Modifier r113 = r8;
        if (r41 == Composer.Companion.getEmpty()) goto L149;
        Object r42 = r41;
    L150:
        ComposerKt.sourceInformationMarkerEnd(r112);
        int r43 = (r23 << 3) & 112;
        Modifier r44 = r113;
        ComposerKt.sourceInformationMarkerStart(r112, 1399185516, "CC(Layout)P(!1,2)168@6883L62,165@6769L182:Layout.kt#80mrfh");
        Function2<Composer, Integer, Unit> r45 = LayoutKt.combineAsVirtualLayouts((List) r42);
        ComposerKt.sourceInformationMarkerStart(r112, -290764973, "CC(remember):Layout.kt#9igjgp");
        if (((r43 & 896) ^ 384) <= 256) goto L155;
        if (r112.changed(r22) == false) goto L155;
    L156:
        boolean r210 = true;
    L158:
        Object r46 = r112.rememberedValue();
        if (r210 == true) goto L164;
        int r310 = r43;
        if (r46 != Composer.Companion.getEmpty()) goto L166;
    L165:
        MeasurePolicy r47 = MultiContentMeasurePolicyKt.createMeasurePolicy(r22);
        r112.updateRememberedValue(r47);
        r46 = r47;
    L166:
        MeasurePolicy r48 = (MeasurePolicy) r46;
        ComposerKt.sourceInformationMarkerEnd(r112);
        FlowColumnOverflow r311 = r9;
        ComposerKt.sourceInformationMarkerStart(r112, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r49 = ComposablesKt.getCurrentCompositeKeyHash(r112, 0);
        CompositionLocalMap r50 = r112.getCurrentCompositionLocalMap();
        Modifier r51 = ComposedModifierKt.materializeModifier(r112, r44);
        Function0<ComposeUiNode> r114 = ComposeUiNode.Companion.getConstructor();
        int r52 = (((r310 & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart(r112, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if ((r112.getApplier() instanceof Applier) == true) goto L169;
        ComposablesKt.invalidApplier();
    L169:
        r112.startReusableNode();
        if (r112.getInserting() == false) goto L172;
        Function0<ComposeUiNode> r53 = r114;
        r112.createNode(r53);
    L173:
        Composer r54 = Updater.m3808constructorimpl(r112);
        Updater.m3815setimpl(r54, r48, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r54, r50, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r55 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r54.getInserting() == true) goto L180;
        if (Intrinsics.areEqual(r54.rememberedValue(), Integer.valueOf(r49)) == false) goto L180;
    L181:
        Updater.m3815setimpl(r54, r51, ComposeUiNode.Companion.getSetModifier());
        r45.invoke(r112, Integer.valueOf((r52 >> 6) & 14));
        r112.endNode();
        ComposerKt.sourceInformationMarkerEnd(r112);
        ComposerKt.sourceInformationMarkerEnd(r112);
        ComposerKt.sourceInformationMarkerEnd(r112);
        if (ComposerKt.isTraceInProgress() == false) goto L184;
        ComposerKt.traceEventEnd();
    L184:
        final Arrangement.Vertical r56 = r24;
        final FlowColumnOverflow r57 = r311;
        final Alignment.Horizontal r58 = r17;
        final int r59 = r19;
        final int r60 = r110;
        final Modifier r61 = r113;
        final Arrangement.Horizontal r62 = r12;
        Composer r115 = r112;
    L186:
        ScopeUpdateScope r116 = r115.endRestartGroup();
        if (r116 == null) goto L190;
        r116.updateScope(new AnonymousClass1(r61, r56, r62, r58, r59, r60, r57, r36, r38, r39));
        return;
    L190:
        return;
    L180:
        r54.updateRememberedValue(Integer.valueOf(r49));
        r54.apply(Integer.valueOf(r49), r55);
        goto L181
    L172:
        r53 = r114;
        r112.useNode();
        goto L173
    L164:
        r310 = r43;
    L155:
        if ((r43 & 384) == 256) goto L156;
        r210 = false;
    L149:
        ArrayList r63 = new ArrayList();
        r63.add(ComposableLambdaKt.composableLambdaInstance(-763839774, true, new FlowLayoutKt$FlowColumn$list$1$1(r36)));
        r9.addOverflowComposables$foundation_layout_release(r111, r63);
        r112.updateRememberedValue(r63);
        r42 = r63;
        goto L150
    L148:
        r113 = r8;
        goto L149
    L141:
        r28 = false;
        goto L142
    L137:
        r26 = false;
        goto L138
    L133:
        r25 = false;
        goto L135
    L128:
        r23 = r0;
        goto L129
    L121:
        r10 = false;
        goto L122
    L114:
        r9 = r35;
        goto L116
    L111:
        r110 = r34;
        goto L112
    L108:
        r19 = r33;
        goto L109
    L105:
        r17 = r14;
        goto L106
    L100:
        r11 = r6;
        goto L101
    L97:
        r8 = r29;
        goto L98
    L185:
        Composer r117 = r1;
        r117.skipToGroupEnd();
        r61 = r29;
        r59 = r33;
        r57 = r35;
        r56 = r6;
        r58 = r14;
        r60 = r34;
        r62 = r12;
        r115 = r117;
        goto L186
    L92:
        r4 = false;
        goto L94
    L83:
        if ((r38 & 12582912) != 0) goto L89;
        if (r1.changedInstance(r36) == false) goto L87;
        int r64 = 8388608;
    L88:
        r2 = r2 | r64;
        goto L89
    L87:
        r64 = 4194304;
        goto L88
    L72:
        if ((r38 & 1572864) != 0) goto L80;
        if (r1.changed(r35) == false) goto L76;
        int r211 = 1048576;
    L77:
        r2 = r2 | r211;
        goto L80
    L76:
        r211 = 524288;
        goto L77
    L61:
        if ((r38 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L68;
        if (r1.changed(r34) == false) goto L65;
        int r118 = 131072;
    L66:
        r2 = r2 | r118;
        goto L68
    L65:
        r118 = 65536;
        goto L66
    L50:
        if ((r38 & 24576) != 0) goto L57;
        if (r1.changed(r33) == false) goto L54;
        int r119 = 16384;
    L55:
        r2 = r2 | r119;
        goto L57
    L54:
        r119 = 8192;
        goto L55
    L39:
        if ((r38 & 3072) != 0) goto L45;
        r14 = r32;
        if (r1.changed(r14) == false) goto L43;
        int r120 = 2048;
    L44:
        r2 = r2 | r120;
        goto L46
    L43:
        r120 = 1024;
        goto L44
    L45:
        r14 = r32;
        goto L46
    L28:
        if ((r38 & 384) != 0) goto L34;
        r12 = r31;
        if (r1.changed(r12) == false) goto L32;
        int r121 = 256;
    L33:
        r2 = r2 | r121;
        goto L35
    L32:
        r121 = 128;
        goto L33
    L34:
        r12 = r31;
        goto L35
    L17:
        if ((r38 & 48) != 0) goto L23;
        r6 = r30;
        if (r1.changed(r6) == false) goto L21;
        int r65 = 32;
    L22:
        r2 = r2 | r65;
        goto L24
    L21:
        r65 = 16;
        goto L22
    L23:
        r6 = r30;
        goto L24
    L6:
        if ((r38 & 6) != 0) goto L13;
        if (r1.changed(r29) == false) goto L10;
        int r66 = 4;
    L11:
        r2 = r2 | r66;
        goto L13
    L10:
        r66 = 2;
        goto L11
    }

    public static final void FlowColumn(Modifier modifier, Arrangement.Vertical verticalArrangement, Arrangement.Horizontal horizontalArrangement, Alignment.Horizontal itemHorizontalAlignment, int maxItemsInEachColumn, int maxLines, final Function3<? super FlowColumnScope, ? super Composer, ? super Integer, Unit> r27, Composer $composer, final int $changed, final int r30) {
        Composer $composer2 = $composer.startRestartGroup(-208106226);
        ComposerKt.sourceInformation($composer2, "C(FlowColumn)P(5,6,1,2,3,4)270@11890L226:FlowLayout.kt#2w3rfo");
        int $dirty = $changed;
        int r3 = r30 & 1;
        if (r3 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r4 = modifier;
    L13:
        int r5 = r30 & 2;
        if (r5 == 0) goto L17;
        $dirty = $dirty | 48;
        Arrangement.Vertical r6 = verticalArrangement;
    L24:
        int r7 = r30 & 4;
        if (r7 == 0) goto L28;
        $dirty = $dirty | 384;
    L35:
        int r10 = r30 & 8;
        if (r10 == 0) goto L39;
        $dirty = $dirty | 3072;
    L46:
        int r12 = r30 & 16;
        if (r12 == 0) goto L50;
        $dirty = $dirty | 24576;
        int maxItemsInEachColumn2 = maxItemsInEachColumn;
    L57:
        int r14 = r30 & 32;
        if (r14 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        int r15 = maxLines;
    L69:
        if ((r30 & 64) == 0) goto L72;
        $dirty = $dirty | 1572864;
    L80:
        if (($dirty & 599187) == 599186) goto L82;
        boolean r0 = true;
    L84:
        if ($composer2.shouldExecute(r0, $dirty & 1) == false) goto L109;
        if (r3 == 0) goto L87;
        Modifier modifier2 = Modifier.Companion;
    L88:
        if (r5 == 0) goto L90;
        Arrangement.Vertical verticalArrangement2 = Arrangement.INSTANCE.getTop();
        int r1 = r10;
    L91:
        if (r7 == 0) goto L93;
        Arrangement.Horizontal horizontalArrangement2 = Arrangement.INSTANCE.getStart();
    L94:
        if (r1 == 0) goto L96;
        Alignment.Horizontal itemHorizontalAlignment2 = Alignment.Companion.getStart();
        int r2 = r12;
    L97:
        if (r2 == 0) goto L99;
        maxItemsInEachColumn2 = Integer.MAX_VALUE;
    L99:
        if (r14 == 0) goto L101;
        int maxLines2 = Integer.MAX_VALUE;
    L103:
        if (ComposerKt.isTraceInProgress() == false) goto L105;
        ComposerKt.traceEventStart(-208106226, $dirty, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:270)");
    L105:
        Composer $composer3 = $composer2;
        FlowColumn(modifier2, verticalArrangement2, horizontalArrangement2, itemHorizontalAlignment2, maxItemsInEachColumn2, maxLines2, FlowColumnOverflow.Companion.getClip(), r27, $composer3, ((((((($dirty & 14) | 1572864) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (57344 & $dirty)) | (458752 & $dirty)) | (($dirty << 3) & 29360128), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L108;
        ComposerKt.traceEventEnd();
    L108:
        final Modifier modifier3 = modifier2;
        final Arrangement.Vertical verticalArrangement3 = verticalArrangement2;
        final Arrangement.Horizontal horizontalArrangement3 = horizontalArrangement2;
        final Alignment.Horizontal itemHorizontalAlignment3 = itemHorizontalAlignment2;
        final int maxLines3 = maxLines2;
        final int maxItemsInEachColumn3 = maxItemsInEachColumn2;
    L110:
        ScopeUpdateScope r11 = $composer3.endRestartGroup();
        if (r11 == null) goto L114;
        r11.updateScope(new AnonymousClass2(modifier3, verticalArrangement3, horizontalArrangement3, itemHorizontalAlignment3, maxItemsInEachColumn3, maxLines3, r27, $changed, r30));
        return;
    L114:
        return;
    L101:
        maxLines2 = r15;
        goto L103
    L96:
        r2 = r12;
        itemHorizontalAlignment2 = itemHorizontalAlignment;
        goto L97
    L93:
        horizontalArrangement2 = horizontalArrangement;
        goto L94
    L90:
        r1 = r10;
        verticalArrangement2 = r6;
        goto L91
    L87:
        modifier2 = r4;
        goto L88
    L109:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        horizontalArrangement3 = horizontalArrangement;
        modifier3 = r4;
        verticalArrangement3 = r6;
        maxLines3 = r15;
        itemHorizontalAlignment3 = itemHorizontalAlignment;
        maxItemsInEachColumn3 = maxItemsInEachColumn2;
        goto L110
    L82:
        r0 = false;
        goto L84
    L72:
        if (($changed & 1572864) != 0) goto L80;
        if ($composer2.changedInstance(r27) == false) goto L76;
        int r18 = 1048576;
    L77:
        $dirty = $dirty | r18;
        goto L80
    L76:
        r18 = 524288;
        goto L77
    L61:
        if ((196608 & $changed) != 0) goto L67;
        r15 = maxLines;
        if ($composer2.changed(r15) == false) goto L65;
        int r16 = 131072;
    L66:
        $dirty = $dirty | r16;
        goto L69
    L65:
        r16 = 65536;
        goto L66
    L67:
        r15 = maxLines;
        goto L69
    L50:
        if (($changed & 24576) != 0) goto L56;
        maxItemsInEachColumn2 = maxItemsInEachColumn;
        if ($composer2.changed(maxItemsInEachColumn2) == false) goto L54;
        int r17 = 16384;
    L55:
        $dirty = $dirty | r17;
        goto L57
    L54:
        r17 = 8192;
        goto L55
    L56:
        maxItemsInEachColumn2 = maxItemsInEachColumn;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L46;
        if ($composer2.changed(itemHorizontalAlignment) == false) goto L43;
        int r13 = 2048;
    L44:
        $dirty = $dirty | r13;
        goto L46
    L43:
        r13 = 1024;
        goto L44
    L28:
        if (($changed & 384) != 0) goto L35;
        if ($composer2.changed(horizontalArrangement) == false) goto L32;
        int r19 = 256;
    L33:
        $dirty = $dirty | r19;
        goto L35
    L32:
        r19 = 128;
        goto L33
    L17:
        if (($changed & 48) != 0) goto L23;
        r6 = verticalArrangement;
        if ($composer2.changed(r6) == false) goto L21;
        int r8 = 32;
    L22:
        $dirty = $dirty | r8;
        goto L24
    L21:
        r8 = 16;
        goto L22
    L23:
        r6 = verticalArrangement;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L10;
        int r9 = 4;
    L11:
        $dirty = $dirty | r9;
        goto L13
    L10:
        r9 = 2;
        goto L11
    L12:
        r4 = modifier;
        goto L13
    }

    public static final MeasurePolicy rowMeasurementHelper(Arrangement.Horizontal horizontalArrangement, Arrangement.Vertical verticalArrangement, int maxItemsInMainAxis, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1479255111, "C(rowMeasurementHelper)P(!1,2)450@17773L923:FlowLayout.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1479255111, $changed, -1, "androidx.compose.foundation.layout.rowMeasurementHelper (FlowLayout.kt:449)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, -75192171, "CC(remember):FlowLayout.kt#9igjgp");
        boolean r4 = false;
        if ((($changed & 14) ^ 6) <= 4) goto L10;
        Arrangement.Horizontal r8 = horizontalArrangement;
        if ($composer.changed(r8) == false) goto L12;
    L13:
        boolean r2 = true;
    L16:
        if ((($changed & 112) ^ 48) <= 32) goto L20;
        Arrangement.Vertical r9 = verticalArrangement;
        if ($composer.changed(r9) == false) goto L22;
    L23:
        boolean r3 = true;
    L25:
        boolean r5 = r2 | r3;
        if ((($changed & 896) ^ 384) <= 256) goto L30;
        int r13 = maxItemsInMainAxis;
        if ($composer.changed(r13) == false) goto L32;
    L33:
        r4 = true;
    L34:
        boolean invalid$iv = r5 | r4;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L37;
    L40:
        final MultiContentMeasurePolicy measurePolicy = new FlowMeasurePolicy(true, r8, r9, r8.mo612getSpacingD9Ej5fM(), CROSS_AXIS_ALIGNMENT_TOP, r9.mo612getSpacingD9Ej5fM(), r13, Integer.MAX_VALUE, FlowRowOverflow.Companion.getVisible().createOverflowState$foundation_layout_release(), null);
        Object value$iv = (MeasurePolicy) new FlowLayoutKt$rowMeasurementHelper$1$1(measurePolicy);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L41:
        MeasurePolicy r6 = (MeasurePolicy) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L44;
        ComposerKt.traceEventEnd();
    L44:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r6;
    L37:
        if (it$iv != Composer.Companion.getEmpty()) goto L41;
    L32:
        if (($changed & 384) != 256) goto L34;
    L30:
        r13 = maxItemsInMainAxis;
    L22:
        if (($changed & 48) == 32) goto L23;
        r3 = false;
        goto L25
    L20:
        r9 = verticalArrangement;
    L12:
        if (($changed & 6) == 4) goto L13;
        r2 = false;
        goto L16
    L10:
        r8 = horizontalArrangement;
        goto L12
    }

    public static final MultiContentMeasurePolicy rowMeasurementMultiContentHelper(Arrangement.Horizontal horizontalArrangement, Arrangement.Vertical verticalArrangement, Alignment.Vertical itemVerticalAlignment, int maxItemsInMainAxis, int maxLines, FlowLayoutOverflowState overflowState, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -2010142641, "C(rowMeasurementMultiContentHelper)P(!1,5)485@19075L706:FlowLayout.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-2010142641, $changed, -1, "androidx.compose.foundation.layout.rowMeasurementMultiContentHelper (FlowLayout.kt:484)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, 744595868, "CC(remember):FlowLayout.kt#9igjgp");
        boolean r5 = false;
        if ((($changed & 14) ^ 6) <= 4) goto L10;
        Arrangement.Horizontal r9 = horizontalArrangement;
        if ($composer.changed(r9) == false) goto L12;
    L13:
        boolean r3 = true;
    L16:
        if ((($changed & 112) ^ 48) <= 32) goto L20;
        Arrangement.Vertical r10 = verticalArrangement;
        if ($composer.changed(r10) == false) goto L22;
    L23:
        boolean r4 = true;
    L25:
        boolean r6 = r3 | r4;
        if ((($changed & 896) ^ 384) <= 256) goto L30;
        if ($composer.changed(itemVerticalAlignment) == false) goto L30;
    L31:
        boolean r7 = true;
    L33:
        boolean r8 = r6 | r7;
        if ((($changed & 7168) ^ 3072) <= 2048) goto L38;
        int r14 = maxItemsInMainAxis;
        if ($composer.changed(r14) == false) goto L40;
    L41:
        boolean r11 = true;
    L43:
        boolean r12 = r8 | r11;
        if (((57344 & $changed) ^ 24576) <= 16384) goto L48;
        int r15 = maxLines;
        if ($composer.changed(r15) == false) goto L50;
    L51:
        r5 = true;
    L52:
        boolean invalid$iv = (r12 | r5) | $composer.changed(overflowState);
        Object value$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L55;
    L58:
        value$iv = new FlowMeasurePolicy(true, r9, r10, r9.mo612getSpacingD9Ej5fM(), CrossAxisAlignment.Companion.vertical$foundation_layout_release(itemVerticalAlignment), r10.mo612getSpacingD9Ej5fM(), r14, r15, overflowState, null);
        $composer.updateRememberedValue(value$iv);
    L59:
        FlowMeasurePolicy r13 = (FlowMeasurePolicy) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L62;
        ComposerKt.traceEventEnd();
    L62:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r13;
    L55:
        if (value$iv != Composer.Companion.getEmpty()) goto L59;
    L50:
        if (($changed & 24576) != 16384) goto L52;
    L48:
        r15 = maxLines;
    L40:
        if (($changed & 3072) == 2048) goto L41;
        r11 = false;
        goto L43
    L38:
        r14 = maxItemsInMainAxis;
    L30:
        if (($changed & 384) == 256) goto L31;
        r7 = false;
    L22:
        if (($changed & 48) == 32) goto L23;
        r4 = false;
        goto L25
    L20:
        r10 = verticalArrangement;
    L12:
        if (($changed & 6) == 4) goto L13;
        r3 = false;
        goto L16
    L10:
        r9 = horizontalArrangement;
        goto L12
    }

    public static final MeasurePolicy columnMeasurementHelper(Arrangement.Vertical verticalArrangement, Arrangement.Horizontal horizontalArrangement, int maxItemsInMainAxis, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -2013098357, "C(columnMeasurementHelper)P(2)515@20043L880:FlowLayout.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-2013098357, $changed, -1, "androidx.compose.foundation.layout.columnMeasurementHelper (FlowLayout.kt:514)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, 1838024154, "CC(remember):FlowLayout.kt#9igjgp");
        boolean r4 = false;
        if ((($changed & 14) ^ 6) <= 4) goto L10;
        Arrangement.Vertical r9 = verticalArrangement;
        if ($composer.changed(r9) == false) goto L12;
    L13:
        boolean r2 = true;
    L16:
        if ((($changed & 112) ^ 48) <= 32) goto L20;
        Arrangement.Horizontal r8 = horizontalArrangement;
        if ($composer.changed(r8) == false) goto L22;
    L23:
        boolean r3 = true;
    L25:
        boolean r5 = r2 | r3;
        if ((($changed & 896) ^ 384) <= 256) goto L30;
        int r13 = maxItemsInMainAxis;
        if ($composer.changed(r13) == false) goto L32;
    L33:
        r4 = true;
    L34:
        boolean invalid$iv = r5 | r4;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L37;
    L40:
        final FlowMeasurePolicy measurePolicy = new FlowMeasurePolicy(false, r8, r9, r9.mo612getSpacingD9Ej5fM(), CROSS_AXIS_ALIGNMENT_START, r8.mo612getSpacingD9Ej5fM(), r13, Integer.MAX_VALUE, FlowRowOverflow.Companion.getVisible().createOverflowState$foundation_layout_release(), null);
        Object value$iv = (MeasurePolicy) new FlowLayoutKt$columnMeasurementHelper$1$1(measurePolicy);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L41:
        MeasurePolicy r6 = (MeasurePolicy) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L44;
        ComposerKt.traceEventEnd();
    L44:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r6;
    L37:
        if (it$iv != Composer.Companion.getEmpty()) goto L41;
    L32:
        if (($changed & 384) != 256) goto L34;
    L30:
        r13 = maxItemsInMainAxis;
    L22:
        if (($changed & 48) == 32) goto L23;
        r3 = false;
        goto L25
    L20:
        r8 = horizontalArrangement;
    L12:
        if (($changed & 6) == 4) goto L13;
        r2 = false;
        goto L16
    L10:
        r9 = verticalArrangement;
        goto L12
    }

    public static final MultiContentMeasurePolicy columnMeasurementMultiContentHelper(Arrangement.Vertical verticalArrangement, Arrangement.Horizontal horizontalArrangement, Alignment.Horizontal itemHorizontalAlignment, int maxItemsInMainAxis, int maxLines, FlowLayoutOverflowState overflowState, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -308635847, "C(columnMeasurementMultiContentHelper)P(5)547@21271L713:FlowLayout.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-308635847, $changed, -1, "androidx.compose.foundation.layout.columnMeasurementMultiContentHelper (FlowLayout.kt:546)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, 287698387, "CC(remember):FlowLayout.kt#9igjgp");
        boolean r5 = false;
        if ((($changed & 14) ^ 6) <= 4) goto L10;
        Arrangement.Vertical r10 = verticalArrangement;
        if ($composer.changed(r10) == false) goto L12;
    L13:
        boolean r3 = true;
    L16:
        if ((($changed & 112) ^ 48) <= 32) goto L20;
        Arrangement.Horizontal r9 = horizontalArrangement;
        if ($composer.changed(r9) == false) goto L22;
    L23:
        boolean r4 = true;
    L25:
        boolean r6 = r3 | r4;
        if ((($changed & 896) ^ 384) <= 256) goto L30;
        if ($composer.changed(itemHorizontalAlignment) == false) goto L30;
    L31:
        boolean r7 = true;
    L33:
        boolean r8 = r6 | r7;
        if ((($changed & 7168) ^ 3072) <= 2048) goto L38;
        int r14 = maxItemsInMainAxis;
        if ($composer.changed(r14) == false) goto L40;
    L41:
        boolean r11 = true;
    L43:
        boolean r12 = r8 | r11;
        if (((57344 & $changed) ^ 24576) <= 16384) goto L48;
        int r15 = maxLines;
        if ($composer.changed(r15) == false) goto L50;
    L51:
        r5 = true;
    L52:
        boolean invalid$iv = (r12 | r5) | $composer.changed(overflowState);
        Object value$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L55;
    L58:
        value$iv = new FlowMeasurePolicy(false, r9, r10, r10.mo612getSpacingD9Ej5fM(), CrossAxisAlignment.Companion.horizontal$foundation_layout_release(itemHorizontalAlignment), r9.mo612getSpacingD9Ej5fM(), r14, r15, overflowState, null);
        $composer.updateRememberedValue(value$iv);
    L59:
        FlowMeasurePolicy r13 = (FlowMeasurePolicy) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L62;
        ComposerKt.traceEventEnd();
    L62:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r13;
    L55:
        if (value$iv != Composer.Companion.getEmpty()) goto L59;
    L50:
        if (($changed & 24576) != 16384) goto L52;
    L48:
        r15 = maxLines;
    L40:
        if (($changed & 3072) == 2048) goto L41;
        r11 = false;
        goto L43
    L38:
        r14 = maxItemsInMainAxis;
    L30:
        if (($changed & 384) == 256) goto L31;
        r7 = false;
    L22:
        if (($changed & 48) == 32) goto L23;
        r4 = false;
        goto L25
    L20:
        r9 = horizontalArrangement;
    L12:
        if (($changed & 6) == 4) goto L13;
        r3 = false;
        goto L16
    L10:
        r10 = verticalArrangement;
        goto L12
    }

    private static final int maxIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> r17, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> r18, int crossAxisAvailable, int mainAxisSpacing, int maxItemsInMainAxis) {
        int $i$f$maxIntrinsicMainAxisSize = 0;
        int fixedSpace = 0;
        int currentFixedSpace = 0;
        int lastBreak = 0;
        int index$iv = 0;
        int r7 = r17.size();
    L3:
        if (index$iv >= r7) goto L14;
        Object item$iv = r17.get(index$iv);
        IntrinsicMeasurable child = (IntrinsicMeasurable) item$iv;
        int index = index$iv;
        int size = r18.invoke(child, Integer.valueOf(index), Integer.valueOf(crossAxisAvailable)).intValue() + mainAxisSpacing;
        if (((index + 1) - lastBreak) == maxItemsInMainAxis) goto L10;
        int r13 = index + 1;
        int $i$f$maxIntrinsicMainAxisSize2 = $i$f$maxIntrinsicMainAxisSize;
        int $i$f$maxIntrinsicMainAxisSize3 = r17.size();
        if (r13 == $i$f$maxIntrinsicMainAxisSize3) goto L11;
        currentFixedSpace = currentFixedSpace + size;
    L12:
        index$iv = index$iv + 1;
        $i$f$maxIntrinsicMainAxisSize = $i$f$maxIntrinsicMainAxisSize2;
    L11:
        fixedSpace = Math.max(fixedSpace, (currentFixedSpace + size) - mainAxisSpacing);
        currentFixedSpace = 0;
        lastBreak = index;
        goto L12
    L10:
        $i$f$maxIntrinsicMainAxisSize2 = $i$f$maxIntrinsicMainAxisSize;
        goto L11
    L14:
        return fixedSpace;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.collections.IntIterator] */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.collections.IntIterator] */
    private static final int minIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> r23, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> r24, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> r25, int crossAxisAvailable, int mainAxisSpacing, int crossAxisSpacing, int maxItemsInMainAxis, int maxLines, FlowLayoutOverflowState overflow) {
        maxItemsInMainAxis = maxItemsInMainAxis;
        maxLines = maxLines;
        int $i$f$minIntrinsicMainAxisSize = 0;
        if (r23.isEmpty() == false) goto L5;
        return 0;
    L5:
        int[] mainAxisSizes = new int[r23.size()];
        int[] crossAxisSizes = new int[r23.size()];
        int index = 0;
        int r5 = r23.size();
    L6:
        if (index >= r5) goto L8;
        IntrinsicMeasurable child = r23.get(index);
        int mainAxisItemSize = r24.invoke(child, Integer.valueOf(index), Integer.valueOf(crossAxisAvailable)).intValue();
        mainAxisSizes[index] = mainAxisItemSize;
        crossAxisSizes[index] = r25.invoke(child, Integer.valueOf(index), Integer.valueOf(mainAxisItemSize)).intValue();
        index = index + 1;
        goto L6
    L8:
        int maxItemsThatCanBeShown = Integer.MAX_VALUE;
        if (maxLines == Integer.MAX_VALUE) goto L14;
        if (maxItemsInMainAxis == Integer.MAX_VALUE) goto L14;
        maxItemsThatCanBeShown = maxItemsInMainAxis * maxLines;
    L14:
        if (maxItemsThatCanBeShown >= r23.size()) goto L21;
        if (overflow.getType$foundation_layout_release() != FlowLayoutOverflow.OverflowType.ExpandIndicator) goto L18;
    L19:
        boolean r6 = true;
    L28:
        boolean mustHaveEllipsis = r6;
        if (mustHaveEllipsis == false) goto L31;
        int r7 = 1;
    L32:
        int maxItemsThatCanBeShown2 = Math.min(maxItemsThatCanBeShown - r7, r23.size());
        int $this$minIntrinsicMainAxisSize_u24lambda_u249 = ArraysKt.sum(mainAxisSizes);
        int maxMainAxisSize = ((r23.size() - 1) * mainAxisSpacing) + $this$minIntrinsicMainAxisSize_u24lambda_u249;
        int mainAxisUsed = maxMainAxisSize;
        if (crossAxisSizes.length != 0) goto L35;
        boolean r8 = true;
    L36:
        if (r8 == true) goto L73;
        int crossAxisUsed = crossAxisSizes[0];
        ?? r0 = new IntRange(1, ArraysKt.getLastIndex(crossAxisSizes)).iterator();
    L39:
        if (r0.hasNext() == false) goto L44;
        int it = crossAxisSizes[r0.nextInt()];
        if (crossAxisUsed >= it) goto L39;
        crossAxisUsed = it;
        goto L39
    L44:
        if (mainAxisSizes.length != 0) goto L46;
        boolean r1 = true;
    L47:
        if (r1 == true) goto L71;
        int it2 = mainAxisSizes[0];
        ?? r2 = new IntRange(1, ArraysKt.getLastIndex(mainAxisSizes)).iterator();
        int r3 = it2;
    L50:
        if (r2.hasNext() == false) goto L54;
        int it3 = mainAxisSizes[r2.nextInt()];
        if (r3 >= it3) goto L50;
        r3 = it3;
        goto L50
    L54:
        int minimumItemSize = r3;
        int itemShown = minimumItemSize;
        int high = maxMainAxisSize;
    L55:
        if (itemShown > high) goto L69;
        if (crossAxisUsed == crossAxisAvailable) goto L57;
        int mid = (itemShown + high) / 2;
        int high2 = high;
        crossAxisSizes = crossAxisSizes;
        int low = itemShown;
        $i$f$minIntrinsicMainAxisSize = $i$f$minIntrinsicMainAxisSize;
        long pair = access$intrinsicCrossAxisSize(r23, mainAxisSizes, crossAxisSizes, mid, mainAxisSpacing, crossAxisSpacing, maxItemsInMainAxis, maxLines, overflow);
        crossAxisUsed = IntIntPair.m20getFirstimpl(pair);
        int itemShown2 = IntIntPair.m21getSecondimpl(pair);
        if (crossAxisUsed > crossAxisAvailable) goto L65;
        if (itemShown2 < maxItemsThatCanBeShown2) goto L65;
        if (crossAxisUsed >= crossAxisAvailable) goto L64;
        high = mid - 1;
        mainAxisUsed = mid;
        itemShown = low;
        goto L55
    L64:
        return mid;
    L65:
        int low2 = mid + 1;
        if (low2 > high2) goto L67;
        itemShown = low2;
        mainAxisUsed = mid;
        high = high2;
        goto L55
    L67:
        return low2;
    L57:
        return mainAxisUsed;
    L69:
        return mainAxisUsed;
    L71:
        throw new NoSuchElementException();
    L46:
        r1 = false;
        goto L47
    L73:
        throw new NoSuchElementException();
    L35:
        r8 = false;
        goto L36
    L31:
        r7 = 0;
        goto L32
    L18:
        if (overflow.getType$foundation_layout_release() == FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator) goto L19;
    L21:
        if (maxItemsThatCanBeShown >= r23.size()) goto L23;
    L27:
        r6 = false;
        goto L28
    L23:
        if (maxLines < overflow.getMinLinesToShowCollapse$foundation_layout_release()) goto L27;
        if (overflow.getType$foundation_layout_release() != FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator) goto L27;
        r6 = true;
        goto L28
    }

    private static final long intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> r30, int[] mainAxisSizes, int[] crossAxisSizes, int mainAxisAvailable, int mainAxisSpacing, int crossAxisSpacing, int maxItemsInMainAxis, int maxLines, FlowLayoutOverflowState overflow) {
        List<? extends IntrinsicMeasurable> r0 = r30;
        int $i$f$intrinsicCrossAxisSize = 0;
        int size$iv = 0;
        if (r0.isEmpty() == true) goto L71;
        FlowLayoutBuildingBlocks buildingBlocks$iv = new FlowLayoutBuildingBlocks(maxItemsInMainAxis, overflow, OrientationIndependentConstraints.m692constructorimpl(0, mainAxisAvailable, 0, Integer.MAX_VALUE), maxLines, mainAxisSpacing, crossAxisSpacing, null);
        IntrinsicMeasurable nextChild$iv = (IntrinsicMeasurable) CollectionsKt.getOrNull(r0, 0);
        if (nextChild$iv == null) goto L8;
        int index = crossAxisSizes[0];
    L9:
        if (nextChild$iv == null) goto L11;
        int index2 = mainAxisSizes[0];
    L13:
        if (r0.size() <= 1) goto L15;
        boolean r10 = true;
    L16:
        boolean r16 = r10;
        long r9 = IntIntPair.m16constructorimpl(mainAxisAvailable, Integer.MAX_VALUE);
        if (nextChild$iv != null) goto L19;
        IntIntPair r19 = null;
    L20:
        int childCrossAxisSize$iv = index2;
        int nextCrossAxisSize$iv = index;
        if (buildingBlocks$iv.m647getWrapInfoOpUlnko(r16, 0, r9, r19, 0, 0, 0, false, false).isLastItemInContainer() == false) goto L29;
        if (nextChild$iv == null) goto L24;
        boolean r11 = true;
    L25:
        IntIntPair r2 = overflow.m652ellipsisSizeF35zmw$foundation_layout_release(r11, 0, 0);
        if (r2 == null) goto L72;
        size$iv = IntIntPair.m21getSecondimpl(r2.m24unboximpl());
    L72:
        return IntIntPair.m16constructorimpl(size$iv, 0);
    L24:
        r11 = false;
        goto L25
    L29:
        int r12 = r0.size();
        int currentCrossAxisSize$iv = 0;
        int currentCrossAxisSize$iv2 = 0;
        int totalCrossAxisSize$iv = 0;
        int lineIndex$iv = 0;
        int noOfItemsShown$iv = 0;
        int remaining$iv = mainAxisAvailable;
        int lastBreak$iv = 0;
        int nextCrossAxisSize$iv2 = nextCrossAxisSize$iv;
    L30:
        if (lineIndex$iv >= r12) goto L65;
        int childCrossAxisSize$iv2 = nextCrossAxisSize$iv2;
        int childMainAxisSize$iv = childCrossAxisSize$iv;
        int remaining$iv2 = remaining$iv - childMainAxisSize$iv;
        int noOfItemsShown$iv2 = lineIndex$iv + 1;
        int index$iv = lineIndex$iv;
        int index$iv2 = totalCrossAxisSize$iv;
        int lineIndex$iv2 = currentCrossAxisSize$iv2;
        int currentCrossAxisSize$iv3 = Math.max(currentCrossAxisSize$iv, childCrossAxisSize$iv2);
        int currentCrossAxisSize$iv4 = index$iv + 1;
        IntrinsicMeasurable nextChild$iv2 = (IntrinsicMeasurable) CollectionsKt.getOrNull(r0, currentCrossAxisSize$iv4);
        if (nextChild$iv2 == null) goto L34;
        int index3 = index$iv + 1;
        int index4 = crossAxisSizes[index3];
    L35:
        int nextCrossAxisSize$iv3 = index4;
        if (nextChild$iv2 == null) goto L38;
        int index5 = index$iv + 1;
        int index6 = mainAxisSizes[index5] + mainAxisSpacing;
    L40:
        if ((index$iv + 2) >= r0.size()) goto L42;
        boolean r3 = true;
    L43:
        int nextCrossAxisSize$iv4 = (index$iv + 1) - lastBreak$iv;
        int $i$f$intrinsicCrossAxisSize2 = $i$f$intrinsicCrossAxisSize;
        long r13 = IntIntPair.m16constructorimpl(remaining$iv2, Integer.MAX_VALUE);
        if (nextChild$iv2 != null) goto L46;
        IntIntPair r26 = null;
    L47:
        int nextMainAxisSize$iv = index6;
        int remaining$iv3 = r12;
        FlowLayoutBuildingBlocks.WrapInfo wrapInfo$iv = buildingBlocks$iv.m647getWrapInfoOpUlnko(r3, nextCrossAxisSize$iv4, r13, r26, index$iv2, lineIndex$iv2, currentCrossAxisSize$iv3, false, false);
        if (wrapInfo$iv.isLastItemInLine() == false) goto L62;
        int totalCrossAxisSize$iv2 = lineIndex$iv2 + (currentCrossAxisSize$iv3 + crossAxisSpacing);
        if (nextChild$iv2 == null) goto L52;
        boolean r8 = true;
    L53:
        int lineIndex$iv3 = (index$iv + 1) - lastBreak$iv;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo ellipsisWrapInfo$iv = buildingBlocks$iv.getWrapEllipsisInfo(wrapInfo$iv, r8, index$iv2, totalCrossAxisSize$iv2, remaining$iv2, lineIndex$iv3);
        currentCrossAxisSize$iv = 0;
        remaining$iv = mainAxisAvailable;
        lastBreak$iv = index$iv + 1;
        int nextMainAxisSize$iv2 = nextMainAxisSize$iv - mainAxisSpacing;
        totalCrossAxisSize$iv = index$iv2 + 1;
        if (wrapInfo$iv.isLastItemInContainer() == true) goto L55;
        childCrossAxisSize$iv = nextMainAxisSize$iv2;
        currentCrossAxisSize$iv2 = totalCrossAxisSize$iv2;
    L63:
        lineIndex$iv = index$iv + 1;
        r12 = remaining$iv3;
        noOfItemsShown$iv = noOfItemsShown$iv2;
        $i$f$intrinsicCrossAxisSize = $i$f$intrinsicCrossAxisSize2;
        r0 = r30;
        nextCrossAxisSize$iv2 = nextCrossAxisSize$iv3;
        size$iv = 0;
        goto L30
    L55:
        if (ellipsisWrapInfo$iv == null) goto L60;
        long it$iv = ellipsisWrapInfo$iv.m648getEllipsisSizeOO21N7I();
        if (ellipsisWrapInfo$iv.getPlaceEllipsisOnLastContentLine() == true) goto L60;
        totalCrossAxisSize$iv2 = totalCrossAxisSize$iv2 + (IntIntPair.m21getSecondimpl(it$iv) + crossAxisSpacing);
    L60:
        currentCrossAxisSize$iv2 = totalCrossAxisSize$iv2;
        noOfItemsShown$iv = noOfItemsShown$iv2;
        goto L65
    L52:
        r8 = false;
        goto L53
    L62:
        remaining$iv = remaining$iv2;
        currentCrossAxisSize$iv = currentCrossAxisSize$iv3;
        childCrossAxisSize$iv = nextMainAxisSize$iv;
        currentCrossAxisSize$iv2 = lineIndex$iv2;
        totalCrossAxisSize$iv = index$iv2;
        goto L63
    L46:
        r26 = IntIntPair.m13boximpl(IntIntPair.m16constructorimpl(index6, nextCrossAxisSize$iv3));
        goto L47
    L42:
        r3 = false;
        goto L43
    L38:
        index6 = size$iv;
        goto L40
    L34:
        index4 = size$iv;
    L65:
        int totalCrossAxisSize$iv3 = currentCrossAxisSize$iv2 - crossAxisSpacing;
        return IntIntPair.m16constructorimpl(totalCrossAxisSize$iv3, noOfItemsShown$iv);
    L19:
        r19 = IntIntPair.m13boximpl(IntIntPair.m16constructorimpl(index2, index));
        goto L20
    L15:
        r10 = false;
        goto L16
    L11:
        index2 = 0;
        goto L13
    L8:
        index = 0;
        goto L9
    L71:
        return IntIntPair.m16constructorimpl(0, 0);
    }

    private static final long intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> r30, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> r31, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> r32, int mainAxisAvailable, int mainAxisSpacing, int crossAxisSpacing, int maxItemsInMainAxis, int maxLines, FlowLayoutOverflowState overflow) {
        List<? extends IntrinsicMeasurable> r0 = r30;
        Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> r1 = r31;
        int size = 0;
        if (r0.isEmpty() == true) goto L5;
        FlowLayoutBuildingBlocks buildingBlocks = new FlowLayoutBuildingBlocks(maxItemsInMainAxis, overflow, OrientationIndependentConstraints.m692constructorimpl(0, mainAxisAvailable, 0, Integer.MAX_VALUE), maxLines, mainAxisSpacing, crossAxisSpacing, null);
        IntrinsicMeasurable nextChild = (IntrinsicMeasurable) CollectionsKt.getOrNull(r0, 0);
        if (nextChild == null) goto L9;
        int nextCrossAxisSize = r32.invoke(nextChild, 0, Integer.valueOf(mainAxisAvailable)).intValue();
    L10:
        if (nextChild == null) goto L12;
        int nextMainAxisSize = r1.invoke(nextChild, 0, Integer.valueOf(nextCrossAxisSize)).intValue();
    L13:
        int totalCrossAxisSize = 0;
        int lineIndex = 0;
        if (r0.size() <= 1) goto L16;
        boolean r12 = true;
    L17:
        boolean r14 = r12;
        long r13 = IntIntPair.m16constructorimpl(mainAxisAvailable, Integer.MAX_VALUE);
        if (nextChild != null) goto L20;
        IntIntPair r19 = null;
    L21:
        int noOfItemsShown = mainAxisAvailable;
        int nextCrossAxisSize2 = nextCrossAxisSize;
        if (buildingBlocks.m647getWrapInfoOpUlnko(r14, 0, r13, r19, 0, 0, 0, false, false).isLastItemInContainer() == false) goto L31;
        if (nextChild == null) goto L25;
        boolean r15 = true;
    L26:
        IntIntPair r4 = overflow.m652ellipsisSizeF35zmw$foundation_layout_release(r15, 0, 0);
        if (r4 == null) goto L30;
        size = IntIntPair.m21getSecondimpl(r4.m24unboximpl());
    L30:
        return IntIntPair.m16constructorimpl(size, 0);
    L25:
        r15 = false;
        goto L26
    L31:
        int noOfItemsShown2 = 0;
        int index = 0;
        int r16 = r0.size();
        int nextMainAxisSize2 = 0;
        int lastBreak = 0;
        int nextCrossAxisSize3 = nextCrossAxisSize2;
    L32:
        if (index >= r16) goto L67;
        int childCrossAxisSize = nextCrossAxisSize3;
        int childMainAxisSize = nextMainAxisSize;
        int remaining = noOfItemsShown - childMainAxisSize;
        int remaining2 = index + 1;
        int currentCrossAxisSize = Math.max(nextMainAxisSize2, childCrossAxisSize);
        IntrinsicMeasurable nextChild2 = (IntrinsicMeasurable) CollectionsKt.getOrNull(r0, index + 1);
        if (nextChild2 == null) goto L36;
        int nextCrossAxisSize4 = r32.invoke(nextChild2, Integer.valueOf(index + 1), Integer.valueOf(mainAxisAvailable)).intValue();
    L37:
        if (nextChild2 == null) goto L39;
        int nextMainAxisSize3 = r1.invoke(nextChild2, Integer.valueOf(index + 1), Integer.valueOf(nextCrossAxisSize4)).intValue() + mainAxisSpacing;
    L41:
        if ((index + 2) >= r30.size()) goto L43;
        boolean r10 = true;
    L44:
        int r6 = (index + 1) - lastBreak;
        int index2 = index;
        long r17 = IntIntPair.m16constructorimpl(remaining, Integer.MAX_VALUE);
        if (nextChild2 != null) goto L47;
        IntIntPair r26 = null;
    L48:
        IntIntPair r11 = r26;
        int r27 = r16;
        FlowLayoutBuildingBlocks.WrapInfo wrapInfo = buildingBlocks.m647getWrapInfoOpUlnko(r10, r6, r17, r11, lineIndex, totalCrossAxisSize, currentCrossAxisSize, false, false);
        int lineIndex2 = lineIndex;
        if (wrapInfo.isLastItemInLine() == false) goto L63;
        int totalCrossAxisSize2 = totalCrossAxisSize + (currentCrossAxisSize + crossAxisSpacing);
        if (nextChild2 == null) goto L53;
        boolean r18 = true;
    L54:
        FlowLayoutBuildingBlocks.WrapEllipsisInfo ellipsisWrapInfo = buildingBlocks.getWrapEllipsisInfo(wrapInfo, r18, lineIndex2, totalCrossAxisSize2, remaining, (index2 + 1) - lastBreak);
        int remaining3 = mainAxisAvailable;
        lastBreak = index2 + 1;
        int nextMainAxisSize4 = nextMainAxisSize3 - mainAxisSpacing;
        lineIndex = lineIndex2 + 1;
        if (wrapInfo.isLastItemInContainer() == true) goto L56;
        nextMainAxisSize = nextMainAxisSize4;
        nextMainAxisSize2 = 0;
        totalCrossAxisSize = totalCrossAxisSize2;
    L64:
        index = index2 + 1;
        noOfItemsShown2 = remaining2;
        r16 = r27;
        r1 = r31;
        nextCrossAxisSize3 = nextCrossAxisSize4;
        noOfItemsShown = remaining3;
        r0 = r30;
        goto L32
    L56:
        if (ellipsisWrapInfo == null) goto L61;
        long it = ellipsisWrapInfo.m648getEllipsisSizeOO21N7I();
        if (ellipsisWrapInfo.getPlaceEllipsisOnLastContentLine() == true) goto L61;
        totalCrossAxisSize2 = totalCrossAxisSize2 + (IntIntPair.m21getSecondimpl(it) + crossAxisSpacing);
    L61:
        totalCrossAxisSize = totalCrossAxisSize2;
        noOfItemsShown2 = remaining2;
        goto L67
    L53:
        r18 = false;
        goto L54
    L63:
        lineIndex = lineIndex2;
        nextMainAxisSize = nextMainAxisSize3;
        remaining3 = remaining;
        nextMainAxisSize2 = currentCrossAxisSize;
        goto L64
    L47:
        r26 = IntIntPair.m13boximpl(IntIntPair.m16constructorimpl(nextMainAxisSize3, nextCrossAxisSize4));
        goto L48
    L43:
        r10 = false;
        goto L44
    L39:
        nextMainAxisSize3 = 0;
        goto L41
    L36:
        nextCrossAxisSize4 = 0;
    L67:
        return IntIntPair.m16constructorimpl(totalCrossAxisSize - crossAxisSpacing, noOfItemsShown2);
    L20:
        r19 = IntIntPair.m13boximpl(IntIntPair.m16constructorimpl(nextMainAxisSize, nextCrossAxisSize));
        goto L21
    L16:
        r12 = false;
        goto L17
    L12:
        nextMainAxisSize = 0;
        goto L13
    L9:
        nextCrossAxisSize = 0;
        goto L10
    L5:
        return IntIntPair.m16constructorimpl(0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.layout.Placeable[]] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r8v10, types: [androidx.compose.ui.layout.Placeable[]] */
    /* JADX INFO: renamed from: breakDownItems-di9J0FM, reason: not valid java name */
    public static final MeasureResult m649breakDownItemsdi9J0FM(MeasureScope r68, FlowLineMeasurePolicy r69, Iterator<? extends Measurable> r70, float r71, float r72, long r73, int r75, int r76, FlowLayoutOverflowState r77) {
        MeasureScope r6 = r68;
        MutableVector r3 = new MutableVector(new MeasureResult[16], 0);
        int r0 = Constraints.m6926getMaxWidthimpl(r73);
        int r1 = Constraints.m6928getMinWidthimpl(r73);
        int r2 = Constraints.m6925getMaxHeightimpl(r73);
        MutableIntObjectMap r4 = IntObjectMapKt.mutableIntObjectMapOf();
        ArrayList r7 = new ArrayList();
        int r23 = (int) Math.ceil(r6.mo376toPx0680j_4(r71));
        int r9 = (int) Math.ceil(r6.mo376toPx0680j_4(r72));
        long r17 = OrientationIndependentConstraints.m692constructorimpl(0, r0, 0, r2);
        long r10 = OrientationIndependentConstraints.m696copyyUG9Ft0$default(r17, 0, 0, 0, 0, 14, null);
        if (r69.isHorizontal() == false) goto L5;
        LayoutOrientation r12 = LayoutOrientation.Horizontal;
    L6:
        long r11 = OrientationIndependentConstraints.m707toBoxConstraintsOenEA2s(r10, r12);
        Ref.ObjectRef r18 = new Ref.ObjectRef();
        if ((r70 instanceof ContextualFlowItemIterator) == false) goto L9;
        int r15 = r0;
        int r5 = r2;
        FlowLineInfo r19 = new FlowLineInfo(0, 0, r6.mo373toDpu2uoSUM(r15), r6.mo373toDpu2uoSUM(r5), null);
    L10:
        MutableVector r41 = r3;
        FlowLineInfo r8 = r19;
        if (r70.hasNext() == true) goto L13;
        Measurable r21 = null;
    L14:
        Measurable r40 = r21;
        if (r40 == null) goto L17;
        final Ref.ObjectRef r13 = r18;
        Measurable r14 = r40;
        IntIntPair r16 = IntIntPair.m13boximpl(m650measureAndCacherqJ1uqs(r14, r69, r11, new FlowLayoutKt$breakDownItems$nextSize$1$1(r13)));
    L18:
        IntIntPair r47 = r16;
        if (r47 == null) goto L21;
        Integer r20 = Integer.valueOf(IntIntPair.m20getFirstimpl(r47.m24unboximpl()));
    L22:
        if (r47 == null) goto L24;
        Integer r110 = Integer.valueOf(IntIntPair.m21getSecondimpl(r47.m24unboximpl()));
    L25:
        Integer r28 = r110;
        int r42 = 0;
        Integer r53 = r20;
        Measurable r54 = r14;
        MutableIntList r55 = new MutableIntList(0, 1, null);
        MutableIntList r22 = new MutableIntList(0, 1, null);
        FlowLayoutBuildingBlocks r43 = new FlowLayoutBuildingBlocks(r75, r77, r73, r76, r23, r9, null);
        FlowLayoutBuildingBlocks.WrapEllipsisInfo r24 = null;
        FlowLayoutBuildingBlocks.WrapInfo r111 = r43.m647getWrapInfoOpUlnko(r70.hasNext(), 0, IntIntPair.m16constructorimpl(r15, r5), r47, 0, 0, 0, false, false);
        if (r111.isLastItemInContainer() == false) goto L31;
        if (r47 == null) goto L29;
        boolean r31 = true;
    L30:
        int r34 = r15;
        r24 = r43.getWrapEllipsisInfo(r111, r31, -1, 0, r34, 0);
    L32:
        int r112 = 0;
        int r63 = 0;
        int r62 = 0;
        Measurable r113 = r54;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo r114 = r24;
        int r25 = r1;
        int r115 = 0;
        char r26 = 1;
        int r27 = r5;
        int r29 = 0;
    L34:
        if (r111.isLastItemInContainer() == true) goto L97;
        if (r113 == null) goto L97;
        Intrinsics.checkNotNull(r53);
        int r210 = r53.intValue();
        Intrinsics.checkNotNull(r28);
        MutableIntList r211 = r22;
        int r212 = r0;
        int r30 = r112 + r210;
        int r64 = Math.max(r115, r28.intValue());
        int r116 = r34 - r210;
        r77.setItemShown$foundation_layout_release(r29 + 1);
        r7.add(r113);
        r4.set(r29, r13.element);
        int r32 = (r29 + 1) - r42;
        if (r32 >= r75) goto L39;
        boolean r33 = true;
    L40:
        boolean r44 = r33;
        if (r8 == null) goto L64;
        if (r44 == false) goto L44;
        int r35 = r62;
    L46:
        if (r44 == false) goto L48;
        int r36 = r32;
    L50:
        if (r44 == false) goto L55;
        int r37 = r116 - r23;
        int r58 = r32;
        if (r37 >= 0) goto L54;
        int r38 = 0;
    L56:
        float r39 = r6.mo373toDpu2uoSUM(r38);
        if (r44 == false) goto L59;
        int r117 = r27;
    L63:
        r8.m660update4j6BHR0$foundation_layout_release(r35, r36, r39, r6.mo373toDpu2uoSUM(r117));
    L66:
        if (r70.hasNext() == true) goto L68;
        Measurable r45 = null;
    L69:
        r113 = r45;
        r13.element = null;
        if (r113 == null) goto L72;
        IntIntPair r46 = IntIntPair.m13boximpl(m650measureAndCacherqJ1uqs(r113, r69, r11, new FlowLayoutKt$breakDownItems$1$1(r13)));
    L73:
        IntIntPair r48 = r46;
        if (r48 == null) goto L76;
        Integer r49 = Integer.valueOf(IntIntPair.m20getFirstimpl(r48.m24unboximpl()) + r23);
    L77:
        if (r48 == null) goto L79;
        Integer r50 = Integer.valueOf(IntIntPair.m21getSecondimpl(r48.m24unboximpl()));
    L80:
        r28 = r50;
        boolean r57 = r70.hasNext();
        long r59 = IntIntPair.m16constructorimpl(r116, r27);
        if (r48 != null) goto L83;
        IntIntPair r61 = null;
    L84:
        FlowLayoutBuildingBlocks.WrapInfo r310 = r43.m647getWrapInfoOpUlnko(r57, r58, r59, r61, r62, r63, r64, false, false);
        if (r310.isLastItemInLine() == false) goto L95;
        Integer r118 = r49;
        r25 = Math.min(Math.max(r25, r30), r212);
        int r311 = r63 + r64;
        if (r48 == null) goto L89;
        boolean r312 = true;
    L90:
        FlowLayoutBuildingBlocks.WrapEllipsisInfo r119 = r43.getWrapEllipsisInfo(r310, r312, r62, r311, r116, (r29 + 1) - r42);
        r212 = r212;
        MutableIntList r51 = r211;
        r51.add(r64);
        int r120 = (r2 - r311) - r9;
        int r52 = r29 + 1;
        MutableIntList r56 = r55;
        r56.add(r29 + 1);
        if (r118 == null) goto L93;
        Integer r313 = Integer.valueOf(r118.intValue() - r23);
    L94:
        r62 = r62 + 1;
        r112 = 0;
        r42 = r52;
        r34 = r212;
        r27 = r120;
        r53 = r313;
        r63 = r311 + r9;
        r114 = r119;
        r115 = 0;
    L96:
        r29 = r29 + 1;
        r22 = r51;
        r55 = r56;
        r8 = r8;
        r0 = r212;
        r111 = r310;
        goto L34
    L93:
        r313 = null;
        goto L94
    L89:
        r312 = false;
        goto L90
    L95:
        r34 = r116;
        Integer r121 = r49;
        r51 = r211;
        r56 = r55;
        r53 = r121;
        r115 = r64;
        r112 = r30;
        goto L96
    L83:
        Intrinsics.checkNotNull(r49);
        int r60 = r49.intValue();
        Intrinsics.checkNotNull(r28);
        r61 = IntIntPair.m13boximpl(IntIntPair.m16constructorimpl(r60, r28.intValue()));
        goto L84
    L79:
        r50 = null;
        goto L80
    L76:
        r49 = null;
        goto L77
    L72:
        r46 = null;
        goto L73
    L68:
        r45 = safeNext(r70, r8);
        goto L69
    L59:
        int r314 = (r27 - r64) - r9;
        if (r314 >= 0) goto L62;
        r117 = 0;
        goto L63
    L62:
        r117 = r314;
        goto L63
    L54:
        r38 = r37;
        goto L56
    L55:
        r58 = r32;
        r38 = r212;
        goto L56
    L48:
        r36 = 0;
        goto L50
    L44:
        r35 = r62 + 1;
        goto L46
    L64:
        r58 = r32;
        goto L66
    L39:
        r33 = false;
    L97:
        FlowLineInfo r213 = r8;
        MutableIntList r65 = r22;
        MutableIntList r66 = r55;
        if (r114 == null) goto L105;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo r67 = r114;
        r7.add(r67.getEllipsis());
        r4.set(r7.size() - 1, r67.getPlaceable());
        int r74 = r66._size - 1;
        if (r67.getPlaceEllipsisOnLastContentLine() == false) goto L102;
        int r78 = r66._size - 1;
        r65.set(r74, Math.max(r65.get(r74), IntIntPair.m21getSecondimpl(r67.m648getEllipsisSizeOO21N7I())));
        r66.set(r78, r66.last() + 1);
        goto L105
    L102:
        r65.add(IntIntPair.m21getSecondimpl(r67.m648getEllipsisSizeOO21N7I()));
        r66.add(r66.last() + 1);
    L105:
        int r79 = r7.size();
        ?? r80 = new Placeable[r79];
        int r81 = 0;
    L106:
        if (r81 >= r79) goto L108;
        r80[r81] = r4.get(r81);
        r81 = r81 + 1;
        goto L106
    L108:
        int[] r82 = new int[r66._size];
        int[] r83 = new int[r66._size];
        int r122 = 0;
        MutableIntList r123 = r66;
        int[] r124 = r123.content;
        int r125 = r123._size;
        int r315 = 0;
        int r84 = 0;
        ?? r85 = r80;
    L109:
        if (r84 >= r125) goto L115;
        long r410 = r11;
        int r126 = r124[r84];
        int r127 = r84;
        int r316 = r27;
        ?? r86 = r85;
        int r87 = r65.get(r127);
        MutableIntList r411 = r65;
        int[] r128 = r82;
        int r88 = r25;
        char r317 = r26;
        MutableIntList r214 = r123;
        MutableVector r129 = r41;
        MutableIntList r510 = r66;
        int r318 = r84;
        int r89 = r23;
        FlowLineInfo r215 = r213;
        MutableIntObjectMap r216 = r4;
        MeasureResult r90 = RowColumnMeasurePolicyKt.measure(r69, r88, Constraints.m6927getMinHeightimpl(r17), Constraints.m6926getMaxWidthimpl(r17), r87, r89, r6, r7, r86, r122, r126, r128, r127);
        ArrayList r91 = r7;
        if (r69.isHorizontal() == false) goto L113;
        int r92 = r90.getWidth();
        int r93 = r90.getHeight();
    L114:
        r83[r127] = r93;
        r315 = r315 + r93;
        int r94 = Math.max(r88, r92);
        r129.add(r90);
        r41 = r129;
        r123 = r214;
        r26 = r317;
        r6 = r68;
        r122 = r126;
        r7 = r91;
        r85 = r86;
        r4 = r216;
        r213 = r215;
        r66 = r510;
        r84 = r318 + 1;
        r25 = r94;
        r82 = r128;
        r23 = r89;
        r27 = r316;
        r65 = r411;
        r11 = r410;
        goto L109
    L113:
        r92 = r90.getHeight();
        r93 = r90.getWidth();
        goto L114
    L115:
        MutableVector r130 = r41;
        char r412 = r26;
        int[] r95 = r82;
        int r96 = r25;
        if (r130.getSize() == 0) goto L119;
        r412 = 0;
    L119:
        if (r412 == 0) goto L121;
        int r97 = 0;
        int r98 = 0;
    L123:
        return m651placeHelperBmaY500(r68, r73, r97, r98, r83, r130, r69, r95);
    L121:
        r97 = r96;
        r98 = r315;
        goto L123
    L29:
        r31 = false;
        goto L30
    L31:
        r34 = r15;
        goto L32
    L24:
        r110 = null;
        goto L25
    L21:
        r20 = null;
        goto L22
    L17:
        r13 = r18;
        r14 = r40;
        r16 = null;
        goto L18
    L13:
        r21 = safeNext(r70, r8);
        goto L14
    L9:
        r15 = r0;
        r5 = r2;
        r19 = null;
        goto L10
    L5:
        r12 = LayoutOrientation.Vertical;
        goto L6
    }

    private static final Measurable safeNext(Iterator<? extends Measurable> r2, FlowLineInfo info) {
        if ((r2 instanceof ContextualFlowItemIterator) == false) goto L5;
        Intrinsics.checkNotNull(info);     // Catch: IndexOutOfBoundsException -> L7
        Measurable r0 = ((ContextualFlowItemIterator) r2).getNext$foundation_layout_release(info);     // Catch: IndexOutOfBoundsException -> L7
    L10:
        return r0;
    L5:
        r0 = r2.next();     // Catch: IndexOutOfBoundsException -> L7
    L13:
        return null;
    }

    public static final int mainAxisMin(IntrinsicMeasurable $this$mainAxisMin, boolean isHorizontal, int crossAxisSize) {
        if (isHorizontal == false) goto L5;
        return $this$mainAxisMin.minIntrinsicWidth(crossAxisSize);
    L5:
        return $this$mainAxisMin.minIntrinsicHeight(crossAxisSize);
    }

    public static final int crossAxisMin(IntrinsicMeasurable $this$crossAxisMin, boolean isHorizontal, int mainAxisSize) {
        if (isHorizontal == false) goto L5;
        return $this$crossAxisMin.minIntrinsicHeight(mainAxisSize);
    L5:
        return $this$crossAxisMin.minIntrinsicWidth(mainAxisSize);
    }

    static {
        CROSS_AXIS_ALIGNMENT_TOP = CrossAxisAlignment.Companion.vertical$foundation_layout_release(Alignment.Companion.getTop());
        CROSS_AXIS_ALIGNMENT_START = CrossAxisAlignment.Companion.horizontal$foundation_layout_release(Alignment.Companion.getStart());
    }

    public static final CrossAxisAlignment getCROSS_AXIS_ALIGNMENT_TOP() {
        return CROSS_AXIS_ALIGNMENT_TOP;
    }

    public static final CrossAxisAlignment getCROSS_AXIS_ALIGNMENT_START() {
        return CROSS_AXIS_ALIGNMENT_START;
    }

    /* JADX INFO: renamed from: measureAndCache-rqJ1uqs, reason: not valid java name */
    public static final long m650measureAndCacherqJ1uqs(Measurable $this$measureAndCache_u2drqJ1uqs, FlowLineMeasurePolicy measurePolicy, long constraints, Function1<? super Placeable, Unit> r9) {
        if (RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData($this$measureAndCache_u2drqJ1uqs)) != 0.0f) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L15;
        RowColumnParentData r1 = RowColumnImplKt.getRowColumnParentData($this$measureAndCache_u2drqJ1uqs);
        if (r1 == null) goto L12;
        FlowLayoutData r2 = r1.getFlowLayoutData();
        if (r2 == null) goto L12;
        Float r3 = Float.valueOf(r2.getFillCrossAxisFraction());
    L13:
        if (r3 != null) goto L15;
        Placeable placeable = $this$measureAndCache_u2drqJ1uqs.mo5714measureBRTryo0(constraints);
        r9.invoke(placeable);
        int mainAxis = measurePolicy.mainAxisSize(placeable);
        int crossAxis = measurePolicy.crossAxisSize(placeable);
        return IntIntPair.m16constructorimpl(mainAxis, crossAxis);
    L12:
        r3 = null;
    L15:
        int mainAxis2 = mainAxisMin($this$measureAndCache_u2drqJ1uqs, measurePolicy.isHorizontal(), Integer.MAX_VALUE);
        int crossAxis2 = crossAxisMin($this$measureAndCache_u2drqJ1uqs, measurePolicy.isHorizontal(), mainAxis2);
        return IntIntPair.m16constructorimpl(mainAxis2, crossAxis2);
    L5:
        r0 = false;
        goto L6
    }

    /* JADX INFO: renamed from: placeHelper-BmaY500, reason: not valid java name */
    public static final MeasureResult m651placeHelperBmaY500(MeasureScope $this$placeHelper_u2dBmaY500, long constraints, int mainAxisTotalSize, int crossAxisTotalSize, int[] crossAxisSizes, final MutableVector<MeasureResult> r25, FlowLineMeasurePolicy measureHelper, int[] outPosition) {
        boolean isHorizontal = measureHelper.isHorizontal();
        Arrangement.Vertical verticalArrangement = measureHelper.getVerticalArrangement();
        Arrangement.Horizontal horizontalArrangement = measureHelper.getHorizontalArrangement();
        if (isHorizontal == false) goto L11;
        int totalCrossAxisSpacing = $this$placeHelper_u2dBmaY500.mo370roundToPx0680j_4(verticalArrangement.mo612getSpacingD9Ej5fM()) * (r25.getSize() - 1);
        int totalCrossAxisSize = crossAxisTotalSize + totalCrossAxisSpacing;
        int r5 = Constraints.m6927getMinHeightimpl(constraints);
        int r6 = Constraints.m6925getMaxHeightimpl(constraints);
        int $this$fastCoerceAtLeast$iv$iv = totalCrossAxisSize;
        if ($this$fastCoerceAtLeast$iv$iv >= r5) goto L8;
        $this$fastCoerceAtLeast$iv$iv = r5;
    L8:
        if ($this$fastCoerceAtLeast$iv$iv <= r6) goto L10;
        $this$fastCoerceAtLeast$iv$iv = r6;
    L10:
        verticalArrangement.arrange($this$placeHelper_u2dBmaY500, $this$fastCoerceAtLeast$iv$iv, crossAxisSizes, outPosition);
    L19:
        int r1 = Constraints.m6928getMinWidthimpl(constraints);
        int r2 = Constraints.m6926getMaxWidthimpl(constraints);
        int $this$fastCoerceAtLeast$iv$iv2 = mainAxisTotalSize;
        if ($this$fastCoerceAtLeast$iv$iv2 >= r1) goto L23;
        $this$fastCoerceAtLeast$iv$iv2 = r1;
    L23:
        if ($this$fastCoerceAtLeast$iv$iv2 <= r2) goto L25;
        $this$fastCoerceAtLeast$iv$iv2 = r2;
    L25:
        int finalMainAxisTotalSize = $this$fastCoerceAtLeast$iv$iv2;
        if (isHorizontal == false) goto L28;
        int layoutWidth = finalMainAxisTotalSize;
        int layoutHeight = $this$fastCoerceAtLeast$iv$iv;
    L30:
        return MeasureScope.layout$default($this$placeHelper_u2dBmaY500, layoutWidth, layoutHeight, null, new FlowLayoutKt$placeHelper$3(r25), 4, null);
    L28:
        layoutWidth = $this$fastCoerceAtLeast$iv$iv;
        layoutHeight = finalMainAxisTotalSize;
        goto L30
    L11:
        int totalCrossAxisSpacing2 = $this$placeHelper_u2dBmaY500.mo370roundToPx0680j_4(horizontalArrangement.mo612getSpacingD9Ej5fM()) * (r25.getSize() - 1);
        int totalCrossAxisSize2 = crossAxisTotalSize + totalCrossAxisSpacing2;
        int r4 = Constraints.m6927getMinHeightimpl(constraints);
        int r10 = Constraints.m6925getMaxHeightimpl(constraints);
        int $this$fastCoerceAtLeast$iv$iv3 = totalCrossAxisSize2;
        if ($this$fastCoerceAtLeast$iv$iv3 >= r4) goto L15;
        $this$fastCoerceAtLeast$iv$iv3 = r4;
    L15:
        if ($this$fastCoerceAtLeast$iv$iv3 <= r10) goto L17;
        int $i$f$fastCoerceAtMost = r10;
    L18:
        horizontalArrangement.arrange($this$placeHelper_u2dBmaY500, $i$f$fastCoerceAtMost, crossAxisSizes, $this$placeHelper_u2dBmaY500.getLayoutDirection(), outPosition);
        $this$fastCoerceAtLeast$iv$iv = $i$f$fastCoerceAtMost;
        goto L19
    L17:
        $i$f$fastCoerceAtMost = $this$fastCoerceAtLeast$iv$iv3;
        goto L18
    }
}
