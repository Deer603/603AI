package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LazyLayoutSemantics.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0002\u0010\rJ4\u0010\u001d\u001a\u00020\u001e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\b\u0010\u001f\u001a\u00020\u001eH\u0002J\f\u0010 \u001a\u00020\u001e*\u00020!H\u0016R\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.¢\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "itemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "state", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "userScrollEnabled", "", "reverseScrolling", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;Landroidx/compose/foundation/gestures/Orientation;ZZ)V", "collectionInfo", "Landroidx/compose/ui/semantics/CollectionInfo;", "getCollectionInfo", "()Landroidx/compose/ui/semantics/CollectionInfo;", "indexForKeyMapping", "Lkotlin/Function1;", "", "", "isVertical", "()Z", "scrollAxisRange", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "scrollToIndexAction", "shouldAutoInvalidate", "getShouldAutoInvalidate", "update", "", "updateCachedSemanticsValues", "applySemantics", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class LazyLayoutSemanticsModifierNode extends Modifier.Node implements SemanticsModifierNode {
    private final Function1<Object, Integer> indexForKeyMapping;
    private Function0<? extends LazyLayoutItemProvider> itemProviderLambda;
    private Orientation orientation;
    private boolean reverseScrolling;
    private ScrollAxisRange scrollAxisRange;
    private Function1<? super Integer, Boolean> scrollToIndexAction;
    private LazyLayoutSemanticState state;
    private boolean userScrollEnabled;

    public static final /* synthetic */ Function0 access$getItemProviderLambda$p(LazyLayoutSemanticsModifierNode $this) {
        return $this.itemProviderLambda;
    }

    public static final /* synthetic */ LazyLayoutSemanticState access$getState$p(LazyLayoutSemanticsModifierNode $this) {
        return $this.state;
    }

    public LazyLayoutSemanticsModifierNode(Function0<? extends LazyLayoutItemProvider> r2, LazyLayoutSemanticState state, Orientation orientation, boolean userScrollEnabled, boolean reverseScrolling) {
        this.itemProviderLambda = r2;
        this.state = state;
        this.orientation = orientation;
        this.userScrollEnabled = userScrollEnabled;
        this.reverseScrolling = reverseScrolling;
        this.indexForKeyMapping = new LazyLayoutSemanticsModifierNode$indexForKeyMapping$1(this);
        updateCachedSemanticsValues();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    private final boolean isVertical() {
        if (this.orientation != Orientation.Vertical) goto L5;
        return true;
    L5:
        return false;
    }

    private final CollectionInfo getCollectionInfo() {
        return this.state.collectionInfo();
    }

    public final void update(Function0<? extends LazyLayoutItemProvider> r2, LazyLayoutSemanticState state, Orientation orientation, boolean userScrollEnabled, boolean reverseScrolling) {
        this.itemProviderLambda = r2;
        this.state = state;
        if (this.orientation == orientation) goto L6;
        this.orientation = orientation;
        SemanticsModifierNodeKt.invalidateSemantics(this);
    L6:
        if (this.userScrollEnabled == userScrollEnabled) goto L8;
    L9:
        this.userScrollEnabled = userScrollEnabled;
        this.reverseScrolling = reverseScrolling;
        updateCachedSemanticsValues();
        SemanticsModifierNodeKt.invalidateSemantics(this);
        return;
    L8:
        if (this.reverseScrolling != reverseScrolling) goto L9;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver $this$applySemantics) {
        SemanticsPropertiesKt.setTraversalGroup($this$applySemantics, true);
        SemanticsPropertiesKt.indexForKey($this$applySemantics, this.indexForKeyMapping);
        boolean r1 = isVertical();
        ScrollAxisRange r2 = this.scrollAxisRange;
        if (r1 == false) goto L7;
        if (r2 != null) goto L6;
        Intrinsics.throwUninitializedPropertyAccessException("scrollAxisRange");
        r2 = null;
    L6:
        SemanticsPropertiesKt.setVerticalScrollAxisRange($this$applySemantics, r2);
    L10:
        Function1<? super Integer, Boolean> r3 = this.scrollToIndexAction;
        if (r3 == null) goto L13;
        SemanticsPropertiesKt.scrollToIndex$default($this$applySemantics, null, r3, 1, null);
    L13:
        SemanticsPropertiesKt.getScrollViewportLength$default($this$applySemantics, null, new AnonymousClass2(this), 1, null);
        SemanticsPropertiesKt.setCollectionInfo($this$applySemantics, getCollectionInfo());
        return;
    L7:
        if (r2 != null) goto L9;
        Intrinsics.throwUninitializedPropertyAccessException("scrollAxisRange");
        r2 = null;
    L9:
        SemanticsPropertiesKt.setHorizontalScrollAxisRange($this$applySemantics, r2);
        goto L10
    }

    private final void updateCachedSemanticsValues() {
        this.scrollAxisRange = new ScrollAxisRange(new AnonymousClass1(this), new C03342(this), this.reverseScrolling);
        if (this.userScrollEnabled == false) goto L5;
        Function1<Integer, Boolean> r0 = new AnonymousClass3(this);
    L6:
        this.scrollToIndexAction = r0;
        return;
    L5:
        r0 = null;
        goto L6
    }
}
