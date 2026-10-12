package androidx.compose.foundation.gestures;

import androidx.autofill.HintConstants;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: TransformGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u0002*\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\t\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b\u001a\u000f\u0010\u000b\u001a\u00020\u0002*\u00020\u0006¢\u0006\u0002\u0010\f\u001a\n\u0010\r\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\u000e\u001a\u00020\u0001*\u00020\u0006\u001a~\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\b2`\u0010\u0013\u001a\\\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00100\u0014H\u0086@¢\u0006\u0002\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"angle", "", "Landroidx/compose/ui/geometry/Offset;", "angle-k-4lQ0M", "(J)F", "calculateCentroid", "Landroidx/compose/ui/input/pointer/PointerEvent;", "useCurrent", "", "(Landroidx/compose/ui/input/pointer/PointerEvent;Z)J", "calculateCentroidSize", "calculatePan", "(Landroidx/compose/ui/input/pointer/PointerEvent;)J", "calculateRotation", "calculateZoom", "detectTransformGestures", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "panZoomLock", "onGesture", "Lkotlin/Function4;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "centroid", "pan", "zoom", "rotation", "(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TransformGestureDetectorKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2, reason: invalid class name */
    /* JADX INFO: compiled from: TransformGestureDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2", f = "TransformGestureDetector.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {LockFreeTaskQueueCore.FROZEN_SHIFT, 62}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$awaitEachGesture", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom"}, s = {"L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1"})
    static final class AnonymousClass2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function4<Offset, Offset, Float, Float, Unit> $onGesture;
        final /* synthetic */ boolean $panZoomLock;
        float F$0;
        float F$1;
        float F$2;
        int I$0;
        int I$1;
        long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(boolean r2, Function4<? super Offset, ? super Offset, ? super Float, ? super Float, Unit> r3, Continuation<? super AnonymousClass2> r4) {
            this.$panZoomLock = r2;
            this.$onGesture = r3;
            super(2, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            AnonymousClass2 r0 = new AnonymousClass2(this.$panZoomLock, this.$onGesture, r5);
            r0.L$0 = r4;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(AwaitPointerEventScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(AwaitPointerEventScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00af -> B:17:0x00bc). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r26) {
            Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int r3 = 1;
            switch(this.label) {
                case 0: goto L8;
                case 1: goto L7;
                case 2: goto L6;
                default: goto L5;
            };
        L6:
            Object $result = r26;
            int r4 = this.I$1;
            float touchSlop = this.F$2;
            int r6 = this.I$0;
            long pan = this.J$0;
            float zoom = this.F$1;
            float rotation = this.F$0;
            AwaitPointerEventScope $this$awaitEachGesture = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure($result);
            AnonymousClass2 r13 = this;
            AwaitPointerEventScope $this$awaitEachGesture2 = $this$awaitEachGesture;
            float rotation2 = rotation;
            float rotation3 = zoom;
            long pan2 = pan;
            int r7 = r6;
            float touchSlop2 = touchSlop;
            int r5 = r4;
            Object $result2 = $result;
        L17:
            PointerEvent event = (PointerEvent) $result;
            List<PointerInputChange> r14 = event.getChanges();
            int r8 = r14.size();
            int index$iv$iv = 0;
        L18:
            Object r27 = r1;
            if (index$iv$iv >= r8) goto L24;
            Object item$iv$iv = r14.get(index$iv$iv);
            if (((PointerInputChange) item$iv$iv).isConsumed() == true) goto L22;
            index$iv$iv = index$iv$iv + 1;
            r1 = r27;
            goto L18
        L22:
            boolean canceled = true;
        L26:
            if (canceled == true) goto L71;
            float zoomChange = TransformGestureDetectorKt.calculateZoom(event);
            float rotationChange = TransformGestureDetectorKt.calculateRotation(event);
            PointerEvent event2 = event;
            long panChange = TransformGestureDetectorKt.calculatePan(event2);
            if (r7 != 0) goto L42;
            rotation3 = rotation3 * zoomChange;
            rotation2 = rotation2 + rotationChange;
            pan2 = Offset.m4130plusMKHz9U(pan2, panChange);
            boolean canceled2 = canceled;
            float centroidSize = TransformGestureDetectorKt.calculateCentroidSize(event2, false);
            float zoomMotion = Math.abs(1.0f - rotation3) * centroidSize;
            float centroidSize2 = Math.abs(((3.1415927f * rotation2) * centroidSize) / 180.0f);
            float panMotion = Offset.m4123getDistanceimpl(pan2);
            if (zoomMotion <= touchSlop2) goto L32;
        L35:
            r7 = 1;
            if (r13.$panZoomLock == true) goto L38;
        L40:
            int r0 = 0;
        L41:
            r5 = r0;
        L43:
            if (r7 == 0) goto L69;
            long centroid = TransformGestureDetectorKt.calculateCentroid(event2, false);
            if (r5 == 0) goto L48;
            rotationChange = 0.0f;
        L48:
            if (rotationChange != 0.0f) goto L50;
            boolean r16 = true;
        L51:
            if (r16 == true) goto L53;
        L60:
            Object $result3 = $result2;
        L61:
            r13.$onGesture.invoke(Offset.m4114boximpl(centroid), Offset.m4114boximpl(panChange), Boxing.boxFloat(zoomChange), Boxing.boxFloat(rotationChange));
        L62:
            List<PointerInputChange> r2 = event2.getChanges();
            int index$iv = 0;
            int r9 = r2.size();
        L63:
            if (index$iv >= r9) goto L70;
            Object item$iv = r2.get(index$iv);
            PointerInputChange it = (PointerInputChange) item$iv;
            if (PointerEventKt.positionChanged(it) == false) goto L67;
            it.consume();
        L67:
            index$iv = index$iv + 1;
        L70:
            int r10 = r5;
        L72:
            if (canceled2 == true) goto L84;
            List<PointerInputChange> r11 = event2.getChanges();
            int index$iv$iv2 = 0;
            int r12 = r11.size();
        L74:
            if (index$iv$iv2 >= r12) goto L79;
            Object item$iv$iv2 = r11.get(index$iv$iv2);
            if (((PointerInputChange) item$iv$iv2).getPressed() == true) goto L77;
            index$iv$iv2 = index$iv$iv2 + 1;
            goto L74
        L77:
            int $i$f$fastAny = 1;
        L80:
            if ($i$f$fastAny == 0) goto L84;
            r1 = r27;
            float touchSlop3 = touchSlop2;
            int r15 = r7;
            long pan3 = pan2;
            float zoom2 = rotation3;
            float zoom3 = rotation2;
            AwaitPointerEventScope $this$awaitEachGesture3 = $this$awaitEachGesture2;
            AnonymousClass2 r17 = r13;
            Object $result4 = $result3;
            r3 = 1;
        L13:
            r17.L$0 = $this$awaitEachGesture3;
            r17.F$0 = zoom3;
            r17.F$1 = zoom2;
            r17.J$0 = pan3;
            r17.I$0 = r15;
            r17.F$2 = touchSlop3;
            r17.I$1 = r10;
            r17.label = 2;
            Object r18 = AwaitPointerEventScope.awaitPointerEvent$default($this$awaitEachGesture3, null, r17, r3, null);
            if (r18 != r1) goto L16;
            return r1;
        L16:
            int r24 = r10;
            $result2 = $result4;
            $result = r18;
            r13 = r17;
            $this$awaitEachGesture2 = $this$awaitEachGesture3;
            rotation2 = zoom3;
            rotation3 = zoom2;
            pan2 = pan3;
            r7 = r15;
            touchSlop2 = touchSlop3;
            r5 = r24;
            goto L17
        L79:
            $i$f$fastAny = 0;
        L84:
            return Unit.INSTANCE;
        L53:
            if (zoomChange != 1.0f) goto L55;
            boolean r19 = true;
        L56:
            if (r19 == false) goto L60;
            $result3 = $result2;
            if (Offset.m4122equalsimpl0(panChange, Offset.Companion.m4141getZeroF1C5BW0()) == true) goto L62;
        L55:
            r19 = false;
            goto L56
        L50:
            r16 = false;
            goto L51
        L69:
            $result3 = $result2;
            goto L70
        L38:
            if (centroidSize2 >= touchSlop2) goto L40;
            r0 = 1;
            goto L41
        L32:
            if (centroidSize2 > touchSlop2) goto L35;
            if (panMotion <= touchSlop2) goto L43;
        L42:
            canceled2 = canceled;
            goto L43
        L71:
            canceled2 = canceled;
            event2 = event;
            $result3 = $result2;
            r10 = r5;
            goto L72
        L24:
            canceled = false;
            goto L26
        L7:
            $result4 = r26;
            r10 = this.I$1;
            touchSlop3 = this.F$2;
            r15 = this.I$0;
            pan3 = this.J$0;
            zoom2 = this.F$1;
            zoom3 = this.F$0;
            $this$awaitEachGesture3 = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure($result4);
        L12:
            r17 = this;
            goto L13
        L8:
            ResultKt.throwOnFailure(r26);
            $result4 = r26;
            AwaitPointerEventScope $this$awaitEachGesture4 = (AwaitPointerEventScope) this.L$0;
            long pan4 = Offset.Companion.m4141getZeroF1C5BW0();
            float touchSlop4 = $this$awaitEachGesture4.getViewConfiguration().getTouchSlop();
            this.L$0 = $this$awaitEachGesture4;
            this.F$0 = 0.0f;
            this.F$1 = 1.0f;
            this.J$0 = pan4;
            this.I$0 = 0;
            this.F$2 = touchSlop4;
            this.I$1 = 0;
            this.label = 1;
            if (TapGestureDetectorKt.awaitFirstDown$default($this$awaitEachGesture4, false, null, this, 2, null) != r1) goto L11;
            return r1;
        L11:
            zoom3 = 0.0f;
            zoom2 = 1.0f;
            pan3 = pan4;
            r15 = 0;
            r10 = 0;
            $this$awaitEachGesture3 = $this$awaitEachGesture4;
            touchSlop3 = touchSlop4;
            goto L12
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static /* synthetic */ Object detectTransformGestures$default(PointerInputScope r0, boolean r1, Function4 r2, Continuation r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = false;
    L6:
        return detectTransformGestures(r0, r1, r2, r3);
    }

    public static final Object detectTransformGestures(PointerInputScope $this$detectTransformGestures, boolean panZoomLock, Function4<? super Offset, ? super Offset, ? super Float, ? super Float, Unit> r4, Continuation<? super Unit> r5) {
        Object r0 = ForEachGestureKt.awaitEachGesture($this$detectTransformGestures, new AnonymousClass2(panZoomLock, r4, null), r5);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    public static final float calculateRotation(PointerEvent $this$calculateRotation) {
        List<PointerInputChange> r1 = $this$calculateRotation.getChanges();
        int sum$iv = 0;
        int index$iv$iv = 0;
        int r7 = r1.size();
    L3:
        int r8 = 0;
        if (index$iv$iv >= r7) goto L11;
        Object item$iv$iv = r1.get(index$iv$iv);
        PointerInputChange it = (PointerInputChange) item$iv$iv;
        if (it.getPreviousPressed() == false) goto L10;
        if (it.getPressed() == false) goto L10;
        r8 = 1;
    L10:
        sum$iv = sum$iv + r8;
        index$iv$iv = index$iv$iv + 1;
        goto L3
    L11:
        float r2 = 0.0f;
        if (sum$iv >= 2) goto L14;
        return 0.0f;
    L14:
        long currentCentroid = calculateCentroid($this$calculateRotation, true);
        long previousCentroid = calculateCentroid($this$calculateRotation, false);
        float rotation = 0.0f;
        float rotationWeight = 0.0f;
        List<PointerInputChange> r11 = $this$calculateRotation.getChanges();
        int index$iv = 0;
        int r14 = r11.size();
    L15:
        if (index$iv >= r14) goto L30;
        Object item$iv = r11.get(index$iv);
        PointerInputChange change = (PointerInputChange) item$iv;
        if (change.getPressed() == true) goto L19;
    L28:
        float rotation2 = rotation;
    L29:
        rotation = rotation2;
        index$iv = index$iv + 1;
        sum$iv = sum$iv;
        r2 = r2;
        previousCentroid = previousCentroid;
        goto L15
    L19:
        if (change.getPreviousPressed() == false) goto L28;
        long currentPosition = change.m5589getPositionF1C5BW0();
        long previousPosition = change.m5590getPreviousPositionF1C5BW0();
        float rotation3 = rotation;
        long previousOffset = Offset.m4129minusMKHz9U(previousPosition, previousCentroid);
        long currentOffset = Offset.m4129minusMKHz9U(currentPosition, currentCentroid);
        float previousAngle = m525anglek4lQ0M(previousOffset);
        float currentAngle = m525anglek4lQ0M(currentOffset);
        float angleDiff = currentAngle - previousAngle;
        float weight = Offset.m4123getDistanceimpl(Offset.m4130plusMKHz9U(currentOffset, previousOffset)) / 2.0f;
        if (angleDiff <= 180.0f) goto L24;
        float r27 = angleDiff - 360.0f;
    L27:
        rotation2 = rotation3 + (r27 * weight);
        rotationWeight = rotationWeight + weight;
        goto L29
    L24:
        if (angleDiff >= (-180.0f)) goto L26;
        r27 = angleDiff + 360.0f;
        goto L27
    L26:
        r27 = angleDiff;
        goto L27
    L30:
        float rotation4 = rotation;
        float r19 = r2;
        if (rotationWeight != r19) goto L33;
        boolean r9 = true;
    L34:
        if (r9 == false) goto L37;
        return r19;
    L37:
        return rotation4 / rotationWeight;
    L33:
        r9 = false;
        goto L34
    }

    /* JADX INFO: renamed from: angle-k-4lQ0M, reason: not valid java name */
    private static final float m525anglek4lQ0M(long $this$angle_u2dk_u2d4lQ0M) {
        int bits$iv$iv$iv = (int) ($this$angle_u2dk_u2d4lQ0M >> 32);
        boolean r2 = true;
        if (Float.intBitsToFloat(bits$iv$iv$iv) != 0.0f) goto L5;
        boolean r1 = true;
    L7:
        if (r1 == false) goto L14;
        int bits$iv$iv$iv2 = (int) ($this$angle_u2dk_u2d4lQ0M & 4294967295L);
        if (Float.intBitsToFloat(bits$iv$iv$iv2) == 0.0f) goto L12;
        r2 = false;
    L12:
        if (r2 == false) goto L14;
        return 0.0f;
    L14:
        int bits$iv$iv$iv3 = (int) ($this$angle_u2dk_u2d4lQ0M >> 32);
        int bits$iv$iv$iv4 = (int) (4294967295L & $this$angle_u2dk_u2d4lQ0M);
        return ((-((float) Math.atan2(Float.intBitsToFloat(bits$iv$iv$iv3), Float.intBitsToFloat(bits$iv$iv$iv4)))) * 180.0f) / 3.1415927f;
    L5:
        r1 = false;
        goto L7
    }

    public static final float calculateZoom(PointerEvent $this$calculateZoom) {
        boolean r0 = true;
        float currentCentroidSize = calculateCentroidSize($this$calculateZoom, true);
        float previousCentroidSize = calculateCentroidSize($this$calculateZoom, false);
        if (currentCentroidSize != 0.0f) goto L5;
        boolean r5 = true;
    L6:
        if (r5 == false) goto L8;
        return 1.0f;
    L8:
        if (previousCentroidSize == 0.0f) goto L11;
        r0 = false;
    L11:
        if (r0 == false) goto L14;
        return 1.0f;
    L14:
        return currentCentroidSize / previousCentroidSize;
    L5:
        r5 = false;
        goto L6
    }

    public static final long calculatePan(PointerEvent $this$calculatePan) {
        long currentCentroid = calculateCentroid($this$calculatePan, true);
        if (Offset.m4122equalsimpl0(currentCentroid, Offset.Companion.m4140getUnspecifiedF1C5BW0()) == true) goto L5;
        long previousCentroid = calculateCentroid($this$calculatePan, false);
        return Offset.m4129minusMKHz9U(currentCentroid, previousCentroid);
    L5:
        return Offset.Companion.m4141getZeroF1C5BW0();
    }

    public static /* synthetic */ float calculateCentroidSize$default(PointerEvent r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = true;
    L6:
        return calculateCentroidSize(r0, r1);
    }

    public static final float calculateCentroidSize(PointerEvent $this$calculateCentroidSize, boolean useCurrent) {
        long centroid = calculateCentroid($this$calculateCentroidSize, useCurrent);
        if (Offset.m4122equalsimpl0(centroid, Offset.Companion.m4140getUnspecifiedF1C5BW0()) == false) goto L6;
        return 0.0f;
    L6:
        float distanceToCentroid = 0.0f;
        int distanceWeight = 0;
        List<PointerInputChange> r4 = $this$calculateCentroidSize.getChanges();
        int index$iv = 0;
        int r7 = r4.size();
    L7:
        if (index$iv >= r7) goto L18;
        Object item$iv = r4.get(index$iv);
        PointerInputChange change = (PointerInputChange) item$iv;
        if (change.getPressed() == false) goto L16;
        if (change.getPreviousPressed() == false) goto L16;
        if (useCurrent == false) goto L14;
        long position = change.m5589getPositionF1C5BW0();
    L15:
        distanceToCentroid = distanceToCentroid + Offset.m4123getDistanceimpl(Offset.m4129minusMKHz9U(position, centroid));
        distanceWeight = distanceWeight + 1;
        goto L16
    L14:
        position = change.m5590getPreviousPositionF1C5BW0();
    L16:
        index$iv = index$iv + 1;
        goto L7
    L18:
        return distanceToCentroid / distanceWeight;
    }

    public static /* synthetic */ long calculateCentroid$default(PointerEvent r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = true;
    L6:
        return calculateCentroid(r0, r1);
    }

    public static final long calculateCentroid(PointerEvent $this$calculateCentroid, boolean useCurrent) {
        long centroid = Offset.Companion.m4141getZeroF1C5BW0();
        int centroidWeight = 0;
        List<PointerInputChange> r3 = $this$calculateCentroid.getChanges();
        int index$iv = 0;
        int r6 = r3.size();
    L3:
        if (index$iv >= r6) goto L14;
        Object item$iv = r3.get(index$iv);
        PointerInputChange change = (PointerInputChange) item$iv;
        if (change.getPressed() == false) goto L12;
        if (change.getPreviousPressed() == false) goto L12;
        if (useCurrent == false) goto L10;
        long position = change.m5589getPositionF1C5BW0();
    L11:
        centroid = Offset.m4130plusMKHz9U(centroid, position);
        centroidWeight = centroidWeight + 1;
        goto L12
    L10:
        position = change.m5590getPreviousPositionF1C5BW0();
    L12:
        index$iv = index$iv + 1;
        goto L3
    L14:
        if (centroidWeight != 0) goto L17;
        return Offset.Companion.m4140getUnspecifiedF1C5BW0();
    L17:
        return Offset.m4120divtuRUvjQ(centroid, centroidWeight);
    }
}
