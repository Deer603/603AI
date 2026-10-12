package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: Operations.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u001c\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002PQB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0016\u001a\u00020\u0017J\u0011\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0082\bJ\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0002J&\u0010\u001d\u001a\u00020\u00172\u001b\u0010\u001e\u001a\u0017\u0012\b\u0012\u00060 R\u00020\u0000\u0012\u0004\u0012\u00020\u00170\u001f¢\u0006\u0002\b!H\u0086\bJ\u000e\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\rJ\u0011\u0010$\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0006H\u0082\bJ\u0011\u0010%\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0006H\u0082\bJ\u0010\u0010&\u001a\u00020'2\u0006\u0010#\u001a\u00020\rH\u0002J\u0010\u0010(\u001a\u00020'2\u0006\u0010#\u001a\u00020\rH\u0002J\"\u0010)\u001a\u00020\u00172\n\u0010*\u001a\u0006\u0012\u0002\b\u00030+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/J&\u00100\u001a\u00020\u00172\u001b\u00101\u001a\u0017\u0012\b\u0012\u00060 R\u00020\u0000\u0012\u0004\u0012\u00020\u00170\u001f¢\u0006\u0002\b!H\u0086\bJ\u0006\u00102\u001a\u000203J\u0006\u00104\u001a\u000203J\t\u00105\u001a\u00020\rH\u0082\bJ\u0006\u00106\u001a\u00020\u0017J\u000e\u00107\u001a\u00020\u00172\u0006\u00108\u001a\u00020\u0000J\u000e\u00109\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\rJ7\u00109\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\r2\u0017\u0010:\u001a\u0013\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u00170\u001f¢\u0006\u0002\b!H\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001J\u0010\u0010<\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\rH\u0007J\u0018\u0010=\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0002J\u0018\u0010>\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0002J\b\u0010?\u001a\u00020\u0017H\u0002J\u0010\u0010@\u001a\u00020'2\u0006\u0010A\u001a\u00020'H\u0016J\b\u0010B\u001a\u00020'H\u0017J\u0015\u0010C\u001a\u00020\u00062\n\u0010D\u001a\u00060\u0006j\u0002`EH\u0082\bJ\u001f\u0010F\u001a\u00020\u00062\n\u0010D\u001a\u0006\u0012\u0002\b\u00030GH\u0082\bø\u0001\u0000¢\u0006\u0004\bH\u0010IJ\u0018\u0010J\u001a\u00020'*\u00060 R\u00020\u00002\u0006\u0010A\u001a\u00020'H\u0002J\u0016\u0010K\u001a\u00020'*\u0004\u0018\u00010\t2\u0006\u0010A\u001a\u00020'H\u0002J\f\u0010L\u001a\u00020'*\u00020'H\u0002J \u0010M\u001a\u00020'\"\u0004\b\u0000\u0010N*\b\u0012\u0004\u0012\u0002HN0O2\u0006\u0010A\u001a\u00020'H\u0002R\u0012\u0010\u0003\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0000@\u0000X\u0081\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0012\u0010\u000b\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b8\u0000@\u0000X\u0081\u000e¢\u0006\n\n\u0002\u0010\u000f\u0012\u0004\b\u000e\u0010\u0002R\u0012\u0010\u0010\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006R"}, d2 = {"Landroidx/compose/runtime/changelist/Operations;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "()V", "intArgs", "", "intArgsSize", "", "objectArgs", "", "", "[Ljava/lang/Object;", "objectArgsSize", "opCodes", "Landroidx/compose/runtime/changelist/Operation;", "getOpCodes$runtime_release$annotations", "[Landroidx/compose/runtime/changelist/Operation;", "opCodesSize", "pushedIntMask", "pushedObjectMask", "size", "getSize", "()I", "clear", "", "createExpectedArgMask", "paramCount", "determineNewSize", "currentSize", "requiredSize", "drain", "sink", "Lkotlin/Function1;", "Landroidx/compose/runtime/changelist/Operations$OpIterator;", "Lkotlin/ExtensionFunctionType;", "ensureAllArgumentsPushedFor", "operation", "ensureIntArgsSizeAtLeast", "ensureObjectArgsSizeAtLeast", "exceptionMessageForOperationPushNoScope", "", "exceptionMessageForOperationPushWithScope", "executeAndFlushAllPendingOperations", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "forEach", "action", "isEmpty", "", "isNotEmpty", "peekOperation", "pop", "popInto", "other", "push", "args", "Landroidx/compose/runtime/changelist/Operations$WriteScope;", "pushOp", "resizeIntArgs", "resizeObjectArgs", "resizeOpCodes", "toDebugString", "linePrefix", "toString", "topIntIndexOf", "parameter", "Landroidx/compose/runtime/changelist/IntParameter;", "topObjectIndexOf", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "topObjectIndexOf-31yXWZQ", "(I)I", "currentOpToDebugString", "formatOpArgumentToString", "indent", "toCollectionString", "T", "", "OpIterator", "WriteScope", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Operations extends OperationsDebugStringFormattable {
    public static final int $stable = 0;
    public int[] intArgs;
    public int intArgsSize;
    public Object[] objectArgs;
    public int objectArgsSize;
    public Operation[] opCodes;
    public int opCodesSize;
    private int pushedIntMask;
    private int pushedObjectMask;

    /* JADX INFO: compiled from: Operations.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\r\u001a\u00020\u00042\n\u0010\u000e\u001a\u00060\u0004j\u0002`\u000fH\u0016J&\u0010\u0010\u001a\u0002H\u0011\"\u0004\b\u0000\u0010\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/changelist/Operations$OpIterator;", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "(Landroidx/compose/runtime/changelist/Operations;)V", "intIdx", "", "objIdx", "opIdx", "operation", "Landroidx/compose/runtime/changelist/Operation;", "getOperation", "()Landroidx/compose/runtime/changelist/Operation;", "currentOperationDebugString", "", "getInt", "parameter", "Landroidx/compose/runtime/changelist/IntParameter;", "getObject", "T", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "getObject-31yXWZQ", "(I)Ljava/lang/Object;", "next", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class OpIterator implements OperationArgContainer {
        private int intIdx;
        private int objIdx;
        private int opIdx;
        final /* synthetic */ Operations this$0;

        public OpIterator(Operations this$0) {
            this.this$0 = this$0;
        }

        public final boolean next() {
            if (this.opIdx < this.this$0.opCodesSize) goto L5;
            return false;
        L5:
            Operation op = getOperation();
            this.intIdx += op.getInts();
            this.objIdx += op.getObjects();
            this.opIdx++;
            if (this.opIdx < this.this$0.opCodesSize) goto L8;
            return false;
        L8:
            return true;
        }

        public final Operation getOperation() {
            return this.this$0.opCodes[this.opIdx];
        }

        @Override // androidx.compose.runtime.changelist.OperationArgContainer
        public int getInt(int parameter) {
            return this.this$0.intArgs[this.intIdx + parameter];
        }

        @Override // androidx.compose.runtime.changelist.OperationArgContainer
        /* JADX INFO: renamed from: getObject-31yXWZQ */
        public <T> T mo3866getObject31yXWZQ(int r3) {
            return (T) this.this$0.objectArgs[this.objIdx + r3];
        }

        public final String currentOperationDebugString() {
            Operations r0 = this.this$0;
            StringBuilder $this$currentOperationDebugString_u24lambda_u240 = new StringBuilder();
            $this$currentOperationDebugString_u24lambda_u240.append("operation[");
            $this$currentOperationDebugString_u24lambda_u240.append(this.opIdx);
            $this$currentOperationDebugString_u24lambda_u240.append("] = ");
            $this$currentOperationDebugString_u24lambda_u240.append(Operations.access$currentOpToDebugString(r0, this, ""));
            String r1 = $this$currentOperationDebugString_u24lambda_u240.toString();
            Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
            return r1;
        }
    }

    /* JADX INFO: compiled from: Operations.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u0010j\u0002`\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0086\b¢\u0006\u0004\b\u0018\u0010\u0019J8\u0010\u001a\u001a\u00020\u00142\n\u0010\u001b\u001a\u00060\u0010j\u0002`\u00162\u0006\u0010\u001c\u001a\u00020\u00102\n\u0010\u001d\u001a\u00060\u0010j\u0002`\u00162\u0006\u0010\u001e\u001a\u00020\u0010H\u0086\b¢\u0006\u0004\b\u001f\u0010 JL\u0010\u001a\u001a\u00020\u00142\n\u0010\u001b\u001a\u00060\u0010j\u0002`\u00162\u0006\u0010\u001c\u001a\u00020\u00102\n\u0010\u001d\u001a\u00060\u0010j\u0002`\u00162\u0006\u0010\u001e\u001a\u00020\u00102\n\u0010!\u001a\u00060\u0010j\u0002`\u00162\u0006\u0010\"\u001a\u00020\u0010H\u0086\b¢\u0006\u0004\b\u001f\u0010#J,\u0010$\u001a\u00020\u0014\"\u0004\b\u0000\u0010%2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H%0&2\u0006\u0010\u0017\u001a\u0002H%ø\u0001\u0000¢\u0006\u0004\b'\u0010(JH\u0010)\u001a\u00020\u0014\"\u0004\b\u0000\u0010%\"\u0004\b\u0001\u0010*2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H%0&2\u0006\u0010\u001c\u001a\u0002H%2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H*0&2\u0006\u0010\u001e\u001a\u0002H*ø\u0001\u0000¢\u0006\u0004\b+\u0010,Jd\u0010)\u001a\u00020\u0014\"\u0004\b\u0000\u0010%\"\u0004\b\u0001\u0010*\"\u0004\b\u0002\u0010-2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H%0&2\u0006\u0010\u001c\u001a\u0002H%2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H*0&2\u0006\u0010\u001e\u001a\u0002H*2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H-0&2\u0006\u0010\"\u001a\u0002H-ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0080\u0001\u0010)\u001a\u00020\u0014\"\u0004\b\u0000\u0010%\"\u0004\b\u0001\u0010*\"\u0004\b\u0002\u0010-\"\u0004\b\u0003\u001002\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H%0&2\u0006\u0010\u001c\u001a\u0002H%2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H*0&2\u0006\u0010\u001e\u001a\u0002H*2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H-0&2\u0006\u0010\"\u001a\u0002H-2\f\u00101\u001a\b\u0012\u0004\u0012\u0002H00&2\u0006\u00102\u001a\u0002H0ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u000206HÖ\u0001¢\u0006\u0004\b7\u00108R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00069"}, d2 = {"Landroidx/compose/runtime/changelist/Operations$WriteScope;", "", "stack", "Landroidx/compose/runtime/changelist/Operations;", "constructor-impl", "(Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;", "operation", "Landroidx/compose/runtime/changelist/Operation;", "getOperation-impl", "(Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operation;", "equals", "", "other", "equals-impl", "(Landroidx/compose/runtime/changelist/Operations;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Landroidx/compose/runtime/changelist/Operations;)I", "setInt", "", "parameter", "Landroidx/compose/runtime/changelist/IntParameter;", "value", "setInt-impl", "(Landroidx/compose/runtime/changelist/Operations;II)V", "setInts", "parameter1", "value1", "parameter2", "value2", "setInts-impl", "(Landroidx/compose/runtime/changelist/Operations;IIII)V", "parameter3", "value3", "(Landroidx/compose/runtime/changelist/Operations;IIIIII)V", "setObject", "T", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "setObject-DKhxnng", "(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V", "setObjects", "U", "setObjects-4uCC6AY", "(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;ILjava/lang/Object;)V", "V", "setObjects-t7hvbck", "(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)V", "W", "parameter4", "value4", "setObjects-OGa0p1M", "(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)V", "toString", "", "toString-impl", "(Landroidx/compose/runtime/changelist/Operations;)Ljava/lang/String;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class WriteScope {
        private final Operations stack;

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ WriteScope m3868boximpl(Operations r1) {
            return new WriteScope(r1);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static Operations m3869constructorimpl(Operations r0) {
            return r0;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m3870equalsimpl(Operations r2, Object r3) {
            if ((r3 instanceof WriteScope) == true) goto L6;
            return false;
        L6:
            if (Intrinsics.areEqual(r2, ((WriteScope) r3).m3882unboximpl()) == true) goto L8;
            return false;
        L8:
            return true;
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m3871equalsimpl0(Operations r1, Operations r2) {
            return Intrinsics.areEqual(r1, r2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m3873hashCodeimpl(Operations r1) {
            return r1.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m3881toStringimpl(Operations r2) {
            return "WriteScope(stack=" + r2 + ')';
        }

        public boolean equals(Object r2) {
            return m3870equalsimpl(this.stack, r2);
        }

        public int hashCode() {
            return m3873hashCodeimpl(this.stack);
        }

        public String toString() {
            return m3881toStringimpl(this.stack);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ Operations m3882unboximpl() {
            return this.stack;
        }

        private /* synthetic */ WriteScope(Operations stack) {
            this.stack = stack;
        }

        /* JADX INFO: renamed from: getOperation-impl, reason: not valid java name */
        public static final Operation m3872getOperationimpl(Operations arg0) {
            return arg0.opCodes[arg0.opCodesSize - 1];
        }

        /* JADX INFO: renamed from: setInt-impl, reason: not valid java name */
        public static final void m3874setIntimpl(Operations arg0, int parameter, int value) {
            arg0.intArgs[(arg0.intArgsSize - arg0.opCodes[arg0.opCodesSize - 1].getInts()) + parameter] = value;
        }

        /* JADX INFO: renamed from: setInts-impl, reason: not valid java name */
        public static final void m3875setIntsimpl(Operations arg0, int parameter1, int value1, int parameter2, int value2) {
            int base = arg0.intArgsSize - arg0.opCodes[arg0.opCodesSize - 1].getInts();
            int[] intArgs = arg0.intArgs;
            intArgs[base + parameter1] = value1;
            intArgs[base + parameter2] = value2;
        }

        /* JADX INFO: renamed from: setInts-impl, reason: not valid java name */
        public static final void m3876setIntsimpl(Operations arg0, int parameter1, int value1, int parameter2, int value2, int parameter3, int value3) {
            int base = arg0.intArgsSize - arg0.opCodes[arg0.opCodesSize - 1].getInts();
            int[] intArgs = arg0.intArgs;
            intArgs[base + parameter1] = value1;
            intArgs[base + parameter2] = value2;
            intArgs[base + parameter3] = value3;
        }

        /* JADX INFO: renamed from: setObject-DKhxnng, reason: not valid java name */
        public static final <T> void m3877setObjectDKhxnng(Operations arg0, int parameter, T r12) {
            arg0.objectArgs[(arg0.objectArgsSize - arg0.opCodes[arg0.opCodesSize - 1].getObjects()) + parameter] = r12;
        }

        /* JADX INFO: renamed from: setObjects-4uCC6AY, reason: not valid java name */
        public static final <T, U> void m3878setObjects4uCC6AY(Operations arg0, int parameter1, T r9, int parameter2, U r11) {
            int base = arg0.objectArgsSize - arg0.opCodes[arg0.opCodesSize - 1].getObjects();
            Object[] objectArgs = arg0.objectArgs;
            objectArgs[base + parameter1] = r9;
            objectArgs[base + parameter2] = r11;
        }

        /* JADX INFO: renamed from: setObjects-t7hvbck, reason: not valid java name */
        public static final <T, U, V> void m3880setObjectst7hvbck(Operations arg0, int parameter1, T r9, int parameter2, U r11, int parameter3, V r13) {
            int base = arg0.objectArgsSize - arg0.opCodes[arg0.opCodesSize - 1].getObjects();
            Object[] objectArgs = arg0.objectArgs;
            objectArgs[base + parameter1] = r9;
            objectArgs[base + parameter2] = r11;
            objectArgs[base + parameter3] = r13;
        }

        /* JADX INFO: renamed from: setObjects-OGa0p1M, reason: not valid java name */
        public static final <T, U, V, W> void m3879setObjectsOGa0p1M(Operations arg0, int parameter1, T r9, int parameter2, U r11, int parameter3, V r13, int parameter4, W r15) {
            int base = arg0.objectArgsSize - arg0.opCodes[arg0.opCodesSize - 1].getObjects();
            Object[] objectArgs = arg0.objectArgs;
            objectArgs[base + parameter1] = r9;
            objectArgs[base + parameter2] = r11;
            objectArgs[base + parameter3] = r13;
            objectArgs[base + parameter4] = r15;
        }
    }

    static {
        $stable = 8;
    }

    public static /* synthetic */ void getOpCodes$runtime_release$annotations() {
    }

    public Operations() {
        this.opCodes = new Operation[16];
        this.intArgs = new int[16];
        this.objectArgs = new Object[16];
    }

    public static final /* synthetic */ String access$currentOpToDebugString(Operations $this, OpIterator $receiver, String linePrefix) {
        return $this.currentOpToDebugString($receiver, linePrefix);
    }

    public static final /* synthetic */ String access$formatOpArgumentToString(Operations $this, Object $receiver, String linePrefix) {
        return $this.formatOpArgumentToString($receiver, linePrefix);
    }

    public static final /* synthetic */ int access$getPushedIntMask$p(Operations $this) {
        return $this.pushedIntMask;
    }

    public static final /* synthetic */ int access$getPushedObjectMask$p(Operations $this) {
        return $this.pushedObjectMask;
    }

    public static final /* synthetic */ void access$setPushedIntMask$p(Operations $this, int r1) {
        $this.pushedIntMask = r1;
    }

    public static final /* synthetic */ void access$setPushedObjectMask$p(Operations $this, int r1) {
        $this.pushedObjectMask = r1;
    }

    public final int getSize() {
        return this.opCodesSize;
    }

    public final boolean isEmpty() {
        if (getSize() != 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean isNotEmpty() {
        if (getSize() == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final void clear() {
        this.opCodesSize = 0;
        this.intArgsSize = 0;
        ArraysKt.fill(this.objectArgs, null, 0, this.objectArgsSize);
        this.objectArgsSize = 0;
    }

    public final void pushOp(Operation operation) {
        if (this.opCodesSize != this.opCodes.length) goto L5;
        resizeOpCodes();
    L5:
        int requiredSize$iv = this.intArgsSize + operation.getInts();
        int currentSize$iv = this.intArgs.length;
        if (requiredSize$iv <= currentSize$iv) goto L8;
        resizeIntArgs(currentSize$iv, requiredSize$iv);
    L8:
        int requiredSize$iv2 = this.objectArgsSize + operation.getObjects();
        int currentSize$iv2 = this.objectArgs.length;
        if (requiredSize$iv2 <= currentSize$iv2) goto L11;
        resizeObjectArgs(currentSize$iv2, requiredSize$iv2);
    L11:
        Operation[] r0 = this.opCodes;
        int r1 = this.opCodesSize;
        this.opCodesSize = r1 + 1;
        r0[r1] = operation;
        this.intArgsSize += operation.getInts();
        this.objectArgsSize += operation.getObjects();
    }

    private final int determineNewSize(int currentSize, int requiredSize) {
        int resizeAmount = RangesKt.coerceAtMost(currentSize, 1024);
        return RangesKt.coerceAtLeast(currentSize + resizeAmount, requiredSize);
    }

    private final void resizeOpCodes() {
        int resizeAmount = RangesKt.coerceAtMost(this.opCodesSize, 1024);
        Operation[] newOpCodes = new Operation[this.opCodesSize + resizeAmount];
        Object[] $this$fastCopyInto$iv = this.opCodes;
        int endIndex$iv = this.opCodesSize;
        System.arraycopy($this$fastCopyInto$iv, 0, newOpCodes, 0, endIndex$iv - 0);
        this.opCodes = newOpCodes;
    }

    private final void ensureIntArgsSizeAtLeast(int requiredSize) {
        int currentSize = this.intArgs.length;
        if (requiredSize <= currentSize) goto L6;
        resizeIntArgs(currentSize, requiredSize);
        return;
    }

    private final void resizeIntArgs(int currentSize, int requiredSize) {
        int[] newIntArgs = new int[determineNewSize(currentSize, requiredSize)];
        ArraysKt.copyInto(this.intArgs, newIntArgs, 0, 0, currentSize);
        this.intArgs = newIntArgs;
    }

    private final void ensureObjectArgsSizeAtLeast(int requiredSize) {
        int currentSize = this.objectArgs.length;
        if (requiredSize <= currentSize) goto L6;
        resizeObjectArgs(currentSize, requiredSize);
        return;
    }

    private final void resizeObjectArgs(int currentSize, int requiredSize) {
        Object[] newObjectArgs = new Object[determineNewSize(currentSize, requiredSize)];
        Object[] $this$fastCopyInto$iv = this.objectArgs;
        System.arraycopy($this$fastCopyInto$iv, 0, newObjectArgs, 0, currentSize - 0);
        this.objectArgs = newObjectArgs;
    }

    public final void push(Operation operation) {
        pushOp(operation);
    }

    private final String exceptionMessageForOperationPushNoScope(Operation operation) {
        return "Cannot push " + operation + " without arguments because it expects " + operation.getInts() + " ints and " + operation.getObjects() + " objects.";
    }

    public final void push(Operation operation, Function1<? super WriteScope, Unit> r4) {
        pushOp(operation);
        r4.invoke(WriteScope.m3868boximpl(WriteScope.m3869constructorimpl(this)));
        ensureAllArgumentsPushedFor(operation);
    }

    public final void ensureAllArgumentsPushedFor(Operation operation) {
        int r0 = this.pushedIntMask;
        int paramCount$iv = operation.getInts();
        int r4 = -1;
        if (paramCount$iv != 0) goto L5;
        int r6 = 0;
    L7:
        if (r0 != (r6 >>> (32 - paramCount$iv))) goto L16;
        int r1 = this.pushedObjectMask;
        int paramCount$iv2 = operation.getObjects();
        if (paramCount$iv2 != 0) goto L12;
        r4 = 0;
    L12:
        if (r1 == (r4 >>> (32 - paramCount$iv2))) goto L16;
    L16:
        return;
    L5:
        r6 = -1;
        goto L7
    }

    private final String exceptionMessageForOperationPushWithScope(Operation operation) {
        int missingIntCount = 0;
        StringBuilder $this$exceptionMessageForOperationPushWithScope_u24lambda_u244 = new StringBuilder();
        int r6 = operation.getInts();
        int r7 = 0;
        int r8 = 0;
    L3:
        int r10 = 1;
        if (r8 >= r6) goto L11;
        int arg = r8;
        if (((1 << arg) & this.pushedIntMask) != 0) goto L10;
        if (missingIntCount <= 0) goto L9;
        $this$exceptionMessageForOperationPushWithScope_u24lambda_u244.append(", ");
    L9:
        $this$exceptionMessageForOperationPushWithScope_u24lambda_u244.append(operation.intParamName(arg));
        missingIntCount = missingIntCount + 1;
    L10:
        r8 = r8 + 1;
        goto L3
    L11:
        String missingInts = $this$exceptionMessageForOperationPushWithScope_u24lambda_u244.toString();
        Intrinsics.checkNotNullExpressionValue(missingInts, "toString(...)");
        int missingObjectCount = 0;
        StringBuilder $this$exceptionMessageForOperationPushWithScope_u24lambda_u246 = new StringBuilder();
        int r12 = operation.getObjects();
    L12:
        if (r7 >= r12) goto L19;
        int arg2 = r7;
        if ((this.pushedObjectMask & (r10 << arg2)) != 0) goto L18;
        if (missingIntCount <= 0) goto L17;
        $this$exceptionMessageForOperationPushWithScope_u24lambda_u246.append(", ");
    L17:
        $this$exceptionMessageForOperationPushWithScope_u24lambda_u246.append(operation.mo3820objectParamName31yXWZQ(Operation.ObjectParameter.m3846constructorimpl(arg2)));
        missingObjectCount = missingObjectCount + 1;
    L18:
        r7 = r7 + 1;
        r10 = 1;
        goto L12
    L19:
        String missingObjects = $this$exceptionMessageForOperationPushWithScope_u24lambda_u246.toString();
        Intrinsics.checkNotNullExpressionValue(missingObjects, "toString(...)");
        return "Error while pushing " + operation + ". Not all arguments were provided. Missing " + missingIntCount + " int arguments (" + missingInts + ") and " + missingObjectCount + " object arguments (" + missingObjects + ").";
    }

    private final int createExpectedArgMask(int paramCount) {
        if (paramCount != 0) goto L5;
        int r1 = 0;
    L7:
        return r1 >>> (32 - paramCount);
    L5:
        r1 = -1;
        goto L7
    }

    public final void pop() {
        Operation[] opCodes = this.opCodes;
        this.opCodesSize--;
        Operation op = opCodes[this.opCodesSize];
        opCodes[this.opCodesSize] = null;
        int r2 = op.getObjects();
        int r4 = 0;
    L3:
        if (r4 >= r2) goto L5;
        Object[] r7 = this.objectArgs;
        this.objectArgsSize--;
        r7[this.objectArgsSize] = null;
        r4 = r4 + 1;
        goto L3
    L5:
        this.intArgsSize -= op.getInts();
    }

    public final void popInto(Operations other) {
        Operation[] opCodes = this.opCodes;
        this.opCodesSize--;
        Operation op = opCodes[this.opCodesSize];
        opCodes[this.opCodesSize] = null;
        other.pushOp(op);
        Object[] $this$fastCopyInto$iv = this.objectArgs;
        Object[] destination$iv = other.objectArgs;
        int destinationOffset$iv = other.objectArgsSize - op.getObjects();
        int startIndex$iv = this.objectArgsSize - op.getObjects();
        int endIndex$iv = this.objectArgsSize;
        System.arraycopy($this$fastCopyInto$iv, startIndex$iv, destination$iv, destinationOffset$iv, endIndex$iv - startIndex$iv);
        Object[] $this$fastCopyInto$iv2 = this.objectArgs;
        ArraysKt.fill($this$fastCopyInto$iv2, null, this.objectArgsSize - op.getObjects(), this.objectArgsSize);
        ArraysKt.copyInto(this.intArgs, other.intArgs, other.intArgsSize - op.getInts(), this.intArgsSize - op.getInts(), this.intArgsSize);
        this.objectArgsSize -= op.getObjects();
        this.intArgsSize -= op.getInts();
    }

    public final void drain(Function1<? super OpIterator, Unit> r6) {
        if (isNotEmpty() == false) goto L8;
        OpIterator iterator$iv = new OpIterator(this);
    L5:
        r6.invoke(iterator$iv);
        if (iterator$iv.next() == true) goto L5;
    L8:
        clear();
    }

    public final void forEach(Function1<? super OpIterator, Unit> r4) {
        if (isNotEmpty() == false) goto L7;
        OpIterator iterator = new OpIterator(this);
    L5:
        r4.invoke(iterator);
        if (iterator.next() == true) goto L5;
        return;
    }

    public final void executeAndFlushAllPendingOperations(Applier<?> r11, SlotWriter slots, RememberManager rememberManager) {
        if (isNotEmpty() == false) goto L8;
        OpIterator iterator$iv$iv = new OpIterator(this);
    L5:
        Operation $this$executeAndFlushAllPendingOperations_u24lambda_u249_u24lambda_u248 = iterator$iv$iv.getOperation();
        $this$executeAndFlushAllPendingOperations_u24lambda_u249_u24lambda_u248.execute(iterator$iv$iv, r11, slots, rememberManager);
        if (iterator$iv$iv.next() == true) goto L5;
    L8:
        clear();
    }

    private final String indent(String $this$indent) {
        return $this$indent + "    ";
    }

    private final Operation peekOperation() {
        return this.opCodes[this.opCodesSize - 1];
    }

    private final int topIntIndexOf(int parameter) {
        return (this.intArgsSize - this.opCodes[this.opCodesSize - 1].getInts()) + parameter;
    }

    /* JADX INFO: renamed from: topObjectIndexOf-31yXWZQ, reason: not valid java name */
    private final int m3867topObjectIndexOf31yXWZQ(int parameter) {
        return (this.objectArgsSize - this.opCodes[this.opCodesSize - 1].getObjects()) + parameter;
    }

    @Deprecated(message = "toString() will return the default implementation from Any. Did you mean to use toDebugString()?", replaceWith = @ReplaceWith(expression = "toDebugString()", imports = {}))
    public String toString() {
        return super.toString();
    }

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    public String toDebugString(String linePrefix) {
        StringBuilder $this$toDebugString_u24lambda_u2411 = new StringBuilder();
        int opNumber = 0;
        if (isNotEmpty() == false) goto L9;
        OpIterator iterator$iv = new OpIterator(this);
    L5:
        $this$toDebugString_u24lambda_u2411.append(linePrefix);
        int opNumber2 = opNumber + 1;
        $this$toDebugString_u24lambda_u2411.append(opNumber);
        $this$toDebugString_u24lambda_u2411.append(". ");
        StringBuilder r3 = $this$toDebugString_u24lambda_u2411.append(currentOpToDebugString(iterator$iv, linePrefix));
        Intrinsics.checkNotNullExpressionValue(r3, "append(...)");
        Intrinsics.checkNotNullExpressionValue(r3.append('\n'), "append(...)");
        if (iterator$iv.next() == false) goto L9;
        opNumber = opNumber2;
    L9:
        String r0 = $this$toDebugString_u24lambda_u2411.toString();
        Intrinsics.checkNotNullExpressionValue(r0, "toString(...)");
        return r0;
    }

    private final String currentOpToDebugString(OpIterator $this$currentOpToDebugString, String linePrefix) {
        Operation operation = $this$currentOpToDebugString.getOperation();
        if (operation.getInts() == 0) goto L5;
    L7:
        StringBuilder $this$currentOpToDebugString_u24lambda_u2414 = new StringBuilder();
        int r6 = 0;
        $this$currentOpToDebugString_u24lambda_u2414.append(operation.getName());
        $this$currentOpToDebugString_u24lambda_u2414.append('(');
        boolean isFirstParam = true;
        String argLinePrefix = indent(linePrefix);
        int r9 = operation.getInts();
        int r11 = 0;
    L9:
        if (r11 >= r9) goto L15;
        int offset = r11;
        String name = operation.intParamName(offset);
        if (isFirstParam == true) goto L13;
        $this$currentOpToDebugString_u24lambda_u2414.append(", ");
    L14:
        Intrinsics.checkNotNullExpressionValue($this$currentOpToDebugString_u24lambda_u2414.append('\n'), "append(...)");
        $this$currentOpToDebugString_u24lambda_u2414.append(argLinePrefix);
        $this$currentOpToDebugString_u24lambda_u2414.append(name);
        $this$currentOpToDebugString_u24lambda_u2414.append(" = ");
        $this$currentOpToDebugString_u24lambda_u2414.append($this$currentOpToDebugString.getInt(offset));
        r11 = r11 + 1;
        goto L9
    L13:
        isFirstParam = false;
        goto L14
    L15:
        int r10 = operation.getObjects();
        int offset2 = 0;
    L16:
        if (offset2 >= r10) goto L22;
        StringBuilder r17 = $this$currentOpToDebugString_u24lambda_u2414;
        int param = Operation.ObjectParameter.m3846constructorimpl(offset2);
        int r18 = r6;
        String name2 = operation.mo3820objectParamName31yXWZQ(param);
        if (isFirstParam == true) goto L20;
        $this$currentOpToDebugString_u24lambda_u2414.append(", ");
    L21:
        Operation operation2 = operation;
        boolean isFirstParam2 = isFirstParam;
        Intrinsics.checkNotNullExpressionValue($this$currentOpToDebugString_u24lambda_u2414.append('\n'), "append(...)");
        $this$currentOpToDebugString_u24lambda_u2414.append(argLinePrefix);
        $this$currentOpToDebugString_u24lambda_u2414.append(name2);
        $this$currentOpToDebugString_u24lambda_u2414.append(" = ");
        $this$currentOpToDebugString_u24lambda_u2414.append(formatOpArgumentToString($this$currentOpToDebugString.mo3866getObject31yXWZQ(param), argLinePrefix));
        offset2 = offset2 + 1;
        $this$currentOpToDebugString_u24lambda_u2414 = r17;
        r6 = r18;
        operation = operation2;
        isFirstParam = isFirstParam2;
        goto L16
    L20:
        isFirstParam = false;
        goto L21
    L22:
        Intrinsics.checkNotNullExpressionValue($this$currentOpToDebugString_u24lambda_u2414.append('\n'), "append(...)");
        $this$currentOpToDebugString_u24lambda_u2414.append(linePrefix);
        $this$currentOpToDebugString_u24lambda_u2414.append(")");
        String r4 = $this$currentOpToDebugString_u24lambda_u2414.toString();
        Intrinsics.checkNotNullExpressionValue(r4, "toString(...)");
        return r4;
    L5:
        if (operation.getObjects() != 0) goto L7;
        return operation.getName();
    }

    private final String formatOpArgumentToString(Object $this$formatOpArgumentToString, String linePrefix) {
        if ($this$formatOpArgumentToString != null) goto L5;
        return "null";
    L5:
        if (($this$formatOpArgumentToString instanceof Object[]) == false) goto L8;
        return toCollectionString(ArraysKt.asIterable((Object[]) $this$formatOpArgumentToString), linePrefix);
    L8:
        if (($this$formatOpArgumentToString instanceof int[]) == false) goto L11;
        return toCollectionString(ArraysKt.asIterable((int[]) $this$formatOpArgumentToString), linePrefix);
    L11:
        if (($this$formatOpArgumentToString instanceof long[]) == false) goto L14;
        return toCollectionString(ArraysKt.asIterable((long[]) $this$formatOpArgumentToString), linePrefix);
    L14:
        if (($this$formatOpArgumentToString instanceof float[]) == false) goto L17;
        return toCollectionString(ArraysKt.asIterable((float[]) $this$formatOpArgumentToString), linePrefix);
    L17:
        if (($this$formatOpArgumentToString instanceof double[]) == false) goto L20;
        return toCollectionString(ArraysKt.asIterable((double[]) $this$formatOpArgumentToString), linePrefix);
    L20:
        if (($this$formatOpArgumentToString instanceof Iterable) == false) goto L23;
        return toCollectionString((Iterable) $this$formatOpArgumentToString, linePrefix);
    L23:
        if (($this$formatOpArgumentToString instanceof OperationsDebugStringFormattable) == false) goto L26;
        return ((OperationsDebugStringFormattable) $this$formatOpArgumentToString).toDebugString(linePrefix);
    L26:
        return $this$formatOpArgumentToString.toString();
    }

    private final <T> String toCollectionString(Iterable<? extends T> r11, final String linePrefix) {
        return CollectionsKt.joinToString$default(r11, ", ", "[", "]", 0, null, new AnonymousClass1(this, linePrefix), 24, null);
    }
}
