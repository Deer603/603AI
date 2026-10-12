package kotlinx.coroutines.flow;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlowMerge;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge;
import kotlinx.coroutines.internal.SystemPropsKt;

/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0004\b\u0000\u0010\u000b2\u001e\u0010\f\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\r\"\b\u0012\u0004\u0012\u0002H\u000b0\n¢\u0006\u0002\u0010\u000e\u001ab\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00100\n\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u000b0\n27\u0010\u0011\u001a3\b\u0001\u0012\u0013\u0012\u0011H\u000b¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100\n0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0012H\u0007¢\u0006\u0002\u0010\u0018\u001ae\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00100\n\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u000b0\n29\b\u0005\u0010\u0011\u001a3\b\u0001\u0012\u0013\u0012\u0011H\u000b¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100\n0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0012H\u0087\b¢\u0006\u0002\u0010\u0018\u001al\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00100\n\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u000b0\n2\b\b\u0002\u0010\u001b\u001a\u00020\u000127\u0010\u0011\u001a3\b\u0001\u0012\u0013\u0012\u0011H\u000b¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100\n0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0012H\u0007¢\u0006\u0002\u0010\u001c\u001a$\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0004\b\u0000\u0010\u000b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\nH\u0007\u001a.\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0004\b\u0000\u0010\u000b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\n2\b\b\u0002\u0010\u001b\u001a\u00020\u0001H\u0007\u001a^\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00100\n\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u000b0\n23\b\u0001\u0010\u0011\u001a-\b\u0001\u0012\u0013\u0012\u0011H\u000b¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0012H\u0007¢\u0006\u0002\u0010\u0018\u001a\"\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0004\b\u0000\u0010\u000b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0 \u001ao\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00100\n\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u000b0\n2D\b\u0001\u0010\u0011\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100#\u0012\u0013\u0012\u0011H\u000b¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\"¢\u0006\u0002\b%H\u0007¢\u0006\u0002\u0010&\"\u001c\u0010\u0000\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006'"}, d2 = {"DEFAULT_CONCURRENCY", "", "getDEFAULT_CONCURRENCY$annotations", "()V", "getDEFAULT_CONCURRENCY", "()I", "DEFAULT_CONCURRENCY_PROPERTY_NAME", "", "getDEFAULT_CONCURRENCY_PROPERTY_NAME$annotations", "merge", "Lkotlinx/coroutines/flow/Flow;", "T", "flows", "", "([Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;", "flatMapConcat", "R", "transform", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "value", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "flatMapLatest", "flatMapMerge", "concurrency", "(Lkotlinx/coroutines/flow/Flow;ILkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "flattenConcat", "flattenMerge", "mapLatest", "", "transformLatest", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__MergeKt {
    private static final int DEFAULT_CONCURRENCY = 0;

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1, reason: invalid class name */
    /* JADX INFO: compiled from: Merge.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it"}, k = 3, mv = {1, 9, 0}, xi = 176)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1", f = "Merge.kt", i = {}, l = {189, 189}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1<R, T> extends SuspendLambda implements Function3<FlowCollector<? super R>, T, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<T, Continuation<? super Flow<? extends R>>, Object> $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function2<? super T, ? super Continuation<? super Flow<? extends R>>, ? extends Object> r2, Continuation<? super AnonymousClass1> r3) {
            this.$transform = r2;
            super(3, r3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object r2, Object r3, Continuation<? super Unit> r4) {
            return invoke((FlowCollector) r2, r3, r4);
        }

        public final Object invoke(FlowCollector<? super R> r3, T r4, Continuation<? super Unit> r5) {
            AnonymousClass1 r0 = new AnonymousClass1(this.$transform, r5);
            r0.L$0 = r3;
            r0.L$1 = r4;
            return r0.invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1<R, T> for r7v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int r1 = r7.label;
            switch(r1) {
                case 0: goto L8;
                case 1: goto L7;
                case 2: goto L6;
                default: goto L4;
            };
        L4:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw r8;
        L6:
            kotlin.ResultKt.throwOnFailure(r8);
        L16:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE;
            return r1;
        L7:
            java.lang.Object r2 = r7.L$0;
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2;
            kotlin.ResultKt.throwOnFailure(r8);
            kotlinx.coroutines.flow.FlowCollector r3 = r2;
            kotlinx.coroutines.flow.FlowKt__MergeKt.AnonymousClass1<R, T> r2 = r7;
        L12:
            kotlinx.coroutines.flow.Flow r8 = (kotlinx.coroutines.flow.Flow) r8;
            kotlinx.coroutines.flow.FlowKt__MergeKt.AnonymousClass1<R, T> r4 = r2;
            kotlinx.coroutines.flow.FlowKt__MergeKt.AnonymousClass1<R, T> r4 = r4;
            r2.L$0 = null;
            r2.label = 2;
            java.lang.Object r8 = kotlinx.coroutines.flow.FlowKt.emitAll(r3, r8, r4);
            if (r8 != r0) goto L15;
            return r0;
        L15:
            kotlinx.coroutines.flow.FlowKt__MergeKt.AnonymousClass1<R, T> r0 = r2;
            goto L16
        L8:
            kotlin.ResultKt.throwOnFailure(r8);
            java.lang.Object r2 = r7.L$0;
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2;
            java.lang.Object r3 = r7.L$1;
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, java.lang.Object> r4 = r7.$transform;
            r7.L$0 = r2;
            r7.label = 1;
            T r3 = (T) r3;
            java.lang.Object r7 = (kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>) r7;
            java.lang.Object r3 = r4.invoke(r3, r7);
            if (r3 != r0) goto L11;
            return r0;
        L11:
            r8 = r3;
            r3 = r2;
            r2 = r7;
            goto L12
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1<R, T> for r4v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        public final java.lang.Object invokeSuspend$$forInline(java.lang.Object r5) {
            java.lang.Object r0 = r4.L$0;
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0;
            java.lang.Object r1 = r4.L$1;
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, java.lang.Object> r2 = r4.$transform;
            T r1 = (T) r1;
            java.lang.Object r4 = (kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>) r4;
            java.lang.Object r2 = r2.invoke(r1, r4);
            kotlinx.coroutines.flow.Flow r2 = (kotlinx.coroutines.flow.Flow) r2;
            kotlinx.coroutines.flow.FlowKt__MergeKt.AnonymousClass1<R, T> r3 = (kotlin.coroutines.Continuation) r4;
            kotlinx.coroutines.flow.FlowKt.emitAll(r0, r2, r3);
            kotlin.Unit r2 = kotlin.Unit.INSTANCE;
            return r2;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Merge.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", i = {}, l = {213, 213}, m = "invokeSuspend", n = {}, s = {})
    static final class C07601<R, T> extends SuspendLambda implements Function3<FlowCollector<? super R>, T, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<T, Continuation<? super R>, Object> $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        C07601(Function2<? super T, ? super Continuation<? super R>, ? extends Object> r2, Continuation<? super C07601> r3) {
            this.$transform = r2;
            super(3, r3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object r2, Object r3, Continuation<? super Unit> r4) {
            return invoke((FlowCollector) r2, r3, r4);
        }

        public final Object invoke(FlowCollector<? super R> r3, T r4, Continuation<? super Unit> r5) {
            C07601 r0 = new C07601(this.$transform, r5);
            r0.L$0 = r3;
            r0.L$1 = r4;
            return r0.invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1<R, T> for r7v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int r1 = r7.label;
            switch(r1) {
                case 0: goto L8;
                case 1: goto L7;
                case 2: goto L6;
                default: goto L4;
            };
        L4:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw r8;
        L6:
            kotlin.ResultKt.throwOnFailure(r8);
        L16:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE;
            return r1;
        L7:
            java.lang.Object r2 = r7.L$0;
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2;
            kotlin.ResultKt.throwOnFailure(r8);
            kotlinx.coroutines.flow.FlowCollector r3 = r2;
            kotlinx.coroutines.flow.FlowKt__MergeKt.C07601<R, T> r2 = r7;
        L12:
            kotlin.coroutines.Continuation<? super kotlin.Unit> r4 = r2;
            kotlin.coroutines.Continuation<? super kotlin.Unit> r4 = r4;
            r2.L$0 = null;
            r2.label = 2;
            java.lang.Object r8 = r3.emit(r8, r4);
            if (r8 != r0) goto L15;
            return r0;
        L15:
            kotlinx.coroutines.flow.FlowKt__MergeKt.C07601<R, T> r0 = r2;
            goto L16
        L8:
            kotlin.ResultKt.throwOnFailure(r8);
            java.lang.Object r2 = r7.L$0;
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2;
            java.lang.Object r3 = r7.L$1;
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r4 = r7.$transform;
            r7.L$0 = r2;
            r7.label = 1;
            T r3 = (T) r3;
            java.lang.Object r7 = (kotlin.coroutines.Continuation<? super R>) r7;
            java.lang.Object r3 = r4.invoke(r3, r7);
            if (r3 != r0) goto L11;
            return r0;
        L11:
            r8 = r3;
            r3 = r2;
            r2 = r7;
            goto L12
        }
    }

    public static /* synthetic */ void getDEFAULT_CONCURRENCY$annotations() {
    }

    public static /* synthetic */ void getDEFAULT_CONCURRENCY_PROPERTY_NAME$annotations() {
    }

    static {
        DEFAULT_CONCURRENCY = SystemPropsKt.systemProp(FlowKt.DEFAULT_CONCURRENCY_PROPERTY_NAME, 16, 1, Integer.MAX_VALUE);
    }

    public static final int getDEFAULT_CONCURRENCY() {
        return DEFAULT_CONCURRENCY;
    }

    public static final <T, R> Flow<R> flatMapConcat(final Flow<? extends T> r6, final Function2<? super T, ? super Continuation<? super Flow<? extends R>>, ? extends Object> r7) {
        return FlowKt.flattenConcat(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(r6, r7));
    }

    public static /* synthetic */ Flow flatMapMerge$default(Flow r0, int r1, Function2 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = DEFAULT_CONCURRENCY;
    L6:
        return FlowKt.flatMapMerge(r0, r1, r2);
    }

    public static final <T, R> Flow<R> flatMapMerge(final Flow<? extends T> r6, int concurrency, final Function2<? super T, ? super Continuation<? super Flow<? extends R>>, ? extends Object> r8) {
        return FlowKt.flattenMerge(new FlowKt__MergeKt$flatMapMerge$$inlined$map$1(r6, r8), concurrency);
    }

    public static final <T> Flow<T> flattenConcat(final Flow<? extends Flow<? extends T>> r2) {
        return new FlowKt__MergeKt$flattenConcat$$inlined$unsafeFlow$1(r2);
    }

    public static final <T> Flow<T> merge(Iterable<? extends Flow<? extends T>> r7) {
        CoroutineContext r2 = null;
        int r3 = 0;
        BufferOverflow r4 = null;
        return new ChannelLimitedFlowMerge(r7, r2, r3, r4, 14, null);
    }

    public static final <T> Flow<T> merge(Flow<? extends T>... r1) {
        return FlowKt.merge(ArraysKt.asIterable(r1));
    }

    public static /* synthetic */ Flow flattenMerge$default(Flow r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = DEFAULT_CONCURRENCY;
    L6:
        return FlowKt.flattenMerge(r0, r1);
    }

    public static final <T> Flow<T> flattenMerge(Flow<? extends Flow<? extends T>> r9, int concurrency) {
        if (concurrency <= 0) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == false) goto L12;
        if (concurrency != 1) goto L10;
        return FlowKt.flattenConcat(r9);
    L10:
        return new ChannelFlowMerge(r9, concurrency, null, 0, null, 28, null);
    L12:
        throw new IllegalArgumentException(("Expected positive concurrency level, but had " + concurrency).toString());
    L5:
        r1 = false;
        goto L6
    }

    public static final <T, R> Flow<R> transformLatest(Flow<? extends T> r8, Function3<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> r9) {
        return new ChannelFlowTransformLatest(r9, r8, null, 0, null, 28, null);
    }

    public static final <T, R> Flow<R> flatMapLatest(Flow<? extends T> r3, Function2<? super T, ? super Continuation<? super Flow<? extends R>>, ? extends Object> r4) {
        return FlowKt.transformLatest(r3, new AnonymousClass1(r4, null));
    }

    public static final <T, R> Flow<R> mapLatest(Flow<? extends T> r2, Function2<? super T, ? super Continuation<? super R>, ? extends Object> r3) {
        return FlowKt.transformLatest(r2, new C07601(r3, null));
    }
}
