package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;

/* JADX INFO: loaded from: classes4.dex */
public class FunInterfaceConstructorReference extends FunctionReference implements Serializable {
    private final Class funInterface;

    @Override // kotlin.jvm.internal.FunctionReference, kotlin.jvm.internal.CallableReference
    protected /* bridge */ /* synthetic */ KCallable getReflected() {
        return getReflected();
    }

    public FunInterfaceConstructorReference(Class funInterface) {
        super(1);
        this.funInterface = funInterface;
    }

    @Override // kotlin.jvm.internal.FunctionReference
    public boolean equals(Object o) {
        if (this != o) goto L6;
        return true;
    L6:
        if ((o instanceof FunInterfaceConstructorReference) == true) goto L9;
        return false;
    L9:
        FunInterfaceConstructorReference other = (FunInterfaceConstructorReference) o;
        return this.funInterface.equals(other.funInterface);
    }

    @Override // kotlin.jvm.internal.FunctionReference
    public int hashCode() {
        return this.funInterface.hashCode();
    }

    @Override // kotlin.jvm.internal.FunctionReference
    public String toString() {
        return "fun interface " + this.funInterface.getName();
    }

    @Override // kotlin.jvm.internal.FunctionReference, kotlin.jvm.internal.CallableReference
    protected KFunction getReflected() {
        throw new UnsupportedOperationException("Functional interface constructor does not support reflection");
    }
}
