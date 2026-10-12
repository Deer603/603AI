package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.ui.platform.PlatformTextInputSession;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: compiled from: AndroidTextInputSession.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0002\u001a|\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\n\u0018\u00010\u001a2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\r2\u0006\u0010\u001d\u001a\u00020\u001e2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0081@¢\u0006\u0002\u0010#\u001az\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\n\u0018\u00010\u001a2\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\r2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"H\u0080@¢\u0006\u0002\u0010$\"\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\"\u000e\u0010\b\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"ALL_MIME_TYPES", "", "", "[Ljava/lang/String;", "TIA_DEBUG", "", "getTIA_DEBUG$annotations", "()V", "TIA_TAG", "logDebug", "", "tag", "content", "Lkotlin/Function0;", "platformSpecificTextInputSession", "", "Landroidx/compose/ui/platform/PlatformTextInputSession;", "state", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "layoutState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "receiveContentConfiguration", "Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "onImeAction", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/ImeAction;", "updateSelectionState", "composeImm", "Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;", "stylusHandwritingTrigger", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "(Landroidx/compose/ui/platform/PlatformTextInputSession;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;Lkotlinx/coroutines/flow/MutableSharedFlow;Landroidx/compose/ui/platform/ViewConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Landroidx/compose/ui/platform/PlatformTextInputSession;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/flow/MutableSharedFlow;Landroidx/compose/ui/platform/ViewConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidTextInputSession_androidKt {
    private static final String[] ALL_MIME_TYPES = null;
    public static final boolean TIA_DEBUG = false;
    private static final String TIA_TAG = "AndroidTextInputSession";

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidTextInputSession.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt", f = "AndroidTextInputSession.android.kt", i = {}, l = {59}, m = "platformSpecificTextInputSession", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r12) {
            this.result = r12;
            this.label |= Integer.MIN_VALUE;
            return AndroidTextInputSession_androidKt.platformSpecificTextInputSession(null, null, null, null, null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidTextInputSession.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt", f = "AndroidTextInputSession.android.kt", i = {}, l = {84}, m = "platformSpecificTextInputSession", n = {}, s = {})
    static final class AnonymousClass2 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass2(Continuation<? super AnonymousClass2> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r13) {
            this.result = r13;
            this.label |= Integer.MIN_VALUE;
            return AndroidTextInputSession_androidKt.platformSpecificTextInputSession(null, null, null, null, null, null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidTextInputSession.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3", f = "AndroidTextInputSession.android.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
        final /* synthetic */ ComposeInputMethodManager $composeImm;
        final /* synthetic */ ImeOptions $imeOptions;
        final /* synthetic */ TextLayoutState $layoutState;
        final /* synthetic */ Function1<ImeAction, Unit> $onImeAction;
        final /* synthetic */ ReceiveContentConfiguration $receiveContentConfiguration;
        final /* synthetic */ TransformedTextFieldState $state;
        final /* synthetic */ MutableSharedFlow<Unit> $stylusHandwritingTrigger;
        final /* synthetic */ PlatformTextInputSession $this_platformSpecificTextInputSession;
        final /* synthetic */ Function0<Unit> $updateSelectionState;
        final /* synthetic */ ViewConfiguration $viewConfiguration;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1, reason: invalid class name */
        /* JADX INFO: compiled from: AndroidTextInputSession.android.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1", f = "AndroidTextInputSession.android.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ ComposeInputMethodManager $composeImm;
            final /* synthetic */ TransformedTextFieldState $state;
            int label;

            AnonymousClass1(TransformedTextFieldState r2, ComposeInputMethodManager r3, Continuation<? super AnonymousClass1> r4) {
                this.$state = r2;
                this.$composeImm = r3;
                super(2, r4);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
                return new AnonymousClass1(this.$state, this.$composeImm, r5);
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
            L11:
                throw new KotlinNothingValueException();
            L7:
                ResultKt.throwOnFailure($result);
                TransformedTextFieldState r1 = this.$state;
                final ComposeInputMethodManager r2 = this.$composeImm;
                this.label = 1;
                if (r1.collectImeNotifications(new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1$$ExternalSyntheticLambda0(r2), this) != r0) goto L11;
                return r0;
            L5:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            static final void invokeSuspend$lambda$0(ComposeInputMethodManager $composeImm, TextFieldCharSequence oldValue, TextFieldCharSequence newValue, boolean restartIme) {
                long oldSelection = oldValue.m1188getSelectiond9O1mEE();
                TextRange oldComposition = oldValue.m1187getCompositionMzsxiRA();
                long newSelection = newValue.m1188getSelectiond9O1mEE();
                TextRange newComposition = newValue.m1187getCompositionMzsxiRA();
                if (restartIme == false) goto L6;
                $composeImm.restartInput();
                return;
            L6:
                if (TextRange.m6410equalsimpl0(oldSelection, newSelection) == true) goto L8;
            L10:
                int r6 = TextRange.m6415getMinimpl(newSelection);
                int r7 = TextRange.m6414getMaximpl(newSelection);
                int r8 = -1;
                if (newComposition == null) goto L13;
                int r9 = TextRange.m6415getMinimpl(newComposition.m6421unboximpl());
            L14:
                if (newComposition == null) goto L16;
                r8 = TextRange.m6414getMaximpl(newComposition.m6421unboximpl());
            L16:
                $composeImm.updateSelection(r6, r7, r9, r8);
                return;
            L13:
                r9 = -1;
                goto L14
            L8:
                if (Intrinsics.areEqual(oldComposition, newComposition) == false) goto L10;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(MutableSharedFlow<Unit> r2, TransformedTextFieldState r3, TextLayoutState r4, ComposeInputMethodManager r5, PlatformTextInputSession r6, ImeOptions r7, ReceiveContentConfiguration r8, Function1<? super ImeAction, Unit> r9, Function0<Unit> r10, ViewConfiguration r11, Continuation<? super AnonymousClass3> r12) {
            this.$stylusHandwritingTrigger = r2;
            this.$state = r3;
            this.$layoutState = r4;
            this.$composeImm = r5;
            this.$this_platformSpecificTextInputSession = r6;
            this.$imeOptions = r7;
            this.$receiveContentConfiguration = r8;
            this.$onImeAction = r9;
            this.$updateSelectionState = r10;
            this.$viewConfiguration = r11;
            super(2, r12);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r13, Continuation<?> r14) {
            AnonymousClass3 r0 = new AnonymousClass3(this.$stylusHandwritingTrigger, this.$state, this.$layoutState, this.$composeImm, this.$this_platformSpecificTextInputSession, this.$imeOptions, this.$receiveContentConfiguration, this.$onImeAction, this.$updateSelectionState, this.$viewConfiguration, r14);
            r0.L$0 = r13;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<?> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<?> r4) {
            return ((AnonymousClass3) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure($result);
        L15:
            throw new KotlinNothingValueException();
        L7:
            ResultKt.throwOnFailure($result);
            CoroutineScope $this$coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt.launch$default($this$coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(this.$state, this.$composeImm, null), 1, null);
            MutableSharedFlow<Unit> r3 = this.$stylusHandwritingTrigger;
            if (r3 == null) goto L10;
            BuildersKt.launch$default($this$coroutineScope, null, null, new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1(r3, this.$composeImm, null), 3, null);
        L10:
            final CursorAnchorInfoController cursorUpdatesController = new CursorAnchorInfoController(this.$state, this.$layoutState, this.$composeImm, $this$coroutineScope);
            PlatformTextInputSession r4 = this.$this_platformSpecificTextInputSession;
            final TransformedTextFieldState r9 = this.$state;
            final ImeOptions r10 = this.$imeOptions;
            final ReceiveContentConfiguration r11 = this.$receiveContentConfiguration;
            final ComposeInputMethodManager r12 = this.$composeImm;
            final Function1<ImeAction, Unit> r13 = this.$onImeAction;
            final TextLayoutState r15 = this.$layoutState;
            final Function0<Unit> r5 = this.$updateSelectionState;
            final ViewConfiguration r6 = this.$viewConfiguration;
            this.label = 1;
            if (r4.startInputMethod(new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$$ExternalSyntheticLambda0(r9, r10, r11, r12, r13, cursorUpdatesController, r15, r5, r6), this) != r1) goto L15;
            return r1;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        static final InputConnection invokeSuspend$lambda$2(final TransformedTextFieldState $state, ImeOptions $imeOptions, ReceiveContentConfiguration $receiveContentConfiguration, ComposeInputMethodManager $composeImm, Function1 $onImeAction, CursorAnchorInfoController $cursorUpdatesController, TextLayoutState $layoutState, Function0 $updateSelectionState, ViewConfiguration $viewConfiguration, EditorInfo outAttrs) {
            AndroidTextInputSession_androidKt.logDebug$default(null, new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$1($state), 1, null);
            DefaultImeEditCommandScope imeEditCommandScope = new DefaultImeEditCommandScope($state);
            AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1 textInputSession = new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1(imeEditCommandScope, $state, $composeImm, $onImeAction, $receiveContentConfiguration, $cursorUpdatesController, $layoutState, $updateSelectionState, $viewConfiguration);
            TextFieldCharSequence r4 = $state.getVisualText();
            long r5 = $state.getVisualText().m1188getSelectiond9O1mEE();
            if ($receiveContentConfiguration == null) goto L5;
            String[] r8 = AndroidTextInputSession_androidKt.access$getALL_MIME_TYPES$p();
        L6:
            EditorInfo_androidKt.m1228updatepLxbY9I(outAttrs, r4, r5, $imeOptions, r8);
            return new StatelessInputConnection(textInputSession, outAttrs);
        L5:
            r8 = null;
            goto L6
        }
    }

    public static final /* synthetic */ String[] access$getALL_MIME_TYPES$p() {
        return ALL_MIME_TYPES;
    }

    public static /* synthetic */ void getTIA_DEBUG$annotations() {
    }

    public static final Object platformSpecificTextInputSession(PlatformTextInputSession $this$platformSpecificTextInputSession, TransformedTextFieldState state, TextLayoutState layoutState, ImeOptions imeOptions, ReceiveContentConfiguration receiveContentConfiguration, Function1<? super ImeAction, Unit> r19, Function0<Unit> r20, MutableSharedFlow<Unit> r21, ViewConfiguration viewConfiguration, Continuation<?> r23) {
        if ((r23 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r1 = (AnonymousClass1) r23;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        AnonymousClass1 r12 = r1;
        Object $result = r12.result;
        Object r13 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r12.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        ResultKt.throwOnFailure($result);
    L17:
        throw new KotlinNothingValueException();
    L13:
        ResultKt.throwOnFailure($result);
        ComposeInputMethodManager r9 = ComposeInputMethodManager_androidKt.ComposeInputMethodManager($this$platformSpecificTextInputSession.getView());
        r12.label = 1;
        if (platformSpecificTextInputSession($this$platformSpecificTextInputSession, state, layoutState, imeOptions, receiveContentConfiguration, r19, r20, r9, r21, viewConfiguration, r12) != r13) goto L17;
        return r13;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new AnonymousClass1(r23);
        goto L8
    }

    public static /* synthetic */ Object platformSpecificTextInputSession$default(PlatformTextInputSession r1, TransformedTextFieldState r2, TextLayoutState r3, ImeOptions r4, ReceiveContentConfiguration r5, Function1 r6, Function0 r7, MutableSharedFlow r8, ViewConfiguration r9, Continuation r10, int r11, Object r12) {
        if ((r11 & 32) == 0) goto L6;
        r7 = null;
    L6:
        if ((r11 & 64) == 0) goto L9;
        r8 = null;
    L9:
        if ((r11 & 128) == 0) goto L12;
        r9 = null;
    L12:
        return platformSpecificTextInputSession(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
    }

    public static final Object platformSpecificTextInputSession(PlatformTextInputSession $this$platformSpecificTextInputSession, TransformedTextFieldState state, TextLayoutState layoutState, ImeOptions imeOptions, ReceiveContentConfiguration receiveContentConfiguration, Function1<? super ImeAction, Unit> r22, Function0<Unit> r23, ComposeInputMethodManager composeImm, MutableSharedFlow<Unit> r25, ViewConfiguration viewConfiguration, Continuation<?> r27) {
        if ((r27 instanceof AnonymousClass2) == false) goto L7;
        AnonymousClass2 r1 = (AnonymousClass2) r27;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r1.result;
        Object r3 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r1.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        ResultKt.throwOnFailure($result);
    L17:
        throw new KotlinNothingValueException();
    L13:
        ResultKt.throwOnFailure($result);
        AnonymousClass3 r5 = new AnonymousClass3(r25, state, layoutState, composeImm, $this$platformSpecificTextInputSession, imeOptions, receiveContentConfiguration, r22, r23, viewConfiguration, null);
        r1.label = 1;
        if (CoroutineScopeKt.coroutineScope(r5, r1) != r3) goto L17;
        return r3;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new AnonymousClass2(r27);
        goto L8
    }

    static {
        ALL_MIME_TYPES = new String[]{"*/*", "image/*", "video/*"};
    }

    static /* synthetic */ void logDebug$default(String r0, Function0 r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r0 = TIA_TAG;
    L5:
        logDebug(r0, r1);
    }

    private static final void logDebug(String tag, Function0<String> r1) {
    }
}
