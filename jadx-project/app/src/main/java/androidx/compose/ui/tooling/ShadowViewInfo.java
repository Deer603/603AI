package androidx.compose.ui.tooling;

import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.tooling.data.SourceLocation;
import androidx.compose.ui.unit.IntRect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: ShadowViewInfo.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0019\u001a\u00020\u0000J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u0000J\u0006\u0010\u001c\u001a\u00020\u0003R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/tooling/ShadowViewInfo;", "", "viewInfo", "Landroidx/compose/ui/tooling/ViewInfo;", "(Landroidx/compose/ui/tooling/ViewInfo;)V", "parent", "(Landroidx/compose/ui/tooling/ShadowViewInfo;Landroidx/compose/ui/tooling/ViewInfo;)V", "_children", "", "allNodes", "Lkotlin/sequences/Sequence;", "getAllNodes", "()Lkotlin/sequences/Sequence;", "children", "", "getChildren", "()Ljava/util/List;", "layoutInfo", "Landroidx/compose/ui/layout/LayoutInfo;", "getLayoutInfo", "()Landroidx/compose/ui/layout/LayoutInfo;", "getParent", "()Landroidx/compose/ui/tooling/ShadowViewInfo;", "setParent", "(Landroidx/compose/ui/tooling/ShadowViewInfo;)V", "findRoot", "setNewParent", "", "toViewInfo", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ShadowViewInfo {
    private final List<ShadowViewInfo> _children;
    private final Sequence<ShadowViewInfo> allNodes;
    private ShadowViewInfo parent;
    private final ViewInfo viewInfo;

    private ShadowViewInfo(ShadowViewInfo parent, ViewInfo viewInfo) {
        this.parent = parent;
        this.viewInfo = viewInfo;
        Iterable $this$map$iv = this.viewInfo.getChildren();
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        Iterator r5 = $this$map$iv.iterator();
    L4:
        if (r5.hasNext() == false) goto L6;
        Object item$iv$iv = r5.next();
        ViewInfo it = (ViewInfo) item$iv$iv;
        destination$iv$iv.add(new ShadowViewInfo(this, it));
        goto L4
    L6:
        this._children = CollectionsKt.toMutableList((List) destination$iv$iv);
        this.allNodes = SequencesKt.sequence(new ShadowViewInfo$allNodes$1(this, null));
    }

    public final ShadowViewInfo getParent() {
        return this.parent;
    }

    public final void setParent(ShadowViewInfo r1) {
        this.parent = r1;
    }

    public ShadowViewInfo(ViewInfo viewInfo) {
        this(null, viewInfo);
    }

    public final List<ShadowViewInfo> getChildren() {
        return this._children;
    }

    public final LayoutInfo getLayoutInfo() {
        Object r0 = this.viewInfo.getLayoutInfo();
        if ((r0 instanceof LayoutInfo) == true) goto L7;
        return null;
    L7:
        return (LayoutInfo) r0;
    }

    public final Sequence<ShadowViewInfo> getAllNodes() {
        return this.allNodes;
    }

    public final void setNewParent(ShadowViewInfo parent) {
        ShadowViewInfo r0 = this.parent;
        if (r0 == null) goto L7;
        List<ShadowViewInfo> r1 = r0._children;
        if (r1 == null) goto L7;
        r1.remove(this);
    L7:
        parent._children.add(this);
        this.parent = parent;
    }

    public final ShadowViewInfo findRoot() {
        if (this.parent == null) goto L7;
        ShadowViewInfo r0 = this.parent;
        Intrinsics.checkNotNull(r0);
        return r0.findRoot();
    L7:
        return this;
    }

    public final ViewInfo toViewInfo() {
        String r2 = this.viewInfo.getFileName();
        int r3 = this.viewInfo.getLineNumber();
        IntRect r4 = this.viewInfo.getBounds();
        SourceLocation r5 = this.viewInfo.getLocation();
        Iterable $this$map$iv = this._children;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        Iterator r9 = $this$map$iv.iterator();
    L4:
        if (r9.hasNext() == false) goto L7;
        Object item$iv$iv = r9.next();
        ShadowViewInfo it = (ShadowViewInfo) item$iv$iv;
        destination$iv$iv.add(it.toViewInfo());
        goto L4
    L7:
        return new ViewInfo(r2, r3, r4, r5, (List) destination$iv$iv, this.viewInfo.getLayoutInfo());
    }
}
