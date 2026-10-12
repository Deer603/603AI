.class public final Landroidx/compose/foundation/internal/EncodeHelper;
.super Ljava/lang/Object;
.source "ClipboardUtils.android.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nClipboardUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipboardUtils.android.kt\nandroidx/compose/foundation/internal/EncodeHelper\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,556:1\n65#2:557\n69#2:560\n60#3:558\n70#3:561\n22#4:559\n22#4:562\n*S KotlinDebug\n*F\n+ 1 ClipboardUtils.android.kt\nandroidx/compose/foundation/internal/EncodeHelper\n*L\n269#1:557\n270#1:560\n269#1:558\n270#1:561\n269#1:559\n270#1:562\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u000cJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0015\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001fJ\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\"\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010%\u001a\u00020&J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\'\u001a\u00020(J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010)\u001a\u00020*J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010+\u001a\u00020,\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008-\u0010\nJ\u0006\u0010.\u001a\u00020*J\u0006\u0010/\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u00060"
    }
    d2 = {
        "Landroidx/compose/foundation/internal/EncodeHelper;",
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
.field private parcel:Landroid/os/Parcel;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Landroidx/compose/foundation/internal/EncodeHelper;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 137
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 138
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/foundation/internal/EncodeHelper;->parcel:Landroid/os/Parcel;

    .line 137
    return-void
.end method


# virtual methods
.method public final encode(B)V
    .locals 1
    .param p1, "byte"    # B

    .line 275
    iget-object v0, p0, Landroidx/compose/foundation/internal/EncodeHelper;->parcel:Landroid/os/Parcel;

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeByte(B)V

    .line 276
    return-void
.end method

.method public final encode(F)V
    .locals 1
    .param p1, "float"    # F

    .line 283
    iget-object v0, p0, Landroidx/compose/foundation/internal/EncodeHelper;->parcel:Landroid/os/Parcel;

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeFloat(F)V

    .line 284
    return-void
.end method

.method public final encode(I)V
    .locals 1
    .param p1, "int"    # I

    .line 279
    iget-object v0, p0, Landroidx/compose/foundation/internal/EncodeHelper;->parcel:Landroid/os/Parcel;

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 280
    return-void
.end method

.method public final encode(Landroidx/compose/ui/graphics/Shadow;)V
    .locals 8
    .param p1, "shadow"    # Landroidx/compose/ui/graphics/Shadow;

    .line 268
    invoke-virtual {p1}, Landroidx/compose/ui/graphics/Shadow;->getColor-0d7_KjU()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroidx/compose/foundation/internal/EncodeHelper;->encode-8_81llA(J)V

    .line 269
    invoke-virtual {p1}, Landroidx/compose/ui/graphics/Shadow;->getOffset-F1C5BW0()J

    move-result-wide v0

    .local v0, "arg0$iv":J
    const/4 v2, 0x0

    .line 557
    .local v2, "$i$f$getX-impl":I
    move-wide v3, v0

    .local v3, "value$iv$iv":J
    const/4 v5, 0x0

    .line 558
    .local v5, "$i$f$unpackFloat1":I
    const/16 v6, 0x20

    shr-long v6, v3, v6

    long-to-int v6, v6

    .local v6, "bits$iv$iv$iv":I
    const/4 v7, 0x0

    .line 559
    .local v7, "$i$f$floatFromBits":I
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    .line 558
    .end local v6    # "bits$iv$iv$iv":I
    .end local v7    # "$i$f$floatFromBits":I
    nop

    .line 557
    .end local v3    # "value$iv$iv":J
    .end local v5    # "$i$f$unpackFloat1":I
    nop

    .line 269
    .end local v0    # "arg0$iv":J
    .end local v2    # "$i$f$getX-impl":I
    invoke-virtual {p0, v6}, Landroidx/compose/foundation/internal/EncodeHelper;->encode(F)V

    .line 270
    invoke-virtual {p1}, Landroidx/compose/ui/graphics/Shadow;->getOffset-F1C5BW0()J

    move-result-wide v0

    .restart local v0    # "arg0$iv":J
    const/4 v2, 0x0

    .line 560
    .local v2, "$i$f$getY-impl":I
    move-wide v3, v0

    .restart local v3    # "value$iv$iv":J
    const/4 v5, 0x0

    .line 561
    .local v5, "$i$f$unpackFloat2":I
    const-wide v6, 0xffffffffL

    and-long/2addr v6, v3

    long-to-int v6, v6

    .restart local v6    # "bits$iv$iv$iv":I
    const/4 v7, 0x0

    .line 562
    .restart local v7    # "$i$f$floatFromBits":I
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    .line 561
    .end local v6    # "bits$iv$iv$iv":I
    .end local v7    # "$i$f$floatFromBits":I
    nop

    .line 560
    .end local v3    # "value$iv$iv":J
    .end local v5    # "$i$f$unpackFloat2":I
    nop

    .line 270
    .end local v0    # "arg0$iv":J
    .end local v2    # "$i$f$getY-impl":I
    invoke-virtual {p0, v6}, Landroidx/compose/foundation/internal/EncodeHelper;->encode(F)V

    .line 271
    invoke-virtual {p1}, Landroidx/compose/ui/graphics/Shadow;->getBlurRadius()F

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/compose/foundation/internal/EncodeHelper;->encode(F)V

    .line 272
    return-void
.end method

.method public final encode(Landroidx/compose/ui/text/SpanStyle;)V
    .locals 4
    .param p1, "spanStyle"    # Landroidx/compose/ui/text/SpanStyle;

    .line 151
    invoke-virtual {p1}, Landroidx/compose/ui/text/SpanStyle;->getColor-0d7_KjU()J

    move-result-wide v0

    sget-object v2, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/graphics/Color;->equals-impl0(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    .line 152
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/compose/foundation/internal/EncodeHelper;->encode(B)V

    .line 153
    invoke-virtual {p1}, Landroidx/compose/ui/text/SpanStyle;->getColor-0d7_KjU()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroidx/compose/foundation/internal/EncodeHelper;->encode-8_81llA(J)V

    .line 155
    :cond_0
    invoke-virtual {p1}, Landroidx/compose/ui/text/SpanStyle;->getFontSize-XSAIIZE()J

    move-result-wide v0

    sget-object v2, Landroidx/compose/ui/unit/TextUnit;->Companion:Landroidx/compose/ui/unit/TextUnit$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/unit/TextUnit$Companion;->getUnspecified-XSAIIZE()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/unit/TextUnit;->equals-impl0(JJ)Z

    move-result v0

    if-nez v0, :cond_1

    .line 156
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Landroidx/compose/foundation/internal/EncodeHelper;->encode(B)V

    .line 157
    invoke-virtual {p1}, Landroidx/compose/ui/text/SpanStyle;->getFontSize-XSAIIZE()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroidx/compose/foundation/internal/EncodeHelper;->encode--R2X_6o(J)V

    .line 159
    :cond_1
    invoke-virtual {p1}, Landroidx/compose/ui/text/SpanStyle;->getFontWeight()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v0

    if-eqz v0, :cond_2

    .local v0, "it":Landroidx/compose/ui/text/font/FontWeight;
    const/4 v1, 0x0

    .line 160
    .local v1, "$i$a$-let-EncodeHelper$encode$1":I
    const/4 v2, 0x3

    invoke-virtual {p0, v2}, Landroidx/compose/foundation/internal/EncodeHelper;->encode(B)V

    .line 161
    invoke-virtual {p0, v0}, Landroidx/compose/foundation/internal/EncodeHelper;->encode(Landroidx/compose/ui/text/font/FontWeight;)V

    .line 162
    nop

    .line 159
    .end local v0    # "it":Landroidx/compose/ui/text/font/FontWeight;
    .end local v1    # "$i$a$-let-EncodeHelper$encode$1":I
    nop

    .line 164
    :cond_2
    invoke-virtual {p1}, Landroidx/compose/ui/text/SpanStyle;->getFontStyle-4Lr2A7w()Landroidx/compose/ui/text/font/FontStyle;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontStyle;->unbox-impl()I

    move-result v0

    .local v0, "it":I
    const/4 v1, 0x0

    .line 165
    .local v1, "$i$a$-let-EncodeHelper$encode$2":I
    const/4 v2, 0x4

    invoke-virtual {p0, v2}, Landroidx/compose/foundation/internal/EncodeHelper;->encode(B)V

    .line 166
    invoke-virtual {p0, v0}, Landroidx/compose/foundation/internal/EncodeHelper;->encode-nzbMABs(I)V

    .line 167
    nop

    .line 164
    .end local v0    # "it":I
    .end local v1    # "$i$a$-let-EncodeHelper$encode$2":I
    nop

    .line 169
    :cond_3
    invoke-virtual {p1}, Landroidx/compose/ui/text/SpanStyle;->getFontSynthesis-ZQGJjVo()Landroidx/compose/ui/text/font/FontSynthesis;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontSynthesis;->unbox-impl()I

    move-result v0

    .restart local v0    # "it":I
    const/4 v1, 0x0

    .line 170
    .local v1, "$i$a$-let-EncodeHelper$encode$3":I
    const/4 v2, 0x5

    invoke-virtual {p0, v2}, Landroidx/compose/foundation/internal/EncodeHelper;->encode(B)V

    .line 171
    invoke-virtual {p0, v0}, Landroidx/compose/foundation/internal/EncodeHelper;->encode-6p3vJLY(I)V

    .line 172
    nop

    .line 169
    .end local v0    # "it":I
    .end local v1    # "$i$a$-let-EncodeHelper$encode$3":I
    nop

    .line 174
    :cond_4
    invoke-virtual {p1}, Landroidx/compose/ui/text/SpanStyle;->getFontFeatureSettings()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    .local v0, "it":Ljava/lang/String;
    const/4 v1, 0x0

    .line 175
    .local v1, "$i$a$-let-EncodeHelper$encode$4":I
    const/4 v2, 0x6

    invoke-virtual {p0, v2}, Landroidx/compose/foundation/internal/EncodeHelper;->encode(B)V

    .line 176
    invoke-virtual {p0, v0}, Landroidx/compose/foundation/internal/EncodeHelper;->encode(Ljava/lang/String;)V

    .line 177
    nop

    .line 174
    .end local v0    # "it":Ljava/lang/String;
    .end local v1    # "$i$a$-let-EncodeHelper$encode$4":I
    nop

    .line 179
    :cond_5
    invoke-virtual {p1}, Landroidx/compose/ui/text/SpanStyle;->getLetterSpacing-XSAIIZE()J

    move-result-wide v0

    sget-object v2, Landroidx/compose/ui/unit/TextUnit;->Companion:Landroidx/compose/ui/unit/TextUnit$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/unit/TextUnit$Companion;->getUnspecified-XSAIIZE()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/unit/TextUnit;->equals-impl0(JJ)Z

    move-result v0

    if-nez v0, :cond_6

    .line 180
    const/4 v0, 0x7

    invoke-virtual {p0, v0}, Landroidx/compose/foundation/internal/EncodeHelper;->encode(B)V

    .line 181
    invoke-virtual {p1}, Landroidx/compose/ui/text/SpanStyle;->getLetterSpacing-XSAIIZE()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroidx/compose/foundation/internal/EncodeHelper;->encode--R2X_6o(J)V

    .line 184
    :cond_6
    invoke-virtual {p1}, Landroidx/compose/ui/text/SpanStyle;->getBaselineShift-5SSeXJ0()Landroidx/compose/ui/text/style/BaselineShift;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Landroidx/compose/ui/text/style/BaselineShift;->unbox-impl()F

    move-result v0

    .local v0, "it":F
    const/4 v1, 0x0

    .line 185
    .local v1, "$i$a$-let-EncodeHelper$encode$5":I
    const/16 v2, 0x8

    invoke-virtual {p0, v2}, Landroidx/compose/foundation/internal/EncodeHelper;->encode(B)V

    .line 186
    invoke-virtual {p0, v0}, Landroidx/compose/foundation/internal/EncodeHelper;->encode-4Dl_Bck(F)V

    .line 187
    nop

    .line 184
    .end local v0    # "it":F
    .end local v1    # "$i$a$-let-EncodeHelper$encode$5":I
    nop

    .line 189
    :cond_7
    invoke-virtual {p1}, Landroidx/compose/ui/text/SpanStyle;->getTextGeometricTransform()Landroidx/compose/ui/text/style/TextGeometricTransform;

    move-result-object v0

    if-eqz v0, :cond_8

    .local v0, "it":Landroidx/compose/ui/text/style/TextGeometricTransform;
    const/4 v1, 0x0

    .line 190
    .local v1, "$i$a$-let-EncodeHelper$encode$6":I
    const/16 v2, 0x9

    invoke-virtual {p0, v2}, Landroidx/compose/foundation/internal/EncodeHelper;->encode(B)V

    .line 191
    invoke-virtual {p0, v0}, Landroidx/compose/foundation/internal/EncodeHelper;->encode(Landroidx/compose/ui/text/style/TextGeometricTransform;)V

    .line 192
    nop

    .line 189
    .end local v0    # "it":Landroidx/compose/ui/text/style/TextGeometricTransform;
    .end local v1    # "$i$a$-let-EncodeHelper$encode$6":I
    nop

    .line 194
    :cond_8
    invoke-virtual {p1}, Landroidx/compose/ui/text/SpanStyle;->getBackground-0d7_KjU()J

    move-result-wide v0

    sget-object v2, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/graphics/Color;->equals-impl0(JJ)Z

    move-result v0

    if-nez v0, :cond_9

    .line 195
    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Landroidx/compose/foundation/internal/EncodeHelper;->encode(B)V

    .line 196
    invoke-virtual {p1}, Landroidx/compose/ui/text/SpanStyle;->getBackground-0d7_KjU()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroidx/compose/foundation/internal/EncodeHelper;->encode-8_81llA(J)V

    .line 199
    :cond_9
    invoke-virtual {p1}, Landroidx/compose/ui/text/SpanStyle;->getTextDecoration()Landroidx/compose/ui/text/style/TextDecoration;

    move-result-object v0

    if-eqz v0, :cond_a

    .local v0, "it":Landroidx/compose/ui/text/style/TextDecoration;
    const/4 v1, 0x0

    .line 200
    .local v1, "$i$a$-let-EncodeHelper$encode$7":I
    const/16 v2, 0xb

    invoke-virtual {p0, v2}, Landroidx/compose/foundation/internal/EncodeHelper;->encode(B)V

    .line 201
    invoke-virtual {p0, v0}, Landroidx/compose/foundation/internal/EncodeHelper;->encode(Landroidx/compose/ui/text/style/TextDecoration;)V

    .line 202
    nop

    .line 199
    .end local v0    # "it":Landroidx/compose/ui/text/style/TextDecoration;
    .end local v1    # "$i$a$-let-EncodeHelper$encode$7":I
    nop

    .line 204
    :cond_a
    invoke-virtual {p1}, Landroidx/compose/ui/text/SpanStyle;->getShadow()Landroidx/compose/ui/graphics/Shadow;

    move-result-object v0

    if-eqz v0, :cond_b

    .local v0, "it":Landroidx/compose/ui/graphics/Shadow;
    const/4 v1, 0x0

    .line 205
    .local v1, "$i$a$-let-EncodeHelper$encode$8":I
    const/16 v2, 0xc

    invoke-virtual {p0, v2}, Landroidx/compose/foundation/internal/EncodeHelper;->encode(B)V

    .line 206
    invoke-virtual {p0, v0}, Landroidx/compose/foundation/internal/EncodeHelper;->encode(Landroidx/compose/ui/graphics/Shadow;)V

    .line 207
    nop

    .line 204
    .end local v0    # "it":Landroidx/compose/ui/graphics/Shadow;
    .end local v1    # "$i$a$-let-EncodeHelper$encode$8":I
    nop

    .line 208
    :cond_b
    return-void
.end method

.method public final encode(Landroidx/compose/ui/text/font/FontWeight;)V
    .locals 1
    .param p1, "fontWeight"    # Landroidx/compose/ui/text/font/FontWeight;

    .line 229
    invoke-virtual {p1}, Landroidx/compose/ui/text/font/FontWeight;->getWeight()I

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/compose/foundation/internal/EncodeHelper;->encode(I)V

    .line 230
    return-void
.end method

.method public final encode(Landroidx/compose/ui/text/style/TextDecoration;)V
    .locals 1
    .param p1, "textDecoration"    # Landroidx/compose/ui/text/style/TextDecoration;

    .line 264
    invoke-virtual {p1}, Landroidx/compose/ui/text/style/TextDecoration;->getMask()I

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/compose/foundation/internal/EncodeHelper;->encode(I)V

    .line 265
    return-void
.end method

.method public final encode(Landroidx/compose/ui/text/style/TextGeometricTransform;)V
    .locals 1
    .param p1, "textGeometricTransform"    # Landroidx/compose/ui/text/style/TextGeometricTransform;

    .line 259
    invoke-virtual {p1}, Landroidx/compose/ui/text/style/TextGeometricTransform;->getScaleX()F

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/compose/foundation/internal/EncodeHelper;->encode(F)V

    .line 260
    invoke-virtual {p1}, Landroidx/compose/ui/text/style/TextGeometricTransform;->getSkewX()F

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/compose/foundation/internal/EncodeHelper;->encode(F)V

    .line 261
    return-void
.end method

.method public final encode(Ljava/lang/String;)V
    .locals 1
    .param p1, "string"    # Ljava/lang/String;

    .line 291
    iget-object v0, p0, Landroidx/compose/foundation/internal/EncodeHelper;->parcel:Landroid/os/Parcel;

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 292
    return-void
.end method

.method public final encode--R2X_6o(J)V
    .locals 6
    .param p1, "textUnit"    # J

    .line 216
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/TextUnit;->getType-UIouoOA(J)J

    move-result-wide v0

    .line 217
    sget-object v2, Landroidx/compose/ui/unit/TextUnitType;->Companion:Landroidx/compose/ui/unit/TextUnitType$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/unit/TextUnitType$Companion;->getUnspecified-UIouoOA()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/unit/TextUnitType;->equals-impl0(JJ)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    goto :goto_0

    .line 218
    :cond_0
    sget-object v2, Landroidx/compose/ui/unit/TextUnitType;->Companion:Landroidx/compose/ui/unit/TextUnitType$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/unit/TextUnitType$Companion;->getSp-UIouoOA()J

    move-result-wide v4

    invoke-static {v0, v1, v4, v5}, Landroidx/compose/ui/unit/TextUnitType;->equals-impl0(JJ)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    .line 219
    :cond_1
    sget-object v2, Landroidx/compose/ui/unit/TextUnitType;->Companion:Landroidx/compose/ui/unit/TextUnitType$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/unit/TextUnitType$Companion;->getEm-UIouoOA()J

    move-result-wide v4

    invoke-static {v0, v1, v4, v5}, Landroidx/compose/ui/unit/TextUnitType;->equals-impl0(JJ)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v3, 0x2

    goto :goto_0

    .line 220
    :cond_2
    nop

    .line 216
    :goto_0
    nop

    .line 215
    nop

    .line 222
    .local v3, "typeCode":B
    invoke-virtual {p0, v3}, Landroidx/compose/foundation/internal/EncodeHelper;->encode(B)V

    .line 223
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/TextUnit;->getType-UIouoOA(J)J

    move-result-wide v0

    sget-object v2, Landroidx/compose/ui/unit/TextUnitType;->Companion:Landroidx/compose/ui/unit/TextUnitType$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/unit/TextUnitType$Companion;->getUnspecified-UIouoOA()J

    move-result-wide v4

    invoke-static {v0, v1, v4, v5}, Landroidx/compose/ui/unit/TextUnitType;->equals-impl0(JJ)Z

    move-result v0

    if-nez v0, :cond_3

    .line 224
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/TextUnit;->getValue-impl(J)F

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/compose/foundation/internal/EncodeHelper;->encode(F)V

    .line 226
    :cond_3
    return-void
.end method

.method public final encode-4Dl_Bck(F)V
    .locals 0
    .param p1, "baselineShift"    # F

    .line 255
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/internal/EncodeHelper;->encode(F)V

    .line 256
    return-void
.end method

.method public final encode-6p3vJLY(I)V
    .locals 2
    .param p1, "fontSynthesis"    # I

    .line 244
    nop

    .line 245
    sget-object v0, Landroidx/compose/ui/text/font/FontSynthesis;->Companion:Landroidx/compose/ui/text/font/FontSynthesis$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontSynthesis$Companion;->getNone-GVVA2EU()I

    move-result v0

    invoke-static {p1, v0}, Landroidx/compose/ui/text/font/FontSynthesis;->equals-impl0(II)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 246
    :cond_0
    sget-object v0, Landroidx/compose/ui/text/font/FontSynthesis;->Companion:Landroidx/compose/ui/text/font/FontSynthesis$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontSynthesis$Companion;->getAll-GVVA2EU()I

    move-result v0

    invoke-static {p1, v0}, Landroidx/compose/ui/text/font/FontSynthesis;->equals-impl0(II)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    .line 247
    :cond_1
    sget-object v0, Landroidx/compose/ui/text/font/FontSynthesis;->Companion:Landroidx/compose/ui/text/font/FontSynthesis$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontSynthesis$Companion;->getWeight-GVVA2EU()I

    move-result v0

    invoke-static {p1, v0}, Landroidx/compose/ui/text/font/FontSynthesis;->equals-impl0(II)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v1, 0x2

    goto :goto_0

    .line 248
    :cond_2
    sget-object v0, Landroidx/compose/ui/text/font/FontSynthesis;->Companion:Landroidx/compose/ui/text/font/FontSynthesis$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontSynthesis$Companion;->getStyle-GVVA2EU()I

    move-result v0

    invoke-static {p1, v0}, Landroidx/compose/ui/text/font/FontSynthesis;->equals-impl0(II)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v1, 0x3

    goto :goto_0

    .line 249
    :cond_3
    nop

    .line 244
    :goto_0
    nop

    .line 243
    nop

    .line 251
    .local v1, "value":B
    invoke-virtual {p0, v1}, Landroidx/compose/foundation/internal/EncodeHelper;->encode(B)V

    .line 252
    return-void
.end method

.method public final encode-8_81llA(J)V
    .locals 0
    .param p1, "color"    # J

    .line 211
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/internal/EncodeHelper;->encode-VKZWuLQ(J)V

    .line 212
    return-void
.end method

.method public final encode-VKZWuLQ(J)V
    .locals 1
    .param p1, "uLong"    # J

    .line 287
    iget-object v0, p0, Landroidx/compose/foundation/internal/EncodeHelper;->parcel:Landroid/os/Parcel;

    invoke-virtual {v0, p1, p2}, Landroid/os/Parcel;->writeLong(J)V

    .line 288
    return-void
.end method

.method public final encode-nzbMABs(I)V
    .locals 2
    .param p1, "fontStyle"    # I

    .line 233
    nop

    .line 234
    nop

    .line 235
    sget-object v0, Landroidx/compose/ui/text/font/FontStyle;->Companion:Landroidx/compose/ui/text/font/FontStyle$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontStyle$Companion;->getNormal-_-LCdwA()I

    move-result v0

    invoke-static {p1, v0}, Landroidx/compose/ui/text/font/FontStyle;->equals-impl0(II)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 236
    :cond_0
    sget-object v0, Landroidx/compose/ui/text/font/FontStyle;->Companion:Landroidx/compose/ui/text/font/FontStyle$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontStyle$Companion;->getItalic-_-LCdwA()I

    move-result v0

    invoke-static {p1, v0}, Landroidx/compose/ui/text/font/FontStyle;->equals-impl0(II)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    .line 237
    :cond_1
    nop

    .line 233
    :goto_0
    invoke-virtual {p0, v1}, Landroidx/compose/foundation/internal/EncodeHelper;->encode(B)V

    .line 240
    return-void
.end method

.method public final encodedString()Ljava/lang/String;
    .locals 2

    .line 146
    iget-object v0, p0, Landroidx/compose/foundation/internal/EncodeHelper;->parcel:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->marshall()[B

    move-result-object v0

    .line 147
    .local v0, "bytes":[B
    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method public final reset()V
    .locals 1

    .line 141
    iget-object v0, p0, Landroidx/compose/foundation/internal/EncodeHelper;->parcel:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 142
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/foundation/internal/EncodeHelper;->parcel:Landroid/os/Parcel;

    .line 143
    return-void
.end method
