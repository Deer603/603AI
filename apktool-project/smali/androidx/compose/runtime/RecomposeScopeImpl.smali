.class public final Landroidx/compose/runtime/RecomposeScopeImpl;
.super Ljava/lang/Object;
.source "RecomposeScopeImpl.kt"

# interfaces
.implements Landroidx/compose/runtime/ScopeUpdateScope;
.implements Landroidx/compose/runtime/RecomposeScope;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/runtime/RecomposeScopeImpl$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n*L\n1#1,494:1\n33#2,2:495\n1#3:497\n256#4,2:498\n231#4,3:500\n200#4,7:503\n211#4,3:511\n214#4,9:515\n234#4:524\n258#4:525\n1399#5:510\n1270#5:514\n1399#5:536\n1270#5:540\n1399#5:562\n1270#5:566\n395#6,4:526\n367#6,6:530\n377#6,3:537\n380#6,9:541\n399#6:550\n423#6:551\n395#6,4:552\n367#6,6:556\n377#6,3:563\n380#6,9:567\n399#6:576\n424#6:577\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl\n*L\n240#1:495,2\n404#1:498,2\n404#1:500,3\n404#1:503,7\n404#1:511,3\n404#1:515,9\n404#1:524\n404#1:525\n404#1:510\n404#1:514\n426#1:536\n426#1:540\n446#1:562\n446#1:566\n426#1:526,4\n426#1:530,6\n426#1:537,3\n426#1:541,9\n426#1:550\n446#1:551\n446#1:552,4\n446#1:556,6\n446#1:563,3\n446#1:567,9\n446#1:576\n446#1:577\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0000\u0018\u0000 ]2\u00020\u00012\u00020\u0002:\u0001]B\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010D\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010E\u001a\u00020\u00102\u0006\u0010F\u001a\u00020\u000eJ\u001c\u0010G\u001a\u0010\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\u0010\u0018\u00010H2\u0006\u0010J\u001a\u00020\u000fJ\u0008\u0010K\u001a\u00020\u0010H\u0016J\u0010\u0010L\u001a\u00020M2\u0008\u0010\u0016\u001a\u0004\u0018\u00010<J\u0010\u0010N\u001a\u00020\u00122\u0008\u0010O\u001a\u0004\u0018\u00010<J\u0015\u0010P\u001a\u00020Q2\u0006\u0010#\u001a\u00020$H\u0001\u00a2\u0006\u0002\u0008RJ\u001c\u0010S\u001a\u00020\u00102\n\u0010T\u001a\u0006\u0012\u0002\u0008\u00030;2\u0008\u0010\u0016\u001a\u0004\u0018\u00010<J\u000e\u0010U\u001a\u00020\u00122\u0006\u0010T\u001a\u00020<J\u0006\u0010V\u001a\u00020\u0010J\u0006\u0010W\u001a\u00020\u0010J\u0006\u0010X\u001a\u00020\u0010J\u000e\u0010Y\u001a\u00020\u00102\u0006\u0010J\u001a\u00020\u000fJ\"\u0010Z\u001a\u00020\u00102\u0018\u0010\u000c\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\rH\u0016J*\u0010[\u001a\u00020\u0012*\u0006\u0012\u0002\u0008\u00030;2\u0018\u0010\\\u001a\u0014\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030;\u0012\u0006\u0012\u0004\u0018\u00010<0:H\u0002R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000bR\"\u0010\u000c\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00128F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0018\u0010\u0014\"\u0004\u0008\u0019\u0010\u001aR$\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00128F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u001c\u0010\u0014\"\u0004\u0008\u001d\u0010\u001aR\u000e\u0010\u001e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00128F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008 \u0010\u0014\"\u0004\u0008!\u0010\u001aR\u0011\u0010\"\u001a\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010\u0014R\u001a\u0010#\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008%\u0010&R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\'\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00128F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008(\u0010\u0014\"\u0004\u0008)\u0010\u001aR$\u0010*\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00128F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008+\u0010\u0014\"\u0004\u0008,\u0010\u001aR$\u0010-\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00128B@BX\u0082\u000e\u00a2\u0006\u000c\u001a\u0004\u0008.\u0010\u0014\"\u0004\u0008/\u0010\u001aR$\u00100\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00128F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u00081\u0010\u0014\"\u0004\u00082\u0010\u001aR$\u00103\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00128F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u00084\u0010\u0014\"\u0004\u00085\u0010\u001aR$\u00106\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00128@@BX\u0080\u000e\u00a2\u0006\u000c\u001a\u0004\u00087\u0010\u0014\"\u0004\u00088\u0010\u001aR\"\u00109\u001a\u0016\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030;\u0012\u0006\u0012\u0004\u0018\u00010<\u0018\u00010:X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010=\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010>X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010?\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00128F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008@\u0010\u0014\"\u0004\u0008A\u0010\u001aR\u0011\u0010B\u001a\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\u0008C\u0010\u0014\u00a8\u0006^"
    }
    d2 = {
        "Landroidx/compose/runtime/RecomposeScopeImpl;",
        "Landroidx/compose/runtime/ScopeUpdateScope;",
        "Landroidx/compose/runtime/RecomposeScope;",
        "owner",
        "Landroidx/compose/runtime/RecomposeScopeOwner;",
        "(Landroidx/compose/runtime/RecomposeScopeOwner;)V",
        "anchor",
        "Landroidx/compose/runtime/Anchor;",
        "getAnchor",
        "()Landroidx/compose/runtime/Anchor;",
        "setAnchor",
        "(Landroidx/compose/runtime/Anchor;)V",
        "block",
        "Lkotlin/Function2;",
        "Landroidx/compose/runtime/Composer;",
        "",
        "",
        "canRecompose",
        "",
        "getCanRecompose",
        "()Z",
        "currentToken",
        "value",
        "defaultsInScope",
        "getDefaultsInScope",
        "setDefaultsInScope",
        "(Z)V",
        "defaultsInvalid",
        "getDefaultsInvalid",
        "setDefaultsInvalid",
        "flags",
        "forcedRecompose",
        "getForcedRecompose",
        "setForcedRecompose",
        "isConditional",
        "observer",
        "Landroidx/compose/runtime/tooling/RecomposeScopeObserver;",
        "getObserver$annotations",
        "()V",
        "paused",
        "getPaused",
        "setPaused",
        "requiresRecompose",
        "getRequiresRecompose",
        "setRequiresRecompose",
        "rereading",
        "getRereading",
        "setRereading",
        "resuming",
        "getResuming",
        "setResuming",
        "reusing",
        "getReusing",
        "setReusing",
        "skipped",
        "getSkipped$runtime_release",
        "setSkipped",
        "trackedDependencies",
        "Landroidx/collection/MutableScatterMap;",
        "Landroidx/compose/runtime/DerivedState;",
        "",
        "trackedInstances",
        "Landroidx/collection/MutableObjectIntMap;",
        "used",
        "getUsed",
        "setUsed",
        "valid",
        "getValid",
        "adoptedBy",
        "compose",
        "composer",
        "end",
        "Lkotlin/Function1;",
        "Landroidx/compose/runtime/Composition;",
        "token",
        "invalidate",
        "invalidateForResult",
        "Landroidx/compose/runtime/InvalidationResult;",
        "isInvalidFor",
        "instances",
        "observe",
        "Landroidx/compose/runtime/tooling/CompositionObserverHandle;",
        "observe$runtime_release",
        "recordDerivedStateValue",
        "instance",
        "recordRead",
        "release",
        "rereadTrackedInstances",
        "scopeSkipped",
        "start",
        "updateScope",
        "checkDerivedStateChanged",
        "dependencies",
        "Companion",
        "runtime_release"
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

.field public static final Companion:Landroidx/compose/runtime/RecomposeScopeImpl$Companion;


# instance fields
.field private anchor:Landroidx/compose/runtime/Anchor;

.field private block:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private currentToken:I

.field private flags:I

.field private observer:Landroidx/compose/runtime/tooling/RecomposeScopeObserver;

.field private owner:Landroidx/compose/runtime/RecomposeScopeOwner;

.field private trackedDependencies:Landroidx/collection/MutableScatterMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterMap<",
            "Landroidx/compose/runtime/DerivedState<",
            "*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private trackedInstances:Landroidx/collection/MutableObjectIntMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableObjectIntMap<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/runtime/RecomposeScopeImpl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/runtime/RecomposeScopeImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/compose/runtime/RecomposeScopeImpl;->Companion:Landroidx/compose/runtime/RecomposeScopeImpl$Companion;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/runtime/RecomposeScopeImpl;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroidx/compose/runtime/RecomposeScopeOwner;)V
    .locals 0
    .param p1, "owner"    # Landroidx/compose/runtime/RecomposeScopeOwner;

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    iput-object p1, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->owner:Landroidx/compose/runtime/RecomposeScopeOwner;

    .line 87
    return-void
.end method

.method public static final synthetic access$getCurrentToken$p(Landroidx/compose/runtime/RecomposeScopeImpl;)I
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/RecomposeScopeImpl;

    .line 87
    iget v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->currentToken:I

    return v0
.end method

.method public static final synthetic access$getObserver$p(Landroidx/compose/runtime/RecomposeScopeImpl;)Landroidx/compose/runtime/tooling/RecomposeScopeObserver;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/RecomposeScopeImpl;

    .line 87
    iget-object v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->observer:Landroidx/compose/runtime/tooling/RecomposeScopeObserver;

    return-object v0
.end method

.method public static final synthetic access$getTrackedDependencies$p(Landroidx/compose/runtime/RecomposeScopeImpl;)Landroidx/collection/MutableScatterMap;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/RecomposeScopeImpl;

    .line 87
    iget-object v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->trackedDependencies:Landroidx/collection/MutableScatterMap;

    return-object v0
.end method

.method public static final synthetic access$getTrackedInstances$p(Landroidx/compose/runtime/RecomposeScopeImpl;)Landroidx/collection/MutableObjectIntMap;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/RecomposeScopeImpl;

    .line 87
    iget-object v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->trackedInstances:Landroidx/collection/MutableObjectIntMap;

    return-object v0
.end method

.method public static final synthetic access$setObserver$p(Landroidx/compose/runtime/RecomposeScopeImpl;Landroidx/compose/runtime/tooling/RecomposeScopeObserver;)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/runtime/RecomposeScopeImpl;
    .param p1, "<set-?>"    # Landroidx/compose/runtime/tooling/RecomposeScopeObserver;

    .line 87
    iput-object p1, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->observer:Landroidx/compose/runtime/tooling/RecomposeScopeObserver;

    return-void
.end method

.method private final checkDerivedStateChanged(Landroidx/compose/runtime/DerivedState;Landroidx/collection/MutableScatterMap;)Z
    .locals 3
    .param p1, "$this$checkDerivedStateChanged"    # Landroidx/compose/runtime/DerivedState;
    .param p2, "dependencies"    # Landroidx/collection/MutableScatterMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/DerivedState<",
            "*>;",
            "Landroidx/collection/MutableScatterMap<",
            "Landroidx/compose/runtime/DerivedState<",
            "*>;",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .line 416
    const-string/jumbo v0, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 417
    invoke-interface {p1}, Landroidx/compose/runtime/DerivedState;->getPolicy()Landroidx/compose/runtime/SnapshotMutationPolicy;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->structuralEqualityPolicy()Landroidx/compose/runtime/SnapshotMutationPolicy;

    move-result-object v0

    .line 418
    .local v0, "policy":Landroidx/compose/runtime/SnapshotMutationPolicy;
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/DerivedState;->getCurrentRecord()Landroidx/compose/runtime/DerivedState$Record;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/runtime/DerivedState$Record;->getCurrentValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p2, p1}, Landroidx/collection/MutableScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Landroidx/compose/runtime/SnapshotMutationPolicy;->equivalent(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    return v1
.end method

.method private static synthetic getObserver$annotations()V
    .locals 0

    return-void
.end method

.method private final getRereading()Z
    .locals 1

    .line 301
    iget v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->flags:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final setRereading(Z)V
    .locals 1
    .param p1, "value"    # Z

    .line 303
    nop

    .line 306
    iget v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->flags:I

    .line 303
    if-eqz p1, :cond_0

    .line 304
    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->flags:I

    goto :goto_0

    .line 306
    :cond_0
    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->flags:I

    .line 308
    :goto_0
    return-void
.end method

.method private final setSkipped(Z)V
    .locals 1
    .param p1, "value"    # Z

    .line 329
    nop

    .line 332
    iget v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->flags:I

    .line 329
    if-eqz p1, :cond_0

    .line 330
    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->flags:I

    goto :goto_0

    .line 332
    :cond_0
    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->flags:I

    .line 334
    :goto_0
    return-void
.end method


# virtual methods
.method public final adoptedBy(Landroidx/compose/runtime/RecomposeScopeOwner;)V
    .locals 0
    .param p1, "owner"    # Landroidx/compose/runtime/RecomposeScopeOwner;

    .line 276
    iput-object p1, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->owner:Landroidx/compose/runtime/RecomposeScopeOwner;

    .line 277
    return-void
.end method

.method public final compose(Landroidx/compose/runtime/Composer;)V
    .locals 4
    .param p1, "composer"    # Landroidx/compose/runtime/Composer;

    .line 224
    nop

    .line 235
    iget-object v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->block:Lkotlin/jvm/functions/Function2;

    .line 225
    .local v0, "block":Lkotlin/jvm/functions/Function2;
    iget-object v1, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->observer:Landroidx/compose/runtime/tooling/RecomposeScopeObserver;

    .line 226
    .local v1, "observer":Landroidx/compose/runtime/tooling/RecomposeScopeObserver;
    const/4 v2, 0x1

    .line 235
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 226
    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    .line 227
    move-object v3, p0

    check-cast v3, Landroidx/compose/runtime/RecomposeScope;

    invoke-interface {v1, v3}, Landroidx/compose/runtime/tooling/RecomposeScopeObserver;->onBeginScopeComposition(Landroidx/compose/runtime/RecomposeScope;)V

    .line 228
    nop

    .line 229
    :try_start_0
    invoke-interface {v0, p1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 231
    move-object v2, p0

    check-cast v2, Landroidx/compose/runtime/RecomposeScope;

    invoke-interface {v1, v2}, Landroidx/compose/runtime/tooling/RecomposeScopeObserver;->onEndScopeComposition(Landroidx/compose/runtime/RecomposeScope;)V

    .line 232
    nop

    .line 233
    return-void

    .line 231
    :catchall_0
    move-exception v2

    move-object v3, p0

    check-cast v3, Landroidx/compose/runtime/RecomposeScope;

    invoke-interface {v1, v3}, Landroidx/compose/runtime/tooling/RecomposeScopeObserver;->onEndScopeComposition(Landroidx/compose/runtime/RecomposeScope;)V

    throw v2

    .line 235
    :cond_0
    if-eqz v0, :cond_1

    invoke-interface {v0, p1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    .line 236
    return-void

    .line 235
    :cond_2
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Invalid restart scope"

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public final end(I)Lkotlin/jvm/functions/Function1;
    .locals 31
    .param p1, "token"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/runtime/Composition;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 440
    move-object/from16 v0, p0

    move/from16 v1, p1

    iget-object v2, v0, Landroidx/compose/runtime/RecomposeScopeImpl;->trackedInstances:Landroidx/collection/MutableObjectIntMap;

    if-eqz v2, :cond_b

    .local v2, "instances":Landroidx/collection/MutableObjectIntMap;
    const/4 v4, 0x0

    .line 446
    .local v4, "$i$a$-let-RecomposeScopeImpl$end$1":I
    invoke-virtual {v0}, Landroidx/compose/runtime/RecomposeScopeImpl;->getSkipped$runtime_release()Z

    move-result v5

    if-nez v5, :cond_9

    move-object v5, v2

    check-cast v5, Landroidx/collection/ObjectIntMap;

    .local v5, "this_$iv":Landroidx/collection/ObjectIntMap;
    const/4 v6, 0x0

    .line 551
    .local v6, "$i$f$any":I
    move-object v7, v5

    .local v7, "this_$iv$iv":Landroidx/collection/ObjectIntMap;
    const/4 v8, 0x0

    .line 552
    .local v8, "$i$f$forEach":I
    iget-object v9, v7, Landroidx/collection/ObjectIntMap;->keys:[Ljava/lang/Object;

    .line 553
    .local v9, "k$iv$iv":[Ljava/lang/Object;
    iget-object v10, v7, Landroidx/collection/ObjectIntMap;->values:[I

    .line 555
    .local v10, "v$iv$iv":[I
    move-object v11, v7

    .local v11, "this_$iv$iv$iv":Landroidx/collection/ObjectIntMap;
    const/4 v12, 0x0

    .line 556
    .local v12, "$i$f$forEachIndexed":I
    iget-object v13, v11, Landroidx/collection/ObjectIntMap;->metadata:[J

    .line 557
    .local v13, "m$iv$iv$iv":[J
    array-length v14, v13

    add-int/lit8 v14, v14, -0x2

    .line 559
    .local v14, "lastIndex$iv$iv$iv":I
    const/4 v15, 0x0

    .local v15, "i$iv$iv$iv":I
    const/16 v16, 0x0

    if-gt v15, v14, :cond_6

    .line 560
    :goto_0
    aget-wide v17, v13, v15

    .line 561
    .local v17, "slot$iv$iv$iv":J
    move-wide/from16 v19, v17

    .local v19, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    const/16 v21, 0x0

    .line 562
    .local v21, "$i$f$maskEmptyOrDeleted":I
    move/from16 v22, v4

    move-wide/from16 v3, v19

    move-object/from16 v19, v5

    move/from16 v20, v6

    .end local v4    # "$i$a$-let-RecomposeScopeImpl$end$1":I
    .end local v5    # "this_$iv":Landroidx/collection/ObjectIntMap;
    .end local v6    # "$i$f$any":I
    .local v3, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .local v19, "this_$iv":Landroidx/collection/ObjectIntMap;
    .local v20, "$i$f$any":I
    .local v22, "$i$a$-let-RecomposeScopeImpl$end$1":I
    not-long v5, v3

    const/16 v23, 0x7

    shl-long v5, v5, v23

    and-long/2addr v5, v3

    const-wide v23, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v3, v5, v23

    .line 561
    .end local v3    # "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .end local v21    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v3, v3, v23

    if-eqz v3, :cond_5

    .line 563
    sub-int v3, v15, v14

    not-int v3, v3

    ushr-int/lit8 v3, v3, 0x1f

    const/16 v4, 0x8

    rsub-int/lit8 v3, v3, 0x8

    .line 564
    .local v3, "bitCount$iv$iv$iv":I
    const/4 v5, 0x0

    .local v5, "j$iv$iv$iv":I
    :goto_1
    if-ge v5, v3, :cond_4

    .line 565
    const-wide/16 v23, 0xff

    and-long v23, v17, v23

    .local v23, "value$iv$iv$iv$iv":J
    const/4 v6, 0x0

    .line 566
    .local v6, "$i$f$isFull":I
    const-wide/16 v25, 0x80

    cmp-long v21, v23, v25

    const/16 v25, 0x1

    if-gez v21, :cond_0

    move/from16 v6, v25

    goto :goto_2

    :cond_0
    move/from16 v6, v16

    .line 565
    .end local v6    # "$i$f$isFull":I
    .end local v23    # "value$iv$iv$iv$iv":J
    :goto_2
    if-eqz v6, :cond_3

    .line 567
    shl-int/lit8 v6, v15, 0x3

    add-int/2addr v6, v5

    .line 568
    .local v6, "index$iv$iv$iv":I
    move/from16 v21, v6

    .local v21, "index$iv$iv":I
    const/16 v23, 0x0

    .line 555
    .local v23, "$i$a$-forEachIndexed-ObjectIntMap$forEach$1$iv$iv":I
    aget-object v24, v9, v21

    .local v24, "key$iv":Ljava/lang/Object;
    aget v26, v10, v21

    .local v26, "value$iv":I
    const/16 v27, 0x0

    .line 551
    .local v27, "$i$a$-forEach-ObjectIntMap$any$1$iv":I
    move/from16 v28, v26

    .local v28, "instanceToken":I
    const/16 v29, 0x0

    .line 446
    .local v29, "$i$a$-any-RecomposeScopeImpl$end$1$1":I
    move/from16 v30, v4

    move/from16 v4, v28

    .end local v28    # "instanceToken":I
    .local v4, "instanceToken":I
    if-eq v4, v1, :cond_1

    move/from16 v4, v25

    goto :goto_3

    :cond_1
    move/from16 v4, v16

    .line 551
    .end local v4    # "instanceToken":I
    .end local v29    # "$i$a$-any-RecomposeScopeImpl$end$1$1":I
    :goto_3
    if-eqz v4, :cond_2

    move/from16 v16, v25

    goto :goto_5

    .line 555
    .end local v24    # "key$iv":Ljava/lang/Object;
    .end local v26    # "value$iv":I
    .end local v27    # "$i$a$-forEach-ObjectIntMap$any$1$iv":I
    :cond_2
    nop

    .line 568
    .end local v21    # "index$iv$iv":I
    .end local v23    # "$i$a$-forEachIndexed-ObjectIntMap$forEach$1$iv$iv":I
    goto :goto_4

    .line 565
    .end local v6    # "index$iv$iv$iv":I
    :cond_3
    move/from16 v30, v4

    .line 570
    :goto_4
    shr-long v17, v17, v30

    .line 564
    add-int/lit8 v5, v5, 0x1

    move/from16 v4, v30

    goto :goto_1

    :cond_4
    move/from16 v30, v4

    .line 572
    .end local v5    # "j$iv$iv$iv":I
    if-ne v3, v4, :cond_8

    .line 559
    .end local v3    # "bitCount$iv$iv$iv":I
    .end local v17    # "slot$iv$iv$iv":J
    :cond_5
    if-eq v15, v14, :cond_7

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v5, v19

    move/from16 v6, v20

    move/from16 v4, v22

    goto :goto_0

    .end local v19    # "this_$iv":Landroidx/collection/ObjectIntMap;
    .end local v20    # "$i$f$any":I
    .end local v22    # "$i$a$-let-RecomposeScopeImpl$end$1":I
    .local v4, "$i$a$-let-RecomposeScopeImpl$end$1":I
    .local v5, "this_$iv":Landroidx/collection/ObjectIntMap;
    .local v6, "$i$f$any":I
    :cond_6
    move/from16 v22, v4

    move-object/from16 v19, v5

    move/from16 v20, v6

    .line 575
    .end local v4    # "$i$a$-let-RecomposeScopeImpl$end$1":I
    .end local v5    # "this_$iv":Landroidx/collection/ObjectIntMap;
    .end local v6    # "$i$f$any":I
    .end local v15    # "i$iv$iv$iv":I
    .restart local v19    # "this_$iv":Landroidx/collection/ObjectIntMap;
    .restart local v20    # "$i$f$any":I
    .restart local v22    # "$i$a$-let-RecomposeScopeImpl$end$1":I
    :cond_7
    nop

    .line 576
    .end local v11    # "this_$iv$iv$iv":Landroidx/collection/ObjectIntMap;
    .end local v12    # "$i$f$forEachIndexed":I
    .end local v13    # "m$iv$iv$iv":[J
    .end local v14    # "lastIndex$iv$iv$iv":I
    :cond_8
    nop

    .line 577
    .end local v7    # "this_$iv$iv":Landroidx/collection/ObjectIntMap;
    .end local v8    # "$i$f$forEach":I
    .end local v9    # "k$iv$iv":[Ljava/lang/Object;
    .end local v10    # "v$iv$iv":[I
    nop

    .line 446
    .end local v19    # "this_$iv":Landroidx/collection/ObjectIntMap;
    .end local v20    # "$i$f$any":I
    :goto_5
    if-eqz v16, :cond_a

    .line 447
    new-instance v3, Landroidx/compose/runtime/RecomposeScopeImpl$end$1$2;

    invoke-direct {v3, v0, v1, v2}, Landroidx/compose/runtime/RecomposeScopeImpl$end$1$2;-><init>(Landroidx/compose/runtime/RecomposeScopeImpl;ILandroidx/collection/MutableObjectIntMap;)V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    goto :goto_6

    .line 446
    .end local v22    # "$i$a$-let-RecomposeScopeImpl$end$1":I
    .restart local v4    # "$i$a$-let-RecomposeScopeImpl$end$1":I
    :cond_9
    move/from16 v22, v4

    .line 466
    .end local v4    # "$i$a$-let-RecomposeScopeImpl$end$1":I
    .restart local v22    # "$i$a$-let-RecomposeScopeImpl$end$1":I
    :cond_a
    const/4 v3, 0x0

    .line 440
    .end local v2    # "instances":Landroidx/collection/MutableObjectIntMap;
    .end local v22    # "$i$a$-let-RecomposeScopeImpl$end$1":I
    :goto_6
    goto :goto_7

    :cond_b
    const/4 v3, 0x0

    :goto_7
    return-object v3
.end method

.method public final getAnchor()Landroidx/compose/runtime/Anchor;
    .locals 1

    .line 97
    iget-object v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->anchor:Landroidx/compose/runtime/Anchor;

    return-object v0
.end method

.method public final getCanRecompose()Z
    .locals 1

    .line 108
    iget-object v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->block:Lkotlin/jvm/functions/Function2;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final getDefaultsInScope()Z
    .locals 1

    .line 172
    iget v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->flags:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final getDefaultsInvalid()Z
    .locals 1

    .line 186
    iget v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->flags:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final getForcedRecompose()Z
    .locals 1

    .line 316
    iget v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->flags:I

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final getPaused()Z
    .locals 1

    .line 143
    iget v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->flags:I

    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final getRequiresRecompose()Z
    .locals 1

    .line 201
    iget v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->flags:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final getResuming()Z
    .locals 1

    .line 155
    iget v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->flags:I

    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final getReusing()Z
    .locals 1

    .line 131
    iget v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->flags:I

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final getSkipped$runtime_release()Z
    .locals 1

    .line 327
    iget v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->flags:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final getUsed()Z
    .locals 2

    .line 116
    iget v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->flags:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final getValid()Z
    .locals 2

    .line 105
    iget-object v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->owner:Landroidx/compose/runtime/RecomposeScopeOwner;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->anchor:Landroidx/compose/runtime/Anchor;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/runtime/Anchor;->getValid()Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public invalidate()V
    .locals 2

    .line 286
    iget-object v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->owner:Landroidx/compose/runtime/RecomposeScopeOwner;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, p0, v1}, Landroidx/compose/runtime/RecomposeScopeOwner;->invalidate(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;

    .line 287
    :cond_0
    return-void
.end method

.method public final invalidateForResult(Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;
    .locals 1
    .param p1, "value"    # Ljava/lang/Object;

    .line 257
    iget-object v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->owner:Landroidx/compose/runtime/RecomposeScopeOwner;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0, p1}, Landroidx/compose/runtime/RecomposeScopeOwner;->invalidate(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    sget-object v0, Landroidx/compose/runtime/InvalidationResult;->IGNORED:Landroidx/compose/runtime/InvalidationResult;

    :cond_1
    return-object v0
.end method

.method public final isConditional()Z
    .locals 1

    .line 384
    iget-object v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->trackedDependencies:Landroidx/collection/MutableScatterMap;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isInvalidFor(Ljava/lang/Object;)Z
    .locals 27
    .param p1, "instances"    # Ljava/lang/Object;

    .line 395
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    return v2

    .line 396
    :cond_0
    iget-object v3, v0, Landroidx/compose/runtime/RecomposeScopeImpl;->trackedDependencies:Landroidx/collection/MutableScatterMap;

    if-nez v3, :cond_1

    return v2

    .line 398
    .local v3, "trackedDependencies":Landroidx/collection/MutableScatterMap;
    :cond_1
    nop

    .line 399
    instance-of v4, v1, Landroidx/compose/runtime/DerivedState;

    if-eqz v4, :cond_2

    .line 400
    move-object v2, v1

    check-cast v2, Landroidx/compose/runtime/DerivedState;

    invoke-direct {v0, v2, v3}, Landroidx/compose/runtime/RecomposeScopeImpl;->checkDerivedStateChanged(Landroidx/compose/runtime/DerivedState;Landroidx/collection/MutableScatterMap;)Z

    move-result v2

    goto/16 :goto_8

    .line 402
    :cond_2
    instance-of v4, v1, Landroidx/collection/ScatterSet;

    if-eqz v4, :cond_e

    .line 403
    move-object v4, v1

    check-cast v4, Landroidx/collection/ScatterSet;

    invoke-virtual {v4}, Landroidx/collection/ScatterSet;->isNotEmpty()Z

    move-result v4

    if-eqz v4, :cond_d

    .line 404
    move-object v4, v1

    check-cast v4, Landroidx/collection/ScatterSet;

    .local v4, "this_$iv":Landroidx/collection/ScatterSet;
    const/4 v6, 0x0

    .line 498
    .local v6, "$i$f$any":I
    nop

    .line 499
    move-object v7, v4

    .local v7, "this_$iv$iv":Landroidx/collection/ScatterSet;
    const/4 v8, 0x0

    .line 500
    .local v8, "$i$f$forEach":I
    nop

    .line 501
    iget-object v9, v7, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 502
    .local v9, "elements$iv$iv":[Ljava/lang/Object;
    move-object v10, v7

    .local v10, "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    const/4 v11, 0x0

    .line 503
    .local v11, "$i$f$forEachIndex":I
    nop

    .line 504
    iget-object v12, v10, Landroidx/collection/ScatterSet;->metadata:[J

    .line 505
    .local v12, "m$iv$iv$iv":[J
    array-length v13, v12

    add-int/lit8 v13, v13, -0x2

    .line 507
    .local v13, "lastIndex$iv$iv$iv":I
    const/4 v14, 0x0

    .local v14, "i$iv$iv$iv":I
    if-gt v14, v13, :cond_a

    .line 508
    :goto_0
    aget-wide v15, v12, v14

    .line 509
    .local v15, "slot$iv$iv$iv":J
    move-wide/from16 v17, v15

    .local v17, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    const/16 v19, 0x0

    .line 510
    .local v19, "$i$f$maskEmptyOrDeleted":I
    move/from16 v20, v6

    move-wide/from16 v5, v17

    move-object/from16 v17, v3

    .end local v3    # "trackedDependencies":Landroidx/collection/MutableScatterMap;
    .end local v6    # "$i$f$any":I
    .local v5, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .local v17, "trackedDependencies":Landroidx/collection/MutableScatterMap;
    .local v20, "$i$f$any":I
    not-long v2, v5

    const/16 v21, 0x7

    shl-long v2, v2, v21

    and-long/2addr v2, v5

    const-wide v21, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v2, v2, v21

    .line 509
    .end local v5    # "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .end local v19    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v2, v2, v21

    if-eqz v2, :cond_9

    .line 511
    sub-int v2, v14, v13

    not-int v2, v2

    ushr-int/lit8 v2, v2, 0x1f

    const/16 v3, 0x8

    rsub-int/lit8 v2, v2, 0x8

    .line 512
    .local v2, "bitCount$iv$iv$iv":I
    const/4 v5, 0x0

    .local v5, "j$iv$iv$iv":I
    :goto_1
    if-ge v5, v2, :cond_8

    .line 513
    const-wide/16 v21, 0xff

    and-long v21, v15, v21

    .local v21, "value$iv$iv$iv$iv":J
    const/4 v6, 0x0

    .line 514
    .local v6, "$i$f$isFull":I
    const-wide/16 v23, 0x80

    cmp-long v19, v21, v23

    if-gez v19, :cond_3

    const/4 v6, 0x1

    goto :goto_2

    :cond_3
    const/4 v6, 0x0

    .line 513
    .end local v6    # "$i$f$isFull":I
    .end local v21    # "value$iv$iv$iv$iv":J
    :goto_2
    if-eqz v6, :cond_7

    .line 515
    shl-int/lit8 v6, v14, 0x3

    add-int/2addr v6, v5

    .line 516
    .local v6, "index$iv$iv$iv":I
    move/from16 v19, v6

    .local v19, "index$iv$iv":I
    const/16 v21, 0x0

    .line 502
    .local v21, "$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv":I
    aget-object v22, v9, v19

    .local v22, "element$iv":Ljava/lang/Object;
    const/16 v23, 0x0

    .line 499
    .local v23, "$i$a$-forEach-ScatterSet$any$2$iv":I
    move-object/from16 v24, v22

    .local v24, "it":Ljava/lang/Object;
    const/16 v25, 0x0

    .line 405
    .local v25, "$i$a$-any-RecomposeScopeImpl$isInvalidFor$1":I
    move/from16 v26, v3

    move-object/from16 v3, v24

    .end local v24    # "it":Ljava/lang/Object;
    .local v3, "it":Ljava/lang/Object;
    instance-of v1, v3, Landroidx/compose/runtime/DerivedState;

    if-eqz v1, :cond_5

    move-object v1, v3

    check-cast v1, Landroidx/compose/runtime/DerivedState;

    move-object/from16 v24, v3

    move-object/from16 v3, v17

    .end local v17    # "trackedDependencies":Landroidx/collection/MutableScatterMap;
    .local v3, "trackedDependencies":Landroidx/collection/MutableScatterMap;
    .restart local v24    # "it":Ljava/lang/Object;
    invoke-direct {v0, v1, v3}, Landroidx/compose/runtime/RecomposeScopeImpl;->checkDerivedStateChanged(Landroidx/compose/runtime/DerivedState;Landroidx/collection/MutableScatterMap;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_3

    :cond_4
    const/4 v1, 0x0

    goto :goto_4

    .end local v24    # "it":Ljava/lang/Object;
    .local v3, "it":Ljava/lang/Object;
    .restart local v17    # "trackedDependencies":Landroidx/collection/MutableScatterMap;
    :cond_5
    move-object/from16 v24, v3

    move-object/from16 v3, v17

    .end local v17    # "trackedDependencies":Landroidx/collection/MutableScatterMap;
    .local v3, "trackedDependencies":Landroidx/collection/MutableScatterMap;
    .restart local v24    # "it":Ljava/lang/Object;
    :goto_3
    const/4 v1, 0x1

    .line 499
    .end local v24    # "it":Ljava/lang/Object;
    .end local v25    # "$i$a$-any-RecomposeScopeImpl$isInvalidFor$1":I
    :goto_4
    if-eqz v1, :cond_6

    const/4 v1, 0x1

    goto :goto_7

    .line 502
    .end local v22    # "element$iv":Ljava/lang/Object;
    .end local v23    # "$i$a$-forEach-ScatterSet$any$2$iv":I
    :cond_6
    nop

    .line 516
    .end local v19    # "index$iv$iv":I
    .end local v21    # "$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv":I
    goto :goto_5

    .line 513
    .end local v3    # "trackedDependencies":Landroidx/collection/MutableScatterMap;
    .end local v6    # "index$iv$iv$iv":I
    .restart local v17    # "trackedDependencies":Landroidx/collection/MutableScatterMap;
    :cond_7
    move/from16 v26, v3

    move-object/from16 v3, v17

    .line 518
    .end local v17    # "trackedDependencies":Landroidx/collection/MutableScatterMap;
    .restart local v3    # "trackedDependencies":Landroidx/collection/MutableScatterMap;
    :goto_5
    shr-long v15, v15, v26

    .line 512
    add-int/lit8 v5, v5, 0x1

    move-object/from16 v1, p1

    move-object/from16 v17, v3

    move/from16 v3, v26

    goto :goto_1

    .end local v3    # "trackedDependencies":Landroidx/collection/MutableScatterMap;
    .restart local v17    # "trackedDependencies":Landroidx/collection/MutableScatterMap;
    :cond_8
    move/from16 v26, v3

    move-object/from16 v3, v17

    .line 520
    .end local v5    # "j$iv$iv$iv":I
    .end local v17    # "trackedDependencies":Landroidx/collection/MutableScatterMap;
    .restart local v3    # "trackedDependencies":Landroidx/collection/MutableScatterMap;
    move/from16 v1, v26

    if-ne v2, v1, :cond_c

    goto :goto_6

    .line 509
    .end local v2    # "bitCount$iv$iv$iv":I
    .end local v3    # "trackedDependencies":Landroidx/collection/MutableScatterMap;
    .restart local v17    # "trackedDependencies":Landroidx/collection/MutableScatterMap;
    :cond_9
    move-object/from16 v3, v17

    .line 507
    .end local v15    # "slot$iv$iv$iv":J
    .end local v17    # "trackedDependencies":Landroidx/collection/MutableScatterMap;
    .restart local v3    # "trackedDependencies":Landroidx/collection/MutableScatterMap;
    :goto_6
    if-eq v14, v13, :cond_b

    add-int/lit8 v14, v14, 0x1

    move-object/from16 v1, p1

    move/from16 v6, v20

    const/4 v2, 0x1

    goto/16 :goto_0

    .end local v20    # "$i$f$any":I
    .local v6, "$i$f$any":I
    :cond_a
    move/from16 v20, v6

    .line 523
    .end local v6    # "$i$f$any":I
    .end local v14    # "i$iv$iv$iv":I
    .restart local v20    # "$i$f$any":I
    :cond_b
    nop

    .line 524
    .end local v10    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .end local v11    # "$i$f$forEachIndex":I
    .end local v12    # "m$iv$iv$iv":[J
    .end local v13    # "lastIndex$iv$iv$iv":I
    :cond_c
    nop

    .line 525
    .end local v7    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v8    # "$i$f$forEach":I
    .end local v9    # "elements$iv$iv":[Ljava/lang/Object;
    const/4 v1, 0x0

    .line 404
    .end local v4    # "this_$iv":Landroidx/collection/ScatterSet;
    .end local v20    # "$i$f$any":I
    :goto_7
    if-eqz v1, :cond_d

    const/4 v2, 0x1

    goto :goto_8

    :cond_d
    const/4 v2, 0x0

    goto :goto_8

    .line 408
    :cond_e
    const/4 v2, 0x1

    .line 398
    :goto_8
    return v2
.end method

.method public final observe$runtime_release(Landroidx/compose/runtime/tooling/RecomposeScopeObserver;)Landroidx/compose/runtime/tooling/CompositionObserverHandle;
    .locals 3
    .param p1, "observer"    # Landroidx/compose/runtime/tooling/RecomposeScopeObserver;

    .line 240
    invoke-static {}, Landroidx/compose/runtime/RecomposeScopeImplKt;->access$getCallbackLock$p()Ljava/lang/Object;

    move-result-object v0

    .local v0, "lock$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 495
    .local v1, "$i$f$synchronized":I
    nop

    .line 496
    monitor-enter v0

    const/4 v2, 0x0

    .line 240
    .local v2, "$i$a$-synchronized-RecomposeScopeImpl$observe$1":I
    :try_start_0
    iput-object p1, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->observer:Landroidx/compose/runtime/tooling/RecomposeScopeObserver;

    .end local v2    # "$i$a$-synchronized-RecomposeScopeImpl$observe$1":I
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 496
    monitor-exit v0

    .line 241
    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    new-instance v0, Landroidx/compose/runtime/RecomposeScopeImpl$observe$2;

    invoke-direct {v0, p0, p1}, Landroidx/compose/runtime/RecomposeScopeImpl$observe$2;-><init>(Landroidx/compose/runtime/RecomposeScopeImpl;Landroidx/compose/runtime/tooling/RecomposeScopeObserver;)V

    check-cast v0, Landroidx/compose/runtime/tooling/CompositionObserverHandle;

    return-object v0

    .line 496
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    :catchall_0
    move-exception v2

    monitor-exit v0

    throw v2
.end method

.method public final recordDerivedStateValue(Landroidx/compose/runtime/DerivedState;Ljava/lang/Object;)V
    .locals 4
    .param p1, "instance"    # Landroidx/compose/runtime/DerivedState;
    .param p2, "value"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/DerivedState<",
            "*>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 373
    iget-object v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->trackedDependencies:Landroidx/collection/MutableScatterMap;

    if-nez v0, :cond_0

    .line 374
    new-instance v0, Landroidx/collection/MutableScatterMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableScatterMap;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v0

    .line 497
    .local v1, "it":Landroidx/collection/MutableScatterMap;
    const/4 v2, 0x0

    .line 374
    .local v2, "$i$a$-also-RecomposeScopeImpl$recordDerivedStateValue$trackedDependencies$1":I
    iput-object v1, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->trackedDependencies:Landroidx/collection/MutableScatterMap;

    .line 373
    .end local v1    # "it":Landroidx/collection/MutableScatterMap;
    .end local v2    # "$i$a$-also-RecomposeScopeImpl$recordDerivedStateValue$trackedDependencies$1":I
    :cond_0
    nop

    .line 372
    nop

    .line 376
    .local v0, "trackedDependencies":Landroidx/collection/MutableScatterMap;
    invoke-virtual {v0, p1, p2}, Landroidx/collection/MutableScatterMap;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 377
    return-void
.end method

.method public final recordRead(Ljava/lang/Object;)Z
    .locals 5
    .param p1, "instance"    # Ljava/lang/Object;

    .line 358
    invoke-direct {p0}, Landroidx/compose/runtime/RecomposeScopeImpl;->getRereading()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 361
    :cond_0
    iget-object v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->trackedInstances:Landroidx/collection/MutableObjectIntMap;

    const/4 v2, 0x1

    if-nez v0, :cond_1

    new-instance v0, Landroidx/collection/MutableObjectIntMap;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Landroidx/collection/MutableObjectIntMap;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v3, v0

    .line 497
    .local v3, "it":Landroidx/collection/MutableObjectIntMap;
    const/4 v4, 0x0

    .line 361
    .local v4, "$i$a$-also-RecomposeScopeImpl$recordRead$trackedInstances$1":I
    iput-object v3, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->trackedInstances:Landroidx/collection/MutableObjectIntMap;

    .line 360
    .end local v3    # "it":Landroidx/collection/MutableObjectIntMap;
    .end local v4    # "$i$a$-also-RecomposeScopeImpl$recordRead$trackedInstances$1":I
    :cond_1
    nop

    .line 363
    .local v0, "trackedInstances":Landroidx/collection/MutableObjectIntMap;
    iget v3, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->currentToken:I

    const/4 v4, -0x1

    invoke-virtual {v0, p1, v3, v4}, Landroidx/collection/MutableObjectIntMap;->put(Ljava/lang/Object;II)I

    move-result v3

    .line 364
    .local v3, "token":I
    iget v4, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->currentToken:I

    if-ne v3, v4, :cond_2

    .line 365
    return v2

    .line 368
    :cond_2
    return v1
.end method

.method public final release()V
    .locals 2

    .line 264
    iget-object v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->owner:Landroidx/compose/runtime/RecomposeScopeOwner;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Landroidx/compose/runtime/RecomposeScopeOwner;->recomposeScopeReleased(Landroidx/compose/runtime/RecomposeScopeImpl;)V

    .line 265
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->owner:Landroidx/compose/runtime/RecomposeScopeOwner;

    .line 266
    iput-object v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->trackedInstances:Landroidx/collection/MutableObjectIntMap;

    .line 267
    iput-object v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->trackedDependencies:Landroidx/collection/MutableScatterMap;

    .line 268
    iget-object v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->observer:Landroidx/compose/runtime/tooling/RecomposeScopeObserver;

    if-eqz v0, :cond_1

    move-object v1, p0

    check-cast v1, Landroidx/compose/runtime/RecomposeScope;

    invoke-interface {v0, v1}, Landroidx/compose/runtime/tooling/RecomposeScopeObserver;->onScopeDisposed(Landroidx/compose/runtime/RecomposeScope;)V

    .line 269
    :cond_1
    return-void
.end method

.method public final rereadTrackedInstances()V
    .locals 25

    .line 422
    move-object/from16 v1, p0

    iget-object v0, v1, Landroidx/compose/runtime/RecomposeScopeImpl;->owner:Landroidx/compose/runtime/RecomposeScopeOwner;

    if-eqz v0, :cond_8

    move-object v2, v0

    .local v2, "owner":Landroidx/compose/runtime/RecomposeScopeOwner;
    const/4 v3, 0x0

    .line 423
    .local v3, "$i$a$-let-RecomposeScopeImpl$rereadTrackedInstances$1":I
    iget-object v0, v1, Landroidx/compose/runtime/RecomposeScopeImpl;->trackedInstances:Landroidx/collection/MutableObjectIntMap;

    if-eqz v0, :cond_7

    move-object v4, v0

    .local v4, "trackedInstances":Landroidx/collection/MutableObjectIntMap;
    const/4 v5, 0x0

    .line 424
    .local v5, "$i$a$-let-RecomposeScopeImpl$rereadTrackedInstances$1$1":I
    const/4 v0, 0x1

    invoke-direct {v1, v0}, Landroidx/compose/runtime/RecomposeScopeImpl;->setRereading(Z)V

    .line 425
    nop

    .line 426
    :try_start_0
    move-object v7, v4

    check-cast v7, Landroidx/collection/ObjectIntMap;

    .local v7, "this_$iv":Landroidx/collection/ObjectIntMap;
    const/4 v8, 0x0

    .line 526
    .local v8, "$i$f$forEach":I
    iget-object v9, v7, Landroidx/collection/ObjectIntMap;->keys:[Ljava/lang/Object;

    .line 527
    .local v9, "k$iv":[Ljava/lang/Object;
    iget-object v10, v7, Landroidx/collection/ObjectIntMap;->values:[I

    .line 529
    .local v10, "v$iv":[I
    move-object v11, v7

    .local v11, "this_$iv$iv":Landroidx/collection/ObjectIntMap;
    const/4 v12, 0x0

    .line 530
    .local v12, "$i$f$forEachIndexed":I
    iget-object v13, v11, Landroidx/collection/ObjectIntMap;->metadata:[J

    .line 531
    .local v13, "m$iv$iv":[J
    array-length v14, v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    add-int/lit8 v14, v14, -0x2

    .line 533
    .local v14, "lastIndex$iv$iv":I
    const/4 v15, 0x0

    .local v15, "i$iv$iv":I
    if-gt v15, v14, :cond_4

    .line 534
    :goto_0
    :try_start_1
    aget-wide v16, v13, v15

    .line 535
    .local v16, "slot$iv$iv":J
    move-wide/from16 v18, v16

    .local v18, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/16 v20, 0x0

    .line 536
    .local v20, "$i$f$maskEmptyOrDeleted":I
    move-wide/from16 v0, v18

    move-object/from16 v19, v7

    .end local v7    # "this_$iv":Landroidx/collection/ObjectIntMap;
    .end local v18    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .local v0, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .local v19, "this_$iv":Landroidx/collection/ObjectIntMap;
    not-long v6, v0

    const/16 v21, 0x7

    shl-long v6, v6, v21

    and-long/2addr v6, v0

    const-wide v21, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v0, v6, v21

    .line 535
    .end local v0    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v20    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v0, v0, v21

    if-eqz v0, :cond_3

    .line 537
    sub-int v0, v15, v14

    not-int v0, v0

    ushr-int/lit8 v0, v0, 0x1f

    const/16 v1, 0x8

    rsub-int/lit8 v0, v0, 0x8

    .line 538
    .local v0, "bitCount$iv$iv":I
    const/4 v6, 0x0

    .local v6, "j$iv$iv":I
    :goto_1
    if-ge v6, v0, :cond_2

    .line 539
    const-wide/16 v21, 0xff

    and-long v21, v16, v21

    .local v21, "value$iv$iv$iv":J
    const/4 v7, 0x0

    .line 540
    .local v7, "$i$f$isFull":I
    const-wide/16 v23, 0x80

    cmp-long v20, v21, v23

    if-gez v20, :cond_0

    const/4 v7, 0x1

    goto :goto_2

    :cond_0
    const/4 v7, 0x0

    .line 539
    .end local v7    # "$i$f$isFull":I
    .end local v21    # "value$iv$iv$iv":J
    :goto_2
    if-eqz v7, :cond_1

    .line 541
    shl-int/lit8 v7, v15, 0x3

    add-int/2addr v7, v6

    .line 542
    .local v7, "index$iv$iv":I
    move/from16 v20, v7

    .local v20, "index$iv":I
    const/16 v21, 0x0

    .line 529
    .local v21, "$i$a$-forEachIndexed-ObjectIntMap$forEach$1$iv":I
    aget-object v22, v9, v20

    aget v23, v10, v20

    move-object/from16 v23, v22

    .local v23, "value":Ljava/lang/Object;
    const/16 v22, 0x0

    .line 426
    .local v22, "$i$a$-forEach-RecomposeScopeImpl$rereadTrackedInstances$1$1$1":I
    move/from16 v24, v1

    move-object/from16 v1, v23

    .end local v23    # "value":Ljava/lang/Object;
    .local v1, "value":Ljava/lang/Object;
    invoke-interface {v2, v1}, Landroidx/compose/runtime/RecomposeScopeOwner;->recordReadOf(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 529
    .end local v1    # "value":Ljava/lang/Object;
    .end local v22    # "$i$a$-forEach-RecomposeScopeImpl$rereadTrackedInstances$1$1$1":I
    nop

    .line 542
    .end local v20    # "index$iv":I
    .end local v21    # "$i$a$-forEachIndexed-ObjectIntMap$forEach$1$iv":I
    goto :goto_3

    .line 539
    .end local v7    # "index$iv$iv":I
    :cond_1
    move/from16 v24, v1

    .line 544
    :goto_3
    shr-long v16, v16, v24

    .line 538
    add-int/lit8 v6, v6, 0x1

    move/from16 v1, v24

    goto :goto_1

    :cond_2
    move/from16 v24, v1

    .line 546
    .end local v6    # "j$iv$iv":I
    if-ne v0, v1, :cond_6

    .line 533
    .end local v0    # "bitCount$iv$iv":I
    .end local v16    # "slot$iv$iv":J
    :cond_3
    if-eq v15, v14, :cond_5

    add-int/lit8 v15, v15, 0x1

    const/4 v0, 0x1

    move-object/from16 v1, p0

    move-object/from16 v7, v19

    goto :goto_0

    .line 428
    .end local v8    # "$i$f$forEach":I
    .end local v9    # "k$iv":[Ljava/lang/Object;
    .end local v10    # "v$iv":[I
    .end local v11    # "this_$iv$iv":Landroidx/collection/ObjectIntMap;
    .end local v12    # "$i$f$forEachIndexed":I
    .end local v13    # "m$iv$iv":[J
    .end local v14    # "lastIndex$iv$iv":I
    .end local v15    # "i$iv$iv":I
    .end local v19    # "this_$iv":Landroidx/collection/ObjectIntMap;
    :catchall_0
    move-exception v0

    move-object/from16 v1, p0

    goto :goto_4

    .line 533
    .local v7, "this_$iv":Landroidx/collection/ObjectIntMap;
    .restart local v8    # "$i$f$forEach":I
    .restart local v9    # "k$iv":[Ljava/lang/Object;
    .restart local v10    # "v$iv":[I
    .restart local v11    # "this_$iv$iv":Landroidx/collection/ObjectIntMap;
    .restart local v12    # "$i$f$forEachIndexed":I
    .restart local v13    # "m$iv$iv":[J
    .restart local v14    # "lastIndex$iv$iv":I
    .restart local v15    # "i$iv$iv":I
    :cond_4
    move-object/from16 v19, v7

    .line 549
    .end local v7    # "this_$iv":Landroidx/collection/ObjectIntMap;
    .end local v15    # "i$iv$iv":I
    .restart local v19    # "this_$iv":Landroidx/collection/ObjectIntMap;
    :cond_5
    nop

    .line 550
    .end local v11    # "this_$iv$iv":Landroidx/collection/ObjectIntMap;
    .end local v12    # "$i$f$forEachIndexed":I
    .end local v13    # "m$iv$iv":[J
    .end local v14    # "lastIndex$iv$iv":I
    :cond_6
    nop

    .line 428
    .end local v8    # "$i$f$forEach":I
    .end local v9    # "k$iv":[Ljava/lang/Object;
    .end local v10    # "v$iv":[I
    .end local v19    # "this_$iv":Landroidx/collection/ObjectIntMap;
    const/4 v6, 0x0

    move-object/from16 v1, p0

    invoke-direct {v1, v6}, Landroidx/compose/runtime/RecomposeScopeImpl;->setRereading(Z)V

    .line 429
    nop

    .line 430
    nop

    .line 423
    .end local v4    # "trackedInstances":Landroidx/collection/MutableObjectIntMap;
    .end local v5    # "$i$a$-let-RecomposeScopeImpl$rereadTrackedInstances$1$1":I
    goto :goto_5

    .line 428
    .restart local v4    # "trackedInstances":Landroidx/collection/MutableObjectIntMap;
    .restart local v5    # "$i$a$-let-RecomposeScopeImpl$rereadTrackedInstances$1$1":I
    :catchall_1
    move-exception v0

    :goto_4
    const/4 v6, 0x0

    invoke-direct {v1, v6}, Landroidx/compose/runtime/RecomposeScopeImpl;->setRereading(Z)V

    throw v0

    .line 430
    .end local v4    # "trackedInstances":Landroidx/collection/MutableObjectIntMap;
    .end local v5    # "$i$a$-let-RecomposeScopeImpl$rereadTrackedInstances$1$1":I
    :cond_7
    :goto_5
    nop

    .line 422
    .end local v2    # "owner":Landroidx/compose/runtime/RecomposeScopeOwner;
    .end local v3    # "$i$a$-let-RecomposeScopeImpl$rereadTrackedInstances$1":I
    nop

    .line 432
    :cond_8
    return-void
.end method

.method public final scopeSkipped()V
    .locals 1

    .line 347
    invoke-virtual {p0}, Landroidx/compose/runtime/RecomposeScopeImpl;->getReusing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 348
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Landroidx/compose/runtime/RecomposeScopeImpl;->setSkipped(Z)V

    .line 350
    :cond_0
    return-void
.end method

.method public final setAnchor(Landroidx/compose/runtime/Anchor;)V
    .locals 0
    .param p1, "<set-?>"    # Landroidx/compose/runtime/Anchor;

    .line 97
    iput-object p1, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->anchor:Landroidx/compose/runtime/Anchor;

    return-void
.end method

.method public final setDefaultsInScope(Z)V
    .locals 1
    .param p1, "value"    # Z

    .line 174
    nop

    .line 177
    iget v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->flags:I

    .line 174
    if-eqz p1, :cond_0

    .line 175
    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->flags:I

    goto :goto_0

    .line 177
    :cond_0
    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->flags:I

    .line 179
    :goto_0
    return-void
.end method

.method public final setDefaultsInvalid(Z)V
    .locals 1
    .param p1, "value"    # Z

    .line 188
    nop

    .line 191
    iget v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->flags:I

    .line 188
    if-eqz p1, :cond_0

    .line 189
    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->flags:I

    goto :goto_0

    .line 191
    :cond_0
    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->flags:I

    .line 193
    :goto_0
    return-void
.end method

.method public final setForcedRecompose(Z)V
    .locals 1
    .param p1, "value"    # Z

    .line 318
    nop

    .line 321
    iget v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->flags:I

    .line 318
    if-eqz p1, :cond_0

    .line 319
    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->flags:I

    goto :goto_0

    .line 321
    :cond_0
    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->flags:I

    .line 323
    :goto_0
    return-void
.end method

.method public final setPaused(Z)V
    .locals 1
    .param p1, "value"    # Z

    .line 145
    nop

    .line 146
    nop

    .line 149
    iget v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->flags:I

    .line 146
    if-eqz p1, :cond_0

    .line 147
    or-int/lit16 v0, v0, 0x100

    goto :goto_0

    .line 149
    :cond_0
    and-int/lit16 v0, v0, -0x101

    .line 145
    :goto_0
    iput v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->flags:I

    .line 151
    return-void
.end method

.method public final setRequiresRecompose(Z)V
    .locals 1
    .param p1, "value"    # Z

    .line 203
    nop

    .line 206
    iget v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->flags:I

    .line 203
    if-eqz p1, :cond_0

    .line 204
    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->flags:I

    goto :goto_0

    .line 206
    :cond_0
    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->flags:I

    .line 208
    :goto_0
    return-void
.end method

.method public final setResuming(Z)V
    .locals 1
    .param p1, "value"    # Z

    .line 157
    nop

    .line 158
    nop

    .line 161
    iget v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->flags:I

    .line 158
    if-eqz p1, :cond_0

    .line 159
    or-int/lit16 v0, v0, 0x200

    goto :goto_0

    .line 161
    :cond_0
    and-int/lit16 v0, v0, -0x201

    .line 157
    :goto_0
    iput v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->flags:I

    .line 163
    return-void
.end method

.method public final setReusing(Z)V
    .locals 1
    .param p1, "value"    # Z

    .line 133
    nop

    .line 134
    nop

    .line 137
    iget v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->flags:I

    .line 134
    if-eqz p1, :cond_0

    .line 135
    or-int/lit16 v0, v0, 0x80

    goto :goto_0

    .line 137
    :cond_0
    and-int/lit16 v0, v0, -0x81

    .line 133
    :goto_0
    iput v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->flags:I

    .line 139
    return-void
.end method

.method public final setUsed(Z)V
    .locals 1
    .param p1, "value"    # Z

    .line 118
    nop

    .line 119
    nop

    .line 122
    iget v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->flags:I

    .line 119
    if-eqz p1, :cond_0

    .line 120
    or-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 122
    :cond_0
    and-int/lit8 v0, v0, -0x2

    .line 118
    :goto_0
    iput v0, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->flags:I

    .line 124
    return-void
.end method

.method public final start(I)V
    .locals 1
    .param p1, "token"    # I

    .line 342
    iput p1, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->currentToken:I

    .line 343
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroidx/compose/runtime/RecomposeScopeImpl;->setSkipped(Z)V

    .line 344
    return-void
.end method

.method public updateScope(Lkotlin/jvm/functions/Function2;)V
    .locals 0
    .param p1, "block"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 294
    iput-object p1, p0, Landroidx/compose/runtime/RecomposeScopeImpl;->block:Lkotlin/jvm/functions/Function2;

    .line 295
    return-void
.end method
