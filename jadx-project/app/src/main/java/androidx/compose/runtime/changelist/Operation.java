package androidx.compose.runtime.changelist;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.OffsetApplier;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeOwner;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.Utils_jvmKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: Operation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:&\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCB\u001b\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0014\u0010\r\u001a\u00020\t2\n\u0010\u000e\u001a\u00060\u0003j\u0002`\u000fH\u0016J\u001e\u0010\u0010\u001a\u00020\t2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\tH\u0016J(\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007\u0082\u0001%DEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefgh\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006i"}, d2 = {"Landroidx/compose/runtime/changelist/Operation;", "", "ints", "", "objects", "(II)V", "getInts", "()I", HintConstants.AUTOFILL_HINT_NAME, "", "getName", "()Ljava/lang/String;", "getObjects", "intParamName", "parameter", "Landroidx/compose/runtime/changelist/IntParameter;", "objectParamName", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "toString", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "AdvanceSlotsBy", "AppendValue", "ApplyChangeList", "CopyNodesToNewAnchorLocation", "CopySlotTableToAnchorLocation", "DeactivateCurrentGroup", "DetermineMovableContentNodeIndex", "Downs", "EndCompositionScope", "EndCurrentGroup", "EndMovableContentPlacement", "EndResumingScope", "EnsureGroupStarted", "EnsureRootGroupStarted", "InsertNodeFixup", "InsertSlots", "InsertSlotsWithFixups", "MoveCurrentGroup", "MoveNode", "ObjectParameter", "PostInsertNodeFixup", "ReleaseMovableGroupAtCurrent", "Remember", "RememberPausingScope", "RemoveCurrentGroup", "RemoveNode", "ResetSlots", "SideEffect", "SkipToEndOfCurrentGroup", "StartResumingScope", "TestOperation", "TrimParentValues", "UpdateAnchoredValue", "UpdateAuxData", "UpdateNode", "UpdateValue", "Ups", "UseCurrentNode", "Landroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy;", "Landroidx/compose/runtime/changelist/Operation$AppendValue;", "Landroidx/compose/runtime/changelist/Operation$ApplyChangeList;", "Landroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation;", "Landroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation;", "Landroidx/compose/runtime/changelist/Operation$DeactivateCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex;", "Landroidx/compose/runtime/changelist/Operation$Downs;", "Landroidx/compose/runtime/changelist/Operation$EndCompositionScope;", "Landroidx/compose/runtime/changelist/Operation$EndCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$EndMovableContentPlacement;", "Landroidx/compose/runtime/changelist/Operation$EndResumingScope;", "Landroidx/compose/runtime/changelist/Operation$EnsureGroupStarted;", "Landroidx/compose/runtime/changelist/Operation$EnsureRootGroupStarted;", "Landroidx/compose/runtime/changelist/Operation$InsertNodeFixup;", "Landroidx/compose/runtime/changelist/Operation$InsertSlots;", "Landroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups;", "Landroidx/compose/runtime/changelist/Operation$MoveCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$MoveNode;", "Landroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup;", "Landroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent;", "Landroidx/compose/runtime/changelist/Operation$Remember;", "Landroidx/compose/runtime/changelist/Operation$RememberPausingScope;", "Landroidx/compose/runtime/changelist/Operation$RemoveCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$RemoveNode;", "Landroidx/compose/runtime/changelist/Operation$ResetSlots;", "Landroidx/compose/runtime/changelist/Operation$SideEffect;", "Landroidx/compose/runtime/changelist/Operation$SkipToEndOfCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$StartResumingScope;", "Landroidx/compose/runtime/changelist/Operation$TestOperation;", "Landroidx/compose/runtime/changelist/Operation$TrimParentValues;", "Landroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue;", "Landroidx/compose/runtime/changelist/Operation$UpdateAuxData;", "Landroidx/compose/runtime/changelist/Operation$UpdateNode;", "Landroidx/compose/runtime/changelist/Operation$UpdateValue;", "Landroidx/compose/runtime/changelist/Operation$Ups;", "Landroidx/compose/runtime/changelist/Operation$UseCurrentNode;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class Operation {
    public static final int $stable = 0;
    private final int ints;
    private final int objects;

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0004j\u0002`\nH\u0016J(\u0010\u000b\u001a\u00020\f*\u00020\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0012\u0010\u0003\u001a\u00020\u00048Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Distance", "", "getDistance", "()I", "intParamName", "", "parameter", "Landroidx/compose/runtime/changelist/IntParameter;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AdvanceSlotsBy extends Operation {
        public static final int $stable = 0;
        public static final AdvanceSlotsBy INSTANCE = null;

        static {
            INSTANCE = new AdvanceSlotsBy();
        }

        private AdvanceSlotsBy() {
            int r2 = 1;
            int r3 = 0;
            super(r2, r3, 2, null);
        }

        public final int getDistance() {
            return 0;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public String intParamName(int parameter) {
            if (parameter != 0) goto L6;
            return "distance";
        L6:
            return super.intParamName(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer $this$execute, Applier<?> r4, SlotWriter slots, RememberManager rememberManager) {
            slots.advanceBy($this$execute.getInt(0));
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$AppendValue;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Anchor", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/Anchor;", "getAnchor-HpuvwBQ", "()I", "Value", "", "getValue-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AppendValue extends Operation {
        public static final int $stable = 0;
        public static final AppendValue INSTANCE = null;

        static {
            INSTANCE = new AppendValue();
        }

        private AppendValue() {
            int r2 = 0;
            int r3 = 2;
            super(r2, r3, 1, null);
        }

        /* JADX INFO: renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m3821getAnchorHpuvwBQ() {
            return ObjectParameter.m3846constructorimpl(0);
        }

        /* JADX INFO: renamed from: getValue-HpuvwBQ, reason: not valid java name */
        public final int m3822getValueHpuvwBQ() {
            return ObjectParameter.m3846constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3820objectParamName31yXWZQ(int parameter) {
            if (ObjectParameter.m3848equalsimpl0(parameter, ObjectParameter.m3846constructorimpl(0)) == false) goto L6;
            return "anchor";
        L6:
            if (ObjectParameter.m3848equalsimpl0(parameter, ObjectParameter.m3846constructorimpl(1)) == false) goto L9;
            return "value";
        L9:
            return super.mo3820objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer $this$execute, Applier<?> r6, SlotWriter slots, RememberManager rememberManager) {
            Anchor anchor = (Anchor) $this$execute.mo3866getObject31yXWZQ(ObjectParameter.m3846constructorimpl(0));
            Object value = $this$execute.mo3866getObject31yXWZQ(ObjectParameter.m3846constructorimpl(1));
            if ((value instanceof RememberObserverHolder) == false) goto L5;
            rememberManager.remembering((RememberObserverHolder) value);
        L5:
            slots.appendSlot(anchor, value);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$ApplyChangeList;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Changes", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/changelist/ChangeList;", "getChanges-HpuvwBQ", "()I", "EffectiveNodeIndex", "Landroidx/compose/runtime/internal/IntRef;", "getEffectiveNodeIndex-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ApplyChangeList extends Operation {
        public static final int $stable = 0;
        public static final ApplyChangeList INSTANCE = null;

        static {
            INSTANCE = new ApplyChangeList();
        }

        private ApplyChangeList() {
            int r2 = 0;
            int r3 = 2;
            super(r2, r3, 1, null);
        }

        /* JADX INFO: renamed from: getChanges-HpuvwBQ, reason: not valid java name */
        public final int m3823getChangesHpuvwBQ() {
            return ObjectParameter.m3846constructorimpl(0);
        }

        /* JADX INFO: renamed from: getEffectiveNodeIndex-HpuvwBQ, reason: not valid java name */
        public final int m3824getEffectiveNodeIndexHpuvwBQ() {
            return ObjectParameter.m3846constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3820objectParamName31yXWZQ(int parameter) {
            if (ObjectParameter.m3848equalsimpl0(parameter, ObjectParameter.m3846constructorimpl(0)) == false) goto L6;
            return "changes";
        L6:
            if (ObjectParameter.m3848equalsimpl0(parameter, ObjectParameter.m3846constructorimpl(1)) == false) goto L9;
            return "effectiveNodeIndex";
        L9:
            return super.mo3820objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer $this$execute, Applier<?> r6, SlotWriter slots, RememberManager rememberManager) {
            IntRef r0 = (IntRef) $this$execute.mo3866getObject31yXWZQ(ObjectParameter.m3846constructorimpl(1));
            if (r0 == null) goto L5;
            int effectiveNodeIndex = r0.getElement();
        L6:
            ChangeList r1 = (ChangeList) $this$execute.mo3866getObject31yXWZQ(ObjectParameter.m3846constructorimpl(0));
            if (effectiveNodeIndex <= 0) goto L9;
            OffsetApplier r2 = new OffsetApplier(r6, effectiveNodeIndex);
        L10:
            r1.executeAndFlushAllPendingChanges(r2, slots, rememberManager);
            return;
        L9:
            r2 = r6;
            goto L10
        L5:
            effectiveNodeIndex = 0;
            goto L6
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0011\u001a\u00020\u0012*\u00020\u00132\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R&\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "EffectiveNodeIndex", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/internal/IntRef;", "getEffectiveNodeIndex-HpuvwBQ", "()I", "Nodes", "", "", "getNodes-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CopyNodesToNewAnchorLocation extends Operation {
        public static final int $stable = 0;
        public static final CopyNodesToNewAnchorLocation INSTANCE = null;

        static {
            INSTANCE = new CopyNodesToNewAnchorLocation();
        }

        private CopyNodesToNewAnchorLocation() {
            int r2 = 0;
            int r3 = 2;
            super(r2, r3, 1, null);
        }

        /* JADX INFO: renamed from: getEffectiveNodeIndex-HpuvwBQ, reason: not valid java name */
        public final int m3825getEffectiveNodeIndexHpuvwBQ() {
            return ObjectParameter.m3846constructorimpl(0);
        }

        /* JADX INFO: renamed from: getNodes-HpuvwBQ, reason: not valid java name */
        public final int m3826getNodesHpuvwBQ() {
            return ObjectParameter.m3846constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3820objectParamName31yXWZQ(int parameter) {
            if (ObjectParameter.m3848equalsimpl0(parameter, ObjectParameter.m3846constructorimpl(0)) == false) goto L6;
            return "effectiveNodeIndex";
        L6:
            if (ObjectParameter.m3848equalsimpl0(parameter, ObjectParameter.m3846constructorimpl(1)) == false) goto L9;
            return "nodes";
        L9:
            return super.mo3820objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer $this$execute, Applier<?> r13, SlotWriter slots, RememberManager rememberManager) {
            int effectiveNodeIndex = ((IntRef) $this$execute.mo3866getObject31yXWZQ(ObjectParameter.m3846constructorimpl(0))).getElement();
            List nodesToInsert = (List) $this$execute.mo3866getObject31yXWZQ(ObjectParameter.m3846constructorimpl(1));
            int index$iv = 0;
            int r5 = nodesToInsert.size();
        L3:
            if (index$iv >= r5) goto L6;
            Object item$iv = nodesToInsert.get(index$iv);
            int i = index$iv;
            Intrinsics.checkNotNull(r13, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            r13.insertBottomUp(effectiveNodeIndex + i, item$iv);
            r13.insertTopDown(effectiveNodeIndex + i, item$iv);
            index$iv = index$iv + 1;
            goto L3
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007R \u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "From", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/MovableContentStateReference;", "getFrom-HpuvwBQ", "()I", "ParentCompositionContext", "Landroidx/compose/runtime/CompositionContext;", "getParentCompositionContext-HpuvwBQ", "ResolvedState", "Landroidx/compose/runtime/MovableContentState;", "getResolvedState-HpuvwBQ", "To", "getTo-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CopySlotTableToAnchorLocation extends Operation {
        public static final int $stable = 0;
        public static final CopySlotTableToAnchorLocation INSTANCE = null;

        static {
            INSTANCE = new CopySlotTableToAnchorLocation();
        }

        private CopySlotTableToAnchorLocation() {
            int r2 = 0;
            int r3 = 4;
            super(r2, r3, 1, null);
        }

        /* JADX INFO: renamed from: getResolvedState-HpuvwBQ, reason: not valid java name */
        public final int m3829getResolvedStateHpuvwBQ() {
            return ObjectParameter.m3846constructorimpl(0);
        }

        /* JADX INFO: renamed from: getParentCompositionContext-HpuvwBQ, reason: not valid java name */
        public final int m3828getParentCompositionContextHpuvwBQ() {
            return ObjectParameter.m3846constructorimpl(1);
        }

        /* JADX INFO: renamed from: getFrom-HpuvwBQ, reason: not valid java name */
        public final int m3827getFromHpuvwBQ() {
            return ObjectParameter.m3846constructorimpl(2);
        }

        /* JADX INFO: renamed from: getTo-HpuvwBQ, reason: not valid java name */
        public final int m3830getToHpuvwBQ() {
            return ObjectParameter.m3846constructorimpl(3);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3820objectParamName31yXWZQ(int parameter) {
            if (ObjectParameter.m3848equalsimpl0(parameter, ObjectParameter.m3846constructorimpl(0)) == false) goto L6;
            return "resolvedState";
        L6:
            if (ObjectParameter.m3848equalsimpl0(parameter, ObjectParameter.m3846constructorimpl(1)) == false) goto L9;
            return "resolvedCompositionContext";
        L9:
            if (ObjectParameter.m3848equalsimpl0(parameter, ObjectParameter.m3846constructorimpl(2)) == false) goto L12;
            return "from";
        L12:
            if (ObjectParameter.m3848equalsimpl0(parameter, ObjectParameter.m3846constructorimpl(3)) == false) goto L15;
            return "to";
        L15:
            return super.mo3820objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer $this$execute, Applier<?> r10, SlotWriter slots, RememberManager rememberManager) {
            MovableContentStateReference from = (MovableContentStateReference) $this$execute.mo3866getObject31yXWZQ(ObjectParameter.m3846constructorimpl(2));
            MovableContentStateReference to = (MovableContentStateReference) $this$execute.mo3866getObject31yXWZQ(ObjectParameter.m3846constructorimpl(3));
            CompositionContext parentCompositionContext = (CompositionContext) $this$execute.mo3866getObject31yXWZQ(ObjectParameter.m3846constructorimpl(1));
            MovableContentState resolvedState = (MovableContentState) $this$execute.mo3866getObject31yXWZQ(ObjectParameter.m3846constructorimpl(0));
            if (resolvedState != null) goto L9;
            resolvedState = parentCompositionContext.movableContentStateResolve$runtime_release(from);
            if (resolvedState != null) goto L9;
            ComposerKt.composeRuntimeError("Could not resolve state for movable content");
            throw new KotlinNothingValueException();
        L9:
            List<Anchor> r2 = slots.moveIntoGroupFrom(1, resolvedState.getSlotTable$runtime_release(), 2);
            RecomposeScopeImpl.Companion r5 = RecomposeScopeImpl.Companion;
            ControlledComposition r6 = to.getComposition$runtime_release();
            Intrinsics.checkNotNull(r6, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeOwner");
            r5.adoptAnchoredScopes$runtime_release(slots, r2, (RecomposeScopeOwner) r6);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$DeactivateCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DeactivateCurrentGroup extends Operation {
        public static final int $stable = 0;
        public static final DeactivateCurrentGroup INSTANCE = null;

        static {
            INSTANCE = new DeactivateCurrentGroup();
        }

        private DeactivateCurrentGroup() {
            int r2 = 0;
            super(r2, r2, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer $this$execute, Applier<?> r2, SlotWriter slots, RememberManager rememberManager) {
            ComposerKt.deactivateCurrentGroup(slots, rememberManager);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Anchor", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/Anchor;", "getAnchor-HpuvwBQ", "()I", "EffectiveNodeIndexOut", "Landroidx/compose/runtime/internal/IntRef;", "getEffectiveNodeIndexOut-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DetermineMovableContentNodeIndex extends Operation {
        public static final int $stable = 0;
        public static final DetermineMovableContentNodeIndex INSTANCE = null;

        static {
            INSTANCE = new DetermineMovableContentNodeIndex();
        }

        private DetermineMovableContentNodeIndex() {
            int r2 = 0;
            int r3 = 2;
            super(r2, r3, 1, null);
        }

        /* JADX INFO: renamed from: getEffectiveNodeIndexOut-HpuvwBQ, reason: not valid java name */
        public final int m3832getEffectiveNodeIndexOutHpuvwBQ() {
            return ObjectParameter.m3846constructorimpl(0);
        }

        /* JADX INFO: renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m3831getAnchorHpuvwBQ() {
            return ObjectParameter.m3846constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3820objectParamName31yXWZQ(int parameter) {
            if (ObjectParameter.m3848equalsimpl0(parameter, ObjectParameter.m3846constructorimpl(0)) == false) goto L6;
            return "effectiveNodeIndexOut";
        L6:
            if (ObjectParameter.m3848equalsimpl0(parameter, ObjectParameter.m3846constructorimpl(1)) == false) goto L9;
            return "anchor";
        L9:
            return super.mo3820objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer $this$execute, Applier<?> r6, SlotWriter slots, RememberManager rememberManager) {
            IntRef effectiveNodeIndexOut = (IntRef) $this$execute.mo3866getObject31yXWZQ(ObjectParameter.m3846constructorimpl(0));
            Anchor r1 = (Anchor) $this$execute.mo3866getObject31yXWZQ(ObjectParameter.m3846constructorimpl(1));
            Intrinsics.checkNotNull(r6, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            effectiveNodeIndexOut.setElement(OperationKt.access$positionToInsert(slots, r1, r6));
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R&\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$Downs;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Nodes", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "", "", "getNodes-HpuvwBQ", "()I", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Downs extends Operation {
        public static final int $stable = 0;
        public static final Downs INSTANCE = null;

        static {
            INSTANCE = new Downs();
        }

        private Downs() {
            int r0 = 1;
            int r2 = 0;
            super(r2, r0, r0, null);
        }

        /* JADX INFO: renamed from: getNodes-HpuvwBQ, reason: not valid java name */
        public final int m3833getNodesHpuvwBQ() {
            return ObjectParameter.m3846constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3820objectParamName31yXWZQ(int parameter) {
            if (ObjectParameter.m3848equalsimpl0(parameter, ObjectParameter.m3846constructorimpl(0)) == false) goto L6;
            return "nodes";
        L6:
            return super.mo3820objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer $this$execute, Applier<?> r7, SlotWriter slots, RememberManager rememberManager) {
            Intrinsics.checkNotNull(r7, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            Object[] nodes = (Object[]) $this$execute.mo3866getObject31yXWZQ(ObjectParameter.m3846constructorimpl(0));
            int index = 0;
            int r3 = nodes.length;
        L3:
            if (index >= r3) goto L5;
            r7.down(nodes[index]);
            index = index + 1;
            goto L3
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0011\u001a\u00020\u0007*\u00020\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R*\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$EndCompositionScope;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Action", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "", "getAction-HpuvwBQ", "()I", "Composition", "getComposition-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EndCompositionScope extends Operation {
        public static final int $stable = 0;
        public static final EndCompositionScope INSTANCE = null;

        static {
            INSTANCE = new EndCompositionScope();
        }

        private EndCompositionScope() {
            int r2 = 0;
            int r3 = 2;
            super(r2, r3, 1, null);
        }

        /* JADX INFO: renamed from: getAction-HpuvwBQ, reason: not valid java name */
        public final int m3834getActionHpuvwBQ() {
            return ObjectParameter.m3846constructorimpl(0);
        }

        /* JADX INFO: renamed from: getComposition-HpuvwBQ, reason: not valid java name */
        public final int m3835getCompositionHpuvwBQ() {
            return ObjectParameter.m3846constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3820objectParamName31yXWZQ(int parameter) {
            if (ObjectParameter.m3848equalsimpl0(parameter, ObjectParameter.m3846constructorimpl(0)) == false) goto L6;
            return "anchor";
        L6:
            if (ObjectParameter.m3848equalsimpl0(parameter, ObjectParameter.m3846constructorimpl(1)) == false) goto L9;
            return "composition";
        L9:
            return super.mo3820objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer $this$execute, Applier<?> r6, SlotWriter slots, RememberManager rememberManager) {
            Function1 action = (Function1) $this$execute.mo3866getObject31yXWZQ(ObjectParameter.m3846constructorimpl(0));
            Composition composition = (Composition) $this$execute.mo3866getObject31yXWZQ(ObjectParameter.m3846constructorimpl(1));
            action.invoke(composition);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$EndCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EndCurrentGroup extends Operation {
        public static final int $stable = 0;
        public static final EndCurrentGroup INSTANCE = null;

        static {
            INSTANCE = new EndCurrentGroup();
        }

        private EndCurrentGroup() {
            int r2 = 0;
            super(r2, r2, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer $this$execute, Applier<?> r2, SlotWriter slots, RememberManager rememberManager) {
            slots.endGroup();
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$EndMovableContentPlacement;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EndMovableContentPlacement extends Operation {
        public static final int $stable = 0;
        public static final EndMovableContentPlacement INSTANCE = null;

        static {
            INSTANCE = new EndMovableContentPlacement();
        }

        private EndMovableContentPlacement() {
            int r2 = 0;
            super(r2, r2, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer $this$execute, Applier<?> r3, SlotWriter slots, RememberManager rememberManager) {
            Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            OperationKt.access$positionToParentOf(slots, r3, 0);
            slots.endGroup();
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\r\u001a\u00020\u000e*\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$EndResumingScope;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Scope", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "getScope-HpuvwBQ", "()I", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EndResumingScope extends Operation {
        public static final int $stable = 0;
        public static final EndResumingScope INSTANCE = null;

        static {
            INSTANCE = new EndResumingScope();
        }

        private EndResumingScope() {
            int r0 = 1;
            int r2 = 0;
            super(r2, r0, r0, null);
        }

        /* JADX INFO: renamed from: getScope-HpuvwBQ, reason: not valid java name */
        public final int m3836getScopeHpuvwBQ() {
            return ObjectParameter.m3846constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3820objectParamName31yXWZQ(int parameter) {
            if (ObjectParameter.m3848equalsimpl0(parameter, ObjectParameter.m3846constructorimpl(0)) == false) goto L6;
            return "scope";
        L6:
            return super.mo3820objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer $this$execute, Applier<?> r5, SlotWriter slots, RememberManager rememberManager) {
            RecomposeScopeImpl scope = (RecomposeScopeImpl) $this$execute.mo3866getObject31yXWZQ(ObjectParameter.m3846constructorimpl(0));
            rememberManager.endResumingScope(scope);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\r\u001a\u00020\u000e*\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$EnsureGroupStarted;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Anchor", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/Anchor;", "getAnchor-HpuvwBQ", "()I", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EnsureGroupStarted extends Operation {
        public static final int $stable = 0;
        public static final EnsureGroupStarted INSTANCE = null;

        static {
            INSTANCE = new EnsureGroupStarted();
        }

        private EnsureGroupStarted() {
            int r0 = 1;
            int r2 = 0;
            super(r2, r0, r0, null);
        }

        /* JADX INFO: renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m3837getAnchorHpuvwBQ() {
            return ObjectParameter.m3846constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3820objectParamName31yXWZQ(int parameter) {
            if (ObjectParameter.m3848equalsimpl0(parameter, ObjectParameter.m3846constructorimpl(0)) == false) goto L6;
            return "anchor";
        L6:
            return super.mo3820objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer $this$execute, Applier<?> r5, SlotWriter slots, RememberManager rememberManager) {
            slots.ensureStarted((Anchor) $this$execute.mo3866getObject31yXWZQ(ObjectParameter.m3846constructorimpl(0)));
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$EnsureRootGroupStarted;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EnsureRootGroupStarted extends Operation {
        public static final int $stable = 0;
        public static final EnsureRootGroupStarted INSTANCE = null;

        static {
            INSTANCE = new EnsureRootGroupStarted();
        }

        private EnsureRootGroupStarted() {
            int r2 = 0;
            super(r2, r2, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer $this$execute, Applier<?> r3, SlotWriter slots, RememberManager rememberManager) {
            slots.ensureStarted(0);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\rj\u0002`\u0012H\u0016J\u001e\u0010\u0013\u001a\u00020\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R&\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000b\u0010\bR\u0012\u0010\f\u001a\u00020\r8Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$InsertNodeFixup;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Factory", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Lkotlin/Function0;", "", "getFactory-HpuvwBQ", "()I", "GroupAnchor", "Landroidx/compose/runtime/Anchor;", "getGroupAnchor-HpuvwBQ", "InsertIndex", "", "getInsertIndex", "intParamName", "", "parameter", "Landroidx/compose/runtime/changelist/IntParameter;", "objectParamName", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InsertNodeFixup extends Operation {
        public static final int $stable = 0;
        public static final InsertNodeFixup INSTANCE = null;

        static {
            INSTANCE = new InsertNodeFixup();
        }

        private InsertNodeFixup() {
            int r2 = 1;
            super(r2, 2, null);
        }

        /* JADX INFO: renamed from: getFactory-HpuvwBQ, reason: not valid java name */
        public final int m3838getFactoryHpuvwBQ() {
            return ObjectParameter.m3846constructorimpl(0);
        }

        public final int getInsertIndex() {
            return 0;
        }

        /* JADX INFO: renamed from: getGroupAnchor-HpuvwBQ, reason: not valid java name */
        public final int m3839getGroupAnchorHpuvwBQ() {
            return ObjectParameter.m3846constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public String intParamName(int parameter) {
            if (parameter != 0) goto L6;
            return "insertIndex";
        L6:
            return super.intParamName(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3820objectParamName31yXWZQ(int parameter) {
            if (ObjectParameter.m3848equalsimpl0(parameter, ObjectParameter.m3846constructorimpl(0)) == false) goto L6;
            return "factory";
        L6:
            if (ObjectParameter.m3848equalsimpl0(parameter, ObjectParameter.m3846constructorimpl(1)) == false) goto L9;
            return "groupAnchor";
        L9:
            return super.mo3820objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer $this$execute, Applier<?> r7, SlotWriter slots, RememberManager rememberManager) {
            Object node = ((Function0) $this$execute.mo3866getObject31yXWZQ(ObjectParameter.m3846constructorimpl(0))).invoke();
            Anchor groupAnchor = (Anchor) $this$execute.mo3866getObject31yXWZQ(ObjectParameter.m3846constructorimpl(1));
            int insertIndex = $this$execute.getInt(0);
            Intrinsics.checkNotNull(r7, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            slots.updateNode(groupAnchor, node);
            r7.insertTopDown(insertIndex, node);
            r7.down(node);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$InsertSlots;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Anchor", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/Anchor;", "getAnchor-HpuvwBQ", "()I", "FromSlotTable", "Landroidx/compose/runtime/SlotTable;", "getFromSlotTable-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InsertSlots extends Operation {
        public static final int $stable = 0;
        public static final InsertSlots INSTANCE = null;

        static {
            INSTANCE = new InsertSlots();
        }

        private InsertSlots() {
            int r2 = 0;
            int r3 = 2;
            super(r2, r3, 1, null);
        }

        /* JADX INFO: renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m3840getAnchorHpuvwBQ() {
            return ObjectParameter.m3846constructorimpl(0);
        }

        /* JADX INFO: renamed from: getFromSlotTable-HpuvwBQ, reason: not valid java name */
        public final int m3841getFromSlotTableHpuvwBQ() {
            return ObjectParameter.m3846constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3820objectParamName31yXWZQ(int parameter) {
            if (ObjectParameter.m3848equalsimpl0(parameter, ObjectParameter.m3846constructorimpl(0)) == false) goto L6;
            return "anchor";
        L6:
            if (ObjectParameter.m3848equalsimpl0(parameter, ObjectParameter.m3846constructorimpl(1)) == false) goto L9;
            return "from";
        L9:
            return super.mo3820objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer $this$execute, Applier<?> r6, SlotWriter slots, RememberManager rememberManager) {
            SlotTable insertTable = (SlotTable) $this$execute.mo3866getObject31yXWZQ(ObjectParameter.m3846constructorimpl(1));
            Anchor anchor = (Anchor) $this$execute.mo3866getObject31yXWZQ(ObjectParameter.m3846constructorimpl(0));
            slots.beginInsert();
            slots.moveFrom(insertTable, anchor.toIndexFor(insertTable), false);
            slots.endInsert();
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0013\u001a\u00020\u0014*\u00020\u00152\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007R\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Anchor", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/Anchor;", "getAnchor-HpuvwBQ", "()I", "Fixups", "Landroidx/compose/runtime/changelist/FixupList;", "getFixups-HpuvwBQ", "FromSlotTable", "Landroidx/compose/runtime/SlotTable;", "getFromSlotTable-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InsertSlotsWithFixups extends Operation {
        public static final int $stable = 0;
        public static final InsertSlotsWithFixups INSTANCE = null;

        static {
            INSTANCE = new InsertSlotsWithFixups();
        }

        private InsertSlotsWithFixups() {
            int r2 = 0;
            int r3 = 3;
            super(r2, r3, 1, null);
        }

        /* JADX INFO: renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m3842getAnchorHpuvwBQ() {
            return ObjectParameter.m3846constructorimpl(0);
        }

        /* JADX INFO: renamed from: getFromSlotTable-HpuvwBQ, reason: not valid java name */
        public final int m3844getFromSlotTableHpuvwBQ() {
            return ObjectParameter.m3846constructorimpl(1);
        }

        /* JADX INFO: renamed from: getFixups-HpuvwBQ, reason: not valid java name */
        public final int m3843getFixupsHpuvwBQ() {
            return ObjectParameter.m3846constructorimpl(2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3820objectParamName31yXWZQ(int parameter) {
            if (ObjectParameter.m3848equalsimpl0(parameter, ObjectParameter.m3846constructorimpl(0)) == false) goto L6;
            return "anchor";
        L6:
            if (ObjectParameter.m3848equalsimpl0(parameter, ObjectParameter.m3846constructorimpl(1)) == false) goto L9;
            return "from";
        L9:
            if (ObjectParameter.m3848equalsimpl0(parameter, ObjectParameter.m3846constructorimpl(2)) == false) goto L12;
            return "fixups";
        L12:
            return super.mo3820objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer $this$execute, Applier<?> r13, SlotWriter slots, RememberManager rememberManager) {
            SlotTable insertTable = (SlotTable) $this$execute.mo3866getObject31yXWZQ(ObjectParameter.m3846constructorimpl(1));
            Anchor anchor = (Anchor) $this$execute.mo3866getObject31yXWZQ(ObjectParameter.m3846constructorimpl(0));
            FixupList fixups = (FixupList) $this$execute.mo3866getObject31yXWZQ(ObjectParameter.m3846constructorimpl(2));
            SlotWriter writer$iv = insertTable.openWriter();
            fixups.executeAndFlushAllPendingFixups(r13, writer$iv, rememberManager);     // Catch: Throwable -> L6
            Unit r9 = Unit.INSTANCE;     // Catch: Throwable -> L6
            writer$iv.close(true);
            slots.beginInsert();
            slots.moveFrom(insertTable, anchor.toIndexFor(insertTable), false);
            slots.endInsert();
            return;
        L6:
            th = move-exception;
            writer$iv.close(false);
            throw th;
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0004j\u0002`\nH\u0016J(\u0010\u000b\u001a\u00020\f*\u00020\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0012\u0010\u0003\u001a\u00020\u00048Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$MoveCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Offset", "", "getOffset", "()I", "intParamName", "", "parameter", "Landroidx/compose/runtime/changelist/IntParameter;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MoveCurrentGroup extends Operation {
        public static final int $stable = 0;
        public static final MoveCurrentGroup INSTANCE = null;

        static {
            INSTANCE = new MoveCurrentGroup();
        }

        private MoveCurrentGroup() {
            int r2 = 1;
            int r3 = 0;
            super(r2, r3, 2, null);
        }

        public final int getOffset() {
            return 0;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public String intParamName(int parameter) {
            if (parameter != 0) goto L6;
            return "offset";
        L6:
            return super.intParamName(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer $this$execute, Applier<?> r4, SlotWriter slots, RememberManager rememberManager) {
            slots.moveGroup($this$execute.getInt(0));
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0004j\u0002`\u000eH\u0016J(\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0012\u0010\u0003\u001a\u00020\u00048Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u00048Æ\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0012\u0010\t\u001a\u00020\u00048Æ\u0002¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$MoveNode;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Count", "", "getCount", "()I", "From", "getFrom", "To", "getTo", "intParamName", "", "parameter", "Landroidx/compose/runtime/changelist/IntParameter;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MoveNode extends Operation {
        public static final int $stable = 0;
        public static final MoveNode INSTANCE = null;

        static {
            INSTANCE = new MoveNode();
        }

        private MoveNode() {
            int r2 = 3;
            int r3 = 0;
            super(r2, r3, 2, null);
        }

        public final int getFrom() {
            return 0;
        }

        public final int getTo() {
            return 1;
        }

        public final int getCount() {
            return 2;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public String intParamName(int parameter) {
            if (parameter != 0) goto L6;
            return "from";
        L6:
            if (parameter != 1) goto L9;
            return "to";
        L9:
            if (parameter != 2) goto L12;
            return "count";
        L12:
            return super.intParamName(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer $this$execute, Applier<?> r6, SlotWriter slots, RememberManager rememberManager) {
            r6.move($this$execute.getInt(0), $this$execute.getInt(1), $this$execute.getInt(2));
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0088\u0001\u0003¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "T", "", "offset", "", "constructor-impl", "(I)I", "getOffset", "()I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class ObjectParameter<T> {
        private final int offset;

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ ObjectParameter m3845boximpl(int r1) {
            return new ObjectParameter(r1);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static <T> int m3846constructorimpl(int r0) {
            return r0;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m3847equalsimpl(int r2, Object r3) {
            if ((r3 instanceof ObjectParameter) == true) goto L6;
            return false;
        L6:
            if (r2 == ((ObjectParameter) r3).m3851unboximpl()) goto L8;
            return false;
        L8:
            return true;
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m3848equalsimpl0(int r1, int r2) {
            if (r1 != r2) goto L4;
            return true;
        L4:
            return false;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m3849hashCodeimpl(int r1) {
            return Integer.hashCode(r1);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m3850toStringimpl(int r2) {
            return "ObjectParameter(offset=" + r2 + ')';
        }

        public boolean equals(Object r2) {
            return m3847equalsimpl(this.offset, r2);
        }

        public int hashCode() {
            return m3849hashCodeimpl(this.offset);
        }

        public String toString() {
            return m3850toStringimpl(this.offset);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m3851unboximpl() {
            return this.offset;
        }

        private /* synthetic */ ObjectParameter(int offset) {
            this.offset = offset;
        }

        public final int getOffset() {
            return this.offset;
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\tj\u0002`\u000eH\u0016J\u001e\u0010\u000f\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0012\u001a\u00020\u0013*\u00020\u00142\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\t8Æ\u0002¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "GroupAnchor", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/Anchor;", "getGroupAnchor-HpuvwBQ", "()I", "InsertIndex", "", "getInsertIndex", "intParamName", "", "parameter", "Landroidx/compose/runtime/changelist/IntParameter;", "objectParamName", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PostInsertNodeFixup extends Operation {
        public static final int $stable = 0;
        public static final PostInsertNodeFixup INSTANCE = null;

        static {
            INSTANCE = new PostInsertNodeFixup();
        }

        private PostInsertNodeFixup() {
            int r0 = 1;
            super(r0, r0, null);
        }

        public final int getInsertIndex() {
            return 0;
        }

        /* JADX INFO: renamed from: getGroupAnchor-HpuvwBQ, reason: not valid java name */
        public final int m3852getGroupAnchorHpuvwBQ() {
            return ObjectParameter.m3846constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public String intParamName(int parameter) {
            if (parameter != 0) goto L6;
            return "insertIndex";
        L6:
            return super.intParamName(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3820objectParamName31yXWZQ(int parameter) {
            if (ObjectParameter.m3848equalsimpl0(parameter, ObjectParameter.m3846constructorimpl(0)) == false) goto L6;
            return "groupAnchor";
        L6:
            return super.mo3820objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer $this$execute, Applier<?> r6, SlotWriter slots, RememberManager rememberManager) {
            Anchor groupAnchor = (Anchor) $this$execute.mo3866getObject31yXWZQ(ObjectParameter.m3846constructorimpl(0));
            int insertIndex = $this$execute.getInt(0);
            r6.up();
            Intrinsics.checkNotNull(r6, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            Object nodeToInsert = slots.node(groupAnchor);
            r6.insertBottomUp(insertIndex, nodeToInsert);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0013\u001a\u00020\u0014*\u00020\u00152\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007R\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Composition", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/ControlledComposition;", "getComposition-HpuvwBQ", "()I", "ParentCompositionContext", "Landroidx/compose/runtime/CompositionContext;", "getParentCompositionContext-HpuvwBQ", "Reference", "Landroidx/compose/runtime/MovableContentStateReference;", "getReference-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ReleaseMovableGroupAtCurrent extends Operation {
        public static final int $stable = 0;
        public static final ReleaseMovableGroupAtCurrent INSTANCE = null;

        static {
            INSTANCE = new ReleaseMovableGroupAtCurrent();
        }

        private ReleaseMovableGroupAtCurrent() {
            int r2 = 0;
            int r3 = 3;
            super(r2, r3, 1, null);
        }

        /* JADX INFO: renamed from: getComposition-HpuvwBQ, reason: not valid java name */
        public final int m3853getCompositionHpuvwBQ() {
            return ObjectParameter.m3846constructorimpl(0);
        }

        /* JADX INFO: renamed from: getParentCompositionContext-HpuvwBQ, reason: not valid java name */
        public final int m3854getParentCompositionContextHpuvwBQ() {
            return ObjectParameter.m3846constructorimpl(1);
        }

        /* JADX INFO: renamed from: getReference-HpuvwBQ, reason: not valid java name */
        public final int m3855getReferenceHpuvwBQ() {
            return ObjectParameter.m3846constructorimpl(2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3820objectParamName31yXWZQ(int parameter) {
            if (ObjectParameter.m3848equalsimpl0(parameter, ObjectParameter.m3846constructorimpl(0)) == false) goto L6;
            return "composition";
        L6:
            if (ObjectParameter.m3848equalsimpl0(parameter, ObjectParameter.m3846constructorimpl(1)) == false) goto L9;
            return "parentCompositionContext";
        L9:
            if (ObjectParameter.m3848equalsimpl0(parameter, ObjectParameter.m3846constructorimpl(2)) == false) goto L12;
            return "reference";
        L12:
            return super.mo3820objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer $this$execute, Applier<?> r7, SlotWriter slots, RememberManager rememberManager) {
            ControlledComposition composition = (ControlledComposition) $this$execute.mo3866getObject31yXWZQ(ObjectParameter.m3846constructorimpl(0));
            MovableContentStateReference reference = (MovableContentStateReference) $this$execute.mo3866getObject31yXWZQ(ObjectParameter.m3846constructorimpl(2));
            CompositionContext parentContext = (CompositionContext) $this$execute.mo3866getObject31yXWZQ(ObjectParameter.m3846constructorimpl(1));
            MovableContentState state = ComposerKt.extractMovableContentAtCurrent(composition, reference, slots, null);
            parentContext.movableContentStateReleased$runtime_release(reference, state, r7);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\r\u001a\u00020\u000e*\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$Remember;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Value", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/RememberObserverHolder;", "getValue-HpuvwBQ", "()I", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Remember extends Operation {
        public static final int $stable = 0;
        public static final Remember INSTANCE = null;

        static {
            INSTANCE = new Remember();
        }

        private Remember() {
            int r0 = 1;
            int r2 = 0;
            super(r2, r0, r0, null);
        }

        /* JADX INFO: renamed from: getValue-HpuvwBQ, reason: not valid java name */
        public final int m3856getValueHpuvwBQ() {
            return ObjectParameter.m3846constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3820objectParamName31yXWZQ(int parameter) {
            if (ObjectParameter.m3848equalsimpl0(parameter, ObjectParameter.m3846constructorimpl(0)) == false) goto L6;
            return "value";
        L6:
            return super.mo3820objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer $this$execute, Applier<?> r5, SlotWriter slots, RememberManager rememberManager) {
            rememberManager.remembering((RememberObserverHolder) $this$execute.mo3866getObject31yXWZQ(ObjectParameter.m3846constructorimpl(0)));
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\r\u001a\u00020\u000e*\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$RememberPausingScope;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Scope", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "getScope-HpuvwBQ", "()I", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RememberPausingScope extends Operation {
        public static final int $stable = 0;
        public static final RememberPausingScope INSTANCE = null;

        static {
            INSTANCE = new RememberPausingScope();
        }

        private RememberPausingScope() {
            int r0 = 1;
            int r2 = 0;
            super(r2, r0, r0, null);
        }

        /* JADX INFO: renamed from: getScope-HpuvwBQ, reason: not valid java name */
        public final int m3857getScopeHpuvwBQ() {
            return ObjectParameter.m3846constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3820objectParamName31yXWZQ(int parameter) {
            if (ObjectParameter.m3848equalsimpl0(parameter, ObjectParameter.m3846constructorimpl(0)) == false) goto L6;
            return "scope";
        L6:
            return super.mo3820objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer $this$execute, Applier<?> r5, SlotWriter slots, RememberManager rememberManager) {
            RecomposeScopeImpl scope = (RecomposeScopeImpl) $this$execute.mo3866getObject31yXWZQ(ObjectParameter.m3846constructorimpl(0));
            rememberManager.rememberPausingScope(scope);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$RemoveCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RemoveCurrentGroup extends Operation {
        public static final int $stable = 0;
        public static final RemoveCurrentGroup INSTANCE = null;

        static {
            INSTANCE = new RemoveCurrentGroup();
        }

        private RemoveCurrentGroup() {
            int r2 = 0;
            super(r2, r2, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer $this$execute, Applier<?> r2, SlotWriter slots, RememberManager rememberManager) {
            ComposerKt.removeCurrentGroup(slots, rememberManager);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0004j\u0002`\fH\u0016J(\u0010\r\u001a\u00020\u000e*\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u0012\u0010\u0003\u001a\u00020\u00048Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u00048Æ\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$RemoveNode;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Count", "", "getCount", "()I", "RemoveIndex", "getRemoveIndex", "intParamName", "", "parameter", "Landroidx/compose/runtime/changelist/IntParameter;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RemoveNode extends Operation {
        public static final int $stable = 0;
        public static final RemoveNode INSTANCE = null;

        static {
            INSTANCE = new RemoveNode();
        }

        private RemoveNode() {
            int r2 = 2;
            super(r2, 0, r2, null);
        }

        public final int getRemoveIndex() {
            return 0;
        }

        public final int getCount() {
            return 1;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public String intParamName(int parameter) {
            if (parameter != 0) goto L6;
            return "removeIndex";
        L6:
            if (parameter != 1) goto L9;
            return "count";
        L9:
            return super.intParamName(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer $this$execute, Applier<?> r5, SlotWriter slots, RememberManager rememberManager) {
            r5.remove($this$execute.getInt(0), $this$execute.getInt(1));
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$ResetSlots;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ResetSlots extends Operation {
        public static final int $stable = 0;
        public static final ResetSlots INSTANCE = null;

        static {
            INSTANCE = new ResetSlots();
        }

        private ResetSlots() {
            int r2 = 0;
            super(r2, r2, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer $this$execute, Applier<?> r2, SlotWriter slots, RememberManager rememberManager) {
            slots.reset();
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000e\u001a\u00020\u0006*\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R$\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$SideEffect;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Effect", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Lkotlin/Function0;", "", "getEffect-HpuvwBQ", "()I", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SideEffect extends Operation {
        public static final int $stable = 0;
        public static final SideEffect INSTANCE = null;

        static {
            INSTANCE = new SideEffect();
        }

        private SideEffect() {
            int r0 = 1;
            int r2 = 0;
            super(r2, r0, r0, null);
        }

        /* JADX INFO: renamed from: getEffect-HpuvwBQ, reason: not valid java name */
        public final int m3858getEffectHpuvwBQ() {
            return ObjectParameter.m3846constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3820objectParamName31yXWZQ(int parameter) {
            if (ObjectParameter.m3848equalsimpl0(parameter, ObjectParameter.m3846constructorimpl(0)) == false) goto L6;
            return "effect";
        L6:
            return super.mo3820objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer $this$execute, Applier<?> r5, SlotWriter slots, RememberManager rememberManager) {
            rememberManager.sideEffect((Function0) $this$execute.mo3866getObject31yXWZQ(ObjectParameter.m3846constructorimpl(0)));
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$SkipToEndOfCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SkipToEndOfCurrentGroup extends Operation {
        public static final int $stable = 0;
        public static final SkipToEndOfCurrentGroup INSTANCE = null;

        static {
            INSTANCE = new SkipToEndOfCurrentGroup();
        }

        private SkipToEndOfCurrentGroup() {
            int r2 = 0;
            super(r2, r2, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer $this$execute, Applier<?> r2, SlotWriter slots, RememberManager rememberManager) {
            slots.skipToGroupEnd();
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\r\u001a\u00020\u000e*\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$StartResumingScope;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Scope", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "getScope-HpuvwBQ", "()I", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StartResumingScope extends Operation {
        public static final int $stable = 0;
        public static final StartResumingScope INSTANCE = null;

        static {
            INSTANCE = new StartResumingScope();
        }

        private StartResumingScope() {
            int r0 = 1;
            int r2 = 0;
            super(r2, r0, r0, null);
        }

        /* JADX INFO: renamed from: getScope-HpuvwBQ, reason: not valid java name */
        public final int m3859getScopeHpuvwBQ() {
            return ObjectParameter.m3846constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3820objectParamName31yXWZQ(int parameter) {
            if (ObjectParameter.m3848equalsimpl0(parameter, ObjectParameter.m3846constructorimpl(0)) == false) goto L6;
            return "scope";
        L6:
            return super.mo3820objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer $this$execute, Applier<?> r5, SlotWriter slots, RememberManager rememberManager) {
            RecomposeScopeImpl scope = (RecomposeScopeImpl) $this$execute.mo3866getObject31yXWZQ(ObjectParameter.m3846constructorimpl(0));
            rememberManager.startResumingScope(scope);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012$\b\u0002\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0006¢\u0006\u0002\u0010\u000bJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J(\u0010\u001a\u001a\u00020\n*\u00020\u001b2\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\tH\u0016R-\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00150\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$TestOperation;", "Landroidx/compose/runtime/changelist/Operation;", "ints", "", "objects", "block", "Lkotlin/Function3;", "Landroidx/compose/runtime/Applier;", "Landroidx/compose/runtime/SlotWriter;", "Landroidx/compose/runtime/RememberManager;", "", "(IILkotlin/jvm/functions/Function3;)V", "getBlock", "()Lkotlin/jvm/functions/Function3;", "intParams", "", "getIntParams$annotations", "()V", "getIntParams", "()Ljava/util/List;", "objParams", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "", "getObjParams", "toString", "", "execute", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "slots", "rememberManager", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TestOperation extends Operation {
        public static final int $stable = 0;
        private final Function3<Applier<?>, SlotWriter, RememberManager, Unit> block;
        private final List<Integer> intParams;
        private final List<ObjectParameter<Object>> objParams;

        static {
            $stable = 8;
        }

        public TestOperation() {
            int r1 = 0;
            int r2 = 0;
            Function3 r3 = null;
            this(r1, r2, r3, 7, null);
        }

        public static /* synthetic */ void getIntParams$annotations() {
        }

        public /* synthetic */ TestOperation(int r2, int r3, AnonymousClass1 r4, int r5, DefaultConstructorMarker r6) {
            if ((r5 & 1) == 0) goto L6;
            r2 = 0;
        L6:
            if ((r5 & 2) == 0) goto L9;
            r3 = 0;
        L9:
            if ((r5 & 4) == 0) goto L11;
            r4 = AnonymousClass1.INSTANCE;
        L11:
            this(r2, r3, r4);
        }

        public final Function3<Applier<?>, SlotWriter, RememberManager, Unit> getBlock() {
            return this.block;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TestOperation(int ints, int objects, Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> r8) {
            super(ints, objects, null);
            this.block = r8;
            ArrayList r0 = new ArrayList(ints);
            int r1 = 0;
            int r2 = 0;
        L3:
            if (r2 >= ints) goto L5;
            int it = r2;
            r0.add(Integer.valueOf(it));
            r2 = r2 + 1;
            goto L3
        L5:
            this.intParams = r0;
            ArrayList r3 = new ArrayList(objects);
        L6:
            if (r1 >= objects) goto L8;
            int index = r1;
            r3.add(ObjectParameter.m3845boximpl(ObjectParameter.m3846constructorimpl(index)));
            r1 = r1 + 1;
            goto L6
        L8:
            this.objParams = r3;
        }

        public final List<Integer> getIntParams() {
            return this.intParams;
        }

        public final List<ObjectParameter<Object>> getObjParams() {
            return this.objParams;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer $this$execute, Applier<?> r3, SlotWriter slots, RememberManager rememberManager) {
            this.block.invoke(r3, slots, rememberManager);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public String toString() {
            return "TestOperation(ints = " + getInts() + ", objects = " + getObjects() + ")@" + Utils_jvmKt.identityHashCode(this);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0004j\u0002`\nH\u0016J(\u0010\u000b\u001a\u00020\f*\u00020\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0012\u0010\u0003\u001a\u00020\u00048Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$TrimParentValues;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Count", "", "getCount", "()I", "intParamName", "", "parameter", "Landroidx/compose/runtime/changelist/IntParameter;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TrimParentValues extends Operation {
        public static final int $stable = 0;
        public static final TrimParentValues INSTANCE = null;

        static {
            INSTANCE = new TrimParentValues();
        }

        private TrimParentValues() {
            int r2 = 1;
            int r3 = 0;
            super(r2, r3, 2, null);
        }

        public final int getCount() {
            return 0;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public String intParamName(int parameter) {
            if (parameter != 0) goto L6;
            return "count";
        L6:
            return super.intParamName(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer $this$execute, Applier<?> r24, SlotWriter slots, RememberManager rememberManager) {
            int count = $this$execute.getInt(0);
            int slotsSize = slots.getSlotsSize();
            int groupIndex$iv = slots.getParent();
            SlotWriter this_$iv = slots;
            int slotsStart$iv = this_$iv.slotsStartIndex$runtime_release(groupIndex$iv);
            int slotsEnd$iv = this_$iv.slotsEndIndex$runtime_release(groupIndex$iv);
            int slotIndex$iv = Math.max(slotsStart$iv, slotsEnd$iv - count);
        L3:
            if (slotIndex$iv >= slotsEnd$iv) goto L16;
            Object value = SlotWriter.access$getSlots$p(this_$iv)[SlotWriter.access$dataIndexToDataAddress(this_$iv, slotIndex$iv)];
            int slotIndex = slotIndex$iv;
            if ((value instanceof RememberObserverHolder) == false) goto L12;
            int endRelativeOrder = slotsSize - slotIndex;
            Anchor anchor$iv = ((RememberObserverHolder) value).getAfter();
            int priority$iv = -1;
            int endRelativeAfter$iv = -1;
            if (anchor$iv != null) goto L9;
        L11:
            int endRelativeAfter = endRelativeAfter$iv;
            int slotsSize2 = slotsSize;
            RememberObserverHolder r2 = (RememberObserverHolder) value;
            SlotWriter this_$iv2 = this_$iv;
            int groupIndex$iv2 = groupIndex$iv;
            rememberManager.forgetting(r2, endRelativeOrder, priority$iv, endRelativeAfter);
        L15:
            slotIndex$iv = slotIndex$iv + 1;
            this_$iv = this_$iv2;
            slotsSize = slotsSize2;
            groupIndex$iv = groupIndex$iv2;
            goto L3
        L9:
            if (anchor$iv.getValid() == false) goto L11;
            int priority$iv2 = slots.anchorIndex(anchor$iv);
            endRelativeAfter$iv = slots.getSlotsSize() - slots.slotsEndAllIndex$runtime_release(priority$iv2);
            priority$iv = priority$iv2;
            goto L11
        L12:
            slotsSize2 = slotsSize;
            groupIndex$iv2 = groupIndex$iv;
            this_$iv2 = this_$iv;
            if ((value instanceof RecomposeScopeImpl) == false) goto L15;
            ((RecomposeScopeImpl) value).release();
            goto L15
        L16:
            slots.trimTailSlots(count);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\tj\u0002`\u0011H\u0016J\u001e\u0010\u0012\u001a\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\t8Æ\u0002¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007R \u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Anchor", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/Anchor;", "getAnchor-HpuvwBQ", "()I", "GroupSlotIndex", "", "getGroupSlotIndex", "Value", "", "getValue-HpuvwBQ", "intParamName", "", "parameter", "Landroidx/compose/runtime/changelist/IntParameter;", "objectParamName", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UpdateAnchoredValue extends Operation {
        public static final int $stable = 0;
        public static final UpdateAnchoredValue INSTANCE = null;

        static {
            INSTANCE = new UpdateAnchoredValue();
        }

        private UpdateAnchoredValue() {
            int r2 = 1;
            super(r2, 2, null);
        }

        /* JADX INFO: renamed from: getValue-HpuvwBQ, reason: not valid java name */
        public final int m3861getValueHpuvwBQ() {
            return ObjectParameter.m3846constructorimpl(0);
        }

        /* JADX INFO: renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m3860getAnchorHpuvwBQ() {
            return ObjectParameter.m3846constructorimpl(1);
        }

        public final int getGroupSlotIndex() {
            return 0;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public String intParamName(int parameter) {
            if (parameter != 0) goto L6;
            return "groupSlotIndex";
        L6:
            return super.intParamName(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3820objectParamName31yXWZQ(int parameter) {
            if (ObjectParameter.m3848equalsimpl0(parameter, ObjectParameter.m3846constructorimpl(0)) == false) goto L6;
            return "value";
        L6:
            if (ObjectParameter.m3848equalsimpl0(parameter, ObjectParameter.m3846constructorimpl(1)) == false) goto L9;
            return "anchor";
        L9:
            return super.mo3820objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer $this$execute, Applier<?> r19, SlotWriter slots, RememberManager rememberManager) {
            Object value = $this$execute.mo3866getObject31yXWZQ(ObjectParameter.m3846constructorimpl(0));
            Anchor anchor = (Anchor) $this$execute.mo3866getObject31yXWZQ(ObjectParameter.m3846constructorimpl(1));
            int groupSlotIndex = $this$execute.getInt(0);
            if ((value instanceof RememberObserverHolder) == false) goto L5;
            rememberManager.remembering((RememberObserverHolder) value);
        L5:
            int groupIndex = slots.anchorIndex(anchor);
            Object previous = slots.set(groupIndex, groupSlotIndex, value);
            if ((previous instanceof RememberObserverHolder) == false) goto L14;
            int endRelativeSlotOrder = slots.getSlotsSize() - slots.slotIndexOfGroupSlotIndex(groupIndex, groupSlotIndex);
            Anchor anchor$iv = ((RememberObserverHolder) previous).getAfter();
            int priority$iv = -1;
            int endRelativeAfter$iv = -1;
            if (anchor$iv != null) goto L10;
        L12:
            int priority = priority$iv;
            int endRelativeAfter = endRelativeAfter$iv;
            rememberManager.forgetting((RememberObserverHolder) previous, endRelativeSlotOrder, priority, endRelativeAfter);
            return;
        L10:
            if (anchor$iv.getValid() == false) goto L12;
            priority$iv = slots.anchorIndex(anchor$iv);
            endRelativeAfter$iv = slots.getSlotsSize() - slots.slotsEndAllIndex$runtime_release(priority$iv);
            goto L12
        L14:
            if ((previous instanceof RecomposeScopeImpl) == false) goto L18;
            ((RecomposeScopeImpl) previous).release();
            return;
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\r\u001a\u00020\u000e*\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R \u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$UpdateAuxData;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Data", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "", "getData-HpuvwBQ", "()I", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UpdateAuxData extends Operation {
        public static final int $stable = 0;
        public static final UpdateAuxData INSTANCE = null;

        static {
            INSTANCE = new UpdateAuxData();
        }

        private UpdateAuxData() {
            int r0 = 1;
            int r2 = 0;
            super(r2, r0, r0, null);
        }

        /* JADX INFO: renamed from: getData-HpuvwBQ, reason: not valid java name */
        public final int m3862getDataHpuvwBQ() {
            return ObjectParameter.m3846constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3820objectParamName31yXWZQ(int parameter) {
            if (ObjectParameter.m3848equalsimpl0(parameter, ObjectParameter.m3846constructorimpl(0)) == false) goto L6;
            return "data";
        L6:
            return super.mo3820objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer $this$execute, Applier<?> r5, SlotWriter slots, RememberManager rememberManager) {
            slots.updateAux($this$execute.mo3866getObject31yXWZQ(ObjectParameter.m3846constructorimpl(0)));
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0012\u001a\u00020\u0007*\u00020\u00132\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R9\u0010\u0003\u001a#\u0012\u001f\u0012\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\t\u0010\nR \u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\f\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$UpdateNode;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Block", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Lkotlin/Function2;", "", "", "Lkotlin/ExtensionFunctionType;", "getBlock-HpuvwBQ", "()I", "Value", "getValue-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UpdateNode extends Operation {
        public static final int $stable = 0;
        public static final UpdateNode INSTANCE = null;

        static {
            INSTANCE = new UpdateNode();
        }

        private UpdateNode() {
            int r2 = 0;
            int r3 = 2;
            super(r2, r3, 1, null);
        }

        /* JADX INFO: renamed from: getValue-HpuvwBQ, reason: not valid java name */
        public final int m3864getValueHpuvwBQ() {
            return ObjectParameter.m3846constructorimpl(0);
        }

        /* JADX INFO: renamed from: getBlock-HpuvwBQ, reason: not valid java name */
        public final int m3863getBlockHpuvwBQ() {
            return ObjectParameter.m3846constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3820objectParamName31yXWZQ(int parameter) {
            if (ObjectParameter.m3848equalsimpl0(parameter, ObjectParameter.m3846constructorimpl(0)) == false) goto L6;
            return "value";
        L6:
            if (ObjectParameter.m3848equalsimpl0(parameter, ObjectParameter.m3846constructorimpl(1)) == false) goto L9;
            return "block";
        L9:
            return super.mo3820objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer $this$execute, Applier<?> r6, SlotWriter slots, RememberManager rememberManager) {
            Object value = $this$execute.mo3866getObject31yXWZQ(ObjectParameter.m3846constructorimpl(0));
            r6.apply((Function2) $this$execute.mo3866getObject31yXWZQ(ObjectParameter.m3846constructorimpl(1)), value);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0004j\u0002`\u000eH\u0016J\u001e\u0010\u000f\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0012\u001a\u00020\u0013*\u00020\u00142\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u0012\u0010\u0003\u001a\u00020\u00048Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$UpdateValue;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "GroupSlotIndex", "", "getGroupSlotIndex", "()I", "Value", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "", "getValue-HpuvwBQ", "intParamName", "", "parameter", "Landroidx/compose/runtime/changelist/IntParameter;", "objectParamName", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UpdateValue extends Operation {
        public static final int $stable = 0;
        public static final UpdateValue INSTANCE = null;

        static {
            INSTANCE = new UpdateValue();
        }

        private UpdateValue() {
            int r0 = 1;
            super(r0, r0, null);
        }

        /* JADX INFO: renamed from: getValue-HpuvwBQ, reason: not valid java name */
        public final int m3865getValueHpuvwBQ() {
            return ObjectParameter.m3846constructorimpl(0);
        }

        public final int getGroupSlotIndex() {
            return 0;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public String intParamName(int parameter) {
            if (parameter != 0) goto L6;
            return "groupSlotIndex";
        L6:
            return super.intParamName(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* JADX INFO: renamed from: objectParamName-31yXWZQ */
        public String mo3820objectParamName31yXWZQ(int parameter) {
            if (ObjectParameter.m3848equalsimpl0(parameter, ObjectParameter.m3846constructorimpl(0)) == false) goto L6;
            return "value";
        L6:
            return super.mo3820objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer $this$execute, Applier<?> r8, SlotWriter slots, RememberManager rememberManager) {
            Object value = $this$execute.mo3866getObject31yXWZQ(ObjectParameter.m3846constructorimpl(0));
            int groupSlotIndex = $this$execute.getInt(0);
            if ((value instanceof RememberObserverHolder) == false) goto L5;
            rememberManager.remembering((RememberObserverHolder) value);
        L5:
            Object previous = slots.set(slots.getCurrentGroup(), groupSlotIndex, value);
            if ((previous instanceof RememberObserverHolder) == false) goto L9;
            int endRelativeOrder = slots.getSlotsSize() - slots.slotIndexOfGroupSlotIndex(slots.getCurrentGroup(), groupSlotIndex);
            rememberManager.forgetting((RememberObserverHolder) previous, endRelativeOrder, -1, -1);
            return;
        L9:
            if ((previous instanceof RecomposeScopeImpl) == false) goto L13;
            ((RecomposeScopeImpl) previous).release();
            return;
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0004j\u0002`\nH\u0016J(\u0010\u000b\u001a\u00020\f*\u00020\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0012\u0010\u0003\u001a\u00020\u00048Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$Ups;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Count", "", "getCount", "()I", "intParamName", "", "parameter", "Landroidx/compose/runtime/changelist/IntParameter;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Ups extends Operation {
        public static final int $stable = 0;
        public static final Ups INSTANCE = null;

        static {
            INSTANCE = new Ups();
        }

        private Ups() {
            int r2 = 1;
            int r3 = 0;
            super(r2, r3, 2, null);
        }

        public final int getCount() {
            return 0;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public String intParamName(int parameter) {
            if (parameter != 0) goto L6;
            return "count";
        L6:
            return super.intParamName(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer $this$execute, Applier<?> r6, SlotWriter slots, RememberManager rememberManager) {
            int r0 = 0;
            int r1 = $this$execute.getInt(0);
        L3:
            if (r0 >= r1) goto L5;
            r6.up();
            r0 = r0 + 1;
            goto L3
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$UseCurrentNode;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UseCurrentNode extends Operation {
        public static final int $stable = 0;
        public static final UseCurrentNode INSTANCE = null;

        static {
            INSTANCE = new UseCurrentNode();
        }

        private UseCurrentNode() {
            int r2 = 0;
            super(r2, r2, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer $this$execute, Applier<?> r2, SlotWriter slots, RememberManager rememberManager) {
            r2.reuse();
        }
    }

    static {
    }

    public /* synthetic */ Operation(int r1, int r2, DefaultConstructorMarker r3) {
        this(r1, r2);
    }

    public abstract void execute(OperationArgContainer r1, Applier<?> r2, SlotWriter r3, RememberManager r4);

    private Operation(int ints, int objects) {
        this.ints = ints;
        this.objects = objects;
    }

    public /* synthetic */ Operation(int r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = 0;
    L8:
        this(r2, r3, null);
    }

    public final int getInts() {
        return this.ints;
    }

    public final int getObjects() {
        return this.objects;
    }

    public final String getName() {
        String r0 = Reflection.getOrCreateKotlinClass(getClass()).getSimpleName();
        if (r0 != null) goto L6;
        return "";
    L6:
        return r0;
    }

    public String intParamName(int parameter) {
        return "IntParameter(" + parameter + ')';
    }

    /* JADX INFO: renamed from: objectParamName-31yXWZQ, reason: not valid java name */
    public String mo3820objectParamName31yXWZQ(int parameter) {
        return "ObjectParameter(" + parameter + ')';
    }

    public String toString() {
        return getName();
    }
}
