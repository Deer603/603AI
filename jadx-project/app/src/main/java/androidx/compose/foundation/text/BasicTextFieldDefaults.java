package androidx.compose.foundation.text;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import kotlin.Metadata;

/* JADX INFO: compiled from: BasicTextField.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/BasicTextFieldDefaults;", "", "()V", "CursorBrush", "Landroidx/compose/ui/graphics/SolidColor;", "getCursorBrush", "()Landroidx/compose/ui/graphics/SolidColor;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class BasicTextFieldDefaults {
    private static final SolidColor CursorBrush = null;
    public static final BasicTextFieldDefaults INSTANCE = null;

    private BasicTextFieldDefaults() {
    }

    static {
        INSTANCE = new BasicTextFieldDefaults();
        CursorBrush = new SolidColor(Color.Companion.m4392getBlack0d7_KjU(), null);
    }

    public final SolidColor getCursorBrush() {
        return CursorBrush;
    }
}
