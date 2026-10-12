.class public final Lcom/luchime/huiyuan/AppRepository;
.super Ljava/lang/Object;
.source "AppRepository.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/luchime/huiyuan/AppRepository$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAppRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppRepository.kt\ncom/luchime/huiyuan/AppRepository\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n+ 5 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,144:1\n1#2:145\n1869#3,2:146\n1669#3,8:184\n1669#3,8:192\n1869#3,2:200\n41#4,12:148\n41#4,12:160\n41#4,12:172\n41#4,12:202\n41#4,12:218\n41#4,12:230\n32#5,2:214\n216#6,2:216\n*S KotlinDebug\n*F\n+ 1 AppRepository.kt\ncom/luchime/huiyuan/AppRepository\n*L\n31#1:146,2\n65#1:184,8\n70#1:192,8\n70#1:200,2\n43#1:148,12\n47#1:160,12\n53#1:172,12\n78#1:202,12\n118#1:218,12\n128#1:230,12\n102#1:214,2\n117#1:216,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nJ\u0014\u0010\u000c\u001a\u00020\r2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nJ\u0006\u0010\u000f\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0011J\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00150\nJ\u0014\u0010\u0016\u001a\u00020\r2\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00150\nJ\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u0019J\u0010\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u0019H\u0002J\u0006\u0010 \u001a\u00020\rR\u0016\u0010\u0006\u001a\n \u0008*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""
    }
    d2 = {
        "Lcom/luchime/huiyuan/AppRepository;",
        "",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "preferences",
        "Landroid/content/SharedPreferences;",
        "kotlin.jvm.PlatformType",
        "loadMessages",
        "",
        "Lcom/luchime/huiyuan/ChatRecord;",
        "saveMessages",
        "",
        "messages",
        "clearMessages",
        "loadSelectedModel",
        "",
        "saveSelectedModel",
        "model",
        "loadFavorites",
        "Lcom/luchime/huiyuan/FavoriteRecord;",
        "saveFavorites",
        "favorites",
        "recordInteraction",
        "Lcom/luchime/huiyuan/UsageStats;",
        "category",
        "randomDraw",
        "",
        "loadStats",
        "saveStats",
        "stats",
        "clearEverything",
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

.field public static final Companion:Lcom/luchime/huiyuan/AppRepository$Companion;

.field private static final KEY_CATEGORY_COUNTS:Ljava/lang/String; = "category_counts"

.field private static final KEY_FAVORITES:Ljava/lang/String; = "favorites"

.field private static final KEY_LAST_ACTIVE_DATE:Ljava/lang/String; = "last_active_date"

.field private static final KEY_MESSAGES:Ljava/lang/String; = "messages"

.field private static final KEY_RANDOM_DRAWS:Ljava/lang/String; = "random_draws"

.field private static final KEY_SELECTED_MODEL:Ljava/lang/String; = "selected_model"

.field private static final KEY_STREAK_DAYS:Ljava/lang/String; = "streak_days"

.field private static final KEY_TOTAL_QUESTIONS:Ljava/lang/String; = "total_questions"

.field private static final MAX_SAVED_MESSAGES:I = 0x12c

.field private static final PREFERENCES_NAME:Ljava/lang/String; = "huiyuan_app_state_v2"


# instance fields
.field private final preferences:Landroid/content/SharedPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/luchime/huiyuan/AppRepository$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/luchime/huiyuan/AppRepository$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/luchime/huiyuan/AppRepository;->Companion:Lcom/luchime/huiyuan/AppRepository$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/luchime/huiyuan/AppRepository;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    const-string v0, "huiyuan_app_state_v2"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/luchime/huiyuan/AppRepository;->preferences:Landroid/content/SharedPreferences;

    .line 9
    return-void
.end method

.method private final saveStats(Lcom/luchime/huiyuan/UsageStats;)V
    .locals 9
    .param p1, "stats"    # Lcom/luchime/huiyuan/UsageStats;

    .line 116
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 117
    .local v0, "counts":Lorg/json/JSONObject;
    invoke-virtual {p1}, Lcom/luchime/huiyuan/UsageStats;->getCategoryCounts()Ljava/util/Map;

    move-result-object v1

    .local v1, "$this$forEach\\1":Ljava/util/Map;
    const/4 v2, 0x0

    .line 216
    .local v2, "$i$f$forEach\\1\\117":I
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .local v4, "element\\1":Ljava/util/Map$Entry;
    const/4 v5, 0x0

    .local v5, "$i$a$-forEach-AppRepository$saveStats$1\\2\\216\\0":I
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .local v6, "category\\2":Ljava/lang/String;
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    .line 117
    .local v7, "count\\2":I
    invoke-virtual {v0, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 216
    .end local v5    # "$i$a$-forEach-AppRepository$saveStats$1\\2\\216\\0":I
    .end local v6    # "category\\2":Ljava/lang/String;
    .end local v7    # "count\\2":I
    nop

    .end local v4    # "element\\1":Ljava/util/Map$Entry;
    goto :goto_0

    .line 217
    :cond_0
    nop

    .line 118
    .end local v1    # "$this$forEach\\1":Ljava/util/Map;
    .end local v2    # "$i$f$forEach\\1\\117":I
    iget-object v1, p0, Lcom/luchime/huiyuan/AppRepository;->preferences:Landroid/content/SharedPreferences;

    const-string v2, "preferences"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 218
    .local v1, "$this$edit_u24default\\3":Landroid/content/SharedPreferences;
    nop

    .line 219
    const/4 v2, 0x0

    .line 218
    .local v2, "commit\\3":Z
    const/4 v3, 0x0

    .line 222
    .local v3, "$i$f$edit\\3\\118":I
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    .line 223
    .local v4, "editor\\3":Landroid/content/SharedPreferences$Editor;
    move-object v5, v4

    .local v5, "$this$saveStats_u24lambda_u2419\\4":Landroid/content/SharedPreferences$Editor;
    const/4 v6, 0x0

    .line 119
    .local v6, "$i$a$-edit$default-AppRepository$saveStats$2\\4\\223\\0":I
    const-string v7, "total_questions"

    invoke-virtual {p1}, Lcom/luchime/huiyuan/UsageStats;->getTotalQuestions()I

    move-result v8

    invoke-interface {v5, v7, v8}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 120
    const-string v7, "random_draws"

    invoke-virtual {p1}, Lcom/luchime/huiyuan/UsageStats;->getRandomDraws()I

    move-result v8

    invoke-interface {v5, v7, v8}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 121
    const-string v7, "streak_days"

    invoke-virtual {p1}, Lcom/luchime/huiyuan/UsageStats;->getStreakDays()I

    move-result v8

    invoke-interface {v5, v7, v8}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 122
    const-string v7, "last_active_date"

    invoke-virtual {p1}, Lcom/luchime/huiyuan/UsageStats;->getLastActiveDate()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v5, v7, v8}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 123
    const-string v7, "category_counts"

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v5, v7, v8}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 124
    nop

    .line 223
    .end local v5    # "$this$saveStats_u24lambda_u2419\\4":Landroid/content/SharedPreferences$Editor;
    .end local v6    # "$i$a$-edit$default-AppRepository$saveStats$2\\4\\223\\0":I
    nop

    .line 224
    nop

    .line 227
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 229
    nop

    .line 125
    .end local v1    # "$this$edit_u24default\\3":Landroid/content/SharedPreferences;
    .end local v2    # "commit\\3":Z
    .end local v3    # "$i$f$edit\\3\\118":I
    .end local v4    # "editor\\3":Landroid/content/SharedPreferences$Editor;
    return-void
.end method


# virtual methods
.method public final clearEverything()V
    .locals 6

    .line 128
    iget-object v0, p0, Lcom/luchime/huiyuan/AppRepository;->preferences:Landroid/content/SharedPreferences;

    const-string v1, "preferences"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 230
    .local v0, "$this$edit_u24default\\1":Landroid/content/SharedPreferences;
    nop

    .line 231
    const/4 v1, 0x0

    .line 230
    .local v1, "commit\\1":Z
    const/4 v2, 0x0

    .line 234
    .local v2, "$i$f$edit\\1\\128":I
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    .line 235
    .local v3, "editor\\1":Landroid/content/SharedPreferences$Editor;
    move-object v4, v3

    .local v4, "$this$clearEverything_u24lambda_u2420\\2":Landroid/content/SharedPreferences$Editor;
    const/4 v5, 0x0

    .line 128
    .local v5, "$i$a$-edit$default-AppRepository$clearEverything$1\\2\\235\\0":I
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 235
    .end local v4    # "$this$clearEverything_u24lambda_u2420\\2":Landroid/content/SharedPreferences$Editor;
    .end local v5    # "$i$a$-edit$default-AppRepository$clearEverything$1\\2\\235\\0":I
    nop

    .line 236
    nop

    .line 239
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 241
    nop

    .line 129
    .end local v0    # "$this$edit_u24default\\1":Landroid/content/SharedPreferences;
    .end local v1    # "commit\\1":Z
    .end local v2    # "$i$f$edit\\1\\128":I
    .end local v3    # "editor\\1":Landroid/content/SharedPreferences$Editor;
    return-void
.end method

.method public final clearMessages()V
    .locals 7

    .line 47
    iget-object v0, p0, Lcom/luchime/huiyuan/AppRepository;->preferences:Landroid/content/SharedPreferences;

    const-string v1, "preferences"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    .local v0, "$this$edit_u24default\\1":Landroid/content/SharedPreferences;
    nop

    .line 161
    const/4 v1, 0x0

    .line 160
    .local v1, "commit\\1":Z
    const/4 v2, 0x0

    .line 164
    .local v2, "$i$f$edit\\1\\47":I
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    .line 165
    .local v3, "editor\\1":Landroid/content/SharedPreferences$Editor;
    move-object v4, v3

    .local v4, "$this$clearMessages_u24lambda_u246\\2":Landroid/content/SharedPreferences$Editor;
    const/4 v5, 0x0

    .line 47
    .local v5, "$i$a$-edit$default-AppRepository$clearMessages$1\\2\\165\\0":I
    const-string v6, "messages"

    invoke-interface {v4, v6}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 165
    .end local v4    # "$this$clearMessages_u24lambda_u246\\2":Landroid/content/SharedPreferences$Editor;
    .end local v5    # "$i$a$-edit$default-AppRepository$clearMessages$1\\2\\165\\0":I
    nop

    .line 166
    nop

    .line 169
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 171
    nop

    .line 48
    .end local v0    # "$this$edit_u24default\\1":Landroid/content/SharedPreferences;
    .end local v1    # "commit\\1":Z
    .end local v2    # "$i$f$edit\\1\\47":I
    .end local v3    # "editor\\1":Landroid/content/SharedPreferences$Editor;
    return-void
.end method

.method public final loadFavorites()Ljava/util/List;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/luchime/huiyuan/FavoriteRecord;",
            ">;"
        }
    .end annotation

    .line 56
    const-string v0, "getString(...)"

    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object/from16 v1, p0

    check-cast v1, Lcom/luchime/huiyuan/AppRepository;

    .local v1, "$this$loadFavorites_u24lambda_u2410\\1":Lcom/luchime/huiyuan/AppRepository;
    const/4 v2, 0x0

    .line 57
    .local v2, "$i$a$-runCatching-AppRepository$loadFavorites$1\\1\\56\\0":I
    new-instance v3, Lorg/json/JSONArray;

    iget-object v4, v1, Lcom/luchime/huiyuan/AppRepository;->preferences:Landroid/content/SharedPreferences;

    const-string v5, "favorites"

    const-string v6, "[]"

    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 58
    .local v3, "array\\1":Lorg/json/JSONArray;
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v4

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v4, :cond_0

    move v7, v6

    .local v7, "index\\2":I
    const/4 v8, 0x0

    .line 59
    .local v8, "$i$a$-List-AppRepository$loadFavorites$1$1\\2\\58\\1":I
    invoke-virtual {v3, v7}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v9

    .line 60
    .local v9, "item\\2":Lorg/json/JSONObject;
    new-instance v10, Lcom/luchime/huiyuan/FavoriteRecord;

    .line 61
    const-string v11, "text"

    invoke-virtual {v9, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    const-string v12, "category"

    invoke-virtual {v9, v12}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    const-string v13, "savedAt"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    invoke-virtual {v9, v13, v14, v15}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v13

    .line 60
    invoke-direct {v10, v11, v12, v13, v14}, Lcom/luchime/huiyuan/FavoriteRecord;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 64
    nop

    .line 58
    .end local v7    # "index\\2":I
    .end local v8    # "$i$a$-List-AppRepository$loadFavorites$1$1\\2\\58\\1":I
    .end local v9    # "item\\2":Lorg/json/JSONObject;
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_0
    check-cast v5, Ljava/util/List;

    check-cast v5, Ljava/lang/Iterable;

    .line 65
    nop

    .local v5, "$this$distinctBy\\3":Ljava/lang/Iterable;
    const/4 v0, 0x0

    .line 184
    .local v0, "$i$f$distinctBy\\3\\65":I
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 185
    .local v4, "set\\3":Ljava/util/HashSet;
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 186
    .local v6, "list\\3":Ljava/util/ArrayList;
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_1
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 187
    .local v8, "e\\3":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Lcom/luchime/huiyuan/FavoriteRecord;

    .local v9, "it\\4":Lcom/luchime/huiyuan/FavoriteRecord;
    const/4 v10, 0x0

    .line 65
    .local v10, "$i$a$-distinctBy-AppRepository$loadFavorites$1$2\\4\\187\\1":I
    invoke-virtual {v9}, Lcom/luchime/huiyuan/FavoriteRecord;->getText()Ljava/lang/String;

    move-result-object v11

    .line 187
    .end local v9    # "it\\4":Lcom/luchime/huiyuan/FavoriteRecord;
    .end local v10    # "$i$a$-distinctBy-AppRepository$loadFavorites$1$2\\4\\187\\1":I
    nop

    .line 188
    .local v11, "key\\3":Ljava/lang/Object;
    invoke-virtual {v4, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    .line 189
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 191
    .end local v8    # "e\\3":Ljava/lang/Object;
    .end local v11    # "key\\3":Ljava/lang/Object;
    :cond_2
    move-object v7, v6

    check-cast v7, Ljava/util/List;

    .line 65
    .end local v0    # "$i$f$distinctBy\\3\\65":I
    .end local v4    # "set\\3":Ljava/util/HashSet;
    .end local v5    # "$this$distinctBy\\3":Ljava/lang/Iterable;
    .end local v6    # "list\\3":Ljava/util/ArrayList;
    nop

    .line 56
    .end local v1    # "$this$loadFavorites_u24lambda_u2410\\1":Lcom/luchime/huiyuan/AppRepository;
    .end local v2    # "$i$a$-runCatching-AppRepository$loadFavorites$1\\1\\56\\0":I
    .end local v3    # "array\\1":Lorg/json/JSONArray;
    invoke-static {v7}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 66
    :goto_2
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    move-object v0, v1

    :cond_3
    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final loadMessages()Ljava/util/List;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/luchime/huiyuan/ChatRecord;",
            ">;"
        }
    .end annotation

    .line 12
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object/from16 v0, p0

    check-cast v0, Lcom/luchime/huiyuan/AppRepository;

    .local v0, "$this$loadMessages_u24lambda_u243\\1":Lcom/luchime/huiyuan/AppRepository;
    const/4 v1, 0x0

    .line 13
    .local v1, "$i$a$-runCatching-AppRepository$loadMessages$1\\1\\12\\0":I
    new-instance v2, Lorg/json/JSONArray;

    iget-object v3, v0, Lcom/luchime/huiyuan/AppRepository;->preferences:Landroid/content/SharedPreferences;

    const-string v4, "messages"

    const-string v5, "[]"

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 14
    .local v2, "array\\1":Lorg/json/JSONArray;
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_2

    move v6, v5

    .local v6, "index\\2":I
    const/4 v7, 0x0

    .line 15
    .local v7, "$i$a$-List-AppRepository$loadMessages$1$1\\2\\14\\1":I
    invoke-virtual {v2, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v8

    .line 16
    .local v8, "item\\2":Lorg/json/JSONObject;
    nop

    .line 17
    const-string v9, "id"

    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v11

    .line 18
    const-string v9, "isUser"

    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v13

    .line 19
    const-string v9, "text"

    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    const-string v9, "getString(...)"

    invoke-static {v14, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    const-string v9, "tag"

    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 145
    move-object v10, v9

    .local v10, "it\\3":Ljava/lang/String;
    const/4 v15, 0x0

    .line 20
    .local v15, "$i$a$-takeIf-AppRepository$loadMessages$1$1$1\\3\\20\\2":I
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object/from16 v16, v10

    check-cast v16, Ljava/lang/CharSequence;

    invoke-static/range {v16 .. v16}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v16

    .end local v10    # "it\\3":Ljava/lang/String;
    .end local v15    # "$i$a$-takeIf-AppRepository$loadMessages$1$1$1\\3\\20\\2":I
    const/4 v10, 0x0

    if-nez v16, :cond_0

    move-object v15, v9

    goto :goto_1

    :cond_0
    move-object v15, v10

    .line 21
    :goto_1
    const-string v9, "sourceQuote"

    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 145
    move-object/from16 v16, v9

    .local v16, "it\\4":Ljava/lang/String;
    const/16 v17, 0x0

    .line 21
    .local v17, "$i$a$-takeIf-AppRepository$loadMessages$1$1$2\\4\\21\\2":I
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object/from16 v18, v16

    check-cast v18, Ljava/lang/CharSequence;

    invoke-static/range {v18 .. v18}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v18

    .end local v16    # "it\\4":Ljava/lang/String;
    .end local v17    # "$i$a$-takeIf-AppRepository$loadMessages$1$1$2\\4\\21\\2":I
    if-nez v18, :cond_1

    move-object/from16 v16, v9

    goto :goto_2

    :cond_1
    move-object/from16 v16, v10

    .line 22
    :goto_2
    const-string v9, "timestamp"

    move-object/from16 v20, v0

    move/from16 v21, v1

    .end local v0    # "$this$loadMessages_u24lambda_u243\\1":Lcom/luchime/huiyuan/AppRepository;
    .end local v1    # "$i$a$-runCatching-AppRepository$loadMessages$1\\1\\12\\0":I
    .local v20, "$this$loadMessages_u24lambda_u243\\1":Lcom/luchime/huiyuan/AppRepository;
    .local v21, "$i$a$-runCatching-AppRepository$loadMessages$1\\1\\12\\0":I
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v8, v9, v0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v17

    .line 23
    const-string v0, "modelId"

    const-string v1, "HUIYUAN"

    invoke-virtual {v8, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "optString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    new-instance v10, Lcom/luchime/huiyuan/ChatRecord;

    move-object/from16 v19, v0

    invoke-direct/range {v10 .. v19}, Lcom/luchime/huiyuan/ChatRecord;-><init>(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    .line 24
    nop

    .line 14
    .end local v6    # "index\\2":I
    .end local v7    # "$i$a$-List-AppRepository$loadMessages$1$1\\2\\14\\1":I
    .end local v8    # "item\\2":Lorg/json/JSONObject;
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    move-object/from16 v0, v20

    move/from16 v1, v21

    goto/16 :goto_0

    .end local v20    # "$this$loadMessages_u24lambda_u243\\1":Lcom/luchime/huiyuan/AppRepository;
    .end local v21    # "$i$a$-runCatching-AppRepository$loadMessages$1\\1\\12\\0":I
    .restart local v0    # "$this$loadMessages_u24lambda_u243\\1":Lcom/luchime/huiyuan/AppRepository;
    .restart local v1    # "$i$a$-runCatching-AppRepository$loadMessages$1\\1\\12\\0":I
    :cond_2
    move-object/from16 v20, v0

    move/from16 v21, v1

    .end local v0    # "$this$loadMessages_u24lambda_u243\\1":Lcom/luchime/huiyuan/AppRepository;
    .end local v1    # "$i$a$-runCatching-AppRepository$loadMessages$1\\1\\12\\0":I
    .restart local v20    # "$this$loadMessages_u24lambda_u243\\1":Lcom/luchime/huiyuan/AppRepository;
    .restart local v21    # "$i$a$-runCatching-AppRepository$loadMessages$1\\1\\12\\0":I
    check-cast v4, Ljava/util/List;

    .line 25
    nop

    .line 12
    .end local v2    # "array\\1":Lorg/json/JSONArray;
    .end local v20    # "$this$loadMessages_u24lambda_u243\\1":Lcom/luchime/huiyuan/AppRepository;
    .end local v21    # "$i$a$-runCatching-AppRepository$loadMessages$1\\1\\12\\0":I
    invoke-static {v4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 26
    :goto_3
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    move-object v0, v1

    :cond_3
    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final loadSelectedModel()Ljava/lang/String;
    .locals 3

    .line 50
    iget-object v0, p0, Lcom/luchime/huiyuan/AppRepository;->preferences:Landroid/content/SharedPreferences;

    const-string v1, "selected_model"

    const-string v2, "HUIYUAN"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v0

    :goto_0
    return-object v2
.end method

.method public final loadStats()Lcom/luchime/huiyuan/UsageStats;
    .locals 13

    .line 99
    const-string v0, "{}"

    const/4 v1, 0x0

    :try_start_0
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v2, p0

    check-cast v2, Lcom/luchime/huiyuan/AppRepository;

    .local v2, "$this$loadStats_u24lambda_u2417\\1":Lcom/luchime/huiyuan/AppRepository;
    const/4 v3, 0x0

    .line 100
    .local v3, "$i$a$-runCatching-AppRepository$loadStats$counts$1\\1\\99\\0":I
    new-instance v4, Lorg/json/JSONObject;

    iget-object v5, v2, Lcom/luchime/huiyuan/AppRepository;->preferences:Landroid/content/SharedPreferences;

    const-string v6, "category_counts"

    invoke-interface {v5, v6, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v5

    :goto_0
    invoke-direct {v4, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 101
    .local v4, "objectValue\\1":Lorg/json/JSONObject;
    invoke-static {}, Lkotlin/collections/MapsKt;->createMapBuilder()Ljava/util/Map;

    move-result-object v0

    move-object v5, v0

    .local v5, "$this$loadStats_u24lambda_u2417_u24lambda_u2416\\2":Ljava/util/Map;
    const/4 v6, 0x0

    .line 102
    .local v6, "$i$a$-buildMap-AppRepository$loadStats$counts$1$1\\2\\101\\1":I
    invoke-virtual {v4}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v7

    const-string v8, "keys(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .local v7, "$this$forEach\\3":Ljava/util/Iterator;
    const/4 v8, 0x0

    .line 214
    .local v8, "$i$f$forEach\\3\\102":I
    nop

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .local v9, "element\\3":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Ljava/lang/String;

    .local v10, "key\\4":Ljava/lang/String;
    const/4 v11, 0x0

    .line 102
    .local v11, "$i$a$-forEach-AppRepository$loadStats$counts$1$1$1\\4\\214\\2":I
    invoke-virtual {v4, v10, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v5, v10, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    nop

    .end local v9    # "element\\3":Ljava/lang/Object;
    .end local v10    # "key\\4":Ljava/lang/String;
    .end local v11    # "$i$a$-forEach-AppRepository$loadStats$counts$1$1$1\\4\\214\\2":I
    goto :goto_1

    .line 215
    :cond_1
    nop

    .line 103
    .end local v7    # "$this$forEach\\3":Ljava/util/Iterator;
    .end local v8    # "$i$f$forEach\\3\\102":I
    nop

    .line 101
    .end local v5    # "$this$loadStats_u24lambda_u2417_u24lambda_u2416\\2":Ljava/util/Map;
    .end local v6    # "$i$a$-buildMap-AppRepository$loadStats$counts$1$1\\2\\101\\1":I
    invoke-static {v0}, Lkotlin/collections/MapsKt;->build(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    .line 103
    nop

    .line 99
    .end local v2    # "$this$loadStats_u24lambda_u2417\\1":Lcom/luchime/huiyuan/AppRepository;
    .end local v3    # "$i$a$-runCatching-AppRepository$loadStats$counts$1\\1\\99\\0":I
    .end local v4    # "objectValue\\1":Lorg/json/JSONObject;
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 104
    :goto_2
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v2

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    move-object v0, v2

    :cond_2
    check-cast v0, Ljava/util/Map;

    .line 99
    move-object v7, v0

    .line 106
    .local v7, "counts":Ljava/util/Map;
    new-instance v2, Lcom/luchime/huiyuan/UsageStats;

    .line 107
    iget-object v0, p0, Lcom/luchime/huiyuan/AppRepository;->preferences:Landroid/content/SharedPreferences;

    const-string v3, "total_questions"

    invoke-interface {v0, v3, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v3

    .line 108
    iget-object v0, p0, Lcom/luchime/huiyuan/AppRepository;->preferences:Landroid/content/SharedPreferences;

    const-string v4, "random_draws"

    invoke-interface {v0, v4, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v4

    .line 109
    iget-object v0, p0, Lcom/luchime/huiyuan/AppRepository;->preferences:Landroid/content/SharedPreferences;

    const-string v5, "streak_days"

    invoke-interface {v0, v5, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v5

    .line 110
    iget-object v0, p0, Lcom/luchime/huiyuan/AppRepository;->preferences:Landroid/content/SharedPreferences;

    const-string v1, "last_active_date"

    const/4 v6, 0x0

    invoke-interface {v0, v1, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 111
    nop

    .line 106
    invoke-direct/range {v2 .. v7}, Lcom/luchime/huiyuan/UsageStats;-><init>(IIILjava/lang/String;Ljava/util/Map;)V

    return-object v2
.end method

.method public final recordInteraction(Ljava/lang/String;Z)Lcom/luchime/huiyuan/UsageStats;
    .locals 8
    .param p1, "category"    # Ljava/lang/String;
    .param p2, "randomDraw"    # Z

    const-string v0, "category"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    invoke-virtual {p0}, Lcom/luchime/huiyuan/AppRepository;->loadStats()Lcom/luchime/huiyuan/UsageStats;

    move-result-object v1

    .line 83
    .local v1, "current":Lcom/luchime/huiyuan/UsageStats;
    invoke-static {}, Ljava/time/LocalDate;->now()Ljava/time/LocalDate;

    move-result-object v0

    .line 84
    .local v0, "today":Ljava/time/LocalDate;
    invoke-virtual {v1}, Lcom/luchime/huiyuan/UsageStats;->getCategoryCounts()Ljava/util/Map;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/MapsKt;->toMutableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v6

    move-object v2, v6

    .local v2, "$this$recordInteraction_u24lambda_u2414\\1":Ljava/util/Map;
    const/4 v3, 0x0

    .line 85
    .local v3, "$i$a$-apply-AppRepository$recordInteraction$newCounts$1\\1\\84\\0":I
    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    add-int/lit8 v4, v4, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, p1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    nop

    .line 84
    .end local v2    # "$this$recordInteraction_u24lambda_u2414\\1":Ljava/util/Map;
    .end local v3    # "$i$a$-apply-AppRepository$recordInteraction$newCounts$1\\1\\84\\0":I
    nop

    .line 87
    .local v6, "newCounts":Ljava/util/Map;
    nop

    .line 88
    invoke-virtual {v1}, Lcom/luchime/huiyuan/UsageStats;->getTotalQuestions()I

    move-result v2

    xor-int/lit8 v3, p2, 0x1

    add-int/2addr v2, v3

    .line 89
    invoke-virtual {v1}, Lcom/luchime/huiyuan/UsageStats;->getRandomDraws()I

    move-result v3

    add-int/2addr v3, p2

    .line 90
    sget-object v4, Lcom/luchime/huiyuan/UsageLogic;->INSTANCE:Lcom/luchime/huiyuan/UsageLogic;

    invoke-virtual {v1}, Lcom/luchime/huiyuan/UsageStats;->getLastActiveDate()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/luchime/huiyuan/UsageStats;->getStreakDays()I

    move-result v7

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v4, v5, v7, v0}, Lcom/luchime/huiyuan/UsageLogic;->nextStreak(Ljava/lang/String;ILjava/time/LocalDate;)I

    move-result v4

    .line 91
    invoke-virtual {v0}, Ljava/time/LocalDate;->toString()Ljava/lang/String;

    move-result-object v5

    .line 92
    nop

    .line 87
    invoke-virtual/range {v1 .. v6}, Lcom/luchime/huiyuan/UsageStats;->copy(IIILjava/lang/String;Ljava/util/Map;)Lcom/luchime/huiyuan/UsageStats;

    move-result-object v2

    .line 94
    .local v2, "updated":Lcom/luchime/huiyuan/UsageStats;
    invoke-direct {p0, v2}, Lcom/luchime/huiyuan/AppRepository;->saveStats(Lcom/luchime/huiyuan/UsageStats;)V

    .line 95
    return-object v2
.end method

.method public final saveFavorites(Ljava/util/List;)V
    .locals 12
    .param p1, "favorites"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/luchime/huiyuan/FavoriteRecord;",
            ">;)V"
        }
    .end annotation

    const-string v0, "favorites"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 70
    .local v1, "array":Lorg/json/JSONArray;
    move-object v2, p1

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$distinctBy\\1":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 192
    .local v3, "$i$f$distinctBy\\1\\70":I
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 193
    .local v4, "set\\1":Ljava/util/HashSet;
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 194
    .local v5, "list\\1":Ljava/util/ArrayList;
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 195
    .local v7, "e\\1":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Lcom/luchime/huiyuan/FavoriteRecord;

    .local v8, "it\\2":Lcom/luchime/huiyuan/FavoriteRecord;
    const/4 v9, 0x0

    .line 70
    .local v9, "$i$a$-distinctBy-AppRepository$saveFavorites$1\\2\\195\\0":I
    invoke-virtual {v8}, Lcom/luchime/huiyuan/FavoriteRecord;->getText()Ljava/lang/String;

    move-result-object v8

    .line 195
    .end local v8    # "it\\2":Lcom/luchime/huiyuan/FavoriteRecord;
    .end local v9    # "$i$a$-distinctBy-AppRepository$saveFavorites$1\\2\\195\\0":I
    nop

    .line 196
    .local v8, "key\\1":Ljava/lang/Object;
    invoke-virtual {v4, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    .line 197
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 199
    .end local v7    # "e\\1":Ljava/lang/Object;
    .end local v8    # "key\\1":Ljava/lang/Object;
    :cond_1
    move-object v2, v5

    check-cast v2, Ljava/util/List;

    .end local v2    # "$this$distinctBy\\1":Ljava/lang/Iterable;
    .end local v3    # "$i$f$distinctBy\\1\\70":I
    .end local v4    # "set\\1":Ljava/util/HashSet;
    .end local v5    # "list\\1":Ljava/util/ArrayList;
    check-cast v2, Ljava/lang/Iterable;

    .line 70
    nop

    .local v2, "$this$forEach\\3":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 200
    .local v3, "$i$f$forEach\\3\\70":I
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .local v5, "element\\3":Ljava/lang/Object;
    move-object v6, v5

    check-cast v6, Lcom/luchime/huiyuan/FavoriteRecord;

    .local v6, "favorite\\4":Lcom/luchime/huiyuan/FavoriteRecord;
    const/4 v7, 0x0

    .line 71
    .local v7, "$i$a$-forEach-AppRepository$saveFavorites$2\\4\\200\\0":I
    nop

    .line 72
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 73
    const-string v9, "text"

    invoke-virtual {v6}, Lcom/luchime/huiyuan/FavoriteRecord;->getText()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v8

    .line 74
    const-string v9, "category"

    invoke-virtual {v6}, Lcom/luchime/huiyuan/FavoriteRecord;->getCategory()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v8

    .line 75
    const-string v9, "savedAt"

    invoke-virtual {v6}, Lcom/luchime/huiyuan/FavoriteRecord;->getSavedAt()J

    move-result-wide v10

    invoke-virtual {v8, v9, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    move-result-object v8

    .line 71
    invoke-virtual {v1, v8}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 77
    nop

    .line 200
    .end local v6    # "favorite\\4":Lcom/luchime/huiyuan/FavoriteRecord;
    .end local v7    # "$i$a$-forEach-AppRepository$saveFavorites$2\\4\\200\\0":I
    nop

    .end local v5    # "element\\3":Ljava/lang/Object;
    goto :goto_1

    .line 201
    :cond_2
    nop

    .line 78
    .end local v2    # "$this$forEach\\3":Ljava/lang/Iterable;
    .end local v3    # "$i$f$forEach\\3\\70":I
    iget-object v2, p0, Lcom/luchime/huiyuan/AppRepository;->preferences:Landroid/content/SharedPreferences;

    const-string v3, "preferences"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 202
    .local v2, "$this$edit_u24default\\5":Landroid/content/SharedPreferences;
    nop

    .line 203
    const/4 v3, 0x0

    .line 202
    .local v3, "commit\\5":Z
    const/4 v4, 0x0

    .line 206
    .local v4, "$i$f$edit\\5\\78":I
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v5

    .line 207
    .local v5, "editor\\5":Landroid/content/SharedPreferences$Editor;
    move-object v6, v5

    .local v6, "$this$saveFavorites_u24lambda_u2413\\6":Landroid/content/SharedPreferences$Editor;
    const/4 v7, 0x0

    .line 78
    .local v7, "$i$a$-edit$default-AppRepository$saveFavorites$3\\6\\207\\0":I
    invoke-virtual {v1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v6, v0, v8}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 207
    .end local v6    # "$this$saveFavorites_u24lambda_u2413\\6":Landroid/content/SharedPreferences$Editor;
    .end local v7    # "$i$a$-edit$default-AppRepository$saveFavorites$3\\6\\207\\0":I
    nop

    .line 208
    nop

    .line 211
    invoke-interface {v5}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 213
    nop

    .line 79
    .end local v2    # "$this$edit_u24default\\5":Landroid/content/SharedPreferences;
    .end local v3    # "commit\\5":Z
    .end local v4    # "$i$f$edit\\5\\78":I
    .end local v5    # "editor\\5":Landroid/content/SharedPreferences$Editor;
    return-void
.end method

.method public final saveMessages(Ljava/util/List;)V
    .locals 13
    .param p1, "messages"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/luchime/huiyuan/ChatRecord;",
            ">;)V"
        }
    .end annotation

    const-string v0, "messages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    const/16 v1, 0x12c

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->takeLast(Ljava/util/List;I)Ljava/util/List;

    move-result-object v1

    .line 30
    .local v1, "recent":Ljava/util/List;
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 31
    .local v2, "array":Lorg/json/JSONArray;
    move-object v3, v1

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$forEach\\1":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 146
    .local v4, "$i$f$forEach\\1\\31":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .local v6, "element\\1":Ljava/lang/Object;
    move-object v7, v6

    check-cast v7, Lcom/luchime/huiyuan/ChatRecord;

    .local v7, "message\\2":Lcom/luchime/huiyuan/ChatRecord;
    const/4 v8, 0x0

    .line 32
    .local v8, "$i$a$-forEach-AppRepository$saveMessages$1\\2\\146\\0":I
    nop

    .line 33
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    .line 34
    const-string v10, "id"

    invoke-virtual {v7}, Lcom/luchime/huiyuan/ChatRecord;->getId()J

    move-result-wide v11

    invoke-virtual {v9, v10, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    move-result-object v9

    .line 35
    const-string v10, "isUser"

    invoke-virtual {v7}, Lcom/luchime/huiyuan/ChatRecord;->isUser()Z

    move-result v11

    invoke-virtual {v9, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v9

    .line 36
    const-string v10, "text"

    invoke-virtual {v7}, Lcom/luchime/huiyuan/ChatRecord;->getText()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v9

    .line 37
    invoke-virtual {v7}, Lcom/luchime/huiyuan/ChatRecord;->getTag()Ljava/lang/String;

    move-result-object v10

    const-string v11, ""

    if-nez v10, :cond_0

    move-object v10, v11

    :cond_0
    const-string v12, "tag"

    invoke-virtual {v9, v12, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v9

    .line 38
    invoke-virtual {v7}, Lcom/luchime/huiyuan/ChatRecord;->getSourceQuote()Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_1

    goto :goto_1

    :cond_1
    move-object v11, v10

    :goto_1
    const-string v10, "sourceQuote"

    invoke-virtual {v9, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v9

    .line 39
    const-string v10, "timestamp"

    invoke-virtual {v7}, Lcom/luchime/huiyuan/ChatRecord;->getTimestamp()J

    move-result-wide v11

    invoke-virtual {v9, v10, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    move-result-object v9

    .line 40
    const-string v10, "modelId"

    invoke-virtual {v7}, Lcom/luchime/huiyuan/ChatRecord;->getModelId()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v9

    .line 32
    invoke-virtual {v2, v9}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 42
    nop

    .line 146
    .end local v7    # "message\\2":Lcom/luchime/huiyuan/ChatRecord;
    .end local v8    # "$i$a$-forEach-AppRepository$saveMessages$1\\2\\146\\0":I
    nop

    .end local v6    # "element\\1":Ljava/lang/Object;
    goto :goto_0

    .line 147
    :cond_2
    nop

    .line 43
    .end local v3    # "$this$forEach\\1":Ljava/lang/Iterable;
    .end local v4    # "$i$f$forEach\\1\\31":I
    iget-object v3, p0, Lcom/luchime/huiyuan/AppRepository;->preferences:Landroid/content/SharedPreferences;

    const-string v4, "preferences"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    .local v3, "$this$edit_u24default\\3":Landroid/content/SharedPreferences;
    nop

    .line 149
    const/4 v4, 0x0

    .line 148
    .local v4, "commit\\3":Z
    const/4 v5, 0x0

    .line 152
    .local v5, "$i$f$edit\\3\\43":I
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v6

    .line 153
    .local v6, "editor\\3":Landroid/content/SharedPreferences$Editor;
    move-object v7, v6

    .local v7, "$this$saveMessages_u24lambda_u245\\4":Landroid/content/SharedPreferences$Editor;
    const/4 v8, 0x0

    .line 43
    .local v8, "$i$a$-edit$default-AppRepository$saveMessages$2\\4\\153\\0":I
    invoke-virtual {v2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v7, v0, v9}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 153
    .end local v7    # "$this$saveMessages_u24lambda_u245\\4":Landroid/content/SharedPreferences$Editor;
    .end local v8    # "$i$a$-edit$default-AppRepository$saveMessages$2\\4\\153\\0":I
    nop

    .line 154
    nop

    .line 157
    invoke-interface {v6}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 159
    nop

    .line 44
    .end local v3    # "$this$edit_u24default\\3":Landroid/content/SharedPreferences;
    .end local v4    # "commit\\3":Z
    .end local v5    # "$i$f$edit\\3\\43":I
    .end local v6    # "editor\\3":Landroid/content/SharedPreferences$Editor;
    return-void
.end method

.method public final saveSelectedModel(Ljava/lang/String;)V
    .locals 7
    .param p1, "model"    # Ljava/lang/String;

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    iget-object v0, p0, Lcom/luchime/huiyuan/AppRepository;->preferences:Landroid/content/SharedPreferences;

    const-string v1, "preferences"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    .local v0, "$this$edit_u24default\\1":Landroid/content/SharedPreferences;
    nop

    .line 173
    const/4 v1, 0x0

    .line 172
    .local v1, "commit\\1":Z
    const/4 v2, 0x0

    .line 176
    .local v2, "$i$f$edit\\1\\53":I
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    .line 177
    .local v3, "editor\\1":Landroid/content/SharedPreferences$Editor;
    move-object v4, v3

    .local v4, "$this$saveSelectedModel_u24lambda_u247\\2":Landroid/content/SharedPreferences$Editor;
    const/4 v5, 0x0

    .line 53
    .local v5, "$i$a$-edit$default-AppRepository$saveSelectedModel$1\\2\\177\\0":I
    const-string v6, "selected_model"

    invoke-interface {v4, v6, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 177
    .end local v4    # "$this$saveSelectedModel_u24lambda_u247\\2":Landroid/content/SharedPreferences$Editor;
    .end local v5    # "$i$a$-edit$default-AppRepository$saveSelectedModel$1\\2\\177\\0":I
    nop

    .line 178
    nop

    .line 181
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 183
    nop

    .line 54
    .end local v0    # "$this$edit_u24default\\1":Landroid/content/SharedPreferences;
    .end local v1    # "commit\\1":Z
    .end local v2    # "$i$f$edit\\1\\53":I
    .end local v3    # "editor\\1":Landroid/content/SharedPreferences$Editor;
    return-void
.end method
