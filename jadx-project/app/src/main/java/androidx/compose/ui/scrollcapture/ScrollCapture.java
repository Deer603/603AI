package androidx.compose.ui.scrollcapture;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRectKt;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: ScrollCapture.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J\b\u0010\u0017\u001a\u00020\rH\u0016J\b\u0010\u0018\u001a\u00020\rH\u0016R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/scrollcapture/ScrollCapture;", "Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$ScrollCaptureSessionListener;", "()V", "<set-?>", "", "scrollCaptureInProgress", "getScrollCaptureInProgress", "()Z", "setScrollCaptureInProgress", "(Z)V", "scrollCaptureInProgress$delegate", "Landroidx/compose/runtime/MutableState;", "onScrollCaptureSearch", "", "view", "Landroid/view/View;", "semanticsOwner", "Landroidx/compose/ui/semantics/SemanticsOwner;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "targets", "Ljava/util/function/Consumer;", "Landroid/view/ScrollCaptureTarget;", "onSessionEnded", "onSessionStarted", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ScrollCapture implements ComposeScrollCaptureCallback.ScrollCaptureSessionListener {
    public static final int $stable = 0;
    private final MutableState scrollCaptureInProgress$delegate;

    /* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScrollCapture.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function1<ScrollCaptureCandidate, Unit> {
        AnonymousClass1(Object r8) {
            super(1, r8, MutableVector.class, "add", "add(Ljava/lang/Object;)Z", 8);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ScrollCaptureCandidate r2) {
            invoke2(r2);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ScrollCaptureCandidate p0) {
            ((MutableVector) this.receiver).add(p0);
        }
    }

    static {
    }

    public ScrollCapture() {
        this.scrollCaptureInProgress$delegate = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    private final void setScrollCaptureInProgress(boolean r5) {
        MutableState $this$setValue$iv = this.scrollCaptureInProgress$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    public final boolean getScrollCaptureInProgress() {
        State $this$getValue$iv = this.scrollCaptureInProgress$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    public final void onScrollCaptureSearch(View view, SemanticsOwner semanticsOwner, CoroutineContext coroutineContext, Consumer<ScrollCaptureTarget> r18) {
        boolean r5 = false;
        MutableVector candidates = new MutableVector(new ScrollCaptureCandidate[16], 0);
        Object r4 = null;
        ScrollCapture_androidKt.visitScrollCaptureCandidates$default(semanticsOwner.getUnmergedRootSemanticsNode(), 0, new AnonymousClass1(candidates), 2, null);
        candidates.sortWith(ComparisonsKt.compareBy(new Function1[]{AnonymousClass2.INSTANCE, AnonymousClass3.INSTANCE}));
        if (candidates.getSize() != 0) goto L5;
        r5 = true;
    L5:
        if (r5 == true) goto L8;
        int index$iv$iv = candidates.getSize() - 1;
        r4 = candidates.content[index$iv$iv];
    L8:
        ScrollCaptureCandidate candidate = (ScrollCaptureCandidate) r4;
        if (candidate != null) goto L11;
        return;
    L11:
        CoroutineScope coroutineScope = CoroutineScopeKt.CoroutineScope(coroutineContext);
        ComposeScrollCaptureCallback callback = new ComposeScrollCaptureCallback(candidate.getNode(), candidate.getViewportBoundsInWindow(), coroutineScope, this, view);
        Rect localVisibleRectOfCandidate = LayoutCoordinatesKt.boundsInRoot(candidate.getCoordinates());
        long windowOffsetOfCandidate = candidate.getViewportBoundsInWindow().m7130getTopLeftnOccac();
        ScrollCaptureTarget $this$onScrollCaptureSearch_u24lambda_u241 = new ScrollCaptureTarget(view, RectHelper_androidKt.toAndroidRect(IntRectKt.roundToIntRect(localVisibleRectOfCandidate)), new Point(IntOffset.m7101getXimpl(windowOffsetOfCandidate), IntOffset.m7102getYimpl(windowOffsetOfCandidate)), callback);
        $this$onScrollCaptureSearch_u24lambda_u241.setScrollBounds(RectHelper_androidKt.toAndroidRect(candidate.getViewportBoundsInWindow()));
        r18.accept($this$onScrollCaptureSearch_u24lambda_u241);
    }

    @Override // androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback.ScrollCaptureSessionListener
    public void onSessionStarted() {
        setScrollCaptureInProgress(true);
    }

    @Override // androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback.ScrollCaptureSessionListener
    public void onSessionEnded() {
        setScrollCaptureInProgress(false);
    }
}
