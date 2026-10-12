package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.IntStack;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.SlotReader;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.Stack;
import androidx.compose.runtime.internal.IntRef;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ComposerChangeListWriter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u0087\u00012\u00020\u0001:\u0002\u0087\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001J\u001e\u0010)\u001a\u00020%2\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010+2\u0006\u0010,\u001a\u00020-J(\u0010.\u001a\u00020%2\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000204J\u0006\u00106\u001a\u00020%J\u0016\u00107\u001a\u00020%2\u0006\u00108\u001a\u00020-2\u0006\u0010&\u001a\u00020'J\"\u00109\u001a\u00020%2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020%0;2\u0006\u0010=\u001a\u00020<J\u0006\u0010>\u001a\u00020%J\u0006\u0010?\u001a\u00020%J\u0006\u0010@\u001a\u00020%J\u0016\u0010A\u001a\u00020%2\u0006\u0010B\u001a\u00020\u00122\u0006\u0010C\u001a\u00020\u0012J\u000e\u0010D\u001a\u00020%2\u0006\u0010E\u001a\u00020FJ\u0006\u0010G\u001a\u00020%J\u0010\u0010H\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0002J\b\u0010I\u001a\u00020%H\u0002J\u0006\u0010J\u001a\u00020%J\u001a\u0010K\u001a\u00020%2\u0006\u0010L\u001a\u00020\u00052\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-J\u0016\u0010M\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u00103\u001a\u00020NJ\u001e\u0010M\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u00103\u001a\u00020N2\u0006\u0010O\u001a\u00020PJ\u000e\u0010Q\u001a\u00020%2\u0006\u0010R\u001a\u00020\u0012J\u0010\u0010S\u001a\u00020%2\b\u0010T\u001a\u0004\u0018\u00010\u0001J\u001e\u0010U\u001a\u00020%2\u0006\u00103\u001a\u00020\u00122\u0006\u00105\u001a\u00020\u00122\u0006\u0010V\u001a\u00020\u0012J\u000e\u0010W\u001a\u00020%2\u0006\u0010X\u001a\u00020\u0012J\u000e\u0010Y\u001a\u00020%2\u0006\u0010X\u001a\u00020\u0012J\u0006\u0010Z\u001a\u00020%J\b\u0010[\u001a\u00020%H\u0002J\b\u0010\\\u001a\u00020%H\u0002J\b\u0010]\u001a\u00020%H\u0002J\u0012\u0010^\u001a\u00020%2\b\b\u0002\u0010_\u001a\u00020\fH\u0002J \u0010`\u001a\u00020%2\u0006\u00105\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00122\u0006\u0010V\u001a\u00020\u0012H\u0002J\b\u0010a\u001a\u00020%H\u0002J\u0012\u0010b\u001a\u00020%2\b\b\u0002\u0010c\u001a\u00020\fH\u0002J\u0018\u0010d\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0006\u0010e\u001a\u00020%J\u0006\u0010f\u001a\u00020%J\u001e\u0010g\u001a\u00020%2\u0006\u0010=\u001a\u00020h2\u0006\u00101\u001a\u0002022\u0006\u0010i\u001a\u000204J\u000e\u0010j\u001a\u00020%2\u0006\u0010(\u001a\u00020kJ\u000e\u0010l\u001a\u00020%2\u0006\u0010E\u001a\u00020FJ\u0006\u0010m\u001a\u00020%J\u0016\u0010n\u001a\u00020%2\u0006\u0010B\u001a\u00020\u00122\u0006\u0010V\u001a\u00020\u0012J\u0006\u0010o\u001a\u00020%J\u0006\u0010p\u001a\u00020%J\u0014\u0010q\u001a\u00020%2\f\u0010r\u001a\b\u0012\u0004\u0012\u00020%0sJ\u0006\u0010t\u001a\u00020%J\u000e\u0010u\u001a\u00020%2\u0006\u0010E\u001a\u00020FJ\u000e\u0010v\u001a\u00020%2\u0006\u0010V\u001a\u00020\u0012J \u0010w\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010\u00012\u0006\u0010&\u001a\u00020'2\u0006\u0010x\u001a\u00020\u0012J\u0010\u0010y\u001a\u00020%2\b\u0010z\u001a\u0004\u0018\u00010\u0001J@\u0010{\u001a\u00020%\"\u0004\b\u0000\u0010|\"\u0004\b\u0001\u0010}2\u0006\u0010(\u001a\u0002H}2\u001e\u0010~\u001a\u001a\u0012\u0004\u0012\u0002H|\u0012\u0004\u0012\u0002H}\u0012\u0004\u0012\u00020%0\u007f¢\u0006\u0003\b\u0080\u0001¢\u0006\u0003\u0010\u0081\u0001J\u0019\u0010\u0082\u0001\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010\u00012\u0006\u0010x\u001a\u00020\u0012J\u0011\u0010\u0083\u0001\u001a\u00020%2\b\u0010T\u001a\u0004\u0018\u00010\u0001J!\u0010\u0084\u0001\u001a\u00020%2\u0007\u0010\u0085\u0001\u001a\u00020\u00052\f\u0010~\u001a\b\u0012\u0004\u0012\u00020%0sH\u0086\bJ\u0018\u0010\u0086\u0001\u001a\u00020%2\f\u0010~\u001a\b\u0012\u0004\u0012\u00020%0sH\u0086\bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000eR\u001e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0088\u0001"}, d2 = {"Landroidx/compose/runtime/changelist/ComposerChangeListWriter;", "", "composer", "Landroidx/compose/runtime/ComposerImpl;", "changeList", "Landroidx/compose/runtime/changelist/ChangeList;", "(Landroidx/compose/runtime/ComposerImpl;Landroidx/compose/runtime/changelist/ChangeList;)V", "getChangeList", "()Landroidx/compose/runtime/changelist/ChangeList;", "setChangeList", "(Landroidx/compose/runtime/changelist/ChangeList;)V", "implicitRootStart", "", "getImplicitRootStart", "()Z", "setImplicitRootStart", "(Z)V", "moveCount", "", "moveFrom", "moveTo", "pastParent", "getPastParent", "pendingDownNodes", "Landroidx/compose/runtime/Stack;", "Ljava/util/ArrayList;", "pendingUps", "reader", "Landroidx/compose/runtime/SlotReader;", "getReader", "()Landroidx/compose/runtime/SlotReader;", "removeFrom", "startedGroup", "startedGroups", "Landroidx/compose/runtime/IntStack;", "writersReaderDelta", "appendValue", "", "anchor", "Landroidx/compose/runtime/Anchor;", "value", "copyNodesToNewAnchorLocation", "nodes", "", "effectiveNodeIndex", "Landroidx/compose/runtime/internal/IntRef;", "copySlotTableToAnchorLocation", "resolvedState", "Landroidx/compose/runtime/MovableContentState;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", "from", "Landroidx/compose/runtime/MovableContentStateReference;", "to", "deactivateCurrentGroup", "determineMovableContentNodeIndex", "effectiveNodeIndexOut", "endCompositionScope", "action", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "composition", "endCurrentGroup", "endMovableContentPlacement", "endNodeMovement", "endNodeMovementAndDeleteNode", "nodeIndex", "group", "endResumingScope", "scope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "endRoot", "ensureGroupStarted", "ensureRootStarted", "finalizeComposition", "includeOperationsIn", "other", "insertSlots", "Landroidx/compose/runtime/SlotTable;", "fixups", "Landroidx/compose/runtime/changelist/FixupList;", "moveCurrentGroup", "offset", "moveDown", "node", "moveNode", "count", "moveReaderRelativeTo", "location", "moveReaderToAbsolute", "moveUp", "pushApplierOperationPreamble", "pushPendingUpsAndDowns", "pushSlotEditingOperationPreamble", "pushSlotTableOperationPreamble", "useParentSlot", "realizeMoveNode", "realizeNodeMovementOperations", "realizeOperationLocation", "forParent", "realizeRemoveNode", "recordSlotEditing", "releaseMovableContent", "releaseMovableGroupAtCurrent", "Landroidx/compose/runtime/ControlledComposition;", "reference", "remember", "Landroidx/compose/runtime/RememberObserverHolder;", "rememberPausingScope", "removeCurrentGroup", "removeNode", "resetSlots", "resetTransientState", "sideEffect", "effect", "Lkotlin/Function0;", "skipToEndOfCurrentGroup", "startResumingScope", "trimValues", "updateAnchoredValue", "groupSlotIndex", "updateAuxData", "data", "updateNode", "T", "V", "block", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "updateValue", "useNode", "withChangeList", "newChangeList", "withoutImplicitRootStart", "Companion", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ComposerChangeListWriter {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final int invalidGroupLocation = -2;
    private ChangeList changeList;
    private final ComposerImpl composer;
    private boolean implicitRootStart;
    private int moveCount;
    private int moveFrom;
    private int moveTo;
    private ArrayList<T> pendingDownNodes;
    private int pendingUps;
    private int removeFrom;
    private boolean startedGroup;
    private final IntStack startedGroups;
    private int writersReaderDelta;

    /* JADX INFO: compiled from: ComposerChangeListWriter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/changelist/ComposerChangeListWriter$Companion;", "", "()V", "invalidGroupLocation", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public ComposerChangeListWriter(ComposerImpl composer, ChangeList changeList) {
        this.composer = composer;
        this.changeList = changeList;
        this.startedGroups = new IntStack();
        this.implicitRootStart = true;
        this.pendingDownNodes = Stack.m3793constructorimpl$default(null, 1, null);
        this.removeFrom = -1;
        this.moveFrom = -1;
        this.moveTo = -1;
    }

    public final ChangeList getChangeList() {
        return this.changeList;
    }

    public final void setChangeList(ChangeList r1) {
        this.changeList = r1;
    }

    private final SlotReader getReader() {
        return this.composer.getReader$runtime_release();
    }

    public final boolean getImplicitRootStart() {
        return this.implicitRootStart;
    }

    public final void setImplicitRootStart(boolean r1) {
        this.implicitRootStart = r1;
    }

    private final void pushApplierOperationPreamble() {
        pushPendingUpsAndDowns();
    }

    private final void pushSlotEditingOperationPreamble() {
        realizeOperationLocation$default(this, false, 1, null);
        recordSlotEditing();
    }

    static /* synthetic */ void pushSlotTableOperationPreamble$default(ComposerChangeListWriter r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = false;
    L5:
        r0.pushSlotTableOperationPreamble(r1);
    }

    private final void pushSlotTableOperationPreamble(boolean useParentSlot) {
        realizeOperationLocation(useParentSlot);
    }

    public final void moveReaderRelativeTo(int location) {
        this.writersReaderDelta += location - getReader().getCurrentGroup();
    }

    public final void moveReaderToAbsolute(int location) {
        this.writersReaderDelta = location;
    }

    public final void recordSlotEditing() {
        if (getReader().getSize() <= 0) goto L10;
        SlotReader reader = getReader();
        int location = reader.getParent();
        if (this.startedGroups.peekOr(-2) == location) goto L11;
        ensureRootStarted();
        if (location <= 0) goto L12;
        Anchor anchor = reader.anchor(location);
        this.startedGroups.push(location);
        ensureGroupStarted(anchor);
        return;
    L12:
        return;
    L11:
        return;
    }

    private final void ensureRootStarted() {
        if (this.startedGroup == false) goto L5;
        return;
    L5:
        if (this.implicitRootStart == false) goto L9;
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushEnsureRootStarted();
        this.startedGroup = true;
        return;
    }

    private final void ensureGroupStarted(Anchor anchor) {
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushEnsureGroupStarted(anchor);
        this.startedGroup = true;
    }

    static /* synthetic */ void realizeOperationLocation$default(ComposerChangeListWriter r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = false;
    L5:
        r0.realizeOperationLocation(r1);
    }

    private final void realizeOperationLocation(boolean forParent) {
        SlotReader r0 = getReader();
        if (forParent == false) goto L5;
        int location = r0.getParent();
    L6:
        int distance = location - this.writersReaderDelta;
        if (distance < 0) goto L9;
        boolean value$iv = true;
    L11:
        if (value$iv == true) goto L14;
        ComposerKt.composeImmediateRuntimeError("Tried to seek backward");
    L14:
        if (distance <= 0) goto L17;
        this.changeList.pushAdvanceSlotsBy(distance);
        this.writersReaderDelta = location;
        return;
    L17:
        return;
    L9:
        value$iv = false;
        goto L11
    L5:
        location = r0.getCurrentGroup();
        goto L6
    }

    public final boolean getPastParent() {
        if ((getReader().getParent() - this.writersReaderDelta) >= 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final void withChangeList(ChangeList newChangeList, Function0<Unit> r5) {
        ChangeList previousChangeList = getChangeList();
        setChangeList(newChangeList);     // Catch: Throwable -> L6
        r5.invoke();     // Catch: Throwable -> L6
        setChangeList(previousChangeList);
        return;
    L6:
        th = move-exception;
        setChangeList(previousChangeList);
        throw th;
    }

    public final void withoutImplicitRootStart(Function0<Unit> r4) {
        boolean previousImplicitRootStart = getImplicitRootStart();
        setImplicitRootStart(false);     // Catch: Throwable -> L6
        r4.invoke();     // Catch: Throwable -> L6
        setImplicitRootStart(previousImplicitRootStart);
        return;
    L6:
        th = move-exception;
        setImplicitRootStart(previousImplicitRootStart);
        throw th;
    }

    public final void remember(RememberObserverHolder value) {
        this.changeList.pushRemember(value);
    }

    public final void rememberPausingScope(RecomposeScopeImpl scope) {
        this.changeList.pushRememberPausingScope(scope);
    }

    public final void startResumingScope(RecomposeScopeImpl scope) {
        this.changeList.pushStartResumingScope(scope);
    }

    public final void endResumingScope(RecomposeScopeImpl scope) {
        this.changeList.pushEndResumingScope(scope);
    }

    public final void updateValue(Object value, int groupSlotIndex) {
        pushSlotTableOperationPreamble(true);
        this.changeList.pushUpdateValue(value, groupSlotIndex);
    }

    public final void updateAnchoredValue(Object value, Anchor anchor, int groupSlotIndex) {
        this.changeList.pushUpdateAnchoredValue(value, anchor, groupSlotIndex);
    }

    public final void appendValue(Anchor anchor, Object value) {
        this.changeList.pushAppendValue(anchor, value);
    }

    public final void trimValues(int count) {
        if (count <= 0) goto L5;
        pushSlotEditingOperationPreamble();
        this.changeList.pushTrimValues(count);
        return;
    }

    public final void resetSlots() {
        this.changeList.pushResetSlots();
    }

    public final void updateAuxData(Object data) {
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushUpdateAuxData(data);
    }

    public final void endRoot() {
        if (this.startedGroup == false) goto L6;
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushEndCurrentGroup();
        this.startedGroup = false;
        return;
    }

    public final void endCurrentGroup() {
        int location = getReader().getParent();
        int currentStartedGroup = this.startedGroups.peekOr(-1);
        if (currentStartedGroup > location) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L10;
        ComposerKt.composeImmediateRuntimeError("Missed recording an endGroup");
    L10:
        if (this.startedGroups.peekOr(-1) != location) goto L13;
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.startedGroups.pop();
        this.changeList.pushEndCurrentGroup();
        return;
    L13:
        return;
    L5:
        value$iv = false;
        goto L7
    }

    public final void skipToEndOfCurrentGroup() {
        this.changeList.pushSkipToEndOfCurrentGroup();
    }

    public final void removeCurrentGroup() {
        pushSlotEditingOperationPreamble();
        this.changeList.pushRemoveCurrentGroup();
        this.writersReaderDelta += getReader().getGroupSize();
    }

    public final void insertSlots(Anchor anchor, SlotTable from) {
        pushPendingUpsAndDowns();
        pushSlotEditingOperationPreamble();
        realizeNodeMovementOperations();
        this.changeList.pushInsertSlots(anchor, from);
    }

    public final void insertSlots(Anchor anchor, SlotTable from, FixupList fixups) {
        pushPendingUpsAndDowns();
        pushSlotEditingOperationPreamble();
        realizeNodeMovementOperations();
        this.changeList.pushInsertSlots(anchor, from, fixups);
    }

    public final void moveCurrentGroup(int offset) {
        pushSlotEditingOperationPreamble();
        this.changeList.pushMoveCurrentGroup(offset);
    }

    public final void endCompositionScope(Function1<? super Composition, Unit> r2, Composition composition) {
        this.changeList.pushEndCompositionScope(r2, composition);
    }

    public final void useNode(Object node) {
        pushApplierOperationPreamble();
        this.changeList.pushUseNode(node);
    }

    public final <T, V> void updateNode(V r2, Function2<? super T, ? super V, Unit> r3) {
        pushApplierOperationPreamble();
        this.changeList.pushUpdateNode(r2, r3);
    }

    public final void removeNode(int nodeIndex, int count) {
        if (count <= 0) goto L14;
        if (nodeIndex < 0) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L10;
        ComposerKt.composeImmediateRuntimeError("Invalid remove index " + nodeIndex);
    L10:
        if (this.removeFrom != nodeIndex) goto L12;
        this.moveCount += count;
        return;
    L12:
        realizeNodeMovementOperations();
        this.removeFrom = nodeIndex;
        this.moveCount = count;
        return;
    L5:
        value$iv = false;
        goto L7
    }

    public final void moveNode(int from, int to, int count) {
        if (count > 0) goto L4;
        return;
    L4:
        if (this.moveCount > 0) goto L6;
    L10:
        realizeNodeMovementOperations();
        this.moveFrom = from;
        this.moveTo = to;
        this.moveCount = count;
        return;
    L6:
        if (this.moveFrom != (from - this.moveCount)) goto L10;
        if (this.moveTo != (to - this.moveCount)) goto L10;
        this.moveCount += count;
    }

    public final void releaseMovableContent() {
        pushPendingUpsAndDowns();
        if (this.startedGroup == false) goto L6;
        skipToEndOfCurrentGroup();
        endRoot();
        return;
    }

    public final void endNodeMovement() {
        realizeNodeMovementOperations();
    }

    public final void endNodeMovementAndDeleteNode(int nodeIndex, int group) {
        endNodeMovement();
        pushPendingUpsAndDowns();
        if (getReader().isNode(group) == false) goto L5;
        int nodeCount = 1;
    L6:
        if (nodeCount <= 0) goto L9;
        removeNode(nodeIndex, nodeCount);
        return;
    L9:
        return;
    L5:
        nodeCount = getReader().nodeCount(group);
        goto L6
    }

    private final void realizeNodeMovementOperations() {
        if (this.moveCount > 0) goto L5;
        return;
    L5:
        if (this.removeFrom < 0) goto L7;
        realizeRemoveNode(this.removeFrom, this.moveCount);
        this.removeFrom = -1;
    L8:
        this.moveCount = 0;
        return;
    L7:
        realizeMoveNode(this.moveTo, this.moveFrom, this.moveCount);
        this.moveFrom = -1;
        this.moveTo = -1;
        goto L8
    }

    private final void realizeRemoveNode(int removeFrom, int moveCount) {
        pushApplierOperationPreamble();
        this.changeList.pushRemoveNode(removeFrom, moveCount);
    }

    private final void realizeMoveNode(int to, int from, int count) {
        pushApplierOperationPreamble();
        this.changeList.pushMoveNode(to, from, count);
    }

    public final void moveUp() {
        realizeNodeMovementOperations();
        if (Stack.m3799isNotEmptyimpl(this.pendingDownNodes) == false) goto L5;
        Stack.m3802popimpl(this.pendingDownNodes);
        return;
    L5:
        this.pendingUps++;
    }

    public final void moveDown(Object node) {
        realizeNodeMovementOperations();
        Stack.m3803pushimpl(this.pendingDownNodes, node);
    }

    private final void pushPendingUpsAndDowns() {
        if (this.pendingUps <= 0) goto L6;
        this.changeList.pushUps(this.pendingUps);
        this.pendingUps = 0;
    L6:
        if (Stack.m3799isNotEmptyimpl(this.pendingDownNodes) == false) goto L9;
        this.changeList.pushDowns(Stack.m3804toArrayimpl(this.pendingDownNodes));
        Stack.m3791clearimpl(this.pendingDownNodes);
        return;
    }

    public final void sideEffect(Function0<Unit> r2) {
        this.changeList.pushSideEffect(r2);
    }

    public final void determineMovableContentNodeIndex(IntRef effectiveNodeIndexOut, Anchor anchor) {
        pushPendingUpsAndDowns();
        this.changeList.pushDetermineMovableContentNodeIndex(effectiveNodeIndexOut, anchor);
    }

    public final void copyNodesToNewAnchorLocation(List<? extends Object> r2, IntRef effectiveNodeIndex) {
        this.changeList.pushCopyNodesToNewAnchorLocation(r2, effectiveNodeIndex);
    }

    public final void copySlotTableToAnchorLocation(MovableContentState resolvedState, CompositionContext parentContext, MovableContentStateReference from, MovableContentStateReference to) {
        this.changeList.pushCopySlotTableToAnchorLocation(resolvedState, parentContext, from, to);
    }

    public final void releaseMovableGroupAtCurrent(ControlledComposition composition, CompositionContext parentContext, MovableContentStateReference reference) {
        this.changeList.pushReleaseMovableGroupAtCurrent(composition, parentContext, reference);
    }

    public final void endMovableContentPlacement() {
        this.changeList.pushEndMovableContentPlacement();
        this.writersReaderDelta = 0;
    }

    public static /* synthetic */ void includeOperationsIn$default(ComposerChangeListWriter r0, ChangeList r1, IntRef r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        r0.includeOperationsIn(r1, r2);
    }

    public final void includeOperationsIn(ChangeList other, IntRef effectiveNodeIndex) {
        this.changeList.pushExecuteOperationsIn(other, effectiveNodeIndex);
    }

    public final void finalizeComposition() {
        pushPendingUpsAndDowns();
        IntStack this_$iv = this.startedGroups;
        if (this_$iv.tos != 0) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L11;
        ComposerKt.composeImmediateRuntimeError("Missed recording an endGroup()");
        return;
    L11:
        return;
    L5:
        value$iv = false;
        goto L7
    }

    public final void resetTransientState() {
        this.startedGroup = false;
        this.startedGroups.clear();
        this.writersReaderDelta = 0;
    }

    public final void deactivateCurrentGroup() {
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushDeactivateCurrentGroup();
    }
}
