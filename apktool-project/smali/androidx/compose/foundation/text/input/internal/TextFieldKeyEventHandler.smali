.class public abstract Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;
.super Ljava/lang/Object;
.source "TextFieldKeyEventHandler.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTextFieldKeyEventHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldKeyEventHandler.kt\nandroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,294:1\n247#1,27:296\n1#2:295\n61#3:323\n70#4:324\n22#5:325\n*S KotlinDebug\n*F\n+ 1 TextFieldKeyEventHandler.kt\nandroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler\n*L\n160#1:296,27\n289#1:323\n289#1:324\n289#1:325\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0000\u0008 \u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002JX\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000c2\u0006\u0010\u0018\u001a\u00020\u000c2\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ:\u0010\u001e\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008#\u0010$J:\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\'\u001a\u00020\u000c2\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u001b0)\u00a2\u0006\u0002\u0008+H\u0082\u0008JP\u0010,\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000c2\u0006\u0010\u0018\u001a\u00020\u000c2\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008-\u0010.J\u000c\u0010/\u001a\u000200*\u00020\u0012H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u00061"
    }
    d2 = {
        "Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;",
        "",
        "()V",
        "currentlyConsumedDownKeys",
        "Landroidx/collection/MutableLongSet;",
        "deadKeyCombiner",
        "Landroidx/compose/foundation/text/DeadKeyCombiner;",
        "keyMapping",
        "Landroidx/compose/foundation/text/KeyMapping;",
        "preparedSelectionState",
        "Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;",
        "onKeyEvent",
        "",
        "event",
        "Landroidx/compose/ui/input/key/KeyEvent;",
        "textFieldState",
        "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;",
        "textLayoutState",
        "Landroidx/compose/foundation/text/input/internal/TextLayoutState;",
        "textFieldSelectionState",
        "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;",
        "clipboardKeyCommandsHandler",
        "Landroidx/compose/foundation/text/input/internal/ClipboardKeyCommandsHandler;",
        "editable",
        "singleLine",
        "onSubmit",
        "Lkotlin/Function0;",
        "",
        "onKeyEvent-CJ9ybgU",
        "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Lkotlin/jvm/functions/Function1;ZZLkotlin/jvm/functions/Function0;)Z",
        "onPreKeyEvent",
        "focusManager",
        "Landroidx/compose/ui/focus/FocusManager;",
        "keyboardController",
        "Landroidx/compose/ui/platform/SoftwareKeyboardController;",
        "onPreKeyEvent-MyFupTE",
        "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/platform/SoftwareKeyboardController;)Z",
        "preparedSelectionContext",
        "state",
        "isFromSoftKeyboard",
        "block",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;",
        "Lkotlin/ExtensionFunctionType;",
        "processKeyDownEvent",
        "processKeyDownEvent-ZcWbMB8",
        "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Lkotlin/jvm/functions/Function1;ZZLkotlin/jvm/functions/Function0;)Z",
        "getVisibleTextLayoutHeight",
        "",
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


# instance fields
.field private currentlyConsumedDownKeys:Landroidx/collection/MutableLongSet;

.field private final deadKeyCombiner:Landroidx/compose/foundation/text/DeadKeyCombiner;

.field private final keyMapping:Landroidx/compose/foundation/text/KeyMapping;

.field private final preparedSelectionState:Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    new-instance v0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;

    invoke-direct {v0}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;-><init>()V

    iput-object v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;->preparedSelectionState:Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;

    .line 53
    new-instance v0, Landroidx/compose/foundation/text/DeadKeyCombiner;

    invoke-direct {v0}, Landroidx/compose/foundation/text/DeadKeyCombiner;-><init>()V

    iput-object v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;->deadKeyCombiner:Landroidx/compose/foundation/text/DeadKeyCombiner;

    .line 54
    invoke-static {}, Landroidx/compose/foundation/text/KeyMapping_androidKt;->getPlatformDefaultKeyMapping()Landroidx/compose/foundation/text/KeyMapping;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;->keyMapping:Landroidx/compose/foundation/text/KeyMapping;

    .line 51
    return-void
.end method

.method private final getVisibleTextLayoutHeight(Landroidx/compose/foundation/text/input/internal/TextLayoutState;)F
    .locals 6
    .param p1, "$this$getVisibleTextLayoutHeight"    # Landroidx/compose/foundation/text/input/internal/TextLayoutState;

    .line 281
    nop

    .line 289
    nop

    .line 288
    nop

    .line 283
    nop

    .line 281
    invoke-virtual {p1}, Landroidx/compose/foundation/text/input/internal/TextLayoutState;->getTextLayoutNodeCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v0

    .line 282
    if-eqz v0, :cond_3

    .line 281
    nop

    .line 282
    move-object v1, v0

    .line 295
    .local v1, "it":Landroidx/compose/ui/layout/LayoutCoordinates;
    const/4 v2, 0x0

    .line 282
    .local v2, "$i$a$-takeIf-TextFieldKeyEventHandler$getVisibleTextLayoutHeight$1":I
    invoke-interface {v1}, Landroidx/compose/ui/layout/LayoutCoordinates;->isAttached()Z

    move-result v1

    .end local v1    # "it":Landroidx/compose/ui/layout/LayoutCoordinates;
    .end local v2    # "$i$a$-takeIf-TextFieldKeyEventHandler$getVisibleTextLayoutHeight$1":I
    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v2

    .line 283
    :goto_0
    if-eqz v0, :cond_3

    .line 282
    nop

    .line 283
    nop

    .local v0, "textLayoutCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    const/4 v1, 0x0

    .line 285
    .local v1, "$i$a$-let-TextFieldKeyEventHandler$getVisibleTextLayoutHeight$2":I
    nop

    .line 286
    nop

    .line 284
    invoke-virtual {p1}, Landroidx/compose/foundation/text/input/internal/TextLayoutState;->getDecoratorNodeCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v3

    .line 285
    if-eqz v3, :cond_2

    .line 284
    nop

    .line 285
    move-object v4, v3

    .line 295
    .local v4, "it":Landroidx/compose/ui/layout/LayoutCoordinates;
    const/4 v5, 0x0

    .line 285
    .local v5, "$i$a$-takeIf-TextFieldKeyEventHandler$getVisibleTextLayoutHeight$2$1":I
    invoke-interface {v4}, Landroidx/compose/ui/layout/LayoutCoordinates;->isAttached()Z

    move-result v4

    .end local v4    # "it":Landroidx/compose/ui/layout/LayoutCoordinates;
    .end local v5    # "$i$a$-takeIf-TextFieldKeyEventHandler$getVisibleTextLayoutHeight$2$1":I
    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    move-object v3, v2

    .line 286
    :goto_1
    if-eqz v3, :cond_2

    .line 285
    nop

    .line 286
    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-static {v3, v0, v4, v5, v2}, Landroidx/compose/ui/layout/LayoutCoordinates;->localBoundingBoxOf$default(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;ZILjava/lang/Object;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v2

    goto :goto_2

    .line 285
    :cond_2
    nop

    .line 286
    :goto_2
    nop

    .line 283
    .end local v0    # "textLayoutCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    .end local v1    # "$i$a$-let-TextFieldKeyEventHandler$getVisibleTextLayoutHeight$2":I
    nop

    .line 288
    if-eqz v2, :cond_3

    .line 283
    nop

    .line 288
    invoke-virtual {v2}, Landroidx/compose/ui/geometry/Rect;->getSize-NH-jbRc()J

    move-result-wide v0

    .line 289
    const/4 v2, 0x0

    .line 323
    .local v2, "$i$f$getHeight-impl":I
    nop

    .local v0, "value$iv$iv":J
    const/4 v3, 0x0

    .line 324
    .local v3, "$i$f$unpackFloat2":I
    const-wide v4, 0xffffffffL

    and-long/2addr v4, v0

    long-to-int v4, v4

    .local v4, "bits$iv$iv$iv":I
    const/4 v5, 0x0

    .line 325
    .local v5, "$i$f$floatFromBits":I
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    .line 324
    .end local v4    # "bits$iv$iv$iv":I
    .end local v5    # "$i$f$floatFromBits":I
    nop

    .line 323
    .end local v0    # "value$iv$iv":J
    .end local v3    # "$i$f$unpackFloat2":I
    nop

    .line 289
    .end local v2    # "$i$f$getHeight-impl":I
    nop

    .line 281
    goto :goto_3

    .line 289
    :cond_3
    const/high16 v4, 0x7fc00000    # Float.NaN

    .line 281
    :goto_3
    return v4
.end method

.method private final preparedSelectionContext(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;ZLkotlin/jvm/functions/Function1;)V
    .locals 10
    .param p1, "state"    # Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .param p2, "textLayoutState"    # Landroidx/compose/foundation/text/input/internal/TextLayoutState;
    .param p3, "isFromSoftKeyboard"    # Z
    .param p4, "block"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;",
            "Landroidx/compose/foundation/text/input/internal/TextLayoutState;",
            "Z",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 247
    .local v0, "$i$f$preparedSelectionContext":I
    invoke-virtual {p2}, Landroidx/compose/foundation/text/input/internal/TextLayoutState;->getLayoutResult()Landroidx/compose/ui/text/TextLayoutResult;

    move-result-object v3

    .line 248
    .local v3, "layoutResult":Landroidx/compose/ui/text/TextLayoutResult;
    invoke-direct {p0, p2}, Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;->getVisibleTextLayoutHeight(Landroidx/compose/foundation/text/input/internal/TextLayoutState;)F

    move-result v5

    .line 250
    .local v5, "visibleTextLayoutHeight":F
    new-instance v1, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    .line 251
    nop

    .line 252
    nop

    .line 253
    nop

    .line 254
    nop

    .line 255
    iget-object v6, p0, Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;->preparedSelectionState:Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;

    .line 250
    move-object v2, p1

    move v4, p3

    .end local p1    # "state":Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .end local p3    # "isFromSoftKeyboard":Z
    .local v2, "state":Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .local v4, "isFromSoftKeyboard":Z
    invoke-direct/range {v1 .. v6}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;-><init>(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextLayoutResult;ZFLandroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;)V

    .line 249
    nop

    .line 257
    .local v1, "preparedSelection":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    invoke-interface {p4, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    invoke-virtual {v1}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v6

    invoke-virtual {v1}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getInitialValue()Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/compose/foundation/text/input/TextFieldCharSequence;->getSelection-d9O1mEE()J

    move-result-wide v8

    invoke-static {v6, v7, v8, v9}, Landroidx/compose/ui/text/TextRange;->equals-impl0(JJ)Z

    move-result p1

    if-nez p1, :cond_0

    .line 260
    invoke-virtual {v1}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v6

    invoke-virtual {v2, v6, v7}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->selectCharsIn-5zc-tL8(J)V

    .line 263
    :cond_0
    invoke-virtual {v1}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getWedgeAffinity()Landroidx/compose/foundation/text/input/internal/WedgeAffinity;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 264
    invoke-virtual {v1}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getWedgeAffinity()Landroidx/compose/foundation/text/input/internal/WedgeAffinity;

    move-result-object p1

    if-eqz p1, :cond_2

    .local p1, "wedgeAffinity":Landroidx/compose/foundation/text/input/internal/WedgeAffinity;
    const/4 p3, 0x0

    .line 265
    .local p3, "$i$a$-let-TextFieldKeyEventHandler$preparedSelectionContext$1":I
    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->getUntransformedText()Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/compose/foundation/text/input/TextFieldCharSequence;->getSelection-d9O1mEE()J

    move-result-wide v6

    invoke-static {v6, v7}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 266
    new-instance v6, Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;

    invoke-direct {v6, p1}, Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;-><init>(Landroidx/compose/foundation/text/input/internal/WedgeAffinity;)V

    invoke-virtual {v2, v6}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->setSelectionWedgeAffinity(Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;)V

    goto :goto_0

    .line 268
    :cond_1
    nop

    .line 269
    invoke-virtual {v1}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getInitialWedgeAffinity()Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;

    move-result-object v6

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-static {v6, v8, p1, v7, v8}, Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;->copy$default(Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;Landroidx/compose/foundation/text/input/internal/WedgeAffinity;Landroidx/compose/foundation/text/input/internal/WedgeAffinity;ILjava/lang/Object;)Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;

    move-result-object v6

    .line 268
    invoke-virtual {v2, v6}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->setSelectionWedgeAffinity(Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;)V

    .line 271
    :goto_0
    nop

    .line 264
    .end local p1    # "wedgeAffinity":Landroidx/compose/foundation/text/input/internal/WedgeAffinity;
    .end local p3    # "$i$a$-let-TextFieldKeyEventHandler$preparedSelectionContext$1":I
    nop

    .line 273
    :cond_2
    return-void
.end method

.method private final processKeyDownEvent-ZcWbMB8(Landroid/view/KeyEvent;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Lkotlin/jvm/functions/Function1;ZZLkotlin/jvm/functions/Function0;)Z
    .locals 21
    .param p1, "event"    # Landroid/view/KeyEvent;
    .param p2, "textFieldState"    # Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .param p3, "textLayoutState"    # Landroidx/compose/foundation/text/input/internal/TextLayoutState;
    .param p4, "clipboardKeyCommandsHandler"    # Lkotlin/jvm/functions/Function1;
    .param p5, "editable"    # Z
    .param p6, "singleLine"    # Z
    .param p7, "onSubmit"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/KeyEvent;",
            "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;",
            "Landroidx/compose/foundation/text/input/internal/TextLayoutState;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/foundation/text/KeyCommand;",
            "+",
            "Lkotlin/Unit;",
            ">;ZZ",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)Z"
        }
    .end annotation

    .line 137
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-static {v1}, Landroidx/compose/foundation/text/TextFieldKeyInput_androidKt;->isTypedEvent-ZmokQxo(Landroid/view/KeyEvent;)Z

    move-result v2

    const/4 v3, 0x0

    const/4 v9, 0x1

    if-eqz v2, :cond_1

    .line 138
    iget-object v2, v0, Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;->deadKeyCombiner:Landroidx/compose/foundation/text/DeadKeyCombiner;

    invoke-virtual {v2, v1}, Landroidx/compose/foundation/text/DeadKeyCombiner;->consume-ZmokQxo(Landroid/view/KeyEvent;)Ljava/lang/Integer;

    move-result-object v10

    .line 139
    .local v10, "codePoint":Ljava/lang/Integer;
    if-eqz v10, :cond_1

    .line 140
    new-instance v2, Ljava/lang/StringBuilder;

    const/4 v4, 0x2

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v2, v4}, Landroidx/compose/foundation/text/StringHelpers_jvmKt;->appendCodePointX(Ljava/lang/StringBuilder;I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 141
    .local v11, "text":Ljava/lang/String;
    if-eqz p5, :cond_0

    .line 142
    nop

    .line 143
    move-object v3, v11

    check-cast v3, Ljava/lang/CharSequence;

    .line 144
    nop

    .line 142
    nop

    .line 145
    invoke-static {v1}, Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler_androidKt;->isFromSoftKeyboard-ZmokQxo(Landroid/view/KeyEvent;)Z

    move-result v2

    .line 142
    xor-int/lit8 v6, v2, 0x1

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object/from16 v2, p2

    invoke-static/range {v2 .. v8}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->replaceSelectedText$default(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Ljava/lang/CharSequence;ZLandroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;ZILjava/lang/Object;)V

    .line 147
    iget-object v2, v0, Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;->preparedSelectionState:Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;

    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 148
    move v3, v9

    goto :goto_0

    .line 150
    :cond_0
    nop

    .line 141
    :goto_0
    return v3

    .line 155
    .end local v10    # "codePoint":Ljava/lang/Integer;
    .end local v11    # "text":Ljava/lang/String;
    :cond_1
    iget-object v2, v0, Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;->keyMapping:Landroidx/compose/foundation/text/KeyMapping;

    invoke-interface {v2, v1}, Landroidx/compose/foundation/text/KeyMapping;->map-ZmokQxo(Landroid/view/KeyEvent;)Landroidx/compose/foundation/text/KeyCommand;

    move-result-object v10

    .line 156
    .local v10, "command":Landroidx/compose/foundation/text/KeyCommand;
    if-eqz v10, :cond_8

    invoke-virtual {v10}, Landroidx/compose/foundation/text/KeyCommand;->getEditsText()Z

    move-result v2

    if-eqz v2, :cond_2

    if-nez p5, :cond_2

    move-object/from16 v2, p2

    move-object/from16 v14, p3

    move-object/from16 v5, p4

    goto/16 :goto_3

    .line 159
    :cond_2
    const/4 v2, 0x0

    .local v2, "consumed":Z
    const/4 v11, 0x1

    .line 160
    .end local v2    # "consumed":Z
    .local v11, "consumed":Z
    invoke-static {v1}, Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler_androidKt;->isFromSoftKeyboard-ZmokQxo(Landroid/view/KeyEvent;)Z

    move-result v5

    .local v5, "isFromSoftKeyboard$iv":Z
    move-object/from16 v12, p0

    .local v12, "this_$iv":Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;
    const/4 v13, 0x0

    .line 296
    .local v13, "$i$f$preparedSelectionContext":I
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/foundation/text/input/internal/TextLayoutState;->getLayoutResult()Landroidx/compose/ui/text/TextLayoutResult;

    move-result-object v4

    .line 297
    .local v4, "layoutResult$iv":Landroidx/compose/ui/text/TextLayoutResult;
    move-object/from16 v14, p3

    invoke-direct {v12, v14}, Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;->getVisibleTextLayoutHeight(Landroidx/compose/foundation/text/input/internal/TextLayoutState;)F

    move-result v6

    .line 299
    .local v6, "visibleTextLayoutHeight$iv":F
    new-instance v2, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    .line 300
    nop

    .line 301
    nop

    .line 302
    nop

    .line 303
    nop

    .line 304
    iget-object v7, v12, Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;->preparedSelectionState:Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;

    .line 299
    move-object/from16 v3, p2

    invoke-direct/range {v2 .. v7}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;-><init>(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextLayoutResult;ZFLandroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;)V

    .line 298
    move-object/from16 v16, v4

    move v15, v5

    move/from16 v17, v6

    .end local v4    # "layoutResult$iv":Landroidx/compose/ui/text/TextLayoutResult;
    .end local v5    # "isFromSoftKeyboard$iv":Z
    .end local v6    # "visibleTextLayoutHeight$iv":F
    .local v15, "isFromSoftKeyboard$iv":Z
    .local v16, "layoutResult$iv":Landroidx/compose/ui/text/TextLayoutResult;
    .local v17, "visibleTextLayoutHeight$iv":F
    move-object/from16 v18, v2

    .line 306
    .local v18, "preparedSelection$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    nop

    .local v2, "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/16 v19, 0x0

    .line 161
    .local v19, "$i$a$-preparedSelectionContext-TextFieldKeyEventHandler$processKeyDownEvent$1":I
    sget-object v3, Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v10}, Landroidx/compose/foundation/text/KeyCommand;->ordinal()I

    move-result v4

    aget v3, v3, v4

    packed-switch v3, :pswitch_data_0

    move-object/from16 v5, p4

    move-object v4, v2

    move-object/from16 v2, p2

    .end local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .local v4, "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    goto/16 :goto_1

    .line 234
    .end local v4    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    :pswitch_0
    invoke-static {}, Landroidx/compose/foundation/text/KeyEventHelpers_androidKt;->showCharacterPalette()V

    move-object/from16 v5, p4

    move-object v4, v2

    move-object/from16 v2, p2

    goto/16 :goto_1

    .line 231
    :pswitch_1
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->redo()V

    move-object/from16 v5, p4

    move-object v4, v2

    move-object/from16 v2, p2

    goto/16 :goto_1

    .line 228
    :pswitch_2
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->undo()V

    move-object/from16 v5, p4

    move-object v4, v2

    move-object/from16 v2, p2

    goto/16 :goto_1

    .line 226
    :pswitch_3
    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->deselect()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    move-object v4, v2

    move-object/from16 v2, p2

    goto/16 :goto_1

    .line 225
    :pswitch_4
    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorToEnd()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selectMovement()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    move-object v4, v2

    move-object/from16 v2, p2

    goto/16 :goto_1

    .line 224
    :pswitch_5
    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorToHome()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selectMovement()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    move-object v4, v2

    move-object/from16 v2, p2

    goto/16 :goto_1

    .line 223
    :pswitch_6
    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorDownByPage()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selectMovement()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    move-object v4, v2

    move-object/from16 v2, p2

    goto/16 :goto_1

    .line 222
    :pswitch_7
    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorUpByPage()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selectMovement()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    move-object v4, v2

    move-object/from16 v2, p2

    goto/16 :goto_1

    .line 221
    :pswitch_8
    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorDownByLine()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selectMovement()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    move-object v4, v2

    move-object/from16 v2, p2

    goto/16 :goto_1

    .line 220
    :pswitch_9
    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorUpByLine()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selectMovement()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    move-object v4, v2

    move-object/from16 v2, p2

    goto/16 :goto_1

    .line 219
    :pswitch_a
    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorToLineRightSide()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selectMovement()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    move-object v4, v2

    move-object/from16 v2, p2

    goto/16 :goto_1

    .line 218
    :pswitch_b
    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorToLineLeftSide()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selectMovement()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    move-object v4, v2

    move-object/from16 v2, p2

    goto/16 :goto_1

    .line 217
    :pswitch_c
    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorToLineEnd()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selectMovement()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    move-object v4, v2

    move-object/from16 v2, p2

    goto/16 :goto_1

    .line 216
    :pswitch_d
    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorToLineStart()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selectMovement()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    move-object v4, v2

    move-object/from16 v2, p2

    goto/16 :goto_1

    .line 215
    :pswitch_e
    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorNextByParagraph()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selectMovement()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    move-object v4, v2

    move-object/from16 v2, p2

    goto/16 :goto_1

    .line 214
    :pswitch_f
    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorPrevByParagraph()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selectMovement()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    move-object v4, v2

    move-object/from16 v2, p2

    goto/16 :goto_1

    .line 213
    :pswitch_10
    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorRightByWord()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selectMovement()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    move-object v4, v2

    move-object/from16 v2, p2

    goto/16 :goto_1

    .line 212
    :pswitch_11
    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorLeftByWord()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selectMovement()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    move-object v4, v2

    move-object/from16 v2, p2

    goto/16 :goto_1

    .line 211
    :pswitch_12
    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorRightByChar()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selectMovement()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    move-object v4, v2

    move-object/from16 v2, p2

    goto/16 :goto_1

    .line 210
    :pswitch_13
    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorLeftByChar()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selectMovement()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    move-object v4, v2

    move-object/from16 v2, p2

    goto/16 :goto_1

    .line 209
    :pswitch_14
    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->selectAll()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    move-object v4, v2

    move-object/from16 v2, p2

    goto/16 :goto_1

    .line 199
    :pswitch_15
    if-nez p6, :cond_3

    .line 200
    nop

    .line 201
    const-string v3, "\t"

    check-cast v3, Ljava/lang/CharSequence;

    .line 202
    nop

    .line 200
    nop

    .line 203
    invoke-static {v1}, Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler_androidKt;->isFromSoftKeyboard-ZmokQxo(Landroid/view/KeyEvent;)Z

    move-result v4

    .line 200
    xor-int/lit8 v6, v4, 0x1

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object/from16 v20, v2

    move-object/from16 v2, p2

    .end local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .local v20, "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    invoke-static/range {v2 .. v8}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->replaceSelectedText$default(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Ljava/lang/CharSequence;ZLandroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;ZILjava/lang/Object;)V

    move-object/from16 v5, p4

    move-object/from16 v4, v20

    goto/16 :goto_1

    .line 206
    .end local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    :cond_3
    move-object/from16 v20, v2

    .end local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    const/4 v11, 0x0

    move-object/from16 v2, p2

    move-object/from16 v5, p4

    move-object/from16 v4, v20

    goto/16 :goto_1

    .line 188
    .end local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    :pswitch_16
    move-object/from16 v20, v2

    .end local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    if-nez p6, :cond_4

    .line 189
    nop

    .line 190
    const-string v2, "\n"

    move-object v3, v2

    check-cast v3, Ljava/lang/CharSequence;

    .line 191
    nop

    .line 189
    nop

    .line 192
    invoke-static {v1}, Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler_androidKt;->isFromSoftKeyboard-ZmokQxo(Landroid/view/KeyEvent;)Z

    move-result v2

    .line 189
    xor-int/lit8 v6, v2, 0x1

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object/from16 v2, p2

    invoke-static/range {v2 .. v8}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->replaceSelectedText$default(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Ljava/lang/CharSequence;ZLandroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;ZILjava/lang/Object;)V

    move-object/from16 v5, p4

    move-object/from16 v4, v20

    goto/16 :goto_1

    .line 195
    :cond_4
    move-object/from16 v2, p2

    invoke-interface/range {p7 .. p7}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-object/from16 v5, p4

    move-object/from16 v4, v20

    goto/16 :goto_1

    .line 186
    .end local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    :pswitch_17
    move-object/from16 v20, v2

    move-object/from16 v2, p2

    .end local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorToLineEnd()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->deleteMovement()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    move-object/from16 v4, v20

    goto/16 :goto_1

    .line 185
    .end local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    :pswitch_18
    move-object/from16 v20, v2

    move-object/from16 v2, p2

    .end local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorToLineStart()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->deleteMovement()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    move-object/from16 v4, v20

    goto/16 :goto_1

    .line 184
    .end local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    :pswitch_19
    move-object/from16 v20, v2

    move-object/from16 v2, p2

    .end local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorNextByWord()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->deleteMovement()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    move-object/from16 v4, v20

    goto/16 :goto_1

    .line 183
    .end local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    :pswitch_1a
    move-object/from16 v20, v2

    move-object/from16 v2, p2

    .end local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorPrevByWord()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->deleteMovement()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    move-object/from16 v4, v20

    goto/16 :goto_1

    .line 182
    .end local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    :pswitch_1b
    move-object/from16 v20, v2

    move-object/from16 v2, p2

    .end local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorNextByChar()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->deleteMovement()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    move-object/from16 v4, v20

    goto/16 :goto_1

    .line 181
    .end local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    :pswitch_1c
    move-object/from16 v20, v2

    move-object/from16 v2, p2

    .end local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorPrevByChar()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->deleteMovement()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    move-object/from16 v4, v20

    goto/16 :goto_1

    .line 180
    .end local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    :pswitch_1d
    move-object/from16 v20, v2

    move-object/from16 v2, p2

    .end local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorToEnd()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    move-object/from16 v4, v20

    goto/16 :goto_1

    .line 179
    .end local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    :pswitch_1e
    move-object/from16 v20, v2

    move-object/from16 v2, p2

    .end local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorToHome()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    move-object/from16 v4, v20

    goto/16 :goto_1

    .line 178
    .end local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    :pswitch_1f
    move-object/from16 v20, v2

    move-object/from16 v2, p2

    .end local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorToLineRightSide()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    move-object/from16 v4, v20

    goto/16 :goto_1

    .line 177
    .end local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    :pswitch_20
    move-object/from16 v20, v2

    move-object/from16 v2, p2

    .end local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorToLineLeftSide()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    move-object/from16 v4, v20

    goto/16 :goto_1

    .line 176
    .end local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    :pswitch_21
    move-object/from16 v20, v2

    move-object/from16 v2, p2

    .end local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorToLineEnd()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    move-object/from16 v4, v20

    goto/16 :goto_1

    .line 175
    .end local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    :pswitch_22
    move-object/from16 v20, v2

    move-object/from16 v2, p2

    .end local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorToLineStart()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    move-object/from16 v4, v20

    goto/16 :goto_1

    .line 174
    .end local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    :pswitch_23
    move-object/from16 v20, v2

    move-object/from16 v2, p2

    .end local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorDownByPage()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    move-object/from16 v4, v20

    goto/16 :goto_1

    .line 173
    .end local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    :pswitch_24
    move-object/from16 v20, v2

    move-object/from16 v2, p2

    .end local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorUpByPage()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    move-object/from16 v4, v20

    goto/16 :goto_1

    .line 172
    .end local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    :pswitch_25
    move-object/from16 v20, v2

    move-object/from16 v2, p2

    .end local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorDownByLine()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    move-object/from16 v4, v20

    goto/16 :goto_1

    .line 171
    .end local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    :pswitch_26
    move-object/from16 v20, v2

    move-object/from16 v2, p2

    .end local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorUpByLine()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    move-object/from16 v4, v20

    goto/16 :goto_1

    .line 170
    .end local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    :pswitch_27
    move-object/from16 v20, v2

    move-object/from16 v2, p2

    .end local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorNextByParagraph()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    move-object/from16 v4, v20

    goto :goto_1

    .line 169
    .end local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    :pswitch_28
    move-object/from16 v20, v2

    move-object/from16 v2, p2

    .end local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorPrevByParagraph()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    move-object/from16 v4, v20

    goto :goto_1

    .line 168
    .end local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    :pswitch_29
    move-object/from16 v20, v2

    move-object/from16 v2, p2

    .end local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorRightByWord()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    move-object/from16 v4, v20

    goto :goto_1

    .line 167
    .end local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    :pswitch_2a
    move-object/from16 v20, v2

    move-object/from16 v2, p2

    .end local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->moveCursorLeftByWord()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    move-object/from16 v4, v20

    goto :goto_1

    .line 166
    .end local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    :pswitch_2b
    move-object/from16 v20, v2

    move-object/from16 v2, p2

    .end local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    sget-object v3, Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler$processKeyDownEvent$1$2;->INSTANCE:Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler$processKeyDownEvent$1$2;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object/from16 v4, v20

    .end local v20    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v4    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    invoke-virtual {v4, v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->collapseRightOr(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    goto :goto_1

    .line 165
    .end local v4    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    :pswitch_2c
    move-object v4, v2

    move-object/from16 v2, p2

    .end local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v4    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    sget-object v3, Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler$processKeyDownEvent$1$1;->INSTANCE:Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler$processKeyDownEvent$1$1;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->collapseLeftOr(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;

    move-object/from16 v5, p4

    goto :goto_1

    .line 164
    .end local v4    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    :pswitch_2d
    move-object v4, v2

    move-object/from16 v2, p2

    .end local v2    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .restart local v4    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    move-object/from16 v5, p4

    invoke-interface {v5, v10}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    :goto_1
    nop

    .line 306
    .end local v4    # "$this$processKeyDownEvent_ZcWbMB8_u24lambda_u241":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    .end local v19    # "$i$a$-preparedSelectionContext-TextFieldKeyEventHandler$processKeyDownEvent$1":I
    nop

    .line 307
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v3

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getInitialValue()Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/compose/foundation/text/input/TextFieldCharSequence;->getSelection-d9O1mEE()J

    move-result-wide v6

    invoke-static {v3, v4, v6, v7}, Landroidx/compose/ui/text/TextRange;->equals-impl0(JJ)Z

    move-result v3

    if-nez v3, :cond_5

    .line 309
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->selectCharsIn-5zc-tL8(J)V

    .line 312
    :cond_5
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getWedgeAffinity()Landroidx/compose/foundation/text/input/internal/WedgeAffinity;

    move-result-object v3

    if-eqz v3, :cond_7

    .line 313
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getWedgeAffinity()Landroidx/compose/foundation/text/input/internal/WedgeAffinity;

    move-result-object v3

    if-eqz v3, :cond_7

    .local v3, "wedgeAffinity$iv":Landroidx/compose/foundation/text/input/internal/WedgeAffinity;
    const/4 v4, 0x0

    .line 314
    .local v4, "$i$a$-let-TextFieldKeyEventHandler$preparedSelectionContext$1$iv":I
    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->getUntransformedText()Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/compose/foundation/text/input/TextFieldCharSequence;->getSelection-d9O1mEE()J

    move-result-wide v6

    invoke-static {v6, v7}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v6

    if-eqz v6, :cond_6

    .line 315
    new-instance v6, Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;

    invoke-direct {v6, v3}, Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;-><init>(Landroidx/compose/foundation/text/input/internal/WedgeAffinity;)V

    invoke-virtual {v2, v6}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->setSelectionWedgeAffinity(Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;)V

    goto :goto_2

    .line 317
    :cond_6
    nop

    .line 318
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;->getInitialWedgeAffinity()Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v6, v7, v3, v9, v7}, Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;->copy$default(Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;Landroidx/compose/foundation/text/input/internal/WedgeAffinity;Landroidx/compose/foundation/text/input/internal/WedgeAffinity;ILjava/lang/Object;)Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;

    move-result-object v6

    .line 317
    invoke-virtual {v2, v6}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->setSelectionWedgeAffinity(Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;)V

    .line 320
    :goto_2
    nop

    .line 313
    .end local v3    # "wedgeAffinity$iv":Landroidx/compose/foundation/text/input/internal/WedgeAffinity;
    .end local v4    # "$i$a$-let-TextFieldKeyEventHandler$preparedSelectionContext$1$iv":I
    nop

    .line 322
    :cond_7
    nop

    .line 238
    .end local v12    # "this_$iv":Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;
    .end local v13    # "$i$f$preparedSelectionContext":I
    .end local v15    # "isFromSoftKeyboard$iv":Z
    .end local v16    # "layoutResult$iv":Landroidx/compose/ui/text/TextLayoutResult;
    .end local v17    # "visibleTextLayoutHeight$iv":F
    .end local v18    # "preparedSelection$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;
    return v11

    .line 156
    .end local v11    # "consumed":Z
    :cond_8
    move-object/from16 v2, p2

    move-object/from16 v14, p3

    move-object/from16 v5, p4

    .line 157
    :goto_3
    return v3

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2d
        :pswitch_2d
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public onKeyEvent-CJ9ybgU(Landroid/view/KeyEvent;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Lkotlin/jvm/functions/Function1;ZZLkotlin/jvm/functions/Function0;)Z
    .locals 11
    .param p1, "event"    # Landroid/view/KeyEvent;
    .param p2, "textFieldState"    # Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .param p3, "textLayoutState"    # Landroidx/compose/foundation/text/input/internal/TextLayoutState;
    .param p4, "textFieldSelectionState"    # Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;
    .param p5, "clipboardKeyCommandsHandler"    # Lkotlin/jvm/functions/Function1;
    .param p6, "editable"    # Z
    .param p7, "singleLine"    # Z
    .param p8, "onSubmit"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/KeyEvent;",
            "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;",
            "Landroidx/compose/foundation/text/input/internal/TextLayoutState;",
            "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/foundation/text/KeyCommand;",
            "+",
            "Lkotlin/Unit;",
            ">;ZZ",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)Z"
        }
    .end annotation

    .line 91
    invoke-static {p1}, Landroidx/compose/ui/input/key/KeyEvent_androidKt;->getKey-ZmokQxo(Landroid/view/KeyEvent;)J

    move-result-wide v8

    .line 93
    .local v8, "keyCode":J
    invoke-static {p1}, Landroidx/compose/ui/input/key/KeyEvent_androidKt;->getType-ZmokQxo(Landroid/view/KeyEvent;)I

    move-result v1

    sget-object v2, Landroidx/compose/ui/input/key/KeyEventType;->Companion:Landroidx/compose/ui/input/key/KeyEventType$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/input/key/KeyEventType$Companion;->getKeyUp-CS__XNY()I

    move-result v2

    invoke-static {v1, v2}, Landroidx/compose/ui/input/key/KeyEventType;->equals-impl0(II)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    .line 94
    iget-object v1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;->currentlyConsumedDownKeys:Landroidx/collection/MutableLongSet;

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    invoke-virtual {v1, v8, v9}, Landroidx/collection/MutableLongSet;->contains(J)Z

    move-result v1

    if-ne v1, v3, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    if-eqz v1, :cond_2

    .line 95
    iget-object v1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;->currentlyConsumedDownKeys:Landroidx/collection/MutableLongSet;

    if-eqz v1, :cond_1

    invoke-virtual {v1, v8, v9}, Landroidx/collection/MutableLongSet;->remove(J)Z

    .line 96
    :cond_1
    return v3

    .line 98
    :cond_2
    return v2

    .line 102
    :cond_3
    invoke-static {p1}, Landroidx/compose/ui/input/key/KeyEvent_androidKt;->getType-ZmokQxo(Landroid/view/KeyEvent;)I

    move-result v1

    sget-object v3, Landroidx/compose/ui/input/key/KeyEventType;->Companion:Landroidx/compose/ui/input/key/KeyEventType$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/input/key/KeyEventType$Companion;->getUnknown-CS__XNY()I

    move-result v3

    invoke-static {v1, v3}, Landroidx/compose/ui/input/key/KeyEventType;->equals-impl0(II)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {p1}, Landroidx/compose/foundation/text/TextFieldKeyInput_androidKt;->isTypedEvent-ZmokQxo(Landroid/view/KeyEvent;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 103
    return v2

    .line 107
    :cond_4
    nop

    .line 108
    nop

    .line 109
    nop

    .line 110
    nop

    .line 111
    nop

    .line 112
    nop

    .line 113
    nop

    .line 114
    nop

    .line 107
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object/from16 v4, p5

    move/from16 v5, p6

    move/from16 v6, p7

    move-object/from16 v7, p8

    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;->processKeyDownEvent-ZcWbMB8(Landroid/view/KeyEvent;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Lkotlin/jvm/functions/Function1;ZZLkotlin/jvm/functions/Function0;)Z

    move-result v10

    .line 106
    nop

    .line 117
    .local v10, "consumed":Z
    if-eqz v10, :cond_6

    .line 120
    iget-object v1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;->currentlyConsumedDownKeys:Landroidx/collection/MutableLongSet;

    if-nez v1, :cond_5

    .line 121
    new-instance v1, Landroidx/collection/MutableLongSet;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Landroidx/collection/MutableLongSet;-><init>(I)V

    move-object v2, v1

    .line 295
    .local v2, "it":Landroidx/collection/MutableLongSet;
    const/4 v3, 0x0

    .line 121
    .local v3, "$i$a$-also-TextFieldKeyEventHandler$onKeyEvent$currentlyConsumedDownKeys$1":I
    iput-object v2, p0, Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;->currentlyConsumedDownKeys:Landroidx/collection/MutableLongSet;

    .line 120
    .end local v2    # "it":Landroidx/collection/MutableLongSet;
    .end local v3    # "$i$a$-also-TextFieldKeyEventHandler$onKeyEvent$currentlyConsumedDownKeys$1":I
    :cond_5
    nop

    .line 119
    nop

    .line 122
    .local v1, "currentlyConsumedDownKeys":Landroidx/collection/MutableLongSet;
    invoke-virtual {v1, v8, v9}, Landroidx/collection/MutableLongSet;->plusAssign(J)V

    .line 125
    .end local v1    # "currentlyConsumedDownKeys":Landroidx/collection/MutableLongSet;
    :cond_6
    return v10
.end method

.method public onPreKeyEvent-MyFupTE(Landroid/view/KeyEvent;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/platform/SoftwareKeyboardController;)Z
    .locals 3
    .param p1, "event"    # Landroid/view/KeyEvent;
    .param p2, "textFieldState"    # Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .param p3, "textFieldSelectionState"    # Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;
    .param p4, "focusManager"    # Landroidx/compose/ui/focus/FocusManager;
    .param p5, "keyboardController"    # Landroidx/compose/ui/platform/SoftwareKeyboardController;

    .line 72
    invoke-virtual {p2}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->getVisualText()Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/foundation/text/input/TextFieldCharSequence;->getSelection-d9O1mEE()J

    move-result-wide v0

    .line 73
    .local v0, "selection":J
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {p1}, Landroidx/compose/foundation/text/KeyEventHelpers_androidKt;->cancelsTextSelection-ZmokQxo(Landroid/view/KeyEvent;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 74
    invoke-virtual {p3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;->deselect()V

    .line 75
    const/4 v2, 0x1

    goto :goto_0

    .line 77
    :cond_0
    const/4 v2, 0x0

    .line 73
    :goto_0
    return v2
.end method
