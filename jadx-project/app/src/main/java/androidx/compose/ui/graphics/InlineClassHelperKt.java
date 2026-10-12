package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: InlineClassHelper.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0080\b\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001a\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0006H\u0000¨\u0006\t"}, d2 = {"requirePrecondition", "", "value", "", "lazyMessage", "Lkotlin/Function0;", "", "throwIllegalArgumentException", "message", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class InlineClassHelperKt {
    public static final void throwIllegalArgumentException(String message) {
        throw new IllegalArgumentException(message);
    }

    public static final void requirePrecondition(boolean value, Function0<String> r3) {
        if (value == true) goto L6;
        throwIllegalArgumentException(r3.invoke());
        return;
    }
}
