package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* JADX INFO: compiled from: AnimateAsState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aH\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0013\u001a\u00020\u00042\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aR\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0013\u001a\u00020\u00042\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001aM\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\b\b\u0002\u0010 \u001a\u00020\u00022\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010!\u001aW\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010\"\u001aC\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010$\u001aM\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010%\u001aH\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u0013\u001a\u00020\b2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001aR\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u0013\u001a\u00020\b2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001aH\u0010+\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u0013\u001a\u00020\n2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010(\u001aR\u0010+\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u0013\u001a\u00020\n2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010*\u001aH\u0010.\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\u0006\u0010\u0013\u001a\u00020\f2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u0010(\u001aR\u0010.\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\u0006\u0010\u0013\u001a\u00020\f2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u0010*\u001aC\u00101\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0002\u00102\u001aM\u00101\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0002\u00103\u001aH\u00104\u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\u0006\u0010\u0013\u001a\u00020\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b5\u0010(\u001aR\u00104\u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\u0006\u0010\u0013\u001a\u00020\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b6\u0010*\u001as\u00107\u001a\b\u0012\u0004\u0012\u0002H80\u0012\"\u0004\b\u0000\u00108\"\b\b\u0001\u00109*\u00020:2\u0006\u0010\u0013\u001a\u0002H82\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u0002H8\u0012\u0004\u0012\u0002H90<2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H80\u00152\n\b\u0002\u0010 \u001a\u0004\u0018\u0001H82\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u0002H8\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010=\u001a}\u00107\u001a\b\u0012\u0004\u0012\u0002H80\u0012\"\u0004\b\u0000\u00108\"\b\b\u0001\u00109*\u00020:2\u0006\u0010\u0013\u001a\u0002H82\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u0002H8\u0012\u0004\u0012\u0002H90<2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H80\u00152\n\b\u0002\u0010 \u001a\u0004\u0018\u0001H82\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u0002H8\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010>\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006?²\u0006(\u0010@\u001a\u0010\u0012\u0004\u0012\u0002H8\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\"\u0004\b\u0000\u00108\"\b\b\u0001\u00109*\u00020:X\u008a\u0084\u0002²\u0006 \u0010A\u001a\b\u0012\u0004\u0012\u0002H80\u0015\"\u0004\b\u0000\u00108\"\b\b\u0001\u00109*\u00020:X\u008a\u0084\u0002"}, d2 = {"defaultAnimation", "Landroidx/compose/animation/core/SpringSpec;", "", "dpDefaultSpring", "Landroidx/compose/ui/unit/Dp;", "intDefaultSpring", "", "intOffsetDefaultSpring", "Landroidx/compose/ui/unit/IntOffset;", "intSizeDefaultSpring", "Landroidx/compose/ui/unit/IntSize;", "offsetDefaultSpring", "Landroidx/compose/ui/geometry/Offset;", "rectDefaultSpring", "Landroidx/compose/ui/geometry/Rect;", "sizeDefaultSpring", "Landroidx/compose/ui/geometry/Size;", "animateDpAsState", "Landroidx/compose/runtime/State;", "targetValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "finishedListener", "Lkotlin/Function1;", "", "animateDpAsState-Kz89ssw", "(FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "label", "", "animateDpAsState-AjpBEmI", "(FLandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateFloatAsState", "visibilityThreshold", "(FLandroidx/compose/animation/core/AnimationSpec;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "(FLandroidx/compose/animation/core/AnimationSpec;FLjava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateIntAsState", "(ILandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "(ILandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateIntOffsetAsState", "animateIntOffsetAsState-8f6pmRE", "(JLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateIntOffsetAsState-HyPO7BM", "(JLandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateIntSizeAsState", "animateIntSizeAsState-zTRF_AQ", "animateIntSizeAsState-4goxYXU", "animateOffsetAsState", "animateOffsetAsState-N6fFfp4", "animateOffsetAsState-7362WCg", "animateRectAsState", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateSizeAsState", "animateSizeAsState-LjSzlW0", "animateSizeAsState-YLp_XPw", "animateValueAsState", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animation-core_release", "listener", "animSpec"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AnimateAsStateKt {
    private static final SpringSpec<Float> defaultAnimation = null;
    private static final SpringSpec<Dp> dpDefaultSpring = null;
    private static final SpringSpec<Integer> intDefaultSpring = null;
    private static final SpringSpec<IntOffset> intOffsetDefaultSpring = null;
    private static final SpringSpec<IntSize> intSizeDefaultSpring = null;
    private static final SpringSpec<Offset> offsetDefaultSpring = null;
    private static final SpringSpec<Rect> rectDefaultSpring = null;
    private static final SpringSpec<Size> sizeDefaultSpring = null;

    public static final /* synthetic */ Function1 access$animateValueAsState$lambda$4(State $listener$delegate) {
        return animateValueAsState$lambda$4($listener$delegate);
    }

    public static final /* synthetic */ AnimationSpec access$animateValueAsState$lambda$6(State $animSpec$delegate) {
        return animateValueAsState$lambda$6($animSpec$delegate);
    }

    static {
        defaultAnimation = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        dpDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Dp.m6971boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Dp.Companion)), 3, null);
        sizeDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Size.m4182boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Size.Companion)), 3, null);
        offsetDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Offset.m4114boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Offset.Companion)), 3, null);
        rectDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion), 3, null);
        intDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Integer.valueOf(VisibilityThresholdsKt.getVisibilityThreshold(IntCompanionObject.INSTANCE)), 3, null);
        intOffsetDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m7092boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 3, null);
        intSizeDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m7136boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 3, null);
    }

    public static final State<Float> animateFloatAsState(float targetValue, AnimationSpec<Float> r17, float visibilityThreshold, String label, Function1<? super Float, Unit> r20, Composer $composer, int $changed, int r23) {
        ComposerKt.sourceInformationMarkerStart($composer, 668842840, "C(animateFloatAsState)P(3!1,4,2)74@3328L173:AnimateAsState.kt#pdpnli");
        if ((r23 & 2) == 0) goto L5;
        AnimationSpec<Float> r10 = defaultAnimation;
    L7:
        if ((r23 & 4) == 0) goto L9;
        float visibilityThreshold2 = 0.01f;
    L11:
        if ((r23 & 8) == 0) goto L13;
        String label2 = "FloatAnimation";
    L15:
        if ((r23 & 16) == 0) goto L17;
        Function1<? super Float, Unit> r5 = null;
    L19:
        if (ComposerKt.isTraceInProgress() == false) goto L22;
        ComposerKt.traceEventStart(668842840, $changed, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:67)");
    L22:
        if (r10 != defaultAnimation) goto L39;
        $composer.startReplaceGroup(1125558999);
        ComposerKt.sourceInformation($composer, "70@3180L83");
        ComposerKt.sourceInformationMarkerStart($composer, 313403443, "CC(remember):AnimateAsState.kt#9igjgp");
        if ((($changed & 896) ^ 384) <= 256) goto L28;
        if ($composer.changed(visibilityThreshold2) == false) goto L28;
    L29:
        boolean invalid$iv = true;
    L31:
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L34;
    L37:
        Object value$iv = AnimationSpecKt.spring$default(0.0f, 0.0f, Float.valueOf(visibilityThreshold2), 3, null);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L38:
        ComposerKt.sourceInformationMarkerEnd($composer);
        $composer.endReplaceGroup();
        AnimationSpec<Float> r2 = (SpringSpec) it$iv;
    L40:
        State<Float> r0 = animateValueAsState(Float.valueOf(targetValue), VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), r2, Float.valueOf(visibilityThreshold2), label2, r5, $composer, ((($changed & 14) | (($changed << 3) & 7168)) | (($changed << 3) & 57344)) | (($changed << 3) & 458752), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L43;
        ComposerKt.traceEventEnd();
    L43:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    L34:
        if (it$iv != Composer.Companion.getEmpty()) goto L38;
    L28:
        if (($changed & 384) == 256) goto L29;
        invalid$iv = false;
        goto L31
    L39:
        $composer.startReplaceGroup(1125668925);
        $composer.endReplaceGroup();
        r2 = r10;
        goto L40
    L17:
        r5 = r20;
        goto L19
    L13:
        label2 = label;
        goto L15
    L9:
        visibilityThreshold2 = visibilityThreshold;
        goto L11
    L5:
        r10 = r17;
        goto L7
    }

    /* JADX INFO: renamed from: animateDpAsState-AjpBEmI, reason: not valid java name */
    public static final State<Dp> m124animateDpAsStateAjpBEmI(float targetValue, AnimationSpec<Dp> r13, String label, Function1<? super Dp, Unit> r15, Composer $composer, int $changed, int r18) {
        ComposerKt.sourceInformationMarkerStart($composer, -1407150062, "C(animateDpAsState)P(3:c#ui.unit.Dp!1,2)112@5028L165:AnimateAsState.kt#pdpnli");
        if ((r18 & 2) == 0) goto L5;
        AnimationSpec animationSpec = dpDefaultSpring;
        AnimationSpec<Dp> r5 = animationSpec;
    L7:
        if ((r18 & 4) == 0) goto L9;
        String label2 = "DpAnimation";
    L11:
        if ((r18 & 8) == 0) goto L13;
        Function1<? super Dp, Unit> r8 = null;
    L15:
        if (ComposerKt.isTraceInProgress() == false) goto L17;
        ComposerKt.traceEventStart(-1407150062, $changed, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:111)");
    L17:
        State<Dp> r14 = animateValueAsState(Dp.m6971boximpl(targetValue), VectorConvertersKt.getVectorConverter(Dp.Companion), r5, null, label2, r8, $composer, ((($changed & 14) | (($changed << 3) & 896)) | (($changed << 6) & 57344)) | (458752 & ($changed << 6)), 8);
        if (ComposerKt.isTraceInProgress() == false) goto L20;
        ComposerKt.traceEventEnd();
    L20:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r14;
    L13:
        r8 = r15;
        goto L15
    L9:
        label2 = label;
        goto L11
    L5:
        r5 = r13;
        goto L7
    }

    /* JADX INFO: renamed from: animateSizeAsState-YLp_XPw, reason: not valid java name */
    public static final State<Size> m133animateSizeAsStateYLp_XPw(long targetValue, AnimationSpec<Size> r14, String label, Function1<? super Size, Unit> r16, Composer $composer, int $changed, int r19) {
        ComposerKt.sourceInformationMarkerStart($composer, 1374633148, "C(animateSizeAsState)P(3:c#ui.geometry.Size!1,2)153@6865L167:AnimateAsState.kt#pdpnli");
        if ((r19 & 2) == 0) goto L5;
        AnimationSpec animationSpec = sizeDefaultSpring;
        AnimationSpec<Size> r5 = animationSpec;
    L7:
        if ((r19 & 4) == 0) goto L9;
        String label2 = "SizeAnimation";
    L11:
        if ((r19 & 8) == 0) goto L13;
        Function1<? super Size, Unit> r8 = null;
    L15:
        if (ComposerKt.isTraceInProgress() == false) goto L17;
        ComposerKt.traceEventStart(1374633148, $changed, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:152)");
    L17:
        State<Size> r15 = animateValueAsState(Size.m4182boximpl(targetValue), VectorConvertersKt.getVectorConverter(Size.Companion), r5, null, label2, r8, $composer, ((($changed & 14) | (($changed << 3) & 896)) | (($changed << 6) & 57344)) | (458752 & ($changed << 6)), 8);
        if (ComposerKt.isTraceInProgress() == false) goto L20;
        ComposerKt.traceEventEnd();
    L20:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r15;
    L13:
        r8 = r16;
        goto L15
    L9:
        label2 = label;
        goto L11
    L5:
        r5 = r14;
        goto L7
    }

    /* JADX INFO: renamed from: animateOffsetAsState-7362WCg, reason: not valid java name */
    public static final State<Offset> m130animateOffsetAsState7362WCg(long targetValue, AnimationSpec<Offset> r14, String label, Function1<? super Offset, Unit> r16, Composer $composer, int $changed, int r19) {
        ComposerKt.sourceInformationMarkerStart($composer, 357896800, "C(animateOffsetAsState)P(3:c#ui.geometry.Offset!1,2)192@8685L169:AnimateAsState.kt#pdpnli");
        if ((r19 & 2) == 0) goto L5;
        AnimationSpec animationSpec = offsetDefaultSpring;
        AnimationSpec<Offset> r5 = animationSpec;
    L7:
        if ((r19 & 4) == 0) goto L9;
        String label2 = "OffsetAnimation";
    L11:
        if ((r19 & 8) == 0) goto L13;
        Function1<? super Offset, Unit> r8 = null;
    L15:
        if (ComposerKt.isTraceInProgress() == false) goto L17;
        ComposerKt.traceEventStart(357896800, $changed, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:191)");
    L17:
        State<Offset> r15 = animateValueAsState(Offset.m4114boximpl(targetValue), VectorConvertersKt.getVectorConverter(Offset.Companion), r5, null, label2, r8, $composer, ((($changed & 14) | (($changed << 3) & 896)) | (($changed << 6) & 57344)) | (458752 & ($changed << 6)), 8);
        if (ComposerKt.isTraceInProgress() == false) goto L20;
        ComposerKt.traceEventEnd();
    L20:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r15;
    L13:
        r8 = r16;
        goto L15
    L9:
        label2 = label;
        goto L11
    L5:
        r5 = r14;
        goto L7
    }

    public static final State<Rect> animateRectAsState(Rect targetValue, AnimationSpec<Rect> r13, String label, Function1<? super Rect, Unit> r15, Composer $composer, int $changed, int r18) {
        ComposerKt.sourceInformationMarkerStart($composer, 536062978, "C(animateRectAsState)P(3!1,2)233@10537L167:AnimateAsState.kt#pdpnli");
        if ((r18 & 2) == 0) goto L5;
        AnimationSpec animationSpec = rectDefaultSpring;
        AnimationSpec<Rect> r5 = animationSpec;
    L7:
        if ((r18 & 4) == 0) goto L9;
        String label2 = "RectAnimation";
    L11:
        if ((r18 & 8) == 0) goto L13;
        Function1<? super Rect, Unit> r8 = null;
    L15:
        if (ComposerKt.isTraceInProgress() == false) goto L17;
        ComposerKt.traceEventStart(536062978, $changed, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:232)");
    L17:
        State<Rect> r14 = animateValueAsState(targetValue, VectorConvertersKt.getVectorConverter(Rect.Companion), r5, null, label2, r8, $composer, ((($changed & 14) | (($changed << 3) & 896)) | (($changed << 6) & 57344)) | (458752 & ($changed << 6)), 8);
        if (ComposerKt.isTraceInProgress() == false) goto L20;
        ComposerKt.traceEventEnd();
    L20:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r14;
    L13:
        r8 = r15;
        goto L15
    L9:
        label2 = label;
        goto L11
    L5:
        r5 = r13;
        goto L7
    }

    public static final State<Integer> animateIntAsState(int targetValue, AnimationSpec<Integer> r13, String label, Function1<? super Integer, Unit> r15, Composer $composer, int $changed, int r18) {
        ComposerKt.sourceInformationMarkerStart($composer, 428074472, "C(animateIntAsState)P(3!1,2)271@12257L166:AnimateAsState.kt#pdpnli");
        if ((r18 & 2) == 0) goto L5;
        AnimationSpec animationSpec = intDefaultSpring;
        AnimationSpec<Integer> r5 = animationSpec;
    L7:
        if ((r18 & 4) == 0) goto L9;
        String label2 = "IntAnimation";
    L11:
        if ((r18 & 8) == 0) goto L13;
        Function1<? super Integer, Unit> r8 = null;
    L15:
        if (ComposerKt.isTraceInProgress() == false) goto L17;
        ComposerKt.traceEventStart(428074472, $changed, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:270)");
    L17:
        State<Integer> r14 = animateValueAsState(Integer.valueOf(targetValue), VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), r5, null, label2, r8, $composer, ((($changed & 14) | (($changed << 3) & 896)) | (($changed << 6) & 57344)) | (458752 & ($changed << 6)), 8);
        if (ComposerKt.isTraceInProgress() == false) goto L20;
        ComposerKt.traceEventEnd();
    L20:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r14;
    L13:
        r8 = r15;
        goto L15
    L9:
        label2 = label;
        goto L11
    L5:
        r5 = r13;
        goto L7
    }

    /* JADX INFO: renamed from: animateIntOffsetAsState-HyPO7BM, reason: not valid java name */
    public static final State<IntOffset> m127animateIntOffsetAsStateHyPO7BM(long targetValue, AnimationSpec<IntOffset> r14, String label, Function1<? super IntOffset, Unit> r16, Composer $composer, int $changed, int r19) {
        ComposerKt.sourceInformationMarkerStart($composer, -696782904, "C(animateIntOffsetAsState)P(3:c#ui.unit.IntOffset!1,2)310@14105L172:AnimateAsState.kt#pdpnli");
        if ((r19 & 2) == 0) goto L5;
        AnimationSpec animationSpec = intOffsetDefaultSpring;
        AnimationSpec<IntOffset> r5 = animationSpec;
    L7:
        if ((r19 & 4) == 0) goto L9;
        String label2 = "IntOffsetAnimation";
    L11:
        if ((r19 & 8) == 0) goto L13;
        Function1<? super IntOffset, Unit> r8 = null;
    L15:
        if (ComposerKt.isTraceInProgress() == false) goto L17;
        ComposerKt.traceEventStart(-696782904, $changed, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:309)");
    L17:
        State<IntOffset> r15 = animateValueAsState(IntOffset.m7092boximpl(targetValue), VectorConvertersKt.getVectorConverter(IntOffset.Companion), r5, null, label2, r8, $composer, ((($changed & 14) | (($changed << 3) & 896)) | (($changed << 6) & 57344)) | (458752 & ($changed << 6)), 8);
        if (ComposerKt.isTraceInProgress() == false) goto L20;
        ComposerKt.traceEventEnd();
    L20:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r15;
    L13:
        r8 = r16;
        goto L15
    L9:
        label2 = label;
        goto L11
    L5:
        r5 = r14;
        goto L7
    }

    /* JADX INFO: renamed from: animateIntSizeAsState-4goxYXU, reason: not valid java name */
    public static final State<IntSize> m128animateIntSizeAsState4goxYXU(long targetValue, AnimationSpec<IntSize> r14, String label, Function1<? super IntSize, Unit> r16, Composer $composer, int $changed, int r19) {
        ComposerKt.sourceInformationMarkerStart($composer, 582576328, "C(animateIntSizeAsState)P(3:c#ui.unit.IntSize!1,2)348@15880L170:AnimateAsState.kt#pdpnli");
        if ((r19 & 2) == 0) goto L5;
        AnimationSpec animationSpec = intSizeDefaultSpring;
        AnimationSpec<IntSize> r5 = animationSpec;
    L7:
        if ((r19 & 4) == 0) goto L9;
        String label2 = "IntSizeAnimation";
    L11:
        if ((r19 & 8) == 0) goto L13;
        Function1<? super IntSize, Unit> r8 = null;
    L15:
        if (ComposerKt.isTraceInProgress() == false) goto L17;
        ComposerKt.traceEventStart(582576328, $changed, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:347)");
    L17:
        State<IntSize> r15 = animateValueAsState(IntSize.m7136boximpl(targetValue), VectorConvertersKt.getVectorConverter(IntSize.Companion), r5, null, label2, r8, $composer, ((($changed & 14) | (($changed << 3) & 896)) | (($changed << 6) & 57344)) | (458752 & ($changed << 6)), 8);
        if (ComposerKt.isTraceInProgress() == false) goto L20;
        ComposerKt.traceEventEnd();
    L20:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r15;
    L13:
        r8 = r16;
        goto L15
    L9:
        label2 = label;
        goto L11
    L5:
        r5 = r14;
        goto L7
    }

    public static final <T, V extends AnimationVector> State<T> animateValueAsState(final T r22, TwoWayConverter<T, V> r23, AnimationSpec<T> r24, T r25, String label, Function1<? super T, Unit> r27, Composer $composer, int $changed, int r30) {
        ComposerKt.sourceInformationMarkerStart($composer, -1994373980, "C(animateValueAsState)P(3,4!1,5,2)391@17983L21,397@18165L44,398@18231L79,399@18331L38,401@18416L428,414@18863L42,415@18921L32,415@18910L43,416@18982L697,416@18958L721:AnimateAsState.kt#pdpnli");
        if ((r30 & 4) == 0) goto L9;
        ComposerKt.sourceInformationMarkerStart($composer, 728505056, "CC(remember):AnimateAsState.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L8;
        Object value$iv = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        SpringSpec r4 = (SpringSpec) it$iv;
    L11:
        if ((r30 & 8) == 0) goto L13;
        Object visibilityThreshold = null;
    L15:
        if ((r30 & 16) == 0) goto L17;
        String label2 = "ValueAnimation";
    L19:
        if ((r30 & 32) == 0) goto L21;
        Function1<? super T, Unit> r9 = null;
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventStart(-1994373980, $changed, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:395)");
    L25:
        ComposerKt.sourceInformationMarkerStart($composer, 728510903, "CC(remember):AnimateAsState.kt#9igjgp");
        Object it$iv2 = $composer.rememberedValue();
        if (it$iv2 != Composer.Companion.getEmpty()) goto L29;
        Object value$iv2 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        $composer.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L29:
        MutableState toolingOverride = (MutableState) it$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, 728513050, "CC(remember):AnimateAsState.kt#9igjgp");
        Object it$iv3 = $composer.rememberedValue();
        if (it$iv3 != Composer.Companion.getEmpty()) goto L33;
        Object value$iv3 = new Animatable(r22, r23, visibilityThreshold, label2);
        $composer.updateRememberedValue(value$iv3);
        it$iv3 = value$iv3;
    L33:
        Animatable animatable = (Animatable) it$iv3;
        ComposerKt.sourceInformationMarkerEnd($composer);
        State listener$delegate = SnapshotStateKt.rememberUpdatedState(r9, $composer, ($changed >> 15) & 14);
        AnimationSpec<T> r11 = r4;
        if (visibilityThreshold != null) goto L36;
    L40:
        SpringSpec r13 = r11;
    L41:
        State animSpec$delegate = SnapshotStateKt.rememberUpdatedState(r13, $composer, 0);
        ComposerKt.sourceInformationMarkerStart($composer, 728533237, "CC(remember):AnimateAsState.kt#9igjgp");
        Object it$iv4 = $composer.rememberedValue();
        if (it$iv4 != Composer.Companion.getEmpty()) goto L45;
        Object value$iv4 = ChannelKt.Channel$default(-1, null, null, 6, null);
        $composer.updateRememberedValue(value$iv4);
        it$iv4 = value$iv4;
    L45:
        final Channel channel = (Channel) it$iv4;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, 728535083, "CC(remember):AnimateAsState.kt#9igjgp");
        boolean r5 = $composer.changedInstance(channel);
        if ((6 ^ ($changed & 14)) <= 4) goto L50;
        if ($composer.changedInstance(r22) == false) goto L50;
    L51:
        boolean r3 = true;
    L53:
        boolean invalid$iv = r3 | r5;
        Object it$iv5 = $composer.rememberedValue();
        if (invalid$iv == false) goto L56;
    L59:
        Object value$iv5 = (Function0) new AnimateAsStateKt$animateValueAsState$2$1(channel, r22);
        $composer.updateRememberedValue(value$iv5);
        it$iv5 = value$iv5;
    L60:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.SideEffect((Function0) it$iv5, $composer, 0);
        ComposerKt.sourceInformationMarkerStart($composer, 728537700, "CC(remember):AnimateAsState.kt#9igjgp");
        boolean invalid$iv2 = (($composer.changedInstance(channel) | $composer.changedInstance(animatable)) | $composer.changed(animSpec$delegate)) | $composer.changed(listener$delegate);
        Object it$iv6 = $composer.rememberedValue();
        if (invalid$iv2 == false) goto L63;
    L66:
        Animatable animatable2 = animatable;
        Object value$iv6 = (Function2) new AnimateAsStateKt$animateValueAsState$3$1(channel, animatable2, animSpec$delegate, listener$delegate, null);
        $composer.updateRememberedValue(value$iv6);
        it$iv6 = value$iv6;
    L67:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.LaunchedEffect(channel, (Function2) it$iv6, $composer, 0);
        State<T> r6 = (State) toolingOverride.getValue();
        if (r6 != null) goto L71;
        r6 = animatable2.asState();
    L71:
        if (ComposerKt.isTraceInProgress() == false) goto L73;
        ComposerKt.traceEventEnd();
    L73:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r6;
    L63:
        if (it$iv6 == Composer.Companion.getEmpty()) goto L66;
        animatable2 = animatable;
        goto L67
    L56:
        if (it$iv5 != Composer.Companion.getEmpty()) goto L60;
    L50:
        if (($changed & 6) == 4) goto L51;
        r3 = false;
        goto L53
    L36:
        if ((r11 instanceof SpringSpec) == false) goto L40;
        if (Intrinsics.areEqual(((SpringSpec) r11).getVisibilityThreshold(), visibilityThreshold) == true) goto L40;
        r13 = AnimationSpecKt.spring(((SpringSpec) r11).getDampingRatio(), ((SpringSpec) r11).getStiffness(), visibilityThreshold);
        goto L41
    L21:
        r9 = r27;
        goto L23
    L17:
        label2 = label;
        goto L19
    L13:
        visibilityThreshold = r25;
        goto L15
    L9:
        r4 = r24;
        goto L11
    }

    private static final <T> Function1<T, Unit> animateValueAsState$lambda$4(State<? extends Function1<? super T, Unit>> r4) {
        Object thisObj$iv = r4.getValue();
        return (Function1) thisObj$iv;
    }

    private static final <T> AnimationSpec<T> animateValueAsState$lambda$6(State<? extends AnimationSpec<T>> r4) {
        return r4.getValue();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final /* synthetic */ State animateFloatAsState(float targetValue, AnimationSpec animationSpec, float visibilityThreshold, Function1 finishedListener, Composer $composer, int $changed, int r15) {
        ComposerKt.sourceInformationMarkerStart($composer, 1091643291, "C(animateFloatAsState)P(2!1,3)446@20095L143:AnimateAsState.kt#pdpnli");
        if ((r15 & 2) == 0) goto L5;
        AnimationSpec animationSpec2 = defaultAnimation;
        AnimationSpec animationSpec3 = animationSpec2;
    L7:
        if ((r15 & 4) == 0) goto L9;
        float visibilityThreshold2 = 0.01f;
    L11:
        if ((r15 & 8) == 0) goto L13;
        Function1 finishedListener2 = null;
    L15:
        if (ComposerKt.isTraceInProgress() == false) goto L17;
        ComposerKt.traceEventStart(1091643291, $changed, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:446)");
    L17:
        State<Float> r9 = animateFloatAsState(targetValue, animationSpec3, visibilityThreshold2, null, finishedListener2, $composer, ((($changed & 14) | ($changed & 112)) | ($changed & 896)) | (($changed << 3) & 57344), 8);
        if (ComposerKt.isTraceInProgress() == false) goto L20;
        ComposerKt.traceEventEnd();
    L20:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r9;
    L13:
        finishedListener2 = finishedListener;
        goto L15
    L9:
        visibilityThreshold2 = visibilityThreshold;
        goto L11
    L5:
        animationSpec3 = animationSpec;
        goto L7
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    /* JADX INFO: renamed from: animateDpAsState-Kz89ssw, reason: not valid java name */
    public static final /* synthetic */ State m125animateDpAsStateKz89ssw(float targetValue, AnimationSpec animationSpec, Function1 finishedListener, Composer $composer, int $changed, int r15) {
        ComposerKt.sourceInformationMarkerStart($composer, 704104481, "C(animateDpAsState)P(2:c#ui.unit.Dp)463@20546L142:AnimateAsState.kt#pdpnli");
        if ((r15 & 2) == 0) goto L5;
        AnimationSpec animationSpec2 = dpDefaultSpring;
        AnimationSpec animationSpec3 = animationSpec2;
    L7:
        if ((r15 & 4) == 0) goto L9;
        Function1 finishedListener2 = null;
    L11:
        if (ComposerKt.isTraceInProgress() == false) goto L13;
        ComposerKt.traceEventStart(704104481, $changed, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:462)");
    L13:
        State r11 = animateValueAsState(Dp.m6971boximpl(targetValue), VectorConvertersKt.getVectorConverter(Dp.Companion), animationSpec3, null, null, finishedListener2, $composer, (($changed & 14) | (($changed << 3) & 896)) | (($changed << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
    L16:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r11;
    L9:
        finishedListener2 = finishedListener;
        goto L11
    L5:
        animationSpec3 = animationSpec;
        goto L7
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    /* JADX INFO: renamed from: animateSizeAsState-LjSzlW0, reason: not valid java name */
    public static final /* synthetic */ State m132animateSizeAsStateLjSzlW0(long targetValue, AnimationSpec animationSpec, Function1 finishedListener, Composer $composer, int $changed, int r18) {
        ComposerKt.sourceInformationMarkerStart($composer, 875212471, "C(animateSizeAsState)P(2:c#ui.geometry.Size)481@21010L144:AnimateAsState.kt#pdpnli");
        if ((r18 & 2) == 0) goto L5;
        AnimationSpec animationSpec2 = sizeDefaultSpring;
        AnimationSpec animationSpec3 = animationSpec2;
    L7:
        if ((r18 & 4) == 0) goto L9;
        Function1 finishedListener2 = null;
    L11:
        if (ComposerKt.isTraceInProgress() == false) goto L13;
        ComposerKt.traceEventStart(875212471, $changed, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:480)");
    L13:
        State r14 = animateValueAsState(Size.m4182boximpl(targetValue), VectorConvertersKt.getVectorConverter(Size.Companion), animationSpec3, null, null, finishedListener2, $composer, (($changed & 14) | (($changed << 3) & 896)) | (($changed << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
    L16:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r14;
    L9:
        finishedListener2 = finishedListener;
        goto L11
    L5:
        animationSpec3 = animationSpec;
        goto L7
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    /* JADX INFO: renamed from: animateOffsetAsState-N6fFfp4, reason: not valid java name */
    public static final /* synthetic */ State m131animateOffsetAsStateN6fFfp4(long targetValue, AnimationSpec animationSpec, Function1 finishedListener, Composer $composer, int $changed, int r18) {
        ComposerKt.sourceInformationMarkerStart($composer, -456513133, "C(animateOffsetAsState)P(2:c#ui.geometry.Offset)499@21488L146:AnimateAsState.kt#pdpnli");
        if ((r18 & 2) == 0) goto L5;
        AnimationSpec animationSpec2 = offsetDefaultSpring;
        AnimationSpec animationSpec3 = animationSpec2;
    L7:
        if ((r18 & 4) == 0) goto L9;
        Function1 finishedListener2 = null;
    L11:
        if (ComposerKt.isTraceInProgress() == false) goto L13;
        ComposerKt.traceEventStart(-456513133, $changed, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:498)");
    L13:
        State r14 = animateValueAsState(Offset.m4114boximpl(targetValue), VectorConvertersKt.getVectorConverter(Offset.Companion), animationSpec3, null, null, finishedListener2, $composer, (($changed & 14) | (($changed << 3) & 896)) | (($changed << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
    L16:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r14;
    L9:
        finishedListener2 = finishedListener;
        goto L11
    L5:
        animationSpec3 = animationSpec;
        goto L7
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final /* synthetic */ State animateRectAsState(Rect targetValue, AnimationSpec animationSpec, Function1 finishedListener, Composer $composer, int $changed, int r15) {
        ComposerKt.sourceInformationMarkerStart($composer, -782613967, "C(animateRectAsState)P(2)517@21956L144:AnimateAsState.kt#pdpnli");
        if ((r15 & 2) == 0) goto L5;
        AnimationSpec animationSpec2 = rectDefaultSpring;
        AnimationSpec animationSpec3 = animationSpec2;
    L7:
        if ((r15 & 4) == 0) goto L9;
        Function1 finishedListener2 = null;
    L11:
        if (ComposerKt.isTraceInProgress() == false) goto L13;
        ComposerKt.traceEventStart(-782613967, $changed, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:516)");
    L13:
        State r10 = animateValueAsState(targetValue, VectorConvertersKt.getVectorConverter(Rect.Companion), animationSpec3, null, null, finishedListener2, $composer, (($changed & 14) | (($changed << 3) & 896)) | (($changed << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
    L16:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r10;
    L9:
        finishedListener2 = finishedListener;
        goto L11
    L5:
        animationSpec3 = animationSpec;
        goto L7
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final /* synthetic */ State animateIntAsState(int targetValue, AnimationSpec animationSpec, Function1 finishedListener, Composer $composer, int $changed, int r15) {
        ComposerKt.sourceInformationMarkerStart($composer, -842612981, "C(animateIntAsState)P(2)535@22416L143:AnimateAsState.kt#pdpnli");
        if ((r15 & 2) == 0) goto L5;
        AnimationSpec animationSpec2 = intDefaultSpring;
        AnimationSpec animationSpec3 = animationSpec2;
    L7:
        if ((r15 & 4) == 0) goto L9;
        Function1 finishedListener2 = null;
    L11:
        if (ComposerKt.isTraceInProgress() == false) goto L13;
        ComposerKt.traceEventStart(-842612981, $changed, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:534)");
    L13:
        State r11 = animateValueAsState(Integer.valueOf(targetValue), VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), animationSpec3, null, null, finishedListener2, $composer, (($changed & 14) | (($changed << 3) & 896)) | (($changed << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
    L16:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r11;
    L9:
        finishedListener2 = finishedListener;
        goto L11
    L5:
        animationSpec3 = animationSpec;
        goto L7
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    /* JADX INFO: renamed from: animateIntOffsetAsState-8f6pmRE, reason: not valid java name */
    public static final /* synthetic */ State m126animateIntOffsetAsState8f6pmRE(long targetValue, AnimationSpec animationSpec, Function1 finishedListener, Composer $composer, int $changed, int r18) {
        ComposerKt.sourceInformationMarkerStart($composer, 1010307371, "C(animateIntOffsetAsState)P(2:c#ui.unit.IntOffset)553@22911L149:AnimateAsState.kt#pdpnli");
        if ((r18 & 2) == 0) goto L5;
        AnimationSpec animationSpec2 = intOffsetDefaultSpring;
        AnimationSpec animationSpec3 = animationSpec2;
    L7:
        if ((r18 & 4) == 0) goto L9;
        Function1 finishedListener2 = null;
    L11:
        if (ComposerKt.isTraceInProgress() == false) goto L13;
        ComposerKt.traceEventStart(1010307371, $changed, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:552)");
    L13:
        State r14 = animateValueAsState(IntOffset.m7092boximpl(targetValue), VectorConvertersKt.getVectorConverter(IntOffset.Companion), animationSpec3, null, null, finishedListener2, $composer, (($changed & 14) | (($changed << 3) & 896)) | (($changed << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
    L16:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r14;
    L9:
        finishedListener2 = finishedListener;
        goto L11
    L5:
        animationSpec3 = animationSpec;
        goto L7
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    /* JADX INFO: renamed from: animateIntSizeAsState-zTRF_AQ, reason: not valid java name */
    public static final /* synthetic */ State m129animateIntSizeAsStatezTRF_AQ(long targetValue, AnimationSpec animationSpec, Function1 finishedListener, Composer $composer, int $changed, int r18) {
        ComposerKt.sourceInformationMarkerStart($composer, -1749239765, "C(animateIntSizeAsState)P(2:c#ui.unit.IntSize)571@23400L147:AnimateAsState.kt#pdpnli");
        if ((r18 & 2) == 0) goto L5;
        AnimationSpec animationSpec2 = intSizeDefaultSpring;
        AnimationSpec animationSpec3 = animationSpec2;
    L7:
        if ((r18 & 4) == 0) goto L9;
        Function1 finishedListener2 = null;
    L11:
        if (ComposerKt.isTraceInProgress() == false) goto L13;
        ComposerKt.traceEventStart(-1749239765, $changed, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:570)");
    L13:
        State r14 = animateValueAsState(IntSize.m7136boximpl(targetValue), VectorConvertersKt.getVectorConverter(IntSize.Companion), animationSpec3, null, null, finishedListener2, $composer, (($changed & 14) | (($changed << 3) & 896)) | (($changed << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
    L16:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r14;
    L9:
        finishedListener2 = finishedListener;
        goto L11
    L5:
        animationSpec3 = animationSpec;
        goto L7
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final /* synthetic */ State animateValueAsState(Object targetValue, TwoWayConverter typeConverter, AnimationSpec animationSpec, Object visibilityThreshold, Function1 finishedListener, Composer $composer, int $changed, int r19) {
        ComposerKt.sourceInformationMarkerStart($composer, -846382129, "C(animateValueAsState)P(2,3!1,4)587@23837L21,591@23958L268:AnimateAsState.kt#pdpnli");
        if ((r19 & 4) == 0) goto L9;
        ComposerKt.sourceInformationMarkerStart($composer, 728692384, "CC(remember):AnimateAsState.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L8;
        Object value$iv = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L8:
        AnimationSpec animationSpec2 = (SpringSpec) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        AnimationSpec animationSpec3 = animationSpec2;
    L11:
        if ((r19 & 8) == 0) goto L13;
        Object visibilityThreshold2 = null;
    L15:
        if ((r19 & 16) == 0) goto L17;
        Function1 finishedListener2 = null;
    L19:
        if (ComposerKt.isTraceInProgress() == false) goto L21;
        ComposerKt.traceEventStart(-846382129, $changed, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:591)");
    L21:
        State r14 = animateValueAsState(targetValue, typeConverter, animationSpec3, visibilityThreshold2, "ValueAnimation", finishedListener2, $composer, ((((((($changed & 8) | 24576) | ($changed & 14)) | ($changed & 112)) | ($changed & 896)) | (($changed & 8) << 9)) | ($changed & 7168)) | (($changed << 3) & 458752), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L24;
        ComposerKt.traceEventEnd();
    L24:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r14;
    L17:
        finishedListener2 = finishedListener;
        goto L19
    L13:
        visibilityThreshold2 = visibilityThreshold;
        goto L15
    L9:
        animationSpec3 = animationSpec;
        goto L11
    }
}
