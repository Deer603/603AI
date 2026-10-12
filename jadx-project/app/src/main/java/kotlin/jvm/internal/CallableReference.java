package kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.KCallable;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KParameter;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVisibility;

/* JADX INFO: loaded from: classes4.dex */
public abstract class CallableReference implements KCallable, Serializable {
    public static final Object NO_RECEIVER = null;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient KCallable reflected;
    private final String signature;

    private static class NoReceiver implements Serializable {
        private static final NoReceiver INSTANCE = null;

        private NoReceiver() {
        }

        static /* synthetic */ NoReceiver access$000() {
            return INSTANCE;
        }

        static {
            INSTANCE = new NoReceiver();
        }

        private Object readResolve() throws ObjectStreamException {
            return INSTANCE;
        }
    }

    protected abstract KCallable computeReflected();

    static {
        NO_RECEIVER = NoReceiver.access$000();
    }

    public CallableReference() {
        this(NO_RECEIVER);
    }

    protected CallableReference(Object receiver) {
        this(receiver, null, null, null, false);
    }

    protected CallableReference(Object receiver, Class owner, String name, String signature, boolean isTopLevel) {
        this.receiver = receiver;
        this.owner = owner;
        this.name = name;
        this.signature = signature;
        this.isTopLevel = isTopLevel;
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public KCallable compute() {
        KCallable result = this.reflected;
        if (result != null) goto L6;
        KCallable result2 = computeReflected();
        this.reflected = result2;
        return result2;
    L6:
        return result;
    }

    protected KCallable getReflected() {
        KCallable result = compute();
        if (result == this) goto L6;
        return result;
    L6:
        throw new KotlinReflectionNotSupportedError();
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

    @Override // kotlin.reflect.KCallable
    public String getName() {
        return this.name;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // kotlin.reflect.KCallable
    public List<KParameter> getParameters() {
        return getReflected().getParameters();
    }

    @Override // kotlin.reflect.KCallable
    public KType getReturnType() {
        return getReflected().getReturnType();
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    @Override // kotlin.reflect.KCallable
    public List<KTypeParameter> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // kotlin.reflect.KCallable
    public Object call(Object... args) {
        return getReflected().call(args);
    }

    @Override // kotlin.reflect.KCallable
    public Object callBy(Map args) {
        return getReflected().callBy(args);
    }

    @Override // kotlin.reflect.KCallable
    public KVisibility getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // kotlin.reflect.KCallable
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // kotlin.reflect.KCallable
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // kotlin.reflect.KCallable
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // kotlin.reflect.KCallable
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
