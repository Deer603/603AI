.class public final Landroidx/compose/ui/platform/FocusFinderCompat;
.super Ljava/lang/Object;
.source "FocusFinderCompat.android.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/platform/FocusFinderCompat$Companion;,
        Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFocusFinderCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusFinderCompat.android.kt\nandroidx/compose/ui/platform/FocusFinderCompat\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,463:1\n1#2:464\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0018\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000  2\u00020\u0001:\u0002 !B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\n\u001a\u00020\u000bH\u0002J0\u0010\u000c\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J \u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011J2\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0003J\"\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u001a\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0002J0\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00182\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J2\u0010\u001c\u001a\u0004\u0018\u00010\u00072\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00182\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""
    }
    d2 = {
        "Landroidx/compose/ui/platform/FocusFinderCompat;",
        "",
        "()V",
        "focusedRect",
        "Landroid/graphics/Rect;",
        "tmpList",
        "Landroidx/collection/MutableObjectList;",
        "Landroid/view/View;",
        "userSpecifiedFocusComparator",
        "Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator;",
        "FocusFinder",
        "",
        "findNextFocus",
        "root",
        "Landroid/view/ViewGroup;",
        "focused",
        "direction",
        "",
        "focusables",
        "findNextFocus1d",
        "findNextFocusInRelativeDirection",
        "findNextUserSpecifiedFocus",
        "getEffectiveRoot",
        "getNextFocusable",
        "Landroidx/collection/ObjectList;",
        "count",
        "outLooped",
        "",
        "getPreviousFocusable",
        "isValidId",
        "",
        "id",
        "Companion",
        "UserSpecifiedFocusComparator",
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

.field public static final Companion:Landroidx/compose/ui/platform/FocusFinderCompat$Companion;

.field private static final FocusFinderThreadLocal:Landroidx/compose/ui/platform/FocusFinderCompat$Companion$FocusFinderThreadLocal$1;


# instance fields
.field private final focusedRect:Landroid/graphics/Rect;

.field private final tmpList:Landroidx/collection/MutableObjectList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableObjectList<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private final userSpecifiedFocusComparator:Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/ui/platform/FocusFinderCompat$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/FocusFinderCompat$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/compose/ui/platform/FocusFinderCompat;->Companion:Landroidx/compose/ui/platform/FocusFinderCompat$Companion;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/ui/platform/FocusFinderCompat;->$stable:I

    .line 45
    new-instance v0, Landroidx/compose/ui/platform/FocusFinderCompat$Companion$FocusFinderThreadLocal$1;

    invoke-direct {v0}, Landroidx/compose/ui/platform/FocusFinderCompat$Companion$FocusFinderThreadLocal$1;-><init>()V

    sput-object v0, Landroidx/compose/ui/platform/FocusFinderCompat;->FocusFinderThreadLocal:Landroidx/compose/ui/platform/FocusFinderCompat$Companion$FocusFinderThreadLocal$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/compose/ui/platform/FocusFinderCompat;->focusedRect:Landroid/graphics/Rect;

    .line 59
    new-instance v0, Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator;

    new-instance v1, Landroidx/compose/ui/platform/FocusFinderCompat$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0}, Landroidx/compose/ui/platform/FocusFinderCompat$$ExternalSyntheticLambda0;-><init>(Landroidx/compose/ui/platform/FocusFinderCompat;)V

    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator;-><init>(Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator$NextFocusGetter;)V

    iput-object v0, p0, Landroidx/compose/ui/platform/FocusFinderCompat;->userSpecifiedFocusComparator:Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator;

    .line 63
    new-instance v0, Landroidx/collection/MutableObjectList;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableObjectList;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Landroidx/compose/ui/platform/FocusFinderCompat;->tmpList:Landroidx/collection/MutableObjectList;

    .line 42
    return-void
.end method

.method private final FocusFinder()V
    .locals 0

    .line 66
    return-void
.end method

.method public static final synthetic access$getFocusFinderThreadLocal$cp()Landroidx/compose/ui/platform/FocusFinderCompat$Companion$FocusFinderThreadLocal$1;
    .locals 1

    .line 42
    sget-object v0, Landroidx/compose/ui/platform/FocusFinderCompat;->FocusFinderThreadLocal:Landroidx/compose/ui/platform/FocusFinderCompat$Companion$FocusFinderThreadLocal$1;

    return-object v0
.end method

.method private final findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;ILandroidx/collection/MutableObjectList;)Landroid/view/View;
    .locals 2
    .param p1, "root"    # Landroid/view/ViewGroup;
    .param p2, "focused"    # Landroid/view/View;
    .param p3, "direction"    # I
    .param p4, "focusables"    # Landroidx/collection/MutableObjectList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "Landroid/view/View;",
            "I",
            "Landroidx/collection/MutableObjectList<",
            "Landroid/view/View;",
            ">;)",
            "Landroid/view/View;"
        }
    .end annotation

    .line 163
    iget-object v0, p0, Landroidx/compose/ui/platform/FocusFinderCompat;->focusedRect:Landroid/graphics/Rect;

    .line 165
    .local v0, "focusedRect":Landroid/graphics/Rect;
    invoke-virtual {p2, v0}, Landroid/view/View;->getFocusedRect(Landroid/graphics/Rect;)V

    .line 166
    invoke-virtual {p1, p2, v0}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 168
    invoke-direct {p0, p4, p1, p2, p3}, Landroidx/compose/ui/platform/FocusFinderCompat;->findNextFocusInRelativeDirection(Landroidx/collection/MutableObjectList;Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    return-object v1
.end method

.method private final findNextFocusInRelativeDirection(Landroidx/collection/MutableObjectList;Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;
    .locals 4
    .param p1, "focusables"    # Landroidx/collection/MutableObjectList;
    .param p2, "root"    # Landroid/view/ViewGroup;
    .param p3, "focused"    # Landroid/view/View;
    .param p4, "direction"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/MutableObjectList<",
            "Landroid/view/View;",
            ">;",
            "Landroid/view/ViewGroup;",
            "Landroid/view/View;",
            "I)",
            "Landroid/view/View;"
        }
    .end annotation

    .line 178
    nop

    .line 180
    :try_start_0
    iget-object v0, p0, Landroidx/compose/ui/platform/FocusFinderCompat;->userSpecifiedFocusComparator:Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator;

    move-object v1, p1

    check-cast v1, Landroidx/collection/ObjectList;

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v2, p2

    check-cast v2, Landroid/view/View;

    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator;->setFocusables(Landroidx/collection/ObjectList;Landroid/view/View;)V

    .line 181
    invoke-virtual {p1}, Landroidx/collection/MutableObjectList;->asMutableList()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/platform/FocusFinderCompat;->userSpecifiedFocusComparator:Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator;

    check-cast v1, Ljava/util/Comparator;

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 183
    iget-object v0, p0, Landroidx/compose/ui/platform/FocusFinderCompat;->userSpecifiedFocusComparator:Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator;->recycle()V

    .line 184
    nop

    .line 186
    invoke-virtual {p1}, Landroidx/collection/MutableObjectList;->getSize()I

    move-result v0

    .line 187
    .local v0, "count":I
    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    .line 188
    const/4 v1, 0x0

    return-object v1

    .line 190
    :cond_0
    const/4 v1, 0x0

    .line 191
    .local v1, "next":Landroid/view/View;
    const/4 v2, 0x1

    new-array v2, v2, [Z

    .line 192
    .local v2, "looped":[Z
    packed-switch p4, :pswitch_data_0

    goto :goto_0

    .line 193
    :pswitch_0
    move-object v3, p1

    check-cast v3, Landroidx/collection/ObjectList;

    invoke-direct {p0, p3, v3, v0, v2}, Landroidx/compose/ui/platform/FocusFinderCompat;->getNextFocusable(Landroid/view/View;Landroidx/collection/ObjectList;I[Z)Landroid/view/View;

    move-result-object v1

    goto :goto_0

    .line 194
    :pswitch_1
    move-object v3, p1

    check-cast v3, Landroidx/collection/ObjectList;

    invoke-direct {p0, p3, v3, v0, v2}, Landroidx/compose/ui/platform/FocusFinderCompat;->getPreviousFocusable(Landroid/view/View;Landroidx/collection/ObjectList;I[Z)Landroid/view/View;

    move-result-object v1

    .line 196
    :goto_0
    if-nez v1, :cond_1

    add-int/lit8 v3, v0, -0x1

    invoke-virtual {p1, v3}, Landroidx/collection/MutableObjectList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    goto :goto_1

    :cond_1
    move-object v3, v1

    :goto_1
    return-object v3

    .line 183
    .end local v0    # "count":I
    .end local v1    # "next":Landroid/view/View;
    .end local v2    # "looped":[Z
    :catchall_0
    move-exception v0

    iget-object v1, p0, Landroidx/compose/ui/platform/FocusFinderCompat;->userSpecifiedFocusComparator:Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator;

    invoke-virtual {v1}, Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator;->recycle()V

    throw v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final findNextUserSpecifiedFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;
    .locals 7
    .param p1, "root"    # Landroid/view/ViewGroup;
    .param p2, "focused"    # Landroid/view/View;
    .param p3, "direction"    # I

    .line 133
    move-object v0, p1

    check-cast v0, Landroid/view/View;

    invoke-static {p2, v0, p3}, Landroidx/compose/ui/platform/FocusFinderCompat_androidKt;->access$findUserSetNextFocus(Landroid/view/View;Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    .line 134
    .local v0, "userSetNextFocus":Landroid/view/View;
    move-object v1, v0

    .line 135
    .local v1, "cycleCheck":Landroid/view/View;
    const/4 v2, 0x0

    .local v2, "cycleStep":Z
    const/4 v2, 0x1

    .line 136
    :cond_0
    const/4 v3, 0x0

    if-eqz v0, :cond_5

    .line 137
    nop

    .line 138
    invoke-virtual {v0}, Landroid/view/View;->isFocusable()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 139
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v4

    if-nez v4, :cond_2

    .line 140
    invoke-virtual {v0}, Landroid/view/View;->isInTouchMode()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->isFocusableInTouchMode()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 142
    :cond_1
    return-object v0

    .line 144
    :cond_2
    move-object v4, p1

    check-cast v4, Landroid/view/View;

    invoke-static {v0, v4, p3}, Landroidx/compose/ui/platform/FocusFinderCompat_androidKt;->access$findUserSetNextFocus(Landroid/view/View;Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    .line 145
    if-nez v2, :cond_3

    const/4 v4, 0x1

    goto :goto_0

    :cond_3
    const/4 v4, 0x0

    :goto_0
    move v5, v4

    .line 464
    .local v5, "it":Z
    const/4 v6, 0x0

    .line 145
    .local v6, "$i$a$-also-FocusFinderCompat$findNextUserSpecifiedFocus$1":I
    move v2, v5

    .end local v5    # "it":Z
    .end local v6    # "$i$a$-also-FocusFinderCompat$findNextUserSpecifiedFocus$1":I
    if-eqz v4, :cond_0

    .line 146
    if-eqz v1, :cond_4

    move-object v4, p1

    check-cast v4, Landroid/view/View;

    invoke-static {v1, v4, p3}, Landroidx/compose/ui/platform/FocusFinderCompat_androidKt;->access$findUserSetNextFocus(Landroid/view/View;Landroid/view/View;I)Landroid/view/View;

    move-result-object v4

    goto :goto_1

    :cond_4
    move-object v4, v3

    :goto_1
    move-object v1, v4

    .line 147
    if-ne v1, v0, :cond_0

    .line 150
    nop

    .line 154
    :cond_5
    return-object v3
.end method

.method private final getEffectiveRoot(Landroid/view/ViewGroup;Landroid/view/View;)Landroid/view/ViewGroup;
    .locals 5
    .param p1, "root"    # Landroid/view/ViewGroup;
    .param p2, "focused"    # Landroid/view/View;

    .line 106
    if-eqz p2, :cond_5

    if-ne p2, p1, :cond_0

    goto :goto_2

    .line 109
    :cond_0
    const/4 v0, 0x0

    .line 110
    .local v0, "effective":Landroid/view/ViewGroup;
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    .line 111
    .local v1, "nextParent":Landroid/view/ViewParent;
    :goto_0
    instance-of v2, v1, Landroid/view/ViewGroup;

    if-eqz v2, :cond_4

    .line 112
    if-ne v1, p1, :cond_2

    .line 113
    if-nez v0, :cond_1

    move-object v2, p1

    goto :goto_1

    :cond_1
    move-object v2, v0

    :goto_1
    return-object v2

    .line 115
    :cond_2
    move-object v2, v1

    .line 116
    .local v2, "vg":Landroid/view/ViewParent;
    nop

    .line 117
    move-object v3, v2

    check-cast v3, Landroid/view/ViewGroup;

    invoke-virtual {v3}, Landroid/view/ViewGroup;->getTouchscreenBlocksFocus()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 118
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    .line 119
    nop

    .line 118
    const-string v4, "android.hardware.touchscreen"

    invoke-virtual {v3, v4}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 124
    move-object v0, v2

    check-cast v0, Landroid/view/ViewGroup;

    .line 126
    :cond_3
    move-object v3, v1

    check-cast v3, Landroid/view/ViewGroup;

    invoke-virtual {v3}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    .end local v2    # "vg":Landroid/view/ViewParent;
    goto :goto_0

    .line 128
    :cond_4
    return-object p1

    .line 107
    .end local v0    # "effective":Landroid/view/ViewGroup;
    .end local v1    # "nextParent":Landroid/view/ViewParent;
    :cond_5
    :goto_2
    return-object p1
.end method

.method private final getNextFocusable(Landroid/view/View;Landroidx/collection/ObjectList;I[Z)Landroid/view/View;
    .locals 3
    .param p1, "focused"    # Landroid/view/View;
    .param p2, "focusables"    # Landroidx/collection/ObjectList;
    .param p3, "count"    # I
    .param p4, "outLooped"    # [Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Landroidx/collection/ObjectList<",
            "Landroid/view/View;",
            ">;I[Z)",
            "Landroid/view/View;"
        }
    .end annotation

    .line 205
    const/4 v0, 0x2

    if-ge p3, v0, :cond_0

    .line 206
    const/4 v0, 0x0

    return-object v0

    .line 208
    :cond_0
    invoke-virtual {p2, p1}, Landroidx/collection/ObjectList;->lastIndexOf(Ljava/lang/Object;)I

    move-result v0

    .line 209
    .local v0, "position":I
    if-ltz v0, :cond_1

    add-int/lit8 v1, v0, 0x1

    if-ge v1, p3, :cond_1

    .line 210
    add-int/lit8 v1, v0, 0x1

    invoke-virtual {p2, v1}, Landroidx/collection/ObjectList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    return-object v1

    .line 212
    :cond_1
    const/4 v1, 0x0

    const/4 v2, 0x1

    aput-boolean v2, p4, v1

    .line 213
    invoke-virtual {p2, v1}, Landroidx/collection/ObjectList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    return-object v1
.end method

.method private final getPreviousFocusable(Landroid/view/View;Landroidx/collection/ObjectList;I[Z)Landroid/view/View;
    .locals 2
    .param p1, "focused"    # Landroid/view/View;
    .param p2, "focusables"    # Landroidx/collection/ObjectList;
    .param p3, "count"    # I
    .param p4, "outLooped"    # [Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Landroidx/collection/ObjectList<",
            "Landroid/view/View;",
            ">;I[Z)",
            "Landroid/view/View;"
        }
    .end annotation

    .line 222
    const/4 v0, 0x2

    if-ge p3, v0, :cond_0

    .line 223
    const/4 v0, 0x0

    return-object v0

    .line 225
    :cond_0
    if-eqz p1, :cond_1

    .line 226
    invoke-virtual {p2, p1}, Landroidx/collection/ObjectList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    .line 227
    .local v0, "position":I
    if-lez v0, :cond_1

    .line 228
    add-int/lit8 v1, v0, -0x1

    invoke-virtual {p2, v1}, Landroidx/collection/ObjectList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    return-object v1

    .line 231
    .end local v0    # "position":I
    :cond_1
    const/4 v0, 0x0

    const/4 v1, 0x1

    aput-boolean v1, p4, v0

    .line 232
    add-int/lit8 v0, p3, -0x1

    invoke-virtual {p2, v0}, Landroidx/collection/ObjectList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final isValidId(I)Z
    .locals 1
    .param p1, "id"    # I

    .line 236
    if-eqz p1, :cond_0

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static final userSpecifiedFocusComparator$lambda$0(Landroidx/compose/ui/platform/FocusFinderCompat;Landroid/view/View;Landroid/view/View;)Landroid/view/View;
    .locals 1
    .param p0, "this$0"    # Landroidx/compose/ui/platform/FocusFinderCompat;
    .param p1, "r"    # Landroid/view/View;
    .param p2, "v"    # Landroid/view/View;

    .line 60
    invoke-virtual {p2}, Landroid/view/View;->getNextFocusForwardId()I

    move-result v0

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/FocusFinderCompat;->isValidId(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    invoke-static {p2, p1, v0}, Landroidx/compose/ui/platform/FocusFinderCompat_androidKt;->access$findUserSetNextFocus(Landroid/view/View;Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method


# virtual methods
.method public final findNextFocus1d(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;
    .locals 4
    .param p1, "root"    # Landroid/view/ViewGroup;
    .param p2, "focused"    # Landroid/view/View;
    .param p3, "direction"    # I

    .line 78
    invoke-direct {p0, p1, p2}, Landroidx/compose/ui/platform/FocusFinderCompat;->getEffectiveRoot(Landroid/view/ViewGroup;Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object v0

    .line 79
    .local v0, "effectiveRoot":Landroid/view/ViewGroup;
    invoke-direct {p0, v0, p2, p3}, Landroidx/compose/ui/platform/FocusFinderCompat;->findNextUserSpecifiedFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    .line 80
    .local v1, "next":Landroid/view/View;
    if-eqz v1, :cond_0

    .line 81
    return-object v1

    .line 83
    :cond_0
    iget-object v2, p0, Landroidx/compose/ui/platform/FocusFinderCompat;->tmpList:Landroidx/collection/MutableObjectList;

    .line 84
    .local v2, "focusables":Landroidx/collection/MutableObjectList;
    nop

    .line 85
    :try_start_0
    invoke-virtual {v2}, Landroidx/collection/MutableObjectList;->clear()V

    .line 86
    move-object v3, v0

    check-cast v3, Landroid/view/View;

    invoke-static {v3, v2, p3}, Landroidx/compose/ui/platform/FocusFinderCompat_androidKt;->access$addFocusableViews(Landroid/view/View;Landroidx/collection/MutableObjectList;I)V

    .line 87
    invoke-virtual {v2}, Landroidx/collection/MutableObjectList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    .line 88
    invoke-direct {p0, v0, p2, p3, v2}, Landroidx/compose/ui/platform/FocusFinderCompat;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;ILandroidx/collection/MutableObjectList;)Landroid/view/View;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v3

    .line 91
    :cond_1
    invoke-virtual {v2}, Landroidx/collection/MutableObjectList;->clear()V

    .line 92
    nop

    .line 93
    return-object v1

    .line 91
    :catchall_0
    move-exception v3

    invoke-virtual {v2}, Landroidx/collection/MutableObjectList;->clear()V

    throw v3
.end method
