package androidx.compose.foundation.text;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;

/* JADX INFO: compiled from: DeadKeyCombiner.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/text/DeadKeyCombiner;", "", "()V", "deadKeyCode", "", "Ljava/lang/Integer;", "consume", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/key/KeyEvent;", "consume-ZmokQxo", "(Landroid/view/KeyEvent;)Ljava/lang/Integer;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DeadKeyCombiner {
    public static final int $stable = 0;
    private Integer deadKeyCode;

    static {
        $stable = 8;
    }

    public DeadKeyCombiner() {
    }

    /* JADX INFO: renamed from: consume-ZmokQxo, reason: not valid java name */
    public final Integer m1049consumeZmokQxo(KeyEvent event) {
        int codePoint = KeyEvent_androidKt.m5447getUtf16CodePointZmokQxo(event);
        Integer r2 = null;
        if ((Integer.MIN_VALUE & codePoint) == 0) goto L6;
        this.deadKeyCode = Integer.valueOf(Integer.MAX_VALUE & codePoint);
        return null;
    L6:
        Integer localDeadKeyCode = this.deadKeyCode;
        if (localDeadKeyCode == null) goto L18;
        this.deadKeyCode = null;
        Integer r3 = Integer.valueOf(KeyCharacterMap.getDeadChar(localDeadKeyCode.intValue(), codePoint));
        int it = r3.intValue();
        if (it != 0) goto L11;
        boolean r6 = true;
    L12:
        if (r6 == true) goto L14;
        r2 = r3;
    L14:
        if (r2 == null) goto L16;
        return r2;
    L16:
        return Integer.valueOf(codePoint);
    L11:
        r6 = false;
        goto L12
    L18:
        return Integer.valueOf(codePoint);
    }
}
