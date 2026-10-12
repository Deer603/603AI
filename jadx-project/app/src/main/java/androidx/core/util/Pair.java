package androidx.core.util;

/* JADX INFO: loaded from: classes4.dex */
public class Pair<F, S> {
    public final F first;
    public final S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public boolean equals(Object o) {
        if ((o instanceof Pair) == true) goto L5;
        return false;
    L5:
        Pair<?, ?> p = (Pair) o;
        if (ObjectsCompat.equals(p.first, this.first) == true) goto L8;
        return false;
    L8:
        if (ObjectsCompat.equals(p.second, this.second) == false) goto L12;
        return true;
    L12:
        return false;
    }

    public int hashCode() {
        int r1 = 0;
        if (this.first != null) goto L5;
        int r0 = 0;
    L7:
        if (this.second == null) goto L11;
        r1 = this.second.hashCode();
    L11:
        return r0 ^ r1;
    L5:
        r0 = this.first.hashCode();
        goto L7
    }

    public String toString() {
        return "Pair{" + this.first + " " + this.second + "}";
    }

    public static <A, B> Pair<A, B> create(A a, B b) {
        return new Pair(a, b);
    }
}
