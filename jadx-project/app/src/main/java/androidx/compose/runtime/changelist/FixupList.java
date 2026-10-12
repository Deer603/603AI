package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: compiled from: FixupList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ&\u0010\f\u001a\u00020\u000b2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u000bJ\"\u0010\u0014\u001a\u00020\u000b2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001cJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0016J>\u0010!\u001a\u00020\u000b\"\u0004\b\u0000\u0010\"\"\u0004\b\u0001\u0010#2\u0006\u0010$\u001a\u0002H\"2\u001d\u0010%\u001a\u0019\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H\"\u0012\u0004\u0012\u00020\u000b0&¢\u0006\u0002\b'¢\u0006\u0002\u0010(R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006)"}, d2 = {"Landroidx/compose/runtime/changelist/FixupList;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "()V", "operations", "Landroidx/compose/runtime/changelist/Operations;", "pendingOperations", "size", "", "getSize", "()I", "clear", "", "createAndInsertNode", "factory", "Lkotlin/Function0;", "", "insertIndex", "groupAnchor", "Landroidx/compose/runtime/Anchor;", "endNodeInsert", "executeAndFlushAllPendingFixups", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "isEmpty", "", "isNotEmpty", "toDebugString", "", "linePrefix", "updateNode", "V", "T", "value", "block", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FixupList extends OperationsDebugStringFormattable {
    public static final int $stable = 0;
    private final Operations operations;
    private final Operations pendingOperations;

    static {
        $stable = 8;
    }

    public FixupList() {
        this.operations = new Operations();
        this.pendingOperations = new Operations();
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
        this.pendingOperations.clear();
        this.operations.clear();
    }

    public final void executeAndFlushAllPendingFixups(Applier<?> r4, SlotWriter slots, RememberManager rememberManager) {
        boolean value$iv = this.pendingOperations.isEmpty();
        if (value$iv == true) goto L5;
        ComposerKt.composeImmediateRuntimeError("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
    L5:
        this.operations.executeAndFlushAllPendingOperations(r4, slots, rememberManager);
    }

    public final void createAndInsertNode(Function0<? extends Object> r23, int insertIndex, Anchor groupAnchor) {
        Operations this_$iv = this.operations;
        Operation operation$iv = Operation.InsertNodeFixup.INSTANCE;
        this_$iv.pushOp(operation$iv);
        Operations $this$createAndInsertNode_u24lambda_u241 = Operations.WriteScope.m3869constructorimpl(this_$iv);
        Operation.InsertNodeFixup r7 = Operation.InsertNodeFixup.INSTANCE;
        Operations.WriteScope.m3877setObjectDKhxnng($this$createAndInsertNode_u24lambda_u241, Operation.ObjectParameter.m3846constructorimpl(0), r23);
        Operation.InsertNodeFixup r8 = Operation.InsertNodeFixup.INSTANCE;
        $this$createAndInsertNode_u24lambda_u241.intArgs[($this$createAndInsertNode_u24lambda_u241.intArgsSize - $this$createAndInsertNode_u24lambda_u241.opCodes[$this$createAndInsertNode_u24lambda_u241.opCodesSize - 1].getInts()) + 0] = insertIndex;
        Operation.InsertNodeFixup r4 = Operation.InsertNodeFixup.INSTANCE;
        Operations.WriteScope.m3877setObjectDKhxnng($this$createAndInsertNode_u24lambda_u241, Operation.ObjectParameter.m3846constructorimpl(1), groupAnchor);
        this_$iv.ensureAllArgumentsPushedFor(operation$iv);
        Operations this_$iv2 = this.pendingOperations;
        Operation operation$iv2 = Operation.PostInsertNodeFixup.INSTANCE;
        this_$iv2.pushOp(operation$iv2);
        Operations $this$createAndInsertNode_u24lambda_u242 = Operations.WriteScope.m3869constructorimpl(this_$iv2);
        Operation.PostInsertNodeFixup r9 = Operation.PostInsertNodeFixup.INSTANCE;
        $this$createAndInsertNode_u24lambda_u242.intArgs[($this$createAndInsertNode_u24lambda_u242.intArgsSize - $this$createAndInsertNode_u24lambda_u242.opCodes[$this$createAndInsertNode_u24lambda_u242.opCodesSize - 1].getInts()) + 0] = insertIndex;
        Operation.PostInsertNodeFixup r0 = Operation.PostInsertNodeFixup.INSTANCE;
        Operations.WriteScope.m3877setObjectDKhxnng($this$createAndInsertNode_u24lambda_u242, Operation.ObjectParameter.m3846constructorimpl(0), groupAnchor);
        this_$iv2.ensureAllArgumentsPushedFor(operation$iv2);
    }

    public final void endNodeInsert() {
        boolean value$iv = this.pendingOperations.isNotEmpty();
        if (value$iv == true) goto L5;
        ComposerKt.composeImmediateRuntimeError("Cannot end node insertion, there are no pending operations that can be realized.");
    L5:
        this.pendingOperations.popInto(this.operations);
    }

    public final <V, T> void updateNode(V r9, Function2<? super T, ? super V, Unit> r10) {
        Operations this_$iv = this.operations;
        Operation operation$iv = Operation.UpdateNode.INSTANCE;
        this_$iv.pushOp(operation$iv);
        Operations $this$updateNode_u24lambda_u244 = Operations.WriteScope.m3869constructorimpl(this_$iv);
        Operation.UpdateNode r5 = Operation.UpdateNode.INSTANCE;
        Operations.WriteScope.m3877setObjectDKhxnng($this$updateNode_u24lambda_u244, Operation.ObjectParameter.m3846constructorimpl(0), r9);
        Operation.UpdateNode r6 = Operation.UpdateNode.INSTANCE;
        int r7 = Operation.ObjectParameter.m3846constructorimpl(1);
        Intrinsics.checkNotNull(r10, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        Operations.WriteScope.m3877setObjectDKhxnng($this$updateNode_u24lambda_u244, r7, (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r10, 2));
        this_$iv.ensureAllArgumentsPushedFor(operation$iv);
    }

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    public String toDebugString(String linePrefix) {
        StringBuilder $this$toDebugString_u24lambda_u245 = new StringBuilder();
        $this$toDebugString_u24lambda_u245.append("FixupList instance containing " + getSize() + " operations");
        if ($this$toDebugString_u24lambda_u245.length() <= 0) goto L5;
        boolean r3 = true;
    L6:
        if (r3 == false) goto L8;
        $this$toDebugString_u24lambda_u245.append(":\n" + this.operations.toDebugString(linePrefix));
    L8:
        String r0 = $this$toDebugString_u24lambda_u245.toString();
        Intrinsics.checkNotNullExpressionValue(r0, "toString(...)");
        return r0;
    L5:
        r3 = false;
        goto L6
    }
}
