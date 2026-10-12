package androidx.compose.foundation.gestures;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: TransformableState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001BR\u0012K\u0010\u0002\u001aG\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\u0002\u0010\fJ?\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001a2'\u0010\u001b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001c¢\u0006\u0002\b\u001fH\u0096@¢\u0006\u0002\u0010 R\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000RV\u0010\u0002\u001aG\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Landroidx/compose/foundation/gestures/DefaultTransformableState;", "Landroidx/compose/foundation/gestures/TransformableState;", "onTransformation", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "zoomChange", "Landroidx/compose/ui/geometry/Offset;", "panChange", "rotationChange", "", "(Lkotlin/jvm/functions/Function3;)V", "isTransformInProgress", "", "()Z", "isTransformingState", "Landroidx/compose/runtime/MutableState;", "getOnTransformation", "()Lkotlin/jvm/functions/Function3;", "transformMutex", "Landroidx/compose/foundation/MutatorMutex;", "transformScope", "Landroidx/compose/foundation/gestures/TransformScope;", "transform", "transformPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DefaultTransformableState implements TransformableState {
    private final MutableState<Boolean> isTransformingState;
    private final Function3<Float, Offset, Float, Unit> onTransformation;
    private final MutatorMutex transformMutex;
    private final TransformScope transformScope;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DefaultTransformableState$transform$2, reason: invalid class name */
    /* JADX INFO: compiled from: TransformableState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2", f = "TransformableState.kt", i = {}, l = {443}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<TransformScope, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ MutatePriority $transformPriority;
        int label;
        final /* synthetic */ DefaultTransformableState this$0;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DefaultTransformableState$transform$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: TransformableState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/TransformScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2$1", f = "TransformableState.kt", i = {}, l = {446}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function2<TransformScope, Continuation<? super Unit>, Object> $block;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DefaultTransformableState this$0;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(DefaultTransformableState r2, Function2<? super TransformScope, ? super Continuation<? super Unit>, ? extends Object> r3, Continuation<? super AnonymousClass1> r4) {
                this.this$0 = r2;
                this.$block = r3;
                super(2, r4);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
                AnonymousClass1 r0 = new AnonymousClass1(this.this$0, this.$block, r5);
                r0.L$0 = r4;
                return r0;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(TransformScope r3, Continuation<? super Unit> r4) {
                return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(TransformScope r2, Continuation<? super Unit> r3) {
                return invoke2(r2, r3);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch(this.label) {
                    case 0: goto L10;
                    case 1: goto L6;
                    default: goto L5;
                };
            L6:
                ResultKt.throwOnFailure($result);     // Catch: Throwable -> L8
            L14:
                DefaultTransformableState.access$isTransformingState$p(this.this$0).setValue(Boxing.boxBoolean(false));
                return Unit.INSTANCE;
            L10:
                ResultKt.throwOnFailure($result);
                TransformScope $this$mutateWith = (TransformScope) this.L$0;
                DefaultTransformableState.access$isTransformingState$p(this.this$0).setValue(Boxing.boxBoolean(true));
                Function2<TransformScope, Continuation<? super Unit>, Object> r3 = this.$block;     // Catch: Throwable -> L8
                this.label = 1;     // Catch: Throwable -> L8
                if (r3.invoke($this$mutateWith, this) != r0) goto L14;
                return r0;
            L5:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            L8:
                th = move-exception;
                DefaultTransformableState.access$isTransformingState$p(this.this$0).setValue(Boxing.boxBoolean(false));
                throw th;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(DefaultTransformableState r2, MutatePriority r3, Function2<? super TransformScope, ? super Continuation<? super Unit>, ? extends Object> r4, Continuation<? super AnonymousClass2> r5) {
            this.this$0 = r2;
            this.$transformPriority = r3;
            this.$block = r4;
            super(2, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
            return new AnonymousClass2(this.this$0, this.$transformPriority, this.$block, r6);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
            if (DefaultTransformableState.access$getTransformMutex$p(this.this$0).mutateWith(DefaultTransformableState.access$getTransformScope$p(this.this$0), this.$transformPriority, new AnonymousClass1(this.this$0, this.$block, null), this) != r0) goto L11;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultTransformableState(Function3<? super Float, ? super Offset, ? super Float, Unit> r4) {
        this.onTransformation = r4;
        this.transformScope = new DefaultTransformableState$transformScope$1(this);
        this.transformMutex = new MutatorMutex();
        this.isTransformingState = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    public static final /* synthetic */ MutatorMutex access$getTransformMutex$p(DefaultTransformableState $this) {
        return $this.transformMutex;
    }

    public static final /* synthetic */ TransformScope access$getTransformScope$p(DefaultTransformableState $this) {
        return $this.transformScope;
    }

    public static final /* synthetic */ MutableState access$isTransformingState$p(DefaultTransformableState $this) {
        return $this.isTransformingState;
    }

    public final Function3<Float, Offset, Float, Unit> getOnTransformation() {
        return this.onTransformation;
    }

    @Override // androidx.compose.foundation.gestures.TransformableState
    public Object transform(MutatePriority transformPriority, Function2<? super TransformScope, ? super Continuation<? super Unit>, ? extends Object> r4, Continuation<? super Unit> r5) {
        Object r0 = CoroutineScopeKt.coroutineScope(new AnonymousClass2(this, transformPriority, r4, null), r5);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.TransformableState
    public boolean isTransformInProgress() {
        return this.isTransformingState.getValue().booleanValue();
    }
}
