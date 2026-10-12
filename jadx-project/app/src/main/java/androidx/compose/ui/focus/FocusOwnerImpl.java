package androidx.compose.ui.focus;

import android.os.Trace;
import android.view.KeyEvent;
import androidx.autofill.HintConstants;
import androidx.collection.MutableLongSet;
import androidx.collection.MutableObjectList;
import androidx.collection.ObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.app.NotificationCompat;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: FocusOwnerImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001Bª\u0001\u0012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012:\u0010\u0006\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u0007\u0012!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0002\u0010\u0014J\u0010\u00108\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u000eH\u0016J\u001a\u00108\u001a\u00020\u000e2\b\b\u0002\u0010:\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\u000eH\u0002J2\u00108\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u001a\u0010?\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020AH\u0016ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ(\u0010D\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020A2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\bF\u0010GJ\u001e\u0010H\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020J2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004H\u0016J\n\u0010K\u001a\u0004\u0018\u00010\u0016H\u0002J:\u0010L\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010M\u001a\u0004\u0018\u00010\f2\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0\u0003H\u0016ø\u0001\u0000¢\u0006\u0004\bO\u0010PJ\n\u0010Q\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010R\u001a\u00020\u0005H\u0002J\u001a\u0010S\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\bT\u0010UJ\b\u0010V\u001a\u00020\u0005H\u0016J$\u0010W\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016ø\u0001\u0000¢\u0006\u0002\bXJ\u0010\u0010Y\u001a\u00020\u00052\u0006\u0010Z\u001a\u00020[H\u0016J\u0010\u0010Y\u001a\u00020\u00052\u0006\u0010Z\u001a\u00020\\H\u0016J\u0010\u0010Y\u001a\u00020\u00052\u0006\u0010Z\u001a\u00020\u0016H\u0016J\b\u0010]\u001a\u00020\u0005H\u0016J$\u0010^\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016ø\u0001\u0000¢\u0006\u0004\b_\u0010`J\u001a\u0010a\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020AH\u0002ø\u0001\u0000¢\u0006\u0004\bb\u0010CJ\u000e\u0010c\u001a\u0004\u0018\u00010d*\u00020eH\u0002J3\u0010f\u001a\u0004\u0018\u0001Hg\"\n\b\u0000\u0010g\u0018\u0001*\u00020h*\u00020e2\f\u0010i\u001a\b\u0012\u0004\u0012\u0002Hg0jH\u0082\bø\u0001\u0000¢\u0006\u0004\bk\u0010lJg\u0010m\u001a\u00020\u0005\"\n\b\u0000\u0010g\u0018\u0001*\u00020e*\u00020e2\f\u0010i\u001a\b\u0012\u0004\u0012\u0002Hg0j2\u0012\u0010n\u001a\u000e\u0012\u0004\u0012\u0002Hg\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010p\u001a\u000e\u0012\u0004\u0012\u0002Hg\u0012\u0004\u0012\u00020\u00050\u0003H\u0082\bø\u0001\u0000¢\u0006\u0004\bq\u0010rR(\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u001fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R$\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020.X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u000e0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000RB\u0010\u0006\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00101\u001a\u00020\u0016X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0019\"\u0004\b3\u0010\u001bR\u0014\u00104\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006s"}, d2 = {"Landroidx/compose/ui/focus/FocusOwnerImpl;", "Landroidx/compose/ui/focus/FocusOwner;", "onRequestApplyChangesListener", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "onRequestFocusForOwner", "Lkotlin/Function2;", "Landroidx/compose/ui/focus/FocusDirection;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "focusDirection", "Landroidx/compose/ui/geometry/Rect;", "previouslyFocusedRect", "", "onMoveFocusInterop", "onClearFocusForOwner", "onFocusRectInterop", "onLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "value", "Landroidx/compose/ui/focus/FocusTargetNode;", "activeFocusTargetNode", "getActiveFocusTargetNode", "()Landroidx/compose/ui/focus/FocusTargetNode;", "setActiveFocusTargetNode", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "focusInvalidationManager", "Landroidx/compose/ui/focus/FocusInvalidationManager;", "focusTransactionManager", "Landroidx/compose/ui/focus/FocusTransactionManager;", "getFocusTransactionManager", "()Landroidx/compose/ui/focus/FocusTransactionManager;", "isFocusCaptured", "()Z", "setFocusCaptured", "(Z)V", "keysCurrentlyDown", "Landroidx/collection/MutableLongSet;", "listeners", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/ui/focus/FocusListener;", "getListeners", "()Landroidx/collection/MutableObjectList;", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "rootFocusNode", "getRootFocusNode$ui_release", "setRootFocusNode$ui_release", "rootState", "Landroidx/compose/ui/focus/FocusState;", "getRootState", "()Landroidx/compose/ui/focus/FocusState;", "clearFocus", "force", "forced", "refreshFocusEvents", "clearOwnerFocus", "clearFocus-I7lrPNg", "(ZZZI)Z", "dispatchInterceptedSoftKeyboardEvent", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "dispatchInterceptedSoftKeyboardEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "dispatchKeyEvent", "onFocusedItem", "dispatchKeyEvent-YhN2O0w", "(Landroid/view/KeyEvent;Lkotlin/jvm/functions/Function0;)Z", "dispatchRotaryEvent", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "findFocusTargetNode", "focusSearch", "focusedRect", "onFound", "focusSearch-ULY8qGw", "(ILandroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "getFocusRect", "invalidateOwnerFocusState", "moveFocus", "moveFocus-3ESFkO8", "(I)Z", "releaseFocus", "requestFocusForOwner", "requestFocusForOwner-7o62pno", "scheduleInvalidation", "node", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "scheduleInvalidationForOwner", "takeFocus", "takeFocus-aToIllA", "(ILandroidx/compose/ui/geometry/Rect;)Z", "validateKeyEvent", "validateKeyEvent-ZmokQxo", "lastLocalKeyInputNode", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DelegatableNode;", "nearestAncestorIncludingSelf", "T", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/ui/node/NodeKind;", "nearestAncestorIncludingSelf-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Ljava/lang/Object;", "traverseAncestorsIncludingSelf", "onPreVisit", "onVisit", "onPostVisit", "traverseAncestorsIncludingSelf-QFhIj7k", "(Landroidx/compose/ui/node/DelegatableNode;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FocusOwnerImpl implements FocusOwner {
    public static final int $stable = 0;
    private FocusTargetNode activeFocusTargetNode;
    private final FocusInvalidationManager focusInvalidationManager;
    private final FocusTransactionManager focusTransactionManager;
    private boolean isFocusCaptured;
    private MutableLongSet keysCurrentlyDown;
    private final MutableObjectList<FocusListener> listeners;
    private final Modifier modifier;
    private final Function0<Unit> onClearFocusForOwner;
    private final Function0<Rect> onFocusRectInterop;
    private final Function0<LayoutDirection> onLayoutDirection;
    private final Function1<FocusDirection, Boolean> onMoveFocusInterop;
    private final Function2<FocusDirection, Rect, Boolean> onRequestFocusForOwner;
    private FocusTargetNode rootFocusNode;

    /* JADX INFO: compiled from: FocusOwnerImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[CustomDestinationResult.values().length];
            r0[CustomDestinationResult.Redirected.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L17:
            r0[CustomDestinationResult.Cancelled.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L19:
            r0[CustomDestinationResult.RedirectCancelled.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L23:
            r0[CustomDestinationResult.None.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
        L15:
            $EnumSwitchMapping$0 = r0;
        }
    }

    static {
        $stable = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FocusOwnerImpl(Function1<? super Function0<Unit>, Unit> r7, Function2<? super FocusDirection, ? super Rect, Boolean> r8, Function1<? super FocusDirection, Boolean> r9, Function0<Unit> r10, Function0<Rect> r11, Function0<? extends LayoutDirection> r12) {
        this.onRequestFocusForOwner = r8;
        this.onMoveFocusInterop = r9;
        this.onClearFocusForOwner = r10;
        this.onFocusRectInterop = r11;
        this.onLayoutDirection = r12;
        Function2 r2 = null;
        Function1 r3 = null;
        this.rootFocusNode = new FocusTargetNode(Focusability.Companion.m4062getNeverLCbbffg(), r2, r3, 6, null);
        this.focusInvalidationManager = new FocusInvalidationManager(r7, new FocusOwnerImpl$focusInvalidationManager$1(this), new FocusOwnerImpl$focusInvalidationManager$2(this), new FocusOwnerImpl$focusInvalidationManager$3(this));
        this.focusTransactionManager = new FocusTransactionManager();
        this.modifier = new FocusOwnerImpl$modifier$1(this);
        this.listeners = new MutableObjectList(1);
    }

    public static final /* synthetic */ void access$invalidateOwnerFocusState(FocusOwnerImpl $this) {
        $this.invalidateOwnerFocusState();
    }

    public final FocusTargetNode getRootFocusNode$ui_release() {
        return this.rootFocusNode;
    }

    public final void setRootFocusNode$ui_release(FocusTargetNode r1) {
        this.rootFocusNode = r1;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public FocusTransactionManager getFocusTransactionManager() {
        return this.focusTransactionManager;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: requestFocusForOwner-7o62pno */
    public boolean mo4028requestFocusForOwner7o62pno(FocusDirection focusDirection, Rect previouslyFocusedRect) {
        return this.onRequestFocusForOwner.invoke(focusDirection, previouslyFocusedRect).booleanValue();
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: takeFocus-aToIllA */
    public boolean mo4029takeFocusaToIllA(final int focusDirection, Rect previouslyFocusedRect) {
        Boolean r0 = mo4027focusSearchULY8qGw(focusDirection, previouslyFocusedRect, new FocusOwnerImpl$takeFocus$1(focusDirection));
        if (r0 != null) goto L7;
        return false;
    L7:
        return r0.booleanValue();
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void releaseFocus() {
        if (ComposeUiFlags.isTrackFocusEnabled == false) goto L5;
        FocusTransactionsKt.clearFocus(this.rootFocusNode, true, true);
        return;
    L5:
        FocusTransactionManager $this$iv = getFocusTransactionManager();
        if ($this$iv.getOngoingTransaction() == false) goto L16;
        FocusTransactionsKt.clearFocus(this.rootFocusNode, true, true);
        return;
    L16:
        FocusTransactionManager.access$beginTransaction($this$iv);     // Catch: Throwable -> L13
        FocusTransactionsKt.clearFocus(this.rootFocusNode, true, true);     // Catch: Throwable -> L13
        FocusTransactionManager.access$commitTransaction($this$iv);
        return;
    L13:
        th = move-exception;
        FocusTransactionManager.access$commitTransaction($this$iv);
        throw th;
    }

    @Override // androidx.compose.ui.focus.FocusManager
    public void clearFocus(boolean force) {
        mo4024clearFocusI7lrPNg(force, true, true, FocusDirection.Companion.m4015getExitdhqQ8s());
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: clearFocus-I7lrPNg */
    public boolean mo4024clearFocusI7lrPNg(boolean force, boolean refreshFocusEvents, boolean clearOwnerFocus, int focusDirection) {
        boolean clearedFocusSuccessfully = false;
        if (ComposeUiFlags.isTrackFocusEnabled == false) goto L12;
        if (force == true) goto L11;
        CustomDestinationResult r0 = FocusTransactionsKt.m4047performCustomClearFocusMxy_nc0(this.rootFocusNode, focusDirection);
        switch(WhenMappings.$EnumSwitchMapping$0[r0.ordinal()]) {
            case 1: goto L28;
            case 2: goto L28;
            case 3: goto L28;
            case 4: goto L9;
            default: goto L8;
        };
    L9:
        clearedFocusSuccessfully = clearFocus(force, refreshFocusEvents);
    L28:
        if (clearedFocusSuccessfully == false) goto L31;
        if (clearOwnerFocus == false) goto L31;
        this.onClearFocusForOwner.invoke();
    L31:
        return clearedFocusSuccessfully;
    L8:
        throw new NoWhenBranchMatchedException();
    L11:
        clearedFocusSuccessfully = clearFocus(force, refreshFocusEvents);
        goto L28
    L12:
        FocusTransactionManager this_$iv = getFocusTransactionManager();
        FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1 r2 = FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1.INSTANCE;
    L32:
        th = move-exception;
        FocusTransactionManager.access$commitTransaction(this_$iv);
        throw th;
    L14:
        if (this_$iv.getOngoingTransaction() == false) goto L16;
        FocusTransactionManager.access$cancelTransaction(this_$iv);     // Catch: Throwable -> L32
    L16:
        FocusTransactionManager.access$beginTransaction(this_$iv);     // Catch: Throwable -> L32
        if (r2 == null) goto L20;
        MutableVector this_$iv$iv = FocusTransactionManager.access$getCancellationListener$p(this_$iv);     // Catch: Throwable -> L32
        this_$iv$iv.add(r2);     // Catch: Throwable -> L32
    L20:
        if (force == true) goto L25;
        CustomDestinationResult r5 = FocusTransactionsKt.m4047performCustomClearFocusMxy_nc0(this.rootFocusNode, focusDirection);     // Catch: Throwable -> L32
        switch(WhenMappings.$EnumSwitchMapping$0[r5.ordinal()]) {
            case 1: goto L26;
            case 2: goto L26;
            case 3: goto L26;
            default: goto L25;
        };     // Catch: Throwable -> L32
    L26:
        FocusTransactionManager.access$commitTransaction(this_$iv);
    L25:
        clearedFocusSuccessfully = FocusTransactionsKt.clearFocus(this.rootFocusNode, force, refreshFocusEvents);     // Catch: Throwable -> L32
        goto L26
    }

    static /* synthetic */ boolean clearFocus$default(FocusOwnerImpl r0, boolean r1, boolean r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = false;
    L6:
        return r0.clearFocus(r1, r2);
    }

    private final boolean clearFocus(boolean forced, boolean refreshFocusEvents) {
        if (getActiveFocusTargetNode() != null) goto L5;
        return true;
    L5:
        Object r2 = null;
        if (isFocusCaptured() == false) goto L9;
        if (forced == true) goto L9;
        return false;
    L9:
        FocusTargetNode previousActiveFocusTargetNode = getActiveFocusTargetNode();
        setActiveFocusTargetNode(null);
        if (refreshFocusEvents == false) goto L81;
        if (previousActiveFocusTargetNode == null) goto L81;
        if (isFocusCaptured() == false) goto L15;
        FocusStateImpl r5 = FocusStateImpl.Captured;
    L16:
        previousActiveFocusTargetNode.dispatchFocusCallbacks$ui_release(r5, FocusStateImpl.Inactive);
        FocusTargetNode $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = previousActiveFocusTargetNode;
        int r6 = NodeKind.m5976constructorimpl(1024);
        boolean value$iv$iv$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L19;
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
    L19:
        Modifier.Node node$iv$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv.getNode().getParent$ui_release();
        LayoutNode layout$iv$iv = DelegatableNodeKt.requireLayoutNode($this$visitAncestors_u2dY_u2dYKmho_u24default$iv);
    L20:
        if (layout$iv$iv == null) goto L102;
        Modifier.Node head$iv$iv = layout$iv$iv.getNodes$ui_release().getHead$ui_release();
        if ((head$iv$iv.getAggregateChildKindSet$ui_release() & r6) == 0) goto L71;
    L23:
        if (node$iv$iv == null) goto L70;
        if ((node$iv$iv.getKindSet$ui_release() & r6) == 0) goto L68;
        Modifier.Node it$iv = node$iv$iv;
        MutableVector r19 = null;
        Modifier.Node this_$iv$iv$iv = it$iv;
    L27:
        if (this_$iv$iv$iv == null) goto L67;
        if ((this_$iv$iv$iv instanceof FocusTargetNode) == true) goto L30;
        FocusTargetNode previousActiveFocusTargetNode2 = previousActiveFocusTargetNode;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & r6) == 0) goto L34;
        boolean r0 = true;
    L35:
        if (r0 == false) goto L65;
        if ((this_$iv$iv$iv instanceof DelegatingNode) == false) goto L65;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) this_$iv$iv$iv;
        int $i$f$forEachImmediateDelegate$ui_release = 0;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L39:
        if (node$iv$iv$iv == null) goto L62;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & r6) == 0) goto L43;
        boolean r26 = true;
    L44:
        if (r26 == false) goto L60;
        count$iv$iv = count$iv$iv + 1;
        DelegatingNode this_$iv$iv$iv3 = this_$iv$iv$iv2;
        if (count$iv$iv != 1) goto L48;
        $i$f$forEachImmediateDelegate$ui_release = $i$f$forEachImmediateDelegate$ui_release;
        this_$iv$iv$iv = next$iv$iv;
    L61:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        this_$iv$iv$iv2 = this_$iv$iv$iv3;
        $i$f$forEachImmediateDelegate$ui_release = $i$f$forEachImmediateDelegate$ui_release;
        this_$iv$iv$iv = this_$iv$iv$iv;
        goto L39
    L48:
        if (r19 != null) goto L50;
        MutableVector r1 = new MutableVector(new Modifier.Node[16], 0);
    L51:
        Modifier.Node theNode$iv$iv = this_$iv$iv$iv;
        if (theNode$iv$iv == null) goto L56;
        if (r1 == null) goto L55;
        r1.add(theNode$iv$iv);
    L55:
        this_$iv$iv$iv = null;
    L56:
        if (r1 == null) goto L59;
        r1.add(next$iv$iv);
    L59:
        r19 = r1;
        count$iv$iv = count$iv$iv;
        goto L61
    L50:
        r1 = r19;
        goto L51
    L60:
        this_$iv$iv$iv3 = this_$iv$iv$iv2;
        $i$f$forEachImmediateDelegate$ui_release = $i$f$forEachImmediateDelegate$ui_release;
        this_$iv$iv$iv = this_$iv$iv$iv;
        goto L61
    L43:
        r26 = false;
        goto L44
    L62:
        Modifier.Node r31 = this_$iv$iv$iv;
        Object node$iv$iv2 = null;
        if (count$iv$iv != 1) goto L66;
        r2 = null;
        previousActiveFocusTargetNode = previousActiveFocusTargetNode2;
        this_$iv$iv$iv = r31;
    L66:
        r2 = node$iv$iv2;
        this_$iv$iv$iv = DelegatableNodeKt.access$pop(r19);
        previousActiveFocusTargetNode = previousActiveFocusTargetNode2;
    L65:
        node$iv$iv2 = null;
        goto L66
    L34:
        r0 = false;
        goto L35
    L30:
        FocusTargetNode it = (FocusTargetNode) this_$iv$iv$iv;
        previousActiveFocusTargetNode2 = previousActiveFocusTargetNode;
        it.dispatchFocusCallbacks$ui_release(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
        node$iv$iv2 = null;
        goto L66
    L67:
        FocusTargetNode previousActiveFocusTargetNode3 = previousActiveFocusTargetNode;
    L69:
        node$iv$iv = node$iv$iv.getParent$ui_release();
        r2 = r2;
        previousActiveFocusTargetNode = previousActiveFocusTargetNode3;
        goto L23
    L68:
        previousActiveFocusTargetNode3 = previousActiveFocusTargetNode;
        goto L69
    L70:
        FocusTargetNode previousActiveFocusTargetNode4 = previousActiveFocusTargetNode;
        Object r3 = r2;
    L72:
        layout$iv$iv = layout$iv$iv.getParent$ui_release();
        if (layout$iv$iv == null) goto L77;
        NodeChain r4 = layout$iv$iv.getNodes$ui_release();
        if (r4 == null) goto L77;
        Modifier.Node r7 = r4.getTail$ui_release();
    L78:
        node$iv$iv = r7;
        r2 = r3;
        previousActiveFocusTargetNode = previousActiveFocusTargetNode4;
    L77:
        r7 = null;
        goto L78
    L71:
        previousActiveFocusTargetNode4 = previousActiveFocusTargetNode;
        r3 = r2;
        goto L72
    L102:
        return true;
    L15:
        r5 = FocusStateImpl.Active;
    L81:
        return true;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Boolean] */
    @Override // androidx.compose.ui.focus.FocusManager
    /* JADX INFO: renamed from: moveFocus-3ESFkO8 */
    public boolean mo4022moveFocus3ESFkO8(final int focusDirection) {
        if (ComposeUiFlags.isViewFocusFixEnabled == true) goto L5;
    L7:
        final Ref.ObjectRef requestFocusSuccess = new Ref.ObjectRef();
        requestFocusSuccess.element = false;
        int generationBefore = getFocusTransactionManager().getGeneration();
        FocusTargetNode activeNodeBefore = getActiveFocusTargetNode();
        Boolean focusSearchSuccess = mo4027focusSearchULY8qGw(focusDirection, this.onFocusRectInterop.invoke(), new FocusOwnerImpl$moveFocus$focusSearchSuccess$1(requestFocusSuccess, focusDirection));
        int generationAfter = getFocusTransactionManager().getGeneration();
        if (Intrinsics.areEqual(focusSearchSuccess, true) == false) goto L15;
        if (generationBefore == generationAfter) goto L11;
    L14:
        return true;
    L11:
        if (ComposeUiFlags.isTrackFocusEnabled == false) goto L15;
        if (activeNodeBefore != getActiveFocusTargetNode()) goto L14;
    L15:
        if (focusSearchSuccess != null) goto L17;
    L40:
        return false;
    L17:
        if (requestFocusSuccess.element == 0) goto L40;
        if (Intrinsics.areEqual(focusSearchSuccess, true) == false) goto L25;
        if (Intrinsics.areEqual(requestFocusSuccess.element, true) == false) goto L25;
        return true;
    L25:
        if (FocusOwnerImplKt.m4033is1dFocusSearch3ESFkO8(focusDirection) == false) goto L33;
        boolean clearFocus = mo4024clearFocusI7lrPNg(false, true, false, focusDirection);
        if (clearFocus == false) goto L32;
        if (mo4029takeFocusaToIllA(focusDirection, null) == false) goto L32;
        return true;
    L32:
        return false;
    L33:
        boolean clearFocus2 = ComposeUiFlags.isViewFocusFixEnabled;
        if (clearFocus2 == true) goto L39;
        if (this.onMoveFocusInterop.invoke(FocusDirection.m4006boximpl(focusDirection)).booleanValue() == false) goto L39;
        return true;
    L39:
        return false;
    L5:
        if (this.onMoveFocusInterop.invoke(FocusDirection.m4006boximpl(focusDirection)).booleanValue() == false) goto L7;
        return true;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: focusSearch-ULY8qGw */
    public Boolean mo4027focusSearchULY8qGw(int focusDirection, Rect focusedRect, final Function1<? super FocusTargetNode, Boolean> r9) {
        final FocusTargetNode source = findFocusTargetNode();
        if (source == null) goto L18;
        FocusRequester customDest = FocusTraversalKt.m4051customFocusSearchOMvw8(source, focusDirection, this.onLayoutDirection.invoke());
        if (Intrinsics.areEqual(customDest, FocusRequester.Companion.getCancel()) == false) goto L8;
        return null;
    L8:
        if (Intrinsics.areEqual(customDest, FocusRequester.Companion.getRedirect$ui_release()) == false) goto L14;
        FocusTargetNode r0 = findFocusTargetNode();
        if (r0 != null) goto L12;
        return null;
    L12:
        return r9.invoke(r0);
    L14:
        if (Intrinsics.areEqual(customDest, FocusRequester.Companion.getDefault()) == true) goto L20;
        return Boolean.valueOf(customDest.findFocusTargetNode$ui_release(r9));
    L20:
        return FocusTraversalKt.m4052focusSearch0X8WOeE(this.rootFocusNode, focusDirection, this.onLayoutDirection.invoke(), focusedRect, new FocusOwnerImpl$focusSearch$1(source, this, r9));
    L18:
        source = null;
        goto L20
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v132 */
    /* JADX WARN: Type inference failed for: r0v133 */
    /* JADX WARN: Type inference failed for: r0v134 */
    /* JADX WARN: Type inference failed for: r0v62, types: [T, androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v65, types: [T, androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v72, types: [T, androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v88, types: [T, androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r0v94 */
    /* JADX WARN: Type inference failed for: r0v98, types: [T] */
    /* JADX WARN: Type inference failed for: r13v3, types: [T, androidx.compose.ui.Modifier$Node, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v11, types: [T, androidx.compose.ui.Modifier$Node, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12, types: [T] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v20 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v25 */
    /* JADX WARN: Type inference failed for: r16v26 */
    /* JADX WARN: Type inference failed for: r16v27 */
    /* JADX WARN: Type inference failed for: r16v29 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: dispatchKeyEvent-YhN2O0w */
    public boolean mo4026dispatchKeyEventYhN2O0w(KeyEvent r44, Function0<Boolean> r45) {
        String r3 = "FocusOwnerImpl:dispatchKeyEvent";
        int r4 = 0;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        int r0 = 0;
    L379:
        th = th;
    L381:
        Trace.endSection();
        throw th;
    L4:
        int r6 = 0;
        if (this.focusInvalidationManager.hasPendingInvalidation() == false) goto L12;
        System.out.println("FocusRelatedWarning: Dispatching key event while focus system is invalidated.");     // Catch: Throwable -> L9
    L7:
        Trace.endSection();
        return false;
    L12:
        if (m4032validateKeyEventZmokQxo(r44) == false) goto L7;
        FocusTargetNode r5 = findFocusTargetNode();     // Catch: Throwable -> L379
        int r8 = 8192;
        int r10 = 1;
        if (r5 == null) goto L21;
        Modifier.Node r11 = lastLocalKeyInputNode(r5);     // Catch: Throwable -> L9
        if (r11 == null) goto L21;
        int r29 = 8192;
    L178:
        if (r11 == null) goto L375;
        Modifier.Node r1 = r11;     // Catch: Throwable -> L377
        int r7 = NodeKind.m5976constructorimpl(r29);     // Catch: Throwable -> L377
        FocusOwnerImpl r2 = this;
        List r12 = null;
        if (r1.getNode().isAttached() == false) goto L183;
    L185:
        Modifier.Node r9 = r1.getNode().getParent$ui_release();     // Catch: Throwable -> L377
        LayoutNode r18 = DelegatableNodeKt.requireLayoutNode(r1);     // Catch: Throwable -> L377
    L186:
        if (r18 == null) goto L249;
        if ((r18.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & r7) == 0) goto L241;
    L189:
        if (r9 == null) goto L240;
        if ((r9.getKindSet$ui_release() & r7) == 0) goto L238;
        MutableVector r24 = null;
        Modifier.Node r13 = r9;
    L193:
        if (r13 == null) goto L237;
        r2 = r2;
        if ((r13 instanceof KeyInputModifierNode) == true) goto L196;
        if ((r13.getKindSet$ui_release() & r7) == 0) goto L203;
        boolean r14 = true;
    L204:
        if (r14 == false) goto L235;
        if ((r13 instanceof DelegatingNode) == false) goto L235;
        int r15 = 0;
        Modifier.Node r210 = ((DelegatingNode) r13).getDelegate$ui_release();     // Catch: Throwable -> L105
    L208:
        if (r210 == null) goto L231;
        Modifier.Node r30 = r210;
        if ((r30.getKindSet$ui_release() & r7) == 0) goto L212;
        boolean r32 = true;
    L213:
        if (r32 == false) goto L229;
        r15 = r15 + 1;     // Catch: Throwable -> L105
        Modifier.Node r33 = r13;
        if (r15 != 1) goto L217;
        r13 = r30;
        r7 = r7;
    L230:
        r210 = r210.getChild$ui_release();     // Catch: Throwable -> L105
        r7 = r7;
        goto L208
    L217:
        if (r24 != null) goto L219;
        MutableVector r16 = new MutableVector(new Modifier.Node[16], 0);     // Catch: Throwable -> L105
    L221:
        if (r33 == null) goto L225;
        if (r16 == null) goto L224;
        Boolean.valueOf(r16.add(r33));     // Catch: Throwable -> L105
    L224:
        r33 = null;
    L225:
        if (r16 == null) goto L228;
        Boolean.valueOf(r16.add(r30));     // Catch: Throwable -> L105
    L228:
        r24 = r16;
        r13 = r33;
        r15 = r15;
        goto L230
    L219:
        r16 = r24;
        goto L221
    L229:
        r7 = r7;
        goto L230
    L212:
        r32 = false;
        goto L213
    L231:
        Modifier.Node r34 = r13;
        int r37 = r7;
        if (r15 != 1) goto L236;
        r13 = r34;
        r7 = r37;
    L236:
        r13 = DelegatableNodeKt.access$pop(r24);     // Catch: Throwable -> L105
        r7 = r37;
    L235:
        r37 = r7;
        goto L236
    L203:
        r14 = false;
        goto L204
    L196:
        Modifier.Node r17 = r13;
        if (r12 != null) goto L199;
        r12 = new ArrayList();     // Catch: Throwable -> L105
    L199:
        r12.add(r17);     // Catch: Throwable -> L105
        r37 = r7;
        goto L236
    L237:
        FocusOwnerImpl r26 = r2;
        int r38 = r7;
    L239:
        r9 = r9.getParent$ui_release();     // Catch: Throwable -> L105
        r1 = r1;
        r2 = r26;
        r7 = r38;
        goto L189
    L238:
        r26 = r2;
        r38 = r7;
        goto L239
    L240:
        Modifier.Node r25 = r1;
        FocusOwnerImpl r27 = r2;
        int r39 = r7;
    L242:
        r18 = r18.getParent$ui_release();     // Catch: Throwable -> L105
        if (r18 == null) goto L247;
        NodeChain r19 = r18.getNodes$ui_release();     // Catch: Throwable -> L105
        if (r19 == null) goto L247;
        Modifier.Node r20 = r19.getTail$ui_release();     // Catch: Throwable -> L105
    L248:
        r9 = r20;
        r1 = r25;
        r2 = r27;
        r7 = r39;
    L247:
        r20 = null;
        goto L248
    L241:
        r25 = r1;
        r27 = r2;
        r39 = r7;
        goto L242
    L249:
        Modifier.Node r28 = r1;
        int r310 = r7;
        if (r12 == null) goto L261;
        List r21 = r12;
        int r22 = r21.size() - 1;     // Catch: Throwable -> L105
        if (r22 < 0) goto L260;
    L253:
        int r23 = r22;
        r22 = r22 - 1;     // Catch: Throwable -> L105
        if (((KeyInputModifierNode) r21.get(r23)).mo205onPreKeyEventZmokQxo(r44) == true) goto L255;
        if (r22 >= 0) goto L253;
    L255:
        Trace.endSection();
        return true;
    L260:
        Unit r31 = Unit.INSTANCE;     // Catch: Throwable -> L105
    L261:
        ?? r35 = r28.getNode();     // Catch: Throwable -> L377
        int r36 = 0;
        Ref.ObjectRef r40 = new Ref.ObjectRef();     // Catch: Throwable -> L377
        Ref.ObjectRef r41 = new Ref.ObjectRef();     // Catch: Throwable -> L377
        r41.element = r35;     // Catch: Throwable -> L377
    L262:
        if (r41.element == null) goto L312;
        if ((r41.element instanceof KeyInputModifierNode) == true) goto L266;
        if ((((Modifier.Node) r41.element).getKindSet$ui_release() & r310) == 0) goto L273;
        boolean r42 = true;
    L274:
        if (r42 == false) goto L309;
        if ((r41.element instanceof DelegatingNode) == false) goto L309;
        int r43 = 0;
        Modifier.Node r110 = ((DelegatingNode) r41.element).getDelegate$ui_release();     // Catch: Throwable -> L377
        ?? r46 = r35;
    L278:
        if (r110 == null) goto L306;
        ?? r111 = r110;
        if ((r111.getKindSet$ui_release() & r310) == 0) goto L283;
        boolean r112 = true;
    L284:
        if (r112 == false) goto L304;
        r43 = r43 + 1;
        ?? r113 = r46;
        if (r43 != 1) goto L289;
        r41.element = r111;     // Catch: Throwable -> L105
        r36 = r36;
        r4 = r4;
    L305:
        r110 = r110.getChild$ui_release();     // Catch: Throwable -> L372
        r46 = r113;
        r36 = r36;
        r4 = r4;
        goto L278
    L289:
        MutableVector r47 = (MutableVector) r40.element;     // Catch: Throwable -> L377
        if (r47 == null) goto L293;
        ?? r48 = r47;
    L295:
        r40.element = r48;     // Catch: Throwable -> L372
        Modifier.Node r49 = (Modifier.Node) r41.element;     // Catch: Throwable -> L372
        if (r49 == null) goto L301;
        MutableVector r50 = (MutableVector) r40.element;     // Catch: Throwable -> L372
        if (r50 == null) goto L300;
        Boolean.valueOf(r50.add(r49));     // Catch: Throwable -> L372
    L300:
        r41.element = null;     // Catch: Throwable -> L372
    L301:
        MutableVector r51 = (MutableVector) r40.element;     // Catch: Throwable -> L372
        if (r51 == null) goto L305;
        Boolean.valueOf(r51.add(r111));     // Catch: Throwable -> L372
        goto L305
    L293:
        r48 = new MutableVector(new Modifier.Node[16], 0);     // Catch: Throwable -> L372
        goto L295
    L304:
        r113 = r46;
        r36 = r36;
        r4 = r4;
        goto L305
    L283:
        r112 = false;
        goto L284
    L306:
        ?? r114 = r46;
        int r115 = r36;
        int r211 = r4;
        ?? r116 = r114;
        if (r43 == 1) goto L308;
    L386:
        r41.element = DelegatableNodeKt.access$pop((MutableVector) r40.element);     // Catch: Throwable -> L372
        r35 = r116;
        r36 = r115;
        r4 = r211;
    L372:
        th = th;
        goto L381
    L308:
        r35 = r114;
        r36 = r115;
        r4 = r211;
    L309:
        r116 = r35;
        r115 = r36;
        r211 = r4;
        goto L386
    L273:
        r42 = false;
        goto L274
    L266:
        if (((KeyInputModifierNode) r41.element).mo205onPreKeyEventZmokQxo(r44) == true) goto L255;
        r116 = r35;
        r115 = r36;
        r211 = r4;
    L105:
        th = th;
        goto L381
    L312:
        if (r45.invoke().booleanValue() == true) goto L255;
        ?? r52 = r28.getNode();     // Catch: Throwable -> L372
        int r53 = 0;
        Ref.ObjectRef r54 = new Ref.ObjectRef();     // Catch: Throwable -> L372
        Ref.ObjectRef r55 = new Ref.ObjectRef();     // Catch: Throwable -> L372
        r55.element = r52;     // Catch: Throwable -> L372
    L316:
        if (r55.element == null) goto L362;
        if ((r55.element instanceof KeyInputModifierNode) == true) goto L320;
        if ((((Modifier.Node) r55.element).getKindSet$ui_release() & r310) == 0) goto L326;
        boolean r56 = true;
    L327:
        if (r56 == false) goto L359;
        if ((r55.element instanceof DelegatingNode) == false) goto L359;
        int r57 = 0;
        Modifier.Node r117 = ((DelegatingNode) r55.element).getDelegate$ui_release();     // Catch: Throwable -> L372
        ?? r58 = r52;
    L331:
        if (r117 == null) goto L356;
        ?? r118 = r117;
        if ((r118.getKindSet$ui_release() & r310) == 0) goto L335;
        boolean r119 = true;
    L336:
        if (r119 == false) goto L354;
        r57 = r57 + 1;     // Catch: Throwable -> L372
        if (r57 != 1) goto L340;
        r55.element = r118;     // Catch: Throwable -> L372
        r58 = r58;
        r53 = r53;
        r5 = r5;
    L355:
        r117 = r117.getChild$ui_release();     // Catch: Throwable -> L372
        r58 = r58;
        r53 = r53;
        r5 = r5;
        goto L331
    L340:
        MutableVector r120 = (MutableVector) r54.element;     // Catch: Throwable -> L372
        if (r120 != null) goto L343;
        ?? r121 = new MutableVector(new Modifier.Node[16], 0);     // Catch: Throwable -> L372
    L344:
        r54.element = r121;     // Catch: Throwable -> L372
        Modifier.Node r59 = (Modifier.Node) r55.element;     // Catch: Throwable -> L372
        if (r59 == null) goto L351;
        MutableVector r60 = (MutableVector) r54.element;     // Catch: Throwable -> L372
        if (r60 == null) goto L349;
        Boolean.valueOf(r60.add(r59));     // Catch: Throwable -> L372
    L349:
        r55.element = null;     // Catch: Throwable -> L372
    L351:
        MutableVector r61 = (MutableVector) r54.element;     // Catch: Throwable -> L372
        if (r61 == null) goto L355;
        Boolean.valueOf(r61.add(r118));     // Catch: Throwable -> L372
        goto L355
    L343:
        r121 = r120;
        goto L344
    L354:
        r58 = r58;
        r53 = r53;
        r5 = r5;
        goto L355
    L335:
        r119 = false;
        goto L336
    L356:
        ?? r122 = r58;
        int r123 = r53;
        FocusTargetNode r124 = r5;
        if (r57 != 1) goto L360;
        r52 = r122;
        r53 = r123;
        r5 = r124;
    L360:
        r55.element = DelegatableNodeKt.access$pop((MutableVector) r54.element);     // Catch: Throwable -> L372
        r52 = r122;
        r53 = r123;
        r5 = r124;
    L359:
        r122 = r52;
        r123 = r53;
        r124 = r5;
        goto L360
    L326:
        r56 = false;
        goto L327
    L320:
        if (((KeyInputModifierNode) r55.element).mo203onKeyEventZmokQxo(r44) == true) goto L255;
        r122 = r52;
        r123 = r53;
        r124 = r5;
        goto L360
    L362:
        if (r12 == null) goto L370;
        List r62 = r12;
        int r63 = 0;
        int r64 = r62.size();     // Catch: Throwable -> L372
    L364:
        if (r63 >= r64) goto L369;
        if (((KeyInputModifierNode) r62.get(r63)).mo203onKeyEventZmokQxo(r44) == true) goto L255;
        r63 = r63 + 1;     // Catch: Throwable -> L372
        goto L364
    L369:
        Unit r65 = Unit.INSTANCE;     // Catch: Throwable -> L372
    L370:
        Unit r66 = Unit.INSTANCE;     // Catch: Throwable -> L372
    L377:
        th = th;
        goto L381
    L183:
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");     // Catch: Throwable -> L105
    L375:
        Trace.endSection();
        return false;
    L21:
        if (r5 != null) goto L384;
        r29 = 8192;
    L392:
        FocusTargetNode r67 = this.rootFocusNode;     // Catch: Throwable -> L377
        int r68 = NodeKind.m5976constructorimpl(r29);     // Catch: Throwable -> L377
        int r69 = 0;
        if (r67.getNode().isAttached() == false) goto L103;
    L108:
        Modifier.Node r125 = r67.getNode().getParent$ui_release();     // Catch: Throwable -> L377
        LayoutNode r126 = DelegatableNodeKt.requireLayoutNode(r67);     // Catch: Throwable -> L377
    L109:
        if (r126 == null) goto L171;
        if ((r126.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & r68) == 0) goto L162;
    L112:
        if (r125 == null) goto L161;
        if ((r125.getKindSet$ui_release() & r68) == 0) goto L159;
        MutableVector r212 = null;
        Modifier.Node r70 = r125;
    L116:
        if (r70 == null) goto L158;
        if ((r70 instanceof KeyInputModifierNode) == true) goto L119;
        if ((r70.getKindSet$ui_release() & r68) == 0) goto L123;
        boolean r71 = true;
    L124:
        if (r71 == false) goto L156;
        if ((r70 instanceof DelegatingNode) == false) goto L156;
        int r72 = 0;
        Modifier.Node r213 = ((DelegatingNode) r70).getDelegate$ui_release();     // Catch: Throwable -> L105
    L128:
        if (r213 == null) goto L152;
        Modifier.Node r214 = r213;
        if ((r214.getKindSet$ui_release() & r68) == 0) goto L132;
        boolean r215 = true;
    L133:
        if (r215 == false) goto L150;
        r72 = r72 + 1;     // Catch: Throwable -> L105
        Modifier.Node r216 = r70;
        if (r72 != 1) goto L137;
        r69 = r69;
        Modifier.Node r73 = r214;
    L151:
        r213 = r213.getChild$ui_release();     // Catch: Throwable -> L105
        r70 = r73;
        r69 = r69;
        goto L128
    L137:
        if (r212 != null) goto L139;
        MutableVector r74 = new MutableVector(new Modifier.Node[16], 0);     // Catch: Throwable -> L105
    L141:
        if (r216 == null) goto L145;
        if (r74 == null) goto L144;
        Boolean.valueOf(r74.add(r216));     // Catch: Throwable -> L105
    L144:
        r73 = null;
    L146:
        if (r74 == null) goto L149;
        Boolean.valueOf(r74.add(r214));     // Catch: Throwable -> L105
    L149:
        r212 = r74;
        r72 = r72;
        goto L151
    L145:
        r73 = r216;
        goto L146
    L139:
        r74 = r212;
        goto L141
    L150:
        r69 = r69;
        r73 = r70;
        goto L151
    L132:
        r215 = false;
        goto L133
    L152:
        Modifier.Node r217 = r70;
        int r311 = r69;
        if (r72 == 1) goto L154;
    L157:
        r70 = DelegatableNodeKt.access$pop(r212);     // Catch: Throwable -> L105
        r69 = r311;
        goto L116
    L154:
        r70 = r217;
        r69 = r311;
    L156:
        r311 = r69;
        goto L157
    L123:
        r71 = false;
        goto L124
    L119:
        Object r75 = r70;
    L172:
        KeyInputModifierNode r76 = (KeyInputModifierNode) r75;     // Catch: Throwable -> L377
        if (r76 == null) goto L176;
        r11 = r76.getNode();     // Catch: Throwable -> L105
        goto L178
    L176:
        r11 = null;
        goto L178
    L158:
        int r312 = r69;
    L160:
        r125 = r125.getParent$ui_release();     // Catch: Throwable -> L105
        r67 = r67;
        r69 = r312;
        goto L112
    L159:
        r312 = r69;
        goto L160
    L161:
        FocusTargetNode r218 = r67;
        int r313 = r69;
    L163:
        r126 = r126.getParent$ui_release();     // Catch: Throwable -> L105
        if (r126 == null) goto L169;
        NodeChain r77 = r126.getNodes$ui_release();     // Catch: Throwable -> L105
        if (r77 == null) goto L169;
        Modifier.Node r78 = r77.getTail$ui_release();     // Catch: Throwable -> L105
    L170:
        r125 = r78;
        r67 = r218;
        r69 = r313;
    L169:
        r78 = null;
        goto L170
    L162:
        r218 = r67;
        r313 = r69;
        goto L163
    L171:
        r75 = null;
        goto L172
    L103:
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");     // Catch: Throwable -> L105
        goto L108
    L384:
        FocusTargetNode r127 = r5;     // Catch: Throwable -> L95
        int r128 = NodeKind.m5976constructorimpl(8192);     // Catch: Throwable -> L95
        if (r127.getNode().isAttached() == false) goto L26;
    L28:
        Modifier.Node r219 = r127.getNode();     // Catch: Throwable -> L95
        LayoutNode r220 = DelegatableNodeKt.requireLayoutNode(r127);     // Catch: Throwable -> L95
    L29:
        if (r220 == null) goto L90;
        if ((r220.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & r128) == 0) goto L82;
    L32:
        if (r219 == null) goto L81;
        if ((r219.getKindSet$ui_release() & r128) == 0) goto L79;
        MutableVector r221 = null;
        r29 = r8;
        Modifier.Node r79 = r219;
    L36:
        if (r79 == null) goto L78;
        if ((r79 instanceof KeyInputModifierNode) == true) goto L39;
        if ((r79.getKindSet$ui_release() & r128) == 0) goto L43;
        int r80 = r10;
    L44:
        if (r80 == 0) goto L76;
        if ((r79 instanceof DelegatingNode) == false) goto L76;
        int r81 = 0;
        Modifier.Node r314 = ((DelegatingNode) r79).getDelegate$ui_release();     // Catch: Throwable -> L95
    L48:
        if (r314 == null) goto L73;
        Modifier.Node r315 = r314;
        if ((r315.getKindSet$ui_release() & r128) == 0) goto L52;
        int r316 = r10;
    L53:
        if (r316 == 0) goto L71;
        r81 = r81 + 1;     // Catch: Throwable -> L95
        if (r81 != r10) goto L57;
        r79 = r315;
        r0 = r0;
        r3 = r3;
    L390:
        r314 = r314.getChild$ui_release();     // Catch: Throwable -> L105
        r0 = r0;
        r3 = r3;
        r6 = 0;
        r10 = 1;
        goto L48
    L57:
        if (r221 != null) goto L61;
        MutableVector r82 = new MutableVector(new Modifier.Node[16], 0);     // Catch: Throwable -> L105
    L62:
        Modifier.Node r83 = r79;
        if (r83 == null) goto L67;
        if (r82 == null) goto L66;
        Boolean.valueOf(r82.add(r83));     // Catch: Throwable -> L105
    L66:
        r79 = null;
    L67:
        if (r82 == null) goto L70;
        Boolean.valueOf(r82.add(r315));     // Catch: Throwable -> L105
    L70:
        r221 = r82;
        goto L390
    L61:
        r82 = r221;
        goto L62
    L71:
        r0 = r0;
        r3 = r3;
        goto L390
    L52:
        r316 = r6;
        goto L53
    L73:
        int r317 = r0;
        String r410 = r3;
        if (r81 == 1) goto L75;
    L77:
        r79 = DelegatableNodeKt.access$pop(r221);     // Catch: Throwable -> L105
        r0 = r317;
        r3 = r410;
        r6 = 0;
        r10 = 1;
        goto L36
    L75:
        r0 = r317;
        r3 = r410;
        r6 = 0;
        r10 = 1;
    L76:
        r317 = r0;
        r410 = r3;
        goto L77
    L43:
        r80 = r6;
        goto L44
    L39:
        Object r84 = r79;
    L91:
        KeyInputModifierNode r85 = (KeyInputModifierNode) r84;     // Catch: Throwable -> L105
        if (r85 == null) goto L392;
        r11 = r85.getNode();     // Catch: Throwable -> L105
        goto L178
    L78:
        int r318 = r0;
        String r411 = r3;
    L80:
        r219 = r219.getParent$ui_release();     // Catch: Throwable -> L105
        r8 = r29;
        r0 = r318;
        r3 = r411;
        r6 = 0;
        r10 = 1;
        goto L32
    L79:
        r318 = r0;
        r411 = r3;
        r29 = r8;
        goto L80
    L81:
        int r319 = r0;
        String r412 = r3;
        int r222 = r8;
    L83:
        r220 = r220.getParent$ui_release();     // Catch: Throwable -> L105
        if (r220 == null) goto L88;
        NodeChain r86 = r220.getNodes$ui_release();     // Catch: Throwable -> L105
        if (r86 == null) goto L88;
        Modifier.Node r87 = r86.getTail$ui_release();     // Catch: Throwable -> L105
    L89:
        r219 = r87;
        r8 = r222;
        r0 = r319;
        r3 = r412;
        r6 = 0;
        r10 = 1;
    L88:
        r87 = null;
        goto L89
    L82:
        r319 = r0;
        r412 = r3;
        r222 = r8;
        goto L83
    L90:
        r29 = r8;
        r84 = null;
        goto L91
    L26:
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");     // Catch: Throwable -> L9
    L95:
        th = th;
    L9:
        th = th;
        goto L381
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: dispatchInterceptedSoftKeyboardEvent-ZmokQxo */
    public boolean mo4025dispatchInterceptedSoftKeyboardEventZmokQxo(KeyEvent keyEvent) {
        if (this.focusInvalidationManager.hasPendingInvalidation() == false) goto L6;
        System.out.println("FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
        return false;
    L6:
        DelegatableNode r2 = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        int r5 = 131072;
        int r7 = 1;
        if (r2 == null) goto L73;
        DelegatableNode $this$nearestAncestorIncludingSelf_u2d64DMado$iv = r2;
        int r8 = NodeKind.m5976constructorimpl(131072);
        boolean value$iv$iv$iv$iv = $this$nearestAncestorIncludingSelf_u2d64DMado$iv.getNode().isAttached();
        if (value$iv$iv$iv$iv == true) goto L11;
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
    L11:
        Modifier.Node node$iv$iv$iv = $this$nearestAncestorIncludingSelf_u2d64DMado$iv.getNode();
        LayoutNode layout$iv$iv$iv = DelegatableNodeKt.requireLayoutNode($this$nearestAncestorIncludingSelf_u2d64DMado$iv);
    L12:
        if (layout$iv$iv$iv == null) goto L71;
        Modifier.Node head$iv$iv$iv = layout$iv$iv$iv.getNodes$ui_release().getHead$ui_release();
        if ((head$iv$iv$iv.getAggregateChildKindSet$ui_release() & r8) == 0) goto L63;
    L15:
        if (node$iv$iv$iv == null) goto L62;
        if ((node$iv$iv$iv.getKindSet$ui_release() & r8) == 0) goto L60;
        Modifier.Node it$iv$iv = node$iv$iv$iv;
        MutableVector r24 = null;
        int r25 = r5;
        Modifier.Node r6 = it$iv$iv;
    L19:
        if (r6 == null) goto L59;
        if ((r6 instanceof SoftKeyboardInterceptionModifierNode) == true) goto L22;
        Modifier.Node this_$iv$iv$iv$iv = r6;
        if ((this_$iv$iv$iv$iv.getKindSet$ui_release() & r8) == 0) goto L26;
        int r9 = r7;
    L27:
        if (r9 == 0) goto L57;
        if ((r6 instanceof DelegatingNode) == false) goto L57;
        int count$iv$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv$iv2 = (DelegatingNode) r6;
        Modifier.Node node$iv$iv$iv$iv = this_$iv$iv$iv$iv2.getDelegate$ui_release();
    L31:
        if (node$iv$iv$iv$iv == null) goto L54;
        Modifier.Node next$iv$iv$iv = node$iv$iv$iv$iv;
        if ((next$iv$iv$iv.getKindSet$ui_release() & r8) == 0) goto L35;
        int r31 = r7;
    L36:
        if (r31 == 0) goto L52;
        count$iv$iv$iv = count$iv$iv$iv + 1;
        if (count$iv$iv$iv != r7) goto L40;
        r6 = next$iv$iv$iv;
        $this$nearestAncestorIncludingSelf_u2d64DMado$iv = $this$nearestAncestorIncludingSelf_u2d64DMado$iv;
    L53:
        node$iv$iv$iv$iv = node$iv$iv$iv$iv.getChild$ui_release();
        $this$nearestAncestorIncludingSelf_u2d64DMado$iv = $this$nearestAncestorIncludingSelf_u2d64DMado$iv;
        r7 = 1;
        goto L31
    L40:
        if (r24 != null) goto L42;
        MutableVector r0 = new MutableVector(new Modifier.Node[16], 0);
    L43:
        Modifier.Node theNode$iv$iv$iv = r6;
        if (theNode$iv$iv$iv == null) goto L48;
        if (r0 == null) goto L47;
        r0.add(theNode$iv$iv$iv);
    L47:
        r6 = null;
    L48:
        if (r0 == null) goto L51;
        r0.add(next$iv$iv$iv);
    L51:
        r24 = r0;
        goto L53
    L42:
        r0 = r24;
        goto L43
    L52:
        $this$nearestAncestorIncludingSelf_u2d64DMado$iv = $this$nearestAncestorIncludingSelf_u2d64DMado$iv;
        goto L53
    L35:
        r31 = 0;
        goto L36
    L54:
        DelegatableNode $this$nearestAncestorIncludingSelf_u2d64DMado$iv2 = $this$nearestAncestorIncludingSelf_u2d64DMado$iv;
        if (count$iv$iv$iv == 1) goto L56;
    L58:
        r6 = DelegatableNodeKt.access$pop(r24);
        $this$nearestAncestorIncludingSelf_u2d64DMado$iv = $this$nearestAncestorIncludingSelf_u2d64DMado$iv2;
        r7 = 1;
        goto L19
    L56:
        $this$nearestAncestorIncludingSelf_u2d64DMado$iv = $this$nearestAncestorIncludingSelf_u2d64DMado$iv2;
        r7 = 1;
    L57:
        $this$nearestAncestorIncludingSelf_u2d64DMado$iv2 = $this$nearestAncestorIncludingSelf_u2d64DMado$iv;
        goto L58
    L26:
        r9 = 0;
        goto L27
    L22:
        DelegatableNode r10 = r6;
    L72:
        SoftKeyboardInterceptionModifierNode focusedSoftKeyboardInterceptionNode = (SoftKeyboardInterceptionModifierNode) r10;
    L75:
        if (focusedSoftKeyboardInterceptionNode == null) goto L254;
        SoftKeyboardInterceptionModifierNode $this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv = focusedSoftKeyboardInterceptionNode;
        int type$iv = NodeKind.m5976constructorimpl(r25);
        List ancestors$iv = null;
        boolean value$iv$iv$iv$iv$iv = $this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv.getNode().isAttached();
        if (value$iv$iv$iv$iv$iv == true) goto L79;
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
    L79:
        Modifier.Node node$iv$iv$iv$iv2 = $this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv.getNode().getParent$ui_release();
        LayoutNode layout$iv$iv$iv$iv = DelegatableNodeKt.requireLayoutNode($this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv);
    L80:
        if (layout$iv$iv$iv$iv == null) goto L144;
        Modifier.Node head$iv$iv$iv$iv = layout$iv$iv$iv$iv.getNodes$ui_release().getHead$ui_release();
        if ((head$iv$iv$iv$iv.getAggregateChildKindSet$ui_release() & type$iv) == 0) goto L136;
    L83:
        if (node$iv$iv$iv$iv2 == null) goto L135;
        if ((node$iv$iv$iv$iv2.getKindSet$ui_release() & type$iv) == 0) goto L134;
        Modifier.Node it$iv$iv$iv = node$iv$iv$iv$iv2;
        MutableVector r23 = null;
        Modifier.Node r3 = it$iv$iv$iv;
    L87:
        if (r3 == null) goto L134;
        $this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv = $this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv;
        if ((r3 instanceof SoftKeyboardInterceptionModifierNode) == true) goto L90;
        Modifier.Node this_$iv$iv$iv$iv$iv = r3;
        if ((this_$iv$iv$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L97;
        boolean r1 = true;
    L98:
        if (r1 == false) goto L130;
        if ((r3 instanceof DelegatingNode) == false) goto L130;
        int count$iv$iv$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv$iv$iv2 = (DelegatingNode) r3;
        Modifier.Node node$iv$iv$iv$iv$iv = this_$iv$iv$iv$iv$iv2.getDelegate$ui_release();
    L102:
        if (node$iv$iv$iv$iv$iv == null) goto L126;
        Modifier.Node next$iv$iv$iv$iv = node$iv$iv$iv$iv$iv;
        if ((next$iv$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L106;
        boolean r32 = true;
    L107:
        if (r32 == false) goto L124;
        count$iv$iv$iv$iv = count$iv$iv$iv$iv + 1;
        int type$iv2 = type$iv;
        if (count$iv$iv$iv$iv != 1) goto L111;
        Modifier.Node r36 = next$iv$iv$iv$iv;
    L125:
        node$iv$iv$iv$iv$iv = node$iv$iv$iv$iv$iv.getChild$ui_release();
        type$iv = type$iv2;
        r3 = r36;
        goto L102
    L111:
        if (r23 != null) goto L113;
        MutableVector r4 = new MutableVector(new Modifier.Node[16], 0);
    L114:
        Modifier.Node theNode$iv$iv$iv$iv = r3;
        if (theNode$iv$iv$iv$iv == null) goto L119;
        if (r4 == null) goto L118;
        r4.add(theNode$iv$iv$iv$iv);
    L118:
        Modifier.Node r11 = null;
    L120:
        if (r4 == null) goto L123;
        r4.add(next$iv$iv$iv$iv);
    L123:
        r36 = r11;
        count$iv$iv$iv$iv = count$iv$iv$iv$iv;
        r23 = r4;
        goto L125
    L119:
        r11 = r3;
        goto L120
    L113:
        r4 = r23;
        goto L114
    L124:
        type$iv2 = type$iv;
        r36 = r3;
        goto L125
    L106:
        r32 = false;
        goto L107
    L126:
        int type$iv3 = type$iv;
        Modifier.Node r37 = r3;
        if (count$iv$iv$iv$iv != 1) goto L131;
        type$iv = type$iv3;
        r3 = r37;
    L131:
        r3 = DelegatableNodeKt.access$pop(r23);
        type$iv = type$iv3;
    L130:
        type$iv3 = type$iv;
        goto L131
    L97:
        r1 = false;
        goto L98
    L90:
        Modifier.Node r12 = r3;
        if (ancestors$iv != null) goto L93;
        Object result$iv$iv = new ArrayList();
        ancestors$iv = (List) result$iv$iv;
    L93:
        ancestors$iv.add(r12);
        type$iv3 = type$iv;
    L134:
        node$iv$iv$iv$iv2 = node$iv$iv$iv$iv2.getParent$ui_release();
        $this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv = $this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv;
        type$iv = type$iv;
        goto L83
    L135:
        DelegatableNode $this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv2 = $this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv;
        int type$iv4 = type$iv;
    L137:
        layout$iv$iv$iv$iv = layout$iv$iv$iv$iv.getParent$ui_release();
        if (layout$iv$iv$iv$iv == null) goto L142;
        NodeChain r13 = layout$iv$iv$iv$iv.getNodes$ui_release();
        if (r13 == null) goto L142;
        Modifier.Node r14 = r13.getTail$ui_release();
    L143:
        node$iv$iv$iv$iv2 = r14;
        $this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv = $this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv2;
        type$iv = type$iv4;
    L142:
        r14 = null;
        goto L143
    L136:
        $this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv2 = $this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv;
        type$iv4 = type$iv;
        goto L137
    L144:
        DelegatableNode $this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv3 = $this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv;
        int type$iv5 = type$iv;
        if (ancestors$iv == null) goto L155;
        List $this$fastForEachReversed$iv$iv = ancestors$iv;
        int r15 = $this$fastForEachReversed$iv$iv.size() - 1;
        if (r15 < 0) goto L155;
    L148:
        int index$iv$iv = r15;
        r15 = r15 - 1;
        Object item$iv$iv = $this$fastForEachReversed$iv$iv.get(index$iv$iv);
        SoftKeyboardInterceptionModifierNode it = (SoftKeyboardInterceptionModifierNode) item$iv$iv;
        if (it.mo5133onPreInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent) == true) goto L150;
        if (r15 >= 0) goto L148;
    L150:
        return true;
    L155:
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv$iv = $this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv3.getNode();
        int r16 = 0;
        MutableVector r17 = null;
        Modifier.Node r18 = $this$dispatchForKind_u2d6rFNWt0$iv$iv;
    L156:
        if (r18 == null) goto L199;
        if ((r18 instanceof SoftKeyboardInterceptionModifierNode) == true) goto L159;
        Modifier.Node this_$iv$iv$iv = r18;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & type$iv5) == 0) goto L167;
        boolean r19 = true;
    L168:
        if (r19 == false) goto L197;
        if ((r18 instanceof DelegatingNode) == false) goto L197;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) r18;
        Modifier.Node node$iv$iv$iv2 = this_$iv$iv$iv2.getDelegate$ui_release();
    L172:
        if (node$iv$iv$iv2 == null) goto L193;
        Modifier.Node next$iv$iv = node$iv$iv$iv2;
        if ((next$iv$iv.getKindSet$ui_release() & type$iv5) == 0) goto L176;
        boolean r110 = true;
    L177:
        if (r110 == false) goto L191;
        count$iv$iv = count$iv$iv + 1;
        if (count$iv$iv != 1) goto L181;
        r18 = next$iv$iv;
        $this$dispatchForKind_u2d6rFNWt0$iv$iv = $this$dispatchForKind_u2d6rFNWt0$iv$iv;
        r16 = r16;
    L192:
        node$iv$iv$iv2 = node$iv$iv$iv2.getChild$ui_release();
        $this$dispatchForKind_u2d6rFNWt0$iv$iv = $this$dispatchForKind_u2d6rFNWt0$iv$iv;
        r16 = r16;
        goto L172
    L181:
        if (r17 != null) goto L183;
        MutableVector r20 = new MutableVector(new Modifier.Node[16], 0);
    L184:
        r17 = r20;
        Modifier.Node theNode$iv$iv = r18;
        if (theNode$iv$iv == null) goto L189;
        if (r17 == null) goto L188;
        r17.add(theNode$iv$iv);
    L188:
        r18 = null;
    L189:
        if (r17 == null) goto L192;
        r17.add(next$iv$iv);
        goto L192
    L183:
        r20 = r17;
        goto L184
    L191:
        $this$dispatchForKind_u2d6rFNWt0$iv$iv = $this$dispatchForKind_u2d6rFNWt0$iv$iv;
        r16 = r16;
        goto L192
    L176:
        r110 = false;
        goto L177
    L193:
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv$iv;
        int r111 = r16;
        MutableVector r112 = r17;
        if (count$iv$iv != 1) goto L196;
        $this$dispatchForKind_u2d6rFNWt0$iv$iv = $this$dispatchForKind_u2d6rFNWt0$iv$iv2;
        r16 = r111;
        r17 = r112;
        goto L156
    L196:
        r17 = r112;
    L198:
        r18 = DelegatableNodeKt.access$pop(r17);
        $this$dispatchForKind_u2d6rFNWt0$iv$iv = $this$dispatchForKind_u2d6rFNWt0$iv$iv2;
        r16 = r111;
    L197:
        $this$dispatchForKind_u2d6rFNWt0$iv$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv$iv;
        r111 = r16;
        goto L198
    L167:
        r19 = false;
        goto L168
    L159:
        SoftKeyboardInterceptionModifierNode it2 = (SoftKeyboardInterceptionModifierNode) r18;
        if (it2.mo5133onPreInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent) == true) goto L161;
        $this$dispatchForKind_u2d6rFNWt0$iv$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv$iv;
        r111 = r16;
        goto L198
    L161:
        return true;
    L199:
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv$iv3 = $this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv3.getNode();
        int r21 = 0;
        MutableVector r22 = null;
        Modifier.Node r26 = $this$dispatchForKind_u2d6rFNWt0$iv$iv3;
    L200:
        if (r26 == null) goto L244;
        if ((r26 instanceof SoftKeyboardInterceptionModifierNode) == true) goto L203;
        Modifier.Node this_$iv$iv$iv3 = r26;
        if ((this_$iv$iv$iv3.getKindSet$ui_release() & type$iv5) == 0) goto L211;
        boolean r27 = true;
    L212:
        if (r27 == false) goto L241;
        if ((r26 instanceof DelegatingNode) == false) goto L241;
        int count$iv$iv2 = 0;
        DelegatingNode this_$iv$iv$iv4 = (DelegatingNode) r26;
        Modifier.Node node$iv$iv$iv3 = this_$iv$iv$iv4.getDelegate$ui_release();
    L216:
        if (node$iv$iv$iv3 == null) goto L237;
        Modifier.Node next$iv$iv2 = node$iv$iv$iv3;
        if ((next$iv$iv2.getKindSet$ui_release() & type$iv5) == 0) goto L220;
        boolean r113 = true;
    L221:
        if (r113 == false) goto L235;
        count$iv$iv2 = count$iv$iv2 + 1;
        if (count$iv$iv2 != 1) goto L225;
        r26 = next$iv$iv2;
        $this$dispatchForKind_u2d6rFNWt0$iv$iv3 = $this$dispatchForKind_u2d6rFNWt0$iv$iv3;
        r21 = r21;
    L236:
        node$iv$iv$iv3 = node$iv$iv$iv3.getChild$ui_release();
        $this$dispatchForKind_u2d6rFNWt0$iv$iv3 = $this$dispatchForKind_u2d6rFNWt0$iv$iv3;
        r21 = r21;
        goto L216
    L225:
        if (r22 != null) goto L227;
        MutableVector r28 = new MutableVector(new Modifier.Node[16], 0);
    L228:
        r22 = r28;
        Modifier.Node theNode$iv$iv2 = r26;
        if (theNode$iv$iv2 == null) goto L233;
        if (r22 == null) goto L232;
        r22.add(theNode$iv$iv2);
    L232:
        r26 = null;
    L233:
        if (r22 == null) goto L236;
        r22.add(next$iv$iv2);
        goto L236
    L227:
        r28 = r22;
        goto L228
    L235:
        $this$dispatchForKind_u2d6rFNWt0$iv$iv3 = $this$dispatchForKind_u2d6rFNWt0$iv$iv3;
        r21 = r21;
        goto L236
    L220:
        r113 = false;
        goto L221
    L237:
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv$iv4 = $this$dispatchForKind_u2d6rFNWt0$iv$iv3;
        int r114 = r21;
        MutableVector r115 = r22;
        if (count$iv$iv2 != 1) goto L240;
        $this$dispatchForKind_u2d6rFNWt0$iv$iv3 = $this$dispatchForKind_u2d6rFNWt0$iv$iv4;
        r21 = r114;
        r22 = r115;
        goto L200
    L240:
        r22 = r115;
    L242:
        r26 = DelegatableNodeKt.access$pop(r22);
        $this$dispatchForKind_u2d6rFNWt0$iv$iv3 = $this$dispatchForKind_u2d6rFNWt0$iv$iv4;
        r21 = r114;
    L241:
        $this$dispatchForKind_u2d6rFNWt0$iv$iv4 = $this$dispatchForKind_u2d6rFNWt0$iv$iv3;
        r114 = r21;
        goto L242
    L211:
        r27 = false;
        goto L212
    L203:
        SoftKeyboardInterceptionModifierNode it3 = (SoftKeyboardInterceptionModifierNode) r26;
        if (it3.mo5132onInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent) == true) goto L205;
        $this$dispatchForKind_u2d6rFNWt0$iv$iv4 = $this$dispatchForKind_u2d6rFNWt0$iv$iv3;
        r114 = r21;
        goto L242
    L205:
        return true;
    L244:
        if (ancestors$iv == null) goto L328;
        List $this$fastForEach$iv$iv = ancestors$iv;
        int index$iv$iv2 = 0;
        int r29 = $this$fastForEach$iv$iv.size();
    L246:
        if (index$iv$iv2 >= r29) goto L329;
        Object item$iv$iv2 = $this$fastForEach$iv$iv.get(index$iv$iv2);
        SoftKeyboardInterceptionModifierNode it4 = (SoftKeyboardInterceptionModifierNode) item$iv$iv2;
        if (it4.mo5132onInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent) == true) goto L249;
        index$iv$iv2 = index$iv$iv2 + 1;
        goto L246
    L249:
        return true;
    L329:
        return false;
    L328:
        return false;
    L254:
        return false;
    L59:
        DelegatableNode $this$nearestAncestorIncludingSelf_u2d64DMado$iv3 = $this$nearestAncestorIncludingSelf_u2d64DMado$iv;
    L61:
        node$iv$iv$iv = node$iv$iv$iv.getParent$ui_release();
        r7 = 1;
        r5 = r25;
        $this$nearestAncestorIncludingSelf_u2d64DMado$iv = $this$nearestAncestorIncludingSelf_u2d64DMado$iv3;
        goto L15
    L60:
        $this$nearestAncestorIncludingSelf_u2d64DMado$iv3 = $this$nearestAncestorIncludingSelf_u2d64DMado$iv;
        r25 = r5;
        goto L61
    L62:
        DelegatableNode $this$nearestAncestorIncludingSelf_u2d64DMado$iv4 = $this$nearestAncestorIncludingSelf_u2d64DMado$iv;
        int r210 = r5;
    L64:
        layout$iv$iv$iv = layout$iv$iv$iv.getParent$ui_release();
        if (layout$iv$iv$iv == null) goto L69;
        NodeChain r30 = layout$iv$iv$iv.getNodes$ui_release();
        if (r30 == null) goto L69;
        Modifier.Node r33 = r30.getTail$ui_release();
    L70:
        node$iv$iv$iv = r33;
        r7 = 1;
        r5 = r210;
        $this$nearestAncestorIncludingSelf_u2d64DMado$iv = $this$nearestAncestorIncludingSelf_u2d64DMado$iv4;
    L69:
        r33 = null;
        goto L70
    L63:
        $this$nearestAncestorIncludingSelf_u2d64DMado$iv4 = $this$nearestAncestorIncludingSelf_u2d64DMado$iv;
        r210 = r5;
        goto L64
    L71:
        r25 = r5;
        r10 = null;
        goto L72
    L73:
        r25 = 131072;
        focusedSoftKeyboardInterceptionNode = null;
        goto L75
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean dispatchRotaryEvent(RotaryScrollEvent event, Function0<Boolean> r41) {
        if (this.focusInvalidationManager.hasPendingInvalidation() == false) goto L6;
        System.out.println("FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
        return false;
    L6:
        DelegatableNode r2 = findFocusTargetNode();
        int r5 = 16384;
        int r7 = 1;
        if (r2 == null) goto L73;
        DelegatableNode $this$nearestAncestorIncludingSelf_u2d64DMado$iv = r2;
        int r8 = NodeKind.m5976constructorimpl(16384);
        boolean value$iv$iv$iv$iv = $this$nearestAncestorIncludingSelf_u2d64DMado$iv.getNode().isAttached();
        if (value$iv$iv$iv$iv == true) goto L11;
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
    L11:
        Modifier.Node node$iv$iv$iv = $this$nearestAncestorIncludingSelf_u2d64DMado$iv.getNode();
        LayoutNode layout$iv$iv$iv = DelegatableNodeKt.requireLayoutNode($this$nearestAncestorIncludingSelf_u2d64DMado$iv);
    L12:
        if (layout$iv$iv$iv == null) goto L71;
        Modifier.Node head$iv$iv$iv = layout$iv$iv$iv.getNodes$ui_release().getHead$ui_release();
        if ((head$iv$iv$iv.getAggregateChildKindSet$ui_release() & r8) == 0) goto L63;
    L15:
        if (node$iv$iv$iv == null) goto L62;
        if ((node$iv$iv$iv.getKindSet$ui_release() & r8) == 0) goto L60;
        Modifier.Node it$iv$iv = node$iv$iv$iv;
        MutableVector r24 = null;
        int r25 = r5;
        Modifier.Node r6 = it$iv$iv;
    L19:
        if (r6 == null) goto L59;
        if ((r6 instanceof RotaryInputModifierNode) == true) goto L22;
        Modifier.Node this_$iv$iv$iv$iv = r6;
        if ((this_$iv$iv$iv$iv.getKindSet$ui_release() & r8) == 0) goto L26;
        int r9 = r7;
    L27:
        if (r9 == 0) goto L57;
        if ((r6 instanceof DelegatingNode) == false) goto L57;
        int count$iv$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv$iv2 = (DelegatingNode) r6;
        Modifier.Node node$iv$iv$iv$iv = this_$iv$iv$iv$iv2.getDelegate$ui_release();
    L31:
        if (node$iv$iv$iv$iv == null) goto L54;
        Modifier.Node next$iv$iv$iv = node$iv$iv$iv$iv;
        if ((next$iv$iv$iv.getKindSet$ui_release() & r8) == 0) goto L35;
        int r31 = r7;
    L36:
        if (r31 == 0) goto L52;
        count$iv$iv$iv = count$iv$iv$iv + 1;
        if (count$iv$iv$iv != r7) goto L40;
        r6 = next$iv$iv$iv;
        $this$nearestAncestorIncludingSelf_u2d64DMado$iv = $this$nearestAncestorIncludingSelf_u2d64DMado$iv;
    L53:
        node$iv$iv$iv$iv = node$iv$iv$iv$iv.getChild$ui_release();
        $this$nearestAncestorIncludingSelf_u2d64DMado$iv = $this$nearestAncestorIncludingSelf_u2d64DMado$iv;
        r7 = 1;
        goto L31
    L40:
        if (r24 != null) goto L42;
        MutableVector r1 = new MutableVector(new Modifier.Node[16], 0);
    L43:
        Modifier.Node theNode$iv$iv$iv = r6;
        if (theNode$iv$iv$iv == null) goto L48;
        if (r1 == null) goto L47;
        r1.add(theNode$iv$iv$iv);
    L47:
        r6 = null;
    L48:
        if (r1 == null) goto L51;
        r1.add(next$iv$iv$iv);
    L51:
        r24 = r1;
        goto L53
    L42:
        r1 = r24;
        goto L43
    L52:
        $this$nearestAncestorIncludingSelf_u2d64DMado$iv = $this$nearestAncestorIncludingSelf_u2d64DMado$iv;
        goto L53
    L35:
        r31 = 0;
        goto L36
    L54:
        DelegatableNode $this$nearestAncestorIncludingSelf_u2d64DMado$iv2 = $this$nearestAncestorIncludingSelf_u2d64DMado$iv;
        if (count$iv$iv$iv == 1) goto L56;
    L58:
        r6 = DelegatableNodeKt.access$pop(r24);
        $this$nearestAncestorIncludingSelf_u2d64DMado$iv = $this$nearestAncestorIncludingSelf_u2d64DMado$iv2;
        r7 = 1;
        goto L19
    L56:
        $this$nearestAncestorIncludingSelf_u2d64DMado$iv = $this$nearestAncestorIncludingSelf_u2d64DMado$iv2;
        r7 = 1;
    L57:
        $this$nearestAncestorIncludingSelf_u2d64DMado$iv2 = $this$nearestAncestorIncludingSelf_u2d64DMado$iv;
        goto L58
    L26:
        r9 = 0;
        goto L27
    L22:
        DelegatableNode r10 = r6;
    L72:
        RotaryInputModifierNode focusedRotaryInputNode = (RotaryInputModifierNode) r10;
    L75:
        if (focusedRotaryInputNode == null) goto L258;
        RotaryInputModifierNode $this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv = focusedRotaryInputNode;
        int type$iv = NodeKind.m5976constructorimpl(r25);
        List ancestors$iv = null;
        boolean value$iv$iv$iv$iv$iv = $this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv.getNode().isAttached();
        if (value$iv$iv$iv$iv$iv == true) goto L79;
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
    L79:
        Modifier.Node node$iv$iv$iv$iv2 = $this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv.getNode().getParent$ui_release();
        LayoutNode layout$iv$iv$iv$iv = DelegatableNodeKt.requireLayoutNode($this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv);
    L80:
        if (layout$iv$iv$iv$iv == null) goto L144;
        Modifier.Node head$iv$iv$iv$iv = layout$iv$iv$iv$iv.getNodes$ui_release().getHead$ui_release();
        if ((head$iv$iv$iv$iv.getAggregateChildKindSet$ui_release() & type$iv) == 0) goto L136;
    L83:
        if (node$iv$iv$iv$iv2 == null) goto L135;
        if ((node$iv$iv$iv$iv2.getKindSet$ui_release() & type$iv) == 0) goto L134;
        Modifier.Node it$iv$iv$iv = node$iv$iv$iv$iv2;
        MutableVector r23 = null;
        Modifier.Node r3 = it$iv$iv$iv;
    L87:
        if (r3 == null) goto L134;
        $this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv = $this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv;
        if ((r3 instanceof RotaryInputModifierNode) == true) goto L90;
        Modifier.Node this_$iv$iv$iv$iv$iv = r3;
        if ((this_$iv$iv$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L97;
        boolean r4 = true;
    L98:
        if (r4 == false) goto L130;
        if ((r3 instanceof DelegatingNode) == false) goto L130;
        int count$iv$iv$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv$iv$iv2 = (DelegatingNode) r3;
        Modifier.Node node$iv$iv$iv$iv$iv = this_$iv$iv$iv$iv$iv2.getDelegate$ui_release();
    L102:
        if (node$iv$iv$iv$iv$iv == null) goto L126;
        Modifier.Node next$iv$iv$iv$iv = node$iv$iv$iv$iv$iv;
        if ((next$iv$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L106;
        boolean r32 = true;
    L107:
        if (r32 == false) goto L124;
        count$iv$iv$iv$iv = count$iv$iv$iv$iv + 1;
        int type$iv2 = type$iv;
        if (count$iv$iv$iv$iv != 1) goto L111;
        Modifier.Node r36 = next$iv$iv$iv$iv;
    L125:
        node$iv$iv$iv$iv$iv = node$iv$iv$iv$iv$iv.getChild$ui_release();
        type$iv = type$iv2;
        r3 = r36;
        goto L102
    L111:
        if (r23 != null) goto L113;
        MutableVector r11 = new MutableVector(new Modifier.Node[16], 0);
    L114:
        Modifier.Node theNode$iv$iv$iv$iv = r3;
        if (theNode$iv$iv$iv$iv == null) goto L119;
        if (r11 == null) goto L118;
        r11.add(theNode$iv$iv$iv$iv);
    L118:
        Modifier.Node r12 = null;
    L120:
        if (r11 == null) goto L123;
        r11.add(next$iv$iv$iv$iv);
    L123:
        r36 = r12;
        count$iv$iv$iv$iv = count$iv$iv$iv$iv;
        r23 = r11;
        goto L125
    L119:
        r12 = r3;
        goto L120
    L113:
        r11 = r23;
        goto L114
    L124:
        type$iv2 = type$iv;
        r36 = r3;
        goto L125
    L106:
        r32 = false;
        goto L107
    L126:
        int type$iv3 = type$iv;
        Modifier.Node r37 = r3;
        if (count$iv$iv$iv$iv != 1) goto L131;
        type$iv = type$iv3;
        r3 = r37;
    L131:
        r3 = DelegatableNodeKt.access$pop(r23);
        type$iv = type$iv3;
    L130:
        type$iv3 = type$iv;
        goto L131
    L97:
        r4 = false;
        goto L98
    L90:
        Modifier.Node r13 = r3;
        if (ancestors$iv != null) goto L93;
        Object result$iv$iv = new ArrayList();
        ancestors$iv = (List) result$iv$iv;
    L93:
        ancestors$iv.add(r13);
        type$iv3 = type$iv;
    L134:
        node$iv$iv$iv$iv2 = node$iv$iv$iv$iv2.getParent$ui_release();
        $this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv = $this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv;
        type$iv = type$iv;
        goto L83
    L135:
        DelegatableNode $this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv2 = $this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv;
        int type$iv4 = type$iv;
    L137:
        layout$iv$iv$iv$iv = layout$iv$iv$iv$iv.getParent$ui_release();
        if (layout$iv$iv$iv$iv == null) goto L142;
        NodeChain r14 = layout$iv$iv$iv$iv.getNodes$ui_release();
        if (r14 == null) goto L142;
        Modifier.Node r15 = r14.getTail$ui_release();
    L143:
        node$iv$iv$iv$iv2 = r15;
        $this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv = $this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv2;
        type$iv = type$iv4;
    L142:
        r15 = null;
        goto L143
    L136:
        $this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv2 = $this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv;
        type$iv4 = type$iv;
        goto L137
    L144:
        DelegatableNode $this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv3 = $this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv;
        int type$iv5 = type$iv;
        if (ancestors$iv == null) goto L155;
        List $this$fastForEachReversed$iv$iv = ancestors$iv;
        int r16 = $this$fastForEachReversed$iv$iv.size() - 1;
        if (r16 < 0) goto L155;
    L148:
        int index$iv$iv = r16;
        r16 = r16 - 1;
        Object item$iv$iv = $this$fastForEachReversed$iv$iv.get(index$iv$iv);
        RotaryInputModifierNode it = (RotaryInputModifierNode) item$iv$iv;
        if (it.onPreRotaryScrollEvent(event) == true) goto L150;
        if (r16 >= 0) goto L148;
    L150:
        return true;
    L155:
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv$iv = $this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv3.getNode();
        int r17 = 0;
        MutableVector r18 = null;
        Modifier.Node r19 = $this$dispatchForKind_u2d6rFNWt0$iv$iv;
    L156:
        if (r19 == null) goto L200;
        if ((r19 instanceof RotaryInputModifierNode) == true) goto L159;
        Modifier.Node this_$iv$iv$iv = r19;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & type$iv5) == 0) goto L167;
        boolean r20 = true;
    L168:
        if (r20 == false) goto L197;
        if ((r19 instanceof DelegatingNode) == false) goto L197;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) r19;
        Modifier.Node node$iv$iv$iv2 = this_$iv$iv$iv2.getDelegate$ui_release();
    L172:
        if (node$iv$iv$iv2 == null) goto L193;
        Modifier.Node next$iv$iv = node$iv$iv$iv2;
        if ((next$iv$iv.getKindSet$ui_release() & type$iv5) == 0) goto L176;
        boolean r110 = true;
    L177:
        if (r110 == false) goto L191;
        count$iv$iv = count$iv$iv + 1;
        if (count$iv$iv != 1) goto L181;
        r19 = next$iv$iv;
        $this$dispatchForKind_u2d6rFNWt0$iv$iv = $this$dispatchForKind_u2d6rFNWt0$iv$iv;
        r17 = r17;
    L192:
        node$iv$iv$iv2 = node$iv$iv$iv2.getChild$ui_release();
        $this$dispatchForKind_u2d6rFNWt0$iv$iv = $this$dispatchForKind_u2d6rFNWt0$iv$iv;
        r17 = r17;
        goto L172
    L181:
        if (r18 != null) goto L183;
        MutableVector r21 = new MutableVector(new Modifier.Node[16], 0);
    L184:
        r18 = r21;
        Modifier.Node theNode$iv$iv = r19;
        if (theNode$iv$iv == null) goto L189;
        if (r18 == null) goto L188;
        r18.add(theNode$iv$iv);
    L188:
        r19 = null;
    L189:
        if (r18 == null) goto L192;
        r18.add(next$iv$iv);
        goto L192
    L183:
        r21 = r18;
        goto L184
    L191:
        $this$dispatchForKind_u2d6rFNWt0$iv$iv = $this$dispatchForKind_u2d6rFNWt0$iv$iv;
        r17 = r17;
        goto L192
    L176:
        r110 = false;
        goto L177
    L193:
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv$iv;
        int r111 = r17;
        MutableVector r112 = r18;
        if (count$iv$iv != 1) goto L196;
        $this$dispatchForKind_u2d6rFNWt0$iv$iv = $this$dispatchForKind_u2d6rFNWt0$iv$iv2;
        r17 = r111;
        r18 = r112;
        goto L156
    L196:
        r18 = r112;
    L198:
        r19 = DelegatableNodeKt.access$pop(r18);
        $this$dispatchForKind_u2d6rFNWt0$iv$iv = $this$dispatchForKind_u2d6rFNWt0$iv$iv2;
        r17 = r111;
    L197:
        $this$dispatchForKind_u2d6rFNWt0$iv$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv$iv;
        r111 = r17;
        goto L198
    L167:
        r20 = false;
        goto L168
    L159:
        RotaryInputModifierNode it2 = (RotaryInputModifierNode) r19;
        if (it2.onPreRotaryScrollEvent(event) == true) goto L161;
        $this$dispatchForKind_u2d6rFNWt0$iv$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv$iv;
        r111 = r17;
        goto L198
    L161:
        return true;
    L200:
        if (r41.invoke().booleanValue() == false) goto L203;
        return true;
    L203:
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv$iv3 = $this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv3.getNode();
        int r22 = 0;
        MutableVector r26 = null;
        Modifier.Node r27 = $this$dispatchForKind_u2d6rFNWt0$iv$iv3;
    L204:
        if (r27 == null) goto L248;
        if ((r27 instanceof RotaryInputModifierNode) == true) goto L207;
        Modifier.Node this_$iv$iv$iv3 = r27;
        if ((this_$iv$iv$iv3.getKindSet$ui_release() & type$iv5) == 0) goto L215;
        boolean r28 = true;
    L216:
        if (r28 == false) goto L245;
        if ((r27 instanceof DelegatingNode) == false) goto L245;
        int count$iv$iv2 = 0;
        DelegatingNode this_$iv$iv$iv4 = (DelegatingNode) r27;
        Modifier.Node node$iv$iv$iv3 = this_$iv$iv$iv4.getDelegate$ui_release();
    L220:
        if (node$iv$iv$iv3 == null) goto L241;
        Modifier.Node next$iv$iv2 = node$iv$iv$iv3;
        if ((next$iv$iv2.getKindSet$ui_release() & type$iv5) == 0) goto L224;
        boolean r113 = true;
    L225:
        if (r113 == false) goto L239;
        count$iv$iv2 = count$iv$iv2 + 1;
        if (count$iv$iv2 != 1) goto L229;
        r27 = next$iv$iv2;
        $this$dispatchForKind_u2d6rFNWt0$iv$iv3 = $this$dispatchForKind_u2d6rFNWt0$iv$iv3;
        r22 = r22;
    L240:
        node$iv$iv$iv3 = node$iv$iv$iv3.getChild$ui_release();
        $this$dispatchForKind_u2d6rFNWt0$iv$iv3 = $this$dispatchForKind_u2d6rFNWt0$iv$iv3;
        r22 = r22;
        goto L220
    L229:
        if (r26 != null) goto L231;
        MutableVector r29 = new MutableVector(new Modifier.Node[16], 0);
    L232:
        r26 = r29;
        Modifier.Node theNode$iv$iv2 = r27;
        if (theNode$iv$iv2 == null) goto L237;
        if (r26 == null) goto L236;
        r26.add(theNode$iv$iv2);
    L236:
        r27 = null;
    L237:
        if (r26 == null) goto L240;
        r26.add(next$iv$iv2);
        goto L240
    L231:
        r29 = r26;
        goto L232
    L239:
        $this$dispatchForKind_u2d6rFNWt0$iv$iv3 = $this$dispatchForKind_u2d6rFNWt0$iv$iv3;
        r22 = r22;
        goto L240
    L224:
        r113 = false;
        goto L225
    L241:
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv$iv4 = $this$dispatchForKind_u2d6rFNWt0$iv$iv3;
        int r114 = r22;
        MutableVector r115 = r26;
        if (count$iv$iv2 != 1) goto L244;
        $this$dispatchForKind_u2d6rFNWt0$iv$iv3 = $this$dispatchForKind_u2d6rFNWt0$iv$iv4;
        r22 = r114;
        r26 = r115;
        goto L204
    L244:
        r26 = r115;
    L246:
        r27 = DelegatableNodeKt.access$pop(r26);
        $this$dispatchForKind_u2d6rFNWt0$iv$iv3 = $this$dispatchForKind_u2d6rFNWt0$iv$iv4;
        r22 = r114;
    L245:
        $this$dispatchForKind_u2d6rFNWt0$iv$iv4 = $this$dispatchForKind_u2d6rFNWt0$iv$iv3;
        r114 = r22;
        goto L246
    L215:
        r28 = false;
        goto L216
    L207:
        RotaryInputModifierNode it3 = (RotaryInputModifierNode) r27;
        if (it3.onRotaryScrollEvent(event) == true) goto L209;
        $this$dispatchForKind_u2d6rFNWt0$iv$iv4 = $this$dispatchForKind_u2d6rFNWt0$iv$iv3;
        r114 = r22;
        goto L246
    L209:
        return true;
    L248:
        if (ancestors$iv == null) goto L332;
        List $this$fastForEach$iv$iv = ancestors$iv;
        int index$iv$iv2 = 0;
        int r30 = $this$fastForEach$iv$iv.size();
    L250:
        if (index$iv$iv2 >= r30) goto L333;
        Object item$iv$iv2 = $this$fastForEach$iv$iv.get(index$iv$iv2);
        RotaryInputModifierNode it4 = (RotaryInputModifierNode) item$iv$iv2;
        if (it4.onRotaryScrollEvent(event) == true) goto L253;
        index$iv$iv2 = index$iv$iv2 + 1;
        goto L250
    L253:
        return true;
    L333:
        return false;
    L332:
        return false;
    L258:
        return false;
    L59:
        DelegatableNode $this$nearestAncestorIncludingSelf_u2d64DMado$iv3 = $this$nearestAncestorIncludingSelf_u2d64DMado$iv;
    L61:
        node$iv$iv$iv = node$iv$iv$iv.getParent$ui_release();
        r7 = 1;
        r5 = r25;
        $this$nearestAncestorIncludingSelf_u2d64DMado$iv = $this$nearestAncestorIncludingSelf_u2d64DMado$iv3;
        goto L15
    L60:
        $this$nearestAncestorIncludingSelf_u2d64DMado$iv3 = $this$nearestAncestorIncludingSelf_u2d64DMado$iv;
        r25 = r5;
        goto L61
    L62:
        DelegatableNode $this$nearestAncestorIncludingSelf_u2d64DMado$iv4 = $this$nearestAncestorIncludingSelf_u2d64DMado$iv;
        int r210 = r5;
    L64:
        layout$iv$iv$iv = layout$iv$iv$iv.getParent$ui_release();
        if (layout$iv$iv$iv == null) goto L69;
        NodeChain r33 = layout$iv$iv$iv.getNodes$ui_release();
        if (r33 == null) goto L69;
        Modifier.Node r34 = r33.getTail$ui_release();
    L70:
        node$iv$iv$iv = r34;
        r7 = 1;
        r5 = r210;
        $this$nearestAncestorIncludingSelf_u2d64DMado$iv = $this$nearestAncestorIncludingSelf_u2d64DMado$iv4;
    L69:
        r34 = null;
        goto L70
    L63:
        $this$nearestAncestorIncludingSelf_u2d64DMado$iv4 = $this$nearestAncestorIncludingSelf_u2d64DMado$iv;
        r210 = r5;
        goto L64
    L71:
        r25 = r5;
        r10 = null;
        goto L72
    L73:
        r25 = 16384;
        focusedRotaryInputNode = null;
        goto L75
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(FocusTargetNode node) {
        this.focusInvalidationManager.scheduleInvalidation(node);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(FocusEventModifierNode node) {
        this.focusInvalidationManager.scheduleInvalidation(node);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(FocusPropertiesModifierNode node) {
        this.focusInvalidationManager.scheduleInvalidation(node);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidationForOwner() {
        this.focusInvalidationManager.scheduleInvalidationForOwner();
    }

    private final void invalidateOwnerFocusState() {
        if (ComposeUiFlags.isTrackFocusEnabled == false) goto L7;
        if (getActiveFocusTargetNode() != null) goto L7;
    L8:
        this.onClearFocusForOwner.invoke();
        return;
    L7:
        if (this.rootFocusNode.getFocusState() == FocusStateImpl.Inactive) goto L8;
    }

    /* JADX INFO: renamed from: traverseAncestorsIncludingSelf-QFhIj7k, reason: not valid java name */
    private final /* synthetic */ <T extends DelegatableNode> void m4031traverseAncestorsIncludingSelfQFhIj7k(DelegatableNode $this$traverseAncestorsIncludingSelf_u2dQFhIj7k, int type, Function1<? super T, Unit> r38, Function0<Unit> r39, Function1<? super T, Unit> r40) {
        r38 = r38;
        int r2 = 0;
        DelegatableNode $this$ancestors_u2d64DMado$iv = $this$traverseAncestorsIncludingSelf_u2dQFhIj7k;
        int r4 = 0;
        Object result$iv = null;
        boolean value$iv$iv$iv$iv = $this$ancestors_u2d64DMado$iv.getNode().isAttached();
        if (value$iv$iv$iv$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
    L5:
        Modifier.Node node$iv$iv$iv = $this$ancestors_u2d64DMado$iv.getNode().getParent$ui_release();
        LayoutNode layout$iv$iv$iv = DelegatableNodeKt.requireLayoutNode($this$ancestors_u2d64DMado$iv);
    L7:
        if (layout$iv$iv$iv == null) goto L72;
        Modifier.Node head$iv$iv$iv = layout$iv$iv$iv.getNodes$ui_release().getHead$ui_release();
        if ((head$iv$iv$iv.getAggregateChildKindSet$ui_release() & type) == 0) goto L64;
    L10:
        if (node$iv$iv$iv == null) goto L63;
        if ((node$iv$iv$iv.getKindSet$ui_release() & type) == 0) goto L61;
        Modifier.Node it$iv$iv = node$iv$iv$iv;
        Object stack$iv$iv$iv = null;
        Modifier.Node this_$iv$iv$iv$iv = it$iv$iv;
    L14:
        if (this_$iv$iv$iv$iv == null) goto L60;
        r2 = r2;
        Intrinsics.reifiedOperationMarker(3, "T");
        if ((this_$iv$iv$iv$iv instanceof Object) == true) goto L17;
        DelegatableNode $this$ancestors_u2d64DMado$iv2 = $this$ancestors_u2d64DMado$iv;
        if ((this_$iv$iv$iv$iv.getKindSet$ui_release() & type) == 0) goto L24;
        boolean r3 = true;
    L25:
        if (r3 == false) goto L58;
        if ((this_$iv$iv$iv$iv instanceof DelegatingNode) == false) goto L58;
        int count$iv$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv$iv2 = (DelegatingNode) this_$iv$iv$iv$iv;
        Modifier.Node node$iv$iv$iv$iv = this_$iv$iv$iv$iv2.getDelegate$ui_release();
    L29:
        if (node$iv$iv$iv$iv == null) goto L54;
        DelegatingNode this_$iv$iv$iv$iv3 = this_$iv$iv$iv$iv2;
        Modifier.Node next$iv$iv$iv = node$iv$iv$iv$iv;
        if ((next$iv$iv$iv.getKindSet$ui_release() & type) == 0) goto L33;
        boolean r29 = true;
    L34:
        if (r29 == false) goto L52;
        count$iv$iv$iv = count$iv$iv$iv + 1;
        int r210 = r4;
        if (count$iv$iv$iv != 1) goto L38;
        this_$iv$iv$iv$iv = next$iv$iv$iv;
        result$iv = result$iv;
    L53:
        node$iv$iv$iv$iv = node$iv$iv$iv$iv.getChild$ui_release();
        this_$iv$iv$iv$iv2 = this_$iv$iv$iv$iv3;
        r4 = r210;
        result$iv = result$iv;
        goto L29
    L38:
        Object r5 = (MutableVector) stack$iv$iv$iv;
        if (r5 != null) goto L42;
        r5 = new MutableVector(new Modifier.Node[16], 0);
        MutableVector r6 = (MutableVector) r5;
    L42:
        stack$iv$iv$iv = r5;
        Modifier.Node theNode$iv$iv$iv = this_$iv$iv$iv$iv;
        if (theNode$iv$iv$iv == null) goto L48;
        MutableVector r7 = (MutableVector) stack$iv$iv$iv;
        if (r7 == null) goto L47;
        r7.add(theNode$iv$iv$iv);
    L47:
        this_$iv$iv$iv$iv = null;
    L48:
        MutableVector r8 = (MutableVector) stack$iv$iv$iv;
        if (r8 == null) goto L51;
        r8.add(next$iv$iv$iv);
    L51:
        count$iv$iv$iv = count$iv$iv$iv;
        goto L53
    L52:
        r210 = r4;
        result$iv = result$iv;
        goto L53
    L33:
        r29 = false;
        goto L34
    L54:
        int r211 = r4;
        Object result$iv2 = result$iv;
        if (count$iv$iv$iv != 1) goto L57;
        $this$ancestors_u2d64DMado$iv = $this$ancestors_u2d64DMado$iv2;
        r4 = r211;
        result$iv = result$iv2;
        goto L14
    L57:
        result$iv = result$iv2;
    L59:
        this_$iv$iv$iv$iv = DelegatableNodeKt.access$pop((MutableVector) stack$iv$iv$iv);
        $this$ancestors_u2d64DMado$iv = $this$ancestors_u2d64DMado$iv2;
        r4 = r211;
    L58:
        r211 = r4;
        result$iv = result$iv;
        goto L59
    L24:
        r3 = false;
        goto L25
    L17:
        Modifier.Node r9 = this_$iv$iv$iv$iv;
        if (result$iv != null) goto L20;
        Object result$iv3 = new ArrayList();
        result$iv = (List) result$iv3;
    L20:
        $this$ancestors_u2d64DMado$iv2 = $this$ancestors_u2d64DMado$iv;
        ((List) result$iv).add(r9);
        r211 = r4;
        goto L59
    L60:
        int r23 = r2;
        DelegatableNode $this$ancestors_u2d64DMado$iv3 = $this$ancestors_u2d64DMado$iv;
        int r212 = r4;
    L62:
        node$iv$iv$iv = node$iv$iv$iv.getParent$ui_release();
        r2 = r23;
        $this$ancestors_u2d64DMado$iv = $this$ancestors_u2d64DMado$iv3;
        r4 = r212;
        goto L10
    L61:
        r23 = r2;
        $this$ancestors_u2d64DMado$iv3 = $this$ancestors_u2d64DMado$iv;
        r212 = r4;
        goto L62
    L63:
        int r24 = r2;
        DelegatableNode $this$ancestors_u2d64DMado$iv4 = $this$ancestors_u2d64DMado$iv;
        int r213 = r4;
    L65:
        layout$iv$iv$iv = layout$iv$iv$iv.getParent$ui_release();
        if (layout$iv$iv$iv == null) goto L70;
        NodeChain r10 = layout$iv$iv$iv.getNodes$ui_release();
        if (r10 == null) goto L70;
        Modifier.Node r11 = r10.getTail$ui_release();
    L71:
        node$iv$iv$iv = r11;
        r2 = r24;
        $this$ancestors_u2d64DMado$iv = $this$ancestors_u2d64DMado$iv4;
        r4 = r213;
    L70:
        r11 = null;
        goto L71
    L64:
        r24 = r2;
        $this$ancestors_u2d64DMado$iv4 = $this$ancestors_u2d64DMado$iv;
        r213 = r4;
        goto L65
    L72:
        List ancestors = (List) result$iv;
        if (ancestors == null) goto L79;
        int r12 = ancestors.size() - 1;
        if (r12 < 0) goto L79;
    L76:
        int index$iv = r12;
        r12 = r12 - 1;
        Object item$iv = ancestors.get(index$iv);
        r38.invoke(item$iv);
        if (r12 >= 0) goto L76;
    L79:
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv = $this$traverseAncestorsIncludingSelf_u2dQFhIj7k.getNode();
        Object stack$iv = null;
        Modifier.Node node$iv = $this$dispatchForKind_u2d6rFNWt0$iv;
    L80:
        if (node$iv == null) goto L121;
        Intrinsics.reifiedOperationMarker(3, "T");
        if ((node$iv instanceof Object) == true) goto L83;
        Modifier.Node this_$iv$iv = node$iv;
        if ((this_$iv$iv.getKindSet$ui_release() & type) == 0) goto L87;
        boolean r13 = true;
    L88:
        if (r13 == false) goto L119;
        if ((node$iv instanceof DelegatingNode) == false) goto L119;
        int count$iv = 0;
        DelegatingNode this_$iv$iv2 = (DelegatingNode) node$iv;
        Modifier.Node node$iv$iv = this_$iv$iv2.getDelegate$ui_release();
    L92:
        if (node$iv$iv == null) goto L116;
        Modifier.Node next$iv = node$iv$iv;
        if ((next$iv.getKindSet$ui_release() & type) == 0) goto L96;
        boolean r14 = true;
    L97:
        if (r14 == false) goto L114;
        count$iv = count$iv + 1;
        if (count$iv != 1) goto L101;
        node$iv = next$iv;
        ancestors = ancestors;
        $this$dispatchForKind_u2d6rFNWt0$iv = $this$dispatchForKind_u2d6rFNWt0$iv;
    L115:
        node$iv$iv = node$iv$iv.getChild$ui_release();
        ancestors = ancestors;
        $this$dispatchForKind_u2d6rFNWt0$iv = $this$dispatchForKind_u2d6rFNWt0$iv;
        goto L92
    L101:
        Object r15 = (MutableVector) stack$iv;
        if (r15 != null) goto L105;
        Object r0 = new MutableVector(new Modifier.Node[16], 0);
        MutableVector r16 = (MutableVector) r0;
        r15 = r0;
    L105:
        stack$iv = r15;
        Modifier.Node theNode$iv = node$iv;
        if (theNode$iv == null) goto L111;
        MutableVector r17 = (MutableVector) stack$iv;
        if (r17 == null) goto L110;
        r17.add(theNode$iv);
    L110:
        node$iv = null;
    L111:
        MutableVector r18 = (MutableVector) stack$iv;
        if (r18 == null) goto L115;
        r18.add(next$iv);
        goto L115
    L114:
        ancestors = ancestors;
        $this$dispatchForKind_u2d6rFNWt0$iv = $this$dispatchForKind_u2d6rFNWt0$iv;
        goto L115
    L96:
        r14 = false;
        goto L97
    L116:
        List ancestors2 = ancestors;
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv;
        if (count$iv != 1) goto L120;
        ancestors = ancestors2;
        $this$dispatchForKind_u2d6rFNWt0$iv = $this$dispatchForKind_u2d6rFNWt0$iv2;
    L120:
        node$iv = DelegatableNodeKt.access$pop((MutableVector) stack$iv);
        ancestors = ancestors2;
        $this$dispatchForKind_u2d6rFNWt0$iv = $this$dispatchForKind_u2d6rFNWt0$iv2;
    L119:
        ancestors2 = ancestors;
        $this$dispatchForKind_u2d6rFNWt0$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv;
        goto L120
    L87:
        r13 = false;
        goto L88
    L83:
        r38.invoke(node$iv);
        ancestors2 = ancestors;
        $this$dispatchForKind_u2d6rFNWt0$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv;
        goto L120
    L121:
        List ancestors3 = ancestors;
        r39.invoke();
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv3 = $this$traverseAncestorsIncludingSelf_u2dQFhIj7k.getNode();
        int r19 = 0;
        Object stack$iv2 = null;
        Modifier.Node node$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv3;
    L122:
        if (node$iv2 == null) goto L164;
        Intrinsics.reifiedOperationMarker(3, "T");
        if ((node$iv2 instanceof Object) == true) goto L125;
        Modifier.Node this_$iv$iv3 = node$iv2;
        if ((this_$iv$iv3.getKindSet$ui_release() & type) == 0) goto L129;
        boolean r20 = true;
    L130:
        if (r20 == false) goto L161;
        if ((node$iv2 instanceof DelegatingNode) == false) goto L161;
        int count$iv2 = 0;
        DelegatingNode this_$iv$iv4 = (DelegatingNode) node$iv2;
        Modifier.Node node$iv$iv2 = this_$iv$iv4.getDelegate$ui_release();
    L134:
        if (node$iv$iv2 == null) goto L158;
        Modifier.Node next$iv2 = node$iv$iv2;
        if ((next$iv2.getKindSet$ui_release() & type) == 0) goto L138;
        boolean r110 = true;
    L139:
        if (r110 == false) goto L156;
        count$iv2 = count$iv2 + 1;
        if (count$iv2 != 1) goto L143;
        node$iv2 = next$iv2;
        $this$dispatchForKind_u2d6rFNWt0$iv3 = $this$dispatchForKind_u2d6rFNWt0$iv3;
        r19 = r19;
    L157:
        node$iv$iv2 = node$iv$iv2.getChild$ui_release();
        $this$dispatchForKind_u2d6rFNWt0$iv3 = $this$dispatchForKind_u2d6rFNWt0$iv3;
        r19 = r19;
        goto L134
    L143:
        Object r111 = (MutableVector) stack$iv2;
        if (r111 != null) goto L147;
        Object r21 = new MutableVector(new Modifier.Node[16], 0);
        MutableVector r1 = (MutableVector) r21;
        r111 = r21;
    L147:
        stack$iv2 = r111;
        Modifier.Node theNode$iv2 = node$iv2;
        if (theNode$iv2 == null) goto L153;
        MutableVector r22 = (MutableVector) stack$iv2;
        if (r22 == null) goto L152;
        r22.add(theNode$iv2);
    L152:
        node$iv2 = null;
    L153:
        MutableVector r25 = (MutableVector) stack$iv2;
        if (r25 == null) goto L157;
        r25.add(next$iv2);
        goto L157
    L156:
        $this$dispatchForKind_u2d6rFNWt0$iv3 = $this$dispatchForKind_u2d6rFNWt0$iv3;
        r19 = r19;
        goto L157
    L138:
        r110 = false;
        goto L139
    L158:
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv4 = $this$dispatchForKind_u2d6rFNWt0$iv3;
        int r112 = r19;
        if (count$iv2 != 1) goto L162;
        $this$dispatchForKind_u2d6rFNWt0$iv3 = $this$dispatchForKind_u2d6rFNWt0$iv4;
        r19 = r112;
    L162:
        node$iv2 = DelegatableNodeKt.access$pop((MutableVector) stack$iv2);
        $this$dispatchForKind_u2d6rFNWt0$iv3 = $this$dispatchForKind_u2d6rFNWt0$iv4;
        r19 = r112;
    L161:
        $this$dispatchForKind_u2d6rFNWt0$iv4 = $this$dispatchForKind_u2d6rFNWt0$iv3;
        r112 = r19;
        goto L162
    L129:
        r20 = false;
        goto L130
    L125:
        r40.invoke(node$iv2);
        $this$dispatchForKind_u2d6rFNWt0$iv4 = $this$dispatchForKind_u2d6rFNWt0$iv3;
        r112 = r19;
        goto L162
    L164:
        if (ancestors3 == null) goto L169;
        int index$iv2 = 0;
        int r26 = ancestors3.size();
    L166:
        if (index$iv2 >= r26) goto L220;
        Object item$iv2 = ancestors3.get(index$iv2);
        r40.invoke(item$iv2);
        index$iv2 = index$iv2 + 1;
        goto L166
    L220:
        return;
    }

    /* JADX INFO: renamed from: nearestAncestorIncludingSelf-64DMado, reason: not valid java name */
    private final /* synthetic */ <T> T m4030nearestAncestorIncludingSelf64DMado(DelegatableNode r30, int r31) {
        int r0 = 0;
        boolean r1 = true;
        DelegatableNode r2 = r30;
        int r3 = 0;
        int r4 = r31;
        if (r2.getNode().isAttached() == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
    L5:
        Modifier.Node r7 = r2.getNode();
        LayoutNode r8 = DelegatableNodeKt.requireLayoutNode(r2);
    L6:
        if (r8 == null) goto L68;
        if ((r8.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & r4) == 0) goto L60;
    L9:
        if (r7 == null) goto L59;
        if ((r7.getKindSet$ui_release() & r4) == 0) goto L57;
        Object r15 = null;
        Modifier.Node r9 = r7;
    L13:
        if (r9 == null) goto L56;
        r0 = r0;
        r1 = r1;
        Intrinsics.reifiedOperationMarker(3, "T");
        if ((r9 instanceof Object) == true) goto L17;
        if ((r9.getKindSet$ui_release() & r31) == 0) goto L21;
        int r5 = 1;
    L22:
        if (r5 == 0) goto L54;
        if ((r9 instanceof DelegatingNode) == false) goto L54;
        int r6 = 0;
        Modifier.Node r21 = ((DelegatingNode) r9).getDelegate$ui_release();
    L26:
        if (r21 == null) goto L51;
        Modifier.Node r10 = r21;
        if ((r10.getKindSet$ui_release() & r31) == 0) goto L30;
        boolean r23 = true;
    L31:
        if (r23 == false) goto L49;
        r6 = r6 + 1;
        DelegatableNode r24 = r2;
        if (r6 != 1) goto L35;
        r9 = r10;
        r3 = r3;
        r4 = r4;
    L50:
        r21 = r21.getChild$ui_release();
        r2 = r24;
        r3 = r3;
        r4 = r4;
        goto L26
    L35:
        MutableVector r11 = (MutableVector) r15;
        if (r11 != null) goto L39;
        r11 = new MutableVector(new Modifier.Node[16], 0);
    L39:
        r15 = r11;
        Modifier.Node r12 = r9;
        if (r12 == null) goto L45;
        MutableVector r13 = (MutableVector) r15;
        if (r13 == null) goto L44;
        r13.add(r12);
    L44:
        r9 = null;
    L45:
        MutableVector r14 = (MutableVector) r15;
        if (r14 == null) goto L48;
        r14.add(r10);
    L48:
        r6 = r6;
        goto L50
    L49:
        r24 = r2;
        r3 = r3;
        r4 = r4;
        goto L50
    L30:
        r23 = false;
        goto L31
    L51:
        DelegatableNode r25 = r2;
        int r27 = r3;
        int r28 = r4;
        if (r6 == 1) goto L53;
    L55:
        r9 = DelegatableNodeKt.access$pop((MutableVector) r15);
        r2 = r25;
        r3 = r27;
        r4 = r28;
        goto L13
    L53:
        r2 = r25;
        r3 = r27;
        r4 = r28;
    L54:
        r25 = r2;
        r27 = r3;
        r28 = r4;
        goto L55
    L21:
        r5 = 0;
        goto L22
    L17:
        return (T) r9;
    L56:
        int r17 = r0;
        boolean r18 = r1;
        DelegatableNode r26 = r2;
        int r29 = r3;
        int r210 = r4;
    L58:
        r7 = r7.getParent$ui_release();
        r0 = r17;
        r1 = r18;
        r2 = r26;
        r3 = r29;
        r4 = r210;
        goto L9
    L57:
        r17 = r0;
        r18 = r1;
        r26 = r2;
        r29 = r3;
        r210 = r4;
        goto L58
    L59:
        int r19 = r0;
        boolean r110 = r1;
        DelegatableNode r211 = r2;
        int r212 = r3;
        int r213 = r4;
        Modifier.Node r16 = null;
    L61:
        r8 = r8.getParent$ui_release();
        if (r8 == null) goto L66;
        NodeChain r20 = r8.getNodes$ui_release();
        if (r20 == null) goto L66;
        Modifier.Node r22 = r20.getTail$ui_release();
    L67:
        r7 = r22;
        r0 = r19;
        r1 = r110;
        r2 = r211;
        r3 = r212;
        r4 = r213;
    L66:
        r22 = r16;
        goto L67
    L60:
        r19 = r0;
        r110 = r1;
        r211 = r2;
        r212 = r3;
        r213 = r4;
        r16 = null;
        goto L61
    L68:
        return null;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public Rect getFocusRect() {
        FocusTargetNode r0 = findFocusTargetNode();
        if (r0 != null) goto L7;
        return null;
    L7:
        return FocusTraversalKt.focusRect(r0);
    }

    private final FocusTargetNode findFocusTargetNode() {
        return FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public FocusState getRootState() {
        return this.rootFocusNode.getFocusState();
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public MutableObjectList<FocusListener> getListeners() {
        return this.listeners;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public FocusTargetNode getActiveFocusTargetNode() {
        return this.activeFocusTargetNode;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void setActiveFocusTargetNode(FocusTargetNode value) {
        FocusTargetNode previousValue = this.activeFocusTargetNode;
        this.activeFocusTargetNode = value;
        if (value == null) goto L5;
        if (previousValue != value) goto L5;
    L7:
        if (ComposeUiFlags.isSemanticAutofillEnabled == false) goto L12;
        ObjectList this_$iv = getListeners();
        Object[] content$iv = this_$iv.content;
        int i$iv = 0;
        int r5 = this_$iv._size;
    L9:
        if (i$iv >= r5) goto L14;
        FocusListener it = (FocusListener) content$iv[i$iv];
        it.onFocusChanged(previousValue, value);
        i$iv = i$iv + 1;
        goto L9
    L14:
        return;
    L12:
        return;
    L5:
        setFocusCaptured(false);
        goto L7
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean isFocusCaptured() {
        return this.isFocusCaptured;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void setFocusCaptured(boolean value) {
        if (value == true) goto L4;
    L7:
        boolean value$iv = true;
    L9:
        if (value$iv == true) goto L11;
        InlineClassHelperKt.throwIllegalArgumentException("Cannot capture focus when the active focus target node is unset");
    L11:
        this.isFocusCaptured = value;
        return;
    L4:
        if (getActiveFocusTargetNode() != null) goto L7;
        value$iv = false;
        goto L9
    }

    private final Modifier.Node lastLocalKeyInputNode(DelegatableNode $this$lastLocalKeyInputNode) {
        Modifier.Node r0 = null;
        int mask$iv = NodeKind.m5976constructorimpl(1024) | NodeKind.m5976constructorimpl(8192);
        boolean value$iv$iv$iv = $this$lastLocalKeyInputNode.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
    L5:
        Modifier.Node self$iv$iv = $this$lastLocalKeyInputNode.getNode();
        if ((self$iv$iv.getAggregateChildKindSet$ui_release() & mask$iv) == 0) goto L21;
        Modifier.Node next$iv$iv = self$iv$iv.getChild$ui_release();
    L8:
        if (next$iv$iv == null) goto L21;
        if ((next$iv$iv.getKindSet$ui_release() & mask$iv) == 0) goto L18;
        Modifier.Node modifierNode = next$iv$iv;
        int r12 = NodeKind.m5976constructorimpl(1024);
        if ((modifierNode.getKindSet$ui_release() & r12) == 0) goto L14;
        boolean r15 = true;
    L15:
        if (r15 == true) goto L16;
        r0 = modifierNode;
        goto L18
    L16:
        return r0;
    L14:
        r15 = false;
    L18:
        next$iv$iv = next$iv$iv.getChild$ui_release();
    L21:
        return r0;
    }

    /* JADX INFO: renamed from: validateKeyEvent-ZmokQxo, reason: not valid java name */
    private final boolean m4032validateKeyEventZmokQxo(KeyEvent keyEvent) {
        long keyCode = KeyEvent_androidKt.m5445getKeyZmokQxo(keyEvent);
        int r2 = KeyEvent_androidKt.m5446getTypeZmokQxo(keyEvent);
        if (KeyEventType.m5438equalsimpl0(r2, KeyEventType.Companion.m5442getKeyDownCS__XNY()) == false) goto L9;
        MutableLongSet it = this.keysCurrentlyDown;
        if (it != null) goto L7;
        it = new MutableLongSet(3);
        this.keysCurrentlyDown = it;
    L7:
        it.plusAssign(keyCode);
    L21:
        return true;
    L9:
        if (KeyEventType.m5438equalsimpl0(r2, KeyEventType.Companion.m5443getKeyUpCS__XNY()) == false) goto L21;
        MutableLongSet r3 = this.keysCurrentlyDown;
        if (r3 != null) goto L13;
    L15:
        boolean r4 = false;
    L16:
        if (r4 == true) goto L18;
        return false;
    L18:
        MutableLongSet r5 = this.keysCurrentlyDown;
        if (r5 == null) goto L21;
        r5.remove(keyCode);
        goto L21
    L13:
        if (r3.contains(keyCode) != true) goto L15;
        r4 = true;
        goto L16
    }
}
