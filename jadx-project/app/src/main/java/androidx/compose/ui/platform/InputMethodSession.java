package androidx.compose.ui.platform;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.WeakReference;
import androidx.compose.ui.text.input.NullableInputConnectionWrapper;
import androidx.compose.ui.text.input.NullableInputConnectionWrapper_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: AndroidPlatformTextInputSession.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0006R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/platform/InputMethodSession;", "", "request", "Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;", "onAllConnectionsClosed", "Lkotlin/Function0;", "", "(Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;Lkotlin/jvm/functions/Function0;)V", "connections", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/node/WeakReference;", "Landroidx/compose/ui/text/input/NullableInputConnectionWrapper;", "disposed", "", "isActive", "()Z", "lock", "createInputConnection", "Landroid/view/inputmethod/InputConnection;", "outAttrs", "Landroid/view/inputmethod/EditorInfo;", "dispose", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class InputMethodSession {
    private MutableVector<WeakReference<NullableInputConnectionWrapper>> connections;
    private boolean disposed;
    private final Object lock;
    private final Function0<Unit> onAllConnectionsClosed;
    private final PlatformTextInputMethodRequest request;

    public InputMethodSession(PlatformTextInputMethodRequest request, Function0<Unit> r8) {
        this.request = request;
        this.onAllConnectionsClosed = r8;
        this.lock = new Object();
        this.connections = new MutableVector(new WeakReference[16], 0);
    }

    public static final /* synthetic */ MutableVector access$getConnections$p(InputMethodSession $this) {
        return $this.connections;
    }

    public static final /* synthetic */ Function0 access$getOnAllConnectionsClosed$p(InputMethodSession $this) {
        return $this.onAllConnectionsClosed;
    }

    public final boolean isActive() {
        return !this.disposed;
    }

    public final InputConnection createInputConnection(EditorInfo outAttrs) {
        Object lock$iv = this.lock;
        monitor-enter(lock$iv);
    L13:
        th = move-exception;
        throw th;
    L6:
        if (this.disposed == false) goto L10;
        monitor-exit(lock$iv);
        return null;
    L10:
        InputConnection connectionDelegate = this.request.createInputConnection(outAttrs);     // Catch: Throwable -> L13
        NullableInputConnectionWrapper it = NullableInputConnectionWrapper_androidKt.NullableInputConnectionWrapper(connectionDelegate, new InputMethodSession$createInputConnection$1$1(this));     // Catch: Throwable -> L13
        this.connections.add(new WeakReference(it));     // Catch: Throwable -> L13
        NullableInputConnectionWrapper r4 = it;     // Catch: Throwable -> L13
        monitor-exit(lock$iv);
        return r4;
    }

    public final void dispose() {
        Object lock$iv = this.lock;
        monitor-enter(lock$iv);
        this.disposed = true;     // Catch: Throwable -> L14
        MutableVector<WeakReference<NullableInputConnectionWrapper>> r3 = this.connections;     // Catch: Throwable -> L14
        int i$iv = 0;
        Object[] content$iv = r3.content;     // Catch: Throwable -> L14
        int size$iv = r3.getSize();     // Catch: Throwable -> L14
    L6:
        if (i$iv >= size$iv) goto L11;
        NullableInputConnectionWrapper r10 = (NullableInputConnectionWrapper) ((WeakReference) content$iv[i$iv]).get();     // Catch: Throwable -> L14
        if (r10 == null) goto L10;
        r10.disposeDelegate();     // Catch: Throwable -> L14
    L10:
        i$iv = i$iv + 1;     // Catch: Throwable -> L14
        goto L6
    L11:
        this.connections.clear();     // Catch: Throwable -> L14
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L14
        monitor-exit(lock$iv);
        return;
    L14:
        th = move-exception;
        throw th;
    }
}
