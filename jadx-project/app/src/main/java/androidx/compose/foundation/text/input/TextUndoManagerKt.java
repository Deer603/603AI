package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.UndoManagerKt;
import androidx.compose.foundation.text.input.internal.undo.TextDeleteType;
import androidx.compose.foundation.text.input.internal.undo.TextEditType;
import androidx.compose.foundation.text.input.internal.undo.TextUndoOperation;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TextUndoManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0004*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0000\u001a.\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0003H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0002\u001a\u00020\u0003*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u0011"}, d2 = {"TEXT_UNDO_CAPACITY", "", "isNewLineInsert", "", "Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;", "(Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;)Z", "merge", "next", "recordChanges", "", "Landroidx/compose/foundation/text/input/TextUndoManager;", "pre", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "post", "changes", "Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "allowMerge", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextUndoManagerKt {
    private static final int TEXT_UNDO_CAPACITY = 100;

    public static final TextUndoOperation merge(TextUndoOperation $this$merge, TextUndoOperation next) {
        if ($this$merge.getCanMerge() == true) goto L5;
    L45:
        return null;
    L5:
        if (next.getCanMerge() == false) goto L45;
        if (next.getTimeInMillis() >= $this$merge.getTimeInMillis()) goto L10;
    L44:
        return null;
    L10:
        if ((next.getTimeInMillis() - $this$merge.getTimeInMillis()) >= UndoManagerKt.getSNAPSHOTS_INTERVAL_MILLIS()) goto L44;
        if (isNewLineInsert($this$merge) == false) goto L15;
    L43:
        return null;
    L15:
        if (isNewLineInsert(next) == true) goto L43;
        if ($this$merge.getTextEditType() == next.getTextEditType()) goto L21;
        return null;
    L21:
        if ($this$merge.getTextEditType() != TextEditType.Insert) goto L27;
        if (($this$merge.getIndex() + $this$merge.getPostText().length()) != next.getIndex()) goto L27;
        return new TextUndoOperation($this$merge.getIndex(), "", $this$merge.getPostText() + next.getPostText(), $this$merge.m1382getPreSelectiond9O1mEE(), next.m1381getPostSelectiond9O1mEE(), $this$merge.getTimeInMillis(), false, 64, null);
    L27:
        if ($this$merge.getTextEditType() == TextEditType.Delete) goto L29;
    L42:
        return null;
    L29:
        if ($this$merge.getDeletionType() != next.getDeletionType()) goto L42;
        if ($this$merge.getDeletionType() == TextDeleteType.Start) goto L35;
        if ($this$merge.getDeletionType() != TextDeleteType.End) goto L42;
    L35:
        if ($this$merge.getIndex() != (next.getIndex() + next.getPreText().length())) goto L39;
        return new TextUndoOperation(next.getIndex(), next.getPreText() + $this$merge.getPreText(), "", $this$merge.m1382getPreSelectiond9O1mEE(), next.m1381getPostSelectiond9O1mEE(), $this$merge.getTimeInMillis(), false, 64, null);
    L39:
        if ($this$merge.getIndex() != next.getIndex()) goto L42;
        return new TextUndoOperation($this$merge.getIndex(), $this$merge.getPreText() + next.getPreText(), "", $this$merge.m1382getPreSelectiond9O1mEE(), next.m1381getPostSelectiond9O1mEE(), $this$merge.getTimeInMillis(), false, 64, null);
    }

    public static /* synthetic */ void recordChanges$default(TextUndoManager r0, TextFieldCharSequence r1, TextFieldCharSequence r2, TextFieldBuffer.ChangeList r3, boolean r4, int r5, Object r6) {
        if ((r5 & 8) == 0) goto L5;
        r4 = true;
    L5:
        recordChanges(r0, r1, r2, r3, r4);
    }

    public static final void recordChanges(TextUndoManager $this$recordChanges, TextFieldCharSequence pre, TextFieldCharSequence post, TextFieldBuffer.ChangeList changes, boolean allowMerge) {
        if (changes.getChangeCount() <= 1) goto L6;
        $this$recordChanges.record(new TextUndoOperation(0, pre.toString(), post.toString(), pre.m1188getSelectiond9O1mEE(), post.m1188getSelectiond9O1mEE(), 0, false, 32, null));
        return;
    L6:
        if (changes.getChangeCount() != 1) goto L15;
        long preRange = changes.mo1184getOriginalRangejx7JFs(0);
        long postRange = changes.mo1185getRangejx7JFs(0);
        if (TextRange.m6411getCollapsedimpl(preRange) == true) goto L10;
    L12:
        $this$recordChanges.record(new TextUndoOperation(TextRange.m6415getMinimpl(preRange), TextRangeKt.m6424substringFDrldGo(pre, preRange), TextRangeKt.m6424substringFDrldGo(post, postRange), pre.m1188getSelectiond9O1mEE(), post.m1188getSelectiond9O1mEE(), 0, allowMerge, 32, null));
        return;
    L10:
        if (TextRange.m6411getCollapsedimpl(postRange) == false) goto L12;
        return;
    }

    private static final boolean isNewLineInsert(TextUndoOperation $this$isNewLineInsert) {
        if (Intrinsics.areEqual($this$isNewLineInsert.getPostText(), "\n") == false) goto L5;
    L8:
        return true;
    L5:
        if (Intrinsics.areEqual($this$isNewLineInsert.getPostText(), "\r\n") == true) goto L8;
        return false;
    }
}
