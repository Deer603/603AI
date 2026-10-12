package org.chromium.support_lib_boundary;

import java.util.concurrent.Callable;
import org.jspecify.annotations.NullMarked;

/* JADX INFO: loaded from: classes4.dex */
@NullMarked
public interface IsomorphicObjectBoundaryInterface {
    Object getOrCreatePeer(Callable<Object> r1);
}
