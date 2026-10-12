.class public final Landroidx/collection/FloatFloatPair;
.super Ljava/lang/Object;
.source "FloatFloatPair.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFloatFloatPair.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n+ 2 PackingUtils.kt\nandroidx/collection/PackingUtilsKt\n+ 3 PackingHelpers.jvm.kt\nandroidx/collection/internal/PackingHelpers_jvmKt\n*L\n1#1,84:1\n51#1:92\n55#1:94\n22#2,3:85\n22#3:88\n22#3:89\n22#3:90\n22#3:91\n22#3:93\n*S KotlinDebug\n*F\n+ 1 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n*L\n82#1:92\n82#1:94\n47#1:85,3\n51#1:88\n55#1:89\n67#1:90\n80#1:91\n82#1:93\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0087@\u0018\u00002\u00020\u0001B\u0019\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006B\u0011\u0008\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0005\u0010\tJ\u0010\u0010\r\u001a\u00020\u0003H\u0086\n\u00a2\u0006\u0004\u0008\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0003H\u0086\n\u00a2\u0006\u0004\u0008\u0010\u0010\u000bJ\u001a\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u0012\u0010\u0002\u001a\u00020\u00038\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bR\u0010\u0010\u0007\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00038\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\u000b\u0088\u0001\u0007\u00a8\u0006\u001e"
    }
    d2 = {
        "Landroidx/collection/FloatFloatPair;",
        "",
        "first",
        "",
        "second",
        "constructor-impl",
        "(FF)J",
        "packedValue",
        "",
        "(J)J",
        "getFirst-impl",
        "(J)F",
        "getSecond-impl",
        "component1",
        "component1-impl",
        "component2",
        "component2-impl",
        "equals",
        "",
        "other",
        "equals-impl",
        "(JLjava/lang/Object;)Z",
        "hashCode",
        "",
        "hashCode-impl",
        "(J)I",
        "toString",
        "",
        "toString-impl",
        "(J)Ljava/lang/String;",
        "collection"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/jvm/JvmInline;
.end annotation


# instance fields
.field public final packedValue:J


# direct methods
.method private synthetic constructor <init>(J)V
    .locals 0
    .param p1, "packedValue"    # J

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Landroidx/collection/FloatFloatPair;->packedValue:J

    return-void
.end method

.method public static final synthetic box-impl(J)Landroidx/collection/FloatFloatPair;
    .locals 1

    new-instance v0, Landroidx/collection/FloatFloatPair;

    invoke-direct {v0, p0, p1}, Landroidx/collection/FloatFloatPair;-><init>(J)V

    return-object v0
.end method

.method public static final component1-impl(J)F
    .locals 3
    .param p0, "arg0"    # J

    const/4 v0, 0x0

    .line 67
    .local v0, "$i$f$component1-impl":I
    const/16 v1, 0x20

    shr-long v1, p0, v1

    long-to-int v1, v1

    .local v1, "bits$iv":I
    const/4 v2, 0x0

    .line 90
    .local v2, "$i$f$floatFromBits":I
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    .line 67
    .end local v1    # "bits$iv":I
    .end local v2    # "$i$f$floatFromBits":I
    return v1
.end method

.method public static final component2-impl(J)F
    .locals 3
    .param p0, "arg0"    # J

    const/4 v0, 0x0

    .line 80
    .local v0, "$i$f$component2-impl":I
    const-wide v1, 0xffffffffL

    and-long/2addr v1, p0

    long-to-int v1, v1

    .local v1, "bits$iv":I
    const/4 v2, 0x0

    .line 91
    .local v2, "$i$f$floatFromBits":I
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    .line 80
    .end local v1    # "bits$iv":I
    .end local v2    # "$i$f$floatFromBits":I
    return v1
.end method

.method public static constructor-impl(FF)J
    .locals 9
    .param p0, "first"    # F
    .param p1, "second"    # F

    .line 47
    const/4 v0, 0x0

    .line 85
    .local v0, "$i$f$packFloats":I
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    .line 86
    .local v1, "v1$iv":J
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    .line 87
    .local v3, "v2$iv":J
    const/16 v5, 0x20

    shl-long v5, v1, v5

    const-wide v7, 0xffffffffL

    and-long/2addr v7, v3

    or-long v0, v5, v7

    .line 47
    .end local v0    # "$i$f$packFloats":I
    .end local v1    # "v1$iv":J
    .end local v3    # "v2$iv":J
    invoke-static {v0, v1}, Landroidx/collection/FloatFloatPair;->constructor-impl(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static constructor-impl(J)J
    .locals 0

    return-wide p0
.end method

.method public static equals-impl(JLjava/lang/Object;)Z
    .locals 4

    instance-of v0, p2, Landroidx/collection/FloatFloatPair;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    move-object v0, p2

    check-cast v0, Landroidx/collection/FloatFloatPair;

    invoke-virtual {v0}, Landroidx/collection/FloatFloatPair;->unbox-impl()J

    move-result-wide v2

    cmp-long v0, p0, v2

    if-eqz v0, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public static final equals-impl0(JJ)Z
    .locals 1

    cmp-long v0, p0, p2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static final getFirst-impl(J)F
    .locals 3
    .param p0, "arg0"    # J

    const/4 v0, 0x0

    .line 51
    .local v0, "$i$f$getFirst-impl":I
    const/16 v1, 0x20

    shr-long v1, p0, v1

    long-to-int v1, v1

    .local v1, "bits$iv":I
    const/4 v2, 0x0

    .line 88
    .local v2, "$i$f$floatFromBits":I
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    .line 51
    .end local v1    # "bits$iv":I
    .end local v2    # "$i$f$floatFromBits":I
    return v1
.end method

.method public static final getSecond-impl(J)F
    .locals 3
    .param p0, "arg0"    # J

    const/4 v0, 0x0

    .line 55
    .local v0, "$i$f$getSecond-impl":I
    const-wide v1, 0xffffffffL

    and-long/2addr v1, p0

    long-to-int v1, v1

    .local v1, "bits$iv":I
    const/4 v2, 0x0

    .line 89
    .local v2, "$i$f$floatFromBits":I
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    .line 55
    .end local v1    # "bits$iv":I
    .end local v2    # "$i$f$floatFromBits":I
    return v1
.end method

.method public static hashCode-impl(J)I
    .locals 1

    invoke-static {p0, p1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    return v0
.end method

.method public static toString-impl(J)Ljava/lang/String;
    .locals 4
    .param p0, "arg0"    # J

    .line 82
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x0

    .line 92
    .local v1, "$i$f$getFirst-impl":I
    const/16 v2, 0x20

    shr-long v2, p0, v2

    long-to-int v2, v2

    .local v2, "bits$iv$iv":I
    const/4 v3, 0x0

    .line 93
    .local v3, "$i$f$floatFromBits":I
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    .line 92
    .end local v2    # "bits$iv$iv":I
    .end local v3    # "$i$f$floatFromBits":I
    nop

    .line 82
    .end local v1    # "$i$f$getFirst-impl":I
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x0

    .line 94
    .local v1, "$i$f$getSecond-impl":I
    const-wide v2, 0xffffffffL

    and-long/2addr v2, p0

    long-to-int v2, v2

    .restart local v2    # "bits$iv$iv":I
    const/4 v3, 0x0

    .line 93
    .restart local v3    # "$i$f$floatFromBits":I
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    .line 94
    .end local v2    # "bits$iv$iv":I
    .end local v3    # "$i$f$floatFromBits":I
    nop

    .line 82
    .end local v1    # "$i$f$getSecond-impl":I
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    iget-wide v0, p0, Landroidx/collection/FloatFloatPair;->packedValue:J

    invoke-static {v0, v1, p1}, Landroidx/collection/FloatFloatPair;->equals-impl(JLjava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Landroidx/collection/FloatFloatPair;->packedValue:J

    invoke-static {v0, v1}, Landroidx/collection/FloatFloatPair;->hashCode-impl(J)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 82
    iget-wide v0, p0, Landroidx/collection/FloatFloatPair;->packedValue:J

    invoke-static {v0, v1}, Landroidx/collection/FloatFloatPair;->toString-impl(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic unbox-impl()J
    .locals 2

    iget-wide v0, p0, Landroidx/collection/FloatFloatPair;->packedValue:J

    return-wide v0
.end method
