package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: TextPreparedSelection.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u0000 W2\u00020\u0001:\u0001WB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ,\u0010$\u001a\u00020\u00002\b\b\u0002\u0010%\u001a\u00020\u00072\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020(0'¢\u0006\u0002\b)H\u0082\bJ\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0002J\u001f\u0010-\u001a\u00020\u00002\u0017\u0010.\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020(0'¢\u0006\u0002\b)J\u001f\u0010/\u001a\u00020\u00002\u0017\u0010.\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020(0'¢\u0006\u0002\b)J\u0006\u00100\u001a\u00020\u0000J\u0006\u00101\u001a\u00020\u0000J\u0006\u00102\u001a\u00020+J\u0006\u00103\u001a\u00020+J\b\u00104\u001a\u00020\u0007H\u0002J\u0010\u00105\u001a\u00020+2\u0006\u00106\u001a\u00020+H\u0002J\u0006\u00107\u001a\u00020\u0000J\u0006\u00108\u001a\u00020\u0000J\u0006\u00109\u001a\u00020\u0000J\u0006\u0010:\u001a\u00020\u0000J\u0006\u0010;\u001a\u00020\u0000J\u0006\u0010<\u001a\u00020\u0000J\u0006\u0010=\u001a\u00020\u0000J\u0006\u0010>\u001a\u00020\u0000J\u0006\u0010?\u001a\u00020\u0000J\u0006\u0010@\u001a\u00020\u0000J\u0006\u0010A\u001a\u00020\u0000J\u0006\u0010B\u001a\u00020\u0000J!\u0010C\u001a\u00020\u00002\b\b\u0002\u0010%\u001a\u00020\u00072\f\u0010D\u001a\b\u0012\u0004\u0012\u00020+0EH\u0082\bJ\u0006\u0010F\u001a\u00020\u0000J\u0006\u0010G\u001a\u00020\u0000J\u0006\u0010H\u001a\u00020\u0000J\u0006\u0010I\u001a\u00020\u0000J\u0006\u0010J\u001a\u00020\u0000J\u0006\u0010K\u001a\u00020\u0000J\u0006\u0010L\u001a\u00020\u0000J\u0006\u0010M\u001a\u00020\u0000J\u0006\u0010N\u001a\u00020\u0000J\u0006\u0010O\u001a\u00020\u0000J\u0016\u0010P\u001a\u00020+*\u00020\u00052\b\b\u0002\u0010Q\u001a\u00020+H\u0002J\u0016\u0010R\u001a\u00020+*\u00020\u00052\b\b\u0002\u0010Q\u001a\u00020+H\u0002J\u0017\u0010S\u001a\u00020+*\u00020\u00052\b\b\u0002\u0010Q\u001a\u00020+H\u0082\u0010J\u0017\u0010T\u001a\u00020+*\u00020\u00052\b\b\u0002\u0010Q\u001a\u00020+H\u0082\u0010J\u0014\u0010U\u001a\u00020+*\u00020\u00052\u0006\u0010V\u001a\u00020+H\u0002R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0015\u001a\u00020\u0016X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006X"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;", "", "state", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "isFromSoftKeyboard", "", "visibleTextLayoutHeight", "", "textPreparedSelectionState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextLayoutResult;ZFLandroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;)V", "initialValue", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "getInitialValue", "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "initialWedgeAffinity", "Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;", "getInitialWedgeAffinity", "()Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;", "selection", "Landroidx/compose/ui/text/TextRange;", "getSelection-d9O1mEE", "()J", "setSelection-5zc-tL8", "(J)V", "J", "text", "", "wedgeAffinity", "Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "getWedgeAffinity", "()Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "setWedgeAffinity", "(Landroidx/compose/foundation/text/input/internal/WedgeAffinity;)V", "applyIfNotEmpty", "resetCachedX", "block", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "charOffset", "", "offset", "collapseLeftOr", "or", "collapseRightOr", "deleteMovement", "deselect", "getNextCharacterIndex", "getPrecedingCharacterIndex", "isLtr", "jumpByPagesOffset", "pagesAmount", "moveCursorDownByLine", "moveCursorDownByPage", "moveCursorLeftByChar", "moveCursorLeftByWord", "moveCursorNextByChar", "moveCursorNextByParagraph", "moveCursorNextByWord", "moveCursorPrevByChar", "moveCursorPrevByParagraph", "moveCursorPrevByWord", "moveCursorRightByChar", "moveCursorRightByWord", "moveCursorTo", "proposedCursorMovement", "Lkotlin/Function0;", "moveCursorToEnd", "moveCursorToHome", "moveCursorToLineEnd", "moveCursorToLineLeftSide", "moveCursorToLineRightSide", "moveCursorToLineStart", "moveCursorUpByLine", "moveCursorUpByPage", "selectAll", "selectMovement", "getLineEndByOffsetForLayout", "currentOffset", "getLineStartByOffsetForLayout", "getNextWordOffsetForLayout", "getPrevWordOffsetForLayout", "jumpByLinesOffset", "linesAmount", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextFieldPreparedSelection {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    public static final int NoCharacterFound = -1;
    private final TextFieldCharSequence initialValue;
    private final SelectionWedgeAffinity initialWedgeAffinity;
    private final boolean isFromSoftKeyboard;
    private long selection;
    private final TransformedTextFieldState state;
    private final String text;
    private final TextLayoutResult textLayoutResult;
    private final TextFieldPreparedSelectionState textPreparedSelectionState;
    private final float visibleTextLayoutHeight;
    private WedgeAffinity wedgeAffinity;

    /* JADX INFO: compiled from: TextPreparedSelection.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection$Companion;", "", "()V", "NoCharacterFound", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
    }

    public TextFieldPreparedSelection(TransformedTextFieldState state, TextLayoutResult textLayoutResult, boolean isFromSoftKeyboard, float visibleTextLayoutHeight, TextFieldPreparedSelectionState textPreparedSelectionState) {
        this.state = state;
        this.textLayoutResult = textLayoutResult;
        this.isFromSoftKeyboard = isFromSoftKeyboard;
        this.visibleTextLayoutHeight = visibleTextLayoutHeight;
        this.textPreparedSelectionState = textPreparedSelectionState;
        Snapshot.Companion this_$iv = Snapshot.Companion;
        Snapshot previousSnapshot$iv = this_$iv.getCurrentThreadSnapshot();
        if (previousSnapshot$iv == null) goto L5;
        Function1<Object, Unit> r3 = previousSnapshot$iv.getReadObserver();
    L6:
        Snapshot newSnapshot$iv = this_$iv.makeCurrentNonObservable(previousSnapshot$iv);
        this.initialValue = this.state.getVisualText();     // Catch: Throwable -> L10
        this.initialWedgeAffinity = this.state.getSelectionWedgeAffinity();     // Catch: Throwable -> L10
        Unit r5 = Unit.INSTANCE;     // Catch: Throwable -> L10
        this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, r3);
        this.selection = this.initialValue.m1188getSelectiond9O1mEE();
        this.text = this.initialValue.getText().toString();
        return;
    L10:
        th = move-exception;
        this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, r3);
        throw th;
    L5:
        r3 = null;
        goto L6
    }

    public static final /* synthetic */ TransformedTextFieldState access$getState$p(TextFieldPreparedSelection $this) {
        return $this.state;
    }

    public static final /* synthetic */ String access$getText$p(TextFieldPreparedSelection $this) {
        return $this.text;
    }

    public static final /* synthetic */ TextFieldPreparedSelectionState access$getTextPreparedSelectionState$p(TextFieldPreparedSelection $this) {
        return $this.textPreparedSelectionState;
    }

    public final TextFieldCharSequence getInitialValue() {
        return this.initialValue;
    }

    public final SelectionWedgeAffinity getInitialWedgeAffinity() {
        return this.initialWedgeAffinity;
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m1350getSelectiond9O1mEE() {
        return this.selection;
    }

    /* JADX INFO: renamed from: setSelection-5zc-tL8, reason: not valid java name */
    public final void m1351setSelection5zctL8(long r1) {
        this.selection = r1;
    }

    public final WedgeAffinity getWedgeAffinity() {
        return this.wedgeAffinity;
    }

    public final void setWedgeAffinity(WedgeAffinity r1) {
        this.wedgeAffinity = r1;
    }

    static /* synthetic */ TextFieldPreparedSelection applyIfNotEmpty$default(TextFieldPreparedSelection $this, boolean resetCachedX, Function1 block, int r4, Object r5) {
        boolean r6 = true;
        if ((r4 & 1) == 0) goto L6;
        resetCachedX = true;
    L6:
        if (resetCachedX == false) goto L9;
        access$getTextPreparedSelectionState$p($this).resetCachedX();
    L9:
        if (access$getText$p($this).length() > 0) goto L12;
        r6 = false;
    L12:
        if (r6 == false) goto L14;
        block.invoke($this);
    L14:
        return $this;
    }

    private final TextFieldPreparedSelection applyIfNotEmpty(boolean resetCachedX, Function1<? super TextFieldPreparedSelection, Unit> r4) {
        if (resetCachedX == false) goto L6;
        access$getTextPreparedSelectionState$p(this).resetCachedX();
    L6:
        if (access$getText$p(this).length() <= 0) goto L8;
        boolean r1 = true;
    L9:
        if (r1 == false) goto L11;
        r4.invoke(this);
    L11:
        return this;
    L8:
        r1 = false;
        goto L9
    }

    public final TextFieldPreparedSelection selectAll() {
        access$getTextPreparedSelectionState$p(this).resetCachedX();
        if (access$getText$p(this).length() <= 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L9;
        TextFieldPreparedSelection $this$selectAll_u24lambda_u241 = this;
        $this$selectAll_u24lambda_u241.selection = TextRangeKt.TextRange(0, $this$selectAll_u24lambda_u241.text.length());
    L9:
        return this;
    L5:
        r2 = false;
        goto L6
    }

    public final TextFieldPreparedSelection deselect() {
        access$getTextPreparedSelectionState$p(this).resetCachedX();
        if (access$getText$p(this).length() <= 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L9;
        TextFieldPreparedSelection $this$deselect_u24lambda_u242 = this;
        $this$deselect_u24lambda_u242.selection = TextRangeKt.TextRange(TextRange.m6412getEndimpl($this$deselect_u24lambda_u242.selection));
    L9:
        return this;
    L5:
        r2 = false;
        goto L6
    }

    public final TextFieldPreparedSelection moveCursorLeftByChar() {
        if (isLtr() == false) goto L6;
        return moveCursorPrevByChar();
    L6:
        return moveCursorNextByChar();
    }

    public final TextFieldPreparedSelection moveCursorRightByChar() {
        if (isLtr() == false) goto L6;
        return moveCursorNextByChar();
    L6:
        return moveCursorPrevByChar();
    }

    public final TextFieldPreparedSelection collapseLeftOr(Function1<? super TextFieldPreparedSelection, Unit> r8) {
        access$getTextPreparedSelectionState$p(this).resetCachedX();
        if (access$getText$p(this).length() <= 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L16;
        TextFieldPreparedSelection $this$collapseLeftOr_u24lambda_u243 = this;
        if (TextRange.m6411getCollapsedimpl($this$collapseLeftOr_u24lambda_u243.selection) == false) goto L10;
        r8.invoke($this$collapseLeftOr_u24lambda_u243);
        goto L16
    L10:
        boolean r4 = $this$collapseLeftOr_u24lambda_u243.isLtr();
        long r5 = $this$collapseLeftOr_u24lambda_u243.selection;
        if (r4 == false) goto L13;
        $this$collapseLeftOr_u24lambda_u243.selection = TextRangeKt.TextRange(TextRange.m6415getMinimpl(r5));
        goto L16
    L13:
        $this$collapseLeftOr_u24lambda_u243.selection = TextRangeKt.TextRange(TextRange.m6414getMaximpl(r5));
    L16:
        return this;
    L5:
        r2 = false;
        goto L6
    }

    public final TextFieldPreparedSelection collapseRightOr(Function1<? super TextFieldPreparedSelection, Unit> r8) {
        access$getTextPreparedSelectionState$p(this).resetCachedX();
        if (access$getText$p(this).length() <= 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L16;
        TextFieldPreparedSelection $this$collapseRightOr_u24lambda_u244 = this;
        if (TextRange.m6411getCollapsedimpl($this$collapseRightOr_u24lambda_u244.selection) == false) goto L10;
        r8.invoke($this$collapseRightOr_u24lambda_u244);
        goto L16
    L10:
        boolean r4 = $this$collapseRightOr_u24lambda_u244.isLtr();
        long r5 = $this$collapseRightOr_u24lambda_u244.selection;
        if (r4 == false) goto L13;
        $this$collapseRightOr_u24lambda_u244.selection = TextRangeKt.TextRange(TextRange.m6414getMaximpl(r5));
        goto L16
    L13:
        $this$collapseRightOr_u24lambda_u244.selection = TextRangeKt.TextRange(TextRange.m6415getMinimpl(r5));
    L16:
        return this;
    L5:
        r2 = false;
        goto L6
    }

    public final int getPrecedingCharacterIndex() {
        return StringHelpers_androidKt.findPrecedingBreak(this.text, TextRange.m6412getEndimpl(this.selection));
    }

    public final int getNextCharacterIndex() {
        return StringHelpers_androidKt.findFollowingBreak(this.text, TextRange.m6412getEndimpl(this.selection));
    }

    static /* synthetic */ TextFieldPreparedSelection moveCursorTo$default(TextFieldPreparedSelection $this, boolean resetCachedX, Function0 proposedCursorMovement, int r12, Object r13) {
        boolean r14 = true;
        if ((r12 & 1) == 0) goto L6;
        resetCachedX = true;
    L6:
        if (resetCachedX == false) goto L9;
        access$getTextPreparedSelectionState$p($this).resetCachedX();
    L9:
        if (access$getText$p($this).length() > 0) goto L12;
        r14 = false;
    L12:
        if (r14 == false) goto L22;
        int oldCursor = TextRange.m6412getEndimpl($this.m1350getSelectiond9O1mEE());
        long r4 = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(((Number) proposedCursorMovement.invoke()).intValue(), oldCursor, access$getState$p($this));
        int newCursor = CursorAndWedgeAffinity.m1324component1impl(r4);
        WedgeAffinity newWedgeAffinity = CursorAndWedgeAffinity.m1325component2impl(r4);
        if (newCursor == oldCursor) goto L16;
    L17:
        $this.m1351setSelection5zctL8(TextRangeKt.TextRange(newCursor));
    L18:
        if (newWedgeAffinity == null) goto L22;
        $this.setWedgeAffinity(newWedgeAffinity);
        goto L22
    L16:
        if (TextRange.m6411getCollapsedimpl($this.m1350getSelectiond9O1mEE()) == true) goto L18;
    L22:
        return $this;
    }

    private final TextFieldPreparedSelection moveCursorTo(boolean resetCachedX, Function0<Integer> r13) {
        if (resetCachedX == false) goto L6;
        access$getTextPreparedSelectionState$p(this).resetCachedX();
    L6:
        if (access$getText$p(this).length() <= 0) goto L8;
        boolean r3 = true;
    L9:
        if (r3 == false) goto L19;
        TextFieldPreparedSelection $this$moveCursorTo_u24lambda_u245 = this;
        int oldCursor = TextRange.m6412getEndimpl($this$moveCursorTo_u24lambda_u245.m1350getSelectiond9O1mEE());
        long r6 = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(r13.invoke().intValue(), oldCursor, access$getState$p($this$moveCursorTo_u24lambda_u245));
        int newCursor = CursorAndWedgeAffinity.m1324component1impl(r6);
        WedgeAffinity newWedgeAffinity = CursorAndWedgeAffinity.m1325component2impl(r6);
        if (newCursor == oldCursor) goto L13;
    L14:
        $this$moveCursorTo_u24lambda_u245.m1351setSelection5zctL8(TextRangeKt.TextRange(newCursor));
    L15:
        if (newWedgeAffinity == null) goto L19;
        $this$moveCursorTo_u24lambda_u245.setWedgeAffinity(newWedgeAffinity);
        goto L19
    L13:
        if (TextRange.m6411getCollapsedimpl($this$moveCursorTo_u24lambda_u245.m1350getSelectiond9O1mEE()) == true) goto L15;
    L19:
        return this;
    L8:
        r3 = false;
        goto L9
    }

    public final TextFieldPreparedSelection moveCursorPrevByChar() {
        access$getTextPreparedSelectionState$p(this).resetCachedX();
        if (access$getText$p(this).length() <= 0) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == false) goto L16;
        TextFieldPreparedSelection $this$moveCursorTo_u24lambda_u245$iv = this;
        int oldCursor$iv = TextRange.m6412getEndimpl($this$moveCursorTo_u24lambda_u245$iv.m1350getSelectiond9O1mEE());
        long r7 = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(StringHelpers_androidKt.findPrecedingBreak(this.text, TextRange.m6412getEndimpl(this.selection)), oldCursor$iv, access$getState$p($this$moveCursorTo_u24lambda_u245$iv));
        int newCursor$iv = CursorAndWedgeAffinity.m1324component1impl(r7);
        WedgeAffinity newWedgeAffinity$iv = CursorAndWedgeAffinity.m1325component2impl(r7);
        if (newCursor$iv == oldCursor$iv) goto L10;
    L11:
        $this$moveCursorTo_u24lambda_u245$iv.m1351setSelection5zctL8(TextRangeKt.TextRange(newCursor$iv));
    L12:
        if (newWedgeAffinity$iv == null) goto L16;
        $this$moveCursorTo_u24lambda_u245$iv.setWedgeAffinity(newWedgeAffinity$iv);
        goto L16
    L10:
        if (TextRange.m6411getCollapsedimpl($this$moveCursorTo_u24lambda_u245$iv.m1350getSelectiond9O1mEE()) == true) goto L12;
    L16:
        return this;
    L5:
        r4 = false;
        goto L6
    }

    public final TextFieldPreparedSelection moveCursorNextByChar() {
        access$getTextPreparedSelectionState$p(this).resetCachedX();
        if (access$getText$p(this).length() <= 0) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == false) goto L16;
        TextFieldPreparedSelection $this$moveCursorTo_u24lambda_u245$iv = this;
        int oldCursor$iv = TextRange.m6412getEndimpl($this$moveCursorTo_u24lambda_u245$iv.m1350getSelectiond9O1mEE());
        long r7 = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(StringHelpers_androidKt.findFollowingBreak(this.text, TextRange.m6412getEndimpl(this.selection)), oldCursor$iv, access$getState$p($this$moveCursorTo_u24lambda_u245$iv));
        int newCursor$iv = CursorAndWedgeAffinity.m1324component1impl(r7);
        WedgeAffinity newWedgeAffinity$iv = CursorAndWedgeAffinity.m1325component2impl(r7);
        if (newCursor$iv == oldCursor$iv) goto L10;
    L11:
        $this$moveCursorTo_u24lambda_u245$iv.m1351setSelection5zctL8(TextRangeKt.TextRange(newCursor$iv));
    L12:
        if (newWedgeAffinity$iv == null) goto L16;
        $this$moveCursorTo_u24lambda_u245$iv.setWedgeAffinity(newWedgeAffinity$iv);
        goto L16
    L10:
        if (TextRange.m6411getCollapsedimpl($this$moveCursorTo_u24lambda_u245$iv.m1350getSelectiond9O1mEE()) == true) goto L12;
    L16:
        return this;
    L5:
        r4 = false;
        goto L6
    }

    public final TextFieldPreparedSelection moveCursorToHome() {
        access$getTextPreparedSelectionState$p(this).resetCachedX();
        if (access$getText$p(this).length() <= 0) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == false) goto L16;
        TextFieldPreparedSelection $this$moveCursorTo_u24lambda_u245$iv = this;
        int oldCursor$iv = TextRange.m6412getEndimpl($this$moveCursorTo_u24lambda_u245$iv.m1350getSelectiond9O1mEE());
        long r8 = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(0, oldCursor$iv, access$getState$p($this$moveCursorTo_u24lambda_u245$iv));
        int newCursor$iv = CursorAndWedgeAffinity.m1324component1impl(r8);
        WedgeAffinity newWedgeAffinity$iv = CursorAndWedgeAffinity.m1325component2impl(r8);
        if (newCursor$iv == oldCursor$iv) goto L10;
    L11:
        $this$moveCursorTo_u24lambda_u245$iv.m1351setSelection5zctL8(TextRangeKt.TextRange(newCursor$iv));
    L12:
        if (newWedgeAffinity$iv == null) goto L16;
        $this$moveCursorTo_u24lambda_u245$iv.setWedgeAffinity(newWedgeAffinity$iv);
        goto L16
    L10:
        if (TextRange.m6411getCollapsedimpl($this$moveCursorTo_u24lambda_u245$iv.m1350getSelectiond9O1mEE()) == true) goto L12;
    L16:
        return this;
    L5:
        r4 = false;
        goto L6
    }

    public final TextFieldPreparedSelection moveCursorToEnd() {
        access$getTextPreparedSelectionState$p(this).resetCachedX();
        if (access$getText$p(this).length() <= 0) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == false) goto L16;
        TextFieldPreparedSelection $this$moveCursorTo_u24lambda_u245$iv = this;
        int oldCursor$iv = TextRange.m6412getEndimpl($this$moveCursorTo_u24lambda_u245$iv.m1350getSelectiond9O1mEE());
        long r7 = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(this.text.length(), oldCursor$iv, access$getState$p($this$moveCursorTo_u24lambda_u245$iv));
        int newCursor$iv = CursorAndWedgeAffinity.m1324component1impl(r7);
        WedgeAffinity newWedgeAffinity$iv = CursorAndWedgeAffinity.m1325component2impl(r7);
        if (newCursor$iv == oldCursor$iv) goto L10;
    L11:
        $this$moveCursorTo_u24lambda_u245$iv.m1351setSelection5zctL8(TextRangeKt.TextRange(newCursor$iv));
    L12:
        if (newWedgeAffinity$iv == null) goto L16;
        $this$moveCursorTo_u24lambda_u245$iv.setWedgeAffinity(newWedgeAffinity$iv);
        goto L16
    L10:
        if (TextRange.m6411getCollapsedimpl($this$moveCursorTo_u24lambda_u245$iv.m1350getSelectiond9O1mEE()) == true) goto L12;
    L16:
        return this;
    L5:
        r4 = false;
        goto L6
    }

    public final TextFieldPreparedSelection moveCursorLeftByWord() {
        if (isLtr() == false) goto L6;
        return moveCursorPrevByWord();
    L6:
        return moveCursorNextByWord();
    }

    public final TextFieldPreparedSelection moveCursorRightByWord() {
        if (isLtr() == false) goto L6;
        return moveCursorNextByWord();
    L6:
        return moveCursorPrevByWord();
    }

    public final TextFieldPreparedSelection moveCursorNextByWord() {
        access$getTextPreparedSelectionState$p(this).resetCachedX();
        if (access$getText$p(this).length() <= 0) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == false) goto L20;
        TextFieldPreparedSelection $this$moveCursorTo_u24lambda_u245$iv = this;
        int oldCursor$iv = TextRange.m6412getEndimpl($this$moveCursorTo_u24lambda_u245$iv.m1350getSelectiond9O1mEE());
        TextLayoutResult r10 = this.textLayoutResult;
        if (r10 == null) goto L10;
        int r5 = getNextWordOffsetForLayout$default(this, r10, 0, 1, null);
    L11:
        long r6 = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(r5, oldCursor$iv, access$getState$p($this$moveCursorTo_u24lambda_u245$iv));
        int newCursor$iv = CursorAndWedgeAffinity.m1324component1impl(r6);
        WedgeAffinity newWedgeAffinity$iv = CursorAndWedgeAffinity.m1325component2impl(r6);
        if (newCursor$iv == oldCursor$iv) goto L14;
    L15:
        $this$moveCursorTo_u24lambda_u245$iv.m1351setSelection5zctL8(TextRangeKt.TextRange(newCursor$iv));
    L16:
        if (newWedgeAffinity$iv == null) goto L20;
        $this$moveCursorTo_u24lambda_u245$iv.setWedgeAffinity(newWedgeAffinity$iv);
        goto L20
    L14:
        if (TextRange.m6411getCollapsedimpl($this$moveCursorTo_u24lambda_u245$iv.m1350getSelectiond9O1mEE()) == true) goto L16;
    L10:
        r5 = this.text.length();
    L20:
        return this;
    L5:
        r4 = false;
        goto L6
    }

    public final TextFieldPreparedSelection moveCursorPrevByWord() {
        access$getTextPreparedSelectionState$p(this).resetCachedX();
        int r6 = 0;
        if (access$getText$p(this).length() <= 0) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == false) goto L19;
        TextFieldPreparedSelection $this$moveCursorTo_u24lambda_u245$iv = this;
        int oldCursor$iv = TextRange.m6412getEndimpl($this$moveCursorTo_u24lambda_u245$iv.m1350getSelectiond9O1mEE());
        TextLayoutResult r10 = this.textLayoutResult;
        if (r10 == null) goto L10;
        r6 = getPrevWordOffsetForLayout$default(this, r10, 0, 1, null);
    L10:
        long r5 = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(r6, oldCursor$iv, access$getState$p($this$moveCursorTo_u24lambda_u245$iv));
        int newCursor$iv = CursorAndWedgeAffinity.m1324component1impl(r5);
        WedgeAffinity newWedgeAffinity$iv = CursorAndWedgeAffinity.m1325component2impl(r5);
        if (newCursor$iv == oldCursor$iv) goto L13;
    L14:
        $this$moveCursorTo_u24lambda_u245$iv.m1351setSelection5zctL8(TextRangeKt.TextRange(newCursor$iv));
    L15:
        if (newWedgeAffinity$iv == null) goto L19;
        $this$moveCursorTo_u24lambda_u245$iv.setWedgeAffinity(newWedgeAffinity$iv);
        goto L19
    L13:
        if (TextRange.m6411getCollapsedimpl($this$moveCursorTo_u24lambda_u245$iv.m1350getSelectiond9O1mEE()) == true) goto L15;
    L19:
        return this;
    L5:
        r4 = false;
        goto L6
    }

    public final TextFieldPreparedSelection moveCursorPrevByParagraph() {
        access$getTextPreparedSelectionState$p(this).resetCachedX();
        if (access$getText$p(this).length() <= 0) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == false) goto L20;
        TextFieldPreparedSelection $this$moveCursorTo_u24lambda_u245$iv = this;
        int oldCursor$iv = TextRange.m6412getEndimpl($this$moveCursorTo_u24lambda_u245$iv.m1350getSelectiond9O1mEE());
        int paragraphStart = StringHelpersKt.findParagraphStart(this.text, TextRange.m6415getMinimpl(this.selection));
        if (paragraphStart != TextRange.m6415getMinimpl(this.selection)) goto L11;
        if (paragraphStart == 0) goto L11;
        paragraphStart = StringHelpersKt.findParagraphStart(this.text, paragraphStart - 1);
    L11:
        long r7 = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(paragraphStart, oldCursor$iv, access$getState$p($this$moveCursorTo_u24lambda_u245$iv));
        int newCursor$iv = CursorAndWedgeAffinity.m1324component1impl(r7);
        WedgeAffinity newWedgeAffinity$iv = CursorAndWedgeAffinity.m1325component2impl(r7);
        if (newCursor$iv == oldCursor$iv) goto L14;
    L15:
        $this$moveCursorTo_u24lambda_u245$iv.m1351setSelection5zctL8(TextRangeKt.TextRange(newCursor$iv));
    L16:
        if (newWedgeAffinity$iv == null) goto L20;
        $this$moveCursorTo_u24lambda_u245$iv.setWedgeAffinity(newWedgeAffinity$iv);
        goto L20
    L14:
        if (TextRange.m6411getCollapsedimpl($this$moveCursorTo_u24lambda_u245$iv.m1350getSelectiond9O1mEE()) == true) goto L16;
    L20:
        return this;
    L5:
        r4 = false;
        goto L6
    }

    public final TextFieldPreparedSelection moveCursorNextByParagraph() {
        access$getTextPreparedSelectionState$p(this).resetCachedX();
        if (access$getText$p(this).length() <= 0) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == false) goto L21;
        TextFieldPreparedSelection $this$moveCursorTo_u24lambda_u245$iv = this;
        int oldCursor$iv = TextRange.m6412getEndimpl($this$moveCursorTo_u24lambda_u245$iv.m1350getSelectiond9O1mEE());
        int paragraphEnd = StringHelpersKt.findParagraphEnd(this.text, TextRange.m6414getMaximpl(this.selection));
        if (paragraphEnd == TextRange.m6414getMaximpl(this.selection)) goto L10;
    L12:
        long r7 = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(paragraphEnd, oldCursor$iv, access$getState$p($this$moveCursorTo_u24lambda_u245$iv));
        int newCursor$iv = CursorAndWedgeAffinity.m1324component1impl(r7);
        WedgeAffinity newWedgeAffinity$iv = CursorAndWedgeAffinity.m1325component2impl(r7);
        if (newCursor$iv == oldCursor$iv) goto L15;
    L16:
        $this$moveCursorTo_u24lambda_u245$iv.m1351setSelection5zctL8(TextRangeKt.TextRange(newCursor$iv));
    L17:
        if (newWedgeAffinity$iv == null) goto L21;
        $this$moveCursorTo_u24lambda_u245$iv.setWedgeAffinity(newWedgeAffinity$iv);
        goto L21
    L15:
        if (TextRange.m6411getCollapsedimpl($this$moveCursorTo_u24lambda_u245$iv.m1350getSelectiond9O1mEE()) == true) goto L17;
    L10:
        if (paragraphEnd == this.text.length()) goto L12;
        paragraphEnd = StringHelpersKt.findParagraphEnd(this.text, paragraphEnd + 1);
    L21:
        return this;
    L5:
        r4 = false;
        goto L6
    }

    public final TextFieldPreparedSelection moveCursorUpByLine() {
        int r6 = 0;
        if (access$getText$p(this).length() <= 0) goto L5;
        boolean r5 = true;
    L6:
        if (r5 == false) goto L19;
        TextFieldPreparedSelection $this$moveCursorTo_u24lambda_u245$iv = this;
        int oldCursor$iv = TextRange.m6412getEndimpl($this$moveCursorTo_u24lambda_u245$iv.m1350getSelectiond9O1mEE());
        TextLayoutResult r10 = this.textLayoutResult;
        if (r10 == null) goto L10;
        r6 = jumpByLinesOffset(r10, -1);
    L10:
        long r9 = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(r6, oldCursor$iv, access$getState$p($this$moveCursorTo_u24lambda_u245$iv));
        int newCursor$iv = CursorAndWedgeAffinity.m1324component1impl(r9);
        WedgeAffinity newWedgeAffinity$iv = CursorAndWedgeAffinity.m1325component2impl(r9);
        if (newCursor$iv == oldCursor$iv) goto L13;
    L14:
        $this$moveCursorTo_u24lambda_u245$iv.m1351setSelection5zctL8(TextRangeKt.TextRange(newCursor$iv));
    L15:
        if (newWedgeAffinity$iv == null) goto L19;
        $this$moveCursorTo_u24lambda_u245$iv.setWedgeAffinity(newWedgeAffinity$iv);
        goto L19
    L13:
        if (TextRange.m6411getCollapsedimpl($this$moveCursorTo_u24lambda_u245$iv.m1350getSelectiond9O1mEE()) == true) goto L15;
    L19:
        return this;
    L5:
        r5 = false;
        goto L6
    }

    public final TextFieldPreparedSelection moveCursorDownByLine() {
        if (access$getText$p(this).length() <= 0) goto L5;
        boolean r5 = true;
    L6:
        if (r5 == false) goto L20;
        TextFieldPreparedSelection $this$moveCursorTo_u24lambda_u245$iv = this;
        int oldCursor$iv = TextRange.m6412getEndimpl($this$moveCursorTo_u24lambda_u245$iv.m1350getSelectiond9O1mEE());
        TextLayoutResult r10 = this.textLayoutResult;
        if (r10 == null) goto L10;
        int r6 = jumpByLinesOffset(r10, 1);
    L11:
        long r9 = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(r6, oldCursor$iv, access$getState$p($this$moveCursorTo_u24lambda_u245$iv));
        int newCursor$iv = CursorAndWedgeAffinity.m1324component1impl(r9);
        WedgeAffinity newWedgeAffinity$iv = CursorAndWedgeAffinity.m1325component2impl(r9);
        if (newCursor$iv == oldCursor$iv) goto L14;
    L15:
        $this$moveCursorTo_u24lambda_u245$iv.m1351setSelection5zctL8(TextRangeKt.TextRange(newCursor$iv));
    L16:
        if (newWedgeAffinity$iv == null) goto L20;
        $this$moveCursorTo_u24lambda_u245$iv.setWedgeAffinity(newWedgeAffinity$iv);
        goto L20
    L14:
        if (TextRange.m6411getCollapsedimpl($this$moveCursorTo_u24lambda_u245$iv.m1350getSelectiond9O1mEE()) == true) goto L16;
    L10:
        r6 = this.text.length();
    L20:
        return this;
    L5:
        r5 = false;
        goto L6
    }

    public final TextFieldPreparedSelection moveCursorToLineLeftSide() {
        if (isLtr() == false) goto L6;
        return moveCursorToLineStart();
    L6:
        return moveCursorToLineEnd();
    }

    public final TextFieldPreparedSelection moveCursorToLineRightSide() {
        if (isLtr() == false) goto L6;
        return moveCursorToLineEnd();
    L6:
        return moveCursorToLineStart();
    }

    public final TextFieldPreparedSelection moveCursorToLineStart() {
        access$getTextPreparedSelectionState$p(this).resetCachedX();
        int r6 = 0;
        if (access$getText$p(this).length() <= 0) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == false) goto L19;
        TextFieldPreparedSelection $this$moveCursorTo_u24lambda_u245$iv = this;
        int oldCursor$iv = TextRange.m6412getEndimpl($this$moveCursorTo_u24lambda_u245$iv.m1350getSelectiond9O1mEE());
        TextLayoutResult r10 = this.textLayoutResult;
        if (r10 == null) goto L10;
        r6 = getLineStartByOffsetForLayout$default(this, r10, 0, 1, null);
    L10:
        long r5 = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(r6, oldCursor$iv, access$getState$p($this$moveCursorTo_u24lambda_u245$iv));
        int newCursor$iv = CursorAndWedgeAffinity.m1324component1impl(r5);
        WedgeAffinity newWedgeAffinity$iv = CursorAndWedgeAffinity.m1325component2impl(r5);
        if (newCursor$iv == oldCursor$iv) goto L13;
    L14:
        $this$moveCursorTo_u24lambda_u245$iv.m1351setSelection5zctL8(TextRangeKt.TextRange(newCursor$iv));
    L15:
        if (newWedgeAffinity$iv == null) goto L19;
        $this$moveCursorTo_u24lambda_u245$iv.setWedgeAffinity(newWedgeAffinity$iv);
        goto L19
    L13:
        if (TextRange.m6411getCollapsedimpl($this$moveCursorTo_u24lambda_u245$iv.m1350getSelectiond9O1mEE()) == true) goto L15;
    L19:
        return this;
    L5:
        r4 = false;
        goto L6
    }

    public final TextFieldPreparedSelection moveCursorToLineEnd() {
        access$getTextPreparedSelectionState$p(this).resetCachedX();
        if (access$getText$p(this).length() <= 0) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == false) goto L20;
        TextFieldPreparedSelection $this$moveCursorTo_u24lambda_u245$iv = this;
        int oldCursor$iv = TextRange.m6412getEndimpl($this$moveCursorTo_u24lambda_u245$iv.m1350getSelectiond9O1mEE());
        TextLayoutResult r10 = this.textLayoutResult;
        if (r10 == null) goto L10;
        int r5 = getLineEndByOffsetForLayout$default(this, r10, 0, 1, null);
    L11:
        long r6 = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(r5, oldCursor$iv, access$getState$p($this$moveCursorTo_u24lambda_u245$iv));
        int newCursor$iv = CursorAndWedgeAffinity.m1324component1impl(r6);
        WedgeAffinity newWedgeAffinity$iv = CursorAndWedgeAffinity.m1325component2impl(r6);
        if (newCursor$iv == oldCursor$iv) goto L14;
    L15:
        $this$moveCursorTo_u24lambda_u245$iv.m1351setSelection5zctL8(TextRangeKt.TextRange(newCursor$iv));
    L16:
        if (newWedgeAffinity$iv == null) goto L20;
        $this$moveCursorTo_u24lambda_u245$iv.setWedgeAffinity(newWedgeAffinity$iv);
        goto L20
    L14:
        if (TextRange.m6411getCollapsedimpl($this$moveCursorTo_u24lambda_u245$iv.m1350getSelectiond9O1mEE()) == true) goto L16;
    L10:
        r5 = this.text.length();
    L20:
        return this;
    L5:
        r4 = false;
        goto L6
    }

    public final TextFieldPreparedSelection moveCursorUpByPage() {
        if (access$getText$p(this).length() <= 0) goto L5;
        boolean r5 = true;
    L6:
        if (r5 == false) goto L16;
        TextFieldPreparedSelection $this$moveCursorTo_u24lambda_u245$iv = this;
        int oldCursor$iv = TextRange.m6412getEndimpl($this$moveCursorTo_u24lambda_u245$iv.m1350getSelectiond9O1mEE());
        long r8 = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(jumpByPagesOffset(-1), oldCursor$iv, access$getState$p($this$moveCursorTo_u24lambda_u245$iv));
        int newCursor$iv = CursorAndWedgeAffinity.m1324component1impl(r8);
        WedgeAffinity newWedgeAffinity$iv = CursorAndWedgeAffinity.m1325component2impl(r8);
        if (newCursor$iv == oldCursor$iv) goto L10;
    L11:
        $this$moveCursorTo_u24lambda_u245$iv.m1351setSelection5zctL8(TextRangeKt.TextRange(newCursor$iv));
    L12:
        if (newWedgeAffinity$iv == null) goto L16;
        $this$moveCursorTo_u24lambda_u245$iv.setWedgeAffinity(newWedgeAffinity$iv);
        goto L16
    L10:
        if (TextRange.m6411getCollapsedimpl($this$moveCursorTo_u24lambda_u245$iv.m1350getSelectiond9O1mEE()) == true) goto L12;
    L16:
        return this;
    L5:
        r5 = false;
        goto L6
    }

    public final TextFieldPreparedSelection moveCursorDownByPage() {
        if (access$getText$p(this).length() <= 0) goto L5;
        boolean r5 = true;
    L6:
        if (r5 == false) goto L16;
        TextFieldPreparedSelection $this$moveCursorTo_u24lambda_u245$iv = this;
        int oldCursor$iv = TextRange.m6412getEndimpl($this$moveCursorTo_u24lambda_u245$iv.m1350getSelectiond9O1mEE());
        long r9 = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(jumpByPagesOffset(1), oldCursor$iv, access$getState$p($this$moveCursorTo_u24lambda_u245$iv));
        int newCursor$iv = CursorAndWedgeAffinity.m1324component1impl(r9);
        WedgeAffinity newWedgeAffinity$iv = CursorAndWedgeAffinity.m1325component2impl(r9);
        if (newCursor$iv == oldCursor$iv) goto L10;
    L11:
        $this$moveCursorTo_u24lambda_u245$iv.m1351setSelection5zctL8(TextRangeKt.TextRange(newCursor$iv));
    L12:
        if (newWedgeAffinity$iv == null) goto L16;
        $this$moveCursorTo_u24lambda_u245$iv.setWedgeAffinity(newWedgeAffinity$iv);
        goto L16
    L10:
        if (TextRange.m6411getCollapsedimpl($this$moveCursorTo_u24lambda_u245$iv.m1350getSelectiond9O1mEE()) == true) goto L12;
    L16:
        return this;
    L5:
        r5 = false;
        goto L6
    }

    public final TextFieldPreparedSelection selectMovement() {
        if (access$getText$p(this).length() <= 0) goto L5;
        boolean r3 = true;
    L6:
        if (r3 == false) goto L9;
        TextFieldPreparedSelection $this$selectMovement_u24lambda_u2420 = this;
        $this$selectMovement_u24lambda_u2420.selection = TextRangeKt.TextRange(TextRange.m6417getStartimpl($this$selectMovement_u24lambda_u2420.initialValue.m1188getSelectiond9O1mEE()), TextRange.m6412getEndimpl($this$selectMovement_u24lambda_u2420.selection));
    L9:
        return this;
    L5:
        r3 = false;
        goto L6
    }

    public final TextFieldPreparedSelection deleteMovement() {
        if (access$getText$p(this).length() <= 0) goto L5;
        boolean r3 = true;
    L6:
        if (r3 == false) goto L13;
        TextFieldPreparedSelection $this$deleteMovement_u24lambda_u2421 = this;
        boolean r6 = TextRange.m6411getCollapsedimpl($this$deleteMovement_u24lambda_u2421.initialValue.m1188getSelectiond9O1mEE());
        TransformedTextFieldState r7 = $this$deleteMovement_u24lambda_u2421.state;
        if (r6 == true) goto L10;
        r7.deleteSelectedText();
    L11:
        $this$deleteMovement_u24lambda_u2421.selection = $this$deleteMovement_u24lambda_u2421.state.getVisualText().m1188getSelectiond9O1mEE();
        $this$deleteMovement_u24lambda_u2421.wedgeAffinity = WedgeAffinity.Start;
        goto L13
    L10:
        TransformedTextFieldState.m1309replaceTextM8tDOmk$default(r7, "", TextRangeKt.TextRange(TextRange.m6417getStartimpl($this$deleteMovement_u24lambda_u2421.initialValue.m1188getSelectiond9O1mEE()), TextRange.m6412getEndimpl($this$deleteMovement_u24lambda_u2421.selection)), null, !$this$deleteMovement_u24lambda_u2421.isFromSoftKeyboard, 4, null);
    L13:
        return this;
    L5:
        r3 = false;
        goto L6
    }

    private final boolean isLtr() {
        TextLayoutResult r0 = this.textLayoutResult;
        if (r0 == null) goto L12;
        ResolvedTextDirection direction = r0.getParagraphDirection(TextRange.m6412getEndimpl(this.selection));
        if (direction == null) goto L12;
        if (direction == ResolvedTextDirection.Ltr) goto L13;
        return false;
    L13:
        return true;
    L12:
        return true;
    }

    static /* synthetic */ int getNextWordOffsetForLayout$default(TextFieldPreparedSelection r0, TextLayoutResult r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r2 = TextRange.m6412getEndimpl(r0.selection);
    L6:
        return r0.getNextWordOffsetForLayout(r1, r2);
    }

    private final int getNextWordOffsetForLayout(TextLayoutResult $this$getNextWordOffsetForLayout, int currentOffset) {
    L3:
        if (currentOffset >= this.initialValue.length()) goto L5;
        long currentWord = $this$getNextWordOffsetForLayout.m6389getWordBoundaryjx7JFs(charOffset(currentOffset));
        if (TextRange.m6412getEndimpl(currentWord) > currentOffset) goto L10;
        currentOffset = currentOffset + 1;
        goto L3
    L10:
        return TextRange.m6412getEndimpl(currentWord);
    L5:
        return this.initialValue.length();
    }

    static /* synthetic */ int getPrevWordOffsetForLayout$default(TextFieldPreparedSelection r0, TextLayoutResult r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r2 = TextRange.m6412getEndimpl(r0.selection);
    L6:
        return r0.getPrevWordOffsetForLayout(r1, r2);
    }

    private final int getPrevWordOffsetForLayout(TextLayoutResult $this$getPrevWordOffsetForLayout, int currentOffset) {
    L2:
        if (currentOffset <= 0) goto L3;
        long currentWord = $this$getPrevWordOffsetForLayout.m6389getWordBoundaryjx7JFs(charOffset(currentOffset));
        if (TextRange.m6417getStartimpl(currentWord) < currentOffset) goto L9;
        currentOffset = currentOffset - 1;
        goto L2
    L9:
        return TextRange.m6417getStartimpl(currentWord);
    L3:
        return 0;
    }

    static /* synthetic */ int getLineStartByOffsetForLayout$default(TextFieldPreparedSelection r0, TextLayoutResult r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r2 = TextRange.m6415getMinimpl(r0.selection);
    L6:
        return r0.getLineStartByOffsetForLayout(r1, r2);
    }

    private final int getLineStartByOffsetForLayout(TextLayoutResult $this$getLineStartByOffsetForLayout, int currentOffset) {
        int currentLine = $this$getLineStartByOffsetForLayout.getLineForOffset(currentOffset);
        return $this$getLineStartByOffsetForLayout.getLineStart(currentLine);
    }

    static /* synthetic */ int getLineEndByOffsetForLayout$default(TextFieldPreparedSelection r0, TextLayoutResult r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r2 = TextRange.m6414getMaximpl(r0.selection);
    L6:
        return r0.getLineEndByOffsetForLayout(r1, r2);
    }

    private final int getLineEndByOffsetForLayout(TextLayoutResult $this$getLineEndByOffsetForLayout, int currentOffset) {
        int currentLine = $this$getLineEndByOffsetForLayout.getLineForOffset(currentOffset);
        return $this$getLineEndByOffsetForLayout.getLineEnd(currentLine, true);
    }

    private final int jumpByLinesOffset(TextLayoutResult $this$jumpByLinesOffset, int linesAmount) {
        int currentOffset = TextRange.m6412getEndimpl(this.selection);
        if (Float.isNaN(this.textPreparedSelectionState.getCachedX()) == false) goto L5;
        this.textPreparedSelectionState.setCachedX($this$jumpByLinesOffset.getCursorRect(currentOffset).getLeft());
    L5:
        int targetLine = $this$jumpByLinesOffset.getLineForOffset(currentOffset) + linesAmount;
        if (targetLine >= 0) goto L10;
        return 0;
    L10:
        if (targetLine >= $this$jumpByLinesOffset.getLineCount()) goto L12;
        float y = $this$jumpByLinesOffset.getLineBottom(targetLine) - 1.0f;
        float x = this.textPreparedSelectionState.getCachedX();
        if (isLtr() == false) goto L18;
        if (x < $this$jumpByLinesOffset.getLineRight(targetLine)) goto L18;
    L22:
        return $this$jumpByLinesOffset.getLineEnd(targetLine, true);
    L18:
        if (isLtr() == false) goto L20;
    L23:
        long v1$iv$iv = Float.floatToRawIntBits(x);
        long v2$iv$iv = Float.floatToRawIntBits(y);
        int $i$f$Offset = $this$jumpByLinesOffset.m6387getOffsetForPositionk4lQ0M(Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv)));
        return $i$f$Offset;
    L20:
        if (x > $this$jumpByLinesOffset.getLineLeft(targetLine)) goto L23;
    L12:
        return this.text.length();
    }

    private final int jumpByPagesOffset(int pagesAmount) {
        int currentOffset = TextRange.m6412getEndimpl(this.initialValue.m1188getSelectiond9O1mEE());
        if (this.textLayoutResult != null) goto L5;
    L12:
        return currentOffset;
    L5:
        if (Float.isNaN(this.visibleTextLayoutHeight) == true) goto L12;
        Rect currentPos = this.textLayoutResult.getCursorRect(currentOffset);
        Rect newPos = currentPos.translate(0.0f, this.visibleTextLayoutHeight * pagesAmount);
        int topLine = this.textLayoutResult.getLineForVerticalPosition(newPos.getTop());
        float lineSeparator = this.textLayoutResult.getLineBottom(topLine);
        float r5 = Math.abs(newPos.getTop() - lineSeparator);
        float r6 = Math.abs(newPos.getBottom() - lineSeparator);
        TextLayoutResult r7 = this.textLayoutResult;
        if (r5 <= r6) goto L11;
        return r7.m6387getOffsetForPositionk4lQ0M(newPos.m4160getTopLeftF1C5BW0());
    L11:
        return r7.m6387getOffsetForPositionk4lQ0M(newPos.m4153getBottomLeftF1C5BW0());
    }

    private final int charOffset(int offset) {
        return RangesKt.coerceAtMost(offset, this.text.length() - 1);
    }
}
