package androidx.lifecycle.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;

/* JADX INFO: compiled from: SavedStateHandleImpl.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0000\"\u001c\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"isAcceptableType", "", "value", "", "ACCEPTABLE_CLASSES", "", "Ljava/lang/Class;", "lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SavedStateHandleImpl_androidKt {
    private static final List<Class<? extends Object>> ACCEPTABLE_CLASSES = null;

    public static final boolean isAcceptableType(Object value) {
        if (value == null) goto L23;
        Iterable $this$any$iv = ACCEPTABLE_CLASSES;
        if (($this$any$iv instanceof Collection) == true) goto L7;
    L9:
        Iterator r3 = $this$any$iv.iterator();
    L11:
        if (r3.hasNext() == false) goto L15;
        Object element$iv = r3.next();
        Class classRef = (Class) element$iv;
        if (classRef.isInstance(value) == false) goto L11;
        boolean r1 = true;
    L16:
        if (r1 == false) goto L19;
        return true;
    L19:
        return false;
    L15:
        r1 = false;
        goto L16
    L7:
        if (((Collection) $this$any$iv).isEmpty() == false) goto L9;
        r1 = false;
        goto L16
    L23:
        return true;
    }

    static {
        ACCEPTABLE_CLASSES = ArraysKt.filterNotNull(new Class[]{Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class});
    }
}
