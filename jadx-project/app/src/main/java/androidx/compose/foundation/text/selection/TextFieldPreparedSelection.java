package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.SetSelectionCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TextPreparedSelection.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ)\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0019\u0010\u0014\u001a\u0015\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0015¢\u0006\u0002\b\u0016J\u0006\u0010\u0017\u001a\u00020\u0000J\u0006\u0010\u0018\u001a\u00020\u0000J\u0014\u0010\u0019\u001a\u00020\u001a*\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\f¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "currentValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "layoutResultProxy", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "state", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/TextLayoutResultProxy;Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;)V", "getCurrentValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "getLayoutResultProxy", "()Landroidx/compose/foundation/text/TextLayoutResultProxy;", "value", "getValue", "deleteIfSelectedOr", "", "Landroidx/compose/ui/text/input/EditCommand;", "or", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "moveCursorDownByPage", "moveCursorUpByPage", "jumpByPagesOffset", "", "pagesAmount", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextFieldPreparedSelection extends BaseTextPreparedSelection<TextFieldPreparedSelection> {
    public static final int $stable = 0;
    private final TextFieldValue currentValue;
    private final TextLayoutResultProxy layoutResultProxy;

    static {
        $stable = 8;
    }

    public /* synthetic */ TextFieldPreparedSelection(TextFieldValue r1, OffsetMapping r2, TextLayoutResultProxy r3, TextPreparedSelectionState r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 2) == 0) goto L6;
        r2 = OffsetMapping.Companion.getIdentity();
    L6:
        if ((r5 & 8) == 0) goto L8;
        r4 = new TextPreparedSelectionState();
    L8:
        this(r1, r2, r3, r4);
    }

    public final TextFieldValue getCurrentValue() {
        return this.currentValue;
    }

    public final TextLayoutResultProxy getLayoutResultProxy() {
        return this.layoutResultProxy;
    }

    public TextFieldPreparedSelection(TextFieldValue currentValue, OffsetMapping offsetMapping, TextLayoutResultProxy layoutResultProxy, TextPreparedSelectionState state) {
        AnnotatedString r1 = currentValue.getAnnotatedString();
        long r2 = currentValue.m6665getSelectiond9O1mEE();
        if (layoutResultProxy == null) goto L5;
        TextLayoutResult r0 = layoutResultProxy.getValue();
    L6:
        super(r1, r2, r0, offsetMapping, state, null);
        this.currentValue = currentValue;
        this.layoutResultProxy = layoutResultProxy;
        return;
    L5:
        r0 = null;
        goto L6
    }

    public final TextFieldValue getValue() {
        return TextFieldValue.m6660copy3r_uNRQ$default(this.currentValue, getAnnotatedString(), m1430getSelectiond9O1mEE(), null, 4, null);
    }

    public final List<EditCommand> deleteIfSelectedOr(Function1<? super TextFieldPreparedSelection, ? extends EditCommand> r6) {
        if (TextRange.m6411getCollapsedimpl(m1430getSelectiond9O1mEE()) == false) goto L9;
        EditCommand it = r6.invoke(this);
        if (it != null) goto L10;
        return null;
    L10:
        return CollectionsKt.listOf(it);
    L9:
        return CollectionsKt.listOf(new EditCommand[]{new CommitTextCommand("", 0), new SetSelectionCommand(TextRange.m6415getMinimpl(m1430getSelectiond9O1mEE()), TextRange.m6415getMinimpl(m1430getSelectiond9O1mEE()))});
    }

    public final TextFieldPreparedSelection moveCursorUpByPage() {
        TextFieldPreparedSelection this_$iv = this;
        if (this_$iv.getText$foundation_release().length() <= 0) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == false) goto L11;
        TextFieldPreparedSelection $this$moveCursorUpByPage_u24lambda_u242 = this;
        TextLayoutResultProxy r6 = $this$moveCursorUpByPage_u24lambda_u242.layoutResultProxy;
        if (r6 == null) goto L11;
        int it = $this$moveCursorUpByPage_u24lambda_u242.jumpByPagesOffset(r6, -1);
        $this$moveCursorUpByPage_u24lambda_u242.setCursor(it);
    L11:
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        TextFieldPreparedSelection this_$iv2 = this;
        return this_$iv2;
    L5:
        r4 = false;
        goto L6
    }

    public final TextFieldPreparedSelection moveCursorDownByPage() {
        TextFieldPreparedSelection this_$iv = this;
        if (this_$iv.getText$foundation_release().length() <= 0) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == false) goto L11;
        TextFieldPreparedSelection $this$moveCursorDownByPage_u24lambda_u244 = this;
        TextLayoutResultProxy r7 = $this$moveCursorDownByPage_u24lambda_u244.layoutResultProxy;
        if (r7 == null) goto L11;
        int it = $this$moveCursorDownByPage_u24lambda_u244.jumpByPagesOffset(r7, 1);
        $this$moveCursorDownByPage_u24lambda_u244.setCursor(it);
    L11:
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        TextFieldPreparedSelection this_$iv2 = this;
        return this_$iv2;
    L5:
        r4 = false;
        goto L6
    }

    private final int jumpByPagesOffset(TextLayoutResultProxy $this$jumpByPagesOffset, int pagesAmount) {
        LayoutCoordinates inner = $this$jumpByPagesOffset.getInnerTextFieldCoordinates();
        if (inner == null) goto L8;
        LayoutCoordinates r2 = $this$jumpByPagesOffset.getDecorationBoxCoordinates();
        Rect visibleInnerTextFieldRect = null;
        if (r2 == null) goto L7;
        visibleInnerTextFieldRect = LayoutCoordinates.localBoundingBoxOf$default(r2, inner, false, 2, null);
    L7:
        if (visibleInnerTextFieldRect == null) goto L8;
    L9:
        int currentOffset = getOffsetMapping().originalToTransformed(TextRange.m6412getEndimpl(this.currentValue.m6665getSelectiond9O1mEE()));
        Rect currentPos = $this$jumpByPagesOffset.getValue().getCursorRect(currentOffset);
        float x = currentPos.getLeft();
        float r5 = currentPos.getTop();
        long arg0$iv = visibleInnerTextFieldRect.m4158getSizeNHjbRc();
        int bits$iv$iv$iv = (int) (arg0$iv & 4294967295L);
        float y = r5 + (Float.intBitsToFloat(bits$iv$iv$iv) * pagesAmount);
        OffsetMapping r7 = getOffsetMapping();
        TextLayoutResult r8 = $this$jumpByPagesOffset.getValue();
        long v1$iv$iv = Float.floatToRawIntBits(x);
        long v2$iv$iv = Float.floatToRawIntBits(y);
        return r7.transformedToOriginal(r8.m6387getOffsetForPositionk4lQ0M(Offset.m4117constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L))));
    L8:
        visibleInnerTextFieldRect = Rect.Companion.getZero();
        goto L9
    }
}
