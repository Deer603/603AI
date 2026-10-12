package androidx.compose.ui.graphics.layer;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.ui.graphics.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChildLayerDependenciesTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005J\u001d\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u0010H\u0086\bJ+\u0010\u0011\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013H\u0086\bR\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker;", "", "()V", "dependenciesSet", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "dependency", "oldDependenciesSet", "oldDependency", "trackingInProgress", "", "onDependencyAdded", "graphicsLayer", "removeDependencies", "", "block", "Lkotlin/Function1;", "withTracking", "onDependencyRemoved", "Lkotlin/Function0;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ChildLayerDependenciesTracker {
    private MutableScatterSet<GraphicsLayer> dependenciesSet;
    private GraphicsLayer dependency;
    private MutableScatterSet<GraphicsLayer> oldDependenciesSet;
    private GraphicsLayer oldDependency;
    private boolean trackingInProgress;

    public ChildLayerDependenciesTracker() {
    }

    public static final /* synthetic */ MutableScatterSet access$getDependenciesSet$p(ChildLayerDependenciesTracker $this) {
        return $this.dependenciesSet;
    }

    public static final /* synthetic */ GraphicsLayer access$getDependency$p(ChildLayerDependenciesTracker $this) {
        return $this.dependency;
    }

    public static final /* synthetic */ MutableScatterSet access$getOldDependenciesSet$p(ChildLayerDependenciesTracker $this) {
        return $this.oldDependenciesSet;
    }

    public static final /* synthetic */ GraphicsLayer access$getOldDependency$p(ChildLayerDependenciesTracker $this) {
        return $this.oldDependency;
    }

    public static final /* synthetic */ void access$setDependency$p(ChildLayerDependenciesTracker $this, GraphicsLayer r1) {
        $this.dependency = r1;
    }

    public static final /* synthetic */ void access$setOldDependenciesSet$p(ChildLayerDependenciesTracker $this, MutableScatterSet r1) {
        $this.oldDependenciesSet = r1;
    }

    public static final /* synthetic */ void access$setOldDependency$p(ChildLayerDependenciesTracker $this, GraphicsLayer r1) {
        $this.oldDependency = r1;
    }

    public static final /* synthetic */ void access$setTrackingInProgress$p(ChildLayerDependenciesTracker $this, boolean r1) {
        $this.trackingInProgress = r1;
    }

    public final void withTracking(Function1<? super GraphicsLayer, Unit> r25, Function0<Unit> r26) {
        access$setOldDependency$p(this, access$getDependency$p(this));
        MutableScatterSet currentSet = access$getDependenciesSet$p(this);
        if (currentSet != null) goto L5;
    L11:
        access$setTrackingInProgress$p(this, true);
        r26.invoke();
        access$setTrackingInProgress$p(this, false);
        GraphicsLayer r5 = access$getOldDependency$p(this);
        if (r5 == null) goto L14;
        r25.invoke(r5);
    L14:
        MutableScatterSet oldSet = access$getOldDependenciesSet$p(this);
        if (oldSet == null) goto L41;
        int r6 = 0;
        if (oldSet.isNotEmpty() == false) goto L47;
        MutableScatterSet this_$iv = oldSet;
        Object[] elements$iv = this_$iv.elements;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L36;
    L20:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        MutableScatterSet oldSet2 = oldSet;
        int r18 = r6;
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L34;
        int r4 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L23:
        if (j$iv$iv >= bitCount$iv$iv) goto L33;
        long value$iv$iv$iv = slot$iv$iv & 255;
        if (value$iv$iv$iv >= 128) goto L27;
        int $i$f$isFull = 1;
    L28:
        if ($i$f$isFull == 0) goto L31;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        r25.invoke(elements$iv[index$iv$iv]);
    L31:
        slot$iv$iv = slot$iv$iv >> r4;
        j$iv$iv = j$iv$iv + 1;
        r4 = r4;
        goto L23
    L27:
        $i$f$isFull = 0;
        goto L28
    L33:
        if (bitCount$iv$iv == r4) goto L34;
    L38:
        oldSet2.clear();
        return;
    L34:
        if (i$iv$iv == lastIndex$iv$iv) goto L38;
        i$iv$iv = i$iv$iv + 1;
        oldSet = oldSet2;
        r6 = r18;
        goto L20
    L36:
        oldSet2 = oldSet;
        goto L38
    L47:
        return;
    L41:
        return;
    L5:
        if (currentSet.isNotEmpty() == false) goto L11;
        MutableScatterSet it = access$getOldDependenciesSet$p(this);
        if (it != null) goto L9;
        it = ScatterSetKt.mutableScatterSetOf();
        access$setOldDependenciesSet$p(this, it);
    L9:
        it.addAll(currentSet);
        currentSet.clear();
        goto L11
    }

    public final boolean onDependencyAdded(GraphicsLayer graphicsLayer) {
        boolean value$iv = this.trackingInProgress;
        if (value$iv == true) goto L6;
        InlineClassHelperKt.throwIllegalArgumentException("Only add dependencies during a tracking");
    L6:
        if (this.dependenciesSet == null) goto L9;
        MutableScatterSet<GraphicsLayer> r0 = this.dependenciesSet;
        Intrinsics.checkNotNull(r0);
        r0.add(graphicsLayer);
    L13:
        if (this.oldDependenciesSet == null) goto L17;
        MutableScatterSet<GraphicsLayer> r1 = this.oldDependenciesSet;
        Intrinsics.checkNotNull(r1);
        return !r1.remove(graphicsLayer);
    L17:
        if (this.oldDependency == graphicsLayer) goto L19;
        return true;
    L19:
        this.oldDependency = null;
        return false;
    L9:
        if (this.dependency == null) goto L11;
        MutableScatterSet<GraphicsLayer> r2 = ScatterSetKt.mutableScatterSetOf();
        GraphicsLayer r4 = this.dependency;
        Intrinsics.checkNotNull(r4);
        r2.add(r4);
        r2.add(graphicsLayer);
        this.dependenciesSet = r2;
        this.dependency = null;
        goto L13
    L11:
        this.dependency = graphicsLayer;
        goto L13
    }

    public final void removeDependencies(Function1<? super GraphicsLayer, Unit> r25) {
        int $i$f$removeDependencies = 0;
        GraphicsLayer it = access$getDependency$p(this);
        if (it == null) goto L5;
        r25.invoke(it);
        ChildLayerDependenciesTracker r5 = this;
        access$setDependency$p(r5, null);
    L6:
        MutableScatterSet it2 = access$getDependenciesSet$p(r5);
        if (it2 == null) goto L31;
        int r3 = 0;
        MutableScatterSet this_$iv = it2;
        Object[] elements$iv = this_$iv.elements;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L26;
    L10:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        int $i$f$removeDependencies2 = $i$f$removeDependencies;
        MutableScatterSet it3 = it2;
        int r15 = r3;
        ScatterSet this_$iv2 = this_$iv;
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L24;
        int r2 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L13:
        if (j$iv$iv >= bitCount$iv$iv) goto L23;
        long value$iv$iv$iv = slot$iv$iv & 255;
        if (value$iv$iv$iv >= 128) goto L17;
        boolean r17 = true;
    L18:
        if (r17 == false) goto L21;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        r25.invoke(elements$iv[index$iv$iv]);
    L21:
        slot$iv$iv = slot$iv$iv >> r2;
        j$iv$iv = j$iv$iv + 1;
        r2 = r2;
        goto L13
    L17:
        r17 = false;
        goto L18
    L23:
        if (bitCount$iv$iv == r2) goto L24;
    L28:
        it3.clear();
        return;
    L24:
        if (i$iv$iv == lastIndex$iv$iv) goto L28;
        i$iv$iv = i$iv$iv + 1;
        r3 = r15;
        this_$iv = this_$iv2;
        $i$f$removeDependencies = $i$f$removeDependencies2;
        it2 = it3;
        goto L10
    L26:
        it3 = it2;
        goto L28
    L31:
        return;
    L5:
        r5 = this;
        goto L6
    }
}
