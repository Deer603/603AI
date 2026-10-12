package androidx.compose.ui.internal;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: InlineClassHelper.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u0005\u001a\u001c\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0080\b\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0080\b\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001a/\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\b\u0010\u0002\u001a\u0004\u0018\u0001H\bH\u0080\b\u0082\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0002\u0010\n\u001a=\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\b\u0010\u0002\u001a\u0004\u0018\u0001H\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0080\b\u0082\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0002\u0010\u000b\u001a*\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0080\b\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001a=\u0010\r\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\b\u0010\u0002\u001a\u0004\u0018\u0001H\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0080\b\u0082\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0002\u0010\u000b\u001a\u0010\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0006H\u0000¨\u0006\u0016"}, d2 = {"checkPrecondition", "", "value", "", "lazyMessage", "Lkotlin/Function0;", "", "checkPreconditionNotNull", "T", "", "(Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "requirePrecondition", "requirePreconditionNotNull", "throwIllegalArgumentException", "message", "throwIllegalArgumentExceptionForNullCheck", "", "throwIllegalStateException", "throwIllegalStateExceptionForNullCheck", "throwIndexOutOfBoundsException", "throwUnsupportedOperationException", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class InlineClassHelperKt {
    public static final void throwIllegalStateException(String message) {
        throw new IllegalStateException(message);
    }

    public static final Void throwIllegalStateExceptionForNullCheck(String message) {
        throw new IllegalStateException(message);
    }

    public static final void throwIllegalArgumentException(String message) {
        throw new IllegalArgumentException(message);
    }

    public static final Void throwIllegalArgumentExceptionForNullCheck(String message) {
        throw new IllegalArgumentException(message);
    }

    public static final void throwUnsupportedOperationException(String message) {
        throw new UnsupportedOperationException(message);
    }

    public static final void throwIndexOutOfBoundsException(String message) {
        throw new IndexOutOfBoundsException(message);
    }

    public static final void checkPrecondition(boolean value, Function0<String> r3) {
        if (value == true) goto L6;
        throwIllegalStateException(r3.invoke());
        return;
    }

    public static final void checkPrecondition(boolean value) {
        if (value == true) goto L6;
        throwIllegalStateException("Check failed.");
        return;
    }

    public static final <T> T checkPreconditionNotNull(T r2, Function0<String> r3) {
        if (r2 == null) goto L5;
        return r2;
    L5:
        throwIllegalStateExceptionForNullCheck(r3.invoke());
        throw new KotlinNothingValueException();
    }

    public static final <T> T checkPreconditionNotNull(T r2) {
        if (r2 == null) goto L5;
        return r2;
    L5:
        throwIllegalStateExceptionForNullCheck("Required value was null.");
        throw new KotlinNothingValueException();
    }

    public static final void requirePrecondition(boolean value, Function0<String> r3) {
        if (value == true) goto L6;
        throwIllegalArgumentException(r3.invoke());
        return;
    }

    public static final <T> T requirePreconditionNotNull(T r2, Function0<String> r3) {
        if (r2 == null) goto L5;
        return r2;
    L5:
        throwIllegalArgumentExceptionForNullCheck(r3.invoke());
        throw new KotlinNothingValueException();
    }
}
