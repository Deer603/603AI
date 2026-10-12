.class public final enum Lcom/luchime/huiyuan/ui/AppTab;
.super Ljava/lang/Enum;
.source "HuiyuanApp.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/luchime/huiyuan/ui/AppTab;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000c\u0008\u0080\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008j\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/luchime/huiyuan/ui/AppTab;",
        "",
        "label",
        "",
        "icon",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V",
        "getLabel",
        "()Ljava/lang/String;",
        "getIcon",
        "CHAT",
        "ROOM",
        "LIBRARY",
        "FAVORITES",
        "PROFILE",
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

.field private static final synthetic $VALUES:[Lcom/luchime/huiyuan/ui/AppTab;

.field public static final enum CHAT:Lcom/luchime/huiyuan/ui/AppTab;

.field public static final enum FAVORITES:Lcom/luchime/huiyuan/ui/AppTab;

.field public static final enum LIBRARY:Lcom/luchime/huiyuan/ui/AppTab;

.field public static final enum PROFILE:Lcom/luchime/huiyuan/ui/AppTab;

.field public static final enum ROOM:Lcom/luchime/huiyuan/ui/AppTab;


# instance fields
.field private final icon:Ljava/lang/String;

.field private final label:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/luchime/huiyuan/ui/AppTab;
    .locals 5

    sget-object v0, Lcom/luchime/huiyuan/ui/AppTab;->CHAT:Lcom/luchime/huiyuan/ui/AppTab;

    sget-object v1, Lcom/luchime/huiyuan/ui/AppTab;->ROOM:Lcom/luchime/huiyuan/ui/AppTab;

    sget-object v2, Lcom/luchime/huiyuan/ui/AppTab;->LIBRARY:Lcom/luchime/huiyuan/ui/AppTab;

    sget-object v3, Lcom/luchime/huiyuan/ui/AppTab;->FAVORITES:Lcom/luchime/huiyuan/ui/AppTab;

    sget-object v4, Lcom/luchime/huiyuan/ui/AppTab;->PROFILE:Lcom/luchime/huiyuan/ui/AppTab;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/luchime/huiyuan/ui/AppTab;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    .line 84
    new-instance v0, Lcom/luchime/huiyuan/ui/AppTab;

    const-string v1, "\u5bf9\u8bdd"

    const-string v2, "\u25c9"

    const-string v3, "CHAT"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/luchime/huiyuan/ui/AppTab;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/luchime/huiyuan/ui/AppTab;->CHAT:Lcom/luchime/huiyuan/ui/AppTab;

    .line 85
    new-instance v0, Lcom/luchime/huiyuan/ui/AppTab;

    const-string v1, "\u5bdd\u5ba4"

    const-string v2, "603"

    const-string v3, "ROOM"

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/luchime/huiyuan/ui/AppTab;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/luchime/huiyuan/ui/AppTab;->ROOM:Lcom/luchime/huiyuan/ui/AppTab;

    .line 86
    new-instance v0, Lcom/luchime/huiyuan/ui/AppTab;

    const-string v1, "\u8bed\u5f55"

    const-string v2, "\u25a4"

    const-string v3, "LIBRARY"

    const/4 v4, 0x2

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/luchime/huiyuan/ui/AppTab;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/luchime/huiyuan/ui/AppTab;->LIBRARY:Lcom/luchime/huiyuan/ui/AppTab;

    .line 87
    new-instance v0, Lcom/luchime/huiyuan/ui/AppTab;

    const-string v1, "\u6536\u85cf"

    const-string v2, "\u2605"

    const-string v3, "FAVORITES"

    const/4 v4, 0x3

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/luchime/huiyuan/ui/AppTab;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/luchime/huiyuan/ui/AppTab;->FAVORITES:Lcom/luchime/huiyuan/ui/AppTab;

    .line 88
    new-instance v0, Lcom/luchime/huiyuan/ui/AppTab;

    const-string v1, "\u6211\u7684"

    const-string v2, "\u56f0"

    const-string v3, "PROFILE"

    const/4 v4, 0x4

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/luchime/huiyuan/ui/AppTab;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/luchime/huiyuan/ui/AppTab;->PROFILE:Lcom/luchime/huiyuan/ui/AppTab;

    invoke-static {}, Lcom/luchime/huiyuan/ui/AppTab;->$values()[Lcom/luchime/huiyuan/ui/AppTab;

    move-result-object v0

    sput-object v0, Lcom/luchime/huiyuan/ui/AppTab;->$VALUES:[Lcom/luchime/huiyuan/ui/AppTab;

    sget-object v0, Lcom/luchime/huiyuan/ui/AppTab;->$VALUES:[Lcom/luchime/huiyuan/ui/AppTab;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/luchime/huiyuan/ui/AppTab;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "$enum$name"    # Ljava/lang/String;
    .param p2, "$enum$ordinal"    # I
    .param p3, "label"    # Ljava/lang/String;
    .param p4, "icon"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 83
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/luchime/huiyuan/ui/AppTab;->label:Ljava/lang/String;

    iput-object p4, p0, Lcom/luchime/huiyuan/ui/AppTab;->icon:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/luchime/huiyuan/ui/AppTab;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/luchime/huiyuan/ui/AppTab;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/luchime/huiyuan/ui/AppTab;
    .locals 1

    const-class v0, Lcom/luchime/huiyuan/ui/AppTab;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/luchime/huiyuan/ui/AppTab;

    return-object v0
.end method

.method public static values()[Lcom/luchime/huiyuan/ui/AppTab;
    .locals 1

    sget-object v0, Lcom/luchime/huiyuan/ui/AppTab;->$VALUES:[Lcom/luchime/huiyuan/ui/AppTab;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/luchime/huiyuan/ui/AppTab;

    return-object v0
.end method


# virtual methods
.method public final getIcon()Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/AppTab;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/AppTab;->label:Ljava/lang/String;

    return-object v0
.end method
