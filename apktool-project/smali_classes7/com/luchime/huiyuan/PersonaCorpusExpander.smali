.class public final Lcom/luchime/huiyuan/PersonaCorpusExpander;
.super Ljava/lang/Object;
.source "PersonaCorpusExpander.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/luchime/huiyuan/PersonaCorpusExpander$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPersonaCorpusExpander.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersonaCorpusExpander.kt\ncom/luchime/huiyuan/PersonaCorpusExpander\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,152:1\n1088#2,2:153\n1#3:155\n1563#4:156\n1634#4,3:157\n1374#4:160\n1460#4,2:161\n774#4:163\n865#4,2:164\n1374#4:166\n1460#4,5:167\n1869#4,2:172\n1374#4:174\n1460#4,2:175\n1563#4:177\n1634#4,3:178\n1462#4,3:181\n1462#4,3:186\n1563#4:189\n1634#4,3:190\n1321#5,2:184\n*S KotlinDebug\n*F\n+ 1 PersonaCorpusExpander.kt\ncom/luchime/huiyuan/PersonaCorpusExpander\n*L\n10#1:153,2\n20#1:156\n20#1:157,3\n20#1:160\n20#1:161,2\n21#1:163\n21#1:164,2\n22#1:166\n22#1:167,5\n24#1:172,2\n26#1:174\n26#1:175,2\n27#1:177\n27#1:178,3\n26#1:181,3\n20#1:186,3\n142#1:189\n142#1:190,3\n41#1:184,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\"\n\u0002\u0010\u000c\n\u0000\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J*\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u000c\u001a\u00020\rH\u0002J\u0016\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u000c\u001a\u00020\rH\u0002J\u001e\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0002R\u0014\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/luchime/huiyuan/PersonaCorpusExpander;",
        "",
        "<init>",
        "()V",
        "isUsableCategory",
        "",
        "category",
        "",
        "expand",
        "",
        "Lcom/luchime/huiyuan/LexiconEntry;",
        "sourceEntries",
        "persona",
        "Lcom/luchime/huiyuan/EnginePersona;",
        "targetPerCategory",
        "",
        "actionStems",
        "actionMethods",
        "checks",
        "sentence",
        "value",
        "END_PUNCTUATION",
        "",
        "",
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

.field private static final END_PUNCTUATION:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Character;",
            ">;"
        }
    .end annotation
.end field

.field public static final INSTANCE:Lcom/luchime/huiyuan/PersonaCorpusExpander;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/luchime/huiyuan/PersonaCorpusExpander;

    invoke-direct {v0}, Lcom/luchime/huiyuan/PersonaCorpusExpander;-><init>()V

    sput-object v0, Lcom/luchime/huiyuan/PersonaCorpusExpander;->INSTANCE:Lcom/luchime/huiyuan/PersonaCorpusExpander;

    .line 150
    const/16 v0, 0xa

    new-array v0, v0, [Ljava/lang/Character;

    const/16 v1, 0x3002

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const v1, 0xff01

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const v1, 0xff1f

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const v1, 0xff1b

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const/16 v1, 0x2e

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const/16 v1, 0x21

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const/16 v1, 0x3f

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const/16 v1, 0x3b

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const v1, 0xff5e

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const/16 v1, 0x7e

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    const/16 v3, 0x9

    aput-object v1, v0, v3

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/luchime/huiyuan/PersonaCorpusExpander;->END_PUNCTUATION:Ljava/util/Set;

    sput v2, Lcom/luchime/huiyuan/PersonaCorpusExpander;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$sentence(Lcom/luchime/huiyuan/PersonaCorpusExpander;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "$this"    # Lcom/luchime/huiyuan/PersonaCorpusExpander;
    .param p1, "value"    # Ljava/lang/String;

    .line 8
    invoke-direct {p0, p1}, Lcom/luchime/huiyuan/PersonaCorpusExpander;->sentence(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final actionMethods(Lcom/luchime/huiyuan/EnginePersona;)Ljava/util/List;
    .locals 7
    .param p1, "persona"    # Lcom/luchime/huiyuan/EnginePersona;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/luchime/huiyuan/EnginePersona;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 79
    sget-object v0, Lcom/luchime/huiyuan/PersonaCorpusExpander$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/luchime/huiyuan/EnginePersona;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x4

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x5

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 94
    :pswitch_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 101
    const-string v1, "\u56f0\u56f0\u4e0d\u8d70\u89d2\u8272\u6269\u5c55"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 95
    :pswitch_1
    new-array v0, v6, [Ljava/lang/String;

    const-string v6, "\u5148\u590d\u73b0\uff0c\u518d\u770b\u65e5\u5fd7\uff0c\u6700\u540e\u53ea\u6539\u4e00\u4e2a\u53d8\u91cf"

    aput-object v6, v0, v5

    .line 96
    const-string v5, "\u5148\u786e\u8ba4\u73af\u5883\u3001\u7248\u672c\u548c\u8fb9\u754c\u6761\u4ef6\uff0c\u522b\u4e0a\u6765\u5c31\u91cd\u88c5"

    aput-object v5, v0, v4

    .line 95
    nop

    .line 97
    const-string v4, "\u5148\u505a\u6700\u5c0f\u5b9e\u9a8c\uff0c\u628a\u731c\u6d4b\u53d8\u6210\u80fd\u9a8c\u8bc1\u7684\u5047\u8bbe"

    aput-object v4, v0, v3

    .line 95
    nop

    .line 98
    const-string v3, "\u5148\u4fdd\u7559\u73b0\u573a\u548c\u6570\u636e\uff0c\u518d\u52a8\u624b\u6392\u9664\u6545\u969c"

    aput-object v3, v0, v2

    .line 95
    nop

    .line 99
    const-string v2, "\u5148\u9009\u6210\u672c\u6700\u4f4e\u7684\u8def\u5f84\u8dd1\u901a\uff0c\u590d\u6742\u65b9\u6848\u7559\u5230\u771f\u6709\u5fc5\u8981\u65f6"

    aput-object v2, v0, v1

    .line 95
    nop

    .line 94
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    .line 88
    :pswitch_2
    new-array v0, v6, [Ljava/lang/String;

    const-string v6, "\u5148\u628a\u76ee\u6807\u62c6\u6210\u5c0f\u6b65\u9aa4\uff0c\u6bcf\u4e00\u6b65\u90fd\u7559\u51fa\u68c0\u67e5\u7684\u4f4d\u7f6e"

    aput-object v6, v0, v5

    .line 89
    const-string v5, "\u5148\u7167\u987e\u597d\u5b89\u5168\u8fb9\u754c\uff0c\u518d\u6162\u6162\u8c03\u53c2\u6570\u548c\u8282\u594f"

    aput-object v5, v0, v4

    .line 88
    nop

    .line 90
    const-string v4, "\u5148\u8bb0\u5f55\u73b0\u8c61\u3001\u6761\u4ef6\u548c\u53d8\u5316\uff0c\u4e0d\u8ba9\u611f\u89c9\u66ff\u4ee3\u8bc1\u636e"

    aput-object v4, v0, v3

    .line 88
    nop

    .line 91
    const-string v3, "\u5148\u505a\u4e00\u4e2a\u5c0f\u5b9e\u9a8c\uff0c\u6210\u529f\u4e86\u518d\u5f00\u5fc3\u5730\u5f80\u524d\u62f1"

    aput-object v3, v0, v2

    .line 88
    nop

    .line 92
    const-string v2, "\u5148\u95ee\u6e05\u695a\u4f60\u771f\u6b63\u62c5\u5fc3\u4ec0\u4e48\uff0c\u9f9f\u9f9f\u518d\u966a\u4f60\u9009\u529e\u6cd5"

    aput-object v2, v0, v1

    .line 88
    nop

    .line 87
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    .line 81
    :pswitch_3
    new-array v0, v6, [Ljava/lang/String;

    const-string v6, "\u5148\u628a\u76ee\u6807\u3001\u8d44\u6e90\u548c\u622a\u6b62\u65f6\u95f4\u644a\u5728\u684c\u9762\u4e0a"

    aput-object v6, v0, v5

    .line 82
    const-string v5, "\u5148\u505a\u6700\u5c0f\u53ef\u7528\u7248\u672c\uff0c\u522b\u4e00\u4e0a\u6765\u628a\u6392\u573a\u6574\u5f97\u6bd4\u7ed3\u679c\u5927"

    aput-object v5, v0, v4

    .line 81
    nop

    .line 83
    const-string v4, "\u5148\u628a\u6700\u5bb9\u6613\u7ffb\u8f66\u7684\u73af\u8282\u5355\u72ec\u8bd5\u4e00\u904d"

    aput-object v4, v0, v3

    .line 81
    nop

    .line 84
    const-string v3, "\u5148\u627e\u4e00\u4e2a\u80fd\u5f53\u573a\u9a8c\u8bc1\u7684\u52a8\u4f5c\uff0c\u505a\u5b8c\u518d\u7ee7\u7eed\u6734"

    aput-object v3, v0, v2

    .line 81
    nop

    .line 85
    const-string v2, "\u5148\u5206\u6e05\u8fd9\u662f\u6280\u672f\u95ee\u9898\u3001\u6267\u884c\u95ee\u9898\uff0c\u8fd8\u662f\u6709\u4eba\u5728\u626f\u728a\u5b50"

    aput-object v2, v0, v1

    .line 81
    nop

    .line 80
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 102
    :goto_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final actionStems(Lcom/luchime/huiyuan/EnginePersona;)Ljava/util/List;
    .locals 7
    .param p1, "persona"    # Lcom/luchime/huiyuan/EnginePersona;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/luchime/huiyuan/EnginePersona;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 54
    sget-object v0, Lcom/luchime/huiyuan/PersonaCorpusExpander$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/luchime/huiyuan/EnginePersona;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x4

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x5

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 69
    :pswitch_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 76
    const-string v1, "\u56f0\u56f0\u4e0d\u8d70\u89d2\u8272\u6269\u5c55"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 70
    :pswitch_1
    new-array v0, v6, [Ljava/lang/String;

    const-string v6, "\u8bf4\u5230\u300c{category}\u300d\uff0c\u672c\u718a\u5148\u7ed9\u4f60\u80fd\u6267\u884c\u7684\u7ed3\u8bba"

    aput-object v6, v0, v5

    .line 71
    const-string v5, "\u63a2\u6208\u5904\u7406\u300c{category}\u300d\u8ddf\u6392 Linux \u6545\u969c\u4e00\u6837\uff0c\u5148\u6293\u4e3b\u56e0"

    aput-object v5, v0, v4

    .line 70
    nop

    .line 72
    const-string v4, "\u8001\u5b50\u867d\u7136\u56f0\uff0c\u4f46\u300c{category}\u300d\u8fd9\u4e8b\u4e0d\u80fd\u778e\u731c"

    aput-object v4, v0, v3

    .line 70
    nop

    .line 73
    const-string v3, "\u672c\u718a\u4e0d\u704c\u9e21\u6c64\uff0c\u300c{category}\u300d\u76f4\u63a5\u770b\u8f93\u5165\u3001\u72b6\u6001\u548c\u7ed3\u679c"

    aput-object v3, v0, v2

    .line 70
    nop

    .line 74
    const-string v2, "Zzz\u2026\u63a2\u6208\u9192\u4e00\u4e0b\uff0c\u300c{category}\u300d\u6309\u6700\u77ed\u8def\u5f84\u5904\u7406"

    aput-object v2, v0, v1

    .line 70
    nop

    .line 69
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    .line 63
    :pswitch_2
    new-array v0, v6, [Ljava/lang/String;

    const-string v6, "\u8bf4\u5230\u300c{category}\u300d\uff0c\u9f9f\u9f9f\u5148\u966a\u4f60\u628a\u95ee\u9898\u7406\u987a\u5440"

    aput-object v6, v0, v5

    .line 64
    const-string v5, "\u9f9f\u9f9f\u6b6a\u7740\u5c0f\u8111\u888b\u770b\u300c{category}\u300d\uff0c\u4f1a\u5148\u6e29\u67d4\u5730\u62c6\u5f00\u6765"

    aput-object v5, v0, v4

    .line 63
    nop

    .line 65
    const-string v4, "\u6309\u9f9f\u9f9f\u8fd9\u53ea\u5377\u6bdb\u9f9f\u7684\u4e60\u60ef\uff0c\u300c{category}\u300d\u8981\u8010\u5fc3\u4e00\u70b9\u70b9\u505a"

    aput-object v4, v0, v3

    .line 63
    nop

    .line 66
    const-string v3, "\u9f9f\u9f9f\u5f53 RM \u961f\u957f\u65f6\u5c31\u77e5\u9053\uff0c\u300c{category}\u300d\u4e0d\u80fd\u53ea\u9760\u7740\u6025"

    aput-object v3, v0, v2

    .line 63
    nop

    .line 67
    const-string v2, "\u9f9f\u9f9f\u628a\u300c{category}\u300d\u8bb0\u8fdb\u5c0f\u672c\u672c\uff0c\u966a\u4f60\u4e00\u6b65\u4e00\u6b65\u786e\u8ba4"

    aput-object v2, v0, v1

    .line 63
    nop

    .line 62
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    .line 56
    :pswitch_3
    new-array v0, v6, [Ljava/lang/String;

    const-string v6, "\u8bf4\u5230\u300c{category}\u300d\uff0c\u672c\u6734\u4e0d\u8ddf\u4f60\u7ed5\u5f2f\u5b50"

    aput-object v6, v0, v5

    .line 57
    const-string v5, "\u8fd9\u4e8b\u653e\u5230 deskpark \u4e3b\u573a\uff0c\u672c\u6734\u5148\u628a\u8bdd\u8bf4\u660e\u767d"

    aput-object v5, v0, v4

    .line 56
    nop

    .line 58
    const-string v4, "\u6309\u6734AI\u7684\u813e\u6c14\uff0c\u300c{category}\u300d\u5148\u522b\u6574\u865a\u7684"

    aput-object v4, v0, v3

    .line 56
    nop

    .line 59
    const-string v3, "\u8001\u5b50\u505a\u300c{category}\u300d\u53ea\u8ba4\u80fd\u843d\u5730\u7684\u4e1c\u897f"

    aput-object v3, v0, v2

    .line 56
    nop

    .line 60
    const-string v2, "\u82b1\u886c\u886b\u4e00\u7a7f\uff0c\u672c\u6734\u5c31\u6309\u9879\u76ee\u8d1f\u8d23\u4eba\u7684\u529e\u6cd5\u5904\u7406\u300c{category}\u300d"

    aput-object v2, v0, v1

    .line 56
    nop

    .line 55
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 77
    :goto_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final checks(Lcom/luchime/huiyuan/EnginePersona;Ljava/lang/String;)Ljava/util/List;
    .locals 22
    .param p1, "persona"    # Lcom/luchime/huiyuan/EnginePersona;
    .param p2, "category"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/luchime/huiyuan/EnginePersona;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 105
    sget-object v0, Lcom/luchime/huiyuan/PersonaCorpusExpander$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual/range {p1 .. p1}, Lcom/luchime/huiyuan/EnginePersona;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/16 v3, 0x11

    const/16 v4, 0x10

    const/16 v5, 0xf

    const/16 v6, 0xe

    const/16 v7, 0xd

    const/16 v8, 0xc

    const/16 v9, 0xb

    const/16 v10, 0x9

    const/16 v11, 0x8

    const/4 v12, 0x7

    const/4 v13, 0x6

    const/4 v14, 0x5

    const/4 v15, 0x4

    const/16 v16, 0x3

    const/16 v17, 0x2

    const/16 v18, 0x1

    const/16 v19, 0x0

    const/16 v20, 0x13

    const/16 v1, 0x14

    const/16 v21, 0x12

    const/16 v2, 0xa

    packed-switch v0, :pswitch_data_0

    move-object/from16 v11, p2

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 128
    :pswitch_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 140
    const-string v1, "\u56f0\u56f0\u4e0d\u8d70\u89d2\u8272\u6269\u5c55"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 129
    :pswitch_1
    new-array v0, v1, [Ljava/lang/String;

    const-string v1, "\u770b\u9000\u51fa\u7801\u3001\u65e5\u5fd7\u548c\u53ef\u590d\u73b0\u7ed3\u679c\uff0c\u522b\u770b\u7384\u5b66"

    aput-object v1, v0, v19

    const-string v1, "\u80fd\u7528\u6700\u5c0f\u6837\u4f8b\u590d\u73b0\u624d\u7b97\u6293\u5230\u95ee\u9898"

    aput-object v1, v0, v18

    .line 130
    const-string v1, "\u5148\u786e\u8ba4\u6ca1\u6709\u6570\u636e\u635f\u5931\u548c\u4e0d\u53ef\u9006\u64cd\u4f5c"

    aput-object v1, v0, v17

    .line 129
    nop

    .line 130
    const-string v1, "\u6027\u80fd\u6570\u636e\u8981\u6d4b\uff0c\u4e0d\u80fd\u9760\u4f53\u611f\u5439"

    aput-object v1, v0, v16

    .line 129
    nop

    .line 131
    const-string v1, "\u8fb9\u754c\u6761\u4ef6\u8dd1\u4e00\u904d\uff0c\u522b\u7b49\u4e0a\u7ebf\u518d kernel panic"

    aput-object v1, v0, v15

    .line 129
    nop

    .line 131
    const-string v1, "\u7248\u672c\u3001\u6743\u9650\u3001\u8def\u5f84\u548c\u4f9d\u8d56\u90fd\u8981\u5bf9\u5f97\u4e0a"

    aput-object v1, v0, v14

    .line 129
    nop

    .line 132
    const-string v1, "\u6539\u52a8\u524d\u540e\u505a\u5bf9\u7167\uff0c\u786e\u8ba4\u771f\u662f\u8fd9\u4e2a\u53d8\u91cf"

    aput-object v1, v0, v13

    .line 129
    nop

    .line 132
    const-string v1, "\u80fd\u56de\u6eda\u624d\u52a8\u624b\uff0c\u4e0d\u80fd\u56de\u6eda\u5148\u5907\u4efd"

    aput-object v1, v0, v12

    .line 129
    nop

    .line 133
    const-string v1, "\u522b\u628a\u8b66\u544a\u5f53\u6210\u529f\uff0c\u4e5f\u522b\u628a\u6210\u529f\u7f16\u8bd1\u5f53\u771f\u673a\u9a8c\u8bc1"

    aput-object v1, v0, v11

    .line 129
    nop

    .line 133
    const-string v1, "\u7ed3\u679c\u7a33\u5b9a\u8dd1\u4e09\u6b21\uff0c\u672c\u718a\u624d\u52c9\u5f3a\u70b9\u5934"

    aput-object v1, v0, v10

    .line 129
    nop

    .line 134
    const-string v1, "\u547d\u4ee4\u548c\u8f93\u5165\u8981\u7559\u8bb0\u5f55\uff0c\u7701\u5f97\u4e0b\u6b21\u91cd\u65b0\u6328\u997f"

    aput-object v1, v0, v2

    .line 129
    nop

    .line 134
    const-string v1, "\u4e0d\u8981\u4e3a\u4e86\u70ab\u6280\u628a\u7b80\u5355\u95ee\u9898\u5199\u6210\u5185\u6838\u6a21\u5757"

    aput-object v1, v0, v9

    .line 129
    nop

    .line 135
    const-string v1, "\u65f6\u95f4\u590d\u6742\u5ea6\u548c\u5b9e\u9645\u89c4\u6a21\u90fd\u8981\u7b97"

    aput-object v1, v0, v8

    .line 129
    nop

    .line 135
    const-string v1, "\u8d44\u6e90\u5360\u7528\u522b\u628a\u673a\u5668\u5403\u5f97\u6bd4\u672c\u718a\u8fd8\u80d6"

    aput-object v1, v0, v7

    .line 129
    nop

    .line 136
    const-string v1, "\u9519\u8bef\u8def\u5f84\u4e5f\u8981\u6d4b\uff0c\u4e0d\u7136\u8fdf\u65e9\u534a\u591c\u53eb\u9192\u8001\u5b50"

    aput-object v1, v0, v6

    .line 129
    nop

    .line 136
    const-string v1, "\u5982\u679c\u73b0\u8c61\u53d8\u4e86\uff0c\u5c31\u56de\u5230\u6700\u540e\u4e00\u4e2a\u5df2\u77e5\u6b63\u5e38\u72b6\u6001"

    aput-object v1, v0, v5

    .line 129
    nop

    .line 137
    const-string v1, "\u5148\u89e3\u51b3\u6839\u56e0\uff0c\u518d\u6e05\u7406\u8868\u9762\u62a5\u9519"

    aput-object v1, v0, v4

    .line 129
    nop

    .line 137
    const-string v1, "\u4e8b\u5b9e\u4e0d\u591f\u5c31\u7ee7\u7eed\u91c7\u6837\uff0c\u522b\u5f3a\u884c\u4e0b\u7ed3\u8bba"

    aput-object v1, v0, v3

    .line 129
    nop

    .line 138
    const-string v1, "\u786e\u8ba4\u65b9\u6848\u771f\u80fd\u7ef4\u62a4\uff0c\u4e0d\u662f\u4e00\u6b21\u6027\u9b54\u6cd5"

    aput-object v1, v0, v21

    .line 129
    nop

    .line 138
    const-string v1, "\u9a8c\u8bc1\u5b8c\u5c31\u6536\u5de5\uff0c\u63a2\u6208\u997f\u4e86\uff0c\u5403\u4ec0\u4e48\uff1f"

    aput-object v1, v0, v20

    .line 129
    nop

    .line 128
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_0

    .line 117
    :pswitch_2
    new-array v0, v1, [Ljava/lang/String;

    const-string v1, "\u9f9f\u9f9f\u4f1a\u770b\u7ed3\u679c\u662f\u5426\u7a33\u5b9a\uff0c\u4e5f\u4f1a\u770b\u8fc7\u7a0b\u6709\u6ca1\u6709\u4f24\u5230\u4f60"

    aput-object v1, v0, v19

    const-string v1, "\u6bcf\u4e00\u6b65\u90fd\u80fd\u590d\u73b0\uff0c\u9f9f\u9f9f\u624d\u653e\u5fc3\u5440"

    aput-object v1, v0, v18

    .line 118
    const-string v1, "\u53c2\u6570\u53d8\u5316\u8981\u8bb0\u4e0b\u6765\uff0c\u4e0d\u80fd\u53ea\u51ed\u611f\u89c9\u54e6"

    aput-object v1, v0, v17

    .line 117
    nop

    .line 118
    const-string v1, "\u5b89\u5168\u3001\u5065\u5eb7\u548c\u8bbe\u5907\u8fb9\u754c\u8981\u653e\u5728\u7b2c\u4e00\u4f4d"

    aput-object v1, v0, v16

    .line 117
    nop

    .line 119
    const-string v1, "\u5982\u679c\u51fa\u73b0\u5f02\u5e38\u5c31\u5148\u505c\u4e0b\uff0c\u4e0d\u8981\u786c\u625b"

    aput-object v1, v0, v15

    .line 117
    nop

    .line 119
    const-string v1, "\u5c0f\u8303\u56f4\u9a8c\u8bc1\u901a\u8fc7\uff0c\u518d\u6162\u6162\u6269\u5927"

    aput-object v1, v0, v14

    .line 117
    nop

    .line 120
    const-string v1, "\u786e\u8ba4\u76ee\u6807\u771f\u7684\u8fbe\u6210\uff0c\u800c\u4e0d\u662f\u770b\u8d77\u6765\u5f88\u70ed\u95f9"

    aput-object v1, v0, v13

    .line 117
    nop

    .line 120
    const-string v1, "\u7ed9\u81ea\u5df1\u7559\u4e00\u70b9\u4f11\u606f\u548c\u56de\u9000\u7a7a\u95f4"

    aput-object v1, v0, v12

    .line 117
    nop

    .line 121
    const-string v1, "\u628a\u4e0d\u786e\u5b9a\u7684\u5730\u65b9\u6807\u51fa\u6765\uff0c\u9f9f\u9f9f\u966a\u4f60\u7ee7\u7eed\u67e5"

    aput-object v1, v0, v11

    .line 117
    nop

    .line 121
    const-string v1, "\u95ee\u95ee\u5f53\u4e8b\u4eba\u7684\u611f\u53d7\uff0c\u4e0d\u66ff\u522b\u4eba\u505a\u51b3\u5b9a"

    aput-object v1, v0, v10

    .line 117
    nop

    .line 122
    const-string v1, "\u6570\u636e\u548c\u73b0\u573a\u73b0\u8c61\u8981\u4e92\u76f8\u5bf9\u5f97\u4e0a"

    aput-object v1, v0, v2

    .line 117
    nop

    .line 122
    const-string v1, "\u4e0d\u8981\u56e0\u4e3a\u4e00\u6b21\u6210\u529f\u5c31\u5ffd\u7565\u957f\u671f\u7a33\u5b9a\u6027"

    aput-object v1, v0, v9

    .line 117
    nop

    .line 123
    const-string v1, "\u6b65\u9aa4\u6700\u597d\u8ba9\u961f\u53cb\u4e5f\u80fd\u770b\u61c2\u548c\u590d\u73b0"

    aput-object v1, v0, v8

    .line 117
    nop

    .line 123
    const-string v1, "\u6210\u672c\u3001\u65f6\u95f4\u548c\u98ce\u9669\u90fd\u8981\u6e29\u67d4\u5730\u7b97\u8fdb\u53bb"

    aput-object v1, v0, v7

    .line 117
    nop

    .line 124
    const-string v1, "\u5148\u4fdd\u62a4\u5f31\u5c0f\u4e2a\u4f53\uff0c\u518d\u8c08\u6548\u7387"

    aput-object v1, v0, v6

    .line 117
    nop

    .line 124
    const-string v1, "\u80fd\u5c11\u6298\u817e\u4e00\u6b21\uff0c\u5c31\u5c11\u6298\u817e\u4e00\u6b21"

    aput-object v1, v0, v5

    .line 117
    nop

    .line 125
    const-string v1, "\u7ed3\u679c\u4e0d\u7406\u60f3\u4e5f\u6ca1\u5173\u7cfb\uff0c\u8bb0\u5f55\u4e0b\u6765\u5c31\u662f\u8fdb\u6b65"

    aput-object v1, v0, v4

    .line 117
    nop

    .line 125
    const-string v1, "\u522b\u5fd8\u4e86\u68c0\u67e5\u7535\u6e90\u3001\u8fde\u63a5\u548c\u73af\u5883\u8fd9\u4e9b\u57fa\u7840\u9879"

    aput-object v1, v0, v3

    .line 117
    nop

    .line 126
    const-string v1, "\u9f9f\u9f9f\u4f1a\u966a\u4f60\u590d\u76d8\u54ea\u4e00\u6b65\u6700\u6709\u6548"

    aput-object v1, v0, v21

    .line 117
    nop

    .line 126
    const-string v1, "\u505a\u5b8c\u8bb0\u5f97\u5598\u53e3\u6c14\uff0c\u8d34\u8d34\uff5e"

    aput-object v1, v0, v20

    .line 117
    nop

    .line 116
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    .line 107
    :pswitch_3
    new-array v0, v1, [Ljava/lang/String;

    const-string v1, "\u80fd\u4e0d\u80fd\u5728\u4e3b\u573a\u5f53\u573a\u8dd1\u8d77\u6765"

    aput-object v1, v0, v19

    const-string v1, "\u7ed3\u679c\u662f\u4e0d\u662f\u6bd4\u5634\u786c\u66f4\u6709\u8bf4\u670d\u529b"

    aput-object v1, v0, v18

    .line 108
    const-string v1, "\u6210\u672c\u548c\u6536\u76ca\u80fd\u4e0d\u80fd\u5bf9\u4e0a"

    aput-object v1, v0, v17

    .line 107
    nop

    .line 108
    const-string v1, "\u6700\u574f\u60c5\u51b5\u80fd\u4e0d\u80fd\u515c\u4f4f"

    aput-object v1, v0, v16

    .line 107
    nop

    .line 108
    const-string v1, "\u662f\u4e0d\u662f\u6709\u4eba\u53ea\u4f1a\u558a\u53e3\u53f7"

    aput-object v1, v0, v15

    .line 107
    nop

    .line 109
    const-string v1, "\u5173\u952e\u53c2\u6570\u6709\u6ca1\u6709\u8bb0\u4e0b\u6765"

    aput-object v1, v0, v14

    .line 107
    nop

    .line 109
    const-string v1, "\u4e0b\u4e00\u6b65\u6709\u6ca1\u6709\u5177\u4f53\u8d1f\u8d23\u4eba"

    aput-object v1, v0, v13

    .line 107
    nop

    .line 109
    const-string v1, "\u4eca\u665a\u80fd\u4e0d\u80fd\u505a\u51fa\u7b2c\u4e00\u7248"

    aput-object v1, v0, v12

    .line 107
    nop

    .line 110
    const-string v1, "\u5931\u8d25\u540e\u80fd\u4e0d\u80fd\u5feb\u901f\u64a4\u56de\u6765"

    aput-object v1, v0, v11

    .line 107
    nop

    .line 110
    const-string v1, "\u6709\u6ca1\u6709\u628a\u7528\u6237\u771f\u6b63\u8981\u7684\u4e1c\u897f\u641e\u6e05\u695a"

    aput-object v1, v0, v10

    .line 107
    nop

    .line 111
    const-string v1, "\u662f\u4e0d\u662f\u4e3a\u4e86\u9762\u5b50\u5806\u4e86\u6ca1\u7528\u7684\u529f\u80fd"

    aput-object v1, v0, v2

    .line 107
    nop

    .line 111
    const-string v1, "\u80fd\u4e0d\u80fd\u7528\u4e00\u53e5\u8bdd\u8bf4\u6e05\u7ed3\u679c"

    aput-object v1, v0, v9

    .line 107
    nop

    .line 111
    const-string v1, "\u73b0\u573a\u7684\u4eba\u80fd\u4e0d\u80fd\u7167\u7740\u590d\u73b0"

    aput-object v1, v0, v8

    .line 107
    nop

    .line 112
    const-string v1, "\u6709\u6ca1\u6709\u7559\u4e0b\u5907\u4efd\u548c\u9000\u8def"

    aput-object v1, v0, v7

    .line 107
    nop

    .line 112
    const-string v1, "\u662f\u5426\u503c\u5f97\u672c\u6734\u7ee7\u7eed\u6295\u5165\u65f6\u95f4"

    aput-object v1, v0, v6

    .line 107
    nop

    .line 112
    const-string v1, "\u6709\u6ca1\u6709\u5148\u89e3\u51b3\u6700\u5361\u8116\u5b50\u7684\u5730\u65b9"

    aput-object v1, v0, v5

    .line 107
    nop

    .line 113
    const-string v1, "\u7ed3\u679c\u80fd\u4e0d\u80fd\u7ecf\u5f97\u4f4f\u7b2c\u4e8c\u6b21\u6d4b\u8bd5"

    aput-object v1, v0, v4

    .line 107
    nop

    .line 113
    const-string v1, "\u662f\u5426\u6bd4\u539f\u65b9\u6848\u66f4\u7701\u4e8b"

    aput-object v1, v0, v3

    .line 107
    nop

    .line 113
    const-string v1, "\u505a\u5b8c\u6709\u6ca1\u6709\u660e\u786e\u4ea4\u4ed8\u7269"

    aput-object v1, v0, v21

    .line 107
    nop

    .line 114
    const-string v1, "\u5982\u679c\u8fd8\u4e0d\u884c\uff0c\u5c31\u628a\u65e5\u5fd7\u548c\u73b0\u8c61\u7529\u8fc7\u6765\uff0c\u672c\u6734\u7ee7\u7eed\u6734"

    aput-object v1, v0, v20

    .line 107
    nop

    .line 106
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 105
    :goto_0
    nop

    .line 142
    .local v0, "checks":Ljava/util/List;
    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$map\\1":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 189
    .local v3, "$i$f$map\\1\\142":I
    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    move-object v2, v4

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination\\2":Ljava/util/Collection;
    move-object v4, v1

    .local v4, "$this$mapTo\\2":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 190
    .local v5, "$i$f$mapTo\\2\\189":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 191
    .local v7, "item\\2":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Ljava/lang/String;

    .local v8, "it\\3":Ljava/lang/String;
    const/4 v9, 0x0

    .line 142
    .local v9, "$i$a$-map-PersonaCorpusExpander$checks$1\\3\\191\\0":I
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "\u5728\u300c"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    move-object/from16 v11, p2

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v12, "\u300d\u91cc\uff0c"

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 191
    .end local v8    # "it\\3":Ljava/lang/String;
    .end local v9    # "$i$a$-map-PersonaCorpusExpander$checks$1\\3\\191\\0":I
    invoke-interface {v2, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 192
    .end local v7    # "item\\2":Ljava/lang/Object;
    :cond_0
    move-object/from16 v11, p2

    .end local v2    # "destination\\2":Ljava/util/Collection;
    .end local v4    # "$this$mapTo\\2":Ljava/lang/Iterable;
    .end local v5    # "$i$f$mapTo\\2\\189":I
    check-cast v2, Ljava/util/List;

    .line 189
    nop

    .line 142
    .end local v1    # "$this$map\\1":Ljava/lang/Iterable;
    .end local v3    # "$i$f$map\\1\\142":I
    return-object v2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final sentence(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1, "value"    # Ljava/lang/String;

    .line 146
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 147
    .local v0, "clean":Ljava/lang/String;
    sget-object v1, Lcom/luchime/huiyuan/PersonaCorpusExpander;->END_PUNCTUATION:Ljava/util/Set;

    check-cast v1, Ljava/lang/Iterable;

    move-object v2, v0

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->lastOrNull(Ljava/lang/CharSequence;)Ljava/lang/Character;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move-object v1, v0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u3002"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    return-object v1
.end method


# virtual methods
.method public final expand(Ljava/util/List;Lcom/luchime/huiyuan/EnginePersona;I)Ljava/util/List;
    .locals 39
    .param p1, "sourceEntries"    # Ljava/util/List;
    .param p2, "persona"    # Lcom/luchime/huiyuan/EnginePersona;
    .param p3, "targetPerCategory"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/luchime/huiyuan/LexiconEntry;",
            ">;",
            "Lcom/luchime/huiyuan/EnginePersona;",
            "I)",
            "Ljava/util/List<",
            "Lcom/luchime/huiyuan/LexiconEntry;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move/from16 v2, p3

    const-string v3, "sourceEntries"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "persona"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    sget-object v3, Lcom/luchime/huiyuan/EnginePersona;->HUIYUAN:Lcom/luchime/huiyuan/EnginePersona;

    if-eq v1, v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_e

    .line 18
    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_d

    .line 20
    move-object v3, v0

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$map\\3":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 156
    .local v6, "$i$f$map\\3\\20":I
    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v3, v8}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v7, Ljava/util/Collection;

    .local v7, "destination\\4":Ljava/util/Collection;
    move-object v9, v3

    .local v9, "$this$mapTo\\4":Ljava/lang/Iterable;
    const/4 v10, 0x0

    .line 157
    .local v10, "$i$f$mapTo\\4\\156":I
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_1

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .line 158
    .local v12, "item\\4":Ljava/lang/Object;
    move-object v13, v12

    check-cast v13, Lcom/luchime/huiyuan/LexiconEntry;

    .local v13, "it\\5":Lcom/luchime/huiyuan/LexiconEntry;
    const/4 v14, 0x0

    .line 20
    .local v14, "$i$a$-map-PersonaCorpusExpander$expand$3\\5\\158\\0":I
    invoke-virtual {v13}, Lcom/luchime/huiyuan/LexiconEntry;->getCategory()Ljava/lang/String;

    move-result-object v13

    .line 158
    .end local v13    # "it\\5":Lcom/luchime/huiyuan/LexiconEntry;
    .end local v14    # "$i$a$-map-PersonaCorpusExpander$expand$3\\5\\158\\0":I
    invoke-interface {v7, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 159
    .end local v12    # "item\\4":Ljava/lang/Object;
    :cond_1
    nop

    .end local v7    # "destination\\4":Ljava/util/Collection;
    .end local v9    # "$this$mapTo\\4":Ljava/lang/Iterable;
    .end local v10    # "$i$f$mapTo\\4\\156":I
    check-cast v7, Ljava/util/List;

    .line 156
    nop

    .end local v3    # "$this$map\\3":Ljava/lang/Iterable;
    .end local v6    # "$i$f$map\\3\\20":I
    check-cast v7, Ljava/lang/Iterable;

    .line 20
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->distinct(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$flatMap\\6":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 160
    .local v6, "$i$f$flatMap\\6\\20":I
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    check-cast v7, Ljava/util/Collection;

    .local v7, "destination\\7":Ljava/util/Collection;
    move-object v9, v3

    .local v9, "$this$flatMapTo\\7":Ljava/lang/Iterable;
    const/4 v10, 0x0

    .line 161
    .local v10, "$i$f$flatMapTo\\7\\160":I
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_c

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .line 162
    .local v12, "element\\7":Ljava/lang/Object;
    move-object v15, v12

    check-cast v15, Ljava/lang/String;

    .local v15, "category\\8":Ljava/lang/String;
    const/16 v19, 0x0

    .line 21
    .local v19, "$i$a$-flatMap-PersonaCorpusExpander$expand$4\\8\\162\\0":I
    move-object v13, v0

    check-cast v13, Ljava/lang/Iterable;

    .local v13, "$this$filter\\9":Ljava/lang/Iterable;
    const/4 v14, 0x0

    .line 163
    .local v14, "$i$f$filter\\9\\21":I
    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    check-cast v16, Ljava/util/Collection;

    .local v16, "destination\\10":Ljava/util/Collection;
    move-object/from16 v17, v13

    .local v17, "$this$filterTo\\10":Ljava/lang/Iterable;
    move-object/from16 v18, v16

    .end local v16    # "destination\\10":Ljava/util/Collection;
    .local v18, "destination\\10":Ljava/util/Collection;
    const/16 v16, 0x0

    .line 164
    .local v16, "$i$f$filterTo\\10\\163":I
    invoke-interface/range {v17 .. v17}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v20

    :goto_3
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    move-result v21

    if-eqz v21, :cond_3

    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .local v4, "element\\10":Ljava/lang/Object;
    move-object/from16 v22, v4

    check-cast v22, Lcom/luchime/huiyuan/LexiconEntry;

    .local v22, "it\\11":Lcom/luchime/huiyuan/LexiconEntry;
    const/16 v23, 0x0

    .line 21
    .local v23, "$i$a$-filter-PersonaCorpusExpander$expand$4$originals$1\\11\\164\\8":I
    invoke-virtual/range {v22 .. v22}, Lcom/luchime/huiyuan/LexiconEntry;->getCategory()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    .line 164
    .end local v22    # "it\\11":Lcom/luchime/huiyuan/LexiconEntry;
    .end local v23    # "$i$a$-filter-PersonaCorpusExpander$expand$4$originals$1\\11\\164\\8":I
    if-eqz v5, :cond_2

    move-object/from16 v5, v18

    .end local v18    # "destination\\10":Ljava/util/Collection;
    .local v5, "destination\\10":Ljava/util/Collection;
    invoke-interface {v5, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .end local v5    # "destination\\10":Ljava/util/Collection;
    .restart local v18    # "destination\\10":Ljava/util/Collection;
    :cond_2
    move-object/from16 v5, v18

    .end local v18    # "destination\\10":Ljava/util/Collection;
    .restart local v5    # "destination\\10":Ljava/util/Collection;
    goto :goto_3

    .line 165
    .end local v4    # "element\\10":Ljava/lang/Object;
    .end local v5    # "destination\\10":Ljava/util/Collection;
    .restart local v18    # "destination\\10":Ljava/util/Collection;
    :cond_3
    move-object/from16 v5, v18

    .end local v16    # "$i$f$filterTo\\10\\163":I
    .end local v17    # "$this$filterTo\\10":Ljava/lang/Iterable;
    .end local v18    # "destination\\10":Ljava/util/Collection;
    move-object v4, v5

    check-cast v4, Ljava/util/List;

    .line 163
    nop

    .line 21
    .end local v13    # "$this$filter\\9":Ljava/lang/Iterable;
    .end local v14    # "$i$f$filter\\9\\21":I
    nop

    .line 22
    .local v4, "originals\\8":Ljava/util/List;
    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/Collection;

    move-object v13, v4

    check-cast v13, Ljava/lang/Iterable;

    .local v13, "$this$flatMap\\12":Ljava/lang/Iterable;
    const/4 v14, 0x0

    .line 166
    .local v14, "$i$f$flatMap\\12\\22":I
    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    check-cast v16, Ljava/util/Collection;

    .local v16, "destination\\13":Ljava/util/Collection;
    move-object/from16 v17, v13

    .local v17, "$this$flatMapTo\\13":Ljava/lang/Iterable;
    move-object/from16 v18, v16

    .end local v16    # "destination\\13":Ljava/util/Collection;
    .local v18, "destination\\13":Ljava/util/Collection;
    const/16 v16, 0x0

    .line 167
    .local v16, "$i$f$flatMapTo\\13\\166":I
    invoke-interface/range {v17 .. v17}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v20

    :goto_4
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    move-result v22

    if-eqz v22, :cond_4

    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v22

    .line 168
    .local v22, "element\\13":Ljava/lang/Object;
    move-object/from16 v23, v22

    check-cast v23, Lcom/luchime/huiyuan/LexiconEntry;

    .local v23, "it\\14":Lcom/luchime/huiyuan/LexiconEntry;
    const/16 v24, 0x0

    .line 22
    .local v24, "$i$a$-flatMap-PersonaCorpusExpander$expand$4$keys$1\\14\\168\\8":I
    invoke-virtual/range {v23 .. v23}, Lcom/luchime/huiyuan/LexiconEntry;->getKeys()Ljava/util/List;

    move-result-object v25

    check-cast v25, Ljava/lang/Iterable;

    .line 168
    .end local v23    # "it\\14":Lcom/luchime/huiyuan/LexiconEntry;
    .end local v24    # "$i$a$-flatMap-PersonaCorpusExpander$expand$4$keys$1\\14\\168\\8":I
    move-object/from16 v23, v25

    .line 169
    .local v23, "list\\13":Ljava/lang/Iterable;
    move-object/from16 v8, v18

    move-object/from16 v0, v23

    .end local v18    # "destination\\13":Ljava/util/Collection;
    .end local v23    # "list\\13":Ljava/lang/Iterable;
    .local v0, "list\\13":Ljava/lang/Iterable;
    .local v8, "destination\\13":Ljava/util/Collection;
    invoke-static {v8, v0}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    move-object/from16 v0, p1

    const/16 v8, 0xa

    .end local v0    # "list\\13":Ljava/lang/Iterable;
    goto :goto_4

    .line 171
    .end local v8    # "destination\\13":Ljava/util/Collection;
    .end local v22    # "element\\13":Ljava/lang/Object;
    .restart local v18    # "destination\\13":Ljava/util/Collection;
    :cond_4
    move-object/from16 v8, v18

    .end local v16    # "$i$f$flatMapTo\\13\\166":I
    .end local v17    # "$this$flatMapTo\\13":Ljava/lang/Iterable;
    .end local v18    # "destination\\13":Ljava/util/Collection;
    move-object v0, v8

    check-cast v0, Ljava/util/List;

    .line 166
    nop

    .end local v13    # "$this$flatMap\\12":Ljava/lang/Iterable;
    .end local v14    # "$i$f$flatMap\\12\\22":I
    check-cast v0, Ljava/lang/Iterable;

    .line 22
    invoke-static {v5, v0}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->distinct(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    .line 23
    .local v0, "keys\\8":Ljava/util/List;
    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 24
    .local v5, "unique\\8":Ljava/util/LinkedHashMap;
    move-object v8, v4

    check-cast v8, Ljava/lang/Iterable;

    .local v8, "$this$forEach\\15":Ljava/lang/Iterable;
    const/4 v13, 0x0

    .line 172
    .local v13, "$i$f$forEach\\15\\24":I
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_5
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_5

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v20, v3

    .end local v3    # "$this$flatMap\\6":Ljava/lang/Iterable;
    .local v16, "element\\15":Ljava/lang/Object;
    .local v20, "$this$flatMap\\6":Ljava/lang/Iterable;
    move-object/from16 v3, v16

    check-cast v3, Lcom/luchime/huiyuan/LexiconEntry;

    .local v3, "it\\16":Lcom/luchime/huiyuan/LexiconEntry;
    const/16 v17, 0x0

    .line 24
    .local v17, "$i$a$-forEach-PersonaCorpusExpander$expand$4$1\\16\\172\\8":I
    invoke-virtual {v3}, Lcom/luchime/huiyuan/LexiconEntry;->getText()Ljava/lang/String;

    move-result-object v18

    check-cast v18, Ljava/lang/CharSequence;

    invoke-static/range {v18 .. v18}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v18

    move/from16 v22, v6

    .end local v6    # "$i$f$flatMap\\6\\20":I
    .local v22, "$i$f$flatMap\\6\\20":I
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6, v3}, Ljava/util/LinkedHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .end local v3    # "it\\16":Lcom/luchime/huiyuan/LexiconEntry;
    .end local v17    # "$i$a$-forEach-PersonaCorpusExpander$expand$4$1\\16\\172\\8":I
    move-object/from16 v3, v20

    move/from16 v6, v22

    .end local v16    # "element\\15":Ljava/lang/Object;
    goto :goto_5

    .line 173
    .end local v20    # "$this$flatMap\\6":Ljava/lang/Iterable;
    .end local v22    # "$i$f$flatMap\\6\\20":I
    .local v3, "$this$flatMap\\6":Ljava/lang/Iterable;
    .restart local v6    # "$i$f$flatMap\\6\\20":I
    :cond_5
    move-object/from16 v20, v3

    move/from16 v22, v6

    .line 26
    .end local v3    # "$this$flatMap\\6":Ljava/lang/Iterable;
    .end local v6    # "$i$f$flatMap\\6\\20":I
    .end local v8    # "$this$forEach\\15":Ljava/lang/Iterable;
    .end local v13    # "$i$f$forEach\\15\\24":I
    .restart local v20    # "$this$flatMap\\6":Ljava/lang/Iterable;
    .restart local v22    # "$i$f$flatMap\\6\\20":I
    sget-object v3, Lcom/luchime/huiyuan/PersonaCorpusExpander;->INSTANCE:Lcom/luchime/huiyuan/PersonaCorpusExpander;

    invoke-direct {v3, v1}, Lcom/luchime/huiyuan/PersonaCorpusExpander;->actionStems(Lcom/luchime/huiyuan/EnginePersona;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$flatMap\\17":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 174
    .local v6, "$i$f$flatMap\\17\\26":I
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    check-cast v8, Ljava/util/Collection;

    .local v8, "destination\\18":Ljava/util/Collection;
    move-object/from16 v23, v3

    .local v23, "$this$flatMapTo\\18":Ljava/lang/Iterable;
    const/16 v25, 0x0

    .line 175
    .local v25, "$i$f$flatMapTo\\18\\174":I
    invoke-interface/range {v23 .. v23}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v26

    :goto_6
    invoke-interface/range {v26 .. v26}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_7

    invoke-interface/range {v26 .. v26}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v27

    .line 176
    .local v27, "element\\18":Ljava/lang/Object;
    move-object/from16 v13, v27

    check-cast v13, Ljava/lang/String;

    .local v13, "stem\\19":Ljava/lang/String;
    const/16 v28, 0x0

    .line 27
    .local v28, "$i$a$-flatMap-PersonaCorpusExpander$expand$4$actions$1\\19\\176\\8":I
    sget-object v14, Lcom/luchime/huiyuan/PersonaCorpusExpander;->INSTANCE:Lcom/luchime/huiyuan/PersonaCorpusExpander;

    invoke-direct {v14, v1}, Lcom/luchime/huiyuan/PersonaCorpusExpander;->actionMethods(Lcom/luchime/huiyuan/EnginePersona;)Ljava/util/List;

    move-result-object v14

    check-cast v14, Ljava/lang/Iterable;

    .local v14, "$this$map\\20":Ljava/lang/Iterable;
    const/16 v29, 0x0

    .line 177
    .local v29, "$i$f$map\\20\\27":I
    move-object/from16 v30, v3

    .end local v3    # "$this$flatMap\\17":Ljava/lang/Iterable;
    .local v30, "$this$flatMap\\17":Ljava/lang/Iterable;
    new-instance v3, Ljava/util/ArrayList;

    move/from16 v31, v6

    move-object/from16 v24, v9

    const/16 v6, 0xa

    .end local v6    # "$i$f$flatMap\\17\\26":I
    .end local v9    # "$this$flatMapTo\\7":Ljava/lang/Iterable;
    .local v24, "$this$flatMapTo\\7":Ljava/lang/Iterable;
    .local v31, "$i$f$flatMap\\17\\26":I
    invoke-static {v14, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v3, v9}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .local v3, "destination\\21":Ljava/util/Collection;
    move-object v9, v14

    .local v9, "$this$mapTo\\21":Ljava/lang/Iterable;
    const/16 v32, 0x0

    .line 178
    .local v32, "$i$f$mapTo\\21\\177":I
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v33

    :goto_7
    invoke-interface/range {v33 .. v33}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_6

    invoke-interface/range {v33 .. v33}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v34

    .line 179
    .local v34, "item\\21":Ljava/lang/Object;
    move-object/from16 v35, v34

    check-cast v35, Ljava/lang/String;

    .local v35, "method\\22":Ljava/lang/String;
    const/16 v36, 0x0

    .line 28
    .local v36, "$i$a$-map-PersonaCorpusExpander$expand$4$actions$1$1\\22\\179\\19":I
    const/16 v17, 0x4

    const/16 v18, 0x0

    move-object/from16 v16, v14

    .end local v14    # "$this$map\\20":Ljava/lang/Iterable;
    .local v16, "$this$map\\20":Ljava/lang/Iterable;
    const-string v14, "{category}"

    move-object/from16 v37, v16

    .end local v16    # "$this$map\\20":Ljava/lang/Iterable;
    .local v37, "$this$map\\20":Ljava/lang/Iterable;
    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    move-object/from16 v38, v13

    .end local v13    # "stem\\19":Ljava/lang/String;
    .local v38, "stem\\19":Ljava/lang/String;
    move-object v13, v14

    const-string v14, "{category}"

    move-object v6, v13

    move-object/from16 v13, v35

    .end local v35    # "method\\22":Ljava/lang/String;
    .local v13, "method\\22":Ljava/lang/String;
    invoke-static/range {v13 .. v18}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    move-object/from16 v16, v9

    .end local v9    # "$this$mapTo\\21":Ljava/lang/Iterable;
    .local v16, "$this$mapTo\\21":Ljava/lang/Iterable;
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v9, " "

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 179
    .end local v13    # "method\\22":Ljava/lang/String;
    .end local v36    # "$i$a$-map-PersonaCorpusExpander$expand$4$actions$1$1\\22\\179\\19":I
    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v9, v16

    move-object/from16 v14, v37

    move-object/from16 v13, v38

    const/16 v6, 0xa

    goto :goto_7

    .line 180
    .end local v16    # "$this$mapTo\\21":Ljava/lang/Iterable;
    .end local v34    # "item\\21":Ljava/lang/Object;
    .end local v37    # "$this$map\\20":Ljava/lang/Iterable;
    .end local v38    # "stem\\19":Ljava/lang/String;
    .restart local v9    # "$this$mapTo\\21":Ljava/lang/Iterable;
    .local v13, "stem\\19":Ljava/lang/String;
    .restart local v14    # "$this$map\\20":Ljava/lang/Iterable;
    :cond_6
    move-object/from16 v16, v9

    move-object/from16 v38, v13

    move-object/from16 v37, v14

    .end local v3    # "destination\\21":Ljava/util/Collection;
    .end local v9    # "$this$mapTo\\21":Ljava/lang/Iterable;
    .end local v13    # "stem\\19":Ljava/lang/String;
    .end local v14    # "$this$map\\20":Ljava/lang/Iterable;
    .end local v32    # "$i$f$mapTo\\21\\177":I
    .restart local v37    # "$this$map\\20":Ljava/lang/Iterable;
    .restart local v38    # "stem\\19":Ljava/lang/String;
    check-cast v3, Ljava/util/List;

    .line 177
    nop

    .end local v29    # "$i$f$map\\20\\27":I
    .end local v37    # "$this$map\\20":Ljava/lang/Iterable;
    check-cast v3, Ljava/lang/Iterable;

    .line 29
    nop

    .line 176
    .end local v28    # "$i$a$-flatMap-PersonaCorpusExpander$expand$4$actions$1\\19\\176\\8":I
    .end local v38    # "stem\\19":Ljava/lang/String;
    nop

    .line 181
    .local v3, "list\\18":Ljava/lang/Iterable;
    invoke-static {v8, v3}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    move-object/from16 v9, v24

    move-object/from16 v3, v30

    move/from16 v6, v31

    .end local v3    # "list\\18":Ljava/lang/Iterable;
    goto/16 :goto_6

    .line 183
    .end local v24    # "$this$flatMapTo\\7":Ljava/lang/Iterable;
    .end local v27    # "element\\18":Ljava/lang/Object;
    .end local v30    # "$this$flatMap\\17":Ljava/lang/Iterable;
    .end local v31    # "$i$f$flatMap\\17\\26":I
    .local v3, "$this$flatMap\\17":Ljava/lang/Iterable;
    .restart local v6    # "$i$f$flatMap\\17\\26":I
    .local v9, "$this$flatMapTo\\7":Ljava/lang/Iterable;
    :cond_7
    move-object/from16 v30, v3

    move/from16 v31, v6

    move-object/from16 v24, v9

    .end local v3    # "$this$flatMap\\17":Ljava/lang/Iterable;
    .end local v6    # "$i$f$flatMap\\17\\26":I
    .end local v8    # "destination\\18":Ljava/util/Collection;
    .end local v9    # "$this$flatMapTo\\7":Ljava/lang/Iterable;
    .end local v23    # "$this$flatMapTo\\18":Ljava/lang/Iterable;
    .end local v25    # "$i$f$flatMapTo\\18\\174":I
    .restart local v24    # "$this$flatMapTo\\7":Ljava/lang/Iterable;
    .restart local v30    # "$this$flatMap\\17":Ljava/lang/Iterable;
    .restart local v31    # "$i$f$flatMap\\17\\26":I
    move-object v3, v8

    check-cast v3, Ljava/util/List;

    .line 174
    nop

    .line 26
    .end local v30    # "$this$flatMap\\17":Ljava/lang/Iterable;
    .end local v31    # "$i$f$flatMap\\17\\26":I
    nop

    .line 31
    .local v3, "actions\\8":Ljava/util/List;
    sget-object v6, Lcom/luchime/huiyuan/PersonaCorpusExpander;->INSTANCE:Lcom/luchime/huiyuan/PersonaCorpusExpander;

    invoke-direct {v6, v1, v15}, Lcom/luchime/huiyuan/PersonaCorpusExpander;->checks(Lcom/luchime/huiyuan/EnginePersona;Ljava/lang/String;)Ljava/util/List;

    move-result-object v6

    .line 33
    .local v6, "checks\\8":Ljava/util/List;
    new-instance v8, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;

    const/4 v9, 0x0

    invoke-direct {v8, v4, v3, v6, v9}, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    check-cast v8, Lkotlin/jvm/functions/Function2;

    invoke-static {v8}, Lkotlin/sequences/SequencesKt;->sequence(Lkotlin/jvm/functions/Function2;)Lkotlin/sequences/Sequence;

    move-result-object v8

    .line 41
    nop

    .local v8, "$this$forEach\\23":Lkotlin/sequences/Sequence;
    const/4 v9, 0x0

    .line 184
    .local v9, "$i$f$forEach\\23\\41":I
    invoke-interface {v8}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_8
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_9

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    move-object/from16 v16, v3

    .end local v3    # "actions\\8":Ljava/util/List;
    .local v14, "element\\23":Ljava/lang/Object;
    .local v16, "actions\\8":Ljava/util/List;
    move-object v3, v14

    check-cast v3, Ljava/lang/String;

    .local v3, "text\\24":Ljava/lang/String;
    const/16 v17, 0x0

    .line 42
    .local v17, "$i$a$-forEach-PersonaCorpusExpander$expand$4$3\\24\\184\\8":I
    move-object/from16 v18, v4

    .end local v4    # "originals\\8":Ljava/util/List;
    .local v18, "originals\\8":Ljava/util/List;
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->size()I

    move-result v4

    if-ge v4, v2, :cond_8

    .line 43
    new-instance v4, Lcom/luchime/huiyuan/LexiconEntry;

    invoke-direct {v4, v15, v0, v3}, Lcom/luchime/huiyuan/LexiconEntry;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {v5, v3, v4}, Ljava/util/LinkedHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    :cond_8
    nop

    .line 184
    .end local v3    # "text\\24":Ljava/lang/String;
    .end local v17    # "$i$a$-forEach-PersonaCorpusExpander$expand$4$3\\24\\184\\8":I
    move-object/from16 v3, v16

    move-object/from16 v4, v18

    .end local v14    # "element\\23":Ljava/lang/Object;
    goto :goto_8

    .line 185
    .end local v16    # "actions\\8":Ljava/util/List;
    .end local v18    # "originals\\8":Ljava/util/List;
    .local v3, "actions\\8":Ljava/util/List;
    .restart local v4    # "originals\\8":Ljava/util/List;
    :cond_9
    move-object/from16 v16, v3

    move-object/from16 v18, v4

    .line 47
    .end local v3    # "actions\\8":Ljava/util/List;
    .end local v4    # "originals\\8":Ljava/util/List;
    .end local v8    # "$this$forEach\\23":Lkotlin/sequences/Sequence;
    .end local v9    # "$i$f$forEach\\23\\41":I
    .restart local v16    # "actions\\8":Ljava/util/List;
    .restart local v18    # "originals\\8":Ljava/util/List;
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->size()I

    move-result v3

    if-lt v3, v2, :cond_a

    const/4 v3, 0x1

    goto :goto_9

    :cond_a
    const/4 v3, 0x0

    :goto_9
    if-eqz v3, :cond_b

    .line 50
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v3

    const-string v4, "<get-values>(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3, v2}, Lkotlin/collections/CollectionsKt;->take(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    .line 162
    .end local v0    # "keys\\8":Ljava/util/List;
    .end local v5    # "unique\\8":Ljava/util/LinkedHashMap;
    .end local v6    # "checks\\8":Ljava/util/List;
    .end local v15    # "category\\8":Ljava/lang/String;
    .end local v16    # "actions\\8":Ljava/util/List;
    .end local v18    # "originals\\8":Ljava/util/List;
    .end local v19    # "$i$a$-flatMap-PersonaCorpusExpander$expand$4\\8\\162\\0":I
    nop

    .line 186
    .local v3, "list\\7":Ljava/lang/Iterable;
    invoke-static {v7, v3}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    move-object/from16 v0, p1

    move-object/from16 v3, v20

    move/from16 v6, v22

    move-object/from16 v9, v24

    const/16 v8, 0xa

    .end local v3    # "list\\7":Ljava/lang/Iterable;
    goto/16 :goto_2

    .line 47
    .restart local v0    # "keys\\8":Ljava/util/List;
    .restart local v5    # "unique\\8":Ljava/util/LinkedHashMap;
    .restart local v6    # "checks\\8":Ljava/util/List;
    .restart local v15    # "category\\8":Ljava/lang/String;
    .restart local v16    # "actions\\8":Ljava/util/List;
    .restart local v18    # "originals\\8":Ljava/util/List;
    .restart local v19    # "$i$a$-flatMap-PersonaCorpusExpander$expand$4\\8\\162\\0":I
    :cond_b
    const/4 v3, 0x0

    .line 48
    .local v3, "$i$a$-require-PersonaCorpusExpander$expand$4$4\\25\\47\\8":I
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->size()I

    move-result v4

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, " \u7684\u300c"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, "\u300d\u53ea\u6709 "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v8, " \u6761\uff0c\u672a\u8fbe\u5230 "

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v8, " \u6761"

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 47
    .end local v3    # "$i$a$-require-PersonaCorpusExpander$expand$4$4\\25\\47\\8":I
    new-instance v4, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v4, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 188
    .end local v0    # "keys\\8":Ljava/util/List;
    .end local v5    # "unique\\8":Ljava/util/LinkedHashMap;
    .end local v12    # "element\\7":Ljava/lang/Object;
    .end local v15    # "category\\8":Ljava/lang/String;
    .end local v16    # "actions\\8":Ljava/util/List;
    .end local v18    # "originals\\8":Ljava/util/List;
    .end local v19    # "$i$a$-flatMap-PersonaCorpusExpander$expand$4\\8\\162\\0":I
    .end local v20    # "$this$flatMap\\6":Ljava/lang/Iterable;
    .end local v22    # "$i$f$flatMap\\6\\20":I
    .end local v24    # "$this$flatMapTo\\7":Ljava/lang/Iterable;
    .local v3, "$this$flatMap\\6":Ljava/lang/Iterable;
    .local v6, "$i$f$flatMap\\6\\20":I
    .local v9, "$this$flatMapTo\\7":Ljava/lang/Iterable;
    :cond_c
    nop

    .end local v7    # "destination\\7":Ljava/util/Collection;
    .end local v9    # "$this$flatMapTo\\7":Ljava/lang/Iterable;
    .end local v10    # "$i$f$flatMapTo\\7\\160":I
    move-object v0, v7

    check-cast v0, Ljava/util/List;

    .line 160
    nop

    .line 20
    .end local v3    # "$this$flatMap\\6":Ljava/lang/Iterable;
    .end local v6    # "$i$f$flatMap\\6\\20":I
    return-object v0

    .line 155
    :cond_d
    const/4 v0, 0x0

    .line 18
    .local v0, "$i$a$-require-PersonaCorpusExpander$expand$2\\2\\18\\0":I
    nop

    .end local v0    # "$i$a$-require-PersonaCorpusExpander$expand$2\\2\\18\\0":I
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v3, "\u89d2\u8272\u539f\u59cb\u7f51\u9875\u8bed\u6599\u4e0d\u80fd\u4e3a\u7a7a"

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 155
    :cond_e
    const/4 v0, 0x0

    .line 17
    .local v0, "$i$a$-require-PersonaCorpusExpander$expand$1\\1\\17\\0":I
    nop

    .end local v0    # "$i$a$-require-PersonaCorpusExpander$expand$1\\1\\17\\0":I
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v3, "\u56f0\u56f0\u4f7f\u7528\u8ba4\u77e5\u8bed\u6599\u6269\u5c55\u5668"

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final isUsableCategory(Ljava/lang/String;)Z
    .locals 9
    .param p1, "category"    # Ljava/lang/String;

    const-string v0, "category"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    .local v0, "$this$any\\1":Ljava/lang/CharSequence;
    const/4 v1, 0x0

    .line 153
    .local v1, "$i$f$any\\1\\10":I
    const/4 v2, 0x0

    move v3, v2

    :goto_0
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v4

    const/4 v5, 0x1

    if-ge v3, v4, :cond_2

    invoke-interface {v0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    .local v4, "element\\1":C
    move v6, v4

    .local v6, "it\\2":C
    const/4 v7, 0x0

    .line 10
    .local v7, "$i$a$-any-PersonaCorpusExpander$isUsableCategory$1\\2\\153\\0":I
    const/16 v8, 0x3f

    if-eq v6, v8, :cond_0

    move v6, v5

    goto :goto_1

    :cond_0
    move v6, v2

    .line 153
    .end local v6    # "it\\2":C
    .end local v7    # "$i$a$-any-PersonaCorpusExpander$isUsableCategory$1\\2\\153\\0":I
    :goto_1
    if-eqz v6, :cond_1

    move v0, v5

    goto :goto_2

    .end local v4    # "element\\1":C
    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 154
    :cond_2
    move v0, v2

    .line 10
    .end local v0    # "$this$any\\1":Ljava/lang/CharSequence;
    .end local v1    # "$i$f$any\\1\\10":I
    :goto_2
    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    const/4 v1, 0x2

    const/4 v3, 0x0

    const v4, 0xfffd

    invoke-static {v0, v4, v2, v1, v3}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    move v2, v5

    :cond_3
    return v2
.end method
