package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.TextInputService;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: CoreTextField.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$1", f = "CoreTextField.kt", i = {}, l = {347}, m = "invokeSuspend", n = {}, s = {})
final class CoreTextFieldKt$CoreTextField$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ImeOptions $imeOptions;
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ LegacyTextFieldState $state;
    final /* synthetic */ TextInputService $textInputService;
    final /* synthetic */ State<Boolean> $writeable$delegate;
    int label;

    CoreTextFieldKt$CoreTextField$2$1(LegacyTextFieldState r2, State<Boolean> r3, TextInputService r4, TextFieldSelectionManager r5, ImeOptions r6, Continuation<? super CoreTextFieldKt$CoreTextField$2$1> r7) {
        this.$state = r2;
        this.$writeable$delegate = r3;
        this.$textInputService = r4;
        this.$manager = r5;
        this.$imeOptions = r6;
        super(2, r7);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r8, Continuation<?> r9) {
        return new CoreTextFieldKt$CoreTextField$2$1(this.$state, this.$writeable$delegate, this.$textInputService, this.$manager, this.$imeOptions, r9);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
        return ((CoreTextFieldKt$CoreTextField$2$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
    L14:
        CoreTextFieldKt.access$endInputSession(this.$state);
        return Unit.INSTANCE;
    L10:
        ResultKt.throwOnFailure($result);
        final State<Boolean> r2 = this.$writeable$delegate;     // Catch: Throwable -> L8
        Flow r1 = SnapshotStateKt.snapshotFlow(new AnonymousClass1(r2));     // Catch: Throwable -> L8
        final LegacyTextFieldState r3 = this.$state;     // Catch: Throwable -> L8
        final TextInputService r4 = this.$textInputService;     // Catch: Throwable -> L8
        final TextFieldSelectionManager r5 = this.$manager;     // Catch: Throwable -> L8
        final ImeOptions r6 = this.$imeOptions;     // Catch: Throwable -> L8
        this.label = 1;     // Catch: Throwable -> L8
        if (r1.collect(new AnonymousClass2(r3, r4, r5, r6), this) != r0) goto L14;
        return r0;
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        th = move-exception;
        CoreTextFieldKt.access$endInputSession(this.$state);
        throw th;
    }
}
