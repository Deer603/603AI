package androidx.concurrent.futures;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final enum DirectExecutor extends Enum<DirectExecutor> implements Executor {
    private static final /* synthetic */ DirectExecutor[] $VALUES = null;
    public static final DirectExecutor INSTANCE = null;

    public static DirectExecutor valueOf(String name) {
        return (DirectExecutor) Enum.valueOf(DirectExecutor.class, name);
    }

    public static DirectExecutor[] values() {
        return (DirectExecutor[]) $VALUES.clone();
    }

    private DirectExecutor(String r1, int r2) {
        super(r1, r2);
    }

    static {
        INSTANCE = new DirectExecutor("INSTANCE", 0);
        $VALUES = new DirectExecutor[]{INSTANCE};
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        command.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
