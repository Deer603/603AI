package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextHighlightType;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextGranularity;
import androidx.compose.ui.text.TextInclusionStrategy;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.SetSelectionCommand;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Regex;

/* JADX INFO: compiled from: HandwritingGesture.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002J>\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00162\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002J8\u0010\u0017\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u001c\u001a\u00020\u0004*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J&\u0010\u001e\u001a\u00020\n*\u00020\u001d2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020 H\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J0\u0010#\u001a\u00020\u0004*\u00020$2\u0006\u0010\u0005\u001a\u00020%2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002J\u001c\u0010#\u001a\u00020\u0004*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0002J0\u0010(\u001a\u00020\u0004*\u00020$2\u0006\u0010\u0005\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002J\u001c\u0010(\u001a\u00020\u0004*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020)2\u0006\u0010&\u001a\u00020'H\u0002J&\u0010*\u001a\u00020\n*\u00020\u001d2\u0006\u0010+\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b,\u0010-JA\u0010.\u001a\u00020\u0004*\u00020$2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010/\u001a\u0004\u0018\u00010\u00192\b\u00100\u001a\u0004\u0018\u0001012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0000¢\u0006\u0002\b2J;\u0010.\u001a\u00020\u0004*\u00020\u001d2\u0006\u00103\u001a\u00020\u00062\u0006\u0010&\u001a\u00020'2\u000e\u00104\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u0001052\b\u00100\u001a\u0004\u0018\u000101H\u0000¢\u0006\u0002\b2J2\u00106\u001a\u00020\u0004*\u00020$2\u0006\u0010\u0005\u001a\u0002072\b\u00100\u001a\u0004\u0018\u0001012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002J&\u00106\u001a\u00020\u0004*\u00020\u001d2\u0006\u0010\u0005\u001a\u0002072\u0006\u0010&\u001a\u00020'2\b\u00100\u001a\u0004\u0018\u000101H\u0002J:\u00108\u001a\u00020\u0004*\u00020$2\u0006\u0010\u0005\u001a\u0002092\u0006\u0010\u000e\u001a\u00020\u000f2\b\u00100\u001a\u0004\u0018\u0001012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002J&\u00108\u001a\u00020\u0004*\u00020\u001d2\u0006\u0010\u0005\u001a\u0002092\u0006\u0010&\u001a\u00020'2\b\u00100\u001a\u0004\u0018\u000101H\u0002J:\u0010:\u001a\u00020\u0004*\u00020$2\u0006\u0010\u0005\u001a\u00020;2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u00100\u001a\u0004\u0018\u0001012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002J&\u0010:\u001a\u00020\u0004*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020;2\u0006\u0010&\u001a\u00020'2\b\u00100\u001a\u0004\u0018\u000101H\u0002J2\u0010<\u001a\u00020\u0004*\u00020$2\u0006\u0010\u0005\u001a\u00020=2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002J,\u0010<\u001a\u00020\u0004*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020=2\u0006\u0010&\u001a\u00020'2\u000e\u00104\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u000105H\u0002J2\u0010>\u001a\u00020\u0004*\u00020$2\u0006\u0010\u0005\u001a\u00020?2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002J,\u0010>\u001a\u00020\u0004*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020?2\u0006\u0010&\u001a\u00020'2\u000e\u00104\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u000105H\u0002J\u001e\u0010@\u001a\u00020\n*\u00020$2\u0006\u0010\u0005\u001a\u00020%2\b\u0010/\u001a\u0004\u0018\u00010\u0019H\u0002J\u001c\u0010@\u001a\u00020\n*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0002J\u001e\u0010A\u001a\u00020\n*\u00020$2\u0006\u0010\u0005\u001a\u00020)2\b\u0010/\u001a\u0004\u0018\u00010\u0019H\u0002J\u001c\u0010A\u001a\u00020\n*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020)2\u0006\u0010&\u001a\u00020'H\u0002J-\u0010B\u001a\u00020\u0011*\u00020$2\u0006\u0010\u0005\u001a\u00020C2\b\u0010/\u001a\u0004\u0018\u00010\u00192\b\u0010D\u001a\u0004\u0018\u00010EH\u0000¢\u0006\u0002\bFJ+\u0010B\u001a\u00020\u0011*\u00020\u001d2\u0006\u00103\u001a\u00020C2\u0006\u0010&\u001a\u00020'2\b\u0010D\u001a\u0004\u0018\u00010EH\u0000¢\u0006\u0002\bFJ\u001e\u0010G\u001a\u00020\n*\u00020$2\u0006\u0010\u0005\u001a\u00020=2\b\u0010/\u001a\u0004\u0018\u00010\u0019H\u0002J\u001c\u0010G\u001a\u00020\n*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020=2\u0006\u0010&\u001a\u00020'H\u0002J\u001e\u0010H\u001a\u00020\n*\u00020$2\u0006\u0010\u0005\u001a\u00020?2\b\u0010/\u001a\u0004\u0018\u00010\u0019H\u0002J\u001c\u0010H\u001a\u00020\n*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020?2\u0006\u0010&\u001a\u00020'H\u0002J\u0019\u0010I\u001a\u00020J*\u00020\u0004H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bK\u0010L\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006M"}, d2 = {"Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;", "", "()V", "fallbackOnLegacyTextField", "", "gesture", "Landroid/view/inputmethod/HandwritingGesture;", "editCommandConsumer", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/EditCommand;", "", "performDeletionOnLegacyTextField", "range", "Landroidx/compose/ui/text/TextRange;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "adjustRange", "", "performDeletionOnLegacyTextField-vJH6DeI", "(JLandroidx/compose/ui/text/AnnotatedString;ZLkotlin/jvm/functions/Function1;)V", "performInsertionOnLegacyTextField", "offset", "", "performSelectionOnLegacyTextField", "textSelectionManager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "performSelectionOnLegacyTextField-8ffj60Q", "(JLandroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function1;)V", "fallback", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "highlightRange", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/foundation/text/input/TextHighlightType;", "highlightRange-XJREzCE", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;JI)V", "performDeleteGesture", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "Landroid/view/inputmethod/DeleteGesture;", "layoutState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "performDeleteRangeGesture", "Landroid/view/inputmethod/DeleteRangeGesture;", "performDeletion", "rangeInTransformedText", "performDeletion-Sb-Bc2M", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;JZ)V", "performHandwritingGesture", "textFieldSelectionManager", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "performHandwritingGesture$foundation_release", "handwritingGesture", "updateSelectionState", "Lkotlin/Function0;", "performInsertGesture", "Landroid/view/inputmethod/InsertGesture;", "performJoinOrSplitGesture", "Landroid/view/inputmethod/JoinOrSplitGesture;", "performRemoveSpaceGesture", "Landroid/view/inputmethod/RemoveSpaceGesture;", "performSelectGesture", "Landroid/view/inputmethod/SelectGesture;", "performSelectRangeGesture", "Landroid/view/inputmethod/SelectRangeGesture;", "previewDeleteGesture", "previewDeleteRangeGesture", "previewHandwritingGesture", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "cancellationSignal", "Landroid/os/CancellationSignal;", "previewHandwritingGesture$foundation_release", "previewSelectGesture", "previewSelectRangeGesture", "toTextGranularity", "Landroidx/compose/ui/text/TextGranularity;", "toTextGranularity-NUwxegE", "(I)I", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HandwritingGestureApi34 {
    public static final int $stable = 0;
    public static final HandwritingGestureApi34 INSTANCE = null;

    static {
        INSTANCE = new HandwritingGestureApi34();
    }

    private HandwritingGestureApi34() {
    }

    public final int performHandwritingGesture$foundation_release(TransformedTextFieldState $this$performHandwritingGesture, HandwritingGesture handwritingGesture, TextLayoutState layoutState, Function0<Unit> r5, ViewConfiguration viewConfiguration) {
        if ((handwritingGesture instanceof SelectGesture) == false) goto L6;
        return performSelectGesture($this$performHandwritingGesture, (SelectGesture) handwritingGesture, layoutState, r5);
    L6:
        if ((handwritingGesture instanceof DeleteGesture) == false) goto L9;
        return performDeleteGesture($this$performHandwritingGesture, (DeleteGesture) handwritingGesture, layoutState);
    L9:
        if ((handwritingGesture instanceof SelectRangeGesture) == false) goto L12;
        return performSelectRangeGesture($this$performHandwritingGesture, (SelectRangeGesture) handwritingGesture, layoutState, r5);
    L12:
        if ((handwritingGesture instanceof DeleteRangeGesture) == false) goto L15;
        return performDeleteRangeGesture($this$performHandwritingGesture, (DeleteRangeGesture) handwritingGesture, layoutState);
    L15:
        if ((handwritingGesture instanceof JoinOrSplitGesture) == false) goto L18;
        return performJoinOrSplitGesture($this$performHandwritingGesture, (JoinOrSplitGesture) handwritingGesture, layoutState, viewConfiguration);
    L18:
        if ((handwritingGesture instanceof InsertGesture) == false) goto L21;
        return performInsertGesture($this$performHandwritingGesture, (InsertGesture) handwritingGesture, layoutState, viewConfiguration);
    L21:
        if ((handwritingGesture instanceof RemoveSpaceGesture) == true) goto L31;
        return 2;
    L31:
        return performRemoveSpaceGesture($this$performHandwritingGesture, (RemoveSpaceGesture) handwritingGesture, layoutState, viewConfiguration);
    }

    public final boolean previewHandwritingGesture$foundation_release(final TransformedTextFieldState $this$previewHandwritingGesture, PreviewableHandwritingGesture handwritingGesture, TextLayoutState layoutState, CancellationSignal cancellationSignal) {
        if ((handwritingGesture instanceof SelectGesture) == false) goto L6;
        previewSelectGesture($this$previewHandwritingGesture, (SelectGesture) handwritingGesture, layoutState);
    L14:
        if (cancellationSignal == null) goto L20;
        cancellationSignal.setOnCancelListener(new HandwritingGestureApi34$$ExternalSyntheticLambda1($this$previewHandwritingGesture));
        return true;
    L20:
        return true;
    L6:
        if ((handwritingGesture instanceof DeleteGesture) == false) goto L9;
        previewDeleteGesture($this$previewHandwritingGesture, (DeleteGesture) handwritingGesture, layoutState);
        goto L14
    L9:
        if ((handwritingGesture instanceof SelectRangeGesture) == false) goto L12;
        previewSelectRangeGesture($this$previewHandwritingGesture, (SelectRangeGesture) handwritingGesture, layoutState);
        goto L14
    L12:
        if ((handwritingGesture instanceof DeleteRangeGesture) == false) goto L18;
        previewDeleteRangeGesture($this$previewHandwritingGesture, (DeleteRangeGesture) handwritingGesture, layoutState);
        goto L14
    L18:
        return false;
    }

    static final void previewHandwritingGesture$lambda$1(TransformedTextFieldState $this_previewHandwritingGesture) {
        TextFieldState $this$iv$iv = TransformedTextFieldState.access$getTextFieldState$p($this_previewHandwritingGesture);
        InputTransformation inputTransformation$iv$iv = TransformedTextFieldState.access$getInputTransformation$p($this_previewHandwritingGesture);
        TextFieldEditUndoBehavior undoBehavior$iv$iv = TextFieldEditUndoBehavior.MergeIfPossible;
        $this$iv$iv.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer $this$editUntransformedTextAsUser_u24lambda_u2411$iv = $this$iv$iv.getMainBuffer$foundation_release();
        $this$editUntransformedTextAsUser_u24lambda_u2411$iv.clearHighlight$foundation_release();
        TransformedTextFieldState.access$updateWedgeAffinity($this_previewHandwritingGesture, $this$editUntransformedTextAsUser_u24lambda_u2411$iv);
        TextFieldState.access$commitEditAsUser($this$iv$iv, inputTransformation$iv$iv, true, undoBehavior$iv$iv);
    }

    private final int performSelectGesture(TransformedTextFieldState $this$performSelectGesture, SelectGesture gesture, TextLayoutState layoutState, Function0<Unit> r10) {
        long rangeInTransformedText = HandwritingGesture_androidKt.m1240access$getRangeForScreenRectOH9lIzo(layoutState, RectHelper_androidKt.toComposeRect(gesture.getSelectionArea()), m1234toTextGranularityNUwxegE(gesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m6411getCollapsedimpl(rangeInTransformedText) == true) goto L5;
        $this$performSelectGesture.m1316selectCharsIn5zctL8(rangeInTransformedText);
        if (r10 == null) goto L11;
        r10.invoke();
        return 1;
    L11:
        return 1;
    L5:
        return INSTANCE.fallback($this$performSelectGesture, gesture);
    }

    private final void previewSelectGesture(TransformedTextFieldState $this$previewSelectGesture, SelectGesture gesture, TextLayoutState layoutState) {
        m1230highlightRangeXJREzCE($this$previewSelectGesture, HandwritingGesture_androidKt.m1240access$getRangeForScreenRectOH9lIzo(layoutState, RectHelper_androidKt.toComposeRect(gesture.getSelectionArea()), m1234toTextGranularityNUwxegE(gesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()), TextHighlightType.Companion.m1202getHandwritingSelectPreviewsxJuwY());
    }

    private final int performDeleteGesture(TransformedTextFieldState $this$performDeleteGesture, DeleteGesture gesture, TextLayoutState layoutState) {
        int granularity = m1234toTextGranularityNUwxegE(gesture.getGranularity());
        long rangeInTransformedText = HandwritingGesture_androidKt.m1240access$getRangeForScreenRectOH9lIzo(layoutState, RectHelper_androidKt.toComposeRect(gesture.getDeletionArea()), granularity, TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m6411getCollapsedimpl(rangeInTransformedText) == true) goto L5;
        m1231performDeletionSbBc2M($this$performDeleteGesture, rangeInTransformedText, TextGranularity.m6375equalsimpl0(granularity, TextGranularity.Companion.m6380getWordDRrd7Zo()));
        return 1;
    L5:
        return INSTANCE.fallback($this$performDeleteGesture, gesture);
    }

    private final void previewDeleteGesture(TransformedTextFieldState $this$previewDeleteGesture, DeleteGesture gesture, TextLayoutState layoutState) {
        m1230highlightRangeXJREzCE($this$previewDeleteGesture, HandwritingGesture_androidKt.m1240access$getRangeForScreenRectOH9lIzo(layoutState, RectHelper_androidKt.toComposeRect(gesture.getDeletionArea()), m1234toTextGranularityNUwxegE(gesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()), TextHighlightType.Companion.m1201getHandwritingDeletePreviewsxJuwY());
    }

    private final int performSelectRangeGesture(TransformedTextFieldState $this$performSelectRangeGesture, SelectRangeGesture gesture, TextLayoutState layoutState, Function0<Unit> r10) {
        long rangeInTransformedText = HandwritingGesture_androidKt.m1242access$getRangeForScreenRectsO048IG0(layoutState, RectHelper_androidKt.toComposeRect(gesture.getSelectionStartArea()), RectHelper_androidKt.toComposeRect(gesture.getSelectionEndArea()), m1234toTextGranularityNUwxegE(gesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m6411getCollapsedimpl(rangeInTransformedText) == true) goto L5;
        $this$performSelectRangeGesture.m1316selectCharsIn5zctL8(rangeInTransformedText);
        if (r10 == null) goto L11;
        r10.invoke();
        return 1;
    L11:
        return 1;
    L5:
        return INSTANCE.fallback($this$performSelectRangeGesture, gesture);
    }

    private final void previewSelectRangeGesture(TransformedTextFieldState $this$previewSelectRangeGesture, SelectRangeGesture gesture, TextLayoutState layoutState) {
        m1230highlightRangeXJREzCE($this$previewSelectRangeGesture, HandwritingGesture_androidKt.m1242access$getRangeForScreenRectsO048IG0(layoutState, RectHelper_androidKt.toComposeRect(gesture.getSelectionStartArea()), RectHelper_androidKt.toComposeRect(gesture.getSelectionEndArea()), m1234toTextGranularityNUwxegE(gesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()), TextHighlightType.Companion.m1202getHandwritingSelectPreviewsxJuwY());
    }

    private final int performDeleteRangeGesture(TransformedTextFieldState $this$performDeleteRangeGesture, DeleteRangeGesture gesture, TextLayoutState layoutState) {
        int granularity = m1234toTextGranularityNUwxegE(gesture.getGranularity());
        long rangeInTransformedText = HandwritingGesture_androidKt.m1242access$getRangeForScreenRectsO048IG0(layoutState, RectHelper_androidKt.toComposeRect(gesture.getDeletionStartArea()), RectHelper_androidKt.toComposeRect(gesture.getDeletionEndArea()), granularity, TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m6411getCollapsedimpl(rangeInTransformedText) == true) goto L5;
        m1231performDeletionSbBc2M($this$performDeleteRangeGesture, rangeInTransformedText, TextGranularity.m6375equalsimpl0(granularity, TextGranularity.Companion.m6380getWordDRrd7Zo()));
        return 1;
    L5:
        return INSTANCE.fallback($this$performDeleteRangeGesture, gesture);
    }

    private final void previewDeleteRangeGesture(TransformedTextFieldState $this$previewDeleteRangeGesture, DeleteRangeGesture gesture, TextLayoutState layoutState) {
        m1230highlightRangeXJREzCE($this$previewDeleteRangeGesture, HandwritingGesture_androidKt.m1242access$getRangeForScreenRectsO048IG0(layoutState, RectHelper_androidKt.toComposeRect(gesture.getDeletionStartArea()), RectHelper_androidKt.toComposeRect(gesture.getDeletionEndArea()), m1234toTextGranularityNUwxegE(gesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()), TextHighlightType.Companion.m1201getHandwritingDeletePreviewsxJuwY());
    }

    private final int performJoinOrSplitGesture(TransformedTextFieldState $this$performJoinOrSplitGesture, JoinOrSplitGesture gesture, TextLayoutState layoutState, ViewConfiguration viewConfiguration) {
        if ($this$performJoinOrSplitGesture.getOutputText() == $this$performJoinOrSplitGesture.getUntransformedText()) goto L6;
        return 3;
    L6:
        int offset = HandwritingGesture_androidKt.m1237access$getOffsetForHandwritingGestured4ec7I(layoutState, HandwritingGesture_androidKt.access$toOffset(gesture.getJoinOrSplitPoint()), viewConfiguration);
        if (offset == (-1)) goto L22;
        TextLayoutResult r0 = layoutState.getLayoutResult();
        if (r0 != null) goto L11;
    L13:
        boolean r1 = false;
    L14:
        if (r1 == true) goto L22;
        long textRange = HandwritingGesture_androidKt.access$rangeOfWhitespaces($this$performJoinOrSplitGesture.getVisualText(), offset);
        if (TextRange.m6411getCollapsedimpl(textRange) == false) goto L19;
        TransformedTextFieldState.m1309replaceTextM8tDOmk$default($this$performJoinOrSplitGesture, " ", textRange, null, false, 12, null);
    L20:
        return 1;
    L19:
        m1231performDeletionSbBc2M($this$performJoinOrSplitGesture, textRange, false);
        goto L20
    L11:
        if (HandwritingGesture_androidKt.access$isBiDiBoundary(r0, offset) != true) goto L13;
        r1 = true;
    L22:
        return fallback($this$performJoinOrSplitGesture, gesture);
    }

    private final int performInsertGesture(TransformedTextFieldState $this$performInsertGesture, InsertGesture gesture, TextLayoutState layoutState, ViewConfiguration viewConfiguration) {
        int offset = HandwritingGesture_androidKt.m1237access$getOffsetForHandwritingGestured4ec7I(layoutState, HandwritingGesture_androidKt.access$toOffset(gesture.getInsertionPoint()), viewConfiguration);
        if (offset == (-1)) goto L5;
        TransformedTextFieldState.m1309replaceTextM8tDOmk$default($this$performInsertGesture, gesture.getTextToInsert(), TextRangeKt.TextRange(offset), null, false, 12, null);
        return 1;
    L5:
        return fallback($this$performInsertGesture, gesture);
    }

    private final int performRemoveSpaceGesture(TransformedTextFieldState $this$performRemoveSpaceGesture, RemoveSpaceGesture gesture, TextLayoutState layoutState, ViewConfiguration viewConfiguration) {
        long $this$performRemoveSpaceGesture_u24lambda_u246 = HandwritingGesture_androidKt.m1238access$getRangeForRemoveSpaceGesture5iVPX68(layoutState.getLayoutResult(), HandwritingGesture_androidKt.access$toOffset(gesture.getStartPoint()), HandwritingGesture_androidKt.access$toOffset(gesture.getEndPoint()), layoutState.getTextLayoutNodeCoordinates(), viewConfiguration);
        if (TextRange.m6411getCollapsedimpl($this$performRemoveSpaceGesture_u24lambda_u246) == true) goto L5;
        final Ref.IntRef firstMatchStart = new Ref.IntRef();
        firstMatchStart.element = -1;
        final Ref.IntRef lastMatchEnd = new Ref.IntRef();
        lastMatchEnd.element = -1;
        String r2 = TextRangeKt.m6424substringFDrldGo($this$performRemoveSpaceGesture.getVisualText(), $this$performRemoveSpaceGesture_u24lambda_u246);
        String newText = new Regex("\\s+").replace(r2, new HandwritingGestureApi34$performRemoveSpaceGesture$newText$1(firstMatchStart, lastMatchEnd));
        if (firstMatchStart.element == (-1)) goto L14;
        if (lastMatchEnd.element == (-1)) goto L14;
        long finalRange = TextRangeKt.TextRange(TextRange.m6417getStartimpl($this$performRemoveSpaceGesture_u24lambda_u246) + firstMatchStart.element, TextRange.m6417getStartimpl($this$performRemoveSpaceGesture_u24lambda_u246) + lastMatchEnd.element);
        String finalNewText = newText.substring(firstMatchStart.element, newText.length() - (TextRange.m6413getLengthimpl($this$performRemoveSpaceGesture_u24lambda_u246) - lastMatchEnd.element));
        Intrinsics.checkNotNullExpressionValue(finalNewText, "substring(...)");
        TransformedTextFieldState.m1309replaceTextM8tDOmk$default($this$performRemoveSpaceGesture, finalNewText, finalRange, null, false, 12, null);
        return 1;
    L14:
        return fallback($this$performRemoveSpaceGesture, gesture);
    L5:
        return INSTANCE.fallback($this$performRemoveSpaceGesture, gesture);
    }

    /* JADX INFO: renamed from: performDeletion-Sb-Bc2M, reason: not valid java name */
    private final void m1231performDeletionSbBc2M(TransformedTextFieldState $this$performDeletion_u2dSb_u2dBc2M, long rangeInTransformedText, boolean adjustRange) {
        if (adjustRange == false) goto L4;
        long r0 = HandwritingGesture_androidKt.m1235access$adjustHandwritingDeleteGestureRange72CqOWE(rangeInTransformedText, $this$performDeletion_u2dSb_u2dBc2M.getVisualText());
    L5:
        long finalRange = r0;
        TransformedTextFieldState.m1309replaceTextM8tDOmk$default($this$performDeletion_u2dSb_u2dBc2M, "", finalRange, null, false, 12, null);
        return;
    L4:
        r0 = rangeInTransformedText;
        goto L5
    }

    private final int fallback(TransformedTextFieldState $this$fallback, HandwritingGesture gesture) {
        TextFieldState $this$iv$iv = TransformedTextFieldState.access$getTextFieldState$p($this$fallback);
        InputTransformation inputTransformation$iv$iv = TransformedTextFieldState.access$getInputTransformation$p($this$fallback);
        TextFieldEditUndoBehavior undoBehavior$iv$iv = TextFieldEditUndoBehavior.MergeIfPossible;
        $this$iv$iv.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer $this$editUntransformedTextAsUser_u24lambda_u2411$iv = $this$iv$iv.getMainBuffer$foundation_release();
        $this$editUntransformedTextAsUser_u24lambda_u2411$iv.clearHighlight$foundation_release();
        TransformedTextFieldState.access$updateWedgeAffinity($this$fallback, $this$editUntransformedTextAsUser_u24lambda_u2411$iv);
        TextFieldState.access$commitEditAsUser($this$iv$iv, inputTransformation$iv$iv, true, undoBehavior$iv$iv);
        String fallbackText = gesture.getFallbackText();
        if (fallbackText != null) goto L6;
        return 3;
    L6:
        TransformedTextFieldState.replaceSelectedText$default($this$fallback, fallbackText, true, null, false, 12, null);
        return 5;
    }

    /* JADX INFO: renamed from: highlightRange-XJREzCE, reason: not valid java name */
    private final void m1230highlightRangeXJREzCE(TransformedTextFieldState $this$highlightRange_u2dXJREzCE, long range, int type) {
        if (TextRange.m6411getCollapsedimpl(range) == false) goto L5;
        TextFieldState $this$iv$iv = TransformedTextFieldState.access$getTextFieldState$p($this$highlightRange_u2dXJREzCE);
        InputTransformation inputTransformation$iv$iv = TransformedTextFieldState.access$getInputTransformation$p($this$highlightRange_u2dXJREzCE);
        TextFieldEditUndoBehavior undoBehavior$iv$iv = TextFieldEditUndoBehavior.MergeIfPossible;
        $this$iv$iv.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer $this$editUntransformedTextAsUser_u24lambda_u2411$iv = $this$iv$iv.getMainBuffer$foundation_release();
        $this$editUntransformedTextAsUser_u24lambda_u2411$iv.clearHighlight$foundation_release();
        TransformedTextFieldState.access$updateWedgeAffinity($this$highlightRange_u2dXJREzCE, $this$editUntransformedTextAsUser_u24lambda_u2411$iv);
        TextFieldState.access$commitEditAsUser($this$iv$iv, inputTransformation$iv$iv, true, undoBehavior$iv$iv);
        return;
    L5:
        $this$highlightRange_u2dXJREzCE.m1310highlightCharsIn7RAjNK8(type, range);
    }

    public final int performHandwritingGesture$foundation_release(LegacyTextFieldState $this$performHandwritingGesture, HandwritingGesture gesture, TextFieldSelectionManager textFieldSelectionManager, ViewConfiguration viewConfiguration, Function1<? super EditCommand, Unit> r13) {
        AnnotatedString text = $this$performHandwritingGesture.getUntransformedText();
        if (text != null) goto L5;
        return 3;
    L5:
        TextLayoutResultProxy r0 = $this$performHandwritingGesture.getLayoutResult();
        if (r0 == null) goto L12;
        TextLayoutResult r1 = r0.getValue();
        if (r1 == null) goto L12;
        TextLayoutInput r2 = r1.getLayoutInput();
        if (r2 == null) goto L12;
        AnnotatedString r3 = r2.getText();
    L14:
        if (Intrinsics.areEqual(text, r3) == true) goto L17;
        return 3;
    L17:
        if ((gesture instanceof SelectGesture) == false) goto L20;
        return performSelectGesture($this$performHandwritingGesture, (SelectGesture) gesture, textFieldSelectionManager, r13);
    L20:
        if ((gesture instanceof DeleteGesture) == false) goto L23;
        return performDeleteGesture($this$performHandwritingGesture, (DeleteGesture) gesture, text, r13);
    L23:
        if ((gesture instanceof SelectRangeGesture) == false) goto L26;
        return performSelectRangeGesture($this$performHandwritingGesture, (SelectRangeGesture) gesture, textFieldSelectionManager, r13);
    L26:
        if ((gesture instanceof DeleteRangeGesture) == false) goto L29;
        return performDeleteRangeGesture($this$performHandwritingGesture, (DeleteRangeGesture) gesture, text, r13);
    L29:
        if ((gesture instanceof JoinOrSplitGesture) == false) goto L32;
        return performJoinOrSplitGesture($this$performHandwritingGesture, (JoinOrSplitGesture) gesture, text, viewConfiguration, r13);
    L32:
        if ((gesture instanceof InsertGesture) == false) goto L35;
        return performInsertGesture($this$performHandwritingGesture, (InsertGesture) gesture, viewConfiguration, r13);
    L35:
        if ((gesture instanceof RemoveSpaceGesture) == true) goto L45;
        return 2;
    L45:
        return performRemoveSpaceGesture($this$performHandwritingGesture, (RemoveSpaceGesture) gesture, text, viewConfiguration, r13);
    L12:
        r3 = null;
        goto L14
    }

    public final boolean previewHandwritingGesture$foundation_release(LegacyTextFieldState $this$previewHandwritingGesture, PreviewableHandwritingGesture gesture, final TextFieldSelectionManager textFieldSelectionManager, CancellationSignal cancellationSignal) {
        AnnotatedString text = $this$previewHandwritingGesture.getUntransformedText();
        if (text != null) goto L5;
        return false;
    L5:
        TextLayoutResultProxy r2 = $this$previewHandwritingGesture.getLayoutResult();
        if (r2 == null) goto L12;
        TextLayoutResult r3 = r2.getValue();
        if (r3 == null) goto L12;
        TextLayoutInput r4 = r3.getLayoutInput();
        if (r4 == null) goto L12;
        AnnotatedString r5 = r4.getText();
    L14:
        if (Intrinsics.areEqual(text, r5) == true) goto L17;
        return false;
    L17:
        if ((gesture instanceof SelectGesture) == false) goto L20;
        previewSelectGesture($this$previewHandwritingGesture, (SelectGesture) gesture, textFieldSelectionManager);
    L28:
        if (cancellationSignal == null) goto L33;
        cancellationSignal.setOnCancelListener(new HandwritingGestureApi34$$ExternalSyntheticLambda0(textFieldSelectionManager));
        return true;
    L33:
        return true;
    L20:
        if ((gesture instanceof DeleteGesture) == false) goto L23;
        previewDeleteGesture($this$previewHandwritingGesture, (DeleteGesture) gesture, textFieldSelectionManager);
        goto L28
    L23:
        if ((gesture instanceof SelectRangeGesture) == false) goto L26;
        previewSelectRangeGesture($this$previewHandwritingGesture, (SelectRangeGesture) gesture, textFieldSelectionManager);
        goto L28
    L26:
        if ((gesture instanceof DeleteRangeGesture) == false) goto L32;
        previewDeleteRangeGesture($this$previewHandwritingGesture, (DeleteRangeGesture) gesture, textFieldSelectionManager);
        goto L28
    L32:
        return false;
    L12:
        r5 = null;
        goto L14
    }

    static final void previewHandwritingGesture$lambda$9(TextFieldSelectionManager $textFieldSelectionManager) {
        if ($textFieldSelectionManager == null) goto L5;
        $textFieldSelectionManager.clearPreviewHighlight$foundation_release();
        return;
    }

    private final int performSelectGesture(LegacyTextFieldState $this$performSelectGesture, SelectGesture gesture, TextFieldSelectionManager textSelectionManager, Function1<? super EditCommand, Unit> r10) {
        long range = HandwritingGesture_androidKt.m1239access$getRangeForScreenRectOH9lIzo($this$performSelectGesture, RectHelper_androidKt.toComposeRect(gesture.getSelectionArea()), m1234toTextGranularityNUwxegE(gesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m6411getCollapsedimpl(range) == true) goto L5;
        m1233performSelectionOnLegacyTextField8ffj60Q(range, textSelectionManager, r10);
        return 1;
    L5:
        return INSTANCE.fallbackOnLegacyTextField(gesture, r10);
    }

    private final void previewSelectGesture(LegacyTextFieldState $this$previewSelectGesture, SelectGesture gesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager == null) goto L5;
        textFieldSelectionManager.m1507setSelectionPreviewHighlight5zctL8$foundation_release(HandwritingGesture_androidKt.m1239access$getRangeForScreenRectOH9lIzo($this$previewSelectGesture, RectHelper_androidKt.toComposeRect(gesture.getSelectionArea()), m1234toTextGranularityNUwxegE(gesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()));
        return;
    }

    private final int performDeleteGesture(LegacyTextFieldState $this$performDeleteGesture, DeleteGesture gesture, AnnotatedString text, Function1<? super EditCommand, Unit> r12) {
        int granularity = m1234toTextGranularityNUwxegE(gesture.getGranularity());
        long range = HandwritingGesture_androidKt.m1239access$getRangeForScreenRectOH9lIzo($this$performDeleteGesture, RectHelper_androidKt.toComposeRect(gesture.getDeletionArea()), granularity, TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m6411getCollapsedimpl(range) == true) goto L5;
        m1232performDeletionOnLegacyTextFieldvJH6DeI(range, text, TextGranularity.m6375equalsimpl0(granularity, TextGranularity.Companion.m6380getWordDRrd7Zo()), r12);
        return 1;
    L5:
        return INSTANCE.fallbackOnLegacyTextField(gesture, r12);
    }

    private final void previewDeleteGesture(LegacyTextFieldState $this$previewDeleteGesture, DeleteGesture gesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager == null) goto L5;
        textFieldSelectionManager.m1506setDeletionPreviewHighlight5zctL8$foundation_release(HandwritingGesture_androidKt.m1239access$getRangeForScreenRectOH9lIzo($this$previewDeleteGesture, RectHelper_androidKt.toComposeRect(gesture.getDeletionArea()), m1234toTextGranularityNUwxegE(gesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()));
        return;
    }

    private final int performSelectRangeGesture(LegacyTextFieldState $this$performSelectRangeGesture, SelectRangeGesture gesture, TextFieldSelectionManager textSelectionManager, Function1<? super EditCommand, Unit> r10) {
        long range = HandwritingGesture_androidKt.m1241access$getRangeForScreenRectsO048IG0($this$performSelectRangeGesture, RectHelper_androidKt.toComposeRect(gesture.getSelectionStartArea()), RectHelper_androidKt.toComposeRect(gesture.getSelectionEndArea()), m1234toTextGranularityNUwxegE(gesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m6411getCollapsedimpl(range) == true) goto L5;
        m1233performSelectionOnLegacyTextField8ffj60Q(range, textSelectionManager, r10);
        return 1;
    L5:
        return INSTANCE.fallbackOnLegacyTextField(gesture, r10);
    }

    private final void previewSelectRangeGesture(LegacyTextFieldState $this$previewSelectRangeGesture, SelectRangeGesture gesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager == null) goto L5;
        textFieldSelectionManager.m1507setSelectionPreviewHighlight5zctL8$foundation_release(HandwritingGesture_androidKt.m1241access$getRangeForScreenRectsO048IG0($this$previewSelectRangeGesture, RectHelper_androidKt.toComposeRect(gesture.getSelectionStartArea()), RectHelper_androidKt.toComposeRect(gesture.getSelectionEndArea()), m1234toTextGranularityNUwxegE(gesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()));
        return;
    }

    private final int performDeleteRangeGesture(LegacyTextFieldState $this$performDeleteRangeGesture, DeleteRangeGesture gesture, AnnotatedString text, Function1<? super EditCommand, Unit> r12) {
        int granularity = m1234toTextGranularityNUwxegE(gesture.getGranularity());
        long range = HandwritingGesture_androidKt.m1241access$getRangeForScreenRectsO048IG0($this$performDeleteRangeGesture, RectHelper_androidKt.toComposeRect(gesture.getDeletionStartArea()), RectHelper_androidKt.toComposeRect(gesture.getDeletionEndArea()), granularity, TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m6411getCollapsedimpl(range) == true) goto L5;
        m1232performDeletionOnLegacyTextFieldvJH6DeI(range, text, TextGranularity.m6375equalsimpl0(granularity, TextGranularity.Companion.m6380getWordDRrd7Zo()), r12);
        return 1;
    L5:
        return INSTANCE.fallbackOnLegacyTextField(gesture, r12);
    }

    private final void previewDeleteRangeGesture(LegacyTextFieldState $this$previewDeleteRangeGesture, DeleteRangeGesture gesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager == null) goto L5;
        textFieldSelectionManager.m1506setDeletionPreviewHighlight5zctL8$foundation_release(HandwritingGesture_androidKt.m1241access$getRangeForScreenRectsO048IG0($this$previewDeleteRangeGesture, RectHelper_androidKt.toComposeRect(gesture.getDeletionStartArea()), RectHelper_androidKt.toComposeRect(gesture.getDeletionEndArea()), m1234toTextGranularityNUwxegE(gesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()));
        return;
    }

    private final int performJoinOrSplitGesture(LegacyTextFieldState $this$performJoinOrSplitGesture, JoinOrSplitGesture gesture, AnnotatedString text, ViewConfiguration viewConfiguration, Function1<? super EditCommand, Unit> r15) {
        if (viewConfiguration == null) goto L4;
        int offset = HandwritingGesture_androidKt.m1236access$getOffsetForHandwritingGestured4ec7I($this$performJoinOrSplitGesture, HandwritingGesture_androidKt.access$toOffset(gesture.getJoinOrSplitPoint()), viewConfiguration);
        if (offset == (-1)) goto L23;
        TextLayoutResultProxy r1 = $this$performJoinOrSplitGesture.getLayoutResult();
        boolean r2 = false;
        if (r1 == null) goto L14;
        TextLayoutResult r3 = r1.getValue();
        if (r3 == null) goto L14;
        if (HandwritingGesture_androidKt.access$isBiDiBoundary(r3, offset) != true) goto L14;
        r2 = true;
    L14:
        if (r2 == true) goto L23;
        long range = HandwritingGesture_androidKt.access$rangeOfWhitespaces(text, offset);
        if (TextRange.m6411getCollapsedimpl(range) == false) goto L19;
        performInsertionOnLegacyTextField(TextRange.m6417getStartimpl(range), " ", r15);
    L20:
        return 1;
    L19:
        m1232performDeletionOnLegacyTextFieldvJH6DeI(range, text, false, r15);
    L23:
        return fallbackOnLegacyTextField(gesture, r15);
    L4:
        return fallbackOnLegacyTextField(gesture, r15);
    }

    private final int performInsertGesture(LegacyTextFieldState $this$performInsertGesture, InsertGesture gesture, ViewConfiguration viewConfiguration, Function1<? super EditCommand, Unit> r8) {
        if (viewConfiguration == null) goto L4;
        int offset = HandwritingGesture_androidKt.m1236access$getOffsetForHandwritingGestured4ec7I($this$performInsertGesture, HandwritingGesture_androidKt.access$toOffset(gesture.getInsertionPoint()), viewConfiguration);
        if (offset == (-1)) goto L19;
        TextLayoutResultProxy r1 = $this$performInsertGesture.getLayoutResult();
        boolean r2 = false;
        if (r1 == null) goto L14;
        TextLayoutResult r3 = r1.getValue();
        if (r3 == null) goto L14;
        if (HandwritingGesture_androidKt.access$isBiDiBoundary(r3, offset) != true) goto L14;
        r2 = true;
    L14:
        if (r2 == true) goto L19;
        performInsertionOnLegacyTextField(offset, gesture.getTextToInsert(), r8);
        return 1;
    L19:
        return fallbackOnLegacyTextField(gesture, r8);
    L4:
        return fallbackOnLegacyTextField(gesture, r8);
    }

    private final int performRemoveSpaceGesture(LegacyTextFieldState $this$performRemoveSpaceGesture, RemoveSpaceGesture gesture, AnnotatedString text, ViewConfiguration viewConfiguration, Function1<? super EditCommand, Unit> r17) {
        TextLayoutResultProxy r1 = $this$performRemoveSpaceGesture.getLayoutResult();
        if (r1 == null) goto L5;
        TextLayoutResult r2 = r1.getValue();
    L6:
        long range = HandwritingGesture_androidKt.m1238access$getRangeForRemoveSpaceGesture5iVPX68(r2, HandwritingGesture_androidKt.access$toOffset(gesture.getStartPoint()), HandwritingGesture_androidKt.access$toOffset(gesture.getEndPoint()), $this$performRemoveSpaceGesture.getLayoutCoordinates(), viewConfiguration);
        if (TextRange.m6411getCollapsedimpl(range) == true) goto L9;
        final Ref.IntRef firstMatchStart = new Ref.IntRef();
        firstMatchStart.element = -1;
        final Ref.IntRef lastMatchEnd = new Ref.IntRef();
        lastMatchEnd.element = -1;
        String newText = new Regex("\\s+").replace(TextRangeKt.m6424substringFDrldGo(text, range), new HandwritingGestureApi34$performRemoveSpaceGesture$newText$2(firstMatchStart, lastMatchEnd));
        if (firstMatchStart.element == (-1)) goto L18;
        if (lastMatchEnd.element == (-1)) goto L18;
        int replacedRangeStart = TextRange.m6417getStartimpl(range) + firstMatchStart.element;
        int replacedRangeEnd = TextRange.m6417getStartimpl(range) + lastMatchEnd.element;
        String finalNewText = newText.substring(firstMatchStart.element, newText.length() - (TextRange.m6413getLengthimpl(range) - lastMatchEnd.element));
        Intrinsics.checkNotNullExpressionValue(finalNewText, "substring(...)");
        r17.invoke(HandwritingGesture_androidKt.access$compoundEditCommand(new EditCommand[]{new SetSelectionCommand(replacedRangeStart, replacedRangeEnd), new CommitTextCommand(finalNewText, 1)}));
        return 1;
    L18:
        return fallbackOnLegacyTextField(gesture, r17);
    L9:
        return INSTANCE.fallbackOnLegacyTextField(gesture, r17);
    L5:
        r2 = null;
        goto L6
    }

    private final void performInsertionOnLegacyTextField(int offset, String text, Function1<? super EditCommand, Unit> r6) {
        r6.invoke(HandwritingGesture_androidKt.access$compoundEditCommand(new EditCommand[]{new SetSelectionCommand(offset, offset), new CommitTextCommand(text, 1)}));
    }

    /* JADX INFO: renamed from: performSelectionOnLegacyTextField-8ffj60Q, reason: not valid java name */
    private final void m1233performSelectionOnLegacyTextField8ffj60Q(long range, TextFieldSelectionManager textSelectionManager, Function1<? super EditCommand, Unit> r7) {
        r7.invoke(new SetSelectionCommand(TextRange.m6417getStartimpl(range), TextRange.m6412getEndimpl(range)));
        if (textSelectionManager == null) goto L6;
        textSelectionManager.enterSelectionMode$foundation_release(true);
        return;
    }

    /* JADX INFO: renamed from: performDeletionOnLegacyTextField-vJH6DeI, reason: not valid java name */
    private final void m1232performDeletionOnLegacyTextFieldvJH6DeI(long range, AnnotatedString text, boolean adjustRange, Function1<? super EditCommand, Unit> r11) {
        if (adjustRange == false) goto L4;
        long finalRange = HandwritingGesture_androidKt.m1235access$adjustHandwritingDeleteGestureRange72CqOWE(range, text);
    L5:
        r11.invoke(HandwritingGesture_androidKt.access$compoundEditCommand(new EditCommand[]{new SetSelectionCommand(TextRange.m6412getEndimpl(finalRange), TextRange.m6412getEndimpl(finalRange)), new DeleteSurroundingTextCommand(TextRange.m6413getLengthimpl(finalRange), 0)}));
        return;
    L4:
        finalRange = range;
        goto L5
    }

    private final int fallbackOnLegacyTextField(HandwritingGesture gesture, Function1<? super EditCommand, Unit> r5) {
        String fallbackText = gesture.getFallbackText();
        if (fallbackText != null) goto L6;
        return 3;
    L6:
        r5.invoke(new CommitTextCommand(fallbackText, 1));
        return 5;
    }

    /* JADX INFO: renamed from: toTextGranularity-NUwxegE, reason: not valid java name */
    private final int m1234toTextGranularityNUwxegE(int $this$toTextGranularity_u2dNUwxegE) {
        switch($this$toTextGranularity_u2dNUwxegE) {
            case 1: goto L6;
            case 2: goto L8;
            default: goto L7;
        };
    L7:
        return TextGranularity.Companion.m6379getCharacterDRrd7Zo();
    L8:
        return TextGranularity.Companion.m6379getCharacterDRrd7Zo();
    L6:
        return TextGranularity.Companion.m6380getWordDRrd7Zo();
    }
}
