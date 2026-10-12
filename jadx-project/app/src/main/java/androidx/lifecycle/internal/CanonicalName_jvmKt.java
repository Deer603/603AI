package androidx.lifecycle.internal;

import kotlin.Metadata;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: CanonicalName.jvm.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\" \u0010\u0000\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"canonicalName", "", "Lkotlin/reflect/KClass;", "getCanonicalName", "(Lkotlin/reflect/KClass;)Ljava/lang/String;", "lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CanonicalName_jvmKt {
    public static final String getCanonicalName(KClass<?> r1) {
        if (r1 != null) goto L6;
        return null;
    L6:
        return r1.getQualifiedName();
    }
}
