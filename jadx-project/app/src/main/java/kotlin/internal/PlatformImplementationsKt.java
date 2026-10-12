package kotlin.internal;

import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.internal.jdk8.JDK8PlatformImplementations;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PlatformImplementations.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\"\u0010\u0002\u001a\u0002H\u0003\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0083\b¢\u0006\u0002\u0010\u0006\u001a \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0001\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"IMPLEMENTATIONS", "Lkotlin/internal/PlatformImplementations;", "castToBaseType", "T", "", "instance", "(Ljava/lang/Object;)Ljava/lang/Object;", "apiVersionIsAtLeast", "", "major", "", "minor", "patch", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class PlatformImplementationsKt {
    public static final PlatformImplementations IMPLEMENTATIONS = null;

    static {
        JDK8PlatformImplementations r0 = new JDK8PlatformImplementations();
        IMPLEMENTATIONS = r0;
        return;
    L6:
        e = move-exception;
        ClassLoader r1 = r0.getClass().getClassLoader();
        ClassLoader r2 = PlatformImplementations.class.getClassLoader();
        if (Intrinsics.areEqual(r1, r2) == false) goto L10;
        throw e;
    L10:
        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + r1 + ", base type classloader: " + r2, e);
    }

    private static final /* synthetic */ <T> T castToBaseType(Object r6) {
        Intrinsics.reifiedOperationMarker(1, "T");     // Catch: ClassCastException -> L5
        return (T) r6;
    L5:
        e = move-exception;
        ClassLoader r2 = r6.getClass().getClassLoader();
        Intrinsics.reifiedOperationMarker(4, "T");
        ClassLoader r0 = Object.class.getClassLoader();
        if (Intrinsics.areEqual(r2, r0) == false) goto L9;
        throw e;
    L9:
        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + r2 + ", base type classloader: " + r0, e);
    }

    public static final boolean apiVersionIsAtLeast(int major, int minor, int patch) {
        return KotlinVersion.CURRENT.isAtLeast(major, minor, patch);
    }
}
