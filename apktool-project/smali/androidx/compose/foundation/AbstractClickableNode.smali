.class public abstract Landroidx/compose/foundation/AbstractClickableNode;
.super Landroidx/compose/ui/node/DelegatingNode;
.source "Clickable.kt"

# interfaces
.implements Landroidx/compose/ui/node/PointerInputModifierNode;
.implements Landroidx/compose/ui/input/key/KeyInputModifierNode;
.implements Landroidx/compose/ui/node/SemanticsModifierNode;
.implements Landroidx/compose/ui/node/TraversableNode;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/AbstractClickableNode$TraverseKey;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/AbstractClickableNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LongObjectMap.kt\nandroidx/collection/LongObjectMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1327:1\n1#2:1328\n397#3,3:1329\n354#3,6:1332\n364#3,3:1339\n367#3,9:1343\n400#3:1352\n397#3,3:1353\n354#3,6:1356\n364#3,3:1363\n367#3,9:1367\n400#3:1376\n1399#4:1338\n1270#4:1342\n1399#4:1362\n1270#4:1366\n159#5:1377\n30#6:1378\n53#7,3:1379\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/AbstractClickableNode\n*L\n1102#1:1329,3\n1102#1:1332,6\n1102#1:1339,3\n1102#1:1343,9\n1102#1:1352\n1118#1:1353,3\n1118#1:1356,6\n1118#1:1363,3\n1118#1:1367,9\n1118#1:1376\n1102#1:1338\n1102#1:1342\n1118#1:1362\n1118#1:1366\n1146#1:1377\n1146#1:1378\n1146#1:1379,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0000\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008 \u0018\u0000 a2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001aBC\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\u0002\u0010\u0013J\u0008\u00102\u001a\u00020\u000bH\u0002J\u0008\u00103\u001a\u00020\u0012H\u0004J\u0008\u00104\u001a\u00020\u0012H\u0002J\u0008\u00105\u001a\u00020\u0012H\u0002J\u0008\u00106\u001a\u00020\u0012H\u0002J\u0006\u00107\u001a\u00020\u0012J\u0008\u00108\u001a\u00020\u0012H\u0014J\u0006\u00109\u001a\u00020\u0012J\u001a\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020<H$\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008=\u0010>J\u001a\u0010?\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020<H$\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008@\u0010>J\u0006\u0010A\u001a\u00020\u0012J\u0010\u0010B\u001a\u00020\u00122\u0006\u0010C\u001a\u00020\u000bH\u0002J\u0018\u0010D\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020<\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008E\u0010>J(\u0010F\u001a\u00020\u00122\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008M\u0010NJ\u0018\u0010O\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020<\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008P\u0010>J\u000f\u0010Q\u001a\u0004\u0018\u00010\u0012H\u0004\u00a2\u0006\u0002\u0010RJ\u0008\u0010S\u001a\u00020\u000bH\u0002JN\u0010T\u001a\u00020\u00122\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011H\u0004\u00f8\u0001\u0000\u00a2\u0006\u0002\u0008UJ\u000c\u0010V\u001a\u00020\u0012*\u00020WH\u0016J\n\u0010X\u001a\u00020\u0012*\u00020WJ\u0012\u0010Y\u001a\u00020\u0012*\u00020ZH\u00a6@\u00a2\u0006\u0002\u0010[J\u001f\u0010\\\u001a\u00020\u0012*\u00020]2\u0006\u0010^\u001a\u00020\u0015H\u0084@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008_\u0010`R\u0016\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\n\u0002\u0010\u0016R\u0014\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b@BX\u0084\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R*\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011@BX\u0084\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u0010\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0002\n\u0000R\u0014\u0010)\u001a\u00020\u000bX\u0086D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010\u001cR\u0011\u0010+\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\u0008,\u0010\u001cR\u0014\u0010-\u001a\u00020.X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u00100R\u0010\u00101\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006b"
    }
    d2 = {
        "Landroidx/compose/foundation/AbstractClickableNode;",
        "Landroidx/compose/ui/node/DelegatingNode;",
        "Landroidx/compose/ui/node/PointerInputModifierNode;",
        "Landroidx/compose/ui/input/key/KeyInputModifierNode;",
        "Landroidx/compose/ui/node/SemanticsModifierNode;",
        "Landroidx/compose/ui/node/TraversableNode;",
        "interactionSource",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "indicationNodeFactory",
        "Landroidx/compose/foundation/IndicationNodeFactory;",
        "enabled",
        "",
        "onClickLabel",
        "",
        "role",
        "Landroidx/compose/ui/semantics/Role;",
        "onClick",
        "Lkotlin/Function0;",
        "",
        "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "centerOffset",
        "Landroidx/compose/ui/geometry/Offset;",
        "J",
        "currentKeyPressInteractions",
        "Landroidx/collection/MutableLongObjectMap;",
        "Landroidx/compose/foundation/interaction/PressInteraction$Press;",
        "<set-?>",
        "getEnabled",
        "()Z",
        "focusableNode",
        "Landroidx/compose/foundation/FocusableNode;",
        "hoverInteraction",
        "Landroidx/compose/foundation/interaction/HoverInteraction$Enter;",
        "indicationNode",
        "Landroidx/compose/ui/node/DelegatableNode;",
        "lazilyCreateIndication",
        "getOnClick",
        "()Lkotlin/jvm/functions/Function0;",
        "pointerInputNode",
        "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;",
        "pressInteraction",
        "shouldAutoInvalidate",
        "getShouldAutoInvalidate",
        "shouldMergeDescendantSemantics",
        "getShouldMergeDescendantSemantics",
        "traverseKey",
        "",
        "getTraverseKey",
        "()Ljava/lang/Object;",
        "userProvidedInteractionSource",
        "delayPressInteraction",
        "disposeInteractions",
        "emitHoverEnter",
        "emitHoverExit",
        "initializeIndicationAndInteractionSourceIfNeeded",
        "onAttach",
        "onCancelKeyInput",
        "onCancelPointerInput",
        "onClickKeyDownEvent",
        "event",
        "Landroidx/compose/ui/input/key/KeyEvent;",
        "onClickKeyDownEvent-ZmokQxo",
        "(Landroid/view/KeyEvent;)Z",
        "onClickKeyUpEvent",
        "onClickKeyUpEvent-ZmokQxo",
        "onDetach",
        "onFocusChange",
        "isFocused",
        "onKeyEvent",
        "onKeyEvent-ZmokQxo",
        "onPointerEvent",
        "pointerEvent",
        "Landroidx/compose/ui/input/pointer/PointerEvent;",
        "pass",
        "Landroidx/compose/ui/input/pointer/PointerEventPass;",
        "bounds",
        "Landroidx/compose/ui/unit/IntSize;",
        "onPointerEvent-H0pRuoY",
        "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V",
        "onPreKeyEvent",
        "onPreKeyEvent-ZmokQxo",
        "resetPointerInputHandler",
        "()Lkotlin/Unit;",
        "shouldLazilyCreateIndication",
        "updateCommon",
        "updateCommon-QzZPfjk",
        "applyAdditionalSemantics",
        "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;",
        "applySemantics",
        "clickPointerInput",
        "Landroidx/compose/ui/input/pointer/PointerInputScope;",
        "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "handlePressInteraction",
        "Landroidx/compose/foundation/gestures/PressGestureScope;",
        "offset",
        "handlePressInteraction-d-4ec7I",
        "(Landroidx/compose/foundation/gestures/PressGestureScope;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "TraverseKey",
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

.field public static final TraverseKey:Landroidx/compose/foundation/AbstractClickableNode$TraverseKey;


# instance fields
.field private centerOffset:J

.field private final currentKeyPressInteractions:Landroidx/collection/MutableLongObjectMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableLongObjectMap<",
            "Landroidx/compose/foundation/interaction/PressInteraction$Press;",
            ">;"
        }
    .end annotation
.end field

.field private enabled:Z

.field private final focusableNode:Landroidx/compose/foundation/FocusableNode;

.field private hoverInteraction:Landroidx/compose/foundation/interaction/HoverInteraction$Enter;

.field private indicationNode:Landroidx/compose/ui/node/DelegatableNode;

.field private indicationNodeFactory:Landroidx/compose/foundation/IndicationNodeFactory;

.field private interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

.field private lazilyCreateIndication:Z

.field private onClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private onClickLabel:Ljava/lang/String;

.field private pointerInputNode:Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;

.field private pressInteraction:Landroidx/compose/foundation/interaction/PressInteraction$Press;

.field private role:Landroidx/compose/ui/semantics/Role;

.field private final shouldAutoInvalidate:Z

.field private final traverseKey:Ljava/lang/Object;

.field private userProvidedInteractionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/foundation/AbstractClickableNode$TraverseKey;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/foundation/AbstractClickableNode$TraverseKey;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/compose/foundation/AbstractClickableNode;->TraverseKey:Landroidx/compose/foundation/AbstractClickableNode$TraverseKey;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/foundation/AbstractClickableNode;->$stable:I

    return-void
.end method

.method private constructor <init>(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)V
    .locals 5
    .param p1, "interactionSource"    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .param p2, "indicationNodeFactory"    # Landroidx/compose/foundation/IndicationNodeFactory;
    .param p3, "enabled"    # Z
    .param p4, "onClickLabel"    # Ljava/lang/String;
    .param p5, "role"    # Landroidx/compose/ui/semantics/Role;
    .param p6, "onClick"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/foundation/IndicationNodeFactory;",
            "Z",
            "Ljava/lang/String;",
            "Landroidx/compose/ui/semantics/Role;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 966
    invoke-direct {p0}, Landroidx/compose/ui/node/DelegatingNode;-><init>()V

    .line 959
    iput-object p1, p0, Landroidx/compose/foundation/AbstractClickableNode;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 960
    iput-object p2, p0, Landroidx/compose/foundation/AbstractClickableNode;->indicationNodeFactory:Landroidx/compose/foundation/IndicationNodeFactory;

    .line 962
    iput-object p4, p0, Landroidx/compose/foundation/AbstractClickableNode;->onClickLabel:Ljava/lang/String;

    .line 963
    iput-object p5, p0, Landroidx/compose/foundation/AbstractClickableNode;->role:Landroidx/compose/ui/semantics/Role;

    .line 971
    iput-boolean p3, p0, Landroidx/compose/foundation/AbstractClickableNode;->enabled:Z

    .line 974
    iput-object p6, p0, Landroidx/compose/foundation/AbstractClickableNode;->onClick:Lkotlin/jvm/functions/Function0;

    .line 980
    new-instance v0, Landroidx/compose/foundation/FocusableNode;

    .line 981
    iget-object v1, p0, Landroidx/compose/foundation/AbstractClickableNode;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 982
    sget-object v2, Landroidx/compose/ui/focus/Focusability;->Companion:Landroidx/compose/ui/focus/Focusability$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/focus/Focusability$Companion;->getSystemDefined-LCbbffg()I

    move-result v2

    .line 983
    new-instance v3, Landroidx/compose/foundation/AbstractClickableNode$focusableNode$1;

    invoke-direct {v3, p0}, Landroidx/compose/foundation/AbstractClickableNode$focusableNode$1;-><init>(Ljava/lang/Object;)V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 980
    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Landroidx/compose/foundation/FocusableNode;-><init>(Landroidx/compose/foundation/interaction/MutableInteractionSource;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->focusableNode:Landroidx/compose/foundation/FocusableNode;

    .line 991
    invoke-static {}, Landroidx/collection/LongObjectMapKt;->mutableLongObjectMapOf()Landroidx/collection/MutableLongObjectMap;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->currentKeyPressInteractions:Landroidx/collection/MutableLongObjectMap;

    .line 992
    sget-object v0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->centerOffset:J

    .line 996
    iget-object v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    iput-object v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->userProvidedInteractionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 998
    invoke-direct {p0}, Landroidx/compose/foundation/AbstractClickableNode;->shouldLazilyCreateIndication()Z

    move-result v0

    iput-boolean v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->lazilyCreateIndication:Z

    .line 1314
    sget-object v0, Landroidx/compose/foundation/AbstractClickableNode;->TraverseKey:Landroidx/compose/foundation/AbstractClickableNode$TraverseKey;

    iput-object v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->traverseKey:Ljava/lang/Object;

    .line 958
    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Landroidx/compose/foundation/AbstractClickableNode;-><init>(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public static final synthetic access$delayPressInteraction(Landroidx/compose/foundation/AbstractClickableNode;)Z
    .locals 1
    .param p0, "$this"    # Landroidx/compose/foundation/AbstractClickableNode;

    .line 958
    invoke-direct {p0}, Landroidx/compose/foundation/AbstractClickableNode;->delayPressInteraction()Z

    move-result v0

    return v0
.end method

.method public static final synthetic access$emitHoverEnter(Landroidx/compose/foundation/AbstractClickableNode;)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/foundation/AbstractClickableNode;

    .line 958
    invoke-direct {p0}, Landroidx/compose/foundation/AbstractClickableNode;->emitHoverEnter()V

    return-void
.end method

.method public static final synthetic access$emitHoverExit(Landroidx/compose/foundation/AbstractClickableNode;)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/foundation/AbstractClickableNode;

    .line 958
    invoke-direct {p0}, Landroidx/compose/foundation/AbstractClickableNode;->emitHoverExit()V

    return-void
.end method

.method public static final synthetic access$getInteractionSource$p(Landroidx/compose/foundation/AbstractClickableNode;)Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/foundation/AbstractClickableNode;

    .line 958
    iget-object v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    return-object v0
.end method

.method public static final synthetic access$getPressInteraction$p(Landroidx/compose/foundation/AbstractClickableNode;)Landroidx/compose/foundation/interaction/PressInteraction$Press;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/foundation/AbstractClickableNode;

    .line 958
    iget-object v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->pressInteraction:Landroidx/compose/foundation/interaction/PressInteraction$Press;

    return-object v0
.end method

.method public static final synthetic access$onFocusChange(Landroidx/compose/foundation/AbstractClickableNode;Z)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/foundation/AbstractClickableNode;
    .param p1, "isFocused"    # Z

    .line 958
    invoke-direct {p0, p1}, Landroidx/compose/foundation/AbstractClickableNode;->onFocusChange(Z)V

    return-void
.end method

.method public static final synthetic access$setPressInteraction$p(Landroidx/compose/foundation/AbstractClickableNode;Landroidx/compose/foundation/interaction/PressInteraction$Press;)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/foundation/AbstractClickableNode;
    .param p1, "<set-?>"    # Landroidx/compose/foundation/interaction/PressInteraction$Press;

    .line 958
    iput-object p1, p0, Landroidx/compose/foundation/AbstractClickableNode;->pressInteraction:Landroidx/compose/foundation/interaction/PressInteraction$Press;

    return-void
.end method

.method private final delayPressInteraction()Z
    .locals 1

    .line 1292
    move-object v0, p0

    check-cast v0, Landroidx/compose/ui/node/TraversableNode;

    invoke-static {v0}, Landroidx/compose/foundation/ClickableKt;->hasScrollableContainer(Landroidx/compose/ui/node/TraversableNode;)Z

    move-result v0

    if-nez v0, :cond_1

    move-object v0, p0

    check-cast v0, Landroidx/compose/ui/node/DelegatableNode;

    invoke-static {v0}, Landroidx/compose/foundation/Clickable_androidKt;->isComposeRootInScrollableContainer(Landroidx/compose/ui/node/DelegatableNode;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private final emitHoverEnter()V
    .locals 9

    .line 1295
    iget-object v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->hoverInteraction:Landroidx/compose/foundation/interaction/HoverInteraction$Enter;

    if-nez v0, :cond_1

    .line 1296
    new-instance v0, Landroidx/compose/foundation/interaction/HoverInteraction$Enter;

    invoke-direct {v0}, Landroidx/compose/foundation/interaction/HoverInteraction$Enter;-><init>()V

    .line 1297
    .local v0, "interaction":Landroidx/compose/foundation/interaction/HoverInteraction$Enter;
    iget-object v1, p0, Landroidx/compose/foundation/AbstractClickableNode;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    if-eqz v1, :cond_0

    .local v1, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    const/4 v2, 0x0

    .line 1298
    .local v2, "$i$a$-let-AbstractClickableNode$emitHoverEnter$1":I
    invoke-virtual {p0}, Landroidx/compose/foundation/AbstractClickableNode;->getCoroutineScope()Lkotlinx/coroutines/CoroutineScope;

    move-result-object v3

    new-instance v4, Landroidx/compose/foundation/AbstractClickableNode$emitHoverEnter$1$1;

    const/4 v5, 0x0

    invoke-direct {v4, v1, v0, v5}, Landroidx/compose/foundation/AbstractClickableNode$emitHoverEnter$1$1;-><init>(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/HoverInteraction$Enter;Lkotlin/coroutines/Continuation;)V

    move-object v6, v4

    check-cast v6, Lkotlin/jvm/functions/Function2;

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 1297
    .end local v1    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .end local v2    # "$i$a$-let-AbstractClickableNode$emitHoverEnter$1":I
    nop

    .line 1300
    :cond_0
    iput-object v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->hoverInteraction:Landroidx/compose/foundation/interaction/HoverInteraction$Enter;

    .line 1302
    .end local v0    # "interaction":Landroidx/compose/foundation/interaction/HoverInteraction$Enter;
    :cond_1
    return-void
.end method

.method private final emitHoverExit()V
    .locals 12

    .line 1305
    iget-object v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->hoverInteraction:Landroidx/compose/foundation/interaction/HoverInteraction$Enter;

    if-eqz v0, :cond_1

    .local v0, "oldValue":Landroidx/compose/foundation/interaction/HoverInteraction$Enter;
    const/4 v1, 0x0

    .line 1306
    .local v1, "$i$a$-let-AbstractClickableNode$emitHoverExit$1":I
    new-instance v2, Landroidx/compose/foundation/interaction/HoverInteraction$Exit;

    invoke-direct {v2, v0}, Landroidx/compose/foundation/interaction/HoverInteraction$Exit;-><init>(Landroidx/compose/foundation/interaction/HoverInteraction$Enter;)V

    .line 1307
    .local v2, "interaction":Landroidx/compose/foundation/interaction/HoverInteraction$Exit;
    iget-object v3, p0, Landroidx/compose/foundation/AbstractClickableNode;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    .local v3, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    const/4 v5, 0x0

    .line 1308
    .local v5, "$i$a$-let-AbstractClickableNode$emitHoverExit$1$1":I
    invoke-virtual {p0}, Landroidx/compose/foundation/AbstractClickableNode;->getCoroutineScope()Lkotlinx/coroutines/CoroutineScope;

    move-result-object v6

    new-instance v7, Landroidx/compose/foundation/AbstractClickableNode$emitHoverExit$1$1$1;

    invoke-direct {v7, v3, v2, v4}, Landroidx/compose/foundation/AbstractClickableNode$emitHoverExit$1$1$1;-><init>(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/HoverInteraction$Exit;Lkotlin/coroutines/Continuation;)V

    move-object v9, v7

    check-cast v9, Lkotlin/jvm/functions/Function2;

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v6 .. v11}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 1307
    .end local v3    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .end local v5    # "$i$a$-let-AbstractClickableNode$emitHoverExit$1$1":I
    nop

    .line 1310
    :cond_0
    iput-object v4, p0, Landroidx/compose/foundation/AbstractClickableNode;->hoverInteraction:Landroidx/compose/foundation/interaction/HoverInteraction$Enter;

    .line 1311
    nop

    .line 1305
    .end local v0    # "oldValue":Landroidx/compose/foundation/interaction/HoverInteraction$Enter;
    .end local v1    # "$i$a$-let-AbstractClickableNode$emitHoverExit$1":I
    .end local v2    # "interaction":Landroidx/compose/foundation/interaction/HoverInteraction$Exit;
    nop

    .line 1312
    :cond_1
    return-void
.end method

.method private final initializeIndicationAndInteractionSourceIfNeeded()V
    .locals 4

    .line 1129
    iget-object v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->indicationNode:Landroidx/compose/ui/node/DelegatableNode;

    if-eqz v0, :cond_0

    return-void

    .line 1130
    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->indicationNodeFactory:Landroidx/compose/foundation/IndicationNodeFactory;

    if-eqz v0, :cond_2

    .local v0, "indicationNodeFactory":Landroidx/compose/foundation/IndicationNodeFactory;
    const/4 v1, 0x0

    .line 1131
    .local v1, "$i$a$-let-AbstractClickableNode$initializeIndicationAndInteractionSourceIfNeeded$1":I
    iget-object v2, p0, Landroidx/compose/foundation/AbstractClickableNode;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    if-nez v2, :cond_1

    .line 1132
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v2

    iput-object v2, p0, Landroidx/compose/foundation/AbstractClickableNode;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 1134
    :cond_1
    iget-object v2, p0, Landroidx/compose/foundation/AbstractClickableNode;->focusableNode:Landroidx/compose/foundation/FocusableNode;

    iget-object v3, p0, Landroidx/compose/foundation/AbstractClickableNode;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    invoke-virtual {v2, v3}, Landroidx/compose/foundation/FocusableNode;->update(Landroidx/compose/foundation/interaction/MutableInteractionSource;)V

    .line 1135
    iget-object v2, p0, Landroidx/compose/foundation/AbstractClickableNode;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v2, Landroidx/compose/foundation/interaction/InteractionSource;

    invoke-interface {v0, v2}, Landroidx/compose/foundation/IndicationNodeFactory;->create(Landroidx/compose/foundation/interaction/InteractionSource;)Landroidx/compose/ui/node/DelegatableNode;

    move-result-object v2

    .line 1136
    .local v2, "node":Landroidx/compose/ui/node/DelegatableNode;
    invoke-virtual {p0, v2}, Landroidx/compose/foundation/AbstractClickableNode;->delegate(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/DelegatableNode;

    .line 1137
    iput-object v2, p0, Landroidx/compose/foundation/AbstractClickableNode;->indicationNode:Landroidx/compose/ui/node/DelegatableNode;

    .line 1138
    nop

    .line 1130
    .end local v0    # "indicationNodeFactory":Landroidx/compose/foundation/IndicationNodeFactory;
    .end local v1    # "$i$a$-let-AbstractClickableNode$initializeIndicationAndInteractionSourceIfNeeded$1":I
    .end local v2    # "node":Landroidx/compose/ui/node/DelegatableNode;
    nop

    .line 1139
    :cond_2
    return-void
.end method

.method private final onFocusChange(Z)V
    .locals 27
    .param p1, "isFocused"    # Z

    .line 1112
    move-object/from16 v0, p0

    if-eqz p1, :cond_0

    .line 1113
    invoke-direct {v0}, Landroidx/compose/foundation/AbstractClickableNode;->initializeIndicationAndInteractionSourceIfNeeded()V

    goto/16 :goto_5

    .line 1117
    :cond_0
    iget-object v1, v0, Landroidx/compose/foundation/AbstractClickableNode;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    if-eqz v1, :cond_8

    .line 1118
    iget-object v1, v0, Landroidx/compose/foundation/AbstractClickableNode;->currentKeyPressInteractions:Landroidx/collection/MutableLongObjectMap;

    check-cast v1, Landroidx/collection/LongObjectMap;

    .local v1, "this_$iv":Landroidx/collection/LongObjectMap;
    const/4 v2, 0x0

    .line 1353
    .local v2, "$i$f$forEachValue":I
    iget-object v3, v1, Landroidx/collection/LongObjectMap;->values:[Ljava/lang/Object;

    .line 1355
    .local v3, "v$iv":[Ljava/lang/Object;
    move-object v4, v1

    .local v4, "this_$iv$iv":Landroidx/collection/LongObjectMap;
    const/4 v5, 0x0

    .line 1356
    .local v5, "$i$f$forEachIndexed":I
    iget-object v6, v4, Landroidx/collection/LongObjectMap;->metadata:[J

    .line 1357
    .local v6, "m$iv$iv":[J
    array-length v7, v6

    add-int/lit8 v7, v7, -0x2

    .line 1359
    .local v7, "lastIndex$iv$iv":I
    const/4 v8, 0x0

    .local v8, "i$iv$iv":I
    if-gt v8, v7, :cond_5

    .line 1360
    :goto_0
    aget-wide v9, v6, v8

    .line 1361
    .local v9, "slot$iv$iv":J
    move-wide v11, v9

    .local v11, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/4 v13, 0x0

    .line 1362
    .local v13, "$i$f$maskEmptyOrDeleted":I
    not-long v14, v11

    const/16 v16, 0x7

    shl-long v14, v14, v16

    and-long/2addr v14, v11

    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v11, v14, v16

    .line 1361
    .end local v11    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v13    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v11, v11, v16

    if-eqz v11, :cond_4

    .line 1363
    sub-int v11, v8, v7

    not-int v11, v11

    ushr-int/lit8 v11, v11, 0x1f

    const/16 v12, 0x8

    rsub-int/lit8 v11, v11, 0x8

    .line 1364
    .local v11, "bitCount$iv$iv":I
    const/4 v13, 0x0

    .local v13, "j$iv$iv":I
    :goto_1
    if-ge v13, v11, :cond_3

    .line 1365
    const-wide/16 v14, 0xff

    and-long/2addr v14, v9

    .local v14, "value$iv$iv$iv":J
    const/16 v16, 0x0

    .line 1366
    .local v16, "$i$f$isFull":I
    const-wide/16 v17, 0x80

    cmp-long v17, v14, v17

    if-gez v17, :cond_1

    const/16 v17, 0x1

    goto :goto_2

    :cond_1
    const/16 v17, 0x0

    .line 1365
    .end local v14    # "value$iv$iv$iv":J
    .end local v16    # "$i$f$isFull":I
    :goto_2
    if-eqz v17, :cond_2

    .line 1367
    shl-int/lit8 v14, v8, 0x3

    add-int/2addr v14, v13

    .line 1368
    .local v14, "index$iv$iv":I
    move v15, v14

    .local v15, "index$iv":I
    const/16 v16, 0x0

    .line 1355
    .local v16, "$i$a$-forEachIndexed-LongObjectMap$forEachValue$1$iv":I
    aget-object v17, v3, v15

    move/from16 v18, v12

    move-object/from16 v12, v17

    check-cast v12, Landroidx/compose/foundation/interaction/PressInteraction$Press;

    .local v12, "it":Landroidx/compose/foundation/interaction/PressInteraction$Press;
    const/16 v17, 0x0

    .line 1119
    .local v17, "$i$a$-forEachValue-AbstractClickableNode$onFocusChange$1":I
    invoke-virtual {v0}, Landroidx/compose/foundation/AbstractClickableNode;->getCoroutineScope()Lkotlinx/coroutines/CoroutineScope;

    move-result-object v19

    move-object/from16 v25, v1

    .end local v1    # "this_$iv":Landroidx/collection/LongObjectMap;
    .local v25, "this_$iv":Landroidx/collection/LongObjectMap;
    new-instance v1, Landroidx/compose/foundation/AbstractClickableNode$onFocusChange$1$1;

    move/from16 v26, v2

    .end local v2    # "$i$f$forEachValue":I
    .local v26, "$i$f$forEachValue":I
    const/4 v2, 0x0

    invoke-direct {v1, v0, v12, v2}, Landroidx/compose/foundation/AbstractClickableNode$onFocusChange$1$1;-><init>(Landroidx/compose/foundation/AbstractClickableNode;Landroidx/compose/foundation/interaction/PressInteraction$Press;Lkotlin/coroutines/Continuation;)V

    move-object/from16 v22, v1

    check-cast v22, Lkotlin/jvm/functions/Function2;

    const/16 v23, 0x3

    const/16 v24, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v19 .. v24}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 1120
    nop

    .line 1355
    .end local v12    # "it":Landroidx/compose/foundation/interaction/PressInteraction$Press;
    .end local v17    # "$i$a$-forEachValue-AbstractClickableNode$onFocusChange$1":I
    nop

    .line 1368
    .end local v15    # "index$iv":I
    .end local v16    # "$i$a$-forEachIndexed-LongObjectMap$forEachValue$1$iv":I
    goto :goto_3

    .line 1365
    .end local v14    # "index$iv$iv":I
    .end local v25    # "this_$iv":Landroidx/collection/LongObjectMap;
    .end local v26    # "$i$f$forEachValue":I
    .restart local v1    # "this_$iv":Landroidx/collection/LongObjectMap;
    .restart local v2    # "$i$f$forEachValue":I
    :cond_2
    move-object/from16 v25, v1

    move/from16 v26, v2

    move/from16 v18, v12

    .line 1370
    .end local v1    # "this_$iv":Landroidx/collection/LongObjectMap;
    .end local v2    # "$i$f$forEachValue":I
    .restart local v25    # "this_$iv":Landroidx/collection/LongObjectMap;
    .restart local v26    # "$i$f$forEachValue":I
    :goto_3
    shr-long v9, v9, v18

    .line 1364
    add-int/lit8 v13, v13, 0x1

    move/from16 v12, v18

    move-object/from16 v1, v25

    move/from16 v2, v26

    goto :goto_1

    .end local v25    # "this_$iv":Landroidx/collection/LongObjectMap;
    .end local v26    # "$i$f$forEachValue":I
    .restart local v1    # "this_$iv":Landroidx/collection/LongObjectMap;
    .restart local v2    # "$i$f$forEachValue":I
    :cond_3
    move-object/from16 v25, v1

    move/from16 v26, v2

    move/from16 v18, v12

    .line 1372
    .end local v1    # "this_$iv":Landroidx/collection/LongObjectMap;
    .end local v2    # "$i$f$forEachValue":I
    .end local v13    # "j$iv$iv":I
    .restart local v25    # "this_$iv":Landroidx/collection/LongObjectMap;
    .restart local v26    # "$i$f$forEachValue":I
    move/from16 v1, v18

    if-ne v11, v1, :cond_7

    goto :goto_4

    .line 1361
    .end local v11    # "bitCount$iv$iv":I
    .end local v25    # "this_$iv":Landroidx/collection/LongObjectMap;
    .end local v26    # "$i$f$forEachValue":I
    .restart local v1    # "this_$iv":Landroidx/collection/LongObjectMap;
    .restart local v2    # "$i$f$forEachValue":I
    :cond_4
    move-object/from16 v25, v1

    move/from16 v26, v2

    .line 1359
    .end local v1    # "this_$iv":Landroidx/collection/LongObjectMap;
    .end local v2    # "$i$f$forEachValue":I
    .end local v9    # "slot$iv$iv":J
    .restart local v25    # "this_$iv":Landroidx/collection/LongObjectMap;
    .restart local v26    # "$i$f$forEachValue":I
    :goto_4
    if-eq v8, v7, :cond_6

    add-int/lit8 v8, v8, 0x1

    move-object/from16 v1, v25

    move/from16 v2, v26

    goto/16 :goto_0

    .end local v25    # "this_$iv":Landroidx/collection/LongObjectMap;
    .end local v26    # "$i$f$forEachValue":I
    .restart local v1    # "this_$iv":Landroidx/collection/LongObjectMap;
    .restart local v2    # "$i$f$forEachValue":I
    :cond_5
    move-object/from16 v25, v1

    move/from16 v26, v2

    .line 1375
    .end local v1    # "this_$iv":Landroidx/collection/LongObjectMap;
    .end local v2    # "$i$f$forEachValue":I
    .end local v8    # "i$iv$iv":I
    .restart local v25    # "this_$iv":Landroidx/collection/LongObjectMap;
    .restart local v26    # "$i$f$forEachValue":I
    :cond_6
    nop

    .line 1376
    .end local v4    # "this_$iv$iv":Landroidx/collection/LongObjectMap;
    .end local v5    # "$i$f$forEachIndexed":I
    .end local v6    # "m$iv$iv":[J
    .end local v7    # "lastIndex$iv$iv":I
    :cond_7
    nop

    .line 1122
    .end local v3    # "v$iv":[Ljava/lang/Object;
    .end local v25    # "this_$iv":Landroidx/collection/LongObjectMap;
    .end local v26    # "$i$f$forEachValue":I
    :cond_8
    iget-object v1, v0, Landroidx/compose/foundation/AbstractClickableNode;->currentKeyPressInteractions:Landroidx/collection/MutableLongObjectMap;

    invoke-virtual {v1}, Landroidx/collection/MutableLongObjectMap;->clear()V

    .line 1123
    invoke-virtual {v0}, Landroidx/compose/foundation/AbstractClickableNode;->onCancelKeyInput()V

    .line 1125
    :goto_5
    return-void
.end method

.method private final shouldLazilyCreateIndication()Z
    .locals 1

    .line 1001
    iget-object v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->userProvidedInteractionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->indicationNodeFactory:Landroidx/compose/foundation/IndicationNodeFactory;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public applyAdditionalSemantics(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V
    .locals 0
    .param p1, "$this$applyAdditionalSemantics"    # Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;

    .line 1009
    return-void
.end method

.method public final applySemantics(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V
    .locals 2
    .param p1, "$this$applySemantics"    # Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;

    .line 1232
    iget-object v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->role:Landroidx/compose/ui/semantics/Role;

    if-eqz v0, :cond_0

    .line 1233
    iget-object v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->role:Landroidx/compose/ui/semantics/Role;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroidx/compose/ui/semantics/Role;->unbox-impl()I

    move-result v0

    invoke-static {p1, v0}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->setRole-kuIjeqM(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;I)V

    .line 1240
    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->onClickLabel:Ljava/lang/String;

    .line 1235
    nop

    .line 1240
    nop

    .line 1235
    new-instance v1, Landroidx/compose/foundation/AbstractClickableNode$applySemantics$1;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/AbstractClickableNode$applySemantics$1;-><init>(Landroidx/compose/foundation/AbstractClickableNode;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-static {p1, v0, v1}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->onClick(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 1242
    iget-boolean v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->enabled:Z

    if-eqz v0, :cond_1

    .line 1243
    iget-object v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->focusableNode:Landroidx/compose/foundation/FocusableNode;

    .line 1328
    .local v0, "$this$applySemantics_u24lambda_u2410":Landroidx/compose/foundation/FocusableNode;
    const/4 v1, 0x0

    .line 1243
    .local v1, "$i$a$-with-AbstractClickableNode$applySemantics$2":I
    invoke-virtual {v0, p1}, Landroidx/compose/foundation/FocusableNode;->applySemantics(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V

    .end local v0    # "$this$applySemantics_u24lambda_u2410":Landroidx/compose/foundation/FocusableNode;
    .end local v1    # "$i$a$-with-AbstractClickableNode$applySemantics$2":I
    goto :goto_0

    .line 1245
    :cond_1
    invoke-static {p1}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->disabled(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V

    .line 1247
    :goto_0
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/AbstractClickableNode;->applyAdditionalSemantics(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V

    .line 1248
    return-void
.end method

.method public abstract clickPointerInput(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/PointerInputScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method protected final disposeInteractions()V
    .locals 22

    .line 1093
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/foundation/AbstractClickableNode;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    if-eqz v1, :cond_9

    .local v1, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    const/4 v2, 0x0

    .line 1094
    .local v2, "$i$a$-let-AbstractClickableNode$disposeInteractions$1":I
    iget-object v3, v0, Landroidx/compose/foundation/AbstractClickableNode;->pressInteraction:Landroidx/compose/foundation/interaction/PressInteraction$Press;

    if-eqz v3, :cond_0

    .local v3, "oldValue":Landroidx/compose/foundation/interaction/PressInteraction$Press;
    const/4 v4, 0x0

    .line 1095
    .local v4, "$i$a$-let-AbstractClickableNode$disposeInteractions$1$1":I
    new-instance v5, Landroidx/compose/foundation/interaction/PressInteraction$Cancel;

    invoke-direct {v5, v3}, Landroidx/compose/foundation/interaction/PressInteraction$Cancel;-><init>(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V

    .line 1096
    .local v5, "interaction":Landroidx/compose/foundation/interaction/PressInteraction$Cancel;
    move-object v6, v5

    check-cast v6, Landroidx/compose/foundation/interaction/Interaction;

    invoke-interface {v1, v6}, Landroidx/compose/foundation/interaction/MutableInteractionSource;->tryEmit(Landroidx/compose/foundation/interaction/Interaction;)Z

    .line 1094
    .end local v3    # "oldValue":Landroidx/compose/foundation/interaction/PressInteraction$Press;
    .end local v4    # "$i$a$-let-AbstractClickableNode$disposeInteractions$1$1":I
    .end local v5    # "interaction":Landroidx/compose/foundation/interaction/PressInteraction$Cancel;
    nop

    .line 1098
    :cond_0
    iget-object v3, v0, Landroidx/compose/foundation/AbstractClickableNode;->hoverInteraction:Landroidx/compose/foundation/interaction/HoverInteraction$Enter;

    if-eqz v3, :cond_1

    .local v3, "oldValue":Landroidx/compose/foundation/interaction/HoverInteraction$Enter;
    const/4 v4, 0x0

    .line 1099
    .local v4, "$i$a$-let-AbstractClickableNode$disposeInteractions$1$2":I
    new-instance v5, Landroidx/compose/foundation/interaction/HoverInteraction$Exit;

    invoke-direct {v5, v3}, Landroidx/compose/foundation/interaction/HoverInteraction$Exit;-><init>(Landroidx/compose/foundation/interaction/HoverInteraction$Enter;)V

    .line 1100
    .local v5, "interaction":Landroidx/compose/foundation/interaction/HoverInteraction$Exit;
    move-object v6, v5

    check-cast v6, Landroidx/compose/foundation/interaction/Interaction;

    invoke-interface {v1, v6}, Landroidx/compose/foundation/interaction/MutableInteractionSource;->tryEmit(Landroidx/compose/foundation/interaction/Interaction;)Z

    .line 1098
    .end local v3    # "oldValue":Landroidx/compose/foundation/interaction/HoverInteraction$Enter;
    .end local v4    # "$i$a$-let-AbstractClickableNode$disposeInteractions$1$2":I
    .end local v5    # "interaction":Landroidx/compose/foundation/interaction/HoverInteraction$Exit;
    nop

    .line 1102
    :cond_1
    iget-object v3, v0, Landroidx/compose/foundation/AbstractClickableNode;->currentKeyPressInteractions:Landroidx/collection/MutableLongObjectMap;

    check-cast v3, Landroidx/collection/LongObjectMap;

    .local v3, "this_$iv":Landroidx/collection/LongObjectMap;
    const/4 v4, 0x0

    .line 1329
    .local v4, "$i$f$forEachValue":I
    iget-object v5, v3, Landroidx/collection/LongObjectMap;->values:[Ljava/lang/Object;

    .line 1331
    .local v5, "v$iv":[Ljava/lang/Object;
    move-object v6, v3

    .local v6, "this_$iv$iv":Landroidx/collection/LongObjectMap;
    const/4 v7, 0x0

    .line 1332
    .local v7, "$i$f$forEachIndexed":I
    iget-object v8, v6, Landroidx/collection/LongObjectMap;->metadata:[J

    .line 1333
    .local v8, "m$iv$iv":[J
    array-length v9, v8

    add-int/lit8 v9, v9, -0x2

    .line 1335
    .local v9, "lastIndex$iv$iv":I
    const/4 v10, 0x0

    .local v10, "i$iv$iv":I
    if-gt v10, v9, :cond_6

    .line 1336
    :goto_0
    aget-wide v11, v8, v10

    .line 1337
    .local v11, "slot$iv$iv":J
    move-wide v13, v11

    .local v13, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/4 v15, 0x0

    .line 1338
    .local v15, "$i$f$maskEmptyOrDeleted":I
    move/from16 v16, v2

    move-object/from16 v17, v3

    .end local v2    # "$i$a$-let-AbstractClickableNode$disposeInteractions$1":I
    .end local v3    # "this_$iv":Landroidx/collection/LongObjectMap;
    .local v16, "$i$a$-let-AbstractClickableNode$disposeInteractions$1":I
    .local v17, "this_$iv":Landroidx/collection/LongObjectMap;
    not-long v2, v13

    const/16 v18, 0x7

    shl-long v2, v2, v18

    and-long/2addr v2, v13

    const-wide v18, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v2, v2, v18

    .line 1337
    .end local v13    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v15    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v2, v2, v18

    if-eqz v2, :cond_5

    .line 1339
    sub-int v2, v10, v9

    not-int v2, v2

    ushr-int/lit8 v2, v2, 0x1f

    const/16 v3, 0x8

    rsub-int/lit8 v2, v2, 0x8

    .line 1340
    .local v2, "bitCount$iv$iv":I
    const/4 v13, 0x0

    .local v13, "j$iv$iv":I
    :goto_1
    if-ge v13, v2, :cond_4

    .line 1341
    const-wide/16 v14, 0xff

    and-long/2addr v14, v11

    .local v14, "value$iv$iv$iv":J
    const/16 v18, 0x0

    .line 1342
    .local v18, "$i$f$isFull":I
    const-wide/16 v19, 0x80

    cmp-long v19, v14, v19

    if-gez v19, :cond_2

    const/16 v19, 0x1

    goto :goto_2

    :cond_2
    const/16 v19, 0x0

    .line 1341
    .end local v14    # "value$iv$iv$iv":J
    .end local v18    # "$i$f$isFull":I
    :goto_2
    if-eqz v19, :cond_3

    .line 1343
    shl-int/lit8 v14, v10, 0x3

    add-int/2addr v14, v13

    .line 1344
    .local v14, "index$iv$iv":I
    move v15, v14

    .local v15, "index$iv":I
    const/16 v18, 0x0

    .line 1331
    .local v18, "$i$a$-forEachIndexed-LongObjectMap$forEachValue$1$iv":I
    aget-object v19, v5, v15

    move/from16 v20, v3

    move-object/from16 v3, v19

    check-cast v3, Landroidx/compose/foundation/interaction/PressInteraction$Press;

    .local v3, "it":Landroidx/compose/foundation/interaction/PressInteraction$Press;
    const/16 v19, 0x0

    .line 1103
    .local v19, "$i$a$-forEachValue-AbstractClickableNode$disposeInteractions$1$3":I
    move/from16 v21, v4

    .end local v4    # "$i$f$forEachValue":I
    .local v21, "$i$f$forEachValue":I
    new-instance v4, Landroidx/compose/foundation/interaction/PressInteraction$Cancel;

    invoke-direct {v4, v3}, Landroidx/compose/foundation/interaction/PressInteraction$Cancel;-><init>(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V

    check-cast v4, Landroidx/compose/foundation/interaction/Interaction;

    invoke-interface {v1, v4}, Landroidx/compose/foundation/interaction/MutableInteractionSource;->tryEmit(Landroidx/compose/foundation/interaction/Interaction;)Z

    .line 1104
    nop

    .line 1331
    .end local v3    # "it":Landroidx/compose/foundation/interaction/PressInteraction$Press;
    .end local v19    # "$i$a$-forEachValue-AbstractClickableNode$disposeInteractions$1$3":I
    nop

    .line 1344
    .end local v15    # "index$iv":I
    .end local v18    # "$i$a$-forEachIndexed-LongObjectMap$forEachValue$1$iv":I
    goto :goto_3

    .line 1341
    .end local v14    # "index$iv$iv":I
    .end local v21    # "$i$f$forEachValue":I
    .restart local v4    # "$i$f$forEachValue":I
    :cond_3
    move/from16 v20, v3

    move/from16 v21, v4

    .line 1346
    .end local v4    # "$i$f$forEachValue":I
    .restart local v21    # "$i$f$forEachValue":I
    :goto_3
    shr-long v11, v11, v20

    .line 1340
    add-int/lit8 v13, v13, 0x1

    move/from16 v3, v20

    move/from16 v4, v21

    goto :goto_1

    .end local v21    # "$i$f$forEachValue":I
    .restart local v4    # "$i$f$forEachValue":I
    :cond_4
    move/from16 v20, v3

    move/from16 v21, v4

    .line 1348
    .end local v4    # "$i$f$forEachValue":I
    .end local v13    # "j$iv$iv":I
    .restart local v21    # "$i$f$forEachValue":I
    if-ne v2, v3, :cond_8

    goto :goto_4

    .line 1337
    .end local v2    # "bitCount$iv$iv":I
    .end local v21    # "$i$f$forEachValue":I
    .restart local v4    # "$i$f$forEachValue":I
    :cond_5
    move/from16 v21, v4

    .line 1335
    .end local v4    # "$i$f$forEachValue":I
    .end local v11    # "slot$iv$iv":J
    .restart local v21    # "$i$f$forEachValue":I
    :goto_4
    if-eq v10, v9, :cond_7

    add-int/lit8 v10, v10, 0x1

    move/from16 v2, v16

    move-object/from16 v3, v17

    move/from16 v4, v21

    goto :goto_0

    .end local v16    # "$i$a$-let-AbstractClickableNode$disposeInteractions$1":I
    .end local v17    # "this_$iv":Landroidx/collection/LongObjectMap;
    .end local v21    # "$i$f$forEachValue":I
    .local v2, "$i$a$-let-AbstractClickableNode$disposeInteractions$1":I
    .local v3, "this_$iv":Landroidx/collection/LongObjectMap;
    .restart local v4    # "$i$f$forEachValue":I
    :cond_6
    move/from16 v16, v2

    move-object/from16 v17, v3

    move/from16 v21, v4

    .line 1351
    .end local v2    # "$i$a$-let-AbstractClickableNode$disposeInteractions$1":I
    .end local v3    # "this_$iv":Landroidx/collection/LongObjectMap;
    .end local v4    # "$i$f$forEachValue":I
    .end local v10    # "i$iv$iv":I
    .restart local v16    # "$i$a$-let-AbstractClickableNode$disposeInteractions$1":I
    .restart local v17    # "this_$iv":Landroidx/collection/LongObjectMap;
    .restart local v21    # "$i$f$forEachValue":I
    :cond_7
    nop

    .line 1352
    .end local v6    # "this_$iv$iv":Landroidx/collection/LongObjectMap;
    .end local v7    # "$i$f$forEachIndexed":I
    .end local v8    # "m$iv$iv":[J
    .end local v9    # "lastIndex$iv$iv":I
    :cond_8
    nop

    .line 1105
    .end local v5    # "v$iv":[Ljava/lang/Object;
    .end local v17    # "this_$iv":Landroidx/collection/LongObjectMap;
    .end local v21    # "$i$f$forEachValue":I
    nop

    .line 1093
    .end local v1    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .end local v16    # "$i$a$-let-AbstractClickableNode$disposeInteractions$1":I
    nop

    .line 1106
    :cond_9
    const/4 v1, 0x0

    iput-object v1, v0, Landroidx/compose/foundation/AbstractClickableNode;->pressInteraction:Landroidx/compose/foundation/interaction/PressInteraction$Press;

    .line 1107
    iput-object v1, v0, Landroidx/compose/foundation/AbstractClickableNode;->hoverInteraction:Landroidx/compose/foundation/interaction/HoverInteraction$Enter;

    .line 1108
    iget-object v1, v0, Landroidx/compose/foundation/AbstractClickableNode;->currentKeyPressInteractions:Landroidx/collection/MutableLongObjectMap;

    invoke-virtual {v1}, Landroidx/collection/MutableLongObjectMap;->clear()V

    .line 1109
    return-void
.end method

.method protected final getEnabled()Z
    .locals 1

    .line 971
    iget-boolean v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->enabled:Z

    return v0
.end method

.method protected final getOnClick()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 974
    iget-object v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->onClick:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public final getShouldAutoInvalidate()Z
    .locals 1

    .line 977
    iget-boolean v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->shouldAutoInvalidate:Z

    return v0
.end method

.method public final getShouldMergeDescendantSemantics()Z
    .locals 1

    .line 1229
    const/4 v0, 0x1

    return v0
.end method

.method public getTraverseKey()Ljava/lang/Object;
    .locals 1

    .line 1314
    iget-object v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->traverseKey:Ljava/lang/Object;

    return-object v0
.end method

.method protected final handlePressInteraction-d-4ec7I(Landroidx/compose/foundation/gestures/PressGestureScope;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .param p1, "$this$handlePressInteraction_u2dd_u2d4ec7I"    # Landroidx/compose/foundation/gestures/PressGestureScope;
    .param p2, "offset"    # J
    .param p4, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/PressGestureScope;",
            "J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1253
    iget-object v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    if-eqz v0, :cond_1

    move-object v5, v0

    .local v5, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    const/4 v0, 0x0

    .line 1254
    .local v0, "$i$a$-let-AbstractClickableNode$handlePressInteraction$2":I
    new-instance v1, Landroidx/compose/foundation/AbstractClickableNode$handlePressInteraction$2$1;

    const/4 v7, 0x0

    move-object v6, p0

    move-object v2, p1

    move-wide v3, p2

    .end local p1    # "$this$handlePressInteraction_u2dd_u2d4ec7I":Landroidx/compose/foundation/gestures/PressGestureScope;
    .end local p2    # "offset":J
    .local v2, "$this$handlePressInteraction_u2dd_u2d4ec7I":Landroidx/compose/foundation/gestures/PressGestureScope;
    .local v3, "offset":J
    invoke-direct/range {v1 .. v7}, Landroidx/compose/foundation/AbstractClickableNode$handlePressInteraction$2$1;-><init>(Landroidx/compose/foundation/gestures/PressGestureScope;JLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/AbstractClickableNode;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v1, p4}, Lkotlinx/coroutines/CoroutineScopeKt;->coroutineScope(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    .line 1288
    :cond_0
    nop

    .end local v0    # "$i$a$-let-AbstractClickableNode$handlePressInteraction$2":I
    .end local v5    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    goto :goto_0

    .line 1253
    .end local v2    # "$this$handlePressInteraction_u2dd_u2d4ec7I":Landroidx/compose/foundation/gestures/PressGestureScope;
    .end local v3    # "offset":J
    .restart local p1    # "$this$handlePressInteraction_u2dd_u2d4ec7I":Landroidx/compose/foundation/gestures/PressGestureScope;
    .restart local p2    # "offset":J
    :cond_1
    move-object v2, p1

    move-wide v3, p2

    .end local p1    # "$this$handlePressInteraction_u2dd_u2d4ec7I":Landroidx/compose/foundation/gestures/PressGestureScope;
    .end local p2    # "offset":J
    .restart local v2    # "$this$handlePressInteraction_u2dd_u2d4ec7I":Landroidx/compose/foundation/gestures/PressGestureScope;
    .restart local v3    # "offset":J
    :goto_0
    nop

    .line 1289
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final onAttach()V
    .locals 1

    .line 1071
    iget-boolean v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->lazilyCreateIndication:Z

    if-nez v0, :cond_0

    .line 1072
    invoke-direct {p0}, Landroidx/compose/foundation/AbstractClickableNode;->initializeIndicationAndInteractionSourceIfNeeded()V

    .line 1074
    :cond_0
    iget-boolean v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->enabled:Z

    if-eqz v0, :cond_1

    .line 1075
    iget-object v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->focusableNode:Landroidx/compose/foundation/FocusableNode;

    check-cast v0, Landroidx/compose/ui/node/DelegatableNode;

    invoke-virtual {p0, v0}, Landroidx/compose/foundation/AbstractClickableNode;->delegate(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/DelegatableNode;

    .line 1077
    :cond_1
    return-void
.end method

.method protected onCancelKeyInput()V
    .locals 0

    .line 1224
    return-void
.end method

.method public final onCancelPointerInput()V
    .locals 6

    .line 1164
    iget-object v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    if-eqz v0, :cond_1

    .local v0, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    const/4 v1, 0x0

    .line 1165
    .local v1, "$i$a$-let-AbstractClickableNode$onCancelPointerInput$1":I
    iget-object v2, p0, Landroidx/compose/foundation/AbstractClickableNode;->hoverInteraction:Landroidx/compose/foundation/interaction/HoverInteraction$Enter;

    if-eqz v2, :cond_0

    .local v2, "oldValue":Landroidx/compose/foundation/interaction/HoverInteraction$Enter;
    const/4 v3, 0x0

    .line 1166
    .local v3, "$i$a$-let-AbstractClickableNode$onCancelPointerInput$1$1":I
    new-instance v4, Landroidx/compose/foundation/interaction/HoverInteraction$Exit;

    invoke-direct {v4, v2}, Landroidx/compose/foundation/interaction/HoverInteraction$Exit;-><init>(Landroidx/compose/foundation/interaction/HoverInteraction$Enter;)V

    .line 1167
    .local v4, "interaction":Landroidx/compose/foundation/interaction/HoverInteraction$Exit;
    move-object v5, v4

    check-cast v5, Landroidx/compose/foundation/interaction/Interaction;

    invoke-interface {v0, v5}, Landroidx/compose/foundation/interaction/MutableInteractionSource;->tryEmit(Landroidx/compose/foundation/interaction/Interaction;)Z

    .line 1165
    .end local v2    # "oldValue":Landroidx/compose/foundation/interaction/HoverInteraction$Enter;
    .end local v3    # "$i$a$-let-AbstractClickableNode$onCancelPointerInput$1$1":I
    .end local v4    # "interaction":Landroidx/compose/foundation/interaction/HoverInteraction$Exit;
    nop

    .line 1168
    :cond_0
    nop

    .line 1164
    .end local v0    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .end local v1    # "$i$a$-let-AbstractClickableNode$onCancelPointerInput$1":I
    nop

    .line 1170
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->hoverInteraction:Landroidx/compose/foundation/interaction/HoverInteraction$Enter;

    .line 1171
    iget-object v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->pointerInputNode:Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;->onCancelPointerInput()V

    .line 1172
    :cond_2
    return-void
.end method

.method protected abstract onClickKeyDownEvent-ZmokQxo(Landroid/view/KeyEvent;)Z
.end method

.method protected abstract onClickKeyUpEvent-ZmokQxo(Landroid/view/KeyEvent;)Z
.end method

.method public final onDetach()V
    .locals 3

    .line 1080
    invoke-virtual {p0}, Landroidx/compose/foundation/AbstractClickableNode;->disposeInteractions()V

    .line 1084
    iget-object v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->userProvidedInteractionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 1085
    iput-object v1, p0, Landroidx/compose/foundation/AbstractClickableNode;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 1088
    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->indicationNode:Landroidx/compose/ui/node/DelegatableNode;

    if-eqz v0, :cond_1

    .line 1328
    .local v0, "it":Landroidx/compose/ui/node/DelegatableNode;
    const/4 v2, 0x0

    .line 1088
    .local v2, "$i$a$-let-AbstractClickableNode$onDetach$1":I
    invoke-virtual {p0, v0}, Landroidx/compose/foundation/AbstractClickableNode;->undelegate(Landroidx/compose/ui/node/DelegatableNode;)V

    .line 1089
    .end local v0    # "it":Landroidx/compose/ui/node/DelegatableNode;
    .end local v2    # "$i$a$-let-AbstractClickableNode$onDetach$1":I
    :cond_1
    iput-object v1, p0, Landroidx/compose/foundation/AbstractClickableNode;->indicationNode:Landroidx/compose/ui/node/DelegatableNode;

    .line 1090
    return-void
.end method

.method public final onKeyEvent-ZmokQxo(Landroid/view/KeyEvent;)Z
    .locals 14
    .param p1, "event"    # Landroid/view/KeyEvent;

    .line 1178
    invoke-direct {p0}, Landroidx/compose/foundation/AbstractClickableNode;->initializeIndicationAndInteractionSourceIfNeeded()V

    .line 1179
    invoke-static {p1}, Landroidx/compose/ui/input/key/KeyEvent_androidKt;->getKey-ZmokQxo(Landroid/view/KeyEvent;)J

    move-result-wide v0

    .line 1180
    .local v0, "keyCode":J
    nop

    .line 1181
    iget-boolean v2, p0, Landroidx/compose/foundation/AbstractClickableNode;->enabled:Z

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    invoke-static {p1}, Landroidx/compose/foundation/ClickableKt;->access$isPress-ZmokQxo(Landroid/view/KeyEvent;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 1184
    const/4 v2, 0x0

    .line 1185
    .local v2, "wasInteractionHandled":Z
    iget-object v6, p0, Landroidx/compose/foundation/AbstractClickableNode;->currentKeyPressInteractions:Landroidx/collection/MutableLongObjectMap;

    invoke-virtual {v6, v0, v1}, Landroidx/collection/MutableLongObjectMap;->containsKey(J)Z

    move-result v6

    if-nez v6, :cond_1

    .line 1186
    new-instance v6, Landroidx/compose/foundation/interaction/PressInteraction$Press;

    iget-wide v7, p0, Landroidx/compose/foundation/AbstractClickableNode;->centerOffset:J

    invoke-direct {v6, v7, v8, v4}, Landroidx/compose/foundation/interaction/PressInteraction$Press;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1187
    .local v6, "press":Landroidx/compose/foundation/interaction/PressInteraction$Press;
    iget-object v7, p0, Landroidx/compose/foundation/AbstractClickableNode;->currentKeyPressInteractions:Landroidx/collection/MutableLongObjectMap;

    invoke-virtual {v7, v0, v1, v6}, Landroidx/collection/MutableLongObjectMap;->set(JLjava/lang/Object;)V

    .line 1190
    iget-object v7, p0, Landroidx/compose/foundation/AbstractClickableNode;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    if-eqz v7, :cond_0

    .line 1191
    invoke-virtual {p0}, Landroidx/compose/foundation/AbstractClickableNode;->getCoroutineScope()Lkotlinx/coroutines/CoroutineScope;

    move-result-object v8

    new-instance v7, Landroidx/compose/foundation/AbstractClickableNode$onKeyEvent$1;

    invoke-direct {v7, p0, v6, v4}, Landroidx/compose/foundation/AbstractClickableNode$onKeyEvent$1;-><init>(Landroidx/compose/foundation/AbstractClickableNode;Landroidx/compose/foundation/interaction/PressInteraction$Press;Lkotlin/coroutines/Continuation;)V

    move-object v11, v7

    check-cast v11, Lkotlin/jvm/functions/Function2;

    const/4 v12, 0x3

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v8 .. v13}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 1193
    :cond_0
    const/4 v2, 0x1

    .line 1195
    .end local v6    # "press":Landroidx/compose/foundation/interaction/PressInteraction$Press;
    :cond_1
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/AbstractClickableNode;->onClickKeyDownEvent-ZmokQxo(Landroid/view/KeyEvent;)Z

    move-result v4

    if-nez v4, :cond_8

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    move v3, v5

    .end local v2    # "wasInteractionHandled":Z
    goto :goto_0

    .line 1197
    :cond_3
    iget-boolean v2, p0, Landroidx/compose/foundation/AbstractClickableNode;->enabled:Z

    if-eqz v2, :cond_7

    invoke-static {p1}, Landroidx/compose/foundation/ClickableKt;->access$isClick-ZmokQxo(Landroid/view/KeyEvent;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 1198
    iget-object v2, p0, Landroidx/compose/foundation/AbstractClickableNode;->currentKeyPressInteractions:Landroidx/collection/MutableLongObjectMap;

    invoke-virtual {v2, v0, v1}, Landroidx/collection/MutableLongObjectMap;->remove(J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/foundation/interaction/PressInteraction$Press;

    .line 1199
    .local v2, "press":Landroidx/compose/foundation/interaction/PressInteraction$Press;
    if-eqz v2, :cond_5

    .line 1200
    iget-object v6, p0, Landroidx/compose/foundation/AbstractClickableNode;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    if-eqz v6, :cond_4

    .line 1201
    invoke-virtual {p0}, Landroidx/compose/foundation/AbstractClickableNode;->getCoroutineScope()Lkotlinx/coroutines/CoroutineScope;

    move-result-object v7

    new-instance v6, Landroidx/compose/foundation/AbstractClickableNode$onKeyEvent$2;

    invoke-direct {v6, p0, v2, v4}, Landroidx/compose/foundation/AbstractClickableNode$onKeyEvent$2;-><init>(Landroidx/compose/foundation/AbstractClickableNode;Landroidx/compose/foundation/interaction/PressInteraction$Press;Lkotlin/coroutines/Continuation;)V

    move-object v10, v6

    check-cast v10, Lkotlin/jvm/functions/Function2;

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v7 .. v12}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 1207
    :cond_4
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/AbstractClickableNode;->onClickKeyUpEvent-ZmokQxo(Landroid/view/KeyEvent;)Z

    .line 1210
    :cond_5
    if-eqz v2, :cond_6

    goto :goto_0

    :cond_6
    move v3, v5

    .end local v2    # "press":Landroidx/compose/foundation/interaction/PressInteraction$Press;
    goto :goto_0

    .line 1212
    :cond_7
    move v3, v5

    .line 1180
    :cond_8
    :goto_0
    return v3
.end method

.method public final onPointerEvent-H0pRuoY(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V
    .locals 17
    .param p1, "pointerEvent"    # Landroidx/compose/ui/input/pointer/PointerEvent;
    .param p2, "pass"    # Landroidx/compose/ui/input/pointer/PointerEventPass;
    .param p3, "bounds"    # J

    .line 1146
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/unit/IntSizeKt;->getCenter-ozmzZPI(J)J

    move-result-wide v2

    .local v2, "$this$toOffset_u2d_u2dgyyYBs$iv":J
    const/4 v4, 0x0

    .line 1377
    .local v4, "$i$f$toOffset--gyyYBs":I
    invoke-static {v2, v3}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v5

    int-to-float v5, v5

    .local v5, "x$iv$iv":F
    invoke-static {v2, v3}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v6

    int-to-float v6, v6

    .local v6, "y$iv$iv":F
    const/4 v7, 0x0

    .line 1378
    .local v7, "$i$f$Offset":I
    const/4 v8, 0x0

    .line 1379
    .local v8, "$i$f$packFloats":I
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v9

    int-to-long v9, v9

    .line 1380
    .local v9, "v1$iv$iv$iv":J
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v11

    int-to-long v11, v11

    .line 1381
    .local v11, "v2$iv$iv$iv":J
    const/16 v13, 0x20

    shl-long v13, v9, v13

    const-wide v15, 0xffffffffL

    and-long/2addr v15, v11

    or-long v8, v13, v15

    .line 1378
    .end local v8    # "$i$f$packFloats":I
    .end local v9    # "v1$iv$iv$iv":J
    .end local v11    # "v2$iv$iv$iv":J
    invoke-static {v8, v9}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    move-result-wide v5

    .line 1377
    .end local v5    # "x$iv$iv":F
    .end local v6    # "y$iv$iv":F
    .end local v7    # "$i$f$Offset":I
    nop

    .line 1146
    .end local v2    # "$this$toOffset_u2d_u2dgyyYBs$iv":J
    .end local v4    # "$i$f$toOffset--gyyYBs":I
    iput-wide v5, v0, Landroidx/compose/foundation/AbstractClickableNode;->centerOffset:J

    .line 1147
    invoke-direct {v0}, Landroidx/compose/foundation/AbstractClickableNode;->initializeIndicationAndInteractionSourceIfNeeded()V

    .line 1148
    iget-boolean v2, v0, Landroidx/compose/foundation/AbstractClickableNode;->enabled:Z

    if-eqz v2, :cond_1

    .line 1149
    sget-object v2, Landroidx/compose/ui/input/pointer/PointerEventPass;->Main:Landroidx/compose/ui/input/pointer/PointerEventPass;

    if-ne v1, v2, :cond_1

    .line 1150
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/input/pointer/PointerEvent;->getType-7fucELk()I

    move-result v2

    .line 1151
    sget-object v3, Landroidx/compose/ui/input/pointer/PointerEventType;->Companion:Landroidx/compose/ui/input/pointer/PointerEventType$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/input/pointer/PointerEventType$Companion;->getEnter-7fucELk()I

    move-result v3

    invoke-static {v2, v3}, Landroidx/compose/ui/input/pointer/PointerEventType;->equals-impl0(II)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Landroidx/compose/foundation/AbstractClickableNode;->getCoroutineScope()Lkotlinx/coroutines/CoroutineScope;

    move-result-object v5

    new-instance v2, Landroidx/compose/foundation/AbstractClickableNode$onPointerEvent$1;

    invoke-direct {v2, v0, v4}, Landroidx/compose/foundation/AbstractClickableNode$onPointerEvent$1;-><init>(Landroidx/compose/foundation/AbstractClickableNode;Lkotlin/coroutines/Continuation;)V

    move-object v8, v2

    check-cast v8, Lkotlin/jvm/functions/Function2;

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    goto :goto_0

    .line 1152
    :cond_0
    sget-object v3, Landroidx/compose/ui/input/pointer/PointerEventType;->Companion:Landroidx/compose/ui/input/pointer/PointerEventType$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/input/pointer/PointerEventType$Companion;->getExit-7fucELk()I

    move-result v3

    invoke-static {v2, v3}, Landroidx/compose/ui/input/pointer/PointerEventType;->equals-impl0(II)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Landroidx/compose/foundation/AbstractClickableNode;->getCoroutineScope()Lkotlinx/coroutines/CoroutineScope;

    move-result-object v5

    new-instance v2, Landroidx/compose/foundation/AbstractClickableNode$onPointerEvent$2;

    invoke-direct {v2, v0, v4}, Landroidx/compose/foundation/AbstractClickableNode$onPointerEvent$2;-><init>(Landroidx/compose/foundation/AbstractClickableNode;Lkotlin/coroutines/Continuation;)V

    move-object v8, v2

    check-cast v8, Lkotlin/jvm/functions/Function2;

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 1156
    :cond_1
    :goto_0
    iget-object v2, v0, Landroidx/compose/foundation/AbstractClickableNode;->pointerInputNode:Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;

    if-nez v2, :cond_2

    .line 1157
    new-instance v2, Landroidx/compose/foundation/AbstractClickableNode$onPointerEvent$3;

    invoke-direct {v2, v0}, Landroidx/compose/foundation/AbstractClickableNode$onPointerEvent$3;-><init>(Landroidx/compose/foundation/AbstractClickableNode;)V

    check-cast v2, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    invoke-static {v2}, Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt;->SuspendingPointerInputModifierNode(Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/node/DelegatableNode;

    invoke-virtual {v0, v2}, Landroidx/compose/foundation/AbstractClickableNode;->delegate(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/DelegatableNode;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;

    iput-object v2, v0, Landroidx/compose/foundation/AbstractClickableNode;->pointerInputNode:Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;

    .line 1159
    :cond_2
    iget-object v2, v0, Landroidx/compose/foundation/AbstractClickableNode;->pointerInputNode:Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;

    if-eqz v2, :cond_3

    move-object/from16 v3, p1

    move-wide/from16 v4, p3

    invoke-interface {v2, v3, v1, v4, v5}, Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;->onPointerEvent-H0pRuoY(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V

    goto :goto_1

    :cond_3
    move-object/from16 v3, p1

    move-wide/from16 v4, p3

    .line 1160
    :goto_1
    return-void
.end method

.method public final onPreKeyEvent-ZmokQxo(Landroid/view/KeyEvent;)Z
    .locals 1
    .param p1, "event"    # Landroid/view/KeyEvent;

    .line 1226
    const/4 v0, 0x0

    return v0
.end method

.method protected final resetPointerInputHandler()Lkotlin/Unit;
    .locals 1

    .line 1250
    iget-object v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->pointerInputNode:Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;->resetPointerInputHandler()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method protected final updateCommon-QzZPfjk(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)V
    .locals 3
    .param p1, "interactionSource"    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .param p2, "indicationNodeFactory"    # Landroidx/compose/foundation/IndicationNodeFactory;
    .param p3, "enabled"    # Z
    .param p4, "onClickLabel"    # Ljava/lang/String;
    .param p5, "role"    # Landroidx/compose/ui/semantics/Role;
    .param p6, "onClick"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/foundation/IndicationNodeFactory;",
            "Z",
            "Ljava/lang/String;",
            "Landroidx/compose/ui/semantics/Role;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1019
    const/4 v0, 0x0

    .line 1022
    .local v0, "isIndicationNodeDirty":Z
    iget-object v1, p0, Landroidx/compose/foundation/AbstractClickableNode;->userProvidedInteractionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1023
    invoke-virtual {p0}, Landroidx/compose/foundation/AbstractClickableNode;->disposeInteractions()V

    .line 1024
    iput-object p1, p0, Landroidx/compose/foundation/AbstractClickableNode;->userProvidedInteractionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 1025
    iput-object p1, p0, Landroidx/compose/foundation/AbstractClickableNode;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 1026
    const/4 v0, 0x1

    .line 1028
    :cond_0
    iget-object v1, p0, Landroidx/compose/foundation/AbstractClickableNode;->indicationNodeFactory:Landroidx/compose/foundation/IndicationNodeFactory;

    invoke-static {v1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 1029
    iput-object p2, p0, Landroidx/compose/foundation/AbstractClickableNode;->indicationNodeFactory:Landroidx/compose/foundation/IndicationNodeFactory;

    .line 1030
    const/4 v0, 0x1

    .line 1032
    :cond_1
    iget-boolean v1, p0, Landroidx/compose/foundation/AbstractClickableNode;->enabled:Z

    if-eq v1, p3, :cond_3

    .line 1033
    nop

    .line 1037
    iget-object v1, p0, Landroidx/compose/foundation/AbstractClickableNode;->focusableNode:Landroidx/compose/foundation/FocusableNode;

    .line 1033
    if-eqz p3, :cond_2

    .line 1034
    check-cast v1, Landroidx/compose/ui/node/DelegatableNode;

    invoke-virtual {p0, v1}, Landroidx/compose/foundation/AbstractClickableNode;->delegate(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/DelegatableNode;

    goto :goto_0

    .line 1037
    :cond_2
    check-cast v1, Landroidx/compose/ui/node/DelegatableNode;

    invoke-virtual {p0, v1}, Landroidx/compose/foundation/AbstractClickableNode;->undelegate(Landroidx/compose/ui/node/DelegatableNode;)V

    .line 1038
    invoke-virtual {p0}, Landroidx/compose/foundation/AbstractClickableNode;->disposeInteractions()V

    .line 1040
    :goto_0
    move-object v1, p0

    check-cast v1, Landroidx/compose/ui/node/SemanticsModifierNode;

    invoke-static {v1}, Landroidx/compose/ui/node/SemanticsModifierNodeKt;->invalidateSemantics(Landroidx/compose/ui/node/SemanticsModifierNode;)V

    .line 1041
    iput-boolean p3, p0, Landroidx/compose/foundation/AbstractClickableNode;->enabled:Z

    .line 1043
    :cond_3
    iget-object v1, p0, Landroidx/compose/foundation/AbstractClickableNode;->onClickLabel:Ljava/lang/String;

    invoke-static {v1, p4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 1044
    iput-object p4, p0, Landroidx/compose/foundation/AbstractClickableNode;->onClickLabel:Ljava/lang/String;

    .line 1045
    move-object v1, p0

    check-cast v1, Landroidx/compose/ui/node/SemanticsModifierNode;

    invoke-static {v1}, Landroidx/compose/ui/node/SemanticsModifierNodeKt;->invalidateSemantics(Landroidx/compose/ui/node/SemanticsModifierNode;)V

    .line 1047
    :cond_4
    iget-object v1, p0, Landroidx/compose/foundation/AbstractClickableNode;->role:Landroidx/compose/ui/semantics/Role;

    invoke-static {v1, p5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 1048
    iput-object p5, p0, Landroidx/compose/foundation/AbstractClickableNode;->role:Landroidx/compose/ui/semantics/Role;

    .line 1049
    move-object v1, p0

    check-cast v1, Landroidx/compose/ui/node/SemanticsModifierNode;

    invoke-static {v1}, Landroidx/compose/ui/node/SemanticsModifierNodeKt;->invalidateSemantics(Landroidx/compose/ui/node/SemanticsModifierNode;)V

    .line 1051
    :cond_5
    iput-object p6, p0, Landroidx/compose/foundation/AbstractClickableNode;->onClick:Lkotlin/jvm/functions/Function0;

    .line 1052
    iget-boolean v1, p0, Landroidx/compose/foundation/AbstractClickableNode;->lazilyCreateIndication:Z

    invoke-direct {p0}, Landroidx/compose/foundation/AbstractClickableNode;->shouldLazilyCreateIndication()Z

    move-result v2

    if-eq v1, v2, :cond_6

    .line 1053
    invoke-direct {p0}, Landroidx/compose/foundation/AbstractClickableNode;->shouldLazilyCreateIndication()Z

    move-result v1

    iput-boolean v1, p0, Landroidx/compose/foundation/AbstractClickableNode;->lazilyCreateIndication:Z

    .line 1056
    iget-boolean v1, p0, Landroidx/compose/foundation/AbstractClickableNode;->lazilyCreateIndication:Z

    if-nez v1, :cond_6

    iget-object v1, p0, Landroidx/compose/foundation/AbstractClickableNode;->indicationNode:Landroidx/compose/ui/node/DelegatableNode;

    if-nez v1, :cond_6

    const/4 v0, 0x1

    .line 1059
    :cond_6
    if-eqz v0, :cond_9

    .line 1061
    iget-object v1, p0, Landroidx/compose/foundation/AbstractClickableNode;->indicationNode:Landroidx/compose/ui/node/DelegatableNode;

    if-nez v1, :cond_7

    iget-boolean v1, p0, Landroidx/compose/foundation/AbstractClickableNode;->lazilyCreateIndication:Z

    if-nez v1, :cond_9

    .line 1062
    :cond_7
    iget-object v1, p0, Landroidx/compose/foundation/AbstractClickableNode;->indicationNode:Landroidx/compose/ui/node/DelegatableNode;

    if-eqz v1, :cond_8

    .line 1328
    .local v1, "it":Landroidx/compose/ui/node/DelegatableNode;
    const/4 v2, 0x0

    .line 1062
    .local v2, "$i$a$-let-AbstractClickableNode$updateCommon$1":I
    invoke-virtual {p0, v1}, Landroidx/compose/foundation/AbstractClickableNode;->undelegate(Landroidx/compose/ui/node/DelegatableNode;)V

    .line 1063
    .end local v1    # "it":Landroidx/compose/ui/node/DelegatableNode;
    .end local v2    # "$i$a$-let-AbstractClickableNode$updateCommon$1":I
    :cond_8
    const/4 v1, 0x0

    iput-object v1, p0, Landroidx/compose/foundation/AbstractClickableNode;->indicationNode:Landroidx/compose/ui/node/DelegatableNode;

    .line 1064
    invoke-direct {p0}, Landroidx/compose/foundation/AbstractClickableNode;->initializeIndicationAndInteractionSourceIfNeeded()V

    .line 1067
    :cond_9
    iget-object v1, p0, Landroidx/compose/foundation/AbstractClickableNode;->focusableNode:Landroidx/compose/foundation/FocusableNode;

    iget-object v2, p0, Landroidx/compose/foundation/AbstractClickableNode;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    invoke-virtual {v1, v2}, Landroidx/compose/foundation/FocusableNode;->update(Landroidx/compose/foundation/interaction/MutableInteractionSource;)V

    .line 1068
    return-void
.end method
