.class public final Landroidx/compose/foundation/text/input/internal/undo/UndoManager;
.super Ljava/lang/Object;
.source "UndoManager.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/text/input/internal/undo/UndoManager$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nUndoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UndoManager.kt\nandroidx/compose/foundation/text/input/internal/undo/UndoManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,162:1\n1#2:163\n96#3,5:164\n96#3,5:169\n50#3,5:174\n50#3,5:179\n*S KotlinDebug\n*F\n+ 1 UndoManager.kt\nandroidx/compose/foundation/text/input/internal/undo/UndoManager\n*L\n55#1:164,5\n56#1:169,5\n78#1:174,5\n96#1:179,5\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u0000 \u001d*\u0004\u0008\u0000\u0010\u00012\u00020\u0002:\u0001\u001dB/\u0012\u000e\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0019J\u000b\u0010\u001a\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u001bJ\u000b\u0010\u001c\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u001bR\u0014\u0010\t\u001a\u00020\n8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\r\u001a\u00020\n8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000cR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"
    }
    d2 = {
        "Landroidx/compose/foundation/text/input/internal/undo/UndoManager;",
        "T",
        "",
        "initialUndoStack",
        "",
        "initialRedoStack",
        "capacity",
        "",
        "(Ljava/util/List;Ljava/util/List;I)V",
        "canRedo",
        "",
        "getCanRedo$foundation_release",
        "()Z",
        "canUndo",
        "getCanUndo$foundation_release",
        "redoStack",
        "Landroidx/compose/runtime/snapshots/SnapshotStateList;",
        "size",
        "getSize",
        "()I",
        "undoStack",
        "clearHistory",
        "",
        "record",
        "undoableAction",
        "(Ljava/lang/Object;)V",
        "redo",
        "()Ljava/lang/Object;",
        "undo",
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

.field public static final Companion:Landroidx/compose/foundation/text/input/internal/undo/UndoManager$Companion;


# instance fields
.field private final capacity:I

.field private redoStack:Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "TT;>;"
        }
    .end annotation
.end field

.field private undoStack:Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/foundation/text/input/internal/undo/UndoManager$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/foundation/text/input/internal/undo/UndoManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/compose/foundation/text/input/internal/undo/UndoManager;->Companion:Landroidx/compose/foundation/text/input/internal/undo/UndoManager$Companion;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/foundation/text/input/internal/undo/UndoManager;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/text/input/internal/undo/UndoManager;-><init>(Ljava/util/List;Ljava/util/List;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/List;I)V
    .locals 5
    .param p1, "initialUndoStack"    # Ljava/util/List;
    .param p2, "initialRedoStack"    # Ljava/util/List;
    .param p3, "capacity"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TT;>;",
            "Ljava/util/List<",
            "+TT;>;I)V"
        }
    .end annotation

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput p3, p0, Landroidx/compose/foundation/text/input/internal/undo/UndoManager;->capacity:I

    .line 42
    new-instance v0, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-direct {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;-><init>()V

    .line 163
    move-object v1, v0

    .local v1, "$this$undoStack_u24lambda_u240":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v2, 0x0

    .line 42
    .local v2, "$i$a$-apply-UndoManager$undoStack$1":I
    move-object v3, p1

    check-cast v3, Ljava/util/Collection;

    invoke-virtual {v1, v3}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->addAll(Ljava/util/Collection;)Z

    .end local v1    # "$this$undoStack_u24lambda_u240":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v2    # "$i$a$-apply-UndoManager$undoStack$1":I
    iput-object v0, p0, Landroidx/compose/foundation/text/input/internal/undo/UndoManager;->undoStack:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 43
    new-instance v0, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-direct {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;-><init>()V

    .line 163
    move-object v1, v0

    .local v1, "$this$redoStack_u24lambda_u241":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v2, 0x0

    .line 43
    .local v2, "$i$a$-apply-UndoManager$redoStack$1":I
    move-object v3, p2

    check-cast v3, Ljava/util/Collection;

    invoke-virtual {v1, v3}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->addAll(Ljava/util/Collection;)Z

    .end local v1    # "$this$redoStack_u24lambda_u241":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v2    # "$i$a$-apply-UndoManager$redoStack$1":I
    iput-object v0, p0, Landroidx/compose/foundation/text/input/internal/undo/UndoManager;->redoStack:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 54
    nop

    .line 55
    iget v0, p0, Landroidx/compose/foundation/text/input/internal/undo/UndoManager;->capacity:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ltz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    .local v0, "value$iv":Z
    :goto_0
    const/4 v3, 0x0

    .line 164
    .local v3, "$i$f$requirePrecondition":I
    nop

    .line 165
    if-nez v0, :cond_1

    .line 166
    const/4 v4, 0x0

    .line 55
    .local v4, "$i$a$-requirePrecondition-UndoManager$1":I
    nop

    .line 166
    .end local v4    # "$i$a$-requirePrecondition-UndoManager$1":I
    const-string v4, "Capacity must be a positive integer"

    invoke-static {v4}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 168
    :cond_1
    nop

    .line 56
    .end local v0    # "value$iv":Z
    .end local v3    # "$i$f$requirePrecondition":I
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/internal/undo/UndoManager;->getSize()I

    move-result v0

    iget v3, p0, Landroidx/compose/foundation/text/input/internal/undo/UndoManager;->capacity:I

    if-gt v0, v3, :cond_2

    goto :goto_1

    :cond_2
    move v1, v2

    .local v1, "value$iv":Z
    :goto_1
    const/4 v0, 0x0

    .line 169
    .local v0, "$i$f$requirePrecondition":I
    nop

    .line 170
    if-nez v1, :cond_3

    .line 171
    const/4 v2, 0x0

    .line 57
    .local v2, "$i$a$-requirePrecondition-UndoManager$2":I
    nop

    .line 171
    .end local v2    # "$i$a$-requirePrecondition-UndoManager$2":I
    const-string v2, "Initial list of undo and redo operations have a size greater than the given capacity."

    invoke-static {v2}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 173
    :cond_3
    nop

    .line 59
    .end local v0    # "$i$f$requirePrecondition":I
    .end local v1    # "value$iv":Z
    nop

    .line 36
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 36
    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 37
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    .line 36
    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    .line 38
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p2

    .line 36
    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    .line 39
    const/16 p3, 0x64

    .line 36
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/foundation/text/input/internal/undo/UndoManager;-><init>(Ljava/util/List;Ljava/util/List;I)V

    .line 40
    return-void
.end method

.method public static final synthetic access$getCapacity$p(Landroidx/compose/foundation/text/input/internal/undo/UndoManager;)I
    .locals 1
    .param p0, "$this"    # Landroidx/compose/foundation/text/input/internal/undo/UndoManager;

    .line 36
    iget v0, p0, Landroidx/compose/foundation/text/input/internal/undo/UndoManager;->capacity:I

    return v0
.end method

.method public static final synthetic access$getRedoStack$p(Landroidx/compose/foundation/text/input/internal/undo/UndoManager;)Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/foundation/text/input/internal/undo/UndoManager;

    .line 36
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/undo/UndoManager;->redoStack:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    return-object v0
.end method

.method public static final synthetic access$getUndoStack$p(Landroidx/compose/foundation/text/input/internal/undo/UndoManager;)Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/foundation/text/input/internal/undo/UndoManager;

    .line 36
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/undo/UndoManager;->undoStack:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    return-object v0
.end method


# virtual methods
.method public final clearHistory()V
    .locals 1

    .line 108
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/undo/UndoManager;->undoStack:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->clear()V

    .line 109
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/undo/UndoManager;->redoStack:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->clear()V

    .line 110
    return-void
.end method

.method public final getCanRedo$foundation_release()Z
    .locals 1

    .line 49
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/undo/UndoManager;->redoStack:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final getCanUndo$foundation_release()Z
    .locals 1

    .line 46
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/undo/UndoManager;->undoStack:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final getSize()I
    .locals 2

    .line 52
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/undo/UndoManager;->undoStack:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->size()I

    move-result v0

    iget-object v1, p0, Landroidx/compose/foundation/text/input/internal/undo/UndoManager;->redoStack:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->size()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final record(Ljava/lang/Object;)V
    .locals 3
    .param p1, "undoableAction"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 63
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/undo/UndoManager;->redoStack:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->clear()V

    .line 65
    :goto_0
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/internal/undo/UndoManager;->getSize()I

    move-result v0

    iget v1, p0, Landroidx/compose/foundation/text/input/internal/undo/UndoManager;->capacity:I

    add-int/lit8 v1, v1, -0x1

    .line 68
    iget-object v2, p0, Landroidx/compose/foundation/text/input/internal/undo/UndoManager;->undoStack:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 65
    if-le v0, v1, :cond_0

    .line 66
    check-cast v2, Ljava/util/List;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->removeFirst(Ljava/util/List;)Ljava/lang/Object;

    goto :goto_0

    .line 68
    :cond_0
    invoke-virtual {v2, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->add(Ljava/lang/Object;)Z

    .line 69
    return-void
.end method

.method public final redo()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 96
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/internal/undo/UndoManager;->getCanRedo$foundation_release()Z

    move-result v0

    .local v0, "value$iv":Z
    const/4 v1, 0x0

    .line 179
    .local v1, "$i$f$checkPrecondition":I
    nop

    .line 180
    if-nez v0, :cond_0

    .line 181
    const/4 v2, 0x0

    .line 97
    .local v2, "$i$a$-checkPrecondition-UndoManager$redo$1":I
    nop

    .line 98
    nop

    .line 181
    .end local v2    # "$i$a$-checkPrecondition-UndoManager$redo$1":I
    const-string v2, "It\'s an error to call redo while there is nothing to redo. Please first check `canRedo` value before calling the `redo` function."

    invoke-static {v2}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 183
    :cond_0
    nop

    .line 101
    .end local v0    # "value$iv":Z
    .end local v1    # "$i$f$checkPrecondition":I
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/undo/UndoManager;->redoStack:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->removeLast(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    .line 103
    .local v0, "topOperation":Ljava/lang/Object;
    iget-object v1, p0, Landroidx/compose/foundation/text/input/internal/undo/UndoManager;->undoStack:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-virtual {v1, v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->add(Ljava/lang/Object;)Z

    .line 104
    return-object v0
.end method

.method public final undo()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 78
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/internal/undo/UndoManager;->getCanUndo$foundation_release()Z

    move-result v0

    .local v0, "value$iv":Z
    const/4 v1, 0x0

    .line 174
    .local v1, "$i$f$checkPrecondition":I
    nop

    .line 175
    if-nez v0, :cond_0

    .line 176
    const/4 v2, 0x0

    .line 79
    .local v2, "$i$a$-checkPrecondition-UndoManager$undo$1":I
    nop

    .line 80
    nop

    .line 176
    .end local v2    # "$i$a$-checkPrecondition-UndoManager$undo$1":I
    const-string v2, "It\'s an error to call undo while there is nothing to undo. Please first check `canUndo` value before calling the `undo` function."

    invoke-static {v2}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 178
    :cond_0
    nop

    .line 83
    .end local v0    # "value$iv":Z
    .end local v1    # "$i$f$checkPrecondition":I
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/undo/UndoManager;->undoStack:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->removeLast(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    .line 85
    .local v0, "topOperation":Ljava/lang/Object;
    iget-object v1, p0, Landroidx/compose/foundation/text/input/internal/undo/UndoManager;->redoStack:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-virtual {v1, v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->add(Ljava/lang/Object;)Z

    .line 86
    return-object v0
.end method
