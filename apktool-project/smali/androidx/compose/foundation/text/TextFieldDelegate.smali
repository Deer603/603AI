.class public final Landroidx/compose/foundation/text/TextFieldDelegate;
.super Ljava/lang/Object;
.source "TextFieldDelegate.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/text/TextFieldDelegate$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"
    }
    d2 = {
        "Landroidx/compose/foundation/text/TextFieldDelegate;",
        "",
        "()V",
        "Companion",
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

.field public static final Companion:Landroidx/compose/foundation/text/TextFieldDelegate$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/foundation/text/TextFieldDelegate$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/foundation/text/TextFieldDelegate$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/compose/foundation/text/TextFieldDelegate;->Companion:Landroidx/compose/foundation/text/TextFieldDelegate$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final draw-Q1vqE60$foundation_release(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/text/input/TextFieldValue;JJLandroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/graphics/Paint;J)V
    .locals 12
    .param p0, "canvas"    # Landroidx/compose/ui/graphics/Canvas;
    .param p1, "value"    # Landroidx/compose/ui/text/input/TextFieldValue;
    .param p2, "selectionPreviewHighlightRange"    # J
    .param p4, "deletionPreviewHighlightRange"    # J
    .param p6, "offsetMapping"    # Landroidx/compose/ui/text/input/OffsetMapping;
    .param p7, "textLayoutResult"    # Landroidx/compose/ui/text/TextLayoutResult;
    .param p8, "highlightPaint"    # Landroidx/compose/ui/graphics/Paint;
    .param p9, "selectionBackgroundColor"    # J
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Landroidx/compose/foundation/text/TextFieldDelegate;->Companion:Landroidx/compose/foundation/text/TextFieldDelegate$Companion;

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    move-wide/from16 v5, p4

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-wide/from16 v10, p9

    invoke-virtual/range {v0 .. v11}, Landroidx/compose/foundation/text/TextFieldDelegate$Companion;->draw-Q1vqE60$foundation_release(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/text/input/TextFieldValue;JJLandroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/graphics/Paint;J)V

    .line 171
    return-void
.end method

.method public static final layout-_EkL_-Y$foundation_release(Landroidx/compose/foundation/text/TextDelegate;JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/TextLayoutResult;)Lkotlin/Triple;
    .locals 6
    .param p0, "textDelegate"    # Landroidx/compose/foundation/text/TextDelegate;
    .param p1, "constraints"    # J
    .param p3, "layoutDirection"    # Landroidx/compose/ui/unit/LayoutDirection;
    .param p4, "prevResultText"    # Landroidx/compose/ui/text/TextLayoutResult;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text/TextDelegate;",
            "J",
            "Landroidx/compose/ui/unit/LayoutDirection;",
            "Landroidx/compose/ui/text/TextLayoutResult;",
            ")",
            "Lkotlin/Triple<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Landroidx/compose/ui/text/TextLayoutResult;",
            ">;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Landroidx/compose/foundation/text/TextFieldDelegate;->Companion:Landroidx/compose/foundation/text/TextFieldDelegate$Companion;

    move-object v1, p0

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    .end local p0    # "textDelegate":Landroidx/compose/foundation/text/TextDelegate;
    .end local p1    # "constraints":J
    .end local p3    # "layoutDirection":Landroidx/compose/ui/unit/LayoutDirection;
    .end local p4    # "prevResultText":Landroidx/compose/ui/text/TextLayoutResult;
    .local v1, "textDelegate":Landroidx/compose/foundation/text/TextDelegate;
    .local v2, "constraints":J
    .local v4, "layoutDirection":Landroidx/compose/ui/unit/LayoutDirection;
    .local v5, "prevResultText":Landroidx/compose/ui/text/TextLayoutResult;
    invoke-virtual/range {v0 .. v5}, Landroidx/compose/foundation/text/TextFieldDelegate$Companion;->layout-_EkL_-Y$foundation_release(Landroidx/compose/foundation/text/TextDelegate;JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/TextLayoutResult;)Lkotlin/Triple;

    move-result-object p0

    .line 112
    return-object p0
.end method

.method public static final notifyFocusedRect$foundation_release(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/text/input/TextInputSession;ZLandroidx/compose/ui/text/input/OffsetMapping;)V
    .locals 8
    .param p0, "value"    # Landroidx/compose/ui/text/input/TextFieldValue;
    .param p1, "textDelegate"    # Landroidx/compose/foundation/text/TextDelegate;
    .param p2, "textLayoutResult"    # Landroidx/compose/ui/text/TextLayoutResult;
    .param p3, "layoutCoordinates"    # Landroidx/compose/ui/layout/LayoutCoordinates;
    .param p4, "textInputSession"    # Landroidx/compose/ui/text/input/TextInputSession;
    .param p5, "hasFocus"    # Z
    .param p6, "offsetMapping"    # Landroidx/compose/ui/text/input/OffsetMapping;
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Landroidx/compose/foundation/text/TextFieldDelegate;->Companion:Landroidx/compose/foundation/text/TextFieldDelegate$Companion;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    move-object v7, p6

    .end local p0    # "value":Landroidx/compose/ui/text/input/TextFieldValue;
    .end local p1    # "textDelegate":Landroidx/compose/foundation/text/TextDelegate;
    .end local p2    # "textLayoutResult":Landroidx/compose/ui/text/TextLayoutResult;
    .end local p3    # "layoutCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    .end local p4    # "textInputSession":Landroidx/compose/ui/text/input/TextInputSession;
    .end local p5    # "hasFocus":Z
    .end local p6    # "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    .local v1, "value":Landroidx/compose/ui/text/input/TextFieldValue;
    .local v2, "textDelegate":Landroidx/compose/foundation/text/TextDelegate;
    .local v3, "textLayoutResult":Landroidx/compose/ui/text/TextLayoutResult;
    .local v4, "layoutCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    .local v5, "textInputSession":Landroidx/compose/ui/text/input/TextInputSession;
    .local v6, "hasFocus":Z
    .local v7, "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    invoke-virtual/range {v0 .. v7}, Landroidx/compose/foundation/text/TextFieldDelegate$Companion;->notifyFocusedRect$foundation_release(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/text/input/TextInputSession;ZLandroidx/compose/ui/text/input/OffsetMapping;)V

    .line 236
    return-void
.end method

.method public static final onBlur$foundation_release(Landroidx/compose/ui/text/input/TextInputSession;Landroidx/compose/ui/text/input/EditProcessor;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .param p0, "textInputSession"    # Landroidx/compose/ui/text/input/TextInputSession;
    .param p1, "editProcessor"    # Landroidx/compose/ui/text/input/EditProcessor;
    .param p2, "onValueChange"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/text/input/TextInputSession;",
            "Landroidx/compose/ui/text/input/EditProcessor;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Landroidx/compose/foundation/text/TextFieldDelegate;->Companion:Landroidx/compose/foundation/text/TextFieldDelegate$Companion;

    invoke-virtual {v0, p0, p1, p2}, Landroidx/compose/foundation/text/TextFieldDelegate$Companion;->onBlur$foundation_release(Landroidx/compose/ui/text/input/TextInputSession;Landroidx/compose/ui/text/input/EditProcessor;Lkotlin/jvm/functions/Function1;)V

    .line 404
    return-void
.end method

.method public static final onEditCommand$foundation_release(Ljava/util/List;Landroidx/compose/ui/text/input/EditProcessor;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/input/TextInputSession;)V
    .locals 1
    .param p0, "ops"    # Ljava/util/List;
    .param p1, "editProcessor"    # Landroidx/compose/ui/text/input/EditProcessor;
    .param p2, "onValueChange"    # Lkotlin/jvm/functions/Function1;
    .param p3, "session"    # Landroidx/compose/ui/text/input/TextInputSession;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/text/input/EditCommand;",
            ">;",
            "Landroidx/compose/ui/text/input/EditProcessor;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/text/input/TextInputSession;",
            ")V"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Landroidx/compose/foundation/text/TextFieldDelegate;->Companion:Landroidx/compose/foundation/text/TextFieldDelegate$Companion;

    invoke-virtual {v0, p0, p1, p2, p3}, Landroidx/compose/foundation/text/TextFieldDelegate$Companion;->onEditCommand$foundation_release(Ljava/util/List;Landroidx/compose/ui/text/input/EditProcessor;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/input/TextInputSession;)V

    .line 303
    return-void
.end method

.method public static final onFocus$foundation_release(Landroidx/compose/ui/text/input/TextInputService;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/EditProcessor;Landroidx/compose/ui/text/input/ImeOptions;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/text/input/TextInputSession;
    .locals 7
    .param p0, "textInputService"    # Landroidx/compose/ui/text/input/TextInputService;
    .param p1, "value"    # Landroidx/compose/ui/text/input/TextFieldValue;
    .param p2, "editProcessor"    # Landroidx/compose/ui/text/input/EditProcessor;
    .param p3, "imeOptions"    # Landroidx/compose/ui/text/input/ImeOptions;
    .param p4, "onValueChange"    # Lkotlin/jvm/functions/Function1;
    .param p5, "onImeActionPerformed"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/text/input/TextInputService;",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Landroidx/compose/ui/text/input/EditProcessor;",
            "Landroidx/compose/ui/text/input/ImeOptions;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/input/ImeAction;",
            "Lkotlin/Unit;",
            ">;)",
            "Landroidx/compose/ui/text/input/TextInputSession;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Landroidx/compose/foundation/text/TextFieldDelegate;->Companion:Landroidx/compose/foundation/text/TextFieldDelegate$Companion;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    .end local p0    # "textInputService":Landroidx/compose/ui/text/input/TextInputService;
    .end local p1    # "value":Landroidx/compose/ui/text/input/TextFieldValue;
    .end local p2    # "editProcessor":Landroidx/compose/ui/text/input/EditProcessor;
    .end local p3    # "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    .end local p4    # "onValueChange":Lkotlin/jvm/functions/Function1;
    .end local p5    # "onImeActionPerformed":Lkotlin/jvm/functions/Function1;
    .local v1, "textInputService":Landroidx/compose/ui/text/input/TextInputService;
    .local v2, "value":Landroidx/compose/ui/text/input/TextFieldValue;
    .local v3, "editProcessor":Landroidx/compose/ui/text/input/EditProcessor;
    .local v4, "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    .local v5, "onValueChange":Lkotlin/jvm/functions/Function1;
    .local v6, "onImeActionPerformed":Lkotlin/jvm/functions/Function1;
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/foundation/text/TextFieldDelegate$Companion;->onFocus$foundation_release(Landroidx/compose/ui/text/input/TextInputService;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/EditProcessor;Landroidx/compose/ui/text/input/ImeOptions;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/text/input/TextInputSession;

    move-result-object p0

    .line 385
    return-object p0
.end method

.method public static final restartInput$foundation_release(Landroidx/compose/ui/text/input/TextInputService;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/EditProcessor;Landroidx/compose/ui/text/input/ImeOptions;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/text/input/TextInputSession;
    .locals 7
    .param p0, "textInputService"    # Landroidx/compose/ui/text/input/TextInputService;
    .param p1, "value"    # Landroidx/compose/ui/text/input/TextFieldValue;
    .param p2, "editProcessor"    # Landroidx/compose/ui/text/input/EditProcessor;
    .param p3, "imeOptions"    # Landroidx/compose/ui/text/input/ImeOptions;
    .param p4, "onValueChange"    # Lkotlin/jvm/functions/Function1;
    .param p5, "onImeActionPerformed"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/text/input/TextInputService;",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Landroidx/compose/ui/text/input/EditProcessor;",
            "Landroidx/compose/ui/text/input/ImeOptions;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/input/ImeAction;",
            "Lkotlin/Unit;",
            ">;)",
            "Landroidx/compose/ui/text/input/TextInputSession;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Landroidx/compose/foundation/text/TextFieldDelegate;->Companion:Landroidx/compose/foundation/text/TextFieldDelegate$Companion;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    .end local p0    # "textInputService":Landroidx/compose/ui/text/input/TextInputService;
    .end local p1    # "value":Landroidx/compose/ui/text/input/TextFieldValue;
    .end local p2    # "editProcessor":Landroidx/compose/ui/text/input/EditProcessor;
    .end local p3    # "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    .end local p4    # "onValueChange":Lkotlin/jvm/functions/Function1;
    .end local p5    # "onImeActionPerformed":Lkotlin/jvm/functions/Function1;
    .local v1, "textInputService":Landroidx/compose/ui/text/input/TextInputService;
    .local v2, "value":Landroidx/compose/ui/text/input/TextFieldValue;
    .local v3, "editProcessor":Landroidx/compose/ui/text/input/EditProcessor;
    .local v4, "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    .local v5, "onValueChange":Lkotlin/jvm/functions/Function1;
    .local v6, "onImeActionPerformed":Lkotlin/jvm/functions/Function1;
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/foundation/text/TextFieldDelegate$Companion;->restartInput$foundation_release(Landroidx/compose/ui/text/input/TextInputService;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/EditProcessor;Landroidx/compose/ui/text/input/ImeOptions;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/text/input/TextInputSession;

    move-result-object p0

    .line 355
    return-object p0
.end method

.method public static final setCursorOffset-ULxng0E$foundation_release(JLandroidx/compose/foundation/text/TextLayoutResultProxy;Landroidx/compose/ui/text/input/EditProcessor;Landroidx/compose/ui/text/input/OffsetMapping;Lkotlin/jvm/functions/Function1;)V
    .locals 7
    .param p0, "position"    # J
    .param p2, "textLayoutResult"    # Landroidx/compose/foundation/text/TextLayoutResultProxy;
    .param p3, "editProcessor"    # Landroidx/compose/ui/text/input/EditProcessor;
    .param p4, "offsetMapping"    # Landroidx/compose/ui/text/input/OffsetMapping;
    .param p5, "onValueChange"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Landroidx/compose/foundation/text/TextLayoutResultProxy;",
            "Landroidx/compose/ui/text/input/EditProcessor;",
            "Landroidx/compose/ui/text/input/OffsetMapping;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Landroidx/compose/foundation/text/TextFieldDelegate;->Companion:Landroidx/compose/foundation/text/TextFieldDelegate$Companion;

    move-wide v1, p0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    .end local p0    # "position":J
    .end local p2    # "textLayoutResult":Landroidx/compose/foundation/text/TextLayoutResultProxy;
    .end local p3    # "editProcessor":Landroidx/compose/ui/text/input/EditProcessor;
    .end local p4    # "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    .end local p5    # "onValueChange":Lkotlin/jvm/functions/Function1;
    .local v1, "position":J
    .local v3, "textLayoutResult":Landroidx/compose/foundation/text/TextLayoutResultProxy;
    .local v4, "editProcessor":Landroidx/compose/ui/text/input/EditProcessor;
    .local v5, "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    .local v6, "onValueChange":Lkotlin/jvm/functions/Function1;
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/foundation/text/TextFieldDelegate$Companion;->setCursorOffset-ULxng0E$foundation_release(JLandroidx/compose/foundation/text/TextLayoutResultProxy;Landroidx/compose/ui/text/input/EditProcessor;Landroidx/compose/ui/text/input/OffsetMapping;Lkotlin/jvm/functions/Function1;)V

    .line 325
    return-void
.end method

.method public static final updateTextLayoutResult$foundation_release(Landroidx/compose/ui/text/input/TextInputSession;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/TextLayoutResultProxy;)V
    .locals 1
    .param p0, "textInputSession"    # Landroidx/compose/ui/text/input/TextInputSession;
    .param p1, "textFieldValue"    # Landroidx/compose/ui/text/input/TextFieldValue;
    .param p2, "offsetMapping"    # Landroidx/compose/ui/text/input/OffsetMapping;
    .param p3, "textLayoutResult"    # Landroidx/compose/foundation/text/TextLayoutResultProxy;
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Landroidx/compose/foundation/text/TextFieldDelegate;->Companion:Landroidx/compose/foundation/text/TextFieldDelegate$Companion;

    invoke-virtual {v0, p0, p1, p2, p3}, Landroidx/compose/foundation/text/TextFieldDelegate$Companion;->updateTextLayoutResult$foundation_release(Landroidx/compose/ui/text/input/TextInputSession;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/TextLayoutResultProxy;)V

    .line 275
    return-void
.end method
