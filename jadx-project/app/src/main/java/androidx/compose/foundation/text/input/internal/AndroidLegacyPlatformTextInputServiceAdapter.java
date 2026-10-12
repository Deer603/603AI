package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.PlatformTextInputSession;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: compiled from: LegacyPlatformTextInputServiceAdapter.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0016J\u001e\u0010\u0010\u001a\u00020\u00052\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012H\u0002JF\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0018\u0010\u0017\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0004\u0012\u00020\u00050\u00122\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00050\u0012H\u0016J\b\u0010\u001c\u001a\u00020\u0005H\u0016J\b\u0010\u001d\u001a\u00020\u0005H\u0016J\u001a\u0010\u001e\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u00142\u0006\u0010 \u001a\u00020\u0014H\u0016JD\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010)\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u000fH\u0016R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006+"}, d2 = {"Landroidx/compose/foundation/text/input/internal/AndroidLegacyPlatformTextInputServiceAdapter;", "Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;", "()V", "backingStylusHandwritingTrigger", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "currentRequest", "Landroidx/compose/foundation/text/input/internal/LegacyTextInputMethodRequest;", "job", "Lkotlinx/coroutines/Job;", "stylusHandwritingTrigger", "getStylusHandwritingTrigger", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "notifyFocusedRect", "rect", "Landroidx/compose/ui/geometry/Rect;", "startInput", "initializeRequest", "Lkotlin/Function1;", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "onEditCommand", "", "Landroidx/compose/ui/text/input/EditCommand;", "onImeActionPerformed", "Landroidx/compose/ui/text/input/ImeAction;", "startStylusHandwriting", "stopInput", "updateState", "oldValue", "newValue", "updateTextLayoutResult", "textFieldValue", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "textFieldToRootTransform", "Landroidx/compose/ui/graphics/Matrix;", "innerTextFieldBounds", "decorationBoxBounds", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidLegacyPlatformTextInputServiceAdapter extends LegacyPlatformTextInputServiceAdapter {
    public static final int $stable = 0;
    private MutableSharedFlow<Unit> backingStylusHandwritingTrigger;
    private LegacyTextInputMethodRequest currentRequest;
    private Job job;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2, reason: invalid class name */
    /* JADX INFO: compiled from: LegacyPlatformTextInputServiceAdapter.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/PlatformTextInputSession;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2", f = "LegacyPlatformTextInputServiceAdapter.android.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<PlatformTextInputSession, Continuation<?>, Object> {
        final /* synthetic */ Function1<LegacyTextInputMethodRequest, Unit> $initializeRequest;
        final /* synthetic */ LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode $node;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AndroidLegacyPlatformTextInputServiceAdapter this$0;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: LegacyPlatformTextInputServiceAdapter.android.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
            final /* synthetic */ PlatformTextInputSession $$this$launchTextInputSession;
            final /* synthetic */ Function1<LegacyTextInputMethodRequest, Unit> $initializeRequest;
            final /* synthetic */ LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode $node;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AndroidLegacyPlatformTextInputServiceAdapter this$0;

            /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: LegacyPlatformTextInputServiceAdapter.android.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", i = {}, l = {140, 141}, m = "invokeSuspend", n = {}, s = {})
            static final class C00431 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ InputMethodManager $inputMethodManager;
                int label;
                final /* synthetic */ AndroidLegacyPlatformTextInputServiceAdapter this$0;

                C00431(AndroidLegacyPlatformTextInputServiceAdapter r2, InputMethodManager r3, Continuation<? super C00431> r4) {
                    this.this$0 = r2;
                    this.$inputMethodManager = r3;
                    super(2, r4);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
                    return new C00431(this.this$0, this.$inputMethodManager, r5);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
                    return invoke2(r2, r3);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
                    return ((C00431) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object $result) {
                    Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch(this.label) {
                        case 0: goto L8;
                        case 1: goto L7;
                        case 2: goto L6;
                        default: goto L5;
                    };
                L6:
                    ResultKt.throwOnFailure($result);
                L17:
                    throw new KotlinNothingValueException();
                L7:
                    ResultKt.throwOnFailure($result);
                L11:
                    MutableSharedFlow r1 = AndroidLegacyPlatformTextInputServiceAdapter.access$getStylusHandwritingTrigger(this.this$0);
                    if (r1 == null) goto L19;
                    final InputMethodManager r3 = this.$inputMethodManager;
                    this.label = 2;
                    if (r1.collect(new C00452(r3), this) != r0) goto L17;
                    return r0;
                L19:
                    return Unit.INSTANCE;
                L8:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    if (MonotonicFrameClockKt.withFrameMillis(C00441.INSTANCE, this) != r0) goto L11;
                    return r0;
                L5:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(PlatformTextInputSession r2, Function1<? super LegacyTextInputMethodRequest, Unit> r3, AndroidLegacyPlatformTextInputServiceAdapter r4, LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode r5, Continuation<? super AnonymousClass1> r6) {
                this.$$this$launchTextInputSession = r2;
                this.$initializeRequest = r3;
                this.this$0 = r4;
                this.$node = r5;
                super(2, r6);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r7, Continuation<?> r8) {
                AnonymousClass1 r0 = new AnonymousClass1(this.$$this$launchTextInputSession, this.$initializeRequest, this.this$0, this.$node, r8);
                r0.L$0 = r7;
                return r0;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<?> r3) {
                return invoke2(r2, r3);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope r3, Continuation<?> r4) {
                return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
            L21:
                throw new KotlinNothingValueException();     // Catch: Throwable -> L8
            L10:
                ResultKt.throwOnFailure($result);
                CoroutineScope $this$coroutineScope = (CoroutineScope) this.L$0;
                InputMethodManager inputMethodManager = LegacyPlatformTextInputServiceAdapter_androidKt.getInputMethodManagerFactory().invoke(this.$$this$launchTextInputSession.getView());
                LegacyTextInputMethodRequest request = new LegacyTextInputMethodRequest(this.$$this$launchTextInputSession.getView(), new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1(this.$node), inputMethodManager);
                if (StylusHandwriting_androidKt.isStylusHandwritingSupported() == false) goto L13;
                BuildersKt.launch$default($this$coroutineScope, null, null, new C00431(this.this$0, inputMethodManager, null), 3, null);
            L13:
                Function1<LegacyTextInputMethodRequest, Unit> r1 = this.$initializeRequest;
                if (r1 == null) goto L16;
                r1.invoke(request);
            L16:
                AndroidLegacyPlatformTextInputServiceAdapter.access$setCurrentRequest$p(this.this$0, request);
                this.label = 1;     // Catch: Throwable -> L8
                if (this.$$this$launchTextInputSession.startInputMethod(request, this) != r0) goto L21;
                return r0;
            L5:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            L8:
                th = move-exception;
                AndroidLegacyPlatformTextInputServiceAdapter.access$setCurrentRequest$p(this.this$0, null);
                throw th;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function1<? super LegacyTextInputMethodRequest, Unit> r2, AndroidLegacyPlatformTextInputServiceAdapter r3, LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode r4, Continuation<? super AnonymousClass2> r5) {
            this.$initializeRequest = r2;
            this.this$0 = r3;
            this.$node = r4;
            super(2, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
            AnonymousClass2 r0 = new AnonymousClass2(this.$initializeRequest, this.this$0, this.$node, r6);
            r0.L$0 = r5;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(PlatformTextInputSession r3, Continuation<?> r4) {
            return ((AnonymousClass2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(PlatformTextInputSession r2, Continuation<?> r3) {
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
        L11:
            throw new KotlinNothingValueException();
        L7:
            ResultKt.throwOnFailure($result);
            PlatformTextInputSession $this$launchTextInputSession = (PlatformTextInputSession) this.L$0;
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(new AnonymousClass1($this$launchTextInputSession, this.$initializeRequest, this.this$0, this.$node, null), this) != r0) goto L11;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        $stable = 8;
    }

    public static final /* synthetic */ MutableSharedFlow access$getStylusHandwritingTrigger(AndroidLegacyPlatformTextInputServiceAdapter $this) {
        return $this.getStylusHandwritingTrigger();
    }

    public static final /* synthetic */ void access$setCurrentRequest$p(AndroidLegacyPlatformTextInputServiceAdapter $this, LegacyTextInputMethodRequest r1) {
        $this.currentRequest = r1;
    }

    public static final /* synthetic */ void access$startInput$localToScreen(LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode node, float[] matrix) {
        startInput$localToScreen(node, matrix);
    }

    public AndroidLegacyPlatformTextInputServiceAdapter() {
    }

    private final MutableSharedFlow<Unit> getStylusHandwritingTrigger() {
        MutableSharedFlow<Unit> r0 = this.backingStylusHandwritingTrigger;
        if (r0 == null) goto L6;
        return r0;
    L6:
        if (StylusHandwriting_androidKt.isStylusHandwritingSupported() == true) goto L8;
        return null;
    L8:
        MutableSharedFlow<Unit> r1 = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_LATEST, 2, null);
        this.backingStylusHandwritingTrigger = r1;
        return r1;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void startInput(final TextFieldValue value, final ImeOptions imeOptions, final Function1<? super List<? extends EditCommand>, Unit> r9, final Function1<? super ImeAction, Unit> r10) {
        startInput(new AnonymousClass1(value, this, imeOptions, r9, r10));
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void startInput() {
        startInput(null);
    }

    private final void startInput(Function1<? super LegacyTextInputMethodRequest, Unit> r4) {
        LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode node = getTextInputModifierNode();
        if (node != null) goto L5;
        return;
    L5:
        this.job = node.launchTextInputSession(new AnonymousClass2(r4, this, node, null));
    }

    private static final void startInput$localToScreen(LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode node, float[] matrix) {
        LayoutCoordinates coordinates = node.getLayoutCoordinates();
        if (coordinates != null) goto L5;
        return;
    L5:
        if (coordinates.isAttached() == true) goto L8;
        coordinates = null;
    L8:
        if (coordinates == null) goto L13;
        coordinates.mo5730transformToScreen58bKbWc(matrix);
        return;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void stopInput() {
        Job r0 = this.job;
        if (r0 == null) goto L5;
        Job.DefaultImpls.cancel$default(r0, null, 1, null);
    L5:
        this.job = null;
        MutableSharedFlow<Unit> r1 = getStylusHandwritingTrigger();
        if (r1 == null) goto L9;
        r1.resetReplayCache();
        return;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void updateState(TextFieldValue oldValue, TextFieldValue newValue) {
        LegacyTextInputMethodRequest r0 = this.currentRequest;
        if (r0 == null) goto L6;
        r0.updateState(oldValue, newValue);
        return;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void notifyFocusedRect(Rect rect) {
        LegacyTextInputMethodRequest r0 = this.currentRequest;
        if (r0 == null) goto L6;
        r0.notifyFocusedRect(rect);
        return;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Function1<? super Matrix, Unit> r10, Rect innerTextFieldBounds, Rect decorationBoxBounds) {
        LegacyTextInputMethodRequest r0 = this.currentRequest;
        if (r0 == null) goto L6;
        r0.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResult, innerTextFieldBounds, decorationBoxBounds);
        return;
    }

    @Override // androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter
    public void startStylusHandwriting() {
        MutableSharedFlow<Unit> r0 = getStylusHandwritingTrigger();
        if (r0 == null) goto L6;
        r0.tryEmit(Unit.INSTANCE);
        return;
    }
}
