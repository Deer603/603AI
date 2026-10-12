package org.chromium.support_lib_boundary;

import java.util.concurrent.Executor;
import org.jspecify.annotations.NullMarked;

/* JADX INFO: loaded from: classes4.dex */
@NullMarked
public interface WebStorageBoundaryInterface {
    void deleteBrowsingData(Executor r1, Runnable r2);

    String deleteBrowsingDataForSite(String r1, Executor r2, Runnable r3);
}
