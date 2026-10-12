package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: BasicTextField.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1", f = "BasicTextField.kt", i = {0}, l = {321}, m = "showTextToolbar", n = {"$this$showTextToolbar_u24lambda_u245"}, s = {"L$1"})
final class BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1 this$0;

    BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1(BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1 r1, Continuation<? super BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1> r2) {
        this.this$0 = r1;
        super(r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r4) {
        this.result = r4;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.showTextToolbar(null, null, this);
    }
}
