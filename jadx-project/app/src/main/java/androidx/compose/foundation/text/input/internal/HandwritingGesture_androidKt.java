package androidx.compose.foundation.text.input.internal;

import android.graphics.PointF;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextGranularity;
import androidx.compose.ui.text.TextInclusionStrategy;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.EditCommand;
import kotlin.Metadata;

/* JADX INFO: compiled from: HandwritingGesture.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0006\"\u00020\u0004H\u0002¢\u0006\u0002\u0010\u0007\u001a\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001e\u0010\u000e\u001a\u00020\t*\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a(\u0010\u0013\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a&\u0010\u001b\u001a\u00020\u0001*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a(\u0010\u001b\u001a\u00020\u0001*\u00020 2\u0006\u0010\u001d\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010!\u001a2\u0010\u001b\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a<\u0010&\u001a\u00020\t*\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a.\u0010,\u001a\u00020\t*\u00020\u001c2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0002ø\u0001\u0000¢\u0006\u0004\b3\u00104\u001a.\u0010,\u001a\u00020\t*\u00020 2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0002ø\u0001\u0000¢\u0006\u0004\b3\u00105\u001a:\u0010,\u001a\u00020\t*\u0004\u0018\u00010\u00142\u0006\u0010-\u001a\u00020.2\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0002ø\u0001\u0000¢\u0006\u0004\b6\u00107\u001a6\u00108\u001a\u00020\t*\u00020\u001c2\u0006\u00109\u001a\u00020.2\u0006\u0010:\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0002ø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a6\u00108\u001a\u00020\t*\u00020 2\u0006\u00109\u001a\u00020.2\u0006\u0010:\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0002ø\u0001\u0000¢\u0006\u0004\b;\u0010=\u001a\u0014\u0010>\u001a\u00020?*\u00020'2\u0006\u0010@\u001a\u00020\u0001H\u0002\u001a\f\u0010A\u001a\u00020?*\u00020\u0001H\u0002\u001a\f\u0010B\u001a\u00020?*\u00020\u0001H\u0002\u001a\f\u0010C\u001a\u00020?*\u00020\u0001H\u0002\u001a\f\u0010D\u001a\u00020?*\u00020\u0001H\u0002\u001a\u0019\u0010E\u001a\u00020\t*\u00020\u00102\u0006\u0010@\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010F\u001a\u0011\u0010G\u001a\u00020\u0016*\u00020HH\u0002¢\u0006\u0002\u0010I\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006J"}, d2 = {"LINE_FEED_CODE_POINT", "", "NBSP_CODE_POINT", "compoundEditCommand", "Landroidx/compose/ui/text/input/EditCommand;", "editCommands", "", "([Landroidx/compose/ui/text/input/EditCommand;)Landroidx/compose/ui/text/input/EditCommand;", "enclosure", "Landroidx/compose/ui/text/TextRange;", "a", "b", "enclosure-pWDy79M", "(JJ)J", "adjustHandwritingDeleteGestureRange", "text", "", "adjustHandwritingDeleteGestureRange-72CqOWE", "(JLjava/lang/CharSequence;)J", "getLineForHandwritingGesture", "Landroidx/compose/ui/text/MultiParagraph;", "localPoint", "Landroidx/compose/ui/geometry/Offset;", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getLineForHandwritingGesture-d-4ec7I", "(Landroidx/compose/ui/text/MultiParagraph;JLandroidx/compose/ui/platform/ViewConfiguration;)I", "getOffsetForHandwritingGesture", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "pointInScreen", "getOffsetForHandwritingGesture-d-4ec7I", "(Landroidx/compose/foundation/text/LegacyTextFieldState;JLandroidx/compose/ui/platform/ViewConfiguration;)I", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;JLandroidx/compose/ui/platform/ViewConfiguration;)I", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getOffsetForHandwritingGesture-ubNVwUQ", "(Landroidx/compose/ui/text/MultiParagraph;JLandroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/platform/ViewConfiguration;)I", "getRangeForRemoveSpaceGesture", "Landroidx/compose/ui/text/TextLayoutResult;", "startPointInScreen", "endPointerInScreen", "getRangeForRemoveSpaceGesture-5iVPX68", "(Landroidx/compose/ui/text/TextLayoutResult;JJLandroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/platform/ViewConfiguration;)J", "getRangeForScreenRect", "rectInScreen", "Landroidx/compose/ui/geometry/Rect;", "granularity", "Landroidx/compose/ui/text/TextGranularity;", "inclusionStrategy", "Landroidx/compose/ui/text/TextInclusionStrategy;", "getRangeForScreenRect-OH9lIzo", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "getRangeForScreenRect-O048IG0", "(Landroidx/compose/ui/text/MultiParagraph;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/layout/LayoutCoordinates;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "getRangeForScreenRects", "startRectInScreen", "endRectInScreen", "getRangeForScreenRects-O048IG0", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "isBiDiBoundary", "", "offset", "isNewline", "isPunctuation", "isWhitespace", "isWhitespaceExceptNewline", "rangeOfWhitespaces", "(Ljava/lang/CharSequence;I)J", "toOffset", "Landroid/graphics/PointF;", "(Landroid/graphics/PointF;)J", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class HandwritingGesture_androidKt {
    private static final int LINE_FEED_CODE_POINT = 10;
    private static final int NBSP_CODE_POINT = 160;

    /* JADX INFO: renamed from: access$adjustHandwritingDeleteGestureRange-72CqOWE, reason: not valid java name */
    public static final /* synthetic */ long m1235access$adjustHandwritingDeleteGestureRange72CqOWE(long $receiver, CharSequence text) {
        return m1243adjustHandwritingDeleteGestureRange72CqOWE($receiver, text);
    }

    public static final /* synthetic */ EditCommand access$compoundEditCommand(EditCommand... editCommands) {
        return compoundEditCommand(editCommands);
    }

    /* JADX INFO: renamed from: access$getOffsetForHandwritingGesture-d-4ec7I, reason: not valid java name */
    public static final /* synthetic */ int m1236access$getOffsetForHandwritingGestured4ec7I(LegacyTextFieldState $receiver, long pointInScreen, ViewConfiguration viewConfiguration) {
        return m1246getOffsetForHandwritingGestured4ec7I($receiver, pointInScreen, viewConfiguration);
    }

    /* JADX INFO: renamed from: access$getOffsetForHandwritingGesture-d-4ec7I, reason: not valid java name */
    public static final /* synthetic */ int m1237access$getOffsetForHandwritingGestured4ec7I(TextLayoutState $receiver, long pointInScreen, ViewConfiguration viewConfiguration) {
        return m1247getOffsetForHandwritingGestured4ec7I($receiver, pointInScreen, viewConfiguration);
    }

    /* JADX INFO: renamed from: access$getRangeForRemoveSpaceGesture-5iVPX68, reason: not valid java name */
    public static final /* synthetic */ long m1238access$getRangeForRemoveSpaceGesture5iVPX68(TextLayoutResult $receiver, long startPointInScreen, long endPointerInScreen, LayoutCoordinates layoutCoordinates, ViewConfiguration viewConfiguration) {
        return m1249getRangeForRemoveSpaceGesture5iVPX68($receiver, startPointInScreen, endPointerInScreen, layoutCoordinates, viewConfiguration);
    }

    /* JADX INFO: renamed from: access$getRangeForScreenRect-OH9lIzo, reason: not valid java name */
    public static final /* synthetic */ long m1239access$getRangeForScreenRectOH9lIzo(LegacyTextFieldState $receiver, Rect rectInScreen, int granularity, TextInclusionStrategy inclusionStrategy) {
        return m1251getRangeForScreenRectOH9lIzo($receiver, rectInScreen, granularity, inclusionStrategy);
    }

    /* JADX INFO: renamed from: access$getRangeForScreenRect-OH9lIzo, reason: not valid java name */
    public static final /* synthetic */ long m1240access$getRangeForScreenRectOH9lIzo(TextLayoutState $receiver, Rect rectInScreen, int granularity, TextInclusionStrategy inclusionStrategy) {
        return m1252getRangeForScreenRectOH9lIzo($receiver, rectInScreen, granularity, inclusionStrategy);
    }

    /* JADX INFO: renamed from: access$getRangeForScreenRects-O048IG0, reason: not valid java name */
    public static final /* synthetic */ long m1241access$getRangeForScreenRectsO048IG0(LegacyTextFieldState $receiver, Rect startRectInScreen, Rect endRectInScreen, int granularity, TextInclusionStrategy inclusionStrategy) {
        return m1253getRangeForScreenRectsO048IG0($receiver, startRectInScreen, endRectInScreen, granularity, inclusionStrategy);
    }

    /* JADX INFO: renamed from: access$getRangeForScreenRects-O048IG0, reason: not valid java name */
    public static final /* synthetic */ long m1242access$getRangeForScreenRectsO048IG0(TextLayoutState $receiver, Rect startRectInScreen, Rect endRectInScreen, int granularity, TextInclusionStrategy inclusionStrategy) {
        return m1254getRangeForScreenRectsO048IG0($receiver, startRectInScreen, endRectInScreen, granularity, inclusionStrategy);
    }

    public static final /* synthetic */ boolean access$isBiDiBoundary(TextLayoutResult $receiver, int offset) {
        return isBiDiBoundary($receiver, offset);
    }

    public static final /* synthetic */ long access$rangeOfWhitespaces(CharSequence $receiver, int offset) {
        return rangeOfWhitespaces($receiver, offset);
    }

    public static final /* synthetic */ long access$toOffset(PointF $receiver) {
        return toOffset($receiver);
    }

    /* JADX INFO: renamed from: adjustHandwritingDeleteGestureRange-72CqOWE, reason: not valid java name */
    private static final long m1243adjustHandwritingDeleteGestureRange72CqOWE(long $this$adjustHandwritingDeleteGestureRange_u2d72CqOWE, CharSequence text) {
        int start = TextRange.m6417getStartimpl($this$adjustHandwritingDeleteGestureRange_u2d72CqOWE);
        int end = TextRange.m6412getEndimpl($this$adjustHandwritingDeleteGestureRange_u2d72CqOWE);
        int codePointAtEnd = 10;
        if (start <= 0) goto L5;
        int codePointBeforeStart = Character.codePointBefore(text, start);
    L7:
        if (end >= text.length()) goto L11;
        codePointAtEnd = Character.codePointAt(text, end);
    L11:
        if (isWhitespaceExceptNewline(codePointBeforeStart) == false) goto L23;
        if (isWhitespace(codePointAtEnd) == true) goto L16;
        if (isPunctuation(codePointAtEnd) == false) goto L23;
    L16:
        start = start - Character.charCount(codePointBeforeStart);
        if (start == 0) goto L21;
        codePointBeforeStart = Character.codePointBefore(text, start);
        if (isWhitespaceExceptNewline(codePointBeforeStart) == true) goto L16;
    L21:
        return TextRangeKt.TextRange(start, end);
    L23:
        if (isWhitespaceExceptNewline(codePointAtEnd) == true) goto L25;
    L34:
        return $this$adjustHandwritingDeleteGestureRange_u2d72CqOWE;
    L25:
        if (isWhitespace(codePointBeforeStart) == true) goto L28;
        if (isPunctuation(codePointBeforeStart) == false) goto L34;
    L28:
        end = end + Character.charCount(codePointAtEnd);
        if (end == text.length()) goto L33;
        codePointAtEnd = Character.codePointAt(text, end);
        if (isWhitespaceExceptNewline(codePointAtEnd) == true) goto L28;
    L33:
        return TextRangeKt.TextRange(start, end);
    L5:
        codePointBeforeStart = 10;
        goto L7
    }

    private static final boolean isNewline(int $this$isNewline) {
        int type = Character.getType($this$isNewline);
        if (type != 14) goto L5;
    L10:
        return true;
    L5:
        if (type == 13) goto L10;
        if ($this$isNewline == 10) goto L10;
        return false;
    }

    private static final boolean isWhitespace(int $this$isWhitespace) {
        if (Character.isWhitespace($this$isWhitespace) == false) goto L5;
    L8:
        return true;
    L5:
        if ($this$isWhitespace == NBSP_CODE_POINT) goto L8;
        return false;
    }

    private static final boolean isWhitespaceExceptNewline(int $this$isWhitespaceExceptNewline) {
        if (isWhitespace($this$isWhitespaceExceptNewline) == true) goto L5;
    L7:
        return false;
    L5:
        if (isNewline($this$isWhitespaceExceptNewline) == true) goto L7;
        return true;
    }

    private static final boolean isPunctuation(int $this$isPunctuation) {
        int type = Character.getType($this$isPunctuation);
        if (type != 23) goto L5;
    L18:
        return true;
    L5:
        if (type == 20) goto L18;
        if (type == 22) goto L18;
        if (type == 30) goto L18;
        if (type == 29) goto L18;
        if (type == 24) goto L18;
        if (type == 21) goto L18;
        return false;
    }

    private static final long toOffset(PointF $this$toOffset) {
        float x$iv = $this$toOffset.x;
        float y$iv = $this$toOffset.y;
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        return Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    }

    /* JADX INFO: renamed from: getRangeForScreenRect-OH9lIzo, reason: not valid java name */
    private static final long m1252getRangeForScreenRectOH9lIzo(TextLayoutState $this$getRangeForScreenRect_u2dOH9lIzo, Rect rectInScreen, int granularity, TextInclusionStrategy inclusionStrategy) {
        TextLayoutResult r0 = $this$getRangeForScreenRect_u2dOH9lIzo.getLayoutResult();
        if (r0 == null) goto L5;
        MultiParagraph r1 = r0.getMultiParagraph();
    L7:
        return m1250getRangeForScreenRectO048IG0(r1, rectInScreen, $this$getRangeForScreenRect_u2dOH9lIzo.getTextLayoutNodeCoordinates(), granularity, inclusionStrategy);
    L5:
        r1 = null;
        goto L7
    }

    /* JADX INFO: renamed from: getRangeForScreenRects-O048IG0, reason: not valid java name */
    private static final long m1254getRangeForScreenRectsO048IG0(TextLayoutState $this$getRangeForScreenRects_u2dO048IG0, Rect startRectInScreen, Rect endRectInScreen, int granularity, TextInclusionStrategy inclusionStrategy) {
        long startRange = m1252getRangeForScreenRectOH9lIzo($this$getRangeForScreenRects_u2dO048IG0, startRectInScreen, granularity, inclusionStrategy);
        if (TextRange.m6411getCollapsedimpl(startRange) == true) goto L5;
        long endRange = m1252getRangeForScreenRectOH9lIzo($this$getRangeForScreenRects_u2dO048IG0, endRectInScreen, granularity, inclusionStrategy);
        if (TextRange.m6411getCollapsedimpl(endRange) == false) goto L11;
        return TextRange.Companion.m6422getZerod9O1mEE();
    L11:
        return m1244enclosurepWDy79M(startRange, endRange);
    L5:
        return TextRange.Companion.m6422getZerod9O1mEE();
    }

    /* JADX INFO: renamed from: getRangeForScreenRect-OH9lIzo, reason: not valid java name */
    private static final long m1251getRangeForScreenRectOH9lIzo(LegacyTextFieldState $this$getRangeForScreenRect_u2dOH9lIzo, Rect rectInScreen, int granularity, TextInclusionStrategy inclusionStrategy) {
        TextLayoutResultProxy r0 = $this$getRangeForScreenRect_u2dOH9lIzo.getLayoutResult();
        if (r0 == null) goto L7;
        TextLayoutResult r1 = r0.getValue();
        if (r1 == null) goto L7;
        MultiParagraph r2 = r1.getMultiParagraph();
    L9:
        return m1250getRangeForScreenRectO048IG0(r2, rectInScreen, $this$getRangeForScreenRect_u2dOH9lIzo.getLayoutCoordinates(), granularity, inclusionStrategy);
    L7:
        r2 = null;
        goto L9
    }

    /* JADX INFO: renamed from: getRangeForScreenRects-O048IG0, reason: not valid java name */
    private static final long m1253getRangeForScreenRectsO048IG0(LegacyTextFieldState $this$getRangeForScreenRects_u2dO048IG0, Rect startRectInScreen, Rect endRectInScreen, int granularity, TextInclusionStrategy inclusionStrategy) {
        long startRange = m1251getRangeForScreenRectOH9lIzo($this$getRangeForScreenRects_u2dO048IG0, startRectInScreen, granularity, inclusionStrategy);
        if (TextRange.m6411getCollapsedimpl(startRange) == true) goto L5;
        long endRange = m1251getRangeForScreenRectOH9lIzo($this$getRangeForScreenRects_u2dO048IG0, endRectInScreen, granularity, inclusionStrategy);
        if (TextRange.m6411getCollapsedimpl(endRange) == false) goto L11;
        return TextRange.Companion.m6422getZerod9O1mEE();
    L11:
        return m1244enclosurepWDy79M(startRange, endRange);
    L5:
        return TextRange.Companion.m6422getZerod9O1mEE();
    }

    private static final long rangeOfWhitespaces(CharSequence $this$rangeOfWhitespaces, int offset) {
        int startOffset = offset;
        int endOffset = offset;
    L3:
        if (startOffset <= 0) goto L9;
        int codePointBeforeStart = CodepointHelpers_jvmKt.codePointBefore($this$rangeOfWhitespaces, startOffset);
        if (isWhitespace(codePointBeforeStart) == false) goto L9;
        startOffset = startOffset - Character.charCount(codePointBeforeStart);
    L9:
        if (endOffset >= $this$rangeOfWhitespaces.length()) goto L15;
        int codePointAtEnd = CodepointHelpers_jvmKt.codePointAt($this$rangeOfWhitespaces, endOffset);
        if (isWhitespace(codePointAtEnd) == false) goto L15;
        endOffset = endOffset + CodepointHelpers_jvmKt.charCount(codePointAtEnd);
    L15:
        return TextRangeKt.TextRange(startOffset, endOffset);
    }

    /* JADX INFO: renamed from: getOffsetForHandwritingGesture-d-4ec7I, reason: not valid java name */
    private static final int m1247getOffsetForHandwritingGestured4ec7I(TextLayoutState $this$getOffsetForHandwritingGesture_u2dd_u2d4ec7I, long pointInScreen, ViewConfiguration viewConfiguration) {
        TextLayoutResult r0 = $this$getOffsetForHandwritingGesture_u2dd_u2d4ec7I.getLayoutResult();
        if (r0 == null) goto L7;
        MultiParagraph r1 = r0.getMultiParagraph();
        if (r1 == null) goto L7;
        return m1248getOffsetForHandwritingGestureubNVwUQ(r1, pointInScreen, $this$getOffsetForHandwritingGesture_u2dd_u2d4ec7I.getTextLayoutNodeCoordinates(), viewConfiguration);
    L7:
        return -1;
    }

    /* JADX INFO: renamed from: getOffsetForHandwritingGesture-d-4ec7I, reason: not valid java name */
    private static final int m1246getOffsetForHandwritingGestured4ec7I(LegacyTextFieldState $this$getOffsetForHandwritingGesture_u2dd_u2d4ec7I, long pointInScreen, ViewConfiguration viewConfiguration) {
        TextLayoutResultProxy r0 = $this$getOffsetForHandwritingGesture_u2dd_u2d4ec7I.getLayoutResult();
        if (r0 == null) goto L9;
        TextLayoutResult r1 = r0.getValue();
        if (r1 == null) goto L9;
        MultiParagraph r2 = r1.getMultiParagraph();
        if (r2 == null) goto L9;
        return m1248getOffsetForHandwritingGestureubNVwUQ(r2, pointInScreen, $this$getOffsetForHandwritingGesture_u2dd_u2d4ec7I.getLayoutCoordinates(), viewConfiguration);
    L9:
        return -1;
    }

    private static final boolean isBiDiBoundary(TextLayoutResult $this$isBiDiBoundary, int offset) {
        int line = $this$isBiDiBoundary.getLineForOffset(offset);
        if (offset == $this$isBiDiBoundary.getLineStart(line)) goto L13;
        if (offset == TextLayoutResult.getLineEnd$default($this$isBiDiBoundary, line, false, 2, null)) goto L13;
        if ($this$isBiDiBoundary.getBidiRunDirection(offset) == $this$isBiDiBoundary.getBidiRunDirection(offset - 1)) goto L11;
        return true;
    L11:
        return false;
    L13:
        if ($this$isBiDiBoundary.getParagraphDirection(offset) == $this$isBiDiBoundary.getBidiRunDirection(offset)) goto L16;
        return true;
    L16:
        return false;
    }

    /* JADX INFO: renamed from: getRangeForScreenRect-O048IG0, reason: not valid java name */
    private static final long m1250getRangeForScreenRectO048IG0(MultiParagraph $this$getRangeForScreenRect_u2dO048IG0, Rect rectInScreen, LayoutCoordinates layoutCoordinates, int granularity, TextInclusionStrategy inclusionStrategy) {
        if ($this$getRangeForScreenRect_u2dO048IG0 == null) goto L8;
        if (layoutCoordinates == null) goto L8;
        long screenOriginInLocal = layoutCoordinates.mo5728screenToLocalMKHz9U(Offset.Companion.m4141getZeroF1C5BW0());
        Rect localRect = rectInScreen.m4162translatek4lQ0M(screenOriginInLocal);
        return $this$getRangeForScreenRect_u2dO048IG0.m6269getRangeForRect86BmAI(localRect, granularity, inclusionStrategy);
    L8:
        return TextRange.Companion.m6422getZerod9O1mEE();
    }

    /* JADX INFO: renamed from: getOffsetForHandwritingGesture-ubNVwUQ, reason: not valid java name */
    private static final int m1248getOffsetForHandwritingGestureubNVwUQ(MultiParagraph $this$getOffsetForHandwritingGesture_u2dubNVwUQ, long pointInScreen, LayoutCoordinates layoutCoordinates, ViewConfiguration viewConfiguration) {
        if (layoutCoordinates == null) goto L9;
        long localPoint = layoutCoordinates.mo5728screenToLocalMKHz9U(pointInScreen);
        int line = m1245getLineForHandwritingGestured4ec7I($this$getOffsetForHandwritingGesture_u2dubNVwUQ, localPoint, viewConfiguration);
        if (line != (-1)) goto L7;
        return -1;
    L7:
        long adjustedPoint = Offset.m4119copydBAh8RU$default(localPoint, 0.0f, ($this$getOffsetForHandwritingGesture_u2dubNVwUQ.getLineTop(line) + $this$getOffsetForHandwritingGesture_u2dubNVwUQ.getLineBottom(line)) / 2.0f, 1, null);
        return $this$getOffsetForHandwritingGesture_u2dubNVwUQ.m6268getOffsetForPositionk4lQ0M(adjustedPoint);
    L9:
        return -1;
    }

    /* JADX INFO: renamed from: getRangeForRemoveSpaceGesture-5iVPX68, reason: not valid java name */
    private static final long m1249getRangeForRemoveSpaceGesture5iVPX68(TextLayoutResult $this$getRangeForRemoveSpaceGesture_u2d5iVPX68, long startPointInScreen, long endPointerInScreen, LayoutCoordinates layoutCoordinates, ViewConfiguration viewConfiguration) {
        if ($this$getRangeForRemoveSpaceGesture_u2d5iVPX68 == null) goto L20;
        if (layoutCoordinates == null) goto L20;
        long localStartPoint = layoutCoordinates.mo5728screenToLocalMKHz9U(startPointInScreen);
        long localEndPoint = layoutCoordinates.mo5728screenToLocalMKHz9U(endPointerInScreen);
        int startLine = m1245getLineForHandwritingGestured4ec7I($this$getRangeForRemoveSpaceGesture_u2d5iVPX68.getMultiParagraph(), localStartPoint, viewConfiguration);
        int endLine = m1245getLineForHandwritingGestured4ec7I($this$getRangeForRemoveSpaceGesture_u2d5iVPX68.getMultiParagraph(), localEndPoint, viewConfiguration);
        if (startLine != (-1)) goto L12;
        if (endLine == (-1)) goto L10;
        int line = endLine;
    L16:
        float lineCenter = ($this$getRangeForRemoveSpaceGesture_u2d5iVPX68.getLineTop(line) + $this$getRangeForRemoveSpaceGesture_u2d5iVPX68.getLineBottom(line)) / 2.0f;
        int bits$iv$iv$iv = (int) (localStartPoint >> 32);
        int bits$iv$iv$iv2 = (int) (localEndPoint >> 32);
        int bits$iv$iv$iv3 = (int) (localStartPoint >> 32);
        int bits$iv$iv$iv4 = (int) (localEndPoint >> 32);
        Rect rect = new Rect(Math.min(Float.intBitsToFloat(bits$iv$iv$iv), Float.intBitsToFloat(bits$iv$iv$iv2)), lineCenter - 0.1f, Math.max(Float.intBitsToFloat(bits$iv$iv$iv3), Float.intBitsToFloat(bits$iv$iv$iv4)), lineCenter + 0.1f);
        return $this$getRangeForRemoveSpaceGesture_u2d5iVPX68.getMultiParagraph().m6269getRangeForRect86BmAI(rect, TextGranularity.Companion.m6379getCharacterDRrd7Zo(), TextInclusionStrategy.Companion.getAnyOverlap());
    L10:
        return TextRange.Companion.m6422getZerod9O1mEE();
    L12:
        if (endLine != (-1)) goto L14;
        int r14 = startLine;
    L15:
        line = r14;
        goto L16
    L14:
        r14 = Math.min(startLine, endLine);
    L20:
        return TextRange.Companion.m6422getZerod9O1mEE();
    }

    /* JADX INFO: renamed from: getLineForHandwritingGesture-d-4ec7I, reason: not valid java name */
    private static final int m1245getLineForHandwritingGestured4ec7I(MultiParagraph $this$getLineForHandwritingGesture_u2dd_u2d4ec7I, long localPoint, ViewConfiguration viewConfiguration) {
        if (viewConfiguration == null) goto L4;
        float lineMargin = viewConfiguration.getHandwritingGestureLineMargin();
    L5:
        int bits$iv$iv$iv = (int) (localPoint & 4294967295L);
        int line = $this$getLineForHandwritingGesture_u2dd_u2d4ec7I.getLineForVerticalPosition(Float.intBitsToFloat(bits$iv$iv$iv));
        int bits$iv$iv$iv2 = (int) (localPoint & 4294967295L);
        if (Float.intBitsToFloat(bits$iv$iv$iv2) < ($this$getLineForHandwritingGesture_u2dd_u2d4ec7I.getLineTop(line) - lineMargin)) goto L17;
        int bits$iv$iv$iv3 = (int) (4294967295L & localPoint);
        if (Float.intBitsToFloat(bits$iv$iv$iv3) > ($this$getLineForHandwritingGesture_u2dd_u2d4ec7I.getLineBottom(line) + lineMargin)) goto L17;
        int bits$iv$iv$iv4 = (int) (localPoint >> 32);
        if (Float.intBitsToFloat(bits$iv$iv$iv4) < (-lineMargin)) goto L16;
        int bits$iv$iv$iv5 = (int) (localPoint >> 32);
        if (Float.intBitsToFloat(bits$iv$iv$iv5) > ($this$getLineForHandwritingGesture_u2dd_u2d4ec7I.getWidth() + lineMargin)) goto L16;
        return line;
    L16:
        return -1;
    L17:
        return -1;
    L4:
        lineMargin = 0.0f;
        goto L5
    }

    private static final EditCommand compoundEditCommand(final EditCommand... editCommands) {
        return new AnonymousClass1(editCommands);
    }

    /* JADX INFO: renamed from: enclosure-pWDy79M, reason: not valid java name */
    private static final long m1244enclosurepWDy79M(long a, long b) {
        return TextRangeKt.TextRange(Math.min(TextRange.m6417getStartimpl(a), TextRange.m6417getStartimpl(a)), Math.max(TextRange.m6412getEndimpl(b), TextRange.m6412getEndimpl(b)));
    }
}
