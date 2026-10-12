.class public final Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl;
.super Ljava/lang/Object;
.source "PlatformMagnifier.android.kt"

# interfaces
.implements Landroidx/compose/foundation/PlatformMagnifierFactory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPlatformMagnifier.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformMagnifier.android.kt\nandroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,189:1\n148#2:190\n57#3:191\n61#3:194\n60#4:192\n70#4:195\n22#5:193\n*S KotlinDebug\n*F\n+ 1 PlatformMagnifier.android.kt\nandroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl\n*L\n153#1:190\n154#1:191\n154#1:194\n154#1:192\n154#1:195\n154#1:193\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0004\u0008\u00c1\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002JR\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u0019"
    }
    d2 = {
        "Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl;",
        "Landroidx/compose/foundation/PlatformMagnifierFactory;",
        "()V",
        "canUpdateZoom",
        "",
        "getCanUpdateZoom",
        "()Z",
        "create",
        "Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;",
        "view",
        "Landroid/view/View;",
        "useTextDefault",
        "size",
        "Landroidx/compose/ui/unit/DpSize;",
        "cornerRadius",
        "Landroidx/compose/ui/unit/Dp;",
        "elevation",
        "clippingEnabled",
        "density",
        "Landroidx/compose/ui/unit/Density;",
        "initialZoom",
        "",
        "create-nHHXs2Y",
        "(Landroid/view/View;ZJFFZLandroidx/compose/ui/unit/Density;F)Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;",
        "PlatformMagnifierImpl",
        "foundation_release"
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

.field public static final INSTANCE:Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl;

.field private static final canUpdateZoom:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl;

    invoke-direct {v0}, Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl;-><init>()V

    sput-object v0, Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl;->INSTANCE:Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl;

    .line 125
    const/4 v0, 0x1

    sput-boolean v0, Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl;->canUpdateZoom:Z

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic create-nHHXs2Y(Landroid/view/View;ZJFFZLandroidx/compose/ui/unit/Density;F)Landroidx/compose/foundation/PlatformMagnifier;
    .locals 1
    .param p1, "view"    # Landroid/view/View;
    .param p2, "useTextDefault"    # Z
    .param p3, "size"    # J
    .param p5, "cornerRadius"    # F
    .param p6, "elevation"    # F
    .param p7, "clippingEnabled"    # Z
    .param p8, "density"    # Landroidx/compose/ui/unit/Density;
    .param p9, "initialZoom"    # F

    .line 123
    invoke-virtual/range {p0 .. p9}, Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl;->create-nHHXs2Y(Landroid/view/View;ZJFFZLandroidx/compose/ui/unit/Density;F)Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;

    move-result-object v0

    check-cast v0, Landroidx/compose/foundation/PlatformMagnifier;

    return-object v0
.end method

.method public create-nHHXs2Y(Landroid/view/View;ZJFFZLandroidx/compose/ui/unit/Density;F)Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;
    .locals 21
    .param p1, "view"    # Landroid/view/View;
    .param p2, "useTextDefault"    # Z
    .param p3, "size"    # J
    .param p5, "cornerRadius"    # F
    .param p6, "elevation"    # F
    .param p7, "clippingEnabled"    # Z
    .param p8, "density"    # Landroidx/compose/ui/unit/Density;
    .param p9, "initialZoom"    # F

    .line 137
    move-object/from16 v0, p1

    move-object/from16 v1, p8

    .local v1, "$this$create_nHHXs2Y_u24lambda_u241":Landroidx/compose/ui/unit/Density;
    const/4 v2, 0x0

    .line 139
    .local v2, "$i$a$-with-PlatformMagnifierFactoryApi29Impl$create$1":I
    if-eqz p2, :cond_0

    .line 142
    new-instance v3, Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;

    new-instance v4, Landroid/widget/Magnifier;

    invoke-direct {v4, v0}, Landroid/widget/Magnifier;-><init>(Landroid/view/View;)V

    invoke-direct {v3, v4}, Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;-><init>(Landroid/widget/Magnifier;)V

    return-object v3

    .line 145
    :cond_0
    move-wide/from16 v3, p3

    invoke-interface {v1, v3, v4}, Landroidx/compose/ui/unit/Density;->toSize-XkaWNTQ(J)J

    move-result-wide v5

    .line 146
    .local v5, "pixelSize":J
    move/from16 v7, p5

    invoke-interface {v1, v7}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result v8

    .line 147
    .local v8, "pixelCornerRadius":F
    move/from16 v9, p6

    invoke-interface {v1, v9}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result v10

    .line 152
    .local v10, "pixelElevation":F
    new-instance v11, Landroid/widget/Magnifier$Builder;

    invoke-direct {v11, v0}, Landroid/widget/Magnifier$Builder;-><init>(Landroid/view/View;)V

    .local v11, "$this$create_nHHXs2Y_u24lambda_u241_u24lambda_u240":Landroid/widget/Magnifier$Builder;
    const/4 v12, 0x0

    .line 153
    .local v12, "$i$a$-run-PlatformMagnifierFactoryApi29Impl$create$1$magnifier$1":I
    move-wide v13, v5

    .local v13, "$this$isSpecified$iv":J
    const/4 v15, 0x0

    .line 190
    .local v15, "$i$f$isSpecified-uvyYCjk":I
    const-wide v16, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v16, v13, v16

    if-eqz v16, :cond_1

    const/16 v16, 0x1

    goto :goto_0

    :cond_1
    const/16 v16, 0x0

    .line 153
    .end local v13    # "$this$isSpecified$iv":J
    .end local v15    # "$i$f$isSpecified-uvyYCjk":I
    :goto_0
    if-eqz v16, :cond_2

    .line 154
    const/4 v13, 0x0

    .line 191
    .local v13, "$i$f$getWidth-impl":I
    move-wide v14, v5

    .local v14, "value$iv$iv":J
    const/16 v16, 0x0

    .line 192
    .local v16, "$i$f$unpackFloat1":I
    const/16 v17, 0x20

    move-object/from16 v18, v1

    .end local v1    # "$this$create_nHHXs2Y_u24lambda_u241":Landroidx/compose/ui/unit/Density;
    .local v18, "$this$create_nHHXs2Y_u24lambda_u241":Landroidx/compose/ui/unit/Density;
    shr-long v0, v14, v17

    long-to-int v0, v0

    .local v0, "bits$iv$iv$iv":I
    const/4 v1, 0x0

    .line 193
    .local v1, "$i$f$floatFromBits":I
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    .line 192
    .end local v0    # "bits$iv$iv$iv":I
    .end local v1    # "$i$f$floatFromBits":I
    nop

    .line 191
    .end local v14    # "value$iv$iv":J
    .end local v16    # "$i$f$unpackFloat1":I
    nop

    .line 154
    .end local v13    # "$i$f$getWidth-impl":I
    invoke-static {v0}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v0

    const/4 v1, 0x0

    .line 194
    .local v1, "$i$f$getHeight-impl":I
    move-wide v13, v5

    .local v13, "value$iv$iv":J
    const/4 v15, 0x0

    .line 195
    .local v15, "$i$f$unpackFloat2":I
    const-wide v16, 0xffffffffL

    move/from16 v20, v1

    move/from16 v19, v2

    .end local v1    # "$i$f$getHeight-impl":I
    .end local v2    # "$i$a$-with-PlatformMagnifierFactoryApi29Impl$create$1":I
    .local v19, "$i$a$-with-PlatformMagnifierFactoryApi29Impl$create$1":I
    .local v20, "$i$f$getHeight-impl":I
    and-long v1, v13, v16

    long-to-int v1, v1

    .local v1, "bits$iv$iv$iv":I
    const/4 v2, 0x0

    .line 193
    .local v2, "$i$f$floatFromBits":I
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    .line 195
    .end local v1    # "bits$iv$iv$iv":I
    .end local v2    # "$i$f$floatFromBits":I
    nop

    .line 194
    .end local v13    # "value$iv$iv":J
    .end local v15    # "$i$f$unpackFloat2":I
    nop

    .line 154
    .end local v20    # "$i$f$getHeight-impl":I
    invoke-static {v1}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v1

    invoke-virtual {v11, v0, v1}, Landroid/widget/Magnifier$Builder;->setSize(II)Landroid/widget/Magnifier$Builder;

    goto :goto_1

    .line 153
    .end local v18    # "$this$create_nHHXs2Y_u24lambda_u241":Landroidx/compose/ui/unit/Density;
    .end local v19    # "$i$a$-with-PlatformMagnifierFactoryApi29Impl$create$1":I
    .local v1, "$this$create_nHHXs2Y_u24lambda_u241":Landroidx/compose/ui/unit/Density;
    .local v2, "$i$a$-with-PlatformMagnifierFactoryApi29Impl$create$1":I
    :cond_2
    move-object/from16 v18, v1

    move/from16 v19, v2

    .line 156
    .end local v1    # "$this$create_nHHXs2Y_u24lambda_u241":Landroidx/compose/ui/unit/Density;
    .end local v2    # "$i$a$-with-PlatformMagnifierFactoryApi29Impl$create$1":I
    .restart local v18    # "$this$create_nHHXs2Y_u24lambda_u241":Landroidx/compose/ui/unit/Density;
    .restart local v19    # "$i$a$-with-PlatformMagnifierFactoryApi29Impl$create$1":I
    :goto_1
    invoke-static {v8}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_3

    .line 157
    invoke-virtual {v11, v8}, Landroid/widget/Magnifier$Builder;->setCornerRadius(F)Landroid/widget/Magnifier$Builder;

    .line 159
    :cond_3
    invoke-static {v10}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_4

    .line 160
    invoke-virtual {v11, v10}, Landroid/widget/Magnifier$Builder;->setElevation(F)Landroid/widget/Magnifier$Builder;

    .line 162
    :cond_4
    invoke-static/range {p9 .. p9}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_5

    .line 163
    move/from16 v0, p9

    invoke-virtual {v11, v0}, Landroid/widget/Magnifier$Builder;->setInitialZoom(F)Landroid/widget/Magnifier$Builder;

    goto :goto_2

    .line 162
    :cond_5
    move/from16 v0, p9

    .line 165
    :goto_2
    move/from16 v1, p7

    invoke-virtual {v11, v1}, Landroid/widget/Magnifier$Builder;->setClippingEnabled(Z)Landroid/widget/Magnifier$Builder;

    .line 166
    invoke-virtual {v11}, Landroid/widget/Magnifier$Builder;->build()Landroid/widget/Magnifier;

    move-result-object v2

    .line 152
    .end local v11    # "$this$create_nHHXs2Y_u24lambda_u241_u24lambda_u240":Landroid/widget/Magnifier$Builder;
    .end local v12    # "$i$a$-run-PlatformMagnifierFactoryApi29Impl$create$1$magnifier$1":I
    nop

    .line 151
    nop

    .line 169
    .local v2, "magnifier":Landroid/widget/Magnifier;
    new-instance v11, Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;

    invoke-direct {v11, v2}, Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;-><init>(Landroid/widget/Magnifier;)V

    return-object v11
.end method

.method public getCanUpdateZoom()Z
    .locals 1

    .line 125
    sget-boolean v0, Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl;->canUpdateZoom:Z

    return v0
.end method
