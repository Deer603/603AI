package androidx.compose.foundation.text;

import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIcon_androidKt;
import androidx.core.view.PointerIconCompat;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextPointerIcon.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"handwritingPointerIcon", "Landroidx/compose/ui/input/pointer/PointerIcon;", "getHandwritingPointerIcon", "()Landroidx/compose/ui/input/pointer/PointerIcon;", "textPointerIcon", "getTextPointerIcon", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextPointerIcon_androidKt {
    private static final PointerIcon handwritingPointerIcon = null;
    private static final PointerIcon textPointerIcon = null;

    static {
        textPointerIcon = PointerIcon_androidKt.PointerIcon(PointerIconCompat.TYPE_TEXT);
        handwritingPointerIcon = PointerIcon_androidKt.PointerIcon(1022);
    }

    public static final PointerIcon getTextPointerIcon() {
        return textPointerIcon;
    }

    public static final PointerIcon getHandwritingPointerIcon() {
        return handwritingPointerIcon;
    }
}
