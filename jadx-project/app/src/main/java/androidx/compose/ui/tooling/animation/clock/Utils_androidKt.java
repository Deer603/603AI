package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.core.Animation;
import androidx.compose.animation.core.AnimationKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.tooling.animation.states.TargetState;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Utils.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\u001a\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0000\u001a5\u0010\n\u001a\n\u0012\u0004\u0012\u0002H\f\u0018\u00010\u000b\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u0002H\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0002\u0010\u0011\u001a&\u0010\u0012\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0013R\u0006\u0012\u0002\b\u00030\u00140\u0001*\u0006\u0012\u0002\b\u00030\u0014H\u0000\u001aH\u0010\u0015\u001a\u00020\u0016\"\u0004\b\u0000\u0010\f\"\b\b\u0001\u0010\u0017*\u00020\u0018*\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u00170\u00192\u0006\u0010\u001a\u001a\u00020\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\f0\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u0006H\u0000\u001a>\u0010\u0015\u001a\u00020\u0016\"\u0004\b\u0000\u0010\f\"\b\b\u0001\u0010\u0017*\u00020\u0018*\u0012\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u00170\u001eR\u00020\u001f2\b\b\u0002\u0010\u001d\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0000\u001aB\u0010\u0015\u001a\u00020\u0016\"\u0004\b\u0000\u0010\f\"\b\b\u0001\u0010\u0017*\u00020\u0018\"\u0004\b\u0002\u0010!*\u0018\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u00170\u0013R\b\u0012\u0004\u0012\u0002H!0\u00142\b\b\u0002\u0010\u001d\u001a\u00020\u0006H\u0000\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\"²\u0006\u001a\u0010#\u001a\u00020\u0006\"\u0004\b\u0000\u0010\f\"\b\b\u0001\u0010\u0017*\u00020\u0018X\u008a\u0084\u0002²\u0006&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\f0%\"\u0004\b\u0000\u0010\f\"\b\b\u0001\u0010\u0017*\u00020\u0018X\u008a\u0084\u0002²\u0006&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\f0%\"\u0004\b\u0000\u0010\f\"\b\b\u0001\u0010\u0017*\u00020\u0018X\u008a\u0084\u0002"}, d2 = {"IGNORE_TRANSITIONS", "", "", "getIGNORE_TRANSITIONS", "()Ljava/util/List;", "millisToNanos", "", "timeMs", "nanosToMillis", "timeNs", "parseParametersToValue", "Landroidx/compose/ui/tooling/animation/states/TargetState;", "T", "currentValue", "par1", "", "par2", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/ui/tooling/animation/states/TargetState;", "allAnimations", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "Landroidx/compose/animation/core/Transition;", "createTransitionInfo", "Landroidx/compose/animation/tooling/TransitionInfo;", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/Animation;", "label", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "stepMs", "Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;", "Landroidx/compose/animation/core/InfiniteTransition;", "endTimeMs", "S", "ui-tooling_release", "startTimeMs", "values", ""}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Utils_androidKt {
    private static final List<String> IGNORE_TRANSITIONS = null;

    public static final /* synthetic */ long access$createTransitionInfo$lambda$1(Lazy $startTimeMs$delegate) {
        return createTransitionInfo$lambda$1($startTimeMs$delegate);
    }

    static {
        IGNORE_TRANSITIONS = CollectionsKt.listOf("TransformOriginInterruptionHandling");
    }

    public static final List<String> getIGNORE_TRANSITIONS() {
        return IGNORE_TRANSITIONS;
    }

    public static final long nanosToMillis(long timeNs) {
        return (999999 + timeNs) / AnimationKt.MillisToNanos;
    }

    public static final long millisToNanos(long timeMs) {
        return AnimationKt.MillisToNanos * timeMs;
    }

    public static final List<Transition<?>.TransitionAnimationState<?, ?>> allAnimations(Transition<?> r9) {
        Iterable $this$flatMap$iv = r9.getTransitions();
        Collection destination$iv$iv = new ArrayList();
        Iterator r5 = $this$flatMap$iv.iterator();
    L4:
        if (r5.hasNext() == false) goto L6;
        Object element$iv$iv = r5.next();
        Transition it = (Transition) element$iv$iv;
        Iterable list$iv$iv = allAnimations(it);
        CollectionsKt.addAll(destination$iv$iv, list$iv$iv);
        goto L4
    L6:
        List descendantAnimations = (List) destination$iv$iv;
        return CollectionsKt.plus(r9.getAnimations(), descendantAnimations);
    }

    public static /* synthetic */ TransitionInfo createTransitionInfo$default(Transition.TransitionAnimationState r0, long r1, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 1;
    L6:
        return createTransitionInfo(r0, r1);
    }

    public static final <T, V extends AnimationVector, S> TransitionInfo createTransitionInfo(Transition<S>.TransitionAnimationState<T, V> r3, long stepMs) {
        return createTransitionInfo(r3.getAnimation(), r3.getLabel(), r3.getAnimationSpec(), stepMs);
    }

    public static /* synthetic */ TransitionInfo createTransitionInfo$default(Animation r0, String r1, AnimationSpec r2, long r3, int r5, Object r6) {
        if ((r5 & 4) == 0) goto L6;
        r3 = 1;
    L6:
        return createTransitionInfo(r0, r1, r2, r3);
    }

    public static final <T, V extends AnimationVector> TransitionInfo createTransitionInfo(final Animation<T, V> r10, String label, final AnimationSpec<T> r12, final long stepMs) {
        final long endTimeMs = nanosToMillis(r10.getDurationNanos());
        final Lazy startTimeMs$delegate = LazyKt.lazy(new Utils_androidKt$createTransitionInfo$startTimeMs$2(r12));
        Lazy values$delegate = LazyKt.lazy(new Utils_androidKt$createTransitionInfo$values$2(r10, endTimeMs, stepMs, startTimeMs$delegate));
        String label2 = r12.getClass().getName();
        return new TransitionInfo(label, label2, createTransitionInfo$lambda$1(startTimeMs$delegate), endTimeMs, createTransitionInfo$lambda$2(values$delegate));
    }

    private static final long createTransitionInfo$lambda$1(Lazy<Long> r2) {
        return r2.getValue().longValue();
    }

    private static final <T> Map<Long, T> createTransitionInfo$lambda$2(Lazy<? extends Map<Long, T>> r1) {
        return r1.getValue();
    }

    public static /* synthetic */ TransitionInfo createTransitionInfo$default(InfiniteTransition.TransitionAnimationState r0, long r1, long r3, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = 1;
    L6:
        return createTransitionInfo(r0, r1, r3);
    }

    public static final <T, V extends AnimationVector> TransitionInfo createTransitionInfo(final InfiniteTransition.TransitionAnimationState<T, V> r8, final long stepMs, final long endTimeMs) {
        final long startTimeMs = 0;
        Lazy values$delegate = LazyKt.lazy(new Utils_androidKt$createTransitionInfo$values$5(startTimeMs, r8, endTimeMs, stepMs));
        return new TransitionInfo(r8.getLabel(), r8.getAnimationSpec().getClass().getName(), 0, endTimeMs, createTransitionInfo$lambda$3(values$delegate));
    }

    private static final <T> Map<Long, T> createTransitionInfo$lambda$3(Lazy<? extends Map<Long, T>> r1) {
        return r1.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r18v20 */
    /* JADX WARN: Type inference failed for: r18v21 */
    /* JADX WARN: Type inference failed for: r18v22 */
    /* JADX WARN: Type inference failed for: r18v23 */
    public static final <T> TargetState<T> parseParametersToValue(T r24, Object r25, Object r26) {
        if (r24 != null) goto L5;
        return null;
    L5:
        TargetState r0 = parseParametersToValue$parseDp(r24, r25, r26);
        if (r0 == null) goto L10;
        return r0;
    L10:
        if (parseParametersToValue$parametersAreValid(r25, r26) == true) goto L12;
        return null;
    L12:
        Intrinsics.checkNotNull(r26);
        if (parseParametersToValue$parametersHasTheSameType(r24, r25, r26) == false) goto L17;
        return new TargetState(r25, r26);
    L17:
        if ((r25 instanceof List) == false) goto L92;
        if ((r26 instanceof List) == false) goto L92;
    L93:
        if ((r24 instanceof IntSize) == true) goto L95;
        Object r15 = null;
        if ((r24 instanceof IntOffset) == false) goto L39;
        Object r4 = ((List) r25).get(0);     // Catch: NullPointerException -> L71 IllegalArgumentException -> L73 ClassCastException -> L75 IndexOutOfBoundsException -> L77
        Intrinsics.checkNotNull(r4, "null cannot be cast to non-null type kotlin.Int");     // Catch: NullPointerException -> L71 IllegalArgumentException -> L73 ClassCastException -> L75 IndexOutOfBoundsException -> L77
        int r5 = ((Integer) r4).intValue();     // Catch: NullPointerException -> L71 IllegalArgumentException -> L73 ClassCastException -> L75 IndexOutOfBoundsException -> L77
        Object r6 = ((List) r25).get(1);     // Catch: NullPointerException -> L71 IllegalArgumentException -> L73 ClassCastException -> L75 IndexOutOfBoundsException -> L77
        Intrinsics.checkNotNull(r6, "null cannot be cast to non-null type kotlin.Int");     // Catch: NullPointerException -> L71 IllegalArgumentException -> L73 ClassCastException -> L75 IndexOutOfBoundsException -> L77
        IntOffset r7 = IntOffset.m7092boximpl(IntOffset.m7095constructorimpl((((long) ((Integer) r6).intValue()) & 4294967295L) | (((long) r5) << 32)));     // Catch: NullPointerException -> L71 IllegalArgumentException -> L73 ClassCastException -> L75 IndexOutOfBoundsException -> L77
        Object r8 = ((List) r26).get(0);     // Catch: NullPointerException -> L71 IllegalArgumentException -> L73 ClassCastException -> L75 IndexOutOfBoundsException -> L77
        Intrinsics.checkNotNull(r8, "null cannot be cast to non-null type kotlin.Int");     // Catch: NullPointerException -> L71 IllegalArgumentException -> L73 ClassCastException -> L75 IndexOutOfBoundsException -> L77
        int r9 = ((Integer) r8).intValue();     // Catch: NullPointerException -> L71 IllegalArgumentException -> L73 ClassCastException -> L75 IndexOutOfBoundsException -> L77
        Object r10 = ((List) r26).get(1);     // Catch: NullPointerException -> L71 IllegalArgumentException -> L73 ClassCastException -> L75 IndexOutOfBoundsException -> L77
        Intrinsics.checkNotNull(r10, "null cannot be cast to non-null type kotlin.Int");     // Catch: NullPointerException -> L71 IllegalArgumentException -> L73 ClassCastException -> L75 IndexOutOfBoundsException -> L77
        TargetState<T> r1 = new TargetState(r7, IntOffset.m7092boximpl(IntOffset.m7095constructorimpl((((long) r9) << 32) | (((long) ((Integer) r10).intValue()) & 4294967295L))));     // Catch: NullPointerException -> L71 IllegalArgumentException -> L73 ClassCastException -> L75 IndexOutOfBoundsException -> L77
        TargetState<T> r18 = null;
        ?? r16 = r15;
    L60:
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type androidx.compose.ui.tooling.animation.states.TargetState<T of androidx.compose.ui.tooling.animation.clock.Utils_androidKt.parseParametersToValue>");     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        return r1;
    L39:
        if ((r24 instanceof Size) == false) goto L43;
        Object r11 = ((List) r25).get(0);     // Catch: NullPointerException -> L71 IllegalArgumentException -> L73 ClassCastException -> L75 IndexOutOfBoundsException -> L77
        Intrinsics.checkNotNull(r11, "null cannot be cast to non-null type kotlin.Float");     // Catch: NullPointerException -> L71 IllegalArgumentException -> L73 ClassCastException -> L75 IndexOutOfBoundsException -> L77
        float r12 = ((Float) r11).floatValue();     // Catch: NullPointerException -> L71 IllegalArgumentException -> L73 ClassCastException -> L75 IndexOutOfBoundsException -> L77
        Object r13 = ((List) r25).get(1);     // Catch: NullPointerException -> L71 IllegalArgumentException -> L73 ClassCastException -> L75 IndexOutOfBoundsException -> L77
        Intrinsics.checkNotNull(r13, "null cannot be cast to non-null type kotlin.Float");     // Catch: NullPointerException -> L71 IllegalArgumentException -> L73 ClassCastException -> L75 IndexOutOfBoundsException -> L77
        float r14 = ((Float) r13).floatValue();     // Catch: NullPointerException -> L71 IllegalArgumentException -> L73 ClassCastException -> L75 IndexOutOfBoundsException -> L77
        r18 = null;
        Size r17 = Size.m4182boximpl(Size.m4185constructorimpl((Float.floatToRawIntBits(r12) << 32) | (((long) Float.floatToRawIntBits(r14)) & 4294967295L)));     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Object r19 = ((List) r26).get(0);     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Intrinsics.checkNotNull(r19, "null cannot be cast to non-null type kotlin.Float");     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        float r20 = ((Float) r19).floatValue();     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Object r21 = ((List) r26).get(1);     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Intrinsics.checkNotNull(r21, "null cannot be cast to non-null type kotlin.Float");     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        float r22 = ((Float) r21).floatValue();     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        long r23 = Float.floatToRawIntBits(r20);     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        long r110 = ((long) Float.floatToRawIntBits(r22)) & 4294967295L;     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        r1 = new TargetState(r17, Size.m4182boximpl(Size.m4185constructorimpl((r23 << 32) | r110)));     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        r16 = r110;
        goto L60
    L43:
        r18 = null;
        if ((r24 instanceof Offset) == false) goto L47;
        Object r27 = ((List) r25).get(0);     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Intrinsics.checkNotNull(r27, "null cannot be cast to non-null type kotlin.Float");     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        float r28 = ((Float) r27).floatValue();     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Object r29 = ((List) r25).get(1);     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Intrinsics.checkNotNull(r29, "null cannot be cast to non-null type kotlin.Float");     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        float r30 = ((Float) r29).floatValue();     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Offset r31 = Offset.m4114boximpl(Offset.m4117constructorimpl((Float.floatToRawIntBits(r28) << 32) | (((long) Float.floatToRawIntBits(r30)) & 4294967295L)));     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Object r32 = ((List) r26).get(0);     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Intrinsics.checkNotNull(r32, "null cannot be cast to non-null type kotlin.Float");     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        float r33 = ((Float) r32).floatValue();     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Object r34 = ((List) r26).get(1);     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Intrinsics.checkNotNull(r34, "null cannot be cast to non-null type kotlin.Float");     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        float r35 = ((Float) r34).floatValue();     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        long r36 = Float.floatToRawIntBits(r33);     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        long r111 = ((long) Float.floatToRawIntBits(r35)) & 4294967295L;     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        r1 = new TargetState(r31, Offset.m4114boximpl(Offset.m4117constructorimpl((r36 << 32) | r111)));     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        r16 = r111;
        goto L60
    L47:
        if ((r24 instanceof Rect) == false) goto L50;
        Object r37 = ((List) r25).get(0);     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Intrinsics.checkNotNull(r37, "null cannot be cast to non-null type kotlin.Float");     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        float r38 = ((Float) r37).floatValue();     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Object r112 = ((List) r25).get(1);     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Intrinsics.checkNotNull(r112, "null cannot be cast to non-null type kotlin.Float");     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        float r113 = ((Float) r112).floatValue();     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Object r114 = ((List) r25).get(2);     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Intrinsics.checkNotNull(r114, "null cannot be cast to non-null type kotlin.Float");     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        float r115 = ((Float) r114).floatValue();     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Object r116 = ((List) r25).get(3);     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Intrinsics.checkNotNull(r116, "null cannot be cast to non-null type kotlin.Float");     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Rect r39 = new Rect(r38, r113, r115, ((Float) r116).floatValue());     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Object r117 = ((List) r26).get(0);     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Intrinsics.checkNotNull(r117, "null cannot be cast to non-null type kotlin.Float");     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        float r118 = ((Float) r117).floatValue();     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Object r40 = ((List) r26).get(1);     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Intrinsics.checkNotNull(r40, "null cannot be cast to non-null type kotlin.Float");     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        float r41 = ((Float) r40).floatValue();     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Object r42 = ((List) r26).get(2);     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Intrinsics.checkNotNull(r42, "null cannot be cast to non-null type kotlin.Float");     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        float r43 = ((Float) r42).floatValue();     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Object r44 = ((List) r26).get(3);     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Intrinsics.checkNotNull(r44, "null cannot be cast to non-null type kotlin.Float");     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        r1 = new TargetState(r39, new Rect(r118, r41, r43, ((Float) r44).floatValue()));     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        r16 = r15;
        goto L60
    L50:
        if ((r24 instanceof Color) == false) goto L53;
        Object r45 = ((List) r25).get(0);     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Intrinsics.checkNotNull(r45, "null cannot be cast to non-null type kotlin.Float");     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        float r119 = ((Float) r45).floatValue();     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Object r46 = ((List) r25).get(1);     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Intrinsics.checkNotNull(r46, "null cannot be cast to non-null type kotlin.Float");     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        float r120 = ((Float) r46).floatValue();     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Object r47 = ((List) r25).get(2);     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Intrinsics.checkNotNull(r47, "null cannot be cast to non-null type kotlin.Float");     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        float r121 = ((Float) r47).floatValue();     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Object r48 = ((List) r25).get(3);     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Intrinsics.checkNotNull(r48, "null cannot be cast to non-null type kotlin.Float");     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Color r49 = Color.m4356boximpl(ColorKt.Color$default(r119, r120, r121, ((Float) r48).floatValue(), null, 16, null));     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Object r50 = ((List) r26).get(0);     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Intrinsics.checkNotNull(r50, "null cannot be cast to non-null type kotlin.Float");     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        float r122 = ((Float) r50).floatValue();     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Object r51 = ((List) r26).get(1);     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Intrinsics.checkNotNull(r51, "null cannot be cast to non-null type kotlin.Float");     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        float r123 = ((Float) r51).floatValue();     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Object r52 = ((List) r26).get(2);     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Intrinsics.checkNotNull(r52, "null cannot be cast to non-null type kotlin.Float");     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        float r124 = ((Float) r52).floatValue();     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Object r53 = ((List) r26).get(3);     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Intrinsics.checkNotNull(r53, "null cannot be cast to non-null type kotlin.Float");     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        r16 = 16;
        r1 = new TargetState(r49, Color.m4356boximpl(ColorKt.Color$default(r122, r123, r124, ((Float) r53).floatValue(), null, 16, null)));     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        goto L60
    L53:
        if ((r24 instanceof Dp) == false) goto L56;
        Object r2 = ((List) r25).get(0);     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Intrinsics.checkNotNull(r2);     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Object r54 = ((List) r26).get(0);     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Intrinsics.checkNotNull(r54);     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        r1 = (TargetState<T>) parseParametersToValue$parseDp(r24, r2, r54);
        r16 = r15;
        goto L60
    L56:
        if (parseParametersToValue$parametersAreValid(((List) r25).get(0), ((List) r26).get(0)) == false) goto L62;
        Object r3 = ((List) r25).get(0);     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Intrinsics.checkNotNull(r3);     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Object r55 = ((List) r26).get(0);     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        Intrinsics.checkNotNull(r55);     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        if (parseParametersToValue$parametersHasTheSameType(r24, r3, r55) == false) goto L62;
        r1 = new TargetState(((List) r25).get(0), ((List) r26).get(0));     // Catch: NullPointerException -> L63 IllegalArgumentException -> L65 ClassCastException -> L67 IndexOutOfBoundsException -> L69
        r16 = r15;
    L62:
        return null;
    L95:
        Object r125 = ((List) r25).get(0);     // Catch: NullPointerException -> L26 IllegalArgumentException -> L28 ClassCastException -> L30 IndexOutOfBoundsException -> L32
        Intrinsics.checkNotNull(r125, "null cannot be cast to non-null type kotlin.Int");     // Catch: NullPointerException -> L26 IllegalArgumentException -> L28 ClassCastException -> L30 IndexOutOfBoundsException -> L32
        int r126 = ((Integer) r125).intValue();     // Catch: NullPointerException -> L26 IllegalArgumentException -> L28 ClassCastException -> L30 IndexOutOfBoundsException -> L32
        Object r127 = ((List) r25).get(1);     // Catch: NullPointerException -> L26 IllegalArgumentException -> L28 ClassCastException -> L30 IndexOutOfBoundsException -> L32
        Intrinsics.checkNotNull(r127, "null cannot be cast to non-null type kotlin.Int");     // Catch: NullPointerException -> L26 IllegalArgumentException -> L28 ClassCastException -> L30 IndexOutOfBoundsException -> L32
        r16 = 0;
        IntSize r56 = IntSize.m7136boximpl(IntSize.m7139constructorimpl((((long) r126) << 32) | (((long) ((Integer) r127).intValue()) & 4294967295L)));     // Catch: NullPointerException -> L71 IllegalArgumentException -> L73 ClassCastException -> L75 IndexOutOfBoundsException -> L77
        Object r57 = ((List) r26).get(0);     // Catch: NullPointerException -> L71 IllegalArgumentException -> L73 ClassCastException -> L75 IndexOutOfBoundsException -> L77
        Intrinsics.checkNotNull(r57, "null cannot be cast to non-null type kotlin.Int");     // Catch: NullPointerException -> L71 IllegalArgumentException -> L73 ClassCastException -> L75 IndexOutOfBoundsException -> L77
        int r58 = ((Integer) r57).intValue();     // Catch: NullPointerException -> L71 IllegalArgumentException -> L73 ClassCastException -> L75 IndexOutOfBoundsException -> L77
        Object r59 = ((List) r26).get(1);     // Catch: NullPointerException -> L71 IllegalArgumentException -> L73 ClassCastException -> L75 IndexOutOfBoundsException -> L77
        Intrinsics.checkNotNull(r59, "null cannot be cast to non-null type kotlin.Int");     // Catch: NullPointerException -> L71 IllegalArgumentException -> L73 ClassCastException -> L75 IndexOutOfBoundsException -> L77
        r1 = new TargetState(r56, IntSize.m7136boximpl(IntSize.m7139constructorimpl((((long) r58) << 32) | (((long) ((Integer) r59).intValue()) & 4294967295L))));     // Catch: NullPointerException -> L71 IllegalArgumentException -> L73 ClassCastException -> L75 IndexOutOfBoundsException -> L77
        r18 = null;
        goto L60
    L31:
        r16 = 0;
    L29:
        r16 = 0;
    L33:
        r16 = 0;
    L27:
        r16 = 0;
    L103:
        return (TargetState<T>) r16;
    L101:
        return (TargetState<T>) r16;
    L105:
        return (TargetState<T>) r16;
    L99:
        return (TargetState<T>) r16;
    L104:
        return r18;
    L102:
        return r18;
    L106:
        return r18;
    L100:
        return r18;
    L87:
        return null;
    L84:
        return null;
    L90:
        return null;
    L81:
        return null;
    L92:
        return null;
    }

    private static final boolean parseParametersToValue$parametersAreValid(Object par1, Object par2) {
        if (par1 == null) goto L7;
        if (par2 == null) goto L7;
        if (par1.getClass() != par2.getClass()) goto L7;
        return true;
    L7:
        return false;
    }

    private static final boolean parseParametersToValue$parametersHasTheSameType(Object value, Object par1, Object par2) {
        if (value.getClass() == par1.getClass()) goto L5;
    L7:
        return false;
    L5:
        if (value.getClass() != par2.getClass()) goto L7;
        return true;
    }

    private static final Dp parseParametersToValue$getDp(Object par) {
        if ((par instanceof Dp) == false) goto L5;
        Dp r0 = (Dp) par;
    L6:
        if (r0 != null) goto L30;
        if ((par instanceof Float) == false) goto L10;
        Float r1 = (Float) par;
    L11:
        if (r1 == null) goto L13;
        float $this$dp$iv = r1.floatValue();
        r0 = Dp.m6971boximpl(Dp.m6973constructorimpl($this$dp$iv));
    L14:
        if (r0 != null) goto L30;
        if ((par instanceof Double) == false) goto L18;
        Double r2 = (Double) par;
    L19:
        if (r2 == null) goto L21;
        double $this$dp$iv2 = r2.doubleValue();
        r0 = Dp.m6971boximpl(Dp.m6973constructorimpl((float) $this$dp$iv2));
    L22:
        if (r0 != null) goto L30;
        if ((par instanceof Integer) == false) goto L26;
        Integer r3 = (Integer) par;
    L27:
        if (r3 == null) goto L31;
        int $this$dp$iv3 = r3.intValue();
        return Dp.m6971boximpl(Dp.m6973constructorimpl($this$dp$iv3));
    L31:
        return null;
    L26:
        r3 = null;
        goto L27
    L21:
        r0 = null;
        goto L22
    L18:
        r2 = null;
        goto L19
    L13:
        r0 = null;
        goto L14
    L10:
        r1 = null;
    L30:
        return r0;
    L5:
        r0 = null;
        goto L6
    }

    private static final <T> TargetState<Dp> parseParametersToValue$parseDp(T r3, Object par1, Object par2) {
        if ((r3 instanceof Dp) == false) goto L16;
        if (par2 == null) goto L16;
        if ((par1 instanceof Dp) == true) goto L9;
    L11:
        Dp dp1 = parseParametersToValue$getDp(par1);
        Dp dp2 = parseParametersToValue$getDp(par2);
        if (dp1 == null) goto L18;
        if (dp2 != null) goto L15;
        return null;
    L15:
        return new TargetState(dp1, dp2);
    L18:
        return null;
    L9:
        if ((par2 instanceof Dp) == false) goto L11;
        return new TargetState(par1, par2);
    L16:
        return null;
    }
}
