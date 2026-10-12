package androidx.compose.ui;

import kotlin.Metadata;

/* JADX INFO: compiled from: ComposeUiFlags.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0018\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u0018\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002R\u0018\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002R\u0018\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0002R\u0018\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0002¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/ComposeUiFlags;", "", "()V", "NewNestedScrollFlingDispatchingEnabled", "", "getNewNestedScrollFlingDispatchingEnabled$annotations", "isRectTrackingEnabled", "isRectTrackingEnabled$annotations", "isRemoveFocusedViewFixEnabled", "isRemoveFocusedViewFixEnabled$annotations", "isSemanticAutofillEnabled", "isSemanticAutofillEnabled$annotations", "isTrackFocusEnabled", "isTrackFocusEnabled$annotations", "isViewFocusFixEnabled", "isViewFocusFixEnabled$annotations", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ComposeUiFlags {
    public static final int $stable = 0;
    public static final ComposeUiFlags INSTANCE = null;
    public static boolean NewNestedScrollFlingDispatchingEnabled;
    public static boolean isRectTrackingEnabled;
    public static boolean isRemoveFocusedViewFixEnabled;
    public static boolean isSemanticAutofillEnabled;
    public static boolean isTrackFocusEnabled;
    public static boolean isViewFocusFixEnabled;

    public static /* synthetic */ void getNewNestedScrollFlingDispatchingEnabled$annotations() {
    }

    public static /* synthetic */ void isRectTrackingEnabled$annotations() {
    }

    public static /* synthetic */ void isRemoveFocusedViewFixEnabled$annotations() {
    }

    public static /* synthetic */ void isSemanticAutofillEnabled$annotations() {
    }

    public static /* synthetic */ void isTrackFocusEnabled$annotations() {
    }

    public static /* synthetic */ void isViewFocusFixEnabled$annotations() {
    }

    private ComposeUiFlags() {
    }

    static {
        INSTANCE = new ComposeUiFlags();
        isRectTrackingEnabled = true;
        NewNestedScrollFlingDispatchingEnabled = true;
        isSemanticAutofillEnabled = true;
        isTrackFocusEnabled = true;
        $stable = 8;
    }
}
