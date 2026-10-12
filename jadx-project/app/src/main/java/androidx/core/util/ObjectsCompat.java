package androidx.core.util;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class ObjectsCompat {
    private ObjectsCompat() {
    }

    public static boolean equals(Object a, Object b) {
        return Objects.equals(a, b);
    }

    public static int hashCode(Object o) {
        if (o != null) goto L6;
        return 0;
    L6:
        return o.hashCode();
    }

    public static int hash(Object... values) {
        return Objects.hash(values);
    }

    public static String toString(Object o, String nullDefault) {
        if (o == null) goto L5;
        return o.toString();
    L5:
        return nullDefault;
    }

    public static <T> T requireNonNull(T obj) {
        if (obj == null) goto L5;
        return obj;
    L5:
        throw new NullPointerException();
    }

    public static <T> T requireNonNull(T obj, String message) {
        if (obj == null) goto L5;
        return obj;
    L5:
        throw new NullPointerException(message);
    }
}
