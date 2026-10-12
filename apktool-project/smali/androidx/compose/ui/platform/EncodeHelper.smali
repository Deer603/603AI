.class public final Landroidx/compose/ui/platform/EncodeHelper;
.super Ljava/lang/Object;
.source "AndroidClipboardManager.android.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAndroidClipboardManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidClipboardManager.android.kt\nandroidx/compose/ui/platform/EncodeHelper\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,599:1\n65#2:600\n69#2:603\n60#3:601\n70#3:604\n22#4:602\n22#4:605\n*S KotlinDebug\n*F\n+ 1 AndroidClipboardManager.android.kt\nandroidx/compose/ui/platform/EncodeHelper\n*L\n313#1:600\n314#1:603\n313#1:601\n314#1:604\n313#1:602\n314#1:605\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u000cJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0015\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001fJ\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\"\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010%\u001a\u00020&J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\'\u001a\u00020(J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010)\u001a\u00020*J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010+\u001a\u00020,\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008-\u0010\nJ\u0006\u0010.\u001a\u00020*J\u0006\u0010/\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u00060"
    }
    d2 = {
        "Landroidx/compose/ui/platform/EncodeHelper;",
        "",
        "()V",
        "parcel",
        "Landroid/os/Parcel;",
        "encode",
        "",
        "color",
        "Landroidx/compose/ui/graphics/Color;",
        "encode-8_81llA",
        "(J)V",
        "shadow",
        "Landroidx/compose/ui/graphics/Shadow;",
        "spanStyle",
        "Landroidx/compose/ui/text/SpanStyle;",
        "fontStyle",
        "Landroidx/compose/ui/text/font/FontStyle;",
        "encode-nzbMABs",
        "(I)V",
        "fontSynthesis",
        "Landroidx/compose/ui/text/font/FontSynthesis;",
        "encode-6p3vJLY",
        "fontWeight",
        "Landroidx/compose/ui/text/font/FontWeight;",
        "baselineShift",
        "Landroidx/compose/ui/text/style/BaselineShift;",
        "encode-4Dl_Bck",
        "(F)V",
        "textDecoration",
        "Landroidx/compose/ui/text/style/TextDecoration;",
        "textGeometricTransform",
        "Landroidx/compose/ui/text/style/TextGeometricTransform;",
        "textUnit",
        "Landroidx/compose/ui/unit/TextUnit;",
        "encode--R2X_6o",
        "byte",
        "",
        "float",
        "",
        "int",
        "",
        "string",
        "",
        "uLong",
        "Lkotlin/ULong;",
        "encode-VKZWuLQ",
        "encodedString",
        "reset",
        "ui_release"
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
.field private parcel:Landroid/os/Parcel;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Landroidx/compose/ui/platform/EncodeHelper;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 181
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 182
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/platform/EncodeHelper;->parcel:Landroid/os/Parcel;

    .line 181
    return-void
.end method


# virtual methods
.method public final encode(B)V
    .locals 1
    .param p1, "byte"    # B

    .line 319
    iget-object v0, p0, Landroidx/compose/ui/platform/EncodeHelper;->parcel:Landroid/os/Parcel;

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeByte(B)V

    .line 320
    return-void
.end method

.method public final encode(F)V
    .locals 1
    .param p1, "float"    # F

    .line 327
    iget-object v0, p0, Landroidx/compose/ui/platform/EncodeHelper;->parcel:Landroid/os/Parcel;

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeFloat(F)V

    .line 328
    return-void
.end method

.method public final encode(I)V
    .locals 1
    .param p1, "int"    # I

    .line 323
    iget-object v0, p0, Landroidx/compose/ui/platform/EncodeHelper;->parcel:Landroid/os/Parcel;

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 324
    return-void
.end method

.method public final encode(Landroidx/compose/ui/graphics/Shadow;)V
    .locals 8
    .param p1, "shadow"    # Landroidx/compose/ui/graphics/Shadow;

    .line 312
    invoke-virtual {p1}, Landroidx/compose/ui/graphics/Shadow;->getColor-0d7_KjU()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/platform/EncodeHelper;->encode-8_81llA(J)V

    .line 313
    invoke-virtual {p1}, Landroidx/compose/ui/graphics/Shadow;->getOffset-F1C5BW0()J

    move-result-wide v0

    .local v0, "arg0$iv":J
    const/4 v2, 0x0

    .line 600
    .local v2, "$i$f$getX-impl":I
    move-wide v3, v0

    .local v3, "value$iv$iv":J
    const/4 v5, 0x0

    .line 601
    .local v5, "$i$f$unpackFloat1":I
    const/16 v6, 0x20

    shr-long v6, v3, v6

    long-to-int v6, v6

    .local v6, "bits$iv$iv$iv":I
    const/4 v7, 0x0

    .line 602
    .local v7, "$i$f$floatFromBits":I
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    .line 601
    .end local v6    # "bits$iv$iv$iv":I
    .end local v7    # "$i$f$floatFromBits":I
    nop

    .line 600
    .end local v3    # "value$iv$iv":J
    .end local v5    # "$i$f$unpackFloat1":I
    nop

    .line 313
    .end local v0    # "arg0$iv":J
    .end local v2    # "$i$f$getX-impl":I
    invoke-virtual {p0, v6}, Landroidx/compose/ui/platform/EncodeHelper;->encode(F)V

    .line 314
    invoke-virtual {p1}, Landroidx/compose/ui/graphics/Shadow;->getOffset-F1C5BW0()J

    move-result-wide v0

    .restart local v0    # "arg0$iv":J
    const/4 v2, 0x0

    .line 603
    .local v2, "$i$f$getY-impl":I
    move-wide v3, v0

    .restart local v3    # "value$iv$iv":J
    const/4 v5, 0x0

    .line 604
    .local v5, "$i$f$unpackFloat2":I
    const-wide v6, 0xffffffffL

    and-long/2addr v6, v3

    long-to-int v6, v6

    .restart local v6    # "bits$iv$iv$iv":I
    const/4 v7, 0x0

    .line 605
    .restart local v7    # "$i$f$floatFromBits":I
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    .line 604
    .end local v6    # "bits$iv$iv$iv":I
    .end local v7    # "$i$f$floatFromBits":I
    nop

    .line 603
    .end local v3    # "value$iv$iv":J
    .end local v5    # "$i$f$unpackFloat2":I
    nop

    .line 314
    .end local v0    # "arg0$iv":J
    .end local v2    # "$i$f$getY-impl":I
    invoke-virtual {p0, v6}, Landroidx/compose/ui/platform/EncodeHelper;->encode(F)V

    .line 315
    invoke-virtual {p1}, Landroidx/compose/ui/graphics/Shadow;->getBlurRadius()F

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/EncodeHelper;->encode(F)V

    .line 316
    return-void
.end method

.method public final encode(Landroidx/compose/ui/text/SpanStyle;)V
    .locals 4
    .param p1, "spanStyle"    # Landroidx/compose/ui/text/SpanStyle;

    .line 195
    invoke-virtual {p1}, Landroidx/compose/ui/text/SpanStyle;->getColor-0d7_KjU()J

    move-result-wide v0

    sget-object v2, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/graphics/Color;->equals-impl0(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    .line 196
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/EncodeHelper;->encode(B)V

    .line 197
    invoke-virtual {p1}, Landroidx/compose/ui/text/SpanStyle;->getColor-0d7_KjU()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/platform/EncodeHelper;->encode-8_81llA(J)V

    .line 199
    :cond_0
    invoke-virtual {p1}, Landroidx/compose/ui/text/SpanStyle;->getFontSize-XSAIIZE()J

    move-result-wide v0

    sget-object v2, Landroidx/compose/ui/unit/TextUnit;->Companion:Landroidx/compose/ui/unit/TextUnit$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/unit/TextUnit$Companion;->getUnspecified-XSAIIZE()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/unit/TextUnit;->equals-impl0(JJ)Z

    move-result v0

    if-nez v0, :cond_1

    .line 200
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/EncodeHelper;->encode(B)V

    .line 201
    invoke-virtual {p1}, Landroidx/compose/ui/text/SpanStyle;->getFontSize-XSAIIZE()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/platform/EncodeHelper;->encode--R2X_6o(J)V

    .line 203
    :cond_1
    invoke-virtual {p1}, Landroidx/compose/ui/text/SpanStyle;->getFontWeight()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v0

    if-eqz v0, :cond_2

    .local v0, "it":Landroidx/compose/ui/text/font/FontWeight;
    const/4 v1, 0x0

    .line 204
    .local v1, "$i$a$-let-EncodeHelper$encode$1":I
    const/4 v2, 0x3

    invoke-virtual {p0, v2}, Landroidx/compose/ui/platform/EncodeHelper;->encode(B)V

    .line 205
    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/EncodeHelper;->encode(Landroidx/compose/ui/text/font/FontWeight;)V

    .line 206
    nop

    .line 203
    .end local v0    # "it":Landroidx/compose/ui/text/font/FontWeight;
    .end local v1    # "$i$a$-let-EncodeHelper$encode$1":I
    nop

    .line 208
    :cond_2
    invoke-virtual {p1}, Landroidx/compose/ui/text/SpanStyle;->getFontStyle-4Lr2A7w()Landroidx/compose/ui/text/font/FontStyle;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontStyle;->unbox-impl()I

    move-result v0

    .local v0, "it":I
    const/4 v1, 0x0

    .line 209
    .local v1, "$i$a$-let-EncodeHelper$encode$2":I
    const/4 v2, 0x4

    invoke-virtual {p0, v2}, Landroidx/compose/ui/platform/EncodeHelper;->encode(B)V

    .line 210
    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/EncodeHelper;->encode-nzbMABs(I)V

    .line 211
    nop

    .line 208
    .end local v0    # "it":I
    .end local v1    # "$i$a$-let-EncodeHelper$encode$2":I
    nop

    .line 213
    :cond_3
    invoke-virtual {p1}, Landroidx/compose/ui/text/SpanStyle;->getFontSynthesis-ZQGJjVo()Landroidx/compose/ui/text/font/FontSynthesis;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontSynthesis;->unbox-impl()I

    move-result v0

    .restart local v0    # "it":I
    const/4 v1, 0x0

    .line 214
    .local v1, "$i$a$-let-EncodeHelper$encode$3":I
    const/4 v2, 0x5

    invoke-virtual {p0, v2}, Landroidx/compose/ui/platform/EncodeHelper;->encode(B)V

    .line 215
    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/EncodeHelper;->encode-6p3vJLY(I)V

    .line 216
    nop

    .line 213
    .end local v0    # "it":I
    .end local v1    # "$i$a$-let-EncodeHelper$encode$3":I
    nop

    .line 218
    :cond_4
    invoke-virtual {p1}, Landroidx/compose/ui/text/SpanStyle;->getFontFeatureSettings()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    .local v0, "it":Ljava/lang/String;
    const/4 v1, 0x0

    .line 219
    .local v1, "$i$a$-let-EncodeHelper$encode$4":I
    const/4 v2, 0x6

    invoke-virtual {p0, v2}, Landroidx/compose/ui/platform/EncodeHelper;->encode(B)V

    .line 220
    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/EncodeHelper;->encode(Ljava/lang/String;)V

    .line 221
    nop

    .line 218
    .end local v0    # "it":Ljava/lang/String;
    .end local v1    # "$i$a$-let-EncodeHelper$encode$4":I
    nop

    .line 223
    :cond_5
    invoke-virtual {p1}, Landroidx/compose/ui/text/SpanStyle;->getLetterSpacing-XSAIIZE()J

    move-result-wide v0

    sget-object v2, Landroidx/compose/ui/unit/TextUnit;->Companion:Landroidx/compose/ui/unit/TextUnit$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/unit/TextUnit$Companion;->getUnspecified-XSAIIZE()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/unit/TextUnit;->equals-impl0(JJ)Z

    move-result v0

    if-nez v0, :cond_6

    .line 224
    const/4 v0, 0x7

    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/EncodeHelper;->encode(B)V

    .line 225
    invoke-virtual {p1}, Landroidx/compose/ui/text/SpanStyle;->getLetterSpacing-XSAIIZE()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/platform/EncodeHelper;->encode--R2X_6o(J)V

    .line 228
    :cond_6
    invoke-virtual {p1}, Landroidx/compose/ui/text/SpanStyle;->getBaselineShift-5SSeXJ0()Landroidx/compose/ui/text/style/BaselineShift;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Landroidx/compose/ui/text/style/BaselineShift;->unbox-impl()F

    move-result v0

    .local v0, "it":F
    const/4 v1, 0x0

    .line 229
    .local v1, "$i$a$-let-EncodeHelper$encode$5":I
    const/16 v2, 0x8

    invoke-virtual {p0, v2}, Landroidx/compose/ui/platform/EncodeHelper;->encode(B)V

    .line 230
    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/EncodeHelper;->encode-4Dl_Bck(F)V

    .line 231
    nop

    .line 228
    .end local v0    # "it":F
    .end local v1    # "$i$a$-let-EncodeHelper$encode$5":I
    nop

    .line 233
    :cond_7
    invoke-virtual {p1}, Landroidx/compose/ui/text/SpanStyle;->getTextGeometricTransform()Landroidx/compose/ui/text/style/TextGeometricTransform;

    move-result-object v0

    if-eqz v0, :cond_8

    .local v0, "it":Landroidx/compose/ui/text/style/TextGeometricTransform;
    const/4 v1, 0x0

    .line 234
    .local v1, "$i$a$-let-EncodeHelper$encode$6":I
    const/16 v2, 0x9

    invoke-virtual {p0, v2}, Landroidx/compose/ui/platform/EncodeHelper;->encode(B)V

    .line 235
    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/EncodeHelper;->encode(Landroidx/compose/ui/text/style/TextGeometricTransform;)V

    .line 236
    nop

    .line 233
    .end local v0    # "it":Landroidx/compose/ui/text/style/TextGeometricTransform;
    .end local v1    # "$i$a$-let-EncodeHelper$encode$6":I
    nop

    .line 238
    :cond_8
    invoke-virtual {p1}, Landroidx/compose/ui/text/SpanStyle;->getBackground-0d7_KjU()J

    move-result-wide v0

    sget-object v2, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/graphics/Color;->equals-impl0(JJ)Z

    move-result v0

    if-nez v0, :cond_9

    .line 239
    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/EncodeHelper;->encode(B)V

    .line 240
    invoke-virtual {p1}, Landroidx/compose/ui/text/SpanStyle;->getBackground-0d7_KjU()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/platform/EncodeHelper;->encode-8_81llA(J)V

    .line 243
    :cond_9
    invoke-virtual {p1}, Landroidx/compose/ui/text/SpanStyle;->getTextDecoration()Landroidx/compose/ui/text/style/TextDecoration;

    move-result-object v0

    if-eqz v0, :cond_a

    .local v0, "it":Landroidx/compose/ui/text/style/TextDecoration;
    const/4 v1, 0x0

    .line 244
    .local v1, "$i$a$-let-EncodeHelper$encode$7":I
    const/16 v2, 0xb

    invoke-virtual {p0, v2}, Landroidx/compose/ui/platform/EncodeHelper;->encode(B)V

    .line 245
    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/EncodeHelper;->encode(Landroidx/compose/ui/text/style/TextDecoration;)V

    .line 246
    nop

    .line 243
    .end local v0    # "it":Landroidx/compose/ui/text/style/TextDecoration;
    .end local v1    # "$i$a$-let-EncodeHelper$encode$7":I
    nop

    .line 248
    :cond_a
    invoke-virtual {p1}, Landroidx/compose/ui/text/SpanStyle;->getShadow()Landroidx/compose/ui/graphics/Shadow;

    move-result-object v0

    if-eqz v0, :cond_b

    .local v0, "it":Landroidx/compose/ui/graphics/Shadow;
    const/4 v1, 0x0

    .line 249
    .local v1, "$i$a$-let-EncodeHelper$encode$8":I
    const/16 v2, 0xc

    invoke-virtual {p0, v2}, Landroidx/compose/ui/platform/EncodeHelper;->encode(B)V

    .line 250
    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/EncodeHelper;->encode(Landroidx/compose/ui/graphics/Shadow;)V

    .line 251
    nop

    .line 248
    .end local v0    # "it":Landroidx/compose/ui/graphics/Shadow;
    .end local v1    # "$i$a$-let-EncodeHelper$encode$8":I
    nop

    .line 252
    :cond_b
    return-void
.end method

.method public final encode(Landroidx/compose/ui/text/font/FontWeight;)V
    .locals 1
    .param p1, "fontWeight"    # Landroidx/compose/ui/text/font/FontWeight;

    .line 273
    invoke-virtual {p1}, Landroidx/compose/ui/text/font/FontWeight;->getWeight()I

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/EncodeHelper;->encode(I)V

    .line 274
    return-void
.end method

.method public final encode(Landroidx/compose/ui/text/style/TextDecoration;)V
    .locals 1
    .param p1, "textDecoration"    # Landroidx/compose/ui/text/style/TextDecoration;

    .line 308
    invoke-virtual {p1}, Landroidx/compose/ui/text/style/TextDecoration;->getMask()I

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/EncodeHelper;->encode(I)V

    .line 309
    return-void
.end method

.method public final encode(Landroidx/compose/ui/text/style/TextGeometricTransform;)V
    .locals 1
    .param p1, "textGeometricTransform"    # Landroidx/compose/ui/text/style/TextGeometricTransform;

    .line 303
    invoke-virtual {p1}, Landroidx/compose/ui/text/style/TextGeometricTransform;->getScaleX()F

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/EncodeHelper;->encode(F)V

    .line 304
    invoke-virtual {p1}, Landroidx/compose/ui/text/style/TextGeometricTransform;->getSkewX()F

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/EncodeHelper;->encode(F)V

    .line 305
    return-void
.end method

.method public final encode(Ljava/lang/String;)V
    .locals 1
    .param p1, "string"    # Ljava/lang/String;

    .line 335
    iget-object v0, p0, Landroidx/compose/ui/platform/EncodeHelper;->parcel:Landroid/os/Parcel;

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 336
    return-void
.end method

.method public final encode--R2X_6o(J)V
    .locals 6
    .param p1, "textUnit"    # J

    .line 260
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/TextUnit;->getType-UIouoOA(J)J

    move-result-wide v0

    .line 261
    sget-object v2, Landroidx/compose/ui/unit/TextUnitType;->Companion:Landroidx/compose/ui/unit/TextUnitType$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/unit/TextUnitType$Companion;->getUnspecified-UIouoOA()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/unit/TextUnitType;->equals-impl0(JJ)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    goto :goto_0

    .line 262
    :cond_0
    sget-object v2, Landroidx/compose/ui/unit/TextUnitType;->Companion:Landroidx/compose/ui/unit/TextUnitType$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/unit/TextUnitType$Companion;->getSp-UIouoOA()J

    move-result-wide v4

    invoke-static {v0, v1, v4, v5}, Landroidx/compose/ui/unit/TextUnitType;->equals-impl0(JJ)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    .line 263
    :cond_1
    sget-object v2, Landroidx/compose/ui/unit/TextUnitType;->Companion:Landroidx/compose/ui/unit/TextUnitType$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/unit/TextUnitType$Companion;->getEm-UIouoOA()J

    move-result-wide v4

    invoke-static {v0, v1, v4, v5}, Landroidx/compose/ui/unit/TextUnitType;->equals-impl0(JJ)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v3, 0x2

    goto :goto_0

    .line 264
    :cond_2
    nop

    .line 260
    :goto_0
    nop

    .line 259
    nop

    .line 266
    .local v3, "typeCode":B
    invoke-virtual {p0, v3}, Landroidx/compose/ui/platform/EncodeHelper;->encode(B)V

    .line 267
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/TextUnit;->getType-UIouoOA(J)J

    move-result-wide v0

    sget-object v2, Landroidx/compose/ui/unit/TextUnitType;->Companion:Landroidx/compose/ui/unit/TextUnitType$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/unit/TextUnitType$Companion;->getUnspecified-UIouoOA()J

    move-result-wide v4

    invoke-static {v0, v1, v4, v5}, Landroidx/compose/ui/unit/TextUnitType;->equals-impl0(JJ)Z

    move-result v0

    if-nez v0, :cond_3

    .line 268
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/TextUnit;->getValue-impl(J)F

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/EncodeHelper;->encode(F)V

    .line 270
    :cond_3
    return-void
.end method

.method public final encode-4Dl_Bck(F)V
    .locals 0
    .param p1, "baselineShift"    # F

    .line 299
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/EncodeHelper;->encode(F)V

    .line 300
    return-void
.end method

.method public final encode-6p3vJLY(I)V
    .locals 2
    .param p1, "fontSynthesis"    # I

    .line 288
    nop

    .line 289
    sget-object v0, Landroidx/compose/ui/text/font/FontSynthesis;->Companion:Landroidx/compose/ui/text/font/FontSynthesis$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontSynthesis$Companion;->getNone-GVVA2EU()I

    move-result v0

    invoke-static {p1, v0}, Landroidx/compose/ui/text/font/FontSynthesis;->equals-impl0(II)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 290
    :cond_0
    sget-object v0, Landroidx/compose/ui/text/font/FontSynthesis;->Companion:Landroidx/compose/ui/text/font/FontSynthesis$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontSynthesis$Companion;->getAll-GVVA2EU()I

    move-result v0

    invoke-static {p1, v0}, Landroidx/compose/ui/text/font/FontSynthesis;->equals-impl0(II)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    .line 291
    :cond_1
    sget-object v0, Landroidx/compose/ui/text/font/FontSynthesis;->Companion:Landroidx/compose/ui/text/font/FontSynthesis$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontSynthesis$Companion;->getWeight-GVVA2EU()I

    move-result v0

    invoke-static {p1, v0}, Landroidx/compose/ui/text/font/FontSynthesis;->equals-impl0(II)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v1, 0x2

    goto :goto_0

    .line 292
    :cond_2
    sget-object v0, Landroidx/compose/ui/text/font/FontSynthesis;->Companion:Landroidx/compose/ui/text/font/FontSynthesis$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontSynthesis$Companion;->getStyle-GVVA2EU()I

    move-result v0

    invoke-static {p1, v0}, Landroidx/compose/ui/text/font/FontSynthesis;->equals-impl0(II)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v1, 0x3

    goto :goto_0

    .line 293
    :cond_3
    nop

    .line 288
    :goto_0
    nop

    .line 287
    nop

    .line 295
    .local v1, "value":B
    invoke-virtual {p0, v1}, Landroidx/compose/ui/platform/EncodeHelper;->encode(B)V

    .line 296
    return-void
.end method

.method public final encode-8_81llA(J)V
    .locals 0
    .param p1, "color"    # J

    .line 255
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/EncodeHelper;->encode-VKZWuLQ(J)V

    .line 256
    return-void
.end method

.method public final encode-VKZWuLQ(J)V
    .locals 1
    .param p1, "uLong"    # J

    .line 331
    iget-object v0, p0, Landroidx/compose/ui/platform/EncodeHelper;->parcel:Landroid/os/Parcel;

    invoke-virtual {v0, p1, p2}, Landroid/os/Parcel;->writeLong(J)V

    .line 332
    return-void
.end method

.method public final encode-nzbMABs(I)V
    .locals 2
    .param p1, "fontStyle"    # I

    .line 277
    nop

    .line 278
    nop

    .line 279
    sget-object v0, Landroidx/compose/ui/text/font/FontStyle;->Companion:Landroidx/compose/ui/text/font/FontStyle$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontStyle$Companion;->getNormal-_-LCdwA()I

    move-result v0

    invoke-static {p1, v0}, Landroidx/compose/ui/text/font/FontStyle;->equals-impl0(II)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 280
    :cond_0
    sget-object v0, Landroidx/compose/ui/text/font/FontStyle;->Companion:Landroidx/compose/ui/text/font/FontStyle$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontStyle$Companion;->getItalic-_-LCdwA()I

    move-result v0

    invoke-static {p1, v0}, Landroidx/compose/ui/text/font/FontStyle;->equals-impl0(II)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    .line 281
    :cond_1
    nop

    .line 277
    :goto_0
    invoke-virtual {p0, v1}, Landroidx/compose/ui/platform/EncodeHelper;->encode(B)V

    .line 284
    return-void
.end method

.method public final encodedString()Ljava/lang/String;
    .locals 2

    .line 190
    iget-object v0, p0, Landroidx/compose/ui/platform/EncodeHelper;->parcel:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->marshall()[B

    move-result-object v0

    .line 191
    .local v0, "bytes":[B
    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method public final reset()V
    .locals 1

    .line 185
    iget-object v0, p0, Landroidx/compose/ui/platform/EncodeHelper;->parcel:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 186
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/platform/EncodeHelper;->parcel:Landroid/os/Parcel;

    .line 187
    return-void
.end method
