.class final Landroidx/compose/ui/text/platform/style/CustomBulletSpan$drawLeadingMargin$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "BulletSpan.android.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/text/platform/style/CustomBulletSpan;->drawLeadingMargin(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;IIZLandroid/text/Layout;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $bulletSize:J

.field final synthetic $c:Landroid/graphics/Canvas;

.field final synthetic $dir:I

.field final synthetic $paint:Landroid/graphics/Paint;

.field final synthetic $xStart:I

.field final synthetic $yCenter:F

.field final synthetic this$0:Landroidx/compose/ui/text/platform/style/CustomBulletSpan;


# direct methods
.method constructor <init>(Landroidx/compose/ui/text/platform/style/CustomBulletSpan;JILandroid/graphics/Canvas;Landroid/graphics/Paint;IF)V
    .locals 1

    iput-object p1, p0, Landroidx/compose/ui/text/platform/style/CustomBulletSpan$drawLeadingMargin$1$1;->this$0:Landroidx/compose/ui/text/platform/style/CustomBulletSpan;

    iput-wide p2, p0, Landroidx/compose/ui/text/platform/style/CustomBulletSpan$drawLeadingMargin$1$1;->$bulletSize:J

    iput p4, p0, Landroidx/compose/ui/text/platform/style/CustomBulletSpan$drawLeadingMargin$1$1;->$dir:I

    iput-object p5, p0, Landroidx/compose/ui/text/platform/style/CustomBulletSpan$drawLeadingMargin$1$1;->$c:Landroid/graphics/Canvas;

    iput-object p6, p0, Landroidx/compose/ui/text/platform/style/CustomBulletSpan$drawLeadingMargin$1$1;->$paint:Landroid/graphics/Paint;

    iput p7, p0, Landroidx/compose/ui/text/platform/style/CustomBulletSpan$drawLeadingMargin$1$1;->$xStart:I

    iput p8, p0, Landroidx/compose/ui/text/platform/style/CustomBulletSpan$drawLeadingMargin$1$1;->$yCenter:F

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 91
    invoke-virtual {p0}, Landroidx/compose/ui/text/platform/style/CustomBulletSpan$drawLeadingMargin$1$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 7

    .line 94
    iget-object v0, p0, Landroidx/compose/ui/text/platform/style/CustomBulletSpan$drawLeadingMargin$1$1;->this$0:Landroidx/compose/ui/text/platform/style/CustomBulletSpan;

    invoke-static {v0}, Landroidx/compose/ui/text/platform/style/CustomBulletSpan;->access$getShape$p(Landroidx/compose/ui/text/platform/style/CustomBulletSpan;)Landroidx/compose/ui/graphics/Shape;

    move-result-object v0

    .line 95
    iget-wide v1, p0, Landroidx/compose/ui/text/platform/style/CustomBulletSpan$drawLeadingMargin$1$1;->$bulletSize:J

    .line 96
    iget v3, p0, Landroidx/compose/ui/text/platform/style/CustomBulletSpan$drawLeadingMargin$1$1;->$dir:I

    if-lez v3, :cond_0

    sget-object v3, Landroidx/compose/ui/unit/LayoutDirection;->Ltr:Landroidx/compose/ui/unit/LayoutDirection;

    goto :goto_0

    :cond_0
    sget-object v3, Landroidx/compose/ui/unit/LayoutDirection;->Rtl:Landroidx/compose/ui/unit/LayoutDirection;

    .line 97
    :goto_0
    iget-object v4, p0, Landroidx/compose/ui/text/platform/style/CustomBulletSpan$drawLeadingMargin$1$1;->this$0:Landroidx/compose/ui/text/platform/style/CustomBulletSpan;

    invoke-static {v4}, Landroidx/compose/ui/text/platform/style/CustomBulletSpan;->access$getDensity$p(Landroidx/compose/ui/text/platform/style/CustomBulletSpan;)Landroidx/compose/ui/unit/Density;

    move-result-object v4

    .line 94
    invoke-interface {v0, v1, v2, v3, v4}, Landroidx/compose/ui/graphics/Shape;->createOutline-Pq9zytI(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;

    move-result-object v0

    .line 93
    move-object v1, v0

    .line 99
    .local v1, "outline":Landroidx/compose/ui/graphics/Outline;
    iget-object v2, p0, Landroidx/compose/ui/text/platform/style/CustomBulletSpan$drawLeadingMargin$1$1;->$c:Landroid/graphics/Canvas;

    iget-object v3, p0, Landroidx/compose/ui/text/platform/style/CustomBulletSpan$drawLeadingMargin$1$1;->$paint:Landroid/graphics/Paint;

    iget v0, p0, Landroidx/compose/ui/text/platform/style/CustomBulletSpan$drawLeadingMargin$1$1;->$xStart:I

    int-to-float v4, v0

    iget v5, p0, Landroidx/compose/ui/text/platform/style/CustomBulletSpan$drawLeadingMargin$1$1;->$yCenter:F

    iget v6, p0, Landroidx/compose/ui/text/platform/style/CustomBulletSpan$drawLeadingMargin$1$1;->$dir:I

    invoke-static/range {v1 .. v6}, Landroidx/compose/ui/text/platform/style/BulletSpan_androidKt;->access$draw(Landroidx/compose/ui/graphics/Outline;Landroid/graphics/Canvas;Landroid/graphics/Paint;FFI)V

    .line 100
    return-void
.end method
