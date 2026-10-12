package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: TextToolbar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&JX\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\fH&Jj\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\fH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/TextToolbar;", "", NotificationCompat.CATEGORY_STATUS, "Landroidx/compose/ui/platform/TextToolbarStatus;", "getStatus", "()Landroidx/compose/ui/platform/TextToolbarStatus;", "hide", "", "showMenu", "rect", "Landroidx/compose/ui/geometry/Rect;", "onCopyRequested", "Lkotlin/Function0;", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "onAutofillRequested", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface TextToolbar {

    /* JADX INFO: compiled from: TextToolbar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void showMenu(TextToolbar $this, Rect rect, Function0<Unit> r2, Function0<Unit> r3, Function0<Unit> r4, Function0<Unit> r5, Function0<Unit> r6) {
            TextToolbar.access$showMenu$jd($this, rect, r2, r3, r4, r5, r6);
        }

        public static /* synthetic */ void showMenu$default(TextToolbar r0, Rect r1, Function0 r2, Function0 r3, Function0 r4, Function0 r5, Function0 r6, int r7, Object r8) {
            TextToolbar.showMenu$default(r0, r1, r2, r3, r4, r5, r6, r7, r8);
        }

        public static /* synthetic */ void showMenu$default(TextToolbar r0, Rect r1, Function0 r2, Function0 r3, Function0 r4, Function0 r5, int r6, Object r7) {
            TextToolbar.showMenu$default(r0, r1, r2, r3, r4, r5, r6, r7);
        }
    }

    TextToolbarStatus getStatus();

    void hide();

    void showMenu(Rect r1, Function0<Unit> r2, Function0<Unit> r3, Function0<Unit> r4, Function0<Unit> r5);

    static /* synthetic */ void access$showMenu$jd(TextToolbar $this, Rect rect, Function0 onCopyRequested, Function0 onPasteRequested, Function0 onCutRequested, Function0 onSelectAllRequested, Function0 onAutofillRequested) {
        super.showMenu(rect, onCopyRequested, onPasteRequested, onCutRequested, onSelectAllRequested, onAutofillRequested);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void showMenu$default(TextToolbar r1, Rect r2, Function0 r3, Function0 r4, Function0 r5, Function0 r6, Function0 r7, int r8, Object r9) {
        if (r9 != null) goto L21;
        if ((r8 & 2) == 0) goto L7;
        r3 = null;
    L7:
        if ((r8 & 4) == 0) goto L10;
        r4 = null;
    L10:
        if ((r8 & 8) == 0) goto L13;
        r5 = null;
    L13:
        if ((r8 & 16) == 0) goto L16;
        r6 = null;
    L16:
        if ((r8 & 32) == 0) goto L18;
        r7 = null;
    L18:
        r1.showMenu(r2, r3, r4, r5, r6, r7);
        return;
    L21:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMenu");
    }

    default void showMenu(Rect rect, Function0<Unit> r2, Function0<Unit> r3, Function0<Unit> r4, Function0<Unit> r5, Function0<Unit> r6) {
        showMenu(rect, r2, r3, r4, r5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void showMenu$default(TextToolbar r1, Rect r2, Function0 r3, Function0 r4, Function0 r5, Function0 r6, int r7, Object r8) {
        if (r8 != null) goto L18;
        if ((r7 & 2) == 0) goto L7;
        r3 = null;
    L7:
        if ((r7 & 4) == 0) goto L10;
        r4 = null;
    L10:
        if ((r7 & 8) == 0) goto L13;
        r5 = null;
    L13:
        if ((r7 & 16) == 0) goto L15;
        r6 = null;
    L15:
        r1.showMenu(r2, r3, r4, r5, r6);
        return;
    L18:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMenu");
    }
}
