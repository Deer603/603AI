package androidx.core.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a2\u0010 \u001a\u00020!*\u00020\u00022#\b\u0004\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020!0#H\u0086\b\u001a2\u0010'\u001a\u00020!*\u00020\u00022#\b\u0004\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020!0#H\u0086\b\u001a2\u0010(\u001a\u00020!*\u00020\u00022#\b\u0004\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020!0#H\u0086\b\u001a2\u0010)\u001a\u00020!*\u00020\u00022#\b\u0004\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020!0#H\u0086\b\u001a2\u0010*\u001a\u00020+*\u00020\u00022#\b\u0004\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020!0#H\u0086\b\u001a\u0014\u0010,\u001a\u00020-*\u00020\u00022\b\b\u0002\u0010.\u001a\u00020/\u001a%\u00100\u001a\u000201*\u00020\u00022\u0006\u00102\u001a\u0002032\u000e\b\u0004\u0010\"\u001a\b\u0012\u0004\u0012\u00020!04H\u0086\b\u001a \u00105\u001a\u000201*\u00020\u00022\u0006\u00102\u001a\u0002032\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!04\u001a\u0017\u00106\u001a\u00020!*\u00020\u00022\b\b\u0001\u00107\u001a\u00020\u0013H\u0086\b\u001a7\u00108\u001a\u00020!\"\n\b\u0000\u00109\u0018\u0001*\u00020:*\u00020\u00022\u0017\u0010;\u001a\u0013\u0012\u0004\u0012\u0002H9\u0012\u0004\u0012\u00020!0#¢\u0006\u0002\b<H\u0087\b¢\u0006\u0002\b=\u001a&\u00108\u001a\u00020!*\u00020\u00022\u0017\u0010;\u001a\u0013\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020!0#¢\u0006\u0002\b<H\u0086\b\u001a5\u0010>\u001a\u00020!*\u00020\u00022\b\b\u0003\u0010?\u001a\u00020\u00132\b\b\u0003\u0010@\u001a\u00020\u00132\b\b\u0003\u0010A\u001a\u00020\u00132\b\b\u0003\u0010B\u001a\u00020\u0013H\u0086\b\u001a5\u0010C\u001a\u00020!*\u00020\u00022\b\b\u0003\u0010D\u001a\u00020\u00132\b\b\u0003\u0010@\u001a\u00020\u00132\b\b\u0003\u0010E\u001a\u00020\u00132\b\b\u0003\u0010B\u001a\u00020\u0013H\u0086\b\"\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0004\"*\u0010\n\u001a\u00020\t*\u00020\u00022\u0006\u0010\b\u001a\u00020\t8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\"*\u0010\u000e\u001a\u00020\t*\u00020\u00022\u0006\u0010\b\u001a\u00020\t8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\r\"*\u0010\u0010\u001a\u00020\t*\u00020\u00022\u0006\u0010\b\u001a\u00020\t8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\r\"\u0016\u0010\u0012\u001a\u00020\u0013*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0016\u0010\u0016\u001a\u00020\u0013*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015\"\u0016\u0010\u0018\u001a\u00020\u0013*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015\"\u0016\u0010\u001a\u001a\u00020\u0013*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015\"\u0016\u0010\u001c\u001a\u00020\u0013*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015\"\u0016\u0010\u001e\u001a\u00020\u0013*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0015¨\u0006F"}, d2 = {"allViews", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "getAllViews", "(Landroid/view/View;)Lkotlin/sequences/Sequence;", "ancestors", "Landroid/view/ViewParent;", "getAncestors", "value", "", "isGone", "(Landroid/view/View;)Z", "setGone", "(Landroid/view/View;Z)V", "isInvisible", "setInvisible", "isVisible", "setVisible", "marginBottom", "", "getMarginBottom", "(Landroid/view/View;)I", "marginEnd", "getMarginEnd", "marginLeft", "getMarginLeft", "marginRight", "getMarginRight", "marginStart", "getMarginStart", "marginTop", "getMarginTop", "doOnAttach", "", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "view", "doOnDetach", "doOnLayout", "doOnNextLayout", "doOnPreDraw", "Landroidx/core/view/OneShotPreDrawListener;", "drawToBitmap", "Landroid/graphics/Bitmap;", "config", "Landroid/graphics/Bitmap$Config;", "postDelayed", "Ljava/lang/Runnable;", "delayInMillis", "", "Lkotlin/Function0;", "postOnAnimationDelayed", "setPadding", "size", "updateLayoutParams", "T", "Landroid/view/ViewGroup$LayoutParams;", "block", "Lkotlin/ExtensionFunctionType;", "updateLayoutParamsTyped", "updatePadding", "left", "top", "right", "bottom", "updatePaddingRelative", "start", "end", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ViewKt {
    public static final void doOnNextLayout(View $this$doOnNextLayout, final Function1<? super View, Unit> r3) {
        $this$doOnNextLayout.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC06891(r3));
    }

    public static final void doOnLayout(View $this$doOnLayout, final Function1<? super View, Unit> r5) {
        if ($this$doOnLayout.isLaidOut() == true) goto L5;
    L7:
        $this$doOnLayout.addOnLayoutChangeListener(new ViewKt$doOnLayout$$inlined$doOnNextLayout$1(r5));
        return;
    L5:
        if ($this$doOnLayout.isLayoutRequested() == true) goto L7;
        r5.invoke($this$doOnLayout);
    }

    public static final OneShotPreDrawListener doOnPreDraw(final View $this$doOnPreDraw, final Function1<? super View, Unit> r3) {
        return OneShotPreDrawListener.add($this$doOnPreDraw, new RunnableC06901(r3, $this$doOnPreDraw));
    }

    public static final void doOnAttach(final View $this$doOnAttach, final Function1<? super View, Unit> r3) {
        if ($this$doOnAttach.isAttachedToWindow() == false) goto L5;
        r3.invoke($this$doOnAttach);
        return;
    L5:
        $this$doOnAttach.addOnAttachStateChangeListener(new AnonymousClass1($this$doOnAttach, r3));
    }

    public static final void doOnDetach(final View $this$doOnDetach, final Function1<? super View, Unit> r3) {
        if ($this$doOnDetach.isAttachedToWindow() == true) goto L5;
        r3.invoke($this$doOnDetach);
        return;
    L5:
        $this$doOnDetach.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC06881($this$doOnDetach, r3));
    }

    public static /* synthetic */ void updatePaddingRelative$default(View $this$updatePaddingRelative_u24default, int start, int top, int end, int bottom, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        start = $this$updatePaddingRelative_u24default.getPaddingStart();
    L6:
        if ((r5 & 2) == 0) goto L9;
        top = $this$updatePaddingRelative_u24default.getPaddingTop();
    L9:
        if ((r5 & 4) == 0) goto L12;
        end = $this$updatePaddingRelative_u24default.getPaddingEnd();
    L12:
        if ((r5 & 8) == 0) goto L14;
        bottom = $this$updatePaddingRelative_u24default.getPaddingBottom();
    L14:
        $this$updatePaddingRelative_u24default.setPaddingRelative(start, top, end, bottom);
    }

    public static final void updatePaddingRelative(View $this$updatePaddingRelative, int start, int top, int end, int bottom) {
        $this$updatePaddingRelative.setPaddingRelative(start, top, end, bottom);
    }

    public static /* synthetic */ void updatePadding$default(View $this$updatePadding_u24default, int left, int top, int right, int bottom, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        left = $this$updatePadding_u24default.getPaddingLeft();
    L6:
        if ((r5 & 2) == 0) goto L9;
        top = $this$updatePadding_u24default.getPaddingTop();
    L9:
        if ((r5 & 4) == 0) goto L12;
        right = $this$updatePadding_u24default.getPaddingRight();
    L12:
        if ((r5 & 8) == 0) goto L14;
        bottom = $this$updatePadding_u24default.getPaddingBottom();
    L14:
        $this$updatePadding_u24default.setPadding(left, top, right, bottom);
    }

    public static final void updatePadding(View $this$updatePadding, int left, int top, int right, int bottom) {
        $this$updatePadding.setPadding(left, top, right, bottom);
    }

    public static final void setPadding(View $this$setPadding, int size) {
        $this$setPadding.setPadding(size, size, size, size);
    }

    public static final Runnable postDelayed(View $this$postDelayed, long delayInMillis, final Function0<Unit> r5) {
        Runnable runnable = new ViewKt$postDelayed$runnable$1(r5);
        $this$postDelayed.postDelayed(runnable, delayInMillis);
        return runnable;
    }

    public static final Runnable postOnAnimationDelayed(View $this$postOnAnimationDelayed, long delayInMillis, final Function0<Unit> r4) {
        Runnable runnable = new ViewKt$$ExternalSyntheticLambda0(r4);
        $this$postOnAnimationDelayed.postOnAnimationDelayed(runnable, delayInMillis);
        return runnable;
    }

    static final void postOnAnimationDelayed$lambda$1(Function0 $action) {
        $action.invoke();
    }

    public static /* synthetic */ Bitmap drawToBitmap$default(View r0, Bitmap.Config r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = Bitmap.Config.ARGB_8888;
    L6:
        return drawToBitmap(r0, r1);
    }

    public static final Bitmap drawToBitmap(View $this$drawToBitmap, Bitmap.Config config) {
        if ($this$drawToBitmap.isLaidOut() == false) goto L7;
        Bitmap $this$applyCanvas$iv = Bitmap.createBitmap($this$drawToBitmap.getWidth(), $this$drawToBitmap.getHeight(), config);
        Canvas c$iv = new Canvas($this$applyCanvas$iv);
        c$iv.translate(-$this$drawToBitmap.getScrollX(), -$this$drawToBitmap.getScrollY());
        $this$drawToBitmap.draw(c$iv);
        return $this$applyCanvas$iv;
    L7:
        throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
    }

    public static final boolean isVisible(View $this$isVisible) {
        if ($this$isVisible.getVisibility() != 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static final void setVisible(View $this$isVisible, boolean value) {
        if (value == false) goto L5;
        int r1 = 0;
    L6:
        $this$isVisible.setVisibility(r1);
        return;
    L5:
        r1 = 8;
        goto L6
    }

    public static final boolean isInvisible(View $this$isInvisible) {
        if ($this$isInvisible.getVisibility() != 4) goto L5;
        return true;
    L5:
        return false;
    }

    public static final void setInvisible(View $this$isInvisible, boolean value) {
        if (value == false) goto L5;
        int r1 = 4;
    L6:
        $this$isInvisible.setVisibility(r1);
        return;
    L5:
        r1 = 0;
        goto L6
    }

    public static final boolean isGone(View $this$isGone) {
        if ($this$isGone.getVisibility() != 8) goto L5;
        return true;
    L5:
        return false;
    }

    public static final void setGone(View $this$isGone, boolean value) {
        if (value == false) goto L5;
        int r1 = 8;
    L6:
        $this$isGone.setVisibility(r1);
        return;
    L5:
        r1 = 0;
        goto L6
    }

    public static final void updateLayoutParams(View $this$updateLayoutParams, Function1<? super ViewGroup.LayoutParams, Unit> r6) {
        ViewGroup.LayoutParams params$iv = $this$updateLayoutParams.getLayoutParams();
        if (params$iv == null) goto L7;
        r6.invoke(params$iv);
        $this$updateLayoutParams.setLayoutParams(params$iv);
        return;
    L7:
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final /* synthetic */ <T extends ViewGroup.LayoutParams> void updateLayoutParamsTyped(View $this$updateLayoutParams, Function1<? super T, Unit> r5) {
        ViewGroup.LayoutParams r1 = $this$updateLayoutParams.getLayoutParams();
        Intrinsics.reifiedOperationMarker(1, "T");
        ViewGroup.LayoutParams params = r1;
        r5.invoke(params);
        $this$updateLayoutParams.setLayoutParams(params);
    }

    public static final int getMarginLeft(View $this$marginLeft) {
        ViewGroup.LayoutParams r1 = $this$marginLeft.getLayoutParams();
        if ((r1 instanceof ViewGroup.MarginLayoutParams) == false) goto L5;
        ViewGroup.MarginLayoutParams r2 = (ViewGroup.MarginLayoutParams) r1;
    L6:
        if (r2 != null) goto L10;
        return 0;
    L10:
        return r2.leftMargin;
    L5:
        r2 = null;
        goto L6
    }

    public static final int getMarginTop(View $this$marginTop) {
        ViewGroup.LayoutParams r1 = $this$marginTop.getLayoutParams();
        if ((r1 instanceof ViewGroup.MarginLayoutParams) == false) goto L5;
        ViewGroup.MarginLayoutParams r2 = (ViewGroup.MarginLayoutParams) r1;
    L6:
        if (r2 != null) goto L10;
        return 0;
    L10:
        return r2.topMargin;
    L5:
        r2 = null;
        goto L6
    }

    public static final int getMarginRight(View $this$marginRight) {
        ViewGroup.LayoutParams r1 = $this$marginRight.getLayoutParams();
        if ((r1 instanceof ViewGroup.MarginLayoutParams) == false) goto L5;
        ViewGroup.MarginLayoutParams r2 = (ViewGroup.MarginLayoutParams) r1;
    L6:
        if (r2 != null) goto L10;
        return 0;
    L10:
        return r2.rightMargin;
    L5:
        r2 = null;
        goto L6
    }

    public static final int getMarginBottom(View $this$marginBottom) {
        ViewGroup.LayoutParams r1 = $this$marginBottom.getLayoutParams();
        if ((r1 instanceof ViewGroup.MarginLayoutParams) == false) goto L5;
        ViewGroup.MarginLayoutParams r2 = (ViewGroup.MarginLayoutParams) r1;
    L6:
        if (r2 != null) goto L10;
        return 0;
    L10:
        return r2.bottomMargin;
    L5:
        r2 = null;
        goto L6
    }

    public static final int getMarginStart(View $this$marginStart) {
        ViewGroup.LayoutParams lp = $this$marginStart.getLayoutParams();
        if ((lp instanceof ViewGroup.MarginLayoutParams) == true) goto L7;
        return 0;
    L7:
        return ((ViewGroup.MarginLayoutParams) lp).getMarginStart();
    }

    public static final int getMarginEnd(View $this$marginEnd) {
        ViewGroup.LayoutParams lp = $this$marginEnd.getLayoutParams();
        if ((lp instanceof ViewGroup.MarginLayoutParams) == true) goto L7;
        return 0;
    L7:
        return ((ViewGroup.MarginLayoutParams) lp).getMarginEnd();
    }

    public static final Sequence<ViewParent> getAncestors(View $this$ancestors) {
        return SequencesKt.generateSequence($this$ancestors.getParent(), ViewKt$ancestors$1.INSTANCE);
    }

    public static final Sequence<View> getAllViews(View $this$allViews) {
        return SequencesKt.sequence(new ViewKt$allViews$1($this$allViews, null));
    }
}
