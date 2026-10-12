package androidx.core.view.inputmethod;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes4.dex */
public final class InputConnectionCompat {
    private static final String COMMIT_CONTENT_ACTION = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    private static final String COMMIT_CONTENT_CONTENT_URI_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    private static final String COMMIT_CONTENT_CONTENT_URI_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    private static final String COMMIT_CONTENT_DESCRIPTION_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    private static final String COMMIT_CONTENT_DESCRIPTION_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    private static final String COMMIT_CONTENT_FLAGS_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    private static final String COMMIT_CONTENT_FLAGS_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    private static final String COMMIT_CONTENT_INTEROP_ACTION = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    private static final String COMMIT_CONTENT_LINK_URI_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    private static final String COMMIT_CONTENT_LINK_URI_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    private static final String COMMIT_CONTENT_OPTS_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    private static final String COMMIT_CONTENT_OPTS_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    private static final String COMMIT_CONTENT_RESULT_INTEROP_RECEIVER_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    private static final String COMMIT_CONTENT_RESULT_RECEIVER_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    private static final String EXTRA_INPUT_CONTENT_INFO = "androidx.core.view.extra.INPUT_CONTENT_INFO";
    public static final int INPUT_CONTENT_GRANT_READ_URI_PERMISSION = 1;
    private static final String LOG_TAG = "InputConnectionCompat";

    /* JADX INFO: renamed from: androidx.core.view.inputmethod.InputConnectionCompat$2, reason: invalid class name */
    class AnonymousClass2 extends InputConnectionWrapper {
        final /* synthetic */ OnCommitContentListener val$listener;

        AnonymousClass2(InputConnection target, boolean mutable, OnCommitContentListener r3) {
            this.val$listener = r3;
            super(target, mutable);
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String action, Bundle data) {
            if (InputConnectionCompat.handlePerformPrivateCommand(action, data, this.val$listener) == false) goto L7;
            return true;
        L7:
            return super.performPrivateCommand(action, data);
        }
    }

    static class Api25Impl {
        private Api25Impl() {
        }

        static boolean commitContent(InputConnection inputConnection, InputContentInfo inputContentInfo, int i, Bundle bundle) {
            return inputConnection.commitContent(inputContentInfo, i, bundle);
        }
    }

    public interface OnCommitContentListener {
        boolean onCommitContent(InputContentInfoCompat r1, int r2, Bundle r3);
    }

    static boolean handlePerformPrivateCommand(String action, Bundle data, OnCommitContentListener onCommitContentListener) {
        int r0 = 0;
        if (data != null) goto L6;
        return false;
    L6:
        if (TextUtils.equals(COMMIT_CONTENT_ACTION, action) == false) goto L9;
        boolean interop = false;
    L11:
        ResultReceiver resultReceiver = null;
        boolean result = false;
        if (interop == false) goto L14;
        String r5 = COMMIT_CONTENT_RESULT_INTEROP_RECEIVER_KEY;
    L50:
        resultReceiver = (ResultReceiver) data.getParcelable(r5);     // Catch: Throwable -> L45
        if (interop == false) goto L18;
        String r6 = COMMIT_CONTENT_CONTENT_URI_INTEROP_KEY;
    L19:
        Uri contentUri = (Uri) data.getParcelable(r6);     // Catch: Throwable -> L45
        if (interop == false) goto L22;
        String r7 = COMMIT_CONTENT_DESCRIPTION_INTEROP_KEY;
    L23:
        ClipDescription description = (ClipDescription) data.getParcelable(r7);     // Catch: Throwable -> L45
        if (interop == false) goto L26;
        String r8 = COMMIT_CONTENT_LINK_URI_INTEROP_KEY;
    L27:
        Uri linkUri = (Uri) data.getParcelable(r8);     // Catch: Throwable -> L45
        if (interop == false) goto L30;
        String r9 = COMMIT_CONTENT_FLAGS_INTEROP_KEY;
    L31:
        int flags = data.getInt(r9);     // Catch: Throwable -> L45
        if (interop == false) goto L34;
        String r10 = COMMIT_CONTENT_OPTS_INTEROP_KEY;
    L35:
        Bundle opts = (Bundle) data.getParcelable(r10);     // Catch: Throwable -> L45
        if (contentUri == null) goto L40;
        if (description == null) goto L40;
        InputContentInfoCompat inputContentInfo = new InputContentInfoCompat(contentUri, description, linkUri);     // Catch: Throwable -> L45
        result = onCommitContentListener.onCommitContent(inputContentInfo, flags, opts);     // Catch: Throwable -> L45
    L40:
        if (resultReceiver == null) goto L44;
        if (result == false) goto L43;
        r0 = 1;
    L43:
        resultReceiver.send(r0, null);
    L44:
        return result;
    L34:
        r10 = COMMIT_CONTENT_OPTS_KEY;
        goto L35
    L30:
        r9 = COMMIT_CONTENT_FLAGS_KEY;
        goto L31
    L26:
        r8 = COMMIT_CONTENT_LINK_URI_KEY;
        goto L27
    L22:
        r7 = COMMIT_CONTENT_DESCRIPTION_KEY;
        goto L23
    L18:
        r6 = COMMIT_CONTENT_CONTENT_URI_KEY;
    L45:
        th = move-exception;
        if (resultReceiver == null) goto L48;
        resultReceiver.send(0, null);
    L48:
        throw th;
    L14:
        r5 = COMMIT_CONTENT_RESULT_RECEIVER_KEY;
        goto L50
    L9:
        if (TextUtils.equals(COMMIT_CONTENT_INTEROP_ACTION, action) == false) goto L49;
        interop = true;
        goto L11
    L49:
        return false;
    }

    public static boolean commitContent(InputConnection inputConnection, EditorInfo editorInfo, InputContentInfoCompat inputContentInfo, int flags, Bundle opts) {
        return Api25Impl.commitContent(inputConnection, (InputContentInfo) inputContentInfo.unwrap(), flags, opts);
    }

    @Deprecated
    public static InputConnection createWrapper(final InputConnection inputConnection, EditorInfo editorInfo, final OnCommitContentListener onCommitContentListener) {
        ObjectsCompat.requireNonNull(inputConnection, "inputConnection must be non-null");
        ObjectsCompat.requireNonNull(editorInfo, "editorInfo must be non-null");
        ObjectsCompat.requireNonNull(onCommitContentListener, "onCommitContentListener must be non-null");
        final boolean r2 = false;
        return new AnonymousClass1(inputConnection, r2, onCommitContentListener);
    }

    public static InputConnection createWrapper(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        OnCommitContentListener onCommitContentListener = createOnCommitContentListenerUsingPerformReceiveContent(view);
        return createWrapper(inputConnection, editorInfo, onCommitContentListener);
    }

    private static OnCommitContentListener createOnCommitContentListenerUsingPerformReceiveContent(final View view) {
        Preconditions.checkNotNull(view);
        return new InputConnectionCompat$$ExternalSyntheticLambda0(view);
    }

    static /* synthetic */ boolean lambda$createOnCommitContentListenerUsingPerformReceiveContent$0(View view, InputContentInfoCompat inputContentInfo, int flags, Bundle opts) {
        Bundle extras = opts;
        if ((flags & 1) != 0) goto L17;
    L13:
        ClipData clip = new ClipData(inputContentInfo.getDescription(), new ClipData.Item(inputContentInfo.getContentUri()));
        ContentInfoCompat payload = new ContentInfoCompat.Builder(clip, 2).setLinkUri(inputContentInfo.getLinkUri()).setExtras(extras).build();
        if (ViewCompat.performReceiveContent(view, payload) != null) goto L19;
        return true;
    L19:
        return false;
    L17:
        inputContentInfo.requestPermission();     // Catch: Exception -> L10
        Parcelable inputContentInfoFmk = (Parcelable) inputContentInfo.unwrap();
        if (opts != null) goto L8;
        Bundle r3 = new Bundle();
    L9:
        extras = r3;
        extras.putParcelable(EXTRA_INPUT_CONTENT_INFO, inputContentInfoFmk);
        goto L13
    L8:
        r3 = new Bundle(opts);
    L10:
        e = move-exception;
        Log.w(LOG_TAG, "Can't insert content from IME; requestPermission() failed", e);
        return false;
    }

    @Deprecated
    public InputConnectionCompat() {
    }
}
