.class public abstract Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
.super Ljava/lang/Object;
.source "TextPreparedSelection.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection<",
        "TT;>;>",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,401:1\n73#1,8:402\n73#1,8:410\n73#1,8:418\n73#1,8:426\n73#1,8:434\n73#1,8:442\n73#1,8:450\n73#1,8:458\n73#1,8:466\n73#1,8:474\n73#1,8:482\n73#1,8:490\n73#1,6:498\n80#1:505\n73#1,8:506\n73#1,8:514\n73#1,8:522\n74#1,7:530\n74#1,7:537\n73#1,8:544\n73#1,8:552\n73#1,8:560\n73#1,8:568\n74#1,7:576\n1#2:504\n30#3:583\n53#4,3:584\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n*L\n91#1:402,8\n93#1:410,8\n95#1:418,8\n103#1:426,8\n112#1:434,8\n125#1:442,8\n146#1:450,8\n151#1:458,8\n156#1:466,8\n158#1:474,8\n160#1:482,8\n168#1:490,8\n178#1:498,6\n178#1:505\n182#1:506,8\n184#1:514,8\n192#1:522,8\n201#1:530,7\n204#1:537,7\n208#1:544,8\n212#1:552,8\n214#1:560,8\n222#1:568,8\n232#1:576,7\n310#1:583\n310#1:584,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008)\u0008 \u0018\u0000 a*\u000e\u0008\u0000\u0010\u0001*\u0008\u0012\u0004\u0012\u0002H\u00010\u00002\u00020\u0002:\u0001aB/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0002\u0010\rJ\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020&H\u0002J$\u0010(\u001a\u00028\u00002\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020+0*\u00a2\u0006\u0002\u0008,\u00a2\u0006\u0002\u0010-J$\u0010.\u001a\u00028\u00002\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020+0*\u00a2\u0006\u0002\u0008,\u00a2\u0006\u0002\u0010-J\u000b\u0010/\u001a\u00028\u0000\u00a2\u0006\u0002\u00100J\r\u00101\u001a\u0004\u0018\u00010&\u00a2\u0006\u0002\u00102J\r\u00103\u001a\u0004\u0018\u00010&\u00a2\u0006\u0002\u00102J\u0006\u00104\u001a\u00020&J\r\u00105\u001a\u0004\u0018\u00010&\u00a2\u0006\u0002\u00102J\u0006\u00106\u001a\u00020&J\r\u00107\u001a\u0004\u0018\u00010&\u00a2\u0006\u0002\u00102J\u0008\u00108\u001a\u000209H\u0002J\u000b\u0010:\u001a\u00028\u0000\u00a2\u0006\u0002\u00100J\u000b\u0010;\u001a\u00028\u0000\u00a2\u0006\u0002\u00100J\u000b\u0010<\u001a\u00028\u0000\u00a2\u0006\u0002\u00100J\r\u0010=\u001a\u00028\u0000H\u0002\u00a2\u0006\u0002\u00100J\u000b\u0010>\u001a\u00028\u0000\u00a2\u0006\u0002\u00100J\r\u0010?\u001a\u00028\u0000H\u0002\u00a2\u0006\u0002\u00100J\r\u0010@\u001a\u00028\u0000H\u0002\u00a2\u0006\u0002\u00100J\u000b\u0010A\u001a\u00028\u0000\u00a2\u0006\u0002\u00100J\r\u0010B\u001a\u00028\u0000H\u0002\u00a2\u0006\u0002\u00100J\u000b\u0010C\u001a\u00028\u0000\u00a2\u0006\u0002\u00100J\u000b\u0010D\u001a\u00028\u0000\u00a2\u0006\u0002\u00100J\u000b\u0010E\u001a\u00028\u0000\u00a2\u0006\u0002\u00100J\u000b\u0010F\u001a\u00028\u0000\u00a2\u0006\u0002\u00100J\u000b\u0010G\u001a\u00028\u0000\u00a2\u0006\u0002\u00100J\u000b\u0010H\u001a\u00028\u0000\u00a2\u0006\u0002\u00100J\u000b\u0010I\u001a\u00028\u0000\u00a2\u0006\u0002\u00100J\u000b\u0010J\u001a\u00028\u0000\u00a2\u0006\u0002\u00100J\u000b\u0010K\u001a\u00028\u0000\u00a2\u0006\u0002\u00100J\u000b\u0010L\u001a\u00028\u0000\u00a2\u0006\u0002\u00100J\u000b\u0010M\u001a\u00028\u0000\u00a2\u0006\u0002\u00100J\u0010\u0010N\u001a\u00020+2\u0006\u0010\'\u001a\u00020&H\u0004J\u0018\u0010O\u001a\u00020+2\u0006\u0010P\u001a\u00020&2\u0006\u0010Q\u001a\u00020&H\u0004J\u0008\u0010R\u001a\u00020&H\u0002J\u0008\u0010S\u001a\u00020&H\u0002J\u0008\u0010T\u001a\u00020&H\u0002J;\u0010U\u001a\u00028\u0000\"\u0004\u0008\u0001\u0010V*\u0002HV2\u0008\u0008\u0002\u0010W\u001a\u0002092\u0017\u0010X\u001a\u0013\u0012\u0004\u0012\u0002HV\u0012\u0004\u0012\u00020+0*\u00a2\u0006\u0002\u0008,H\u0084\u0008\u00a2\u0006\u0002\u0010YJ\u0016\u0010Z\u001a\u00020&*\u00020\u00082\u0008\u0008\u0002\u0010[\u001a\u00020&H\u0002J\u0016\u0010\\\u001a\u00020&*\u00020\u00082\u0008\u0008\u0002\u0010[\u001a\u00020&H\u0002J\u0017\u0010]\u001a\u00020&*\u00020\u00082\u0008\u0008\u0002\u0010[\u001a\u00020&H\u0082\u0010J\u0017\u0010^\u001a\u00020&*\u00020\u00082\u0008\u0008\u0002\u0010[\u001a\u00020&H\u0082\u0010J\u0014\u0010_\u001a\u00020&*\u00020\u00082\u0006\u0010`\u001a\u00020&H\u0002R\u001a\u0010\u000e\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u00020\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0010R\"\u0010\u001b\u001a\u00020\u0006X\u0086\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\u0008\u001c\u0010\u0018\"\u0004\u0008\u001d\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0014\u0010!\u001a\u00020\"8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010$\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006b"
    }
    d2 = {
        "Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;",
        "T",
        "",
        "originalText",
        "Landroidx/compose/ui/text/AnnotatedString;",
        "originalSelection",
        "Landroidx/compose/ui/text/TextRange;",
        "layoutResult",
        "Landroidx/compose/ui/text/TextLayoutResult;",
        "offsetMapping",
        "Landroidx/compose/ui/text/input/OffsetMapping;",
        "state",
        "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;",
        "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "annotatedString",
        "getAnnotatedString",
        "()Landroidx/compose/ui/text/AnnotatedString;",
        "setAnnotatedString",
        "(Landroidx/compose/ui/text/AnnotatedString;)V",
        "getLayoutResult",
        "()Landroidx/compose/ui/text/TextLayoutResult;",
        "getOffsetMapping",
        "()Landroidx/compose/ui/text/input/OffsetMapping;",
        "getOriginalSelection-d9O1mEE",
        "()J",
        "J",
        "getOriginalText",
        "selection",
        "getSelection-d9O1mEE",
        "setSelection-5zc-tL8",
        "(J)V",
        "getState",
        "()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;",
        "text",
        "",
        "getText$foundation_release",
        "()Ljava/lang/String;",
        "charOffset",
        "",
        "offset",
        "collapseLeftOr",
        "or",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;",
        "collapseRightOr",
        "deselect",
        "()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;",
        "getLineEndByOffset",
        "()Ljava/lang/Integer;",
        "getLineStartByOffset",
        "getNextCharacterIndex",
        "getNextWordOffset",
        "getPrecedingCharacterIndex",
        "getPreviousWordOffset",
        "isLtr",
        "",
        "moveCursorDownByLine",
        "moveCursorLeft",
        "moveCursorLeftByWord",
        "moveCursorNext",
        "moveCursorNextByParagraph",
        "moveCursorNextByWord",
        "moveCursorPrev",
        "moveCursorPrevByParagraph",
        "moveCursorPrevByWord",
        "moveCursorRight",
        "moveCursorRightByWord",
        "moveCursorToEnd",
        "moveCursorToHome",
        "moveCursorToLineEnd",
        "moveCursorToLineLeftSide",
        "moveCursorToLineRightSide",
        "moveCursorToLineStart",
        "moveCursorUpByLine",
        "selectAll",
        "selectMovement",
        "setCursor",
        "setSelection",
        "start",
        "end",
        "transformedEndOffset",
        "transformedMaxOffset",
        "transformedMinOffset",
        "apply",
        "U",
        "resetCachedX",
        "block",
        "(Ljava/lang/Object;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;",
        "getLineEndByOffsetForLayout",
        "currentOffset",
        "getLineStartByOffsetForLayout",
        "getNextWordOffsetForLayout",
        "getPrevWordOffset",
        "jumpByLinesOffset",
        "linesAmount",
        "Companion",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection$Companion;

.field public static final NoCharacterFound:I = -0x1


# instance fields
.field private annotatedString:Landroidx/compose/ui/text/AnnotatedString;

.field private final layoutResult:Landroidx/compose/ui/text/TextLayoutResult;

.field private final offsetMapping:Landroidx/compose/ui/text/input/OffsetMapping;

.field private final originalSelection:J

.field private final originalText:Landroidx/compose/ui/text/AnnotatedString;

.field private selection:J

.field private final state:Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->Companion:Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection$Companion;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->$stable:I

    return-void
.end method

.method private constructor <init>(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;)V
    .locals 2
    .param p1, "originalText"    # Landroidx/compose/ui/text/AnnotatedString;
    .param p2, "originalSelection"    # J
    .param p4, "layoutResult"    # Landroidx/compose/ui/text/TextLayoutResult;
    .param p5, "offsetMapping"    # Landroidx/compose/ui/text/input/OffsetMapping;
    .param p6, "state"    # Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object p1, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->originalText:Landroidx/compose/ui/text/AnnotatedString;

    .line 61
    iput-wide p2, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->originalSelection:J

    .line 62
    iput-object p4, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->layoutResult:Landroidx/compose/ui/text/TextLayoutResult;

    .line 63
    iput-object p5, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->offsetMapping:Landroidx/compose/ui/text/input/OffsetMapping;

    .line 64
    iput-object p6, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->state:Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;

    .line 66
    iget-wide v0, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->originalSelection:J

    iput-wide v0, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->selection:J

    .line 68
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->originalText:Landroidx/compose/ui/text/AnnotatedString;

    iput-object v0, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->annotatedString:Landroidx/compose/ui/text/AnnotatedString;

    .line 59
    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;-><init>(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;)V

    return-void
.end method

.method public static synthetic apply$default(Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;Ljava/lang/Object;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .param p1, "$receiver"    # Ljava/lang/Object;
    .param p2, "resetCachedX"    # Z
    .param p3, "block"    # Lkotlin/jvm/functions/Function1;

    .line 73
    if-nez p5, :cond_4

    const/4 p5, 0x1

    and-int/2addr p4, p5

    if-eqz p4, :cond_0

    const/4 p2, 0x1

    :cond_0
    const/4 p4, 0x0

    .line 74
    .local p4, "$i$f$apply":I
    if-eqz p2, :cond_1

    .line 75
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getState()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;->resetCachedX()V

    .line 77
    :cond_1
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getText$foundation_release()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 p5, 0x0

    :goto_0
    if-eqz p5, :cond_3

    .line 78
    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    :cond_3
    const-string/jumbo p5, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p1, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object p5, p1

    check-cast p5, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    return-object p5

    .line 73
    .end local p4    # "$i$f$apply":I
    :cond_4
    new-instance p4, Ljava/lang/UnsupportedOperationException;

    const-string p5, "Super calls with default arguments not supported in this target, function: apply"

    invoke-direct {p4, p5}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p4
.end method

.method private final charOffset(I)I
    .locals 1
    .param p1, "offset"    # I

    .line 327
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getText$foundation_release()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {p1, v0}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    move-result v0

    return v0
.end method

.method private final getLineEndByOffsetForLayout(Landroidx/compose/ui/text/TextLayoutResult;I)I
    .locals 3
    .param p1, "$this$getLineEndByOffsetForLayout"    # Landroidx/compose/ui/text/TextLayoutResult;
    .param p2, "currentOffset"    # I

    .line 277
    invoke-virtual {p1, p2}, Landroidx/compose/ui/text/TextLayoutResult;->getLineForOffset(I)I

    move-result v0

    .line 278
    .local v0, "currentLine":I
    iget-object v1, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->offsetMapping:Landroidx/compose/ui/text/input/OffsetMapping;

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v2}, Landroidx/compose/ui/text/TextLayoutResult;->getLineEnd(IZ)I

    move-result v2

    invoke-interface {v1, v2}, Landroidx/compose/ui/text/input/OffsetMapping;->transformedToOriginal(I)I

    move-result v1

    return v1
.end method

.method static synthetic getLineEndByOffsetForLayout$default(Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;Landroidx/compose/ui/text/TextLayoutResult;IILjava/lang/Object;)I
    .locals 0

    .line 274
    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    .line 275
    invoke-direct {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->transformedMaxOffset()I

    move-result p2

    .line 274
    :cond_0
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getLineEndByOffsetForLayout(Landroidx/compose/ui/text/TextLayoutResult;I)I

    move-result p0

    return p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final getLineStartByOffsetForLayout(Landroidx/compose/ui/text/TextLayoutResult;I)I
    .locals 3
    .param p1, "$this$getLineStartByOffsetForLayout"    # Landroidx/compose/ui/text/TextLayoutResult;
    .param p2, "currentOffset"    # I

    .line 270
    invoke-virtual {p1, p2}, Landroidx/compose/ui/text/TextLayoutResult;->getLineForOffset(I)I

    move-result v0

    .line 271
    .local v0, "currentLine":I
    iget-object v1, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->offsetMapping:Landroidx/compose/ui/text/input/OffsetMapping;

    invoke-virtual {p1, v0}, Landroidx/compose/ui/text/TextLayoutResult;->getLineStart(I)I

    move-result v2

    invoke-interface {v1, v2}, Landroidx/compose/ui/text/input/OffsetMapping;->transformedToOriginal(I)I

    move-result v1

    return v1
.end method

.method static synthetic getLineStartByOffsetForLayout$default(Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;Landroidx/compose/ui/text/TextLayoutResult;IILjava/lang/Object;)I
    .locals 0

    .line 267
    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    .line 268
    invoke-direct {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->transformedMinOffset()I

    move-result p2

    .line 267
    :cond_0
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getLineStartByOffsetForLayout(Landroidx/compose/ui/text/TextLayoutResult;I)I

    move-result p0

    return p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final getNextWordOffsetForLayout(Landroidx/compose/ui/text/TextLayoutResult;I)I
    .locals 4
    .param p1, "$this$getNextWordOffsetForLayout"    # Landroidx/compose/ui/text/TextLayoutResult;
    .param p2, "currentOffset"    # I

    .line 242
    nop

    :goto_0
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->originalText:Landroidx/compose/ui/text/AnnotatedString;

    invoke-virtual {v0}, Landroidx/compose/ui/text/AnnotatedString;->length()I

    move-result v0

    if-lt p2, v0, :cond_0

    .line 243
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->originalText:Landroidx/compose/ui/text/AnnotatedString;

    invoke-virtual {v0}, Landroidx/compose/ui/text/AnnotatedString;->length()I

    move-result v0

    return v0

    .line 245
    :cond_0
    invoke-direct {p0, p2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->charOffset(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/compose/ui/text/TextLayoutResult;->getWordBoundary--jx7JFs(I)J

    move-result-wide v0

    .line 246
    .local v0, "currentWord":J
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v2

    if-gt v2, p2, :cond_1

    .line 247
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 249
    :cond_1
    iget-object v2, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->offsetMapping:Landroidx/compose/ui/text/input/OffsetMapping;

    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v3

    invoke-interface {v2, v3}, Landroidx/compose/ui/text/input/OffsetMapping;->transformedToOriginal(I)I

    move-result v2

    .line 246
    return v2
.end method

.method static synthetic getNextWordOffsetForLayout$default(Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;Landroidx/compose/ui/text/TextLayoutResult;IILjava/lang/Object;)I
    .locals 0

    .line 239
    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    .line 240
    invoke-direct {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->transformedEndOffset()I

    move-result p2

    .line 239
    :cond_0
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getNextWordOffsetForLayout(Landroidx/compose/ui/text/TextLayoutResult;I)I

    move-result p0

    return p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final getPrevWordOffset(Landroidx/compose/ui/text/TextLayoutResult;I)I
    .locals 4
    .param p1, "$this$getPrevWordOffset"    # Landroidx/compose/ui/text/TextLayoutResult;
    .param p2, "currentOffset"    # I

    .line 256
    nop

    :goto_0
    if-gtz p2, :cond_0

    .line 257
    const/4 v0, 0x0

    return v0

    .line 259
    :cond_0
    invoke-direct {p0, p2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->charOffset(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/compose/ui/text/TextLayoutResult;->getWordBoundary--jx7JFs(I)J

    move-result-wide v0

    .line 260
    .local v0, "currentWord":J
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    move-result v2

    if-lt v2, p2, :cond_1

    .line 261
    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    .line 263
    :cond_1
    iget-object v2, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->offsetMapping:Landroidx/compose/ui/text/input/OffsetMapping;

    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    move-result v3

    invoke-interface {v2, v3}, Landroidx/compose/ui/text/input/OffsetMapping;->transformedToOriginal(I)I

    move-result v2

    .line 260
    return v2
.end method

.method static synthetic getPrevWordOffset$default(Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;Landroidx/compose/ui/text/TextLayoutResult;IILjava/lang/Object;)I
    .locals 0

    .line 253
    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    .line 254
    invoke-direct {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->transformedEndOffset()I

    move-result p2

    .line 253
    :cond_0
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getPrevWordOffset(Landroidx/compose/ui/text/TextLayoutResult;I)I

    move-result p0

    return p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: getPrevWordOffset"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final isLtr()Z
    .locals 2

    .line 235
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->layoutResult:Landroidx/compose/ui/text/TextLayoutResult;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->transformedEndOffset()I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/compose/ui/text/TextLayoutResult;->getParagraphDirection(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 236
    .local v0, "direction":Landroidx/compose/ui/text/style/ResolvedTextDirection;
    :goto_0
    sget-object v1, Landroidx/compose/ui/text/style/ResolvedTextDirection;->Rtl:Landroidx/compose/ui/text/style/ResolvedTextDirection;

    if-eq v0, v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    return v1
.end method

.method private final jumpByLinesOffset(Landroidx/compose/ui/text/TextLayoutResult;I)I
    .locals 16
    .param p1, "$this$jumpByLinesOffset"    # Landroidx/compose/ui/text/TextLayoutResult;
    .param p2, "linesAmount"    # I

    .line 282
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->transformedEndOffset()I

    move-result v2

    .line 284
    .local v2, "currentOffset":I
    iget-object v3, v0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->state:Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;

    invoke-virtual {v3}, Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;->getCachedX()Ljava/lang/Float;

    move-result-object v3

    if-nez v3, :cond_0

    .line 285
    iget-object v3, v0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->state:Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;

    invoke-virtual {v1, v2}, Landroidx/compose/ui/text/TextLayoutResult;->getCursorRect(I)Landroidx/compose/ui/geometry/Rect;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;->setCachedX(Ljava/lang/Float;)V

    .line 288
    :cond_0
    invoke-virtual {v1, v2}, Landroidx/compose/ui/text/TextLayoutResult;->getLineForOffset(I)I

    move-result v3

    add-int v3, v3, p2

    .line 289
    .local v3, "targetLine":I
    nop

    .line 290
    if-gez v3, :cond_1

    .line 291
    const/4 v4, 0x0

    return v4

    .line 293
    :cond_1
    invoke-virtual {v1}, Landroidx/compose/ui/text/TextLayoutResult;->getLineCount()I

    move-result v4

    if-lt v3, v4, :cond_2

    .line 294
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getText$foundation_release()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    return v4

    .line 298
    :cond_2
    invoke-virtual {v1, v3}, Landroidx/compose/ui/text/TextLayoutResult;->getLineBottom(I)F

    move-result v4

    const/high16 v5, 0x3f800000    # 1.0f

    sub-float/2addr v4, v5

    .line 300
    .local v4, "y":F
    iget-object v5, v0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->state:Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;

    invoke-virtual {v5}, Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;->getCachedX()Ljava/lang/Float;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v6

    .local v6, "it":F
    const/4 v7, 0x0

    .line 301
    .local v7, "$i$a$-also-BaseTextPreparedSelection$jumpByLinesOffset$x$1":I
    nop

    .line 302
    invoke-direct {v0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->isLtr()Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-virtual {v1, v3}, Landroidx/compose/ui/text/TextLayoutResult;->getLineRight(I)F

    move-result v8

    cmpl-float v8, v6, v8

    if-gez v8, :cond_4

    .line 303
    :cond_3
    invoke-direct {v0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->isLtr()Z

    move-result v8

    if-nez v8, :cond_5

    invoke-virtual {v1, v3}, Landroidx/compose/ui/text/TextLayoutResult;->getLineLeft(I)F

    move-result v8

    cmpg-float v8, v6, v8

    if-gtz v8, :cond_5

    .line 305
    :cond_4
    const/4 v5, 0x1

    invoke-virtual {v1, v3, v5}, Landroidx/compose/ui/text/TextLayoutResult;->getLineEnd(IZ)I

    move-result v5

    return v5

    .line 307
    :cond_5
    nop

    .line 300
    .end local v6    # "it":F
    .end local v7    # "$i$a$-also-BaseTextPreparedSelection$jumpByLinesOffset$x$1":I
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    .line 299
    nop

    .line 310
    .local v5, "x":F
    const/4 v6, 0x0

    .line 583
    .local v6, "$i$f$Offset":I
    const/4 v7, 0x0

    .line 584
    .local v7, "$i$f$packFloats":I
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    int-to-long v8, v8

    .line 585
    .local v8, "v1$iv$iv":J
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v10

    int-to-long v10, v10

    .line 586
    .local v10, "v2$iv$iv":J
    const/16 v12, 0x20

    shl-long v12, v8, v12

    const-wide v14, 0xffffffffL

    and-long/2addr v14, v10

    or-long v7, v12, v14

    .line 583
    .end local v7    # "$i$f$packFloats":I
    .end local v8    # "v1$iv$iv":J
    .end local v10    # "v2$iv$iv":J
    invoke-static {v7, v8}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    move-result-wide v6

    .line 310
    .end local v6    # "$i$f$Offset":I
    invoke-virtual {v1, v6, v7}, Landroidx/compose/ui/text/TextLayoutResult;->getOffsetForPosition-k-4lQ0M(J)I

    move-result v6

    .line 504
    .local v6, "it":I
    const/4 v7, 0x0

    .line 310
    .local v7, "$i$a$-let-BaseTextPreparedSelection$jumpByLinesOffset$newOffset$1":I
    iget-object v8, v0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->offsetMapping:Landroidx/compose/ui/text/input/OffsetMapping;

    invoke-interface {v8, v6}, Landroidx/compose/ui/text/input/OffsetMapping;->transformedToOriginal(I)I

    move-result v6

    .line 309
    .end local v6    # "it":I
    .end local v7    # "$i$a$-let-BaseTextPreparedSelection$jumpByLinesOffset$newOffset$1":I
    nop

    .line 312
    .local v6, "newOffset":I
    return v6
.end method

.method private final moveCursorNext()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 151
    nop

    .line 458
    const/4 v0, 0x1

    .local v0, "resetCachedX$iv":Z
    const/4 v1, 0x0

    .line 459
    .local v1, "$i$f$apply":I
    nop

    .line 460
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getState()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;->resetCachedX()V

    .line 462
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getText$foundation_release()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    .line 463
    move-object v2, p0

    check-cast v2, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .local v2, "$this$moveCursorNext_u24lambda_u247":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    const/4 v3, 0x0

    .line 152
    .local v3, "$i$a$-apply$default-BaseTextPreparedSelection$moveCursorNext$1":I
    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getNextCharacterIndex()I

    move-result v4

    .line 153
    .local v4, "next":I
    const/4 v5, -0x1

    if-eq v4, v5, :cond_1

    invoke-virtual {v2, v4}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->setCursor(I)V

    .line 154
    :cond_1
    nop

    .line 463
    .end local v2    # "$this$moveCursorNext_u24lambda_u247":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .end local v3    # "$i$a$-apply$default-BaseTextPreparedSelection$moveCursorNext$1":I
    .end local v4    # "next":I
    nop

    .line 465
    :cond_2
    const-string/jumbo v2, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .line 154
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "$i$f$apply":I
    return-object v0
.end method

.method private final moveCursorNextByWord()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 178
    nop

    .line 498
    const/4 v0, 0x1

    .local v0, "resetCachedX$iv":Z
    const/4 v1, 0x0

    .line 499
    .local v1, "$i$f$apply":I
    nop

    .line 500
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getState()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;->resetCachedX()V

    .line 502
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getText$foundation_release()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    .line 503
    move-object v2, p0

    check-cast v2, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .local v2, "$this$moveCursorNextByWord_u24lambda_u2413":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    const/4 v3, 0x0

    .line 178
    .local v3, "$i$a$-apply$default-BaseTextPreparedSelection$moveCursorNextByWord$1":I
    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getNextWordOffset()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_1

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    .line 504
    .local v4, "it":I
    const/4 v5, 0x0

    .line 178
    .local v5, "$i$a$-let-BaseTextPreparedSelection$moveCursorNextByWord$1$1":I
    invoke-virtual {v2, v4}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->setCursor(I)V

    .line 503
    .end local v2    # "$this$moveCursorNextByWord_u24lambda_u2413":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .end local v3    # "$i$a$-apply$default-BaseTextPreparedSelection$moveCursorNextByWord$1":I
    .end local v4    # "it":I
    .end local v5    # "$i$a$-let-BaseTextPreparedSelection$moveCursorNextByWord$1$1":I
    :cond_1
    nop

    .line 505
    :cond_2
    const-string/jumbo v2, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .line 178
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "$i$f$apply":I
    return-object v0
.end method

.method private final moveCursorPrev()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 146
    nop

    .line 450
    const/4 v0, 0x1

    .local v0, "resetCachedX$iv":Z
    const/4 v1, 0x0

    .line 451
    .local v1, "$i$f$apply":I
    nop

    .line 452
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getState()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;->resetCachedX()V

    .line 454
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getText$foundation_release()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    .line 455
    move-object v2, p0

    check-cast v2, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .local v2, "$this$moveCursorPrev_u24lambda_u246":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    const/4 v3, 0x0

    .line 147
    .local v3, "$i$a$-apply$default-BaseTextPreparedSelection$moveCursorPrev$1":I
    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getPrecedingCharacterIndex()I

    move-result v4

    .line 148
    .local v4, "prev":I
    const/4 v5, -0x1

    if-eq v4, v5, :cond_1

    invoke-virtual {v2, v4}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->setCursor(I)V

    .line 149
    :cond_1
    nop

    .line 455
    .end local v2    # "$this$moveCursorPrev_u24lambda_u246":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .end local v3    # "$i$a$-apply$default-BaseTextPreparedSelection$moveCursorPrev$1":I
    .end local v4    # "prev":I
    nop

    .line 457
    :cond_2
    const-string/jumbo v2, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .line 149
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "$i$f$apply":I
    return-object v0
.end method

.method private final moveCursorPrevByWord()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 182
    nop

    .line 506
    const/4 v0, 0x1

    .local v0, "resetCachedX$iv":Z
    const/4 v1, 0x0

    .line 507
    .local v1, "$i$f$apply":I
    nop

    .line 508
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getState()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;->resetCachedX()V

    .line 510
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getText$foundation_release()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    .line 511
    move-object v2, p0

    check-cast v2, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .local v2, "$this$moveCursorPrevByWord_u24lambda_u2415":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    const/4 v3, 0x0

    .line 182
    .local v3, "$i$a$-apply$default-BaseTextPreparedSelection$moveCursorPrevByWord$1":I
    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getPreviousWordOffset()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_1

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    .line 504
    .local v4, "it":I
    const/4 v5, 0x0

    .line 182
    .local v5, "$i$a$-let-BaseTextPreparedSelection$moveCursorPrevByWord$1$1":I
    invoke-virtual {v2, v4}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->setCursor(I)V

    .line 511
    .end local v2    # "$this$moveCursorPrevByWord_u24lambda_u2415":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .end local v3    # "$i$a$-apply$default-BaseTextPreparedSelection$moveCursorPrevByWord$1":I
    .end local v4    # "it":I
    .end local v5    # "$i$a$-let-BaseTextPreparedSelection$moveCursorPrevByWord$1$1":I
    :cond_1
    nop

    .line 513
    :cond_2
    const-string/jumbo v2, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .line 182
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "$i$f$apply":I
    return-object v0
.end method

.method private final transformedEndOffset()I
    .locals 3

    .line 316
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->offsetMapping:Landroidx/compose/ui/text/input/OffsetMapping;

    iget-wide v1, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->selection:J

    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v1

    invoke-interface {v0, v1}, Landroidx/compose/ui/text/input/OffsetMapping;->originalToTransformed(I)I

    move-result v0

    return v0
.end method

.method private final transformedMaxOffset()I
    .locals 3

    .line 324
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->offsetMapping:Landroidx/compose/ui/text/input/OffsetMapping;

    iget-wide v1, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->selection:J

    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->getMax-impl(J)I

    move-result v1

    invoke-interface {v0, v1}, Landroidx/compose/ui/text/input/OffsetMapping;->originalToTransformed(I)I

    move-result v0

    return v0
.end method

.method private final transformedMinOffset()I
    .locals 3

    .line 320
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->offsetMapping:Landroidx/compose/ui/text/input/OffsetMapping;

    iget-wide v1, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->selection:J

    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->getMin-impl(J)I

    move-result v1

    invoke-interface {v0, v1}, Landroidx/compose/ui/text/input/OffsetMapping;->originalToTransformed(I)I

    move-result v0

    return v0
.end method


# virtual methods
.method protected final apply(Ljava/lang/Object;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .locals 2
    .param p1, "$this$apply"    # Ljava/lang/Object;
    .param p2, "resetCachedX"    # Z
    .param p3, "block"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U:",
            "Ljava/lang/Object;",
            ">(TU;Z",
            "Lkotlin/jvm/functions/Function1<",
            "-TU;",
            "Lkotlin/Unit;",
            ">;)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 74
    .local v0, "$i$f$apply":I
    if-eqz p2, :cond_0

    .line 75
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getState()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;->resetCachedX()V

    .line 77
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getText$foundation_release()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    .line 78
    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    :cond_2
    const-string/jumbo v1, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p1

    check-cast v1, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    return-object v1
.end method

.method public final collapseLeftOr(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .locals 8
    .param p1, "or"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Lkotlin/Unit;",
            ">;)TT;"
        }
    .end annotation

    .line 112
    nop

    .line 434
    const/4 v0, 0x1

    .local v0, "resetCachedX$iv":Z
    const/4 v1, 0x0

    .line 435
    .local v1, "$i$f$apply":I
    nop

    .line 436
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getState()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;->resetCachedX()V

    .line 438
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getText$foundation_release()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const-string/jumbo v3, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    if-eqz v2, :cond_3

    .line 439
    move-object v2, p0

    check-cast v2, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .local v2, "$this$collapseLeftOr_u24lambda_u244":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    const/4 v4, 0x0

    .line 113
    .local v4, "$i$a$-apply$default-BaseTextPreparedSelection$collapseLeftOr$1":I
    iget-wide v5, v2, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->selection:J

    invoke-static {v5, v6}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 114
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 116
    :cond_1
    invoke-direct {v2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->isLtr()Z

    move-result v5

    .line 119
    iget-wide v6, v2, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->selection:J

    .line 116
    if-eqz v5, :cond_2

    .line 117
    invoke-static {v6, v7}, Landroidx/compose/ui/text/TextRange;->getMin-impl(J)I

    move-result v5

    invoke-virtual {v2, v5}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->setCursor(I)V

    goto :goto_1

    .line 119
    :cond_2
    invoke-static {v6, v7}, Landroidx/compose/ui/text/TextRange;->getMax-impl(J)I

    move-result v5

    invoke-virtual {v2, v5}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->setCursor(I)V

    .line 122
    :goto_1
    nop

    .line 439
    .end local v2    # "$this$collapseLeftOr_u24lambda_u244":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .end local v4    # "$i$a$-apply$default-BaseTextPreparedSelection$collapseLeftOr$1":I
    nop

    .line 441
    :cond_3
    invoke-static {p0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .line 122
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "$i$f$apply":I
    return-object v0
.end method

.method public final collapseRightOr(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .locals 8
    .param p1, "or"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Lkotlin/Unit;",
            ">;)TT;"
        }
    .end annotation

    .line 125
    nop

    .line 442
    const/4 v0, 0x1

    .local v0, "resetCachedX$iv":Z
    const/4 v1, 0x0

    .line 443
    .local v1, "$i$f$apply":I
    nop

    .line 444
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getState()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;->resetCachedX()V

    .line 446
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getText$foundation_release()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const-string/jumbo v3, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    if-eqz v2, :cond_3

    .line 447
    move-object v2, p0

    check-cast v2, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .local v2, "$this$collapseRightOr_u24lambda_u245":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    const/4 v4, 0x0

    .line 126
    .local v4, "$i$a$-apply$default-BaseTextPreparedSelection$collapseRightOr$1":I
    iget-wide v5, v2, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->selection:J

    invoke-static {v5, v6}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 127
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 129
    :cond_1
    invoke-direct {v2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->isLtr()Z

    move-result v5

    .line 132
    iget-wide v6, v2, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->selection:J

    .line 129
    if-eqz v5, :cond_2

    .line 130
    invoke-static {v6, v7}, Landroidx/compose/ui/text/TextRange;->getMax-impl(J)I

    move-result v5

    invoke-virtual {v2, v5}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->setCursor(I)V

    goto :goto_1

    .line 132
    :cond_2
    invoke-static {v6, v7}, Landroidx/compose/ui/text/TextRange;->getMin-impl(J)I

    move-result v5

    invoke-virtual {v2, v5}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->setCursor(I)V

    .line 135
    :goto_1
    nop

    .line 447
    .end local v2    # "$this$collapseRightOr_u24lambda_u245":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .end local v4    # "$i$a$-apply$default-BaseTextPreparedSelection$collapseRightOr$1":I
    nop

    .line 449
    :cond_3
    invoke-static {p0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .line 135
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "$i$f$apply":I
    return-object v0
.end method

.method public final deselect()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 93
    nop

    .line 410
    const/4 v0, 0x1

    .local v0, "resetCachedX$iv":Z
    const/4 v1, 0x0

    .line 411
    .local v1, "$i$f$apply":I
    nop

    .line 412
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getState()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;->resetCachedX()V

    .line 414
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getText$foundation_release()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_1

    .line 415
    move-object v2, p0

    check-cast v2, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .local v2, "$this$deselect_u24lambda_u241":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    const/4 v3, 0x0

    .line 93
    .local v3, "$i$a$-apply$default-BaseTextPreparedSelection$deselect$1":I
    iget-wide v4, v2, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->selection:J

    invoke-static {v4, v5}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v4

    invoke-virtual {v2, v4}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->setCursor(I)V

    .line 415
    .end local v2    # "$this$deselect_u24lambda_u241":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .end local v3    # "$i$a$-apply$default-BaseTextPreparedSelection$deselect$1":I
    nop

    .line 417
    :cond_1
    const-string/jumbo v2, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .line 93
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "$i$f$apply":I
    return-object v0
.end method

.method public final getAnnotatedString()Landroidx/compose/ui/text/AnnotatedString;
    .locals 1

    .line 68
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->annotatedString:Landroidx/compose/ui/text/AnnotatedString;

    return-object v0
.end method

.method public final getLayoutResult()Landroidx/compose/ui/text/TextLayoutResult;
    .locals 1

    .line 62
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->layoutResult:Landroidx/compose/ui/text/TextLayoutResult;

    return-object v0
.end method

.method public final getLineEndByOffset()Ljava/lang/Integer;
    .locals 4

    .line 210
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->layoutResult:Landroidx/compose/ui/text/TextLayoutResult;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {p0, v0, v2, v3, v1}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getLineEndByOffsetForLayout$default(Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;Landroidx/compose/ui/text/TextLayoutResult;IILjava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_0
    return-object v1
.end method

.method public final getLineStartByOffset()Ljava/lang/Integer;
    .locals 4

    .line 206
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->layoutResult:Landroidx/compose/ui/text/TextLayoutResult;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {p0, v0, v2, v3, v1}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getLineStartByOffsetForLayout$default(Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;Landroidx/compose/ui/text/TextLayoutResult;IILjava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_0
    return-object v1
.end method

.method public final getNextCharacterIndex()I
    .locals 3

    .line 144
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->annotatedString:Landroidx/compose/ui/text/AnnotatedString;

    invoke-virtual {v0}, Landroidx/compose/ui/text/AnnotatedString;->getText()Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->selection:J

    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v1

    invoke-static {v0, v1}, Landroidx/compose/foundation/text/StringHelpers_androidKt;->findFollowingBreak(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public final getNextWordOffset()Ljava/lang/Integer;
    .locals 4

    .line 176
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->layoutResult:Landroidx/compose/ui/text/TextLayoutResult;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {p0, v0, v2, v3, v1}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getNextWordOffsetForLayout$default(Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;Landroidx/compose/ui/text/TextLayoutResult;IILjava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_0
    return-object v1
.end method

.method public final getOffsetMapping()Landroidx/compose/ui/text/input/OffsetMapping;
    .locals 1

    .line 63
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->offsetMapping:Landroidx/compose/ui/text/input/OffsetMapping;

    return-object v0
.end method

.method public final getOriginalSelection-d9O1mEE()J
    .locals 2

    .line 61
    iget-wide v0, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->originalSelection:J

    return-wide v0
.end method

.method public final getOriginalText()Landroidx/compose/ui/text/AnnotatedString;
    .locals 1

    .line 60
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->originalText:Landroidx/compose/ui/text/AnnotatedString;

    return-object v0
.end method

.method public final getPrecedingCharacterIndex()I
    .locals 3

    .line 138
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->annotatedString:Landroidx/compose/ui/text/AnnotatedString;

    invoke-virtual {v0}, Landroidx/compose/ui/text/AnnotatedString;->getText()Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->selection:J

    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v1

    invoke-static {v0, v1}, Landroidx/compose/foundation/text/StringHelpers_androidKt;->findPrecedingBreak(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public final getPreviousWordOffset()Ljava/lang/Integer;
    .locals 4

    .line 180
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->layoutResult:Landroidx/compose/ui/text/TextLayoutResult;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {p0, v0, v2, v3, v1}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getPrevWordOffset$default(Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;Landroidx/compose/ui/text/TextLayoutResult;IILjava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_0
    return-object v1
.end method

.method public final getSelection-d9O1mEE()J
    .locals 2

    .line 66
    iget-wide v0, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->selection:J

    return-wide v0
.end method

.method public final getState()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;
    .locals 1

    .line 64
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->state:Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;

    return-object v0
.end method

.method public final getText$foundation_release()Ljava/lang/String;
    .locals 1

    .line 70
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->annotatedString:Landroidx/compose/ui/text/AnnotatedString;

    invoke-virtual {v0}, Landroidx/compose/ui/text/AnnotatedString;->getText()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final moveCursorDownByLine()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 204
    const/4 v0, 0x0

    .local v0, "resetCachedX$iv":Z
    move-object v1, p0

    .local v1, "$this$apply$iv":Ljava/lang/Object;
    move-object v2, p0

    .local v2, "this_$iv":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    const/4 v3, 0x0

    .line 537
    .local v3, "$i$f$apply":I
    nop

    .line 540
    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getText$foundation_release()Ljava/lang/String;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    const/4 v5, 0x1

    if-lez v4, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_2

    .line 541
    move-object v4, v1

    check-cast v4, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .local v4, "$this$moveCursorDownByLine_u24lambda_u2421":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    const/4 v6, 0x0

    .line 204
    .local v6, "$i$a$-apply-BaseTextPreparedSelection$moveCursorDownByLine$1":I
    iget-object v7, v4, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->layoutResult:Landroidx/compose/ui/text/TextLayoutResult;

    if-eqz v7, :cond_1

    invoke-direct {v4, v7, v5}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->jumpByLinesOffset(Landroidx/compose/ui/text/TextLayoutResult;I)I

    move-result v5

    .line 504
    .local v5, "it":I
    const/4 v7, 0x0

    .line 204
    .local v7, "$i$a$-let-BaseTextPreparedSelection$moveCursorDownByLine$1$1":I
    invoke-virtual {v4, v5}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->setCursor(I)V

    .line 541
    .end local v4    # "$this$moveCursorDownByLine_u24lambda_u2421":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .end local v5    # "it":I
    .end local v6    # "$i$a$-apply-BaseTextPreparedSelection$moveCursorDownByLine$1":I
    .end local v7    # "$i$a$-let-BaseTextPreparedSelection$moveCursorDownByLine$1$1":I
    :cond_1
    nop

    .line 543
    :cond_2
    const-string/jumbo v4, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, v1

    check-cast v0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .line 204
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "$this$apply$iv":Ljava/lang/Object;
    .end local v2    # "this_$iv":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .end local v3    # "$i$f$apply":I
    return-object v0
.end method

.method public final moveCursorLeft()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 95
    nop

    .line 418
    const/4 v0, 0x1

    .local v0, "resetCachedX$iv":Z
    const/4 v1, 0x0

    .line 419
    .local v1, "$i$f$apply":I
    nop

    .line 420
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getState()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;->resetCachedX()V

    .line 422
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getText$foundation_release()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    .line 423
    move-object v2, p0

    check-cast v2, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .local v2, "$this$moveCursorLeft_u24lambda_u242":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    const/4 v3, 0x0

    .line 96
    .local v3, "$i$a$-apply$default-BaseTextPreparedSelection$moveCursorLeft$1":I
    invoke-direct {v2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->isLtr()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 97
    invoke-direct {v2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->moveCursorPrev()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    goto :goto_1

    .line 99
    :cond_1
    invoke-direct {v2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->moveCursorNext()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .line 101
    :goto_1
    nop

    .line 423
    .end local v2    # "$this$moveCursorLeft_u24lambda_u242":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .end local v3    # "$i$a$-apply$default-BaseTextPreparedSelection$moveCursorLeft$1":I
    nop

    .line 425
    :cond_2
    const-string/jumbo v2, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .line 101
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "$i$f$apply":I
    return-object v0
.end method

.method public final moveCursorLeftByWord()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 160
    nop

    .line 482
    const/4 v0, 0x1

    .local v0, "resetCachedX$iv":Z
    const/4 v1, 0x0

    .line 483
    .local v1, "$i$f$apply":I
    nop

    .line 484
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getState()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;->resetCachedX()V

    .line 486
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getText$foundation_release()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    .line 487
    move-object v2, p0

    check-cast v2, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .local v2, "$this$moveCursorLeftByWord_u24lambda_u2410":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    const/4 v3, 0x0

    .line 161
    .local v3, "$i$a$-apply$default-BaseTextPreparedSelection$moveCursorLeftByWord$1":I
    invoke-direct {v2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->isLtr()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 162
    invoke-direct {v2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->moveCursorPrevByWord()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    goto :goto_1

    .line 164
    :cond_1
    invoke-direct {v2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->moveCursorNextByWord()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .line 166
    :goto_1
    nop

    .line 487
    .end local v2    # "$this$moveCursorLeftByWord_u24lambda_u2410":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .end local v3    # "$i$a$-apply$default-BaseTextPreparedSelection$moveCursorLeftByWord$1":I
    nop

    .line 489
    :cond_2
    const-string/jumbo v2, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .line 166
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "$i$f$apply":I
    return-object v0
.end method

.method public final moveCursorNextByParagraph()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 192
    nop

    .line 522
    const/4 v0, 0x1

    .local v0, "resetCachedX$iv":Z
    const/4 v1, 0x0

    .line 523
    .local v1, "$i$f$apply":I
    nop

    .line 524
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getState()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;->resetCachedX()V

    .line 526
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getText$foundation_release()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    .line 527
    move-object v2, p0

    check-cast v2, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .local v2, "$this$moveCursorNextByParagraph_u24lambda_u2417":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    const/4 v3, 0x0

    .line 193
    .local v3, "$i$a$-apply$default-BaseTextPreparedSelection$moveCursorNextByParagraph$1":I
    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getText$foundation_release()Ljava/lang/String;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    iget-wide v5, v2, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->selection:J

    invoke-static {v5, v6}, Landroidx/compose/ui/text/TextRange;->getMax-impl(J)I

    move-result v5

    invoke-static {v4, v5}, Landroidx/compose/foundation/text/StringHelpersKt;->findParagraphEnd(Ljava/lang/CharSequence;I)I

    move-result v4

    .line 194
    .local v4, "paragraphEnd":I
    iget-wide v5, v2, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->selection:J

    invoke-static {v5, v6}, Landroidx/compose/ui/text/TextRange;->getMax-impl(J)I

    move-result v5

    if-ne v4, v5, :cond_1

    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getText$foundation_release()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    if-eq v4, v5, :cond_1

    .line 195
    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getText$foundation_release()Ljava/lang/String;

    move-result-object v5

    check-cast v5, Ljava/lang/CharSequence;

    add-int/lit8 v6, v4, 0x1

    invoke-static {v5, v6}, Landroidx/compose/foundation/text/StringHelpersKt;->findParagraphEnd(Ljava/lang/CharSequence;I)I

    move-result v4

    .line 197
    :cond_1
    invoke-virtual {v2, v4}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->setCursor(I)V

    .line 198
    nop

    .line 527
    .end local v2    # "$this$moveCursorNextByParagraph_u24lambda_u2417":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .end local v3    # "$i$a$-apply$default-BaseTextPreparedSelection$moveCursorNextByParagraph$1":I
    .end local v4    # "paragraphEnd":I
    nop

    .line 529
    :cond_2
    const-string/jumbo v2, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .line 198
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "$i$f$apply":I
    return-object v0
.end method

.method public final moveCursorPrevByParagraph()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 184
    nop

    .line 514
    const/4 v0, 0x1

    .local v0, "resetCachedX$iv":Z
    const/4 v1, 0x0

    .line 515
    .local v1, "$i$f$apply":I
    nop

    .line 516
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getState()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;->resetCachedX()V

    .line 518
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getText$foundation_release()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    .line 519
    move-object v2, p0

    check-cast v2, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .local v2, "$this$moveCursorPrevByParagraph_u24lambda_u2416":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    const/4 v3, 0x0

    .line 185
    .local v3, "$i$a$-apply$default-BaseTextPreparedSelection$moveCursorPrevByParagraph$1":I
    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getText$foundation_release()Ljava/lang/String;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    iget-wide v5, v2, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->selection:J

    invoke-static {v5, v6}, Landroidx/compose/ui/text/TextRange;->getMin-impl(J)I

    move-result v5

    invoke-static {v4, v5}, Landroidx/compose/foundation/text/StringHelpersKt;->findParagraphStart(Ljava/lang/CharSequence;I)I

    move-result v4

    .line 186
    .local v4, "paragraphStart":I
    iget-wide v5, v2, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->selection:J

    invoke-static {v5, v6}, Landroidx/compose/ui/text/TextRange;->getMin-impl(J)I

    move-result v5

    if-ne v4, v5, :cond_1

    if-eqz v4, :cond_1

    .line 187
    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getText$foundation_release()Ljava/lang/String;

    move-result-object v5

    check-cast v5, Ljava/lang/CharSequence;

    add-int/lit8 v6, v4, -0x1

    invoke-static {v5, v6}, Landroidx/compose/foundation/text/StringHelpersKt;->findParagraphStart(Ljava/lang/CharSequence;I)I

    move-result v4

    .line 189
    :cond_1
    invoke-virtual {v2, v4}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->setCursor(I)V

    .line 190
    nop

    .line 519
    .end local v2    # "$this$moveCursorPrevByParagraph_u24lambda_u2416":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .end local v3    # "$i$a$-apply$default-BaseTextPreparedSelection$moveCursorPrevByParagraph$1":I
    .end local v4    # "paragraphStart":I
    nop

    .line 521
    :cond_2
    const-string/jumbo v2, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .line 190
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "$i$f$apply":I
    return-object v0
.end method

.method public final moveCursorRight()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 103
    nop

    .line 426
    const/4 v0, 0x1

    .local v0, "resetCachedX$iv":Z
    const/4 v1, 0x0

    .line 427
    .local v1, "$i$f$apply":I
    nop

    .line 428
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getState()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;->resetCachedX()V

    .line 430
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getText$foundation_release()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    .line 431
    move-object v2, p0

    check-cast v2, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .local v2, "$this$moveCursorRight_u24lambda_u243":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    const/4 v3, 0x0

    .line 104
    .local v3, "$i$a$-apply$default-BaseTextPreparedSelection$moveCursorRight$1":I
    invoke-direct {v2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->isLtr()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 105
    invoke-direct {v2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->moveCursorNext()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    goto :goto_1

    .line 107
    :cond_1
    invoke-direct {v2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->moveCursorPrev()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .line 109
    :goto_1
    nop

    .line 431
    .end local v2    # "$this$moveCursorRight_u24lambda_u243":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .end local v3    # "$i$a$-apply$default-BaseTextPreparedSelection$moveCursorRight$1":I
    nop

    .line 433
    :cond_2
    const-string/jumbo v2, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .line 109
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "$i$f$apply":I
    return-object v0
.end method

.method public final moveCursorRightByWord()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 168
    nop

    .line 490
    const/4 v0, 0x1

    .local v0, "resetCachedX$iv":Z
    const/4 v1, 0x0

    .line 491
    .local v1, "$i$f$apply":I
    nop

    .line 492
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getState()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;->resetCachedX()V

    .line 494
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getText$foundation_release()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    .line 495
    move-object v2, p0

    check-cast v2, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .local v2, "$this$moveCursorRightByWord_u24lambda_u2411":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    const/4 v3, 0x0

    .line 169
    .local v3, "$i$a$-apply$default-BaseTextPreparedSelection$moveCursorRightByWord$1":I
    invoke-direct {v2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->isLtr()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 170
    invoke-direct {v2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->moveCursorNextByWord()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    goto :goto_1

    .line 172
    :cond_1
    invoke-direct {v2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->moveCursorPrevByWord()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .line 174
    :goto_1
    nop

    .line 495
    .end local v2    # "$this$moveCursorRightByWord_u24lambda_u2411":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .end local v3    # "$i$a$-apply$default-BaseTextPreparedSelection$moveCursorRightByWord$1":I
    nop

    .line 497
    :cond_2
    const-string/jumbo v2, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .line 174
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "$i$f$apply":I
    return-object v0
.end method

.method public final moveCursorToEnd()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 158
    nop

    .line 474
    const/4 v0, 0x1

    .local v0, "resetCachedX$iv":Z
    const/4 v1, 0x0

    .line 475
    .local v1, "$i$f$apply":I
    nop

    .line 476
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getState()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;->resetCachedX()V

    .line 478
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getText$foundation_release()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_1

    .line 479
    move-object v2, p0

    check-cast v2, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .local v2, "$this$moveCursorToEnd_u24lambda_u249":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    const/4 v3, 0x0

    .line 158
    .local v3, "$i$a$-apply$default-BaseTextPreparedSelection$moveCursorToEnd$1":I
    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getText$foundation_release()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v2, v4}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->setCursor(I)V

    .line 479
    .end local v2    # "$this$moveCursorToEnd_u24lambda_u249":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .end local v3    # "$i$a$-apply$default-BaseTextPreparedSelection$moveCursorToEnd$1":I
    nop

    .line 481
    :cond_1
    const-string/jumbo v2, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .line 158
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "$i$f$apply":I
    return-object v0
.end method

.method public final moveCursorToHome()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 156
    nop

    .line 466
    const/4 v0, 0x1

    .local v0, "resetCachedX$iv":Z
    const/4 v1, 0x0

    .line 467
    .local v1, "$i$f$apply":I
    nop

    .line 468
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getState()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;->resetCachedX()V

    .line 470
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getText$foundation_release()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/4 v3, 0x0

    if-lez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    if-eqz v2, :cond_1

    .line 471
    move-object v2, p0

    check-cast v2, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .local v2, "$this$moveCursorToHome_u24lambda_u248":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    const/4 v4, 0x0

    .line 156
    .local v4, "$i$a$-apply$default-BaseTextPreparedSelection$moveCursorToHome$1":I
    invoke-virtual {v2, v3}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->setCursor(I)V

    .line 471
    .end local v2    # "$this$moveCursorToHome_u24lambda_u248":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .end local v4    # "$i$a$-apply$default-BaseTextPreparedSelection$moveCursorToHome$1":I
    nop

    .line 473
    :cond_1
    const-string/jumbo v2, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .line 156
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "$i$f$apply":I
    return-object v0
.end method

.method public final moveCursorToLineEnd()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 212
    nop

    .line 552
    const/4 v0, 0x1

    .local v0, "resetCachedX$iv":Z
    const/4 v1, 0x0

    .line 553
    .local v1, "$i$f$apply":I
    nop

    .line 554
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getState()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;->resetCachedX()V

    .line 556
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getText$foundation_release()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    .line 557
    move-object v2, p0

    check-cast v2, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .local v2, "$this$moveCursorToLineEnd_u24lambda_u2425":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    const/4 v3, 0x0

    .line 212
    .local v3, "$i$a$-apply$default-BaseTextPreparedSelection$moveCursorToLineEnd$1":I
    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getLineEndByOffset()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_1

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    .line 504
    .local v4, "it":I
    const/4 v5, 0x0

    .line 212
    .local v5, "$i$a$-let-BaseTextPreparedSelection$moveCursorToLineEnd$1$1":I
    invoke-virtual {v2, v4}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->setCursor(I)V

    .line 557
    .end local v2    # "$this$moveCursorToLineEnd_u24lambda_u2425":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .end local v3    # "$i$a$-apply$default-BaseTextPreparedSelection$moveCursorToLineEnd$1":I
    .end local v4    # "it":I
    .end local v5    # "$i$a$-let-BaseTextPreparedSelection$moveCursorToLineEnd$1$1":I
    :cond_1
    nop

    .line 559
    :cond_2
    const-string/jumbo v2, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .line 212
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "$i$f$apply":I
    return-object v0
.end method

.method public final moveCursorToLineLeftSide()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 214
    nop

    .line 560
    const/4 v0, 0x1

    .local v0, "resetCachedX$iv":Z
    const/4 v1, 0x0

    .line 561
    .local v1, "$i$f$apply":I
    nop

    .line 562
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getState()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;->resetCachedX()V

    .line 564
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getText$foundation_release()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    .line 565
    move-object v2, p0

    check-cast v2, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .local v2, "$this$moveCursorToLineLeftSide_u24lambda_u2426":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    const/4 v3, 0x0

    .line 215
    .local v3, "$i$a$-apply$default-BaseTextPreparedSelection$moveCursorToLineLeftSide$1":I
    invoke-direct {v2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->isLtr()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 216
    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->moveCursorToLineStart()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    goto :goto_1

    .line 218
    :cond_1
    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->moveCursorToLineEnd()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .line 220
    :goto_1
    nop

    .line 565
    .end local v2    # "$this$moveCursorToLineLeftSide_u24lambda_u2426":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .end local v3    # "$i$a$-apply$default-BaseTextPreparedSelection$moveCursorToLineLeftSide$1":I
    nop

    .line 567
    :cond_2
    const-string/jumbo v2, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .line 220
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "$i$f$apply":I
    return-object v0
.end method

.method public final moveCursorToLineRightSide()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 222
    nop

    .line 568
    const/4 v0, 0x1

    .local v0, "resetCachedX$iv":Z
    const/4 v1, 0x0

    .line 569
    .local v1, "$i$f$apply":I
    nop

    .line 570
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getState()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;->resetCachedX()V

    .line 572
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getText$foundation_release()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    .line 573
    move-object v2, p0

    check-cast v2, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .local v2, "$this$moveCursorToLineRightSide_u24lambda_u2427":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    const/4 v3, 0x0

    .line 223
    .local v3, "$i$a$-apply$default-BaseTextPreparedSelection$moveCursorToLineRightSide$1":I
    invoke-direct {v2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->isLtr()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 224
    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->moveCursorToLineEnd()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    goto :goto_1

    .line 226
    :cond_1
    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->moveCursorToLineStart()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .line 228
    :goto_1
    nop

    .line 573
    .end local v2    # "$this$moveCursorToLineRightSide_u24lambda_u2427":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .end local v3    # "$i$a$-apply$default-BaseTextPreparedSelection$moveCursorToLineRightSide$1":I
    nop

    .line 575
    :cond_2
    const-string/jumbo v2, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .line 228
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "$i$f$apply":I
    return-object v0
.end method

.method public final moveCursorToLineStart()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 208
    nop

    .line 544
    const/4 v0, 0x1

    .local v0, "resetCachedX$iv":Z
    const/4 v1, 0x0

    .line 545
    .local v1, "$i$f$apply":I
    nop

    .line 546
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getState()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;->resetCachedX()V

    .line 548
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getText$foundation_release()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    .line 549
    move-object v2, p0

    check-cast v2, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .local v2, "$this$moveCursorToLineStart_u24lambda_u2423":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    const/4 v3, 0x0

    .line 208
    .local v3, "$i$a$-apply$default-BaseTextPreparedSelection$moveCursorToLineStart$1":I
    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getLineStartByOffset()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_1

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    .line 504
    .local v4, "it":I
    const/4 v5, 0x0

    .line 208
    .local v5, "$i$a$-let-BaseTextPreparedSelection$moveCursorToLineStart$1$1":I
    invoke-virtual {v2, v4}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->setCursor(I)V

    .line 549
    .end local v2    # "$this$moveCursorToLineStart_u24lambda_u2423":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .end local v3    # "$i$a$-apply$default-BaseTextPreparedSelection$moveCursorToLineStart$1":I
    .end local v4    # "it":I
    .end local v5    # "$i$a$-let-BaseTextPreparedSelection$moveCursorToLineStart$1$1":I
    :cond_1
    nop

    .line 551
    :cond_2
    const-string/jumbo v2, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .line 208
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "$i$f$apply":I
    return-object v0
.end method

.method public final moveCursorUpByLine()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 201
    const/4 v0, 0x0

    .local v0, "resetCachedX$iv":Z
    move-object v1, p0

    .local v1, "$this$apply$iv":Ljava/lang/Object;
    move-object v2, p0

    .local v2, "this_$iv":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    const/4 v3, 0x0

    .line 530
    .local v3, "$i$f$apply":I
    nop

    .line 533
    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getText$foundation_release()Ljava/lang/String;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-lez v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_2

    .line 534
    move-object v4, v1

    check-cast v4, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .local v4, "$this$moveCursorUpByLine_u24lambda_u2419":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    const/4 v5, 0x0

    .line 201
    .local v5, "$i$a$-apply-BaseTextPreparedSelection$moveCursorUpByLine$1":I
    iget-object v6, v4, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->layoutResult:Landroidx/compose/ui/text/TextLayoutResult;

    if-eqz v6, :cond_1

    const/4 v7, -0x1

    invoke-direct {v4, v6, v7}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->jumpByLinesOffset(Landroidx/compose/ui/text/TextLayoutResult;I)I

    move-result v6

    .line 504
    .local v6, "it":I
    const/4 v7, 0x0

    .line 201
    .local v7, "$i$a$-let-BaseTextPreparedSelection$moveCursorUpByLine$1$1":I
    invoke-virtual {v4, v6}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->setCursor(I)V

    .line 534
    .end local v4    # "$this$moveCursorUpByLine_u24lambda_u2419":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .end local v5    # "$i$a$-apply-BaseTextPreparedSelection$moveCursorUpByLine$1":I
    .end local v6    # "it":I
    .end local v7    # "$i$a$-let-BaseTextPreparedSelection$moveCursorUpByLine$1$1":I
    :cond_1
    nop

    .line 536
    :cond_2
    const-string/jumbo v4, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, v1

    check-cast v0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .line 201
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "$this$apply$iv":Ljava/lang/Object;
    .end local v2    # "this_$iv":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .end local v3    # "$i$f$apply":I
    return-object v0
.end method

.method public final selectAll()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 91
    nop

    .line 402
    const/4 v0, 0x1

    .local v0, "resetCachedX$iv":Z
    const/4 v1, 0x0

    .line 403
    .local v1, "$i$f$apply":I
    nop

    .line 404
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getState()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;->resetCachedX()V

    .line 406
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getText$foundation_release()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/4 v3, 0x0

    if-lez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    if-eqz v2, :cond_1

    .line 407
    move-object v2, p0

    check-cast v2, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .local v2, "$this$selectAll_u24lambda_u240":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    const/4 v4, 0x0

    .line 91
    .local v4, "$i$a$-apply$default-BaseTextPreparedSelection$selectAll$1":I
    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getText$foundation_release()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    invoke-virtual {v2, v3, v5}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->setSelection(II)V

    .line 407
    .end local v2    # "$this$selectAll_u24lambda_u240":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .end local v4    # "$i$a$-apply$default-BaseTextPreparedSelection$selectAll$1":I
    nop

    .line 409
    :cond_1
    const-string/jumbo v2, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .line 91
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "$i$f$apply":I
    return-object v0
.end method

.method public final selectMovement()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 232
    const/4 v0, 0x0

    .local v0, "resetCachedX$iv":Z
    move-object v1, p0

    .local v1, "$this$apply$iv":Ljava/lang/Object;
    move-object v2, p0

    .local v2, "this_$iv":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    const/4 v3, 0x0

    .line 576
    .local v3, "$i$f$apply":I
    nop

    .line 579
    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getText$foundation_release()Ljava/lang/String;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-lez v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_1

    .line 580
    move-object v4, v1

    check-cast v4, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .local v4, "$this$selectMovement_u24lambda_u2428":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    const/4 v5, 0x0

    .line 232
    .local v5, "$i$a$-apply-BaseTextPreparedSelection$selectMovement$1":I
    iget-wide v6, v4, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->originalSelection:J

    invoke-static {v6, v7}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    move-result v6

    iget-wide v7, v4, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->selection:J

    invoke-static {v7, v8}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v7

    invoke-static {v6, v7}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(II)J

    move-result-wide v6

    iput-wide v6, v4, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->selection:J

    .line 580
    .end local v4    # "$this$selectMovement_u24lambda_u2428":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .end local v5    # "$i$a$-apply-BaseTextPreparedSelection$selectMovement$1":I
    nop

    .line 582
    :cond_1
    const-string/jumbo v4, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, v1

    check-cast v0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;

    .line 232
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "$this$apply$iv":Ljava/lang/Object;
    .end local v2    # "this_$iv":Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;
    .end local v3    # "$i$f$apply":I
    return-object v0
.end method

.method public final setAnnotatedString(Landroidx/compose/ui/text/AnnotatedString;)V
    .locals 0
    .param p1, "<set-?>"    # Landroidx/compose/ui/text/AnnotatedString;

    .line 68
    iput-object p1, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->annotatedString:Landroidx/compose/ui/text/AnnotatedString;

    return-void
.end method

.method protected final setCursor(I)V
    .locals 0
    .param p1, "offset"    # I

    .line 84
    invoke-virtual {p0, p1, p1}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->setSelection(II)V

    .line 85
    return-void
.end method

.method protected final setSelection(II)V
    .locals 2
    .param p1, "start"    # I
    .param p2, "end"    # I

    .line 88
    invoke-static {p1, p2}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(II)J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->selection:J

    .line 89
    return-void
.end method

.method public final setSelection-5zc-tL8(J)V
    .locals 0
    .param p1, "<set-?>"    # J

    .line 66
    iput-wide p1, p0, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->selection:J

    return-void
.end method
