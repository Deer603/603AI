package androidx.compose.animation.core;

import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelResult;

/* JADX INFO: compiled from: AnimateAsState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004*\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", i = {0}, l = {418}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
final class AnimateAsStateKt$animateValueAsState$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<AnimationSpec<T>> $animSpec$delegate;
    final /* synthetic */ Animatable<T, V> $animatable;
    final /* synthetic */ Channel<T> $channel;
    final /* synthetic */ State<Function1<T, Unit>> $listener$delegate;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: renamed from: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: AnimateAsState.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004*\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1", f = "AnimateAsState.kt", i = {}, l = {427}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ State<AnimationSpec<T>> $animSpec$delegate;
        final /* synthetic */ Animatable<T, V> $animatable;
        final /* synthetic */ State<Function1<T, Unit>> $listener$delegate;
        final /* synthetic */ T $newTarget;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(T r2, Animatable<T, V> r3, State<? extends AnimationSpec<T>> r4, State<? extends Function1<? super T, Unit>> r5, Continuation<? super AnonymousClass1> r6) {
            this.$newTarget = r2;
            this.$animatable = r3;
            this.$animSpec$delegate = r4;
            this.$listener$delegate = r5;
            super(2, r6);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r7, Continuation<?> r8) {
            return new AnonymousClass1(this.$newTarget, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, r8);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
        L12:
            Function1 r1 = AnimateAsStateKt.access$animateValueAsState$lambda$4(this.$listener$delegate);
            if (r1 == null) goto L16;
            r1.invoke(this.$animatable.getValue());
        L16:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            if (Intrinsics.areEqual(this.$newTarget, this.$animatable.getTargetValue()) == true) goto L16;
            this.label = 1;
            if (Animatable.animateTo$default(this.$animatable, this.$newTarget, AnimateAsStateKt.access$animateValueAsState$lambda$6(this.$animSpec$delegate), null, null, this, 12, null) != r0) goto L12;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    AnimateAsStateKt$animateValueAsState$3$1(Channel<T> r2, Animatable<T, V> r3, State<? extends AnimationSpec<T>> r4, State<? extends Function1<? super T, Unit>> r5, Continuation<? super AnimateAsStateKt$animateValueAsState$3$1> r6) {
        this.$channel = r2;
        this.$animatable = r3;
        this.$animSpec$delegate = r4;
        this.$listener$delegate = r5;
        super(2, r6);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r7, Continuation<?> r8) {
        AnimateAsStateKt$animateValueAsState$3$1 r0 = new AnimateAsStateKt$animateValueAsState$3$1(this.$channel, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, r8);
        r0.L$0 = r7;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
        return ((AnimateAsStateKt$animateValueAsState$3$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0049 -> B:12:0x004e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r19) {
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(this.label) {
            case 0: goto L7;
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        Object $result = r19;
        ChannelIterator r3 = (ChannelIterator) this.L$1;
        CoroutineScope $this$LaunchedEffect = (CoroutineScope) this.L$0;
        ResultKt.throwOnFailure($result);
        AnimateAsStateKt$animateValueAsState$3$1 r11 = this;
        CoroutineScope $this$LaunchedEffect2 = $this$LaunchedEffect;
        ChannelIterator r4 = r3;
        Object $result2 = $result;
    L13:
        if (((Boolean) $result).booleanValue() == false) goto L20;
        Object target = r4.next();
        Object r6 = ChannelResult.m8931getOrNullimpl(r11.$channel.mo8920tryReceivePtdJZtk());
        if (r6 == null) goto L18;
        target = r6;
    L18:
        Object newTarget = target;
        BuildersKt.launch$default($this$LaunchedEffect2, null, null, new AnonymousClass1(newTarget, r11.$animatable, r11.$animSpec$delegate, r11.$listener$delegate, null), 3, null);
        Object $result3 = $result2;
        ChannelIterator r5 = r4;
        CoroutineScope $this$LaunchedEffect3 = $this$LaunchedEffect2;
        AnimateAsStateKt$animateValueAsState$3$1 r7 = r11;
    L8:
        r7.L$0 = $this$LaunchedEffect3;
        r7.L$1 = r5;
        r7.label = 1;
        Object r8 = r5.hasNext(r7);
        if (r8 != r1) goto L11;
        return r1;
    L11:
        r11 = r7;
        $this$LaunchedEffect2 = $this$LaunchedEffect3;
        r4 = r5;
        $result2 = $result3;
        $result = r8;
        goto L13
    L20:
        return Unit.INSTANCE;
    L7:
        ResultKt.throwOnFailure(r19);
        $result3 = r19;
        CoroutineScope $this$LaunchedEffect4 = (CoroutineScope) this.L$0;
        ChannelIterator r9 = this.$channel.iterator();
        $this$LaunchedEffect3 = $this$LaunchedEffect4;
        r5 = r9;
        r7 = this;
        goto L8
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
