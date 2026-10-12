.class public final synthetic Lcom/luchime/huiyuan/ui/AppHaptics$WhenMappings;
.super Ljava/lang/Object;
.source "AppHaptics.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/luchime/huiyuan/ui/AppHaptics;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "WhenMappings"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic $EnumSwitchMapping$0:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lcom/luchime/huiyuan/ui/HapticCue;->values()[Lcom/luchime/huiyuan/ui/HapticCue;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Lcom/luchime/huiyuan/ui/HapticCue;->TAP:Lcom/luchime/huiyuan/ui/HapticCue;

    invoke-virtual {v1}, Lcom/luchime/huiyuan/ui/HapticCue;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    :goto_0
    :try_start_1
    sget-object v1, Lcom/luchime/huiyuan/ui/HapticCue;->SELECTION:Lcom/luchime/huiyuan/ui/HapticCue;

    invoke-virtual {v1}, Lcom/luchime/huiyuan/ui/HapticCue;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v1

    :goto_1
    :try_start_2
    sget-object v1, Lcom/luchime/huiyuan/ui/HapticCue;->CONFIRM:Lcom/luchime/huiyuan/ui/HapticCue;

    invoke-virtual {v1}, Lcom/luchime/huiyuan/ui/HapticCue;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-exception v1

    :goto_2
    :try_start_3
    sget-object v1, Lcom/luchime/huiyuan/ui/HapticCue;->STREAM_COMPLETE:Lcom/luchime/huiyuan/ui/HapticCue;

    invoke-virtual {v1}, Lcom/luchime/huiyuan/ui/HapticCue;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_3

    :catch_3
    move-exception v1

    :goto_3
    :try_start_4
    sget-object v1, Lcom/luchime/huiyuan/ui/HapticCue;->DESTRUCTIVE:Lcom/luchime/huiyuan/ui/HapticCue;

    invoke-virtual {v1}, Lcom/luchime/huiyuan/ui/HapticCue;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_4

    :catch_4
    move-exception v1

    :goto_4
    :try_start_5
    sget-object v1, Lcom/luchime/huiyuan/ui/HapticCue;->STREAM_TICK:Lcom/luchime/huiyuan/ui/HapticCue;

    invoke-virtual {v1}, Lcom/luchime/huiyuan/ui/HapticCue;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_5

    :catch_5
    move-exception v1

    :goto_5
    sput-object v0, Lcom/luchime/huiyuan/ui/AppHaptics$WhenMappings;->$EnumSwitchMapping$0:[I

    return-void
.end method
