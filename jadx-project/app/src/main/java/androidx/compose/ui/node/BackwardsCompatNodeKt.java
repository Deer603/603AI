package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BackwardsCompatNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0001\u001a\f\u0010\b\u001a\u00020\t*\u00020\u0005H\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"DetachedModifierLocalReadScope", "androidx/compose/ui/node/BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1", "Landroidx/compose/ui/node/BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1;", "onDrawCacheReadsChanged", "Lkotlin/Function1;", "Landroidx/compose/ui/node/BackwardsCompatNode;", "", "updateModifierLocalConsumer", "isChainUpdate", "", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class BackwardsCompatNodeKt {
    private static final BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1 DetachedModifierLocalReadScope = null;
    private static final Function1<BackwardsCompatNode, Unit> onDrawCacheReadsChanged = null;
    private static final Function1<BackwardsCompatNode, Unit> updateModifierLocalConsumer = null;

    public static final /* synthetic */ BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1 access$getDetachedModifierLocalReadScope$p() {
        return DetachedModifierLocalReadScope;
    }

    public static final /* synthetic */ Function1 access$getOnDrawCacheReadsChanged$p() {
        return onDrawCacheReadsChanged;
    }

    public static final /* synthetic */ Function1 access$getUpdateModifierLocalConsumer$p() {
        return updateModifierLocalConsumer;
    }

    public static final /* synthetic */ boolean access$isChainUpdate(BackwardsCompatNode $receiver) {
        return isChainUpdate($receiver);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.node.BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1] */
    static {
        DetachedModifierLocalReadScope = new BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1();
        onDrawCacheReadsChanged = BackwardsCompatNodeKt$onDrawCacheReadsChanged$1.INSTANCE;
        updateModifierLocalConsumer = BackwardsCompatNodeKt$updateModifierLocalConsumer$1.INSTANCE;
    }

    private static final boolean isChainUpdate(BackwardsCompatNode $this$isChainUpdate) {
        Modifier.Node r0 = DelegatableNodeKt.requireLayoutNode($this$isChainUpdate).getNodes$ui_release().getTail$ui_release();
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        TailModifierNode tailNode = (TailModifierNode) r0;
        return tailNode.getAttachHasBeenRun();
    }
}
