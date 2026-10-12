.class public final Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
.super Ljava/lang/Object;
.source "TextPreparedSelection.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,560:1\n126#1,11:569\n126#1,11:580\n126#1,11:591\n126#1,11:602\n130#1,7:613\n196#1,5:620\n130#1,5:625\n201#1,15:630\n136#1:645\n196#1,5:646\n130#1,5:651\n201#1,15:656\n136#1:671\n196#1,5:672\n130#1,5:677\n201#1,15:682\n136#1:697\n196#1,5:698\n130#1,5:703\n201#1,15:708\n136#1:723\n196#1,5:724\n130#1,5:729\n201#1,15:734\n136#1:749\n196#1,5:750\n130#1,5:755\n201#1,15:760\n136#1:775\n196#1,5:776\n130#1,5:781\n201#1,15:786\n136#1:801\n196#1,5:802\n130#1,5:807\n201#1,15:812\n136#1:827\n200#1:828\n130#1,5:829\n201#1,15:834\n136#1:849\n200#1:850\n130#1,5:851\n201#1,15:856\n136#1:871\n196#1,5:872\n130#1,5:877\n201#1,15:882\n136#1:897\n196#1,5:898\n130#1,5:903\n201#1,15:908\n136#1:923\n200#1:924\n130#1,5:925\n201#1,15:930\n136#1:945\n200#1:946\n130#1,5:947\n201#1,15:952\n136#1:967\n130#1,7:968\n130#1,7:975\n602#2,8:561\n30#3:982\n53#4,3:983\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection\n*L\n139#1:569,11\n141#1:580,11\n158#1:591,11\n171#1:602,11\n200#1:613,7\n217#1:620,5\n217#1:625,5\n217#1:630,15\n217#1:645\n219#1:646,5\n219#1:651,5\n219#1:656,15\n219#1:671\n221#1:672,5\n221#1:677,5\n221#1:682,15\n221#1:697\n223#1:698,5\n223#1:703,5\n223#1:708,15\n223#1:723\n239#1:724,5\n239#1:729,5\n239#1:734,15\n239#1:749\n243#1:750,5\n243#1:755,5\n243#1:760,15\n243#1:775\n247#1:776,5\n247#1:781,5\n247#1:786,15\n247#1:801\n255#1:802,5\n255#1:807,5\n255#1:812,15\n255#1:827\n264#1:828\n264#1:829,5\n264#1:834,15\n264#1:849\n267#1:850\n267#1:851,5\n267#1:856,15\n267#1:871\n283#1:872,5\n283#1:877,5\n283#1:882,15\n283#1:897\n287#1:898,5\n287#1:903,5\n287#1:908,15\n287#1:923\n292#1:924\n292#1:925,5\n292#1:930,15\n292#1:945\n295#1:946\n295#1:947,5\n295#1:952,15\n295#1:967\n299#1:968,7\n304#1:975,7\n106#1:561,8\n395#1:982\n395#1:983,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0019\n\u0002\u0018\u0002\n\u0002\u0008\u0013\u0008\u0000\u0018\u0000 W2\u00020\u0001:\u0001WB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000cJ,\u0010$\u001a\u00020\u00002\u0008\u0008\u0002\u0010%\u001a\u00020\u00072\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020(0\'\u00a2\u0006\u0002\u0008)H\u0082\u0008J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0002J\u001f\u0010-\u001a\u00020\u00002\u0017\u0010.\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020(0\'\u00a2\u0006\u0002\u0008)J\u001f\u0010/\u001a\u00020\u00002\u0017\u0010.\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020(0\'\u00a2\u0006\u0002\u0008)J\u0006\u00100\u001a\u00020\u0000J\u0006\u00101\u001a\u00020\u0000J\u0006\u00102\u001a\u00020+J\u0006\u00103\u001a\u00020+J\u0008\u00104\u001a\u00020\u0007H\u0002J\u0010\u00105\u001a\u00020+2\u0006\u00106\u001a\u00020+H\u0002J\u0006\u00107\u001a\u00020\u0000J\u0006\u00108\u001a\u00020\u0000J\u0006\u00109\u001a\u00020\u0000J\u0006\u0010:\u001a\u00020\u0000J\u0006\u0010;\u001a\u00020\u0000J\u0006\u0010<\u001a\u00020\u0000J\u0006\u0010=\u001a\u00020\u0000J\u0006\u0010>\u001a\u00020\u0000J\u0006\u0010?\u001a\u00020\u0000J\u0006\u0010@\u001a\u00020\u0000J\u0006\u0010A\u001a\u00020\u0000J\u0006\u0010B\u001a\u00020\u0000J!\u0010C\u001a\u00020\u00002\u0008\u0008\u0002\u0010%\u001a\u00020\u00072\u000c\u0010D\u001a\u0008\u0012\u0004\u0012\u00020+0EH\u0082\u0008J\u0006\u0010F\u001a\u00020\u0000J\u0006\u0010G\u001a\u00020\u0000J\u0006\u0010H\u001a\u00020\u0000J\u0006\u0010I\u001a\u00020\u0000J\u0006\u0010J\u001a\u00020\u0000J\u0006\u0010K\u001a\u00020\u0000J\u0006\u0010L\u001a\u00020\u0000J\u0006\u0010M\u001a\u00020\u0000J\u0006\u0010N\u001a\u00020\u0000J\u0006\u0010O\u001a\u00020\u0000J\u0016\u0010P\u001a\u00020+*\u00020\u00052\u0008\u0008\u0002\u0010Q\u001a\u00020+H\u0002J\u0016\u0010R\u001a\u00020+*\u00020\u00052\u0008\u0008\u0002\u0010Q\u001a\u00020+H\u0002J\u0017\u0010S\u001a\u00020+*\u00020\u00052\u0008\u0008\u0002\u0010Q\u001a\u00020+H\u0082\u0010J\u0017\u0010T\u001a\u00020+*\u00020\u00052\u0008\u0008\u0002\u0010Q\u001a\u00020+H\u0082\u0010J\u0014\u0010U\u001a\u00020+*\u00020\u00052\u0006\u0010V\u001a\u00020+H\u0002R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008 \u0010!\"\u0004\u0008\"\u0010#\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006X"
    }
    d2 = {
        "Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;",
        "",
        "state",
        "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;",
        "textLayoutResult",
        "Landroidx/compose/ui/text/TextLayoutResult;",
        "isFromSoftKeyboard",
        "",
        "visibleTextLayoutHeight",
        "",
        "textPreparedSelectionState",
        "Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;",
        "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextLayoutResult;ZFLandroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;)V",
        "initialValue",
        "Landroidx/compose/foundation/text/input/TextFieldCharSequence;",
        "getInitialValue",
        "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;",
        "initialWedgeAffinity",
        "Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;",
        "getInitialWedgeAffinity",
        "()Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;",
        "selection",
        "Landroidx/compose/ui/text/TextRange;",
        "getSelection-d9O1mEE",
        "()J",
        "setSelection-5zc-tL8",
        "(J)V",
        "J",
        "text",
        "",
        "wedgeAffinity",
        "Landroidx/compose/foundation/text/input/internal/WedgeAffinity;",
        "getWedgeAffinity",
        "()Landroidx/compose/foundation/text/input/internal/WedgeAffinity;",
        "setWedgeAffinity",
        "(Landroidx/compose/foundation/text/input/internal/WedgeAffinity;)V",
        "applyIfNotEmpty",
        "resetCachedX",
        "block",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "charOffset",
        "",
        "offset",
        "collapseLeftOr",
        "or",
        "collapseRightOr",
        "deleteMovement",
        "deselect",
        "getNextCharacterIndex",
        "getPrecedingCharacterIndex",
        "isLtr",
        "jumpByPagesOffset",
        "pagesAmount",
        "moveCursorDownByLine",
        "moveCursorDownByPage",
        "moveCursorLeftByChar",
        "moveCursorLeftByWord",
        "moveCursorNextByChar",
        "moveCursorNextByParagraph",
        "moveCursorNextByWord",
        "moveCursorPrevByChar",
        "moveCursorPrevByParagraph",
        "moveCursorPrevByWord",
        "moveCursorRightByChar",
        "moveCursorRightByWord",
        "moveCursorTo",
        "proposedCursorMovement",
        "Lkotlin/Function0;",
        "moveCursorToEnd",
        "moveCursorToHome",
        "moveCursorToLineEnd",
        "moveCursorToLineLeftSide",
        "moveCursorToLineRightSide",
        "moveCursorToLineStart",
        "moveCursorUpByLine",
        "moveCursorUpByPage",
        "selectAll",
        "selectMovement",
        "getLineEndByOffsetForLayout",
        "currentOffset",
        "getLineStartByOffsetForLayout",
        "getNextWordOffsetForLayout",
        "getPrevWordOffsetForLayout",
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

.field public static final Companion:Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection$Companion;

.field public static final NoCharacterFound:I = -0x1


# instance fields
.field private final initialValue:Landroidx/compose/foundation/text/input/TextFieldCharSequence;

.field private final initialWedgeAffinity:Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;

.field private final isFromSoftKeyboard:Z

.field private selection:J

.field private final state:Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

.field private final text:Ljava/lang/String;

.field private final textLayoutResult:Landroidx/compose/ui/text/TextLayoutResult;

.field private final textPreparedSelectionState:Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;

.field private final visibleTextLayoutHeight:F

.field private wedgeAffinity:Landroidx/compose/foundation/text/input/internal/WedgeAffinity;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->Companion:Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection$Companion;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextLayoutResult;ZFLandroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;)V
    .locals 7
    .param p1, "state"    # Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .param p2, "textLayoutResult"    # Landroidx/compose/ui/text/TextLayoutResult;
    .param p3, "isFromSoftKeyboard"    # Z
    .param p4, "visibleTextLayoutHeight"    # F
    .param p5, "textPreparedSelectionState"    # Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->state:Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    .line 90
    iput-object p2, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->textLayoutResult:Landroidx/compose/ui/text/TextLayoutResult;

    .line 91
    iput-boolean p3, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->isFromSoftKeyboard:Z

    .line 92
    iput p4, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->visibleTextLayoutHeight:F

    .line 93
    iput-object p5, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->textPreparedSelectionState:Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;

    .line 105
    nop

    .line 106
    sget-object v0, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    .local v0, "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot$Companion;
    const/4 v1, 0x0

    .line 561
    .local v1, "$i$f$withoutReadObservation":I
    nop

    .line 562
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrentThreadSnapshot()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v2

    .line 563
    .local v2, "previousSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/Snapshot;->getReadObserver()Lkotlin/jvm/functions/Function1;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 564
    .local v3, "observer$iv":Lkotlin/jvm/functions/Function1;
    :goto_0
    invoke-virtual {v0, v2}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->makeCurrentNonObservable(Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v4

    .line 565
    .local v4, "newSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    nop

    .line 566
    const/4 v5, 0x0

    .line 107
    .local v5, "$i$a$-withoutReadObservation-TextFieldPreparedSelection$1":I
    :try_start_0
    iget-object v6, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->state:Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    invoke-virtual {v6}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->getVisualText()Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    move-result-object v6

    iput-object v6, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->initialValue:Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    .line 108
    iget-object v6, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->state:Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    invoke-virtual {v6}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->getSelectionWedgeAffinity()Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;

    move-result-object v6

    iput-object v6, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->initialWedgeAffinity:Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;

    .line 109
    nop

    .end local v5    # "$i$a$-withoutReadObservation-TextFieldPreparedSelection$1":I
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 566
    nop

    .line 568
    invoke-virtual {v0, v2, v4, v3}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->restoreNonObservable(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)V

    .line 566
    nop

    .line 110
    .end local v0    # "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot$Companion;
    .end local v1    # "$i$f$withoutReadObservation":I
    .end local v2    # "previousSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .end local v3    # "observer$iv":Lkotlin/jvm/functions/Function1;
    .end local v4    # "newSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    nop

    .line 113
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->initialValue:Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    invoke-virtual {v0}, Landroidx/compose/foundation/text/input/TextFieldCharSequence;->getSelection-d9O1mEE()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selection:J

    .line 118
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->initialValue:Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    invoke-virtual {v0}, Landroidx/compose/foundation/text/input/TextFieldCharSequence;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->text:Ljava/lang/String;

    .line 88
    return-void

    .line 568
    .restart local v0    # "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot$Companion;
    .restart local v1    # "$i$f$withoutReadObservation":I
    .restart local v2    # "previousSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .restart local v3    # "observer$iv":Lkotlin/jvm/functions/Function1;
    .restart local v4    # "newSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    :catchall_0
    move-exception v5

    invoke-virtual {v0, v2, v4, v3}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->restoreNonObservable(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)V

    throw v5
.end method

.method public static final synthetic access$getState$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    .line 88
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->state:Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    return-object v0
.end method

.method public static final synthetic access$getText$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Ljava/lang/String;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    .line 88
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->text:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    .line 88
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->textPreparedSelectionState:Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;

    return-object v0
.end method

.method private final applyIfNotEmpty(ZLkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .locals 2
    .param p1, "resetCachedX"    # Z
    .param p2, "block"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;",
            "Lkotlin/Unit;",
            ">;)",
            "Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 130
    .local v0, "$i$f$applyIfNotEmpty":I
    if-eqz p1, :cond_0

    .line 131
    invoke-static {p0}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 133
    :cond_0
    invoke-static {p0}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Ljava/lang/String;

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

    .line 134
    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    :cond_2
    return-object p0
.end method

.method static synthetic applyIfNotEmpty$default(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .param p1, "resetCachedX"    # Z
    .param p2, "block"    # Lkotlin/jvm/functions/Function1;

    .line 126
    const/4 p4, 0x1

    and-int/2addr p3, p4

    if-eqz p3, :cond_0

    .line 127
    const/4 p1, 0x1

    .line 126
    :cond_0
    const/4 p3, 0x0

    .line 130
    .local p3, "$i$f$applyIfNotEmpty":I
    if-eqz p1, :cond_1

    .line 131
    invoke-static {p0}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 133
    :cond_1
    invoke-static {p0}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 p4, 0x0

    :goto_0
    if-eqz p4, :cond_3

    .line 134
    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    :cond_3
    return-object p0
.end method

.method private final charOffset(I)I
    .locals 1
    .param p1, "offset"    # I

    .line 427
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->text:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {p1, v0}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    move-result v0

    return v0
.end method

.method private final getLineEndByOffsetForLayout(Landroidx/compose/ui/text/TextLayoutResult;I)I
    .locals 2
    .param p1, "$this$getLineEndByOffsetForLayout"    # Landroidx/compose/ui/text/TextLayoutResult;
    .param p2, "currentOffset"    # I

    .line 363
    invoke-virtual {p1, p2}, Landroidx/compose/ui/text/TextLayoutResult;->getLineForOffset(I)I

    move-result v0

    .line 364
    .local v0, "currentLine":I
    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroidx/compose/ui/text/TextLayoutResult;->getLineEnd(IZ)I

    move-result v1

    return v1
.end method

.method static synthetic getLineEndByOffsetForLayout$default(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;Landroidx/compose/ui/text/TextLayoutResult;IILjava/lang/Object;)I
    .locals 0

    .line 360
    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    .line 361
    iget-wide p2, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selection:J

    invoke-static {p2, p3}, Landroidx/compose/ui/text/TextRange;->getMax-impl(J)I

    move-result p2

    .line 360
    :cond_0
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getLineEndByOffsetForLayout(Landroidx/compose/ui/text/TextLayoutResult;I)I

    move-result p0

    return p0
.end method

.method private final getLineStartByOffsetForLayout(Landroidx/compose/ui/text/TextLayoutResult;I)I
    .locals 2
    .param p1, "$this$getLineStartByOffsetForLayout"    # Landroidx/compose/ui/text/TextLayoutResult;
    .param p2, "currentOffset"    # I

    .line 356
    invoke-virtual {p1, p2}, Landroidx/compose/ui/text/TextLayoutResult;->getLineForOffset(I)I

    move-result v0

    .line 357
    .local v0, "currentLine":I
    invoke-virtual {p1, v0}, Landroidx/compose/ui/text/TextLayoutResult;->getLineStart(I)I

    move-result v1

    return v1
.end method

.method static synthetic getLineStartByOffsetForLayout$default(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;Landroidx/compose/ui/text/TextLayoutResult;IILjava/lang/Object;)I
    .locals 0

    .line 353
    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    .line 354
    iget-wide p2, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selection:J

    invoke-static {p2, p3}, Landroidx/compose/ui/text/TextRange;->getMin-impl(J)I

    move-result p2

    .line 353
    :cond_0
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getLineStartByOffsetForLayout(Landroidx/compose/ui/text/TextLayoutResult;I)I

    move-result p0

    return p0
.end method

.method private final getNextWordOffsetForLayout(Landroidx/compose/ui/text/TextLayoutResult;I)I
    .locals 3
    .param p1, "$this$getNextWordOffsetForLayout"    # Landroidx/compose/ui/text/TextLayoutResult;
    .param p2, "currentOffset"    # I

    .line 328
    nop

    :goto_0
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->initialValue:Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    invoke-virtual {v0}, Landroidx/compose/foundation/text/input/TextFieldCharSequence;->length()I

    move-result v0

    if-lt p2, v0, :cond_0

    .line 329
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->initialValue:Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    invoke-virtual {v0}, Landroidx/compose/foundation/text/input/TextFieldCharSequence;->length()I

    move-result v0

    return v0

    .line 331
    :cond_0
    invoke-direct {p0, p2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->charOffset(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/compose/ui/text/TextLayoutResult;->getWordBoundary--jx7JFs(I)J

    move-result-wide v0

    .line 332
    .local v0, "currentWord":J
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v2

    if-gt v2, p2, :cond_1

    .line 333
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 335
    :cond_1
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v2

    .line 332
    return v2
.end method

.method static synthetic getNextWordOffsetForLayout$default(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;Landroidx/compose/ui/text/TextLayoutResult;IILjava/lang/Object;)I
    .locals 0

    .line 325
    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    .line 326
    iget-wide p2, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selection:J

    invoke-static {p2, p3}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result p2

    .line 325
    :cond_0
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getNextWordOffsetForLayout(Landroidx/compose/ui/text/TextLayoutResult;I)I

    move-result p0

    return p0
.end method

.method private final getPrevWordOffsetForLayout(Landroidx/compose/ui/text/TextLayoutResult;I)I
    .locals 3
    .param p1, "$this$getPrevWordOffsetForLayout"    # Landroidx/compose/ui/text/TextLayoutResult;
    .param p2, "currentOffset"    # I

    .line 342
    nop

    :goto_0
    if-gtz p2, :cond_0

    .line 343
    const/4 v0, 0x0

    return v0

    .line 345
    :cond_0
    invoke-direct {p0, p2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->charOffset(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/compose/ui/text/TextLayoutResult;->getWordBoundary--jx7JFs(I)J

    move-result-wide v0

    .line 346
    .local v0, "currentWord":J
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    move-result v2

    if-lt v2, p2, :cond_1

    .line 347
    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    .line 349
    :cond_1
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    move-result v2

    .line 346
    return v2
.end method

.method static synthetic getPrevWordOffsetForLayout$default(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;Landroidx/compose/ui/text/TextLayoutResult;IILjava/lang/Object;)I
    .locals 0

    .line 339
    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    .line 340
    iget-wide p2, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selection:J

    invoke-static {p2, p3}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result p2

    .line 339
    :cond_0
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getPrevWordOffsetForLayout(Landroidx/compose/ui/text/TextLayoutResult;I)I

    move-result p0

    return p0
.end method

.method private final isLtr()Z
    .locals 4

    .line 321
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->textLayoutResult:Landroidx/compose/ui/text/TextLayoutResult;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    iget-wide v2, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selection:J

    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v2

    invoke-virtual {v0, v2}, Landroidx/compose/ui/text/TextLayoutResult;->getParagraphDirection(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 322
    .local v0, "direction":Landroidx/compose/ui/text/style/ResolvedTextDirection;
    :cond_0
    sget-object v2, Landroidx/compose/ui/text/style/ResolvedTextDirection;->Ltr:Landroidx/compose/ui/text/style/ResolvedTextDirection;

    if-ne v0, v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1

    .line 321
    .end local v0    # "direction":Landroidx/compose/ui/text/style/ResolvedTextDirection;
    :cond_2
    :goto_1
    return v1
.end method

.method private final jumpByLinesOffset(Landroidx/compose/ui/text/TextLayoutResult;I)I
    .locals 16
    .param p1, "$this$jumpByLinesOffset"    # Landroidx/compose/ui/text/TextLayoutResult;
    .param p2, "linesAmount"    # I

    .line 368
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-wide v2, v0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selection:J

    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v2

    .line 370
    .local v2, "currentOffset":I
    iget-object v3, v0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->textPreparedSelectionState:Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;

    invoke-virtual {v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;->getCachedX()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 371
    iget-object v3, v0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->textPreparedSelectionState:Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;

    invoke-virtual {v1, v2}, Landroidx/compose/ui/text/TextLayoutResult;->getCursorRect(I)Landroidx/compose/ui/geometry/Rect;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    move-result v4

    invoke-virtual {v3, v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;->setCachedX(F)V

    .line 374
    :cond_0
    invoke-virtual {v1, v2}, Landroidx/compose/ui/text/TextLayoutResult;->getLineForOffset(I)I

    move-result v3

    add-int v3, v3, p2

    .line 375
    .local v3, "targetLine":I
    nop

    .line 376
    if-gez v3, :cond_1

    .line 377
    const/4 v4, 0x0

    return v4

    .line 379
    :cond_1
    invoke-virtual {v1}, Landroidx/compose/ui/text/TextLayoutResult;->getLineCount()I

    move-result v4

    if-lt v3, v4, :cond_2

    .line 380
    iget-object v4, v0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->text:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    return v4

    .line 384
    :cond_2
    invoke-virtual {v1, v3}, Landroidx/compose/ui/text/TextLayoutResult;->getLineBottom(I)F

    move-result v4

    const/high16 v5, 0x3f800000    # 1.0f

    sub-float/2addr v4, v5

    .line 386
    .local v4, "y":F
    iget-object v5, v0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->textPreparedSelectionState:Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;

    invoke-virtual {v5}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;->getCachedX()F

    move-result v5

    move v6, v5

    .local v6, "it":F
    const/4 v7, 0x0

    .line 387
    .local v7, "$i$a$-also-TextFieldPreparedSelection$jumpByLinesOffset$x$1":I
    nop

    .line 388
    invoke-direct {v0}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->isLtr()Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-virtual {v1, v3}, Landroidx/compose/ui/text/TextLayoutResult;->getLineRight(I)F

    move-result v8

    cmpl-float v8, v6, v8

    if-gez v8, :cond_4

    .line 389
    :cond_3
    invoke-direct {v0}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->isLtr()Z

    move-result v8

    if-nez v8, :cond_5

    invoke-virtual {v1, v3}, Landroidx/compose/ui/text/TextLayoutResult;->getLineLeft(I)F

    move-result v8

    cmpg-float v8, v6, v8

    if-gtz v8, :cond_5

    .line 391
    :cond_4
    const/4 v5, 0x1

    invoke-virtual {v1, v3, v5}, Landroidx/compose/ui/text/TextLayoutResult;->getLineEnd(IZ)I

    move-result v5

    return v5

    .line 393
    :cond_5
    nop

    .line 386
    .end local v6    # "it":F
    .end local v7    # "$i$a$-also-TextFieldPreparedSelection$jumpByLinesOffset$x$1":I
    nop

    .line 385
    nop

    .line 395
    .local v5, "x":F
    const/4 v6, 0x0

    .line 982
    .local v6, "$i$f$Offset":I
    const/4 v7, 0x0

    .line 983
    .local v7, "$i$f$packFloats":I
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    int-to-long v8, v8

    .line 984
    .local v8, "v1$iv$iv":J
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v10

    int-to-long v10, v10

    .line 985
    .local v10, "v2$iv$iv":J
    const/16 v12, 0x20

    shl-long v12, v8, v12

    const-wide v14, 0xffffffffL

    and-long/2addr v14, v10

    or-long v7, v12, v14

    .line 982
    .end local v7    # "$i$f$packFloats":I
    .end local v8    # "v1$iv$iv":J
    .end local v10    # "v2$iv$iv":J
    invoke-static {v7, v8}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    move-result-wide v6

    .line 395
    .end local v6    # "$i$f$Offset":I
    invoke-virtual {v1, v6, v7}, Landroidx/compose/ui/text/TextLayoutResult;->getOffsetForPosition-k-4lQ0M(J)I

    move-result v6

    return v6
.end method

.method private final jumpByPagesOffset(I)I
    .locals 9
    .param p1, "pagesAmount"    # I

    .line 407
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->initialValue:Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    invoke-virtual {v0}, Landroidx/compose/foundation/text/input/TextFieldCharSequence;->getSelection-d9O1mEE()J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v0

    .line 408
    .local v0, "currentOffset":I
    iget-object v1, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->textLayoutResult:Landroidx/compose/ui/text/TextLayoutResult;

    if-eqz v1, :cond_2

    iget v1, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->visibleTextLayoutHeight:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 409
    :cond_0
    iget-object v1, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->textLayoutResult:Landroidx/compose/ui/text/TextLayoutResult;

    invoke-virtual {v1, v0}, Landroidx/compose/ui/text/TextLayoutResult;->getCursorRect(I)Landroidx/compose/ui/geometry/Rect;

    move-result-object v1

    .line 411
    .local v1, "currentPos":Landroidx/compose/ui/geometry/Rect;
    nop

    .line 412
    nop

    .line 413
    iget v2, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->visibleTextLayoutHeight:F

    int-to-float v3, p1

    mul-float/2addr v2, v3

    .line 411
    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Landroidx/compose/ui/geometry/Rect;->translate(FF)Landroidx/compose/ui/geometry/Rect;

    move-result-object v2

    .line 410
    nop

    .line 416
    .local v2, "newPos":Landroidx/compose/ui/geometry/Rect;
    iget-object v3, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->textLayoutResult:Landroidx/compose/ui/text/TextLayoutResult;

    invoke-virtual {v2}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    move-result v4

    invoke-virtual {v3, v4}, Landroidx/compose/ui/text/TextLayoutResult;->getLineForVerticalPosition(F)I

    move-result v3

    .line 417
    .local v3, "topLine":I
    iget-object v4, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->textLayoutResult:Landroidx/compose/ui/text/TextLayoutResult;

    invoke-virtual {v4, v3}, Landroidx/compose/ui/text/TextLayoutResult;->getLineBottom(I)F

    move-result v4

    .line 418
    .local v4, "lineSeparator":F
    invoke-virtual {v2}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    move-result v5

    sub-float/2addr v5, v4

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    invoke-virtual {v2}, Landroidx/compose/ui/geometry/Rect;->getBottom()F

    move-result v6

    sub-float/2addr v6, v4

    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v6

    cmpl-float v5, v5, v6

    .line 423
    iget-object v6, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->textLayoutResult:Landroidx/compose/ui/text/TextLayoutResult;

    .line 418
    if-lez v5, :cond_1

    .line 420
    invoke-virtual {v2}, Landroidx/compose/ui/geometry/Rect;->getTopLeft-F1C5BW0()J

    move-result-wide v7

    invoke-virtual {v6, v7, v8}, Landroidx/compose/ui/text/TextLayoutResult;->getOffsetForPosition-k-4lQ0M(J)I

    move-result v5

    goto :goto_0

    .line 423
    :cond_1
    invoke-virtual {v2}, Landroidx/compose/ui/geometry/Rect;->getBottomLeft-F1C5BW0()J

    move-result-wide v7

    invoke-virtual {v6, v7, v8}, Landroidx/compose/ui/text/TextLayoutResult;->getOffsetForPosition-k-4lQ0M(J)I

    move-result v5

    .line 418
    :goto_0
    return v5

    .line 408
    .end local v1    # "currentPos":Landroidx/compose/ui/geometry/Rect;
    .end local v2    # "newPos":Landroidx/compose/ui/geometry/Rect;
    .end local v3    # "topLine":I
    .end local v4    # "lineSeparator":F
    :cond_2
    :goto_1
    return v0
.end method

.method private final moveCursorTo(ZLkotlin/jvm/functions/Function0;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .locals 11
    .param p1, "resetCachedX"    # Z
    .param p2, "proposedCursorMovement"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Integer;",
            ">;)",
            "Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 200
    .local v0, "$i$f$moveCursorTo":I
    move-object v1, p0

    .local v1, "this_$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v2, 0x0

    .line 613
    .local v2, "$i$f$applyIfNotEmpty":I
    if-eqz p1, :cond_0

    .line 614
    invoke-static {v1}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 616
    :cond_0
    invoke-static {v1}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Ljava/lang/String;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-lez v3, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_5

    .line 617
    move-object v3, v1

    check-cast v3, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    .local v3, "$this$moveCursorTo_u24lambda_u245":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v4, 0x0

    .line 201
    .local v4, "$i$a$-applyIfNotEmpty-TextFieldPreparedSelection$moveCursorTo$1":I
    invoke-virtual {v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v5

    invoke-static {v5, v6}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v5

    .line 204
    .local v5, "oldCursor":I
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    .line 205
    nop

    .line 206
    invoke-static {v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getState$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    move-result-object v7

    .line 203
    invoke-static {v6, v5, v7}, Landroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt;->calculateNextCursorPositionAndWedgeAffinity(IILandroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)J

    move-result-wide v6

    invoke-static {v6, v7}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->component1-impl(J)I

    move-result v8

    .line 202
    nop

    .local v8, "newCursor":I
    invoke-static {v6, v7}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->component2-impl(J)Landroidx/compose/foundation/text/input/internal/WedgeAffinity;

    move-result-object v6

    .line 209
    .local v6, "newWedgeAffinity":Landroidx/compose/foundation/text/input/internal/WedgeAffinity;
    if-ne v8, v5, :cond_2

    invoke-virtual {v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v9

    invoke-static {v9, v10}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v7

    if-nez v7, :cond_3

    .line 210
    :cond_2
    invoke-static {v8}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(I)J

    move-result-wide v9

    invoke-virtual {v3, v9, v10}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->setSelection-5zc-tL8(J)V

    .line 212
    :cond_3
    if-eqz v6, :cond_4

    .line 213
    invoke-virtual {v3, v6}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->setWedgeAffinity(Landroidx/compose/foundation/text/input/internal/WedgeAffinity;)V

    .line 215
    :cond_4
    nop

    .line 617
    .end local v3    # "$this$moveCursorTo_u24lambda_u245":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v4    # "$i$a$-applyIfNotEmpty-TextFieldPreparedSelection$moveCursorTo$1":I
    .end local v5    # "oldCursor":I
    .end local v6    # "newWedgeAffinity":Landroidx/compose/foundation/text/input/internal/WedgeAffinity;
    .end local v8    # "newCursor":I
    nop

    .line 619
    :cond_5
    nop

    .line 215
    .end local v1    # "this_$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v2    # "$i$f$applyIfNotEmpty":I
    return-object v1
.end method

.method static synthetic moveCursorTo$default(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .locals 9
    .param p0, "$this"    # Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .param p1, "resetCachedX"    # Z
    .param p2, "proposedCursorMovement"    # Lkotlin/jvm/functions/Function0;

    .line 196
    const/4 p4, 0x1

    and-int/2addr p3, p4

    if-eqz p3, :cond_0

    .line 197
    const/4 p1, 0x1

    .line 196
    :cond_0
    const/4 p3, 0x0

    .line 200
    .local p3, "$i$f$moveCursorTo":I
    move-object v0, p0

    .local v0, "this_$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v1, 0x0

    .line 613
    .local v1, "$i$f$applyIfNotEmpty":I
    if-eqz p1, :cond_1

    .line 614
    invoke-static {v0}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 616
    :cond_1
    invoke-static {v0}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_2

    goto :goto_0

    :cond_2
    const/4 p4, 0x0

    :goto_0
    if-eqz p4, :cond_6

    .line 617
    move-object p4, v0

    .local p4, "$this$moveCursorTo_u24lambda_u245":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v2, 0x0

    .line 201
    .local v2, "$i$a$-applyIfNotEmpty-TextFieldPreparedSelection$moveCursorTo$1":I
    invoke-virtual {p4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v3

    invoke-static {v3, v4}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v3

    .line 204
    .local v3, "oldCursor":I
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    .line 205
    nop

    .line 206
    invoke-static {p4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getState$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    move-result-object v5

    .line 203
    invoke-static {v4, v3, v5}, Landroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt;->calculateNextCursorPositionAndWedgeAffinity(IILandroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)J

    move-result-wide v4

    invoke-static {v4, v5}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->component1-impl(J)I

    move-result v6

    .line 202
    nop

    .local v6, "newCursor":I
    invoke-static {v4, v5}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->component2-impl(J)Landroidx/compose/foundation/text/input/internal/WedgeAffinity;

    move-result-object v4

    .line 209
    .local v4, "newWedgeAffinity":Landroidx/compose/foundation/text/input/internal/WedgeAffinity;
    if-ne v6, v3, :cond_3

    invoke-virtual {p4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v7

    invoke-static {v7, v8}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v5

    if-nez v5, :cond_4

    .line 210
    :cond_3
    invoke-static {v6}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(I)J

    move-result-wide v7

    invoke-virtual {p4, v7, v8}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->setSelection-5zc-tL8(J)V

    .line 212
    :cond_4
    if-eqz v4, :cond_5

    .line 213
    invoke-virtual {p4, v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->setWedgeAffinity(Landroidx/compose/foundation/text/input/internal/WedgeAffinity;)V

    .line 215
    :cond_5
    nop

    .line 617
    .end local v2    # "$i$a$-applyIfNotEmpty-TextFieldPreparedSelection$moveCursorTo$1":I
    .end local v3    # "oldCursor":I
    .end local v4    # "newWedgeAffinity":Landroidx/compose/foundation/text/input/internal/WedgeAffinity;
    .end local v6    # "newCursor":I
    .end local p4    # "$this$moveCursorTo_u24lambda_u245":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    nop

    .line 619
    :cond_6
    nop

    .line 215
    .end local v0    # "this_$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v1    # "$i$f$applyIfNotEmpty":I
    return-object v0
.end method


# virtual methods
.method public final collapseLeftOr(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .locals 7
    .param p1, "or"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;",
            "Lkotlin/Unit;",
            ">;)",
            "Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;"
        }
    .end annotation

    .line 158
    nop

    .line 591
    nop

    .line 592
    const/4 v0, 0x1

    .line 591
    .local v0, "resetCachedX$iv":Z
    const/4 v1, 0x0

    .line 595
    .local v1, "$i$f$applyIfNotEmpty":I
    nop

    .line 596
    invoke-static {p0}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 598
    invoke-static {p0}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Ljava/lang/String;

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
    if-eqz v2, :cond_3

    .line 599
    move-object v2, p0

    check-cast v2, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    .local v2, "$this$collapseLeftOr_u24lambda_u243":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v3, 0x0

    .line 159
    .local v3, "$i$a$-applyIfNotEmpty$default-TextFieldPreparedSelection$collapseLeftOr$1":I
    iget-wide v4, v2, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selection:J

    invoke-static {v4, v5}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 160
    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 162
    :cond_1
    invoke-direct {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->isLtr()Z

    move-result v4

    .line 165
    iget-wide v5, v2, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selection:J

    .line 162
    if-eqz v4, :cond_2

    .line 163
    invoke-static {v5, v6}, Landroidx/compose/ui/text/TextRange;->getMin-impl(J)I

    move-result v4

    invoke-static {v4}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(I)J

    move-result-wide v4

    iput-wide v4, v2, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selection:J

    goto :goto_1

    .line 165
    :cond_2
    invoke-static {v5, v6}, Landroidx/compose/ui/text/TextRange;->getMax-impl(J)I

    move-result v4

    invoke-static {v4}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(I)J

    move-result-wide v4

    iput-wide v4, v2, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selection:J

    .line 168
    :goto_1
    nop

    .line 599
    .end local v2    # "$this$collapseLeftOr_u24lambda_u243":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v3    # "$i$a$-applyIfNotEmpty$default-TextFieldPreparedSelection$collapseLeftOr$1":I
    nop

    .line 601
    :cond_3
    nop

    .line 168
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "$i$f$applyIfNotEmpty":I
    return-object p0
.end method

.method public final collapseRightOr(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .locals 7
    .param p1, "or"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;",
            "Lkotlin/Unit;",
            ">;)",
            "Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;"
        }
    .end annotation

    .line 171
    nop

    .line 602
    nop

    .line 603
    const/4 v0, 0x1

    .line 602
    .local v0, "resetCachedX$iv":Z
    const/4 v1, 0x0

    .line 606
    .local v1, "$i$f$applyIfNotEmpty":I
    nop

    .line 607
    invoke-static {p0}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 609
    invoke-static {p0}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Ljava/lang/String;

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
    if-eqz v2, :cond_3

    .line 610
    move-object v2, p0

    check-cast v2, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    .local v2, "$this$collapseRightOr_u24lambda_u244":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v3, 0x0

    .line 172
    .local v3, "$i$a$-applyIfNotEmpty$default-TextFieldPreparedSelection$collapseRightOr$1":I
    iget-wide v4, v2, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selection:J

    invoke-static {v4, v5}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 173
    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 175
    :cond_1
    invoke-direct {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->isLtr()Z

    move-result v4

    .line 178
    iget-wide v5, v2, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selection:J

    .line 175
    if-eqz v4, :cond_2

    .line 176
    invoke-static {v5, v6}, Landroidx/compose/ui/text/TextRange;->getMax-impl(J)I

    move-result v4

    invoke-static {v4}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(I)J

    move-result-wide v4

    iput-wide v4, v2, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selection:J

    goto :goto_1

    .line 178
    :cond_2
    invoke-static {v5, v6}, Landroidx/compose/ui/text/TextRange;->getMin-impl(J)I

    move-result v4

    invoke-static {v4}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(I)J

    move-result-wide v4

    iput-wide v4, v2, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selection:J

    .line 181
    :goto_1
    nop

    .line 610
    .end local v2    # "$this$collapseRightOr_u24lambda_u244":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v3    # "$i$a$-applyIfNotEmpty$default-TextFieldPreparedSelection$collapseRightOr$1":I
    nop

    .line 612
    :cond_3
    nop

    .line 181
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "$i$f$applyIfNotEmpty":I
    return-object p0
.end method

.method public final deleteMovement()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .locals 15

    .line 304
    const/4 v0, 0x0

    .local v0, "resetCachedX$iv":Z
    move-object v1, p0

    .local v1, "this_$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v2, 0x0

    .line 975
    .local v2, "$i$f$applyIfNotEmpty":I
    nop

    .line 978
    invoke-static {v1}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Ljava/lang/String;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    const/4 v4, 0x1

    if-lez v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_2

    .line 979
    move-object v3, v1

    check-cast v3, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    .local v3, "$this$deleteMovement_u24lambda_u2421":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v5, 0x0

    .line 305
    .local v5, "$i$a$-applyIfNotEmpty-TextFieldPreparedSelection$deleteMovement$1":I
    iget-object v6, v3, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->initialValue:Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    invoke-virtual {v6}, Landroidx/compose/foundation/text/input/TextFieldCharSequence;->getSelection-d9O1mEE()J

    move-result-wide v6

    invoke-static {v6, v7}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v6

    .line 308
    iget-object v7, v3, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->state:Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    .line 305
    if-nez v6, :cond_1

    .line 306
    invoke-virtual {v7}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->deleteSelectedText()V

    goto :goto_1

    .line 308
    :cond_1
    nop

    .line 309
    const-string v6, ""

    move-object v8, v6

    check-cast v8, Ljava/lang/CharSequence;

    .line 310
    iget-object v6, v3, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->initialValue:Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    invoke-virtual {v6}, Landroidx/compose/foundation/text/input/TextFieldCharSequence;->getSelection-d9O1mEE()J

    move-result-wide v9

    invoke-static {v9, v10}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    move-result v6

    iget-wide v9, v3, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selection:J

    invoke-static {v9, v10}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v9

    invoke-static {v6, v9}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(II)J

    move-result-wide v9

    .line 308
    nop

    .line 311
    iget-boolean v6, v3, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->isFromSoftKeyboard:Z

    .line 308
    xor-int/lit8 v12, v6, 0x1

    const/4 v13, 0x4

    const/4 v14, 0x0

    const/4 v11, 0x0

    invoke-static/range {v7 .. v14}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->replaceText-M8tDOmk$default(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Ljava/lang/CharSequence;JLandroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;ZILjava/lang/Object;)V

    .line 315
    :goto_1
    iget-object v4, v3, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->state:Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->getVisualText()Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/TextFieldCharSequence;->getSelection-d9O1mEE()J

    move-result-wide v6

    iput-wide v6, v3, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selection:J

    .line 317
    sget-object v4, Landroidx/compose/foundation/text/input/internal/WedgeAffinity;->Start:Landroidx/compose/foundation/text/input/internal/WedgeAffinity;

    iput-object v4, v3, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->wedgeAffinity:Landroidx/compose/foundation/text/input/internal/WedgeAffinity;

    .line 318
    nop

    .line 979
    .end local v3    # "$this$deleteMovement_u24lambda_u2421":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v5    # "$i$a$-applyIfNotEmpty-TextFieldPreparedSelection$deleteMovement$1":I
    nop

    .line 981
    :cond_2
    nop

    .line 318
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "this_$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v2    # "$i$f$applyIfNotEmpty":I
    return-object v1
.end method

.method public final deselect()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .locals 6

    .line 141
    nop

    .line 580
    nop

    .line 581
    const/4 v0, 0x1

    .line 580
    .local v0, "resetCachedX$iv":Z
    const/4 v1, 0x0

    .line 584
    .local v1, "$i$f$applyIfNotEmpty":I
    nop

    .line 585
    invoke-static {p0}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 587
    invoke-static {p0}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Ljava/lang/String;

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

    .line 588
    move-object v2, p0

    check-cast v2, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    .local v2, "$this$deselect_u24lambda_u242":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v3, 0x0

    .line 141
    .local v3, "$i$a$-applyIfNotEmpty$default-TextFieldPreparedSelection$deselect$1":I
    iget-wide v4, v2, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selection:J

    invoke-static {v4, v5}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v4

    invoke-static {v4}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(I)J

    move-result-wide v4

    iput-wide v4, v2, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selection:J

    .line 588
    .end local v2    # "$this$deselect_u24lambda_u242":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v3    # "$i$a$-applyIfNotEmpty$default-TextFieldPreparedSelection$deselect$1":I
    nop

    .line 590
    :cond_1
    nop

    .line 141
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "$i$f$applyIfNotEmpty":I
    return-object p0
.end method

.method public final getInitialValue()Landroidx/compose/foundation/text/input/TextFieldCharSequence;
    .locals 1

    .line 101
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->initialValue:Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    return-object v0
.end method

.method public final getInitialWedgeAffinity()Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;
    .locals 1

    .line 103
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->initialWedgeAffinity:Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;

    return-object v0
.end method

.method public final getNextCharacterIndex()I
    .locals 3

    .line 190
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->text:Ljava/lang/String;

    iget-wide v1, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selection:J

    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v1

    invoke-static {v0, v1}, Landroidx/compose/foundation/text/StringHelpers_androidKt;->findFollowingBreak(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public final getPrecedingCharacterIndex()I
    .locals 3

    .line 184
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->text:Ljava/lang/String;

    iget-wide v1, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selection:J

    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v1

    invoke-static {v0, v1}, Landroidx/compose/foundation/text/StringHelpers_androidKt;->findPrecedingBreak(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public final getSelection-d9O1mEE()J
    .locals 2

    .line 113
    iget-wide v0, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selection:J

    return-wide v0
.end method

.method public final getWedgeAffinity()Landroidx/compose/foundation/text/input/internal/WedgeAffinity;
    .locals 1

    .line 115
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->wedgeAffinity:Landroidx/compose/foundation/text/input/internal/WedgeAffinity;

    return-object v0
.end method

.method public final moveCursorDownByLine()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .locals 12

    .line 267
    const/4 v0, 0x0

    .local v0, "resetCachedX$iv":Z
    move-object v1, p0

    .local v1, "this_$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v2, 0x0

    .line 850
    .local v2, "$i$f$moveCursorTo":I
    move-object v3, v1

    .local v3, "this_$iv$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v4, 0x0

    .line 851
    .local v4, "$i$f$applyIfNotEmpty":I
    nop

    .line 854
    invoke-static {v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Ljava/lang/String;

    move-result-object v5

    check-cast v5, Ljava/lang/CharSequence;

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v5

    const/4 v6, 0x1

    if-lez v5, :cond_0

    move v5, v6

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    if-eqz v5, :cond_5

    .line 855
    move-object v5, v3

    check-cast v5, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    .local v5, "$this$moveCursorTo_u24lambda_u245$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v7, 0x0

    .line 856
    .local v7, "$i$a$-applyIfNotEmpty-TextFieldPreparedSelection$moveCursorTo$1$iv":I
    invoke-virtual {v5}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v8

    invoke-static {v8, v9}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v8

    .line 859
    .local v8, "oldCursor$iv":I
    const/4 v9, 0x0

    .line 267
    .local v9, "$i$a$-moveCursorTo-TextFieldPreparedSelection$moveCursorDownByLine$1":I
    iget-object v10, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->textLayoutResult:Landroidx/compose/ui/text/TextLayoutResult;

    if-eqz v10, :cond_1

    invoke-direct {p0, v10, v6}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->jumpByLinesOffset(Landroidx/compose/ui/text/TextLayoutResult;I)I

    move-result v6

    goto :goto_1

    :cond_1
    iget-object v6, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->text:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    .line 859
    .end local v9    # "$i$a$-moveCursorTo-TextFieldPreparedSelection$moveCursorDownByLine$1":I
    :goto_1
    nop

    .line 860
    nop

    .line 861
    invoke-static {v5}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getState$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    move-result-object v9

    .line 858
    invoke-static {v6, v8, v9}, Landroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt;->calculateNextCursorPositionAndWedgeAffinity(IILandroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)J

    move-result-wide v9

    invoke-static {v9, v10}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->component1-impl(J)I

    move-result v6

    .line 857
    nop

    .local v6, "newCursor$iv":I
    invoke-static {v9, v10}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->component2-impl(J)Landroidx/compose/foundation/text/input/internal/WedgeAffinity;

    move-result-object v9

    .line 864
    .local v9, "newWedgeAffinity$iv":Landroidx/compose/foundation/text/input/internal/WedgeAffinity;
    if-ne v6, v8, :cond_2

    invoke-virtual {v5}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v10

    invoke-static {v10, v11}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v10

    if-nez v10, :cond_3

    .line 865
    :cond_2
    invoke-static {v6}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(I)J

    move-result-wide v10

    invoke-virtual {v5, v10, v11}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->setSelection-5zc-tL8(J)V

    .line 867
    :cond_3
    if-eqz v9, :cond_4

    .line 868
    invoke-virtual {v5, v9}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->setWedgeAffinity(Landroidx/compose/foundation/text/input/internal/WedgeAffinity;)V

    .line 870
    :cond_4
    nop

    .line 855
    .end local v5    # "$this$moveCursorTo_u24lambda_u245$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v6    # "newCursor$iv":I
    .end local v7    # "$i$a$-applyIfNotEmpty-TextFieldPreparedSelection$moveCursorTo$1$iv":I
    .end local v8    # "oldCursor$iv":I
    .end local v9    # "newWedgeAffinity$iv":Landroidx/compose/foundation/text/input/internal/WedgeAffinity;
    nop

    .line 871
    :cond_5
    nop

    .line 870
    .end local v3    # "this_$iv$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v4    # "$i$f$applyIfNotEmpty":I
    nop

    .line 267
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "this_$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v2    # "$i$f$moveCursorTo":I
    return-object v3
.end method

.method public final moveCursorDownByPage()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .locals 12

    .line 295
    const/4 v0, 0x0

    .local v0, "resetCachedX$iv":Z
    move-object v1, p0

    .local v1, "this_$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v2, 0x0

    .line 946
    .local v2, "$i$f$moveCursorTo":I
    move-object v3, v1

    .local v3, "this_$iv$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v4, 0x0

    .line 947
    .local v4, "$i$f$applyIfNotEmpty":I
    nop

    .line 950
    invoke-static {v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Ljava/lang/String;

    move-result-object v5

    check-cast v5, Ljava/lang/CharSequence;

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v5

    const/4 v6, 0x1

    if-lez v5, :cond_0

    move v5, v6

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    if-eqz v5, :cond_4

    .line 951
    move-object v5, v3

    check-cast v5, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    .local v5, "$this$moveCursorTo_u24lambda_u245$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v7, 0x0

    .line 952
    .local v7, "$i$a$-applyIfNotEmpty-TextFieldPreparedSelection$moveCursorTo$1$iv":I
    invoke-virtual {v5}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v8

    invoke-static {v8, v9}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v8

    .line 955
    .local v8, "oldCursor$iv":I
    const/4 v9, 0x0

    .line 295
    .local v9, "$i$a$-moveCursorTo-TextFieldPreparedSelection$moveCursorDownByPage$1":I
    invoke-direct {p0, v6}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->jumpByPagesOffset(I)I

    move-result v6

    .line 955
    .end local v9    # "$i$a$-moveCursorTo-TextFieldPreparedSelection$moveCursorDownByPage$1":I
    nop

    .line 956
    nop

    .line 957
    invoke-static {v5}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getState$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    move-result-object v9

    .line 954
    invoke-static {v6, v8, v9}, Landroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt;->calculateNextCursorPositionAndWedgeAffinity(IILandroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)J

    move-result-wide v9

    invoke-static {v9, v10}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->component1-impl(J)I

    move-result v6

    .line 953
    nop

    .local v6, "newCursor$iv":I
    invoke-static {v9, v10}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->component2-impl(J)Landroidx/compose/foundation/text/input/internal/WedgeAffinity;

    move-result-object v9

    .line 960
    .local v9, "newWedgeAffinity$iv":Landroidx/compose/foundation/text/input/internal/WedgeAffinity;
    if-ne v6, v8, :cond_1

    invoke-virtual {v5}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v10

    invoke-static {v10, v11}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v10

    if-nez v10, :cond_2

    .line 961
    :cond_1
    invoke-static {v6}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(I)J

    move-result-wide v10

    invoke-virtual {v5, v10, v11}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->setSelection-5zc-tL8(J)V

    .line 963
    :cond_2
    if-eqz v9, :cond_3

    .line 964
    invoke-virtual {v5, v9}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->setWedgeAffinity(Landroidx/compose/foundation/text/input/internal/WedgeAffinity;)V

    .line 966
    :cond_3
    nop

    .line 951
    .end local v5    # "$this$moveCursorTo_u24lambda_u245$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v6    # "newCursor$iv":I
    .end local v7    # "$i$a$-applyIfNotEmpty-TextFieldPreparedSelection$moveCursorTo$1$iv":I
    .end local v8    # "oldCursor$iv":I
    .end local v9    # "newWedgeAffinity$iv":Landroidx/compose/foundation/text/input/internal/WedgeAffinity;
    nop

    .line 967
    :cond_4
    nop

    .line 966
    .end local v3    # "this_$iv$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v4    # "$i$f$applyIfNotEmpty":I
    nop

    .line 295
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "this_$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v2    # "$i$f$moveCursorTo":I
    return-object v3
.end method

.method public final moveCursorLeftByChar()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .locals 1

    .line 144
    invoke-direct {p0}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->isLtr()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 145
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorPrevByChar()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-result-object v0

    goto :goto_0

    .line 147
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorNextByChar()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-result-object v0

    .line 148
    :goto_0
    return-object v0
.end method

.method public final moveCursorLeftByWord()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .locals 1

    .line 226
    invoke-direct {p0}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->isLtr()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 227
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorPrevByWord()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-result-object v0

    goto :goto_0

    .line 229
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorNextByWord()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-result-object v0

    .line 230
    :goto_0
    return-object v0
.end method

.method public final moveCursorNextByChar()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .locals 12

    .line 219
    nop

    .line 646
    nop

    .line 647
    const/4 v0, 0x1

    .line 646
    .local v0, "resetCachedX$iv":Z
    const/4 v1, 0x0

    .line 650
    .local v1, "$i$f$moveCursorTo":I
    move-object v2, p0

    .local v2, "this_$iv$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v3, 0x0

    .line 651
    .local v3, "$i$f$applyIfNotEmpty":I
    nop

    .line 652
    invoke-static {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 654
    invoke-static {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Ljava/lang/String;

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
    if-eqz v4, :cond_4

    .line 655
    move-object v4, v2

    check-cast v4, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    .local v4, "$this$moveCursorTo_u24lambda_u245$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v5, 0x0

    .line 656
    .local v5, "$i$a$-applyIfNotEmpty-TextFieldPreparedSelection$moveCursorTo$1$iv":I
    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v6

    invoke-static {v6, v7}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v6

    .line 659
    .local v6, "oldCursor$iv":I
    const/4 v7, 0x0

    .line 219
    .local v7, "$i$a$-moveCursorTo$default-TextFieldPreparedSelection$moveCursorNextByChar$1":I
    iget-object v8, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->text:Ljava/lang/String;

    iget-wide v9, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selection:J

    invoke-static {v9, v10}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v9

    invoke-static {v8, v9}, Landroidx/compose/foundation/text/StringHelpers_androidKt;->findFollowingBreak(Ljava/lang/String;I)I

    move-result v7

    .line 659
    .end local v7    # "$i$a$-moveCursorTo$default-TextFieldPreparedSelection$moveCursorNextByChar$1":I
    nop

    .line 660
    nop

    .line 661
    invoke-static {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getState$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    move-result-object v8

    .line 658
    invoke-static {v7, v6, v8}, Landroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt;->calculateNextCursorPositionAndWedgeAffinity(IILandroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)J

    move-result-wide v7

    invoke-static {v7, v8}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->component1-impl(J)I

    move-result v9

    .line 657
    nop

    .local v9, "newCursor$iv":I
    invoke-static {v7, v8}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->component2-impl(J)Landroidx/compose/foundation/text/input/internal/WedgeAffinity;

    move-result-object v7

    .line 664
    .local v7, "newWedgeAffinity$iv":Landroidx/compose/foundation/text/input/internal/WedgeAffinity;
    if-ne v9, v6, :cond_1

    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v10

    invoke-static {v10, v11}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v8

    if-nez v8, :cond_2

    .line 665
    :cond_1
    invoke-static {v9}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(I)J

    move-result-wide v10

    invoke-virtual {v4, v10, v11}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->setSelection-5zc-tL8(J)V

    .line 667
    :cond_2
    if-eqz v7, :cond_3

    .line 668
    invoke-virtual {v4, v7}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->setWedgeAffinity(Landroidx/compose/foundation/text/input/internal/WedgeAffinity;)V

    .line 670
    :cond_3
    nop

    .line 655
    .end local v4    # "$this$moveCursorTo_u24lambda_u245$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v5    # "$i$a$-applyIfNotEmpty-TextFieldPreparedSelection$moveCursorTo$1$iv":I
    .end local v6    # "oldCursor$iv":I
    .end local v7    # "newWedgeAffinity$iv":Landroidx/compose/foundation/text/input/internal/WedgeAffinity;
    .end local v9    # "newCursor$iv":I
    nop

    .line 671
    :cond_4
    nop

    .line 670
    .end local v2    # "this_$iv$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v3    # "$i$f$applyIfNotEmpty":I
    nop

    .line 219
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "$i$f$moveCursorTo":I
    return-object v2
.end method

.method public final moveCursorNextByParagraph()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .locals 12

    .line 255
    nop

    .line 802
    nop

    .line 803
    const/4 v0, 0x1

    .line 802
    .local v0, "resetCachedX$iv":Z
    const/4 v1, 0x0

    .line 806
    .local v1, "$i$f$moveCursorTo":I
    move-object v2, p0

    .local v2, "this_$iv$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v3, 0x0

    .line 807
    .local v3, "$i$f$applyIfNotEmpty":I
    nop

    .line 808
    invoke-static {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 810
    invoke-static {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Ljava/lang/String;

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
    if-eqz v4, :cond_5

    .line 811
    move-object v4, v2

    check-cast v4, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    .local v4, "$this$moveCursorTo_u24lambda_u245$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v5, 0x0

    .line 812
    .local v5, "$i$a$-applyIfNotEmpty-TextFieldPreparedSelection$moveCursorTo$1$iv":I
    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v6

    invoke-static {v6, v7}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v6

    .line 815
    .local v6, "oldCursor$iv":I
    const/4 v7, 0x0

    .line 256
    .local v7, "$i$a$-moveCursorTo$default-TextFieldPreparedSelection$moveCursorNextByParagraph$1":I
    iget-object v8, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->text:Ljava/lang/String;

    check-cast v8, Ljava/lang/CharSequence;

    iget-wide v9, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selection:J

    invoke-static {v9, v10}, Landroidx/compose/ui/text/TextRange;->getMax-impl(J)I

    move-result v9

    invoke-static {v8, v9}, Landroidx/compose/foundation/text/StringHelpersKt;->findParagraphEnd(Ljava/lang/CharSequence;I)I

    move-result v8

    .line 257
    .local v8, "paragraphEnd":I
    iget-wide v9, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selection:J

    invoke-static {v9, v10}, Landroidx/compose/ui/text/TextRange;->getMax-impl(J)I

    move-result v9

    if-ne v8, v9, :cond_1

    iget-object v9, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->text:Ljava/lang/String;

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    if-eq v8, v9, :cond_1

    .line 258
    iget-object v9, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->text:Ljava/lang/String;

    check-cast v9, Ljava/lang/CharSequence;

    add-int/lit8 v10, v8, 0x1

    invoke-static {v9, v10}, Landroidx/compose/foundation/text/StringHelpersKt;->findParagraphEnd(Ljava/lang/CharSequence;I)I

    move-result v8

    .line 260
    :cond_1
    nop

    .line 815
    .end local v7    # "$i$a$-moveCursorTo$default-TextFieldPreparedSelection$moveCursorNextByParagraph$1":I
    .end local v8    # "paragraphEnd":I
    nop

    .line 816
    nop

    .line 817
    invoke-static {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getState$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    move-result-object v7

    .line 814
    invoke-static {v8, v6, v7}, Landroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt;->calculateNextCursorPositionAndWedgeAffinity(IILandroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)J

    move-result-wide v7

    invoke-static {v7, v8}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->component1-impl(J)I

    move-result v9

    .line 813
    nop

    .local v9, "newCursor$iv":I
    invoke-static {v7, v8}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->component2-impl(J)Landroidx/compose/foundation/text/input/internal/WedgeAffinity;

    move-result-object v7

    .line 820
    .local v7, "newWedgeAffinity$iv":Landroidx/compose/foundation/text/input/internal/WedgeAffinity;
    if-ne v9, v6, :cond_2

    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v10

    invoke-static {v10, v11}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v8

    if-nez v8, :cond_3

    .line 821
    :cond_2
    invoke-static {v9}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(I)J

    move-result-wide v10

    invoke-virtual {v4, v10, v11}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->setSelection-5zc-tL8(J)V

    .line 823
    :cond_3
    if-eqz v7, :cond_4

    .line 824
    invoke-virtual {v4, v7}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->setWedgeAffinity(Landroidx/compose/foundation/text/input/internal/WedgeAffinity;)V

    .line 826
    :cond_4
    nop

    .line 811
    .end local v4    # "$this$moveCursorTo_u24lambda_u245$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v5    # "$i$a$-applyIfNotEmpty-TextFieldPreparedSelection$moveCursorTo$1$iv":I
    .end local v6    # "oldCursor$iv":I
    .end local v7    # "newWedgeAffinity$iv":Landroidx/compose/foundation/text/input/internal/WedgeAffinity;
    .end local v9    # "newCursor$iv":I
    nop

    .line 827
    :cond_5
    nop

    .line 826
    .end local v2    # "this_$iv$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v3    # "$i$f$applyIfNotEmpty":I
    nop

    .line 261
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "$i$f$moveCursorTo":I
    return-object v2
.end method

.method public final moveCursorNextByWord()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .locals 12

    .line 239
    nop

    .line 724
    nop

    .line 725
    const/4 v0, 0x1

    .line 724
    .local v0, "resetCachedX$iv":Z
    const/4 v1, 0x0

    .line 728
    .local v1, "$i$f$moveCursorTo":I
    move-object v2, p0

    .local v2, "this_$iv$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v3, 0x0

    .line 729
    .local v3, "$i$f$applyIfNotEmpty":I
    nop

    .line 730
    invoke-static {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 732
    invoke-static {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Ljava/lang/String;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-lez v4, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    move v4, v6

    :goto_0
    if-eqz v4, :cond_5

    .line 733
    move-object v4, v2

    check-cast v4, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    .local v4, "$this$moveCursorTo_u24lambda_u245$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v7, 0x0

    .line 734
    .local v7, "$i$a$-applyIfNotEmpty-TextFieldPreparedSelection$moveCursorTo$1$iv":I
    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v8

    invoke-static {v8, v9}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v8

    .line 737
    .local v8, "oldCursor$iv":I
    const/4 v9, 0x0

    .line 240
    .local v9, "$i$a$-moveCursorTo$default-TextFieldPreparedSelection$moveCursorNextByWord$1":I
    iget-object v10, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->textLayoutResult:Landroidx/compose/ui/text/TextLayoutResult;

    if-eqz v10, :cond_1

    const/4 v11, 0x0

    invoke-static {p0, v10, v6, v5, v11}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getNextWordOffsetForLayout$default(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;Landroidx/compose/ui/text/TextLayoutResult;IILjava/lang/Object;)I

    move-result v5

    goto :goto_1

    :cond_1
    iget-object v5, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->text:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    .line 737
    .end local v9    # "$i$a$-moveCursorTo$default-TextFieldPreparedSelection$moveCursorNextByWord$1":I
    :goto_1
    nop

    .line 738
    nop

    .line 739
    invoke-static {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getState$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    move-result-object v6

    .line 736
    invoke-static {v5, v8, v6}, Landroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt;->calculateNextCursorPositionAndWedgeAffinity(IILandroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)J

    move-result-wide v5

    invoke-static {v5, v6}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->component1-impl(J)I

    move-result v9

    .line 735
    nop

    .local v9, "newCursor$iv":I
    invoke-static {v5, v6}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->component2-impl(J)Landroidx/compose/foundation/text/input/internal/WedgeAffinity;

    move-result-object v5

    .line 742
    .local v5, "newWedgeAffinity$iv":Landroidx/compose/foundation/text/input/internal/WedgeAffinity;
    if-ne v9, v8, :cond_2

    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v10

    invoke-static {v10, v11}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v6

    if-nez v6, :cond_3

    .line 743
    :cond_2
    invoke-static {v9}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(I)J

    move-result-wide v10

    invoke-virtual {v4, v10, v11}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->setSelection-5zc-tL8(J)V

    .line 745
    :cond_3
    if-eqz v5, :cond_4

    .line 746
    invoke-virtual {v4, v5}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->setWedgeAffinity(Landroidx/compose/foundation/text/input/internal/WedgeAffinity;)V

    .line 748
    :cond_4
    nop

    .line 733
    .end local v4    # "$this$moveCursorTo_u24lambda_u245$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v5    # "newWedgeAffinity$iv":Landroidx/compose/foundation/text/input/internal/WedgeAffinity;
    .end local v7    # "$i$a$-applyIfNotEmpty-TextFieldPreparedSelection$moveCursorTo$1$iv":I
    .end local v8    # "oldCursor$iv":I
    .end local v9    # "newCursor$iv":I
    nop

    .line 749
    :cond_5
    nop

    .line 748
    .end local v2    # "this_$iv$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v3    # "$i$f$applyIfNotEmpty":I
    nop

    .line 241
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "$i$f$moveCursorTo":I
    return-object v2
.end method

.method public final moveCursorPrevByChar()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .locals 12

    .line 217
    nop

    .line 620
    nop

    .line 621
    const/4 v0, 0x1

    .line 620
    .local v0, "resetCachedX$iv":Z
    const/4 v1, 0x0

    .line 624
    .local v1, "$i$f$moveCursorTo":I
    move-object v2, p0

    .local v2, "this_$iv$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v3, 0x0

    .line 625
    .local v3, "$i$f$applyIfNotEmpty":I
    nop

    .line 626
    invoke-static {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 628
    invoke-static {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Ljava/lang/String;

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
    if-eqz v4, :cond_4

    .line 629
    move-object v4, v2

    check-cast v4, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    .local v4, "$this$moveCursorTo_u24lambda_u245$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v5, 0x0

    .line 630
    .local v5, "$i$a$-applyIfNotEmpty-TextFieldPreparedSelection$moveCursorTo$1$iv":I
    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v6

    invoke-static {v6, v7}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v6

    .line 633
    .local v6, "oldCursor$iv":I
    const/4 v7, 0x0

    .line 217
    .local v7, "$i$a$-moveCursorTo$default-TextFieldPreparedSelection$moveCursorPrevByChar$1":I
    iget-object v8, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->text:Ljava/lang/String;

    iget-wide v9, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selection:J

    invoke-static {v9, v10}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v9

    invoke-static {v8, v9}, Landroidx/compose/foundation/text/StringHelpers_androidKt;->findPrecedingBreak(Ljava/lang/String;I)I

    move-result v7

    .line 633
    .end local v7    # "$i$a$-moveCursorTo$default-TextFieldPreparedSelection$moveCursorPrevByChar$1":I
    nop

    .line 634
    nop

    .line 635
    invoke-static {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getState$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    move-result-object v8

    .line 632
    invoke-static {v7, v6, v8}, Landroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt;->calculateNextCursorPositionAndWedgeAffinity(IILandroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)J

    move-result-wide v7

    invoke-static {v7, v8}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->component1-impl(J)I

    move-result v9

    .line 631
    nop

    .local v9, "newCursor$iv":I
    invoke-static {v7, v8}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->component2-impl(J)Landroidx/compose/foundation/text/input/internal/WedgeAffinity;

    move-result-object v7

    .line 638
    .local v7, "newWedgeAffinity$iv":Landroidx/compose/foundation/text/input/internal/WedgeAffinity;
    if-ne v9, v6, :cond_1

    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v10

    invoke-static {v10, v11}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v8

    if-nez v8, :cond_2

    .line 639
    :cond_1
    invoke-static {v9}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(I)J

    move-result-wide v10

    invoke-virtual {v4, v10, v11}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->setSelection-5zc-tL8(J)V

    .line 641
    :cond_2
    if-eqz v7, :cond_3

    .line 642
    invoke-virtual {v4, v7}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->setWedgeAffinity(Landroidx/compose/foundation/text/input/internal/WedgeAffinity;)V

    .line 644
    :cond_3
    nop

    .line 629
    .end local v4    # "$this$moveCursorTo_u24lambda_u245$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v5    # "$i$a$-applyIfNotEmpty-TextFieldPreparedSelection$moveCursorTo$1$iv":I
    .end local v6    # "oldCursor$iv":I
    .end local v7    # "newWedgeAffinity$iv":Landroidx/compose/foundation/text/input/internal/WedgeAffinity;
    .end local v9    # "newCursor$iv":I
    nop

    .line 645
    :cond_4
    nop

    .line 644
    .end local v2    # "this_$iv$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v3    # "$i$f$applyIfNotEmpty":I
    nop

    .line 217
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "$i$f$moveCursorTo":I
    return-object v2
.end method

.method public final moveCursorPrevByParagraph()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .locals 12

    .line 247
    nop

    .line 776
    nop

    .line 777
    const/4 v0, 0x1

    .line 776
    .local v0, "resetCachedX$iv":Z
    const/4 v1, 0x0

    .line 780
    .local v1, "$i$f$moveCursorTo":I
    move-object v2, p0

    .local v2, "this_$iv$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v3, 0x0

    .line 781
    .local v3, "$i$f$applyIfNotEmpty":I
    nop

    .line 782
    invoke-static {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 784
    invoke-static {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Ljava/lang/String;

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
    if-eqz v4, :cond_5

    .line 785
    move-object v4, v2

    check-cast v4, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    .local v4, "$this$moveCursorTo_u24lambda_u245$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v5, 0x0

    .line 786
    .local v5, "$i$a$-applyIfNotEmpty-TextFieldPreparedSelection$moveCursorTo$1$iv":I
    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v6

    invoke-static {v6, v7}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v6

    .line 789
    .local v6, "oldCursor$iv":I
    const/4 v7, 0x0

    .line 248
    .local v7, "$i$a$-moveCursorTo$default-TextFieldPreparedSelection$moveCursorPrevByParagraph$1":I
    iget-object v8, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->text:Ljava/lang/String;

    check-cast v8, Ljava/lang/CharSequence;

    iget-wide v9, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selection:J

    invoke-static {v9, v10}, Landroidx/compose/ui/text/TextRange;->getMin-impl(J)I

    move-result v9

    invoke-static {v8, v9}, Landroidx/compose/foundation/text/StringHelpersKt;->findParagraphStart(Ljava/lang/CharSequence;I)I

    move-result v8

    .line 249
    .local v8, "paragraphStart":I
    iget-wide v9, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selection:J

    invoke-static {v9, v10}, Landroidx/compose/ui/text/TextRange;->getMin-impl(J)I

    move-result v9

    if-ne v8, v9, :cond_1

    if-eqz v8, :cond_1

    .line 250
    iget-object v9, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->text:Ljava/lang/String;

    check-cast v9, Ljava/lang/CharSequence;

    add-int/lit8 v10, v8, -0x1

    invoke-static {v9, v10}, Landroidx/compose/foundation/text/StringHelpersKt;->findParagraphStart(Ljava/lang/CharSequence;I)I

    move-result v8

    .line 252
    :cond_1
    nop

    .line 789
    .end local v7    # "$i$a$-moveCursorTo$default-TextFieldPreparedSelection$moveCursorPrevByParagraph$1":I
    .end local v8    # "paragraphStart":I
    nop

    .line 790
    nop

    .line 791
    invoke-static {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getState$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    move-result-object v7

    .line 788
    invoke-static {v8, v6, v7}, Landroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt;->calculateNextCursorPositionAndWedgeAffinity(IILandroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)J

    move-result-wide v7

    invoke-static {v7, v8}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->component1-impl(J)I

    move-result v9

    .line 787
    nop

    .local v9, "newCursor$iv":I
    invoke-static {v7, v8}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->component2-impl(J)Landroidx/compose/foundation/text/input/internal/WedgeAffinity;

    move-result-object v7

    .line 794
    .local v7, "newWedgeAffinity$iv":Landroidx/compose/foundation/text/input/internal/WedgeAffinity;
    if-ne v9, v6, :cond_2

    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v10

    invoke-static {v10, v11}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v8

    if-nez v8, :cond_3

    .line 795
    :cond_2
    invoke-static {v9}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(I)J

    move-result-wide v10

    invoke-virtual {v4, v10, v11}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->setSelection-5zc-tL8(J)V

    .line 797
    :cond_3
    if-eqz v7, :cond_4

    .line 798
    invoke-virtual {v4, v7}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->setWedgeAffinity(Landroidx/compose/foundation/text/input/internal/WedgeAffinity;)V

    .line 800
    :cond_4
    nop

    .line 785
    .end local v4    # "$this$moveCursorTo_u24lambda_u245$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v5    # "$i$a$-applyIfNotEmpty-TextFieldPreparedSelection$moveCursorTo$1$iv":I
    .end local v6    # "oldCursor$iv":I
    .end local v7    # "newWedgeAffinity$iv":Landroidx/compose/foundation/text/input/internal/WedgeAffinity;
    .end local v9    # "newCursor$iv":I
    nop

    .line 801
    :cond_5
    nop

    .line 800
    .end local v2    # "this_$iv$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v3    # "$i$f$applyIfNotEmpty":I
    nop

    .line 253
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "$i$f$moveCursorTo":I
    return-object v2
.end method

.method public final moveCursorPrevByWord()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .locals 12

    .line 243
    nop

    .line 750
    nop

    .line 751
    const/4 v0, 0x1

    .line 750
    .local v0, "resetCachedX$iv":Z
    const/4 v1, 0x0

    .line 754
    .local v1, "$i$f$moveCursorTo":I
    move-object v2, p0

    .local v2, "this_$iv$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v3, 0x0

    .line 755
    .local v3, "$i$f$applyIfNotEmpty":I
    nop

    .line 756
    invoke-static {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 758
    invoke-static {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Ljava/lang/String;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-lez v4, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    move v4, v6

    :goto_0
    if-eqz v4, :cond_5

    .line 759
    move-object v4, v2

    check-cast v4, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    .local v4, "$this$moveCursorTo_u24lambda_u245$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v7, 0x0

    .line 760
    .local v7, "$i$a$-applyIfNotEmpty-TextFieldPreparedSelection$moveCursorTo$1$iv":I
    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v8

    invoke-static {v8, v9}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v8

    .line 763
    .local v8, "oldCursor$iv":I
    const/4 v9, 0x0

    .line 244
    .local v9, "$i$a$-moveCursorTo$default-TextFieldPreparedSelection$moveCursorPrevByWord$1":I
    iget-object v10, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->textLayoutResult:Landroidx/compose/ui/text/TextLayoutResult;

    if-eqz v10, :cond_1

    const/4 v11, 0x0

    invoke-static {p0, v10, v6, v5, v11}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getPrevWordOffsetForLayout$default(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;Landroidx/compose/ui/text/TextLayoutResult;IILjava/lang/Object;)I

    move-result v6

    .line 763
    .end local v9    # "$i$a$-moveCursorTo$default-TextFieldPreparedSelection$moveCursorPrevByWord$1":I
    :cond_1
    nop

    .line 764
    nop

    .line 765
    invoke-static {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getState$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    move-result-object v5

    .line 762
    invoke-static {v6, v8, v5}, Landroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt;->calculateNextCursorPositionAndWedgeAffinity(IILandroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)J

    move-result-wide v5

    invoke-static {v5, v6}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->component1-impl(J)I

    move-result v9

    .line 761
    nop

    .local v9, "newCursor$iv":I
    invoke-static {v5, v6}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->component2-impl(J)Landroidx/compose/foundation/text/input/internal/WedgeAffinity;

    move-result-object v5

    .line 768
    .local v5, "newWedgeAffinity$iv":Landroidx/compose/foundation/text/input/internal/WedgeAffinity;
    if-ne v9, v8, :cond_2

    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v10

    invoke-static {v10, v11}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v6

    if-nez v6, :cond_3

    .line 769
    :cond_2
    invoke-static {v9}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(I)J

    move-result-wide v10

    invoke-virtual {v4, v10, v11}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->setSelection-5zc-tL8(J)V

    .line 771
    :cond_3
    if-eqz v5, :cond_4

    .line 772
    invoke-virtual {v4, v5}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->setWedgeAffinity(Landroidx/compose/foundation/text/input/internal/WedgeAffinity;)V

    .line 774
    :cond_4
    nop

    .line 759
    .end local v4    # "$this$moveCursorTo_u24lambda_u245$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v5    # "newWedgeAffinity$iv":Landroidx/compose/foundation/text/input/internal/WedgeAffinity;
    .end local v7    # "$i$a$-applyIfNotEmpty-TextFieldPreparedSelection$moveCursorTo$1$iv":I
    .end local v8    # "oldCursor$iv":I
    .end local v9    # "newCursor$iv":I
    nop

    .line 775
    :cond_5
    nop

    .line 774
    .end local v2    # "this_$iv$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v3    # "$i$f$applyIfNotEmpty":I
    nop

    .line 245
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "$i$f$moveCursorTo":I
    return-object v2
.end method

.method public final moveCursorRightByChar()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .locals 1

    .line 151
    invoke-direct {p0}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->isLtr()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 152
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorNextByChar()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-result-object v0

    goto :goto_0

    .line 154
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorPrevByChar()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-result-object v0

    .line 155
    :goto_0
    return-object v0
.end method

.method public final moveCursorRightByWord()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .locals 1

    .line 233
    invoke-direct {p0}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->isLtr()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 234
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorNextByWord()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-result-object v0

    goto :goto_0

    .line 236
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorPrevByWord()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-result-object v0

    .line 237
    :goto_0
    return-object v0
.end method

.method public final moveCursorToEnd()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .locals 12

    .line 223
    nop

    .line 698
    nop

    .line 699
    const/4 v0, 0x1

    .line 698
    .local v0, "resetCachedX$iv":Z
    const/4 v1, 0x0

    .line 702
    .local v1, "$i$f$moveCursorTo":I
    move-object v2, p0

    .local v2, "this_$iv$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v3, 0x0

    .line 703
    .local v3, "$i$f$applyIfNotEmpty":I
    nop

    .line 704
    invoke-static {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 706
    invoke-static {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Ljava/lang/String;

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
    if-eqz v4, :cond_4

    .line 707
    move-object v4, v2

    check-cast v4, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    .local v4, "$this$moveCursorTo_u24lambda_u245$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v5, 0x0

    .line 708
    .local v5, "$i$a$-applyIfNotEmpty-TextFieldPreparedSelection$moveCursorTo$1$iv":I
    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v6

    invoke-static {v6, v7}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v6

    .line 711
    .local v6, "oldCursor$iv":I
    const/4 v7, 0x0

    .line 223
    .local v7, "$i$a$-moveCursorTo$default-TextFieldPreparedSelection$moveCursorToEnd$1":I
    iget-object v8, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->text:Ljava/lang/String;

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v7

    .line 711
    .end local v7    # "$i$a$-moveCursorTo$default-TextFieldPreparedSelection$moveCursorToEnd$1":I
    nop

    .line 712
    nop

    .line 713
    invoke-static {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getState$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    move-result-object v8

    .line 710
    invoke-static {v7, v6, v8}, Landroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt;->calculateNextCursorPositionAndWedgeAffinity(IILandroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)J

    move-result-wide v7

    invoke-static {v7, v8}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->component1-impl(J)I

    move-result v9

    .line 709
    nop

    .local v9, "newCursor$iv":I
    invoke-static {v7, v8}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->component2-impl(J)Landroidx/compose/foundation/text/input/internal/WedgeAffinity;

    move-result-object v7

    .line 716
    .local v7, "newWedgeAffinity$iv":Landroidx/compose/foundation/text/input/internal/WedgeAffinity;
    if-ne v9, v6, :cond_1

    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v10

    invoke-static {v10, v11}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v8

    if-nez v8, :cond_2

    .line 717
    :cond_1
    invoke-static {v9}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(I)J

    move-result-wide v10

    invoke-virtual {v4, v10, v11}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->setSelection-5zc-tL8(J)V

    .line 719
    :cond_2
    if-eqz v7, :cond_3

    .line 720
    invoke-virtual {v4, v7}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->setWedgeAffinity(Landroidx/compose/foundation/text/input/internal/WedgeAffinity;)V

    .line 722
    :cond_3
    nop

    .line 707
    .end local v4    # "$this$moveCursorTo_u24lambda_u245$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v5    # "$i$a$-applyIfNotEmpty-TextFieldPreparedSelection$moveCursorTo$1$iv":I
    .end local v6    # "oldCursor$iv":I
    .end local v7    # "newWedgeAffinity$iv":Landroidx/compose/foundation/text/input/internal/WedgeAffinity;
    .end local v9    # "newCursor$iv":I
    nop

    .line 723
    :cond_4
    nop

    .line 722
    .end local v2    # "this_$iv$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v3    # "$i$f$applyIfNotEmpty":I
    nop

    .line 223
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "$i$f$moveCursorTo":I
    return-object v2
.end method

.method public final moveCursorToHome()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .locals 11

    .line 221
    nop

    .line 672
    nop

    .line 673
    const/4 v0, 0x1

    .line 672
    .local v0, "resetCachedX$iv":Z
    const/4 v1, 0x0

    .line 676
    .local v1, "$i$f$moveCursorTo":I
    move-object v2, p0

    .local v2, "this_$iv$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v3, 0x0

    .line 677
    .local v3, "$i$f$applyIfNotEmpty":I
    nop

    .line 678
    invoke-static {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 680
    invoke-static {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Ljava/lang/String;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    const/4 v5, 0x0

    if-lez v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    move v4, v5

    :goto_0
    if-eqz v4, :cond_4

    .line 681
    move-object v4, v2

    check-cast v4, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    .local v4, "$this$moveCursorTo_u24lambda_u245$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v6, 0x0

    .line 682
    .local v6, "$i$a$-applyIfNotEmpty-TextFieldPreparedSelection$moveCursorTo$1$iv":I
    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v7

    invoke-static {v7, v8}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v7

    .line 685
    .local v7, "oldCursor$iv":I
    const/4 v8, 0x0

    .line 221
    .local v8, "$i$a$-moveCursorTo$default-TextFieldPreparedSelection$moveCursorToHome$1":I
    nop

    .line 685
    .end local v8    # "$i$a$-moveCursorTo$default-TextFieldPreparedSelection$moveCursorToHome$1":I
    nop

    .line 686
    nop

    .line 687
    invoke-static {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getState$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    move-result-object v8

    .line 684
    invoke-static {v5, v7, v8}, Landroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt;->calculateNextCursorPositionAndWedgeAffinity(IILandroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)J

    move-result-wide v8

    invoke-static {v8, v9}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->component1-impl(J)I

    move-result v5

    .line 683
    nop

    .local v5, "newCursor$iv":I
    invoke-static {v8, v9}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->component2-impl(J)Landroidx/compose/foundation/text/input/internal/WedgeAffinity;

    move-result-object v8

    .line 690
    .local v8, "newWedgeAffinity$iv":Landroidx/compose/foundation/text/input/internal/WedgeAffinity;
    if-ne v5, v7, :cond_1

    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v9

    invoke-static {v9, v10}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v9

    if-nez v9, :cond_2

    .line 691
    :cond_1
    invoke-static {v5}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(I)J

    move-result-wide v9

    invoke-virtual {v4, v9, v10}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->setSelection-5zc-tL8(J)V

    .line 693
    :cond_2
    if-eqz v8, :cond_3

    .line 694
    invoke-virtual {v4, v8}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->setWedgeAffinity(Landroidx/compose/foundation/text/input/internal/WedgeAffinity;)V

    .line 696
    :cond_3
    nop

    .line 681
    .end local v4    # "$this$moveCursorTo_u24lambda_u245$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v5    # "newCursor$iv":I
    .end local v6    # "$i$a$-applyIfNotEmpty-TextFieldPreparedSelection$moveCursorTo$1$iv":I
    .end local v7    # "oldCursor$iv":I
    .end local v8    # "newWedgeAffinity$iv":Landroidx/compose/foundation/text/input/internal/WedgeAffinity;
    nop

    .line 697
    :cond_4
    nop

    .line 696
    .end local v2    # "this_$iv$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v3    # "$i$f$applyIfNotEmpty":I
    nop

    .line 221
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "$i$f$moveCursorTo":I
    return-object v2
.end method

.method public final moveCursorToLineEnd()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .locals 12

    .line 287
    nop

    .line 898
    nop

    .line 899
    const/4 v0, 0x1

    .line 898
    .local v0, "resetCachedX$iv":Z
    const/4 v1, 0x0

    .line 902
    .local v1, "$i$f$moveCursorTo":I
    move-object v2, p0

    .local v2, "this_$iv$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v3, 0x0

    .line 903
    .local v3, "$i$f$applyIfNotEmpty":I
    nop

    .line 904
    invoke-static {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 906
    invoke-static {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Ljava/lang/String;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-lez v4, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    move v4, v6

    :goto_0
    if-eqz v4, :cond_5

    .line 907
    move-object v4, v2

    check-cast v4, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    .local v4, "$this$moveCursorTo_u24lambda_u245$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v7, 0x0

    .line 908
    .local v7, "$i$a$-applyIfNotEmpty-TextFieldPreparedSelection$moveCursorTo$1$iv":I
    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v8

    invoke-static {v8, v9}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v8

    .line 911
    .local v8, "oldCursor$iv":I
    const/4 v9, 0x0

    .line 288
    .local v9, "$i$a$-moveCursorTo$default-TextFieldPreparedSelection$moveCursorToLineEnd$1":I
    iget-object v10, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->textLayoutResult:Landroidx/compose/ui/text/TextLayoutResult;

    if-eqz v10, :cond_1

    const/4 v11, 0x0

    invoke-static {p0, v10, v6, v5, v11}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getLineEndByOffsetForLayout$default(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;Landroidx/compose/ui/text/TextLayoutResult;IILjava/lang/Object;)I

    move-result v5

    goto :goto_1

    :cond_1
    iget-object v5, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->text:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    .line 911
    .end local v9    # "$i$a$-moveCursorTo$default-TextFieldPreparedSelection$moveCursorToLineEnd$1":I
    :goto_1
    nop

    .line 912
    nop

    .line 913
    invoke-static {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getState$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    move-result-object v6

    .line 910
    invoke-static {v5, v8, v6}, Landroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt;->calculateNextCursorPositionAndWedgeAffinity(IILandroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)J

    move-result-wide v5

    invoke-static {v5, v6}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->component1-impl(J)I

    move-result v9

    .line 909
    nop

    .local v9, "newCursor$iv":I
    invoke-static {v5, v6}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->component2-impl(J)Landroidx/compose/foundation/text/input/internal/WedgeAffinity;

    move-result-object v5

    .line 916
    .local v5, "newWedgeAffinity$iv":Landroidx/compose/foundation/text/input/internal/WedgeAffinity;
    if-ne v9, v8, :cond_2

    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v10

    invoke-static {v10, v11}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v6

    if-nez v6, :cond_3

    .line 917
    :cond_2
    invoke-static {v9}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(I)J

    move-result-wide v10

    invoke-virtual {v4, v10, v11}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->setSelection-5zc-tL8(J)V

    .line 919
    :cond_3
    if-eqz v5, :cond_4

    .line 920
    invoke-virtual {v4, v5}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->setWedgeAffinity(Landroidx/compose/foundation/text/input/internal/WedgeAffinity;)V

    .line 922
    :cond_4
    nop

    .line 907
    .end local v4    # "$this$moveCursorTo_u24lambda_u245$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v5    # "newWedgeAffinity$iv":Landroidx/compose/foundation/text/input/internal/WedgeAffinity;
    .end local v7    # "$i$a$-applyIfNotEmpty-TextFieldPreparedSelection$moveCursorTo$1$iv":I
    .end local v8    # "oldCursor$iv":I
    .end local v9    # "newCursor$iv":I
    nop

    .line 923
    :cond_5
    nop

    .line 922
    .end local v2    # "this_$iv$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v3    # "$i$f$applyIfNotEmpty":I
    nop

    .line 289
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "$i$f$moveCursorTo":I
    return-object v2
.end method

.method public final moveCursorToLineLeftSide()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .locals 1

    .line 270
    invoke-direct {p0}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->isLtr()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 271
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorToLineStart()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-result-object v0

    goto :goto_0

    .line 273
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorToLineEnd()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-result-object v0

    .line 274
    :goto_0
    return-object v0
.end method

.method public final moveCursorToLineRightSide()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .locals 1

    .line 277
    invoke-direct {p0}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->isLtr()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 278
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorToLineEnd()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-result-object v0

    goto :goto_0

    .line 280
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorToLineStart()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-result-object v0

    .line 281
    :goto_0
    return-object v0
.end method

.method public final moveCursorToLineStart()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .locals 12

    .line 283
    nop

    .line 872
    nop

    .line 873
    const/4 v0, 0x1

    .line 872
    .local v0, "resetCachedX$iv":Z
    const/4 v1, 0x0

    .line 876
    .local v1, "$i$f$moveCursorTo":I
    move-object v2, p0

    .local v2, "this_$iv$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v3, 0x0

    .line 877
    .local v3, "$i$f$applyIfNotEmpty":I
    nop

    .line 878
    invoke-static {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 880
    invoke-static {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Ljava/lang/String;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-lez v4, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    move v4, v6

    :goto_0
    if-eqz v4, :cond_5

    .line 881
    move-object v4, v2

    check-cast v4, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    .local v4, "$this$moveCursorTo_u24lambda_u245$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v7, 0x0

    .line 882
    .local v7, "$i$a$-applyIfNotEmpty-TextFieldPreparedSelection$moveCursorTo$1$iv":I
    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v8

    invoke-static {v8, v9}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v8

    .line 885
    .local v8, "oldCursor$iv":I
    const/4 v9, 0x0

    .line 284
    .local v9, "$i$a$-moveCursorTo$default-TextFieldPreparedSelection$moveCursorToLineStart$1":I
    iget-object v10, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->textLayoutResult:Landroidx/compose/ui/text/TextLayoutResult;

    if-eqz v10, :cond_1

    const/4 v11, 0x0

    invoke-static {p0, v10, v6, v5, v11}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getLineStartByOffsetForLayout$default(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;Landroidx/compose/ui/text/TextLayoutResult;IILjava/lang/Object;)I

    move-result v6

    .line 885
    .end local v9    # "$i$a$-moveCursorTo$default-TextFieldPreparedSelection$moveCursorToLineStart$1":I
    :cond_1
    nop

    .line 886
    nop

    .line 887
    invoke-static {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getState$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    move-result-object v5

    .line 884
    invoke-static {v6, v8, v5}, Landroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt;->calculateNextCursorPositionAndWedgeAffinity(IILandroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)J

    move-result-wide v5

    invoke-static {v5, v6}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->component1-impl(J)I

    move-result v9

    .line 883
    nop

    .local v9, "newCursor$iv":I
    invoke-static {v5, v6}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->component2-impl(J)Landroidx/compose/foundation/text/input/internal/WedgeAffinity;

    move-result-object v5

    .line 890
    .local v5, "newWedgeAffinity$iv":Landroidx/compose/foundation/text/input/internal/WedgeAffinity;
    if-ne v9, v8, :cond_2

    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v10

    invoke-static {v10, v11}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v6

    if-nez v6, :cond_3

    .line 891
    :cond_2
    invoke-static {v9}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(I)J

    move-result-wide v10

    invoke-virtual {v4, v10, v11}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->setSelection-5zc-tL8(J)V

    .line 893
    :cond_3
    if-eqz v5, :cond_4

    .line 894
    invoke-virtual {v4, v5}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->setWedgeAffinity(Landroidx/compose/foundation/text/input/internal/WedgeAffinity;)V

    .line 896
    :cond_4
    nop

    .line 881
    .end local v4    # "$this$moveCursorTo_u24lambda_u245$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v5    # "newWedgeAffinity$iv":Landroidx/compose/foundation/text/input/internal/WedgeAffinity;
    .end local v7    # "$i$a$-applyIfNotEmpty-TextFieldPreparedSelection$moveCursorTo$1$iv":I
    .end local v8    # "oldCursor$iv":I
    .end local v9    # "newCursor$iv":I
    nop

    .line 897
    :cond_5
    nop

    .line 896
    .end local v2    # "this_$iv$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v3    # "$i$f$applyIfNotEmpty":I
    nop

    .line 285
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "$i$f$moveCursorTo":I
    return-object v2
.end method

.method public final moveCursorUpByLine()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .locals 12

    .line 264
    const/4 v0, 0x0

    .local v0, "resetCachedX$iv":Z
    move-object v1, p0

    .local v1, "this_$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v2, 0x0

    .line 828
    .local v2, "$i$f$moveCursorTo":I
    move-object v3, v1

    .local v3, "this_$iv$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v4, 0x0

    .line 829
    .local v4, "$i$f$applyIfNotEmpty":I
    nop

    .line 832
    invoke-static {v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Ljava/lang/String;

    move-result-object v5

    check-cast v5, Ljava/lang/CharSequence;

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v5

    const/4 v6, 0x0

    if-lez v5, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    move v5, v6

    :goto_0
    if-eqz v5, :cond_5

    .line 833
    move-object v5, v3

    check-cast v5, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    .local v5, "$this$moveCursorTo_u24lambda_u245$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v7, 0x0

    .line 834
    .local v7, "$i$a$-applyIfNotEmpty-TextFieldPreparedSelection$moveCursorTo$1$iv":I
    invoke-virtual {v5}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v8

    invoke-static {v8, v9}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v8

    .line 837
    .local v8, "oldCursor$iv":I
    const/4 v9, 0x0

    .line 264
    .local v9, "$i$a$-moveCursorTo-TextFieldPreparedSelection$moveCursorUpByLine$1":I
    iget-object v10, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->textLayoutResult:Landroidx/compose/ui/text/TextLayoutResult;

    if-eqz v10, :cond_1

    const/4 v6, -0x1

    invoke-direct {p0, v10, v6}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->jumpByLinesOffset(Landroidx/compose/ui/text/TextLayoutResult;I)I

    move-result v6

    .line 837
    .end local v9    # "$i$a$-moveCursorTo-TextFieldPreparedSelection$moveCursorUpByLine$1":I
    :cond_1
    nop

    .line 838
    nop

    .line 839
    invoke-static {v5}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getState$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    move-result-object v9

    .line 836
    invoke-static {v6, v8, v9}, Landroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt;->calculateNextCursorPositionAndWedgeAffinity(IILandroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)J

    move-result-wide v9

    invoke-static {v9, v10}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->component1-impl(J)I

    move-result v6

    .line 835
    nop

    .local v6, "newCursor$iv":I
    invoke-static {v9, v10}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->component2-impl(J)Landroidx/compose/foundation/text/input/internal/WedgeAffinity;

    move-result-object v9

    .line 842
    .local v9, "newWedgeAffinity$iv":Landroidx/compose/foundation/text/input/internal/WedgeAffinity;
    if-ne v6, v8, :cond_2

    invoke-virtual {v5}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v10

    invoke-static {v10, v11}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v10

    if-nez v10, :cond_3

    .line 843
    :cond_2
    invoke-static {v6}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(I)J

    move-result-wide v10

    invoke-virtual {v5, v10, v11}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->setSelection-5zc-tL8(J)V

    .line 845
    :cond_3
    if-eqz v9, :cond_4

    .line 846
    invoke-virtual {v5, v9}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->setWedgeAffinity(Landroidx/compose/foundation/text/input/internal/WedgeAffinity;)V

    .line 848
    :cond_4
    nop

    .line 833
    .end local v5    # "$this$moveCursorTo_u24lambda_u245$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v6    # "newCursor$iv":I
    .end local v7    # "$i$a$-applyIfNotEmpty-TextFieldPreparedSelection$moveCursorTo$1$iv":I
    .end local v8    # "oldCursor$iv":I
    .end local v9    # "newWedgeAffinity$iv":Landroidx/compose/foundation/text/input/internal/WedgeAffinity;
    nop

    .line 849
    :cond_5
    nop

    .line 848
    .end local v3    # "this_$iv$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v4    # "$i$f$applyIfNotEmpty":I
    nop

    .line 264
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "this_$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v2    # "$i$f$moveCursorTo":I
    return-object v3
.end method

.method public final moveCursorUpByPage()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .locals 13

    .line 292
    const/4 v0, 0x0

    .local v0, "resetCachedX$iv":Z
    move-object v1, p0

    .local v1, "this_$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v2, 0x0

    .line 924
    .local v2, "$i$f$moveCursorTo":I
    move-object v3, v1

    .local v3, "this_$iv$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v4, 0x0

    .line 925
    .local v4, "$i$f$applyIfNotEmpty":I
    nop

    .line 928
    invoke-static {v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Ljava/lang/String;

    move-result-object v5

    check-cast v5, Ljava/lang/CharSequence;

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-lez v5, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    if-eqz v5, :cond_4

    .line 929
    move-object v5, v3

    check-cast v5, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    .local v5, "$this$moveCursorTo_u24lambda_u245$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v6, 0x0

    .line 930
    .local v6, "$i$a$-applyIfNotEmpty-TextFieldPreparedSelection$moveCursorTo$1$iv":I
    invoke-virtual {v5}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v7

    invoke-static {v7, v8}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v7

    .line 933
    .local v7, "oldCursor$iv":I
    const/4 v8, 0x0

    .line 292
    .local v8, "$i$a$-moveCursorTo-TextFieldPreparedSelection$moveCursorUpByPage$1":I
    const/4 v9, -0x1

    invoke-direct {p0, v9}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->jumpByPagesOffset(I)I

    move-result v8

    .line 933
    .end local v8    # "$i$a$-moveCursorTo-TextFieldPreparedSelection$moveCursorUpByPage$1":I
    nop

    .line 934
    nop

    .line 935
    invoke-static {v5}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getState$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    move-result-object v9

    .line 932
    invoke-static {v8, v7, v9}, Landroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt;->calculateNextCursorPositionAndWedgeAffinity(IILandroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)J

    move-result-wide v8

    invoke-static {v8, v9}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->component1-impl(J)I

    move-result v10

    .line 931
    nop

    .local v10, "newCursor$iv":I
    invoke-static {v8, v9}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->component2-impl(J)Landroidx/compose/foundation/text/input/internal/WedgeAffinity;

    move-result-object v8

    .line 938
    .local v8, "newWedgeAffinity$iv":Landroidx/compose/foundation/text/input/internal/WedgeAffinity;
    if-ne v10, v7, :cond_1

    invoke-virtual {v5}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v11

    invoke-static {v11, v12}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v9

    if-nez v9, :cond_2

    .line 939
    :cond_1
    invoke-static {v10}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(I)J

    move-result-wide v11

    invoke-virtual {v5, v11, v12}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->setSelection-5zc-tL8(J)V

    .line 941
    :cond_2
    if-eqz v8, :cond_3

    .line 942
    invoke-virtual {v5, v8}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->setWedgeAffinity(Landroidx/compose/foundation/text/input/internal/WedgeAffinity;)V

    .line 944
    :cond_3
    nop

    .line 929
    .end local v5    # "$this$moveCursorTo_u24lambda_u245$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v6    # "$i$a$-applyIfNotEmpty-TextFieldPreparedSelection$moveCursorTo$1$iv":I
    .end local v7    # "oldCursor$iv":I
    .end local v8    # "newWedgeAffinity$iv":Landroidx/compose/foundation/text/input/internal/WedgeAffinity;
    .end local v10    # "newCursor$iv":I
    nop

    .line 945
    :cond_4
    nop

    .line 944
    .end local v3    # "this_$iv$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v4    # "$i$f$applyIfNotEmpty":I
    nop

    .line 292
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "this_$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v2    # "$i$f$moveCursorTo":I
    return-object v3
.end method

.method public final selectAll()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .locals 7

    .line 139
    nop

    .line 569
    nop

    .line 570
    const/4 v0, 0x1

    .line 569
    .local v0, "resetCachedX$iv":Z
    const/4 v1, 0x0

    .line 573
    .local v1, "$i$f$applyIfNotEmpty":I
    nop

    .line 574
    invoke-static {p0}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 576
    invoke-static {p0}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Ljava/lang/String;

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

    .line 577
    move-object v2, p0

    check-cast v2, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    .local v2, "$this$selectAll_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v4, 0x0

    .line 139
    .local v4, "$i$a$-applyIfNotEmpty$default-TextFieldPreparedSelection$selectAll$1":I
    iget-object v5, v2, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->text:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    invoke-static {v3, v5}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(II)J

    move-result-wide v5

    iput-wide v5, v2, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selection:J

    .line 577
    .end local v2    # "$this$selectAll_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v4    # "$i$a$-applyIfNotEmpty$default-TextFieldPreparedSelection$selectAll$1":I
    nop

    .line 579
    :cond_1
    nop

    .line 139
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "$i$f$applyIfNotEmpty":I
    return-object p0
.end method

.method public final selectMovement()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .locals 8

    .line 299
    const/4 v0, 0x0

    .local v0, "resetCachedX$iv":Z
    move-object v1, p0

    .local v1, "this_$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v2, 0x0

    .line 968
    .local v2, "$i$f$applyIfNotEmpty":I
    nop

    .line 971
    invoke-static {v1}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;)Ljava/lang/String;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-lez v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_1

    .line 972
    move-object v3, v1

    check-cast v3, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    .local v3, "$this$selectMovement_u24lambda_u2420":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v4, 0x0

    .line 300
    .local v4, "$i$a$-applyIfNotEmpty-TextFieldPreparedSelection$selectMovement$1":I
    iget-object v5, v3, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->initialValue:Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    invoke-virtual {v5}, Landroidx/compose/foundation/text/input/TextFieldCharSequence;->getSelection-d9O1mEE()J

    move-result-wide v5

    invoke-static {v5, v6}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    move-result v5

    iget-wide v6, v3, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selection:J

    invoke-static {v6, v7}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v6

    invoke-static {v5, v6}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(II)J

    move-result-wide v5

    iput-wide v5, v3, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selection:J

    .line 301
    nop

    .line 972
    .end local v3    # "$this$selectMovement_u24lambda_u2420":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v4    # "$i$a$-applyIfNotEmpty-TextFieldPreparedSelection$selectMovement$1":I
    nop

    .line 974
    :cond_1
    nop

    .line 301
    .end local v0    # "resetCachedX$iv":Z
    .end local v1    # "this_$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v2    # "$i$f$applyIfNotEmpty":I
    return-object v1
.end method

.method public final setSelection-5zc-tL8(J)V
    .locals 0
    .param p1, "<set-?>"    # J

    .line 113
    iput-wide p1, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selection:J

    return-void
.end method

.method public final setWedgeAffinity(Landroidx/compose/foundation/text/input/internal/WedgeAffinity;)V
    .locals 0
    .param p1, "<set-?>"    # Landroidx/compose/foundation/text/input/internal/WedgeAffinity;

    .line 115
    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->wedgeAffinity:Landroidx/compose/foundation/text/input/internal/WedgeAffinity;

    return-void
.end method
