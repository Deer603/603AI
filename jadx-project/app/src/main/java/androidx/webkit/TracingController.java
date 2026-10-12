package androidx.webkit;

import androidx.webkit.internal.TracingControllerImpl;
import java.io.OutputStream;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TracingController {

    private static class LAZY_HOLDER {
        static final TracingController INSTANCE = null;

        private LAZY_HOLDER() {
        }

        static {
            INSTANCE = new TracingControllerImpl();
        }
    }

    public abstract boolean isTracing();

    public abstract void start(TracingConfig r1);

    public abstract boolean stop(OutputStream r1, Executor r2);

    public TracingController() {
    }

    public static TracingController getInstance() {
        return LAZY_HOLDER.INSTANCE;
    }
}
