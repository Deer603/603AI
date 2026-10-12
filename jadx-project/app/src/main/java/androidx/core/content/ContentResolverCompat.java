package androidx.core.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.OperationCanceledException;
import androidx.core.os.CancellationSignal;

/* JADX INFO: loaded from: classes4.dex */
public final class ContentResolverCompat {
    private ContentResolverCompat() {
    }

    @Deprecated
    public static Cursor query(ContentResolver resolver, Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder, CancellationSignal cancellationSignal) {
        if (cancellationSignal == null) goto L4;
        android.os.CancellationSignal r7 = (android.os.CancellationSignal) cancellationSignal.getCancellationSignalObject();
    L6:
        return query(resolver, uri, projection, selection, selectionArgs, sortOrder, r7);
    L4:
        r7 = null;
        goto L6
    }

    public static Cursor query(ContentResolver resolver, Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder, android.os.CancellationSignal cancellationSignal) {
        return resolver.query(uri, projection, selection, selectionArgs, sortOrder, cancellationSignal);
    L4:
        e = move-exception;
        if ((e instanceof OperationCanceledException) == true) goto L8;
        throw e;
    L8:
        throw new androidx.core.os.OperationCanceledException();
    }
}
