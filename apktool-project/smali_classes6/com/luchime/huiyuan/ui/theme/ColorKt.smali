.class public final Lcom/luchime/huiyuan/ui/theme/ColorKt;
.super Ljava/lang/Object;
.source "Color.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\"\u0013\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\u0008\u0002\u0010\u0003\"\u0013\u0010\u0005\u001a\u00020\u0001\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\u0008\u0006\u0010\u0003\"\u0013\u0010\u0007\u001a\u00020\u0001\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\u0008\u0008\u0010\u0003\"\u0013\u0010\t\u001a\u00020\u0001\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\u0008\n\u0010\u0003\"\u0013\u0010\u000b\u001a\u00020\u0001\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\u0008\u000c\u0010\u0003\u00a8\u0006\r"
    }
    d2 = {
        "HuiyuanInk",
        "Landroidx/compose/ui/graphics/Color;",
        "getHuiyuanInk",
        "()J",
        "J",
        "HuiyuanPaper",
        "getHuiyuanPaper",
        "HuiyuanYellow",
        "getHuiyuanYellow",
        "HuiyuanGreen",
        "getHuiyuanGreen",
        "HuiyuanRed",
        "getHuiyuanRed",
        "app"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final HuiyuanGreen:J

.field private static final HuiyuanInk:J

.field private static final HuiyuanPaper:J

.field private static final HuiyuanRed:J

.field private static final HuiyuanYellow:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 5
    const-wide v0, 0xff181713L

    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v0

    sput-wide v0, Lcom/luchime/huiyuan/ui/theme/ColorKt;->HuiyuanInk:J

    .line 6
    const-wide v0, 0xfffff8e8L

    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v0

    sput-wide v0, Lcom/luchime/huiyuan/ui/theme/ColorKt;->HuiyuanPaper:J

    .line 7
    const-wide v0, 0xffffdb21L

    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v0

    sput-wide v0, Lcom/luchime/huiyuan/ui/theme/ColorKt;->HuiyuanYellow:J

    .line 8
    const-wide v0, 0xff36d97aL

    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v0

    sput-wide v0, Lcom/luchime/huiyuan/ui/theme/ColorKt;->HuiyuanGreen:J

    .line 9
    const-wide v0, 0xffff4747L

    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v0

    sput-wide v0, Lcom/luchime/huiyuan/ui/theme/ColorKt;->HuiyuanRed:J

    return-void
.end method

.method public static final getHuiyuanGreen()J
    .locals 2

    .line 8
    sget-wide v0, Lcom/luchime/huiyuan/ui/theme/ColorKt;->HuiyuanGreen:J

    return-wide v0
.end method

.method public static final getHuiyuanInk()J
    .locals 2

    .line 5
    sget-wide v0, Lcom/luchime/huiyuan/ui/theme/ColorKt;->HuiyuanInk:J

    return-wide v0
.end method

.method public static final getHuiyuanPaper()J
    .locals 2

    .line 6
    sget-wide v0, Lcom/luchime/huiyuan/ui/theme/ColorKt;->HuiyuanPaper:J

    return-wide v0
.end method

.method public static final getHuiyuanRed()J
    .locals 2

    .line 9
    sget-wide v0, Lcom/luchime/huiyuan/ui/theme/ColorKt;->HuiyuanRed:J

    return-wide v0
.end method

.method public static final getHuiyuanYellow()J
    .locals 2

    .line 7
    sget-wide v0, Lcom/luchime/huiyuan/ui/theme/ColorKt;->HuiyuanYellow:J

    return-wide v0
.end method
