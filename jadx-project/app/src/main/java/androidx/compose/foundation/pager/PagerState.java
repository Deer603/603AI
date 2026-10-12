package androidx.compose.foundation.pager;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;
import androidx.compose.runtime.IntState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: PagerState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b'\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B'\b\u0000\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ7\u0010¦\u0001\u001a\u00030§\u00012\u0007\u0010¨\u0001\u001a\u00020\u00032\t\b\u0003\u0010©\u0001\u001a\u00020\u00052\u0010\b\u0002\u0010ª\u0001\u001a\t\u0012\u0004\u0012\u00020\u00050«\u0001H\u0086@¢\u0006\u0003\u0010¬\u0001J-\u0010\u00ad\u0001\u001a\u00030§\u00012\u0007\u0010®\u0001\u001a\u00020\f2\u0007\u0010¯\u0001\u001a\u00020\u00182\t\b\u0002\u0010°\u0001\u001a\u00020\u0018H\u0000¢\u0006\u0003\b±\u0001J\u0011\u0010²\u0001\u001a\u00030§\u0001H\u0082@¢\u0006\u0003\u0010³\u0001J\u0013\u0010´\u0001\u001a\u00030§\u00012\u0007\u0010µ\u0001\u001a\u00020HH\u0002J\u0012\u0010¶\u0001\u001a\u00020\u00052\u0007\u0010·\u0001\u001a\u00020\u0005H\u0016J\u0010\u0010¸\u0001\u001a\u00020\u00052\u0007\u0010¨\u0001\u001a\u00020\u0003J\u0012\u0010¹\u0001\u001a\u00020\u00182\u0007\u0010º\u0001\u001a\u00020\u0005H\u0002J\u000f\u0010»\u0001\u001a\u00020\u0018H\u0000¢\u0006\u0003\b¼\u0001J#\u0010½\u0001\u001a\u00020\u00032\b\u0010¾\u0001\u001a\u00030¿\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0000¢\u0006\u0003\bÀ\u0001J\u001c\u0010Á\u0001\u001a\u00030§\u00012\u0007\u0010·\u0001\u001a\u00020\u00052\u0007\u0010µ\u0001\u001a\u00020HH\u0002J\u0012\u0010Â\u0001\u001a\u00020\u00052\u0007\u0010·\u0001\u001a\u00020\u0005H\u0002J\u001e\u0010Ã\u0001\u001a\u00030§\u00012\t\b\u0001\u0010¨\u0001\u001a\u00020\u00032\t\b\u0003\u0010©\u0001\u001a\u00020\u0005JK\u0010Ä\u0001\u001a\u00030§\u00012\b\u0010Å\u0001\u001a\u00030Æ\u00012.\u0010Ç\u0001\u001a)\b\u0001\u0012\u0005\u0012\u00030É\u0001\u0012\f\u0012\n\u0012\u0005\u0012\u00030§\u00010Ê\u0001\u0012\u0007\u0012\u0005\u0018\u00010Ë\u00010È\u0001¢\u0006\u0003\bÌ\u0001H\u0096@¢\u0006\u0003\u0010Í\u0001J%\u0010Î\u0001\u001a\u00030§\u00012\u0007\u0010¨\u0001\u001a\u00020\u00032\t\b\u0003\u0010©\u0001\u001a\u00020\u0005H\u0086@¢\u0006\u0003\u0010Ï\u0001J+\u0010Ð\u0001\u001a\u00030§\u00012\u0007\u0010¨\u0001\u001a\u00020\u00032\u0007\u0010Ñ\u0001\u001a\u00020\u00052\u0007\u0010Ò\u0001\u001a\u00020\u0018H\u0000¢\u0006\u0003\bÓ\u0001J\u0013\u0010Ô\u0001\u001a\u00030§\u00012\u0007\u0010®\u0001\u001a\u00020\fH\u0002J\r\u0010Õ\u0001\u001a\u00020\u0003*\u00020\u0003H\u0002J!\u0010Ö\u0001\u001a\u00030§\u0001*\u00030É\u00012\u0007\u0010¨\u0001\u001a\u00020\u00032\t\b\u0003\u0010©\u0001\u001a\u00020\u0005J\u0016\u0010×\u0001\u001a\u00030§\u0001*\u00030É\u00012\u0007\u0010\u009d\u0001\u001a\u00020\u0003R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u00188F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR+\u0010 \u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u00188F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u001f\u001a\u0004\b!\u0010\u001b\"\u0004\b\"\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u00020+X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001e\u00100\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b1\u0010%R\u001e\u00102\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b3\u0010%R\u001e\u00104\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u0018@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001bR\u000e\u00106\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u00107\u001a\u0002088F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020<X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0014\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00180@X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00180@X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010B\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u001bR\u0014\u0010C\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u001bR\u0014\u0010E\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u001bR\u0011\u0010G\u001a\u00020H8F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u001e\u0010K\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bL\u0010%R\u000e\u0010M\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010N\u001a\u00020OX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001c\u0010T\u001a\u00020UX\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\bV\u0010WR\u001a\u0010X\u001a\u00020OX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Q\"\u0004\bZ\u0010SR\u001b\u0010[\u001a\u00020\\8@X\u0080\u0084\u0002¢\u0006\f\u001a\u0004\b_\u0010`*\u0004\b]\u0010^R\u0014\u0010a\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bb\u0010%R\u0012\u0010c\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\bd\u0010%R\u0014\u0010e\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bf\u0010%R\u0014\u0010g\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bh\u0010%R\u0014\u0010i\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bj\u0010%R\u0014\u0010k\u001a\b\u0012\u0004\u0012\u00020\f0@X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010l\u001a\u00020mX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bn\u0010oR\u001c\u0010p\u001a\u00020UX\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\bq\u0010WR\u0014\u0010r\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bs\u0010'R\u0014\u0010t\u001a\u00020uX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bv\u0010wR\u001a\u0010x\u001a\u00020\u0018X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010\u001b\"\u0004\bz\u0010\u001dR\"\u0010{\u001a\u00020|X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u007f\u001a\u0004\b}\u0010Q\"\u0004\b~\u0010SR\u000f\u0010\u0080\u0001\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R1\u0010\u0081\u0001\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0005\b\u0082\u0001\u0010%\"\u0006\b\u0083\u0001\u0010\u0084\u0001R7\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0087\u00012\t\u0010\u000b\u001a\u0005\u0018\u00010\u0087\u00018@@BX\u0080\u008e\u0002¢\u0006\u0017\n\u0005\b\u008d\u0001\u0010\u001f\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u008e\u0001\u001a\u00030\u008f\u0001X\u0080\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0010\u0010\u0092\u0001\u001a\u00030\u0093\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000f\u0010\u0094\u0001\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0095\u0001\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\u000f\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0005\b\u0096\u0001\u0010%R1\u0010\u0099\u0001\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0006\b\u009c\u0001\u0010\u0086\u0001\u001a\u0005\b\u009a\u0001\u0010%\"\u0006\b\u009b\u0001\u0010\u0084\u0001R\u001f\u0010\u009d\u0001\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\u000f\n\u0006\b\u009f\u0001\u0010\u0098\u0001\u001a\u0005\b\u009e\u0001\u0010%R7\u0010¡\u0001\u001a\u00030 \u00012\u0007\u0010\u000b\u001a\u00030 \u00018@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0015\n\u0005\b¤\u0001\u0010\u001f\u001a\u0005\b¢\u0001\u0010Q\"\u0005\b£\u0001\u0010SR\u000f\u0010¥\u0001\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Ø\u0001"}, d2 = {"Landroidx/compose/foundation/pager/PagerState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "currentPage", "", "currentPageOffsetFraction", "", "(IF)V", "prefetchScheduler", "Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;", "(IFLandroidx/compose/foundation/lazy/layout/PrefetchScheduler;)V", "accumulator", "<set-?>", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "approachLayoutInfo", "getApproachLayoutInfo$foundation_release", "()Landroidx/compose/foundation/pager/PagerMeasureResult;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "getAwaitLayoutModifier$foundation_release", "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "getBeyondBoundsInfo$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "", "canScrollBackward", "getCanScrollBackward", "()Z", "setCanScrollBackward", "(Z)V", "canScrollBackward$delegate", "Landroidx/compose/runtime/MutableState;", "canScrollForward", "getCanScrollForward", "setCanScrollForward", "canScrollForward$delegate", "getCurrentPage", "()I", "getCurrentPageOffsetFraction", "()F", "currentPrefetchHandle", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "firstVisiblePage", "getFirstVisiblePage$foundation_release", "firstVisiblePageOffset", "getFirstVisiblePageOffset$foundation_release", "hasLookaheadOccurred", "getHasLookaheadOccurred$foundation_release", "indexToPrefetch", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "internalInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInternalInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "isLastScrollBackwardState", "Landroidx/compose/runtime/MutableState;", "isLastScrollForwardState", "isScrollInProgress", "lastScrolledBackward", "getLastScrolledBackward", "lastScrolledForward", "getLastScrolledForward", "layoutInfo", "Landroidx/compose/foundation/pager/PagerLayoutInfo;", "getLayoutInfo", "()Landroidx/compose/foundation/pager/PagerLayoutInfo;", "layoutWithMeasurement", "getLayoutWithMeasurement$foundation_release", "layoutWithoutMeasurement", "maxScrollOffset", "", "getMaxScrollOffset$foundation_release", "()J", "setMaxScrollOffset$foundation_release", "(J)V", "measurementScopeInvalidator", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "getMeasurementScopeInvalidator-zYiylxw$foundation_release", "()Landroidx/compose/runtime/MutableState;", "minScrollOffset", "getMinScrollOffset$foundation_release", "setMinScrollOffset$foundation_release", "nearestRange", "Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release$delegate", "(Landroidx/compose/foundation/pager/PagerState;)Ljava/lang/Object;", "getNearestRange$foundation_release", "()Lkotlin/ranges/IntRange;", "numMeasurePasses", "getNumMeasurePasses$foundation_release", "pageCount", "getPageCount", "pageSize", "getPageSize$foundation_release", "pageSizeWithSpacing", "getPageSizeWithSpacing$foundation_release", "pageSpacing", "getPageSpacing$foundation_release", "pagerLayoutInfoState", "pinnedPages", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getPinnedPages$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "placementScopeInvalidator", "getPlacementScopeInvalidator-zYiylxw$foundation_release", "positionThresholdFraction", "getPositionThresholdFraction$foundation_release", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchingEnabled", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "premeasureConstraints", "Landroidx/compose/ui/unit/Constraints;", "getPremeasureConstraints-msEJaDk$foundation_release", "setPremeasureConstraints-BRTryo0$foundation_release", "J", "previousPassDelta", "programmaticScrollTargetPage", "getProgrammaticScrollTargetPage", "setProgrammaticScrollTargetPage", "(I)V", "programmaticScrollTargetPage$delegate", "Landroidx/compose/runtime/MutableIntState;", "Landroidx/compose/ui/layout/Remeasurement;", "remeasurement", "getRemeasurement$foundation_release", "()Landroidx/compose/ui/layout/Remeasurement;", "setRemeasurement", "(Landroidx/compose/ui/layout/Remeasurement;)V", "remeasurement$delegate", "remeasurementModifier", "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation_release", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "scrollPosition", "Landroidx/compose/foundation/pager/PagerScrollPosition;", "scrollableState", "settledPage", "getSettledPage", "settledPage$delegate", "Landroidx/compose/runtime/State;", "settledPageState", "getSettledPageState", "setSettledPageState", "settledPageState$delegate", "targetPage", "getTargetPage", "targetPage$delegate", "Landroidx/compose/ui/geometry/Offset;", "upDownDifference", "getUpDownDifference-F1C5BW0$foundation_release", "setUpDownDifference-k-4lQ0M$foundation_release", "upDownDifference$delegate", "wasPrefetchingForward", "animateScrollToPage", "", "page", "pageOffsetFraction", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "(IFLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyMeasureResult", "result", "isLookingAhead", "visibleItemsStayedTheSame", "applyMeasureResult$foundation_release", "awaitScrollDependencies", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelPrefetchIfVisibleItemsChanged", "info", "dispatchRawDelta", "delta", "getOffsetDistanceInPages", "isGestureActionMatchesScroll", "scrollDelta", "isNotGestureAction", "isNotGestureAction$foundation_release", "matchScrollPositionWithKey", "itemProvider", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "matchScrollPositionWithKey$foundation_release", "notifyPrefetch", "performScroll", "requestScrollToPage", "scroll", "scrollPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollToPage", "(IFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapToItem", "offsetFraction", "forceRemeasure", "snapToItem$foundation_release", "tryRunPrefetch", "coerceInPageRange", "updateCurrentPage", "updateTargetPage", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class PagerState implements ScrollableState {
    public static final int $stable = 0;
    private float accumulator;
    private PagerMeasureResult approachLayoutInfo;
    private final AwaitFirstLayoutModifier awaitLayoutModifier;
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;
    private final MutableState canScrollBackward$delegate;
    private final MutableState canScrollForward$delegate;
    private LazyLayoutPrefetchState.PrefetchHandle currentPrefetchHandle;
    private Density density;
    private int firstVisiblePage;
    private int firstVisiblePageOffset;
    private boolean hasLookaheadOccurred;
    private int indexToPrefetch;
    private final MutableInteractionSource internalInteractionSource;
    private final MutableState<Boolean> isLastScrollBackwardState;
    private final MutableState<Boolean> isLastScrollForwardState;
    private int layoutWithMeasurement;
    private int layoutWithoutMeasurement;
    private long maxScrollOffset;
    private final MutableState<Unit> measurementScopeInvalidator;
    private long minScrollOffset;
    private MutableState<PagerMeasureResult> pagerLayoutInfoState;
    private final LazyLayoutPinnedItemList pinnedPages;
    private final MutableState<Unit> placementScopeInvalidator;
    private final LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;
    private long premeasureConstraints;
    private float previousPassDelta;
    private final MutableIntState programmaticScrollTargetPage$delegate;
    private final MutableState remeasurement$delegate;
    private final RemeasurementModifier remeasurementModifier;
    private final PagerScrollPosition scrollPosition;
    private final ScrollableState scrollableState;
    private final State settledPage$delegate;
    private final MutableIntState settledPageState$delegate;
    private final State targetPage$delegate;
    private final MutableState upDownDifference$delegate;
    private boolean wasPrefetchingForward;

    /* JADX INFO: renamed from: androidx.compose.foundation.pager.PagerState$animateScrollToPage$1, reason: invalid class name */
    /* JADX INFO: compiled from: PagerState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", i = {0, 0, 0, 0}, l = {610, 617}, m = "animateScrollToPage", n = {"this", "animationSpec", "page", "pageOffsetFraction"}, s = {"L$0", "L$1", "I$0", "F$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        float F$0;
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ PagerState this$0;

        AnonymousClass1(PagerState r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r6) {
            this.result = r6;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.animateScrollToPage(0, 0.0f, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.pager.PagerState$animateScrollToPage$3, reason: invalid class name */
    /* JADX INFO: compiled from: PagerState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.pager.PagerState$animateScrollToPage$3", f = "PagerState.kt", i = {}, l = {619}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ int $targetPage;
        final /* synthetic */ float $targetPageOffsetToSnappedPosition;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ PagerState this$0;

        AnonymousClass3(PagerState r2, int r3, float r4, AnimationSpec<Float> r5, Continuation<? super AnonymousClass3> r6) {
            this.this$0 = r2;
            this.$targetPage = r3;
            this.$targetPageOffsetToSnappedPosition = r4;
            this.$animationSpec = r5;
            super(2, r6);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r7, Continuation<?> r8) {
            AnonymousClass3 r0 = new AnonymousClass3(this.this$0, this.$targetPage, this.$targetPageOffsetToSnappedPosition, this.$animationSpec, r8);
            r0.L$0 = r7;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(ScrollScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass3) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(ScrollScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure($result);
        L11:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            ScrollScope $this$scroll = (ScrollScope) this.L$0;
            LazyLayoutScrollScope r3 = PagerScrollScopeKt.LazyLayoutScrollScope(this.this$0, $this$scroll);
            int r4 = this.$targetPage;
            float r5 = this.$targetPageOffsetToSnappedPosition;
            AnimationSpec<Float> r6 = this.$animationSpec;
            final PagerState r2 = this.this$0;
            this.label = 1;
            if (PagerStateKt.access$animateScrollToPage(r3, r4, r5, r6, new AnonymousClass1(r2), this) != r0) goto L11;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.pager.PagerState$requestScrollToPage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PagerState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.pager.PagerState$requestScrollToPage$1", f = "PagerState.kt", i = {}, l = {581}, m = "invokeSuspend", n = {}, s = {})
    static final class C03431 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ PagerState this$0;

        C03431(PagerState r2, Continuation<? super C03431> r3) {
            this.this$0 = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            return new C03431(this.this$0, r4);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((C03431) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure($result);
        L11:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            this.label = 1;
            if (ScrollExtensionsKt.stopScroll$default(this.this$0, null, this, 1, null) != r0) goto L11;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.pager.PagerState$scroll$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PagerState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", i = {0, 0, 0, 1}, l = {636, 641}, m = "scroll$suspendImpl", n = {"$this", "scrollPriority", "block", "$this"}, s = {"L$0", "L$1", "L$2", "L$0"})
    static final class C03441 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ PagerState this$0;

        C03441(PagerState r1, Continuation<? super C03441> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            this.result = r4;
            this.label |= Integer.MIN_VALUE;
            return PagerState.scroll$suspendImpl(this.this$0, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.pager.PagerState$scrollToPage$2, reason: invalid class name */
    /* JADX INFO: compiled from: PagerState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.pager.PagerState$scrollToPage$2", f = "PagerState.kt", i = {}, l = {507}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $page;
        final /* synthetic */ float $pageOffsetFraction;
        int label;
        final /* synthetic */ PagerState this$0;

        AnonymousClass2(PagerState r2, float r3, int r4, Continuation<? super AnonymousClass2> r5) {
            this.this$0 = r2;
            this.$pageOffsetFraction = r3;
            this.$page = r4;
            super(2, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
            return new AnonymousClass2(this.this$0, this.$pageOffsetFraction, this.$page, r6);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(ScrollScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(ScrollScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure($result);
        L10:
            double r1 = this.$pageOffsetFraction;
            boolean value$iv = false;
            if ((-0.5d) <= r1) goto L13;
        L15:
            float r2 = this.$pageOffsetFraction;
            if (value$iv == true) goto L18;
            InlineClassHelperKt.throwIllegalArgumentException("pageOffsetFraction " + r2 + " is not within the range -0.5 to 0.5");
        L18:
            int targetPage = PagerState.access$coerceInPageRange(this.this$0, this.$page);
            this.this$0.snapToItem$foundation_release(targetPage, this.$pageOffsetFraction, true);
            return Unit.INSTANCE;
        L13:
            if (r1 > 0.5d) goto L15;
            value$iv = true;
            goto L15
        L7:
            ResultKt.throwOnFailure($result);
            this.label = 1;
            if (PagerState.access$awaitScrollDependencies(this.this$0, this) != r0) goto L10;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
    }

    public PagerState() {
        int r1 = 0;
        float r2 = 0.0f;
        PrefetchScheduler r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public abstract int getPageCount();

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority r2, Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> r3, Continuation<? super Unit> r4) {
        return scroll$suspendImpl(this, r2, r3, r4);
    }

    public PagerState(int currentPage, float currentPageOffsetFraction, PrefetchScheduler prefetchScheduler) {
        double r0 = currentPageOffsetFraction;
        boolean value$iv = false;
        if ((-0.5d) > r0) goto L8;
        if (r0 > 0.5d) goto L8;
        value$iv = true;
    L8:
        if (value$iv == true) goto L10;
        InlineClassHelperKt.throwIllegalArgumentException("currentPageOffsetFraction " + currentPageOffsetFraction + " is not within the range -0.5 to 0.5");
    L10:
        this.upDownDifference$delegate = SnapshotStateKt.mutableStateOf$default(Offset.m4114boximpl(Offset.Companion.m4141getZeroF1C5BW0()), null, 2, null);
        this.scrollPosition = new PagerScrollPosition(currentPage, currentPageOffsetFraction, this);
        this.firstVisiblePage = currentPage;
        this.maxScrollOffset = Long.MAX_VALUE;
        this.scrollableState = ScrollableStateKt.ScrollableState(new PagerState$scrollableState$1(this));
        this.prefetchingEnabled = true;
        this.indexToPrefetch = -1;
        this.pagerLayoutInfoState = SnapshotStateKt.mutableStateOf(PagerStateKt.getEmptyLayoutInfo(), SnapshotStateKt.neverEqualPolicy());
        this.density = PagerStateKt.access$getUnitDensity$p();
        this.internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.programmaticScrollTargetPage$delegate = SnapshotIntStateKt.mutableIntStateOf(-1);
        this.settledPageState$delegate = SnapshotIntStateKt.mutableIntStateOf(currentPage);
        this.settledPage$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new PagerState$settledPage$2(this));
        this.targetPage$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new PagerState$targetPage$2(this));
        this.prefetchState = new LazyLayoutPrefetchState(prefetchScheduler, new PagerState$prefetchState$1(this));
        this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.remeasurement$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.remeasurementModifier = new PagerState$remeasurementModifier$1(this);
        this.premeasureConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.pinnedPages = new LazyLayoutPinnedItemList();
        this.scrollPosition.getNearestRangeState();
        this.placementScopeInvalidator = ObservableScopeInvalidator.m907constructorimpl$default(null, 1, null);
        this.measurementScopeInvalidator = ObservableScopeInvalidator.m907constructorimpl$default(null, 1, null);
        this.canScrollForward$delegate = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.canScrollBackward$delegate = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.isLastScrollForwardState = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.isLastScrollBackwardState = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    public static final /* synthetic */ Object access$awaitScrollDependencies(PagerState $this, Continuation $completion) {
        return $this.awaitScrollDependencies($completion);
    }

    public static final /* synthetic */ int access$coerceInPageRange(PagerState $this, int $receiver) {
        return $this.coerceInPageRange($receiver);
    }

    public static final /* synthetic */ int access$getProgrammaticScrollTargetPage(PagerState $this) {
        return $this.getProgrammaticScrollTargetPage();
    }

    public static final /* synthetic */ int access$getSettledPageState(PagerState $this) {
        return $this.getSettledPageState();
    }

    public static final /* synthetic */ float access$performScroll(PagerState $this, float delta) {
        return $this.performScroll(delta);
    }

    public static final /* synthetic */ void access$setRemeasurement(PagerState $this, Remeasurement r1) {
        $this.setRemeasurement(r1);
    }

    public /* synthetic */ PagerState(int r1, float r2, PrefetchScheduler r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = 0.0f;
    L9:
        if ((r4 & 4) == 0) goto L11;
        r3 = null;
    L11:
        this(r1, r2, r3);
    }

    public /* synthetic */ PagerState(int r1, float r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = 0.0f;
    L8:
        this(r1, r2);
    }

    public PagerState(int currentPage, float currentPageOffsetFraction) {
        this(currentPage, currentPageOffsetFraction, null);
    }

    public final boolean getHasLookaheadOccurred$foundation_release() {
        return this.hasLookaheadOccurred;
    }

    public final PagerMeasureResult getApproachLayoutInfo$foundation_release() {
        return this.approachLayoutInfo;
    }

    /* JADX INFO: renamed from: getUpDownDifference-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m982getUpDownDifferenceF1C5BW0$foundation_release() {
        State $this$getValue$iv = this.upDownDifference$delegate;
        return ((Offset) $this$getValue$iv.getValue()).m4135unboximpl();
    }

    /* JADX INFO: renamed from: setUpDownDifference-k-4lQ0M$foundation_release, reason: not valid java name */
    public final void m984setUpDownDifferencek4lQ0M$foundation_release(long r5) {
        MutableState $this$setValue$iv = this.upDownDifference$delegate;
        $this$setValue$iv.setValue(Offset.m4114boximpl(r5));
    }

    public final int getFirstVisiblePage$foundation_release() {
        return this.firstVisiblePage;
    }

    public final int getFirstVisiblePageOffset$foundation_release() {
        return this.firstVisiblePageOffset;
    }

    public final long getMaxScrollOffset$foundation_release() {
        return this.maxScrollOffset;
    }

    public final void setMaxScrollOffset$foundation_release(long r1) {
        this.maxScrollOffset = r1;
    }

    public final long getMinScrollOffset$foundation_release() {
        return this.minScrollOffset;
    }

    public final void setMinScrollOffset$foundation_release(long r1) {
        this.minScrollOffset = r1;
    }

    private final float performScroll(float delta) {
        long currentScrollPosition = PagerScrollPositionKt.currentAbsoluteScrollOffset(this);
        float decimalAccumulation = delta + this.accumulator;
        long decimalAccumulationInt = MathKt.roundToLong(decimalAccumulation);
        this.accumulator = decimalAccumulation - decimalAccumulationInt;
        if (Math.abs(delta) >= 1.0E-4f) goto L5;
        return delta;
    L5:
        long updatedScrollPosition = currentScrollPosition + decimalAccumulationInt;
        long coercedScrollPosition = RangesKt.coerceIn(updatedScrollPosition, this.minScrollOffset, this.maxScrollOffset);
        if (updatedScrollPosition == coercedScrollPosition) goto L8;
        boolean changed = true;
    L9:
        long scrollDelta = coercedScrollPosition - currentScrollPosition;
        this.previousPassDelta = scrollDelta;
        if (Math.abs(scrollDelta) == 0) goto L20;
        MutableState<Boolean> r15 = this.isLastScrollForwardState;
        if (scrollDelta <= 0.0f) goto L14;
        boolean r11 = true;
    L15:
        r15.setValue(Boolean.valueOf(r11));
        MutableState<Boolean> r12 = this.isLastScrollBackwardState;
        if (scrollDelta >= 0.0f) goto L18;
        boolean r16 = true;
    L19:
        r12.setValue(Boolean.valueOf(r16));
        goto L20
    L18:
        r16 = false;
        goto L19
    L14:
        r11 = false;
    L20:
        PagerMeasureResult scrolledLayoutInfo = this.pagerLayoutInfoState.getValue().copyWithScrollDeltaWithoutRemeasure(-((int) scrollDelta));
        if (scrolledLayoutInfo != null) goto L23;
    L32:
        if (scrolledLayoutInfo == null) goto L34;
        applyMeasureResult$foundation_release(scrolledLayoutInfo, this.hasLookaheadOccurred, true);
        ObservableScopeInvalidator.m911invalidateScopeimpl(this.placementScopeInvalidator);
        this.layoutWithoutMeasurement++;
    L38:
        if (changed == false) goto L40;
        Number r13 = Long.valueOf(scrollDelta);
    L42:
        return r13.floatValue();
    L40:
        r13 = Float.valueOf(delta);
        goto L42
    L34:
        this.scrollPosition.applyScrollDelta((int) scrollDelta);
        Remeasurement r14 = getRemeasurement$foundation_release();
        if (r14 == null) goto L37;
        r14.forceRemeasure();
    L37:
        this.layoutWithMeasurement++;
        goto L38
    L23:
        if (this.approachLayoutInfo == null) goto L32;
        PagerMeasureResult r17 = this.approachLayoutInfo;
        if (r17 == null) goto L27;
        PagerMeasureResult scrolledApproachLayoutInfo = r17.copyWithScrollDeltaWithoutRemeasure(-((int) scrollDelta));
    L29:
        if (scrolledApproachLayoutInfo == null) goto L31;
        this.approachLayoutInfo = scrolledApproachLayoutInfo;
        goto L32
    L31:
        scrolledLayoutInfo = null;
        goto L32
    L27:
        scrolledApproachLayoutInfo = null;
        goto L29
    L8:
        changed = false;
        goto L9
    }

    public final int getNumMeasurePasses$foundation_release() {
        return this.layoutWithMeasurement + this.layoutWithoutMeasurement;
    }

    public final int getLayoutWithMeasurement$foundation_release() {
        return this.layoutWithMeasurement;
    }

    public final boolean getPrefetchingEnabled$foundation_release() {
        return this.prefetchingEnabled;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean r1) {
        this.prefetchingEnabled = r1;
    }

    public final PagerLayoutInfo getLayoutInfo() {
        return this.pagerLayoutInfoState.getValue();
    }

    public final int getPageSpacing$foundation_release() {
        return this.pagerLayoutInfoState.getValue().getPageSpacing();
    }

    public final int getPageSize$foundation_release() {
        return this.pagerLayoutInfoState.getValue().getPageSize();
    }

    public final Density getDensity$foundation_release() {
        return this.density;
    }

    public final void setDensity$foundation_release(Density r1) {
        this.density = r1;
    }

    public final int getPageSizeWithSpacing$foundation_release() {
        return getPageSize$foundation_release() + getPageSpacing$foundation_release();
    }

    public final float getPositionThresholdFraction$foundation_release() {
        Density $this$_get_positionThresholdFraction__u24lambda_u244 = this.density;
        float minThreshold = Math.min($this$_get_positionThresholdFraction__u24lambda_u244.mo376toPx0680j_4(PagerStateKt.getDefaultPositionThreshold()), getPageSize$foundation_release() / 2.0f);
        return minThreshold / getPageSize$foundation_release();
    }

    public final MutableInteractionSource getInternalInteractionSource$foundation_release() {
        return this.internalInteractionSource;
    }

    public final InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    public final int getCurrentPage() {
        return this.scrollPosition.getCurrentPage();
    }

    private final int getProgrammaticScrollTargetPage() {
        IntState $this$getValue$iv = this.programmaticScrollTargetPage$delegate;
        return $this$getValue$iv.getIntValue();
    }

    private final void setProgrammaticScrollTargetPage(int r4) {
        MutableIntState $this$setValue$iv = this.programmaticScrollTargetPage$delegate;
        $this$setValue$iv.setIntValue(r4);
    }

    private final int getSettledPageState() {
        IntState $this$getValue$iv = this.settledPageState$delegate;
        return $this$getValue$iv.getIntValue();
    }

    private final void setSettledPageState(int r4) {
        MutableIntState $this$setValue$iv = this.settledPageState$delegate;
        $this$setValue$iv.setIntValue(r4);
    }

    public final int getSettledPage() {
        State $this$getValue$iv = this.settledPage$delegate;
        return ((Number) $this$getValue$iv.getValue()).intValue();
    }

    public final int getTargetPage() {
        State $this$getValue$iv = this.targetPage$delegate;
        return ((Number) $this$getValue$iv.getValue()).intValue();
    }

    public final float getCurrentPageOffsetFraction() {
        return this.scrollPosition.getCurrentPageOffsetFraction();
    }

    public final LazyLayoutPrefetchState getPrefetchState$foundation_release() {
        return this.prefetchState;
    }

    public final LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo$foundation_release() {
        return this.beyondBoundsInfo;
    }

    public final AwaitFirstLayoutModifier getAwaitLayoutModifier$foundation_release() {
        return this.awaitLayoutModifier;
    }

    private final void setRemeasurement(Remeasurement r4) {
        MutableState $this$setValue$iv = this.remeasurement$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final Remeasurement getRemeasurement$foundation_release() {
        State $this$getValue$iv = this.remeasurement$delegate;
        return (Remeasurement) $this$getValue$iv.getValue();
    }

    public final RemeasurementModifier getRemeasurementModifier$foundation_release() {
        return this.remeasurementModifier;
    }

    /* JADX INFO: renamed from: getPremeasureConstraints-msEJaDk$foundation_release, reason: not valid java name */
    public final long m981getPremeasureConstraintsmsEJaDk$foundation_release() {
        return this.premeasureConstraints;
    }

    /* JADX INFO: renamed from: setPremeasureConstraints-BRTryo0$foundation_release, reason: not valid java name */
    public final void m983setPremeasureConstraintsBRTryo0$foundation_release(long r1) {
        this.premeasureConstraints = r1;
    }

    public final LazyLayoutPinnedItemList getPinnedPages$foundation_release() {
        return this.pinnedPages;
    }

    private static Object getNearestRange$foundation_release$delegate(PagerState r1) {
        return r1.scrollPosition.getNearestRangeState();
    }

    public final IntRange getNearestRange$foundation_release() {
        State $this$getValue$iv = this.scrollPosition.getNearestRangeState();
        return $this$getValue$iv.getValue();
    }

    /* JADX INFO: renamed from: getPlacementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final MutableState<Unit> m980getPlacementScopeInvalidatorzYiylxw$foundation_release() {
        return this.placementScopeInvalidator;
    }

    public static /* synthetic */ Object scrollToPage$default(PagerState r0, int r1, float r2, Continuation r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 2) == 0) goto L7;
        r2 = 0.0f;
    L7:
        return r0.scrollToPage(r1, r2, r3);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollToPage");
    }

    public final Object scrollToPage(int page, float pageOffsetFraction, Continuation<? super Unit> r9) {
        Object r10 = ScrollableState.scroll$default(this, null, new AnonymousClass2(this, pageOffsetFraction, page, null), r9, 1, null);
        if (r10 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r10;
    L6:
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void updateCurrentPage$default(PagerState r0, ScrollScope r1, int r2, float r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 2) == 0) goto L6;
        r3 = 0.0f;
    L6:
        r0.updateCurrentPage(r1, r2, r3);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateCurrentPage");
    }

    public final void updateCurrentPage(ScrollScope $this$updateCurrentPage, int page, float pageOffsetFraction) {
        snapToItem$foundation_release(page, pageOffsetFraction, true);
    }

    public final void updateTargetPage(ScrollScope $this$updateTargetPage, int targetPage) {
        setProgrammaticScrollTargetPage(coerceInPageRange(targetPage));
    }

    public final void snapToItem$foundation_release(int page, float offsetFraction, boolean forceRemeasure) {
        this.scrollPosition.requestPositionAndForgetLastKnownKey(page, offsetFraction);
        if (forceRemeasure == false) goto L7;
        Remeasurement r0 = getRemeasurement$foundation_release();
        if (r0 == null) goto L9;
        r0.forceRemeasure();
        return;
    L9:
        return;
    L7:
        ObservableScopeInvalidator.m911invalidateScopeimpl(this.measurementScopeInvalidator);
    }

    /* JADX INFO: renamed from: getMeasurementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final MutableState<Unit> m979getMeasurementScopeInvalidatorzYiylxw$foundation_release() {
        return this.measurementScopeInvalidator;
    }

    public static /* synthetic */ void requestScrollToPage$default(PagerState r0, int r1, float r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L6;
        r2 = 0.0f;
    L6:
        r0.requestScrollToPage(r1, r2);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestScrollToPage");
    }

    public final void requestScrollToPage(int page, float pageOffsetFraction) {
        if (isScrollInProgress() == false) goto L5;
        BuildersKt.launch$default(this.pagerLayoutInfoState.getValue().getCoroutineScope(), null, null, new C03431(this, null), 3, null);
    L5:
        snapToItem$foundation_release(page, pageOffsetFraction, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateScrollToPage$default(PagerState r1, int r2, float r3, SpringSpec r4, Continuation r5, int r6, Object r7) {
        if (r7 != null) goto L12;
        if ((r6 & 2) == 0) goto L7;
        r3 = 0.0f;
    L7:
        if ((r6 & 4) == 0) goto L10;
        r4 = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
    L10:
        return r1.animateScrollToPage(r2, r3, r4, r5);
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateScrollToPage");
    }

    public final Object animateScrollToPage(int r18, float r19, AnimationSpec<Float> r20, Continuation<? super Unit> r21) {
        if ((r21 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r1 = (AnonymousClass1) r21;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        AnonymousClass1 r6 = r1;
        Object $result = r6.result;
        Object r9 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        boolean value$iv = false;
        switch(r6.label) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        ResultKt.throwOnFailure($result);
    L41:
        return Unit.INSTANCE;
    L13:
        float pageOffsetFraction = r6.F$0;
        int page = r6.I$0;
        AnimationSpec<Float> r8 = (AnimationSpec) r6.L$1;
        PagerState r10 = (PagerState) r6.L$0;
        ResultKt.throwOnFailure($result);
        AnimationSpec<Float> r14 = r8;
        PagerState r11 = r10;
    L29:
        double r12 = pageOffsetFraction;
        if ((-0.5d) > r12) goto L35;
        if (r12 > 0.5d) goto L35;
        value$iv = true;
    L35:
        if (value$iv == true) goto L37;
        InlineClassHelperKt.throwIllegalArgumentException("pageOffsetFraction " + pageOffsetFraction + " is not within the range -0.5 to 0.5");
    L37:
        int targetPage = r11.coerceInPageRange(page);
        float targetPageOffsetToSnappedPosition = pageOffsetFraction * r11.getPageSizeWithSpacing$foundation_release();
        AnonymousClass3 r5 = new AnonymousClass3(r11, targetPage, targetPageOffsetToSnappedPosition, r14, null);
        r6.L$0 = null;
        r6.L$1 = null;
        r6.label = 2;
        if (ScrollableState.scroll$default(r11, null, r5, r6, 1, null) != r9) goto L41;
        return r9;
    L14:
        ResultKt.throwOnFailure($result);
        pageOffsetFraction = r19;
        page = r18;
        if (page != getCurrentPage()) goto L22;
        if (getCurrentPageOffsetFraction() != pageOffsetFraction) goto L19;
        boolean r13 = true;
    L20:
        if (r13 == false) goto L22;
    L24:
        return Unit.INSTANCE;
    L19:
        r13 = false;
    L22:
        if (getPageCount() == 0) goto L24;
        r6.L$0 = this;
        r6.L$1 = r20;
        r6.I$0 = page;
        r6.F$0 = pageOffsetFraction;
        r6.label = 1;
        if (awaitScrollDependencies(r6) != r9) goto L28;
        return r9;
    L28:
        r14 = r20;
        r11 = this;
        goto L29
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new AnonymousClass1(this, r21);
        goto L8
    }

    private final Object awaitScrollDependencies(Continuation<? super Unit> r3) {
        Object r0 = this.awaitLayoutModifier.waitForFirstLayout(r3);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object scroll$suspendImpl(PagerState $this, MutatePriority scrollPriority, Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> r8, Continuation<? super Unit> r9) {
        if ((r9 instanceof C03441) == false) goto L7;
        C03441 r0 = (C03441) r9;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        $this = (PagerState) r0.L$0;
        ResultKt.throwOnFailure($result);
    L23:
        $this.setProgrammaticScrollTargetPage(-1);
        return Unit.INSTANCE;
    L13:
        Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> r6 = (Function2) r0.L$2;
        scrollPriority = (MutatePriority) r0.L$1;
        PagerState $this2 = (PagerState) r0.L$0;
        ResultKt.throwOnFailure($result);
        r8 = r6;
        $this = $this2;
    L18:
        if ($this.isScrollInProgress() == true) goto L20;
        $this.setSettledPageState($this.getCurrentPage());
    L20:
        ScrollableState r3 = $this.scrollableState;
        r0.L$0 = $this;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.label = 2;
        if (r3.scroll(scrollPriority, r8, r0) != r2) goto L23;
        return r2;
    L14:
        ResultKt.throwOnFailure($result);
        r0.L$0 = $this;
        r0.L$1 = scrollPriority;
        r0.L$2 = r8;
        r0.label = 1;
        if ($this.awaitScrollDependencies(r0) != r2) goto L18;
        return r2;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C03441($this, r9);
        goto L8
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float delta) {
        return this.scrollableState.dispatchRawDelta(delta);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    private final void setCanScrollForward(boolean r5) {
        MutableState $this$setValue$iv = this.canScrollForward$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollForward() {
        State $this$getValue$iv = this.canScrollForward$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    private final void setCanScrollBackward(boolean r5) {
        MutableState $this$setValue$iv = this.canScrollBackward$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollBackward() {
        State $this$getValue$iv = this.canScrollBackward$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledForward() {
        return this.isLastScrollForwardState.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledBackward() {
        return this.isLastScrollBackwardState.getValue().booleanValue();
    }

    public static /* synthetic */ void applyMeasureResult$foundation_release$default(PagerState r0, PagerMeasureResult r1, boolean r2, boolean r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 4) == 0) goto L6;
        r3 = false;
    L6:
        r0.applyMeasureResult$foundation_release(r1, r2, r3);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyMeasureResult");
    }

    public final void applyMeasureResult$foundation_release(PagerMeasureResult result, boolean isLookingAhead, boolean visibleItemsStayedTheSame) {
        if (isLookingAhead == true) goto L7;
        if (this.hasLookaheadOccurred == false) goto L7;
        this.approachLayoutInfo = result;
        return;
    L7:
        if (isLookingAhead == false) goto L9;
        this.hasLookaheadOccurred = true;
    L9:
        PagerScrollPosition r0 = this.scrollPosition;
        if (visibleItemsStayedTheSame == false) goto L12;
        r0.updateCurrentPageOffsetFraction(result.getCurrentPageOffsetFraction());
    L13:
        this.pagerLayoutInfoState.setValue(result);
        setCanScrollForward(result.getCanScrollForward());
        setCanScrollBackward(result.getCanScrollBackward());
        MeasuredPage it = result.getFirstVisiblePage();
        if (it == null) goto L16;
        this.firstVisiblePage = it.getIndex();
    L16:
        this.firstVisiblePageOffset = result.getFirstVisiblePageScrollOffset();
        tryRunPrefetch(result);
        this.maxScrollOffset = PagerStateKt.calculateNewMaxScrollOffset(result, getPageCount());
        this.minScrollOffset = PagerStateKt.access$calculateNewMinScrollOffset(result, getPageCount());
        return;
    L12:
        r0.updateFromMeasureResult(result);
        cancelPrefetchIfVisibleItemsChanged(result);
        goto L13
    }

    private final void tryRunPrefetch(PagerMeasureResult result) {
        Snapshot.Companion this_$iv = Snapshot.Companion;
        Snapshot previousSnapshot$iv = this_$iv.getCurrentThreadSnapshot();
        if (previousSnapshot$iv == null) goto L5;
        Function1<Object, Unit> r3 = previousSnapshot$iv.getReadObserver();
    L6:
        Snapshot newSnapshot$iv = this_$iv.makeCurrentNonObservable(previousSnapshot$iv);
    L17:
        th = move-exception;
        this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, r3);
        throw th;
    L8:
        if (Math.abs(this.previousPassDelta) > 0.5f) goto L10;
    L14:
        Unit r5 = Unit.INSTANCE;     // Catch: Throwable -> L17
        this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, r3);
        return;
    L10:
        if (this.prefetchingEnabled == false) goto L14;
        if (isGestureActionMatchesScroll(this.previousPassDelta) == false) goto L14;
        notifyPrefetch(this.previousPassDelta, result);     // Catch: Throwable -> L17
        goto L14
    L5:
        r3 = null;
        goto L6
    }

    private final int coerceInPageRange(int $this$coerceInPageRange) {
        if (getPageCount() > 0) goto L6;
        return 0;
    L6:
        return RangesKt.coerceIn($this$coerceInPageRange, 0, getPageCount() - 1);
    }

    private final boolean isGestureActionMatchesScroll(float scrollDelta) {
        if (getLayoutInfo().getOrientation() != Orientation.Vertical) goto L8;
        float r0 = Math.signum(scrollDelta);
        long arg0$iv = m982getUpDownDifferenceF1C5BW0$foundation_release();
        int bits$iv$iv$iv = (int) (4294967295L & arg0$iv);
        if (r0 != Math.signum(-Float.intBitsToFloat(bits$iv$iv$iv))) goto L7;
        boolean r1 = true;
    L12:
        if (r1 == false) goto L14;
        return true;
    L14:
        if (isNotGestureAction$foundation_release() == false) goto L18;
        return true;
    L18:
        return false;
    L7:
        r1 = false;
        goto L12
    L8:
        float r2 = Math.signum(scrollDelta);
        long arg0$iv2 = m982getUpDownDifferenceF1C5BW0$foundation_release();
        int bits$iv$iv$iv2 = (int) (arg0$iv2 >> 32);
        if (r2 != Math.signum(-Float.intBitsToFloat(bits$iv$iv$iv2))) goto L11;
        r1 = true;
        goto L12
    L11:
        r1 = false;
        goto L12
    }

    public final boolean isNotGestureAction$foundation_release() {
        long arg0$iv = m982getUpDownDifferenceF1C5BW0$foundation_release();
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);
        if (((int) Float.intBitsToFloat(bits$iv$iv$iv)) != 0) goto L7;
        long arg0$iv2 = m982getUpDownDifferenceF1C5BW0$foundation_release();
        int bits$iv$iv$iv2 = (int) (4294967295L & arg0$iv2);
        if (((int) Float.intBitsToFloat(bits$iv$iv$iv2)) != 0) goto L7;
        return true;
    L7:
        return false;
    }

    private final void notifyPrefetch(float delta, PagerLayoutInfo info) {
        if (this.prefetchingEnabled == true) goto L6;
        return;
    L6:
        if (info.getVisiblePagesInfo().isEmpty() == true) goto L40;
        boolean r1 = false;
        if (delta <= 0.0f) goto L10;
        boolean isPrefetchingForward = true;
    L11:
        if (isPrefetchingForward == false) goto L13;
        int indexToPrefetch = (((PageInfo) CollectionsKt.last(info.getVisiblePagesInfo())).getIndex() + info.getBeyondViewportPageCount()) + 1;
    L15:
        if (indexToPrefetch >= 0) goto L17;
    L19:
        if (r1 == true) goto L21;
        return;
    L21:
        if (indexToPrefetch != this.indexToPrefetch) goto L23;
    L28:
        if (isPrefetchingForward == false) goto L34;
        PageInfo lastItem = (PageInfo) CollectionsKt.last(info.getVisiblePagesInfo());
        int pageSize = info.getPageSize() + info.getPageSpacing();
        int distanceToReachNextItem = (lastItem.getOffset() + pageSize) - info.getViewportEndOffset();
        if (distanceToReachNextItem >= delta) goto L42;
        LazyLayoutPrefetchState.PrefetchHandle r5 = this.currentPrefetchHandle;
        if (r5 == null) goto L43;
        r5.markAsUrgent();
        return;
    L43:
        return;
    L42:
        return;
    L34:
        PageInfo firstItem = (PageInfo) CollectionsKt.first(info.getVisiblePagesInfo());
        int distanceToReachNextItem2 = info.getViewportStartOffset() - firstItem.getOffset();
        if (distanceToReachNextItem2 >= (-delta)) goto L45;
        LazyLayoutPrefetchState.PrefetchHandle r4 = this.currentPrefetchHandle;
        if (r4 == null) goto L46;
        r4.markAsUrgent();
        return;
    L46:
        return;
    L45:
        return;
    L23:
        if (this.wasPrefetchingForward == isPrefetchingForward) goto L27;
        LazyLayoutPrefetchState.PrefetchHandle r2 = this.currentPrefetchHandle;
        if (r2 == null) goto L27;
        r2.cancel();
    L27:
        this.wasPrefetchingForward = isPrefetchingForward;
        this.indexToPrefetch = indexToPrefetch;
        this.currentPrefetchHandle = this.prefetchState.m902schedulePrefetch0kLqBqw(indexToPrefetch, this.premeasureConstraints);
        goto L28
    L17:
        if (indexToPrefetch >= getPageCount()) goto L19;
        r1 = true;
        goto L19
    L13:
        indexToPrefetch = (((PageInfo) CollectionsKt.first(info.getVisiblePagesInfo())).getIndex() - info.getBeyondViewportPageCount()) - 1;
        goto L15
    L10:
        isPrefetchingForward = false;
        goto L11
    }

    private final void cancelPrefetchIfVisibleItemsChanged(PagerLayoutInfo info) {
        if (this.indexToPrefetch != (-1)) goto L5;
        return;
    L5:
        if (info.getVisiblePagesInfo().isEmpty() == false) goto L7;
        return;
    L7:
        if (this.wasPrefetchingForward == false) goto L9;
        int expectedPrefetchIndex = (((PageInfo) CollectionsKt.last(info.getVisiblePagesInfo())).getIndex() + info.getBeyondViewportPageCount()) + 1;
    L11:
        if (this.indexToPrefetch == expectedPrefetchIndex) goto L19;
        this.indexToPrefetch = -1;
        LazyLayoutPrefetchState.PrefetchHandle r1 = this.currentPrefetchHandle;
        if (r1 == null) goto L15;
        r1.cancel();
    L15:
        this.currentPrefetchHandle = null;
        return;
    L19:
        return;
    L9:
        expectedPrefetchIndex = (((PageInfo) CollectionsKt.first(info.getVisiblePagesInfo())).getIndex() - info.getBeyondViewportPageCount()) - 1;
        goto L11
    }

    public final float getOffsetDistanceInPages(int page) {
        boolean value$iv = false;
        if (page < 0) goto L8;
        if (page > getPageCount()) goto L8;
        value$iv = true;
    L8:
        if (value$iv == true) goto L11;
        InlineClassHelperKt.throwIllegalArgumentException("page " + page + " is not within the range 0 to " + getPageCount());
    L11:
        return (page - getCurrentPage()) - getCurrentPageOffsetFraction();
    }

    public static /* synthetic */ int matchScrollPositionWithKey$foundation_release$default(PagerState r4, PagerLazyLayoutItemProvider r5, int r6, int r7, Object r8) {
        if (r8 != null) goto L18;
        if ((r7 & 2) == 0) goto L16;
        Snapshot.Companion this_$iv = Snapshot.Companion;
        Snapshot previousSnapshot$iv = this_$iv.getCurrentThreadSnapshot();
        if (previousSnapshot$iv == null) goto L8;
        Function1<Object, Unit> r0 = previousSnapshot$iv.getReadObserver();
    L9:
        Snapshot newSnapshot$iv = this_$iv.makeCurrentNonObservable(previousSnapshot$iv);
        int r3 = r4.scrollPosition.getCurrentPage();     // Catch: Throwable -> L12
        this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, r0);
        r6 = r3;
    L12:
        th = move-exception;
        this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, r0);
        throw th;
    L8:
        r0 = null;
    L16:
        return r4.matchScrollPositionWithKey$foundation_release(r5, r6);
    L18:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: matchScrollPositionWithKey");
    }

    public final int matchScrollPositionWithKey$foundation_release(PagerLazyLayoutItemProvider itemProvider, int currentPage) {
        return this.scrollPosition.matchPageWithKey(itemProvider, currentPage);
    }
}
