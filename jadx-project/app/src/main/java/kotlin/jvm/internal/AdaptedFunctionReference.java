package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.reflect.KDeclarationContainer;

/* JADX INFO: loaded from: classes4.dex */
public class AdaptedFunctionReference implements FunctionBase, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public AdaptedFunctionReference(int arity, Class owner, String name, String signature, int flags) {
        this(arity, CallableReference.NO_RECEIVER, owner, name, signature, flags);
    }

    public AdaptedFunctionReference(int arity, Object receiver, Class owner, String name, String signature, int flags) {
        this.receiver = receiver;
        this.owner = owner;
        this.name = name;
        this.signature = signature;
        boolean r1 = true;
        if ((flags & 1) == 1) goto L6;
        r1 = false;
    L6:
        this.isTopLevel = r1;
        this.arity = arity;
        this.flags = flags >> 1;
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.arity;
    }

    public KDeclarationContainer getOwner() {
        if (this.owner != null) goto L5;
        return null;
    L5:
        boolean r0 = this.isTopLevel;
        Class r1 = this.owner;
        if (r0 == false) goto L9;
        return Reflection.getOrCreateKotlinPackage(r1);
    L9:
        return Reflection.getOrCreateKotlinClass(r1);
    }

    public boolean equals(Object o) {
        if (this != o) goto L6;
        return true;
    L6:
        if ((o instanceof AdaptedFunctionReference) == true) goto L8;
        return false;
    L8:
        AdaptedFunctionReference other = (AdaptedFunctionReference) o;
        if (this.isTopLevel != other.isTopLevel) goto L24;
        if (this.arity != other.arity) goto L24;
        if (this.flags != other.flags) goto L24;
        if (Intrinsics.areEqual(this.receiver, other.receiver) == false) goto L24;
        if (Intrinsics.areEqual(this.owner, other.owner) == false) goto L24;
        if (this.name.equals(other.name) == false) goto L24;
        if (this.signature.equals(other.signature) == false) goto L24;
        return true;
    L24:
        return false;
    }

    public int hashCode() {
        int r1 = 0;
        if (this.receiver == null) goto L5;
        int result = this.receiver.hashCode();
    L6:
        int r2 = result * 31;
        if (this.owner == null) goto L9;
        r1 = this.owner.hashCode();
    L9:
        int result2 = r2 + r1;
        int result3 = ((((result2 * 31) + this.name.hashCode()) * 31) + this.signature.hashCode()) * 31;
        if (this.isTopLevel == false) goto L12;
        int r3 = 1231;
    L14:
        return ((((result3 + r3) * 31) + this.arity) * 31) + this.flags;
    L12:
        r3 = 1237;
        goto L14
    L5:
        result = 0;
        goto L6
    }

    public String toString() {
        return Reflection.renderLambdaToString(this);
    }
}
