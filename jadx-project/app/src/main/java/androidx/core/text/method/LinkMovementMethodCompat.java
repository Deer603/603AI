package androidx.core.text.method;

import android.os.Build;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.Touch;
import android.view.MotionEvent;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public class LinkMovementMethodCompat extends LinkMovementMethod {
    private static LinkMovementMethodCompat sInstance;

    private LinkMovementMethodCompat() {
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(TextView widget, Spannable buffer, MotionEvent event) {
        if (Build.VERSION.SDK_INT >= 35) goto L25;
        int action = event.getAction();
        boolean isOutOfLineBounds = true;
        if (action == 1) goto L7;
        if (action != 0) goto L25;
    L7:
        int x = (int) event.getX();
        int y = (int) event.getY();
        int x2 = x - widget.getTotalPaddingLeft();
        int y2 = y - widget.getTotalPaddingTop();
        int x3 = x2 + widget.getScrollX();
        int y3 = y2 + widget.getScrollY();
        Layout layout = widget.getLayout();
        if (y3 >= 0) goto L10;
    L20:
        isOutOfLineBounds = true;
    L21:
        if (isOutOfLineBounds == false) goto L25;
        Selection.removeSelection(buffer);
        return Touch.onTouchEvent(widget, buffer, event);
    L10:
        if (y3 > layout.getHeight()) goto L20;
        int line = layout.getLineForVertical(y3);
        if (x3 < layout.getLineLeft(line)) goto L21;
        if (x3 > layout.getLineRight(line)) goto L21;
        isOutOfLineBounds = false;
    L25:
        return super.onTouchEvent(widget, buffer, event);
    }

    public static LinkMovementMethodCompat getInstance() {
        if (sInstance != null) goto L6;
        sInstance = new LinkMovementMethodCompat();
    L6:
        return sInstance;
    }
}
