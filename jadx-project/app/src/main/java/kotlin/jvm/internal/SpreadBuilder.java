package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class SpreadBuilder {
    private final ArrayList<Object> list;

    public SpreadBuilder(int size) {
        this.list = new ArrayList(size);
    }

    public void addSpread(Object container) {
        if (container != null) goto L5;
        return;
    L5:
        if ((container instanceof Object[]) == false) goto L11;
        Object[] array = (Object[]) container;
        if (array.length <= 0) goto L33;
        this.list.ensureCapacity(this.list.size() + array.length);
        Collections.addAll(this.list, array);
        return;
    L33:
        return;
    L11:
        if ((container instanceof Collection) == false) goto L14;
        this.list.addAll((Collection) container);
        return;
    L14:
        if ((container instanceof Iterable) == false) goto L21;
        Iterator r0 = ((Iterable) container).iterator();
    L17:
        if (r0.hasNext() == false) goto L34;
        Object element = r0.next();
        this.list.add(element);
        goto L17
    L34:
        return;
    L21:
        if ((container instanceof Iterator) == false) goto L29;
        Iterator iterator = (Iterator) container;
    L24:
        if (iterator.hasNext() == false) goto L35;
        this.list.add(iterator.next());
        goto L24
    L35:
        return;
    L29:
        throw new UnsupportedOperationException("Don't know how to spread " + container.getClass());
    }

    public int size() {
        return this.list.size();
    }

    public void add(Object element) {
        this.list.add(element);
    }

    public Object[] toArray(Object[] a) {
        return this.list.toArray(a);
    }
}
