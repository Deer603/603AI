package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.internal.IntRef;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: compiled from: ChangeList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\"\u0010\u000b\u001a\u00020\n2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0006J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u001e\u0010\u001c\u001a\u00020\n2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001e2\u0006\u0010\u001f\u001a\u00020 J(\u0010!\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'J\u0006\u0010)\u001a\u00020\nJ\u0016\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u0019J\u001b\u0010,\u001a\u00020\n2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0-¢\u0006\u0002\u0010.J\"\u0010/\u001a\u00020\n2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\n012\u0006\u00103\u001a\u000202J\u0006\u00104\u001a\u00020\nJ\u0006\u00105\u001a\u00020\nJ\u000e\u00106\u001a\u00020\n2\u0006\u00107\u001a\u000208J\u000e\u00109\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010:\u001a\u00020\nJ\u001a\u0010;\u001a\u00020\n2\u0006\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 J\u0016\u0010=\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010&\u001a\u00020>J\u001e\u0010=\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010&\u001a\u00020>2\u0006\u0010?\u001a\u00020@J\u000e\u0010A\u001a\u00020\n2\u0006\u0010B\u001a\u00020\u0006J\u001e\u0010C\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010D\u001a\u00020\u0006J\u001e\u0010E\u001a\u00020\n2\u0006\u00103\u001a\u00020F2\u0006\u0010$\u001a\u00020%2\u0006\u0010G\u001a\u00020'J\u000e\u0010H\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020IJ\u000e\u0010J\u001a\u00020\n2\u0006\u00107\u001a\u000208J\u0006\u0010K\u001a\u00020\nJ\u0016\u0010L\u001a\u00020\n2\u0006\u0010M\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\u0006J\u0006\u0010O\u001a\u00020\nJ\u0014\u0010P\u001a\u00020\n2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\n0RJ\u0006\u0010S\u001a\u00020\nJ\u000e\u0010T\u001a\u00020\n2\u0006\u00107\u001a\u000208J\u000e\u0010U\u001a\u00020\n2\u0006\u0010D\u001a\u00020\u0006J \u0010V\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010W\u001a\u00020\u0006J\u0010\u0010X\u001a\u00020\n2\b\u0010Y\u001a\u0004\u0018\u00010\u001bJ>\u0010Z\u001a\u00020\n\"\u0004\b\u0000\u0010[\"\u0004\b\u0001\u0010\\2\u0006\u0010\u001a\u001a\u0002H\\2\u001d\u0010]\u001a\u0019\u0012\u0004\u0012\u0002H[\u0012\u0004\u0012\u0002H\\\u0012\u0004\u0012\u00020\n0^¢\u0006\u0002\b_¢\u0006\u0002\u0010`J\u0018\u0010a\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010W\u001a\u00020\u0006J\u000e\u0010b\u001a\u00020\n2\u0006\u0010D\u001a\u00020\u0006J\u0010\u0010c\u001a\u00020\n2\b\u0010d\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010e\u001a\u00020f2\u0006\u0010g\u001a\u00020fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006h"}, d2 = {"Landroidx/compose/runtime/changelist/ChangeList;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "()V", "operations", "Landroidx/compose/runtime/changelist/Operations;", "size", "", "getSize", "()I", "clear", "", "executeAndFlushAllPendingChanges", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "isEmpty", "", "isNotEmpty", "pushAdvanceSlotsBy", "distance", "pushAppendValue", "anchor", "Landroidx/compose/runtime/Anchor;", "value", "", "pushCopyNodesToNewAnchorLocation", "nodes", "", "effectiveNodeIndex", "Landroidx/compose/runtime/internal/IntRef;", "pushCopySlotTableToAnchorLocation", "resolvedState", "Landroidx/compose/runtime/MovableContentState;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", "from", "Landroidx/compose/runtime/MovableContentStateReference;", "to", "pushDeactivateCurrentGroup", "pushDetermineMovableContentNodeIndex", "effectiveNodeIndexOut", "pushDowns", "", "([Ljava/lang/Object;)V", "pushEndCompositionScope", "action", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "composition", "pushEndCurrentGroup", "pushEndMovableContentPlacement", "pushEndResumingScope", "scope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "pushEnsureGroupStarted", "pushEnsureRootStarted", "pushExecuteOperationsIn", "changeList", "pushInsertSlots", "Landroidx/compose/runtime/SlotTable;", "fixups", "Landroidx/compose/runtime/changelist/FixupList;", "pushMoveCurrentGroup", "offset", "pushMoveNode", "count", "pushReleaseMovableGroupAtCurrent", "Landroidx/compose/runtime/ControlledComposition;", "reference", "pushRemember", "Landroidx/compose/runtime/RememberObserverHolder;", "pushRememberPausingScope", "pushRemoveCurrentGroup", "pushRemoveNode", "removeFrom", "moveCount", "pushResetSlots", "pushSideEffect", "effect", "Lkotlin/Function0;", "pushSkipToEndOfCurrentGroup", "pushStartResumingScope", "pushTrimValues", "pushUpdateAnchoredValue", "groupSlotIndex", "pushUpdateAuxData", "data", "pushUpdateNode", "T", "V", "block", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "pushUpdateValue", "pushUps", "pushUseNode", "node", "toDebugString", "", "linePrefix", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ChangeList extends OperationsDebugStringFormattable {
    public static final int $stable = 0;
    private final Operations operations;

    static {
        $stable = 8;
    }

    public ChangeList() {
        this.operations = new Operations();
    }

    public final int getSize() {
        return this.operations.getSize();
    }

    public final boolean isEmpty() {
        return this.operations.isEmpty();
    }

    public final boolean isNotEmpty() {
        return this.operations.isNotEmpty();
    }

    public final void clear() {
        this.operations.clear();
    }

    public final void executeAndFlushAllPendingChanges(Applier<?> r2, SlotWriter slots, RememberManager rememberManager) {
        this.operations.executeAndFlushAllPendingOperations(r2, slots, rememberManager);
    }

    public final void pushRemember(RememberObserverHolder value) {
        Operations this_$iv = this.operations;
        Operation operation$iv = Operation.Remember.INSTANCE;
        this_$iv.pushOp(operation$iv);
        Operations $this$pushRemember_u24lambda_u240 = Operations.WriteScope.m3869constructorimpl(this_$iv);
        Operation.Remember r5 = Operation.Remember.INSTANCE;
        Operations.WriteScope.m3877setObjectDKhxnng($this$pushRemember_u24lambda_u240, Operation.ObjectParameter.m3846constructorimpl(0), value);
        this_$iv.ensureAllArgumentsPushedFor(operation$iv);
    }

    public final void pushRememberPausingScope(RecomposeScopeImpl scope) {
        Operations this_$iv = this.operations;
        Operation operation$iv = Operation.RememberPausingScope.INSTANCE;
        this_$iv.pushOp(operation$iv);
        Operations $this$pushRememberPausingScope_u24lambda_u241 = Operations.WriteScope.m3869constructorimpl(this_$iv);
        Operation.RememberPausingScope r5 = Operation.RememberPausingScope.INSTANCE;
        Operations.WriteScope.m3877setObjectDKhxnng($this$pushRememberPausingScope_u24lambda_u241, Operation.ObjectParameter.m3846constructorimpl(0), scope);
        this_$iv.ensureAllArgumentsPushedFor(operation$iv);
    }

    public final void pushStartResumingScope(RecomposeScopeImpl scope) {
        Operations this_$iv = this.operations;
        Operation operation$iv = Operation.StartResumingScope.INSTANCE;
        this_$iv.pushOp(operation$iv);
        Operations $this$pushStartResumingScope_u24lambda_u242 = Operations.WriteScope.m3869constructorimpl(this_$iv);
        Operation.StartResumingScope r5 = Operation.StartResumingScope.INSTANCE;
        Operations.WriteScope.m3877setObjectDKhxnng($this$pushStartResumingScope_u24lambda_u242, Operation.ObjectParameter.m3846constructorimpl(0), scope);
        this_$iv.ensureAllArgumentsPushedFor(operation$iv);
    }

    public final void pushEndResumingScope(RecomposeScopeImpl scope) {
        Operations this_$iv = this.operations;
        Operation operation$iv = Operation.EndResumingScope.INSTANCE;
        this_$iv.pushOp(operation$iv);
        Operations $this$pushEndResumingScope_u24lambda_u243 = Operations.WriteScope.m3869constructorimpl(this_$iv);
        Operation.EndResumingScope r5 = Operation.EndResumingScope.INSTANCE;
        Operations.WriteScope.m3877setObjectDKhxnng($this$pushEndResumingScope_u24lambda_u243, Operation.ObjectParameter.m3846constructorimpl(0), scope);
        this_$iv.ensureAllArgumentsPushedFor(operation$iv);
    }

    public final void pushUpdateValue(Object value, int groupSlotIndex) {
        Operations this_$iv = this.operations;
        Operation operation$iv = Operation.UpdateValue.INSTANCE;
        this_$iv.pushOp(operation$iv);
        Operations $this$pushUpdateValue_u24lambda_u244 = Operations.WriteScope.m3869constructorimpl(this_$iv);
        Operation.UpdateValue r6 = Operation.UpdateValue.INSTANCE;
        Operations.WriteScope.m3877setObjectDKhxnng($this$pushUpdateValue_u24lambda_u244, Operation.ObjectParameter.m3846constructorimpl(0), value);
        Operation.UpdateValue r7 = Operation.UpdateValue.INSTANCE;
        $this$pushUpdateValue_u24lambda_u244.intArgs[($this$pushUpdateValue_u24lambda_u244.intArgsSize - $this$pushUpdateValue_u24lambda_u244.opCodes[$this$pushUpdateValue_u24lambda_u244.opCodesSize - 1].getInts()) + 0] = groupSlotIndex;
        this_$iv.ensureAllArgumentsPushedFor(operation$iv);
    }

    public final void pushUpdateAnchoredValue(Object value, Anchor anchor, int groupSlotIndex) {
        Operations this_$iv = this.operations;
        Operation operation$iv = Operation.UpdateAnchoredValue.INSTANCE;
        this_$iv.pushOp(operation$iv);
        Operations $this$pushUpdateAnchoredValue_u24lambda_u245 = Operations.WriteScope.m3869constructorimpl(this_$iv);
        Operation.UpdateAnchoredValue r6 = Operation.UpdateAnchoredValue.INSTANCE;
        int r7 = Operation.ObjectParameter.m3846constructorimpl(0);
        Operation.UpdateAnchoredValue r8 = Operation.UpdateAnchoredValue.INSTANCE;
        Operations.WriteScope.m3878setObjects4uCC6AY($this$pushUpdateAnchoredValue_u24lambda_u245, r7, value, Operation.ObjectParameter.m3846constructorimpl(1), anchor);
        Operation.UpdateAnchoredValue r9 = Operation.UpdateAnchoredValue.INSTANCE;
        $this$pushUpdateAnchoredValue_u24lambda_u245.intArgs[($this$pushUpdateAnchoredValue_u24lambda_u245.intArgsSize - $this$pushUpdateAnchoredValue_u24lambda_u245.opCodes[$this$pushUpdateAnchoredValue_u24lambda_u245.opCodesSize - 1].getInts()) + 0] = groupSlotIndex;
        this_$iv.ensureAllArgumentsPushedFor(operation$iv);
    }

    public final void pushAppendValue(Anchor anchor, Object value) {
        Operations this_$iv = this.operations;
        Operation operation$iv = Operation.AppendValue.INSTANCE;
        this_$iv.pushOp(operation$iv);
        Operations $this$pushAppendValue_u24lambda_u246 = Operations.WriteScope.m3869constructorimpl(this_$iv);
        Operation.AppendValue r5 = Operation.AppendValue.INSTANCE;
        int r6 = Operation.ObjectParameter.m3846constructorimpl(0);
        Operation.AppendValue r7 = Operation.AppendValue.INSTANCE;
        Operations.WriteScope.m3878setObjects4uCC6AY($this$pushAppendValue_u24lambda_u246, r6, anchor, Operation.ObjectParameter.m3846constructorimpl(1), value);
        this_$iv.ensureAllArgumentsPushedFor(operation$iv);
    }

    public final void pushTrimValues(int count) {
        Operations this_$iv = this.operations;
        Operation operation$iv = Operation.TrimParentValues.INSTANCE;
        this_$iv.pushOp(operation$iv);
        Operations $this$pushTrimValues_u24lambda_u247 = Operations.WriteScope.m3869constructorimpl(this_$iv);
        Operation.TrimParentValues r6 = Operation.TrimParentValues.INSTANCE;
        $this$pushTrimValues_u24lambda_u247.intArgs[($this$pushTrimValues_u24lambda_u247.intArgsSize - $this$pushTrimValues_u24lambda_u247.opCodes[$this$pushTrimValues_u24lambda_u247.opCodesSize - 1].getInts()) + 0] = count;
        this_$iv.ensureAllArgumentsPushedFor(operation$iv);
    }

    public final void pushResetSlots() {
        this.operations.push(Operation.ResetSlots.INSTANCE);
    }

    public final void pushDeactivateCurrentGroup() {
        this.operations.push(Operation.DeactivateCurrentGroup.INSTANCE);
    }

    public final void pushUpdateAuxData(Object data) {
        Operations this_$iv = this.operations;
        Operation operation$iv = Operation.UpdateAuxData.INSTANCE;
        this_$iv.pushOp(operation$iv);
        Operations $this$pushUpdateAuxData_u24lambda_u248 = Operations.WriteScope.m3869constructorimpl(this_$iv);
        Operation.UpdateAuxData r5 = Operation.UpdateAuxData.INSTANCE;
        Operations.WriteScope.m3877setObjectDKhxnng($this$pushUpdateAuxData_u24lambda_u248, Operation.ObjectParameter.m3846constructorimpl(0), data);
        this_$iv.ensureAllArgumentsPushedFor(operation$iv);
    }

    public final void pushEnsureRootStarted() {
        this.operations.push(Operation.EnsureRootGroupStarted.INSTANCE);
    }

    public final void pushEnsureGroupStarted(Anchor anchor) {
        Operations this_$iv = this.operations;
        Operation operation$iv = Operation.EnsureGroupStarted.INSTANCE;
        this_$iv.pushOp(operation$iv);
        Operations $this$pushEnsureGroupStarted_u24lambda_u249 = Operations.WriteScope.m3869constructorimpl(this_$iv);
        Operation.EnsureGroupStarted r5 = Operation.EnsureGroupStarted.INSTANCE;
        Operations.WriteScope.m3877setObjectDKhxnng($this$pushEnsureGroupStarted_u24lambda_u249, Operation.ObjectParameter.m3846constructorimpl(0), anchor);
        this_$iv.ensureAllArgumentsPushedFor(operation$iv);
    }

    public final void pushEndCurrentGroup() {
        this.operations.push(Operation.EndCurrentGroup.INSTANCE);
    }

    public final void pushSkipToEndOfCurrentGroup() {
        this.operations.push(Operation.SkipToEndOfCurrentGroup.INSTANCE);
    }

    public final void pushRemoveCurrentGroup() {
        this.operations.push(Operation.RemoveCurrentGroup.INSTANCE);
    }

    public final void pushInsertSlots(Anchor anchor, SlotTable from) {
        Operations this_$iv = this.operations;
        Operation operation$iv = Operation.InsertSlots.INSTANCE;
        this_$iv.pushOp(operation$iv);
        Operations $this$pushInsertSlots_u24lambda_u2410 = Operations.WriteScope.m3869constructorimpl(this_$iv);
        Operation.InsertSlots r5 = Operation.InsertSlots.INSTANCE;
        int r6 = Operation.ObjectParameter.m3846constructorimpl(0);
        Operation.InsertSlots r7 = Operation.InsertSlots.INSTANCE;
        Operations.WriteScope.m3878setObjects4uCC6AY($this$pushInsertSlots_u24lambda_u2410, r6, anchor, Operation.ObjectParameter.m3846constructorimpl(1), from);
        this_$iv.ensureAllArgumentsPushedFor(operation$iv);
    }

    public final void pushInsertSlots(Anchor anchor, SlotTable from, FixupList fixups) {
        Operations this_$iv = this.operations;
        Operation operation$iv = Operation.InsertSlotsWithFixups.INSTANCE;
        this_$iv.pushOp(operation$iv);
        Operations $this$pushInsertSlots_u24lambda_u2411 = Operations.WriteScope.m3869constructorimpl(this_$iv);
        Operation.InsertSlotsWithFixups r4 = Operation.InsertSlotsWithFixups.INSTANCE;
        int r5 = Operation.ObjectParameter.m3846constructorimpl(0);
        Operation.InsertSlotsWithFixups r6 = Operation.InsertSlotsWithFixups.INSTANCE;
        int r7 = Operation.ObjectParameter.m3846constructorimpl(1);
        Operation.InsertSlotsWithFixups r8 = Operation.InsertSlotsWithFixups.INSTANCE;
        Operations.WriteScope.m3880setObjectst7hvbck($this$pushInsertSlots_u24lambda_u2411, r5, anchor, r7, from, Operation.ObjectParameter.m3846constructorimpl(2), fixups);
        this_$iv.ensureAllArgumentsPushedFor(operation$iv);
    }

    public final void pushMoveCurrentGroup(int offset) {
        Operations this_$iv = this.operations;
        Operation operation$iv = Operation.MoveCurrentGroup.INSTANCE;
        this_$iv.pushOp(operation$iv);
        Operations $this$pushMoveCurrentGroup_u24lambda_u2412 = Operations.WriteScope.m3869constructorimpl(this_$iv);
        Operation.MoveCurrentGroup r6 = Operation.MoveCurrentGroup.INSTANCE;
        $this$pushMoveCurrentGroup_u24lambda_u2412.intArgs[($this$pushMoveCurrentGroup_u24lambda_u2412.intArgsSize - $this$pushMoveCurrentGroup_u24lambda_u2412.opCodes[$this$pushMoveCurrentGroup_u24lambda_u2412.opCodesSize - 1].getInts()) + 0] = offset;
        this_$iv.ensureAllArgumentsPushedFor(operation$iv);
    }

    public final void pushEndCompositionScope(Function1<? super Composition, Unit> r10, Composition composition) {
        Operations this_$iv = this.operations;
        Operation operation$iv = Operation.EndCompositionScope.INSTANCE;
        this_$iv.pushOp(operation$iv);
        Operations $this$pushEndCompositionScope_u24lambda_u2413 = Operations.WriteScope.m3869constructorimpl(this_$iv);
        Operation.EndCompositionScope r5 = Operation.EndCompositionScope.INSTANCE;
        int r6 = Operation.ObjectParameter.m3846constructorimpl(0);
        Operation.EndCompositionScope r7 = Operation.EndCompositionScope.INSTANCE;
        Operations.WriteScope.m3878setObjects4uCC6AY($this$pushEndCompositionScope_u24lambda_u2413, r6, r10, Operation.ObjectParameter.m3846constructorimpl(1), composition);
        this_$iv.ensureAllArgumentsPushedFor(operation$iv);
    }

    public final void pushUseNode(Object node) {
        if ((node instanceof ComposeNodeLifecycleCallback) == false) goto L6;
        this.operations.push(Operation.UseCurrentNode.INSTANCE);
        return;
    }

    public final <T, V> void pushUpdateNode(V r10, Function2<? super T, ? super V, Unit> r11) {
        Operations this_$iv = this.operations;
        Operation operation$iv = Operation.UpdateNode.INSTANCE;
        this_$iv.pushOp(operation$iv);
        Operations $this$pushUpdateNode_u24lambda_u2414 = Operations.WriteScope.m3869constructorimpl(this_$iv);
        Operation.UpdateNode r5 = Operation.UpdateNode.INSTANCE;
        int r6 = Operation.ObjectParameter.m3846constructorimpl(0);
        Operation.UpdateNode r7 = Operation.UpdateNode.INSTANCE;
        int r8 = Operation.ObjectParameter.m3846constructorimpl(1);
        Intrinsics.checkNotNull(r11, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        Operations.WriteScope.m3878setObjects4uCC6AY($this$pushUpdateNode_u24lambda_u2414, r6, r10, r8, (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r11, 2));
        this_$iv.ensureAllArgumentsPushedFor(operation$iv);
    }

    public final void pushRemoveNode(int removeFrom, int moveCount) {
        Operations this_$iv = this.operations;
        Operation operation$iv = Operation.RemoveNode.INSTANCE;
        this_$iv.pushOp(operation$iv);
        Operations $this$pushRemoveNode_u24lambda_u2415 = Operations.WriteScope.m3869constructorimpl(this_$iv);
        Operation.RemoveNode r6 = Operation.RemoveNode.INSTANCE;
        Operation.RemoveNode this_$iv2 = Operation.RemoveNode.INSTANCE;
        int base$iv = $this$pushRemoveNode_u24lambda_u2415.intArgsSize - $this$pushRemoveNode_u24lambda_u2415.opCodes[$this$pushRemoveNode_u24lambda_u2415.opCodesSize - 1].getInts();
        int[] intArgs$iv = $this$pushRemoveNode_u24lambda_u2415.intArgs;
        intArgs$iv[base$iv + 0] = removeFrom;
        intArgs$iv[base$iv + 1] = moveCount;
        this_$iv.ensureAllArgumentsPushedFor(operation$iv);
    }

    public final void pushMoveNode(int to, int from, int count) {
        Operations this_$iv = this.operations;
        Operation operation$iv = Operation.MoveNode.INSTANCE;
        this_$iv.pushOp(operation$iv);
        Operations $this$pushMoveNode_u24lambda_u2416 = Operations.WriteScope.m3869constructorimpl(this_$iv);
        Operation.MoveNode r6 = Operation.MoveNode.INSTANCE;
        Operation.MoveNode this_$iv2 = Operation.MoveNode.INSTANCE;
        Operation.MoveNode this_$iv3 = Operation.MoveNode.INSTANCE;
        int base$iv = $this$pushMoveNode_u24lambda_u2416.intArgsSize - $this$pushMoveNode_u24lambda_u2416.opCodes[$this$pushMoveNode_u24lambda_u2416.opCodesSize - 1].getInts();
        int[] intArgs$iv = $this$pushMoveNode_u24lambda_u2416.intArgs;
        intArgs$iv[base$iv + 1] = to;
        intArgs$iv[base$iv + 0] = from;
        intArgs$iv[base$iv + 2] = count;
        this_$iv.ensureAllArgumentsPushedFor(operation$iv);
    }

    public final void pushAdvanceSlotsBy(int distance) {
        Operations this_$iv = this.operations;
        Operation operation$iv = Operation.AdvanceSlotsBy.INSTANCE;
        this_$iv.pushOp(operation$iv);
        Operations $this$pushAdvanceSlotsBy_u24lambda_u2417 = Operations.WriteScope.m3869constructorimpl(this_$iv);
        Operation.AdvanceSlotsBy r6 = Operation.AdvanceSlotsBy.INSTANCE;
        $this$pushAdvanceSlotsBy_u24lambda_u2417.intArgs[($this$pushAdvanceSlotsBy_u24lambda_u2417.intArgsSize - $this$pushAdvanceSlotsBy_u24lambda_u2417.opCodes[$this$pushAdvanceSlotsBy_u24lambda_u2417.opCodesSize - 1].getInts()) + 0] = distance;
        this_$iv.ensureAllArgumentsPushedFor(operation$iv);
    }

    public final void pushUps(int count) {
        Operations this_$iv = this.operations;
        Operation operation$iv = Operation.Ups.INSTANCE;
        this_$iv.pushOp(operation$iv);
        Operations $this$pushUps_u24lambda_u2418 = Operations.WriteScope.m3869constructorimpl(this_$iv);
        Operation.Ups r6 = Operation.Ups.INSTANCE;
        $this$pushUps_u24lambda_u2418.intArgs[($this$pushUps_u24lambda_u2418.intArgsSize - $this$pushUps_u24lambda_u2418.opCodes[$this$pushUps_u24lambda_u2418.opCodesSize - 1].getInts()) + 0] = count;
        this_$iv.ensureAllArgumentsPushedFor(operation$iv);
    }

    public final void pushDowns(Object[] nodes) {
        if (nodes.length != 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L9;
        Operations this_$iv = this.operations;
        Operation operation$iv = Operation.Downs.INSTANCE;
        this_$iv.pushOp(operation$iv);
        Operations $this$pushDowns_u24lambda_u2419 = Operations.WriteScope.m3869constructorimpl(this_$iv);
        Operation.Downs r6 = Operation.Downs.INSTANCE;
        Operations.WriteScope.m3877setObjectDKhxnng($this$pushDowns_u24lambda_u2419, Operation.ObjectParameter.m3846constructorimpl(0), nodes);
        this_$iv.ensureAllArgumentsPushedFor(operation$iv);
        return;
    L9:
        return;
    L5:
        r0 = false;
        goto L6
    }

    public final void pushSideEffect(Function0<Unit> r9) {
        Operations this_$iv = this.operations;
        Operation operation$iv = Operation.SideEffect.INSTANCE;
        this_$iv.pushOp(operation$iv);
        Operations $this$pushSideEffect_u24lambda_u2420 = Operations.WriteScope.m3869constructorimpl(this_$iv);
        Operation.SideEffect r5 = Operation.SideEffect.INSTANCE;
        Operations.WriteScope.m3877setObjectDKhxnng($this$pushSideEffect_u24lambda_u2420, Operation.ObjectParameter.m3846constructorimpl(0), r9);
        this_$iv.ensureAllArgumentsPushedFor(operation$iv);
    }

    public final void pushDetermineMovableContentNodeIndex(IntRef effectiveNodeIndexOut, Anchor anchor) {
        Operations this_$iv = this.operations;
        Operation operation$iv = Operation.DetermineMovableContentNodeIndex.INSTANCE;
        this_$iv.pushOp(operation$iv);
        Operations $this$pushDetermineMovableContentNodeIndex_u24lambda_u2421 = Operations.WriteScope.m3869constructorimpl(this_$iv);
        Operation.DetermineMovableContentNodeIndex r5 = Operation.DetermineMovableContentNodeIndex.INSTANCE;
        int r6 = Operation.ObjectParameter.m3846constructorimpl(0);
        Operation.DetermineMovableContentNodeIndex r7 = Operation.DetermineMovableContentNodeIndex.INSTANCE;
        Operations.WriteScope.m3878setObjects4uCC6AY($this$pushDetermineMovableContentNodeIndex_u24lambda_u2421, r6, effectiveNodeIndexOut, Operation.ObjectParameter.m3846constructorimpl(1), anchor);
        this_$iv.ensureAllArgumentsPushedFor(operation$iv);
    }

    public final void pushCopyNodesToNewAnchorLocation(List<? extends Object> r10, IntRef effectiveNodeIndex) {
        if (r10.isEmpty() == true) goto L6;
        Operations this_$iv = this.operations;
        Operation operation$iv = Operation.CopyNodesToNewAnchorLocation.INSTANCE;
        this_$iv.pushOp(operation$iv);
        Operations $this$pushCopyNodesToNewAnchorLocation_u24lambda_u2422 = Operations.WriteScope.m3869constructorimpl(this_$iv);
        Operation.CopyNodesToNewAnchorLocation r5 = Operation.CopyNodesToNewAnchorLocation.INSTANCE;
        int r6 = Operation.ObjectParameter.m3846constructorimpl(1);
        Operation.CopyNodesToNewAnchorLocation r7 = Operation.CopyNodesToNewAnchorLocation.INSTANCE;
        Operations.WriteScope.m3878setObjects4uCC6AY($this$pushCopyNodesToNewAnchorLocation_u24lambda_u2422, r6, r10, Operation.ObjectParameter.m3846constructorimpl(0), effectiveNodeIndex);
        this_$iv.ensureAllArgumentsPushedFor(operation$iv);
        return;
    }

    public final void pushCopySlotTableToAnchorLocation(MovableContentState resolvedState, CompositionContext parentContext, MovableContentStateReference from, MovableContentStateReference to) {
        Operations this_$iv = this.operations;
        Operation operation$iv = Operation.CopySlotTableToAnchorLocation.INSTANCE;
        this_$iv.pushOp(operation$iv);
        Operations $this$pushCopySlotTableToAnchorLocation_u24lambda_u2423 = Operations.WriteScope.m3869constructorimpl(this_$iv);
        Operation.CopySlotTableToAnchorLocation r4 = Operation.CopySlotTableToAnchorLocation.INSTANCE;
        int r5 = Operation.ObjectParameter.m3846constructorimpl(0);
        Operation.CopySlotTableToAnchorLocation r6 = Operation.CopySlotTableToAnchorLocation.INSTANCE;
        int r7 = Operation.ObjectParameter.m3846constructorimpl(1);
        Operation.CopySlotTableToAnchorLocation r8 = Operation.CopySlotTableToAnchorLocation.INSTANCE;
        int r9 = Operation.ObjectParameter.m3846constructorimpl(3);
        Operation.CopySlotTableToAnchorLocation r10 = Operation.CopySlotTableToAnchorLocation.INSTANCE;
        Operations.WriteScope.m3879setObjectsOGa0p1M($this$pushCopySlotTableToAnchorLocation_u24lambda_u2423, r5, resolvedState, r7, parentContext, r9, to, Operation.ObjectParameter.m3846constructorimpl(2), from);
        this_$iv.ensureAllArgumentsPushedFor(operation$iv);
    }

    public final void pushReleaseMovableGroupAtCurrent(ControlledComposition composition, CompositionContext parentContext, MovableContentStateReference reference) {
        Operations this_$iv = this.operations;
        Operation operation$iv = Operation.ReleaseMovableGroupAtCurrent.INSTANCE;
        this_$iv.pushOp(operation$iv);
        Operations $this$pushReleaseMovableGroupAtCurrent_u24lambda_u2424 = Operations.WriteScope.m3869constructorimpl(this_$iv);
        Operation.ReleaseMovableGroupAtCurrent r4 = Operation.ReleaseMovableGroupAtCurrent.INSTANCE;
        int r5 = Operation.ObjectParameter.m3846constructorimpl(0);
        Operation.ReleaseMovableGroupAtCurrent r6 = Operation.ReleaseMovableGroupAtCurrent.INSTANCE;
        int r7 = Operation.ObjectParameter.m3846constructorimpl(1);
        Operation.ReleaseMovableGroupAtCurrent r8 = Operation.ReleaseMovableGroupAtCurrent.INSTANCE;
        Operations.WriteScope.m3880setObjectst7hvbck($this$pushReleaseMovableGroupAtCurrent_u24lambda_u2424, r5, composition, r7, parentContext, Operation.ObjectParameter.m3846constructorimpl(2), reference);
        this_$iv.ensureAllArgumentsPushedFor(operation$iv);
    }

    public final void pushEndMovableContentPlacement() {
        this.operations.push(Operation.EndMovableContentPlacement.INSTANCE);
    }

    public static /* synthetic */ void pushExecuteOperationsIn$default(ChangeList r0, ChangeList r1, IntRef r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        r0.pushExecuteOperationsIn(r1, r2);
    }

    public final void pushExecuteOperationsIn(ChangeList changeList, IntRef effectiveNodeIndex) {
        if (changeList.isNotEmpty() == false) goto L6;
        Operations this_$iv = this.operations;
        Operation operation$iv = Operation.ApplyChangeList.INSTANCE;
        this_$iv.pushOp(operation$iv);
        Operations $this$pushExecuteOperationsIn_u24lambda_u2425 = Operations.WriteScope.m3869constructorimpl(this_$iv);
        Operation.ApplyChangeList r5 = Operation.ApplyChangeList.INSTANCE;
        int r6 = Operation.ObjectParameter.m3846constructorimpl(0);
        Operation.ApplyChangeList r7 = Operation.ApplyChangeList.INSTANCE;
        Operations.WriteScope.m3878setObjects4uCC6AY($this$pushExecuteOperationsIn_u24lambda_u2425, r6, changeList, Operation.ObjectParameter.m3846constructorimpl(1), effectiveNodeIndex);
        this_$iv.ensureAllArgumentsPushedFor(operation$iv);
        return;
    }

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    public String toDebugString(String linePrefix) {
        StringBuilder $this$toDebugString_u24lambda_u2426 = new StringBuilder();
        $this$toDebugString_u24lambda_u2426.append("ChangeList instance containing ");
        $this$toDebugString_u24lambda_u2426.append(getSize());
        $this$toDebugString_u24lambda_u2426.append(" operations");
        if ($this$toDebugString_u24lambda_u2426.length() <= 0) goto L5;
        boolean r3 = true;
    L6:
        if (r3 == false) goto L8;
        $this$toDebugString_u24lambda_u2426.append(":\n");
        $this$toDebugString_u24lambda_u2426.append(this.operations.toDebugString(linePrefix));
    L8:
        String r0 = $this$toDebugString_u24lambda_u2426.toString();
        Intrinsics.checkNotNullExpressionValue(r0, "toString(...)");
        return r0;
    L5:
        r3 = false;
        goto L6
    }
}
