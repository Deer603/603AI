package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0013\u001a\u00020\u0002H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016J\f\u0010\u001c\u001a\u00020\u001a*\u00020\u001dH\u0016R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001f\u0010\u0006\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl;", "key1", "", "key2", "keys", "", "pointerInputEventHandler", "Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V", "getKey1", "()Ljava/lang/Object;", "getKey2", "getKeys", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "getPointerInputEventHandler", "()Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", "create", "equals", "", "other", "hashCode", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SuspendPointerInputElement extends ModifierNodeElement<SuspendingPointerInputModifierNodeImpl> {
    public static final int $stable = 0;
    private final Object key1;
    private final Object key2;
    private final Object[] keys;
    private final PointerInputEventHandler pointerInputEventHandler;

    static {
    }

    public /* synthetic */ SuspendPointerInputElement(Object r2, Object r3, Object[] r4, PointerInputEventHandler r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r6 & 4) == 0) goto L11;
        r4 = null;
    L11:
        this(r2, r3, r4, r5);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public /* bridge */ /* synthetic */ Modifier.Node create() {
        return create();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public /* bridge */ /* synthetic */ void update(Modifier.Node node) {
        update((SuspendingPointerInputModifierNodeImpl) node);
    }

    public final Object getKey1() {
        return this.key1;
    }

    public final Object getKey2() {
        return this.key2;
    }

    public final Object[] getKeys() {
        return this.keys;
    }

    public final PointerInputEventHandler getPointerInputEventHandler() {
        return this.pointerInputEventHandler;
    }

    public SuspendPointerInputElement(Object key1, Object key2, Object[] keys, PointerInputEventHandler pointerInputEventHandler) {
        this.key1 = key1;
        this.key2 = key2;
        this.keys = keys;
        this.pointerInputEventHandler = pointerInputEventHandler;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo $this$inspectableProperties) {
        $this$inspectableProperties.setName("pointerInput");
        $this$inspectableProperties.getProperties().set("key1", this.key1);
        $this$inspectableProperties.getProperties().set("key2", this.key2);
        $this$inspectableProperties.getProperties().set("keys", this.keys);
        $this$inspectableProperties.getProperties().set("pointerInputEventHandler", this.pointerInputEventHandler);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SuspendingPointerInputModifierNodeImpl create() {
        return new SuspendingPointerInputModifierNodeImpl(this.key1, this.key2, this.keys, this.pointerInputEventHandler);
    }

    public void update(SuspendingPointerInputModifierNodeImpl node) {
        node.update$ui_release(this.key1, this.key2, this.keys, this.pointerInputEventHandler);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof SuspendPointerInputElement) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.areEqual(this.key1, ((SuspendPointerInputElement) other).key1) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.key2, ((SuspendPointerInputElement) other).key2) == true) goto L15;
        return false;
    L15:
        if (this.keys == null) goto L23;
        if (((SuspendPointerInputElement) other).keys != null) goto L20;
        return false;
    L20:
        if (Arrays.equals(this.keys, ((SuspendPointerInputElement) other).keys) == true) goto L26;
        return false;
    L26:
        if (this.pointerInputEventHandler != ((SuspendPointerInputElement) other).pointerInputEventHandler) goto L29;
        return true;
    L29:
        return false;
    L23:
        if (((SuspendPointerInputElement) other).keys == null) goto L26;
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        Object r0 = this.key1;
        int r1 = 0;
        if (r0 == null) goto L5;
        int result = r0.hashCode();
    L6:
        int r2 = result * 31;
        Object r3 = this.key2;
        if (r3 == null) goto L9;
        int r4 = r3.hashCode();
    L10:
        int result2 = r2 + r4;
        int result3 = result2 * 31;
        Object[] r5 = this.keys;
        if (r5 == null) goto L14;
        r1 = Arrays.hashCode(r5);
    L14:
        return ((result3 + r1) * 31) + this.pointerInputEventHandler.hashCode();
    L9:
        r4 = 0;
        goto L10
    L5:
        result = 0;
        goto L6
    }
}
