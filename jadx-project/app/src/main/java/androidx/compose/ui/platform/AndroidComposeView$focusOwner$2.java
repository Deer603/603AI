package androidx.compose.ui.platform;

import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* synthetic */ class AndroidComposeView$focusOwner$2 extends FunctionReferenceImpl implements Function2<FocusDirection, Rect, Boolean> {
    AndroidComposeView$focusOwner$2(Object r8) {
        super(2, r8, AndroidComposeView.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Boolean invoke(FocusDirection r3, Rect r4) {
        return m6088invoke7o62pno(r3, r4);
    }

    /* JADX INFO: renamed from: invoke-7o62pno, reason: not valid java name */
    public final Boolean m6088invoke7o62pno(FocusDirection p0, Rect p1) {
        return Boolean.valueOf(AndroidComposeView.m6075access$onRequestFocusForOwner7o62pno((AndroidComposeView) this.receiver, p0, p1));
    }
}
