package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;

/* JADX INFO: loaded from: classes4.dex */
public class FunctionReference extends CallableReference implements FunctionBase, KFunction {
    private final int arity;
    private final int flags;

    @Override // kotlin.jvm.internal.CallableReference
    protected /* bridge */ /* synthetic */ KCallable getReflected() {
        return getReflected();
    }

    public FunctionReference(int arity) {
        this(arity, NO_RECEIVER, null, null, null, 0);
    }

    public FunctionReference(int arity, Object receiver) {
        this(arity, receiver, null, null, null, 0);
    }

    public FunctionReference(int arity, Object receiver, Class owner, String name, String signature, int flags) {
        boolean r1 = true;
        if ((flags & 1) == 1) goto L6;
        r1 = false;
    L6:
        super(receiver, owner, name, signature, r1);
        this.arity = arity;
        this.flags = flags >> 1;
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected KFunction getReflected() {
        return (KFunction) super.getReflected();
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected KCallable computeReflected() {
        return Reflection.function(this);
    }

    @Override // kotlin.reflect.KFunction
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // kotlin.reflect.KFunction
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // kotlin.reflect.KFunction
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.reflect.KFunction
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public boolean equals(Object obj) {
        if (obj != this) goto L6;
        return true;
    L6:
        if ((obj instanceof FunctionReference) == false) goto L23;
        FunctionReference other = (FunctionReference) obj;
        if (getName().equals(other.getName()) == false) goto L21;
        if (getSignature().equals(other.getSignature()) == false) goto L21;
        if (this.flags != other.flags) goto L21;
        if (this.arity != other.arity) goto L21;
        if (Intrinsics.areEqual(getBoundReceiver(), other.getBoundReceiver()) == false) goto L21;
        if (Intrinsics.areEqual(getOwner(), other.getOwner()) == false) goto L21;
        return true;
    L21:
        return false;
    L23:
        if ((obj instanceof KFunction) == true) goto L25;
        return false;
    L25:
        return obj.equals(compute());
    }

    public int hashCode() {
        if (getOwner() != null) goto L5;
        int r0 = 0;
    L7:
        return ((r0 + getName().hashCode()) * 31) + getSignature().hashCode();
    L5:
        r0 = getOwner().hashCode() * 31;
        goto L7
    }

    public String toString() {
        KCallable reflected = compute();
        if (reflected == this) goto L7;
        return reflected.toString();
    L7:
        if ("<init>".equals(getName()) == false) goto L10;
        return "constructor (Kotlin reflection is not available)";
    L10:
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
