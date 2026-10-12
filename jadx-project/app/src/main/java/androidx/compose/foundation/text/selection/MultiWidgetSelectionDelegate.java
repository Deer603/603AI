package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextLayoutHelperKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: MultiWidgetSelectionDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000bH\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u000bH\u0016J%\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\b\u0010\u0012\u001a\u00020\u000bH\u0016J\n\u0010%\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u000bH\u0016J\u0010\u0010'\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u000bH\u0016J\u0010\u0010(\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u000bH\u0016J\u001d\u0010)\u001a\u00020*2\u0006\u0010\u001a\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,J\n\u0010-\u001a\u0004\u0018\u00010 H\u0016J\b\u0010.\u001a\u00020/H\u0016J\n\u00100\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u00020\u000b*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00061"}, d2 = {"Landroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegate;", "Landroidx/compose/foundation/text/selection/Selectable;", "selectableId", "", "coordinatesCallback", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutResultCallback", "Landroidx/compose/ui/text/TextLayoutResult;", "(JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "_previousLastVisibleOffset", "", "_previousTextLayoutResult", "lock", "", "getSelectableId", "()J", "lastVisibleOffset", "getLastVisibleOffset", "(Landroidx/compose/ui/text/TextLayoutResult;)I", "appendSelectableInfoToBuilder", "", "builder", "Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;", "getBoundingBox", "Landroidx/compose/ui/geometry/Rect;", "offset", "getCenterYForOffset", "", "getHandlePosition", "Landroidx/compose/ui/geometry/Offset;", "selection", "Landroidx/compose/foundation/text/selection/Selection;", "isStartHandle", "", "getHandlePosition-dBAh8RU", "(Landroidx/compose/foundation/text/selection/Selection;Z)J", "getLayoutCoordinates", "getLineHeight", "getLineLeft", "getLineRight", "getRangeOfLineContaining", "Landroidx/compose/ui/text/TextRange;", "getRangeOfLineContaining--jx7JFs", "(I)J", "getSelectAllSelection", "getText", "Landroidx/compose/ui/text/AnnotatedString;", "textLayoutResult", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MultiWidgetSelectionDelegate implements Selectable {
    public static final int $stable = 0;
    private int _previousLastVisibleOffset;
    private TextLayoutResult _previousTextLayoutResult;
    private final Function0<LayoutCoordinates> coordinatesCallback;
    private final Function0<TextLayoutResult> layoutResultCallback;
    private final Object lock;
    private final long selectableId;

    static {
        $stable = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MultiWidgetSelectionDelegate(long selectableId, Function0<? extends LayoutCoordinates> r4, Function0<TextLayoutResult> r5) {
        this.selectableId = selectableId;
        this.coordinatesCallback = r4;
        this.layoutResultCallback = r5;
        this.lock = this;
        this._previousLastVisibleOffset = -1;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public long getSelectableId() {
        return this.selectableId;
    }

    private final int getLastVisibleOffset(TextLayoutResult $this$lastVisibleOffset) {
        Object lock$iv = this.lock;
        monitor-enter(lock$iv);
    L23:
        th = move-exception;
        throw th;
    L6:
        if (this._previousTextLayoutResult != $this$lastVisibleOffset) goto L8;
    L20:
        int r5 = this._previousLastVisibleOffset;     // Catch: Throwable -> L23
        monitor-exit(lock$iv);
        return r5;
    L8:
        if ($this$lastVisibleOffset.getDidOverflowHeight() == true) goto L10;
    L18:
        int finalVisibleLine = $this$lastVisibleOffset.getLineCount();     // Catch: Throwable -> L23
        int lastVisibleLine = finalVisibleLine - 1;     // Catch: Throwable -> L23
    L19:
        this._previousLastVisibleOffset = $this$lastVisibleOffset.getLineEnd(lastVisibleLine, true);     // Catch: Throwable -> L23
        this._previousTextLayoutResult = $this$lastVisibleOffset;     // Catch: Throwable -> L23
        goto L20
    L10:
        if ($this$lastVisibleOffset.getMultiParagraph().getDidExceedMaxLines() == true) goto L18;
        long arg0$iv = $this$lastVisibleOffset.m6388getSizeYbymL2g();     // Catch: Throwable -> L23
        long r12 = 4294967295L;
        int finalVisibleLine2 = RangesKt.coerceAtMost($this$lastVisibleOffset.getLineForVerticalPosition((int) (arg0$iv & 4294967295L)), $this$lastVisibleOffset.getLineCount() - 1);     // Catch: Throwable -> L23
    L13:
        if (finalVisibleLine2 < 0) goto L17;
        float r7 = $this$lastVisibleOffset.getLineTop(finalVisibleLine2);     // Catch: Throwable -> L23
        long arg0$iv2 = $this$lastVisibleOffset.m6388getSizeYbymL2g();     // Catch: Throwable -> L23
        long r16 = r12;
        int $i$f$unpackInt2 = (int) (arg0$iv2 & r16);     // Catch: Throwable -> L23
        if (r7 < $i$f$unpackInt2) goto L17;
        finalVisibleLine2 = finalVisibleLine2 - 1;     // Catch: Throwable -> L23
        r12 = r16;
    L17:
        lastVisibleLine = RangesKt.coerceAtLeast(finalVisibleLine2, 0);     // Catch: Throwable -> L23
        goto L19
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public void appendSelectableInfoToBuilder(SelectionLayoutBuilder builder) {
        LayoutCoordinates layoutCoordinates = getLayoutCoordinates();
        if (layoutCoordinates != null) goto L5;
        return;
    L5:
        TextLayoutResult textLayoutResult = this.layoutResultCallback.invoke();
        if (textLayoutResult != null) goto L8;
        return;
    L8:
        long relativePosition = builder.getContainerCoordinates().mo5723localPositionOfR5De75A(layoutCoordinates, Offset.Companion.m4141getZeroF1C5BW0());
        long localPosition = Offset.m4129minusMKHz9U(builder.m1448getCurrentPositionF1C5BW0(), relativePosition);
        long $this$isUnspecified$iv = builder.m1449getPreviousHandlePositionF1C5BW0();
        if ((9223372034707292159L & $this$isUnspecified$iv) != InlineClassHelperKt.UnspecifiedPackedFloats) goto L11;
        boolean r7 = true;
    L12:
        if (r7 == false) goto L14;
        long localPreviousHandlePosition = Offset.Companion.m4140getUnspecifiedF1C5BW0();
    L15:
        MultiWidgetSelectionDelegateKt.m1435appendSelectableInfoParwq6A(builder, textLayoutResult, localPosition, localPreviousHandlePosition, getSelectableId());
        return;
    L14:
        localPreviousHandlePosition = Offset.m4129minusMKHz9U(builder.m1449getPreviousHandlePositionF1C5BW0(), relativePosition);
        goto L15
    L11:
        r7 = false;
        goto L12
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public Selection getSelectAllSelection() {
        TextLayoutResult textLayoutResult = this.layoutResultCallback.invoke();
        if (textLayoutResult != null) goto L6;
        return null;
    L6:
        int end = textLayoutResult.getLayoutInput().getText().length();
        return new Selection(new Selection.AnchorInfo(textLayoutResult.getBidiRunDirection(0), 0, getSelectableId()), new Selection.AnchorInfo(textLayoutResult.getBidiRunDirection(Math.max(end - 1, 0)), end, getSelectableId()), false);
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    /* JADX INFO: renamed from: getHandlePosition-dBAh8RU, reason: not valid java name */
    public long mo1433getHandlePositiondBAh8RU(Selection selection, boolean isStartHandle) {
        if (isStartHandle == true) goto L4;
    L5:
        if (isStartHandle == true) goto L11;
        if (selection.getEnd().getSelectableId() == getSelectableId()) goto L11;
    L9:
        return Offset.Companion.m4140getUnspecifiedF1C5BW0();
    L11:
        if (getLayoutCoordinates() == null) goto L13;
        TextLayoutResult textLayoutResult = this.layoutResultCallback.invoke();
        if (textLayoutResult == null) goto L17;
        if (isStartHandle == false) goto L20;
        Selection.AnchorInfo r1 = selection.getStart();
    L21:
        int offset = r1.getOffset();
        int coercedOffset = RangesKt.coerceIn(offset, 0, getLastVisibleOffset(textLayoutResult));
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(textLayoutResult, coercedOffset, isStartHandle, selection.getHandlesCrossed());
    L20:
        r1 = selection.getEnd();
        goto L21
    L17:
        return Offset.Companion.m4140getUnspecifiedF1C5BW0();
    L13:
        return Offset.Companion.m4140getUnspecifiedF1C5BW0();
    L4:
        if (selection.getStart().getSelectableId() != getSelectableId()) goto L9;
        goto L5
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public LayoutCoordinates getLayoutCoordinates() {
        LayoutCoordinates layoutCoordinates = this.coordinatesCallback.invoke();
        if (layoutCoordinates != null) goto L5;
        return null;
    L5:
        if (layoutCoordinates.isAttached() == false) goto L10;
        return layoutCoordinates;
    L10:
        return null;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public TextLayoutResult textLayoutResult() {
        return this.layoutResultCallback.invoke();
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public AnnotatedString getText() {
        TextLayoutResult textLayoutResult = this.layoutResultCallback.invoke();
        if (textLayoutResult != null) goto L7;
        return new AnnotatedString("", null, 2, null);
    L7:
        return textLayoutResult.getLayoutInput().getText();
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public Rect getBoundingBox(int offset) {
        TextLayoutResult textLayoutResult = this.layoutResultCallback.invoke();
        if (textLayoutResult == null) goto L5;
        int textLength = textLayoutResult.getLayoutInput().getText().length();
        if (textLength >= 1) goto L11;
        return Rect.Companion.getZero();
    L11:
        return textLayoutResult.getBoundingBox(RangesKt.coerceIn(offset, 0, textLength - 1));
    L5:
        return Rect.Companion.getZero();
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public float getLineLeft(int offset) {
        TextLayoutResult textLayoutResult = this.layoutResultCallback.invoke();
        if (textLayoutResult != null) goto L5;
        return -1.0f;
    L5:
        int line = textLayoutResult.getLineForOffset(offset);
        if (line < textLayoutResult.getLineCount()) goto L9;
        return -1.0f;
    L9:
        return textLayoutResult.getLineLeft(line);
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public float getLineRight(int offset) {
        TextLayoutResult textLayoutResult = this.layoutResultCallback.invoke();
        if (textLayoutResult != null) goto L5;
        return -1.0f;
    L5:
        int line = textLayoutResult.getLineForOffset(offset);
        if (line < textLayoutResult.getLineCount()) goto L9;
        return -1.0f;
    L9:
        return textLayoutResult.getLineRight(line);
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public float getCenterYForOffset(int offset) {
        TextLayoutResult textLayoutResult = this.layoutResultCallback.invoke();
        if (textLayoutResult != null) goto L5;
        return -1.0f;
    L5:
        int line = textLayoutResult.getLineForOffset(offset);
        if (line < textLayoutResult.getLineCount()) goto L8;
        return -1.0f;
    L8:
        float top = textLayoutResult.getLineTop(line);
        float bottom = textLayoutResult.getLineBottom(line);
        return ((bottom - top) / 2.0f) + top;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    /* JADX INFO: renamed from: getRangeOfLineContaining--jx7JFs, reason: not valid java name */
    public long mo1434getRangeOfLineContainingjx7JFs(int offset) {
        TextLayoutResult textLayoutResult = this.layoutResultCallback.invoke();
        if (textLayoutResult == null) goto L5;
        int visibleTextLength = getLastVisibleOffset(textLayoutResult);
        if (visibleTextLength < 1) goto L9;
        int line = textLayoutResult.getLineForOffset(RangesKt.coerceIn(offset, 0, visibleTextLength - 1));
        return TextRangeKt.TextRange(textLayoutResult.getLineStart(line), textLayoutResult.getLineEnd(line, true));
    L9:
        return TextRange.Companion.m6422getZerod9O1mEE();
    L5:
        return TextRange.Companion.m6422getZerod9O1mEE();
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public int getLastVisibleOffset() {
        TextLayoutResult textLayoutResult = this.layoutResultCallback.invoke();
        if (textLayoutResult != null) goto L7;
        return 0;
    L7:
        return getLastVisibleOffset(textLayoutResult);
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public float getLineHeight(int offset) {
        TextLayoutResult r0 = this.layoutResultCallback.invoke();
        if (r0 != null) goto L7;
        return 0.0f;
    L7:
        return TextLayoutHelperKt.getLineHeight(r0, offset);
    }
}
