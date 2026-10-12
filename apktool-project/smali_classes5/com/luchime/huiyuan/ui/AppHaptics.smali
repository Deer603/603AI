.class public final Lcom/luchime/huiyuan/ui/AppHaptics;
.super Ljava/lang/Object;
.source "AppHaptics.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/luchime/huiyuan/ui/AppHaptics$Companion;,
        Lcom/luchime/huiyuan/ui/AppHaptics$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000e\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0008\u0010\u000c\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/luchime/huiyuan/ui/AppHaptics;",
        "",
        "view",
        "Landroid/view/View;",
        "<init>",
        "(Landroid/view/View;)V",
        "lastStreamTickAt",
        "",
        "perform",
        "",
        "cue",
        "Lcom/luchime/huiyuan/ui/HapticCue;",
        "streamTick",
        "feedback",
        "constant",
        "",
        "Companion",
        "app"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field private static final Companion:Lcom/luchime/huiyuan/ui/AppHaptics$Companion;

.field public static final STREAM_TICK_THROTTLE_MS:J = 0x36L
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private lastStreamTickAt:J

.field private final view:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/luchime/huiyuan/ui/AppHaptics$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/luchime/huiyuan/ui/AppHaptics$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/luchime/huiyuan/ui/AppHaptics;->Companion:Lcom/luchime/huiyuan/ui/AppHaptics$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/luchime/huiyuan/ui/AppHaptics;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 1
    .param p1, "view"    # Landroid/view/View;

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/luchime/huiyuan/ui/AppHaptics;->view:Landroid/view/View;

    return-void
.end method

.method private final feedback(I)V
    .locals 1
    .param p1, "constant"    # I

    .line 69
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/AppHaptics;->view:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 70
    return-void
.end method

.method private final streamTick()V
    .locals 6

    .line 62
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    .line 63
    .local v0, "now":J
    iget-wide v2, p0, Lcom/luchime/huiyuan/ui/AppHaptics;->lastStreamTickAt:J

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    iget-wide v2, p0, Lcom/luchime/huiyuan/ui/AppHaptics;->lastStreamTickAt:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0x36

    cmp-long v2, v2, v4

    if-gez v2, :cond_0

    return-void

    .line 64
    :cond_0
    iput-wide v0, p0, Lcom/luchime/huiyuan/ui/AppHaptics;->lastStreamTickAt:J

    .line 65
    const/4 v2, 0x4

    invoke-direct {p0, v2}, Lcom/luchime/huiyuan/ui/AppHaptics;->feedback(I)V

    .line 66
    return-void
.end method


# virtual methods
.method public final perform(Lcom/luchime/huiyuan/ui/HapticCue;)V
    .locals 3
    .param p1, "cue"    # Lcom/luchime/huiyuan/ui/HapticCue;

    const-string v0, "cue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/AppHaptics;->view:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/luchime/huiyuan/ui/AppHaptics;->view:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->hasWindowFocus()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_3

    .line 37
    :cond_0
    sget-object v0, Lcom/luchime/huiyuan/ui/AppHaptics$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/luchime/huiyuan/ui/HapticCue;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/16 v1, 0x1e

    const/4 v2, 0x1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 57
    :pswitch_0
    invoke-direct {p0}, Lcom/luchime/huiyuan/ui/AppHaptics;->streamTick()V

    goto :goto_2

    .line 49
    :pswitch_1
    nop

    .line 50
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v1, :cond_1

    .line 51
    const/16 v0, 0x11

    goto :goto_0

    .line 53
    :cond_1
    const/4 v0, 0x0

    .line 49
    :goto_0
    invoke-direct {p0, v0}, Lcom/luchime/huiyuan/ui/AppHaptics;->feedback(I)V

    goto :goto_2

    .line 41
    :pswitch_2
    nop

    .line 42
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v1, :cond_2

    .line 43
    const/16 v2, 0x10

    goto :goto_1

    .line 45
    :cond_2
    nop

    .line 41
    :goto_1
    invoke-direct {p0, v2}, Lcom/luchime/huiyuan/ui/AppHaptics;->feedback(I)V

    goto :goto_2

    .line 39
    :pswitch_3
    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lcom/luchime/huiyuan/ui/AppHaptics;->feedback(I)V

    goto :goto_2

    .line 38
    :pswitch_4
    invoke-direct {p0, v2}, Lcom/luchime/huiyuan/ui/AppHaptics;->feedback(I)V

    .line 59
    :goto_2
    return-void

    .line 35
    :cond_3
    :goto_3
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
