package androidx.compose.ui.draganddrop;

import android.view.DragEvent;
import android.view.View;
import androidx.autofill.HintConstants;
import androidx.collection.ArraySet;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.core.app.NotificationCompat;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: AndroidDragAndDropManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002Bc\u0012\\\u0010\u0003\u001aX\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012$\u0012\"\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0014H\u0016J\u0018\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0014H\u0016J\"\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020(H\u0016ø\u0001\u0000¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000Rd\u0010\u0003\u001aX\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012$\u0012\"\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;", "Landroid/view/View$OnDragListener;", "Landroidx/compose/ui/draganddrop/DragAndDropManager;", "startDrag", "Lkotlin/Function3;", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "transferData", "Landroidx/compose/ui/geometry/Size;", "decorationSize", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "drawDragDecoration", "", "(Lkotlin/jvm/functions/Function3;)V", "interestedTargets", "Landroidx/collection/ArraySet;", "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", "isRequestDragAndDropTransferRequired", "()Z", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "rootDragAndDropNode", "Landroidx/compose/ui/draganddrop/DragAndDropNode;", "isInterestedTarget", "target", "onDrag", "view", "Landroid/view/View;", NotificationCompat.CATEGORY_EVENT, "Landroid/view/DragEvent;", "registerTargetInterest", "requestDragAndDropTransfer", "node", "offset", "Landroidx/compose/ui/geometry/Offset;", "requestDragAndDropTransfer-Uv8p0NA", "(Landroidx/compose/ui/draganddrop/DragAndDropNode;J)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidDragAndDropManager implements View.OnDragListener, DragAndDropManager {
    public static final int $stable = 0;
    private final ArraySet<DragAndDropTarget> interestedTargets;
    private final Modifier modifier;
    private final DragAndDropNode rootDragAndDropNode;
    private final Function3<DragAndDropTransferData, Size, Function1<? super DrawScope, Unit>, Boolean> startDrag;

    static {
        $stable = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidDragAndDropManager(Function3<? super DragAndDropTransferData, ? super Size, ? super Function1<? super DrawScope, Unit>, Boolean> r5) {
        this.startDrag = r5;
        this.rootDragAndDropNode = new DragAndDropNode(null, null, 3, null);
        this.interestedTargets = new ArraySet(0, 1, null);
        this.modifier = new AndroidDragAndDropManager$modifier$1(this);
    }

    public static final /* synthetic */ DragAndDropNode access$getRootDragAndDropNode$p(AndroidDragAndDropManager $this) {
        return $this.rootDragAndDropNode;
    }

    public static final /* synthetic */ Function3 access$getStartDrag$p(AndroidDragAndDropManager $this) {
        return $this.startDrag;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    public Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    public boolean isRequestDragAndDropTransferRequired() {
        return true;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    /* JADX INFO: renamed from: requestDragAndDropTransfer-Uv8p0NA, reason: not valid java name */
    public void mo3961requestDragAndDropTransferUv8p0NA(DragAndDropNode node, long offset) {
        final Ref.BooleanRef isTransferStarted = new Ref.BooleanRef();
        node.m3967startDragAndDropTransferd4ec7I(new AndroidDragAndDropManager$requestDragAndDropTransfer$dragAndDropSourceScope$1(isTransferStarted, this), offset, new AndroidDragAndDropManager$requestDragAndDropTransfer$1$1(isTransferStarted));
    }

    @Override // android.view.View.OnDragListener
    public boolean onDrag(View view, DragEvent event) {
        DragAndDropEvent dragAndDropEvent = new DragAndDropEvent(event);
        switch(event.getAction()) {
            case 1: goto L10;
            case 2: goto L9;
            case 3: goto L8;
            case 4: goto L7;
            case 5: goto L6;
            case 6: goto L5;
            default: goto L21;
        };
    L5:
        this.rootDragAndDropNode.onExited(dragAndDropEvent);
        return false;
    L6:
        this.rootDragAndDropNode.onEntered(dragAndDropEvent);
        return false;
    L7:
        this.rootDragAndDropNode.onEnded(dragAndDropEvent);
        this.interestedTargets.clear();
        return false;
    L8:
        boolean accepted = this.rootDragAndDropNode.onDrop(dragAndDropEvent);
        return accepted;
    L9:
        this.rootDragAndDropNode.onMoved(dragAndDropEvent);
        return false;
    L10:
        boolean accepted2 = this.rootDragAndDropNode.acceptDragAndDropTransfer(dragAndDropEvent);
        Iterable $this$forEach$iv = this.interestedTargets;
        Iterator<DragAndDropTarget> r4 = $this$forEach$iv.iterator();
    L12:
        if (r4.hasNext() == false) goto L22;
        Object element$iv = r4.next();
        DragAndDropTarget it = (DragAndDropTarget) element$iv;
        it.onStarted(dragAndDropEvent);
        goto L12
    L22:
        return accepted2;
    L21:
        return false;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    public void registerTargetInterest(DragAndDropTarget target) {
        this.interestedTargets.add(target);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    public boolean isInterestedTarget(DragAndDropTarget target) {
        return this.interestedTargets.contains(target);
    }
}
