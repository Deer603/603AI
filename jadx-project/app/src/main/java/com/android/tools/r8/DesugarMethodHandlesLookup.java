package com.android.tools.r8;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DesugarMethodHandlesLookup {
    public /* synthetic */ DesugarMethodHandlesLookup() {
    }

    public /* synthetic */ DesugarVarHandle findVarHandle(Class r1, String r2, Class r3) {
        return new DesugarVarHandle(r1, r2, r3);
    }

    public /* synthetic */ DesugarMethodHandlesLookup toPrivateLookupIn(Class r1) {
        return this;
    }
}
