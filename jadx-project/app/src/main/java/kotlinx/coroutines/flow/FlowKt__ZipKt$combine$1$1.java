package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: Zip.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u008a@"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", i = {}, l = {29, 29}, m = "invokeSuspend", n = {}, s = {})
final class FlowKt__ZipKt$combine$1$1<R> extends SuspendLambda implements Function3<FlowCollector<? super R>, Object[], Continuation<? super Unit>, Object> {
    final /* synthetic */ Function3<T1, T2, Continuation<? super R>, Object> $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__ZipKt$combine$1$1(Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> r2, Continuation<? super FlowKt__ZipKt$combine$1$1> r3) {
        this.$transform = r2;
        super(3, r3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object r2, Object[] r3, Continuation<? super Unit> r4) {
        return invoke((FlowCollector) r2, r3, r4);
    }

    public final Object invoke(FlowCollector<? super R> r3, Object[] r4, Continuation<? super Unit> r5) {
        FlowKt__ZipKt$combine$1$1 r0 = new FlowKt__ZipKt$combine$1$1(this.$transform, r5);
        r0.L$0 = r3;
        r0.L$1 = r4;
        return r0.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1<R> for r9v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int r1 = r9.label;
        switch(r1) {
            case 0: goto L8;
            case 1: goto L7;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw r10;
    L6:
        kotlin.ResultKt.throwOnFailure(r10);
    L16:
        kotlin.Unit r1 = kotlin.Unit.INSTANCE;
        return r1;
    L7:
        java.lang.Object r2 = r9.L$0;
        kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2;
        kotlin.ResultKt.throwOnFailure(r10);
        kotlinx.coroutines.flow.FlowCollector r3 = r2;
        kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1<R> r2 = r9;
    L12:
        kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1<R> r4 = r2;
        kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1<R> r4 = r4;
        r2.L$0 = null;
        r2.label = 2;
        java.lang.Object r10 = r3.emit(r10, r4);
        if (r10 != r0) goto L15;
        return r0;
    L15:
        kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1<R> r0 = r2;
        goto L16
    L8:
        kotlin.ResultKt.throwOnFailure(r10);
        java.lang.Object r2 = r9.L$0;
        kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2;
        java.lang.Object r3 = r9.L$1;
        java.lang.Object[] r3 = (java.lang.Object[]) r3;
        kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r4 = r9.$transform;
        java.lang.Object r5 = r3[0];
        java.lang.Object r7 = r3[1];
        r9.L$0 = r2;
        r9.label = 1;
        T1 r5 = (T1) r5;
        T2 r7 = (T2) r7;
        java.lang.Object r9 = (kotlin.coroutines.Continuation<? super R>) r9;
        java.lang.Object r3 = r4.invoke(r5, r7, r9);
        if (r3 != r0) goto L11;
        return r0;
    L11:
        r10 = r3;
        r3 = r2;
        r2 = r9;
        goto L12
    }
}
