package androidx.compose.ui.tooling;

import androidx.compose.ui.tooling.data.SourceLocation;
import androidx.compose.ui.unit.IntRect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: ComposeViewAdapter.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\rJ\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0001HÆ\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010%\u001a\u00020#J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\b\u0010'\u001a\u00020\u0003H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Landroidx/compose/ui/tooling/ViewInfo;", "", "fileName", "", "lineNumber", "", "bounds", "Landroidx/compose/ui/unit/IntRect;", "location", "Landroidx/compose/ui/tooling/data/SourceLocation;", "children", "", "layoutInfo", "(Ljava/lang/String;ILandroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/tooling/data/SourceLocation;Ljava/util/List;Ljava/lang/Object;)V", "getBounds", "()Landroidx/compose/ui/unit/IntRect;", "getChildren", "()Ljava/util/List;", "getFileName", "()Ljava/lang/String;", "getLayoutInfo", "()Ljava/lang/Object;", "getLineNumber", "()I", "getLocation", "()Landroidx/compose/ui/tooling/data/SourceLocation;", "allChildren", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hasBounds", "hashCode", "toString", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ViewInfo {
    public static final int $stable = 0;
    private final IntRect bounds;
    private final List<ViewInfo> children;
    private final String fileName;
    private final Object layoutInfo;
    private final int lineNumber;
    private final SourceLocation location;

    static {
        $stable = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ViewInfo copy$default(ViewInfo r0, String r1, int r2, IntRect r3, SourceLocation r4, List r5, Object r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.fileName;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.lineNumber;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.bounds;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r0.location;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r0.children;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r0.layoutInfo;
    L20:
        List r9 = r5;
        Object r10 = r6;
        IntRect r11 = r3;
        SourceLocation r12 = r4;
        return r0.copy(r1, r2, r11, r12, r9, r10);
    }

    public final String component1() {
        return this.fileName;
    }

    public final int component2() {
        return this.lineNumber;
    }

    public final IntRect component3() {
        return this.bounds;
    }

    public final SourceLocation component4() {
        return this.location;
    }

    public final List<ViewInfo> component5() {
        return this.children;
    }

    public final Object component6() {
        return this.layoutInfo;
    }

    public final ViewInfo copy(String r8, int r9, IntRect r10, SourceLocation r11, List<ViewInfo> r12, Object r13) {
        return new ViewInfo(r8, r9, r10, r11, r12, r13);
    }

    public boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof ViewInfo) == true) goto L8;
        return false;
    L8:
        ViewInfo r1 = (ViewInfo) r6;
        if (Intrinsics.areEqual(this.fileName, r1.fileName) == true) goto L12;
        return false;
    L12:
        if (this.lineNumber == r1.lineNumber) goto L15;
        return false;
    L15:
        if (Intrinsics.areEqual(this.bounds, r1.bounds) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.areEqual(this.location, r1.location) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.areEqual(this.children, r1.children) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.areEqual(this.layoutInfo, r1.layoutInfo) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        int r1 = ((((this.fileName.hashCode() * 31) + Integer.hashCode(this.lineNumber)) * 31) + this.bounds.hashCode()) * 31;
        int r3 = 0;
        if (this.location != null) goto L5;
        int r2 = 0;
    L6:
        int r4 = (((r1 + r2) * 31) + this.children.hashCode()) * 31;
        if (this.layoutInfo == null) goto L11;
        r3 = this.layoutInfo.hashCode();
    L11:
        return r4 + r3;
    L5:
        r2 = this.location.hashCode();
        goto L6
    }

    public ViewInfo(String fileName, int lineNumber, IntRect bounds, SourceLocation location, List<ViewInfo> r5, Object layoutInfo) {
        this.fileName = fileName;
        this.lineNumber = lineNumber;
        this.bounds = bounds;
        this.location = location;
        this.children = r5;
        this.layoutInfo = layoutInfo;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final int getLineNumber() {
        return this.lineNumber;
    }

    public final IntRect getBounds() {
        return this.bounds;
    }

    public final SourceLocation getLocation() {
        return this.location;
    }

    public final List<ViewInfo> getChildren() {
        return this.children;
    }

    public final Object getLayoutInfo() {
        return this.layoutInfo;
    }

    public final boolean hasBounds() {
        if (this.bounds.getBottom() != 0) goto L5;
    L7:
        return false;
    L5:
        if (this.bounds.getRight() == 0) goto L7;
        return true;
    }

    public final List<ViewInfo> allChildren() {
        List<ViewInfo> r0 = this.children;
        Iterable $this$flatMap$iv = this.children;
        Collection destination$iv$iv = new ArrayList();
        Iterator r6 = $this$flatMap$iv.iterator();
    L4:
        if (r6.hasNext() == false) goto L7;
        Object element$iv$iv = r6.next();
        ViewInfo it = (ViewInfo) element$iv$iv;
        Iterable list$iv$iv = it.allChildren();
        CollectionsKt.addAll(destination$iv$iv, list$iv$iv);
        goto L4
    L7:
        return CollectionsKt.plus(r0, (List) destination$iv$iv);
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder().append('(').append(this.fileName).append(':').append(this.lineNumber).append(",\n            |bounds=(top=").append(this.bounds.getTop()).append(", left=").append(this.bounds.getLeft()).append(",\n            |location=");
        SourceLocation it = this.location;
        if (it == null) goto L6;
        String r1 = new StringBuilder().append('(').append(it.getOffset()).append('L').append(it.getLength()).toString();
        if (r1 == null) goto L6;
    L8:
        return StringsKt.trimMargin$default(r0.append(r1).append("\n            |bottom=").append(this.bounds.getBottom()).append(", right=").append(this.bounds.getRight()).append("),\n            |childrenCount=").append(this.children.size()).append(')').toString(), null, 1, null);
    L6:
        r1 = "<none>";
        goto L8
    }
}
