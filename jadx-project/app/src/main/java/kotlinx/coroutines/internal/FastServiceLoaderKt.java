package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;

/* JADX INFO: compiled from: FastServiceLoader.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"ANDROID_DETECTED", "", "getANDROID_DETECTED", "()Z", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FastServiceLoaderKt {
    private static final boolean ANDROID_DETECTED = false;

    static {
        Result.Companion r0 = Result.Companion;     // Catch: Throwable -> L4
        Object r1 = Result.m7425constructorimpl(Class.forName("android.os.Build"));     // Catch: Throwable -> L4
    L6:
        ANDROID_DETECTED = Result.m7432isSuccessimpl(r1);
        return;
    L4:
        th = move-exception;
        Result.Companion r2 = Result.Companion;
        r1 = Result.m7425constructorimpl(ResultKt.createFailure(th));
        goto L6
    }

    public static final boolean getANDROID_DETECTED() {
        return ANDROID_DETECTED;
    }
}
