package androidx.compose.material3;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ExposedDropdownMenu.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$1", f = "ExposedDropdownMenu.android.kt", i = {}, l = {1426}, m = "invokeSuspend", n = {}, s = {})
final class ExposedDropdownMenu_androidKt$expandable$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $anchorType;
    final /* synthetic */ Function0<Unit> $onExpandedChange;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: ExposedDropdownMenu.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$1$1", f = "ExposedDropdownMenu.android.kt", i = {0}, l = {1430, 1434}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $anchorType;
        final /* synthetic */ Function0<Unit> $onExpandedChange;
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(String r2, Function0<Unit> r3, Continuation<? super AnonymousClass1> r4) {
            this.$anchorType = r2;
            this.$onExpandedChange = r3;
            super(2, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            AnonymousClass1 r0 = new AnonymousClass1(this.$anchorType, this.$onExpandedChange, r5);
            r0.L$0 = r4;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(AwaitPointerEventScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(AwaitPointerEventScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
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
            AnonymousClass1 r1 = this;
            ResultKt.throwOnFailure($result);
        L19:
            PointerInputChange upEvent = (PointerInputChange) $result;
            if (upEvent == null) goto L23;
            r1.$onExpandedChange.invoke();
        L23:
            return Unit.INSTANCE;
        L7:
            AwaitPointerEventScope $this$awaitEachGesture = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure($result);
            AwaitPointerEventScope $this$awaitEachGesture2 = $this$awaitEachGesture;
            AnonymousClass1 r2 = this;
        L12:
            PointerInputChange downEvent = (PointerInputChange) $result;
            if (MenuAnchorType.m2347equalsimpl0(r2.$anchorType, MenuAnchorType.Companion.m2353getSecondaryEditableMg6Rgbw()) == false) goto L15;
            downEvent.consume();
        L15:
            r2.L$0 = null;
            r2.label = 2;
            $result = TapGestureDetectorKt.waitForUpOrCancellation($this$awaitEachGesture2, PointerEventPass.Initial, r2);
            if ($result != r0) goto L18;
            return r0;
        L18:
            r1 = r2;
            goto L19
        L8:
            ResultKt.throwOnFailure($result);
            $this$awaitEachGesture2 = (AwaitPointerEventScope) this.L$0;
            this.L$0 = $this$awaitEachGesture2;
            this.label = 1;
            Object r3 = TapGestureDetectorKt.awaitFirstDown$default($this$awaitEachGesture2, false, PointerEventPass.Initial, this, 1, null);
            if (r3 != r0) goto L11;
            return r0;
        L11:
            $result = r3;
            r2 = this;
            goto L12
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    ExposedDropdownMenu_androidKt$expandable$1(String r2, Function0<Unit> r3, Continuation<? super ExposedDropdownMenu_androidKt$expandable$1> r4) {
        this.$anchorType = r2;
        this.$onExpandedChange = r3;
        super(2, r4);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
        ExposedDropdownMenu_androidKt$expandable$1 r0 = new ExposedDropdownMenu_androidKt$expandable$1(this.$anchorType, this.$onExpandedChange, r5);
        r0.L$0 = r4;
        return r0;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PointerInputScope r3, Continuation<? super Unit> r4) {
        return ((ExposedDropdownMenu_androidKt$expandable$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
        if (ForEachGestureKt.awaitEachGesture($this$pointerInput, new AnonymousClass1(this.$anchorType, this.$onExpandedChange, null), this) != r0) goto L12;
        return r0;
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
