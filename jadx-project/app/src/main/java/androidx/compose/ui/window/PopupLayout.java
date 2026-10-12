package androidx.compose.ui.window;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.app.NotificationCompat;
import androidx.core.view.PointerIconCompat;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: AndroidPopup.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 \u0083\u00012\u00020\u00012\u00020\u0002:\u0002\u0083\u0001BO\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\r\u0010[\u001a\u00020\u0005H\u0017¢\u0006\u0002\u0010\\J\b\u0010]\u001a\u00020,H\u0002J\u0006\u0010^\u001a\u00020\u0005J\u0010\u0010_\u001a\u00020\u00182\u0006\u0010`\u001a\u00020aH\u0016J\b\u0010b\u001a\u000202H\u0002J5\u0010c\u001a\u00020\u00052\u0006\u0010d\u001a\u00020\u00182\u0006\u0010e\u001a\u00020f2\u0006\u0010g\u001a\u00020f2\u0006\u0010h\u001a\u00020f2\u0006\u0010i\u001a\u00020fH\u0010¢\u0006\u0002\bjJ\u001d\u0010k\u001a\u00020\u00052\u0006\u0010l\u001a\u00020f2\u0006\u0010m\u001a\u00020fH\u0010¢\u0006\u0002\bnJ\b\u0010o\u001a\u00020\u0005H\u0002J\b\u0010p\u001a\u00020\u0005H\u0002J\b\u0010q\u001a\u00020\u0005H\u0014J\b\u0010r\u001a\u00020\u0005H\u0014J\u0012\u0010s\u001a\u00020\u00182\b\u0010`\u001a\u0004\u0018\u00010tH\u0016J\u0006\u0010u\u001a\u00020\u0005J&\u0010\"\u001a\u00020\u00052\u0006\u0010v\u001a\u00020w2\u0011\u0010\u001f\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u001e¢\u0006\u0002\u0010xJ\u0010\u0010y\u001a\u00020\u00052\u0006\u0010z\u001a\u00020fH\u0016J\u0006\u0010{\u001a\u00020\u0005J\u0010\u0010|\u001a\u00020\u00052\u0006\u0010z\u001a\u00020;H\u0002J.\u0010}\u001a\u00020\u00052\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010z\u001a\u00020;J\r\u0010~\u001a\u00020\u0005H\u0001¢\u0006\u0002\b\u007fJ\u000f\u0010\u0080\u0001\u001a\u00020\u00052\u0006\u00104\u001a\u000203J\u0011\u0010\u0081\u0001\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0007\u0010\u0082\u0001\u001a\u00020\u0005R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000RA\u0010\u001f\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u001e2\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u001e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010(\u001a\u00020)X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010*R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010+\u001a\u00020,8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000R/\u00104\u001a\u0004\u0018\u0001032\b\u0010\u001d\u001a\u0004\u0018\u0001038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010%\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u0010:\u001a\u00020;X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R5\u0010A\u001a\u0004\u0018\u00010@2\b\u0010\u001d\u001a\u0004\u0018\u00010@8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bF\u0010%\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010G\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u000e\u0010L\u001a\u00020MX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010N\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0018@RX\u0094\u000e¢\u0006\b\n\u0000\u001a\u0004\bO\u0010\u001aR\u000e\u0010P\u001a\u00020QX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010R\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u000e\u0010Y\u001a\u00020ZX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0084\u0001"}, d2 = {"Landroidx/compose/ui/window/PopupLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/platform/ViewRootForInspector;", "onDismissRequest", "Lkotlin/Function0;", "", "properties", "Landroidx/compose/ui/window/PopupProperties;", "testTag", "", "composeView", "Landroid/view/View;", "density", "Landroidx/compose/ui/unit/Density;", "initialPositionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "popupId", "Ljava/util/UUID;", "popupLayoutHelper", "Landroidx/compose/ui/window/PopupLayoutHelper;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Ljava/lang/String;Landroid/view/View;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/window/PopupPositionProvider;Ljava/util/UUID;Landroidx/compose/ui/window/PopupLayoutHelper;)V", "backCallback", "", "canCalculatePosition", "", "getCanCalculatePosition", "()Z", "canCalculatePosition$delegate", "Landroidx/compose/runtime/State;", "<set-?>", "Landroidx/compose/runtime/Composable;", "content", "getContent", "()Lkotlin/jvm/functions/Function2;", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "content$delegate", "Landroidx/compose/runtime/MutableState;", "locationOnScreen", "", "maxSupportedElevation", "Landroidx/compose/ui/unit/Dp;", "F", "params", "Landroid/view/WindowManager$LayoutParams;", "getParams$ui_release$annotations", "()V", "getParams$ui_release", "()Landroid/view/WindowManager$LayoutParams;", "parentBounds", "Landroidx/compose/ui/unit/IntRect;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "parentLayoutCoordinates", "getParentLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setParentLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "parentLayoutCoordinates$delegate", "parentLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setParentLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/unit/IntSize;", "popupContentSize", "getPopupContentSize-bOM6tXw", "()Landroidx/compose/ui/unit/IntSize;", "setPopupContentSize-fhxjrPA", "(Landroidx/compose/ui/unit/IntSize;)V", "popupContentSize$delegate", "positionProvider", "getPositionProvider", "()Landroidx/compose/ui/window/PopupPositionProvider;", "setPositionProvider", "(Landroidx/compose/ui/window/PopupPositionProvider;)V", "previousWindowVisibleFrame", "Landroid/graphics/Rect;", "shouldCreateCompositionOnAttachedToWindow", "getShouldCreateCompositionOnAttachedToWindow", "snapshotStateObserver", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "subCompositionView", "getSubCompositionView", "()Landroidx/compose/ui/platform/AbstractComposeView;", "getTestTag", "()Ljava/lang/String;", "setTestTag", "(Ljava/lang/String;)V", "windowManager", "Landroid/view/WindowManager;", "Content", "(Landroidx/compose/runtime/Composer;I)V", "createLayoutParams", "dismiss", "dispatchKeyEvent", NotificationCompat.CATEGORY_EVENT, "Landroid/view/KeyEvent;", "getVisibleDisplayBounds", "internalOnLayout", "changed", "left", "", "top", "right", "bottom", "internalOnLayout$ui_release", "internalOnMeasure", "widthMeasureSpec", "heightMeasureSpec", "internalOnMeasure$ui_release", "maybeRegisterBackCallback", "maybeUnregisterBackCallback", "onAttachedToWindow", "onDetachedFromWindow", "onTouchEvent", "Landroid/view/MotionEvent;", "pollForLocationOnScreenChange", "parent", "Landroidx/compose/runtime/CompositionContext;", "(Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)V", "setLayoutDirection", "layoutDirection", "show", "superSetLayoutDirection", "updateParameters", "updateParentBounds", "updateParentBounds$ui_release", "updateParentLayoutCoordinates", "updatePopupProperties", "updatePosition", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PopupLayout extends AbstractComposeView implements ViewRootForInspector {
    public static final int $stable = 0;
    private static final Companion Companion = null;
    private static final Function1<PopupLayout, Unit> onCommitAffectingPopupPosition = null;
    private Object backCallback;
    private final State canCalculatePosition$delegate;
    private final View composeView;
    private final MutableState content$delegate;
    private final int[] locationOnScreen;
    private final float maxSupportedElevation;
    private Function0<Unit> onDismissRequest;
    private final WindowManager.LayoutParams params;
    private IntRect parentBounds;
    private final MutableState parentLayoutCoordinates$delegate;
    private LayoutDirection parentLayoutDirection;
    private final MutableState popupContentSize$delegate;
    private final PopupLayoutHelper popupLayoutHelper;
    private PopupPositionProvider positionProvider;
    private final Rect previousWindowVisibleFrame;
    private PopupProperties properties;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private final SnapshotStateObserver snapshotStateObserver;
    private String testTag;
    private final WindowManager windowManager;

    /* JADX INFO: compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/window/PopupLayout$Companion;", "", "()V", "onCommitAffectingPopupPosition", "Lkotlin/Function1;", "Landroidx/compose/ui/window/PopupLayout;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: AndroidPopup.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[LayoutDirection.values().length];
            r0[LayoutDirection.Ltr.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L11:
            r0[LayoutDirection.Rtl.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L9:
            $EnumSwitchMapping$0 = r0;
        }
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    public static final /* synthetic */ LayoutCoordinates access$getParentLayoutCoordinates(PopupLayout $this) {
        return $this.getParentLayoutCoordinates();
    }

    public /* synthetic */ PopupLayout(Function0 r11, PopupProperties r12, String r13, View r14, Density r15, PopupPositionProvider r16, UUID r17, PopupLayoutHelper r18, int r19, DefaultConstructorMarker r20) {
        if ((r19 & 128) != 0) goto L5;
        PopupLayoutHelper r9 = r18;
    L10:
        this(r11, r12, r13, r14, r15, r16, r17, r9);
        return;
    L5:
        if (Build.VERSION.SDK_INT < 29) goto L7;
        PopupLayoutHelperImpl r0 = new PopupLayoutHelperImpl29();
    L8:
        r9 = r0;
        goto L10
    L7:
        r0 = new PopupLayoutHelperImpl();
        goto L8
    }

    public final String getTestTag() {
        return this.testTag;
    }

    public final void setTestTag(String r1) {
        this.testTag = r1;
    }

    public PopupLayout(Function0<Unit> r7, PopupProperties properties, String testTag, View composeView, Density density, PopupPositionProvider initialPositionProvider, UUID popupId, PopupLayoutHelper popupLayoutHelper) {
        super(composeView.getContext(), null, 0, 6, null);
        this.onDismissRequest = r7;
        this.properties = properties;
        this.testTag = testTag;
        this.composeView = composeView;
        this.popupLayoutHelper = popupLayoutHelper;
        Object r0 = this.composeView.getContext().getSystemService("window");
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type android.view.WindowManager");
        this.windowManager = (WindowManager) r0;
        this.params = createLayoutParams();
        this.positionProvider = initialPositionProvider;
        this.parentLayoutDirection = LayoutDirection.Ltr;
        this.popupContentSize$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.parentLayoutCoordinates$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.canCalculatePosition$delegate = SnapshotStateKt.derivedStateOf(new PopupLayout$canCalculatePosition$2(this));
        this.maxSupportedElevation = Dp.m6973constructorimpl(8);
        this.previousWindowVisibleFrame = new Rect();
        this.snapshotStateObserver = new SnapshotStateObserver(new PopupLayout$snapshotStateObserver$1(this));
        setId(R.id.content);
        ViewTreeLifecycleOwner.set(this, ViewTreeLifecycleOwner.get(this.composeView));
        ViewTreeViewModelStoreOwner.set(this, ViewTreeViewModelStoreOwner.get(this.composeView));
        ViewTreeSavedStateRegistryOwner.set(this, ViewTreeSavedStateRegistryOwner.get(this.composeView));
        setTag(androidx.compose.ui.R.id.compose_view_saveable_id_tag, "Popup:" + popupId);
        setClipChildren(false);
        setElevation(density.mo376toPx0680j_4(this.maxSupportedElevation));
        setOutlineProvider(new AnonymousClass2());
        this.content$delegate = SnapshotStateKt.mutableStateOf$default(ComposableSingletons$AndroidPopup_androidKt.INSTANCE.m7228getLambda1$ui_release(), null, 2, null);
        this.locationOnScreen = new int[2];
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.params;
    }

    public final PopupPositionProvider getPositionProvider() {
        return this.positionProvider;
    }

    public final void setPositionProvider(PopupPositionProvider r1) {
        this.positionProvider = r1;
    }

    public final LayoutDirection getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    public final void setParentLayoutDirection(LayoutDirection r1) {
        this.parentLayoutDirection = r1;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final IntSize m7229getPopupContentSizebOM6tXw() {
        State $this$getValue$iv = this.popupContentSize$delegate;
        return (IntSize) $this$getValue$iv.getValue();
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m7230setPopupContentSizefhxjrPA(IntSize r4) {
        MutableState $this$setValue$iv = this.popupContentSize$delegate;
        $this$setValue$iv.setValue(r4);
    }

    private final LayoutCoordinates getParentLayoutCoordinates() {
        State $this$getValue$iv = this.parentLayoutCoordinates$delegate;
        return (LayoutCoordinates) $this$getValue$iv.getValue();
    }

    private final void setParentLayoutCoordinates(LayoutCoordinates r4) {
        MutableState $this$setValue$iv = this.parentLayoutCoordinates$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final boolean getCanCalculatePosition() {
        State $this$getValue$iv = this.canCalculatePosition$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public AbstractComposeView getSubCompositionView() {
        return this;
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

    public final void show() {
        this.windowManager.addView(this, this.params);
    }

    public final void setContent(CompositionContext parent, Function2<? super Composer, ? super Integer, Unit> r3) {
        setParentCompositionContext(parent);
        setContent(r3);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void Content(Composer $composer, int $changed) {
        $composer.startReplaceGroup(-857613600);
        ComposerKt.sourceInformation($composer, "C(Content)573@24168L9:AndroidPopup.android.kt#2oxthz");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-857613600, $changed, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:572)");
    L5:
        getContent().invoke($composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        $composer.endReplaceGroup();
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.snapshotStateObserver.start();
        maybeRegisterBackCallback();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.snapshotStateObserver.stop();
        this.snapshotStateObserver.clear();
        maybeUnregisterBackCallback();
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnMeasure$ui_release(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.properties.getUsePlatformDefaultWidth() == false) goto L5;
        super.internalOnMeasure$ui_release(widthMeasureSpec, heightMeasureSpec);
        return;
    L5:
        IntRect visibleDisplayBounds = getVisibleDisplayBounds();
        int displayWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.getWidth(), Integer.MIN_VALUE);
        int displayHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.getHeight(), Integer.MIN_VALUE);
        super.internalOnMeasure$ui_release(displayWidthMeasureSpec, displayHeightMeasureSpec);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnLayout$ui_release(boolean changed, int left, int top, int right, int bottom) {
        super.internalOnLayout$ui_release(changed, left, top, right, bottom);
        if (this.properties.getUsePlatformDefaultWidth() == true) goto L9;
        View child = getChildAt(0);
        if (child != null) goto L7;
        return;
    L7:
        WindowManager.LayoutParams r1 = this.params;
        r1.width = child.getMeasuredWidth();
        WindowManager.LayoutParams r2 = this.params;
        r2.height = child.getMeasuredHeight();
        this.popupLayoutHelper.updateViewLayout(this.windowManager, this, this.params);
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        if (this.properties.getDismissOnBackPress() == true) goto L7;
        return super.dispatchKeyEvent(event);
    L7:
        if (event.getKeyCode() != 4) goto L9;
    L10:
        KeyEvent.DispatcherState state = getKeyDispatcherState();
        if (state != null) goto L15;
        return super.dispatchKeyEvent(event);
    L15:
        if (event.getAction() != 0) goto L21;
        if (event.getRepeatCount() != 0) goto L21;
        state.startTracking(event, this);
        return true;
    L21:
        if (event.getAction() == 1) goto L23;
    L31:
        return super.dispatchKeyEvent(event);
    L23:
        if (state.isTracking(event) == false) goto L31;
        if (event.isCanceled() == true) goto L31;
        Function0<Unit> r1 = this.onDismissRequest;
        if (r1 == null) goto L29;
        r1.invoke();
    L29:
        return true;
    L9:
        if (event.getKeyCode() != 111) goto L31;
        goto L10
    }

    private final void maybeRegisterBackCallback() {
        if (this.properties.getDismissOnBackPress() == true) goto L5;
        return;
    L5:
        if (Build.VERSION.SDK_INT >= 33) goto L8;
        return;
    L8:
        if (this.backCallback != null) goto L10;
        this.backCallback = Api33Impl.createBackCallback(this.onDismissRequest);
    L10:
        Api33Impl.maybeRegisterBackCallback(this, this.backCallback);
    }

    private final void maybeUnregisterBackCallback() {
        if (Build.VERSION.SDK_INT < 33) goto L5;
        Api33Impl.maybeUnregisterBackCallback(this, this.backCallback);
    L5:
        this.backCallback = null;
    }

    public final void updateParameters(Function0<Unit> r1, PopupProperties properties, String testTag, LayoutDirection layoutDirection) {
        this.onDismissRequest = r1;
        this.testTag = testTag;
        updatePopupProperties(properties);
        superSetLayoutDirection(layoutDirection);
    }

    private final void updatePopupProperties(PopupProperties properties) {
        if (Intrinsics.areEqual(this.properties, properties) == false) goto L6;
        return;
    L6:
        if (properties.getUsePlatformDefaultWidth() == true) goto L8;
    L10:
        this.properties = properties;
        WindowManager.LayoutParams r0 = this.params;
        r0.flags = AndroidPopup_androidKt.access$flagsWithSecureFlagInherited(properties, AndroidPopup_androidKt.isFlagSecureEnabled(this.composeView));
        this.popupLayoutHelper.updateViewLayout(this.windowManager, this, this.params);
        return;
    L8:
        if (this.properties.getUsePlatformDefaultWidth() == true) goto L10;
        this.params.width = -2;
        this.params.height = -2;
        goto L10
    }

    public final void updateParentLayoutCoordinates(LayoutCoordinates parentLayoutCoordinates) {
        setParentLayoutCoordinates(parentLayoutCoordinates);
        updateParentBounds$ui_release();
    }

    public final void pollForLocationOnScreenChange() {
        int[] r0 = this.locationOnScreen;
        int oldX = r0[0];
        int oldY = r0[1];
        this.composeView.getLocationOnScreen(this.locationOnScreen);
        if (oldX == this.locationOnScreen[0]) goto L5;
    L6:
        updateParentBounds$ui_release();
        return;
    L5:
        if (oldY != this.locationOnScreen[1]) goto L6;
    }

    public final void updateParentBounds$ui_release() {
        LayoutCoordinates coordinates = getParentLayoutCoordinates();
        if (coordinates != null) goto L5;
        return;
    L5:
        if (coordinates.isAttached() == true) goto L8;
        coordinates = null;
    L8:
        if (coordinates == null) goto L16;
        long layoutSize = coordinates.mo5722getSizeYbymL2g();
        long position = LayoutCoordinatesKt.positionInWindow(coordinates);
        int bits$iv$iv$iv = (int) (position >> 32);
        float $this$fastRoundToInt$iv = Float.intBitsToFloat(bits$iv$iv$iv);
        int $i$f$fastRoundToInt = Math.round($this$fastRoundToInt$iv);
        int bits$iv$iv$iv2 = (int) (position & 4294967295L);
        float $this$fastRoundToInt$iv2 = Float.intBitsToFloat(bits$iv$iv$iv2);
        int $i$f$fastRoundToInt2 = Math.round($this$fastRoundToInt$iv2);
        long layoutPosition = IntOffset.m7095constructorimpl((((long) $i$f$fastRoundToInt) << 32) | (4294967295L & ((long) $i$f$fastRoundToInt2)));
        IntRect newParentBounds = IntRectKt.m7134IntRectVbeCjmY(layoutPosition, layoutSize);
        if (Intrinsics.areEqual(newParentBounds, this.parentBounds) == true) goto L15;
        this.parentBounds = newParentBounds;
        updatePosition();
        return;
    L15:
        return;
    }

    public final void updatePosition() {
        final IntRect parentBounds = this.parentBounds;
        if (parentBounds != null) goto L5;
        return;
    L5:
        IntSize r0 = m7229getPopupContentSizebOM6tXw();
        if (r0 == null) goto L13;
        final long popupContentSize = r0.m7148unboximpl();
        IntRect it = getVisibleDisplayBounds();
        int width$iv = it.getWidth();
        int height$iv = it.getHeight();
        final long windowSize = IntSize.m7139constructorimpl((((long) width$iv) << 32) | (((long) height$iv) & 4294967295L));
        final Ref.LongRef popupPosition = new Ref.LongRef();
        popupPosition.element = IntOffset.Companion.m7112getZeronOccac();
        this.snapshotStateObserver.observeReads(this, onCommitAffectingPopupPosition, new AnonymousClass1(popupPosition, this, parentBounds, windowSize, popupContentSize));
        WindowManager.LayoutParams r1 = this.params;
        r1.x = IntOffset.m7101getXimpl(popupPosition.element);
        WindowManager.LayoutParams r2 = this.params;
        r2.y = IntOffset.m7102getYimpl(popupPosition.element);
        if (this.properties.getExcludeFromSystemGesture() == false) goto L11;
        int $i$f$unpackInt2 = (int) (windowSize & 4294967295L);
        this.popupLayoutHelper.setGestureExclusionRects(this, (int) (windowSize >> 32), $i$f$unpackInt2);
    L11:
        this.popupLayoutHelper.updateViewLayout(this.windowManager, this, this.params);
        return;
    }

    public final void dismiss() {
        ViewTreeLifecycleOwner.set(this, null);
        this.windowManager.removeViewImmediate(this);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (this.properties.getDismissOnClickOutside() == false) goto L5;
        boolean r1 = false;
        if (event != null) goto L9;
    L11:
        boolean r2 = false;
    L12:
        if (r2 == true) goto L14;
    L25:
        if (event != null) goto L27;
    L29:
        if (r1 == false) goto L35;
        Function0<Unit> r3 = this.onDismissRequest;
        if (r3 == null) goto L33;
        r3.invoke();
    L33:
        return true;
    L35:
        return super.onTouchEvent(event);
    L27:
        if (event.getAction() != 4) goto L29;
        r1 = true;
        goto L29
    L14:
        if (event.getX() >= 0.0f) goto L16;
    L21:
        Function0<Unit> r4 = this.onDismissRequest;
        if (r4 == null) goto L24;
        r4.invoke();
    L24:
        return true;
    L16:
        if (event.getX() >= getWidth()) goto L21;
        if (event.getY() < 0.0f) goto L21;
        if (event.getY() < getHeight()) goto L25;
    L9:
        if (event.getAction() != 0) goto L11;
        r2 = true;
        goto L12
    L5:
        return super.onTouchEvent(event);
    }

    @Override // android.view.View
    public void setLayoutDirection(int layoutDirection) {
    }

    private final void superSetLayoutDirection(LayoutDirection layoutDirection) {
        switch(WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()]) {
            case 1: goto L7;
            case 2: goto L6;
            default: goto L5;
        };
    L6:
        int direction = 1;
    L8:
        super.setLayoutDirection(direction);
        return;
    L7:
        direction = 0;
        goto L8
    L5:
        throw new NoWhenBranchMatchedException();
    }

    private final WindowManager.LayoutParams createLayoutParams() {
        WindowManager.LayoutParams $this$createLayoutParams_u24lambda_u243 = new WindowManager.LayoutParams();
        $this$createLayoutParams_u24lambda_u243.gravity = 8388659;
        $this$createLayoutParams_u24lambda_u243.flags = AndroidPopup_androidKt.access$flagsWithSecureFlagInherited(this.properties, AndroidPopup_androidKt.isFlagSecureEnabled(this.composeView));
        $this$createLayoutParams_u24lambda_u243.type = PointerIconCompat.TYPE_HAND;
        $this$createLayoutParams_u24lambda_u243.token = this.composeView.getApplicationWindowToken();
        $this$createLayoutParams_u24lambda_u243.width = -2;
        $this$createLayoutParams_u24lambda_u243.height = -2;
        $this$createLayoutParams_u24lambda_u243.format = -3;
        $this$createLayoutParams_u24lambda_u243.setTitle(this.composeView.getContext().getResources().getString(androidx.compose.ui.R.string.default_popup_window_title));
        return $this$createLayoutParams_u24lambda_u243;
    }

    private final IntRect getVisibleDisplayBounds() {
        Rect it = this.previousWindowVisibleFrame;
        this.popupLayoutHelper.getWindowVisibleDisplayFrame(this.composeView, it);
        return AndroidPopup_androidKt.access$toIntBounds(it);
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
        onCommitAffectingPopupPosition = PopupLayout$Companion$onCommitAffectingPopupPosition$1.INSTANCE;
    }
}
