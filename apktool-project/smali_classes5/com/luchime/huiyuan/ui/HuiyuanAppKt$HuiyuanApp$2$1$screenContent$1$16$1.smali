.class final synthetic Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$16$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "HuiyuanApp.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luchime/huiyuan/ui/HuiyuanAppKt;->HuiyuanApp(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1018
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        "Lkotlin/Unit;",
        ">;"
    }
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


# instance fields
.field final synthetic $favorites$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/luchime/huiyuan/FavoriteRecord;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $repository:Lcom/luchime/huiyuan/AppRepository;


# direct methods
.method constructor <init>(Lcom/luchime/huiyuan/AppRepository;Landroidx/compose/runtime/MutableState;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/luchime/huiyuan/AppRepository;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/luchime/huiyuan/FavoriteRecord;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$16$1;->$repository:Lcom/luchime/huiyuan/AppRepository;

    iput-object p2, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$16$1;->$favorites$delegate:Landroidx/compose/runtime/MutableState;

    const-class v2, Lkotlin/jvm/internal/Intrinsics$Kotlin;

    const-string v4, "HuiyuanApp$toggleFavorite(Lcom/luchime/huiyuan/AppRepository;Landroidx/compose/runtime/MutableState;Ljava/lang/String;Ljava/lang/String;)V"

    const/4 v5, 0x0

    const/4 v1, 0x2

    const-string v3, "toggleFavorite"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1, "p1"    # Ljava/lang/Object;
    .param p2, "p2"    # Ljava/lang/Object;

    .line 374
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    move-object v1, p2

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$16$1;->invoke(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1, "p0"    # Ljava/lang/String;
    .param p2, "p1"    # Ljava/lang/String;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "p1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 374
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$16$1;->$repository:Lcom/luchime/huiyuan/AppRepository;

    iget-object v1, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$16$1;->$favorites$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v0, v1, p1, p2}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt;->access$HuiyuanApp$toggleFavorite(Lcom/luchime/huiyuan/AppRepository;Landroidx/compose/runtime/MutableState;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
