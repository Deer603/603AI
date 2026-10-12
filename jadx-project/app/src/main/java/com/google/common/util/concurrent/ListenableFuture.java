package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
public interface ListenableFuture<V> extends Future<V> {
    void addListener(Runnable r1, Executor r2);
}
