package androidx.compose.ui;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;

/* JADX INFO: compiled from: Actual.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0000¨\u0006\u000b"}, d2 = {"areObjectsOfSameType", "", "a", "", "b", "classKeyForObject", "tryPopulateReflectively", "", "Landroidx/compose/ui/platform/InspectorInfo;", "element", "Landroidx/compose/ui/node/ModifierNodeElement;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Actual_jvmKt {
    public static final boolean areObjectsOfSameType(Object a, Object b) {
        if (a.getClass() != b.getClass()) goto L5;
        return true;
    L5:
        return false;
    }

    public static final Object classKeyForObject(Object a) {
        return a.getClass();
    }

    public static final void tryPopulateReflectively(InspectorInfo $this$tryPopulateReflectively, ModifierNodeElement<?> r11) {
        Object[] $this$sortedBy$iv = r11.getClass().getDeclaredFields();
        List $this$fastForEach$iv = ArraysKt.sortedWith($this$sortedBy$iv, new Actual_jvmKt$tryPopulateReflectively$$inlined$sortedBy$1());
        int index$iv = 0;
        int r3 = $this$fastForEach$iv.size();
    L3:
        if (index$iv >= r3) goto L14;
        Object item$iv = $this$fastForEach$iv.get(index$iv);
        Field field = (Field) item$iv;
        if (field.getDeclaringClass().isAssignableFrom(ModifierNodeElement.class) == true) goto L12;
        field.setAccessible(true);     // Catch: IllegalAccessException -> L9 SecurityException -> L11
        $this$tryPopulateReflectively.getProperties().set(field.getName(), field.get(r11));     // Catch: IllegalAccessException -> L9 SecurityException -> L11
    L12:
        index$iv = index$iv + 1;
        goto L3
    }
}
