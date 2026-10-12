package androidx.compose.ui.tooling.data;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.unit.IntRect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: SlotTree.jvm.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BC\u0012&\u0010\u0003\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b¢\u0006\u0002\u0010\u000bJ\u0012\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\tH\u0002J$\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00152\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u000000J\u0010\u00101\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u0005H\u0002J\u0012\u00102\u001a\u0004\u0018\u00010\u00052\u0006\u00103\u001a\u00020\u0015H\u0002J\b\u00104\u001a\u00020\u0005H\u0002J\u0010\u00105\u001a\u0002062\u0006\u0010-\u001a\u00020\u0005H\u0002R\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R.\u0010\u0003\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001bR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050(X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Landroidx/compose/ui/tooling/data/CompositionCallStack;", "T", "Landroidx/compose/ui/tooling/data/SourceContext;", "factory", "Lkotlin/Function3;", "Landroidx/compose/runtime/tooling/CompositionGroup;", "", "contexts", "", "", "", "(Lkotlin/jvm/functions/Function3;Ljava/util/Map;)V", "<set-?>", "Landroidx/compose/ui/unit/IntRect;", "bounds", "getBounds", "()Landroidx/compose/ui/unit/IntRect;", "current", "getCurrent", "()Landroidx/compose/runtime/tooling/CompositionGroup;", "currentCallIndex", "", "depth", "getDepth", "()I", "isInline", "", "()Z", "location", "Landroidx/compose/ui/tooling/data/SourceLocation;", "getLocation", "()Landroidx/compose/ui/tooling/data/SourceLocation;", HintConstants.AUTOFILL_HINT_NAME, "getName", "()Ljava/lang/String;", "parameters", "Landroidx/compose/ui/tooling/data/ParameterInformation;", "getParameters", "()Ljava/util/List;", "stack", "Lkotlin/collections/ArrayDeque;", "contextOf", "Landroidx/compose/ui/tooling/data/SourceInformationContext;", "information", "convert", "group", "callIndex", "out", "", "isCall", "parentGroup", "parentDepth", "pop", "push", "", "ui-tooling-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class CompositionCallStack<T> implements SourceContext {
    private IntRect bounds;
    private final Map<String, Object> contexts;
    private int currentCallIndex;
    private final Function3<CompositionGroup, SourceContext, List<? extends T>, T> factory;
    private final ArrayDeque<CompositionGroup> stack;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositionCallStack(Function3<? super CompositionGroup, ? super SourceContext, ? super List<? extends T>, ? extends T> r2, Map<String, Object> r3) {
        this.factory = r2;
        this.contexts = r3;
        this.stack = new ArrayDeque();
        this.bounds = SlotTreeKt.getEmptyBox();
    }

    public final IntRect convert(CompositionGroup group, int callIndex, List<T> r13) {
        List children = new ArrayList();
        IntRect r1 = SlotTreeKt.getEmptyBox();
        push(group);
        int childCallIndex = 0;
        Iterator<CompositionGroup> r5 = group.getCompositionGroups().iterator();
    L4:
        if (r5.hasNext() == false) goto L9;
        Object element$iv = r5.next();
        CompositionGroup child = (CompositionGroup) element$iv;
        r1 = SlotTreeKt.union(r1, convert(child, childCallIndex, children));
        if (isCall(child) == false) goto L4;
        childCallIndex = childCallIndex + 1;
        goto L4
    L9:
        Object r3 = group.getNode();
        if ((r3 instanceof LayoutInfo) == false) goto L12;
        LayoutInfo it = (LayoutInfo) r3;
    L13:
        if (it == null) goto L16;
        IntRect r4 = SlotTreeKt.access$boundsOfLayoutNode(it);
        if (r4 == null) goto L16;
    L17:
        this.currentCallIndex = callIndex;
        this.bounds = r4;
        T r2 = this.factory.invoke(group, this, children);
        if (r2 == null) goto L20;
        r13.add(r2);
    L20:
        pop();
        return r4;
    L16:
        r4 = r1;
        goto L17
    L12:
        it = null;
        goto L13
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    public String getName() {
        String info = getCurrent().getSourceInfo();
        if (info != null) goto L6;
        return null;
    L6:
        if (StringsKt.startsWith$default(info, "CC(", false, 2, null) == false) goto L9;
        int startIndex = 3;
    L11:
        int endIndex = StringsKt.indexOf$default(info, ')', 0, false, 6, null);
        if (endIndex <= 2) goto L16;
        String r1 = info.substring(startIndex, endIndex);
        Intrinsics.checkNotNullExpressionValue(r1, "substring(...)");
        return r1;
    L16:
        return null;
    L9:
        if (StringsKt.startsWith$default(info, "C(", false, 2, null) == false) goto L15;
        startIndex = 2;
        goto L11
    L15:
        return null;
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    public boolean isInline() {
        String r0 = getCurrent().getSourceInfo();
        if (r0 != null) goto L5;
        return false;
    L5:
        if (StringsKt.startsWith$default(r0, "CC", false, 2, null) == true) goto L7;
        return false;
    L7:
        return true;
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    public IntRect getBounds() {
        return this.bounds;
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    public SourceLocation getLocation() {
        CompositionGroup r0 = parentGroup(1);
        if (r0 == null) goto L25;
        String it = r0.getSourceInfo();
        if (it == null) goto L25;
        SourceInformationContext context = contextOf(it);
        if (context == null) goto L25;
        SourceInformationContext parentContext = context;
        int index = 2;
    L11:
        if (index >= this.stack.size()) goto L24;
        if (parentContext == null) goto L14;
        String r4 = parentContext.getSourceFile();
    L15:
        if (r4 != null) goto L24;
        int index2 = index + 1;
        CompositionGroup r3 = parentGroup(index);
        if (r3 == null) goto L21;
        String it2 = r3.getSourceInfo();
        if (it2 == null) goto L21;
        SourceInformationContext r5 = contextOf(it2);
    L22:
        parentContext = r5;
        index = index2;
    L21:
        r5 = null;
        goto L22
    L14:
        r4 = null;
    L24:
        return context.sourceLocation(this.currentCallIndex, parentContext);
    L25:
        return null;
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    public List<ParameterInformation> getParameters() {
        CompositionGroup group = getCurrent();
        String it = group.getSourceInfo();
        if (it == null) goto L10;
        SourceInformationContext context = contextOf(it);
        if (context == null) goto L10;
        List data = new ArrayList();
        CollectionsKt.addAll(data, group.getData());
        return SlotTreeKt.access$extractParameterInfo(data, context);
    L10:
        return CollectionsKt.emptyList();
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    public int getDepth() {
        return this.stack.size();
    }

    private final void push(CompositionGroup group) {
        this.stack.addLast(group);
    }

    private final CompositionGroup pop() {
        return this.stack.removeLast();
    }

    private final CompositionGroup getCurrent() {
        return this.stack.last();
    }

    private final CompositionGroup parentGroup(int parentDepth) {
        if (this.stack.size() > parentDepth) goto L7;
        return null;
    L7:
        return this.stack.get((this.stack.size() - parentDepth) - 1);
    }

    private final SourceInformationContext contextOf(String information) {
        Map<String, Object> r0 = this.contexts;
        Object value$iv = r0.get(information);
        if (value$iv != null) goto L5;
        Object answer$iv = SlotTreeKt.sourceInformationContextOf$default(information, null, 2, null);
        r0.put(information, answer$iv);
    L7:
        if ((answer$iv instanceof SourceInformationContext) == true) goto L9;
        return null;
    L9:
        return (SourceInformationContext) answer$iv;
    L5:
        answer$iv = value$iv;
        goto L7
    }

    private final boolean isCall(CompositionGroup group) {
        String r0 = group.getSourceInfo();
        if (r0 != null) goto L5;
        return false;
    L5:
        return StringsKt.startsWith$default(r0, "C", false, 2, null);
    }
}
