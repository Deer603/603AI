package androidx.compose.ui.text.android;

import android.text.Layout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TextLayout.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/android/TextAlignmentAdapter;", "", "()V", "ALIGN_LEFT_FRAMEWORK", "Landroid/text/Layout$Alignment;", "ALIGN_RIGHT_FRAMEWORK", "get", "value", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextAlignmentAdapter {
    public static final int $stable = 0;
    private static final Layout.Alignment ALIGN_LEFT_FRAMEWORK = null;
    private static final Layout.Alignment ALIGN_RIGHT_FRAMEWORK = null;
    public static final TextAlignmentAdapter INSTANCE = null;

    private TextAlignmentAdapter() {
    }

    static {
        INSTANCE = new TextAlignmentAdapter();
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignLeft = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignRight = Layout.Alignment.ALIGN_NORMAL;
        int r3 = values.length;
        int r4 = 0;
    L3:
        if (r4 >= r3) goto L11;
        Layout.Alignment value = values[r4];
        if (Intrinsics.areEqual(value.name(), "ALIGN_LEFT") == false) goto L8;
        alignLeft = value;
    L10:
        r4 = r4 + 1;
        goto L3
    L8:
        if (Intrinsics.areEqual(value.name(), "ALIGN_RIGHT") == false) goto L10;
        alignRight = value;
        goto L10
    L11:
        ALIGN_LEFT_FRAMEWORK = alignLeft;
        ALIGN_RIGHT_FRAMEWORK = alignRight;
    }

    public final Layout.Alignment get(int value) {
        switch(value) {
            case 0: goto L9;
            case 1: goto L14;
            case 2: goto L13;
            case 3: goto L12;
            case 4: goto L11;
            default: goto L10;
        };
    L10:
        return Layout.Alignment.ALIGN_NORMAL;
    L11:
        return ALIGN_RIGHT_FRAMEWORK;
    L12:
        return ALIGN_LEFT_FRAMEWORK;
    L13:
        return Layout.Alignment.ALIGN_CENTER;
    L14:
        return Layout.Alignment.ALIGN_OPPOSITE;
    L9:
        return Layout.Alignment.ALIGN_NORMAL;
    }
}
