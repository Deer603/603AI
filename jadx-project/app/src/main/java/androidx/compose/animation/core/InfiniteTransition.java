package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: InfiniteTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001'B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J!\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0007R\u00020\u0000H\u0000¢\u0006\u0002\b\u001fJ\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001bH\u0002J!\u0010\"\u001a\u00020\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0007R\u00020\u0000H\u0000¢\u0006\u0002\b#J\u000f\u0010$\u001a\u00020\u001dH\u0001¢\u0006\u0004\b%\u0010&R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0007R\u00020\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0007R\u00020\u00000\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR+\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R+\u0010\u0016\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Landroidx/compose/animation/core/InfiniteTransition;", "", "label", "", "(Ljava/lang/String;)V", "_animations", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;", "animations", "", "getAnimations", "()Ljava/util/List;", "<set-?>", "", "isRunning", "()Z", "setRunning", "(Z)V", "isRunning$delegate", "Landroidx/compose/runtime/MutableState;", "getLabel", "()Ljava/lang/String;", "refreshChildNeeded", "getRefreshChildNeeded", "setRefreshChildNeeded", "refreshChildNeeded$delegate", "startTimeNanos", "", "addAnimation", "", "animation", "addAnimation$animation_core_release", "onFrame", "playTimeNanos", "removeAnimation", "removeAnimation$animation_core_release", "run", "run$animation_core_release", "(Landroidx/compose/runtime/Composer;I)V", "TransitionAnimationState", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class InfiniteTransition {
    public static final int $stable = 0;
    private final MutableVector<TransitionAnimationState<?, ?>> _animations;
    private final MutableState isRunning$delegate;
    private final String label;
    private final MutableState refreshChildNeeded$delegate;
    private long startTimeNanos;

    /* JADX INFO: compiled from: InfiniteTransition.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\n\b\u0086\u0004\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004BA\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0015\u00100\u001a\u0002012\u0006\u00102\u001a\u00020%H\u0000¢\u0006\u0002\b3J\r\u00104\u001a\u000201H\u0000¢\u0006\u0002\b5J\r\u00106\u001a\u000201H\u0000¢\u0006\u0002\b7J-\u00108\u001a\u0002012\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0000¢\u0006\u0004\b9\u0010:R<\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u00028\u0000X\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001dX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u00028\u0000X\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b'\u0010\u0018\"\u0004\b(\u0010\u001aR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R+\u0010+\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b,\u0010\u0018\"\u0004\b-\u0010\u001a¨\u0006;"}, d2 = {"Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/runtime/State;", "initialValue", "targetValue", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "label", "", "(Landroidx/compose/animation/core/InfiniteTransition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;)V", "<set-?>", "Landroidx/compose/animation/core/TargetBasedAnimation;", "animation", "getAnimation", "()Landroidx/compose/animation/core/TargetBasedAnimation;", "setAnimation$animation_core_release", "(Landroidx/compose/animation/core/TargetBasedAnimation;)V", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "getInitialValue$animation_core_release", "()Ljava/lang/Object;", "setInitialValue$animation_core_release", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "isFinished", "", "isFinished$animation_core_release", "()Z", "setFinished$animation_core_release", "(Z)V", "getLabel", "()Ljava/lang/String;", "playTimeNanosOffset", "", "startOnTheNextFrame", "getTargetValue$animation_core_release", "setTargetValue$animation_core_release", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "value", "getValue", "setValue$animation_core_release", "value$delegate", "Landroidx/compose/runtime/MutableState;", "onPlayTimeChanged", "", "playTimeNanos", "onPlayTimeChanged$animation_core_release", "reset", "reset$animation_core_release", "skipToEnd", "skipToEnd$animation_core_release", "updateValues", "updateValues$animation_core_release", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;)V", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {
        private TargetBasedAnimation<T, V> animation;
        private AnimationSpec<T> animationSpec;
        private T initialValue;
        private boolean isFinished;
        private final String label;
        private long playTimeNanosOffset;
        private boolean startOnTheNextFrame;
        private T targetValue;
        final /* synthetic */ InfiniteTransition this$0;
        private final TwoWayConverter<T, V> typeConverter;
        private final MutableState value$delegate;

        public TransitionAnimationState(InfiniteTransition this$0, T r11, T r12, TwoWayConverter<T, V> r13, AnimationSpec<T> r14, String label) {
            this.this$0 = this$0;
            this.initialValue = r11;
            this.targetValue = r12;
            this.typeConverter = r13;
            this.label = label;
            this.value$delegate = SnapshotStateKt.mutableStateOf$default(this.initialValue, null, 2, null);
            this.animationSpec = r14;
            this.animation = new TargetBasedAnimation(this.animationSpec, this.typeConverter, this.initialValue, this.targetValue, null, 16, null);
        }

        public final T getInitialValue$animation_core_release() {
            return this.initialValue;
        }

        public final void setInitialValue$animation_core_release(T r1) {
            this.initialValue = r1;
        }

        public final T getTargetValue$animation_core_release() {
            return this.targetValue;
        }

        public final void setTargetValue$animation_core_release(T r1) {
            this.targetValue = r1;
        }

        public final TwoWayConverter<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        public final String getLabel() {
            return this.label;
        }

        @Override // androidx.compose.runtime.State
        public T getValue() {
            State $this$getValue$iv = this.value$delegate;
            return $this$getValue$iv.getValue();
        }

        public void setValue$animation_core_release(T r4) {
            MutableState $this$setValue$iv = this.value$delegate;
            $this$setValue$iv.setValue(r4);
        }

        public final AnimationSpec<T> getAnimationSpec() {
            return this.animationSpec;
        }

        public final TargetBasedAnimation<T, V> getAnimation() {
            return this.animation;
        }

        public final void setAnimation$animation_core_release(TargetBasedAnimation<T, V> r1) {
            this.animation = r1;
        }

        public final boolean isFinished$animation_core_release() {
            return this.isFinished;
        }

        public final void setFinished$animation_core_release(boolean r1) {
            this.isFinished = r1;
        }

        public final void updateValues$animation_core_release(T r9, T r10, AnimationSpec<T> r11) {
            this.initialValue = r9;
            this.targetValue = r10;
            this.animationSpec = r11;
            this.animation = new TargetBasedAnimation(r11, this.typeConverter, r9, r10, null, 16, null);
            InfiniteTransition.access$setRefreshChildNeeded(this.this$0, true);
            this.isFinished = false;
            this.startOnTheNextFrame = true;
        }

        public final void onPlayTimeChanged$animation_core_release(long playTimeNanos) {
            InfiniteTransition.access$setRefreshChildNeeded(this.this$0, false);
            if (this.startOnTheNextFrame == false) goto L5;
            this.startOnTheNextFrame = false;
            this.playTimeNanosOffset = playTimeNanos;
        L5:
            long playTime = playTimeNanos - this.playTimeNanosOffset;
            setValue$animation_core_release(this.animation.getValueFromNanos(playTime));
            this.isFinished = this.animation.isFinishedFromNanos(playTime);
        }

        public final void skipToEnd$animation_core_release() {
            setValue$animation_core_release(this.animation.getTargetValue());
            this.startOnTheNextFrame = true;
        }

        public final void reset$animation_core_release() {
            this.startOnTheNextFrame = true;
        }
    }

    static {
        $stable = 8;
    }

    public InfiniteTransition(String label) {
        this.label = label;
        this._animations = new MutableVector(new TransitionAnimationState[16], 0);
        this.refreshChildNeeded$delegate = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.startTimeNanos = Long.MIN_VALUE;
        this.isRunning$delegate = SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
    }

    public static final /* synthetic */ long access$getStartTimeNanos$p(InfiniteTransition $this) {
        return $this.startTimeNanos;
    }

    public static final /* synthetic */ MutableVector access$get_animations$p(InfiniteTransition $this) {
        return $this._animations;
    }

    public static final /* synthetic */ void access$onFrame(InfiniteTransition $this, long playTimeNanos) {
        $this.onFrame(playTimeNanos);
    }

    public static final /* synthetic */ void access$setRefreshChildNeeded(InfiniteTransition $this, boolean r1) {
        $this.setRefreshChildNeeded(r1);
    }

    public static final /* synthetic */ void access$setStartTimeNanos$p(InfiniteTransition $this, long r1) {
        $this.startTimeNanos = r1;
    }

    public final String getLabel() {
        return this.label;
    }

    private final boolean getRefreshChildNeeded() {
        State $this$getValue$iv = this.refreshChildNeeded$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    private final void setRefreshChildNeeded(boolean r5) {
        MutableState $this$setValue$iv = this.refreshChildNeeded$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    private final boolean isRunning() {
        State $this$getValue$iv = this.isRunning$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    private final void setRunning(boolean r5) {
        MutableState $this$setValue$iv = this.isRunning$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    public final List<TransitionAnimationState<?, ?>> getAnimations() {
        return this._animations.asMutableList();
    }

    public final void addAnimation$animation_core_release(TransitionAnimationState<?, ?> r2) {
        this._animations.add(r2);
        setRefreshChildNeeded(true);
    }

    public final void removeAnimation$animation_core_release(TransitionAnimationState<?, ?> r2) {
        this._animations.remove(r2);
    }

    public final void run$animation_core_release(Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-318043801);
        ComposerKt.sourceInformation($composer2, "C(run)165@6993L47:InfiniteTransition.kt#pdpnli");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(this) == false) goto L7;
        int r2 = 4;
    L8:
        $dirty = $dirty | r2;
        goto L10
    L7:
        r2 = 2;
    L10:
        if (($dirty & 3) == 2) goto L12;
        boolean r3 = true;
    L14:
        if ($composer2.shouldExecute(r3, $dirty & 1) == true) goto L16;
        $composer2.skipToGroupEnd();
    L40:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L44;
        r0.updateScope(new InfiniteTransition$run$2(this, $changed));
        return;
    L44:
        return;
    L16:
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventStart(-318043801, $dirty, -1, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:164)");
    L18:
        ComposerKt.sourceInformationMarkerStart($composer2, 748212409, "CC(remember):InfiniteTransition.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L22;
        Object value$iv = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L22:
        MutableState toolingOverride = (MutableState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (isRunning() == false) goto L25;
    L28:
        $composer2.startReplaceGroup(1719883733);
        ComposerKt.sourceInformation($composer2, "167@7121L1398,167@7100L1419");
        ComposerKt.sourceInformationMarkerStart($composer2, 748217856, "CC(remember):InfiniteTransition.kt#9igjgp");
        boolean invalid$iv = $composer2.changedInstance(this);
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv == false) goto L31;
    L34:
        Object value$iv2 = (Function2) new InfiniteTransition$run$1$1(toolingOverride, this, null);
        $composer2.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L35:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.LaunchedEffect(this, (Function2) it$iv2, $composer2, $dirty & 14);
        $composer2.endReplaceGroup();
    L37:
        if (ComposerKt.isTraceInProgress() == false) goto L40;
        ComposerKt.traceEventEnd();
        goto L40
    L31:
        if (it$iv2 != Composer.Companion.getEmpty()) goto L35;
    L25:
        if (getRefreshChildNeeded() == true) goto L28;
        $composer2.startReplaceGroup(1721270456);
        $composer2.endReplaceGroup();
        goto L37
    L12:
        r3 = false;
        goto L14
    }

    private final void onFrame(long playTimeNanos) {
        boolean allFinished = true;
        MutableVector<TransitionAnimationState<?, ?>> r1 = this._animations;
        int i$iv = 0;
        Object[] content$iv = r1.content;
        int size$iv = r1.getSize();
    L3:
        if (i$iv >= size$iv) goto L11;
        TransitionAnimationState<?, ?> r6 = (TransitionAnimationState) content$iv[i$iv];
        if (r6.isFinished$animation_core_release() == true) goto L8;
        r6.onPlayTimeChanged$animation_core_release(playTimeNanos);
    L8:
        if (r6.isFinished$animation_core_release() == true) goto L10;
        allFinished = false;
    L10:
        i$iv = i$iv + 1;
        goto L3
    L11:
        setRunning(!allFinished);
    }
}
