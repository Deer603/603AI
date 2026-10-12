package androidx.compose.ui.semantics;

import androidx.collection.MutableObjectList;
import kotlin.Metadata;

/* JADX INFO: compiled from: SemanticsInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0001H\u0000\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u0001H\u0000\u001a\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0001H\u0000¨\u0006\u0005"}, d2 = {"findMergingSemanticsParent", "Landroidx/compose/ui/semantics/SemanticsInfo;", "mergedSemanticsConfiguration", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "nearestParentThatHasSemantics", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SemanticsInfoKt {
    public static final SemanticsInfo nearestParentThatHasSemantics(SemanticsInfo $this$nearestParentThatHasSemantics) {
        SemanticsInfo parent = $this$nearestParentThatHasSemantics.getParentInfo();
    L3:
        if (parent == null) goto L8;
        if (parent.getSemanticsConfiguration() != null) goto L6;
        parent = parent.getParentInfo();
        goto L3
    L6:
        return parent;
    L8:
        return null;
    }

    public static final SemanticsInfo findMergingSemanticsParent(SemanticsInfo $this$findMergingSemanticsParent) {
        SemanticsInfo parent = $this$findMergingSemanticsParent.getParentInfo();
    L3:
        if (parent == null) goto L12;
        SemanticsConfiguration r1 = parent.getSemanticsConfiguration();
        boolean r2 = false;
        if (r1 != null) goto L7;
    L9:
        if (r2 == true) goto L10;
        parent = parent.getParentInfo();
        goto L3
    L10:
        return parent;
    L7:
        if (r1.isMergingSemanticsOfDescendants() != true) goto L9;
        r2 = true;
        goto L9
    L12:
        return null;
    }

    public static final SemanticsConfiguration mergedSemanticsConfiguration(SemanticsInfo $this$mergedSemanticsConfiguration) {
        SemanticsConfiguration unMergedConfig = $this$mergedSemanticsConfiguration.getSemanticsConfiguration();
        if (unMergedConfig != null) goto L5;
    L21:
        return unMergedConfig;
    L5:
        if (unMergedConfig.isMergingSemanticsOfDescendants() == false) goto L21;
        if (unMergedConfig.isClearingSemantics() == true) goto L21;
        SemanticsConfiguration mergedConfig = unMergedConfig.copy();
        MutableObjectList needsMerging = new MutableObjectList($this$mergedSemanticsConfiguration.getChildrenInfo().size());
        needsMerging.addAll($this$mergedSemanticsConfiguration.getChildrenInfo());
    L11:
        if (needsMerging.isNotEmpty() == false) goto L20;
        MutableObjectList this_$iv = needsMerging;
        SemanticsInfo childInfo = (SemanticsInfo) needsMerging.removeAt(this_$iv._size - 1);
        SemanticsConfiguration childConfig = childInfo.getSemanticsConfiguration();
        if (childConfig == null) goto L11;
        if (childConfig.isMergingSemanticsOfDescendants() == true) goto L11;
        mergedConfig.mergeChild$ui_release(childConfig);
        if (childConfig.isClearingSemantics() == true) goto L11;
        needsMerging.addAll(childInfo.getChildrenInfo());
        goto L11
    L20:
        return mergedConfig;
    }
}
