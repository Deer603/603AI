package androidx.compose.foundation.gestures;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Rect;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: compiled from: BringIntoViewRequestPriorityQueue.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005J9\u0010\u0011\u001a\u00020\u000b2#\u0010\u0012\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u000b0\u0013H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0006\u0010\u0018\u001a\u00020\u000fJ\u0006\u0010\u0019\u001a\u00020\u000bJ9\u0010\u001a\u001a\u00020\u000b2#\u0010\u0012\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u000f0\u0013H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue;", "", "()V", "requests", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/gestures/ContentInViewNode$Request;", "size", "", "getSize", "()I", "cancelAndRemoveAll", "", "cause", "", "enqueue", "", "request", "forEachFromSmallest", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Rect;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "bounds", "isEmpty", "resumeAndRemoveAll", "resumeAndRemoveWhile", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BringIntoViewRequestPriorityQueue {
    public static final int $stable = 0;
    private final MutableVector<ContentInViewNode.Request> requests;

    static {
        $stable = MutableVector.$stable;
    }

    public BringIntoViewRequestPriorityQueue() {
        this.requests = new MutableVector(new ContentInViewNode.Request[16], 0);
    }

    public static final /* synthetic */ MutableVector access$getRequests$p(BringIntoViewRequestPriorityQueue $this) {
        return $this.requests;
    }

    public final int getSize() {
        return this.requests.getSize();
    }

    public final boolean isEmpty() {
        if (this.requests.getSize() != 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean enqueue(final ContentInViewNode.Request request) {
        Rect requestBounds = request.getCurrentBounds().invoke();
        if (requestBounds != null) goto L6;
        CancellableContinuation<Unit> r3 = request.getContinuation();
        Result.Companion r4 = Result.Companion;
        r3.resumeWith(Result.m7425constructorimpl(Unit.INSTANCE));
        return false;
    L6:
        request.getContinuation().invokeOnCancellation(new AnonymousClass1(this, request));
        IntRange r2 = RangesKt.until(0, this.requests.getSize());
        int $i$f$getIndices = r2.getFirst();
        int i = r2.getLast();
        if ($i$f$getIndices > i) goto L24;
    L8:
        ContentInViewNode.Request r = this.requests.content[i];
        Rect rBounds = r.getCurrentBounds().invoke();
        if (rBounds == null) goto L22;
        Rect intersection = requestBounds.intersect(rBounds);
        if (Intrinsics.areEqual(intersection, requestBounds) == true) goto L13;
        if (Intrinsics.areEqual(intersection, rBounds) == true) goto L22;
        CancellationException cause = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
        int j = this.requests.getSize() - 1;
        if (j > i) goto L22;
    L19:
        this.requests.content[i].getContinuation().cancel(cause);
        if (j == i) goto L22;
        j = j + 1;
        goto L19
    L13:
        this.requests.add(i + 1, request);
        return true;
    L22:
        if (i == $i$f$getIndices) goto L24;
        i = i - 1;
    L24:
        this.requests.add(0, request);
        return true;
    }

    public final void forEachFromSmallest(Function1<? super Rect, Unit> r9) {
        MutableVector this_$iv = access$getRequests$p(this);
        int i$iv = this_$iv.getSize() - 1;
        Object[] content$iv = this_$iv.content;
        if (i$iv >= content$iv.length) goto L7;
    L4:
        if (i$iv < 0) goto L9;
        ContentInViewNode.Request it = (ContentInViewNode.Request) content$iv[i$iv];
        r9.invoke(it.getCurrentBounds().invoke());
        i$iv = i$iv - 1;
        goto L4
    L9:
        return;
    }

    public final void resumeAndRemoveAll() {
        IntRange r0 = RangesKt.until(0, this.requests.getSize());
        int i = r0.getFirst();
        int r1 = r0.getLast();
        if (i > r1) goto L7;
    L4:
        CancellableContinuation<Unit> r2 = this.requests.content[i].getContinuation();
        Unit r3 = Unit.INSTANCE;
        Result.Companion r4 = Result.Companion;
        r2.resumeWith(Result.m7425constructorimpl(r3));
        if (i == r1) goto L7;
        i = i + 1;
    L7:
        this.requests.clear();
    }

    public final void resumeAndRemoveWhile(Function1<? super Rect, Boolean> r7) {
    L3:
        MutableVector this_$iv = access$getRequests$p(this);
        if (this_$iv.getSize() == 0) goto L6;
        boolean r3 = true;
    L7:
        if (r3 == false) goto L12;
        if (r7.invoke(((ContentInViewNode.Request) access$getRequests$p(this).last()).getCurrentBounds().invoke()).booleanValue() == false) goto L11;
        MutableVector r1 = access$getRequests$p(this);
        MutableVector this_$iv2 = access$getRequests$p(this);
        CancellableContinuation<Unit> r2 = ((ContentInViewNode.Request) r1.removeAt(this_$iv2.getSize() - 1)).getContinuation();
        Unit r4 = Unit.INSTANCE;
        Result.Companion r5 = Result.Companion;
        r2.resumeWith(Result.m7425constructorimpl(r4));
        goto L3
    L11:
        return;
    L12:
        return;
    L6:
        r3 = false;
        goto L7
    }

    public final void cancelAndRemoveAll(Throwable cause) {
        MutableVector<ContentInViewNode.Request> r0 = this.requests;
        int r2 = r0.getSize();
        CancellableContinuation[] r3 = new CancellableContinuation[r2];
        boolean value$iv = false;
        int r5 = 0;
    L3:
        if (r5 >= r2) goto L5;
        ContentInViewNode.Request it = r0.content[r5];
        r3[r5] = it.getContinuation();
        r5 = r5 + 1;
        goto L3
    L5:
        int r1 = r3.length;
        int r4 = 0;
    L6:
        if (r4 >= r1) goto L9;
        r3[r4].cancel(cause);
        r4 = r4 + 1;
        goto L6
    L9:
        if (this.requests.getSize() != 0) goto L12;
        value$iv = true;
    L12:
        if (value$iv == true) goto L18;
        InlineClassHelperKt.throwIllegalStateException("uncancelled requests present");
        return;
    }
}
