package androidx.emoji2.text;

import android.os.Build;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
class EmojiExclusions {

    private static class EmojiExclusions_Api34 {
        private EmojiExclusions_Api34() {
        }

        static Set<int[]> getExclusions() {
            return EmojiExclusions_Reflections.getExclusions();
        }
    }

    private static class EmojiExclusions_Reflections {
        private EmojiExclusions_Reflections() {
        }

        static Set<int[]> getExclusions() {
            Class<?> clazz = Class.forName("android.text.EmojiConsistency");     // Catch: Throwable -> L15
            Method method = clazz.getMethod("getEmojiConsistencySet", new Class[0]);     // Catch: Throwable -> L15
            Object result = method.invoke(null, new Object[0]);     // Catch: Throwable -> L15
            if (result == null) goto L5;
            Set<int[]> r3 = (Set) result;     // Catch: Throwable -> L15
            Iterator<int[]> r4 = r3.iterator();     // Catch: Throwable -> L15
        L8:
            if (r4.hasNext() == false) goto L14;
            Object item = r4.next();     // Catch: Throwable -> L15
            if ((item instanceof int[]) == true) goto L8;
            return Collections.emptySet();
        L14:
            return r3;
        L5:
            return Collections.emptySet();
        L17:
            return Collections.emptySet();
        }
    }

    private EmojiExclusions() {
    }

    static Set<int[]> getEmojiExclusions() {
        if (Build.VERSION.SDK_INT < 34) goto L7;
        return EmojiExclusions_Api34.getExclusions();
    L7:
        return EmojiExclusions_Reflections.getExclusions();
    }
}
