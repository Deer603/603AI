package org.chromium.support_lib_boundary;

import java.io.OutputStream;
import java.util.Collection;
import java.util.concurrent.Executor;
import org.jspecify.annotations.NullMarked;

/* JADX INFO: loaded from: classes4.dex */
@NullMarked
public interface TracingControllerBoundaryInterface {
    boolean isTracing();

    void start(int r1, Collection<String> r2, int r3) throws IllegalStateException, IllegalArgumentException;

    boolean stop(OutputStream r1, Executor r2);
}
