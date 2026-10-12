.class public final Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;
.super Ljava/lang/Object;
.source "HandwritingGesture.android.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHandwritingGesture.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandwritingGesture.android.kt\nandroidx/compose/foundation/text/input/internal/HandwritingGestureApi34\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState\n+ 4 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n*L\n1#1,1102:1\n1#2:1103\n316#3,6:1104\n324#3,3:1118\n327#3:1127\n316#3,6:1128\n324#3,3:1142\n327#3:1151\n316#3,6:1152\n324#3,3:1166\n327#3:1175\n254#4,8:1110\n263#4,6:1121\n254#4,8:1134\n263#4,6:1145\n254#4,8:1158\n263#4,6:1169\n*S KotlinDebug\n*F\n+ 1 HandwritingGesture.android.kt\nandroidx/compose/foundation/text/input/internal/HandwritingGestureApi34\n*L\n353#1:1104,6\n353#1:1118,3\n353#1:1127\n370#1:1128,6\n370#1:1142,3\n370#1:1151\n92#1:1152,6\n92#1:1166,3\n92#1:1175\n353#1:1110,8\n353#1:1121,6\n370#1:1134,8\n370#1:1145,6\n92#1:1158,8\n92#1:1169,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b8\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0002J>\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J,\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00162\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0002J8\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\r2\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0014\u0010\u001c\u001a\u00020\u0004*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J&\u0010\u001e\u001a\u00020\n*\u00020\u001d2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020 H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008!\u0010\"J0\u0010#\u001a\u00020\u0004*\u00020$2\u0006\u0010\u0005\u001a\u00020%2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0002J\u001c\u0010#\u001a\u00020\u0004*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0002J0\u0010(\u001a\u00020\u0004*\u00020$2\u0006\u0010\u0005\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0002J\u001c\u0010(\u001a\u00020\u0004*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020)2\u0006\u0010&\u001a\u00020\'H\u0002J&\u0010*\u001a\u00020\n*\u00020\u001d2\u0006\u0010+\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008,\u0010-JA\u0010.\u001a\u00020\u0004*\u00020$2\u0006\u0010\u0005\u001a\u00020\u00062\u0008\u0010/\u001a\u0004\u0018\u00010\u00192\u0008\u00100\u001a\u0004\u0018\u0001012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0000\u00a2\u0006\u0002\u00082J;\u0010.\u001a\u00020\u0004*\u00020\u001d2\u0006\u00103\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\'2\u000e\u00104\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u0001052\u0008\u00100\u001a\u0004\u0018\u000101H\u0000\u00a2\u0006\u0002\u00082J2\u00106\u001a\u00020\u0004*\u00020$2\u0006\u0010\u0005\u001a\u0002072\u0008\u00100\u001a\u0004\u0018\u0001012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0002J&\u00106\u001a\u00020\u0004*\u00020\u001d2\u0006\u0010\u0005\u001a\u0002072\u0006\u0010&\u001a\u00020\'2\u0008\u00100\u001a\u0004\u0018\u000101H\u0002J:\u00108\u001a\u00020\u0004*\u00020$2\u0006\u0010\u0005\u001a\u0002092\u0006\u0010\u000e\u001a\u00020\u000f2\u0008\u00100\u001a\u0004\u0018\u0001012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0002J&\u00108\u001a\u00020\u0004*\u00020\u001d2\u0006\u0010\u0005\u001a\u0002092\u0006\u0010&\u001a\u00020\'2\u0008\u00100\u001a\u0004\u0018\u000101H\u0002J:\u0010:\u001a\u00020\u0004*\u00020$2\u0006\u0010\u0005\u001a\u00020;2\u0006\u0010\u000e\u001a\u00020\u000f2\u0008\u00100\u001a\u0004\u0018\u0001012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0002J&\u0010:\u001a\u00020\u0004*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020;2\u0006\u0010&\u001a\u00020\'2\u0008\u00100\u001a\u0004\u0018\u000101H\u0002J2\u0010<\u001a\u00020\u0004*\u00020$2\u0006\u0010\u0005\u001a\u00020=2\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0002J,\u0010<\u001a\u00020\u0004*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020=2\u0006\u0010&\u001a\u00020\'2\u000e\u00104\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u000105H\u0002J2\u0010>\u001a\u00020\u0004*\u00020$2\u0006\u0010\u0005\u001a\u00020?2\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0002J,\u0010>\u001a\u00020\u0004*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020?2\u0006\u0010&\u001a\u00020\'2\u000e\u00104\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u000105H\u0002J\u001e\u0010@\u001a\u00020\n*\u00020$2\u0006\u0010\u0005\u001a\u00020%2\u0008\u0010/\u001a\u0004\u0018\u00010\u0019H\u0002J\u001c\u0010@\u001a\u00020\n*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0002J\u001e\u0010A\u001a\u00020\n*\u00020$2\u0006\u0010\u0005\u001a\u00020)2\u0008\u0010/\u001a\u0004\u0018\u00010\u0019H\u0002J\u001c\u0010A\u001a\u00020\n*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020)2\u0006\u0010&\u001a\u00020\'H\u0002J-\u0010B\u001a\u00020\u0011*\u00020$2\u0006\u0010\u0005\u001a\u00020C2\u0008\u0010/\u001a\u0004\u0018\u00010\u00192\u0008\u0010D\u001a\u0004\u0018\u00010EH\u0000\u00a2\u0006\u0002\u0008FJ+\u0010B\u001a\u00020\u0011*\u00020\u001d2\u0006\u00103\u001a\u00020C2\u0006\u0010&\u001a\u00020\'2\u0008\u0010D\u001a\u0004\u0018\u00010EH\u0000\u00a2\u0006\u0002\u0008FJ\u001e\u0010G\u001a\u00020\n*\u00020$2\u0006\u0010\u0005\u001a\u00020=2\u0008\u0010/\u001a\u0004\u0018\u00010\u0019H\u0002J\u001c\u0010G\u001a\u00020\n*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020=2\u0006\u0010&\u001a\u00020\'H\u0002J\u001e\u0010H\u001a\u00020\n*\u00020$2\u0006\u0010\u0005\u001a\u00020?2\u0008\u0010/\u001a\u0004\u0018\u00010\u0019H\u0002J\u001c\u0010H\u001a\u00020\n*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020?2\u0006\u0010&\u001a\u00020\'H\u0002J\u0019\u0010I\u001a\u00020J*\u00020\u0004H\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008K\u0010L\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006M"
    }
    d2 = {
        "Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;",
        "",
        "()V",
        "fallbackOnLegacyTextField",
        "",
        "gesture",
        "Landroid/view/inputmethod/HandwritingGesture;",
        "editCommandConsumer",
        "Lkotlin/Function1;",
        "Landroidx/compose/ui/text/input/EditCommand;",
        "",
        "performDeletionOnLegacyTextField",
        "range",
        "Landroidx/compose/ui/text/TextRange;",
        "text",
        "Landroidx/compose/ui/text/AnnotatedString;",
        "adjustRange",
        "",
        "performDeletionOnLegacyTextField-vJH6DeI",
        "(JLandroidx/compose/ui/text/AnnotatedString;ZLkotlin/jvm/functions/Function1;)V",
        "performInsertionOnLegacyTextField",
        "offset",
        "",
        "performSelectionOnLegacyTextField",
        "textSelectionManager",
        "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;",
        "performSelectionOnLegacyTextField-8ffj60Q",
        "(JLandroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function1;)V",
        "fallback",
        "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;",
        "highlightRange",
        "type",
        "Landroidx/compose/foundation/text/input/TextHighlightType;",
        "highlightRange-XJREzCE",
        "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;JI)V",
        "performDeleteGesture",
        "Landroidx/compose/foundation/text/LegacyTextFieldState;",
        "Landroid/view/inputmethod/DeleteGesture;",
        "layoutState",
        "Landroidx/compose/foundation/text/input/internal/TextLayoutState;",
        "performDeleteRangeGesture",
        "Landroid/view/inputmethod/DeleteRangeGesture;",
        "performDeletion",
        "rangeInTransformedText",
        "performDeletion-Sb-Bc2M",
        "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;JZ)V",
        "performHandwritingGesture",
        "textFieldSelectionManager",
        "viewConfiguration",
        "Landroidx/compose/ui/platform/ViewConfiguration;",
        "performHandwritingGesture$foundation_release",
        "handwritingGesture",
        "updateSelectionState",
        "Lkotlin/Function0;",
        "performInsertGesture",
        "Landroid/view/inputmethod/InsertGesture;",
        "performJoinOrSplitGesture",
        "Landroid/view/inputmethod/JoinOrSplitGesture;",
        "performRemoveSpaceGesture",
        "Landroid/view/inputmethod/RemoveSpaceGesture;",
        "performSelectGesture",
        "Landroid/view/inputmethod/SelectGesture;",
        "performSelectRangeGesture",
        "Landroid/view/inputmethod/SelectRangeGesture;",
        "previewDeleteGesture",
        "previewDeleteRangeGesture",
        "previewHandwritingGesture",
        "Landroid/view/inputmethod/PreviewableHandwritingGesture;",
        "cancellationSignal",
        "Landroid/os/CancellationSignal;",
        "previewHandwritingGesture$foundation_release",
        "previewSelectGesture",
        "previewSelectRangeGesture",
        "toTextGranularity",
        "Landroidx/compose/ui/text/TextGranularity;",
        "toTextGranularity-NUwxegE",
        "(I)I",
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

.field public static final INSTANCE:Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;

    invoke-direct {v0}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;-><init>()V

    sput-object v0, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->INSTANCE:Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final fallback(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/HandwritingGesture;)I
    .locals 10
    .param p1, "$this$fallback"    # Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .param p2, "gesture"    # Landroid/view/inputmethod/HandwritingGesture;

    .line 353
    nop

    .line 1104
    nop

    .line 1105
    const/4 v0, 0x1

    .line 1104
    .local v0, "restartImeIfContentChanges$iv":Z
    const/4 v1, 0x0

    .line 1108
    .local v1, "$i$f$editUntransformedTextAsUser":I
    invoke-static {p1}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->access$getTextFieldState$p(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)Landroidx/compose/foundation/text/input/TextFieldState;

    move-result-object v2

    .line 1109
    invoke-static {p1}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->access$getInputTransformation$p(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)Landroidx/compose/foundation/text/input/InputTransformation;

    move-result-object v3

    .line 1108
    nop

    .line 1110
    .local v2, "$this$iv$iv":Landroidx/compose/foundation/text/input/TextFieldState;
    .local v3, "inputTransformation$iv$iv":Landroidx/compose/foundation/text/input/InputTransformation;
    nop

    .line 1113
    sget-object v4, Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;->MergeIfPossible:Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;

    .line 1110
    .local v4, "undoBehavior$iv$iv":Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;
    const/4 v5, 0x0

    .line 1116
    .local v5, "$i$f$editAsUser$foundation_release":I
    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text/input/TextFieldBuffer;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getChangeTracker$foundation_release()Landroidx/compose/foundation/text/input/internal/ChangeTracker;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/compose/foundation/text/input/internal/ChangeTracker;->clearChanges()V

    .line 1117
    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text/input/TextFieldBuffer;

    move-result-object v6

    .local v6, "$this$editUntransformedTextAsUser_u24lambda_u2411$iv":Landroidx/compose/foundation/text/input/TextFieldBuffer;
    const/4 v7, 0x0

    .line 1118
    .local v7, "$i$a$-editAsUser$foundation_release$default-TransformedTextFieldState$editUntransformedTextAsUser$1$iv":I
    move-object v8, v6

    .local v8, "$this$fallback_u24lambda_u247":Landroidx/compose/foundation/text/input/TextFieldBuffer;
    const/4 v9, 0x0

    .line 353
    .local v9, "$i$a$-editUntransformedTextAsUser$default-HandwritingGestureApi34$fallback$1":I
    invoke-virtual {v8}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->clearHighlight$foundation_release()V

    .line 1118
    .end local v8    # "$this$fallback_u24lambda_u247":Landroidx/compose/foundation/text/input/TextFieldBuffer;
    .end local v9    # "$i$a$-editUntransformedTextAsUser$default-HandwritingGestureApi34$fallback$1":I
    nop

    .line 1119
    invoke-static {p1, v6}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->access$updateWedgeAffinity(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/TextFieldBuffer;)V

    .line 1120
    nop

    .line 1117
    .end local v6    # "$this$editUntransformedTextAsUser_u24lambda_u2411$iv":Landroidx/compose/foundation/text/input/TextFieldBuffer;
    .end local v7    # "$i$a$-editAsUser$foundation_release$default-TransformedTextFieldState$editUntransformedTextAsUser$1$iv":I
    nop

    .line 1121
    nop

    .line 1122
    nop

    .line 1123
    nop

    .line 1124
    nop

    .line 1121
    invoke-static {v2, v3, v0, v4}, Landroidx/compose/foundation/text/input/TextFieldState;->access$commitEditAsUser(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/foundation/text/input/InputTransformation;ZLandroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;)V

    .line 1126
    nop

    .line 1127
    .end local v2    # "$this$iv$iv":Landroidx/compose/foundation/text/input/TextFieldState;
    .end local v3    # "inputTransformation$iv$iv":Landroidx/compose/foundation/text/input/InputTransformation;
    .end local v4    # "undoBehavior$iv$iv":Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;
    .end local v5    # "$i$f$editAsUser$foundation_release":I
    nop

    .line 356
    .end local v0    # "restartImeIfContentChanges$iv":Z
    .end local v1    # "$i$f$editUntransformedTextAsUser":I
    invoke-virtual {p2}, Landroid/view/inputmethod/HandwritingGesture;->getFallbackText()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x3

    return v0

    .line 355
    :cond_0
    nop

    .line 358
    .local v0, "fallbackText":Ljava/lang/String;
    nop

    .line 359
    move-object v2, v0

    check-cast v2, Ljava/lang/CharSequence;

    .line 360
    nop

    .line 358
    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    .end local p1    # "$this$fallback":Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .local v1, "$this$fallback":Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    invoke-static/range {v1 .. v7}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->replaceSelectedText$default(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Ljava/lang/CharSequence;ZLandroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;ZILjava/lang/Object;)V

    .line 362
    const/4 p1, 0x5

    return p1
.end method

.method private final fallbackOnLegacyTextField(Landroid/view/inputmethod/HandwritingGesture;Lkotlin/jvm/functions/Function1;)I
    .locals 3
    .param p1, "gesture"    # Landroid/view/inputmethod/HandwritingGesture;
    .param p2, "editCommandConsumer"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/inputmethod/HandwritingGesture;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/input/EditCommand;",
            "Lkotlin/Unit;",
            ">;)I"
        }
    .end annotation

    .line 737
    invoke-virtual {p1}, Landroid/view/inputmethod/HandwritingGesture;->getFallbackText()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x3

    return v0

    .line 736
    :cond_0
    nop

    .line 738
    .local v0, "fallbackText":Ljava/lang/String;
    new-instance v1, Landroidx/compose/ui/text/input/CommitTextCommand;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Landroidx/compose/ui/text/input/CommitTextCommand;-><init>(Ljava/lang/String;I)V

    invoke-interface {p2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 739
    const/4 v1, 0x5

    return v1
.end method

.method private final highlightRange-XJREzCE(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;JI)V
    .locals 10
    .param p1, "$this$highlightRange_u2dXJREzCE"    # Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .param p2, "range"    # J
    .param p4, "type"    # I

    .line 369
    invoke-static {p2, p3}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 370
    nop

    .line 1128
    nop

    .line 1129
    const/4 v0, 0x1

    .line 1128
    .local v0, "restartImeIfContentChanges$iv":Z
    const/4 v1, 0x0

    .line 1132
    .local v1, "$i$f$editUntransformedTextAsUser":I
    invoke-static {p1}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->access$getTextFieldState$p(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)Landroidx/compose/foundation/text/input/TextFieldState;

    move-result-object v2

    .line 1133
    invoke-static {p1}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->access$getInputTransformation$p(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)Landroidx/compose/foundation/text/input/InputTransformation;

    move-result-object v3

    .line 1132
    nop

    .line 1134
    .local v2, "$this$iv$iv":Landroidx/compose/foundation/text/input/TextFieldState;
    .local v3, "inputTransformation$iv$iv":Landroidx/compose/foundation/text/input/InputTransformation;
    nop

    .line 1137
    sget-object v4, Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;->MergeIfPossible:Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;

    .line 1134
    .local v4, "undoBehavior$iv$iv":Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;
    const/4 v5, 0x0

    .line 1140
    .local v5, "$i$f$editAsUser$foundation_release":I
    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text/input/TextFieldBuffer;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getChangeTracker$foundation_release()Landroidx/compose/foundation/text/input/internal/ChangeTracker;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/compose/foundation/text/input/internal/ChangeTracker;->clearChanges()V

    .line 1141
    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text/input/TextFieldBuffer;

    move-result-object v6

    .local v6, "$this$editUntransformedTextAsUser_u24lambda_u2411$iv":Landroidx/compose/foundation/text/input/TextFieldBuffer;
    const/4 v7, 0x0

    .line 1142
    .local v7, "$i$a$-editAsUser$foundation_release$default-TransformedTextFieldState$editUntransformedTextAsUser$1$iv":I
    move-object v8, v6

    .local v8, "$this$highlightRange_XJREzCE_u24lambda_u248":Landroidx/compose/foundation/text/input/TextFieldBuffer;
    const/4 v9, 0x0

    .line 370
    .local v9, "$i$a$-editUntransformedTextAsUser$default-HandwritingGestureApi34$highlightRange$1":I
    invoke-virtual {v8}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->clearHighlight$foundation_release()V

    .line 1142
    .end local v8    # "$this$highlightRange_XJREzCE_u24lambda_u248":Landroidx/compose/foundation/text/input/TextFieldBuffer;
    .end local v9    # "$i$a$-editUntransformedTextAsUser$default-HandwritingGestureApi34$highlightRange$1":I
    nop

    .line 1143
    invoke-static {p1, v6}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->access$updateWedgeAffinity(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/TextFieldBuffer;)V

    .line 1144
    nop

    .line 1141
    .end local v6    # "$this$editUntransformedTextAsUser_u24lambda_u2411$iv":Landroidx/compose/foundation/text/input/TextFieldBuffer;
    .end local v7    # "$i$a$-editAsUser$foundation_release$default-TransformedTextFieldState$editUntransformedTextAsUser$1$iv":I
    nop

    .line 1145
    nop

    .line 1146
    nop

    .line 1147
    nop

    .line 1148
    nop

    .line 1145
    invoke-static {v2, v3, v0, v4}, Landroidx/compose/foundation/text/input/TextFieldState;->access$commitEditAsUser(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/foundation/text/input/InputTransformation;ZLandroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;)V

    .line 1150
    nop

    .line 1151
    .end local v2    # "$this$iv$iv":Landroidx/compose/foundation/text/input/TextFieldState;
    .end local v3    # "inputTransformation$iv$iv":Landroidx/compose/foundation/text/input/InputTransformation;
    .end local v4    # "undoBehavior$iv$iv":Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;
    .end local v5    # "$i$f$editAsUser$foundation_release":I
    nop

    .end local v0    # "restartImeIfContentChanges$iv":Z
    .end local v1    # "$i$f$editUntransformedTextAsUser":I
    goto :goto_0

    .line 372
    :cond_0
    invoke-virtual {p1, p4, p2, p3}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->highlightCharsIn-7RAjNK8(IJ)V

    .line 374
    :goto_0
    return-void
.end method

.method private final performDeleteGesture(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/DeleteGesture;Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;)I
    .locals 8
    .param p1, "$this$performDeleteGesture"    # Landroidx/compose/foundation/text/LegacyTextFieldState;
    .param p2, "gesture"    # Landroid/view/inputmethod/DeleteGesture;
    .param p3, "text"    # Landroidx/compose/ui/text/AnnotatedString;
    .param p4, "editCommandConsumer"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text/LegacyTextFieldState;",
            "Landroid/view/inputmethod/DeleteGesture;",
            "Landroidx/compose/ui/text/AnnotatedString;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/input/EditCommand;",
            "Lkotlin/Unit;",
            ">;)I"
        }
    .end annotation

    .line 464
    invoke-virtual {p2}, Landroid/view/inputmethod/DeleteGesture;->getGranularity()I

    move-result v0

    invoke-direct {p0, v0}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->toTextGranularity-NUwxegE(I)I

    move-result v0

    .line 466
    .local v0, "granularity":I
    nop

    .line 467
    invoke-virtual {p2}, Landroid/view/inputmethod/DeleteGesture;->getDeletionArea()Landroid/graphics/RectF;

    move-result-object v2

    invoke-static {v2}, Landroidx/compose/ui/graphics/RectHelper_androidKt;->toComposeRect(Landroid/graphics/RectF;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v2

    .line 468
    nop

    .line 469
    sget-object v3, Landroidx/compose/ui/text/TextInclusionStrategy;->Companion:Landroidx/compose/ui/text/TextInclusionStrategy$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/text/TextInclusionStrategy$Companion;->getContainsCenter()Landroidx/compose/ui/text/TextInclusionStrategy;

    move-result-object v3

    .line 466
    invoke-static {p1, v2, v0, v3}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$getRangeForScreenRect-OH9lIzo(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J

    move-result-wide v2

    .line 471
    move-wide v4, v2

    .local v4, "$this$performDeleteGesture_u24lambda_u2411":J
    const/4 v6, 0x0

    .line 472
    .local v6, "$i$a$-apply-HandwritingGestureApi34$performDeleteGesture$range$1":I
    invoke-static {v4, v5}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v7

    if-eqz v7, :cond_0

    sget-object v2, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->INSTANCE:Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;

    move-object v3, p2

    check-cast v3, Landroid/view/inputmethod/HandwritingGesture;

    invoke-direct {v2, v3, p4}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->fallbackOnLegacyTextField(Landroid/view/inputmethod/HandwritingGesture;Lkotlin/jvm/functions/Function1;)I

    move-result v2

    return v2

    .line 473
    :cond_0
    nop

    .line 471
    .end local v4    # "$this$performDeleteGesture_u24lambda_u2411":J
    .end local v6    # "$i$a$-apply-HandwritingGestureApi34$performDeleteGesture$range$1":I
    nop

    .line 465
    nop

    .line 475
    .local v2, "range":J
    nop

    .line 476
    nop

    .line 477
    nop

    .line 478
    sget-object v4, Landroidx/compose/ui/text/TextGranularity;->Companion:Landroidx/compose/ui/text/TextGranularity$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/text/TextGranularity$Companion;->getWord-DRrd7Zo()I

    move-result v4

    invoke-static {v0, v4}, Landroidx/compose/ui/text/TextGranularity;->equals-impl0(II)Z

    move-result v5

    .line 479
    nop

    .line 475
    move-object v1, p0

    move-object v4, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->performDeletionOnLegacyTextField-vJH6DeI(JLandroidx/compose/ui/text/AnnotatedString;ZLkotlin/jvm/functions/Function1;)V

    .line 481
    const/4 v1, 0x1

    return v1
.end method

.method private final performDeleteGesture(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/DeleteGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;)I
    .locals 7
    .param p1, "$this$performDeleteGesture"    # Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .param p2, "gesture"    # Landroid/view/inputmethod/DeleteGesture;
    .param p3, "layoutState"    # Landroidx/compose/foundation/text/input/internal/TextLayoutState;

    .line 133
    invoke-virtual {p2}, Landroid/view/inputmethod/DeleteGesture;->getGranularity()I

    move-result v0

    invoke-direct {p0, v0}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->toTextGranularity-NUwxegE(I)I

    move-result v0

    .line 135
    .local v0, "granularity":I
    nop

    .line 137
    invoke-virtual {p2}, Landroid/view/inputmethod/DeleteGesture;->getDeletionArea()Landroid/graphics/RectF;

    move-result-object v1

    invoke-static {v1}, Landroidx/compose/ui/graphics/RectHelper_androidKt;->toComposeRect(Landroid/graphics/RectF;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v1

    .line 138
    nop

    .line 139
    sget-object v2, Landroidx/compose/ui/text/TextInclusionStrategy;->Companion:Landroidx/compose/ui/text/TextInclusionStrategy$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/text/TextInclusionStrategy$Companion;->getContainsCenter()Landroidx/compose/ui/text/TextInclusionStrategy;

    move-result-object v2

    .line 136
    invoke-static {p3, v1, v0, v2}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$getRangeForScreenRect-OH9lIzo(Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J

    move-result-wide v1

    .line 141
    move-wide v3, v1

    .line 1103
    .local v3, "$this$performDeleteGesture_u24lambda_u243":J
    const/4 v5, 0x0

    .line 141
    .local v5, "$i$a$-apply-HandwritingGestureApi34$performDeleteGesture$rangeInTransformedText$1":I
    invoke-static {v3, v4}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v6

    if-eqz v6, :cond_0

    sget-object v1, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->INSTANCE:Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;

    move-object v2, p2

    check-cast v2, Landroid/view/inputmethod/HandwritingGesture;

    invoke-direct {v1, p1, v2}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->fallback(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/HandwritingGesture;)I

    move-result v1

    return v1

    .line 134
    .end local v3    # "$this$performDeleteGesture_u24lambda_u243":J
    .end local v5    # "$i$a$-apply-HandwritingGestureApi34$performDeleteGesture$rangeInTransformedText$1":I
    :cond_0
    nop

    .line 143
    .local v1, "rangeInTransformedText":J
    nop

    .line 144
    nop

    .line 145
    sget-object v3, Landroidx/compose/ui/text/TextGranularity;->Companion:Landroidx/compose/ui/text/TextGranularity$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/text/TextGranularity$Companion;->getWord-DRrd7Zo()I

    move-result v3

    invoke-static {v0, v3}, Landroidx/compose/ui/text/TextGranularity;->equals-impl0(II)Z

    move-result v3

    .line 143
    invoke-direct {p0, p1, v1, v2, v3}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->performDeletion-Sb-Bc2M(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;JZ)V

    .line 147
    const/4 v3, 0x1

    return v3
.end method

.method private final performDeleteRangeGesture(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/DeleteRangeGesture;Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;)I
    .locals 8
    .param p1, "$this$performDeleteRangeGesture"    # Landroidx/compose/foundation/text/LegacyTextFieldState;
    .param p2, "gesture"    # Landroid/view/inputmethod/DeleteRangeGesture;
    .param p3, "text"    # Landroidx/compose/ui/text/AnnotatedString;
    .param p4, "editCommandConsumer"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text/LegacyTextFieldState;",
            "Landroid/view/inputmethod/DeleteRangeGesture;",
            "Landroidx/compose/ui/text/AnnotatedString;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/input/EditCommand;",
            "Lkotlin/Unit;",
            ">;)I"
        }
    .end annotation

    .line 540
    invoke-virtual {p2}, Landroid/view/inputmethod/DeleteRangeGesture;->getGranularity()I

    move-result v0

    invoke-direct {p0, v0}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->toTextGranularity-NUwxegE(I)I

    move-result v0

    .line 542
    .local v0, "granularity":I
    nop

    .line 543
    invoke-virtual {p2}, Landroid/view/inputmethod/DeleteRangeGesture;->getDeletionStartArea()Landroid/graphics/RectF;

    move-result-object v2

    invoke-static {v2}, Landroidx/compose/ui/graphics/RectHelper_androidKt;->toComposeRect(Landroid/graphics/RectF;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v2

    .line 544
    invoke-virtual {p2}, Landroid/view/inputmethod/DeleteRangeGesture;->getDeletionEndArea()Landroid/graphics/RectF;

    move-result-object v3

    invoke-static {v3}, Landroidx/compose/ui/graphics/RectHelper_androidKt;->toComposeRect(Landroid/graphics/RectF;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v3

    .line 545
    nop

    .line 546
    sget-object v4, Landroidx/compose/ui/text/TextInclusionStrategy;->Companion:Landroidx/compose/ui/text/TextInclusionStrategy$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/text/TextInclusionStrategy$Companion;->getContainsCenter()Landroidx/compose/ui/text/TextInclusionStrategy;

    move-result-object v4

    .line 542
    invoke-static {p1, v2, v3, v0, v4}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$getRangeForScreenRects-O048IG0(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J

    move-result-wide v2

    .line 548
    move-wide v4, v2

    .local v4, "$this$performDeleteRangeGesture_u24lambda_u2413":J
    const/4 v6, 0x0

    .line 549
    .local v6, "$i$a$-apply-HandwritingGestureApi34$performDeleteRangeGesture$range$1":I
    invoke-static {v4, v5}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v7

    if-eqz v7, :cond_0

    sget-object v2, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->INSTANCE:Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;

    move-object v3, p2

    check-cast v3, Landroid/view/inputmethod/HandwritingGesture;

    invoke-direct {v2, v3, p4}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->fallbackOnLegacyTextField(Landroid/view/inputmethod/HandwritingGesture;Lkotlin/jvm/functions/Function1;)I

    move-result v2

    return v2

    .line 550
    :cond_0
    nop

    .line 548
    .end local v4    # "$this$performDeleteRangeGesture_u24lambda_u2413":J
    .end local v6    # "$i$a$-apply-HandwritingGestureApi34$performDeleteRangeGesture$range$1":I
    nop

    .line 541
    nop

    .line 551
    .local v2, "range":J
    nop

    .line 552
    nop

    .line 553
    nop

    .line 554
    sget-object v4, Landroidx/compose/ui/text/TextGranularity;->Companion:Landroidx/compose/ui/text/TextGranularity$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/text/TextGranularity$Companion;->getWord-DRrd7Zo()I

    move-result v4

    invoke-static {v0, v4}, Landroidx/compose/ui/text/TextGranularity;->equals-impl0(II)Z

    move-result v5

    .line 555
    nop

    .line 551
    move-object v1, p0

    move-object v4, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->performDeletionOnLegacyTextField-vJH6DeI(JLandroidx/compose/ui/text/AnnotatedString;ZLkotlin/jvm/functions/Function1;)V

    .line 557
    const/4 v1, 0x1

    return v1
.end method

.method private final performDeleteRangeGesture(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/DeleteRangeGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;)I
    .locals 7
    .param p1, "$this$performDeleteRangeGesture"    # Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .param p2, "gesture"    # Landroid/view/inputmethod/DeleteRangeGesture;
    .param p3, "layoutState"    # Landroidx/compose/foundation/text/input/internal/TextLayoutState;

    .line 203
    invoke-virtual {p2}, Landroid/view/inputmethod/DeleteRangeGesture;->getGranularity()I

    move-result v0

    invoke-direct {p0, v0}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->toTextGranularity-NUwxegE(I)I

    move-result v0

    .line 205
    .local v0, "granularity":I
    nop

    .line 207
    invoke-virtual {p2}, Landroid/view/inputmethod/DeleteRangeGesture;->getDeletionStartArea()Landroid/graphics/RectF;

    move-result-object v1

    invoke-static {v1}, Landroidx/compose/ui/graphics/RectHelper_androidKt;->toComposeRect(Landroid/graphics/RectF;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v1

    .line 208
    invoke-virtual {p2}, Landroid/view/inputmethod/DeleteRangeGesture;->getDeletionEndArea()Landroid/graphics/RectF;

    move-result-object v2

    invoke-static {v2}, Landroidx/compose/ui/graphics/RectHelper_androidKt;->toComposeRect(Landroid/graphics/RectF;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v2

    .line 209
    nop

    .line 210
    sget-object v3, Landroidx/compose/ui/text/TextInclusionStrategy;->Companion:Landroidx/compose/ui/text/TextInclusionStrategy$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/text/TextInclusionStrategy$Companion;->getContainsCenter()Landroidx/compose/ui/text/TextInclusionStrategy;

    move-result-object v3

    .line 206
    invoke-static {p3, v1, v2, v0, v3}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$getRangeForScreenRects-O048IG0(Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J

    move-result-wide v1

    .line 212
    move-wide v3, v1

    .line 1103
    .local v3, "$this$performDeleteRangeGesture_u24lambda_u245":J
    const/4 v5, 0x0

    .line 212
    .local v5, "$i$a$-apply-HandwritingGestureApi34$performDeleteRangeGesture$rangeInTransformedText$1":I
    invoke-static {v3, v4}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v6

    if-eqz v6, :cond_0

    sget-object v1, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->INSTANCE:Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;

    move-object v2, p2

    check-cast v2, Landroid/view/inputmethod/HandwritingGesture;

    invoke-direct {v1, p1, v2}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->fallback(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/HandwritingGesture;)I

    move-result v1

    return v1

    .line 204
    .end local v3    # "$this$performDeleteRangeGesture_u24lambda_u245":J
    .end local v5    # "$i$a$-apply-HandwritingGestureApi34$performDeleteRangeGesture$rangeInTransformedText$1":I
    :cond_0
    nop

    .line 214
    .local v1, "rangeInTransformedText":J
    nop

    .line 215
    nop

    .line 216
    sget-object v3, Landroidx/compose/ui/text/TextGranularity;->Companion:Landroidx/compose/ui/text/TextGranularity$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/text/TextGranularity$Companion;->getWord-DRrd7Zo()I

    move-result v3

    invoke-static {v0, v3}, Landroidx/compose/ui/text/TextGranularity;->equals-impl0(II)Z

    move-result v3

    .line 214
    invoke-direct {p0, p1, v1, v2, v3}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->performDeletion-Sb-Bc2M(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;JZ)V

    .line 218
    const/4 v3, 0x1

    return v3
.end method

.method private final performDeletion-Sb-Bc2M(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;JZ)V
    .locals 10
    .param p1, "$this$performDeletion_u2dSb_u2dBc2M"    # Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .param p2, "rangeInTransformedText"    # J
    .param p4, "adjustRange"    # Z

    .line 344
    if-eqz p4, :cond_0

    .line 345
    invoke-virtual {p1}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->getVisualText()Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {p2, p3, v0}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$adjustHandwritingDeleteGestureRange-72CqOWE(JLjava/lang/CharSequence;)J

    move-result-wide v0

    goto :goto_0

    .line 347
    :cond_0
    move-wide v0, p2

    .line 344
    :goto_0
    nop

    .line 343
    move-wide v4, v0

    .line 349
    .local v4, "finalRange":J
    const-string v0, ""

    move-object v3, v0

    check-cast v3, Ljava/lang/CharSequence;

    const/16 v8, 0xc

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p1

    .end local p1    # "$this$performDeletion_u2dSb_u2dBc2M":Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .local v2, "$this$performDeletion_u2dSb_u2dBc2M":Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    invoke-static/range {v2 .. v9}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->replaceText-M8tDOmk$default(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Ljava/lang/CharSequence;JLandroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;ZILjava/lang/Object;)V

    .line 350
    return-void
.end method

.method private final performDeletionOnLegacyTextField-vJH6DeI(JLandroidx/compose/ui/text/AnnotatedString;ZLkotlin/jvm/functions/Function1;)V
    .locals 6
    .param p1, "range"    # J
    .param p3, "text"    # Landroidx/compose/ui/text/AnnotatedString;
    .param p4, "adjustRange"    # Z
    .param p5, "editCommandConsumer"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Landroidx/compose/ui/text/AnnotatedString;",
            "Z",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/input/EditCommand;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 715
    if-eqz p4, :cond_0

    .line 716
    move-object v0, p3

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {p1, p2, v0}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$adjustHandwritingDeleteGestureRange-72CqOWE(JLjava/lang/CharSequence;)J

    move-result-wide v0

    goto :goto_0

    .line 718
    :cond_0
    move-wide v0, p1

    .line 715
    :goto_0
    nop

    .line 714
    nop

    .line 721
    .local v0, "finalRange":J
    nop

    .line 723
    const/4 v2, 0x2

    new-array v2, v2, [Landroidx/compose/ui/text/input/EditCommand;

    new-instance v3, Landroidx/compose/ui/text/input/SetSelectionCommand;

    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v4

    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v5

    invoke-direct {v3, v4, v5}, Landroidx/compose/ui/text/input/SetSelectionCommand;-><init>(II)V

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 726
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getLength-impl(J)I

    move-result v3

    .line 724
    new-instance v5, Landroidx/compose/ui/text/input/DeleteSurroundingTextCommand;

    .line 726
    nop

    .line 725
    nop

    .line 724
    invoke-direct {v5, v3, v4}, Landroidx/compose/ui/text/input/DeleteSurroundingTextCommand;-><init>(II)V

    const/4 v3, 0x1

    aput-object v5, v2, v3

    .line 723
    nop

    .line 722
    invoke-static {v2}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$compoundEditCommand([Landroidx/compose/ui/text/input/EditCommand;)Landroidx/compose/ui/text/input/EditCommand;

    move-result-object v2

    .line 721
    invoke-interface {p5, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 730
    return-void
.end method

.method private final performInsertGesture(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/InsertGesture;Landroidx/compose/ui/platform/ViewConfiguration;Lkotlin/jvm/functions/Function1;)I
    .locals 4
    .param p1, "$this$performInsertGesture"    # Landroidx/compose/foundation/text/LegacyTextFieldState;
    .param p2, "gesture"    # Landroid/view/inputmethod/InsertGesture;
    .param p3, "viewConfiguration"    # Landroidx/compose/ui/platform/ViewConfiguration;
    .param p4, "editCommandConsumer"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text/LegacyTextFieldState;",
            "Landroid/view/inputmethod/InsertGesture;",
            "Landroidx/compose/ui/platform/ViewConfiguration;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/input/EditCommand;",
            "Lkotlin/Unit;",
            ">;)I"
        }
    .end annotation

    .line 614
    if-nez p3, :cond_0

    .line 615
    move-object v0, p2

    check-cast v0, Landroid/view/inputmethod/HandwritingGesture;

    invoke-direct {p0, v0, p4}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->fallbackOnLegacyTextField(Landroid/view/inputmethod/HandwritingGesture;Lkotlin/jvm/functions/Function1;)I

    move-result v0

    return v0

    .line 619
    :cond_0
    nop

    .line 620
    invoke-virtual {p2}, Landroid/view/inputmethod/InsertGesture;->getInsertionPoint()Landroid/graphics/PointF;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$toOffset(Landroid/graphics/PointF;)J

    move-result-wide v0

    .line 621
    nop

    .line 619
    invoke-static {p1, v0, v1, p3}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$getOffsetForHandwritingGesture-d-4ec7I(Landroidx/compose/foundation/text/LegacyTextFieldState;JLandroidx/compose/ui/platform/ViewConfiguration;)I

    move-result v0

    .line 618
    nop

    .line 624
    .local v0, "offset":I
    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    invoke-virtual {p1}, Landroidx/compose/foundation/text/LegacyTextFieldState;->getLayoutResult()Landroidx/compose/foundation/text/TextLayoutResultProxy;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroidx/compose/foundation/text/TextLayoutResultProxy;->getValue()Landroidx/compose/ui/text/TextLayoutResult;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1, v0}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$isBiDiBoundary(Landroidx/compose/ui/text/TextLayoutResult;I)Z

    move-result v1

    if-ne v1, v3, :cond_1

    move v2, v3

    :cond_1
    if-eqz v2, :cond_2

    goto :goto_0

    .line 628
    :cond_2
    invoke-virtual {p2}, Landroid/view/inputmethod/InsertGesture;->getTextToInsert()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1, p4}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->performInsertionOnLegacyTextField(ILjava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 629
    return v3

    .line 625
    :cond_3
    :goto_0
    move-object v1, p2

    check-cast v1, Landroid/view/inputmethod/HandwritingGesture;

    invoke-direct {p0, v1, p4}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->fallbackOnLegacyTextField(Landroid/view/inputmethod/HandwritingGesture;Lkotlin/jvm/functions/Function1;)I

    move-result v1

    return v1
.end method

.method private final performInsertGesture(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/InsertGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/platform/ViewConfiguration;)I
    .locals 10
    .param p1, "$this$performInsertGesture"    # Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .param p2, "gesture"    # Landroid/view/inputmethod/InsertGesture;
    .param p3, "layoutState"    # Landroidx/compose/foundation/text/input/internal/TextLayoutState;
    .param p4, "viewConfiguration"    # Landroidx/compose/ui/platform/ViewConfiguration;

    .line 276
    nop

    .line 277
    invoke-virtual {p2}, Landroid/view/inputmethod/InsertGesture;->getInsertionPoint()Landroid/graphics/PointF;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$toOffset(Landroid/graphics/PointF;)J

    move-result-wide v0

    .line 278
    nop

    .line 276
    invoke-static {p3, v0, v1, p4}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$getOffsetForHandwritingGesture-d-4ec7I(Landroidx/compose/foundation/text/input/internal/TextLayoutState;JLandroidx/compose/ui/platform/ViewConfiguration;)I

    move-result v0

    .line 275
    nop

    .line 282
    .local v0, "offset":I
    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 283
    move-object v1, p2

    check-cast v1, Landroid/view/inputmethod/HandwritingGesture;

    invoke-direct {p0, p1, v1}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->fallback(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/HandwritingGesture;)I

    move-result v1

    return v1

    .line 286
    :cond_0
    invoke-virtual {p2}, Landroid/view/inputmethod/InsertGesture;->getTextToInsert()Ljava/lang/String;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v0}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(I)J

    move-result-wide v4

    const/16 v8, 0xc

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p1

    .end local p1    # "$this$performInsertGesture":Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .local v2, "$this$performInsertGesture":Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    invoke-static/range {v2 .. v9}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->replaceText-M8tDOmk$default(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Ljava/lang/CharSequence;JLandroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;ZILjava/lang/Object;)V

    .line 287
    const/4 p1, 0x1

    return p1
.end method

.method private final performInsertionOnLegacyTextField(ILjava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .param p1, "offset"    # I
    .param p2, "text"    # Ljava/lang/String;
    .param p3, "editCommandConsumer"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/input/EditCommand;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 694
    nop

    .line 695
    const/4 v0, 0x2

    new-array v0, v0, [Landroidx/compose/ui/text/input/EditCommand;

    new-instance v1, Landroidx/compose/ui/text/input/SetSelectionCommand;

    invoke-direct {v1, p1, p1}, Landroidx/compose/ui/text/input/SetSelectionCommand;-><init>(II)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Landroidx/compose/ui/text/input/CommitTextCommand;

    const/4 v2, 0x1

    invoke-direct {v1, p2, v2}, Landroidx/compose/ui/text/input/CommitTextCommand;-><init>(Ljava/lang/String;I)V

    aput-object v1, v0, v2

    invoke-static {v0}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$compoundEditCommand([Landroidx/compose/ui/text/input/EditCommand;)Landroidx/compose/ui/text/input/EditCommand;

    move-result-object v0

    .line 694
    invoke-interface {p3, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 697
    return-void
.end method

.method private final performJoinOrSplitGesture(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/JoinOrSplitGesture;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/platform/ViewConfiguration;Lkotlin/jvm/functions/Function1;)I
    .locals 10
    .param p1, "$this$performJoinOrSplitGesture"    # Landroidx/compose/foundation/text/LegacyTextFieldState;
    .param p2, "gesture"    # Landroid/view/inputmethod/JoinOrSplitGesture;
    .param p3, "text"    # Landroidx/compose/ui/text/AnnotatedString;
    .param p4, "viewConfiguration"    # Landroidx/compose/ui/platform/ViewConfiguration;
    .param p5, "editCommandConsumer"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text/LegacyTextFieldState;",
            "Landroid/view/inputmethod/JoinOrSplitGesture;",
            "Landroidx/compose/ui/text/AnnotatedString;",
            "Landroidx/compose/ui/platform/ViewConfiguration;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/input/EditCommand;",
            "Lkotlin/Unit;",
            ">;)I"
        }
    .end annotation

    .line 580
    if-nez p4, :cond_0

    .line 581
    move-object v0, p2

    check-cast v0, Landroid/view/inputmethod/HandwritingGesture;

    invoke-direct {p0, v0, p5}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->fallbackOnLegacyTextField(Landroid/view/inputmethod/HandwritingGesture;Lkotlin/jvm/functions/Function1;)I

    move-result v0

    return v0

    .line 585
    :cond_0
    nop

    .line 586
    invoke-virtual {p2}, Landroid/view/inputmethod/JoinOrSplitGesture;->getJoinOrSplitPoint()Landroid/graphics/PointF;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$toOffset(Landroid/graphics/PointF;)J

    move-result-wide v0

    .line 587
    nop

    .line 585
    invoke-static {p1, v0, v1, p4}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$getOffsetForHandwritingGesture-d-4ec7I(Landroidx/compose/foundation/text/LegacyTextFieldState;JLandroidx/compose/ui/platform/ViewConfiguration;)I

    move-result v0

    .line 584
    nop

    .line 590
    .local v0, "offset":I
    const/4 v1, -0x1

    if-eq v0, v1, :cond_4

    invoke-virtual {p1}, Landroidx/compose/foundation/text/LegacyTextFieldState;->getLayoutResult()Landroidx/compose/foundation/text/TextLayoutResultProxy;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroidx/compose/foundation/text/TextLayoutResultProxy;->getValue()Landroidx/compose/ui/text/TextLayoutResult;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1, v0}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$isBiDiBoundary(Landroidx/compose/ui/text/TextLayoutResult;I)Z

    move-result v1

    if-ne v1, v3, :cond_1

    move v2, v3

    :cond_1
    if-eqz v2, :cond_2

    move-object v7, p3

    move-object v9, p5

    goto :goto_1

    .line 594
    :cond_2
    move-object v1, p3

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1, v0}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$rangeOfWhitespaces(Ljava/lang/CharSequence;I)J

    move-result-wide v5

    .line 595
    .local v5, "range":J
    invoke-static {v5, v6}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 596
    invoke-static {v5, v6}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    move-result v1

    const-string v2, " "

    invoke-direct {p0, v1, v2, p5}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->performInsertionOnLegacyTextField(ILjava/lang/String;Lkotlin/jvm/functions/Function1;)V

    move-object v7, p3

    move-object v9, p5

    goto :goto_0

    .line 598
    :cond_3
    nop

    .line 599
    nop

    .line 600
    nop

    .line 601
    nop

    .line 602
    nop

    .line 598
    const/4 v8, 0x0

    move-object v4, p0

    move-object v7, p3

    move-object v9, p5

    .end local p3    # "text":Landroidx/compose/ui/text/AnnotatedString;
    .end local p5    # "editCommandConsumer":Lkotlin/jvm/functions/Function1;
    .local v7, "text":Landroidx/compose/ui/text/AnnotatedString;
    .local v9, "editCommandConsumer":Lkotlin/jvm/functions/Function1;
    invoke-direct/range {v4 .. v9}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->performDeletionOnLegacyTextField-vJH6DeI(JLandroidx/compose/ui/text/AnnotatedString;ZLkotlin/jvm/functions/Function1;)V

    .line 606
    :goto_0
    return v3

    .line 590
    .end local v5    # "range":J
    .end local v7    # "text":Landroidx/compose/ui/text/AnnotatedString;
    .end local v9    # "editCommandConsumer":Lkotlin/jvm/functions/Function1;
    .restart local p3    # "text":Landroidx/compose/ui/text/AnnotatedString;
    .restart local p5    # "editCommandConsumer":Lkotlin/jvm/functions/Function1;
    :cond_4
    move-object v7, p3

    move-object v9, p5

    .line 591
    .end local p3    # "text":Landroidx/compose/ui/text/AnnotatedString;
    .end local p5    # "editCommandConsumer":Lkotlin/jvm/functions/Function1;
    .restart local v7    # "text":Landroidx/compose/ui/text/AnnotatedString;
    .restart local v9    # "editCommandConsumer":Lkotlin/jvm/functions/Function1;
    :goto_1
    move-object p3, p2

    check-cast p3, Landroid/view/inputmethod/HandwritingGesture;

    invoke-direct {p0, p3, v9}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->fallbackOnLegacyTextField(Landroid/view/inputmethod/HandwritingGesture;Lkotlin/jvm/functions/Function1;)I

    move-result p3

    return p3
.end method

.method private final performJoinOrSplitGesture(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/JoinOrSplitGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/platform/ViewConfiguration;)I
    .locals 12
    .param p1, "$this$performJoinOrSplitGesture"    # Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .param p2, "gesture"    # Landroid/view/inputmethod/JoinOrSplitGesture;
    .param p3, "layoutState"    # Landroidx/compose/foundation/text/input/internal/TextLayoutState;
    .param p4, "viewConfiguration"    # Landroidx/compose/ui/platform/ViewConfiguration;

    .line 245
    invoke-virtual {p1}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->getOutputText()Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->getUntransformedText()Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 246
    const/4 v0, 0x3

    return v0

    .line 250
    :cond_0
    nop

    .line 251
    invoke-virtual {p2}, Landroid/view/inputmethod/JoinOrSplitGesture;->getJoinOrSplitPoint()Landroid/graphics/PointF;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$toOffset(Landroid/graphics/PointF;)J

    move-result-wide v0

    .line 252
    nop

    .line 250
    move-object v8, p3

    move-object/from16 v9, p4

    invoke-static {p3, v0, v1, v9}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$getOffsetForHandwritingGesture-d-4ec7I(Landroidx/compose/foundation/text/input/internal/TextLayoutState;JLandroidx/compose/ui/platform/ViewConfiguration;)I

    move-result v0

    .line 249
    move v10, v0

    .line 256
    .local v10, "offset":I
    const/4 v0, -0x1

    if-eq v10, v0, :cond_4

    invoke-virtual {p3}, Landroidx/compose/foundation/text/input/internal/TextLayoutState;->getLayoutResult()Landroidx/compose/ui/text/TextLayoutResult;

    move-result-object v0

    const/4 v11, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-static {v0, v10}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$isBiDiBoundary(Landroidx/compose/ui/text/TextLayoutResult;I)Z

    move-result v0

    if-ne v0, v11, :cond_1

    move v0, v11

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    if-eqz v0, :cond_2

    goto :goto_2

    .line 260
    :cond_2
    invoke-virtual {p1}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->getVisualText()Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0, v10}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$rangeOfWhitespaces(Ljava/lang/CharSequence;I)J

    move-result-wide v2

    .line 262
    .local v2, "textRange":J
    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 263
    const-string v0, " "

    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v7}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->replaceText-M8tDOmk$default(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Ljava/lang/CharSequence;JLandroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;ZILjava/lang/Object;)V

    goto :goto_1

    .line 265
    :cond_3
    invoke-direct {p0, p1, v2, v3, v1}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->performDeletion-Sb-Bc2M(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;JZ)V

    .line 267
    :goto_1
    return v11

    .line 257
    .end local v2    # "textRange":J
    :cond_4
    :goto_2
    move-object v1, p2

    check-cast v1, Landroid/view/inputmethod/HandwritingGesture;

    invoke-direct {p0, p1, v1}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->fallback(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/HandwritingGesture;)I

    move-result v1

    return v1
.end method

.method private final performRemoveSpaceGesture(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/RemoveSpaceGesture;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/platform/ViewConfiguration;Lkotlin/jvm/functions/Function1;)I
    .locals 12
    .param p1, "$this$performRemoveSpaceGesture"    # Landroidx/compose/foundation/text/LegacyTextFieldState;
    .param p2, "gesture"    # Landroid/view/inputmethod/RemoveSpaceGesture;
    .param p3, "text"    # Landroidx/compose/ui/text/AnnotatedString;
    .param p4, "viewConfiguration"    # Landroidx/compose/ui/platform/ViewConfiguration;
    .param p5, "editCommandConsumer"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text/LegacyTextFieldState;",
            "Landroid/view/inputmethod/RemoveSpaceGesture;",
            "Landroidx/compose/ui/text/AnnotatedString;",
            "Landroidx/compose/ui/platform/ViewConfiguration;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/input/EditCommand;",
            "Lkotlin/Unit;",
            ">;)I"
        }
    .end annotation

    .line 640
    move-object/from16 v0, p5

    .line 639
    invoke-virtual {p1}, Landroidx/compose/foundation/text/LegacyTextFieldState;->getLayoutResult()Landroidx/compose/foundation/text/TextLayoutResultProxy;

    move-result-object v1

    .line 640
    if-eqz v1, :cond_0

    .line 639
    nop

    .line 640
    invoke-virtual {v1}, Landroidx/compose/foundation/text/TextLayoutResultProxy;->getValue()Landroidx/compose/ui/text/TextLayoutResult;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    move-object v2, v1

    .line 642
    invoke-virtual {p2}, Landroid/view/inputmethod/RemoveSpaceGesture;->getStartPoint()Landroid/graphics/PointF;

    move-result-object v1

    invoke-static {v1}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$toOffset(Landroid/graphics/PointF;)J

    move-result-wide v3

    .line 643
    invoke-virtual {p2}, Landroid/view/inputmethod/RemoveSpaceGesture;->getEndPoint()Landroid/graphics/PointF;

    move-result-object v1

    invoke-static {v1}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$toOffset(Landroid/graphics/PointF;)J

    move-result-wide v5

    .line 644
    invoke-virtual {p1}, Landroidx/compose/foundation/text/LegacyTextFieldState;->getLayoutCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v7

    .line 645
    nop

    .line 641
    move-object/from16 v8, p4

    invoke-static/range {v2 .. v8}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$getRangeForRemoveSpaceGesture-5iVPX68(Landroidx/compose/ui/text/TextLayoutResult;JJLandroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/platform/ViewConfiguration;)J

    move-result-wide v1

    .line 647
    move-wide v3, v1

    .local v3, "$this$performRemoveSpaceGesture_u24lambda_u2414":J
    const/4 v5, 0x0

    .line 648
    .local v5, "$i$a$-apply-HandwritingGestureApi34$performRemoveSpaceGesture$range$2":I
    invoke-static {v3, v4}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v6

    if-eqz v6, :cond_1

    sget-object v1, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->INSTANCE:Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;

    move-object v2, p2

    check-cast v2, Landroid/view/inputmethod/HandwritingGesture;

    invoke-direct {v1, v2, v0}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->fallbackOnLegacyTextField(Landroid/view/inputmethod/HandwritingGesture;Lkotlin/jvm/functions/Function1;)I

    move-result v1

    return v1

    .line 649
    :cond_1
    nop

    .line 647
    .end local v3    # "$this$performRemoveSpaceGesture_u24lambda_u2414":J
    .end local v5    # "$i$a$-apply-HandwritingGestureApi34$performRemoveSpaceGesture$range$2":I
    nop

    .line 638
    nop

    .line 651
    .local v1, "range":J
    new-instance v3, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v3}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .local v3, "firstMatchStart":Lkotlin/jvm/internal/Ref$IntRef;
    const/4 v4, -0x1

    iput v4, v3, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 652
    new-instance v5, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v5}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .local v5, "lastMatchEnd":Lkotlin/jvm/internal/Ref$IntRef;
    iput v4, v5, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 654
    move-object v6, p3

    check-cast v6, Ljava/lang/CharSequence;

    invoke-static {v6, v1, v2}, Landroidx/compose/ui/text/TextRangeKt;->substring-FDrldGo(Ljava/lang/CharSequence;J)Ljava/lang/String;

    move-result-object v6

    check-cast v6, Ljava/lang/CharSequence;

    new-instance v7, Lkotlin/text/Regex;

    const-string v8, "\\s+"

    invoke-direct {v7, v8}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    new-instance v8, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34$performRemoveSpaceGesture$newText$2;

    invoke-direct {v8, v3, v5}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34$performRemoveSpaceGesture$newText$2;-><init>(Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;)V

    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v7, v6, v8}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    move-result-object v6

    .line 653
    nop

    .line 663
    .local v6, "newText":Ljava/lang/String;
    iget v7, v3, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    if-eq v7, v4, :cond_3

    iget v7, v5, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    if-ne v7, v4, :cond_2

    goto :goto_1

    .line 670
    :cond_2
    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    move-result v4

    iget v7, v3, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    add-int/2addr v4, v7

    .line 671
    .local v4, "replacedRangeStart":I
    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    move-result v7

    iget v8, v5, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    add-int/2addr v7, v8

    .line 675
    .local v7, "replacedRangeEnd":I
    nop

    .line 676
    iget v8, v3, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 677
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v9

    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->getLength-impl(J)I

    move-result v10

    iget v11, v5, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    sub-int/2addr v10, v11

    sub-int/2addr v9, v10

    invoke-virtual {v6, v8, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    const-string/jumbo v9, "substring(...)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 675
    nop

    .line 674
    nop

    .line 680
    .local v8, "finalNewText":Ljava/lang/String;
    nop

    .line 682
    const/4 v9, 0x2

    new-array v9, v9, [Landroidx/compose/ui/text/input/EditCommand;

    new-instance v10, Landroidx/compose/ui/text/input/SetSelectionCommand;

    invoke-direct {v10, v4, v7}, Landroidx/compose/ui/text/input/SetSelectionCommand;-><init>(II)V

    const/4 v11, 0x0

    aput-object v10, v9, v11

    .line 683
    new-instance v10, Landroidx/compose/ui/text/input/CommitTextCommand;

    const/4 v11, 0x1

    invoke-direct {v10, v8, v11}, Landroidx/compose/ui/text/input/CommitTextCommand;-><init>(Ljava/lang/String;I)V

    aput-object v10, v9, v11

    .line 682
    nop

    .line 681
    invoke-static {v9}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$compoundEditCommand([Landroidx/compose/ui/text/input/EditCommand;)Landroidx/compose/ui/text/input/EditCommand;

    move-result-object v9

    .line 680
    invoke-interface {v0, v9}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 686
    return v11

    .line 664
    .end local v4    # "replacedRangeStart":I
    .end local v7    # "replacedRangeEnd":I
    .end local v8    # "finalNewText":Ljava/lang/String;
    :cond_3
    :goto_1
    move-object v4, p2

    check-cast v4, Landroid/view/inputmethod/HandwritingGesture;

    invoke-direct {p0, v4, v0}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->fallbackOnLegacyTextField(Landroid/view/inputmethod/HandwritingGesture;Lkotlin/jvm/functions/Function1;)I

    move-result v4

    return v4
.end method

.method private final performRemoveSpaceGesture(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/RemoveSpaceGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/platform/ViewConfiguration;)I
    .locals 14
    .param p1, "$this$performRemoveSpaceGesture"    # Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .param p2, "gesture"    # Landroid/view/inputmethod/RemoveSpaceGesture;
    .param p3, "layoutState"    # Landroidx/compose/foundation/text/input/internal/TextLayoutState;
    .param p4, "viewConfiguration"    # Landroidx/compose/ui/platform/ViewConfiguration;

    .line 296
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/foundation/text/input/internal/TextLayoutState;->getLayoutResult()Landroidx/compose/ui/text/TextLayoutResult;

    move-result-object v1

    .line 298
    invoke-virtual/range {p2 .. p2}, Landroid/view/inputmethod/RemoveSpaceGesture;->getStartPoint()Landroid/graphics/PointF;

    move-result-object v2

    invoke-static {v2}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$toOffset(Landroid/graphics/PointF;)J

    move-result-wide v2

    .line 299
    invoke-virtual/range {p2 .. p2}, Landroid/view/inputmethod/RemoveSpaceGesture;->getEndPoint()Landroid/graphics/PointF;

    move-result-object v4

    invoke-static {v4}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$toOffset(Landroid/graphics/PointF;)J

    move-result-wide v4

    .line 300
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/foundation/text/input/internal/TextLayoutState;->getTextLayoutNodeCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v6

    .line 301
    nop

    .line 297
    move-object/from16 v7, p4

    invoke-static/range {v1 .. v7}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$getRangeForRemoveSpaceGesture-5iVPX68(Landroidx/compose/ui/text/TextLayoutResult;JJLandroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/platform/ViewConfiguration;)J

    move-result-wide v1

    .line 303
    move-wide v3, v1

    .line 1103
    .local v3, "$this$performRemoveSpaceGesture_u24lambda_u246":J
    const/4 v5, 0x0

    .line 303
    .local v5, "$i$a$-apply-HandwritingGestureApi34$performRemoveSpaceGesture$range$1":I
    invoke-static {v3, v4}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v6

    if-eqz v6, :cond_0

    sget-object v1, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->INSTANCE:Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;

    move-object/from16 v2, p2

    check-cast v2, Landroid/view/inputmethod/HandwritingGesture;

    invoke-direct {v1, p1, v2}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->fallback(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/HandwritingGesture;)I

    move-result v1

    return v1

    .line 295
    .end local v3    # "$this$performRemoveSpaceGesture_u24lambda_u246":J
    .end local v5    # "$i$a$-apply-HandwritingGestureApi34$performRemoveSpaceGesture$range$1":I
    :cond_0
    move-wide v8, v1

    .line 305
    .local v8, "range":J
    new-instance v1, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    move-object v10, v1

    .local v10, "firstMatchStart":Lkotlin/jvm/internal/Ref$IntRef;
    const/4 v1, -0x1

    iput v1, v10, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 306
    new-instance v2, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    move-object v11, v2

    .local v11, "lastMatchEnd":Lkotlin/jvm/internal/Ref$IntRef;
    iput v1, v11, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 308
    invoke-virtual {p1}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->getVisualText()Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2, v8, v9}, Landroidx/compose/ui/text/TextRangeKt;->substring-FDrldGo(Ljava/lang/CharSequence;J)Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    new-instance v3, Lkotlin/text/Regex;

    const-string v4, "\\s+"

    invoke-direct {v3, v4}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    new-instance v4, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34$performRemoveSpaceGesture$newText$1;

    invoke-direct {v4, v10, v11}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34$performRemoveSpaceGesture$newText$1;-><init>(Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;)V

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v3, v2, v4}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    move-result-object v2

    .line 307
    move-object v12, v2

    .line 317
    .local v12, "newText":Ljava/lang/String;
    iget v2, v10, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    if-eq v2, v1, :cond_2

    iget v2, v11, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    if-ne v2, v1, :cond_1

    goto :goto_0

    .line 326
    :cond_1
    invoke-static {v8, v9}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    move-result v1

    iget v2, v10, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    add-int/2addr v1, v2

    invoke-static {v8, v9}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    move-result v2

    iget v3, v11, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    add-int/2addr v2, v3

    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(II)J

    move-result-wide v2

    .line 330
    .local v2, "finalRange":J
    nop

    .line 331
    iget v1, v10, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 332
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v4

    invoke-static {v8, v9}, Landroidx/compose/ui/text/TextRange;->getLength-impl(J)I

    move-result v5

    iget v6, v11, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    sub-int/2addr v5, v6

    sub-int/2addr v4, v5

    invoke-virtual {v12, v1, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v4, "substring(...)"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 330
    nop

    .line 329
    move-object v13, v1

    .line 335
    .local v13, "finalNewText":Ljava/lang/String;
    move-object v1, v13

    check-cast v1, Ljava/lang/CharSequence;

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v7}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->replaceText-M8tDOmk$default(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Ljava/lang/CharSequence;JLandroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;ZILjava/lang/Object;)V

    .line 336
    const/4 v1, 0x1

    return v1

    .line 318
    .end local v2    # "finalRange":J
    .end local v13    # "finalNewText":Ljava/lang/String;
    :cond_2
    :goto_0
    move-object/from16 v1, p2

    check-cast v1, Landroid/view/inputmethod/HandwritingGesture;

    invoke-direct {p0, p1, v1}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->fallback(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/HandwritingGesture;)I

    move-result v1

    return v1
.end method

.method private final performSelectGesture(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/SelectGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function1;)I
    .locals 6
    .param p1, "$this$performSelectGesture"    # Landroidx/compose/foundation/text/LegacyTextFieldState;
    .param p2, "gesture"    # Landroid/view/inputmethod/SelectGesture;
    .param p3, "textSelectionManager"    # Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .param p4, "editCommandConsumer"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text/LegacyTextFieldState;",
            "Landroid/view/inputmethod/SelectGesture;",
            "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/input/EditCommand;",
            "Lkotlin/Unit;",
            ">;)I"
        }
    .end annotation

    .line 433
    nop

    .line 434
    invoke-virtual {p2}, Landroid/view/inputmethod/SelectGesture;->getSelectionArea()Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/ui/graphics/RectHelper_androidKt;->toComposeRect(Landroid/graphics/RectF;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v0

    .line 435
    invoke-virtual {p2}, Landroid/view/inputmethod/SelectGesture;->getGranularity()I

    move-result v1

    invoke-direct {p0, v1}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->toTextGranularity-NUwxegE(I)I

    move-result v1

    .line 436
    sget-object v2, Landroidx/compose/ui/text/TextInclusionStrategy;->Companion:Landroidx/compose/ui/text/TextInclusionStrategy$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/text/TextInclusionStrategy$Companion;->getContainsCenter()Landroidx/compose/ui/text/TextInclusionStrategy;

    move-result-object v2

    .line 433
    invoke-static {p1, v0, v1, v2}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$getRangeForScreenRect-OH9lIzo(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J

    move-result-wide v0

    .line 438
    move-wide v2, v0

    .local v2, "$this$performSelectGesture_u24lambda_u2410":J
    const/4 v4, 0x0

    .line 439
    .local v4, "$i$a$-apply-HandwritingGestureApi34$performSelectGesture$range$1":I
    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v0, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->INSTANCE:Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;

    move-object v1, p2

    check-cast v1, Landroid/view/inputmethod/HandwritingGesture;

    invoke-direct {v0, v1, p4}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->fallbackOnLegacyTextField(Landroid/view/inputmethod/HandwritingGesture;Lkotlin/jvm/functions/Function1;)I

    move-result v0

    return v0

    .line 440
    :cond_0
    nop

    .line 438
    .end local v2    # "$this$performSelectGesture_u24lambda_u2410":J
    .end local v4    # "$i$a$-apply-HandwritingGestureApi34$performSelectGesture$range$1":I
    nop

    .line 432
    nop

    .line 442
    .local v0, "range":J
    invoke-direct {p0, v0, v1, p3, p4}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->performSelectionOnLegacyTextField-8ffj60Q(JLandroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function1;)V

    .line 443
    const/4 v2, 0x1

    return v2
.end method

.method private final performSelectGesture(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/SelectGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Lkotlin/jvm/functions/Function0;)I
    .locals 6
    .param p1, "$this$performSelectGesture"    # Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .param p2, "gesture"    # Landroid/view/inputmethod/SelectGesture;
    .param p3, "layoutState"    # Landroidx/compose/foundation/text/input/internal/TextLayoutState;
    .param p4, "updateSelectionState"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;",
            "Landroid/view/inputmethod/SelectGesture;",
            "Landroidx/compose/foundation/text/input/internal/TextLayoutState;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)I"
        }
    .end annotation

    .line 102
    nop

    .line 104
    invoke-virtual {p2}, Landroid/view/inputmethod/SelectGesture;->getSelectionArea()Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/ui/graphics/RectHelper_androidKt;->toComposeRect(Landroid/graphics/RectF;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v0

    .line 105
    invoke-virtual {p2}, Landroid/view/inputmethod/SelectGesture;->getGranularity()I

    move-result v1

    invoke-direct {p0, v1}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->toTextGranularity-NUwxegE(I)I

    move-result v1

    .line 106
    sget-object v2, Landroidx/compose/ui/text/TextInclusionStrategy;->Companion:Landroidx/compose/ui/text/TextInclusionStrategy$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/text/TextInclusionStrategy$Companion;->getContainsCenter()Landroidx/compose/ui/text/TextInclusionStrategy;

    move-result-object v2

    .line 103
    invoke-static {p3, v0, v1, v2}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$getRangeForScreenRect-OH9lIzo(Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J

    move-result-wide v0

    .line 108
    move-wide v2, v0

    .line 1103
    .local v2, "$this$performSelectGesture_u24lambda_u242":J
    const/4 v4, 0x0

    .line 108
    .local v4, "$i$a$-apply-HandwritingGestureApi34$performSelectGesture$rangeInTransformedText$1":I
    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v0, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->INSTANCE:Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;

    move-object v1, p2

    check-cast v1, Landroid/view/inputmethod/HandwritingGesture;

    invoke-direct {v0, p1, v1}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->fallback(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/HandwritingGesture;)I

    move-result v0

    return v0

    .line 101
    .end local v2    # "$this$performSelectGesture_u24lambda_u242":J
    .end local v4    # "$i$a$-apply-HandwritingGestureApi34$performSelectGesture$rangeInTransformedText$1":I
    :cond_0
    nop

    .line 110
    .local v0, "rangeInTransformedText":J
    invoke-virtual {p1, v0, v1}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->selectCharsIn-5zc-tL8(J)V

    .line 111
    if-eqz p4, :cond_1

    invoke-interface {p4}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 112
    :cond_1
    const/4 v2, 0x1

    return v2
.end method

.method private final performSelectRangeGesture(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/SelectRangeGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function1;)I
    .locals 6
    .param p1, "$this$performSelectRangeGesture"    # Landroidx/compose/foundation/text/LegacyTextFieldState;
    .param p2, "gesture"    # Landroid/view/inputmethod/SelectRangeGesture;
    .param p3, "textSelectionManager"    # Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .param p4, "editCommandConsumer"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text/LegacyTextFieldState;",
            "Landroid/view/inputmethod/SelectRangeGesture;",
            "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/input/EditCommand;",
            "Lkotlin/Unit;",
            ">;)I"
        }
    .end annotation

    .line 503
    nop

    .line 504
    invoke-virtual {p2}, Landroid/view/inputmethod/SelectRangeGesture;->getSelectionStartArea()Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/ui/graphics/RectHelper_androidKt;->toComposeRect(Landroid/graphics/RectF;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v0

    .line 505
    invoke-virtual {p2}, Landroid/view/inputmethod/SelectRangeGesture;->getSelectionEndArea()Landroid/graphics/RectF;

    move-result-object v1

    invoke-static {v1}, Landroidx/compose/ui/graphics/RectHelper_androidKt;->toComposeRect(Landroid/graphics/RectF;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v1

    .line 506
    invoke-virtual {p2}, Landroid/view/inputmethod/SelectRangeGesture;->getGranularity()I

    move-result v2

    invoke-direct {p0, v2}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->toTextGranularity-NUwxegE(I)I

    move-result v2

    .line 507
    sget-object v3, Landroidx/compose/ui/text/TextInclusionStrategy;->Companion:Landroidx/compose/ui/text/TextInclusionStrategy$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/text/TextInclusionStrategy$Companion;->getContainsCenter()Landroidx/compose/ui/text/TextInclusionStrategy;

    move-result-object v3

    .line 503
    invoke-static {p1, v0, v1, v2, v3}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$getRangeForScreenRects-O048IG0(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J

    move-result-wide v0

    .line 509
    move-wide v2, v0

    .local v2, "$this$performSelectRangeGesture_u24lambda_u2412":J
    const/4 v4, 0x0

    .line 510
    .local v4, "$i$a$-apply-HandwritingGestureApi34$performSelectRangeGesture$range$1":I
    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v0, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->INSTANCE:Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;

    move-object v1, p2

    check-cast v1, Landroid/view/inputmethod/HandwritingGesture;

    invoke-direct {v0, v1, p4}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->fallbackOnLegacyTextField(Landroid/view/inputmethod/HandwritingGesture;Lkotlin/jvm/functions/Function1;)I

    move-result v0

    return v0

    .line 511
    :cond_0
    nop

    .line 509
    .end local v2    # "$this$performSelectRangeGesture_u24lambda_u2412":J
    .end local v4    # "$i$a$-apply-HandwritingGestureApi34$performSelectRangeGesture$range$1":I
    nop

    .line 502
    nop

    .line 513
    .local v0, "range":J
    nop

    .line 514
    nop

    .line 515
    nop

    .line 516
    nop

    .line 513
    invoke-direct {p0, v0, v1, p3, p4}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->performSelectionOnLegacyTextField-8ffj60Q(JLandroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function1;)V

    .line 518
    const/4 v2, 0x1

    return v2
.end method

.method private final performSelectRangeGesture(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/SelectRangeGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Lkotlin/jvm/functions/Function0;)I
    .locals 6
    .param p1, "$this$performSelectRangeGesture"    # Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .param p2, "gesture"    # Landroid/view/inputmethod/SelectRangeGesture;
    .param p3, "layoutState"    # Landroidx/compose/foundation/text/input/internal/TextLayoutState;
    .param p4, "updateSelectionState"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;",
            "Landroid/view/inputmethod/SelectRangeGesture;",
            "Landroidx/compose/foundation/text/input/internal/TextLayoutState;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)I"
        }
    .end annotation

    .line 170
    nop

    .line 172
    invoke-virtual {p2}, Landroid/view/inputmethod/SelectRangeGesture;->getSelectionStartArea()Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/ui/graphics/RectHelper_androidKt;->toComposeRect(Landroid/graphics/RectF;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v0

    .line 173
    invoke-virtual {p2}, Landroid/view/inputmethod/SelectRangeGesture;->getSelectionEndArea()Landroid/graphics/RectF;

    move-result-object v1

    invoke-static {v1}, Landroidx/compose/ui/graphics/RectHelper_androidKt;->toComposeRect(Landroid/graphics/RectF;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v1

    .line 174
    invoke-virtual {p2}, Landroid/view/inputmethod/SelectRangeGesture;->getGranularity()I

    move-result v2

    invoke-direct {p0, v2}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->toTextGranularity-NUwxegE(I)I

    move-result v2

    .line 175
    sget-object v3, Landroidx/compose/ui/text/TextInclusionStrategy;->Companion:Landroidx/compose/ui/text/TextInclusionStrategy$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/text/TextInclusionStrategy$Companion;->getContainsCenter()Landroidx/compose/ui/text/TextInclusionStrategy;

    move-result-object v3

    .line 171
    invoke-static {p3, v0, v1, v2, v3}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$getRangeForScreenRects-O048IG0(Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J

    move-result-wide v0

    .line 177
    move-wide v2, v0

    .line 1103
    .local v2, "$this$performSelectRangeGesture_u24lambda_u244":J
    const/4 v4, 0x0

    .line 177
    .local v4, "$i$a$-apply-HandwritingGestureApi34$performSelectRangeGesture$rangeInTransformedText$1":I
    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v0, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->INSTANCE:Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;

    move-object v1, p2

    check-cast v1, Landroid/view/inputmethod/HandwritingGesture;

    invoke-direct {v0, p1, v1}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->fallback(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/HandwritingGesture;)I

    move-result v0

    return v0

    .line 169
    .end local v2    # "$this$performSelectRangeGesture_u24lambda_u244":J
    .end local v4    # "$i$a$-apply-HandwritingGestureApi34$performSelectRangeGesture$rangeInTransformedText$1":I
    :cond_0
    nop

    .line 179
    .local v0, "rangeInTransformedText":J
    invoke-virtual {p1, v0, v1}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->selectCharsIn-5zc-tL8(J)V

    .line 180
    if-eqz p4, :cond_1

    invoke-interface {p4}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 181
    :cond_1
    const/4 v2, 0x1

    return v2
.end method

.method private final performSelectionOnLegacyTextField-8ffj60Q(JLandroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .param p1, "range"    # J
    .param p3, "textSelectionManager"    # Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .param p4, "editCommandConsumer"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/input/EditCommand;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 704
    new-instance v0, Landroidx/compose/ui/text/input/SetSelectionCommand;

    invoke-static {p1, p2}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    move-result v1

    invoke-static {p1, p2}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroidx/compose/ui/text/input/SetSelectionCommand;-><init>(II)V

    invoke-interface {p4, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 705
    if-eqz p3, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->enterSelectionMode$foundation_release(Z)V

    .line 706
    :cond_0
    return-void
.end method

.method private final previewDeleteGesture(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/DeleteGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V
    .locals 3
    .param p1, "$this$previewDeleteGesture"    # Landroidx/compose/foundation/text/LegacyTextFieldState;
    .param p2, "gesture"    # Landroid/view/inputmethod/DeleteGesture;
    .param p3, "textFieldSelectionManager"    # Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;

    .line 488
    if-eqz p3, :cond_0

    .line 489
    nop

    .line 490
    invoke-virtual {p2}, Landroid/view/inputmethod/DeleteGesture;->getDeletionArea()Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/ui/graphics/RectHelper_androidKt;->toComposeRect(Landroid/graphics/RectF;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v0

    .line 491
    invoke-virtual {p2}, Landroid/view/inputmethod/DeleteGesture;->getGranularity()I

    move-result v1

    invoke-direct {p0, v1}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->toTextGranularity-NUwxegE(I)I

    move-result v1

    .line 492
    sget-object v2, Landroidx/compose/ui/text/TextInclusionStrategy;->Companion:Landroidx/compose/ui/text/TextInclusionStrategy$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/text/TextInclusionStrategy$Companion;->getContainsCenter()Landroidx/compose/ui/text/TextInclusionStrategy;

    move-result-object v2

    .line 489
    invoke-static {p1, v0, v1, v2}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$getRangeForScreenRect-OH9lIzo(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J

    move-result-wide v0

    .line 488
    invoke-virtual {p3, v0, v1}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->setDeletionPreviewHighlight-5zc-tL8$foundation_release(J)V

    .line 495
    :cond_0
    return-void
.end method

.method private final previewDeleteGesture(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/DeleteGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;)V
    .locals 3
    .param p1, "$this$previewDeleteGesture"    # Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .param p2, "gesture"    # Landroid/view/inputmethod/DeleteGesture;
    .param p3, "layoutState"    # Landroidx/compose/foundation/text/input/internal/TextLayoutState;

    .line 154
    nop

    .line 155
    nop

    .line 156
    invoke-virtual {p2}, Landroid/view/inputmethod/DeleteGesture;->getDeletionArea()Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/ui/graphics/RectHelper_androidKt;->toComposeRect(Landroid/graphics/RectF;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v0

    .line 157
    invoke-virtual {p2}, Landroid/view/inputmethod/DeleteGesture;->getGranularity()I

    move-result v1

    invoke-direct {p0, v1}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->toTextGranularity-NUwxegE(I)I

    move-result v1

    .line 158
    sget-object v2, Landroidx/compose/ui/text/TextInclusionStrategy;->Companion:Landroidx/compose/ui/text/TextInclusionStrategy$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/text/TextInclusionStrategy$Companion;->getContainsCenter()Landroidx/compose/ui/text/TextInclusionStrategy;

    move-result-object v2

    .line 155
    invoke-static {p3, v0, v1, v2}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$getRangeForScreenRect-OH9lIzo(Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J

    move-result-wide v0

    .line 160
    sget-object v2, Landroidx/compose/foundation/text/input/TextHighlightType;->Companion:Landroidx/compose/foundation/text/input/TextHighlightType$Companion;

    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/TextHighlightType$Companion;->getHandwritingDeletePreview-s-xJuwY()I

    move-result v2

    .line 154
    invoke-direct {p0, p1, v0, v1, v2}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->highlightRange-XJREzCE(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;JI)V

    .line 162
    return-void
.end method

.method private final previewDeleteRangeGesture(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/DeleteRangeGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V
    .locals 4
    .param p1, "$this$previewDeleteRangeGesture"    # Landroidx/compose/foundation/text/LegacyTextFieldState;
    .param p2, "gesture"    # Landroid/view/inputmethod/DeleteRangeGesture;
    .param p3, "textFieldSelectionManager"    # Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;

    .line 564
    if-eqz p3, :cond_0

    .line 565
    nop

    .line 566
    invoke-virtual {p2}, Landroid/view/inputmethod/DeleteRangeGesture;->getDeletionStartArea()Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/ui/graphics/RectHelper_androidKt;->toComposeRect(Landroid/graphics/RectF;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v0

    .line 567
    invoke-virtual {p2}, Landroid/view/inputmethod/DeleteRangeGesture;->getDeletionEndArea()Landroid/graphics/RectF;

    move-result-object v1

    invoke-static {v1}, Landroidx/compose/ui/graphics/RectHelper_androidKt;->toComposeRect(Landroid/graphics/RectF;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v1

    .line 568
    invoke-virtual {p2}, Landroid/view/inputmethod/DeleteRangeGesture;->getGranularity()I

    move-result v2

    invoke-direct {p0, v2}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->toTextGranularity-NUwxegE(I)I

    move-result v2

    .line 569
    sget-object v3, Landroidx/compose/ui/text/TextInclusionStrategy;->Companion:Landroidx/compose/ui/text/TextInclusionStrategy$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/text/TextInclusionStrategy$Companion;->getContainsCenter()Landroidx/compose/ui/text/TextInclusionStrategy;

    move-result-object v3

    .line 565
    invoke-static {p1, v0, v1, v2, v3}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$getRangeForScreenRects-O048IG0(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J

    move-result-wide v0

    .line 564
    invoke-virtual {p3, v0, v1}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->setDeletionPreviewHighlight-5zc-tL8$foundation_release(J)V

    .line 572
    :cond_0
    return-void
.end method

.method private final previewDeleteRangeGesture(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/DeleteRangeGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;)V
    .locals 4
    .param p1, "$this$previewDeleteRangeGesture"    # Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .param p2, "gesture"    # Landroid/view/inputmethod/DeleteRangeGesture;
    .param p3, "layoutState"    # Landroidx/compose/foundation/text/input/internal/TextLayoutState;

    .line 225
    nop

    .line 226
    nop

    .line 227
    invoke-virtual {p2}, Landroid/view/inputmethod/DeleteRangeGesture;->getDeletionStartArea()Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/ui/graphics/RectHelper_androidKt;->toComposeRect(Landroid/graphics/RectF;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v0

    .line 228
    invoke-virtual {p2}, Landroid/view/inputmethod/DeleteRangeGesture;->getDeletionEndArea()Landroid/graphics/RectF;

    move-result-object v1

    invoke-static {v1}, Landroidx/compose/ui/graphics/RectHelper_androidKt;->toComposeRect(Landroid/graphics/RectF;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v1

    .line 229
    invoke-virtual {p2}, Landroid/view/inputmethod/DeleteRangeGesture;->getGranularity()I

    move-result v2

    invoke-direct {p0, v2}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->toTextGranularity-NUwxegE(I)I

    move-result v2

    .line 230
    sget-object v3, Landroidx/compose/ui/text/TextInclusionStrategy;->Companion:Landroidx/compose/ui/text/TextInclusionStrategy$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/text/TextInclusionStrategy$Companion;->getContainsCenter()Landroidx/compose/ui/text/TextInclusionStrategy;

    move-result-object v3

    .line 226
    invoke-static {p3, v0, v1, v2, v3}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$getRangeForScreenRects-O048IG0(Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J

    move-result-wide v0

    .line 232
    sget-object v2, Landroidx/compose/foundation/text/input/TextHighlightType;->Companion:Landroidx/compose/foundation/text/input/TextHighlightType$Companion;

    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/TextHighlightType$Companion;->getHandwritingDeletePreview-s-xJuwY()I

    move-result v2

    .line 225
    invoke-direct {p0, p1, v0, v1, v2}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->highlightRange-XJREzCE(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;JI)V

    .line 234
    return-void
.end method

.method static final previewHandwritingGesture$lambda$1(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)V
    .locals 10
    .param p0, "$this_previewHandwritingGesture"    # Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    .line 92
    nop

    .line 1152
    nop

    .line 1153
    const/4 v0, 0x1

    .line 1152
    .local v0, "restartImeIfContentChanges$iv":Z
    const/4 v1, 0x0

    .line 1156
    .local v1, "$i$f$editUntransformedTextAsUser":I
    invoke-static {p0}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->access$getTextFieldState$p(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)Landroidx/compose/foundation/text/input/TextFieldState;

    move-result-object v2

    .line 1157
    invoke-static {p0}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->access$getInputTransformation$p(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)Landroidx/compose/foundation/text/input/InputTransformation;

    move-result-object v3

    .line 1156
    nop

    .line 1158
    .local v2, "$this$iv$iv":Landroidx/compose/foundation/text/input/TextFieldState;
    .local v3, "inputTransformation$iv$iv":Landroidx/compose/foundation/text/input/InputTransformation;
    nop

    .line 1161
    sget-object v4, Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;->MergeIfPossible:Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;

    .line 1158
    .local v4, "undoBehavior$iv$iv":Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;
    const/4 v5, 0x0

    .line 1164
    .local v5, "$i$f$editAsUser$foundation_release":I
    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text/input/TextFieldBuffer;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getChangeTracker$foundation_release()Landroidx/compose/foundation/text/input/internal/ChangeTracker;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/compose/foundation/text/input/internal/ChangeTracker;->clearChanges()V

    .line 1165
    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text/input/TextFieldBuffer;

    move-result-object v6

    .local v6, "$this$editUntransformedTextAsUser_u24lambda_u2411$iv":Landroidx/compose/foundation/text/input/TextFieldBuffer;
    const/4 v7, 0x0

    .line 1166
    .local v7, "$i$a$-editAsUser$foundation_release$default-TransformedTextFieldState$editUntransformedTextAsUser$1$iv":I
    move-object v8, v6

    .local v8, "$this$previewHandwritingGesture_u24lambda_u241_u24lambda_u240":Landroidx/compose/foundation/text/input/TextFieldBuffer;
    const/4 v9, 0x0

    .line 92
    .local v9, "$i$a$-editUntransformedTextAsUser$default-HandwritingGestureApi34$previewHandwritingGesture$1$1":I
    invoke-virtual {v8}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->clearHighlight$foundation_release()V

    .line 1166
    .end local v8    # "$this$previewHandwritingGesture_u24lambda_u241_u24lambda_u240":Landroidx/compose/foundation/text/input/TextFieldBuffer;
    .end local v9    # "$i$a$-editUntransformedTextAsUser$default-HandwritingGestureApi34$previewHandwritingGesture$1$1":I
    nop

    .line 1167
    invoke-static {p0, v6}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->access$updateWedgeAffinity(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/TextFieldBuffer;)V

    .line 1168
    nop

    .line 1165
    .end local v6    # "$this$editUntransformedTextAsUser_u24lambda_u2411$iv":Landroidx/compose/foundation/text/input/TextFieldBuffer;
    .end local v7    # "$i$a$-editAsUser$foundation_release$default-TransformedTextFieldState$editUntransformedTextAsUser$1$iv":I
    nop

    .line 1169
    nop

    .line 1170
    nop

    .line 1171
    nop

    .line 1172
    nop

    .line 1169
    invoke-static {v2, v3, v0, v4}, Landroidx/compose/foundation/text/input/TextFieldState;->access$commitEditAsUser(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/foundation/text/input/InputTransformation;ZLandroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;)V

    .line 1174
    nop

    .line 1175
    .end local v2    # "$this$iv$iv":Landroidx/compose/foundation/text/input/TextFieldState;
    .end local v3    # "inputTransformation$iv$iv":Landroidx/compose/foundation/text/input/InputTransformation;
    .end local v4    # "undoBehavior$iv$iv":Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;
    .end local v5    # "$i$f$editAsUser$foundation_release":I
    nop

    .line 92
    .end local v0    # "restartImeIfContentChanges$iv":Z
    .end local v1    # "$i$f$editUntransformedTextAsUser":I
    return-void
.end method

.method static final previewHandwritingGesture$lambda$9(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V
    .locals 0
    .param p0, "$textFieldSelectionManager"    # Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;

    .line 422
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->clearPreviewHighlight$foundation_release()V

    .line 423
    :cond_0
    return-void
.end method

.method private final previewSelectGesture(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/SelectGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V
    .locals 3
    .param p1, "$this$previewSelectGesture"    # Landroidx/compose/foundation/text/LegacyTextFieldState;
    .param p2, "gesture"    # Landroid/view/inputmethod/SelectGesture;
    .param p3, "textFieldSelectionManager"    # Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;

    .line 450
    if-eqz p3, :cond_0

    .line 451
    nop

    .line 452
    invoke-virtual {p2}, Landroid/view/inputmethod/SelectGesture;->getSelectionArea()Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/ui/graphics/RectHelper_androidKt;->toComposeRect(Landroid/graphics/RectF;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v0

    .line 453
    invoke-virtual {p2}, Landroid/view/inputmethod/SelectGesture;->getGranularity()I

    move-result v1

    invoke-direct {p0, v1}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->toTextGranularity-NUwxegE(I)I

    move-result v1

    .line 454
    sget-object v2, Landroidx/compose/ui/text/TextInclusionStrategy;->Companion:Landroidx/compose/ui/text/TextInclusionStrategy$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/text/TextInclusionStrategy$Companion;->getContainsCenter()Landroidx/compose/ui/text/TextInclusionStrategy;

    move-result-object v2

    .line 451
    invoke-static {p1, v0, v1, v2}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$getRangeForScreenRect-OH9lIzo(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J

    move-result-wide v0

    .line 450
    invoke-virtual {p3, v0, v1}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->setSelectionPreviewHighlight-5zc-tL8$foundation_release(J)V

    .line 457
    :cond_0
    return-void
.end method

.method private final previewSelectGesture(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/SelectGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;)V
    .locals 3
    .param p1, "$this$previewSelectGesture"    # Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .param p2, "gesture"    # Landroid/view/inputmethod/SelectGesture;
    .param p3, "layoutState"    # Landroidx/compose/foundation/text/input/internal/TextLayoutState;

    .line 119
    nop

    .line 120
    nop

    .line 121
    invoke-virtual {p2}, Landroid/view/inputmethod/SelectGesture;->getSelectionArea()Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/ui/graphics/RectHelper_androidKt;->toComposeRect(Landroid/graphics/RectF;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v0

    .line 122
    invoke-virtual {p2}, Landroid/view/inputmethod/SelectGesture;->getGranularity()I

    move-result v1

    invoke-direct {p0, v1}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->toTextGranularity-NUwxegE(I)I

    move-result v1

    .line 123
    sget-object v2, Landroidx/compose/ui/text/TextInclusionStrategy;->Companion:Landroidx/compose/ui/text/TextInclusionStrategy$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/text/TextInclusionStrategy$Companion;->getContainsCenter()Landroidx/compose/ui/text/TextInclusionStrategy;

    move-result-object v2

    .line 120
    invoke-static {p3, v0, v1, v2}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$getRangeForScreenRect-OH9lIzo(Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J

    move-result-wide v0

    .line 125
    sget-object v2, Landroidx/compose/foundation/text/input/TextHighlightType;->Companion:Landroidx/compose/foundation/text/input/TextHighlightType$Companion;

    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/TextHighlightType$Companion;->getHandwritingSelectPreview-s-xJuwY()I

    move-result v2

    .line 119
    invoke-direct {p0, p1, v0, v1, v2}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->highlightRange-XJREzCE(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;JI)V

    .line 127
    return-void
.end method

.method private final previewSelectRangeGesture(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/SelectRangeGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V
    .locals 4
    .param p1, "$this$previewSelectRangeGesture"    # Landroidx/compose/foundation/text/LegacyTextFieldState;
    .param p2, "gesture"    # Landroid/view/inputmethod/SelectRangeGesture;
    .param p3, "textFieldSelectionManager"    # Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;

    .line 525
    if-eqz p3, :cond_0

    .line 526
    nop

    .line 527
    invoke-virtual {p2}, Landroid/view/inputmethod/SelectRangeGesture;->getSelectionStartArea()Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/ui/graphics/RectHelper_androidKt;->toComposeRect(Landroid/graphics/RectF;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v0

    .line 528
    invoke-virtual {p2}, Landroid/view/inputmethod/SelectRangeGesture;->getSelectionEndArea()Landroid/graphics/RectF;

    move-result-object v1

    invoke-static {v1}, Landroidx/compose/ui/graphics/RectHelper_androidKt;->toComposeRect(Landroid/graphics/RectF;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v1

    .line 529
    invoke-virtual {p2}, Landroid/view/inputmethod/SelectRangeGesture;->getGranularity()I

    move-result v2

    invoke-direct {p0, v2}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->toTextGranularity-NUwxegE(I)I

    move-result v2

    .line 530
    sget-object v3, Landroidx/compose/ui/text/TextInclusionStrategy;->Companion:Landroidx/compose/ui/text/TextInclusionStrategy$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/text/TextInclusionStrategy$Companion;->getContainsCenter()Landroidx/compose/ui/text/TextInclusionStrategy;

    move-result-object v3

    .line 526
    invoke-static {p1, v0, v1, v2, v3}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$getRangeForScreenRects-O048IG0(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J

    move-result-wide v0

    .line 525
    invoke-virtual {p3, v0, v1}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->setSelectionPreviewHighlight-5zc-tL8$foundation_release(J)V

    .line 533
    :cond_0
    return-void
.end method

.method private final previewSelectRangeGesture(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/SelectRangeGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;)V
    .locals 4
    .param p1, "$this$previewSelectRangeGesture"    # Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .param p2, "gesture"    # Landroid/view/inputmethod/SelectRangeGesture;
    .param p3, "layoutState"    # Landroidx/compose/foundation/text/input/internal/TextLayoutState;

    .line 188
    nop

    .line 189
    nop

    .line 190
    invoke-virtual {p2}, Landroid/view/inputmethod/SelectRangeGesture;->getSelectionStartArea()Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/ui/graphics/RectHelper_androidKt;->toComposeRect(Landroid/graphics/RectF;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v0

    .line 191
    invoke-virtual {p2}, Landroid/view/inputmethod/SelectRangeGesture;->getSelectionEndArea()Landroid/graphics/RectF;

    move-result-object v1

    invoke-static {v1}, Landroidx/compose/ui/graphics/RectHelper_androidKt;->toComposeRect(Landroid/graphics/RectF;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v1

    .line 192
    invoke-virtual {p2}, Landroid/view/inputmethod/SelectRangeGesture;->getGranularity()I

    move-result v2

    invoke-direct {p0, v2}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->toTextGranularity-NUwxegE(I)I

    move-result v2

    .line 193
    sget-object v3, Landroidx/compose/ui/text/TextInclusionStrategy;->Companion:Landroidx/compose/ui/text/TextInclusionStrategy$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/text/TextInclusionStrategy$Companion;->getContainsCenter()Landroidx/compose/ui/text/TextInclusionStrategy;

    move-result-object v3

    .line 189
    invoke-static {p3, v0, v1, v2, v3}, Landroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt;->access$getRangeForScreenRects-O048IG0(Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J

    move-result-wide v0

    .line 195
    sget-object v2, Landroidx/compose/foundation/text/input/TextHighlightType;->Companion:Landroidx/compose/foundation/text/input/TextHighlightType$Companion;

    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/TextHighlightType$Companion;->getHandwritingSelectPreview-s-xJuwY()I

    move-result v2

    .line 188
    invoke-direct {p0, p1, v0, v1, v2}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->highlightRange-XJREzCE(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;JI)V

    .line 197
    return-void
.end method

.method private final toTextGranularity-NUwxegE(I)I
    .locals 1
    .param p1, "$this$toTextGranularity_u2dNUwxegE"    # I

    .line 744
    packed-switch p1, :pswitch_data_0

    .line 747
    sget-object v0, Landroidx/compose/ui/text/TextGranularity;->Companion:Landroidx/compose/ui/text/TextGranularity$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/TextGranularity$Companion;->getCharacter-DRrd7Zo()I

    move-result v0

    goto :goto_0

    .line 745
    :pswitch_0
    sget-object v0, Landroidx/compose/ui/text/TextGranularity;->Companion:Landroidx/compose/ui/text/TextGranularity$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/TextGranularity$Companion;->getCharacter-DRrd7Zo()I

    move-result v0

    goto :goto_0

    .line 746
    :pswitch_1
    sget-object v0, Landroidx/compose/ui/text/TextGranularity;->Companion:Landroidx/compose/ui/text/TextGranularity$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/TextGranularity$Companion;->getWord-DRrd7Zo()I

    move-result v0

    .line 744
    :goto_0
    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final performHandwritingGesture$foundation_release(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/HandwritingGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/platform/ViewConfiguration;Lkotlin/jvm/functions/Function1;)I
    .locals 8
    .param p1, "$this$performHandwritingGesture"    # Landroidx/compose/foundation/text/LegacyTextFieldState;
    .param p2, "gesture"    # Landroid/view/inputmethod/HandwritingGesture;
    .param p3, "textFieldSelectionManager"    # Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .param p4, "viewConfiguration"    # Landroidx/compose/ui/platform/ViewConfiguration;
    .param p5, "editCommandConsumer"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text/LegacyTextFieldState;",
            "Landroid/view/inputmethod/HandwritingGesture;",
            "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;",
            "Landroidx/compose/ui/platform/ViewConfiguration;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/input/EditCommand;",
            "Lkotlin/Unit;",
            ">;)I"
        }
    .end annotation

    .line 382
    invoke-virtual {p1}, Landroidx/compose/foundation/text/LegacyTextFieldState;->getUntransformedText()Landroidx/compose/ui/text/AnnotatedString;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_0

    return v1

    :cond_0
    move-object v5, v0

    .line 383
    .local v5, "text":Landroidx/compose/ui/text/AnnotatedString;
    invoke-virtual {p1}, Landroidx/compose/foundation/text/LegacyTextFieldState;->getLayoutResult()Landroidx/compose/foundation/text/TextLayoutResultProxy;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/compose/foundation/text/TextLayoutResultProxy;->getValue()Landroidx/compose/ui/text/TextLayoutResult;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/compose/ui/text/TextLayoutResult;->getLayoutInput()Landroidx/compose/ui/text/TextLayoutInput;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/compose/ui/text/TextLayoutInput;->getText()Landroidx/compose/ui/text/AnnotatedString;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 385
    return v1

    .line 387
    :cond_2
    nop

    .line 388
    instance-of v0, p2, Landroid/view/inputmethod/SelectGesture;

    if-eqz v0, :cond_3

    .line 389
    move-object v0, p2

    check-cast v0, Landroid/view/inputmethod/SelectGesture;

    invoke-direct {p0, p1, v0, p3, p5}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->performSelectGesture(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/SelectGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function1;)I

    move-result v0

    move-object v3, p1

    move-object v6, p4

    move-object v7, p5

    goto/16 :goto_1

    .line 390
    :cond_3
    instance-of v0, p2, Landroid/view/inputmethod/DeleteGesture;

    if-eqz v0, :cond_4

    move-object v0, p2

    check-cast v0, Landroid/view/inputmethod/DeleteGesture;

    invoke-direct {p0, p1, v0, v5, p5}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->performDeleteGesture(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/DeleteGesture;Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;)I

    move-result v0

    move-object v3, p1

    move-object v6, p4

    move-object v7, p5

    goto :goto_1

    .line 391
    :cond_4
    instance-of v0, p2, Landroid/view/inputmethod/SelectRangeGesture;

    if-eqz v0, :cond_5

    .line 392
    move-object v0, p2

    check-cast v0, Landroid/view/inputmethod/SelectRangeGesture;

    invoke-direct {p0, p1, v0, p3, p5}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->performSelectRangeGesture(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/SelectRangeGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function1;)I

    move-result v0

    move-object v3, p1

    move-object v6, p4

    move-object v7, p5

    goto :goto_1

    .line 393
    :cond_5
    instance-of v0, p2, Landroid/view/inputmethod/DeleteRangeGesture;

    if-eqz v0, :cond_6

    move-object v0, p2

    check-cast v0, Landroid/view/inputmethod/DeleteRangeGesture;

    invoke-direct {p0, p1, v0, v5, p5}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->performDeleteRangeGesture(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/DeleteRangeGesture;Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;)I

    move-result v0

    move-object v3, p1

    move-object v6, p4

    move-object v7, p5

    goto :goto_1

    .line 394
    :cond_6
    instance-of v0, p2, Landroid/view/inputmethod/JoinOrSplitGesture;

    if-eqz v0, :cond_7

    .line 395
    move-object v4, p2

    check-cast v4, Landroid/view/inputmethod/JoinOrSplitGesture;

    move-object v2, p0

    move-object v3, p1

    move-object v6, p4

    move-object v7, p5

    .end local p1    # "$this$performHandwritingGesture":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .end local p4    # "viewConfiguration":Landroidx/compose/ui/platform/ViewConfiguration;
    .end local p5    # "editCommandConsumer":Lkotlin/jvm/functions/Function1;
    .local v3, "$this$performHandwritingGesture":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .local v6, "viewConfiguration":Landroidx/compose/ui/platform/ViewConfiguration;
    .local v7, "editCommandConsumer":Lkotlin/jvm/functions/Function1;
    invoke-direct/range {v2 .. v7}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->performJoinOrSplitGesture(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/JoinOrSplitGesture;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/platform/ViewConfiguration;Lkotlin/jvm/functions/Function1;)I

    move-result v0

    goto :goto_1

    .line 396
    .end local v3    # "$this$performHandwritingGesture":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .end local v6    # "viewConfiguration":Landroidx/compose/ui/platform/ViewConfiguration;
    .end local v7    # "editCommandConsumer":Lkotlin/jvm/functions/Function1;
    .restart local p1    # "$this$performHandwritingGesture":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .restart local p4    # "viewConfiguration":Landroidx/compose/ui/platform/ViewConfiguration;
    .restart local p5    # "editCommandConsumer":Lkotlin/jvm/functions/Function1;
    :cond_7
    move-object v3, p1

    move-object v6, p4

    move-object v7, p5

    .end local p1    # "$this$performHandwritingGesture":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .end local p4    # "viewConfiguration":Landroidx/compose/ui/platform/ViewConfiguration;
    .end local p5    # "editCommandConsumer":Lkotlin/jvm/functions/Function1;
    .restart local v3    # "$this$performHandwritingGesture":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .restart local v6    # "viewConfiguration":Landroidx/compose/ui/platform/ViewConfiguration;
    .restart local v7    # "editCommandConsumer":Lkotlin/jvm/functions/Function1;
    instance-of p1, p2, Landroid/view/inputmethod/InsertGesture;

    if-eqz p1, :cond_8

    .line 397
    move-object p1, p2

    check-cast p1, Landroid/view/inputmethod/InsertGesture;

    invoke-direct {p0, v3, p1, v6, v7}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->performInsertGesture(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/InsertGesture;Landroidx/compose/ui/platform/ViewConfiguration;Lkotlin/jvm/functions/Function1;)I

    move-result v0

    goto :goto_1

    .line 398
    :cond_8
    instance-of p1, p2, Landroid/view/inputmethod/RemoveSpaceGesture;

    if-eqz p1, :cond_9

    .line 399
    move-object v4, p2

    check-cast v4, Landroid/view/inputmethod/RemoveSpaceGesture;

    move-object v2, p0

    invoke-direct/range {v2 .. v7}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->performRemoveSpaceGesture(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/RemoveSpaceGesture;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/platform/ViewConfiguration;Lkotlin/jvm/functions/Function1;)I

    move-result v0

    goto :goto_1

    .line 400
    :cond_9
    const/4 v0, 0x2

    .line 387
    :goto_1
    return v0
.end method

.method public final performHandwritingGesture$foundation_release(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/HandwritingGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/platform/ViewConfiguration;)I
    .locals 1
    .param p1, "$this$performHandwritingGesture"    # Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .param p2, "handwritingGesture"    # Landroid/view/inputmethod/HandwritingGesture;
    .param p3, "layoutState"    # Landroidx/compose/foundation/text/input/internal/TextLayoutState;
    .param p4, "updateSelectionState"    # Lkotlin/jvm/functions/Function0;
    .param p5, "viewConfiguration"    # Landroidx/compose/ui/platform/ViewConfiguration;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;",
            "Landroid/view/inputmethod/HandwritingGesture;",
            "Landroidx/compose/foundation/text/input/internal/TextLayoutState;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/platform/ViewConfiguration;",
            ")I"
        }
    .end annotation

    .line 63
    nop

    .line 64
    instance-of v0, p2, Landroid/view/inputmethod/SelectGesture;

    if-eqz v0, :cond_0

    .line 65
    move-object v0, p2

    check-cast v0, Landroid/view/inputmethod/SelectGesture;

    invoke-direct {p0, p1, v0, p3, p4}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->performSelectGesture(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/SelectGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Lkotlin/jvm/functions/Function0;)I

    move-result v0

    goto :goto_0

    .line 66
    :cond_0
    instance-of v0, p2, Landroid/view/inputmethod/DeleteGesture;

    if-eqz v0, :cond_1

    move-object v0, p2

    check-cast v0, Landroid/view/inputmethod/DeleteGesture;

    invoke-direct {p0, p1, v0, p3}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->performDeleteGesture(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/DeleteGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;)I

    move-result v0

    goto :goto_0

    .line 67
    :cond_1
    instance-of v0, p2, Landroid/view/inputmethod/SelectRangeGesture;

    if-eqz v0, :cond_2

    .line 68
    move-object v0, p2

    check-cast v0, Landroid/view/inputmethod/SelectRangeGesture;

    invoke-direct {p0, p1, v0, p3, p4}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->performSelectRangeGesture(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/SelectRangeGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Lkotlin/jvm/functions/Function0;)I

    move-result v0

    goto :goto_0

    .line 69
    :cond_2
    instance-of v0, p2, Landroid/view/inputmethod/DeleteRangeGesture;

    if-eqz v0, :cond_3

    move-object v0, p2

    check-cast v0, Landroid/view/inputmethod/DeleteRangeGesture;

    invoke-direct {p0, p1, v0, p3}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->performDeleteRangeGesture(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/DeleteRangeGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;)I

    move-result v0

    goto :goto_0

    .line 70
    :cond_3
    instance-of v0, p2, Landroid/view/inputmethod/JoinOrSplitGesture;

    if-eqz v0, :cond_4

    .line 71
    move-object v0, p2

    check-cast v0, Landroid/view/inputmethod/JoinOrSplitGesture;

    invoke-direct {p0, p1, v0, p3, p5}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->performJoinOrSplitGesture(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/JoinOrSplitGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/platform/ViewConfiguration;)I

    move-result v0

    goto :goto_0

    .line 72
    :cond_4
    instance-of v0, p2, Landroid/view/inputmethod/InsertGesture;

    if-eqz v0, :cond_5

    .line 73
    move-object v0, p2

    check-cast v0, Landroid/view/inputmethod/InsertGesture;

    invoke-direct {p0, p1, v0, p3, p5}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->performInsertGesture(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/InsertGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/platform/ViewConfiguration;)I

    move-result v0

    goto :goto_0

    .line 74
    :cond_5
    instance-of v0, p2, Landroid/view/inputmethod/RemoveSpaceGesture;

    if-eqz v0, :cond_6

    .line 75
    move-object v0, p2

    check-cast v0, Landroid/view/inputmethod/RemoveSpaceGesture;

    invoke-direct {p0, p1, v0, p3, p5}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->performRemoveSpaceGesture(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/RemoveSpaceGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/platform/ViewConfiguration;)I

    move-result v0

    goto :goto_0

    .line 76
    :cond_6
    const/4 v0, 0x2

    .line 63
    :goto_0
    return v0
.end method

.method public final previewHandwritingGesture$foundation_release(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroid/os/CancellationSignal;)Z
    .locals 3
    .param p1, "$this$previewHandwritingGesture"    # Landroidx/compose/foundation/text/LegacyTextFieldState;
    .param p2, "gesture"    # Landroid/view/inputmethod/PreviewableHandwritingGesture;
    .param p3, "textFieldSelectionManager"    # Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .param p4, "cancellationSignal"    # Landroid/os/CancellationSignal;

    .line 409
    invoke-virtual {p1}, Landroidx/compose/foundation/text/LegacyTextFieldState;->getUntransformedText()Landroidx/compose/ui/text/AnnotatedString;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 410
    .local v0, "text":Landroidx/compose/ui/text/AnnotatedString;
    :cond_0
    invoke-virtual {p1}, Landroidx/compose/foundation/text/LegacyTextFieldState;->getLayoutResult()Landroidx/compose/foundation/text/TextLayoutResultProxy;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroidx/compose/foundation/text/TextLayoutResultProxy;->getValue()Landroidx/compose/ui/text/TextLayoutResult;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroidx/compose/ui/text/TextLayoutResult;->getLayoutInput()Landroidx/compose/ui/text/TextLayoutInput;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroidx/compose/ui/text/TextLayoutInput;->getText()Landroidx/compose/ui/text/AnnotatedString;

    move-result-object v2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 412
    return v1

    .line 414
    :cond_2
    nop

    .line 415
    instance-of v2, p2, Landroid/view/inputmethod/SelectGesture;

    if-eqz v2, :cond_3

    move-object v1, p2

    check-cast v1, Landroid/view/inputmethod/SelectGesture;

    invoke-direct {p0, p1, v1, p3}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->previewSelectGesture(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/SelectGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V

    goto :goto_1

    .line 416
    :cond_3
    instance-of v2, p2, Landroid/view/inputmethod/DeleteGesture;

    if-eqz v2, :cond_4

    move-object v1, p2

    check-cast v1, Landroid/view/inputmethod/DeleteGesture;

    invoke-direct {p0, p1, v1, p3}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->previewDeleteGesture(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/DeleteGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V

    goto :goto_1

    .line 417
    :cond_4
    instance-of v2, p2, Landroid/view/inputmethod/SelectRangeGesture;

    if-eqz v2, :cond_5

    move-object v1, p2

    check-cast v1, Landroid/view/inputmethod/SelectRangeGesture;

    invoke-direct {p0, p1, v1, p3}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->previewSelectRangeGesture(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/SelectRangeGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V

    goto :goto_1

    .line 418
    :cond_5
    instance-of v2, p2, Landroid/view/inputmethod/DeleteRangeGesture;

    if-eqz v2, :cond_7

    move-object v1, p2

    check-cast v1, Landroid/view/inputmethod/DeleteRangeGesture;

    invoke-direct {p0, p1, v1, p3}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->previewDeleteRangeGesture(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/DeleteRangeGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V

    .line 421
    :goto_1
    if-eqz p4, :cond_6

    new-instance v1, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34$$ExternalSyntheticLambda0;

    invoke-direct {v1, p3}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34$$ExternalSyntheticLambda0;-><init>(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V

    invoke-virtual {p4, v1}, Landroid/os/CancellationSignal;->setOnCancelListener(Landroid/os/CancellationSignal$OnCancelListener;)V

    .line 424
    :cond_6
    const/4 v1, 0x1

    return v1

    .line 419
    :cond_7
    return v1
.end method

.method public final previewHandwritingGesture$foundation_release(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroid/os/CancellationSignal;)Z
    .locals 1
    .param p1, "$this$previewHandwritingGesture"    # Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .param p2, "handwritingGesture"    # Landroid/view/inputmethod/PreviewableHandwritingGesture;
    .param p3, "layoutState"    # Landroidx/compose/foundation/text/input/internal/TextLayoutState;
    .param p4, "cancellationSignal"    # Landroid/os/CancellationSignal;

    .line 85
    nop

    .line 86
    instance-of v0, p2, Landroid/view/inputmethod/SelectGesture;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Landroid/view/inputmethod/SelectGesture;

    invoke-direct {p0, p1, v0, p3}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->previewSelectGesture(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/SelectGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;)V

    goto :goto_0

    .line 87
    :cond_0
    instance-of v0, p2, Landroid/view/inputmethod/DeleteGesture;

    if-eqz v0, :cond_1

    move-object v0, p2

    check-cast v0, Landroid/view/inputmethod/DeleteGesture;

    invoke-direct {p0, p1, v0, p3}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->previewDeleteGesture(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/DeleteGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;)V

    goto :goto_0

    .line 88
    :cond_1
    instance-of v0, p2, Landroid/view/inputmethod/SelectRangeGesture;

    if-eqz v0, :cond_2

    move-object v0, p2

    check-cast v0, Landroid/view/inputmethod/SelectRangeGesture;

    invoke-direct {p0, p1, v0, p3}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->previewSelectRangeGesture(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/SelectRangeGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;)V

    goto :goto_0

    .line 89
    :cond_2
    instance-of v0, p2, Landroid/view/inputmethod/DeleteRangeGesture;

    if-eqz v0, :cond_4

    move-object v0, p2

    check-cast v0, Landroid/view/inputmethod/DeleteRangeGesture;

    invoke-direct {p0, p1, v0, p3}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->previewDeleteRangeGesture(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/DeleteRangeGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;)V

    .line 92
    :goto_0
    if-eqz p4, :cond_3

    new-instance v0, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34$$ExternalSyntheticLambda1;

    invoke-direct {v0, p1}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34$$ExternalSyntheticLambda1;-><init>(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)V

    invoke-virtual {p4, v0}, Landroid/os/CancellationSignal;->setOnCancelListener(Landroid/os/CancellationSignal$OnCancelListener;)V

    .line 93
    :cond_3
    const/4 v0, 0x1

    return v0

    .line 90
    :cond_4
    const/4 v0, 0x0

    return v0
.end method
