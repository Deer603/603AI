.class public final Landroidx/compose/foundation/text/TextLinkScopeKt;
.super Ljava/lang/Object;
.source "TextLinkScope.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0002*\u0018\u0008\u0000\u0010\u0003\"\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "isNullOrEmpty",
        "",
        "Landroidx/compose/ui/text/TextLinkStyles;",
        "LinkRange",
        "Landroidx/compose/ui/text/AnnotatedString$Range;",
        "Landroidx/compose/ui/text/LinkAnnotation;",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic access$isNullOrEmpty(Landroidx/compose/ui/text/TextLinkStyles;)Z
    .locals 1
    .param p0, "$receiver"    # Landroidx/compose/ui/text/TextLinkStyles;

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/text/TextLinkScopeKt;->isNullOrEmpty(Landroidx/compose/ui/text/TextLinkStyles;)Z

    move-result v0

    return v0
.end method

.method private static final isNullOrEmpty(Landroidx/compose/ui/text/TextLinkStyles;)Z
    .locals 1
    .param p0, "$this$isNullOrEmpty"    # Landroidx/compose/ui/text/TextLinkStyles;

    .line 325
    if-eqz p0, :cond_1

    .line 326
    invoke-virtual {p0}, Landroidx/compose/ui/text/TextLinkStyles;->getStyle()Landroidx/compose/ui/text/SpanStyle;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/text/TextLinkStyles;->getFocusedStyle()Landroidx/compose/ui/text/SpanStyle;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/text/TextLinkStyles;->getHoveredStyle()Landroidx/compose/ui/text/SpanStyle;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/text/TextLinkStyles;->getPressedStyle()Landroidx/compose/ui/text/SpanStyle;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 325
    :goto_1
    return v0
.end method
