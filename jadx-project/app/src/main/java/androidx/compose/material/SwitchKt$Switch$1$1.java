package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: Switch.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.SwitchKt$Switch$1$1", f = "Switch.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
final class SwitchKt$Switch$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AnchoredDraggableState<Boolean> $anchoredDraggableState;
    final /* synthetic */ State<Boolean> $currentChecked$delegate;
    final /* synthetic */ State<Function1<Boolean, Unit>> $currentOnCheckedChange$delegate;
    final /* synthetic */ MutableState<Boolean> $forceAnimationCheck$delegate;
    int label;

    /* JADX INFO: renamed from: androidx.compose.material.SwitchKt$Switch$1$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: Switch.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "newValue", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.SwitchKt$Switch$1$1$2", f = "Switch.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        final /* synthetic */ State<Boolean> $currentChecked$delegate;
        final /* synthetic */ State<Function1<Boolean, Unit>> $currentOnCheckedChange$delegate;
        final /* synthetic */ MutableState<Boolean> $forceAnimationCheck$delegate;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(State<Boolean> r2, State<? extends Function1<? super Boolean, Unit>> r3, MutableState<Boolean> r4, Continuation<? super AnonymousClass2> r5) {
            this.$currentChecked$delegate = r2;
            this.$currentOnCheckedChange$delegate = r3;
            this.$forceAnimationCheck$delegate = r4;
            super(2, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
            AnonymousClass2 r0 = new AnonymousClass2(this.$currentChecked$delegate, this.$currentOnCheckedChange$delegate, this.$forceAnimationCheck$delegate, r6);
            r0.Z$0 = ((Boolean) r5).booleanValue();
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean r3, Continuation<? super Unit> r4) {
            return invoke(r3.booleanValue(), r4);
        }

        public final Object invoke(boolean r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass2) create(Boolean.valueOf(r3), r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure(r4);
            boolean newValue = this.Z$0;
            if (SwitchKt.access$Switch$lambda$8(this.$currentChecked$delegate) == newValue) goto L16;
            Function1 r1 = SwitchKt.access$Switch$lambda$7(this.$currentOnCheckedChange$delegate);
            if (r1 == null) goto L14;
            if (newValue == false) goto L12;
            boolean newValue2 = true;
        L13:
            r1.invoke(Boxing.boxBoolean(newValue2));
            goto L14
        L12:
            newValue2 = false;
        L14:
            SwitchKt.access$Switch$lambda$4(this.$forceAnimationCheck$delegate, !SwitchKt.access$Switch$lambda$3(this.$forceAnimationCheck$delegate));
        L16:
            return Unit.INSTANCE;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    SwitchKt$Switch$1$1(AnchoredDraggableState<Boolean> r2, State<Boolean> r3, State<? extends Function1<? super Boolean, Unit>> r4, MutableState<Boolean> r5, Continuation<? super SwitchKt$Switch$1$1> r6) {
        this.$anchoredDraggableState = r2;
        this.$currentChecked$delegate = r3;
        this.$currentOnCheckedChange$delegate = r4;
        this.$forceAnimationCheck$delegate = r5;
        super(2, r6);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r7, Continuation<?> r8) {
        return new SwitchKt$Switch$1$1(this.$anchoredDraggableState, this.$currentChecked$delegate, this.$currentOnCheckedChange$delegate, this.$forceAnimationCheck$delegate, r8);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
        return ((SwitchKt$Switch$1$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
        final AnchoredDraggableState<Boolean> r2 = this.$anchoredDraggableState;
        this.label = 1;
        if (FlowKt.collectLatest(SnapshotStateKt.snapshotFlow(new AnonymousClass1(r2)), new AnonymousClass2(this.$currentChecked$delegate, this.$currentOnCheckedChange$delegate, this.$forceAnimationCheck$delegate, null), this) != r0) goto L11;
        return r0;
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
