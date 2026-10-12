package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.DelegatingNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: DragAndDropSource.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001BD\u0012'\u0010\u0002\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n¢\u0006\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000Rm\u0010\u0002\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\b2'\u0010\u0010\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016*\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000RG\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d*\u0004\b\u0019\u0010\u0012¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;", "Landroidx/compose/ui/node/DelegatingNode;", "detectDragStart", "Lkotlin/Function2;", "Landroidx/compose/foundation/draganddrop/DragAndDropStartDetectorScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "transferData", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "cacheDrawScopeDragShadowCallback", "Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;", "<set-?>", "getDetectDragStart$delegate", "(Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;)Ljava/lang/Object;", "getDetectDragStart", "()Lkotlin/jvm/functions/Function2;", "setDetectDragStart", "(Lkotlin/jvm/functions/Function2;)V", "dragAndDropModifierNode", "Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;", "getTransferData$delegate", "getTransferData", "()Lkotlin/jvm/functions/Function1;", "setTransferData", "(Lkotlin/jvm/functions/Function1;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DragSourceNodeWithDefaultPainter extends DelegatingNode {
    private final CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback;
    private final DragAndDropSourceNode dragAndDropModifierNode;

    public static final /* synthetic */ CacheDrawScopeDragShadowCallback access$getCacheDrawScopeDragShadowCallback$p(DragSourceNodeWithDefaultPainter $this) {
        return $this.cacheDrawScopeDragShadowCallback;
    }

    public DragSourceNodeWithDefaultPainter(Function2<? super DragAndDropStartDetectorScope, ? super Continuation<? super Unit>, ? extends Object> r5, Function1<? super Offset, DragAndDropTransferData> r6) {
        CacheDrawScopeDragShadowCallback it = new CacheDrawScopeDragShadowCallback();
        delegate(DrawModifierKt.CacheDrawModifierNode(new DragSourceNodeWithDefaultPainter$cacheDrawScopeDragShadowCallback$1$1(it)));
        this.cacheDrawScopeDragShadowCallback = it;
        this.dragAndDropModifierNode = (DragAndDropSourceNode) delegate(new DragAndDropSourceNode(new DragSourceNodeWithDefaultPainter$dragAndDropModifierNode$1(this), r5, r6));
    }

    private static Object getDetectDragStart$delegate(DragSourceNodeWithDefaultPainter r6) {
        return Reflection.mutableProperty0(new MutablePropertyReference0Impl(r6.dragAndDropModifierNode, DragAndDropSourceNode.class, "detectDragStart", "getDetectDragStart()Lkotlin/jvm/functions/Function2;", 0));
    }

    public final Function2<DragAndDropStartDetectorScope, Continuation<? super Unit>, Object> getDetectDragStart() {
        return this.dragAndDropModifierNode.getDetectDragStart();
    }

    public final void setDetectDragStart(Function2<? super DragAndDropStartDetectorScope, ? super Continuation<? super Unit>, ? extends Object> r2) {
        this.dragAndDropModifierNode.setDetectDragStart(r2);
    }

    private static Object getTransferData$delegate(DragSourceNodeWithDefaultPainter r6) {
        return Reflection.mutableProperty0(new MutablePropertyReference0Impl(r6.dragAndDropModifierNode, DragAndDropSourceNode.class, "transferData", "getTransferData()Lkotlin/jvm/functions/Function1;", 0));
    }

    public final Function1<Offset, DragAndDropTransferData> getTransferData() {
        return this.dragAndDropModifierNode.getTransferData();
    }

    public final void setTransferData(Function1<? super Offset, DragAndDropTransferData> r2) {
        this.dragAndDropModifierNode.setTransferData(r2);
    }
}
