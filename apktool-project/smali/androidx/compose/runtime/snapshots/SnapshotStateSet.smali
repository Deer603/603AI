.class public final Landroidx/compose/runtime/snapshots/SnapshotStateSet;
.super Ljava/lang/Object;
.source "SnapshotStateSet.kt"

# interfaces
.implements Landroidx/compose/runtime/snapshots/StateObject;
.implements Ljava/util/Set;
.implements Ljava/util/RandomAccess;
.implements Lkotlin/jvm/internal/markers/KMutableSet;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Landroidx/compose/runtime/snapshots/StateObject;",
        "Ljava/util/Set<",
        "TT;>;",
        "Ljava/util/RandomAccess;",
        "Lkotlin/jvm/internal/markers/KMutableSet;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSnapshotStateSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateSet.kt\nandroidx/compose/runtime/snapshots/SnapshotStateSet\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,268:1\n139#1:269\n161#1,6:272\n167#1:280\n139#1:281\n168#1,9:283\n136#1:292\n177#1,6:302\n161#1,6:308\n167#1:316\n139#1:317\n168#1,9:319\n136#1:328\n177#1,6:338\n136#1:344\n161#1,6:357\n167#1:365\n139#1:366\n168#1,9:368\n136#1:377\n177#1,6:387\n161#1,6:393\n167#1:401\n139#1:402\n168#1,9:404\n136#1:413\n177#1,6:423\n139#1:429\n144#1,5:443\n149#1:450\n139#1:451\n150#1,7:453\n136#1:460\n158#1:470\n139#1:473\n136#1:475\n139#1:489\n136#1:491\n2475#2:270\n2475#2:271\n2475#2:282\n2365#2,2:293\n1894#2,2:295\n2367#2,4:297\n2475#2:318\n2365#2,2:329\n1894#2,2:331\n2367#2,4:333\n2365#2,2:345\n1894#2,2:347\n2367#2,2:351\n2370#2:355\n2475#2:367\n2365#2,2:378\n1894#2,2:380\n2367#2,4:382\n2475#2:403\n2365#2,2:414\n1894#2,2:416\n2367#2,4:418\n2475#2:430\n2365#2,2:431\n1894#2,2:433\n2367#2,4:437\n2475#2:442\n2475#2:452\n2365#2,2:461\n1894#2,2:463\n2367#2,4:465\n2475#2:474\n2365#2,2:476\n1894#2,2:478\n2367#2,4:482\n2475#2:490\n2365#2,2:492\n1894#2,2:494\n2367#2,4:498\n33#3,2:278\n33#3,2:314\n33#3,2:349\n33#3,2:353\n33#3,2:363\n33#3,2:399\n33#3,2:435\n33#3,2:448\n33#3,2:471\n33#3,2:480\n33#3,2:487\n33#3,2:496\n33#3,2:503\n1#4:301\n1#4:337\n1#4:356\n1#4:386\n1#4:422\n1#4:441\n1#4:469\n1#4:486\n1#4:502\n*S KotlinDebug\n*F\n+ 1 SnapshotStateSet.kt\nandroidx/compose/runtime/snapshots/SnapshotStateSet\n*L\n62#1:269\n105#1:272,6\n105#1:280\n105#1:281\n105#1:283,9\n105#1:292\n105#1:302,6\n107#1:308,6\n107#1:316\n107#1:317\n107#1:319,9\n107#1:328\n107#1:338,6\n110#1:344\n118#1:357,6\n118#1:365\n118#1:366\n118#1:368,9\n118#1:377\n118#1:387,6\n120#1:393,6\n120#1:401\n120#1:402\n120#1:404,9\n120#1:413\n120#1:423,6\n132#1:429\n141#1:443,5\n141#1:450\n141#1:451\n141#1:453,7\n141#1:460\n141#1:470\n149#1:473\n156#1:475\n167#1:489\n176#1:491\n62#1:270\n101#1:271\n105#1:282\n105#1:293,2\n105#1:295,2\n105#1:297,4\n107#1:318\n107#1:329,2\n107#1:331,2\n107#1:333,4\n110#1:345,2\n110#1:347,2\n110#1:351,2\n110#1:355\n118#1:367\n118#1:378,2\n118#1:380,2\n118#1:382,4\n120#1:403\n120#1:414,2\n120#1:416,2\n120#1:418,4\n132#1:430\n136#1:431,2\n136#1:433,2\n136#1:437,4\n139#1:442\n141#1:452\n141#1:461,2\n141#1:463,2\n141#1:465,4\n149#1:474\n156#1:476,2\n156#1:478,2\n156#1:482,4\n167#1:490\n176#1:492,2\n176#1:494,2\n176#1:498,4\n105#1:278,2\n107#1:314,2\n110#1:349,2\n111#1:353,2\n118#1:363,2\n120#1:399,2\n136#1:435,2\n141#1:448,2\n148#1:471,2\n156#1:480,2\n166#1:487,2\n176#1:496,2\n189#1:503,2\n105#1:301\n107#1:337\n110#1:356\n118#1:386\n120#1:422\n136#1:441\n141#1:469\n156#1:486\n176#1:502\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010)\n\u0002\u0008\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u00022\u0008\u0012\u0004\u0012\u0002H\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0001BB\u0005\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u001fJ\u0016\u0010 \u001a\u00020\u001d2\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00028\u00000\"H\u0016J\u0008\u0010#\u001a\u00020$H\u0016J)\u0010%\u001a\u00020\u001d2\u001e\u0010&\u001a\u001a\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000(\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000(0\'H\u0082\u0008J\u0016\u0010)\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0002\u0010\u001fJ\u0016\u0010*\u001a\u00020\u001d2\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00028\u00000\"H\u0016J\u0008\u0010+\u001a\u00020\u001dH\u0016J\u000f\u0010,\u001a\u0008\u0012\u0004\u0012\u00028\u00000-H\u0096\u0002J.\u0010.\u001a\u0002H/\"\u0004\u0008\u0001\u0010/2\u0018\u0010&\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u0002H/0\'H\u0082\u0008\u00a2\u0006\u0002\u00100J\"\u00101\u001a\u00020\u001d2\u0018\u0010&\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u001d0\'H\u0002J\u0010\u00102\u001a\u00020$2\u0006\u00103\u001a\u00020\rH\u0016J\u0015\u00104\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u001fJ\u0016\u00105\u001a\u00020\u001d2\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00028\u00000\"H\u0016J\u0016\u00106\u001a\u00020\u001d2\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00028\u00000\"H\u0016J\u0016\u00107\u001a\u00020\r2\u000c\u00108\u001a\u0008\u0012\u0004\u0012\u00028\u00000(H\u0002J\u000c\u00109\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0008J\u0008\u0010:\u001a\u00020;H\u0016J3\u0010<\u001a\u0002H/\"\u0004\u0008\u0001\u0010/2\u001d\u0010&\u001a\u0019\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u0004\u0012\u0002H/0\'\u00a2\u0006\u0002\u0008=H\u0082\u0008\u00a2\u0006\u0002\u00100J3\u0010>\u001a\u0002H/\"\u0004\u0008\u0001\u0010/2\u001d\u0010&\u001a\u0019\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u0004\u0012\u0002H/0\'\u00a2\u0006\u0002\u0008=H\u0082\u0008\u00a2\u0006\u0002\u00100J(\u0010?\u001a\u00020\u001d*\u0008\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010@\u001a\u00020\u00122\u000c\u0010A\u001a\u0008\u0012\u0004\u0012\u00028\u00000(H\u0002R \u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00088AX\u0080\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\t\u0010\u0006\u001a\u0004\u0008\n\u0010\u000bR\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\r@RX\u0096\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014R \u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00168@X\u0080\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0017\u0010\u0006\u001a\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u0014\u00a8\u0006C"
    }
    d2 = {
        "Landroidx/compose/runtime/snapshots/SnapshotStateSet;",
        "T",
        "Landroidx/compose/runtime/snapshots/StateObject;",
        "",
        "Ljava/util/RandomAccess;",
        "Lkotlin/collections/RandomAccess;",
        "()V",
        "debuggerDisplayValue",
        "",
        "getDebuggerDisplayValue$annotations",
        "getDebuggerDisplayValue",
        "()Ljava/util/Set;",
        "<set-?>",
        "Landroidx/compose/runtime/snapshots/StateRecord;",
        "firstStateRecord",
        "getFirstStateRecord",
        "()Landroidx/compose/runtime/snapshots/StateRecord;",
        "modification",
        "",
        "getModification$runtime_release",
        "()I",
        "readable",
        "Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;",
        "getReadable$runtime_release$annotations",
        "getReadable$runtime_release",
        "()Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;",
        "size",
        "getSize",
        "add",
        "",
        "element",
        "(Ljava/lang/Object;)Z",
        "addAll",
        "elements",
        "",
        "clear",
        "",
        "conditionalUpdate",
        "block",
        "Lkotlin/Function1;",
        "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;",
        "contains",
        "containsAll",
        "isEmpty",
        "iterator",
        "",
        "mutate",
        "R",
        "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;",
        "mutateBoolean",
        "prependStateRecord",
        "value",
        "remove",
        "removeAll",
        "retainAll",
        "stateRecordWith",
        "set",
        "toSet",
        "toString",
        "",
        "withCurrent",
        "Lkotlin/ExtensionFunctionType;",
        "writable",
        "attemptUpdate",
        "currentModification",
        "newSet",
        "StateSetStateRecord",
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


# instance fields
.field private firstStateRecord:Landroidx/compose/runtime/snapshots/StateRecord;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    invoke-static {}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt;->persistentSetOf()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->stateRecordWith(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->firstStateRecord:Landroidx/compose/runtime/snapshots/StateRecord;

    .line 34
    return-void
.end method

.method private final attemptUpdate(Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;)Z
    .locals 5
    .param p1, "$this$attemptUpdate"    # Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    .param p2, "currentModification"    # I
    .param p3, "newSet"    # Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord<",
            "TT;>;I",
            "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet<",
            "+TT;>;)Z"
        }
    .end annotation

    .line 189
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotStateSetKt;->access$getSync$p()Ljava/lang/Object;

    move-result-object v0

    .local v0, "lock$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 503
    .local v1, "$i$f$synchronized":I
    nop

    .line 504
    monitor-enter v0

    const/4 v2, 0x0

    .line 190
    .local v2, "$i$a$-synchronized-SnapshotStateSet$attemptUpdate$1":I
    :try_start_0
    invoke-virtual {p1}, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;->getModification$runtime_release()I

    move-result v3

    if-ne v3, p2, :cond_0

    .line 191
    invoke-virtual {p1, p3}, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;->setSet$runtime_release(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;)V

    .line 192
    invoke-virtual {p1}, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;->getModification$runtime_release()I

    move-result v3

    const/4 v4, 0x1

    add-int/2addr v3, v4

    invoke-virtual {p1, v3}, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;->setModification$runtime_release(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 193
    goto :goto_0

    .line 194
    :cond_0
    const/4 v4, 0x0

    .line 504
    .end local v2    # "$i$a$-synchronized-SnapshotStateSet$attemptUpdate$1":I
    :goto_0
    monitor-exit v0

    .line 195
    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    return v4

    .line 504
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    :catchall_0
    move-exception v2

    monitor-exit v0

    throw v2
.end method

.method private final conditionalUpdate(Lkotlin/jvm/functions/Function1;)Z
    .locals 20
    .param p1, "block"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet<",
            "+TT;>;+",
            "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet<",
            "+TT;>;>;)Z"
        }
    .end annotation

    const/4 v1, 0x0

    .line 161
    .local v1, "$i$f$conditionalUpdate":I
    move-object/from16 v2, p0

    check-cast v2, Landroidx/compose/runtime/snapshots/SnapshotStateSet;

    .local v2, "$this$conditionalUpdate_u24lambda_u2415":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    const/4 v3, 0x0

    .line 162
    .local v3, "$i$a$-run-SnapshotStateSet$conditionalUpdate$1":I
    const/4 v4, 0x0

    .line 163
    .local v4, "result":Z
    :cond_0
    nop

    .line 164
    const/4 v5, 0x0

    .line 165
    .local v5, "oldSet":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 166
    .local v6, "currentModification":I
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotStateSetKt;->access$getSync$p()Ljava/lang/Object;

    move-result-object v7

    .local v7, "lock$iv":Ljava/lang/Object;
    const/4 v8, 0x0

    .line 487
    .local v8, "$i$f$synchronized":I
    nop

    .line 488
    monitor-enter v7

    const/4 v0, 0x0

    .line 167
    .local v0, "$i$a$-synchronized-SnapshotStateSet$conditionalUpdate$1$1":I
    move-object v9, v2

    .local v9, "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    const/4 v10, 0x0

    .line 489
    .local v10, "$i$f$withCurrent":I
    :try_start_0
    invoke-virtual {v9}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v11

    const-string/jumbo v12, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    check-cast v11, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v11, "$this$withCurrent$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v12, 0x0

    .line 490
    .local v12, "$i$f$withCurrent":I
    invoke-static {v11}, Landroidx/compose/runtime/snapshots/SnapshotKt;->current(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v13

    check-cast v13, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    .local v13, "$this$conditionalUpdate_u24lambda_u2415_u24lambda_u2413_u24lambda_u2412":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    const/4 v14, 0x0

    .line 167
    .local v14, "$i$a$-withCurrent-SnapshotStateSet$conditionalUpdate$1$1$current$1":I
    nop

    .line 490
    .end local v13    # "$this$conditionalUpdate_u24lambda_u2415_u24lambda_u2413_u24lambda_u2412":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    .end local v14    # "$i$a$-withCurrent-SnapshotStateSet$conditionalUpdate$1$1$current$1":I
    nop

    .line 489
    .end local v11    # "$this$withCurrent$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v12    # "$i$f$withCurrent":I
    nop

    .line 167
    .end local v9    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .end local v10    # "$i$f$withCurrent":I
    nop

    .line 168
    .local v13, "current":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    invoke-virtual {v13}, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;->getModification$runtime_release()I

    move-result v9

    move v6, v9

    .line 169
    invoke-virtual {v13}, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;->getSet$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;

    move-result-object v9

    move-object v5, v9

    .line 170
    nop

    .end local v0    # "$i$a$-synchronized-SnapshotStateSet$conditionalUpdate$1$1":I
    .end local v13    # "current":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 488
    monitor-exit v7

    .line 171
    .end local v7    # "lock$iv":Ljava/lang/Object;
    .end local v8    # "$i$f$synchronized":I
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object/from16 v9, p1

    invoke-interface {v9, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;

    .line 172
    .local v7, "newSet":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;
    invoke-static {v7, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 173
    const/4 v0, 0x0

    .line 174
    .end local v4    # "result":Z
    .local v0, "result":Z
    goto :goto_0

    .line 176
    .end local v0    # "result":Z
    .restart local v4    # "result":Z
    :cond_1
    move-object v8, v2

    .local v8, "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    const/4 v10, 0x0

    .line 491
    .local v10, "$i$f$writable":I
    invoke-virtual {v8}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    const-string/jumbo v11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>"

    invoke-static {v0, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    move-object v11, v0

    check-cast v11, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v11, "$this$writable$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v12, 0x0

    .line 492
    .local v12, "$i$f$writable":I
    const/4 v13, 0x0

    .line 493
    .local v13, "snapshot$iv$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 494
    .local v14, "$i$f$sync":I
    nop

    .line 495
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->getLock()Ljava/lang/Object;

    move-result-object v15

    .local v15, "lock$iv$iv$iv$iv":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 496
    .local v16, "$i$f$synchronized":I
    nop

    .line 497
    monitor-enter v15

    const/4 v0, 0x0

    .line 498
    .local v0, "$i$a$-sync-SnapshotKt$writable$3$iv$iv":I
    :try_start_1
    sget-object v17, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v17

    move-object/from16 v13, v17

    .line 499
    move/from16 v17, v0

    .end local v0    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv":I
    .local v17, "$i$a$-sync-SnapshotKt$writable$3$iv$iv":I
    move-object v0, v8

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v11, v0, v13}, Landroidx/compose/runtime/snapshots/SnapshotKt;->writableRecord(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    .local v0, "$this$conditionalUpdate_u24lambda_u2415_u24lambda_u2414":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    const/16 v18, 0x0

    .line 176
    .local v18, "$i$a$-writable-SnapshotStateSet$conditionalUpdate$1$2":I
    invoke-direct {v2, v0, v6, v7}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->attemptUpdate(Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;)Z

    move-result v19
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 499
    .end local v0    # "$this$conditionalUpdate_u24lambda_u2415_u24lambda_u2414":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    .end local v18    # "$i$a$-writable-SnapshotStateSet$conditionalUpdate$1$2":I
    nop

    .line 497
    .end local v17    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv":I
    monitor-exit v15

    .line 495
    .end local v15    # "lock$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v16    # "$i$f$synchronized":I
    nop

    .line 501
    .end local v14    # "$i$f$sync":I
    move/from16 v0, v19

    .line 502
    .local v0, "it$iv$iv":Z
    const/4 v14, 0x0

    .line 501
    .local v14, "$i$a$-also-SnapshotKt$writable$4$iv$iv":I
    move-object v15, v8

    check-cast v15, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v13, v15}, Landroidx/compose/runtime/snapshots/SnapshotKt;->notifyWrite(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateObject;)V

    .line 493
    .end local v0    # "it$iv$iv":Z
    .end local v14    # "$i$a$-also-SnapshotKt$writable$4$iv$iv":I
    nop

    .line 491
    .end local v11    # "$this$writable$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v12    # "$i$f$writable":I
    .end local v13    # "snapshot$iv$iv":Ljava/lang/Object;
    nop

    .line 176
    .end local v8    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .end local v10    # "$i$f$writable":I
    if-eqz v19, :cond_0

    .line 177
    const/4 v0, 0x1

    .line 178
    .end local v4    # "result":Z
    .local v0, "result":Z
    nop

    .line 181
    .end local v5    # "oldSet":Ljava/lang/Object;
    .end local v6    # "currentModification":I
    .end local v7    # "newSet":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;
    :goto_0
    nop

    .line 161
    .end local v0    # "result":Z
    .end local v2    # "$this$conditionalUpdate_u24lambda_u2415":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .end local v3    # "$i$a$-run-SnapshotStateSet$conditionalUpdate$1":I
    nop

    .line 182
    return v0

    .line 497
    .restart local v2    # "$this$conditionalUpdate_u24lambda_u2415":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .restart local v3    # "$i$a$-run-SnapshotStateSet$conditionalUpdate$1":I
    .restart local v4    # "result":Z
    .restart local v5    # "oldSet":Ljava/lang/Object;
    .restart local v6    # "currentModification":I
    .restart local v7    # "newSet":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;
    .restart local v8    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .restart local v10    # "$i$f$writable":I
    .restart local v11    # "$this$writable$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .restart local v12    # "$i$f$writable":I
    .restart local v13    # "snapshot$iv$iv":Ljava/lang/Object;
    .local v14, "$i$f$sync":I
    .restart local v15    # "lock$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v16    # "$i$f$synchronized":I
    :catchall_0
    move-exception v0

    monitor-exit v15

    throw v0

    .line 488
    .end local v10    # "$i$f$writable":I
    .end local v11    # "$this$writable$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v12    # "$i$f$writable":I
    .end local v13    # "snapshot$iv$iv":Ljava/lang/Object;
    .end local v14    # "$i$f$sync":I
    .end local v15    # "lock$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v16    # "$i$f$synchronized":I
    .local v7, "lock$iv":Ljava/lang/Object;
    .local v8, "$i$f$synchronized":I
    :catchall_1
    move-exception v0

    move-object/from16 v9, p1

    monitor-exit v7

    throw v0
.end method

.method public static synthetic getDebuggerDisplayValue$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getReadable$runtime_release$annotations()V
    .locals 0

    return-void
.end method

.method private final mutate(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 20
    .param p1, "block"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/Set<",
            "TT;>;+TR;>;)TR;"
        }
    .end annotation

    const/4 v1, 0x0

    .line 144
    .local v1, "$i$f$mutate":I
    const/4 v0, 0x0

    move-object v2, v0

    .line 145
    .local v2, "result":Ljava/lang/Object;
    :goto_0
    nop

    .line 146
    const/4 v3, 0x0

    .line 147
    .local v3, "oldSet":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 148
    .local v4, "currentModification":I
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotStateSetKt;->access$getSync$p()Ljava/lang/Object;

    move-result-object v5

    .local v5, "lock$iv":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 471
    .local v6, "$i$f$synchronized":I
    nop

    .line 472
    monitor-enter v5

    const/4 v0, 0x0

    .line 149
    .local v0, "$i$a$-synchronized-SnapshotStateSet$mutate$1":I
    move-object/from16 v7, p0

    .local v7, "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    const/4 v8, 0x0

    .line 473
    .local v8, "$i$f$withCurrent":I
    :try_start_0
    invoke-virtual {v7}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v9

    const-string/jumbo v10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v9, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    check-cast v9, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v9, "$this$withCurrent$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v10, 0x0

    .line 474
    .local v10, "$i$f$withCurrent":I
    invoke-static {v9}, Landroidx/compose/runtime/snapshots/SnapshotKt;->current(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v11

    check-cast v11, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    .local v11, "$this$mutate_u24lambda_u2410_u24lambda_u249":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    const/4 v12, 0x0

    .line 149
    .local v12, "$i$a$-withCurrent-SnapshotStateSet$mutate$1$current$1":I
    nop

    .line 474
    .end local v11    # "$this$mutate_u24lambda_u2410_u24lambda_u249":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    .end local v12    # "$i$a$-withCurrent-SnapshotStateSet$mutate$1$current$1":I
    nop

    .line 473
    .end local v9    # "$this$withCurrent$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v10    # "$i$f$withCurrent":I
    nop

    .line 149
    .end local v7    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .end local v8    # "$i$f$withCurrent":I
    nop

    .line 150
    .local v11, "current":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    invoke-virtual {v11}, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;->getModification$runtime_release()I

    move-result v7

    move v4, v7

    .line 151
    invoke-virtual {v11}, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;->getSet$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;

    move-result-object v7

    move-object v3, v7

    .line 152
    nop

    .end local v0    # "$i$a$-synchronized-SnapshotStateSet$mutate$1":I
    .end local v11    # "current":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 472
    monitor-exit v5

    .line 153
    .end local v5    # "lock$iv":Ljava/lang/Object;
    .end local v6    # "$i$f$synchronized":I
    if-eqz v3, :cond_2

    invoke-interface {v3}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;->builder()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;

    move-result-object v0

    if-eqz v0, :cond_2

    move-object v5, v0

    .line 154
    .local v5, "builder":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;
    move-object/from16 v7, p1

    invoke-interface {v7, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 155
    invoke-interface {v5}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;->build()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;

    move-result-object v6

    .line 156
    .local v6, "newSet":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;
    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    move-object/from16 v8, p0

    .local v8, "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    const/4 v9, 0x0

    .line 475
    .local v9, "$i$f$writable":I
    invoke-virtual {v8}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    const-string/jumbo v10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>"

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    move-object v10, v0

    check-cast v10, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v10, "$this$writable$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v11, 0x0

    .line 476
    .local v11, "$i$f$writable":I
    const/4 v12, 0x0

    .line 477
    .local v12, "snapshot$iv$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 478
    .local v13, "$i$f$sync":I
    nop

    .line 479
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->getLock()Ljava/lang/Object;

    move-result-object v14

    .local v14, "lock$iv$iv$iv$iv":Ljava/lang/Object;
    const/4 v15, 0x0

    .line 480
    .local v15, "$i$f$synchronized":I
    nop

    .line 481
    monitor-enter v14

    const/4 v0, 0x0

    .line 482
    .local v0, "$i$a$-sync-SnapshotKt$writable$3$iv$iv":I
    :try_start_1
    sget-object v16, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v16

    move-object/from16 v12, v16

    .line 483
    move/from16 v16, v0

    .end local v0    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv":I
    .local v16, "$i$a$-sync-SnapshotKt$writable$3$iv$iv":I
    move-object v0, v8

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v10, v0, v12}, Landroidx/compose/runtime/snapshots/SnapshotKt;->writableRecord(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .local v0, "$this$mutate_u24lambda_u2411":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    const/16 v17, 0x0

    .line 156
    .local v17, "$i$a$-writable-SnapshotStateSet$mutate$2":I
    move/from16 v18, v1

    move-object/from16 v1, p0

    .end local v1    # "$i$f$mutate":I
    .local v18, "$i$f$mutate":I
    :try_start_2
    invoke-direct {v1, v0, v4, v6}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->attemptUpdate(Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;)Z

    move-result v19
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 483
    .end local v0    # "$this$mutate_u24lambda_u2411":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    .end local v17    # "$i$a$-writable-SnapshotStateSet$mutate$2":I
    nop

    .line 481
    .end local v16    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv":I
    monitor-exit v14

    .line 479
    .end local v14    # "lock$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v15    # "$i$f$synchronized":I
    nop

    .line 485
    .end local v13    # "$i$f$sync":I
    move/from16 v0, v19

    .line 486
    .local v0, "it$iv$iv":Z
    const/4 v13, 0x0

    .line 485
    .local v13, "$i$a$-also-SnapshotKt$writable$4$iv$iv":I
    move-object v14, v8

    check-cast v14, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v12, v14}, Landroidx/compose/runtime/snapshots/SnapshotKt;->notifyWrite(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateObject;)V

    .line 477
    .end local v0    # "it$iv$iv":Z
    .end local v13    # "$i$a$-also-SnapshotKt$writable$4$iv$iv":I
    nop

    .line 475
    .end local v10    # "$this$writable$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v11    # "$i$f$writable":I
    .end local v12    # "snapshot$iv$iv":Ljava/lang/Object;
    nop

    .line 156
    .end local v8    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .end local v9    # "$i$f$writable":I
    if-eqz v19, :cond_0

    goto :goto_2

    :cond_0
    move/from16 v1, v18

    goto/16 :goto_0

    .line 481
    .restart local v8    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .restart local v9    # "$i$f$writable":I
    .restart local v10    # "$this$writable$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .restart local v11    # "$i$f$writable":I
    .restart local v12    # "snapshot$iv$iv":Ljava/lang/Object;
    .local v13, "$i$f$sync":I
    .restart local v14    # "lock$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v15    # "$i$f$synchronized":I
    :catchall_0
    move-exception v0

    goto :goto_1

    .end local v18    # "$i$f$mutate":I
    .restart local v1    # "$i$f$mutate":I
    :catchall_1
    move-exception v0

    move/from16 v18, v1

    move-object/from16 v1, p0

    .end local v1    # "$i$f$mutate":I
    .restart local v18    # "$i$f$mutate":I
    :goto_1
    monitor-exit v14

    throw v0

    .line 156
    .end local v8    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .end local v9    # "$i$f$writable":I
    .end local v10    # "$this$writable$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v11    # "$i$f$writable":I
    .end local v12    # "snapshot$iv$iv":Ljava/lang/Object;
    .end local v13    # "$i$f$sync":I
    .end local v14    # "lock$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v15    # "$i$f$synchronized":I
    .end local v18    # "$i$f$mutate":I
    .restart local v1    # "$i$f$mutate":I
    :cond_1
    move/from16 v18, v1

    move-object/from16 v1, p0

    .line 158
    .end local v1    # "$i$f$mutate":I
    .end local v3    # "oldSet":Ljava/lang/Object;
    .end local v4    # "currentModification":I
    .end local v5    # "builder":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;
    .end local v6    # "newSet":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;
    .restart local v18    # "$i$f$mutate":I
    :goto_2
    return-object v2

    .line 153
    .end local v18    # "$i$f$mutate":I
    .restart local v1    # "$i$f$mutate":I
    .restart local v3    # "oldSet":Ljava/lang/Object;
    .restart local v4    # "currentModification":I
    :cond_2
    move-object/from16 v7, p1

    move/from16 v18, v1

    move-object/from16 v1, p0

    .end local v1    # "$i$f$mutate":I
    .restart local v18    # "$i$f$mutate":I
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v5, "No set to mutate"

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 472
    .end local v18    # "$i$f$mutate":I
    .restart local v1    # "$i$f$mutate":I
    .local v5, "lock$iv":Ljava/lang/Object;
    .local v6, "$i$f$synchronized":I
    :catchall_2
    move-exception v0

    move-object/from16 v7, p1

    move/from16 v18, v1

    move-object/from16 v1, p0

    .end local v1    # "$i$f$mutate":I
    .restart local v18    # "$i$f$mutate":I
    monitor-exit v5

    throw v0
.end method

.method private final mutateBoolean(Lkotlin/jvm/functions/Function1;)Z
    .locals 20
    .param p1, "block"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/Set<",
            "TT;>;",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    .line 141
    move-object/from16 v1, p0

    .local v1, "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    const/4 v2, 0x0

    .line 443
    .local v2, "$i$f$mutate":I
    const/4 v0, 0x0

    move-object v3, v0

    .line 444
    .local v3, "result$iv":Ljava/lang/Object;
    :cond_0
    nop

    .line 445
    const/4 v4, 0x0

    .line 446
    .local v4, "oldSet$iv":Ljava/lang/Object;
    const/4 v5, 0x0

    .line 447
    .local v5, "currentModification$iv":I
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotStateSetKt;->access$getSync$p()Ljava/lang/Object;

    move-result-object v6

    .local v6, "lock$iv$iv":Ljava/lang/Object;
    const/4 v7, 0x0

    .line 448
    .local v7, "$i$f$synchronized":I
    nop

    .line 449
    monitor-enter v6

    const/4 v0, 0x0

    .line 450
    .local v0, "$i$a$-synchronized-SnapshotStateSet$mutate$1$iv":I
    move-object v8, v1

    .local v8, "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    const/4 v9, 0x0

    .line 451
    .local v9, "$i$f$withCurrent":I
    :try_start_0
    invoke-virtual {v8}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v10

    const-string/jumbo v11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    check-cast v10, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v10, "$this$withCurrent$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v11, 0x0

    .line 452
    .local v11, "$i$f$withCurrent":I
    invoke-static {v10}, Landroidx/compose/runtime/snapshots/SnapshotKt;->current(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v12

    check-cast v12, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    .local v12, "$this$mutate_u24lambda_u2410_u24lambda_u249$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    const/4 v13, 0x0

    .line 450
    .local v13, "$i$a$-withCurrent-SnapshotStateSet$mutate$1$current$1$iv":I
    nop

    .line 452
    .end local v12    # "$this$mutate_u24lambda_u2410_u24lambda_u249$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    .end local v13    # "$i$a$-withCurrent-SnapshotStateSet$mutate$1$current$1$iv":I
    nop

    .line 451
    .end local v10    # "$this$withCurrent$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v11    # "$i$f$withCurrent":I
    nop

    .line 450
    .end local v8    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .end local v9    # "$i$f$withCurrent":I
    nop

    .line 453
    .local v12, "current$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    invoke-virtual {v12}, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;->getModification$runtime_release()I

    move-result v8

    move v5, v8

    .line 454
    invoke-virtual {v12}, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;->getSet$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;

    move-result-object v8

    move-object v4, v8

    .line 455
    nop

    .end local v0    # "$i$a$-synchronized-SnapshotStateSet$mutate$1$iv":I
    .end local v12    # "current$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 449
    monitor-exit v6

    .line 456
    .end local v6    # "lock$iv$iv":Ljava/lang/Object;
    .end local v7    # "$i$f$synchronized":I
    if-eqz v4, :cond_2

    invoke-interface {v4}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;->builder()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;

    move-result-object v0

    if-eqz v0, :cond_2

    move-object v6, v0

    .line 457
    .local v6, "builder$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;
    move-object/from16 v8, p1

    invoke-interface {v8, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 458
    invoke-interface {v6}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;->build()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;

    move-result-object v7

    .line 459
    .local v7, "newSet$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;
    invoke-static {v7, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    move-object v9, v1

    .local v9, "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    const/4 v10, 0x0

    .line 460
    .local v10, "$i$f$writable":I
    invoke-virtual {v9}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    const-string/jumbo v11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>"

    invoke-static {v0, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    move-object v11, v0

    check-cast v11, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v11, "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v12, 0x0

    .line 461
    .local v12, "$i$f$writable":I
    const/4 v13, 0x0

    .line 462
    .local v13, "snapshot$iv$iv$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 463
    .local v14, "$i$f$sync":I
    nop

    .line 464
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->getLock()Ljava/lang/Object;

    move-result-object v15

    .local v15, "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 448
    .local v16, "$i$f$synchronized":I
    nop

    .line 449
    monitor-enter v15

    const/4 v0, 0x0

    .line 465
    .local v0, "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    :try_start_1
    sget-object v17, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v17

    move-object/from16 v13, v17

    .line 466
    move/from16 v17, v0

    .end local v0    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    .local v17, "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    move-object v0, v9

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v11, v0, v13}, Landroidx/compose/runtime/snapshots/SnapshotKt;->writableRecord(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    .local v0, "$this$mutate_u24lambda_u2411$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    const/16 v18, 0x0

    .line 459
    .local v18, "$i$a$-writable-SnapshotStateSet$mutate$2$iv":I
    invoke-direct {v1, v0, v5, v7}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->attemptUpdate(Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;)Z

    move-result v19
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 466
    .end local v0    # "$this$mutate_u24lambda_u2411$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    .end local v18    # "$i$a$-writable-SnapshotStateSet$mutate$2$iv":I
    nop

    .line 449
    .end local v17    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    monitor-exit v15

    .line 464
    .end local v15    # "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v16    # "$i$f$synchronized":I
    nop

    .line 468
    .end local v14    # "$i$f$sync":I
    move/from16 v0, v19

    .line 469
    .local v0, "it$iv$iv$iv":Z
    const/4 v14, 0x0

    .line 468
    .local v14, "$i$a$-also-SnapshotKt$writable$4$iv$iv$iv":I
    move-object v15, v9

    check-cast v15, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v13, v15}, Landroidx/compose/runtime/snapshots/SnapshotKt;->notifyWrite(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateObject;)V

    .line 462
    .end local v0    # "it$iv$iv$iv":Z
    .end local v14    # "$i$a$-also-SnapshotKt$writable$4$iv$iv$iv":I
    nop

    .line 460
    .end local v11    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v12    # "$i$f$writable":I
    .end local v13    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    nop

    .line 459
    .end local v9    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .end local v10    # "$i$f$writable":I
    if-eqz v19, :cond_0

    goto :goto_0

    .line 449
    .restart local v9    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .restart local v10    # "$i$f$writable":I
    .restart local v11    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .restart local v12    # "$i$f$writable":I
    .restart local v13    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    .local v14, "$i$f$sync":I
    .restart local v15    # "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v16    # "$i$f$synchronized":I
    :catchall_0
    move-exception v0

    monitor-exit v15

    throw v0

    .line 470
    .end local v4    # "oldSet$iv":Ljava/lang/Object;
    .end local v5    # "currentModification$iv":I
    .end local v6    # "builder$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;
    .end local v7    # "newSet$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;
    .end local v9    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .end local v10    # "$i$f$writable":I
    .end local v11    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v12    # "$i$f$writable":I
    .end local v13    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    .end local v14    # "$i$f$sync":I
    .end local v15    # "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v16    # "$i$f$synchronized":I
    :cond_1
    :goto_0
    nop

    .end local v1    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .end local v2    # "$i$f$mutate":I
    .end local v3    # "result$iv":Ljava/lang/Object;
    move-object v0, v3

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 141
    return v0

    .line 456
    .restart local v1    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .restart local v2    # "$i$f$mutate":I
    .restart local v3    # "result$iv":Ljava/lang/Object;
    .restart local v4    # "oldSet$iv":Ljava/lang/Object;
    .restart local v5    # "currentModification$iv":I
    :cond_2
    move-object/from16 v8, p1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v6, "No set to mutate"

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 449
    .local v6, "lock$iv$iv":Ljava/lang/Object;
    .local v7, "$i$f$synchronized":I
    :catchall_1
    move-exception v0

    move-object/from16 v8, p1

    monitor-exit v6

    throw v0
.end method

.method private final stateRecordWith(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;)Landroidx/compose/runtime/snapshots/StateRecord;
    .locals 6
    .param p1, "set"    # Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet<",
            "+TT;>;)",
            "Landroidx/compose/runtime/snapshots/StateRecord;"
        }
    .end annotation

    .line 198
    new-instance v0, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->currentSnapshot()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/Snapshot;->getSnapshotId()J

    move-result-wide v1

    invoke-direct {v0, v1, v2, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;-><init>(JLandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;)V

    move-object v1, v0

    .local v1, "it":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    const/4 v2, 0x0

    .line 199
    .local v2, "$i$a$-also-SnapshotStateSet$stateRecordWith$1":I
    sget-object v3, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->isInSnapshot()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 200
    new-instance v3, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    const/4 v4, 0x1

    invoke-static {v4}, Landroidx/compose/runtime/snapshots/SnapshotId_jvmKt;->toSnapshotId(I)J

    move-result-wide v4

    invoke-direct {v3, v4, v5, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;-><init>(JLandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;)V

    check-cast v3, Landroidx/compose/runtime/snapshots/StateRecord;

    invoke-virtual {v1, v3}, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;->setNext$runtime_release(Landroidx/compose/runtime/snapshots/StateRecord;)V

    .line 202
    :cond_0
    nop

    .line 198
    .end local v1    # "it":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    .end local v2    # "$i$a$-also-SnapshotStateSet$stateRecordWith$1":I
    check-cast v0, Landroidx/compose/runtime/snapshots/StateRecord;

    return-object v0
.end method

.method private final withCurrent(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 4
    .param p1, "block"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord<",
            "TT;>;+TR;>;)TR;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 139
    .local v0, "$i$f$withCurrent":I
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v1

    const-string/jumbo v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    check-cast v1, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v1, "$this$withCurrent$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v2, 0x0

    .line 442
    .local v2, "$i$f$withCurrent":I
    invoke-static {v1}, Landroidx/compose/runtime/snapshots/SnapshotKt;->current(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v3

    invoke-interface {p1, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 139
    .end local v1    # "$this$withCurrent$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v2    # "$i$f$withCurrent":I
    return-object v1
.end method

.method private final writable(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 9
    .param p1, "block"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord<",
            "TT;>;+TR;>;)TR;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 136
    .local v0, "$i$f$writable":I
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v1

    const-string/jumbo v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    check-cast v1, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v1, "$this$writable$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v2, 0x0

    .line 431
    .local v2, "$i$f$writable":I
    const/4 v3, 0x0

    .line 432
    .local v3, "snapshot$iv":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 433
    .local v4, "$i$f$sync":I
    nop

    .line 434
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->getLock()Ljava/lang/Object;

    move-result-object v5

    .local v5, "lock$iv$iv$iv":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 435
    .local v6, "$i$f$synchronized":I
    nop

    .line 436
    monitor-enter v5

    const/4 v7, 0x0

    .line 437
    .local v7, "$i$a$-sync-SnapshotKt$writable$3$iv":I
    :try_start_0
    sget-object v8, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    invoke-virtual {v8}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v8

    move-object v3, v8

    .line 438
    move-object v8, p0

    check-cast v8, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v1, v8, v3}, Landroidx/compose/runtime/snapshots/SnapshotKt;->writableRecord(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v8

    invoke-interface {p1, v8}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 436
    .end local v7    # "$i$a$-sync-SnapshotKt$writable$3$iv":I
    monitor-exit v5

    .line 434
    .end local v5    # "lock$iv$iv$iv":Ljava/lang/Object;
    .end local v6    # "$i$f$synchronized":I
    nop

    .line 440
    .end local v4    # "$i$f$sync":I
    move-object v4, v8

    .line 441
    .local v4, "it$iv":Ljava/lang/Object;
    const/4 v5, 0x0

    .line 440
    .local v5, "$i$a$-also-SnapshotKt$writable$4$iv":I
    move-object v6, p0

    check-cast v6, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v3, v6}, Landroidx/compose/runtime/snapshots/SnapshotKt;->notifyWrite(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateObject;)V

    .line 432
    .end local v4    # "it$iv":Ljava/lang/Object;
    .end local v5    # "$i$a$-also-SnapshotKt$writable$4$iv":I
    nop

    .line 136
    .end local v1    # "$this$writable$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v2    # "$i$f$writable":I
    .end local v3    # "snapshot$iv":Ljava/lang/Object;
    return-object v8

    .line 436
    .restart local v1    # "$this$writable$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .restart local v2    # "$i$f$writable":I
    .restart local v3    # "snapshot$iv":Ljava/lang/Object;
    .local v4, "$i$f$sync":I
    .local v5, "lock$iv$iv$iv":Ljava/lang/Object;
    .restart local v6    # "$i$f$synchronized":I
    :catchall_0
    move-exception v7

    monitor-exit v5

    throw v7
.end method


# virtual methods
.method public add(Ljava/lang/Object;)Z
    .locals 21
    .param p1, "element"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .line 105
    move-object/from16 v1, p0

    .local v1, "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    const/4 v2, 0x0

    .line 272
    .local v2, "$i$f$conditionalUpdate":I
    move-object v3, v1

    check-cast v3, Landroidx/compose/runtime/snapshots/SnapshotStateSet;

    .local v3, "$this$conditionalUpdate_u24lambda_u2415$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    const/4 v4, 0x0

    .line 273
    .local v4, "$i$a$-run-SnapshotStateSet$conditionalUpdate$1$iv":I
    const/4 v5, 0x0

    .line 274
    .local v5, "result$iv":Z
    :cond_0
    nop

    .line 275
    const/4 v6, 0x0

    .line 276
    .local v6, "oldSet$iv":Ljava/lang/Object;
    const/4 v7, 0x0

    .line 277
    .local v7, "currentModification$iv":I
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotStateSetKt;->access$getSync$p()Ljava/lang/Object;

    move-result-object v8

    .local v8, "lock$iv$iv":Ljava/lang/Object;
    const/4 v9, 0x0

    .line 278
    .local v9, "$i$f$synchronized":I
    nop

    .line 279
    monitor-enter v8

    const/4 v0, 0x0

    .line 280
    .local v0, "$i$a$-synchronized-SnapshotStateSet$conditionalUpdate$1$1$iv":I
    move-object v10, v3

    .local v10, "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    const/4 v11, 0x0

    .line 281
    .local v11, "$i$f$withCurrent":I
    :try_start_0
    invoke-virtual {v10}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v12

    const-string/jumbo v13, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v12, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    check-cast v12, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v12, "$this$withCurrent$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v13, 0x0

    .line 282
    .local v13, "$i$f$withCurrent":I
    invoke-static {v12}, Landroidx/compose/runtime/snapshots/SnapshotKt;->current(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v14

    check-cast v14, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    .local v14, "$this$conditionalUpdate_u24lambda_u2415_u24lambda_u2413_u24lambda_u2412$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    const/4 v15, 0x0

    .line 280
    .local v15, "$i$a$-withCurrent-SnapshotStateSet$conditionalUpdate$1$1$current$1$iv":I
    nop

    .line 282
    .end local v14    # "$this$conditionalUpdate_u24lambda_u2415_u24lambda_u2413_u24lambda_u2412$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    .end local v15    # "$i$a$-withCurrent-SnapshotStateSet$conditionalUpdate$1$1$current$1$iv":I
    nop

    .line 281
    .end local v12    # "$this$withCurrent$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v13    # "$i$f$withCurrent":I
    nop

    .line 280
    .end local v10    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .end local v11    # "$i$f$withCurrent":I
    nop

    .line 283
    .local v14, "current$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    invoke-virtual {v14}, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;->getModification$runtime_release()I

    move-result v10

    move v7, v10

    .line 284
    invoke-virtual {v14}, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;->getSet$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;

    move-result-object v10

    move-object v6, v10

    .line 285
    nop

    .end local v0    # "$i$a$-synchronized-SnapshotStateSet$conditionalUpdate$1$1$iv":I
    .end local v14    # "current$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 279
    monitor-exit v8

    .line 286
    .end local v8    # "lock$iv$iv":Ljava/lang/Object;
    .end local v9    # "$i$f$synchronized":I
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v0, v6

    .local v0, "it":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;
    const/4 v8, 0x0

    .line 105
    .local v8, "$i$a$-conditionalUpdate-SnapshotStateSet$add$1":I
    move-object/from16 v10, p1

    invoke-interface {v0, v10}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;->add(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;

    move-result-object v0

    .line 286
    .end local v0    # "it":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;
    .end local v8    # "$i$a$-conditionalUpdate-SnapshotStateSet$add$1":I
    move-object v8, v0

    .line 287
    .local v8, "newSet$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;
    invoke-static {v8, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 288
    const/4 v0, 0x0

    .line 289
    .end local v5    # "result$iv":Z
    .local v0, "result$iv":Z
    goto :goto_0

    .line 291
    .end local v0    # "result$iv":Z
    .restart local v5    # "result$iv":Z
    :cond_1
    move-object v9, v3

    .local v9, "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    const/4 v11, 0x0

    .line 292
    .local v11, "$i$f$writable":I
    invoke-virtual {v9}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    const-string/jumbo v12, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>"

    invoke-static {v0, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    move-object v12, v0

    check-cast v12, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v12, "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v13, 0x0

    .line 293
    .local v13, "$i$f$writable":I
    const/4 v14, 0x0

    .line 294
    .local v14, "snapshot$iv$iv$iv":Ljava/lang/Object;
    const/4 v15, 0x0

    .line 295
    .local v15, "$i$f$sync":I
    nop

    .line 296
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->getLock()Ljava/lang/Object;

    move-result-object v16

    .local v16, "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    const/16 v17, 0x0

    .line 278
    .local v17, "$i$f$synchronized":I
    nop

    .line 279
    monitor-enter v16

    const/4 v0, 0x0

    .line 297
    .local v0, "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    :try_start_1
    sget-object v18, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v18

    move-object/from16 v14, v18

    .line 298
    move/from16 v18, v0

    .end local v0    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    .local v18, "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    move-object v0, v9

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v12, v0, v14}, Landroidx/compose/runtime/snapshots/SnapshotKt;->writableRecord(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    .local v0, "$this$conditionalUpdate_u24lambda_u2415_u24lambda_u2414$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    const/16 v19, 0x0

    .line 291
    .local v19, "$i$a$-writable-SnapshotStateSet$conditionalUpdate$1$2$iv":I
    invoke-direct {v3, v0, v7, v8}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->attemptUpdate(Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;)Z

    move-result v20
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 298
    .end local v0    # "$this$conditionalUpdate_u24lambda_u2415_u24lambda_u2414$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    .end local v19    # "$i$a$-writable-SnapshotStateSet$conditionalUpdate$1$2$iv":I
    nop

    .line 279
    .end local v18    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    monitor-exit v16

    .line 296
    .end local v16    # "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v17    # "$i$f$synchronized":I
    nop

    .line 300
    .end local v15    # "$i$f$sync":I
    move/from16 v0, v20

    .line 301
    .local v0, "it$iv$iv$iv":Z
    const/4 v15, 0x0

    .line 300
    .local v15, "$i$a$-also-SnapshotKt$writable$4$iv$iv$iv":I
    move/from16 v16, v0

    .end local v0    # "it$iv$iv$iv":Z
    .local v16, "it$iv$iv$iv":Z
    move-object v0, v9

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v14, v0}, Landroidx/compose/runtime/snapshots/SnapshotKt;->notifyWrite(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateObject;)V

    .line 294
    .end local v15    # "$i$a$-also-SnapshotKt$writable$4$iv$iv$iv":I
    .end local v16    # "it$iv$iv$iv":Z
    nop

    .line 292
    .end local v12    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v13    # "$i$f$writable":I
    .end local v14    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    nop

    .line 291
    .end local v9    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .end local v11    # "$i$f$writable":I
    if-eqz v20, :cond_0

    .line 302
    const/4 v0, 0x1

    .line 303
    .end local v5    # "result$iv":Z
    .local v0, "result$iv":Z
    nop

    .line 306
    .end local v6    # "oldSet$iv":Ljava/lang/Object;
    .end local v7    # "currentModification$iv":I
    .end local v8    # "newSet$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;
    :goto_0
    nop

    .line 272
    .end local v0    # "result$iv":Z
    .end local v3    # "$this$conditionalUpdate_u24lambda_u2415$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .end local v4    # "$i$a$-run-SnapshotStateSet$conditionalUpdate$1$iv":I
    nop

    .line 307
    nop

    .line 105
    .end local v1    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .end local v2    # "$i$f$conditionalUpdate":I
    return v0

    .line 279
    .restart local v1    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .restart local v2    # "$i$f$conditionalUpdate":I
    .restart local v3    # "$this$conditionalUpdate_u24lambda_u2415$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .restart local v4    # "$i$a$-run-SnapshotStateSet$conditionalUpdate$1$iv":I
    .restart local v5    # "result$iv":Z
    .restart local v6    # "oldSet$iv":Ljava/lang/Object;
    .restart local v7    # "currentModification$iv":I
    .restart local v8    # "newSet$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;
    .restart local v9    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .restart local v11    # "$i$f$writable":I
    .restart local v12    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .restart local v13    # "$i$f$writable":I
    .restart local v14    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    .local v15, "$i$f$sync":I
    .local v16, "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v17    # "$i$f$synchronized":I
    :catchall_0
    move-exception v0

    monitor-exit v16

    throw v0

    .end local v11    # "$i$f$writable":I
    .end local v12    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v13    # "$i$f$writable":I
    .end local v14    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    .end local v15    # "$i$f$sync":I
    .end local v16    # "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v17    # "$i$f$synchronized":I
    .local v8, "lock$iv$iv":Ljava/lang/Object;
    .local v9, "$i$f$synchronized":I
    :catchall_1
    move-exception v0

    move-object/from16 v10, p1

    monitor-exit v8

    throw v0
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 21
    .param p1, "elements"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+TT;>;)Z"
        }
    .end annotation

    .line 107
    move-object/from16 v1, p0

    .local v1, "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    const/4 v2, 0x0

    .line 308
    .local v2, "$i$f$conditionalUpdate":I
    move-object v3, v1

    check-cast v3, Landroidx/compose/runtime/snapshots/SnapshotStateSet;

    .local v3, "$this$conditionalUpdate_u24lambda_u2415$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    const/4 v4, 0x0

    .line 309
    .local v4, "$i$a$-run-SnapshotStateSet$conditionalUpdate$1$iv":I
    const/4 v5, 0x0

    .line 310
    .local v5, "result$iv":Z
    :cond_0
    nop

    .line 311
    const/4 v6, 0x0

    .line 312
    .local v6, "oldSet$iv":Ljava/lang/Object;
    const/4 v7, 0x0

    .line 313
    .local v7, "currentModification$iv":I
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotStateSetKt;->access$getSync$p()Ljava/lang/Object;

    move-result-object v8

    .local v8, "lock$iv$iv":Ljava/lang/Object;
    const/4 v9, 0x0

    .line 314
    .local v9, "$i$f$synchronized":I
    nop

    .line 315
    monitor-enter v8

    const/4 v0, 0x0

    .line 316
    .local v0, "$i$a$-synchronized-SnapshotStateSet$conditionalUpdate$1$1$iv":I
    move-object v10, v3

    .local v10, "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    const/4 v11, 0x0

    .line 317
    .local v11, "$i$f$withCurrent":I
    :try_start_0
    invoke-virtual {v10}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v12

    const-string/jumbo v13, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v12, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    check-cast v12, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v12, "$this$withCurrent$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v13, 0x0

    .line 318
    .local v13, "$i$f$withCurrent":I
    invoke-static {v12}, Landroidx/compose/runtime/snapshots/SnapshotKt;->current(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v14

    check-cast v14, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    .local v14, "$this$conditionalUpdate_u24lambda_u2415_u24lambda_u2413_u24lambda_u2412$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    const/4 v15, 0x0

    .line 316
    .local v15, "$i$a$-withCurrent-SnapshotStateSet$conditionalUpdate$1$1$current$1$iv":I
    nop

    .line 318
    .end local v14    # "$this$conditionalUpdate_u24lambda_u2415_u24lambda_u2413_u24lambda_u2412$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    .end local v15    # "$i$a$-withCurrent-SnapshotStateSet$conditionalUpdate$1$1$current$1$iv":I
    nop

    .line 317
    .end local v12    # "$this$withCurrent$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v13    # "$i$f$withCurrent":I
    nop

    .line 316
    .end local v10    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .end local v11    # "$i$f$withCurrent":I
    nop

    .line 319
    .local v14, "current$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    invoke-virtual {v14}, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;->getModification$runtime_release()I

    move-result v10

    move v7, v10

    .line 320
    invoke-virtual {v14}, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;->getSet$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;

    move-result-object v10

    move-object v6, v10

    .line 321
    nop

    .end local v0    # "$i$a$-synchronized-SnapshotStateSet$conditionalUpdate$1$1$iv":I
    .end local v14    # "current$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 315
    monitor-exit v8

    .line 322
    .end local v8    # "lock$iv$iv":Ljava/lang/Object;
    .end local v9    # "$i$f$synchronized":I
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v0, v6

    .local v0, "it":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;
    const/4 v8, 0x0

    .line 107
    .local v8, "$i$a$-conditionalUpdate-SnapshotStateSet$addAll$1":I
    move-object/from16 v10, p1

    invoke-interface {v0, v10}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;->addAll(Ljava/util/Collection;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;

    move-result-object v0

    .line 322
    .end local v0    # "it":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;
    .end local v8    # "$i$a$-conditionalUpdate-SnapshotStateSet$addAll$1":I
    move-object v8, v0

    .line 323
    .local v8, "newSet$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;
    invoke-static {v8, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 324
    const/4 v0, 0x0

    .line 325
    .end local v5    # "result$iv":Z
    .local v0, "result$iv":Z
    goto :goto_0

    .line 327
    .end local v0    # "result$iv":Z
    .restart local v5    # "result$iv":Z
    :cond_1
    move-object v9, v3

    .local v9, "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    const/4 v11, 0x0

    .line 328
    .local v11, "$i$f$writable":I
    invoke-virtual {v9}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    const-string/jumbo v12, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>"

    invoke-static {v0, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    move-object v12, v0

    check-cast v12, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v12, "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v13, 0x0

    .line 329
    .local v13, "$i$f$writable":I
    const/4 v14, 0x0

    .line 330
    .local v14, "snapshot$iv$iv$iv":Ljava/lang/Object;
    const/4 v15, 0x0

    .line 331
    .local v15, "$i$f$sync":I
    nop

    .line 332
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->getLock()Ljava/lang/Object;

    move-result-object v16

    .local v16, "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    const/16 v17, 0x0

    .line 314
    .local v17, "$i$f$synchronized":I
    nop

    .line 315
    monitor-enter v16

    const/4 v0, 0x0

    .line 333
    .local v0, "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    :try_start_1
    sget-object v18, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v18

    move-object/from16 v14, v18

    .line 334
    move/from16 v18, v0

    .end local v0    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    .local v18, "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    move-object v0, v9

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v12, v0, v14}, Landroidx/compose/runtime/snapshots/SnapshotKt;->writableRecord(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    .local v0, "$this$conditionalUpdate_u24lambda_u2415_u24lambda_u2414$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    const/16 v19, 0x0

    .line 327
    .local v19, "$i$a$-writable-SnapshotStateSet$conditionalUpdate$1$2$iv":I
    invoke-direct {v3, v0, v7, v8}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->attemptUpdate(Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;)Z

    move-result v20
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 334
    .end local v0    # "$this$conditionalUpdate_u24lambda_u2415_u24lambda_u2414$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    .end local v19    # "$i$a$-writable-SnapshotStateSet$conditionalUpdate$1$2$iv":I
    nop

    .line 315
    .end local v18    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    monitor-exit v16

    .line 332
    .end local v16    # "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v17    # "$i$f$synchronized":I
    nop

    .line 336
    .end local v15    # "$i$f$sync":I
    move/from16 v0, v20

    .line 337
    .local v0, "it$iv$iv$iv":Z
    const/4 v15, 0x0

    .line 336
    .local v15, "$i$a$-also-SnapshotKt$writable$4$iv$iv$iv":I
    move/from16 v16, v0

    .end local v0    # "it$iv$iv$iv":Z
    .local v16, "it$iv$iv$iv":Z
    move-object v0, v9

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v14, v0}, Landroidx/compose/runtime/snapshots/SnapshotKt;->notifyWrite(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateObject;)V

    .line 330
    .end local v15    # "$i$a$-also-SnapshotKt$writable$4$iv$iv$iv":I
    .end local v16    # "it$iv$iv$iv":Z
    nop

    .line 328
    .end local v12    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v13    # "$i$f$writable":I
    .end local v14    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    nop

    .line 327
    .end local v9    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .end local v11    # "$i$f$writable":I
    if-eqz v20, :cond_0

    .line 338
    const/4 v0, 0x1

    .line 339
    .end local v5    # "result$iv":Z
    .local v0, "result$iv":Z
    nop

    .line 342
    .end local v6    # "oldSet$iv":Ljava/lang/Object;
    .end local v7    # "currentModification$iv":I
    .end local v8    # "newSet$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;
    :goto_0
    nop

    .line 308
    .end local v0    # "result$iv":Z
    .end local v3    # "$this$conditionalUpdate_u24lambda_u2415$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .end local v4    # "$i$a$-run-SnapshotStateSet$conditionalUpdate$1$iv":I
    nop

    .line 343
    nop

    .line 107
    .end local v1    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .end local v2    # "$i$f$conditionalUpdate":I
    return v0

    .line 315
    .restart local v1    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .restart local v2    # "$i$f$conditionalUpdate":I
    .restart local v3    # "$this$conditionalUpdate_u24lambda_u2415$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .restart local v4    # "$i$a$-run-SnapshotStateSet$conditionalUpdate$1$iv":I
    .restart local v5    # "result$iv":Z
    .restart local v6    # "oldSet$iv":Ljava/lang/Object;
    .restart local v7    # "currentModification$iv":I
    .restart local v8    # "newSet$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;
    .restart local v9    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .restart local v11    # "$i$f$writable":I
    .restart local v12    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .restart local v13    # "$i$f$writable":I
    .restart local v14    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    .local v15, "$i$f$sync":I
    .local v16, "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v17    # "$i$f$synchronized":I
    :catchall_0
    move-exception v0

    monitor-exit v16

    throw v0

    .end local v11    # "$i$f$writable":I
    .end local v12    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v13    # "$i$f$writable":I
    .end local v14    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    .end local v15    # "$i$f$sync":I
    .end local v16    # "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v17    # "$i$f$synchronized":I
    .local v8, "lock$iv$iv":Ljava/lang/Object;
    .local v9, "$i$f$synchronized":I
    :catchall_1
    move-exception v0

    move-object/from16 v10, p1

    monitor-exit v8

    throw v0
.end method

.method public clear()V
    .locals 16

    .line 110
    move-object/from16 v1, p0

    .local v1, "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    const/4 v2, 0x0

    .line 344
    .local v2, "$i$f$writable":I
    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    const-string/jumbo v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    move-object v3, v0

    check-cast v3, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v3, "$this$writable$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v4, 0x0

    .line 345
    .local v4, "$i$f$writable":I
    const/4 v5, 0x0

    .line 346
    .local v5, "snapshot$iv$iv":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 347
    .local v6, "$i$f$sync":I
    nop

    .line 348
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->getLock()Ljava/lang/Object;

    move-result-object v7

    .local v7, "lock$iv$iv$iv$iv":Ljava/lang/Object;
    const/4 v8, 0x0

    .line 349
    .local v8, "$i$f$synchronized":I
    nop

    .line 350
    monitor-enter v7

    const/4 v9, 0x0

    .line 351
    .local v9, "$i$a$-sync-SnapshotKt$writable$3$iv$iv":I
    :try_start_0
    sget-object v0, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v0

    move-object v5, v0

    .line 352
    move-object v0, v1

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v3, v0, v5}, Landroidx/compose/runtime/snapshots/SnapshotKt;->writableRecord(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    move-object v10, v0

    .local v10, "$this$clear_u24lambda_u245":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    const/4 v11, 0x0

    .line 111
    .local v11, "$i$a$-writable-SnapshotStateSet$clear$1":I
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotStateSetKt;->access$getSync$p()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    .local v12, "lock$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 353
    .local v13, "$i$f$synchronized":I
    nop

    .line 354
    monitor-enter v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v0, 0x0

    .line 112
    .local v0, "$i$a$-synchronized-SnapshotStateSet$clear$1$1":I
    :try_start_1
    invoke-static {}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt;->persistentSetOf()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;

    move-result-object v14

    invoke-virtual {v10, v14}, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;->setSet$runtime_release(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;)V

    .line 113
    invoke-virtual {v10}, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;->getModification$runtime_release()I

    move-result v14

    add-int/lit8 v15, v14, 0x1

    invoke-virtual {v10, v15}, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;->setModification$runtime_release(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 354
    .end local v0    # "$i$a$-synchronized-SnapshotStateSet$clear$1$1":I
    :try_start_2
    monitor-exit v12
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 114
    .end local v12    # "lock$iv":Ljava/lang/Object;
    .end local v13    # "$i$f$synchronized":I
    nop

    .line 352
    .end local v10    # "$this$clear_u24lambda_u245":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    .end local v11    # "$i$a$-writable-SnapshotStateSet$clear$1":I
    nop

    .line 350
    .end local v9    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv":I
    monitor-exit v7

    .line 348
    .end local v7    # "lock$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v8    # "$i$f$synchronized":I
    nop

    .line 355
    .end local v6    # "$i$f$sync":I
    nop

    .line 356
    .local v14, "it$iv$iv":I
    const/4 v0, 0x0

    .line 355
    .local v0, "$i$a$-also-SnapshotKt$writable$4$iv$iv":I
    move-object v6, v1

    check-cast v6, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v5, v6}, Landroidx/compose/runtime/snapshots/SnapshotKt;->notifyWrite(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateObject;)V

    .line 346
    .end local v0    # "$i$a$-also-SnapshotKt$writable$4$iv$iv":I
    .end local v14    # "it$iv$iv":I
    nop

    .line 344
    .end local v3    # "$this$writable$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v4    # "$i$f$writable":I
    .end local v5    # "snapshot$iv$iv":Ljava/lang/Object;
    nop

    .line 116
    .end local v1    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .end local v2    # "$i$f$writable":I
    return-void

    .line 354
    .restart local v1    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .restart local v2    # "$i$f$writable":I
    .restart local v3    # "$this$writable$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .restart local v4    # "$i$f$writable":I
    .restart local v5    # "snapshot$iv$iv":Ljava/lang/Object;
    .restart local v6    # "$i$f$sync":I
    .restart local v7    # "lock$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v8    # "$i$f$synchronized":I
    .restart local v9    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv":I
    .restart local v10    # "$this$clear_u24lambda_u245":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    .restart local v11    # "$i$a$-writable-SnapshotStateSet$clear$1":I
    .restart local v12    # "lock$iv":Ljava/lang/Object;
    .restart local v13    # "$i$f$synchronized":I
    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v12

    .end local v1    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .end local v2    # "$i$f$writable":I
    .end local v3    # "$this$writable$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v4    # "$i$f$writable":I
    .end local v5    # "snapshot$iv$iv":Ljava/lang/Object;
    .end local v6    # "$i$f$sync":I
    .end local v7    # "lock$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v8    # "$i$f$synchronized":I
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 350
    .end local v9    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv":I
    .end local v10    # "$this$clear_u24lambda_u245":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    .end local v11    # "$i$a$-writable-SnapshotStateSet$clear$1":I
    .end local v12    # "lock$iv":Ljava/lang/Object;
    .end local v13    # "$i$f$synchronized":I
    .restart local v1    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .restart local v2    # "$i$f$writable":I
    .restart local v3    # "$this$writable$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .restart local v4    # "$i$f$writable":I
    .restart local v5    # "snapshot$iv$iv":Ljava/lang/Object;
    .restart local v6    # "$i$f$sync":I
    .restart local v7    # "lock$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v8    # "$i$f$synchronized":I
    :catchall_1
    move-exception v0

    monitor-exit v7

    throw v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "element"    # Ljava/lang/Object;

    .line 91
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->getReadable$runtime_release()Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;->getSet$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;

    move-result-object v0

    invoke-interface {v0, p1}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 1
    .param p1, "elements"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .line 93
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->getReadable$runtime_release()Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;->getSet$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;

    move-result-object v0

    invoke-interface {v0, p1}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public final getDebuggerDisplayValue()Ljava/util/Set;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation

    .line 132
    move-object v0, p0

    .local v0, "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    const/4 v1, 0x0

    .line 429
    .local v1, "$i$f$withCurrent":I
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v2

    const-string/jumbo v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    check-cast v2, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v2, "$this$withCurrent$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v3, 0x0

    .line 430
    .local v3, "$i$f$withCurrent":I
    invoke-static {v2}, Landroidx/compose/runtime/snapshots/SnapshotKt;->current(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v4

    check-cast v4, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    .local v4, "$this$_get_debuggerDisplayValue__u24lambda_u248":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    const/4 v5, 0x0

    .line 132
    .local v5, "$i$a$-withCurrent-SnapshotStateSet$debuggerDisplayValue$1":I
    invoke-virtual {v4}, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;->getSet$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;

    move-result-object v4

    .line 430
    .end local v4    # "$this$_get_debuggerDisplayValue__u24lambda_u248":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    .end local v5    # "$i$a$-withCurrent-SnapshotStateSet$debuggerDisplayValue$1":I
    nop

    .line 429
    .end local v2    # "$this$withCurrent$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v3    # "$i$f$withCurrent":I
    nop

    .end local v0    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .end local v1    # "$i$f$withCurrent":I
    check-cast v4, Ljava/util/Set;

    .line 132
    return-object v4
.end method

.method public getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;
    .locals 1

    .line 35
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->firstStateRecord:Landroidx/compose/runtime/snapshots/StateRecord;

    return-object v0
.end method

.method public final getModification$runtime_release()I
    .locals 6

    .line 62
    move-object v0, p0

    .local v0, "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    const/4 v1, 0x0

    .line 269
    .local v1, "$i$f$withCurrent":I
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v2

    const-string/jumbo v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    check-cast v2, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v2, "$this$withCurrent$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v3, 0x0

    .line 270
    .local v3, "$i$f$withCurrent":I
    invoke-static {v2}, Landroidx/compose/runtime/snapshots/SnapshotKt;->current(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v4

    check-cast v4, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    .local v4, "$this$_get_modification__u24lambda_u240":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    const/4 v5, 0x0

    .line 62
    .local v5, "$i$a$-withCurrent-SnapshotStateSet$modification$1":I
    invoke-virtual {v4}, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;->getModification$runtime_release()I

    move-result v4

    .line 270
    .end local v4    # "$this$_get_modification__u24lambda_u240":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    .end local v5    # "$i$a$-withCurrent-SnapshotStateSet$modification$1":I
    nop

    .line 269
    .end local v2    # "$this$withCurrent$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v3    # "$i$f$withCurrent":I
    nop

    .line 62
    .end local v0    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .end local v1    # "$i$f$withCurrent":I
    return v4
.end method

.method public final getReadable$runtime_release()Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord<",
            "TT;>;"
        }
    .end annotation

    .line 66
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    check-cast v0, Landroidx/compose/runtime/snapshots/StateRecord;

    move-object v1, p0

    check-cast v1, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v0, v1}, Landroidx/compose/runtime/snapshots/SnapshotKt;->readable(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    return-object v0
.end method

.method public getSize()I
    .locals 1

    .line 89
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->getReadable$runtime_release()Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;->getSet$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;->size()I

    move-result v0

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    .line 95
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->getReadable$runtime_release()Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;->getSet$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    .line 97
    new-instance v0, Landroidx/compose/runtime/snapshots/StateSetIterator;

    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->getReadable$runtime_release()Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;->getSet$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroidx/compose/runtime/snapshots/StateSetIterator;-><init>(Landroidx/compose/runtime/snapshots/SnapshotStateSet;Ljava/util/Iterator;)V

    check-cast v0, Ljava/util/Iterator;

    return-object v0
.end method

.method public prependStateRecord(Landroidx/compose/runtime/snapshots/StateRecord;)V
    .locals 1
    .param p1, "value"    # Landroidx/compose/runtime/snapshots/StateRecord;

    .line 39
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/compose/runtime/snapshots/StateRecord;->setNext$runtime_release(Landroidx/compose/runtime/snapshots/StateRecord;)V

    .line 41
    const-string/jumbo v0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    check-cast v0, Landroidx/compose/runtime/snapshots/StateRecord;

    iput-object v0, p0, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->firstStateRecord:Landroidx/compose/runtime/snapshots/StateRecord;

    .line 42
    return-void
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 21
    .param p1, "element"    # Ljava/lang/Object;

    .line 118
    move-object/from16 v1, p0

    .local v1, "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    const/4 v2, 0x0

    .line 357
    .local v2, "$i$f$conditionalUpdate":I
    move-object v3, v1

    check-cast v3, Landroidx/compose/runtime/snapshots/SnapshotStateSet;

    .local v3, "$this$conditionalUpdate_u24lambda_u2415$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    const/4 v4, 0x0

    .line 358
    .local v4, "$i$a$-run-SnapshotStateSet$conditionalUpdate$1$iv":I
    const/4 v5, 0x0

    .line 359
    .local v5, "result$iv":Z
    :cond_0
    nop

    .line 360
    const/4 v6, 0x0

    .line 361
    .local v6, "oldSet$iv":Ljava/lang/Object;
    const/4 v7, 0x0

    .line 362
    .local v7, "currentModification$iv":I
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotStateSetKt;->access$getSync$p()Ljava/lang/Object;

    move-result-object v8

    .local v8, "lock$iv$iv":Ljava/lang/Object;
    const/4 v9, 0x0

    .line 363
    .local v9, "$i$f$synchronized":I
    nop

    .line 364
    monitor-enter v8

    const/4 v0, 0x0

    .line 365
    .local v0, "$i$a$-synchronized-SnapshotStateSet$conditionalUpdate$1$1$iv":I
    move-object v10, v3

    .local v10, "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    const/4 v11, 0x0

    .line 366
    .local v11, "$i$f$withCurrent":I
    :try_start_0
    invoke-virtual {v10}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v12

    const-string/jumbo v13, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v12, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    check-cast v12, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v12, "$this$withCurrent$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v13, 0x0

    .line 367
    .local v13, "$i$f$withCurrent":I
    invoke-static {v12}, Landroidx/compose/runtime/snapshots/SnapshotKt;->current(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v14

    check-cast v14, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    .local v14, "$this$conditionalUpdate_u24lambda_u2415_u24lambda_u2413_u24lambda_u2412$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    const/4 v15, 0x0

    .line 365
    .local v15, "$i$a$-withCurrent-SnapshotStateSet$conditionalUpdate$1$1$current$1$iv":I
    nop

    .line 367
    .end local v14    # "$this$conditionalUpdate_u24lambda_u2415_u24lambda_u2413_u24lambda_u2412$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    .end local v15    # "$i$a$-withCurrent-SnapshotStateSet$conditionalUpdate$1$1$current$1$iv":I
    nop

    .line 366
    .end local v12    # "$this$withCurrent$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v13    # "$i$f$withCurrent":I
    nop

    .line 365
    .end local v10    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .end local v11    # "$i$f$withCurrent":I
    nop

    .line 368
    .local v14, "current$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    invoke-virtual {v14}, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;->getModification$runtime_release()I

    move-result v10

    move v7, v10

    .line 369
    invoke-virtual {v14}, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;->getSet$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;

    move-result-object v10

    move-object v6, v10

    .line 370
    nop

    .end local v0    # "$i$a$-synchronized-SnapshotStateSet$conditionalUpdate$1$1$iv":I
    .end local v14    # "current$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 364
    monitor-exit v8

    .line 371
    .end local v8    # "lock$iv$iv":Ljava/lang/Object;
    .end local v9    # "$i$f$synchronized":I
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v0, v6

    .local v0, "it":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;
    const/4 v8, 0x0

    .line 118
    .local v8, "$i$a$-conditionalUpdate-SnapshotStateSet$remove$1":I
    move-object/from16 v10, p1

    invoke-interface {v0, v10}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;->remove(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;

    move-result-object v0

    .line 371
    .end local v0    # "it":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;
    .end local v8    # "$i$a$-conditionalUpdate-SnapshotStateSet$remove$1":I
    move-object v8, v0

    .line 372
    .local v8, "newSet$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;
    invoke-static {v8, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 373
    const/4 v0, 0x0

    .line 374
    .end local v5    # "result$iv":Z
    .local v0, "result$iv":Z
    goto :goto_0

    .line 376
    .end local v0    # "result$iv":Z
    .restart local v5    # "result$iv":Z
    :cond_1
    move-object v9, v3

    .local v9, "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    const/4 v11, 0x0

    .line 377
    .local v11, "$i$f$writable":I
    invoke-virtual {v9}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    const-string/jumbo v12, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>"

    invoke-static {v0, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    move-object v12, v0

    check-cast v12, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v12, "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v13, 0x0

    .line 378
    .local v13, "$i$f$writable":I
    const/4 v14, 0x0

    .line 379
    .local v14, "snapshot$iv$iv$iv":Ljava/lang/Object;
    const/4 v15, 0x0

    .line 380
    .local v15, "$i$f$sync":I
    nop

    .line 381
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->getLock()Ljava/lang/Object;

    move-result-object v16

    .local v16, "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    const/16 v17, 0x0

    .line 363
    .local v17, "$i$f$synchronized":I
    nop

    .line 364
    monitor-enter v16

    const/4 v0, 0x0

    .line 382
    .local v0, "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    :try_start_1
    sget-object v18, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v18

    move-object/from16 v14, v18

    .line 383
    move/from16 v18, v0

    .end local v0    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    .local v18, "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    move-object v0, v9

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v12, v0, v14}, Landroidx/compose/runtime/snapshots/SnapshotKt;->writableRecord(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    .local v0, "$this$conditionalUpdate_u24lambda_u2415_u24lambda_u2414$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    const/16 v19, 0x0

    .line 376
    .local v19, "$i$a$-writable-SnapshotStateSet$conditionalUpdate$1$2$iv":I
    invoke-direct {v3, v0, v7, v8}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->attemptUpdate(Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;)Z

    move-result v20
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 383
    .end local v0    # "$this$conditionalUpdate_u24lambda_u2415_u24lambda_u2414$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    .end local v19    # "$i$a$-writable-SnapshotStateSet$conditionalUpdate$1$2$iv":I
    nop

    .line 364
    .end local v18    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    monitor-exit v16

    .line 381
    .end local v16    # "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v17    # "$i$f$synchronized":I
    nop

    .line 385
    .end local v15    # "$i$f$sync":I
    move/from16 v0, v20

    .line 386
    .local v0, "it$iv$iv$iv":Z
    const/4 v15, 0x0

    .line 385
    .local v15, "$i$a$-also-SnapshotKt$writable$4$iv$iv$iv":I
    move/from16 v16, v0

    .end local v0    # "it$iv$iv$iv":Z
    .local v16, "it$iv$iv$iv":Z
    move-object v0, v9

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v14, v0}, Landroidx/compose/runtime/snapshots/SnapshotKt;->notifyWrite(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateObject;)V

    .line 379
    .end local v15    # "$i$a$-also-SnapshotKt$writable$4$iv$iv$iv":I
    .end local v16    # "it$iv$iv$iv":Z
    nop

    .line 377
    .end local v12    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v13    # "$i$f$writable":I
    .end local v14    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    nop

    .line 376
    .end local v9    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .end local v11    # "$i$f$writable":I
    if-eqz v20, :cond_0

    .line 387
    const/4 v0, 0x1

    .line 388
    .end local v5    # "result$iv":Z
    .local v0, "result$iv":Z
    nop

    .line 391
    .end local v6    # "oldSet$iv":Ljava/lang/Object;
    .end local v7    # "currentModification$iv":I
    .end local v8    # "newSet$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;
    :goto_0
    nop

    .line 357
    .end local v0    # "result$iv":Z
    .end local v3    # "$this$conditionalUpdate_u24lambda_u2415$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .end local v4    # "$i$a$-run-SnapshotStateSet$conditionalUpdate$1$iv":I
    nop

    .line 392
    nop

    .line 118
    .end local v1    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .end local v2    # "$i$f$conditionalUpdate":I
    return v0

    .line 364
    .restart local v1    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .restart local v2    # "$i$f$conditionalUpdate":I
    .restart local v3    # "$this$conditionalUpdate_u24lambda_u2415$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .restart local v4    # "$i$a$-run-SnapshotStateSet$conditionalUpdate$1$iv":I
    .restart local v5    # "result$iv":Z
    .restart local v6    # "oldSet$iv":Ljava/lang/Object;
    .restart local v7    # "currentModification$iv":I
    .restart local v8    # "newSet$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;
    .restart local v9    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .restart local v11    # "$i$f$writable":I
    .restart local v12    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .restart local v13    # "$i$f$writable":I
    .restart local v14    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    .local v15, "$i$f$sync":I
    .local v16, "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v17    # "$i$f$synchronized":I
    :catchall_0
    move-exception v0

    monitor-exit v16

    throw v0

    .end local v11    # "$i$f$writable":I
    .end local v12    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v13    # "$i$f$writable":I
    .end local v14    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    .end local v15    # "$i$f$sync":I
    .end local v16    # "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v17    # "$i$f$synchronized":I
    .local v8, "lock$iv$iv":Ljava/lang/Object;
    .local v9, "$i$f$synchronized":I
    :catchall_1
    move-exception v0

    move-object/from16 v10, p1

    monitor-exit v8

    throw v0
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 21
    .param p1, "elements"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .line 120
    move-object/from16 v1, p0

    .local v1, "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    const/4 v2, 0x0

    .line 393
    .local v2, "$i$f$conditionalUpdate":I
    move-object v3, v1

    check-cast v3, Landroidx/compose/runtime/snapshots/SnapshotStateSet;

    .local v3, "$this$conditionalUpdate_u24lambda_u2415$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    const/4 v4, 0x0

    .line 394
    .local v4, "$i$a$-run-SnapshotStateSet$conditionalUpdate$1$iv":I
    const/4 v5, 0x0

    .line 395
    .local v5, "result$iv":Z
    :cond_0
    nop

    .line 396
    const/4 v6, 0x0

    .line 397
    .local v6, "oldSet$iv":Ljava/lang/Object;
    const/4 v7, 0x0

    .line 398
    .local v7, "currentModification$iv":I
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotStateSetKt;->access$getSync$p()Ljava/lang/Object;

    move-result-object v8

    .local v8, "lock$iv$iv":Ljava/lang/Object;
    const/4 v9, 0x0

    .line 399
    .local v9, "$i$f$synchronized":I
    nop

    .line 400
    monitor-enter v8

    const/4 v0, 0x0

    .line 401
    .local v0, "$i$a$-synchronized-SnapshotStateSet$conditionalUpdate$1$1$iv":I
    move-object v10, v3

    .local v10, "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    const/4 v11, 0x0

    .line 402
    .local v11, "$i$f$withCurrent":I
    :try_start_0
    invoke-virtual {v10}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v12

    const-string/jumbo v13, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v12, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    check-cast v12, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v12, "$this$withCurrent$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v13, 0x0

    .line 403
    .local v13, "$i$f$withCurrent":I
    invoke-static {v12}, Landroidx/compose/runtime/snapshots/SnapshotKt;->current(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v14

    check-cast v14, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    .local v14, "$this$conditionalUpdate_u24lambda_u2415_u24lambda_u2413_u24lambda_u2412$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    const/4 v15, 0x0

    .line 401
    .local v15, "$i$a$-withCurrent-SnapshotStateSet$conditionalUpdate$1$1$current$1$iv":I
    nop

    .line 403
    .end local v14    # "$this$conditionalUpdate_u24lambda_u2415_u24lambda_u2413_u24lambda_u2412$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    .end local v15    # "$i$a$-withCurrent-SnapshotStateSet$conditionalUpdate$1$1$current$1$iv":I
    nop

    .line 402
    .end local v12    # "$this$withCurrent$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v13    # "$i$f$withCurrent":I
    nop

    .line 401
    .end local v10    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .end local v11    # "$i$f$withCurrent":I
    nop

    .line 404
    .local v14, "current$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    invoke-virtual {v14}, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;->getModification$runtime_release()I

    move-result v10

    move v7, v10

    .line 405
    invoke-virtual {v14}, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;->getSet$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;

    move-result-object v10

    move-object v6, v10

    .line 406
    nop

    .end local v0    # "$i$a$-synchronized-SnapshotStateSet$conditionalUpdate$1$1$iv":I
    .end local v14    # "current$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 400
    monitor-exit v8

    .line 407
    .end local v8    # "lock$iv$iv":Ljava/lang/Object;
    .end local v9    # "$i$f$synchronized":I
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v0, v6

    .local v0, "it":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;
    const/4 v8, 0x0

    .line 120
    .local v8, "$i$a$-conditionalUpdate-SnapshotStateSet$removeAll$1":I
    move-object/from16 v10, p1

    invoke-interface {v0, v10}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;->removeAll(Ljava/util/Collection;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;

    move-result-object v0

    .line 407
    .end local v0    # "it":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;
    .end local v8    # "$i$a$-conditionalUpdate-SnapshotStateSet$removeAll$1":I
    move-object v8, v0

    .line 408
    .local v8, "newSet$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;
    invoke-static {v8, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 409
    const/4 v0, 0x0

    .line 410
    .end local v5    # "result$iv":Z
    .local v0, "result$iv":Z
    goto :goto_0

    .line 412
    .end local v0    # "result$iv":Z
    .restart local v5    # "result$iv":Z
    :cond_1
    move-object v9, v3

    .local v9, "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    const/4 v11, 0x0

    .line 413
    .local v11, "$i$f$writable":I
    invoke-virtual {v9}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    const-string/jumbo v12, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>"

    invoke-static {v0, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    move-object v12, v0

    check-cast v12, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v12, "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v13, 0x0

    .line 414
    .local v13, "$i$f$writable":I
    const/4 v14, 0x0

    .line 415
    .local v14, "snapshot$iv$iv$iv":Ljava/lang/Object;
    const/4 v15, 0x0

    .line 416
    .local v15, "$i$f$sync":I
    nop

    .line 417
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->getLock()Ljava/lang/Object;

    move-result-object v16

    .local v16, "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    const/16 v17, 0x0

    .line 399
    .local v17, "$i$f$synchronized":I
    nop

    .line 400
    monitor-enter v16

    const/4 v0, 0x0

    .line 418
    .local v0, "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    :try_start_1
    sget-object v18, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v18

    move-object/from16 v14, v18

    .line 419
    move/from16 v18, v0

    .end local v0    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    .local v18, "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    move-object v0, v9

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v12, v0, v14}, Landroidx/compose/runtime/snapshots/SnapshotKt;->writableRecord(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    .local v0, "$this$conditionalUpdate_u24lambda_u2415_u24lambda_u2414$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    const/16 v19, 0x0

    .line 412
    .local v19, "$i$a$-writable-SnapshotStateSet$conditionalUpdate$1$2$iv":I
    invoke-direct {v3, v0, v7, v8}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->attemptUpdate(Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;)Z

    move-result v20
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 419
    .end local v0    # "$this$conditionalUpdate_u24lambda_u2415_u24lambda_u2414$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    .end local v19    # "$i$a$-writable-SnapshotStateSet$conditionalUpdate$1$2$iv":I
    nop

    .line 400
    .end local v18    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    monitor-exit v16

    .line 417
    .end local v16    # "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v17    # "$i$f$synchronized":I
    nop

    .line 421
    .end local v15    # "$i$f$sync":I
    move/from16 v0, v20

    .line 422
    .local v0, "it$iv$iv$iv":Z
    const/4 v15, 0x0

    .line 421
    .local v15, "$i$a$-also-SnapshotKt$writable$4$iv$iv$iv":I
    move/from16 v16, v0

    .end local v0    # "it$iv$iv$iv":Z
    .local v16, "it$iv$iv$iv":Z
    move-object v0, v9

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v14, v0}, Landroidx/compose/runtime/snapshots/SnapshotKt;->notifyWrite(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateObject;)V

    .line 415
    .end local v15    # "$i$a$-also-SnapshotKt$writable$4$iv$iv$iv":I
    .end local v16    # "it$iv$iv$iv":Z
    nop

    .line 413
    .end local v12    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v13    # "$i$f$writable":I
    .end local v14    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    nop

    .line 412
    .end local v9    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .end local v11    # "$i$f$writable":I
    if-eqz v20, :cond_0

    .line 423
    const/4 v0, 0x1

    .line 424
    .end local v5    # "result$iv":Z
    .local v0, "result$iv":Z
    nop

    .line 427
    .end local v6    # "oldSet$iv":Ljava/lang/Object;
    .end local v7    # "currentModification$iv":I
    .end local v8    # "newSet$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;
    :goto_0
    nop

    .line 393
    .end local v0    # "result$iv":Z
    .end local v3    # "$this$conditionalUpdate_u24lambda_u2415$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .end local v4    # "$i$a$-run-SnapshotStateSet$conditionalUpdate$1$iv":I
    nop

    .line 428
    nop

    .line 120
    .end local v1    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .end local v2    # "$i$f$conditionalUpdate":I
    return v0

    .line 400
    .restart local v1    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .restart local v2    # "$i$f$conditionalUpdate":I
    .restart local v3    # "$this$conditionalUpdate_u24lambda_u2415$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .restart local v4    # "$i$a$-run-SnapshotStateSet$conditionalUpdate$1$iv":I
    .restart local v5    # "result$iv":Z
    .restart local v6    # "oldSet$iv":Ljava/lang/Object;
    .restart local v7    # "currentModification$iv":I
    .restart local v8    # "newSet$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;
    .restart local v9    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .restart local v11    # "$i$f$writable":I
    .restart local v12    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .restart local v13    # "$i$f$writable":I
    .restart local v14    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    .local v15, "$i$f$sync":I
    .local v16, "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v17    # "$i$f$synchronized":I
    :catchall_0
    move-exception v0

    monitor-exit v16

    throw v0

    .end local v11    # "$i$f$writable":I
    .end local v12    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v13    # "$i$f$writable":I
    .end local v14    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    .end local v15    # "$i$f$sync":I
    .end local v16    # "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v17    # "$i$f$synchronized":I
    .local v8, "lock$iv$iv":Ljava/lang/Object;
    .local v9, "$i$f$synchronized":I
    :catchall_1
    move-exception v0

    move-object/from16 v10, p1

    monitor-exit v8

    throw v0
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 1
    .param p1, "elements"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .line 122
    new-instance v0, Landroidx/compose/runtime/snapshots/SnapshotStateSet$retainAll$1;

    invoke-direct {v0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateSet$retainAll$1;-><init>(Ljava/util/Collection;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->mutateBoolean(Lkotlin/jvm/functions/Function1;)Z

    move-result v0

    .line 124
    return v0
.end method

.method public final bridge size()I
    .locals 1

    .line 33
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->getSize()I

    move-result v0

    return v0
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 1

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lkotlin/jvm/internal/CollectionToArray;->toArray(Ljava/util/Collection;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/CollectionToArray;->toArray(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final toSet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation

    .line 59
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->getReadable$runtime_release()Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;->getSet$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 101
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    check-cast v0, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v0, "$this$withCurrent$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v1, 0x0

    .line 271
    .local v1, "$i$f$withCurrent":I
    invoke-static {v0}, Landroidx/compose/runtime/snapshots/SnapshotKt;->current(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v2

    check-cast v2, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;

    .local v2, "it":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    const/4 v3, 0x0

    .line 102
    .local v3, "$i$a$-withCurrent-SnapshotStateSet$toString$1":I
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "SnapshotStateSet(value="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;->getSet$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ")@"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->hashCode()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 271
    .end local v2    # "it":Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;
    .end local v3    # "$i$a$-withCurrent-SnapshotStateSet$toString$1":I
    nop

    .line 103
    .end local v0    # "$this$withCurrent$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v1    # "$i$f$withCurrent":I
    return-object v2
.end method
