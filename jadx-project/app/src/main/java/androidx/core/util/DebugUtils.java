package androidx.core.util;

/* JADX INFO: loaded from: classes4.dex */
public class DebugUtils {
    public static void buildShortClassTag(Object cls, StringBuilder out) {
        if (cls != null) goto L4;
        out.append("null");
        return;
    L4:
        String simpleName = cls.getClass().getSimpleName();
        if (simpleName != null) goto L7;
    L8:
        simpleName = cls.getClass().getName();
        int end = simpleName.lastIndexOf(46);
        if (end <= 0) goto L11;
        simpleName = simpleName.substring(end + 1);
    L11:
        out.append(simpleName);
        out.append('{');
        out.append(Integer.toHexString(System.identityHashCode(cls)));
        return;
    L7:
        if (simpleName.length() > 0) goto L11;
        goto L8
    }

    private DebugUtils() {
    }
}
