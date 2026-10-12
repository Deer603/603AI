package kotlin.coroutines;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001(B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\t\u001a\u0004\u0018\u0001H\n\"\b\b\u0000\u0010\n*\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\fH\u0096\u0002¢\u0006\u0002\u0010\rJ5\u0010\u000e\u001a\u0002H\u000f\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0010\u001a\u0002H\u000f2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u000f0\u0012H\u0016¢\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u00012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0000H\u0002J\u0013\u0010\u001b\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u0016H\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u001dH\u0002J\u0019\u0010\"\u001a\u00020#2\n\u0010$\u001a\u00060%j\u0002`&H\u0002¢\u0006\u0002\u0010'R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lkotlin/coroutines/CombinedContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "left", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$Element;)V", "get", "E", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "minusKey", "size", "", "contains", "", "containsAll", "context", "equals", "other", "", "hashCode", "toString", "", "writeReplace", "readObject", "", "input", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/ReadObjectParameterType;", "(Ljava/io/ObjectInputStream;)V", "Serialized", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CombinedContext implements CoroutineContext, Serializable {
    private final CoroutineContext.Element element;
    private final CoroutineContext left;

    /* JADX INFO: compiled from: CoroutineContextImpl.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000 \r2\u00060\u0001j\u0002`\u0002:\u0001\rB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0002R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lkotlin/coroutines/CombinedContext$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "elements", "", "Lkotlin/coroutines/CoroutineContext;", "<init>", "([Lkotlin/coroutines/CoroutineContext;)V", "getElements", "()[Lkotlin/coroutines/CoroutineContext;", "[Lkotlin/coroutines/CoroutineContext;", "readResolve", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class Serialized implements Serializable {
        public static final Companion Companion = null;
        private static final long serialVersionUID = 0;
        private final CoroutineContext[] elements;

        /* JADX INFO: compiled from: CoroutineContextImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lkotlin/coroutines/CombinedContext$Serialized$Companion;", "", "<init>", "()V", "serialVersionUID", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker r1) {
                this();
            }

            private Companion() {
            }
        }

        static {
            Companion = new Companion(null);
        }

        public Serialized(CoroutineContext[] elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.elements = elements;
        }

        public final CoroutineContext[] getElements() {
            return this.elements;
        }

        private final Object readResolve() {
            CoroutineContext[] r0 = this.elements;
            Object initial$iv = EmptyCoroutineContext.INSTANCE;
            Object accumulator$iv = initial$iv;
            int r4 = r0.length;
            int r5 = 0;
        L3:
            if (r5 >= r4) goto L6;
            CoroutineContext p0 = (CoroutineContext) accumulator$iv;
            accumulator$iv = p0.plus(r0[r5]);
            r5 = r5 + 1;
            goto L3
        L6:
            return accumulator$iv;
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext context) {
        return CoroutineContext.DefaultImpls.plus(this, context);
    }

    public CombinedContext(CoroutineContext left, CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(element, "element");
        this.left = left;
        this.element = element;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> r4) {
        Intrinsics.checkNotNullParameter(r4, "key");
        CombinedContext r0 = this;
    L3:
        E r1 = (E) r0.element.get(r4);
        if (r1 != null) goto L6;
        CoroutineContext r2 = r0.left;
        if ((r2 instanceof CombinedContext) == false) goto L11;
        r0 = (CombinedContext) r2;
        goto L3
    L11:
        return (E) r2.get(r4);
    L6:
        return r1;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r3, Function2<? super R, ? super CoroutineContext.Element, ? extends R> r4) {
        Intrinsics.checkNotNullParameter(r4, "operation");
        return r4.invoke((Object) this.left.fold(r3, r4), this.element);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key<?> r4) {
        Intrinsics.checkNotNullParameter(r4, "key");
        CoroutineContext.Element r0 = this.element.get(r4);
        CoroutineContext r1 = this.left;
        if (r0 != null) goto L5;
        CoroutineContext newLeft = r1.minusKey(r4);
        if (newLeft != this.left) goto L10;
        return this;
    L10:
        if (newLeft != EmptyCoroutineContext.INSTANCE) goto L13;
        return this.element;
    L13:
        return new CombinedContext(newLeft, this.element);
    L5:
        return r1;
    }

    private final int size() {
        CombinedContext cur = this;
        int size = 2;
    L3:
        CoroutineContext r2 = cur.left;
        if ((r2 instanceof CombinedContext) == false) goto L6;
        CombinedContext r3 = (CombinedContext) r2;
    L7:
        if (r3 == null) goto L8;
        cur = r3;
        size = size + 1;
        goto L3
    L8:
        return size;
    L6:
        r3 = null;
        goto L7
    }

    private final boolean contains(CoroutineContext.Element element) {
        return Intrinsics.areEqual(get(element.getKey()), element);
    }

    private final boolean containsAll(CombinedContext context) {
        CombinedContext cur = context;
    L4:
        if (contains(cur.element) == false) goto L5;
        CoroutineContext next = cur.left;
        if ((next instanceof CombinedContext) == false) goto L10;
        cur = (CombinedContext) next;
        goto L4
    L10:
        Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
        return contains((CoroutineContext.Element) next);
    L5:
        return false;
    }

    public boolean equals(Object other) {
        if (this != other) goto L4;
    L11:
        return true;
    L4:
        if ((other instanceof CombinedContext) == true) goto L6;
    L10:
        return false;
    L6:
        if (((CombinedContext) other).size() != size()) goto L10;
        if (((CombinedContext) other).containsAll(this) == false) goto L10;
        goto L10
    }

    public int hashCode() {
        return this.left.hashCode() + this.element.hashCode();
    }

    public String toString() {
        return '[' + ((String) fold("", new CombinedContext$$ExternalSyntheticLambda1())) + ']';
    }

    static final String toString$lambda$2(String acc, CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(acc, "acc");
        Intrinsics.checkNotNullParameter(element, "element");
        if (acc.length() != 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L9;
        return element.toString();
    L9:
        return acc + ", " + element;
    L5:
        r0 = false;
        goto L6
    }

    private final Object writeReplace() {
        int n = size();
        final CoroutineContext[] elements = new CoroutineContext[n];
        final Ref.IntRef index = new Ref.IntRef();
        fold(Unit.INSTANCE, new CombinedContext$$ExternalSyntheticLambda0(elements, index));
        if (index.element != n) goto L5;
        boolean r3 = true;
    L6:
        if (r3 == false) goto L10;
        return new Serialized(elements);
    L10:
        throw new IllegalStateException("Check failed.");
    L5:
        r3 = false;
        goto L6
    }

    static final Unit writeReplace$lambda$3(CoroutineContext[] $elements, Ref.IntRef $index, Unit r3, CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(r3, "<unused var>");
        Intrinsics.checkNotNullParameter(element, "element");
        int r4 = $index.element;
        $index.element = r4 + 1;
        $elements[r4] = element;
        return Unit.INSTANCE;
    }

    private final void readObject(ObjectInputStream input) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }
}
