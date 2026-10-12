package kotlin.io.path;

import androidx.autofill.HintConstants;
import java.nio.file.FileSystemException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PathRecursiveFunctions.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011J\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011J\u0012\u0010\u001a\u001a\u00020\u00172\n\u0010\u001b\u001a\u00060\fj\u0002`\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\f\u0012\b\u0012\u00060\fj\u0002`\r0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, d2 = {"Lkotlin/io/path/ExceptionsCollector;", "", "limit", "", "<init>", "(I)V", "value", "totalExceptions", "getTotalExceptions", "()I", "collectedExceptions", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getCollectedExceptions", "()Ljava/util/List;", "path", "Ljava/nio/file/Path;", "getPath", "()Ljava/nio/file/Path;", "setPath", "(Ljava/nio/file/Path;)V", "enterEntry", "", HintConstants.AUTOFILL_HINT_NAME, "exitEntry", "collect", "exception", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class ExceptionsCollector {
    private final List<Exception> collectedExceptions;
    private final int limit;
    private Path path;
    private int totalExceptions;

    public ExceptionsCollector() {
        int r2 = 0;
        this(r2, 1, null);
    }

    public ExceptionsCollector(int limit) {
        this.limit = limit;
        this.collectedExceptions = new ArrayList();
    }

    public /* synthetic */ ExceptionsCollector(int r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 64;
    L5:
        this(r1);
    }

    public final int getTotalExceptions() {
        return this.totalExceptions;
    }

    public final List<Exception> getCollectedExceptions() {
        return this.collectedExceptions;
    }

    public final Path getPath() {
        return this.path;
    }

    public final void setPath(Path r1) {
        this.path = r1;
    }

    public final void enterEntry(Path name) {
        Intrinsics.checkNotNullParameter(name, HintConstants.AUTOFILL_HINT_NAME);
        Path r0 = this.path;
        if (r0 == null) goto L5;
        Path r1 = r0.resolve(name);
    L6:
        this.path = r1;
        return;
    L5:
        r1 = null;
        goto L6
    }

    public final void exitEntry(Path name) {
        Intrinsics.checkNotNullParameter(name, HintConstants.AUTOFILL_HINT_NAME);
        Path r0 = this.path;
        Path r1 = null;
        if (r0 == null) goto L5;
        Path r2 = r0.getFileName();
    L7:
        if (Intrinsics.areEqual(name, r2) == false) goto L14;
        Path r3 = this.path;
        if (r3 == null) goto L11;
        r1 = r3.getParent();
    L11:
        this.path = r1;
        return;
    L14:
        throw new IllegalArgumentException("Failed requirement.".toString());
    L5:
        r2 = null;
        goto L7
    }

    public final void collect(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        boolean shouldCollect = true;
        this.totalExceptions++;
        if (this.collectedExceptions.size() < this.limit) goto L6;
        shouldCollect = false;
    L6:
        if (shouldCollect == true) goto L8;
        return;
    L8:
        if (this.path == null) goto L10;
        Throwable r0 = new FileSystemException(String.valueOf(this.path)).initCause(exception);
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type java.nio.file.FileSystemException");
        FileSystemException restoredException = (FileSystemException) r0;
    L11:
        this.collectedExceptions.add(restoredException);
        return;
    L10:
        restoredException = exception;
        goto L11
    }
}
