.class final Landroidx/compose/ui/text/android/StaticLayoutFactory35;
.super Ljava/lang/Object;
.source "StaticLayoutFactory.android.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c3\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"
    }
    d2 = {
        "Landroidx/compose/ui/text/android/StaticLayoutFactory35;",
        "",
        "()V",
        "disableUseBoundsForWidth",
        "",
        "builder",
        "Landroid/text/StaticLayout$Builder;",
        "ui-text_release"
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
.field public static final INSTANCE:Landroidx/compose/ui/text/android/StaticLayoutFactory35;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/text/android/StaticLayoutFactory35;

    invoke-direct {v0}, Landroidx/compose/ui/text/android/StaticLayoutFactory35;-><init>()V

    sput-object v0, Landroidx/compose/ui/text/android/StaticLayoutFactory35;->INSTANCE:Landroidx/compose/ui/text/android/StaticLayoutFactory35;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 250
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final disableUseBoundsForWidth(Landroid/text/StaticLayout$Builder;)V
    .locals 1
    .param p0, "builder"    # Landroid/text/StaticLayout$Builder;
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 254
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/text/StaticLayout$Builder;->setUseBoundsForWidth(Z)Landroid/text/StaticLayout$Builder;

    .line 255
    return-void
.end method
