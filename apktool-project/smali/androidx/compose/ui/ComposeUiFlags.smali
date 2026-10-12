.class public final Landroidx/compose/ui/ComposeUiFlags;
.super Ljava/lang/Object;
.source "ComposeUiFlags.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\u0005\u0010\u0002R\u0018\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\u0007\u0010\u0002R\u0018\u0010\u0008\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\t\u0010\u0002R\u0018\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\u000b\u0010\u0002R\u0018\u0010\u000c\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\r\u0010\u0002R\u0018\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\u000f\u0010\u0002\u00a8\u0006\u0010"
    }
    d2 = {
        "Landroidx/compose/ui/ComposeUiFlags;",
        "",
        "()V",
        "NewNestedScrollFlingDispatchingEnabled",
        "",
        "getNewNestedScrollFlingDispatchingEnabled$annotations",
        "isRectTrackingEnabled",
        "isRectTrackingEnabled$annotations",
        "isRemoveFocusedViewFixEnabled",
        "isRemoveFocusedViewFixEnabled$annotations",
        "isSemanticAutofillEnabled",
        "isSemanticAutofillEnabled$annotations",
        "isTrackFocusEnabled",
        "isTrackFocusEnabled$annotations",
        "isViewFocusFixEnabled",
        "isViewFocusFixEnabled$annotations",
        "ui_release"
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

.field public static final INSTANCE:Landroidx/compose/ui/ComposeUiFlags;

.field public static NewNestedScrollFlingDispatchingEnabled:Z

.field public static isRectTrackingEnabled:Z

.field public static isRemoveFocusedViewFixEnabled:Z

.field public static isSemanticAutofillEnabled:Z

.field public static isTrackFocusEnabled:Z

.field public static isViewFocusFixEnabled:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/ComposeUiFlags;

    invoke-direct {v0}, Landroidx/compose/ui/ComposeUiFlags;-><init>()V

    sput-object v0, Landroidx/compose/ui/ComposeUiFlags;->INSTANCE:Landroidx/compose/ui/ComposeUiFlags;

    .line 65
    const/4 v0, 0x1

    sput-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isRectTrackingEnabled:Z

    .line 75
    sput-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->NewNestedScrollFlingDispatchingEnabled:Z

    .line 81
    sput-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isSemanticAutofillEnabled:Z

    .line 102
    sput-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    const/16 v0, 0x8

    sput v0, Landroidx/compose/ui/ComposeUiFlags;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic getNewNestedScrollFlingDispatchingEnabled$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic isRectTrackingEnabled$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic isRemoveFocusedViewFixEnabled$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic isSemanticAutofillEnabled$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic isTrackFocusEnabled$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic isViewFocusFixEnabled$annotations()V
    .locals 0

    return-void
.end method
