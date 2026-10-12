package org.chromium.support_lib_boundary;

import java.util.concurrent.Executor;
import org.jspecify.annotations.NullMarked;

/* JADX INFO: loaded from: classes4.dex */
@NullMarked
public interface ProxyControllerBoundaryInterface {
    void clearProxyOverride(Runnable r1, Executor r2);

    void setProxyOverride(String[][] r1, String[] r2, Runnable r3, Executor r4);

    void setProxyOverride(String[][] r1, String[] r2, Runnable r3, Executor r4, boolean r5);
}
