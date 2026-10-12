package androidx.compose.ui.node;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: OwnerSnapshotObserver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B.\u0012'\u0010\u0002\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\tJ\u0015\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0001H\u0000¢\u0006\u0002\b\u0016J\r\u0010\u0017\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0018J-\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0002\b\u001eJ-\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0002\b J-\u0010!\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0002\b\"JC\u0010#\u001a\u00020\u0005\"\b\b\u0000\u0010$*\u00020%2\u0006\u0010\u0015\u001a\u0002H$2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u0002H$\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b'\u0010(J#\u0010)\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\r2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0002\b*J\r\u0010+\u001a\u00020\u0005H\u0000¢\u0006\u0002\b,J\r\u0010-\u001a\u00020\u0005H\u0000¢\u0006\u0002\b.R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Landroidx/compose/ui/node/OwnerSnapshotObserver;", "", "onChangedExecutor", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "callback", "(Lkotlin/jvm/functions/Function1;)V", "observer", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "onCommitAffectingLayout", "Landroidx/compose/ui/node/LayoutNode;", "onCommitAffectingLayoutModifier", "onCommitAffectingLayoutModifierInLookahead", "onCommitAffectingLookahead", "onCommitAffectingLookaheadMeasure", "onCommitAffectingMeasure", "onCommitAffectingSemantics", "clear", "target", "clear$ui_release", "clearInvalidObservations", "clearInvalidObservations$ui_release", "observeLayoutModifierSnapshotReads", "node", "affectsLookahead", "", "block", "observeLayoutModifierSnapshotReads$ui_release", "observeLayoutSnapshotReads", "observeLayoutSnapshotReads$ui_release", "observeMeasureSnapshotReads", "observeMeasureSnapshotReads$ui_release", "observeReads", "T", "Landroidx/compose/ui/node/OwnerScope;", "onChanged", "observeReads$ui_release", "(Landroidx/compose/ui/node/OwnerScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "observeSemanticsReads", "observeSemanticsReads$ui_release", "startObserving", "startObserving$ui_release", "stopObserving", "stopObserving$ui_release", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class OwnerSnapshotObserver {
    public static final int $stable = 0;
    private final SnapshotStateObserver observer;
    private final Function1<LayoutNode, Unit> onCommitAffectingLayout;
    private final Function1<LayoutNode, Unit> onCommitAffectingLayoutModifier;
    private final Function1<LayoutNode, Unit> onCommitAffectingLayoutModifierInLookahead;
    private final Function1<LayoutNode, Unit> onCommitAffectingLookahead;
    private final Function1<LayoutNode, Unit> onCommitAffectingLookaheadMeasure;
    private final Function1<LayoutNode, Unit> onCommitAffectingMeasure;
    private final Function1<LayoutNode, Unit> onCommitAffectingSemantics;

    static {
        $stable = SnapshotStateObserver.$stable;
    }

    public OwnerSnapshotObserver(Function1<? super Function0<Unit>, Unit> r2) {
        this.observer = new SnapshotStateObserver(r2);
        this.onCommitAffectingLookaheadMeasure = OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1.INSTANCE;
        this.onCommitAffectingMeasure = OwnerSnapshotObserver$onCommitAffectingMeasure$1.INSTANCE;
        this.onCommitAffectingSemantics = OwnerSnapshotObserver$onCommitAffectingSemantics$1.INSTANCE;
        this.onCommitAffectingLayout = OwnerSnapshotObserver$onCommitAffectingLayout$1.INSTANCE;
        this.onCommitAffectingLayoutModifier = OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1.INSTANCE;
        this.onCommitAffectingLayoutModifierInLookahead = OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1.INSTANCE;
        this.onCommitAffectingLookahead = OwnerSnapshotObserver$onCommitAffectingLookahead$1.INSTANCE;
    }

    public static /* synthetic */ void observeLayoutSnapshotReads$ui_release$default(OwnerSnapshotObserver r0, LayoutNode r1, boolean r2, Function0 r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L5;
        r2 = true;
    L5:
        r0.observeLayoutSnapshotReads$ui_release(r1, r2, r3);
    }

    public final void observeLayoutSnapshotReads$ui_release(LayoutNode node, boolean affectsLookahead, Function0<Unit> r5) {
        if (affectsLookahead == true) goto L4;
    L6:
        observeReads$ui_release(node, this.onCommitAffectingLayout, r5);
        return;
    L4:
        if (node.getLookaheadRoot$ui_release() == null) goto L6;
        observeReads$ui_release(node, this.onCommitAffectingLookahead, r5);
    }

    public static /* synthetic */ void observeLayoutModifierSnapshotReads$ui_release$default(OwnerSnapshotObserver r0, LayoutNode r1, boolean r2, Function0 r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L5;
        r2 = true;
    L5:
        r0.observeLayoutModifierSnapshotReads$ui_release(r1, r2, r3);
    }

    public final void observeLayoutModifierSnapshotReads$ui_release(LayoutNode node, boolean affectsLookahead, Function0<Unit> r5) {
        if (affectsLookahead == true) goto L4;
    L6:
        observeReads$ui_release(node, this.onCommitAffectingLayoutModifier, r5);
        return;
    L4:
        if (node.getLookaheadRoot$ui_release() == null) goto L6;
        observeReads$ui_release(node, this.onCommitAffectingLayoutModifierInLookahead, r5);
    }

    public static /* synthetic */ void observeMeasureSnapshotReads$ui_release$default(OwnerSnapshotObserver r0, LayoutNode r1, boolean r2, Function0 r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L5;
        r2 = true;
    L5:
        r0.observeMeasureSnapshotReads$ui_release(r1, r2, r3);
    }

    public final void observeMeasureSnapshotReads$ui_release(LayoutNode node, boolean affectsLookahead, Function0<Unit> r5) {
        if (affectsLookahead == true) goto L4;
    L6:
        observeReads$ui_release(node, this.onCommitAffectingMeasure, r5);
        return;
    L4:
        if (node.getLookaheadRoot$ui_release() == null) goto L6;
        observeReads$ui_release(node, this.onCommitAffectingLookaheadMeasure, r5);
    }

    public final void observeSemanticsReads$ui_release(LayoutNode node, Function0<Unit> r4) {
        observeReads$ui_release(node, this.onCommitAffectingSemantics, r4);
    }

    public final <T extends OwnerScope> void observeReads$ui_release(T r2, Function1<? super T, Unit> r3, Function0<Unit> r4) {
        this.observer.observeReads(r2, r3, r4);
    }

    public final void clearInvalidObservations$ui_release() {
        this.observer.clearIf(OwnerSnapshotObserver$clearInvalidObservations$1.INSTANCE);
    }

    public final void clear$ui_release(Object target) {
        this.observer.clear(target);
    }

    public final void startObserving$ui_release() {
        this.observer.start();
    }

    public final void stopObserving$ui_release() {
        this.observer.stop();
        this.observer.clear();
    }
}
