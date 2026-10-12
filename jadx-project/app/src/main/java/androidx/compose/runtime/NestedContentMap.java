package androidx.compose.runtime;

import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.ObjectList;
import androidx.compose.runtime.collection.MultiValueMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u0006\u0010\r\u001a\u00020\tJ\u0006\u0010\u000e\u001a\u00020\u000bJ\u0019\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0086\u0002J\u0018\u0010\u0012\u001a\u0004\u0018\u00010\t2\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006J\u000e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0005R*\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0007R*\u0010\b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/NestedContentMap;", "", "()V", "containerMap", "Landroidx/compose/runtime/collection/MultiValueMap;", "Landroidx/compose/runtime/MovableContentStateReference;", "Landroidx/compose/runtime/MovableContent;", "Landroidx/collection/MutableScatterMap;", "contentMap", "Landroidx/compose/runtime/NestedMovableContent;", "add", "", "content", "nestedContent", "clear", "contains", "", "key", "removeLast", "usedContainer", "reference", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class NestedContentMap {
    private final MutableScatterMap<Object, Object> containerMap;
    private final MutableScatterMap<Object, Object> contentMap;

    public NestedContentMap() {
        this.contentMap = MultiValueMap.m3887constructorimpl$default(null, 1, null);
        this.containerMap = MultiValueMap.m3887constructorimpl$default(null, 1, null);
    }

    public final void add(MovableContent<Object> r3, NestedMovableContent nestedContent) {
        MultiValueMap.m3883addimpl(this.contentMap, r3, nestedContent);
        MultiValueMap.m3883addimpl(this.containerMap, nestedContent.getContainer(), r3);
    }

    public final void clear() {
        MultiValueMap.m3885clearimpl(this.contentMap);
        MultiValueMap.m3885clearimpl(this.containerMap);
    }

    public final NestedMovableContent removeLast(MovableContent<Object> r5) {
        Object r0 = MultiValueMap.m3897removeLastimpl(this.contentMap, r5);
        NestedMovableContent r1 = (NestedMovableContent) r0;
        if (MultiValueMap.m3894isEmptyimpl(this.contentMap) == false) goto L6;
        MultiValueMap.m3885clearimpl(this.containerMap);
    L6:
        return (NestedMovableContent) r0;
    }

    public final boolean contains(MovableContent<Object> r2) {
        return MultiValueMap.m3888containsimpl(this.contentMap, r2);
    }

    public final void usedContainer(final MovableContentStateReference reference) {
        MutableScatterMap<Object, Object> r2 = this.containerMap;
        int r3 = 0;
        Object it$iv = r2.get(reference);
        if (it$iv == null) goto L14;
        if ((it$iv instanceof MutableObjectList) == false) goto L10;
        ObjectList this_$iv$iv = (ObjectList) it$iv;
        Object[] content$iv$iv = this_$iv$iv.content;
        int i$iv$iv = 0;
        int r11 = this_$iv$iv._size;
    L7:
        if (i$iv$iv >= r11) goto L17;
        Object value$iv = content$iv$iv[i$iv$iv];
        Intrinsics.checkNotNull(value$iv, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        MovableContent value = (MovableContent) value$iv;
        MutableScatterMap<Object, Object> r16 = r2;
        int r17 = r3;
        MultiValueMap.m3898removeValueIfimpl(this.contentMap, value, new NestedContentMap$usedContainer$1$1(reference));
        i$iv$iv = i$iv$iv + 1;
        r2 = r16;
        r3 = r17;
        goto L7
    L17:
        return;
    L10:
        Intrinsics.checkNotNull(it$iv, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        MovableContent value2 = (MovableContent) it$iv;
        MultiValueMap.m3898removeValueIfimpl(this.contentMap, value2, new NestedContentMap$usedContainer$1$1(reference));
        return;
    }
}
