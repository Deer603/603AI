package androidx.core.util;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public interface Predicate<T> {
    boolean test(T r1);

    default Predicate<T> and(final Predicate<? super T> other) {
        Objects.requireNonNull(other);
        return new Predicate$$ExternalSyntheticLambda3(this, other);
    }

    static /* synthetic */ boolean lambda$and$0(Predicate _this, Predicate other, Object t) {
        if (_this.test(t) == true) goto L5;
    L7:
        return false;
    L5:
        if (other.test(t) == false) goto L7;
        return true;
    }

    static /* synthetic */ boolean lambda$negate$1(Predicate _this, Object t) {
        return !_this.test(t);
    }

    default Predicate<T> negate() {
        return new Predicate$$ExternalSyntheticLambda4(this);
    }

    default Predicate<T> or(final Predicate<? super T> other) {
        Objects.requireNonNull(other);
        return new Predicate$$ExternalSyntheticLambda0(this, other);
    }

    static /* synthetic */ boolean lambda$or$2(Predicate _this, Predicate other, Object t) {
        if (_this.test(t) == false) goto L5;
    L8:
        return true;
    L5:
        if (other.test(t) == true) goto L8;
        return false;
    }

    static <T> Predicate<T> isEqual(final Object targetRef) {
        if (targetRef != null) goto L5;
        return new Predicate$$ExternalSyntheticLambda1();
    L5:
        return new Predicate$$ExternalSyntheticLambda2(targetRef);
    }

    static /* synthetic */ boolean lambda$isEqual$3(Object object) {
        return Objects.isNull(object);
    }

    static /* synthetic */ boolean lambda$isEqual$4(Object targetRef, Object object) {
        return targetRef.equals(object);
    }

    static <T> Predicate<T> not(Predicate<? super T> r1) {
        Objects.requireNonNull(r1);
        return r1.negate();
    }
}
