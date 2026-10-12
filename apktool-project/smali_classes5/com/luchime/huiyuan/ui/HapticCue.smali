.class public final enum Lcom/luchime/huiyuan/ui/HapticCue;
.super Ljava/lang/Enum;
.source "AppHaptics.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/luchime/huiyuan/ui/HapticCue;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\t\u0008\u0080\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/luchime/huiyuan/ui/HapticCue;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "TAP",
        "SELECTION",
        "CONFIRM",
        "DESTRUCTIVE",
        "STREAM_TICK",
        "STREAM_COMPLETE",
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
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/luchime/huiyuan/ui/HapticCue;

.field public static final enum CONFIRM:Lcom/luchime/huiyuan/ui/HapticCue;

.field public static final enum DESTRUCTIVE:Lcom/luchime/huiyuan/ui/HapticCue;

.field public static final enum SELECTION:Lcom/luchime/huiyuan/ui/HapticCue;

.field public static final enum STREAM_COMPLETE:Lcom/luchime/huiyuan/ui/HapticCue;

.field public static final enum STREAM_TICK:Lcom/luchime/huiyuan/ui/HapticCue;

.field public static final enum TAP:Lcom/luchime/huiyuan/ui/HapticCue;


# direct methods
.method private static final synthetic $values()[Lcom/luchime/huiyuan/ui/HapticCue;
    .locals 6

    sget-object v0, Lcom/luchime/huiyuan/ui/HapticCue;->TAP:Lcom/luchime/huiyuan/ui/HapticCue;

    sget-object v1, Lcom/luchime/huiyuan/ui/HapticCue;->SELECTION:Lcom/luchime/huiyuan/ui/HapticCue;

    sget-object v2, Lcom/luchime/huiyuan/ui/HapticCue;->CONFIRM:Lcom/luchime/huiyuan/ui/HapticCue;

    sget-object v3, Lcom/luchime/huiyuan/ui/HapticCue;->DESTRUCTIVE:Lcom/luchime/huiyuan/ui/HapticCue;

    sget-object v4, Lcom/luchime/huiyuan/ui/HapticCue;->STREAM_TICK:Lcom/luchime/huiyuan/ui/HapticCue;

    sget-object v5, Lcom/luchime/huiyuan/ui/HapticCue;->STREAM_COMPLETE:Lcom/luchime/huiyuan/ui/HapticCue;

    filled-new-array/range {v0 .. v5}, [Lcom/luchime/huiyuan/ui/HapticCue;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 23
    new-instance v0, Lcom/luchime/huiyuan/ui/HapticCue;

    const-string v1, "TAP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/luchime/huiyuan/ui/HapticCue;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/luchime/huiyuan/ui/HapticCue;->TAP:Lcom/luchime/huiyuan/ui/HapticCue;

    .line 24
    new-instance v0, Lcom/luchime/huiyuan/ui/HapticCue;

    const-string v1, "SELECTION"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/luchime/huiyuan/ui/HapticCue;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/luchime/huiyuan/ui/HapticCue;->SELECTION:Lcom/luchime/huiyuan/ui/HapticCue;

    .line 25
    new-instance v0, Lcom/luchime/huiyuan/ui/HapticCue;

    const-string v1, "CONFIRM"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/luchime/huiyuan/ui/HapticCue;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/luchime/huiyuan/ui/HapticCue;->CONFIRM:Lcom/luchime/huiyuan/ui/HapticCue;

    .line 26
    new-instance v0, Lcom/luchime/huiyuan/ui/HapticCue;

    const-string v1, "DESTRUCTIVE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/luchime/huiyuan/ui/HapticCue;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/luchime/huiyuan/ui/HapticCue;->DESTRUCTIVE:Lcom/luchime/huiyuan/ui/HapticCue;

    .line 27
    new-instance v0, Lcom/luchime/huiyuan/ui/HapticCue;

    const-string v1, "STREAM_TICK"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/luchime/huiyuan/ui/HapticCue;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/luchime/huiyuan/ui/HapticCue;->STREAM_TICK:Lcom/luchime/huiyuan/ui/HapticCue;

    .line 28
    new-instance v0, Lcom/luchime/huiyuan/ui/HapticCue;

    const-string v1, "STREAM_COMPLETE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/luchime/huiyuan/ui/HapticCue;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/luchime/huiyuan/ui/HapticCue;->STREAM_COMPLETE:Lcom/luchime/huiyuan/ui/HapticCue;

    invoke-static {}, Lcom/luchime/huiyuan/ui/HapticCue;->$values()[Lcom/luchime/huiyuan/ui/HapticCue;

    move-result-object v0

    sput-object v0, Lcom/luchime/huiyuan/ui/HapticCue;->$VALUES:[Lcom/luchime/huiyuan/ui/HapticCue;

    sget-object v0, Lcom/luchime/huiyuan/ui/HapticCue;->$VALUES:[Lcom/luchime/huiyuan/ui/HapticCue;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/luchime/huiyuan/ui/HapticCue;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .param p1, "$enum$name"    # Ljava/lang/String;
    .param p2, "$enum$ordinal"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 22
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/luchime/huiyuan/ui/HapticCue;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/luchime/huiyuan/ui/HapticCue;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/luchime/huiyuan/ui/HapticCue;
    .locals 1

    const-class v0, Lcom/luchime/huiyuan/ui/HapticCue;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/luchime/huiyuan/ui/HapticCue;

    return-object v0
.end method

.method public static values()[Lcom/luchime/huiyuan/ui/HapticCue;
    .locals 1

    sget-object v0, Lcom/luchime/huiyuan/ui/HapticCue;->$VALUES:[Lcom/luchime/huiyuan/ui/HapticCue;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/luchime/huiyuan/ui/HapticCue;

    return-object v0
.end method
