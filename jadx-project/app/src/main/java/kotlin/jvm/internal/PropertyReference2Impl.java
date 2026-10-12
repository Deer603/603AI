package kotlin.jvm.internal;

import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

/* JADX INFO: loaded from: classes4.dex */
public class PropertyReference2Impl extends PropertyReference2 {
    public PropertyReference2Impl(KDeclarationContainer r3, String r4, String r5) {
        super(((ClassBasedDeclarationContainer) r3).getJClass(), r4, r5, !(r3 instanceof KClass) ? 1 : 0);
    }

    public PropertyReference2Impl(Class owner, String name, String signature, int flags) {
        super(owner, name, signature, flags);
    }

    @Override // kotlin.reflect.KProperty2
    public Object get(Object receiver1, Object receiver2) {
        return getGetter().call(new Object[]{receiver1, receiver2});
    }
}
