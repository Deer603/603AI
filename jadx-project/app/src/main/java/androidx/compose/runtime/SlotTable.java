package androidx.compose.runtime;

import androidx.autofill.HintConstants;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.compose.ui.spatial.RectListKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J\u000e\u0010;\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\u001cJ\u000e\u0010=\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020\u0007J=\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2&\u0010-\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020/\u0018\u00010.j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020/\u0018\u0001`0H\u0000¢\u0006\u0002\bBJ\u008f\u0001\u0010>\u001a\u00020?2\u0006\u00109\u001a\u00020C2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001c2\u000e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0&2\u0006\u0010+\u001a\u00020\u001c2\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2&\u0010-\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020/\u0018\u00010.j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020/\u0018\u0001`02\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0000¢\u0006\u0004\bB\u0010DJ\u0006\u0010E\u001a\u00020?J\u0006\u0010F\u001a\u00020?J\u0006\u0010G\u001a\u00020!J\u000e\u0010H\u001a\b\u0012\u0004\u0012\u00020\u001c0IH\u0002J\u0012\u0010J\u001a\u0004\u0018\u00010\u00032\u0006\u0010K\u001a\u00020$H\u0016J\u0012\u0010L\u001a\u0004\u0018\u00010M2\u0006\u0010N\u001a\u00020\u001cH\u0002J\u0016\u0010O\u001a\u00020!2\u0006\u0010P\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020\u0007J\u000e\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u001c0IH\u0002J\u001d\u0010R\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010I2\u0006\u0010S\u001a\u00020\u001cH\u0000¢\u0006\u0002\bTJ\u000f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00030VH\u0096\u0002J\u000e\u0010W\u001a\b\u0012\u0004\u0012\u00020\u001c0IH\u0002J\u000e\u0010X\u001a\b\u0012\u0004\u0012\u00020\u001c0IH\u0002J\u0006\u0010Y\u001a\u00020AJ\u0006\u0010Z\u001a\u00020CJ\u000e\u0010[\u001a\u00020!2\u0006\u0010;\u001a\u00020\u0007J\u000e\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u001c0IH\u0002J7\u0010]\u001a\u0002H^\"\u0004\b\u0000\u0010^2!\u0010_\u001a\u001d\u0012\u0013\u0012\u00110A¢\u0006\f\ba\u0012\b\bb\u0012\u0004\b\b(@\u0012\u0004\u0012\u0002H^0`H\u0086\b¢\u0006\u0002\u0010cJ\u0087\u0001\u0010d\u001a\u00020?2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001c2\u000e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0&2\u0006\u0010+\u001a\u00020\u001c2\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2&\u0010-\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020/\u0018\u00010.j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020/\u0018\u0001`02\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0000¢\u0006\u0004\be\u0010fJ\u001f\u0010g\u001a\u0004\u0018\u00010$2\u0006\u0010N\u001a\u00020\u001c2\u0006\u0010h\u001a\u00020\u001cH\u0000¢\u0006\u0002\biJ\u001d\u0010j\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0I2\u0006\u0010N\u001a\u00020\u001cH\u0000¢\u0006\u0002\bkJ\u0010\u0010l\u001a\u0004\u0018\u00010/2\u0006\u0010N\u001a\u00020\u001cJ\u0006\u0010m\u001a\u00020nJ\u0012\u0010o\u001a\u0004\u0018\u00010\u00072\u0006\u0010<\u001a\u00020\u001cH\u0002J\u0006\u0010p\u001a\u00020?J7\u0010q\u001a\u0002H^\"\u0004\b\u0000\u0010^2!\u0010_\u001a\u001d\u0012\u0013\u0012\u00110C¢\u0006\f\ba\u0012\b\bb\u0012\u0004\b\b(9\u0012\u0004\u0012\u0002H^0`H\u0086\b¢\u0006\u0002\u0010cJ \u0010r\u001a\u00020\u001c*\u00060sj\u0002`t2\u0006\u0010<\u001a\u00020\u001c2\u0006\u0010u\u001a\u00020\u001cH\u0002R*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u001c@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\"R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R0\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0&2\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0&@BX\u0086\u000e¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u001e\u0010+\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u001c@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR:\u0010-\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020/\u0018\u00010.j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020/\u0018\u0001`0X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u00105\u001a\u00020\u001cX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001f\"\u0004\b7\u00108R\u001e\u00109\u001a\u00020!2\u0006\u0010\u0017\u001a\u00020!@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\"¨\u0006v"}, d2 = {"Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/tooling/CompositionData;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "()V", "anchors", "Ljava/util/ArrayList;", "Landroidx/compose/runtime/Anchor;", "Lkotlin/collections/ArrayList;", "getAnchors$runtime_release", "()Ljava/util/ArrayList;", "setAnchors$runtime_release", "(Ljava/util/ArrayList;)V", "calledByMap", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/collection/MutableIntSet;", "getCalledByMap$runtime_release", "()Landroidx/collection/MutableIntObjectMap;", "setCalledByMap$runtime_release", "(Landroidx/collection/MutableIntObjectMap;)V", "compositionGroups", "getCompositionGroups", "()Ljava/lang/Iterable;", "<set-?>", "", "groups", "getGroups", "()[I", "", "groupsSize", "getGroupsSize", "()I", "isEmpty", "", "()Z", "lock", "", "readers", "", "slots", "getSlots", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "slotsSize", "getSlotsSize", "sourceInformationMap", "Ljava/util/HashMap;", "Landroidx/compose/runtime/GroupSourceInformation;", "Lkotlin/collections/HashMap;", "getSourceInformationMap$runtime_release", "()Ljava/util/HashMap;", "setSourceInformationMap$runtime_release", "(Ljava/util/HashMap;)V", "version", "getVersion$runtime_release", "setVersion$runtime_release", "(I)V", "writer", "getWriter$runtime_release", "anchor", "index", "anchorIndex", "close", "", "reader", "Landroidx/compose/runtime/SlotReader;", "close$runtime_release", "Landroidx/compose/runtime/SlotWriter;", "(Landroidx/compose/runtime/SlotWriter;[II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Landroidx/collection/MutableIntObjectMap;)V", "collectCalledByInformation", "collectSourceInformation", "containsMark", "dataIndexes", "", "find", "identityToFind", "findEffectiveRecomposeScope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "group", "groupContainsAnchor", "groupIndex", "groupSizes", "invalidateGroupsWithKey", "target", "invalidateGroupsWithKey$runtime_release", "iterator", "", "keys", "nodes", "openReader", "openWriter", "ownsAnchor", "parentIndexes", "read", "T", "block", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "setTo", "setTo$runtime_release", "([II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Landroidx/collection/MutableIntObjectMap;)V", "slot", "slotIndex", "slot$runtime_release", "slotsOf", "slotsOf$runtime_release", "sourceInformationOf", "toDebugString", "", "tryAnchor", "verifyWellFormed", "write", "emitGroup", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "level", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SlotTable implements CompositionData, Iterable<CompositionGroup>, KMappedMarker {
    public static final int $stable = 0;
    private ArrayList<Anchor> anchors;
    private MutableIntObjectMap<MutableIntSet> calledByMap;
    private int[] groups;
    private int groupsSize;
    private final Object lock;
    private int readers;
    private Object[] slots;
    private int slotsSize;
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;
    private int version;
    private boolean writer;

    static {
        $stable = 8;
    }

    public SlotTable() {
        this.groups = new int[0];
        this.slots = new Object[0];
        this.lock = new Object();
        this.anchors = new ArrayList();
    }

    public final int[] getGroups() {
        return this.groups;
    }

    public final int getGroupsSize() {
        return this.groupsSize;
    }

    public final Object[] getSlots() {
        return this.slots;
    }

    public final int getSlotsSize() {
        return this.slotsSize;
    }

    public final boolean getWriter$runtime_release() {
        return this.writer;
    }

    public final int getVersion$runtime_release() {
        return this.version;
    }

    public final void setVersion$runtime_release(int r1) {
        this.version = r1;
    }

    public final ArrayList<Anchor> getAnchors$runtime_release() {
        return this.anchors;
    }

    public final void setAnchors$runtime_release(ArrayList<Anchor> r1) {
        this.anchors = r1;
    }

    public final HashMap<Anchor, GroupSourceInformation> getSourceInformationMap$runtime_release() {
        return this.sourceInformationMap;
    }

    public final void setSourceInformationMap$runtime_release(HashMap<Anchor, GroupSourceInformation> r1) {
        this.sourceInformationMap = r1;
    }

    public final MutableIntObjectMap<MutableIntSet> getCalledByMap$runtime_release() {
        return this.calledByMap;
    }

    public final void setCalledByMap$runtime_release(MutableIntObjectMap<MutableIntSet> r1) {
        this.calledByMap = r1;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        if (this.groupsSize != 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final <T> T read(Function1<? super SlotReader, ? extends T> r5) {
        SlotReader reader = openReader();
        T r3 = r5.invoke(reader);     // Catch: Throwable -> L6
        reader.close();
        return r3;
    L6:
        th = move-exception;
        reader.close();
        throw th;
    }

    public final <T> T write(Function1<? super SlotWriter, ? extends T> r8) {
        SlotWriter writer = openWriter();
        T r4 = r8.invoke(writer);     // Catch: Throwable -> L6
        writer.close(true);
        return r4;
    L6:
        th = move-exception;
        writer.close(false);
        throw th;
    }

    public final SlotReader openReader() {
        if (this.writer == true) goto L7;
        this.readers++;
        return new SlotReader(this);
    L7:
        throw new IllegalStateException("Cannot read while a writer is pending".toString());
    }

    public final SlotWriter openWriter() {
        boolean value$iv = !this.writer;
        if (value$iv == true) goto L6;
        ComposerKt.composeImmediateRuntimeError("Cannot start a writer when another writer is pending");
    L6:
        if (this.readers > 0) goto L8;
        boolean value$iv2 = true;
    L10:
        if (value$iv2 == true) goto L12;
        ComposerKt.composeImmediateRuntimeError("Cannot start a writer when a reader is pending");
    L12:
        this.writer = true;
        this.version++;
        return new SlotWriter(this);
    L8:
        value$iv2 = false;
        goto L10
    }

    public final Anchor anchor(int index) {
        boolean value$iv = true;
        boolean value$iv2 = !this.writer;
        if (value$iv2 == true) goto L6;
        ComposerKt.composeImmediateRuntimeError("use active SlotWriter to create an anchor location instead");
    L6:
        if (index >= 0) goto L8;
    L10:
        value$iv = false;
    L12:
        if (value$iv == true) goto L14;
        PreconditionsKt.throwIllegalArgumentException("Parameter index is out of range");
    L14:
        ArrayList<Anchor> r0 = this.anchors;
        int effectiveSize$iv = this.groupsSize;
        int location$iv = SlotTableKt.access$search(r0, index, effectiveSize$iv);
        if (location$iv >= 0) goto L19;
        Anchor anchor$iv = new Anchor(index);
        r0.add(-(location$iv + 1), anchor$iv);
        return anchor$iv;
    L19:
        return r0.get(location$iv);
    L8:
        if (index >= this.groupsSize) goto L10;
        goto L10
    }

    private final Anchor tryAnchor(int index) {
        boolean r1 = true;
        boolean value$iv = !this.writer;
        if (value$iv == true) goto L6;
        ComposerKt.composeImmediateRuntimeError("use active SlotWriter to crate an anchor for location instead");
    L6:
        if (index >= 0) goto L8;
    L10:
        r1 = false;
    L11:
        if (r1 == true) goto L15;
        return null;
    L15:
        return SlotTableKt.access$find(this.anchors, index, this.groupsSize);
    L8:
        if (index >= this.groupsSize) goto L10;
        goto L10
    }

    public final int anchorIndex(Anchor anchor) {
        boolean value$iv = !this.writer;
        if (value$iv == true) goto L5;
        ComposerKt.composeImmediateRuntimeError("Use active SlotWriter to determine anchor location instead");
    L5:
        boolean value$iv2 = anchor.getValid();
        if (value$iv2 == true) goto L9;
        PreconditionsKt.throwIllegalArgumentException("Anchor refers to a group that was removed");
    L9:
        return anchor.getLocation$runtime_release();
    }

    public final boolean ownsAnchor(Anchor anchor) {
        if (anchor.getValid() == false) goto L14;
        int it = SlotTableKt.access$search(this.anchors, anchor.getLocation$runtime_release(), this.groupsSize);
        if (it >= 0) goto L7;
    L9:
        int it2 = 0;
    L10:
        if (it2 != 0) goto L13;
        return false;
    L13:
        return true;
    L7:
        if (Intrinsics.areEqual(this.anchors.get(it), anchor) == false) goto L9;
        it2 = 1;
        goto L10
    L14:
        return false;
    }

    public final boolean groupContainsAnchor(int groupIndex, Anchor anchor) {
        boolean value$iv = !this.writer;
        if (value$iv == true) goto L6;
        ComposerKt.composeImmediateRuntimeError("Writer is active");
    L6:
        if (groupIndex >= 0) goto L8;
    L10:
        boolean value$iv2 = false;
    L12:
        if (value$iv2 == true) goto L14;
        ComposerKt.composeImmediateRuntimeError("Invalid group index");
    L14:
        boolean value$iv3 = ownsAnchor(anchor);
        if (value$iv3 == false) goto L24;
        int r2 = SlotTableKt.access$groupSize(this.groups, groupIndex) + groupIndex;
        int r3 = anchor.getLocation$runtime_release();
        if (groupIndex > r3) goto L20;
        if (r3 >= r2) goto L20;
        boolean r4 = true;
    L21:
        if (r4 == false) goto L24;
        return true;
    L20:
        r4 = false;
    L24:
        return false;
    L8:
        if (groupIndex >= this.groupsSize) goto L10;
        value$iv2 = true;
        goto L12
    }

    public final void close$runtime_release(SlotReader reader, HashMap<Anchor, GroupSourceInformation> r7) {
        if (reader.getTable$runtime_release() == this) goto L5;
    L7:
        boolean value$iv = false;
    L9:
        if (value$iv == true) goto L11;
        ComposerKt.composeImmediateRuntimeError("Unexpected reader close()");
    L11:
        this.readers--;
        if (r7 == null) goto L26;
        Object lock$iv = this.lock;
        monitor-enter(lock$iv);
        HashMap<Anchor, GroupSourceInformation> r3 = this.sourceInformationMap;     // Catch: Throwable -> L23
        if (r3 == null) goto L19;
        r3.putAll(r7);     // Catch: Throwable -> L23
    L20:
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L23
        monitor-exit(lock$iv);
        return;
    L19:
        this.sourceInformationMap = r7;     // Catch: Throwable -> L23
    L23:
        th = move-exception;
        throw th;
    L26:
        return;
    L5:
        if (this.readers <= 0) goto L7;
        value$iv = true;
        goto L9
    }

    public final void close$runtime_release(SlotWriter writer, int[] groups, int groupsSize, Object[] slots, int slotsSize, ArrayList<Anchor> r14, HashMap<Anchor, GroupSourceInformation> r15, MutableIntObjectMap<MutableIntSet> r16) {
        if (writer.getTable$runtime_release() == this) goto L5;
    L7:
        boolean value$iv = false;
    L9:
        if (value$iv == true) goto L11;
        PreconditionsKt.throwIllegalArgumentException("Unexpected writer close()");
    L11:
        this.writer = false;
        setTo$runtime_release(groups, groupsSize, slots, slotsSize, r14, r15, r16);
        return;
    L5:
        if (this.writer == false) goto L7;
        value$iv = true;
        goto L9
    }

    public final void setTo$runtime_release(int[] groups, int groupsSize, Object[] slots, int slotsSize, ArrayList<Anchor> r5, HashMap<Anchor, GroupSourceInformation> r6, MutableIntObjectMap<MutableIntSet> r7) {
        this.groups = groups;
        this.groupsSize = groupsSize;
        this.slots = slots;
        this.slotsSize = slotsSize;
        this.anchors = r5;
        this.sourceInformationMap = r6;
        this.calledByMap = r7;
    }

    public final List<RecomposeScopeImpl> invalidateGroupsWithKey$runtime_release(int target) {
        List anchors = new ArrayList();
        List scopes = new ArrayList();
        Ref.BooleanRef allScopesFound = new Ref.BooleanRef();
        allScopesFound.element = true;
        int r2 = 0;
        MutableIntSet set = new MutableIntSet(r2, 1, null);
        set.add(target);
        set.add(-3);
        MutableIntObjectMap<MutableIntSet> r0 = this.calledByMap;
        if (r0 == null) goto L7;
        MutableIntSet it = r0.get(target);
        if (it == null) goto L7;
        set.addAll(it);
    L7:
        SlotReader reader$iv = openReader();
        invalidateGroupsWithKey$lambda$20$scanGroup(reader$iv, set, anchors, allScopesFound, this, scopes);     // Catch: Throwable -> L34
        Unit r1 = Unit.INSTANCE;     // Catch: Throwable -> L34
        reader$iv.close();
        SlotTable this_$iv = this;
        SlotWriter writer$iv = this_$iv.openWriter();
        writer$iv.startGroup();     // Catch: Throwable -> L30
        int index$iv = 0;
        int r8 = anchors.size();     // Catch: Throwable -> L30
    L11:
        if (index$iv >= r8) goto L22;
        Object item$iv = anchors.get(index$iv);     // Catch: Throwable -> L30
        Anchor anchor = (Anchor) item$iv;     // Catch: Throwable -> L30
        SlotTable this_$iv2 = this_$iv;
        MutableIntSet set2 = set;
    L28:
        th = th;
    L32:
        writer$iv.close(false);
        throw th;
    L17:
        if (anchor.toIndexFor(writer$iv) < writer$iv.getCurrentGroup()) goto L19;
        writer$iv.seek(anchor);     // Catch: Throwable -> L28
        writer$iv.bashCurrentGroup();     // Catch: Throwable -> L28
    L19:
        index$iv = index$iv + 1;     // Catch: Throwable -> L28
        this_$iv = this_$iv2;
        set = set2;
    L20:
        th = th;
        goto L32
    L22:
        writer$iv.skipToGroupEnd();     // Catch: Throwable -> L28
        writer$iv.endGroup();     // Catch: Throwable -> L28
        writer$iv.close(true);
        if (allScopesFound.element == true) goto L48;
        return null;
    L48:
        return scopes;
    L30:
        th = th;
    L34:
        th = move-exception;
        reader$iv.close();
        throw th;
    }

    private static final void invalidateGroupsWithKey$lambda$20$scanGroup(SlotReader $reader, MutableIntSet set, List<Anchor> r8, Ref.BooleanRef allScopesFound, SlotTable this$0, List<RecomposeScopeImpl> r11) {
        int key = $reader.getGroupKey();
        if (set.contains(key) == false) goto L25;
        boolean r2 = true;
        if (key == (-3)) goto L8;
        r8.add(SlotReader.anchor$default($reader, 0, 1, null));
    L8:
        if (allScopesFound.element == false) goto L23;
        RecomposeScopeImpl nearestScope = this$0.findEffectiveRecomposeScope($reader.getCurrentGroup());
        if (nearestScope == null) goto L22;
        r11.add(nearestScope);
        Anchor r4 = nearestScope.getAnchor();
        if (r4 != null) goto L14;
    L16:
        r2 = false;
    L17:
        if (r2 == false) goto L23;
        RecomposeScopeImpl parentScope = this$0.findEffectiveRecomposeScope($reader.getParent());
        if (parentScope == null) goto L23;
        r11.add(parentScope);
        goto L23
    L14:
        if (r4.getLocation$runtime_release() != $reader.getCurrentGroup()) goto L16;
    L22:
        allScopesFound.element = false;
        r11.clear();
    L23:
        $reader.skipGroup();
        return;
    L25:
        $reader.startGroup();
    L27:
        if ($reader.isGroupEnd() == true) goto L29;
        invalidateGroupsWithKey$lambda$20$scanGroup($reader, set, r8, allScopesFound, this$0, r11);
        goto L27
    L29:
        $reader.endGroup();
    }

    public final boolean containsMark() {
        if (this.groupsSize <= 0) goto L11;
        int[] $this$containsMark$iv = this.groups;
        if (($this$containsMark$iv[(0 * 5) + 1] & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) == 0) goto L7;
        boolean r0 = true;
    L8:
        if (r0 == true) goto L10;
        return false;
    L10:
        return true;
    L7:
        r0 = false;
        goto L8
    L11:
        return false;
    }

    public final GroupSourceInformation sourceInformationOf(int group) {
        HashMap<Anchor, GroupSourceInformation> r0 = this.sourceInformationMap;
        if (r0 == null) goto L8;
        Anchor anchor = tryAnchor(group);
        if (anchor != null) goto L7;
        return null;
    L7:
        return r0.get(anchor);
    L8:
        return null;
    }

    private final RecomposeScopeImpl findEffectiveRecomposeScope(int group) {
        int current = group;
    L3:
        if (current <= 0) goto L16;
        Iterator<Object> r1 = new DataIterator(this, current).iterator();
    L6:
        if (r1.hasNext() == false) goto L15;
        Object data = r1.next();
        if ((data instanceof RecomposeScopeImpl) == false) goto L6;
        if (((RecomposeScopeImpl) data).getUsed() == false) goto L14;
        if (current == group) goto L14;
        return (RecomposeScopeImpl) data;
    L14:
        ((RecomposeScopeImpl) data).setForcedRecompose(true);
        goto L6
    L15:
        int[] $this$parentAnchor$iv = this.groups;
        current = $this$parentAnchor$iv[(current * 5) + 2];
        goto L3
    L16:
        return null;
    }

    public final void verifyWellFormed() {
        Ref.IntRef current = new Ref.IntRef();
        if (this.groupsSize > 0) goto L5;
    L15:
        int index = this.slotsSize;
        int r4 = this.slots.length;
    L16:
        if (index >= r4) goto L25;
        if (this.slots[index] != null) goto L20;
        boolean value$iv = true;
    L22:
        if (value$iv == true) goto L24;
        PreconditionsKt.throwIllegalStateException("Non null value in the slot gap at index " + index);
    L24:
        index = index + 1;
        goto L16
    L20:
        value$iv = false;
        goto L22
    L25:
        int lastLocation = -1;
        List $this$fastForEach$iv = this.anchors;
        int index$iv = 0;
        int r7 = $this$fastForEach$iv.size();
    L26:
        if (index$iv >= r7) goto L44;
        Object item$iv = $this$fastForEach$iv.get(index$iv);
        int location = ((Anchor) item$iv).toIndexFor(this);
        if (location >= 0) goto L30;
    L32:
        boolean value$iv2 = false;
    L34:
        if (value$iv2 == true) goto L37;
        PreconditionsKt.throwIllegalArgumentException("Invalid anchor, location out of bound");
    L37:
        if (lastLocation >= location) goto L39;
        boolean value$iv3 = true;
    L41:
        if (value$iv3 == true) goto L43;
        PreconditionsKt.throwIllegalArgumentException("Anchor is out of order");
    L43:
        lastLocation = location;
        index$iv = index$iv + 1;
        goto L26
    L39:
        value$iv3 = false;
        goto L41
    L30:
        if (location > this.groupsSize) goto L32;
        value$iv2 = true;
        goto L34
    L44:
        HashMap<Anchor, GroupSourceInformation> r2 = this.sourceInformationMap;
        if (r2 == null) goto L57;
        Iterator<Map.Entry<Anchor, GroupSourceInformation>> r5 = r2.entrySet().iterator();
    L48:
        if (r5.hasNext() == false) goto L68;
        Map.Entry<Anchor, GroupSourceInformation> r6 = r5.next();
        Anchor anchor = r6.getKey();
        GroupSourceInformation sourceGroup = r6.getValue();
        boolean value$iv4 = anchor.getValid();
        if (value$iv4 == true) goto L52;
        PreconditionsKt.throwIllegalArgumentException("Source map contains invalid anchor");
    L52:
        boolean value$iv5 = ownsAnchor(anchor);
        if (value$iv5 == true) goto L55;
        PreconditionsKt.throwIllegalArgumentException("Source map anchor is not owned by the slot table");
    L55:
        verifyWellFormed$verifySourceGroup(this, sourceGroup);
        goto L48
    L68:
        return;
    L57:
        return;
    L5:
        if (current.element >= this.groupsSize) goto L8;
        verifyWellFormed$validateGroup(current, this, -1, current.element + SlotTableKt.access$groupSize(this.groups, current.element));
        goto L5
    L8:
        if (current.element != this.groupsSize) goto L10;
        boolean value$iv6 = true;
    L12:
        if (value$iv6 == true) goto L15;
        PreconditionsKt.throwIllegalStateException("Incomplete group at root " + current.element + " expected to be " + this.groupsSize);
        goto L15
    L10:
        value$iv6 = false;
        goto L12
    }

    /* JADX WARN: Failed to apply debug info
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v4 ??, new type: int[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyDebugInfo(TypeUpdate.java:77)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:137)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:133)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:75)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v4 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    private static final int verifyWellFormed$validateGroup(kotlin.jvm.internal.Ref.IntRef r22, androidx.compose.runtime.SlotTable r23, int r24, int r25) {
        /*  JADX ERROR: Simple mode code generation failed
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x019d: MOVE (r6v17 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('$this$isNode$iv' int[])]) = (r6v2 ?? I:??[boolean, int, float, short, byte, char]) A[DECLARE_VAR] in method: androidx.compose.runtime.SlotTable.verifyWellFormed$validateGroup(kotlin.jvm.internal.Ref$IntRef, androidx.compose.runtime.SlotTable, int, int):int, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.MethodGen.generateSimpleCode(MethodGen.java:348)
            	at jadx.core.codegen.MethodGen.addSimpleMethodCode(MethodGen.java:316)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:279)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.ArgType.getPrimitiveType()" because "type" is null
            	at jadx.core.codegen.ClassGen.useType(ClassGen.java:564)
            	at jadx.core.codegen.InsnGen.useType(InsnGen.java:269)
            	at jadx.core.codegen.InsnGen.declareVar(InsnGen.java:166)
            	at jadx.core.codegen.InsnGen.declareVar(InsnGen.java:159)
            	at jadx.core.codegen.InsnGen.assignVar(InsnGen.java:152)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:299)
            	... 11 more
            */
        /*
            Method dump skipped, instruction units count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SlotTable.verifyWellFormed$validateGroup(kotlin.jvm.internal.Ref$IntRef, androidx.compose.runtime.SlotTable, int, int):int");
    }

    private static final void verifyWellFormed$verifySourceGroup(SlotTable this$0, GroupSourceInformation group) {
        List r0 = group.getGroups();
        if (r0 == null) goto L20;
        List $this$fastForEach$iv = r0;
        int index$iv = 0;
        int r3 = $this$fastForEach$iv.size();
    L5:
        if (index$iv >= r3) goto L26;
        Object item$iv = $this$fastForEach$iv.get(index$iv);
        if ((item$iv instanceof Anchor) == false) goto L16;
        boolean value$iv = ((Anchor) item$iv).getValid();
        if (value$iv == true) goto L11;
        PreconditionsKt.throwIllegalArgumentException("Source map contains invalid anchor");
    L11:
        boolean value$iv2 = this$0.ownsAnchor((Anchor) item$iv);
        if (value$iv2 == true) goto L18;
        PreconditionsKt.throwIllegalArgumentException("Source map anchor is not owned by the slot table");
    L18:
        index$iv = index$iv + 1;
        goto L5
    L16:
        if ((item$iv instanceof GroupSourceInformation) == false) goto L18;
        verifyWellFormed$verifySourceGroup(this$0, (GroupSourceInformation) item$iv);
        goto L18
    L26:
        return;
    }

    public final void collectCalledByInformation() {
        int r3 = 0;
        this.calledByMap = new MutableIntObjectMap(r3, 1, null);
    }

    public final void collectSourceInformation() {
        this.sourceInformationMap = new HashMap();
    }

    public final String toDebugString() {
        if (this.writer == true) goto L14;
        StringBuilder $this$toDebugString_u24lambda_u2447 = new StringBuilder();
        $this$toDebugString_u24lambda_u2447.append(super.toString());
        $this$toDebugString_u24lambda_u2447.append('\n');
        int groupsSize = this.groupsSize;
        if (groupsSize <= 0) goto L10;
        int current = 0;
    L8:
        if (current >= groupsSize) goto L11;
        current = current + emitGroup($this$toDebugString_u24lambda_u2447, current, 0);
    L11:
        String r0 = $this$toDebugString_u24lambda_u2447.toString();
        Intrinsics.checkNotNullExpressionValue(r0, "toString(...)");
        return r0;
    L10:
        $this$toDebugString_u24lambda_u2447.append("<EMPTY>");
        goto L11
    L14:
        return super.toString();
    }

    private final int emitGroup(StringBuilder $this$emitGroup, int index, int level) {
        boolean r0 = false;
        int r1 = 0;
    L3:
        if (r1 >= level) goto L5;
        $this$emitGroup.append(' ');
        r1 = r1 + 1;
        goto L3
    L5:
        $this$emitGroup.append("Group(");
        $this$emitGroup.append(index);
        $this$emitGroup.append(")");
        GroupSourceInformation r2 = sourceInformationOf(index);
        if (r2 == null) goto L15;
        String it = r2.getSourceInformation();
        if (it == null) goto L15;
        if (StringsKt.startsWith$default(it, "C(", false, 2, null) == false) goto L12;
    L13:
        int start = StringsKt.indexOf$default(it, "(", 0, false, 6, null) + 1;
        int endParen = StringsKt.indexOf$default(it, ')', 0, false, 6, null);
        $this$emitGroup.append(" ");
        String r6 = it.substring(start, endParen);
        Intrinsics.checkNotNullExpressionValue(r6, "substring(...)");
        $this$emitGroup.append(r6);
        $this$emitGroup.append("()");
        goto L15
    L12:
        if (StringsKt.startsWith$default(it, "CC(", false, 2, null) == true) goto L13;
    L15:
        $this$emitGroup.append(" key=");
        int[] $this$key$iv = this.groups;
        $this$emitGroup.append($this$key$iv[index * 5]);
        int groupSize = SlotTableKt.access$groupSize(this.groups, index);
        $this$emitGroup.append(", nodes=");
        int[] $this$nodeCount$iv = this.groups;
        $this$emitGroup.append($this$nodeCount$iv[(index * 5) + 1] & RectListKt.Lower26Bits);
        $this$emitGroup.append(", size=");
        $this$emitGroup.append(groupSize);
        int[] $this$hasMark$iv = this.groups;
        if (($this$hasMark$iv[(index * 5) + 1] & 134217728) == 0) goto L18;
        boolean r3 = true;
    L19:
        if (r3 == false) goto L21;
        $this$emitGroup.append(", mark");
    L21:
        int[] $this$containsMark$iv = this.groups;
        if (($this$containsMark$iv[(index * 5) + 1] & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) == 0) goto L24;
        boolean r4 = true;
    L25:
        if (r4 == false) goto L27;
        $this$emitGroup.append(", contains mark");
    L27:
        int dataStart = emitGroup$dataIndex(this, index);
        int dataEnd = emitGroup$dataIndex(this, index + 1);
        if (dataStart < 0) goto L31;
        if (dataStart > dataEnd) goto L31;
        boolean r5 = true;
    L33:
        if (r5 == true) goto L35;
    L61:
        $this$emitGroup.append(", *invalid data offsets " + dataStart + '-' + dataEnd + '*');
    L62:
        $this$emitGroup.append('\n');
        int current = index + 1;
        int end = index + groupSize;
    L63:
        if (current >= end) goto L65;
        current = current + emitGroup($this$emitGroup, current, level + 1);
        goto L63
    L65:
        return groupSize;
    L35:
        if (dataEnd > this.slotsSize) goto L61;
        int[] $this$hasObjectKey$iv = this.groups;
        if (($this$hasObjectKey$iv[(index * 5) + 1] & 536870912) == 0) goto L39;
        boolean r7 = true;
    L40:
        if (r7 == false) goto L42;
        $this$emitGroup.append(" objectKey=" + SlotTableKt.access$summarize(String.valueOf(this.slots[SlotTableKt.access$objectKeyIndex(this.groups, index)]), 10));
    L42:
        int[] $this$isNode$iv = this.groups;
        if (($this$isNode$iv[(index * 5) + 1] & 1073741824) == 0) goto L45;
        boolean r8 = true;
    L46:
        if (r8 == false) goto L48;
        StringBuilder r9 = new StringBuilder().append(" node=");
        Object[] r10 = this.slots;
        int[] $this$nodeIndex$iv = this.groups;
        $this$emitGroup.append(r9.append(SlotTableKt.access$summarize(String.valueOf(r10[$this$nodeIndex$iv[(index * 5) + 4]]), 10)).toString());
    L48:
        int[] $this$hasAux$iv = this.groups;
        if (($this$hasAux$iv[(index * 5) + 1] & 268435456) == 0) goto L51;
        r0 = true;
    L51:
        if (r0 == false) goto L53;
        $this$emitGroup.append(" aux=" + SlotTableKt.access$summarize(String.valueOf(this.slots[SlotTableKt.access$auxIndex(this.groups, index)]), 10));
    L53:
        int slotStart = SlotTableKt.access$slotAnchor(this.groups, index);
        if (slotStart >= dataEnd) goto L62;
        $this$emitGroup.append(", slots=[");
        $this$emitGroup.append(slotStart);
        $this$emitGroup.append(": ");
        int dataIndex = slotStart;
    L56:
        if (dataIndex >= dataEnd) goto L60;
        if (dataIndex == slotStart) goto L59;
        $this$emitGroup.append(", ");
    L59:
        $this$emitGroup.append(SlotTableKt.access$summarize(String.valueOf(this.slots[dataIndex]), 10));
        dataIndex = dataIndex + 1;
        goto L56
    L60:
        $this$emitGroup.append("]");
        goto L62
    L45:
        r8 = false;
        goto L46
    L39:
        r7 = false;
    L31:
        r5 = false;
        goto L33
    L24:
        r4 = false;
        goto L25
    L18:
        r3 = false;
        goto L19
    }

    private static final int emitGroup$dataIndex(SlotTable this$0, int index) {
        if (index >= this$0.groupsSize) goto L7;
        int[] $this$dataAnchor$iv = this$0.groups;
        return $this$dataAnchor$iv[(index * 5) + 4];
    L7:
        return this$0.slotsSize;
    }

    private final List<Integer> keys() {
        return SlotTableKt.access$keys(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> nodes() {
        return SlotTableKt.access$nodeCounts(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> parentIndexes() {
        return SlotTableKt.access$parentAnchors(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> dataIndexes() {
        return SlotTableKt.access$dataAnchors(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> groupSizes() {
        return SlotTableKt.access$groupSizes(this.groups, this.groupsSize * 5);
    }

    public final List<Object> slotsOf$runtime_release(int group) {
        int[] $this$dataAnchor$iv = this.groups;
        int start = $this$dataAnchor$iv[(group * 5) + 4];
        if ((group + 1) >= this.groupsSize) goto L5;
        int[] $this$dataAnchor$iv2 = this.groups;
        int address$iv = group + 1;
        int end = $this$dataAnchor$iv2[(address$iv * 5) + 4];
    L7:
        return ArraysKt.toList(this.slots).subList(start, end);
    L5:
        end = this.slots.length;
        goto L7
    }

    public final Object slot$runtime_release(int group, int slotIndex) {
        int start = SlotTableKt.access$slotAnchor(this.groups, group);
        if ((group + 1) >= this.groupsSize) goto L5;
        int[] $this$dataAnchor$iv = this.groups;
        int address$iv = group + 1;
        int end = $this$dataAnchor$iv[(address$iv * 5) + 4];
    L6:
        int len = end - start;
        boolean r3 = false;
        if (slotIndex < 0) goto L10;
        if (slotIndex >= len) goto L10;
        r3 = true;
    L10:
        if (r3 == false) goto L14;
        return this.slots[start + slotIndex];
    L14:
        return Composer.Companion.getEmpty();
    L5:
        end = this.slots.length;
        goto L6
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this;
    }

    @Override // java.lang.Iterable
    public Iterator<CompositionGroup> iterator() {
        return new GroupIterator(this, 0, this.groupsSize);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public CompositionGroup find(Object identityToFind) {
        int r2 = 0;
        int r3 = 0;
        return new SlotTableGroup(this, r2, r3, 4, null).find(identityToFind);
    }
}
