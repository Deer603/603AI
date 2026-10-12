package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: RepeatOnLifecycle.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aC\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042'\u0010\u0005\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\nH\u0086@¢\u0006\u0002\u0010\u000b\u001aC\u0010\u0000\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00042'\u0010\u0005\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\nH\u0086@¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"repeatOnLifecycle", "", "Landroidx/lifecycle/Lifecycle;", "state", "Landroidx/lifecycle/Lifecycle$State;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lifecycle-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RepeatOnLifecycleKt {

    /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3, reason: invalid class name */
    /* JADX INFO: compiled from: RepeatOnLifecycle.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ Lifecycle.State $state;
        final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
        /* JADX INFO: compiled from: RepeatOnLifecycle.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", i = {0, 0}, l = {161}, m = "invokeSuspend", n = {"launchedJob", "observer"}, s = {"L$0", "L$1"})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CoroutineScope $$this$coroutineScope;
            final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> $block;
            final /* synthetic */ Lifecycle.State $state;
            final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            Object L$5;
            int label;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Lifecycle r2, Lifecycle.State r3, CoroutineScope r4, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> r5, Continuation<? super AnonymousClass1> r6) {
                this.$this_repeatOnLifecycle = r2;
                this.$state = r3;
                this.$$this$coroutineScope = r4;
                this.$block = r5;
                super(2, r6);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r7, Continuation<?> r8) {
                return new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, this.$$this$coroutineScope, this.$block, r8);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
                return invoke2(r2, r3);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
                return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference failed for: r6v4, types: [T, androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch(this.label) {
                    case 0: goto L11;
                    case 1: goto L6;
                    default: goto L5;
                };
            L6:
                Function2 r5 = (Function2) this.L$5;
                CoroutineScope r6 = (CoroutineScope) this.L$4;
                Lifecycle r7 = (Lifecycle) this.L$3;
                Lifecycle.State r8 = (Lifecycle.State) this.L$2;
                Ref.ObjectRef observer = (Ref.ObjectRef) this.L$1;
                Ref.ObjectRef launchedJob = (Ref.ObjectRef) this.L$0;
                ResultKt.throwOnFailure($result);     // Catch: Throwable -> L9
            L22:
                Job r1 = (Job) launchedJob.element;
                if (r1 == null) goto L25;
                Job.DefaultImpls.cancel$default(r1, null, 1, null);
            L25:
                LifecycleEventObserver it = (LifecycleEventObserver) observer.element;
                if (it == null) goto L29;
                this.$this_repeatOnLifecycle.removeObserver(it);
            L29:
                return Unit.INSTANCE;
            L9:
                th = th;
            L32:
                Job r9 = (Job) launchedJob.element;
                if (r9 == null) goto L35;
                Job.DefaultImpls.cancel$default(r9, null, 1, null);
            L35:
                LifecycleEventObserver it2 = (LifecycleEventObserver) observer.element;
                if (it2 == null) goto L38;
                this.$this_repeatOnLifecycle.removeObserver(it2);
            L38:
                throw th;
            L11:
                ResultKt.throwOnFailure($result);
                if (this.$this_repeatOnLifecycle.getCurrentState() == Lifecycle.State.DESTROYED) goto L14;
                final Ref.ObjectRef launchedJob2 = new Ref.ObjectRef();
                observer = new Ref.ObjectRef();
                Lifecycle.State r10 = this.$state;     // Catch: Throwable -> L30
                Lifecycle r14 = this.$this_repeatOnLifecycle;     // Catch: Throwable -> L30
                final CoroutineScope r11 = this.$$this$coroutineScope;     // Catch: Throwable -> L30
                final Function2<CoroutineScope, Continuation<? super Unit>, Object> r13 = this.$block;     // Catch: Throwable -> L30
                this.L$0 = launchedJob2;     // Catch: Throwable -> L30
                this.L$1 = observer;     // Catch: Throwable -> L30
                this.L$2 = r10;     // Catch: Throwable -> L30
                this.L$3 = r14;     // Catch: Throwable -> L30
                this.L$4 = r11;     // Catch: Throwable -> L30
                this.L$5 = r13;     // Catch: Throwable -> L30
                this.label = 1;     // Catch: Throwable -> L30
                AnonymousClass1 uCont$iv = this;     // Catch: Throwable -> L30
                CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt.intercepted(uCont$iv), 1);     // Catch: Throwable -> L30
                cancellable$iv.initCancellability();     // Catch: Throwable -> L30
                final CancellableContinuationImpl cont = cancellable$iv;     // Catch: Throwable -> L30
                final Lifecycle.Event startWorkEvent = Lifecycle.Event.Companion.upTo(r10);     // Catch: Throwable -> L30
                final Lifecycle.Event cancelWorkEvent = Lifecycle.Event.Companion.downFrom(r10);     // Catch: Throwable -> L30
                final Mutex mutex = MutexKt.Mutex$default(false, 1, null);     // Catch: Throwable -> L30
                observer.element = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1(startWorkEvent, launchedJob2, r11, cancelWorkEvent, cont, mutex, r13);     // Catch: Throwable -> L30
                T r12 = observer.element;     // Catch: Throwable -> L30
                Intrinsics.checkNotNull(r12, "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver");     // Catch: Throwable -> L30
                r14.addObserver((LifecycleEventObserver) r12);     // Catch: Throwable -> L30
                Object r15 = cancellable$iv.getResult();     // Catch: Throwable -> L30
                if (r15 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L19;
                DebugProbesKt.probeCoroutineSuspended(this);     // Catch: Throwable -> L30
            L19:
                if (r15 != r0) goto L21;
                return r0;
            L21:
                launchedJob = launchedJob2;
            L30:
                th = th;
                launchedJob = launchedJob2;
                goto L32
            L14:
                return Unit.INSTANCE;
            L5:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(Lifecycle r2, Lifecycle.State r3, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> r4, Continuation<? super AnonymousClass3> r5) {
            this.$this_repeatOnLifecycle = r2;
            this.$state = r3;
            this.$block = r4;
            super(2, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
            AnonymousClass3 r0 = new AnonymousClass3(this.$this_repeatOnLifecycle, this.$state, this.$block, r6);
            r0.L$0 = r5;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass3) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
            CoroutineScope $this$coroutineScope = (CoroutineScope) this.L$0;
            this.label = 1;
            if (BuildersKt.withContext(Dispatchers.getMain().getImmediate(), new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, $this$coroutineScope, this.$block, null), this) != r0) goto L11;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final Object repeatOnLifecycle(Lifecycle $this$repeatOnLifecycle, Lifecycle.State state, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> r4, Continuation<? super Unit> r5) {
        if (state == Lifecycle.State.INITIALIZED) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L17;
        if ($this$repeatOnLifecycle.getCurrentState() == Lifecycle.State.DESTROYED) goto L10;
        Object r1 = CoroutineScopeKt.coroutineScope(new AnonymousClass3($this$repeatOnLifecycle, state, r4, null), r5);
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L15;
        return r1;
    L15:
        return Unit.INSTANCE;
    L10:
        return Unit.INSTANCE;
    L17:
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
    L5:
        r0 = false;
        goto L6
    }

    public static final Object repeatOnLifecycle(LifecycleOwner $this$repeatOnLifecycle, Lifecycle.State state, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> r4, Continuation<? super Unit> r5) {
        Object r0 = repeatOnLifecycle($this$repeatOnLifecycle.getLifecycle(), state, r4, r5);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }
}
