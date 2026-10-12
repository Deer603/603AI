package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: TextFieldScroll.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0000\u001a6\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0002\u001a*\u0010\u0017\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0015H\u0000¨\u0006\u001b"}, d2 = {"defaultTextFieldScroll", "Landroidx/compose/ui/Modifier;", "scrollerPosition", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "textLayoutResultProvider", "Lkotlin/Function0;", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "getCursorRectInScroller", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/Density;", "cursorOffset", "", "transformedText", "Landroidx/compose/ui/text/input/TransformedText;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "rtl", "", "textFieldWidth", "textFieldScrollable", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "enabled", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextFieldScrollKt {

    /* JADX INFO: compiled from: TextFieldScroll.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[Orientation.values().length];
            r0[Orientation.Vertical.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L11:
            r0[Orientation.Horizontal.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L9:
            $EnumSwitchMapping$0 = r0;
        }
    }

    public static final /* synthetic */ Rect access$getCursorRectInScroller(Density $receiver, int cursorOffset, TransformedText transformedText, TextLayoutResult textLayoutResult, boolean rtl, int textFieldWidth) {
        return getCursorRectInScroller($receiver, cursorOffset, transformedText, textLayoutResult, rtl, textFieldWidth);
    }

    public static /* synthetic */ Modifier textFieldScrollable$default(Modifier r0, TextFieldScrollerPosition r1, MutableInteractionSource r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = true;
    L9:
        return textFieldScrollable(r0, r1, r2, r3);
    }

    public static final Modifier textFieldScrollable(Modifier $this$textFieldScrollable, final TextFieldScrollerPosition scrollerPosition, final MutableInteractionSource interactionSource, final boolean enabled) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r1 = new TextFieldScrollKt$textFieldScrollable$$inlined$debugInspectorInfo$1(scrollerPosition, interactionSource, enabled);
    L7:
        return ComposedModifierKt.composed($this$textFieldScrollable, r1, new AnonymousClass2(scrollerPosition, enabled, interactionSource));
    L5:
        r1 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    public static final Modifier defaultTextFieldScroll(Modifier $this$defaultTextFieldScroll, TextFieldScrollerPosition scrollerPosition, TextFieldValue textFieldValue, VisualTransformation visualTransformation, Function0<TextLayoutResultProxy> r10) {
        Orientation orientation = scrollerPosition.getOrientation();
        int cursorOffset = scrollerPosition.m1155getOffsetToFollow5zctL8(textFieldValue.m6665getSelectiond9O1mEE());
        scrollerPosition.m1157setPreviousSelection5zctL8(textFieldValue.m6665getSelectiond9O1mEE());
        TransformedText transformedText = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation, textFieldValue.getAnnotatedString());
        switch(WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()]) {
            case 1: goto L7;
            case 2: goto L6;
            default: goto L5;
        };
    L6:
        LayoutModifier layout = new HorizontalScrollLayoutModifier(scrollerPosition, cursorOffset, transformedText, r10);
    L9:
        return ClipKt.clipToBounds($this$defaultTextFieldScroll).then(layout);
    L7:
        layout = new VerticalScrollLayoutModifier(scrollerPosition, cursorOffset, transformedText, r10);
        goto L9
    L5:
        throw new NoWhenBranchMatchedException();
    }

    private static final Rect getCursorRectInScroller(Density $this$getCursorRectInScroller, int cursorOffset, TransformedText transformedText, TextLayoutResult textLayoutResult, boolean rtl, int textFieldWidth) {
        if (textLayoutResult == null) goto L5;
        Rect r0 = textLayoutResult.getCursorRect(transformedText.getOffsetMapping().originalToTransformed(cursorOffset));
        if (r0 == null) goto L5;
    L6:
        Rect cursorRect = r0;
        int thickness = $this$getCursorRectInScroller.mo370roundToPx0680j_4(TextFieldCursor_androidKt.getDefaultCursorThickness());
        if (rtl == false) goto L9;
        float cursorLeft = (textFieldWidth - cursorRect.getLeft()) - thickness;
    L11:
        if (rtl == false) goto L13;
        float cursorRight = textFieldWidth - cursorRect.getLeft();
    L15:
        return Rect.copy$default(cursorRect, cursorLeft, 0.0f, cursorRight, 0.0f, 10, null);
    L13:
        cursorRight = cursorRect.getLeft() + thickness;
        goto L15
    L9:
        cursorLeft = cursorRect.getLeft();
    L5:
        r0 = Rect.Companion.getZero();
        goto L6
    }
}
