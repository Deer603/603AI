.class final Landroidx/compose/material/SecureTextFieldKt$OutlinedSecureTextField$3;
.super Ljava/lang/Object;
.source "SecureTextField.kt"

# interfaces
.implements Landroidx/compose/foundation/text/input/TextFieldDecorator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/SecureTextFieldKt;->OutlinedSecureTextField-0vce7ms(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/text/input/InputTransformation;ICLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\u0002\u0008\u0004H\u000b"
    }
    d2 = {
        "<anonymous>",
        "",
        "innerTextField",
        "Lkotlin/Function0;",
        "Landroidx/compose/runtime/Composable;"
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
.field final synthetic $colors:Landroidx/compose/material/TextFieldColors;

.field final synthetic $enabled:Z

.field final synthetic $interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

.field final synthetic $isError:Z

.field final synthetic $label:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $leadingIcon:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $placeholder:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $shape:Landroidx/compose/ui/graphics/Shape;

.field final synthetic $state:Landroidx/compose/foundation/text/input/TextFieldState;

.field final synthetic $trailingIcon:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/compose/foundation/text/input/TextFieldState;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text/input/TextFieldState;",
            "Z",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Z",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material/TextFieldColors;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material/SecureTextFieldKt$OutlinedSecureTextField$3;->$state:Landroidx/compose/foundation/text/input/TextFieldState;

    iput-boolean p2, p0, Landroidx/compose/material/SecureTextFieldKt$OutlinedSecureTextField$3;->$enabled:Z

    iput-object p3, p0, Landroidx/compose/material/SecureTextFieldKt$OutlinedSecureTextField$3;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    iput-boolean p4, p0, Landroidx/compose/material/SecureTextFieldKt$OutlinedSecureTextField$3;->$isError:Z

    iput-object p5, p0, Landroidx/compose/material/SecureTextFieldKt$OutlinedSecureTextField$3;->$label:Lkotlin/jvm/functions/Function2;

    iput-object p6, p0, Landroidx/compose/material/SecureTextFieldKt$OutlinedSecureTextField$3;->$placeholder:Lkotlin/jvm/functions/Function2;

    iput-object p7, p0, Landroidx/compose/material/SecureTextFieldKt$OutlinedSecureTextField$3;->$leadingIcon:Lkotlin/jvm/functions/Function2;

    iput-object p8, p0, Landroidx/compose/material/SecureTextFieldKt$OutlinedSecureTextField$3;->$trailingIcon:Lkotlin/jvm/functions/Function2;

    iput-object p9, p0, Landroidx/compose/material/SecureTextFieldKt$OutlinedSecureTextField$3;->$shape:Landroidx/compose/ui/graphics/Shape;

    iput-object p10, p0, Landroidx/compose/material/SecureTextFieldKt$OutlinedSecureTextField$3;->$colors:Landroidx/compose/material/TextFieldColors;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final Decoration(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
    .locals 22
    .param p1, "innerTextField"    # Lkotlin/jvm/functions/Function2;
    .param p2, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p3, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p3

    const v3, -0x5a823da0

    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v4, "C(Decoration)298@16722L119,284@16117L738:SecureTextField.kt#jmzs0o"

    invoke-static {v1, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 285
    const/4 v4, -0x1

    const-string v5, "androidx.compose.material.OutlinedSecureTextField.<no name provided>.Decoration (SecureTextField.kt:284)"

    invoke-static {v3, v2, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_0
    sget-object v3, Landroidx/compose/material/TextFieldDefaults;->INSTANCE:Landroidx/compose/material/TextFieldDefaults;

    .line 286
    iget-object v4, v0, Landroidx/compose/material/SecureTextFieldKt$OutlinedSecureTextField$3;->$state:Landroidx/compose/foundation/text/input/TextFieldState;

    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/TextFieldState;->getText()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    .line 287
    sget-object v5, Landroidx/compose/ui/text/input/VisualTransformation;->Companion:Landroidx/compose/ui/text/input/VisualTransformation$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/text/input/VisualTransformation$Companion;->getNone()Landroidx/compose/ui/text/input/VisualTransformation;

    move-result-object v6

    .line 285
    nop

    .line 286
    nop

    .line 288
    nop

    .line 294
    move-object v2, v4

    iget-boolean v4, v0, Landroidx/compose/material/SecureTextFieldKt$OutlinedSecureTextField$3;->$enabled:Z

    .line 293
    nop

    .line 287
    nop

    .line 296
    iget-object v5, v0, Landroidx/compose/material/SecureTextFieldKt$OutlinedSecureTextField$3;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-object v7, v5

    check-cast v7, Landroidx/compose/foundation/interaction/InteractionSource;

    .line 295
    iget-boolean v8, v0, Landroidx/compose/material/SecureTextFieldKt$OutlinedSecureTextField$3;->$isError:Z

    .line 290
    iget-object v9, v0, Landroidx/compose/material/SecureTextFieldKt$OutlinedSecureTextField$3;->$label:Lkotlin/jvm/functions/Function2;

    .line 289
    iget-object v10, v0, Landroidx/compose/material/SecureTextFieldKt$OutlinedSecureTextField$3;->$placeholder:Lkotlin/jvm/functions/Function2;

    .line 291
    iget-object v11, v0, Landroidx/compose/material/SecureTextFieldKt$OutlinedSecureTextField$3;->$leadingIcon:Lkotlin/jvm/functions/Function2;

    .line 292
    iget-object v12, v0, Landroidx/compose/material/SecureTextFieldKt$OutlinedSecureTextField$3;->$trailingIcon:Lkotlin/jvm/functions/Function2;

    .line 297
    iget-object v13, v0, Landroidx/compose/material/SecureTextFieldKt$OutlinedSecureTextField$3;->$shape:Landroidx/compose/ui/graphics/Shape;

    .line 298
    iget-object v14, v0, Landroidx/compose/material/SecureTextFieldKt$OutlinedSecureTextField$3;->$colors:Landroidx/compose/material/TextFieldColors;

    .line 299
    new-instance v15, Landroidx/compose/material/SecureTextFieldKt$OutlinedSecureTextField$3$Decoration$1;

    iget-boolean v5, v0, Landroidx/compose/material/SecureTextFieldKt$OutlinedSecureTextField$3;->$enabled:Z

    move-object/from16 v21, v2

    iget-boolean v2, v0, Landroidx/compose/material/SecureTextFieldKt$OutlinedSecureTextField$3;->$isError:Z

    move/from16 v17, v2

    iget-object v2, v0, Landroidx/compose/material/SecureTextFieldKt$OutlinedSecureTextField$3;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-object/from16 v18, v2

    iget-object v2, v0, Landroidx/compose/material/SecureTextFieldKt$OutlinedSecureTextField$3;->$colors:Landroidx/compose/material/TextFieldColors;

    move-object/from16 v19, v2

    iget-object v2, v0, Landroidx/compose/material/SecureTextFieldKt$OutlinedSecureTextField$3;->$shape:Landroidx/compose/ui/graphics/Shape;

    move-object/from16 v20, v2

    move/from16 v16, v5

    invoke-direct/range {v15 .. v20}, Landroidx/compose/material/SecureTextFieldKt$OutlinedSecureTextField$3$Decoration$1;-><init>(ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/TextFieldColors;Landroidx/compose/ui/graphics/Shape;)V

    const/16 v2, 0x36

    const v5, -0x48e60f38

    const/4 v0, 0x1

    invoke-static {v5, v0, v15, v1, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lkotlin/jvm/functions/Function2;

    shl-int/lit8 v0, p3, 0x3

    and-int/lit8 v0, v0, 0x70

    or-int/lit16 v0, v0, 0x6c00

    .line 285
    const/4 v5, 0x1

    const/4 v15, 0x0

    const v19, 0x36000

    const/16 v20, 0x2000

    move/from16 v18, v0

    move-object/from16 v17, v1

    move-object v1, v3

    move-object/from16 v2, v21

    move-object/from16 v3, p1

    invoke-virtual/range {v1 .. v20}, Landroidx/compose/material/TextFieldDefaults;->OutlinedTextFieldDecorationBox(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_1
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 303
    return-void
.end method
