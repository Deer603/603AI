package kotlinx.coroutines;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001BZ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012%\b\u0002\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003J&\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J`\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042%\b\u0002\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u001a\u0010\u001d\u001a\u00020\u000b2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001f2\u0006\u0010\n\u001a\u00020\u0007J\t\u0010 \u001a\u00020!HÖ\u0001R\u0012\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\f\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R-\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lkotlinx/coroutines/CompletedContinuation;", "", "result", "cancelHandler", "Lkotlinx/coroutines/CancelHandler;", "onCancellation", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "cause", "", "idempotentResume", "cancelCause", "(Ljava/lang/Object;Lkotlinx/coroutines/CancelHandler;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Throwable;)V", "cancelled", "", "getCancelled", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "invokeHandlers", "cont", "Lkotlinx/coroutines/CancellableContinuationImpl;", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class CompletedContinuation {
    public final Throwable cancelCause;
    public final CancelHandler cancelHandler;
    public final Object idempotentResume;
    public final Function1<Throwable, Unit> onCancellation;
    public final Object result;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CompletedContinuation copy$default(CompletedContinuation r0, Object r1, CancelHandler r2, Function1 r3, Object r4, Throwable r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.result;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.cancelHandler;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.onCancellation;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r0.idempotentResume;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r0.cancelCause;
    L17:
        Object r8 = r4;
        Throwable r9 = r5;
        Function1 r10 = r3;
        Object r11 = r1;
        return r0.copy(r11, r2, r10, r8, r9);
    }

    public final Object component1() {
        return this.result;
    }

    public final CancelHandler component2() {
        return this.cancelHandler;
    }

    public final Function1<Throwable, Unit> component3() {
        return this.onCancellation;
    }

    public final Object component4() {
        return this.idempotentResume;
    }

    public final Throwable component5() {
        return this.cancelCause;
    }

    public final CompletedContinuation copy(Object r7, CancelHandler r8, Function1<? super Throwable, Unit> r9, Object r10, Throwable r11) {
        return new CompletedContinuation(r7, r8, r9, r10, r11);
    }

    public boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof CompletedContinuation) == true) goto L8;
        return false;
    L8:
        CompletedContinuation r1 = (CompletedContinuation) r6;
        if (Intrinsics.areEqual(this.result, r1.result) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.cancelHandler, r1.cancelHandler) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.areEqual(this.onCancellation, r1.onCancellation) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.areEqual(this.idempotentResume, r1.idempotentResume) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.areEqual(this.cancelCause, r1.cancelCause) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        int r1 = 0;
        if (this.result != null) goto L5;
        int r0 = 0;
    L6:
        int r2 = r0 * 31;
        if (this.cancelHandler != null) goto L9;
        int r3 = 0;
    L10:
        int r4 = (r2 + r3) * 31;
        if (this.onCancellation != null) goto L13;
        int r5 = 0;
    L14:
        int r6 = (r4 + r5) * 31;
        if (this.idempotentResume != null) goto L17;
        int r7 = 0;
    L18:
        int r8 = (r6 + r7) * 31;
        if (this.cancelCause == null) goto L23;
        r1 = this.cancelCause.hashCode();
    L23:
        return r8 + r1;
    L17:
        r7 = this.idempotentResume.hashCode();
        goto L18
    L13:
        r5 = this.onCancellation.hashCode();
        goto L14
    L9:
        r3 = this.cancelHandler.hashCode();
        goto L10
    L5:
        r0 = this.result.hashCode();
        goto L6
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.result + ", cancelHandler=" + this.cancelHandler + ", onCancellation=" + this.onCancellation + ", idempotentResume=" + this.idempotentResume + ", cancelCause=" + this.cancelCause + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CompletedContinuation(Object result, CancelHandler cancelHandler, Function1<? super Throwable, Unit> r3, Object idempotentResume, Throwable cancelCause) {
        this.result = result;
        this.cancelHandler = cancelHandler;
        this.onCancellation = r3;
        this.idempotentResume = idempotentResume;
        this.cancelCause = cancelCause;
    }

    public /* synthetic */ CompletedContinuation(Object r2, CancelHandler r3, Function1 r4, Object r5, Throwable r6, int r7, DefaultConstructorMarker r8) {
        if ((r7 & 2) == 0) goto L6;
        r3 = null;
    L6:
        if ((r7 & 4) == 0) goto L9;
        r4 = null;
    L9:
        if ((r7 & 8) == 0) goto L12;
        r5 = null;
    L12:
        if ((r7 & 16) == 0) goto L14;
        Throwable r9 = null;
    L15:
        Object r10 = r5;
        this(r2, r3, r4, r10, r9);
        return;
    L14:
        r9 = r6;
        goto L15
    }

    public final boolean getCancelled() {
        if (this.cancelCause == null) goto L5;
        return true;
    L5:
        return false;
    }

    public final void invokeHandlers(CancellableContinuationImpl<?> r3, Throwable cause) {
        CancelHandler it = this.cancelHandler;
        if (it == null) goto L5;
        r3.callCancelHandler(it, cause);
    L5:
        Function1<Throwable, Unit> r0 = this.onCancellation;
        if (r0 == null) goto L9;
        r3.callOnCancellation(r0, cause);
        return;
    }
}
