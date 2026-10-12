.class public final Landroidx/compose/runtime/changelist/Operations;
.super Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;
.source "Operations.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/runtime/changelist/Operations$OpIterator;,
        Landroidx/compose/runtime/changelist/Operations$WriteScope;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nOperations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n+ 2 ArrayUtils.android.kt\nandroidx/compose/runtime/collection/ArrayUtils_androidKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,642:1\n145#1,5:643\n158#1,5:648\n255#1:657\n255#1:658\n334#1,7:666\n325#1,16:673\n356#1:689\n356#1:690\n334#1,7:691\n27#2,2:653\n27#2,2:655\n27#2,2:664\n4658#3,4:659\n1#4:663\n*S KotlinDebug\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n*L\n123#1:643,5\n124#1:648,5\n212#1:657\n213#1:658\n325#1:666,7\n347#1:673,16\n359#1:689\n362#1:690\n576#1:691,7\n141#1:653,2\n166#1:655,2\n295#1:664,2\n211#1:659,4\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u001c\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001:\u0002PQB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0016\u001a\u00020\u0017J\u0011\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0082\u0008J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0002J&\u0010\u001d\u001a\u00020\u00172\u001b\u0010\u001e\u001a\u0017\u0012\u0008\u0012\u00060 R\u00020\u0000\u0012\u0004\u0012\u00020\u00170\u001f\u00a2\u0006\u0002\u0008!H\u0086\u0008J\u000e\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\rJ\u0011\u0010$\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0006H\u0082\u0008J\u0011\u0010%\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0006H\u0082\u0008J\u0010\u0010&\u001a\u00020\'2\u0006\u0010#\u001a\u00020\rH\u0002J\u0010\u0010(\u001a\u00020\'2\u0006\u0010#\u001a\u00020\rH\u0002J\"\u0010)\u001a\u00020\u00172\n\u0010*\u001a\u0006\u0012\u0002\u0008\u00030+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/J&\u00100\u001a\u00020\u00172\u001b\u00101\u001a\u0017\u0012\u0008\u0012\u00060 R\u00020\u0000\u0012\u0004\u0012\u00020\u00170\u001f\u00a2\u0006\u0002\u0008!H\u0086\u0008J\u0006\u00102\u001a\u000203J\u0006\u00104\u001a\u000203J\t\u00105\u001a\u00020\rH\u0082\u0008J\u0006\u00106\u001a\u00020\u0017J\u000e\u00107\u001a\u00020\u00172\u0006\u00108\u001a\u00020\u0000J\u000e\u00109\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\rJ7\u00109\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\r2\u0017\u0010:\u001a\u0013\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u00170\u001f\u00a2\u0006\u0002\u0008!H\u0086\u0008\u0082\u0002\n\n\u0008\u0008\u0001\u0012\u0002\u0010\u0002 \u0001J\u0010\u0010<\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\rH\u0007J\u0018\u0010=\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0002J\u0018\u0010>\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0002J\u0008\u0010?\u001a\u00020\u0017H\u0002J\u0010\u0010@\u001a\u00020\'2\u0006\u0010A\u001a\u00020\'H\u0016J\u0008\u0010B\u001a\u00020\'H\u0017J\u0015\u0010C\u001a\u00020\u00062\n\u0010D\u001a\u00060\u0006j\u0002`EH\u0082\u0008J\u001f\u0010F\u001a\u00020\u00062\n\u0010D\u001a\u0006\u0012\u0002\u0008\u00030GH\u0082\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008H\u0010IJ\u0018\u0010J\u001a\u00020\'*\u00060 R\u00020\u00002\u0006\u0010A\u001a\u00020\'H\u0002J\u0016\u0010K\u001a\u00020\'*\u0004\u0018\u00010\t2\u0006\u0010A\u001a\u00020\'H\u0002J\u000c\u0010L\u001a\u00020\'*\u00020\'H\u0002J \u0010M\u001a\u00020\'\"\u0004\u0008\u0000\u0010N*\u0008\u0012\u0004\u0012\u0002HN0O2\u0006\u0010A\u001a\u00020\'H\u0002R\u0012\u0010\u0003\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00088\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0004\n\u0002\u0010\nR\u0012\u0010\u000b\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00088\u0000@\u0000X\u0081\u000e\u00a2\u0006\n\n\u0002\u0010\u000f\u0012\u0004\u0008\u000e\u0010\u0002R\u0012\u0010\u0010\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006R"
    }
    d2 = {
        "Landroidx/compose/runtime/changelist/Operations;",
        "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;",
        "()V",
        "intArgs",
        "",
        "intArgsSize",
        "",
        "objectArgs",
        "",
        "",
        "[Ljava/lang/Object;",
        "objectArgsSize",
        "opCodes",
        "Landroidx/compose/runtime/changelist/Operation;",
        "getOpCodes$runtime_release$annotations",
        "[Landroidx/compose/runtime/changelist/Operation;",
        "opCodesSize",
        "pushedIntMask",
        "pushedObjectMask",
        "size",
        "getSize",
        "()I",
        "clear",
        "",
        "createExpectedArgMask",
        "paramCount",
        "determineNewSize",
        "currentSize",
        "requiredSize",
        "drain",
        "sink",
        "Lkotlin/Function1;",
        "Landroidx/compose/runtime/changelist/Operations$OpIterator;",
        "Lkotlin/ExtensionFunctionType;",
        "ensureAllArgumentsPushedFor",
        "operation",
        "ensureIntArgsSizeAtLeast",
        "ensureObjectArgsSizeAtLeast",
        "exceptionMessageForOperationPushNoScope",
        "",
        "exceptionMessageForOperationPushWithScope",
        "executeAndFlushAllPendingOperations",
        "applier",
        "Landroidx/compose/runtime/Applier;",
        "slots",
        "Landroidx/compose/runtime/SlotWriter;",
        "rememberManager",
        "Landroidx/compose/runtime/RememberManager;",
        "forEach",
        "action",
        "isEmpty",
        "",
        "isNotEmpty",
        "peekOperation",
        "pop",
        "popInto",
        "other",
        "push",
        "args",
        "Landroidx/compose/runtime/changelist/Operations$WriteScope;",
        "pushOp",
        "resizeIntArgs",
        "resizeObjectArgs",
        "resizeOpCodes",
        "toDebugString",
        "linePrefix",
        "toString",
        "topIntIndexOf",
        "parameter",
        "Landroidx/compose/runtime/changelist/IntParameter;",
        "topObjectIndexOf",
        "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;",
        "topObjectIndexOf-31yXWZQ",
        "(I)I",
        "currentOpToDebugString",
        "formatOpArgumentToString",
        "indent",
        "toCollectionString",
        "T",
        "",
        "OpIterator",
        "WriteScope",
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
.field public intArgs:[I

.field public intArgsSize:I

.field public objectArgs:[Ljava/lang/Object;

.field public objectArgsSize:I

.field public opCodes:[Landroidx/compose/runtime/changelist/Operation;

.field public opCodesSize:I

.field private pushedIntMask:I

.field private pushedObjectMask:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Landroidx/compose/runtime/changelist/Operations;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 50
    invoke-direct {p0}, Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;-><init>()V

    .line 61
    const/16 v0, 0x10

    new-array v1, v0, [Landroidx/compose/runtime/changelist/Operation;

    iput-object v1, p0, Landroidx/compose/runtime/changelist/Operations;->opCodes:[Landroidx/compose/runtime/changelist/Operation;

    .line 64
    new-array v1, v0, [I

    iput-object v1, p0, Landroidx/compose/runtime/changelist/Operations;->intArgs:[I

    .line 67
    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Landroidx/compose/runtime/changelist/Operations;->objectArgs:[Ljava/lang/Object;

    .line 50
    return-void
.end method

.method public static final synthetic access$currentOpToDebugString(Landroidx/compose/runtime/changelist/Operations;Landroidx/compose/runtime/changelist/Operations$OpIterator;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/changelist/Operations;
    .param p1, "$receiver"    # Landroidx/compose/runtime/changelist/Operations$OpIterator;
    .param p2, "linePrefix"    # Ljava/lang/String;

    .line 50
    invoke-direct {p0, p1, p2}, Landroidx/compose/runtime/changelist/Operations;->currentOpToDebugString(Landroidx/compose/runtime/changelist/Operations$OpIterator;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$formatOpArgumentToString(Landroidx/compose/runtime/changelist/Operations;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/changelist/Operations;
    .param p1, "$receiver"    # Ljava/lang/Object;
    .param p2, "linePrefix"    # Ljava/lang/String;

    .line 50
    invoke-direct {p0, p1, p2}, Landroidx/compose/runtime/changelist/Operations;->formatOpArgumentToString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$getPushedIntMask$p(Landroidx/compose/runtime/changelist/Operations;)I
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/changelist/Operations;

    .line 50
    iget v0, p0, Landroidx/compose/runtime/changelist/Operations;->pushedIntMask:I

    return v0
.end method

.method public static final synthetic access$getPushedObjectMask$p(Landroidx/compose/runtime/changelist/Operations;)I
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/changelist/Operations;

    .line 50
    iget v0, p0, Landroidx/compose/runtime/changelist/Operations;->pushedObjectMask:I

    return v0
.end method

.method public static final synthetic access$setPushedIntMask$p(Landroidx/compose/runtime/changelist/Operations;I)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/runtime/changelist/Operations;
    .param p1, "<set-?>"    # I

    .line 50
    iput p1, p0, Landroidx/compose/runtime/changelist/Operations;->pushedIntMask:I

    return-void
.end method

.method public static final synthetic access$setPushedObjectMask$p(Landroidx/compose/runtime/changelist/Operations;I)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/runtime/changelist/Operations;
    .param p1, "<set-?>"    # I

    .line 50
    iput p1, p0, Landroidx/compose/runtime/changelist/Operations;->pushedObjectMask:I

    return-void
.end method

.method private final createExpectedArgMask(I)I
    .locals 3
    .param p1, "paramCount"    # I

    const/4 v0, 0x0

    .line 255
    .local v0, "$i$f$createExpectedArgMask":I
    if-nez p1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, -0x1

    :goto_0
    rsub-int/lit8 v2, p1, 0x20

    ushr-int/2addr v1, v2

    return v1
.end method

.method private final currentOpToDebugString(Landroidx/compose/runtime/changelist/Operations$OpIterator;Ljava/lang/String;)Ljava/lang/String;
    .locals 21
    .param p1, "$this$currentOpToDebugString"    # Landroidx/compose/runtime/changelist/Operations$OpIterator;
    .param p2, "linePrefix"    # Ljava/lang/String;

    .line 586
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-virtual {v1}, Landroidx/compose/runtime/changelist/Operations$OpIterator;->getOperation()Landroidx/compose/runtime/changelist/Operation;

    move-result-object v3

    .line 587
    .local v3, "operation":Landroidx/compose/runtime/changelist/Operation;
    invoke-virtual {v3}, Landroidx/compose/runtime/changelist/Operation;->getInts()I

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v3}, Landroidx/compose/runtime/changelist/Operation;->getObjects()I

    move-result v4

    if-nez v4, :cond_0

    .line 588
    invoke-virtual {v3}, Landroidx/compose/runtime/changelist/Operation;->getName()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v19, v3

    goto/16 :goto_4

    .line 590
    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    move-object v5, v4

    .local v5, "$this$currentOpToDebugString_u24lambda_u2414":Ljava/lang/StringBuilder;
    const/4 v6, 0x0

    .line 591
    .local v6, "$i$a$-buildString-Operations$currentOpToDebugString$1":I
    invoke-virtual {v3}, Landroidx/compose/runtime/changelist/Operation;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 592
    const/16 v7, 0x28

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 593
    const/4 v7, 0x0

    .local v7, "isFirstParam":Z
    const/4 v7, 0x1

    .line 594
    invoke-direct {v0, v2}, Landroidx/compose/runtime/changelist/Operations;->indent(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 595
    .local v8, "argLinePrefix":Ljava/lang/String;
    invoke-virtual {v3}, Landroidx/compose/runtime/changelist/Operation;->getInts()I

    move-result v9

    const/4 v11, 0x0

    :goto_0
    const-string v12, " = "

    const-string v13, ", "

    const-string v14, "append(...)"

    if-ge v11, v9, :cond_2

    move/from16 v16, v11

    .local v16, "offset":I
    const/16 v17, 0x0

    .line 596
    .local v17, "$i$a$-repeat-Operations$currentOpToDebugString$1$1":I
    move/from16 v10, v16

    .end local v16    # "offset":I
    .local v10, "offset":I
    invoke-virtual {v3, v10}, Landroidx/compose/runtime/changelist/Operation;->intParamName(I)Ljava/lang/String;

    move-result-object v15

    .line 597
    .local v15, "name":Ljava/lang/String;
    if-nez v7, :cond_1

    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const/4 v7, 0x0

    .line 598
    :goto_1
    const/16 v13, 0xa

    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-static {v13, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 599
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 600
    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 601
    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 602
    invoke-virtual {v1, v10}, Landroidx/compose/runtime/changelist/Operations$OpIterator;->getInt(I)I

    move-result v12

    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 603
    nop

    .line 595
    .end local v10    # "offset":I
    .end local v15    # "name":Ljava/lang/String;
    .end local v17    # "$i$a$-repeat-Operations$currentOpToDebugString$1$1":I
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    .line 604
    :cond_2
    invoke-virtual {v3}, Landroidx/compose/runtime/changelist/Operation;->getObjects()I

    move-result v9

    const/4 v10, 0x0

    :goto_2
    if-ge v10, v9, :cond_4

    move v11, v10

    .local v11, "offset":I
    const/4 v15, 0x0

    .line 605
    .local v15, "$i$a$-repeat-Operations$currentOpToDebugString$1$2":I
    move-object/from16 v17, v4

    invoke-static {v11}, Landroidx/compose/runtime/changelist/Operation$ObjectParameter;->constructor-impl(I)I

    move-result v4

    .line 606
    .local v4, "param":I
    move/from16 v18, v6

    .end local v6    # "$i$a$-buildString-Operations$currentOpToDebugString$1":I
    .local v18, "$i$a$-buildString-Operations$currentOpToDebugString$1":I
    invoke-virtual {v3, v4}, Landroidx/compose/runtime/changelist/Operation;->objectParamName-31yXWZQ(I)Ljava/lang/String;

    move-result-object v6

    .line 607
    .local v6, "name":Ljava/lang/String;
    if-nez v7, :cond_3

    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_3
    const/4 v7, 0x0

    .line 608
    :goto_3
    move-object/from16 v19, v3

    move/from16 v20, v7

    const/16 v3, 0xa

    .end local v3    # "operation":Landroidx/compose/runtime/changelist/Operation;
    .end local v7    # "isFirstParam":Z
    .local v19, "operation":Landroidx/compose/runtime/changelist/Operation;
    .local v20, "isFirstParam":Z
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-static {v7, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 609
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 610
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 611
    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 612
    invoke-virtual {v1, v4}, Landroidx/compose/runtime/changelist/Operations$OpIterator;->getObject-31yXWZQ(I)Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v0, v3, v8}, Landroidx/compose/runtime/changelist/Operations;->formatOpArgumentToString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 613
    nop

    .line 604
    .end local v4    # "param":I
    .end local v6    # "name":Ljava/lang/String;
    .end local v11    # "offset":I
    .end local v15    # "$i$a$-repeat-Operations$currentOpToDebugString$1$2":I
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v4, v17

    move/from16 v6, v18

    move-object/from16 v3, v19

    move/from16 v7, v20

    goto :goto_2

    .line 614
    .end local v18    # "$i$a$-buildString-Operations$currentOpToDebugString$1":I
    .end local v19    # "operation":Landroidx/compose/runtime/changelist/Operation;
    .end local v20    # "isFirstParam":Z
    .restart local v3    # "operation":Landroidx/compose/runtime/changelist/Operation;
    .local v6, "$i$a$-buildString-Operations$currentOpToDebugString$1":I
    .restart local v7    # "isFirstParam":Z
    :cond_4
    move-object/from16 v19, v3

    move-object/from16 v17, v4

    move/from16 v18, v6

    .end local v3    # "operation":Landroidx/compose/runtime/changelist/Operation;
    .end local v6    # "$i$a$-buildString-Operations$currentOpToDebugString$1":I
    .restart local v18    # "$i$a$-buildString-Operations$currentOpToDebugString$1":I
    .restart local v19    # "operation":Landroidx/compose/runtime/changelist/Operation;
    const/16 v13, 0xa

    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 615
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 616
    const-string v3, ")"

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 617
    nop

    .line 590
    .end local v5    # "$this$currentOpToDebugString_u24lambda_u2414":Ljava/lang/StringBuilder;
    .end local v7    # "isFirstParam":Z
    .end local v8    # "argLinePrefix":Ljava/lang/String;
    .end local v18    # "$i$a$-buildString-Operations$currentOpToDebugString$1":I
    invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string/jumbo v3, "toString(...)"

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 587
    :goto_4
    return-object v4
.end method

.method private final determineNewSize(II)I
    .locals 2
    .param p1, "currentSize"    # I
    .param p2, "requiredSize"    # I

    .line 133
    const/16 v0, 0x400

    invoke-static {p1, v0}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    move-result v0

    .line 134
    .local v0, "resizeAmount":I
    add-int v1, p1, v0

    invoke-static {v1, p2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v1

    return v1
.end method

.method private final ensureIntArgsSizeAtLeast(I)V
    .locals 2
    .param p1, "requiredSize"    # I

    const/4 v0, 0x0

    .line 145
    .local v0, "$i$f$ensureIntArgsSizeAtLeast":I
    iget-object v1, p0, Landroidx/compose/runtime/changelist/Operations;->intArgs:[I

    array-length v1, v1

    .line 146
    .local v1, "currentSize":I
    if-le p1, v1, :cond_0

    .line 147
    invoke-direct {p0, v1, p1}, Landroidx/compose/runtime/changelist/Operations;->resizeIntArgs(II)V

    .line 149
    :cond_0
    return-void
.end method

.method private final ensureObjectArgsSizeAtLeast(I)V
    .locals 2
    .param p1, "requiredSize"    # I

    const/4 v0, 0x0

    .line 158
    .local v0, "$i$f$ensureObjectArgsSizeAtLeast":I
    iget-object v1, p0, Landroidx/compose/runtime/changelist/Operations;->objectArgs:[Ljava/lang/Object;

    array-length v1, v1

    .line 159
    .local v1, "currentSize":I
    if-le p1, v1, :cond_0

    .line 160
    invoke-direct {p0, v1, p1}, Landroidx/compose/runtime/changelist/Operations;->resizeObjectArgs(II)V

    .line 162
    :cond_0
    return-void
.end method

.method private final exceptionMessageForOperationPushNoScope(Landroidx/compose/runtime/changelist/Operation;)Ljava/lang/String;
    .locals 2
    .param p1, "operation"    # Landroidx/compose/runtime/changelist/Operation;

    .line 187
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot push "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " without arguments because it expects "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 188
    invoke-virtual {p1}, Landroidx/compose/runtime/changelist/Operation;->getInts()I

    move-result v1

    .line 187
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 188
    nop

    .line 187
    const-string v1, " ints and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 188
    invoke-virtual {p1}, Landroidx/compose/runtime/changelist/Operation;->getObjects()I

    move-result v1

    .line 187
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 188
    nop

    .line 187
    const-string v1, " objects."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 188
    return-object v0
.end method

.method private final exceptionMessageForOperationPushWithScope(Landroidx/compose/runtime/changelist/Operation;)Ljava/lang/String;
    .locals 16
    .param p1, "operation"    # Landroidx/compose/runtime/changelist/Operation;

    .line 220
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    .line 221
    .local v2, "missingIntCount":I
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move-object v4, v3

    .local v4, "$this$exceptionMessageForOperationPushWithScope_u24lambda_u244":Ljava/lang/StringBuilder;
    const/4 v5, 0x0

    .line 222
    .local v5, "$i$a$-buildString-Operations$exceptionMessageForOperationPushWithScope$missingInts$1":I
    invoke-virtual {v1}, Landroidx/compose/runtime/changelist/Operation;->getInts()I

    move-result v6

    const/4 v7, 0x0

    move v8, v7

    :goto_0
    const-string v9, ", "

    const/4 v10, 0x1

    if-ge v8, v6, :cond_2

    move v11, v8

    .local v11, "arg":I
    const/4 v12, 0x0

    .line 223
    .local v12, "$i$a$-repeat-Operations$exceptionMessageForOperationPushWithScope$missingInts$1$1":I
    shl-int/2addr v10, v11

    iget v13, v0, Landroidx/compose/runtime/changelist/Operations;->pushedIntMask:I

    and-int/2addr v10, v13

    if-nez v10, :cond_1

    .line 224
    if-lez v2, :cond_0

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    :cond_0
    invoke-virtual {v1, v11}, Landroidx/compose/runtime/changelist/Operation;->intParamName(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    add-int/lit8 v2, v2, 0x1

    .line 228
    :cond_1
    nop

    .line 222
    .end local v11    # "arg":I
    .end local v12    # "$i$a$-repeat-Operations$exceptionMessageForOperationPushWithScope$missingInts$1$1":I
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 229
    :cond_2
    nop

    .line 221
    .end local v4    # "$this$exceptionMessageForOperationPushWithScope_u24lambda_u244":Ljava/lang/StringBuilder;
    .end local v5    # "$i$a$-buildString-Operations$exceptionMessageForOperationPushWithScope$missingInts$1":I
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string/jumbo v4, "toString(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 231
    .local v3, "missingInts":Ljava/lang/String;
    const/4 v5, 0x0

    .line 232
    .local v5, "missingObjectCount":I
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    move-object v8, v6

    .local v8, "$this$exceptionMessageForOperationPushWithScope_u24lambda_u246":Ljava/lang/StringBuilder;
    const/4 v11, 0x0

    .line 233
    .local v11, "$i$a$-buildString-Operations$exceptionMessageForOperationPushWithScope$missingObjects$1":I
    invoke-virtual {v1}, Landroidx/compose/runtime/changelist/Operation;->getObjects()I

    move-result v12

    :goto_1
    if-ge v7, v12, :cond_5

    move v13, v7

    .local v13, "arg":I
    const/4 v14, 0x0

    .line 234
    .local v14, "$i$a$-repeat-Operations$exceptionMessageForOperationPushWithScope$missingObjects$1$1":I
    shl-int v15, v10, v13

    iget v10, v0, Landroidx/compose/runtime/changelist/Operations;->pushedObjectMask:I

    and-int/2addr v10, v15

    if-nez v10, :cond_4

    .line 235
    if-lez v2, :cond_3

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    :cond_3
    invoke-static {v13}, Landroidx/compose/runtime/changelist/Operation$ObjectParameter;->constructor-impl(I)I

    move-result v10

    invoke-virtual {v1, v10}, Landroidx/compose/runtime/changelist/Operation;->objectParamName-31yXWZQ(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    add-int/lit8 v5, v5, 0x1

    .line 239
    :cond_4
    nop

    .line 233
    .end local v13    # "arg":I
    .end local v14    # "$i$a$-repeat-Operations$exceptionMessageForOperationPushWithScope$missingObjects$1$1":I
    add-int/lit8 v7, v7, 0x1

    const/4 v10, 0x1

    goto :goto_1

    .line 240
    :cond_5
    nop

    .line 232
    .end local v8    # "$this$exceptionMessageForOperationPushWithScope_u24lambda_u246":Ljava/lang/StringBuilder;
    .end local v11    # "$i$a$-buildString-Operations$exceptionMessageForOperationPushWithScope$missingObjects$1":I
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 242
    .local v6, "missingObjects":Ljava/lang/String;
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Error while pushing "

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v7, ". Not all arguments were provided. Missing "

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 243
    nop

    .line 242
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 243
    nop

    .line 242
    const-string v7, " int arguments ("

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 243
    nop

    .line 242
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 243
    nop

    .line 242
    const-string v7, ") and "

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 244
    nop

    .line 242
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 244
    nop

    .line 242
    const-string v7, " object arguments ("

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 244
    nop

    .line 242
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 244
    nop

    .line 242
    const-string v7, ")."

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    return-object v4
.end method

.method private final formatOpArgumentToString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "$this$formatOpArgumentToString"    # Ljava/lang/Object;
    .param p2, "linePrefix"    # Ljava/lang/String;

    .line 621
    nop

    .line 622
    if-nez p1, :cond_0

    const-string/jumbo v0, "null"

    goto/16 :goto_0

    .line 623
    :cond_0
    instance-of v0, p1, [Ljava/lang/Object;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, [Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/collections/ArraysKt;->asIterable([Ljava/lang/Object;)Ljava/lang/Iterable;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Landroidx/compose/runtime/changelist/Operations;->toCollectionString(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 624
    :cond_1
    instance-of v0, p1, [I

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, [I

    invoke-static {v0}, Lkotlin/collections/ArraysKt;->asIterable([I)Ljava/lang/Iterable;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Landroidx/compose/runtime/changelist/Operations;->toCollectionString(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 625
    :cond_2
    instance-of v0, p1, [J

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, [J

    invoke-static {v0}, Lkotlin/collections/ArraysKt;->asIterable([J)Ljava/lang/Iterable;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Landroidx/compose/runtime/changelist/Operations;->toCollectionString(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 626
    :cond_3
    instance-of v0, p1, [F

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, [F

    invoke-static {v0}, Lkotlin/collections/ArraysKt;->asIterable([F)Ljava/lang/Iterable;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Landroidx/compose/runtime/changelist/Operations;->toCollectionString(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 627
    :cond_4
    instance-of v0, p1, [D

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, [D

    invoke-static {v0}, Lkotlin/collections/ArraysKt;->asIterable([D)Ljava/lang/Iterable;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Landroidx/compose/runtime/changelist/Operations;->toCollectionString(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 628
    :cond_5
    instance-of v0, p1, Ljava/lang/Iterable;

    if-eqz v0, :cond_6

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    invoke-direct {p0, v0, p2}, Landroidx/compose/runtime/changelist/Operations;->toCollectionString(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 629
    :cond_6
    instance-of v0, p1, Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;

    if-eqz v0, :cond_7

    move-object v0, p1

    check-cast v0, Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;

    invoke-virtual {v0, p2}, Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;->toDebugString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 630
    :cond_7
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 631
    :goto_0
    return-object v0
.end method

.method public static synthetic getOpCodes$runtime_release$annotations()V
    .locals 0

    return-void
.end method

.method private final indent(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1, "$this$indent"    # Ljava/lang/String;

    .line 354
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "    "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final peekOperation()Landroidx/compose/runtime/changelist/Operation;
    .locals 3

    const/4 v0, 0x0

    .line 356
    .local v0, "$i$f$peekOperation":I
    iget-object v1, p0, Landroidx/compose/runtime/changelist/Operations;->opCodes:[Landroidx/compose/runtime/changelist/Operation;

    iget v2, p0, Landroidx/compose/runtime/changelist/Operations;->opCodesSize:I

    add-int/lit8 v2, v2, -0x1

    aget-object v1, v1, v2

    return-object v1
.end method

.method private final resizeIntArgs(II)V
    .locals 3
    .param p1, "currentSize"    # I
    .param p2, "requiredSize"    # I

    .line 152
    invoke-direct {p0, p1, p2}, Landroidx/compose/runtime/changelist/Operations;->determineNewSize(II)I

    move-result v0

    new-array v0, v0, [I

    .line 153
    .local v0, "newIntArgs":[I
    iget-object v1, p0, Landroidx/compose/runtime/changelist/Operations;->intArgs:[I

    const/4 v2, 0x0

    invoke-static {v1, v0, v2, v2, p1}, Lkotlin/collections/ArraysKt;->copyInto([I[IIII)[I

    .line 154
    iput-object v0, p0, Landroidx/compose/runtime/changelist/Operations;->intArgs:[I

    .line 155
    return-void
.end method

.method private final resizeObjectArgs(II)V
    .locals 6
    .param p1, "currentSize"    # I
    .param p2, "requiredSize"    # I

    .line 165
    invoke-direct {p0, p1, p2}, Landroidx/compose/runtime/changelist/Operations;->determineNewSize(II)I

    move-result v0

    new-array v0, v0, [Ljava/lang/Object;

    .line 166
    .local v0, "newObjectArgs":[Ljava/lang/Object;
    iget-object v1, p0, Landroidx/compose/runtime/changelist/Operations;->objectArgs:[Ljava/lang/Object;

    .local v1, "$this$fastCopyInto$iv":[Ljava/lang/Object;
    const/4 v2, 0x0

    .local v2, "destinationOffset$iv":I
    const/4 v3, 0x0

    .local v3, "startIndex$iv":I
    const/4 v4, 0x0

    .line 655
    .local v4, "$i$f$fastCopyInto":I
    sub-int v5, p1, v3

    invoke-static {v1, v3, v0, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 656
    nop

    .line 167
    .end local v1    # "$this$fastCopyInto$iv":[Ljava/lang/Object;
    .end local v2    # "destinationOffset$iv":I
    .end local v3    # "startIndex$iv":I
    .end local v4    # "$i$f$fastCopyInto":I
    iput-object v0, p0, Landroidx/compose/runtime/changelist/Operations;->objectArgs:[Ljava/lang/Object;

    .line 168
    return-void
.end method

.method private final resizeOpCodes()V
    .locals 8

    .line 138
    iget v0, p0, Landroidx/compose/runtime/changelist/Operations;->opCodesSize:I

    const/16 v1, 0x400

    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    move-result v0

    .line 140
    .local v0, "resizeAmount":I
    iget v1, p0, Landroidx/compose/runtime/changelist/Operations;->opCodesSize:I

    add-int/2addr v1, v0

    new-array v1, v1, [Landroidx/compose/runtime/changelist/Operation;

    .line 141
    .local v1, "newOpCodes":[Landroidx/compose/runtime/changelist/Operation;
    iget-object v2, p0, Landroidx/compose/runtime/changelist/Operations;->opCodes:[Landroidx/compose/runtime/changelist/Operation;

    .local v2, "$this$fastCopyInto$iv":[Ljava/lang/Object;
    const/4 v3, 0x0

    .local v3, "destinationOffset$iv":I
    const/4 v4, 0x0

    .local v4, "startIndex$iv":I
    iget v5, p0, Landroidx/compose/runtime/changelist/Operations;->opCodesSize:I

    .local v5, "endIndex$iv":I
    const/4 v6, 0x0

    .line 653
    .local v6, "$i$f$fastCopyInto":I
    sub-int v7, v5, v4

    invoke-static {v2, v4, v1, v3, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 654
    nop

    .line 141
    .end local v2    # "$this$fastCopyInto$iv":[Ljava/lang/Object;
    .end local v3    # "destinationOffset$iv":I
    .end local v4    # "startIndex$iv":I
    .end local v5    # "endIndex$iv":I
    .end local v6    # "$i$f$fastCopyInto":I
    iput-object v1, p0, Landroidx/compose/runtime/changelist/Operations;->opCodes:[Landroidx/compose/runtime/changelist/Operation;

    .line 142
    return-void
.end method

.method private final toCollectionString(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;
    .locals 10
    .param p1, "$this$toCollectionString"    # Ljava/lang/Iterable;
    .param p2, "linePrefix"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable<",
            "+TT;>;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 634
    const-string v0, ", "

    move-object v2, v0

    check-cast v2, Ljava/lang/CharSequence;

    const-string v0, "["

    move-object v3, v0

    check-cast v3, Ljava/lang/CharSequence;

    const-string v0, "]"

    move-object v4, v0

    check-cast v4, Ljava/lang/CharSequence;

    new-instance v0, Landroidx/compose/runtime/changelist/Operations$toCollectionString$1;

    invoke-direct {v0, p0, p2}, Landroidx/compose/runtime/changelist/Operations$toCollectionString$1;-><init>(Landroidx/compose/runtime/changelist/Operations;Ljava/lang/String;)V

    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/16 v8, 0x18

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p1

    .end local p1    # "$this$toCollectionString":Ljava/lang/Iterable;
    .local v1, "$this$toCollectionString":Ljava/lang/Iterable;
    invoke-static/range {v1 .. v9}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 636
    return-object p1
.end method

.method private final topIntIndexOf(I)I
    .locals 6
    .param p1, "parameter"    # I

    const/4 v0, 0x0

    .line 359
    .local v0, "$i$f$topIntIndexOf":I
    iget v1, p0, Landroidx/compose/runtime/changelist/Operations;->intArgsSize:I

    move-object v2, p0

    .local v2, "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    const/4 v3, 0x0

    .line 689
    .local v3, "$i$f$peekOperation":I
    iget-object v4, v2, Landroidx/compose/runtime/changelist/Operations;->opCodes:[Landroidx/compose/runtime/changelist/Operation;

    iget v5, v2, Landroidx/compose/runtime/changelist/Operations;->opCodesSize:I

    add-int/lit8 v5, v5, -0x1

    aget-object v2, v4, v5

    .line 359
    .end local v2    # "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    .end local v3    # "$i$f$peekOperation":I
    invoke-virtual {v2}, Landroidx/compose/runtime/changelist/Operation;->getInts()I

    move-result v2

    sub-int/2addr v1, v2

    add-int/2addr v1, p1

    return v1
.end method

.method private final topObjectIndexOf-31yXWZQ(I)I
    .locals 6
    .param p1, "parameter"    # I

    const/4 v0, 0x0

    .line 362
    .local v0, "$i$f$topObjectIndexOf-31yXWZQ":I
    iget v1, p0, Landroidx/compose/runtime/changelist/Operations;->objectArgsSize:I

    move-object v2, p0

    .local v2, "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    const/4 v3, 0x0

    .line 690
    .local v3, "$i$f$peekOperation":I
    iget-object v4, v2, Landroidx/compose/runtime/changelist/Operations;->opCodes:[Landroidx/compose/runtime/changelist/Operation;

    iget v5, v2, Landroidx/compose/runtime/changelist/Operations;->opCodesSize:I

    add-int/lit8 v5, v5, -0x1

    aget-object v2, v4, v5

    .line 362
    .end local v2    # "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    .end local v3    # "$i$f$peekOperation":I
    invoke-virtual {v2}, Landroidx/compose/runtime/changelist/Operation;->getObjects()I

    move-result v2

    sub-int/2addr v1, v2

    add-int/2addr v1, p1

    return v1
.end method


# virtual methods
.method public final clear()V
    .locals 4

    .line 94
    const/4 v0, 0x0

    iput v0, p0, Landroidx/compose/runtime/changelist/Operations;->opCodesSize:I

    .line 95
    iput v0, p0, Landroidx/compose/runtime/changelist/Operations;->intArgsSize:I

    .line 97
    iget-object v1, p0, Landroidx/compose/runtime/changelist/Operations;->objectArgs:[Ljava/lang/Object;

    const/4 v2, 0x0

    iget v3, p0, Landroidx/compose/runtime/changelist/Operations;->objectArgsSize:I

    invoke-static {v1, v2, v0, v3}, Lkotlin/collections/ArraysKt;->fill([Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 98
    iput v0, p0, Landroidx/compose/runtime/changelist/Operations;->objectArgsSize:I

    .line 99
    return-void
.end method

.method public final drain(Lkotlin/jvm/functions/Function1;)V
    .locals 5
    .param p1, "sink"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/runtime/changelist/Operations$OpIterator;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 325
    .local v0, "$i$f$drain":I
    move-object v1, p0

    .local v1, "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    const/4 v2, 0x0

    .line 666
    .local v2, "$i$f$forEach":I
    invoke-virtual {v1}, Landroidx/compose/runtime/changelist/Operations;->isNotEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 667
    new-instance v3, Landroidx/compose/runtime/changelist/Operations$OpIterator;

    invoke-direct {v3, v1}, Landroidx/compose/runtime/changelist/Operations$OpIterator;-><init>(Landroidx/compose/runtime/changelist/Operations;)V

    .line 669
    .local v3, "iterator$iv":Landroidx/compose/runtime/changelist/Operations$OpIterator;
    :cond_0
    invoke-interface {p1, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 670
    invoke-virtual {v3}, Landroidx/compose/runtime/changelist/Operations$OpIterator;->next()Z

    move-result v4

    if-nez v4, :cond_0

    .line 672
    .end local v3    # "iterator$iv":Landroidx/compose/runtime/changelist/Operations$OpIterator;
    :cond_1
    nop

    .line 326
    .end local v1    # "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    .end local v2    # "$i$f$forEach":I
    invoke-virtual {p0}, Landroidx/compose/runtime/changelist/Operations;->clear()V

    .line 327
    return-void
.end method

.method public final ensureAllArgumentsPushedFor(Landroidx/compose/runtime/changelist/Operation;)V
    .locals 8
    .param p1, "operation"    # Landroidx/compose/runtime/changelist/Operation;

    .line 212
    iget v0, p0, Landroidx/compose/runtime/changelist/Operations;->pushedIntMask:I

    invoke-virtual {p1}, Landroidx/compose/runtime/changelist/Operation;->getInts()I

    move-result v1

    .local v1, "paramCount$iv":I
    move-object v2, p0

    .local v2, "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    const/4 v3, 0x0

    .line 657
    .local v3, "$i$f$createExpectedArgMask":I
    const/4 v4, -0x1

    const/4 v5, 0x0

    if-nez v1, :cond_0

    move v6, v5

    goto :goto_0

    :cond_0
    move v6, v4

    :goto_0
    rsub-int/lit8 v7, v1, 0x20

    ushr-int v1, v6, v7

    .line 212
    .end local v1    # "paramCount$iv":I
    .end local v2    # "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    .end local v3    # "$i$f$createExpectedArgMask":I
    if-ne v0, v1, :cond_2

    .line 213
    iget v0, p0, Landroidx/compose/runtime/changelist/Operations;->pushedObjectMask:I

    invoke-virtual {p1}, Landroidx/compose/runtime/changelist/Operation;->getObjects()I

    move-result v1

    .restart local v1    # "paramCount$iv":I
    move-object v2, p0

    .restart local v2    # "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    const/4 v3, 0x0

    .line 658
    .restart local v3    # "$i$f$createExpectedArgMask":I
    if-nez v1, :cond_1

    move v4, v5

    :cond_1
    rsub-int/lit8 v6, v1, 0x20

    ushr-int v1, v4, v6

    .line 213
    .end local v1    # "paramCount$iv":I
    .end local v2    # "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    .end local v3    # "$i$f$createExpectedArgMask":I
    if-ne v0, v1, :cond_2

    const/4 v5, 0x1

    goto :goto_1

    :cond_2
    nop

    .line 211
    :goto_1
    nop

    .local v5, "value$iv":Z
    const/4 v0, 0x0

    .line 659
    .local v0, "$i$f$debugRuntimeCheck":I
    nop

    .line 662
    nop

    .line 217
    .end local v0    # "$i$f$debugRuntimeCheck":I
    .end local v5    # "value$iv":Z
    return-void
.end method

.method public final executeAndFlushAllPendingOperations(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V
    .locals 10
    .param p1, "applier"    # Landroidx/compose/runtime/Applier;
    .param p2, "slots"    # Landroidx/compose/runtime/SlotWriter;
    .param p3, "rememberManager"    # Landroidx/compose/runtime/RememberManager;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/Applier<",
            "*>;",
            "Landroidx/compose/runtime/SlotWriter;",
            "Landroidx/compose/runtime/RememberManager;",
            ")V"
        }
    .end annotation

    .line 347
    move-object v0, p0

    .local v0, "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    const/4 v1, 0x0

    .line 673
    .local v1, "$i$f$drain":I
    move-object v2, v0

    .local v2, "this_$iv$iv":Landroidx/compose/runtime/changelist/Operations;
    const/4 v3, 0x0

    .line 682
    .local v3, "$i$f$forEach":I
    invoke-virtual {v2}, Landroidx/compose/runtime/changelist/Operations;->isNotEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 683
    new-instance v4, Landroidx/compose/runtime/changelist/Operations$OpIterator;

    invoke-direct {v4, v2}, Landroidx/compose/runtime/changelist/Operations$OpIterator;-><init>(Landroidx/compose/runtime/changelist/Operations;)V

    .line 685
    .local v4, "iterator$iv$iv":Landroidx/compose/runtime/changelist/Operations$OpIterator;
    :cond_0
    move-object v5, v4

    .local v5, "$this$executeAndFlushAllPendingOperations_u24lambda_u249":Landroidx/compose/runtime/changelist/Operations$OpIterator;
    const/4 v6, 0x0

    .line 348
    .local v6, "$i$a$-drain-Operations$executeAndFlushAllPendingOperations$1":I
    invoke-virtual {v5}, Landroidx/compose/runtime/changelist/Operations$OpIterator;->getOperation()Landroidx/compose/runtime/changelist/Operation;

    move-result-object v7

    .local v7, "$this$executeAndFlushAllPendingOperations_u24lambda_u249_u24lambda_u248":Landroidx/compose/runtime/changelist/Operation;
    const/4 v8, 0x0

    .line 349
    .local v8, "$i$a$-with-Operations$executeAndFlushAllPendingOperations$1$1":I
    move-object v9, v5

    check-cast v9, Landroidx/compose/runtime/changelist/OperationArgContainer;

    invoke-virtual {v7, v9, p1, p2, p3}, Landroidx/compose/runtime/changelist/Operation;->execute(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V

    .line 350
    nop

    .line 348
    .end local v7    # "$this$executeAndFlushAllPendingOperations_u24lambda_u249_u24lambda_u248":Landroidx/compose/runtime/changelist/Operation;
    .end local v8    # "$i$a$-with-Operations$executeAndFlushAllPendingOperations$1$1":I
    nop

    .line 351
    nop

    .line 685
    .end local v5    # "$this$executeAndFlushAllPendingOperations_u24lambda_u249":Landroidx/compose/runtime/changelist/Operations$OpIterator;
    .end local v6    # "$i$a$-drain-Operations$executeAndFlushAllPendingOperations$1":I
    nop

    .line 686
    invoke-virtual {v4}, Landroidx/compose/runtime/changelist/Operations$OpIterator;->next()Z

    move-result v5

    if-nez v5, :cond_0

    .line 688
    .end local v4    # "iterator$iv$iv":Landroidx/compose/runtime/changelist/Operations$OpIterator;
    :cond_1
    nop

    .line 674
    .end local v2    # "this_$iv$iv":Landroidx/compose/runtime/changelist/Operations;
    .end local v3    # "$i$f$forEach":I
    invoke-virtual {v0}, Landroidx/compose/runtime/changelist/Operations;->clear()V

    .line 675
    nop

    .line 352
    .end local v0    # "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    .end local v1    # "$i$f$drain":I
    return-void
.end method

.method public final forEach(Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .param p1, "action"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/runtime/changelist/Operations$OpIterator;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 334
    .local v0, "$i$f$forEach":I
    invoke-virtual {p0}, Landroidx/compose/runtime/changelist/Operations;->isNotEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 335
    new-instance v1, Landroidx/compose/runtime/changelist/Operations$OpIterator;

    invoke-direct {v1, p0}, Landroidx/compose/runtime/changelist/Operations$OpIterator;-><init>(Landroidx/compose/runtime/changelist/Operations;)V

    .line 337
    .local v1, "iterator":Landroidx/compose/runtime/changelist/Operations$OpIterator;
    :cond_0
    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 338
    invoke-virtual {v1}, Landroidx/compose/runtime/changelist/Operations$OpIterator;->next()Z

    move-result v2

    if-nez v2, :cond_0

    .line 340
    .end local v1    # "iterator":Landroidx/compose/runtime/changelist/Operations$OpIterator;
    :cond_1
    return-void
.end method

.method public final getSize()I
    .locals 1

    .line 81
    iget v0, p0, Landroidx/compose/runtime/changelist/Operations;->opCodesSize:I

    return v0
.end method

.method public final isEmpty()Z
    .locals 1

    .line 83
    invoke-virtual {p0}, Landroidx/compose/runtime/changelist/Operations;->getSize()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isNotEmpty()Z
    .locals 1

    .line 85
    invoke-virtual {p0}, Landroidx/compose/runtime/changelist/Operations;->getSize()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final pop()V
    .locals 9

    .line 265
    iget-object v0, p0, Landroidx/compose/runtime/changelist/Operations;->opCodes:[Landroidx/compose/runtime/changelist/Operation;

    .line 266
    .local v0, "opCodes":[Landroidx/compose/runtime/changelist/Operation;
    iget v1, p0, Landroidx/compose/runtime/changelist/Operations;->opCodesSize:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Landroidx/compose/runtime/changelist/Operations;->opCodesSize:I

    iget v1, p0, Landroidx/compose/runtime/changelist/Operations;->opCodesSize:I

    aget-object v1, v0, v1

    .line 269
    .local v1, "op":Landroidx/compose/runtime/changelist/Operation;
    iget v2, p0, Landroidx/compose/runtime/changelist/Operations;->opCodesSize:I

    const/4 v3, 0x0

    aput-object v3, v0, v2

    .line 271
    invoke-virtual {v1}, Landroidx/compose/runtime/changelist/Operation;->getObjects()I

    move-result v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_0

    move v5, v4

    .line 663
    .local v5, "it":I
    const/4 v6, 0x0

    .line 271
    .local v6, "$i$a$-repeat-Operations$pop$1":I
    iget-object v7, p0, Landroidx/compose/runtime/changelist/Operations;->objectArgs:[Ljava/lang/Object;

    iget v8, p0, Landroidx/compose/runtime/changelist/Operations;->objectArgsSize:I

    add-int/lit8 v8, v8, -0x1

    iput v8, p0, Landroidx/compose/runtime/changelist/Operations;->objectArgsSize:I

    iget v8, p0, Landroidx/compose/runtime/changelist/Operations;->objectArgsSize:I

    aput-object v3, v7, v8

    .end local v5    # "it":I
    .end local v6    # "$i$a$-repeat-Operations$pop$1":I
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 275
    :cond_0
    iget v2, p0, Landroidx/compose/runtime/changelist/Operations;->intArgsSize:I

    invoke-virtual {v1}, Landroidx/compose/runtime/changelist/Operation;->getInts()I

    move-result v3

    sub-int/2addr v2, v3

    iput v2, p0, Landroidx/compose/runtime/changelist/Operations;->intArgsSize:I

    .line 276
    return-void
.end method

.method public final popInto(Landroidx/compose/runtime/changelist/Operations;)V
    .locals 10
    .param p1, "other"    # Landroidx/compose/runtime/changelist/Operations;

    .line 286
    iget-object v0, p0, Landroidx/compose/runtime/changelist/Operations;->opCodes:[Landroidx/compose/runtime/changelist/Operation;

    .line 287
    .local v0, "opCodes":[Landroidx/compose/runtime/changelist/Operation;
    iget v1, p0, Landroidx/compose/runtime/changelist/Operations;->opCodesSize:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Landroidx/compose/runtime/changelist/Operations;->opCodesSize:I

    iget v1, p0, Landroidx/compose/runtime/changelist/Operations;->opCodesSize:I

    aget-object v1, v0, v1

    .line 290
    .local v1, "op":Landroidx/compose/runtime/changelist/Operation;
    iget v2, p0, Landroidx/compose/runtime/changelist/Operations;->opCodesSize:I

    const/4 v3, 0x0

    aput-object v3, v0, v2

    .line 292
    invoke-virtual {p1, v1}, Landroidx/compose/runtime/changelist/Operations;->pushOp(Landroidx/compose/runtime/changelist/Operation;)V

    .line 295
    iget-object v2, p0, Landroidx/compose/runtime/changelist/Operations;->objectArgs:[Ljava/lang/Object;

    .line 296
    iget-object v4, p1, Landroidx/compose/runtime/changelist/Operations;->objectArgs:[Ljava/lang/Object;

    .line 297
    iget v5, p1, Landroidx/compose/runtime/changelist/Operations;->objectArgsSize:I

    invoke-virtual {v1}, Landroidx/compose/runtime/changelist/Operation;->getObjects()I

    move-result v6

    sub-int/2addr v5, v6

    .line 298
    iget v6, p0, Landroidx/compose/runtime/changelist/Operations;->objectArgsSize:I

    invoke-virtual {v1}, Landroidx/compose/runtime/changelist/Operation;->getObjects()I

    move-result v7

    sub-int/2addr v6, v7

    .line 299
    iget v7, p0, Landroidx/compose/runtime/changelist/Operations;->objectArgsSize:I

    .line 295
    nop

    .local v2, "$this$fastCopyInto$iv":[Ljava/lang/Object;
    .local v4, "destination$iv":[Ljava/lang/Object;
    .local v5, "destinationOffset$iv":I
    .local v6, "startIndex$iv":I
    .local v7, "endIndex$iv":I
    const/4 v8, 0x0

    .line 664
    .local v8, "$i$f$fastCopyInto":I
    sub-int v9, v7, v6

    invoke-static {v2, v6, v4, v5, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 665
    nop

    .line 301
    .end local v2    # "$this$fastCopyInto$iv":[Ljava/lang/Object;
    .end local v4    # "destination$iv":[Ljava/lang/Object;
    .end local v5    # "destinationOffset$iv":I
    .end local v6    # "startIndex$iv":I
    .end local v7    # "endIndex$iv":I
    .end local v8    # "$i$f$fastCopyInto":I
    iget-object v2, p0, Landroidx/compose/runtime/changelist/Operations;->objectArgs:[Ljava/lang/Object;

    iget v4, p0, Landroidx/compose/runtime/changelist/Operations;->objectArgsSize:I

    invoke-virtual {v1}, Landroidx/compose/runtime/changelist/Operation;->getObjects()I

    move-result v5

    sub-int/2addr v4, v5

    iget v5, p0, Landroidx/compose/runtime/changelist/Operations;->objectArgsSize:I

    invoke-static {v2, v3, v4, v5}, Lkotlin/collections/ArraysKt;->fill([Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 304
    iget-object v2, p0, Landroidx/compose/runtime/changelist/Operations;->intArgs:[I

    .line 305
    iget-object v3, p1, Landroidx/compose/runtime/changelist/Operations;->intArgs:[I

    .line 306
    iget v4, p1, Landroidx/compose/runtime/changelist/Operations;->intArgsSize:I

    invoke-virtual {v1}, Landroidx/compose/runtime/changelist/Operation;->getInts()I

    move-result v5

    sub-int/2addr v4, v5

    .line 307
    iget v5, p0, Landroidx/compose/runtime/changelist/Operations;->intArgsSize:I

    invoke-virtual {v1}, Landroidx/compose/runtime/changelist/Operation;->getInts()I

    move-result v6

    sub-int/2addr v5, v6

    .line 308
    iget v6, p0, Landroidx/compose/runtime/changelist/Operations;->intArgsSize:I

    .line 304
    invoke-static {v2, v3, v4, v5, v6}, Lkotlin/collections/ArraysKt;->copyInto([I[IIII)[I

    .line 311
    iget v2, p0, Landroidx/compose/runtime/changelist/Operations;->objectArgsSize:I

    invoke-virtual {v1}, Landroidx/compose/runtime/changelist/Operation;->getObjects()I

    move-result v3

    sub-int/2addr v2, v3

    iput v2, p0, Landroidx/compose/runtime/changelist/Operations;->objectArgsSize:I

    .line 312
    iget v2, p0, Landroidx/compose/runtime/changelist/Operations;->intArgsSize:I

    invoke-virtual {v1}, Landroidx/compose/runtime/changelist/Operation;->getInts()I

    move-result v3

    sub-int/2addr v2, v3

    iput v2, p0, Landroidx/compose/runtime/changelist/Operations;->intArgsSize:I

    .line 313
    return-void
.end method

.method public final push(Landroidx/compose/runtime/changelist/Operation;)V
    .locals 0
    .param p1, "operation"    # Landroidx/compose/runtime/changelist/Operation;

    .line 178
    nop

    .line 183
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/changelist/Operations;->pushOp(Landroidx/compose/runtime/changelist/Operation;)V

    .line 184
    return-void
.end method

.method public final push(Landroidx/compose/runtime/changelist/Operation;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .param p1, "operation"    # Landroidx/compose/runtime/changelist/Operation;
    .param p2, "args"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/changelist/Operation;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/runtime/changelist/Operations$WriteScope;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 202
    .local v0, "$i$f$push":I
    nop

    .line 204
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/changelist/Operations;->pushOp(Landroidx/compose/runtime/changelist/Operation;)V

    .line 205
    invoke-static {p0}, Landroidx/compose/runtime/changelist/Operations$WriteScope;->constructor-impl(Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;

    move-result-object v1

    invoke-static {v1}, Landroidx/compose/runtime/changelist/Operations$WriteScope;->box-impl(Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations$WriteScope;

    move-result-object v1

    invoke-interface {p2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/changelist/Operations;->ensureAllArgumentsPushedFor(Landroidx/compose/runtime/changelist/Operation;)V

    .line 208
    return-void
.end method

.method public final pushOp(Landroidx/compose/runtime/changelist/Operation;)V
    .locals 4
    .param p1, "operation"    # Landroidx/compose/runtime/changelist/Operation;

    .line 115
    nop

    .line 120
    iget v0, p0, Landroidx/compose/runtime/changelist/Operations;->opCodesSize:I

    iget-object v1, p0, Landroidx/compose/runtime/changelist/Operations;->opCodes:[Landroidx/compose/runtime/changelist/Operation;

    array-length v1, v1

    if-ne v0, v1, :cond_0

    .line 121
    invoke-direct {p0}, Landroidx/compose/runtime/changelist/Operations;->resizeOpCodes()V

    .line 123
    :cond_0
    iget v0, p0, Landroidx/compose/runtime/changelist/Operations;->intArgsSize:I

    invoke-virtual {p1}, Landroidx/compose/runtime/changelist/Operation;->getInts()I

    move-result v1

    add-int/2addr v0, v1

    .local v0, "requiredSize$iv":I
    move-object v1, p0

    .local v1, "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    const/4 v2, 0x0

    .line 643
    .local v2, "$i$f$ensureIntArgsSizeAtLeast":I
    iget-object v3, v1, Landroidx/compose/runtime/changelist/Operations;->intArgs:[I

    array-length v3, v3

    .line 644
    .local v3, "currentSize$iv":I
    if-le v0, v3, :cond_1

    .line 645
    invoke-direct {v1, v3, v0}, Landroidx/compose/runtime/changelist/Operations;->resizeIntArgs(II)V

    .line 647
    :cond_1
    nop

    .line 124
    .end local v0    # "requiredSize$iv":I
    .end local v1    # "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    .end local v2    # "$i$f$ensureIntArgsSizeAtLeast":I
    .end local v3    # "currentSize$iv":I
    iget v0, p0, Landroidx/compose/runtime/changelist/Operations;->objectArgsSize:I

    invoke-virtual {p1}, Landroidx/compose/runtime/changelist/Operation;->getObjects()I

    move-result v1

    add-int/2addr v0, v1

    .restart local v0    # "requiredSize$iv":I
    move-object v1, p0

    .restart local v1    # "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    const/4 v2, 0x0

    .line 648
    .local v2, "$i$f$ensureObjectArgsSizeAtLeast":I
    iget-object v3, v1, Landroidx/compose/runtime/changelist/Operations;->objectArgs:[Ljava/lang/Object;

    array-length v3, v3

    .line 649
    .restart local v3    # "currentSize$iv":I
    if-le v0, v3, :cond_2

    .line 650
    invoke-direct {v1, v3, v0}, Landroidx/compose/runtime/changelist/Operations;->resizeObjectArgs(II)V

    .line 652
    :cond_2
    nop

    .line 127
    .end local v0    # "requiredSize$iv":I
    .end local v1    # "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    .end local v2    # "$i$f$ensureObjectArgsSizeAtLeast":I
    .end local v3    # "currentSize$iv":I
    iget-object v0, p0, Landroidx/compose/runtime/changelist/Operations;->opCodes:[Landroidx/compose/runtime/changelist/Operation;

    iget v1, p0, Landroidx/compose/runtime/changelist/Operations;->opCodesSize:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Landroidx/compose/runtime/changelist/Operations;->opCodesSize:I

    aput-object p1, v0, v1

    .line 128
    iget v0, p0, Landroidx/compose/runtime/changelist/Operations;->intArgsSize:I

    invoke-virtual {p1}, Landroidx/compose/runtime/changelist/Operation;->getInts()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Landroidx/compose/runtime/changelist/Operations;->intArgsSize:I

    .line 129
    iget v0, p0, Landroidx/compose/runtime/changelist/Operations;->objectArgsSize:I

    invoke-virtual {p1}, Landroidx/compose/runtime/changelist/Operation;->getObjects()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Landroidx/compose/runtime/changelist/Operations;->objectArgsSize:I

    .line 130
    return-void
.end method

.method public toDebugString(Ljava/lang/String;)Ljava/lang/String;
    .locals 12
    .param p1, "linePrefix"    # Ljava/lang/String;

    .line 574
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object v1, v0

    .local v1, "$this$toDebugString_u24lambda_u2411":Ljava/lang/StringBuilder;
    const/4 v2, 0x0

    .line 575
    .local v2, "$i$a$-buildString-Operations$toDebugString$1":I
    const/4 v3, 0x0

    .line 576
    .local v3, "opNumber":I
    move-object v4, p0

    .local v4, "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    const/4 v5, 0x0

    .line 691
    .local v5, "$i$f$forEach":I
    invoke-virtual {v4}, Landroidx/compose/runtime/changelist/Operations;->isNotEmpty()Z

    move-result v6

    if-eqz v6, :cond_1

    .line 692
    new-instance v6, Landroidx/compose/runtime/changelist/Operations$OpIterator;

    invoke-direct {v6, v4}, Landroidx/compose/runtime/changelist/Operations$OpIterator;-><init>(Landroidx/compose/runtime/changelist/Operations;)V

    .line 694
    .local v6, "iterator$iv":Landroidx/compose/runtime/changelist/Operations$OpIterator;
    :goto_0
    move-object v7, v6

    .local v7, "$this$toDebugString_u24lambda_u2411_u24lambda_u2410":Landroidx/compose/runtime/changelist/Operations$OpIterator;
    const/4 v8, 0x0

    .line 577
    .local v8, "$i$a$-forEach-Operations$toDebugString$1$1":I
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 578
    add-int/lit8 v9, v3, 0x1

    .end local v3    # "opNumber":I
    .local v9, "opNumber":I
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 579
    const-string v3, ". "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 580
    invoke-direct {p0, v7, p1}, Landroidx/compose/runtime/changelist/Operations;->currentOpToDebugString(Landroidx/compose/runtime/changelist/Operations$OpIterator;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v10, "append(...)"

    invoke-static {v3, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v11, 0xa

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 581
    nop

    .line 694
    .end local v7    # "$this$toDebugString_u24lambda_u2411_u24lambda_u2410":Landroidx/compose/runtime/changelist/Operations$OpIterator;
    .end local v8    # "$i$a$-forEach-Operations$toDebugString$1$1":I
    nop

    .line 695
    invoke-virtual {v6}, Landroidx/compose/runtime/changelist/Operations$OpIterator;->next()Z

    move-result v3

    if-nez v3, :cond_0

    move v3, v9

    goto :goto_1

    :cond_0
    move v3, v9

    goto :goto_0

    .line 697
    .end local v6    # "iterator$iv":Landroidx/compose/runtime/changelist/Operations$OpIterator;
    .end local v9    # "opNumber":I
    .restart local v3    # "opNumber":I
    :cond_1
    :goto_1
    nop

    .line 582
    .end local v4    # "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    .end local v5    # "$i$f$forEach":I
    nop

    .line 574
    .end local v1    # "$this$toDebugString_u24lambda_u2411":Ljava/lang/StringBuilder;
    .end local v2    # "$i$a$-buildString-Operations$toDebugString$1":I
    .end local v3    # "opNumber":I
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation runtime Lkotlin/Deprecated;
        message = "toString() will return the default implementation from Any. Did you mean to use toDebugString()?"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "toDebugString()"
            imports = {}
        .end subannotation
    .end annotation

    .line 570
    invoke-super {p0}, Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
