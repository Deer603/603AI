package androidx.compose.ui.input.pointer;

import kotlin.Metadata;

/* JADX INFO: compiled from: PointerInputEventProcessor.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0002\u0010\u0005\u001a\r\u0010\u0006\u001a\u00020\u0007*\u00020\u0003H\u0082\b¨\u0006\b"}, d2 = {"ProcessResult", "Landroidx/compose/ui/input/pointer/ProcessResult;", "dispatchedToAPointerInputModifier", "", "anyMovementConsumed", "(ZZ)I", "toInt", "", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PointerInputEventProcessorKt {
    public static final int ProcessResult(boolean dispatchedToAPointerInputModifier, boolean anyMovementConsumed) {
        int r2 = 0;
        if (dispatchedToAPointerInputModifier == false) goto L5;
        int r0 = 1;
    L7:
        if (anyMovementConsumed == false) goto L10;
        r2 = 1;
    L10:
        return ProcessResult.m5672constructorimpl(r0 | (r2 << 1));
    L5:
        r0 = 0;
        goto L7
    }

    private static final int toInt(boolean r1) {
        return r1 ? 1 : 0;
    }
}
