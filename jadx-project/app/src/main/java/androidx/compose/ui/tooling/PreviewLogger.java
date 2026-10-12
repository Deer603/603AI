package androidx.compose.ui.tooling;

import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: PreviewLogger.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/tooling/PreviewLogger;", "", "()V", "Companion", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PreviewLogger {
    public static final int $stable = 0;
    public static final Companion Companion = null;

    /* JADX INFO: compiled from: PreviewLogger.android.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0002\b\tJ!\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0002\b\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/tooling/PreviewLogger$Companion;", "", "()V", "logError", "", "message", "", "throwable", "", "logError$ui_tooling_release", "logWarning", "logWarning$ui_tooling_release", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ void logWarning$ui_tooling_release$default(Companion r0, String r1, Throwable r2, int r3, Object r4) {
            if ((r3 & 2) == 0) goto L5;
            r2 = null;
        L5:
            r0.logWarning$ui_tooling_release(r1, r2);
        }

        public final void logWarning$ui_tooling_release(String message, Throwable throwable) {
            Log.w("PreviewLogger", message, throwable);
        }

        public static /* synthetic */ void logError$ui_tooling_release$default(Companion r0, String r1, Throwable r2, int r3, Object r4) {
            if ((r3 & 2) == 0) goto L5;
            r2 = null;
        L5:
            r0.logError$ui_tooling_release(r1, r2);
        }

        public final void logError$ui_tooling_release(String message, Throwable throwable) {
            Log.e("PreviewLogger", message, throwable);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public PreviewLogger() {
    }
}
