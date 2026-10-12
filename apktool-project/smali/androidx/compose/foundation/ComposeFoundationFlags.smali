.class public final Landroidx/compose/foundation/ComposeFoundationFlags;
.super Ljava/lang/Object;
.source "ComposeFoundationFlags.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\u0005\u0010\u0002R\u0018\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\u0007\u0010\u0002R\u0018\u0010\u0008\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\t\u0010\u0002\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/compose/foundation/ComposeFoundationFlags;",
        "",
        "()V",
        "DragGesturePickUpEnabled",
        "",
        "getDragGesturePickUpEnabled$annotations",
        "NewNestedFlingPropagationEnabled",
        "getNewNestedFlingPropagationEnabled$annotations",
        "isDetectTapGesturesImmediateCoroutineDispatchEnabled",
        "isDetectTapGesturesImmediateCoroutineDispatchEnabled$annotations",
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

.field public static DragGesturePickUpEnabled:Z

.field public static final INSTANCE:Landroidx/compose/foundation/ComposeFoundationFlags;

.field public static NewNestedFlingPropagationEnabled:Z

.field public static isDetectTapGesturesImmediateCoroutineDispatchEnabled:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/ComposeFoundationFlags;

    invoke-direct {v0}, Landroidx/compose/foundation/ComposeFoundationFlags;-><init>()V

    sput-object v0, Landroidx/compose/foundation/ComposeFoundationFlags;->INSTANCE:Landroidx/compose/foundation/ComposeFoundationFlags;

    .line 66
    const/4 v0, 0x1

    sput-boolean v0, Landroidx/compose/foundation/ComposeFoundationFlags;->NewNestedFlingPropagationEnabled:Z

    .line 75
    sput-boolean v0, Landroidx/compose/foundation/ComposeFoundationFlags;->DragGesturePickUpEnabled:Z

    .line 83
    sput-boolean v0, Landroidx/compose/foundation/ComposeFoundationFlags;->isDetectTapGesturesImmediateCoroutineDispatchEnabled:Z

    const/16 v0, 0x8

    sput v0, Landroidx/compose/foundation/ComposeFoundationFlags;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic getDragGesturePickUpEnabled$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getNewNestedFlingPropagationEnabled$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic isDetectTapGesturesImmediateCoroutineDispatchEnabled$annotations()V
    .locals 0

    return-void
.end method
