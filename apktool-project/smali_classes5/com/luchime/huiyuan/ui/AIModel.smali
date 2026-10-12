.class public final enum Lcom/luchime/huiyuan/ui/AIModel;
.super Ljava/lang/Enum;
.source "RoomScreen.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/luchime/huiyuan/ui/AIModel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u000e\u0008\u0080\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B1\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000cR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000cR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/luchime/huiyuan/ui/AIModel;",
        "",
        "displayName",
        "",
        "shortName",
        "askName",
        "chipLabel",
        "avatarRes",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
        "getDisplayName",
        "()Ljava/lang/String;",
        "getShortName",
        "getAskName",
        "getChipLabel",
        "getAvatarRes",
        "()I",
        "HUIYUAN",
        "PIAO",
        "GUIGUI",
        "TANGO",
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

.field private static final synthetic $VALUES:[Lcom/luchime/huiyuan/ui/AIModel;

.field public static final enum GUIGUI:Lcom/luchime/huiyuan/ui/AIModel;

.field public static final enum HUIYUAN:Lcom/luchime/huiyuan/ui/AIModel;

.field public static final enum PIAO:Lcom/luchime/huiyuan/ui/AIModel;

.field public static final enum TANGO:Lcom/luchime/huiyuan/ui/AIModel;


# instance fields
.field private final askName:Ljava/lang/String;

.field private final avatarRes:I

.field private final chipLabel:Ljava/lang/String;

.field private final displayName:Ljava/lang/String;

.field private final shortName:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/luchime/huiyuan/ui/AIModel;
    .locals 4

    sget-object v0, Lcom/luchime/huiyuan/ui/AIModel;->HUIYUAN:Lcom/luchime/huiyuan/ui/AIModel;

    sget-object v1, Lcom/luchime/huiyuan/ui/AIModel;->PIAO:Lcom/luchime/huiyuan/ui/AIModel;

    sget-object v2, Lcom/luchime/huiyuan/ui/AIModel;->GUIGUI:Lcom/luchime/huiyuan/ui/AIModel;

    sget-object v3, Lcom/luchime/huiyuan/ui/AIModel;->TANGO:Lcom/luchime/huiyuan/ui/AIModel;

    filled-new-array {v0, v1, v2, v3}, [Lcom/luchime/huiyuan/ui/AIModel;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 11

    .line 33
    new-instance v0, Lcom/luchime/huiyuan/ui/AIModel;

    const-string v6, "\ud83d\udfe1 \u56f0\u56f0"

    sget v7, Lcom/luchime/huiyuan/R$drawable;->capybara:I

    const-string v1, "HUIYUAN"

    const/4 v2, 0x0

    const-string v3, "\u6c47\u5143AI\uff08\u56f0\u56f0\uff09"

    const-string v4, "\u56f0\u56f0"

    const-string v5, "\u56f0\u56f0"

    invoke-direct/range {v0 .. v7}, Lcom/luchime/huiyuan/ui/AIModel;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Lcom/luchime/huiyuan/ui/AIModel;->HUIYUAN:Lcom/luchime/huiyuan/ui/AIModel;

    .line 34
    new-instance v1, Lcom/luchime/huiyuan/ui/AIModel;

    const-string v7, "\ud83d\udc27 \u6734AI"

    sget v8, Lcom/luchime/huiyuan/R$drawable;->piaoai:I

    const-string v2, "PIAO"

    const/4 v3, 0x1

    const-string v4, "\u6734AI"

    const-string v5, "\u6734AI"

    const-string v6, "\u6734\u6734"

    invoke-direct/range {v1 .. v8}, Lcom/luchime/huiyuan/ui/AIModel;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v1, Lcom/luchime/huiyuan/ui/AIModel;->PIAO:Lcom/luchime/huiyuan/ui/AIModel;

    .line 35
    new-instance v2, Lcom/luchime/huiyuan/ui/AIModel;

    const-string v8, "\ud83d\udc22 \u9f9f\u9f9f"

    sget v9, Lcom/luchime/huiyuan/R$drawable;->guigui:I

    const-string v3, "GUIGUI"

    const/4 v4, 0x2

    const-string v5, "\u9f9f\u9f9fAI"

    const-string v6, "\u9f9f\u9f9f"

    const-string v7, "\u9f9f\u9f9f"

    invoke-direct/range {v2 .. v9}, Lcom/luchime/huiyuan/ui/AIModel;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v2, Lcom/luchime/huiyuan/ui/AIModel;->GUIGUI:Lcom/luchime/huiyuan/ui/AIModel;

    .line 36
    new-instance v3, Lcom/luchime/huiyuan/ui/AIModel;

    const-string v9, "\ud83d\udc3b \u63a2\u6208"

    sget v10, Lcom/luchime/huiyuan/R$drawable;->tango:I

    const-string v4, "TANGO"

    const/4 v5, 0x3

    const-string v6, "Tango AI"

    const-string v7, "\u63a2\u6208"

    const-string v8, "\u63a2\u6208"

    invoke-direct/range {v3 .. v10}, Lcom/luchime/huiyuan/ui/AIModel;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v3, Lcom/luchime/huiyuan/ui/AIModel;->TANGO:Lcom/luchime/huiyuan/ui/AIModel;

    invoke-static {}, Lcom/luchime/huiyuan/ui/AIModel;->$values()[Lcom/luchime/huiyuan/ui/AIModel;

    move-result-object v0

    sput-object v0, Lcom/luchime/huiyuan/ui/AIModel;->$VALUES:[Lcom/luchime/huiyuan/ui/AIModel;

    sget-object v0, Lcom/luchime/huiyuan/ui/AIModel;->$VALUES:[Lcom/luchime/huiyuan/ui/AIModel;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/luchime/huiyuan/ui/AIModel;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0
    .param p1, "$enum$name"    # Ljava/lang/String;
    .param p2, "$enum$ordinal"    # I
    .param p3, "displayName"    # Ljava/lang/String;
    .param p4, "shortName"    # Ljava/lang/String;
    .param p5, "askName"    # Ljava/lang/String;
    .param p6, "chipLabel"    # Ljava/lang/String;
    .param p7, "avatarRes"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    .line 26
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 27
    iput-object p3, p0, Lcom/luchime/huiyuan/ui/AIModel;->displayName:Ljava/lang/String;

    .line 28
    iput-object p4, p0, Lcom/luchime/huiyuan/ui/AIModel;->shortName:Ljava/lang/String;

    .line 29
    iput-object p5, p0, Lcom/luchime/huiyuan/ui/AIModel;->askName:Ljava/lang/String;

    .line 30
    iput-object p6, p0, Lcom/luchime/huiyuan/ui/AIModel;->chipLabel:Ljava/lang/String;

    .line 31
    iput p7, p0, Lcom/luchime/huiyuan/ui/AIModel;->avatarRes:I

    .line 26
    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/luchime/huiyuan/ui/AIModel;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/luchime/huiyuan/ui/AIModel;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/luchime/huiyuan/ui/AIModel;
    .locals 1

    const-class v0, Lcom/luchime/huiyuan/ui/AIModel;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/luchime/huiyuan/ui/AIModel;

    return-object v0
.end method

.method public static values()[Lcom/luchime/huiyuan/ui/AIModel;
    .locals 1

    sget-object v0, Lcom/luchime/huiyuan/ui/AIModel;->$VALUES:[Lcom/luchime/huiyuan/ui/AIModel;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/luchime/huiyuan/ui/AIModel;

    return-object v0
.end method


# virtual methods
.method public final getAskName()Ljava/lang/String;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/AIModel;->askName:Ljava/lang/String;

    return-object v0
.end method

.method public final getAvatarRes()I
    .locals 1

    .line 31
    iget v0, p0, Lcom/luchime/huiyuan/ui/AIModel;->avatarRes:I

    return v0
.end method

.method public final getChipLabel()Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/AIModel;->chipLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisplayName()Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/AIModel;->displayName:Ljava/lang/String;

    return-object v0
.end method

.method public final getShortName()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/AIModel;->shortName:Ljava/lang/String;

    return-object v0
.end method
