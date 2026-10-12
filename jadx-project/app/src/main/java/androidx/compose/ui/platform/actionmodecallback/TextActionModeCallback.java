package androidx.compose.ui.platform.actionmodecallback;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: TextActionModeCallback.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B{\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0000¢\u0006\u0002\b#J(\u0010$\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0002J\u001a\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010!\u001a\u0004\u0018\u00010*J\u001a\u0010+\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010\u001f\u001a\u0004\u0018\u00010 J\u0006\u0010,\u001a\u00020\u0004J\u001a\u0010-\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010\u001f\u001a\u0004\u0018\u00010 J\u0015\u0010.\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 H\u0001¢\u0006\u0002\b/R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000e\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0011R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0011R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0011R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u00060"}, d2 = {"Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;", "", "onActionModeDestroy", "Lkotlin/Function0;", "", "rect", "Landroidx/compose/ui/geometry/Rect;", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "onAutofillRequested", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getOnActionModeDestroy", "()Lkotlin/jvm/functions/Function0;", "getOnAutofillRequested", "setOnAutofillRequested", "(Lkotlin/jvm/functions/Function0;)V", "getOnCopyRequested", "setOnCopyRequested", "getOnCutRequested", "setOnCutRequested", "getOnPasteRequested", "setOnPasteRequested", "getOnSelectAllRequested", "setOnSelectAllRequested", "getRect", "()Landroidx/compose/ui/geometry/Rect;", "setRect", "(Landroidx/compose/ui/geometry/Rect;)V", "addMenuItem", "menu", "Landroid/view/Menu;", "item", "Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;", "addMenuItem$ui_release", "addOrRemoveMenuItem", "callback", "onActionItemClicked", "", "mode", "Landroid/view/ActionMode;", "Landroid/view/MenuItem;", "onCreateActionMode", "onDestroyActionMode", "onPrepareActionMode", "updateMenuItems", "updateMenuItems$ui_release", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextActionModeCallback {
    public static final int $stable = 0;
    private final Function0<Unit> onActionModeDestroy;
    private Function0<Unit> onAutofillRequested;
    private Function0<Unit> onCopyRequested;
    private Function0<Unit> onCutRequested;
    private Function0<Unit> onPasteRequested;
    private Function0<Unit> onSelectAllRequested;
    private Rect rect;

    static {
        $stable = 8;
    }

    public TextActionModeCallback() {
        Function0 r1 = null;
        Rect r2 = null;
        Function0 r3 = null;
        Function0 r4 = null;
        Function0 r5 = null;
        Function0 r6 = null;
        Function0 r7 = null;
        this(r1, r2, r3, r4, r5, r6, r7, WorkQueueKt.MASK, null);
    }

    public TextActionModeCallback(Function0<Unit> r1, Rect rect, Function0<Unit> r3, Function0<Unit> r4, Function0<Unit> r5, Function0<Unit> r6, Function0<Unit> r7) {
        this.onActionModeDestroy = r1;
        this.rect = rect;
        this.onCopyRequested = r3;
        this.onPasteRequested = r4;
        this.onCutRequested = r5;
        this.onSelectAllRequested = r6;
        this.onAutofillRequested = r7;
    }

    public /* synthetic */ TextActionModeCallback(Function0 r2, Rect r3, Function0 r4, Function0 r5, Function0 r6, Function0 r7, Function0 r8, int r9, DefaultConstructorMarker r10) {
        if ((r9 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r3 = Rect.Companion.getZero();
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r7 = null;
    L21:
        if ((r9 & 64) == 0) goto L23;
        Function0 r11 = null;
    L24:
        Function0 r12 = r7;
        Function0 r13 = r6;
        Function0 r14 = r5;
        Function0 r15 = r4;
        this(r2, r3, r15, r14, r13, r12, r11);
        return;
    L23:
        r11 = r8;
        goto L24
    }

    public final Function0<Unit> getOnActionModeDestroy() {
        return this.onActionModeDestroy;
    }

    public final Rect getRect() {
        return this.rect;
    }

    public final void setRect(Rect r1) {
        this.rect = r1;
    }

    public final Function0<Unit> getOnCopyRequested() {
        return this.onCopyRequested;
    }

    public final void setOnCopyRequested(Function0<Unit> r1) {
        this.onCopyRequested = r1;
    }

    public final Function0<Unit> getOnPasteRequested() {
        return this.onPasteRequested;
    }

    public final void setOnPasteRequested(Function0<Unit> r1) {
        this.onPasteRequested = r1;
    }

    public final Function0<Unit> getOnCutRequested() {
        return this.onCutRequested;
    }

    public final void setOnCutRequested(Function0<Unit> r1) {
        this.onCutRequested = r1;
    }

    public final Function0<Unit> getOnSelectAllRequested() {
        return this.onSelectAllRequested;
    }

    public final void setOnSelectAllRequested(Function0<Unit> r1) {
        this.onSelectAllRequested = r1;
    }

    public final Function0<Unit> getOnAutofillRequested() {
        return this.onAutofillRequested;
    }

    public final void setOnAutofillRequested(Function0<Unit> r1) {
        this.onAutofillRequested = r1;
    }

    public final boolean onCreateActionMode(ActionMode mode, Menu menu) {
        if (menu == null) goto L24;
        if (mode == null) goto L22;
        if (this.onCopyRequested == null) goto L8;
        addMenuItem$ui_release(menu, MenuItemOption.Copy);
    L8:
        if (this.onPasteRequested == null) goto L11;
        addMenuItem$ui_release(menu, MenuItemOption.Paste);
    L11:
        if (this.onCutRequested == null) goto L14;
        addMenuItem$ui_release(menu, MenuItemOption.Cut);
    L14:
        if (this.onSelectAllRequested == null) goto L17;
        addMenuItem$ui_release(menu, MenuItemOption.SelectAll);
    L17:
        if (this.onAutofillRequested == null) goto L25;
        addMenuItem$ui_release(menu, MenuItemOption.Autofill);
        return true;
    L25:
        return true;
    L22:
        throw new IllegalArgumentException("onCreateActionMode requires a non-null mode".toString());
    L24:
        throw new IllegalArgumentException("onCreateActionMode requires a non-null menu".toString());
    }

    public final boolean onPrepareActionMode(ActionMode mode, Menu menu) {
        if (mode == null) goto L7;
        if (menu == null) goto L9;
        updateMenuItems$ui_release(menu);
        return true;
    L9:
        return false;
    L7:
        return false;
    }

    public final boolean onActionItemClicked(ActionMode mode, MenuItem item) {
        Intrinsics.checkNotNull(item);
        int r0 = item.getItemId();
        if (r0 != MenuItemOption.Copy.getId()) goto L8;
        Function0<Unit> r1 = this.onCopyRequested;
        if (r1 == null) goto L27;
        r1.invoke();
    L27:
        if (mode == null) goto L33;
        mode.finish();
        return true;
    L33:
        return true;
    L8:
        if (r0 != MenuItemOption.Paste.getId()) goto L13;
        Function0<Unit> r2 = this.onPasteRequested;
        if (r2 == null) goto L27;
        r2.invoke();
        goto L27
    L13:
        if (r0 != MenuItemOption.Cut.getId()) goto L18;
        Function0<Unit> r3 = this.onCutRequested;
        if (r3 == null) goto L27;
        r3.invoke();
        goto L27
    L18:
        if (r0 != MenuItemOption.SelectAll.getId()) goto L23;
        Function0<Unit> r4 = this.onSelectAllRequested;
        if (r4 == null) goto L27;
        r4.invoke();
        goto L27
    L23:
        if (r0 != MenuItemOption.Autofill.getId()) goto L31;
        Function0<Unit> r5 = this.onAutofillRequested;
        if (r5 == null) goto L27;
        r5.invoke();
        goto L27
    L31:
        return false;
    }

    public final void onDestroyActionMode() {
        Function0<Unit> r0 = this.onActionModeDestroy;
        if (r0 == null) goto L6;
        r0.invoke();
        return;
    }

    public final void updateMenuItems$ui_release(Menu menu) {
        addOrRemoveMenuItem(menu, MenuItemOption.Copy, this.onCopyRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Paste, this.onPasteRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Cut, this.onCutRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.SelectAll, this.onSelectAllRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Autofill, this.onAutofillRequested);
    }

    public final void addMenuItem$ui_release(Menu menu, MenuItemOption item) {
        menu.add(0, item.getId(), item.getOrder(), item.getTitleResource()).setShowAsAction(1);
    }

    private final void addOrRemoveMenuItem(Menu menu, MenuItemOption item, Function0<Unit> r4) {
        if (r4 != null) goto L4;
    L6:
        if (r4 == null) goto L8;
        return;
    L8:
        if (menu.findItem(item.getId()) == null) goto L13;
        menu.removeItem(item.getId());
        return;
    L13:
        return;
    L4:
        if (menu.findItem(item.getId()) != null) goto L6;
        addMenuItem$ui_release(menu, item);
    }
}
