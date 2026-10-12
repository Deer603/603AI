package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PropertyReference extends CallableReference implements KProperty {
    private final boolean syntheticJavaProperty;

    @Override // kotlin.jvm.internal.CallableReference
    protected /* bridge */ /* synthetic */ KCallable getReflected() {
        return getReflected();
    }

    public PropertyReference() {
        this.syntheticJavaProperty = false;
    }

    public PropertyReference(Object receiver) {
        super(receiver);
        this.syntheticJavaProperty = false;
    }

    public PropertyReference(Object receiver, Class owner, String name, String signature, int flags) {
        boolean r1 = false;
        if ((flags & 1) != 1) goto L5;
        boolean r8 = true;
    L6:
        super(receiver, owner, name, signature, r8);
        if ((flags & 2) != 2) goto L9;
        r1 = true;
    L9:
        this.syntheticJavaProperty = r1;
        return;
    L5:
        r8 = false;
        goto L6
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected KProperty getReflected() {
        if (this.syntheticJavaProperty == true) goto L7;
        return (KProperty) super.getReflected();
    L7:
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KCallable compute() {
        if (this.syntheticJavaProperty == false) goto L6;
        return this;
    L6:
        return super.compute();
    }

    @Override // kotlin.reflect.KProperty
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    @Override // kotlin.reflect.KProperty
    public boolean isConst() {
        return getReflected().isConst();
    }

    public boolean equals(Object obj) {
        if (obj != this) goto L6;
        return true;
    L6:
        if ((obj instanceof PropertyReference) == false) goto L19;
        PropertyReference other = (PropertyReference) obj;
        if (getOwner().equals(other.getOwner()) == false) goto L17;
        if (getName().equals(other.getName()) == false) goto L17;
        if (getSignature().equals(other.getSignature()) == false) goto L17;
        if (Intrinsics.areEqual(getBoundReceiver(), other.getBoundReceiver()) == false) goto L17;
        return true;
    L17:
        return false;
    L19:
        if ((obj instanceof KProperty) == true) goto L21;
        return false;
    L21:
        return obj.equals(compute());
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        KCallable reflected = compute();
        if (reflected == this) goto L7;
        return reflected.toString();
    L7:
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
