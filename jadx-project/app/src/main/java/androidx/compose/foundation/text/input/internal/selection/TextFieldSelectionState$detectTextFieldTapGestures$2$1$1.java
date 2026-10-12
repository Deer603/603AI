package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: TextFieldSelectionState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1$1", f = "TextFieldSelectionState.kt", i = {}, l = {502, 510}, m = "invokeSuspend", n = {}, s = {})
final class TextFieldSelectionState$detectTextFieldTapGestures$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PressGestureScope $$this$detectTapAndPress;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ long $offset;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TextFieldSelectionState this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1$1$1", f = "TextFieldSelectionState.kt", i = {1}, l = {494, 499}, m = "invokeSuspend", n = {"press"}, s = {"L$0"})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ long $offset;
        Object L$0;
        int label;
        final /* synthetic */ TextFieldSelectionState this$0;

        AnonymousClass1(TextFieldSelectionState r2, long r3, MutableInteractionSource r5, Continuation<? super AnonymousClass1> r6) {
            this.this$0 = r2;
            this.$offset = r3;
            this.$interactionSource = r5;
            super(2, r6);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r7, Continuation<?> r8) {
            return new AnonymousClass1(this.this$0, this.$offset, this.$interactionSource, r8);
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
                case 0: goto L8;
                case 1: goto L7;
                case 2: goto L6;
                default: goto L5;
            };
        L6:
            PressInteraction.Press press = (PressInteraction.Press) this.L$0;
            ResultKt.throwOnFailure($result);
        L19:
            TextFieldSelectionState.access$setPressInteraction$p(this.this$0, press);
            return Unit.INSTANCE;
        L7:
            TextFieldSelectionState r3 = (TextFieldSelectionState) this.L$0;
            ResultKt.throwOnFailure($result);
        L14:
            TextFieldSelectionState.access$setPressInteraction$p(r3, null);
        L15:
            PressInteraction.Press press2 = new PressInteraction.Press(this.$offset, null);
            this.L$0 = press2;
            this.label = 2;
            if (this.$interactionSource.emit(press2, this) != r0) goto L18;
            return r0;
        L18:
            press = press2;
            goto L19
        L8:
            ResultKt.throwOnFailure($result);
            PressInteraction.Press oldValue = TextFieldSelectionState.access$getPressInteraction$p(this.this$0);
            if (oldValue == null) goto L15;
            MutableInteractionSource r4 = this.$interactionSource;
            TextFieldSelectionState r5 = this.this$0;
            PressInteraction.Cancel interaction = new PressInteraction.Cancel(oldValue);
            this.L$0 = r5;
            this.label = 1;
            if (r4.emit(interaction, this) != r0) goto L13;
            return r0;
        L13:
            r3 = r5;
            goto L14
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    TextFieldSelectionState$detectTextFieldTapGestures$2$1$1(PressGestureScope r2, TextFieldSelectionState r3, long r4, MutableInteractionSource r6, Continuation<? super TextFieldSelectionState$detectTextFieldTapGestures$2$1$1> r7) {
        this.$$this$detectTapAndPress = r2;
        this.this$0 = r3;
        this.$offset = r4;
        this.$interactionSource = r6;
        super(2, r7);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r8, Continuation<?> r9) {
        TextFieldSelectionState$detectTextFieldTapGestures$2$1$1 r0 = new TextFieldSelectionState$detectTextFieldTapGestures$2$1$1(this.$$this$detectTapAndPress, this.this$0, this.$offset, this.$interactionSource, r9);
        r0.L$0 = r8;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
        return ((TextFieldSelectionState$detectTextFieldTapGestures$2$1$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
    L23:
        TextFieldSelectionState.access$setPressInteraction$p(this.this$0, null);
        return Unit.INSTANCE;
    L7:
        ResultKt.throwOnFailure($result);
    L12:
        boolean success = ((Boolean) $result).booleanValue();
        PressInteraction.Press pressInteraction = TextFieldSelectionState.access$getPressInteraction$p(this.this$0);
        if (pressInteraction == null) goto L23;
        MutableInteractionSource r3 = this.$interactionSource;
        if (success == false) goto L17;
        PressInteraction endInteraction = new PressInteraction.Release(pressInteraction);
    L18:
        this.label = 2;
        if (r3.emit(endInteraction, this) != r0) goto L21;
        return r0;
    L21:
        $result = $result;
        goto L23
    L17:
        endInteraction = new PressInteraction.Cancel(pressInteraction);
        goto L18
    L8:
        ResultKt.throwOnFailure($result);
        CoroutineScope $this$coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default($this$coroutineScope, null, null, new AnonymousClass1(this.this$0, this.$offset, this.$interactionSource, null), 3, null);
        this.label = 1;
        Object r1 = this.$$this$detectTapAndPress.tryAwaitRelease(this);
        if (r1 != r0) goto L11;
        return r0;
    L11:
        $result = r1;
        goto L12
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
