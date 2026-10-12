package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: AnimationState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u00020\u0004BY\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\b\u001a\u00028\u0001\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\u0010\u0012J\u0006\u00103\u001a\u00020\u0011J\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000105R&\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n8F@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R+\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e8F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\r\u0010\u0019\"\u0004\b\u001a\u0010\u001bR&\u0010\t\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n8F@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0016\"\u0004\b\u001f\u0010\u0018R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0013\u0010\u000b\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R+\u0010&\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00008F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\u001d\u001a\u0004\b'\u0010\"\"\u0004\b(\u0010)R\u0011\u0010+\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b,\u0010\"R&\u0010-\u001a\u00028\u00012\u0006\u0010\u0013\u001a\u00028\u0001@@X\u0086\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00066"}, d2 = {"Landroidx/compose/animation/core/AnimationScope;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "", "initialValue", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "initialVelocityVector", "lastFrameTimeNanos", "", "targetValue", "startTimeNanos", "isRunning", "", "onCancel", "Lkotlin/Function0;", "", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationVector;JLjava/lang/Object;JZLkotlin/jvm/functions/Function0;)V", "<set-?>", "finishedTimeNanos", "getFinishedTimeNanos", "()J", "setFinishedTimeNanos$animation_core_release", "(J)V", "()Z", "setRunning$animation_core_release", "(Z)V", "isRunning$delegate", "Landroidx/compose/runtime/MutableState;", "getLastFrameTimeNanos", "setLastFrameTimeNanos$animation_core_release", "getStartTimeNanos", "getTargetValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "value", "getValue", "setValue$animation_core_release", "(Ljava/lang/Object;)V", "value$delegate", "velocity", "getVelocity", "velocityVector", "getVelocityVector", "()Landroidx/compose/animation/core/AnimationVector;", "setVelocityVector$animation_core_release", "(Landroidx/compose/animation/core/AnimationVector;)V", "Landroidx/compose/animation/core/AnimationVector;", "cancelAnimation", "toAnimationState", "Landroidx/compose/animation/core/AnimationState;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AnimationScope<T, V extends AnimationVector> {
    public static final int $stable = 0;
    private long finishedTimeNanos;
    private final MutableState isRunning$delegate;
    private long lastFrameTimeNanos;
    private final Function0<Unit> onCancel;
    private final long startTimeNanos;
    private final T targetValue;
    private final TwoWayConverter<T, V> typeConverter;
    private final MutableState value$delegate;
    private V velocityVector;

    static {
        $stable = 8;
    }

    public AnimationScope(T r5, TwoWayConverter<T, V> r6, V r7, long r8, T r10, long r11, boolean r13, Function0<Unit> r14) {
        this.typeConverter = r6;
        this.targetValue = r10;
        this.startTimeNanos = r11;
        this.onCancel = r14;
        this.value$delegate = SnapshotStateKt.mutableStateOf$default(r5, null, 2, null);
        this.velocityVector = (V) AnimationVectorsKt.copy(r7);
        this.lastFrameTimeNanos = r8;
        this.finishedTimeNanos = Long.MIN_VALUE;
        this.isRunning$delegate = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(r13), null, 2, null);
    }

    public final TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    public final T getTargetValue() {
        return this.targetValue;
    }

    public final long getStartTimeNanos() {
        return this.startTimeNanos;
    }

    public final T getValue() {
        State $this$getValue$iv = this.value$delegate;
        return $this$getValue$iv.getValue();
    }

    public final void setValue$animation_core_release(T r4) {
        MutableState $this$setValue$iv = this.value$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final V getVelocityVector() {
        return this.velocityVector;
    }

    public final void setVelocityVector$animation_core_release(V r1) {
        this.velocityVector = r1;
    }

    public final long getLastFrameTimeNanos() {
        return this.lastFrameTimeNanos;
    }

    public final void setLastFrameTimeNanos$animation_core_release(long r1) {
        this.lastFrameTimeNanos = r1;
    }

    public final long getFinishedTimeNanos() {
        return this.finishedTimeNanos;
    }

    public final void setFinishedTimeNanos$animation_core_release(long r1) {
        this.finishedTimeNanos = r1;
    }

    public final boolean isRunning() {
        State $this$getValue$iv = this.isRunning$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    public final void setRunning$animation_core_release(boolean r5) {
        MutableState $this$setValue$iv = this.isRunning$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    public final T getVelocity() {
        return this.typeConverter.getConvertFromVector().invoke(this.velocityVector);
    }

    public final void cancelAnimation() {
        setRunning$animation_core_release(false);
        this.onCancel.invoke();
    }

    public final AnimationState<T, V> toAnimationState() {
        return new AnimationState(this.typeConverter, getValue(), this.velocityVector, this.lastFrameTimeNanos, this.finishedTimeNanos, isRunning());
    }
}
