package org.chromium.support_lib_boundary;

import android.os.Handler;
import java.lang.reflect.InvocationHandler;
import org.jspecify.annotations.NullMarked;

/* JADX INFO: loaded from: classes4.dex */
@NullMarked
public interface WebMessagePortBoundaryInterface {
    void close();

    void postMessage(InvocationHandler r1);

    void setWebMessageCallback(InvocationHandler r1);

    void setWebMessageCallback(InvocationHandler r1, Handler r2);
}
