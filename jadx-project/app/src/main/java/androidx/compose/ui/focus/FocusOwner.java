package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.collection.MutableObjectList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: FocusOwner.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J2\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020#H&ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001a\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020(H&ø\u0001\u0000¢\u0006\u0004\b)\u0010*J*\u0010+\u001a\u00020\r2\u0006\u0010'\u001a\u00020(2\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020\r0-H&ø\u0001\u0000¢\u0006\u0004\b.\u0010/J \u00100\u001a\u00020\r2\u0006\u00101\u001a\u0002022\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020\r0-H&J:\u00103\u001a\u0004\u0018\u00010\r2\u0006\u0010\"\u001a\u00020#2\b\u00104\u001a\u0004\u0018\u0001052\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r07H&ø\u0001\u0000¢\u0006\u0004\b8\u00109J\n\u0010:\u001a\u0004\u0018\u000105H&J\b\u0010;\u001a\u00020<H&J$\u0010=\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010>\u001a\u0004\u0018\u000105H&ø\u0001\u0000¢\u0006\u0002\b?J\u0010\u0010@\u001a\u00020<2\u0006\u0010A\u001a\u00020BH&J\u0010\u0010@\u001a\u00020<2\u0006\u0010A\u001a\u00020CH&J\u0010\u0010@\u001a\u00020<2\u0006\u0010A\u001a\u00020\u0003H&J\b\u0010D\u001a\u00020<H&J$\u0010E\u001a\u00020\r2\u0006\u0010\"\u001a\u00020#2\b\u0010>\u001a\u0004\u0018\u000105H&ø\u0001\u0000¢\u0006\u0004\bF\u0010GR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u00020\rX¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00020\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006HÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/focus/FocusOwner;", "Landroidx/compose/ui/focus/FocusManager;", "activeFocusTargetNode", "Landroidx/compose/ui/focus/FocusTargetNode;", "getActiveFocusTargetNode", "()Landroidx/compose/ui/focus/FocusTargetNode;", "setActiveFocusTargetNode", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "focusTransactionManager", "Landroidx/compose/ui/focus/FocusTransactionManager;", "getFocusTransactionManager", "()Landroidx/compose/ui/focus/FocusTransactionManager;", "isFocusCaptured", "", "()Z", "setFocusCaptured", "(Z)V", "listeners", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/ui/focus/FocusListener;", "getListeners", "()Landroidx/collection/MutableObjectList;", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "rootState", "Landroidx/compose/ui/focus/FocusState;", "getRootState", "()Landroidx/compose/ui/focus/FocusState;", "clearFocus", "force", "refreshFocusEvents", "clearOwnerFocus", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "clearFocus-I7lrPNg", "(ZZZI)Z", "dispatchInterceptedSoftKeyboardEvent", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "dispatchInterceptedSoftKeyboardEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "dispatchKeyEvent", "onFocusedItem", "Lkotlin/Function0;", "dispatchKeyEvent-YhN2O0w", "(Landroid/view/KeyEvent;Lkotlin/jvm/functions/Function0;)Z", "dispatchRotaryEvent", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "focusSearch", "focusedRect", "Landroidx/compose/ui/geometry/Rect;", "onFound", "Lkotlin/Function1;", "focusSearch-ULY8qGw", "(ILandroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "getFocusRect", "releaseFocus", "", "requestFocusForOwner", "previouslyFocusedRect", "requestFocusForOwner-7o62pno", "scheduleInvalidation", "node", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "scheduleInvalidationForOwner", "takeFocus", "takeFocus-aToIllA", "(ILandroidx/compose/ui/geometry/Rect;)Z", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface FocusOwner extends FocusManager {
    /* JADX INFO: renamed from: clearFocus-I7lrPNg, reason: not valid java name */
    boolean mo4024clearFocusI7lrPNg(boolean r1, boolean r2, boolean r3, int r4);

    /* JADX INFO: renamed from: dispatchInterceptedSoftKeyboardEvent-ZmokQxo, reason: not valid java name */
    boolean mo4025dispatchInterceptedSoftKeyboardEventZmokQxo(KeyEvent r1);

    /* JADX INFO: renamed from: dispatchKeyEvent-YhN2O0w, reason: not valid java name */
    boolean mo4026dispatchKeyEventYhN2O0w(KeyEvent r1, Function0<Boolean> r2);

    boolean dispatchRotaryEvent(RotaryScrollEvent r1, Function0<Boolean> r2);

    /* JADX INFO: renamed from: focusSearch-ULY8qGw, reason: not valid java name */
    Boolean mo4027focusSearchULY8qGw(int r1, Rect r2, Function1<? super FocusTargetNode, Boolean> r3);

    FocusTargetNode getActiveFocusTargetNode();

    Rect getFocusRect();

    FocusTransactionManager getFocusTransactionManager();

    MutableObjectList<FocusListener> getListeners();

    Modifier getModifier();

    FocusState getRootState();

    boolean isFocusCaptured();

    void releaseFocus();

    /* JADX INFO: renamed from: requestFocusForOwner-7o62pno, reason: not valid java name */
    boolean mo4028requestFocusForOwner7o62pno(FocusDirection r1, Rect r2);

    void scheduleInvalidation(FocusEventModifierNode r1);

    void scheduleInvalidation(FocusPropertiesModifierNode r1);

    void scheduleInvalidation(FocusTargetNode r1);

    void scheduleInvalidationForOwner();

    void setActiveFocusTargetNode(FocusTargetNode r1);

    void setFocusCaptured(boolean r1);

    /* JADX INFO: renamed from: takeFocus-aToIllA, reason: not valid java name */
    boolean mo4029takeFocusaToIllA(int r1, Rect r2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: dispatchKeyEvent-YhN2O0w$default, reason: not valid java name */
    static /* synthetic */ boolean m4023dispatchKeyEventYhN2O0w$default(FocusOwner r0, KeyEvent r1, FocusOwner$dispatchKeyEvent$1 r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L7;
        r2 = FocusOwner$dispatchKeyEvent$1.INSTANCE;
    L7:
        return r0.mo4026dispatchKeyEventYhN2O0w(r1, r2);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchKeyEvent-YhN2O0w");
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean dispatchRotaryEvent$default(FocusOwner r0, RotaryScrollEvent r1, AnonymousClass1 r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L7;
        r2 = AnonymousClass1.INSTANCE;
    L7:
        return r0.dispatchRotaryEvent(r1, r2);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchRotaryEvent");
    }
}
