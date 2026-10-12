package kotlinx.coroutines.flow;

import androidx.autofill.HintConstants;
import androidx.core.view.MotionEventCompat;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.FlowExceptions_commonKt;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

/* JADX INFO: compiled from: Reduce.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001a\u001e\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@¢\u0006\u0002\u0010\u0003\u001aB\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@¢\u0006\u0002\u0010\t\u001a \u0010\n\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@¢\u0006\u0002\u0010\u0003\u001aD\u0010\n\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@¢\u0006\u0002\u0010\t\u001av\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\f*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\r\u001a\u0002H\f2H\b\u0004\u0010\u000e\u001aB\b\u0001\u0012\u0013\u0012\u0011H\f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u0011H\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000fH\u0086H¢\u0006\u0002\u0010\u0014\u001a\u001e\u0010\u0015\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@¢\u0006\u0002\u0010\u0003\u001a \u0010\u0016\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@¢\u0006\u0002\u0010\u0003\u001ap\u0010\u0017\u001a\u0002H\u0018\"\u0004\b\u0000\u0010\u0018\"\b\b\u0001\u0010\u0001*\u0002H\u0018*\b\u0012\u0004\u0012\u0002H\u00010\u00022F\u0010\u000e\u001aB\b\u0001\u0012\u0013\u0012\u0011H\u0018¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u0011H\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000fH\u0086@¢\u0006\u0002\u0010\u001a\u001a\u001e\u0010\u001b\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@¢\u0006\u0002\u0010\u0003\u001a \u0010\u001c\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@¢\u0006\u0002\u0010\u0003¨\u0006\u001d"}, d2 = {"first", "T", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "predicate", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "firstOrNull", "fold", "R", "initial", "operation", "Lkotlin/Function3;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "acc", "value", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "last", "lastOrNull", "reduce", "S", "accumulator", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "single", "singleOrNull", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__ReduceKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1, reason: invalid class name */
    /* JADX INFO: compiled from: Reduce.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {179}, m = "first", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.first(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3, reason: invalid class name */
    /* JADX INFO: compiled from: Reduce.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0, 0}, l = {179}, m = "first", n = {"predicate", "result", "collector$iv"}, s = {"L$0", "L$1", "L$2"})
    static final class AnonymousClass3<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass3(Continuation<? super AnonymousClass3> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.first(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Reduce.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {179}, m = "firstOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    static final class C07631<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C07631(Continuation<? super C07631> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.firstOrNull(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Reduce.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {179}, m = "firstOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    static final class C07643<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C07643(Continuation<? super C07643> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.firstOrNull(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Reduce.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {MotionEventCompat.AXIS_GENERIC_9}, m = "fold", n = {"accumulator"}, s = {"L$0"})
    static final class C07651<T, R> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C07651(Continuation<? super C07651> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__ReduceKt.fold(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2, reason: invalid class name */
    /* JADX INFO: compiled from: Reduce.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ Ref.ObjectRef<R> $accumulator;
        final /* synthetic */ Function3<R, T, Continuation<? super R>, Object> $operation;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Ref.ObjectRef<R> r1, Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> r2) {
            this.$accumulator = r1;
            this.$operation = r2;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(T r8, Continuation<? super Unit> r9) {
            if ((r9 instanceof FlowKt__ReduceKt$fold$2$emit$1) == false) goto L7;
            FlowKt__ReduceKt$fold$2$emit$1 r0 = (FlowKt__ReduceKt$fold$2$emit$1) r9;
            if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
            r0.label -= Integer.MIN_VALUE;
        L8:
            Object r10 = r0.result;
            Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(r0.label) {
                case 0: goto L13;
                case 1: goto L12;
                default: goto L11;
            };
        L12:
            Ref.ObjectRef r11 = (Ref.ObjectRef) r0.L$0;
            ResultKt.throwOnFailure(r10);
            T r2 = (T) r10;
        L17:
            r11.element = r2;
            return Unit.INSTANCE;
        L13:
            ResultKt.throwOnFailure(r10);
            Ref.ObjectRef r3 = this.$accumulator;
            Function3<R, T, Continuation<? super R>, Object> r4 = this.$operation;
            T r5 = this.$accumulator.element;
            r0.L$0 = r3;
            r0.label = 1;
            Object r12 = r4.invoke((R) r5, r8, r0);
            if (r12 != r1) goto L16;
            return r1;
        L16:
            r2 = (T) r12;
            r11 = r3;
            goto L17
        L11:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L7:
            r0 = new FlowKt__ReduceKt$fold$2$emit$1(this, r9);
            goto L8
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final Object emit$$forInline(T r4, Continuation<? super Unit> r5) {
            new FlowKt__ReduceKt$fold$2$emit$1(this, r5);
            Ref.ObjectRef<R> r0 = this.$accumulator;
            r0.element = (T) this.$operation.invoke((R) this.$accumulator.element, r4, (Continuation<? super R>) r5);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$last$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Reduce.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {151}, m = "last", n = {"result"}, s = {"L$0"})
    static final class C07661<T> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C07661(Continuation<? super C07661> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.last(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Reduce.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {163}, m = "lastOrNull", n = {"result"}, s = {"L$0"})
    static final class C07681<T> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C07681(Continuation<? super C07681> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.lastOrNull(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Reduce.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {18}, m = "reduce", n = {"accumulator"}, s = {"L$0"})
    static final class C07701<S, T extends S> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C07701(Continuation<? super C07701> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.reduce(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Reduce.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u0002H\u00022\u0006\u0010\u0004\u001a\u0002H\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "S", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class C07712<T> implements FlowCollector {
        final /* synthetic */ Ref.ObjectRef<Object> $accumulator;
        final /* synthetic */ Function3<S, T, Continuation<? super S>, Object> $operation;

        /* JADX WARN: Multi-variable type inference failed */
        C07712(Ref.ObjectRef<Object> r1, Function3<? super S, ? super T, ? super Continuation<? super S>, ? extends Object> r2) {
            this.$accumulator = r1;
            this.$operation = r2;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(T r8, Continuation<? super Unit> r9) {
            if ((r9 instanceof FlowKt__ReduceKt$reduce$2$emit$1) == false) goto L7;
            FlowKt__ReduceKt$reduce$2$emit$1 r0 = (FlowKt__ReduceKt$reduce$2$emit$1) r9;
            if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
            r0.label -= Integer.MIN_VALUE;
        L8:
            Object r10 = r0.result;
            Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(r0.label) {
                case 0: goto L13;
                case 1: goto L12;
                default: goto L11;
            };
        L12:
            Ref.ObjectRef<Object> r11 = (Ref.ObjectRef) r0.L$0;
            ResultKt.throwOnFailure(r10);
            Object r2 = r10;
        L19:
            Ref.ObjectRef<Object> r3 = r11;
            r8 = (T) r2;
        L21:
            r3.element = r8;
            return Unit.INSTANCE;
        L13:
            ResultKt.throwOnFailure(r10);
            r3 = this.$accumulator;
            if (this.$accumulator.element == NullSurrogateKt.NULL) goto L21;
            Function3<S, T, Continuation<? super S>, Object> r4 = this.$operation;
            Object r5 = this.$accumulator.element;
            r0.L$0 = r3;
            r0.label = 1;
            Object r12 = r4.invoke((S) r5, r8, r0);
            if (r12 != r1) goto L18;
            return r1;
        L18:
            r2 = r12;
            r11 = r3;
            goto L19
        L11:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L7:
            r0 = new FlowKt__ReduceKt$reduce$2$emit$1(this, r9);
            goto L8
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$single$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Reduce.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {53}, m = "single", n = {"result"}, s = {"L$0"})
    static final class C07721<T> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C07721(Continuation<? super C07721> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.single(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Reduce.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {179}, m = "singleOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    static final class C07741<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C07741(Continuation<? super C07741> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.singleOrNull(null, this);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, kotlinx.coroutines.internal.Symbol] */
    public static final <S, T extends S> Object reduce(Flow<? extends T> r5, Function3<? super S, ? super T, ? super Continuation<? super S>, ? extends Object> r6, Continuation<? super S> r7) {
        if ((r7 instanceof C07701) == false) goto L7;
        C07701 r0 = (C07701) r7;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        Ref.ObjectRef accumulator = (Ref.ObjectRef) r0.L$0;
        ResultKt.throwOnFailure($result);
    L18:
        if (accumulator.element == NullSurrogateKt.NULL) goto L22;
        return accumulator.element;
    L22:
        throw new NoSuchElementException("Empty flow can't be reduced");
    L13:
        ResultKt.throwOnFailure($result);
        Ref.ObjectRef accumulator2 = new Ref.ObjectRef();
        accumulator2.element = NullSurrogateKt.NULL;
        FlowCollector<? super Object> r3 = new C07712(accumulator2, r6);
        r0.L$0 = accumulator2;
        r0.label = 1;
        if (r5.collect(r3, r0) != r1) goto L16;
        return r1;
    L16:
        accumulator = accumulator2;
        goto L18
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C07701(r7);
        goto L8
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> Object fold(Flow<? extends T> r5, R r6, Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> r7, Continuation<? super R> r8) {
        if ((r8 instanceof C07651) == false) goto L7;
        C07651 r0 = (C07651) r8;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        Ref.ObjectRef accumulator = (Ref.ObjectRef) r0.L$0;
        ResultKt.throwOnFailure($result);
    L18:
        return accumulator.element;
    L13:
        ResultKt.throwOnFailure($result);
        Ref.ObjectRef accumulator2 = new Ref.ObjectRef();
        accumulator2.element = r6;
        FlowCollector<? super Object> r9 = new AnonymousClass2(accumulator2, r7);
        r0.L$0 = accumulator2;
        r0.label = 1;
        if (r5.collect(r9, r0) != r1) goto L16;
        return r1;
    L16:
        accumulator = accumulator2;
        goto L18
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C07651(r8);
        goto L8
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T, R> Object fold$$forInline(Flow<? extends T> r3, R r4, Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> r5, Continuation<? super R> r6) {
        Ref.ObjectRef accumulator = new Ref.ObjectRef();
        accumulator.element = r4;
        r3.collect(new AnonymousClass2(accumulator, r5), r6);
        return accumulator.element;
    }

    public static final <T> Object single(Flow<? extends T> r5, Continuation<? super T> r6) {
        if ((r6 instanceof C07721) == false) goto L7;
        C07721 r0 = (C07721) r6;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object r7 = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        Ref.ObjectRef r8 = (Ref.ObjectRef) r0.L$0;
        ResultKt.throwOnFailure(r7);
    L18:
        if (r8.element == NullSurrogateKt.NULL) goto L22;
        return r8.element;
    L22:
        throw new NoSuchElementException("Flow is empty");
    L13:
        ResultKt.throwOnFailure(r7);
        final Ref.ObjectRef r2 = new Ref.ObjectRef();
        r2.element = (T) NullSurrogateKt.NULL;
        FlowCollector<? super Object> r3 = new C07732(r2);
        r0.L$0 = r2;
        r0.label = 1;
        if (r5.collect(r3, r0) != r1) goto L16;
        return r1;
    L16:
        r8 = r2;
        goto L18
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C07721(r6);
        goto L8
    }

    public static final <T> Object singleOrNull(Flow<? extends T> r7, Continuation<? super T> r8) {
        if ((r8 instanceof C07741) == false) goto L7;
        C07741 r0 = (C07741) r8;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object r9 = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L17;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        FlowCollector<T> r2 = (FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1) r0.L$1;
        final Ref.ObjectRef r3 = (Ref.ObjectRef) r0.L$0;
        ResultKt.throwOnFailure(r9);     // Catch: AbortFlowException -> L15
    L27:
        if (r3.element != NullSurrogateKt.NULL) goto L30;
        return null;
    L30:
        return r3.element;
    L15:
        AbortFlowException e = e;
    L25:
        FlowExceptions_commonKt.checkOwnership(e, r2);
        goto L27
    L17:
        ResultKt.throwOnFailure(r9);
        r3 = new Ref.ObjectRef();
        r3.element = (T) NullSurrogateKt.NULL;
        FlowCollector<T> r4 = new FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1(r3);
        r0.L$0 = r3;     // Catch: AbortFlowException -> L23
        r0.L$1 = r4;     // Catch: AbortFlowException -> L23
        r0.label = 1;     // Catch: AbortFlowException -> L23
        if (r7.collect(r4, r0) != r1) goto L27;
        return r1;
    L23:
        e = move-exception;
        e = e;
        r2 = r4;
        goto L25
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C07741(r8);
        goto L8
    }

    public static final <T> Object first(Flow<? extends T> r7, Continuation<? super T> r8) {
        if ((r8 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r8;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object r9 = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L17;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        FlowCollector<T> r2 = (FlowKt__ReduceKt$first$$inlined$collectWhile$1) r0.L$1;
        final Ref.ObjectRef r3 = (Ref.ObjectRef) r0.L$0;
        ResultKt.throwOnFailure(r9);     // Catch: AbortFlowException -> L15
    L27:
        if (r3.element == NullSurrogateKt.NULL) goto L31;
        return r3.element;
    L31:
        throw new NoSuchElementException("Expected at least one element");
    L15:
        AbortFlowException e = e;
    L25:
        FlowExceptions_commonKt.checkOwnership(e, r2);
        goto L27
    L17:
        ResultKt.throwOnFailure(r9);
        r3 = new Ref.ObjectRef();
        r3.element = (T) NullSurrogateKt.NULL;
        FlowCollector<T> r4 = new FlowKt__ReduceKt$first$$inlined$collectWhile$1(r3);
        r0.L$0 = r3;     // Catch: AbortFlowException -> L23
        r0.L$1 = r4;     // Catch: AbortFlowException -> L23
        r0.label = 1;     // Catch: AbortFlowException -> L23
        if (r7.collect(r4, r0) != r1) goto L27;
        return r1;
    L23:
        e = move-exception;
        e = e;
        r2 = r4;
        goto L25
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AnonymousClass1(r8);
        goto L8
    }

    public static final <T> Object first(Flow<? extends T> r7, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> r8, Continuation<? super T> r9) {
        if ((r9 instanceof AnonymousClass3) == false) goto L7;
        AnonymousClass3 r0 = (AnonymousClass3) r9;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object r10 = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L17;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        FlowCollector<? super Object> r11 = (FlowKt__ReduceKt$first$$inlined$collectWhile$2) r0.L$2;
        Ref.ObjectRef r2 = (Ref.ObjectRef) r0.L$1;
        Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> r3 = (Function2) r0.L$0;
        ResultKt.throwOnFailure(r10);     // Catch: AbortFlowException -> L15
    L27:
        if (r2.element == NullSurrogateKt.NULL) goto L31;
        return r2.element;
    L31:
        throw new NoSuchElementException("Expected at least one element matching the predicate " + r3);
    L15:
        AbortFlowException e = e;
    L25:
        FlowExceptions_commonKt.checkOwnership(e, r11);
        goto L27
    L17:
        ResultKt.throwOnFailure(r10);
        r3 = r8;
        Ref.ObjectRef r12 = new Ref.ObjectRef();
        r12.element = (T) NullSurrogateKt.NULL;
        FlowCollector<? super Object> r4 = new FlowKt__ReduceKt$first$$inlined$collectWhile$2(r3, r12);
        r0.L$0 = r3;     // Catch: AbortFlowException -> L23
        r0.L$1 = r12;     // Catch: AbortFlowException -> L23
        r0.L$2 = r4;     // Catch: AbortFlowException -> L23
        r0.label = 1;     // Catch: AbortFlowException -> L23
        if (r7.collect(r4, r0) != r1) goto L21;
        return r1;
    L21:
        r2 = r12;
    L23:
        e = move-exception;
        e = e;
        r2 = r12;
        r11 = r4;
        goto L25
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AnonymousClass3(r9);
        goto L8
    }

    public static final <T> Object firstOrNull(Flow<? extends T> r7, Continuation<? super T> r8) {
        if ((r8 instanceof C07631) == false) goto L7;
        C07631 r0 = (C07631) r8;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L17;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        FlowCollector<T> r2 = (FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1) r0.L$1;
        final Ref.ObjectRef result = (Ref.ObjectRef) r0.L$0;
        ResultKt.throwOnFailure($result);     // Catch: AbortFlowException -> L15
    L27:
        return result.element;
    L15:
        AbortFlowException e$iv = e;
    L25:
        FlowExceptions_commonKt.checkOwnership(e$iv, r2);
        goto L27
    L17:
        ResultKt.throwOnFailure($result);
        result = new Ref.ObjectRef();
        FlowCollector<T> r4 = new FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1(result);
        r0.L$0 = result;     // Catch: AbortFlowException -> L23
        r0.L$1 = r4;     // Catch: AbortFlowException -> L23
        r0.label = 1;     // Catch: AbortFlowException -> L23
        if (r7.collect(r4, r0) != r1) goto L27;
        return r1;
    L23:
        e = move-exception;
        e$iv = e;
        r2 = r4;
        goto L25
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C07631(r8);
        goto L8
    }

    public static final <T> Object firstOrNull(Flow<? extends T> r6, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> r7, Continuation<? super T> r8) {
        if ((r8 instanceof C07643) == false) goto L7;
        C07643 r0 = (C07643) r8;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L17;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        FlowCollector<? super Object> collector$iv = (FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) r0.L$1;
        Ref.ObjectRef result = (Ref.ObjectRef) r0.L$0;
        ResultKt.throwOnFailure($result);     // Catch: AbortFlowException -> L15
    L27:
        return result.element;
    L15:
        AbortFlowException e$iv = e;
    L25:
        FlowExceptions_commonKt.checkOwnership(e$iv, collector$iv);
        goto L27
    L17:
        ResultKt.throwOnFailure($result);
        Ref.ObjectRef result2 = new Ref.ObjectRef();
        FlowCollector<? super Object> collector$iv2 = new FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2(r7, result2);
        r0.L$0 = result2;     // Catch: AbortFlowException -> L23
        r0.L$1 = collector$iv2;     // Catch: AbortFlowException -> L23
        r0.label = 1;     // Catch: AbortFlowException -> L23
        if (r6.collect(collector$iv2, r0) != r1) goto L21;
        return r1;
    L21:
        result = result2;
    L23:
        e = move-exception;
        result = result2;
        collector$iv = collector$iv2;
        e$iv = e;
        goto L25
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C07643(r8);
        goto L8
    }

    public static final <T> Object last(Flow<? extends T> r5, Continuation<? super T> r6) {
        if ((r6 instanceof C07661) == false) goto L7;
        C07661 r0 = (C07661) r6;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object r7 = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        Ref.ObjectRef r8 = (Ref.ObjectRef) r0.L$0;
        ResultKt.throwOnFailure(r7);
    L18:
        if (r8.element == NullSurrogateKt.NULL) goto L22;
        return r8.element;
    L22:
        throw new NoSuchElementException("Expected at least one element");
    L13:
        ResultKt.throwOnFailure(r7);
        final Ref.ObjectRef r2 = new Ref.ObjectRef();
        r2.element = (T) NullSurrogateKt.NULL;
        FlowCollector<? super Object> r3 = new C07672(r2);
        r0.L$0 = r2;
        r0.label = 1;
        if (r5.collect(r3, r0) != r1) goto L16;
        return r1;
    L16:
        r8 = r2;
        goto L18
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C07661(r6);
        goto L8
    }

    public static final <T> Object lastOrNull(Flow<? extends T> r5, Continuation<? super T> r6) {
        if ((r6 instanceof C07681) == false) goto L7;
        C07681 r0 = (C07681) r6;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        Ref.ObjectRef result = (Ref.ObjectRef) r0.L$0;
        ResultKt.throwOnFailure($result);
    L18:
        return result.element;
    L13:
        ResultKt.throwOnFailure($result);
        final Ref.ObjectRef result2 = new Ref.ObjectRef();
        FlowCollector<? super Object> r3 = new C07692(result2);
        r0.L$0 = result2;
        r0.label = 1;
        if (r5.collect(r3, r0) != r1) goto L16;
        return r1;
    L16:
        result = result2;
        goto L18
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C07681(r6);
        goto L8
    }
}
