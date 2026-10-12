.class public final Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;
.super Ljava/lang/Object;
.source "HandwritingGesture.android.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHandwritingGesture.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandwritingGesture.android.kt\nandroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1102:1\n30#2:1103\n53#3,3:1104\n60#3:1108\n60#3:1111\n70#3:1114\n70#3:1117\n70#3:1120\n60#3:1123\n65#4:1107\n65#4:1110\n69#4:1113\n69#4:1116\n69#4:1119\n65#4:1122\n22#5:1109\n22#5:1112\n22#5:1115\n22#5:1118\n22#5:1121\n22#5:1124\n*S KotlinDebug\n*F\n+ 1 HandwritingGesture.android.kt\nandroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt\n*L\n868#1:1103\n868#1:1104,3\n1054#1:1108\n1056#1:1111\n1072#1:1114\n1075#1:1117\n1076#1:1120\n1081#1:1123\n1054#1:1107\n1056#1:1110\n1072#1:1113\n1075#1:1116\n1076#1:1119\n1081#1:1122\n1054#1:1109\n1056#1:1112\n1072#1:1115\n1075#1:1118\n1076#1:1121\n1081#1:1124\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0080\u0001\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\r\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a!\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00040\u0006\"\u00020\u0004H\u0002\u00a2\u0006\u0002\u0010\u0007\u001a\"\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u001e\u0010\u000e\u001a\u00020\t*\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a(\u0010\u0013\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\u001a&\u0010\u001b\u001a\u00020\u0001*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001e\u0010\u001f\u001a(\u0010\u001b\u001a\u00020\u0001*\u00020 2\u0006\u0010\u001d\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001e\u0010!\u001a2\u0010\u001b\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00162\u0008\u0010\"\u001a\u0004\u0018\u00010#2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008$\u0010%\u001a<\u0010&\u001a\u00020\t*\u0004\u0018\u00010\'2\u0006\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u00162\u0008\u0010\"\u001a\u0004\u0018\u00010#2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008*\u0010+\u001a.\u0010,\u001a\u00020\t*\u00020\u001c2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u00083\u00104\u001a.\u0010,\u001a\u00020\t*\u00020 2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u00083\u00105\u001a:\u0010,\u001a\u00020\t*\u0004\u0018\u00010\u00142\u0006\u0010-\u001a\u00020.2\u0008\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u00086\u00107\u001a6\u00108\u001a\u00020\t*\u00020\u001c2\u0006\u00109\u001a\u00020.2\u0006\u0010:\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008;\u0010<\u001a6\u00108\u001a\u00020\t*\u00020 2\u0006\u00109\u001a\u00020.2\u0006\u0010:\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008;\u0010=\u001a\u0014\u0010>\u001a\u00020?*\u00020\'2\u0006\u0010@\u001a\u00020\u0001H\u0002\u001a\u000c\u0010A\u001a\u00020?*\u00020\u0001H\u0002\u001a\u000c\u0010B\u001a\u00020?*\u00020\u0001H\u0002\u001a\u000c\u0010C\u001a\u00020?*\u00020\u0001H\u0002\u001a\u000c\u0010D\u001a\u00020?*\u00020\u0001H\u0002\u001a\u0019\u0010E\u001a\u00020\t*\u00020\u00102\u0006\u0010@\u001a\u00020\u0001H\u0002\u00a2\u0006\u0002\u0010F\u001a\u0011\u0010G\u001a\u00020\u0016*\u00020HH\u0002\u00a2\u0006\u0002\u0010I\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006J"
    }
    d2 = {
        "LINE_FEED_CODE_POINT",
        "",
        "NBSP_CODE_POINT",
        "compoundEditCommand",
        "Landroidx/compose/ui/text/input/EditCommand;",
        "editCommands",
        "",
        "([Landroidx/compose/ui/text/input/EditCommand;)Landroidx/compose/ui/text/input/EditCommand;",
        "enclosure",
        "Landroidx/compose/ui/text/TextRange;",
        "a",
        "b",
        "enclosure-pWDy79M",
        "(JJ)J",
        "adjustHandwritingDeleteGestureRange",
        "text",
        "",
        "adjustHandwritingDeleteGestureRange-72CqOWE",
        "(JLjava/lang/CharSequence;)J",
        "getLineForHandwritingGesture",
        "Landroidx/compose/ui/text/MultiParagraph;",
        "localPoint",
        "Landroidx/compose/ui/geometry/Offset;",
        "viewConfiguration",
        "Landroidx/compose/ui/platform/ViewConfiguration;",
        "getLineForHandwritingGesture-d-4ec7I",
        "(Landroidx/compose/ui/text/MultiParagraph;JLandroidx/compose/ui/platform/ViewConfiguration;)I",
        "getOffsetForHandwritingGesture",
        "Landroidx/compose/foundation/text/LegacyTextFieldState;",
        "pointInScreen",
        "getOffsetForHandwritingGesture-d-4ec7I",
        "(Landroidx/compose/foundation/text/LegacyTextFieldState;JLandroidx/compose/ui/platform/ViewConfiguration;)I",
        "Landroidx/compose/foundation/text/input/internal/TextLayoutState;",
        "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;JLandroidx/compose/ui/platform/ViewConfiguration;)I",
        "layoutCoordinates",
        "Landroidx/compose/ui/layout/LayoutCoordinates;",
        "getOffsetForHandwritingGesture-ubNVwUQ",
        "(Landroidx/compose/ui/text/MultiParagraph;JLandroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/platform/ViewConfiguration;)I",
        "getRangeForRemoveSpaceGesture",
        "Landroidx/compose/ui/text/TextLayoutResult;",
        "startPointInScreen",
        "endPointerInScreen",
        "getRangeForRemoveSpaceGesture-5iVPX68",
        "(Landroidx/compose/ui/text/TextLayoutResult;JJLandroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/platform/ViewConfiguration;)J",
        "getRangeForScreenRect",
        "rectInScreen",
        "Landroidx/compose/ui/geometry/Rect;",
        "granularity",
        "Landroidx/compose/ui/text/TextGranularity;",
        "inclusionStrategy",
        "Landroidx/compose/ui/text/TextInclusionStrategy;",
        "getRangeForScreenRect-OH9lIzo",
        "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J",
        "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J",
        "getRangeForScreenRect-O048IG0",
        "(Landroidx/compose/ui/text/MultiParagraph;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/layout/LayoutCoordinates;ILandroidx/compose/ui/text/TextInclusionStrategy;)J",
        "getRangeForScreenRects",
        "startRectInScreen",
        "endRectInScreen",
        "getRangeForScreenRects-O048IG0",
        "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J",
        "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J",
        "isBiDiBoundary",
        "",
        "offset",
        "isNewline",
        "isPunctuation",
        "isWhitespace",
        "isWhitespaceExceptNewline",
        "rangeOfWhitespaces",
        "(Ljava/lang/CharSequence;I)J",
        "toOffset",
        "Landroid/graphics/PointF;",
        "(Landroid/graphics/PointF;)J",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final LINE_FEED_CODE_POINT:I = 0xa

.field private static final NBSP_CODE_POINT:I = 0xa0


# direct methods
.method public static final synthetic access$adjustHandwritingDeleteGestureRange-72CqOWE(JLjava/lang/CharSequence;)J
    .locals 2
    .param p0, "$receiver"    # J
    .param p2, "text"    # Ljava/lang/CharSequence;

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->adjustHandwritingDeleteGestureRange-72CqOWE(JLjava/lang/CharSequence;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final varargs synthetic access$compoundEditCommand([Landroidx/compose/ui/text/input/EditCommand;)Landroidx/compose/ui/text/input/EditCommand;
    .locals 1
    .param p0, "editCommands"    # [Landroidx/compose/ui/text/input/EditCommand;

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->compoundEditCommand([Landroidx/compose/ui/text/input/EditCommand;)Landroidx/compose/ui/text/input/EditCommand;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$getOffsetForHandwritingGesture-d-4ec7I(Landroidx/compose/foundation/text/LegacyTextFieldState;JLandroidx/compose/ui/platform/ViewConfiguration;)I
    .locals 1
    .param p0, "$receiver"    # Landroidx/compose/foundation/text/LegacyTextFieldState;
    .param p1, "pointInScreen"    # J
    .param p3, "viewConfiguration"    # Landroidx/compose/ui/platform/ViewConfiguration;

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->getOffsetForHandwritingGesture-d-4ec7I(Landroidx/compose/foundation/text/LegacyTextFieldState;JLandroidx/compose/ui/platform/ViewConfiguration;)I

    move-result v0

    return v0
.end method

.method public static final synthetic access$getOffsetForHandwritingGesture-d-4ec7I(Landroidx/compose/foundation/text/input/internal/TextLayoutState;JLandroidx/compose/ui/platform/ViewConfiguration;)I
    .locals 1
    .param p0, "$receiver"    # Landroidx/compose/foundation/text/input/internal/TextLayoutState;
    .param p1, "pointInScreen"    # J
    .param p3, "viewConfiguration"    # Landroidx/compose/ui/platform/ViewConfiguration;

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->getOffsetForHandwritingGesture-d-4ec7I(Landroidx/compose/foundation/text/input/internal/TextLayoutState;JLandroidx/compose/ui/platform/ViewConfiguration;)I

    move-result v0

    return v0
.end method

.method public static final synthetic access$getRangeForRemoveSpaceGesture-5iVPX68(Landroidx/compose/ui/text/TextLayoutResult;JJLandroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/platform/ViewConfiguration;)J
    .locals 2
    .param p0, "$receiver"    # Landroidx/compose/ui/text/TextLayoutResult;
    .param p1, "startPointInScreen"    # J
    .param p3, "endPointerInScreen"    # J
    .param p5, "layoutCoordinates"    # Landroidx/compose/ui/layout/LayoutCoordinates;
    .param p6, "viewConfiguration"    # Landroidx/compose/ui/platform/ViewConfiguration;

    .line 1
    invoke-static/range {p0 .. p6}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->getRangeForRemoveSpaceGesture-5iVPX68(Landroidx/compose/ui/text/TextLayoutResult;JJLandroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/platform/ViewConfiguration;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic access$getRangeForScreenRect-OH9lIzo(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J
    .locals 2
    .param p0, "$receiver"    # Landroidx/compose/foundation/text/LegacyTextFieldState;
    .param p1, "rectInScreen"    # Landroidx/compose/ui/geometry/Rect;
    .param p2, "granularity"    # I
    .param p3, "inclusionStrategy"    # Landroidx/compose/ui/text/TextInclusionStrategy;

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->getRangeForScreenRect-OH9lIzo(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic access$getRangeForScreenRect-OH9lIzo(Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J
    .locals 2
    .param p0, "$receiver"    # Landroidx/compose/foundation/text/input/internal/TextLayoutState;
    .param p1, "rectInScreen"    # Landroidx/compose/ui/geometry/Rect;
    .param p2, "granularity"    # I
    .param p3, "inclusionStrategy"    # Landroidx/compose/ui/text/TextInclusionStrategy;

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->getRangeForScreenRect-OH9lIzo(Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic access$getRangeForScreenRects-O048IG0(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J
    .locals 2
    .param p0, "$receiver"    # Landroidx/compose/foundation/text/LegacyTextFieldState;
    .param p1, "startRectInScreen"    # Landroidx/compose/ui/geometry/Rect;
    .param p2, "endRectInScreen"    # Landroidx/compose/ui/geometry/Rect;
    .param p3, "granularity"    # I
    .param p4, "inclusionStrategy"    # Landroidx/compose/ui/text/TextInclusionStrategy;

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->getRangeForScreenRects-O048IG0(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic access$getRangeForScreenRects-O048IG0(Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J
    .locals 2
    .param p0, "$receiver"    # Landroidx/compose/foundation/text/input/internal/TextLayoutState;
    .param p1, "startRectInScreen"    # Landroidx/compose/ui/geometry/Rect;
    .param p2, "endRectInScreen"    # Landroidx/compose/ui/geometry/Rect;
    .param p3, "granularity"    # I
    .param p4, "inclusionStrategy"    # Landroidx/compose/ui/text/TextInclusionStrategy;

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->getRangeForScreenRects-O048IG0(Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic access$isBiDiBoundary(Landroidx/compose/ui/text/TextLayoutResult;I)Z
    .locals 1
    .param p0, "$receiver"    # Landroidx/compose/ui/text/TextLayoutResult;
    .param p1, "offset"    # I

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->isBiDiBoundary(Landroidx/compose/ui/text/TextLayoutResult;I)Z

    move-result v0

    return v0
.end method

.method public static final synthetic access$rangeOfWhitespaces(Ljava/lang/CharSequence;I)J
    .locals 2
    .param p0, "$receiver"    # Ljava/lang/CharSequence;
    .param p1, "offset"    # I

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->rangeOfWhitespaces(Ljava/lang/CharSequence;I)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic access$toOffset(Landroid/graphics/PointF;)J
    .locals 2
    .param p0, "$receiver"    # Landroid/graphics/PointF;

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->toOffset(Landroid/graphics/PointF;)J

    move-result-wide v0

    return-wide v0
.end method

.method private static final adjustHandwritingDeleteGestureRange-72CqOWE(JLjava/lang/CharSequence;)J
    .locals 6
    .param p0, "$this$adjustHandwritingDeleteGestureRange_u2d72CqOWE"    # J
    .param p2, "text"    # Ljava/lang/CharSequence;

    .line 760
    invoke-static {p0, p1}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    move-result v0

    .line 761
    .local v0, "start":I
    invoke-static {p0, p1}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v1

    .line 766
    .local v1, "end":I
    const/16 v2, 0xa

    if-lez v0, :cond_0

    .line 767
    invoke-static {p2, v0}, Ljava/lang/Character;->codePointBefore(Ljava/lang/CharSequence;I)I

    move-result v3

    goto :goto_0

    .line 769
    :cond_0
    move v3, v2

    .line 766
    :goto_0
    nop

    .line 765
    nop

    .line 774
    .local v3, "codePointBeforeStart":I
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-ge v1, v4, :cond_1

    .line 775
    invoke-static {p2, v1}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v2

    goto :goto_1

    .line 777
    :cond_1
    nop

    .line 774
    :goto_1
    nop

    .line 773
    nop

    .line 780
    .local v2, "codePointAtEnd":I
    nop

    .line 781
    invoke-static {v3}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->isWhitespaceExceptNewline(I)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 782
    invoke-static {v2}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->isWhitespace(I)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-static {v2}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->isPunctuation(I)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 795
    :cond_2
    invoke-static {v3}, Ljava/lang/Character;->charCount(I)I

    move-result v4

    sub-int/2addr v0, v4

    .line 796
    if-eqz v0, :cond_3

    .line 797
    invoke-static {p2, v0}, Ljava/lang/Character;->codePointBefore(Ljava/lang/CharSequence;I)I

    move-result v3

    .line 798
    invoke-static {v3}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->isWhitespaceExceptNewline(I)Z

    move-result v4

    if-nez v4, :cond_2

    .line 799
    :cond_3
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(II)J

    move-result-wide v4

    return-wide v4

    .line 802
    :cond_4
    nop

    .line 803
    invoke-static {v2}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->isWhitespaceExceptNewline(I)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 804
    invoke-static {v3}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->isWhitespace(I)Z

    move-result v4

    if-nez v4, :cond_5

    invoke-static {v3}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->isPunctuation(I)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 815
    :cond_5
    invoke-static {v2}, Ljava/lang/Character;->charCount(I)I

    move-result v4

    add-int/2addr v1, v4

    .line 816
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-eq v1, v4, :cond_6

    .line 817
    invoke-static {p2, v1}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v2

    .line 818
    invoke-static {v2}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->isWhitespaceExceptNewline(I)Z

    move-result v4

    if-nez v4, :cond_5

    .line 819
    :cond_6
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(II)J

    move-result-wide v4

    return-wide v4

    .line 823
    :cond_7
    return-wide p0
.end method

.method private static final varargs compoundEditCommand([Landroidx/compose/ui/text/input/EditCommand;)Landroidx/compose/ui/text/input/EditCommand;
    .locals 1
    .param p0, "editCommands"    # [Landroidx/compose/ui/text/input/EditCommand;

    .line 1089
    new-instance v0, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt$compoundEditCommand$1;

    invoke-direct {v0, p0}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt$compoundEditCommand$1;-><init>([Landroidx/compose/ui/text/input/EditCommand;)V

    check-cast v0, Landroidx/compose/ui/text/input/EditCommand;

    return-object v0
.end method

.method private static final enclosure-pWDy79M(JJ)J
    .locals 3
    .param p0, "a"    # J
    .param p2, "b"    # J

    .line 1100
    invoke-static {p0, p1}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    move-result v0

    invoke-static {p0, p1}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {p2, p3}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v1

    invoke-static {p2, p3}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(II)J

    move-result-wide v0

    return-wide v0
.end method

.method private static final getLineForHandwritingGesture-d-4ec7I(Landroidx/compose/ui/text/MultiParagraph;JLandroidx/compose/ui/platform/ViewConfiguration;)I
    .locals 10
    .param p0, "$this$getLineForHandwritingGesture_u2dd_u2d4ec7I"    # Landroidx/compose/ui/text/MultiParagraph;
    .param p1, "localPoint"    # J
    .param p3, "viewConfiguration"    # Landroidx/compose/ui/platform/ViewConfiguration;

    .line 1071
    if-eqz p3, :cond_0

    invoke-interface {p3}, Landroidx/compose/ui/platform/ViewConfiguration;->getHandwritingGestureLineMargin()F

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 1072
    .local v0, "lineMargin":F
    :goto_0
    const/4 v1, 0x0

    .line 1113
    .local v1, "$i$f$getY-impl":I
    move-wide v2, p1

    .local v2, "value$iv$iv":J
    const/4 v4, 0x0

    .line 1114
    .local v4, "$i$f$unpackFloat2":I
    const-wide v5, 0xffffffffL

    and-long v7, v2, v5

    long-to-int v7, v7

    .local v7, "bits$iv$iv$iv":I
    const/4 v8, 0x0

    .line 1115
    .local v8, "$i$f$floatFromBits":I
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    .line 1114
    .end local v7    # "bits$iv$iv$iv":I
    .end local v8    # "$i$f$floatFromBits":I
    nop

    .line 1113
    .end local v2    # "value$iv$iv":J
    .end local v4    # "$i$f$unpackFloat2":I
    nop

    .line 1072
    .end local v1    # "$i$f$getY-impl":I
    invoke-virtual {p0, v7}, Landroidx/compose/ui/text/MultiParagraph;->getLineForVerticalPosition(F)I

    move-result v1

    .line 1074
    .local v1, "line":I
    nop

    .line 1075
    const/4 v2, 0x0

    .line 1116
    .local v2, "$i$f$getY-impl":I
    move-wide v3, p1

    .local v3, "value$iv$iv":J
    const/4 v7, 0x0

    .line 1117
    .local v7, "$i$f$unpackFloat2":I
    and-long v8, v3, v5

    long-to-int v8, v8

    .local v8, "bits$iv$iv$iv":I
    const/4 v9, 0x0

    .line 1118
    .local v9, "$i$f$floatFromBits":I
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v8

    .line 1117
    .end local v8    # "bits$iv$iv$iv":I
    .end local v9    # "$i$f$floatFromBits":I
    nop

    .line 1116
    .end local v3    # "value$iv$iv":J
    .end local v7    # "$i$f$unpackFloat2":I
    nop

    .line 1075
    .end local v2    # "$i$f$getY-impl":I
    invoke-virtual {p0, v1}, Landroidx/compose/ui/text/MultiParagraph;->getLineTop(I)F

    move-result v2

    sub-float/2addr v2, v0

    cmpg-float v2, v8, v2

    const/4 v3, -0x1

    if-ltz v2, :cond_4

    .line 1076
    const/4 v2, 0x0

    .line 1119
    .restart local v2    # "$i$f$getY-impl":I
    move-wide v7, p1

    .local v7, "value$iv$iv":J
    const/4 v4, 0x0

    .line 1120
    .restart local v4    # "$i$f$unpackFloat2":I
    and-long/2addr v5, v7

    long-to-int v5, v5

    .local v5, "bits$iv$iv$iv":I
    const/4 v6, 0x0

    .line 1121
    .local v6, "$i$f$floatFromBits":I
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    .line 1120
    .end local v5    # "bits$iv$iv$iv":I
    .end local v6    # "$i$f$floatFromBits":I
    nop

    .line 1119
    .end local v4    # "$i$f$unpackFloat2":I
    .end local v7    # "value$iv$iv":J
    nop

    .line 1076
    .end local v2    # "$i$f$getY-impl":I
    invoke-virtual {p0, v1}, Landroidx/compose/ui/text/MultiParagraph;->getLineBottom(I)F

    move-result v2

    add-float/2addr v2, v0

    cmpl-float v2, v5, v2

    if-lez v2, :cond_1

    goto :goto_2

    .line 1081
    :cond_1
    const/4 v2, 0x0

    .line 1122
    .local v2, "$i$f$getX-impl":I
    move-wide v4, p1

    .local v4, "value$iv$iv":J
    const/4 v6, 0x0

    .line 1123
    .local v6, "$i$f$unpackFloat1":I
    const/16 v7, 0x20

    shr-long v8, v4, v7

    long-to-int v8, v8

    .restart local v8    # "bits$iv$iv$iv":I
    const/4 v9, 0x0

    .line 1124
    .restart local v9    # "$i$f$floatFromBits":I
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v8

    .line 1123
    .end local v8    # "bits$iv$iv$iv":I
    .end local v9    # "$i$f$floatFromBits":I
    nop

    .line 1122
    .end local v4    # "value$iv$iv":J
    .end local v6    # "$i$f$unpackFloat1":I
    nop

    .line 1081
    .end local v2    # "$i$f$getX-impl":I
    neg-float v2, v0

    cmpg-float v2, v8, v2

    if-ltz v2, :cond_3

    const/4 v2, 0x0

    .line 1122
    .restart local v2    # "$i$f$getX-impl":I
    move-wide v4, p1

    .restart local v4    # "value$iv$iv":J
    const/4 v6, 0x0

    .line 1123
    .restart local v6    # "$i$f$unpackFloat1":I
    shr-long v7, v4, v7

    long-to-int v7, v7

    .local v7, "bits$iv$iv$iv":I
    const/4 v8, 0x0

    .line 1124
    .local v8, "$i$f$floatFromBits":I
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    .line 1123
    .end local v7    # "bits$iv$iv$iv":I
    .end local v8    # "$i$f$floatFromBits":I
    nop

    .line 1122
    .end local v4    # "value$iv$iv":J
    .end local v6    # "$i$f$unpackFloat1":I
    nop

    .line 1081
    .end local v2    # "$i$f$getX-impl":I
    invoke-virtual {p0}, Landroidx/compose/ui/text/MultiParagraph;->getWidth()F

    move-result v2

    add-float/2addr v2, v0

    cmpl-float v2, v7, v2

    if-lez v2, :cond_2

    goto :goto_1

    .line 1085
    :cond_2
    return v1

    .line 1083
    :cond_3
    :goto_1
    return v3

    .line 1079
    :cond_4
    :goto_2
    return v3
.end method

.method private static final getOffsetForHandwritingGesture-d-4ec7I(Landroidx/compose/foundation/text/LegacyTextFieldState;JLandroidx/compose/ui/platform/ViewConfiguration;)I
    .locals 2
    .param p0, "$this$getOffsetForHandwritingGesture_u2dd_u2d4ec7I"    # Landroidx/compose/foundation/text/LegacyTextFieldState;
    .param p1, "pointInScreen"    # J
    .param p3, "viewConfiguration"    # Landroidx/compose/ui/platform/ViewConfiguration;

    .line 975
    nop

    .line 978
    nop

    .line 977
    nop

    .line 975
    invoke-virtual {p0}, Landroidx/compose/foundation/text/LegacyTextFieldState;->getLayoutResult()Landroidx/compose/foundation/text/TextLayoutResultProxy;

    move-result-object v0

    .line 976
    if-eqz v0, :cond_0

    .line 975
    nop

    .line 976
    invoke-virtual {v0}, Landroidx/compose/foundation/text/TextLayoutResultProxy;->getValue()Landroidx/compose/ui/text/TextLayoutResult;

    move-result-object v0

    .line 977
    if-eqz v0, :cond_0

    .line 976
    nop

    .line 977
    invoke-virtual {v0}, Landroidx/compose/ui/text/TextLayoutResult;->getMultiParagraph()Landroidx/compose/ui/text/MultiParagraph;

    move-result-object v0

    .line 978
    if-eqz v0, :cond_0

    .line 977
    nop

    .line 978
    invoke-virtual {p0}, Landroidx/compose/foundation/text/LegacyTextFieldState;->getLayoutCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v1

    invoke-static {v0, p1, p2, v1, p3}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->getOffsetForHandwritingGesture-ubNVwUQ(Landroidx/compose/ui/text/MultiParagraph;JLandroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/platform/ViewConfiguration;)I

    move-result v0

    .line 975
    goto :goto_0

    .line 978
    :cond_0
    const/4 v0, -0x1

    .line 975
    :goto_0
    return v0
.end method

.method private static final getOffsetForHandwritingGesture-d-4ec7I(Landroidx/compose/foundation/text/input/internal/TextLayoutState;JLandroidx/compose/ui/platform/ViewConfiguration;)I
    .locals 2
    .param p0, "$this$getOffsetForHandwritingGesture_u2dd_u2d4ec7I"    # Landroidx/compose/foundation/text/input/internal/TextLayoutState;
    .param p1, "pointInScreen"    # J
    .param p3, "viewConfiguration"    # Landroidx/compose/ui/platform/ViewConfiguration;

    .line 962
    nop

    .line 964
    nop

    .line 962
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/internal/TextLayoutState;->getLayoutResult()Landroidx/compose/ui/text/TextLayoutResult;

    move-result-object v0

    .line 963
    if-eqz v0, :cond_0

    .line 962
    nop

    .line 963
    invoke-virtual {v0}, Landroidx/compose/ui/text/TextLayoutResult;->getMultiParagraph()Landroidx/compose/ui/text/MultiParagraph;

    move-result-object v0

    .line 964
    if-eqz v0, :cond_0

    .line 963
    nop

    .line 965
    nop

    .line 966
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/internal/TextLayoutState;->getTextLayoutNodeCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v1

    .line 967
    nop

    .line 964
    invoke-static {v0, p1, p2, v1, p3}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->getOffsetForHandwritingGesture-ubNVwUQ(Landroidx/compose/ui/text/MultiParagraph;JLandroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/platform/ViewConfiguration;)I

    move-result v0

    .line 962
    goto :goto_0

    .line 968
    :cond_0
    const/4 v0, -0x1

    .line 962
    :goto_0
    return v0
.end method

.method private static final getOffsetForHandwritingGesture-ubNVwUQ(Landroidx/compose/ui/text/MultiParagraph;JLandroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/platform/ViewConfiguration;)I
    .locals 9
    .param p0, "$this$getOffsetForHandwritingGesture_u2dubNVwUQ"    # Landroidx/compose/ui/text/MultiParagraph;
    .param p1, "pointInScreen"    # J
    .param p3, "layoutCoordinates"    # Landroidx/compose/ui/layout/LayoutCoordinates;
    .param p4, "viewConfiguration"    # Landroidx/compose/ui/platform/ViewConfiguration;

    .line 1011
    const/4 v0, -0x1

    if-eqz p3, :cond_1

    invoke-interface {p3, p1, p2}, Landroidx/compose/ui/layout/LayoutCoordinates;->screenToLocal-MK-Hz9U(J)J

    move-result-wide v1

    move-wide v3, v1

    .line 1012
    .local v3, "localPoint":J
    invoke-static {p0, v3, v4, p4}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->getLineForHandwritingGesture-d-4ec7I(Landroidx/compose/ui/text/MultiParagraph;JLandroidx/compose/ui/platform/ViewConfiguration;)I

    move-result v1

    .line 1013
    .local v1, "line":I
    if-ne v1, v0, :cond_0

    return v0

    .line 1015
    :cond_0
    invoke-virtual {p0, v1}, Landroidx/compose/ui/text/MultiParagraph;->getLineTop(I)F

    move-result v0

    invoke-virtual {p0, v1}, Landroidx/compose/ui/text/MultiParagraph;->getLineBottom(I)F

    move-result v2

    add-float/2addr v0, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float v6, v0, v2

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Landroidx/compose/ui/geometry/Offset;->copy-dBAh8RU$default(JFFILjava/lang/Object;)J

    move-result-wide v5

    .line 1016
    .local v5, "adjustedPoint":J
    invoke-virtual {p0, v5, v6}, Landroidx/compose/ui/text/MultiParagraph;->getOffsetForPosition-k-4lQ0M(J)I

    move-result v0

    return v0

    .line 1011
    .end local v1    # "line":I
    .end local v3    # "localPoint":J
    .end local v5    # "adjustedPoint":J
    :cond_1
    return v0
.end method

.method private static final getRangeForRemoveSpaceGesture-5iVPX68(Landroidx/compose/ui/text/TextLayoutResult;JJLandroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/platform/ViewConfiguration;)J
    .locals 23
    .param p0, "$this$getRangeForRemoveSpaceGesture_u2d5iVPX68"    # Landroidx/compose/ui/text/TextLayoutResult;
    .param p1, "startPointInScreen"    # J
    .param p3, "endPointerInScreen"    # J
    .param p5, "layoutCoordinates"    # Landroidx/compose/ui/layout/LayoutCoordinates;
    .param p6, "viewConfiguration"    # Landroidx/compose/ui/platform/ViewConfiguration;

    .line 1025
    move-object/from16 v0, p0

    move-object/from16 v1, p5

    move-object/from16 v2, p6

    if-eqz v0, :cond_4

    if-nez v1, :cond_0

    move-wide/from16 v7, p3

    goto/16 :goto_2

    .line 1028
    :cond_0
    move-wide/from16 v3, p1

    invoke-interface {v1, v3, v4}, Landroidx/compose/ui/layout/LayoutCoordinates;->screenToLocal-MK-Hz9U(J)J

    move-result-wide v5

    .line 1029
    .local v5, "localStartPoint":J
    move-wide/from16 v7, p3

    invoke-interface {v1, v7, v8}, Landroidx/compose/ui/layout/LayoutCoordinates;->screenToLocal-MK-Hz9U(J)J

    move-result-wide v9

    .line 1030
    .local v9, "localEndPoint":J
    invoke-virtual {v0}, Landroidx/compose/ui/text/TextLayoutResult;->getMultiParagraph()Landroidx/compose/ui/text/MultiParagraph;

    move-result-object v11

    invoke-static {v11, v5, v6, v2}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->getLineForHandwritingGesture-d-4ec7I(Landroidx/compose/ui/text/MultiParagraph;JLandroidx/compose/ui/platform/ViewConfiguration;)I

    move-result v11

    .line 1031
    .local v11, "startLine":I
    invoke-virtual {v0}, Landroidx/compose/ui/text/TextLayoutResult;->getMultiParagraph()Landroidx/compose/ui/text/MultiParagraph;

    move-result-object v12

    invoke-static {v12, v9, v10, v2}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->getLineForHandwritingGesture-d-4ec7I(Landroidx/compose/ui/text/MultiParagraph;JLandroidx/compose/ui/platform/ViewConfiguration;)I

    move-result v12

    .line 1032
    .local v12, "endLine":I
    const/4 v13, 0x0

    .line 1034
    .local v13, "line":I
    const/4 v14, -0x1

    if-ne v11, v14, :cond_2

    .line 1036
    if-ne v12, v14, :cond_1

    sget-object v14, Landroidx/compose/ui/text/TextRange;->Companion:Landroidx/compose/ui/text/TextRange$Companion;

    invoke-virtual {v14}, Landroidx/compose/ui/text/TextRange$Companion;->getZero-d9O1mEE()J

    move-result-wide v14

    return-wide v14

    .line 1037
    :cond_1
    move v13, v12

    goto :goto_1

    .line 1040
    :cond_2
    if-ne v12, v14, :cond_3

    .line 1041
    move v14, v11

    goto :goto_0

    .line 1046
    :cond_3
    invoke-static {v11, v12}, Ljava/lang/Math;->min(II)I

    move-result v14

    .line 1039
    :goto_0
    move v13, v14

    .line 1050
    :goto_1
    invoke-virtual {v0, v13}, Landroidx/compose/ui/text/TextLayoutResult;->getLineTop(I)F

    move-result v14

    invoke-virtual {v0, v13}, Landroidx/compose/ui/text/TextLayoutResult;->getLineBottom(I)F

    move-result v15

    add-float/2addr v14, v15

    const/high16 v15, 0x40000000    # 2.0f

    div-float/2addr v14, v15

    .line 1053
    .local v14, "lineCenter":F
    new-instance v15, Landroidx/compose/ui/geometry/Rect;

    .line 1054
    const/16 v16, 0x0

    .line 1107
    .local v16, "$i$f$getX-impl":I
    move-wide/from16 v17, v5

    .local v17, "value$iv$iv":J
    const/16 v19, 0x0

    .line 1108
    .local v19, "$i$f$unpackFloat1":I
    const/16 v20, 0x20

    shr-long v0, v17, v20

    long-to-int v0, v0

    .local v0, "bits$iv$iv$iv":I
    const/4 v1, 0x0

    .line 1109
    .local v1, "$i$f$floatFromBits":I
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    .line 1108
    .end local v0    # "bits$iv$iv$iv":I
    .end local v1    # "$i$f$floatFromBits":I
    nop

    .line 1107
    .end local v17    # "value$iv$iv":J
    .end local v19    # "$i$f$unpackFloat1":I
    nop

    .line 1054
    .end local v16    # "$i$f$getX-impl":I
    const/4 v1, 0x0

    .line 1107
    .local v1, "$i$f$getX-impl":I
    move-wide/from16 v16, v9

    .local v16, "value$iv$iv":J
    const/16 v18, 0x0

    .line 1108
    .local v18, "$i$f$unpackFloat1":I
    move/from16 v19, v1

    .end local v1    # "$i$f$getX-impl":I
    .local v19, "$i$f$getX-impl":I
    shr-long v1, v16, v20

    long-to-int v1, v1

    .local v1, "bits$iv$iv$iv":I
    const/4 v2, 0x0

    .line 1109
    .local v2, "$i$f$floatFromBits":I
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    .line 1108
    .end local v1    # "bits$iv$iv$iv":I
    .end local v2    # "$i$f$floatFromBits":I
    nop

    .line 1107
    .end local v16    # "value$iv$iv":J
    .end local v18    # "$i$f$unpackFloat1":I
    nop

    .line 1054
    .end local v19    # "$i$f$getX-impl":I
    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    .line 1055
    const v1, 0x3dcccccd    # 0.1f

    sub-float v2, v14, v1

    .line 1056
    const/16 v16, 0x0

    .line 1110
    .local v16, "$i$f$getX-impl":I
    move-wide/from16 v17, v5

    .restart local v17    # "value$iv$iv":J
    const/16 v19, 0x0

    .line 1111
    .local v19, "$i$f$unpackFloat1":I
    move/from16 v21, v1

    move/from16 v22, v2

    shr-long v1, v17, v20

    long-to-int v1, v1

    .restart local v1    # "bits$iv$iv$iv":I
    const/4 v2, 0x0

    .line 1112
    .restart local v2    # "$i$f$floatFromBits":I
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    .line 1111
    .end local v1    # "bits$iv$iv$iv":I
    .end local v2    # "$i$f$floatFromBits":I
    nop

    .line 1110
    .end local v17    # "value$iv$iv":J
    .end local v19    # "$i$f$unpackFloat1":I
    nop

    .line 1056
    .end local v16    # "$i$f$getX-impl":I
    const/4 v2, 0x0

    .line 1110
    .local v2, "$i$f$getX-impl":I
    move-wide/from16 v16, v9

    .local v16, "value$iv$iv":J
    const/16 v18, 0x0

    .line 1111
    .restart local v18    # "$i$f$unpackFloat1":I
    move v4, v2

    .end local v2    # "$i$f$getX-impl":I
    .local v4, "$i$f$getX-impl":I
    shr-long v2, v16, v20

    long-to-int v2, v2

    .local v2, "bits$iv$iv$iv":I
    const/4 v3, 0x0

    .line 1112
    .local v3, "$i$f$floatFromBits":I
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    .line 1111
    .end local v2    # "bits$iv$iv$iv":I
    .end local v3    # "$i$f$floatFromBits":I
    nop

    .line 1110
    .end local v16    # "value$iv$iv":J
    .end local v18    # "$i$f$unpackFloat1":I
    nop

    .line 1056
    .end local v4    # "$i$f$getX-impl":I
    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    .line 1057
    add-float v2, v14, v21

    .line 1053
    move/from16 v3, v22

    invoke-direct {v15, v0, v3, v1, v2}, Landroidx/compose/ui/geometry/Rect;-><init>(FFFF)V

    .line 1052
    nop

    .line 1060
    .local v15, "rect":Landroidx/compose/ui/geometry/Rect;
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/text/TextLayoutResult;->getMultiParagraph()Landroidx/compose/ui/text/MultiParagraph;

    move-result-object v0

    .line 1061
    nop

    .line 1062
    sget-object v1, Landroidx/compose/ui/text/TextGranularity;->Companion:Landroidx/compose/ui/text/TextGranularity$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/TextGranularity$Companion;->getCharacter-DRrd7Zo()I

    move-result v1

    .line 1063
    sget-object v2, Landroidx/compose/ui/text/TextInclusionStrategy;->Companion:Landroidx/compose/ui/text/TextInclusionStrategy$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/text/TextInclusionStrategy$Companion;->getAnyOverlap()Landroidx/compose/ui/text/TextInclusionStrategy;

    move-result-object v2

    .line 1060
    invoke-virtual {v0, v15, v1, v2}, Landroidx/compose/ui/text/MultiParagraph;->getRangeForRect-8-6BmAI(Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J

    move-result-wide v0

    return-wide v0

    .line 1025
    .end local v5    # "localStartPoint":J
    .end local v9    # "localEndPoint":J
    .end local v11    # "startLine":I
    .end local v12    # "endLine":I
    .end local v13    # "line":I
    .end local v14    # "lineCenter":F
    .end local v15    # "rect":Landroidx/compose/ui/geometry/Rect;
    :cond_4
    move-wide/from16 v7, p3

    .line 1026
    :goto_2
    sget-object v0, Landroidx/compose/ui/text/TextRange;->Companion:Landroidx/compose/ui/text/TextRange$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/TextRange$Companion;->getZero-d9O1mEE()J

    move-result-wide v0

    return-wide v0
.end method

.method private static final getRangeForScreenRect-O048IG0(Landroidx/compose/ui/text/MultiParagraph;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/layout/LayoutCoordinates;ILandroidx/compose/ui/text/TextInclusionStrategy;)J
    .locals 5
    .param p0, "$this$getRangeForScreenRect_u2dO048IG0"    # Landroidx/compose/ui/text/MultiParagraph;
    .param p1, "rectInScreen"    # Landroidx/compose/ui/geometry/Rect;
    .param p2, "layoutCoordinates"    # Landroidx/compose/ui/layout/LayoutCoordinates;
    .param p3, "granularity"    # I
    .param p4, "inclusionStrategy"    # Landroidx/compose/ui/text/TextInclusionStrategy;

    .line 997
    if-eqz p0, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    .line 1001
    :cond_0
    sget-object v0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    move-result-wide v0

    invoke-interface {p2, v0, v1}, Landroidx/compose/ui/layout/LayoutCoordinates;->screenToLocal-MK-Hz9U(J)J

    move-result-wide v0

    .line 1002
    .local v0, "screenOriginInLocal":J
    invoke-virtual {p1, v0, v1}, Landroidx/compose/ui/geometry/Rect;->translate-k-4lQ0M(J)Landroidx/compose/ui/geometry/Rect;

    move-result-object v2

    .line 1003
    .local v2, "localRect":Landroidx/compose/ui/geometry/Rect;
    invoke-virtual {p0, v2, p3, p4}, Landroidx/compose/ui/text/MultiParagraph;->getRangeForRect-8-6BmAI(Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J

    move-result-wide v3

    return-wide v3

    .line 998
    .end local v0    # "screenOriginInLocal":J
    .end local v2    # "localRect":Landroidx/compose/ui/geometry/Rect;
    :cond_1
    :goto_0
    sget-object v0, Landroidx/compose/ui/text/TextRange;->Companion:Landroidx/compose/ui/text/TextRange$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/TextRange$Companion;->getZero-d9O1mEE()J

    move-result-wide v0

    return-wide v0
.end method

.method private static final getRangeForScreenRect-OH9lIzo(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J
    .locals 2
    .param p0, "$this$getRangeForScreenRect_u2dOH9lIzo"    # Landroidx/compose/foundation/text/LegacyTextFieldState;
    .param p1, "rectInScreen"    # Landroidx/compose/ui/geometry/Rect;
    .param p2, "granularity"    # I
    .param p3, "inclusionStrategy"    # Landroidx/compose/ui/text/TextInclusionStrategy;

    .line 910
    nop

    .line 911
    nop

    .line 909
    invoke-virtual {p0}, Landroidx/compose/foundation/text/LegacyTextFieldState;->getLayoutResult()Landroidx/compose/foundation/text/TextLayoutResultProxy;

    move-result-object v0

    .line 910
    if-eqz v0, :cond_0

    .line 909
    nop

    .line 910
    invoke-virtual {v0}, Landroidx/compose/foundation/text/TextLayoutResultProxy;->getValue()Landroidx/compose/ui/text/TextLayoutResult;

    move-result-object v0

    .line 911
    if-eqz v0, :cond_0

    .line 910
    nop

    .line 911
    invoke-virtual {v0}, Landroidx/compose/ui/text/TextLayoutResult;->getMultiParagraph()Landroidx/compose/ui/text/MultiParagraph;

    move-result-object v0

    goto :goto_0

    .line 910
    :cond_0
    const/4 v0, 0x0

    .line 912
    :goto_0
    invoke-virtual {p0}, Landroidx/compose/foundation/text/LegacyTextFieldState;->getLayoutCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v1

    invoke-static {v0, p1, v1, p2, p3}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->getRangeForScreenRect-O048IG0(Landroidx/compose/ui/text/MultiParagraph;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/layout/LayoutCoordinates;ILandroidx/compose/ui/text/TextInclusionStrategy;)J

    move-result-wide v0

    .line 909
    return-wide v0
.end method

.method private static final getRangeForScreenRect-OH9lIzo(Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J
    .locals 2
    .param p0, "$this$getRangeForScreenRect_u2dOH9lIzo"    # Landroidx/compose/foundation/text/input/internal/TextLayoutState;
    .param p1, "rectInScreen"    # Landroidx/compose/ui/geometry/Rect;
    .param p2, "granularity"    # I
    .param p3, "inclusionStrategy"    # Landroidx/compose/ui/text/TextInclusionStrategy;

    .line 876
    nop

    .line 875
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/internal/TextLayoutState;->getLayoutResult()Landroidx/compose/ui/text/TextLayoutResult;

    move-result-object v0

    .line 876
    if-eqz v0, :cond_0

    .line 875
    nop

    .line 876
    invoke-virtual {v0}, Landroidx/compose/ui/text/TextLayoutResult;->getMultiParagraph()Landroidx/compose/ui/text/MultiParagraph;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 878
    :goto_0
    nop

    .line 879
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/internal/TextLayoutState;->getTextLayoutNodeCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v1

    .line 880
    nop

    .line 881
    nop

    .line 877
    invoke-static {v0, p1, v1, p2, p3}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->getRangeForScreenRect-O048IG0(Landroidx/compose/ui/text/MultiParagraph;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/layout/LayoutCoordinates;ILandroidx/compose/ui/text/TextInclusionStrategy;)J

    move-result-wide v0

    .line 875
    return-wide v0
.end method

.method private static final getRangeForScreenRects-O048IG0(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J
    .locals 8
    .param p0, "$this$getRangeForScreenRects_u2dO048IG0"    # Landroidx/compose/foundation/text/LegacyTextFieldState;
    .param p1, "startRectInScreen"    # Landroidx/compose/ui/geometry/Rect;
    .param p2, "endRectInScreen"    # Landroidx/compose/ui/geometry/Rect;
    .param p3, "granularity"    # I
    .param p4, "inclusionStrategy"    # Landroidx/compose/ui/text/TextInclusionStrategy;

    .line 922
    invoke-static {p0, p1, p3, p4}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->getRangeForScreenRect-OH9lIzo(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J

    move-result-wide v0

    move-wide v2, v0

    .local v2, "$this$getRangeForScreenRects_O048IG0_u24lambda_u242":J
    const/4 v4, 0x0

    .line 923
    .local v4, "$i$a$-apply-HandwritingGesture_androidKt$getRangeForScreenRects$startRange$2":I
    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v0, Landroidx/compose/ui/text/TextRange;->Companion:Landroidx/compose/ui/text/TextRange$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/TextRange$Companion;->getZero-d9O1mEE()J

    move-result-wide v0

    return-wide v0

    .line 924
    :cond_0
    nop

    .line 922
    .end local v2    # "$this$getRangeForScreenRects_O048IG0_u24lambda_u242":J
    .end local v4    # "$i$a$-apply-HandwritingGesture_androidKt$getRangeForScreenRects$startRange$2":I
    nop

    .line 921
    nop

    .line 927
    .local v0, "startRange":J
    invoke-static {p0, p2, p3, p4}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->getRangeForScreenRect-OH9lIzo(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J

    move-result-wide v2

    move-wide v4, v2

    .local v4, "$this$getRangeForScreenRects_O048IG0_u24lambda_u243":J
    const/4 v6, 0x0

    .line 928
    .local v6, "$i$a$-apply-HandwritingGesture_androidKt$getRangeForScreenRects$endRange$2":I
    invoke-static {v4, v5}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v7

    if-eqz v7, :cond_1

    sget-object v2, Landroidx/compose/ui/text/TextRange;->Companion:Landroidx/compose/ui/text/TextRange$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/text/TextRange$Companion;->getZero-d9O1mEE()J

    move-result-wide v2

    return-wide v2

    .line 929
    :cond_1
    nop

    .line 927
    .end local v4    # "$this$getRangeForScreenRects_O048IG0_u24lambda_u243":J
    .end local v6    # "$i$a$-apply-HandwritingGesture_androidKt$getRangeForScreenRects$endRange$2":I
    nop

    .line 926
    nop

    .line 931
    .local v2, "endRange":J
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->enclosure-pWDy79M(JJ)J

    move-result-wide v4

    return-wide v4
.end method

.method private static final getRangeForScreenRects-O048IG0(Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J
    .locals 8
    .param p0, "$this$getRangeForScreenRects_u2dO048IG0"    # Landroidx/compose/foundation/text/input/internal/TextLayoutState;
    .param p1, "startRectInScreen"    # Landroidx/compose/ui/geometry/Rect;
    .param p2, "endRectInScreen"    # Landroidx/compose/ui/geometry/Rect;
    .param p3, "granularity"    # I
    .param p4, "inclusionStrategy"    # Landroidx/compose/ui/text/TextInclusionStrategy;

    .line 892
    invoke-static {p0, p1, p3, p4}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->getRangeForScreenRect-OH9lIzo(Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J

    move-result-wide v0

    move-wide v2, v0

    .local v2, "$this$getRangeForScreenRects_O048IG0_u24lambda_u240":J
    const/4 v4, 0x0

    .line 893
    .local v4, "$i$a$-apply-HandwritingGesture_androidKt$getRangeForScreenRects$startRange$1":I
    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v0, Landroidx/compose/ui/text/TextRange;->Companion:Landroidx/compose/ui/text/TextRange$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/TextRange$Companion;->getZero-d9O1mEE()J

    move-result-wide v0

    return-wide v0

    .line 894
    :cond_0
    nop

    .line 892
    .end local v2    # "$this$getRangeForScreenRects_O048IG0_u24lambda_u240":J
    .end local v4    # "$i$a$-apply-HandwritingGesture_androidKt$getRangeForScreenRects$startRange$1":I
    nop

    .line 891
    nop

    .line 897
    .local v0, "startRange":J
    invoke-static {p0, p2, p3, p4}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->getRangeForScreenRect-OH9lIzo(Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J

    move-result-wide v2

    move-wide v4, v2

    .local v4, "$this$getRangeForScreenRects_O048IG0_u24lambda_u241":J
    const/4 v6, 0x0

    .line 898
    .local v6, "$i$a$-apply-HandwritingGesture_androidKt$getRangeForScreenRects$endRange$1":I
    invoke-static {v4, v5}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v7

    if-eqz v7, :cond_1

    sget-object v2, Landroidx/compose/ui/text/TextRange;->Companion:Landroidx/compose/ui/text/TextRange$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/text/TextRange$Companion;->getZero-d9O1mEE()J

    move-result-wide v2

    return-wide v2

    .line 899
    :cond_1
    nop

    .line 897
    .end local v4    # "$this$getRangeForScreenRects_O048IG0_u24lambda_u241":J
    .end local v6    # "$i$a$-apply-HandwritingGesture_androidKt$getRangeForScreenRects$endRange$1":I
    nop

    .line 896
    nop

    .line 901
    .local v2, "endRange":J
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->enclosure-pWDy79M(JJ)J

    move-result-wide v4

    return-wide v4
.end method

.method private static final isBiDiBoundary(Landroidx/compose/ui/text/TextLayoutResult;I)Z
    .locals 5
    .param p0, "$this$isBiDiBoundary"    # Landroidx/compose/ui/text/TextLayoutResult;
    .param p1, "offset"    # I

    .line 982
    invoke-virtual {p0, p1}, Landroidx/compose/ui/text/TextLayoutResult;->getLineForOffset(I)I

    move-result v0

    .line 983
    .local v0, "line":I
    invoke-virtual {p0, v0}, Landroidx/compose/ui/text/TextLayoutResult;->getLineStart(I)I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq p1, v1, :cond_2

    const/4 v1, 0x2

    const/4 v4, 0x0

    invoke-static {p0, v0, v3, v1, v4}, Landroidx/compose/ui/text/TextLayoutResult;->getLineEnd$default(Landroidx/compose/ui/text/TextLayoutResult;IZILjava/lang/Object;)I

    move-result v1

    if-ne p1, v1, :cond_0

    goto :goto_1

    .line 988
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/compose/ui/text/TextLayoutResult;->getBidiRunDirection(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;

    move-result-object v1

    add-int/lit8 v4, p1, -0x1

    invoke-virtual {p0, v4}, Landroidx/compose/ui/text/TextLayoutResult;->getBidiRunDirection(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;

    move-result-object v4

    if-eq v1, v4, :cond_1

    goto :goto_0

    :cond_1
    move v2, v3

    :goto_0
    return v2

    .line 984
    :cond_2
    :goto_1
    invoke-virtual {p0, p1}, Landroidx/compose/ui/text/TextLayoutResult;->getParagraphDirection(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;

    move-result-object v1

    invoke-virtual {p0, p1}, Landroidx/compose/ui/text/TextLayoutResult;->getBidiRunDirection(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;

    move-result-object v4

    if-eq v1, v4, :cond_3

    goto :goto_2

    :cond_3
    move v2, v3

    :goto_2
    return v2
.end method

.method private static final isNewline(I)Z
    .locals 2
    .param p0, "$this$isNewline"    # I

    .line 831
    invoke-static {p0}, Ljava/lang/Character;->getType(I)I

    move-result v0

    .line 832
    .local v0, "type":I
    const/16 v1, 0xe

    if-eq v0, v1, :cond_1

    .line 833
    const/16 v1, 0xd

    if-eq v0, v1, :cond_1

    .line 834
    const/16 v1, 0xa

    if-ne p0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 832
    :goto_1
    return v1
.end method

.method private static final isPunctuation(I)Z
    .locals 2
    .param p0, "$this$isPunctuation"    # I

    .line 858
    invoke-static {p0}, Ljava/lang/Character;->getType(I)I

    move-result v0

    .line 859
    .local v0, "type":I
    const/16 v1, 0x17

    if-eq v0, v1, :cond_1

    .line 860
    const/16 v1, 0x14

    if-eq v0, v1, :cond_1

    .line 861
    const/16 v1, 0x16

    if-eq v0, v1, :cond_1

    .line 862
    const/16 v1, 0x1e

    if-eq v0, v1, :cond_1

    .line 863
    const/16 v1, 0x1d

    if-eq v0, v1, :cond_1

    .line 864
    const/16 v1, 0x18

    if-eq v0, v1, :cond_1

    .line 865
    const/16 v1, 0x15

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 859
    :goto_1
    return v1
.end method

.method private static final isWhitespace(I)Z
    .locals 1
    .param p0, "$this$isWhitespace"    # I

    .line 842
    invoke-static {p0}, Ljava/lang/Character;->isWhitespace(I)Z

    move-result v0

    if-nez v0, :cond_1

    const/16 v0, 0xa0

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private static final isWhitespaceExceptNewline(I)Z
    .locals 1
    .param p0, "$this$isWhitespaceExceptNewline"    # I

    .line 850
    invoke-static {p0}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->isWhitespace(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->isNewline(I)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static final rangeOfWhitespaces(Ljava/lang/CharSequence;I)J
    .locals 4
    .param p0, "$this$rangeOfWhitespaces"    # Ljava/lang/CharSequence;
    .param p1, "offset"    # I

    .line 935
    move v0, p1

    .line 936
    .local v0, "startOffset":I
    move v1, p1

    .line 938
    .local v1, "endOffset":I
    :goto_0
    if-lez v0, :cond_1

    .line 939
    invoke-static {p0, v0}, Landroidx/compose/foundation/text/input/internal/CodepointHelpers_jvmKt;->codePointBefore(Ljava/lang/CharSequence;I)I

    move-result v2

    .line 940
    .local v2, "codePointBeforeStart":I
    invoke-static {v2}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->isWhitespace(I)Z

    move-result v3

    if-nez v3, :cond_0

    .line 941
    goto :goto_1

    .line 944
    :cond_0
    invoke-static {v2}, Ljava/lang/Character;->charCount(I)I

    move-result v3

    sub-int/2addr v0, v3

    .end local v2    # "codePointBeforeStart":I
    goto :goto_0

    .line 947
    :cond_1
    :goto_1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-ge v1, v2, :cond_3

    .line 948
    invoke-static {p0, v1}, Landroidx/compose/foundation/text/input/internal/CodepointHelpers_jvmKt;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v2

    .line 949
    .local v2, "codePointAtEnd":I
    invoke-static {v2}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->isWhitespace(I)Z

    move-result v3

    if-nez v3, :cond_2

    .line 950
    goto :goto_2

    .line 952
    :cond_2
    invoke-static {v2}, Landroidx/compose/foundation/text/input/internal/CodepointHelpers_jvmKt;->charCount(I)I

    move-result v3

    add-int/2addr v1, v3

    .end local v2    # "codePointAtEnd":I
    goto :goto_1

    .line 955
    :cond_3
    :goto_2
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(II)J

    move-result-wide v2

    return-wide v2
.end method

.method private static final toOffset(Landroid/graphics/PointF;)J
    .locals 12
    .param p0, "$this$toOffset"    # Landroid/graphics/PointF;

    .line 868
    iget v0, p0, Landroid/graphics/PointF;->x:F

    .local v0, "x$iv":F
    iget v1, p0, Landroid/graphics/PointF;->y:F

    .local v1, "y$iv":F
    const/4 v2, 0x0

    .line 1103
    .local v2, "$i$f$Offset":I
    const/4 v3, 0x0

    .line 1104
    .local v3, "$i$f$packFloats":I
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v4, v4

    .line 1105
    .local v4, "v1$iv$iv":J
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    int-to-long v6, v6

    .line 1106
    .local v6, "v2$iv$iv":J
    const/16 v8, 0x20

    shl-long v8, v4, v8

    const-wide v10, 0xffffffffL

    and-long/2addr v10, v6

    or-long v3, v8, v10

    .line 1103
    .end local v3    # "$i$f$packFloats":I
    .end local v4    # "v1$iv$iv":J
    .end local v6    # "v2$iv$iv":J
    invoke-static {v3, v4}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    move-result-wide v0

    .line 868
    .end local v0    # "x$iv":F
    .end local v1    # "y$iv":F
    .end local v2    # "$i$f$Offset":I
    return-wide v0
.end method
