package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.R;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.compose.ui.window.PopupProperties;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: BasicTooltip.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aa\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0001¢\u0006\u0002\u0010\u000f\u001a@\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\f2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0003¢\u0006\u0002\u0010\u0013\u001a:\u0010\u0014\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0003¢\u0006\u0002\u0010\u0015\u001a,\u0010\u0016\u001a\u00020\n*\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a\u001c\u0010\u001a\u001a\u00020\n*\u00020\n2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\u001b"}, d2 = {"BasicTooltipBox", "", "positionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "tooltip", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "state", "Landroidx/compose/material3/TooltipState;", "modifier", "Landroidx/compose/ui/Modifier;", "focusable", "", "enableUserInput", "content", "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TooltipState;Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TooltipPopup", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Landroidx/compose/ui/window/PopupPositionProvider;Landroidx/compose/material3/TooltipState;Lkotlinx/coroutines/CoroutineScope;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "WrappedAnchor", "(ZLandroidx/compose/material3/TooltipState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "anchorSemantics", "label", "", "enabled", "handleGestures", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BasicTooltip_androidKt {

    /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BasicTooltip.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1", f = "BasicTooltip.android.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
    static final class C06001 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TooltipState $state;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: BasicTooltip.android.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1", f = "BasicTooltip.android.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {})
        static final class C01321 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PointerInputScope $$this$pointerInput;
            final /* synthetic */ TooltipState $state;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: BasicTooltip.android.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1", f = "BasicTooltip.android.kt", i = {0, 0, 0, 0, 1, 1, 1, 2}, l = {171, 177, 197}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "isLongPressedFlow", "pass", "longPressTimeout", "$this$awaitEachGesture", "isLongPressedFlow", "pass", "isLongPressedFlow"}, s = {"L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "L$0"})
            static final class C01331 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ CoroutineScope $$this$coroutineScope;
                final /* synthetic */ TooltipState $state;
                long J$0;
                private /* synthetic */ Object L$0;
                Object L$1;
                Object L$2;
                int label;

                /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: BasicTooltip.android.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$1", f = "BasicTooltip.android.kt", i = {}, l = {178}, m = "invokeSuspend", n = {}, s = {})
                static final class C01341 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super PointerInputChange>, Object> {
                    final /* synthetic */ PointerEventPass $pass;
                    private /* synthetic */ Object L$0;
                    int label;

                    C01341(PointerEventPass r2, Continuation<? super C01341> r3) {
                        this.$pass = r2;
                        super(2, r3);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
                        C01341 r0 = new C01341(this.$pass, r4);
                        r0.L$0 = r3;
                        return r0;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Object invoke2(AwaitPointerEventScope r3, Continuation<? super PointerInputChange> r4) {
                        return ((C01341) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(AwaitPointerEventScope r2, Continuation<? super PointerInputChange> r3) {
                        return invoke2(r2, r3);
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
                        return $result;
                    L7:
                        ResultKt.throwOnFailure($result);
                        AwaitPointerEventScope $this$withTimeout = (AwaitPointerEventScope) this.L$0;
                        this.label = 1;
                        Object r2 = TapGestureDetectorKt.waitForUpOrCancellation($this$withTimeout, this.$pass, this);
                        if (r2 != r0) goto L11;
                        return r0;
                    L11:
                        return r2;
                    L5:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: BasicTooltip.android.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2", f = "BasicTooltip.android.kt", i = {}, l = {185, 187, 187}, m = "invokeSuspend", n = {}, s = {})
                static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ MutableStateFlow<Boolean> $isLongPressedFlow;
                    final /* synthetic */ TooltipState $state;
                    Object L$0;
                    int label;

                    /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2$1, reason: invalid class name and collision with other inner class name */
                    /* JADX INFO: compiled from: BasicTooltip.android.kt */
                    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "isLongPressed", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2$1", f = "BasicTooltip.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    static final class C01351 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                        final /* synthetic */ TooltipState $state;
                        /* synthetic */ boolean Z$0;
                        int label;

                        C01351(TooltipState r2, Continuation<? super C01351> r3) {
                            this.$state = r2;
                            super(2, r3);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
                            C01351 r0 = new C01351(this.$state, r4);
                            r0.Z$0 = ((Boolean) r3).booleanValue();
                            return r0;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Boolean r3, Continuation<? super Unit> r4) {
                            return invoke(r3.booleanValue(), r4);
                        }

                        public final Object invoke(boolean r3, Continuation<? super Unit> r4) {
                            return ((C01351) create(Boolean.valueOf(r3), r4)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object r3) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            switch(this.label) {
                                case 0: goto L6;
                                default: goto L5;
                            };
                        L6:
                            ResultKt.throwOnFailure(r3);
                            boolean isLongPressed = this.Z$0;
                            if (isLongPressed == true) goto L10;
                            this.$state.dismiss();
                        L10:
                            return Unit.INSTANCE;
                        L5:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    AnonymousClass2(MutableStateFlow<Boolean> r2, TooltipState r3, Continuation<? super AnonymousClass2> r4) {
                        this.$isLongPressedFlow = r2;
                        this.$state = r3;
                        super(2, r4);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
                        return new AnonymousClass2(this.$isLongPressedFlow, this.$state, r5);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
                        return invoke2(r2, r3);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
                        return ((AnonymousClass2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v1 */
                    /* JADX WARN: Type inference failed for: r0v2 */
                    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
                    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2] */
                    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2] */
                    /* JADX WARN: Type inference failed for: r1v5 */
                    /* JADX WARN: Type inference failed for: r1v9 */
                    /* JADX WARN: Type inference failed for: r2v0 */
                    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.Continuation] */
                    /* JADX WARN: Type inference failed for: r2v2 */
                    /* JADX WARN: Type inference failed for: r2v5 */
                    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object r8) {
                        Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        ?? r1 = this.label;
                        ?? r2 = 0;
                        switch(r1) {
                            case 0: goto L13;
                            case 1: goto L8;
                            case 2: goto L7;
                            case 3: goto L6;
                            default: goto L5;
                        };
                    L6:
                        Throwable r3 = (Throwable) this.L$0;
                        ResultKt.throwOnFailure(r8);
                        throw r3;
                    L7:
                        ResultKt.throwOnFailure(r8);
                    L22:
                        return Unit.INSTANCE;
                    L8:
                        r1 = this;
                        ResultKt.throwOnFailure(r8);     // Catch: Throwable -> L11
                    L17:
                        r1.label = 2;
                        r2 = FlowKt.collectLatest(r1.$isLongPressedFlow, new C01351(r1.$state, null), (Continuation) r1);
                        if (r2 != r0) goto L22;
                        return r0;
                    L13:
                        ResultKt.throwOnFailure(r8);
                        AnonymousClass2 r4 = this;
                        r4.$isLongPressedFlow.tryEmit(Boxing.boxBoolean(true));     // Catch: Throwable -> L11
                        r4.label = 1;     // Catch: Throwable -> L11
                        Object r5 = r4.$state.show(MutatePriority.PreventUserInput, r4);     // Catch: Throwable -> L11
                        r1 = r4;
                        if (r5 != r0) goto L17;
                        return r0;
                    L5:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    L11:
                        th = move-exception;
                        r1.L$0 = th;
                        r1.label = 3;
                        if (FlowKt.collectLatest(r1.$isLongPressedFlow, new C01351(r1.$state, r2), (Continuation) r1) != r0) goto L27;
                        return r0;
                    L27:
                        throw th;
                    }
                }

                C01331(CoroutineScope r2, TooltipState r3, Continuation<? super C01331> r4) {
                    this.$$this$coroutineScope = r2;
                    this.$state = r3;
                    super(2, r4);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
                    C01331 r0 = new C01331(this.$$this$coroutineScope, this.$state, r5);
                    r0.L$0 = r4;
                    return r0;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(AwaitPointerEventScope r3, Continuation<? super Unit> r4) {
                    return ((C01331) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(AwaitPointerEventScope r2, Continuation<? super Unit> r3) {
                    return invoke2(r2, r3);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object $result) {
                    Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch(this.label) {
                        case 0: goto L19;
                        case 1: goto L18;
                        case 2: goto L11;
                        case 3: goto L6;
                        default: goto L5;
                    };
                L6:
                    C01331 r2 = this;
                    Object $result2 = $result;
                    MutableStateFlow isLongPressedFlow = (MutableStateFlow) r2.L$0;
                    ResultKt.throwOnFailure($result2);     // Catch: Throwable -> L9
                    Object $result3 = $result2;
                L55:
                    PointerInputChange upEvent = (PointerInputChange) $result2;     // Catch: Throwable -> L46
                    if (upEvent == null) goto L43;
                    upEvent.consume();     // Catch: Throwable -> L46
                L43:
                    isLongPressedFlow.tryEmit(Boxing.boxBoolean(false));
                L45:
                    return Unit.INSTANCE;
                L46:
                    th = th;
                L48:
                    isLongPressedFlow.tryEmit(Boxing.boxBoolean(false));
                    throw th;
                L9:
                    th = th;
                    goto L48
                L11:
                    C01331 r5 = this;
                    $result3 = $result;
                    PointerEventPass pass = (PointerEventPass) r5.L$2;
                    MutableStateFlow isLongPressedFlow2 = (MutableStateFlow) r5.L$1;
                    AwaitPointerEventScope $this$awaitEachGesture = (AwaitPointerEventScope) r5.L$0;
                    ResultKt.throwOnFailure($result3);     // Catch: Throwable -> L14 PointerEventTimeoutCancellationException -> L16
                L32:
                    isLongPressedFlow2.tryEmit(Boxing.boxBoolean(false));
                    goto L45
                L14:
                    th = th;
                    isLongPressedFlow = isLongPressedFlow2;
                L17:
                    AwaitPointerEventScope $this$awaitEachGesture2 = $this$awaitEachGesture;
                    MutableStateFlow isLongPressedFlow3 = isLongPressedFlow2;
                L36:
                    BuildersKt.launch$default(r5.$$this$coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass2(isLongPressedFlow3, r5.$state, null), 1, null);     // Catch: Throwable -> L33
                    r5.L$0 = isLongPressedFlow3;     // Catch: Throwable -> L33
                    r5.L$1 = null;     // Catch: Throwable -> L33
                    r5.L$2 = null;     // Catch: Throwable -> L33
                    r5.label = 3;     // Catch: Throwable -> L33
                    $result2 = TapGestureDetectorKt.waitForUpOrCancellation($this$awaitEachGesture2, pass, r5);     // Catch: Throwable -> L33
                    if ($result2 != r1) goto L39;
                    return r1;
                L39:
                    r2 = r5;
                    isLongPressedFlow = isLongPressedFlow3;
                L33:
                    th = th;
                    isLongPressedFlow = isLongPressedFlow3;
                    goto L48
                L18:
                    long longPressTimeout = this.J$0;
                    PointerEventPass pass2 = (PointerEventPass) this.L$2;
                    isLongPressedFlow3 = (MutableStateFlow) this.L$1;
                    $this$awaitEachGesture2 = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure($result);
                    long longPressTimeout2 = longPressTimeout;
                    pass = pass2;
                    $result3 = $result;
                    Object r8 = $result3;
                    r5 = this;
                L23:
                    int inputType = ((PointerInputChange) r8).m5592getTypeT8wyACA();
                    if (PointerType.m5660equalsimpl0(inputType, PointerType.Companion.m5667getTouchT8wyACA()) == false) goto L26;
                L50:
                    r5.L$0 = $this$awaitEachGesture2;     // Catch: Throwable -> L33 PointerEventTimeoutCancellationException -> L35
                    r5.L$1 = isLongPressedFlow3;     // Catch: Throwable -> L33 PointerEventTimeoutCancellationException -> L35
                    r5.L$2 = pass;     // Catch: Throwable -> L33 PointerEventTimeoutCancellationException -> L35
                    r5.label = 2;     // Catch: Throwable -> L33 PointerEventTimeoutCancellationException -> L35
                    if ($this$awaitEachGesture2.withTimeout(longPressTimeout2, new C01341(pass, null), r5) != r1) goto L31;
                    return r1;
                L31:
                    isLongPressedFlow2 = isLongPressedFlow3;
                    goto L32
                L26:
                    if (PointerType.m5660equalsimpl0(inputType, PointerType.Companion.m5666getStylusT8wyACA()) == false) goto L45;
                L19:
                    ResultKt.throwOnFailure($result);
                    AwaitPointerEventScope $this$awaitEachGesture3 = (AwaitPointerEventScope) this.L$0;
                    MutableStateFlow isLongPressedFlow4 = StateFlowKt.MutableStateFlow(Boxing.boxBoolean(false));
                    longPressTimeout2 = $this$awaitEachGesture3.getViewConfiguration().getLongPressTimeoutMillis();
                    PointerEventPass pass3 = PointerEventPass.Initial;
                    this.L$0 = $this$awaitEachGesture3;
                    this.L$1 = isLongPressedFlow4;
                    this.L$2 = pass3;
                    this.J$0 = longPressTimeout2;
                    this.label = 1;
                    r8 = TapGestureDetectorKt.awaitFirstDown$default($this$awaitEachGesture3, false, pass3, this, 1, null);
                    if (r8 != r1) goto L22;
                    return r1;
                L22:
                    $this$awaitEachGesture2 = $this$awaitEachGesture3;
                    pass = pass3;
                    isLongPressedFlow3 = isLongPressedFlow4;
                    $result3 = $result;
                    r5 = this;
                    goto L23
                L5:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            C01321(PointerInputScope r2, TooltipState r3, Continuation<? super C01321> r4) {
                this.$$this$pointerInput = r2;
                this.$state = r3;
                super(2, r4);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
                C01321 r0 = new C01321(this.$$this$pointerInput, this.$state, r5);
                r0.L$0 = r4;
                return r0;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
                return invoke2(r2, r3);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
                return ((C01321) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
                return Unit.INSTANCE;
            L7:
                ResultKt.throwOnFailure($result);
                CoroutineScope $this$coroutineScope = (CoroutineScope) this.L$0;
                this.label = 1;
                if (ForEachGestureKt.awaitEachGesture(this.$$this$pointerInput, new C01331($this$coroutineScope, this.$state, null), this) != r0) goto L12;
                return r0;
            L5:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        C06001(TooltipState r2, Continuation<? super C06001> r3) {
            this.$state = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            C06001 r0 = new C06001(this.$state, r4);
            r0.L$0 = r3;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(PointerInputScope r3, Continuation<? super Unit> r4) {
            return ((C06001) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(PointerInputScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
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
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            PointerInputScope $this$pointerInput = (PointerInputScope) this.L$0;
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(new C01321($this$pointerInput, this.$state, null), this) != r0) goto L12;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BasicTooltip.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2", f = "BasicTooltip.android.kt", i = {}, l = {ComposerKt.reuseKey}, m = "invokeSuspend", n = {}, s = {})
    static final class C06012 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TooltipState $state;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: BasicTooltip.android.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2$1", f = "BasicTooltip.android.kt", i = {}, l = {208}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PointerInputScope $$this$pointerInput;
            final /* synthetic */ TooltipState $state;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: BasicTooltip.android.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2$1$1", f = "BasicTooltip.android.kt", i = {0, 0}, l = {212}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "pass"}, s = {"L$0", "L$1"})
            static final class C01361 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ CoroutineScope $$this$coroutineScope;
                final /* synthetic */ TooltipState $state;
                private /* synthetic */ Object L$0;
                Object L$1;
                int label;

                /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2$1$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: BasicTooltip.android.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2$1$1$1", f = "BasicTooltip.android.kt", i = {}, l = {217}, m = "invokeSuspend", n = {}, s = {})
                static final class C01371 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ TooltipState $state;
                    int label;

                    C01371(TooltipState r2, Continuation<? super C01371> r3) {
                        this.$state = r2;
                        super(2, r3);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
                        return new C01371(this.$state, r4);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
                        return invoke2(r2, r3);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
                        return ((C01371) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
                        return Unit.INSTANCE;
                    L7:
                        ResultKt.throwOnFailure($result);
                        this.label = 1;
                        if (this.$state.show(MutatePriority.UserInput, this) != r0) goto L12;
                        return r0;
                    L5:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                C01361(CoroutineScope r2, TooltipState r3, Continuation<? super C01361> r4) {
                    this.$$this$coroutineScope = r2;
                    this.$state = r3;
                    super(2, r4);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
                    C01361 r0 = new C01361(this.$$this$coroutineScope, this.$state, r5);
                    r0.L$0 = r4;
                    return r0;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(AwaitPointerEventScope r3, Continuation<? super Unit> r4) {
                    return ((C01361) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(AwaitPointerEventScope r2, Continuation<? super Unit> r3) {
                    return invoke2(r2, r3);
                }

                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0042 -> B:12:0x0049). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object $result) {
                    Object $result2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch(this.label) {
                        case 0: goto L7;
                        case 1: goto L6;
                        default: goto L5;
                    };
                L6:
                    PointerEventPass pass = (PointerEventPass) this.L$1;
                    AwaitPointerEventScope $this$awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure($result);
                    AwaitPointerEventScope $this$awaitPointerEventScope2 = $this$awaitPointerEventScope;
                    PointerEventPass pass2 = pass;
                    C01361 r2 = this;
                    Object r1 = $result2;
                    Object $result3 = $result;
                L12:
                    PointerEvent event = (PointerEvent) $result;
                    if (PointerType.m5660equalsimpl0(event.getChanges().get(0).m5592getTypeT8wyACA(), PointerType.Companion.m5665getMouseT8wyACA()) == false) goto L20;
                    int inputType = event.m5531getType7fucELk();
                    if (PointerEventType.m5538equalsimpl0(inputType, PointerEventType.Companion.m5542getEnter7fucELk()) == false) goto L18;
                    BuildersKt.launch$default(r2.$$this$coroutineScope, null, null, new C01371(r2.$state, null), 3, null);
                    goto L20
                L18:
                    if (PointerEventType.m5538equalsimpl0(inputType, PointerEventType.Companion.m5543getExit7fucELk()) == false) goto L20;
                    r2.$state.dismiss();
                L20:
                    $result = $result3;
                    $result2 = r1;
                    C01361 r3 = r2;
                    PointerEventPass pass3 = pass2;
                    AwaitPointerEventScope $this$awaitPointerEventScope3 = $this$awaitPointerEventScope2;
                L8:
                    r3.L$0 = $this$awaitPointerEventScope3;
                    r3.L$1 = pass3;
                    r3.label = 1;
                    Object r4 = $this$awaitPointerEventScope3.awaitPointerEvent(pass3, r3);
                    if (r4 != $result2) goto L11;
                    return $result2;
                L11:
                    Object r12 = $result2;
                    $result3 = $result;
                    $result = r4;
                    $this$awaitPointerEventScope2 = $this$awaitPointerEventScope3;
                    pass2 = pass3;
                    r2 = r3;
                    r1 = r12;
                    goto L12
                L7:
                    ResultKt.throwOnFailure($result);
                    r3 = this;
                    AwaitPointerEventScope $this$awaitPointerEventScope4 = (AwaitPointerEventScope) r3.L$0;
                    $this$awaitPointerEventScope3 = $this$awaitPointerEventScope4;
                    pass3 = PointerEventPass.Main;
                    goto L8
                L5:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            AnonymousClass1(PointerInputScope r2, TooltipState r3, Continuation<? super AnonymousClass1> r4) {
                this.$$this$pointerInput = r2;
                this.$state = r3;
                super(2, r4);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
                AnonymousClass1 r0 = new AnonymousClass1(this.$$this$pointerInput, this.$state, r5);
                r0.L$0 = r4;
                return r0;
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
                return Unit.INSTANCE;
            L7:
                ResultKt.throwOnFailure($result);
                CoroutineScope $this$coroutineScope = (CoroutineScope) this.L$0;
                this.label = 1;
                if (this.$$this$pointerInput.awaitPointerEventScope(new C01361($this$coroutineScope, this.$state, null), this) != r0) goto L12;
                return r0;
            L5:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        C06012(TooltipState r2, Continuation<? super C06012> r3) {
            this.$state = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            C06012 r0 = new C06012(this.$state, r4);
            r0.L$0 = r3;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(PointerInputScope r3, Continuation<? super Unit> r4) {
            return ((C06012) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(PointerInputScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
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
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            PointerInputScope $this$pointerInput = (PointerInputScope) this.L$0;
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(new AnonymousClass1($this$pointerInput, this.$state, null), this) != r0) goto L12;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final /* synthetic */ void access$TooltipPopup(PopupPositionProvider positionProvider, TooltipState state, CoroutineScope scope, boolean focusable, Function2 content, Composer $composer, int $changed) {
        TooltipPopup(positionProvider, state, scope, focusable, content, $composer, $changed);
    }

    public static final /* synthetic */ void access$WrappedAnchor(boolean enableUserInput, TooltipState state, Modifier modifier, Function2 content, Composer $composer, int $changed, int $default) {
        WrappedAnchor(enableUserInput, state, modifier, content, $composer, $changed, $default);
    }

    public static final void BasicTooltipBox(final PopupPositionProvider positionProvider, final Function2<? super Composer, ? super Integer, Unit> r36, TooltipState state, Modifier modifier, boolean focusable, boolean enableUserInput, final Function2<? super Composer, ? super Integer, Unit> r41, Composer $composer, final int $changed, final int r44) {
        final TooltipState r1 = state;
        Composer $composer2 = $composer.startRestartGroup(-550509567);
        ComposerKt.sourceInformation($composer2, "C(BasicTooltipBox)P(4,6,5,3,2,1)86@3910L24,87@3939L451,106@4420L35,106@4396L59:BasicTooltip.android.kt#mqatfk");
        int $dirty = $changed;
        if ((r44 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L14:
        if ((r44 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Function2<? super Composer, ? super Integer, Unit> r4 = r36;
    L25:
        if ((r44 & 4) == 0) goto L28;
        $dirty = $dirty | 384;
    L37:
        int r5 = r44 & 8;
        if (r5 == 0) goto L41;
        $dirty = $dirty | 3072;
        Modifier r6 = modifier;
    L48:
        int r9 = r44 & 16;
        if (r9 == 0) goto L52;
        $dirty = $dirty | 24576;
        boolean focusable2 = focusable;
    L59:
        int r12 = r44 & 32;
        if (r12 == 0) goto L63;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        boolean enableUserInput2 = enableUserInput;
    L71:
        if ((r44 & 64) == 0) goto L74;
        $dirty = $dirty | 1572864;
        Function2<? super Composer, ? super Integer, Unit> r14 = r41;
    L81:
        int $dirty2 = $dirty;
        if ((599187 & $dirty2) == 599186) goto L84;
    L87:
        if (r5 == 0) goto L89;
        Modifier modifier2 = Modifier.Companion;
    L90:
        if (r9 == 0) goto L92;
        focusable2 = true;
    L92:
        if (r12 == 0) goto L95;
        enableUserInput2 = true;
    L95:
        if (ComposerKt.isTraceInProgress() == false) goto L97;
        ComposerKt.traceEventStart(-550509567, $dirty2, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.android.kt:85)");
    L97:
        ComposerKt.sourceInformationMarkerStart($composer2, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart($composer2, -954363344, "CC(remember):Effects.kt#9igjgp");
        Object it$iv$iv = $composer2.rememberedValue();
        if (it$iv$iv != Composer.Companion.getEmpty()) goto L100;
        Object value$iv$iv = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer2));
        $composer2.updateRememberedValue(value$iv$iv);
    L101:
        CompositionScopedCoroutineScopeCanceller wrapper$iv = (CompositionScopedCoroutineScopeCanceller) value$iv$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        CoroutineScope scope = wrapper$iv.getCoroutineScope();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Modifier modifier$iv = Modifier.Companion;
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier modifier3 = modifier2;
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r19 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L104;
        ComposablesKt.invalidApplier();
    L104:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L107;
        $composer2.createNode(r19);
    L108:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L115;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L115;
    L116:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r23 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r3 = BoxScopeInstance.INSTANCE;
        int r26 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, 2072656365, "C98@4223L161:BasicTooltip.android.kt#mqatfk");
        $composer2.startReplaceGroup(-625876949);
        ComposerKt.sourceInformation($composer2, "89@3988L215");
        if (state.isVisible() == false) goto L119;
        boolean focusable3 = focusable2;
        boolean r32 = false;
        TooltipPopup(positionProvider, state, scope, focusable3, r4, $composer2, ((($dirty2 & 14) | (($dirty2 >> 3) & 112)) | (($dirty2 >> 3) & 7168)) | (($dirty2 << 9) & 57344));
        boolean focusable4 = focusable3;
    L120:
        r5.endReplaceGroup();
        r1 = state;
        boolean enableUserInput3 = enableUserInput2;
        WrappedAnchor(enableUserInput3, r1, modifier3, r14, r5, (((($dirty2 >> 15) & 14) | (($dirty2 >> 3) & 112)) | (($dirty2 >> 3) & 896)) | (($dirty2 >> 9) & 7168), 0);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -1907285077, "CC(remember):BasicTooltip.android.kt#9igjgp");
        if (($dirty2 & 896) != 256) goto L123;
    L128:
        boolean invalid$iv = true;
    L129:
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L132;
    L135:
        Object value$iv = (Function1) new BasicTooltip_androidKt$BasicTooltipBox$2$1(r1);
        $composer2.updateRememberedValue(value$iv);
    L136:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.DisposableEffect(r1, (Function1) value$iv, $composer2, ($dirty2 >> 6) & 14);
        if (ComposerKt.isTraceInProgress() == false) goto L139;
        ComposerKt.traceEventEnd();
    L139:
        final boolean enableUserInput4 = enableUserInput3;
        final Modifier modifier4 = modifier3;
        final boolean focusable5 = focusable4;
    L140:
        ScopeUpdateScope r11 = $composer2.endRestartGroup();
        if (r11 == null) goto L144;
        final TooltipState r7 = r1;
        r11.updateScope(new AnonymousClass3(positionProvider, r36, r7, modifier4, focusable5, enableUserInput4, r41, $changed, r44));
        return;
    L144:
        return;
    L132:
        if (it$iv == Composer.Companion.getEmpty()) goto L135;
        value$iv = it$iv;
        goto L136
    L123:
        if (($dirty2 & 512) != 0) goto L125;
    L127:
        invalid$iv = r32;
        goto L129
    L125:
        if ($composer2.changedInstance(r1) == false) goto L127;
    L119:
        focusable4 = focusable2;
        r32 = false;
    L115:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r2);
        goto L116
    L107:
        $composer2.useNode();
        goto L108
    L100:
        value$iv$iv = it$iv$iv;
        goto L101
    L89:
        modifier2 = r6;
        goto L90
    L84:
        if ($composer2.getSkipping() == false) goto L87;
        $composer2.skipToGroupEnd();
        modifier4 = r6;
        focusable5 = focusable2;
        enableUserInput4 = enableUserInput2;
        goto L140
    L74:
        if (($changed & 1572864) != 0) goto L80;
        r14 = r41;
        if ($composer2.changedInstance(r14) == false) goto L78;
        int r15 = 1048576;
    L79:
        $dirty = $dirty | r15;
        goto L81
    L78:
        r15 = 524288;
        goto L79
    L80:
        r14 = r41;
        goto L81
    L63:
        if ((196608 & $changed) != 0) goto L69;
        enableUserInput2 = enableUserInput;
        if ($composer2.changed(enableUserInput2) == false) goto L67;
        int r16 = 131072;
    L68:
        $dirty = $dirty | r16;
        goto L71
    L67:
        r16 = 65536;
        goto L68
    L69:
        enableUserInput2 = enableUserInput;
        goto L71
    L52:
        if (($changed & 24576) != 0) goto L58;
        focusable2 = focusable;
        if ($composer2.changed(focusable2) == false) goto L56;
        int r13 = 16384;
    L57:
        $dirty = $dirty | r13;
        goto L59
    L56:
        r13 = 8192;
        goto L57
    L58:
        focusable2 = focusable;
        goto L59
    L41:
        if (($changed & 3072) != 0) goto L47;
        r6 = modifier;
        if ($composer2.changed(r6) == false) goto L45;
        int r10 = 2048;
    L46:
        $dirty = $dirty | r10;
        goto L48
    L45:
        r10 = 1024;
        goto L46
    L47:
        r6 = modifier;
        goto L48
    L28:
        if (($changed & 384) != 0) goto L37;
        if (($changed & 512) != 0) goto L32;
        boolean r8 = $composer2.changed(r1);
    L33:
        if (r8 == false) goto L35;
        int r17 = 256;
    L36:
        $dirty = $dirty | r17;
        goto L37
    L35:
        r17 = 128;
        goto L36
    L32:
        r8 = $composer2.changedInstance(r1);
        goto L33
    L17:
        if (($changed & 48) != 0) goto L23;
        r4 = r36;
        if ($composer2.changedInstance(r4) == false) goto L21;
        int r18 = 32;
    L22:
        $dirty = $dirty | r18;
        goto L25
    L21:
        r18 = 16;
        goto L22
    L23:
        r4 = r36;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L14;
        if ($composer2.changed(positionProvider) == false) goto L10;
        int r20 = 4;
    L11:
        $dirty = $dirty | r20;
        goto L14
    L10:
        r20 = 2;
        goto L11
    }

    private static final void WrappedAnchor(final boolean enableUserInput, final TooltipState state, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> r31, Composer $composer, final int $changed, final int r34) {
        Composer $composer2 = $composer.startRestartGroup(1848240995);
        ComposerKt.sourceInformation($composer2, "C(WrappedAnchor)P(1,3,2)116@4644L24,117@4694L38,118@4737L212:BasicTooltip.android.kt#mqatfk");
        int $dirty = $changed;
        if ((r34 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r34 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L25:
        int r6 = r34 & 4;
        if (r6 == 0) goto L29;
        $dirty = $dirty | 384;
        Modifier r8 = modifier;
    L37:
        if ((r34 & 8) == 0) goto L40;
        $dirty = $dirty | 3072;
    L46:
        int $dirty2 = $dirty;
        if (($dirty2 & 1171) == 1170) goto L49;
    L52:
        if (r6 == 0) goto L54;
        Modifier.Companion modifier2 = Modifier.Companion;
    L56:
        if (ComposerKt.isTraceInProgress() == false) goto L58;
        ComposerKt.traceEventStart(1848240995, $dirty2, -1, "androidx.compose.material3.internal.WrappedAnchor (BasicTooltip.android.kt:115)");
    L58:
        ComposerKt.sourceInformationMarkerStart($composer2, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart($composer2, -954363344, "CC(remember):Effects.kt#9igjgp");
        Object it$iv$iv = $composer2.rememberedValue();
        if (it$iv$iv != Composer.Companion.getEmpty()) goto L61;
        Object value$iv$iv = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer2));
        $composer2.updateRememberedValue(value$iv$iv);
    L62:
        CompositionScopedCoroutineScopeCanceller wrapper$iv = (CompositionScopedCoroutineScopeCanceller) value$iv$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        CoroutineScope scope = wrapper$iv.getCoroutineScope();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        String longPressLabel = StringResources_androidKt.stringResource(R.string.tooltip_label, $composer2, 0);
        Modifier modifier$iv = anchorSemantics(handleGestures(modifier2, enableUserInput, state), longPressLabel, enableUserInput, state, scope);
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r16 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        Modifier modifier3 = modifier2;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L65;
        ComposablesKt.invalidApplier();
    L65:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L68;
        Function0<ComposeUiNode> r2 = r16;
        $composer2.createNode(r2);
    L69:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L76;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L76;
    L77:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r1 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r0 = BoxScopeInstance.INSTANCE;
        int r5 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, 400210223, "C124@4934L9:BasicTooltip.android.kt#mqatfk");
        r31.invoke($composer2, Integer.valueOf(($dirty2 >> 9) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L80;
        ComposerKt.traceEventEnd();
    L80:
        final Modifier modifier4 = modifier3;
    L81:
        ScopeUpdateScope r9 = $composer2.endRestartGroup();
        if (r9 == null) goto L85;
        r9.updateScope(new C05992(enableUserInput, state, modifier4, r31, $changed, r34));
        return;
    L85:
        return;
    L76:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r3);
        goto L77
    L68:
        r2 = r16;
        $composer2.useNode();
        goto L69
    L61:
        value$iv$iv = it$iv$iv;
        goto L62
    L54:
        modifier2 = r8;
        goto L56
    L49:
        if ($composer2.getSkipping() == false) goto L52;
        $composer2.skipToGroupEnd();
        modifier4 = r8;
        goto L81
    L40:
        if (($changed & 3072) != 0) goto L46;
        if ($composer2.changedInstance(r31) == false) goto L44;
        int r10 = 2048;
    L45:
        $dirty = $dirty | r10;
        goto L46
    L44:
        r10 = 1024;
        goto L45
    L29:
        if (($changed & 384) != 0) goto L35;
        r8 = modifier;
        if ($composer2.changed(r8) == false) goto L33;
        int r11 = 256;
    L34:
        $dirty = $dirty | r11;
        goto L37
    L33:
        r11 = 128;
        goto L34
    L35:
        r8 = modifier;
        goto L37
    L16:
        if (($changed & 48) != 0) goto L25;
        if (($changed & 64) != 0) goto L20;
        boolean r7 = $composer2.changed(state);
    L21:
        if (r7 == false) goto L23;
        int r12 = 32;
    L24:
        $dirty = $dirty | r12;
        goto L25
    L23:
        r12 = 16;
        goto L24
    L20:
        r7 = $composer2.changedInstance(state);
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(enableUserInput) == false) goto L10;
        int r13 = 4;
    L11:
        $dirty = $dirty | r13;
        goto L13
    L10:
        r13 = 2;
        goto L11
    }

    private static final void TooltipPopup(final PopupPositionProvider positionProvider, final TooltipState state, final CoroutineScope scope, final boolean focusable, final Function2<? super Composer, ? super Integer, Unit> r23, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-273292979);
        ComposerKt.sourceInformation($composer2, "C(TooltipPopup)P(2,4,3,1)136@5181L44,139@5314L109,145@5491L251,137@5230L512:BasicTooltip.android.kt#mqatfk");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L9;
        PopupPositionProvider r7 = positionProvider;
        if ($composer2.changed(r7) == false) goto L7;
        int r4 = 4;
    L8:
        $dirty = $dirty | r4;
    L11:
        if (($changed & 48) != 0) goto L21;
        if (($changed & 64) != 0) goto L15;
        boolean r5 = $composer2.changed(state);
    L16:
        if (r5 == false) goto L18;
        int r6 = 32;
    L19:
        $dirty = $dirty | r6;
        goto L21
    L18:
        r6 = 16;
        goto L19
    L15:
        r5 = $composer2.changedInstance(state);
    L21:
        if (($changed & 384) != 0) goto L28;
        if ($composer2.changedInstance(scope) == false) goto L25;
        int r8 = 256;
    L26:
        $dirty = $dirty | r8;
        goto L28
    L25:
        r8 = 128;
    L28:
        if (($changed & 3072) != 0) goto L34;
        boolean r13 = focusable;
        if ($composer2.changed(r13) == false) goto L32;
        int r9 = 2048;
    L33:
        $dirty = $dirty | r9;
    L36:
        if (($changed & 24576) != 0) goto L43;
        if ($composer2.changedInstance(r23) == false) goto L40;
        int r10 = 16384;
    L41:
        $dirty = $dirty | r10;
        goto L43
    L40:
        r10 = 8192;
    L43:
        if (($dirty & 9363) != 9362) goto L49;
        if ($composer2.getSkipping() == false) goto L49;
        $composer2.skipToGroupEnd();
    L68:
        ScopeUpdateScope r11 = $composer2.endRestartGroup();
        if (r11 == null) goto L72;
        r11.updateScope(new C05983(positionProvider, state, scope, focusable, r23, $changed));
        return;
    L72:
        return;
    L49:
        if (ComposerKt.isTraceInProgress() == false) goto L51;
        ComposerKt.traceEventStart(-273292979, $dirty, -1, "androidx.compose.material3.internal.TooltipPopup (BasicTooltip.android.kt:135)");
    L51:
        boolean r12 = false;
        final String tooltipDescription = StringResources_androidKt.stringResource(R.string.tooltip_description, $composer2, 0);
        ComposerKt.sourceInformationMarkerStart($composer2, 162917156, "CC(remember):BasicTooltip.android.kt#9igjgp");
        if (($dirty & 112) != 32) goto L54;
    L57:
        r12 = true;
    L58:
        boolean invalid$iv = r12 | $composer2.changedInstance(scope);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L61;
    L64:
        Object value$iv = (Function0) new BasicTooltip_androidKt$TooltipPopup$1$1(state, scope);
        $composer2.updateRememberedValue(value$iv);
    L65:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        AndroidPopup_androidKt.Popup(r7, (Function0) value$iv, new PopupProperties(r13, false, false, false, 14, null), ComposableLambdaKt.rememberComposableLambda(610617071, true, new AnonymousClass2(tooltipDescription, r23), $composer2, 54), $composer2, ($dirty & 14) | 3072, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L68;
        ComposerKt.traceEventEnd();
        goto L68
    L61:
        if (it$iv == Composer.Companion.getEmpty()) goto L64;
        value$iv = it$iv;
        goto L65
    L54:
        if (($dirty & 64) == 0) goto L58;
        if ($composer2.changedInstance(state) == false) goto L58;
    L32:
        r9 = 1024;
        goto L33
    L34:
        r13 = focusable;
        goto L36
    L7:
        r4 = 2;
        goto L8
    L9:
        r7 = positionProvider;
        goto L11
    }

    private static final Modifier handleGestures(Modifier $this$handleGestures, boolean enabled, TooltipState state) {
        if (enabled == false) goto L5;
        return SuspendingPointerInputFilterKt.pointerInput(SuspendingPointerInputFilterKt.pointerInput($this$handleGestures, state, new C06001(state, null)), state, new C06012(state, null));
    L5:
        return $this$handleGestures;
    }

    private static final Modifier anchorSemantics(Modifier $this$anchorSemantics, final String label, boolean enabled, final TooltipState state, final CoroutineScope scope) {
        if (enabled == false) goto L5;
        return SemanticsModifierKt.semantics($this$anchorSemantics, true, new AnonymousClass1(label, scope, state));
    L5:
        return $this$anchorSemantics;
    }
}
