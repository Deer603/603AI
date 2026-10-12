package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.OnReceiveContentListener;

/* JADX INFO: loaded from: classes4.dex */
public final class TextViewOnReceiveContentListener implements OnReceiveContentListener {
    private static final String LOG_TAG = "ReceiveContent";

    public TextViewOnReceiveContentListener() {
    }

    @Override // androidx.core.view.OnReceiveContentListener
    public ContentInfoCompat onReceiveContent(View view, ContentInfoCompat payload) {
        if (Log.isLoggable(LOG_TAG, 3) == false) goto L5;
        Log.d(LOG_TAG, "onReceive: " + payload);
    L5:
        int source = payload.getSource();
        if (source != 2) goto L8;
        return payload;
    L8:
        ClipData clip = payload.getClip();
        int flags = payload.getFlags();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean didFirst = false;
        int i = 0;
    L10:
        if (i >= clip.getItemCount()) goto L17;
        CharSequence itemText = coerceToText(context, clip.getItemAt(i), flags);
        if (itemText == null) goto L16;
        if (didFirst == true) goto L15;
        replaceSelection(editable, itemText);
        didFirst = true;
        goto L16
    L15:
        editable.insert(Selection.getSelectionEnd(editable), "\n");
        editable.insert(Selection.getSelectionEnd(editable), itemText);
    L16:
        i = i + 1;
        goto L10
    L17:
        return null;
    }

    private static CharSequence coerceToText(Context context, ClipData.Item item, int flags) {
        if ((flags & 1) == 0) goto L10;
        CharSequence text = item.coerceToText(context);
        if ((text instanceof Spanned) == false) goto L8;
        return text.toString();
    L8:
        return text;
    L10:
        return item.coerceToStyledText(context);
    }

    private static void replaceSelection(Editable editable, CharSequence replacement) {
        int selStart = Selection.getSelectionStart(editable);
        int selEnd = Selection.getSelectionEnd(editable);
        int start = Math.max(0, Math.min(selStart, selEnd));
        int end = Math.max(0, Math.max(selStart, selEnd));
        Selection.setSelection(editable, end);
        editable.replace(start, end, replacement);
    }
}
