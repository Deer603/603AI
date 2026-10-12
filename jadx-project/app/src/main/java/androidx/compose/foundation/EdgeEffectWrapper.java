package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: AndroidOverscroll.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0006\u0010\u001a\u001a\u00020\u001bJ\u001d\u0010\u001c\u001a\u00020\u001b2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001b0\u001eH\u0086\bJ\u0006\u0010\u001f\u001a\u00020\bJ\u0006\u0010 \u001a\u00020\bJ\u0006\u0010!\u001a\u00020\bJ\u0006\u0010\"\u001a\u00020\bJ\u0006\u0010#\u001a\u00020\bJ\u0006\u0010$\u001a\u00020\bJ\u0006\u0010%\u001a\u00020\bJ\u0006\u0010&\u001a\u00020\bJ\u0006\u0010'\u001a\u00020\u0014J\u0006\u0010(\u001a\u00020\u0014J\u0006\u0010)\u001a\u00020\u0014J\u0006\u0010*\u001a\u00020\u0014J\u0006\u0010+\u001a\u00020\u0014J\u0006\u0010,\u001a\u00020\u0014J\u0006\u0010-\u001a\u00020\u0014J\u0006\u0010.\u001a\u00020\u0014J\u0006\u0010/\u001a\u00020\u0014J\u0006\u00100\u001a\u00020\u0014J\u0006\u00101\u001a\u00020\u0014J\u0006\u00102\u001a\u00020\u0014J\u0018\u00103\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b4\u00105R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u00020\u000fX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014*\u0004\u0018\u00010\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0014*\u0004\u0018\u00010\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, d2 = {"Landroidx/compose/foundation/EdgeEffectWrapper;", "", "context", "Landroid/content/Context;", "glowColor", "", "(Landroid/content/Context;I)V", "bottomEffect", "Landroid/widget/EdgeEffect;", "bottomEffectNegation", "leftEffect", "leftEffectNegation", "rightEffect", "rightEffectNegation", "size", "Landroidx/compose/ui/unit/IntSize;", "J", "topEffect", "topEffectNegation", "isAnimating", "", "(Landroid/widget/EdgeEffect;)Z", "isStretched", "createEdgeEffect", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "finishAll", "", "forEachEffect", "action", "Lkotlin/Function1;", "getOrCreateBottomEffect", "getOrCreateBottomEffectNegation", "getOrCreateLeftEffect", "getOrCreateLeftEffectNegation", "getOrCreateRightEffect", "getOrCreateRightEffectNegation", "getOrCreateTopEffect", "getOrCreateTopEffectNegation", "isBottomAnimating", "isBottomNegationStretched", "isBottomStretched", "isLeftAnimating", "isLeftNegationStretched", "isLeftStretched", "isRightAnimating", "isRightNegationStretched", "isRightStretched", "isTopAnimating", "isTopNegationStretched", "isTopStretched", "updateSize", "updateSize-ozmzZPI", "(J)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class EdgeEffectWrapper {
    private EdgeEffect bottomEffect;
    private EdgeEffect bottomEffectNegation;
    private final Context context;
    private final int glowColor;
    private EdgeEffect leftEffect;
    private EdgeEffect leftEffectNegation;
    private EdgeEffect rightEffect;
    private EdgeEffect rightEffectNegation;
    private long size;
    private EdgeEffect topEffect;
    private EdgeEffect topEffectNegation;

    public EdgeEffectWrapper(Context context, int glowColor) {
        this.context = context;
        this.glowColor = glowColor;
        this.size = IntSize.Companion.m7149getZeroYbymL2g();
    }

    public static final /* synthetic */ EdgeEffect access$getBottomEffect$p(EdgeEffectWrapper $this) {
        return $this.bottomEffect;
    }

    public static final /* synthetic */ EdgeEffect access$getLeftEffect$p(EdgeEffectWrapper $this) {
        return $this.leftEffect;
    }

    public static final /* synthetic */ EdgeEffect access$getRightEffect$p(EdgeEffectWrapper $this) {
        return $this.rightEffect;
    }

    public static final /* synthetic */ EdgeEffect access$getTopEffect$p(EdgeEffectWrapper $this) {
        return $this.topEffect;
    }

    public final void forEachEffect(Function1<? super EdgeEffect, Unit> r3) {
        EdgeEffect r1 = access$getTopEffect$p(this);
        if (r1 == null) goto L5;
        r3.invoke(r1);
    L5:
        EdgeEffect r2 = access$getBottomEffect$p(this);
        if (r2 == null) goto L8;
        r3.invoke(r2);
    L8:
        EdgeEffect r4 = access$getLeftEffect$p(this);
        if (r4 == null) goto L11;
        r3.invoke(r4);
    L11:
        EdgeEffect r5 = access$getRightEffect$p(this);
        if (r5 == null) goto L15;
        r3.invoke(r5);
        return;
    }

    public final void finishAll() {
        EdgeEffect r0 = this.topEffect;
        if (r0 == null) goto L5;
        r0.finish();
    L5:
        EdgeEffect r1 = this.bottomEffect;
        if (r1 == null) goto L8;
        r1.finish();
    L8:
        EdgeEffect r2 = this.leftEffect;
        if (r2 == null) goto L11;
        r2.finish();
    L11:
        EdgeEffect r3 = this.rightEffect;
        if (r3 == null) goto L14;
        r3.finish();
    L14:
        EdgeEffect r4 = this.topEffectNegation;
        if (r4 == null) goto L17;
        r4.finish();
    L17:
        EdgeEffect r5 = this.bottomEffectNegation;
        if (r5 == null) goto L20;
        r5.finish();
    L20:
        EdgeEffect r6 = this.leftEffectNegation;
        if (r6 == null) goto L23;
        r6.finish();
    L23:
        EdgeEffect r7 = this.rightEffectNegation;
        if (r7 == null) goto L27;
        r7.finish();
        return;
    }

    public final boolean isTopStretched() {
        return isStretched(this.topEffect);
    }

    public final boolean isBottomStretched() {
        return isStretched(this.bottomEffect);
    }

    public final boolean isLeftStretched() {
        return isStretched(this.leftEffect);
    }

    public final boolean isRightStretched() {
        return isStretched(this.rightEffect);
    }

    public final boolean isTopNegationStretched() {
        return isStretched(this.topEffectNegation);
    }

    public final boolean isBottomNegationStretched() {
        return isStretched(this.bottomEffectNegation);
    }

    public final boolean isLeftNegationStretched() {
        return isStretched(this.leftEffectNegation);
    }

    public final boolean isRightNegationStretched() {
        return isStretched(this.rightEffectNegation);
    }

    private final boolean isStretched(EdgeEffect $this$isStretched) {
        boolean r0 = false;
        if ($this$isStretched != null) goto L6;
        return false;
    L6:
        if (EdgeEffectCompat.INSTANCE.getDistanceCompat($this$isStretched) != 0.0f) goto L9;
        r0 = true;
    L9:
        return !r0;
    }

    public final boolean isTopAnimating() {
        return isAnimating(this.topEffect);
    }

    public final boolean isBottomAnimating() {
        return isAnimating(this.bottomEffect);
    }

    public final boolean isLeftAnimating() {
        return isAnimating(this.leftEffect);
    }

    public final boolean isRightAnimating() {
        return isAnimating(this.rightEffect);
    }

    private final boolean isAnimating(EdgeEffect $this$isAnimating) {
        if ($this$isAnimating != null) goto L6;
        return false;
    L6:
        return !$this$isAnimating.isFinished();
    }

    public final EdgeEffect getOrCreateTopEffect() {
        EdgeEffect r0 = this.topEffect;
        if (r0 != null) goto L6;
        EdgeEffect it = createEdgeEffect(Orientation.Vertical);
        this.topEffect = it;
        return it;
    L6:
        return r0;
    }

    public final EdgeEffect getOrCreateBottomEffect() {
        EdgeEffect r0 = this.bottomEffect;
        if (r0 != null) goto L6;
        EdgeEffect it = createEdgeEffect(Orientation.Vertical);
        this.bottomEffect = it;
        return it;
    L6:
        return r0;
    }

    public final EdgeEffect getOrCreateLeftEffect() {
        EdgeEffect r0 = this.leftEffect;
        if (r0 != null) goto L6;
        EdgeEffect it = createEdgeEffect(Orientation.Horizontal);
        this.leftEffect = it;
        return it;
    L6:
        return r0;
    }

    public final EdgeEffect getOrCreateRightEffect() {
        EdgeEffect r0 = this.rightEffect;
        if (r0 != null) goto L6;
        EdgeEffect it = createEdgeEffect(Orientation.Horizontal);
        this.rightEffect = it;
        return it;
    L6:
        return r0;
    }

    public final EdgeEffect getOrCreateTopEffectNegation() {
        EdgeEffect r0 = this.topEffectNegation;
        if (r0 != null) goto L6;
        EdgeEffect it = createEdgeEffect(Orientation.Vertical);
        this.topEffectNegation = it;
        return it;
    L6:
        return r0;
    }

    public final EdgeEffect getOrCreateBottomEffectNegation() {
        EdgeEffect r0 = this.bottomEffectNegation;
        if (r0 != null) goto L6;
        EdgeEffect it = createEdgeEffect(Orientation.Vertical);
        this.bottomEffectNegation = it;
        return it;
    L6:
        return r0;
    }

    public final EdgeEffect getOrCreateLeftEffectNegation() {
        EdgeEffect r0 = this.leftEffectNegation;
        if (r0 != null) goto L6;
        EdgeEffect it = createEdgeEffect(Orientation.Horizontal);
        this.leftEffectNegation = it;
        return it;
    L6:
        return r0;
    }

    public final EdgeEffect getOrCreateRightEffectNegation() {
        EdgeEffect r0 = this.rightEffectNegation;
        if (r0 != null) goto L6;
        EdgeEffect it = createEdgeEffect(Orientation.Horizontal);
        this.rightEffectNegation = it;
        return it;
    L6:
        return r0;
    }

    private final EdgeEffect createEdgeEffect(Orientation orientation) {
        EdgeEffect $this$createEdgeEffect_u24lambda_u248 = EdgeEffectCompat.INSTANCE.create(this.context);
        $this$createEdgeEffect_u24lambda_u248.setColor(this.glowColor);
        if (IntSize.m7142equalsimpl0(this.size, IntSize.Companion.m7149getZeroYbymL2g()) == false) goto L5;
    L9:
        return $this$createEdgeEffect_u24lambda_u248;
    L5:
        if (orientation != Orientation.Vertical) goto L7;
        long arg0$iv = this.size;
        int r4 = (int) (arg0$iv >> 32);
        long arg0$iv2 = this.size;
        $this$createEdgeEffect_u24lambda_u248.setSize(r4, (int) (4294967295L & arg0$iv2));
        goto L9
    L7:
        long arg0$iv3 = this.size;
        long arg0$iv4 = this.size;
        $this$createEdgeEffect_u24lambda_u248.setSize((int) (4294967295L & arg0$iv3), (int) (arg0$iv4 >> 32));
        goto L9
    }

    /* JADX INFO: renamed from: updateSize-ozmzZPI, reason: not valid java name */
    public final void m288updateSizeozmzZPI(long size) {
        this.size = size;
        EdgeEffect r0 = this.topEffect;
        if (r0 == null) goto L5;
        r0.setSize((int) (size >> 32), (int) (size & 4294967295L));
    L5:
        EdgeEffect r1 = this.bottomEffect;
        if (r1 == null) goto L8;
        r1.setSize((int) (size >> 32), (int) (size & 4294967295L));
    L8:
        EdgeEffect r2 = this.leftEffect;
        if (r2 == null) goto L11;
        r2.setSize((int) (size & 4294967295L), (int) (size >> 32));
    L11:
        EdgeEffect r3 = this.rightEffect;
        if (r3 == null) goto L14;
        r3.setSize((int) (size & 4294967295L), (int) (size >> 32));
    L14:
        EdgeEffect r4 = this.topEffectNegation;
        if (r4 == null) goto L17;
        r4.setSize((int) (size >> 32), (int) (size & 4294967295L));
    L17:
        EdgeEffect r5 = this.bottomEffectNegation;
        if (r5 == null) goto L20;
        r5.setSize((int) (size >> 32), (int) (size & 4294967295L));
    L20:
        EdgeEffect r6 = this.leftEffectNegation;
        if (r6 == null) goto L23;
        r6.setSize((int) (size & 4294967295L), (int) (size >> 32));
    L23:
        EdgeEffect r7 = this.rightEffectNegation;
        if (r7 == null) goto L27;
        r7.setSize((int) (4294967295L & size), (int) (size >> 32));
        return;
    }
}
