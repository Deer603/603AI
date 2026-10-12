package kotlinx.coroutines.debug;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.debug.internal.AgentInstallationType;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;
import sun.misc.Signal;

/* JADX INFO: compiled from: AgentPremain.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/debug/AgentPremain;", "", "()V", "enableCreationStackTraces", "", "installSignalHandler", "", "premain", "args", "", "instrumentation", "Ljava/lang/instrument/Instrumentation;", "DebugProbesTransformer", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AgentPremain {
    public static final AgentPremain INSTANCE = null;
    private static final boolean enableCreationStackTraces = false;

    /* JADX INFO: compiled from: AgentPremain.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/debug/AgentPremain$DebugProbesTransformer;", "Ljava/lang/instrument/ClassFileTransformer;", "()V", "transform", "", "loader", "Ljava/lang/ClassLoader;", "className", "", "classBeingRedefined", "Ljava/lang/Class;", "protectionDomain", "Ljava/security/ProtectionDomain;", "classfileBuffer", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DebugProbesTransformer implements ClassFileTransformer {
        public static final DebugProbesTransformer INSTANCE = null;

        static {
            INSTANCE = new DebugProbesTransformer();
        }

        private DebugProbesTransformer() {
        }

        public byte[] transform(ClassLoader loader, String className, Class<?> r5, ProtectionDomain protectionDomain, byte[] classfileBuffer) {
            if (loader != null) goto L4;
            return null;
        L4:
            if (Intrinsics.areEqual(className, "kotlin/coroutines/jvm/internal/DebugProbesKt") == false) goto L10;
            AgentInstallationType.INSTANCE.setInstalledStatically$kotlinx_coroutines_core(true);
            return ByteStreamsKt.readBytes(loader.getResourceAsStream("DebugProbesKt.bin"));
        L10:
            return null;
        }
    }

    private AgentPremain() {
    }

    static {
        INSTANCE = new AgentPremain();
        AgentPremain r0 = INSTANCE;
        Object r1 = null;
        Result.Companion r2 = Result.Companion;     // Catch: Throwable -> L9
        String r3 = System.getProperty("kotlinx.coroutines.debug.enable.creation.stack.trace");     // Catch: Throwable -> L9
        if (r3 == null) goto L6;
        Boolean r4 = Boolean.valueOf(Boolean.parseBoolean(r3));     // Catch: Throwable -> L9
    L7:
        Object r5 = Result.m7425constructorimpl(r4);     // Catch: Throwable -> L9
    L12:
        if (Result.m7431isFailureimpl(r5) == true) goto L15;
        r1 = r5;
    L15:
        Boolean r6 = (Boolean) r1;
        if (r6 == null) goto L18;
        boolean r7 = r6.booleanValue();
    L19:
        enableCreationStackTraces = r7;
        return;
    L18:
        r7 = DebugProbesImpl.INSTANCE.getEnableCreationStackTraces$kotlinx_coroutines_core();
        goto L19
    L6:
        r4 = null;
    L9:
        th = move-exception;
        Result.Companion r8 = Result.Companion;
        r5 = Result.m7425constructorimpl(ResultKt.createFailure(th));
        goto L12
    }

    @JvmStatic
    public static final void premain(String args, Instrumentation instrumentation) {
        AgentInstallationType.INSTANCE.setInstalledStatically$kotlinx_coroutines_core(true);
        instrumentation.addTransformer(DebugProbesTransformer.INSTANCE);
        DebugProbesImpl.INSTANCE.setEnableCreationStackTraces$kotlinx_coroutines_core(enableCreationStackTraces);
        DebugProbesImpl.INSTANCE.install$kotlinx_coroutines_core();
        INSTANCE.installSignalHandler();
    }

    private final void installSignalHandler() {
        Signal.handle(new Signal("TRAP"), new AgentPremain$$ExternalSyntheticLambda0());     // Catch: Throwable -> L4
        return;
    }

    static final void installSignalHandler$lambda$1(Signal it) {
        if (DebugProbesImpl.INSTANCE.isInstalled$kotlinx_coroutines_debug() == false) goto L5;
        DebugProbesImpl.INSTANCE.dumpCoroutines(System.out);
        return;
    L5:
        System.out.println("Cannot perform coroutines dump, debug probes are disabled");
    }
}
