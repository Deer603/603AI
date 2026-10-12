package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.time.Duration;
import kotlin.time.TimeSource;

/* JADX INFO: compiled from: LazyLayoutPrefetchState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider;", "", "itemContentFactory", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "subcomposeLayoutState", "Landroidx/compose/ui/layout/SubcomposeLayoutState;", "executor", "Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;Landroidx/compose/ui/layout/SubcomposeLayoutState;Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;)V", "createNestedPrefetchRequest", "Landroidx/compose/foundation/lazy/layout/PrefetchRequest;", "index", "", "constraints", "Landroidx/compose/ui/unit/Constraints;", "prefetchMetrics", "Landroidx/compose/foundation/lazy/layout/PrefetchMetrics;", "createNestedPrefetchRequest-VKLhPVY", "(IJLandroidx/compose/foundation/lazy/layout/PrefetchMetrics;)Landroidx/compose/foundation/lazy/layout/PrefetchRequest;", "schedulePrefetch", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "schedulePrefetch-VKLhPVY", "(IJLandroidx/compose/foundation/lazy/layout/PrefetchMetrics;)Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "HandleAndRequestImpl", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PrefetchHandleProvider {
    public static final int $stable = 0;
    private final PrefetchScheduler executor;
    private final LazyLayoutItemContentFactory itemContentFactory;
    private final SubcomposeLayoutState subcomposeLayoutState;

    /* JADX INFO: compiled from: LazyLayoutPrefetchState.kt */
    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0083\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u00011B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\u001a\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002J\u001a\u0010$\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0012\u0010(\u001a\f\u0018\u00010\u0016R\u00060\u0000R\u00020\u0017H\u0002J\u0018\u0010)\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000bH\u0002J\b\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020\u001dH\u0002J\f\u0010/\u001a\u00020\u000f*\u000200H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u00020\u0006X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\r\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0015\u001a\f\u0018\u00010\u0016R\u00060\u0000R\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\u00020\u001bX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, d2 = {"Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "Landroidx/compose/foundation/lazy/layout/PrefetchRequest;", "index", "", "constraints", "Landroidx/compose/ui/unit/Constraints;", "prefetchMetrics", "Landroidx/compose/foundation/lazy/layout/PrefetchMetrics;", "(Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider;IJLandroidx/compose/foundation/lazy/layout/PrefetchMetrics;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "availableTimeNanos", "", "J", "elapsedTimeNanos", "hasResolvedNestedPrefetches", "", "isCanceled", "isComposed", "()Z", "isMeasured", "isUrgent", "nestedPrefetchController", "Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl$NestedPrefetchController;", "Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider;", "precomposeHandle", "Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "startTime", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "cancel", "", "markAsUrgent", "performFullComposition", "itemProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "contentType", "", "performMeasure", "performMeasure-BRTryo0", "(J)V", "resetAvailableTimeTo", "resolveNestedPrefetchStates", "shouldExecute", "available", "average", "toString", "", "updateElapsedAndAvailableTime", "execute", "Landroidx/compose/foundation/lazy/layout/PrefetchRequestScope;", "NestedPrefetchController", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class HandleAndRequestImpl implements LazyLayoutPrefetchState.PrefetchHandle, PrefetchRequest {
        private long availableTimeNanos;
        private final long constraints;
        private long elapsedTimeNanos;
        private boolean hasResolvedNestedPrefetches;
        private final int index;
        private boolean isCanceled;
        private boolean isMeasured;
        private boolean isUrgent;
        private NestedPrefetchController nestedPrefetchController;
        private SubcomposeLayoutState.PrecomposedSlotHandle precomposeHandle;
        private final PrefetchMetrics prefetchMetrics;
        private long startTime;
        final /* synthetic */ PrefetchHandleProvider this$0;

        /* JADX INFO: compiled from: LazyLayoutPrefetchState.kt */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\n\u0010\r\u001a\u00020\u000e*\u00020\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00030\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl$NestedPrefetchController;", "", "states", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "(Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl;Ljava/util/List;)V", "requestIndex", "", "requestsByState", "", "Landroidx/compose/foundation/lazy/layout/PrefetchRequest;", "[Ljava/util/List;", "stateIndex", "executeNestedPrefetches", "", "Landroidx/compose/foundation/lazy/layout/PrefetchRequestScope;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private final class NestedPrefetchController {
            private int requestIndex;
            private final List<PrefetchRequest>[] requestsByState;
            private int stateIndex;
            private final List<LazyLayoutPrefetchState> states;
            final /* synthetic */ HandleAndRequestImpl this$0;

            public NestedPrefetchController(HandleAndRequestImpl this$0, List<LazyLayoutPrefetchState> r5) {
                this.this$0 = this$0;
                this.states = r5;
                this.requestsByState = new List[this.states.size()];
                boolean value$iv = !this.states.isEmpty();
                if (value$iv == true) goto L7;
                InlineClassHelperKt.throwIllegalArgumentException("NestedPrefetchController shouldn't be created with no states");
                return;
            }

            public final boolean executeNestedPrefetches(PrefetchRequestScope $this$executeNestedPrefetches) {
                if (this.stateIndex < this.states.size()) goto L5;
                return false;
            L5:
                boolean value$iv = !HandleAndRequestImpl.access$isCanceled$p(this.this$0);
                if (value$iv == true) goto L8;
                InlineClassHelperKt.throwIllegalStateException("Should not execute nested prefetch on canceled request");
            L8:
                Trace.beginSection("compose:lazy:prefetch:nested");
            L33:
            L30:
                th = move-exception;
                Trace.endSection();
                throw th;
            L10:
                if (this.stateIndex >= this.states.size()) goto L27;
                if (this.requestsByState[this.stateIndex] == null) goto L15;
            L19:
                List<PrefetchRequest> r5 = this.requestsByState[this.stateIndex];     // Catch: Throwable -> L30
                Intrinsics.checkNotNull(r5);     // Catch: Throwable -> L30
            L21:
                if (this.requestIndex >= r5.size()) goto L26;
                PrefetchRequest $this$executeNestedPrefetches_u24lambda_u243_u24lambda_u242 = r5.get(this.requestIndex);     // Catch: Throwable -> L30
                boolean hasMoreWork = $this$executeNestedPrefetches_u24lambda_u243_u24lambda_u242.execute($this$executeNestedPrefetches);     // Catch: Throwable -> L30
                if (hasMoreWork == true) goto L16;
                this.requestIndex++;     // Catch: Throwable -> L30
            L16:
                Trace.endSection();
                return true;
            L26:
                this.requestIndex = 0;     // Catch: Throwable -> L30
                this.stateIndex++;     // Catch: Throwable -> L30
                goto L33
            L15:
                if ($this$executeNestedPrefetches.availableTimeNanos() <= 0) goto L16;
                this.requestsByState[this.stateIndex] = this.states.get(this.stateIndex).collectNestedPrefetchRequests$foundation_release();     // Catch: Throwable -> L30
                goto L19
            L27:
                Unit r1 = Unit.INSTANCE;     // Catch: Throwable -> L30
                Trace.endSection();
                return false;
            }
        }

        public /* synthetic */ HandleAndRequestImpl(PrefetchHandleProvider r1, int r2, long r3, PrefetchMetrics r5, DefaultConstructorMarker r6) {
            this(r1, r2, r3, r5);
        }

        public static final /* synthetic */ boolean access$isCanceled$p(HandleAndRequestImpl $this) {
            return $this.isCanceled;
        }

        private HandleAndRequestImpl(PrefetchHandleProvider this$0, int index, long constraints, PrefetchMetrics prefetchMetrics) {
            this.this$0 = this$0;
            this.index = index;
            this.constraints = constraints;
            this.prefetchMetrics = prefetchMetrics;
            this.startTime = TimeSource.Monotonic.INSTANCE.m8876markNowz9LOYto();
        }

        private final boolean isComposed() {
            if (this.precomposeHandle == null) goto L5;
            return true;
        L5:
            return false;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle
        public void cancel() {
            if (this.isCanceled == true) goto L9;
            this.isCanceled = true;
            SubcomposeLayoutState.PrecomposedSlotHandle r0 = this.precomposeHandle;
            if (r0 == null) goto L7;
            r0.dispose();
        L7:
            this.precomposeHandle = null;
            return;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle
        public void markAsUrgent() {
            this.isUrgent = true;
        }

        private final boolean shouldExecute(long available, long average) {
            if (this.isUrgent == false) goto L7;
            if (available <= 0) goto L7;
        L8:
            return true;
        L7:
            if (average < available) goto L8;
            return false;
        }

        private final void resetAvailableTimeTo(long availableTimeNanos) {
            this.availableTimeNanos = availableTimeNanos;
            this.startTime = TimeSource.Monotonic.INSTANCE.m8876markNowz9LOYto();
            this.elapsedTimeNanos = 0;
        }

        private final void updateElapsedAndAvailableTime() {
            long now = TimeSource.Monotonic.INSTANCE.m8876markNowz9LOYto();
            this.elapsedTimeNanos = Duration.m8777getInWholeNanosecondsimpl(TimeSource.Monotonic.ValueTimeMark.m8887minus6eNON_k(now, this.startTime));
            this.availableTimeNanos -= this.elapsedTimeNanos;
            this.startTime = now;
        }

        @Override // androidx.compose.foundation.lazy.layout.PrefetchRequest
        public boolean execute(PrefetchRequestScope $this$execute) {
            LazyLayoutItemProvider itemProvider = PrefetchHandleProvider.access$getItemContentFactory$p(this.this$0).getItemProvider().invoke();
            if (this.isCanceled == true) goto L11;
            int r1 = itemProvider.getItemCount();
            int r4 = this.index;
            if (r4 < 0) goto L8;
            if (r4 >= r1) goto L8;
            boolean r2 = true;
        L9:
            if (r2 == false) goto L11;
            boolean isValid = true;
        L12:
            if (isValid == true) goto L14;
            return false;
        L14:
            Object contentType = itemProvider.getContentType(this.index);
            resetAvailableTimeTo($this$execute.availableTimeNanos());
            if (isComposed() == true) goto L26;
            if (shouldExecute(this.availableTimeNanos, this.prefetchMetrics.getCompositionTimeNanos(contentType)) == false) goto L24;
            Trace.beginSection("compose:lazy:prefetch:compose");
            performFullComposition(itemProvider, contentType);     // Catch: Throwable -> L21
            Unit r7 = Unit.INSTANCE;     // Catch: Throwable -> L21
            Trace.endSection();
            updateElapsedAndAvailableTime();
            this.prefetchMetrics.saveCompositionTime(contentType, this.elapsedTimeNanos);
        L21:
            th = move-exception;
            Trace.endSection();
            throw th;
        L24:
            return true;
        L26:
            if (this.isUrgent == false) goto L28;
        L46:
            boolean hasMoreWork = this.isMeasured;
            if (hasMoreWork == false) goto L49;
        L59:
            return false;
        L49:
            if (Constraints.m6930isZeroimpl(this.constraints) == true) goto L59;
            if (shouldExecute(this.availableTimeNanos, this.prefetchMetrics.getMeasureTimeNanos(contentType)) == false) goto L58;
            Trace.beginSection("compose:lazy:prefetch:measure");
            m916performMeasureBRTryo0(this.constraints);     // Catch: Throwable -> L55
            Unit r6 = Unit.INSTANCE;     // Catch: Throwable -> L55
            Trace.endSection();
            updateElapsedAndAvailableTime();
            this.prefetchMetrics.saveMeasureTime(contentType, this.elapsedTimeNanos);
        L55:
            th = move-exception;
            Trace.endSection();
            throw th;
        L58:
            return true;
        L28:
            if (this.hasResolvedNestedPrefetches == false) goto L30;
        L38:
            NestedPrefetchController $this$execute_u24lambda_u242 = this.nestedPrefetchController;
            if ($this$execute_u24lambda_u242 == null) goto L41;
            boolean hasMoreWork2 = $this$execute_u24lambda_u242.executeNestedPrefetches($this$execute);
        L43:
            if (hasMoreWork2 == false) goto L45;
            return true;
        L45:
            updateElapsedAndAvailableTime();
            goto L46
        L41:
            hasMoreWork2 = false;
            goto L43
        L30:
            if (this.availableTimeNanos <= 0) goto L37;
            Trace.beginSection("compose:lazy:prefetch:resolve-nested");
            this.nestedPrefetchController = resolveNestedPrefetchStates();     // Catch: Throwable -> L34
            this.hasResolvedNestedPrefetches = true;     // Catch: Throwable -> L34
            Unit r8 = Unit.INSTANCE;     // Catch: Throwable -> L34
            Trace.endSection();
        L34:
            th = move-exception;
            Trace.endSection();
            throw th;
        L37:
            return true;
        L8:
            r2 = false;
        L11:
            isValid = false;
            goto L12
        }

        private final void performFullComposition(LazyLayoutItemProvider itemProvider, Object contentType) {
            if (this.precomposeHandle != null) goto L5;
            boolean value$iv = true;
        L7:
            if (value$iv == true) goto L9;
            InlineClassHelperKt.throwIllegalArgumentException("Request was already composed!");
        L9:
            Object key = itemProvider.getKey(this.index);
            Function2<Composer, Integer, Unit> r1 = PrefetchHandleProvider.access$getItemContentFactory$p(this.this$0).getContent(this.index, key, contentType);
            this.precomposeHandle = PrefetchHandleProvider.access$getSubcomposeLayoutState$p(this.this$0).precompose(key, r1);
            return;
        L5:
            value$iv = false;
            goto L7
        }

        /* JADX INFO: renamed from: performMeasure-BRTryo0, reason: not valid java name */
        private final void m916performMeasureBRTryo0(long constraints) {
            boolean value$iv = !this.isCanceled;
            if (value$iv == true) goto L5;
            InlineClassHelperKt.throwIllegalArgumentException("Callers should check whether the request is still valid before calling performMeasure()");
        L5:
            boolean value$iv2 = this.isMeasured;
            if ((!value$iv2) == true) goto L8;
            InlineClassHelperKt.throwIllegalArgumentException("Request was already measured!");
        L8:
            this.isMeasured = true;
            SubcomposeLayoutState.PrecomposedSlotHandle handle = this.precomposeHandle;
            if (handle == null) goto L14;
            int r1 = handle.getPlaceablesCount();
            int r2 = 0;
        L11:
            if (r2 >= r1) goto L13;
            int placeableIndex = r2;
            handle.mo5740premeasure0kLqBqw(placeableIndex, constraints);
            r2 = r2 + 1;
            goto L11
        L13:
            return;
        L14:
            InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("performComposition() must be called before performMeasure()");
            throw new KotlinNothingValueException();
        }

        private final NestedPrefetchController resolveNestedPrefetchStates() {
            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.precomposeHandle;
            if (precomposedSlotHandle == null) goto L9;
            final Ref.ObjectRef nestedStates = new Ref.ObjectRef();
            precomposedSlotHandle.traverseDescendants("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", new PrefetchHandleProvider$HandleAndRequestImpl$resolveNestedPrefetchStates$1(nestedStates));
            List it = (List) nestedStates.element;
            if (it != null) goto L11;
            return null;
        L11:
            return new NestedPrefetchController(this, it);
        L9:
            InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Should precompose before resolving nested prefetch states");
            throw new KotlinNothingValueException();
        }

        public String toString() {
            return "HandleAndRequestImpl { index = " + this.index + ", constraints = " + Constraints.m6931toStringimpl(this.constraints) + ", isComposed = " + isComposed() + ", isMeasured = " + this.isMeasured + ", isCanceled = " + this.isCanceled + " }";
        }
    }

    static {
        $stable = 8;
    }

    public PrefetchHandleProvider(LazyLayoutItemContentFactory itemContentFactory, SubcomposeLayoutState subcomposeLayoutState, PrefetchScheduler executor) {
        this.itemContentFactory = itemContentFactory;
        this.subcomposeLayoutState = subcomposeLayoutState;
        this.executor = executor;
    }

    public static final /* synthetic */ LazyLayoutItemContentFactory access$getItemContentFactory$p(PrefetchHandleProvider $this) {
        return $this.itemContentFactory;
    }

    public static final /* synthetic */ SubcomposeLayoutState access$getSubcomposeLayoutState$p(PrefetchHandleProvider $this) {
        return $this.subcomposeLayoutState;
    }

    /* JADX INFO: renamed from: schedulePrefetch-VKLhPVY, reason: not valid java name */
    public final LazyLayoutPrefetchState.PrefetchHandle m915schedulePrefetchVKLhPVY(int index, long constraints, PrefetchMetrics prefetchMetrics) {
        HandleAndRequestImpl it = new HandleAndRequestImpl(this, index, constraints, prefetchMetrics, null);
        this.executor.schedulePrefetch(it);
        return it;
    }

    /* JADX INFO: renamed from: createNestedPrefetchRequest-VKLhPVY, reason: not valid java name */
    public final PrefetchRequest m914createNestedPrefetchRequestVKLhPVY(int index, long constraints, PrefetchMetrics prefetchMetrics) {
        return new HandleAndRequestImpl(this, index, constraints, prefetchMetrics, null);
    }
}
