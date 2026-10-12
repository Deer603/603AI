.class public final Lcom/luchime/huiyuan/HuiyuanEngine;
.super Ljava/lang/Object;
.source "HuiyuanEngine.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/luchime/huiyuan/HuiyuanEngine$Companion;,
        Lcom/luchime/huiyuan/HuiyuanEngine$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHuiyuanEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HuiyuanEngine.kt\ncom/luchime/huiyuan/HuiyuanEngine\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,477:1\n1563#2:478\n1634#2,3:479\n1550#2:482\n1491#2:483\n1516#2,3:484\n1519#2,3:494\n1869#2:497\n1788#2,4:498\n1870#2:509\n382#3,7:487\n382#3,7:502\n1#4:510\n*S KotlinDebug\n*F\n+ 1 HuiyuanEngine.kt\ncom/luchime/huiyuan/HuiyuanEngine\n*L\n49#1:478\n49#1:479,3\n50#1:482\n51#1:483\n51#1:484,3\n51#1:494,3\n183#1:497\n184#1:498,4\n183#1:509\n51#1:487,7\n190#1:502,7\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0007\u0018\u0000 72\u00020\u0001:\u00017B\u008d\u0001\u0008\u0000\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u0012\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0006J\u0014\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010$\u001a\u00020!J\u000c\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003J\u0008\u0010&\u001a\u00020\u0006H\u0002J\u0008\u0010\'\u001a\u00020\u0006H\u0002J\u0008\u0010(\u001a\u00020\u0006H\u0002J\u000e\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003H\u0002J\u000e\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003H\u0002J\u0008\u0010+\u001a\u00020\u0006H\u0002J\u0008\u0010,\u001a\u00020\u0006H\u0002J\u0006\u0010-\u001a\u00020!J\u000e\u0010.\u001a\u00020/2\u0006\u0010\"\u001a\u00020\u0006J\u0010\u00100\u001a\u0004\u0018\u00010\u00042\u0006\u0010\"\u001a\u00020\u0006J\u000e\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0004J!\u00103\u001a\u0002H4\"\u0004\u0008\u0000\u001042\u000c\u00105\u001a\u0008\u0012\u0004\u0012\u0002H40\u0003H\u0002\u00a2\u0006\u0002\u00106R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u001d\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00180\u001c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR \u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00068"
    }
    d2 = {
        "Lcom/luchime/huiyuan/HuiyuanEngine;",
        "",
        "lexicon",
        "",
        "Lcom/luchime/huiyuan/LexiconEntry;",
        "generic",
        "",
        "greeting",
        "prefixes",
        "suffixes",
        "random",
        "Lkotlin/random/Random;",
        "matchingEntries",
        "characterPrefixes",
        "characterSuffixes",
        "persona",
        "Lcom/luchime/huiyuan/EnginePersona;",
        "<init>",
        "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/random/Random;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/luchime/huiyuan/EnginePersona;)V",
        "getLexicon",
        "()Ljava/util/List;",
        "getGreeting",
        "()Ljava/lang/String;",
        "dimensionCount",
        "",
        "getDimensionCount",
        "()I",
        "categoryCounts",
        "",
        "getCategoryCounts",
        "()Ljava/util/Map;",
        "entriesByDimension",
        "analyze",
        "Lcom/luchime/huiyuan/ReplyResult;",
        "text",
        "buildThinkSteps",
        "result",
        "randomThinkSteps",
        "personaName",
        "libraryName",
        "dimensionLabel",
        "searchSteps",
        "toolSteps",
        "wrapperName",
        "extractorName",
        "randomOne",
        "isGreeting",
        "",
        "matchEntry",
        "wrap",
        "entry",
        "pick",
        "T",
        "values",
        "(Ljava/util/List;)Ljava/lang/Object;",
        "Companion",
        "app"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/luchime/huiyuan/HuiyuanEngine$Companion;

.field private static final GREETINGS:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final GREETING_REGEX:Lkotlin/text/Regex;

.field private static final GUIGUI_PREFIX:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final GUIGUI_SEARCH_STEPS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final GUIGUI_SUFFIX:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final GUIGUI_TOOL_STEPS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final KUN_KUN_PREFIX:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final KUN_KUN_SUFFIX:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final LOG_AFTER_RESPONSE_MS:J = 0x190L

.field private static final PIAO_PREFIX:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final PIAO_SEARCH_STEPS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final PIAO_SUFFIX:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final PIAO_TOOL_STEPS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final RESPONSE_PADDING_MS:J = 0x1e0L

.field private static final SEARCH_STEPS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final STEP_INTERVAL_MS:J = 0x1aeL

.field private static final TANGO_PREFIX:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final TANGO_SEARCH_STEPS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final TANGO_SUFFIX:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final TANGO_TOOL_STEPS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final TARGET_ENTRIES_PER_DIMENSION:I = 0x3e8

.field private static final TOOL_STEPS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final categoryCounts:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final characterPrefixes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final characterSuffixes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final dimensionCount:I

.field private final entriesByDimension:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/luchime/huiyuan/LexiconEntry;",
            ">;>;"
        }
    .end annotation
.end field

.field private final generic:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final greeting:Ljava/lang/String;

.field private final lexicon:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/luchime/huiyuan/LexiconEntry;",
            ">;"
        }
    .end annotation
.end field

.field private final matchingEntries:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/luchime/huiyuan/LexiconEntry;",
            ">;"
        }
    .end annotation
.end field

.field private final persona:Lcom/luchime/huiyuan/EnginePersona;

.field private final prefixes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final random:Lkotlin/random/Random;

.field private final suffixes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lcom/luchime/huiyuan/HuiyuanEngine$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/luchime/huiyuan/HuiyuanEngine$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/luchime/huiyuan/HuiyuanEngine;->Companion:Lcom/luchime/huiyuan/HuiyuanEngine$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/luchime/huiyuan/HuiyuanEngine;->$stable:I

    .line 235
    new-instance v0, Lkotlin/text/Regex;

    .line 236
    nop

    .line 237
    sget-object v1, Lkotlin/text/RegexOption;->IGNORE_CASE:Lkotlin/text/RegexOption;

    .line 235
    const-string v2, "^(\u4f60\u597d|\u60a8\u597d|hi|hello|\u5728\u5417|\u5728\u4e0d\u5728|\u54c8\u55bd|\u55e8|\u5582)"

    invoke-direct {v0, v2, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;Lkotlin/text/RegexOption;)V

    sput-object v0, Lcom/luchime/huiyuan/HuiyuanEngine;->GREETING_REGEX:Lkotlin/text/Regex;

    .line 239
    const/4 v0, 0x7

    new-array v1, v0, [Ljava/lang/String;

    const-string v2, "\u4f60\u597d"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "\u60a8\u597d"

    const/4 v4, 0x1

    aput-object v2, v1, v4

    const-string v2, "\u5728\u5417"

    const/4 v5, 0x2

    aput-object v2, v1, v5

    const-string v2, "hi"

    const/4 v6, 0x3

    aput-object v2, v1, v6

    const-string v2, "hello"

    const/4 v7, 0x4

    aput-object v2, v1, v7

    const-string v2, "\u54c8\u55bd"

    const/4 v8, 0x5

    aput-object v2, v1, v8

    const-string v2, "\u55e8"

    const/4 v9, 0x6

    aput-object v2, v1, v9

    invoke-static {v1}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    sput-object v1, Lcom/luchime/huiyuan/HuiyuanEngine;->GREETINGS:Ljava/util/Set;

    .line 241
    nop

    .line 242
    new-array v1, v9, [Ljava/lang/String;

    const-string v2, "\u56f0\u56f0\u6765\u5566\uff5e "

    aput-object v2, v1, v3

    .line 243
    const-string v2, "\u56f0\u56f0\u89c9\u5f97\u5440\uff0c"

    aput-object v2, v1, v4

    .line 242
    nop

    .line 244
    const-string v2, "\u8ba9\u56f0\u56f0\u60f3\u60f3\u54e6\u2014\u2014"

    aput-object v2, v1, v5

    .line 242
    nop

    .line 245
    const-string v2, "\u56f0\u56f0\u60f3\u548c\u4f60\u8bf4\uff0c"

    aput-object v2, v1, v6

    .line 242
    nop

    .line 246
    const-string v2, "\u56f0\u56f0\u6b6a\u5934\u60f3\u60f3\uff1a"

    aput-object v2, v1, v7

    .line 242
    nop

    .line 247
    const-string v2, "\u547c\uff5e\u56f0\u56f0\u6ce1\u5b8c\u6c34\u6765\u7b54\u4f60\u5566\uff1a"

    aput-object v2, v1, v8

    .line 242
    nop

    .line 241
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, Lcom/luchime/huiyuan/HuiyuanEngine;->KUN_KUN_PREFIX:Ljava/util/List;

    .line 250
    nop

    .line 251
    new-array v1, v8, [Ljava/lang/String;

    const-string v2, "\uff5e\u56f0\u56f0\u8bf4\u7684\u54e6"

    aput-object v2, v1, v3

    .line 252
    const-string v2, "\uff08\u56f0\u56f0\u6b6a\u5934\uff09"

    aput-object v2, v1, v4

    .line 251
    nop

    .line 253
    const-string v2, "\u56f0\u56f0\u966a\u4f60\u4e00\u8d77\u60f3\u901a\u5b83\uff5e"

    aput-object v2, v1, v5

    .line 251
    nop

    .line 254
    const-string v2, "\u8981\u76f8\u4fe1\u56f0\u56f0\u5440"

    aput-object v2, v1, v6

    .line 251
    nop

    .line 255
    const-string v2, "\u56f0\u56f0\u4f1a\u4e00\u76f4\u966a\u7740\u4f60\u54d2\uff5e"

    aput-object v2, v1, v7

    .line 251
    nop

    .line 250
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, Lcom/luchime/huiyuan/HuiyuanEngine;->KUN_KUN_SUFFIX:Ljava/util/List;

    .line 258
    nop

    .line 259
    new-array v1, v6, [Ljava/lang/String;

    const-string v2, "\ud83d\udd0d \u6b63\u5728\u68c0\u7d22\u9ad8\u8ba4\u77e5\u8bed\u5f55\u5e93\u2026"

    aput-object v2, v1, v3

    .line 260
    const-string v2, "\ud83d\udce1 \u6b63\u5728\u8054\u7f51\u6bd4\u5bf9\u8ba4\u77e5\u8d44\u6599\u2026"

    aput-object v2, v1, v4

    .line 259
    nop

    .line 261
    const-string v2, "\ud83d\uddc2 \u6b63\u5728\u8c03\u53d6\u5386\u53f2\u8bed\u5f55\u7d22\u5f15\u2026"

    aput-object v2, v1, v5

    .line 259
    nop

    .line 258
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, Lcom/luchime/huiyuan/HuiyuanEngine;->SEARCH_STEPS:Ljava/util/List;

    .line 264
    nop

    .line 265
    new-array v1, v6, [Ljava/lang/String;

    const-string v2, "\ud83e\udde0 \u8c03\u7528\u5de5\u5177\u300c\u8ba4\u77e5\u7d22\u5f15\u5668\u300d\u5339\u914d\u7ef4\u5ea6\u2026"

    aput-object v2, v1, v3

    .line 266
    const-string v2, "\u2699\ufe0f \u8c03\u7528\u5de5\u5177\u300c\u8bed\u4e49\u6620\u5c04\u5668\u300d\u89e3\u6790\u5173\u952e\u8bcd\u2026"

    aput-object v2, v1, v4

    .line 265
    nop

    .line 267
    const-string v2, "\ud83d\udd27 \u8c03\u7528\u5de5\u5177\u300c\u7ef4\u5ea6\u5206\u7c7b\u5668\u300d\u505a\u805a\u7c7b\u2026"

    aput-object v2, v1, v5

    .line 265
    nop

    .line 264
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, Lcom/luchime/huiyuan/HuiyuanEngine;->TOOL_STEPS:Ljava/util/List;

    .line 270
    nop

    .line 271
    new-array v1, v9, [Ljava/lang/String;

    const-string v2, "\u8001\u5b50\u6765\u4e86\u2014\u2014"

    aput-object v2, v1, v3

    const-string v2, "\u672c\u6734\u89c9\u5f97\u5427\uff0c"

    aput-object v2, v1, v4

    const-string v2, "\u8ba9\u8001\u5b50\u6734\u4e00\u6734\u2014\u2014"

    aput-object v2, v1, v5

    .line 272
    const-string v2, "\u4f60\u8fd9\u4e2a\u95ee\u9898\uff0c"

    aput-object v2, v1, v6

    .line 271
    nop

    .line 272
    const-string v2, "\u64cd\uff0c\u8001\u5b50\u5f97\u5148\u8bf4\u4e00\u53e5\uff1a"

    aput-object v2, v1, v7

    .line 271
    nop

    .line 272
    const-string v2, "\u5377\u6bdb\u4f01\u9e45\u4e0a\u7ebf\uff1a"

    aput-object v2, v1, v8

    .line 271
    nop

    .line 270
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, Lcom/luchime/huiyuan/HuiyuanEngine;->PIAO_PREFIX:Ljava/util/List;

    .line 275
    nop

    .line 276
    new-array v1, v9, [Ljava/lang/String;

    const-string v2, "\u9e21\u5df4\u98de\u4e86\uff0c\u6563\u4f1a\u3002"

    aput-object v2, v1, v3

    const-string v2, "\u2014\u2014\u6734\u4e00\u6734\uff0c\u5c31\u8fd9\u6837\u3002"

    aput-object v2, v1, v4

    const-string v2, "\u4f60\u61c2\u4e2a\u9e21\u5df4\uff1f"

    aput-object v2, v1, v5

    .line 277
    const-string v2, "\u8001\u5b50\u8bf4\u5b8c\uff0c\u7231\u542c\u4e0d\u542c\u3002"

    aput-object v2, v1, v6

    .line 276
    nop

    .line 277
    const-string v2, "\u53bb deskpark \u4e3b\u573a\u627e\u8001\u5b50\u3002"

    aput-object v2, v1, v7

    .line 276
    nop

    .line 277
    const-string v2, "\u6734\u6734\u770b\uff0c\u4e0d\u884c\u518d\u9a82\u3002"

    aput-object v2, v1, v8

    .line 276
    nop

    .line 275
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, Lcom/luchime/huiyuan/HuiyuanEngine;->PIAO_SUFFIX:Ljava/util/List;

    .line 280
    nop

    .line 281
    new-array v1, v6, [Ljava/lang/String;

    const-string v2, "\ud83d\udc27 \u6734AI\u6b63\u5728\u68c0\u7d22\u6734\u8bed\u5f55\u5e93\u2026"

    aput-object v2, v1, v3

    .line 282
    const-string v2, "\ud83d\udce1 \u6734AI\u6b63\u5728\u8c03\u53d6deskpark\u4e3b\u573a\u7d22\u5f15\u2026"

    aput-object v2, v1, v4

    .line 281
    nop

    .line 283
    const-string v2, "\ud83d\uddc2 \u6734AI\u7ffb\u5f00\u81ea\u5df1\u7684\u82b1\u886c\u886b\u53e3\u888b\u2026"

    aput-object v2, v1, v5

    .line 281
    nop

    .line 280
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, Lcom/luchime/huiyuan/HuiyuanEngine;->PIAO_SEARCH_STEPS:Ljava/util/List;

    .line 286
    nop

    .line 287
    new-array v1, v6, [Ljava/lang/String;

    const-string v2, "\ud83e\udde0 \u8c03\u7528\u5de5\u5177\u300c\u6734\u5f0f\u8bed\u4e49\u68c0\u7d22\u5668\u300d\u5339\u914d\u7ef4\u5ea6\u2026"

    aput-object v2, v1, v3

    .line 288
    const-string v2, "\u2699\ufe0f \u8c03\u7528\u5de5\u5177\u300c\u5377\u6bdb\u5206\u7c7b\u5668\u300d\u89e3\u6790\u5173\u952e\u8bcd\u2026"

    aput-object v2, v1, v4

    .line 287
    nop

    .line 289
    const-string v2, "\ud83d\udd27 \u8c03\u7528\u5de5\u5177\u300c\u8d85\u58f0\u6ce2\u5b9a\u5411\u8fc7\u6ee4\u5668\u300d\u805a\u7c7b\u2026"

    aput-object v2, v1, v5

    .line 287
    nop

    .line 286
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, Lcom/luchime/huiyuan/HuiyuanEngine;->PIAO_TOOL_STEPS:Ljava/util/List;

    .line 292
    nop

    .line 293
    new-array v1, v0, [Ljava/lang/String;

    const-string v2, "\u9f9f\u9f9f\u6765\u5566\uff5e "

    aput-object v2, v1, v3

    const-string v2, "\u9f9f\u9f9f\u89c9\u5f97\u5440\uff0c"

    aput-object v2, v1, v4

    const-string v2, "\u8ba9\u9f9f\u9f9f\u60f3\u60f3\u54e6\u2014\u2014"

    aput-object v2, v1, v5

    .line 294
    const-string v2, "\u9f9f\u9f9f\u60f3\u548c\u4f60\u8bf4\uff0c"

    aput-object v2, v1, v6

    .line 293
    nop

    .line 294
    const-string v2, "\u9f9f\u9f9f\u6b6a\u5934\u60f3\u60f3\uff1a"

    aput-object v2, v1, v7

    .line 293
    nop

    .line 294
    const-string v2, "\u563f\u563f\uff0c\u5377\u6bdb\u9f9f\u4e0a\u7ebf\uff1a"

    aput-object v2, v1, v8

    .line 293
    nop

    .line 295
    const-string v2, "\u9f9f\u9f9f\u7684\u5c0f\u8111\u888b\u8f6c\u8d77\u6765\u5566\uff1a"

    aput-object v2, v1, v9

    .line 293
    nop

    .line 292
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, Lcom/luchime/huiyuan/HuiyuanEngine;->GUIGUI_PREFIX:Ljava/util/List;

    .line 298
    nop

    .line 299
    new-array v1, v9, [Ljava/lang/String;

    const-string v2, "\uff5e\u9f9f\u9f9f\u8bf4\u7684\u54e6"

    aput-object v2, v1, v3

    const-string v2, "\uff08\u9f9f\u9f9f\u7f29\u5934\u5bb3\u7f9e\uff09"

    aput-object v2, v1, v4

    const-string v2, "\u9f9f\u9f9f\u4f1a\u4e00\u76f4\u966a\u7740\u4f60\u54d2\uff5e"

    aput-object v2, v1, v5

    .line 300
    const-string v2, "\u8981\u76f8\u4fe1\u9f9f\u9f9f\u5440"

    aput-object v2, v1, v6

    .line 299
    nop

    .line 300
    const-string v2, "\u8d34\u8d34\uff5e"

    aput-object v2, v1, v7

    .line 299
    nop

    .line 300
    const-string v2, "\u9f9f\u9f9f\u8bf4\u5b8c\u5566\uff0c\u4f60\u8981\u597d\u597d\u7684\u54e6"

    aput-object v2, v1, v8

    .line 299
    nop

    .line 298
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, Lcom/luchime/huiyuan/HuiyuanEngine;->GUIGUI_SUFFIX:Ljava/util/List;

    .line 303
    nop

    .line 304
    new-array v1, v6, [Ljava/lang/String;

    const-string v2, "\ud83d\udc22 \u9f9f\u9f9f\u6b63\u5728\u68c0\u7d22\u9f9f\u9f9f\u8bed\u5f55\u5e93\u2026"

    aput-object v2, v1, v3

    const-string v2, "\ud83d\udce1 \u9f9f\u9f9f\u6b63\u5728\u8c03\u53d6\u77e5\u8bc6\u7d22\u5f15\u2026"

    aput-object v2, v1, v4

    const-string v2, "\ud83d\uddc2 \u9f9f\u9f9f\u7ffb\u5f00\u81ea\u5df1\u7684\u5c0f\u672c\u672c\u2026"

    aput-object v2, v1, v5

    .line 303
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, Lcom/luchime/huiyuan/HuiyuanEngine;->GUIGUI_SEARCH_STEPS:Ljava/util/List;

    .line 307
    nop

    .line 308
    new-array v1, v6, [Ljava/lang/String;

    const-string v2, "\ud83e\udde0 \u8c03\u7528\u5de5\u5177\u300c\u9f9f\u9f9f\u8bed\u4e49\u68c0\u7d22\u5668\u300d\u5339\u914d\u7ef4\u5ea6\u2026"

    aput-object v2, v1, v3

    .line 309
    const-string v2, "\u2699\ufe0f \u8c03\u7528\u5de5\u5177\u300c\u5377\u6bdb\u77e5\u8bc6\u5206\u7c7b\u5668\u300d\u89e3\u6790\u5173\u952e\u8bcd\u2026"

    aput-object v2, v1, v4

    .line 308
    nop

    .line 310
    const-string v2, "\ud83d\udd27 \u8c03\u7528\u5de5\u5177\u300c\u571f\u5bb6\u65cf\u6587\u5316\u8fc7\u6ee4\u5668\u300d\u805a\u7c7b\u2026"

    aput-object v2, v1, v5

    .line 308
    nop

    .line 307
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, Lcom/luchime/huiyuan/HuiyuanEngine;->GUIGUI_TOOL_STEPS:Ljava/util/List;

    .line 313
    nop

    .line 314
    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "\u63a2\u6208\u6765\u5566\uff5e "

    aput-object v1, v0, v3

    const-string v1, "\u672c\u718a\u89c9\u5f97\u5440\uff0c"

    aput-object v1, v0, v4

    const-string v1, "\u8ba9\u63a2\u6208\u60f3\u60f3\u54e6\u2014\u2014"

    aput-object v1, v0, v5

    .line 315
    const-string v1, "\u63a2\u6208\u6b6a\u7740\u5927\u8111\u888b\u60f3\u60f3\uff1a"

    aput-object v1, v0, v6

    .line 314
    nop

    .line 315
    const-string v1, "\u672c\u718a\u64e6\u64e6\u53e3\u6c34\u8bf4\uff1a"

    aput-object v1, v0, v7

    .line 314
    nop

    .line 316
    const-string v1, "Zzz\u2026\u554a\uff1f\u597d\u597d\u597d\u672c\u718a\u8bf4\uff1a"

    aput-object v1, v0, v8

    .line 314
    nop

    .line 316
    const-string v1, "\u63a2\u6208\u6320\u6320\u809a\u5b50\uff1a"

    aput-object v1, v0, v9

    .line 314
    nop

    .line 313
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/luchime/huiyuan/HuiyuanEngine;->TANGO_PREFIX:Ljava/util/List;

    .line 319
    nop

    .line 320
    new-array v0, v9, [Ljava/lang/String;

    const-string v1, "\uff5e\u63a2\u6208\u8bf4\u7684\u54e6"

    aput-object v1, v0, v3

    const-string v1, "\uff08\u672c\u718a\u6253\u4e86\u4e2a\u54c8\u6b20\uff09"

    aput-object v1, v0, v4

    const-string v1, "Zzz\u2026"

    aput-object v1, v0, v5

    const-string v1, "\u63a2\u6208\u8bf4\u5b8c\u8981\u53bb\u6253\u547c\u565c\u4e86"

    aput-object v1, v0, v6

    .line 321
    const-string v1, "\u4f60\u5403\u4e86\u5417\uff1f\u672c\u718a\u997f\u4e86\u3002"

    aput-object v1, v0, v7

    .line 320
    nop

    .line 321
    const-string v1, "\u522b\u95ee\u672c\u718a\u4eba\u751f\u5efa\u8bae\u554a\uff0c\u672c\u718a\u8ba4\u77e5\u7ea6\u7b49\u4e8e NULL"

    aput-object v1, v0, v8

    .line 320
    nop

    .line 319
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/luchime/huiyuan/HuiyuanEngine;->TANGO_SUFFIX:Ljava/util/List;

    .line 324
    nop

    .line 325
    new-array v0, v7, [Ljava/lang/String;

    const-string v1, "\ud83d\udc3b \u63a2\u6208\u6b63\u5728\u7ffb\u8bed\u5f55\u5e93\u2026"

    aput-object v1, v0, v3

    const-string v1, "\ud83d\udce1 \u63a2\u6208\u6b63\u5728\u8c03\u53d6\u77e5\u8bc6\u7d22\u5f15\u2026"

    aput-object v1, v0, v4

    .line 326
    const-string v1, "\ud83d\uddc2 \u63a2\u6208\u7ffb\u5f00\u81ea\u5df1\u7684\u5c0f\u672c\u672c\u2026"

    aput-object v1, v0, v5

    .line 325
    nop

    .line 326
    const-string v1, "\ud83c\udf56 \u63a2\u6208\u5148\u64e6\u4e86\u64e6\u53e3\u6c34\u518d\u5f00\u59cb\u68c0\u7d22\u2026"

    aput-object v1, v0, v6

    .line 325
    nop

    .line 324
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/luchime/huiyuan/HuiyuanEngine;->TANGO_SEARCH_STEPS:Ljava/util/List;

    .line 329
    nop

    .line 330
    new-array v0, v7, [Ljava/lang/String;

    const-string v1, "\ud83e\udde0 \u8c03\u7528\u5de5\u5177\u300c\u63a2\u6208\u8bed\u4e49\u68c0\u7d22\u5668\u300d\u5339\u914d\u7ef4\u5ea6\u2026"

    aput-object v1, v0, v3

    .line 331
    const-string v1, "\u2699\ufe0f \u8c03\u7528\u5de5\u5177\u300c\u80d6\u718a\u77e5\u8bc6\u5206\u7c7b\u5668\u300d\u89e3\u6790\u5173\u952e\u8bcd\u2026"

    aput-object v1, v0, v4

    .line 330
    nop

    .line 332
    const-string v1, "\ud83d\udd27 \u8c03\u7528\u5de5\u5177\u300c\u4f4e\u8ba4\u77e5\u8fc7\u6ee4\u5668\u300d\u805a\u7c7b\u2026"

    aput-object v1, v0, v5

    .line 330
    nop

    .line 333
    const-string v1, "\ud83d\udcbb \u8c03\u7528\u5de5\u5177\u300cLinux\u547d\u4ee4\u884c\u68c0\u7d22\u5668\u300d\u5339\u914d\u2026"

    aput-object v1, v0, v6

    .line 330
    nop

    .line 329
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/luchime/huiyuan/HuiyuanEngine;->TANGO_TOOL_STEPS:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/random/Random;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/luchime/huiyuan/EnginePersona;)V
    .locals 21
    .param p1, "lexicon"    # Ljava/util/List;
    .param p2, "generic"    # Ljava/util/List;
    .param p3, "greeting"    # Ljava/lang/String;
    .param p4, "prefixes"    # Ljava/util/List;
    .param p5, "suffixes"    # Ljava/util/List;
    .param p6, "random"    # Lkotlin/random/Random;
    .param p7, "matchingEntries"    # Ljava/util/List;
    .param p8, "characterPrefixes"    # Ljava/util/List;
    .param p9, "characterSuffixes"    # Ljava/util/List;
    .param p10, "persona"    # Lcom/luchime/huiyuan/EnginePersona;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/luchime/huiyuan/LexiconEntry;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/random/Random;",
            "Ljava/util/List<",
            "Lcom/luchime/huiyuan/LexiconEntry;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/luchime/huiyuan/EnginePersona;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    const-string v11, "lexicon"

    invoke-static {v1, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "generic"

    invoke-static {v2, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "greeting"

    invoke-static {v3, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "prefixes"

    invoke-static {v4, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "suffixes"

    invoke-static {v5, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "random"

    invoke-static {v6, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "matchingEntries"

    invoke-static {v7, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "characterPrefixes"

    invoke-static {v8, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "characterSuffixes"

    invoke-static {v9, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "persona"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object v1, v0, Lcom/luchime/huiyuan/HuiyuanEngine;->lexicon:Ljava/util/List;

    .line 39
    iput-object v2, v0, Lcom/luchime/huiyuan/HuiyuanEngine;->generic:Ljava/util/List;

    .line 40
    iput-object v3, v0, Lcom/luchime/huiyuan/HuiyuanEngine;->greeting:Ljava/lang/String;

    .line 41
    iput-object v4, v0, Lcom/luchime/huiyuan/HuiyuanEngine;->prefixes:Ljava/util/List;

    .line 42
    iput-object v5, v0, Lcom/luchime/huiyuan/HuiyuanEngine;->suffixes:Ljava/util/List;

    .line 43
    iput-object v6, v0, Lcom/luchime/huiyuan/HuiyuanEngine;->random:Lkotlin/random/Random;

    .line 44
    iput-object v7, v0, Lcom/luchime/huiyuan/HuiyuanEngine;->matchingEntries:Ljava/util/List;

    .line 45
    iput-object v8, v0, Lcom/luchime/huiyuan/HuiyuanEngine;->characterPrefixes:Ljava/util/List;

    .line 46
    iput-object v9, v0, Lcom/luchime/huiyuan/HuiyuanEngine;->characterSuffixes:Ljava/util/List;

    .line 47
    iput-object v10, v0, Lcom/luchime/huiyuan/HuiyuanEngine;->persona:Lcom/luchime/huiyuan/EnginePersona;

    .line 49
    iget-object v11, v0, Lcom/luchime/huiyuan/HuiyuanEngine;->lexicon:Ljava/util/List;

    check-cast v11, Ljava/lang/Iterable;

    .local v11, "$this$map\\1":Ljava/lang/Iterable;
    const/4 v12, 0x0

    .line 478
    .local v12, "$i$f$map\\1\\49":I
    new-instance v13, Ljava/util/ArrayList;

    const/16 v14, 0xa

    invoke-static {v11, v14}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v13, Ljava/util/Collection;

    .local v13, "destination\\2":Ljava/util/Collection;
    move-object v14, v11

    .local v14, "$this$mapTo\\2":Ljava/lang/Iterable;
    const/4 v15, 0x0

    .line 479
    .local v15, "$i$f$mapTo\\2\\478":I
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_0
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_0

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    .line 480
    .local v17, "item\\2":Ljava/lang/Object;
    move-object/from16 v18, v17

    check-cast v18, Lcom/luchime/huiyuan/LexiconEntry;

    .local v18, "it\\3":Lcom/luchime/huiyuan/LexiconEntry;
    const/16 v19, 0x0

    .line 49
    .local v19, "$i$a$-map-HuiyuanEngine$dimensionCount$1\\3\\480\\0":I
    invoke-virtual/range {v18 .. v18}, Lcom/luchime/huiyuan/LexiconEntry;->getCategory()Ljava/lang/String;

    move-result-object v1

    .line 480
    .end local v18    # "it\\3":Lcom/luchime/huiyuan/LexiconEntry;
    .end local v19    # "$i$a$-map-HuiyuanEngine$dimensionCount$1\\3\\480\\0":I
    invoke-interface {v13, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, p1

    goto :goto_0

    .line 481
    .end local v17    # "item\\2":Ljava/lang/Object;
    :cond_0
    nop

    .end local v13    # "destination\\2":Ljava/util/Collection;
    .end local v14    # "$this$mapTo\\2":Ljava/lang/Iterable;
    .end local v15    # "$i$f$mapTo\\2\\478":I
    move-object v1, v13

    check-cast v1, Ljava/util/List;

    .line 478
    nop

    .end local v11    # "$this$map\\1":Ljava/lang/Iterable;
    .end local v12    # "$i$f$map\\1\\49":I
    check-cast v1, Ljava/lang/Iterable;

    .line 49
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v1

    iput v1, v0, Lcom/luchime/huiyuan/HuiyuanEngine;->dimensionCount:I

    .line 50
    iget-object v1, v0, Lcom/luchime/huiyuan/HuiyuanEngine;->lexicon:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$groupingBy\\4":Ljava/lang/Iterable;
    const/4 v11, 0x0

    .line 482
    .local v11, "$i$f$groupingBy\\4\\50":I
    new-instance v12, Lcom/luchime/huiyuan/HuiyuanEngine$special$$inlined$groupingBy$1;

    invoke-direct {v12, v1}, Lcom/luchime/huiyuan/HuiyuanEngine$special$$inlined$groupingBy$1;-><init>(Ljava/lang/Iterable;)V

    check-cast v12, Lkotlin/collections/Grouping;

    .line 50
    .end local v1    # "$this$groupingBy\\4":Ljava/lang/Iterable;
    .end local v11    # "$i$f$groupingBy\\4\\50":I
    invoke-static {v12}, Lkotlin/collections/GroupingKt;->eachCount(Lkotlin/collections/Grouping;)Ljava/util/Map;

    move-result-object v1

    iput-object v1, v0, Lcom/luchime/huiyuan/HuiyuanEngine;->categoryCounts:Ljava/util/Map;

    .line 51
    iget-object v1, v0, Lcom/luchime/huiyuan/HuiyuanEngine;->lexicon:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$groupBy\\5":Ljava/lang/Iterable;
    const/4 v11, 0x0

    .line 483
    .local v11, "$i$f$groupBy\\5\\51":I
    new-instance v12, Ljava/util/LinkedHashMap;

    invoke-direct {v12}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v12, Ljava/util/Map;

    .local v12, "destination\\6":Ljava/util/Map;
    move-object v13, v1

    .local v13, "$this$groupByTo\\6":Ljava/lang/Iterable;
    const/4 v14, 0x0

    .line 484
    .local v14, "$i$f$groupByTo\\6\\483":I
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_1
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_2

    move-object/from16 v16, v1

    .end local v1    # "$this$groupBy\\5":Ljava/lang/Iterable;
    .local v16, "$this$groupBy\\5":Ljava/lang/Iterable;
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 485
    .local v1, "element\\6":Ljava/lang/Object;
    move-object/from16 v17, v1

    check-cast v17, Lcom/luchime/huiyuan/LexiconEntry;

    .local v17, "it\\9":Lcom/luchime/huiyuan/LexiconEntry;
    const/16 v18, 0x0

    .line 51
    .local v18, "$i$a$-groupBy-HuiyuanEngine$entriesByDimension$1\\9\\485\\0":I
    invoke-virtual/range {v17 .. v17}, Lcom/luchime/huiyuan/LexiconEntry;->getCategory()Ljava/lang/String;

    move-result-object v17

    .line 485
    .end local v17    # "it\\9":Lcom/luchime/huiyuan/LexiconEntry;
    .end local v18    # "$i$a$-groupBy-HuiyuanEngine$entriesByDimension$1\\9\\485\\0":I
    move-object/from16 v18, v17

    .line 486
    .local v18, "key\\6":Ljava/lang/Object;
    move-object/from16 v17, v12

    .local v17, "$this$getOrPut\\7":Ljava/util/Map;
    const/16 v19, 0x0

    .line 487
    .local v19, "$i$f$getOrPut\\7\\486":I
    move-object/from16 v3, v17

    move-object/from16 v2, v18

    .end local v17    # "$this$getOrPut\\7":Ljava/util/Map;
    .end local v18    # "key\\6":Ljava/lang/Object;
    .local v2, "key\\6":Ljava/lang/Object;
    .local v3, "$this$getOrPut\\7":Ljava/util/Map;
    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v17

    .line 488
    .local v17, "value\\7":Ljava/lang/Object;
    if-nez v17, :cond_1

    .line 489
    const/16 v18, 0x0

    .line 486
    .local v18, "$i$a$-getOrPut-CollectionsKt___CollectionsKt$groupByTo$list$1\\8\\489\\6":I
    new-instance v20, Ljava/util/ArrayList;

    invoke-direct/range {v20 .. v20}, Ljava/util/ArrayList;-><init>()V

    check-cast v20, Ljava/util/List;

    .line 489
    .end local v18    # "$i$a$-getOrPut-CollectionsKt___CollectionsKt$groupByTo$list$1\\8\\489\\6":I
    move-object/from16 v18, v20

    .line 490
    .local v18, "answer\\7":Ljava/lang/Object;
    move-object/from16 v4, v18

    .end local v18    # "answer\\7":Ljava/lang/Object;
    .local v4, "answer\\7":Ljava/lang/Object;
    invoke-interface {v3, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 491
    nop

    .end local v4    # "answer\\7":Ljava/lang/Object;
    goto :goto_2

    .line 493
    :cond_1
    move-object/from16 v18, v17

    .line 488
    :goto_2
    nop

    .line 486
    .end local v3    # "$this$getOrPut\\7":Ljava/util/Map;
    .end local v17    # "value\\7":Ljava/lang/Object;
    .end local v19    # "$i$f$getOrPut\\7\\486":I
    move-object/from16 v3, v18

    check-cast v3, Ljava/util/List;

    .line 494
    .local v3, "list\\6":Ljava/util/List;
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v1, v16

    .end local v2    # "key\\6":Ljava/lang/Object;
    .end local v3    # "list\\6":Ljava/util/List;
    goto :goto_1

    .line 496
    .end local v16    # "$this$groupBy\\5":Ljava/lang/Iterable;
    .local v1, "$this$groupBy\\5":Ljava/lang/Iterable;
    :cond_2
    nop

    .line 483
    .end local v12    # "destination\\6":Ljava/util/Map;
    .end local v13    # "$this$groupByTo\\6":Ljava/lang/Iterable;
    .end local v14    # "$i$f$groupByTo\\6\\483":I
    nop

    .line 51
    .end local v1    # "$this$groupBy\\5":Ljava/lang/Iterable;
    .end local v11    # "$i$f$groupBy\\5\\51":I
    iput-object v12, v0, Lcom/luchime/huiyuan/HuiyuanEngine;->entriesByDimension:Ljava/util/Map;

    .line 37
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/random/Random;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/luchime/huiyuan/EnginePersona;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    .line 37
    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_0

    .line 43
    sget-object v1, Lkotlin/random/Random;->Default:Lkotlin/random/Random$Default;

    check-cast v1, Lkotlin/random/Random;

    move-object v8, v1

    goto :goto_0

    .line 37
    :cond_0
    move-object/from16 v8, p6

    :goto_0
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_1

    .line 44
    move-object v9, p1

    goto :goto_1

    .line 37
    :cond_1
    move-object/from16 v9, p7

    :goto_1
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_2

    .line 45
    sget-object v1, Lcom/luchime/huiyuan/HuiyuanEngine;->KUN_KUN_PREFIX:Ljava/util/List;

    move-object v10, v1

    goto :goto_2

    .line 37
    :cond_2
    move-object/from16 v10, p8

    :goto_2
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_3

    .line 46
    sget-object v1, Lcom/luchime/huiyuan/HuiyuanEngine;->KUN_KUN_SUFFIX:Ljava/util/List;

    move-object v11, v1

    goto :goto_3

    .line 37
    :cond_3
    move-object/from16 v11, p9

    :goto_3
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_4

    .line 47
    sget-object v0, Lcom/luchime/huiyuan/EnginePersona;->HUIYUAN:Lcom/luchime/huiyuan/EnginePersona;

    move-object v12, v0

    goto :goto_4

    .line 37
    :cond_4
    move-object/from16 v12, p10

    :goto_4
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    invoke-direct/range {v2 .. v12}, Lcom/luchime/huiyuan/HuiyuanEngine;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/random/Random;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/luchime/huiyuan/EnginePersona;)V

    .line 48
    return-void
.end method

.method public static final synthetic access$getGUIGUI_PREFIX$cp()Ljava/util/List;
    .locals 1

    .line 37
    sget-object v0, Lcom/luchime/huiyuan/HuiyuanEngine;->GUIGUI_PREFIX:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic access$getGUIGUI_SUFFIX$cp()Ljava/util/List;
    .locals 1

    .line 37
    sget-object v0, Lcom/luchime/huiyuan/HuiyuanEngine;->GUIGUI_SUFFIX:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic access$getKUN_KUN_PREFIX$cp()Ljava/util/List;
    .locals 1

    .line 37
    sget-object v0, Lcom/luchime/huiyuan/HuiyuanEngine;->KUN_KUN_PREFIX:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic access$getKUN_KUN_SUFFIX$cp()Ljava/util/List;
    .locals 1

    .line 37
    sget-object v0, Lcom/luchime/huiyuan/HuiyuanEngine;->KUN_KUN_SUFFIX:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic access$getPIAO_PREFIX$cp()Ljava/util/List;
    .locals 1

    .line 37
    sget-object v0, Lcom/luchime/huiyuan/HuiyuanEngine;->PIAO_PREFIX:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic access$getPIAO_SUFFIX$cp()Ljava/util/List;
    .locals 1

    .line 37
    sget-object v0, Lcom/luchime/huiyuan/HuiyuanEngine;->PIAO_SUFFIX:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic access$getTANGO_PREFIX$cp()Ljava/util/List;
    .locals 1

    .line 37
    sget-object v0, Lcom/luchime/huiyuan/HuiyuanEngine;->TANGO_PREFIX:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic access$getTANGO_SUFFIX$cp()Ljava/util/List;
    .locals 1

    .line 37
    sget-object v0, Lcom/luchime/huiyuan/HuiyuanEngine;->TANGO_SUFFIX:Ljava/util/List;

    return-object v0
.end method

.method private final dimensionLabel()Ljava/lang/String;
    .locals 2

    .line 120
    iget-object v0, p0, Lcom/luchime/huiyuan/HuiyuanEngine;->persona:Lcom/luchime/huiyuan/EnginePersona;

    sget-object v1, Lcom/luchime/huiyuan/EnginePersona;->HUIYUAN:Lcom/luchime/huiyuan/EnginePersona;

    if-ne v0, v1, :cond_0

    const-string v0, "\u8ba4\u77e5\u7ef4\u5ea6"

    goto :goto_0

    :cond_0
    const-string v0, "\u77e5\u8bc6\u7ef4\u5ea6"

    :goto_0
    return-object v0
.end method

.method private final extractorName()Ljava/lang/String;
    .locals 2

    .line 143
    iget-object v0, p0, Lcom/luchime/huiyuan/HuiyuanEngine;->persona:Lcom/luchime/huiyuan/EnginePersona;

    sget-object v1, Lcom/luchime/huiyuan/HuiyuanEngine$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lcom/luchime/huiyuan/EnginePersona;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 147
    :pswitch_0
    const-string v0, "\u63a2\u6208\u8bed\u5f55\u62bd\u53d6\u5668"

    goto :goto_0

    .line 146
    :pswitch_1
    const-string v0, "\u9f9f\u9f9f\u8bed\u5f55\u62bd\u53d6\u5668"

    goto :goto_0

    .line 145
    :pswitch_2
    const-string v0, "\u6734\u8bed\u5f55\u62bd\u53d6\u5668"

    goto :goto_0

    .line 144
    :pswitch_3
    const-string v0, "\u8bed\u5f55\u62bd\u53d6\u5668"

    .line 148
    :goto_0
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final libraryName()Ljava/lang/String;
    .locals 2

    .line 112
    iget-object v0, p0, Lcom/luchime/huiyuan/HuiyuanEngine;->persona:Lcom/luchime/huiyuan/EnginePersona;

    sget-object v1, Lcom/luchime/huiyuan/HuiyuanEngine$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lcom/luchime/huiyuan/EnginePersona;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 116
    :pswitch_0
    const-string v0, "\u63a2\u6208\u8bed\u5f55"

    goto :goto_0

    .line 115
    :pswitch_1
    const-string v0, "\u9f9f\u9f9f\u8bed\u5f55"

    goto :goto_0

    .line 114
    :pswitch_2
    const-string v0, "\u6734\u8bed\u5f55"

    goto :goto_0

    .line 113
    :pswitch_3
    const-string v0, "\u8bed\u5f55"

    .line 117
    :goto_0
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final personaName()Ljava/lang/String;
    .locals 2

    .line 105
    iget-object v0, p0, Lcom/luchime/huiyuan/HuiyuanEngine;->persona:Lcom/luchime/huiyuan/EnginePersona;

    sget-object v1, Lcom/luchime/huiyuan/HuiyuanEngine$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lcom/luchime/huiyuan/EnginePersona;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 109
    :pswitch_0
    const-string v0, "\u63a2\u6208"

    goto :goto_0

    .line 108
    :pswitch_1
    const-string v0, "\u9f9f\u9f9f"

    goto :goto_0

    .line 107
    :pswitch_2
    const-string v0, "\u6734AI"

    goto :goto_0

    .line 106
    :pswitch_3
    const-string v0, "\u56f0\u56f0"

    .line 110
    :goto_0
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final pick(Ljava/util/List;)Ljava/lang/Object;
    .locals 2
    .param p1, "values"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;)TT;"
        }
    .end annotation

    .line 225
    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 226
    iget-object v0, p0, Lcom/luchime/huiyuan/HuiyuanEngine;->random:Lkotlin/random/Random;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Lkotlin/random/Random;->nextInt(I)I

    move-result v0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 510
    :cond_0
    const/4 v0, 0x0

    .line 225
    .local v0, "$i$a$-require-HuiyuanEngine$pick$1\\1\\225\\0":I
    nop

    .end local v0    # "$i$a$-require-HuiyuanEngine$pick$1\\1\\225\\0":I
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "\u7f51\u9875\u5f15\u64ce\u6570\u636e\u6c60\u4e0d\u80fd\u4e3a\u7a7a"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final searchSteps()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 122
    iget-object v0, p0, Lcom/luchime/huiyuan/HuiyuanEngine;->persona:Lcom/luchime/huiyuan/EnginePersona;

    sget-object v1, Lcom/luchime/huiyuan/HuiyuanEngine$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lcom/luchime/huiyuan/EnginePersona;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 126
    :pswitch_0
    sget-object v0, Lcom/luchime/huiyuan/HuiyuanEngine;->TANGO_SEARCH_STEPS:Ljava/util/List;

    goto :goto_0

    .line 125
    :pswitch_1
    sget-object v0, Lcom/luchime/huiyuan/HuiyuanEngine;->GUIGUI_SEARCH_STEPS:Ljava/util/List;

    goto :goto_0

    .line 124
    :pswitch_2
    sget-object v0, Lcom/luchime/huiyuan/HuiyuanEngine;->PIAO_SEARCH_STEPS:Ljava/util/List;

    goto :goto_0

    .line 123
    :pswitch_3
    sget-object v0, Lcom/luchime/huiyuan/HuiyuanEngine;->SEARCH_STEPS:Ljava/util/List;

    .line 127
    :goto_0
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final toolSteps()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 129
    iget-object v0, p0, Lcom/luchime/huiyuan/HuiyuanEngine;->persona:Lcom/luchime/huiyuan/EnginePersona;

    sget-object v1, Lcom/luchime/huiyuan/HuiyuanEngine$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lcom/luchime/huiyuan/EnginePersona;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 133
    :pswitch_0
    sget-object v0, Lcom/luchime/huiyuan/HuiyuanEngine;->TANGO_TOOL_STEPS:Ljava/util/List;

    goto :goto_0

    .line 132
    :pswitch_1
    sget-object v0, Lcom/luchime/huiyuan/HuiyuanEngine;->GUIGUI_TOOL_STEPS:Ljava/util/List;

    goto :goto_0

    .line 131
    :pswitch_2
    sget-object v0, Lcom/luchime/huiyuan/HuiyuanEngine;->PIAO_TOOL_STEPS:Ljava/util/List;

    goto :goto_0

    .line 130
    :pswitch_3
    sget-object v0, Lcom/luchime/huiyuan/HuiyuanEngine;->TOOL_STEPS:Ljava/util/List;

    .line 134
    :goto_0
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final wrapperName()Ljava/lang/String;
    .locals 2

    .line 136
    iget-object v0, p0, Lcom/luchime/huiyuan/HuiyuanEngine;->persona:Lcom/luchime/huiyuan/EnginePersona;

    sget-object v1, Lcom/luchime/huiyuan/HuiyuanEngine$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lcom/luchime/huiyuan/EnginePersona;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 140
    :pswitch_0
    const-string v0, "\u63a2\u6208\u8bed\u6c14\u5305\u88c5\u5668"

    goto :goto_0

    .line 139
    :pswitch_1
    const-string v0, "\u9f9f\u9f9f\u8bed\u6c14\u5305\u88c5\u5668"

    goto :goto_0

    .line 138
    :pswitch_2
    const-string v0, "\u6734\u5f0f\u8bed\u6c14\u5305\u88c5\u5668"

    goto :goto_0

    .line 137
    :pswitch_3
    const-string v0, "\u8bed\u5f55\u5305\u88c5\u5668"

    .line 141
    :goto_0
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final analyze(Ljava/lang/String;)Lcom/luchime/huiyuan/ReplyResult;
    .locals 9
    .param p1, "text"    # Ljava/lang/String;

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 55
    .local v0, "clean":Ljava/lang/String;
    invoke-virtual {p0, v0}, Lcom/luchime/huiyuan/HuiyuanEngine;->isGreeting(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 56
    new-instance v2, Lcom/luchime/huiyuan/ReplyResult;

    .line 57
    nop

    .line 58
    iget-object v4, p0, Lcom/luchime/huiyuan/HuiyuanEngine;->greeting:Ljava/lang/String;

    .line 59
    nop

    .line 60
    nop

    .line 61
    nop

    .line 56
    const-string v3, "greet"

    const-string v5, "\u95ee\u5019"

    const/4 v6, 0x0

    const-string v7, "\u95ee\u5019"

    invoke-direct/range {v2 .. v7}, Lcom/luchime/huiyuan/ReplyResult;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/luchime/huiyuan/LexiconEntry;Ljava/lang/String;)V

    return-object v2

    .line 65
    :cond_0
    invoke-virtual {p0, v0}, Lcom/luchime/huiyuan/HuiyuanEngine;->matchEntry(Ljava/lang/String;)Lcom/luchime/huiyuan/LexiconEntry;

    move-result-object v7

    .line 66
    .local v7, "entry":Lcom/luchime/huiyuan/LexiconEntry;
    if-nez v7, :cond_1

    .line 67
    new-instance v1, Lcom/luchime/huiyuan/ReplyResult;

    .line 68
    nop

    .line 69
    new-instance v2, Lcom/luchime/huiyuan/LexiconEntry;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v3

    iget-object v4, p0, Lcom/luchime/huiyuan/HuiyuanEngine;->generic:Ljava/util/List;

    invoke-direct {p0, v4}, Lcom/luchime/huiyuan/HuiyuanEngine;->pick(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-string v5, "\u901a\u7528"

    invoke-direct {v2, v5, v3, v4}, Lcom/luchime/huiyuan/LexiconEntry;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {p0, v2}, Lcom/luchime/huiyuan/HuiyuanEngine;->wrap(Lcom/luchime/huiyuan/LexiconEntry;)Ljava/lang/String;

    move-result-object v3

    .line 70
    nop

    .line 71
    nop

    .line 72
    nop

    .line 67
    const-string v2, "generic"

    const-string v4, "\u901a\u7528"

    const/4 v5, 0x0

    const-string v6, "\u901a\u7528\u515c\u5e95"

    invoke-direct/range {v1 .. v6}, Lcom/luchime/huiyuan/ReplyResult;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/luchime/huiyuan/LexiconEntry;Ljava/lang/String;)V

    return-object v1

    .line 76
    :cond_1
    new-instance v3, Lcom/luchime/huiyuan/ReplyResult;

    .line 77
    nop

    .line 78
    invoke-virtual {p0, v7}, Lcom/luchime/huiyuan/HuiyuanEngine;->wrap(Lcom/luchime/huiyuan/LexiconEntry;)Ljava/lang/String;

    move-result-object v5

    .line 79
    invoke-virtual {v7}, Lcom/luchime/huiyuan/LexiconEntry;->getCategory()Ljava/lang/String;

    move-result-object v6

    .line 80
    nop

    .line 81
    invoke-virtual {v7}, Lcom/luchime/huiyuan/LexiconEntry;->getCategory()Ljava/lang/String;

    move-result-object v8

    .line 76
    const-string v4, "entry"

    invoke-direct/range {v3 .. v8}, Lcom/luchime/huiyuan/ReplyResult;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/luchime/huiyuan/LexiconEntry;Ljava/lang/String;)V

    return-object v3
.end method

.method public final buildThinkSteps(Lcom/luchime/huiyuan/ReplyResult;)Ljava/util/List;
    .locals 7
    .param p1, "result"    # Lcom/luchime/huiyuan/ReplyResult;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/luchime/huiyuan/ReplyResult;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/String;

    invoke-direct {p0}, Lcom/luchime/huiyuan/HuiyuanEngine;->searchSteps()Ljava/util/List;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/luchime/huiyuan/HuiyuanEngine;->pick(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 87
    iget-object v1, p0, Lcom/luchime/huiyuan/HuiyuanEngine;->lexicon:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {p0}, Lcom/luchime/huiyuan/HuiyuanEngine;->libraryName()Ljava/lang/String;

    move-result-object v2

    iget v3, p0, Lcom/luchime/huiyuan/HuiyuanEngine;->dimensionCount:I

    invoke-direct {p0}, Lcom/luchime/huiyuan/HuiyuanEngine;->dimensionLabel()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\ud83d\udcda \u5df2\u8f7d\u5165 "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, " \u6761"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " / "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " \u4e2a"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 86
    nop

    .line 88
    invoke-direct {p0}, Lcom/luchime/huiyuan/HuiyuanEngine;->toolSteps()Ljava/util/List;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/luchime/huiyuan/HuiyuanEngine;->pick(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 86
    nop

    .line 89
    invoke-virtual {p1}, Lcom/luchime/huiyuan/ReplyResult;->getEntry()Lcom/luchime/huiyuan/LexiconEntry;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 90
    invoke-virtual {p1}, Lcom/luchime/huiyuan/ReplyResult;->getDimension()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u2705 \u547d\u4e2d\u7ef4\u5ea6\uff1a\u300c"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u300d"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 92
    :cond_0
    invoke-direct {p0}, Lcom/luchime/huiyuan/HuiyuanEngine;->personaName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u26a0\ufe0f \u6ca1\u547d\u4e2d\u5173\u952e\u8bcd\uff0c"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u5207\u5230\u901a\u7528\u515c\u5e95\u6c60"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 86
    nop

    .line 94
    invoke-direct {p0}, Lcom/luchime/huiyuan/HuiyuanEngine;->wrapperName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\ud83d\udee0 \u8c03\u7528\u5de5\u5177\u300c"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u300d\u7ec4\u7ec7\u56de\u590d\u2026"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    .line 86
    nop

    .line 95
    const-string v1, "\u2728 \u8f93\u51fa\u51c6\u5907\u5b8c\u6210"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    .line 86
    nop

    .line 85
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 96
    return-object v0
.end method

.method public final getCategoryCounts()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 50
    iget-object v0, p0, Lcom/luchime/huiyuan/HuiyuanEngine;->categoryCounts:Ljava/util/Map;

    return-object v0
.end method

.method public final getDimensionCount()I
    .locals 1

    .line 49
    iget v0, p0, Lcom/luchime/huiyuan/HuiyuanEngine;->dimensionCount:I

    return v0
.end method

.method public final getGreeting()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/luchime/huiyuan/HuiyuanEngine;->greeting:Ljava/lang/String;

    return-object v0
.end method

.method public final getLexicon()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/luchime/huiyuan/LexiconEntry;",
            ">;"
        }
    .end annotation

    .line 38
    iget-object v0, p0, Lcom/luchime/huiyuan/HuiyuanEngine;->lexicon:Ljava/util/List;

    return-object v0
.end method

.method public final isGreeting(Ljava/lang/String;)Z
    .locals 5
    .param p1, "text"    # Ljava/lang/String;

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toLowerCase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 173
    .local v0, "clean":Ljava/lang/String;
    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    if-eqz v1, :cond_1

    return v3

    .line 174
    :cond_1
    sget-object v1, Lcom/luchime/huiyuan/HuiyuanEngine;->GREETING_REGEX:Lkotlin/text/Regex;

    move-object v4, v0

    check-cast v4, Ljava/lang/CharSequence;

    invoke-virtual {v1, v4}, Lkotlin/text/Regex;->containsMatchIn(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    sget-object v1, Lcom/luchime/huiyuan/HuiyuanEngine;->GREETINGS:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    move v2, v3

    :cond_3
    :goto_1
    return v2
.end method

.method public final matchEntry(Ljava/lang/String;)Lcom/luchime/huiyuan/LexiconEntry;
    .locals 25
    .param p1, "text"    # Ljava/lang/String;

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "text"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "toLowerCase(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 179
    .local v2, "input":Ljava/lang/String;
    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 180
    .local v4, "bestByDimension":Ljava/util/LinkedHashMap;
    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 181
    .local v5, "sumByDimension":Ljava/util/LinkedHashMap;
    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 183
    .local v6, "matchedEntriesByDimension":Ljava/util/LinkedHashMap;
    iget-object v7, v0, Lcom/luchime/huiyuan/HuiyuanEngine;->matchingEntries:Ljava/util/List;

    check-cast v7, Ljava/lang/Iterable;

    .local v7, "$this$forEach\\1":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 497
    .local v8, "$i$f$forEach\\1\\183":I
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .local v10, "element\\1":Ljava/lang/Object;
    move-object v12, v10

    check-cast v12, Lcom/luchime/huiyuan/LexiconEntry;

    .local v12, "entry\\2":Lcom/luchime/huiyuan/LexiconEntry;
    const/4 v13, 0x0

    .line 184
    .local v13, "$i$a$-forEach-HuiyuanEngine$matchEntry$1\\2\\497\\0":I
    invoke-virtual {v12}, Lcom/luchime/huiyuan/LexiconEntry;->getKeys()Ljava/util/List;

    move-result-object v14

    check-cast v14, Ljava/lang/Iterable;

    .local v14, "$this$count\\3":Ljava/lang/Iterable;
    const/4 v15, 0x0

    .line 498
    .local v15, "$i$f$count\\3\\184":I
    instance-of v11, v14, Ljava/util/Collection;

    if-eqz v11, :cond_0

    move-object v11, v14

    check-cast v11, Ljava/util/Collection;

    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_0

    move-object/from16 v21, v2

    move-object/from16 v24, v3

    move-object/from16 v22, v6

    move-object/from16 v19, v7

    const/4 v7, 0x0

    const/4 v11, 0x0

    goto :goto_2

    .line 499
    :cond_0
    const/4 v11, 0x0

    .line 500
    .local v11, "count\\3":I
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_1
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_3

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    .local v18, "element\\3":Ljava/lang/Object;
    move-object/from16 v1, v18

    check-cast v1, Ljava/lang/String;

    .local v1, "it\\4":Ljava/lang/String;
    const/16 v20, 0x0

    .line 184
    .local v20, "$i$a$-count-HuiyuanEngine$matchEntry$1$score$1\\4\\500\\2":I
    move-object/from16 v21, v2

    .end local v2    # "input":Ljava/lang/String;
    .local v21, "input":Ljava/lang/String;
    move-object/from16 v2, v21

    check-cast v2, Ljava/lang/CharSequence;

    move-object/from16 v22, v6

    .end local v6    # "matchedEntriesByDimension":Ljava/util/LinkedHashMap;
    .local v22, "matchedEntriesByDimension":Ljava/util/LinkedHashMap;
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Ljava/lang/CharSequence;

    move-object/from16 v23, v1

    .end local v1    # "it\\4":Ljava/lang/String;
    .local v23, "it\\4":Ljava/lang/String;
    const/4 v1, 0x2

    move-object/from16 v24, v3

    move-object/from16 v19, v7

    const/4 v3, 0x0

    const/4 v7, 0x0

    .end local v7    # "$this$forEach\\1":Ljava/lang/Iterable;
    .local v19, "$this$forEach\\1":Ljava/lang/Iterable;
    invoke-static {v2, v6, v7, v1, v3}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v1

    .line 500
    .end local v20    # "$i$a$-count-HuiyuanEngine$matchEntry$1$score$1\\4\\500\\2":I
    .end local v23    # "it\\4":Ljava/lang/String;
    if-eqz v1, :cond_2

    add-int/lit8 v11, v11, 0x1

    if-gez v11, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwCountOverflow()V

    .end local v18    # "element\\3":Ljava/lang/Object;
    :cond_1
    move-object/from16 v7, v19

    move-object/from16 v2, v21

    move-object/from16 v6, v22

    move-object/from16 v3, v24

    goto :goto_1

    .restart local v18    # "element\\3":Ljava/lang/Object;
    :cond_2
    move-object/from16 v7, v19

    move-object/from16 v2, v21

    move-object/from16 v6, v22

    move-object/from16 v3, v24

    goto :goto_1

    .line 501
    .end local v18    # "element\\3":Ljava/lang/Object;
    .end local v19    # "$this$forEach\\1":Ljava/lang/Iterable;
    .end local v21    # "input":Ljava/lang/String;
    .end local v22    # "matchedEntriesByDimension":Ljava/util/LinkedHashMap;
    .restart local v2    # "input":Ljava/lang/String;
    .restart local v6    # "matchedEntriesByDimension":Ljava/util/LinkedHashMap;
    .restart local v7    # "$this$forEach\\1":Ljava/lang/Iterable;
    :cond_3
    move-object/from16 v21, v2

    move-object/from16 v24, v3

    move-object/from16 v22, v6

    move-object/from16 v19, v7

    const/4 v7, 0x0

    .line 184
    .end local v2    # "input":Ljava/lang/String;
    .end local v6    # "matchedEntriesByDimension":Ljava/util/LinkedHashMap;
    .end local v7    # "$this$forEach\\1":Ljava/lang/Iterable;
    .end local v11    # "count\\3":I
    .end local v14    # "$this$count\\3":Ljava/lang/Iterable;
    .end local v15    # "$i$f$count\\3\\184":I
    .restart local v19    # "$this$forEach\\1":Ljava/lang/Iterable;
    .restart local v21    # "input":Ljava/lang/String;
    .restart local v22    # "matchedEntriesByDimension":Ljava/util/LinkedHashMap;
    :goto_2
    nop

    .line 185
    .local v11, "score\\2":I
    if-lez v11, :cond_7

    .line 187
    invoke-virtual {v12}, Lcom/luchime/huiyuan/LexiconEntry;->getCategory()Ljava/lang/String;

    move-result-object v1

    .line 188
    .local v1, "dimension\\2":Ljava/lang/String;
    move-object v2, v4

    check-cast v2, Ljava/util/Map;

    invoke-virtual {v4, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_3

    :cond_4
    move v3, v7

    :goto_3
    invoke-static {v3, v11}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    move-object v2, v5

    check-cast v2, Ljava/util/Map;

    invoke-virtual {v5, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_4

    :cond_5
    move v3, v7

    :goto_4
    add-int/2addr v3, v11

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    move-object/from16 v2, v22

    check-cast v2, Ljava/util/Map;

    .local v2, "$this$getOrPut\\5":Ljava/util/Map;
    move-object v3, v1

    .local v3, "key\\5":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 502
    .local v6, "$i$f$getOrPut\\5\\190":I
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    .line 503
    .local v7, "value\\5":Ljava/lang/Object;
    if-nez v7, :cond_6

    .line 504
    const/4 v14, 0x0

    .line 190
    .local v14, "$i$a$-getOrPut-HuiyuanEngine$matchEntry$1$1\\6\\504\\2":I
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    check-cast v15, Ljava/util/List;

    .line 504
    .end local v14    # "$i$a$-getOrPut-HuiyuanEngine$matchEntry$1$1\\6\\504\\2":I
    nop

    .line 505
    .local v15, "answer\\5":Ljava/lang/Object;
    invoke-interface {v2, v3, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 506
    nop

    .end local v15    # "answer\\5":Ljava/lang/Object;
    goto :goto_5

    .line 508
    :cond_6
    move-object v15, v7

    .line 503
    :goto_5
    nop

    .end local v2    # "$this$getOrPut\\5":Ljava/util/Map;
    .end local v3    # "key\\5":Ljava/lang/Object;
    .end local v6    # "$i$f$getOrPut\\5\\190":I
    .end local v7    # "value\\5":Ljava/lang/Object;
    check-cast v15, Ljava/util/List;

    .line 190
    invoke-interface {v15, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 191
    nop

    .line 497
    .end local v1    # "dimension\\2":Ljava/lang/String;
    .end local v11    # "score\\2":I
    .end local v12    # "entry\\2":Lcom/luchime/huiyuan/LexiconEntry;
    .end local v13    # "$i$a$-forEach-HuiyuanEngine$matchEntry$1\\2\\497\\0":I
    :cond_7
    move-object/from16 v1, p1

    move-object/from16 v7, v19

    move-object/from16 v2, v21

    move-object/from16 v6, v22

    move-object/from16 v3, v24

    .end local v10    # "element\\1":Ljava/lang/Object;
    goto/16 :goto_0

    .line 509
    .end local v19    # "$this$forEach\\1":Ljava/lang/Iterable;
    .end local v21    # "input":Ljava/lang/String;
    .end local v22    # "matchedEntriesByDimension":Ljava/util/LinkedHashMap;
    .local v2, "input":Ljava/lang/String;
    .local v6, "matchedEntriesByDimension":Ljava/util/LinkedHashMap;
    .local v7, "$this$forEach\\1":Ljava/lang/Iterable;
    :cond_8
    move-object/from16 v21, v2

    move-object/from16 v22, v6

    move-object/from16 v19, v7

    .line 193
    .end local v2    # "input":Ljava/lang/String;
    .end local v6    # "matchedEntriesByDimension":Ljava/util/LinkedHashMap;
    .end local v7    # "$this$forEach\\1":Ljava/lang/Iterable;
    .end local v8    # "$i$f$forEach\\1\\183":I
    .restart local v21    # "input":Ljava/lang/String;
    .restart local v22    # "matchedEntriesByDimension":Ljava/util/LinkedHashMap;
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_9

    const/16 v16, 0x0

    return-object v16

    .line 195
    :cond_9
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    const-string v2, "<get-keys>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    .line 196
    new-instance v2, Lcom/luchime/huiyuan/HuiyuanEngine$matchEntry$$inlined$compareByDescending$1;

    invoke-direct {v2, v4}, Lcom/luchime/huiyuan/HuiyuanEngine$matchEntry$$inlined$compareByDescending$1;-><init>(Ljava/util/LinkedHashMap;)V

    check-cast v2, Ljava/util/Comparator;

    .line 197
    new-instance v3, Lcom/luchime/huiyuan/HuiyuanEngine$matchEntry$$inlined$thenByDescending$1;

    invoke-direct {v3, v2, v5}, Lcom/luchime/huiyuan/HuiyuanEngine$matchEntry$$inlined$thenByDescending$1;-><init>(Ljava/util/Comparator;Ljava/util/LinkedHashMap;)V

    check-cast v3, Ljava/util/Comparator;

    .line 195
    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v1

    .line 198
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 195
    nop

    .line 200
    .local v1, "topDimension":Ljava/lang/String;
    nop

    .line 201
    iget-object v2, v0, Lcom/luchime/huiyuan/HuiyuanEngine;->entriesByDimension:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-nez v2, :cond_a

    .line 202
    move-object/from16 v2, v22

    check-cast v2, Ljava/util/Map;

    invoke-static {v2, v1}, Lkotlin/collections/MapsKt;->getValue(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    .line 200
    :cond_a
    invoke-direct {v0, v2}, Lcom/luchime/huiyuan/HuiyuanEngine;->pick(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/luchime/huiyuan/LexiconEntry;

    return-object v2
.end method

.method public final randomOne()Lcom/luchime/huiyuan/ReplyResult;
    .locals 12

    .line 151
    iget-object v0, p0, Lcom/luchime/huiyuan/HuiyuanEngine;->random:Lkotlin/random/Random;

    invoke-virtual {v0}, Lkotlin/random/Random;->nextDouble()D

    move-result-wide v0

    const-wide v2, 0x3fe6666666666666L    # 0.7

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    .line 152
    iget-object v0, p0, Lcom/luchime/huiyuan/HuiyuanEngine;->lexicon:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/luchime/huiyuan/HuiyuanEngine;->pick(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/luchime/huiyuan/LexiconEntry;

    .line 153
    .local v5, "entry":Lcom/luchime/huiyuan/LexiconEntry;
    new-instance v1, Lcom/luchime/huiyuan/ReplyResult;

    .line 154
    nop

    .line 155
    invoke-virtual {p0, v5}, Lcom/luchime/huiyuan/HuiyuanEngine;->wrap(Lcom/luchime/huiyuan/LexiconEntry;)Ljava/lang/String;

    move-result-object v3

    .line 156
    invoke-virtual {v5}, Lcom/luchime/huiyuan/LexiconEntry;->getCategory()Ljava/lang/String;

    move-result-object v4

    .line 157
    nop

    .line 158
    invoke-virtual {v5}, Lcom/luchime/huiyuan/LexiconEntry;->getCategory()Ljava/lang/String;

    move-result-object v6

    .line 153
    const-string v2, "entry"

    invoke-direct/range {v1 .. v6}, Lcom/luchime/huiyuan/ReplyResult;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/luchime/huiyuan/LexiconEntry;Ljava/lang/String;)V

    return-object v1

    .line 162
    .end local v5    # "entry":Lcom/luchime/huiyuan/LexiconEntry;
    :cond_0
    new-instance v6, Lcom/luchime/huiyuan/ReplyResult;

    .line 163
    nop

    .line 164
    new-instance v0, Lcom/luchime/huiyuan/LexiconEntry;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/luchime/huiyuan/HuiyuanEngine;->generic:Ljava/util/List;

    invoke-direct {p0, v2}, Lcom/luchime/huiyuan/HuiyuanEngine;->pick(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "\u901a\u7528"

    invoke-direct {v0, v3, v1, v2}, Lcom/luchime/huiyuan/LexiconEntry;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/luchime/huiyuan/HuiyuanEngine;->wrap(Lcom/luchime/huiyuan/LexiconEntry;)Ljava/lang/String;

    move-result-object v8

    .line 165
    nop

    .line 166
    nop

    .line 167
    nop

    .line 162
    const-string v7, "generic"

    const-string v9, "\u901a\u7528"

    const/4 v10, 0x0

    const-string v11, "\u901a\u7528\u515c\u5e95"

    invoke-direct/range {v6 .. v11}, Lcom/luchime/huiyuan/ReplyResult;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/luchime/huiyuan/LexiconEntry;Ljava/lang/String;)V

    return-object v6
.end method

.method public final randomThinkSteps()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 99
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    invoke-direct {p0}, Lcom/luchime/huiyuan/HuiyuanEngine;->personaName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\ud83c\udfb2 \u968f\u673a\u6a21\u5f0f\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u8df3\u8fc7\u8bed\u4e49\u89e3\u6790\u2026"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 100
    iget-object v1, p0, Lcom/luchime/huiyuan/HuiyuanEngine;->lexicon:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {p0}, Lcom/luchime/huiyuan/HuiyuanEngine;->libraryName()Ljava/lang/String;

    move-result-object v2

    iget v3, p0, Lcom/luchime/huiyuan/HuiyuanEngine;->dimensionCount:I

    invoke-direct {p0}, Lcom/luchime/huiyuan/HuiyuanEngine;->dimensionLabel()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\ud83d\udcda \u5df2\u8f7d\u5165 "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, " \u6761"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " / "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " \u4e2a"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 99
    nop

    .line 101
    invoke-direct {p0}, Lcom/luchime/huiyuan/HuiyuanEngine;->extractorName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\ud83d\udee0 \u8c03\u7528\u5de5\u5177\u300c"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u300d\u2026"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 99
    nop

    .line 102
    const-string v1, "\u2728 \u8f93\u51fa\u51c6\u5907\u5b8c\u6210"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 99
    nop

    .line 98
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 103
    return-object v0
.end method

.method public final wrap(Lcom/luchime/huiyuan/LexiconEntry;)Ljava/lang/String;
    .locals 10
    .param p1, "entry"    # Lcom/luchime/huiyuan/LexiconEntry;

    const-string v0, "entry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 206
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object v1, v0

    .local v1, "$this$wrap_u24lambda_u248\\1":Ljava/lang/StringBuilder;
    const/4 v2, 0x0

    .line 207
    .local v2, "$i$a$-buildString-HuiyuanEngine$wrap$1\\1\\206\\0":I
    iget-object v3, p0, Lcom/luchime/huiyuan/HuiyuanEngine;->characterPrefixes:Ljava/util/List;

    invoke-direct {p0, v3}, Lcom/luchime/huiyuan/HuiyuanEngine;->pick(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    const/16 v3, 0x20

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 209
    iget-object v4, p0, Lcom/luchime/huiyuan/HuiyuanEngine;->random:Lkotlin/random/Random;

    invoke-virtual {v4}, Lkotlin/random/Random;->nextDouble()D

    move-result-wide v4

    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    cmpg-double v4, v4, v6

    if-gez v4, :cond_0

    .line 210
    iget-object v4, p0, Lcom/luchime/huiyuan/HuiyuanEngine;->prefixes:Ljava/util/List;

    invoke-direct {p0, v4}, Lcom/luchime/huiyuan/HuiyuanEngine;->pick(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 213
    :cond_0
    invoke-virtual {p1}, Lcom/luchime/huiyuan/LexiconEntry;->getText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    iget-object v4, p0, Lcom/luchime/huiyuan/HuiyuanEngine;->random:Lkotlin/random/Random;

    invoke-virtual {v4}, Lkotlin/random/Random;->nextDouble()D

    move-result-wide v4

    const-wide v8, 0x3fd999999999999aL    # 0.4

    cmpg-double v4, v4, v8

    if-gez v4, :cond_1

    .line 215
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 216
    iget-object v4, p0, Lcom/luchime/huiyuan/HuiyuanEngine;->suffixes:Ljava/util/List;

    invoke-direct {p0, v4}, Lcom/luchime/huiyuan/HuiyuanEngine;->pick(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    :cond_1
    iget-object v4, p0, Lcom/luchime/huiyuan/HuiyuanEngine;->random:Lkotlin/random/Random;

    invoke-virtual {v4}, Lkotlin/random/Random;->nextDouble()D

    move-result-wide v4

    cmpg-double v4, v4, v6

    if-gez v4, :cond_2

    .line 219
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 220
    iget-object v3, p0, Lcom/luchime/huiyuan/HuiyuanEngine;->characterSuffixes:Ljava/util/List;

    invoke-direct {p0, v3}, Lcom/luchime/huiyuan/HuiyuanEngine;->pick(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    :cond_2
    nop

    .line 206
    .end local v1    # "$this$wrap_u24lambda_u248\\1":Ljava/lang/StringBuilder;
    .end local v2    # "$i$a$-buildString-HuiyuanEngine$wrap$1\\1\\206\\0":I
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 222
    return-object v0
.end method
