package androidx.compose.ui.focus;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: FocusTransactionManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001a\u001a\u00020\u0006H\u0002J\b\u0010\u001b\u001a\u00020\u0006H\u0002J\b\u0010\u001c\u001a\u00020\u0006H\u0002J4\u0010\u001d\u001a\u0002H\u001e\"\u0004\b\u0000\u0010\u001e2\u0010\b\n\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u001e0\u0005H\u0086\b¢\u0006\u0002\u0010!J4\u0010\"\u001a\u0002H\u001e\"\u0004\b\u0000\u0010\u001e2\u0010\b\n\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u001e0\u0005H\u0086\b¢\u0006\u0002\u0010!R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\u0015\u001a\u0004\u0018\u00010\u0013*\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006#"}, d2 = {"Landroidx/compose/ui/focus/FocusTransactionManager;", "", "()V", "cancellationListener", "Landroidx/compose/runtime/collection/MutableVector;", "Lkotlin/Function0;", "", "<set-?>", "", "generation", "getGeneration", "()I", "", "ongoingTransaction", "getOngoingTransaction", "()Z", "states", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusStateImpl;", "value", "uncommittedFocusState", "getUncommittedFocusState", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusStateImpl;", "setUncommittedFocusState", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusStateImpl;)V", "beginTransaction", "cancelTransaction", "commitTransaction", "withExistingTransaction", "T", "onCancelled", "block", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "withNewTransaction", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FocusTransactionManager {
    public static final int $stable = 0;
    private final MutableVector<Function0<Unit>> cancellationListener;
    private int generation;
    private boolean ongoingTransaction;
    private final MutableScatterMap<FocusTargetNode, FocusStateImpl> states;

    static {
        $stable = 8;
    }

    public FocusTransactionManager() {
        this.states = ScatterMapKt.mutableScatterMapOf();
        this.cancellationListener = new MutableVector(new Function0[16], 0);
    }

    public static final /* synthetic */ void access$beginTransaction(FocusTransactionManager $this) {
        $this.beginTransaction();
    }

    public static final /* synthetic */ void access$cancelTransaction(FocusTransactionManager $this) {
        $this.cancelTransaction();
    }

    public static final /* synthetic */ void access$commitTransaction(FocusTransactionManager $this) {
        $this.commitTransaction();
    }

    public static final /* synthetic */ MutableVector access$getCancellationListener$p(FocusTransactionManager $this) {
        return $this.cancellationListener;
    }

    public final boolean getOngoingTransaction() {
        return this.ongoingTransaction;
    }

    public final int getGeneration() {
        return this.generation;
    }

    public static /* synthetic */ Object withNewTransaction$default(FocusTransactionManager $this, Function0 onCancelled, Function0 block, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L18;
        onCancelled = null;
    L18:
    L15:
        th = move-exception;
        access$commitTransaction($this);
        throw th;
    L7:
        if ($this.getOngoingTransaction() == false) goto L9;
        access$cancelTransaction($this);     // Catch: Throwable -> L15
    L9:
        access$beginTransaction($this);     // Catch: Throwable -> L15
        if (onCancelled == null) goto L12;
        Function0 it = onCancelled;
        MutableVector this_$iv = access$getCancellationListener$p($this);     // Catch: Throwable -> L15
        this_$iv.add(it);     // Catch: Throwable -> L15
    L12:
        Object r8 = block.invoke();     // Catch: Throwable -> L15
        access$commitTransaction($this);
        return r8;
    }

    public final <T> T withNewTransaction(Function0<Unit> r6, Function0<? extends T> r7) {
    L12:
        th = move-exception;
        access$commitTransaction(this);
        throw th;
    L4:
        if (getOngoingTransaction() == false) goto L6;
        access$cancelTransaction(this);     // Catch: Throwable -> L12
    L6:
        access$beginTransaction(this);     // Catch: Throwable -> L12
        if (r6 == null) goto L9;
        MutableVector this_$iv = access$getCancellationListener$p(this);     // Catch: Throwable -> L12
        this_$iv.add(r6);     // Catch: Throwable -> L12
    L9:
        T r1 = r7.invoke();     // Catch: Throwable -> L12
        access$commitTransaction(this);
        return r1;
    }

    public static /* synthetic */ Object withExistingTransaction$default(FocusTransactionManager $this, Function0 onCancelled, Function0 block, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        onCancelled = null;
    L6:
        if (onCancelled == null) goto L9;
        Function0 it = onCancelled;
        MutableVector this_$iv = access$getCancellationListener$p($this);
        this_$iv.add(it);
    L9:
        if ($this.getOngoingTransaction() == true) goto L20;
        access$beginTransaction($this);     // Catch: Throwable -> L15
        Object r8 = block.invoke();     // Catch: Throwable -> L15
        access$commitTransaction($this);
        return r8;
    L15:
        th = move-exception;
        access$commitTransaction($this);
        throw th;
    L20:
        return block.invoke();
    }

    public final <T> T withExistingTransaction(Function0<Unit> r6, Function0<? extends T> r7) {
        if (r6 == null) goto L6;
        MutableVector this_$iv = access$getCancellationListener$p(this);
        this_$iv.add(r6);
    L6:
        if (getOngoingTransaction() == true) goto L17;
        access$beginTransaction(this);     // Catch: Throwable -> L12
        T r1 = r7.invoke();     // Catch: Throwable -> L12
        access$commitTransaction(this);
        return r1;
    L12:
        th = move-exception;
        access$commitTransaction(this);
        throw th;
    L17:
        return r7.invoke();
    }

    public final FocusStateImpl getUncommittedFocusState(FocusTargetNode $this$uncommittedFocusState) {
        if (ComposeUiFlags.isTrackFocusEnabled == true) goto L7;
        return this.states.get($this$uncommittedFocusState);
    L7:
        throw new IllegalStateException("uncommittedFocusState must not be accessed when isTrackFocusEnabled is on".toString());
    }

    public final void setUncommittedFocusState(FocusTargetNode $this$uncommittedFocusState, FocusStateImpl value) {
        if (ComposeUiFlags.isTrackFocusEnabled == true) goto L14;
        FocusStateImpl currentFocusState = this.states.get($this$uncommittedFocusState);
        if (currentFocusState != null) goto L7;
        currentFocusState = FocusStateImpl.Inactive;
    L7:
        if (currentFocusState == value) goto L9;
        this.generation++;
    L9:
        MutableScatterMap<FocusTargetNode, FocusStateImpl> r1 = this.states;
        if (value == null) goto L12;
        r1.set($this$uncommittedFocusState, value);
        return;
    L12:
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("requires a non-null focus state");
        throw new KotlinNothingValueException();
    }

    private final void beginTransaction() {
        this.ongoingTransaction = true;
    }

    private final void commitTransaction() {
        ScatterMap this_$iv = this.states;
        Object[] k$iv = this_$iv.keys;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L19;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        long slot$iv$iv2 = slot$iv$iv;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L16;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L15;
        long value$iv$iv$iv = slot$iv$iv2 & 255;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r18 = true;
    L12:
        if (r18 == false) goto L14;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        FocusTargetNode focusTargetNode = (FocusTargetNode) k$iv[index$iv$iv];
        focusTargetNode.commitFocusState$ui_release();
    L14:
        slot$iv$iv2 = slot$iv$iv2 >> 8;
        j$iv$iv = j$iv$iv + 1;
        goto L7
    L11:
        r18 = false;
        goto L12
    L15:
        if (bitCount$iv$iv != 8) goto L19;
    L16:
        if (i$iv$iv == lastIndex$iv$iv) goto L19;
        i$iv$iv = i$iv$iv + 1;
    L19:
        this.states.clear();
        this.ongoingTransaction = false;
        this.cancellationListener.clear();
    }

    private final void cancelTransaction() {
        this.states.clear();
        this.ongoingTransaction = false;
        MutableVector<Function0<Unit>> r0 = this.cancellationListener;
        int i$iv = 0;
        Object[] content$iv = r0.content;
        int size$iv = r0.getSize();
    L3:
        if (i$iv >= size$iv) goto L5;
        ((Function0) content$iv[i$iv]).invoke();
        i$iv = i$iv + 1;
        goto L3
    L5:
        this.cancellationListener.clear();
    }
}
