package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
final class FlowKt__LimitKt$dropWhile$1$1<T> implements FlowCollector {
    final /* synthetic */ Ref.BooleanRef $matched;
    final /* synthetic */ Function2<T, Continuation<? super Boolean>, Object> $predicate;
    final /* synthetic */ FlowCollector<T> $this_unsafeFlow;

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__LimitKt$dropWhile$1$1(Ref.BooleanRef r1, FlowCollector<? super T> r2, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> r3) {
        this.$matched = r1;
        this.$this_unsafeFlow = r2;
        this.$predicate = r3;
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
    public final Object emit(T r7, Continuation<? super Unit> r8) {
        if ((r8 instanceof FlowKt__LimitKt$dropWhile$1$1$emit$1) == false) goto L7;
        FlowKt__LimitKt$dropWhile$1$1$emit$1 r0 = (FlowKt__LimitKt$dropWhile$1$1$emit$1) r8;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object r9 = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L12;
            case 3: goto L13;
            default: goto L11;
        };
    L12:
        r7 = (T) r0.L$1;
        FlowKt__LimitKt$dropWhile$1$1<T> r2 = (FlowKt__LimitKt$dropWhile$1$1) r0.L$0;
        ResultKt.throwOnFailure(r9);
        Object r4 = r9;
    L25:
        if (((Boolean) r4).booleanValue() == true) goto L20;
        r2.$matched.element = true;
        FlowCollector<T> r3 = r2.$this_unsafeFlow;
        r0.L$0 = null;
        r0.L$1 = null;
        r0.label = 3;
        if (r3.emit(r7, r0) != r1) goto L20;
        return r1;
    L20:
        return Unit.INSTANCE;
    L13:
        ResultKt.throwOnFailure(r9);
        goto L20
    L14:
        ResultKt.throwOnFailure(r9);
        r2 = this;
        if (r2.$matched.element == false) goto L21;
        FlowCollector<T> r5 = r2.$this_unsafeFlow;
        r0.label = 1;
        if (r5.emit(r7, r0) != r1) goto L20;
        return r1;
    L21:
        Function2<T, Continuation<? super Boolean>, Object> r6 = r2.$predicate;
        r0.L$0 = r2;
        r0.L$1 = r7;
        r0.label = 2;
        r4 = r6.invoke(r7, r0);
        if (r4 != r1) goto L25;
        return r1;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new FlowKt__LimitKt$dropWhile$1$1$emit$1(this, r8);
        goto L8
    }
}
