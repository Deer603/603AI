package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;

/* JADX INFO: compiled from: HandwritingHandler.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, d2 = {"handwritingHandler", "Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class HandwritingHandler_androidKt {
    public static final Modifier handwritingHandler(Modifier $this$handwritingHandler) {
        if (StylusHandwriting_androidKt.isStylusHandwritingSupported() == false) goto L6;
        return $this$handwritingHandler.then(new HandwritingHandlerElement());
    L6:
        return $this$handwritingHandler;
    }
}
