package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.selection.BaseTextPreparedSelection;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: TextPreparedSelection.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b)\b \u0018\u0000 a*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00002\u00020\u0002:\u0001aB/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&H\u0002J$\u0010(\u001a\u00028\u00002\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020+0*¢\u0006\u0002\b,¢\u0006\u0002\u0010-J$\u0010.\u001a\u00028\u00002\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020+0*¢\u0006\u0002\b,¢\u0006\u0002\u0010-J\u000b\u0010/\u001a\u00028\u0000¢\u0006\u0002\u00100J\r\u00101\u001a\u0004\u0018\u00010&¢\u0006\u0002\u00102J\r\u00103\u001a\u0004\u0018\u00010&¢\u0006\u0002\u00102J\u0006\u00104\u001a\u00020&J\r\u00105\u001a\u0004\u0018\u00010&¢\u0006\u0002\u00102J\u0006\u00106\u001a\u00020&J\r\u00107\u001a\u0004\u0018\u00010&¢\u0006\u0002\u00102J\b\u00108\u001a\u000209H\u0002J\u000b\u0010:\u001a\u00028\u0000¢\u0006\u0002\u00100J\u000b\u0010;\u001a\u00028\u0000¢\u0006\u0002\u00100J\u000b\u0010<\u001a\u00028\u0000¢\u0006\u0002\u00100J\r\u0010=\u001a\u00028\u0000H\u0002¢\u0006\u0002\u00100J\u000b\u0010>\u001a\u00028\u0000¢\u0006\u0002\u00100J\r\u0010?\u001a\u00028\u0000H\u0002¢\u0006\u0002\u00100J\r\u0010@\u001a\u00028\u0000H\u0002¢\u0006\u0002\u00100J\u000b\u0010A\u001a\u00028\u0000¢\u0006\u0002\u00100J\r\u0010B\u001a\u00028\u0000H\u0002¢\u0006\u0002\u00100J\u000b\u0010C\u001a\u00028\u0000¢\u0006\u0002\u00100J\u000b\u0010D\u001a\u00028\u0000¢\u0006\u0002\u00100J\u000b\u0010E\u001a\u00028\u0000¢\u0006\u0002\u00100J\u000b\u0010F\u001a\u00028\u0000¢\u0006\u0002\u00100J\u000b\u0010G\u001a\u00028\u0000¢\u0006\u0002\u00100J\u000b\u0010H\u001a\u00028\u0000¢\u0006\u0002\u00100J\u000b\u0010I\u001a\u00028\u0000¢\u0006\u0002\u00100J\u000b\u0010J\u001a\u00028\u0000¢\u0006\u0002\u00100J\u000b\u0010K\u001a\u00028\u0000¢\u0006\u0002\u00100J\u000b\u0010L\u001a\u00028\u0000¢\u0006\u0002\u00100J\u000b\u0010M\u001a\u00028\u0000¢\u0006\u0002\u00100J\u0010\u0010N\u001a\u00020+2\u0006\u0010'\u001a\u00020&H\u0004J\u0018\u0010O\u001a\u00020+2\u0006\u0010P\u001a\u00020&2\u0006\u0010Q\u001a\u00020&H\u0004J\b\u0010R\u001a\u00020&H\u0002J\b\u0010S\u001a\u00020&H\u0002J\b\u0010T\u001a\u00020&H\u0002J;\u0010U\u001a\u00028\u0000\"\u0004\b\u0001\u0010V*\u0002HV2\b\b\u0002\u0010W\u001a\u0002092\u0017\u0010X\u001a\u0013\u0012\u0004\u0012\u0002HV\u0012\u0004\u0012\u00020+0*¢\u0006\u0002\b,H\u0084\b¢\u0006\u0002\u0010YJ\u0016\u0010Z\u001a\u00020&*\u00020\b2\b\b\u0002\u0010[\u001a\u00020&H\u0002J\u0016\u0010\\\u001a\u00020&*\u00020\b2\b\b\u0002\u0010[\u001a\u00020&H\u0002J\u0017\u0010]\u001a\u00020&*\u00020\b2\b\b\u0002\u0010[\u001a\u00020&H\u0082\u0010J\u0017\u0010^\u001a\u00020&*\u00020\b2\b\b\u0002\u0010[\u001a\u00020&H\u0082\u0010J\u0014\u0010_\u001a\u00020&*\u00020\b2\u0006\u0010`\u001a\u00020&H\u0002R\u001a\u0010\u000e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R\"\u0010\u001b\u001a\u00020\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006b"}, d2 = {"Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "T", "", "originalText", "Landroidx/compose/ui/text/AnnotatedString;", "originalSelection", "Landroidx/compose/ui/text/TextRange;", "layoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "state", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "annotatedString", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "setAnnotatedString", "(Landroidx/compose/ui/text/AnnotatedString;)V", "getLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "getOffsetMapping", "()Landroidx/compose/ui/text/input/OffsetMapping;", "getOriginalSelection-d9O1mEE", "()J", "J", "getOriginalText", "selection", "getSelection-d9O1mEE", "setSelection-5zc-tL8", "(J)V", "getState", "()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "text", "", "getText$foundation_release", "()Ljava/lang/String;", "charOffset", "", "offset", "collapseLeftOr", "or", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "collapseRightOr", "deselect", "()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "getLineEndByOffset", "()Ljava/lang/Integer;", "getLineStartByOffset", "getNextCharacterIndex", "getNextWordOffset", "getPrecedingCharacterIndex", "getPreviousWordOffset", "isLtr", "", "moveCursorDownByLine", "moveCursorLeft", "moveCursorLeftByWord", "moveCursorNext", "moveCursorNextByParagraph", "moveCursorNextByWord", "moveCursorPrev", "moveCursorPrevByParagraph", "moveCursorPrevByWord", "moveCursorRight", "moveCursorRightByWord", "moveCursorToEnd", "moveCursorToHome", "moveCursorToLineEnd", "moveCursorToLineLeftSide", "moveCursorToLineRightSide", "moveCursorToLineStart", "moveCursorUpByLine", "selectAll", "selectMovement", "setCursor", "setSelection", "start", "end", "transformedEndOffset", "transformedMaxOffset", "transformedMinOffset", "apply", "U", "resetCachedX", "block", "(Ljava/lang/Object;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "getLineEndByOffsetForLayout", "currentOffset", "getLineStartByOffsetForLayout", "getNextWordOffsetForLayout", "getPrevWordOffset", "jumpByLinesOffset", "linesAmount", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class BaseTextPreparedSelection<T extends BaseTextPreparedSelection<T>> {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    public static final int NoCharacterFound = -1;
    private AnnotatedString annotatedString;
    private final TextLayoutResult layoutResult;
    private final OffsetMapping offsetMapping;
    private final long originalSelection;
    private final AnnotatedString originalText;
    private long selection;
    private final TextPreparedSelectionState state;

    /* JADX INFO: compiled from: TextPreparedSelection.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection$Companion;", "", "()V", "NoCharacterFound", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public /* synthetic */ BaseTextPreparedSelection(AnnotatedString r1, long r2, TextLayoutResult r4, OffsetMapping r5, TextPreparedSelectionState r6, DefaultConstructorMarker r7) {
        this(r1, r2, r4, r5, r6);
    }

    private BaseTextPreparedSelection(AnnotatedString originalText, long originalSelection, TextLayoutResult layoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState state) {
        this.originalText = originalText;
        this.originalSelection = originalSelection;
        this.layoutResult = layoutResult;
        this.offsetMapping = offsetMapping;
        this.state = state;
        this.selection = this.originalSelection;
        this.annotatedString = this.originalText;
    }

    public final AnnotatedString getOriginalText() {
        return this.originalText;
    }

    /* JADX INFO: renamed from: getOriginalSelection-d9O1mEE, reason: not valid java name */
    public final long m1429getOriginalSelectiond9O1mEE() {
        return this.originalSelection;
    }

    public final TextLayoutResult getLayoutResult() {
        return this.layoutResult;
    }

    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    public final TextPreparedSelectionState getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m1430getSelectiond9O1mEE() {
        return this.selection;
    }

    /* JADX INFO: renamed from: setSelection-5zc-tL8, reason: not valid java name */
    public final void m1431setSelection5zctL8(long r1) {
        this.selection = r1;
    }

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public final void setAnnotatedString(AnnotatedString r1) {
        this.annotatedString = r1;
    }

    public final String getText$foundation_release() {
        return this.annotatedString.getText();
    }

    public static /* synthetic */ BaseTextPreparedSelection apply$default(BaseTextPreparedSelection $this, Object $receiver, boolean resetCachedX, Function1 block, int r5, Object r6) {
        if (r6 != null) goto L18;
        boolean r7 = true;
        if ((r5 & 1) == 0) goto L7;
        resetCachedX = true;
    L7:
        if (resetCachedX == false) goto L10;
        $this.getState().resetCachedX();
    L10:
        if ($this.getText$foundation_release().length() > 0) goto L13;
        r7 = false;
    L13:
        if (r7 == false) goto L15;
        block.invoke($receiver);
    L15:
        Intrinsics.checkNotNull($receiver, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return (BaseTextPreparedSelection) $receiver;
    L18:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: apply");
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final <U> T apply(U r3, boolean resetCachedX, Function1<? super U, Unit> r5) {
        if (resetCachedX == false) goto L6;
        getState().resetCachedX();
    L6:
        if (getText$foundation_release().length() <= 0) goto L8;
        boolean r1 = true;
    L9:
        if (r1 == false) goto L11;
        r5.invoke(r3);
    L11:
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return (T) r3;
    L8:
        r1 = false;
        goto L9
    }

    protected final void setCursor(int offset) {
        setSelection(offset, offset);
    }

    protected final void setSelection(int start, int end) {
        this.selection = TextRangeKt.TextRange(start, end);
    }

    public final T selectAll() {
        getState().resetCachedX();
        if (getText$foundation_release().length() <= 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L8;
        BaseTextPreparedSelection<T> r3 = this;
        r3.setSelection(0, r3.getText$foundation_release().length());
    L8:
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    L5:
        r2 = false;
        goto L6
    }

    public final T deselect() {
        getState().resetCachedX();
        if (getText$foundation_release().length() <= 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L8;
        BaseTextPreparedSelection<T> r3 = this;
        r3.setCursor(TextRange.m6412getEndimpl(r3.selection));
    L8:
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    L5:
        r2 = false;
        goto L6
    }

    public final T moveCursorLeft() {
        getState().resetCachedX();
        if (getText$foundation_release().length() <= 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L12;
        BaseTextPreparedSelection<T> r3 = this;
        if (r3.isLtr() == false) goto L10;
        r3.moveCursorPrev();
        goto L12
    L10:
        r3.moveCursorNext();
    L12:
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    L5:
        r2 = false;
        goto L6
    }

    public final T moveCursorRight() {
        getState().resetCachedX();
        if (getText$foundation_release().length() <= 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L12;
        BaseTextPreparedSelection<T> r3 = this;
        if (r3.isLtr() == false) goto L10;
        r3.moveCursorNext();
        goto L12
    L10:
        r3.moveCursorPrev();
    L12:
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    L5:
        r2 = false;
        goto L6
    }

    public final T collapseLeftOr(Function1<? super T, Unit> r9) {
        getState().resetCachedX();
        if (getText$foundation_release().length() <= 0) goto L5;
        boolean r2 = true;
    L7:
        if (r2 == false) goto L16;
        BaseTextPreparedSelection<T> r3 = this;
        if (TextRange.m6411getCollapsedimpl(r3.selection) == false) goto L11;
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        r9.invoke(r3);
        goto L16
    L11:
        boolean r5 = r3.isLtr();
        long r6 = r3.selection;
        if (r5 == false) goto L14;
        r3.setCursor(TextRange.m6415getMinimpl(r6));
        goto L16
    L14:
        r3.setCursor(TextRange.m6414getMaximpl(r6));
    L16:
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    L5:
        r2 = false;
        goto L7
    }

    public final T collapseRightOr(Function1<? super T, Unit> r9) {
        getState().resetCachedX();
        if (getText$foundation_release().length() <= 0) goto L5;
        boolean r2 = true;
    L7:
        if (r2 == false) goto L16;
        BaseTextPreparedSelection<T> r3 = this;
        if (TextRange.m6411getCollapsedimpl(r3.selection) == false) goto L11;
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        r9.invoke(r3);
        goto L16
    L11:
        boolean r5 = r3.isLtr();
        long r6 = r3.selection;
        if (r5 == false) goto L14;
        r3.setCursor(TextRange.m6414getMaximpl(r6));
        goto L16
    L14:
        r3.setCursor(TextRange.m6415getMinimpl(r6));
    L16:
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    L5:
        r2 = false;
        goto L7
    }

    public final int getPrecedingCharacterIndex() {
        return StringHelpers_androidKt.findPrecedingBreak(this.annotatedString.getText(), TextRange.m6412getEndimpl(this.selection));
    }

    public final int getNextCharacterIndex() {
        return StringHelpers_androidKt.findFollowingBreak(this.annotatedString.getText(), TextRange.m6412getEndimpl(this.selection));
    }

    private final T moveCursorPrev() {
        getState().resetCachedX();
        if (getText$foundation_release().length() <= 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L11;
        BaseTextPreparedSelection<T> r3 = this;
        int prev = r3.getPrecedingCharacterIndex();
        if (prev == (-1)) goto L11;
        r3.setCursor(prev);
    L11:
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    L5:
        r2 = false;
        goto L6
    }

    private final T moveCursorNext() {
        getState().resetCachedX();
        if (getText$foundation_release().length() <= 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L11;
        BaseTextPreparedSelection<T> r3 = this;
        int next = r3.getNextCharacterIndex();
        if (next == (-1)) goto L11;
        r3.setCursor(next);
    L11:
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    L5:
        r2 = false;
        goto L6
    }

    public final T moveCursorToHome() {
        getState().resetCachedX();
        if (getText$foundation_release().length() <= 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L8;
        setCursor(0);
    L8:
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    L5:
        r2 = false;
        goto L6
    }

    public final T moveCursorToEnd() {
        getState().resetCachedX();
        if (getText$foundation_release().length() <= 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L8;
        BaseTextPreparedSelection<T> r3 = this;
        r3.setCursor(r3.getText$foundation_release().length());
    L8:
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    L5:
        r2 = false;
        goto L6
    }

    public final T moveCursorLeftByWord() {
        getState().resetCachedX();
        if (getText$foundation_release().length() <= 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L12;
        BaseTextPreparedSelection<T> r3 = this;
        if (r3.isLtr() == false) goto L10;
        r3.moveCursorPrevByWord();
        goto L12
    L10:
        r3.moveCursorNextByWord();
    L12:
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    L5:
        r2 = false;
        goto L6
    }

    public final T moveCursorRightByWord() {
        getState().resetCachedX();
        if (getText$foundation_release().length() <= 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L12;
        BaseTextPreparedSelection<T> r3 = this;
        if (r3.isLtr() == false) goto L10;
        r3.moveCursorNextByWord();
        goto L12
    L10:
        r3.moveCursorPrevByWord();
    L12:
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    L5:
        r2 = false;
        goto L6
    }

    public final Integer getNextWordOffset() {
        TextLayoutResult r0 = this.layoutResult;
        if (r0 != null) goto L5;
        return null;
    L5:
        return Integer.valueOf(getNextWordOffsetForLayout$default(this, r0, 0, 1, null));
    }

    private final T moveCursorNextByWord() {
        getState().resetCachedX();
        if (getText$foundation_release().length() <= 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L11;
        BaseTextPreparedSelection<T> r3 = this;
        Integer r4 = r3.getNextWordOffset();
        if (r4 == null) goto L11;
        int it = r4.intValue();
        r3.setCursor(it);
    L11:
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    L5:
        r2 = false;
        goto L6
    }

    public final Integer getPreviousWordOffset() {
        TextLayoutResult r0 = this.layoutResult;
        if (r0 != null) goto L5;
        return null;
    L5:
        return Integer.valueOf(getPrevWordOffset$default(this, r0, 0, 1, null));
    }

    private final T moveCursorPrevByWord() {
        getState().resetCachedX();
        if (getText$foundation_release().length() <= 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L11;
        BaseTextPreparedSelection<T> r3 = this;
        Integer r4 = r3.getPreviousWordOffset();
        if (r4 == null) goto L11;
        int it = r4.intValue();
        r3.setCursor(it);
    L11:
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    L5:
        r2 = false;
        goto L6
    }

    public final T moveCursorPrevByParagraph() {
        getState().resetCachedX();
        if (getText$foundation_release().length() <= 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L12;
        BaseTextPreparedSelection<T> r3 = this;
        int paragraphStart = StringHelpersKt.findParagraphStart(r3.getText$foundation_release(), TextRange.m6415getMinimpl(r3.selection));
        if (paragraphStart != TextRange.m6415getMinimpl(r3.selection)) goto L11;
        if (paragraphStart == 0) goto L11;
        paragraphStart = StringHelpersKt.findParagraphStart(r3.getText$foundation_release(), paragraphStart - 1);
    L11:
        r3.setCursor(paragraphStart);
    L12:
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    L5:
        r2 = false;
        goto L6
    }

    public final T moveCursorNextByParagraph() {
        getState().resetCachedX();
        if (getText$foundation_release().length() <= 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L13;
        BaseTextPreparedSelection<T> r3 = this;
        int paragraphEnd = StringHelpersKt.findParagraphEnd(r3.getText$foundation_release(), TextRange.m6414getMaximpl(r3.selection));
        if (paragraphEnd == TextRange.m6414getMaximpl(r3.selection)) goto L10;
    L12:
        r3.setCursor(paragraphEnd);
        goto L13
    L10:
        if (paragraphEnd == r3.getText$foundation_release().length()) goto L12;
        paragraphEnd = StringHelpersKt.findParagraphEnd(r3.getText$foundation_release(), paragraphEnd + 1);
    L13:
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    L5:
        r2 = false;
        goto L6
    }

    public final T moveCursorUpByLine() {
        if (getText$foundation_release().length() <= 0) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == false) goto L11;
        BaseTextPreparedSelection<T> r5 = this;
        TextLayoutResult r6 = r5.layoutResult;
        if (r6 == null) goto L11;
        int it = r5.jumpByLinesOffset(r6, -1);
        r5.setCursor(it);
    L11:
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    L5:
        r4 = false;
        goto L6
    }

    public final T moveCursorDownByLine() {
        if (getText$foundation_release().length() <= 0) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == false) goto L11;
        BaseTextPreparedSelection<T> r5 = this;
        TextLayoutResult r7 = r5.layoutResult;
        if (r7 == null) goto L11;
        int it = r5.jumpByLinesOffset(r7, 1);
        r5.setCursor(it);
    L11:
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    L5:
        r4 = false;
        goto L6
    }

    public final Integer getLineStartByOffset() {
        TextLayoutResult r0 = this.layoutResult;
        if (r0 != null) goto L5;
        return null;
    L5:
        return Integer.valueOf(getLineStartByOffsetForLayout$default(this, r0, 0, 1, null));
    }

    public final T moveCursorToLineStart() {
        getState().resetCachedX();
        if (getText$foundation_release().length() <= 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L11;
        BaseTextPreparedSelection<T> r3 = this;
        Integer r4 = r3.getLineStartByOffset();
        if (r4 == null) goto L11;
        int it = r4.intValue();
        r3.setCursor(it);
    L11:
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    L5:
        r2 = false;
        goto L6
    }

    public final Integer getLineEndByOffset() {
        TextLayoutResult r0 = this.layoutResult;
        if (r0 != null) goto L5;
        return null;
    L5:
        return Integer.valueOf(getLineEndByOffsetForLayout$default(this, r0, 0, 1, null));
    }

    public final T moveCursorToLineEnd() {
        getState().resetCachedX();
        if (getText$foundation_release().length() <= 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L11;
        BaseTextPreparedSelection<T> r3 = this;
        Integer r4 = r3.getLineEndByOffset();
        if (r4 == null) goto L11;
        int it = r4.intValue();
        r3.setCursor(it);
    L11:
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    L5:
        r2 = false;
        goto L6
    }

    public final T moveCursorToLineLeftSide() {
        getState().resetCachedX();
        if (getText$foundation_release().length() <= 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L12;
        BaseTextPreparedSelection<T> r3 = this;
        if (r3.isLtr() == false) goto L10;
        r3.moveCursorToLineStart();
        goto L12
    L10:
        r3.moveCursorToLineEnd();
    L12:
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    L5:
        r2 = false;
        goto L6
    }

    public final T moveCursorToLineRightSide() {
        getState().resetCachedX();
        if (getText$foundation_release().length() <= 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L12;
        BaseTextPreparedSelection<T> r3 = this;
        if (r3.isLtr() == false) goto L10;
        r3.moveCursorToLineEnd();
        goto L12
    L10:
        r3.moveCursorToLineStart();
    L12:
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    L5:
        r2 = false;
        goto L6
    }

    public final T selectMovement() {
        if (getText$foundation_release().length() <= 0) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == false) goto L8;
        BaseTextPreparedSelection<T> r5 = this;
        r5.selection = TextRangeKt.TextRange(TextRange.m6417getStartimpl(r5.originalSelection), TextRange.m6412getEndimpl(r5.selection));
    L8:
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    L5:
        r4 = false;
        goto L6
    }

    private final boolean isLtr() {
        TextLayoutResult r0 = this.layoutResult;
        if (r0 == null) goto L5;
        ResolvedTextDirection direction = r0.getParagraphDirection(transformedEndOffset());
    L7:
        if (direction == ResolvedTextDirection.Rtl) goto L9;
        return true;
    L9:
        return false;
    L5:
        direction = null;
        goto L7
    }

    static /* synthetic */ int getNextWordOffsetForLayout$default(BaseTextPreparedSelection r0, TextLayoutResult r1, int r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 1) == 0) goto L7;
        r2 = r0.transformedEndOffset();
    L7:
        return r0.getNextWordOffsetForLayout(r1, r2);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
    }

    private final int getNextWordOffsetForLayout(TextLayoutResult $this$getNextWordOffsetForLayout, int currentOffset) {
    L3:
        if (currentOffset >= this.originalText.length()) goto L5;
        long currentWord = $this$getNextWordOffsetForLayout.m6389getWordBoundaryjx7JFs(charOffset(currentOffset));
        if (TextRange.m6412getEndimpl(currentWord) > currentOffset) goto L10;
        currentOffset = currentOffset + 1;
        goto L3
    L10:
        return this.offsetMapping.transformedToOriginal(TextRange.m6412getEndimpl(currentWord));
    L5:
        return this.originalText.length();
    }

    static /* synthetic */ int getPrevWordOffset$default(BaseTextPreparedSelection r0, TextLayoutResult r1, int r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 1) == 0) goto L7;
        r2 = r0.transformedEndOffset();
    L7:
        return r0.getPrevWordOffset(r1, r2);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
    }

    private final int getPrevWordOffset(TextLayoutResult $this$getPrevWordOffset, int currentOffset) {
    L2:
        if (currentOffset <= 0) goto L3;
        long currentWord = $this$getPrevWordOffset.m6389getWordBoundaryjx7JFs(charOffset(currentOffset));
        if (TextRange.m6417getStartimpl(currentWord) < currentOffset) goto L9;
        currentOffset = currentOffset - 1;
        goto L2
    L9:
        return this.offsetMapping.transformedToOriginal(TextRange.m6417getStartimpl(currentWord));
    L3:
        return 0;
    }

    static /* synthetic */ int getLineStartByOffsetForLayout$default(BaseTextPreparedSelection r0, TextLayoutResult r1, int r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 1) == 0) goto L7;
        r2 = r0.transformedMinOffset();
    L7:
        return r0.getLineStartByOffsetForLayout(r1, r2);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
    }

    private final int getLineStartByOffsetForLayout(TextLayoutResult $this$getLineStartByOffsetForLayout, int currentOffset) {
        int currentLine = $this$getLineStartByOffsetForLayout.getLineForOffset(currentOffset);
        return this.offsetMapping.transformedToOriginal($this$getLineStartByOffsetForLayout.getLineStart(currentLine));
    }

    static /* synthetic */ int getLineEndByOffsetForLayout$default(BaseTextPreparedSelection r0, TextLayoutResult r1, int r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 1) == 0) goto L7;
        r2 = r0.transformedMaxOffset();
    L7:
        return r0.getLineEndByOffsetForLayout(r1, r2);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
    }

    private final int getLineEndByOffsetForLayout(TextLayoutResult $this$getLineEndByOffsetForLayout, int currentOffset) {
        int currentLine = $this$getLineEndByOffsetForLayout.getLineForOffset(currentOffset);
        return this.offsetMapping.transformedToOriginal($this$getLineEndByOffsetForLayout.getLineEnd(currentLine, true));
    }

    private final int jumpByLinesOffset(TextLayoutResult $this$jumpByLinesOffset, int linesAmount) {
        int currentOffset = transformedEndOffset();
        if (this.state.getCachedX() != null) goto L5;
        this.state.setCachedX(Float.valueOf($this$jumpByLinesOffset.getCursorRect(currentOffset).getLeft()));
    L5:
        int targetLine = $this$jumpByLinesOffset.getLineForOffset(currentOffset) + linesAmount;
        if (targetLine >= 0) goto L10;
        return 0;
    L10:
        if (targetLine >= $this$jumpByLinesOffset.getLineCount()) goto L12;
        float y = $this$jumpByLinesOffset.getLineBottom(targetLine) - 1.0f;
        Float r5 = this.state.getCachedX();
        Intrinsics.checkNotNull(r5);
        Float r6 = r5;
        float it = r6.floatValue();
        if (isLtr() == false) goto L18;
        if (it < $this$jumpByLinesOffset.getLineRight(targetLine)) goto L18;
    L22:
        return $this$jumpByLinesOffset.getLineEnd(targetLine, true);
    L18:
        if (isLtr() == false) goto L20;
    L23:
        float x = r6.floatValue();
        long v1$iv$iv = Float.floatToRawIntBits(x);
        long v2$iv$iv = Float.floatToRawIntBits(y);
        return this.offsetMapping.transformedToOriginal($this$jumpByLinesOffset.m6387getOffsetForPositionk4lQ0M(Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv))));
    L20:
        if (it > $this$jumpByLinesOffset.getLineLeft(targetLine)) goto L23;
    L12:
        return getText$foundation_release().length();
    }

    private final int transformedEndOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m6412getEndimpl(this.selection));
    }

    private final int transformedMinOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m6415getMinimpl(this.selection));
    }

    private final int transformedMaxOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m6414getMaximpl(this.selection));
    }

    private final int charOffset(int offset) {
        return RangesKt.coerceAtMost(offset, getText$foundation_release().length() - 1);
    }
}
