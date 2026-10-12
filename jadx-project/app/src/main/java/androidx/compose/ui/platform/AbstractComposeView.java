package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.node.Owner;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\r\u0010*\u001a\u00020\u0012H'¢\u0006\u0002\u0010+J\u0012\u0010,\u001a\u00020\u00122\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u001c\u0010,\u001a\u00020\u00122\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u001a\u0010,\u001a\u00020\u00122\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u00101\u001a\u00020\u0007H\u0016J$\u0010,\u001a\u00020\u00122\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u00101\u001a\u00020\u00072\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\"\u0010,\u001a\u00020\u00122\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u0007H\u0016J$\u00104\u001a\u00020\u000f2\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u00101\u001a\u00020\u00072\b\u0010/\u001a\u0004\u0018\u000100H\u0014J,\u00104\u001a\u00020\u000f2\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u00101\u001a\u00020\u00072\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u00105\u001a\u00020\u000fH\u0014J\b\u00106\u001a\u00020\u0012H\u0002J\u0006\u00107\u001a\u00020\u0012J\u0006\u00108\u001a\u00020\u0012J\b\u00109\u001a\u00020\u0012H\u0002J5\u0010:\u001a\u00020\u00122\u0006\u0010;\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u00072\u0006\u0010?\u001a\u00020\u0007H\u0010¢\u0006\u0002\b@J\u001d\u0010A\u001a\u00020\u00122\u0006\u0010B\u001a\u00020\u00072\u0006\u0010C\u001a\u00020\u0007H\u0010¢\u0006\u0002\bDJ\b\u0010E\u001a\u00020\u000fH\u0016J\b\u0010F\u001a\u00020\u0012H\u0014J0\u0010G\u001a\u00020\u00122\u0006\u0010;\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u00072\u0006\u0010?\u001a\u00020\u0007H\u0004J\u0018\u0010H\u001a\u00020\u00122\u0006\u0010B\u001a\u00020\u00072\u0006\u0010C\u001a\u00020\u0007H\u0004J\u0010\u0010I\u001a\u00020\u00122\u0006\u0010J\u001a\u00020\u0007H\u0016J\b\u0010K\u001a\u00020\u000bH\u0002J\u0010\u0010L\u001a\u00020\u00122\b\u0010M\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010N\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u000fH\u0016J\u000e\u0010O\u001a\u00020\u00122\u0006\u0010P\u001a\u00020QJ\b\u0010R\u001a\u00020\u000fH\u0016J\f\u0010S\u001a\u00020\u000b*\u00020\u000bH\u0002R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001d@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u000f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0017R,\u0010#\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f8F@FX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b$\u0010\u0014\u001a\u0004\b%\u0010\u0017\"\u0004\b&\u0010'R\u0018\u0010(\u001a\u00020\u000f*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006T"}, d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cachedViewTreeCompositionContext", "Ljava/lang/ref/WeakReference;", "Landroidx/compose/runtime/CompositionContext;", "composition", "Landroidx/compose/runtime/Composition;", "creatingComposition", "", "disposeViewCompositionStrategy", "Lkotlin/Function0;", "", "getDisposeViewCompositionStrategy$annotations", "()V", "hasComposition", "getHasComposition", "()Z", "isTransitionGroupSet", "value", "parentContext", "setParentContext", "(Landroidx/compose/runtime/CompositionContext;)V", "Landroid/os/IBinder;", "previousAttachedWindowToken", "setPreviousAttachedWindowToken", "(Landroid/os/IBinder;)V", "shouldCreateCompositionOnAttachedToWindow", "getShouldCreateCompositionOnAttachedToWindow", "showLayoutBounds", "getShowLayoutBounds$annotations", "getShowLayoutBounds", "setShowLayoutBounds", "(Z)V", "isAlive", "(Landroidx/compose/runtime/CompositionContext;)Z", "Content", "(Landroidx/compose/runtime/Composer;I)V", "addView", "child", "Landroid/view/View;", "params", "Landroid/view/ViewGroup$LayoutParams;", "index", "width", "height", "addViewInLayout", "preventRequestLayout", "checkAddView", "createComposition", "disposeComposition", "ensureCompositionCreated", "internalOnLayout", "changed", "left", "top", "right", "bottom", "internalOnLayout$ui_release", "internalOnMeasure", "widthMeasureSpec", "heightMeasureSpec", "internalOnMeasure$ui_release", "isTransitionGroup", "onAttachedToWindow", "onLayout", "onMeasure", "onRtlPropertiesChanged", "layoutDirection", "resolveParentCompositionContext", "setParentCompositionContext", "parent", "setTransitionGroup", "setViewCompositionStrategy", "strategy", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "shouldDelayChildPressedState", "cacheIfAlive", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AbstractComposeView extends ViewGroup {
    public static final int $stable = 0;
    private WeakReference<CompositionContext> cachedViewTreeCompositionContext;
    private Composition composition;
    private boolean creatingComposition;
    private Function0<Unit> disposeViewCompositionStrategy;
    private boolean isTransitionGroupSet;
    private CompositionContext parentContext;
    private IBinder previousAttachedWindowToken;
    private boolean showLayoutBounds;

    static {
        $stable = 8;
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public abstract void Content(Composer r1, int r2);

    public AbstractComposeView(Context context) {
        AttributeSet r2 = null;
        int r3 = 0;
        this(context, r2, r3, 6, null);
    }

    public AbstractComposeView(Context context, AttributeSet attrs) {
        int r3 = 0;
        this(context, attrs, r3, 4, null);
    }

    public /* synthetic */ AbstractComposeView(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }

    public AbstractComposeView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        this.disposeViewCompositionStrategy = ViewCompositionStrategy.Companion.getDefault().installFor(this);
    }

    private final void setPreviousAttachedWindowToken(IBinder value) {
        if (this.previousAttachedWindowToken == value) goto L6;
        this.previousAttachedWindowToken = value;
        this.cachedViewTreeCompositionContext = null;
        return;
    }

    private final void setParentContext(CompositionContext value) {
        if (this.parentContext == value) goto L13;
        this.parentContext = value;
        if (value == null) goto L7;
        this.cachedViewTreeCompositionContext = null;
    L7:
        Composition old = this.composition;
        if (old == null) goto L14;
        old.dispose();
        this.composition = null;
        if (isAttachedToWindow() == false) goto L15;
        ensureCompositionCreated();
        return;
    L15:
        return;
    L14:
        return;
    }

    public final void setParentCompositionContext(CompositionContext parent) {
        setParentContext(parent);
    }

    public final void setViewCompositionStrategy(ViewCompositionStrategy strategy) {
        Function0<Unit> r0 = this.disposeViewCompositionStrategy;
        if (r0 == null) goto L5;
        r0.invoke();
    L5:
        this.disposeViewCompositionStrategy = strategy.installFor(this);
    }

    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public final void setShowLayoutBounds(boolean value) {
        this.showLayoutBounds = value;
        KeyEvent.Callback r0 = getChildAt(0);
        if (r0 == null) goto L6;
        ((Owner) r0).setShowLayoutBounds(value);
        return;
    }

    public final void createComposition() {
        if (this.parentContext == null) goto L5;
    L8:
        boolean r0 = true;
    L9:
        if (r0 == false) goto L13;
        ensureCompositionCreated();
        return;
    L13:
        throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
    L5:
        if (isAttachedToWindow() == true) goto L8;
        r0 = false;
        goto L9
    }

    private final void checkAddView() {
        if (this.creatingComposition == false) goto L6;
        return;
    L6:
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    private final boolean isAlive(CompositionContext $this$isAlive) {
        if (($this$isAlive instanceof Recomposer) == true) goto L5;
    L8:
        return true;
    L5:
        if (((Recomposer) $this$isAlive).getCurrentState().getValue().compareTo(Recomposer.State.ShuttingDown) > 0) goto L8;
        return false;
    }

    private final CompositionContext cacheIfAlive(CompositionContext $this$cacheIfAlive) {
        if (isAlive($this$cacheIfAlive) == false) goto L5;
        CompositionContext it = $this$cacheIfAlive;
    L6:
        if (it == null) goto L9;
        this.cachedViewTreeCompositionContext = new WeakReference(it);
    L9:
        return $this$cacheIfAlive;
    L5:
        it = null;
        goto L6
    }

    private final CompositionContext resolveParentCompositionContext() {
        CompositionContext r0 = this.parentContext;
        if (r0 != null) goto L20;
        CompositionContext r1 = WindowRecomposer_androidKt.findViewTreeCompositionContext(this);
        CompositionContext r2 = null;
        if (r1 == null) goto L7;
        CompositionContext r3 = cacheIfAlive(r1);
    L8:
        if (r3 != null) goto L21;
        WeakReference<CompositionContext> r4 = this.cachedViewTreeCompositionContext;
        if (r4 == null) goto L16;
        CompositionContext it = r4.get();
        if (it == null) goto L16;
        if (isAlive(it) == false) goto L16;
        r2 = it;
    L16:
        CompositionContext r5 = r2;
        if (r5 == null) goto L19;
        return r5;
    L19:
        return cacheIfAlive(WindowRecomposer_androidKt.getWindowRecomposer(this));
    L21:
        return r3;
    L7:
        r3 = null;
        goto L8
    L20:
        return r0;
    }

    private final void ensureCompositionCreated() {
        if (this.composition == null) goto L11;
        return;
    L11:
        this.creatingComposition = true;     // Catch: Throwable -> L7
        this.composition = Wrapper_androidKt.setContent(this, resolveParentCompositionContext(), ComposableLambdaKt.composableLambdaInstance(-656146368, true, new AnonymousClass1(this)));     // Catch: Throwable -> L7
        this.creatingComposition = false;
        return;
    L7:
        th = move-exception;
        this.creatingComposition = false;
        throw th;
    }

    public final void disposeComposition() {
        Composition r0 = this.composition;
        if (r0 == null) goto L5;
        r0.dispose();
    L5:
        this.composition = null;
        requestLayout();
    }

    public final boolean getHasComposition() {
        if (this.composition == null) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow() == false) goto L6;
        ensureCompositionCreated();
        return;
    }

    @Override // android.view.View
    protected final void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        ensureCompositionCreated();
        internalOnMeasure$ui_release(widthMeasureSpec, heightMeasureSpec);
    }

    public void internalOnMeasure$ui_release(int widthMeasureSpec, int heightMeasureSpec) {
        View child = getChildAt(0);
        if (child != null) goto L6;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        return;
    L6:
        int width = Math.max(0, (View.MeasureSpec.getSize(widthMeasureSpec) - getPaddingLeft()) - getPaddingRight());
        int height = Math.max(0, (View.MeasureSpec.getSize(heightMeasureSpec) - getPaddingTop()) - getPaddingBottom());
        child.measure(View.MeasureSpec.makeMeasureSpec(width, View.MeasureSpec.getMode(widthMeasureSpec)), View.MeasureSpec.makeMeasureSpec(height, View.MeasureSpec.getMode(heightMeasureSpec)));
        setMeasuredDimension((child.getMeasuredWidth() + getPaddingLeft()) + getPaddingRight(), (child.getMeasuredHeight() + getPaddingTop()) + getPaddingBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean changed, int left, int top, int right, int bottom) {
        internalOnLayout$ui_release(changed, left, top, right, bottom);
    }

    public void internalOnLayout$ui_release(boolean changed, int left, int top, int right, int bottom) {
        View r0 = getChildAt(0);
        if (r0 == null) goto L6;
        r0.layout(getPaddingLeft(), getPaddingTop(), (right - left) - getPaddingRight(), (bottom - top) - getPaddingBottom());
        return;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        View r0 = getChildAt(0);
        if (r0 == null) goto L7;
        r0.setLayoutDirection(layoutDirection);
        return;
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        if (this.isTransitionGroupSet == true) goto L5;
    L8:
        return true;
    L5:
        if (super.isTransitionGroup() == true) goto L8;
        return false;
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean isTransitionGroup) {
        super.setTransitionGroup(isTransitionGroup);
        this.isTransitionGroupSet = true;
    }

    @Override // android.view.ViewGroup
    public void addView(View child) {
        checkAddView();
        super.addView(child);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index) {
        checkAddView();
        super.addView(child, index);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int width, int height) {
        checkAddView();
        super.addView(child, width, height);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View child, ViewGroup.LayoutParams params) {
        checkAddView();
        super.addView(child, params);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        checkAddView();
        super.addView(child, index, params);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View child, int index, ViewGroup.LayoutParams params) {
        checkAddView();
        return super.addViewInLayout(child, index, params);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View child, int index, ViewGroup.LayoutParams params, boolean preventRequestLayout) {
        checkAddView();
        return super.addViewInLayout(child, index, params, preventRequestLayout);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
