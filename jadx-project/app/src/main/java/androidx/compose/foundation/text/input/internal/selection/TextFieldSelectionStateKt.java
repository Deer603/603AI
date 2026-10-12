package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: TextFieldSelectionState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0002\u001a5\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007*\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u000e\b\u0004\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0080\b\u001a\u0016\u0010\u000e\u001a\u00020\u000f*\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"DEBUG", "", "DEBUG_TAG", "", "logDebug", "", "text", "Lkotlin/Function0;", "menuItem", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "enabled", "desiredState", "Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;", "operation", "reverse", "Landroidx/compose/ui/text/TextRange;", "reverse-5zc-tL8", "(J)J", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextFieldSelectionStateKt {
    private static final boolean DEBUG = false;
    private static final String DEBUG_TAG = "TextFieldSelectionState";

    public static final /* synthetic */ void access$logDebug(Function0 text) {
        logDebug(text);
    }

    /* JADX INFO: renamed from: access$reverse-5zc-tL8, reason: not valid java name */
    public static final /* synthetic */ long m1379access$reverse5zctL8(long $receiver) {
        return m1380reverse5zctL8($receiver);
    }

    /* JADX INFO: renamed from: reverse-5zc-tL8, reason: not valid java name */
    private static final long m1380reverse5zctL8(long $this$reverse_u2d5zc_u2dtL8) {
        return TextRangeKt.TextRange(TextRange.m6412getEndimpl($this$reverse_u2d5zc_u2dtL8), TextRange.m6417getStartimpl($this$reverse_u2d5zc_u2dtL8));
    }

    public static final Function0<Unit> menuItem(final TextFieldSelectionState $this$menuItem, boolean enabled, final TextToolbarState desiredState, final Function0<Unit> r5) {
        if (enabled == true) goto L6;
        return null;
    L6:
        return new AnonymousClass1(r5, $this$menuItem, desiredState);
    }

    private static final void logDebug(Function0<String> r0) {
    }
}
