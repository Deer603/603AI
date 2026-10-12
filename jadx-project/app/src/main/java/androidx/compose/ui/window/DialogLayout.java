package androidx.compose.ui.window;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.core.app.NotificationCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.math.MathKt;

/* JADX INFO: compiled from: AndroidDialog.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\r\u0010\u001d\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\u001eJ~\u0010\u001f\u001a\u0002H \"\u0004\b\u0000\u0010 2\u0006\u0010!\u001a\u0002H 2`\u0010\"\u001a\\\u0012\u0013\u0012\u00110$¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b('\u0012\u0013\u0012\u00110$¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b((\u0012\u0013\u0012\u00110$¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b()\u0012\u0013\u0012\u00110$¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(*\u0012\u0004\u0012\u0002H 0#H\u0082\b¢\u0006\u0002\u0010+J5\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u00152\u0006\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020$H\u0010¢\u0006\u0002\b.J\u001d\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020$2\u0006\u00101\u001a\u00020$H\u0010¢\u0006\u0002\b2J\u000e\u00103\u001a\u00020\u00152\u0006\u00104\u001a\u000205J\u0018\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u000207H\u0016J&\u0010\u0010\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020<2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f¢\u0006\u0002\u0010=J\u0016\u0010>\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015RA\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f2\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u0015@RX\u0094\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006?"}, d2 = {"Landroidx/compose/ui/window/DialogLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/window/DialogWindowProvider;", "Landroidx/core/view/OnApplyWindowInsetsListener;", "context", "Landroid/content/Context;", "window", "Landroid/view/Window;", "(Landroid/content/Context;Landroid/view/Window;)V", "<set-?>", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "getContent", "()Lkotlin/jvm/functions/Function2;", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "content$delegate", "Landroidx/compose/runtime/MutableState;", "decorFitsSystemWindows", "", "hasCalledSetLayout", "shouldCreateCompositionOnAttachedToWindow", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "usePlatformDefaultWidth", "getWindow", "()Landroid/view/Window;", "Content", "(Landroidx/compose/runtime/Composer;I)V", "insetValue", "T", "unchangedValue", "block", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "left", "top", "right", "bottom", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "internalOnLayout", "changed", "internalOnLayout$ui_release", "internalOnMeasure", "widthMeasureSpec", "heightMeasureSpec", "internalOnMeasure$ui_release", "isInsideContent", NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", "onApplyWindowInsets", "Landroidx/core/view/WindowInsetsCompat;", "v", "Landroid/view/View;", "insets", "parent", "Landroidx/compose/runtime/CompositionContext;", "(Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)V", "updateProperties", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DialogLayout extends AbstractComposeView implements DialogWindowProvider, OnApplyWindowInsetsListener {
    private final MutableState content$delegate;
    private boolean decorFitsSystemWindows;
    private boolean hasCalledSetLayout;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private boolean usePlatformDefaultWidth;
    private final Window window;

    public static final /* synthetic */ boolean access$getDecorFitsSystemWindows$p(DialogLayout $this) {
        return $this.decorFitsSystemWindows;
    }

    @Override // androidx.compose.ui.window.DialogWindowProvider
    public Window getWindow() {
        return this.window;
    }

    public DialogLayout(Context context, Window window) {
        super(context, null, 0, 6, null);
        this.window = window;
        this.content$delegate = SnapshotStateKt.mutableStateOf$default(ComposableSingletons$AndroidDialog_androidKt.INSTANCE.m7227getLambda1$ui_release(), null, 2, null);
        ViewCompat.setOnApplyWindowInsetsListener(this, this);
        ViewCompat.setWindowInsetsAnimationCallback(this, new AnonymousClass1(this));
    }

    private final Function2<Composer, Integer, Unit> getContent() {
        State $this$getValue$iv = this.content$delegate;
        return (Function2) $this$getValue$iv.getValue();
    }

    private final void setContent(Function2<? super Composer, ? super Integer, Unit> r4) {
        MutableState $this$setValue$iv = this.content$delegate;
        $this$setValue$iv.setValue(r4);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final void updateProperties(boolean usePlatformDefaultWidth, boolean decorFitsSystemWindows) {
        if (this.hasCalledSetLayout == true) goto L5;
    L10:
        boolean callSetLayout = true;
    L11:
        this.usePlatformDefaultWidth = usePlatformDefaultWidth;
        this.decorFitsSystemWindows = decorFitsSystemWindows;
        if (callSetLayout == false) goto L23;
        WindowManager.LayoutParams attrs = getWindow().getAttributes();
        if (usePlatformDefaultWidth == false) goto L16;
        int measurementWidth = -2;
    L18:
        if (measurementWidth == attrs.width) goto L20;
    L21:
        getWindow().setLayout(measurementWidth, -2);
        this.hasCalledSetLayout = true;
        return;
    L20:
        if (this.hasCalledSetLayout == false) goto L21;
        return;
    L16:
        measurementWidth = -1;
        goto L18
    L23:
        return;
    L5:
        if (usePlatformDefaultWidth != this.usePlatformDefaultWidth) goto L10;
        if (decorFitsSystemWindows != this.decorFitsSystemWindows) goto L10;
        callSetLayout = false;
        goto L11
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnMeasure$ui_release(int widthMeasureSpec, int heightMeasureSpec) {
        View child = getChildAt(0);
        if (child != null) goto L6;
        super.internalOnMeasure$ui_release(widthMeasureSpec, heightMeasureSpec);
        return;
    L6:
        int width = View.MeasureSpec.getSize(widthMeasureSpec);
        int height = View.MeasureSpec.getSize(heightMeasureSpec);
        int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        if (heightMode == Integer.MIN_VALUE) goto L9;
    L15:
        int targetHeight = height;
    L16:
        int horizontalPadding = getPaddingLeft() + getPaddingRight();
        int verticalPadding = getPaddingTop() + getPaddingBottom();
        int $this$fastCoerceAtLeast$iv = width - horizontalPadding;
        if ($this$fastCoerceAtLeast$iv >= 0) goto L19;
        $this$fastCoerceAtLeast$iv = 0;
    L19:
        int $this$fastCoerceAtLeast$iv2 = targetHeight - verticalPadding;
        if ($this$fastCoerceAtLeast$iv2 >= 0) goto L22;
        $this$fastCoerceAtLeast$iv2 = 0;
    L22:
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        if (widthMode != 0) goto L25;
        int childWidthSpec = widthMeasureSpec;
    L27:
        if (heightMode != 0) goto L29;
        int childHeightSpec = heightMeasureSpec;
    L30:
        child.measure(childWidthSpec, childHeightSpec);
        switch(widthMode) {
            case -2147483648: goto L34;
            case 1073741824: goto L33;
            default: goto L32;
        };
    L32:
        int measuredWidth = child.getMeasuredWidth() + horizontalPadding;
    L36:
        switch(heightMode) {
            case -2147483648: goto L39;
            case 1073741824: goto L38;
            default: goto L37;
        };
    L37:
        int measuredHeight = child.getMeasuredHeight() + verticalPadding;
    L40:
        setMeasuredDimension(measuredWidth, measuredHeight);
        if (this.usePlatformDefaultWidth == false) goto L43;
        return;
    L43:
        if (this.decorFitsSystemWindows == false) goto L45;
        return;
    L45:
        if ((child.getMeasuredHeight() + verticalPadding) > height) goto L47;
        return;
    L47:
        if (getWindow().getAttributes().height != (-2)) goto L53;
        getWindow().setLayout(-1, -1);
        return;
    L53:
        return;
    L38:
        measuredHeight = height;
        goto L40
    L39:
        measuredHeight = Math.min(height, child.getMeasuredHeight() + verticalPadding);
        goto L40
    L33:
        measuredWidth = width;
        goto L36
    L34:
        measuredWidth = Math.min(width, child.getMeasuredWidth() + horizontalPadding);
        goto L36
    L29:
        childHeightSpec = View.MeasureSpec.makeMeasureSpec($this$fastCoerceAtLeast$iv2, Integer.MIN_VALUE);
        goto L30
    L25:
        childWidthSpec = View.MeasureSpec.makeMeasureSpec($this$fastCoerceAtLeast$iv, Integer.MIN_VALUE);
        goto L27
    L9:
        if (this.usePlatformDefaultWidth == true) goto L15;
        if (this.decorFitsSystemWindows == true) goto L15;
        if (getWindow().getAttributes().height != (-2)) goto L15;
        targetHeight = height + 1;
        goto L16
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnLayout$ui_release(boolean changed, int left, int top, int right, int bottom) {
        View child = getChildAt(0);
        if (child != null) goto L5;
        return;
    L5:
        int hPadding = getPaddingLeft() + getPaddingRight();
        int vPadding = getPaddingTop() + getPaddingBottom();
        int width = right - left;
        int height = bottom - top;
        int childWidth = child.getMeasuredWidth();
        int childHeight = child.getMeasuredHeight();
        int extraWidth = (width - childWidth) - hPadding;
        int extraHeight = (height - childHeight) - vPadding;
        int l = getPaddingLeft() + (extraWidth / 2);
        int t = getPaddingTop() + (extraHeight / 2);
        int r = l + childWidth;
        int b = t + childHeight;
        child.layout(l, t, r, b);
    }

    public final void setContent(CompositionContext parent, Function2<? super Composer, ? super Integer, Unit> r3) {
        setParentCompositionContext(parent);
        setContent(r3);
        this.shouldCreateCompositionOnAttachedToWindow = true;
        createComposition();
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View v, WindowInsetsCompat insets) {
        if (access$getDecorFitsSystemWindows$p(this) == true) goto L13;
        View child$iv = getChildAt(0);
        int left$iv = Math.max(0, child$iv.getLeft());
        int top$iv = Math.max(0, child$iv.getTop());
        int right$iv = Math.max(0, getWidth() - child$iv.getRight());
        int bottom$iv = Math.max(0, getHeight() - child$iv.getBottom());
        if (left$iv != 0) goto L14;
        if (top$iv != 0) goto L14;
        if (right$iv != 0) goto L14;
        if (bottom$iv != 0) goto L14;
        return insets;
    L14:
        return insets.inset(left$iv, top$iv, right$iv, bottom$iv);
    L13:
        return insets;
    }

    private final <T> T insetValue(T r11, Function4<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> r12) {
        if (access$getDecorFitsSystemWindows$p(this) == false) goto L5;
        return r11;
    L5:
        View child = getChildAt(0);
        int left = Math.max(0, child.getLeft());
        int top = Math.max(0, child.getTop());
        int right = Math.max(0, getWidth() - child.getRight());
        int bottom = Math.max(0, getHeight() - child.getBottom());
        if (left != 0) goto L12;
        if (top != 0) goto L12;
        if (right != 0) goto L12;
        if (bottom != 0) goto L12;
        return r11;
    L12:
        return r12.invoke(Integer.valueOf(left), Integer.valueOf(top), Integer.valueOf(right), Integer.valueOf(bottom));
    }

    public final boolean isInsideContent(MotionEvent event) {
        float r0 = event.getX();
        if (Float.isInfinite(r0) == false) goto L5;
    L7:
        boolean r1 = false;
    L8:
        if (r1 == false) goto L35;
        float r2 = event.getY();
        if (Float.isInfinite(r2) == false) goto L12;
    L14:
        boolean r3 = false;
    L15:
        if (r3 == false) goto L35;
        View child = getChildAt(0);
        if (child != null) goto L20;
        return false;
    L20:
        int left = getLeft() + child.getLeft();
        int right = child.getWidth() + left;
        int top = getTop() + child.getTop();
        int bottom = child.getHeight() + top;
        int r7 = MathKt.roundToInt(event.getX());
        if (left > r7) goto L24;
        if (r7 > right) goto L24;
        boolean r8 = true;
    L25:
        if (r8 == false) goto L34;
        int r9 = MathKt.roundToInt(event.getY());
        if (top > r9) goto L30;
        if (r9 > bottom) goto L30;
        boolean r10 = true;
    L31:
        if (r10 == false) goto L34;
        return true;
    L30:
        r10 = false;
    L34:
        return false;
    L24:
        r8 = false;
        goto L25
    L12:
        if (Float.isNaN(r2) == true) goto L14;
        r3 = true;
    L35:
        return false;
    L5:
        if (Float.isNaN(r0) == true) goto L7;
        r1 = true;
        goto L8
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void Content(Composer $composer, int $changed) {
        $composer.startReplaceGroup(1735448596);
        ComposerKt.sourceInformation($composer, "C(Content)411@16815L9:AndroidDialog.android.kt#2oxthz");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1735448596, $changed, -1, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:410)");
    L5:
        getContent().invoke($composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        $composer.endReplaceGroup();
    }
}
