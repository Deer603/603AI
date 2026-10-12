package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: TextFieldSelectionManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\"\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"TextFieldSelectionHandle", "", "isStartHandle", "", "direction", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "manager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "(ZLandroidx/compose/ui/text/style/ResolvedTextDirection;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V", "calculateSelectionMagnifierCenterAndroid", "Landroidx/compose/ui/geometry/Offset;", "magnifierSize", "Landroidx/compose/ui/unit/IntSize;", "calculateSelectionMagnifierCenterAndroid-O0kMr_c", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;J)J", "isSelectionHandleInVisibleBound", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextFieldSelectionManagerKt {

    /* JADX INFO: compiled from: TextFieldSelectionManager.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[Handle.values().length];
            r0[Handle.Cursor.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L14:
            r0[Handle.SelectionStart.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L16:
            r0[Handle.SelectionEnd.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L12:
            $EnumSwitchMapping$0 = r0;
        }
    }

    public static final void TextFieldSelectionHandle(final boolean isStartHandle, final ResolvedTextDirection direction, final TextFieldSelectionManager manager, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1344558920);
        ComposerKt.sourceInformation($composer2, "C(TextFieldSelectionHandle)P(1)1030@43111L78,1033@43237L44,1039@43540L51,1032@43195L403:TextFieldSelectionManager.kt#eksfi3");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(isStartHandle) == false) goto L7;
        int r4 = 4;
    L8:
        $dirty = $dirty | r4;
        goto L10
    L7:
        r4 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changed(direction) == false) goto L14;
        int r5 = 32;
    L15:
        $dirty = $dirty | r5;
        goto L17
    L14:
        r5 = 16;
    L17:
        if (($changed & 384) == 0) goto L19;
    L23:
        int $dirty2 = $dirty;
        boolean r6 = false;
        if (($dirty2 & 147) == 146) goto L26;
        boolean r3 = true;
    L28:
        if ($composer2.shouldExecute(r3, $dirty2 & 1) == true) goto L30;
        $composer2.skipToGroupEnd();
    L65:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L69;
        r0.updateScope(new AnonymousClass3(isStartHandle, direction, manager, $changed));
        return;
    L69:
        return;
    L30:
        if (ComposerKt.isTraceInProgress() == false) goto L32;
        ComposerKt.traceEventStart(-1344558920, $dirty2, -1, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:1029)");
    L32:
        ComposerKt.sourceInformationMarkerStart($composer2, 990915550, "CC(remember):TextFieldSelectionManager.kt#9igjgp");
        if (($dirty2 & 14) != 4) goto L35;
        boolean r1 = true;
    L36:
        boolean invalid$iv = r1 | $composer2.changed(manager);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L39;
    L42:
        Object value$iv = manager.handleDragObserver$foundation_release(isStartHandle);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L43:
        final TextDragObserver observer = (TextDragObserver) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 990919548, "CC(remember):TextFieldSelectionManager.kt#9igjgp");
        boolean r2 = $composer2.changedInstance(manager);
        if (($dirty2 & 14) != 4) goto L46;
        r6 = true;
    L46:
        boolean invalid$iv2 = r2 | r6;
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv2 == false) goto L49;
    L52:
        Object value$iv2 = (OffsetProvider) new TextFieldSelectionManagerKt$TextFieldSelectionHandle$1$1(manager, isStartHandle);
        $composer2.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L53:
        OffsetProvider r7 = (OffsetProvider) it$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        boolean r8 = TextRange.m6416getReversedimpl(manager.getValue$foundation_release().m6665getSelectiond9O1mEE());
        float r9 = manager.getHandleLineHeight$foundation_release(isStartHandle);
        Modifier.Companion r10 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart($composer2, 990929251, "CC(remember):TextFieldSelectionManager.kt#9igjgp");
        boolean invalid$iv3 = $composer2.changedInstance(observer);
        Object it$iv3 = $composer2.rememberedValue();
        if (invalid$iv3 == true) goto L59;
        OffsetProvider r20 = r7;
        if (it$iv3 != Composer.Companion.getEmpty()) goto L61;
    L60:
        Object value$iv3 = (PointerInputEventHandler) new TextFieldSelectionManagerKt$TextFieldSelectionHandle$2$1(observer);
        $composer2.updateRememberedValue(value$iv3);
        it$iv3 = value$iv3;
    L61:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        OffsetProvider r11 = r20;
        AndroidSelectionHandles_androidKt.m1428SelectionHandlewLIcFTc(r11, isStartHandle, direction, r8, 0, r9, SuspendingPointerInputFilterKt.pointerInput(r10, observer, (PointerInputEventHandler) it$iv3), $composer2, (($dirty2 << 3) & 112) | (($dirty2 << 3) & 896), 16);
        if (ComposerKt.isTraceInProgress() == false) goto L65;
        ComposerKt.traceEventEnd();
        goto L65
    L59:
        r20 = r7;
        goto L60
    L49:
        if (it$iv2 != Composer.Companion.getEmpty()) goto L53;
    L39:
        if (it$iv != Composer.Companion.getEmpty()) goto L43;
    L35:
        r1 = false;
        goto L36
    L26:
        r3 = false;
        goto L28
    L19:
        if ($composer2.changedInstance(manager) == false) goto L21;
        int r12 = 256;
    L22:
        $dirty = $dirty | r12;
        goto L23
    L21:
        r12 = 128;
        goto L22
    }

    public static final boolean isSelectionHandleInVisibleBound(TextFieldSelectionManager $this$isSelectionHandleInVisibleBound, boolean isStartHandle) {
        LegacyTextFieldState r0 = $this$isSelectionHandleInVisibleBound.getState$foundation_release();
        if (r0 == null) goto L9;
        LayoutCoordinates r1 = r0.getLayoutCoordinates();
        if (r1 == null) goto L9;
        Rect r2 = SelectionManagerKt.visibleBounds(r1);
        if (r2 == null) goto L9;
        return SelectionManagerKt.m1483containsInclusiveUv8p0NA(r2, $this$isSelectionHandleInVisibleBound.m1504getHandlePositiontuRUvjQ$foundation_release(isStartHandle));
    L9:
        return false;
    }

    /* JADX INFO: renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c, reason: not valid java name */
    public static final long m1508calculateSelectionMagnifierCenterAndroidO0kMr_c(TextFieldSelectionManager manager, long magnifierSize) {
        Offset r0 = manager.m1502getCurrentDragPosition_m7T9E();
        if (r0 == null) goto L54;
        long localDragPosition = r0.m4135unboximpl();
        AnnotatedString r2 = manager.getTransformedText$foundation_release();
        if (r2 == null) goto L12;
        boolean r4 = true;
        if (r2.length() != 0) goto L9;
        boolean r3 = true;
    L10:
        if (r3 == true) goto L12;
    L13:
        if (r4 == false) goto L15;
        Handle r5 = manager.getDraggingHandle();
        if (r5 != null) goto L19;
        int r6 = -1;
    L20:
        switch(r6) {
            case -1: goto L52;
            case 0: goto L22;
            case 1: goto L24;
            case 2: goto L24;
            case 3: goto L23;
            default: goto L22;
        };
    L23:
        int rawTextOffset = TextRange.m6412getEndimpl(manager.getValue$foundation_release().m6665getSelectiond9O1mEE());
    L25:
        LegacyTextFieldState r7 = manager.getState$foundation_release();
        if (r7 == null) goto L50;
        TextLayoutResultProxy textLayoutResultProxy = r7.getLayoutResult();
        if (textLayoutResultProxy == null) goto L50;
        LegacyTextFieldState r8 = manager.getState$foundation_release();
        if (r8 == null) goto L47;
        TextDelegate r9 = r8.getTextDelegate();
        if (r9 == null) goto L47;
        AnnotatedString transformedText = r9.getText();
        if (transformedText == null) goto L47;
        int textOffset = RangesKt.coerceIn(manager.getOffsetMapping$foundation_release().originalToTransformed(rawTextOffset), 0, transformedText.length());
        long arg0$iv = textLayoutResultProxy.m1167translateDecorationToInnerCoordinatesMKHz9U$foundation_release(localDragPosition);
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);
        float dragX = Float.intBitsToFloat(bits$iv$iv$iv);
        TextLayoutResult layoutResult = textLayoutResultProxy.getValue();
        int line = layoutResult.getLineForOffset(textOffset);
        float lineStart = layoutResult.getLineLeft(line);
        float lineEnd = layoutResult.getLineRight(line);
        float lineMin = Math.min(lineStart, lineEnd);
        float lineMax = Math.max(lineStart, lineEnd);
        float centerX = RangesKt.coerceIn(dragX, lineMin, lineMax);
        if (IntSize.m7142equalsimpl0(magnifierSize, IntSize.Companion.m7149getZeroYbymL2g()) == false) goto L40;
    L43:
        float top = layoutResult.getLineTop(line);
        float bottom = layoutResult.getLineBottom(line);
        float centerY = ((bottom - top) / 2.0f) + top;
        long v1$iv$iv = Float.floatToRawIntBits(centerX);
        long v2$iv$iv = Float.floatToRawIntBits(centerY);
        return Offset.m4117constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L));
    L40:
        if (Math.abs(dragX - centerX) <= (((int) (magnifierSize >> 32)) / 2)) goto L43;
        return Offset.Companion.m4140getUnspecifiedF1C5BW0();
    L47:
        return Offset.Companion.m4140getUnspecifiedF1C5BW0();
    L50:
        return Offset.Companion.m4140getUnspecifiedF1C5BW0();
    L24:
        rawTextOffset = TextRange.m6417getStartimpl(manager.getValue$foundation_release().m6665getSelectiond9O1mEE());
        goto L25
    L22:
        throw new NoWhenBranchMatchedException();
    L52:
        return Offset.Companion.m4140getUnspecifiedF1C5BW0();
    L19:
        r6 = WhenMappings.$EnumSwitchMapping$0[r5.ordinal()];
        goto L20
    L15:
        return Offset.Companion.m4140getUnspecifiedF1C5BW0();
    L9:
        r3 = false;
    L12:
        r4 = false;
        goto L13
    L54:
        return Offset.Companion.m4140getUnspecifiedF1C5BW0();
    }
}
