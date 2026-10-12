.class public final Landroidx/compose/runtime/RecordingApplier;
.super Ljava/lang/Object;
.source "PausableComposition.kt"

# interfaces
.implements Landroidx/compose/runtime/Applier;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/runtime/RecordingApplier$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<N:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Landroidx/compose/runtime/Applier<",
        "TN;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPausableComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PausableComposition.kt\nandroidx/compose/runtime/RecordingApplier\n+ 2 IntList.kt\nandroidx/collection/IntListKt\n+ 3 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 4 IntList.kt\nandroidx/collection/IntList\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,392:1\n905#2:393\n1516#3:394\n65#4:395\n4643#5,5:396\n*S KotlinDebug\n*F\n+ 1 PausableComposition.kt\nandroidx/compose/runtime/RecordingApplier\n*L\n262#1:393\n263#1:394\n319#1:395\n370#1:396,5\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u000e\u0008\u0000\u0018\u0000 \'*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\'B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0004J3\u0010\u000f\u001a\u00020\u00102\u001f\u0010\u0011\u001a\u001b\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0004\u0012\u00020\u00100\u0012\u00a2\u0006\u0002\u0008\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u000cH\u0016J\u0008\u0010\u0015\u001a\u00020\u0010H\u0016J\u0015\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u001cJ \u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u001aH\u0016J\u0014\u0010\"\u001a\u00020\u00102\u000c\u0010#\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002J\u0018\u0010$\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u001aH\u0016J\u0008\u0010%\u001a\u00020\u0010H\u0016J\u0008\u0010&\u001a\u00020\u0010H\u0016R\u001c\u0010\u0005\u001a\u00028\u0000X\u0096\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\u0004R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("
    }
    d2 = {
        "Landroidx/compose/runtime/RecordingApplier;",
        "N",
        "Landroidx/compose/runtime/Applier;",
        "root",
        "(Ljava/lang/Object;)V",
        "current",
        "getCurrent",
        "()Ljava/lang/Object;",
        "setCurrent",
        "Ljava/lang/Object;",
        "instances",
        "Landroidx/collection/MutableObjectList;",
        "",
        "operations",
        "Landroidx/collection/MutableIntList;",
        "apply",
        "",
        "block",
        "Lkotlin/Function2;",
        "Lkotlin/ExtensionFunctionType;",
        "value",
        "clear",
        "down",
        "node",
        "insertBottomUp",
        "index",
        "",
        "instance",
        "(ILjava/lang/Object;)V",
        "insertTopDown",
        "move",
        "from",
        "to",
        "count",
        "playTo",
        "applier",
        "remove",
        "reuse",
        "up",
        "Companion",
        "runtime_release"
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

.field public static final APPLY:I = 0x7

.field public static final CLEAR:I = 0x4

.field public static final Companion:Landroidx/compose/runtime/RecordingApplier$Companion;

.field public static final DOWN:I = 0x1

.field public static final INSERT_BOTTOM_UP:I = 0x5

.field public static final INSERT_TOP_DOWN:I = 0x6

.field public static final MOVE:I = 0x3

.field public static final REMOVE:I = 0x2

.field public static final REUSE:I = 0x8

.field public static final UP:I


# instance fields
.field private current:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TN;"
        }
    .end annotation
.end field

.field private final instances:Landroidx/collection/MutableObjectList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableObjectList<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final operations:Landroidx/collection/MutableIntList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/runtime/RecordingApplier$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/runtime/RecordingApplier$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/compose/runtime/RecordingApplier;->Companion:Landroidx/compose/runtime/RecordingApplier$Companion;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/runtime/RecordingApplier;->$stable:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 5
    .param p1, "root"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TN;)V"
        }
    .end annotation

    .line 261
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 262
    const/4 v0, 0x0

    .line 393
    .local v0, "$i$f$mutableIntListOf":I
    new-instance v1, Landroidx/collection/MutableIntList;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Landroidx/collection/MutableIntList;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 262
    .end local v0    # "$i$f$mutableIntListOf":I
    iput-object v1, p0, Landroidx/compose/runtime/RecordingApplier;->operations:Landroidx/collection/MutableIntList;

    .line 263
    const/4 v0, 0x0

    .line 394
    .local v0, "$i$f$mutableObjectListOf":I
    new-instance v1, Landroidx/collection/MutableObjectList;

    invoke-direct {v1, v2, v3, v4}, Landroidx/collection/MutableObjectList;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 263
    .end local v0    # "$i$f$mutableObjectListOf":I
    iput-object v1, p0, Landroidx/compose/runtime/RecordingApplier;->instances:Landroidx/collection/MutableObjectList;

    .line 265
    iput-object p1, p0, Landroidx/compose/runtime/RecordingApplier;->current:Ljava/lang/Object;

    .line 261
    return-void
.end method


# virtual methods
.method public apply(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;)V
    .locals 2
    .param p1, "block"    # Lkotlin/jvm/functions/Function2;
    .param p2, "value"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-TN;",
            "Ljava/lang/Object;",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 306
    iget-object v0, p0, Landroidx/compose/runtime/RecordingApplier;->operations:Landroidx/collection/MutableIntList;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 307
    iget-object v0, p0, Landroidx/compose/runtime/RecordingApplier;->instances:Landroidx/collection/MutableObjectList;

    invoke-virtual {v0, p1}, Landroidx/collection/MutableObjectList;->add(Ljava/lang/Object;)Z

    .line 308
    iget-object v0, p0, Landroidx/compose/runtime/RecordingApplier;->instances:Landroidx/collection/MutableObjectList;

    invoke-virtual {v0, p2}, Landroidx/collection/MutableObjectList;->add(Ljava/lang/Object;)Z

    .line 309
    return-void
.end method

.method public clear()V
    .locals 2

    .line 290
    iget-object v0, p0, Landroidx/compose/runtime/RecordingApplier;->operations:Landroidx/collection/MutableIntList;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 291
    return-void
.end method

.method public down(Ljava/lang/Object;)V
    .locals 2
    .param p1, "node"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TN;)V"
        }
    .end annotation

    .line 268
    iget-object v0, p0, Landroidx/compose/runtime/RecordingApplier;->operations:Landroidx/collection/MutableIntList;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 269
    iget-object v0, p0, Landroidx/compose/runtime/RecordingApplier;->instances:Landroidx/collection/MutableObjectList;

    invoke-virtual {v0, p1}, Landroidx/collection/MutableObjectList;->add(Ljava/lang/Object;)Z

    .line 270
    return-void
.end method

.method public getCurrent()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TN;"
        }
    .end annotation

    .line 265
    iget-object v0, p0, Landroidx/compose/runtime/RecordingApplier;->current:Ljava/lang/Object;

    return-object v0
.end method

.method public insertBottomUp(ILjava/lang/Object;)V
    .locals 2
    .param p1, "index"    # I
    .param p2, "instance"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITN;)V"
        }
    .end annotation

    .line 294
    iget-object v0, p0, Landroidx/compose/runtime/RecordingApplier;->operations:Landroidx/collection/MutableIntList;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 295
    iget-object v0, p0, Landroidx/compose/runtime/RecordingApplier;->operations:Landroidx/collection/MutableIntList;

    invoke-virtual {v0, p1}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 296
    iget-object v0, p0, Landroidx/compose/runtime/RecordingApplier;->instances:Landroidx/collection/MutableObjectList;

    invoke-virtual {v0, p2}, Landroidx/collection/MutableObjectList;->add(Ljava/lang/Object;)Z

    .line 297
    return-void
.end method

.method public insertTopDown(ILjava/lang/Object;)V
    .locals 2
    .param p1, "index"    # I
    .param p2, "instance"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITN;)V"
        }
    .end annotation

    .line 300
    iget-object v0, p0, Landroidx/compose/runtime/RecordingApplier;->operations:Landroidx/collection/MutableIntList;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 301
    iget-object v0, p0, Landroidx/compose/runtime/RecordingApplier;->operations:Landroidx/collection/MutableIntList;

    invoke-virtual {v0, p1}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 302
    iget-object v0, p0, Landroidx/compose/runtime/RecordingApplier;->instances:Landroidx/collection/MutableObjectList;

    invoke-virtual {v0, p2}, Landroidx/collection/MutableObjectList;->add(Ljava/lang/Object;)Z

    .line 303
    return-void
.end method

.method public move(III)V
    .locals 2
    .param p1, "from"    # I
    .param p2, "to"    # I
    .param p3, "count"    # I

    .line 283
    iget-object v0, p0, Landroidx/compose/runtime/RecordingApplier;->operations:Landroidx/collection/MutableIntList;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 284
    iget-object v0, p0, Landroidx/compose/runtime/RecordingApplier;->operations:Landroidx/collection/MutableIntList;

    invoke-virtual {v0, p1}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 285
    iget-object v0, p0, Landroidx/compose/runtime/RecordingApplier;->operations:Landroidx/collection/MutableIntList;

    invoke-virtual {v0, p2}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 286
    iget-object v0, p0, Landroidx/compose/runtime/RecordingApplier;->operations:Landroidx/collection/MutableIntList;

    invoke-virtual {v0, p3}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 287
    return-void
.end method

.method public final playTo(Landroidx/compose/runtime/Applier;)V
    .locals 10
    .param p1, "applier"    # Landroidx/compose/runtime/Applier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/Applier<",
            "TN;>;)V"
        }
    .end annotation

    .line 316
    const/4 v0, 0x0

    .line 317
    .local v0, "currentOperation":I
    const/4 v1, 0x0

    .line 318
    .local v1, "currentInstance":I
    iget-object v2, p0, Landroidx/compose/runtime/RecordingApplier;->operations:Landroidx/collection/MutableIntList;

    .line 319
    .local v2, "operations":Landroidx/collection/MutableIntList;
    move-object v3, v2

    check-cast v3, Landroidx/collection/IntList;

    .local v3, "this_$iv":Landroidx/collection/IntList;
    const/4 v4, 0x0

    .line 395
    .local v4, "$i$f$getSize":I
    iget v3, v3, Landroidx/collection/IntList;->_size:I

    .line 319
    .end local v3    # "this_$iv":Landroidx/collection/IntList;
    .end local v4    # "$i$f$getSize":I
    nop

    .line 320
    .local v3, "size":I
    iget-object v4, p0, Landroidx/compose/runtime/RecordingApplier;->instances:Landroidx/collection/MutableObjectList;

    .line 321
    .local v4, "instances":Landroidx/collection/MutableObjectList;
    invoke-interface {p1}, Landroidx/compose/runtime/Applier;->onBeginChanges()V

    .line 322
    nop

    .line 323
    :goto_0
    if-ge v0, v3, :cond_0

    .line 324
    add-int/lit8 v5, v0, 0x1

    .end local v0    # "currentOperation":I
    .local v5, "currentOperation":I
    :try_start_0
    invoke-virtual {v2, v0}, Landroidx/collection/MutableIntList;->get(I)I

    move-result v0

    .line 325
    .local v0, "operation":I
    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 366
    :pswitch_0
    invoke-interface {p1}, Landroidx/compose/runtime/Applier;->reuse()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    goto/16 :goto_1

    .line 361
    :pswitch_1
    add-int/lit8 v6, v1, 0x1

    .end local v1    # "currentInstance":I
    .local v6, "currentInstance":I
    :try_start_1
    invoke-virtual {v4, v1}, Landroidx/collection/MutableObjectList;->get(I)Ljava/lang/Object;

    move-result-object v1

    const-string/jumbo v7, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v7, 0x2

    invoke-static {v1, v7}, Lkotlin/jvm/internal/TypeIntrinsics;->beforeCheckcastToFunctionOfArity(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function2;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    .line 362
    .local v1, "block":Lkotlin/jvm/functions/Function2;
    add-int/lit8 v7, v6, 0x1

    .end local v6    # "currentInstance":I
    .local v7, "currentInstance":I
    :try_start_2
    invoke-virtual {v4, v6}, Landroidx/collection/MutableObjectList;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 363
    .local v6, "value":Ljava/lang/Object;
    invoke-interface {p1, v1, v6}, Landroidx/compose/runtime/Applier;->apply(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move v0, v5

    move v1, v7

    .end local v1    # "block":Lkotlin/jvm/functions/Function2;
    .end local v6    # "value":Ljava/lang/Object;
    goto :goto_0

    .line 374
    .end local v0    # "operation":I
    :catchall_0
    move-exception v0

    move v1, v7

    goto/16 :goto_4

    .line 348
    .end local v7    # "currentInstance":I
    .restart local v0    # "operation":I
    .local v1, "currentInstance":I
    :pswitch_2
    add-int/lit8 v6, v5, 0x1

    .end local v5    # "currentOperation":I
    .local v6, "currentOperation":I
    :try_start_3
    invoke-virtual {v2, v5}, Landroidx/collection/MutableIntList;->get(I)I

    move-result v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 350
    .local v5, "index":I
    add-int/lit8 v7, v1, 0x1

    .end local v1    # "currentInstance":I
    .restart local v7    # "currentInstance":I
    :try_start_4
    invoke-virtual {v4, v1}, Landroidx/collection/MutableObjectList;->get(I)Ljava/lang/Object;

    move-result-object v1

    .line 351
    .local v1, "instance":Ljava/lang/Object;
    invoke-interface {p1, v5, v1}, Landroidx/compose/runtime/Applier;->insertTopDown(ILjava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    move v0, v6

    move v1, v7

    .end local v1    # "instance":Ljava/lang/Object;
    .end local v5    # "index":I
    goto :goto_0

    .line 354
    .end local v6    # "currentOperation":I
    .end local v7    # "currentInstance":I
    .local v1, "currentInstance":I
    .local v5, "currentOperation":I
    :pswitch_3
    add-int/lit8 v6, v5, 0x1

    .end local v5    # "currentOperation":I
    .restart local v6    # "currentOperation":I
    :try_start_5
    invoke-virtual {v2, v5}, Landroidx/collection/MutableIntList;->get(I)I

    move-result v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 356
    .local v5, "index":I
    add-int/lit8 v7, v1, 0x1

    .end local v1    # "currentInstance":I
    .restart local v7    # "currentInstance":I
    :try_start_6
    invoke-virtual {v4, v1}, Landroidx/collection/MutableObjectList;->get(I)Ljava/lang/Object;

    move-result-object v1

    .line 357
    .local v1, "instance":Ljava/lang/Object;
    invoke-interface {p1, v5, v1}, Landroidx/compose/runtime/Applier;->insertBottomUp(ILjava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    move v0, v6

    move v1, v7

    .end local v1    # "instance":Ljava/lang/Object;
    .end local v5    # "index":I
    goto :goto_0

    .line 374
    .end local v0    # "operation":I
    :catchall_1
    move-exception v0

    move v5, v6

    move v1, v7

    goto/16 :goto_4

    .line 345
    .end local v6    # "currentOperation":I
    .end local v7    # "currentInstance":I
    .restart local v0    # "operation":I
    .local v1, "currentInstance":I
    .local v5, "currentOperation":I
    :pswitch_4
    :try_start_7
    invoke-interface {p1}, Landroidx/compose/runtime/Applier;->clear()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    goto :goto_2

    .line 339
    :pswitch_5
    add-int/lit8 v6, v5, 0x1

    .end local v5    # "currentOperation":I
    .restart local v6    # "currentOperation":I
    :try_start_8
    invoke-virtual {v2, v5}, Landroidx/collection/MutableIntList;->get(I)I

    move-result v5
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 340
    .local v5, "from":I
    add-int/lit8 v7, v6, 0x1

    .end local v6    # "currentOperation":I
    .local v7, "currentOperation":I
    :try_start_9
    invoke-virtual {v2, v6}, Landroidx/collection/MutableIntList;->get(I)I

    move-result v6
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 341
    .local v6, "to":I
    add-int/lit8 v8, v7, 0x1

    .end local v7    # "currentOperation":I
    .local v8, "currentOperation":I
    :try_start_a
    invoke-virtual {v2, v7}, Landroidx/collection/MutableIntList;->get(I)I

    move-result v7

    .line 342
    .local v7, "count":I
    invoke-interface {p1, v5, v6, v7}, Landroidx/compose/runtime/Applier;->move(III)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    move v0, v8

    .end local v5    # "from":I
    .end local v6    # "to":I
    .end local v7    # "count":I
    goto :goto_0

    .line 374
    .end local v0    # "operation":I
    :catchall_2
    move-exception v0

    move v5, v8

    goto :goto_4

    .line 334
    .end local v8    # "currentOperation":I
    .restart local v0    # "operation":I
    .local v5, "currentOperation":I
    :pswitch_6
    add-int/lit8 v6, v5, 0x1

    .end local v5    # "currentOperation":I
    .local v6, "currentOperation":I
    :try_start_b
    invoke-virtual {v2, v5}, Landroidx/collection/MutableIntList;->get(I)I

    move-result v5
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 335
    .local v5, "index":I
    add-int/lit8 v7, v6, 0x1

    .end local v6    # "currentOperation":I
    .local v7, "currentOperation":I
    :try_start_c
    invoke-virtual {v2, v6}, Landroidx/collection/MutableIntList;->get(I)I

    move-result v6

    .line 336
    .local v6, "count":I
    invoke-interface {p1, v5, v6}, Landroidx/compose/runtime/Applier;->remove(II)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    move v0, v7

    .end local v5    # "index":I
    .end local v6    # "count":I
    goto/16 :goto_0

    .line 374
    .end local v0    # "operation":I
    :catchall_3
    move-exception v0

    move v5, v7

    goto :goto_4

    .end local v7    # "currentOperation":I
    .local v6, "currentOperation":I
    :catchall_4
    move-exception v0

    move v5, v6

    goto :goto_4

    .line 330
    .end local v6    # "currentOperation":I
    .restart local v0    # "operation":I
    .local v5, "currentOperation":I
    :pswitch_7
    add-int/lit8 v6, v1, 0x1

    .end local v1    # "currentInstance":I
    .local v6, "currentInstance":I
    :try_start_d
    invoke-virtual {v4, v1}, Landroidx/collection/MutableObjectList;->get(I)Ljava/lang/Object;

    move-result-object v1

    .line 331
    .local v1, "node":Ljava/lang/Object;
    invoke-interface {p1, v1}, Landroidx/compose/runtime/Applier;->down(Ljava/lang/Object;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    move v0, v5

    move v1, v6

    .end local v1    # "node":Ljava/lang/Object;
    goto/16 :goto_0

    .line 374
    .end local v0    # "operation":I
    :catchall_5
    move-exception v0

    move v1, v6

    goto :goto_4

    .line 327
    .end local v6    # "currentInstance":I
    .restart local v0    # "operation":I
    .local v1, "currentInstance":I
    :pswitch_8
    :try_start_e
    invoke-interface {p1}, Landroidx/compose/runtime/Applier;->up()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    goto :goto_2

    .line 366
    .end local v0    # "operation":I
    :goto_1
    nop

    .line 323
    :goto_2
    move v0, v5

    goto/16 :goto_0

    .line 374
    :catchall_6
    move-exception v0

    goto :goto_4

    .line 370
    .end local v5    # "currentOperation":I
    .local v0, "currentOperation":I
    :cond_0
    :try_start_f
    invoke-virtual {v4}, Landroidx/collection/MutableObjectList;->getSize()I

    move-result v5

    if-ne v1, v5, :cond_1

    const/4 v5, 0x1

    goto :goto_3

    :cond_1
    const/4 v5, 0x0

    .local v5, "value$iv":Z
    :goto_3
    const/4 v6, 0x0

    .line 396
    .local v6, "$i$f$runtimeCheck":I
    nop

    .line 397
    if-nez v5, :cond_2

    .line 398
    const/4 v7, 0x0

    .line 370
    .local v7, "$i$a$-runtimeCheck-RecordingApplier$playTo$1":I
    const-string v8, "Applier operation size mismatch"

    .line 398
    .end local v7    # "$i$a$-runtimeCheck-RecordingApplier$playTo$1":I
    invoke-static {v8}, Landroidx/compose/runtime/ComposerKt;->composeImmediateRuntimeError(Ljava/lang/String;)V

    .line 400
    :cond_2
    nop

    .line 371
    .end local v5    # "value$iv":Z
    .end local v6    # "$i$f$runtimeCheck":I
    invoke-virtual {v4}, Landroidx/collection/MutableObjectList;->clear()V

    .line 372
    invoke-virtual {v2}, Landroidx/collection/MutableIntList;->clear()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 374
    invoke-interface {p1}, Landroidx/compose/runtime/Applier;->onEndChanges()V

    .line 375
    nop

    .line 376
    return-void

    .line 374
    :catchall_7
    move-exception v5

    move-object v9, v5

    move v5, v0

    move-object v0, v9

    .end local v0    # "currentOperation":I
    .local v5, "currentOperation":I
    :goto_4
    invoke-interface {p1}, Landroidx/compose/runtime/Applier;->onEndChanges()V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public remove(II)V
    .locals 2
    .param p1, "index"    # I
    .param p2, "count"    # I

    .line 277
    iget-object v0, p0, Landroidx/compose/runtime/RecordingApplier;->operations:Landroidx/collection/MutableIntList;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 278
    iget-object v0, p0, Landroidx/compose/runtime/RecordingApplier;->operations:Landroidx/collection/MutableIntList;

    invoke-virtual {v0, p1}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 279
    iget-object v0, p0, Landroidx/compose/runtime/RecordingApplier;->operations:Landroidx/collection/MutableIntList;

    invoke-virtual {v0, p2}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 280
    return-void
.end method

.method public reuse()V
    .locals 2

    .line 312
    iget-object v0, p0, Landroidx/compose/runtime/RecordingApplier;->operations:Landroidx/collection/MutableIntList;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 313
    return-void
.end method

.method public setCurrent(Ljava/lang/Object;)V
    .locals 0
    .param p1, "<set-?>"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TN;)V"
        }
    .end annotation

    .line 265
    iput-object p1, p0, Landroidx/compose/runtime/RecordingApplier;->current:Ljava/lang/Object;

    return-void
.end method

.method public up()V
    .locals 2

    .line 273
    iget-object v0, p0, Landroidx/compose/runtime/RecordingApplier;->operations:Landroidx/collection/MutableIntList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 274
    return-void
.end method
