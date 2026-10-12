.class public final Landroidx/compose/foundation/internal/DecodeHelper;
.super Ljava/lang/Object;
.source "ClipboardUtils.android.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nClipboardUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipboardUtils.android.kt\nandroidx/compose/foundation/internal/DecodeHelper\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,556:1\n30#2:557\n53#3,3:558\n*S KotlinDebug\n*F\n+ 1 ClipboardUtils.android.kt\nandroidx/compose/foundation/internal/DecodeHelper\n*L\n450#1:557\n450#1:558,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0007\u001a\u00020\u0008H\u0002J\u0015\u0010\t\u001a\u00020\nH\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0008\u0010\r\u001a\u00020\u000eH\u0002J\u0013\u0010\u000f\u001a\u00020\u0010\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0008\u0010\u0013\u001a\u00020\u0014H\u0002J\u0013\u0010\u0015\u001a\u00020\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u0018J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0008\u0010\u001e\u001a\u00020\u0008H\u0002J\u0008\u0010\u001f\u001a\u00020 H\u0002J\u0006\u0010!\u001a\u00020\"J\n\u0010#\u001a\u0004\u0018\u00010\u0003H\u0002J\u0008\u0010$\u001a\u00020%H\u0002J\u0008\u0010&\u001a\u00020\'H\u0002J\u0013\u0010(\u001a\u00020)\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008*\u0010\u0012J\u0015\u0010+\u001a\u00020,H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008-\u0010\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006."
    }
    d2 = {
        "Landroidx/compose/foundation/internal/DecodeHelper;",
        "",
        "string",
        "",
        "(Ljava/lang/String;)V",
        "parcel",
        "Landroid/os/Parcel;",
        "dataAvailable",
        "",
        "decodeBaselineShift",
        "Landroidx/compose/ui/text/style/BaselineShift;",
        "decodeBaselineShift-y9eOQZs",
        "()F",
        "decodeByte",
        "",
        "decodeColor",
        "Landroidx/compose/ui/graphics/Color;",
        "decodeColor-0d7_KjU",
        "()J",
        "decodeFloat",
        "",
        "decodeFontStyle",
        "Landroidx/compose/ui/text/font/FontStyle;",
        "decodeFontStyle-_-LCdwA",
        "()I",
        "decodeFontSynthesis",
        "Landroidx/compose/ui/text/font/FontSynthesis;",
        "decodeFontSynthesis-GVVA2EU",
        "decodeFontWeight",
        "Landroidx/compose/ui/text/font/FontWeight;",
        "decodeInt",
        "decodeShadow",
        "Landroidx/compose/ui/graphics/Shadow;",
        "decodeSpanStyle",
        "Landroidx/compose/ui/text/SpanStyle;",
        "decodeString",
        "decodeTextDecoration",
        "Landroidx/compose/ui/text/style/TextDecoration;",
        "decodeTextGeometricTransform",
        "Landroidx/compose/ui/text/style/TextGeometricTransform;",
        "decodeTextUnit",
        "Landroidx/compose/ui/unit/TextUnit;",
        "decodeTextUnit-XSAIIZE",
        "decodeULong",
        "Lkotlin/ULong;",
        "decodeULong-s-VKNKU",
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
.field private final parcel:Landroid/os/Parcel;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Landroidx/compose/foundation/internal/DecodeHelper;->$stable:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 4
    .param p1, "string"    # Ljava/lang/String;

    .line 297
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 298
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/foundation/internal/DecodeHelper;->parcel:Landroid/os/Parcel;

    .line 300
    nop

    .line 301
    const/4 v0, 0x0

    invoke-static {p1, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v1

    .line 302
    .local v1, "bytes":[B
    iget-object v2, p0, Landroidx/compose/foundation/internal/DecodeHelper;->parcel:Landroid/os/Parcel;

    array-length v3, v1

    invoke-virtual {v2, v1, v0, v3}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 303
    iget-object v2, p0, Landroidx/compose/foundation/internal/DecodeHelper;->parcel:Landroid/os/Parcel;

    invoke-virtual {v2, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 304
    .end local v1    # "bytes":[B
    nop

    .line 297
    return-void
.end method

.method private final dataAvailable()I
    .locals 1

    .line 476
    iget-object v0, p0, Landroidx/compose/foundation/internal/DecodeHelper;->parcel:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->dataAvail()I

    move-result v0

    return v0
.end method

.method private final decodeBaselineShift-y9eOQZs()F
    .locals 1

    .line 425
    invoke-direct {p0}, Landroidx/compose/foundation/internal/DecodeHelper;->decodeFloat()F

    move-result v0

    invoke-static {v0}, Landroidx/compose/ui/text/style/BaselineShift;->constructor-impl(F)F

    move-result v0

    return v0
.end method

.method private final decodeByte()B
    .locals 1

    .line 456
    iget-object v0, p0, Landroidx/compose/foundation/internal/DecodeHelper;->parcel:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readByte()B

    move-result v0

    return v0
.end method

.method private final decodeFloat()F
    .locals 1

    .line 468
    iget-object v0, p0, Landroidx/compose/foundation/internal/DecodeHelper;->parcel:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    return v0
.end method

.method private final decodeInt()I
    .locals 1

    .line 460
    iget-object v0, p0, Landroidx/compose/foundation/internal/DecodeHelper;->parcel:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    return v0
.end method

.method private final decodeShadow()Landroidx/compose/ui/graphics/Shadow;
    .locals 15

    .line 448
    new-instance v0, Landroidx/compose/ui/graphics/Shadow;

    .line 449
    invoke-virtual {p0}, Landroidx/compose/foundation/internal/DecodeHelper;->decodeColor-0d7_KjU()J

    move-result-wide v1

    .line 450
    invoke-direct {p0}, Landroidx/compose/foundation/internal/DecodeHelper;->decodeFloat()F

    move-result v3

    .local v3, "x$iv":F
    invoke-direct {p0}, Landroidx/compose/foundation/internal/DecodeHelper;->decodeFloat()F

    move-result v4

    .local v4, "y$iv":F
    const/4 v5, 0x0

    .line 557
    .local v5, "$i$f$Offset":I
    const/4 v6, 0x0

    .line 558
    .local v6, "$i$f$packFloats":I
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    int-to-long v7, v7

    .line 559
    .local v7, "v1$iv$iv":J
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v9

    int-to-long v9, v9

    .line 560
    .local v9, "v2$iv$iv":J
    const/16 v11, 0x20

    shl-long v11, v7, v11

    const-wide v13, 0xffffffffL

    and-long/2addr v13, v9

    or-long v6, v11, v13

    .line 557
    .end local v6    # "$i$f$packFloats":I
    .end local v7    # "v1$iv$iv":J
    .end local v9    # "v2$iv$iv":J
    invoke-static {v6, v7}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    move-result-wide v3

    .line 451
    .end local v3    # "x$iv":F
    .end local v4    # "y$iv":F
    .end local v5    # "$i$f$Offset":I
    invoke-direct {p0}, Landroidx/compose/foundation/internal/DecodeHelper;->decodeFloat()F

    move-result v5

    .line 448
    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Landroidx/compose/ui/graphics/Shadow;-><init>(JJFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private final decodeString()Ljava/lang/String;
    .locals 1

    .line 472
    iget-object v0, p0, Landroidx/compose/foundation/internal/DecodeHelper;->parcel:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final decodeTextDecoration()Landroidx/compose/ui/text/style/TextDecoration;
    .locals 8

    .line 433
    invoke-direct {p0}, Landroidx/compose/foundation/internal/DecodeHelper;->decodeInt()I

    move-result v0

    .line 434
    .local v0, "mask":I
    sget-object v1, Landroidx/compose/ui/text/style/TextDecoration;->Companion:Landroidx/compose/ui/text/style/TextDecoration$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/style/TextDecoration$Companion;->getLineThrough()Landroidx/compose/ui/text/style/TextDecoration;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/text/style/TextDecoration;->getMask()I

    move-result v1

    and-int/2addr v1, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    .line 435
    .local v1, "hasLineThrough":Z
    :goto_0
    sget-object v4, Landroidx/compose/ui/text/style/TextDecoration;->Companion:Landroidx/compose/ui/text/style/TextDecoration$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/text/style/TextDecoration$Companion;->getUnderline()Landroidx/compose/ui/text/style/TextDecoration;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/ui/text/style/TextDecoration;->getMask()I

    move-result v4

    and-int/2addr v4, v0

    if-eqz v4, :cond_1

    move v4, v2

    goto :goto_1

    :cond_1
    move v4, v3

    .line 436
    .local v4, "hasUnderline":Z
    :goto_1
    if-eqz v1, :cond_2

    if-eqz v4, :cond_2

    .line 437
    sget-object v5, Landroidx/compose/ui/text/style/TextDecoration;->Companion:Landroidx/compose/ui/text/style/TextDecoration$Companion;

    const/4 v6, 0x2

    new-array v6, v6, [Landroidx/compose/ui/text/style/TextDecoration;

    sget-object v7, Landroidx/compose/ui/text/style/TextDecoration;->Companion:Landroidx/compose/ui/text/style/TextDecoration$Companion;

    invoke-virtual {v7}, Landroidx/compose/ui/text/style/TextDecoration$Companion;->getLineThrough()Landroidx/compose/ui/text/style/TextDecoration;

    move-result-object v7

    aput-object v7, v6, v3

    sget-object v3, Landroidx/compose/ui/text/style/TextDecoration;->Companion:Landroidx/compose/ui/text/style/TextDecoration$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/text/style/TextDecoration$Companion;->getUnderline()Landroidx/compose/ui/text/style/TextDecoration;

    move-result-object v3

    aput-object v3, v6, v2

    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v5, v2}, Landroidx/compose/ui/text/style/TextDecoration$Companion;->combine(Ljava/util/List;)Landroidx/compose/ui/text/style/TextDecoration;

    move-result-object v2

    goto :goto_2

    .line 438
    :cond_2
    if-eqz v1, :cond_3

    .line 439
    sget-object v2, Landroidx/compose/ui/text/style/TextDecoration;->Companion:Landroidx/compose/ui/text/style/TextDecoration$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/text/style/TextDecoration$Companion;->getLineThrough()Landroidx/compose/ui/text/style/TextDecoration;

    move-result-object v2

    goto :goto_2

    .line 440
    :cond_3
    if-eqz v4, :cond_4

    .line 441
    sget-object v2, Landroidx/compose/ui/text/style/TextDecoration;->Companion:Landroidx/compose/ui/text/style/TextDecoration$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/text/style/TextDecoration$Companion;->getUnderline()Landroidx/compose/ui/text/style/TextDecoration;

    move-result-object v2

    goto :goto_2

    .line 443
    :cond_4
    sget-object v2, Landroidx/compose/ui/text/style/TextDecoration;->Companion:Landroidx/compose/ui/text/style/TextDecoration$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/text/style/TextDecoration$Companion;->getNone()Landroidx/compose/ui/text/style/TextDecoration;

    move-result-object v2

    .line 436
    :goto_2
    return-object v2
.end method

.method private final decodeTextGeometricTransform()Landroidx/compose/ui/text/style/TextGeometricTransform;
    .locals 3

    .line 429
    new-instance v0, Landroidx/compose/ui/text/style/TextGeometricTransform;

    invoke-direct {p0}, Landroidx/compose/foundation/internal/DecodeHelper;->decodeFloat()F

    move-result v1

    invoke-direct {p0}, Landroidx/compose/foundation/internal/DecodeHelper;->decodeFloat()F

    move-result v2

    invoke-direct {v0, v1, v2}, Landroidx/compose/ui/text/style/TextGeometricTransform;-><init>(FF)V

    return-object v0
.end method

.method private final decodeULong-s-VKNKU()J
    .locals 2

    .line 464
    iget-object v0, p0, Landroidx/compose/foundation/internal/DecodeHelper;->parcel:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    invoke-static {v0, v1}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public final decodeColor-0d7_KjU()J
    .locals 2

    .line 385
    invoke-direct {p0}, Landroidx/compose/foundation/internal/DecodeHelper;->decodeULong-s-VKNKU()J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/Color;->constructor-impl(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final decodeFontStyle-_-LCdwA()I
    .locals 2

    .line 407
    invoke-direct {p0}, Landroidx/compose/foundation/internal/DecodeHelper;->decodeByte()B

    move-result v0

    .line 408
    if-nez v0, :cond_0

    sget-object v0, Landroidx/compose/ui/text/font/FontStyle;->Companion:Landroidx/compose/ui/text/font/FontStyle$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontStyle$Companion;->getNormal-_-LCdwA()I

    move-result v0

    goto :goto_0

    .line 409
    :cond_0
    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    sget-object v0, Landroidx/compose/ui/text/font/FontStyle;->Companion:Landroidx/compose/ui/text/font/FontStyle$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontStyle$Companion;->getItalic-_-LCdwA()I

    move-result v0

    goto :goto_0

    .line 410
    :cond_1
    sget-object v0, Landroidx/compose/ui/text/font/FontStyle;->Companion:Landroidx/compose/ui/text/font/FontStyle$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontStyle$Companion;->getNormal-_-LCdwA()I

    move-result v0

    .line 407
    :goto_0
    return v0
.end method

.method public final decodeFontSynthesis-GVVA2EU()I
    .locals 2

    .line 415
    invoke-direct {p0}, Landroidx/compose/foundation/internal/DecodeHelper;->decodeByte()B

    move-result v0

    .line 416
    if-nez v0, :cond_0

    sget-object v0, Landroidx/compose/ui/text/font/FontSynthesis;->Companion:Landroidx/compose/ui/text/font/FontSynthesis$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontSynthesis$Companion;->getNone-GVVA2EU()I

    move-result v0

    goto :goto_0

    .line 417
    :cond_0
    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    sget-object v0, Landroidx/compose/ui/text/font/FontSynthesis;->Companion:Landroidx/compose/ui/text/font/FontSynthesis$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontSynthesis$Companion;->getAll-GVVA2EU()I

    move-result v0

    goto :goto_0

    .line 418
    :cond_1
    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    sget-object v0, Landroidx/compose/ui/text/font/FontSynthesis;->Companion:Landroidx/compose/ui/text/font/FontSynthesis$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontSynthesis$Companion;->getStyle-GVVA2EU()I

    move-result v0

    goto :goto_0

    .line 419
    :cond_2
    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    sget-object v0, Landroidx/compose/ui/text/font/FontSynthesis;->Companion:Landroidx/compose/ui/text/font/FontSynthesis$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontSynthesis$Companion;->getWeight-GVVA2EU()I

    move-result v0

    goto :goto_0

    .line 420
    :cond_3
    sget-object v0, Landroidx/compose/ui/text/font/FontSynthesis;->Companion:Landroidx/compose/ui/text/font/FontSynthesis$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontSynthesis$Companion;->getNone-GVVA2EU()I

    move-result v0

    .line 415
    :goto_0
    return v0
.end method

.method public final decodeFontWeight()Landroidx/compose/ui/text/font/FontWeight;
    .locals 2

    .line 403
    new-instance v0, Landroidx/compose/ui/text/font/FontWeight;

    invoke-direct {p0}, Landroidx/compose/foundation/internal/DecodeHelper;->decodeInt()I

    move-result v1

    invoke-direct {v0, v1}, Landroidx/compose/ui/text/font/FontWeight;-><init>(I)V

    return-object v0
.end method

.method public final decodeSpanStyle()Landroidx/compose/ui/text/SpanStyle;
    .locals 21

    .line 308
    new-instance v0, Landroidx/compose/foundation/internal/MutableSpanStyle;

    const/16 v19, 0x3fff

    const/16 v20, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v0 .. v20}, Landroidx/compose/foundation/internal/MutableSpanStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 309
    .local v0, "mutableSpanStyle":Landroidx/compose/foundation/internal/MutableSpanStyle;
    :cond_0
    :goto_0
    move-object/from16 v1, p0

    iget-object v2, v1, Landroidx/compose/foundation/internal/DecodeHelper;->parcel:Landroid/os/Parcel;

    invoke-virtual {v2}, Landroid/os/Parcel;->dataAvail()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_17

    .line 310
    invoke-direct {v1}, Landroidx/compose/foundation/internal/DecodeHelper;->decodeByte()B

    move-result v2

    .line 311
    const/16 v4, 0x8

    if-ne v2, v3, :cond_2

    .line 312
    invoke-direct {v1}, Landroidx/compose/foundation/internal/DecodeHelper;->dataAvailable()I

    move-result v2

    if-lt v2, v4, :cond_1

    .line 313
    invoke-virtual {v1}, Landroidx/compose/foundation/internal/DecodeHelper;->decodeColor-0d7_KjU()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Landroidx/compose/foundation/internal/MutableSpanStyle;->setColor-8_81llA(J)V

    goto :goto_0

    .line 315
    :cond_1
    goto/16 :goto_1

    .line 317
    :cond_2
    const/4 v5, 0x2

    const/4 v6, 0x5

    if-ne v2, v5, :cond_4

    .line 318
    invoke-direct {v1}, Landroidx/compose/foundation/internal/DecodeHelper;->dataAvailable()I

    move-result v2

    if-lt v2, v6, :cond_3

    .line 319
    invoke-virtual {v1}, Landroidx/compose/foundation/internal/DecodeHelper;->decodeTextUnit-XSAIIZE()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Landroidx/compose/foundation/internal/MutableSpanStyle;->setFontSize--R2X_6o(J)V

    goto :goto_0

    .line 321
    :cond_3
    goto/16 :goto_1

    .line 323
    :cond_4
    const/4 v5, 0x3

    const/4 v7, 0x4

    if-ne v2, v5, :cond_6

    .line 324
    invoke-direct {v1}, Landroidx/compose/foundation/internal/DecodeHelper;->dataAvailable()I

    move-result v2

    if-lt v2, v7, :cond_5

    .line 325
    invoke-virtual {v1}, Landroidx/compose/foundation/internal/DecodeHelper;->decodeFontWeight()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroidx/compose/foundation/internal/MutableSpanStyle;->setFontWeight(Landroidx/compose/ui/text/font/FontWeight;)V

    goto :goto_0

    .line 327
    :cond_5
    goto/16 :goto_1

    .line 329
    :cond_6
    if-ne v2, v7, :cond_8

    .line 330
    invoke-direct {v1}, Landroidx/compose/foundation/internal/DecodeHelper;->dataAvailable()I

    move-result v2

    if-lt v2, v3, :cond_7

    .line 331
    invoke-virtual {v1}, Landroidx/compose/foundation/internal/DecodeHelper;->decodeFontStyle-_-LCdwA()I

    move-result v2

    invoke-static {v2}, Landroidx/compose/ui/text/font/FontStyle;->box-impl(I)Landroidx/compose/ui/text/font/FontStyle;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroidx/compose/foundation/internal/MutableSpanStyle;->setFontStyle-mLjRB2g(Landroidx/compose/ui/text/font/FontStyle;)V

    goto :goto_0

    .line 333
    :cond_7
    goto/16 :goto_1

    .line 335
    :cond_8
    if-ne v2, v6, :cond_a

    .line 336
    invoke-direct {v1}, Landroidx/compose/foundation/internal/DecodeHelper;->dataAvailable()I

    move-result v2

    if-lt v2, v3, :cond_9

    .line 337
    invoke-virtual {v1}, Landroidx/compose/foundation/internal/DecodeHelper;->decodeFontSynthesis-GVVA2EU()I

    move-result v2

    invoke-static {v2}, Landroidx/compose/ui/text/font/FontSynthesis;->box-impl(I)Landroidx/compose/ui/text/font/FontSynthesis;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroidx/compose/foundation/internal/MutableSpanStyle;->setFontSynthesis-tDdu0R4(Landroidx/compose/ui/text/font/FontSynthesis;)V

    goto :goto_0

    .line 339
    :cond_9
    goto/16 :goto_1

    .line 341
    :cond_a
    const/4 v3, 0x6

    if-ne v2, v3, :cond_b

    invoke-direct {v1}, Landroidx/compose/foundation/internal/DecodeHelper;->decodeString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroidx/compose/foundation/internal/MutableSpanStyle;->setFontFeatureSettings(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 342
    :cond_b
    const/4 v3, 0x7

    if-ne v2, v3, :cond_d

    .line 343
    invoke-direct {v1}, Landroidx/compose/foundation/internal/DecodeHelper;->dataAvailable()I

    move-result v2

    if-lt v2, v6, :cond_c

    .line 344
    invoke-virtual {v1}, Landroidx/compose/foundation/internal/DecodeHelper;->decodeTextUnit-XSAIIZE()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Landroidx/compose/foundation/internal/MutableSpanStyle;->setLetterSpacing--R2X_6o(J)V

    goto/16 :goto_0

    .line 346
    :cond_c
    goto/16 :goto_1

    .line 348
    :cond_d
    if-ne v2, v4, :cond_f

    .line 349
    invoke-direct {v1}, Landroidx/compose/foundation/internal/DecodeHelper;->dataAvailable()I

    move-result v2

    if-lt v2, v7, :cond_e

    .line 350
    invoke-direct {v1}, Landroidx/compose/foundation/internal/DecodeHelper;->decodeBaselineShift-y9eOQZs()F

    move-result v2

    invoke-static {v2}, Landroidx/compose/ui/text/style/BaselineShift;->box-impl(F)Landroidx/compose/ui/text/style/BaselineShift;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroidx/compose/foundation/internal/MutableSpanStyle;->setBaselineShift-_isdbwI(Landroidx/compose/ui/text/style/BaselineShift;)V

    goto/16 :goto_0

    .line 352
    :cond_e
    goto :goto_1

    .line 354
    :cond_f
    const/16 v3, 0x9

    if-ne v2, v3, :cond_11

    .line 355
    invoke-direct {v1}, Landroidx/compose/foundation/internal/DecodeHelper;->dataAvailable()I

    move-result v2

    if-lt v2, v4, :cond_10

    .line 356
    invoke-direct {v1}, Landroidx/compose/foundation/internal/DecodeHelper;->decodeTextGeometricTransform()Landroidx/compose/ui/text/style/TextGeometricTransform;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroidx/compose/foundation/internal/MutableSpanStyle;->setTextGeometricTransform(Landroidx/compose/ui/text/style/TextGeometricTransform;)V

    goto/16 :goto_0

    .line 358
    :cond_10
    goto :goto_1

    .line 360
    :cond_11
    const/16 v3, 0xa

    if-ne v2, v3, :cond_13

    .line 361
    invoke-direct {v1}, Landroidx/compose/foundation/internal/DecodeHelper;->dataAvailable()I

    move-result v2

    if-lt v2, v4, :cond_12

    .line 362
    invoke-virtual {v1}, Landroidx/compose/foundation/internal/DecodeHelper;->decodeColor-0d7_KjU()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Landroidx/compose/foundation/internal/MutableSpanStyle;->setBackground-8_81llA(J)V

    goto/16 :goto_0

    .line 364
    :cond_12
    goto :goto_1

    .line 366
    :cond_13
    const/16 v3, 0xb

    if-ne v2, v3, :cond_15

    .line 367
    invoke-direct {v1}, Landroidx/compose/foundation/internal/DecodeHelper;->dataAvailable()I

    move-result v2

    if-lt v2, v7, :cond_14

    .line 368
    invoke-direct {v1}, Landroidx/compose/foundation/internal/DecodeHelper;->decodeTextDecoration()Landroidx/compose/ui/text/style/TextDecoration;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroidx/compose/foundation/internal/MutableSpanStyle;->setTextDecoration(Landroidx/compose/ui/text/style/TextDecoration;)V

    goto/16 :goto_0

    .line 370
    :cond_14
    goto :goto_1

    .line 372
    :cond_15
    const/16 v3, 0xc

    if-ne v2, v3, :cond_0

    .line 373
    invoke-direct {v1}, Landroidx/compose/foundation/internal/DecodeHelper;->dataAvailable()I

    move-result v2

    const/16 v3, 0x14

    if-lt v2, v3, :cond_16

    .line 374
    invoke-direct {v1}, Landroidx/compose/foundation/internal/DecodeHelper;->decodeShadow()Landroidx/compose/ui/graphics/Shadow;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroidx/compose/foundation/internal/MutableSpanStyle;->setShadow(Landroidx/compose/ui/graphics/Shadow;)V

    goto/16 :goto_0

    .line 376
    :cond_16
    nop

    .line 381
    :cond_17
    :goto_1
    invoke-virtual {v0}, Landroidx/compose/foundation/internal/MutableSpanStyle;->toSpanStyle()Landroidx/compose/ui/text/SpanStyle;

    move-result-object v2

    return-object v2
.end method

.method public final decodeTextUnit-XSAIIZE()J
    .locals 5

    .line 390
    invoke-direct {p0}, Landroidx/compose/foundation/internal/DecodeHelper;->decodeByte()B

    move-result v0

    .line 391
    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    sget-object v0, Landroidx/compose/ui/unit/TextUnitType;->Companion:Landroidx/compose/ui/unit/TextUnitType$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/unit/TextUnitType$Companion;->getSp-UIouoOA()J

    move-result-wide v0

    goto :goto_0

    .line 392
    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    sget-object v0, Landroidx/compose/ui/unit/TextUnitType;->Companion:Landroidx/compose/ui/unit/TextUnitType$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/unit/TextUnitType$Companion;->getEm-UIouoOA()J

    move-result-wide v0

    goto :goto_0

    .line 393
    :cond_1
    sget-object v0, Landroidx/compose/ui/unit/TextUnitType;->Companion:Landroidx/compose/ui/unit/TextUnitType$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/unit/TextUnitType$Companion;->getUnspecified-UIouoOA()J

    move-result-wide v0

    .line 390
    :goto_0
    nop

    .line 389
    nop

    .line 395
    .local v0, "type":J
    sget-object v2, Landroidx/compose/ui/unit/TextUnitType;->Companion:Landroidx/compose/ui/unit/TextUnitType$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/unit/TextUnitType$Companion;->getUnspecified-UIouoOA()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/unit/TextUnitType;->equals-impl0(JJ)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 396
    sget-object v2, Landroidx/compose/ui/unit/TextUnit;->Companion:Landroidx/compose/ui/unit/TextUnit$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/unit/TextUnit$Companion;->getUnspecified-XSAIIZE()J

    move-result-wide v2

    return-wide v2

    .line 398
    :cond_2
    invoke-direct {p0}, Landroidx/compose/foundation/internal/DecodeHelper;->decodeFloat()F

    move-result v2

    .line 399
    .local v2, "value":F
    invoke-static {v2, v0, v1}, Landroidx/compose/ui/unit/TextUnitKt;->TextUnit-anM5pPY(FJ)J

    move-result-wide v3

    return-wide v3
.end method
