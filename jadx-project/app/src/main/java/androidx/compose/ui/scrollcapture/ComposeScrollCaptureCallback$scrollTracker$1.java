package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsProperties;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ComposeScrollCaptureCallback.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", "delta"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1", f = "ComposeScrollCaptureCallback.android.kt", i = {0}, l = {88}, m = "invokeSuspend", n = {"reverseScrolling"}, s = {"Z$0"})
final class ComposeScrollCaptureCallback$scrollTracker$1 extends SuspendLambda implements Function2<Float, Continuation<? super Float>, Object> {
    /* synthetic */ float F$0;
    boolean Z$0;
    int label;
    final /* synthetic */ ComposeScrollCaptureCallback this$0;

    ComposeScrollCaptureCallback$scrollTracker$1(ComposeScrollCaptureCallback r2, Continuation<? super ComposeScrollCaptureCallback$scrollTracker$1> r3) {
        this.this$0 = r2;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        ComposeScrollCaptureCallback$scrollTracker$1 r0 = new ComposeScrollCaptureCallback$scrollTracker$1(this.this$0, r4);
        r0.F$0 = ((Number) r3).floatValue();
        return r0;
    }

    public final Object invoke(float r3, Continuation<? super Float> r4) {
        return ((ComposeScrollCaptureCallback$scrollTracker$1) create(Float.valueOf(r3), r4)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Float r3, Continuation<? super Float> r4) {
        return invoke(r3.floatValue(), r4);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r20) {
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(this.label) {
            case 0: goto L7;
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        Object $result = r20;
        boolean reverseScrolling = this.Z$0;
        ResultKt.throwOnFailure($result);
        boolean reverseScrolling2 = reverseScrolling;
    L16:
        long value$iv$iv = ((Offset) $result).m4135unboximpl();
        if (reverseScrolling2 == false) goto L19;
        int bits$iv$iv$iv = (int) (4294967295L & value$iv$iv);
        float r2 = -Float.intBitsToFloat(bits$iv$iv$iv);
    L21:
        return Boxing.boxFloat(r2);
    L19:
        int bits$iv$iv$iv2 = (int) (4294967295L & value$iv$iv);
        r2 = Float.intBitsToFloat(bits$iv$iv$iv2);
        goto L21
    L7:
        ResultKt.throwOnFailure(r20);
        float delta = this.F$0;
        Function2<Offset, Continuation<? super Offset>, Object> r6 = ScrollCapture_androidKt.getScrollCaptureScrollByAction(ComposeScrollCaptureCallback.access$getNode$p(this.this$0));
        if (r6 == null) goto L22;
        reverseScrolling2 = ((ScrollAxisRange) ComposeScrollCaptureCallback.access$getNode$p(this.this$0).getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getVerticalScrollAxisRange())).getReverseScrolling();
        if (reverseScrolling2 == false) goto L12;
        delta = -delta;
    L12:
        long v1$iv$iv = Float.floatToRawIntBits(0.0f);
        long v2$iv$iv = Float.floatToRawIntBits(delta);
        Offset r5 = Offset.m4114boximpl(Offset.m4117constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L)));
        this.Z$0 = reverseScrolling2;
        this.label = 1;
        Object r7 = r6.invoke(r5, this);
        if (r7 != r1) goto L15;
        return r1;
    L15:
        $result = r7;
        goto L16
    L22:
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Required value was null.");
        throw new KotlinNothingValueException();
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
