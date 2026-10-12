package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Box.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J\f\u0010\u0007\u001a\u00020\u0004*\u00020\u0004H\u0017¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/layout/BoxScopeInstance;", "Landroidx/compose/foundation/layout/BoxScope;", "()V", "align", "Landroidx/compose/ui/Modifier;", "alignment", "Landroidx/compose/ui/Alignment;", "matchParentSize", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BoxScopeInstance implements BoxScope {
    public static final int $stable = 0;
    public static final BoxScopeInstance INSTANCE = null;

    static {
        INSTANCE = new BoxScopeInstance();
    }

    private BoxScopeInstance() {
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    public Modifier align(Modifier $this$align, final Alignment alignment) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r2 = new BoxScopeInstance$align$$inlined$debugInspectorInfo$1(alignment);
    L7:
        return $this$align.then(new BoxChildDataElement(alignment, false, r2));
    L5:
        r2 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    public Modifier matchParentSize(Modifier $this$matchParentSize) {
        Alignment r1 = Alignment.Companion.getCenter();
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r3 = new BoxScopeInstance$matchParentSize$$inlined$debugInspectorInfo$1();
    L7:
        return $this$matchParentSize.then(new BoxChildDataElement(r1, true, r3));
    L5:
        r3 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }
}
