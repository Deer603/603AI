package androidx.compose.runtime;

import androidx.collection.MutableIntList;
import androidx.collection.MutableObjectList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: compiled from: PausableComposition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\b\u0000\u0018\u0000 '*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001'B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004J3\u0010\u000f\u001a\u00020\u00102\u001f\u0010\u0011\u001a\u001b\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00100\u0012¢\u0006\u0002\b\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\u0015\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0004J\u001d\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001cJ \u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u001aH\u0016J\u0014\u0010\"\u001a\u00020\u00102\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0018\u0010$\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u001aH\u0016J\b\u0010%\u001a\u00020\u0010H\u0016J\b\u0010&\u001a\u00020\u0010H\u0016R\u001c\u0010\u0005\u001a\u00028\u0000X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Landroidx/compose/runtime/RecordingApplier;", "N", "Landroidx/compose/runtime/Applier;", "root", "(Ljava/lang/Object;)V", "current", "getCurrent", "()Ljava/lang/Object;", "setCurrent", "Ljava/lang/Object;", "instances", "Landroidx/collection/MutableObjectList;", "", "operations", "Landroidx/collection/MutableIntList;", "apply", "", "block", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "value", "clear", "down", "node", "insertBottomUp", "index", "", "instance", "(ILjava/lang/Object;)V", "insertTopDown", "move", "from", "to", "count", "playTo", "applier", "remove", "reuse", "up", "Companion", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RecordingApplier<N> implements Applier<N> {
    public static final int $stable = 0;
    public static final int APPLY = 7;
    public static final int CLEAR = 4;
    public static final Companion Companion = null;
    public static final int DOWN = 1;
    public static final int INSERT_BOTTOM_UP = 5;
    public static final int INSERT_TOP_DOWN = 6;
    public static final int MOVE = 3;
    public static final int REMOVE = 2;
    public static final int REUSE = 8;
    public static final int UP = 0;
    private N current;
    private final MutableObjectList<Object> instances;
    private final MutableIntList operations;

    /* JADX INFO: compiled from: PausableComposition.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/RecordingApplier$Companion;", "", "()V", "APPLY", "", "CLEAR", "DOWN", "INSERT_BOTTOM_UP", "INSERT_TOP_DOWN", "MOVE", "REMOVE", "REUSE", "UP", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
    }

    public RecordingApplier(N r6) {
        this.operations = new MutableIntList(0, 1, null);
        this.instances = new MutableObjectList(0, 1, null);
        this.current = r6;
    }

    @Override // androidx.compose.runtime.Applier
    public N getCurrent() {
        return this.current;
    }

    public void setCurrent(N r1) {
        this.current = r1;
    }

    @Override // androidx.compose.runtime.Applier
    public void down(N r3) {
        this.operations.add(1);
        this.instances.add(r3);
    }

    @Override // androidx.compose.runtime.Applier
    public void up() {
        this.operations.add(0);
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int index, int count) {
        this.operations.add(2);
        this.operations.add(index);
        this.operations.add(count);
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int from, int to, int count) {
        this.operations.add(3);
        this.operations.add(from);
        this.operations.add(to);
        this.operations.add(count);
    }

    @Override // androidx.compose.runtime.Applier
    public void clear() {
        this.operations.add(4);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int index, N r4) {
        this.operations.add(5);
        this.operations.add(index);
        this.instances.add(r4);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int index, N r4) {
        this.operations.add(6);
        this.operations.add(index);
        this.instances.add(r4);
    }

    @Override // androidx.compose.runtime.Applier
    public void apply(Function2<? super N, Object, Unit> r3, Object value) {
        this.operations.add(7);
        this.instances.add(r3);
        this.instances.add(value);
    }

    @Override // androidx.compose.runtime.Applier
    public void reuse() {
        this.operations.add(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void playTo(Applier<N> r11) {
        int operation = 0;
        int currentInstance = 0;
        MutableIntList operations = this.operations;
        MutableIntList this_$iv = operations;
        int size = this_$iv._size;
        MutableObjectList<Object> r4 = this.instances;
        r11.onBeginChanges();
    L3:
        if (operation >= size) goto L86;
        int currentOperation = operation + 1;
        switch(operations.get(operation)) {
            case 0: goto L54;
            case 1: goto L49;
            case 2: goto L40;
            case 3: goto L31;
            case 4: goto L29;
            case 5: goto L22;
            case 6: goto L17;
            case 7: goto L10;
            case 8: goto L8;
            default: goto L57;
        };     // Catch: Throwable -> L58
    L10:
        int currentInstance2 = currentInstance + 1;
        Object r1 = r4.get(currentInstance);     // Catch: Throwable -> L52
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");     // Catch: Throwable -> L52
        Function2 block = (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r1, 2);     // Catch: Throwable -> L52
        int currentInstance3 = currentInstance2 + 1;
        Object value = r4.get(currentInstance2);     // Catch: Throwable -> L15
        r11.apply(block, value);     // Catch: Throwable -> L15
        operation = currentOperation;
        currentInstance = currentInstance3;
    L15:
        Throwable th = th;
    L72:
        r11.onEndChanges();
        throw th;
    L52:
        th = th;
        goto L72
    L17:
        int currentOperation2 = currentOperation + 1;
        int index = operations.get(currentOperation);     // Catch: Throwable -> L47
        int currentInstance4 = currentInstance + 1;
        Object instance = r4.get(currentInstance);     // Catch: Throwable -> L27
        r11.insertTopDown(index, instance);     // Catch: Throwable -> L27
        operation = currentOperation2;
        currentInstance = currentInstance4;
    L27:
        th = th;
    L47:
        th = th;
        goto L72
    L22:
        int currentOperation3 = currentOperation + 1;
        int index2 = operations.get(currentOperation);     // Catch: Throwable -> L47
        int currentInstance5 = currentInstance + 1;
        Object instance2 = r4.get(currentInstance);     // Catch: Throwable -> L27
        r11.insertBottomUp(index2, instance2);     // Catch: Throwable -> L27
        operation = currentOperation3;
        currentInstance = currentInstance5;
        goto L3
    L31:
        int currentOperation4 = currentOperation + 1;
        int from = operations.get(currentOperation);     // Catch: Throwable -> L47
        int currentOperation5 = currentOperation4 + 1;
        int to = operations.get(currentOperation4);     // Catch: Throwable -> L45
        int currentOperation6 = currentOperation5 + 1;
        int count = operations.get(currentOperation5);     // Catch: Throwable -> L38
        r11.move(from, to, count);     // Catch: Throwable -> L38
        operation = currentOperation6;
    L38:
        th = th;
    L45:
        th = th;
        goto L72
    L40:
        int currentOperation7 = currentOperation + 1;
        int index3 = operations.get(currentOperation);     // Catch: Throwable -> L47
        int currentOperation8 = currentOperation7 + 1;
        int count2 = operations.get(currentOperation7);     // Catch: Throwable -> L45
        r11.remove(index3, count2);     // Catch: Throwable -> L45
        operation = currentOperation8;
        goto L3
    L49:
        int currentOperation9 = currentInstance + 1;
        Object node = r4.get(currentInstance);     // Catch: Throwable -> L52
        r11.down(node);     // Catch: Throwable -> L52
        operation = currentOperation;
        currentInstance = currentOperation9;
    L57:
        operation = currentOperation;
        goto L3
    L8:
        r11.reuse();     // Catch: Throwable -> L58
        goto L57
    L29:
        r11.clear();     // Catch: Throwable -> L58
        goto L57
    L54:
        r11.up();     // Catch: Throwable -> L58
    L58:
        th = th;
        goto L72
    L86:
    L70:
        th = move-exception;
        th = th;
        goto L72
    L61:
        if (currentInstance != r4.getSize()) goto L63;
        boolean value$iv = true;
    L65:
        if (value$iv == true) goto L67;
        ComposerKt.composeImmediateRuntimeError("Applier operation size mismatch");     // Catch: Throwable -> L70
    L67:
        r4.clear();     // Catch: Throwable -> L70
        operations.clear();     // Catch: Throwable -> L70
        r11.onEndChanges();
        return;
    L63:
        value$iv = false;
        goto L65
    }
}
